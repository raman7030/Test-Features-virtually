.class public final synthetic Ll/᩹֨ۡ;
.super Ljava/lang/Object;
.source "E4FN"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۗ:Ll/ۢ۠ۡ;

.field public final synthetic ۙ:Landroid/app/Activity;

.field public final synthetic ᩶:Ll/᩷᩵ۡ;

.field public final synthetic ᩸:Ljava/lang/String;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/᩷᩵ۡ;Landroid/app/Activity;Ll/ۢ۠ۡ;)V
    .locals 6

    const v0, -0x1a9a8600

    sget v1, Ll/۠;->ܺܺܶ:I

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06ec\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x50d5

    const v5, 0x27208b30

    xor-int/2addr v4, v5

    const v5, 0x4d6ae4ea

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x4595

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-lez v3, :cond_0

    goto/16 :goto_1

    :sswitch_0
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-lez v3, :cond_a

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06ec\u06e7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x2b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3b49

    const v5, 0x3cefcccb

    xor-int/2addr v4, v5

    const v5, 0x7940cc94

    goto :goto_0

    :sswitch_1
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v3

    if-eqz v3, :cond_6

    goto/16 :goto_2

    :sswitch_2
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    invoke-static {}, Ll/֡ۨ;->᩹᩹ۧ()Z

    goto/16 :goto_2

    :sswitch_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :sswitch_4
    iput-object p4, p0, Ll/᩹֨ۡ;->ۙ:Landroid/app/Activity;

    iput-object p5, p0, Ll/᩹֨ۡ;->ۗ:Ll/ۢ۠ۡ;

    return-void

    :sswitch_5
    iput-object p3, p0, Ll/᩹֨ۡ;->᩶:Ll/᩷᩵ۡ;

    .line 2
    sget v3, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v3, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v3, "\u06eb\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x37

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4f1d

    const v5, 0x1fae85ff

    xor-int/2addr v4, v5

    const v5, 0x30c0a8b5

    goto :goto_0

    .line 3
    :sswitch_6
    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    const-string v3, "\u06df\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x44b

    const v5, 0x4b2171c9    # 1.0580425E7f

    xor-int/2addr v4, v5

    const v5, 0x162238c2

    goto/16 :goto_0

    :sswitch_7
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v3, "\u05ab\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x2d77

    const v5, -0x295e2319

    xor-int/2addr v4, v5

    const v5, 0x7bf51ad0

    goto/16 :goto_0

    .line 2
    :sswitch_8
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_4

    goto :goto_1

    :cond_4
    const-string v3, "\u06e4\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x248f

    const v5, -0x4bed86c2

    xor-int/2addr v4, v5

    const v5, -0x492aebc9

    goto/16 :goto_0

    :sswitch_9
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v3, "\u06e7\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit8 v4, v4, 0x17

    const v5, -0x52ec36db

    xor-int/2addr v4, v5

    const v5, 0x4399a6f1

    goto/16 :goto_0

    .line 1
    :sswitch_a
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    :goto_1
    const-string v3, "\u073a\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2473

    const v5, -0xfbf78f1

    xor-int/2addr v4, v5

    const v5, -0x9943c5c

    goto/16 :goto_0

    :cond_7
    const-string v3, "\u1a7b\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0xd

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3531

    const v5, -0x4b9b9a87

    xor-int/2addr v4, v5

    const v5, -0x52b34d02

    goto/16 :goto_0

    :sswitch_b
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_8

    goto/16 :goto_3

    :cond_8
    const-string v3, "\u073a\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3e41

    const v5, 0x2ffb0bfa

    xor-int/2addr v4, v5

    const v5, -0x15236f3f

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨۟;->᩹֫᩷:I

    if-eqz v3, :cond_9

    :goto_2
    const-string v3, "\u1a73\u1a75"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3c61

    const v5, -0x5ec4084c

    xor-int/2addr v4, v5

    const v5, -0x601691e5

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u073a\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7045

    const v5, 0x70de3bce

    xor-int/2addr v4, v5

    const v5, -0x39e5ba08

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v3, Ll/֫ۧ;->ۙ۟ۧ:I

    if-gtz v3, :cond_b

    :cond_a
    const-string v3, "\u06e2\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x7f4b

    const v5, -0x22debd22

    xor-int/2addr v4, v5

    const v5, 0x7c092ecb

    goto/16 :goto_0

    :cond_b
    const-string v3, "\u1a79\u06d6"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x23

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4759

    const v5, -0x369250b2

    xor-int/2addr v4, v5

    const v5, 0x45cb51c0

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p1, p0, Ll/᩹֨ۡ;->᩸:Ljava/lang/String;

    iput-object p2, p0, Ll/᩹֨ۡ;->᩹:Ljava/lang/String;

    sget v3, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v3, :cond_c

    :goto_3
    const-string v3, "\u1a76\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x6b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x47ed

    const v5, 0x72a9d38d

    xor-int/2addr v4, v5

    const v5, 0x7ea410c

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u1a78\u06db"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x1821

    const v5, -0x4fe1ef0d

    xor-int/2addr v4, v5

    const v5, 0x192f12a9

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ecdd0c7 -> :sswitch_c
        -0x7eb42141 -> :sswitch_4
        -0x7639adc9 -> :sswitch_3
        -0x6bc34a60 -> :sswitch_e
        -0x67a9d0c8 -> :sswitch_2
        -0x652965fe -> :sswitch_1
        -0x5be91a23 -> :sswitch_9
        -0x5b42b607 -> :sswitch_4
        -0x59aac9cd -> :sswitch_0
        -0x582dd994 -> :sswitch_5
        -0x57231373 -> :sswitch_d
        -0x4f277954 -> :sswitch_7
        -0x47f5a5dd -> :sswitch_a
        -0x35faea46 -> :sswitch_6
        -0x32af300a -> :sswitch_3
        -0x2936665c -> :sswitch_8
        -0x18c11e40 -> :sswitch_d
        -0xc8cbf4f -> :sswitch_c
        -0x1bd809b -> :sswitch_0
        0x755b5f5 -> :sswitch_b
        0x92052f1 -> :sswitch_6
        0x10f6b0a6 -> :sswitch_8
        0x16c033b9 -> :sswitch_2
        0x17945d58 -> :sswitch_a
        0x4779c678 -> :sswitch_9
        0x501ba58d -> :sswitch_5
        0x6215fc76 -> :sswitch_7
        0x6aa24519 -> :sswitch_1
        0x6c3effbf -> :sswitch_e
        0x7d5232c9 -> :sswitch_b
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 9

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x65a57df0

    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    sget v5, Ll/֨ۤ;->ܿۖ᩵:I

    const-string v6, "\u1a7a\u06d8"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6c87

    const v8, 0x515d095a

    xor-int/2addr v7, v8

    const v8, 0x3f564bdb

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x1d9f

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 0
    iget-object v1, p0, Ll/᩹֨ۡ;->ۗ:Ll/ۢ۠ۡ;

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    .line 2
    :sswitch_0
    sget v6, Ll/֫᩵;->ܶ᩻᩷:I

    if-lez v6, :cond_a

    goto/16 :goto_1

    .line 3
    :sswitch_1
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v6, Ll/ۖ۫;->ۖ֫ܿ:I

    if-gez v6, :cond_7

    goto/16 :goto_3

    .line 1
    :sswitch_2
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    sget v6, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v6, "\u06e8\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x73

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1f35

    const v8, 0x7349566b

    xor-int/2addr v7, v8

    const v8, -0x6871c965

    goto :goto_0

    .line 0
    :sswitch_3
    invoke-static {}, Ll/֡ᩴ;->ᩳۛۧ()I

    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    goto/16 :goto_3

    :sswitch_4
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    return-void

    :sswitch_5
    iget-object v3, p0, Ll/᩹֨ۡ;->᩹:Ljava/lang/String;

    iget-object v4, p0, Ll/᩹֨ۡ;->᩶:Ll/᩷᩵ۡ;

    invoke-static {v2, v3, v4, v0, v1}, Ll/ۖ۠ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ll/᩷᩵ۡ;Landroid/app/Activity;Ll/ۢ۠ۡ;)V

    return-void

    :sswitch_6
    iget-object v2, p0, Ll/᩹֨ۡ;->᩸:Ljava/lang/String;

    .line 1
    sget v6, Ll/۠;->ܺܺܶ:I

    if-ltz v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v6, "\u05a1\u1a7a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1b4d

    const v8, -0x27617292

    xor-int/2addr v7, v8

    const v8, -0xd54cf24

    goto :goto_0

    :cond_2
    const-string v6, "\u05ab\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6ebf

    const v8, -0xb5f57e1

    xor-int/2addr v7, v8

    const v8, 0x62cf4e58

    goto/16 :goto_0

    .line 0
    :sswitch_7
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v6

    if-gtz v6, :cond_3

    goto/16 :goto_3

    :cond_3
    const-string v6, "\u1a76\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7ba1

    const v8, -0x2ecf902d

    xor-int/2addr v7, v8

    const v8, 0x1fc8ea05

    goto/16 :goto_0

    :sswitch_8
    sget-boolean v6, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v6, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v6, "\u06e8\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7ae1

    const v8, -0x6b15fae1

    xor-int/2addr v7, v8

    const v8, 0x634c4463

    goto/16 :goto_0

    :sswitch_9
    sget v6, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v6, :cond_5

    goto :goto_2

    :cond_5
    const-string v6, "\u0733\u1a78"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1143

    const v8, -0x57c784fd

    xor-int/2addr v7, v8

    const v8, -0x2d5b4cd4

    goto/16 :goto_0

    .line 3
    :sswitch_a
    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_2

    :cond_6
    const-string v6, "\u06d9\u0730"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5287

    const v8, -0x56f7b4e0

    xor-int/2addr v7, v8

    const v8, -0x169bc756

    goto/16 :goto_0

    :sswitch_b
    sget v6, Ll/֨۬;->۫ۙ᩺:I

    if-gtz v6, :cond_8

    :cond_7
    :goto_1
    const-string v6, "\u06dc\u1a79"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5b47

    const v8, -0x4b63786

    xor-int/2addr v7, v8

    const v8, 0x4d0554c3    # 1.39807792E8f

    goto/16 :goto_0

    :cond_8
    const-string v6, "\u06da\u1a7a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2de3

    const v8, 0x2b418bb9

    xor-int/2addr v7, v8

    const v8, -0x3a5395f2

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v6, :cond_9

    :goto_2
    const-string v6, "\u06e1\u06e2"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x4637

    const v8, -0x513225df

    xor-int/2addr v7, v8

    const v8, -0x21a82f3b

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06da\u06db"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x4d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x12b3

    const v8, -0x7e4accd4

    xor-int/2addr v7, v8

    const v8, 0x4663c711

    goto/16 :goto_0

    .line 2
    :sswitch_d
    sget v6, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v6, :cond_b

    :cond_a
    const-string v6, "\u06e2\u06d7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x5d

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x7dbd

    const v8, 0x31f06251

    xor-int/2addr v7, v8

    const v8, -0x3050382d

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u06e4\u06d9"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5f89

    const v8, 0x35621350

    xor-int/2addr v7, v8

    const v8, 0x66663476

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iget-object v0, p0, Ll/᩹֨ۡ;->ۙ:Landroid/app/Activity;

    .line 1
    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v6

    if-eqz v6, :cond_c

    :goto_3
    const-string v6, "\u1a76\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x5b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1d3d

    const v8, -0x183e9653

    xor-int/2addr v7, v8

    const v8, 0x709cf13e

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u073f\u06dc"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5925

    const v8, 0x70ceac72

    xor-int/2addr v7, v8

    const v8, 0x6347f6c4

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7b035ebc -> :sswitch_8
        -0x6cbeca78 -> :sswitch_5
        -0x62b671e1 -> :sswitch_d
        -0x4f2ed000 -> :sswitch_e
        -0x4dd28ad4 -> :sswitch_e
        -0x4cb178dc -> :sswitch_8
        -0x4ad4a7d7 -> :sswitch_3
        -0x47158e28 -> :sswitch_2
        -0x4162bb3a -> :sswitch_4
        -0x40423eb7 -> :sswitch_0
        -0x39d0c641 -> :sswitch_5
        -0x394f0547 -> :sswitch_c
        -0x350b23eb -> :sswitch_b
        -0x28f47da8 -> :sswitch_6
        -0x1ad849d7 -> :sswitch_3
        -0x11cb63bf -> :sswitch_7
        -0x11c0eb30 -> :sswitch_d
        -0xf8a7e0f -> :sswitch_7
        0xb0505d0 -> :sswitch_c
        0x15d92fd2 -> :sswitch_a
        0x29811f03 -> :sswitch_1
        0x2b96ffa5 -> :sswitch_0
        0x2cef7673 -> :sswitch_2
        0x30a0bc54 -> :sswitch_6
        0x48d48187 -> :sswitch_a
        0x54b6ce47 -> :sswitch_1
        0x565dab91 -> :sswitch_9
        0x5c00c600 -> :sswitch_9
        0x61141f0e -> :sswitch_b
        0x7a5cad18 -> :sswitch_4
    .end sparse-switch
.end method
