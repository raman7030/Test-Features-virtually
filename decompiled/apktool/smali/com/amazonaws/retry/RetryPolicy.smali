.class public final Lcom/amazonaws/retry/RetryPolicy;
.super Ljava/lang/Object;
.source "RetryPolicy.java"


# instance fields
.field public final ֫:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

.field public final ۧ:I

.field public final ܽ:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;


# direct methods
.method public constructor <init>(Lcom/amazonaws/retry/RetryPolicy$RetryCondition;Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;IZ)V
    .locals 0

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 81
    sget-object p1, Lcom/amazonaws/retry/PredefinedRetryPolicies;->ܽ:Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultRetryCondition;

    :cond_0
    if-nez p2, :cond_1

    .line 84
    sget-object p2, Lcom/amazonaws/retry/PredefinedRetryPolicies;->ۧ:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    :cond_1
    if-ltz p3, :cond_2

    .line 91
    iput-object p1, p0, Lcom/amazonaws/retry/RetryPolicy;->ܽ:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    .line 92
    iput-object p2, p0, Lcom/amazonaws/retry/RetryPolicy;->֫:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    .line 93
    iput p3, p0, Lcom/amazonaws/retry/RetryPolicy;->ۧ:I

    return-void

    .line 87
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Please provide a non-negative value for maxErrorRetry."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫()Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;
    .locals 1

    .line 112
    iget-object v0, p0, Lcom/amazonaws/retry/RetryPolicy;->֫:Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 121
    iget v0, p0, Lcom/amazonaws/retry/RetryPolicy;->ۧ:I

    return v0
.end method

.method public final ܽ()Lcom/amazonaws/retry/RetryPolicy$RetryCondition;
    .locals 1

    .line 103
    iget-object v0, p0, Lcom/amazonaws/retry/RetryPolicy;->ܽ:Lcom/amazonaws/retry/RetryPolicy$RetryCondition;

    return-object v0
.end method
