.class public abstract Lorg/bouncycastle/math/ec/rfc8032/Scalar448;
.super Ljava/lang/Object;


# static fields
.field public static final L:[I

.field public static final L4_0:I = 0x29eec34

.field public static final L4_1:I = 0x1cf5b55

.field public static final L4_2:I = 0x9c2ab72

.field public static final L4_3:I = 0xf635c8e

.field public static final L4_4:I = 0x5bf7a4c

.field public static final L4_5:I = 0xd944a72

.field public static final L4_6:I = 0x8eec492

.field public static final L4_7:I = 0x20cd7705

.field public static final LSq:[I

.field public static final L_0:I = 0x4a7bb0d

.field public static final L_1:I = 0x873d6d5

.field public static final L_2:I = 0xa70aadc

.field public static final L_3:I = 0x3d8d723

.field public static final L_4:I = 0x96fde93

.field public static final L_5:I = 0xb65129c

.field public static final L_6:I = 0x63bb124

.field public static final L_7:I = 0x8335dc1

.field public static final M26L:J = 0x3ffffffL

.field public static final M28L:J = 0xfffffffL

.field public static final M32L:J = 0xffffffffL

.field public static final SCALAR_BYTES:I = 0x39

.field public static final SIZE:I = 0xe

.field public static final TARGET_LENGTH:I = 0x1bf


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xe

    new-array v0, v0, [I

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->L:[I

    const/16 v0, 0x1c

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->LSq:[I

    return-void

    nop

    :array_0
    .array-data 4
        -0x54a7bb0d
        0x2378c292
        -0x723a70ab
        0x216cc272
        -0x5129c970
        -0x3bb124b7
        0x7cca23e9
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0x3fffffff    # 1.9999999f
    .end array-data

    :array_1
    .array-data 4
        0x1ba1fea9
        -0x3e520448
        0x49e0a8b2    # 1840406.2f
        -0x46e40ac9
        -0x189b27eb
        0x4525492b
        -0x5d478e93    # -4.9993394E-18f
        0x4ae17cf6    # 7388795.0f
        -0x45c3b83c
        -0xe5633ec
        0x7e4d070a
        -0x6dfad435
        -0x607dc48e
        -0x3cbfd56d
        0x55ac2279
        -0x6e439eb7
        0x46e2c7aa
        0x10b66139
        -0x2894e4b8
        -0x1dd8925c
        -0x419aee0c
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        -0x1
        0xfffffff
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkVar([B[I)Z
    .locals 1

    const/16 v0, 0x38

    .line 0
    aget-byte v0, p0, v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    invoke-static {p0, p1}, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->decode([B[I)V

    const/16 p0, 0xe

    sget-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->L:[I

    invoke-static {p0, p1, v0}, Lorg/bouncycastle/math/raw/Nat;->gte(I[I[I)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static decode([B[I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0xe

    .line 0
    invoke-static {p0, v0, p1, v0, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI[III)V

    return-void
.end method

.method public static getOrderWnafVar(I[B)V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->L:[I

    invoke-static {v0, p0, p1}, Lorg/bouncycastle/math/ec/rfc8032/Wnaf;->getSignedVar([II[B)V

    return-void
.end method

.method public static multiply225Var([I[I[I)V
    .locals 10

    const/16 v0, 0x16

    new-array v9, v0, [I

    const/16 v6, 0xe

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/16 v3, 0x8

    const/4 v5, 0x0

    move-object v1, p1

    move-object v4, p0

    move-object v7, v9

    .line 0
    invoke-static/range {v1 .. v8}, Lorg/bouncycastle/math/raw/Nat;->mul([III[III[II)V

    const/4 v1, 0x7

    aget p1, p1, v1

    const/4 v1, 0x0

    if-gez p1, :cond_0

    sget-object p1, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->L:[I

    const/16 v2, 0xe

    const/16 v3, 0x8

    invoke-static {v2, p1, v1, v9, v3}, Lorg/bouncycastle/math/raw/Nat;->addTo(I[II[II)I

    invoke-static {v2, p0, v1, v9, v3}, Lorg/bouncycastle/math/raw/Nat;->subFrom(I[II[II)I

    :cond_0
    const/16 p0, 0x58

    new-array p0, p0, [B

    invoke-static {v9, v1, v0, p0, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode32([III[BI)V

    invoke-static {p0}, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->reduce704([B)[B

    move-result-object p0

    invoke-static {p0, p2}, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->decode([B[I)V

    return-void
.end method

.method public static reduce704([B)[B
    .locals 77

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 0
    invoke-static {v0, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const/4 v5, 0x4

    invoke-static {v0, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v6

    shl-int/2addr v6, v5

    int-to-long v6, v6

    and-long/2addr v6, v3

    const/4 v8, 0x7

    invoke-static {v0, v8}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v8

    int-to-long v8, v8

    and-long/2addr v8, v3

    const/16 v10, 0xb

    invoke-static {v0, v10}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v10

    shl-int/2addr v10, v5

    int-to-long v10, v10

    and-long/2addr v10, v3

    const/16 v12, 0xe

    invoke-static {v0, v12}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v12

    int-to-long v12, v12

    and-long/2addr v12, v3

    const/16 v14, 0x12

    invoke-static {v0, v14}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v14

    shl-int/lit8 v5, v14, 0x4

    int-to-long v14, v5

    and-long/2addr v14, v3

    const/16 v5, 0x15

    invoke-static {v0, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v5

    move-wide/from16 v16, v1

    int-to-long v1, v5

    and-long/2addr v1, v3

    const/16 v5, 0x19

    invoke-static {v0, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    move-wide/from16 v18, v6

    int-to-long v5, v5

    and-long/2addr v5, v3

    const/16 v7, 0x1c

    invoke-static {v0, v7}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v7

    move-wide/from16 v20, v8

    int-to-long v7, v7

    and-long/2addr v7, v3

    const/16 v9, 0x20

    invoke-static {v0, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v9

    shl-int/lit8 v9, v9, 0x4

    const/16 v22, 0x1c

    move-wide/from16 v23, v10

    int-to-long v9, v9

    and-long/2addr v9, v3

    const/16 v11, 0x23

    invoke-static {v0, v11}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v11

    move-wide/from16 v25, v12

    int-to-long v11, v11

    and-long/2addr v11, v3

    const/16 v13, 0x27

    invoke-static {v0, v13}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v13

    shl-int/lit8 v13, v13, 0x4

    move-wide/from16 v27, v14

    int-to-long v13, v13

    and-long/2addr v13, v3

    const/16 v15, 0x2a

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v29, v1

    int-to-long v1, v15

    and-long/2addr v1, v3

    const/16 v15, 0x2e

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v31, v5

    int-to-long v5, v15

    and-long/2addr v5, v3

    const/16 v15, 0x31

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v33, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x35

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v35, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x38

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v37, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x3c

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v39, v7

    int-to-long v7, v15

    and-long v41, v7, v3

    const/16 v15, 0x3f

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v43, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x43

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v45, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x46

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v47, v7

    int-to-long v7, v15

    and-long v49, v7, v3

    const/16 v15, 0x4a

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v51, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x4d

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v53, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x51

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v55, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x54

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v0

    move-wide/from16 v57, v7

    int-to-long v7, v0

    and-long/2addr v3, v7

    ushr-long v3, v3, v22

    const-wide/32 v59, 0xfffffff

    and-long v7, v7, v59

    const-wide/32 v61, 0x29eec34

    mul-long v63, v3, v61

    add-long v63, v63, v9

    const-wide/32 v9, 0x1cf5b55

    mul-long v65, v3, v9

    add-long v65, v65, v11

    const-wide/32 v11, 0x9c2ab72

    mul-long v67, v3, v11

    add-long v67, v67, v13

    const-wide/32 v13, 0xf635c8e

    mul-long v69, v3, v13

    add-long v69, v69, v1

    const-wide/32 v0, 0x5bf7a4c

    mul-long v71, v3, v0

    add-long v71, v71, v5

    const-wide/32 v5, 0xd944a72

    mul-long v73, v3, v5

    add-long v73, v73, v35

    const-wide/32 v35, 0x8eec492

    mul-long v75, v3, v35

    add-long v75, v75, v37

    const-wide/32 v37, 0x20cd7705

    mul-long v3, v3, v37

    add-long v3, v3, v39

    ushr-long v39, v49, v22

    add-long v39, v53, v39

    and-long v49, v51, v59

    ushr-long v51, v39, v22

    add-long v51, v55, v51

    and-long v39, v39, v59

    ushr-long v53, v51, v22

    add-long v53, v57, v53

    and-long v51, v51, v59

    ushr-long v55, v53, v22

    add-long v7, v7, v55

    and-long v53, v53, v59

    mul-long v55, v7, v61

    add-long v55, v55, v33

    mul-long v33, v7, v9

    add-long v33, v33, v63

    mul-long v57, v7, v11

    add-long v57, v57, v65

    mul-long v63, v7, v13

    add-long v63, v63, v67

    mul-long v65, v7, v0

    add-long v65, v65, v69

    mul-long v67, v7, v5

    add-long v67, v67, v71

    mul-long v69, v7, v35

    add-long v69, v69, v73

    mul-long v7, v7, v37

    add-long v7, v7, v75

    mul-long v71, v53, v61

    add-long v71, v71, v31

    mul-long v31, v53, v9

    add-long v31, v31, v55

    mul-long v55, v53, v11

    add-long v55, v55, v33

    mul-long v33, v53, v13

    add-long v33, v33, v57

    mul-long v57, v53, v0

    add-long v57, v57, v63

    mul-long v63, v53, v5

    add-long v63, v63, v65

    mul-long v65, v53, v35

    add-long v65, v65, v67

    mul-long v53, v53, v37

    add-long v53, v53, v69

    mul-long v67, v51, v61

    add-long v67, v67, v29

    mul-long v29, v51, v9

    add-long v29, v29, v71

    mul-long v69, v51, v11

    add-long v69, v69, v31

    mul-long v31, v51, v13

    add-long v31, v31, v55

    mul-long v55, v51, v0

    add-long v55, v55, v33

    mul-long v33, v51, v5

    add-long v33, v33, v57

    mul-long v57, v51, v35

    add-long v57, v57, v63

    mul-long v51, v51, v37

    add-long v51, v51, v65

    ushr-long v41, v41, v22

    add-long v41, v45, v41

    and-long v43, v43, v59

    ushr-long v45, v41, v22

    add-long v45, v47, v45

    and-long v41, v41, v59

    ushr-long v47, v45, v22

    add-long v49, v49, v47

    and-long v45, v45, v59

    ushr-long v47, v49, v22

    add-long v39, v39, v47

    and-long v47, v49, v59

    mul-long v49, v39, v61

    add-long v49, v49, v27

    mul-long v27, v39, v9

    add-long v27, v27, v67

    mul-long v63, v39, v11

    add-long v63, v63, v29

    mul-long v29, v39, v13

    add-long v29, v29, v69

    mul-long v65, v39, v0

    add-long v65, v65, v31

    mul-long v31, v39, v5

    add-long v31, v31, v55

    mul-long v55, v39, v35

    add-long v55, v55, v33

    mul-long v39, v39, v37

    add-long v39, v39, v57

    mul-long v33, v47, v61

    add-long v33, v33, v25

    mul-long v25, v47, v9

    add-long v25, v25, v49

    mul-long v49, v47, v11

    add-long v49, v49, v27

    mul-long v27, v47, v13

    add-long v27, v27, v63

    mul-long v57, v47, v0

    add-long v57, v57, v29

    mul-long v29, v47, v5

    add-long v29, v29, v65

    mul-long v63, v47, v35

    add-long v63, v63, v31

    mul-long v47, v47, v37

    add-long v47, v47, v55

    mul-long v31, v45, v61

    add-long v31, v31, v23

    mul-long v23, v45, v9

    add-long v23, v23, v33

    mul-long v33, v45, v11

    add-long v33, v33, v25

    mul-long v25, v45, v13

    add-long v25, v25, v49

    mul-long v49, v45, v0

    add-long v49, v49, v27

    mul-long v27, v45, v5

    add-long v27, v27, v57

    mul-long v55, v45, v35

    add-long v55, v55, v29

    mul-long v45, v45, v37

    add-long v45, v45, v63

    ushr-long v29, v53, v22

    add-long v7, v7, v29

    and-long v29, v53, v59

    ushr-long v53, v7, v22

    add-long v3, v3, v53

    and-long v53, v7, v59

    ushr-long v57, v3, v22

    add-long v43, v43, v57

    and-long v2, v3, v59

    ushr-long v57, v43, v22

    add-long v41, v41, v57

    and-long v43, v43, v59

    mul-long v57, v41, v61

    add-long v57, v57, v20

    mul-long v20, v41, v9

    add-long v20, v20, v31

    mul-long v31, v41, v11

    add-long v31, v31, v23

    mul-long v23, v41, v13

    add-long v23, v23, v33

    mul-long v33, v41, v0

    add-long v33, v33, v25

    mul-long v25, v41, v5

    add-long v25, v25, v49

    mul-long v49, v41, v35

    add-long v49, v49, v27

    mul-long v41, v41, v37

    add-long v41, v41, v55

    mul-long v61, v61, v43

    add-long v61, v61, v18

    mul-long v9, v9, v43

    add-long v9, v9, v57

    mul-long v11, v11, v43

    add-long v11, v11, v20

    mul-long v13, v13, v43

    add-long v13, v13, v31

    mul-long v0, v0, v43

    add-long v0, v0, v23

    mul-long v5, v5, v43

    add-long v5, v5, v33

    mul-long v35, v35, v43

    add-long v35, v35, v25

    mul-long v43, v43, v37

    add-long v43, v43, v49

    const-wide/16 v18, 0x4

    mul-long v2, v2, v18

    const/16 v4, 0x1a

    ushr-long v18, v53, v4

    add-long v2, v2, v18

    const-wide/32 v18, 0x3ffffff

    and-long v7, v7, v18

    const-wide/16 v20, 0x1

    add-long v2, v2, v20

    const-wide/32 v23, 0x4a7bb0d

    mul-long v23, v23, v2

    add-long v23, v23, v16

    const-wide/32 v15, 0x873d6d5

    mul-long v15, v15, v2

    add-long v15, v15, v61

    const-wide/32 v25, 0xa70aadc

    mul-long v25, v25, v2

    add-long v25, v25, v9

    const-wide/32 v9, 0x3d8d723

    mul-long v9, v9, v2

    add-long/2addr v9, v11

    const-wide/32 v11, 0x96fde93

    mul-long v11, v11, v2

    add-long/2addr v11, v13

    const-wide/32 v13, 0xb65129c

    mul-long v13, v13, v2

    add-long/2addr v13, v0

    const-wide/32 v0, 0x63bb124

    mul-long v0, v0, v2

    add-long/2addr v0, v5

    const-wide/32 v5, 0x8335dc1

    mul-long v2, v2, v5

    add-long v2, v2, v35

    ushr-long v5, v23, v22

    add-long/2addr v15, v5

    and-long v5, v23, v59

    ushr-long v23, v15, v22

    add-long v25, v25, v23

    and-long v15, v15, v59

    ushr-long v23, v25, v22

    add-long v9, v9, v23

    and-long v23, v25, v59

    ushr-long v25, v9, v22

    add-long v11, v11, v25

    and-long v9, v9, v59

    ushr-long v25, v11, v22

    add-long v13, v13, v25

    and-long v11, v11, v59

    ushr-long v25, v13, v22

    add-long v0, v0, v25

    and-long v13, v13, v59

    ushr-long v25, v0, v22

    add-long v2, v2, v25

    and-long v0, v0, v59

    ushr-long v25, v2, v22

    add-long v43, v43, v25

    and-long v2, v2, v59

    ushr-long v25, v43, v22

    add-long v41, v41, v25

    and-long v25, v43, v59

    ushr-long v27, v41, v22

    add-long v45, v45, v27

    and-long v27, v41, v59

    ushr-long v31, v45, v22

    add-long v47, v47, v31

    and-long v31, v45, v59

    ushr-long v33, v47, v22

    add-long v39, v39, v33

    and-long v33, v47, v59

    ushr-long v35, v39, v22

    add-long v51, v51, v35

    and-long v35, v39, v59

    ushr-long v37, v51, v22

    add-long v29, v29, v37

    and-long v37, v51, v59

    ushr-long v39, v29, v22

    add-long v7, v7, v39

    and-long v29, v29, v59

    ushr-long v39, v7, v4

    and-long v7, v7, v18

    sub-long v39, v39, v20

    const-wide/32 v17, 0x4a7bb0d

    and-long v17, v39, v17

    sub-long v5, v5, v17

    const-wide/32 v17, 0x873d6d5

    and-long v17, v39, v17

    sub-long v15, v15, v17

    const-wide/32 v17, 0xa70aadc

    and-long v17, v39, v17

    sub-long v23, v23, v17

    const-wide/32 v17, 0x3d8d723

    and-long v17, v39, v17

    sub-long v9, v9, v17

    const-wide/32 v17, 0x96fde93

    and-long v17, v39, v17

    sub-long v11, v11, v17

    const-wide/32 v17, 0xb65129c

    and-long v17, v39, v17

    sub-long v13, v13, v17

    const-wide/32 v17, 0x63bb124

    and-long v17, v39, v17

    sub-long v0, v0, v17

    const-wide/32 v17, 0x8335dc1

    and-long v17, v39, v17

    sub-long v2, v2, v17

    shr-long v17, v5, v22

    add-long v15, v15, v17

    and-long v4, v5, v59

    shr-long v17, v15, v22

    add-long v23, v23, v17

    and-long v15, v15, v59

    shr-long v17, v23, v22

    add-long v9, v9, v17

    and-long v17, v23, v59

    shr-long v19, v9, v22

    add-long v11, v11, v19

    and-long v9, v9, v59

    shr-long v19, v11, v22

    add-long v13, v13, v19

    and-long v11, v11, v59

    shr-long v19, v13, v22

    add-long v0, v0, v19

    and-long v13, v13, v59

    shr-long v19, v0, v22

    add-long v2, v2, v19

    and-long v0, v0, v59

    shr-long v19, v2, v22

    add-long v25, v25, v19

    and-long v2, v2, v59

    shr-long v19, v25, v22

    add-long v27, v27, v19

    and-long v19, v25, v59

    shr-long v23, v27, v22

    add-long v31, v31, v23

    and-long v23, v27, v59

    shr-long v25, v31, v22

    add-long v33, v33, v25

    and-long v25, v31, v59

    shr-long v27, v33, v22

    add-long v35, v35, v27

    and-long v27, v33, v59

    shr-long v31, v35, v22

    add-long v37, v37, v31

    and-long v31, v35, v59

    shr-long v33, v37, v22

    add-long v29, v29, v33

    and-long v33, v37, v59

    shr-long v35, v29, v22

    add-long v7, v7, v35

    and-long v29, v29, v59

    const/16 v6, 0x39

    new-array v6, v6, [B

    shl-long v15, v15, v22

    or-long/2addr v4, v15

    const/4 v15, 0x0

    invoke-static {v4, v5, v6, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v4, v9, v22

    or-long v4, v4, v17

    const/4 v9, 0x7

    invoke-static {v4, v5, v6, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v4, v13, v22

    or-long/2addr v4, v11

    const/16 v9, 0xe

    invoke-static {v4, v5, v6, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v2, v2, v22

    or-long/2addr v0, v2

    const/16 v2, 0x15

    invoke-static {v0, v1, v6, v2}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v23, v22

    or-long v0, v19, v0

    const/16 v2, 0x1c

    invoke-static {v0, v1, v6, v2}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v27, v2

    or-long v0, v25, v0

    const/16 v3, 0x23

    invoke-static {v0, v1, v6, v3}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v33, v2

    or-long v0, v31, v0

    const/16 v3, 0x2a

    invoke-static {v0, v1, v6, v3}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v7, v2

    or-long v0, v0, v29

    const/16 v2, 0x31

    invoke-static {v0, v1, v6, v2}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    return-object v6
.end method

.method public static reduce912([B)[B
    .locals 93

    move-object/from16 v0, p0

    const/4 v1, 0x0

    .line 0
    invoke-static {v0, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v1

    int-to-long v1, v1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    const/4 v5, 0x4

    invoke-static {v0, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v6

    shl-int/2addr v6, v5

    int-to-long v6, v6

    and-long/2addr v6, v3

    const/4 v8, 0x7

    invoke-static {v0, v8}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v8

    int-to-long v8, v8

    and-long/2addr v8, v3

    const/16 v10, 0xb

    invoke-static {v0, v10}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v10

    shl-int/2addr v10, v5

    int-to-long v10, v10

    and-long/2addr v10, v3

    const/16 v12, 0xe

    invoke-static {v0, v12}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v12

    int-to-long v12, v12

    and-long/2addr v12, v3

    const/16 v14, 0x12

    invoke-static {v0, v14}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v14

    shl-int/lit8 v5, v14, 0x4

    int-to-long v14, v5

    and-long/2addr v14, v3

    const/16 v5, 0x15

    invoke-static {v0, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v5

    move-wide/from16 v16, v1

    int-to-long v1, v5

    and-long/2addr v1, v3

    const/16 v5, 0x19

    invoke-static {v0, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v5

    shl-int/lit8 v5, v5, 0x4

    move-wide/from16 v18, v6

    int-to-long v5, v5

    and-long/2addr v5, v3

    const/16 v7, 0x1c

    invoke-static {v0, v7}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v7

    move-wide/from16 v20, v8

    int-to-long v7, v7

    and-long/2addr v7, v3

    const/16 v9, 0x20

    invoke-static {v0, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v9

    shl-int/lit8 v9, v9, 0x4

    const/16 v22, 0x1c

    move-wide/from16 v23, v10

    int-to-long v9, v9

    and-long/2addr v9, v3

    const/16 v11, 0x23

    invoke-static {v0, v11}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v11

    move-wide/from16 v25, v12

    int-to-long v11, v11

    and-long/2addr v11, v3

    const/16 v13, 0x27

    invoke-static {v0, v13}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v13

    shl-int/lit8 v13, v13, 0x4

    move-wide/from16 v27, v14

    int-to-long v13, v13

    and-long/2addr v13, v3

    const/16 v15, 0x2a

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v29, v1

    int-to-long v1, v15

    and-long/2addr v1, v3

    const/16 v15, 0x2e

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v31, v5

    int-to-long v5, v15

    and-long/2addr v5, v3

    const/16 v15, 0x31

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v33, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x35

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v35, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x38

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v37, v11

    int-to-long v11, v15

    and-long/2addr v11, v3

    const/16 v15, 0x3c

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v39, v13

    int-to-long v13, v15

    and-long/2addr v13, v3

    const/16 v15, 0x3f

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v41, v1

    int-to-long v1, v15

    and-long/2addr v1, v3

    const/16 v15, 0x43

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v43, v5

    int-to-long v5, v15

    and-long/2addr v5, v3

    const/16 v15, 0x46

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v45, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x4a

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v47, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x4d

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v49, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x51

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v51, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x54

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v53, v9

    int-to-long v9, v15

    and-long v55, v9, v3

    const/16 v15, 0x58

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v57, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x5b

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v59, v9

    int-to-long v9, v15

    and-long v61, v9, v3

    const/16 v15, 0x5f

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v63, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x62

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v65, v9

    int-to-long v9, v15

    and-long v67, v9, v3

    const/16 v15, 0x66

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v69, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x69

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v71, v9

    int-to-long v9, v15

    and-long v73, v9, v3

    const/16 v15, 0x6d

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v75, v9

    int-to-long v9, v15

    and-long/2addr v9, v3

    const/16 v15, 0x70

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode16([BI)I

    move-result v0

    move-wide/from16 v77, v9

    int-to-long v9, v0

    and-long/2addr v3, v9

    const-wide/32 v9, 0x29eec34

    mul-long v79, v3, v9

    add-long v79, v79, v11

    const-wide/32 v11, 0x1cf5b55

    mul-long v81, v3, v11

    add-long v81, v81, v13

    const-wide/32 v13, 0x9c2ab72

    mul-long v83, v3, v13

    add-long v83, v83, v1

    const-wide/32 v0, 0xf635c8e

    mul-long v85, v3, v0

    add-long v85, v85, v5

    const-wide/32 v5, 0x5bf7a4c

    mul-long v87, v3, v5

    add-long v87, v87, v7

    const-wide/32 v7, 0xd944a72

    mul-long v89, v3, v7

    add-long v89, v89, v49

    const-wide/32 v49, 0x8eec492

    mul-long v91, v3, v49

    add-long v91, v91, v51

    const-wide/32 v51, 0x20cd7705

    mul-long v3, v3, v51

    add-long v3, v3, v53

    ushr-long v53, v73, v22

    add-long v53, v77, v53

    const-wide/32 v73, 0xfffffff

    and-long v75, v75, v73

    mul-long v77, v53, v9

    add-long v77, v77, v47

    mul-long v47, v53, v11

    add-long v47, v47, v79

    mul-long v79, v53, v13

    add-long v79, v79, v81

    mul-long v81, v53, v0

    add-long v81, v81, v83

    mul-long v83, v53, v5

    add-long v83, v83, v85

    mul-long v85, v53, v7

    add-long v85, v85, v87

    mul-long v87, v53, v49

    add-long v87, v87, v89

    mul-long v53, v53, v51

    add-long v53, v53, v91

    mul-long v89, v75, v9

    add-long v89, v89, v45

    mul-long v45, v75, v11

    add-long v45, v45, v77

    mul-long v77, v75, v13

    add-long v77, v77, v47

    mul-long v47, v75, v0

    add-long v47, v47, v79

    mul-long v79, v75, v5

    add-long v79, v79, v81

    mul-long v81, v75, v7

    add-long v81, v81, v83

    mul-long v83, v75, v49

    add-long v83, v83, v85

    mul-long v75, v75, v51

    add-long v75, v75, v87

    ushr-long v67, v67, v22

    add-long v67, v71, v67

    and-long v69, v69, v73

    mul-long v71, v67, v9

    add-long v71, v71, v43

    mul-long v43, v67, v11

    add-long v43, v43, v89

    mul-long v85, v67, v13

    add-long v85, v85, v45

    mul-long v45, v67, v0

    add-long v45, v45, v77

    mul-long v77, v67, v5

    add-long v77, v77, v47

    mul-long v47, v67, v7

    add-long v47, v47, v79

    mul-long v79, v67, v49

    add-long v79, v79, v81

    mul-long v67, v67, v51

    add-long v67, v67, v83

    mul-long v81, v69, v9

    add-long v81, v81, v41

    mul-long v41, v69, v11

    add-long v41, v41, v71

    mul-long v71, v69, v13

    add-long v71, v71, v43

    mul-long v43, v69, v0

    add-long v43, v43, v85

    mul-long v83, v69, v5

    add-long v83, v83, v45

    mul-long v45, v69, v7

    add-long v45, v45, v77

    mul-long v77, v69, v49

    add-long v77, v77, v47

    mul-long v69, v69, v51

    add-long v69, v69, v79

    ushr-long v47, v61, v22

    add-long v47, v65, v47

    and-long v61, v63, v73

    mul-long v63, v47, v9

    add-long v63, v63, v39

    mul-long v39, v47, v11

    add-long v39, v39, v81

    mul-long v65, v47, v13

    add-long v65, v65, v41

    mul-long v41, v47, v0

    add-long v41, v41, v71

    mul-long v71, v47, v5

    add-long v71, v71, v43

    mul-long v43, v47, v7

    add-long v43, v43, v83

    mul-long v79, v47, v49

    add-long v79, v79, v45

    mul-long v47, v47, v51

    add-long v47, v47, v77

    mul-long v45, v61, v9

    add-long v45, v45, v37

    mul-long v37, v61, v11

    add-long v37, v37, v63

    mul-long v63, v61, v13

    add-long v63, v63, v39

    mul-long v39, v61, v0

    add-long v39, v39, v65

    mul-long v65, v61, v5

    add-long v65, v65, v41

    mul-long v41, v61, v7

    add-long v41, v41, v71

    mul-long v71, v61, v49

    add-long v71, v71, v43

    mul-long v61, v61, v51

    add-long v61, v61, v79

    ushr-long v43, v55, v22

    add-long v43, v59, v43

    and-long v55, v57, v73

    mul-long v57, v43, v9

    add-long v57, v57, v35

    mul-long v35, v43, v11

    add-long v35, v35, v45

    mul-long v45, v43, v13

    add-long v45, v45, v37

    mul-long v37, v43, v0

    add-long v37, v37, v63

    mul-long v59, v43, v5

    add-long v59, v59, v39

    mul-long v39, v43, v7

    add-long v39, v39, v65

    mul-long v63, v43, v49

    add-long v63, v63, v41

    mul-long v43, v43, v51

    add-long v43, v43, v71

    ushr-long v41, v67, v22

    add-long v75, v75, v41

    and-long v41, v67, v73

    ushr-long v65, v75, v22

    add-long v53, v53, v65

    and-long v65, v75, v73

    ushr-long v67, v53, v22

    add-long v3, v3, v67

    and-long v53, v53, v73

    ushr-long v67, v3, v22

    add-long v55, v55, v67

    and-long v2, v3, v73

    mul-long v67, v55, v9

    add-long v67, v67, v33

    mul-long v33, v55, v11

    add-long v33, v33, v57

    mul-long v57, v55, v13

    add-long v57, v57, v35

    mul-long v35, v55, v0

    add-long v35, v35, v45

    mul-long v45, v55, v5

    add-long v45, v45, v37

    mul-long v37, v55, v7

    add-long v37, v37, v59

    mul-long v59, v55, v49

    add-long v59, v59, v39

    mul-long v55, v55, v51

    add-long v55, v55, v63

    mul-long v39, v2, v9

    add-long v39, v39, v31

    mul-long v31, v2, v11

    add-long v31, v31, v67

    mul-long v63, v2, v13

    add-long v63, v63, v33

    mul-long v33, v2, v0

    add-long v33, v33, v57

    mul-long v57, v2, v5

    add-long v57, v57, v35

    mul-long v35, v2, v7

    add-long v35, v35, v45

    mul-long v45, v2, v49

    add-long v45, v45, v37

    mul-long v2, v2, v51

    add-long v2, v2, v59

    mul-long v37, v53, v9

    add-long v37, v37, v29

    mul-long v29, v53, v11

    add-long v29, v29, v39

    mul-long v39, v53, v13

    add-long v39, v39, v31

    mul-long v31, v53, v0

    add-long v31, v31, v63

    mul-long v59, v53, v5

    add-long v59, v59, v33

    mul-long v33, v53, v7

    add-long v33, v33, v57

    mul-long v57, v53, v49

    add-long v57, v57, v35

    mul-long v53, v53, v51

    add-long v53, v53, v45

    ushr-long v35, v61, v22

    add-long v47, v47, v35

    and-long v35, v61, v73

    ushr-long v45, v47, v22

    add-long v69, v69, v45

    and-long v45, v47, v73

    ushr-long v47, v69, v22

    add-long v41, v41, v47

    and-long v47, v69, v73

    ushr-long v61, v41, v22

    add-long v65, v65, v61

    and-long v41, v41, v73

    mul-long v61, v65, v9

    add-long v61, v61, v27

    mul-long v27, v65, v11

    add-long v27, v27, v37

    mul-long v37, v65, v13

    add-long v37, v37, v29

    mul-long v29, v65, v0

    add-long v29, v29, v39

    mul-long v39, v65, v5

    add-long v39, v39, v31

    mul-long v31, v65, v7

    add-long v31, v31, v59

    mul-long v59, v65, v49

    add-long v59, v59, v33

    mul-long v65, v65, v51

    add-long v65, v65, v57

    mul-long v33, v41, v9

    add-long v33, v33, v25

    mul-long v25, v41, v11

    add-long v25, v25, v61

    mul-long v57, v41, v13

    add-long v57, v57, v27

    mul-long v27, v41, v0

    add-long v27, v27, v37

    mul-long v37, v41, v5

    add-long v37, v37, v29

    mul-long v29, v41, v7

    add-long v29, v29, v39

    mul-long v39, v41, v49

    add-long v39, v39, v31

    mul-long v41, v41, v51

    add-long v41, v41, v59

    mul-long v31, v47, v9

    add-long v31, v31, v23

    mul-long v23, v47, v11

    add-long v23, v23, v33

    mul-long v33, v47, v13

    add-long v33, v33, v25

    mul-long v25, v47, v0

    add-long v25, v25, v57

    mul-long v57, v47, v5

    add-long v57, v57, v27

    mul-long v27, v47, v7

    add-long v27, v27, v37

    mul-long v37, v47, v49

    add-long v37, v37, v29

    mul-long v47, v47, v51

    add-long v47, v47, v39

    ushr-long v29, v2, v22

    add-long v55, v55, v29

    and-long v2, v2, v73

    ushr-long v29, v55, v22

    add-long v43, v43, v29

    and-long v29, v55, v73

    ushr-long v39, v43, v22

    add-long v35, v35, v39

    and-long v39, v43, v73

    ushr-long v43, v35, v22

    add-long v45, v45, v43

    and-long v35, v35, v73

    mul-long v43, v45, v9

    add-long v43, v43, v20

    mul-long v20, v45, v11

    add-long v20, v20, v31

    mul-long v31, v45, v13

    add-long v31, v31, v23

    mul-long v23, v45, v0

    add-long v23, v23, v33

    mul-long v33, v45, v5

    add-long v33, v33, v25

    mul-long v25, v45, v7

    add-long v25, v25, v57

    mul-long v57, v45, v49

    add-long v57, v57, v27

    mul-long v45, v45, v51

    add-long v45, v45, v37

    mul-long v9, v9, v35

    add-long v9, v9, v18

    mul-long v11, v11, v35

    add-long v11, v11, v43

    mul-long v13, v13, v35

    add-long v13, v13, v20

    mul-long v0, v0, v35

    add-long v0, v0, v31

    mul-long v5, v5, v35

    add-long v5, v5, v23

    mul-long v7, v7, v35

    add-long v7, v7, v33

    mul-long v49, v49, v35

    add-long v49, v49, v25

    mul-long v35, v35, v51

    add-long v35, v35, v57

    const-wide/16 v18, 0x4

    mul-long v39, v39, v18

    const/16 v4, 0x1a

    ushr-long v18, v29, v4

    add-long v39, v39, v18

    const-wide/32 v18, 0x3ffffff

    and-long v20, v55, v18

    const-wide/16 v23, 0x1

    add-long v39, v39, v23

    const-wide/32 v25, 0x4a7bb0d

    mul-long v25, v25, v39

    add-long v25, v25, v16

    const-wide/32 v15, 0x873d6d5

    mul-long v15, v15, v39

    add-long/2addr v15, v9

    const-wide/32 v9, 0xa70aadc

    mul-long v9, v9, v39

    add-long/2addr v9, v11

    const-wide/32 v11, 0x3d8d723

    mul-long v11, v11, v39

    add-long/2addr v11, v13

    const-wide/32 v13, 0x96fde93

    mul-long v13, v13, v39

    add-long/2addr v13, v0

    const-wide/32 v0, 0xb65129c

    mul-long v0, v0, v39

    add-long/2addr v0, v5

    const-wide/32 v5, 0x63bb124

    mul-long v5, v5, v39

    add-long/2addr v5, v7

    const-wide/32 v7, 0x8335dc1

    mul-long v39, v39, v7

    add-long v39, v39, v49

    ushr-long v7, v25, v22

    add-long/2addr v15, v7

    and-long v7, v25, v73

    ushr-long v25, v15, v22

    add-long v9, v9, v25

    and-long v15, v15, v73

    ushr-long v25, v9, v22

    add-long v11, v11, v25

    and-long v9, v9, v73

    ushr-long v25, v11, v22

    add-long v13, v13, v25

    and-long v11, v11, v73

    ushr-long v25, v13, v22

    add-long v0, v0, v25

    and-long v13, v13, v73

    ushr-long v25, v0, v22

    add-long v5, v5, v25

    and-long v0, v0, v73

    ushr-long v25, v5, v22

    add-long v39, v39, v25

    and-long v5, v5, v73

    ushr-long v25, v39, v22

    add-long v35, v35, v25

    and-long v25, v39, v73

    ushr-long v27, v35, v22

    add-long v45, v45, v27

    and-long v27, v35, v73

    ushr-long v29, v45, v22

    add-long v47, v47, v29

    and-long v29, v45, v73

    ushr-long v31, v47, v22

    add-long v41, v41, v31

    and-long v31, v47, v73

    ushr-long v33, v41, v22

    add-long v65, v65, v33

    and-long v33, v41, v73

    ushr-long v35, v65, v22

    add-long v53, v53, v35

    and-long v35, v65, v73

    ushr-long v37, v53, v22

    add-long v2, v2, v37

    and-long v37, v53, v73

    ushr-long v39, v2, v22

    add-long v20, v20, v39

    and-long v2, v2, v73

    ushr-long v39, v20, v4

    and-long v17, v20, v18

    sub-long v39, v39, v23

    const-wide/32 v19, 0x4a7bb0d

    and-long v19, v39, v19

    sub-long v7, v7, v19

    const-wide/32 v19, 0x873d6d5

    and-long v19, v39, v19

    sub-long v15, v15, v19

    const-wide/32 v19, 0xa70aadc

    and-long v19, v39, v19

    sub-long v9, v9, v19

    const-wide/32 v19, 0x3d8d723

    and-long v19, v39, v19

    sub-long v11, v11, v19

    const-wide/32 v19, 0x96fde93

    and-long v19, v39, v19

    sub-long v13, v13, v19

    const-wide/32 v19, 0xb65129c

    and-long v19, v39, v19

    sub-long v0, v0, v19

    const-wide/32 v19, 0x63bb124

    and-long v19, v39, v19

    sub-long v5, v5, v19

    const-wide/32 v19, 0x8335dc1

    and-long v19, v39, v19

    sub-long v25, v25, v19

    shr-long v19, v7, v22

    add-long v15, v15, v19

    and-long v7, v7, v73

    shr-long v19, v15, v22

    add-long v9, v9, v19

    and-long v15, v15, v73

    shr-long v19, v9, v22

    add-long v11, v11, v19

    and-long v9, v9, v73

    shr-long v19, v11, v22

    add-long v13, v13, v19

    and-long v11, v11, v73

    shr-long v19, v13, v22

    add-long v0, v0, v19

    and-long v13, v13, v73

    shr-long v19, v0, v22

    add-long v5, v5, v19

    and-long v0, v0, v73

    shr-long v19, v5, v22

    add-long v25, v25, v19

    and-long v4, v5, v73

    shr-long v19, v25, v22

    add-long v27, v27, v19

    and-long v19, v25, v73

    shr-long v23, v27, v22

    add-long v29, v29, v23

    and-long v23, v27, v73

    shr-long v25, v29, v22

    add-long v31, v31, v25

    and-long v25, v29, v73

    shr-long v27, v31, v22

    add-long v33, v33, v27

    and-long v27, v31, v73

    shr-long v29, v33, v22

    add-long v35, v35, v29

    and-long v29, v33, v73

    shr-long v31, v35, v22

    add-long v37, v37, v31

    and-long v31, v35, v73

    shr-long v33, v37, v22

    add-long v2, v2, v33

    and-long v33, v37, v73

    shr-long v35, v2, v22

    add-long v17, v17, v35

    and-long v2, v2, v73

    const/16 v6, 0x39

    new-array v6, v6, [B

    shl-long v15, v15, v22

    or-long/2addr v7, v15

    const/4 v15, 0x0

    invoke-static {v7, v8, v6, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v7, v11, v22

    or-long/2addr v7, v9

    const/4 v9, 0x7

    invoke-static {v7, v8, v6, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v0, v22

    or-long/2addr v0, v13

    const/16 v7, 0xe

    invoke-static {v0, v1, v6, v7}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v19, v22

    or-long/2addr v0, v4

    const/16 v4, 0x15

    invoke-static {v0, v1, v6, v4}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v25, v22

    or-long v0, v0, v23

    const/16 v4, 0x1c

    invoke-static {v0, v1, v6, v4}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v29, v4

    or-long v0, v27, v0

    const/16 v5, 0x23

    invoke-static {v0, v1, v6, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v33, v4

    or-long v0, v31, v0

    const/16 v5, 0x2a

    invoke-static {v0, v1, v6, v5}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v17, v4

    or-long/2addr v0, v2

    const/16 v2, 0x31

    invoke-static {v0, v1, v6, v2}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    return-object v6
.end method

.method public static reduceBasisVar([I[I[I)Z
    .locals 23

    move-object/from16 v0, p0

    const/16 v1, 0x1c

    new-array v2, v1, [I

    .line 0
    sget-object v3, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->LSq:[I

    const/4 v4, 0x0

    invoke-static {v3, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v3, v1, [I

    invoke-static {v0, v3}, Lorg/bouncycastle/math/raw/Nat448;->square([I[I)V

    aget v5, v3, v4

    const/4 v6, 0x1

    add-int/2addr v5, v6

    aput v5, v3, v4

    new-array v5, v1, [I

    sget-object v7, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->L:[I

    invoke-static {v7, v0, v5}, Lorg/bouncycastle/math/raw/Nat448;->mul([I[I[I)V

    new-array v1, v1, [I

    const/16 v13, 0x8

    new-array v8, v13, [I

    invoke-static {v7, v4, v8, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v7, v13, [I

    new-array v9, v13, [I

    invoke-static {v0, v4, v9, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v0, v13, [I

    aput v6, v0, v4

    const/16 v10, 0x1b

    invoke-static {v10, v3}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->getBitLengthPositive(I[I)I

    move-result v10

    const/16 v11, 0x6fc

    const/16 v12, 0x1b

    move-object v14, v7

    move-object/from16 v16, v8

    move-object v15, v9

    move v12, v10

    const/16 v10, 0x1b

    :goto_0
    const/16 v7, 0x1bf

    if-le v12, v7, :cond_3

    add-int/lit8 v17, v11, -0x1

    if-gez v17, :cond_0

    return v4

    :cond_0
    invoke-static {v10, v5}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->getBitLength(I[I)I

    move-result v7

    sub-int/2addr v7, v12

    shr-int/lit8 v8, v7, 0x1f

    not-int v8, v8

    and-int v18, v7, v8

    aget v7, v5, v10

    if-gez v7, :cond_1

    move v7, v10

    move/from16 v8, v18

    move-object v9, v2

    move v11, v10

    move-object v10, v3

    move/from16 p0, v11

    move-object v11, v5

    move/from16 v19, v12

    move-object v12, v1

    invoke-static/range {v7 .. v12}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->addShifted_NP(II[I[I[I[I)V

    const/4 v7, 0x7

    move-object/from16 v9, v16

    move-object v10, v14

    move-object v11, v15

    move-object v12, v0

    invoke-static/range {v7 .. v12}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->addShifted_UV(II[I[I[I[I)V

    goto :goto_1

    :cond_1
    move/from16 p0, v10

    move/from16 v19, v12

    move/from16 v7, p0

    move/from16 v8, v18

    move-object v9, v2

    move-object v10, v3

    move-object v11, v5

    move-object v12, v1

    invoke-static/range {v7 .. v12}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->subShifted_NP(II[I[I[I[I)V

    const/4 v7, 0x7

    move-object/from16 v9, v16

    move-object v10, v14

    move-object v11, v15

    move-object v12, v0

    invoke-static/range {v7 .. v12}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->subShifted_UV(II[I[I[I[I)V

    :goto_1
    move/from16 v12, p0

    invoke-static {v12, v2, v3}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->lessThan(I[I[I)Z

    move-result v7

    if-eqz v7, :cond_2

    ushr-int/lit8 v10, v19, 0x5

    invoke-static {v10, v2}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->getBitLengthPositive(I[I)I

    move-result v12

    move/from16 v11, v17

    move-object/from16 v20, v14

    move-object v14, v0

    move-object/from16 v0, v20

    move-object/from16 v21, v3

    move-object v3, v2

    move-object/from16 v2, v21

    move-object/from16 v22, v16

    move-object/from16 v16, v15

    move-object/from16 v15, v22

    goto :goto_0

    :cond_2
    move v10, v12

    move/from16 v11, v17

    move/from16 v12, v19

    goto :goto_0

    :cond_3
    move-object/from16 v2, p1

    invoke-static {v15, v4, v2, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v1, p2

    invoke-static {v0, v4, v1, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return v6
.end method

.method public static toSignedDigits(I[I[I)V
    .locals 4

    add-int/lit16 p0, p0, -0x1c0

    const/4 v0, 0x1

    shl-int p0, v0, p0

    const/4 v1, 0x0

    .line 0
    aget v2, p1, v1

    not-int v2, v2

    and-int/2addr v0, v2

    sget-object v2, Lorg/bouncycastle/math/ec/rfc8032/Scalar448;->L:[I

    const/16 v3, 0xe

    invoke-static {v3, v0, p1, v2, p2}, Lorg/bouncycastle/math/raw/Nat;->cadd(II[I[I[I)I

    move-result p1

    add-int/2addr p1, p0

    aput p1, p2, v3

    const/16 p0, 0xf

    invoke-static {p0, p2, v1}, Lorg/bouncycastle/math/raw/Nat;->shiftDownBit(I[II)I

    return-void
.end method
