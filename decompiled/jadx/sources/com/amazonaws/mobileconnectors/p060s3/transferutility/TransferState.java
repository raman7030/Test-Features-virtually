package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public enum TransferState {
    WAITING,
    IN_PROGRESS,
    PAUSED,
    RESUMED_WAITING,
    COMPLETED,
    CANCELED,
    FAILED,
    WAITING_FOR_NETWORK,
    PART_COMPLETED,
    PENDING_CANCEL,
    PENDING_PAUSE,
    PENDING_NETWORK_DISCONNECT,
    UNKNOWN;


    /* JADX INFO: renamed from: ۫ */
    public static final Map f1508 = new HashMap();

    /* JADX INFO: renamed from: ۬ */
    public static final Log f1509;

    static {
        for (TransferState transferState : values()) {
            f1508.put(transferState.toString(), transferState);
        }
        f1509 = LogFactory.m1468(TransferState.class);
    }

    /* JADX INFO: renamed from: ֫ */
    public static TransferState m1554(String str) {
        Map map = f1508;
        if (map.containsKey(str)) {
            return (TransferState) map.get(str);
        }
        f1509.mo1457("Unknown state " + str + " transfer will be have state set to UNKNOWN.");
        return UNKNOWN;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1555(TransferState transferState) {
        return COMPLETED.equals(transferState) || FAILED.equals(transferState) || CANCELED.equals(transferState);
    }
}
