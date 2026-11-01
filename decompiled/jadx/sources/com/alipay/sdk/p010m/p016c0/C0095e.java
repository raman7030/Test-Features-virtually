package com.alipay.sdk.p010m.p016c0;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.JsPromptResult;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alipay.sdk.p010m.p014b0.C0087a;
import com.alipay.sdk.p010m.p039o.C0180b;
import com.alipay.sdk.p010m.p055w.C0233a;
import com.alipay.sdk.p010m.p058y.C0251n;
import com.alipay.sdk.p010m.p058y.C0254q;
import java.lang.reflect.Method;
import p067l.C7470;

/* JADX INFO: renamed from: com.alipay.sdk.m.c0.e */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0095e extends LinearLayout {

    /* JADX INFO: renamed from: m */
    public static Handler f415m = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public ImageView f416a;

    /* JADX INFO: renamed from: b */
    public TextView f417b;

    /* JADX INFO: renamed from: c */
    public ImageView f418c;

    /* JADX INFO: renamed from: d */
    public ProgressBar f419d;

    /* JADX INFO: renamed from: e */
    public WebView f420e;

    /* JADX INFO: renamed from: f */
    public final e f421f;

    /* JADX INFO: renamed from: g */
    public f f422g;

    /* JADX INFO: renamed from: h */
    public g f423h;

    /* JADX INFO: renamed from: i */
    public h f424i;

    /* JADX INFO: renamed from: j */
    public final C0233a f425j;

    /* JADX INFO: renamed from: k */
    public View.OnClickListener f426k;

    /* JADX INFO: renamed from: l */
    public final float f427l;

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$a */
    /* JADX INFO: compiled from: N673 */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: N673 */
        public class RunnableC2409a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ View f429a;

            public RunnableC2409a(View view) {
                this.f429a = view;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f429a.setEnabled(true);
            }
        }

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h hVar = C0095e.this.f424i;
            if (hVar != null) {
                view.setEnabled(false);
                C0095e.f415m.postDelayed(new RunnableC2409a(view), 256L);
                if (view == C0095e.this.f416a) {
                    hVar.mo509a(C0095e.this);
                } else if (view == C0095e.this.f418c) {
                    hVar.mo517b(C0095e.this);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$b */
    /* JADX INFO: compiled from: N673 */
    public class b implements DownloadListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f431a;

        public b(Context context) {
            this.f431a = context;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setFlags(268435456);
                this.f431a.startActivity(intent);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$c */
    /* JADX INFO: compiled from: N673 */
    public class c extends WebChromeClient {
        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return C0095e.this.f422g.mo516a(C0095e.this, str, str2, str3, jsPromptResult);
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (!C0095e.this.f421f.f436b) {
                C0095e.this.f419d.setVisibility(8);
            } else {
                if (i > 90) {
                    C0095e.this.f419d.setVisibility(4);
                    return;
                }
                if (C0095e.this.f419d.getVisibility() == 4) {
                    C0095e.this.f419d.setVisibility(0);
                }
                C0095e.this.f419d.setProgress(i);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            C0095e.this.f422g.mo510a(C0095e.this, str);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$d */
    /* JADX INFO: compiled from: N673 */
    public class d extends WebViewClient {
        public d() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (C0095e.this.f423h.mo519b(C0095e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (C0095e.this.f423h.mo521c(C0095e.this, str)) {
                return;
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (C0095e.this.f423h.mo514a(C0095e.this, i, str, str2)) {
                return;
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (C0095e.this.f423h.mo515a(C0095e.this, sslErrorHandler, sslError)) {
                return;
            }
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            return C0095e.this.f423h.mo508a(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (C0095e.this.f423h.mo523d(C0095e.this, str)) {
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$e */
    /* JADX INFO: compiled from: N673 */
    public final class e {

        /* JADX INFO: renamed from: a */
        public boolean f435a;

        /* JADX INFO: renamed from: b */
        public boolean f436b;

        public e(boolean z, boolean z2) {
            this.f435a = z;
            this.f436b = z2;
        }
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$f */
    /* JADX INFO: compiled from: N673 */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo510a(C0095e c0095e, String str);

        /* JADX INFO: renamed from: a */
        boolean mo516a(C0095e c0095e, String str, String str2, String str3, JsPromptResult jsPromptResult);
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$g */
    /* JADX INFO: compiled from: N673 */
    public interface g {
        /* JADX INFO: renamed from: a */
        WebResourceResponse mo508a(WebView webView, String str);

        /* JADX INFO: renamed from: a */
        boolean mo514a(C0095e c0095e, int i, String str, String str2);

        /* JADX INFO: renamed from: a */
        boolean mo515a(C0095e c0095e, SslErrorHandler sslErrorHandler, SslError sslError);

        /* JADX INFO: renamed from: b */
        boolean mo519b(C0095e c0095e, String str);

        /* JADX INFO: renamed from: c */
        boolean mo521c(C0095e c0095e, String str);

        /* JADX INFO: renamed from: d */
        boolean mo523d(C0095e c0095e, String str);
    }

    /* JADX INFO: renamed from: com.alipay.sdk.m.c0.e$h */
    /* JADX INFO: compiled from: N673 */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo509a(C0095e c0095e);

        /* JADX INFO: renamed from: b */
        void mo517b(C0095e c0095e);
    }

    public C0095e(Context context, C0233a c0233a, e eVar) {
        this(context, null, c0233a, eVar);
    }

    public ImageView getBackButton() {
        return this.f416a;
    }

    public ProgressBar getProgressbar() {
        return this.f419d;
    }

    public ImageView getRefreshButton() {
        return this.f418c;
    }

    public TextView getTitle() {
        return this.f417b;
    }

    public String getUrl() {
        return this.f420e.getUrl();
    }

    public WebView getWebView() {
        return this.f420e;
    }

    public void setChromeProxy(f fVar) {
        this.f422g = fVar;
        if (fVar == null) {
            this.f420e.setWebChromeClient(null);
        } else {
            this.f420e.setWebChromeClient(new c());
        }
    }

    public void setWebClientProxy(g gVar) {
        this.f423h = gVar;
        if (gVar == null) {
            this.f420e.setWebViewClient(null);
        } else {
            this.f420e.setWebViewClient(new d());
        }
    }

    public void setWebEventProxy(h hVar) {
        this.f424i = hVar;
    }

    public C0095e(Context context, AttributeSet attributeSet, C0233a c0233a, e eVar) {
        super(context, attributeSet);
        this.f426k = new a();
        this.f421f = eVar == null ? new e(false, false) : eVar;
        this.f425j = c0233a;
        this.f427l = context.getResources().getDisplayMetrics().density;
        setOrientation(1);
        m542a(context);
        m547b(context);
        m548c(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m547b(Context context) {
        ProgressBar progressBar = new ProgressBar(context, null, R.style.Widget.ProgressBar.Horizontal);
        this.f419d = progressBar;
        progressBar.setProgressDrawable(context.getResources().getDrawable(R.drawable.progress_horizontal));
        this.f419d.setMax(100);
        this.f419d.setBackgroundColor(-218103809);
        addView(this.f419d, new LinearLayout.LayoutParams(-1, m541a(2)));
    }

    /* JADX INFO: renamed from: c */
    public final void m548c(Context context) {
        WebView webView = new WebView(context);
        this.f420e = webView;
        webView.setVerticalScrollbarOverlay(true);
        m543a(this.f420e, context);
        WebSettings settings = this.f420e.getSettings();
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setSupportMultipleWindows(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccess(false);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptEnabled(true);
        settings.setSavePassword(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setCacheMode(1);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(false);
        this.f420e.setVerticalScrollbarOverlay(true);
        if (C0180b.m829i().m852f(this.f425j)) {
            WebView webView2 = this.f420e;
            webView2.addJavascriptInterface(new C0087a(context, webView2, this.f425j), "AlipayChinaMobileBridge");
        }
        this.f420e.setDownloadListener(new b(context));
        try {
            try {
                this.f420e.removeJavascriptInterface("searchBoxJavaBridge_");
                this.f420e.removeJavascriptInterface("accessibility");
                this.f420e.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable unused) {
            }
        } catch (Exception unused2) {
            Method method = this.f420e.getClass().getMethod("removeJavascriptInterface", null);
            if (method != null) {
                method.invoke(this.f420e, "searchBoxJavaBridge_");
                method.invoke(this.f420e, "accessibility");
                method.invoke(this.f420e, "accessibilityTraversal");
            }
        }
        AbstractC0093c.m499a(this.f420e);
        addView(this.f420e, new LinearLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: a */
    public final void m542a(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setBackgroundColor(-218103809);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setVisibility(this.f421f.f435a ? 0 : 8);
        ImageView imageView = new ImageView(context);
        this.f416a = imageView;
        imageView.setOnClickListener(this.f426k);
        ImageView imageView2 = this.f416a;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.f416a.setImageDrawable(C0251n.m1232a(C0251n.f1203a, context));
        this.f416a.setPadding(m541a(12), 0, m541a(12), 0);
        linearLayout.addView(this.f416a, new LinearLayout.LayoutParams(-2, -2));
        View view = new View(context);
        view.setBackgroundColor(-2500135);
        linearLayout.addView(view, new LinearLayout.LayoutParams(m541a(1), m541a(25)));
        TextView textView = new TextView(context);
        this.f417b = textView;
        textView.setTextColor(-15658735);
        this.f417b.setTextSize(17.0f);
        this.f417b.setMaxLines(1);
        this.f417b.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(m541a(17), 0, 0, 0);
        layoutParams.weight = 1.0f;
        linearLayout.addView(this.f417b, layoutParams);
        ImageView imageView3 = new ImageView(context);
        this.f418c = imageView3;
        imageView3.setOnClickListener(this.f426k);
        this.f418c.setScaleType(scaleType);
        this.f418c.setImageDrawable(C0251n.m1232a(C0251n.f1204b, context));
        this.f418c.setPadding(m541a(12), 0, m541a(12), 0);
        linearLayout.addView(this.f418c, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(-1, m541a(48)));
    }

    /* JADX INFO: renamed from: b */
    public void m546b() {
        removeAllViews();
        this.f420e.removeAllViews();
        this.f420e.setWebViewClient(null);
        this.f420e.setWebChromeClient(null);
        this.f420e.destroy();
    }

    /* JADX INFO: renamed from: a */
    public void m543a(WebView webView, Context context) {
        String userAgentString = webView.getSettings().getUserAgentString();
        WebSettings settings = webView.getSettings();
        StringBuilder sbM17248 = C7470.m17248(userAgentString);
        sbM17248.append(C0254q.m1297g(context));
        settings.setUserAgentString(sbM17248.toString());
    }

    /* JADX INFO: renamed from: a */
    public void m544a(String str) {
        this.f420e.loadUrl(str);
        AbstractC0093c.m499a(this.f420e);
    }

    /* JADX INFO: renamed from: a */
    public void m545a(String str, byte[] bArr) {
        this.f420e.postUrl(str, bArr);
    }

    /* JADX INFO: renamed from: a */
    public final int m541a(int i) {
        return (int) (i * this.f427l);
    }
}
