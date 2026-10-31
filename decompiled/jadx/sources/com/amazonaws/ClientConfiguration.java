package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public String f97;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public String f98;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String f91 = VersionInfoUtils.m798();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f90 = PredefinedRetryPolicies.f450;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public String f94 = f91;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public RetryPolicy f95 = f90;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public Protocol f93 = Protocol.HTTPS;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f96 = 15000;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f92 = 15000;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Protocol m170() {
        return this.f93;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m168(Protocol protocol) {
        this.f93 = protocol;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m171() {
        return this.f94;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final String m176() {
        return this.f98;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m175() {
        this.f98 = "s3drive rclone s3 browser obsidian";
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final RetryPolicy m172() {
        return this.f95;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int m173() {
        return this.f96;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int m167() {
        return this.f92;
    }

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m174() {
        return this.f97;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m169() {
        this.f97 = "UnsignedPayloadSignerType";
    }
}
