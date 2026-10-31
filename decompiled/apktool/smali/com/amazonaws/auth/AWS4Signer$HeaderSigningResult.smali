.class public Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;
.super Ljava/lang/Object;
.source "AWS4Signer.java"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:[B

.field public final ܽ:Ljava/lang/String;

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;[B[B)V
    .locals 0

    .line 389
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 390
    iput-object p1, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->֫:Ljava/lang/String;

    .line 391
    iput-object p2, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ܽ:Ljava/lang/String;

    .line 392
    iput-object p3, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ۧ:[B

    .line 393
    iput-object p4, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ᩳ:[B

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 397
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()[B
    .locals 4

    .line 405
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ۧ:[B

    array-length v1, v0

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 406
    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 401
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 4

    .line 411
    iget-object v0, p0, Lcom/amazonaws/auth/AWS4Signer$HeaderSigningResult;->ᩳ:[B

    array-length v1, v0

    new-array v1, v1, [B

    const/4 v2, 0x0

    .line 412
    array-length v3, v0

    invoke-static {v0, v2, v1, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method
