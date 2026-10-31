.class public Lcom/amazonaws/retry/PredefinedRetryPolicies;
.super Ljava/lang/Object;
.source "PredefinedRetryPolicies.java"


# static fields
.field public static final ֫:Lcom/amazonaws/retry/RetryPolicy;

.field public static final ۧ:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

.field public static final ܽ:Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultRetryCondition;

.field public static final ᩳ:Lcom/amazonaws/retry/RetryPolicy;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    .line 35
    new-instance v0, Lcom/amazonaws/retry/RetryPolicy;

    sget-object v1, Lcom/amazonaws/retry/RetryPolicy$RetryCondition;->֫:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    sget-object v2, Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;->֫:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Lcom/amazonaws/retry/RetryPolicy;-><init>(Lcom/amazonaws/retry/RetryPolicy$RetryCondition;Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;IZ)V

    sput-object v0, Lcom/amazonaws/retry/PredefinedRetryPolicies;->ᩳ:Lcom/amazonaws/retry/RetryPolicy;

    .line 76
    new-instance v0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultRetryCondition;

    invoke-direct {v0}, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultRetryCondition;-><init>()V

    sput-object v0, Lcom/amazonaws/retry/PredefinedRetryPolicies;->ܽ:Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultRetryCondition;

    .line 83
    new-instance v1, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;

    invoke-direct {v1}, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;-><init>()V

    sput-object v1, Lcom/amazonaws/retry/PredefinedRetryPolicies;->ۧ:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    .line 98
    new-instance v2, Lcom/amazonaws/retry/RetryPolicy;

    const/4 v3, 0x3

    const/4 v4, 0x1

    invoke-direct {v2, v0, v1, v3, v4}, Lcom/amazonaws/retry/RetryPolicy;-><init>(Lcom/amazonaws/retry/RetryPolicy$RetryCondition;Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;IZ)V

    .line 87
    sput-object v2, Lcom/amazonaws/retry/PredefinedRetryPolicies;->֫:Lcom/amazonaws/retry/RetryPolicy;

    .line 111
    new-instance v2, Lcom/amazonaws/retry/RetryPolicy;

    const/16 v3, 0xa

    invoke-direct {v2, v0, v1, v3, v4}, Lcom/amazonaws/retry/RetryPolicy;-><init>(Lcom/amazonaws/retry/RetryPolicy$RetryCondition;Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;IZ)V

    return-void
.end method
