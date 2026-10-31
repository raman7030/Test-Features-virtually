package com.amazonaws.mobileconnectors.s3.transferutility;

import l.C4860;

/* JADX INFO: loaded from: classes.dex */
public enum TransferType {
    UPLOAD,
    DOWNLOAD,
    ANY;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static TransferType m402(String str) {
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
        throw new IllegalArgumentException(C4860.m14172("Type ", str, " is not a recognized type"));
    }
}
