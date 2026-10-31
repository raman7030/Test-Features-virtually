.class public Lcom/amazonaws/services/s3/internal/ServerSideEncryptionHeaderHandler;
.super Ljava/lang/Object;
.source "ServerSideEncryptionHeaderHandler.java"

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
    .locals 2

    .line 26
    check-cast p1, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    .line 37
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "x-amz-server-side-encryption"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;->ᩳ(Ljava/lang/String;)V

    .line 38
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object v0

    const-string v1, "x-amz-server-side-encryption-customer-algorithm"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p1, v0}, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;->ۧ(Ljava/lang/String;)V

    .line 39
    invoke-virtual {p2}, Lcom/amazonaws/http/HttpResponse;->ۧ()Ljava/util/Map;

    move-result-object p2

    const-string v0, "x-amz-server-side-encryption-customer-key-MD5"

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {p1, p2}, Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;->ܿ(Ljava/lang/String;)V

    return-void
.end method
