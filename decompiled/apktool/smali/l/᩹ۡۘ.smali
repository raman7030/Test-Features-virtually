.class public final Ll/᩹ۡۘ;
.super Ljava/lang/Object;
.source "37WC"

# interfaces
.implements Ll/᩻ۜۘ;


# instance fields
.field public ֫:Lorg/bouncycastle/crypto/params/KeyParameter;

.field public ۧ:Lorg/bouncycastle/crypto/params/KeyParameter;

.field public ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

.field public ܽ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

.field public ܿ:I

.field public ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getBlockSize()I
    .locals 1

    const/16 v0, 0x40

    return v0
.end method

.method public final ֫(I)V
    .locals 12

    const/16 v0, 0x8

    .line 95
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    int-to-long v1, p1

    const/4 p1, 0x0

    .line 96
    invoke-virtual {v0, p1, v1, v2}, Ljava/nio/ByteBuffer;->putLong(IJ)Ljava/nio/ByteBuffer;

    .line 97
    iget-object v1, p0, Ll/᩹ۡۘ;->ܽ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    iget v2, p0, Ll/᩹ۡۘ;->ܿ:I

    const/4 v3, 0x1

    if-nez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance v4, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iget-object v5, p0, Ll/᩹ۡۘ;->֫:Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 98
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    array-length v7, v7

    invoke-direct {v4, v5, v6, p1, v7}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    .line 97
    invoke-virtual {v1, v2, v4}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    .line 99
    iget-object v1, p0, Ll/᩹ۡۘ;->ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    iget v2, p0, Ll/᩹ۡۘ;->ܿ:I

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    new-instance v2, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    iget-object v4, p0, Ll/᩹ۡۘ;->ۧ:Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 100
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v5

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    array-length v0, v0

    invoke-direct {v2, v4, v5, p1, v0}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[BII)V

    .line 99
    invoke-virtual {v1, v3, v2}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    const/16 v9, 0x40

    new-array v0, v9, [B

    .line 104
    iget-object v6, p0, Ll/᩹ۡۘ;->ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    const/4 v8, 0x0

    const/4 v11, 0x0

    move-object v7, v0

    move-object v10, v0

    invoke-virtual/range {v6 .. v11}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->processBytes([BII[BI)I

    .line 105
    iget-object v1, p0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

    new-instance v2, Lorg/bouncycastle/crypto/params/KeyParameter;

    const/16 v3, 0x20

    invoke-direct {v2, v0, p1, v3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/macs/Poly1305;->init(Lorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public final ֫(I[BI[BI)V
    .locals 6

    .line 110
    iget-object v0, p0, Ll/᩹ۡۘ;->ܽ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    move-object v1, p2

    move v2, p1

    move v3, p3

    move-object v4, p4

    move v5, p5

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->processBytes([BII[BI)I

    return-void
.end method

.method public final ֫(I[B[B)V
    .locals 3

    .line 68
    array-length p3, p2

    const/4 v0, 0x0

    const/16 v1, 0x40

    if-le p3, v1, :cond_0

    new-array p3, v1, [B

    .line 70
    invoke-static {p2, v0, p3, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p2, p3

    :cond_0
    const/16 p3, 0x20

    new-array v1, p3, [B

    new-array v2, p3, [B

    .line 75
    invoke-static {p2, p3, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 76
    invoke-static {p2, v0, v2, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 77
    iput p1, p0, Ll/᩹ۡۘ;->ܿ:I

    .line 79
    :try_start_0
    new-instance p1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {p1, v1, v0, p3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    iput-object p1, p0, Ll/᩹ۡۘ;->֫:Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 80
    new-instance p1, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {p1, v2, v0, p3}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([BII)V

    iput-object p1, p0, Ll/᩹ۡۘ;->ۧ:Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 81
    new-instance p1, Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/ChaChaEngine;-><init>()V

    iput-object p1, p0, Ll/᩹ۡۘ;->ܽ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    .line 82
    new-instance p1, Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/ChaChaEngine;-><init>()V

    iput-object p1, p0, Ll/᩹ۡۘ;->ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    .line 83
    new-instance p1, Lorg/bouncycastle/crypto/macs/Poly1305;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/macs/Poly1305;-><init>()V

    iput-object p1, p0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const/4 p2, 0x0

    .line 85
    iput-object p2, p0, Ll/᩹ۡۘ;->ܽ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    .line 86
    iput-object p2, p0, Ll/᩹ۡۘ;->ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    .line 87
    iput-object p2, p0, Ll/᩹ۡۘ;->֫:Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 88
    iput-object p2, p0, Ll/᩹ۡۘ;->ۧ:Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 89
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

.method public final ۧ()I
    .locals 1

    const/16 v0, 0x10

    return v0
.end method

.method public final ۧ(I[BI[BI)V
    .locals 13

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v9, p5

    .line 117
    iget v3, v0, Ll/᩹ۡۘ;->ܿ:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_3

    const/16 v3, 0x10

    new-array v4, v3, [B

    const/4 v5, 0x0

    .line 119
    invoke-static {p2, v7, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v6, v3, [B

    if-gez v1, :cond_0

    .line 122
    iget-object v10, v0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

    add-int/lit8 v11, v1, 0x4

    invoke-virtual {v10, p2, v11, v7}, Lorg/bouncycastle/crypto/macs/Poly1305;->update([BII)V

    goto :goto_0

    .line 124
    :cond_0
    iget-object v10, v0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

    invoke-virtual {v10, p2, p1, v7}, Lorg/bouncycastle/crypto/macs/Poly1305;->update([BII)V

    .line 126
    :goto_0
    iget-object v10, v0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

    invoke-virtual {v10, v6, v5}, Lorg/bouncycastle/crypto/macs/Poly1305;->doFinal([BI)I

    const/4 v10, 0x0

    :goto_1
    if-ge v5, v3, :cond_1

    .line 164
    aget-byte v11, v4, v5

    aget-byte v12, v6, v5

    xor-int/2addr v11, v12

    or-int/2addr v10, v11

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    if-nez v10, :cond_2

    goto :goto_2

    .line 128
    :cond_2
    new-instance v1, Ljavax/crypto/AEADBadTagException;

    const-string v2, "Tag mismatch"

    invoke-direct {v1, v2}, Ljavax/crypto/AEADBadTagException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    :goto_2
    if-gez v1, :cond_4

    .line 133
    iget-object v3, v0, Ll/᩹ۡۘ;->ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    add-int/lit8 v4, v1, 0x4

    add-int/lit8 v5, v7, -0x4

    sub-int/2addr v5, v1

    add-int/lit8 v6, v9, 0x4

    add-int/2addr v6, v1

    move-object v1, v3

    move-object v2, p2

    move v3, v4

    move v4, v5

    move-object/from16 v5, p4

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->processBytes([BII[BI)I

    goto :goto_3

    .line 135
    :cond_4
    iget-object v3, v0, Ll/᩹ۡۘ;->ᩳ:Lorg/bouncycastle/crypto/engines/ChaChaEngine;

    add-int/lit8 v4, v1, 0x4

    add-int/lit8 v5, v7, -0x4

    add-int/lit8 v6, v9, 0x4

    move-object v1, v3

    move-object v2, p2

    move v3, v4

    move v4, v5

    move-object/from16 v5, p4

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/crypto/engines/Salsa20Engine;->processBytes([BII[BI)I

    .line 138
    :goto_3
    iget v1, v0, Ll/᩹ۡۘ;->ܿ:I

    if-nez v1, :cond_5

    .line 139
    iget-object v1, v0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

    invoke-virtual {v1, v8, v9, v7}, Lorg/bouncycastle/crypto/macs/Poly1305;->update([BII)V

    .line 140
    iget-object v1, v0, Ll/᩹ۡۘ;->ܳ:Lorg/bouncycastle/crypto/macs/Poly1305;

    invoke-virtual {v1, v8, v7}, Lorg/bouncycastle/crypto/macs/Poly1305;->doFinal([BI)I

    :cond_5
    return-void
.end method

.method public final ܽ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ܿ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ᩳ()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method
