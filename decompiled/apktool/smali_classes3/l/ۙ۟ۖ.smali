.class public abstract Ll/ۙ۟ۖ;
.super Ljava/lang/Object;
.source "G9IQ"

# interfaces
.implements Ll/ۘ۟ۖ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/modes/AEADBlockCipher;)V
    .locals 0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    iput-object p1, p0, Ll/ۙ۟ۖ;->֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    return-void
.end method


# virtual methods
.method public final update([BII)[B
    .locals 7

    .line 101
    iget-object v0, p0, Ll/ۙ۟ۖ;->֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v0, p3}, Lorg/bouncycastle/crypto/modes/AEADCipher;->getUpdateOutputSize(I)I

    move-result v0

    .line 102
    new-array v0, v0, [B

    .line 103
    iget-object v1, p0, Ll/ۙ۟ۖ;->֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    const/4 v6, 0x0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, v0

    invoke-interface/range {v1 .. v6}, Lorg/bouncycastle/crypto/modes/AEADCipher;->processBytes([BII[BI)I

    return-object v0
.end method

.method public abstract ֫([BLjavax/crypto/spec/GCMParameterSpec;)Lorg/bouncycastle/crypto/params/AEADParameters;
.end method

.method public final ֫(Ll/ᩴ۟ۖ;[BLjavax/crypto/spec/GCMParameterSpec;)V
    .locals 1

    .line 91
    sget-object v0, Ll/ᩴ۟ۖ;->᩶:Ll/ᩴ۟ۖ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p2, p3}, Ll/ۙ۟ۖ;->֫([BLjavax/crypto/spec/GCMParameterSpec;)Lorg/bouncycastle/crypto/params/AEADParameters;

    move-result-object p2

    iget-object p3, p0, Ll/ۙ۟ۖ;->֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {p3, p1, p2}, Lorg/bouncycastle/crypto/modes/AEADCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public final ֫([B)V
    .locals 3

    const/16 v0, 0x20

    .line 96
    iget-object v1, p0, Ll/ۙ۟ۖ;->֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    const/4 v2, 0x0

    invoke-interface {v1, p1, v2, v0}, Lorg/bouncycastle/crypto/modes/AEADCipher;->processAADBytes([BII)V

    return-void
.end method

.method public final ۧ(I[B)[B
    .locals 8

    .line 110
    iget-object v6, p0, Ll/ۙ۟ۖ;->֫:Lorg/bouncycastle/crypto/modes/AEADBlockCipher;

    invoke-interface {v6, p1}, Lorg/bouncycastle/crypto/modes/AEADCipher;->getOutputSize(I)I

    move-result v0

    .line 111
    new-array v7, v0, [B

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    move-object v1, p2

    move v3, p1

    move-object v4, v7

    .line 112
    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/modes/AEADCipher;->processBytes([BII[BI)I

    move-result p1

    .line 114
    :try_start_0
    invoke-interface {v6, v7, p1}, Lorg/bouncycastle/crypto/modes/AEADCipher;->doFinal([BI)I
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v7

    :catch_0
    move-exception p1

    .line 116
    new-instance p2, Ll/۠۟ۖ;

    .line 25
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 116
    throw p2
.end method
