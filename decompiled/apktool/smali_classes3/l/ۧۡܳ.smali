.class public final synthetic Ll/ۧۡܳ;
.super Ljava/lang/Object;
.source "05ZQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ᩳۜܳ;

.field public final synthetic ۙ:Lbin/mt/plus/Main;

.field public final synthetic ᩶:Ll/ܽۢܳ;

.field public final synthetic ᩸:Ljava/util/List;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;ILl/ܽۢܳ;Lbin/mt/plus/Main;Ll/ᩳۜܳ;)V
    .locals 6

    const v0, -0x7006fa3e

    sget v1, Ll/᩺;->ۙۛܶ:I

    sget v2, Ll/ۘۘ;->᩷ۙ᩸:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a77\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5d6d

    const v5, -0x3d5f0ce1

    xor-int/2addr v4, v5

    const v5, -0x1918b7fd

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, 0xdb7

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 1
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_3

    goto/16 :goto_4

    .line 4
    :sswitch_0
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-nez v3, :cond_6

    goto/16 :goto_3

    :sswitch_1
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v3, :cond_8

    goto/16 :goto_3

    :sswitch_2
    sget-boolean v3, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v3, :cond_a

    goto/16 :goto_4

    .line 3
    :sswitch_3
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_4

    :sswitch_4
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput-object p4, p0, Ll/ۧۡܳ;->ۙ:Lbin/mt/plus/Main;

    iput-object p5, p0, Ll/ۧۡܳ;->ۗ:Ll/ᩳۜܳ;

    return-void

    :sswitch_6
    iput-object p3, p0, Ll/ۧۡܳ;->᩶:Ll/ܽۢܳ;

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v3

    if-gtz v3, :cond_0

    goto :goto_1

    :cond_0
    const-string v3, "\u073f\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x28a9

    const v5, -0x6e7d05af

    xor-int/2addr v4, v5

    const v5, 0x297c798a

    goto :goto_0

    .line 1
    :sswitch_7
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    const-string v3, "\u1a75\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x710f

    const v5, -0x65b55f0f

    xor-int/2addr v4, v5

    const v5, -0x3d20327c

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v3

    if-eqz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u06d6\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4249

    const v5, -0x5480ffe3

    xor-int/2addr v4, v5

    const v5, -0x4e39ee28

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u06d6\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x27

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1131

    const v5, 0x5b58b129

    xor-int/2addr v4, v5

    const v5, -0x6f74734c

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u06d7\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x655b

    const v5, -0x454f5a35

    xor-int/2addr v4, v5

    const v5, -0x725a204f

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u1a73\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xc9

    const v5, -0x729728d6

    xor-int/2addr v4, v5

    const v5, -0x4ce95f1f

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    move-result v3

    if-eqz v3, :cond_5

    goto :goto_2

    :cond_5
    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x57

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2855

    const v5, 0x1a23a756

    xor-int/2addr v4, v5

    const v5, 0x7c17eb3f

    goto/16 :goto_0

    .line 3
    :sswitch_b
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_7

    :cond_6
    :goto_2
    const-string v3, "\u1a74\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6561

    const v5, 0x62e45c6a

    xor-int/2addr v4, v5

    const v5, -0x63895682

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a75\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x107d

    const v5, 0x4f2e0c22    # 2.92003072E9f

    xor-int/2addr v4, v5

    const v5, 0xeb4b4b5

    goto/16 :goto_0

    .line 4
    :sswitch_c
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v3

    if-gtz v3, :cond_9

    :cond_8
    const-string v3, "\u05a8\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0xf

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5897

    const v5, -0x5447440

    xor-int/2addr v4, v5

    const v5, -0x6d18ce3e

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u1a79\u06ec"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x13

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5e97

    const v5, -0x2729b56b

    xor-int/2addr v4, v5

    const v5, 0x5daba1

    goto/16 :goto_0

    .line 0
    :sswitch_d
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u073a\u06dc"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2cd5

    const v5, -0xc41a9e8    # -3.015999E31f

    xor-int/2addr v4, v5

    const v5, 0x56b88407

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06dc\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x48e7

    const v5, 0x2ac5797f

    xor-int/2addr v4, v5

    const v5, 0x113141ee

    goto/16 :goto_0

    :sswitch_e
    iput-object p1, p0, Ll/ۧۡܳ;->᩸:Ljava/util/List;

    iput p2, p0, Ll/ۧۡܳ;->᩹:I

    .line 1
    sget v3, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u06db\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1777

    const v5, 0x19cc919e

    xor-int/2addr v4, v5

    const v5, -0x78e73ab9

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d8\u05a8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x33dd

    const v5, 0x6ba3bbfd

    xor-int/2addr v4, v5

    const v5, 0x57db8f5d

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x713e04be -> :sswitch_3
        -0x70c3a5ea -> :sswitch_4
        -0x66292296 -> :sswitch_c
        -0x65c6ec6a -> :sswitch_9
        -0x56696a82 -> :sswitch_1
        -0x51060bee -> :sswitch_4
        -0x5063ada1 -> :sswitch_b
        -0x434a247f -> :sswitch_7
        -0x22af47aa -> :sswitch_5
        -0x201934f0 -> :sswitch_8
        -0x1a9da5b3 -> :sswitch_2
        -0x1a49a474 -> :sswitch_c
        -0xf2dd005 -> :sswitch_e
        -0x5cfc406 -> :sswitch_a
        0x6db11 -> :sswitch_b
        0x20c0a89 -> :sswitch_0
        0x33a4a52 -> :sswitch_9
        0x1263b24d -> :sswitch_e
        0x13f0cbc9 -> :sswitch_d
        0x1c9f992b -> :sswitch_5
        0x265165c8 -> :sswitch_7
        0x2fec4dea -> :sswitch_8
        0x365b3732 -> :sswitch_6
        0x3ee7c49f -> :sswitch_2
        0x5d36cf24 -> :sswitch_a
        0x6238506e -> :sswitch_d
        0x635b6406 -> :sswitch_3
        0x689725c6 -> :sswitch_6
        0x7922c4b6 -> :sswitch_0
        0x7b188127 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, -0x4d5886c8

    sget v4, Ll/֨۬;->۫ۙ᩺:I

    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    const-string v6, "\u06db\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x58d9

    const v8, 0x69deaa76

    xor-int/2addr v7, v8

    const v8, -0x19511c9a

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v5

    mul-int/lit16 v3, v3, -0x2933

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v6, :cond_0

    goto/16 :goto_3

    :sswitch_0
    sget-boolean v6, Ll/ۘ᩶;->ܶۗۡ:Z

    if-eqz v6, :cond_b

    goto :goto_1

    .line 3
    :sswitch_1
    sget v6, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v6, :cond_6

    :cond_0
    :goto_1
    const-string v6, "\u1a73\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6d07

    const v8, 0x51022890

    xor-int/2addr v7, v8

    const v8, -0x152ea45

    goto :goto_0

    .line 2
    :sswitch_2
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    goto/16 :goto_3

    .line 3
    :sswitch_3
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    return-void

    .line 0
    :sswitch_4
    iget v3, p0, Ll/ۧۡܳ;->᩹:I

    iget-object v4, p0, Ll/ۧۡܳ;->᩶:Ll/ܽۢܳ;

    invoke-static {v2, v3, v4, v0, v1}, Ll/᩵ܺܳ;->֫(Ljava/util/List;ILl/ܽۢܳ;Lbin/mt/plus/Main;Ll/ᩳۜܳ;)V

    return-void

    :sswitch_5
    iget-object v2, p0, Ll/ۧۡܳ;->᩸:Ljava/util/List;

    sget-boolean v6, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v6, "\u06e0\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x4d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x75bf

    const v8, 0x7f04dcd2

    xor-int/2addr v7, v8

    const v8, -0x73f6b353

    goto :goto_0

    :sswitch_6
    iget-object v1, p0, Ll/ۧۡܳ;->ۗ:Ll/ᩳۜܳ;

    .line 4
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v6

    if-ltz v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v6, "\u1a74\u06e0"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4077

    const v8, 0x2c191477

    xor-int/2addr v7, v8

    const v8, -0x453677f6

    goto :goto_0

    :sswitch_7
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v6

    if-eqz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u1a7a\u06d7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0xee9

    const v8, -0x6a4cf8d3

    xor-int/2addr v7, v8

    const v8, -0x7db5c060

    goto/16 :goto_0

    .line 3
    :sswitch_8
    sget v6, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "\u06eb\u06d8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4675

    const v8, -0x2a527e6e

    xor-int/2addr v7, v8

    const v8, 0x20630e55

    goto/16 :goto_0

    :sswitch_9
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v6

    if-ltz v6, :cond_5

    :goto_2
    const-string v6, "\u06eb\u1a73"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x369

    const v8, -0x389b61f6

    xor-int/2addr v7, v8

    const v8, 0x3063e8a8

    goto/16 :goto_0

    :cond_5
    const-string v6, "\u0733\u1a76"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x55

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3f37

    const v8, 0x55b9302

    xor-int/2addr v7, v8

    const v8, -0x3039772f

    goto/16 :goto_0

    :sswitch_a
    sget v6, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v6, :cond_7

    :cond_6
    const-string v6, "\u1a77\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x25

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x32b5

    const v8, -0x657f832c

    xor-int/2addr v7, v8

    const v8, 0xfa77618

    goto/16 :goto_0

    :cond_7
    const-string v6, "\u1a7a\u073a"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x6f

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x64d9

    const v8, -0x4134097c

    xor-int/2addr v7, v8

    const v8, 0x51aa3c1a

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v6, :cond_8

    goto :goto_3

    :cond_8
    const-string v6, "\u06ec\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x35

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x3faf

    const v8, 0x7e17967

    xor-int/2addr v7, v8

    const v8, -0x7adc4a7a

    goto/16 :goto_0

    .line 4
    :sswitch_c
    sget v6, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v6, :cond_9

    goto :goto_4

    :cond_9
    const-string v6, "\u0733\u06ec"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2bb7

    const v8, -0x6127a142

    xor-int/2addr v7, v8

    const v8, -0x232de8eb

    goto/16 :goto_0

    .line 1
    :sswitch_d
    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    move-result v6

    if-eqz v6, :cond_a

    :goto_3
    const-string v6, "\u073a\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4643

    const v8, -0x1854314f

    xor-int/2addr v7, v8

    const v8, -0x41edb5b2

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06db\u1a73"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x551d

    const v8, -0x5423df8e

    xor-int/2addr v7, v8

    const v8, 0x2662c520

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/ۧۡܳ;->ۙ:Lbin/mt/plus/Main;

    .line 1
    sget v6, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v6, :cond_c

    :cond_b
    :goto_4
    const-string v6, "\u06d7\u06eb"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x70e9

    const v8, 0x1ec328a0

    xor-int/2addr v7, v8

    const v8, -0x7cbd6b2f

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u05a8\u06e8"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x75

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5435

    const v8, -0x79826fbe    # -4.7689995E-35f

    xor-int/2addr v7, v8

    const v8, 0x56df0f16

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7764f171 -> :sswitch_7
        -0x7695620d -> :sswitch_c
        -0x7532fc0b -> :sswitch_6
        -0x64eb3c01 -> :sswitch_0
        -0x4ae407d1 -> :sswitch_b
        -0x49694801 -> :sswitch_3
        -0x4449f476 -> :sswitch_6
        -0x32bedf85 -> :sswitch_e
        -0x1be2461d -> :sswitch_2
        -0x11d5c00b -> :sswitch_e
        -0xeceb765 -> :sswitch_8
        -0x18d985e -> :sswitch_9
        -0x1749143 -> :sswitch_7
        -0x14fdc3d -> :sswitch_d
        -0x598cbd -> :sswitch_5
        0x37d65a0 -> :sswitch_4
        0xd5f5cbd -> :sswitch_9
        0x15c204cd -> :sswitch_5
        0x20d1a8bf -> :sswitch_1
        0x2c4af80e -> :sswitch_1
        0x2cff8dca -> :sswitch_a
        0x2da8ee09 -> :sswitch_8
        0x3b73b548 -> :sswitch_0
        0x46a4ad5d -> :sswitch_a
        0x4b33ff70 -> :sswitch_c
        0x4d24b3ce -> :sswitch_d
        0x4dcea228 -> :sswitch_4
        0x51a6edf3 -> :sswitch_2
        0x675e9c00 -> :sswitch_3
        0x73da4727 -> :sswitch_b
    .end sparse-switch
.end method
