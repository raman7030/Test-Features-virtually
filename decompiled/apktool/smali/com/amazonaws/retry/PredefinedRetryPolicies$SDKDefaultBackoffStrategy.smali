.class public final Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;
.super Ljava/lang/Object;
.source "PredefinedRetryPolicies.java"

# interfaces
.implements Lcom/amazonaws/retry/RetryPolicy$BackoffStrategy;


# instance fields
.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:Ljava/util/Random;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 214
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;->ᩳ:Ljava/util/Random;

    const/16 v0, 0x64

    .line 215
    iput v0, p0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;->ۧ:I

    const/16 v0, 0x4e20

    .line 216
    iput v0, p0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(I)J
    .locals 2

    if-gtz p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    const/4 v0, 0x1

    shl-int p1, v0, p1

    .line 229
    iget v0, p0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;->ۧ:I

    mul-int p1, p1, v0

    iget v0, p0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;->ܽ:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object v0, p0, Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultBackoffStrategy;->ᩳ:Ljava/util/Random;

    invoke-virtual {v0, p1}, Ljava/util/Random;->nextInt(I)I

    move-result p1

    int-to-long v0, p1

    return-wide v0
.end method
