package com.amazonaws.services.s3.model;

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


    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f566;

    CannedAccessControlList(String str) {
        this.f566 = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f566;
    }
}
