package com.alipay.sdk.m.k0;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class b {
    public static c a(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.a = dataReportResult.success;
        cVar.b = dataReportResult.resultCode;
        Map map = dataReportResult.resultData;
        if (map != null) {
            cVar.c = (String) map.get("apdid");
            cVar.d = (String) map.get("apdidToken");
            cVar.g = (String) map.get("dynamicKey");
            cVar.h = (String) map.get("timeInterval");
            cVar.i = (String) map.get("webrtcUrl");
            cVar.j = "";
            String str = (String) map.get("drmSwitch");
            if (com.alipay.sdk.m.d0.a.b(str)) {
                if (str.length() >= 1) {
                    cVar.e = "" + str.charAt(0);
                }
                if (str.length() >= 3) {
                    cVar.f = "" + str.charAt(2);
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.k = (String) map.get("apse_degrade");
            }
        }
        return cVar;
    }

    public static DataReportRequest a(d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            return null;
        }
        dataReportRequest.os = dVar.a;
        dataReportRequest.rpcVersion = dVar.j;
        dataReportRequest.bizType = "1";
        HashMap map = new HashMap();
        dataReportRequest.bizData = map;
        map.put("apdid", dVar.b);
        dataReportRequest.bizData.put("apdidToken", dVar.c);
        dataReportRequest.bizData.put("umidToken", dVar.d);
        dataReportRequest.bizData.put("dynamicKey", dVar.e);
        dataReportRequest.deviceData = dVar.f;
        return dataReportRequest;
    }
}
