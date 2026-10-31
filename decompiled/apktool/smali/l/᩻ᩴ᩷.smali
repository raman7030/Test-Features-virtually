.class public final Ll/᩻ᩴ᩷;
.super Ljava/lang/Object;
.source "C2R7"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final synthetic ֫:Ll/֫᩵᩷;


# direct methods
.method public constructor <init>(Ll/֫᩵᩷;)V
    .locals 0

    .line 2453
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ᩴ᩷;->֫:Ll/֫᩵᩷;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 9

    const/4 p1, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x24cdcfbc

    sget v4, Ll/ۘܿ;->ۘܰ۫:I

    sget v5, Ll/ۖ;->᩹۟ۘ:I

    const-string v6, "\u1a76\u06e2"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2c63

    const v8, -0x31f7401f

    xor-int/2addr v7, v8

    const v8, 0x1e3b8a4b

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x5c73

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    .line 2462
    invoke-static {p1}, Ll/֫᩵᩷;->ۜ(Ll/֫᩵᩷;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v0

    .line 2020
    sget v6, Ll/۟;->ۗۤۛ:I

    if-eqz v6, :cond_4

    goto/16 :goto_2

    .line 677
    :sswitch_0
    invoke-static {}, Ll/᩹;->ۖۘ᩸()Z

    sget-boolean v6, Ll/ۘۗ;->֡ܽ۫:Z

    if-nez v6, :cond_b

    goto :goto_1

    :sswitch_1
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    sget v6, Ll/᩹;->ۤܿܳ:I

    if-eqz v6, :cond_0

    goto/16 :goto_3

    :cond_0
    :goto_1
    const-string v6, "\u06ec\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4327

    const v8, -0x5a2db0d

    xor-int/2addr v7, v8

    const v8, 0x36abc284

    goto :goto_0

    .line 607
    :sswitch_2
    sget v6, Ll/ۖ;->᩹۟ۘ:I

    if-gez v6, :cond_8

    goto/16 :goto_4

    .line 2071
    :sswitch_3
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto/16 :goto_4

    .line 1266
    :sswitch_4
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    return-void

    .line 2464
    :sswitch_5
    invoke-virtual {v2, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 2465
    invoke-static {p1}, Ll/֫᩵᩷;->ۚ(Ll/֫᩵᩷;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    return-void

    .line 2464
    :sswitch_6
    invoke-static {p1}, Ll/֫᩵᩷;->ܳ(Ll/֫᩵᩷;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v2

    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v6

    if-ltz v6, :cond_1

    goto/16 :goto_3

    :cond_1
    const-string v6, "\u05ab\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4e2f

    const v8, 0x52fe7089

    xor-int/2addr v7, v8

    const v8, -0x5fcb35a2

    goto :goto_0

    .line 2463
    :sswitch_7
    invoke-static {p1}, Ll/֫᩵᩷;->ᩴ(Ll/֫᩵᩷;)Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    move-result-object v6

    invoke-virtual {v6, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 1764
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v6

    if-gtz v6, :cond_2

    goto :goto_2

    :cond_2
    const-string v6, "\u06e0\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x77

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x5fd1

    const v8, 0xdfb4a65

    xor-int/2addr v7, v8

    const v8, 0x7fec5762

    goto/16 :goto_0

    :sswitch_8
    const/4 v1, 0x4

    .line 2462
    invoke-virtual {v0, v1}, Lcom/google/android/material/floatingactionbutton/FloatingActionButton;->setVisibility(I)V

    .line 1644
    sget-boolean v6, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    const-string v6, "\u06e4\u1a77"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x12e1

    const v8, -0x5a227bda

    xor-int/2addr v7, v8

    const v8, 0x391a9e33

    goto/16 :goto_0

    :goto_2
    const-string v6, "\u1a7a\u0733"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5b17

    const v8, 0x384ea3c2

    xor-int/2addr v7, v8

    const v8, -0x65ca369

    goto/16 :goto_0

    :cond_4
    const-string v6, "\u073d\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x6f1d

    const v8, -0x1ce10d6a

    xor-int/2addr v7, v8

    const v8, 0x34c4d5d

    goto/16 :goto_0

    .line 2462
    :sswitch_9
    iget-object p1, p0, Ll/᩻ᩴ᩷;->֫:Ll/֫᩵᩷;

    sget v6, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v6, :cond_5

    goto :goto_3

    :cond_5
    const-string v6, "\u073d\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x71

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x119

    const v8, 0x208b77e0

    xor-int/2addr v7, v8

    const v8, -0x7b74bca2

    goto/16 :goto_0

    .line 1038
    :sswitch_a
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    move-result v6

    if-ltz v6, :cond_6

    goto :goto_4

    :cond_6
    const-string v6, "\u1a78\u06d6"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x7de3

    const v8, -0x554f3143

    xor-int/2addr v7, v8

    const v8, -0x6d39353f

    goto/16 :goto_0

    .line 641
    :sswitch_b
    sget v6, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v6, :cond_7

    goto :goto_3

    :cond_7
    const-string v6, "\u05ab\u1a75"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x38d7

    const v8, -0x6aee924

    xor-int/2addr v7, v8

    const v8, 0x18bc00bf

    goto/16 :goto_0

    .line 847
    :sswitch_c
    invoke-static {}, Ll/֫ۧ;->ۢܺ᩸()I

    move-result v6

    if-gtz v6, :cond_9

    :cond_8
    :goto_3
    const-string v6, "\u06e8\u073d"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x37f9

    const v8, 0x402b2168

    xor-int/2addr v7, v8

    const v8, 0x5f9c1024

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u06e8\u05ab"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x41

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x2a0d

    const v8, 0x4c8aa4d3    # 7.2689304E7f

    xor-int/2addr v7, v8

    const v8, -0x7a6f222c

    goto/16 :goto_0

    .line 1330
    :sswitch_d
    sget v6, Ll/۠;->ܺܺܶ:I

    if-ltz v6, :cond_a

    :goto_4
    const-string v6, "\u06e7\u1a75"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1d6b

    const v8, -0x2dfc7827

    xor-int/2addr v7, v8

    const v8, -0x24afcde4

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u073d\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x4ebf

    const v8, -0x4e665258

    xor-int/2addr v7, v8

    const v8, -0x235f8c15

    goto/16 :goto_0

    .line 520
    :sswitch_e
    sget v6, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v6, :cond_c

    :cond_b
    const-string v6, "\u05a1\u06eb"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xd

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x7169

    const v8, -0x4dec5353

    xor-int/2addr v7, v8

    const v8, -0x1d9e687e

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u06e8\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x1427

    const v8, 0x75823e48

    xor-int/2addr v7, v8

    const v8, -0x51578aa6

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7935bea9 -> :sswitch_3
        -0x74e84431 -> :sswitch_8
        -0x73ac8c57 -> :sswitch_d
        -0x6f1824b3 -> :sswitch_a
        -0x6eb3bb3b -> :sswitch_8
        -0x6b221163 -> :sswitch_a
        -0x6156512f -> :sswitch_1
        -0x4ec0c4c3 -> :sswitch_6
        -0x3891c2bf -> :sswitch_e
        -0x35ee32ad -> :sswitch_5
        -0x1fb31dfa -> :sswitch_7
        -0x1d28fe52 -> :sswitch_6
        -0x1c3ad118 -> :sswitch_5
        -0x10026c8f -> :sswitch_2
        0x5f6185b -> :sswitch_c
        0xec6ca88 -> :sswitch_1
        0x18f1b0a3 -> :sswitch_4
        0x19859324 -> :sswitch_9
        0x1f998792 -> :sswitch_d
        0x2035b66b -> :sswitch_c
        0x2bcfe66a -> :sswitch_e
        0x34e0b2d5 -> :sswitch_0
        0x3a8fc5a7 -> :sswitch_2
        0x3aad829b -> :sswitch_b
        0x4b937db9 -> :sswitch_9
        0x530bd3aa -> :sswitch_4
        0x54aeeb09 -> :sswitch_b
        0x6829c36c -> :sswitch_3
        0x6b19216d -> :sswitch_7
        0x71fb76b6 -> :sswitch_0
    .end sparse-switch
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method
