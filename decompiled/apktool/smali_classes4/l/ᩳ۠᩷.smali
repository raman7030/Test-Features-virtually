.class public final synthetic Ll/ᩳ۠᩷;
.super Ljava/lang/Object;
.source "V6B4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:Ljava/util/ArrayList;

.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Lbin/mt/plus/Main;

.field public final synthetic ᩹:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Lbin/mt/plus/Main;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 6

    const v0, -0x60d6fd6b

    sget v1, Ll/֡᩺;->ᩴ᩹ۛ:I

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u0736\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x39

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1fc9

    const v5, 0x562a9c8

    xor-int/2addr v4, v5

    const v5, 0x481b4644

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x48c1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p1, p0, Ll/ᩳ۠᩷;->᩸:Lbin/mt/plus/Main;

    iput-object p2, p0, Ll/ᩳ۠᩷;->᩹:Landroid/os/Bundle;

    .line 1
    sget v3, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v3, :cond_c

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u073d\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x366f

    const v5, 0x45571acc

    xor-int/2addr v4, v5

    const v5, 0x28fa51f0

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    move-result v3

    if-nez v3, :cond_b

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v3

    if-gtz v3, :cond_8

    goto :goto_1

    .line 2
    :sswitch_3
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    :goto_1
    const-string v3, "\u1a74\u06e2"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7dcd

    const v5, 0x1fe94f9b

    xor-int/2addr v4, v5

    const v5, -0x9314247

    goto :goto_0

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֫֫;->᩵᩸ܽ()Z

    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p3, p0, Ll/ᩳ۠᩷;->᩶:Ljava/lang/String;

    iput-object p4, p0, Ll/ᩳ۠᩷;->ۙ:Ljava/util/ArrayList;

    return-void

    .line 4
    :sswitch_6
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06e2\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x511d

    const v5, 0x7133f73a

    xor-int/2addr v4, v5

    const v5, -0x33f3f5d7    # -3.6710564E7f

    goto/16 :goto_0

    .line 3
    :sswitch_7
    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06e4\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x12eb

    const v5, 0x4fc871f9

    xor-int/2addr v4, v5

    const v5, 0x5b631100

    goto/16 :goto_0

    :sswitch_8
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u05a1\u06dc"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4a1f

    const v5, 0x65b7799

    xor-int/2addr v4, v5

    const v5, 0x5b0c4a2e

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v3, :cond_4

    goto/16 :goto_4

    :cond_4
    const-string v3, "\u06e7\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4fb7

    const v5, -0x1b3ecc9b

    xor-int/2addr v4, v5

    const v5, 0x1441ccfe

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v3

    if-ltz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06e8\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x5475

    const v5, 0x73cd0b60

    xor-int/2addr v4, v5

    const v5, 0x4135b896

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_6

    goto :goto_2

    :cond_6
    const-string v3, "\u06e8\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3783

    const v5, -0x50dcc6e7

    xor-int/2addr v4, v5

    const v5, -0x378a9330    # -251315.25f

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u1a7a\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x55

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x489d

    const v5, 0x2865d476

    xor-int/2addr v4, v5

    const v5, 0x612f3a83

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u0736\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x6c79

    const v5, -0x5a093429

    xor-int/2addr v4, v5

    const v5, 0x7f9201ea

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06e0\u06e7"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x335b

    const v5, 0x31d4491d

    xor-int/2addr v4, v5

    const v5, -0x3723bb9c

    goto/16 :goto_0

    .line 0
    :sswitch_e
    sget v3, Ll/۟;->ۗۤۛ:I

    if-eqz v3, :cond_a

    :goto_3
    const-string v3, "\u1a79\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x7293

    const v5, 0x784154be

    xor-int/2addr v4, v5

    const v5, 0x457b80aa

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a75\u06e0"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x49

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2291

    const v5, 0x43399401

    xor-int/2addr v4, v5

    const v5, -0x168e9a45

    goto/16 :goto_0

    :cond_b
    :goto_4
    const-string v3, "\u06d6\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5b7b

    const v5, 0xf780d60

    xor-int/2addr v4, v5

    const v5, -0x1ec3a168

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a79\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x2f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5051

    const v5, -0x14b1f928

    xor-int/2addr v4, v5

    const v5, 0x71f341d7

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x674f5105 -> :sswitch_3
        -0x62d35913 -> :sswitch_a
        -0x5a2dfecf -> :sswitch_1
        -0x569ea6a7 -> :sswitch_8
        -0x3dae714f -> :sswitch_3
        -0x352cd29a -> :sswitch_9
        -0x31238cd7 -> :sswitch_0
        -0x2f57c8df -> :sswitch_7
        -0x2f38d6bf -> :sswitch_6
        -0x2dcd6811 -> :sswitch_e
        0x50c26ba -> :sswitch_1
        0x15bfef96 -> :sswitch_7
        0x2d34c761 -> :sswitch_2
        0x3086b682 -> :sswitch_e
        0x3a11af6f -> :sswitch_5
        0x3c326432 -> :sswitch_d
        0x4243cacb -> :sswitch_5
        0x43785037 -> :sswitch_c
        0x463a8640 -> :sswitch_a
        0x465560af -> :sswitch_8
        0x4e359417 -> :sswitch_4
        0x55a459d1 -> :sswitch_0
        0x5d7e56f1 -> :sswitch_b
        0x5e05618f -> :sswitch_b
        0x6334796c -> :sswitch_c
        0x65a8e925 -> :sswitch_4
        0x684c5acc -> :sswitch_6
        0x6d6088e0 -> :sswitch_2
        0x7ac40afd -> :sswitch_d
        0x7f5952a9 -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5d0839ab

    sget v3, Ll/֡ܶ;->ᩴܿ᩸:I

    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v5, "\u1a76\u1a75"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x4b

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x1e27

    const v7, -0x49d4d413

    xor-int/2addr v6, v7

    const v7, -0x2aebf1b0

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v3

    mul-int/lit16 v2, v2, 0x56d7

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-gez v5, :cond_b

    goto/16 :goto_4

    :sswitch_0
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    sget v5, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v5, :cond_7

    goto/16 :goto_2

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    sget v5, Ll/ۗۚ;->ܶۛᩴ:I

    if-gez v5, :cond_5

    goto/16 :goto_4

    .line 4
    :sswitch_2
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    return-void

    .line 0
    :sswitch_4
    iget-object v2, p0, Ll/ᩳ۠᩷;->᩸:Lbin/mt/plus/Main;

    iget-object v3, p0, Ll/ᩳ۠᩷;->᩹:Landroid/os/Bundle;

    invoke-static {v2, v3, v0, v1}, Lbin/mt/plus/Main;->֫(Lbin/mt/plus/Main;Landroid/os/Bundle;Ljava/lang/String;Ljava/util/ArrayList;)V

    return-void

    :sswitch_5
    iget-object v1, p0, Ll/ᩳ۠᩷;->ۙ:Ljava/util/ArrayList;

    .line 2
    sget v5, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v5, :cond_0

    goto :goto_1

    :cond_0
    const-string v5, "\u05a8\u06e4"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x5923

    const v7, -0x569e5869

    xor-int/2addr v6, v7

    const v7, -0x1d02be56

    goto :goto_0

    .line 3
    :sswitch_6
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_1

    :goto_1
    const-string v5, "\u1a78\u1a73"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x41

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x4021

    const v7, -0x6731574b

    xor-int/2addr v6, v7

    const v7, -0x527a83a7

    goto :goto_0

    :cond_1
    const-string v5, "\u06d7\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x744f

    const v7, -0x4553e0e2

    xor-int/2addr v6, v7

    const v7, -0xcf483d8

    goto/16 :goto_0

    .line 4
    :sswitch_7
    sget v5, Ll/֨۟;->᩹֫᩷:I

    if-eqz v5, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v5, "\u1a77\u1a7a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x2abd

    const v7, 0x4743ab78

    xor-int/2addr v6, v7

    const v7, 0x45367af8

    goto/16 :goto_0

    :sswitch_8
    sget v5, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u06e1\u06e8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x79

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x7edd

    const v7, 0xfd45e8a

    xor-int/2addr v6, v7

    const v7, 0x1f490295

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_3

    :cond_4
    const-string v5, "\u073d\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x5c37

    const v7, 0x7a0814c3

    xor-int/2addr v6, v7

    const v7, -0x6604ee20

    goto/16 :goto_0

    :sswitch_a
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_6

    :cond_5
    :goto_2
    const-string v5, "\u0730\u06e8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0xb

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3a5b

    const v7, -0x98ef0ab

    xor-int/2addr v6, v7

    const v7, 0x5d885391

    goto/16 :goto_0

    :cond_6
    const-string v5, "\u1a78\u05ab"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1057

    const v7, 0x6a40d841

    xor-int/2addr v6, v7

    const v7, 0x608babe

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v5, :cond_8

    :cond_7
    :goto_3
    const-string v5, "\u06e8\u0736"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x38af

    const v7, -0x21504117

    xor-int/2addr v6, v7

    const v7, -0x6f6f6e74

    goto/16 :goto_0

    :cond_8
    const-string v5, "\u06d9\u0733"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x49eb

    const v7, 0x572c49ce

    xor-int/2addr v6, v7

    const v7, 0x2c398b2e

    goto/16 :goto_0

    :sswitch_c
    sget v5, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v5, :cond_9

    :goto_4
    const-string v5, "\u06df\u1a79"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0xa23

    const v7, -0xe702665

    xor-int/2addr v6, v7

    const v7, 0x3556e07

    goto/16 :goto_0

    :cond_9
    const-string v5, "\u1a77\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x9df

    const v7, -0x18411af6

    xor-int/2addr v6, v7

    const v7, -0x4fff009

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget-boolean v5, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v5, :cond_a

    goto :goto_5

    :cond_a
    const-string v5, "\u1a7b\u06df"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3c05

    const v7, 0x214da917

    xor-int/2addr v6, v7

    const v7, -0x7fa647cc

    goto/16 :goto_0

    :sswitch_e
    iget-object v0, p0, Ll/ᩳ۠᩷;->᩶:Ljava/lang/String;

    .line 1
    sget-boolean v5, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v5, :cond_c

    :cond_b
    :goto_5
    const-string v5, "\u1a75\u06d8"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x47

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa31

    const v7, -0x47634455

    xor-int/2addr v6, v7

    const v7, 0x340e7d9f

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d9\u1a78"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x7ffb

    const v7, -0x6128d649

    xor-int/2addr v6, v7

    const v7, 0x5562b1aa

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7ce8c5c5 -> :sswitch_4
        -0x7a7d6816 -> :sswitch_e
        -0x65e99de8 -> :sswitch_6
        -0x651606ef -> :sswitch_b
        -0x64657eca -> :sswitch_7
        -0x5a456c9f -> :sswitch_0
        -0x58eb48ad -> :sswitch_7
        -0x5539725c -> :sswitch_d
        -0x49b986f6 -> :sswitch_c
        -0x34ff1568 -> :sswitch_2
        -0x2f7d2862 -> :sswitch_b
        -0xce5f9a9 -> :sswitch_a
        -0x54a9825 -> :sswitch_0
        -0x3b9e969 -> :sswitch_1
        -0x31d7b87 -> :sswitch_2
        0x142d47 -> :sswitch_6
        0xa3ef28 -> :sswitch_e
        0x220cb905 -> :sswitch_a
        0x2843bac9 -> :sswitch_1
        0x2c28f163 -> :sswitch_5
        0x2c2e615a -> :sswitch_4
        0x348892b8 -> :sswitch_d
        0x46d8a041 -> :sswitch_8
        0x590d4216 -> :sswitch_8
        0x5f79d5f3 -> :sswitch_c
        0x62bf4cd0 -> :sswitch_3
        0x672bd5b7 -> :sswitch_3
        0x67e14d20 -> :sswitch_9
        0x72a8d6c4 -> :sswitch_9
        0x78f82f7b -> :sswitch_5
    .end sparse-switch
.end method
