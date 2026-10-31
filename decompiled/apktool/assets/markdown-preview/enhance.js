/* 按需增强渲染；保留源码和外层位置标记，单个失败不影响其余正文。 */
(function () {
    'use strict';
    var article = document.querySelector('article');
    var nodes = article.querySelectorAll('[data-mt-render]');
    var script = document.currentScript;
    var nonce = script ? script.getAttribute('nonce') : '';
    var root = '/_mt_markdown_vendor_/';
    // Tiny 固定版本及官方文件摘要；升级时同步 vendor-lock.json 并核对 CDN 内容。
    var mermaidUrl = 'https://cdn.jsdelivr.net/npm/@mermaid-js/tiny@11.17.2/dist/mermaid.tiny.js';
    var mermaidIntegrity = 'sha384-10s6o+N3M2s7dB3bn+t7QT0KKY4aJUPH3JgMK/M0DCc/C23fI5mm0h2dPQcRtVdd';
    var math = [], diagrams = [], totalMath = 0;
    var errorText = article.getAttribute('data-render-error');
    var dark = document.documentElement.getAttribute('data-theme') === 'dark';
    var chrome = /(?:Chrome|Chromium)\/(\d+)/.exec(navigator.userAgent);
    var chromeVersion = chrome ? Number(chrome[1]) : 0;
    var version = 0, busy = false, ready = false, unavailable = false, restore = null;

    function changed() {
        if (window.__mtMarkdownPreview) window.__mtMarkdownPreview.contentChanged();
    }
    function fail(node) {
        node.textContent = node.mtSource;
        node.classList.add('mt-render-error');
        node.setAttribute('data-render-error', errorText);
        node.setAttribute('data-render-state', 'failed');
    }
    function load(url, done, integrity) {
        var tag = document.createElement('script');
        tag.setAttribute('nonce', nonce);
        tag.src = url;
        if (integrity) {
            tag.integrity = integrity;
            tag.crossOrigin = 'anonymous';
            tag.referrerPolicy = 'no-referrer';
        }
        var timer = setTimeout(function () { finish(false); }, 15000);
        // 网络失败、校验失败或超时只回退一次，迟到回调不能重新启动渲染。
        function finish(ok) {
            if (!done) return;
            clearTimeout(timer);
            tag.onload = tag.onerror = null;
            if (!ok && tag.parentNode) tag.parentNode.removeChild(tag);
            var callback = done;
            done = null;
            callback(ok);
        }
        tag.onload = function () { finish(true); };
        tag.onerror = function () { finish(false); };
        document.head.appendChild(tag);
    }
    function visible(node) {
        for (var parent = node.parentElement; parent; parent = parent.parentElement) {
            if (parent.tagName === 'DETAILS' && !parent.open) return false;
        }
        return true;
    }
    for (var i = 0; i < nodes.length; i++) {
        var node = nodes[i], kind = node.getAttribute('data-mt-render');
        node.mtSource = node.textContent;
        node.setAttribute('data-render-state', 'pending');
        if (kind === 'mermaid') {
            // 不接受文档提供初始化指令或 frontmatter，主题、安全与规模限制由 MT 独占。
            if (diagrams.length >= 20 || node.mtSource.length > 20000
                    || node.mtSource.indexOf('%%{') !== -1 || /^\s*---/.test(node.mtSource)) fail(node);
            else diagrams.push(node);
        } else {
            totalMath += node.mtSource.length;
            if (math.length >= 500 || node.mtSource.length > 4096 || totalMath > 100000) fail(node);
            else math.push(node);
        }
    }
    function startMath() {
        if (!math.length) return;
        // 内置 KaTeX 使用 ES2015；旧 WebView 不加载库，保留源码以免出现语法错误。
        if (chromeVersion < 80 || !document.fonts || !document.fonts.ready || !document.fonts.forEach) {
            math.forEach(fail); changed(); return;
        }
        var css = document.createElement('link');
        css.rel = 'stylesheet'; css.href = root + 'katex.min.css';
        css.onerror = function () { math.forEach(fail); changed(); };
        css.onload = function () {
            load(root + 'katex.min.js', function (ok) {
                for (var i = 0; i < math.length; i++) {
                    var node = math[i];
                    try {
                        if (!ok || !window.katex) throw new Error('KaTeX unavailable');
                        window.katex.render(node.mtSource, node, {
                            displayMode: node.getAttribute('data-mt-render') !== 'inline-math',
                            trust: false, strict: 'ignore', throwOnError: true, maxExpand: 1000, maxSize: 20,
                            macros: {}
                        });
                        node.setAttribute('data-render-state', 'ready');
                    } catch (error) { fail(node); }
                }
                // 折叠公式的字体可能直到展开才请求；每一批加载都需要失败回退和超时保护。
                var fonts = document.fonts, timer = 0, failed = false;
                function fontFailure() {
                    if (failed) return;
                    failed = true;
                    clearTimeout(timer);
                    fonts.removeEventListener('loading', fontLoading);
                    fonts.removeEventListener('loadingdone', fontFinished);
                    fonts.removeEventListener('loadingerror', fontFinished);
                    math.forEach(fail);
                    changed();
                }
                function fontLoading() {
                    if (!failed && !timer) timer = setTimeout(fontFailure, 8000);
                }
                function fontFinished() {
                    if (failed) return;
                    var ok = true;
                    fonts.forEach(function (font) {
                        if (font.family.indexOf('KaTeX_') !== -1 && font.status === 'error') ok = false;
                    });
                    if (!ok) { fontFailure(); return; }
                    if (fonts.status === 'loading') { fontLoading(); return; }
                    clearTimeout(timer);
                    timer = 0;
                    changed();
                }
                fonts.addEventListener('loading', fontLoading);
                fonts.addEventListener('loadingdone', fontFinished);
                fonts.addEventListener('loadingerror', fontFinished);
                // 先订阅，再触发布局；初始没有字体请求时也保留订阅供后续展开使用。
                void article.offsetHeight;
                if (fonts.status === 'loading') fontLoading();
                fonts.ready.then(fontFinished, fontFailure);
            });
        };
        document.head.appendChild(css);
    }

    // Mermaid 已负责 strict 清理；插入前再次去掉交互、外部引用和非 SVG 根节点。
    function svgOnly(svg) {
        var documentSvg = new DOMParser().parseFromString(svg, 'image/svg+xml');
        var rootSvg = documentSvg.documentElement;
        if (rootSvg.localName !== 'svg' || documentSvg.querySelector('parsererror')) throw new Error('Invalid SVG');
        var removed = rootSvg.querySelectorAll('script,foreignObject,image');
        for (var i = 0; i < removed.length; i++) removed[i].parentNode.removeChild(removed[i]);
        var all = rootSvg.querySelectorAll('*');
        for (var j = -1; j < all.length; j++) {
            var element = j < 0 ? rootSvg : all[j];
            for (var k = element.attributes.length - 1; k >= 0; k--) {
                var attr = element.attributes[k], name = attr.name.toLowerCase();
                if (name.indexOf('on') === 0 || name === 'href' || name === 'xlink:href') element.removeAttribute(attr.name);
            }
        }
        return document.importNode(rootSvg, true);
    }
    function finish() {
        changed();
        if (restore && window.__mtMarkdownPreview) window.__mtMarkdownPreview.restoreLayoutPosition(restore);
        restore = null;
    }
    function pump() {
        if (!ready || busy || unavailable) return;
        var target = null;
        for (var i = 0; i < diagrams.length; i++) {
            if (diagrams[i].mtVersion !== version && visible(diagrams[i])) { target = diagrams[i]; break; }
        }
        if (!target) { finish(); return; }
        busy = true;
        var current = version;
        var id = 'mt-diagram-' + i + '-' + current;
        // Mermaid 出错时可能遗留临时 SVG；单独承载测量节点，结束后统一回收。
        var workspace = document.createElement('div');
        workspace.className = 'mt-diagram-work';
        workspace.style.width = Math.max(1, target.clientWidth) + 'px';
        document.body.appendChild(workspace);
        // 全局 Mermaid 配置只在串行队列中更新；用户输入不得重开 HTML 标签或点击回调。
        Promise.resolve().then(function () {
            window.mermaid.initialize({startOnLoad:false, securityLevel:'strict', theme:dark ? 'dark' : 'default',
            fontFamily:'sans-serif', htmlLabels:false, flowchart:{htmlLabels:false},
            maxTextSize:20000, maxEdges:200,
            secure:['secure','securityLevel','startOnLoad','maxTextSize','maxEdges',
                'theme','themeCSS','themeVariables','fontFamily','htmlLabels','flowchart']});
            return window.mermaid.render(id, target.mtSource, workspace);
        }).then(function (result) {
            if (current !== version) return;
            target.textContent = '';
            target.appendChild(svgOnly(result.svg));
            target.classList.remove('mt-render-error');
            target.setAttribute('data-render-state', 'ready');
            target.mtVersion = current;
        }).catch(function () {
            if (current === version) { fail(target); target.mtVersion = current; }
        }).then(function () {
            workspace.parentNode.removeChild(workspace);
            busy = false;
            if (current === version) changed();
            setTimeout(pump, 0);
        });
    }
    function startDiagrams() {
        if (!diagrams.length) return;
        // Tiny 的现代语法和 DOM 仍要求新 WebView；不支持时保留源码。
        if (chromeVersion < 100 || !window.Promise || !window.ResizeObserver) {
            unavailable = true; diagrams.forEach(fail); changed(); return;
        }
        load(mermaidUrl, function (ok) {
            if (!ok || !window.mermaid) { unavailable = true; diagrams.forEach(fail); changed(); return; }
            ready = true; pump();
        }, mermaidIntegrity);
    }
    document.addEventListener('toggle', function (event) {
        if (event.target.tagName === 'DETAILS' && event.target.open) pump();
    }, true);
    window.__mtMarkdownEnhance = {
        theme: function (value) {
            if (dark === value) return;
            dark = value; version++;
            if (window.__mtMarkdownPreview) restore = window.__mtMarkdownPreview.captureLayoutPosition();
            pump();
        }
    };
    startMath();
    startDiagrams();
}());
