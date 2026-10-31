.class public Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;
.super Ljava/lang/Object;


# static fields
.field public static final fixedAbqSet:Ljava/util/Map;

.field public static final sSet:Ljava/util/Map;

.field public static final xSSet:Ljava/util/Map;


# instance fields
.field public final S:[[B

.field public final alpha:I

.field public final l:I

.field public final lsq:I

.field public final m:I

.field public final n:I

.field public final o:I

.field public final params:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

.field public final v:I

.field public final xS:[[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->fixedAbqSet:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->sSet:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xSSet:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;)V
    .locals 14

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->params:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getL()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getLsq()I

    move-result v1

    iput v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getM()I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getV()I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getO()I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getAlpha()I

    move-result v2

    iput v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->getN()I

    move-result p1

    iput p1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->n:I

    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xSSet:Ljava/util/Map;

    invoke-static {v0}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    if-nez p1, :cond_3

    const/4 p1, 0x2

    new-array v3, p1, [I

    const/4 v4, 0x1

    aput v1, v3, v4

    aput v0, v3, v2

    sget-object v5, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    invoke-static {v5, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[B

    new-array v5, p1, [I

    aput v1, v5, v4

    aput v0, v5, v2

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0, v5}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[I

    aget-object v1, v3, v2

    invoke-direct {p0, v1, v2, v4}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->be_aI([BIB)V

    aget-object v1, v3, v4

    invoke-direct {p0, v1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->beTheS([B)V

    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge p1, v1, :cond_0

    add-int/lit8 v5, p1, -0x1

    aget-object v5, v3, v5

    aget-object v6, v3, v4

    aget-object v7, v3, p1

    invoke-static {v5, v6, v7, v1}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16mMul([B[B[BI)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_1
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge p1, v1, :cond_2

    const/4 v1, 0x0

    :goto_2
    iget v4, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    if-ge v1, v4, :cond_1

    aget-object v4, v0, p1

    aget-object v5, v3, p1

    aget-byte v5, v5, v1

    invoke-static {v5}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16FromNibble(I)I

    move-result v5

    aput v5, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_2
    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->sSet:Ljava/util/Map;

    invoke-static {v1}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xSSet:Ljava/util/Map;

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    invoke-static {v1}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->sSet:Ljava/util/Map;

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    invoke-static {v0}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[B

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->S:[[B

    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xSSet:Ljava/util/Map;

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    invoke-static {v0}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[I

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xS:[[I

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    const/4 v0, 0x4

    if-ge p1, v0, :cond_6

    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->fixedAbqSet:Ljava/util/Map;

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    invoke-static {v0}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    iget p1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    mul-int p1, p1, v0

    mul-int v0, v0, p1

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    mul-int v3, v1, p1

    mul-int v1, v1, v0

    shl-int/lit8 v4, v1, 0x2

    new-array v4, v4, [B

    add-int v5, v1, v3

    new-array v6, v5, [B

    shl-int/lit8 v7, v3, 0x2

    new-array v7, v7, [B

    const-string v8, "SNOVA_ABQ"

    invoke-virtual {v8}, Ljava/lang/String;->getBytes()[B

    move-result-object v8

    new-instance v9, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v10, 0x100

    invoke-direct {v9, v10}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    array-length v10, v8

    invoke-virtual {v9, v8, v2, v10}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v9, v6, v2, v5}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    shl-int/lit8 v5, v1, 0x1

    invoke-static {v6, v4, v5}, Lorg/bouncycastle/util/GF16;->decode([B[BI)V

    shl-int/lit8 v8, v3, 0x1

    invoke-static {v6, v0, v7, v2, v8}, Lorg/bouncycastle/util/GF16;->decode([BI[BII)V

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_3
    iget v9, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    if-ge v2, v9, :cond_5

    const/4 v9, 0x0

    move v11, v6

    move v10, v8

    :goto_4
    iget v12, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    if-ge v9, v12, :cond_4

    invoke-direct {p0, v4, v10}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->makeInvertibleByAddingAS([BI)V

    add-int v12, v1, v10

    invoke-direct {p0, v4, v12}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->makeInvertibleByAddingAS([BI)V

    add-int v12, v5, v10

    invoke-direct {p0, v7, v11, v4, v12}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genAFqS([BI[BI)V

    add-int v12, v3, v11

    add-int v13, v5, v1

    add-int/2addr v13, v10

    invoke-direct {p0, v7, v12, v4, v13}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genAFqS([BI[BI)V

    add-int/lit8 v9, v9, 0x1

    iget v12, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/2addr v11, v12

    iget v12, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    add-int/2addr v10, v12

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, 0x1

    add-int/2addr v8, v0

    add-int/2addr v6, p1

    goto :goto_3

    :cond_5
    sget-object p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->fixedAbqSet:Ljava/util/Map;

    invoke-static {v9}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    return-void
.end method

.method private beTheS([B)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 0
    :goto_0
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v0, v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget v3, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v2, v3, :cond_0

    add-int v3, v0, v2

    rsub-int/lit8 v3, v3, 0x8

    add-int v4, v1, v2

    and-int/lit8 v3, v3, 0xf

    int-to-byte v3, v3

    aput-byte v3, p1, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    if-ne v2, v0, :cond_2

    const/16 v0, 0x18

    const/16 v1, 0x9

    aput-byte v1, p1, v0

    :cond_2
    return-void
.end method

.method private be_aI([BIB)V
    .locals 3

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v1, v2, :cond_0

    aput-byte p3, p1, p2

    add-int/lit8 v1, v1, 0x1

    add-int/2addr p2, v0

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static copy4DMatrix([[[[B[[[[BIIII)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_2

    const/4 v2, 0x0

    :goto_1
    if-ge v2, p3, :cond_1

    const/4 v3, 0x0

    :goto_2
    if-ge v3, p4, :cond_0

    .line 0
    aget-object v4, p0, v1

    aget-object v4, v4, v2

    aget-object v4, v4, v3

    aget-object v5, p1, v1

    aget-object v5, v5, v2

    aget-object v5, v5, v3

    invoke-static {v4, v0, v5, v0, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private determinant2x2([BI)B
    .locals 2

    .line 0
    aget-byte v0, p1, p2

    add-int/lit8 v1, p2, 0x3

    aget-byte v1, p1, v1

    invoke-static {v0, v1}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v0

    add-int/lit8 v1, p2, 0x1

    aget-byte v1, p1, v1

    add-int/lit8 p2, p2, 0x2

    aget-byte p1, p1, p2

    invoke-static {v1, p1}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result p1

    xor-int/2addr p1, v0

    int-to-byte p1, p1

    return p1
.end method

.method private determinant3x3([BI)B
    .locals 9

    add-int/lit8 v0, p2, 0x1

    .line 0
    aget-byte v1, p1, p2

    add-int/lit8 v2, p2, 0x2

    aget-byte v0, p1, v0

    add-int/lit8 v3, p2, 0x3

    aget-byte v2, p1, v2

    add-int/lit8 v4, p2, 0x4

    aget-byte v3, p1, v3

    add-int/lit8 v5, p2, 0x5

    aget-byte v4, p1, v4

    add-int/lit8 v6, p2, 0x6

    aget-byte v5, p1, v5

    add-int/lit8 v7, p2, 0x7

    aget-byte v6, p1, v6

    add-int/lit8 p2, p2, 0x8

    aget-byte v7, p1, v7

    aget-byte p1, p1, p2

    invoke-static {v4, p1}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result p2

    invoke-static {v5, v7}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v8

    xor-int/2addr p2, v8

    invoke-static {v1, p2}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result p2

    invoke-static {v3, p1}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result p1

    invoke-static {v5, v6}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v1

    xor-int/2addr p1, v1

    invoke-static {v0, p1}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result p1

    xor-int/2addr p1, p2

    invoke-static {v3, v7}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result p2

    invoke-static {v4, v6}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v0

    xor-int/2addr p2, v0

    invoke-static {v2, p2}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result p2

    xor-int/2addr p1, p2

    int-to-byte p1, p1

    return p1
.end method

.method private determinant4x4([BI)B
    .locals 21

    add-int/lit8 v0, p2, 0x1

    .line 0
    aget-byte v1, p1, p2

    add-int/lit8 v2, p2, 0x2

    aget-byte v0, p1, v0

    add-int/lit8 v3, p2, 0x3

    aget-byte v2, p1, v2

    add-int/lit8 v4, p2, 0x4

    aget-byte v3, p1, v3

    add-int/lit8 v5, p2, 0x5

    aget-byte v4, p1, v4

    add-int/lit8 v6, p2, 0x6

    aget-byte v5, p1, v5

    add-int/lit8 v7, p2, 0x7

    aget-byte v6, p1, v6

    add-int/lit8 v8, p2, 0x8

    aget-byte v7, p1, v7

    add-int/lit8 v9, p2, 0x9

    aget-byte v8, p1, v8

    add-int/lit8 v10, p2, 0xa

    aget-byte v9, p1, v9

    add-int/lit8 v11, p2, 0xb

    aget-byte v10, p1, v10

    add-int/lit8 v12, p2, 0xc

    aget-byte v11, p1, v11

    add-int/lit8 v13, p2, 0xd

    aget-byte v12, p1, v12

    add-int/lit8 v14, p2, 0xe

    aget-byte v13, p1, v13

    add-int/lit8 v15, p2, 0xf

    aget-byte v14, p1, v14

    aget-byte v15, p1, v15

    invoke-static {v10, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v11, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 v18, v3

    xor-int v3, v16, v17

    int-to-byte v3, v3

    invoke-static {v9, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v11, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 v19, v2

    xor-int v2, v16, v17

    int-to-byte v2, v2

    invoke-static {v9, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v10, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 v20, v0

    xor-int v0, v16, v17

    int-to-byte v0, v0

    invoke-static {v8, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v15

    invoke-static {v11, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v11

    xor-int/2addr v11, v15

    int-to-byte v11, v11

    invoke-static {v8, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v14

    invoke-static {v10, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v10, v14

    int-to-byte v10, v10

    invoke-static {v8, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v8

    invoke-static {v9, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v9

    xor-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-static {v5, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v9

    invoke-static {v6, v2}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v12

    xor-int/2addr v9, v12

    invoke-static {v7, v0}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v12

    xor-int/2addr v9, v12

    invoke-static {v1, v9}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v1

    invoke-static {v4, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    invoke-static {v6, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v9

    xor-int/2addr v3, v9

    invoke-static {v7, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v9

    xor-int/2addr v3, v9

    move/from16 v9, v20

    invoke-static {v9, v3}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v3

    xor-int/2addr v1, v3

    invoke-static {v4, v2}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v2

    invoke-static {v5, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    xor-int/2addr v2, v3

    invoke-static {v7, v8}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    xor-int/2addr v2, v3

    move/from16 v3, v19

    invoke-static {v3, v2}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v2

    xor-int/2addr v1, v2

    invoke-static {v4, v0}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v0

    invoke-static {v5, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v2

    xor-int/2addr v0, v2

    invoke-static {v6, v8}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v2

    xor-int/2addr v0, v2

    move/from16 v2, v18

    invoke-static {v2, v0}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v0

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    return v0
.end method

.method private determinant5x5([BI)B
    .locals 30

    add-int/lit8 v0, p2, 0x1

    .line 0
    aget-byte v1, p1, p2

    add-int/lit8 v2, p2, 0x2

    aget-byte v0, p1, v0

    add-int/lit8 v3, p2, 0x3

    aget-byte v2, p1, v2

    add-int/lit8 v4, p2, 0x4

    aget-byte v3, p1, v3

    add-int/lit8 v5, p2, 0x5

    aget-byte v4, p1, v4

    add-int/lit8 v6, p2, 0x6

    aget-byte v5, p1, v5

    add-int/lit8 v7, p2, 0x7

    aget-byte v6, p1, v6

    add-int/lit8 v8, p2, 0x8

    aget-byte v7, p1, v7

    add-int/lit8 v9, p2, 0x9

    aget-byte v8, p1, v8

    add-int/lit8 v10, p2, 0xa

    aget-byte v9, p1, v9

    add-int/lit8 v11, p2, 0xb

    aget-byte v10, p1, v10

    add-int/lit8 v12, p2, 0xc

    aget-byte v11, p1, v11

    add-int/lit8 v13, p2, 0xd

    aget-byte v12, p1, v12

    add-int/lit8 v14, p2, 0xe

    aget-byte v13, p1, v13

    add-int/lit8 v15, p2, 0xf

    aget-byte v14, p1, v14

    add-int/lit8 v16, p2, 0x10

    aget-byte v15, p1, v15

    add-int/lit8 v17, p2, 0x11

    move/from16 v18, v15

    aget-byte v15, p1, v16

    add-int/lit8 v16, p2, 0x12

    move/from16 v19, v15

    aget-byte v15, p1, v17

    add-int/lit8 v17, p2, 0x13

    move/from16 v20, v4

    aget-byte v4, p1, v16

    add-int/lit8 v16, p2, 0x14

    move/from16 v21, v15

    aget-byte v15, p1, v17

    add-int/lit8 v17, p2, 0x15

    move/from16 v22, v3

    aget-byte v3, p1, v16

    add-int/lit8 v16, p2, 0x16

    move/from16 v23, v3

    aget-byte v3, p1, v17

    add-int/lit8 v17, p2, 0x17

    move/from16 v24, v3

    aget-byte v3, p1, v16

    add-int/lit8 v16, p2, 0x18

    move/from16 v25, v3

    aget-byte v3, p1, v17

    move/from16 p2, v3

    aget-byte v3, p1, v16

    invoke-static {v5, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v6, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 v26, v15

    xor-int v15, v16, v17

    int-to-byte v15, v15

    invoke-static {v5, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v7, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 p1, v3

    xor-int v3, v16, v17

    int-to-byte v3, v3

    invoke-static {v5, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v8, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 v27, v4

    xor-int v4, v16, v17

    int-to-byte v4, v4

    invoke-static {v5, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v5

    invoke-static {v9, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v5, v10

    int-to-byte v5, v5

    invoke-static {v6, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    invoke-static {v7, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    xor-int v10, v10, v16

    int-to-byte v10, v10

    invoke-static {v6, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    invoke-static {v8, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    move/from16 v28, v5

    xor-int v5, v16, v17

    int-to-byte v5, v5

    invoke-static {v6, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v6

    invoke-static {v9, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v11

    xor-int/2addr v6, v11

    int-to-byte v6, v6

    invoke-static {v7, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v11

    invoke-static {v8, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    xor-int v11, v11, v16

    int-to-byte v11, v11

    invoke-static {v7, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v7

    invoke-static {v9, v12}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v12

    xor-int/2addr v7, v12

    int-to-byte v7, v7

    invoke-static {v8, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v8

    invoke-static {v9, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v9

    xor-int/2addr v8, v9

    int-to-byte v8, v8

    invoke-static {v1, v10}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v9

    invoke-static {v0, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v12

    xor-int/2addr v9, v12

    invoke-static {v2, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v12

    xor-int/2addr v9, v12

    move/from16 v13, p1

    move/from16 v12, v27

    invoke-static {v12, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v14

    move/from16 v17, v8

    move/from16 v16, v10

    move/from16 v10, v26

    move/from16 v8, p2

    invoke-static {v10, v8}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v26

    xor-int v14, v14, v26

    invoke-static {v9, v14}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v9

    int-to-byte v9, v9

    invoke-static {v1, v5}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v14

    invoke-static {v0, v4}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v26

    xor-int v14, v14, v26

    move/from16 v26, v5

    move/from16 v5, v22

    invoke-static {v5, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v22

    xor-int v14, v14, v22

    move/from16 v22, v7

    move/from16 v7, v21

    invoke-static {v7, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v21

    move/from16 v13, v25

    invoke-static {v10, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v25

    move/from16 v27, v10

    xor-int v10, v21, v25

    invoke-static {v14, v10}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v10

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    invoke-static {v1, v6}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    move/from16 v14, v28

    invoke-static {v0, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v21

    xor-int v10, v10, v21

    move/from16 v21, v6

    move/from16 v6, v20

    invoke-static {v6, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v15

    xor-int/2addr v10, v15

    invoke-static {v7, v8}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v15

    invoke-static {v12, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v20

    xor-int v15, v15, v20

    invoke-static {v10, v15}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v10

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    invoke-static {v1, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    invoke-static {v2, v4}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v15

    xor-int/2addr v10, v15

    invoke-static {v5, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v15

    xor-int/2addr v10, v15

    move/from16 v15, v19

    move/from16 v19, v0

    move/from16 v0, p1

    invoke-static {v15, v0}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v20

    move/from16 v0, v27

    move/from16 v29, v24

    move/from16 v24, v11

    move/from16 v11, v29

    invoke-static {v0, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v25

    xor-int v0, v20, v25

    invoke-static {v10, v0}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v0

    xor-int/2addr v0, v9

    int-to-byte v0, v0

    move/from16 v9, v22

    invoke-static {v1, v9}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    invoke-static {v2, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v20

    xor-int v10, v10, v20

    invoke-static {v6, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    xor-int/2addr v3, v10

    invoke-static {v15, v8}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    invoke-static {v12, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v20

    xor-int v10, v10, v20

    invoke-static {v3, v10}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v3

    xor-int/2addr v0, v3

    int-to-byte v0, v0

    move/from16 v3, v17

    invoke-static {v1, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v1

    invoke-static {v5, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v1, v10

    invoke-static {v6, v4}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    xor-int/2addr v1, v4

    invoke-static {v15, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    invoke-static {v7, v11}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v4, v10

    invoke-static {v1, v4}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v1

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    move/from16 v1, v19

    move/from16 v4, v24

    invoke-static {v1, v4}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    move/from16 v14, v26

    invoke-static {v2, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v17

    xor-int v10, v10, v17

    move/from16 v19, v15

    move/from16 v15, v16

    invoke-static {v5, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v16

    xor-int v10, v10, v16

    move/from16 v16, v4

    move/from16 v24, v11

    move/from16 v11, v18

    move/from16 v4, p1

    invoke-static {v11, v4}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    move/from16 v17, v7

    move/from16 v25, v13

    move/from16 v13, v23

    move/from16 v7, v27

    invoke-static {v7, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v7

    xor-int/2addr v4, v7

    invoke-static {v10, v4}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v4

    xor-int/2addr v0, v4

    int-to-byte v0, v0

    invoke-static {v1, v9}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    move/from16 v7, v21

    invoke-static {v2, v7}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v4, v10

    invoke-static {v6, v15}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v4, v10

    invoke-static {v11, v8}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v8

    invoke-static {v12, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v10

    xor-int/2addr v8, v10

    invoke-static {v4, v8}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v4

    xor-int/2addr v0, v4

    int-to-byte v0, v0

    invoke-static {v1, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v1

    invoke-static {v5, v7}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    xor-int/2addr v1, v4

    invoke-static {v6, v14}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    xor-int/2addr v1, v4

    move/from16 v4, v25

    invoke-static {v11, v4}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v4

    move/from16 v7, v17

    invoke-static {v7, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v7

    xor-int/2addr v4, v7

    invoke-static {v1, v4}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v1

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    invoke-static {v2, v3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v1

    invoke-static {v5, v9}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v2

    xor-int/2addr v1, v2

    move/from16 v2, v16

    invoke-static {v6, v2}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v2

    xor-int/2addr v1, v2

    move/from16 v2, v24

    invoke-static {v11, v2}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v2

    move/from16 v3, v19

    invoke-static {v3, v13}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Lorg/bouncycastle/util/GF16;->mul(II)I

    move-result v1

    xor-int/2addr v0, v1

    int-to-byte v0, v0

    return v0
.end method

.method private genAFqS([BI[BI)V
    .locals 3

    .line 0
    aget-byte v0, p1, p2

    invoke-direct {p0, p3, p4, v0}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->be_aI([BIB)V

    const/4 v0, 0x1

    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/lit8 v2, v1, -0x1

    if-ge v0, v2, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->S:[[B

    aget-object v1, v1, v0

    add-int v2, p2, v0

    aget-byte v2, p1, v2

    invoke-direct {p0, v1, v2, p3, p4}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->gf16mScaleTo([BB[BI)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    add-int v0, p2, v1

    add-int/lit8 v0, v0, -0x1

    aget-byte v0, p1, v0

    if-eqz v0, :cond_1

    add-int/2addr p2, v1

    add-int/lit8 p2, p2, -0x1

    aget-byte p1, p1, p2

    goto :goto_2

    :cond_1
    aget-byte p1, p1, p2

    if-nez p1, :cond_2

    const/4 p2, 0x1

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    :goto_1
    add-int/2addr p1, p2

    rsub-int/lit8 p1, p1, 0x10

    :goto_2
    int-to-byte p1, p1

    iget-object p2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->S:[[B

    add-int/lit8 v1, v1, -0x1

    aget-object p2, p2, v1

    invoke-direct {p0, p2, p1, p3, p4}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->gf16mScaleTo([BB[BI)V

    return-void
.end method

.method private genAFqSCT([BI[B)V
    .locals 7

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    new-array v0, v0, [I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/lit8 v1, v1, 0x1

    aget-byte v2, p1, p2

    invoke-static {v2}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16FromNibble(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    iget v6, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v4, v6, :cond_0

    aput v2, v0, v5

    add-int/lit8 v4, v4, 0x1

    add-int/2addr v5, v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_1
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/lit8 v4, v2, -0x1

    if-ge v1, v4, :cond_2

    add-int v2, p2, v1

    aget-byte v2, p1, v2

    invoke-static {v2}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16FromNibble(I)I

    move-result v2

    const/4 v4, 0x0

    :goto_2
    iget v5, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    if-ge v4, v5, :cond_1

    aget v5, v0, v4

    iget-object v6, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xS:[[I

    aget-object v6, v6, v1

    aget v6, v6, v4

    mul-int v6, v6, v2

    xor-int/2addr v5, v6

    aput v5, v0, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    add-int/2addr v2, p2

    add-int/lit8 v2, v2, -0x1

    aget-byte v1, p1, v2

    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->ctGF16IsNotZero(B)I

    move-result v1

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/2addr v2, p2

    add-int/lit8 v2, v2, -0x1

    aget-byte v2, p1, v2

    mul-int v2, v2, v1

    rsub-int/lit8 v1, v1, 0x1

    aget-byte v4, p1, p2

    invoke-static {v4}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->ctGF16IsNotZero(B)I

    move-result v4

    add-int/lit8 v4, v4, 0xf

    aget-byte p1, p1, p2

    sub-int/2addr v4, p1

    mul-int v4, v4, v1

    add-int/2addr v4, v2

    int-to-byte p1, v4

    invoke-static {p1}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16FromNibble(I)I

    move-result p1

    const/4 p2, 0x0

    :goto_3
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    if-ge p2, v1, :cond_3

    aget v1, v0, p2

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->xS:[[I

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/lit8 v4, v4, -0x1

    aget-object v2, v2, v4

    aget v2, v2, p2

    mul-int v2, v2, p1

    xor-int/2addr v1, v2

    aput v1, v0, p2

    invoke-static {v1}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16ToNibble(I)B

    move-result v1

    aput-byte v1, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_3

    :cond_3
    invoke-static {v0, v3}, Lorg/bouncycastle/util/Arrays;->fill([II)V

    return-void
.end method

.method private genF(Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;[[[B)V
    .locals 12

    .line 0
    iget-object v0, p2, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->p11:[[[[B

    iget-object v1, p1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;->f11:[[[[B

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    iget v5, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    move v3, v4

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->copy4DMatrix([[[[B[[[[BIIII)V

    iget-object v6, p2, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->p12:[[[[B

    iget-object v7, p1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;->f12:[[[[B

    iget v8, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    iget v9, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    iget v10, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    iget v11, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    invoke-static/range {v6 .. v11}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->copy4DMatrix([[[[B[[[[BIIII)V

    iget-object v0, p2, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->p21:[[[[B

    iget-object v1, p1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;->f21:[[[[B

    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    iget v4, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    iget v5, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    invoke-static/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->copy4DMatrix([[[[B[[[[BIIII)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    if-ge v0, v1, :cond_3

    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    if-ge v1, v2, :cond_2

    const/4 v2, 0x0

    :goto_2
    iget v3, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    if-ge v2, v3, :cond_1

    const/4 v3, 0x0

    :goto_3
    iget v4, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    if-ge v3, v4, :cond_0

    iget-object v4, p2, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->p11:[[[[B

    aget-object v4, v4, v0

    aget-object v5, v4, v1

    aget-object v6, v5, v3

    aget-object v5, p3, v3

    aget-object v7, v5, v2

    aget-object v4, v4, v3

    aget-object v8, v4, v1

    iget-object v4, p1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;->f12:[[[[B

    aget-object v4, v4, v0

    aget-object v4, v4, v1

    aget-object v9, v4, v2

    iget-object v4, p1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;->f21:[[[[B

    aget-object v4, v4, v0

    aget-object v4, v4, v2

    aget-object v10, v4, v1

    iget v11, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    invoke-static/range {v6 .. v11}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16mMulToTo([B[B[B[B[BI)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method private genSeedsAndT12([[[B[B)V
    .locals 6

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    mul-int v0, v0, v1

    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    mul-int v0, v0, v1

    add-int/lit8 v1, v0, 0x1

    ushr-int/lit8 v1, v1, 0x1

    new-array v2, v1, [B

    new-instance v3, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v4, 0x100

    invoke-direct {v3, v4}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    array-length v4, p2

    const/4 v5, 0x0

    invoke-virtual {v3, p2, v5, v4}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-virtual {v3, v2, v5, v1}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    new-array p2, v0, [B

    invoke-static {v2, p2, v0}, Lorg/bouncycastle/util/GF16;->decode([B[BI)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    if-ge v0, v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget v3, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    if-ge v2, v3, :cond_0

    aget-object v3, p1, v0

    aget-object v3, v3, v2

    invoke-direct {p0, p2, v1, v3}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genAFqSCT([BI[B)V

    iget v3, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/2addr v1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private generateASMatrixTo([BIB)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget v1, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v0, v1, :cond_2

    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v1, v2, :cond_1

    add-int v3, v0, v1

    rsub-int/lit8 v3, v3, 0x8

    int-to-byte v3, v3

    const/4 v4, 0x5

    if-ne v2, v4, :cond_0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_0

    if-ne v1, v2, :cond_0

    const/16 v3, 0x9

    :cond_0
    add-int v2, p2, v1

    aget-byte v4, p1, v2

    invoke-static {v3, p3}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    xor-int/2addr v3, v4

    int-to-byte v3, v3

    aput-byte v3, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    add-int/2addr p2, v2

    goto :goto_0

    :cond_2
    return-void
.end method

.method private gf16Determinant([BI)B
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->determinant5x5([BI)B

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->determinant4x4([BI)B

    move-result p1

    return p1

    :cond_2
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->determinant3x3([BI)B

    move-result p1

    return p1

    :cond_3
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->determinant2x2([BI)B

    move-result p1

    return p1
.end method

.method private gf16mScaleTo([BB[BI)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 0
    :goto_0
    iget v2, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v0, v2, :cond_1

    const/4 v2, 0x0

    :goto_1
    iget v3, p0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-ge v2, v3, :cond_0

    add-int v3, v1, v2

    add-int v4, v3, p4

    aget-byte v5, p3, v4

    aget-byte v3, p1, v3

    invoke-static {v3, p2}, Lorg/bouncycastle/util/GF16;->mul(BB)B

    move-result v3

    xor-int/2addr v3, v5

    int-to-byte v3, v3

    aput-byte v3, p3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/2addr v1, v3

    goto :goto_0

    :cond_1
    return-void
.end method

.method private makeInvertibleByAddingAS([BI)V
    .locals 2

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->gf16Determinant([BI)B

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_2

    int-to-byte v1, v0

    invoke-direct {p0, p1, p2, v1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->generateASMatrixTo([BIB)V

    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->gf16Determinant([BI)B

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method


# virtual methods
.method public genABQP(Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;[B)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 0
    iget v3, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    mul-int/lit8 v5, v4, 0x2

    iget v6, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    mul-int v5, v5, v6

    iget v7, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->n:I

    mul-int v7, v7, v7

    mul-int v8, v4, v4

    sub-int/2addr v7, v8

    mul-int v7, v7, v4

    add-int/2addr v7, v5

    mul-int v7, v7, v3

    iget v3, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    mul-int/lit8 v5, v3, 0x2

    mul-int v5, v5, v4

    mul-int v5, v5, v6

    add-int/2addr v5, v7

    mul-int v4, v4, v6

    mul-int v4, v4, v3

    shl-int/lit8 v3, v4, 0x1

    new-array v4, v3, [B

    add-int/lit8 v6, v5, 0x1

    shr-int/lit8 v6, v6, 0x1

    new-array v7, v6, [B

    iget-object v8, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->params:Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;

    invoke-virtual {v8}, Lorg/bouncycastle/pqc/crypto/snova/SnovaParameters;->isPkExpandShake()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    const/16 v8, 0x8

    new-array v10, v8, [B

    new-instance v11, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v12, 0x80

    invoke-direct {v11, v12}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    :goto_0
    if-lez v6, :cond_2

    array-length v15, v2

    invoke-virtual {v11, v2, v9, v15}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    invoke-static {v12, v13, v10, v9}, Lorg/bouncycastle/util/Pack;->longToLittleEndian(J[BI)V

    invoke-virtual {v11, v10, v9, v8}, Lorg/bouncycastle/crypto/digests/KeccakDigest;->update([BII)V

    const/16 v15, 0xa8

    invoke-static {v6, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    invoke-virtual {v11, v7, v14, v15}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;->doFinal([BII)I

    add-int/2addr v14, v15

    sub-int/2addr v6, v15

    const-wide/16 v15, 0x1

    add-long/2addr v12, v15

    goto :goto_0

    :cond_0
    const/16 v8, 0x10

    new-array v8, v8, [B

    invoke-static {}, Lorg/bouncycastle/crypto/engines/AESEngine;->newInstance()Lorg/bouncycastle/crypto/MultiBlockCipher;

    move-result-object v10

    invoke-static {v10}, Lorg/bouncycastle/crypto/modes/SICBlockCipher;->newInstance(Lorg/bouncycastle/crypto/BlockCipher;)Lorg/bouncycastle/crypto/modes/CTRModeCipher;

    move-result-object v10

    new-instance v11, Lorg/bouncycastle/crypto/params/ParametersWithIV;

    new-instance v12, Lorg/bouncycastle/crypto/params/KeyParameter;

    invoke-direct {v12, v2}, Lorg/bouncycastle/crypto/params/KeyParameter;-><init>([B)V

    invoke-direct {v11, v12, v8}, Lorg/bouncycastle/crypto/params/ParametersWithIV;-><init>(Lorg/bouncycastle/crypto/CipherParameters;[B)V

    const/4 v2, 0x1

    invoke-interface {v10, v2, v11}, Lorg/bouncycastle/crypto/BlockCipher;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    invoke-interface {v10}, Lorg/bouncycastle/crypto/BlockCipher;->getBlockSize()I

    move-result v2

    new-array v8, v2, [B

    const/4 v11, 0x0

    :goto_1
    add-int v12, v11, v2

    if-gt v12, v6, :cond_1

    invoke-interface {v10, v8, v9, v7, v11}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    move v11, v12

    goto :goto_1

    :cond_1
    if-ge v11, v6, :cond_2

    invoke-interface {v10, v8, v9, v8, v9}, Lorg/bouncycastle/crypto/BlockCipher;->processBlock([BI[BI)I

    sub-int/2addr v6, v11

    invoke-static {v8, v9, v7, v11, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_2
    iget v2, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    and-int/lit8 v2, v2, 0x1

    const/4 v6, 0x4

    if-nez v2, :cond_4

    sub-int v2, v5, v3

    shr-int/lit8 v2, v2, 0x1

    iget v8, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-lt v8, v6, :cond_3

    const/4 v8, 0x1

    goto :goto_2

    :cond_3
    const/4 v8, 0x0

    :goto_2
    invoke-virtual {v1, v7, v2, v8}, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->decode([BIZ)V

    goto :goto_4

    :cond_4
    sub-int v2, v5, v3

    new-array v8, v2, [B

    invoke-static {v7, v8, v2}, Lorg/bouncycastle/util/GF16;->decode([B[BI)V

    iget v2, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-lt v2, v6, :cond_5

    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v1, v8, v2}, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->fill([BZ)V

    :goto_4
    iget v2, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    if-lt v2, v6, :cond_8

    sub-int/2addr v5, v3

    shr-int/lit8 v2, v5, 0x1

    invoke-static {v7, v2, v4, v9, v3}, Lorg/bouncycastle/util/GF16;->decode([BI[BII)V

    iget v2, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    iget v3, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    mul-int v2, v2, v3

    iget v3, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    mul-int v2, v2, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    :goto_5
    iget v6, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    if-ge v3, v6, :cond_7

    const/4 v6, 0x0

    :goto_6
    iget v7, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    if-ge v6, v7, :cond_6

    iget-object v7, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->aAlpha:[[[B

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-direct {v0, v7, v9}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->makeInvertibleByAddingAS([BI)V

    iget-object v7, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->bAlpha:[[[B

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-direct {v0, v7, v9}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->makeInvertibleByAddingAS([BI)V

    iget-object v7, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->qAlpha1:[[[B

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-direct {v0, v4, v5, v7, v9}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genAFqS([BI[BI)V

    iget-object v7, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->qAlpha2:[[[B

    aget-object v7, v7, v3

    aget-object v7, v7, v6

    invoke-direct {v0, v4, v2, v7, v9}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genAFqS([BI[BI)V

    iget v7, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    add-int/2addr v5, v7

    add-int/2addr v2, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_6

    :cond_6
    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_7
    return-void

    :cond_8
    iget v2, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    iget v3, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->alpha:I

    mul-int v3, v3, v2

    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    mul-int v3, v3, v4

    sget-object v4, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->fixedAbqSet:Ljava/util/Map;

    invoke-static {v2}, Lorg/bouncycastle/util/Integers;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    iget-object v4, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->aAlpha:[[[B

    iget v5, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    mul-int v5, v5, v3

    invoke-static {v2, v9, v4, v5}, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->fillAlpha([BI[[[BI)I

    iget-object v4, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->bAlpha:[[[B

    iget v5, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    add-int/lit8 v5, v5, -0x1

    mul-int v5, v5, v3

    invoke-static {v2, v3, v4, v5}, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->fillAlpha([BI[[[BI)I

    mul-int/lit8 v4, v3, 0x2

    iget-object v5, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->qAlpha1:[[[B

    iget v6, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    add-int/lit8 v6, v6, -0x2

    mul-int v6, v6, v3

    invoke-static {v2, v4, v5, v6}, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->fillAlpha([BI[[[BI)I

    mul-int/lit8 v4, v3, 0x3

    iget-object v1, v1, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->qAlpha2:[[[B

    iget v5, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    add-int/lit8 v5, v5, -0x3

    mul-int v5, v5, v3

    invoke-static {v2, v4, v1, v5}, Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;->fillAlpha([BI[[[BI)I

    return-void
.end method

.method public genMap1T12Map2(Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyElements;[B[B)V
    .locals 1

    .line 0
    iget-object v0, p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyElements;->T12:[[[B

    invoke-direct {p0, v0, p3}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genSeedsAndT12([[[B[B)V

    iget-object p3, p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyElements;->map1:Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;

    invoke-virtual {p0, p3, p2}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genABQP(Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;[B)V

    iget-object p2, p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyElements;->map2:Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;

    iget-object p3, p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyElements;->map1:Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;

    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/snova/SnovaKeyElements;->T12:[[[B

    invoke-direct {p0, p2, p3, p1}, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->genF(Lorg/bouncycastle/pqc/crypto/snova/MapGroup2;Lorg/bouncycastle/pqc/crypto/snova/MapGroup1;[[[B)V

    return-void
.end method

.method public genP22([BI[[[B[[[[B[[[[B)V
    .locals 20

    move-object/from16 v0, p0

    .line 0
    iget v1, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    iget v2, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    mul-int v2, v2, v1

    mul-int v1, v1, v2

    iget v3, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    mul-int v3, v3, v1

    new-array v11, v3, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_0
    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->m:I

    if-ge v12, v4, :cond_3

    const/4 v4, 0x0

    move v15, v13

    const/4 v14, 0x0

    :goto_1
    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    if-ge v14, v4, :cond_2

    const/4 v4, 0x0

    move/from16 v16, v15

    const/4 v10, 0x0

    :goto_2
    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->o:I

    if-ge v10, v4, :cond_1

    const/4 v4, 0x0

    const/4 v9, 0x0

    :goto_3
    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->v:I

    if-ge v9, v4, :cond_0

    aget-object v4, p3, v9

    aget-object v5, v4, v14

    aget-object v6, p5, v12

    aget-object v6, v6, v9

    aget-object v6, v6, v10

    aget-object v7, p4, v12

    aget-object v7, v7, v14

    aget-object v7, v7, v9

    aget-object v8, v4, v10

    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->l:I

    move/from16 v17, v4

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v11

    move/from16 v18, v9

    move/from16 v9, v16

    move/from16 v19, v10

    move/from16 v10, v17

    invoke-static/range {v4 .. v10}, Lorg/bouncycastle/pqc/crypto/snova/GF16Utils;->gf16mMulTo([B[B[B[B[BII)V

    add-int/lit8 v9, v18, 0x1

    move/from16 v10, v19

    goto :goto_3

    :cond_0
    move/from16 v19, v10

    add-int/lit8 v10, v19, 0x1

    iget v4, v0, Lorg/bouncycastle/pqc/crypto/snova/SnovaEngine;->lsq:I

    add-int v16, v16, v4

    goto :goto_2

    :cond_1
    add-int/lit8 v14, v14, 0x1

    add-int/2addr v15, v2

    goto :goto_1

    :cond_2
    add-int/lit8 v12, v12, 0x1

    add-int/2addr v13, v1

    goto :goto_0

    :cond_3
    move-object/from16 v4, p1

    move/from16 v5, p2

    invoke-static {v11, v4, v5, v3}, Lorg/bouncycastle/util/GF16;->encode([B[BII)V

    return-void
.end method
