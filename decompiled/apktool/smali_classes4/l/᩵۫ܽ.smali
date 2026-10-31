.class public final Ll/᩵۫ܽ;
.super Landroid/text/style/ReplacementSpan;
.source "819S"


# instance fields
.field public final ᩸:Landroid/graphics/Paint;

.field public final ᩹:Landroid/graphics/Path;


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v0, 0x0

    const v1, -0x11ac9add

    sget v2, Ll/ۖ۫;->ۖ֫ܿ:I

    sget v3, Ll/֨᩺;->ۨ֨۬:I

    .line 704
    invoke-direct {p0}, Landroid/text/style/ReplacementSpan;-><init>()V

    const-string v4, "\u1a78\u06e7"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, -0x7b

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x6377

    const v6, 0x4939329d

    xor-int/2addr v5, v6

    const v6, -0xd005704

    :goto_0
    xor-int/2addr v4, v6

    move-object v6, v0

    :goto_1
    xor-int/2addr v1, v2

    mul-int/lit16 v1, v1, -0x445

    shr-int/lit8 v1, v1, 0x1f

    and-int/2addr v1, v5

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_0

    .line 705
    iput-object v6, p0, Ll/᩵۫ܽ;->᩸:Landroid/graphics/Paint;

    .line 684
    sget-boolean v4, Ll/֫֫;->ۢ᩸᩶:Z

    if-eqz v4, :cond_1

    goto/16 :goto_3

    .line 395
    :sswitch_0
    invoke-static {}, Ll/ۛ;->ۧᩴۢ()I

    move-result v4

    if-gez v4, :cond_8

    goto/16 :goto_5

    .line 591
    :sswitch_1
    sget-boolean v4, Ll/֫ۡ;->۠ۤۜ:Z

    if-eqz v4, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v4, "\u0733\u06eb"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    mul-int/lit8 v4, v4, -0x35

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x42a3

    const v7, -0x32510583

    xor-int/2addr v5, v7

    const v7, 0x235c0993

    goto/16 :goto_6

    .line 62
    :sswitch_2
    sget v4, Ll/֨ᩴ;->ۢ֨ۖ:I

    if-gez v4, :cond_b

    goto :goto_2

    .line 619
    :sswitch_3
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    goto :goto_2

    :sswitch_4
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    .line 706
    :sswitch_5
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/᩵۫ܽ;->᩹:Landroid/graphics/Path;

    return-void

    :cond_1
    const-string v4, "\u06da\u05ab"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v2, v4

    mul-int/lit8 v4, v4, -0x3d

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x4889

    const v7, -0x64b341b2

    xor-int/2addr v5, v7

    const v7, 0x56e9f68c

    goto/16 :goto_6

    .line 705
    :sswitch_6
    new-instance v6, Landroid/graphics/Paint;

    const/4 v4, 0x1

    .line 458
    sget v5, Ll/᩹;->ۤܿܳ:I

    if-eqz v5, :cond_2

    :goto_2
    const-string v4, "\u06e8\u1a78"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5ef1

    const v6, 0x1d3d85c

    xor-int/2addr v5, v6

    const v6, 0x4e2dd93f    # 7.2917395E8f

    goto/16 :goto_0

    .line 140
    :cond_2
    sget v5, Ll/۠;->ܺܺܶ:I

    if-ltz v5, :cond_3

    goto :goto_5

    .line 201
    :cond_3
    sget-boolean v5, Ll/֨۫;->۬᩷᩶:Z

    if-nez v5, :cond_4

    goto :goto_3

    :cond_4
    sget-boolean v5, Ll/֨ۡ;->ܶᩴ᩶:Z

    if-nez v5, :cond_5

    goto :goto_5

    .line 367
    :cond_5
    invoke-static {}, Ll/֡֡;->ܺ۬ۚ()I

    move-result v5

    if-gtz v5, :cond_6

    goto :goto_4

    .line 60
    :cond_6
    sget-boolean v5, Ll/֡ۨ;->ܽܶۖ:Z

    if-nez v5, :cond_7

    :goto_3
    const-string v4, "\u1a75\u06e0"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0x40b1

    const v6, 0x28aa1533

    xor-int/2addr v5, v6

    const v6, 0x3bf0d243

    goto/16 :goto_0

    .line 373
    :cond_7
    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v5

    if-gtz v5, :cond_9

    :cond_8
    :goto_4
    const-string v4, "\u06eb\u06df"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v2

    xor-int v5, v4, v3

    mul-int/lit16 v5, v5, 0x5b95

    const v6, -0x126df93e

    xor-int/2addr v5, v6

    const v6, 0x5305854d

    goto/16 :goto_0

    :cond_9
    invoke-static {}, Ll/֫ܽ;->᩻֫۠()I

    move-result v5

    if-eqz v5, :cond_a

    goto :goto_5

    .line 705
    :cond_a
    invoke-direct {v6, v4}, Landroid/graphics/Paint;-><init>(I)V

    sget v4, Ll/ۗ᩷;->᩸᩺ᩳ:I

    if-gtz v4, :cond_c

    :cond_b
    :goto_5
    const-string v4, "\u05ab\u06df"

    invoke-static {v4}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v4

    xor-int/2addr v4, v3

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, 0x7b4b

    const v6, -0x7f14dc0

    xor-int/2addr v5, v6

    const v6, 0x5ee70699

    goto/16 :goto_0

    :cond_c
    const-string v4, "\u0733\u06d6"

    invoke-static {v4}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v4

    sub-int v4, v3, v4

    mul-int/lit8 v4, v4, 0x53

    xor-int v5, v4, v2

    mul-int/lit16 v5, v5, -0xb75

    const v7, 0x31c95486

    xor-int/2addr v5, v7

    const v7, 0x27322f3

    :goto_6
    xor-int/2addr v4, v7

    goto/16 :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x6216593b -> :sswitch_6
        -0x5c7e9809 -> :sswitch_4
        -0x3a761e05 -> :sswitch_4
        -0x2b82b469 -> :sswitch_2
        -0x275e6fb3 -> :sswitch_1
        -0x10e6337b -> :sswitch_5
        0x4fa1245 -> :sswitch_3
        0xca397ce -> :sswitch_5
        0x1d2d6b99 -> :sswitch_3
        0x3edf4eab -> :sswitch_1
        0x5083fefa -> :sswitch_2
        0x5af9080d -> :sswitch_6
        0x72c72c4a -> :sswitch_0
        0x783932dc -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIIILandroid/graphics/Paint;)V
    .locals 21

    move-object/from16 v0, p0

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

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const v16, -0x693e6a04

    sget v17, Ll/֫ۧ;->ۙ۟ۧ:I

    sget v18, Ll/ۗ᩶;->ۛ֨ۘ:I

    const-string v19, "\u1a73\u1a73"

    invoke-static/range {v19 .. v19}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v19

    xor-int v19, v19, v17

    xor-int v1, v19, v18

    mul-int/lit16 v1, v1, -0x9bb

    const v20, -0x645103b2

    xor-int v1, v1, v20

    const v20, 0x6a9d7e8c

    xor-int v19, v19, v20

    move-object v15, v14

    move/from16 v20, v19

    const/16 p2, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const v19, -0x693e6a04

    move-object v14, v13

    const/4 v13, 0x0

    :goto_0
    xor-int v3, v19, v18

    mul-int/lit16 v3, v3, 0x32df

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v1, v3

    xor-int v19, v20, v1

    sparse-switch v19, :sswitch_data_0

    invoke-static {}, Ll/ۗۚ;->ۤۧ᩺()I

    move-result v1

    if-lez v1, :cond_3

    goto :goto_1

    .line 513
    :sswitch_0
    invoke-static {}, Ll/֨۬;->ܳܳۧ()I

    move-result v1

    if-lez v1, :cond_1

    :cond_0
    :goto_1
    move/from16 v3, p7

    goto/16 :goto_a

    :cond_1
    move/from16 v0, p2

    move/from16 v3, p7

    goto/16 :goto_6

    .line 626
    :sswitch_1
    invoke-static {}, Ll/֡۬;->᩻ܶܿ()Z

    sget v1, Ll/ۙۨ;->ۡۗۙ:I

    if-lez v1, :cond_0

    :goto_2
    move/from16 v3, p7

    goto/16 :goto_9

    :sswitch_2
    invoke-static {}, Ll/֨ۤ;->᩸ܿۛ()I

    invoke-static {}, Ll/֫ۡ;->᩸֫ۡ()I

    goto :goto_2

    :sswitch_3
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    invoke-static {}, Ll/֨ᩴ;->ۘۖ֡()I

    return-void

    .line 745
    :sswitch_4
    invoke-virtual {v15}, Landroid/graphics/Path;->rewind()V

    div-float/2addr v4, v10

    sub-float v1, v11, v4

    .line 746
    invoke-virtual {v15, v12, v1}, Landroid/graphics/Path;->moveTo(FF)V

    .line 747
    invoke-virtual {v15, v13, v11}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v11, v4

    .line 748
    invoke-virtual {v15, v12, v11}, Landroid/graphics/Path;->lineTo(FF)V

    move-object/from16 v1, p1

    .line 749
    invoke-virtual {v1, v15, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void

    :sswitch_5
    move-object/from16 v1, p1

    const/high16 v3, 0x3f400000    # 0.75f

    .line 744
    invoke-static {v3}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v3

    int-to-float v3, v3

    invoke-static/range {p9 .. p9}, Ll/ۛ;->ۘܺ᩸(Ljava/lang/Object;)F

    move-result v15

    const v20, 0x3d6147ae    # 0.055f

    mul-float v15, v15, v20

    invoke-static {v3, v15}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 745
    iget-object v15, v0, Ll/᩵۫ܽ;->᩹:Landroid/graphics/Path;

    .line 392
    sget-boolean v3, Ll/֨֫;->᩺ܺ᩸:Z

    if-eqz v3, :cond_2

    goto :goto_3

    :cond_2
    const-string v3, "\u06d8\u06e4"

    invoke-static {v3}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v3

    add-int v3, v3, v17

    mul-int/lit8 v3, v3, 0x79

    xor-int v1, v3, v18

    mul-int/lit16 v1, v1, -0x72a3

    const v20, 0x4c01cd84    # 3.4027024E7f

    xor-int v1, v1, v20

    const v20, -0x7764d822

    xor-int v20, v3, v20

    goto/16 :goto_0

    .line 740
    :sswitch_6
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getAlpha()I

    move-result v1

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 741
    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 742
    sget-object v1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 743
    sget-object v1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 260
    sget v1, Ll/ۘ᩻;->᩵ۜ֨:I

    if-gtz v1, :cond_4

    :cond_3
    :goto_3
    const-string v1, "\u05a1\u06dc"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, 0x49

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, -0x72f5

    const v20, -0x5c71cbea

    xor-int v3, v3, v20

    const v20, 0x2b422cac

    goto :goto_4

    :cond_4
    const-string v1, "\u0733\u06e4"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v3, v1, v18

    mul-int/lit16 v3, v3, 0x53a7

    const v20, -0x32873cd7

    xor-int v3, v3, v20

    const v20, 0xe839fdb

    goto :goto_4

    :sswitch_7
    add-int v1, v8, v9

    int-to-float v1, v1

    const/high16 v10, 0x40000000    # 2.0f

    div-float/2addr v1, v10

    add-float v11, v1, v7

    add-float v12, p5, v6

    add-float v13, v2, v12

    .line 739
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getColor()I

    move-result v1

    iget-object v14, v0, Ll/᩵۫ܽ;->᩸:Landroid/graphics/Paint;

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 24
    sget v1, Ll/۠;->ܺܺܶ:I

    if-ltz v1, :cond_5

    goto/16 :goto_2

    :cond_5
    const-string v1, "\u1a79\u1a79"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    sub-int v1, v18, v1

    mul-int/lit8 v1, v1, 0x6f

    xor-int v3, v1, v17

    mul-int/lit16 v3, v3, 0x1fd

    const v20, 0x2856560b

    xor-int v3, v3, v20

    const v20, 0x3fd468db

    :goto_4
    xor-int v20, v1, v20

    move v1, v3

    goto/16 :goto_0

    .line 734
    :sswitch_8
    invoke-static/range {p9 .. p9}, Ll/ۖ۫;->ۜ᩵ۨ(Ljava/lang/Object;)F

    move-result v1

    const v3, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v3

    invoke-static {v5, v1}, Ljava/lang/Math;->max(FF)F

    move-result v6

    .line 735
    invoke-virtual/range {p9 .. p9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v1

    move/from16 v3, p7

    int-to-float v7, v3

    .line 736
    iget v8, v1, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iget v9, v1, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 561
    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_6

    goto/16 :goto_8

    :cond_6
    const-string v1, "\u06da\u073a"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v18

    xor-int v0, v1, v17

    mul-int/lit16 v0, v0, 0x76f3

    const v20, 0x2a420575

    xor-int v0, v0, v20

    const v20, 0x3225d4a3

    :goto_5
    xor-int v20, v1, v20

    goto/16 :goto_7

    :sswitch_9
    move/from16 v3, p7

    .line 733
    invoke-static/range {p2 .. p2}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result v0

    int-to-float v0, v0

    invoke-static/range {p9 .. p9}, Ll/ۖ۫;->ۜ᩵ۨ(Ljava/lang/Object;)F

    move-result v1

    const v4, 0x3ed70a3d    # 0.42f

    mul-float v1, v1, v4

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v4

    const/high16 v0, 0x40800000    # 4.0f

    .line 734
    invoke-static {v0}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result v0

    int-to-float v5, v0

    sget v0, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-eqz v0, :cond_7

    goto/16 :goto_a

    :cond_7
    const-string v0, "\u1a74\u05a1"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v17, v0

    mul-int/lit8 v0, v0, 0x11

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x136b

    const v20, -0x4cd2c4d0

    xor-int v1, v1, v20

    const v20, 0x2d613ff1

    goto/16 :goto_b

    :sswitch_a
    move/from16 v3, p7

    const/high16 v0, 0x40400000    # 3.0f

    .line 732
    invoke-static {v0}, Ll/֫ܿ;->ۡ۫֨(F)I

    move-result v0

    int-to-float v0, v0

    invoke-static/range {p9 .. p9}, Ll/ۛ;->ۘܺ᩸(Ljava/lang/Object;)F

    move-result v1

    const v2, 0x3e4ccccd    # 0.2f

    mul-float v1, v1, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->max(FF)F

    move-result v2

    sget v1, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v1, :cond_8

    const/high16 v0, 0x40c00000    # 6.0f

    :goto_6
    const-string v1, "\u05ab\u1a7b"

    invoke-static {v1}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    mul-int/lit8 v1, v1, -0x9

    move/from16 p2, v0

    xor-int v0, v1, v18

    mul-int/lit16 v0, v0, -0x6553

    const v20, -0xe841deb

    xor-int v0, v0, v20

    const v20, 0x366163e6

    goto :goto_5

    :cond_8
    const-string v1, "\u0733\u06e1"

    invoke-static {v1}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v1

    xor-int v1, v1, v17

    xor-int v0, v1, v18

    mul-int/lit16 v0, v0, -0x4b3d

    const v20, 0x636c5181

    xor-int v0, v0, v20

    const v20, 0x5ced2a52

    xor-int v20, v1, v20

    const/high16 p2, 0x40c00000    # 6.0f

    :goto_7
    move v1, v0

    goto/16 :goto_c

    :sswitch_b
    move/from16 v3, p7

    .line 152
    sget v0, Ll/ۗۚ;->ܶۛᩴ:I

    if-ltz v0, :cond_9

    goto/16 :goto_a

    :cond_9
    const-string v0, "\u073d\u06e0"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x39e9

    const v20, 0x66d6a70d

    xor-int v1, v1, v20

    const v20, -0x7550be8c

    goto/16 :goto_b

    :sswitch_c
    move/from16 v3, p7

    .line 232
    sget v0, Ll/֫᩵;->ܶ᩻᩷:I

    if-gtz v0, :cond_a

    :goto_8
    const-string v0, "\u06d9\u1a7a"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    add-int v0, v0, v18

    mul-int/lit8 v0, v0, -0x21

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x70df

    const v20, -0x3d704381

    xor-int v1, v1, v20

    const v20, 0x7ed3d71a

    goto/16 :goto_b

    :cond_a
    const-string v0, "\u1a79\u06e4"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x70a3

    const v20, 0x120d1e45

    xor-int v1, v1, v20

    const v20, -0x161d488e

    goto/16 :goto_b

    :sswitch_d
    move/from16 v3, p7

    sget v0, Ll/ۗ᩵;->֫۠۟:I

    if-ltz v0, :cond_b

    :goto_9
    const-string v0, "\u073d\u1a78"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v18

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x35b9

    const v20, 0x33c27ced

    xor-int v1, v1, v20

    const v20, 0x6a62285

    goto :goto_b

    :cond_b
    const-string v0, "\u06d8\u06e7"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, 0x15

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x3d9b

    const v20, 0xf94f429

    xor-int v1, v1, v20

    const v20, 0x550a5286    # 9.50544E12f

    goto :goto_b

    :sswitch_e
    move/from16 v3, p7

    if-nez v16, :cond_c

    :goto_a
    const-string v0, "\u06d9\u06ec"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x19

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, 0x3a4d

    const v20, 0x53a3a525

    xor-int v1, v1, v20

    const v20, -0x12b50a01

    goto :goto_b

    :cond_c
    const-string v0, "\u073d\u1a76"

    invoke-static {v0}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v0

    xor-int v0, v0, v17

    mul-int/lit8 v0, v0, 0x1d

    xor-int v1, v0, v18

    mul-int/lit16 v1, v1, 0x1427

    const v20, -0x5bd811d3

    xor-int v1, v1, v20

    const v20, -0x6e4de3ee

    goto :goto_b

    :sswitch_f
    move/from16 v3, p7

    .line 603
    sget-boolean v16, Ll/֨ۡ;->ܶᩴ᩶:Z

    const-string v0, "\u06df\u05ab"

    invoke-static {v0}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v0

    sub-int v0, v18, v0

    mul-int/lit8 v0, v0, -0x5

    xor-int v1, v0, v17

    mul-int/lit16 v1, v1, -0x3529

    const v20, 0x78e8c216

    xor-int v1, v1, v20

    const v20, -0xc2009da

    :goto_b
    xor-int v20, v0, v20

    :goto_c
    move-object/from16 v0, p0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7e3f8b95 -> :sswitch_6
        -0x6904cf07 -> :sswitch_a
        -0x608e0dd4 -> :sswitch_4
        -0x5b295156 -> :sswitch_f
        -0x530c73f6 -> :sswitch_e
        -0x38a312f1 -> :sswitch_b
        -0x253777bf -> :sswitch_d
        -0x212d058d -> :sswitch_7
        -0x15aed2d2 -> :sswitch_3
        -0x133011c7 -> :sswitch_d
        -0xf75a96e -> :sswitch_4
        -0xa77de4d -> :sswitch_9
        -0x93053f8 -> :sswitch_3
        -0x532374d -> :sswitch_0
        0x968364e -> :sswitch_6
        0xcf16e94 -> :sswitch_5
        0xd3942b5 -> :sswitch_0
        0x10e5260a -> :sswitch_e
        0x203e183c -> :sswitch_5
        0x24d1d60d -> :sswitch_b
        0x254f7b73 -> :sswitch_c
        0x25e89bc8 -> :sswitch_2
        0x369485f4 -> :sswitch_2
        0x373d9328 -> :sswitch_8
        0x4423511a -> :sswitch_f
        0x5556acbb -> :sswitch_8
        0x59945a14 -> :sswitch_7
        0x66585347 -> :sswitch_a
        0x7250adaa -> :sswitch_9
        0x77d96f78 -> :sswitch_1
        0x7c582075 -> :sswitch_c
        0x7f6389f9 -> :sswitch_1
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

    const v3, 0x483b4905

    sget v4, Ll/ۗ᩺;->ۡ᩺֡:I

    sget v5, Ll/ۛ;->᩺᩻֫:I

    const-string v6, "\u06e7\u06ec"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0xb

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x29ab

    const v8, -0x53c4bf55

    xor-int/2addr v7, v8

    const v8, 0x1ecaa5b6

    :goto_0
    xor-int/2addr v6, v8

    xor-int/2addr v3, v4

    mul-int/lit16 v3, v3, -0x6b57

    shr-int/lit8 v3, v3, 0x1f

    and-int/2addr v3, v7

    xor-int/2addr v3, v6

    sparse-switch v3, :sswitch_data_0

    if-eqz p5, :cond_4

    const-string v6, "\u0730\u06e0"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x61

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4bf7

    const v8, 0x1ea598c3

    xor-int/2addr v7, v8

    const v8, 0x25059201

    goto :goto_0

    .line 262
    :sswitch_0
    invoke-static {}, Ll/֫ܺ;->ܽᩴ֨()I

    move-result v6

    if-ltz v6, :cond_5

    goto/16 :goto_4

    :sswitch_1
    sget v6, Ll/֡ۜ;->᩺᩷ᩳ:I

    if-nez v6, :cond_c

    goto/16 :goto_4

    :sswitch_2
    invoke-static {}, Ll/ۘܿ;->᩺᩸۠()I

    move-result v6

    if-gtz v6, :cond_a

    goto/16 :goto_1

    :sswitch_3
    invoke-static {}, Ll/ۘۛ;->ᩴۡۡ()I

    invoke-static {}, Ll/۠;->ܿ۠۠()I

    goto/16 :goto_1

    .line 176
    :sswitch_4
    invoke-static {}, Ll/ۘۨ;->ۢۖ᩸()I

    const/4 p1, 0x0

    return p1

    .line 718
    :sswitch_5
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->top:I

    .line 719
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto/16 :goto_2

    .line 715
    :sswitch_6
    invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v2

    .line 716
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    .line 717
    iget v6, v2, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    iput v6, p5, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    .line 618
    sget v6, Ll/֨ۤ;->ܿۖ᩵:I

    if-ltz v6, :cond_0

    goto/16 :goto_5

    :cond_0
    const-string v6, "\u1a78\u06d7"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x9

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2331

    const v8, 0x27cc53af

    xor-int/2addr v7, v8

    const v8, 0x344b82b7

    goto :goto_0

    .line 722
    :sswitch_7
    invoke-static {v0, v1}, Ll/ۘۨ;->᩺۬֨(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x2

    add-int/2addr p1, p4

    return p1

    :sswitch_8
    invoke-static {p1}, Ll/ۛ;->ۘܺ᩸(Ljava/lang/Object;)F

    move-result v1

    const v6, 0x3e0f5c29    # 0.14f

    mul-float v1, v1, v6

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_1
    const-string v6, "\u05ab\u073d"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v4, v6

    mul-int/lit8 v6, v6, 0x41

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x4b75

    const v8, -0x1f391c5f

    xor-int/2addr v7, v8

    const v8, 0x6ee00951

    goto/16 :goto_0

    .line 721
    :sswitch_9
    invoke-static {p3}, Ljava/lang/Math;->round(F)I

    move-result p4

    invoke-static {p2, p4}, Ll/֡ۜ;->۟᩻۠(II)I

    move-result p4

    const/high16 v0, 0x40800000    # 4.0f

    .line 722
    invoke-static {v0}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result v0

    .line 541
    invoke-static {}, Ll/֨֫;->֡֫ۙ()I

    move-result v6

    if-eqz v6, :cond_2

    goto/16 :goto_3

    :cond_2
    const-string v6, "\u1a78\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    add-int/2addr v6, v5

    mul-int/lit8 v6, v6, 0x23

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x228f

    const v8, 0x6dad4fc9

    xor-int/2addr v7, v8

    const v8, 0x2504082    # 1.5299939E-37f

    goto/16 :goto_0

    :sswitch_a
    const/high16 p2, 0x40400000    # 3.0f

    .line 721
    invoke-static {p2}, Ll/֨ᩴ;->᩹֨ۡ(F)I

    move-result p2

    invoke-static {p1}, Ll/ۛ;->ۘܺ᩸(Ljava/lang/Object;)F

    move-result p3

    const v6, 0x3e4ccccd    # 0.2f

    mul-float p3, p3, v6

    sget v6, Ll/֡۬;->۠֡᩶:I

    if-gtz v6, :cond_3

    :goto_1
    const-string v6, "\u05a8\u073f"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, 0x3f

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x3bad

    const v8, 0xe1a2841

    xor-int/2addr v7, v8

    const v8, 0x6de13aef

    goto/16 :goto_0

    :cond_3
    const-string v6, "\u05a8\u0733"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, -0x5d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x3a23

    const v8, -0x3793ac22    # -241999.47f

    xor-int/2addr v7, v8

    const v8, 0x55709b8b

    goto/16 :goto_0

    :cond_4
    :goto_2
    const-string v6, "\u1a74\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x20e9

    const v8, 0x5d4d1650

    xor-int/2addr v7, v8

    const v8, -0x229f1f4f

    goto/16 :goto_0

    .line 469
    :sswitch_b
    invoke-static {}, Ll/֡ܶ;->ۘ֫ۨ()Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    const-string v6, "\u06db\u1a74"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x6539

    const v8, 0x3a9f4030

    xor-int/2addr v7, v8

    const v8, -0x42ecb25f

    goto/16 :goto_0

    :cond_6
    const-string v6, "\u0736\u1a74"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x59

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, -0x1a1b

    const v8, -0x1a335c57

    xor-int/2addr v7, v8

    const v8, -0x4be07819

    goto/16 :goto_0

    .line 255
    :sswitch_c
    sget-boolean v6, Ll/֨۫;->۬᩷᩶:Z

    if-nez v6, :cond_7

    goto :goto_4

    :cond_7
    const-string v6, "\u06eb\u06e7"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x45

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x1fb5

    const v8, -0x4f3991ab

    xor-int/2addr v7, v8

    const v8, -0x1a37d5aa

    goto/16 :goto_0

    :sswitch_d
    sget v6, Ll/֫᩹;->᩶ۘۘ:I

    if-eqz v6, :cond_8

    goto :goto_3

    :cond_8
    const-string v6, "\u06db\u0736"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    mul-int/lit8 v6, v6, -0x2b

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, -0x2b5

    const v8, -0x48e88908    # -9.028001E-6f

    xor-int/2addr v7, v8

    const v8, -0x1c2bf8b3

    goto/16 :goto_0

    .line 73
    :sswitch_e
    sget v6, Ll/֨۟;->᩹֫᩷:I

    if-eqz v6, :cond_9

    :goto_3
    const-string v6, "\u05a8\u06e0"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v5

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x773

    const v8, 0x44ffbc2a

    xor-int/2addr v7, v8

    const v8, 0x6cc4b4e2

    goto/16 :goto_0

    :cond_9
    const-string v6, "\u1a77\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x44b9

    const v8, 0x14dbbc4d

    xor-int/2addr v7, v8

    const v8, -0x4c227bb3

    goto/16 :goto_0

    .line 528
    :sswitch_f
    invoke-static {}, Ll/᩺;->᩵ܿܳ()I

    move-result v6

    if-eqz v6, :cond_b

    :cond_a
    :goto_4
    const-string v6, "\u1a7a\u06dc"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x276d

    const v8, 0x14ec162

    xor-int/2addr v7, v8

    const v8, -0x14762976

    goto/16 :goto_0

    :cond_b
    const-string v6, "\u1a7b\u073f"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x3d

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x7e8f

    const v8, -0x706302d6

    xor-int/2addr v7, v8

    const v8, -0x22a0e094

    goto/16 :goto_0

    .line 553
    :sswitch_10
    invoke-static {}, Ll/ۖ;->ۨۙ᩹()Z

    move-result v6

    if-eqz v6, :cond_d

    :cond_c
    :goto_5
    const-string v6, "\u0733\u05ab"

    invoke-static {v6}, Ll/֡᩶;->ۜ۟ۤ(Ljava/lang/Object;)I

    move-result v6

    xor-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0x73

    xor-int v7, v6, v5

    mul-int/lit16 v7, v7, 0x6d23

    const v8, 0x49c8ad29

    xor-int/2addr v7, v8

    const v8, -0x2c58c91b

    goto/16 :goto_0

    :cond_d
    const-string v6, "\u073d\u06d6"

    invoke-static {v6}, Ll/֫᩹;->ܶܺ֨(Ljava/lang/Object;)I

    move-result v6

    sub-int v6, v5, v6

    mul-int/lit8 v6, v6, -0x33

    xor-int v7, v6, v4

    mul-int/lit16 v7, v7, 0x5f39

    const v8, -0x3dec43fb

    xor-int/2addr v7, v8

    const v8, -0x72759762

    goto/16 :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7e0cdd73 -> :sswitch_0
        -0x66f993e9 -> :sswitch_10
        -0x65084398 -> :sswitch_9
        -0x62988e01 -> :sswitch_5
        -0x5be96405 -> :sswitch_1
        -0x3bb357ef -> :sswitch_c
        -0x3a55a465 -> :sswitch_c
        -0x32abc5d6 -> :sswitch_9
        -0x30f1c62d -> :sswitch_6
        -0x2fad7e14 -> :sswitch_10
        -0x2c383732 -> :sswitch_5
        -0x20b520c8 -> :sswitch_0
        -0x1adbb08d -> :sswitch_2
        -0xa6827f1 -> :sswitch_b
        0xd853caf -> :sswitch_4
        0x202f022c -> :sswitch_4
        0x2402955a -> :sswitch_e
        0x2db0377d -> :sswitch_a
        0x2fc77941 -> :sswitch_8
        0x3054fba4 -> :sswitch_a
        0x33b8f798 -> :sswitch_f
        0x3a33e162 -> :sswitch_3
        0x4afe3a2f -> :sswitch_d
        0x4cee825f -> :sswitch_e
        0x5017b471 -> :sswitch_f
        0x5024830f -> :sswitch_1
        0x512da209 -> :sswitch_7
        0x527435bb -> :sswitch_6
        0x54444635 -> :sswitch_b
        0x6267b3af -> :sswitch_d
        0x62d5b373 -> :sswitch_7
        0x6caad6f4 -> :sswitch_8
        0x7dcc1553 -> :sswitch_3
        0x7f339039 -> :sswitch_2
    .end sparse-switch
.end method
