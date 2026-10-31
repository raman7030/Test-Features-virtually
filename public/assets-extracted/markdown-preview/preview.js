/* 仅生成页加载；页面正文不能注入脚本或源码位置标记。兼容旧版 WebView。 */
(function () {
    'use strict';
    var elements = document.querySelectorAll('[data-source-start]');
    var storageKey = 'mt-markdown-position';
    var applied = false, touched = false, pending = false, saveTimer = 0;
    var target = null, saved = null, deadline = 0;
    var layoutObserver = null, interaction = 0;
    var details = document.querySelectorAll('details');
    var detailsState = null, stateWriter = null;

    function start(el) { return Number(el.getAttribute('data-source-start')); }
    function end(el) { return Number(el.getAttribute('data-source-end')); }

    // 嵌套节点优先最小范围；空白行选择最近内容，距离相同优先后一个块。
    function find(line) {
        var best = null, distance = Infinity, size = Infinity;
        for (var i = 0; i < elements.length; i++) {
            var el = elements[i], a = start(el), b = end(el);
            var d = line < a ? a - line : line > b ? line - b : 0;
            if (d < distance || (d === distance && b - a <= size)) {
                best = el; distance = d; size = b - a;
            }
        }
        return best;
    }

    function readPosition() {
        // 从视口顶部命中元素向上找，滚动时不扫描全文或测量全部 DOM。
        var anchor = document.elementFromPoint(window.innerWidth / 2, 1);
        while (anchor && !anchor.hasAttribute('data-source-start')) anchor = anchor.parentElement;
        var value = { x: window.pageXOffset, y: window.pageYOffset, details: detailsState };
        if (anchor) {
            var rect = anchor.getBoundingClientRect();
            value.line = start(anchor);
            value.fraction = -rect.top / Math.max(1, rect.height);
        }
        return value;
    }

    function remember() {
        if (!applied) return;
        try { sessionStorage.setItem(storageKey, JSON.stringify(readPosition())); } catch (ignored) { }
    }

    // 只在折叠变化时扫描并回传；普通滚动沿用已记录的位串。
    function rememberDetails() {
        if (!applied) return;
        var value = '';
        for (var i = 0; i < details.length; i++) value += details[i].open ? '1' : '0';
        if (value !== detailsState) {
            detailsState = value;
            if (stateWriter) stateWriter(value);
        }
        remember();
    }

    function align() {
        pending = false;
        if (touched || Date.now() > deadline) return;
        if (saved) {
            var anchor = typeof saved.line === 'number' ? find(saved.line) : null;
            var y = anchor ? window.pageYOffset + anchor.getBoundingClientRect().top
                + saved.fraction * anchor.getBoundingClientRect().height : saved.y;
            window.scrollTo(saved.x || 0, Math.max(0, y || 0));
        } else if (target) {
            var parent = target;
            while (parent) {
                if (parent.tagName === 'DETAILS') parent.open = true;
                parent = parent.parentElement;
            }
            // 对齐实际可见视口首行，仅留少量顶部间距，避免文字贴边。
            var viewport = window.visualViewport;
            var inset = (viewport ? viewport.offsetTop : 0) + 8;
            window.scrollTo(0, Math.max(0, window.pageYOffset + target.getBoundingClientRect().top - inset));
            rememberDetails();
        }
    }

    function schedule() {
        if (!applied || pending || touched || Date.now() > deadline) return;
        pending = true;
        requestAnimationFrame(align);
    }

    function stopFollowing() {
        interaction++;
        touched = true;
        if (layoutObserver) layoutObserver.disconnect();
    }
    document.addEventListener('touchstart', stopFollowing, true);
    document.addEventListener('mousedown', stopFollowing, true);
    document.addEventListener('wheel', stopFollowing, true);
    document.addEventListener('keydown', stopFollowing, true);
    window.addEventListener('hashchange', stopFollowing);
    document.addEventListener('load', function (event) {
        if (event.target.tagName === 'IMG') schedule();
    }, true);
    window.addEventListener('resize', schedule);
    window.addEventListener('load', schedule);
    if (window.visualViewport) window.visualViewport.addEventListener('resize', schedule);
    window.addEventListener('scroll', function () {
        clearTimeout(saveTimer);
        saveTimer = setTimeout(remember, 100);
    });
    window.addEventListener('pagehide', remember);
    document.addEventListener('toggle', function (event) {
        if (event.target.tagName === 'DETAILS') rememberDetails();
    }, true);

    // 原生端核对精确文档 URL 后调用；主题重复应用不会重复定位。
    window.__mtMarkdownPreview = {
        // 增强内容和字体可晚于初始五秒窗口；仅未被用户接管时重新校正。
        contentChanged: function () {
            if (!applied || touched) return;
            deadline = Date.now() + 1000;
            schedule();
        },
        captureLayoutPosition: function () { return { position: readPosition(), interaction: interaction }; },
        restoreLayoutPosition: function (state) {
            if (!touched || state.interaction !== interaction) return;
            var position = state.position;
            var anchor = typeof position.line === 'number' ? find(position.line) : null;
            var rect = anchor ? anchor.getBoundingClientRect() : null;
            var y = rect ? window.pageYOffset + rect.top + position.fraction * rect.height : position.y;
            window.scrollTo(position.x, Math.max(0, y));
        },
        apply: function (dark, line, restoring, folded, saveState) {
            document.documentElement.setAttribute('data-theme', dark ? 'dark' : 'light');
            if (window.__mtMarkdownEnhance) window.__mtMarkdownEnhance.theme(dark);
            // commit/finished 的布局时序不同；用户尚未接管时，后续原生回调应再次校正位置。
            if (applied) { schedule(); return; }
            applied = true;
            stateWriter = saveState || null;
            try { saved = JSON.parse(sessionStorage.getItem(storageKey)); } catch (ignored) { }
            // 新 WebView 使用会话状态，普通刷新使用页面状态；先恢复布局，再处理坐标或锚点。
            var state = typeof folded === 'string' ? folded : saved && saved.details;
            if (typeof state === 'string' && state.length === details.length) {
                for (var i = 0; i < details.length; i++) details[i].open = state.charAt(i) === '1';
            }
            if (restoring) saved = restoring;
            rememberDetails();
            // 重建优先恢复实际阅读位置；无原生恢复状态时才保留链接锚点或浏览器历史位置。
            if (!restoring && (location.hash || window.pageYOffset > 0)) { touched = true; return; }
            target = find(line);
            deadline = Date.now() + 5000;
            // 图片、字体与折叠内容可能晚于首次定位完成排版；只在初始有限窗口内追赶。
            if (window.ResizeObserver) {
                layoutObserver = new ResizeObserver(schedule);
                layoutObserver.observe(document.querySelector('article'));
                setTimeout(function () { layoutObserver.disconnect(); }, 5000);
            }
            schedule();
        }
    };
}());
