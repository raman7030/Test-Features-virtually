package p067l;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.۬ܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C14902 {

    /* JADX INFO: renamed from: ֫ */
    public WeakReference f42510;

    /* JADX INFO: renamed from: ۧ */
    public long f42511;

    public C14902(WebView webView, long j) {
        this.f42510 = new WeakReference(webView);
        this.f42511 = j;
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo25525() {
        WebView webView = (WebView) this.f42510.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f42511 + ",{'r':0,'result':'undefined'});");
    }

    /* JADX INFO: renamed from: ۧ */
    public void mo25527() {
        WebView webView = (WebView) this.f42510.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f42511 + ",{'r':1,'result':'no such method'})");
    }

    /* JADX INFO: renamed from: ֫ */
    public void mo25526(String str) {
        WebView webView = (WebView) this.f42510.get();
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }
}
