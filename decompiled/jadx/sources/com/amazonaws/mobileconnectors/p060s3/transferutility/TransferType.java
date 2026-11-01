package com.amazonaws.mobileconnectors.p060s3.transferutility;

import p067l.C6988;

/* JADX INFO: loaded from: classes.dex */
public enum TransferType {
    UPLOAD,
    DOWNLOAD,
    ANY;

    /* JADX INFO: renamed from: ֫ */
    public static TransferType m1568(String str) {
        TransferType transferType = UPLOAD;
        if (str.equalsIgnoreCase(transferType.toString())) {
            return transferType;
        }
        TransferType transferType2 = DOWNLOAD;
        if (str.equalsIgnoreCase(transferType2.toString())) {
            return transferType2;
        }
        TransferType transferType3 = ANY;
        if (str.equalsIgnoreCase(transferType3.toString())) {
            return transferType3;
        }
        throw new IllegalArgumentException(C6988.m16053("Type ", str, " is not a recognized type"));
    }
}
