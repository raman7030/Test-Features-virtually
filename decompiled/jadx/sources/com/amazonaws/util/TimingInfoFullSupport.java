package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfoFullSupport extends TimingInfo {

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final HashMap f847;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final HashMap f848;

    public TimingInfoFullSupport(long j) {
        super(j, null);
        this.f848 = new HashMap();
        this.f847 = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ֫ */
    public final void mo793(String str, TimingInfo timingInfo) {
        HashMap map = this.f848;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        if (timingInfo.m796()) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.m302(getClass()).mo294("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ֫ */
    public final void mo792(String str) {
        Number number = (Number) this.f847.get(str);
        mo791((number != null ? number.intValue() : 0) + 1, str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ֫ */
    public final void mo791(long j, String str) {
        this.f847.put(str, Long.valueOf(j));
    }
}
