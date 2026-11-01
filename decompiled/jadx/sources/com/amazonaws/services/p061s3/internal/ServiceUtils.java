package com.amazonaws.services.p061s3.internal;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.services.p061s3.model.GetObjectRequest;
import com.amazonaws.services.p061s3.model.ObjectMetadata;
import com.amazonaws.services.p061s3.model.PutObjectRequest;
import com.amazonaws.services.p061s3.model.SSEAlgorithm;
import com.amazonaws.util.DateUtils;
import p067l.C17073;

/* JADX INFO: loaded from: classes.dex */
public class ServiceUtils {

    /* JADX INFO: renamed from: ֫ */
    public static final /* synthetic */ int f1672 = 0;

    /* JADX INFO: renamed from: ۧ */
    public static final Log f1673 = LogFactory.m1468(ServiceUtils.class);

    static {
        new DateUtils();
    }

    /* JADX INFO: renamed from: ֫ */
    public static String m1652(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("\"")) {
            strTrim = strTrim.substring(1);
        }
        return strTrim.endsWith("\"") ? C17073.m38720(1, 0, strTrim) : strTrim;
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1653(AmazonWebServiceRequest amazonWebServiceRequest) {
        if (System.getProperty("com.amazonaws.services.s3.disableGetObjectMD5Validation") != null) {
            return true;
        }
        if (amazonWebServiceRequest instanceof GetObjectRequest) {
            return ((GetObjectRequest) amazonWebServiceRequest).m1740() != null;
        }
        if (!(amazonWebServiceRequest instanceof PutObjectRequest)) {
            return false;
        }
        PutObjectRequest putObjectRequest = (PutObjectRequest) amazonWebServiceRequest;
        ObjectMetadata objectMetadataM1685 = putObjectRequest.m1685();
        if (objectMetadataM1685 != null && objectMetadataM1685.m1796() != null) {
            return true;
        }
        if (putObjectRequest.m1671() == null) {
            return false;
        }
        putObjectRequest.m1671().getClass();
        return (SSEAlgorithm.KMS.getAlgorithm() == null && putObjectRequest.m1671().m1836() == null) ? false : true;
    }
}
