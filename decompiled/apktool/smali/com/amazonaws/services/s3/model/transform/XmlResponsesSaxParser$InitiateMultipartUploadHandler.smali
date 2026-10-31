.class public Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$InitiateMultipartUploadHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "XmlResponsesSaxParser.java"


# instance fields
.field public final ᩶:Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1876
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    .line 1878
    new-instance v0, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;-><init>()V

    iput-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$InitiateMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Lorg/xml/sax/Attributes;)V
    .locals 0

    return-void
.end method

.method public final ܳ(Ljava/lang/String;)V
    .locals 2

    const-string v0, "InitiateMultipartUploadResult"

    .line 1896
    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->֫([Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Bucket"

    .line 1897
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$InitiateMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;

    if-eqz v0, :cond_0

    .line 1898
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_0
    const-string v0, "Key"

    .line 1900
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1901
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void

    :cond_1
    const-string v0, "UploadId"

    .line 1903
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 1904
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;->ܳ(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final ܽ()Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;
    .locals 1

    .line 1882
    iget-object v0, p0, Lcom/amazonaws/services/s3/model/transform/XmlResponsesSaxParser$InitiateMultipartUploadHandler;->᩶:Lcom/amazonaws/services/s3/model/InitiateMultipartUploadResult;

    return-object v0
.end method
