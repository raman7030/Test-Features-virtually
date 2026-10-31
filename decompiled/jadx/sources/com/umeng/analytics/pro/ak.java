package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C4698;

/* JADX INFO: compiled from: NBM2 */
/* JADX INFO: loaded from: classes.dex */
public class ak implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!C4698.m13773()) {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
                return null;
            }
            return C4698.m13772(context);
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
