.class public Lcom/amazonaws/services/s3/internal/S3VersionHeaderHandler;
.super Ljava/lang/Object;
.source "S3VersionHeaderHandler.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/HeaderHandler;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;Lcom/amazonaws/http/HttpResponse;)V
    .locals 1

    .line 25
    check-cast p1, Lcom/amazonaws/services/s3/internal/S3VersionResult;

    .line 35
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p2

    const-string v0, "x-amz-version-id"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/amazonaws/services/s3/internal/S3VersionResult;->֫(Ljava/lang/String;)V

    return-void
.end method
