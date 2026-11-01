package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: renamed from: com.umeng.analytics.filter.b */
/* JADX INFO: compiled from: IBL9 */
/* JADX INFO: loaded from: classes2.dex */
public class C0639b extends EventList {

    /* JADX INFO: renamed from: a */
    public C0641d f2201a;

    /* JADX INFO: renamed from: b */
    public Object f2202b;

    public C0639b(String str, String str2) {
        super(str, str2);
        this.f2202b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zM2110a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return true;
        }
        synchronized (this.f2202b) {
            if (this.f2201a == null) {
                this.f2201a = new C0641d(true, this.mEventList);
            }
            zM2110a = this.f2201a.m2110a(str);
        }
        return zM2110a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_WL = z;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f2202b) {
            this.f2201a = null;
            this.f2201a = new C0641d(true, this.mEventList);
        }
    }
}
