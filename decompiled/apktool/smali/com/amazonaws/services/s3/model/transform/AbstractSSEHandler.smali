.class public abstract Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;
.super Lcom/amazonaws/services/s3/model/transform/AbstractHandler;
.source "AbstractSSEHandler.java"

# interfaces
.implements Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 24
    invoke-direct {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractHandler;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۧ(Ljava/lang/String;)V
    .locals 1

    .line 53
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 55
    check-cast v0, Lcom/amazonaws/services/s3/internal/SSEResultBase;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ۧ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public abstract ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;
.end method

.method public ܽ()Ljava/lang/String;
    .locals 1

    .line 33
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 34
    :cond_0
    check-cast v0, Lcom/amazonaws/services/s3/internal/SSEResultBase;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ܿ()Ljava/lang/String;
    .locals 1

    .line 61
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 62
    :cond_0
    check-cast v0, Lcom/amazonaws/services/s3/internal/SSEResultBase;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ܽ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ(Ljava/lang/String;)V
    .locals 1

    .line 67
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 69
    check-cast v0, Lcom/amazonaws/services/s3/internal/SSEResultBase;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ܿ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public ᩳ()Ljava/lang/String;
    .locals 1

    .line 47
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 48
    :cond_0
    check-cast v0, Lcom/amazonaws/services/s3/internal/SSEResultBase;

    invoke-virtual {v0}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ۧ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ(Ljava/lang/String;)V
    .locals 1

    .line 39
    invoke-virtual {p0}, Lcom/amazonaws/services/s3/model/transform/AbstractSSEHandler;->ܳ()Lcom/amazonaws/services/s3/internal/ServerSideEncryptionResult;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    check-cast v0, Lcom/amazonaws/services/s3/internal/SSEResultBase;

    invoke-virtual {v0, p1}, Lcom/amazonaws/services/s3/internal/SSEResultBase;->ᩳ(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
