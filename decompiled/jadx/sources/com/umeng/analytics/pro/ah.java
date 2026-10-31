package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C0464;
import l.C0899;
import l.C19516;
import l.C3993;

/* JADX INFO: compiled from: PBLB */
/* JADX INFO: loaded from: classes.dex */
public class ah implements z {
    public boolean a = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!this.a) {
                C0464 c0464 = C19516.f63076;
                Context applicationContext = context.getApplicationContext();
                c0464.getClass();
                C3993.f12657 = C0464.m2055(applicationContext);
                C3993.f12656 = true;
                this.a = true;
            }
            if (!C3993.f12656) {
                throw new RuntimeException("SDK Need Init First!");
            }
            if (C3993.f12657) {
                return C0899.m3249(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
