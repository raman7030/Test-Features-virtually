package com.amazonaws.mobileconnectors.s3.transferutility;

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


    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Map f348 = new HashMap();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Log f349;

    static {
        for (TransferState transferState : values()) {
            f348.put(transferState.toString(), transferState);
        }
        f349 = LogFactory.m302(TransferState.class);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TransferState m388(String str) {
        Map map = f348;
        if (map.containsKey(str)) {
            return (TransferState) map.get(str);
        }
        f349.mo291("Unknown state " + str + " transfer will be have state set to UNKNOWN.");
        return UNKNOWN;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m389(TransferState transferState) {
        return COMPLETED.equals(transferState) || FAILED.equals(transferState) || CANCELED.equals(transferState);
    }
}
