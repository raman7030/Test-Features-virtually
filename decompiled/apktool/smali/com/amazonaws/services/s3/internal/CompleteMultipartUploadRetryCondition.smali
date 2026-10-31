.class public Lcom/amazonaws/services/s3/internal/CompleteMultipartUploadRetryCondition;
.super Ljava/lang/Object;
.source "CompleteMultipartUploadRetryCondition.java"

# interfaces
.implements Lcom/amazonaws/retry/RetryPolicy$RetryCondition;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/AmazonClientException;I)Z
    .locals 2

    .line 53
    instance-of v0, p1, Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    if-eqz v0, :cond_1

    .line 54
    check-cast p1, Lcom/amazonaws/services/s3/model/AmazonS3Exception;

    .line 61
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->֫()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 62
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ۧ()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 65
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->֫()Ljava/lang/String;

    move-result-object v0

    const-string v1, "InternalError"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 66
    invoke-virtual {p1}, Lcom/amazonaws/AmazonServiceException;->ۧ()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Please try again."

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x3

    if-ge p2, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
