.class public final synthetic Ll/ۧܿ᩷;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic ᩸:Ll/ܳܿ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ܳܿ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۧܿ᩷;->᩸:Ll/ܳܿ᩷;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const p1, -0x6dcdf43d

    sget v0, Ll/ۛ;->᩺᩻֫:I

    sget v1, Ll/ۖ;->᩹۟ۘ:I

    const-string v2, "\u073f\u073d"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, -0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x6097

    const v4, 0x41f7c28

    xor-int/2addr v3, v4

    const v4, -0x3cfbf4f5

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x14f7

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v2

    if-gtz v2, :cond_a

    goto/16 :goto_5

    .line 4
    :sswitch_0
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    sget v2, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v2, :cond_9

    goto/16 :goto_2

    .line 2
    :sswitch_1
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    move-result v2

    if-lez v2, :cond_b

    goto/16 :goto_2

    .line 3
    :sswitch_2
    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    if-gez v2, :cond_6

    goto :goto_2

    .line 1
    :sswitch_3
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto :goto_2

    .line 3
    :sswitch_4
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/ۧܿ᩷;->᩸:Ll/ܳܿ᩷;

    invoke-static {p1, p2}, Ll/ܳܿ᩷;->ۧ(Ll/ܳܿ᩷;Landroid/view/MotionEvent;)V

    goto :goto_1

    :sswitch_6
    sget v2, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u06d9\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x135b

    const v4, 0x76432c50

    xor-int/2addr v3, v4

    const v4, -0x29906c4e

    goto :goto_0

    .line 1
    :sswitch_7
    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v2, "\u06dc\u06df"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x69d3

    const v4, -0x65a122c0

    xor-int/2addr v3, v4

    const v4, 0x58ef320

    goto :goto_0

    :sswitch_8
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    move-result v2

    if-eqz v2, :cond_2

    goto/16 :goto_6

    :cond_2
    const-string v2, "\u1a79\u1a77"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, -0x9

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x5fc1

    const v4, 0x373a345a

    xor-int/2addr v3, v4

    const v4, 0x694a3e47

    goto/16 :goto_0

    .line 3
    :sswitch_9
    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    move-result v2

    if-gtz v2, :cond_3

    :goto_2
    const-string v2, "\u1a75\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x7f37

    const v4, -0x731facee

    xor-int/2addr v3, v4

    const v4, -0x5be3aedc

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06db\u05ab"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x4697

    const v4, 0x6fd97d5d

    xor-int/2addr v3, v4

    const v4, 0x23a65825

    goto/16 :goto_0

    :sswitch_a
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v2

    if-gtz v2, :cond_4

    goto :goto_4

    :cond_4
    const-string v2, "\u06d8\u0733"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v0, v2

    mul-int/lit8 v2, v2, 0x75

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x7e5f

    const v4, 0x5d78ddb3

    xor-int/2addr v3, v4

    const v4, -0x2321d18d

    goto/16 :goto_0

    .line 2
    :sswitch_b
    sget-boolean v2, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    const-string v2, "\u06da\u06df"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x5bbb

    const v4, 0x75874041

    xor-int/2addr v3, v4

    const v4, 0x1f926712

    goto/16 :goto_0

    :sswitch_c
    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v2, :cond_7

    :cond_6
    :goto_3
    const-string v2, "\u073d\u06ec"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x76e3

    const v4, -0x72f5fc1d

    xor-int/2addr v3, v4

    const v4, -0x51b8c016

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u06da\u06e2"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    sub-int v2, v1, v2

    mul-int/lit8 v2, v2, 0x43

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1ce1

    const v4, -0xab73b56

    xor-int/2addr v3, v4

    const v4, 0x196f7a60

    goto/16 :goto_0

    .line 3
    :sswitch_d
    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v2, :cond_8

    :goto_4
    const-string v2, "\u06ec\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x6e1f

    const v4, -0x2d60646c

    xor-int/2addr v3, v4

    const v4, -0x5248501b

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u0733\u1a75"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x4877

    const v4, 0x5e2f5a71

    xor-int/2addr v3, v4

    const v4, -0x25af82c5

    goto/16 :goto_0

    :cond_9
    :goto_5
    const-string v2, "\u0730\u06db"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x4861

    const v4, -0x51bb4c0

    xor-int/2addr v3, v4

    const v4, -0x641f0b8b

    goto/16 :goto_0

    :cond_a
    const-string v2, "\u1a77\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0xc9d

    const v4, 0xcd3fb0e

    xor-int/2addr v3, v4

    const v4, 0x7ce06805

    goto/16 :goto_0

    :sswitch_e
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    :goto_6
    const-string v2, "\u06e4\u05a1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x2f

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x5f59

    const v4, 0x48859bec    # 273631.38f

    xor-int/2addr v3, v4

    const v4, 0x7418686d    # 4.8299996E31f

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u06e7\u06e2"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4e45

    const v4, 0x34a9e4c1

    xor-int/2addr v3, v4

    const v4, 0x677342fa

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x77c796c1 -> :sswitch_2
        -0x720f62de -> :sswitch_1
        -0x6e2b8c93 -> :sswitch_d
        -0x5bed98b7 -> :sswitch_0
        -0x5bd2fecc -> :sswitch_a
        -0x4f10e366 -> :sswitch_3
        -0x4da2d283 -> :sswitch_b
        -0x4aec56a1 -> :sswitch_9
        -0x393bcf8f -> :sswitch_a
        -0x316e5dbe -> :sswitch_8
        -0x3093705a -> :sswitch_9
        -0x2fd53c56 -> :sswitch_c
        -0x2a9a594a -> :sswitch_8
        -0x2289fab7 -> :sswitch_d
        -0x226df5dd -> :sswitch_e
        -0x1746f70c -> :sswitch_6
        -0x7fdcf86 -> :sswitch_b
        0x6a0bfe7 -> :sswitch_2
        0x6e8e81c -> :sswitch_e
        0xf39c4b2 -> :sswitch_5
        0x10133d38 -> :sswitch_4
        0x20c1e28a -> :sswitch_7
        0x32b61d4f -> :sswitch_7
        0x3767a4ce -> :sswitch_c
        0x4080538e -> :sswitch_0
        0x42b69df8 -> :sswitch_1
        0x49284a19 -> :sswitch_4
        0x546fcbc2 -> :sswitch_6
        0x5c05f7f1 -> :sswitch_5
        0x77115483 -> :sswitch_3
    .end sparse-switch
.end method
