.class public final Ll/ܰۨܽ;
.super Ljava/lang/Object;
.source "71K9"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/۠ۗ֡;


# direct methods
.method public constructor <init>(Ll/۠ۗ֡;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x2bce9366

    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    .line 462
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u073a\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x147d

    const v6, 0x46de2e7d

    xor-int/2addr v5, v6

    const v6, -0x2c3865c9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x17d5

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v4, Ll/۟;->ۗۤۛ:I

    if-nez v4, :cond_8

    goto/16 :goto_3

    :sswitch_0
    sget v4, Ll/֡֡;->֫ۤܳ:I

    if-ltz v4, :cond_b

    goto/16 :goto_2

    .line 339
    :sswitch_1
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_4

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto/16 :goto_3

    .line 449
    :sswitch_3
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 460
    :sswitch_4
    iput-object v0, p0, Ll/ܰۨܽ;->֫:Ljava/util/ArrayList;

    .line 463
    iput-object p1, p0, Ll/ܰۨܽ;->ۧ:Ll/۠ۗ֡;

    return-void

    .line 106
    :sswitch_5
    sget v4, Ll/ۛ;->᩺᩻֫:I

    if-ltz v4, :cond_0

    const-string v4, "\u1a77\u06e1"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x28fd

    const v6, 0x4ee9d132

    xor-int/2addr v5, v6

    const v6, -0x1cb1201c

    goto :goto_0

    :cond_0
    const-string v4, "\u06e8\u05a8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x7b61

    const v6, -0x7c19c3f

    xor-int/2addr v5, v6

    const v6, -0x3266dacd

    goto :goto_0

    .line 241
    :sswitch_6
    sget v4, Ll/᩹;->ۤܿܳ:I

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const-string v4, "\u1a76\u0733"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x4d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x29bd

    const v6, 0x5c603361

    xor-int/2addr v5, v6

    const v6, -0x41a727dc

    goto :goto_0

    .line 148
    :sswitch_7
    sget v4, Ll/֡۬;->۠֡᩶:I

    if-gtz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u1a73\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x53dd

    const v6, 0x3a2b68c6

    xor-int/2addr v5, v6

    const v6, -0x14c017fd    # -2.3200048E26f

    goto/16 :goto_0

    .line 294
    :sswitch_8
    sget v4, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v4, :cond_3

    goto :goto_1

    :cond_3
    const-string v4, "\u1a75\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x43

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5afb

    const v6, 0x204012a0

    xor-int/2addr v5, v6

    const v6, 0xcd10f21

    goto/16 :goto_0

    .line 6
    :sswitch_9
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v4

    if-eqz v4, :cond_5

    :cond_4
    :goto_1
    const-string v4, "\u06e2\u06dc"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x6595

    const v6, 0x7218a78b

    xor-int/2addr v5, v6

    const v6, 0x40a868a

    goto/16 :goto_0

    :cond_5
    const-string v4, "\u06df\u06dc"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3233

    const v6, -0x3f092002

    xor-int/2addr v5, v6

    const v6, 0x670dcd16

    goto/16 :goto_0

    .line 386
    :sswitch_a
    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u1a75\u0733"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1fad

    const v6, -0x71698eeb

    xor-int/2addr v5, v6

    const v6, -0x475567db

    goto/16 :goto_0

    :sswitch_b
    sget v4, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v4, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v4, "\u06d8\u06e8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x5f

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x3e1d

    const v6, -0x713a3dd

    xor-int/2addr v5, v6

    const v6, 0x7c027f01

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/ۘۗ;->۬ۜ᩵()I

    move-result v4

    if-ltz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u0736\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x4665

    const v6, -0x17fa1b42

    xor-int/2addr v5, v6

    const v6, 0x28e9dab4

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u06e8\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x55

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4f53

    const v6, -0x3de322e4

    xor-int/2addr v5, v6

    const v6, -0x6b658a51

    goto/16 :goto_0

    .line 186
    :sswitch_d
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-eqz v4, :cond_a

    :goto_3
    const-string v4, "\u06e2\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x37

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x6c77

    const v6, 0x5f6bb75

    xor-int/2addr v5, v6

    const v6, 0x1915a7fb

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u0736\u06db"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x45

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x2a0f

    const v6, -0x740c62ab

    xor-int/2addr v5, v6

    const v6, -0x1c6bb568

    goto/16 :goto_0

    .line 460
    :sswitch_e
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 62
    sget-boolean v4, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u073a\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1251

    const v6, 0xc055fd3

    xor-int/2addr v5, v6

    const v6, -0x13f19459

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06ec\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x36af

    const v6, -0x50d5452b

    xor-int/2addr v5, v6

    const v6, 0x1f9e7ce9

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x75ec93f1 -> :sswitch_7
        -0x757d0a2b -> :sswitch_c
        -0x73d798b4 -> :sswitch_3
        -0x730a75ad -> :sswitch_9
        -0x7114cc7f -> :sswitch_d
        -0x63ca20f1 -> :sswitch_b
        -0x52047fc8 -> :sswitch_d
        -0x4cd8ce09 -> :sswitch_8
        -0x3ba5512b -> :sswitch_2
        -0x386e3356 -> :sswitch_e
        -0x33f11903 -> :sswitch_c
        -0x28ee327a -> :sswitch_0
        -0x1d34fdbc -> :sswitch_9
        -0x187ac7ee -> :sswitch_1
        -0x162e3786 -> :sswitch_a
        -0x98686cd -> :sswitch_b
        0xe7a44b -> :sswitch_5
        0x19b3d9cf -> :sswitch_4
        0x1cb516a9 -> :sswitch_1
        0x25338f2e -> :sswitch_3
        0x30567398 -> :sswitch_2
        0x380e14ad -> :sswitch_a
        0x389cdf93 -> :sswitch_5
        0x3bb1a4a2 -> :sswitch_4
        0x422b8eae -> :sswitch_0
        0x5e1613ed -> :sswitch_6
        0x6143c8fc -> :sswitch_8
        0x6c31535a -> :sswitch_e
        0x6d6bd14d -> :sswitch_7
        0x7621c3dc -> :sswitch_6
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()Ll/᩵ۡۚ;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, -0x50c72f31

    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v6, Ll/ۘۨ;->۫᩸۠:I

    const-string v7, "\u06d9\u05a8"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, -0xd

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x450f

    const v9, 0x1447a071

    xor-int/2addr v8, v9

    const v9, -0x21015c16

    :goto_0
    xor-int/2addr v7, v9

    move-object v9, v0

    :goto_1
    xor-int/2addr v4, v5

    mul-int/lit16 v4, v4, 0x7389

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 189
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v7

    if-nez v7, :cond_5

    goto :goto_2

    .line 410
    :sswitch_1
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-lez v7, :cond_b

    goto :goto_2

    .line 170
    :sswitch_2
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v7, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v7, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_2
    const-string v7, "\u06ec\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6089

    const v10, 0x7122d9af

    xor-int/2addr v8, v10

    const v10, -0x4709bfdc

    goto/16 :goto_7

    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    const/4 v0, 0x0

    return-object v0

    .line 478
    :sswitch_4
    new-instance v7, Ll/ۨۨܽ;

    .line 121
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v8

    if-ltz v8, :cond_1

    goto/16 :goto_6

    .line 478
    :cond_1
    invoke-direct {v7, v9, v3}, Ll/ۨۨܽ;-><init>(Ll/᩵ۡۚ;Ll/ۡ֫ۚ;)V

    invoke-interface {v1, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 477
    :sswitch_5
    invoke-static {v2}, Ll/֨۫;->۬ۖܳ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۡ֫ۚ;

    .line 306
    sget v7, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v7, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v7, "\u05a1\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x3

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x5685

    const v10, 0x29a7c608

    xor-int/2addr v8, v10

    const v10, 0x45d59070

    goto/16 :goto_7

    .line 480
    :sswitch_6
    invoke-static {v1}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    return-object v9

    .line 477
    :sswitch_7
    invoke-static {v2}, Ll/֫ۧ;->۫ܶܺ(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const-string v7, "\u06da\u1a7b"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0xc77

    const v10, 0x64977722

    xor-int/2addr v8, v10

    const v10, 0x259b2139

    goto/16 :goto_7

    :cond_3
    const-string v7, "\u06e1\u06d8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x387b

    const v10, -0x7a9cb9ac

    xor-int/2addr v8, v10

    const v10, 0x3fde1d50

    goto/16 :goto_7

    :sswitch_8
    iget-object v2, p0, Ll/ܰۨܽ;->֫:Ljava/util/ArrayList;

    invoke-static {v2}, Ll/ۗۗ;->ۢ᩸᩶(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    const-string v7, "\u073a\u06da"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    mul-int/lit8 v7, v7, 0x5f

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x5a3

    const v10, 0x1f4d622d

    xor-int/2addr v8, v10

    const v10, -0x6c901e4d

    goto/16 :goto_7

    .line 39
    :sswitch_9
    sget v1, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 383
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    move-result v7

    if-ltz v7, :cond_4

    goto :goto_4

    :cond_4
    const-string v7, "\u06da\u06e0"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x3d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6b67

    const v10, -0x73ffbac6

    xor-int/2addr v8, v10

    const v10, 0x4b190868    # 1.002916E7f

    goto/16 :goto_7

    .line 475
    :sswitch_a
    new-instance v9, Ll/᩵ۡۚ;

    .line 272
    sget v7, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v7, :cond_6

    :cond_5
    const-string v7, "\u1a75\u05a1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0x6b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6f93

    const v9, -0x13d19abf

    xor-int/2addr v8, v9

    const v9, 0x27e6d3bf

    goto/16 :goto_0

    .line 60
    :cond_6
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_4

    :cond_7
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v7

    if-eqz v7, :cond_8

    :goto_4
    const-string v7, "\u06e2\u06da"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x4251

    const v9, -0x6558edb2

    xor-int/2addr v8, v9

    const v9, 0x4ed36368

    goto/16 :goto_0

    .line 425
    :cond_8
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_6

    .line 405
    :cond_9
    sget v7, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v7, :cond_a

    goto :goto_5

    .line 475
    :cond_a
    iget-object v7, p0, Ll/ܰۨܽ;->ۧ:Ll/۠ۗ֡;

    .line 323
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v8

    if-ltz v8, :cond_c

    :cond_b
    :goto_5
    const-string v7, "\u06e2\u1a79"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x472f

    const v9, -0x5a6e895d

    xor-int/2addr v8, v9

    const v9, 0xcab95d6

    goto/16 :goto_0

    .line 475
    :cond_c
    invoke-direct {v9, v7}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    .line 476
    sget-object v7, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 167
    sget v7, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v7, :cond_d

    :goto_6
    const-string v7, "\u1a76\u05a1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1b47

    const v9, 0x34c1bb15

    xor-int/2addr v8, v9

    const v9, -0x4655e754

    goto/16 :goto_0

    :cond_d
    const-string v7, "\u073f\u1a75"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v6, v7

    mul-int/lit8 v7, v7, 0x13

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x22f5

    const v10, 0x4a945271    # 4860216.5f

    xor-int/2addr v8, v10

    const v10, 0x782eee7

    :goto_7
    xor-int/2addr v7, v10

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ad9167b -> :sswitch_1
        -0x67837e08 -> :sswitch_a
        -0x6086b60d -> :sswitch_8
        -0x584b9c0e -> :sswitch_1
        -0x57cf66bb -> :sswitch_3
        -0x4cdf91bf -> :sswitch_9
        -0x3f32227b -> :sswitch_3
        -0x30fa9088 -> :sswitch_5
        -0x30430786 -> :sswitch_0
        -0x2c77d3fe -> :sswitch_2
        -0x2c5e08e9 -> :sswitch_8
        -0x26c218ae -> :sswitch_6
        -0xe81fd10 -> :sswitch_4
        -0x8854078 -> :sswitch_a
        0x8cbdef7 -> :sswitch_4
        0x1a8880db -> :sswitch_7
        0x254bde0a -> :sswitch_9
        0x46938283 -> :sswitch_6
        0x5d51458e -> :sswitch_7
        0x668a7744 -> :sswitch_0
        0x70b281ce -> :sswitch_2
        0x7e29bd53 -> :sswitch_5
    .end sparse-switch
.end method

.method public final ֫(Ll/֫᩺ܽ;)Ll/᩵ۡۚ;
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, -0x1c064f86

    sget v7, Ll/ۗۚ;->ܶۛᩴ:I

    sget v8, Ll/֨۬;->۫ۙ᩺:I

    const-string v9, "\u1a74\u1a76"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x3d

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x20cb

    const v11, -0x1568f43d

    xor-int/2addr v10, v11

    const v11, 0x318bd912

    xor-int/2addr v9, v11

    move-object v11, v0

    :goto_0
    move-object v12, v3

    :goto_1
    xor-int/2addr v6, v7

    mul-int/lit16 v6, v6, -0x72fb

    shr-int/lit8 v6, v6, 0x1f

    and-int/2addr v6, v10

    xor-int/2addr v6, v9

    sparse-switch v6, :sswitch_data_0

    .line 488
    invoke-static {v5}, Ll/ۖۘ;->ᩴۛۚ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۡ֫ۚ;

    .line 489
    new-instance v10, Ll/᩺ۨܽ;

    .line 78
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v13

    if-ltz v13, :cond_0

    goto/16 :goto_6

    .line 439
    :sswitch_0
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget-boolean v9, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v9, :cond_c

    goto/16 :goto_5

    :sswitch_1
    sget v9, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v9, :cond_a

    goto/16 :goto_5

    .line 285
    :sswitch_2
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    sget-boolean v9, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v9, :cond_6

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    :goto_2
    const-string v9, "\u06e7\u1a7a"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x5fdb

    const v13, -0x247875f

    xor-int/2addr v10, v13

    const v13, -0x345ad8c6    # -2.1646964E7f

    goto/16 :goto_9

    .line 280
    :sswitch_4
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    const/4 p1, 0x0

    return-object p1

    .line 489
    :cond_0
    invoke-direct {v10, p1, v12, v11, v9}, Ll/᩺ۨܽ;-><init>(Ll/֫᩺ܽ;Ll/᩵ۛۡ;Ll/᩵ۡۚ;Ll/ۡ֫ۚ;)V

    invoke-interface {v2, v10}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    .line 496
    :sswitch_5
    invoke-static {v2}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    return-object v11

    .line 488
    :sswitch_6
    invoke-static {v5}, Ll/֡ܶ;->ۛܿ᩻(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    const-string v9, "\u1a74\u1a74"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x19e7

    const v13, -0x24872b9a

    xor-int/2addr v10, v13

    const v13, 0x6728a442

    goto/16 :goto_9

    :cond_1
    const-string v9, "\u0736\u1a77"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v8, v9

    mul-int/lit8 v9, v9, 0x51

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x2a7d

    const v13, 0x55455e37

    xor-int/2addr v10, v13

    const v13, -0x472896f5

    goto/16 :goto_9

    .line 487
    :sswitch_7
    new-instance v5, Ll/ۗۨܽ;

    invoke-direct {v5, p1}, Ll/ۗۨܽ;-><init>(Ll/֫᩺ܽ;)V

    invoke-static {v12, v5}, Ll/֡ۜ;->᩸ܺ۫(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 488
    invoke-static {v4}, Ll/ۘᩴ;->ۤ֡ۖ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    const-string v9, "\u0730\u06e0"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x2dff

    const v13, 0x1f8d8050

    xor-int/2addr v10, v13

    const v13, 0x6cd3387a

    goto/16 :goto_9

    .line 487
    :sswitch_8
    new-instance v12, Ll/᩵ۛۡ;

    .line 333
    sget v9, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v9, :cond_2

    goto :goto_4

    .line 487
    :cond_2
    iget-object v4, p0, Ll/ܰۨܽ;->֫:Ljava/util/ArrayList;

    invoke-static {v4}, Ll/ۗ᩵;->ۡᩴۙ(Ljava/lang/Object;)I

    move-result v9

    .line 97
    sget v10, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v10, :cond_3

    :goto_4
    const-string v9, "\u073d\u073d"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x65

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x1c49

    const v12, -0x4e5f691d

    xor-int/2addr v10, v12

    const v12, -0x5d0551c6

    goto/16 :goto_7

    :cond_3
    int-to-long v9, v9

    .line 217
    sget v13, Ll/۟;->ۗۤۛ:I

    if-eqz v13, :cond_4

    goto/16 :goto_6

    .line 487
    :cond_4
    invoke-direct {v12, v9, v10}, Ll/᩵ۛۡ;-><init>(J)V

    .line 292
    sget v9, Ll/۠;->ܺܺܶ:I

    if-ltz v9, :cond_5

    goto/16 :goto_8

    :cond_5
    const-string v9, "\u1a7b\u1a76"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x65

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x429b

    const v13, -0x4f8b61dd

    xor-int/2addr v10, v13

    const v13, 0x5f44852c

    goto/16 :goto_9

    .line 39
    :sswitch_9
    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    sget v9, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v9, :cond_7

    :cond_6
    :goto_5
    const-string v9, "\u1a7b\u06e8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, 0x15

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x47b5

    const v13, -0x1e3b9df6

    xor-int/2addr v10, v13

    const v13, -0x3a0e6be4

    goto/16 :goto_9

    :cond_7
    const-string v9, "\u06e1\u0733"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x59

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x3915

    const v13, -0x3b5bdb6c

    xor-int/2addr v10, v13

    const v13, -0x274c4834

    goto/16 :goto_9

    .line 486
    :sswitch_a
    sget-object v1, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v1, Ll/ܿ᩸ۡ;->֫:I

    .line 102
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_6

    :cond_8
    const-string v9, "\u1a77\u06e1"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    add-int/2addr v9, v7

    mul-int/lit8 v9, v9, -0x2d

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x44ff

    const v13, 0x32134839

    xor-int/2addr v10, v13

    const v13, 0x2717faf9

    goto :goto_9

    .line 485
    :sswitch_b
    new-instance v11, Ll/᩵ۡۚ;

    .line 334
    sget v9, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v9, :cond_9

    goto :goto_8

    .line 485
    :cond_9
    iget-object v9, p0, Ll/ܰۨܽ;->ۧ:Ll/۠ۗ֡;

    invoke-direct {v11, v9}, Ll/᩵ۡۚ;-><init>(Ll/۠ۗ֡;)V

    sget-boolean v9, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v9, :cond_b

    :cond_a
    :goto_6
    const-string v9, "\u073d\u06eb"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, -0x6995

    const v12, -0x5e2f77a6

    xor-int/2addr v10, v12

    const v12, 0x5ebad22c

    :goto_7
    xor-int/2addr v9, v12

    goto/16 :goto_0

    :cond_b
    const-string v9, "\u1a78\u06e1"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v7

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, -0x7aff

    const v13, -0x36a784d1

    xor-int/2addr v10, v13

    const v13, 0x1463cf3a

    goto :goto_9

    .line 212
    :sswitch_c
    sget v9, Ll/֡֡;->֫ۤܳ:I

    if-ltz v9, :cond_d

    :cond_c
    :goto_8
    const-string v9, "\u1a78\u0733"

    invoke-static {v9}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v9

    sub-int v9, v7, v9

    mul-int/lit8 v9, v9, 0x43

    xor-int v10, v9, v8

    mul-int/lit16 v10, v10, 0x1c19

    const v11, 0x6a233041

    xor-int/2addr v10, v11

    const v11, 0x3859a3ba

    xor-int/2addr v9, v11

    move-object v11, v0

    goto/16 :goto_1

    :cond_d
    const-string v9, "\u06db\u06e8"

    invoke-static {v9}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v9

    xor-int/2addr v9, v8

    mul-int/lit8 v9, v9, -0x11

    xor-int v10, v9, v7

    mul-int/lit16 v10, v10, 0x8c3

    const v13, -0x7e4b8864

    xor-int/2addr v10, v13

    const v13, -0x47175d27

    :goto_9
    xor-int/2addr v9, v13

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e8dabc6 -> :sswitch_6
        -0x7e457481 -> :sswitch_b
        -0x40e97d5e -> :sswitch_2
        -0x39b456b4 -> :sswitch_c
        -0x30432060 -> :sswitch_5
        -0x2e83d466 -> :sswitch_8
        -0x2b4cf931 -> :sswitch_4
        -0x2a01b394 -> :sswitch_8
        -0x283a042e -> :sswitch_b
        -0x1a015e54 -> :sswitch_3
        -0x63e825d -> :sswitch_a
        -0x63a1e77 -> :sswitch_c
        -0x17725ce -> :sswitch_0
        0x221e5e3 -> :sswitch_7
        0x837d465 -> :sswitch_1
        0x9a032fc -> :sswitch_5
        0x1d1eae37 -> :sswitch_9
        0x26045eb9 -> :sswitch_4
        0x34215308 -> :sswitch_9
        0x4ad2d012 -> :sswitch_6
        0x5133921b -> :sswitch_1
        0x55ed3899 -> :sswitch_0
        0x563e32aa -> :sswitch_2
        0x76e67875 -> :sswitch_3
        0x790e0ce5 -> :sswitch_7
        0x7c91ccdd -> :sswitch_a
    .end sparse-switch
.end method
