.class public final Lorg/bouncycastle/crypto/engines/ThreefishEngine$Threefish256Cipher;
.super Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;


# static fields
.field public static final ROTATION_0_0:I = 0xe

.field public static final ROTATION_0_1:I = 0x10

.field public static final ROTATION_1_0:I = 0x34

.field public static final ROTATION_1_1:I = 0x39

.field public static final ROTATION_2_0:I = 0x17

.field public static final ROTATION_2_1:I = 0x28

.field public static final ROTATION_3_0:I = 0x5

.field public static final ROTATION_3_1:I = 0x25

.field public static final ROTATION_4_0:I = 0x19

.field public static final ROTATION_4_1:I = 0x21

.field public static final ROTATION_5_0:I = 0x2e

.field public static final ROTATION_5_1:I = 0xc

.field public static final ROTATION_6_0:I = 0x3a

.field public static final ROTATION_6_1:I = 0x16

.field public static final ROTATION_7_0:I = 0x20

.field public static final ROTATION_7_1:I = 0x20


# direct methods
.method public constructor <init>([J[J)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;-><init>([J[J)V

    return-void
.end method


# virtual methods
.method public decryptBlock([J[J)V
    .locals 31

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->kw:[J

    iget-object v2, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->t:[J

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$000()[I

    move-result-object v3

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$100()[I

    move-result-object v4

    array-length v5, v1

    const/16 v6, 0x9

    if-ne v5, v6, :cond_2

    array-length v5, v2

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    aget-wide v5, p1, v5

    const/4 v7, 0x1

    aget-wide v8, p1, v7

    const/4 v10, 0x2

    aget-wide v10, p1, v10

    const/4 v12, 0x3

    aget-wide v13, p1, v12

    const/16 v15, 0x11

    const/16 v16, 0x0

    :goto_0
    if-lt v15, v7, :cond_0

    aget v7, v3, v15

    aget v17, v4, v15

    add-int/lit8 v18, v7, 0x1

    aget-wide v19, v1, v18

    sub-long v5, v5, v19

    add-int/lit8 v19, v7, 0x2

    aget-wide v20, v1, v19

    add-int/lit8 v22, v17, 0x1

    aget-wide v23, v2, v22

    add-long v20, v20, v23

    sub-long v8, v8, v20

    add-int/lit8 v20, v7, 0x3

    aget-wide v23, v1, v20

    add-int/lit8 v21, v17, 0x2

    aget-wide v25, v2, v21

    add-long v23, v23, v25

    sub-long v10, v10, v23

    add-int/lit8 v21, v7, 0x4

    aget-wide v23, v1, v21

    move-wide/from16 v25, v13

    int-to-long v12, v15

    add-long v23, v23, v12

    const-wide/16 v27, 0x1

    add-long v23, v23, v27

    move-object v14, v3

    move-object/from16 v27, v4

    sub-long v3, v25, v23

    const/16 v0, 0x20

    invoke-static {v3, v4, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v5, v3

    invoke-static {v8, v9, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v10, v8

    const/16 v0, 0x3a

    invoke-static {v8, v9, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v5, v8

    const/16 v0, 0x16

    invoke-static {v3, v4, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v10, v3

    const/16 v0, 0x2e

    invoke-static {v3, v4, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v5, v3

    const/16 v0, 0xc

    invoke-static {v8, v9, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v10, v8

    const/16 v0, 0x19

    invoke-static {v8, v9, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v5, v8

    const/16 v0, 0x21

    invoke-static {v3, v4, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v10, v3

    aget-wide v23, v1, v7

    sub-long v5, v5, v23

    aget-wide v23, v1, v18

    aget-wide v17, v2, v17

    add-long v23, v23, v17

    sub-long v8, v8, v23

    aget-wide v17, v1, v19

    aget-wide v22, v2, v22

    add-long v17, v17, v22

    sub-long v10, v10, v17

    aget-wide v17, v1, v20

    add-long v17, v17, v12

    sub-long v3, v3, v17

    const/4 v0, 0x5

    invoke-static {v3, v4, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v5, v3

    const/16 v0, 0x25

    invoke-static {v8, v9, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v7

    sub-long/2addr v10, v7

    const/16 v0, 0x17

    invoke-static {v7, v8, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v7

    sub-long/2addr v5, v7

    const/16 v0, 0x28

    invoke-static {v3, v4, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v10, v3

    const/16 v0, 0x34

    invoke-static {v3, v4, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v5, v3

    const/16 v0, 0x39

    invoke-static {v7, v8, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v7

    sub-long/2addr v10, v7

    const/16 v0, 0xe

    invoke-static {v7, v8, v0, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v5, v8

    const/16 v0, 0x10

    invoke-static {v3, v4, v0, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v10, v3

    add-int/lit8 v15, v15, -0x2

    const/4 v7, 0x1

    move-object/from16 v0, p0

    const/4 v12, 0x3

    move-wide/from16 v29, v3

    move-object v3, v14

    move-wide/from16 v13, v29

    move-object/from16 v4, v27

    goto/16 :goto_0

    :cond_0
    move-wide/from16 v25, v13

    const/4 v0, 0x1

    const/4 v3, 0x2

    aget-wide v12, v1, v16

    sub-long/2addr v5, v12

    aget-wide v12, v1, v0

    aget-wide v14, v2, v16

    add-long/2addr v12, v14

    sub-long/2addr v8, v12

    aget-wide v12, v1, v3

    aget-wide v14, v2, v0

    add-long/2addr v12, v14

    sub-long/2addr v10, v12

    const/4 v2, 0x3

    aget-wide v12, v1, v2

    sub-long v13, v25, v12

    aput-wide v5, p2, v16

    aput-wide v8, p2, v0

    aput-wide v10, p2, v3

    aput-wide v13, p2, v2

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0
.end method

.method public encryptBlock([J[J)V
    .locals 27

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->kw:[J

    iget-object v2, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->t:[J

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$000()[I

    move-result-object v3

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$100()[I

    move-result-object v4

    array-length v5, v1

    const/16 v6, 0x9

    if-ne v5, v6, :cond_2

    array-length v5, v2

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    aget-wide v6, p1, v5

    const/4 v8, 0x1

    aget-wide v9, p1, v8

    const/4 v11, 0x2

    aget-wide v12, p1, v11

    const/4 v14, 0x3

    aget-wide v15, p1, v14

    aget-wide v17, v1, v5

    add-long v6, v6, v17

    aget-wide v17, v1, v8

    aget-wide v19, v2, v5

    add-long v17, v17, v19

    add-long v17, v17, v9

    aget-wide v9, v1, v11

    aget-wide v19, v2, v8

    add-long v9, v9, v19

    add-long/2addr v9, v12

    aget-wide v11, v1, v14

    add-long/2addr v15, v11

    move-wide v12, v15

    move-wide/from16 v14, v17

    :goto_0
    const/16 v5, 0x12

    if-ge v8, v5, :cond_0

    aget v5, v3, v8

    aget v17, v4, v8

    add-long/2addr v6, v14

    const/16 v11, 0xe

    invoke-static {v14, v15, v11, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v14

    add-long/2addr v9, v12

    const/16 v11, 0x10

    invoke-static {v12, v13, v11, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long/2addr v6, v11

    const/16 v13, 0x34

    invoke-static {v11, v12, v13, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long/2addr v9, v14

    const/16 v13, 0x39

    invoke-static {v14, v15, v13, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    add-long/2addr v6, v13

    const/16 v15, 0x17

    invoke-static {v13, v14, v15, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    add-long/2addr v9, v11

    const/16 v15, 0x28

    invoke-static {v11, v12, v15, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long/2addr v6, v11

    const/4 v15, 0x5

    invoke-static {v11, v12, v15, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long/2addr v9, v13

    const/16 v15, 0x25

    invoke-static {v13, v14, v15, v9, v10}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v13

    aget-wide v19, v1, v5

    add-long v6, v6, v19

    add-int/lit8 v15, v5, 0x1

    aget-wide v19, v1, v15

    aget-wide v21, v2, v17

    add-long v19, v19, v21

    add-long v13, v19, v13

    add-int/lit8 v19, v5, 0x2

    aget-wide v20, v1, v19

    add-int/lit8 v22, v17, 0x1

    aget-wide v23, v2, v22

    add-long v20, v20, v23

    add-long v20, v20, v9

    add-int/lit8 v9, v5, 0x3

    aget-wide v23, v1, v9

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    int-to-long v3, v8

    add-long v23, v23, v3

    add-long v10, v23, v11

    add-long/2addr v6, v13

    const/16 v12, 0x19

    invoke-static {v13, v14, v12, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v12

    move-wide/from16 v23, v3

    add-long v3, v20, v10

    const/16 v14, 0x21

    invoke-static {v10, v11, v14, v3, v4}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v10

    add-long/2addr v6, v10

    const/16 v14, 0x2e

    invoke-static {v10, v11, v14, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v10

    add-long/2addr v3, v12

    const/16 v14, 0xc

    invoke-static {v12, v13, v14, v3, v4}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v12

    add-long/2addr v6, v12

    const/16 v14, 0x3a

    invoke-static {v12, v13, v14, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v12

    add-long/2addr v3, v10

    const/16 v14, 0x16

    invoke-static {v10, v11, v14, v3, v4}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v10

    add-long/2addr v6, v10

    const/16 v14, 0x20

    invoke-static {v10, v11, v14, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v10

    add-long/2addr v3, v12

    invoke-static {v12, v13, v14, v3, v4}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v12

    aget-wide v14, v1, v15

    add-long/2addr v6, v14

    aget-wide v14, v1, v19

    aget-wide v19, v2, v22

    add-long v14, v14, v19

    add-long/2addr v14, v12

    aget-wide v12, v1, v9

    add-int/lit8 v17, v17, 0x2

    aget-wide v19, v2, v17

    add-long v12, v12, v19

    add-long/2addr v3, v12

    add-int/lit8 v5, v5, 0x4

    aget-wide v12, v1, v5

    add-long v12, v12, v23

    const-wide/16 v19, 0x1

    add-long v12, v12, v19

    add-long/2addr v12, v10

    add-int/lit8 v8, v8, 0x2

    move-wide v9, v3

    move-object/from16 v3, v25

    move-object/from16 v4, v26

    goto/16 :goto_0

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x0

    aput-wide v6, p2, v2

    const/4 v2, 0x1

    aput-wide v14, p2, v2

    aput-wide v9, p2, v1

    const/4 v1, 0x3

    aput-wide v12, p2, v1

    return-void

    :cond_1
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1

    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v1
.end method
