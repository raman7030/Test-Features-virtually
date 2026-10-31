.class public final Ll/᩹ۛܽ;
.super Ljava/lang/Object;
.source "D17I"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ᩸:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩶ۛܽ;)V
    .locals 7

    const/4 v0, 0x0

    const v1, 0x6e166ba2

    sget v2, Ll/۠;->ܺܺܶ:I

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    .line 751
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v4, "\u06db\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x21

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x2ccd

    const v6, 0x44c28d3

    xor-int/2addr v5, v6

    const v6, 0x6d54a8d9

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, 0x313b

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 691
    sget v4, Ll/۠;->ܺܺܶ:I

    if-gez v4, :cond_0

    goto/16 :goto_1

    .line 666
    :sswitch_0
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    sget v4, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-gez v4, :cond_b

    goto/16 :goto_2

    :cond_0
    const-string v4, "\u1a73\u1a74"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6085

    const v6, 0x4bf07379    # 3.1516402E7f

    xor-int/2addr v5, v6

    const v6, 0x1c04454

    goto :goto_0

    .line 659
    :sswitch_1
    sget v4, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v4, :cond_8

    goto :goto_1

    .line 29
    :sswitch_2
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    goto :goto_1

    .line 327
    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 752
    :sswitch_4
    iput-object v0, p0, Ll/᩹ۛܽ;->᩸:Ljava/lang/ref/WeakReference;

    return-void

    .line 121
    :sswitch_5
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v4

    if-eqz v4, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v4, "\u06dc\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x77

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1bb

    const v6, 0x1e3abd31

    xor-int/2addr v5, v6

    const v6, -0x1a5a82e4

    goto :goto_0

    .line 72
    :sswitch_6
    sget-boolean v4, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v4, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v4, "\u06e4\u1a75"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x713

    const v6, 0x426ebd37

    xor-int/2addr v5, v6

    const v6, -0x5c572298

    goto :goto_0

    :sswitch_7
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v4, "\u06e0\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x43a5

    const v6, -0x7747f29

    xor-int/2addr v5, v6

    const v6, -0x6351a76b

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_4

    :goto_1
    const-string v4, "\u0730\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d23

    const v6, 0x41cfba8

    xor-int/2addr v5, v6

    const v6, -0x3a6f7331

    goto/16 :goto_0

    :cond_4
    const-string v4, "\u0730\u1a78"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x7ab3

    const v6, 0xff4aeda

    xor-int/2addr v5, v6

    const v6, 0x5cbe66c0

    goto/16 :goto_0

    .line 372
    :sswitch_9
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v4

    if-nez v4, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v4, "\u1a78\u06e2"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x1741

    const v6, -0x2e1ca94a

    xor-int/2addr v5, v6

    const v6, 0x50cad230

    goto/16 :goto_0

    .line 342
    :sswitch_a
    sget v4, Ll/᩺;->ۙۛܶ:I

    if-gtz v4, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v4, "\u06e7\u1a7a"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x61

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4d2d

    const v6, -0x4d57b5

    xor-int/2addr v5, v6

    const v6, 0x7eb19eca

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_7

    goto :goto_2

    :cond_7
    const-string v4, "\u06e4\u06d8"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x25fd

    const v6, -0x515abc25

    xor-int/2addr v5, v6

    const v6, -0x7688c68f

    goto/16 :goto_0

    .line 200
    :sswitch_c
    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-gtz v4, :cond_9

    :cond_8
    :goto_2
    const-string v4, "\u0730\u1a79"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x518b

    const v6, -0x21b6f7e5

    xor-int/2addr v5, v6

    const v6, -0x1b39e177

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a74\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x53

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0xa69

    const v6, 0x2ae47746

    xor-int/2addr v5, v6

    const v6, 0x100e0a89

    goto/16 :goto_0

    .line 302
    :sswitch_d
    sget v4, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v4, :cond_a

    :goto_3
    const-string v4, "\u06da\u06d9"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2ae7

    const v6, 0x56203c8d

    xor-int/2addr v5, v6

    const v6, 0x2c4b0221

    goto/16 :goto_0

    :cond_a
    const-string v4, "\u1a79\u1a7b"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x3f11

    const v6, 0x7e853b2c

    xor-int/2addr v5, v6

    const v6, -0x6a82691a

    goto/16 :goto_0

    .line 752
    :sswitch_e
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 563
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_c

    :cond_b
    :goto_4
    const-string v4, "\u06d9\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x991

    const v6, 0x18c95994

    xor-int/2addr v5, v6

    const v6, -0x48a83e35

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u06da\u06da"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x2125

    const v6, -0x51ea1093

    xor-int/2addr v5, v6

    const v6, 0x1a8845ea

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6244e3a7 -> :sswitch_0
        -0x5dc590f9 -> :sswitch_4
        -0x5999bdb0 -> :sswitch_7
        -0x5487a413 -> :sswitch_d
        -0x52f4c341 -> :sswitch_4
        -0x1a224d8e -> :sswitch_8
        -0x176f7028 -> :sswitch_3
        -0x13a2f194 -> :sswitch_5
        -0x12b1a531 -> :sswitch_7
        -0x852dfa7 -> :sswitch_9
        0x10960dd -> :sswitch_c
        0x12b5b67e -> :sswitch_9
        0x16c28be4 -> :sswitch_0
        0x202d85cd -> :sswitch_e
        0x206a82ec -> :sswitch_c
        0x2484ba4b -> :sswitch_d
        0x29bad84a -> :sswitch_6
        0x3466fa65 -> :sswitch_6
        0x3a9abd81 -> :sswitch_8
        0x3aea27de -> :sswitch_e
        0x3c63be2d -> :sswitch_a
        0x3db301f7 -> :sswitch_1
        0x41e5c659 -> :sswitch_a
        0x42cd2df1 -> :sswitch_b
        0x55362287 -> :sswitch_2
        0x5c1bfb02 -> :sswitch_1
        0x5dedfbe0 -> :sswitch_b
        0x647d4495 -> :sswitch_5
        0x67d82d3e -> :sswitch_2
        0x70843396 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, 0x255eba32

    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    sget v4, Ll/֫ܽ;->ۚ᩷᩹:I

    const-string v5, "\u073a\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x6d

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7a07

    const v7, -0x6dc6749d

    xor-int/2addr v6, v7

    const v7, -0x5bb00651

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, -0xf29

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 124
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_1

    goto/16 :goto_2

    .line 540
    :sswitch_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-eqz v5, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v5, "\u0736\u06e7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x46c9

    const v7, -0x3a64348c

    xor-int/2addr v6, v7

    const v7, -0x29112e55

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v5

    if-eqz v5, :cond_b

    goto/16 :goto_2

    :cond_1
    const-string v5, "\u05a8\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7e6d

    const v7, 0x736ee5cf

    xor-int/2addr v6, v7

    const v7, -0x6ebb9a90

    goto :goto_0

    .line 74
    :sswitch_2
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    return-void

    .line 759
    :sswitch_4
    invoke-static {v1}, Ll/᩶ۛܽ;->ۜ(Ll/᩶ۛܽ;)V

    goto :goto_1

    :sswitch_5
    return-void

    .line 757
    :sswitch_6
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶ۛܽ;

    if-eqz v1, :cond_2

    const-string v5, "\u06e1\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x7f

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x5cf1

    const v7, -0x53107554

    xor-int/2addr v6, v7

    const v7, 0x2642b099

    goto :goto_0

    :cond_2
    :goto_1
    const-string v5, "\u06e8\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3577

    const v7, 0x65b1d9e1

    xor-int/2addr v6, v7

    const v7, -0x12a951e6

    goto/16 :goto_0

    .line 187
    :sswitch_7
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v5, "\u1a75\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7811

    const v7, -0x5fa53244

    xor-int/2addr v6, v7

    const v7, 0x73a93556

    goto/16 :goto_0

    .line 417
    :sswitch_8
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v5, "\u073a\u06d9"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x7d

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x48c3

    const v7, 0x3f0837fa

    xor-int/2addr v6, v7

    const v7, -0x30755008

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v5, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v5, "\u06e1\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x4db5

    const v7, 0x68a12eae

    xor-int/2addr v6, v7

    const v7, -0x99c8c5d

    goto/16 :goto_0

    .line 334
    :sswitch_a
    sget v5, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v5, :cond_6

    goto/16 :goto_3

    :cond_6
    const-string v5, "\u1a79\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x6f

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x1a17

    const v7, 0x1c260432

    xor-int/2addr v6, v7

    const v7, -0x7deb18d3

    goto/16 :goto_0

    .line 203
    :sswitch_b
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_7

    goto/16 :goto_4

    :cond_7
    const-string v5, "\u073d\u1a73"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x75

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x422b

    const v7, 0x6ee15ec1

    xor-int/2addr v6, v7

    const v7, 0x756e1317

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/֡۬;->۠֡᩶:I

    if-gtz v5, :cond_8

    goto :goto_2

    :cond_8
    const-string v5, "\u06d6\u1a77"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x9

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x75a1

    const v7, -0x5ea69710

    xor-int/2addr v6, v7

    const v7, 0x5471f54

    goto/16 :goto_0

    :sswitch_d
    sget v5, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v5, :cond_9

    goto :goto_3

    :cond_9
    const-string v5, "\u05ab\u1a7b"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x3b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x965

    const v7, 0x59b6438c

    xor-int/2addr v6, v7

    const v7, 0x317ddb5b

    goto/16 :goto_0

    .line 135
    :sswitch_e
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_a

    :goto_2
    const-string v5, "\u1a77\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x43

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x73cf

    const v7, 0x1dc30b5d

    xor-int/2addr v6, v7

    const v7, 0x7ea5ca21

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u06e0\u0733"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x18bb

    const v7, 0x68f4ad2c

    xor-int/2addr v6, v7

    const v7, -0x2e9f1ff9

    goto/16 :goto_0

    .line 520
    :sswitch_f
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    move-result v5

    if-ltz v5, :cond_c

    :cond_b
    :goto_3
    const-string v5, "\u06d8\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x53

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1013

    const v7, -0x16f4153

    xor-int/2addr v6, v7

    const v7, 0x1ec46faa

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u0736\u0736"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x61

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x84f

    const v7, -0x667e08e9

    xor-int/2addr v6, v7

    const v7, -0x197feafc

    goto/16 :goto_0

    .line 757
    :sswitch_10
    iget-object v0, p0, Ll/᩹ۛܽ;->᩸:Ljava/lang/ref/WeakReference;

    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_d

    :goto_4
    const-string v5, "\u1a7b\u06e2"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x69c1

    const v7, -0x3ac8d914

    xor-int/2addr v6, v7

    const v7, 0x199c48a2

    goto/16 :goto_0

    :cond_d
    const-string v5, "\u05ab\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x49

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6b3b

    const v7, -0xee3a79f

    xor-int/2addr v6, v7

    const v7, 0x406dcfb1

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79dc1cba -> :sswitch_4
        -0x6b572f92 -> :sswitch_f
        -0x66b2d333 -> :sswitch_8
        -0x644e23ba -> :sswitch_3
        -0x40979a4e -> :sswitch_6
        -0x3f4ae24d -> :sswitch_c
        -0x3614a2ad -> :sswitch_4
        -0x30d0d575 -> :sswitch_5
        -0x25bba4f7 -> :sswitch_b
        -0x1db62e91 -> :sswitch_6
        -0x1cd5d94c -> :sswitch_7
        -0x1af8b0a3 -> :sswitch_7
        -0x12145a4b -> :sswitch_c
        -0xb68904e -> :sswitch_1
        0xa7738b -> :sswitch_2
        0x6b3bd66 -> :sswitch_0
        0xbc6e7cd -> :sswitch_1
        0x14fb19af -> :sswitch_0
        0x189658d3 -> :sswitch_2
        0x233b576d -> :sswitch_9
        0x24df5679 -> :sswitch_5
        0x3a8380e8 -> :sswitch_10
        0x4083e37e -> :sswitch_d
        0x43b2c5ac -> :sswitch_b
        0x46070f31 -> :sswitch_10
        0x470412fc -> :sswitch_a
        0x47205778 -> :sswitch_f
        0x4b068c3d -> :sswitch_a
        0x5e671b52 -> :sswitch_e
        0x678070f7 -> :sswitch_8
        0x6e686167 -> :sswitch_e
        0x7610cf34 -> :sswitch_9
        0x7b562c40 -> :sswitch_3
        0x7dc2acc7 -> :sswitch_d
    .end sparse-switch
.end method
