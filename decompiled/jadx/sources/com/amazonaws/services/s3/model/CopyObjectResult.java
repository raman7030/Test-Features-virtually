package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.ObjectExpirationResult;
import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.s3.internal.S3VersionResult;
import com.amazonaws.services.s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Date f578;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f579;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public String f580;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Date f581;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f582;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public String f583;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String m555() {
        return this.f579;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m553(String str) {
        this.f579 = str;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final Date m557() {
        return this.f581;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m551(Date date) {
        this.f581 = date;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String m550() {
        return this.f580;
    }

    @Override // com.amazonaws.services.s3.internal.S3VersionResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo478(String str) {
        this.f580 = str;
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Date m554() {
        return this.f578;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo468(Date date) {
        this.f578 = date;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m552() {
        return this.f583;
    }

    @Override // com.amazonaws.services.s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo469(String str) {
        this.f583 = str;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m556() {
        return this.f582;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo465(boolean z) {
        this.f582 = z;
    }
}
