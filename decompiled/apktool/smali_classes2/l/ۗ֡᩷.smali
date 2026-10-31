.class public final synthetic Ll/ۗ֡᩷;
.super Ljava/lang/Object;
.source "G6K1"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ljava/lang/ref/WeakReference;

.field public final synthetic ᩸:Ll/۫ۤۡ;

.field public final synthetic ᩹:Landroid/content/pm/PackageManager;


# direct methods
.method public synthetic constructor <init>(Ll/۫ۤۡ;Landroid/content/pm/PackageManager;Ljava/lang/ref/WeakReference;)V
    .locals 6

    const v0, -0x43fb9972

    sget v1, Ll/ۗۚ;->ܶۛᩴ:I

    sget v2, Ll/ۙۨ;->ۡۗۙ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06e8\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x9c1

    const v5, 0x381b8c79

    xor-int/2addr v4, v5

    const v5, 0x78dd66e0

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x23f5

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    iput-object p3, p0, Ll/ۗ֡᩷;->᩶:Ljava/lang/ref/WeakReference;

    return-void

    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    sget v3, Ll/ۗۗ;->ۨ۬ۖ:I

    if-gez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, "\u073a\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4991

    const v5, 0x56cc15a5

    xor-int/2addr v4, v5

    const v5, -0x5c77adf4

    goto :goto_0

    .line 4
    :sswitch_1
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_a

    goto/16 :goto_2

    .line 1
    :sswitch_2
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_8

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    goto :goto_1

    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_5
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v3, "\u06d9\u1a74"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x28dd

    const v5, -0x5a40fcbe

    xor-int/2addr v4, v5

    const v5, 0x315848e5

    goto :goto_0

    :sswitch_6
    sget v3, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v3, :cond_2

    goto/16 :goto_4

    :cond_2
    const-string v3, "\u05a8\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1341

    const v5, 0x573ce04b

    xor-int/2addr v4, v5

    const v5, -0x2b0b88ad

    goto :goto_0

    .line 4
    :sswitch_7
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_3

    goto/16 :goto_4

    :cond_3
    const-string v3, "\u0733\u05a1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x221f

    const v5, 0x697ee453

    xor-int/2addr v4, v5

    const v5, -0x4c736bbc

    goto/16 :goto_0

    .line 1
    :sswitch_8
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_4

    :goto_1
    const-string v3, "\u05a1\u073a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x44d5

    const v5, -0x5884d904

    xor-int/2addr v4, v5

    const v5, -0x7125c980

    goto/16 :goto_0

    :cond_4
    const-string v3, "\u073f\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1487

    const v5, -0x7e7b6806

    xor-int/2addr v4, v5

    const v5, -0x4dfec478

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06e8\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, -0x49

    const v5, -0x48ff0ccf

    xor-int/2addr v4, v5

    const v5, 0x104392a7

    goto/16 :goto_0

    :sswitch_a
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_6

    goto/16 :goto_4

    :cond_6
    const-string v3, "\u06db\u0730"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x689f

    const v5, -0x555d71ba

    xor-int/2addr v4, v5

    const v5, 0x7b30db03

    goto/16 :goto_0

    :sswitch_b
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_7

    goto :goto_2

    :cond_7
    const-string v3, "\u06ec\u06df"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x26d

    const v5, -0x2355da92

    xor-int/2addr v4, v5

    const v5, 0x796e9375

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    move-result v3

    if-ltz v3, :cond_9

    :cond_8
    :goto_2
    const-string v3, "\u073a\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x62fb

    const v5, -0x716edd8

    xor-int/2addr v4, v5

    const v5, 0x5532f38a

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u06d9\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x6c4b

    const v5, 0x5fa62783

    xor-int/2addr v4, v5

    const v5, -0x72fee857

    goto/16 :goto_0

    .line 4
    :sswitch_d
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u1a7a\u06d6"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x78a3

    const v5, -0x1c89e27c

    xor-int/2addr v4, v5

    const v5, -0x24052cce

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u06dc\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x1b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1025

    const v5, 0xb9d58f3

    xor-int/2addr v4, v5

    const v5, 0x26b11f70

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/ۗ֡᩷;->᩸:Ll/۫ۤۡ;

    iput-object p2, p0, Ll/ۗ֡᩷;->᩹:Landroid/content/pm/PackageManager;

    .line 4
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v3

    if-eqz v3, :cond_c

    :goto_4
    const-string v3, "\u1a73\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x61

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5455

    const v5, 0x54eab21a

    xor-int/2addr v4, v5

    const v5, -0x30d60938

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e8\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x1b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2721

    const v5, -0x7ef67ee2

    xor-int/2addr v4, v5

    const v5, -0x73aef1f1

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6b45fdc1 -> :sswitch_7
        -0x6b30380a -> :sswitch_a
        -0x6a83cda8 -> :sswitch_e
        -0x6590c972 -> :sswitch_2
        -0x61d00f4a -> :sswitch_0
        -0x5f78dda7 -> :sswitch_e
        -0x5445edbf -> :sswitch_b
        -0x4d1e9967 -> :sswitch_1
        -0x3a7b96e2 -> :sswitch_0
        -0x25f9c64b -> :sswitch_1
        -0x1a750c38 -> :sswitch_4
        -0x21d3847 -> :sswitch_8
        -0x1023ca8 -> :sswitch_5
        -0x6cada -> :sswitch_2
        0x13709aeb -> :sswitch_6
        0x18fb79e1 -> :sswitch_a
        0x19ba1eab -> :sswitch_9
        0x25e614b4 -> :sswitch_7
        0x2fdef2ca -> :sswitch_3
        0x330848ab -> :sswitch_c
        0x3955482d -> :sswitch_5
        0x4563bc4f -> :sswitch_d
        0x47fd1eca -> :sswitch_b
        0x51efdc6f -> :sswitch_c
        0x5d8bde76 -> :sswitch_9
        0x5e2df97a -> :sswitch_6
        0x5f8c293a -> :sswitch_8
        0x637b0ac9 -> :sswitch_4
        0x638e2ac4 -> :sswitch_d
        0x7389cba0 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const v2, -0x5f5945cb

    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v4, Ll/ۙۨ;->ۡۗۙ:I

    const-string v5, "\u06e4\u1a7a"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x146b

    const v7, -0x144ed285

    xor-int/2addr v6, v7

    const v7, 0x3fff6bef

    :goto_0
    xor-int/2addr v5, v7

    xor-int/2addr v2, v4

    mul-int/lit16 v2, v2, 0x6dd3

    shr-int/lit8 v2, v2, 0x1f

    and-int/2addr v2, v6

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_0

    .line 58
    :try_start_0
    invoke-static {v0, v1}, Ll/ۛ֡᩷;->֫(Ll/۫ۤۡ;Landroid/content/pm/PackageManager;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :sswitch_0
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    sget v5, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v5, :cond_b

    goto :goto_1

    .line 49
    :sswitch_1
    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v5, :cond_0

    goto/16 :goto_4

    :cond_0
    :goto_1
    const-string v5, "\u06dc\u073a"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x2405

    const v7, -0x37878027

    xor-int/2addr v6, v7

    const v7, -0x74ce572e

    goto :goto_0

    .line 31
    :sswitch_2
    sget v5, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-gez v5, :cond_4

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_4

    .line 23
    :sswitch_4
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    return-void

    .line 63
    :sswitch_5
    new-instance v5, Ll/۬֡᩷;

    const/4 v6, 0x0

    .line 55
    sget v7, Ll/֡֡;->֫ۤܳ:I

    if-ltz v7, :cond_1

    goto :goto_3

    .line 63
    :cond_1
    iget-object v7, p0, Ll/ۗ֡᩷;->᩶:Ljava/lang/ref/WeakReference;

    .line 5
    sget v8, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v8, :cond_2

    goto/16 :goto_5

    .line 63
    :cond_2
    invoke-direct {v5, v6, v7}, Ll/۬֡᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v5}, Ll/֡ۜ;->ܽܺۛ(Ljava/lang/Object;)V

    return-void

    :catch_0
    :goto_2
    const-string v5, "\u1a73\u06d7"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, -0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xa3b

    const v7, -0x7009ab89    # -2.4290008E-29f

    xor-int/2addr v6, v7

    const v7, 0x37ac03e0

    goto :goto_0

    .line 4
    :sswitch_6
    iget-object v1, p0, Ll/ۗ֡᩷;->᩹:Landroid/content/pm/PackageManager;

    const-string v5, "\u0736\u06d8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x4b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x3101

    const v7, 0x75728ab

    xor-int/2addr v6, v7

    const v7, 0x21729fc2

    goto/16 :goto_0

    :sswitch_7
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v5

    if-eqz v5, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v5, "\u073d\u05a8"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, -0x45

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x65b9

    const v7, -0x47277b97

    xor-int/2addr v6, v7

    const v7, 0x54af38db

    goto/16 :goto_0

    :sswitch_8
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v5

    if-ltz v5, :cond_5

    :cond_4
    :goto_3
    const-string v5, "\u06df\u05a1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0xa47

    const v7, 0x7c141c04

    xor-int/2addr v6, v7

    const v7, 0xcff8462

    goto/16 :goto_0

    :cond_5
    const-string v5, "\u06d9\u073f"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x39

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x6b2b

    const v7, 0x3da4cc5f

    xor-int/2addr v6, v7

    const v7, 0x56821a98

    goto/16 :goto_0

    :sswitch_9
    sget v5, Ll/ۘܿ;->ۘܰ۫:I

    if-ltz v5, :cond_6

    goto/16 :goto_6

    :cond_6
    const-string v5, "\u06ec\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, 0x75d1

    const v7, -0x43376969

    xor-int/2addr v6, v7

    const v7, -0x1d9d4b4c

    goto/16 :goto_0

    .line 24
    :sswitch_a
    sget v5, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v5, :cond_7

    :goto_4
    const-string v5, "\u1a74\u06da"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    add-int/2addr v5, v4

    mul-int/lit8 v5, v5, 0x21

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x1927

    const v7, 0x49ac161e    # 1409731.8f

    xor-int/2addr v6, v7

    const v7, -0x31a71323

    goto/16 :goto_0

    :cond_7
    const-string v5, "\u06dc\u1a74"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v3, v5

    mul-int/lit8 v5, v5, 0x57

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x4ca3

    const v7, 0x66b4ce5e

    xor-int/2addr v6, v7

    const v7, 0x52d4d549

    goto/16 :goto_0

    :sswitch_b
    sget v5, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v5, :cond_8

    goto :goto_6

    :cond_8
    const-string v5, "\u05a8\u05a1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x5be1

    const v7, 0x2916d352

    xor-int/2addr v6, v7

    const v7, 0x69a744a4

    goto/16 :goto_0

    :sswitch_c
    sget-boolean v5, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v5, :cond_9

    goto :goto_5

    :cond_9
    const-string v5, "\u06eb\u073f"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x68c1

    const v7, -0x71d7fd78

    xor-int/2addr v6, v7

    const v7, 0x2e24b9a9

    goto/16 :goto_0

    .line 33
    :sswitch_d
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_a

    :goto_5
    const-string v5, "\u073f\u06e1"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v4

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0xcc5

    const v7, -0x5ad76f23

    xor-int/2addr v6, v7

    const v7, -0x1f54bcc3

    goto/16 :goto_0

    :cond_a
    const-string v5, "\u0733\u06e1"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    sub-int v5, v4, v5

    mul-int/lit8 v5, v5, 0x23

    xor-int v6, v5, v3

    mul-int/lit16 v6, v6, -0x3d97

    const v7, -0x756bd619

    xor-int/2addr v6, v7

    const v7, -0x7f21e9b6

    goto/16 :goto_0

    .line 2
    :sswitch_e
    iget-object v0, p0, Ll/ۗ֡᩷;->᩸:Ll/۫ۤۡ;

    .line 52
    sget v5, Ll/ۛ;->᩺᩻֫:I

    if-ltz v5, :cond_c

    :cond_b
    :goto_6
    const-string v5, "\u1a7b\u073d"

    invoke-static {v5}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    mul-int/lit8 v5, v5, 0x5b

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, 0x6661

    const v7, -0x5122ce91

    xor-int/2addr v6, v7

    const v7, 0x5aa03545

    goto/16 :goto_0

    :cond_c
    const-string v5, "\u06d9\u06e2"

    invoke-static {v5}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v5

    xor-int/2addr v5, v3

    xor-int v6, v5, v4

    mul-int/lit16 v6, v6, -0x3efd

    const v7, -0x40d29e3a

    xor-int/2addr v6, v7

    const v7, 0x70635159

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x6ac93c31 -> :sswitch_9
        -0x681ea027 -> :sswitch_5
        -0x5d8eb718 -> :sswitch_a
        -0x59ea1a8f -> :sswitch_7
        -0x52755234 -> :sswitch_2
        -0x4f2023c5 -> :sswitch_9
        -0x3fdd8aa5 -> :sswitch_c
        -0x3b26485b -> :sswitch_8
        -0x39ef8581 -> :sswitch_0
        -0x38f490e7 -> :sswitch_1
        -0x36d9c9f2 -> :sswitch_7
        -0x34b1e9e4 -> :sswitch_c
        -0x2262ac55 -> :sswitch_b
        -0x2222452c -> :sswitch_e
        -0x1ab0641a -> :sswitch_3
        -0x1a325822 -> :sswitch_0
        -0x11a6ec36 -> :sswitch_3
        -0xd568bec -> :sswitch_6
        0x7b70a5 -> :sswitch_8
        0x89fbadd -> :sswitch_b
        0x1142fa0f -> :sswitch_e
        0x1fce396a -> :sswitch_1
        0x30faa2bb -> :sswitch_4
        0x3219af60 -> :sswitch_6
        0x36f1b61c -> :sswitch_5
        0x46cc05b5 -> :sswitch_4
        0x471a91ab -> :sswitch_a
        0x5edeeb86 -> :sswitch_d
        0x649c011d -> :sswitch_d
        0x6ba24a9d -> :sswitch_2
    .end sparse-switch
.end method
