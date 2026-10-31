package l;

import android.webkit.WebView;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9166 extends C13188 {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public String f27772;

    public C9166(WebView webView, long j, String str) {
        super(webView, j);
        this.f27772 = str;
    }

    @Override // l.C13188
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23574() {
        C9145.m23520("openSDK_LOG.SecureJsListener", "-->onComplete, result: null");
    }

    @Override // l.C13188
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void mo23576() {
        C9145.m23513("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // l.C13188
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void mo23575(String str) {
        C9145.m23520("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.c, !C9851.f29812 ? -4 : 0);
            jSONObject.put("sn", this.f39447);
            jSONObject.put(e.m, str);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        WebView webView = (WebView) this.f39446.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:if(!!");
            String str2 = this.f27772;
            stringBuffer.append(str2);
            stringBuffer.append("){");
            stringBuffer.append(str2);
            stringBuffer.append(MotionUtils.EASING_TYPE_FORMAT_START);
            stringBuffer.append(string);
            stringBuffer.append(")}");
            String string2 = stringBuffer.toString();
            C9145.m23520("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string2);
            webView.loadUrl(string2);
        }
    }
}
