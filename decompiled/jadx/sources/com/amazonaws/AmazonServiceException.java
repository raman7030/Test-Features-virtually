package com.amazonaws;

import com.google.android.material.motion.MotionUtils;
import p067l.C10965;

/* JADX INFO: loaded from: classes.dex */
public class AmazonServiceException extends AmazonClientException {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ */
    public int f1230;

    /* JADX INFO: renamed from: ۙ */
    public String f1231;

    /* JADX INFO: renamed from: ᩶ */
    public String f1232;

    /* JADX INFO: renamed from: ᩸ */
    public String f1233;

    /* JADX INFO: renamed from: ᩹ */
    public String f1234;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        ErrorType errorType = ErrorType.Client;
        this.f1234 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final void m1315(String str) {
        this.f1232 = str;
    }

    /* JADX INFO: renamed from: ܽ */
    public final String m1314() {
        return this.f1232;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final void m1317(String str) {
        this.f1231 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1311(String str) {
        this.f1233 = str;
    }

    /* JADX INFO: renamed from: ֫ */
    public String m1309() {
        return this.f1233;
    }

    /* JADX INFO: renamed from: ۧ */
    public final String m1312() {
        return this.f1234;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1310(int i) {
        this.f1230 = i;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final int m1316() {
        return this.f1230;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1234);
        sb.append(" (Service: ");
        sb.append(this.f1231);
        sb.append("; Status Code: ");
        sb.append(this.f1230);
        sb.append("; Error Code: ");
        sb.append(m1309());
        sb.append("; Request ID: ");
        return C10965.m25286(sb, this.f1232, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1313(String str) {
        this.f1234 = str;
    }
}
