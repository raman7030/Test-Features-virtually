package com.amazonaws;

import com.google.android.material.motion.MotionUtils;
import l.C9045;

/* JADX INFO: loaded from: classes.dex */
public class AmazonServiceException extends AmazonClientException {
    public static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f70;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f71;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public String f72;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f73;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public String f74;

    public enum ErrorType {
        Client,
        Service,
        Unknown
    }

    public AmazonServiceException(String str) {
        super(str);
        ErrorType errorType = ErrorType.Client;
        this.f74 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final void m148(String str) {
        this.f72 = str;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String m147() {
        return this.f72;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m150(String str) {
        this.f71 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m144(String str) {
        this.f73 = str;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public String m142() {
        return this.f73;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String m145() {
        return this.f74;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m143(int i) {
        this.f70 = i;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int m149() {
        return this.f70;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f74);
        sb.append(" (Service: ");
        sb.append(this.f71);
        sb.append("; Status Code: ");
        sb.append(this.f70);
        sb.append("; Error Code: ");
        sb.append(m142());
        sb.append("; Request ID: ");
        return C9045.m23341(sb, this.f72, MotionUtils.EASING_TYPE_FORMAT_END);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m146(String str) {
        this.f74 = str;
    }
}
