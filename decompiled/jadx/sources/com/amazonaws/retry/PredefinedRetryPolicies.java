package com.amazonaws.retry;

import com.alipay.sdk.m.o.b;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class PredefinedRetryPolicies {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f450;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy.BackoffStrategy f451;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final SDKDefaultRetryCondition f452;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final RetryPolicy f453 = new RetryPolicy(RetryPolicy.RetryCondition.f461, RetryPolicy.BackoffStrategy.f460, 0, false);

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f452 = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f451 = sDKDefaultBackoffStrategy;
        f450 = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }

    public class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final boolean mo428(AmazonClientException amazonClientException, int i) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int iM149 = amazonServiceException.m149();
            if (iM149 == 500 || iM149 == 503 || iM149 == 502 || iM149 == 504) {
                return true;
            }
            String strM142 = amazonServiceException.m142();
            return "Throttling".equals(strM142) || "ThrottlingException".equals(strM142) || "ProvisionedThroughputExceededException".equals(strM142) || RetryUtils.m432(amazonServiceException);
        }
    }

    public final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
        public final Random f456 = new Random();

        /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
        public final int f454 = 100;

        /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
        public final int f455 = b.j0;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
        public final long mo427(int i) {
            if (i <= 0) {
                return 0L;
            }
            return this.f456.nextInt(Math.min(this.f455, (1 << i) * this.f454));
        }
    }
}
