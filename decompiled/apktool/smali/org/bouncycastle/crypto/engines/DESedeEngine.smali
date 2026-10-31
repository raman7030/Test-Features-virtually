.class public Lorg/bouncycastle/crypto/engines/DESedeEngine;
.super Lorg/bouncycastle/crypto/engines/DESBase;

# interfaces
.implements Lorg/bouncycastle/crypto/BlockCipher;


# static fields
.field public static final BLOCK_SIZE:I = 0x8


# instance fields
.field public forEncryption:Z

.field public workingKey1:[I

.field public workingKey2:[I

.field public workingKey3:[I


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/DESBase;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey1:[I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey2:[I

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey3:[I

    new-instance v0, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->bitsOfSecurity()I

    move-result v2

    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;-><init>(Ljava/lang/String;I)V

    invoke-static {v0}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void
.end method

.method private bitsOfSecurity()I
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey1:[I

    if-eqz v0, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey3:[I

    if-ne v0, v1, :cond_0

    const/16 v0, 0x50

    return v0

    :cond_0
    const/16 v0, 0x70

    return v0
.end method


# virtual methods
.method public getAlgorithmName()Ljava/lang/String;
    .locals 1

    const-string v0, "DESede"

    return-object v0
.end method

.method public getBlockSize()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 7

    .line 2
    instance-of v0, p2, Lorg/bouncycastle/crypto/params/KeyParameter;

    if-eqz v0, :cond_3

    .line 7
    move-object v0, p2

    check-cast v0, Lorg/bouncycastle/crypto/params/KeyParameter;

    .line 10
    invoke-virtual {v0}, Lorg/bouncycastle/crypto/params/KeyParameter;->getKey()[B

    move-result-object v0

    .line 12
    array-length v1, v0

    const/16 v2, 0x10

    const/16 v3, 0x18

    if-eq v1, v3, :cond_1

    .line 19
    array-length v1, v0

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "key size must be 16 or 24 bytes."

    .line 29
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    throw p1

    .line 32
    :cond_1
    :goto_0
    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->forEncryption:Z

    const/16 v1, 0x8

    new-array v4, v1, [B

    const/4 v5, 0x0

    .line 40
    invoke-static {v0, v5, v4, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    invoke-virtual {p0, p1, v4}, Lorg/bouncycastle/crypto/engines/DESBase;->generateWorkingKey(Z[B)[I

    move-result-object v4

    .line 46
    iput-object v4, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey1:[I

    new-array v4, v1, [B

    .line 51
    invoke-static {v0, v1, v4, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    xor-int/lit8 v6, p1, 0x1

    .line 56
    invoke-virtual {p0, v6, v4}, Lorg/bouncycastle/crypto/engines/DESBase;->generateWorkingKey(Z[B)[I

    move-result-object v4

    .line 59
    iput-object v4, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey2:[I

    .line 60
    array-length v4, v0

    if-ne v4, v3, :cond_2

    new-array v3, v1, [B

    .line 67
    invoke-static {v0, v2, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 70
    invoke-virtual {p0, p1, v3}, Lorg/bouncycastle/crypto/engines/DESBase;->generateWorkingKey(Z[B)[I

    move-result-object p1

    .line 73
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey3:[I

    goto :goto_1

    .line 76
    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey1:[I

    .line 78
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey3:[I

    .line 80
    :goto_1
    new-instance p1, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;

    .line 83
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    .line 87
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/DESedeEngine;->bitsOfSecurity()I

    move-result v1

    .line 90
    iget-boolean v2, p0, Lorg/bouncycastle/crypto/engines/DESedeEngine;->forEncryption:Z

    .line 93
    invoke-static {v2}, Lorg/bouncycastle/crypto/engines/Utils;->getPurpose(Z)Lorg/bouncycastle/crypto/CryptoServicePurpose;

    move-result-object v2

    .line 97
    invoke-direct {p1, v0, v1, p2, v2}, Lorg/bouncycastle/crypto/constraints/DefaultServiceProperties;-><init>(Ljava/lang/String;ILjava/lang/Object;Lorg/bouncycastle/crypto/CryptoServicePurpose;)V

    .line 100
    invoke-static {p1}, Lorg/bouncycastle/crypto/CryptoServicesRegistrar;->checkConstraints(Lorg/bouncycastle/crypto/CryptoServiceProperties;)V

    return-void

    .line 103
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "invalid parameter passed to DESede init - "

    .line 0
    invoke-static {v0, p2}, Ll/᩶۫᩷;->֫(Ljava/lang/String;Lorg/bouncycastle/crypto/CipherParameters;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public processBlock([BI[BI)I
    .locals 12

    move-object v6, p0

    .line 0
    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey1:[I

    if-eqz v1, :cond_3

    add-int/lit8 v0, p2, 0x8

    move-object v2, p1

    array-length v3, v2

    if-gt v0, v3, :cond_2

    add-int/lit8 v0, p4, 0x8

    move-object v7, p3

    array-length v3, v7

    if-gt v0, v3, :cond_1

    const/16 v8, 0x8

    new-array v9, v8, [B

    iget-boolean v0, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->forEncryption:Z

    if-eqz v0, :cond_0

    const/4 v10, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, v9

    move v5, v10

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESBase;->desFunc([I[BI[BI)V

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey2:[I

    const/4 v11, 0x0

    move-object v2, v9

    move v3, v11

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESBase;->desFunc([I[BI[BI)V

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey3:[I

    move-object v4, p3

    move/from16 v5, p4

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESBase;->desFunc([I[BI[BI)V

    goto :goto_0

    :cond_0
    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey3:[I

    const/4 v10, 0x0

    move-object v0, p0

    move-object v2, p1

    move v3, p2

    move-object v4, v9

    move v5, v10

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESBase;->desFunc([I[BI[BI)V

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey2:[I

    const/4 v11, 0x0

    move-object v2, v9

    move v3, v11

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESBase;->desFunc([I[BI[BI)V

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/DESedeEngine;->workingKey1:[I

    move-object v4, p3

    move/from16 v5, p4

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/DESBase;->desFunc([I[BI[BI)V

    :goto_0
    return v8

    :cond_1
    new-instance v0, Lorg/bouncycastle/crypto/OutputLengthException;

    const-string v1, "output buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/OutputLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Lorg/bouncycastle/crypto/DataLengthException;

    const-string v1, "input buffer too short"

    invoke-direct {v0, v1}, Lorg/bouncycastle/crypto/DataLengthException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DESede engine not initialised"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public reset()V
    .locals 0

    return-void
.end method
