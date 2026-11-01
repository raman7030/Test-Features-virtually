package p067l;

import android.content.res.AssetManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import bin.p000mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܳܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C16310 {

    /* JADX INFO: renamed from: ֫ */
    public int f47929;

    /* JADX INFO: renamed from: ۧ */
    public boolean f47930;

    /* JADX INFO: renamed from: ܳ */
    public final String f47931;

    /* JADX INFO: renamed from: ܽ */
    public boolean f47932;

    /* JADX INFO: renamed from: ܿ */
    public final C18993 f47933;

    /* JADX INFO: renamed from: ᩳ */
    public final C25028 f47934;

    /* JADX INFO: renamed from: ᩻ */
    public WebView f47935;

    public C16310(WebView webView) {
        InterfaceC14100 interfaceC14100 = C7050.f18359;
        String str = "__mt_inspector_settings_" + UUID.randomUUID().toString().replace("-", "");
        this.f47931 = str;
        this.f47935 = webView;
        C25028 c25028 = new C25028(interfaceC14100);
        this.f47934 = c25028;
        C18993 c18993 = new C18993(c25028);
        this.f47933 = c18993;
        webView.addJavascriptInterface(c18993, str);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m37108() {
        this.f47929++;
        this.f47932 = false;
        this.f47930 = false;
        C18993.m43136(this.f47933, null);
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37106(final boolean z) {
        if (this.f47935 == null || this.f47932) {
            return;
        }
        this.f47932 = true;
        final int i = this.f47929;
        final String string = UUID.randomUUID().toString();
        final AssetManager assets = this.f47935.getContext().getAssets();
        final String strQuote = JSONObject.quote(C11419.m26406(this.f47935.getResources()).toLanguageTag());
        this.f47935.evaluateJavascript(C6988.m16053("(function(){var root=document.documentElement;if(!root)return false;var state=root['__mt_html_inspector_7d26a6c9__'];if(state){state.show();return true;}root['__mt_html_inspector_7d26a6c9__request']='", string, "';return false;})()"), new ValueCallback() { // from class: l.۟ᩳܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                boolean z2 = z;
                C16310.m37103(i, assets, this.f26500, string, strQuote, (String) obj, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static /* synthetic */ void m37099(final int i, AssetManager assetManager, final C16310 c16310, String str, String str2, String str3, boolean z) {
        try {
            final String strM37098 = m37098(assetManager, str, str2, z, str3, c16310.f47931);
            C7050.m16221().post(new Runnable() { // from class: l.ܽܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C16310.m37104(this.f54730, i, strM37098);
                }
            });
        } catch (IOException unused) {
            C7050.m16221().post(new Runnable() { // from class: l.ۧܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C16310.m37100(this.f36457, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37101(C16310 c16310, int i, String str) {
        boolean zEquals = "true".equals(str);
        if (c16310.f47935 == null || c16310.f47929 != i) {
            return;
        }
        c16310.f47932 = false;
        c16310.f47930 = zEquals;
        if (zEquals) {
            return;
        }
        C18993.m43136(c16310.f47933, null);
        C22682.m50793(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public final boolean m37107(final RunnableC9413 runnableC9413) {
        if (this.f47932) {
            this.f47929++;
            this.f47932 = false;
            this.f47930 = true;
            this.f47935.evaluateJavascript("(function(){var root=document.documentElement;delete root['__mt_html_inspector_7d26a6c9__request'];var state=root['__mt_html_inspector_7d26a6c9__'];if(state)state.hide();})()", null);
            return true;
        }
        WebView webView = this.f47935;
        if (webView == null || !this.f47930) {
            return false;
        }
        final int i = this.f47929;
        webView.evaluateJavascript("(function(){var state=document.documentElement['__mt_html_inspector_7d26a6c9__'];return !!(state&&state.hide());})()", new ValueCallback() { // from class: l.ܰᩳܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C16310.m37102(this.f44780, i, runnableC9413, (String) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m37105() {
        m37108();
        WebView webView = this.f47935;
        if (webView != null) {
            webView.removeJavascriptInterface(this.f47931);
        }
        this.f47935 = null;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37100(C16310 c16310, int i) {
        if (c16310.f47935 == null || c16310.f47929 != i) {
            return;
        }
        c16310.f47932 = false;
        c16310.f47930 = false;
        C18993.m43136(c16310.f47933, null);
        C22682.m50793(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m37102(C16310 c16310, int i, RunnableC9413 runnableC9413, String str) {
        if (c16310.f47935 == null || c16310.f47929 != i || "true".equals(str)) {
            return;
        }
        runnableC9413.run();
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37103(final int i, final AssetManager assetManager, final C16310 c16310, final String str, final String str2, String str3, final boolean z) {
        if (c16310.f47935 == null || c16310.f47929 != i) {
            return;
        }
        if ("true".equals(str3)) {
            c16310.f47932 = false;
            c16310.f47930 = true;
        } else {
            C18993.m43136(c16310.f47933, str);
            final String string = c16310.f47934.m54962().toString();
            C4081.f8988.execute(new Runnable() { // from class: l.֫ܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C16310.m37099(i, assetManager, c16310, str, str2, string, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m37104(final C16310 c16310, final int i, String str) {
        WebView webView = c16310.f47935;
        if (webView == null || c16310.f47929 != i) {
            return;
        }
        webView.evaluateJavascript(str, new ValueCallback() { // from class: l.ᩳܿܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C16310.m37101(this.f59795, i, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m37098(AssetManager assetManager, String str, String str2, boolean z, String str3, String str4) throws IOException {
        StringBuilder sbM12525 = C5633.m12525("(function(){var root=document.documentElement;if(!root||root['__mt_html_inspector_7d26a6c9__request']!=='", str, "')return false;try{var bridge=window['", str4, "'],encode=JSON.stringify;var mount=");
        InputStream inputStreamOpen = assetManager.open("eruda.js");
        try {
            String strM52175 = C23461.m52175(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m55303m(sbM12525, strM52175, ";root['__mt_html_inspector_7d26a6c9__']=mount(", str2, ",");
            sbM12525.append(z);
            sbM12525.append(",");
            sbM12525.append(str3);
            sbM12525.append(",function(command){try{return bridge.update('");
            return C10965.m25286(sbM12525, str, "',encode(command))===true;}catch(error){return false;}});delete root['__mt_html_inspector_7d26a6c9__request'];return true;}catch(error){return false;}})()");
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
