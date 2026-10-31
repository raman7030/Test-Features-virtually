package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: V4Q8 */
/* JADX INFO: loaded from: classes.dex */
public class g extends a {
    public static final String a = "mac";
    public Context b;

    public g(Context context) {
        super(a);
        this.b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            return DeviceConfig.getMac(this.b);
        } catch (Exception e) {
            String str = AnalyticsConstants.OS;
            UMCrashManager.reportCrash(this.b, e);
            return null;
        }
    }
}
