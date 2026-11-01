package p067l;

import android.content.Intent;
import com.alipay.sdk.p010m.p058y.C0252o;
import com.umeng.analytics.pro.C0708d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10880 {

    /* JADX INFO: renamed from: ۧ */
    public static C10880 f30140;

    /* JADX INFO: renamed from: ֫ */
    public Map f30141;

    /* JADX INFO: renamed from: ֫ */
    public static C10880 m25064() {
        if (f30140 == null) {
            C10880 c10880 = new C10880();
            Map mapSynchronizedMap = C21562.synchronizedMap(new HashMap());
            c10880.f30141 = mapSynchronizedMap;
            if (mapSynchronizedMap == null) {
                c10880.f30141 = C21562.synchronizedMap(new HashMap());
            }
            f30140 = c10880;
        }
        return f30140;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m25068(InterfaceC6386 interfaceC6386) {
        String strM22691 = C9718.m22691(11101);
        if (strM22691 == null) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=11101");
            return;
        }
        synchronized (this.f30141) {
            Map map = this.f30141;
            C11551 c11551 = new C11551();
            c11551.f32210 = interfaceC6386;
        }
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6386 m25066(int i) {
        String strM22691 = C9718.m22691(i);
        if (strM22691 == null) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
            return null;
        }
        return m25067(strM22691);
    }

    /* JADX INFO: renamed from: ֫ */
    public final InterfaceC6386 m25067(String str) {
        C11551 c11551;
        if (str == null) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f30141) {
            c11551 = (C11551) this.f30141.get(str);
            this.f30141.remove(str);
        }
        if (c11551 == null) {
            return null;
        }
        return c11551.f32210;
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m25065(Intent intent, InterfaceC6386 interfaceC6386) {
        C11060.m25469("openSDK_LOG.UIListenerManager", "handleDataToListener");
        String stringExtra = intent.getStringExtra("key_action");
        if (!"action_login".equals(stringExtra)) {
            if ("action_share".equals(stringExtra)) {
                String stringExtra2 = intent.getStringExtra(C0252o.f1208c);
                String stringExtra3 = intent.getStringExtra("response");
                if ("cancel".equals(stringExtra2)) {
                    interfaceC6386.mo5756();
                    return;
                }
                if (C0708d.f2599O.equals(stringExtra2)) {
                    interfaceC6386.mo5757(new C21139(-6, "unknown error", C17588.m40053(stringExtra3, "")));
                    return;
                } else {
                    if ("complete".equals(stringExtra2)) {
                        try {
                            interfaceC6386.mo5758(new JSONObject(stringExtra3 == null ? "{\"ret\": 0}" : stringExtra3));
                            return;
                        } catch (JSONException unused) {
                            interfaceC6386.mo5757(new C21139(-4, "json error", C17588.m40053(stringExtra3, "")));
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        int intExtra = intent.getIntExtra("key_error_code", 0);
        if (intExtra != 0) {
            C11060.m25467("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
            interfaceC6386.mo5757(new C21139(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra4 = intent.getStringExtra("key_response");
        if (stringExtra4 == null) {
            C11060.m25464("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
            interfaceC6386.mo5758(new JSONObject());
            return;
        }
        try {
            interfaceC6386.mo5758(C19797.m45010(stringExtra4));
        } catch (JSONException e) {
            interfaceC6386.mo5757(new C21139(-4, "服务器返回数据格式有误!", stringExtra4));
            C11060.m25465("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
        }
    }
}
