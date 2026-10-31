package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;
import l.C13164;

/* JADX INFO: compiled from: MBLS */
/* JADX INFO: loaded from: classes.dex */
public class aj implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            C13164.m31898(context).getClass();
            if (C13164.m31901()) {
                C13164.m31898(context).getClass();
                return C13164.m31902();
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
