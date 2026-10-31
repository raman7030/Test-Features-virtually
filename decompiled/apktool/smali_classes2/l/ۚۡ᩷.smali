.class public final synthetic Ll/ۚۡ᩷;
.super Ljava/lang/Object;
.source "154F"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final ᩴ᩹ۡ:[S


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x17

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Ll/ۚۡ᩷;->ᩴ᩹ۡ:[S

    return-void

    :array_0
    .array-data 2
        0x341s
        -0x544cs
        -0x5453s
        -0x5415s
        -0x547as
        -0x5457s
        -0x5448s
        -0x5453s
        -0x544fs
        -0x540as
        -0x5456s
        -0x5443s
        -0x5446s
        -0x5448s
        -0x5455s
        -0x5443s
        -0x540as
        -0x546cs
        -0x5473s
        -0x5415s
        -0x276cs
        -0x2551s
        0x2f63s
    .end array-data
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۚۡ᩷;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 27

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

    const/16 v20, 0x0

    const v21, -0x6c2e4913

    sget v22, Ll/ۗ۬;->ۘܳ᩻:I

    sget v23, Ll/ۨ;->᩺᩷ۚ:I

    const-string v24, "\u06e1\u06e0"

    invoke-static/range {v24 .. v24}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v24

    xor-int v24, v24, v22

    mul-int/lit8 v24, v24, -0x5f

    xor-int v0, v24, v23

    mul-int/lit16 v0, v0, 0x24bd

    const v26, -0x575284dc

    xor-int v0, v0, v26

    const v26, 0x89094c4

    xor-int v24, v24, v26

    move-object/from16 v16, v7

    move-object v15, v14

    move-object/from16 v11, v17

    move-object/from16 v12, v18

    move/from16 v25, v24

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v24, -0x6c2e4913

    const/16 v26, 0x0

    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    const/4 v1, 0x0

    :goto_0
    xor-int v8, v24, v23

    mul-int/lit16 v8, v8, -0x6c5b

    shr-int/lit8 v8, v8, 0x1f

    and-int/2addr v0, v8

    xor-int v24, v25, v0

    sparse-switch v24, :sswitch_data_0

    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    sget-boolean v0, Ll/֨۫;->۬᩷᩶:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_1
    move/from16 v25, v26

    goto/16 :goto_7

    .line 120
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v0, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v0, :cond_0

    goto/16 :goto_9

    .line 237
    :sswitch_1
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-gez v0, :cond_e

    goto/16 :goto_3

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_3

    .line 204
    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    :sswitch_4
    return-void

    .line 386
    :sswitch_5
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 387
    invoke-static {v5}, Ll/ܽ֡ܿ;->ܽ(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 386
    :sswitch_6
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, v2, v5}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const-string v0, "\u073a\u06d6"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0xdf3

    const v25, -0x6c434b26

    xor-int v8, v8, v25

    const v25, 0x728baa41

    goto/16 :goto_4

    :cond_2
    const-string v0, "\u1a76\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x35

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0x6af3

    const v25, 0x23e9e3c7

    xor-int v8, v8, v25

    const v25, 0x62aaea6c

    goto/16 :goto_4

    .line 383
    :sswitch_7
    sget-object v0, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-static {v0, v2, v3}, Ll/֨ۡ;->᩷᩵ܿ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v0, "\u06e8\u06d8"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x31

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x3233

    const v25, -0x20faa185

    xor-int v8, v8, v25

    const v25, -0x2fd9727f

    goto/16 :goto_4

    .line 2
    :sswitch_8
    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    const v1, 0x7ead1648

    xor-int/2addr v0, v1

    .line 101
    invoke-static {v0}, Ll/ۘۗ;->֨ܽ᩻(I)Ll/᩸ۚۢ;

    return-void

    .line 2
    :sswitch_9
    invoke-static {v12, v10, v13, v14}, Ll/ۗ᩷;->᩷ۖ۠([SIII)Ljava/lang/String;

    move-result-object v7

    .line 65
    sget v0, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v0, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v0, "\u1a79\u1a77"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v22, v0

    mul-int/lit8 v0, v0, 0x21

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x124b

    const v25, 0x56fb727a

    xor-int v8, v8, v25

    const v25, -0x20918051

    goto/16 :goto_4

    .line 2
    :sswitch_a
    sget-object v12, Ll/ۚۡ᩷;->ᩴ᩹ۡ:[S

    const/16 v10, 0x14

    const/4 v13, 0x3

    .line 227
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v0

    if-eqz v0, :cond_5

    goto/16 :goto_9

    :cond_5
    const-string v0, "\u0730\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v22

    mul-int/lit8 v0, v0, -0x4d

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x3ad

    const v25, 0x68c78934

    xor-int v8, v8, v25

    const v25, -0x7968a50e

    goto/16 :goto_4

    .line 0
    :sswitch_b
    invoke-static {}, Ll/ۤ᩷ۜ;->֫()V

    return-void

    .line 378
    :sswitch_c
    invoke-static {v1, v2, v3}, Ll/֨ۡ;->᩷᩵ܿ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 379
    invoke-static {v4}, Ll/ܽ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 380
    invoke-static {v5, v4}, Ll/֫ܿ;->ܺۤ֨(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    :goto_2
    const-string v0, "\u06e0\u05ab"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit8 v8, v8, -0x6b

    const v25, 0xcf9bed6

    xor-int v8, v8, v25

    const v25, 0x783a0607

    goto/16 :goto_4

    :cond_6
    const-string v0, "\u06e0\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0x254b

    const v25, -0x2e257998

    xor-int v8, v8, v25

    const v25, -0x21763e1c

    goto/16 :goto_4

    :sswitch_d
    const/16 v0, 0x9

    const/16 v3, 0xb

    .line 378
    invoke-static {v11, v0, v3, v14}, Ll/֫᩺;->ۤᩴܿ([SIII)Ljava/lang/String;

    move-result-object v3

    .line 168
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_7

    :goto_3
    const-string v0, "\u06e1\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, 0x2437

    const v25, 0x2a1539de

    xor-int v8, v8, v25

    const v25, 0x4f5de6b6

    goto/16 :goto_4

    :cond_7
    const-string v0, "\u0736\u06e7"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, 0x50bb

    const v25, 0x6343b4a3

    xor-int v8, v8, v25

    const v25, 0x76a1c5b3

    goto/16 :goto_4

    :sswitch_e
    move/from16 v0, v26

    .line 378
    invoke-static {v15, v0, v9, v14}, Ll/ۗۗ;->ۧܺۧ([SIII)Ljava/lang/String;

    move-result-object v2

    sget-object v11, Ll/ۚۡ᩷;->ᩴ᩹ۡ:[S

    .line 244
    sget v8, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v8, :cond_8

    const-string v8, "\u06d8\u06e4"

    invoke-static {v8}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v8

    xor-int v8, v8, v23

    move/from16 v25, v0

    xor-int v0, v8, v22

    mul-int/lit16 v0, v0, 0x3f95

    const v26, 0x248833be

    xor-int v0, v0, v26

    const v26, 0x14cd6639

    goto/16 :goto_5

    :cond_8
    move/from16 v25, v0

    const-string v0, "\u1a76\u073f"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, 0x7f

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0x77f7

    const v26, -0x3e26f349

    xor-int v8, v8, v26

    const v26, -0xa9ba02a

    goto/16 :goto_a

    :sswitch_f
    move/from16 v25, v26

    const/16 v9, 0x8

    .line 112
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_9

    goto/16 :goto_7

    :cond_9
    const-string v0, "\u06d8\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x407b

    const v26, -0x56a59bee

    xor-int v8, v8, v26

    const v26, -0x2154d397

    goto/16 :goto_a

    .line 378
    :sswitch_10
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    sget-object v15, Ll/ۚۡ᩷;->ᩴ᩹ۡ:[S

    const/16 v26, 0x1

    .line 47
    sget v0, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v0, :cond_a

    goto/16 :goto_9

    :cond_a
    const-string v0, "\u06e1\u0736"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x516d

    const v25, 0x49db27c8    # 1795321.0f

    xor-int v8, v8, v25

    const v25, -0x31d53226

    :goto_4
    xor-int v25, v0, v25

    goto/16 :goto_b

    :sswitch_11
    move-object/from16 v0, p0

    move/from16 v25, v26

    .line 2
    iget v8, v0, Ll/ۚۡ᩷;->᩸:I

    packed-switch v8, :pswitch_data_0

    const-string v0, "\u0730\u1a78"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v23

    mul-int/lit8 v0, v0, -0x37

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0x610b

    const v26, -0x2b2f2d

    xor-int v8, v8, v26

    const v26, 0x31c17934

    goto/16 :goto_a

    :pswitch_0
    const-string v8, "\u1a77\u06d9"

    invoke-static {v8}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v8

    add-int v8, v8, v22

    mul-int/lit8 v8, v8, -0x6b

    xor-int v0, v8, v23

    mul-int/lit16 v0, v0, 0x4119

    const v26, -0x5639be09

    xor-int v0, v0, v26

    const v26, 0x3cac7248

    :goto_5
    xor-int v8, v8, v26

    move/from16 v26, v25

    move/from16 v25, v8

    goto/16 :goto_0

    :pswitch_1
    const-string v0, "\u073d\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, 0x3d6f

    const v26, -0x30e82ecb

    xor-int v8, v8, v26

    const v26, 0x1f72b763

    goto/16 :goto_a

    :sswitch_12
    move/from16 v25, v26

    const v0, 0x9bd5

    const v14, 0x9bd5

    goto :goto_6

    :sswitch_13
    move/from16 v25, v26

    const v0, 0xabd9

    const v14, 0xabd9

    :goto_6
    const-string v0, "\u06e8\u1a75"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, 0x4b67

    const v26, 0x2e3f493d

    xor-int v8, v8, v26

    const v26, -0x3faec4a6

    goto/16 :goto_a

    :sswitch_14
    move/from16 v25, v26

    mul-int v0, v20, v21

    sub-int v0, v19, v0

    if-gez v0, :cond_b

    const-string v0, "\u06df\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x12c7

    const v26, -0x49169d42

    xor-int v8, v8, v26

    const v26, 0x26294e3d

    goto/16 :goto_a

    :cond_b
    const-string v0, "\u06d9\u0730"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x5f61

    const v26, 0x4a4ef71f    # 3390919.8f

    xor-int v8, v8, v26

    const v26, 0x39656c9

    goto/16 :goto_a

    :sswitch_15
    move/from16 v25, v26

    add-int v0, v20, v18

    mul-int v19, v0, v0

    const/16 v21, 0x634c

    .line 298
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v0

    if-gtz v0, :cond_c

    :goto_7
    const-string v0, "\u1a7a\u05a8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x1547

    const v26, 0x212bbeef

    xor-int v8, v8, v26

    const v26, -0x2538f031

    goto/16 :goto_a

    :cond_c
    const-string v0, "\u06dc\u06d8"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v23, v0

    mul-int/lit8 v0, v0, -0x7d

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0x60e9

    const v26, -0x7e15e23

    xor-int v8, v8, v26

    const v26, 0x4d0e48e8

    goto :goto_a

    :sswitch_16
    move/from16 v25, v26

    aget-short v20, v16, v17

    const/16 v18, 0x18d3

    .line 227
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_d

    :goto_8
    move/from16 v26, v25

    goto :goto_9

    :cond_d
    const-string v0, "\u073d\u073a"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v22

    xor-int v8, v0, v23

    mul-int/lit16 v8, v8, -0x3a43

    const v26, 0x3eb915c7

    xor-int v8, v8, v26

    const v26, -0x303276b9

    goto :goto_a

    :sswitch_17
    move/from16 v25, v26

    sget-object v16, Ll/ۚۡ᩷;->ᩴ᩹ۡ:[S

    const/16 v17, 0x0

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v0

    if-gtz v0, :cond_f

    goto :goto_8

    :cond_e
    :goto_9
    const-string v0, "\u06e4\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0xef5

    const v25, -0x3d26647f

    xor-int v8, v8, v25

    const v25, 0x2aa9e820

    goto/16 :goto_4

    :cond_f
    const-string v0, "\u1a74\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v23

    xor-int v8, v0, v22

    mul-int/lit16 v8, v8, -0x18dd

    const v26, 0xda3964e

    xor-int v8, v8, v26

    const v26, -0x4bf0d42d

    :goto_a
    xor-int v0, v0, v26

    move/from16 v26, v25

    move/from16 v25, v0

    :goto_b
    move v0, v8

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6caddda7 -> :sswitch_2
        -0x6488e261 -> :sswitch_3
        -0x5d74fb02 -> :sswitch_c
        -0x56bdca46 -> :sswitch_b
        -0x53782967 -> :sswitch_11
        -0x51a6b2db -> :sswitch_8
        -0x4cea9781 -> :sswitch_a
        -0x4a62c19f -> :sswitch_16
        -0x42cd3b70 -> :sswitch_10
        -0x3c662634 -> :sswitch_1
        -0x35d54de5 -> :sswitch_d
        -0x34a788f0 -> :sswitch_10
        -0x343b0c8c -> :sswitch_13
        -0x30db21a6 -> :sswitch_c
        -0x24e0530a -> :sswitch_6
        -0x1ddc4b9f -> :sswitch_d
        -0x16ba1a89 -> :sswitch_e
        -0x13acb639 -> :sswitch_f
        -0x124bc94e -> :sswitch_15
        -0x7429237 -> :sswitch_1
        -0x32d50a7 -> :sswitch_e
        -0x17ceca0 -> :sswitch_2
        -0xd22f32 -> :sswitch_9
        0x24e77fc -> :sswitch_f
        0x3f1e2ed -> :sswitch_14
        0x450f920 -> :sswitch_12
        0xaa33a82 -> :sswitch_7
        0x11e5fbcb -> :sswitch_5
        0x147beceb -> :sswitch_11
        0x16513fc7 -> :sswitch_12
        0x1f8f12b6 -> :sswitch_3
        0x21efd5d6 -> :sswitch_13
        0x27ac6d44 -> :sswitch_9
        0x2ad84ba8 -> :sswitch_14
        0x2c97fbc7 -> :sswitch_0
        0x3c774313 -> :sswitch_17
        0x448c5a10 -> :sswitch_15
        0x4845b653 -> :sswitch_b
        0x49292c79 -> :sswitch_6
        0x50f214f5 -> :sswitch_0
        0x5a4384a4 -> :sswitch_4
        0x5b7d7a90 -> :sswitch_a
        0x5db3fcf9 -> :sswitch_4
        0x6026426d -> :sswitch_16
        0x6597880c -> :sswitch_7
        0x6c51e8f1 -> :sswitch_8
        0x703c7952 -> :sswitch_5
        0x7931d148 -> :sswitch_17
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
