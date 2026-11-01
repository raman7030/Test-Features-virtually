package com.amazonaws.services.p061s3.model;

/* JADX INFO: loaded from: classes.dex */
public enum CannedAccessControlList {
    Private("private"),
    PublicRead("public-read"),
    PublicReadWrite("public-read-write"),
    AuthenticatedRead("authenticated-read"),
    LogDeliveryWrite("log-delivery-write"),
    BucketOwnerRead("bucket-owner-read"),
    BucketOwnerFullControl("bucket-owner-full-control"),
    AwsExecRead("aws-exec-read");


    /* JADX INFO: renamed from: ᩸ */
    public final String f1726;

    CannedAccessControlList(String str) {
        this.f1726 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f1726;
    }
}
