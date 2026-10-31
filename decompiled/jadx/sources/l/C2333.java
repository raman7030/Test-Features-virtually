package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۖۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C2333 extends WebViewClient {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0921 f7479;

    public C2333(ActivityC0921 activityC0921) {
        this.f7479 = activityC0921;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ActivityC0921.m3272(this.f7479, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        ActivityC0921 activityC0921 = this.f7479;
        boolean zM3321 = activityC0921.m3321(url);
        if (!zM3321) {
            activityC0921.m3312(url);
            ActivityC0921.m3305(activityC0921, url);
        }
        return zM3321;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f7479.m3321(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ActivityC0921 activityC0921 = this.f7479;
        if (activityC0921.f3529 != null) {
            activityC0921.f3529.m34961();
        }
        if (activityC0921.f3541.f16107 >= 0) {
            webView.setBackgroundColor((activityC0921.m3322(str) && C21238.m48208(activityC0921)) ? Color.rgb(13, 17, 23) : -1);
        }
        Uri uri = str == null ? null : Uri.parse(str);
        activityC0921.m3312(uri);
        ActivityC0921.m3305(activityC0921, uri);
        activityC0921.m3276(0, true);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        ActivityC0921.m3288(this.f7479, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        ActivityC0921 activityC0921 = this.f7479;
        ActivityC0921.m3288(activityC0921, webView, str);
        activityC0921.m3313(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ActivityC0921 activityC0921 = this.f7479;
        activityC0921.m3276(100, false);
        activityC0921.m3324();
        activityC0921.m3313(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            ActivityC0921 activityC0921 = this.f7479;
            activityC0921.m3300();
            ActivityC0921.m3320(activityC0921, webResourceRequest.getUrl());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ActivityC0921 activityC0921 = this.f7479;
        activityC0921.m3300();
        ActivityC0921.m3320(activityC0921, str2 == null ? null : Uri.parse(str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.f7479.m3300();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f7479.m3300();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        ActivityC0921 activityC0921 = this.f7479;
        if (activityC0921.f3533 == webView) {
            activityC0921.f3533 = null;
        }
        activityC0921.m3300();
        C21374.m48457(R.string.MT_Protector);
        activityC0921.finish();
        return true;
    }
}
