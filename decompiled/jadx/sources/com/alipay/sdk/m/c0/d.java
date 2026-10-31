package com.alipay.sdk.m.c0;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.alipay.sdk.m.y.j;
import com.alipay.sdk.m.y.o;
import com.alipay.sdk.m.y.q;
import java.lang.ref.WeakReference;
import java.util.Map;
import l.C20087;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class d extends com.alipay.sdk.m.c0.c implements com.alipay.sdk.m.c0.e.f, com.alipay.sdk.m.c0.e.g, com.alipay.sdk.m.c0.e.h {
    public static final String A = "exit";
    public static final String B = "action";
    public static final String C = "pushWindow";
    public static final String D = "h5JsFuncCallback";
    public static final String E = "sdkInfo";
    public static final String F = "canUseTaoLogin";
    public static final String G = "taoLogin";
    public static final String H = "h5LifeCycle";
    public static final String I = "netWorkReachableType";
    public static final String m = "sdk_result_code:";
    public static final String n = "alipayjsbridge://";
    public static final String o = "onBack";
    public static final String p = "setTitle";
    public static final String q = "onRefresh";
    public static final String r = "showBackButton";
    public static final String s = "onExit";
    public static final String t = "onLoadJs";
    public static final String u = "callNativeFunc";
    public static final String v = "back";
    public static final String w = "title";
    public static final String x = "refresh";
    public static final String y = "backButton";
    public static final String z = "refreshButton";
    public boolean e;
    public String f;
    public boolean g;
    public final com.alipay.sdk.m.w.a h;
    public boolean i;
    public String j;
    public com.alipay.sdk.m.c0.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.alipay.sdk.m.c0.f f77906l;

    /* JADX INFO: compiled from: N673 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.a.finish();
        }
    }

    /* JADX INFO: compiled from: N673 */
    public class b extends e {
        public final /* synthetic */ com.alipay.sdk.m.c0.e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.alipay.sdk.m.c0.e eVar) {
            super(null);
            this.a = eVar;
        }

        @Override // com.alipay.sdk.m.c0.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.a.b();
            d.this.g = false;
        }
    }

    /* JADX INFO: compiled from: N673 */
    public class c extends e {
        public final /* synthetic */ com.alipay.sdk.m.c0.e a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.alipay.sdk.m.c0.e eVar, String str) {
            super(null);
            this.a = eVar;
            this.b = str;
        }

        @Override // com.alipay.sdk.m.c0.d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            d.this.removeView(this.a);
            d.this.k.a(this.b);
            d.this.g = false;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: N673 */
    public class RunnableC0010d implements Runnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ SslErrorHandler b;

        /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$d$a */
        /* JADX INFO: compiled from: N673 */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                RunnableC0010d.this.b.cancel();
                com.alipay.sdk.m.m.a.b(d.this.h, com.alipay.sdk.m.m.b.k, com.alipay.sdk.m.m.b.A, "2");
                com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a());
                RunnableC0010d.this.a.finish();
            }
        }

        public RunnableC0010d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.a = activity;
            this.b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.alipay.sdk.m.c0.b.a(this.a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    /* JADX INFO: compiled from: N673 */
    public abstract class e implements Animation.AnimationListener {
        public e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: N673 */
    public class g implements com.alipay.sdk.m.l.d.a {
        public final f a;
        public final String b;

        public g(f fVar, String str) {
            this.a = fVar;
            this.b = str;
        }

        @Override // com.alipay.sdk.m.l.d.a
        public void a(boolean z, JSONObject jSONObject, String str) {
            try {
                this.a.a(new JSONObject().put("success", z).put("random", this.b).put("code", jSONObject).put(com.alipay.sdk.m.n.c.a, str));
            } catch (JSONException unused) {
            }
        }
    }

    public d(Activity activity, com.alipay.sdk.m.w.a aVar, String str) {
        super(activity, str);
        this.e = false;
        this.f = "GET";
        this.g = false;
        this.k = null;
        this.f77906l = new com.alipay.sdk.m.c0.f();
        this.h = aVar;
        f();
    }

    @Override // com.alipay.sdk.m.c0.c
    public synchronized void c() {
        this.k.b();
        this.f77906l.a();
    }

    public final synchronized boolean d() {
        if (this.f77906l.b()) {
            this.a.finish();
        } else {
            this.g = true;
            com.alipay.sdk.m.c0.e eVar = this.k;
            this.k = this.f77906l.c();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(eVar));
            eVar.setAnimation(translateAnimation);
            removeView(eVar);
            addView(this.k);
        }
        return true;
    }

    public final synchronized void e() {
        Activity activity = this.a;
        com.alipay.sdk.m.c0.e eVar = this.k;
        if (activity != null && eVar != null) {
            if (this.e) {
                activity.finish();
            } else {
                eVar.a("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }

    public final synchronized boolean f() {
        try {
            com.alipay.sdk.m.c0.e eVar = new com.alipay.sdk.m.c0.e(this.a, this.h, new com.alipay.sdk.m.c0.e.C0012e(!a(), !a()));
            this.k = eVar;
            eVar.setChromeProxy(this);
            this.k.setWebClientProxy(this);
            this.k.setWebEventProxy(this);
            addView(this.k);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    public final void g() {
        com.alipay.sdk.m.c0.e eVar = this.k;
        if (eVar != null) {
            WebView webView = eVar.getWebView();
            if (TextUtils.isEmpty(this.j)) {
                webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                return;
            }
            String strA = com.alipay.sdk.m.y.f.a(this.j);
            if (TextUtils.isEmpty(strA)) {
                com.alipay.sdk.m.m.a.b(this.h, com.alipay.sdk.m.m.b.f77909l, "injectJsApi", "escapeCashierBizDataError");
            } else {
                webView.evaluateJavascript("(function() {window.alipayjsbridgeCashierMainData=" + ("'" + strA.substring(1, strA.length() - 1) + "'") + ";})();", null);
            }
            webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    public boolean h() {
        return this.i;
    }

    public final synchronized void i() {
        WebView webView = this.k.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            com.alipay.sdk.m.c0.f fVar = this.f77906l;
            if (fVar == null || fVar.b()) {
                a(false);
            } else {
                d();
            }
        }
    }

    public final void j() {
        com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "webViewLoadStart");
        if (!com.alipay.sdk.m.o.b.i().h(null)) {
            com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "webLoad|onlineUrl");
            return;
        }
        if (!com.alipay.sdk.m.r.b.e().c()) {
            com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "webLoad|localUrl");
            return;
        }
        com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "webLoad|local|" + com.alipay.sdk.m.r.b.e().f());
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void setCashierBizData(String str) {
        this.j = str;
    }

    @Override // com.alipay.sdk.m.c0.c
    public synchronized boolean b() {
        Activity activity = this.a;
        if (activity == null) {
            return true;
        }
        if (!a()) {
            if (!this.g) {
                e();
            }
            return true;
        }
        com.alipay.sdk.m.c0.e eVar = this.k;
        if (eVar != null && eVar.getWebView() != null) {
            if (!eVar.getWebView().canGoBack()) {
                com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a());
                activity.finish();
            } else if (h()) {
                com.alipay.sdk.m.l.c cVarA = com.alipay.sdk.m.l.c.a(com.alipay.sdk.m.l.c.NETWORK_ERROR.c());
                com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a(cVarA.c(), cVarA.b(), ""));
                activity.finish();
            } else if (this.e) {
                com.alipay.sdk.m.l.b.a(com.alipay.sdk.m.l.b.a());
                activity.finish();
            }
            return true;
        }
        activity.finish();
        return true;
    }

    public synchronized void a(String str, String str2, boolean z2) {
        this.f = str2;
        this.k.getTitle().setText(str);
        this.e = z2;
    }

    @Override // com.alipay.sdk.m.c0.e.g
    public synchronized boolean c(com.alipay.sdk.m.c0.e eVar, String str) {
        com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "h5ld", SystemClock.elapsedRealtime() + "|" + q.i(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            g();
        }
        return false;
    }

    public final synchronized void a(boolean z2) {
        com.alipay.sdk.m.l.b.a(z2);
        this.a.finish();
    }

    @Override // com.alipay.sdk.m.c0.c
    public synchronized void a(String str) {
        com.alipay.sdk.m.y.g.d(com.alipay.sdk.m.n.a.B, "WebContainerImpl loadUrl:" + str);
        j();
        if ("POST".equals(this.f)) {
            this.k.a(str, (byte[]) null);
        } else {
            this.k.a(str);
        }
        com.alipay.sdk.m.c0.c.a(this.k.getWebView());
    }

    @Override // com.alipay.sdk.m.c0.e.f
    public synchronized boolean a(com.alipay.sdk.m.c0.e eVar, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains(m)) {
            this.a.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    /* JADX INFO: compiled from: N673 */
    public class f {
        public final WeakReference a;
        public final String b;
        public final String c;
        public final JSONObject d;
        public boolean e = false;

        public f(com.alipay.sdk.m.c0.e eVar, String str, String str2, JSONObject jSONObject) {
            this.a = new WeakReference(eVar);
            this.b = str;
            this.c = str2;
            this.d = jSONObject;
        }

        public void a(JSONObject jSONObject) {
            com.alipay.sdk.m.c0.e eVar;
            if (this.e || (eVar = (com.alipay.sdk.m.c0.e) q.a(this.a)) == null) {
                return;
            }
            this.e = true;
            eVar.a(C20087.m46306("javascript:window.AlipayJSBridge.callBackFromNativeFunc('", a(this.c), "','", a(jSONObject.toString()), "');"));
        }

        public static String a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }
    }

    @Override // com.alipay.sdk.m.c0.e.g
    public synchronized boolean d(com.alipay.sdk.m.c0.e eVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity activity = this.a;
        if (activity == null) {
            return true;
        }
        if (q.a(this.h, str, activity)) {
            return true;
        }
        if (str.startsWith(n)) {
            b(str.substring(17));
        } else if (TextUtils.equals(str, com.alipay.sdk.m.n.a.r)) {
            a(false);
        } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                activity.startActivity(intent);
            } catch (Throwable th) {
                com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, th);
            }
        } else {
            this.k.a(str);
        }
        return true;
    }

    @Override // com.alipay.sdk.m.c0.e.f
    public synchronized void a(com.alipay.sdk.m.c0.e eVar, String str) {
        if (!str.startsWith(com.alipay.sdk.m.n.a.s) && !eVar.getUrl().endsWith(str)) {
            this.k.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.m.c0.e.g
    public WebResourceResponse a(WebView webView, String str) {
        if (!com.alipay.sdk.m.r.b.e().c()) {
            return null;
        }
        WebResourceResponse webResourceResponseA = com.alipay.sdk.m.y.e.a(com.alipay.sdk.m.r.b.e().b(str));
        if (webResourceResponseA != null) {
            com.alipay.sdk.m.y.g.b(com.alipay.sdk.m.n.a.B, "shouldInterceptRequest return not null, url=" + str);
        }
        return webResourceResponseA;
    }

    @Override // com.alipay.sdk.m.c0.e.g
    public synchronized boolean a(com.alipay.sdk.m.c0.e eVar, int i, String str, String str2) {
        this.i = true;
        com.alipay.sdk.m.m.a.b(this.h, com.alipay.sdk.m.m.b.k, com.alipay.sdk.m.m.b.y, "onReceivedError:" + i + "|" + str2);
        eVar.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.m.c0.e.g
    public synchronized boolean a(com.alipay.sdk.m.c0.e eVar, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.a;
        if (activity == null) {
            return true;
        }
        com.alipay.sdk.m.m.a.b(this.h, com.alipay.sdk.m.m.b.k, com.alipay.sdk.m.m.b.z, "2-" + sslError);
        activity.runOnUiThread(new RunnableC0010d(activity, sslErrorHandler));
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void a(String str, String str2, String str3) {
        com.alipay.sdk.m.c0.e eVar = this.k;
        if (eVar == null) {
            return;
        }
        JSONObject jSONObjectH = q.h(str3);
        f fVar = new f(eVar, str, str2, jSONObjectH);
        Context context = eVar.getContext();
        try {
            String str4 = fVar.b;
            switch (str4.hashCode()) {
                case -1785164386:
                    if (str4.equals(F)) {
                        String url = eVar.getUrl();
                        if (!q.a(this.h, url)) {
                            com.alipay.sdk.m.m.a.b(this.h, com.alipay.sdk.m.m.b.f77909l, "jsUrlErr", url);
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            boolean zA = com.alipay.sdk.m.l.d.a(this.h, context);
                            jSONObject.put("enabled", zA);
                            com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, com.alipay.sdk.m.m.b.t0, String.valueOf(zA));
                            fVar.a(jSONObject);
                        }
                    }
                    break;
                case -552487705:
                    if (str4.equals(G)) {
                        String url2 = eVar.getUrl();
                        if (!q.a(this.h, url2)) {
                            com.alipay.sdk.m.m.a.b(this.h, com.alipay.sdk.m.m.b.f77909l, "jsUrlErr", url2);
                        } else {
                            String strOptString = jSONObjectH.optString("random");
                            JSONObject jSONObjectOptJSONObject = jSONObjectH.optJSONObject("options");
                            if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("url");
                                String strOptString3 = jSONObjectOptJSONObject.optString("action");
                                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                    com.alipay.sdk.m.l.d.a(this.h, (Activity) context, com.alipay.sdk.m.l.d.a, strOptString2, strOptString3, new g(fVar, strOptString));
                                }
                            }
                        }
                    }
                    break;
                case 3015911:
                    if (str4.equals(v)) {
                        i();
                    }
                    break;
                case 3127582:
                    if (str4.equals(A)) {
                        com.alipay.sdk.m.l.b.a(jSONObjectH.optString(o.c, null));
                        a(jSONObjectH.optBoolean("success", false));
                    }
                    break;
                case 110371416:
                    if (str4.equals("title") && jSONObjectH.has("title")) {
                        eVar.getTitle().setText(jSONObjectH.optString("title", ""));
                    }
                    break;
                case 1085444827:
                    if (str4.equals(x)) {
                        eVar.getWebView().reload();
                    }
                    break;
                case 1235264121:
                    if (str4.equals(I)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(o.c, !com.alipay.sdk.m.o.b.i().f(null) ? "-2" : j.a(getContext()));
                        fVar.a(jSONObject2);
                    }
                    break;
                case 1703426986:
                    if (str4.equals(C)) {
                        b(jSONObjectH.optString("url"), jSONObjectH.optString("title", ""));
                    }
                    break;
                case 1906413305:
                    if (str4.equals(y)) {
                        eVar.getBackButton().setVisibility(jSONObjectH.optBoolean("show", true) ? 0 : 4);
                    }
                    break;
                case 1942429949:
                    if (str4.equals(H)) {
                        String strOptString4 = jSONObjectH.optString("type");
                        com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "h5LifeCycle|" + strOptString4);
                    }
                    break;
                case 1947723784:
                    if (str4.equals(E)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("sdk_version", "15.8.40");
                        jSONObject3.put("app_name", this.h.c());
                        jSONObject3.put("app_version", this.h.d());
                        fVar.a(jSONObject3);
                    }
                    break;
                case 2033767917:
                    if (str4.equals(z)) {
                        eVar.getRefreshButton().setVisibility(jSONObjectH.optBoolean("show", true) ? 0 : 4);
                    }
                    break;
            }
        } catch (Throwable th) {
            com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "jInfoErr", th, str);
        }
    }

    public final synchronized boolean b(String str, String str2) {
        com.alipay.sdk.m.c0.e eVar = this.k;
        try {
            com.alipay.sdk.m.c0.e eVar2 = new com.alipay.sdk.m.c0.e(this.a, this.h, new com.alipay.sdk.m.c0.e.C0012e(!a(), !a()));
            this.k = eVar2;
            eVar2.setChromeProxy(this);
            this.k.setWebClientProxy(this);
            this.k.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.k.getTitle().setText(str2);
            }
            this.g = true;
            this.f77906l.a(eVar);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(eVar, str));
            this.k.setAnimation(translateAnimation);
            addView(this.k);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.sdk.m.c0.e.g
    public synchronized boolean b(com.alipay.sdk.m.c0.e eVar, String str) {
        com.alipay.sdk.m.m.a.a(this.h, com.alipay.sdk.m.m.b.f77909l, "h5ldd", SystemClock.elapsedRealtime() + "|" + q.i(str));
        g();
        eVar.getRefreshButton().setVisibility(0);
        return true;
    }

    public final synchronized void b(String str) {
        com.alipay.sdk.m.y.g.d(com.alipay.sdk.m.n.a.B, "processJsBridge urlContent:" + str);
        Map mapB = q.b(this.h, str);
        if (str.startsWith(u)) {
            a((String) mapB.get("func"), (String) mapB.get("cbId"), (String) mapB.get(com.alipay.sdk.m.t.e.m));
        } else if (str.startsWith(o)) {
            i();
        } else if (str.startsWith(p) && mapB.containsKey("title")) {
            this.k.getTitle().setText((CharSequence) mapB.get("title"));
        } else if (str.startsWith(q)) {
            this.k.getWebView().reload();
        } else if (str.startsWith(r) && mapB.containsKey("bshow")) {
            this.k.getBackButton().setVisibility(TextUtils.equals("true", (CharSequence) mapB.get("bshow")) ? 0 : 4);
        } else if (str.startsWith(s)) {
            com.alipay.sdk.m.l.b.a((String) mapB.get(o.c));
            a(TextUtils.equals("true", (CharSequence) mapB.get("bsucc")));
        } else if (str.startsWith(t)) {
            this.k.a("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    @Override // com.alipay.sdk.m.c0.e.h
    public synchronized void b(com.alipay.sdk.m.c0.e eVar) {
        eVar.getWebView().reload();
        eVar.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.m.c0.e.h
    public synchronized void a(com.alipay.sdk.m.c0.e eVar) {
        e();
    }
}
