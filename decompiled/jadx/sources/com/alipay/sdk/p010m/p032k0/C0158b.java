package com.alipay.sdk.p010m.p032k0;

import com.alipay.sdk.p010m.p018d0.C0106a;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.alipay.sdk.m.k0.b */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class C0158b {
    /* JADX INFO: renamed from: a */
    public static C0159c m720a(DataReportResult dataReportResult) {
        C0159c c0159c = new C0159c();
        if (dataReportResult == null) {
            return null;
        }
        c0159c.f518a = dataReportResult.success;
        c0159c.f519b = dataReportResult.resultCode;
        Map map = dataReportResult.resultData;
        if (map != null) {
            c0159c.f525c = (String) map.get("apdid");
            c0159c.f526d = (String) map.get("apdidToken");
            c0159c.f529g = (String) map.get("dynamicKey");
            c0159c.f530h = (String) map.get("timeInterval");
            c0159c.f531i = (String) map.get("webrtcUrl");
            c0159c.f532j = "";
            String str = (String) map.get("drmSwitch");
            if (C0106a.m567b(str)) {
                if (str.length() >= 1) {
                    c0159c.f527e = "" + str.charAt(0);
                }
                if (str.length() >= 3) {
                    c0159c.f528f = "" + str.charAt(2);
                }
            }
            if (map.containsKey("apse_degrade")) {
                c0159c.f533k = (String) map.get("apse_degrade");
            }
        }
        return c0159c;
    }

    /* JADX INFO: renamed from: a */
    public static DataReportRequest m721a(C0160d c0160d) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (c0160d == null) {
            return null;
        }
        dataReportRequest.f1227os = c0160d.f534a;
        dataReportRequest.rpcVersion = c0160d.f543j;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", c0160d.f535b);
        dataReportRequest.bizData.put("apdidToken", c0160d.f536c);
        dataReportRequest.bizData.put("umidToken", c0160d.f537d);
        dataReportRequest.bizData.put("dynamicKey", c0160d.f538e);
        dataReportRequest.deviceData = c0160d.f539f;
        return dataReportRequest;
    }
}
