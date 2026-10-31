.class public Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;
.super Lcom/amazonaws/auth/AWS4Signer;
.source "AWSS3V4Signer.java"


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    .line 42
    invoke-direct {p0, v0}, Lcom/amazonaws/auth/AWS4Signer;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public final calculateContentHash(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 8

    .line 79
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    const-string v0, "x-amz-content-sha256"

    const-string v1, "required"

    invoke-virtual {p1, v0, v1}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    instance-of v0, v0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    if-nez v0, :cond_1

    .line 124
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    instance-of v0, v0, Lcom/amazonaws/services/s3/model/UploadPartRequest;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 114
    :cond_0
    invoke-super {p0, p1}, Lcom/amazonaws/auth/AWS4Signer;->calculateContentHash(Lcom/amazonaws/Request;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 82
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܽ()Ljava/util/HashMap;

    move-result-object v0

    const-string v1, "Content-Length"

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_2

    .line 85
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    goto :goto_2

    .line 136
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v0

    .line 137
    invoke-virtual {v0}, Ljava/io/InputStream;->markSupported()Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x1000

    new-array v2, v2, [B

    const/4 v3, -0x1

    .line 144
    invoke-virtual {v0, v3}, Ljava/io/InputStream;->mark(I)V

    const-wide/16 v4, 0x0

    .line 145
    :goto_1
    invoke-virtual {v0, v2}, Ljava/io/InputStream;->read([B)I

    move-result v6

    if-eq v6, v3, :cond_3

    int-to-long v6, v6

    add-long/2addr v4, v6

    goto :goto_1

    .line 148
    :cond_3
    invoke-virtual {v0}, Ljava/io/InputStream;->reset()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-wide v2, v4

    :goto_2
    const-string v0, "x-amz-decoded-content-length"

    .line 105
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v4

    .line 104
    invoke-virtual {p1, v0, v4}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    invoke-static {v2, v3}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;->ᩳ(J)J

    move-result-wide v2

    .line 110
    invoke-static {v2, v3}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v0

    .line 108
    invoke-virtual {p1, v1, v0}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "STREAMING-AWS4-HMAC-SHA256-PAYLOAD"

    return-object p1

    .line 138
    :cond_4
    :try_start_1
    new-instance p1, Lcom/amazonaws/AmazonClientException;

    const-string v0, "Failed to get content length"

    .line 59
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 138
    throw p1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception p1

    .line 99
    new-instance v0, Lcom/amazonaws/AmazonClientException;

    const-string v1, "Cannot get the content-lenght of the request content."

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    throw v0
.end method

.method public final calculateContentHashPresign(Lcom/amazonaws/Request;)Ljava/lang/String;
    .locals 0

    const-string p1, "UNSIGNED-PAYLOAD"

    return-object p1
.end method

.method public final processRequestPayload(Lcom/amazonaws/Request;Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;)V
    .locals 8

    .line 123
    check-cast p1, Lcom/amazonaws/DefaultRequest;

    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    instance-of v0, v0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    if-nez v0, :cond_1

    .line 124
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->ܿ()Lcom/amazonaws/AmazonWebServiceRequest;

    move-result-object v0

    instance-of v0, v0, Lcom/amazonaws/services/s3/model/UploadPartRequest;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 52
    :cond_1
    :goto_0
    invoke-virtual {p1}, Lcom/amazonaws/DefaultRequest;->֫()Ljava/io/InputStream;

    move-result-object v2

    .line 53
    invoke-virtual {p2}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->֫()Ljava/lang/String;

    move-result-object v4

    .line 54
    invoke-virtual {p2}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ܽ()Ljava/lang/String;

    move-result-object v5

    .line 55
    invoke-virtual {p2}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ۧ()[B

    move-result-object v3

    .line 57
    invoke-virtual {p2}, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ᩳ()[B

    move-result-object p2

    .line 56
    invoke-static {p2}, Lcom/amazonaws/util/BinaryUtils;->֫([B)Ljava/lang/String;

    move-result-object v6

    .line 58
    new-instance p2, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;

    move-object v1, p2

    move-object v7, p0

    invoke-direct/range {v1 .. v7}, Lcom/amazonaws/auth/AwsChunkedEncodingInputStream;-><init>(Ljava/io/InputStream;[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazonaws/services/s3/internal/AWSS3V4Signer;)V

    .line 60
    invoke-virtual {p1, p2}, Lcom/amazonaws/DefaultRequest;->֫(Ljava/io/InputStream;)V

    return-void
.end method
