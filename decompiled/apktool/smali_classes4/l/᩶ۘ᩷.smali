.class public final synthetic Ll/᩶ۘ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۙᩴ᩷;

.field public final synthetic ᩹:Landroid/graphics/drawable/BitmapDrawable;


# direct methods
.method public synthetic constructor <init>(Ll/ۙᩴ᩷;Landroid/graphics/drawable/BitmapDrawable;)V
    .locals 6

    const v0, 0x52ff82f1

    sget v1, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06da\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x6f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63b3

    const v5, 0x6cce31b5

    xor-int/2addr v4, v5

    const v5, -0x29478279

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x2075

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_3

    .line 1
    :sswitch_0
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v3

    if-eqz v3, :cond_9

    goto/16 :goto_4

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    sget v3, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_3

    goto/16 :goto_2

    .line 2
    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    goto/16 :goto_2

    .line 4
    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p2, p0, Ll/᩶ۘ᩷;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    return-void

    :sswitch_6
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-ltz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06da\u06e1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3f67

    const v5, 0xaf419eb

    xor-int/2addr v4, v5

    const v5, 0x3a5e41f1

    goto :goto_0

    .line 2
    :sswitch_7
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u06df\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0xc19

    const v5, 0x22ef1d2

    xor-int/2addr v4, v5

    const v5, 0x1960985c

    goto :goto_0

    :cond_2
    const-string v3, "\u06e2\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x434f

    const v5, -0x525d8026

    xor-int/2addr v4, v5

    const v5, -0xb7d9090

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_4

    :cond_3
    const-string v3, "\u073a\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6c5f

    const v5, 0x42f7df42

    xor-int/2addr v4, v5

    const v5, 0x98ba9a

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0733\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x469f

    const v5, 0x10f20593

    xor-int/2addr v4, v5

    const v5, -0x4f6bbf99

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v3, :cond_5

    :goto_1
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x161d

    const v5, -0x3b41b23d

    xor-int/2addr v4, v5

    const v5, -0x23016f10

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u1a79\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6171

    const v5, -0x6c880967

    xor-int/2addr v4, v5

    const v5, -0x50004c9f

    goto/16 :goto_0

    .line 0
    :sswitch_a
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v3

    if-eqz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u073f\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6a5d

    const v5, -0x6e1c41ed

    xor-int/2addr v4, v5

    const v5, 0x18e8e405

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v3, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v3, "\u1a79\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2613

    const v5, 0x3c513b9f

    xor-int/2addr v4, v5

    const v5, 0x5ed94d86

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_8

    :goto_2
    const-string v3, "\u1a79\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7f17

    const v5, 0x4be71c45    # 3.0292106E7f

    xor-int/2addr v4, v5

    const v5, -0x74dfc470

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x14a1

    const v5, 0x51e85799

    xor-int/2addr v4, v5

    const v5, -0x3918d940    # -29587.375f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_9
    :goto_3
    const-string v3, "\u06d8\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x41

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1ecd

    const v5, -0x10060711

    xor-int/2addr v4, v5

    const v5, 0x5ebbdddd

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u0733\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5f5f

    const v5, -0x50fecdcc

    xor-int/2addr v4, v5

    const v5, 0xf61d2b2

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/᩶ۘ᩷;->᩸:Ll/ۙᩴ᩷;

    .line 4
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u1a73\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6b81

    const v5, -0x1c28a31f

    xor-int/2addr v4, v5

    const v5, 0xe96b52c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a77\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x2e75

    const v5, -0x5eeb181a

    xor-int/2addr v4, v5

    const v5, -0x2370bb72

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bf0598f -> :sswitch_9
        -0x7ba2398c -> :sswitch_a
        -0x7afc2ca1 -> :sswitch_d
        -0x77222c73 -> :sswitch_0
        -0x72106fa4 -> :sswitch_6
        -0x6d3bcb3a -> :sswitch_b
        -0x6a49d101 -> :sswitch_0
        -0x4fc46f4d -> :sswitch_7
        -0x3e4170a6 -> :sswitch_9
        -0x3defd7c2 -> :sswitch_c
        -0x3a3b4220 -> :sswitch_7
        -0x279c0208 -> :sswitch_4
        -0x26e7a69a -> :sswitch_8
        -0x420a7b5 -> :sswitch_8
        0x5daf2b9 -> :sswitch_d
        0x1b816ebf -> :sswitch_b
        0x1be82f6b -> :sswitch_2
        0x3b5a6f10 -> :sswitch_e
        0x3e2d1ba3 -> :sswitch_3
        0x5223960f -> :sswitch_e
        0x54e8f32f -> :sswitch_3
        0x5877af49 -> :sswitch_1
        0x5ab62a31 -> :sswitch_2
        0x5b4290e5 -> :sswitch_c
        0x5b63394a -> :sswitch_a
        0x6442bebf -> :sswitch_4
        0x672e04d1 -> :sswitch_6
        0x6a21c90c -> :sswitch_5
        0x6e7d3e81 -> :sswitch_5
        0x718a9455 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const v10, -0x4227fd79

    sget v11, Ll/ۖ;->᩹۟ۘ:I

    sget v12, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v13, "\u1a77\u073f"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4cfb

    const v15, -0xaa5adc7

    xor-int/2addr v14, v15

    const v15, -0x56a9b6e2

    :goto_0
    xor-int/2addr v13, v15

    move-object v15, v8

    :goto_1
    xor-int/2addr v10, v12

    mul-int/lit16 v10, v10, -0x7c7b

    shr-int/lit8 v10, v10, 0x1f

    and-int/2addr v10, v14

    xor-int/2addr v10, v13

    sparse-switch v10, :sswitch_data_0

    .line 1045
    iget-object v1, v0, Ll/᩶ۘ᩷;->᩸:Ll/ۙᩴ᩷;

    .line 772
    sget v13, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v13, :cond_c

    goto/16 :goto_4

    .line 832
    :sswitch_0
    sget v13, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v13, :cond_0

    goto/16 :goto_2

    .line 274
    :sswitch_1
    sget-boolean v13, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v13, :cond_a

    goto/16 :goto_4

    .line 330
    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    sget-boolean v13, Ll/֨۫;->۬᩷᩶:Z

    if-nez v13, :cond_6

    goto/16 :goto_4

    .line 948
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto/16 :goto_4

    .line 203
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    return-void

    .line 1047
    :sswitch_5
    invoke-virtual {v3, v4}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 1054
    :sswitch_6
    invoke-virtual {v3, v15}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1055
    invoke-virtual {v15, v9}, Landroid/graphics/drawable/TransitionDrawable;->setCrossFadeEnabled(Z)V

    const/16 v1, 0x12c

    .line 1056
    invoke-virtual {v15, v1}, Landroid/graphics/drawable/TransitionDrawable;->startTransition(I)V

    return-void

    .line 1052
    :sswitch_7
    invoke-virtual {v6, v7}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 1053
    new-instance v15, Landroid/graphics/drawable/TransitionDrawable;

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v13

    if-eqz v13, :cond_1

    :cond_0
    const-string v13, "\u06db\u06ec"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x3c79

    const v15, 0x25d671d9

    xor-int/2addr v14, v15

    const v15, 0x28b68f93

    goto :goto_0

    :cond_1
    const/4 v13, 0x2

    new-array v13, v13, [Landroid/graphics/drawable/Drawable;

    const/4 v14, 0x0

    .line 917
    sget v16, Ll/۟;->ۗۤۛ:I

    if-eqz v16, :cond_2

    const-string v13, "\u06e1\u0730"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3ab7

    const v15, -0x6419986c

    xor-int/2addr v14, v15

    const v15, -0x358773f1

    goto :goto_0

    :cond_2
    aput-object v5, v13, v14

    const/4 v9, 0x1

    aput-object v6, v13, v9

    .line 412
    sget v14, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v14, :cond_3

    goto/16 :goto_3

    .line 1053
    :cond_3
    invoke-direct {v15, v13}, Landroid/graphics/drawable/TransitionDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 168
    sget v13, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v13, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v13, "\u06e0\u05ab"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, 0x75

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x7805

    const v16, 0x3e42d156

    xor-int v14, v14, v16

    const v16, 0x4b6e79d0    # 1.5628752E7f

    goto/16 :goto_5

    .line 1052
    :sswitch_8
    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object v7

    .line 594
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v13

    if-gtz v13, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v13, "\u05ab\u1a76"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x772b

    const v16, -0x7462d737

    xor-int v14, v14, v16

    const v16, 0x37d4a9b8

    goto/16 :goto_5

    .line 1049
    :sswitch_9
    invoke-virtual {v3}, Ll/֡᩻;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 1050
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    sget v13, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v13, :cond_7

    :cond_6
    :goto_2
    const-string v13, "\u06df\u06da"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x25

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x139

    const v16, -0x55f6e193

    xor-int v14, v14, v16

    const v16, -0x2fec125a

    goto/16 :goto_5

    :cond_7
    const-string v13, "\u06e4\u06eb"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x3c7d

    const v16, -0x22d1af7c

    xor-int v14, v14, v16

    const v16, 0x2144c134

    goto/16 :goto_5

    .line 1045
    :sswitch_a
    invoke-virtual {v2, v4}, Ll/֡᩻;->setDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1046
    iget-boolean v13, v1, Ll/ۙᩴ᩷;->ᩳ:Z

    if-nez v13, :cond_8

    const-string v13, "\u06e8\u073f"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v11, v13

    mul-int/lit8 v13, v13, -0x69

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4645

    const v16, 0x6ec49561

    xor-int v14, v14, v16

    const v16, -0x43116c88

    goto/16 :goto_5

    :cond_8
    const-string v13, "\u06e0\u06eb"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, 0x4bdd

    const v16, 0xa0b29ec

    xor-int v14, v14, v16

    const v16, 0x6f2d84a2

    goto/16 :goto_5

    .line 1045
    :sswitch_b
    iget-object v3, v1, Ll/ۙᩴ᩷;->ܳ:Ll/֡᩻;

    iget-object v4, v0, Ll/᩶ۘ᩷;->᩹:Landroid/graphics/drawable/BitmapDrawable;

    sget-boolean v13, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v13, :cond_9

    goto :goto_4

    :cond_9
    const-string v13, "\u073f\u06e1"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    sub-int v13, v12, v13

    mul-int/lit8 v13, v13, -0x3

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0xc63

    const v16, -0x59769241

    xor-int v14, v14, v16

    const v16, 0x2815224c

    goto :goto_5

    :sswitch_c
    iget-object v2, v1, Ll/ۙᩴ᩷;->᩻:Ll/֡᩻;

    .line 820
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v13

    if-ltz v13, :cond_b

    :cond_a
    :goto_3
    const-string v13, "\u1a76\u06eb"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, -0x4ed7

    const v15, -0x3ccb2bc4

    xor-int/2addr v14, v15

    const v15, 0x3326aca5

    goto/16 :goto_0

    :cond_b
    const-string v13, "\u06df\u0736"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x7255

    const v16, -0x2eee36e

    xor-int v14, v14, v16

    const v16, 0x303cb809

    goto :goto_5

    :cond_c
    const-string v13, "\u06e1\u06d6"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v11

    mul-int/lit8 v13, v13, 0x13

    xor-int v14, v13, v12

    mul-int/lit16 v14, v14, -0x1c25

    const v16, 0x56abafe

    xor-int v14, v14, v16

    const v16, 0x98c9481

    goto :goto_5

    .line 2
    :sswitch_d
    sget v13, Ll/֫᩵᩷;->ۛۧ:I

    .line 898
    sget v13, Ll/᩺;->ۙۛܶ:I

    if-gtz v13, :cond_d

    :goto_4
    const-string v13, "\u06eb\u06e7"

    invoke-static {v13}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x2325

    const v16, 0x2c01ad7e

    xor-int v14, v14, v16

    const v16, 0x68509c12

    goto :goto_5

    :cond_d
    const-string v13, "\u06df\u06d9"

    invoke-static {v13}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v13

    xor-int/2addr v13, v12

    xor-int v14, v13, v11

    mul-int/lit16 v14, v14, 0x3d1d

    const v16, -0x3ec3d2e1

    xor-int v14, v14, v16

    const v16, -0x7537f4c3

    :goto_5
    xor-int v13, v13, v16

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7b584bc2 -> :sswitch_4
        -0x67995df9 -> :sswitch_2
        -0x5b0ce90b -> :sswitch_c
        -0x49878783 -> :sswitch_7
        -0x49842b71 -> :sswitch_9
        -0x4895c73b -> :sswitch_0
        -0x4696a5c9 -> :sswitch_3
        -0x3601549c -> :sswitch_6
        -0x324c173d -> :sswitch_8
        -0x202d9d20 -> :sswitch_2
        -0x169517e8 -> :sswitch_b
        -0x117d104b -> :sswitch_7
        -0x10af9e8e -> :sswitch_1
        -0xe1f273c -> :sswitch_1
        -0x2574b4c -> :sswitch_8
        0x78154b9 -> :sswitch_6
        0x108b214d -> :sswitch_5
        0x110ff47a -> :sswitch_a
        0x19c6f215 -> :sswitch_a
        0x1b8efd2a -> :sswitch_9
        0x21d51041 -> :sswitch_b
        0x268fa510 -> :sswitch_0
        0x28eb6748 -> :sswitch_c
        0x44a2bba3 -> :sswitch_d
        0x5ad68143 -> :sswitch_3
        0x6735de61 -> :sswitch_5
        0x7003fe90 -> :sswitch_d
        0x716c0a32 -> :sswitch_4
    .end sparse-switch
.end method
