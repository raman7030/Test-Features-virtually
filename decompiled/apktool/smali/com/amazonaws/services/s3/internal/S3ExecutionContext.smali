.class public Lcom/amazonaws/services/s3/internal/S3ExecutionContext;
.super Lcom/amazonaws/http/ExecutionContext;
.source "S3ExecutionContext.java"


# instance fields
.field public ᩳ:Lcom/amazonaws/auth/Signer;


# virtual methods
.method public final ֫(Lcom/amazonaws/auth/Signer;)V
    .locals 0

    .line 45
    iput-object p1, p0, Lcom/amazonaws/services/s3/internal/S3ExecutionContext;->ᩳ:Lcom/amazonaws/auth/Signer;

    return-void
.end method

.method public final ᩳ()Lcom/amazonaws/auth/Signer;
    .locals 1

    .line 52
    iget-object v0, p0, Lcom/amazonaws/services/s3/internal/S3ExecutionContext;->ᩳ:Lcom/amazonaws/auth/Signer;

    return-object v0
.end method
