.class public abstract Ll/᩺۟ۖ;
.super Ljava/lang/Object;
.source "99JQ"

# interfaces
.implements Ll/᩵۟ۖ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/engines/RC4Engine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/RC4Engine;)V
    .locals 0

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Ll/᩺۟ۖ;->֫:Lorg/bouncycastle/crypto/engines/RC4Engine;

    return-void
.end method


# virtual methods
.method public final doFinal([BI)I
    .locals 0

    .line 125
    iget-object p1, p0, Ll/᩺۟ۖ;->֫:Lorg/bouncycastle/crypto/engines/RC4Engine;

    invoke-interface {p1}, Lorg/bouncycastle/crypto/StreamCipher;->reset()V

    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(I[B[B)I
    .locals 6

    const/4 v5, 0x0

    .line 120
    iget-object v0, p0, Ll/᩺۟ۖ;->֫:Lorg/bouncycastle/crypto/engines/RC4Engine;

    const/4 v2, 0x0

    move-object v1, p2

    move v3, p1

    move-object v4, p3

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)I

    move-result p1

    return p1
.end method

.method public final ֫(Ll/ᩴ۟ۖ;[B)V
    .locals 1

    .line 113
    sget-object v0, Ll/ᩴ۟ۖ;->᩶:Ll/ᩴ۟ۖ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 55
    :goto_0
    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v0, p2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    .line 113
    iget-object p2, p0, Ll/᩺۟ۖ;->֫:Lorg/bouncycastle/crypto/engines/RC4Engine;

    invoke-interface {p2, p1, v0}, Lorg/bouncycastle/crypto/StreamCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method
