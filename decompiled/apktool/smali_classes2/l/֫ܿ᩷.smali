.class public final synthetic Ll/֫ܿ᩷;
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

    iput-object p1, p0, Ll/֫ܿ᩷;->᩸:Ll/ܳܿ᩷;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 5

    const p1, 0x18971516

    sget v0, Ll/᩺;->ۙۛܶ:I

    sget v1, Ll/֡֡;->֫ۤܳ:I

    const-string v2, "\u06e8\u0733"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x1c0b

    const v4, -0x5791b1af

    xor-int/2addr v3, v4

    const v4, 0x92db764

    :goto_0
    xor-int/2addr v2, v4

    xor-int/2addr p1, v0

    mul-int/lit16 p1, p1, -0x7f7b

    shr-int/lit8 p1, p1, 0x1f

    and-int/2addr p1, v3

    xor-int/2addr p1, v2

    sparse-switch p1, :sswitch_data_0

    sget-boolean v2, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v2, :cond_9

    goto/16 :goto_5

    .line 3
    :sswitch_0
    sget-boolean v2, Ll/ۘۗ;->֡ܽ۫:Z

    if-eqz v2, :cond_b

    goto :goto_2

    .line 4
    :sswitch_1
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v2

    if-ltz v2, :cond_2

    goto/16 :goto_5

    .line 0
    :sswitch_2
    sget v2, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v2, :cond_6

    goto/16 :goto_5

    .line 4
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    invoke-static {}, Ll/ۗۗ;->ᩳᩳ֫()I

    goto/16 :goto_5

    :sswitch_4
    invoke-static {}, Ll/ۗ᩷;->ܺۛܰ()Z

    :goto_1
    const/4 p1, 0x0

    return p1

    .line 0
    :sswitch_5
    iget-object p1, p0, Ll/֫ܿ᩷;->᩸:Ll/ܳܿ᩷;

    invoke-static {p1, p2}, Ll/ܳܿ᩷;->֫(Ll/ܳܿ᩷;Landroid/view/MotionEvent;)V

    goto :goto_1

    :sswitch_6
    sget v2, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v2, "\u06d8\u06d9"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x13ab

    const v4, -0x4527d806

    xor-int/2addr v3, v4

    const v4, 0x7c9ca911

    goto :goto_0

    :sswitch_7
    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v2, :cond_1

    goto/16 :goto_6

    :cond_1
    const-string v2, "\u1a76\u06e8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x43b7

    const v4, -0x56c035ec

    xor-int/2addr v3, v4

    const v4, 0xc29676b

    goto :goto_0

    :sswitch_8
    sget v2, Ll/֨᩺;->ۨ֨۬:I

    if-gtz v2, :cond_3

    :cond_2
    :goto_2
    const-string v2, "\u06d9\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x4905

    const v4, 0x4b1d0ceb    # 1.0292459E7f

    xor-int/2addr v3, v4

    const v4, 0x7c869e60

    goto/16 :goto_0

    :cond_3
    const-string v2, "\u06d6\u073a"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x1d3f

    const v4, -0x4b87fc43

    xor-int/2addr v3, v4

    const v4, 0x5428408c

    goto/16 :goto_0

    :sswitch_9
    sget v2, Ll/᩹;->ۤܿܳ:I

    if-eqz v2, :cond_4

    goto :goto_3

    :cond_4
    const-string v2, "\u06d8\u073f"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x513f

    const v4, 0xdeb00e3

    xor-int/2addr v3, v4

    const v4, 0x1ed71503

    goto/16 :goto_0

    .line 2
    :sswitch_a
    sget v2, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v2, :cond_5

    goto :goto_5

    :cond_5
    const-string v2, "\u1a76\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x3371

    const v4, -0x5573dd16

    xor-int/2addr v3, v4

    const v4, -0xe31a70

    goto/16 :goto_0

    :sswitch_b
    sget v2, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v2, :cond_7

    :cond_6
    :goto_3
    const-string v2, "\u1a7a\u1a7b"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    mul-int/lit8 v2, v2, -0x1b

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x935

    const v4, -0x776cb96f

    xor-int/2addr v3, v4

    const v4, -0x2c5a25b6

    goto/16 :goto_0

    :cond_7
    const-string v2, "\u073f\u06dc"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x56c9

    const v4, 0x2dfcc5b4

    xor-int/2addr v3, v4

    const v4, 0x10f9bb7a

    goto/16 :goto_0

    :sswitch_c
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v2

    if-gtz v2, :cond_8

    :goto_4
    const-string v2, "\u0730\u06e1"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7133

    const v4, -0x10c6edca

    xor-int/2addr v3, v4

    const v4, -0x97577a3

    goto/16 :goto_0

    :cond_8
    const-string v2, "\u06e2\u06eb"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x49

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x7139

    const v4, -0x48e1b69d

    xor-int/2addr v3, v4

    const v4, -0x381a6552

    goto/16 :goto_0

    :goto_5
    const-string v2, "\u0736\u06dc"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, -0x18bf

    const v4, -0x70e5c08e

    xor-int/2addr v3, v4

    const v4, -0x413c08d5

    goto/16 :goto_0

    :cond_9
    const-string v2, "\u073f\u0733"

    invoke-static {v2}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, 0x6ee9

    const v4, 0x65e44edb

    xor-int/2addr v3, v4

    const v4, -0x44c45fa4

    goto/16 :goto_0

    :sswitch_d
    sget-boolean v2, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    const-string v2, "\u05a1\u06d6"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x129b

    const v4, -0x25c48d17

    xor-int/2addr v3, v4

    const v4, -0x6ee531c9

    goto/16 :goto_0

    .line 4
    :sswitch_e
    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v2

    if-eqz v2, :cond_c

    :cond_b
    :goto_6
    const-string v2, "\u06dc\u05a8"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v0

    xor-int v3, v2, v1

    mul-int/lit16 v3, v3, -0x30ab

    const v4, 0xca4b713

    xor-int/2addr v3, v4

    const v4, -0x4ae2a95c

    goto/16 :goto_0

    :cond_c
    const-string v2, "\u1a7b\u06e7"

    invoke-static {v2}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v2

    xor-int/2addr v2, v1

    xor-int v3, v2, v0

    mul-int/lit16 v3, v3, 0x77ff

    const v4, -0x4a79fa41

    xor-int/2addr v3, v4

    const v4, 0x70501dc5

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7fdca7f8 -> :sswitch_2
        -0x7f0175f5 -> :sswitch_1
        -0x7d021e60 -> :sswitch_3
        -0x75a43a96 -> :sswitch_0
        -0x7309c4be -> :sswitch_d
        -0x7127be95 -> :sswitch_c
        -0x5b667e9f -> :sswitch_d
        -0x5772791d -> :sswitch_7
        -0x412868ec -> :sswitch_5
        -0x3ac47e54 -> :sswitch_1
        -0x3543748a -> :sswitch_b
        -0x350327ab -> :sswitch_9
        -0x335e6cc4 -> :sswitch_b
        -0x324ac66b -> :sswitch_8
        -0x1ebe9fc6 -> :sswitch_4
        -0x13a3beb4 -> :sswitch_a
        -0xf70beee -> :sswitch_6
        -0xa77889c -> :sswitch_e
        -0x370adef -> :sswitch_9
        0xa2f70a7 -> :sswitch_0
        0x1e55f09a -> :sswitch_3
        0x200c95c5 -> :sswitch_a
        0x2b34c887 -> :sswitch_8
        0x2f88ceaa -> :sswitch_2
        0x3e2d66f4 -> :sswitch_e
        0x42660c06 -> :sswitch_4
        0x497f74f3 -> :sswitch_5
        0x51bde8ec -> :sswitch_6
        0x59251b6c -> :sswitch_c
        0x6f3344d2 -> :sswitch_7
    .end sparse-switch
.end method
