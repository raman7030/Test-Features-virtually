package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.services.p061s3.AmazonS3;
import p067l.ConcurrentMapC12768;

/* JADX INFO: loaded from: classes.dex */
public class S3ClientReference {

    /* JADX INFO: renamed from: ֫ */
    public static ConcurrentMapC12768 f1441 = new ConcurrentMapC12768();

    /* JADX INFO: renamed from: ֫ */
    public static AmazonS3 m1519(Integer num) {
        return (AmazonS3) f1441.get(num);
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1520(Integer num) {
        f1441.remove(num);
    }
}
