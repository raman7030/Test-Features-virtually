.class public Lcom/amazonaws/retry/PredefinedRetryPolicies$SDKDefaultRetryCondition;
.super Ljava/lang/Object;
.source "PredefinedRetryPolicies.java"

# interfaces
.implements Lcom/amazonaws/retry/RetryPolicy$RetryCondition;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 151
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/AmazonClientException;I)Z
    .locals 1

    .line 160
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/IOException;

    if-eqz p2, :cond_0

    .line 161
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/io/InterruptedIOException;

    if-nez p2, :cond_0

    goto :goto_0

    .line 165
    :cond_0
    instance-of p2, p1, Lcom/amazonaws/AmazonServiceException;

    if-eqz p2, :cond_4

    .line 166
    check-cast p1, Lcom/amazonaws/AmazonServiceException;

    .line 174
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ᩳ()I

    move-result p2

    const/16 v0, 0x1f4

    if-eq p2, v0, :cond_3

    const/16 v0, 0x1f7

    if-eq p2, v0, :cond_3

    const/16 v0, 0x1f6

    if-eq p2, v0, :cond_3

    const/16 v0, 0x1f8

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->֫()Ljava/lang/String;

    move-result-object p2

    const-string v0, "Throttling"

    .line 39
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "ThrottlingException"

    .line 40
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    const-string v0, "ProvisionedThroughputExceededException"

    .line 41
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_0

    .line 196
    :cond_2
    invoke-static {p1}, Lcom/amazonaws/retry/RetryUtils;->֫(Lcom/amazonaws/AmazonServiceException;)Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method
