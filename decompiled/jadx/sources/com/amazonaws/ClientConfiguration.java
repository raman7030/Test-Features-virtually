package com.amazonaws;

import com.amazonaws.retry.PredefinedRetryPolicies;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class ClientConfiguration {

    /* JADX INFO: renamed from: ᩳ */
    public String f1257;

    /* JADX INFO: renamed from: ᩻ */
    public String f1258;

    /* JADX INFO: renamed from: ᩷ */
    public static final String f1251 = VersionInfoUtils.m1963();

    /* JADX INFO: renamed from: ۜ */
    public static final RetryPolicy f1250 = PredefinedRetryPolicies.f1610;

    /* JADX INFO: renamed from: ܳ */
    public String f1254 = f1251;

    /* JADX INFO: renamed from: ܽ */
    public RetryPolicy f1255 = f1250;

    /* JADX INFO: renamed from: ۧ */
    public Protocol f1253 = Protocol.HTTPS;

    /* JADX INFO: renamed from: ܿ */
    public int f1256 = 15000;

    /* JADX INFO: renamed from: ֫ */
    public int f1252 = 15000;

    /* JADX INFO: renamed from: ۧ */
    public final Protocol m1336() {
        return this.f1253;
    }

    /* JADX INFO: renamed from: ֫ */
    public final void m1334(Protocol protocol) {
        this.f1253 = protocol;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m1337() {
        return this.f1254;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final String m1342() {
        return this.f1258;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final void m1341() {
        this.f1258 = "s3drive rclone s3 browser obsidian";
    }

    /* JADX INFO: renamed from: ܽ */
    public final RetryPolicy m1338() {
        return this.f1255;
    }

    /* JADX INFO: renamed from: ܿ */
    public final int m1339() {
        return this.f1256;
    }

    /* JADX INFO: renamed from: ֫ */
    public final int m1333() {
        return this.f1252;
    }

    /* JADX INFO: renamed from: ᩳ */
    public final String m1340() {
        return this.f1257;
    }

    /* JADX INFO: renamed from: ۜ */
    public final void m1335() {
        this.f1257 = "UnsignedPayloadSignerType";
    }
}
