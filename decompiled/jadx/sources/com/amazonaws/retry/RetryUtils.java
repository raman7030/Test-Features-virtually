package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class RetryUtils {
    /* JADX INFO: renamed from: ֫ */
    public static boolean m1598(AmazonServiceException amazonServiceException) {
        String strM1309 = amazonServiceException.m1309();
        return "RequestTimeTooSkewed".equals(strM1309) || "RequestExpired".equals(strM1309) || "InvalidSignatureException".equals(strM1309) || "SignatureDoesNotMatch".equals(strM1309);
    }

    /* JADX INFO: renamed from: ֫ */
    public static boolean m1599(Exception exc) {
        if (exc instanceof AbortedException) {
            return true;
        }
        if (exc.getCause() == null) {
            return false;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof InterruptedException) {
            return true;
        }
        return (cause instanceof InterruptedIOException) && !(cause instanceof SocketTimeoutException);
    }
}
