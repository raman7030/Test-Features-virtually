.class public final Ll/ۨᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:Ll/᩵֡ᩴ;

.field public final ܽ:Ll/᩵֡ᩴ;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/᩵֡ᩴ;

.field public final ᩻:Ll/᩵֡ᩴ;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;Ll/᩵֡ᩴ;Ljava/util/HashMap;)V
    .locals 6

    const v0, -0x287975c4

    sget v1, Ll/ۘܿ;->ۘܰ۫:I

    sget v2, Ll/֡֡;->֫ۤܳ:I

    .line 342
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u06d9\u05a1"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x3bd3

    const v5, -0x2c32462e

    xor-int/2addr v4, v5

    const v5, -0x2dadc10f

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v2

    mul-int/lit16 v0, v0, 0x33ed

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 348
    iput-object p4, p0, Ll/ۨᩴ᩷;->ܽ:Ll/᩵֡ᩴ;

    .line 285
    sget v3, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v3, :cond_1

    goto/16 :goto_2

    .line 50
    :sswitch_0
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v3, :cond_5

    goto/16 :goto_1

    :sswitch_1
    sget v3, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v3, :cond_0

    goto/16 :goto_1

    :cond_0
    const-string v3, "\u06eb\u1a77"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x11

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7337

    const v5, -0x6c7e93cd

    xor-int/2addr v4, v5

    const v5, 0x704844f9

    goto :goto_0

    .line 316
    :sswitch_2
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget-boolean v3, Ll/֫֫;->ۢ᩸᩶:Z

    if-nez v3, :cond_7

    goto/16 :goto_1

    .line 75
    :sswitch_3
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    goto/16 :goto_1

    .line 64
    :sswitch_4
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 349
    :sswitch_5
    iput-object p5, p0, Ll/ۨᩴ᩷;->᩻:Ll/᩵֡ᩴ;

    .line 350
    iput-object p6, p0, Ll/ۨᩴ᩷;->ᩳ:Ll/᩵֡ᩴ;

    .line 351
    iput-object p7, p0, Ll/ۨᩴ᩷;->֫:Ljava/util/HashMap;

    return-void

    :cond_1
    const-string v3, "\u06db\u1a7a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4d7d

    const v5, 0x5bf9937e

    xor-int/2addr v4, v5

    const v5, -0x619bf05

    goto :goto_0

    .line 347
    :sswitch_6
    iput-object p3, p0, Ll/ۨᩴ᩷;->ܳ:Ll/᩵֡ᩴ;

    .line 134
    sget-boolean v3, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v3, :cond_2

    goto/16 :goto_2

    :cond_2
    const-string v3, "\u1a77\u1a7a"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1b4d

    const v5, 0x4051f3fa

    xor-int/2addr v4, v5

    const v5, -0x6177b3d

    goto/16 :goto_0

    .line 8
    :sswitch_7
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_2

    :cond_3
    const-string v3, "\u06d6\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0xb

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x1b7d

    const v5, -0x3e198806

    xor-int/2addr v4, v5

    const v5, 0x2b810f38

    goto/16 :goto_0

    .line 279
    :sswitch_8
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_4

    goto/16 :goto_2

    :cond_4
    const-string v3, "\u1a77\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x4927

    const v5, 0x6f97ce14

    xor-int/2addr v4, v5

    const v5, 0x4dd8fa3a    # 4.55034688E8f

    goto/16 :goto_0

    .line 84
    :sswitch_9
    sget v3, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v3, :cond_6

    :cond_5
    const-string v3, "\u06e1\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x5497

    const v5, -0x34ee4946    # -9549498.0f

    xor-int/2addr v4, v5

    const v5, -0x360d8b5f

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u06d7\u073d"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1f47

    const v5, -0x2f01d2c8

    xor-int/2addr v4, v5

    const v5, 0x633f7419

    goto/16 :goto_0

    .line 270
    :sswitch_a
    sget v3, Ll/֡᩺;->ᩴ᩹ۛ:I

    if-ltz v3, :cond_8

    :cond_7
    const-string v3, "\u06da\u1a78"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x1b9b

    const v5, -0x56534adf

    xor-int/2addr v4, v5

    const v5, 0x5cb8fd15

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u073a\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x43

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x3037

    const v5, 0x122a7937

    xor-int/2addr v4, v5

    const v5, -0x44240fdd

    goto/16 :goto_0

    :sswitch_b
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_2

    :cond_9
    const-string v3, "\u1a79\u073f"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x3

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x899

    const v5, -0x4d531ceb

    xor-int/2addr v4, v5

    const v5, -0x730aa293

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v3, :cond_a

    :goto_1
    const-string v3, "\u06dc\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5183

    const v5, -0x4c05237b

    xor-int/2addr v4, v5

    const v5, -0x3110806b

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u073f\u1a75"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x6d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5233

    const v5, -0x586deb71

    xor-int/2addr v4, v5

    const v5, -0x729871ec

    goto/16 :goto_0

    .line 344
    :sswitch_d
    sget-boolean v3, Ll/֨۫;->۬᩷᩶:Z

    if-nez v3, :cond_b

    goto :goto_2

    :cond_b
    const-string v3, "\u06e7\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6e79

    const v5, -0x63f78a29

    xor-int/2addr v4, v5

    const v5, 0x16b95cd0

    goto/16 :goto_0

    .line 345
    :sswitch_e
    iput-object p1, p0, Ll/ۨᩴ᩷;->ܿ:Ljava/lang/String;

    .line 346
    iput-object p2, p0, Ll/ۨᩴ᩷;->ۧ:Ljava/lang/String;

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v3

    if-gtz v3, :cond_c

    :goto_2
    const-string v3, "\u05a1\u06d8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x45

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4f75

    const v5, -0x2975bb28

    xor-int/2addr v4, v5

    const v5, -0x15f2aa32

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u0730\u06eb"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x55

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4059

    const v5, 0xf6bdea3

    xor-int/2addr v4, v5

    const v5, -0x9602195

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7faf7fcf -> :sswitch_e
        -0x7da9f0be -> :sswitch_b
        -0x790c5700 -> :sswitch_a
        -0x75383e89 -> :sswitch_4
        -0x60654dec -> :sswitch_8
        -0x5fe2f180 -> :sswitch_3
        -0x54187604 -> :sswitch_d
        -0x4e812329 -> :sswitch_7
        -0x3abe128e -> :sswitch_e
        -0x31ac2db6 -> :sswitch_c
        -0x2a906d71 -> :sswitch_9
        -0x26476b30 -> :sswitch_7
        -0x1f34d9e2 -> :sswitch_5
        -0x1580de97 -> :sswitch_d
        -0xf9eade7 -> :sswitch_6
        -0x558780c -> :sswitch_b
        -0x1b4383f -> :sswitch_8
        0x11724ac9 -> :sswitch_2
        0x12eb44c6 -> :sswitch_a
        0x1442d7be -> :sswitch_9
        0x2ab1fa65 -> :sswitch_0
        0x3557b5fd -> :sswitch_1
        0x46b4b5c9 -> :sswitch_4
        0x4b1c8421 -> :sswitch_6
        0x4e7f67c0 -> :sswitch_3
        0x60fe4e9b -> :sswitch_1
        0x6635a11d -> :sswitch_0
        0x71bdbfdc -> :sswitch_5
        0x7da456a4 -> :sswitch_c
        0x7e51b08d -> :sswitch_2
    .end sparse-switch
.end method
