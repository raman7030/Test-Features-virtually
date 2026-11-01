package com.alipay.apmobilesecuritysdk.p004a;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.otherid.UmidSdkWrapper;
import com.alipay.apmobilesecuritysdk.p007d.C0052e;
import com.alipay.apmobilesecuritysdk.p008e.C0053a;
import com.alipay.apmobilesecuritysdk.p008e.C0054b;
import com.alipay.apmobilesecuritysdk.p008e.C0055c;
import com.alipay.apmobilesecuritysdk.p008e.C0056d;
import com.alipay.apmobilesecuritysdk.p008e.C0060h;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p032k0.C0160d;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.apmobilesecuritysdk.a.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0042b {
    /* JADX INFO: renamed from: a */
    public static C0160d m282a(Context context, Map map) {
        C0160d c0160d = new C0160d();
        m283a(context, c0160d, map);
        c0160d.f539f = C0052e.m308a(context, map);
        return c0160d;
    }

    /* JADX INFO: renamed from: a */
    public static void m283a(Context context, C0160d c0160d, Map map) {
        String str;
        String str2;
        String str3;
        C0054b c0054bM318e;
        C0054b c0054bM317d;
        String str4 = "";
        String strM563a = C0106a.m563a(map, "appName", "");
        String strM563a2 = C0106a.m563a(map, "sessionId", "");
        String strM563a3 = C0106a.m563a(map, "rpcVersion", "");
        String strM269a = C0041a.m269a(context, strM563a);
        String securityToken = UmidSdkWrapper.getSecurityToken(context);
        String strM351d = C0060h.m351d(context);
        if (C0106a.m567b(strM563a2)) {
            c0160d.f536c = strM563a2;
        } else {
            c0160d.f536c = strM269a;
        }
        c0160d.f537d = securityToken;
        c0160d.f538e = strM351d;
        c0160d.f534a = "android";
        C0055c c0055cM324d = C0056d.m324d(context);
        if (c0055cM324d != null) {
            str2 = c0055cM324d.f174a;
            str = c0055cM324d.f176c;
        } else {
            str = "";
            str2 = str;
        }
        if (C0106a.m564a(str2) && (c0054bM317d = C0053a.m317d(context)) != null) {
            str2 = c0054bM317d.f171a;
            str = c0054bM317d.f173c;
        }
        C0055c c0055cM325e = C0056d.m325e(context);
        if (c0055cM325e != null) {
            str4 = c0055cM325e.f174a;
            str3 = c0055cM325e.f176c;
        } else {
            str3 = "";
        }
        if (C0106a.m564a(str4) && (c0054bM318e = C0053a.m318e(context)) != null) {
            str4 = c0054bM318e.f171a;
            str3 = c0054bM318e.f173c;
        }
        c0160d.f541h = str2;
        c0160d.f540g = str4;
        c0160d.f543j = strM563a3;
        if (C0106a.m564a(str2)) {
            c0160d.f535b = str4;
            c0160d.f542i = str3;
        } else {
            c0160d.f535b = str2;
            c0160d.f542i = str;
        }
    }
}
