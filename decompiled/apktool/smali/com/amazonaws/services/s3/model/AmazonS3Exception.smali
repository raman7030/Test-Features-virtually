.class public Lcom/amazonaws/services/s3/model/AmazonS3Exception;
.super Lcom/amazonaws/AmazonServiceException;
.source "AmazonS3Exception.java"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x691b1e2e775ee86dL


# instance fields
.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/util/HashMap;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 162
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", S3 Extended Request ID: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    iget-object v1, p0, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->۫:Ljava/lang/String;

    .line 163
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/util/HashMap;)V
    .locals 0

    .line 153
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->۬:Ljava/util/HashMap;

    return-void
.end method

.method public final ܿ()Ljava/util/Map;
    .locals 1

    .line 146
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->۬:Ljava/util/HashMap;

    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 0

    .line 117
    iput-object p1, p0, Lcom/amazonaws/services/s3/model/AmazonS3Exception;->۫:Ljava/lang/String;

    return-void
.end method
