package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import p067l.C6833;

/* JADX INFO: renamed from: com.umeng.analytics.pro.ak */
/* JADX INFO: compiled from: NBM2 */
/* JADX INFO: loaded from: classes.dex */
public class C0653ak implements InterfaceC0730z {
    @Override // com.umeng.analytics.pro.InterfaceC0730z
    /* JADX INFO: renamed from: a */
    public String mo2131a(Context context) {
        try {
            if (!C6833.m15648()) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
                return null;
            }
            return C6833.m15647(context);
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
