package com.amazonaws.retry;

import com.alipay.sdk.p010m.p039o.C0180b;
import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public class PredefinedRetryPolicies {

    /* JADX INFO: renamed from: ֫ */
    public static final RetryPolicy f1610;

    /* JADX INFO: renamed from: ۧ */
    public static final RetryPolicy.BackoffStrategy f1611;

    /* JADX INFO: renamed from: ܽ */
    public static final SDKDefaultRetryCondition f1612;

    /* JADX INFO: renamed from: ᩳ */
    public static final RetryPolicy f1613 = new RetryPolicy(RetryPolicy.RetryCondition.f1621, RetryPolicy.BackoffStrategy.f1620, 0, false);

    static {
        SDKDefaultRetryCondition sDKDefaultRetryCondition = new SDKDefaultRetryCondition();
        f1612 = sDKDefaultRetryCondition;
        SDKDefaultBackoffStrategy sDKDefaultBackoffStrategy = new SDKDefaultBackoffStrategy();
        f1611 = sDKDefaultBackoffStrategy;
        f1610 = new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 3, true);
        new RetryPolicy(sDKDefaultRetryCondition, sDKDefaultBackoffStrategy, 10, true);
    }

    public class SDKDefaultRetryCondition implements RetryPolicy.RetryCondition {
        @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
        /* JADX INFO: renamed from: ֫ */
        public final boolean mo1594(AmazonClientException amazonClientException, int i) {
            if ((amazonClientException.getCause() instanceof IOException) && !(amazonClientException.getCause() instanceof InterruptedIOException)) {
                return true;
            }
            if (!(amazonClientException instanceof AmazonServiceException)) {
                return false;
            }
            AmazonServiceException amazonServiceException = (AmazonServiceException) amazonClientException;
            int iM1316 = amazonServiceException.m1316();
            if (iM1316 == 500 || iM1316 == 503 || iM1316 == 502 || iM1316 == 504) {
                return true;
            }
            String strM1309 = amazonServiceException.m1309();
            return "Throttling".equals(strM1309) || "ThrottlingException".equals(strM1309) || "ProvisionedThroughputExceededException".equals(strM1309) || RetryUtils.m1598(amazonServiceException);
        }
    }

    public final class SDKDefaultBackoffStrategy implements RetryPolicy.BackoffStrategy {

        /* JADX INFO: renamed from: ᩳ */
        public final Random f1616 = new Random();

        /* JADX INFO: renamed from: ۧ */
        public final int f1614 = 100;

        /* JADX INFO: renamed from: ܽ */
        public final int f1615 = C0180b.f790j0;

        @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
        /* JADX INFO: renamed from: ֫ */
        public final long mo1593(int i) {
            if (i <= 0) {
                return 0L;
            }
            return this.f1616.nextInt(Math.min(this.f1615, (1 << i) * this.f1614));
        }
    }
}
