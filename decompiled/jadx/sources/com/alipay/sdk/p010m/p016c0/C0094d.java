package com.alipay.sdk.p010m.p016c0;

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
import com.alipay.sdk.p010m.p033l.C0162b;
import com.alipay.sdk.p010m.p033l.C0164d;
import com.alipay.sdk.p010m.p033l.EnumC0163c;
import com.alipay.sdk.p010m.p035m.C0167a;
import com.alipay.sdk.p010m.p035m.C0168b;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0172c;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p045r.C0199b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0242e;
import com.alipay.sdk.p010m.p058y.C0243f;
import com.alipay.sdk.p010m.p058y.C0244g;
import com.alipay.sdk.p010m.p058y.C0247j;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p067l.C21459;

/* JADX INFO: renamed from: com.alipay.sdk.m.c0.d */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0094d extends AbstractC0093c implements C0095e.f, C0095e.g, C0095e.h {

    /* JADX INFO: renamed from: A */
    public static final String f367A = "exit";

    /* JADX INFO: renamed from: B */
    public static final String f368B = "action";

    /* JADX INFO: renamed from: C */
    public static final String f369C = "pushWindow";

    /* JADX INFO: renamed from: D */
    public static final String f370D = "h5JsFuncCallback";

    /* JADX INFO: renamed from: E */
    public static final String f371E = "sdkInfo";

    /* JADX INFO: renamed from: F */
    public static final String f372F = "canUseTaoLogin";

    /* JADX INFO: renamed from: G */
    public static final String f373G = "taoLogin";

    /* JADX INFO: renamed from: H */
    public static final String f374H = "h5LifeCycle";

    /* JADX INFO: renamed from: I */
    public static final String f375I = "netWorkReachableType";

    /* JADX INFO: renamed from: m */
    public static final String f376m = "sdk_result_code:";

    /* JADX INFO: renamed from: n */
    public static final String f377n = "alipayjsbridge://";

    /* JADX INFO: renamed from: o */
    public static final String f378o = "onBack";

    /* JADX INFO: renamed from: p */
    public static final String f379p = "setTitle";

    /* JADX INFO: renamed from: q */
    public static final String f380q = "onRefresh";

    /* JADX INFO: renamed from: r */
    public static final String f381r = "showBackButton";

    /* JADX INFO: renamed from: s */
    public static final String f382s = "onExit";

    /* JADX INFO: renamed from: t */
    public static final String f383t = "onLoadJs";

    /* JADX INFO: renamed from: u */
    public static final String f384u = "callNativeFunc";

    /* JADX INFO: renamed from: v */
    public static final String f385v = "back";

    /* JADX INFO: renamed from: w */
    public static final String f386w = "title";

    /* JADX INFO: renamed from: x */
    public static final String f387x = "refresh";

    /* JADX INFO: renamed from: y */
    public static final String f388y = "backButton";

    /* JADX INFO: renamed from: z */
    public static final String f389z = "refreshButton";

    /* JADX INFO: renamed from: e */
    public boolean f390e;

    /* JADX INFO: renamed from: f */
    public String f391f;

    /* JADX INFO: renamed from: g */
    public boolean f392g;

    /* JADX INFO: renamed from: h */
    public final C0233a f393h;

    /* JADX INFO: renamed from: i */
    public boolean f394i;

    /* JADX INFO: renamed from: j */
    public String f395j;

    /* JADX INFO: renamed from: k */
    public C0095e f396k;

    /* JADX INFO: renamed from: l */
    public C0096f f397l;

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0094d.this.f365a.finish();
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$b */
    /* JADX INFO: compiled from: N673 */
    public class b extends e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0095e f399a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0095e c0095e) {
            super(null);
            this.f399a = c0095e;
        }

        @Override // com.alipay.sdk.p010m.p016c0.C0094d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f399a.m546b();
            C0094d.this.f392g = false;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$c */
    /* JADX INFO: compiled from: N673 */
    public class c extends e {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0095e f401a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f402b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0095e c0095e, String str) {
            super(null);
            this.f401a = c0095e;
            this.f402b = str;
        }

        @Override // com.alipay.sdk.p010m.p016c0.C0094d.e, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            C0094d.this.removeView(this.f401a);
            C0094d.this.f396k.m544a(this.f402b);
            C0094d.this.f392g = false;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$d */
    /* JADX INFO: compiled from: N673 */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Activity f404a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SslErrorHandler f405b;

        /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$d$a */
        /* JADX INFO: compiled from: N673 */
        public class a implements DialogInterface.OnClickListener {
            public a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                d.this.f405b.cancel();
                C0167a.m755b(C0094d.this.f393h, C0168b.f616k, C0168b.f576A, "2");
                C0162b.m730a(C0162b.m728a());
                d.this.f404a.finish();
            }
        }

        public d(Activity activity, SslErrorHandler sslErrorHandler) {
            this.f404a = activity;
            this.f405b = sslErrorHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0092b.m498a(this.f404a, "安全警告", "安全连接证书校验无效，将无法保证访问数据的安全性，请安装支付宝后重试。", "确定", new a(), null, null);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$e */
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

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$g */
    /* JADX INFO: compiled from: N673 */
    public class g implements C0164d.a {

        /* JADX INFO: renamed from: a */
        public final f f413a;

        /* JADX INFO: renamed from: b */
        public final String f414b;

        public g(f fVar, String str) {
            this.f413a = fVar;
            this.f414b = str;
        }

        @Override // com.alipay.sdk.p010m.p033l.C0164d.a
        /* JADX INFO: renamed from: a */
        public void mo532a(boolean z, JSONObject jSONObject, String str) {
            try {
                this.f413a.m531a(new JSONObject().put("success", z).put("random", this.f414b).put("code", jSONObject).put(C0172c.f705a, str));
            } catch (JSONException unused) {
            }
        }
    }

    public C0094d(Activity activity, C0233a c0233a, String str) {
        super(activity, str);
        this.f390e = false;
        this.f391f = "GET";
        this.f392g = false;
        this.f396k = null;
        this.f397l = new C0096f();
        this.f393h = c0233a;
        m525f();
    }

    @Override // com.alipay.sdk.p010m.p016c0.AbstractC0093c
    /* JADX INFO: renamed from: c */
    public synchronized void mo504c() {
        this.f396k.m546b();
        this.f397l.m551a();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m522d() {
        if (this.f397l.m553b()) {
            this.f365a.finish();
        } else {
            this.f392g = true;
            C0095e c0095e = this.f396k;
            this.f396k = this.f397l.m554c();
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new b(c0095e));
            c0095e.setAnimation(translateAnimation);
            removeView(c0095e);
            addView(this.f396k);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m524e() {
        Activity activity = this.f365a;
        C0095e c0095e = this.f396k;
        if (activity != null && c0095e != null) {
            if (this.f390e) {
                activity.finish();
            } else {
                c0095e.m544a("javascript:window.AlipayJSBridge.callListener('h5BackAction');");
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m525f() {
        try {
            C0095e c0095e = new C0095e(this.f365a, this.f393h, new C0095e.e(!m502a(), !m502a()));
            this.f396k = c0095e;
            c0095e.setChromeProxy(this);
            this.f396k.setWebClientProxy(this);
            this.f396k.setWebEventProxy(this);
            addView(this.f396k);
        } catch (Exception unused) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m526g() {
        C0095e c0095e = this.f396k;
        if (c0095e != null) {
            WebView webView = c0095e.getWebView();
            if (TextUtils.isEmpty(this.f395j)) {
                webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
                return;
            }
            String strM1191a = C0243f.m1191a(this.f395j);
            if (TextUtils.isEmpty(strM1191a)) {
                C0167a.m755b(this.f393h, C0168b.f618l, "injectJsApi", "escapeCashierBizDataError");
            } else {
                webView.evaluateJavascript("(function() {window.alipayjsbridgeCashierMainData=" + ("'" + strM1191a.substring(1, strM1191a.length() - 1) + "'") + ";})();", null);
            }
            webView.loadUrl("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n;window.AlipayJSBridge.callListener('h5PageFinished');");
        }
    }

    /* JADX INFO: renamed from: h */
    public boolean m527h() {
        return this.f394i;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m528i() {
        WebView webView = this.f396k.getWebView();
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            C0096f c0096f = this.f397l;
            if (c0096f == null || c0096f.m553b()) {
                m513a(false);
            } else {
                m522d();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m529j() {
        C0167a.m749a(this.f393h, C0168b.f618l, "webViewLoadStart");
        if (!C0180b.m829i().m856h(null)) {
            C0167a.m749a(this.f393h, C0168b.f618l, "webLoad|onlineUrl");
            return;
        }
        if (!C0199b.m956e().m964c()) {
            C0167a.m749a(this.f393h, C0168b.f618l, "webLoad|localUrl");
            return;
        }
        C0167a.m749a(this.f393h, C0168b.f618l, "webLoad|local|" + C0199b.m956e().m966f());
    }

    @Override // android.view.ViewGroup
    public synchronized boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f392g ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public synchronized void setCashierBizData(String str) {
        this.f395j = str;
    }

    @Override // com.alipay.sdk.p010m.p016c0.AbstractC0093c
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo503b() {
        Activity activity = this.f365a;
        if (activity == null) {
            return true;
        }
        if (!m502a()) {
            if (!this.f392g) {
                m524e();
            }
            return true;
        }
        C0095e c0095e = this.f396k;
        if (c0095e != null && c0095e.getWebView() != null) {
            if (!c0095e.getWebView().canGoBack()) {
                C0162b.m730a(C0162b.m728a());
                activity.finish();
            } else if (m527h()) {
                EnumC0163c enumC0163cM736a = EnumC0163c.m736a(EnumC0163c.NETWORK_ERROR.m741c());
                C0162b.m730a(C0162b.m729a(enumC0163cM736a.m741c(), enumC0163cM736a.m739b(), ""));
                activity.finish();
            } else if (this.f390e) {
                C0162b.m730a(C0162b.m728a());
                activity.finish();
            }
            return true;
        }
        activity.finish();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m512a(String str, String str2, boolean z) {
        this.f391f = str2;
        this.f396k.getTitle().setText(str);
        this.f390e = z;
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.g
    /* JADX INFO: renamed from: c */
    public synchronized boolean mo521c(C0095e c0095e, String str) {
        C0167a.m750a(this.f393h, C0168b.f618l, "h5ld", SystemClock.elapsedRealtime() + "|" + C0254q.m1302i(str));
        if (!TextUtils.isEmpty(str) && !str.endsWith(".apk")) {
            m526g();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m513a(boolean z) {
        C0162b.m731a(z);
        this.f365a.finish();
    }

    @Override // com.alipay.sdk.p010m.p016c0.AbstractC0093c
    /* JADX INFO: renamed from: a */
    public synchronized void mo500a(String str) {
        C0244g.m1203d(C0170a.f659B, "WebContainerImpl loadUrl:" + str);
        m529j();
        if ("POST".equals(this.f391f)) {
            this.f396k.m545a(str, (byte[]) null);
        } else {
            this.f396k.m544a(str);
        }
        AbstractC0093c.m499a(this.f396k.getWebView());
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.f
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo516a(C0095e c0095e, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        if (str2.startsWith("<head>") && str2.contains(f376m)) {
            this.f365a.runOnUiThread(new a());
        }
        jsPromptResult.cancel();
        return true;
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.d$f */
    /* JADX INFO: compiled from: N673 */
    public class f {

        /* JADX INFO: renamed from: a */
        public final WeakReference f408a;

        /* JADX INFO: renamed from: b */
        public final String f409b;

        /* JADX INFO: renamed from: c */
        public final String f410c;

        /* JADX INFO: renamed from: d */
        public final JSONObject f411d;

        /* JADX INFO: renamed from: e */
        public boolean f412e = false;

        public f(C0095e c0095e, String str, String str2, JSONObject jSONObject) {
            this.f408a = new WeakReference(c0095e);
            this.f409b = str;
            this.f410c = str2;
            this.f411d = jSONObject;
        }

        /* JADX INFO: renamed from: a */
        public void m531a(JSONObject jSONObject) {
            C0095e c0095e;
            if (this.f412e || (c0095e = (C0095e) C0254q.m1252a(this.f408a)) == null) {
                return;
            }
            this.f412e = true;
            c0095e.m544a(C21459.m48622("javascript:window.AlipayJSBridge.callBackFromNativeFunc('", m530a(this.f410c), "','", m530a(jSONObject.toString()), "');"));
        }

        /* JADX INFO: renamed from: a */
        public static String m530a(String str) {
            return TextUtils.isEmpty(str) ? "" : str.replace("'", "");
        }
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.g
    /* JADX INFO: renamed from: d */
    public synchronized boolean mo523d(C0095e c0095e, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Activity activity = this.f365a;
        if (activity == null) {
            return true;
        }
        if (C0254q.m1271a(this.f393h, str, activity)) {
            return true;
        }
        if (str.startsWith(f377n)) {
            m518b(str.substring(17));
        } else if (TextUtils.equals(str, C0170a.f679r)) {
            m513a(false);
        } else if (!str.startsWith("http://") && !str.startsWith("https://")) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                activity.startActivity(intent);
            } catch (Throwable th) {
                C0167a.m753a(this.f393h, C0168b.f618l, th);
            }
        } else {
            this.f396k.m544a(str);
        }
        return true;
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.f
    /* JADX INFO: renamed from: a */
    public synchronized void mo510a(C0095e c0095e, String str) {
        if (!str.startsWith(C0170a.f680s) && !c0095e.getUrl().endsWith(str)) {
            this.f396k.getTitle().setText(str);
        }
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.g
    /* JADX INFO: renamed from: a */
    public WebResourceResponse mo508a(WebView webView, String str) {
        if (!C0199b.m956e().m964c()) {
            return null;
        }
        WebResourceResponse webResourceResponseM1187a = C0242e.m1187a(C0199b.m956e().m961b(str));
        if (webResourceResponseM1187a != null) {
            C0244g.m1201b(C0170a.f659B, "shouldInterceptRequest return not null, url=" + str);
        }
        return webResourceResponseM1187a;
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.g
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo514a(C0095e c0095e, int i, String str, String str2) {
        this.f394i = true;
        C0167a.m755b(this.f393h, C0168b.f616k, C0168b.f644y, "onReceivedError:" + i + "|" + str2);
        c0095e.getRefreshButton().setVisibility(0);
        return false;
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.g
    /* JADX INFO: renamed from: a */
    public synchronized boolean mo515a(C0095e c0095e, SslErrorHandler sslErrorHandler, SslError sslError) {
        Activity activity = this.f365a;
        if (activity == null) {
            return true;
        }
        C0167a.m755b(this.f393h, C0168b.f616k, C0168b.f646z, "2-" + sslError);
        activity.runOnUiThread(new d(activity, sslErrorHandler));
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final synchronized void m511a(String str, String str2, String str3) {
        C0095e c0095e = this.f396k;
        if (c0095e == null) {
            return;
        }
        JSONObject jSONObjectM1299h = C0254q.m1299h(str3);
        f fVar = new f(c0095e, str, str2, jSONObjectM1299h);
        Context context = c0095e.getContext();
        try {
            String str4 = fVar.f409b;
            switch (str4.hashCode()) {
                case -1785164386:
                    if (str4.equals(f372F)) {
                        String url = c0095e.getUrl();
                        if (!C0254q.m1270a(this.f393h, url)) {
                            C0167a.m755b(this.f393h, C0168b.f618l, "jsUrlErr", url);
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            boolean zM744a = C0164d.m744a(this.f393h, context);
                            jSONObject.put("enabled", zM744a);
                            C0167a.m750a(this.f393h, C0168b.f618l, C0168b.f635t0, String.valueOf(zM744a));
                            fVar.m531a(jSONObject);
                        }
                    }
                    break;
                case -552487705:
                    if (str4.equals(f373G)) {
                        String url2 = c0095e.getUrl();
                        if (!C0254q.m1270a(this.f393h, url2)) {
                            C0167a.m755b(this.f393h, C0168b.f618l, "jsUrlErr", url2);
                        } else {
                            String strOptString = jSONObjectM1299h.optString("random");
                            JSONObject jSONObjectOptJSONObject = jSONObjectM1299h.optJSONObject("options");
                            if (!TextUtils.isEmpty("random") && jSONObjectOptJSONObject != null) {
                                String strOptString2 = jSONObjectOptJSONObject.optString("url");
                                String strOptString3 = jSONObjectOptJSONObject.optString("action");
                                if (!TextUtils.isEmpty(strOptString2) && !TextUtils.isEmpty(strOptString3) && (context instanceof Activity)) {
                                    C0164d.m743a(this.f393h, (Activity) context, C0164d.f561a, strOptString2, strOptString3, new g(fVar, strOptString));
                                }
                            }
                        }
                    }
                    break;
                case 3015911:
                    if (str4.equals(f385v)) {
                        m528i();
                    }
                    break;
                case 3127582:
                    if (str4.equals(f367A)) {
                        C0162b.m730a(jSONObjectM1299h.optString(C0252o.f1208c, null));
                        m513a(jSONObjectM1299h.optBoolean("success", false));
                    }
                    break;
                case 110371416:
                    if (str4.equals("title") && jSONObjectM1299h.has("title")) {
                        c0095e.getTitle().setText(jSONObjectM1299h.optString("title", ""));
                    }
                    break;
                case 1085444827:
                    if (str4.equals(f387x)) {
                        c0095e.getWebView().reload();
                    }
                    break;
                case 1235264121:
                    if (str4.equals(f375I)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(C0252o.f1208c, !C0180b.m829i().m852f(null) ? "-2" : C0247j.m1209a(getContext()));
                        fVar.m531a(jSONObject2);
                    }
                    break;
                case 1703426986:
                    if (str4.equals(f369C)) {
                        m520b(jSONObjectM1299h.optString("url"), jSONObjectM1299h.optString("title", ""));
                    }
                    break;
                case 1906413305:
                    if (str4.equals(f388y)) {
                        c0095e.getBackButton().setVisibility(jSONObjectM1299h.optBoolean("show", true) ? 0 : 4);
                    }
                    break;
                case 1942429949:
                    if (str4.equals(f374H)) {
                        String strOptString4 = jSONObjectM1299h.optString("type");
                        C0167a.m749a(this.f393h, C0168b.f618l, "h5LifeCycle|" + strOptString4);
                    }
                    break;
                case 1947723784:
                    if (str4.equals(f371E)) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("sdk_version", "15.8.40");
                        jSONObject3.put("app_name", this.f393h.m1105c());
                        jSONObject3.put("app_version", this.f393h.m1108d());
                        fVar.m531a(jSONObject3);
                    }
                    break;
                case 2033767917:
                    if (str4.equals(f389z)) {
                        c0095e.getRefreshButton().setVisibility(jSONObjectM1299h.optBoolean("show", true) ? 0 : 4);
                    }
                    break;
            }
        } catch (Throwable th) {
            C0167a.m752a(this.f393h, C0168b.f618l, "jInfoErr", th, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized boolean m520b(String str, String str2) {
        C0095e c0095e = this.f396k;
        try {
            C0095e c0095e2 = new C0095e(this.f365a, this.f393h, new C0095e.e(!m502a(), !m502a()));
            this.f396k = c0095e2;
            c0095e2.setChromeProxy(this);
            this.f396k.setWebClientProxy(this);
            this.f396k.setWebEventProxy(this);
            if (!TextUtils.isEmpty(str2)) {
                this.f396k.getTitle().setText(str2);
            }
            this.f392g = true;
            this.f397l.m552a(c0095e);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation.setDuration(400L);
            translateAnimation.setFillAfter(false);
            translateAnimation.setAnimationListener(new c(c0095e, str));
            this.f396k.setAnimation(translateAnimation);
            addView(this.f396k);
        } catch (Throwable unused) {
            return false;
        }
        return true;
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.g
    /* JADX INFO: renamed from: b */
    public synchronized boolean mo519b(C0095e c0095e, String str) {
        C0167a.m750a(this.f393h, C0168b.f618l, "h5ldd", SystemClock.elapsedRealtime() + "|" + C0254q.m1302i(str));
        m526g();
        c0095e.getRefreshButton().setVisibility(0);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m518b(String str) {
        C0244g.m1203d(C0170a.f659B, "processJsBridge urlContent:" + str);
        Map mapM1278b = C0254q.m1278b(this.f393h, str);
        if (str.startsWith(f384u)) {
            m511a((String) mapM1278b.get("func"), (String) mapM1278b.get("cbId"), (String) mapM1278b.get(AbstractC0213e.f989m));
        } else if (str.startsWith(f378o)) {
            m528i();
        } else if (str.startsWith(f379p) && mapM1278b.containsKey("title")) {
            this.f396k.getTitle().setText((CharSequence) mapM1278b.get("title"));
        } else if (str.startsWith(f380q)) {
            this.f396k.getWebView().reload();
        } else if (str.startsWith(f381r) && mapM1278b.containsKey("bshow")) {
            this.f396k.getBackButton().setVisibility(TextUtils.equals("true", (CharSequence) mapM1278b.get("bshow")) ? 0 : 4);
        } else if (str.startsWith(f382s)) {
            C0162b.m730a((String) mapM1278b.get(C0252o.f1208c));
            m513a(TextUtils.equals("true", (CharSequence) mapM1278b.get("bsucc")));
        } else if (str.startsWith(f383t)) {
            this.f396k.m544a("javascript:(function() {\n    if (window.AlipayJSBridge) {\n        return\n    }\n\n    function alipayjsbridgeFunc(url) {\n        var iframe = document.createElement(\"iframe\");\n        iframe.style.width = \"1px\";\n        iframe.style.height = \"1px\";\n        iframe.style.display = \"none\";\n        iframe.src = url;\n        document.body.appendChild(iframe);\n        setTimeout(function() {\n            document.body.removeChild(iframe)\n        }, 100)\n    }\n    window.alipayjsbridgeSetTitle = function(title) {\n        document.title = title;\n        alipayjsbridgeFunc(\"alipayjsbridge://setTitle?title=\" + encodeURIComponent(title))\n    };\n    window.alipayjsbridgeRefresh = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onRefresh?\")\n    };\n    window.alipayjsbridgeBack = function() {\n        alipayjsbridgeFunc(\"alipayjsbridge://onBack?\")\n    };\n    window.alipayjsbridgeExit = function(bsucc) {\n        alipayjsbridgeFunc(\"alipayjsbridge://onExit?bsucc=\" + bsucc)\n    };\n    window.alipayjsbridgeShowBackButton = function(bshow) {\n        alipayjsbridgeFunc(\"alipayjsbridge://showBackButton?bshow=\" + bshow)\n    };\n    window.AlipayJSBridge = {\n        version: \"2.0\",\n        addListener: addListener,\n        hasListener: hasListener,\n        callListener: callListener,\n        callNativeFunc: callNativeFunc,\n        callBackFromNativeFunc: callBackFromNativeFunc\n    };\n    var uniqueId = 1;\n    var h5JsCallbackMap = {};\n\n    function iframeCall(paramStr) {\n        setTimeout(function() {\n        \tvar iframe = document.createElement(\"iframe\");\n        \tiframe.style.width = \"1px\";\n        \tiframe.style.height = \"1px\";\n        \tiframe.style.display = \"none\";\n        \tiframe.src = \"alipayjsbridge://callNativeFunc?\" + paramStr;\n        \tvar parent = document.body || document.documentElement;\n        \tparent.appendChild(iframe);\n        \tsetTimeout(function() {\n            \tparent.removeChild(iframe)\n        \t}, 0)\n        }, 0)\n    }\n\n    function callNativeFunc(nativeFuncName, data, h5JsCallback) {\n        var h5JsCallbackId = \"\";\n        if (h5JsCallback) {\n            h5JsCallbackId = \"cb_\" + (uniqueId++) + \"_\" + new Date().getTime();\n            h5JsCallbackMap[h5JsCallbackId] = h5JsCallback\n        }\n        var dataStr = \"\";\n        if (data) {\n            dataStr = encodeURIComponent(JSON.stringify(data))\n        }\n        var paramStr = \"func=\" + nativeFuncName + \"&cbId=\" + h5JsCallbackId + \"&data=\" + dataStr;\n        iframeCall(paramStr)\n    }\n\n    function callBackFromNativeFunc(h5JsCallbackId, data) {\n        var h5JsCallback = h5JsCallbackMap[h5JsCallbackId];\n        if (h5JsCallback) {\n            h5JsCallback(data);\n            delete h5JsCallbackMap[h5JsCallbackId]\n        }\n    }\n    var h5ListenerMap = {};\n\n    function addListener(jsFuncName, jsFunc) {\n        h5ListenerMap[jsFuncName] = jsFunc\n    }\n\n    function hasListener(jsFuncName) {\n        var jsFunc = h5ListenerMap[jsFuncName];\n        if (!jsFunc) {\n            return false\n        }\n        return true\n    }\n\n    function callListener(h5JsFuncName, data, nativeCallbackId) {\n        var responseCallback;\n        if (nativeCallbackId) {\n            responseCallback = function(responseData) {\n                var dataStr = \"\";\n                if (responseData) {\n                    dataStr = encodeURIComponent(JSON.stringify(responseData))\n                }\n                var paramStr = \"func=h5JsFuncCallback\" + \"&cbId=\" + nativeCallbackId + \"&data=\" + dataStr;\n                iframeCall(paramStr)\n            }\n        }\n        var h5JsFunc = h5ListenerMap[h5JsFuncName];\n        if (h5JsFunc) {\n            h5JsFunc(data, responseCallback)\n        } else if (h5JsFuncName == \"h5BackAction\") {\n            if (!window.alipayjsbridgeH5BackAction || !alipayjsbridgeH5BackAction()) {\n                var paramStr = \"func=back\";\n                iframeCall(paramStr)\n            }\n        } else {\n            console.log(\"AlipayJSBridge: no h5JsFunc \" + h5JsFuncName + data)\n        }\n    }\n    var event;\n    if (window.CustomEvent) {\n        event = new CustomEvent(\"alipayjsbridgeready\")\n    } else {\n        event = document.createEvent(\"Event\");\n        event.initEvent(\"alipayjsbridgeready\", true, true)\n    }\n    document.dispatchEvent(event);\n    setTimeout(excuteH5InitFuncs, 0);\n\n    function excuteH5InitFuncs() {\n        if (window.AlipayJSBridgeInitArray) {\n            var h5InitFuncs = window.AlipayJSBridgeInitArray;\n            delete window.AlipayJSBridgeInitArray;\n            for (var i = 0; i < h5InitFuncs.length; i++) {\n                try {\n                    h5InitFuncs[i](AlipayJSBridge)\n                } catch (e) {\n                    setTimeout(function() {\n                        throw e\n                    })\n                }\n            }\n        }\n    }\n})();\n");
        }
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.h
    /* JADX INFO: renamed from: b */
    public synchronized void mo517b(C0095e c0095e) {
        c0095e.getWebView().reload();
        c0095e.getRefreshButton().setVisibility(4);
    }

    @Override // com.alipay.sdk.p010m.p016c0.C0095e.h
    /* JADX INFO: renamed from: a */
    public synchronized void mo509a(C0095e c0095e) {
        m524e();
    }
}
