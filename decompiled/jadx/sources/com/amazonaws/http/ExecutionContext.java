package com.amazonaws.http;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetricsFullSupport;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class ExecutionContext {

    /* JADX INFO: renamed from: ֫ */
    public final AWSRequestMetrics f1343;

    /* JADX INFO: renamed from: ۧ */
    public AWSCredentials f1344;

    /* JADX INFO: renamed from: ܽ */
    public final List f1345;

    public ExecutionContext(CopyOnWriteArrayList copyOnWriteArrayList, boolean z) {
        this.f1345 = copyOnWriteArrayList;
        this.f1343 = z ? new AWSRequestMetricsFullSupport() : new AWSRequestMetrics();
    }

    /* JADX INFO: renamed from: ܽ */
    public final List m1423() {
        return this.f1345;
    }

    @Deprecated
    /* JADX INFO: renamed from: ֫ */
    public final AWSRequestMetrics m1420() {
        return this.f1343;
    }

    /* JADX INFO: renamed from: ۧ */
    public final AWSCredentials m1422() {
        return this.f1344;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1421(AWSCredentials aWSCredentials) {
        this.f1344 = aWSCredentials;
    }
}
