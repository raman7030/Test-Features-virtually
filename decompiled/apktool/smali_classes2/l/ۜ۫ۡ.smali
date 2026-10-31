.class public final Ll/ۜ۫ۡ;
.super Ljava/lang/Object;
.source "1AG9"


# instance fields
.field public ֫:[F

.field public ۖ:F

.field public ۜ:F

.field public final ۡ:Ljava/lang/CharSequence;

.field public final ۢ:I

.field public final ۧ:I

.field public ܳ:I

.field public final synthetic ܺ:Ll/ۢ۫ۡ;

.field public final ܽ:F

.field public ܿ:I

.field public ᩳ:I

.field public final ᩷:Ljava/util/function/IntUnaryOperator;

.field public ᩻:I


# direct methods
.method public constructor <init>(Ll/ۢ۫ۡ;Ljava/lang/CharSequence;IIFLjava/util/function/IntUnaryOperator;)V
    .locals 0

    .line 789
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۜ۫ۡ;->ܺ:Ll/ۢ۫ۡ;

    .line 790
    iput-object p2, p0, Ll/ۜ۫ۡ;->ۡ:Ljava/lang/CharSequence;

    .line 791
    iput p3, p0, Ll/ۜ۫ۡ;->ᩳ:I

    iput p3, p0, Ll/ۜ۫ۡ;->ܿ:I

    iput p3, p0, Ll/ۜ۫ۡ;->ۢ:I

    .line 792
    iput p4, p0, Ll/ۜ۫ۡ;->ۧ:I

    .line 793
    iput p5, p0, Ll/ۜ۫ۡ;->ܽ:F

    .line 794
    iput-object p6, p0, Ll/ۜ۫ۡ;->᩷:Ljava/util/function/IntUnaryOperator;

    return-void
.end method

.method private ֫(I)Z
    .locals 2

    .line 850
    iget-object v0, p0, Ll/ۜ۫ۡ;->ۡ:Ljava/lang/CharSequence;

    invoke-interface {v0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p1

    .line 851
    invoke-static {p1}, Ll/۫۬ۡ;->֫(C)B

    move-result v0

    const/16 v1, 0xf

    if-ne v0, v1, :cond_0

    .line 852
    invoke-static {p1}, Ll/ܰ۬ۡ;->ܽ(I)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/16 p1, 0x8

    if-ne v0, p1, :cond_2

    iget-object p1, p0, Ll/ۜ۫ۡ;->ܺ:Ll/ۢ۫ۡ;

    invoke-static {p1}, Ll/ۢ۫ۡ;->֫(Ll/ۢ۫ۡ;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final ֫()F
    .locals 1

    .line 797
    iget v0, p0, Ll/ۜ۫ۡ;->ۖ:F

    return v0
.end method

.method public final ֫(FI)F
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    .line 863
    iget v3, v0, Ll/ۜ۫ۡ;->ۢ:I

    if-lt v2, v3, :cond_12

    iget v4, v0, Ll/ۜ۫ۡ;->ۧ:I

    if-gt v2, v4, :cond_12

    const/4 v5, 0x0

    cmpg-float v6, v1, v5

    if-gtz v6, :cond_0

    return v5

    .line 865
    :cond_0
    iget-object v6, v0, Ll/ۜ۫ۡ;->֫:[F

    const/4 v7, 0x1

    if-eqz v6, :cond_2

    iget v8, v0, Ll/ۜ۫ۡ;->ܿ:I

    if-gt v2, v8, :cond_2

    iget v8, v0, Ll/ۜ۫ۡ;->᩻:I

    if-lt v2, v8, :cond_2

    iget v9, v0, Ll/ۜ۫ۡ;->ܳ:I

    if-gt v2, v9, :cond_2

    if-ne v2, v8, :cond_1

    .line 866
    iget v2, v0, Ll/ۜ۫ۡ;->ۜ:F

    goto :goto_0

    :cond_1
    iget v3, v0, Ll/ۜ۫ۡ;->ۜ:F

    sub-int/2addr v2, v8

    sub-int/2addr v2, v7

    aget v2, v6, v2

    add-float/2addr v2, v3

    :goto_0
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

    .line 868
    :cond_2
    iget v6, v0, Ll/ۜ۫ۡ;->ܿ:I

    const/4 v8, 0x0

    if-ge v2, v6, :cond_3

    .line 869
    iput v3, v0, Ll/ۜ۫ۡ;->ᩳ:I

    iput v3, v0, Ll/ۜ۫ۡ;->ܿ:I

    .line 870
    iput v5, v0, Ll/ۜ۫ۡ;->ۖ:F

    .line 871
    iput-object v8, v0, Ll/ۜ۫ۡ;->֫:[F

    .line 873
    :cond_3
    :goto_1
    iget v3, v0, Ll/ۜ۫ۡ;->ܿ:I

    if-ge v3, v2, :cond_11

    iget v5, v0, Ll/ۜ۫ۡ;->ۖ:F

    cmpg-float v6, v5, v1

    if-gez v6, :cond_11

    .line 801
    iget-object v6, v0, Ll/ۜ۫ۡ;->ܺ:Ll/ۢ۫ۡ;

    iget-object v9, v6, Ll/ۢ۫ۡ;->ۛ:Ll/֫ۖܽ;

    if-lt v3, v4, :cond_4

    goto/16 :goto_a

    .line 802
    :cond_4
    iget v10, v0, Ll/ۜ۫ۡ;->ᩳ:I

    if-lt v3, v10, :cond_7

    .line 803
    iget-object v10, v0, Ll/ۜ۫ۡ;->᩷:Ljava/util/function/IntUnaryOperator;

    if-nez v10, :cond_5

    move v3, v4

    goto :goto_2

    :cond_5
    invoke-interface {v10, v3}, Ljava/util/function/IntUnaryOperator;->applyAsInt(I)I

    move-result v3

    invoke-static {v4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    :goto_2
    iput v3, v0, Ll/ۜ۫ۡ;->ᩳ:I

    .line 804
    iget v10, v0, Ll/ۜ۫ۡ;->ܿ:I

    if-le v3, v10, :cond_6

    goto :goto_3

    :cond_6
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid text segment end"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 806
    :cond_7
    :goto_3
    iget v3, v0, Ll/ۜ۫ۡ;->ܿ:I

    iget v10, v0, Ll/ۜ۫ۡ;->ᩳ:I

    iget-object v11, v0, Ll/ۜ۫ۡ;->ۡ:Ljava/lang/CharSequence;

    invoke-static {v3, v10, v11}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v3

    .line 807
    iget-object v10, v0, Ll/ۜ۫ۡ;->֫:[F

    if-eqz v10, :cond_8

    iget v12, v0, Ll/ۜ۫ۡ;->ܿ:I

    iget v13, v0, Ll/ۜ۫ۡ;->᩻:I

    if-lt v12, v13, :cond_8

    iget v14, v0, Ll/ۜ۫ۡ;->ܳ:I

    if-ge v12, v14, :cond_8

    .line 808
    iget v6, v0, Ll/ۜ۫ۡ;->ۜ:F

    sub-int v9, v3, v13

    sub-int/2addr v9, v7

    aget v7, v10, v9

    add-float/2addr v6, v7

    iput v6, v0, Ll/ۜ۫ۡ;->ۖ:F

    goto/16 :goto_9

    .line 809
    :cond_8
    iget v10, v0, Ll/ۜ۫ۡ;->ܿ:I

    invoke-direct {v0, v10}, Ll/ۜ۫ۡ;->֫(I)Z

    move-result v10

    if-eqz v10, :cond_f

    .line 810
    iget v6, v0, Ll/ۜ۫ۡ;->ܿ:I

    iput v6, v0, Ll/ۜ۫ۡ;->᩻:I

    .line 811
    iput v3, v0, Ll/ۜ۫ۡ;->ܳ:I

    .line 812
    :goto_4
    iget v6, v0, Ll/ۜ۫ۡ;->ܳ:I

    iget v8, v0, Ll/ۜ۫ۡ;->ᩳ:I

    if-ge v6, v8, :cond_a

    .line 813
    invoke-static {v6, v8, v11}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v6

    .line 814
    iget v8, v0, Ll/ۜ۫ۡ;->ܳ:I

    sub-int v10, v6, v8

    if-ne v10, v7, :cond_9

    invoke-direct {v0, v8}, Ll/ۜ۫ۡ;->֫(I)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_5

    .line 815
    :cond_9
    iput v6, v0, Ll/ۜ۫ۡ;->ܳ:I

    goto :goto_4

    .line 817
    :cond_a
    :goto_5
    iget v6, v0, Ll/ۜ۫ۡ;->ܳ:I

    iget v7, v0, Ll/ۜ۫ۡ;->᩻:I

    sub-int v8, v6, v7

    .line 818
    new-array v10, v8, [C

    const/4 v12, 0x0

    .line 819
    invoke-static {v11, v7, v6, v10, v12}, Landroid/text/TextUtils;->getChars(Ljava/lang/CharSequence;II[CI)V

    .line 820
    new-array v6, v8, [F

    iput-object v6, v0, Ll/ۜ۫ۡ;->֫:[F

    .line 822
    invoke-virtual {v9, v10, v12, v8, v6}, Landroid/graphics/Paint;->getTextWidths([CII[F)I

    const-wide/16 v6, 0x0

    const/4 v13, 0x0

    :goto_6
    if-ge v13, v8, :cond_b

    .line 825
    iget-object v14, v0, Ll/ۜ۫ۡ;->֫:[F

    aget v15, v14, v13

    move/from16 v16, v13

    float-to-double v12, v15

    add-double/2addr v6, v12

    .line 826
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-float v12, v12

    aput v12, v14, v16

    add-int/lit8 v13, v16, 0x1

    const/4 v12, 0x0

    goto :goto_6

    .line 829
    :cond_b
    iget-object v6, v0, Ll/ۜ۫ۡ;->֫:[F

    add-int/lit8 v7, v8, -0x1

    const/4 v12, 0x0

    invoke-virtual {v9, v10, v12, v8}, Landroid/graphics/Paint;->measureText([CII)F

    move-result v8

    aput v8, v6, v7

    .line 831
    iget v6, v0, Ll/ۜ۫ۡ;->᩻:I

    :goto_7
    iget v7, v0, Ll/ۜ۫ۡ;->ܳ:I

    if-ge v6, v7, :cond_e

    .line 832
    invoke-static {v6, v7, v11}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v7

    .line 833
    iget v8, v0, Ll/ۜ۫ۡ;->᩻:I

    if-ne v6, v8, :cond_c

    const/4 v8, 0x0

    goto :goto_8

    :cond_c
    iget-object v9, v0, Ll/ۜ۫ۡ;->֫:[F

    sub-int v8, v6, v8

    add-int/lit8 v8, v8, -0x1

    aget v8, v9, v8

    :goto_8
    add-int/lit8 v6, v6, 0x1

    if-ge v6, v7, :cond_d

    .line 835
    iget-object v9, v0, Ll/ۜ۫ۡ;->֫:[F

    iget v10, v0, Ll/ۜ۫ۡ;->᩻:I

    sub-int v10, v6, v10

    add-int/lit8 v10, v10, -0x1

    aput v8, v9, v10

    goto :goto_8

    :cond_d
    move v6, v7

    goto :goto_7

    .line 839
    :cond_e
    iget v6, v0, Ll/ۜ۫ۡ;->ۖ:F

    iput v6, v0, Ll/ۜ۫ۡ;->ۜ:F

    .line 840
    iget-object v7, v0, Ll/ۜ۫ۡ;->֫:[F

    iget v8, v0, Ll/ۜ۫ۡ;->᩻:I

    sub-int v8, v3, v8

    add-int/lit8 v8, v8, -0x1

    aget v7, v7, v8

    add-float/2addr v6, v7

    iput v6, v0, Ll/ۜ۫ۡ;->ۖ:F

    const/4 v8, 0x0

    goto :goto_9

    .line 842
    :cond_f
    iput-object v8, v0, Ll/ۜ۫ۡ;->֫:[F

    .line 843
    iget v7, v0, Ll/ۜ۫ۡ;->ۖ:F

    iget v9, v0, Ll/ۜ۫ۡ;->ܿ:I

    iget v10, v0, Ll/ۜ۫ۡ;->ܽ:F

    add-float/2addr v10, v7

    invoke-virtual {v6, v11, v9, v3, v10}, Ll/ۢ۫ۡ;->֫(Ljava/lang/CharSequence;IIF)F

    move-result v6

    add-float/2addr v6, v7

    iput v6, v0, Ll/ۜ۫ۡ;->ۖ:F

    .line 845
    :goto_9
    iput v3, v0, Ll/ۜ۫ۡ;->ܿ:I

    .line 876
    :goto_a
    iget v3, v0, Ll/ۜ۫ۡ;->ܿ:I

    if-le v3, v2, :cond_10

    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

    :cond_10
    const/4 v7, 0x1

    goto/16 :goto_1

    .line 878
    :cond_11
    iget v2, v0, Ll/ۜ۫ۡ;->ۖ:F

    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    return v1

    .line 863
    :cond_12
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v1
.end method

.method public final ֫(F)I
    .locals 4

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    .line 883
    iget p1, p0, Ll/ۜ۫ۡ;->ۢ:I

    return p1

    .line 884
    :cond_0
    iget v0, p0, Ll/ۜ۫ۡ;->ܿ:I

    iget v1, p0, Ll/ۜ۫ۡ;->ۧ:I

    if-ge v0, v1, :cond_1

    .line 886
    iget v2, p0, Ll/ۜ۫ۡ;->ۖ:F

    .line 888
    iget-object v3, p0, Ll/ۜ۫ۡ;->ۡ:Ljava/lang/CharSequence;

    invoke-static {v0, v1, v3}, Ll/᩹ܽܽ;->֫(IILjava/lang/CharSequence;)I

    move-result v1

    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 858
    invoke-virtual {p0, v3, v1}, Ll/ۜ۫ۡ;->֫(FI)F

    move-result v1

    sub-float/2addr v1, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v1, v3

    add-float/2addr v1, v2

    cmpl-float v1, v1, p1

    if-lez v1, :cond_0

    return v0

    :cond_1
    return v1
.end method
