package p067l;

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
import bin.p000mt.plus.R;

/* JADX INFO: renamed from: l.ۖۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C4586 extends WebViewClient {

    /* JADX INFO: renamed from: ֫ */
    public final /* synthetic */ ActivityC3244 f10270;

    public C4586(ActivityC3244 activityC3244) {
        this.f10270 = activityC3244;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ActivityC3244.m5591(this.f10270, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        ActivityC3244 activityC3244 = this.f10270;
        boolean zM5640 = activityC3244.m5640(url);
        if (!zM5640) {
            activityC3244.m5631(url);
            ActivityC3244.m5624(activityC3244, url);
        }
        return zM5640;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f10270.m5640(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ActivityC3244 activityC3244 = this.f10270;
        if (activityC3244.f6304 != null) {
            activityC3244.f6304.m37108();
        }
        if (activityC3244.f6316.f18946 >= 0) {
            webView.setBackgroundColor((activityC3244.m5641(str) && C22553.m50539(activityC3244)) ? Color.rgb(13, 17, 23) : -1);
        }
        Uri uri = str == null ? null : Uri.parse(str);
        activityC3244.m5631(uri);
        ActivityC3244.m5624(activityC3244, uri);
        activityC3244.m5595(0, true);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        ActivityC3244.m5607(this.f10270, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        ActivityC3244 activityC3244 = this.f10270;
        ActivityC3244.m5607(activityC3244, webView, str);
        activityC3244.m5632(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ActivityC3244 activityC3244 = this.f10270;
        activityC3244.m5595(100, false);
        activityC3244.m5643();
        activityC3244.m5632(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            ActivityC3244 activityC3244 = this.f10270;
            activityC3244.m5619();
            ActivityC3244.m5639(activityC3244, webResourceRequest.getUrl());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ActivityC3244 activityC3244 = this.f10270;
        activityC3244.m5619();
        ActivityC3244.m5639(activityC3244, str2 == null ? null : Uri.parse(str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.f10270.m5619();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f10270.m5619();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        ActivityC3244 activityC3244 = this.f10270;
        if (activityC3244.f6308 == webView) {
            activityC3244.f6308 = null;
        }
        activityC3244.m5619();
        C22682.m50793(R.string.MT_Protector);
        activityC3244.finish();
        return true;
    }
}
