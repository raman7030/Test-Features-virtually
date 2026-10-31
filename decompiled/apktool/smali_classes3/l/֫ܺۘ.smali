.class public final Ll/֫ܺۘ;
.super Ll/ۧܺۘ;
.source "K7VS"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final sign()[B
    .locals 2

    .line 98
    :try_start_0
    iget-object v0, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/Signer;->generateSignature()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 100
    new-instance v1, Ljava/security/SignatureException;

    invoke-direct {v1, v0}, Ljava/security/SignatureException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final update([B)V
    .locals 3

    .line 107
    :try_start_0
    iget-object v0, p0, Ll/ۧܺۘ;->֫:Lorg/bouncycastle/crypto/Signer;

    array-length v1, p1

    const/4 v2, 0x0

    invoke-interface {v0, p1, v2, v1}, Lorg/bouncycastle/crypto/Signer;->update([BII)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 109
    new-instance v0, Ljava/security/SignatureException;

    invoke-direct {v0, p1}, Ljava/security/SignatureException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    const-string v0, "Ed448"

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    const-string v0, "ssh-ed448"

    return-object v0
.end method
