.class public final Lorg/bouncycastle/crypto/engines/ThreefishEngine$Threefish512Cipher;
.super Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;


# static fields
.field public static final ROTATION_0_0:I = 0x2e

.field public static final ROTATION_0_1:I = 0x24

.field public static final ROTATION_0_2:I = 0x13

.field public static final ROTATION_0_3:I = 0x25

.field public static final ROTATION_1_0:I = 0x21

.field public static final ROTATION_1_1:I = 0x1b

.field public static final ROTATION_1_2:I = 0xe

.field public static final ROTATION_1_3:I = 0x2a

.field public static final ROTATION_2_0:I = 0x11

.field public static final ROTATION_2_1:I = 0x31

.field public static final ROTATION_2_2:I = 0x24

.field public static final ROTATION_2_3:I = 0x27

.field public static final ROTATION_3_0:I = 0x2c

.field public static final ROTATION_3_1:I = 0x9

.field public static final ROTATION_3_2:I = 0x36

.field public static final ROTATION_3_3:I = 0x38

.field public static final ROTATION_4_0:I = 0x27

.field public static final ROTATION_4_1:I = 0x1e

.field public static final ROTATION_4_2:I = 0x22

.field public static final ROTATION_4_3:I = 0x18

.field public static final ROTATION_5_0:I = 0xd

.field public static final ROTATION_5_1:I = 0x32

.field public static final ROTATION_5_2:I = 0xa

.field public static final ROTATION_5_3:I = 0x11

.field public static final ROTATION_6_0:I = 0x19

.field public static final ROTATION_6_1:I = 0x1d

.field public static final ROTATION_6_2:I = 0x27

.field public static final ROTATION_6_3:I = 0x2b

.field public static final ROTATION_7_0:I = 0x8

.field public static final ROTATION_7_1:I = 0x23

.field public static final ROTATION_7_2:I = 0x38

.field public static final ROTATION_7_3:I = 0x16


# direct methods
.method public constructor <init>([J[J)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;-><init>([J[J)V

    return-void
.end method


# virtual methods
.method public decryptBlock([J[J)V
    .locals 44

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->kw:[J

    iget-object v2, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->t:[J

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$200()[I

    move-result-object v3

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$100()[I

    move-result-object v4

    array-length v5, v1

    const/16 v6, 0x11

    if-ne v5, v6, :cond_2

    array-length v5, v2

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    aget-wide v7, p1, v5

    const/4 v5, 0x1

    aget-wide v9, p1, v5

    const/4 v11, 0x2

    aget-wide v11, p1, v11

    const/4 v13, 0x3

    aget-wide v14, p1, v13

    const/16 v16, 0x4

    aget-wide v17, p1, v16

    aget-wide v19, p1, v6

    const/4 v6, 0x6

    aget-wide v21, p1, v6

    const/16 v23, 0x7

    aget-wide v24, p1, v23

    const/16 v26, 0x11

    const/16 v27, 0x0

    const/16 v6, 0x11

    :goto_0
    if-lt v6, v5, :cond_0

    aget v5, v3, v6

    aget v28, v4, v6

    add-int/lit8 v29, v5, 0x1

    aget-wide v30, v1, v29

    sub-long v7, v7, v30

    add-int/lit8 v30, v5, 0x2

    aget-wide v31, v1, v30

    sub-long v9, v9, v31

    add-int/lit8 v31, v5, 0x3

    aget-wide v32, v1, v31

    sub-long v11, v11, v32

    add-int/lit8 v32, v5, 0x4

    aget-wide v33, v1, v32

    sub-long v14, v14, v33

    add-int/lit8 v33, v5, 0x5

    aget-wide v34, v1, v33

    move-wide/from16 v36, v14

    sub-long v13, v17, v34

    add-int/lit8 v15, v5, 0x6

    aget-wide v17, v1, v15

    add-int/lit8 v34, v28, 0x1

    aget-wide v38, v2, v34

    add-long v17, v17, v38

    move-object/from16 v35, v3

    move-object/from16 v38, v4

    sub-long v3, v19, v17

    add-int/lit8 v17, v5, 0x7

    aget-wide v18, v1, v17

    add-int/lit8 v20, v28, 0x2

    aget-wide v39, v2, v20

    add-long v18, v18, v39

    move-wide/from16 v39, v13

    sub-long v13, v21, v18

    add-int/lit8 v18, v5, 0x8

    aget-wide v18, v1, v18

    move-object/from16 v41, v1

    int-to-long v0, v6

    add-long v18, v18, v0

    const-wide/16 v20, 0x1

    add-long v18, v18, v20

    move-wide/from16 v20, v0

    sub-long v0, v24, v18

    move/from16 p1, v6

    const/16 v6, 0x8

    invoke-static {v9, v10, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v9

    sub-long/2addr v13, v9

    const/16 v6, 0x23

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v7, v0

    const/16 v6, 0x38

    invoke-static {v3, v4, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v11, v3

    const/16 v6, 0x16

    move-wide/from16 v18, v0

    move-wide/from16 v24, v11

    move-wide/from16 v0, v36

    move-wide/from16 v11, v39

    invoke-static {v0, v1, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v11, v0

    const/16 v6, 0x19

    invoke-static {v9, v10, v6, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v9

    sub-long/2addr v11, v9

    const/16 v6, 0x1d

    invoke-static {v0, v1, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v13, v0

    const/16 v6, 0x27

    invoke-static {v3, v4, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v7, v3

    const/16 v6, 0x2b

    move-wide/from16 v36, v0

    move-wide/from16 v0, v18

    move-wide/from16 v18, v7

    move-wide/from16 v7, v24

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long v6, v7, v0

    const/16 v8, 0xd

    invoke-static {v9, v10, v8, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v6, v8

    const/16 v10, 0x32

    invoke-static {v0, v1, v10, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v11, v0

    const/16 v10, 0xa

    invoke-static {v3, v4, v10, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v13, v3

    const/16 v10, 0x11

    move-wide/from16 v24, v0

    move-wide/from16 v0, v36

    move-wide/from16 v42, v13

    move-wide/from16 v13, v18

    move-wide/from16 v18, v42

    invoke-static {v0, v1, v10, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v13, v0

    const/16 v10, 0x27

    invoke-static {v8, v9, v10, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v13, v8

    const/16 v10, 0x1e

    invoke-static {v0, v1, v10, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v6, v0

    const/16 v10, 0x22

    invoke-static {v3, v4, v10, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v11, v3

    const/16 v10, 0x18

    move-wide/from16 v36, v3

    move-wide/from16 v3, v24

    move-wide/from16 v42, v11

    move-wide/from16 v11, v18

    move-wide/from16 v18, v42

    invoke-static {v3, v4, v10, v11, v12}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long v10, v11, v3

    aget-wide v24, v41, v5

    sub-long v13, v13, v24

    aget-wide v24, v41, v29

    sub-long v8, v8, v24

    aget-wide v24, v41, v30

    sub-long v6, v6, v24

    aget-wide v24, v41, v31

    sub-long v0, v0, v24

    aget-wide v24, v41, v32

    move-wide/from16 v29, v0

    sub-long v0, v18, v24

    aget-wide v18, v41, v33

    aget-wide v24, v2, v28

    add-long v18, v18, v24

    move-wide/from16 v24, v0

    sub-long v0, v36, v18

    aget-wide v18, v41, v15

    aget-wide v31, v2, v34

    add-long v18, v18, v31

    sub-long v10, v10, v18

    aget-wide v17, v41, v17

    add-long v17, v17, v20

    sub-long v3, v3, v17

    const/16 v5, 0x2c

    invoke-static {v8, v9, v5, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v8

    sub-long/2addr v10, v8

    const/16 v5, 0x9

    invoke-static {v3, v4, v5, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v3

    sub-long/2addr v13, v3

    const/16 v5, 0x36

    invoke-static {v0, v1, v5, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v6, v0

    const/16 v5, 0x38

    move-object/from16 v28, v2

    move-wide/from16 v17, v3

    move-wide/from16 v19, v6

    move-wide/from16 v6, v24

    move-wide/from16 v2, v29

    invoke-static {v2, v3, v5, v6, v7}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long v4, v6, v2

    const/16 v6, 0x11

    invoke-static {v8, v9, v6, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v6

    sub-long/2addr v4, v6

    const/16 v8, 0x31

    invoke-static {v2, v3, v8, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v10, v2

    const/16 v8, 0x24

    invoke-static {v0, v1, v8, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v13, v0

    const/16 v9, 0x27

    move-wide/from16 v21, v2

    move-wide/from16 v2, v17

    move-wide/from16 v17, v13

    move-wide/from16 v12, v19

    invoke-static {v2, v3, v9, v12, v13}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v12, v2

    const/16 v9, 0x21

    invoke-static {v6, v7, v9, v12, v13}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v6

    sub-long/2addr v12, v6

    const/16 v9, 0x1b

    invoke-static {v2, v3, v9, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v2

    sub-long/2addr v4, v2

    const/16 v9, 0xe

    invoke-static {v0, v1, v9, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v0

    sub-long/2addr v10, v0

    const/16 v9, 0x2a

    move-wide/from16 v14, v21

    move-wide/from16 v42, v2

    move-wide/from16 v2, v17

    move-wide/from16 v17, v42

    invoke-static {v14, v15, v9, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v14

    sub-long/2addr v2, v14

    const/16 v9, 0x2e

    invoke-static {v6, v7, v9, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v6

    sub-long/2addr v2, v6

    invoke-static {v14, v15, v8, v12, v13}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v14

    sub-long v8, v12, v14

    const/16 v12, 0x13

    invoke-static {v0, v1, v12, v4, v5}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v19

    sub-long v0, v4, v19

    const/16 v4, 0x25

    move-wide/from16 v12, v17

    invoke-static {v12, v13, v4, v10, v11}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->xorRotr(JIJ)J

    move-result-wide v24

    sub-long v21, v10, v24

    add-int/lit8 v4, p1, -0x2

    const/4 v5, 0x1

    move-wide/from16 v17, v0

    move-wide v11, v8

    move-object/from16 v1, v41

    const/4 v13, 0x3

    move-object/from16 v0, p0

    move-wide v9, v6

    move-wide v7, v2

    move v6, v4

    move-object/from16 v2, v28

    move-object/from16 v3, v35

    move-object/from16 v4, v38

    goto/16 :goto_0

    :cond_0
    move-object/from16 v41, v1

    move-object/from16 v28, v2

    const/4 v0, 0x1

    const/4 v1, 0x5

    const/4 v2, 0x2

    aget-wide v3, v41, v27

    sub-long/2addr v7, v3

    aget-wide v3, v41, v0

    sub-long/2addr v9, v3

    aget-wide v3, v41, v2

    sub-long/2addr v11, v3

    const/4 v3, 0x3

    aget-wide v4, v41, v3

    sub-long/2addr v14, v4

    aget-wide v3, v41, v16

    sub-long v17, v17, v3

    aget-wide v3, v41, v1

    aget-wide v5, v28, v27

    add-long/2addr v3, v5

    sub-long v19, v19, v3

    const/4 v3, 0x6

    aget-wide v4, v41, v3

    aget-wide v29, v28, v0

    add-long v4, v4, v29

    sub-long v21, v21, v4

    aget-wide v3, v41, v23

    sub-long v24, v24, v3

    aput-wide v7, p2, v27

    aput-wide v9, p2, v0

    aput-wide v11, p2, v2

    const/4 v0, 0x3

    aput-wide v14, p2, v0

    aput-wide v17, p2, v16

    aput-wide v19, p2, v1

    const/4 v0, 0x6

    aput-wide v21, p2, v0

    aput-wide v24, p2, v23

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
    .locals 44

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->kw:[J

    iget-object v2, v0, Lorg/bouncycastle/crypto/engines/ThreefishEngine$ThreefishCipher;->t:[J

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$200()[I

    move-result-object v3

    invoke-static {}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->access$100()[I

    move-result-object v4

    array-length v5, v1

    const/16 v6, 0x11

    if-ne v5, v6, :cond_2

    array-length v5, v2

    const/4 v6, 0x5

    if-ne v5, v6, :cond_1

    const/4 v5, 0x0

    aget-wide v7, p1, v5

    const/4 v9, 0x1

    aget-wide v10, p1, v9

    const/4 v12, 0x2

    aget-wide v13, p1, v12

    const/4 v15, 0x3

    aget-wide v16, p1, v15

    const/16 v18, 0x4

    aget-wide v19, p1, v18

    aget-wide v21, p1, v6

    const/16 v23, 0x6

    aget-wide v24, p1, v23

    const/16 v26, 0x7

    aget-wide v27, p1, v26

    aget-wide v29, v1, v5

    add-long v7, v7, v29

    aget-wide v29, v1, v9

    add-long v10, v10, v29

    aget-wide v29, v1, v12

    add-long v13, v13, v29

    aget-wide v29, v1, v15

    add-long v16, v16, v29

    aget-wide v29, v1, v18

    add-long v19, v19, v29

    aget-wide v29, v1, v6

    aget-wide v5, v2, v5

    add-long v29, v29, v5

    add-long v29, v29, v21

    aget-wide v5, v1, v23

    aget-wide v21, v2, v9

    add-long v5, v5, v21

    add-long v5, v5, v24

    aget-wide v21, v1, v26

    add-long v27, v27, v21

    const/4 v12, 0x1

    const/16 v21, 0x5

    const/16 v22, 0x0

    const/16 v24, 0x1

    move-wide/from16 v31, v16

    move-wide/from16 v33, v27

    move-wide/from16 v35, v29

    :goto_0
    const/16 v15, 0x12

    if-ge v12, v15, :cond_0

    aget v15, v3, v12

    aget v17, v4, v12

    add-long/2addr v7, v10

    const/16 v9, 0x2e

    invoke-static {v10, v11, v9, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    move-object/from16 v25, v3

    move-object/from16 v27, v4

    move-wide/from16 v3, v31

    add-long/2addr v13, v3

    const/16 v11, 0x24

    invoke-static {v3, v4, v11, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v3

    move-object/from16 v29, v1

    move/from16 v28, v12

    move-wide/from16 v11, v35

    add-long v0, v19, v11

    move-object/from16 v30, v2

    const/16 v2, 0x13

    invoke-static {v11, v12, v2, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    move-wide/from16 v31, v3

    move-wide/from16 v2, v33

    add-long/2addr v5, v2

    const/16 v4, 0x25

    invoke-static {v2, v3, v4, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v13, v9

    const/16 v4, 0x21

    invoke-static {v9, v10, v4, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v0, v2

    const/16 v4, 0x1b

    invoke-static {v2, v3, v4, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v5, v11

    const/16 v4, 0xe

    invoke-static {v11, v12, v4, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long v7, v7, v31

    const/16 v4, 0x2a

    move-wide/from16 v19, v2

    move-wide/from16 v2, v31

    invoke-static {v2, v3, v4, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v0, v9

    const/16 v4, 0x11

    invoke-static {v9, v10, v4, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v5, v2

    const/16 v4, 0x31

    invoke-static {v2, v3, v4, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v7, v11

    const/16 v4, 0x24

    invoke-static {v11, v12, v4, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long v13, v13, v19

    const/16 v4, 0x27

    move-wide/from16 v31, v0

    move-wide/from16 v0, v19

    invoke-static {v0, v1, v4, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v5, v9

    const/16 v4, 0x2c

    invoke-static {v9, v10, v4, v5, v6}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v7, v0

    const/16 v4, 0x9

    invoke-static {v0, v1, v4, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v13, v11

    const/16 v4, 0x36

    invoke-static {v11, v12, v4, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    move-wide/from16 v19, v0

    add-long v0, v31, v2

    const/16 v4, 0x38

    invoke-static {v2, v3, v4, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    aget-wide v31, v29, v15

    add-long v7, v7, v31

    add-int/lit8 v4, v15, 0x1

    aget-wide v31, v29, v4

    add-long v9, v9, v31

    add-int/lit8 v31, v15, 0x2

    aget-wide v32, v29, v31

    add-long v13, v13, v32

    add-int/lit8 v32, v15, 0x3

    aget-wide v33, v29, v32

    add-long v2, v2, v33

    add-int/lit8 v33, v15, 0x4

    aget-wide v34, v29, v33

    add-long v0, v0, v34

    add-int/lit8 v34, v15, 0x5

    aget-wide v35, v29, v34

    aget-wide v37, v30, v17

    add-long v35, v35, v37

    add-long v11, v35, v11

    add-int/lit8 v35, v15, 0x6

    aget-wide v36, v29, v35

    add-int/lit8 v38, v17, 0x1

    aget-wide v39, v30, v38

    add-long v36, v36, v39

    add-long v36, v36, v5

    add-int/lit8 v5, v15, 0x7

    aget-wide v39, v29, v5

    move/from16 v41, v5

    move/from16 v6, v28

    move/from16 v28, v4

    int-to-long v4, v6

    add-long v39, v39, v4

    move-wide/from16 v42, v4

    add-long v4, v39, v19

    add-long/2addr v7, v9

    move/from16 v19, v6

    const/16 v6, 0x27

    invoke-static {v9, v10, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v13, v2

    const/16 v6, 0x1e

    invoke-static {v2, v3, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v2

    add-long/2addr v0, v11

    const/16 v6, 0x22

    invoke-static {v11, v12, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    move-wide/from16 v39, v2

    add-long v2, v36, v4

    const/16 v6, 0x18

    invoke-static {v4, v5, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    add-long/2addr v13, v9

    const/16 v6, 0xd

    invoke-static {v9, v10, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v0, v4

    const/16 v6, 0x32

    invoke-static {v4, v5, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    add-long/2addr v2, v11

    const/16 v6, 0xa

    invoke-static {v11, v12, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long v7, v7, v39

    const/16 v6, 0x11

    move-wide/from16 v36, v4

    move-wide/from16 v4, v39

    invoke-static {v4, v5, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    add-long/2addr v0, v9

    const/16 v6, 0x19

    invoke-static {v9, v10, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v2, v4

    const/16 v6, 0x1d

    invoke-static {v4, v5, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    add-long/2addr v7, v11

    const/16 v6, 0x27

    invoke-static {v11, v12, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    add-long v13, v13, v36

    const/16 v6, 0x2b

    move-wide/from16 v39, v0

    move-wide/from16 v0, v36

    invoke-static {v0, v1, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v2, v9

    const/16 v6, 0x8

    invoke-static {v9, v10, v6, v2, v3}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v9

    add-long/2addr v7, v0

    const/16 v6, 0x23

    invoke-static {v0, v1, v6, v7, v8}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v0

    add-long/2addr v13, v11

    const/16 v6, 0x38

    invoke-static {v11, v12, v6, v13, v14}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v11

    move-wide/from16 v36, v0

    add-long v0, v39, v4

    const/16 v6, 0x16

    invoke-static {v4, v5, v6, v0, v1}, Lorg/bouncycastle/crypto/engines/ThreefishEngine;->rotlXor(JIJ)J

    move-result-wide v4

    aget-wide v39, v29, v28

    add-long v7, v7, v39

    aget-wide v39, v29, v31

    add-long v9, v9, v39

    aget-wide v31, v29, v32

    add-long v13, v13, v31

    aget-wide v31, v29, v33

    add-long v31, v4, v31

    aget-wide v4, v29, v34

    add-long/2addr v0, v4

    aget-wide v4, v29, v35

    aget-wide v33, v30, v38

    add-long v4, v4, v33

    add-long/2addr v4, v11

    aget-wide v11, v29, v41

    add-int/lit8 v17, v17, 0x2

    aget-wide v33, v30, v17

    add-long v11, v11, v33

    add-long/2addr v2, v11

    add-int/lit8 v15, v15, 0x8

    aget-wide v11, v29, v15

    add-long v11, v11, v42

    const-wide/16 v33, 0x1

    add-long v11, v11, v33

    add-long v33, v11, v36

    add-int/lit8 v12, v19, 0x2

    move-wide/from16 v19, v0

    move-wide/from16 v35, v4

    move-wide v10, v9

    move-object/from16 v4, v27

    move-object/from16 v1, v29

    move-object/from16 v0, p0

    move-wide v5, v2

    move-object/from16 v3, v25

    move-object/from16 v2, v30

    goto/16 :goto_0

    :cond_0
    move-wide v9, v10

    move-wide/from16 v2, v33

    move-wide/from16 v11, v35

    aput-wide v7, p2, v22

    aput-wide v9, p2, v24

    const/4 v0, 0x2

    aput-wide v13, p2, v0

    const/4 v0, 0x3

    aput-wide v31, p2, v0

    aput-wide v19, p2, v18

    aput-wide v11, p2, v21

    aput-wide v5, p2, v23

    aput-wide v2, p2, v26

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
