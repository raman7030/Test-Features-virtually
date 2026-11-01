package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* JADX INFO: renamed from: ᩳ */
    public static final Log f1976 = LogFactory.m1469("com.amazonaws.latency");

    /* JADX INFO: renamed from: ۧ */
    public final HashMap f1977;

    /* JADX INFO: renamed from: ܽ */
    public final HashMap f1978;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(System.nanoTime()));
        System.currentTimeMillis();
        this.f1978 = new HashMap();
        this.f1977 = new HashMap();
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ܽ */
    public final void mo1901(AWSRequestMetrics.Field field) {
        this.f1977.put(field.name(), new TimingInfoFullSupport(System.nanoTime()));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ֫ */
    public final void mo1897(AWSRequestMetrics.Field field) {
        String strName = field.name();
        TimingInfo timingInfo = (TimingInfo) this.f1977.get(strName);
        if (timingInfo == null) {
            LogFactory.m1468(getClass()).mo1466("Trying to end an event which was never started: " + strName);
            return;
        }
        timingInfo.mo1955();
        this.f1954.mo1958(strName, new TimingInfoUnmodifiable(timingInfo.m1960(), Long.valueOf(timingInfo.m1959())));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ۧ */
    public final void mo1900(AWSRequestMetrics.Field field) {
        this.f1954.mo1957(field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ֫ */
    public final void mo1898(AWSRequestMetrics.Field field, long j) {
        this.f1954.mo1956(j, field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    /* JADX INFO: renamed from: ֫ */
    public final void mo1899(AWSRequestMetrics.Field field, Serializable serializable) {
        String strName = field.name();
        HashMap map = this.f1978;
        List arrayList = (List) map.get(strName);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(strName, arrayList);
        }
        arrayList.add(serializable);
    }
}
