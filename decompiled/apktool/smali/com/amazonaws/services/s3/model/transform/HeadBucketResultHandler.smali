.class public Lcom/amazonaws/services/s3/model/transform/HeadBucketResultHandler;
.super Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;
.source "HeadBucketResultHandler.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/amazonaws/services/s3/internal/AbstractS3ResponseHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Lcom/amazonaws/http/HttpResponse;)Ljava/lang/Object;
    .locals 3

    .line 29
    new-instance v0, Lcom/amazonaws/AmazonWebServiceResponse;

    invoke-direct {v0}, Lcom/amazonaws/AmazonWebServiceResponse;-><init>()V

    .line 30
    new-instance v1, Lcom/amazonaws/services/s3/model/HeadBucketResult;

    invoke-direct {v1}, Lcom/amazonaws/services/s3/model/HeadBucketResult;-><init>()V

    .line 31
    invoke-virtual {p1}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p1

    const-string v2, "x-amz-bucket-region"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v1, p1}, Lcom/amazonaws/services/s3/model/HeadBucketResult;->֫(Ljava/lang/String;)V

    .line 32
    invoke-virtual {v0, v1}, Lcom/amazonaws/AmazonWebServiceResponse;->֫(Ljava/lang/Object;)V

    return-object v0
.end method
