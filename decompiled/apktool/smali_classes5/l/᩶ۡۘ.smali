.class public Ll/᩶ۡۘ;
.super Ljava/lang/Object;
.source "Y7XH"

# interfaces
.implements Ll/֨ۢۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;

.field public ۧ:Z

.field public ܽ:Lorg/bouncycastle/crypto/macs/HMac;

.field public final ᩳ:[B


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x4

    new-array v0, v0, [B

    .line 58
    iput-object v0, p0, Ll/᩶ۡۘ;->ᩳ:[B

    .line 35
    new-instance v0, Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;

    invoke-direct {v0}, Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;-><init>()V

    iput-object v0, p0, Ll/᩶ۡۘ;->֫:Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;

    return-void
.end method


# virtual methods
.method public final getBlockSize()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public final init([B)V
    .locals 3

    .line 48
    array-length v0, p1

    const/4 v1, 0x0

    const/16 v2, 0x14

    if-le v0, v2, :cond_0

    new-array v0, v2, [B

    .line 50
    invoke-static {p1, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p1, v0

    .line 53
    :cond_0
    new-instance v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    array-length v2, p1

    invoke-direct {v0, p1, v1, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    .line 54
    new-instance p1, Lorg/bouncycastle/crypto/macs/HMac;

    iget-object v1, p0, Ll/᩶ۡۘ;->֫:Lorg/bouncycastle/crypto/digests/RIPEMD160Digest;

    invoke-direct {p1, v1}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    iput-object p1, p0, Ll/᩶ۡۘ;->ܽ:Lorg/bouncycastle/crypto/macs/HMac;

    .line 55
    invoke-virtual {p1, v0}, Lorg/bouncycastle/crypto/macs/HMac;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public final ֫(I)V
    .locals 3

    ushr-int/lit8 v0, p1, 0x18

    int-to-byte v0, v0

    .line 62
    iget-object v1, p0, Ll/᩶ۡۘ;->ᩳ:[B

    const/4 v2, 0x0

    aput-byte v0, v1, v2

    ushr-int/lit8 v0, p1, 0x10

    int-to-byte v0, v0

    const/4 v2, 0x1

    .line 63
    aput-byte v0, v1, v2

    ushr-int/lit8 v0, p1, 0x8

    int-to-byte v0, v0

    const/4 v2, 0x2

    .line 64
    aput-byte v0, v1, v2

    const/4 v0, 0x3

    int-to-byte p1, p1

    .line 65
    aput-byte p1, v1, v0

    const/4 p1, 0x4

    .line 66
    invoke-virtual {p0, p1, v1}, Ll/᩶ۡۘ;->֫(I[B)V

    return-void
.end method

.method public final ֫(I[B)V
    .locals 2

    const/4 v0, 0x0

    .line 71
    iget-object v1, p0, Ll/᩶ۡۘ;->ܽ:Lorg/bouncycastle/crypto/macs/HMac;

    invoke-virtual {v1, p2, v0, p1}, Lorg/bouncycastle/crypto/macs/HMac;->update([BII)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 86
    iget-boolean v0, p0, Ll/᩶ۡۘ;->ۧ:Z

    return v0
.end method

.method public final ۧ(I[B)V
    .locals 1

    .line 76
    iget-object v0, p0, Ll/᩶ۡۘ;->ܽ:Lorg/bouncycastle/crypto/macs/HMac;

    invoke-virtual {v0, p2, p1}, Lorg/bouncycastle/crypto/macs/HMac;->doFinal([BI)I

    return-void
.end method
