package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TimingInfoFullSupport extends TimingInfo {

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f2007;

    /* JADX INFO: renamed from: ᩳ */
    public final HashMap f2008;

    public TimingInfoFullSupport(long j) {
        super(j, null);
        this.f2008 = new HashMap();
        this.f2007 = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ֫ */
    public final void mo1958(String str, TimingInfo timingInfo) {
        HashMap map = this.f2008;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        if (timingInfo.m1961()) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.m1468(getClass()).mo1460("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ֫ */
    public final void mo1957(String str) {
        Number number = (Number) this.f2007.get(str);
        mo1956((number != null ? number.intValue() : 0) + 1, str);
    }

    @Override // com.amazonaws.util.TimingInfo
    /* JADX INFO: renamed from: ֫ */
    public final void mo1956(long j, String str) {
        this.f2007.put(str, Long.valueOf(j));
    }
}
