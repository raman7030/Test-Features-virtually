package com.amazonaws.services.s3.model;

import java.io.Serializable;
import l.C7166;

/* JADX INFO: loaded from: classes.dex */
public class BucketLoggingConfiguration implements Serializable {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f545 = null;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f546 = null;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m534(String str) {
        if (str == null) {
            str = "";
        }
        this.f546 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m533(String str) {
        this.f545 = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoggingConfiguration enabled=");
        sb.append((this.f545 == null || this.f546 == null) ? false : true);
        String string = sb.toString();
        if (this.f545 == null || this.f546 == null) {
            return string;
        }
        StringBuilder sbM19190 = C7166.m19190(string, ", destinationBucketName=");
        sbM19190.append(this.f545);
        sbM19190.append(", logFilePrefix=");
        sbM19190.append(this.f546);
        return sbM19190.toString();
    }
}
