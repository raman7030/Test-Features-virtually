.class public Lcom/amazonaws/retry/RetryUtils;
.super Ljava/lang/Object;
.source "RetryUtils.java"


# direct methods
.method public static ֫(Lcom/amazonaws/AmazonServiceException;)Z
    .locals 1

    .line 69
    invoke-virtual {p0}, Lcom/amazonaws/AmazonServiceException;->֫()Ljava/lang/String;

    move-result-object p0

    const-string v0, "RequestTimeTooSkewed"

    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "RequestExpired"

    .line 71
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "InvalidSignatureException"

    .line 72
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "SignatureDoesNotMatch"

    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ljava/lang/Exception;)Z
    .locals 1

    .line 83
    instance-of v0, p0, Lcom/amazonaws/AbortedException;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 87
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    .line 94
    instance-of v0, p0, Ljava/lang/InterruptedException;

    if-nez v0, :cond_1

    instance-of v0, p0, Ljava/io/InterruptedIOException;

    if-eqz v0, :cond_2

    instance-of p0, p0, Ljava/net/SocketTimeoutException;

    if-nez p0, :cond_2

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method
