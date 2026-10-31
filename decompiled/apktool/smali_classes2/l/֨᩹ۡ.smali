.class public final Ll/֨᩹ۡ;
.super Ljava/lang/Object;
.source "UBKO"


# static fields
.field public static final ᩵:Landroid/graphics/Matrix;


# instance fields
.field public ֫:F

.field public final ۖ:Ll/ۖ᩵;

.field public ۘ:F

.field public final ۜ:Landroid/graphics/Path;

.field public ۡ:Ljava/lang/String;

.field public final ۢ:Ll/᩵᩹ۡ;

.field public ۧ:F

.field public final ܳ:Landroid/graphics/Path;

.field public ܺ:Landroid/graphics/Paint;

.field public ܽ:Landroid/graphics/Paint;

.field public ܿ:Ljava/lang/Boolean;

.field public final ᩳ:Landroid/graphics/Matrix;

.field public ᩴ:F

.field public ᩷:I

.field public ᩻:Landroid/graphics/PathMeasure;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 752
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    sput-object v0, Ll/֨᩹ۡ;->᩵:Landroid/graphics/Matrix;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 773
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 753
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ᩳ:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 763
    iput v0, p0, Ll/֨᩹ۡ;->ۧ:F

    .line 764
    iput v0, p0, Ll/֨᩹ۡ;->֫:F

    .line 765
    iput v0, p0, Ll/֨᩹ۡ;->ᩴ:F

    .line 766
    iput v0, p0, Ll/֨᩹ۡ;->ۘ:F

    const/16 v0, 0xff

    .line 767
    iput v0, p0, Ll/֨᩹ۡ;->᩷:I

    const/4 v0, 0x0

    .line 768
    iput-object v0, p0, Ll/֨᩹ۡ;->ۡ:Ljava/lang/String;

    .line 769
    iput-object v0, p0, Ll/֨᩹ۡ;->ܿ:Ljava/lang/Boolean;

    .line 771
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ۖ:Ll/ۖ᩵;

    .line 774
    new-instance v0, Ll/᩵᩹ۡ;

    invoke-direct {v0}, Ll/᩵᩹ۡ;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ۢ:Ll/᩵᩹ۡ;

    .line 775
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ܳ:Landroid/graphics/Path;

    .line 776
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ۜ:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Ll/֨᩹ۡ;)V
    .locals 3

    .line 799
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 753
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ᩳ:Landroid/graphics/Matrix;

    const/4 v0, 0x0

    .line 763
    iput v0, p0, Ll/֨᩹ۡ;->ۧ:F

    .line 764
    iput v0, p0, Ll/֨᩹ۡ;->֫:F

    .line 765
    iput v0, p0, Ll/֨᩹ۡ;->ᩴ:F

    .line 766
    iput v0, p0, Ll/֨᩹ۡ;->ۘ:F

    const/16 v0, 0xff

    .line 767
    iput v0, p0, Ll/֨᩹ۡ;->᩷:I

    const/4 v0, 0x0

    .line 768
    iput-object v0, p0, Ll/֨᩹ۡ;->ۡ:Ljava/lang/String;

    .line 769
    iput-object v0, p0, Ll/֨᩹ۡ;->ܿ:Ljava/lang/Boolean;

    .line 771
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/֨᩹ۡ;->ۖ:Ll/ۖ᩵;

    .line 800
    new-instance v1, Ll/᩵᩹ۡ;

    iget-object v2, p1, Ll/֨᩹ۡ;->ۢ:Ll/᩵᩹ۡ;

    invoke-direct {v1, v2, v0}, Ll/᩵᩹ۡ;-><init>(Ll/᩵᩹ۡ;Ll/ۖ᩵;)V

    iput-object v1, p0, Ll/֨᩹ۡ;->ۢ:Ll/᩵᩹ۡ;

    .line 801
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ll/֨᩹ۡ;->ܳ:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ll/֨᩹ۡ;->ܳ:Landroid/graphics/Path;

    .line 802
    new-instance v1, Landroid/graphics/Path;

    iget-object v2, p1, Ll/֨᩹ۡ;->ۜ:Landroid/graphics/Path;

    invoke-direct {v1, v2}, Landroid/graphics/Path;-><init>(Landroid/graphics/Path;)V

    iput-object v1, p0, Ll/֨᩹ۡ;->ۜ:Landroid/graphics/Path;

    .line 803
    iget v1, p1, Ll/֨᩹ۡ;->ۧ:F

    iput v1, p0, Ll/֨᩹ۡ;->ۧ:F

    .line 804
    iget v1, p1, Ll/֨᩹ۡ;->֫:F

    iput v1, p0, Ll/֨᩹ۡ;->֫:F

    .line 805
    iget v1, p1, Ll/֨᩹ۡ;->ᩴ:F

    iput v1, p0, Ll/֨᩹ۡ;->ᩴ:F

    .line 806
    iget v1, p1, Ll/֨᩹ۡ;->ۘ:F

    iput v1, p0, Ll/֨᩹ۡ;->ۘ:F

    .line 808
    iget v1, p1, Ll/֨᩹ۡ;->᩷:I

    iput v1, p0, Ll/֨᩹ۡ;->᩷:I

    .line 809
    iget-object v1, p1, Ll/֨᩹ۡ;->ۡ:Ljava/lang/String;

    iput-object v1, p0, Ll/֨᩹ۡ;->ۡ:Ljava/lang/String;

    .line 810
    iget-object v1, p1, Ll/֨᩹ۡ;->ۡ:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 811
    invoke-virtual {v0, v1, p0}, Ll/ۗ᩵;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    :cond_0
    iget-object p1, p1, Ll/֨᩹ۡ;->ܿ:Ljava/lang/Boolean;

    iput-object p1, p0, Ll/֨᩹ۡ;->ܿ:Ljava/lang/Boolean;

    return-void
.end method

.method private ֫(Ll/᩵᩹ۡ;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V
    .locals 17

    move-object/from16 v6, p0

    move-object/from16 v0, p1

    move-object/from16 v7, p3

    .line 822
    iget-object v1, v0, Ll/᩵᩹ۡ;->᩷:Landroid/graphics/Matrix;

    iget-object v8, v0, Ll/᩵᩹ۡ;->֫:Ljava/util/ArrayList;

    move-object/from16 v2, p2

    invoke-virtual {v1, v2}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 824
    iget-object v9, v0, Ll/᩵᩹ۡ;->᩷:Landroid/graphics/Matrix;

    iget-object v0, v0, Ll/᩵᩹ۡ;->ܽ:Landroid/graphics/Matrix;

    invoke-virtual {v9, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 827
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v10, 0x0

    .line 830
    :goto_0
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v10, v1, :cond_14

    .line 831
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡᩹ۡ;

    .line 832
    instance-of v2, v1, Ll/᩵᩹ۡ;

    if-eqz v2, :cond_1

    .line 833
    check-cast v1, Ll/᩵᩹ۡ;

    move-object/from16 v0, p0

    move-object v2, v9

    move-object/from16 v3, p3

    move/from16 v4, p4

    move/from16 v5, p5

    .line 834
    invoke-direct/range {v0 .. v5}, Ll/֨᩹ۡ;->֫(Ll/᩵᩹ۡ;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    :cond_0
    move-object v0, v6

    goto/16 :goto_a

    .line 836
    :cond_1
    instance-of v2, v1, Ll/ۚ᩹ۡ;

    if-eqz v2, :cond_0

    .line 837
    check-cast v1, Ll/ۚ᩹ۡ;

    move/from16 v2, p4

    int-to-float v3, v2

    .line 852
    iget v4, v6, Ll/֨᩹ۡ;->ᩴ:F

    div-float/2addr v3, v4

    move/from16 v4, p5

    int-to-float v5, v4

    .line 853
    iget v11, v6, Ll/֨᩹ۡ;->ۘ:F

    div-float/2addr v5, v11

    .line 854
    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v11

    .line 857
    iget-object v12, v6, Ll/֨᩹ۡ;->ᩳ:Landroid/graphics/Matrix;

    invoke-virtual {v12, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 858
    invoke-virtual {v12, v3, v5}, Landroid/graphics/Matrix;->postScale(FF)Z

    const/4 v3, 0x4

    new-array v3, v3, [F

    .line 978
    fill-array-data v3, :array_0

    .line 979
    invoke-virtual {v9, v3}, Landroid/graphics/Matrix;->mapVectors([F)V

    .line 980
    aget v0, v3, v0

    float-to-double v13, v0

    const/4 v0, 0x1

    aget v0, v3, v0

    float-to-double v5, v0

    invoke-static {v13, v14, v5, v6}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v0, v5

    const/4 v5, 0x2

    .line 981
    aget v5, v3, v5

    float-to-double v5, v5

    const/4 v13, 0x3

    aget v15, v3, v13

    const/16 v16, 0x0

    float-to-double v13, v15

    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    move-result-wide v5

    double-to-float v5, v5

    .line 982
    aget v6, v3, v16

    const/4 v13, 0x1

    aget v13, v3, v13

    const/4 v14, 0x2

    aget v14, v3, v14

    const/4 v15, 0x3

    aget v3, v3, v15

    mul-float v6, v6, v3

    mul-float v13, v13, v14

    sub-float/2addr v6, v13

    .line 984
    invoke-static {v0, v5}, Ljava/lang/Math;->max(FF)F

    move-result v0

    const/4 v3, 0x0

    cmpl-float v5, v0, v3

    if-lez v5, :cond_2

    .line 988
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v5

    div-float/2addr v5, v0

    goto :goto_1

    :cond_2
    const/4 v5, 0x0

    :goto_1
    cmpl-float v0, v5, v3

    if-nez v0, :cond_3

    move-object/from16 v0, p0

    goto/16 :goto_a

    :cond_3
    move-object/from16 v0, p0

    .line 1313
    iget-object v6, v0, Ll/֨᩹ۡ;->ܳ:Landroid/graphics/Path;

    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 1314
    iget-object v13, v1, Ll/ۚ᩹ۡ;->ۧ:[Ll/ܿ۬;

    if-eqz v13, :cond_4

    .line 438
    :try_start_0
    invoke-static {v13, v6}, Ll/ܳ۬;->֫([Ll/ܿ۬;Landroid/graphics/Path;)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 1318
    :catch_0
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    .line 869
    :cond_4
    :goto_2
    iget-object v13, v0, Ll/֨᩹ۡ;->ۜ:Landroid/graphics/Path;

    invoke-virtual {v13}, Landroid/graphics/Path;->reset()V

    .line 0
    instance-of v14, v1, Ll/ۘ᩹ۡ;

    if-eqz v14, :cond_6

    .line 872
    iget v1, v1, Ll/ۚ᩹ۡ;->֫:I

    if-nez v1, :cond_5

    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_3

    .line 873
    :cond_5
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 872
    :goto_3
    invoke-virtual {v13, v1}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 874
    invoke-virtual {v13, v6, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 875
    invoke-virtual {v7, v13}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    goto/16 :goto_a

    .line 877
    :cond_6
    check-cast v1, Ll/ᩴ᩹ۡ;

    .line 878
    iget v14, v1, Ll/ᩴ᩹ۡ;->ᩴ:F

    const/high16 v15, 0x3f800000    # 1.0f

    cmpl-float v3, v14, v3

    if-nez v3, :cond_7

    iget v3, v1, Ll/ᩴ᩹ۡ;->ۖ:F

    cmpl-float v3, v3, v15

    if-eqz v3, :cond_a

    .line 879
    :cond_7
    iget v3, v1, Ll/ᩴ᩹ۡ;->ۘ:F

    add-float/2addr v14, v3

    rem-float/2addr v14, v15

    .line 880
    iget v2, v1, Ll/ᩴ᩹ۡ;->ۖ:F

    add-float/2addr v2, v3

    rem-float/2addr v2, v15

    .line 882
    iget-object v3, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    if-nez v3, :cond_8

    .line 883
    new-instance v3, Landroid/graphics/PathMeasure;

    invoke-direct {v3}, Landroid/graphics/PathMeasure;-><init>()V

    iput-object v3, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    .line 885
    :cond_8
    iget-object v3, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    const/4 v15, 0x0

    invoke-virtual {v3, v6, v15}, Landroid/graphics/PathMeasure;->setPath(Landroid/graphics/Path;Z)V

    .line 887
    iget-object v3, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    invoke-virtual {v3}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v3

    mul-float v14, v14, v3

    mul-float v2, v2, v3

    .line 890
    invoke-virtual {v6}, Landroid/graphics/Path;->reset()V

    cmpl-float v15, v14, v2

    if-lez v15, :cond_9

    .line 892
    iget-object v15, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    const/4 v4, 0x1

    invoke-virtual {v15, v14, v3, v6, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    .line 893
    iget-object v3, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    const/4 v14, 0x0

    invoke-virtual {v3, v14, v2, v6, v4}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    goto :goto_4

    :cond_9
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 895
    iget-object v15, v0, Ll/֨᩹ۡ;->᩻:Landroid/graphics/PathMeasure;

    invoke-virtual {v15, v14, v2, v6, v3}, Landroid/graphics/PathMeasure;->getSegment(FFLandroid/graphics/Path;Z)Z

    const/4 v14, 0x0

    .line 897
    :goto_4
    invoke-virtual {v6, v14, v14}, Landroid/graphics/Path;->rLineTo(FF)V

    .line 899
    :cond_a
    invoke-virtual {v13, v6, v12}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;Landroid/graphics/Matrix;)V

    .line 901
    iget-object v2, v1, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    invoke-virtual {v2}, Ll/᩻ۗ;->ܿ()Z

    move-result v2

    const/4 v3, 0x0

    const/16 v4, 0xff

    const/high16 v6, 0x437f0000    # 255.0f

    if-eqz v2, :cond_e

    .line 902
    iget-object v2, v1, Ll/ᩴ᩹ۡ;->ܳ:Ll/᩻ۗ;

    .line 903
    iget-object v14, v0, Ll/֨᩹ۡ;->ܽ:Landroid/graphics/Paint;

    if-nez v14, :cond_b

    .line 904
    new-instance v14, Landroid/graphics/Paint;

    const/4 v15, 0x1

    const v16, 0xffffff

    invoke-direct {v14, v15}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v14, v0, Ll/֨᩹ۡ;->ܽ:Landroid/graphics/Paint;

    .line 905
    sget-object v15, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    goto :goto_5

    :cond_b
    const v16, 0xffffff

    .line 908
    :goto_5
    iget-object v14, v0, Ll/֨᩹ۡ;->ܽ:Landroid/graphics/Paint;

    .line 909
    invoke-virtual {v2}, Ll/᩻ۗ;->ܽ()Z

    move-result v15

    if-eqz v15, :cond_c

    .line 910
    invoke-virtual {v2}, Ll/᩻ۗ;->ۧ()Landroid/graphics/Shader;

    move-result-object v2

    .line 911
    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 912
    invoke-virtual {v2, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 913
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 914
    iget v2, v1, Ll/ᩴ᩹ۡ;->ܿ:F

    mul-float v2, v2, v6

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_6

    .line 916
    :cond_c
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 917
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 918
    invoke-virtual {v2}, Ll/᩻ۗ;->֫()I

    move-result v2

    iget v6, v1, Ll/ᩴ᩹ۡ;->ܿ:F

    sget v15, Ll/ܶ᩹ۡ;->ۛ:I

    .line 390
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v15

    and-int v2, v2, v16

    int-to-float v15, v15

    mul-float v15, v15, v6

    float-to-int v6, v15

    shl-int/lit8 v6, v6, 0x18

    or-int/2addr v2, v6

    .line 918
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setColor(I)V

    :goto_6
    const/high16 v2, 0x437f0000    # 255.0f

    .line 920
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 921
    iget v6, v1, Ll/ۚ᩹ۡ;->֫:I

    if-nez v6, :cond_d

    sget-object v6, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    goto :goto_7

    .line 922
    :cond_d
    sget-object v6, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    .line 921
    :goto_7
    invoke-virtual {v13, v6}, Landroid/graphics/Path;->setFillType(Landroid/graphics/Path$FillType;)V

    .line 923
    invoke-virtual {v7, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    goto :goto_8

    :cond_e
    const v16, 0xffffff

    const/high16 v2, 0x437f0000    # 255.0f

    .line 926
    :goto_8
    iget-object v6, v1, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    invoke-virtual {v6}, Ll/᩻ۗ;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_13

    .line 927
    iget-object v6, v1, Ll/ᩴ᩹ۡ;->ۜ:Ll/᩻ۗ;

    .line 928
    iget-object v14, v0, Ll/֨᩹ۡ;->ܺ:Landroid/graphics/Paint;

    if-nez v14, :cond_f

    .line 929
    new-instance v14, Landroid/graphics/Paint;

    const/4 v15, 0x1

    invoke-direct {v14, v15}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v14, v0, Ll/֨᩹ۡ;->ܺ:Landroid/graphics/Paint;

    .line 930
    sget-object v15, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 933
    :cond_f
    iget-object v14, v0, Ll/֨᩹ۡ;->ܺ:Landroid/graphics/Paint;

    .line 934
    iget-object v15, v1, Ll/ᩴ᩹ۡ;->ۢ:Landroid/graphics/Paint$Join;

    if-eqz v15, :cond_10

    .line 935
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 938
    :cond_10
    iget-object v15, v1, Ll/ᩴ᩹ۡ;->᩷:Landroid/graphics/Paint$Cap;

    if-eqz v15, :cond_11

    .line 939
    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 942
    :cond_11
    iget v15, v1, Ll/ᩴ᩹ۡ;->ۡ:F

    invoke-virtual {v14, v15}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 943
    invoke-virtual {v6}, Ll/᩻ۗ;->ܽ()Z

    move-result v15

    if-eqz v15, :cond_12

    .line 944
    invoke-virtual {v6}, Ll/᩻ۗ;->ۧ()Landroid/graphics/Shader;

    move-result-object v4

    .line 945
    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 946
    invoke-virtual {v4, v12}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 947
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 948
    iget v4, v1, Ll/ᩴ᩹ۡ;->᩻:F

    mul-float v4, v4, v2

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v2

    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    goto :goto_9

    .line 950
    :cond_12
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 951
    invoke-virtual {v14, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 952
    invoke-virtual {v6}, Ll/᩻ۗ;->֫()I

    move-result v2

    iget v4, v1, Ll/ᩴ᩹ۡ;->᩻:F

    sget v6, Ll/ܶ᩹ۡ;->ۛ:I

    .line 390
    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v6

    and-int v2, v2, v16

    int-to-float v6, v6

    mul-float v6, v6, v4

    float-to-int v4, v6

    shl-int/lit8 v4, v4, 0x18

    or-int/2addr v2, v4

    .line 952
    invoke-virtual {v14, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 955
    :goto_9
    invoke-virtual {v14, v3}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    mul-float v11, v11, v5

    .line 957
    iget v1, v1, Ll/ᩴ᩹ۡ;->ܺ:F

    mul-float v1, v1, v11

    invoke-virtual {v14, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 958
    invoke-virtual {v7, v13, v14}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_13
    :goto_a
    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x0

    move-object v6, v0

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_14
    move-object v0, v6

    .line 842
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->restore()V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;II)V
    .locals 6

    .line 847
    iget-object v1, p0, Ll/֨᩹ۡ;->ۢ:Ll/᩵᩹ۡ;

    sget-object v2, Ll/֨᩹ۡ;->᩵:Landroid/graphics/Matrix;

    move-object v0, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Ll/֨᩹ۡ;->֫(Ll/᩵᩹ۡ;Landroid/graphics/Matrix;Landroid/graphics/Canvas;II)V

    return-void
.end method
