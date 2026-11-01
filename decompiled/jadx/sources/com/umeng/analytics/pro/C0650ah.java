package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p067l.C20916;
import p067l.C2809;
import p067l.C3223;
import p067l.C6163;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ah */
/* JADX INFO: compiled from: PBLB */
/* JADX INFO: loaded from: classes.dex */
public class C0650ah implements InterfaceC0730z {

    /* JADX INFO: renamed from: a */
    public boolean f2241a = false;

    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        try {
            if (!this.f2241a) {
                C2809 c2809 = C20916.f65696;
                Context applicationContext = context.getApplicationContext();
                c2809.getClass();
                C6163.f15473 = C2809.m4435(applicationContext);
                C6163.f15472 = true;
                this.f2241a = true;
            }
            if (!C6163.f15472) {
                throw new RuntimeException("SDK Need Init First!");
            }
            if (C6163.f15473) {
                return C3223.m5568(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
