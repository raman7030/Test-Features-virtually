.class public final Ll/۟ᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ֫:Ll/᩺ᩴ᩷;

.field public final ۧ:Ll/֡ۚۢ;

.field public final ܽ:I

.field public final synthetic ᩳ:Ll/֫᩵᩷;


# direct methods
.method public constructor <init>(Ll/֫᩵᩷;Ll/᩺ᩴ᩷;Ll/֡ۚۢ;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x32d4527e

    sget v3, Ll/֨ᩴ;->ۢ֨ۖ:I

    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v5, "\u06dc\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x2b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x73eb

    const v7, -0x2b708d0c

    xor-int/2addr v6, v7

    const v7, -0xa95d58b

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x2487

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 318
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_2

    goto :goto_1

    .line 57
    :sswitch_0
    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v5, :cond_a

    goto/16 :goto_2

    .line 22
    :sswitch_1
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-gez v5, :cond_4

    goto :goto_1

    .line 37
    :sswitch_2
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_1

    goto/16 :goto_5

    .line 152
    :sswitch_3
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    goto/16 :goto_5

    .line 223
    :sswitch_4
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 356
    :sswitch_5
    iput v1, p0, Ll/۟ᩴ᩷;->ܽ:I

    .line 361
    iput-object p2, p0, Ll/۟ᩴ᩷;->֫:Ll/᩺ᩴ᩷;

    .line 362
    iput-object p3, p0, Ll/۟ᩴ᩷;->ۧ:Ll/֡ۚۢ;

    return-void

    .line 356
    :sswitch_6
    invoke-static {v0}, Ll/֡᩺;->᩺ᩴ᩹(Ljava/lang/Object;)I

    move-result v1

    .line 42
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v5, "\u06da\u05ab"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, -0x59

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4e7d

    const v7, 0x60ef2b3

    xor-int/2addr v6, v7

    const v7, 0x23fab553

    goto :goto_0

    :cond_1
    :goto_1
    const-string v5, "\u05a1\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, -0x49

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5111

    const v7, -0x2571e815    # -1.99978724E16f

    xor-int/2addr v6, v7

    const v7, -0x108d35be

    goto :goto_0

    :cond_2
    const-string v5, "\u1a7b\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x6135

    const v7, 0x1fb7d9dc

    xor-int/2addr v6, v7

    const v7, 0x415393d

    goto :goto_0

    :sswitch_7
    sget v5, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u06d7\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5b15

    const v7, -0x2de15c00

    xor-int/2addr v6, v7

    const v7, 0x60764b07

    goto/16 :goto_0

    .line 265
    :sswitch_8
    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_5

    :cond_4
    :goto_2
    const-string v5, "\u06e1\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x35

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6705

    const v7, 0x308aaa03

    xor-int/2addr v6, v7

    const v7, 0x2e3f6778

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u0730\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x69cd

    const v7, -0x6cb74058

    xor-int/2addr v6, v7

    const v7, -0x7700e4fd

    goto/16 :goto_0

    .line 285
    :sswitch_9
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_6

    goto/16 :goto_5

    :cond_6
    const-string v5, "\u06d9\u0730"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x6b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x16bd

    const v7, 0x23b6cd5a

    xor-int/2addr v6, v7

    const v7, -0xb191d84

    goto/16 :goto_0

    .line 201
    :sswitch_a
    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_7

    goto :goto_4

    :cond_7
    const-string v5, "\u1a77\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5fe3

    const v7, 0x2727d5b9

    xor-int/2addr v6, v7

    const v7, -0x56b725b8

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v5, :cond_8

    :goto_3
    const-string v5, "\u06d8\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x6d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x767

    const v7, 0x684d8c9

    xor-int/2addr v6, v7

    const v7, -0x6fd4d0ad

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d8\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1e43

    const v7, -0x45f9e549

    xor-int/2addr v6, v7

    const v7, 0x75a92ec7

    goto/16 :goto_0

    .line 266
    :sswitch_c
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_9

    goto :goto_4

    :cond_9
    const-string v5, "\u06e8\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x75b

    const v7, -0x7538f462

    xor-int/2addr v6, v7

    const v7, 0x8cf2483

    goto/16 :goto_0

    .line 132
    :sswitch_d
    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v5, :cond_b

    :cond_a
    :goto_4
    const-string v5, "\u1a77\u1a75"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x3d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x558b

    const v7, 0x7391c22e

    xor-int/2addr v6, v7

    const v7, -0x32e3d609

    goto/16 :goto_0

    :cond_b
    const-string v5, "\u05a1\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x7967

    const v7, -0x34cddb7d    # -1.1674755E7f

    xor-int/2addr v6, v7

    const v7, 0x5bca053f

    goto/16 :goto_0

    .line 360
    :sswitch_e
    iput-object p1, p0, Ll/۟ᩴ᩷;->ᩳ:Ll/֫᩵᩷;

    .line 356
    invoke-static {p1}, Ll/֫᩵᩷;->ܺ(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    .line 79
    sget v5, Ll/֡֡;->֫ۤܳ:I

    if-ltz v5, :cond_c

    :goto_5
    const-string v5, "\u0736\u05a8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x626f

    const v7, -0x1a706705

    xor-int/2addr v6, v7

    const v7, 0x49d848b0    # 1771798.0f

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u0736\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x17

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1613

    const v7, -0x7ee29eab

    xor-int/2addr v6, v7

    const v7, -0x5dce30f9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x78aeda48 -> :sswitch_6
        -0x70b623ed -> :sswitch_c
        -0x5cf7e816 -> :sswitch_e
        -0x5838b1a8 -> :sswitch_b
        -0x563b4426 -> :sswitch_b
        -0x53462199 -> :sswitch_8
        -0x45b128bb -> :sswitch_2
        -0x456d8d5c -> :sswitch_9
        -0x436fbd93 -> :sswitch_0
        -0x3e25e5fe -> :sswitch_3
        -0x3635d83a -> :sswitch_1
        -0x2d79b4ed -> :sswitch_d
        -0x2190f5c4 -> :sswitch_8
        -0x12824cef -> :sswitch_3
        -0xb3df98c -> :sswitch_c
        0x5becfa5 -> :sswitch_5
        0x6435720 -> :sswitch_9
        0xea810e3 -> :sswitch_4
        0x1739e01c -> :sswitch_0
        0x218a5339 -> :sswitch_a
        0x27f74887 -> :sswitch_7
        0x28b16bce -> :sswitch_e
        0x45d50731 -> :sswitch_a
        0x500b8528 -> :sswitch_2
        0x5035a6cd -> :sswitch_6
        0x5a190eeb -> :sswitch_d
        0x618dcd86 -> :sswitch_7
        0x632f3f44 -> :sswitch_4
        0x78c11ad2 -> :sswitch_1
        0x7ed950d5 -> :sswitch_5
    .end sparse-switch
.end method


# virtual methods
.method public final ֫()Z
    .locals 13

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const v7, -0x67d984d

    sget v8, Ll/ۙۨ;->ۡۗۙ:I

    sget v9, Ll/ۘۨ;->۫᩸۠:I

    const-string v10, "\u06e4\u1a75"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x4539

    const v12, 0x12356063

    xor-int/2addr v11, v12

    const v12, 0x6dd30ec7

    :goto_0
    xor-int/2addr v10, v12

    :goto_1
    xor-int/2addr v7, v9

    mul-int/lit16 v7, v7, -0x60cb

    shr-int/lit8 v7, v7, 0x1f

    and-int/2addr v7, v11

    xor-int/2addr v7, v10

    sparse-switch v7, :sswitch_data_0

    .line 377
    iget-object v4, v0, Ll/᩺ᩴ᩷;->᩸:Ll/ۙᩴ᩷;

    iget-object v4, v4, Ll/ۙᩴ᩷;->ۡ:Landroid/content/pm/PackageInfo;

    sget v10, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v10, :cond_3

    goto/16 :goto_6

    .line 299
    :sswitch_0
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v10

    if-eqz v10, :cond_c

    goto/16 :goto_5

    .line 335
    :sswitch_1
    sget v10, Ll/֫᩹;->᩶ۘۘ:I

    if-nez v10, :cond_6

    goto/16 :goto_5

    .line 211
    :sswitch_2
    sget-boolean v10, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v10, :cond_a

    goto/16 :goto_6

    .line 68
    :sswitch_3
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_6

    :sswitch_4
    invoke-static {}, Ll/֨۫;->۬֫ۨ()Z

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    const/4 v0, 0x0

    return v0

    .line 383
    :sswitch_5
    invoke-static {v6}, Ll/ۘۗ;->ۤۧۖ(Ljava/lang/Object;)V

    goto :goto_2

    :sswitch_6
    return v3

    .line 382
    :sswitch_7
    iget-object v6, p0, Ll/۟ᩴ᩷;->ۧ:Ll/֡ۚۢ;

    invoke-static {v6}, Ll/֡ܶ;->ۢ֡ܶ(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    const-string v10, "\u06e1\u1a77"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0x35

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2c8f

    const v12, 0x205c990

    xor-int/2addr v11, v12

    const v12, -0x51e18d10

    goto :goto_0

    :cond_0
    :goto_2
    const-string v10, "\u1a73\u1a7b"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, 0xd

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2c75

    const v12, 0x53b28981

    xor-int/2addr v11, v12

    const v12, -0xf16f6ca

    goto :goto_0

    :sswitch_8
    const/4 v0, 0x0

    return v0

    .line 379
    :sswitch_9
    invoke-static {v1}, Ll/֫᩵᩷;->֨(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v10

    iget-object v10, v10, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    invoke-virtual {v10, v0}, Ll/᩶ᩴ᩷;->֫(Ll/᩺ᩴ᩷;)V

    goto :goto_3

    .line 381
    :sswitch_a
    invoke-static {v1}, Ll/֫᩵᩷;->֡(Ll/֫᩵᩷;)Ll/ۗᩴ᩷;

    move-result-object v10

    iget-object v10, v10, Ll/ۗᩴ᩷;->֫:Ll/᩶ᩴ᩷;

    invoke-virtual {v10, v0}, Ll/᩶ᩴ᩷;->֫(Ll/᩺ᩴ᩷;)V

    :goto_3
    const-string v10, "\u06df\u05a8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, 0x4f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x55b5

    const v12, -0x434003

    xor-int/2addr v11, v12

    const v12, -0x6265f82e

    goto/16 :goto_0

    .line 377
    :sswitch_b
    iget v10, v5, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v10, v10, 0x81

    if-nez v10, :cond_1

    const-string v10, "\u073a\u0736"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x4f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5bf7

    const v12, 0x27f5245e

    xor-int/2addr v11, v12

    const v12, 0x5a8eb09e

    goto/16 :goto_0

    :cond_1
    const-string v10, "\u1a77\u06ec"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x2b

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x4f09

    const v12, 0x51bee66c

    xor-int/2addr v11, v12

    const v12, 0x32d0b040

    goto/16 :goto_0

    :sswitch_c
    iget-object v5, v4, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    sget v10, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v10, :cond_2

    goto/16 :goto_5

    :cond_2
    const-string v10, "\u05a1\u06d8"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x70af

    const v12, 0x71ecf55e

    xor-int/2addr v11, v12

    const v12, -0x280cf9dc

    goto/16 :goto_0

    :cond_3
    const-string v10, "\u06e2\u06df"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x1b49

    const v12, 0x3af73df7

    xor-int/2addr v11, v12

    const v12, -0x5bebddde

    goto/16 :goto_0

    :sswitch_d
    return v3

    .line 373
    :sswitch_e
    :try_start_0
    iget-object v10, v0, Ll/᩺ᩴ᩷;->᩸:Ll/ۙᩴ᩷;

    iget-object v10, v10, Ll/ۙᩴ᩷;->ܺ:Ljava/lang/String;

    invoke-static {v10}, Ll/ۙ᩸᩷;->֫(Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v10, "\u06e4\u06e1"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x2459

    const v12, -0x589bb42d

    xor-int/2addr v11, v12

    const v12, 0x2eb7c34a

    goto/16 :goto_0

    :catch_0
    const-string v10, "\u0730\u06dc"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v9, v10

    mul-int/lit8 v10, v10, 0x41

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x41eb

    const v12, 0x7c245b78

    xor-int/2addr v11, v12

    const v12, -0x6f778195

    goto/16 :goto_0

    .line 369
    :sswitch_f
    invoke-static {v2}, Ll/ۖ;->֡᩹۫(Ljava/lang/Object;)I

    move-result v3

    const/4 v10, 0x1

    iget v11, p0, Ll/۟ᩴ᩷;->ܽ:I

    if-eq v11, v3, :cond_4

    const-string v3, "\u06e2\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v9

    xor-int v11, v3, v8

    mul-int/lit16 v11, v11, 0x1f59

    const v12, -0x5b2cca8a

    xor-int/2addr v11, v12

    const v12, -0x6b9f2a89

    goto :goto_4

    :cond_4
    const-string v3, "\u06d7\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v8

    mul-int/lit8 v3, v3, 0x73

    xor-int v11, v3, v9

    mul-int/lit16 v11, v11, -0x367

    const v12, -0x592dd061

    xor-int/2addr v11, v12

    const v12, -0x74cfc9e2

    :goto_4
    xor-int/2addr v3, v12

    move v10, v3

    const/4 v3, 0x1

    goto/16 :goto_1

    :sswitch_10
    invoke-static {v1}, Ll/֫᩵᩷;->ܺ(Ll/֫᩵᩷;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v2

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v10

    if-gtz v10, :cond_5

    const-string v10, "\u06db\u1a73"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x14cb

    const v12, 0x60cf3644

    xor-int/2addr v11, v12

    const v12, -0x221464c3

    goto/16 :goto_0

    :cond_5
    const-string v10, "\u06eb\u1a74"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    mul-int/lit8 v10, v10, -0x1d

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x7b0f

    const v12, 0x5ba483a0

    xor-int/2addr v11, v12

    const v12, 0x741f7da2

    goto/16 :goto_0

    :sswitch_11
    iget-object v1, p0, Ll/۟ᩴ᩷;->ᩳ:Ll/֫᩵᩷;

    sget v10, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v10, :cond_7

    :cond_6
    const-string v10, "\u1a7b\u1a79"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5e29

    const v12, -0x637143ec

    xor-int/2addr v11, v12

    const v12, 0x74056074

    goto/16 :goto_0

    :cond_7
    const-string v10, "\u073d\u06dc"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x39a5

    const v12, 0x16f0414

    xor-int/2addr v11, v12

    const v12, -0x61d027a4

    goto/16 :goto_0

    :sswitch_12
    sget v10, Ll/۟;->ۗۤۛ:I

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_8
    const-string v10, "\u06db\u1a78"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x375b

    const v12, -0x6ca2c1e0

    xor-int/2addr v11, v12

    const v12, 0x6bfd7a45

    goto/16 :goto_0

    .line 69
    :sswitch_13
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_5

    :cond_9
    const-string v10, "\u073a\u06e2"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    sub-int v10, v8, v10

    mul-int/lit8 v10, v10, -0x7

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6d05

    const v12, -0x6d9d744

    xor-int/2addr v11, v12

    const v12, 0x6d7d0958

    goto/16 :goto_0

    .line 77
    :sswitch_14
    sget v10, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v10, :cond_b

    :cond_a
    :goto_5
    const-string v10, "\u073d\u06e8"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v9

    mul-int/lit8 v10, v10, -0xb

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x27ed

    const v12, -0x7e3e5340

    xor-int/2addr v11, v12

    const v12, -0x4b3d5d1

    goto/16 :goto_0

    :cond_b
    const-string v10, "\u06db\u0733"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x7bd

    const v12, -0x3b3ac8a6

    xor-int/2addr v11, v12

    const v12, 0x457847dc

    goto/16 :goto_0

    .line 42
    :sswitch_15
    sget-boolean v10, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v10, :cond_d

    :cond_c
    const-string v10, "\u1a76\u1a74"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit8 v11, v11, 0x6d

    const v12, 0x75f930c3

    xor-int/2addr v11, v12

    const v12, 0x1ad8f7d3

    goto/16 :goto_0

    :cond_d
    const-string v10, "\u05a1\u06d7"

    invoke-static {v10}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, -0x57d3

    const v12, 0x278e601c

    xor-int/2addr v11, v12

    const v12, -0x4aa8c386

    goto/16 :goto_0

    .line 180
    :sswitch_16
    sget v10, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v10, :cond_e

    goto :goto_6

    :cond_e
    const-string v10, "\u06e0\u073f"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v9

    xor-int v11, v10, v8

    mul-int/lit16 v11, v11, 0x2ce5

    const v12, 0x38e2a00a

    xor-int/2addr v11, v12

    const v12, -0x51608b20

    goto/16 :goto_0

    .line 369
    :sswitch_17
    iget-object v0, p0, Ll/۟ᩴ᩷;->֫:Ll/᩺ᩴ᩷;

    sget v10, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v10, :cond_f

    :goto_6
    const-string v10, "\u0736\u06eb"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    add-int/2addr v10, v8

    mul-int/lit8 v10, v10, 0x6f

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, 0x5fb5

    const v12, -0xbf46667

    xor-int/2addr v11, v12

    const v12, 0x33cb4e17

    goto/16 :goto_0

    :cond_f
    const-string v10, "\u06d7\u06db"

    invoke-static {v10}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v10

    xor-int/2addr v10, v8

    xor-int v11, v10, v9

    mul-int/lit16 v11, v11, -0x6c1

    const v12, -0x240f9774

    xor-int/2addr v11, v12

    const v12, -0xf241e6c

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d50df21 -> :sswitch_c
        -0x72e14d53 -> :sswitch_11
        -0x6261cfc0 -> :sswitch_12
        -0x4dd9dd43 -> :sswitch_2
        -0x4d2ca4cd -> :sswitch_4
        -0x37abc6de -> :sswitch_8
        -0x2cfc2c97 -> :sswitch_8
        -0x2b54782f -> :sswitch_17
        -0x299f1a50 -> :sswitch_16
        -0x1f813cbd -> :sswitch_12
        -0x1eae61cd -> :sswitch_16
        -0x172b4707 -> :sswitch_f
        -0x1208aab3 -> :sswitch_e
        -0x11bb4950 -> :sswitch_10
        -0x1080b931 -> :sswitch_3
        -0xd223f03 -> :sswitch_6
        -0xaeed251 -> :sswitch_3
        -0x7ed3014 -> :sswitch_4
        -0x4af54fb -> :sswitch_0
        -0x3c76088 -> :sswitch_1
        -0x3754a8b -> :sswitch_a
        0xda5722 -> :sswitch_14
        0x18269b2 -> :sswitch_7
        0x3f57b10 -> :sswitch_0
        0x2fdb8273 -> :sswitch_9
        0x31109566 -> :sswitch_b
        0x32f3a879 -> :sswitch_13
        0x45be49d2 -> :sswitch_15
        0x487c8eaa -> :sswitch_15
        0x495ae36f -> :sswitch_6
        0x4b682016 -> :sswitch_17
        0x4c2c3d47 -> :sswitch_a
        0x4fbd3404 -> :sswitch_e
        0x513057a2 -> :sswitch_9
        0x5251f4b5 -> :sswitch_11
        0x52bdf1ea -> :sswitch_2
        0x53b4af39 -> :sswitch_14
        0x5d423c41 -> :sswitch_d
        0x5eb9bbe6 -> :sswitch_b
        0x62a11cf0 -> :sswitch_c
        0x6336cc4f -> :sswitch_5
        0x63c342a4 -> :sswitch_13
        0x6e2c44cb -> :sswitch_7
        0x6ecd0434 -> :sswitch_1
        0x72832f27 -> :sswitch_d
        0x752440d0 -> :sswitch_5
        0x78cc1976 -> :sswitch_10
        0x7eebf0cb -> :sswitch_f
    .end sparse-switch
.end method
