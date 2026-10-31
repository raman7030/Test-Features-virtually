.class public final Ll/ۖᩴۡ;
.super Ljava/lang/Object;
.source "V4FO"


# static fields
.field private static final ᩺᩷᩵:[S


# instance fields
.field public final ֫:[B

.field public final ۧ:[S

.field public final ܽ:[I

.field public ᩳ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖᩴۡ;->᩺᩷᩵:[S

    return-void

    :array_0
    .array-data 2
        0x12ds
        0x778ds
        0x7780s
        0x77e4s
        0x77a9s
        0x77b1s
        0x77b7s
        0x77b0s
        0x77e4s
        0x77a6s
        0x77a1s
        0x77b0s
        0x77b3s
        0x77a1s
        0x77a1s
        0x77aas
        0x77e4s
        0x77f4s
        0x77bcs
        0x77f4s
        0x77f4s
        0x77e4s
        0x77b0s
        0x77abs
        0x77e4s
        0x77f4s
        0x77bcs
        0x7782s
        0x7782s
        0x778ds
        0x7780s
        0x77e4s
        0x77e4s
        0x77aas
        0x77abs
        0x77b0s
        0x77e4s
        0x77a2s
        0x77abs
        0x77b1s
        0x77aas
        0x77a0s
        0x77e4s
    .end array-data
.end method

.method public constructor <init>(Ljava/io/DataInputStream;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, 0x16909355

    sget v16, Ll/֨᩺;->ۨ֨۬:I

    sget v17, Ll/ۘۛ;->ۖۚ֡:I

    .line 68
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    const-string v18, "\u06e7\u1a75"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v17

    mul-int/lit8 v18, v18, -0x2b

    xor-int v2, v18, v16

    mul-int/lit16 v2, v2, -0x1cf1

    const v20, 0x3b7f8112

    xor-int v2, v2, v20

    const v20, -0x5819f9e0

    xor-int v18, v18, v20

    const/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v16

    mul-int/lit16 v15, v15, -0x7521

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v2, v15

    xor-int v15, v18, v2

    sparse-switch v15, :sswitch_data_0

    move/from16 v18, v15

    mul-int/lit8 v2, v5, 0x5

    add-int v8, v2, v4

    .line 65
    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v2, :cond_8

    goto/16 :goto_5

    :sswitch_0
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_1

    :cond_0
    move/from16 v18, v15

    goto/16 :goto_8

    :cond_1
    move/from16 v18, v15

    goto/16 :goto_4

    :sswitch_1
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v2, :cond_0

    :goto_1
    move/from16 v18, v15

    goto/16 :goto_6

    .line 26
    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v2, :cond_2

    goto :goto_1

    :cond_2
    move/from16 v18, v15

    goto/16 :goto_5

    .line 50
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto :goto_1

    .line 48
    :sswitch_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1}, Ljava/lang/RuntimeException;-><init>()V

    throw v1

    :sswitch_5
    add-int/lit8 v7, v7, 0x1

    move/from16 v18, v15

    goto/16 :goto_3

    .line 81
    :sswitch_6
    iget-object v2, v0, Ll/ۖᩴۡ;->ܽ:[I

    invoke-static/range {p1 .. p1}, Ll/֡֡;->ܳۛ֡(Ljava/lang/Object;)I

    move-result v18

    aput v18, v2, v7

    .line 76
    sget v2, Ll/᩺;->ۙۛܶ:I

    if-gtz v2, :cond_3

    move/from16 v18, v15

    goto :goto_2

    :cond_3
    const-string v2, "\u1a74\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x41

    move/from16 v18, v15

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0xded

    const v20, 0x219c0675

    xor-int v15, v15, v20

    const v20, 0x2fe3ce8e

    goto/16 :goto_9

    :sswitch_7
    move/from16 v18, v15

    int-to-short v2, v13

    .line 80
    aput-short v2, v10, v7

    .line 48
    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v2, :cond_4

    :goto_2
    const-string v2, "\u0733\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x3f

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, 0x421

    const v20, -0x590c4ad8

    xor-int v15, v15, v20

    const v20, 0x3b1c2b73

    goto/16 :goto_9

    :cond_4
    const-string v2, "\u1a73\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x7e35

    const v20, 0x7e3b883e

    xor-int v15, v15, v20

    const v20, 0x73424cdd

    goto/16 :goto_9

    :sswitch_8
    move/from16 v18, v15

    and-int v13, v11, v12

    .line 51
    sget-boolean v2, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v2, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v2, "\u1a74\u06d9"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x4b

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, -0x659d

    const v20, -0xc10423f

    xor-int v15, v15, v20

    const v20, 0x53be326f

    goto/16 :goto_9

    :sswitch_9
    move/from16 v18, v15

    .line 80
    iget-object v10, v0, Ll/ۖᩴۡ;->ۧ:[S

    invoke-virtual/range {p1 .. p1}, Ljava/io/InputStream;->read()I

    move-result v11

    const/16 v12, 0xff

    .line 3
    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v2, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v2, "\u06e1\u1a77"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, -0x743d

    const v20, -0xae0be9

    xor-int v15, v15, v20

    const v20, 0x22cb8478

    goto/16 :goto_9

    .line 84
    :sswitch_a
    new-array v2, v9, [B

    iput-object v2, v0, Ll/ۖᩴۡ;->֫:[B

    .line 85
    invoke-virtual {v1, v2}, Ljava/io/DataInputStream;->readFully([B)V

    return-void

    :sswitch_b
    move/from16 v18, v15

    sub-int v9, v14, v8

    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v2, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v2, "\u1a75\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, -0x546d

    const v20, -0x1aa2b7bf

    xor-int v15, v15, v20

    const v20, 0x77e8c54d

    goto/16 :goto_9

    :cond_8
    const-string v2, "\u1a7b\u06e0"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x4bbd

    const v20, -0x3012bf41

    xor-int v15, v15, v20

    const v20, 0x5083f554

    goto/16 :goto_9

    :sswitch_c
    move/from16 v18, v15

    if-ge v7, v5, :cond_9

    const-string v2, "\u0730\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0xb1

    const v20, -0x7cd0cfa2

    xor-int v15, v15, v20

    const v20, 0x24979d8c

    goto/16 :goto_9

    :cond_9
    const-string v2, "\u06d8\u06e1"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0x59

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, 0xf87

    const v20, -0x36c04301

    xor-int v15, v15, v20

    const v20, 0x3acf2d22

    goto/16 :goto_9

    :sswitch_d
    move/from16 v18, v15

    .line 72
    invoke-virtual {v1, v4}, Ljava/io/DataInputStream;->skipBytes(I)I

    add-int/lit8 v2, v19, -0x4

    move v14, v2

    goto/16 :goto_7

    :sswitch_e
    move/from16 v18, v15

    .line 78
    new-array v2, v5, [S

    iput-object v2, v0, Ll/ۖᩴۡ;->ۧ:[S

    const/4 v2, 0x0

    const/4 v7, 0x0

    :goto_3
    const-string v2, "\u1a79\u1a74"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x3f0f

    const v20, 0x1ae3a34f

    xor-int v15, v15, v20

    const v20, -0x7044c278

    goto/16 :goto_9

    :sswitch_f
    move/from16 v18, v15

    .line 77
    iput-object v6, v0, Ll/ۖᩴۡ;->ܽ:[I

    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_a

    :goto_4
    const-string v2, "\u1a78\u0736"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, -0x61

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, 0x61d9

    const v20, 0x4418854f

    xor-int v15, v15, v20

    const v20, -0x71706997

    goto/16 :goto_9

    :cond_a
    const-string v2, "\u06e8\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v16, v2

    mul-int/lit8 v2, v2, 0x9

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x6133

    const v20, -0x3f90ff8f

    xor-int v15, v15, v20

    const v20, -0x3586f452    # -4080363.5f

    goto/16 :goto_9

    :sswitch_10
    move/from16 v18, v15

    new-array v6, v5, [I

    .line 62
    sget v2, Ll/֡֡;->֫ۤܳ:I

    if-ltz v2, :cond_b

    :goto_5
    const-string v2, "\u0733\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x43

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, 0x2e9f

    const v20, 0x4262f907

    xor-int v15, v15, v20

    const v20, -0x7ad6906f

    goto/16 :goto_9

    :cond_b
    const-string v2, "\u06ec\u06d7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, -0x5985

    const v20, -0x79e2b5c3

    xor-int v15, v15, v20

    const v20, -0x5b986787

    goto/16 :goto_9

    :sswitch_11
    move/from16 v18, v15

    .line 75
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readShort()S

    .line 76
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v5

    .line 20
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v2

    if-eqz v2, :cond_c

    :goto_6
    const-string v2, "\u1a7b\u06d8"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, -0x29ad

    const v20, 0x70927e44

    xor-int v15, v15, v20

    const v20, -0x6a18ee59

    goto/16 :goto_9

    :cond_c
    const-string v2, "\u1a76\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x7879

    const v20, 0x5e54eb31

    xor-int v15, v15, v20

    const v20, -0x6dc5093e

    goto :goto_9

    :sswitch_12
    move/from16 v18, v15

    const/16 v2, 0x70

    const/4 v4, 0x4

    if-le v3, v2, :cond_d

    const-string v2, "\u06d6\u06d8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v17

    mul-int/lit8 v2, v2, -0x7b

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, 0x2fa9

    const v20, -0x6369e6ac

    xor-int v15, v15, v20

    const v20, -0x58f48134

    goto :goto_9

    :cond_d
    move/from16 v14, v19

    :goto_7
    const-string v2, "\u0733\u1a75"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, -0x206f

    const v20, -0x3ee0c834

    xor-int v15, v15, v20

    const v20, -0x699e79c9

    goto :goto_9

    :sswitch_13
    move/from16 v18, v15

    .line 69
    invoke-static/range {p1 .. p1}, Ll/֡֡;->ܳۛ֡(Ljava/lang/Object;)I

    move-result v19

    .line 70
    invoke-virtual/range {p1 .. p1}, Ljava/io/DataInputStream;->readByte()B

    move-result v3

    .line 76
    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v2, :cond_e

    :goto_8
    const-string v2, "\u06d8\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v16

    mul-int/lit8 v2, v2, 0x19

    xor-int v15, v2, v17

    mul-int/lit16 v15, v15, 0x86d

    const v20, -0x39cac07

    xor-int v15, v15, v20

    const v20, 0xfe3df18

    goto :goto_9

    :cond_e
    const-string v2, "\u06d9\u06d7"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v15, v2, v16

    mul-int/lit16 v15, v15, 0x3e1d

    const v20, -0x6b9ddfd4

    xor-int v15, v15, v20

    const v20, 0x28eddb22

    :goto_9
    xor-int v2, v2, v20

    move/from16 v21, v18

    move/from16 v18, v2

    move v2, v15

    move/from16 v15, v21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x74aa74c6 -> :sswitch_0
        -0x72415791 -> :sswitch_7
        -0x6ea61bf3 -> :sswitch_2
        -0x6e3327d9 -> :sswitch_3
        -0x579f0ae3 -> :sswitch_e
        -0x4f32953c -> :sswitch_2
        -0x4607b947 -> :sswitch_9
        -0x3d41f209 -> :sswitch_f
        -0x34e5a161 -> :sswitch_4
        -0x338d56f9 -> :sswitch_c
        -0x2e0c9c17 -> :sswitch_10
        -0x2a545bff -> :sswitch_11
        -0x21f27981 -> :sswitch_1
        -0x116d3057 -> :sswitch_8
        -0xcc29d01 -> :sswitch_4
        0x4ec7e66 -> :sswitch_12
        0x1132b6f6 -> :sswitch_a
        0x11477192 -> :sswitch_7
        0x134a1505 -> :sswitch_b
        0x19a1f174 -> :sswitch_5
        0x1ca9117a -> :sswitch_10
        0x1de1e2a6 -> :sswitch_b
        0x1ebe592f -> :sswitch_13
        0x2a377bcb -> :sswitch_1
        0x3051ee28 -> :sswitch_13
        0x308baec7 -> :sswitch_6
        0x323ba00f -> :sswitch_d
        0x34d7094a -> :sswitch_a
        0x427225b4 -> :sswitch_f
        0x433bd24c -> :sswitch_5
        0x4412232b -> :sswitch_8
        0x4e3448d9 -> :sswitch_12
        0x51d331cc -> :sswitch_6
        0x5c44556f -> :sswitch_0
        0x608ae3b2 -> :sswitch_e
        0x675da3be -> :sswitch_9
        0x6b8edd4e -> :sswitch_11
        0x784c643e -> :sswitch_3
        0x7b55f582 -> :sswitch_c
        0x7ca5c634 -> :sswitch_d
    .end sparse-switch
.end method

.method public constructor <init>([B)V
    .locals 6

    const v0, -0x147b3d19

    sget v1, Ll/֡۬;->۠֡᩶:I

    sget v2, Ll/ۘ᩻;->᩵ۜ֨:I

    .line 65
    new-instance v3, Ljava/io/DataInputStream;

    new-instance v4, Ll/᩵ܺᩴ;

    .line 71
    array-length v5, p1

    invoke-direct {v4, p1, v5}, Ll/᩵ܺᩴ;-><init>([BI)V

    .line 65
    invoke-direct {v3, v4}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v3}, Ll/ۖᩴۡ;-><init>(Ljava/io/DataInputStream;)V

    const-string p1, "\u06e1\u0736"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, -0x7bcb

    const v4, 0x464f2db6

    xor-int/2addr v3, v4

    const v4, -0x56d058e0

    :goto_0
    xor-int/2addr p1, v4

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x4b1d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v3

    xor-int/2addr v0, p1

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_0
    sget p1, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez p1, :cond_0

    goto :goto_1

    :cond_0
    const-string p1, "\u06df\u06ec"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, 0x62d1

    const v4, 0x304e03a

    xor-int/2addr v3, v4

    const v4, 0x7f6a072f

    goto :goto_0

    .line 5
    :sswitch_1
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    sget p1, Ll/֡᩶;->ܳܶ۠:I

    if-gtz p1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "\u1a7a\u06db"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, -0x5e9

    const v4, 0x3ccc24af

    xor-int/2addr v3, v4

    const v4, -0x3ab109e

    goto :goto_0

    .line 8
    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const-string p1, "\u05ab\u1a76"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    add-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x2d

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, -0x2f7f

    const v4, 0x7c7c776b

    xor-int/2addr v3, v4

    const v4, 0x1eb66b8

    goto :goto_0

    .line 34
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    :goto_1
    const-string p1, "\u06d9\u1a79"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    sub-int p1, v2, p1

    mul-int/lit8 p1, p1, -0x53

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, 0x3013

    const v4, -0xa0e26b4

    xor-int/2addr v3, v4

    const v4, 0x11a77418

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_5
    sget p1, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz p1, :cond_3

    const-string p1, "\u1a77\u06e1"

    invoke-static {p1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v2

    xor-int v3, p1, v1

    mul-int/lit16 v3, v3, 0x77d5

    const v4, 0x5feb0fda

    xor-int/2addr v3, v4

    const v4, -0x17db544f

    goto/16 :goto_0

    :cond_3
    const-string p1, "\u1a79\u073a"

    invoke-static {p1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result p1

    xor-int/2addr p1, v1

    mul-int/lit8 p1, p1, 0x23

    xor-int v3, p1, v2

    mul-int/lit16 v3, v3, 0x506d

    const v4, 0x6380795c

    xor-int/2addr v3, v4

    const v4, 0x12cc502

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7fb3f5aa -> :sswitch_0
        -0x4f7fa903 -> :sswitch_1
        -0x4e3bc7ac -> :sswitch_5
        -0x4dc0db12 -> :sswitch_5
        -0x37f40215 -> :sswitch_2
        -0x2384462d -> :sswitch_0
        0x84d0616 -> :sswitch_4
        0x3e8dfa7c -> :sswitch_2
        0x60953604 -> :sswitch_3
        0x66e443a2 -> :sswitch_4
        0x67819fc3 -> :sswitch_1
        0x737ac2fb -> :sswitch_3
    .end sparse-switch
.end method

.method private ֫()I
    .locals 22

    move-object/from16 v0, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, 0x220cb874

    sget v17, Ll/ۘۘ;->᩷ۙ᩸:I

    sget v18, Ll/᩺;->ۙۛܶ:I

    const-string v19, "\u06e0\u073a"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    add-int v19, v19, v17

    mul-int/lit8 v19, v19, -0xb

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, 0x4a37

    const v21, -0x4df1a071

    xor-int v1, v1, v21

    const v21, 0x318e555e

    xor-int v19, v19, v21

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_0
    xor-int v2, v16, v18

    mul-int/lit16 v2, v2, 0x4daf

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v1, v2

    xor-int v16, v19, v1

    sparse-switch v16, :sswitch_data_0

    .line 102
    aget-byte v1, v3, v20

    and-int/lit16 v4, v1, 0xff

    const/4 v5, 0x2

    .line 25
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_a

    goto/16 :goto_9

    .line 73
    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v1, :cond_7

    :cond_0
    :goto_1
    move/from16 v2, v21

    goto/16 :goto_6

    .line 0
    :sswitch_1
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v1, Ll/ۛ;->᩺᩻֫:I

    if-gez v1, :cond_4

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_9

    .line 52
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_9

    .line 22
    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    const/4 v1, 0x0

    return v1

    :sswitch_5
    and-int v1, v14, v15

    shl-int/lit8 v1, v1, 0x18

    or-int/2addr v1, v13

    return v1

    :sswitch_6
    add-int/lit8 v1, v20, 0x4

    .line 102
    iput v1, v0, Ll/ۖᩴۡ;->ᩳ:I

    aget-byte v14, v3, v10

    const/16 v15, 0xff

    .line 55
    sget-boolean v1, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v1, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v1, "\u1a73\u1a73"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x61

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x5681

    const v19, -0x736aee1a

    xor-int v2, v2, v19

    const v19, -0x7ef03725

    goto/16 :goto_5

    :sswitch_7
    and-int v1, v11, v12

    shl-int/lit8 v1, v1, 0x10

    or-int v13, v9, v1

    .line 86
    sget-boolean v1, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const-string v1, "\u06e2\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x16bd

    const v19, 0x34b87899

    xor-int v2, v2, v19

    const v19, -0x15cd8a01

    goto/16 :goto_5

    .line 102
    :sswitch_8
    aget-byte v11, v3, v6

    const/16 v12, 0xff

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    const-string v1, "\u06df\u1a77"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x177b

    const v19, -0x6fb5cf80

    xor-int v2, v2, v19

    const v19, 0x761eac8c

    goto/16 :goto_5

    :sswitch_9
    add-int/lit8 v10, v20, 0x3

    iput v10, v0, Ll/ۖᩴۡ;->ᩳ:I

    .line 72
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    :goto_2
    const-string v1, "\u06da\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x4f85

    const v19, -0x39c48c7f

    xor-int v2, v2, v19

    const v19, 0x7745f364

    goto/16 :goto_5

    :cond_5
    const-string v1, "\u06ec\u1a78"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x73

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, 0x72f5

    const v19, 0x11f2af58

    xor-int v2, v2, v19

    const v19, 0x3f512a8c

    goto/16 :goto_5

    :sswitch_a
    shl-int/lit8 v1, v8, 0x8

    or-int v9, v1, v4

    .line 17
    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v1, :cond_6

    goto :goto_4

    :cond_6
    const-string v1, "\u06da\u05a1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x5

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x2e7b

    const v19, -0x2fb02b70

    xor-int v2, v2, v19

    const v19, 0x28d84e2c

    goto/16 :goto_5

    :sswitch_b
    and-int/lit16 v8, v7, 0xff

    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_8

    :cond_7
    :goto_3
    const-string v1, "\u073f\u06db"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x73a3

    const v19, 0x34fa1e09

    xor-int v2, v2, v19

    const v19, -0x41c15092

    goto :goto_5

    :cond_8
    const-string v1, "\u06e7\u1a77"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x71

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x1933

    const v19, 0x66b1af4e

    xor-int v2, v2, v19

    const v19, -0x26975a7d

    goto :goto_5

    :sswitch_c
    add-int v6, v20, v5

    .line 102
    iput v6, v0, Ll/ۖᩴۡ;->ᩳ:I

    aget-byte v7, v3, v21

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v1

    if-gtz v1, :cond_9

    :goto_4
    const-string v1, "\u0733\u06e8"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x2ddd

    const v19, -0x30251c49

    xor-int v2, v2, v19

    const v19, 0x15a78e9b

    goto :goto_5

    :cond_9
    const-string v1, "\u073d\u1a76"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0xb

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x79f1

    const v19, -0x1600525f

    xor-int v2, v2, v19

    const v19, -0x7a82a25e

    goto :goto_5

    :cond_a
    const-string v1, "\u06e2\u06e0"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x5f2d

    const v19, -0xcdcd73d

    xor-int v2, v2, v19

    const v19, -0x2ceca4bf

    :goto_5
    xor-int v19, v1, v19

    goto :goto_8

    :sswitch_d
    move/from16 v2, v21

    iput v2, v0, Ll/ۖᩴۡ;->ᩳ:I

    iget-object v3, v0, Ll/ۖᩴۡ;->֫:[B

    .line 77
    sget v1, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v1, :cond_b

    :goto_6
    const-string v1, "\u1a76\u05ab"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    move/from16 v19, v2

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x3931

    const v21, 0x1b9f9c5

    xor-int v2, v2, v21

    const v21, -0x355e1f3f    # -5304416.5f

    goto :goto_7

    :cond_b
    move/from16 v19, v2

    const-string v1, "\u06e8\u06d9"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x4b

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x283

    const v21, -0x2e7aec2

    xor-int v2, v2, v21

    const v21, 0x25ba4c5

    :goto_7
    xor-int v1, v1, v21

    move/from16 v21, v19

    move/from16 v19, v1

    :goto_8
    move v1, v2

    goto/16 :goto_0

    .line 102
    :sswitch_e
    iget v1, v0, Ll/ۖᩴۡ;->ᩳ:I

    add-int/lit8 v21, v1, 0x1

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v2, :cond_c

    move/from16 v20, v1

    :goto_9
    const-string v1, "\u0733\u073a"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v18

    mul-int/lit8 v1, v1, -0x79

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x5a4d

    const v19, 0x16fde2ab

    xor-int v2, v2, v19

    const v19, 0x22c9e362

    goto :goto_5

    :cond_c
    const-string v2, "\u05a8\u06db"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v0, v2, v17

    mul-int/lit16 v0, v0, -0x79e9

    const v19, 0x5774af31

    xor-int v0, v0, v19

    const v19, 0x13609a17

    xor-int v19, v2, v19

    move/from16 v20, v1

    move v1, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c3d16f0 -> :sswitch_2
        -0x76e2bb19 -> :sswitch_6
        -0x7422b10f -> :sswitch_1
        -0x6d4ef712 -> :sswitch_a
        -0x6b9b08ae -> :sswitch_e
        -0x5d8b7192 -> :sswitch_1
        -0x5a72c49c -> :sswitch_4
        -0x4434b2de -> :sswitch_5
        -0x3c5eb5a1 -> :sswitch_8
        -0x39757f27 -> :sswitch_7
        -0x2a342634 -> :sswitch_b
        -0x293e1e90 -> :sswitch_a
        -0x25ab2abe -> :sswitch_9
        -0x202e633b -> :sswitch_6
        -0x1edf569d -> :sswitch_0
        -0x182ce9e4 -> :sswitch_2
        -0x13315017 -> :sswitch_3
        -0xc076073 -> :sswitch_d
        0x45cf8dd -> :sswitch_9
        0xfe706c1 -> :sswitch_c
        0x18142061 -> :sswitch_8
        0x1ff6d0c0 -> :sswitch_b
        0x24444f9e -> :sswitch_4
        0x26832ac7 -> :sswitch_d
        0x27944692 -> :sswitch_c
        0x29bee5f6 -> :sswitch_5
        0x3e2518d9 -> :sswitch_3
        0x43fd4517 -> :sswitch_7
        0x4faf67ad -> :sswitch_e
        0x5c47e665 -> :sswitch_0
    .end sparse-switch
.end method

.method private ᩳ(I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const v12, -0x3f5f958

    sget v13, Ll/֨۬;->۫ۙ᩺:I

    sget v14, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v15, "\u05a8\u0730"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v14

    xor-int v2, v15, v13

    mul-int/lit16 v2, v2, -0x395b

    const v17, -0x5ef9ba8

    xor-int v2, v2, v17

    const v17, 0x75b3bd9d

    xor-int v15, v15, v17

    const/16 v16, 0x0

    :goto_0
    xor-int/2addr v12, v13

    mul-int/lit16 v12, v12, -0x710d

    shr-int/lit8 v12, v12, 0x1f

    and-int/2addr v2, v12

    xor-int v12, v15, v2

    sparse-switch v12, :sswitch_data_0

    .line 76
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    return-void

    .line 66
    :sswitch_0
    sget-boolean v2, Ll/֨۫;->۬᩷᩶:Z

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v19, v5

    move/from16 v17, v12

    goto/16 :goto_e

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v2, Ll/֨۟;->᩹֫᩷:I

    if-nez v2, :cond_1

    goto :goto_2

    :cond_1
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v2, :cond_2

    :goto_1
    move-object/from16 v18, v4

    move/from16 v17, v12

    goto/16 :goto_c

    :cond_2
    :goto_2
    const-string v2, "\u05ab\u06d6"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v15, v2, v14

    mul-int/lit16 v15, v15, -0x124b

    const v17, -0x52bcf906

    xor-int v15, v15, v17

    const v17, -0x1b3c09eb

    goto :goto_3

    .line 121
    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    goto :goto_1

    .line 148
    :sswitch_4
    iget-object v1, v0, Ll/ۖᩴۡ;->ܽ:[I

    aget v1, v1, v3

    iput v1, v0, Ll/ۖᩴۡ;->ᩳ:I

    return-void

    :sswitch_5
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    goto/16 :goto_6

    .line 147
    :sswitch_6
    aget-short v2, v16, v3

    if-ne v2, v1, :cond_3

    const-string v2, "\u06e8\u05ab"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x7267

    const v17, -0x16861c9a

    xor-int v15, v15, v17

    const v17, 0x670302fe

    goto :goto_3

    :cond_3
    const-string v2, "\u1a77\u1a79"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x73

    xor-int v15, v2, v13

    mul-int/lit16 v15, v15, 0x129b

    const v17, 0x3f208f3a

    xor-int v15, v15, v17

    const v17, -0x43668849

    :goto_3
    xor-int v2, v2, v17

    move/from16 v20, v15

    move v15, v2

    move/from16 v2, v20

    goto/16 :goto_0

    .line 152
    :sswitch_7
    new-instance v2, Ljava/lang/RuntimeException;

    sget-object v15, Ll/ۖᩴۡ;->᩺᩷᩵:[S

    move/from16 v17, v12

    .line 0
    sget v18, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v18, :cond_4

    move-object/from16 v18, v4

    goto/16 :goto_c

    :cond_4
    const/4 v12, 0x3

    .line 3
    sget-boolean v19, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v19, :cond_5

    move-object/from16 v18, v4

    goto :goto_4

    :cond_5
    move-object/from16 v18, v4

    const/16 v4, 0x1d

    .line 152
    invoke-static {v15, v4, v12, v11}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v12, Ll/ۖᩴۡ;->᩺᩷᩵:[S

    const/16 v15, 0x20

    .line 42
    sget v19, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v19, :cond_6

    :goto_4
    move/from16 v19, v5

    goto/16 :goto_8

    :cond_6
    move/from16 v19, v5

    const/16 v5, 0xb

    .line 152
    invoke-static {v12, v15, v5, v11}, Ll/֫ܺ;->᩶֡ۤ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 0
    invoke-static {v1, v4, v5}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 146
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_7

    goto/16 :goto_9

    .line 152
    :cond_7
    invoke-static/range {v16 .. v16}, Ljava/util/Arrays;->toString([S)Ljava/lang/String;

    move-result-object v5

    .line 50
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v12

    if-ltz v12, :cond_8

    goto/16 :goto_8

    .line 152
    :cond_8
    invoke-static {v4, v5}, Ll/ۗ۬;->ۢۗܽ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-static {v4}, Ll/֡֡;->᩻ۗۖ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_8
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    .line 146
    iget-object v2, v0, Ll/ۖᩴۡ;->ۧ:[S

    array-length v4, v2

    if-ge v3, v4, :cond_9

    const-string v4, "\u1a73\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v13

    mul-int/lit8 v4, v4, -0x39

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, 0x2b85

    const v12, -0x56f9b15d

    xor-int/2addr v5, v12

    const v12, 0x11b3780c

    goto :goto_5

    :cond_9
    const-string v4, "\u1a73\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    xor-int v5, v4, v14

    mul-int/lit16 v5, v5, 0x31b

    const v12, 0x393c1801

    xor-int/2addr v5, v12

    const v12, -0x42016a27

    :goto_5
    xor-int v15, v4, v12

    move-object/from16 v16, v2

    move v2, v5

    goto/16 :goto_b

    :sswitch_9
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_6
    const-string v2, "\u06e8\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x7f

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, -0x250f

    const v5, 0x524874b5

    xor-int/2addr v4, v5

    const v5, 0x7fc5b6e0

    goto/16 :goto_a

    :sswitch_a
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    const/16 v2, 0xff

    if-gt v1, v2, :cond_b

    const-string v2, "\u1a76\u06e8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, -0x29

    xor-int v4, v2, v14

    mul-int/lit16 v4, v4, 0x399d

    const v5, 0x6f66c369

    xor-int/2addr v4, v5

    const v5, 0x4e722291

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    .line 145
    new-instance v2, Ljava/lang/RuntimeException;

    sget-object v4, Ll/ۖᩴۡ;->᩺᩷᩵:[S

    const/4 v5, 0x1

    .line 60
    sget v12, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v12, :cond_a

    move-object/from16 v4, v18

    goto/16 :goto_e

    :cond_a
    const/16 v1, 0x1c

    .line 145
    invoke-static {v4, v5, v1, v11}, Ll/ۗ᩺;->۫ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v2

    :sswitch_c
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    if-ltz v1, :cond_b

    const-string v2, "\u1a77\u06da"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int/2addr v2, v14

    mul-int/lit8 v2, v2, -0x55

    xor-int v4, v2, v13

    mul-int/lit8 v4, v4, 0x2f

    const v5, -0x658f50e6

    xor-int/2addr v4, v5

    const v5, 0x6534ded3

    goto/16 :goto_a

    :cond_b
    const-string v2, "\u06db\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v4, v2, v14

    mul-int/lit16 v4, v4, -0x5b9f

    const v5, -0xa0cc34b

    xor-int/2addr v4, v5

    const v5, -0x61d78b63

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    const v2, 0xc86f

    const v11, 0xc86f

    goto :goto_7

    :sswitch_e
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    const/16 v2, 0x77c4

    const/16 v11, 0x77c4

    :goto_7
    const-string v2, "\u06ec\u073a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x167b

    const v5, 0x762a9a2d

    xor-int/2addr v4, v5

    const v5, 0x673b8128

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    add-int v2, v9, v10

    add-int/2addr v2, v2

    sub-int/2addr v2, v8

    if-gez v2, :cond_c

    const-string v2, "\u1a76\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v4, v2, v14

    mul-int/lit16 v4, v4, 0x76b

    const v5, -0x61122865

    xor-int/2addr v4, v5

    const v5, 0x590b037f

    goto/16 :goto_a

    :cond_c
    const-string v2, "\u06eb\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    mul-int/lit8 v2, v2, 0x57

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x969

    const v5, 0x6863d1dc

    xor-int/2addr v4, v5

    const v5, 0x781bda7c

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    mul-int v8, v7, v7

    mul-int v9, v6, v6

    const v10, 0xa349149

    .line 40
    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v2, :cond_d

    :goto_8
    const-string v2, "\u06e7\u073a"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, -0x69

    xor-int v4, v2, v14

    mul-int/lit16 v4, v4, 0x3fa7

    const v5, 0x6864a047

    xor-int/2addr v4, v5

    const v5, -0x2a640c5d

    goto :goto_a

    :cond_d
    const-string v2, "\u0733\u06e4"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v13, v2

    mul-int/lit8 v2, v2, 0x5d

    xor-int v4, v2, v14

    mul-int/lit16 v4, v4, 0x2f89

    const v5, 0x129181cc

    xor-int/2addr v4, v5

    const v5, 0x5ae4d30e

    goto :goto_a

    :sswitch_11
    move-object/from16 v18, v4

    move/from16 v19, v5

    move/from16 v17, v12

    aget-short v6, v18, v19

    add-int/lit16 v7, v6, 0x331d

    .line 5
    sget v2, Ll/֨۟;->᩹֫᩷:I

    if-eqz v2, :cond_e

    :goto_9
    const-string v2, "\u05ab\u1a79"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x541d

    const v5, -0x7d16872e

    xor-int/2addr v4, v5

    const v5, 0x660b6624

    goto :goto_a

    :cond_e
    const-string v2, "\u06dc\u05ab"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x2d51

    const v5, -0x458d9407

    xor-int/2addr v4, v5

    const v5, -0xd366f3c

    :goto_a
    xor-int v15, v2, v5

    move v2, v4

    :goto_b
    move/from16 v12, v17

    move-object/from16 v4, v18

    goto/16 :goto_10

    :sswitch_12
    move-object/from16 v18, v4

    move/from16 v17, v12

    const/4 v5, 0x0

    .line 77
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v2

    if-eqz v2, :cond_f

    :goto_c
    const-string v2, "\u06eb\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    mul-int/lit8 v2, v2, 0x4f

    xor-int v4, v2, v14

    mul-int/lit16 v4, v4, 0x1e2f

    const v12, -0x3f37f1a5

    xor-int/2addr v4, v12

    const v12, 0x53b66650

    goto :goto_d

    :cond_f
    const-string v2, "\u1a79\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v14, v2

    mul-int/lit8 v2, v2, -0x6b

    xor-int v4, v2, v13

    mul-int/lit16 v4, v4, 0x39f5

    const v12, 0x3d4954d4

    xor-int/2addr v4, v12

    const v12, -0x2aa85c1c

    :goto_d
    xor-int v15, v2, v12

    move v2, v4

    move/from16 v12, v17

    move-object/from16 v4, v18

    goto/16 :goto_0

    :sswitch_13
    move/from16 v19, v5

    move/from16 v17, v12

    sget-object v4, Ll/ۖᩴۡ;->᩺᩷᩵:[S

    .line 34
    sget v2, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v2, :cond_10

    :goto_e
    const-string v2, "\u06e0\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v14

    xor-int v5, v2, v13

    mul-int/lit16 v5, v5, 0x72ff

    const v12, -0x115d3e0f

    xor-int/2addr v5, v12

    const v12, -0xece9072

    goto :goto_f

    :cond_10
    const-string v2, "\u1a78\u1a78"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v13

    xor-int v5, v2, v14

    mul-int/lit16 v5, v5, -0x2df

    const v12, 0x7082698b

    xor-int/2addr v5, v12

    const v12, -0x2fa33a10

    :goto_f
    xor-int v15, v2, v12

    move v2, v5

    move/from16 v12, v17

    :goto_10
    move/from16 v5, v19

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x72fae2ef -> :sswitch_a
        -0x717fc749 -> :sswitch_9
        -0x69535688 -> :sswitch_b
        -0x5bad269f -> :sswitch_13
        -0x556fa2ea -> :sswitch_13
        -0x543e00b7 -> :sswitch_1
        -0x52f07c10 -> :sswitch_e
        -0x4dcf37f4 -> :sswitch_11
        -0x4a86547c -> :sswitch_7
        -0x47e7f51b -> :sswitch_c
        -0x47df70c2 -> :sswitch_4
        -0x46d705f7 -> :sswitch_2
        -0x403ceb7f -> :sswitch_f
        -0x3245db51 -> :sswitch_c
        -0x272472c8 -> :sswitch_12
        -0x1ce9a0d9 -> :sswitch_0
        -0x1c953015 -> :sswitch_b
        -0x13b8b8aa -> :sswitch_3
        -0x12d2e695 -> :sswitch_9
        -0x5ff72f9 -> :sswitch_5
        0x3c72d0d -> :sswitch_8
        0x8515701 -> :sswitch_6
        0xeb97560 -> :sswitch_4
        0x27d5a86f -> :sswitch_7
        0x2dea1c88 -> :sswitch_10
        0x2e12e27b -> :sswitch_1
        0x329ba491 -> :sswitch_8
        0x36eb5fc8 -> :sswitch_e
        0x38112fb5 -> :sswitch_10
        0x428881ec -> :sswitch_3
        0x4d47ec75 -> :sswitch_f
        0x518c3f97 -> :sswitch_d
        0x562b4fdd -> :sswitch_a
        0x56e24e2a -> :sswitch_2
        0x57a87b40 -> :sswitch_0
        0x608e27e4 -> :sswitch_6
        0x68cabdad -> :sswitch_11
        0x6fc4f535 -> :sswitch_d
        0x77927398 -> :sswitch_12
        0x780da55a -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(I)Z
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5696b9b

    sget v3, Ll/ۖ;->᩹۟ۘ:I

    sget v4, Ll/ۗ᩵;->֫۠۟:I

    const-string v5, "\u05ab\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x11

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x47ff

    const v7, 0x445b856e

    xor-int/2addr v6, v7

    const v7, -0x6c591df8

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x2c9d

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 47
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_d

    goto/16 :goto_4

    :sswitch_0
    sget v5, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v5, :cond_9

    goto/16 :goto_3

    .line 12
    :sswitch_1
    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    .line 81
    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v5

    if-nez v5, :cond_c

    goto/16 :goto_3

    .line 110
    :sswitch_3
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    const/4 p1, 0x0

    return p1

    :sswitch_5
    const/4 p1, 0x1

    return p1

    :sswitch_6
    const/4 p1, 0x0

    return p1

    .line 111
    :sswitch_7
    iget-object v5, p0, Ll/ۖᩴۡ;->֫:[B

    aget-byte v5, v5, v0

    if-eqz v5, :cond_0

    const-string v5, "\u0736\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x7f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1267

    const v7, -0x571fa8a7

    xor-int/2addr v6, v7

    const v7, -0x35da023

    goto :goto_0

    :cond_0
    const-string v5, "\u06db\u06e7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x560b

    const v7, -0x11c8249b

    xor-int/2addr v6, v7

    const v7, -0x60992c6

    goto :goto_0

    :sswitch_8
    add-int v5, v0, v1

    iput v5, p0, Ll/ۖᩴۡ;->ᩳ:I

    .line 55
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_1

    goto :goto_1

    :cond_1
    const-string v5, "\u1a76\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5cb3

    const v7, 0x2f4d0e12

    xor-int/2addr v6, v7

    const v7, -0x514e16ee

    goto/16 :goto_0

    .line 111
    :sswitch_9
    iget v0, p0, Ll/ۖᩴۡ;->ᩳ:I

    const/4 v1, 0x1

    .line 52
    sget v5, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v5, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v5, "\u06e2\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x16b7

    const v7, -0x426ea556

    xor-int/2addr v6, v7

    const v7, 0x1da47855

    goto/16 :goto_0

    .line 106
    :sswitch_a
    invoke-direct {p0, p1}, Ll/ۖᩴۡ;->ᩳ(I)V

    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_4

    :cond_3
    :goto_1
    const-string v5, "\u06ec\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xaab

    const v7, -0x4b7884f8

    xor-int/2addr v6, v7

    const v7, 0x4ec1813a    # 1.62323584E9f

    goto/16 :goto_0

    :cond_4
    const-string v5, "\u1a77\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2ce9

    const v7, -0x1db3323b

    xor-int/2addr v6, v7

    const v7, -0x6bd8df8d

    goto/16 :goto_0

    .line 51
    :sswitch_b
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v5, "\u06d7\u06e0"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x160f

    const v7, 0x5139a0dd

    xor-int/2addr v6, v7

    const v7, -0x6c6241

    goto/16 :goto_0

    .line 29
    :sswitch_c
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v5, "\u1a73\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x29

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x154f

    const v7, 0x4d3ecb52    # 2.0006224E8f

    xor-int/2addr v6, v7

    const v7, 0x412f1fe

    goto/16 :goto_0

    .line 33
    :sswitch_d
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v5, "\u06d8\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6d8b

    const v7, 0x5f01ee2e

    xor-int/2addr v6, v7

    const v7, 0x17af6ff0

    goto/16 :goto_0

    .line 72
    :sswitch_e
    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_8

    :goto_2
    const-string v5, "\u05a1\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x2d21

    const v7, -0x1f780319

    xor-int/2addr v6, v7

    const v7, -0x29ada744

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d8\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x27d3

    const v7, -0x1dd00970

    xor-int/2addr v6, v7

    const v7, -0x7171b0c

    goto/16 :goto_0

    .line 11
    :sswitch_f
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_a

    :cond_9
    const-string v5, "\u06da\u1a76"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x1327

    const v7, -0x682640d5

    xor-int/2addr v6, v7

    const v7, 0x23bd4032

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e4\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x739d

    const v7, -0x1a107fac

    xor-int/2addr v6, v7

    const v7, 0x1a54d990

    goto/16 :goto_0

    :sswitch_10
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_b

    :goto_3
    const-string v5, "\u06dc\u06db"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x15ff

    const v7, 0x43d6df7c

    xor-int/2addr v6, v7

    const v7, 0x3a258569

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u06df\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x1b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x47bf

    const v7, 0x52030ed6

    xor-int/2addr v6, v7

    const v7, 0x2041c69b

    goto/16 :goto_0

    :cond_c
    :goto_4
    const-string v5, "\u06e2\u06d9"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x124d

    const v7, 0x670d96d6

    xor-int/2addr v6, v7

    const v7, 0xbfa4221

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u06dc\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6a5

    const v7, 0x5906f8aa

    xor-int/2addr v6, v7

    const v7, -0x371476b1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ef9193d -> :sswitch_3
        -0x76dda49e -> :sswitch_c
        -0x7624deff -> :sswitch_10
        -0x742a422f -> :sswitch_6
        -0x73d78c33 -> :sswitch_4
        -0x7392b111 -> :sswitch_9
        -0x72ecc126 -> :sswitch_a
        -0x70cefac2 -> :sswitch_4
        -0x6503dfb8 -> :sswitch_1
        -0x5f63ee76 -> :sswitch_0
        -0x574f00c1 -> :sswitch_8
        -0x54247bc2 -> :sswitch_2
        -0x50bfa132 -> :sswitch_e
        -0x4df507b6 -> :sswitch_b
        -0x45082e0e -> :sswitch_e
        -0x3a5ec614 -> :sswitch_7
        -0x3106c74f -> :sswitch_c
        -0x2d53edd0 -> :sswitch_3
        -0x2ced08d4 -> :sswitch_d
        -0x2baf894d -> :sswitch_0
        -0x2b9c2fa0 -> :sswitch_9
        -0x7fde9a5 -> :sswitch_f
        -0x42af83d -> :sswitch_2
        0x4a09924 -> :sswitch_b
        0x50f3ec1 -> :sswitch_8
        0x26c5cb70 -> :sswitch_a
        0x2ec38538 -> :sswitch_5
        0x3389ceca -> :sswitch_f
        0x3946801d -> :sswitch_1
        0x4ce2ed7e -> :sswitch_6
        0x6544711a -> :sswitch_5
        0x77e45e11 -> :sswitch_7
        0x7abfac6c -> :sswitch_d
        0x7dff09ec -> :sswitch_10
    .end sparse-switch
.end method

.method public final ۧ(I)J
    .locals 16

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const v10, 0x131be102

    sget v11, Ll/ۨ;->᩺᩷ۚ:I

    sget v12, Ll/֫᩵;->ܶ᩻᩷:I

    const-string v13, "\u1a73\u06df"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x49f

    const v15, 0x5508e528

    xor-int/2addr v14, v15

    const v15, -0x7b176ea0

    :goto_0
    xor-int/2addr v13, v15

    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x1dab

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 22
    sget-boolean v13, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v13, :cond_7

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v13

    if-gtz v13, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v13, "\u06da\u06e4"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x1ae7

    const v15, -0x3d721e5c

    xor-int/2addr v14, v15

    const v15, 0x3617d4fb

    goto :goto_0

    .line 58
    :sswitch_1
    sget v13, Ll/᩺;->ۙۛܶ:I

    if-lez v13, :cond_b

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget-boolean v13, Ll/֫᩺;->֫ܰۨ:Z

    if-nez v13, :cond_9

    goto/16 :goto_1

    .line 94
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto/16 :goto_1

    .line 44
    :sswitch_4
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    const-wide/16 v0, 0x0

    return-wide v0

    :sswitch_5
    const/16 v0, 0x20

    shl-long v0, v8, v0

    or-long/2addr v0, v5

    return-wide v0

    :sswitch_6
    int-to-long v8, v7

    .line 87
    sget v13, Ll/۟;->ۗۤۛ:I

    if-eqz v13, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v13, "\u06e1\u1a76"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x19

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4e35

    const v15, 0x542d1332

    xor-int/2addr v14, v15

    const v15, -0x3bbbe090

    goto :goto_0

    :sswitch_7
    and-long v5, v1, v3

    .line 120
    invoke-direct/range {p0 .. p0}, Ll/ۖᩴۡ;->֫()I

    move-result v7

    .line 113
    sget v13, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v13, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v13, "\u1a77\u05ab"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x43

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x5e99

    const v15, 0x1c76aae6

    xor-int/2addr v14, v15

    const v15, 0x5ef20dd0

    goto/16 :goto_0

    :sswitch_8
    int-to-long v1, v0

    const-wide v3, 0xffffffffL

    .line 117
    sget v13, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v13, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v13, "\u05a8\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x496d

    const v15, 0x5210def7

    xor-int/2addr v14, v15

    const v15, 0x4834128c

    goto/16 :goto_0

    .line 120
    :sswitch_9
    invoke-direct/range {p0 .. p0}, Ll/ۖᩴۡ;->֫()I

    move-result v0

    sget v13, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v13, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v13, "\u073f\u05ab"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x75

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4e3d

    const v15, -0x452c2871

    xor-int/2addr v14, v15

    const v15, -0x5158fbaf

    goto/16 :goto_0

    .line 115
    :sswitch_a
    invoke-direct/range {p0 .. p1}, Ll/ۖᩴۡ;->ᩳ(I)V

    .line 1
    sget v13, Ll/᩺;->ۙۛܶ:I

    if-gtz v13, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v13, "\u06d6\u06df"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x35ff

    const v15, 0x7c9668b6

    xor-int/2addr v14, v15

    const v15, -0x6970d1c2

    goto/16 :goto_0

    .line 87
    :sswitch_b
    sget-boolean v13, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v13, :cond_6

    :goto_1
    const-string v13, "\u06df\u1a7b"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x45

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x74d9

    const v15, -0x799bfb33

    xor-int/2addr v14, v15

    const v15, -0x2524b020

    goto/16 :goto_0

    :cond_6
    const-string v13, "\u073d\u06e4"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, -0x59

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1e55

    const v15, -0x3f475cd4

    xor-int/2addr v14, v15

    const v15, -0x1d4815e3

    goto/16 :goto_0

    :goto_2
    const-string v13, "\u1a76\u05a1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x65b

    const v15, 0x5256d047

    xor-int/2addr v14, v15

    const v15, 0x113114c5

    goto/16 :goto_0

    :cond_7
    const-string v13, "\u073a\u06e0"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x47

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x65a7

    const v15, 0x7827366a

    xor-int/2addr v14, v15

    const v15, -0x7af0c717

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v13

    if-ltz v13, :cond_8

    goto :goto_3

    :cond_8
    const-string v13, "\u06ec\u06d8"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x11d3

    const v15, 0x2489e28b

    xor-int/2addr v14, v15

    const v15, 0x57705579

    goto/16 :goto_0

    .line 93
    :sswitch_d
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v13

    if-gtz v13, :cond_a

    :cond_9
    :goto_3
    const-string v13, "\u06d6\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x4069

    const v15, -0x6ca0b499

    xor-int/2addr v14, v15

    const v15, -0xee43c56

    goto/16 :goto_0

    :cond_a
    const-string v13, "\u073a\u1a77"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x4723

    const v15, 0x62e58b80

    xor-int/2addr v14, v15

    const v15, -0x20e482f6

    goto/16 :goto_0

    .line 115
    :sswitch_e
    sget v13, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v13, :cond_c

    :cond_b
    :goto_4
    const-string v13, "\u05a8\u06dc"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    add-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x1b

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x66c9

    const v15, 0x11e4b2c1

    xor-int/2addr v14, v15

    const v15, 0x8947ae1

    goto/16 :goto_0

    :cond_c
    const-string v13, "\u06e2\u06e2"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, 0x45

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x52f3

    const v15, -0x19873242

    xor-int/2addr v14, v15

    const v15, 0x238af286

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73fd049e -> :sswitch_b
        -0x7302d856 -> :sswitch_5
        -0x6d30ae5c -> :sswitch_7
        -0x68898d07 -> :sswitch_3
        -0x584e68cd -> :sswitch_3
        -0x4da87760 -> :sswitch_d
        -0x3fda848c -> :sswitch_9
        -0x3ae7f5ee -> :sswitch_0
        -0x35455fcc -> :sswitch_8
        -0x34b48bc8 -> :sswitch_7
        -0x2917624c -> :sswitch_9
        -0x27cf5358 -> :sswitch_6
        -0x204fe198 -> :sswitch_a
        -0x129d8577 -> :sswitch_0
        -0xab9af88 -> :sswitch_4
        -0xa2841ea -> :sswitch_a
        -0x9985497 -> :sswitch_b
        -0x7ab354f -> :sswitch_c
        0xb31a04b -> :sswitch_c
        0xbc2384d -> :sswitch_6
        0x1bc8a8d5 -> :sswitch_e
        0x1c87fd25 -> :sswitch_2
        0x4d2b7b92 -> :sswitch_5
        0x50c18c90 -> :sswitch_e
        0x60bd8032 -> :sswitch_1
        0x61b8c9a8 -> :sswitch_4
        0x68112031 -> :sswitch_2
        0x68a9e270 -> :sswitch_8
        0x6f9fe585 -> :sswitch_1
        0x78626109 -> :sswitch_d
    .end sparse-switch
.end method

.method public final ܽ(I)Ljava/lang/String;
    .locals 9

    const v0, -0x7c586933    # -9.85E-37f

    sget v1, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v2, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v3, "\u06e7\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6d81

    const v5, -0x5f4264f1

    xor-int/2addr v4, v5

    const v5, -0x3277b192

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6673

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 96
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_2

    .line 28
    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_9

    goto :goto_1

    .line 42
    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    const-string v3, "\u1a73\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a69

    const v5, -0x24a08668

    xor-int/2addr v4, v5

    const v5, 0x1f8fffca

    goto :goto_0

    .line 41
    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    goto :goto_2

    .line 114
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    const/4 p1, 0x0

    return-object p1

    .line 140
    :sswitch_4
    new-instance v3, Ljava/lang/String;

    .line 98
    iget v4, p0, Ll/ۖᩴۡ;->ᩳ:I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v5

    if-gtz v5, :cond_1

    goto/16 :goto_5

    :cond_1
    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Ll/ۖᩴۡ;->ᩳ:I

    .line 138
    sget v6, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v6, :cond_2

    goto :goto_3

    .line 98
    :cond_2
    iget-object v6, p0, Ll/ۖᩴۡ;->֫:[B

    aget-byte v7, v6, v4

    .line 16
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_4

    :cond_3
    and-int/lit16 v7, v7, 0xff

    .line 21
    sget v8, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v8, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v4, v4, 0x2

    .line 98
    iput v4, p0, Ll/ۖᩴۡ;->ᩳ:I

    .line 108
    sget-boolean v8, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v8, :cond_5

    goto :goto_3

    .line 98
    :cond_5
    aget-byte v5, v6, v5

    and-int/lit16 v5, v5, 0xff

    sget v8, Ll/֡֡;->֫ۤܳ:I

    if-ltz v8, :cond_6

    :goto_2
    const-string v3, "\u0730\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x2d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xe85

    const v5, 0xd448ce4

    xor-int/2addr v4, v5

    const v5, 0x56cea290

    goto/16 :goto_0

    .line 40
    :cond_6
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_5

    :cond_7
    shl-int/lit8 v5, v5, 0x8

    or-int/2addr v5, v7

    .line 129
    new-array v7, v5, [B

    .line 112
    sget v8, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v8, :cond_8

    :goto_3
    const-string v3, "\u1a7a\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x60fd

    const v5, -0x4216acd8

    xor-int/2addr v4, v5

    const v5, 0x662b5b9b

    goto/16 :goto_0

    :cond_8
    const/4 v8, 0x0

    .line 124
    invoke-static {v6, v4, v7, v8, v5}, Ll/ۗ᩷;->ۢۚܺ(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 125
    iget v4, p0, Ll/ۖᩴۡ;->ᩳ:I

    add-int/2addr v4, v5

    .line 12
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06e1\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x510b

    const v5, 0x1e9dedb1

    xor-int/2addr v4, v5

    const v5, 0x17d86e25

    goto/16 :goto_0

    .line 125
    :cond_a
    iput v4, p0, Ll/ۖᩴۡ;->ᩳ:I

    .line 140
    sget-object p1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {v3, v7, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v3

    .line 135
    :sswitch_5
    invoke-direct {p0, p1}, Ll/ۖᩴۡ;->ᩳ(I)V

    .line 118
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u06d9\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x68c7

    const v5, -0x1e970a66

    xor-int/2addr v4, v5

    const v5, 0x7d757727

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0730\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x33

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1253

    const v5, -0x75ed650f

    xor-int/2addr v4, v5

    const v5, -0x6f6fd1a4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7411145e -> :sswitch_3
        -0x6fc31d6f -> :sswitch_3
        -0x429192e6 -> :sswitch_4
        -0x41d4993a -> :sswitch_1
        -0x3f506cf6 -> :sswitch_2
        -0x38ee6222 -> :sswitch_2
        -0x300be3b5 -> :sswitch_5
        -0x18b7d71f -> :sswitch_0
        0x28cbb843 -> :sswitch_0
        0x4c7def1d -> :sswitch_5
        0x6b8ceb05 -> :sswitch_1
        0x7e5048b4 -> :sswitch_4
    .end sparse-switch
.end method
