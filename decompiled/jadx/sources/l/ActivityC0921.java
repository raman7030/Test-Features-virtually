package l;

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
import bin.mt.plus.R;
import bin.mt.plus.ShortcutActivity;
import com.alipay.sdk.m.n.a;
import com.alipay.sdk.m.n.b;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.l;
import com.alipay.sdk.m.y.q;
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
public final class ActivityC0921 extends AbstractActivityC3346 {

    /* JADX INFO: renamed from: ֫ܽ, reason: not valid java name and contains not printable characters */
    public static final C19267 f3512;

    /* JADX INFO: renamed from: ۟ۧ, reason: not valid java name and contains not printable characters */
    public static final int f3513;

    /* JADX INFO: renamed from: ۧܽ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC10942 f3514;

    /* JADX INFO: renamed from: ܰۧ, reason: not valid java name and contains not printable characters */
    public static final int f3515;

    /* JADX INFO: renamed from: ܽܽ, reason: not valid java name and contains not printable characters */
    public static final int[] f3516;

    /* JADX INFO: renamed from: ᩺ۧ, reason: not valid java name and contains not printable characters */
    public static final C19267 f3517;

    /* JADX INFO: renamed from: ֡ۧ, reason: not valid java name and contains not printable characters */
    public C0215 f3518;

    /* JADX INFO: renamed from: ֨ۧ, reason: not valid java name and contains not printable characters */
    public boolean f3519;

    /* JADX INFO: renamed from: ۖۧ, reason: not valid java name and contains not printable characters */
    public Bundle f3520;

    /* JADX INFO: renamed from: ۗۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3521;

    /* JADX INFO: renamed from: ۘۧ, reason: not valid java name and contains not printable characters */
    public C18561 f3522;

    /* JADX INFO: renamed from: ۙۧ, reason: not valid java name and contains not printable characters */
    public String f3523;

    /* JADX INFO: renamed from: ۜۧ, reason: not valid java name and contains not printable characters */
    public ViewOnTouchListenerC19972 f3526;

    /* JADX INFO: renamed from: ۠ۧ, reason: not valid java name and contains not printable characters */
    public View f3527;

    /* JADX INFO: renamed from: ۡۧ, reason: not valid java name and contains not printable characters */
    public boolean f3528;

    /* JADX INFO: renamed from: ۢۧ, reason: not valid java name and contains not printable characters */
    public C14669 f3529;

    /* JADX INFO: renamed from: ۤۧ, reason: not valid java name and contains not printable characters */
    public FrameLayout f3530;

    /* JADX INFO: renamed from: ۨۧ, reason: not valid java name and contains not printable characters */
    public TextView f3531;

    /* JADX INFO: renamed from: ۫ۧ, reason: not valid java name and contains not printable characters */
    public FrameLayout f3532;

    /* JADX INFO: renamed from: ۬ۧ, reason: not valid java name and contains not printable characters */
    public WebView f3533;

    /* JADX INFO: renamed from: ܳۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3534;

    /* JADX INFO: renamed from: ܶۧ, reason: not valid java name and contains not printable characters */
    public ProgressBar f3535;

    /* JADX INFO: renamed from: ܺۧ, reason: not valid java name and contains not printable characters */
    public C3381 f3536;

    /* JADX INFO: renamed from: ܿۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3537;

    /* JADX INFO: renamed from: ᩳۧ, reason: not valid java name and contains not printable characters */
    public C0974 f3538;

    /* JADX INFO: renamed from: ᩴۧ, reason: not valid java name and contains not printable characters */
    public C21282 f3539;

    /* JADX INFO: renamed from: ᩶ۧ, reason: not valid java name and contains not printable characters */
    public C5155 f3541;

    /* JADX INFO: renamed from: ᩷ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3542;

    /* JADX INFO: renamed from: ᩸ۧ, reason: not valid java name and contains not printable characters */
    public MenuItem f3543;

    /* JADX INFO: renamed from: ᩹ۧ, reason: not valid java name and contains not printable characters */
    public C2676 f3544;

    /* JADX INFO: renamed from: ᩻ۧ, reason: not valid java name and contains not printable characters */
    public boolean f3545;

    /* JADX INFO: renamed from: ۛۧ, reason: not valid java name and contains not printable characters */
    public int f3525 = 100;

    /* JADX INFO: renamed from: ᩵ۧ, reason: not valid java name and contains not printable characters */
    public volatile C19267 f3540 = f3517;

    /* JADX INFO: renamed from: ۚۧ, reason: not valid java name and contains not printable characters */
    public final Object f3524 = new Object();

    @Override // l.AbstractActivityC3346
    /* JADX INFO: renamed from: ۚ */
    public final String mo121() {
        return "HtmlPreviewActivity";
    }

    static {
        int[] iArr = {25, 33, 50, 67, 75, 80, 90, 100, UMErrorCode.E_UM_BE_JSON_FAILED, q.h, 150, HideBottomViewOnScrollBehavior.DEFAULT_EXIT_ANIMATION_DURATION_MS, 200, 250, 300, 400, 500};
        f3516 = iArr;
        f3513 = iArr[0];
        f3515 = iArr[16];
        f3514 = new ConcurrentMapC10942();
        f3517 = new C19267(false, null);
        f3512 = new C19267(true, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3294(C16560 c16560, final InterfaceC17889 interfaceC17889, C18904 c18904, String str, final RunnableC10458 runnableC10458) {
        m3292(c16560.m39056(), c16560.m39063(), interfaceC17889, c18904, str, C18904.m43630(c16560), new Runnable() { // from class: l.ۜۚ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19267 c19267 = ActivityC0921.f3517;
                C9340.m24035(interfaceC17889, 2000);
                runnableC10458.run();
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3283(ShortcutActivity shortcutActivity, String str) {
        AbstractC15440 abstractC15440M39866 = C16999.m39866(str, new String[0]);
        if (!abstractC15440M39866.mo23119()) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        C2499 c2499 = C2499.f7958;
        InterfaceC17889 interfaceC17889Mo7638 = c2499.mo7638(abstractC15440M39866.mo23554());
        if (interfaceC17889Mo7638 == null) {
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        final C18904 c18904M43632 = C18904.m43632(abstractC15440M39866.mo23554());
        final C1264 c1264 = new C1264(C4925.f15527);
        final String strM4323 = c1264.m4323(c18904M43632);
        m3292(shortcutActivity, c2499, interfaceC17889Mo7638, c18904M43632, strM4323, Collections.EMPTY_LIST, new Runnable() { // from class: l.᩷ۚ᩷
            @Override // java.lang.Runnable
            public final void run() {
                C19267 c19267 = ActivityC0921.f3517;
                c1264.m4324(c18904M43632, strM4323, false);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3278(Activity activity, String str, String str2, boolean z, AbstractC15440 abstractC15440) {
        m3279(activity, str, str2, z, abstractC15440, -1);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3277(Activity activity, String str, String str2, AbstractC15440 abstractC15440, int i) {
        m3279(activity, str, str2, false, abstractC15440, Math.max(0, i));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:11:0x001c, B:14:0x0023, B:26:0x003e, B:28:0x0056, B:30:0x0062, B:32:0x006e, B:34:0x0085, B:38:0x0095, B:40:0x009b, B:42:0x00b3, B:43:0x00ba, B:35:0x008a, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:46:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: RuntimeException -> 0x00bb, TryCatch #0 {RuntimeException -> 0x00bb, blocks: (B:11:0x001c, B:14:0x0023, B:26:0x003e, B:28:0x0056, B:30:0x0062, B:32:0x006e, B:34:0x0085, B:38:0x0095, B:40:0x009b, B:42:0x00b3, B:43:0x00ba, B:35:0x008a, B:17:0x002a, B:8:0x0014, B:5:0x000a), top: B:46:0x000a }] */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3279(Activity activity, String str, String str2, boolean z, AbstractC15440 abstractC15440, int i) {
        AbstractC15440 abstractC15440M39866;
        String strM43637;
        String name;
        String str3;
        String strM18704;
        Runnable runnable = null;
        if (str == null) {
            abstractC15440M39866 = null;
        } else {
            try {
                abstractC15440M39866 = C16999.m39866(str, new String[0]);
            } catch (RuntimeException unused) {
                abstractC15440.mo23552();
                C21374.m48457(R.string.MT_Protector);
                return;
            }
        }
        String parent = abstractC15440M39866 == null ? null : abstractC15440M39866.getParent();
        String str4 = "/";
        if (parent == null || !parent.startsWith("/")) {
            parent = null;
        } else if (!parent.endsWith("/")) {
            parent = parent.concat("/");
        }
        boolean z2 = parent != null;
        if (z2) {
            if (z || i >= 0) {
                name = abstractC15440M39866.getName();
                str3 = parent;
            } else {
                final C18904 c18904M43632 = C18904.m43632(abstractC15440M39866.mo23554());
                String strM43636 = c18904M43632.m43636();
                if (C16999.m39872(strM43636, C16293.f50111.mo23554()) || C16999.m39872(strM43636, C16293.f50116.mo23554()) || C16999.m39872(strM43636, C16293.f50110.mo23554())) {
                    str4 = strM43636;
                } else {
                    final C1264 c1264 = new C1264(C4925.f15527);
                    final String strM4323 = c1264.m4323(c18904M43632);
                    str4 = strM4323;
                    runnable = new Runnable() { // from class: l.ܰ֡᩷
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19267 c19267 = ActivityC0921.f3517;
                            c1264.m4324(c18904M43632, strM4323, false);
                        }
                    };
                }
                strM43637 = c18904M43632.m43637(str4);
            }
            strM18704 = C6909.m18704(str3, name);
            if (strM18704 != null) {
                throw new IllegalArgumentException("Invalid HTML preview path");
            }
            C5155 c5155 = new C5155(C2499.f7958, str3, name, strM18704, str2, true, z, abstractC15440, z2);
            c5155.f16107 = i;
            m3280(activity, c5155, runnable);
        }
        strM43637 = "index.html";
        name = strM43637;
        str3 = str4;
        strM18704 = C6909.m18704(str3, name);
        if (strM18704 != null) {
            throw new IllegalArgumentException("Invalid HTML preview path");
        }
        C5155 c5156 = new C5155(C2499.f7958, str3, name, strM18704, str2, true, z, abstractC15440, z2);
        c5156.f16107 = i;
        m3280(activity, c5156, runnable);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3292(ActivityC2124 activityC2124, AbstractC13921 abstractC13921, InterfaceC17889 interfaceC17889, C18904 c18904, String str, List list, Runnable runnable) {
        Object obj;
        AbstractC13921 abstractC13921M28856;
        boolean zEquals = "local".equals(abstractC13921.mo7654());
        if (!(abstractC13921 instanceof C2499) && !(abstractC13921 instanceof AbstractC3163) && !(abstractC13921 instanceof C19247) && !(abstractC13921 instanceof C17626) && !(abstractC13921 instanceof C2346)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC16891.m39726(((Long) it.next()).longValue());
            }
            C21374.m48457(R.string.MT_Protector);
            return;
        }
        AbstractC13921 abstractC13922 = null;
        try {
            if (zEquals) {
                abstractC13921M28856 = C2499.f7958;
            } else {
                abstractC13921M28856 = C11806.m28856(abstractC13921.m33350(), true);
            }
            abstractC13922 = abstractC13921M28856;
            String strM43637 = c18904.m43637(str);
            String strM18704 = C6909.m18704(str, strM43637);
            try {
                if (strM18704 == null) {
                    throw new IllegalArgumentException("Invalid HTML preview path");
                }
                C5155 c5155 = new C5155(abstractC13922, str, strM43637, strM18704, interfaceC17889.getName(), zEquals, "multipart/related".equals(C1285.m4347(interfaceC17889.getName())), null, true);
                c5155.f16112 = list;
                m3280(activityC2124, c5155, runnable);
                return;
            } catch (RuntimeException unused) {
                obj = abstractC13922;
            }
        } catch (RuntimeException unused2) {
            obj = abstractC13922;
        }
        if (obj instanceof AutoCloseable) {
            try {
                C5368.m15342((AutoCloseable) obj);
            } catch (Exception unused3) {
            }
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC16891.m39726(((Long) it2.next()).longValue());
        }
        C21374.m48457(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3280(Activity activity, final C5155 c5155, Runnable runnable) {
        final String string = UUID.randomUUID().toString();
        ConcurrentMapC10942 concurrentMapC10942 = f3514;
        concurrentMapC10942.put(string, c5155);
        C4925.m14324().postDelayed(new Runnable() { // from class: l.᩺֡᩷
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC0921.m3293(c5155, string);
            }
        }, 60000L);
        Intent intent = new Intent(activity, (Class<?>) ActivityC0921.class);
        intent.putExtra("session_token", string);
        try {
            activity.startActivity(intent);
            if (runnable != null) {
                runnable.run();
            }
        } catch (RuntimeException unused) {
            if (concurrentMapC10942.remove(string, c5155)) {
                c5155.close();
            }
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3293(C5155 c5155, String str) {
        if (c5155.f16114 || !f3514.remove(str, c5155)) {
            return;
        }
        c5155.close();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC0737, l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Uri uriM18701;
        C19267 c19267;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("session_token");
        this.f3523 = stringExtra;
        C5155 c5155 = stringExtra == null ? null : (C5155) f3514.get(stringExtra);
        this.f3541 = c5155;
        if (c5155 == null) {
            C21374.m48457(R.string.MT_Protector);
            finish();
            return;
        }
        c5155.f16114 = true;
        boolean z = false;
        if (bundle != null) {
            this.f3520 = bundle.getBundle("markdown_scroll");
            this.f3525 = m3318(bundle.getInt("zoom_percent", 100));
            if (bundle.getBoolean("preview_resources_allowed")) {
                c19267 = f3512;
            } else {
                c19267 = new C19267(false, bundle.getString("source_label"));
            }
            this.f3540 = c19267;
        }
        m10241(R.layout.MT_Protector);
        C9762 c9762 = (C9762) m10241(R.id.MT_Protector);
        this.f10584 = c9762;
        m10227(c9762);
        m10232();
        this.f10584.setNavigationOnClickListener(new View.OnClickListener() { // from class: l.ۢۚ᩷
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C19267 c19268 = ActivityC0921.f3517;
                this.f28510.finish();
            }
        });
        setTitle(this.f3541.f16106);
        this.f3535 = (ProgressBar) m10241(R.id.MT_Protector);
        this.f3527 = m10241(R.id.MT_Protector);
        View viewM10241 = m10241(R.id.MT_Protector);
        this.f3526 = new ViewOnTouchListenerC19972(viewM10241, ApplicationC20075.f65008);
        viewM10241.setOnClickListener(new ViewOnClickListenerC13202(this, 1));
        C18934.m43699(viewM10241, getString(R.string.MT_Protector));
        C4948.m14388(getWindow(), false);
        C17648.m41310(this.f3527, new C15612(this));
        this.f3544 = new C2676(this, this.f3541.f16102, this.f3541.f16109, this.f3541.f16111, this.f3541.f16105 ? null : this.f3541.f16116, this.f3541.f16108, this.f3541.f16115);
        if (this.f3541.f16107 >= 0) {
            this.f3536 = new C3381(getAssets());
        }
        C19320 c19320 = new C19320();
        c19320.m44516(this.f3541.f16104);
        c19320.m44517(this.f3544);
        this.f3538 = c19320.m44515();
        C15737 c15737 = new C15737(this, this);
        this.f3533 = c15737;
        c15737.setOnTouchListener(this.f3526);
        int iRgb = -1;
        ((FrameLayout) m10241(R.id.MT_Protector)).addView(this.f3533, new FrameLayout.LayoutParams(-1, -1));
        this.f3533.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ۡۚ᩷
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                ActivityC0921.m3285(this.f26464, i, i3, i5, i7);
            }
        });
        WebView webView = this.f3533;
        if (this.f3541.f16107 < 0) {
            this.f3529 = new C14669(webView);
        } else {
            C18561 c18561 = new C18561(this.f3541);
            this.f3522 = c18561;
            webView.addJavascriptInterface(c18561, "__mtMarkdownState");
        }
        if (this.f3541.f16107 >= 0 && C21238.m48208(this)) {
            iRgb = Color.rgb(13, 17, 23);
        }
        webView.setBackgroundColor(iRgb);
        m3282(webView, C21238.m48208(this));
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
        settings.setAllowContentAccess(this.f3541.f16105);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setJavaScriptCanOpenWindowsAutomatically(false);
        settings.setSupportMultipleWindows(false);
        settings.setGeolocationEnabled(false);
        settings.setMixedContentMode(1 ^ (this.f3540.f60641 ? 1 : 0));
        webView.setWebViewClient(new C2333(this));
        webView.setWebChromeClient(new C3744(this));
        webView.setDownloadListener(new C11360());
        if (bundle != null && bundle.getBoolean("fullscreen")) {
            z = true;
        }
        m3306(z);
        if (this.f3541.f16105) {
            if (this.f3541.f16116 == null) {
                uriM18701 = C4813.m14028(this.f3541.f16113, this, this.f3541.f16102, this.f3541.f16108, this.f3541.f16111);
            } else {
                uriM18701 = C4813.m14029(this.f3541.f16113, this, this.f3541.f16116);
            }
        } else {
            uriM18701 = C6909.m18701(this.f3541.f16104, this.f3541.f16103);
        }
        Bundle bundle2 = bundle == null ? null : bundle.getBundle("web_view");
        WebBackForwardList webBackForwardListRestoreState = bundle2 == null ? null : this.f3533.restoreState(bundle2);
        if (webBackForwardListRestoreState == null) {
            m3281(uriM18701);
            this.f3533.loadUrl(uriM18701.toString());
        } else {
            WebHistoryItem currentItem = webBackForwardListRestoreState.getCurrentItem();
            String url = currentItem == null ? null : currentItem.getUrl();
            m3281(url != null ? Uri.parse(url) : null);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3285(ActivityC0921 activityC0921, int i, int i2, int i3, int i4) {
        if (i2 - i != i4 - i3) {
            activityC0921.m3324();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3282(WebView webView, boolean z) {
        WebSettings settings = webView.getSettings();
        if (C13573.m32624("ALGORITHMIC_DARKENING")) {
            C18614.m43154(settings);
        }
        if (C13573.m32624("FORCE_DARK") && C13573.m32624("FORCE_DARK_STRATEGY")) {
            C18614.m43155(settings);
            C18614.m43153(settings, z ? 2 : 0);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static void m3320(ActivityC0921 activityC0921, Uri uri) {
        C5155 c5155;
        if (!activityC0921.f3528 || activityC0921.isFinishing() || activityC0921.isDestroyed() || (c5155 = activityC0921.f3541) == null || !(c5155.f16102 instanceof AbstractC3163)) {
            return;
        }
        if (C6909.m18703(uri, activityC0921.f3541.f16104) || C4813.m14031(uri, activityC0921.f3541.f16113)) {
            C21374.m48457(R.string.MT_Protector);
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3281(Uri uri) {
        m3295(m3274(uri, this.f3541.f16104, this.f3541.f16105 ? this.f3541.f16113 : null, this.f3540));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m3288(ActivityC0921 activityC0921, WebView webView, String str) {
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
            activityC0921.m3281(uri);
            if (activityC0921.f3540.f60641) {
                String string = uri.buildUpon().fragment(null).build().toString();
                synchronized (activityC0921.f3524) {
                    C0215 c0215 = activityC0921.f3518;
                    if (c0215 != null && c0215.f1472.equals(string)) {
                        activityC0921.f3518 = null;
                        boolean zM1460 = c0215.m1460(string);
                        if (zM1460) {
                            webView.reload();
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m3312(Uri uri) {
        C19267 c19267 = this.f3540;
        C19267 c19267M3274 = m3274(uri, this.f3541.f16104, this.f3541.f16105 ? this.f3541.f16113 : null, c19267);
        if (uri == null || c19267.f60641 || !c19267M3274.f60641) {
            if (!c19267M3274.f60641 || c19267.f60641) {
                m3300();
                return;
            }
            return;
        }
        String string = uri.buildUpon().fragment(null).build().toString();
        synchronized (this.f3524) {
            C0215 c0215 = this.f3518;
            if (c0215 == null || !c0215.f1472.equals(string)) {
                this.f3518 = new C0215(string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public void m3300() {
        synchronized (this.f3524) {
            this.f3518 = null;
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m3305(ActivityC0921 activityC0921, Uri uri) {
        C19267 c19267M3274 = m3274(uri, activityC0921.f3541.f16104, activityC0921.f3541.f16105 ? activityC0921.f3541.f16113 : null, activityC0921.f3540);
        if (!activityC0921.f3519 || c19267M3274.f60641) {
            return;
        }
        activityC0921.m3295(c19267M3274);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m3295(C19267 c19267) {
        C5155 c5155;
        boolean z = this.f3519;
        boolean z2 = c19267.f60641;
        boolean z3 = z2 && !z;
        this.f3519 = z2;
        this.f3540 = c19267;
        WebView webView = this.f3533;
        if (webView != null) {
            webView.getSettings().setMixedContentMode(!c19267.f60641 ? 1 : 0);
        }
        C9762 c9762 = this.f10584;
        if (c9762 != null) {
            c9762.setSubtitle(c19267.f60642);
        }
        if (!z3 || (c5155 = this.f3541) == null) {
            return;
        }
        setTitle(c5155.f16106);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static String m3303(Uri uri) {
        String scheme = uri.getScheme();
        if (scheme != null && (scheme.equalsIgnoreCase(a.s) || scheme.equalsIgnoreCase(b.a))) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C19267 m3274(Uri uri, String str, String str2, C19267 c19267) {
        String strM3303;
        boolean zM18703 = C6909.m18703(uri, str);
        C19267 c19268 = f3512;
        if (zM18703 || C4813.m14031(uri, str2)) {
            return c19268;
        }
        String scheme = uri == null ? null : uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
                String strM3304 = m3303(uri);
                if (strM3304 == null) {
                    return f3517;
                }
                return new C19267(false, strM3304);
            }
            if (lowerCase.equals("blob")) {
                Uri uri2 = Uri.parse(uri.toString().substring(scheme.length() + 1));
                if (C6909.m18703(uri2, str)) {
                    return c19268;
                }
                String scheme2 = uri2.getScheme();
                if (scheme2 != null && ((scheme2.equalsIgnoreCase(a.s) || scheme2.equalsIgnoreCase(b.a)) && (strM3303 = m3303(uri2)) != null)) {
                    return new C19267(false, strM3303);
                }
                return new C19267(false, "blob:");
            }
            if (lowerCase.equals(e.m) || lowerCase.equals("about")) {
                return new C19267(false, lowerCase.concat(":"));
            }
        }
        return c19267;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m3273(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                return (String) entry.getValue();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static String m3311(ActivityC0921 activityC0921, String str) {
        if (str != null) {
            Uri uri = Uri.parse(str);
            if (uri.getScheme() != null) {
                C19267 c19267M3274 = m3274(uri, activityC0921.f3541.f16104, activityC0921.f3541.f16105 ? activityC0921.f3541.f16113 : null, activityC0921.f3540);
                return c19267M3274.f60641 ? activityC0921.f3541.f16106 : c19267M3274.f60642;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static WebResourceResponse m3272(ActivityC0921 activityC0921, WebResourceRequest webResourceRequest) {
        boolean z;
        boolean zEqualsIgnoreCase;
        WebResourceResponse webResourceResponseM3440;
        C3381 c3381;
        Uri url = webResourceRequest.getUrl();
        String method = webResourceRequest.getMethod();
        if (webResourceRequest.isForMainFrame()) {
            activityC0921.m3312(url);
            C19267 c19267 = activityC0921.f3540;
            C19267 c19267M3274 = m3274(url, activityC0921.f3541.f16104, activityC0921.f3541.f16105 ? activityC0921.f3541.f16113 : null, c19267);
            if (!c19267.f60641 || c19267M3274.f60641) {
                c19267M3274 = c19267;
            }
            if (c19267M3274 != c19267) {
                activityC0921.f3540 = c19267M3274;
            }
        }
        if (C6909.m18703(url, activityC0921.f3541.f16104)) {
            synchronized (activityC0921.f3524) {
                boolean zIsForMainFrame = webResourceRequest.isForMainFrame();
                C19267 c19268 = activityC0921.f3540;
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                String str = activityC0921.f3541.f16104;
                C0215 c0215 = activityC0921.f3518;
                z = false;
                if (!zIsForMainFrame && !c19268.f60641) {
                    String strM3273 = m3273("Sec-Fetch-Site", requestHeaders);
                    if (strM3273 != null) {
                        zEqualsIgnoreCase = "same-origin".equalsIgnoreCase(strM3273);
                    } else {
                        String strM3274 = m3273("Referer", requestHeaders);
                        zEqualsIgnoreCase = strM3274 != null && C6909.m18703(Uri.parse(strM3274), str);
                    }
                }
                if (!zEqualsIgnoreCase) {
                    if (c0215 != null) {
                        if (m3273("Sec-Fetch-Site", requestHeaders) == null && m3273("Referer", requestHeaders) == null) {
                            z = true;
                        }
                        if (z) {
                            c0215.m1459();
                        }
                    }
                    z = true;
                }
            }
            if (z) {
                return C2676.m8383(403, "Forbidden");
            }
            if (!"GET".equalsIgnoreCase(method)) {
                return C2676.m8383(405, "Method Not Allowed");
            }
            if (activityC0921.f3541.f16107 >= 0 && url.getPath() != null && url.getPath().startsWith("/_mt_markdown_vendor_/")) {
                if (!webResourceRequest.isForMainFrame() && (c3381 = activityC0921.f3536) != null) {
                    return c3381.m10313(url.getPath());
                }
                return C2676.m8383(404, "Not Found");
            }
            if (webResourceRequest.isForMainFrame() && (activityC0921.f3541.f16102 instanceof AbstractC3163) && url.getPath() != null) {
                webResourceResponseM3440 = activityC0921.f3544.m8387(url.getPath());
            } else {
                webResourceResponseM3440 = activityC0921.f3538.m3440(url);
            }
            return webResourceResponseM3440 == null ? C2676.m8383(404, "Not Found") : webResourceResponseM3440;
        }
        if (activityC0921.f3541.f16105 && C4813.m14031(url, activityC0921.f3541.f16113)) {
            if (webResourceRequest.isForMainFrame() && "GET".equalsIgnoreCase(method) && (activityC0921.f3541.f16102 instanceof AbstractC3163)) {
                C4813.m14032(activityC0921.f3541.f16113);
            }
            if (!webResourceRequest.isForMainFrame() || !"GET".equalsIgnoreCase(method)) {
                return C2676.m8383(403, "Forbidden");
            }
        } else {
            String scheme = url.getScheme();
            if ("content".equalsIgnoreCase(scheme) || "file".equalsIgnoreCase(scheme)) {
                return C2676.m8383(403, "Forbidden");
            }
            if (webResourceRequest.isForMainFrame() && activityC0921.m3321(url)) {
                return C2676.m8383(403, "Forbidden");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m3321(Uri uri) {
        String str = this.f3541.f16104;
        String str2 = null;
        String str3 = this.f3541.f16105 ? this.f3541.f16113 : null;
        if (C6909.m18703(uri, str) || C4813.m14031(uri, str3)) {
            return false;
        }
        String scheme = uri.getScheme();
        if (scheme != null) {
            String lowerCase = scheme.toLowerCase(Locale.ROOT);
            if (lowerCase.equals("about") || lowerCase.equals(e.m) || lowerCase.equals("blob") || lowerCase.equals("javascript") || lowerCase.equals("cid")) {
                return false;
            }
            if (lowerCase.equals(a.s) || lowerCase.equals(b.a)) {
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

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ C21610 m3275(ActivityC0921 activityC0921, View view, C21610 c21610) {
        C11007 c11007M48815 = c21610.m48815((activityC0921.f3545 ? 0 : 7) | 128);
        view.setPadding(c11007M48815.f33109, c11007M48815.f33111, c11007M48815.f33110, Math.max(c11007M48815.f33108, c21610.m48815(8).f33108));
        activityC0921.f3526.m46058(c21610.m48815(7));
        return C21610.f69386;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public void m3306(boolean z) {
        this.f3545 = z;
        this.f10584.setVisibility(z ? 8 : 0);
        this.f3535.setVisibility((!this.f3528 || z) ? 8 : 0);
        this.f3526.m46059(z);
        m3308();
        C17648.m41339(this.f3527);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m3308() {
        C12437 c12437M10244 = m10244();
        if (this.f3545) {
            c12437M10244.m30602(2);
            c12437M10244.m30599(7);
        } else {
            c12437M10244.m30602(1);
            c12437M10244.m30604(7);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.f3545) {
            m3308();
        }
    }

    @Override // l.AbstractActivityC3346, l.ActivityC2124, l.ActivityC1252, l.ActivityC23809, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) throws Throwable {
        super.onConfigurationChanged(configuration);
        if (this.f3527 != null) {
            this.f3526.m46059(this.f3545);
            m3308();
            C17648.m41339(this.f3527);
        }
        WebView webView = this.f3533;
        if (webView != null) {
            m3313(webView.getUrl());
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.MT_Protector, menu);
        this.f3537 = menu.findItem(R.id.MT_Protector);
        this.f3534 = menu.findItem(R.id.MT_Protector);
        m3298();
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f3533 == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        int itemId = menuItem.getItemId();
        if (itemId == R.id.MT_Protector) {
            if (this.f3533.canGoBack()) {
                this.f3533.goBack();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            if (this.f3533.canGoForward()) {
                this.f3533.goForward();
                return true;
            }
        } else if (itemId == R.id.MT_Protector) {
            View viewFindViewById = this.f10584.findViewById(R.id.MT_Protector);
            if (viewFindViewById != null) {
                C21282 c21282M45699 = C19871.m45699(viewFindViewById);
                C3060 c3060M48304 = c21282M45699.m48304();
                this.f3543 = c3060M48304.add(0, 1, 0, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                this.f3521 = c3060M48304.add(0, 2, 1, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c3060M48304.add(0, 5, 2, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                if (this.f3541.f16107 < 0) {
                    this.f3542 = c3060M48304.add(0, 3, 3, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                }
                c3060M48304.add(0, 4, 4, R.string.MT_Protector).setIcon(R.drawable.MT_Protector);
                c21282M45699.m48306();
                c21282M45699.m48302(new C3362(4, this));
                c21282M45699.m48301(new C4157(this));
                Context context = viewFindViewById.getContext();
                ViewParent parent = viewFindViewById.getParent();
                if (parent instanceof C8788) {
                    C8788 c8788 = (C8788) parent;
                    context = c8788.getContext();
                    int iM22681 = c8788.m22681();
                    if (iM22681 != 0) {
                        context = new C12729(context, iM22681);
                    }
                }
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.MT_Protector, (ViewGroup) null, false);
                this.f3530 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f3531 = (TextView) viewInflate.findViewById(R.id.MT_Protector);
                this.f3532 = (FrameLayout) viewInflate.findViewById(R.id.MT_Protector);
                this.f3530.setOnClickListener(new ViewOnClickListenerC20259(4, this));
                this.f3532.setOnClickListener(new ViewOnClickListenerC18869(this, 2));
                this.f3539 = c21282M45699;
                m3298();
                C19871.m45700(c21282M45699, this.f3525 + "%", viewInflate);
            }
        } else {
            return super.onOptionsItemSelected(menuItem);
        }
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3290(ActivityC0921 activityC0921, C21282 c21282) {
        if (activityC0921.f3539 == c21282) {
            activityC0921.f3539 = null;
            activityC0921.f3543 = null;
            activityC0921.f3521 = null;
            activityC0921.f3542 = null;
            activityC0921.f3530 = null;
            activityC0921.f3531 = null;
            activityC0921.f3532 = null;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m3297(ActivityC0921 activityC0921, MenuItem menuItem) {
        if (activityC0921.f3533 != null) {
            if (menuItem.getItemId() == 1) {
                activityC0921.f3533.reload();
                return true;
            }
            if (menuItem.getItemId() == 2) {
                activityC0921.m3300();
                activityC0921.f3533.stopLoading();
                if (activityC0921.f3541.f16102 instanceof AbstractC3163) {
                    activityC0921.f3544.m8386();
                    C4813.m14032(activityC0921.f3541.f16113);
                }
                activityC0921.m3276(100, false);
                return true;
            }
            if (menuItem.getItemId() == 5) {
                activityC0921.m3306(true);
                return true;
            }
            if (menuItem.getItemId() == 3) {
                if (activityC0921.m3309()) {
                    activityC0921.f3529.m34959(C21238.m48208(activityC0921));
                }
                return true;
            }
            if (menuItem.getItemId() == 4) {
                activityC0921.finish();
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3296(boolean z) {
        int i;
        if (this.f3533 == null) {
            return;
        }
        int i2 = this.f3525;
        int[] iArr = f3516;
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
                    i = f3515;
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
                    i = f3513;
                    break;
                }
            }
        }
        if (i == i2) {
            return;
        }
        m3317(i);
        m3324();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public void m3324() {
        WebView webView = this.f3533;
        if (webView == null || webView.getWidth() <= 0) {
            return;
        }
        int iMax = Math.max(1, Math.round(this.f3533.getWidth() / this.f3533.getResources().getDisplayMetrics().density));
        WebView webView2 = this.f3533;
        StringBuilder sbM32308 = C13325.m32308(m3318(this.f3525), "(function(percent,hostWidth){var root=document.documentElement,head=document.head;if(!root||!head){return;}var key='__mt_html_preview_viewport_7d26a6c9__';var state=root[key];if(!state){if(percent===100){return;}var nodes=[],content='',metas=head.getElementsByTagName('meta');for(var i=0;i<metas.length;i++){if((metas[i].name||'').toLowerCase()==='viewport'){nodes.push(metas[i]);content=metas[i].getAttribute('content')||'';}}state={nodes:nodes,width:root.clientWidth||window.innerWidth||hostWidth,hostWidth:hostWidth,scale:window.visualViewport?window.visualViewport.scale:0,fluid:/width\\s*=\\s*device-width/i.test(content)||(!/width\\s*=/i.test(content)&&/initial-scale\\s*=/i.test(content))};if(!nodes.length){var meta=document.createElement('meta');meta.name='viewport';head.appendChild(meta);nodes.push(meta);}Object.defineProperty(root,key,{value:state,configurable:true});}var baseWidth=state.fluid?state.width*hostWidth/state.hostWidth:state.width;var width=Math.max(1,Math.round(baseWidth*100/percent));var scale=hostWidth/width;if(state.scale>0){scale*=state.scale*state.width/state.hostWidth;}var content='width='+width+',initial-scale='+scale+',minimum-scale='+Math.min(scale,0.1)+',maximum-scale='+Math.max(scale,10);for(var i=0;i<state.nodes.length;i++){state.nodes[i].setAttribute('content',content);}})(", ",");
        sbM32308.append(Math.max(1, iMax));
        sbM32308.append(");");
        webView2.evaluateJavascript(sbM32308.toString(), null);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    private void m3317(int i) {
        int iM3318 = m3318(i);
        this.f3525 = iM3318;
        TextView textView = this.f3531;
        if (textView != null) {
            textView.setText(iM3318 + "%");
        }
        FrameLayout frameLayout = this.f3530;
        if (frameLayout != null) {
            frameLayout.setEnabled(this.f3525 > f3513);
        }
        FrameLayout frameLayout2 = this.f3532;
        if (frameLayout2 != null) {
            frameLayout2.setEnabled(this.f3525 < f3515);
        }
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static int m3318(int i) {
        int iMin = Math.min(f3515, i);
        int i2 = f3513;
        int iMax = Math.max(i2, iMin);
        for (int i3 = 0; i3 < 17; i3++) {
            int i4 = f3516[i3];
            if (Math.abs(i4 - iMax) < Math.abs(i2 - iMax)) {
                i2 = i4;
            }
        }
        return i2;
    }

    @Override // l.ActivityC23809, android.app.Activity
    public final void onBackPressed() {
        C14669 c14669 = this.f3529;
        if (c14669 == null || !c14669.m34960(new RunnableC7412(7, this))) {
            WebView webView = this.f3533;
            if (webView != null && webView.canGoBack()) {
                this.f3533.goBack();
            } else {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m3304(ActivityC0921 activityC0921) {
        WebView webView = activityC0921.f3533;
        if (webView != null && webView.canGoBack()) {
            activityC0921.f3533.goBack();
        } else {
            super.onBackPressed();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public void m3276(int i, boolean z) {
        this.f3528 = z;
        ProgressBar progressBar = this.f3535;
        if (progressBar != null) {
            progressBar.setProgress(i);
            this.f3535.setVisibility((!z || this.f3545) ? 8 : 0);
        }
        m3298();
    }

    /* JADX INFO: renamed from: ֫֫, reason: not valid java name and contains not printable characters */
    private void m3298() {
        MenuItem menuItem = this.f3537;
        boolean z = false;
        if (menuItem != null) {
            WebView webView = this.f3533;
            menuItem.setEnabled(webView != null && webView.canGoBack());
        }
        MenuItem menuItem2 = this.f3534;
        if (menuItem2 != null) {
            WebView webView2 = this.f3533;
            if (webView2 != null && webView2.canGoForward()) {
                z = true;
            }
            menuItem2.setEnabled(z);
        }
        MenuItem menuItem3 = this.f3543;
        if (menuItem3 != null) {
            menuItem3.setVisible(!this.f3528);
        }
        MenuItem menuItem4 = this.f3521;
        if (menuItem4 != null) {
            menuItem4.setVisible(this.f3528);
        }
        MenuItem menuItem5 = this.f3542;
        if (menuItem5 != null) {
            menuItem5.setEnabled(m3309());
        }
        m3317(this.f3525);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private boolean m3309() {
        C5155 c5155;
        WebView webView = this.f3533;
        String url = webView == null ? null : webView.getUrl();
        return (url == null || (c5155 = this.f3541) == null || c5155.f16107 >= 0 || C4813.m14031(Uri.parse(url), this.f3541.f16113)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public void m3313(String str) {
        String str2;
        if (this.f3533 == null || !m3322(str)) {
            return;
        }
        boolean zM48208 = C21238.m48208(this);
        this.f3533.setBackgroundColor(zM48208 ? Color.rgb(13, 17, 23) : -1);
        m3282(this.f3533, zM48208);
        String string = C6909.m18701(this.f3541.f16104, this.f3541.f16103).toString();
        final Bundle bundle = this.f3520;
        if (bundle == null) {
            str2 = "null";
        } else {
            str2 = "{x:" + bundle.getFloat("x") + ",y:" + bundle.getFloat("y") + l.d;
        }
        String str3 = this.f3541.f16110;
        String strQuote = str3 != null ? JSONObject.quote(str3) : "null";
        this.f3533.evaluateJavascript("(function(){if(location.href.split('#')[0]!==" + JSONObject.quote(string) + "||!window.__mtMarkdownPreview)return false;window.__mtMarkdownPreview.apply(" + zM48208 + "," + this.f3541.f16107 + "," + str2 + "," + strQuote + ",function(state){window.__mtMarkdownState.save(" + JSONObject.quote(this.f3522.f57604) + ",state);});return true;})()", new ValueCallback() { // from class: l.ܳۚ᩷
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                ActivityC0921.m3287(this.f43212, bundle, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m3287(ActivityC0921 activityC0921, Bundle bundle, String str) {
        if ("true".equals(str) && activityC0921.f3520 == bundle) {
            activityC0921.f3520 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean m3322(String str) {
        C5155 c5155 = this.f3541;
        return c5155 != null && c5155.f16107 >= 0 && str != null && Uri.parse(str).buildUpon().fragment(null).build().equals(C6909.m18701(this.f3541.f16104, this.f3541.f16103));
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onPause() {
        WebView webView = this.f3533;
        if (webView != null) {
            webView.onPause();
        }
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972 = this.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC19972.m46059(false);
        }
        super.onPause();
    }

    @Override // l.AbstractActivityC3346, l.ActivityC0737, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972 = this.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC19972.m46059(this.f3545);
        }
        WebView webView = this.f3533;
        if (webView != null) {
            webView.onResume();
            m3313(this.f3533.getUrl());
        }
    }

    @Override // l.ActivityC23809, l.ActivityC4927, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        if (this.f3533 != null) {
            Bundle bundle2 = new Bundle();
            this.f3533.saveState(bundle2);
            bundle.putBundle("web_view", bundle2);
            if (m3322(this.f3533.getUrl())) {
                Bundle bundle3 = new Bundle();
                float fMax = Math.max(0.01f, this.f3533.getScale());
                bundle3.putFloat("x", this.f3533.getScrollX() / fMax);
                bundle3.putFloat("y", this.f3533.getScrollY() / fMax);
                bundle.putBundle("markdown_scroll", bundle3);
            }
        }
        C19267 c19267 = this.f3540;
        bundle.putBoolean("preview_resources_allowed", c19267.f60641);
        bundle.putString("source_label", c19267.f60642);
        bundle.putInt("zoom_percent", this.f3525);
        bundle.putBoolean("fullscreen", this.f3545);
        super.onSaveInstanceState(bundle);
    }

    @Override // l.AbstractActivityC3346, l.ActivityC1252, l.ActivityC0737, android.app.Activity
    public final void onDestroy() {
        C5155 c5155;
        ViewOnTouchListenerC19972 viewOnTouchListenerC19972 = this.f3526;
        if (viewOnTouchListenerC19972 != null) {
            viewOnTouchListenerC19972.m46059(false);
        }
        C14669 c14669 = this.f3529;
        if (c14669 != null) {
            c14669.m34958();
        }
        C18561 c18561 = this.f3522;
        if (c18561 != null) {
            C18561.m43102(c18561);
            WebView webView = this.f3533;
            if (webView != null) {
                webView.removeJavascriptInterface("__mtMarkdownState");
            }
        }
        C21282 c21282 = this.f3539;
        if (c21282 != null) {
            c21282.m48299();
            this.f3539 = null;
        }
        C5155 c5156 = this.f3541;
        C4813.m14033(c5156 == null ? null : c5156.f16113);
        m3300();
        WebView webView2 = this.f3533;
        if (webView2 != null) {
            webView2.stopLoading();
        }
        C2676 c2676 = this.f3544;
        if (c2676 != null) {
            c2676.close();
            this.f3544 = null;
        }
        WebView webView3 = this.f3533;
        if (webView3 != null) {
            webView3.setWebChromeClient(null);
            this.f3533.setWebViewClient(new WebViewClient());
            this.f3533.clearHistory();
            ViewGroup viewGroup = (ViewGroup) this.f3533.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f3533);
            }
            this.f3533.destroy();
            this.f3533 = null;
        }
        if (!isChangingConfigurations() && (c5155 = this.f3541) != null) {
            f3514.remove(this.f3523, c5155);
            this.f3541.close();
            this.f3541 = null;
        }
        super.onDestroy();
    }
}
