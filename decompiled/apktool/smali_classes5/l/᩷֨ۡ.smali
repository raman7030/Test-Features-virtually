.class public final synthetic Ll/᩷֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/util/function/IntConsumer;


# instance fields
.field public final synthetic ۗ:Ljava/lang/String;

.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ۬:Ll/ۢ۠ۡ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ljava/util/ArrayList;

.field public final synthetic ᩹:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/app/Activity;Ll/֡ۚۢ;Ljava/lang/String;Ljava/lang/String;Ll/ۢ۠ۡ;)V
    .locals 6

    const v0, -0x562fe857

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    sget v2, Ll/ۗ᩷;->᩸᩺ᩳ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a74\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f91

    const v5, -0x34540d96    # -2.2537428E7f

    xor-int/2addr v4, v5

    const v5, 0x6fb3332a

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x2659

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_9

    goto/16 :goto_2

    :sswitch_0
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_a

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-ltz v3, :cond_8

    goto :goto_1

    :sswitch_2
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/᩷֨ۡ;->ۙ:Ljava/lang/String;

    iput-object p5, p0, Ll/᩷֨ۡ;->ۗ:Ljava/lang/String;

    iput-object p6, p0, Ll/᩷֨ۡ;->۬:Ll/ۢ۠ۡ;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/᩷֨ۡ;->᩶:Ll/֡ۚۢ;

    .line 3
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v3, "\u1a75\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3cd7

    const v5, 0x78cfec09

    xor-int/2addr v4, v5

    const v5, -0x7f287c67

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u1a76\u1a76"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3ea5

    const v5, -0x35d7555c    # -2763433.0f

    xor-int/2addr v4, v5

    const v5, 0x7e7f47c8

    goto :goto_0

    :sswitch_8
    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v3, :cond_2

    :goto_1
    const-string v3, "\u06d7\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1891

    const v5, -0x5dbd0791

    xor-int/2addr v4, v5

    const v5, 0x5421d92e

    goto/16 :goto_0

    :cond_2
    const-string v3, "\u06d6\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2893

    const v5, 0x518c11f3

    xor-int/2addr v4, v5

    const v5, -0x600578b

    goto/16 :goto_0

    .line 4
    :sswitch_9
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v3

    if-eqz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u1a7a\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4771

    const v5, 0x358af2dc

    xor-int/2addr v4, v5

    const v5, -0x72b8db7b

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v3

    if-eqz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u073a\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x669b

    const v5, -0x57cd55c4

    xor-int/2addr v4, v5

    const v5, -0x4d88c497

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_6

    :cond_5
    const-string v3, "\u06d7\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6117

    const v5, -0x4f6fcd75

    xor-int/2addr v4, v5

    const v5, -0x4ac6eb9a

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d8\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7b29

    const v5, 0x20e659de

    xor-int/2addr v4, v5

    const v5, -0x2678d8ff

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget-boolean v3, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v3, :cond_7

    goto :goto_3

    :cond_7
    const-string v3, "\u0730\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7179

    const v5, -0x38c65c87

    xor-int/2addr v4, v5

    const v5, 0x59ddb39

    goto/16 :goto_0

    :cond_8
    :goto_2
    const-string v3, "\u06e0\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7bd9

    const v5, 0x7468e78f

    xor-int/2addr v4, v5

    const v5, -0x630c0da7

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05a1\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x47

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x28bb

    const v5, 0x27a72b9c

    xor-int/2addr v4, v5

    const v5, 0x6b0ef940

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v3

    if-eqz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u0736\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x1d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6fbd

    const v5, 0x62bd21f8

    xor-int/2addr v4, v5

    const v5, 0x5d3c46f6

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06dc\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6707

    const v5, 0x18174e68

    xor-int/2addr v4, v5

    const v5, -0x283fba49

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/᩷֨ۡ;->᩸:Ljava/util/ArrayList;

    iput-object p2, p0, Ll/᩷֨ۡ;->᩹:Landroid/app/Activity;

    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_c

    :goto_4
    const-string v3, "\u06d7\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x29b3

    const v5, 0x2a412ea7

    xor-int/2addr v4, v5

    const v5, -0x16bf2f89

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06da\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x744d

    const v5, -0x4fe854d6

    xor-int/2addr v4, v5

    const v5, -0xa7dfc7b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x75b3973d -> :sswitch_2
        -0x6b97ea97 -> :sswitch_d
        -0x665db654 -> :sswitch_1
        -0x654bfecb -> :sswitch_a
        -0x4a4375d2 -> :sswitch_1
        -0x49197948 -> :sswitch_e
        -0x3d8f2b90 -> :sswitch_b
        -0x2dc06bd4 -> :sswitch_c
        -0x25c9817e -> :sswitch_9
        -0x23a8d783 -> :sswitch_e
        -0x2397fa85 -> :sswitch_5
        -0x22a1a883 -> :sswitch_d
        -0x13512d7a -> :sswitch_8
        0x2d1542b -> :sswitch_7
        0x1f96c4a5 -> :sswitch_6
        0x20a9fdd8 -> :sswitch_7
        0x29e52a2d -> :sswitch_2
        0x2cdb1cc8 -> :sswitch_3
        0x320be46c -> :sswitch_0
        0x35cbcfbc -> :sswitch_4
        0x3922b7df -> :sswitch_4
        0x487a2329 -> :sswitch_a
        0x4c142b4b -> :sswitch_c
        0x51a2874d -> :sswitch_9
        0x55fdd9dd -> :sswitch_5
        0x6477efdc -> :sswitch_b
        0x6af66d9c -> :sswitch_0
        0x6c6f42b0 -> :sswitch_3
        0x729894a8 -> :sswitch_6
        0x7e410d0f -> :sswitch_8
    .end sparse-switch
.end method


# virtual methods
.method public final accept(I)V
    .locals 16

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x24408c32

    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    sget v5, Ll/֡۬;->۠֡᩶:I

    const-string v6, "\u06dc\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4933

    const v8, 0x34f684f8

    xor-int/2addr v7, v8

    const v8, 0x1b0d5e95

    :goto_0
    xor-int/2addr v6, v8

    :goto_1
    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x6917

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 504
    sget v6, Ll/۟;->ۗۤۛ:I

    if-eqz v6, :cond_1

    :cond_0
    :goto_2
    move/from16 v6, p1

    goto/16 :goto_8

    .line 345
    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v6, :cond_2

    :cond_1
    :goto_3
    move/from16 v6, p1

    goto :goto_6

    :cond_2
    :goto_4
    move/from16 v6, p1

    goto/16 :goto_7

    .line 88
    :sswitch_1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v6

    if-eqz v6, :cond_0

    :goto_5
    move/from16 v6, p1

    goto/16 :goto_9

    .line 1355
    :sswitch_2
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    goto :goto_5

    :sswitch_3
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    return-void

    .line 1405
    :sswitch_4
    move-object v6, v2

    check-cast v6, Ll/᩷᩵ۡ;

    .line 1406
    new-instance v14, Ll/᩵֨ۡ;

    sget v7, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v7, :cond_3

    goto :goto_2

    :cond_3
    iget-object v8, v0, Ll/᩷֨ۡ;->᩶:Ll/֡ۚۢ;

    .line 641
    sget v7, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v7, :cond_4

    const-string v6, "\u06da\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x21a5

    const v8, 0x4ba4038d    # 2.1497626E7f

    xor-int/2addr v7, v8

    const v8, -0x7c4ae9d3

    goto :goto_0

    .line 1406
    :cond_4
    iget-object v9, v0, Ll/᩷֨ۡ;->ۙ:Ljava/lang/String;

    iget-object v10, v0, Ll/᩷֨ۡ;->ۗ:Ljava/lang/String;

    .line 1241
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v7

    if-gtz v7, :cond_5

    goto :goto_4

    .line 1406
    :cond_5
    iget-object v15, v0, Ll/᩷֨ۡ;->᩹:Landroid/app/Activity;

    sget v7, Ll/۠;->ܺܺܶ:I

    if-ltz v7, :cond_6

    goto :goto_3

    :cond_6
    iget-object v13, v0, Ll/᩷֨ۡ;->۬:Ll/ۢ۠ۡ;

    move-object v7, v14

    move-object v11, v6

    move-object v12, v15

    invoke-direct/range {v7 .. v13}, Ll/᩵֨ۡ;-><init>(Ll/֡ۚۢ;Ljava/lang/String;Ljava/lang/String;Ll/᩷᩵ۡ;Landroid/app/Activity;Ll/ۢ۠ۡ;)V

    invoke-static {v15, v6, v14}, Ll/ۖ᩵ۡ;->֫(Landroid/app/Activity;Ll/᩷᩵ۡ;Ljava/lang/Runnable;)V

    return-void

    :sswitch_5
    move/from16 v6, p1

    .line 1405
    invoke-static {v1, v6}, Ll/ۗۚ;->᩶ܳ۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v2

    .line 14
    sget v7, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v7, :cond_7

    :goto_6
    const-string v7, "\u06d7\u06e4"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x1939

    const v9, -0x486b66e1

    xor-int/2addr v8, v9

    const v9, 0x7149ca8a

    goto/16 :goto_a

    :cond_7
    const-string v7, "\u0733\u06e2"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x28d5

    const v9, 0x1b7d9afb

    xor-int/2addr v8, v9

    const v9, 0x8b32714

    goto/16 :goto_a

    :sswitch_6
    move/from16 v6, p1

    .line 1405
    iget-object v1, v0, Ll/᩷֨ۡ;->᩸:Ljava/util/ArrayList;

    sget v7, Ll/᩹;->ۤܿܳ:I

    if-eqz v7, :cond_8

    goto :goto_7

    :cond_8
    const-string v7, "\u05a8\u06d9"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    mul-int/lit8 v7, v7, 0x69

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x3247

    const v9, -0x62b12a45

    xor-int/2addr v8, v9

    const v9, -0x1e93d432

    goto/16 :goto_a

    :sswitch_7
    move/from16 v6, p1

    .line 1194
    sget v7, Ll/֡֡;->֫ۤܳ:I

    if-ltz v7, :cond_9

    goto :goto_7

    :cond_9
    const-string v7, "\u1a78\u06e4"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v4

    mul-int/lit8 v7, v7, -0x41

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x511b

    const v9, 0x4ff5df90

    xor-int/2addr v8, v9

    const v9, 0x58c61911

    goto/16 :goto_a

    :sswitch_8
    move/from16 v6, p1

    .line 1018
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v7

    if-nez v7, :cond_a

    :goto_7
    const-string v7, "\u06e4\u06e0"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x65ed

    const v9, -0x4e1f0965

    xor-int/2addr v8, v9

    const v9, -0x6d70d637

    goto :goto_a

    :cond_a
    const-string v7, "\u06e8\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x6603

    const v9, 0x282723a

    xor-int/2addr v8, v9

    const v9, -0x1062db0

    goto :goto_a

    :sswitch_9
    move/from16 v6, p1

    .line 65
    sget-boolean v7, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v7, :cond_b

    :goto_8
    const-string v7, "\u06da\u06e4"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x71

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, -0x350f

    const v9, -0xdde797d

    xor-int/2addr v8, v9

    const v9, 0x9a92206

    goto :goto_a

    :cond_b
    const-string v7, "\u1a74\u06e7"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x22f

    const v9, 0x7676f9fb

    xor-int/2addr v8, v9

    const v9, -0x27898de3

    goto :goto_a

    :sswitch_a
    move/from16 v6, p1

    .line 319
    sget v7, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v7, :cond_c

    :goto_9
    const-string v7, "\u1a79\u06eb"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v4

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x1a27

    const v9, 0x1765f795

    xor-int/2addr v8, v9

    const v9, -0x2ff0fbaf

    goto :goto_a

    :cond_c
    const-string v7, "\u1a78\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v4

    mul-int/lit16 v8, v8, 0x64d5

    const v9, 0x902c761

    xor-int/2addr v8, v9

    const v9, -0x76629e46

    :goto_a
    xor-int/2addr v7, v9

    move v6, v7

    move v7, v8

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7f913f99 -> :sswitch_8
        -0x70082d91 -> :sswitch_1
        -0x6e8ae61c -> :sswitch_9
        -0x64a17150 -> :sswitch_0
        -0x61f1e9a9 -> :sswitch_a
        -0x5c062713 -> :sswitch_4
        -0x536bd905 -> :sswitch_6
        -0x4c91bd32 -> :sswitch_0
        -0x4b777ea4 -> :sswitch_6
        -0x33e65c41 -> :sswitch_2
        -0x1415a004 -> :sswitch_7
        -0x9907d1d -> :sswitch_2
        0x3e6c677 -> :sswitch_a
        0xc6c7d01 -> :sswitch_9
        0x1058821a -> :sswitch_4
        0x372a37dd -> :sswitch_5
        0x41efe0e9 -> :sswitch_3
        0x499697c4 -> :sswitch_8
        0x59454053 -> :sswitch_3
        0x69a25366 -> :sswitch_1
        0x7b3dfc64 -> :sswitch_5
        0x7d9a8c25 -> :sswitch_7
    .end sparse-switch
.end method

.method public synthetic andThen(Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ۢۛᩴ;->$default$andThen(Ljava/util/function/IntConsumer;Ljava/util/function/IntConsumer;)Ljava/util/function/IntConsumer;

    move-result-object p1

    return-object p1
.end method
