.class public Lorg/bouncycastle/crypto/modes/kgcm/KGCMUtil_512;
.super Ljava/lang/Object;


# static fields
.field public static final SIZE:I = 0x8


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static add([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x1

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x4

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x5

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x6

    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    aput-wide v1, p2, v0

    const/4 v0, 0x7

    aget-wide v1, p0, v0

    aget-wide p0, p1, v0

    xor-long/2addr p0, v1

    aput-wide p0, p2, v0

    return-void
.end method

.method public static copy([J[J)V
    .locals 3

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x1

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x4

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x5

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x6

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    const/4 v0, 0x7

    aget-wide v1, p0, v0

    aput-wide v1, p1, v0

    return-void
.end method

.method public static equal([J[J)Z
    .locals 9

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    aget-wide v3, p1, v0

    xor-long/2addr v1, v3

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    aget-wide v6, p1, v3

    xor-long/2addr v4, v6

    or-long/2addr v1, v4

    const/4 v4, 0x2

    aget-wide v5, p0, v4

    aget-wide v7, p1, v4

    xor-long v4, v5, v7

    or-long/2addr v1, v4

    const/4 v4, 0x3

    aget-wide v5, p0, v4

    aget-wide v7, p1, v4

    xor-long v4, v5, v7

    or-long/2addr v1, v4

    const/4 v4, 0x4

    aget-wide v5, p0, v4

    aget-wide v7, p1, v4

    xor-long v4, v5, v7

    or-long/2addr v1, v4

    const/4 v4, 0x5

    aget-wide v5, p0, v4

    aget-wide v7, p1, v4

    xor-long v4, v5, v7

    or-long/2addr v1, v4

    const/4 v4, 0x6

    aget-wide v5, p0, v4

    aget-wide v7, p1, v4

    xor-long v4, v5, v7

    or-long/2addr v1, v4

    const/4 v4, 0x7

    aget-wide v5, p0, v4

    aget-wide p0, p1, v4

    xor-long/2addr p0, v5

    or-long/2addr p0, v1

    const-wide/16 v1, 0x0

    cmp-long v4, p0, v1

    if-nez v4, :cond_0

    return v3

    :cond_0
    return v0
.end method

.method public static multiply([J[J[J)V
    .locals 58

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p1, v0

    const/4 v3, 0x1

    aget-wide v3, p1, v3

    const/4 v5, 0x2

    aget-wide v5, p1, v5

    const/4 v7, 0x3

    aget-wide v7, p1, v7

    const/4 v9, 0x4

    aget-wide v10, p1, v9

    const/4 v12, 0x5

    aget-wide v13, p1, v12

    const/4 v15, 0x6

    aget-wide v16, p1, v15

    const/16 v18, 0x7

    aget-wide v19, p1, v18

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    move-wide/from16 v24, v21

    move-wide/from16 v26, v24

    move-wide/from16 v28, v26

    move-wide/from16 v30, v28

    move-wide/from16 v32, v30

    move-wide/from16 v34, v32

    move-wide/from16 v36, v34

    move-wide/from16 v38, v36

    :goto_0
    const/16 v40, 0x38

    const/16 v41, 0x3b

    const/16 v42, 0x3e

    const/16 v43, 0x1

    const/16 v15, 0x8

    if-ge v0, v15, :cond_1

    aget-wide v44, p0, v0

    add-int/lit8 v15, v0, 0x1

    aget-wide v46, p0, v15

    const/16 v48, 0x0

    const/16 v49, 0x2

    const/4 v9, 0x0

    move-wide/from16 v56, v3

    move-wide/from16 v3, v16

    move-wide/from16 v16, v13

    move-wide v13, v10

    move-wide v10, v7

    move-wide v7, v5

    move-wide/from16 v5, v56

    :goto_1
    const/16 v15, 0x40

    if-ge v9, v15, :cond_0

    const-wide/16 v50, 0x1

    move-wide/from16 v52, v13

    and-long v12, v44, v50

    neg-long v12, v12

    ushr-long v44, v44, v43

    and-long v54, v1, v12

    xor-long v24, v24, v54

    and-long v54, v5, v12

    xor-long v26, v26, v54

    and-long v54, v7, v12

    xor-long v28, v28, v54

    and-long v54, v10, v12

    xor-long v30, v30, v54

    and-long v54, v52, v12

    xor-long v32, v32, v54

    and-long v54, v16, v12

    xor-long v34, v34, v54

    and-long v54, v3, v12

    xor-long v36, v36, v54

    and-long v12, v19, v12

    xor-long v12, v38, v12

    and-long v14, v46, v50

    neg-long v14, v14

    ushr-long v46, v46, v43

    and-long v38, v1, v14

    xor-long v26, v26, v38

    and-long v38, v5, v14

    xor-long v28, v28, v38

    and-long v38, v7, v14

    xor-long v30, v30, v38

    and-long v38, v10, v14

    xor-long v32, v32, v38

    and-long v38, v52, v14

    xor-long v34, v34, v38

    and-long v38, v16, v14

    xor-long v36, v36, v38

    and-long v38, v3, v14

    xor-long v38, v12, v38

    and-long v12, v19, v14

    xor-long v21, v21, v12

    const/16 v12, 0x3f

    shr-long v13, v19, v12

    shl-long v19, v19, v43

    ushr-long v50, v3, v12

    or-long v19, v19, v50

    shl-long v3, v3, v43

    ushr-long v50, v16, v12

    or-long v3, v3, v50

    shl-long v15, v16, v43

    ushr-long v50, v52, v12

    or-long v16, v15, v50

    shl-long v50, v52, v43

    ushr-long v52, v10, v12

    or-long v50, v50, v52

    shl-long v10, v10, v43

    ushr-long v52, v7, v12

    or-long v10, v10, v52

    shl-long v7, v7, v43

    ushr-long v52, v5, v12

    or-long v7, v7, v52

    shl-long v5, v5, v43

    ushr-long v52, v1, v12

    or-long v5, v5, v52

    shl-long v1, v1, v43

    const-wide/16 v52, 0x125

    and-long v12, v13, v52

    xor-long/2addr v1, v12

    add-int/lit8 v9, v9, 0x1

    move-wide/from16 v13, v50

    const/4 v12, 0x5

    goto/16 :goto_1

    :cond_0
    move-wide/from16 v52, v13

    ushr-long v12, v19, v42

    xor-long/2addr v1, v12

    ushr-long v12, v19, v41

    xor-long/2addr v1, v12

    ushr-long v12, v19, v40

    xor-long/2addr v1, v12

    shl-long v12, v19, v49

    xor-long v12, v19, v12

    const/4 v9, 0x5

    shl-long v40, v19, v9

    xor-long v12, v12, v40

    const/16 v9, 0x8

    shl-long v19, v19, v9

    xor-long v12, v12, v19

    add-int/lit8 v0, v0, 0x2

    move-wide/from16 v19, v3

    const/4 v9, 0x4

    const/4 v15, 0x6

    move-wide v3, v1

    move-wide v1, v12

    move-wide/from16 v13, v52

    const/4 v12, 0x5

    goto/16 :goto_0

    :cond_1
    const/16 v0, 0x8

    const/4 v1, 0x3

    const/4 v2, 0x2

    shl-long v3, v21, v2

    xor-long v3, v21, v3

    const/4 v5, 0x5

    shl-long v6, v21, v5

    xor-long/2addr v3, v6

    shl-long v5, v21, v0

    xor-long/2addr v3, v5

    xor-long v3, v24, v3

    ushr-long v5, v21, v42

    ushr-long v7, v21, v41

    xor-long/2addr v5, v7

    ushr-long v7, v21, v40

    xor-long/2addr v5, v7

    xor-long v5, v26, v5

    aput-wide v3, p2, v23

    aput-wide v5, p2, v43

    aput-wide v28, p2, v2

    aput-wide v30, p2, v1

    const/4 v0, 0x4

    aput-wide v32, p2, v0

    const/4 v0, 0x5

    aput-wide v34, p2, v0

    const/4 v0, 0x6

    aput-wide v36, p2, v0

    aput-wide v38, p2, v18

    return-void
.end method

.method public static multiplyX([J[J)V
    .locals 31

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    const/4 v6, 0x2

    aget-wide v7, p0, v6

    const/4 v9, 0x3

    aget-wide v10, p0, v9

    const/4 v12, 0x4

    aget-wide v13, p0, v12

    const/4 v15, 0x5

    aget-wide v16, p0, v15

    const/16 v18, 0x6

    aget-wide v19, p0, v18

    const/16 v21, 0x7

    aget-wide v22, p0, v21

    const/16 v24, 0x3f

    shr-long v25, v22, v24

    shl-long v27, v1, v3

    const-wide/16 v29, 0x125

    and-long v25, v25, v29

    xor-long v25, v27, v25

    aput-wide v25, p1, v0

    shl-long v25, v4, v3

    ushr-long v0, v1, v24

    or-long v0, v25, v0

    aput-wide v0, p1, v3

    shl-long v0, v7, v3

    ushr-long v4, v4, v24

    or-long/2addr v0, v4

    aput-wide v0, p1, v6

    shl-long v0, v10, v3

    ushr-long v4, v7, v24

    or-long/2addr v0, v4

    aput-wide v0, p1, v9

    shl-long v0, v13, v3

    ushr-long v4, v10, v24

    or-long/2addr v0, v4

    aput-wide v0, p1, v12

    shl-long v0, v16, v3

    ushr-long v4, v13, v24

    or-long/2addr v0, v4

    aput-wide v0, p1, v15

    shl-long v0, v19, v3

    ushr-long v4, v16, v24

    or-long/2addr v0, v4

    aput-wide v0, p1, v18

    shl-long v0, v22, v3

    ushr-long v2, v19, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v21

    return-void
.end method

.method public static multiplyX8([J[J)V
    .locals 32

    const/4 v0, 0x0

    .line 0
    aget-wide v1, p0, v0

    const/4 v3, 0x1

    aget-wide v4, p0, v3

    const/4 v6, 0x2

    aget-wide v7, p0, v6

    const/4 v9, 0x3

    aget-wide v10, p0, v9

    const/4 v12, 0x4

    aget-wide v13, p0, v12

    const/4 v15, 0x5

    aget-wide v16, p0, v15

    const/16 v18, 0x6

    aget-wide v19, p0, v18

    const/16 v21, 0x7

    aget-wide v22, p0, v21

    const/16 v24, 0x38

    ushr-long v25, v22, v24

    const/16 v27, 0x8

    shl-long v28, v1, v27

    xor-long v28, v28, v25

    shl-long v30, v25, v6

    xor-long v28, v28, v30

    shl-long v30, v25, v15

    xor-long v28, v28, v30

    shl-long v25, v25, v27

    xor-long v25, v28, v25

    aput-wide v25, p1, v0

    shl-long v25, v4, v27

    ushr-long v0, v1, v24

    or-long v0, v25, v0

    aput-wide v0, p1, v3

    shl-long v0, v7, v27

    ushr-long v2, v4, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v6

    shl-long v0, v10, v27

    ushr-long v2, v7, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v9

    shl-long v0, v13, v27

    ushr-long v2, v10, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v12

    shl-long v0, v16, v27

    ushr-long v2, v13, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v15

    shl-long v0, v19, v27

    ushr-long v2, v16, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v18

    shl-long v0, v22, v27

    ushr-long v2, v19, v24

    or-long/2addr v0, v2

    aput-wide v0, p1, v21

    return-void
.end method

.method public static one([J)V
    .locals 3

    const/4 v0, 0x0

    const-wide/16 v1, 0x1

    .line 0
    aput-wide v1, p0, v0

    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aput-wide v1, p0, v0

    const/4 v0, 0x3

    aput-wide v1, p0, v0

    const/4 v0, 0x4

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aput-wide v1, p0, v0

    return-void
.end method

.method public static square([J[J)V
    .locals 12

    const/16 v0, 0x10

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x8

    if-ge v2, v3, :cond_0

    .line 0
    aget-wide v3, p0, v2

    shl-int/lit8 v5, v2, 0x1

    invoke-static {v3, v4, v1, v5}, Lorg/bouncycastle/math/raw/Interleave;->expand64To128(J[JI)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    add-int/lit8 p0, v0, -0x1

    if-lt p0, v3, :cond_1

    aget-wide v4, v1, p0

    add-int/lit8 v2, v0, -0x9

    aget-wide v6, v1, v2

    const/4 v8, 0x2

    shl-long v8, v4, v8

    xor-long/2addr v8, v4

    const/4 v10, 0x5

    shl-long v10, v4, v10

    xor-long/2addr v8, v10

    shl-long v10, v4, v3

    xor-long/2addr v8, v10

    xor-long/2addr v6, v8

    aput-wide v6, v1, v2

    add-int/lit8 v0, v0, -0x8

    aget-wide v6, v1, v0

    const/16 v2, 0x3e

    ushr-long v8, v4, v2

    const/16 v2, 0x3b

    ushr-long v10, v4, v2

    xor-long/2addr v8, v10

    const/16 v2, 0x38

    ushr-long/2addr v4, v2

    xor-long/2addr v4, v8

    xor-long/2addr v4, v6

    aput-wide v4, v1, v0

    move v0, p0

    goto :goto_1

    :cond_1
    invoke-static {v1, p1}, Lorg/bouncycastle/crypto/modes/kgcm/KGCMUtil_512;->copy([J[J)V

    return-void
.end method

.method public static x([J)V
    .locals 3

    const/4 v0, 0x0

    const-wide/16 v1, 0x2

    .line 0
    aput-wide v1, p0, v0

    const/4 v0, 0x1

    const-wide/16 v1, 0x0

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aput-wide v1, p0, v0

    const/4 v0, 0x3

    aput-wide v1, p0, v0

    const/4 v0, 0x4

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aput-wide v1, p0, v0

    return-void
.end method

.method public static zero([J)V
    .locals 3

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    .line 0
    aput-wide v1, p0, v0

    const/4 v0, 0x1

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aput-wide v1, p0, v0

    const/4 v0, 0x3

    aput-wide v1, p0, v0

    const/4 v0, 0x4

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aput-wide v1, p0, v0

    return-void
.end method
