package com.alipay.sdk.m.i0;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {
    public final /* synthetic */ DataReportRequest a;
    public final /* synthetic */ c b;

    public b(c cVar, DataReportRequest dataReportRequest) {
        this.a = dataReportRequest;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            DataReportResult unused = c.e = this.b.c.reportData(this.a);
        } catch (Throwable th) {
            DataReportResult unused2 = c.e = new DataReportResult();
            c.e.success = false;
            c.e.resultCode = "static data rpc upload error, " + com.alipay.sdk.m.d0.a.a(th);
            com.alipay.sdk.m.d0.a.a(th);
        }
    }
}
