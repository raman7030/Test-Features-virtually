package com.amazonaws.mobileconnectors.p060s3.transferutility;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.VersionInfoUtils;

/* JADX INFO: loaded from: classes.dex */
public class TransferUtility {

    /* JADX INFO: renamed from: ۧ */
    public static final Log f1537 = LogFactory.m1468(TransferUtility.class);

    /* JADX INFO: renamed from: ֫ */
    public static final Object f1536 = new Object();

    /* JADX INFO: renamed from: ܽ */
    public static String f1538 = "";

    /* JADX INFO: renamed from: ֫ */
    public static String m1569() {
        synchronized (f1536) {
            String str = f1538;
            if (str != null && !str.trim().isEmpty()) {
                return str.trim() + "/";
            }
            return "";
        }
    }

    /* JADX INFO: renamed from: ۧ */
    public static void m1571(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions requestClientOptionsM1328 = amazonWebServiceRequest.m1328();
        StringBuilder sb = new StringBuilder("TransferService/");
        sb.append(m1569());
        int i = VersionInfoUtils.f2009;
        sb.append("2.81.1");
        requestClientOptionsM1328.m1363(sb.toString());
    }

    /* JADX INFO: renamed from: ֫ */
    public static void m1570(AmazonWebServiceRequest amazonWebServiceRequest) {
        RequestClientOptions requestClientOptionsM1328 = amazonWebServiceRequest.m1328();
        StringBuilder sb = new StringBuilder("TransferService_multipart/");
        sb.append(m1569());
        int i = VersionInfoUtils.f2009;
        sb.append("2.81.1");
        requestClientOptionsM1328.m1363(sb.toString());
    }
}
