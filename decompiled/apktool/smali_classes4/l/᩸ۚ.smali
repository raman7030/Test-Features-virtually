.class public final Ll/᩸ۚ;
.super Ljava/lang/Object;
.source "L1CU"


# instance fields
.field public ֫:Landroid/graphics/Rect;

.field public ۖ:Landroid/graphics/Paint;

.field public final synthetic ۘ:Ll/ۤۚ;

.field public ۜ:Landroid/graphics/Path;

.field public ۡ:[F

.field public ۢ:[F

.field public ۧ:Landroid/graphics/Paint;

.field public ܳ:Landroid/graphics/Paint;

.field public ܺ:I

.field public ܽ:I

.field public ܿ:Landroid/graphics/Paint;

.field public ᩳ:[F

.field public ᩷:[I

.field public ᩻:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>(Ll/ۤۚ;)V
    .locals 5

    .line 2568
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ۚ;->ۘ:Ll/ۤۚ;

    .line 2564
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Ll/᩸ۚ;->֫:Landroid/graphics/Rect;

    const/4 v0, 0x1

    .line 2566
    iput v0, p0, Ll/᩸ۚ;->ܺ:I

    .line 2569
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Ll/᩸ۚ;->ܿ:Landroid/graphics/Paint;

    .line 2570
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const/16 v2, -0x55cd

    .line 2571
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v2, 0x40000000    # 2.0f

    .line 2572
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2573
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 2575
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Ll/᩸ۚ;->᩻:Landroid/graphics/Paint;

    .line 2576
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const v4, -0x1f8a66

    .line 2577
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2578
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2579
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 2581
    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    iput-object v1, p0, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    .line 2582
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    const v4, -0xcc5600

    .line 2583
    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2584
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 2585
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 2587
    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V

    iput-object v2, p0, Ll/᩸ۚ;->ۖ:Landroid/graphics/Paint;

    .line 2588
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2589
    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 2590
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    const/high16 v3, 0x41400000    # 12.0f

    mul-float p1, p1, v3

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    const/16 p1, 0x8

    new-array p1, p1, [F

    .line 2591
    iput-object p1, p0, Ll/᩸ۚ;->ۡ:[F

    .line 2592
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    iput-object p1, p0, Ll/᩸ۚ;->ۧ:Landroid/graphics/Paint;

    .line 2593
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 2594
    new-instance p1, Landroid/graphics/DashPathEffect;

    const/4 v0, 0x2

    new-array v0, v0, [F

    fill-array-data v0, :array_0

    const/4 v2, 0x0

    invoke-direct {p1, v0, v2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 2595
    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    const/16 p1, 0x64

    new-array p1, p1, [F

    .line 2596
    iput-object p1, p0, Ll/᩸ۚ;->ᩳ:[F

    const/16 p1, 0x32

    new-array p1, p1, [I

    .line 2597
    iput-object p1, p0, Ll/᩸ۚ;->᩷:[I

    return-void

    :array_0
    .array-data 4
        0x40800000    # 4.0f
        0x41000000    # 8.0f
    .end array-data
.end method

.method private ֫(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    .line 2795
    iget-object v1, v0, Ll/᩸ۚ;->ۢ:[F

    const/4 v2, 0x0

    aget v2, v1, v2

    const/4 v3, 0x1

    .line 2796
    aget v4, v1, v3

    .line 2797
    array-length v5, v1

    add-int/lit8 v5, v5, -0x2

    aget v5, v1, v5

    .line 2798
    array-length v6, v1

    sub-int/2addr v6, v3

    aget v1, v1, v6

    .line 2800
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v7

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v8

    .line 2801
    invoke-static {v2, v5}, Ljava/lang/Math;->max(FF)F

    move-result v9

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v10

    .line 2800
    iget-object v3, v0, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    move-object/from16 v6, p1

    move-object v11, v3

    invoke-virtual/range {v6 .. v11}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 2802
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v12

    invoke-static {v4, v1}, Ljava/lang/Math;->min(FF)F

    move-result v13

    .line 2803
    invoke-static {v2, v5}, Ljava/lang/Math;->min(FF)F

    move-result v14

    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v15

    move-object/from16 v11, p1

    move-object/from16 v16, v3

    .line 2802
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;FF)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 2807
    iget-object v1, v0, Ll/᩸ۚ;->ۢ:[F

    const/4 v8, 0x0

    aget v2, v1, v8

    const/4 v3, 0x1

    .line 2808
    aget v9, v1, v3

    .line 2809
    array-length v4, v1

    add-int/lit8 v4, v4, -0x2

    aget v4, v1, v4

    .line 2810
    array-length v5, v1

    sub-int/2addr v5, v3

    aget v10, v1, v5

    .line 2811
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 2812
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v11

    .line 2813
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v3

    sub-float v3, p2, v3

    .line 2814
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v5

    sub-float v12, v5, p3

    .line 2816
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v13, ""

    invoke-direct {v5, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/high16 v6, 0x42c80000    # 100.0f

    mul-float v14, v3, v6

    sub-float v15, v4, v2

    invoke-static {v15}, Ljava/lang/Math;->abs(F)F

    move-result v15

    div-float/2addr v14, v15

    float-to-double v14, v14

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    add-double v14, v14, v16

    double-to-int v14, v14

    int-to-float v14, v14

    div-float/2addr v14, v6

    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 2791
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    iget-object v14, v0, Ll/᩸ۚ;->ۖ:Landroid/graphics/Paint;

    iget-object v15, v0, Ll/᩸ۚ;->֫:Landroid/graphics/Rect;

    invoke-virtual {v14, v5, v8, v6, v15}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v3, v6

    .line 2818
    invoke-virtual {v15}, Landroid/graphics/Rect;->width()I

    move-result v6

    const/high16 v18, 0x40000000    # 2.0f

    div-int/lit8 v6, v6, 0x2

    int-to-float v6, v6

    sub-float/2addr v3, v6

    add-float/2addr v3, v1

    const/high16 v1, 0x41a00000    # 20.0f

    sub-float v1, p3, v1

    .line 2819
    invoke-virtual {v7, v5, v3, v1, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 2821
    invoke-static {v2, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 2820
    iget-object v6, v0, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v5, p3

    move-object/from16 v19, v6

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 2824
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/high16 v2, 0x42c80000    # 100.0f

    mul-float v3, v12, v2

    sub-float v4, v10, v9

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    div-float/2addr v3, v4

    float-to-double v3, v3

    add-double v3, v3, v16

    double-to-int v3, v3

    int-to-float v3, v3

    div-float/2addr v3, v2

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2791
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v14, v1, v8, v2, v15}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    div-float v12, v12, v18

    .line 2826
    invoke-virtual {v15}, Landroid/graphics/Rect;->height()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    int-to-float v2, v2

    sub-float/2addr v12, v2

    const/high16 v2, 0x40a00000    # 5.0f

    add-float v2, p2, v2

    sub-float/2addr v11, v12

    .line 2827
    invoke-virtual {v7, v1, v2, v11, v14}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 2829
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    move-result v5

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p2

    .line 2828
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private ֫(Landroid/graphics/Canvas;FFII)V
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    .line 2842
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v8, ""

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    div-int/lit8 v2, p4, 0x2

    int-to-float v2, v2

    sub-float v2, p2, v2

    const/high16 v3, 0x42c80000    # 100.0f

    mul-float v2, v2, v3

    iget-object v9, v0, Ll/᩸ۚ;->ۘ:Ll/ۤۚ;

    invoke-virtual {v9}, Landroid/view/View;->getWidth()I

    move-result v4

    sub-int v4, v4, p4

    int-to-float v4, v4

    div-float/2addr v2, v4

    float-to-double v4, v2

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    add-double/2addr v4, v10

    double-to-int v2, v4

    int-to-float v2, v2

    div-float/2addr v2, v3

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2791
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v12, v0, Ll/᩸ۚ;->ۖ:Landroid/graphics/Paint;

    const/4 v13, 0x0

    iget-object v14, v0, Ll/᩸ۚ;->֫:Landroid/graphics/Rect;

    invoke-virtual {v12, v1, v13, v2, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    const/high16 v15, 0x40000000    # 2.0f

    div-float v2, p2, v15

    .line 2844
    invoke-virtual {v14}, Landroid/graphics/Rect;->width()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v2, v3

    const/4 v3, 0x0

    add-float/2addr v2, v3

    const/high16 v3, 0x41a00000    # 20.0f

    sub-float v3, p3, v3

    .line 2845
    invoke-virtual {v7, v1, v2, v3, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v2, 0x0

    .line 2847
    invoke-static {v2, v1}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 2846
    iget-object v6, v0, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    const/4 v5, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const/high16 v16, 0x42c80000    # 100.0f

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v5, p3

    move-object/from16 v17, v6

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 2850
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    div-int/lit8 v2, p5, 0x2

    int-to-float v2, v2

    sub-float v2, p3, v2

    mul-float v2, v2, v16

    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    move-result v3

    sub-int v3, v3, p5

    int-to-float v3, v3

    div-float/2addr v2, v3

    float-to-double v2, v2

    add-double/2addr v2, v10

    double-to-int v2, v2

    int-to-float v2, v2

    div-float v2, v2, v16

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2791
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v12, v1, v13, v2, v14}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    div-float v2, p3, v15

    .line 2852
    invoke-virtual {v14}, Landroid/graphics/Rect;->height()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    sub-float/2addr v2, v3

    const/high16 v3, 0x40a00000    # 5.0f

    add-float v3, p2, v3

    const/4 v4, 0x0

    sub-float v5, v4, v2

    .line 2853
    invoke-virtual {v7, v1, v3, v5, v12}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    const/high16 v1, 0x3f800000    # 1.0f

    .line 2855
    invoke-static {v4, v1}, Ljava/lang/Math;->max(FF)F

    move-result v5

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p2

    .line 2854
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method private ۧ(Landroid/graphics/Canvas;FF)V
    .locals 14

    move-object v0, p0

    move/from16 v2, p2

    move/from16 v3, p3

    .line 2770
    iget-object v1, v0, Ll/᩸ۚ;->ۢ:[F

    const/4 v4, 0x0

    aget v5, v1, v4

    const/4 v6, 0x1

    .line 2771
    aget v7, v1, v6

    .line 2772
    array-length v8, v1

    add-int/lit8 v8, v8, -0x2

    aget v8, v1, v8

    .line 2773
    array-length v9, v1

    sub-int/2addr v9, v6

    aget v1, v1, v9

    sub-float v6, v5, v8

    float-to-double v9, v6

    sub-float v6, v7, v1

    float-to-double v11, v6

    .line 2774
    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v9

    double-to-float v6, v9

    sub-float v9, v2, v5

    sub-float/2addr v8, v5

    mul-float v9, v9, v8

    sub-float v10, v3, v7

    sub-float/2addr v1, v7

    mul-float v10, v10, v1

    add-float/2addr v10, v9

    mul-float v9, v6, v6

    div-float/2addr v10, v9

    mul-float v8, v8, v10

    add-float/2addr v5, v8

    mul-float v10, v10, v1

    add-float/2addr v7, v10

    .line 2779
    new-instance v10, Landroid/graphics/Path;

    invoke-direct {v10}, Landroid/graphics/Path;-><init>()V

    .line 2780
    invoke-virtual {v10, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2781
    invoke-virtual {v10, v5, v7}, Landroid/graphics/Path;->lineTo(FF)V

    sub-float v1, v5, v2

    float-to-double v8, v1

    sub-float v1, v7, v3

    float-to-double v11, v1

    .line 2782
    invoke-static {v8, v9, v11, v12}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v8

    double-to-float v1, v8

    .line 2783
    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, ""

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/high16 v9, 0x42c80000    # 100.0f

    mul-float v11, v1, v9

    div-float/2addr v11, v6

    float-to-int v6, v11

    int-to-float v6, v6

    div-float/2addr v6, v9

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    .line 2791
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v6

    iget-object v13, v0, Ll/᩸ۚ;->ۖ:Landroid/graphics/Paint;

    iget-object v8, v0, Ll/᩸ۚ;->֫:Landroid/graphics/Rect;

    invoke-virtual {v13, v9, v4, v6, v8}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v1, v4

    .line 2785
    invoke-virtual {v8}, Landroid/graphics/Rect;->width()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    int-to-float v4, v4

    sub-float v11, v1, v4

    const/high16 v12, -0x3e600000    # -20.0f

    move-object v8, p1

    .line 2786
    invoke-virtual/range {v8 .. v13}, Landroid/graphics/Canvas;->drawTextOnPath(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V

    .line 2787
    iget-object v6, v0, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    move-object v1, p1

    move v4, v5

    move v5, v7

    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;IILl/᩵ۚ;)V
    .locals 20

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move/from16 v8, p2

    move-object/from16 v9, p4

    .line 2663
    iget-object v10, v6, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    iget-object v11, v6, Ll/᩸ۚ;->᩷:[I

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x4

    if-ne v8, v15, :cond_4

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/16 v16, 0x0

    .line 2753
    :goto_0
    iget v2, v6, Ll/᩸ۚ;->ܽ:I

    if-ge v0, v2, :cond_2

    .line 2754
    aget v2, v11, v0

    if-ne v2, v13, :cond_0

    const/4 v1, 0x1

    :cond_0
    if-ne v2, v14, :cond_1

    const/4 v2, 0x1

    const/16 v16, 0x1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    .line 2746
    iget-object v0, v6, Ll/᩸ۚ;->ۢ:[F

    aget v1, v0, v12

    aget v2, v0, v13

    array-length v3, v0

    sub-int/2addr v3, v14

    aget v3, v0, v3

    array-length v4, v0

    sub-int/2addr v4, v13

    aget v4, v0, v4

    move-object/from16 v0, p1

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_3
    if-eqz v16, :cond_4

    .line 2765
    invoke-direct/range {p0 .. p1}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;)V

    :cond_4
    if-ne v8, v14, :cond_5

    .line 2746
    iget-object v0, v6, Ll/᩸ۚ;->ۢ:[F

    aget v1, v0, v12

    aget v2, v0, v13

    array-length v3, v0

    sub-int/2addr v3, v14

    aget v3, v0, v3

    array-length v4, v0

    sub-int/2addr v4, v13

    aget v4, v0, v4

    move-object/from16 v0, p1

    move-object v5, v10

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_5
    const/4 v10, 0x3

    if-ne v8, v10, :cond_6

    .line 2670
    invoke-direct/range {p0 .. p1}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;)V

    .line 2677
    :cond_6
    iget-object v0, v6, Ll/᩸ۚ;->ۢ:[F

    iget-object v1, v6, Ll/᩸ۚ;->ܿ:Landroid/graphics/Paint;

    invoke-virtual {v7, v0, v1}, Landroid/graphics/Canvas;->drawLines([FLandroid/graphics/Paint;)V

    .line 2683
    iget-object v0, v9, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 2684
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 2685
    iget-object v1, v9, Ll/᩵ۚ;->ۗ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    move v12, v0

    move/from16 v16, v1

    goto :goto_1

    :cond_7
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    :goto_1
    const/4 v0, 0x1

    const/4 v0, 0x4

    const/4 v15, 0x1

    :goto_2
    add-int/lit8 v1, p3, -0x1

    if-ge v15, v1, :cond_10

    if-ne v8, v0, :cond_8

    add-int/lit8 v1, v15, -0x1

    .line 2688
    aget v1, v11, v1

    if-nez v1, :cond_8

    goto/16 :goto_6

    :cond_8
    mul-int/lit8 v1, v15, 0x2

    .line 2693
    iget-object v2, v6, Ll/᩸ۚ;->ᩳ:[F

    aget v5, v2, v1

    add-int/2addr v1, v13

    .line 2694
    aget v4, v2, v1

    .line 2695
    iget-object v1, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    .line 2696
    iget-object v1, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    const/high16 v2, 0x41200000    # 10.0f

    add-float v3, v4, v2

    invoke-virtual {v1, v5, v3}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2697
    iget-object v1, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    add-float v3, v5, v2

    invoke-virtual {v1, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2698
    iget-object v1, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    sub-float v3, v4, v2

    invoke-virtual {v1, v5, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2699
    iget-object v1, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    sub-float v2, v5, v2

    invoke-virtual {v1, v2, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2700
    iget-object v1, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    add-int/lit8 v1, v15, -0x1

    .line 2702
    invoke-virtual {v9, v1}, Ll/᩵ۚ;->֫(I)V

    .line 2705
    iget-object v3, v6, Ll/᩸ۚ;->ۧ:Landroid/graphics/Paint;

    const/16 v17, 0x0

    if-ne v8, v0, :cond_c

    .line 2707
    aget v0, v11, v1

    if-ne v0, v13, :cond_a

    sub-float v0, v5, v17

    sub-float v1, v4, v17

    .line 2708
    invoke-direct {v6, v7, v0, v1}, Ll/᩸ۚ;->ۧ(Landroid/graphics/Canvas;FF)V

    :cond_9
    :goto_3
    move-object v13, v3

    move/from16 v18, v4

    move/from16 v19, v5

    goto :goto_4

    :cond_a
    if-ne v0, v14, :cond_b

    sub-float v0, v5, v17

    sub-float v1, v4, v17

    .line 2710
    invoke-direct {v6, v7, v0, v1}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;FF)V

    goto :goto_3

    :cond_b
    if-ne v0, v10, :cond_9

    sub-float v2, v5, v17

    sub-float v18, v4, v17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v13, v3

    move/from16 v3, v18

    move/from16 v18, v4

    move v4, v12

    move/from16 v19, v5

    move/from16 v5, v16

    .line 2712
    invoke-direct/range {v0 .. v5}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;FFII)V

    .line 2715
    :goto_4
    iget-object v0, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v7, v0, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_5

    :cond_c
    move-object v13, v3

    move/from16 v18, v4

    move/from16 v19, v5

    :goto_5
    if-ne v8, v14, :cond_d

    sub-float v5, v19, v17

    sub-float v4, v18, v17

    .line 2718
    invoke-direct {v6, v7, v5, v4}, Ll/᩸ۚ;->ۧ(Landroid/graphics/Canvas;FF)V

    :cond_d
    if-ne v8, v10, :cond_e

    sub-float v5, v19, v17

    sub-float v4, v18, v17

    .line 2721
    invoke-direct {v6, v7, v5, v4}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;FF)V

    :cond_e
    const/4 v0, 0x6

    if-ne v8, v0, :cond_f

    sub-float v2, v19, v17

    sub-float v3, v18, v17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v4, v12

    move/from16 v5, v16

    .line 2724
    invoke-direct/range {v0 .. v5}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;FFII)V

    .line 2729
    :cond_f
    iget-object v0, v6, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v7, v0, v13}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :goto_6
    add-int/lit8 v15, v15, 0x1

    const/4 v0, 0x4

    const/4 v13, 0x1

    goto/16 :goto_2

    :cond_10
    const/4 v0, 0x0

    .line 2732
    iget-object v1, v6, Ll/᩸ۚ;->ۢ:[F

    array-length v2, v1

    const/4 v3, 0x1

    if-le v2, v3, :cond_11

    .line 2734
    aget v0, v1, v0

    aget v1, v1, v3

    const/high16 v2, 0x41000000    # 8.0f

    iget-object v4, v6, Ll/᩸ۚ;->᩻:Landroid/graphics/Paint;

    invoke-virtual {v7, v0, v1, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 2735
    iget-object v0, v6, Ll/᩸ۚ;->ۢ:[F

    array-length v1, v0

    sub-int/2addr v1, v14

    aget v1, v0, v1

    array-length v5, v0

    sub-int/2addr v5, v3

    aget v0, v0, v5

    invoke-virtual {v7, v1, v0, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_11
    return-void
.end method

.method public final ֫(Landroid/graphics/Canvas;Ljava/util/HashMap;II)V
    .locals 11

    if-eqz p2, :cond_9

    .line 2610
    invoke-virtual {p2}, Ljava/util/HashMap;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    .line 2613
    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 2614
    iget-object v0, p0, Ll/᩸ۚ;->ۘ:Ll/ۤۚ;

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    iget-object v2, p0, Ll/᩸ۚ;->ܿ:Landroid/graphics/Paint;

    const/4 v3, 0x2

    if-nez v1, :cond_1

    and-int/lit8 v1, p4, 0x1

    if-ne v1, v3, :cond_1

    .line 2615
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-static {v0}, Ll/ۤۚ;->֫(Ll/ۤۚ;)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3558
    iget v4, v0, Ll/ۤۚ;->ܽۧ:F

    .line 2615
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2616
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v4

    add-int/lit8 v4, v4, -0x1e

    int-to-float v4, v4

    iget-object v5, p0, Ll/᩸ۚ;->ۖ:Landroid/graphics/Paint;

    const/high16 v6, 0x41200000    # 10.0f

    invoke-virtual {p1, v1, v6, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 2617
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    add-int/lit8 v0, v0, -0x1d

    int-to-float v0, v0

    const/high16 v4, 0x41300000    # 11.0f

    invoke-virtual {p1, v1, v4, v0, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 2619
    :cond_1
    invoke-virtual {p2}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩵ۚ;

    .line 2620
    invoke-virtual {v0}, Ll/᩵ۚ;->֫()I

    move-result v1

    const/4 v4, 0x1

    if-lez p4, :cond_3

    if-nez v1, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-nez v1, :cond_4

    goto :goto_0

    .line 2628
    :cond_4
    iget-object v5, p0, Ll/᩸ۚ;->ᩳ:[F

    iget-object v6, p0, Ll/᩸ۚ;->᩷:[I

    invoke-virtual {v0, v5, v6}, Ll/᩵ۚ;->֫([F[I)I

    move-result v5

    iput v5, p0, Ll/᩸ۚ;->ܽ:I

    if-lt v1, v4, :cond_2

    .line 2632
    div-int/lit8 v5, p3, 0x10

    .line 2633
    iget-object v6, p0, Ll/᩸ۚ;->ۢ:[F

    if-eqz v6, :cond_5

    array-length v6, v6

    mul-int/lit8 v7, v5, 0x2

    if-eq v6, v7, :cond_6

    :cond_5
    mul-int/lit8 v6, v5, 0x2

    .line 2634
    new-array v6, v6, [F

    iput-object v6, p0, Ll/᩸ۚ;->ۢ:[F

    .line 2635
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    iput-object v6, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    .line 2638
    :cond_6
    iget v6, p0, Ll/᩸ۚ;->ܺ:I

    int-to-float v7, v6

    invoke-virtual {p1, v7, v7}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v7, 0x77000000

    .line 2640
    invoke-virtual {v2, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 2641
    iget-object v8, p0, Ll/᩸ۚ;->ۧ:Landroid/graphics/Paint;

    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 2642
    iget-object v9, p0, Ll/᩸ۚ;->᩻:Landroid/graphics/Paint;

    invoke-virtual {v9, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 2643
    iget-object v10, p0, Ll/᩸ۚ;->ܳ:Landroid/graphics/Paint;

    invoke-virtual {v10, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 2644
    iget-object v7, p0, Ll/᩸ۚ;->ۢ:[F

    invoke-virtual {v0, v5, v7}, Ll/᩵ۚ;->֫(I[F)V

    .line 2645
    iget v5, p0, Ll/᩸ۚ;->ܽ:I

    invoke-virtual {p0, p1, v1, v5, v0}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;IILl/᩵ۚ;)V

    const/16 v5, -0x55cd

    .line 2646
    invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V

    const v5, -0x1f8a66

    .line 2647
    invoke-virtual {v9, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 2648
    invoke-virtual {v8, v5}, Landroid/graphics/Paint;->setColor(I)V

    const v5, -0xcc5600

    .line 2649
    invoke-virtual {v10, v5}, Landroid/graphics/Paint;->setColor(I)V

    neg-int v5, v6

    int-to-float v5, v5

    .line 2651
    invoke-virtual {p1, v5, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2652
    iget v5, p0, Ll/᩸ۚ;->ܽ:I

    invoke-virtual {p0, p1, v1, v5, v0}, Ll/᩸ۚ;->֫(Landroid/graphics/Canvas;IILl/᩵ۚ;)V

    const/4 v5, 0x5

    if-ne v1, v5, :cond_2

    .line 2859
    iget-object v1, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v1}, Landroid/graphics/Path;->reset()V

    const/4 v1, 0x0

    const/4 v6, 0x0

    :goto_1
    const/16 v7, 0x32

    if-gt v6, v7, :cond_7

    int-to-float v8, v6

    int-to-float v7, v7

    div-float/2addr v8, v7

    .line 2863
    iget-object v7, p0, Ll/᩸ۚ;->ۡ:[F

    invoke-virtual {v0, v8, v7}, Ll/᩵ۚ;->֫(F[F)V

    .line 2864
    iget-object v8, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    aget v9, v7, v1

    aget v10, v7, v4

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2865
    iget-object v8, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    aget v9, v7, v3

    const/4 v10, 0x3

    aget v10, v7, v10

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2866
    iget-object v8, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    const/4 v9, 0x4

    aget v9, v7, v9

    aget v10, v7, v5

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2867
    iget-object v8, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    const/4 v9, 0x6

    aget v9, v7, v9

    const/4 v10, 0x7

    aget v7, v7, v10

    invoke-virtual {v8, v9, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2868
    iget-object v7, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_7
    const/high16 v0, 0x44000000    # 512.0f

    .line 2870
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x40000000    # 2.0f

    .line 2871
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2872
    iget-object v0, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    const/high16 v0, -0x40000000    # -2.0f

    .line 2874
    invoke-virtual {p1, v0, v0}, Landroid/graphics/Canvas;->translate(FF)V

    const/high16 v0, -0x10000

    .line 2875
    invoke-virtual {v2, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 2876
    iget-object v0, p0, Ll/᩸ۚ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {p1, v0, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto/16 :goto_0

    .line 2659
    :cond_8
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :cond_9
    :goto_2
    return-void
.end method
