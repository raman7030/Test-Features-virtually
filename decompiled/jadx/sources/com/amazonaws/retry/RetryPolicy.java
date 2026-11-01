package com.amazonaws.retry;

import com.amazonaws.AmazonClientException;

/* JADX INFO: loaded from: classes.dex */
public final class RetryPolicy {

    /* JADX INFO: renamed from: ֫ */
    public final BackoffStrategy f1617;

    /* JADX INFO: renamed from: ۧ */
    public final int f1618;

    /* JADX INFO: renamed from: ܽ */
    public final RetryCondition f1619;

    public interface BackoffStrategy {

        /* JADX INFO: renamed from: ֫ */
        public static final BackoffStrategy f1620 = new BackoffStrategy() { // from class: com.amazonaws.retry.RetryPolicy.BackoffStrategy.1
            @Override // com.amazonaws.retry.RetryPolicy.BackoffStrategy
            /* JADX INFO: renamed from: ֫ */
            public final long mo1593(int i) {
                return 0L;
            }
        };

        /* JADX INFO: renamed from: ֫ */
        long mo1593(int i);
    }

    public interface RetryCondition {

        /* JADX INFO: renamed from: ֫ */
        public static final RetryCondition f1621 = new RetryCondition() { // from class: com.amazonaws.retry.RetryPolicy.RetryCondition.1
            @Override // com.amazonaws.retry.RetryPolicy.RetryCondition
            /* JADX INFO: renamed from: ֫ */
            public final boolean mo1594(AmazonClientException amazonClientException, int i) {
                return false;
            }
        };

        /* JADX INFO: renamed from: ֫ */
        boolean mo1594(AmazonClientException amazonClientException, int i);
    }

    public RetryPolicy(RetryCondition retryCondition, BackoffStrategy backoffStrategy, int i, boolean z) {
        retryCondition = retryCondition == null ? PredefinedRetryPolicies.f1612 : retryCondition;
        backoffStrategy = backoffStrategy == null ? PredefinedRetryPolicies.f1611 : backoffStrategy;
        if (i < 0) {
            throw new IllegalArgumentException("Please provide a non-negative value for maxErrorRetry.");
        }
        this.f1619 = retryCondition;
        this.f1617 = backoffStrategy;
        this.f1618 = i;
    }

    /* JADX INFO: renamed from: ܽ */
    public final RetryCondition m1597() {
        return this.f1619;
    }

    /* JADX INFO: renamed from: ֫ */
    public final BackoffStrategy m1595() {
        return this.f1617;
    }

    /* JADX INFO: renamed from: ۧ */
    public final int m1596() {
        return this.f1618;
    }
}
