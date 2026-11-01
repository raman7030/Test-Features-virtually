package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtilityOptions implements Serializable {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ᩶ */
    public static final Log f1539 = LogFactory.m1468(TransferUtilityOptions.class);

    /* JADX INFO: renamed from: ᩹ */
    public static final /* synthetic */ int f1540 = 0;

    /* JADX INFO: renamed from: ᩸ */
    public TransferNetworkConnectionType f1541;

    public TransferUtilityOptions() {
        Runtime.getRuntime().availableProcessors();
        this.f1541 = TransferNetworkConnectionType.f1458;
    }
}
