package com.amazonaws.services.p061s3.model;

import com.amazonaws.services.p061s3.internal.ObjectExpirationResult;
import com.amazonaws.services.p061s3.internal.S3RequesterChargedResult;
import com.amazonaws.services.p061s3.internal.S3VersionResult;
import com.amazonaws.services.p061s3.internal.SSEResultBase;
import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class CopyObjectResult extends SSEResultBase implements ObjectExpirationResult, S3RequesterChargedResult, S3VersionResult, Serializable {

    /* JADX INFO: renamed from: ۗ */
    public Date f1738;

    /* JADX INFO: renamed from: ۙ */
    public String f1739;

    /* JADX INFO: renamed from: ۛ */
    public String f1740;

    /* JADX INFO: renamed from: ۤ */
    public Date f1741;

    /* JADX INFO: renamed from: ۫ */
    public boolean f1742;

    /* JADX INFO: renamed from: ۬ */
    public String f1743;

    /* JADX INFO: renamed from: ᩳ */
    public final String m1721() {
        return this.f1739;
    }

    /* JADX INFO: renamed from: ܳ */
    public final void m1719(String str) {
        this.f1739 = str;
    }

    /* JADX INFO: renamed from: ᩻ */
    public final Date m1723() {
        return this.f1741;
    }

    /* JADX INFO: renamed from: ۧ */
    public final void m1717(Date date) {
        this.f1741 = date;
    }

    /* JADX INFO: renamed from: ۜ */
    public final String m1716() {
        return this.f1740;
    }

    @Override // com.amazonaws.services.p061s3.internal.S3VersionResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1644(String str) {
        this.f1740 = str;
    }

    /* JADX INFO: renamed from: ܿ */
    public final Date m1720() {
        return this.f1738;
    }

    @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1634(Date date) {
        this.f1738 = date;
    }

    /* JADX INFO: renamed from: ܳ */
    public final String m1718() {
        return this.f1743;
    }

    @Override // com.amazonaws.services.p061s3.internal.ObjectExpirationResult
    /* JADX INFO: renamed from: ܽ */
    public final void mo1635(String str) {
        this.f1743 = str;
    }

    /* JADX INFO: renamed from: ᩷ */
    public final boolean m1722() {
        return this.f1742;
    }

    @Override // com.amazonaws.services.p061s3.internal.S3RequesterChargedResult
    /* JADX INFO: renamed from: ֫ */
    public final void mo1631(boolean z) {
        this.f1742 = z;
    }
}
