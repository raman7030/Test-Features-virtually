package com.umeng.analytics.pro;

import android.content.Context;
import android.content.SharedPreferences;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: renamed from: com.umeng.analytics.pro.x */
/* JADX INFO: compiled from: UBKG */
/* JADX INFO: loaded from: classes.dex */
public class C0728x implements InterfaceC0727w {

    /* JADX INFO: renamed from: a */
    public long f2969a = AnalyticsConfig.kContinueSessionMillis;

    @Override // com.umeng.analytics.pro.InterfaceC0727w
    /* JADX INFO: renamed from: a */
    public void mo2663a(long j) {
        this.f2969a = j;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0727w
    /* JADX INFO: renamed from: a */
    public long mo2661a() {
        return this.f2969a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0727w
    /* JADX INFO: renamed from: a */
    public String mo2662a(Context context) {
        String appkey = UMUtils.getAppkey(context);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (appkey == null) {
            throw new RuntimeException("Appkey is null or empty, Please check!");
        }
        return UMUtils.MD5(jCurrentTimeMillis + appkey + Envelope.dummyID2);
    }

    @Override // com.umeng.analytics.pro.InterfaceC0727w
    /* JADX INFO: renamed from: a */
    public boolean mo2665a(long j, long j2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return (j == 0 || jCurrentTimeMillis - j >= this.f2969a) && j2 > 0 && jCurrentTimeMillis - j2 > this.f2969a;
    }

    @Override // com.umeng.analytics.pro.InterfaceC0727w
    /* JADX INFO: renamed from: a */
    public void mo2664a(Context context, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            SharedPreferences.Editor editorEdit = PreferenceWrapper.getDefault(context).edit();
            editorEdit.putString("session_id", str);
            editorEdit.putLong(C0725u.f2950b, 0L);
            editorEdit.putLong(C0725u.f2953e, jCurrentTimeMillis);
            editorEdit.putLong(C0725u.f2954f, 0L);
            editorEdit.commit();
        } catch (Exception unused) {
        }
    }
}
