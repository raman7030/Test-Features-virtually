package p067l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import bin.p000mt.plus.R;
import bin.p000mt.plus.ShortcutActivity;
import com.alipay.sdk.p010m.p037n.C0170a;
import com.alipay.sdk.p010m.p037n.C0171b;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0249l;
import com.alipay.sdk.p010m.p058y.C0254q;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.֨ۚ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes3.dex */
public final class ActivityC3244 extends AbstractActivityC5549 {

    /* JADX INFO: renamed from: ֫ܽ */
    public static final C20680 f6287;

    /* JADX INFO: renamed from: ۟ۧ */
    public static final int f6288;

    /* JADX INFO: renamed from: ۧܽ */
    public static final ConcurrentMapC12768 f6289;

    /* JADX INFO: renamed from: ܰۧ */
    public static final int f6290;

    /* JADX INFO: renamed from: ܽܽ */
    public static final int[] f6291;

    /* JADX INFO: renamed from: ᩺ۧ */
    public static final C20680 f6292;

    /* JADX INFO: renamed from: ֡ۧ */
    public C2573 f6293;

    /* JADX INFO: renamed from: ֨ۧ */
    public boolean f6294;

    /* JADX INFO: renamed from: ۖۧ */
    public Bundle f6295;

    /* JADX INFO: renamed from: ۗۧ */
    public MenuItem f6296;

    /* JADX INFO: renamed from: ۘۧ */
    public C20009 f6297;

    /* JADX INFO: renamed from: ۙۧ */
    public String f6298;

    /* JADX INFO: renamed from: ۜۧ */
    public ViewOnTouchListenerC21350 f6301;

    /* JADX INFO: renamed from: ۠ۧ */
    public View f6302;

    /* JADX INFO: renamed from: ۡۧ */
    public boolean f6303;

    /* JADX INFO: renamed from: ۢۧ */
    public C16310 f6304;

    /* JADX INFO: renamed from: ۤۧ */
    public FrameLayout f6305;

    /* JADX INFO: renamed from: ۨۧ */
    public TextView f6306;

    /* JADX INFO: renamed from: ۫ۧ */
    public FrameLayout f6307;

    /* JADX INFO: renamed from: ۬ۧ */
    public WebView f6308;

    /* JADX INFO: renamed from: ܳۧ */
    public MenuItem f6309;

    /* JADX INFO: renamed from: ܶۧ */
    public ProgressBar f6310;

    /* JADX INFO: renamed from: ܺۧ */
    public C5582 f6311;

    /* JADX INFO: renamed from: ܿۧ */
    public MenuItem f6312;

    /* JADX INFO: renamed from: ᩳۧ */
    public C3294 f6313;

    /* JADX INFO: renamed from: ᩴۧ */
    public C1898 f6314;

    /* JADX INFO: renamed from: ᩶ۧ */
    public C7268 f6316;

    /* JADX INFO: renamed from: ᩷ۧ */
    public MenuItem f6317;

    /* JADX INFO: renamed from: ᩸ۧ */
    public MenuItem f6318;

    /* JADX INFO: renamed from: ᩹ۧ */
    public C4912 f6319;

    /* JADX INFO: renamed from: ᩻ۧ */
    public boolean f6320;

    /* JADX INFO: renamed from: ۛۧ */
    public int f6300 = 100;

    /* JADX INFO: renamed from: ᩵ۧ */
    public volatile C20680 f6315 = f6292;

    /* JADX INFO: renamed from: ۚۧ */
    public final Object f6299 = new Object();

    @Override // p067l.AbstractActivityC5549
    /* JADX INFO: renamed from: ۚ */
    public final String mo119() {
        return "HtmlPreviewActivity";
    }

    static {
        int[] iArr = {25, 33, 50, 67, 75, 80, 90, 100, UMErrorCode.E_UM_BE_JSON_FAILED, C0254q.f1218h, 150, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 200, 250, 300, 400, 500};
        f6291 = iArr;
        f6288 = iArr[0];
        f6290 = iArr[16];
        f6289 = new ConcurrentMapC12768();
        f6292 = new C20680(false, null);
        f6287 = new C20680(true, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5613(C18107 c18107, final InterfaceC19370 interfaceC19370, C20335 c20335, String str, final RunnableC12308 runnableC12308) {
        m5611(c18107.m41282(), c18107.m41289(), interfaceC19370, c20335, str, C20335.m45896(c18107), new Runnable() { // from class: l.ۜۚ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C20680 c20680 = ActivityC3244.f6292;
                C11245.m26044(interfaceC19370, 2000);
                runnableC12308.run();
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5602(ShortcutActivity shortcutActivity, String str) {
        AbstractC17043 abstractC17043M42109 = C18524.m42109(str, new String[0]);
        if (!abstractC17043M42109.mo25093()) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        C4744 c4744 = C4744.f10749;
        InterfaceC19370 interfaceC19370Mo9709 = c4744.mo9709(abstractC17043M42109.mo25505());
        if (interfaceC19370Mo9709 == null) {
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        final C20335 c20335M45898 = C20335.m45898(abstractC17043M42109.mo25505());
        final C3570 c3570 = new C3570(C7050.f18359);
        final String strM6567 = c3570.m6567(c20335M45898);
        m5611(shortcutActivity, c4744, interfaceC19370Mo9709, c20335M45898, strM6567, Collections.EMPTY_LIST, new Runnable() { // from class: l.᩷ۚ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C20680 c20680 = ActivityC3244.f6292;
                c3570.m6568(c20335M45898, strM6567, false);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5597(Activity activity, String str, String str2, boolean z, AbstractC17043 abstractC17043) {
        m5598(activity, str, str2, z, abstractC17043, -1);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5596(Activity activity, String str, String str2, AbstractC17043 abstractC17043, int i) {
        m5598(activity, str, str2, false, abstractC17043, Math.max(0, i));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:11:0x001c, B:14:0x0023, B:26:0x003e, B:28:0x0056, B:30:0x0062, B:32:0x006e, B:34:0x0085, B:38:0x0095, B:40:0x009b, B:42:0x00b3, B:43:0x00ba, B:35:0x008a, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:11:0x001c, B:14:0x0023, B:26:0x003e, B:28:0x0056, B:30:0x0062, B:32:0x006e, B:34:0x0085, B:38:0x0095, B:40:0x009b, B:42:0x00b3, B:43:0x00ba, B:35:0x008a, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:46:0x000a }] */
    /* JADX INFO: renamed from: ֫ */
    public static void m5598(Activity activity, String str, String str2, boolean z, AbstractC17043 abstractC17043, int i) {
        AbstractC17043 abstractC17043M42109;
        String strM45903;
        String name;
        String str3;
        String strM20653;
        Runnable runnable = null;
        if (str == null) {
            abstractC17043M42109 = null;
        } else {
            try {
                abstractC17043M42109 = C18524.m42109(str, new String[0]);
            } catch (RuntimeException unused) {
                abstractC17043.mo25503();
                C22682.m50793(R.string.MT_Protector);
                return;
            }
        }
        String parent = abstractC17043M42109 == null ? null : abstractC17043M42109.getParent();
        String str4 = "/";
        if (parent == null || !parent.startsWith("/")) {
            parent = null;
        } else if (!parent.endsWith("/")) {
            parent = parent.concat("/");
        }
        boolean z2 = parent != null;
        if (z2) {
            if (z || i >= 0) {
                name = abstractC17043M42109.getName();
                str3 = parent;
            } else {
                final C20335 c20335M45898 = C20335.m45898(abstractC17043M42109.mo25505());
                String strM45902 = c20335M45898.m45902();
                if (C18524.m42115(strM45902, C17853.f53278.mo25505()) || C18524.m42115(strM45902, C17853.f53283.mo25505()) || C18524.m42115(strM45902, C17853.f53277.mo25505())) {
                    str4 = strM45902;
                } else {
                    final C3570 c3570 = new C3570(C7050.f18359);
                    final String strM6567 = c3570.m6567(c20335M45898);
                    str4 = strM6567;
                    runnable = new Runnable() { // from class: l.ܰ֡᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C20680 c20680 = ActivityC3244.f6292;
                            c3570.m6568(c20335M45898, strM6567, false);
                        }
                    };
                }
                strM45903 = c20335M45898.m45903(str4);
            }
            strM20653 = C8935.m20653(str3, name);
            if (strM20653 != null) {
                throw new IllegalArgumentException("Invalid HTML preview path");
            }
            C7268 c7268 = new C7268(C4744.f10749, str3, name, strM20653, str2, true, z, abstractC17043, z2);
            c7268.f18946 = i;
            m5599(activity, c7268, runnable);
        }
        strM45903 = "index.html";
        name = strM45903;
        str3 = str4;
        strM20653 = C8935.m20653(str3, name);
        if (strM20653 != null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        C7268 c7269 = new C7268(C4744.f10749, str3, name, strM20653, str2, true, z, abstractC17043, z2);
        c7269.f18946 = i;
        m5599(activity, c7269, runnable);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5611(ActivityC4388 activityC4388, AbstractC15599 abstractC15599, InterfaceC19370 interfaceC19370, C20335 c20335, String str, List list, Runnable runnable) {
        Object obj;
        AbstractC15599 abstractC15599M30905;
        boolean zEquals = "local".equals(abstractC15599.mo9725());
        if (!(abstractC15599 instanceof C4744) && !(abstractC15599 instanceof AbstractC5375) && !(abstractC15599 instanceof C20661) && !(abstractC15599 instanceof C19121) && !(abstractC15599 instanceof C4598)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC18422.m41967(((Long) it.next()).longValue());
            }
            C22682.m50793(R.string.MT_Protector);
            return;
        }
        AbstractC15599 abstractC155910 = null;
        try {
            if (zEquals) {
                abstractC15599M30905 = C4744.f10749;
            } else {
                abstractC15599M30905 = C13589.m30905(abstractC15599.m35469(), true);
            }
            abstractC155910 = abstractC15599M30905;
            String strM45903 = c20335.m45903(str);
            String strM20653 = C8935.m20653(str, strM45903);
            try {
                if (strM20653 == null) {
                    throw new IllegalArgumentException("Invalid HTML preview path");
                }
                C7268 c7268 = new C7268(abstractC155910, str, strM45903, strM20653, interfaceC19370.getName(), zEquals, "multipart/related".equals(C3590.m6593(interfaceC19370.getName())), null, true);
                c7268.f18951 = list;
                m5599(activityC4388, c7268, runnable);
                return;
            } catch (RuntimeException unused) {
                obj = abstractC155910;
            }
        } catch (RuntimeException unused2) {
            obj = abstractC155910;
        }
        if (obj instanceof AutoCloseable) {
            try {
                C7470.m17251((AutoCloseable) obj);
            } catch (Exception unused3) {
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC18422.m41967(((Long) it2.next()).longValue());
        }
        C22682.m50793(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5599(Activity activity, final C7268 c7268, Runnable runnable) {
        final String string = UUID.randomUUID().toString();
        ConcurrentMapC12768 concurrentMapC12768 = f6289;
        concurrentMapC12768.put(string, c7268);
        C7050.m16221().postDelayed(new Runnable() { // from class: l.᩺֡᩷
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC3244.m5612(c7268, string);
            }
        }, 60000L);
        Intent intent = new Intent(activity, (Class<?>) ActivityC3244.class);
        intent.putExtra("session_token", string);
        try {
            activity.startActivity(intent);
            if (runnable != null) {
                runnable.run();
            }
        } catch (RuntimeException unused) {
            if (concurrentMapC12768.remove(string, c7268)) {
                c7268.close();
            }
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5612(C7268 c7268, String str) {
        if (c7268.f18953 || !f6289.remove(str, c7268)) {
            return;
        }
        c7268.close();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC3069, p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri uriM20650;
        C20680 c20680;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("session_token");
        this.f6298 = stringExtra;
        C7268 c7268 = stringExtra == null ? null : (C7268) f6289.get(stringExtra);
        this.f6316 = c7268;
        if (c7268 == null) {
            C22682.m50793(R.string.MT_Protector);
            finish();
            return;
        }
        c7268.f18953 = true;
        boolean z = false;
        if (bundle != null) {
            this.f6295 = bundle.getBundle("markdown_scroll");
            this.f6300 = m5637(bundle.getInt("zoom_percent", 100));
            if (bundle.getBoolean("preview_resources_allowed")) {
                c20680 = f6287;
            } else {
                c20680 = new C20680(false, bundle.getString("source_label"));
            }
            this.f6315 = c20680;
        }
        m12277(R.layout.MT_Protector);
        C1326 c1326 = (C1326) m12277(R.id.MT_Protector);
        this.f13392 = c1326;
        m12263(c1326);
        m12268();
        this.f13392.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۢۚ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C20680 c20681 = ActivityC3244.f6292;
                this.f31459.finish();
            }
        });
        setTitle(this.f6316.f18945);
        this.f6310 = (ProgressBar) m12277(R.id.MT_Protector);
        this.f6302 = m12277(R.id.MT_Protector);
        View viewM12277 = m12277(R.id.MT_Protector);
        this.f6301 = new ViewOnTouchListenerC21350(viewM12277, ApplicationC21448.f67649);
        viewM12277.setOnClickListener(new ViewOnClickListenerC14916(this, 1));
        C1781.m45965(viewM12277, getString(R.string.MT_Protector));
        C1087.m16291(getWindow(), false);
        C1717.m43556(this.f6302, new C17206(this));
        this.f6319 = new C4912(this, this.f6316.f18941, this.f6316.f18948, this.f6316.f18950, this.f6316.f18944 ? null : this.f6316.f18955, this.f6316.f18947, this.f6316.f18954);
        if (this.f6316.f18946 >= 0) {
            this.f6311 = new C5582(getAssets());
        }
        C20730 c20730 = new C20730();
        c20730.m46810(this.f6316.f18943);
        c20730.m46811(this.f6319);
        this.f6313 = c20730.m46809();
        C17325 c17325 = new C17325(this, this);
        this.f6308 = c17325;
        c17325.setOnTouchListener(this.f6301);
        int iRgb = -1;
        ((FrameLayout) m12277(R.id.MT_Protector)).addView(this.f6308, new FrameLayout.LayoutParams(-1, -1));
        this.f6308.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۡۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC3244.m5604(this.f29389, i, i3, i5, i7);
            }
        });
        WebView webView = this.f6308;
        if (this.f6316.f18946 < 0) {
            this.f6304 = new C16310(webView);
        } else {
            C20009 c20009 = new C20009(this.f6316);
            this.f6297 = c20009;
            webView.addJavascriptInterface(c20009, "__mtMarkdownState");
        }
        if (this.f6316.f18946 >= 0 && C22553.m50539(this)) {
            iRgb = Color.rgb(13, 17, 23);
        }
        webView.setBackgroundColor(iRgb);
        m5601(webView, C22553.m50539(this));
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(this.f6316.f18944);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1 ^ (this.f6315.f63871 ? 1 : 0));
        webView.setWebViewClient(new C4586(this));
        webView.setWebChromeClient(new C5927(this));
        webView.setDownloadListener(new C13165());
        if (bundle != null && bundle.getBoolean("fullscreen")) {
            z = true;
        }
        m5625(z);
        if (this.f6316.f18944) {
            if (this.f6316.f18955 == null) {
                uriM20650 = C6943.m15908(this.f6316.f18952, this, this.f6316.f18941, this.f6316.f18947, this.f6316.f18950);
            } else {
                uriM20650 = C6943.m15909(this.f6316.f18952, this, this.f6316.f18955);
            }
        } else {
            uriM20650 = C8935.m20650(this.f6316.f18943, this.f6316.f18942);
        }
        Bundle bundle2 = bundle == null ? null : bundle.getBundle("web_view");
        WebBackForwardList webBackForwardListRestoreState = bundle2 == null ? null : this.f6308.restoreState(bundle2);
        if (webBackForwardListRestoreState == null) {
            m5600(uriM20650);
            this.f6308.loadUrl(uriM20650.toString());
        } else {
            WebHistoryItem currentItem = webBackForwardListRestoreState.getCurrentItem();
            String url = currentItem == null ? null : currentItem.getUrl();
            m5600(url != null ? Uri.parse(url) : null);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5604(ActivityC3244 activityC3244, int i, int i2, int i3, int i4) {
        if (i2 - i != i4 - i3) {
            activityC3244.m5643();
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m5601(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        if (C15268.m34736("ALGORITHMIC_DARKENING")) {
            C20059.m45419(settings);
        }
        if (C15268.m34736("FORCE_DARK") && C15268.m34736("FORCE_DARK_STRATEGY")) {
            C20059.m45420(settings);
            C20059.m45418(settings, z ? 2 : 0);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static void m5639(ActivityC3244 activityC3244, Uri uri) {
        C7268 c7268;
        if (!activityC3244.f6303 || activityC3244.isFinishing() || activityC3244.isDestroyed() || (c7268 = activityC3244.f6316) == null || !(c7268.f18941 instanceof AbstractC5375)) {
            return;
        }
        if (C8935.m20652(uri, activityC3244.f6316.f18943) || C6943.m15911(uri, activityC3244.f6316.f18952)) {
            C22682.m50793(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5600(Uri uri) {
        m5614(m5593(uri, this.f6316.f18943, this.f6316.f18944 ? this.f6316.f18952 : null, this.f6315));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: ֫ */
    public static void m5607(ActivityC3244 activityC3244, WebView webView, String str) {
        Uri uri;
        String url = webView.getUrl();
        if (str == null || !str.equals(url)) {
            uri = null;
        } else {
            uri = Uri.parse(str);
            if (uri.getScheme() == null) {
                uri = null;
            }
        }
        if (uri != null) {
            activityC3244.m5600(uri);
            if (activityC3244.f6315.f63871) {
                String string = uri.buildUpon().fragment(null).build().toString();
                synchronized (activityC3244.f6299) {
                    C2573 c2573 = activityC3244.f6293;
                    if (c2573 != null && c2573.f4251.equals(string)) {
                        activityC3244.f6293 = null;
                        boolean zM3873 = c2573.m3873(string);
                        if (zM3873) {
                            webView.reload();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m5631(Uri uri) {
        C20680 c20680 = this.f6315;
        C20680 c20680M5593 = m5593(uri, this.f6316.f18943, this.f6316.f18944 ? this.f6316.f18952 : null, c20680);
        if (uri == null || c20680.f63871 || !c20680M5593.f63871) {
            if (!c20680M5593.f63871 || c20680.f63871) {
                m5619();
                return;
            }
            return;
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        synchronized (this.f6299) {
            C2573 c2573 = this.f6293;
            if (c2573 == null || !c2573.f4251.equals(string)) {
                this.f6293 = new C2573(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟ */
    public void m5619() {
        synchronized (this.f6299) {
            this.f6293 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m5624(ActivityC3244 activityC3244, Uri uri) {
        C20680 c20680M5593 = m5593(uri, activityC3244.f6316.f18943, activityC3244.f6316.f18944 ? activityC3244.f6316.f18952 : null, activityC3244.f6315);
        if (!activityC3244.f6294 || c20680M5593.f63871) {
            return;
        }
        activityC3244.m5614(c20680M5593);
    }

    /* JADX INFO: renamed from: ֫ */
    private void m5614(C20680 c20680) {
        C7268 c7268;
        boolean z = this.f6294;
        boolean z2 = c20680.f63871;
        boolean z3 = z2 && !z;
        this.f6294 = z2;
        this.f6315 = c20680;
        WebView webView = this.f6308;
        if (webView != null) {
            webView.getSettings().setMixedContentMode(!c20680.f63871 ? 1 : 0);
        }
        C1326 c1326 = this.f13392;
        if (c1326 != null) {
            c1326.setSubtitle(c20680.f63872);
        }
        if (!z3 || (c7268 = this.f6316) == null) {
            return;
        }
        setTitle(c7268.f18945);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: ۧ */
    public static String m5622(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase(C0170a.f680s) || scheme.equalsIgnoreCase(C0171b.f688a))) {
            String encodedAuthority = uri.getEncodedAuthority();
            if (encodedAuthority != null) {
                int iLastIndexOf = encodedAuthority.lastIndexOf(64);
                if (iLastIndexOf >= 0) {
                    encodedAuthority = encodedAuthority.substring(iLastIndexOf + 1);
                }
                if (encodedAuthority.isEmpty()) {
                    encodedAuthority = null;
                }
            } else {
                encodedAuthority = null;
            }
            if (encodedAuthority != null) {
                return scheme.toLowerCase(Locale.ROOT) + "://" + encodedAuthority;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static C20680 m5593(Uri uri, String str, String str2, C20680 c20680) {
        String strM5622;
        boolean zM20652 = C8935.m20652(uri, str);
        C20680 c20681 = f6287;
        if (zM20652 || C6943.m15911(uri, str2)) {
            return c20681;
        }
        String scheme = uri == null ? null : uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals(C0170a.f680s) || lowerCase.equals(C0171b.f688a)) {
                String strM5623 = m5622(uri);
                if (strM5623 == null) {
                    return f6292;
                }
                return new C20680(false, strM5623);
            }
            if (lowerCase.equals("blob")) {
                Uri uri2 = Uri.parse(uri.toString().substring(scheme.length() + 1));
                if (C8935.m20652(uri2, str)) {
                    return c20681;
                }
                String scheme2 = uri2.getScheme();
                if (scheme2 != null && ((scheme2.equalsIgnoreCase(C0170a.f680s) || scheme2.equalsIgnoreCase(C0171b.f688a)) && (strM5622 = m5622(uri2)) != null)) {
                    return new C20680(false, strM5622);
                }
                return new C20680(false, "blob:");
            }
            if (lowerCase.equals(AbstractC0213e.f989m) || lowerCase.equals("about")) {
                return new C20680(false, lowerCase.concat(":"));
            }
        }
        return c20680;
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m5592(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ */
    public static String m5630(ActivityC3244 activityC3244, String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() != null) {
                C20680 c20680M5593 = m5593(uri, activityC3244.f6316.f18943, activityC3244.f6316.f18944 ? activityC3244.f6316.f18952 : null, activityC3244.f6315);
                return c20680M5593.f63871 ? activityC3244.f6316.f18945 : c20680M5593.f63872;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static WebResourceResponse m5591(ActivityC3244 activityC3244, WebResourceRequest webResourceRequest) {
        boolean z;
        boolean zEqualsIgnoreCase;
        WebResourceResponse webResourceResponseM5743;
        C5582 c5582;
        Uri url = webResourceRequest.getUrl();
        String method = webResourceRequest.getMethod();
        if (webResourceRequest.isForMainFrame()) {
            activityC3244.m5631(url);
            C20680 c20680 = activityC3244.f6315;
            C20680 c20680M5593 = m5593(url, activityC3244.f6316.f18943, activityC3244.f6316.f18944 ? activityC3244.f6316.f18952 : null, c20680);
            if (!c20680.f63871 || c20680M5593.f63871) {
                c20680M5593 = c20680;
            }
            if (c20680M5593 != c20680) {
                activityC3244.f6315 = c20680M5593;
            }
        }
        if (C8935.m20652(url, activityC3244.f6316.f18943)) {
            synchronized (activityC3244.f6299) {
                boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                C20680 c20681 = activityC3244.f6315;
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String str = activityC3244.f6316.f18943;
                C2573 c2573 = activityC3244.f6293;
                z = false;
                if (!zIsForMainFrame && !c20681.f63871) {
                    String strM5592 = m5592("Sec-Fetch-Site", requestHeaders);
                    if (strM5592 != null) {
                        zEqualsIgnoreCase = "same-origin".equalsIgnoreCase(strM5592);
                    } else {
                        String strM5593 = m5592("Referer", requestHeaders);
                        zEqualsIgnoreCase = strM5593 != null && C8935.m20652(Uri.parse(strM5593), str);
                    }
                }
                if (!zEqualsIgnoreCase) {
                    if (c2573 != null) {
                        if (m5592("Sec-Fetch-Site", requestHeaders) == null && m5592("Referer", requestHeaders) == null) {
                            z = true;
                        }
                        if (z) {
                            c2573.m3872();
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                return C4912.m10429(403, "Forbidden");
            }
            if (!"GET".equalsIgnoreCase(method)) {
                return C4912.m10429(405, "Method Not Allowed");
            }
            if (activityC3244.f6316.f18946 >= 0 && url.getPath() != null && url.getPath().startsWith("/_mt_markdown_vendor_/")) {
                if (!webResourceRequest.isForMainFrame() && (c5582 = activityC3244.f6311) != null) {
                    return c5582.m12351(url.getPath());
                }
                return C4912.m10429(404, "Not Found");
            }
            if (webResourceRequest.isForMainFrame() && (activityC3244.f6316.f18941 instanceof AbstractC5375) && url.getPath() != null) {
                webResourceResponseM5743 = activityC3244.f6319.m10433(url.getPath());
            } else {
                webResourceResponseM5743 = activityC3244.f6313.m5743(url);
            }
            return webResourceResponseM5743 == null ? C4912.m10429(404, "Not Found") : webResourceResponseM5743;
        }
        if (activityC3244.f6316.f18944 && C6943.m15911(url, activityC3244.f6316.f18952)) {
            if (webResourceRequest.isForMainFrame() && "GET".equalsIgnoreCase(method) && (activityC3244.f6316.f18941 instanceof AbstractC5375)) {
                C6943.m15912(activityC3244.f6316.f18952);
            }
            if (!webResourceRequest.isForMainFrame() || !"GET".equalsIgnoreCase(method)) {
                return C4912.m10429(403, "Forbidden");
            }
        } else {
            String scheme = url.getScheme();
            if ("content".equalsIgnoreCase(scheme) || "file".equalsIgnoreCase(scheme)) {
                return C4912.m10429(403, "Forbidden");
            }
            if (webResourceRequest.isForMainFrame() && activityC3244.m5640(url)) {
                return C4912.m10429(403, "Forbidden");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m5640(Uri uri) {
        String str = this.f6316.f18943;
        String str2 = null;
        String str3 = this.f6316.f18944 ? this.f6316.f18952 : null;
        if (C8935.m20652(uri, str) || C6943.m15911(uri, str3)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals("about") || lowerCase.equals(AbstractC0213e.f989m) || lowerCase.equals("blob") || lowerCase.equals("javascript") || lowerCase.equals("cid")) {
                return false;
            }
            if (lowerCase.equals(C0170a.f680s) || lowerCase.equals(C0171b.f688a)) {
                String encodedAuthority = uri.getEncodedAuthority();
                if (encodedAuthority != null) {
                    int iLastIndexOf = encodedAuthority.lastIndexOf(64);
                    if (iLastIndexOf >= 0) {
                        encodedAuthority = encodedAuthority.substring(iLastIndexOf + 1);
                    }
                    if (!encodedAuthority.isEmpty()) {
                        str2 = encodedAuthority;
                    }
                }
                if (str2 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ C1914 m5594(ActivityC3244 activityC3244, View view, C1914 c1914) {
        C1388 c1388M51163 = c1914.m51163((activityC3244.f6320 ? 0 : 7) | 128);
        view.setPadding(c1388M51163.f36103, c1388M51163.f36105, c1388M51163.f36104, Math.max(c1388M51163.f36102, c1914.m51163(8).f36102));
        activityC3244.f6301.m48372(c1914.m51163(7));
        return C1914.f72089;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ */
    public void m5625(boolean z) {
        this.f6320 = z;
        this.f13392.setVisibility(z ? 8 : 0);
        this.f6310.setVisibility((!this.f6303 || z) ? 8 : 0);
        this.f6301.m48373(z);
        m5627();
        C1717.m43585(this.f6302);
    }

    /* JADX INFO: renamed from: ۨ */
    private void m5627() {
        C1459 c1459M12280 = m12280();
        if (this.f6320) {
            c1459M12280.m32667(2);
            c1459M12280.m32664(7);
        } else {
            c1459M12280.m32667(1);
            c1459M12280.m32669(7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f6320) {
            m5627();
        }
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC4388, p067l.ActivityC0904, p067l.ActivityC2023, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        if (this.f6302 != null) {
            this.f6301.m48373(this.f6320);
            m5627();
            C1717.m43585(this.f6302);
        }
        WebView webView = this.f6308;
        if (webView != null) {
            m5632(webView.getUrl());
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f6312 = menu.findItem(R.id.MT_Protector);
        this.f6309 = menu.findItem(R.id.MT_Protector);
        m5617();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f6308 == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            if (this.f6308.canGoBack()) {
                this.f6308.goBack();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            if (this.f6308.canGoForward()) {
                this.f6308.goForward();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            View viewFindViewById = this.f13392.findViewById(R.id.MT_Protector);
            if (viewFindViewById != null) {
                C1898 c1898M48010 = C1828.m48010(viewFindViewById);
                C0994 c0994M50638 = c1898M48010.m50638();
                this.f6318 = c0994M50638.add(0, 1, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                this.f6296 = c0994M50638.add(0, 2, 1, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c0994M50638.add(0, 5, 2, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                if (this.f6316.f18946 < 0) {
                    this.f6317 = c0994M50638.add(0, 3, 3, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c0994M50638.add(0, 4, 4, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c1898M48010.m50640();
                c1898M48010.m50636(new C5564(4, this));
                c1898M48010.m50635(new C6320(this));
                Context context = viewFindViewById.getContext();
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof C1278) {
                    C1278 c1278 = (C1278) parent;
                    context = c1278.getContext();
                    int iM24651 = c1278.m24651();
                    if (iM24651 != 0) {
                        context = new C1473(context, iM24651);
                    }
                }
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null, false);
                this.f6305 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f6306 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
                this.f6307 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f6305.setOnClickListener(new ViewOnClickListenerC21623(4, this));
                this.f6307.setOnClickListener(new ViewOnClickListenerC20302(this, 2));
                this.f6314 = c1898M48010;
                m5617();
                C1828.m48011(c1898M48010, this.f6300 + "%", viewInflate);
            }
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5609(ActivityC3244 activityC3244, C1898 c1898) {
        if (activityC3244.f6314 == c1898) {
            activityC3244.f6314 = null;
            activityC3244.f6318 = null;
            activityC3244.f6296 = null;
            activityC3244.f6317 = null;
            activityC3244.f6305 = null;
            activityC3244.f6306 = null;
            activityC3244.f6307 = null;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m5616(ActivityC3244 activityC3244, MenuItem menuItem) {
        if (activityC3244.f6308 != null) {
            if (menuItem.getItemId() == 1) {
                activityC3244.f6308.reload();
                return true;
            }
            if (menuItem.getItemId() == 2) {
                activityC3244.m5619();
                activityC3244.f6308.stopLoading();
                if (activityC3244.f6316.f18941 instanceof AbstractC5375) {
                    activityC3244.f6319.m10432();
                    C6943.m15912(activityC3244.f6316.f18952);
                }
                activityC3244.m5595(100, false);
                return true;
            }
            if (menuItem.getItemId() == 5) {
                activityC3244.m5625(true);
                return true;
            }
            if (menuItem.getItemId() == 3) {
                if (activityC3244.m5628()) {
                    activityC3244.f6304.m37106(C22553.m50539(activityC3244));
                }
                return true;
            }
            if (menuItem.getItemId() == 4) {
                activityC3244.finish();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m5615(boolean z) {
        int i;
        if (this.f6308 == null) {
            return;
        }
        int i2 = this.f6300;
        int[] iArr = f6291;
        if (z) {
            int i3 = 0;
            while (true) {
                if (i3 < 17) {
                    i = iArr[i3];
                    if (i > i2) {
                        break;
                    } else {
                        i3++;
                    }
                } else {
                    i = f6290;
                    break;
                }
            }
        } else {
            int i4 = 16;
            while (true) {
                if (i4 >= 0) {
                    i = iArr[i4];
                    if (i < i2) {
                        break;
                    } else {
                        i4--;
                    }
                } else {
                    i = f6288;
                    break;
                }
            }
        }
        if (i == i2) {
            return;
        }
        m5636(i);
        m5643();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺ */
    public void m5643() {
        WebView webView = this.f6308;
        if (webView == null || webView.getWidth() <= 0) {
            return;
        }
        int iMax = Math.max(1, Math.round(this.f6308.getWidth() / this.f6308.getResources().getDisplayMetrics().density));
        WebView webView2 = this.f6308;
        StringBuilder sbM34408 = C15033.m34408(m5637(this.f6300), "(function(percent,hostWidth){var root=document.documentElement,head=document.head;if(!root||!head){return;}var key='__mt_html_preview_viewport_7d26a6c9__';var state=root[key];if(!state){if(percent===100){return;}var nodes=[],content='',metas=head.getElementsByTagName('meta');for(var i=0;i<metas.length;i++){if((metas[i].name||'').toLowerCase()==='viewport'){nodes.push(metas[i]);content=metas[i].getAttribute('content')||'';}}state={nodes:nodes,width:root.clientWidth||window.innerWidth||hostWidth,hostWidth:hostWidth,scale:window.visualViewport?window.visualViewport.scale:0,fluid:/width\\s*=\\s*device-width/i.test(content)||(!/width\\s*=/i.test(content)&&/initial-scale\\s*=/i.test(content))};if(!nodes.length){var meta=document.createElement('meta');meta.name='viewport';head.appendChild(meta);nodes.push(meta);}Object.defineProperty(root,key,{value:state,configurable:true});}var baseWidth=state.fluid?state.width*hostWidth/state.hostWidth:state.width;var width=Math.max(1,Math.round(baseWidth*100/percent));var scale=hostWidth/width;if(state.scale>0){scale*=state.scale*state.width/state.hostWidth;}var content='width='+width+',initial-scale='+scale+',minimum-scale='+Math.min(scale,0.1)+',maximum-scale='+Math.max(scale,10);for(var i=0;i<state.nodes.length;i++){state.nodes[i].setAttribute('content',content);}})(", ",");
        sbM34408.append(Math.max(1, iMax));
        sbM34408.append(");");
        webView2.evaluateJavascript(sbM34408.toString(), null);
    }

    /* JADX INFO: renamed from: ܿ */
    private void m5636(int i) {
        int iM5637 = m5637(i);
        this.f6300 = iM5637;
        TextView textView = this.f6306;
        if (textView != null) {
            textView.setText(iM5637 + "%");
        }
        FrameLayout frameLayout = this.f6305;
        if (frameLayout != null) {
            frameLayout.setEnabled(this.f6300 > f6288);
        }
        FrameLayout frameLayout2 = this.f6307;
        if (frameLayout2 != null) {
            frameLayout2.setEnabled(this.f6300 < f6290);
        }
    }

    /* JADX INFO: renamed from: ᩳ */
    public static int m5637(int i) {
        int iMin = Math.min(f6290, i);
        int i2 = f6288;
        int iMax = Math.max(i2, iMin);
        for (int i3 = 0; i3 < 17; i3++) {
            int i4 = f6291[i3];
            if (Math.abs(i4 - iMax) < Math.abs(i2 - iMax)) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // p067l.ActivityC2023, android.app.Activity
    public final void onBackPressed() {
        C16310 c16310 = this.f6304;
        if (c16310 == null || !c16310.m37107(new RunnableC9413(7, this))) {
            WebView webView = this.f6308;
            if (webView != null && webView.canGoBack()) {
                this.f6308.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m5623(ActivityC3244 activityC3244) {
        WebView webView = activityC3244.f6308;
        if (webView != null && webView.canGoBack()) {
            activityC3244.f6308.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫ */
    public void m5595(int i, boolean z) {
        this.f6303 = z;
        ProgressBar progressBar = this.f6310;
        if (progressBar != null) {
            progressBar.setProgress(i);
            this.f6310.setVisibility((!z || this.f6320) ? 8 : 0);
        }
        m5617();
    }

    /* JADX INFO: renamed from: ֫֫ */
    private void m5617() {
        MenuItem menuItem = this.f6312;
        boolean z = false;
        if (menuItem != null) {
            WebView webView = this.f6308;
            menuItem.setEnabled(webView != null && webView.canGoBack());
        }
        MenuItem menuItem2 = this.f6309;
        if (menuItem2 != null) {
            WebView webView2 = this.f6308;
            if (webView2 != null && webView2.canGoForward()) {
                z = true;
            }
            menuItem2.setEnabled(z);
        }
        MenuItem menuItem3 = this.f6318;
        if (menuItem3 != null) {
            menuItem3.setVisible(!this.f6303);
        }
        MenuItem menuItem4 = this.f6296;
        if (menuItem4 != null) {
            menuItem4.setVisible(this.f6303);
        }
        MenuItem menuItem5 = this.f6317;
        if (menuItem5 != null) {
            menuItem5.setEnabled(m5628());
        }
        m5636(this.f6300);
    }

    /* JADX INFO: renamed from: ܰ */
    private boolean m5628() {
        C7268 c7268;
        WebView webView = this.f6308;
        String url = webView == null ? null : webView.getUrl();
        return (url == null || (c7268 = this.f6316) == null || c7268.f18946 >= 0 || C6943.m15911(Uri.parse(url), this.f6316.f18952)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ */
    public void m5632(String str) {
        String str2;
        if (this.f6308 == null || !m5641(str)) {
            return;
        }
        boolean zM50539 = C22553.m50539(this);
        this.f6308.setBackgroundColor(zM50539 ? Color.rgb(13, 17, 23) : -1);
        m5601(this.f6308, zM50539);
        String string = C8935.m20650(this.f6316.f18943, this.f6316.f18942).toString();
        final Bundle bundle = this.f6295;
        if (bundle == null) {
            str2 = "null";
        } else {
            str2 = "{x:" + bundle.getFloat("x") + ",y:" + bundle.getFloat("y") + C0249l.f1198d;
        }
        String str3 = this.f6316.f18949;
        String strQuote = str3 != null ? JSONObject.quote(str3) : "null";
        this.f6308.evaluateJavascript("(function(){if(location.href.split('#')[0]!==" + JSONObject.quote(string) + "||!window.__mtMarkdownPreview)return false;window.__mtMarkdownPreview.apply(" + zM50539 + "," + this.f6316.f18946 + "," + str2 + "," + strQuote + ",function(state){window.__mtMarkdownState.save(" + JSONObject.quote(this.f6297.f60827) + ",state);});return true;})()", new ValueCallback() { // from class: l.ܳۚ᩷
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ActivityC3244.m5606(this.f46304, bundle, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m5606(ActivityC3244 activityC3244, Bundle bundle, String str) {
        if ("true".equals(str) && activityC3244.f6295 == bundle) {
            activityC3244.f6295 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ */
    public boolean m5641(String str) {
        C7268 c7268 = this.f6316;
        return c7268 != null && c7268.f18946 >= 0 && str != null && Uri.parse(str).buildUpon().fragment(null).build().equals(C8935.m20650(this.f6316.f18943, this.f6316.f18942));
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onPause() {
        WebView webView = this.f6308;
        if (webView != null) {
            webView.onPause();
        }
        ViewOnTouchListenerC21350 viewOnTouchListenerC21350 = this.f6301;
        if (viewOnTouchListenerC21350 != null) {
            viewOnTouchListenerC21350.m48373(false);
        }
        super.onPause();
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC3069, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC21350 viewOnTouchListenerC21350 = this.f6301;
        if (viewOnTouchListenerC21350 != null) {
            viewOnTouchListenerC21350.m48373(this.f6320);
        }
        WebView webView = this.f6308;
        if (webView != null) {
            webView.onResume();
            m5632(this.f6308.getUrl());
        }
    }

    @Override // p067l.ActivityC2023, p067l.ActivityC1086, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f6308 != null) {
            Bundle bundle2 = new Bundle();
            this.f6308.saveState(bundle2);
            bundle.putBundle("web_view", bundle2);
            if (m5641(this.f6308.getUrl())) {
                Bundle bundle3 = new Bundle();
                float fMax = Math.max(0.01f, this.f6308.getScale());
                bundle3.putFloat("x", this.f6308.getScrollX() / fMax);
                bundle3.putFloat("y", this.f6308.getScrollY() / fMax);
                bundle.putBundle("markdown_scroll", bundle3);
            }
        }
        C20680 c20680 = this.f6315;
        bundle.putBoolean("preview_resources_allowed", c20680.f63871);
        bundle.putString("source_label", c20680.f63872);
        bundle.putInt("zoom_percent", this.f6300);
        bundle.putBoolean("fullscreen", this.f6320);
        super.onSaveInstanceState(bundle);
    }

    @Override // p067l.AbstractActivityC5549, p067l.ActivityC0904, p067l.ActivityC3069, android.app.Activity
    public final void onDestroy() {
        C7268 c7268;
        ViewOnTouchListenerC21350 viewOnTouchListenerC21350 = this.f6301;
        if (viewOnTouchListenerC21350 != null) {
            viewOnTouchListenerC21350.m48373(false);
        }
        C16310 c16310 = this.f6304;
        if (c16310 != null) {
            c16310.m37105();
        }
        C20009 c20009 = this.f6297;
        if (c20009 != null) {
            C20009.m45380(c20009);
            WebView webView = this.f6308;
            if (webView != null) {
                webView.removeJavascriptInterface("__mtMarkdownState");
            }
        }
        C1898 c1898 = this.f6314;
        if (c1898 != null) {
            c1898.m50633();
            this.f6314 = null;
        }
        C7268 c7269 = this.f6316;
        C6943.m15913(c7269 == null ? null : c7269.f18952);
        m5619();
        WebView webView2 = this.f6308;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        C4912 c4912 = this.f6319;
        if (c4912 != null) {
            c4912.close();
            this.f6319 = null;
        }
        WebView webView3 = this.f6308;
        if (webView3 != null) {
            webView3.setWebChromeClient(null);
            this.f6308.setWebViewClient(new WebViewClient());
            this.f6308.clearHistory();
            ViewGroup viewGroup = (ViewGroup) this.f6308.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f6308);
            }
            this.f6308.destroy();
            this.f6308 = null;
        }
        if (!isChangingConfigurations() && (c7268 = this.f6316) != null) {
            f6289.remove(this.f6298, c7268);
            this.f6316.close();
            this.f6316 = null;
        }
        super.onDestroy();
    }
}
