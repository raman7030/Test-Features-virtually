.class public Lcom/amazonaws/services/s3/internal/S3RequesterChargedHeaderHandler;
.super Ljava/lang/Object;
.source "S3RequesterChargedHeaderHandler.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/HeaderHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Lcom/amazonaws/http/HttpResponse;)V
    .locals 1

    .line 26
    check-cast p1, Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;

    .line 38
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p2

    const-string v0, "x-amz-request-charged"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 37
    :goto_0
    invoke-interface {p1, p2}, Lcom/amazonaws/services/s3/internal/S3RequesterChargedResult;->֫(Z)V

    return-void
.end method
