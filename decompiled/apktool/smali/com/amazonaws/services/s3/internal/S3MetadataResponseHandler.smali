.class public Lcom/amazonaws/services/s3/internal/S3MetadataResponseHandler;
.super Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;
.source "S3MetadataResponseHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;
    .locals 1

    .line 33
    new-instance v0, Lcom/amazonaws/services/s3/model/ObjectMetadata;

    invoke-direct {v0}, Lcom/amazonaws/services/s3/model/ObjectMetadata;-><init>()V

    .line 34
    invoke-static {p1, v0}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->֫(Lcom/amazonaws/http/HttpResponse;Lcom/amazonaws/services/s3/model/ObjectMetadata;)V

    .line 36
    invoke-static {p1}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;->ۧ(Lcom/amazonaws/http/HttpResponse;)Lcom/amazonaws/AmazonWebServiceResponse;

    move-result-object p1

    .line 37
    invoke-virtual {p1, v0}, Lcom/amazonaws/AmazonWebServiceResponse;->֫(Ljava/lang/Object;)V

    return-object p1
.end method
