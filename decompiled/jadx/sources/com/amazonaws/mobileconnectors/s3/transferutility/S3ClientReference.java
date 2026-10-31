package com.amazonaws.mobileconnectors.s3.transferutility;

import com.amazonaws.services.s3.AmazonS3;
import l.ConcurrentMapC10942;

/* JADX INFO: loaded from: classes.dex */
public class S3ClientReference {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC10942 f281 = new ConcurrentMapC10942();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static AmazonS3 m353(Integer num) {
        return (AmazonS3) f281.get(num);
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static void m354(Integer num) {
        f281.remove(num);
    }
}
