.class public abstract Ll/᩸ܺۘ;
.super Ljava/lang/Object;
.source "U7XL"

# interfaces
.implements Ll/᩻ۜۘ;


# instance fields
.field public ֫:Ljavax/crypto/Cipher;

.field public ۧ:J

.field public ܽ:Ljava/nio/ByteBuffer;

.field public ܿ:I

.field public ᩳ:Ljavax/crypto/spec/SecretKeySpec;


# virtual methods
.method public final synthetic ֫(I)V
    .locals 0

    return-void
.end method

.method public ֫(I[BI[BI)V
    .locals 6

    .line 86
    iget-object v0, p0, Ll/᩸ܺۘ;->֫:Ljavax/crypto/Cipher;

    move-object v1, p2

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->update([BII[BI)I

    return-void
.end method

.method public ֫(I[B[B)V
    .locals 3

    .line 57
    array-length v0, p3

    const/4 v1, 0x0

    const/16 v2, 0xc

    if-le v0, v2, :cond_0

    new-array v0, v2, [B

    .line 59
    invoke-static {p3, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p3, v0

    .line 62
    :cond_0
    invoke-interface {p0}, Ll/᩻ۜۘ;->getBlockSize()I

    move-result v0

    .line 63
    array-length v2, p2

    if-le v2, v0, :cond_1

    .line 64
    new-array v2, v0, [B

    .line 65
    invoke-static {p2, v1, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, v2

    :cond_1
    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x2

    .line 69
    :goto_0
    iput p1, p0, Ll/᩸ܺۘ;->ܿ:I

    .line 70
    invoke-static {p3}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ܺۘ;->ܽ:Ljava/nio/ByteBuffer;

    const/4 v0, 0x4

    .line 71
    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v0

    iput-wide v0, p0, Ll/᩸ܺۘ;->ۧ:J

    .line 73
    :try_start_0
    new-instance p1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v0, "AES"

    invoke-direct {p1, p2, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object p1, p0, Ll/᩸ܺۘ;->ᩳ:Ljavax/crypto/spec/SecretKeySpec;

    const-string p1, "AES/GCM/NoPadding"

    .line 74
    invoke-static {p1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object p1

    iput-object p1, p0, Ll/᩸ܺۘ;->֫:Ljavax/crypto/Cipher;

    .line 75
    iget p2, p0, Ll/᩸ܺۘ;->ܿ:I

    iget-object v0, p0, Ll/᩸ܺۘ;->ᩳ:Ljavax/crypto/spec/SecretKeySpec;

    new-instance v1, Ljavax/crypto/spec/GCMParameterSpec;

    const/16 v2, 0x80

    invoke-direct {v1, v2, p3}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    invoke-virtual {p1, p2, v0, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 77
    iput-object p2, p0, Ll/᩸ܺۘ;->֫:Ljavax/crypto/Cipher;

    .line 78
    iput-object p2, p0, Ll/᩸ܺۘ;->ᩳ:Ljavax/crypto/spec/SecretKeySpec;

    .line 79
    iput-object p2, p0, Ll/᩸ܺۘ;->ܽ:Ljava/nio/ByteBuffer;

    .line 80
    throw p1
.end method

.method public ֫([B)V
    .locals 3

    const/4 v0, 0x4

    .line 91
    iget-object v1, p0, Ll/᩸ܺۘ;->֫:Ljavax/crypto/Cipher;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2, v0}, Ljavax/crypto/Cipher;->updateAAD([BII)V

    return-void
.end method

.method public ۧ(I[BI[BI)V
    .locals 6

    .line 96
    iget-object v0, p0, Ll/᩸ܺۘ;->֫:Ljavax/crypto/Cipher;

    move-object v1, p2

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 97
    iget-object p1, p0, Ll/᩸ܺۘ;->ܽ:Ljava/nio/ByteBuffer;

    const/4 p2, 0x4

    invoke-virtual {p1, p2}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide p3

    const-wide/16 v0, 0x1

    add-long/2addr p3, v0

    .line 98
    iget-wide v0, p0, Ll/᩸ܺۘ;->ۧ:J

    cmp-long p1, p3, v0

    if-eqz p1, :cond_0

    .line 101
    iget-object p1, p0, Ll/᩸ܺۘ;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, p2, p3, p4}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 102
    iget-object p1, p0, Ll/᩸ܺۘ;->֫:Ljavax/crypto/Cipher;

    iget p2, p0, Ll/᩸ܺۘ;->ܿ:I

    iget-object p3, p0, Ll/᩸ܺۘ;->ᩳ:Ljavax/crypto/spec/SecretKeySpec;

    new-instance p4, Ljavax/crypto/spec/GCMParameterSpec;

    iget-object p5, p0, Ll/᩸ܺۘ;->ܽ:Ljava/nio/ByteBuffer;

    invoke-virtual {p5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p5

    const/16 v0, 0x80

    invoke-direct {p4, v0, p5}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    invoke-virtual {p1, p2, p3, p4}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    return-void

    .line 99
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "GCM IV would be reused"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final synthetic ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
