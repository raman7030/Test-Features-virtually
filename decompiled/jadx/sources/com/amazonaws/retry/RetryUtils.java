package com.amazonaws.retry;

import com.amazonaws.AbortedException;
import com.amazonaws.AmazonServiceException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class RetryUtils {
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m432(AmazonServiceException amazonServiceException) {
        String strM142 = amazonServiceException.m142();
        return "RequestTimeTooSkewed".equals(strM142) || "RequestExpired".equals(strM142) || "InvalidSignatureException".equals(strM142) || "SignatureDoesNotMatch".equals(strM142);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m433(Exception exc) {
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
