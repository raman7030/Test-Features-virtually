.class public final Ll/֡۫ܽ;
.super Landroid/text/style/ReplacementSpan;
.source "819S"


# instance fields
.field public final ᩸:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 6

    const v0, -0x7e4c58a4

    sget v1, Ll/ۘۛ;->ۖۚ֡:I

    sget v2, Ll/ۘᩴ;->ܿ۬ܿ:I

    .line 663
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const-string v3, "\u073a\u0733"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v2, v3

    mul-int/lit8 v3, v3, -0x51

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x3d11

    const v5, -0x32274467

    xor-int/2addr v4, v5

    const v5, -0x691fbad4

    :goto_0
    xor-int/2addr v3, v5

    xor-int/2addr v0, v1

    mul-int/lit16 v0, v0, -0x416d

    shr-int/lit8 v0, v0, 0x1f

    and-int/2addr v0, v4

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_0

    .line 151
    sget-boolean v3, Ll/֫᩺;->֫ܰۨ:Z

    if-eqz v3, :cond_7

    goto :goto_1

    .line 593
    :sswitch_0
    invoke-static {}, Ll/ۘ᩶;->۟֡ܿ()I

    move-result v3

    if-gez v3, :cond_2

    goto/16 :goto_2

    .line 245
    :sswitch_1
    invoke-static {}, Ll/֡ۜ;->֫ۜۡ()I

    sget-boolean v3, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v3, :cond_a

    goto :goto_2

    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    goto :goto_1

    :sswitch_3
    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 664
    :sswitch_4
    new-instance v3, Landroid/graphics/Paint;

    const/4 v4, 0x1

    .line 273
    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    move-result v5

    if-gtz v5, :cond_0

    goto/16 :goto_3

    .line 563
    :cond_0
    sget v5, Ll/ۘۘ;->᩷ۙ᩸:I

    if-ltz v5, :cond_1

    :goto_1
    const-string v3, "\u0733\u0736"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, -0x28c3

    const v5, -0x1e4b2032

    xor-int/2addr v4, v5

    const v5, -0x3461546a    # -2.0797228E7f

    goto :goto_0

    .line 597
    :cond_1
    sget v5, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-gtz v5, :cond_3

    :cond_2
    const-string v3, "\u06d7\u1a79"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    add-int/2addr v3, v1

    mul-int/lit8 v3, v3, 0x29

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, 0x5c9f

    const v5, 0x514a12bb

    xor-int/2addr v4, v5

    const v5, 0x618433ff

    goto :goto_0

    .line 425
    :cond_3
    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    move-result v5

    if-gtz v5, :cond_4

    goto :goto_3

    :cond_4
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_4

    .line 605
    :cond_5
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_3

    .line 337
    :cond_6
    sget v5, Ll/֡ܶ;->ᩴܿ᩸:I

    if-ltz v5, :cond_8

    :cond_7
    :goto_2
    const-string v3, "\u05a8\u073a"

    invoke-static {v3}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v3

    sub-int v3, v1, v3

    mul-int/lit8 v3, v3, -0x17

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x6439

    const v5, 0x79216d8b

    xor-int/2addr v4, v5

    const v5, 0x2859193a

    goto/16 :goto_0

    :cond_8
    sget v5, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-ltz v5, :cond_9

    goto :goto_4

    .line 635
    :cond_9
    sget v5, Ll/ۘۨ;->۫᩸۠:I

    if-ltz v5, :cond_b

    :cond_a
    :goto_3
    const-string v3, "\u06e8\u05ab"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v2

    xor-int v4, v3, v1

    mul-int/lit16 v4, v4, 0x163f

    const v5, -0x400acda4

    xor-int/2addr v4, v5

    const v5, -0x5b7d3aac

    goto/16 :goto_0

    .line 82
    :cond_b
    sget v5, Ll/᩺;->ۙۛܶ:I

    if-gtz v5, :cond_c

    :goto_4
    const-string v3, "\u06db\u073f"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    xor-int/2addr v3, v1

    xor-int v4, v3, v2

    mul-int/lit16 v4, v4, -0x7259

    const v5, 0x51522340

    xor-int/2addr v4, v5

    const v5, -0x5b435de1

    goto/16 :goto_0

    .line 664
    :cond_c
    invoke-direct {v3, v4}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v3, p0, Ll/֡۫ܽ;->᩸:Landroid/graphics/Paint;

    return-void

    :sswitch_data_0
    .sparse-switch
        -0x62a828ae -> :sswitch_3
        -0x589fd5bf -> :sswitch_3
        -0x4ae7e9ec -> :sswitch_0
        -0x3d9acec2 -> :sswitch_0
        -0x152c3c4f -> :sswitch_2
        0x1976ec80 -> :sswitch_1
        0x1c9f7f1e -> :sswitch_4
        0x2407280e -> :sswitch_2
        0x4bd6ff13 -> :sswitch_1
        0x4ed2e03e -> :sswitch_4
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 21

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v13, -0x4a5bec8b

    sget v14, Ll/֨ۤ;->ܿۖ᩵:I

    sget v15, Ll/ۗ۬;->ۘܳ᩻:I

    const-string v16, "\u1a7b\u073f"

    invoke-static/range {v16 .. v16}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v16

    sub-int v16, v15, v16

    mul-int/lit8 v16, v16, -0xd

    xor-int v0, v16, v14

    mul-int/lit16 v0, v0, -0x191

    const v17, 0x240ae87e

    xor-int v0, v0, v17

    const v17, 0x3be90c0d

    xor-int v16, v16, v17

    move-object v5, v4

    move/from16 v17, v16

    const/16 p2, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const v16, -0x4a5bec8b

    :goto_0
    xor-int v13, v16, v14

    mul-int/lit16 v13, v13, -0x4d81

    shr-int/lit8 v13, v13, 0x1f

    and-int/2addr v0, v13

    xor-int v16, v17, v0

    sparse-switch v16, :sswitch_data_0

    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 197
    sget v0, Ll/֡ᩴ;->ܳۤ֫:I

    if-ltz v0, :cond_9

    goto/16 :goto_7

    .line 246
    :sswitch_0
    sget v0, Ll/۠;->ܺܺܶ:I

    if-gez v0, :cond_0

    goto :goto_3

    :cond_0
    move-object/from16 v13, p0

    :goto_1
    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_7

    .line 661
    :sswitch_1
    invoke-static {}, Ll/۠;->ܿ۠۠()I

    sget v0, Ll/֫ܿ;->ۨ۫ᩳ:I

    if-lez v0, :cond_1

    :goto_2
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_6

    :cond_1
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    goto/16 :goto_8

    :sswitch_2
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    sget-boolean v0, Ll/֫ۡ;->۠ۤۜ:Z

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    :goto_3
    const-string v0, "\u1a75\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, -0x5f

    xor-int v13, v0, v15

    mul-int/lit16 v13, v13, 0x6b07

    const v17, -0x9c36dbc

    xor-int v13, v13, v17

    const v17, -0x2811898f

    xor-int v17, v0, v17

    move v0, v13

    goto :goto_0

    .line 284
    :sswitch_3
    invoke-static {}, Ll/ۖۘ;->ۙܰۚ()Z

    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    goto :goto_2

    .line 107
    :sswitch_4
    invoke-static {}, Ll/֫᩵;->᩻ۧܶ()Z

    return-void

    .line 694
    :sswitch_5
    iget v0, v5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    add-int/2addr v12, v0

    int-to-float v0, v12

    div-float/2addr v0, v8

    add-float/2addr v0, v11

    .line 695
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    move-object/from16 v13, p0

    iget-object v2, v13, Ll/֡۫ܽ;->᩸:Landroid/graphics/Paint;

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 696
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    move-object/from16 v8, p1

    .line 697
    invoke-virtual {v8, v10, v0, v9, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void

    :sswitch_6
    move-object/from16 v13, p0

    move-object/from16 v8, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float v9, v7, v0

    add-float v10, v6, v9

    move/from16 v11, p7

    int-to-float v12, v11

    .line 694
    iget v0, v5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 502
    sget v17, Ll/ۘᩴ;->ܿ۬ܿ:I

    if-gtz v17, :cond_3

    move/from16 v18, v1

    move/from16 v17, v2

    move v11, v12

    const/high16 v8, 0x40000000    # 2.0f

    move v12, v0

    goto/16 :goto_7

    :cond_3
    const-string v17, "\u06d7\u1a78"

    invoke-static/range {v17 .. v17}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v17

    xor-int v17, v17, v14

    move/from16 p4, v0

    xor-int v0, v17, v15

    mul-int/lit16 v0, v0, -0x7395

    const v18, 0x7e90f452

    xor-int v0, v0, v18

    const v18, 0x6f6ab54b

    xor-int v17, v17, v18

    move v11, v12

    const/high16 v8, 0x40000000    # 2.0f

    move/from16 v12, p4

    goto/16 :goto_0

    :sswitch_7
    move-object/from16 v13, p0

    .line 691
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v3, v0}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result v0

    .line 692
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v5

    int-to-float v0, v0

    add-float v6, p5, v0

    int-to-float v7, v2

    .line 557
    sget v0, Ll/ۖ۫;->ۖ֫ܿ:I

    if-ltz v0, :cond_4

    goto/16 :goto_1

    :cond_4
    const-string v0, "\u06e7\u073a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x51

    move/from16 v17, v2

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, -0x47ff

    const v18, 0x69069684

    xor-int v2, v2, v18

    const v18, 0x53f0061d

    goto :goto_4

    :sswitch_8
    move-object/from16 v13, p0

    .line 690
    invoke-static/range {p9 .. p9}, Ll/ۖ۫;->ۜ᩵ۨ(Ljava/lang/Object;)F

    move-result v0

    const v2, 0x3e3851ec    # 0.18f

    mul-float v0, v0, v2

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    invoke-static {v1, v0}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result v2

    const/high16 v0, 0x40800000    # 4.0f

    .line 691
    invoke-static {v0}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result v3

    invoke-static/range {p9 .. p9}, Ll/ۛ;->ۘܺ᩸(Ljava/lang/Object;)F

    move-result v0

    const v4, 0x3e0f5c29    # 0.14f

    mul-float v4, v4, v0

    .line 327
    sget-boolean v0, Ll/ۖۘ;->ۚܶۖ:Z

    if-eqz v0, :cond_5

    goto/16 :goto_9

    :cond_5
    const-string v0, "\u06e8\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v14

    mul-int/lit8 v0, v0, 0x3b

    move/from16 v18, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x1101

    const v17, 0x3aaf9e44

    xor-int v1, v1, v17

    const v17, -0x21ca56b3

    xor-int v17, v0, v17

    goto/16 :goto_b

    :sswitch_9
    move-object/from16 v13, p0

    move/from16 v17, v2

    const/high16 v0, 0x40200000    # 2.5f

    .line 690
    invoke-static {v0}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v1

    .line 232
    sget v0, Ll/ۗۗ;->ۨ۬ۖ:I

    if-ltz v0, :cond_6

    move/from16 v2, v17

    goto/16 :goto_9

    :cond_6
    const-string v0, "\u06d8\u0733"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v2, v0, v14

    mul-int/lit16 v2, v2, 0x46d1

    const v18, 0x5bc8b31e

    xor-int v2, v2, v18

    const v18, -0x3862690a

    :goto_4
    xor-int v0, v0, v18

    move/from16 v20, v17

    move/from16 v17, v0

    move v0, v2

    move/from16 v2, v20

    goto/16 :goto_0

    :sswitch_a
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v0

    if-gtz v0, :cond_7

    :goto_5
    move/from16 v2, v17

    move/from16 v1, v18

    goto/16 :goto_9

    :cond_7
    const-string v0, "\u05a1\u06da"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x7f

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x3f43

    const v2, 0x21abecaa

    xor-int/2addr v1, v2

    const v2, 0x69952caf

    goto/16 :goto_a

    :sswitch_b
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 481
    sget v0, Ll/᩺;->ۙۛܶ:I

    if-gtz v0, :cond_8

    :goto_6
    const-string v0, "\u0733\u06e1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v15, v0

    mul-int/lit8 v0, v0, 0x37

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x11a3

    const v2, -0x15999866

    xor-int/2addr v1, v2

    const v2, -0x5263e296

    goto/16 :goto_a

    :cond_8
    const-string v0, "\u06e8\u1a74"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0x4719

    const v2, -0x404f24fb

    xor-int/2addr v1, v2

    const v2, -0x17c957eb

    goto/16 :goto_a

    :goto_7
    const-string v0, "\u1a7a\u06df"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    mul-int/lit8 v0, v0, 0x51

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x681b

    const v2, 0x3c57c026

    xor-int/2addr v1, v2

    const v2, 0x2186dffb

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u073f\u0730"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x36a3

    const v2, 0x8189480

    xor-int/2addr v1, v2

    const v2, 0x6c6bed4

    goto/16 :goto_a

    :sswitch_c
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    .line 264
    sget v0, Ll/֫ܽ;->ۚ᩷᩹:I

    if-ltz v0, :cond_a

    goto :goto_8

    :cond_a
    const-string v0, "\u073f\u06df"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int/2addr v0, v15

    mul-int/lit8 v0, v0, -0x11

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, 0x2f71

    const v2, 0x71afc15a

    xor-int/2addr v1, v2

    const v2, -0x3aaa67f

    goto/16 :goto_a

    :sswitch_d
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    invoke-static {}, Ll/ۙۨ;->ۧۢ᩶()I

    move-result v0

    if-eqz v0, :cond_b

    :goto_8
    const-string v0, "\u06e2\u06d9"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v15

    xor-int v1, v0, v14

    mul-int/lit16 v1, v1, -0x57df

    const v2, 0x4d0e3f36    # 1.49156704E8f

    xor-int/2addr v1, v2

    const v2, 0x38b67f45

    goto :goto_a

    :cond_b
    const-string v0, "\u06e2\u1a73"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x2e01

    const v2, -0x282200d2

    xor-int/2addr v1, v2

    const v2, 0x13164031

    goto :goto_a

    :sswitch_e
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    if-ltz p2, :cond_c

    goto/16 :goto_5

    :goto_9
    const-string v0, "\u06eb\u06d6"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int/2addr v0, v14

    move/from16 p3, v1

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, -0x3251

    const v17, -0x3a895f96

    xor-int v1, v1, v17

    const v17, -0x2cebcc77

    xor-int v17, v0, v17

    move v0, v1

    move/from16 v1, p3

    goto/16 :goto_0

    :cond_c
    const-string v0, "\u06df\u06dc"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v14, v0

    mul-int/lit8 v0, v0, -0x63

    xor-int v1, v0, v15

    mul-int/lit16 v1, v1, 0xa9

    const v2, -0x7bcb8cd5

    xor-int/2addr v1, v2

    const v2, 0x6ed26ff9

    :goto_a
    xor-int/2addr v0, v2

    move/from16 v2, v17

    move/from16 v17, v0

    :goto_b
    move v0, v1

    goto :goto_c

    :sswitch_f
    move-object/from16 v13, p0

    move/from16 v18, v1

    move/from16 v17, v2

    sget v0, Ll/ۨ;->᩺᩷ۚ:I

    const-string v1, "\u06d8\u1a76"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int/2addr v1, v15

    xor-int v2, v1, v14

    mul-int/lit16 v2, v2, -0x1775

    const v19, 0xde5bb4d

    xor-int v2, v2, v19

    const v19, -0x4364f59e

    xor-int v1, v1, v19

    move/from16 p2, v0

    move v0, v2

    move/from16 v2, v17

    move/from16 v17, v1

    :goto_c
    move/from16 v1, v18

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x61915577 -> :sswitch_c
        -0x611d436c -> :sswitch_e
        -0x5752990f -> :sswitch_3
        -0x56709126 -> :sswitch_d
        -0x487efd13 -> :sswitch_3
        -0x47a59b41 -> :sswitch_9
        -0x36c0b3da -> :sswitch_1
        -0x358373c4 -> :sswitch_4
        -0x319240a9 -> :sswitch_0
        -0x1deda15d -> :sswitch_5
        -0x1a1bea3b -> :sswitch_8
        -0x18d9b863 -> :sswitch_b
        -0x13474a10 -> :sswitch_6
        -0xf425f73 -> :sswitch_9
        -0xb28125f -> :sswitch_8
        -0x68ae49f -> :sswitch_7
        -0x31d538f -> :sswitch_5
        0x1acffb1a -> :sswitch_2
        0x24388125 -> :sswitch_d
        0x24bf016d -> :sswitch_b
        0x447cc828 -> :sswitch_6
        0x44ee4c69 -> :sswitch_7
        0x4b6fb897 -> :sswitch_c
        0x4e12988c -> :sswitch_e
        0x54b28b30 -> :sswitch_a
        0x5d06d3da -> :sswitch_2
        0x5e6cebab -> :sswitch_0
        0x5f1b8745 -> :sswitch_4
        0x654e5df0 -> :sswitch_a
        0x6a337704 -> :sswitch_1
        0x79fe40b4 -> :sswitch_f
        0x7be99c81 -> :sswitch_f
    .end sparse-switch
.end method

.method public final getSize(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Paint$FontMetricsInt;)I
    .locals 9

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const v3, 0x6ef9c505

    sget v4, Ll/ۘᩴ;->ܿ۬ܿ:I

    sget v5, Ll/֨۬;->۫ۙ᩺:I

    const-string v6, "\u0730\u1a75"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3123

    const v8, 0x658dfa50

    xor-int/2addr v7, v8

    const v8, 0x5dfda879

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, 0x139d

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    invoke-static {}, Ll/ۖ۫;->ۢۨۚ()Z

    move-result v6

    if-eqz v6, :cond_a

    goto/16 :goto_2

    :sswitch_0
    invoke-static {}, Ll/ۘ᩻;->ۨ᩻ۚ()I

    sget v6, Ll/ۘۛ;->ۖۚ֡:I

    if-lez v6, :cond_2

    goto/16 :goto_2

    :sswitch_1
    invoke-static {}, Ll/ۗ۬;->ۨۨܳ()I

    sget v6, Ll/۠;->ܺܺܶ:I

    if-ltz v6, :cond_9

    goto/16 :goto_4

    .line 539
    :sswitch_2
    sget v6, Ll/֡ᩴ;->ܳۤ֫:I

    if-gez v6, :cond_0

    goto/16 :goto_4

    :cond_0
    const-string v6, "\u05a8\u1a7b"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5d13

    const v8, -0x57212723    # -2.4741E-14f

    xor-int/2addr v7, v8

    const v8, 0x24c4d170

    goto :goto_0

    :sswitch_3
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    goto/16 :goto_4

    .line 378
    :sswitch_4
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    const/4 p1, 0x0

    return p1

    .line 676
    :sswitch_5
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 677
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto/16 :goto_1

    .line 673
    :sswitch_6
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v2

    .line 674
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 675
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 527
    invoke-static {}, Ll/֡᩺;->ۗ᩵ۧ()Z

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_4

    :cond_1
    const-string v6, "\u06e4\u06d7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x79

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4c19

    const v8, 0x3fa3ff05

    xor-int/2addr v7, v8

    const v8, -0xedfdfa7

    goto :goto_0

    .line 680
    :sswitch_7
    invoke-static {v0, v1}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p4

    return p1

    :sswitch_8
    invoke-static {p1}, Ll/ۖ۫;->ۜ᩵ۨ(Ljava/lang/Object;)F

    move-result v1

    const v6, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 491
    sget v6, Ll/֡᩶;->ܳܶ۠:I

    if-gtz v6, :cond_3

    :cond_2
    const-string v6, "\u1a77\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1895

    const v8, 0x6cec2319

    xor-int/2addr v7, v8

    const v8, -0x695bc4fa

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u0733\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x45

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x258d

    const v8, 0x5650afc4

    xor-int/2addr v7, v8

    const v8, 0x4c34aad3    # 4.7360844E7f

    goto/16 :goto_0

    .line 679
    :sswitch_9
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p2, p4}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result p4

    const/high16 v0, 0x40800000    # 4.0f

    .line 680
    invoke-static {v0}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v0

    invoke-static {}, Ll/֨۟;->᩶۫ۨ()Z

    move-result v6

    if-nez v6, :cond_4

    goto/16 :goto_3

    :cond_4
    const-string v6, "\u06e4\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x37

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x76ad

    const v8, -0x2fa99b0d

    xor-int/2addr v7, v8

    const v8, -0x6765aba9

    goto/16 :goto_0

    :sswitch_a
    const/high16 p2, 0x40200000    # 2.5f

    .line 679
    invoke-static {p2}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result p2

    invoke-static {p1}, Ll/ۛ;->ۘܺ᩸(Ljava/lang/Object;)F

    move-result p3

    const v6, 0x3e3851ec    # 0.18f

    mul-float p3, p3, v6

    .line 211
    invoke-static {}, Ll/ۗ᩺;->ۤ֨ۗ()I

    move-result v6

    if-gtz v6, :cond_5

    goto/16 :goto_3

    :cond_5
    const-string v6, "\u06df\u1a7b"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x74d5

    const v8, -0x61001b7b

    xor-int/2addr v7, v8

    const v8, -0x831483b

    goto/16 :goto_0

    :sswitch_b
    if-eqz p5, :cond_6

    const-string v6, "\u06d7\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x67

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x75d

    const v8, -0x19b750a1

    xor-int/2addr v7, v8

    const v8, 0x28c96b3

    goto/16 :goto_0

    :cond_6
    :goto_1
    const-string v6, "\u1a73\u1a79"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x2621

    const v8, -0x1387caaf

    xor-int/2addr v7, v8

    const v8, 0x4389593a

    goto/16 :goto_0

    :sswitch_c
    sget v6, Ll/ۙۨ;->ۡۗۙ:I

    if-gtz v6, :cond_7

    goto/16 :goto_3

    :cond_7
    const-string v6, "\u06da\u06e1"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5545

    const v8, 0x57fb1b72

    xor-int/2addr v7, v8

    const v8, 0x6d2c5cb9

    goto/16 :goto_0

    :sswitch_d
    invoke-static {}, Ll/֨᩺;->ᩴۘ᩻()Z

    move-result v6

    if-eqz v6, :cond_8

    goto/16 :goto_4

    :cond_8
    const-string v6, "\u073d\u0736"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x4b

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x2b23

    const v8, 0x5395d1b4

    xor-int/2addr v7, v8

    const v8, 0x65cc1e3c

    goto/16 :goto_0

    :cond_9
    :goto_2
    const-string v6, "\u1a77\u06eb"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x4ebb

    const v8, -0x7e1b65f6

    xor-int/2addr v7, v8

    const v8, -0x33e054c6    # -4.1856232E7f

    goto/16 :goto_0

    :cond_a
    const-string v6, "\u06eb\u06da"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, -0x23

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x5b1

    const v8, 0x711d0346

    xor-int/2addr v7, v8

    const v8, -0x1dd76e10

    goto/16 :goto_0

    .line 74
    :sswitch_e
    invoke-static {}, Ll/ۨ;->᩻ۘ᩷()Z

    move-result v6

    if-nez v6, :cond_b

    goto :goto_4

    :cond_b
    const-string v6, "\u06dc\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0xf

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x241

    const v8, 0x2585261

    xor-int/2addr v7, v8

    const v8, -0x506e10e4

    goto/16 :goto_0

    .line 327
    :sswitch_f
    sget v6, Ll/ۗ᩺;->ۡ᩺֡:I

    if-ltz v6, :cond_c

    :goto_3
    const-string v6, "\u1a73\u06e4"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x43

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3a5

    const v8, -0x3db7fc43    # -50.00365f

    xor-int/2addr v7, v8

    const v8, 0x6d92f5bf

    goto/16 :goto_0

    :cond_c
    const-string v6, "\u1a75\u1a7a"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x207

    const v8, -0xa5f5e3f

    xor-int/2addr v7, v8

    const v8, 0x5495f153

    goto/16 :goto_0

    :sswitch_10
    sget v6, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v6, :cond_d

    :goto_4
    const-string v6, "\u06d6\u06df"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x16e9

    const v8, 0x670336e3

    xor-int/2addr v7, v8

    const v8, -0x2f182ee8

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u06e7\u1a76"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x3d6d

    const v8, -0x47303346

    xor-int/2addr v7, v8

    const v8, 0x7bdf45ac

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x79d16e8a -> :sswitch_4
        -0x721a2945 -> :sswitch_7
        -0x6eb45cbf -> :sswitch_a
        -0x6ce4adbe -> :sswitch_3
        -0x66ac227d -> :sswitch_4
        -0x65618b69 -> :sswitch_5
        -0x56f49bb6 -> :sswitch_0
        -0x4103b169 -> :sswitch_1
        -0x3f5972f8 -> :sswitch_d
        -0x3b67685a -> :sswitch_2
        -0x39706ebb -> :sswitch_f
        -0x2e032ffd -> :sswitch_a
        -0x12e5115a -> :sswitch_b
        -0xdc0cd82 -> :sswitch_d
        -0xb5a08f -> :sswitch_9
        0x25f2551 -> :sswitch_e
        0x8100044 -> :sswitch_5
        0x89836fc -> :sswitch_c
        0x106ac1c5 -> :sswitch_9
        0x11aae44c -> :sswitch_b
        0x178a95e8 -> :sswitch_6
        0x28a06346 -> :sswitch_7
        0x2c401f6b -> :sswitch_3
        0x39cf25ea -> :sswitch_e
        0x4529e92e -> :sswitch_1
        0x47aedea0 -> :sswitch_c
        0x48666b2e -> :sswitch_6
        0x4c0b6b3f -> :sswitch_8
        0x51503111 -> :sswitch_f
        0x557956f4 -> :sswitch_10
        0x56fa262d -> :sswitch_0
        0x609a954b -> :sswitch_2
        0x6e08792f -> :sswitch_8
        0x7bcbe8e6 -> :sswitch_10
    .end sparse-switch
.end method
