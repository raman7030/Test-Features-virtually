.class public final Ll/ᩳܿ᩷;
.super Ljava/lang/Object;
.source "V3Z0"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic ᩸:Ll/ܳܿ᩷;

.field public final synthetic ᩹:Landroid/view/ViewTreeObserver;


# direct methods
.method public constructor <init>(Ll/ܳܿ᩷;Landroid/view/ViewTreeObserver;)V
    .locals 6

    const v0, 0x87d8198

    sget v1, Ll/֨ۤ;->ܿۖ᩵:I

    sget v2, Ll/֡ᩴ;->ܳۤ֫:I

    .line 156
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v3, "\u1a77\u06d9"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x56c9

    const v5, 0x24d982a8

    xor-int/2addr v4, v5

    const v5, -0x7fa9206

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x7cb1

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v3

    if-gtz v3, :cond_1

    goto/16 :goto_4

    .line 119
    :sswitch_0
    invoke-static {}, Ll/ۘۘ;->᩶ۚۙ()Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_2

    .line 92
    :sswitch_1
    invoke-static {}, Ll/ۗ᩶;->ۨ۟ۜ()I

    move-result v3

    if-gtz v3, :cond_9

    goto :goto_1

    .line 91
    :sswitch_2
    sget v3, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v3, :cond_5

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֫ܿ;->ۙ֫۬()I

    invoke-static {}, Ll/۟;->᩹ۚܶ()I

    :goto_1
    const-string v3, "\u1a73\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x73

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x4d3b

    const v5, -0x1b85e0b3

    xor-int/2addr v4, v5

    const v5, 0x2eab0d16

    goto :goto_0

    .line 71
    :sswitch_4
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 156
    :sswitch_5
    iput-object p2, p0, Ll/ᩳܿ᩷;->᩹:Landroid/view/ViewTreeObserver;

    return-void

    .line 101
    :sswitch_6
    sget v3, Ll/ۨ;->᩺᩷ۚ:I

    if-ltz v3, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v3, "\u06e8\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x6257

    const v5, 0x1f14b239

    xor-int/2addr v4, v5

    const v5, -0x950ac17

    goto :goto_0

    :cond_1
    const-string v3, "\u06e1\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7677

    const v5, -0x38b2695c

    xor-int/2addr v4, v5

    const v5, -0x4a9023b3

    goto :goto_0

    .line 78
    :sswitch_7
    sget-boolean v3, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    const-string v3, "\u073d\u06e4"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x1e23

    const v5, 0x2fb1c99e

    xor-int/2addr v4, v5

    const v5, -0x67272933

    goto/16 :goto_0

    .line 137
    :sswitch_8
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v3

    if-nez v3, :cond_3

    goto/16 :goto_5

    :cond_3
    const-string v3, "\u06e4\u06e8"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, 0x4d

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x76f5

    const v5, -0x5230119c

    xor-int/2addr v4, v5

    const v5, 0xb474765

    goto/16 :goto_0

    :sswitch_9
    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v3, "\u06e4\u1a77"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x24ad

    const v5, 0x1a76fa64

    xor-int/2addr v4, v5

    const v5, 0x3d3141fd

    goto/16 :goto_0

    .line 75
    :sswitch_a
    sget v3, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v3, :cond_6

    :cond_5
    :goto_2
    const-string v3, "\u06da\u1a73"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x3b

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7b13

    const v5, 0x4537e73a

    xor-int/2addr v4, v5

    const v5, -0x4a480696

    goto/16 :goto_0

    :cond_6
    const-string v3, "\u1a78\u0733"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x1f

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4dfb

    const v5, -0x43307544

    xor-int/2addr v4, v5

    const v5, 0x248e3ae

    goto/16 :goto_0

    .line 27
    :sswitch_b
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    move-result v3

    if-ltz v3, :cond_7

    goto :goto_4

    :cond_7
    const-string v3, "\u06e2\u1a79"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x5347

    const v5, -0x4ac46933

    xor-int/2addr v4, v5

    const v5, -0x2af24df1

    goto/16 :goto_0

    .line 61
    :sswitch_c
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    move-result v3

    if-ltz v3, :cond_8

    :goto_3
    const-string v3, "\u06dc\u06db"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x732d

    const v5, 0x25c9c3d0    # 3.500063E-16f

    xor-int/2addr v4, v5

    const v5, -0x6a87be58

    goto/16 :goto_0

    :cond_8
    const-string v3, "\u05a8\u05a8"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x3f

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x447b

    const v5, 0x2c76486a

    xor-int/2addr v4, v5

    const v5, -0x107ed9fd

    goto/16 :goto_0

    .line 139
    :sswitch_d
    sget v3, Ll/ۗ᩶;->ۛ֨ۘ:I

    if-ltz v3, :cond_a

    :cond_9
    :goto_4
    const-string v3, "\u06d6\u1a7b"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, 0x5

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x76fd

    const v5, 0x572e7af4

    xor-int/2addr v4, v5

    const v5, -0x77c121a2

    goto/16 :goto_0

    :cond_a
    const-string v3, "\u1a78\u06eb"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x7341

    const v5, 0x591175dc

    xor-int/2addr v4, v5

    const v5, 0x42fdaabe

    goto/16 :goto_0

    .line 156
    :sswitch_e
    iput-object p1, p0, Ll/ᩳܿ᩷;->᩸:Ll/ܳܿ᩷;

    sget v3, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v3, :cond_c

    :cond_b
    :goto_5
    const-string v3, "\u05ab\u073d"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, -0x75

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x4a1d

    const v5, -0x458ae1a0

    xor-int/2addr v4, v5

    const v5, -0x12e7d0a8

    goto/16 :goto_0

    :cond_c
    const-string v3, "\u06d7\u06ec"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v2

    mul-int/lit8 v3, v3, -0x63

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x827

    const v5, 0x42ffc316

    xor-int/2addr v4, v5

    const v5, 0x15dafeac

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7ad52ae0 -> :sswitch_b
        -0x786ff47c -> :sswitch_7
        -0x762677d4 -> :sswitch_2
        -0x62dd6373 -> :sswitch_c
        -0x5b35b1bf -> :sswitch_8
        -0x523d3f7f -> :sswitch_5
        -0x45363acf -> :sswitch_1
        -0x30796b5c -> :sswitch_c
        -0x2fc5ca46 -> :sswitch_3
        -0x1f3e631d -> :sswitch_e
        -0x128e05ed -> :sswitch_3
        -0xb8db1aa -> :sswitch_6
        -0x46a07a3 -> :sswitch_4
        0xb564712 -> :sswitch_b
        0xb570e2a -> :sswitch_8
        0xbcd97ba -> :sswitch_7
        0x12ca0cf1 -> :sswitch_9
        0x18009fbe -> :sswitch_0
        0x1dc960a5 -> :sswitch_d
        0x229e6b35 -> :sswitch_a
        0x23a400f2 -> :sswitch_9
        0x3817369c -> :sswitch_6
        0x4105ab15 -> :sswitch_0
        0x48cb9e89 -> :sswitch_2
        0x4e83893a -> :sswitch_4
        0x587558b1 -> :sswitch_a
        0x61fda917 -> :sswitch_e
        0x66ed8c38 -> :sswitch_d
        0x6f545cd7 -> :sswitch_5
        0x7a4c97c3 -> :sswitch_1
    .end sparse-switch
.end method


# virtual methods
.method public final onPreDraw()Z
    .locals 7

    const/4 v0, 0x0

    const v1, 0x725b61ae

    sget v2, Ll/֫ܿ;->ۨ۫ᩳ:I

    sget v3, Ll/ۗ᩷;->᩸᩺ᩳ:I

    const-string v4, "\u05a8\u1a76"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x7a25

    const v6, 0x43382a17

    xor-int/2addr v5, v6

    const v6, 0x795b171b

    :goto_0
    xor-int/2addr v4, v6

    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x4277

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 160
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_1

    :sswitch_0
    invoke-static {}, Ll/֨ۡ;->ۤܶ֫()Z

    sget v4, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u06e1\u06d7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x3343

    const v6, 0x166833ce

    xor-int/2addr v5, v6

    const v6, 0x71c8c9ca

    goto :goto_0

    :sswitch_1
    sget-boolean v4, Ll/֫ܺ;->֡ܳ᩸:Z

    if-nez v4, :cond_7

    goto/16 :goto_5

    .line 101
    :sswitch_2
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    move-result v4

    if-eqz v4, :cond_c

    goto/16 :goto_4

    :sswitch_3
    invoke-static {}, Ll/֫᩹;->ܽ᩶ۘ()I

    goto/16 :goto_4

    .line 104
    :sswitch_4
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    const/4 v0, 0x0

    return v0

    .line 162
    :sswitch_5
    iget-object v0, p0, Ll/ᩳܿ᩷;->᩸:Ll/ܳܿ᩷;

    invoke-static {v0}, Ll/ܳܿ᩷;->ۧ(Ll/ܳܿ᩷;)V

    .line 163
    invoke-static {v0}, Ll/ܳܿ᩷;->ᩳ(Ll/ܳܿ᩷;)Z

    move-result v0

    return v0

    .line 159
    :sswitch_6
    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v4

    if-eqz v4, :cond_1

    const-string v4, "\u06ec\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0xb

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4c63

    const v6, -0x47cbcc48

    xor-int/2addr v5, v6

    const v6, -0x7d842f41

    goto :goto_0

    :cond_1
    :goto_1
    const-string v4, "\u1a7a\u06e4"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5587

    const v6, -0x475bcf6

    xor-int/2addr v5, v6

    const v6, 0x48828367

    goto :goto_0

    .line 85
    :sswitch_7
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v4, "\u1a75\u0730"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x77a9

    const v6, -0x3f818248

    xor-int/2addr v5, v6

    const v6, 0x484d52b7

    goto/16 :goto_0

    :sswitch_8
    sget v4, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    const-string v4, "\u1a77\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x34c5

    const v6, -0x5748a09f

    xor-int/2addr v5, v6

    const v6, 0x2a373ae6

    goto/16 :goto_0

    .line 89
    :sswitch_9
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v4, :cond_4

    goto/16 :goto_5

    :cond_4
    const-string v4, "\u1a78\u1a75"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x1d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x29e7

    const v6, -0x5740772b

    xor-int/2addr v5, v6

    const v6, 0x18831a7c

    goto/16 :goto_0

    .line 4
    :sswitch_a
    sget v4, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v4, :cond_5

    goto/16 :goto_4

    :cond_5
    const-string v4, "\u06eb\u0736"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x54e1

    const v6, 0x29656a75

    xor-int/2addr v5, v6

    const v6, -0x1725972

    goto/16 :goto_0

    .line 61
    :sswitch_b
    sget v4, Ll/֨۟;->᩹֫᩷:I

    if-eqz v4, :cond_6

    goto :goto_3

    :cond_6
    const-string v4, "\u05ab\u06ec"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x3d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x5bd

    const v6, -0x300fbf5d

    xor-int/2addr v5, v6

    const v6, 0x48a51e5c    # 338162.88f

    goto/16 :goto_0

    .line 3
    :sswitch_c
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_8

    :cond_7
    :goto_2
    const-string v4, "\u0730\u06ec"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x7

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x3367

    const v6, 0x6c6a1bd

    xor-int/2addr v5, v6

    const v6, 0x2ab388cc

    goto/16 :goto_0

    :cond_8
    const-string v4, "\u1a75\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x9

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x619f

    const v6, -0x5f10016b

    xor-int/2addr v5, v6

    const v6, 0x5f0057f2

    goto/16 :goto_0

    .line 35
    :sswitch_d
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v4

    if-nez v4, :cond_9

    :goto_3
    const-string v4, "\u06e1\u05a8"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x53a9

    const v6, -0x2191810

    xor-int/2addr v5, v6

    const v6, -0x13fa1b65

    goto/16 :goto_0

    :cond_9
    const-string v4, "\u1a78\u1a73"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, 0x23

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x1ce1

    const v6, -0x4504a3b8

    xor-int/2addr v5, v6

    const v6, 0x17404239

    goto/16 :goto_0

    :sswitch_e
    sget v4, Ll/ۖ;->᩹۟ۘ:I

    if-ltz v4, :cond_a

    goto :goto_5

    :cond_a
    const-string v4, "\u073d\u05a1"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    add-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x75

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2ecf

    const v6, 0x33d674d3

    xor-int/2addr v5, v6

    const v6, -0x73ad1273

    goto/16 :goto_0

    .line 68
    :sswitch_f
    sget-boolean v4, Ll/ۘ᩶;->ܶۗۡ:Z

    if-nez v4, :cond_b

    :goto_4
    const-string v4, "\u1a7b\u073d"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x5d

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x4d5b

    const v6, 0x12a9e3fd

    xor-int/2addr v5, v6

    const v6, -0x37b5e2e5

    goto/16 :goto_0

    :cond_b
    const-string v4, "\u06d8\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, -0x5f55

    const v6, 0x2600c88b

    xor-int/2addr v5, v6

    const v6, -0x311e7e64

    goto/16 :goto_0

    .line 159
    :sswitch_10
    iget-object v0, p0, Ll/ᩳܿ᩷;->᩹:Landroid/view/ViewTreeObserver;

    .line 10
    sget-boolean v4, Ll/֨۫;->۬᩷᩶:Z

    if-nez v4, :cond_d

    :cond_c
    :goto_5
    const-string v4, "\u06e2\u05ab"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    mul-int/lit8 v4, v4, -0x4b

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x233b

    const v6, -0x2109febe

    xor-int/2addr v5, v6

    const v6, 0x9a8d27d

    goto/16 :goto_0

    :cond_d
    const-string v4, "\u1a77\u06d6"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, 0x27

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x2243

    const v6, -0x2a87f584

    xor-int/2addr v5, v6

    const v6, -0x1d4bf021

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7d3ad58a -> :sswitch_2
        -0x761fe38b -> :sswitch_d
        -0x72100c2f -> :sswitch_0
        -0x7176e587 -> :sswitch_1
        -0x683fa423 -> :sswitch_c
        -0x653d00ab -> :sswitch_e
        -0x59b6ddea -> :sswitch_4
        -0x555120ee -> :sswitch_9
        -0x492c9f8a -> :sswitch_b
        -0x3f18cc8a -> :sswitch_8
        -0x1cd86844 -> :sswitch_c
        -0xd5ba5a4 -> :sswitch_a
        -0x9489bee -> :sswitch_e
        0x8109fe1 -> :sswitch_f
        0x9533988 -> :sswitch_9
        0xf2345c6 -> :sswitch_f
        0xff0fa6c -> :sswitch_8
        0x18b11378 -> :sswitch_10
        0x1c626380 -> :sswitch_a
        0x1ca21cfa -> :sswitch_5
        0x25ebb1eb -> :sswitch_1
        0x29a4a441 -> :sswitch_6
        0x3358a189 -> :sswitch_4
        0x456c8fb0 -> :sswitch_3
        0x4cebf268 -> :sswitch_d
        0x50316aab -> :sswitch_3
        0x54db669e -> :sswitch_7
        0x55a2719d -> :sswitch_b
        0x66d28190 -> :sswitch_6
        0x68afef5a -> :sswitch_0
        0x6dd318a0 -> :sswitch_5
        0x782b6f45 -> :sswitch_2
        0x78faf2b3 -> :sswitch_10
        0x7e17a599 -> :sswitch_7
    .end sparse-switch
.end method
