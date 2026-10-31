.class public Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/pqc/crypto/MessageSigner;


# instance fields
.field public final hashFunctions:Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;

.field public keyData:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_1

    invoke-interface {p2}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    new-instance v0, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;

    invoke-direct {v0, p1, p2}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;-><init>(Lorg/bouncycastle/crypto/Digest;Lorg/bouncycastle/crypto/Digest;)V

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->hashFunctions:Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "2n-digest needs to produce 64 bytes of output"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n-digest needs to produce 32 bytes of output"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static compute_authpath_wots(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[BILorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;[B[BI)V
    .locals 22

    move-object/from16 v0, p4

    .line 0
    new-instance v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;

    invoke-direct {v1, v0}, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;-><init>(Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;)V

    const/16 v2, 0x800

    new-array v2, v2, [B

    const/16 v3, 0x400

    new-array v3, v3, [B

    const v4, 0x10c00

    new-array v12, v4, [B

    const-wide/16 v13, 0x0

    iput-wide v13, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    :goto_0
    iget-wide v4, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    const-wide/16 v15, 0x1

    const-wide/16 v17, 0x20

    cmp-long v6, v4, v17

    if-gez v6, :cond_0

    mul-long v4, v4, v17

    long-to-int v5, v4

    move-object/from16 v11, p0

    move-object/from16 v4, p5

    invoke-static {v11, v3, v5, v4, v1}, Lorg/bouncycastle/pqc/crypto/sphincs/Seed;->get_seed(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[BLorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;)V

    iget-wide v5, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    add-long/2addr v5, v15

    iput-wide v5, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    goto :goto_0

    :cond_0
    move-object/from16 v11, p0

    new-instance v19, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;

    invoke-direct/range {v19 .. v19}, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;-><init>()V

    iput-wide v13, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    :goto_1
    iget-wide v4, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    const-wide/16 v20, 0x860

    cmp-long v6, v4, v17

    if-gez v6, :cond_1

    mul-long v6, v4, v20

    long-to-int v7, v6

    mul-long v4, v4, v17

    long-to-int v9, v4

    const/16 v20, 0x0

    move-object/from16 v4, v19

    move-object/from16 v5, p0

    move-object v6, v12

    move-object v8, v3

    move-object/from16 v10, p6

    move/from16 v11, v20

    invoke-virtual/range {v4 .. v11}, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;->wots_pkgen(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[BI[BI)V

    iget-wide v4, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    add-long/2addr v4, v15

    iput-wide v4, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    move-object/from16 v11, p0

    goto :goto_1

    :cond_1
    :goto_2
    iput-wide v13, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    iget-wide v3, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    cmp-long v5, v3, v17

    if-gez v5, :cond_2

    const-wide/16 v5, 0x400

    mul-long v7, v3, v17

    add-long/2addr v7, v5

    long-to-int v5, v7

    mul-long v3, v3, v20

    long-to-int v7, v3

    const/4 v9, 0x0

    move-object/from16 v3, p0

    move-object v4, v2

    move-object v6, v12

    move-object/from16 v8, p6

    invoke-static/range {v3 .. v9}, Lorg/bouncycastle/pqc/crypto/sphincs/Tree;->l_tree(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[BI[BI)V

    iget-wide v3, v1, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    add-long v13, v3, v15

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    const/16 v10, 0x20

    const/16 v3, 0x20

    const/4 v4, 0x0

    const/16 v11, 0x20

    const/4 v12, 0x0

    :goto_3
    if-lez v11, :cond_4

    const/4 v3, 0x0

    const/4 v13, 0x0

    :goto_4
    if-ge v13, v11, :cond_3

    ushr-int/lit8 v3, v11, 0x1

    mul-int/lit8 v3, v3, 0x20

    ushr-int/lit8 v4, v13, 0x1

    mul-int/lit8 v4, v4, 0x20

    add-int v5, v4, v3

    mul-int/lit8 v3, v11, 0x20

    mul-int/lit8 v4, v13, 0x20

    add-int v7, v4, v3

    add-int/lit8 v3, v12, 0x7

    mul-int/lit8 v9, v3, 0x40

    move-object/from16 v3, p0

    move-object v4, v2

    move-object v6, v2

    move-object/from16 v8, p6

    invoke-virtual/range {v3 .. v9}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->hash_2n_n_mask([BI[BI[BI)I

    add-int/lit8 v13, v13, 0x2

    goto :goto_4

    :cond_3
    add-int/lit8 v12, v12, 0x1

    ushr-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    iget-wide v3, v0, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    long-to-int v0, v3

    const/4 v3, 0x0

    move/from16 v4, p7

    :goto_5
    if-ge v3, v4, :cond_5

    ushr-int v5, v10, v3

    mul-int/lit8 v5, v5, 0x20

    ushr-int v6, v0, v3

    xor-int/lit8 v6, v6, 0x1

    mul-int/lit8 v6, v6, 0x20

    add-int/2addr v6, v5

    mul-int/lit8 v5, v3, 0x20

    add-int v5, v5, p3

    move-object/from16 v7, p2

    invoke-static {v2, v6, v7, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    move-object/from16 v3, p1

    invoke-static {v2, v10, v3, v1, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static validate_authpath(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[BI[BI[BI)V
    .locals 12

    const/16 v0, 0x40

    new-array v0, v0, [B

    and-int/lit8 v1, p3, 0x1

    const/16 v8, 0x20

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v8, :cond_0

    add-int/lit8 v2, v1, 0x20

    .line 0
    aget-byte v3, p2, v1

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-ge v1, v8, :cond_3

    add-int v2, p5, v1

    aget-byte v2, p4, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_2
    if-ge v1, v8, :cond_2

    aget-byte v2, p2, v1

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :goto_3
    if-ge v1, v8, :cond_3

    add-int/lit8 v2, v1, 0x20

    add-int v3, p5, v1

    aget-byte v3, p4, v3

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_3
    add-int/lit8 v1, p5, 0x20

    const/4 v2, 0x0

    move v9, v1

    const/4 v10, 0x0

    move v1, p3

    :goto_4
    add-int/lit8 v2, p7, -0x1

    if-ge v10, v2, :cond_6

    ushr-int/lit8 v11, v1, 0x1

    and-int/lit8 v1, v11, 0x1

    if-eqz v1, :cond_4

    add-int/lit8 v1, v10, 0x7

    mul-int/lit8 v7, v1, 0x40

    const/16 v3, 0x20

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v4, v0

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->hash_2n_n_mask([BI[BI[BI)I

    const/4 v1, 0x0

    :goto_5
    if-ge v1, v8, :cond_5

    add-int v2, v9, v1

    aget-byte v2, p4, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_4
    add-int/lit8 v1, v10, 0x7

    mul-int/lit8 v7, v1, 0x40

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, v0

    move-object v4, v0

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->hash_2n_n_mask([BI[BI[BI)I

    const/4 v1, 0x0

    :goto_6
    if-ge v1, v8, :cond_5

    add-int/lit8 v2, v1, 0x20

    add-int v3, v9, v1

    aget-byte v3, p4, v3

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_5
    add-int/lit8 v9, v9, 0x20

    add-int/lit8 v10, v10, 0x1

    move v1, v11

    goto :goto_4

    :cond_6
    add-int/lit8 v1, p7, 0x6

    mul-int/lit8 v7, v1, 0x40

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v4, v0

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->hash_2n_n_mask([BI[BI[BI)I

    return-void
.end method

.method private zerobytes([BII)V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-eq v1, p3, :cond_0

    add-int v2, p2, v1

    .line 0
    aput-byte v0, p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public crypto_sign(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[B)[B
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    const v1, 0xa028

    new-array v11, v1, [B

    const/16 v1, 0x20

    new-array v12, v1, [B

    const/16 v2, 0x40

    new-array v13, v2, [B

    const/16 v2, 0x8

    new-array v2, v2, [J

    new-array v14, v1, [B

    new-array v15, v1, [B

    const/16 v3, 0x400

    new-array v8, v3, [B

    const/16 v3, 0x440

    new-array v7, v3, [B

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_0

    .line 0
    aget-byte v6, p3, v5

    aput-byte v6, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    const/16 v3, 0x420

    const v5, 0xa008

    invoke-static {v7, v3, v11, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->getMessageHash()Lorg/bouncycastle/crypto/Digest;

    move-result-object v3

    invoke-interface {v3}, Lorg/bouncycastle/crypto/Digest;->getDigestSize()I

    move-result v6

    new-array v6, v6, [B

    invoke-interface {v3, v11, v5, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    array-length v1, v10

    invoke-interface {v3, v10, v4, v1}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v3, v6, v4}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    const/16 v1, 0x20

    invoke-direct {v0, v11, v5, v1}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->zerobytes([BII)V

    const/4 v1, 0x0

    :goto_1
    const/16 v3, 0x8

    if-eq v1, v3, :cond_1

    mul-int/lit8 v3, v1, 0x8

    invoke-static {v6, v3}, Lorg/bouncycastle/util/Pack;->littleEndianToLong([BI)J

    move-result-wide v17

    aput-wide v17, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    aget-wide v17, v2, v4

    const-wide v1, 0xfffffffffffffffL

    and-long v19, v17, v1

    const/16 v1, 0x10

    const/16 v2, 0x20

    invoke-static {v6, v1, v12, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const v6, 0x9be8

    invoke-static {v12, v4, v11, v6, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v5, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;

    invoke-direct {v5}, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;-><init>()V

    const/16 v1, 0xb

    iput v1, v5, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->level:I

    const-wide/16 v3, 0x0

    iput-wide v3, v5, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subtree:J

    iput-wide v3, v5, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    const v4, 0x9c08

    const/16 v1, 0x400

    invoke-static {v7, v2, v11, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const v3, 0xa008

    const/16 v16, 0x5

    const/16 v2, 0x440

    move-object/from16 v1, p1

    move-object v2, v11

    const v22, 0x9c08

    move/from16 v4, v16

    move-object/from16 v16, v5

    move-object v5, v7

    move-object/from16 v6, v16

    move-object/from16 v23, v7

    move-object v7, v11

    move-object v0, v8

    move/from16 v8, v22

    invoke-static/range {v1 .. v8}, Lorg/bouncycastle/pqc/crypto/sphincs/Tree;->treehash(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BII[BLorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;[BI)V

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->getMessageHash()Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    const v2, 0x9be8

    const/16 v8, 0x440

    invoke-interface {v1, v11, v2, v8}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    array-length v2, v10

    const/4 v3, 0x0

    invoke-interface {v1, v10, v3, v2}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v1, v13, v3}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    new-instance v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;

    invoke-direct {v10}, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;-><init>()V

    const/16 v7, 0xc

    iput v7, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->level:I

    const-wide/16 v21, 0x1f

    and-long v1, v17, v21

    long-to-int v2, v1

    int-to-long v1, v2

    iput-wide v1, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    const/16 v16, 0x5

    ushr-long v1, v19, v16

    iput-wide v1, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subtree:J

    const/16 v1, 0x20

    const/4 v2, 0x0

    :goto_2
    if-ge v2, v1, :cond_2

    aget-byte v3, v12, v2

    aput-byte v3, v11, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    const/16 v3, 0x400

    move-object/from16 v12, v23

    invoke-static {v12, v1, v0, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v3, 0x8

    :goto_3
    if-ge v2, v3, :cond_3

    add-int/2addr v1, v2

    mul-int/lit8 v4, v2, 0x8

    ushr-long v4, v19, v4

    const-wide/16 v17, 0xff

    and-long v4, v4, v17

    long-to-int v5, v4

    int-to-byte v4, v5

    aput-byte v4, v11, v1

    add-int/lit8 v2, v2, 0x1

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/4 v1, 0x0

    invoke-static {v9, v15, v1, v12, v10}, Lorg/bouncycastle/pqc/crypto/sphincs/Seed;->get_seed(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[BLorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;)V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/sphincs/Horst;

    invoke-direct {v1}, Lorg/bouncycastle/pqc/crypto/sphincs/Horst;-><init>()V

    const/16 v17, 0x28

    const/16 v18, 0x0

    move-object/from16 v1, p1

    move-object v2, v11

    move/from16 v3, v17

    move-object v4, v14

    move-object v5, v15

    move-object v6, v0

    const/16 v19, 0xc

    move-object v7, v13

    invoke-static/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincs/Horst;->horst_sign(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[B[B[B[B)I

    move-result v1

    add-int/lit8 v1, v1, 0x28

    new-instance v13, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;

    invoke-direct {v13}, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;-><init>()V

    const/4 v2, 0x0

    move v7, v1

    const/16 v1, 0xc

    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_4
    if-ge v6, v1, :cond_4

    iput v6, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->level:I

    invoke-static {v9, v15, v2, v12, v10}, Lorg/bouncycastle/pqc/crypto/sphincs/Seed;->get_seed(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[BLorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;)V

    move-object v1, v13

    move-object/from16 v2, p1

    move-object v3, v11

    move v4, v7

    move-object v5, v14

    move/from16 v17, v6

    move-object v6, v15

    move v8, v7

    move-object v7, v0

    invoke-virtual/range {v1 .. v7}, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;->wots_sign(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[B[B[B)V

    add-int/lit16 v4, v8, 0x860

    const/16 v19, 0x5

    move-object/from16 v1, p1

    move-object v2, v14

    move-object v5, v10

    move-object v6, v12

    move-object/from16 v20, v0

    move v0, v8

    move/from16 v8, v19

    invoke-static/range {v1 .. v8}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->compute_authpath_wots(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[BILorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;[B[BI)V

    add-int/lit16 v7, v0, 0x900

    iget-wide v0, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subtree:J

    and-long v2, v0, v21

    long-to-int v3, v2

    int-to-long v2, v3

    iput-wide v2, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subleaf:J

    ushr-long v0, v0, v16

    iput-wide v0, v10, Lorg/bouncycastle/pqc/crypto/sphincs/Tree$leafaddr;->subtree:J

    add-int/lit8 v6, v17, 0x1

    const/4 v2, 0x0

    const/16 v1, 0xc

    move-object/from16 v0, v20

    const/16 v8, 0x440

    goto :goto_4

    :cond_4
    const/4 v0, 0x0

    const/16 v2, 0x440

    move-object/from16 v1, p0

    invoke-direct {v1, v12, v0, v2}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->zerobytes([BII)V

    return-object v11
.end method

.method public generateSignature([B)[B
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->hashFunctions:Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->keyData:[B

    invoke-virtual {p0, v0, p1, v1}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->crypto_sign(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[B)[B

    move-result-object p1

    return-object p1
.end method

.method public init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 0

    if-eqz p1, :cond_1

    .line 0
    instance-of p1, p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    if-eqz p1, :cond_0

    check-cast p2, Lorg/bouncycastle/crypto/params/ParametersWithRandom;

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/ParametersWithRandom;->getParameters()Lorg/bouncycastle/crypto/CipherParameters;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCSPrivateKeyParameters;

    invoke-virtual {p1}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCSPrivateKeyParameters;->getKeyData()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->keyData:[B

    return-void

    :cond_0
    check-cast p2, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCSPrivateKeyParameters;

    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCSPrivateKeyParameters;->getKeyData()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->keyData:[B

    return-void

    :cond_1
    check-cast p2, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCSPublicKeyParameters;

    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCSPublicKeyParameters;->getKeyData()[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->keyData:[B

    return-void
.end method

.method public verify(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[B[B)Z
    .locals 21

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    .line 0
    array-length v2, v1

    const/16 v3, 0x860

    new-array v3, v3, [B

    const/16 v11, 0x20

    new-array v15, v11, [B

    new-array v14, v11, [B

    const v4, 0xa028

    new-array v13, v4, [B

    const/16 v5, 0x420

    new-array v12, v5, [B

    if-ne v2, v4, :cond_6

    const/16 v2, 0x40

    new-array v9, v2, [B

    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v6, v5, :cond_0

    aget-byte v7, p4, v6

    aput-byte v7, v12, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_0
    new-array v6, v11, [B

    const/4 v7, 0x0

    :goto_1
    if-ge v7, v11, :cond_1

    aget-byte v8, v1, v7

    aput-byte v8, v6, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    invoke-static {v1, v2, v13, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-virtual/range {p1 .. p1}, Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;->getMessageHash()Lorg/bouncycastle/crypto/Digest;

    move-result-object v1

    invoke-interface {v1, v6, v2, v11}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v1, v12, v2, v5}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    array-length v4, v0

    invoke-interface {v1, v0, v2, v4}, Lorg/bouncycastle/crypto/Digest;->update([BII)V

    invoke-interface {v1, v9, v2}, Lorg/bouncycastle/crypto/Digest;->doFinal([BI)I

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_2
    const/16 v4, 0x8

    if-ge v2, v4, :cond_2

    add-int v4, v11, v2

    aget-byte v4, v13, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    mul-int/lit8 v6, v2, 0x8

    shl-long/2addr v4, v6

    xor-long/2addr v0, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_2
    new-instance v2, Lorg/bouncycastle/pqc/crypto/sphincs/Horst;

    invoke-direct {v2}, Lorg/bouncycastle/pqc/crypto/sphincs/Horst;-><init>()V

    const/16 v7, 0x28

    move-object/from16 v4, p1

    move-object v5, v14

    move-object v6, v13

    move-object v8, v12

    invoke-static/range {v4 .. v9}, Lorg/bouncycastle/pqc/crypto/sphincs/Horst;->horst_verify(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[BI[B[B)I

    new-instance v2, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;

    invoke-direct {v2}, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;-><init>()V

    const/4 v4, 0x0

    const/16 v5, 0x3428

    const/16 v9, 0x3428

    const/4 v10, 0x0

    :goto_3
    const/16 v4, 0xc

    if-ge v10, v4, :cond_3

    move-object v4, v2

    move-object/from16 v5, p1

    move-object v6, v3

    move-object v7, v13

    move v8, v9

    move v11, v9

    move-object v9, v14

    move/from16 v20, v10

    move-object v10, v12

    invoke-virtual/range {v4 .. v10}, Lorg/bouncycastle/pqc/crypto/sphincs/Wots;->wots_verify(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[BI[B[B)V

    add-int/lit16 v10, v11, 0x860

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/4 v6, 0x0

    move-object/from16 v4, p1

    move-object v5, v15

    move-object v7, v3

    move-object v9, v12

    move/from16 v17, v10

    move/from16 v10, v16

    invoke-static/range {v4 .. v10}, Lorg/bouncycastle/pqc/crypto/sphincs/Tree;->l_tree(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[BI[BI[BI)V

    const-wide/16 v4, 0x1f

    and-long/2addr v4, v0

    long-to-int v5, v4

    const/16 v19, 0x5

    move-object v4, v12

    move-object/from16 v12, p1

    move-object v6, v13

    move-object v13, v14

    move-object v7, v14

    move-object v14, v15

    move-object v8, v15

    move v15, v5

    move-object/from16 v16, v6

    move-object/from16 v18, v4

    invoke-static/range {v12 .. v19}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->validate_authpath(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[BI[BI[BI)V

    const/4 v5, 0x5

    shr-long/2addr v0, v5

    add-int/lit16 v9, v11, 0x900

    add-int/lit8 v10, v20, 0x1

    move-object v12, v4

    move-object v13, v6

    move-object v14, v7

    move-object v15, v8

    const/16 v11, 0x20

    goto :goto_3

    :cond_3
    move-object v4, v12

    move-object v7, v14

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/16 v2, 0x20

    :goto_4
    if-ge v0, v2, :cond_5

    aget-byte v3, v7, v0

    add-int/lit16 v5, v0, 0x400

    aget-byte v5, v4, v5

    if-ne v3, v5, :cond_4

    const/4 v3, 0x1

    goto :goto_5

    :cond_4
    const/4 v3, 0x0

    :goto_5
    and-int/2addr v1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    :cond_5
    return v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "signature wrong size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public verifySignature([B[B)Z
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->hashFunctions:Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;

    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->keyData:[B

    invoke-virtual {p0, v0, p1, p2, v1}, Lorg/bouncycastle/pqc/crypto/sphincs/SPHINCS256Signer;->verify(Lorg/bouncycastle/pqc/crypto/sphincs/HashFunctions;[B[B[B)Z

    move-result p1

    return p1
.end method
