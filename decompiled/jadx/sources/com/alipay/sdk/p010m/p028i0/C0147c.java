package com.alipay.sdk.p010m.p028i0;

import android.content.Context;
import com.alipay.android.phone.mrpc.core.AbstractC0038x;
import com.alipay.android.phone.mrpc.core.C0011ab;
import com.alipay.android.phone.mrpc.core.C0022h;
import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.sdk.p010m.p030j0.C0155a;
import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.alipay.tscenter.biz.rpc.report.general.DataReportService;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.alipay.sdk.m.i0.c */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0147c implements InterfaceC0145a {

    /* JADX INFO: renamed from: d */
    public static C0147c f495d;

    /* JADX INFO: renamed from: e */
    public static DataReportResult f496e;

    /* JADX INFO: renamed from: a */
    public AbstractC0038x f497a;

    /* JADX INFO: renamed from: b */
    public BugTrackMessageService f498b;

    /* JADX INFO: renamed from: c */
    public DataReportService f499c;

    public C0147c(Context context, String str) {
        this.f497a = null;
        this.f498b = null;
        this.f499c = null;
        C0011ab c0011ab = new C0011ab();
        c0011ab.m156a(str);
        C0022h c0022h = new C0022h(context);
        this.f497a = c0022h;
        this.f498b = (BugTrackMessageService) c0022h.mo191a(BugTrackMessageService.class, c0011ab);
        this.f499c = (DataReportService) this.f497a.mo191a(DataReportService.class, c0011ab);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C0147c m709a(Context context, String str) {
        if (f495d == null) {
            f495d = new C0147c(context, str);
        }
        return f495d;
    }

    @Override // com.alipay.sdk.p010m.p028i0.InterfaceC0145a
    /* JADX INFO: renamed from: a */
    public DataReportResult mo708a(DataReportRequest dataReportRequest) throws InterruptedException {
        if (dataReportRequest == null) {
            return null;
        }
        if (this.f499c != null) {
            f496e = null;
            new Thread(new RunnableC0146b(this, dataReportRequest)).start();
            for (int i = C0155a.f509a; f496e == null && i >= 0; i -= 50) {
                Thread.sleep(50L);
            }
        }
        return f496e;
    }

    @Override // com.alipay.sdk.p010m.p028i0.InterfaceC0145a
    public boolean logCollect(String str) {
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        if (C0106a.m564a(str) || (bugTrackMessageService = this.f498b) == null) {
            return false;
        }
        try {
            strLogCollect = bugTrackMessageService.logCollect(C0106a.m571f(str));
        } catch (Throwable unused) {
            strLogCollect = null;
        }
        if (C0106a.m564a(strLogCollect)) {
            return false;
        }
        return ((Boolean) new JSONObject(strLogCollect).get("success")).booleanValue();
    }
}
