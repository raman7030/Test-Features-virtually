.class public Lcom/amazonaws/services/s3/internal/S3ObjectResponseHandler;
.super Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;
.source "S3ObjectResponseHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 29
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;
    .locals 4

    .line 40
    new-instance v0, Lcom/amazonaws/services/s3/model/S3Object;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/S3Object;-><init>()V

    .line 41
    invoke-static {p1}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->ۧ(Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonWebServiceResponse;

    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "x-amz-website-redirect-location"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 43
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 47
    :cond_0
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "x-amz-request-charged"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    const-string v3, "x-amz-tagging-count"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 52
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 55
    :cond_1
    invoke-virtual {v0}, Lcom/amazonaws/services/s3/model/S3Object;->ܽ()Lcom/amazonaws/services/s3/model/ObjectMetadata;

    move-result-object v2

    .line 56
    invoke-static {p1, v2}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->֫(Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V

    .line 58
    new-instance v2, Lcom/amazonaws/services/s3/model/S3ObjectInputStream;

    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->֫()Ljava/io/InputStream;

    move-result-object p1

    invoke-direct {v2, p1}, Lcom/amazonaws/services/s3/model/S3ObjectInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0, v2}, Lcom/amazonaws/services/s3/model/S3Object;->֫(Lcom/amazonaws/services/s3/model/S3ObjectInputStream;)V

    .line 60
    invoke-virtual {v1, v0}, Lcom/amazonaws/AmazonWebServiceResponse;->֫(Ljava/lang/Object;)V

    return-object v1
.end method
