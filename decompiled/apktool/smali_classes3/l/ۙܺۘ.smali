.class public final Ll/ۙܺۘ;
.super Ljava/lang/Object;
.source "I7W7"

# interfaces
.implements Ll/᩻ۜۘ;


# instance fields
.field public ֫:Ljavax/crypto/Cipher;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
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

    .line 70
    iget-object v0, p0, Ll/ۙܺۘ;->֫:Ljavax/crypto/Cipher;

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

    const-string p3, "RC4"

    .line 50
    array-length v0, p2

    const/16 v1, 0x10

    if-le v0, v1, :cond_0

    new-array v0, v1, [B

    const/4 v2, 0x0

    .line 52
    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, v0

    .line 57
    :cond_0
    :try_start_0
    invoke-static {p3}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    iput-object v0, p0, Ll/ۙܺۘ;->֫:Ljavax/crypto/Cipher;

    .line 58
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v0, p2, p3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 59
    iget-object p2, p0, Ll/ۙܺۘ;->֫:Ljavax/crypto/Cipher;

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x2

    :goto_0
    invoke-virtual {p2, p1, v0}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 63
    iput-object p2, p0, Ll/ۙܺۘ;->֫:Ljavax/crypto/Cipher;

    .line 64
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
