package l;

import android.content.Intent;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡܶۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C8956 {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static C8956 f27206;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public Map f27207;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static C8956 m23090() {
        if (f27206 == null) {
            C8956 c8956 = new C8956();
            Map mapSynchronizedMap = C20195.synchronizedMap(new HashMap());
            c8956.f27207 = mapSynchronizedMap;
            if (mapSynchronizedMap == null) {
                c8956.f27207 = C20195.synchronizedMap(new HashMap());
            }
            f27206 = c8956;
        }
        return f27206;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m23094(InterfaceC4227 interfaceC4227) {
        String strM20711 = C7733.m20711(11101);
        if (strM20711 == null) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=11101");
            return;
        }
        synchronized (this.f27207) {
            Map map = this.f27207;
            C9662 c9662 = new C9662();
            c9662.f29261 = interfaceC4227;
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4227 m23092(int i) {
        String strM20711 = C7733.m20711(i);
        if (strM20711 == null) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
            return null;
        }
        return m23093(strM20711);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC4227 m23093(String str) {
        C9662 c9662;
        if (str == null) {
            C9145.m23516("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f27207) {
            c9662 = (C9662) this.f27207.get(str);
            this.f27207.remove(str);
        }
        if (c9662 == null) {
            return null;
        }
        return c9662.f29261;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static void m23091(Intent intent, InterfaceC4227 interfaceC4227) {
        C9145.m23518("openSDK_LOG.UIListenerManager", "handleDataToListener");
        String stringExtra = intent.getStringExtra("key_action");
        if (!"action_login".equals(stringExtra)) {
            if ("action_share".equals(stringExtra)) {
                String stringExtra2 = intent.getStringExtra(o.c);
                String stringExtra3 = intent.getStringExtra("response");
                if ("cancel".equals(stringExtra2)) {
                    interfaceC4227.mo3453();
                    return;
                }
                if (d.O.equals(stringExtra2)) {
                    interfaceC4227.mo3454(new C19750(-6, "unknown error", C16014.m37867(stringExtra3, "")));
                    return;
                } else {
                    if ("complete".equals(stringExtra2)) {
                        try {
                            interfaceC4227.mo3455(new JSONObject(stringExtra3 == null ? "{\"ret\": 0}" : stringExtra3));
                            return;
                        } catch (JSONException unused) {
                            interfaceC4227.mo3454(new C19750(-4, "json error", C16014.m37867(stringExtra3, "")));
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
            C9145.m23516("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
            interfaceC4227.mo3454(new C19750(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra4 = intent.getStringExtra("key_response");
        if (stringExtra4 == null) {
            C9145.m23513("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
            interfaceC4227.mo3455(new JSONObject());
            return;
        }
        try {
            interfaceC4227.mo3455(C18338.m42748(stringExtra4));
        } catch (JSONException e) {
            interfaceC4227.mo3454(new C19750(-4, "服务器返回数据格式有误!", stringExtra4));
            C9145.m23514("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
        }
    }
}
