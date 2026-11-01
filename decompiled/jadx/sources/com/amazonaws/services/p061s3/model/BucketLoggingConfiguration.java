package com.amazonaws.services.p061s3.model;

import java.io.Serializable;
import p067l.C9179;

/* JADX INFO: loaded from: classes.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸ */
    public String f1705 = null;

    /* JADX INFO: renamed from: ᩹ */
    public String f1706 = null;

    /* JADX INFO: renamed from: ۧ */
    public final void m1700(String str) {
        if (str == null) {
            str = "";
        }
        this.f1706 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1699(String str) {
        this.f1705 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration enabled=");
        sb.append((this.f1705 == null || this.f1706 == null) ? false : true);
        String string = sb.toString();
        if (this.f1705 == null || this.f1706 == null) {
            return string;
        }
        StringBuilder sbM21133 = C9179.m21133(string, ", destinationBucketName=");
        sbM21133.append(this.f1705);
        sbM21133.append(", logFilePrefix=");
        sbM21133.append(this.f1706);
        return sbM21133.toString();
    }
}
