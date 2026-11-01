package com.alipay.sdk.p010m.p028i0;

import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: renamed from: com.alipay.sdk.m.i0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC0146b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DataReportRequest f493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0147c f494b;

    public RunnableC0146b(C0147c c0147c, DataReportRequest dataReportRequest) {
        this.f493a = dataReportRequest;
        this.f494b = c0147c;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = C0147c.f496e = this.f494b.f499c.reportData(this.f493a);
        } catch (Throwable th) {
            DataReportResult unused2 = C0147c.f496e = new DataReportResult();
            C0147c.f496e.success = false;
            C0147c.f496e.resultCode = "static data rpc upload error, " + C0106a.m562a(th);
            C0106a.m562a(th);
        }
    }
}
