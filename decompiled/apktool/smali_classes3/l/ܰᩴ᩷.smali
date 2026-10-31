.class public final Ll/ܰᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public ֫:I

.field public final ۧ:I

.field public final ܽ:Ljava/util/ArrayList;

.field public final synthetic ᩳ:Ll/֫᩵᩷;


# direct methods
.method public constructor <init>(Ll/֫᩵᩷;Ljava/util/ArrayList;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0xd9a0134

    sget v3, Ll/᩺;->ۙۛܶ:I

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    .line 394
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06e8\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3bc1

    const v7, 0x725036c6

    xor-int/2addr v6, v7

    const v7, -0x2a525ea2

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, -0xbbf

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_b

    goto/16 :goto_4

    .line 390
    :sswitch_0
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_6

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    sget v5, Ll/֨᩺;->ۨ֨۬:I

    if-lez v5, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v5, "\u073a\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6597

    const v7, -0x346b7e78

    xor-int/2addr v6, v7

    const v7, 0x9633bba

    goto :goto_0

    :sswitch_2
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    const/4 p1, 0x0

    .line 396
    iput p1, p0, Ll/ܰᩴ᩷;->֫:I

    return-void

    .line 390
    :sswitch_5
    iput v1, p0, Ll/ܰᩴ᩷;->ۧ:I

    .line 395
    new-instance v5, Ljava/util/ArrayList;

    .line 182
    sget v6, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v6, :cond_1

    goto/16 :goto_3

    .line 395
    :cond_1
    invoke-direct {v5, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v5, p0, Ll/ܰᩴ᩷;->ܽ:Ljava/util/ArrayList;

    .line 67
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v5, "\u073d\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6047

    const v7, -0x66a69fcf

    xor-int/2addr v6, v7

    const v7, 0x54ed01c5

    goto :goto_0

    .line 390
    :sswitch_6
    invoke-static {v0}, Ll/֡᩺;->᩺ᩴ᩹(Ljava/lang/Object;)I

    move-result v1

    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_3

    goto :goto_2

    :cond_3
    const-string v5, "\u1a74\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3fe9

    const v7, 0x65443173    # 5.7906E22f

    xor-int/2addr v6, v7

    const v7, 0x5c3164f1

    goto/16 :goto_0

    .line 59
    :sswitch_7
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v5, "\u1a78\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x300b

    const v7, -0x53ee8805

    xor-int/2addr v6, v7

    const v7, 0x5a56fa7f

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v5, :cond_5

    goto :goto_3

    :cond_5
    const-string v5, "\u06e8\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x46eb

    const v7, -0x711bc95d

    xor-int/2addr v6, v7

    const v7, 0x1ea9efa2

    goto/16 :goto_0

    .line 4
    :sswitch_9
    sget v5, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v5, :cond_7

    :cond_6
    :goto_2
    const-string v5, "\u05a8\u073a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x333d

    const v7, 0x34110e62

    xor-int/2addr v6, v7

    const v7, 0x211edb3

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u0733\u06d6"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x3ca1

    const v7, 0x6efe16a4

    xor-int/2addr v6, v7

    const v7, -0x13a9f569

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v5, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v5, :cond_8

    :goto_3
    const-string v5, "\u1a7a\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4d49

    const v7, 0x2e84284c

    xor-int/2addr v6, v7

    const v7, 0x51fad1cc

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u1a73\u06dc"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x5b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1cbd

    const v7, -0x73862eeb

    xor-int/2addr v6, v7

    const v7, 0x6a1002ea

    goto/16 :goto_0

    .line 59
    :sswitch_b
    sget v5, Ll/۟;->ۗۤۛ:I

    if-eqz v5, :cond_9

    :goto_4
    const-string v5, "\u1a7b\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5a4b

    const v7, -0x43c59631

    xor-int/2addr v6, v7

    const v7, -0x371fcf32

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u05a1\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x17f9

    const v7, 0x622f8f22

    xor-int/2addr v6, v7

    const v7, -0x71e1499f

    goto/16 :goto_0

    .line 292
    :sswitch_c
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u05ab\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x557

    const v7, 0x2b54e5d2

    xor-int/2addr v6, v7

    const v7, 0x107a1df1

    goto/16 :goto_0

    .line 394
    :sswitch_d
    iput-object p1, p0, Ll/ܰᩴ᩷;->ᩳ:Ll/֫᩵᩷;

    .line 390
    invoke-static {p1}, Ll/֫᩵᩷;->ܺ(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    .line 70
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v5

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u05ab\u06ec"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v4

    mul-int/lit8 v6, v6, 0x13

    const v7, 0x7f1966a8

    xor-int/2addr v6, v7

    const v7, -0x58862032

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d7\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x7abf

    const v7, 0x639cdddb

    xor-int/2addr v6, v7

    const v7, -0x5079069b

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7c40c5e4 -> :sswitch_9
        -0x6d28e54f -> :sswitch_7
        -0x6be658b2 -> :sswitch_c
        -0x659ad9c9 -> :sswitch_c
        -0x50ee5bb7 -> :sswitch_9
        -0x4f3a20fa -> :sswitch_5
        -0x4c91531b -> :sswitch_3
        -0x45183f98 -> :sswitch_0
        -0x44028788 -> :sswitch_a
        -0x2fd6cf7b -> :sswitch_a
        -0x1fb18543 -> :sswitch_d
        -0x1ee2586e -> :sswitch_2
        -0x1c3c0f74 -> :sswitch_2
        -0x111951af -> :sswitch_1
        -0xa174200 -> :sswitch_6
        -0x372dd58 -> :sswitch_b
        -0x32678b4 -> :sswitch_b
        -0x2ff8690 -> :sswitch_3
        0xa119e4 -> :sswitch_8
        0x1964040e -> :sswitch_1
        0x23134e56 -> :sswitch_d
        0x2b4a3282 -> :sswitch_7
        0x3a675a17 -> :sswitch_4
        0x445d12b9 -> :sswitch_5
        0x54f040d0 -> :sswitch_8
        0x628ebe86 -> :sswitch_4
        0x641aed48 -> :sswitch_0
        0x6fb6c7e8 -> :sswitch_6
    .end sparse-switch
.end method
