package p067l;

import android.webkit.WebView;
import com.alipay.sdk.p010m.p049t.AbstractC0213e;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11080 extends C14902 {

    /* JADX INFO: renamed from: ܽ */
    public String f30712;

    public C11080(WebView webView, long j, String str) {
        super(webView, j);
        this.f30712 = str;
    }

    @Override // p067l.C14902
    /* JADX INFO: renamed from: ֫ */
    public final void mo25525() {
        C11060.m25471("openSDK_LOG.SecureJsListener", "-->onComplete, result: null");
    }

    @Override // p067l.C14902
    /* JADX INFO: renamed from: ۧ */
    public final void mo25527() {
        C11060.m25464("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // p067l.C14902
    /* JADX INFO: renamed from: ֫ */
    public final void mo25526(String str) {
        C11060.m25471("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0252o.f1208c, !C11731.f32765 ? -4 : 0);
            jSONObject.put("sn", this.f42511);
            jSONObject.put(AbstractC0213e.f989m, str);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        WebView webView = (WebView) this.f42510.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:if(!!");
            String str2 = this.f30712;
            stringBuffer.append(str2);
            stringBuffer.append("){");
            stringBuffer.append(str2);
            stringBuffer.append(MotionUtils.EASING_TYPE_FORMAT_START);
            stringBuffer.append(string);
            stringBuffer.append(")}");
            String string2 = stringBuffer.toString();
            C11060.m25471("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string2);
            webView.loadUrl(string2);
        }
    }
}
