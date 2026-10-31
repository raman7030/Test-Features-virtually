.class public final Ll/ۡۗ᩻;
.super Ljava/lang/Object;
.source "P53K"


# static fields
.field public static final ۜ:[B


# instance fields
.field public final ֫:[B

.field public ۧ:J

.field public ܳ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:I

.field public final ᩻:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x40

    new-array v0, v0, [B

    .line 9
    fill-array-data v0, :array_0

    sput-object v0, Ll/ۡۗ᩻;->ۜ:[B

    return-void

    :array_0
    .array-data 1
        -0x80t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    new-array v0, v0, [B

    .line 6
    iput-object v0, p0, Ll/ۡۗ᩻;->֫:[B

    const/16 v0, 0x10

    new-array v0, v0, [I

    .line 7
    iput-object v0, p0, Ll/ۡۗ᩻;->᩻:[I

    .line 14
    invoke-virtual {p0}, Ll/ۡۗ᩻;->ۧ()V

    return-void
.end method

.method public static ֫(IIIIIII)I
    .locals 1

    and-int/2addr p2, p1

    not-int v0, p1

    and-int/2addr p3, v0

    or-int/2addr p2, p3

    .line 18
    invoke-static {p2, p4, p6, p0}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p0

    shl-int p2, p0, p5

    rsub-int/lit8 p3, p5, 0x20

    ushr-int/2addr p0, p3

    or-int/2addr p0, p2

    add-int/2addr p0, p1

    return p0
.end method

.method public static ֫(II[B)V
    .locals 2

    int-to-byte v0, p1

    .line 38
    aput-byte v0, p2, p0

    add-int/lit8 v0, p0, 0x1

    shr-int/lit8 v1, p1, 0x8

    int-to-byte v1, v1

    .line 39
    aput-byte v1, p2, v0

    add-int/lit8 v0, p0, 0x2

    shr-int/lit8 v1, p1, 0x10

    int-to-byte v1, v1

    .line 40
    aput-byte v1, p2, v0

    add-int/lit8 p0, p0, 0x3

    shr-int/lit8 p1, p1, 0x18

    int-to-byte p1, p1

    .line 41
    aput-byte p1, p2, p0

    return-void
.end method

.method private ֫(I[B)V
    .locals 40

    move-object/from16 v0, p0

    .line 45
    iget v1, v0, Ll/ۡۗ᩻;->ܽ:I

    .line 46
    iget v9, v0, Ll/ۡۗ᩻;->ᩳ:I

    .line 47
    iget v10, v0, Ll/ۡۗ᩻;->ܿ:I

    .line 48
    iget v8, v0, Ll/ۡۗ᩻;->ܳ:I

    const/4 v11, 0x0

    const/4 v2, 0x0

    move/from16 v2, p1

    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x10

    const/4 v12, 0x4

    const/16 v13, 0x8

    .line 50
    iget-object v14, v0, Ll/ۡۗ᩻;->᩻:[I

    if-ge v3, v4, :cond_0

    .line 51
    aget-byte v4, p2, v2

    and-int/lit16 v4, v4, 0xff

    add-int/lit8 v5, v2, 0x1

    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v4, v5

    add-int/lit8 v5, v2, 0x2

    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x10

    or-int/2addr v4, v5

    add-int/lit8 v5, v2, 0x3

    aget-byte v5, p2, v5

    and-int/lit16 v5, v5, 0xff

    shl-int/lit8 v5, v5, 0x18

    or-int/2addr v4, v5

    aput v4, v14, v3

    add-int/lit8 v3, v3, 0x1

    add-int/2addr v2, v12

    goto :goto_0

    .line 56
    :cond_0
    aget v5, v14, v11

    const/4 v6, 0x7

    const v7, -0x28955b88

    move v2, v9

    move v3, v10

    move v4, v8

    invoke-static/range {v1 .. v7}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v15

    const/4 v1, 0x1

    .line 57
    aget v6, v14, v1

    const/16 v7, 0xc

    const v16, -0x173848aa

    move v2, v8

    move v3, v15

    move v4, v9

    move v5, v10

    move/from16 v8, v16

    invoke-static/range {v2 .. v8}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v22

    const/16 v24, 0x2

    .line 58
    aget v6, v14, v24

    const/16 v7, 0x11

    const v8, 0x242070db

    move v2, v10

    move/from16 v3, v22

    move v4, v15

    move v5, v9

    invoke-static/range {v2 .. v8}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v25

    const/4 v10, 0x3

    .line 59
    aget v6, v14, v10

    const/16 v7, 0x16

    const v8, -0x3e423112

    move v2, v9

    move/from16 v3, v25

    move/from16 v4, v22

    move v5, v15

    invoke-static/range {v2 .. v8}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v2

    .line 60
    aget v19, v14, v12

    const/16 v20, 0x7

    const v21, -0xa83f051

    move/from16 v16, v2

    move/from16 v17, v25

    move/from16 v18, v22

    invoke-static/range {v15 .. v21}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v3

    const/4 v15, 0x5

    .line 61
    aget v21, v14, v15

    const/16 v4, 0xc

    const v23, 0x4787c62a

    move/from16 v17, v22

    move/from16 v18, v3

    move/from16 v19, v2

    move/from16 v20, v25

    move/from16 v22, v4

    invoke-static/range {v17 .. v23}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v16

    const/16 v17, 0x6

    .line 62
    aget v29, v14, v17

    const/16 v30, 0x11

    const v31, -0x57cfb9ed

    move/from16 v26, v16

    move/from16 v27, v3

    move/from16 v28, v2

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v18

    const/16 v19, 0x7

    .line 63
    aget v30, v14, v19

    const/16 v31, 0x16

    const v32, -0x2b96aff

    move/from16 v26, v2

    move/from16 v27, v18

    move/from16 v28, v16

    move/from16 v29, v3

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v2

    .line 64
    aget v7, v14, v13

    const/4 v8, 0x7

    const v9, 0x698098d8

    move v4, v2

    move/from16 v5, v18

    move/from16 v6, v16

    invoke-static/range {v3 .. v9}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v25

    const/16 v3, 0x9

    .line 65
    aget v30, v14, v3

    const/16 v31, 0xc

    const v32, -0x74bb0851

    move/from16 v26, v16

    move/from16 v27, v25

    move/from16 v28, v2

    move/from16 v29, v18

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v4

    const/16 v5, 0xa

    .line 66
    aget v36, v14, v5

    const/16 v37, 0x11

    const v38, -0xa44f

    move/from16 v32, v18

    move/from16 v33, v4

    move/from16 v34, v25

    move/from16 v35, v2

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v6

    const/16 v7, 0xb

    .line 67
    aget v37, v14, v7

    const/16 v38, 0x16

    const v39, -0x76a32842

    move/from16 v33, v2

    move/from16 v34, v6

    move/from16 v35, v4

    move/from16 v36, v25

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v2

    const/16 v8, 0xc

    .line 68
    aget v29, v14, v8

    const/16 v30, 0x7

    const v31, 0x6b901122

    move/from16 v26, v2

    move/from16 v27, v6

    move/from16 v28, v4

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v9

    const/16 v16, 0xd

    .line 69
    aget v37, v14, v16

    const/16 v38, 0xc

    const v39, -0x2678e6d

    move/from16 v33, v4

    move/from16 v34, v9

    move/from16 v35, v2

    move/from16 v36, v6

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v25

    const/16 v4, 0xe

    .line 70
    aget v30, v14, v4

    const/16 v31, 0x11

    const v32, -0x5986bc72

    move/from16 v26, v6

    move/from16 v27, v25

    move/from16 v28, v9

    move/from16 v29, v2

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v6

    const/16 v18, 0xf

    .line 71
    aget v30, v14, v18

    const/16 v31, 0x16

    const v32, 0x49b40821

    move/from16 v26, v2

    move/from16 v27, v6

    move/from16 v28, v25

    move/from16 v29, v9

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->֫(IIIIIII)I

    move-result v2

    .line 74
    aget v36, v14, v1

    const/16 v37, 0x5

    const v38, -0x9e1da9e

    move/from16 v32, v9

    move/from16 v33, v2

    move/from16 v34, v6

    move/from16 v35, v25

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v9

    .line 75
    aget v29, v14, v17

    const/16 v30, 0x9

    const v31, -0x3fbf4cc0

    move/from16 v26, v9

    move/from16 v27, v2

    move/from16 v28, v6

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v20

    .line 76
    aget v37, v14, v7

    const/16 v38, 0xe

    const v39, 0x265e5a51

    move/from16 v33, v6

    move/from16 v34, v20

    move/from16 v35, v9

    move/from16 v36, v2

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v25

    .line 77
    aget v37, v14, v11

    const/16 v38, 0x14

    const v39, -0x16493856

    move/from16 v33, v2

    move/from16 v34, v25

    move/from16 v35, v20

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v2

    .line 78
    aget v30, v14, v15

    const/16 v31, 0x5

    const v32, -0x29d0efa3

    move/from16 v27, v2

    move/from16 v28, v25

    move/from16 v29, v20

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v6

    .line 79
    aget v36, v14, v5

    const/16 v37, 0x9

    const v38, 0x2441453

    move/from16 v32, v20

    move/from16 v33, v6

    move/from16 v34, v2

    move/from16 v35, v25

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v9

    .line 80
    aget v29, v14, v18

    const/16 v30, 0xe

    const v31, -0x275e197f

    move/from16 v26, v9

    move/from16 v27, v6

    move/from16 v28, v2

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v20

    .line 81
    aget v30, v14, v12

    const/16 v31, 0x14

    const v32, -0x182c0438

    move/from16 v26, v2

    move/from16 v27, v20

    move/from16 v28, v9

    move/from16 v29, v6

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v2

    .line 82
    aget v37, v14, v3

    const/16 v38, 0x5

    const v39, 0x21e1cde6

    move/from16 v34, v2

    move/from16 v35, v20

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v25

    .line 83
    aget v30, v14, v4

    const/16 v31, 0x9

    const v32, -0x3cc8f82a

    move/from16 v26, v9

    move/from16 v27, v25

    move/from16 v28, v2

    move/from16 v29, v20

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v6

    .line 84
    aget v36, v14, v10

    const/16 v37, 0xe

    const v38, -0xb2af279

    move/from16 v32, v20

    move/from16 v33, v6

    move/from16 v34, v25

    move/from16 v35, v2

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v9

    .line 85
    aget v37, v14, v13

    const/16 v38, 0x14

    const v39, 0x455a14ed

    move/from16 v33, v2

    move/from16 v34, v9

    move/from16 v35, v6

    move/from16 v36, v25

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v2

    .line 86
    aget v29, v14, v16

    const/16 v30, 0x5

    const v31, -0x561c16fb

    move/from16 v26, v2

    move/from16 v27, v9

    move/from16 v28, v6

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v20

    .line 87
    aget v37, v14, v24

    const/16 v38, 0x9

    const v39, -0x3105c08

    move/from16 v33, v6

    move/from16 v34, v20

    move/from16 v35, v2

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v25

    .line 88
    aget v30, v14, v19

    const/16 v31, 0xe

    const v32, 0x676f02d9

    move/from16 v26, v9

    move/from16 v27, v25

    move/from16 v28, v20

    move/from16 v29, v2

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v6

    .line 89
    aget v30, v14, v8

    const/16 v31, 0x14

    const v32, -0x72d5b376

    move/from16 v26, v2

    move/from16 v27, v6

    move/from16 v28, v25

    move/from16 v29, v20

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ۧ(IIIIIII)I

    move-result v2

    .line 92
    aget v36, v14, v15

    const/16 v37, 0x4

    const v38, -0x5c6be

    move/from16 v32, v20

    move/from16 v33, v2

    move/from16 v34, v6

    move/from16 v35, v25

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v9

    .line 93
    aget v29, v14, v13

    const/16 v30, 0xb

    const v31, -0x788e097f

    move/from16 v26, v9

    move/from16 v27, v2

    move/from16 v28, v6

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v20

    .line 94
    aget v37, v14, v7

    const/16 v38, 0x10

    const v39, 0x6d9d6122

    move/from16 v33, v6

    move/from16 v34, v20

    move/from16 v35, v9

    move/from16 v36, v2

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v25

    .line 95
    aget v37, v14, v4

    const/16 v38, 0x17

    const v39, -0x21ac7f4

    move/from16 v33, v2

    move/from16 v34, v25

    move/from16 v35, v20

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v2

    .line 96
    aget v30, v14, v1

    const/16 v31, 0x4

    const v32, -0x5b4115bc

    move/from16 v27, v2

    move/from16 v28, v25

    move/from16 v29, v20

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v6

    .line 97
    aget v36, v14, v12

    const/16 v37, 0xb

    const v38, 0x4bdecfa9    # 2.9204306E7f

    move/from16 v32, v20

    move/from16 v33, v6

    move/from16 v34, v2

    move/from16 v35, v25

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v9

    .line 98
    aget v29, v14, v19

    const/16 v30, 0x10

    const v31, -0x944b4a0

    move/from16 v26, v9

    move/from16 v27, v6

    move/from16 v28, v2

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v20

    .line 99
    aget v30, v14, v5

    const/16 v31, 0x17

    const v32, -0x41404390

    move/from16 v26, v2

    move/from16 v27, v20

    move/from16 v28, v9

    move/from16 v29, v6

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v2

    .line 100
    aget v37, v14, v16

    const/16 v38, 0x4

    const v39, 0x289b7ec6

    move/from16 v34, v2

    move/from16 v35, v20

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v25

    .line 101
    aget v30, v14, v11

    const/16 v31, 0xb

    const v32, -0x155ed806

    move/from16 v26, v9

    move/from16 v27, v25

    move/from16 v28, v2

    move/from16 v29, v20

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v6

    .line 102
    aget v36, v14, v10

    const/16 v37, 0x10

    const v38, -0x2b10cf7b

    move/from16 v32, v20

    move/from16 v33, v6

    move/from16 v34, v25

    move/from16 v35, v2

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v9

    .line 103
    aget v37, v14, v17

    const/16 v38, 0x17

    const v39, 0x4881d05    # 3.2000097E-36f

    move/from16 v33, v2

    move/from16 v34, v9

    move/from16 v35, v6

    move/from16 v36, v25

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v2

    .line 104
    aget v29, v14, v3

    const/16 v30, 0x4

    const v31, -0x262b2fc7

    move/from16 v26, v2

    move/from16 v27, v9

    move/from16 v28, v6

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v20

    .line 105
    aget v37, v14, v8

    const/16 v38, 0xb

    const v39, -0x1924661b

    move/from16 v33, v6

    move/from16 v34, v20

    move/from16 v35, v2

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v25

    .line 106
    aget v30, v14, v18

    const/16 v31, 0x10

    const v32, 0x1fa27cf8

    move/from16 v26, v9

    move/from16 v27, v25

    move/from16 v28, v20

    move/from16 v29, v2

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v6

    .line 107
    aget v30, v14, v24

    const/16 v31, 0x17

    const v32, -0x3b53a99b

    move/from16 v26, v2

    move/from16 v27, v6

    move/from16 v28, v25

    move/from16 v29, v20

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ܽ(IIIIIII)I

    move-result v2

    .line 110
    aget v36, v14, v11

    const/16 v37, 0x6

    const v38, -0xbd6ddbc

    move/from16 v32, v20

    move/from16 v33, v2

    move/from16 v34, v6

    move/from16 v35, v25

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v9

    .line 111
    aget v29, v14, v19

    const/16 v30, 0xa

    const v31, 0x432aff97

    move/from16 v26, v9

    move/from16 v27, v2

    move/from16 v28, v6

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v11

    .line 112
    aget v37, v14, v4

    const/16 v38, 0xf

    const v39, -0x546bdc59

    move/from16 v33, v6

    move/from16 v34, v11

    move/from16 v35, v9

    move/from16 v36, v2

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v25

    .line 113
    aget v37, v14, v15

    const/16 v38, 0x15

    const v39, -0x36c5fc7

    move/from16 v33, v2

    move/from16 v34, v25

    move/from16 v35, v11

    move/from16 v36, v9

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v2

    .line 114
    aget v30, v14, v8

    const/16 v31, 0x6

    const v32, 0x655b59c3

    move/from16 v27, v2

    move/from16 v28, v25

    move/from16 v29, v11

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v4

    .line 115
    aget v36, v14, v10

    const/16 v37, 0xa

    const v38, -0x70f3336e

    move/from16 v32, v11

    move/from16 v33, v4

    move/from16 v34, v2

    move/from16 v35, v25

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v6

    .line 116
    aget v29, v14, v5

    const/16 v30, 0xf

    const v31, -0x100b83

    move/from16 v26, v6

    move/from16 v27, v4

    move/from16 v28, v2

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v5

    .line 117
    aget v30, v14, v1

    const/16 v31, 0x15

    const v32, -0x7a7ba22f

    move/from16 v26, v2

    move/from16 v27, v5

    move/from16 v28, v6

    move/from16 v29, v4

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v1

    .line 118
    aget v37, v14, v13

    const/16 v38, 0x6

    const v39, 0x6fa87e4f

    move/from16 v34, v1

    move/from16 v35, v5

    move/from16 v36, v6

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v25

    .line 119
    aget v30, v14, v18

    const/16 v31, 0xa

    const v32, -0x1d31920

    move/from16 v26, v6

    move/from16 v27, v25

    move/from16 v28, v1

    move/from16 v29, v5

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v2

    .line 120
    aget v36, v14, v17

    const/16 v37, 0xf

    const v38, -0x5cfebcec

    move/from16 v32, v5

    move/from16 v33, v2

    move/from16 v34, v25

    move/from16 v35, v1

    invoke-static/range {v32 .. v38}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v17

    .line 121
    aget v37, v14, v16

    const/16 v38, 0x15

    const v39, 0x4e0811a1    # 5.7071418E8f

    move/from16 v33, v1

    move/from16 v34, v17

    move/from16 v35, v2

    move/from16 v36, v25

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v1

    .line 122
    aget v29, v14, v12

    const/16 v30, 0x6

    const v31, -0x8ac817e

    move/from16 v26, v1

    move/from16 v27, v17

    move/from16 v28, v2

    invoke-static/range {v25 .. v31}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v4

    .line 123
    aget v37, v14, v7

    const/16 v38, 0xa

    const v39, -0x42c50dcb

    move/from16 v33, v2

    move/from16 v34, v4

    move/from16 v35, v1

    move/from16 v36, v17

    invoke-static/range {v33 .. v39}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v2

    .line 124
    aget v21, v14, v24

    const/16 v22, 0xf

    const v23, 0x2ad7d2bb

    move/from16 v18, v2

    move/from16 v19, v4

    move/from16 v20, v1

    invoke-static/range {v17 .. v23}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v5

    .line 125
    aget v30, v14, v3

    const/16 v31, 0x15

    const v32, -0x14792c6f

    move/from16 v27, v5

    move/from16 v28, v2

    move/from16 v29, v4

    invoke-static/range {v26 .. v32}, Ll/ۡۗ᩻;->ᩳ(IIIIIII)I

    move-result v1

    .line 127
    iget v3, v0, Ll/ۡۗ᩻;->ܽ:I

    add-int/2addr v3, v4

    iput v3, v0, Ll/ۡۗ᩻;->ܽ:I

    .line 128
    iget v3, v0, Ll/ۡۗ᩻;->ᩳ:I

    add-int/2addr v3, v1

    iput v3, v0, Ll/ۡۗ᩻;->ᩳ:I

    .line 129
    iget v1, v0, Ll/ۡۗ᩻;->ܿ:I

    add-int/2addr v1, v5

    iput v1, v0, Ll/ۡۗ᩻;->ܿ:I

    .line 130
    iget v1, v0, Ll/ۡۗ᩻;->ܳ:I

    add-int/2addr v1, v2

    iput v1, v0, Ll/ۡۗ᩻;->ܳ:I

    return-void
.end method

.method public static ۧ(IIIIIII)I
    .locals 1

    and-int v0, p1, p3

    not-int p3, p3

    and-int/2addr p2, p3

    or-int/2addr p2, v0

    .line 23
    invoke-static {p2, p4, p6, p0}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p0

    shl-int p2, p0, p5

    rsub-int/lit8 p3, p5, 0x20

    ushr-int/2addr p0, p3

    or-int/2addr p0, p2

    add-int/2addr p0, p1

    return p0
.end method

.method public static ܽ(IIIIIII)I
    .locals 0

    xor-int/2addr p2, p1

    xor-int/2addr p2, p3

    .line 28
    invoke-static {p2, p4, p6, p0}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p0

    shl-int p2, p0, p5

    rsub-int/lit8 p3, p5, 0x20

    ushr-int/2addr p0, p3

    or-int/2addr p0, p2

    add-int/2addr p0, p1

    return p0
.end method

.method public static ᩳ(IIIIIII)I
    .locals 0

    not-int p3, p3

    or-int/2addr p3, p1

    xor-int/2addr p2, p3

    .line 33
    invoke-static {p2, p4, p6, p0}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result p0

    shl-int p2, p0, p5

    rsub-int/lit8 p3, p5, 0x20

    ushr-int/2addr p0, p3

    or-int/2addr p0, p2

    add-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public final ֫([BII)V
    .locals 6

    .line 158
    iget-wide v0, p0, Ll/ۡۗ᩻;->ۧ:J

    const-wide/16 v2, 0x3f

    and-long/2addr v2, v0

    long-to-int v3, v2

    const/16 v2, 0x40

    rsub-int/lit8 v3, v3, 0x40

    int-to-long v4, p3

    add-long/2addr v0, v4

    .line 160
    iput-wide v0, p0, Ll/ۡۗ᩻;->ۧ:J

    :goto_0
    if-lez p3, :cond_2

    .line 163
    iget-object v0, p0, Ll/ۡۗ᩻;->֫:[B

    if-ge p3, v3, :cond_0

    sub-int/2addr v2, v3

    .line 164
    invoke-static {p1, p2, v0, v2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void

    :cond_0
    if-ne v3, v2, :cond_1

    .line 169
    invoke-direct {p0, p2, p1}, Ll/ۡۗ᩻;->֫(I[B)V

    goto :goto_1

    :cond_1
    rsub-int/lit8 v1, v3, 0x40

    .line 171
    invoke-static {p1, p2, v0, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v1, 0x0

    .line 172
    invoke-direct {p0, v1, v0}, Ll/ۡۗ᩻;->֫(I[B)V

    :goto_1
    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    const/16 v3, 0x40

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final ֫()[B
    .locals 7

    const/16 v0, 0x10

    new-array v0, v0, [B

    const/16 v1, 0x8

    new-array v2, v1, [B

    .line 194
    iget-wide v3, p0, Ll/ۡۗ᩻;->ۧ:J

    const/4 v5, 0x3

    shl-long/2addr v3, v5

    long-to-int v4, v3

    const/4 v3, 0x0

    invoke-static {v3, v4, v2}, Ll/ۡۗ᩻;->֫(II[B)V

    .line 195
    iget-wide v4, p0, Ll/ۡۗ᩻;->ۧ:J

    const/16 v6, 0x1d

    shr-long/2addr v4, v6

    long-to-int v5, v4

    const/4 v4, 0x4

    invoke-static {v4, v5, v2}, Ll/ۡۗ᩻;->֫(II[B)V

    .line 197
    iget-wide v5, p0, Ll/ۡۗ᩻;->ۧ:J

    long-to-int v6, v5

    and-int/lit8 v5, v6, 0x3f

    const/16 v6, 0x38

    if-ge v5, v6, :cond_0

    sub-int/2addr v6, v5

    goto :goto_0

    :cond_0
    rsub-int/lit8 v6, v5, 0x78

    .line 200
    :goto_0
    sget-object v5, Ll/ۡۗ᩻;->ۜ:[B

    invoke-virtual {p0, v5, v3, v6}, Ll/ۡۗ᩻;->֫([BII)V

    .line 201
    invoke-virtual {p0, v2, v3, v1}, Ll/ۡۗ᩻;->֫([BII)V

    .line 203
    iget v2, p0, Ll/ۡۗ᩻;->ܽ:I

    invoke-static {v3, v2, v0}, Ll/ۡۗ᩻;->֫(II[B)V

    .line 204
    iget v2, p0, Ll/ۡۗ᩻;->ᩳ:I

    invoke-static {v4, v2, v0}, Ll/ۡۗ᩻;->֫(II[B)V

    .line 205
    iget v2, p0, Ll/ۡۗ᩻;->ܿ:I

    invoke-static {v1, v2, v0}, Ll/ۡۗ᩻;->֫(II[B)V

    const/16 v1, 0xc

    .line 206
    iget v2, p0, Ll/ۡۗ᩻;->ܳ:I

    invoke-static {v1, v2, v0}, Ll/ۡۗ᩻;->֫(II[B)V

    .line 208
    invoke-virtual {p0}, Ll/ۡۗ᩻;->ۧ()V

    return-object v0
.end method

.method public final ֫([B)[B
    .locals 3

    .line 213
    invoke-virtual {p0, p1}, Ll/ۡۗ᩻;->ۧ([B)V

    .line 214
    invoke-virtual {p0}, Ll/ۡۗ᩻;->֫()[B

    move-result-object p1

    const/4 v0, 0x0

    .line 215
    aget-byte v1, p1, v0

    const/4 v2, 0x1

    if-nez v1, :cond_0

    .line 216
    aput-byte v2, p1, v0

    return-object p1

    :cond_0
    if-gez v1, :cond_2

    neg-int v1, v1

    int-to-byte v1, v1

    if-lez v1, :cond_1

    move v2, v1

    .line 219
    :cond_1
    aput-byte v2, p1, v0

    :cond_2
    return-object p1
.end method

.method public final ۧ()V
    .locals 3

    const-wide/16 v0, 0x0

    .line 134
    iput-wide v0, p0, Ll/ۡۗ᩻;->ۧ:J

    const v0, 0x67452301

    .line 136
    iput v0, p0, Ll/ۡۗ᩻;->ܽ:I

    const v0, -0x10325477

    .line 137
    iput v0, p0, Ll/ۡۗ᩻;->ᩳ:I

    const v0, -0x67452302

    .line 138
    iput v0, p0, Ll/ۡۗ᩻;->ܿ:I

    const v0, 0x10325476

    .line 139
    iput v0, p0, Ll/ۡۗ᩻;->ܳ:I

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    .line 144
    iget-object v2, p0, Ll/ۡۗ᩻;->᩻:[I

    aput v0, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ([B)V
    .locals 2

    const/4 v0, 0x0

    .line 182
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Ll/ۡۗ᩻;->֫([BII)V

    return-void
.end method
