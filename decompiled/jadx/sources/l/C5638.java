package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۚ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C5638 implements InterfaceC0698 {
    @Override // l.InterfaceC0698
    /* JADX INFO: renamed from: ֫ */
    public final void mo2785(Intent intent, Bundle bundle) {
        InterfaceC4227 interfaceC4227M23092 = C8956.m23090().m23092(11101);
        if (interfaceC4227M23092 == null) {
            C9145.m23516("AuthActionHandler", "handleActionAuth listener is null");
            return;
        }
        if (intent == null) {
            C9145.m23516("AuthActionHandler", "handleActionAuth intent null");
            interfaceC4227M23092.mo3454(new C19750(-6, "无法解析回调数据：intent数据为空", "无法解析回调数据：intent数据为空"));
            return;
        }
        int intExtra = intent.getIntExtra("key_auth_result_code", Integer.MIN_VALUE);
        C9145.m23518("AuthActionHandler", "handleActionAuth resultCode: " + intExtra);
        if (intExtra != -1) {
            if (intExtra != 0) {
                interfaceC4227M23092.mo3454(new C19750(-6, C19370.m44628(intExtra, "无法解析回调数据：resultCode="), C19370.m44628(intExtra, "无法解析回调数据：resultCode=")));
                return;
            } else {
                interfaceC4227M23092.mo3453();
                return;
            }
        }
        Bundle bundleExtra = intent.getBundleExtra("key_auth_result_data");
        if (bundleExtra == null) {
            C9145.m23516("AuthActionHandler", "handleActionAuth resultOk but data is null");
            interfaceC4227M23092.mo3454(new C19750(-6, "无法解析回调数据：data为空", "无法解析回调数据：data为空"));
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
                    C9145.m23518("AuthActionHandler", "--checkAuthJsonDataValid--openid and token not empty, setResult ACTIVITY_OK");
                } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                    C9145.m23519("AuthActionHandler", "--checkAuthJsonDataValid--openid or token is empty, setResult ACTIVITY_CANCEL");
                } else {
                    C9145.m23518("AuthActionHandler", "--checkAuthJsonDataValid--proxy_code and proxy_expires_in are valid");
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_action", "action_login");
                intent2.putExtras(bundleExtra);
                C8956.m23090().getClass();
                C8956.m23091(intent2, interfaceC4227M23092);
                return;
            }
        } catch (Exception e) {
            C9145.m23516("AuthActionHandler", "--checkAuthJsonDataValid--parse response failed");
            C9145.m23514("AuthActionHandler", "--checkAuthJsonDataValid--parse response exception", e);
        }
        C9145.m23516("AuthActionHandler", "handleActionAuth resultOk but data is invalid");
        interfaceC4227M23092.mo3454(new C19750(-6, "无法解析回调数据：data解析异常", "无法解析回调数据：data解析异常"));
    }
}
