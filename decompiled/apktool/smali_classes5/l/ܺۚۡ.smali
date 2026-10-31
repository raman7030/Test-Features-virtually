.class public final synthetic Ll/ܺۚۡ;
.super Ljava/lang/Object;
.source "H1R6"

# interfaces
.implements Ll/֫᩹᩵;


# instance fields
.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Ll/ۛۚۡ;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;Ll/ۛۚۡ;)V
    .locals 6

    const v0, 0x4b5b47ff    # 1.4370815E7f

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    sget v2, Ll/֫ܽ;->ۚ᩷᩹:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06ec\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x63d5

    const v5, -0xf11b44f    # -5.899915E29f

    xor-int/2addr v4, v5

    const v5, 0x69698e82

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, -0x4ebb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_3

    :sswitch_0
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v3

    if-gez v3, :cond_8

    goto/16 :goto_3

    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v3, :cond_6

    goto/16 :goto_3

    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v3

    if-eqz v3, :cond_a

    goto/16 :goto_3

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p2, p0, Ll/ܺۚۡ;->᩹:Ll/ۛۚۡ;

    return-void

    .line 2
    :sswitch_5
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_0

    const-string v3, "\u1a7a\u1a76"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4aa9

    const v5, -0x5bfff2a6

    xor-int/2addr v4, v5

    const v5, 0x1e41eebb

    goto :goto_0

    :cond_0
    const-string v3, "\u06d7\u1a7b"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b3b

    const v5, 0x53013bdf

    xor-int/2addr v4, v5

    const v5, 0x27452f50

    goto :goto_0

    :sswitch_6
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u1a78\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x23

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x13e1

    const v5, -0x13e61a01

    xor-int/2addr v4, v5

    const v5, 0xe8e07ac

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u0730\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x62c5

    const v5, -0x6b211fcb

    xor-int/2addr v4, v5

    const v5, -0x9287fa9

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u1a78\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x392d

    const v5, 0x1d09223c

    xor-int/2addr v4, v5

    const v5, -0x72558610

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u05a1\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x73

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7d45

    const v5, -0x46e22aa7

    xor-int/2addr v4, v5

    const v5, -0x349b338f    # -1.4994545E7f

    goto/16 :goto_0

    .line 0
    :sswitch_a
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v3, "\u06d9\u06da"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5447

    const v5, -0x7eacd2a1

    xor-int/2addr v4, v5

    const v5, -0x27004a74

    goto/16 :goto_0

    .line 2
    :sswitch_b
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    const-string v3, "\u1a76\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x5d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6885

    const v5, -0x2bb819b

    xor-int/2addr v4, v5

    const v5, -0x39c7bd4b

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u06eb\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7727

    const v5, -0x722df512

    xor-int/2addr v4, v5

    const v5, 0x5e5279b2

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_1
    const-string v3, "\u073d\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x34cb

    const v5, -0x1b0410fc

    xor-int/2addr v4, v5

    const v5, -0xab05722

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a77\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x603f

    const v5, -0x60b03f9a

    xor-int/2addr v4, v5

    const v5, -0x10ae983f

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v3, :cond_b

    :cond_a
    :goto_2
    const-string v3, "\u06db\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x55a7

    const v5, 0x4dc54242    # 4.13681728E8f

    xor-int/2addr v4, v5

    const v5, -0x78c942bf

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u05a1\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2da1

    const v5, -0x4049a8e4

    xor-int/2addr v4, v5

    const v5, 0x268f814b

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ܺۚۡ;->᩸:Ll/֡ۚۢ;

    .line 3
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_c

    :goto_3
    const-string v3, "\u06eb\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4353

    const v5, 0x469d2b28

    xor-int/2addr v4, v5

    const v5, -0x64cae708

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d8\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7aed

    const v5, 0x452eb0f8

    xor-int/2addr v4, v5

    const v5, 0x27bedaf

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7bb314d3 -> :sswitch_6
        -0x7916f9b3 -> :sswitch_e
        -0x705e8153 -> :sswitch_0
        -0x6e227cac -> :sswitch_b
        -0x6bc64109 -> :sswitch_6
        -0x5d6e052d -> :sswitch_a
        -0x5c192184 -> :sswitch_7
        -0x53aae8cd -> :sswitch_b
        -0x4959e102 -> :sswitch_4
        -0x489314c2 -> :sswitch_c
        -0x3f53aca7 -> :sswitch_3
        -0x3caff262 -> :sswitch_3
        -0x3a31ed1a -> :sswitch_2
        -0x37df77c7 -> :sswitch_5
        -0x29516756 -> :sswitch_0
        -0x25dc8680 -> :sswitch_4
        -0x25d57291 -> :sswitch_a
        -0x24fc32e1 -> :sswitch_7
        -0xb99eeb6 -> :sswitch_8
        0x2520fc95 -> :sswitch_8
        0x28448ba0 -> :sswitch_5
        0x3fc3f009 -> :sswitch_e
        0x44e520ba -> :sswitch_2
        0x491cb187 -> :sswitch_9
        0x509e3190 -> :sswitch_9
        0x55f0a1a5 -> :sswitch_d
        0x57bb5bd1 -> :sswitch_1
        0x5a3f6194 -> :sswitch_c
        0x6ce3889b -> :sswitch_d
        0x6cf732d1 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 11

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const v4, 0x762821ae

    sget v5, Ll/ۗ᩵;->֫۠۟:I

    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v7, "\u1a7b\u06e8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x1b67

    const v9, 0x7c271ccb

    xor-int/2addr v8, v9

    const v9, -0x7725141f

    :goto_0
    xor-int/2addr v7, v9

    move-object v9, v3

    :goto_1
    xor-int/2addr v4, v6

    mul-int/lit16 v4, v4, 0xa95

    shr-int/lit8 v4, v4, 0x1f

    and-int/2addr v4, v8

    xor-int/2addr v4, v7

    sparse-switch v4, :sswitch_data_0

    .line 576
    invoke-virtual {v1, v2}, Ll/֡ۡ֫;->֫(Ll/᩻ۡ֫;)V

    .line 577
    new-instance v9, Ll/ۘۚۡ;

    .line 77
    sget v7, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v7, :cond_1

    goto/16 :goto_4

    .line 517
    :sswitch_0
    sget v7, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v7, :cond_a

    goto/16 :goto_2

    .line 122
    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v7, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v7, :cond_8

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    const/4 v0, 0x0

    return-object v0

    .line 577
    :sswitch_5
    new-instance v7, Ll/ۗۚۡ;

    .line 557
    sget v8, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v8, :cond_0

    goto :goto_2

    .line 577
    :cond_0
    invoke-direct {v7, v9}, Ll/ۗۚۡ;-><init>(Ll/ۘۚۡ;)V

    invoke-static {v1, v2, v7}, Ll/֨۫;->۠۬᩵(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 584
    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-object v0

    .line 577
    :cond_1
    invoke-direct {v9, v2}, Ll/ۘۚۡ;-><init>(Ll/ۛۚۡ;)V

    .line 130
    sget v7, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v7, :cond_3

    :cond_2
    const-string v7, "\u06df\u1a7a"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x2259

    const v10, -0x68358200

    xor-int/2addr v8, v10

    const v10, -0x14d33bb

    goto/16 :goto_5

    :cond_3
    const-string v7, "\u05ab\u06e1"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6a3b

    const v10, 0x5d343477

    xor-int/2addr v8, v10

    const v10, 0x457dbcd1

    goto/16 :goto_5

    .line 576
    :sswitch_6
    iget-object v2, p0, Ll/ܺۚۡ;->᩹:Ll/ۛۚۡ;

    .line 559
    sget v7, Ll/۟;->ۗۤۛ:I

    if-eqz v7, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v7, "\u05ab\u06d8"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x1315

    const v10, -0xa3c930a

    xor-int/2addr v8, v10

    const v10, 0x6910e335

    goto/16 :goto_5

    :sswitch_7
    const/4 v7, 0x0

    .line 575
    invoke-virtual {v1, v7}, Ll/ۚۡ֫;->ۧ(Ljava/lang/Object;)V

    sget-boolean v7, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v7, :cond_5

    :goto_2
    const-string v7, "\u1a79\u06da"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v6

    mul-int/lit8 v7, v7, 0x4b

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x6dd1

    const v10, -0x7833b631

    xor-int/2addr v8, v10

    const v10, 0x6cf94cff

    goto/16 :goto_5

    :cond_5
    const-string v7, "\u06df\u06d6"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x7177

    const v10, 0x2353dbee

    xor-int/2addr v8, v10

    const v10, -0x3dc805be

    goto/16 :goto_5

    .line 574
    :sswitch_8
    invoke-static {v0}, Ll/ۘۗ;->ۤۧۖ(Ljava/lang/Object;)V

    .line 575
    sget-object v1, Ll/᩹ᩴۡ;->֫:Ll/ۚۡ֫;

    .line 128
    sget v7, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v7, :cond_6

    goto :goto_3

    :cond_6
    const-string v7, "\u06e0\u1a79"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    add-int/2addr v7, v5

    mul-int/lit8 v7, v7, -0x33

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x29c7

    const v10, 0x4e7c05e0

    xor-int/2addr v8, v10

    const v10, 0x3f5d82c

    goto/16 :goto_5

    .line 574
    :sswitch_9
    iget-object v0, p0, Ll/ܺۚۡ;->᩸:Ll/֡ۚۢ;

    .line 345
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v7

    if-eqz v7, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v7, "\u1a79\u06d7"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0xb

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x66ab

    const v10, 0x7d363626

    xor-int/2addr v8, v10

    const v10, -0x3aa45f5c

    goto/16 :goto_5

    .line 293
    :sswitch_a
    sget-boolean v7, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v7, :cond_9

    :cond_8
    :goto_3
    const-string v7, "\u0733\u05a1"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    sub-int v7, v5, v7

    mul-int/lit8 v7, v7, 0x5d

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x7ad

    const v10, -0x5dc90b6a

    xor-int/2addr v8, v10

    const v10, -0x4fb8aa4b

    goto :goto_5

    :cond_9
    const-string v7, "\u1a78\u0733"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x6e21

    const v10, 0x5e91e4d3

    xor-int/2addr v8, v10

    const v10, 0x774bac93

    goto :goto_5

    .line 559
    :sswitch_b
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v7

    if-ltz v7, :cond_b

    :cond_a
    const-string v7, "\u06e7\u06ec"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, -0x605d

    const v10, 0x724661f4

    xor-int/2addr v8, v10

    const v10, 0x775f8c3c

    goto :goto_5

    :cond_b
    const-string v7, "\u06db\u1a74"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v6

    mul-int/lit8 v7, v7, -0xf

    xor-int v8, v7, v5

    mul-int/lit16 v8, v8, 0x3153

    const v10, -0x579e3f1c

    xor-int/2addr v8, v10

    const v10, 0x15c390c7

    goto :goto_5

    .line 2
    :sswitch_c
    sget v7, Ll/ۛۚۡ;->ۢۧ:I

    .line 268
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v7

    if-nez v7, :cond_c

    :goto_4
    const-string v7, "\u1a76\u1a73"

    invoke-static {v7}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, -0x4bf1

    const v9, 0x51337594

    xor-int/2addr v8, v9

    const v9, -0x306cd5ec

    goto/16 :goto_0

    :cond_c
    const-string v7, "\u05a8\u0736"

    invoke-static {v7}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v7

    xor-int/2addr v7, v5

    xor-int v8, v7, v6

    mul-int/lit16 v8, v8, 0x389

    const v10, 0x5cb95654

    xor-int/2addr v8, v10

    const v10, 0x50ef9937

    :goto_5
    xor-int/2addr v7, v10

    goto/16 :goto_1

    :sswitch_data_0
    .sparse-switch
        -0x71231c0c -> :sswitch_9
        -0x56431102 -> :sswitch_5
        -0x42147bd7 -> :sswitch_2
        -0x3da33400 -> :sswitch_9
        -0x2db2631a -> :sswitch_4
        -0x2b612a93 -> :sswitch_5
        -0x1a048b6f -> :sswitch_b
        -0x1943700d -> :sswitch_1
        -0x10cdb454 -> :sswitch_6
        -0x10c83c5f -> :sswitch_7
        -0xcf55a92 -> :sswitch_7
        0x1d9aada -> :sswitch_8
        0x10a16978 -> :sswitch_c
        0x146d2191 -> :sswitch_a
        0x14a39229 -> :sswitch_b
        0x3dcd8b04 -> :sswitch_c
        0x4434fa12 -> :sswitch_1
        0x4ba67816 -> :sswitch_3
        0x53d4febf -> :sswitch_6
        0x55906724 -> :sswitch_0
        0x66738464 -> :sswitch_a
        0x6a266907 -> :sswitch_3
        0x732baad6 -> :sswitch_4
        0x7856ab07 -> :sswitch_2
        0x7a843f81 -> :sswitch_0
        0x7e0d90c0 -> :sswitch_8
    .end sparse-switch
.end method
