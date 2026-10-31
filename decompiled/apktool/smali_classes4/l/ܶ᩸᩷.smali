.class public final synthetic Ll/ܶ᩸᩷;
.super Ljava/lang/Object;
.source "02QQ"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Landroid/view/View;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(ILandroid/view/View;)V
    .locals 6

    const v0, -0x5c63fc3f

    sget v1, Ll/֨᩺;->ۨ֨۬:I

    sget v2, Ll/ۗۗ;->ۨ۬ۖ:I

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a78\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x7d

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x593

    const v5, -0x676bcdc1

    xor-int/2addr v4, v5

    const v5, -0x6bc80ed1

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7c33

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 4
    invoke-static {}, Ll/ۗ᩵;->֫ۖ᩻()I

    move-result v3

    if-gtz v3, :cond_9

    goto/16 :goto_4

    .line 3
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget v3, Ll/ۘܿ;->ۘܰ۫:I

    if-gez v3, :cond_4

    goto/16 :goto_4

    .line 1
    :sswitch_1
    sget v3, Ll/ۛ;->᩺᩻֫:I

    if-gez v3, :cond_7

    goto/16 :goto_4

    .line 0
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    sget-boolean v3, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-eqz v3, :cond_b

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֡᩶;->ۚ֨֨()Z

    invoke-static {}, Ll/֫᩺;->ܳۚۨ()Z

    goto :goto_1

    .line 1
    :sswitch_4
    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 0
    :sswitch_5
    iput p1, p0, Ll/ܶ᩸᩷;->᩹:I

    return-void

    :sswitch_6
    sget v3, Ll/ۗ۬;->ۘܳ᩻:I

    if-gtz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e0\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x51

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4665

    const v5, 0x3507abd0

    xor-int/2addr v4, v5

    const v5, 0x574c60b7

    goto :goto_0

    :sswitch_7
    sget v3, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v3, :cond_1

    goto :goto_2

    :cond_1
    const-string v3, "\u0733\u0730"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x2f65

    const v5, -0xd1569a2

    xor-int/2addr v4, v5

    const v5, -0x1abf91a0

    goto :goto_0

    :sswitch_8
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u06da\u06d7"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x49

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x45db

    const v5, 0x46341805

    xor-int/2addr v4, v5

    const v5, 0x3ce53266

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v3, :cond_3

    :goto_1
    const-string v3, "\u1a7b\u06e0"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x2eb5

    const v5, 0x925c677

    xor-int/2addr v4, v5

    const v5, -0x493d488e

    goto/16 :goto_0

    :cond_3
    const-string v3, "\u1a7b\u05ab"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0xc89

    const v5, 0xbb36a45

    xor-int/2addr v4, v5

    const v5, -0x19547ffd

    goto/16 :goto_0

    .line 3
    :sswitch_a
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    move-result v3

    if-nez v3, :cond_5

    :cond_4
    :goto_2
    const-string v3, "\u0733\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x30dd

    const v5, -0x624bca5

    xor-int/2addr v4, v5

    const v5, -0xdf8463d

    goto/16 :goto_0

    :cond_5
    const-string v3, "\u073f\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, 0x9

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x56b1

    const v5, -0x411dbb89

    xor-int/2addr v4, v5

    const v5, 0x12435da2

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_6

    :goto_3
    const-string v3, "\u06d8\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x481

    const v5, 0x7138f97

    xor-int/2addr v4, v5

    const v5, 0x31f213d1

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a77\u06d8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x77

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x4bbb

    const v5, -0x43103ac6

    xor-int/2addr v4, v5

    const v5, -0x6969f37f

    goto/16 :goto_0

    :sswitch_c
    sget v3, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v3, :cond_8

    :cond_7
    const-string v3, "\u073d\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7745

    const v5, 0x31baad90

    xor-int/2addr v4, v5

    const v5, -0x558fbf96

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u1a73\u06e8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x35

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x20c1

    const v5, -0xb9c06aa

    xor-int/2addr v4, v5

    const v5, -0x1568a5a8

    goto/16 :goto_0

    :cond_9
    const-string v3, "\u0730\u1a78"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x7

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5d71

    const v5, -0x12253665

    xor-int/2addr v4, v5

    const v5, -0x2f4dbeea

    goto/16 :goto_0

    :sswitch_d
    sget v3, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v3, :cond_a

    goto :goto_4

    :cond_a
    const-string v3, "\u1a78\u06d9"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x4b

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0xb5d

    const v5, -0x5e25b54f

    xor-int/2addr v4, v5

    const v5, -0x6deb1b2a

    goto/16 :goto_0

    .line 0
    :sswitch_e
    iput-object p2, p0, Ll/ܶ᩸᩷;->᩸:Landroid/view/View;

    .line 3
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v3

    if-ltz v3, :cond_c

    :cond_b
    :goto_4
    const-string v3, "\u06d8\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x609

    const v5, 0x3f114f66

    xor-int/2addr v4, v5

    const v5, 0x1c0a5343

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06e7\u06e1"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0xe69

    const v5, 0x363fcf06

    xor-int/2addr v4, v5

    const v5, 0x55e8c868

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x73888454 -> :sswitch_9
        -0x6c3620c6 -> :sswitch_1
        -0x5a9d9ef9 -> :sswitch_8
        -0x57f76c77 -> :sswitch_2
        -0x447ccee9 -> :sswitch_8
        -0x35bbff2c -> :sswitch_5
        -0x3572b44f -> :sswitch_3
        -0x2b896b7a -> :sswitch_1
        -0x2a9437f2 -> :sswitch_b
        -0x2450d819 -> :sswitch_e
        -0x1e4623df -> :sswitch_d
        -0x1e28f769 -> :sswitch_7
        -0x175d8a16 -> :sswitch_a
        -0x16d7ad29 -> :sswitch_3
        -0x16458399 -> :sswitch_2
        -0x14ea2ca3 -> :sswitch_9
        -0x11a49df4 -> :sswitch_e
        -0x11425db6 -> :sswitch_c
        -0xaf4a8dd -> :sswitch_4
        0xa377102 -> :sswitch_c
        0xed54ee2 -> :sswitch_6
        0x106252aa -> :sswitch_6
        0x1622cf26 -> :sswitch_d
        0x243414ea -> :sswitch_7
        0x25a5801a -> :sswitch_5
        0x4f237263 -> :sswitch_0
        0x4f2dea1a -> :sswitch_b
        0x64ceb0aa -> :sswitch_4
        0x6fd92dc4 -> :sswitch_a
        0x71d198d2 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 0
    iget-object v0, p0, Ll/ܶ᩸᩷;->᩸:Landroid/view/View;

    iget v1, p0, Ll/ܶ᩸᩷;->᩹:I

    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(ILandroid/view/View;)V

    return-void
.end method
