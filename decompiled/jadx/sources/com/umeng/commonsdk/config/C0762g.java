package com.umeng.commonsdk.config;

import com.umeng.commonsdk.debug.UMRTLog;

/* JADX INFO: renamed from: com.umeng.commonsdk.config.g */
/* JADX INFO: compiled from: XBN9 */
/* JADX INFO: loaded from: classes.dex */
public class C0762g implements InterfaceC0760e {
    @Override // com.umeng.commonsdk.config.InterfaceC0760e
    /* JADX INFO: renamed from: a */
    public void mo2746a(String str, Object obj, String[] strArr) {
        if (str == null || str.length() <= 0) {
            return;
        }
        try {
            long j = Long.parseLong(str);
            if (j == -1) {
                UMRTLog.m2756e("Config", "--->>> SensitiveFieldHandler: handleConfigItem: invalid config value.");
                return;
            }
            UMRTLog.m2757i("Config", "--->>> CollectFieldJudgment: handleConfigItem: item : ".concat(str));
            if (obj == null || !(obj instanceof C0757b)) {
                return;
            }
            for (int i = 0; i < strArr.length; i++) {
                try {
                    String str2 = strArr[i];
                    if (C0759d.m2747a(str2)) {
                        ((C0757b) obj).mo2744a(str2, Boolean.valueOf(C0756a.m2736a(j, i)));
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
        } catch (Throwable unused2) {
            UMRTLog.m2756e("Config", "--->>> SensitiveFieldHandler: handleConfigItem: parseLong exception.");
        }
    }
}
