.class public final Ll/᩸ۡۘ;
.super Ljava/lang/Object;
.source "W7WE"

# interfaces
.implements Ll/᩻ۜۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/modes/CTRModeCipher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBlockSize()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final synthetic ֫(I)V
    .locals 0

    return-void
.end method

.method public final ֫(I[BI[BI)V
    .locals 6

    .line 78
    iget-object v0, p0, Ll/᩸ۡۘ;->֫:Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    move-object v1, p2

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-interface/range {v0 .. v5}, Lorg/bouncycastle/crypto/StreamCipher;->processBytes([BII[BI)I

    return-void
.end method

.method public final ֫(I[B[B)V
    .locals 4

    .line 54
    array-length v0, p3

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-le v0, v2, :cond_0

    new-array v0, v2, [B

    .line 56
    invoke-static {p3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p3, v0

    .line 59
    :cond_0
    array-length v0, p2

    const/16 v2, 0x10

    if-le v0, v2, :cond_1

    new-array v0, v2, [B

    .line 61
    invoke-static {p2, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, v0

    .line 66
    :cond_1
    :try_start_0
    new-instance v0, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    array-length v3, p2

    invoke-direct {v2, p2, v1, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    array-length p2, p3

    invoke-direct {v0, v2, p3, v1, p2}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    .line 68
    new-instance p2, Lorg/bouncycastle/crypto/engines/CAST5Engine;

    invoke-direct {p2}, Lorg/bouncycastle/crypto/engines/CAST5Engine;-><init>()V

    invoke-static {p2}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    move-result-object p2

    iput-object p2, p0, Ll/᩸ۡۘ;->֫:Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    if-nez p1, :cond_2

    const/4 v1, 0x1

    .line 69
    :cond_2
    invoke-interface {p2, v1, v0}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 71
    iput-object p2, p0, Ll/᩸ۡۘ;->֫:Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    .line 72
    throw p1
.end method

.method public final synthetic ֫([B)V
    .locals 0

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ۧ()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ۧ(I[BI[BI)V
    .locals 0

    return-void
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final synthetic ܿ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
