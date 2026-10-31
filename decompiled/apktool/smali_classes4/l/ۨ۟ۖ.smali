.class public abstract Ll/ۨ۟ۖ;
.super Ljava/lang/Object;
.source "99JQ"

# interfaces
.implements Ll/᩵۟ۖ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/BufferedBlockCipher;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/BufferedBlockCipher;)V
    .locals 0

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    iput-object p1, p0, Ll/ۨ۟ۖ;->֫:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    return-void
.end method


# virtual methods
.method public final doFinal([BI)I
    .locals 1

    .line 90
    :try_start_0
    iget-object v0, p0, Ll/ۨ۟ۖ;->֫:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {v0, p1, p2}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->doFinal([BI)I

    move-result p1
    :try_end_0
    .catch Lorg/bouncycastle/crypto/InvalidCipherTextException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    .line 92
    new-instance p2, Ll/۠۟ۖ;

    .line 25
    invoke-direct {p2, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 92
    throw p2
.end method

.method public final ֫(I[B[B)I
    .locals 6

    const/4 v5, 0x0

    .line 84
    iget-object v0, p0, Ll/ۨ۟ۖ;->֫:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    const/4 v2, 0x0

    move-object v1, p2

    move v3, p1

    move-object v4, p3

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->processBytes([BII[BI)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴ۟ۖ;[B)V
    .locals 1

    .line 79
    sget-object v0, Ll/ᩴ۟ۖ;->᩶:Ll/ᩴ۟ۖ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 44
    :goto_0
    new-instance v0, Lorg/bouncycastle/crypto/params/DESedeParameters;

    invoke-direct {v0, p2}, Lorg/bouncycastle/crypto/params/DESedeParameters;-><init>([B)V

    .line 79
    iget-object p2, p0, Ll/ۨ۟ۖ;->֫:Lorg/bouncycastle/crypto/BufferedBlockCipher;

    invoke-virtual {p2, p1, v0}, Lorg/bouncycastle/crypto/BufferedBlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method
