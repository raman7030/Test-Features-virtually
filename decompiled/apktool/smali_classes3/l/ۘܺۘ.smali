.class public final Ll/ۘܺۘ;
.super Ljava/lang/Object;
.source "W7YS"

# interfaces
.implements Ll/᩻ۜۘ;


# instance fields
.field public ֫:Ljavax/crypto/Cipher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 33
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

    .line 76
    iget-object v0, p0, Ll/ۘܺۘ;->֫:Ljavax/crypto/Cipher;

    move-object v1, p2

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->update([BII[BI)I

    return-void
.end method

.method public final ֫(I[B[B)V
    .locals 3

    .line 51
    array-length v0, p3

    const/4 v1, 0x0

    const/16 v2, 0x10

    if-le v0, v2, :cond_0

    new-array v0, v2, [B

    .line 53
    invoke-static {p3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p3, v0

    .line 56
    :cond_0
    array-length v0, p2

    if-le v0, v2, :cond_1

    new-array v0, v2, [B

    .line 58
    invoke-static {p2, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, v0

    .line 63
    :cond_1
    :try_start_0
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p2, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const-string p2, "AES/CBC/NoPadding"

    .line 64
    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p2

    iput-object p2, p0, Ll/ۘܺۘ;->֫:Ljavax/crypto/Cipher;

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    .line 66
    :goto_0
    new-instance v1, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v1, p3}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 65
    invoke-virtual {p2, p1, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 69
    iput-object p2, p0, Ll/ۘܺۘ;->֫:Ljavax/crypto/Cipher;

    .line 70
    throw p1
.end method

.method public final synthetic ֫([B)V
    .locals 0

    return-void
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

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

    const/16 v0, 0x10

    return v0
.end method
