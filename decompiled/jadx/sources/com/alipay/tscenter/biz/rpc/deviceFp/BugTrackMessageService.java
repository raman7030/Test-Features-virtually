package com.alipay.tscenter.biz.rpc.deviceFp;

import com.alipay.mobile.framework.service.annotation.OperationType;

/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public interface BugTrackMessageService {
    @OperationType("alipay.security.errorLog.collect")
    String logCollect(String str);
}
