.class public final Ll/۟ۢܿ;
.super Ljava/lang/Object;
.source "Z6ZC"


# instance fields
.field public ֫:Ll/۬ۢܿ;

.field public ۜ:I

.field public ۡ:I

.field public ۢ:I

.field public ۧ:Z

.field public ܳ:I

.field public final ܺ:Ll/᩶ۖܿ;

.field public final ܽ:Ll/᩻ۢܿ;

.field public final ܿ:Ll/ᩳۖܿ;

.field public final ᩳ:Ll/᩶ۖܿ;

.field public ᩷:F

.field public final ᩻:Ll/ܰۢܿ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 22
    iput v0, p0, Ll/۟ۢܿ;->᩷:F

    const/4 v0, -0x1

    .line 24
    iput v0, p0, Ll/۟ۢܿ;->ۡ:I

    .line 25
    iput v0, p0, Ll/۟ۢܿ;->ۢ:I

    .line 28
    new-instance v0, Ll/ᩳۖܿ;

    invoke-direct {v0}, Ll/ᩳۖܿ;-><init>()V

    iput-object v0, p0, Ll/۟ۢܿ;->ܿ:Ll/ᩳۖܿ;

    .line 29
    new-instance v0, Ll/ܰۢܿ;

    invoke-direct {v0, p0}, Ll/ܰۢܿ;-><init>(Ll/۟ۢܿ;)V

    iput-object v0, p0, Ll/۟ۢܿ;->᩻:Ll/ܰۢܿ;

    .line 59
    new-instance v0, Ll/᩶ۖܿ;

    invoke-direct {v0}, Ll/᩶ۖܿ;-><init>()V

    iput-object v0, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    .line 61
    new-instance v0, Ll/᩶ۖܿ;

    invoke-direct {v0}, Ll/᩶ۖܿ;-><init>()V

    iput-object v0, p0, Ll/۟ۢܿ;->ᩳ:Ll/᩶ۖܿ;

    .line 78
    new-instance v0, Ll/᩻ۢܿ;

    .line 155
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 78
    iput-object v0, p0, Ll/۟ۢܿ;->ܽ:Ll/᩻ۢܿ;

    return-void
.end method

.method public static ֫(ILandroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFFFILandroid/graphics/Paint;Ll/᩺֫ܿ;[I)F
    .locals 17

    move/from16 v0, p0

    move/from16 v7, p3

    move/from16 v8, p4

    move-object/from16 v9, p10

    move-object/from16 v10, p12

    .line 521
    invoke-virtual {v9, v0}, Landroid/graphics/Paint;->setColor(I)V

    move/from16 v1, p9

    int-to-float v1, v1

    sub-float v1, v1, p5

    const/4 v2, 0x0

    .line 522
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    move-result v11

    move-object/from16 v1, p11

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p8

    move v6, v11

    .line 523
    invoke-virtual/range {v1 .. v6}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFF)F

    move-result v12

    move/from16 v1, p6

    float-to-int v1, v1

    int-to-float v13, v1

    move/from16 v1, p7

    float-to-int v1, v1

    int-to-float v14, v1

    add-float v4, p5, v12

    move-object/from16 v1, p1

    move/from16 v2, p5

    move v3, v13

    move v5, v14

    move-object/from16 v6, p10

    .line 526
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v15, 0x1

    .line 528
    :goto_0
    array-length v2, v10

    if-ge v15, v2, :cond_4

    .line 529
    aget v6, v10, v15

    add-int/lit8 v2, v15, 0x1

    .line 530
    aget v5, v10, v2

    if-eq v6, v5, :cond_3

    if-le v5, v7, :cond_3

    if-lt v6, v8, :cond_0

    goto/16 :goto_3

    :cond_0
    if-nez v1, :cond_1

    const/16 v16, 0x0

    move-object/from16 v1, p11

    move-object/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move/from16 p6, v15

    move v15, v5

    move/from16 v5, p8

    move/from16 p7, v14

    move v14, v6

    move-object/from16 v6, v16

    .line 766
    invoke-virtual/range {v1 .. v6}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFLl/ᩳܺܿ;)Ll/ۜ۫ۡ;

    move-result-object v1

    goto :goto_1

    :cond_1
    move/from16 p7, v14

    move/from16 p6, v15

    move v15, v5

    move v14, v6

    :goto_1
    move-object v6, v1

    .line 536
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-virtual {v6, v11, v1}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result v1

    cmpl-float v2, v1, v12

    if-ltz v2, :cond_2

    move-object v14, v6

    goto :goto_2

    .line 540
    :cond_2
    invoke-static {v8, v15}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v6, v11, v2}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result v2

    const/4 v3, 0x0

    .line 541
    aget v3, v10, v3

    const v4, 0x3f333333    # 0.7f

    invoke-static {v0, v3, v4}, Ll/۟ۗ;->֫(IIF)I

    move-result v3

    invoke-virtual {v9, v3}, Landroid/graphics/Paint;->setColor(I)V

    add-float v3, p5, v1

    add-float v4, p5, v2

    move-object/from16 v1, p1

    move v2, v3

    move v3, v13

    move/from16 v5, p7

    move-object v14, v6

    move-object/from16 v6, p10

    .line 542
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    :goto_2
    move-object v1, v14

    goto :goto_4

    :cond_3
    :goto_3
    move/from16 p7, v14

    move/from16 p6, v15

    :goto_4
    add-int/lit8 v15, p6, 0x2

    move/from16 v14, p7

    goto :goto_0

    :cond_4
    return v12
.end method

.method private ֫(Ll/᩺֫ܿ;Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F
    .locals 23

    move-object/from16 v1, p0

    move/from16 v0, p4

    move/from16 v2, p5

    move-object/from16 v15, p11

    .line 270
    iget-object v3, v1, Ll/۟ۢܿ;->֫:Ll/۬ۢܿ;

    if-eqz v3, :cond_c

    .line 271
    iget v14, v3, Ll/۬ۢܿ;->ۧ:I

    iget v13, v3, Ll/۬ۢܿ;->ܽ:I

    if-ge v13, v2, :cond_c

    if-le v14, v0, :cond_c

    iget v4, v1, Ll/۟ۢܿ;->ۡ:I

    if-gt v4, v0, :cond_0

    iget v4, v1, Ll/۟ۢܿ;->ۢ:I

    if-gt v2, v4, :cond_0

    goto/16 :goto_a

    .line 276
    :cond_0
    invoke-virtual/range {p11 .. p11}, Landroid/graphics/Paint;->getColor()I

    move-result v12

    .line 278
    iget-object v3, v3, Ll/۬ۢܿ;->֫:Ll/ۢۖܿ;

    iget-object v11, v1, Ll/۟ۢܿ;->ܿ:Ll/ᩳۖܿ;

    invoke-virtual {v11, v3}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    const/4 v3, 0x0

    move v6, v0

    const/4 v0, 0x0

    :goto_0
    if-ge v6, v2, :cond_b

    add-float v8, p6, v0

    move/from16 v10, p9

    int-to-float v3, v10

    cmpg-float v3, v8, v3

    if-gtz v3, :cond_b

    if-ge v6, v13, :cond_1

    const/4 v3, 0x0

    move v4, v12

    move v9, v13

    goto :goto_2

    :cond_1
    if-ge v6, v14, :cond_5

    .line 287
    :try_start_0
    iget v3, v1, Ll/۟ۢܿ;->ۡ:I

    if-gt v3, v6, :cond_2

    iget v3, v1, Ll/۟ۢܿ;->ۢ:I

    if-ge v6, v3, :cond_2

    .line 288
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    move v9, v3

    move v4, v12

    const/4 v3, 0x0

    goto :goto_2

    :cond_2
    sub-int v3, v6, v13

    .line 290
    invoke-virtual {v11, v3}, Ll/ᩳۖܿ;->֫(I)Z

    .line 291
    invoke-virtual {v11}, Ll/ᩳۖܿ;->֫()I

    move-result v3

    add-int/2addr v3, v13

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 292
    iget v4, v1, Ll/۟ۢܿ;->ۡ:I

    if-ge v6, v4, :cond_3

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    .line 293
    :cond_3
    invoke-virtual {v11}, Ll/ᩳۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v4

    if-eq v4, v12, :cond_4

    .line 294
    iget v5, v1, Ll/۟ۢܿ;->ܳ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eq v4, v5, :cond_4

    const/4 v5, 0x1

    goto :goto_1

    :cond_4
    const/4 v5, 0x0

    :goto_1
    move v9, v3

    move v3, v5

    goto :goto_2

    :catchall_0
    move-exception v0

    move-object/from16 v19, v11

    move v2, v12

    move-object v1, v15

    goto/16 :goto_9

    :cond_5
    const/4 v3, 0x0

    move v9, v2

    move v4, v12

    .line 297
    :goto_2
    :try_start_1
    invoke-virtual {v15, v4}, Landroid/graphics/Paint;->setColor(I)V

    if-eqz v3, :cond_8

    .line 299
    iget-boolean v3, v1, Ll/۟ۢܿ;->ۧ:Z

    if-nez v3, :cond_8

    add-float v16, p10, v0

    if-nez p13, :cond_7

    if-ge v9, v2, :cond_6

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    const/16 v17, 0x0

    goto :goto_4

    :cond_7
    :goto_3
    const/4 v3, 0x1

    const/16 v17, 0x1

    .line 300
    :goto_4
    iget-object v7, v1, Ll/۟ۢܿ;->᩻:Ll/ܰۢܿ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v18, v7

    move v7, v9

    move v1, v9

    move/from16 v9, p7

    move/from16 v10, p8

    move-object/from16 v19, v11

    move/from16 v11, p9

    move/from16 v20, v12

    move/from16 v12, v16

    move/from16 v21, v13

    move-object/from16 v13, p11

    move/from16 v22, v14

    move/from16 v14, p12

    move/from16 v15, v17

    move-object/from16 v16, v18

    :try_start_2
    invoke-virtual/range {v3 .. v16}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZLl/ܰۢܿ;)F

    move-result v3

    goto :goto_7

    :catchall_1
    move-exception v0

    goto :goto_8

    :cond_8
    move v1, v9

    move-object/from16 v19, v11

    move/from16 v20, v12

    move/from16 v21, v13

    move/from16 v22, v14

    add-float v12, p10, v0

    if-nez p13, :cond_a

    if-ge v1, v2, :cond_9

    goto :goto_5

    :cond_9
    const/4 v3, 0x0

    const/4 v15, 0x0

    goto :goto_6

    :cond_a
    :goto_5
    const/4 v3, 0x1

    const/4 v15, 0x1

    :goto_6
    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move v7, v1

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    move-object/from16 v13, p11

    move/from16 v14, p12

    .line 303
    invoke-virtual/range {v3 .. v15}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :goto_7
    add-float/2addr v0, v3

    move-object/from16 v15, p11

    move v6, v1

    move-object/from16 v11, v19

    move/from16 v12, v20

    move/from16 v13, v21

    move/from16 v14, v22

    move-object/from16 v1, p0

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    move-object/from16 v19, v11

    move/from16 v20, v12

    :goto_8
    move-object/from16 v1, p11

    move/from16 v2, v20

    .line 310
    :goto_9
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 311
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v1

    move-object/from16 v3, v19

    invoke-virtual {v3, v1}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 312
    throw v0

    :cond_b
    move-object v3, v11

    move v2, v12

    move-object v1, v15

    .line 310
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 311
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ᩳۖܿ;->֫(Ll/ۢۖܿ;)V

    return v0

    :cond_c
    :goto_a
    move-object v1, v15

    .line 273
    invoke-virtual/range {p1 .. p13}, Ll/ۢ۫ۡ;->֫(Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    move-result v0

    return v0
.end method

.method public static ֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;
    .locals 8

    .line 481
    invoke-virtual {p0}, Ll/᩸᩷ܿ;->ۜ()I

    move-result v0

    const/high16 v1, -0x1000000

    and-int/2addr v0, v1

    const/high16 v2, 0x6000000

    if-eq v0, v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 485
    :cond_0
    invoke-virtual {p0}, Ll/᩸᩷ܿ;->ܽ()I

    move-result v0

    or-int v3, v0, v1

    .line 486
    invoke-virtual {p0}, Ll/᩸᩷ܿ;->ᩴ()I

    move-result p0

    or-int v5, p0, v1

    const/4 v7, 0x0

    const/4 v2, 0x0

    const v4, 0x161616

    const v6, 0x161616

    .line 163
    invoke-static/range {v2 .. v7}, Ll/᩸᩷ܿ;->֫(Ljava/lang/String;IIIII)Ll/᩸᩷ܿ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V
    .locals 0

    if-nez p1, :cond_0

    .line 497
    invoke-static {}, Ll/ۢۖܿ;->ܽ()Ll/ۢۖܿ;

    move-result-object p1

    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶ۖܿ;->֫(Ll/ۢۖܿ;)V

    return-void
.end method

.method public static ֫(Ll/۟ۢܿ;Landroid/graphics/Canvas;FFFFLjava/lang/Runnable;)Z
    .locals 2

    .line 318
    invoke-interface {p6}, Ljava/lang/Runnable;->run()V

    .line 319
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result p6

    float-to-double v0, p2

    .line 321
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p2, v0

    float-to-double v0, p3

    invoke-static {v0, v1}, Ljava/lang/Math;->floor(D)D

    move-result-wide v0

    double-to-float p3, v0

    float-to-double v0, p4

    .line 322
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p4, v0

    float-to-double v0, p5

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-float p5, v0

    .line 321
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/graphics/Canvas;->clipRect(FFFF)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    .line 323
    iput-boolean p2, p0, Ll/۟ۢܿ;->ۧ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    :cond_0
    invoke-virtual {p1, p6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 328
    iget-boolean p0, p0, Ll/۟ۢܿ;->ۧ:Z

    return p0

    :catchall_0
    move-exception p0

    .line 326
    invoke-virtual {p1, p6}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 327
    throw p0
.end method

.method public static ֫(Ll/᩶ۖܿ;II)Z
    .locals 1

    .line 503
    :try_start_0
    invoke-virtual {p0, p1}, Ll/᩶ۖܿ;->֫(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 506
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۖܿ;->֫()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 507
    invoke-virtual {p0}, Ll/᩶ۖܿ;->ܿ()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-eq p1, p2, :cond_2

    .line 511
    invoke-virtual {p0}, Ll/᩶ۖܿ;->֫()I

    move-result p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-lt p0, p2, :cond_3

    :cond_2
    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_3
    :goto_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final ֫(Ll/ۢۖܿ;Ljava/lang/CharSequence;IIFLl/ۢ۫ۡ;)F
    .locals 3

    .line 491
    iget-object v0, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    invoke-static {v0, p1}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    .line 184
    :try_start_0
    invoke-virtual {v0, p3}, Ll/᩶ۖܿ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result p1

    if-lt p1, p4, :cond_0

    goto :goto_1

    .line 187
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result p1

    invoke-virtual {p6, p2, p3, p1, p5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIF)F

    move-result p1

    .line 189
    :goto_0
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܿ()Z

    move-result p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p3, :cond_1

    .line 203
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return p1

    .line 192
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result p3

    if-ge p3, p4, :cond_2

    .line 194
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ۧ()I

    move-result p3

    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result v1

    add-float v2, p5, p1

    .line 193
    invoke-virtual {p6, p2, p3, v1, v2}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIF)F

    move-result p3

    add-float/2addr p1, p3

    goto :goto_0

    .line 197
    :cond_2
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ۧ()I

    move-result p3

    add-float/2addr p5, p1

    .line 196
    invoke-virtual {p6, p2, p3, p4, p5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIF)F

    move-result p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-float/2addr p1, p2

    .line 203
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return p1

    .line 185
    :cond_3
    :goto_1
    :try_start_2
    invoke-virtual {p6, p2, p3, p4, p5}, Ll/ۢ۫ۡ;->ۧ(Ljava/lang/CharSequence;IIF)F

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 203
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    .line 204
    throw p1
.end method

.method public final ֫(IILl/ۢۖܿ;)J
    .locals 6

    .line 491
    iget-object v0, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    invoke-static {v0, p3}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    .line 101
    :try_start_0
    invoke-static {v0, p1, p1}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;II)Z

    move-result p3

    const-wide v1, 0xffffffffL

    if-nez p3, :cond_0

    int-to-long p1, p2

    goto :goto_2

    .line 104
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ۧ()I

    move-result p3

    .line 105
    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result v3

    .line 106
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸᩷ܿ;->ۜ()I

    move-result v4

    invoke-static {v4, p2}, Ll/۟۫ۡ;->ۧ(II)I

    move-result v4

    const/16 v5, 0x20

    if-ne p1, p3, :cond_3

    .line 108
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܳ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 109
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۜ()I

    move-result p1

    invoke-static {p1, p2}, Ll/۟۫ۡ;->ۧ(II)I

    move-result p1

    if-ne p1, v4, :cond_1

    goto :goto_1

    :cond_1
    int-to-long p1, p1

    goto :goto_0

    :cond_2
    if-eq v4, p2, :cond_4

    int-to-long p1, p2

    :goto_0
    and-long/2addr p1, v1

    int-to-long v3, v4

    and-long/2addr v1, v3

    shl-long/2addr v1, v5

    or-long/2addr p1, v1

    goto :goto_3

    :cond_3
    if-eq v4, p2, :cond_4

    if-ne p1, v3, :cond_4

    .line 118
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܿ()Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_4

    int-to-long v3, v4

    and-long/2addr v3, v1

    int-to-long p1, p2

    and-long/2addr p1, v1

    shl-long/2addr p1, v5

    or-long/2addr p1, v3

    goto :goto_3

    :cond_4
    :goto_1
    int-to-long p1, v4

    :goto_2
    and-long/2addr p1, v1

    .line 123
    :goto_3
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return-wide p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    .line 124
    throw p1
.end method

.method public final ֫(Ll/ۜۢܿ;Ljava/lang/CharSequence;II)Ll/᩸᩷ܿ;
    .locals 11

    const-string v0, "text"

    .line 338
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 339
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p1}, Ll/ۜۢܿ;->ۧ()I

    move-result v1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_13

    if-ltz p3, :cond_13

    if-gt p3, p4, :cond_13

    .line 340
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p4, v0, :cond_13

    .line 341
    invoke-virtual {p1, p3, p4}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_6

    :cond_0
    if-ne p3, p4, :cond_7

    .line 450
    invoke-virtual {p1, p3, p3}, Ll/ۜۢܿ;->֫(II)I

    move-result p4

    .line 452
    invoke-virtual {p1, p4}, Ll/ۜۢܿ;->ܽ(I)Ll/ܶۜܿ;

    move-result-object p4

    if-nez p4, :cond_1

    goto :goto_0

    .line 469
    :cond_1
    invoke-virtual {p4}, Ll/ܶۜܿ;->ۜ()Ljava/util/ArrayList;

    move-result-object p4

    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷᩷ܿ;

    .line 470
    invoke-interface {v0, p3, p3, p2}, Ll/᩷᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/᩸᩷ܿ;

    move-result-object v0

    if-eqz v0, :cond_2

    move-object v2, v0

    :cond_3
    :goto_0
    if-nez v2, :cond_6

    .line 453
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-nez p4, :cond_4

    goto :goto_2

    .line 457
    :cond_4
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ge p3, p2, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 p3, p3, -0x1

    .line 458
    :goto_1
    invoke-virtual {p1}, Ll/ۜۢܿ;->֫()Ll/ۢۖܿ;

    move-result-object p1

    invoke-virtual {p1, p3}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۢܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_2
    return-object v2

    .line 348
    :cond_7
    iget-object v0, p0, Ll/۟ۢܿ;->ܽ:Ll/᩻ۢܿ;

    invoke-virtual {v0, p1, p3, p4}, Ll/᩻ۢܿ;->֫(Ll/ۜۢܿ;II)V

    .line 350
    invoke-virtual {p1}, Ll/ۜۢܿ;->֫()Ll/ۢۖܿ;

    move-result-object p3

    .line 491
    iget-object v1, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    invoke-static {v1, p3}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    const/4 v3, -0x1

    const v4, 0x7fffffff

    move-object v5, v2

    .line 357
    :cond_8
    :try_start_0
    invoke-virtual {v0}, Ll/᩻ۢܿ;->ܽ()I

    move-result v6

    .line 358
    invoke-virtual {v0}, Ll/᩻ۢܿ;->֫()I

    move-result v7

    .line 359
    invoke-virtual {v0}, Ll/᩻ۢܿ;->ۧ()I

    move-result v8

    .line 360
    invoke-virtual {p1, v8}, Ll/ۜۢܿ;->ۧ(I)I

    move-result v9

    .line 362
    invoke-virtual {p1, v8}, Ll/ۜۢܿ;->ܽ(I)Ll/ܶۜܿ;

    move-result-object v8

    if-nez v8, :cond_9

    goto :goto_3

    .line 469
    :cond_9
    invoke-virtual {v8}, Ll/ܶۜܿ;->ۜ()Ljava/util/ArrayList;

    move-result-object v8

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩷᩷ܿ;

    .line 470
    invoke-interface {v10, v6, v7, p2}, Ll/᩷᩷ܿ;->֫(IILjava/lang/CharSequence;)Ll/᩸᩷ܿ;

    move-result-object v10

    if-eqz v10, :cond_a

    goto :goto_4

    :cond_b
    :goto_3
    move-object v10, v2

    :goto_4
    if-nez v10, :cond_e

    .line 364
    invoke-virtual {p3, v6, v7}, Ll/ۢۖܿ;->֫(II)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 365
    invoke-virtual {v1, v6}, Ll/᩶ۖܿ;->֫(I)Z

    move-result v8

    if-eqz v8, :cond_e

    .line 367
    :cond_c
    invoke-virtual {v1}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v8

    invoke-static {v8}, Ll/۟ۢܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object v10

    if-nez v10, :cond_e

    .line 368
    invoke-virtual {v1}, Ll/᩶ۖܿ;->֫()I

    move-result v8

    if-lt v8, v7, :cond_d

    goto :goto_5

    .line 371
    :cond_d
    invoke-virtual {v1}, Ll/᩶ۖܿ;->ܿ()Z

    move-result v8

    if-nez v8, :cond_c

    :cond_e
    :goto_5
    if-eqz v10, :cond_10

    if-gt v9, v3, :cond_f

    if-ne v9, v3, :cond_10

    if-ge v6, v4, :cond_10

    :cond_f
    move v4, v6

    move v3, v9

    move-object v5, v10

    .line 380
    :cond_10
    invoke-virtual {v0}, Ll/᩻ۢܿ;->ᩳ()Z

    move-result v6

    if-nez v6, :cond_8

    .line 383
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ge p4, p2, :cond_12

    add-int/lit8 p2, p4, 0x1

    invoke-virtual {p1, p4, p2}, Ll/ۜۢܿ;->ۧ(II)Z

    move-result v2

    if-eqz v2, :cond_12

    .line 384
    invoke-virtual {p3, p4, p2}, Ll/ۢۖܿ;->֫(II)Z

    move-result p2

    if-eqz p2, :cond_12

    .line 385
    invoke-virtual {v1, p4}, Ll/᩶ۖܿ;->֫(I)Z

    move-result p2

    if-eqz p2, :cond_12

    invoke-virtual {v1}, Ll/᩶ۖܿ;->ۧ()I

    move-result p2

    if-ne p2, p4, :cond_12

    .line 386
    invoke-virtual {v1}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p2

    invoke-static {p2}, Ll/۟ۢܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p2

    if-eqz p2, :cond_12

    .line 388
    invoke-virtual {p1, p4}, Ll/ۜۢܿ;->֫(I)I

    move-result p3

    .line 389
    invoke-virtual {p1, p3}, Ll/ۜۢܿ;->ۧ(I)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-gt p1, v3, :cond_11

    if-ne p1, v3, :cond_12

    if-ge p4, v4, :cond_12

    :cond_11
    move-object v5, p2

    .line 397
    :cond_12
    invoke-virtual {v0}, Ll/᩻ۢܿ;->ܿ()V

    .line 398
    invoke-virtual {v1}, Ll/᩶ۖܿ;->᩻()V

    return-object v5

    :catchall_0
    move-exception p1

    .line 397
    invoke-virtual {v0}, Ll/᩻ۢܿ;->ܿ()V

    .line 398
    invoke-virtual {v1}, Ll/᩶ۖܿ;->᩻()V

    .line 399
    throw p1

    :cond_13
    :goto_6
    return-object v2
.end method

.method public final ֫(Ll/ۢۖܿ;Ljava/lang/CharSequence;II)Ll/᩸᩷ܿ;
    .locals 3

    const-string v0, "text"

    .line 409
    invoke-static {p2, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x0

    if-eqz p1, :cond_9

    .line 410
    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-ne v1, v2, :cond_9

    if-ltz p3, :cond_9

    if-gt p3, p4, :cond_9

    .line 411
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-le p4, v1, :cond_0

    goto :goto_3

    :cond_0
    if-ne p3, p4, :cond_3

    .line 415
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p4

    if-nez p4, :cond_1

    goto :goto_3

    .line 418
    :cond_1
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ge p3, p2, :cond_2

    goto :goto_0

    :cond_2
    add-int/lit8 p3, p3, -0x1

    .line 419
    :goto_0
    invoke-virtual {p1, p3}, Ll/ۢۖܿ;->֫(I)Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۢܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1

    return-object p1

    .line 423
    :cond_3
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-ge p4, p2, :cond_4

    add-int/lit8 p2, p4, 0x1

    goto :goto_1

    :cond_4
    move p2, p4

    :goto_1
    invoke-virtual {p1, p3, p2}, Ll/ۢۖܿ;->֫(II)Z

    move-result p2

    if-nez p2, :cond_5

    goto :goto_3

    .line 497
    :cond_5
    iget-object p2, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    invoke-virtual {p2, p1}, Ll/᩶ۖܿ;->֫(Ll/ۢۖܿ;)V

    .line 428
    :try_start_0
    invoke-virtual {p2, p3}, Ll/᩶ۖܿ;->֫(I)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_6

    .line 442
    invoke-virtual {p2}, Ll/᩶ۖܿ;->᩻()V

    return-object v0

    .line 432
    :cond_6
    :try_start_1
    invoke-virtual {p2}, Ll/᩶ۖܿ;->ۧ()I

    move-result p1

    if-le p1, p4, :cond_7

    goto :goto_2

    .line 435
    :cond_7
    invoke-virtual {p2}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-static {p1}, Ll/۟ۢܿ;->֫(Ll/᩸᩷ܿ;)Ll/᩸᩷ܿ;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p1, :cond_8

    .line 442
    invoke-virtual {p2}, Ll/᩶ۖܿ;->᩻()V

    return-object p1

    .line 439
    :cond_8
    :try_start_2
    invoke-virtual {p2}, Ll/᩶ۖܿ;->ܿ()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p1, :cond_6

    .line 442
    :goto_2
    invoke-virtual {p2}, Ll/᩶ۖܿ;->᩻()V

    return-object v0

    :catchall_0
    move-exception p1

    invoke-virtual {p2}, Ll/᩶ۖܿ;->᩻()V

    .line 443
    throw p1

    :cond_9
    :goto_3
    return-object v0
.end method

.method public final ֫(FI)V
    .locals 0

    .line 47
    iput p2, p0, Ll/۟ۢܿ;->ۜ:I

    .line 48
    iput p1, p0, Ll/۟ۢܿ;->᩷:F

    return-void
.end method

.method public final ֫(Ll/ۢۖܿ;Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFILandroid/graphics/Paint;Ll/᩺֫ܿ;[I)V
    .locals 21

    move/from16 v0, p5

    move-object/from16 v1, p0

    .line 491
    iget-object v2, v1, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    move-object/from16 v3, p1

    invoke-static {v2, v3}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    move/from16 v3, p4

    .line 245
    :try_start_0
    invoke-virtual {v2, v3}, Ll/᩶ۖܿ;->֫(I)Z

    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v4, :cond_0

    .line 263
    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    return-void

    .line 246
    :cond_0
    :try_start_1
    invoke-virtual {v2}, Ll/᩶ۖܿ;->֫()I

    move-result v4

    if-lt v4, v0, :cond_1

    invoke-virtual {v2}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/᩸᩷ܿ;->ۜ()I

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    ushr-int/lit8 v4, v4, 0x18

    if-nez v4, :cond_1

    .line 263
    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    return-void

    :cond_1
    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    if-ge v3, v0, :cond_5

    move/from16 v15, p8

    int-to-float v14, v15

    cmpg-float v7, v6, v14

    if-gtz v7, :cond_5

    .line 249
    :try_start_2
    invoke-virtual {v2}, Ll/᩶ۖܿ;->֫()I

    move-result v7

    invoke-static {v0, v7}, Ljava/lang/Math;->min(II)I

    move-result v13

    .line 250
    invoke-virtual {v2}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v7

    invoke-virtual {v7}, Ll/᩸᩷ܿ;->ۜ()I

    move-result v7

    ushr-int/lit8 v8, v7, 0x18

    if-eqz v8, :cond_2

    move-object/from16 v8, p2

    move-object/from16 v9, p3

    move v10, v3

    move v11, v13

    move v12, v6

    move v3, v13

    move/from16 v13, p6

    move/from16 v20, v14

    move/from16 v14, p7

    move v15, v5

    move/from16 v16, p8

    move-object/from16 v17, p9

    move-object/from16 v18, p10

    move-object/from16 v19, p11

    .line 253
    invoke-static/range {v7 .. v19}, Ll/۟ۢܿ;->֫(ILandroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFFFILandroid/graphics/Paint;Ll/᩺֫ܿ;[I)F

    move-result v7

    move v13, v3

    goto :goto_1

    :cond_2
    move/from16 v20, v14

    sub-float v14, v20, v6

    .line 256
    invoke-static {v4, v14}, Ljava/lang/Math;->max(FF)F

    move-result v12

    move-object/from16 v7, p10

    move-object/from16 v8, p3

    move v9, v3

    move v10, v13

    move v11, v5

    invoke-virtual/range {v7 .. v12}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIFF)F

    move-result v7

    :goto_1
    add-float/2addr v6, v7

    add-float/2addr v5, v7

    cmpl-float v3, v6, v20

    if-gez v3, :cond_4

    if-eq v13, v0, :cond_4

    .line 260
    invoke-virtual {v2}, Ll/᩶ۖܿ;->ܿ()Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move v3, v13

    goto :goto_0

    .line 263
    :cond_4
    :goto_2
    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    return-void

    :cond_5
    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    throw v0
.end method

.method public final ֫(Ll/ۢۖܿ;Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFIILandroid/graphics/Paint;Ll/᩺֫ܿ;)V
    .locals 21

    move-object/from16 v15, p0

    move/from16 v0, p5

    const/4 v1, 0x0

    .line 212
    iput-boolean v1, v15, Ll/۟ۢܿ;->ۧ:Z

    .line 491
    iget-object v14, v15, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    move-object/from16 v1, p1

    invoke-static {v14, v1}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    move/from16 v1, p4

    .line 215
    :try_start_0
    invoke-virtual {v14, v1}, Ll/᩶ۖܿ;->֫(I)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v2, :cond_0

    .line 231
    invoke-virtual {v14}, Ll/᩶ۖܿ;->᩻()V

    return-void

    :cond_0
    const/4 v2, 0x0

    const/4 v3, 0x0

    move v5, v1

    const/16 v16, 0x0

    const/16 v17, 0x0

    .line 219
    :goto_0
    :try_start_1
    invoke-virtual {v14}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v1

    .line 220
    invoke-virtual {v14}, Ll/᩶ۖܿ;->֫()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v13

    if-ge v13, v0, :cond_1

    const/4 v2, 0x1

    const/16 v18, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    const/16 v18, 0x0

    .line 53
    :goto_1
    invoke-virtual {v1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result v2

    .line 54
    iget v3, v15, Ll/۟ۢܿ;->᩷:F

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v4, v3, v4

    if-ltz v4, :cond_2

    goto :goto_2

    .line 55
    :cond_2
    iget v4, v15, Ll/۟ۢܿ;->ۜ:I

    invoke-static {v4, v2, v3}, Ll/۟ۗ;->֫(IIF)I

    move-result v2

    :goto_2
    move-object/from16 v12, p9

    .line 222
    invoke-virtual {v12, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 224
    invoke-virtual {v1}, Ll/᩸᩷ܿ;->᩻()I

    move-result v19
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object/from16 v1, p0

    move-object/from16 v2, p10

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move v6, v13

    move/from16 v7, v16

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, v17

    move-object/from16 v12, p9

    move/from16 v20, v13

    move/from16 v13, v19

    move-object/from16 v19, v14

    move/from16 v14, v18

    .line 223
    :try_start_2
    invoke-direct/range {v1 .. v14}, Ll/۟ۢܿ;->֫(Ll/᩺֫ܿ;Landroid/graphics/Canvas;Ljava/lang/CharSequence;IIFFIIFLandroid/graphics/Paint;IZ)F

    move-result v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v18, :cond_3

    .line 231
    invoke-virtual/range {v19 .. v19}, Ll/᩶ۖܿ;->᩻()V

    return-void

    :cond_3
    add-float v16, v16, v1

    add-float v17, v17, v1

    move/from16 v1, p8

    int-to-float v2, v1

    cmpg-float v2, v16, v2

    if-gtz v2, :cond_5

    .line 229
    :try_start_3
    invoke-virtual/range {v19 .. v19}, Ll/᩶ۖܿ;->ܿ()Z

    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v2, :cond_4

    goto :goto_3

    :cond_4
    move-object/from16 v14, v19

    move/from16 v5, v20

    goto :goto_0

    .line 231
    :cond_5
    :goto_3
    invoke-virtual/range {v19 .. v19}, Ll/᩶ۖܿ;->᩻()V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object/from16 v19, v14

    :goto_4
    invoke-virtual/range {v19 .. v19}, Ll/᩶ۖܿ;->᩻()V

    .line 232
    throw v0
.end method

.method public final ֫(Ll/۬ۢܿ;III)V
    .locals 0

    .line 34
    iput-object p1, p0, Ll/۟ۢܿ;->֫:Ll/۬ۢܿ;

    .line 35
    iput p2, p0, Ll/۟ۢܿ;->ۡ:I

    .line 36
    iput p3, p0, Ll/۟ۢܿ;->ۢ:I

    .line 37
    iput p4, p0, Ll/۟ۢܿ;->ܳ:I

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 42
    iget-boolean v0, p0, Ll/۟ۢܿ;->ۧ:Z

    return v0
.end method

.method public final ֫(Ll/ۢۖܿ;III)Z
    .locals 3

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    if-ltz p3, :cond_2

    if-ge p3, p4, :cond_2

    .line 65
    invoke-virtual {p1}, Ll/ۢۖܿ;->֫()I

    move-result v0

    if-le p4, v0, :cond_0

    goto :goto_0

    .line 66
    :cond_0
    iget-object v0, p0, Ll/۟ۢܿ;->ᩳ:Ll/᩶ۖܿ;

    monitor-enter v0

    .line 67
    :try_start_0
    iget-object v2, p0, Ll/۟ۢܿ;->ᩳ:Ll/᩶ۖܿ;

    .line 497
    invoke-virtual {v2, p1}, Ll/᩶ۖܿ;->֫(Ll/ۢۖܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 69
    :try_start_1
    invoke-virtual {v2, p3}, Ll/᩶ۖܿ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v2}, Ll/᩶ۖܿ;->֫()I

    move-result p1

    if-lt p1, p4, :cond_1

    .line 70
    invoke-virtual {v2}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne p1, p2, :cond_1

    const/4 v1, 0x1

    .line 72
    :cond_1
    :try_start_2
    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    invoke-virtual {v2}, Ll/᩶ۖܿ;->᩻()V

    .line 73
    throw p1

    :catchall_1
    move-exception p1

    .line 74
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    :cond_2
    :goto_0
    return v1
.end method

.method public final ֫(ILl/ۢۖܿ;)[I
    .locals 4

    .line 491
    iget-object v0, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    invoke-static {v0, p2}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    const/4 p2, 0x0

    .line 148
    :try_start_0
    invoke-virtual {v0, p1}, Ll/᩶ۖܿ;->֫(I)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩸᩷ܿ;->ۘ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    .line 151
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ۧ()I

    move-result v1

    .line 152
    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result v2

    .line 153
    :goto_0
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܳ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 154
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩸᩷ܿ;->ۘ()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 155
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ۧ()I

    move-result v1

    goto :goto_0

    .line 160
    :cond_1
    invoke-virtual {v0, p1}, Ll/᩶ۖܿ;->֫(I)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_2

    .line 175
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return-object p2

    .line 163
    :cond_2
    :goto_1
    :try_start_1
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 164
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۘ()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 165
    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result v2

    goto :goto_1

    .line 170
    :cond_3
    filled-new-array {v1, v2}, [I

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 175
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return-object p1

    :cond_4
    :goto_2
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return-object p2

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    .line 176
    throw p1

    .line 175
    :catch_0
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return-object p2
.end method

.method public final ۧ(IILl/ۢۖܿ;)Ll/ܳܺܿ;
    .locals 2

    .line 491
    iget-object v0, p0, Ll/۟ۢܿ;->ܺ:Ll/᩶ۖܿ;

    invoke-static {v0, p3}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V

    .line 133
    :try_start_0
    invoke-static {v0, p1, p2}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;II)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    .line 139
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    const/4 p1, 0x0

    return-object p1

    .line 136
    :cond_0
    :try_start_1
    new-instance p1, Ll/ܳܺܿ;

    .line 137
    invoke-virtual {v0}, Ll/᩶ۖܿ;->ۧ()I

    move-result p2

    invoke-virtual {v0}, Ll/᩶ۖܿ;->֫()I

    move-result p3

    invoke-virtual {v0}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object v1

    invoke-virtual {v0}, Ll/᩶ۖܿ;->ᩳ()Z

    invoke-direct {p1, p2, p3, v1}, Ll/ܳܺܿ;-><init>(IILl/᩸᩷ܿ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 139
    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ll/᩶ۖܿ;->᩻()V

    .line 140
    throw p1
.end method

.method public final ܽ(IILl/ۢۖܿ;)I
    .locals 2

    .line 83
    iget-object v1, p0, Ll/۟ۢܿ;->ᩳ:Ll/᩶ۖܿ;

    move-object v0, v1

    .line 84
    monitor-enter v0

    .line 85
    :try_start_0
    invoke-static {v1, p3}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;Ll/ۢۖܿ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 87
    :try_start_1
    invoke-static {v1, p1, p1}, Ll/۟ۢܿ;->֫(Ll/᩶ۖܿ;II)Z

    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez p1, :cond_0

    .line 92
    :try_start_2
    invoke-virtual {v1}, Ll/᩶ۖܿ;->᩻()V

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return p2

    .line 90
    :cond_0
    :try_start_3
    invoke-virtual {v1}, Ll/᩶ۖܿ;->ܽ()Ll/᩸᩷ܿ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩸᩷ܿ;->ۖ()I

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 92
    :try_start_4
    invoke-virtual {v1}, Ll/᩶ۖܿ;->᩻()V

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Ll/᩶ۖܿ;->᩻()V

    .line 93
    throw p1

    :catchall_1
    move-exception p1

    .line 94
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method
