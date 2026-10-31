.class public Lcom/amazonaws/services/s3/internal/GetObjectTaggingResponseHeaderHandler;
.super Ljava/lang/Object;
.source "GetObjectTaggingResponseHeaderHandler.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/HeaderHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Lcom/amazonaws/http/HttpResponse;)V
    .locals 0

    .line 28
    check-cast p1, Lcom/amazonaws/services/s3/model/GetObjectTaggingResult;

    .line 31
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p1

    const-string p2, "x-amz-version-id"

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-void
.end method
