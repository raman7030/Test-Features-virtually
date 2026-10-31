.class public final synthetic Ll/᩸ܽ᩷;
.super Ljava/lang/Object;
.source "82RX"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Z

.field public final synthetic ᩶:Ljava/lang/Runnable;

.field public final synthetic ᩸:Ll/۬ܽ᩷;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(ILl/۬ܽ᩷;Ljava/lang/Runnable;Z)V
    .locals 6

    const v0, 0x266205e5

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/֡᩺;->ᩴ᩹ۛ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e2\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4cc9

    const v5, -0x6c36672e

    xor-int/2addr v4, v5

    const v5, 0x7de8a851

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x7ebb

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    goto/16 :goto_1

    :sswitch_0
    invoke-static {}, Ll/ۘᩴ;->᩻᩺۫()I

    move-result v3

    if-nez v3, :cond_8

    goto/16 :goto_4

    .line 3
    :sswitch_1
    sget v3, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v3, :cond_b

    goto/16 :goto_1

    .line 0
    :sswitch_2
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-nez v3, :cond_6

    goto/16 :goto_1

    .line 4
    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_4
    iput-object p3, p0, Ll/᩸ܽ᩷;->᩶:Ljava/lang/Runnable;

    iput-boolean p4, p0, Ll/᩸ܽ᩷;->ۙ:Z

    return-void

    :sswitch_5
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u1a7a\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x11

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5be3

    const v5, -0x4402d1b7

    xor-int/2addr v4, v5

    const v5, -0x6bd3ba8b

    goto :goto_0

    .line 2
    :sswitch_6
    sget v3, Ll/֡֡;->֫ۤܳ:I

    if-ltz v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v3, "\u0730\u06df"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x71bb

    const v5, 0x32209e85

    xor-int/2addr v4, v5

    const v5, 0x22f32feb

    goto :goto_0

    .line 1
    :sswitch_7
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v3, "\u0736\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x192b

    const v5, 0xcb37d37

    xor-int/2addr v4, v5

    const v5, 0x110857fb

    goto/16 :goto_0

    .line 4
    :sswitch_8
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u1a78\u1a74"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x14c1

    const v5, 0x7ed701eb

    xor-int/2addr v4, v5

    const v5, -0x3277f5a1

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/᩺;->ۙۛܶ:I

    if-gtz v3, :cond_4

    :goto_1
    const-string v3, "\u06e0\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6b7d

    const v5, 0x5c772463

    xor-int/2addr v4, v5

    const v5, -0x4d936a40

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u0730\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6585

    const v5, -0xcbcae41

    xor-int/2addr v4, v5

    const v5, 0x2c7bd633

    goto/16 :goto_0

    .line 1
    :sswitch_a
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v3, "\u06ec\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x6d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x24d

    const v5, 0x5ecb92c2

    xor-int/2addr v4, v5

    const v5, -0x4047ecc8

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_7

    :cond_6
    const-string v3, "\u06db\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4be5

    const v5, -0xdf03114

    xor-int/2addr v4, v5

    const v5, 0x2d1e4dc2

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u0730\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1ad1

    const v5, -0x7e0a0dad

    xor-int/2addr v4, v5

    const v5, -0x5824dd6a

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget v3, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u06d7\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7a23

    const v5, 0x3a4d06a1

    xor-int/2addr v4, v5

    const v5, 0x792920d8

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u05ab\u1a73"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4cad

    const v5, -0x299881b3

    xor-int/2addr v4, v5

    const v5, 0x23607f2c    # 1.2169994E-17f

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v3

    if-eqz v3, :cond_a

    :goto_3
    const-string v3, "\u0736\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x67

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x29c7

    const v5, 0x59231433

    xor-int/2addr v4, v5

    const v5, 0x7200c5e4

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u05ab\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x751f

    const v5, 0x7f9daf5d

    xor-int/2addr v4, v5

    const v5, 0x2c68eb35

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p2, p0, Ll/᩸ܽ᩷;->᩸:Ll/۬ܽ᩷;

    iput p1, p0, Ll/᩸ܽ᩷;->᩹:I

    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v3

    if-gtz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06eb\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xe09

    const v5, -0x816bfaf

    xor-int/2addr v4, v5

    const v5, -0x23396fc7

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d9\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2fdf

    const v5, 0x7a118124

    xor-int/2addr v4, v5

    const v5, 0x491a3694    # 631657.25f

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7c846a5a -> :sswitch_1
        -0x5f98d6cd -> :sswitch_b
        -0x5c843780 -> :sswitch_4
        -0x5b44ae5c -> :sswitch_d
        -0x52c71be9 -> :sswitch_0
        -0x30adbc4c -> :sswitch_5
        -0x302f6b5e -> :sswitch_0
        -0x284ff48d -> :sswitch_9
        -0x27c0b64a -> :sswitch_e
        -0x27401ffd -> :sswitch_b
        -0x695ce67 -> :sswitch_3
        -0x6288ebc -> :sswitch_a
        -0x572de67 -> :sswitch_8
        -0x356c793 -> :sswitch_6
        0x4a6f357 -> :sswitch_e
        0xb109db3 -> :sswitch_d
        0xd4d3d53 -> :sswitch_2
        0xe5fd28e -> :sswitch_9
        0x18a40d22 -> :sswitch_4
        0x1a91aa18 -> :sswitch_c
        0x1d6debfd -> :sswitch_6
        0x29745d7a -> :sswitch_7
        0x3c2353d5 -> :sswitch_3
        0x43c45ebe -> :sswitch_7
        0x43eea6fb -> :sswitch_5
        0x4a7a4d69 -> :sswitch_a
        0x55be7493 -> :sswitch_2
        0x5af12b90 -> :sswitch_8
        0x77d59f91 -> :sswitch_1
        0x7dbfa385 -> :sswitch_c
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x3fd2c252

    sget v3, Ll/֡֡;->֫ۤܳ:I

    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    const-string v5, "\u073d\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x69

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x461

    const v7, -0x146b0aa

    xor-int/2addr v6, v7

    const v7, 0x11c6c46

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0x29cd

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 4
    sget v5, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v5, :cond_7

    goto/16 :goto_3

    .line 2
    :sswitch_0
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v5

    if-gtz v5, :cond_b

    goto/16 :goto_2

    .line 0
    :sswitch_1
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    sget v5, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-lez v5, :cond_9

    goto/16 :goto_2

    .line 2
    :sswitch_2
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    return-void

    .line 0
    :sswitch_4
    iget v2, p0, Ll/᩸ܽ᩷;->᩹:I

    iget-object v3, p0, Ll/᩸ܽ᩷;->᩸:Ll/۬ܽ᩷;

    invoke-static {v2, v3, v0, v1}, Ll/۬ܽ᩷;->֫(ILl/۬ܽ᩷;Ljava/lang/Runnable;Z)V

    return-void

    :sswitch_5
    iget-boolean v1, p0, Ll/᩸ܽ᩷;->ۙ:Z

    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u06d9\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x8b3

    const v7, -0x2d572f53

    xor-int/2addr v6, v7

    const v7, -0x675a4acd

    goto :goto_0

    .line 1
    :sswitch_6
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_1

    :goto_1
    const-string v5, "\u1a75\u06eb"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0xf

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4fd5

    const v7, 0x3e1c6218

    xor-int/2addr v6, v7

    const v7, 0x1ee18e9b

    goto :goto_0

    :cond_1
    const-string v5, "\u06eb\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x63

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x4ff7

    const v7, 0x4abfc805    # 6284290.5f

    xor-int/2addr v6, v7

    const v7, 0x4b00b7cd    # 8435661.0f

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    const-string v5, "\u1a79\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x15

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x797

    const v7, 0x52a1e8b6

    xor-int/2addr v6, v7

    const v7, 0x27b94ede

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06e2\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x5f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x60f1

    const v7, -0x4d8b58d7

    xor-int/2addr v6, v7

    const v7, 0x4c3b429d    # 4.908914E7f

    goto/16 :goto_0

    .line 0
    :sswitch_9
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_4

    goto :goto_2

    :cond_4
    const-string v5, "\u06e8\u06d7"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2d51

    const v7, 0x1d80b4cf

    xor-int/2addr v6, v7

    const v7, 0x443c0fae

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget-boolean v5, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u0730\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3ef5

    const v7, -0x6bbc4b3b

    xor-int/2addr v6, v7

    const v7, -0xdeb350a

    goto/16 :goto_0

    .line 4
    :sswitch_b
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_6

    :goto_2
    const-string v5, "\u06d7\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x59fd

    const v7, 0x1d02f730

    xor-int/2addr v6, v7

    const v7, 0x7d23dc57

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u06df\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x19f

    const v7, 0x32352b27

    xor-int/2addr v6, v7

    const v7, -0x48766bbf

    goto/16 :goto_0

    .line 0
    :sswitch_c
    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v5, :cond_8

    :cond_7
    const-string v5, "\u0733\u06eb"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x75

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x6d93

    const v7, 0x66c9717a

    xor-int/2addr v6, v7

    const v7, -0x356b9550    # -4863320.0f

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06e0\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x7d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xc61

    const v7, -0x61b420d5

    xor-int/2addr v6, v7

    const v7, -0x16a05e7

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v5, :cond_a

    :cond_9
    :goto_3
    const-string v5, "\u06d6\u06db"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x4f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6333

    const v7, -0x257b2544

    xor-int/2addr v6, v7

    const v7, -0x1ba8aab4

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u1a7b\u06df"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x27

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5fd5

    const v7, -0x76705988

    xor-int/2addr v6, v7

    const v7, 0x73c7412c

    goto/16 :goto_0

    :sswitch_e
    iget-object v0, p0, Ll/᩸ܽ᩷;->᩶:Ljava/lang/Runnable;

    .line 3
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v5

    if-ltz v5, :cond_c

    :cond_b
    :goto_4
    const-string v5, "\u06df\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x55

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4f2d

    const v7, -0x8412d63

    xor-int/2addr v6, v7

    const v7, 0x310f309b

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u1a78\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x31

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3695

    const v7, -0x2ddda5b3

    xor-int/2addr v6, v7

    const v7, 0xa767a4b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e79d064 -> :sswitch_3
        -0x6c30570e -> :sswitch_1
        -0x6a7e0e59 -> :sswitch_b
        -0x66ae3977 -> :sswitch_b
        -0x653b90ab -> :sswitch_5
        -0x646e7bdd -> :sswitch_c
        -0x610135df -> :sswitch_6
        -0x6030c0ee -> :sswitch_7
        -0x52926ece -> :sswitch_9
        -0x4cfbc7b8 -> :sswitch_8
        -0x48e591ed -> :sswitch_8
        -0x42b41971 -> :sswitch_0
        -0x2f80b756 -> :sswitch_6
        -0x225e00b9 -> :sswitch_7
        -0x1747ee32 -> :sswitch_d
        -0x15a78eda -> :sswitch_4
        0x45dfe6d -> :sswitch_e
        0x13c80d2c -> :sswitch_9
        0x15f0fc24 -> :sswitch_0
        0x36f883d1 -> :sswitch_3
        0x3a73e233 -> :sswitch_2
        0x44cc9d9b -> :sswitch_e
        0x4b2c52d3 -> :sswitch_a
        0x51db6ac3 -> :sswitch_5
        0x564ac3dc -> :sswitch_d
        0x58b5addc -> :sswitch_a
        0x5c0e636d -> :sswitch_2
        0x70636169 -> :sswitch_1
        0x79700956 -> :sswitch_4
        0x7e8a7aba -> :sswitch_c
    .end sparse-switch
.end method
