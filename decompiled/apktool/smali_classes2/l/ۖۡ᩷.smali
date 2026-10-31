.class public final synthetic Ll/ۖۡ᩷;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ۚۖ᩻:[S


# instance fields
.field public final synthetic ᩸:Ll/᩶ۡ᩷;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x19

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۖۡ᩷;->ۚۖ᩻:[S

    return-void

    :array_0
    .array-data 2
        0x7dbs
        0x2f49s
        0x2f4as
        0x2f4as
        0x2f19s
        0x2f4bs
        0x2f1fs
        0x2f4fs
        0x2f4ds
        0x2f19s
        0x2f4cs
        0x2f1as
        0x2f49s
        0x2f49s
        0x2f1ds
        0x2f1es
        0x2f18s
        0x2f4bs
        0x2f49s
        0x2f4cs
        0x2f4cs
        0x2f4cs
        0x2f1as
        0x2f4as
        0x2f4cs
    .end array-data
.end method

.method public synthetic constructor <init>(Ll/᩶ۡ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۡ᩷;->᩸:Ll/᩶ۡ᩷;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 20

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

    const v12, 0x588dbb15

    sget v13, Ll/ۗۗ;->ۨ۬ۖ:I

    sget v14, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v15, "\u1a76\u06dc"

    invoke-static {v15}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v15

    xor-int/2addr v15, v13

    mul-int/lit8 v15, v15, -0x5d

    xor-int v0, v15, v14

    mul-int/lit16 v0, v0, 0x674b

    const v17, -0x2d9e6d00

    xor-int v0, v0, v17

    const v17, 0xc1545ac

    xor-int v15, v15, v17

    move-object v2, v1

    move-object v10, v9

    move/from16 v16, v15

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v15, 0x588dbb15

    :goto_0
    xor-int/2addr v15, v14

    mul-int/lit16 v15, v15, -0x568f

    shr-int/lit8 v15, v15, 0x1f

    and-int/2addr v0, v15

    xor-int v15, v16, v0

    sparse-switch v15, :sswitch_data_0

    .line 123
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    goto :goto_1

    .line 119
    :sswitch_0
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_0

    :goto_1
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    goto/16 :goto_7

    :cond_0
    move/from16 v16, v9

    goto/16 :goto_4

    :sswitch_1
    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_2

    :cond_1
    move/from16 v16, v9

    goto :goto_2

    :cond_2
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    return-void

    .line 23
    :sswitch_4
    invoke-static {v10, v11, v12, v9}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v0

    move/from16 v16, v9

    const/4 v9, 0x0

    .line 26
    invoke-static {v1, v0, v9}, Lcom/umeng/commonsdk/UMConfigure;->preInit(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_3

    :sswitch_5
    move/from16 v16, v9

    const/16 v12, 0x18

    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v0, "\u05ab\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, -0x3143

    const v17, -0xae16ebf

    xor-int v9, v9, v17

    const v17, -0xd42d76a

    goto/16 :goto_5

    :sswitch_6
    move/from16 v16, v9

    .line 23
    sget-object v10, Ll/ۖۡ᩷;->ۚۖ᩻:[S

    const/4 v11, 0x1

    .line 13
    sget v0, Ll/۠;->ܺܺܶ:I

    if-ltz v0, :cond_4

    :goto_2
    const-string v0, "\u1a77\u06db"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, -0xcc5

    const v17, 0x46fc75e6

    xor-int v9, v9, v17

    const v17, -0x74515a4f

    goto/16 :goto_5

    :cond_4
    const-string v0, "\u1a75\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, -0x4c4f

    const v17, 0x1bb0a362

    xor-int v9, v9, v17

    const v17, -0x2c873dfc

    goto :goto_5

    :sswitch_7
    return-void

    :sswitch_8
    move/from16 v16, v9

    .line 254
    sget v0, Ll/ۜۨۡ;->֫:I

    .line 23
    invoke-static {}, Ll/ܺۤۡ;->֫()Z

    move-result v0

    if-nez v0, :cond_5

    const-string v0, "\u06e0\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, 0x47

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, -0x3dff

    const v17, 0x1ccbba2f

    xor-int v9, v9, v17

    const v17, 0x36333e27

    goto :goto_5

    :cond_5
    :goto_3
    const-string v0, "\u073f\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, -0xf1b

    const v17, -0x7d23531a

    xor-int v9, v9, v17

    const v17, 0x6dd3e800

    goto :goto_5

    :sswitch_9
    move/from16 v16, v9

    .line 7
    invoke-static {v1}, Ll/ۗ᩷;->ۖۧۙ(Ljava/lang/Object;)Ljava/lang/Class;

    .line 192
    sget v0, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v0, :cond_6

    :goto_4
    const-string v0, "\u06d9\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x65

    xor-int v9, v0, v13

    mul-int/lit16 v9, v9, -0x2b51

    const v17, -0x7eed14e

    xor-int v9, v9, v17

    const v17, 0x6aa94a36

    goto :goto_5

    :cond_6
    const-string v0, "\u06e0\u06eb"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, 0x59

    xor-int v9, v0, v14

    mul-int/lit16 v9, v9, -0x105d

    const v17, 0x2b7bfcdd

    xor-int v9, v9, v17

    const v17, 0x4b2ce42

    :goto_5
    xor-int v0, v0, v17

    move/from16 v19, v16

    move/from16 v16, v0

    move v0, v9

    move/from16 v9, v19

    goto/16 :goto_0

    :sswitch_a
    move/from16 v16, v9

    .line 2
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    move-object/from16 v9, p0

    .line 4
    iget-object v1, v9, Ll/ۖۡ᩷;->᩸:Ll/᩶ۡ᩷;

    .line 140
    sget v0, Ll/֡֡;->֫ۤܳ:I

    if-ltz v0, :cond_7

    goto/16 :goto_8

    :cond_7
    const-string v0, "\u0730\u06ec"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5b

    move-object/from16 v17, v1

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x1a7f

    const v18, 0x348b4821

    xor-int v1, v1, v18

    const v18, 0x22f2e5fd

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v9, p0

    const v0, 0xc772

    goto :goto_6

    :sswitch_c
    move-object/from16 v9, p0

    const/16 v0, 0x2f7c

    :goto_6
    const-string v16, "\u1a78\u073f"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    xor-int v16, v16, v13

    mul-int/lit8 v16, v16, 0x51

    move/from16 v17, v0

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, 0x3caf

    const v18, -0x85c60f4

    xor-int v0, v0, v18

    const v18, -0x3891f03e

    xor-int v16, v16, v18

    move/from16 v9, v17

    goto/16 :goto_0

    :sswitch_d
    move/from16 v16, v9

    move-object/from16 v9, p0

    add-int v0, v7, v8

    sub-int/2addr v0, v6

    if-ltz v0, :cond_8

    const-string v0, "\u06e2\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    move-object/from16 v17, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x120d

    const v18, 0x5f633ee4

    xor-int v1, v1, v18

    const v18, 0x172899bb

    goto/16 :goto_a

    :cond_8
    move-object/from16 v17, v1

    const-string v0, "\u05a1\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x1d9f

    const v18, -0x295a219e

    xor-int v1, v1, v18

    const v18, 0x586f187f

    goto/16 :goto_a

    :sswitch_e
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    const v8, 0xe295b64

    .line 77
    sget-boolean v0, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v0, :cond_9

    goto :goto_7

    :cond_9
    const-string v0, "\u0730\u1a75"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x7f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x6c17

    const v18, 0x5ea9fdb

    xor-int v1, v1, v18

    const v18, 0x103c04f8

    goto/16 :goto_a

    :sswitch_f
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    mul-int v6, v4, v5

    mul-int v7, v4, v4

    .line 40
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_a

    :goto_7
    const-string v0, "\u06d6\u06e2"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, -0x6b2d

    const v18, -0x7f3114af

    xor-int v1, v1, v18

    const v18, -0x398f8da6

    goto/16 :goto_a

    :cond_a
    const-string v0, "\u05a8\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v13, v0

    mul-int/lit8 v0, v0, -0x17

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x251f

    const v18, -0x7f4db71f

    xor-int v1, v1, v18

    const v18, 0x714469b8

    goto/16 :goto_a

    :sswitch_10
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    aget-short v4, v2, v3

    const/16 v5, 0x786c

    sget-boolean v0, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v0, :cond_b

    move-object/from16 v1, v17

    :goto_8
    const-string v0, "\u05a1\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x2d

    move-object/from16 v17, v1

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x15af

    const v18, -0x220e66c1

    xor-int v1, v1, v18

    const v18, -0x495d0905

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u073d\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x6f

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x713b

    const v18, 0x5f557f14

    xor-int v1, v1, v18

    const v18, 0x5f66374e

    goto/16 :goto_a

    :sswitch_11
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    const/4 v3, 0x0

    .line 76
    sget v0, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v0, :cond_c

    goto :goto_9

    :cond_c
    const-string v0, "\u1a7a\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x194b

    const v18, -0x3607626a

    xor-int v1, v1, v18

    const v18, 0x7e6ed6e2    # 7.9368E37f

    goto :goto_a

    :sswitch_12
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    sget-boolean v0, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v0, :cond_d

    goto :goto_9

    :cond_d
    const-string v0, "\u06e8\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v13

    mul-int/lit16 v1, v1, 0x7eed

    const v18, 0x46a880c6

    xor-int v1, v1, v18

    const v18, 0x3b2ea293

    goto :goto_a

    :sswitch_13
    move-object/from16 v17, v1

    move/from16 v16, v9

    move-object/from16 v9, p0

    sget-object v2, Ll/ۖۡ᩷;->ۚۖ᩻:[S

    .line 31
    sget v0, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v0, :cond_e

    :goto_9
    const-string v0, "\u073f\u06e0"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    mul-int/lit8 v0, v0, -0x6b

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0xcbd

    const v18, 0x163ba6a

    xor-int v1, v1, v18

    const v18, -0x410e8844

    goto :goto_a

    :cond_e
    const-string v0, "\u06d6\u06da"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v13

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x5e61

    const v18, -0x536ebcdc

    xor-int v1, v1, v18

    const v18, -0x3c91a688

    :goto_a
    xor-int v0, v0, v18

    move/from16 v9, v16

    move/from16 v16, v0

    move v0, v1

    move-object/from16 v1, v17

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ff0fd71 -> :sswitch_c
        -0x7e76db08 -> :sswitch_d
        -0x774bebb7 -> :sswitch_e
        -0x76295e74 -> :sswitch_b
        -0x74b0c877 -> :sswitch_10
        -0x6d172594 -> :sswitch_2
        -0x6146975a -> :sswitch_11
        -0x5a5d86c3 -> :sswitch_1
        -0x57edd978 -> :sswitch_12
        -0x5258ba14 -> :sswitch_13
        -0x4f395d7d -> :sswitch_f
        -0x453851bf -> :sswitch_8
        -0x4395fc38 -> :sswitch_7
        -0x352b6072 -> :sswitch_6
        -0x1df5605e -> :sswitch_c
        -0x16a169be -> :sswitch_6
        -0x15688ddf -> :sswitch_11
        -0x9b670f6 -> :sswitch_b
        -0x15bb8e1 -> :sswitch_13
        0x2c280d1 -> :sswitch_5
        0x79f4495 -> :sswitch_4
        0xafb3e60 -> :sswitch_0
        0x17c9a4dc -> :sswitch_3
        0x1abde44a -> :sswitch_10
        0x1b74c509 -> :sswitch_d
        0x2274bb35 -> :sswitch_9
        0x2b0ee79e -> :sswitch_1
        0x3038d958 -> :sswitch_a
        0x34410072 -> :sswitch_2
        0x350b96d5 -> :sswitch_7
        0x364c592b -> :sswitch_12
        0x3c63b0ee -> :sswitch_8
        0x48d64592 -> :sswitch_a
        0x4e9cde29 -> :sswitch_f
        0x50141223 -> :sswitch_9
        0x55b4898e -> :sswitch_3
        0x5e1d467c -> :sswitch_0
        0x5f660631 -> :sswitch_4
        0x7652900d -> :sswitch_e
        0x7ec74811 -> :sswitch_5
    .end sparse-switch
.end method
