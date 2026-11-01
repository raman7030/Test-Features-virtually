package com.umeng.analytics.filter;

import android.text.TextUtils;
import com.umeng.analytics.AnalyticsConfig;

/* JADX INFO: renamed from: com.umeng.analytics.filter.a */
/* JADX INFO: compiled from: YBKP */
/* JADX INFO: loaded from: classes2.dex */
public class C0638a extends EventList {

    /* JADX INFO: renamed from: a */
    public C0641d f2199a;

    /* JADX INFO: renamed from: b */
    public Object f2200b;

    public C0638a(String str, String str2) {
        super(str, str2);
        this.f2200b = new Object();
    }

    @Override // com.umeng.analytics.filter.EventList
    public boolean matchHit(String str) {
        boolean zM2110a;
        if (TextUtils.isEmpty(this.mEventList)) {
            return false;
        }
        synchronized (this.f2200b) {
            if (this.f2199a == null) {
                this.f2199a = new C0641d(false, this.mEventList);
            }
            zM2110a = this.f2199a.m2110a(str);
        }
        return zM2110a;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void setMD5ClearFlag(boolean z) {
        AnalyticsConfig.CLEAR_EKV_BL = z;
    }

    @Override // com.umeng.analytics.filter.EventList
    public void eventListChange() {
        if (TextUtils.isEmpty(this.mEventList)) {
            return;
        }
        synchronized (this.f2200b) {
            this.f2199a = null;
            this.f2199a = new C0641d(false, this.mEventList);
        }
    }
}
