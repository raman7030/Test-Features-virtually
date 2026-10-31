package com.alipay.tscenter.biz.rpc.report.general.model;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public class DataReportRequest implements Serializable {
    public Map bizData;
    public String bizType;
    public Map deviceData;
    public String os;
    public String rpcVersion;
}
