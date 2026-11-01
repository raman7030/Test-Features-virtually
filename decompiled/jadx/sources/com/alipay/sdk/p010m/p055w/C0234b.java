package com.alipay.sdk.p010m.p055w;

import android.content.Context;
import com.alipay.sdk.p010m.p012a0.C0084b;
import com.alipay.sdk.p010m.p039o.C0181c;
import java.io.File;

/* JADX INFO: renamed from: com.alipay.sdk.m.w.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0234b {

    /* JADX INFO: renamed from: b */
    public static C0234b f1112b;

    /* JADX INFO: renamed from: a */
    public Context f1113a;

    /* JADX INFO: renamed from: c */
    public static C0234b m1121c() {
        if (f1112b == null) {
            f1112b = new C0234b();
        }
        return f1112b;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m1122e() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void m1124a(Context context) {
        C0181c.m880a();
        this.f1113a = context.getApplicationContext();
    }

    /* JADX INFO: renamed from: b */
    public Context m1125b() {
        return this.f1113a;
    }

    /* JADX INFO: renamed from: d */
    public String m1126d() {
        return C0084b.m452c(null, this.f1113a);
    }

    /* JADX INFO: renamed from: a */
    public C0181c m1123a() {
        return C0181c.m880a();
    }
}
