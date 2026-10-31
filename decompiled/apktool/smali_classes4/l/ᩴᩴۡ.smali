.class public final Ll/ᩴᩴۡ;
.super Ljava/lang/Object;
.source "V4FO"


# static fields
.field private static final ۢ᩵ܰ:[S


# instance fields
.field public final ֫:Ljava/io/ByteArrayOutputStream;

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x54

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    return-void

    :array_0
    .array-data 2
        0x176es
        -0x6724s
        -0x672fs
        -0x674bs
        -0x6708s
        -0x6720s
        -0x671as
        -0x671fs
        -0x674bs
        -0x6709s
        -0x6710s
        -0x671fs
        -0x671es
        -0x6710s
        -0x6710s
        -0x6705s
        -0x674bs
        -0x675bs
        -0x6713s
        -0x675bs
        -0x675bs
        -0x674bs
        -0x671fs
        -0x6706s
        -0x674bs
        -0x675bs
        -0x6713s
        -0x672ds
        -0x672ds
        -0x6724s
        -0x672fs
        -0x674bs
        -0x674bs
        -0x6710s
        -0x6713s
        -0x6704s
        -0x671as
        -0x671fs
        -0x671as
        0x3c3s
        -0x7453s
        -0x746as
        -0x7475s
        -0x746fs
        -0x7461s
        -0x746as
        -0x7463s
        -0x7464s
        -0x7428s
        -0x7475s
        -0x7470s
        -0x7469s
        -0x7476s
        -0x7474s
        -0x7428s
        -0x746bs
        -0x7473s
        -0x7475s
        -0x7474s
        -0x7428s
        -0x7466s
        -0x7463s
        -0x7474s
        -0x7471s
        -0x7463s
        -0x7463s
        -0x746as
        -0x7428s
        -0x7438s
        -0x7480s
        -0x7438s
        -0x7438s
        -0x7438s
        -0x7438s
        -0x7428s
        -0x7474s
        -0x7469s
        -0x7428s
        -0x7438s
        -0x7480s
        -0x7442s
        -0x7442s
        -0x7442s
        -0x7442s
    .end array-data
.end method

.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const v1, 0x687d4d00

    sget v2, Ll/֫᩵;->ܶ᩻᩷:I

    sget v3, Ll/ۘۨ;->۫᩸۠:I

    .line 162
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06e1\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x27d7

    const v6, 0x13e5dfba

    xor-int/2addr v5, v6

    const v6, -0x411470bf

    :goto_0
    xor-int/2addr v4, v6

    move-object v6, v0

    :goto_1
    xor-int/2addr v1, v3

    mul-int/lit16 v1, v1, -0x263d

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 32
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v4

    if-nez v4, :cond_6

    goto/16 :goto_2

    .line 71
    :sswitch_0
    sget v4, Ll/ۨ;->᩺᩷ۚ:I

    if-gez v4, :cond_1

    goto/16 :goto_3

    .line 142
    :sswitch_1
    sget v4, Ll/֫ۧ;->ۙ۟ۧ:I

    if-lez v4, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v4, "\u05ab\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, 0x6d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7a91

    const v7, 0x33b78b9

    xor-int/2addr v5, v7

    const v7, -0x6abb464e

    goto/16 :goto_5

    .line 130
    :sswitch_2
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    goto :goto_2

    .line 158
    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 160
    :sswitch_4
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    const/16 v5, 0x100

    sget v7, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v7, :cond_2

    :cond_1
    const-string v4, "\u05ab\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6ac7

    const v7, -0x1e2f49ef

    xor-int/2addr v5, v7

    const v7, 0x29a3adc0

    goto/16 :goto_5

    :cond_2
    invoke-direct {v4, v5}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    iput-object v4, p0, Ll/ᩴᩴۡ;->֫:Ljava/io/ByteArrayOutputStream;

    return-void

    .line 159
    :sswitch_5
    iput-object v6, p0, Ll/ᩴᩴۡ;->ۧ:Ljava/util/ArrayList;

    sget v4, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v4, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v4, "\u06dc\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3377

    const v7, 0x2a8adfbd

    xor-int/2addr v5, v7

    const v7, 0x1d58728f

    goto/16 :goto_5

    :sswitch_6
    new-instance v6, Ljava/util/ArrayList;

    const/16 v4, 0x8

    .line 120
    sget-boolean v5, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v5, :cond_4

    :goto_2
    const-string v4, "\u0736\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x7d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x58b1

    const v6, 0x4b9883d1    # 1.9990434E7f

    xor-int/2addr v5, v6

    const v6, -0x62a606d8

    goto/16 :goto_0

    .line 116
    :cond_4
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_5

    goto :goto_3

    .line 99
    :cond_5
    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_7

    :cond_6
    :goto_3
    const-string v4, "\u1a7a\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xf95

    const v6, 0xe27bade

    xor-int/2addr v5, v6

    const v6, 0x35db6241

    goto/16 :goto_0

    .line 98
    :cond_7
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_8

    goto :goto_4

    :cond_8
    sget v5, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_a

    goto :goto_4

    :cond_a
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_b

    goto :goto_4

    .line 159
    :cond_b
    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_c

    :goto_4
    const-string v4, "\u05a8\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x3b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x18d5

    const v6, 0x35782612

    xor-int/2addr v5, v6

    const v6, -0x74bc6c74

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u05a8\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2b23

    const v7, 0x26241407

    xor-int/2addr v5, v7

    const v7, 0x542c95db

    :goto_5
    xor-int/2addr v4, v7

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x69cb4721 -> :sswitch_0
        -0x613d93ae -> :sswitch_1
        -0x42d65fc7 -> :sswitch_4
        -0x30bfc2bd -> :sswitch_1
        -0x17be2317 -> :sswitch_6
        -0x44470b3 -> :sswitch_4
        0x286ac60 -> :sswitch_5
        0x2120e808 -> :sswitch_3
        0x3afa5016 -> :sswitch_6
        0x423fa852 -> :sswitch_0
        0x46f336ad -> :sswitch_5
        0x6372d65e -> :sswitch_2
        0x6b5f06ae -> :sswitch_2
        0x7060dd6a -> :sswitch_3
    .end sparse-switch
.end method

.method private ֫(I)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const v11, -0x6d1f3e43

    sget v12, Ll/ۘ᩻;->᩵ۜ֨:I

    sget v13, Ll/ۘۨ;->۫᩸۠:I

    const-string v14, "\u06db\u1a73"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    add-int/2addr v14, v12

    mul-int/lit8 v14, v14, -0x1f

    xor-int v15, v14, v13

    mul-int/lit16 v15, v15, 0x1d07

    const v16, 0x6662433d

    xor-int v15, v15, v16

    const v16, -0x3f4853ad

    xor-int v14, v14, v16

    :goto_0
    xor-int/2addr v11, v13

    mul-int/lit16 v11, v11, -0x37f1

    shr-int/lit8 v11, v11, 0x1f

    and-int/2addr v11, v15

    xor-int/2addr v11, v14

    sparse-switch v11, :sswitch_data_0

    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    .line 192
    new-instance v4, Ljava/lang/RuntimeException;

    sget-object v5, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    const/4 v11, 0x1

    .line 14
    sget v14, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v14, :cond_a

    move-object/from16 v4, v17

    goto/16 :goto_a

    .line 117
    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget-boolean v14, Ll/֨֫;->᩺ܺ᩸:Z

    if-nez v14, :cond_0

    :goto_1
    move-object/from16 v17, v4

    move/from16 v16, v11

    goto/16 :goto_8

    :cond_0
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    goto/16 :goto_3

    .line 140
    :sswitch_1
    sget v14, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v14, :cond_2

    :cond_1
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    goto/16 :goto_6

    :cond_2
    move/from16 v18, v5

    move/from16 v16, v11

    goto/16 :goto_a

    .line 78
    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    sget-boolean v14, Ll/ۖۘ;->ۚܶۖ:Z

    if-nez v14, :cond_1

    goto :goto_1

    .line 64
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    goto :goto_1

    .line 170
    :sswitch_4
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    return-void

    .line 195
    :sswitch_5
    new-instance v14, Ljava/lang/RuntimeException;

    sget-object v15, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    move/from16 v16, v11

    .line 142
    sget-boolean v17, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v17, :cond_3

    move-object/from16 v17, v4

    goto :goto_2

    :cond_3
    const/4 v11, 0x3

    .line 54
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v18

    if-ltz v18, :cond_4

    move-object/from16 v17, v4

    move/from16 v18, v5

    goto :goto_3

    :cond_4
    move-object/from16 v17, v4

    const/16 v4, 0x1d

    .line 195
    invoke-static {v15, v4, v11, v10}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    .line 168
    sget v15, Ll/֨۟;->᩹֫᩷:I

    if-eqz v15, :cond_5

    :goto_2
    move/from16 v18, v5

    goto/16 :goto_6

    :cond_5
    const/16 v15, 0x20

    move/from16 v18, v5

    const/4 v5, 0x7

    .line 195
    invoke-static {v11, v15, v5, v10}, Ll/֫᩹;->᩻۟ۤ([SIII)Ljava/lang/String;

    move-result-object v5

    .line 4
    sget v11, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v11, :cond_6

    move/from16 v5, v18

    goto/16 :goto_8

    .line 0
    :cond_6
    invoke-static {v1, v4, v5}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 195
    invoke-direct {v14, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v14

    :sswitch_6
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    .line 193
    invoke-static {v3}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۘᩴۡ;

    .line 194
    iget v4, v4, Ll/ۘᩴۡ;->֫:I

    if-eq v4, v1, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u06e1\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v13, v4

    mul-int/lit8 v4, v4, -0x47

    xor-int v5, v4, v12

    mul-int/lit16 v5, v5, 0x2b8b

    const v11, 0x5129df19

    xor-int v15, v5, v11

    const v5, 0x76c12116

    goto/16 :goto_7

    :sswitch_7
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    .line 197
    new-instance v4, Ll/ۘᩴۡ;

    iget-object v5, v0, Ll/ᩴᩴۡ;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v5}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v5

    .line 39
    sget v11, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v11, :cond_8

    :goto_3
    const-string v4, "\u0730\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v12, v4

    mul-int/lit8 v4, v4, 0x2b

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, -0x7f51

    const v11, -0x61a0d522

    xor-int v15, v5, v11

    const v5, -0x41646929

    goto/16 :goto_7

    .line 197
    :cond_8
    invoke-direct {v4, v1, v5}, Ll/ۘᩴۡ;-><init>(II)V

    invoke-static {v2, v4}, Ll/۟;->ᩴۗᩳ(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :sswitch_8
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    .line 193
    invoke-static {v3}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    const-string v4, "\u1a7a\u06e2"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v12, v4

    mul-int/lit8 v4, v4, -0x41

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, 0x67c3

    const v11, 0x73c986a7

    xor-int v15, v5, v11

    const v5, 0x368cdfdc

    goto/16 :goto_7

    :cond_9
    const-string v4, "\u1a73\u06d8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, -0x1f97

    const v11, 0x4c550b6f    # 5.584838E7f

    xor-int v15, v5, v11

    const v5, -0x670201f2

    goto/16 :goto_7

    :sswitch_9
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    iget-object v2, v0, Ll/ᩴᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    const-string v4, "\u1a74\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v13

    mul-int/lit8 v4, v4, 0x5

    xor-int v5, v4, v12

    mul-int/lit16 v5, v5, 0xbc3

    const v11, -0x310773cd

    xor-int v15, v5, v11

    const v5, 0x8477763

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    const/16 v4, 0xff

    if-gt v1, v4, :cond_b

    const-string v4, "\u1a76\u073d"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v13

    mul-int/lit8 v4, v4, -0x7f

    xor-int v5, v4, v12

    mul-int/lit16 v5, v5, 0x1843

    const v11, 0x60fc77bc

    xor-int v15, v5, v11

    const v5, 0x3c2ee64

    goto/16 :goto_7

    :cond_a
    const/16 v1, 0x1c

    .line 192
    invoke-static {v5, v11, v1, v10}, Ll/֡۬;->ۢܳ᩸([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v4

    :sswitch_b
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    if-ltz v1, :cond_b

    const-string v4, "\u06d8\u1a7a"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, -0x51ed

    const v11, -0x7a9a4106

    xor-int v15, v5, v11

    const v5, 0x62cb0d3c

    goto/16 :goto_7

    :cond_b
    const-string v4, "\u06e2\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, 0xb67

    const v11, 0x376d9b28

    xor-int v15, v5, v11

    const v5, 0x783d0e89

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    const/16 v4, 0x2f8a

    const/16 v10, 0x2f8a

    goto :goto_5

    :sswitch_d
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    const v4, 0x9895

    const v10, 0x9895

    :goto_5
    const-string v4, "\u1a7b\u073f"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    mul-int/lit8 v4, v4, -0x19

    xor-int v5, v4, v12

    mul-int/lit16 v5, v5, -0x179d

    const v11, -0x38e7182d

    xor-int v15, v5, v11

    const v5, 0x77d2e02b

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    mul-int v4, v6, v9

    sub-int v4, v8, v4

    if-ltz v4, :cond_c

    const-string v4, "\u06d9\u06e8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v13

    mul-int/lit8 v4, v4, -0x49

    xor-int v5, v4, v12

    mul-int/lit16 v5, v5, 0x6e93

    const v11, -0x223f8596

    xor-int v15, v5, v11

    const v5, -0x18b18d10

    goto/16 :goto_7

    :cond_c
    const-string v4, "\u1a76\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, -0x142d

    const v11, 0x3f43d288

    xor-int v15, v5, v11

    const v5, 0x73350d93

    goto/16 :goto_7

    :sswitch_f
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    const v4, 0x5652ae4

    add-int v8, v7, v4

    const/16 v9, 0x4a54

    .line 54
    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v4, :cond_d

    :goto_6
    const-string v4, "\u1a7b\u06e0"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, -0x20d9

    const v11, 0x6b8d7d4b

    xor-int v15, v5, v11

    const v5, 0x2636fe1d

    goto :goto_7

    :cond_d
    const-string v4, "\u073d\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v13, v4

    mul-int/lit8 v4, v4, 0x5d

    xor-int v5, v4, v12

    mul-int/lit16 v5, v5, 0x4461

    const v11, -0x4dbbaefb

    xor-int v15, v5, v11

    const v5, 0x51f2b2cb

    goto :goto_7

    :sswitch_10
    move-object/from16 v17, v4

    move/from16 v18, v5

    move/from16 v16, v11

    aget-short v6, v17, v18

    mul-int v7, v6, v6

    .line 43
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_e

    const-string v4, "\u06d9\u05a1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, 0x65ff

    const v11, 0x5006197c    # 8.9992684E9f

    xor-int v15, v5, v11

    const v5, 0x186431e0

    goto :goto_7

    :cond_e
    const-string v4, "\u1a7b\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v12

    xor-int v5, v4, v13

    mul-int/lit16 v5, v5, -0x7bc7

    const v11, -0x4c404f54

    xor-int v15, v5, v11

    const v5, 0x7c3caef4

    :goto_7
    xor-int v14, v4, v5

    move/from16 v11, v16

    move-object/from16 v4, v17

    goto/16 :goto_c

    :sswitch_11
    move-object/from16 v17, v4

    move/from16 v16, v11

    const/4 v5, 0x0

    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_f

    :goto_8
    const-string v4, "\u073a\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v13, v4

    mul-int/lit8 v4, v4, 0x65

    xor-int v11, v4, v12

    mul-int/lit16 v11, v11, 0x3b2d

    const v14, 0x150bf84c

    xor-int v15, v11, v14

    const v11, 0x183c2c37

    goto :goto_9

    :cond_f
    const-string v4, "\u06d8\u0736"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v13

    mul-int/lit8 v4, v4, 0x19

    xor-int v11, v4, v12

    mul-int/lit16 v11, v11, 0x2eb

    const v14, 0x7d696c63

    xor-int v15, v11, v14

    const v11, -0x4d0f4da4

    :goto_9
    xor-int v14, v4, v11

    move/from16 v11, v16

    move-object/from16 v4, v17

    goto/16 :goto_0

    :sswitch_12
    move/from16 v18, v5

    move/from16 v16, v11

    sget-object v4, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    .line 193
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v5

    if-gtz v5, :cond_10

    :goto_a
    const-string v5, "\u06d9\u05ab"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v13

    mul-int/lit8 v5, v5, 0x61

    xor-int v11, v5, v12

    mul-int/lit16 v11, v11, 0x40f5

    const v14, 0x2911db19

    xor-int v15, v11, v14

    const v11, 0x24a13cd1

    goto :goto_b

    :cond_10
    const-string v5, "\u06eb\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v12

    xor-int v11, v5, v13

    mul-int/lit16 v11, v11, -0x6841

    const v14, -0x38b1bc27

    xor-int v15, v11, v14

    const v11, -0x41a14c37

    :goto_b
    xor-int v14, v5, v11

    move/from16 v11, v16

    :goto_c
    move/from16 v5, v18

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e034879 -> :sswitch_5
        -0x7c1892a4 -> :sswitch_6
        -0x75fd95f7 -> :sswitch_11
        -0x75c76e4b -> :sswitch_8
        -0x72754a7a -> :sswitch_e
        -0x54d848a8 -> :sswitch_9
        -0x535d121d -> :sswitch_7
        -0x51c3778d -> :sswitch_3
        -0x4e3c0fc0 -> :sswitch_e
        -0x304a2e94 -> :sswitch_d
        -0x2b6c2aa4 -> :sswitch_c
        -0x1f182089 -> :sswitch_0
        -0x1ae6d386 -> :sswitch_c
        -0x1f55b7f -> :sswitch_a
        0x3cf911c -> :sswitch_b
        0x3f745fc -> :sswitch_8
        0x7f34f85 -> :sswitch_10
        0x884c434 -> :sswitch_7
        0xf7ee4ed -> :sswitch_4
        0x1269ecf0 -> :sswitch_3
        0x2c38c120 -> :sswitch_0
        0x301dab3b -> :sswitch_11
        0x314f9b3d -> :sswitch_12
        0x39a5bc4d -> :sswitch_f
        0x3eb30e0f -> :sswitch_10
        0x4863bc61 -> :sswitch_f
        0x50f5612b -> :sswitch_4
        0x519244ed -> :sswitch_5
        0x5697cab6 -> :sswitch_a
        0x58c53e76 -> :sswitch_2
        0x59718ab4 -> :sswitch_2
        0x63b8565a -> :sswitch_d
        0x64ffcb84 -> :sswitch_6
        0x680db873 -> :sswitch_12
        0x6e407352 -> :sswitch_1
        0x70777df8 -> :sswitch_9
        0x75cfc5f3 -> :sswitch_1
        0x7dd55d32 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final ֫(IJ)V
    .locals 22

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const v15, -0x3f938a41

    sget v16, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v17, Ll/ۘۛ;->ۖۚ֡:I

    const-string v18, "\u06dc\u06df"

    invoke-static/range {v18 .. v18}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v18

    sub-int v18, v16, v18

    mul-int/lit8 v18, v18, 0x55

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, -0x3c11

    const v1, -0x770d8c7c

    xor-int/2addr v0, v1

    const v1, 0x4321d371

    xor-int v1, v18, v1

    const-wide/16 v19, 0x0

    :goto_0
    xor-int v15, v15, v17

    mul-int/lit16 v15, v15, -0xa97

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v1, v0

    sparse-switch v15, :sswitch_data_0

    .line 90
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 82
    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-lez v0, :cond_7

    goto/16 :goto_2

    .line 67
    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v0

    if-nez v0, :cond_a

    goto/16 :goto_3

    .line 5
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    return-void

    :sswitch_4
    const/16 v0, 0x38

    ushr-long v0, p2, v0

    and-long v0, v0, v19

    long-to-int v1, v0

    .line 225
    invoke-virtual {v3, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void

    .line 223
    :sswitch_5
    invoke-virtual {v3, v14}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v0, 0x30

    ushr-long v0, p2, v0

    and-long v0, v0, v19

    long-to-int v1, v0

    .line 224
    invoke-virtual {v3, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V

    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_1

    :cond_0
    const-string v0, "\u1a77\u073f"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x5c63

    const v18, 0x770bfdb0

    xor-int v1, v1, v18

    const v18, 0x51e07bfe

    goto/16 :goto_4

    :cond_1
    const-string v0, "\u1a77\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x5f37

    const v18, 0x800f3a6

    xor-int v1, v1, v18

    const v18, -0x52bc83ae

    goto/16 :goto_4

    .line 222
    :sswitch_6
    invoke-virtual {v3, v13}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v0, 0x28

    ushr-long v0, p2, v0

    and-long v0, v0, v19

    long-to-int v14, v0

    .line 1
    sget v0, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v0, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v0, "\u1a75\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x3081

    const v18, 0x43e1d14f

    xor-int v1, v1, v18

    const v18, 0x28258dba

    goto/16 :goto_4

    :sswitch_7
    and-long v0, v11, v19

    long-to-int v13, v0

    .line 166
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_3

    goto :goto_1

    :cond_3
    const-string v0, "\u06e2\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x7dfb

    const v18, 0x6bd2ba27

    xor-int v1, v1, v18

    const v18, 0x12b5c23a

    goto/16 :goto_4

    :sswitch_8
    long-to-int v0, v9

    .line 221
    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v0, 0x20

    ushr-long v11, p2, v0

    .line 199
    sget v0, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v0, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v0, "\u073a\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x7b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x5395

    const v18, 0x6b64bf35

    xor-int v1, v1, v18

    const v18, -0x7b55896b

    goto/16 :goto_4

    .line 220
    :sswitch_9
    invoke-virtual {v3, v8}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v0, 0x18

    ushr-long v0, p2, v0

    and-long v9, v0, v19

    .line 213
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_5

    goto :goto_1

    :cond_5
    const-string v0, "\u06d6\u1a7b"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x6ab

    const v18, -0x54881b0f

    xor-int v1, v1, v18

    const v18, 0xcad1949

    goto/16 :goto_4

    :sswitch_a
    and-long v0, v6, v19

    long-to-int v8, v0

    .line 163
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_1
    const-string v0, "\u0733\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x2b39

    const v18, -0x255bd56b

    xor-int v1, v1, v18

    const v18, 0x169d4c95

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u1a74\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2813

    const v18, -0x10197fa6

    xor-int v1, v1, v18

    const v18, -0x5f922dc9

    goto/16 :goto_4

    :sswitch_b
    long-to-int v0, v4

    .line 219
    invoke-virtual {v3, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v0, 0x10

    ushr-long v6, p2, v0

    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_8

    :cond_7
    const-string v0, "\u1a75\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0x1d

    xor-int v1, v0, v16

    mul-int/lit8 v1, v1, -0x4b

    const v18, 0x24130c27

    xor-int v1, v1, v18

    const v18, 0x6a97b1d8

    goto/16 :goto_4

    :cond_8
    const-string v0, "\u06d9\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, -0xf

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x73b9

    const v18, -0x5b76db9d

    xor-int v1, v1, v18

    const v18, 0x75574576

    goto/16 :goto_4

    :sswitch_c
    move-object/from16 v0, p0

    .line 218
    iget-object v3, v0, Ll/ᩴᩴۡ;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v1, 0x8

    ushr-long v4, p2, v1

    and-long v4, v4, v19

    .line 53
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v1

    if-gtz v1, :cond_9

    goto :goto_2

    :cond_9
    const-string v1, "\u06e0\u073d"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v16, v1

    mul-int/lit8 v1, v1, -0x5f

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, -0x382f

    const v18, 0x2f1680c3

    xor-int v0, v0, v18

    const v18, -0x20df5331

    xor-int v1, v1, v18

    goto/16 :goto_0

    :sswitch_d
    const-wide/16 v19, 0xff

    and-long v0, p2, v19

    long-to-int v2, v0

    .line 62
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_b

    :cond_a
    :goto_2
    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x4a57

    const v18, 0x2eee9ba2

    xor-int v1, v1, v18

    const v18, 0x33554302

    goto :goto_4

    :cond_b
    const-string v0, "\u1a7b\u06d9"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x37f1

    const v18, -0x89e8146

    xor-int v1, v1, v18

    const v18, -0x319b9059

    goto :goto_4

    .line 208
    :sswitch_e
    invoke-direct/range {p0 .. p1}, Ll/ᩴᩴۡ;->֫(I)V

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v0

    if-ltz v0, :cond_c

    :goto_3
    const-string v0, "\u1a79\u1a7b"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x2ac3

    const v18, -0x7a48371e

    xor-int v1, v1, v18

    const v18, -0x10b20e29

    goto :goto_4

    :cond_c
    const-string v0, "\u1a77\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3d81

    const v18, -0x23efbf5a

    xor-int v1, v1, v18

    const v18, -0x7b48165a

    :goto_4
    xor-int v0, v0, v18

    move/from16 v21, v1

    move v1, v0

    move/from16 v0, v21

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b7b32a8 -> :sswitch_9
        -0x766809f0 -> :sswitch_3
        -0x73e8edfd -> :sswitch_a
        -0x72c05e41 -> :sswitch_1
        -0x6c795a7b -> :sswitch_e
        -0x5d895b7f -> :sswitch_1
        -0x5741e304 -> :sswitch_c
        -0x4465a2b7 -> :sswitch_4
        -0x39485fdf -> :sswitch_9
        -0x2d82c220 -> :sswitch_d
        -0x27cf5ce7 -> :sswitch_b
        -0x1960ce15 -> :sswitch_8
        -0x17a6479b -> :sswitch_d
        -0x176dd389 -> :sswitch_8
        -0x4762236 -> :sswitch_4
        0x13f70b7 -> :sswitch_7
        0x1181711e -> :sswitch_7
        0x14a1ce45 -> :sswitch_b
        0x156adb5e -> :sswitch_a
        0x15ac8aae -> :sswitch_5
        0x24137dc4 -> :sswitch_6
        0x251d6112 -> :sswitch_3
        0x2a24f782 -> :sswitch_c
        0x33d75b58 -> :sswitch_2
        0x397c528b -> :sswitch_0
        0x447c8394 -> :sswitch_6
        0x4eff8bfb -> :sswitch_5
        0x506532de -> :sswitch_e
        0x657873ec -> :sswitch_2
        0x7044e274 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 18

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x5c33df59

    sget v11, Ll/֫᩵;->ܶ᩻᩷:I

    sget v12, Ll/ۘۨ;->۫᩸۠:I

    const-string v13, "\u1a74\u1a78"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x30d

    const v15, -0x685f10e5

    xor-int/2addr v14, v15

    const v15, 0x5c674f36

    :goto_0
    xor-int/2addr v13, v15

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit8 v10, v10, -0x5b

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    ushr-int/lit8 v4, v1, 0x8

    .line 219
    sget v13, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v13, :cond_4

    goto :goto_2

    :sswitch_0
    sget v13, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v13, :cond_1

    :cond_0
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    goto/16 :goto_c

    :cond_1
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    goto/16 :goto_b

    .line 27
    :sswitch_1
    sget v13, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v13, :cond_0

    :goto_2
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    goto/16 :goto_a

    :sswitch_2
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    sget v13, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v13, :cond_2

    goto :goto_2

    :cond_2
    :goto_3
    move-object/from16 v13, p0

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto :goto_2

    .line 141
    :sswitch_4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    return-void

    :sswitch_5
    const/4 v1, 0x0

    .line 233
    array-length v2, v0

    invoke-virtual {v3, v0, v1, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    return-void

    :sswitch_6
    and-int/lit16 v13, v4, 0xff

    .line 204
    invoke-virtual {v3, v13}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 54
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v13

    if-gtz v13, :cond_3

    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    goto/16 :goto_9

    :cond_3
    const-string v13, "\u06e0\u1a73"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x48f

    const v15, -0x3795229c

    xor-int/2addr v14, v15

    const v15, -0x4b0c5f46

    goto :goto_0

    :cond_4
    const-string v13, "\u06e8\u1a76"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    mul-int/lit8 v13, v13, -0x23

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x1245

    const v15, 0x1549f2de

    xor-int/2addr v14, v15

    const v15, 0x3f2e3f54

    goto/16 :goto_0

    .line 203
    :sswitch_7
    invoke-virtual {v3, v2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    .line 46
    sget v13, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v13, :cond_5

    goto :goto_3

    :cond_5
    const-string v13, "\u0733\u06e1"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x13

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3b3f

    const v15, -0x3fb5d08d

    xor-int/2addr v14, v15

    const v15, -0x1e6bdcab

    goto/16 :goto_0

    :sswitch_8
    and-int/lit16 v2, v1, 0xff

    move-object/from16 v13, p0

    .line 203
    iget-object v3, v13, Ll/ᩴᩴۡ;->֫:Ljava/io/ByteArrayOutputStream;

    .line 211
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v14

    if-eqz v14, :cond_6

    :goto_4
    const-string v14, "\u06d6\u073a"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    xor-int/2addr v14, v12

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0x4fab

    const v16, 0x448de3b6

    xor-int v15, v15, v16

    const v16, 0x7b559ce3

    goto :goto_5

    :cond_6
    const-string v14, "\u0730\u05a1"

    invoke-static {v14}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v12, v14

    mul-int/lit8 v14, v14, -0x6b

    xor-int v15, v14, v11

    mul-int/lit16 v15, v15, 0xd0b

    const v16, 0x369483c3

    xor-int v15, v15, v16

    const v16, 0x738dee

    goto :goto_5

    :sswitch_9
    move-object/from16 v13, p0

    const v14, 0xffff

    if-gt v1, v14, :cond_7

    const-string v14, "\u06e1\u073d"

    invoke-static {v14}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v14

    sub-int v14, v11, v14

    mul-int/lit8 v14, v14, -0x49

    xor-int v15, v14, v12

    mul-int/lit16 v15, v15, -0x1e7

    const v16, -0x60dd10cd

    xor-int v15, v15, v16

    const v16, -0x5bea08a4

    :goto_5
    xor-int v14, v14, v16

    move v13, v14

    move v14, v15

    goto/16 :goto_1

    :cond_7
    move-object/from16 v14, p2

    goto :goto_6

    :sswitch_a
    move-object/from16 v13, p0

    .line 202
    new-instance v14, Ljava/lang/RuntimeException;

    sget-object v15, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    move-object/from16 v16, v0

    const/16 v0, 0x28

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v17

    if-eqz v17, :cond_8

    move-object/from16 v14, p2

    goto/16 :goto_b

    :cond_8
    const/16 v1, 0x2c

    invoke-static {v15, v0, v1, v9}, Ll/ۗ۬;->᩹ۨ᩹([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v14, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v14

    :sswitch_b
    move-object/from16 v13, p0

    .line 238
    invoke-direct/range {p0 .. p1}, Ll/ᩴᩴۡ;->֫(I)V

    .line 243
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v14, p2

    invoke-static {v14, v0}, Ll/֫ۧ;->ۗܿۤ(Ljava/lang/Object;Ljava/lang/Object;)[B

    move-result-object v0

    .line 244
    array-length v1, v0

    if-ltz v1, :cond_9

    const-string v15, "\u06d6\u06e4"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v11

    move-object/from16 v16, v0

    xor-int v0, v15, v12

    mul-int/lit16 v0, v0, 0x154f

    const v17, -0x79926f5b

    xor-int v0, v0, v17

    const v17, 0x2ef3dd91

    goto :goto_7

    :cond_9
    move-object/from16 v16, v0

    :goto_6
    const-string v15, "\u1a74\u06d9"

    invoke-static {v15}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v12

    move-object/from16 v16, v0

    xor-int v0, v15, v11

    mul-int/lit16 v0, v0, -0x642d

    const v17, -0x2a34a44c

    xor-int v0, v0, v17

    const v17, 0x71aef9df

    :goto_7
    xor-int v15, v15, v17

    move v14, v0

    move v13, v15

    goto/16 :goto_e

    :sswitch_c
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    const v0, 0xe525

    const v9, 0xe525

    goto :goto_8

    :sswitch_d
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    const v0, 0x8bf8

    const v9, 0x8bf8

    :goto_8
    const-string v0, "\u06d7\u1a79"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x7541

    const v17, 0x74d9e529

    xor-int v15, v15, v17

    const v17, -0x11af0d93

    goto/16 :goto_d

    :sswitch_e
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    const v0, 0x13e15f91

    add-int/2addr v0, v8

    sub-int v0, v7, v0

    if-gtz v0, :cond_a

    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    mul-int/lit8 v0, v0, -0x3

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x21ab

    const v17, 0x2f2f206

    xor-int v15, v15, v17

    const v17, -0x711df1ad

    goto/16 :goto_d

    :cond_a
    const-string v0, "\u1a79\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x4f1

    const v17, -0xd38382b

    xor-int v15, v15, v17

    const v17, 0x5af17761

    goto/16 :goto_d

    :sswitch_f
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    const v0, 0x8eae

    mul-int v7, v6, v0

    mul-int v8, v6, v6

    .line 89
    sget v0, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v0, :cond_b

    goto :goto_9

    :cond_b
    const-string v0, "\u06dc\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0x13

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x2b73

    const v17, 0xc2d2b3

    xor-int v15, v15, v17

    const v17, -0x26136b87

    goto/16 :goto_d

    :sswitch_10
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    const/16 v0, 0x27

    aget-short v6, v5, v0

    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_c

    :goto_9
    const-string v0, "\u1a78\u06e8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x4e81

    const v17, -0x2c41bbb6

    xor-int v15, v15, v17

    const v17, 0x57b600e0

    goto/16 :goto_d

    :cond_c
    const-string v0, "\u1a79\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x4a3

    const v17, -0x365cb993

    xor-int v15, v15, v17

    const v17, -0xecfdde0

    goto/16 :goto_d

    :sswitch_11
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    sget-object v5, Ll/ᩴᩴۡ;->ۢ᩵ܰ:[S

    .line 161
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_d

    :goto_a
    const-string v0, "\u06ec\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, 0x7367

    const v17, -0x686b0670

    xor-int v15, v15, v17

    const v17, -0x713221c7

    goto/16 :goto_d

    :cond_d
    const-string v0, "\u06d6\u1a79"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x3577

    const v17, 0x73062262

    xor-int v15, v15, v17

    const v17, -0x79f58a53

    goto :goto_d

    :sswitch_12
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    .line 162
    sget v0, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v0, :cond_e

    :goto_b
    const-string v0, "\u0736\u06eb"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v11

    mul-int/lit8 v0, v0, 0x5

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x34fb

    const v17, -0x42663348

    xor-int v15, v15, v17

    const v17, 0x4193f949

    goto :goto_d

    :cond_e
    const-string v0, "\u0730\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, -0x50f5

    const v17, 0x2ad77100

    xor-int v15, v15, v17

    const v17, -0x30bbef24

    goto :goto_d

    :sswitch_13
    move-object/from16 v13, p0

    move-object/from16 v14, p2

    move-object/from16 v16, v0

    sget v0, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v0, :cond_f

    :goto_c
    const-string v0, "\u05a8\u06d7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v11

    xor-int v15, v0, v12

    mul-int/lit16 v15, v15, 0x443d

    const v17, -0x474177d3

    xor-int v15, v15, v17

    const v17, 0x7406d775

    goto :goto_d

    :cond_f
    const-string v0, "\u06df\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v12

    mul-int/lit8 v0, v0, -0xd

    xor-int v15, v0, v11

    mul-int/lit16 v15, v15, -0x1415

    const v17, -0x28e24a02

    xor-int v15, v15, v17

    const v17, -0x49fb81f7

    :goto_d
    xor-int v0, v0, v17

    move v13, v0

    move v14, v15

    :goto_e
    move-object/from16 v0, v16

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x777a8b3c -> :sswitch_7
        -0x73cbb9af -> :sswitch_b
        -0x6ead2787 -> :sswitch_c
        -0x6ceb37af -> :sswitch_9
        -0x68b11ad1 -> :sswitch_a
        -0x661199e5 -> :sswitch_11
        -0x62499e2e -> :sswitch_3
        -0x5c3169ae -> :sswitch_a
        -0x5301d22a -> :sswitch_1
        -0x4ea9e27b -> :sswitch_0
        -0x4db0f77e -> :sswitch_3
        -0x4bcad2fb -> :sswitch_5
        -0x47056c94 -> :sswitch_b
        -0x43ee9519 -> :sswitch_c
        -0x41afe234 -> :sswitch_10
        -0x3058c8d3 -> :sswitch_e
        -0x2f5febb3 -> :sswitch_10
        -0x2c52efe3 -> :sswitch_11
        -0x1da63f56 -> :sswitch_5
        -0x1341bfd7 -> :sswitch_0
        -0x1271fba3 -> :sswitch_8
        -0xf979b9f -> :sswitch_12
        -0xf354b6f -> :sswitch_1
        -0xb728a3f -> :sswitch_6
        -0x8342a1f -> :sswitch_2
        0x4f8bb58 -> :sswitch_e
        0xace8e31 -> :sswitch_13
        0x137371fc -> :sswitch_4
        0x17d03fbd -> :sswitch_f
        0x22aceed9 -> :sswitch_2
        0x3c8a8626 -> :sswitch_12
        0x438e4d9a -> :sswitch_8
        0x484f0736 -> :sswitch_f
        0x49ec90c0 -> :sswitch_13
        0x51f7979b -> :sswitch_6
        0x682e25fd -> :sswitch_4
        0x6bb55804 -> :sswitch_d
        0x72e30bdc -> :sswitch_d
        0x785988dc -> :sswitch_9
        0x7f1d1d9a -> :sswitch_7
    .end sparse-switch
.end method

.method public final ֫(IZ)V
    .locals 6

    const v0, -0x3669d838    # -1230073.0f

    sget v1, Ll/֡ᩴ;->ܳۤ֫:I

    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v3, "\u1a75\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1a1b

    const v5, -0x2398afe4

    xor-int/2addr v4, v5

    const v5, -0x2b16124b

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x6bc7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 68
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v3

    if-eqz v3, :cond_7

    goto/16 :goto_5

    .line 107
    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v3, :cond_b

    goto/16 :goto_3

    .line 9
    :sswitch_1
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_8

    goto/16 :goto_1

    :sswitch_2
    sget v3, Ll/᩹;->ۤܿܳ:I

    if-eqz v3, :cond_4

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    goto/16 :goto_2

    .line 140
    :sswitch_4
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    return-void

    .line 213
    :sswitch_5
    invoke-direct {p0, p1}, Ll/ᩴᩴۡ;->֫(I)V

    .line 229
    iget-object p1, p0, Ll/ᩴᩴۡ;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    return-void

    .line 58
    :sswitch_6
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u06d8\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x72e5

    const v5, -0x5b3ad69d

    xor-int/2addr v4, v5

    const v5, -0x47734947

    goto :goto_0

    .line 87
    :sswitch_7
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_1

    goto/16 :goto_5

    :cond_1
    const-string v3, "\u06e2\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x637d

    const v5, 0x59a4871a

    xor-int/2addr v4, v5

    const v5, -0x6b307308

    goto :goto_0

    .line 195
    :sswitch_8
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u073d\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7589

    const v5, 0x68d15be5

    xor-int/2addr v4, v5

    const v5, -0x40386381

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/۠;->ܺܺܶ:I

    if-ltz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u06dc\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2e1d

    const v5, -0x473d10b6

    xor-int/2addr v4, v5

    const v5, -0x61fdb2a9

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v3, :cond_5

    :cond_4
    :goto_1
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x401f

    const v5, -0x2045e20e

    xor-int/2addr v4, v5

    const v5, -0x1f7ce6b

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a75\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xf9

    const v5, 0x39100866

    xor-int/2addr v4, v5

    const v5, 0x62748349

    goto/16 :goto_0

    .line 87
    :sswitch_b
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_6

    :goto_2
    const-string v3, "\u073f\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x218d

    const v5, -0x436e019a

    xor-int/2addr v4, v5

    const v5, 0x117b2235

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d6\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6abd

    const v5, 0x4c1b9d32    # 4.0793288E7f

    xor-int/2addr v4, v5

    const v5, 0x12ac63c8

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06d9\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x707d

    const v5, 0x7453752d

    xor-int/2addr v4, v5

    const v5, -0x50b29b4e

    goto/16 :goto_0

    .line 182
    :sswitch_c
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_3
    const-string v3, "\u1a7b\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6761

    const v5, -0x72b4e1f0

    xor-int/2addr v4, v5

    const v5, 0x2d8fc5e6

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x282b

    const v5, 0x1327374a

    xor-int/2addr v4, v5

    const v5, 0x4662cdde

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_a

    :goto_4
    const-string v3, "\u06ec\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x5f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x689b

    const v5, -0x4a9c9d4

    xor-int/2addr v4, v5

    const v5, 0x200a4bb5

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0733\u06da"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x3399

    const v5, 0x2d21433b

    xor-int/2addr v4, v5

    const v5, 0x400f94c9

    goto/16 :goto_0

    :sswitch_e
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u1a73\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5471

    const v5, -0x61b941be

    xor-int/2addr v4, v5

    const v5, 0x77b45d89

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x59

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4397

    const v5, -0x1feeb331

    xor-int/2addr v4, v5

    const v5, 0x27691b7a

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b9e87e6 -> :sswitch_6
        -0x74a8ba0b -> :sswitch_a
        -0x68c55d33 -> :sswitch_3
        -0x5fc74be3 -> :sswitch_b
        -0x58437a8d -> :sswitch_9
        -0x507ea3ae -> :sswitch_d
        -0x50079437 -> :sswitch_4
        -0x4b88fe7b -> :sswitch_2
        -0x41f439b3 -> :sswitch_7
        -0x3cfc55c4 -> :sswitch_2
        -0x38582f35 -> :sswitch_3
        -0x30214cfa -> :sswitch_9
        -0x2be58349 -> :sswitch_7
        -0x2734bfbd -> :sswitch_8
        -0x19ab4792 -> :sswitch_1
        -0x2e3fdb5 -> :sswitch_6
        -0x2c6e5f2 -> :sswitch_e
        -0x843fec -> :sswitch_1
        0x43bfb58 -> :sswitch_0
        0x45ce0be -> :sswitch_b
        0x4cf2048 -> :sswitch_c
        0x7f96970 -> :sswitch_8
        0x21847b0d -> :sswitch_c
        0x296fb293 -> :sswitch_5
        0x2c0f53f7 -> :sswitch_5
        0x45090988 -> :sswitch_e
        0x5f948b18 -> :sswitch_4
        0x69204cc2 -> :sswitch_a
        0x6cbf4809 -> :sswitch_0
        0x7ef0c04f -> :sswitch_d
    .end sparse-switch
.end method

.method public final ֫(Ljava/io/DataOutputStream;[I)V
    .locals 23

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

    const/4 v15, 0x0

    const v16, 0x4d5de138    # 2.32657792E8f

    sget v17, Ll/֡ᩴ;->ܳۤ֫:I

    sget v18, Ll/֫ܿ;->ۨ۫ᩳ:I

    const-string v19, "\u1a79\u1a74"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    sub-int v19, v18, v19

    mul-int/lit8 v19, v19, 0x45

    xor-int v2, v19, v17

    mul-int/lit16 v2, v2, -0x6d31

    const v21, 0x7fa25fba

    xor-int v2, v2, v21

    const v21, 0x69fde4f8

    xor-int v19, v19, v21

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_0
    xor-int v3, v16, v17

    mul-int/lit16 v3, v3, -0x7de3

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v2, v3

    xor-int v16, v19, v2

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v3, p2

    .line 174
    iget-object v1, v0, Ll/ᩴᩴۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v1}, Ll/ۗ᩵;->ۡᩴۙ(Ljava/lang/Object;)I

    move-result v21

    .line 161
    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v2, :cond_c

    move-object/from16 v20, v1

    goto/16 :goto_8

    :sswitch_0
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v2

    if-ltz v2, :cond_1

    :cond_0
    move-object/from16 v3, p2

    goto/16 :goto_8

    :cond_1
    :goto_1
    move-object/from16 v3, p2

    goto/16 :goto_9

    .line 46
    :sswitch_1
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_2

    :sswitch_2
    sget-boolean v2, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v3, p2

    goto/16 :goto_5

    .line 105
    :sswitch_3
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    :goto_2
    const-string v2, "\u06e7\u06db"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v17, v2

    mul-int/lit8 v2, v2, 0xd

    xor-int v3, v2, v18

    mul-int/lit16 v3, v3, -0x2d49

    const v19, 0x76811e46

    xor-int v3, v3, v19

    const v19, 0x54eafb10

    goto :goto_3

    :sswitch_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    return-void

    .line 183
    :sswitch_5
    invoke-virtual {v9, v15}, Ljava/io/DataOutputStream;->write(I)V

    .line 184
    iget v2, v14, Ll/ۘᩴۡ;->ۧ:I

    invoke-static {v9, v2}, Ll/ۗ۬;->ۛ۠۬(Ljava/lang/Object;I)V

    move-object/from16 v3, p2

    goto/16 :goto_4

    .line 182
    :sswitch_6
    invoke-static {v11}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v14, v2

    check-cast v14, Ll/ۘᩴۡ;

    .line 183
    iget v15, v14, Ll/ۘᩴۡ;->֫:I

    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    const-string v2, "\u1a77\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v3, v2, v17

    mul-int/lit16 v3, v3, 0x501f

    const v19, -0x36bc23dc    # -802242.25f

    xor-int v3, v3, v19

    const v19, -0x58ae99b

    :goto_3
    xor-int v19, v2, v19

    move v2, v3

    goto/16 :goto_0

    .line 168
    :sswitch_7
    invoke-static {v1, v13}, Ll/֨᩺;->᩷ۛۖ(Ljava/lang/Object;I)V

    .line 169
    array-length v2, v12

    invoke-static {v1, v2}, Ll/֨᩺;->᩷ۛۖ(Ljava/lang/Object;I)V

    .line 170
    invoke-virtual {v1, v12}, Ljava/io/OutputStream;->write([B)V

    return-void

    .line 186
    :sswitch_8
    invoke-virtual {v6, v9}, Ljava/io/ByteArrayOutputStream;->writeTo(Ljava/io/OutputStream;)V

    .line 187
    invoke-virtual {v8}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v2

    move-object/from16 v3, p2

    .line 167
    invoke-static {v2, v3}, Ll/᩻ܶۡ;->֫([B[I)[B

    move-result-object v12

    .line 129
    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_4

    const v13, -0x76543211

    goto/16 :goto_8

    :cond_4
    const-string v2, "\u06e7\u1a78"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v17

    xor-int v13, v2, v18

    mul-int/lit16 v13, v13, 0x5f5

    const v22, 0x212e43a3

    xor-int v13, v13, v22

    const v22, -0x456d2afb

    xor-int v2, v2, v22

    move/from16 v19, v2

    move v2, v13

    const v13, -0x76543211

    goto/16 :goto_0

    :sswitch_9
    move-object/from16 v3, p2

    .line 182
    invoke-static {v11}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const-string v2, "\u1a77\u06ec"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    xor-int v1, v2, v17

    mul-int/lit16 v1, v1, 0x511b

    const v19, 0x67773cbf

    xor-int v1, v1, v19

    const v19, 0x40b79bdb

    xor-int v19, v2, v19

    move v2, v1

    goto/16 :goto_c

    :cond_5
    const-string v1, "\u05a1\u06e0"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x67c5

    const v19, -0x7afe2055

    xor-int v2, v2, v19

    const v19, 0x743e790f

    goto/16 :goto_7

    :sswitch_a
    move-object/from16 v3, p2

    .line 181
    invoke-static/range {v20 .. v20}, Ll/֡ۨ;->᩸ۧۧ(Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {v9, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 182
    invoke-static/range {v20 .. v20}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    move-object v11, v1

    :goto_4
    const-string v1, "\u0733\u0730"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x3cb5

    const v19, 0x5995bec8

    xor-int v2, v2, v19

    const v19, -0x25fc2af7

    goto/16 :goto_7

    :sswitch_b
    move-object/from16 v3, p2

    const/4 v1, 0x0

    .line 179
    invoke-static {v9, v1}, Ll/֨᩺;->᩷ۛۖ(Ljava/lang/Object;I)V

    .line 180
    invoke-virtual {v9, v1}, Ljava/io/DataOutputStream;->writeShort(I)V

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v1

    if-ltz v1, :cond_6

    goto/16 :goto_9

    :cond_6
    const-string v1, "\u1a79\u1a79"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x2325

    const v19, -0x4a1e82b5

    xor-int v2, v2, v19

    const v19, 0x3365e599

    goto/16 :goto_7

    :sswitch_c
    move-object/from16 v3, p2

    .line 177
    invoke-static {v9, v10}, Ll/ۗ۬;->ۛ۠۬(Ljava/lang/Object;I)V

    const/16 v1, 0x71

    .line 178
    invoke-virtual {v9, v1}, Ljava/io/DataOutputStream;->write(I)V

    .line 117
    sget-boolean v1, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v1, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v1, "\u06db\u05ab"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x1273

    const v19, 0x1a5a51b3

    xor-int v2, v2, v19

    const v19, -0x243cba2b

    goto/16 :goto_7

    :sswitch_d
    move-object/from16 v3, p2

    .line 176
    new-instance v9, Ljava/io/DataOutputStream;

    invoke-direct {v9, v8}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V

    add-int/lit8 v10, v7, -0x4

    .line 89
    sget v1, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v1, :cond_8

    :goto_5
    const-string v1, "\u073f\u0733"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x43

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x23b

    const v19, -0x462bf008

    xor-int v2, v2, v19

    const v19, 0x2db7e012

    goto/16 :goto_7

    :cond_8
    const-string v1, "\u1a77\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x65a3

    const v19, -0x4a951b06

    xor-int v2, v2, v19

    const v19, -0x471695f9

    goto/16 :goto_7

    :sswitch_e
    move-object/from16 v3, p2

    .line 175
    new-instance v8, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v8, v7}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 131
    sget v1, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v1, :cond_9

    goto :goto_6

    :cond_9
    const-string v1, "\u1a79\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x65

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, -0x5fc1

    const v19, -0x5408a677

    xor-int v2, v2, v19

    const v19, -0x390a47b1

    goto :goto_7

    :sswitch_f
    move-object/from16 v3, p2

    add-int v1, v4, v5

    .line 174
    iget-object v6, v0, Ll/ᩴᩴۡ;->֫:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v6}, Ljava/io/ByteArrayOutputStream;->size()I

    move-result v2

    add-int v7, v2, v1

    sget v1, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v1, :cond_a

    goto :goto_8

    :cond_a
    const-string v1, "\u1a73\u05a8"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x1ef

    const v19, 0x5e4e714c

    xor-int v2, v2, v19

    const v19, 0x6a922223

    goto :goto_7

    :sswitch_10
    move-object/from16 v3, p2

    mul-int/lit8 v4, v21, 0x5

    const/16 v5, 0xc

    .line 186
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v1

    if-eqz v1, :cond_b

    :goto_6
    const-string v1, "\u06d9\u05a1"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, -0x13

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, 0x10f3

    const v19, 0x7fb317a2

    xor-int v2, v2, v19

    const v19, 0x6f084068

    goto :goto_7

    :cond_b
    const-string v1, "\u06d6\u0736"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    add-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x17

    xor-int v2, v1, v18

    mul-int/lit16 v2, v2, 0x6c8f

    const v19, 0xbaf53b5

    xor-int v2, v2, v19

    const v19, -0x5b159599

    :goto_7
    xor-int v19, v1, v19

    goto :goto_c

    :goto_8
    const-string v1, "\u1a78\u1a74"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    mul-int/lit8 v1, v1, 0xd

    xor-int v2, v1, v17

    mul-int/lit16 v2, v2, -0x973

    const v19, 0x4b62e09f    # 1.4868639E7f

    xor-int v2, v2, v19

    const v19, 0x546cbc8b

    goto :goto_7

    :cond_c
    const-string v2, "\u073f\u05ab"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int v2, v2, v18

    mul-int/lit8 v2, v2, 0x5f

    xor-int v0, v2, v17

    mul-int/lit16 v0, v0, -0x6b87

    const v19, 0x314ff76f

    xor-int v0, v0, v19

    const v19, -0x7b20b35f

    xor-int v19, v2, v19

    move v2, v0

    move-object/from16 v20, v1

    goto :goto_b

    :sswitch_11
    move-object/from16 v3, p2

    .line 172
    sget v0, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v0, :cond_d

    :goto_9
    const-string v0, "\u1a77\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, -0x437d

    const v2, -0x2e4d835a

    xor-int/2addr v2, v1

    const v1, 0x67c6f45f

    goto :goto_a

    :cond_d
    const-string v0, "\u05ab\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x2d1d

    const v2, -0x43e561a1

    xor-int/2addr v2, v1

    const v1, 0x73efda52

    :goto_a
    xor-int v19, v0, v1

    :goto_b
    move-object/from16 v0, p0

    :goto_c
    move-object/from16 v1, p1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ad5c1f1 -> :sswitch_4
        -0x79d0dd15 -> :sswitch_d
        -0x701fc42e -> :sswitch_b
        -0x63f8c2b1 -> :sswitch_d
        -0x5562aaea -> :sswitch_a
        -0x52011387 -> :sswitch_f
        -0x51aa76f0 -> :sswitch_5
        -0x519d43b5 -> :sswitch_0
        -0x4cd52a7c -> :sswitch_9
        -0x423518fc -> :sswitch_10
        -0x3ab4eb8c -> :sswitch_11
        -0x39f96208 -> :sswitch_c
        -0x24da6417 -> :sswitch_b
        -0x13360a6d -> :sswitch_c
        -0xff149f3 -> :sswitch_0
        -0xb3796bb -> :sswitch_3
        -0x1c1cf48 -> :sswitch_1
        0x9b490d1 -> :sswitch_10
        0x11c750c4 -> :sswitch_2
        0x149704b9 -> :sswitch_6
        0x151d67ef -> :sswitch_8
        0x1cc28f52 -> :sswitch_5
        0x201d6867 -> :sswitch_8
        0x2369dadb -> :sswitch_7
        0x29be63d1 -> :sswitch_4
        0x39ff8b85 -> :sswitch_7
        0x3e07066e -> :sswitch_1
        0x3eb2bf81 -> :sswitch_e
        0x43f8ccfb -> :sswitch_9
        0x46277883 -> :sswitch_11
        0x54fcf135 -> :sswitch_a
        0x61008823 -> :sswitch_3
        0x6bce59ee -> :sswitch_e
        0x6c242a99 -> :sswitch_6
        0x6df1823b -> :sswitch_2
        0x715dc2fe -> :sswitch_f
    .end sparse-switch
.end method
