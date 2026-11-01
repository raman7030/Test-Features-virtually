package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: renamed from: com.umeng.commonsdk.statistics.idtracking.g */
/* JADX INFO: compiled from: V4Q8 */
/* JADX INFO: loaded from: classes.dex */
public class C0808g extends AbstractC0802a {

    /* JADX INFO: renamed from: a */
    public static final String f3432a = "mac";

    /* JADX INFO: renamed from: b */
    public Context f3433b;

    public C0808g(Context context) {
        super(f3432a);
        this.f3433b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.AbstractC0802a
    /* JADX INFO: renamed from: f */
    public String mo3066f() {
        try {
            return DeviceConfig.getMac(this.f3433b);
        } catch (Exception e) {
            String str = AnalyticsConstants.f3338OS;
            UMCrashManager.reportCrash(this.f3433b, e);
            return null;
        }
    }
}
