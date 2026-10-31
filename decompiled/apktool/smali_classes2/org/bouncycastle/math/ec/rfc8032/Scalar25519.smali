.class public abstract Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;
.super Ljava/lang/Object;


# static fields
.field public static final L:[I

.field public static final L0:I = -0x30a2c13

.field public static final L1:I = 0x12631a6

.field public static final L2:I = 0x79cd658

.field public static final L3:I = -0x6215d1

.field public static final L4:I = 0x14df

.field public static final LSq:[I

.field public static final M08L:J = 0xffL

.field public static final M28L:J = 0xfffffffL

.field public static final M32L:J = 0xffffffffL

.field public static final SCALAR_BYTES:I = 0x20

.field public static final SIZE:I = 0x8

.field public static final TARGET_LENGTH:I = 0xfe


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [I

    .line 0
    fill-array-data v0, :array_0

    sput-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->L:[I

    const/16 v0, 0x10

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->LSq:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x5cf5d3ed
        0x5812631a
        -0x5d08632a
        0x14def9de
        0x0
        0x0
        0x0
        0x10000000
    .end array-data

    :array_1
    .array-data 4
        -0x54ed7697
        -0x1d12097b
        0x2298a31d
        0x68039276
        -0x2de80a42
        0x3dceec73
        0x1b7c309a
        -0x5e4c66bf
        0x4b9eba7d    # 2.0804858E7f
        -0x34fdb39d    # -8539235.0f
        -0x2ba10c66
        0x29bdf3b
        0x0
        0x0
        0x0
        0x1000000
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static checkVar([B[I)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->decode([B[I)V

    sget-object p0, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->L:[I

    invoke-static {p1, p0}, Lorg/bouncycastle/math/raw/Nat256;->gte([I[I)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static decode([B[I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x8

    .line 0
    invoke-static {p0, v0, p1, v0, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI[III)V

    return-void
.end method

.method public static getOrderWnafVar(I[B)V
    .locals 1

    .line 0
    sget-object v0, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->L:[I

    invoke-static {v0, p0, p1}, Lorg/bouncycastle/math/ec/rfc8032/Wnaf;->getSignedVar([II[B)V

    return-void
.end method

.method public static multiply128Var([I[I[I)V
    .locals 4

    const/16 v0, 0xc

    new-array v1, v0, [I

    .line 0
    invoke-static {p0, p1, v1}, Lorg/bouncycastle/math/raw/Nat256;->mul128([I[I[I)V

    const/4 v2, 0x3

    aget p1, p1, v2

    const/4 v2, 0x0

    if-gez p1, :cond_0

    sget-object p1, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->L:[I

    const/4 v3, 0x4

    invoke-static {p1, v2, v1, v3, v2}, Lorg/bouncycastle/math/raw/Nat256;->addTo([II[III)I

    invoke-static {p0, v2, v1, v3, v2}, Lorg/bouncycastle/math/raw/Nat256;->subFrom([II[III)I

    :cond_0
    const/16 p0, 0x30

    new-array p0, p0, [B

    invoke-static {v1, v2, v0, p0, v2}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode32([III[BI)V

    invoke-static {p0}, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->reduce384([B)[B

    move-result-object p0

    invoke-static {p0, p2}, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->decode([B[I)V

    return-void
.end method

.method public static reduce384([B)[B
    .locals 49

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

    and-long v25, v9, v3

    const/16 v11, 0x23

    invoke-static {v0, v11}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v11

    move-wide/from16 v27, v9

    int-to-long v9, v11

    and-long v29, v9, v3

    const/16 v11, 0x27

    invoke-static {v0, v11}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v11

    shl-int/lit8 v11, v11, 0x4

    move-wide/from16 v31, v9

    int-to-long v9, v11

    and-long v33, v9, v3

    const/16 v11, 0x2a

    invoke-static {v0, v11}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v11

    move-wide/from16 v35, v9

    int-to-long v9, v11

    and-long v37, v9, v3

    const/16 v11, 0x2e

    invoke-static {v0, v11}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode16([BI)I

    move-result v0

    shl-int/lit8 v0, v0, 0x4

    move-wide/from16 v39, v7

    int-to-long v7, v0

    and-long/2addr v3, v7

    shr-long v7, v37, v22

    add-long/2addr v3, v7

    const-wide/32 v7, 0xfffffff

    and-long/2addr v9, v7

    const-wide/32 v37, -0x30a2c13

    mul-long v41, v3, v37

    sub-long v12, v12, v41

    const-wide/32 v41, 0x12631a6

    mul-long v43, v3, v41

    sub-long v14, v14, v43

    const-wide/32 v43, 0x79cd658

    mul-long v45, v3, v43

    sub-long v1, v1, v45

    const-wide/32 v45, -0x6215d1

    mul-long v47, v3, v45

    sub-long v5, v5, v47

    const-wide/16 v47, 0x14df

    mul-long v3, v3, v47

    sub-long v3, v39, v3

    shr-long v33, v33, v22

    add-long v9, v9, v33

    and-long v33, v35, v7

    mul-long v35, v9, v37

    sub-long v23, v23, v35

    mul-long v35, v9, v41

    sub-long v12, v12, v35

    mul-long v35, v9, v43

    sub-long v14, v14, v35

    mul-long v35, v9, v45

    sub-long v1, v1, v35

    mul-long v9, v9, v47

    sub-long/2addr v5, v9

    shr-long v9, v29, v22

    add-long v33, v33, v9

    and-long v9, v31, v7

    mul-long v29, v33, v37

    sub-long v20, v20, v29

    mul-long v29, v33, v41

    sub-long v23, v23, v29

    mul-long v29, v33, v43

    sub-long v12, v12, v29

    mul-long v29, v33, v45

    sub-long v14, v14, v29

    mul-long v33, v33, v47

    sub-long v1, v1, v33

    shr-long v25, v25, v22

    add-long v9, v9, v25

    and-long v25, v27, v7

    mul-long v27, v9, v37

    sub-long v18, v18, v27

    mul-long v27, v9, v41

    sub-long v20, v20, v27

    mul-long v27, v9, v43

    sub-long v23, v23, v27

    mul-long v27, v9, v45

    sub-long v12, v12, v27

    mul-long v9, v9, v47

    sub-long/2addr v14, v9

    shr-long v9, v5, v22

    add-long/2addr v3, v9

    and-long/2addr v5, v7

    shr-long v9, v3, v22

    add-long v25, v25, v9

    and-long/2addr v3, v7

    const/16 v0, 0x1b

    ushr-long v9, v3, v0

    add-long v25, v25, v9

    mul-long v27, v25, v37

    sub-long v16, v16, v27

    mul-long v27, v25, v41

    sub-long v18, v18, v27

    mul-long v27, v25, v43

    sub-long v20, v20, v27

    mul-long v27, v25, v45

    sub-long v23, v23, v27

    mul-long v25, v25, v47

    sub-long v12, v12, v25

    shr-long v25, v16, v22

    add-long v18, v18, v25

    and-long v16, v16, v7

    shr-long v25, v18, v22

    add-long v20, v20, v25

    and-long v18, v18, v7

    shr-long v25, v20, v22

    add-long v23, v23, v25

    and-long v20, v20, v7

    shr-long v25, v23, v22

    add-long v12, v12, v25

    and-long v23, v23, v7

    shr-long v25, v12, v22

    add-long v14, v14, v25

    and-long v11, v12, v7

    shr-long v25, v14, v22

    add-long v1, v1, v25

    and-long v13, v14, v7

    shr-long v25, v1, v22

    add-long v5, v5, v25

    and-long v0, v1, v7

    shr-long v25, v5, v22

    add-long v3, v3, v25

    and-long/2addr v5, v7

    shr-long v25, v3, v22

    and-long v2, v3, v7

    sub-long v25, v25, v9

    and-long v9, v25, v37

    add-long v16, v16, v9

    and-long v9, v25, v41

    add-long v18, v18, v9

    and-long v9, v25, v43

    add-long v20, v20, v9

    and-long v9, v25, v45

    add-long v23, v23, v9

    and-long v9, v25, v47

    add-long/2addr v11, v9

    shr-long v9, v16, v22

    add-long v18, v18, v9

    and-long v9, v16, v7

    shr-long v15, v18, v22

    add-long v20, v20, v15

    and-long v15, v18, v7

    shr-long v17, v20, v22

    add-long v23, v23, v17

    and-long v17, v20, v7

    shr-long v19, v23, v22

    add-long v11, v11, v19

    and-long v19, v23, v7

    shr-long v23, v11, v22

    add-long v13, v13, v23

    and-long/2addr v11, v7

    shr-long v23, v13, v22

    add-long v0, v0, v23

    and-long/2addr v13, v7

    shr-long v23, v0, v22

    add-long v5, v5, v23

    and-long/2addr v0, v7

    shr-long v23, v5, v22

    add-long v2, v2, v23

    and-long v4, v5, v7

    const/16 v6, 0x40

    new-array v6, v6, [B

    shl-long v7, v15, v22

    or-long/2addr v7, v9

    const/4 v9, 0x0

    invoke-static {v7, v8, v6, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v7, v19, v22

    or-long v7, v17, v7

    const/4 v9, 0x7

    invoke-static {v7, v8, v6, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v7, v13, v22

    or-long/2addr v7, v11

    const/16 v9, 0xe

    invoke-static {v7, v8, v6, v9}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v4, v4, v22

    or-long/2addr v0, v4

    const/16 v4, 0x15

    invoke-static {v0, v1, v6, v4}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    long-to-int v0, v2

    const/16 v1, 0x1c

    invoke-static {v0, v6, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode32(I[BI)V

    return-object v6
.end method

.method public static reduce512([B)[B
    .locals 55

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

    const/16 v22, 0x1c

    shl-int/lit8 v9, v9, 0x4

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

    and-long v35, v7, v3

    const/16 v15, 0x35

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v37, v7

    int-to-long v7, v15

    and-long/2addr v7, v3

    const/16 v15, 0x38

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode32([BI)I

    move-result v15

    move-wide/from16 v39, v7

    int-to-long v7, v15

    and-long v41, v7, v3

    const/16 v15, 0x3c

    invoke-static {v0, v15}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->decode24([BI)I

    move-result v15

    shl-int/lit8 v15, v15, 0x4

    move-wide/from16 v43, v7

    int-to-long v7, v15

    and-long/2addr v3, v7

    const/16 v7, 0x3f

    aget-byte v0, v0, v7

    int-to-long v7, v0

    const-wide/16 v45, 0xff

    and-long v7, v7, v45

    const-wide/32 v45, -0x30a2c13

    mul-long v47, v7, v45

    sub-long v9, v9, v47

    const-wide/32 v47, 0x12631a6

    mul-long v49, v7, v47

    sub-long v11, v11, v49

    const-wide/32 v49, 0x79cd658

    mul-long v51, v7, v49

    sub-long v13, v13, v51

    const-wide/32 v51, -0x6215d1

    mul-long v53, v7, v51

    sub-long v1, v1, v53

    const-wide/16 v53, 0x14df

    mul-long v7, v7, v53

    sub-long/2addr v5, v7

    shr-long v7, v41, v22

    add-long/2addr v3, v7

    const-wide/32 v7, 0xfffffff

    and-long v41, v43, v7

    mul-long v43, v3, v45

    sub-long v33, v33, v43

    mul-long v43, v3, v47

    sub-long v9, v9, v43

    mul-long v43, v3, v49

    sub-long v11, v11, v43

    mul-long v43, v3, v51

    sub-long v13, v13, v43

    mul-long v3, v3, v53

    sub-long/2addr v1, v3

    mul-long v3, v41, v45

    sub-long v3, v31, v3

    mul-long v31, v41, v47

    sub-long v33, v33, v31

    mul-long v31, v41, v49

    sub-long v9, v9, v31

    mul-long v31, v41, v51

    sub-long v11, v11, v31

    mul-long v41, v41, v53

    sub-long v13, v13, v41

    shr-long v31, v35, v22

    add-long v31, v39, v31

    and-long v35, v37, v7

    mul-long v37, v31, v45

    sub-long v29, v29, v37

    mul-long v37, v31, v47

    sub-long v3, v3, v37

    mul-long v37, v31, v49

    sub-long v33, v33, v37

    mul-long v37, v31, v51

    sub-long v9, v9, v37

    mul-long v31, v31, v53

    sub-long v11, v11, v31

    mul-long v31, v35, v45

    sub-long v27, v27, v31

    mul-long v31, v35, v47

    sub-long v29, v29, v31

    mul-long v31, v35, v49

    sub-long v3, v3, v31

    mul-long v31, v35, v51

    sub-long v33, v33, v31

    mul-long v35, v35, v53

    sub-long v9, v9, v35

    shr-long v31, v1, v22

    add-long v5, v5, v31

    and-long v0, v1, v7

    mul-long v31, v5, v45

    sub-long v25, v25, v31

    mul-long v31, v5, v47

    sub-long v27, v27, v31

    mul-long v31, v5, v49

    sub-long v29, v29, v31

    mul-long v31, v5, v51

    sub-long v3, v3, v31

    mul-long v5, v5, v53

    sub-long v33, v33, v5

    shr-long v5, v13, v22

    add-long/2addr v0, v5

    and-long v5, v13, v7

    mul-long v13, v0, v45

    sub-long v13, v23, v13

    mul-long v23, v0, v47

    sub-long v25, v25, v23

    mul-long v23, v0, v49

    sub-long v27, v27, v23

    mul-long v23, v0, v51

    sub-long v29, v29, v23

    mul-long v0, v0, v53

    sub-long/2addr v3, v0

    shr-long v0, v11, v22

    add-long/2addr v5, v0

    and-long v0, v11, v7

    mul-long v11, v5, v45

    sub-long v11, v20, v11

    mul-long v20, v5, v47

    sub-long v13, v13, v20

    mul-long v20, v5, v49

    sub-long v25, v25, v20

    mul-long v20, v5, v51

    sub-long v27, v27, v20

    mul-long v5, v5, v53

    sub-long v29, v29, v5

    shr-long v5, v9, v22

    add-long/2addr v0, v5

    and-long v5, v9, v7

    mul-long v9, v0, v45

    sub-long v9, v18, v9

    mul-long v18, v0, v47

    sub-long v11, v11, v18

    mul-long v18, v0, v49

    sub-long v13, v13, v18

    mul-long v18, v0, v51

    sub-long v25, v25, v18

    mul-long v0, v0, v53

    sub-long v27, v27, v0

    shr-long v0, v3, v22

    add-long v33, v33, v0

    and-long v0, v3, v7

    shr-long v2, v33, v22

    add-long/2addr v5, v2

    and-long v2, v33, v7

    const/16 v4, 0x1b

    ushr-long v18, v2, v4

    add-long v5, v5, v18

    mul-long v20, v5, v45

    sub-long v15, v16, v20

    mul-long v20, v5, v47

    sub-long v9, v9, v20

    mul-long v20, v5, v49

    sub-long v11, v11, v20

    mul-long v20, v5, v51

    sub-long v13, v13, v20

    mul-long v5, v5, v53

    sub-long v25, v25, v5

    shr-long v4, v15, v22

    add-long/2addr v9, v4

    and-long v4, v15, v7

    shr-long v15, v9, v22

    add-long/2addr v11, v15

    and-long/2addr v9, v7

    shr-long v15, v11, v22

    add-long/2addr v13, v15

    and-long/2addr v11, v7

    shr-long v15, v13, v22

    add-long v25, v25, v15

    and-long/2addr v13, v7

    shr-long v15, v25, v22

    add-long v27, v27, v15

    and-long v15, v25, v7

    shr-long v20, v27, v22

    add-long v29, v29, v20

    and-long v20, v27, v7

    shr-long v23, v29, v22

    add-long v0, v0, v23

    and-long v23, v29, v7

    shr-long v25, v0, v22

    add-long v2, v2, v25

    and-long/2addr v0, v7

    shr-long v25, v2, v22

    and-long/2addr v2, v7

    sub-long v25, v25, v18

    and-long v17, v25, v45

    add-long v4, v4, v17

    and-long v17, v25, v47

    add-long v9, v9, v17

    and-long v17, v25, v49

    add-long v11, v11, v17

    and-long v17, v25, v51

    add-long v13, v13, v17

    and-long v17, v25, v53

    add-long v15, v15, v17

    shr-long v17, v4, v22

    add-long v9, v9, v17

    and-long/2addr v4, v7

    shr-long v17, v9, v22

    add-long v11, v11, v17

    and-long/2addr v9, v7

    shr-long v17, v11, v22

    add-long v13, v13, v17

    and-long/2addr v11, v7

    shr-long v17, v13, v22

    add-long v15, v15, v17

    and-long/2addr v13, v7

    shr-long v17, v15, v22

    add-long v20, v20, v17

    and-long/2addr v15, v7

    shr-long v17, v20, v22

    add-long v23, v23, v17

    and-long v17, v20, v7

    shr-long v19, v23, v22

    add-long v0, v0, v19

    and-long v19, v23, v7

    shr-long v23, v0, v22

    add-long v2, v2, v23

    and-long/2addr v0, v7

    const/16 v6, 0x20

    new-array v6, v6, [B

    shl-long v7, v9, v22

    or-long/2addr v4, v7

    const/4 v7, 0x0

    invoke-static {v4, v5, v6, v7}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v4, v13, v22

    or-long/2addr v4, v11

    const/4 v7, 0x7

    invoke-static {v4, v5, v6, v7}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v4, v17, v22

    or-long/2addr v4, v15

    const/16 v7, 0xe

    invoke-static {v4, v5, v6, v7}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    shl-long v0, v0, v22

    or-long v0, v19, v0

    const/16 v4, 0x15

    invoke-static {v0, v1, v6, v4}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode56(J[BI)V

    long-to-int v0, v2

    const/16 v1, 0x1c

    invoke-static {v0, v6, v1}, Lorg/bouncycastle/math/ec/rfc8032/Codec;->encode32(I[BI)V

    return-object v6
.end method

.method public static reduceBasisVar([I[I[I)Z
    .locals 23

    move-object/from16 v0, p0

    const/16 v1, 0x10

    new-array v2, v1, [I

    .line 0
    sget-object v3, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->LSq:[I

    const/4 v4, 0x0

    invoke-static {v3, v4, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v3, v1, [I

    invoke-static {v0, v3}, Lorg/bouncycastle/math/raw/Nat256;->square([I[I)V

    aget v5, v3, v4

    const/4 v6, 0x1

    add-int/2addr v5, v6

    aput v5, v3, v4

    new-array v5, v1, [I

    sget-object v7, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->L:[I

    invoke-static {v7, v0, v5}, Lorg/bouncycastle/math/raw/Nat256;->mul([I[I[I)V

    new-array v1, v1, [I

    const/4 v13, 0x4

    new-array v8, v13, [I

    invoke-static {v7, v4, v8, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v7, v13, [I

    new-array v9, v13, [I

    invoke-static {v0, v4, v9, v4, v13}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v0, v13, [I

    aput v6, v0, v4

    const/16 v10, 0xf

    invoke-static {v10, v3}, Lorg/bouncycastle/math/ec/rfc8032/ScalarUtil;->getBitLengthPositive(I[I)I

    move-result v10

    const/16 v11, 0x3f8

    const/16 v12, 0xf

    move-object v14, v7

    move-object/from16 v16, v8

    move-object v15, v9

    move v12, v10

    const/16 v10, 0xf

    :goto_0
    const/16 v7, 0xfe

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

    const/4 v7, 0x3

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

    const/4 v7, 0x3

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

.method public static toSignedDigits(I[I)V
    .locals 3

    const/4 p0, 0x0

    .line 0
    aget p0, p1, p0

    not-int p0, p0

    const/4 v0, 0x1

    and-int/2addr p0, v0

    sget-object v1, Lorg/bouncycastle/math/ec/rfc8032/Scalar25519;->L:[I

    const/16 v2, 0x8

    invoke-static {v2, p0, v1, p1}, Lorg/bouncycastle/math/raw/Nat;->caddTo(II[I[I)I

    invoke-static {v2, p1, v0}, Lorg/bouncycastle/math/raw/Nat;->shiftDownBit(I[II)I

    return-void
.end method
