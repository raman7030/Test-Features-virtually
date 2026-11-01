package com.alipay.sdk.p010m.p024g0;

import com.alipay.sdk.p010m.p018d0.C0106a;
import java.io.File;

/* JADX INFO: renamed from: com.alipay.sdk.m.g0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0132b {
    /* JADX INFO: renamed from: a */
    public static String m671a(String str) {
        String strM680a;
        try {
            strM680a = C0136f.m680a(str);
        } catch (Throwable unused) {
            strM680a = "";
        }
        if (!C0106a.m564a(strM680a)) {
            return strM680a;
        }
        return C0133c.m673a(".SystemConfig" + File.separator + str);
    }

    /* JADX INFO: renamed from: a */
    public static void m672a(String str, String str2) {
        try {
            C0136f.m681a(str, str2);
        } catch (Throwable unused) {
        }
        if (C0133c.m675a()) {
            C0133c.m674a(".SystemConfig" + File.separator + str, str2);
        }
    }
}
