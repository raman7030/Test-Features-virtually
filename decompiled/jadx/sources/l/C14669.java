package l;

import android.content.res.AssetManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܳܿܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6ZG */
/* JADX INFO: loaded from: classes4.dex */
public final class C14669 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f44819;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f44820;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f44821;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f44822;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C17492 f44823;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C23842 f44824;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public WebView f44825;

    public C14669(WebView webView) {
        InterfaceC12344 interfaceC12344 = C4925.f15527;
        String str = "__mt_inspector_settings_" + UUID.randomUUID().toString().replace("-", "");
        this.f44821 = str;
        this.f44825 = webView;
        C23842 c23842 = new C23842(interfaceC12344);
        this.f44824 = c23842;
        C17492 c17492 = new C17492(c23842);
        this.f44823 = c17492;
        webView.addJavascriptInterface(c17492, str);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m34961() {
        this.f44819++;
        this.f44822 = false;
        this.f44820 = false;
        C17492.m40878(this.f44823, null);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34959(final boolean z) {
        if (this.f44825 == null || this.f44822) {
            return;
        }
        this.f44822 = true;
        final int i = this.f44819;
        final String string = UUID.randomUUID().toString();
        final AssetManager assets = this.f44825.getContext().getAssets();
        final String strQuote = JSONObject.quote(C9523.m24396(this.f44825.getResources()).toLanguageTag());
        this.f44825.evaluateJavascript(C4860.m14172("(function(){var root=document.documentElement;if(!root)return false;var state=root['__mt_html_inspector_7d26a6c9__'];if(state){state.show();return true;}root['__mt_html_inspector_7d26a6c9__request']='", string, "';return false;})()"), new ValueCallback() { // from class: l.۟ᩳܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                boolean z2 = z;
                C14669.m34956(i, assets, this.f23587, string, strQuote, (String) obj, z2);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m34952(final int i, AssetManager assetManager, final C14669 c14669, String str, String str2, String str3, boolean z) {
        try {
            final String strM34951 = m34951(assetManager, str, str2, z, str3, c14669.f44821);
            C4925.m14324().post(new Runnable() { // from class: l.ܽܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14669.m34957(this.f51548, i, strM34951);
                }
            });
        } catch (IOException unused) {
            C4925.m14324().post(new Runnable() { // from class: l.ۧܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14669.m34953(this.f33457, i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34954(C14669 c14669, int i, String str) {
        boolean zEquals = "true".equals(str);
        if (c14669.f44825 == null || c14669.f44819 != i) {
            return;
        }
        c14669.f44822 = false;
        c14669.f44820 = zEquals;
        if (zEquals) {
            return;
        }
        C17492.m40878(c14669.f44823, null);
        C21374.m48457(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m34960(final RunnableC7412 runnableC7412) {
        if (this.f44822) {
            this.f44819++;
            this.f44822 = false;
            this.f44820 = true;
            this.f44825.evaluateJavascript("(function(){var root=document.documentElement;delete root['__mt_html_inspector_7d26a6c9__request'];var state=root['__mt_html_inspector_7d26a6c9__'];if(state)state.hide();})()", null);
            return true;
        }
        WebView webView = this.f44825;
        if (webView == null || !this.f44820) {
            return false;
        }
        final int i = this.f44819;
        webView.evaluateJavascript("(function(){var state=document.documentElement['__mt_html_inspector_7d26a6c9__'];return !!(state&&state.hide());})()", new ValueCallback() { // from class: l.ܰᩳܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C14669.m34955(this.f41697, i, runnableC7412, (String) obj);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m34958() {
        m34961();
        WebView webView = this.f44825;
        if (webView != null) {
            webView.removeJavascriptInterface(this.f44821);
        }
        this.f44825 = null;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34953(C14669 c14669, int i) {
        if (c14669.f44825 == null || c14669.f44819 != i) {
            return;
        }
        c14669.f44822 = false;
        c14669.f44820 = false;
        C17492.m40878(c14669.f44823, null);
        C21374.m48457(R.string.MT_Protector);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m34955(C14669 c14669, int i, RunnableC7412 runnableC7412, String str) {
        if (c14669.f44825 == null || c14669.f44819 != i || "true".equals(str)) {
            return;
        }
        runnableC7412.run();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34956(final int i, final AssetManager assetManager, final C14669 c14669, final String str, final String str2, String str3, final boolean z) {
        if (c14669.f44825 == null || c14669.f44819 != i) {
            return;
        }
        if ("true".equals(str3)) {
            c14669.f44822 = false;
            c14669.f44820 = true;
        } else {
            C17492.m40878(c14669.f44823, str);
            final String string = c14669.f44824.m52553().toString();
            C1802.f6209.execute(new Runnable() { // from class: l.֫ܿܳ
                @Override // java.lang.Runnable
                public final void run() {
                    C14669.m34952(i, assetManager, c14669, str, str2, string, z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m34957(final C14669 c14669, final int i, String str) {
        WebView webView = c14669.f44825;
        if (webView == null || c14669.f44819 != i) {
            return;
        }
        webView.evaluateJavascript(str, new ValueCallback() { // from class: l.ᩳܿܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                C14669.m34954(this.f56582, i, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static String m34951(AssetManager assetManager, String str, String str2, boolean z, String str3, String str4) throws IOException {
        StringBuilder sbM10501 = C3435.m10501("(function(){var root=document.documentElement;if(!root||root['__mt_html_inspector_7d26a6c9__request']!=='", str, "')return false;try{var bridge=window['", str4, "'],encode=JSON.stringify;var mount=");
        InputStream inputStreamOpen = assetManager.open("eruda.js");
        try {
            String strM49848 = C22194.m49848(inputStreamOpen, StandardCharsets.UTF_8);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            ASN1BMPString$$ExternalSyntheticOutline0.m(sbM10501, strM49848, ";root['__mt_html_inspector_7d26a6c9__']=mount(", str2, ",");
            sbM10501.append(z);
            sbM10501.append(",");
            sbM10501.append(str3);
            sbM10501.append(",function(command){try{return bridge.update('");
            return C9045.m23341(sbM10501, str, "',encode(command))===true;}catch(error){return false;}});delete root['__mt_html_inspector_7d26a6c9__request'];return true;}catch(error){return false;}})()");
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
