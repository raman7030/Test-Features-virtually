.class public Lcom/amazonaws/services/s3/model/PutObjectRequest;
.super Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
.source "PutObjectRequest.java"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public ۟:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V
    .locals 0

    .line 164
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V

    return-void
.end method


# virtual methods
.method public final clone()Lcom/amazonaws/AmazonWebServiceRequest;
    .locals 1

    .line 174
    invoke-super {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    .line 175
    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object v0
.end method

.method public final clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 1

    .line 174
    invoke-super {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    .line 175
    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 174
    invoke-super {p0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->clone()Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    move-result-object v0

    check-cast v0, Lcom/amazonaws/services/s3/model/PutObjectRequest;

    .line 175
    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/PutObjectRequest;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object v0
.end method

.method public final ֫(Ljava/io/InputStream;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 231
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->֫(Ljava/io/InputStream;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p0
.end method

.method public final ֫(Z)V
    .locals 0

    .line 311
    iput-boolean p1, p0, Lcom/amazonaws/services/s3/model/PutObjectRequest;->۟:Z

    return-void
.end method

.method public final ۘ()Z
    .locals 1

    .line 291
    iget-boolean v0, p0, Lcom/amazonaws/services/s3/model/PutObjectRequest;->۟:Z

    return v0
.end method

.method public final ۧ(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 218
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/CannedAccessControlList;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p0
.end method

.method public final ۧ(Lcom/amazonaws/services/s3/model/ObjectMetadata;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 212
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/ObjectMetadata;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p0
.end method

.method public final ۧ(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 264
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ۧ(Lcom/amazonaws/services/s3/model/SSEAwsKeyManagementParams;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p0
.end method

.method public final ܽ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 237
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ܽ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p0
.end method

.method public final ᩳ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;
    .locals 0

    .line 194
    invoke-super {p0, p1}, Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;->ᩳ(Ljava/lang/String;)Lcom/amazonaws/services/s3/model/AbstractPutObjectRequest;

    return-object p0
.end method
