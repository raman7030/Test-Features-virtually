package l;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۬ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C13188 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public WeakReference f39446;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f39447;

    public C13188(WebView webView, long j) {
        this.f39446 = new WeakReference(webView);
        this.f39447 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo23574() {
        WebView webView = (WebView) this.f39446.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f39447 + ",{'r':0,'result':'undefined'});");
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo23576() {
        WebView webView = (WebView) this.f39446.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f39447 + ",{'r':1,'result':'no such method'})");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo23575(String str) {
        WebView webView = (WebView) this.f39446.get();
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }
}
