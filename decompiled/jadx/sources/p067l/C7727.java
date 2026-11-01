package p067l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۚ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7727 implements InterfaceC3032 {
    @Override // p067l.InterfaceC3032
    /* JADX INFO: renamed from: ֫ */
    public final void mo5130(Intent intent, Bundle bundle) {
        InterfaceC6386 interfaceC6386M25066 = C10880.m25064().m25066(11101);
        if (interfaceC6386M25066 == null) {
            C11060.m25467("AuthActionHandler", "handleActionAuth listener is null");
            return;
        }
        if (intent == null) {
            C11060.m25467("AuthActionHandler", "handleActionAuth intent null");
            interfaceC6386M25066.mo5757(new C21139(-6, "无法解析回调数据：intent数据为空", "无法解析回调数据：intent数据为空"));
            return;
        }
        int intExtra = intent.getIntExtra("key_auth_result_code", Integer.MIN_VALUE);
        C11060.m25469("AuthActionHandler", "handleActionAuth resultCode: " + intExtra);
        if (intExtra != -1) {
            if (intExtra != 0) {
                interfaceC6386M25066.mo5757(new C21139(-6, C20778.m46922(intExtra, "无法解析回调数据：resultCode="), C20778.m46922(intExtra, "无法解析回调数据：resultCode=")));
                return;
            } else {
                interfaceC6386M25066.mo5756();
                return;
            }
        }
        Bundle bundleExtra = intent.getBundleExtra("key_auth_result_data");
        if (bundleExtra == null) {
            C11060.m25467("AuthActionHandler", "handleActionAuth resultOk but data is null");
            interfaceC6386M25066.mo5757(new C21139(-6, "无法解析回调数据：data为空", "无法解析回调数据：data为空"));
            return;
        }
        try {
            String string = bundleExtra.getString("key_response");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                String strOptString = jSONObject.optString("openid");
                String strOptString2 = jSONObject.optString("access_token");
                String strOptString3 = jSONObject.optString("proxy_code");
                long jOptLong = jSONObject.optLong("proxy_expires_in");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    C11060.m25469("AuthActionHandler", "--checkAuthJsonDataValid--openid and token not empty, setResult ACTIVITY_OK");
                } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                    C11060.m25470("AuthActionHandler", "--checkAuthJsonDataValid--openid or token is empty, setResult ACTIVITY_CANCEL");
                } else {
                    C11060.m25469("AuthActionHandler", "--checkAuthJsonDataValid--proxy_code and proxy_expires_in are valid");
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_action", "action_login");
                intent2.putExtras(bundleExtra);
                C10880.m25064().getClass();
                C10880.m25065(intent2, interfaceC6386M25066);
                return;
            }
        } catch (Exception e) {
            C11060.m25467("AuthActionHandler", "--checkAuthJsonDataValid--parse response failed");
            C11060.m25465("AuthActionHandler", "--checkAuthJsonDataValid--parse response exception", e);
        }
        C11060.m25467("AuthActionHandler", "handleActionAuth resultOk but data is invalid");
        interfaceC6386M25066.mo5757(new C21139(-6, "无法解析回调数据：data解析异常", "无法解析回调数据：data解析异常"));
    }
}
