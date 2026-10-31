.class public final synthetic Ll/ۛ֨᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩹ۜ᩹:[S


# instance fields
.field public final synthetic ᩸:Lbin/mt/plus/Main;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۛ֨᩷;->᩹ۜ᩹:[S

    return-void

    :array_0
    .array-data 2
        0x1f0bs
        -0x7b6cs
        -0x7b69s
        -0x7b69s
        -0x7b3cs
        -0x7b6as
        -0x7b3es
        -0x7b6es
        -0x7b70s
        -0x7b3cs
        -0x7b6fs
        -0x7b39s
        -0x7b6cs
        -0x7b6cs
        -0x7b40s
        -0x7b3ds
        -0x7b3bs
        -0x7b6as
        -0x7b6cs
        -0x7b6fs
        -0x7b6fs
        -0x7b6fs
        -0x7b39s
        -0x7b69s
        -0x7b6fs
    .end array-data
.end method

.method public synthetic constructor <init>(Lbin/mt/plus/Main;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۛ֨᩷;->᩸:Lbin/mt/plus/Main;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 24

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

    const v15, -0x48549262

    sget v16, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v17, Ll/ۗ᩵;->֫۠۟:I

    const-string v18, "\u06d8\u073a"

    invoke-static/range {v18 .. v18}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v18

    add-int v18, v18, v16

    mul-int/lit8 v18, v18, 0x7d

    xor-int v0, v18, v17

    mul-int/lit16 v0, v0, 0x6db

    const v20, -0x51b194c0

    xor-int v0, v0, v20

    const v20, 0xc936f2a

    xor-int v18, v18, v20

    move-object v3, v2

    move-object/from16 v21, v4

    move-object v13, v12

    move/from16 v19, v18

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v18, -0x48549262

    :goto_0
    xor-int v5, v18, v17

    mul-int/lit16 v5, v5, -0x5ea3

    shr-int/lit8 v5, v5, 0x1f

    and-int/2addr v0, v5

    xor-int v18, v19, v0

    sparse-switch v18, :sswitch_data_0

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    goto :goto_1

    .line 255
    :sswitch_0
    sget v0, Ll/᩹;->ۤܿܳ:I

    if-eqz v0, :cond_0

    :goto_1
    move-object/from16 v5, p0

    goto/16 :goto_7

    :cond_0
    :goto_2
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    goto/16 :goto_9

    .line 229
    :sswitch_1
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    goto/16 :goto_8

    .line 141
    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v0, :cond_1

    goto :goto_1

    .line 38
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    return-void

    .line 33
    :sswitch_4
    new-instance v0, Ll/᩻ۨۡ;

    invoke-direct {v0, v1}, Ll/᩻ۨۡ;-><init>(Ljava/lang/Object;)V

    invoke-static {v2, v0}, Lcom/umeng/commonsdk/UMConfigure;->getOaid(Landroid/content/Context;Lcom/umeng/commonsdk/listener/OnGetOaidListener;)V

    goto/16 :goto_4

    :sswitch_5
    return-void

    :sswitch_6
    const/4 v0, 0x0

    .line 40
    invoke-static {v2, v3, v0, v4, v0}, Lcom/umeng/commonsdk/UMConfigure;->init(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    sget-object v0, Lcom/umeng/analytics/MobclickAgent$PageMode;->LEGACY_MANUAL:Lcom/umeng/analytics/MobclickAgent$PageMode;

    invoke-static {v0}, Lcom/umeng/analytics/MobclickAgent;->setPageCollectionMode(Lcom/umeng/analytics/MobclickAgent$PageMode;)V

    move-object/from16 v5, p0

    goto/16 :goto_5

    .line 37
    :sswitch_7
    invoke-static {v13, v14, v15, v12}, Ll/֨ᩴ;->۠᩹ܺ([SIII)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    .line 268
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    const-string v0, "\u06ec\u06e8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v16, v0

    mul-int/lit8 v0, v0, 0x29

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, -0xdbb

    const v19, 0x250b5bde

    xor-int v5, v5, v19

    const v19, 0x1d1cb61

    goto :goto_3

    :cond_3
    const-string v0, "\u073a\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x7381

    const v19, 0x165a7172

    xor-int v5, v5, v19

    const v19, -0x20b24ea8

    goto :goto_3

    .line 37
    :sswitch_8
    sget-object v13, Ll/ۛ֨᩷;->᩹ۜ᩹:[S

    const/4 v14, 0x1

    const/16 v15, 0x18

    .line 135
    sget v0, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    const-string v0, "\u1a78\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x23

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4941

    const v19, -0x3b92725

    xor-int v5, v5, v19

    const v19, 0x6a6760f6

    :goto_3
    xor-int v19, v0, v19

    move v0, v5

    goto/16 :goto_0

    .line 570
    :sswitch_9
    new-instance v1, Ll/᩻۠᩷;

    const/4 v0, 0x0

    .line 279
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_5

    goto/16 :goto_1

    .line 570
    :cond_5
    invoke-direct {v1, v0}, Ll/᩻۠᩷;-><init>(I)V

    .line 30
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "\u06e0\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v5, v0, v16

    mul-int/lit16 v5, v5, 0x29f3

    const v19, -0x17b7794b

    xor-int v5, v5, v19

    const v19, 0x6b0ddb47

    goto :goto_3

    :cond_6
    :goto_4
    const-string v0, "\u1a79\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v5, v0, v17

    mul-int/lit16 v5, v5, 0x4a11

    const v19, -0x465fa52c

    xor-int v5, v5, v19

    const v19, 0x5a32cfe8

    goto :goto_3

    .line 37
    :sswitch_a
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    move-object/from16 v5, p0

    iget-object v2, v5, Ll/ۛ֨᩷;->᩸:Lbin/mt/plus/Main;

    if-nez v0, :cond_7

    const-string v0, "\u1a74\u1a76"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x3

    move-object/from16 v19, v1

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3d17

    const v22, 0x716b493

    xor-int v1, v1, v22

    const v22, -0x316bb9ac

    goto/16 :goto_a

    :cond_7
    :goto_5
    move-object/from16 v19, v1

    const-string v0, "\u06da\u06dc"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x7e5f

    const v22, 0x68f4e69a

    xor-int v1, v1, v22

    const v22, -0x4ab4806a

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    .line 2
    sget v0, Lbin/mt/plus/Main;->ܿܽ:I

    .line 569
    sget v0, Ll/ۜۨۡ;->֫:I

    .line 330
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v0

    if-ltz v0, :cond_8

    goto/16 :goto_7

    :cond_8
    const-string v0, "\u073a\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x6b

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x5759

    const v22, 0x33f5a624

    xor-int v1, v1, v22

    const v22, -0x66ba6a52

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    const v0, 0xa993

    const v12, 0xa993

    goto :goto_6

    :sswitch_d
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    const v0, 0x84a1

    const v12, 0x84a1

    :goto_6
    const-string v0, "\u05ab\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x2bef

    const v22, 0x25ecd893

    xor-int v1, v1, v22

    const v22, 0x8cfe1e7

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    add-int v0, v10, v11

    add-int/2addr v0, v0

    sub-int/2addr v0, v9

    if-ltz v0, :cond_9

    const-string v0, "\u1a73\u05a1"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, -0x25

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x1305

    const v22, -0x75c2dcb1

    xor-int v1, v1, v22

    const v22, -0x6c90b8b

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u073f\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x49

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x29d

    const v22, -0x1996a16a

    xor-int v1, v1, v22

    const v22, 0x1920f4f7

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    const v11, 0xbfad2c1

    .line 412
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_a

    goto :goto_7

    :cond_a
    const-string v0, "\u073a\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x502d

    const v22, -0x373ad3e0    # -403809.0f

    xor-int v1, v1, v22

    const v22, 0x214391fa

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    mul-int v9, v8, v8

    mul-int v10, v7, v7

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v0

    if-eqz v0, :cond_b

    :goto_7
    const-string v0, "\u06e8\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x71

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x614f

    const v19, 0x2c31f064

    xor-int v1, v1, v19

    const v19, 0x1cf71bc6

    xor-int v19, v0, v19

    move v0, v1

    const/4 v1, 0x0

    goto/16 :goto_0

    :cond_b
    const-string v0, "\u06e2\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x7b

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x5b43

    const v22, -0xff53b1b

    xor-int v1, v1, v22

    const v22, 0x4fa1abb6

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    add-int/lit16 v8, v7, 0x3761

    .line 28
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v0

    if-nez v0, :cond_c

    const-string v0, "\u06eb\u073d"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x43

    xor-int v1, v0, v17

    mul-int/lit8 v1, v1, 0x55

    const v22, -0x4341bfd9

    xor-int v1, v1, v22

    const v22, -0x78c1175e

    goto/16 :goto_a

    :cond_c
    const-string v0, "\u06e1\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, 0x27

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x72db

    const v22, 0x6448c6bd

    xor-int v1, v1, v22

    const v22, -0x8c3c76c

    goto/16 :goto_a

    :sswitch_12
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    aget-short v7, v21, v6

    .line 142
    sget v0, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v0, :cond_d

    goto :goto_8

    :cond_d
    const-string v0, "\u1a77\u06e4"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, -0x12cf

    const v22, 0x6d72f627

    xor-int v1, v1, v22

    const v22, -0x664ba3c1

    goto :goto_a

    :sswitch_13
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    const/4 v6, 0x0

    .line 221
    sget-boolean v0, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v0, :cond_e

    :goto_8
    const-string v0, "\u06da\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v16

    mul-int/lit8 v0, v0, -0x71

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x17ab

    const v22, 0x39115b8e

    xor-int v1, v1, v22

    const v22, -0x66a49288

    goto :goto_a

    :cond_e
    const-string v0, "\u06d6\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v16

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x27c3

    const v22, 0x67c03ee8

    xor-int v1, v1, v22

    const v22, -0x7ce71a4f

    goto :goto_a

    :sswitch_14
    move-object/from16 v5, p0

    move-object/from16 v19, v1

    sget-object v21, Ll/ۛ֨᩷;->᩹ۜ᩹:[S

    .line 376
    sget v0, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v0, :cond_f

    :goto_9
    const-string v0, "\u06da\u06d7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0xcc1

    const v22, -0x7ee665cc

    xor-int v1, v1, v22

    const v22, 0x44db855d

    goto :goto_a

    :cond_f
    const-string v0, "\u1a78\u1a7a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x2f

    xor-int v1, v0, v16

    mul-int/lit16 v1, v1, 0x1cd7

    const v22, -0x255a825b

    xor-int v1, v1, v22

    const v22, 0xebec68f

    :goto_a
    xor-int v0, v0, v22

    move-object/from16 v23, v19

    move/from16 v19, v0

    move v0, v1

    move-object/from16 v1, v23

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d2f146c -> :sswitch_5
        -0x7399f1f0 -> :sswitch_e
        -0x703555b5 -> :sswitch_2
        -0x650db070 -> :sswitch_14
        -0x58f36d3b -> :sswitch_10
        -0x525b8081 -> :sswitch_4
        -0x508d29c5 -> :sswitch_3
        -0x4f898007 -> :sswitch_0
        -0x49762e35 -> :sswitch_13
        -0x4224f051 -> :sswitch_b
        -0x4069728f -> :sswitch_12
        -0x28c45027 -> :sswitch_12
        -0x21e6a395 -> :sswitch_4
        -0x18d2fe1c -> :sswitch_c
        -0x16bbc1d7 -> :sswitch_8
        -0x14c80d08 -> :sswitch_7
        -0xe30fab8 -> :sswitch_1
        -0xd5526a2 -> :sswitch_3
        -0xa5c3d7b -> :sswitch_7
        0x5ffffc -> :sswitch_9
        0x63aac8e -> :sswitch_f
        0xe125008 -> :sswitch_5
        0x10954ade -> :sswitch_1
        0x141636ad -> :sswitch_b
        0x1941229f -> :sswitch_14
        0x2008a21b -> :sswitch_9
        0x26b36415 -> :sswitch_10
        0x2ca33c5a -> :sswitch_11
        0x2db0d0cb -> :sswitch_d
        0x31827539 -> :sswitch_13
        0x32f6864b -> :sswitch_8
        0x40999e9d -> :sswitch_6
        0x43580f5d -> :sswitch_c
        0x4dfc425a -> :sswitch_a
        0x4f7c8774 -> :sswitch_f
        0x6a590d4c -> :sswitch_6
        0x6c485e29 -> :sswitch_d
        0x7156b7cf -> :sswitch_11
        0x71c2a7fa -> :sswitch_a
        0x7560d2fb -> :sswitch_e
        0x78401892 -> :sswitch_2
        0x7d89da93 -> :sswitch_0
    .end sparse-switch
.end method
