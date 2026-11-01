package p067l;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: renamed from: l.᩻᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C25161 {
    /* JADX INFO: renamed from: ֫ */
    public static void m55206(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            try {
                settings.setSavePassword(false);
                settings.setAllowFileAccess(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            } catch (Exception e) {
                C11060.m25465("WebViewUtils", "Exception", e);
            }
            settings.setJavaScriptEnabled(true);
        }
    }
}
