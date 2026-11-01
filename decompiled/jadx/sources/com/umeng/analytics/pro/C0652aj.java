package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p067l.C14879;

/* JADX INFO: renamed from: com.umeng.analytics.pro.aj */
/* JADX INFO: compiled from: MBLS */
/* JADX INFO: loaded from: classes.dex */
public class C0652aj implements InterfaceC0730z {
    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        try {
            C14879.m33994(context).getClass();
            if (C14879.m33997()) {
                C14879.m33994(context).getClass();
                return C14879.m33998();
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
