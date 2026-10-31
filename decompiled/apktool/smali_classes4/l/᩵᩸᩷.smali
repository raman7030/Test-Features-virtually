.class public final Ll/᩵᩸᩷;
.super Ljava/lang/Object;


# static fields
.field public static ֫:[I

.field private static final ۙۛ᩸:[S

.field public static ۜ:[I

.field public static ۧ:[I

.field public static ܳ:[I

.field public static ܽ:[I

.field public static ܿ:[I

.field public static ᩳ:[I

.field public static ᩻:[I


# direct methods
.method public static constructor <clinit>()V
    .locals 40

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/4 v1, 0x0

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

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, -0x669e84d7

    sget v21, Ll/ۘۨ;->۫᩸۠:I

    sget v22, Ll/֡ܶ;->ᩴܿ᩸:I

    const-string v23, "\u06d6\u1a75"

    invoke-static/range {v23 .. v23}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v23

    xor-int v23, v23, v21

    mul-int/lit8 v23, v23, 0x6b

    xor-int v0, v23, v22

    mul-int/lit16 v0, v0, -0x7ffb

    const v25, 0x6258506d

    xor-int v0, v0, v25

    const v25, 0x3dcc75cc

    xor-int v23, v23, v25

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    move-object v9, v8

    move-object/from16 v35, v11

    move-object/from16 v34, v15

    move-object/from16 v3, v16

    move-object/from16 v33, v17

    move-object/from16 v37, v18

    move-object/from16 v6, v19

    move/from16 v24, v23

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const v23, -0x669e84d7

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v16, v7

    move-object v15, v14

    const/4 v7, 0x0

    const/4 v14, 0x0

    :goto_0
    xor-int v5, v23, v22

    mul-int/lit16 v5, v5, 0x7403

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v23, v24, v0

    sparse-switch v23, :sswitch_data_0

    move-object/from16 v24, v3

    move/from16 v3, v20

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v17, v2

    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    xor-int v12, v31, v32

    .line 0
    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/16 v1, 0x10

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, v10}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v9

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v0

    if-nez v0, :cond_d

    :goto_1
    move v0, v12

    move-object/from16 v12, v35

    goto/16 :goto_12

    :sswitch_0
    sput-object v36, Ll/᩵᩸᩷;->ܽ:[I

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_1

    sput-object v0, Ll/᩵᩸᩷;->ᩳ:[I

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    const-string v0, "\u06ec\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x13

    xor-int v5, v0, v22

    mul-int/lit16 v5, v5, 0x1157

    const v24, 0x6f48f8fd

    xor-int v5, v5, v24

    const v24, 0x1ca3d97c

    move-object/from16 v24, v3

    move/from16 v3, v20

    move/from16 v20, v17

    move/from16 v17, v2

    const v2, 0x1ca3d97c

    goto/16 :goto_4

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v0, :cond_1

    move-object/from16 v24, v3

    move/from16 v3, v20

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v17, v2

    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    goto/16 :goto_10

    :cond_1
    :goto_2
    move-object/from16 v24, v3

    goto/16 :goto_5

    :sswitch_3
    const/4 v0, 0x3

    invoke-static {v3, v11, v0, v10}, Ll/᩹;->ۡ᩺ᩴ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v5, 0x7e8be912

    xor-int/2addr v0, v5

    sget-object v5, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    .line 4
    sget v24, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v24, :cond_2

    move-object/from16 v24, v3

    move-object/from16 v33, v5

    move/from16 v3, v20

    move-object/from16 v25, v34

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v34, v18

    move v1, v0

    move/from16 v17, v2

    move v0, v12

    move-object/from16 v12, v35

    goto/16 :goto_13

    :cond_2
    const-string v24, "\u1a7b\u1a7a"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    sub-int v24, v22, v24

    mul-int/lit8 v24, v24, 0x3

    move/from16 v25, v0

    xor-int v0, v24, v21

    mul-int/lit16 v0, v0, 0x1787

    const v33, 0x4b67d237    # 1.5192631E7f

    xor-int v0, v0, v33

    const v33, -0x598e7682    # -8.380001E-16f

    xor-int v24, v24, v33

    move-object/from16 v33, v5

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v1, v20

    move/from16 v20, v17

    move/from16 v17, v2

    move/from16 v2, v24

    move-object/from16 v24, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    goto/16 :goto_d

    :sswitch_4
    const/16 v0, 0xb

    new-array v0, v0, [I

    .line 0
    fill-array-data v0, :array_2

    sput-object v0, Ll/᩵᩸᩷;->֫:[I

    sget-object v15, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const-string v0, "\u05a8\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v5, v0, v21

    mul-int/lit16 v5, v5, -0xe65

    const v24, -0x6b8c3094

    xor-int v5, v5, v24

    const v24, 0x33ca2f9d

    xor-int v0, v0, v24

    move-object/from16 v24, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    move-object/from16 v38, v37

    move/from16 v37, v1

    move v1, v5

    move-object/from16 v5, v38

    goto/16 :goto_a

    :sswitch_5
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-object/from16 v24, v3

    move/from16 v3, v20

    move-object/from16 v5, v37

    move/from16 v37, v1

    :goto_3
    move/from16 v20, v17

    move/from16 v17, v2

    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    goto/16 :goto_f

    :sswitch_6
    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/16 v5, 0xa

    move-object/from16 v24, v3

    const/4 v3, 0x3

    invoke-static {v0, v5, v3, v10}, Ll/ۘۘ;->᩻ۙܿ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v29

    const v30, 0x7d4f1120

    .line 2
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v22

    mul-int/lit16 v3, v3, 0x73a5

    const v5, 0x4a78af77    # 4074461.8f

    xor-int/2addr v5, v3

    const v3, 0x6f5fcfa

    move/from16 v3, v20

    move/from16 v20, v17

    move/from16 v17, v2

    const v2, 0x6f5fcfa

    goto/16 :goto_4

    .line 0
    :sswitch_7
    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7d1564be

    xor-int/2addr v0, v3

    filled-new-array {v12, v0, v4, v8}, [I

    move-result-object v0

    sput-object v0, Ll/᩵᩸᩷;->ܿ:[I

    sget-object v3, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    .line 4
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_4

    const/16 v11, 0x13

    move-object/from16 v24, v3

    move/from16 v3, v20

    move-object/from16 v0, v35

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v17, v2

    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    goto/16 :goto_b

    :cond_4
    const-string v0, "\u06df\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v5, v0, v21

    mul-int/lit16 v5, v5, -0xdb

    const v11, -0x54761537

    xor-int/2addr v5, v11

    const v11, -0x11cc409c

    xor-int v24, v0, v11

    const/16 v11, 0x13

    move v0, v5

    goto/16 :goto_0

    :sswitch_8
    move-object/from16 v24, v3

    xor-int v8, v29, v30

    .line 0
    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/16 v3, 0xd

    const/4 v5, 0x3

    invoke-static {v0, v3, v5, v10}, Ll/۟;->ۜܿܰ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v31

    const v32, 0x7ed5a9fa

    const-string v0, "\u1a79\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x3b

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x1ccb

    const v5, 0x674eb5ff

    xor-int/2addr v5, v3

    const v3, -0x4bd6bf4b

    move/from16 v3, v20

    move/from16 v20, v17

    move/from16 v17, v2

    const v2, -0x4bd6bf4b

    :goto_4
    move-object/from16 v38, v37

    move/from16 v37, v1

    move v1, v5

    move-object/from16 v5, v38

    move-object/from16 v39, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v39

    goto/16 :goto_14

    :sswitch_9
    move-object/from16 v24, v3

    mul-int v0, v13, v13

    const v3, 0x661ed9

    add-int/2addr v0, v3

    add-int/2addr v0, v0

    sub-int v0, v14, v0

    if-gtz v0, :cond_5

    const-string v0, "\u1a75\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x3b

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, 0x214d

    const v5, 0x7ea8513e

    xor-int/2addr v3, v5

    const v5, -0x3a8b5e9b

    move-object/from16 v5, v37

    move/from16 v37, v1

    move v1, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    move/from16 v34, v10

    move-object/from16 v10, v16

    const v16, -0x3a8b5e9b

    goto/16 :goto_9

    :cond_5
    const-string v0, "\u0736\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v3, v0, v22

    mul-int/lit16 v3, v3, 0x7f83

    const v5, -0x565d3d53

    xor-int/2addr v3, v5

    const v5, 0x74cc8d26

    move-object/from16 v5, v37

    move/from16 v37, v1

    move v1, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    move/from16 v34, v10

    move-object/from16 v10, v16

    const v16, 0x74cc8d26

    goto/16 :goto_9

    :sswitch_a
    move-object/from16 v24, v3

    const/4 v0, 0x1

    const/4 v3, 0x3

    invoke-static {v15, v0, v3, v10}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v0

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_6

    move-object/from16 v16, v0

    move v0, v12

    move/from16 v3, v20

    move-object/from16 v12, v35

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v1, v25

    move-object/from16 v25, v34

    move/from16 v17, v2

    move/from16 v34, v18

    goto/16 :goto_13

    :cond_6
    const-string v3, "\u0730\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int v3, v3, v21

    xor-int v5, v3, v22

    mul-int/lit16 v5, v5, -0x7895

    const v16, 0xfc8d7a0

    xor-int v5, v5, v16

    const v16, 0x6e9cb0a0

    move/from16 v38, v10

    move-object v10, v0

    move v0, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    move/from16 v34, v38

    move-object/from16 v39, v37

    move/from16 v37, v1

    move v1, v5

    move-object/from16 v5, v39

    goto/16 :goto_9

    :sswitch_b
    move-object/from16 v24, v3

    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/4 v3, 0x7

    const/4 v4, 0x3

    invoke-static {v0, v3, v4, v10}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7e6d4831

    xor-int v4, v0, v3

    .line 3
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_7

    :goto_5
    const-string v0, "\u06d9\u1a74"

    .line 0
    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x7b

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x28c1

    const v5, -0x64c3f589

    xor-int/2addr v5, v3

    const v3, 0x48961117

    move/from16 v3, v20

    move/from16 v20, v17

    move/from16 v17, v2

    const v2, 0x48961117

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u06da\u073d"

    .line 3
    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x389

    const v5, 0x79e6c477

    xor-int/2addr v3, v5

    const v5, -0x6139e83f

    xor-int/2addr v0, v5

    move-object/from16 v38, v24

    move/from16 v24, v0

    move v0, v3

    move-object/from16 v3, v38

    goto/16 :goto_0

    .line 0
    :sswitch_c
    invoke-static {v6, v1, v2, v10}, Ll/֫ۧ;->᩷ᩳ᩺([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d2720b7

    xor-int/2addr v0, v1

    filled-new-array {v7, v0}, [I

    move-result-object v0

    sput-object v0, Ll/᩵᩸᩷;->ۜ:[I

    return-void

    :sswitch_d
    move-object/from16 v24, v3

    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/4 v3, 0x0

    aget-short v13, v0, v3

    add-int/lit16 v0, v13, 0xa1b

    mul-int v14, v0, v0

    const-string v0, "\u06da\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    mul-int/lit8 v0, v0, 0x63

    xor-int v3, v0, v22

    mul-int/lit16 v3, v3, -0x3815

    const v5, 0x5213d5fb

    xor-int/2addr v3, v5

    const v5, -0x6c6507a8

    xor-int/2addr v0, v5

    move-object/from16 v5, v37

    move/from16 v37, v1

    move v1, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v24, v3

    const/16 v0, 0x19

    const/4 v3, 0x3

    move-object/from16 v5, v37

    invoke-static {v5, v0, v3, v10}, Ll/֡ܶ;->ܽ᩻᩵([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sget v27, Ll/֨۟;->᩹֫᩷:I

    if-eqz v27, :cond_8

    const v3, 0x7d1dc84e

    goto :goto_6

    :cond_8
    const-string v27, "\u05a1\u06dc"

    invoke-static/range {v27 .. v27}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v27

    sub-int v27, v22, v27

    mul-int/lit8 v27, v27, -0xd

    xor-int v3, v27, v21

    mul-int/lit16 v3, v3, 0x5bf3

    const v37, 0x4c322fc5    # 4.6710548E7f

    xor-int v3, v3, v37

    const v37, 0x396879a9

    move/from16 v37, v1

    move/from16 v1, v27

    const v28, 0x7d1dc84e

    move/from16 v27, v0

    move-object v0, v5

    move/from16 v5, v19

    move/from16 v19, v20

    move/from16 v20, v17

    move/from16 v17, v2

    move/from16 v2, v26

    const v26, 0x396879a9

    goto :goto_7

    :sswitch_f
    move-object/from16 v24, v3

    move-object/from16 v5, v37

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_9

    move/from16 v37, v1

    move/from16 v3, v20

    goto/16 :goto_3

    :cond_9
    move/from16 v0, v27

    move/from16 v3, v28

    :goto_6
    const-string v27, "\u073a\u1a74"

    invoke-static/range {v27 .. v27}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v27

    xor-int v27, v27, v21

    mul-int/lit8 v27, v27, -0x27

    move/from16 v28, v0

    xor-int v0, v27, v22

    mul-int/lit16 v0, v0, 0x1803

    const v37, -0x46b9b1cb

    xor-int v0, v0, v37

    const v37, -0x769baa00

    move/from16 v37, v1

    move/from16 v1, v27

    move/from16 v27, v28

    move/from16 v28, v3

    move v3, v0

    move-object v0, v5

    move/from16 v5, v19

    move/from16 v19, v20

    move/from16 v20, v17

    move/from16 v17, v2

    move/from16 v2, v26

    const v26, -0x769baa00

    :goto_7
    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    goto/16 :goto_c

    :sswitch_10
    move-object/from16 v24, v3

    move-object/from16 v5, v37

    const/16 v0, 0x4ed5

    move/from16 v37, v1

    move/from16 v3, v25

    move/from16 v1, v26

    move-object/from16 v25, v34

    const/16 v10, 0x4ed5

    goto/16 :goto_8

    :sswitch_11
    move-object/from16 v24, v3

    move-object/from16 v5, v37

    invoke-static/range {v35 .. v35}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7d1acb0d

    xor-int/2addr v0, v1

    sget-object v1, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const/16 v2, 0x1f

    const/4 v3, 0x3

    const-string v6, "\u06db\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int v6, v6, v22

    mul-int/lit8 v6, v6, -0x51

    xor-int v7, v6, v21

    mul-int/lit16 v7, v7, -0x1c13

    const v37, 0x5044c3d5

    xor-int v7, v7, v37

    const v37, -0x5b28c290

    move/from16 v3, v20

    const/4 v2, 0x3

    move/from16 v20, v17

    move/from16 v17, v0

    move v0, v7

    move-object v7, v1

    const/16 v1, 0x1f

    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    goto/16 :goto_11

    :sswitch_12
    move-object/from16 v24, v3

    move-object/from16 v5, v37

    const/4 v0, 0x4

    const/4 v3, 0x3

    move/from16 v37, v1

    move-object/from16 v1, v34

    invoke-static {v1, v0, v3, v10}, Ll/֡֡;->᩻ۛ۠([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7ea831a6

    xor-int/2addr v0, v3

    filled-new-array {v0}, [I

    move-result-object v36

    const-string v0, "\u06df\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v3, v0, v21

    mul-int/lit16 v3, v3, -0x34ad

    const v34, -0x4c8b9383

    xor-int v3, v3, v34

    const v34, -0x51d1b760

    xor-int v0, v0, v34

    move/from16 v34, v18

    move/from16 v18, v12

    move v12, v11

    move-object v11, v9

    move v9, v8

    move-object/from16 v8, v16

    move/from16 v38, v25

    move-object/from16 v25, v1

    move/from16 v1, v38

    move/from16 v39, v17

    move/from16 v17, v2

    move v2, v3

    move/from16 v3, v20

    move/from16 v20, v39

    goto/16 :goto_15

    :sswitch_13
    move/from16 v37, v1

    move-object/from16 v24, v3

    move-object/from16 v1, v34

    const/16 v0, 0x16

    const/4 v3, 0x3

    move-object/from16 v5, v33

    invoke-static {v5, v0, v3, v10}, Ll/ۗ᩵;->ܶ᩺᩹([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v3, 0x7ebbb7b2

    xor-int/2addr v0, v3

    sget-object v3, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    const-string v26, "\u06e2\u1a76"

    invoke-static/range {v26 .. v26}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v26

    add-int v26, v26, v21

    mul-int/lit8 v26, v26, 0x6b

    move/from16 v33, v0

    xor-int v0, v26, v22

    mul-int/lit16 v0, v0, -0x59c9

    const v34, 0x47f08c05

    xor-int v0, v0, v34

    const v34, -0x21ede436

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v1

    move/from16 v1, v26

    const v26, -0x21ede436

    move-object/from16 v38, v3

    move v3, v0

    move-object/from16 v0, v38

    move/from16 v39, v17

    move/from16 v17, v2

    move/from16 v2, v33

    move-object/from16 v33, v5

    move/from16 v5, v19

    move/from16 v19, v20

    move/from16 v20, v39

    goto/16 :goto_c

    :sswitch_14
    move-object/from16 v24, v3

    move-object/from16 v5, v37

    move/from16 v37, v1

    move-object/from16 v1, v34

    xor-int v0, v27, v28

    move/from16 v3, v25

    move-object/from16 v25, v1

    move/from16 v1, v26

    filled-new-array {v0, v3, v1}, [I

    move-result-object v0

    sput-object v0, Ll/᩵᩸᩷;->ܳ:[I

    const v17, 0x1010106

    const v18, 0x1010095

    const v19, 0x101014f

    const-string v20, "\u05a1\u05ab"

    invoke-static/range {v20 .. v20}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v20

    xor-int v20, v20, v21

    xor-int v0, v20, v22

    mul-int/lit16 v0, v0, -0x2149

    const v34, 0x568b5e3

    xor-int v0, v0, v34

    const v34, 0x77625cdc

    move/from16 v17, v2

    move/from16 v18, v3

    const v26, 0x77625cdc

    const v34, 0x1010106

    move v3, v0

    move v2, v1

    move-object v0, v5

    move/from16 v1, v20

    const v5, 0x1010095

    const v20, 0x1010098

    goto/16 :goto_c

    :sswitch_15
    move-object/from16 v24, v3

    move/from16 v3, v25

    move-object/from16 v25, v34

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v1, v26

    const/16 v0, 0x583

    const/16 v10, 0x583

    :goto_8
    const-string v0, "\u06e8\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, -0x21

    move/from16 v26, v1

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, 0x5b89

    const v34, -0x42d8ccf4

    xor-int v1, v1, v34

    const v34, 0x6f60ef85

    move/from16 v34, v10

    move-object/from16 v10, v16

    const v16, 0x6f60ef85

    :goto_9
    xor-int v0, v0, v16

    move-object/from16 v16, v10

    move/from16 v10, v34

    :goto_a
    move/from16 v34, v18

    move/from16 v38, v1

    move v1, v0

    move/from16 v0, v38

    move/from16 v39, v17

    move/from16 v17, v2

    move-object/from16 v2, v25

    move/from16 v25, v3

    move/from16 v3, v20

    move/from16 v20, v39

    goto/16 :goto_16

    :sswitch_16
    move-object/from16 v24, v3

    move/from16 v0, v19

    move/from16 v3, v20

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v1, v17

    move/from16 v17, v2

    move/from16 v2, v18

    move/from16 v18, v25

    move-object/from16 v25, v34

    filled-new-array {v0, v1, v2, v3}, [I

    move-result-object v19

    sput-object v19, Ll/᩵᩸᩷;->᩻:[I

    move/from16 v19, v0

    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    move/from16 v20, v1

    const/16 v1, 0x1c

    move/from16 v34, v2

    const/4 v2, 0x3

    invoke-static {v0, v1, v2, v10}, Ll/ۙۨ;->֡ᩳ᩵([SIII)Ljava/lang/String;

    move-result-object v0

    sget v1, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v1, :cond_a

    :goto_b
    move/from16 v38, v12

    move-object v12, v0

    move/from16 v0, v38

    goto/16 :goto_12

    :cond_a
    const-string v1, "\u0730\u06dc"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x6e53

    const v35, -0x2d7cfad6

    xor-int v2, v2, v35

    const v35, 0x45b447ac

    move-object/from16 v35, v0

    move-object v0, v5

    move/from16 v5, v19

    move/from16 v19, v3

    move v3, v2

    move/from16 v2, v26

    const v26, 0x45b447ac

    :goto_c
    xor-int v1, v1, v26

    move/from16 v26, v2

    move v2, v1

    move/from16 v1, v19

    move/from16 v19, v5

    move-object v5, v0

    move v0, v3

    move/from16 v3, v18

    move/from16 v18, v34

    :goto_d
    move-object/from16 v34, v25

    move/from16 v25, v3

    move-object/from16 v3, v24

    move/from16 v24, v2

    move/from16 v2, v17

    move/from16 v17, v20

    move/from16 v20, v1

    :goto_e
    move/from16 v1, v37

    move-object/from16 v37, v5

    goto/16 :goto_0

    :sswitch_17
    move-object/from16 v24, v3

    move/from16 v34, v18

    move/from16 v3, v20

    move/from16 v18, v25

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v17, v2

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7e758a88

    xor-int/2addr v0, v1

    filled-new-array {v0}, [I

    move-result-object v0

    sput-object v0, Ll/᩵᩸᩷;->ۧ:[I

    sget-object v0, Ll/᩵᩸᩷;->ۙۛ᩸:[S

    sget v1, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v1, :cond_b

    move-object/from16 v25, v0

    goto/16 :goto_1

    :cond_b
    const-string v1, "\u1a73\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v21

    xor-int v2, v1, v22

    mul-int/lit16 v2, v2, -0x2ae1

    const v25, -0x47fffce0

    xor-int v2, v2, v25

    const v25, 0x47145e48

    move-object/from16 v25, v0

    move v0, v1

    move v1, v2

    const v2, 0x47145e48

    goto/16 :goto_14

    :sswitch_18
    move-object/from16 v24, v3

    move/from16 v3, v20

    move-object/from16 v5, v37

    move/from16 v37, v1

    move/from16 v20, v17

    move/from16 v17, v2

    move-object/from16 v38, v34

    move/from16 v34, v18

    move/from16 v18, v25

    move-object/from16 v25, v38

    sget v0, Ll/֡۬;->۠֡᩶:I

    if-lez v0, :cond_c

    :goto_f
    const-string v0, "\u0733\u073d"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v1, v0, v21

    mul-int/lit16 v1, v1, -0x1861

    const v2, 0x759daa14

    xor-int/2addr v1, v2

    const v2, -0x4ccf2bc3

    move/from16 v2, v17

    move/from16 v17, v7

    move-object v7, v6

    move v6, v0

    move v0, v1

    move/from16 v1, v37

    const v37, -0x4ccf2bc3

    goto :goto_11

    :cond_c
    :goto_10
    const-string v0, "\u06e1\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v21

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x185f

    const v2, 0x28cb1d7d

    xor-int/2addr v1, v2

    const v2, 0x17c32d53

    move/from16 v2, v17

    move/from16 v17, v7

    move-object v7, v6

    move v6, v0

    move v0, v1

    move/from16 v1, v37

    const v37, 0x17c32d53

    :goto_11
    xor-int v6, v6, v37

    move-object/from16 v37, v5

    move/from16 v38, v20

    move/from16 v20, v3

    move-object/from16 v3, v24

    move/from16 v24, v6

    move-object v6, v7

    move/from16 v7, v17

    move/from16 v17, v38

    move-object/from16 v39, v25

    move/from16 v25, v18

    move/from16 v18, v34

    move-object/from16 v34, v39

    goto/16 :goto_0

    :goto_12
    move/from16 v1, v18

    :goto_13
    const-string v2, "\u1a7b\u06e7"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    add-int v2, v2, v21

    mul-int/lit8 v2, v2, -0x13

    move/from16 v18, v0

    xor-int v0, v2, v22

    mul-int/lit16 v0, v0, 0x5f0f

    const v35, -0x72d3dafb

    xor-int v0, v0, v35

    const v35, -0x230828

    xor-int v2, v2, v35

    move-object/from16 v35, v12

    move v12, v11

    move-object v11, v9

    move v9, v8

    move-object/from16 v8, v16

    move/from16 v38, v2

    move v2, v0

    move/from16 v0, v38

    goto :goto_15

    :cond_d
    const-string v0, "\u1a77\u06e1"

    .line 4
    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v21

    mul-int/lit8 v0, v0, -0x69

    xor-int v1, v0, v22

    mul-int/lit16 v1, v1, 0x6103

    const v2, 0x1ee62d44

    xor-int/2addr v1, v2

    const v2, 0x657fe90c

    :goto_14
    xor-int/2addr v0, v2

    move v2, v1

    move/from16 v1, v18

    move/from16 v18, v12

    move v12, v11

    move-object v11, v9

    move v9, v8

    move-object/from16 v8, v16

    :goto_15
    move-object/from16 v16, v8

    move v8, v9

    move-object v9, v11

    move v11, v12

    move/from16 v12, v18

    move/from16 v38, v1

    move v1, v0

    move v0, v2

    move-object/from16 v2, v25

    move/from16 v25, v38

    :goto_16
    move/from16 v18, v34

    move-object/from16 v34, v2

    move/from16 v2, v17

    move/from16 v17, v20

    move/from16 v20, v3

    move-object/from16 v3, v24

    move/from16 v24, v1

    goto/16 :goto_e

    :sswitch_data_0
    .sparse-switch
        -0x7efb165f -> :sswitch_18
        -0x77809010 -> :sswitch_17
        -0x6e7e311d -> :sswitch_16
        -0x6dd0ad33 -> :sswitch_15
        -0x6daa512f -> :sswitch_14
        -0x63836216 -> :sswitch_13
        -0x5e0bbd6d -> :sswitch_12
        -0x5ca87beb -> :sswitch_11
        -0x5ad96d1f -> :sswitch_17
        -0x59f9e77a -> :sswitch_10
        -0x58b4a323 -> :sswitch_f
        -0x444f26f4 -> :sswitch_e
        -0x43073cde -> :sswitch_d
        -0x3ee8ea48 -> :sswitch_c
        -0x3e4868f1 -> :sswitch_b
        -0x38582e1e -> :sswitch_b
        -0x2b737bca -> :sswitch_a
        -0x264fe1e0 -> :sswitch_9
        -0x1fe9f915 -> :sswitch_8
        -0x1689b7a1 -> :sswitch_7
        -0x131630f5 -> :sswitch_a
        -0x121c5ccb -> :sswitch_6
        -0xedf28a8 -> :sswitch_f
        -0xbe8979d -> :sswitch_14
        -0x812f673 -> :sswitch_11
        -0x66c1be2 -> :sswitch_5
        -0x1dc67cc -> :sswitch_4
        -0x69900c -> :sswitch_c
        0x2b53bfc -> :sswitch_3
        0x49dc202 -> :sswitch_2
        0x16659544 -> :sswitch_1
        0x17a2519a -> :sswitch_0
        0x233a4b95 -> :sswitch_2
        0x28e7899b -> :sswitch_12
        0x2a7d39d8 -> :sswitch_15
        0x2c3a5632 -> :sswitch_9
        0x2efdf905 -> :sswitch_7
        0x31103286 -> :sswitch_3
        0x38a077ee -> :sswitch_d
        0x3a5535e4 -> :sswitch_16
        0x3b119a92 -> :sswitch_13
        0x41e59a61 -> :sswitch_6
        0x53f00315 -> :sswitch_4
        0x576caf0a -> :sswitch_10
        0x5a2d3d17 -> :sswitch_5
        0x5f4733a9 -> :sswitch_e
        0x6a654ccb -> :sswitch_18
        0x6c136454 -> :sswitch_1
        0x6c145406 -> :sswitch_8
        0x710dc54a -> :sswitch_0
    .end sparse-switch

    :array_0
    .array-data 2
        0x204s
        0x11f2s
        0x2fe5s
        -0x2359s
        0x2376s
        -0x34cas
        0x27e4s
        0x1387s
        0x19cas
        0x2108s
        -0x2903s
        -0x319es
        0x1ec4s
        0x369fs
        0x2141s
        -0x2a28s
        -0x3902s
        -0x20d8s
        -0x3e5ds
        0x2874s
        0x3bdes
        0x3562s
        0x3da1s
        0x3ffcs
        -0x28dfs
        -0x3b6ds
        -0x26a7s
        0x10a3s
        -0x3aads
        -0x28bds
        0x3e5fs
        -0x3f81s
        0x15f0s
        -0x3f86s
    .end array-data

    :array_1
    .array-data 4
        0x7f0403db
        0x7f0403dc
        0x7f0403dd
        0x7f0403de
        0x7f0403df
        0x7f0403e0
        0x7f0403e1
        0x7f0403e2
        0x7f0403e3
        0x7f0403e4
    .end array-data

    :array_2
    .array-data 4
        0x1010095
        0x101014f
        0x1010150
        0x1010153
        0x1010154
        0x1010156
        0x101015d
        0x1010220
        0x7f04044b
        0x7f04048d
        0x7f040547
    .end array-data
.end method
