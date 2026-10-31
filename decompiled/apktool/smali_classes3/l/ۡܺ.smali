.class public final Ll/ۡܺ;
.super Ljava/lang/Object;
.source "K51P"


# static fields
.field public static ۖ:Ll/ۧۤᩴ;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "BanConcurrentHashMap"
        }
    .end annotation
.end field

.field public static final ܺ:Landroid/graphics/RectF;


# instance fields
.field public ֫:F

.field public final ۜ:Ll/ۢܺ;

.field public final ۡ:Landroid/widget/TextView;

.field public ۢ:Landroid/text/TextPaint;

.field public ۧ:F

.field public final ܳ:Landroid/content/Context;

.field public ܽ:F

.field public ܿ:I

.field public ᩳ:[I

.field public ᩷:Z

.field public ᩻:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 64
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    sput-object v0, Ll/ۡܺ;->ܺ:Landroid/graphics/RectF;

    .line 75
    new-instance v0, Ll/ۧۤᩴ;

    invoke-direct {v0}, Ll/ۧۤᩴ;-><init>()V

    sput-object v0, Ll/ۡܺ;->ۖ:Ll/ۧۤᩴ;

    return-void
.end method

.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 2

    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 82
    iput v0, p0, Ll/ۡܺ;->ܿ:I

    .line 84
    iput-boolean v0, p0, Ll/ۡܺ;->᩷:Z

    const/high16 v1, -0x40800000    # -1.0f

    .line 86
    iput v1, p0, Ll/ۡܺ;->ܽ:F

    .line 88
    iput v1, p0, Ll/ۡܺ;->ۧ:F

    .line 90
    iput v1, p0, Ll/ۡܺ;->֫:F

    new-array v1, v0, [I

    .line 93
    iput-object v1, p0, Ll/ۡܺ;->ᩳ:[I

    .line 97
    iput-boolean v0, p0, Ll/ۡܺ;->᩻:Z

    .line 148
    iput-object p1, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    .line 149
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ll/ۡܺ;->ܳ:Landroid/content/Context;

    .line 150
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1d

    if-lt p1, v0, :cond_0

    .line 151
    new-instance p1, Ll/᩷ܺ;

    invoke-direct {p1}, Ll/᩷ܺ;-><init>()V

    iput-object p1, p0, Ll/ۡܺ;->ۜ:Ll/ۢܺ;

    return-void

    :cond_0
    const/16 v0, 0x17

    if-lt p1, v0, :cond_1

    .line 153
    new-instance p1, Ll/ۜܺ;

    invoke-direct {p1}, Ll/ۜܺ;-><init>()V

    iput-object p1, p0, Ll/ۡܺ;->ۜ:Ll/ۢܺ;

    return-void

    .line 155
    :cond_1
    new-instance p1, Ll/ۢܺ;

    invoke-direct {p1}, Ll/ۢܺ;-><init>()V

    iput-object p1, p0, Ll/ۡܺ;->ۜ:Ll/ۢܺ;

    return-void
.end method

.method private ֫(Landroid/graphics/RectF;)I
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 680
    iget-object v2, v0, Ll/ۡܺ;->ᩳ:[I

    array-length v2, v2

    if-eqz v2, :cond_7

    add-int/lit8 v2, v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    :goto_0
    if-gt v3, v2, :cond_6

    add-int v4, v3, v2

    .line 690
    div-int/lit8 v4, v4, 0x2

    .line 691
    iget-object v5, v0, Ll/ۡܺ;->ᩳ:[I

    aget v5, v5, v4

    .line 741
    iget-object v10, v0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v10}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v6

    .line 742
    invoke-virtual {v10}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v7

    if-eqz v7, :cond_0

    .line 744
    invoke-interface {v7, v6, v10}, Landroid/text/method/TransformationMethod;->getTransformation(Ljava/lang/CharSequence;Landroid/view/View;)Ljava/lang/CharSequence;

    move-result-object v7

    if-eqz v7, :cond_0

    move-object/from16 v19, v7

    goto :goto_1

    :cond_0
    move-object/from16 v19, v6

    .line 750
    :goto_1
    invoke-virtual {v10}, Landroid/widget/TextView;->getMaxLines()I

    move-result v15

    .line 705
    iget-object v6, v0, Ll/ۡܺ;->ۢ:Landroid/text/TextPaint;

    if-nez v6, :cond_1

    .line 706
    new-instance v6, Landroid/text/TextPaint;

    invoke-direct {v6}, Landroid/text/TextPaint;-><init>()V

    iput-object v6, v0, Ll/ۡܺ;->ۢ:Landroid/text/TextPaint;

    goto :goto_2

    .line 708
    :cond_1
    invoke-virtual {v6}, Landroid/graphics/Paint;->reset()V

    .line 710
    :goto_2
    iget-object v6, v0, Ll/ۡܺ;->ۢ:Landroid/text/TextPaint;

    invoke-virtual {v10}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    .line 711
    iget-object v6, v0, Ll/ۡܺ;->ۢ:Landroid/text/TextPaint;

    int-to-float v5, v5

    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->setTextSize(F)V

    const-string v5, "getLayoutAlignment"

    .line 754
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    invoke-static {v5, v10, v6}, Ll/ۡܺ;->֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/text/Layout$Alignment;

    .line 756
    iget v6, v1, Landroid/graphics/RectF;->right:F

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v14

    .line 722
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x17

    if-lt v6, v7, :cond_2

    .line 723
    iget-object v11, v0, Ll/ۡܺ;->ۢ:Landroid/text/TextPaint;

    iget-object v12, v0, Ll/ۡܺ;->ۜ:Ll/ۢܺ;

    move-object/from16 v6, v19

    move-object v7, v5

    move v8, v14

    move v9, v15

    invoke-static/range {v6 .. v12}, Ll/᩻ܺ;->֫(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;IILandroid/widget/TextView;Landroid/text/TextPaint;Ll/ۢܺ;)Landroid/text/StaticLayout;

    move-result-object v5

    move v7, v15

    goto :goto_3

    .line 726
    :cond_2
    invoke-virtual {v10}, Landroid/widget/TextView;->getLineSpacingMultiplier()F

    move-result v16

    .line 727
    invoke-virtual {v10}, Landroid/widget/TextView;->getLineSpacingExtra()F

    move-result v17

    .line 728
    invoke-virtual {v10}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v18

    .line 732
    new-instance v6, Landroid/text/StaticLayout;

    iget-object v13, v0, Ll/ۡܺ;->ۢ:Landroid/text/TextPaint;

    move-object v11, v6

    move-object/from16 v12, v19

    move v7, v15

    move-object v15, v5

    invoke-direct/range {v11 .. v18}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V

    move-object v5, v6

    :goto_3
    const/4 v6, -0x1

    if-eq v7, v6, :cond_3

    .line 759
    invoke-virtual {v5}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v6

    if-gt v6, v7, :cond_4

    .line 760
    invoke-virtual {v5}, Landroid/text/StaticLayout;->getLineCount()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    invoke-virtual {v5, v6}, Landroid/text/Layout;->getLineEnd(I)I

    move-result v6

    invoke-interface/range {v19 .. v19}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-eq v6, v7, :cond_3

    goto :goto_4

    .line 765
    :cond_3
    invoke-virtual {v5}, Landroid/text/Layout;->getHeight()I

    move-result v5

    int-to-float v5, v5

    iget v6, v1, Landroid/graphics/RectF;->bottom:F

    cmpl-float v5, v5, v6

    if-lez v5, :cond_5

    :cond_4
    :goto_4
    add-int/lit8 v4, v4, -0x1

    move v2, v4

    goto/16 :goto_0

    :cond_5
    add-int/lit8 v4, v4, 0x1

    move/from16 v20, v4

    move v4, v3

    move/from16 v3, v20

    goto/16 :goto_0

    .line 700
    :cond_6
    iget-object v1, v0, Ll/ۡܺ;->ᩳ:[I

    aget v1, v1, v4

    return v1

    .line 682
    :cond_7
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "No available text sizes to choose from."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 783
    :try_start_0
    invoke-static {p0}, Ll/ۡܺ;->֫(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object p0

    const/4 v0, 0x0

    .line 784
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 792
    throw p0

    :catch_0
    return-object p2
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 4

    const/4 v0, 0x0

    .line 800
    :try_start_0
    sget-object v1, Ll/ۡܺ;->ۖ:Ll/ۧۤᩴ;

    invoke-virtual {v1, p0}, Ll/ۧۤᩴ;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    if-nez v2, :cond_0

    .line 802
    const-class v2, Landroid/widget/TextView;

    invoke-virtual {v2, p0, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    if-eqz v2, :cond_0

    const/4 v3, 0x1

    .line 804
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 806
    invoke-virtual {v1, p0, v2}, Ll/ۧۤᩴ;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-object v2

    :catch_0
    return-object v0
.end method

.method private ֫(FFF)V
    .locals 3

    const-string v0, "px) is less or equal to (0px)"

    const/4 v1, 0x0

    cmpg-float v2, p1, v1

    if-lez v2, :cond_2

    cmpg-float v2, p2, p1

    if-lez v2, :cond_1

    cmpg-float v1, p3, v1

    if-lez v1, :cond_0

    const/4 v0, 0x1

    .line 552
    iput v0, p0, Ll/ۡܺ;->ܿ:I

    .line 553
    iput p1, p0, Ll/ۡܺ;->ۧ:F

    .line 554
    iput p2, p0, Ll/ۡܺ;->֫:F

    .line 555
    iput p3, p0, Ll/ۡܺ;->ܽ:F

    const/4 p1, 0x0

    .line 556
    iput-boolean p1, p0, Ll/ۡܺ;->᩻:Z

    return-void

    .line 547
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "The auto-size step granularity ("

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 541
    :cond_1
    new-instance p3, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Maximum auto-size text size ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, "px) is less or equal to minimum auto-size text size ("

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p1, "px)"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p3

    .line 536
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v1, "Minimum auto-size text size ("

    invoke-direct {p3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ֫([I)[I
    .locals 6

    .line 497
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_1

    .line 501
    :cond_0
    invoke-static {p0}, Ljava/util/Arrays;->sort([I)V

    .line 503
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_2

    .line 505
    aget v4, p0, v3

    if-lez v4, :cond_1

    .line 508
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;)I

    move-result v5

    if-gez v5, :cond_1

    .line 509
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 513
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ne v0, v3, :cond_3

    :goto_1
    return-object p0

    .line 516
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result p0

    .line 517
    new-array v0, p0, [I

    :goto_2
    if-ge v2, p0, :cond_4

    .line 519
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_4
    return-object v0
.end method

.method private ۜ()Z
    .locals 7

    .line 560
    invoke-direct {p0}, Ll/ۡܺ;->ۢ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    iget v0, p0, Ll/ۡܺ;->ܿ:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_3

    .line 564
    iget-boolean v0, p0, Ll/ۡܺ;->᩻:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۡܺ;->ᩳ:[I

    array-length v0, v0

    if-nez v0, :cond_2

    .line 566
    :cond_0
    iget v0, p0, Ll/ۡܺ;->֫:F

    iget v3, p0, Ll/ۡܺ;->ۧ:F

    sub-float/2addr v0, v3

    iget v3, p0, Ll/ۡܺ;->ܽ:F

    div-float/2addr v0, v3

    float-to-double v3, v0

    invoke-static {v3, v4}, Ljava/lang/Math;->floor(D)D

    move-result-wide v3

    double-to-int v0, v3

    add-int/2addr v0, v2

    .line 568
    new-array v3, v0, [I

    :goto_0
    if-ge v1, v0, :cond_1

    .line 570
    iget v4, p0, Ll/ۡܺ;->ۧ:F

    int-to-float v5, v1

    iget v6, p0, Ll/ۡܺ;->ܽ:F

    mul-float v5, v5, v6

    add-float/2addr v5, v4

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v4

    aput v4, v3, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 573
    :cond_1
    invoke-static {v3}, Ll/ۡܺ;->֫([I)[I

    move-result-object v0

    iput-object v0, p0, Ll/ۡܺ;->ᩳ:[I

    .line 575
    :cond_2
    iput-boolean v2, p0, Ll/ۡܺ;->᩷:Z

    goto :goto_1

    .line 577
    :cond_3
    iput-boolean v1, p0, Ll/ۡܺ;->᩷:Z

    .line 580
    :goto_1
    iget-boolean v0, p0, Ll/ۡܺ;->᩷:Z

    return v0
.end method

.method private ۢ()Z
    .locals 1

    .line 833
    iget-object v0, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    instance-of v0, v0, Ll/᩺ۢ;

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private ᩷()Z
    .locals 5

    .line 484
    iget-object v0, p0, Ll/ۡܺ;->ᩳ:[I

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lez v1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 485
    :goto_0
    iput-boolean v4, p0, Ll/ۡܺ;->᩻:Z

    if-eqz v4, :cond_1

    .line 487
    iput v3, p0, Ll/ۡܺ;->ܿ:I

    .line 488
    aget v2, v0, v2

    int-to-float v2, v2

    iput v2, p0, Ll/ۡܺ;->ۧ:F

    sub-int/2addr v1, v3

    .line 489
    aget v0, v0, v1

    int-to-float v0, v0

    iput v0, p0, Ll/ۡܺ;->֫:F

    const/high16 v0, -0x40800000    # -1.0f

    .line 490
    iput v0, p0, Ll/ۡܺ;->ܽ:F

    :cond_1
    return v4
.end method


# virtual methods
.method public final ֫()V
    .locals 4

    .line 589
    invoke-virtual {p0}, Ll/ۡܺ;->᩻()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    .line 593
    :cond_0
    iget-boolean v0, p0, Ll/ۡܺ;->᩷:Z

    if-eqz v0, :cond_6

    .line 594
    iget-object v0, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-lez v0, :cond_5

    iget-object v0, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_1

    .line 598
    :cond_1
    iget-object v0, p0, Ll/ۡܺ;->ۜ:Ll/ۢܺ;

    iget-object v1, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Ll/ۢܺ;->֫(Landroid/widget/TextView;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x100000

    const/high16 v1, 0x100000

    goto :goto_0

    .line 602
    :cond_2
    iget-object v0, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    .line 601
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    iget-object v1, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    .line 602
    invoke-virtual {v1}, Landroid/widget/TextView;->getTotalPaddingRight()I

    move-result v1

    sub-int/2addr v0, v1

    move v1, v0

    .line 603
    :goto_0
    iget-object v0, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v0

    iget-object v2, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    move-result v2

    sub-int/2addr v0, v2

    iget-object v2, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    .line 604
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    move-result v2

    sub-int v2, v0, v2

    if-lez v1, :cond_5

    if-gtz v2, :cond_3

    goto :goto_1

    .line 610
    :cond_3
    sget-object v3, Ll/ۡܺ;->ܺ:Landroid/graphics/RectF;

    move-object v0, v3

    monitor-enter v0

    .line 611
    :try_start_0
    invoke-virtual {v3}, Landroid/graphics/RectF;->setEmpty()V

    int-to-float v1, v1

    .line 612
    iput v1, v3, Landroid/graphics/RectF;->right:F

    int-to-float v1, v2

    .line 613
    iput v1, v3, Landroid/graphics/RectF;->bottom:F

    .line 614
    invoke-direct {p0, v3}, Ll/ۡܺ;->֫(Landroid/graphics/RectF;)I

    move-result v1

    int-to-float v1, v1

    .line 615
    iget-object v2, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getTextSize()F

    move-result v2

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_4

    const/4 v2, 0x0

    .line 616
    invoke-virtual {p0, v1, v2}, Ll/ۡܺ;->֫(FI)V

    .line 618
    :cond_4
    monitor-exit v0

    goto :goto_2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_5
    :goto_1
    return-void

    :cond_6
    :goto_2
    const/4 v0, 0x1

    .line 622
    iput-boolean v0, p0, Ll/ۡܺ;->᩷:Z

    return-void
.end method

.method public final ֫(FI)V
    .locals 2

    .line 636
    iget-object v0, p0, Ll/ۡܺ;->ܳ:Landroid/content/Context;

    if-nez v0, :cond_0

    .line 637
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    goto :goto_0

    .line 638
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 640
    :goto_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p2, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    .line 645
    iget-object p2, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    cmpl-float v0, p1, v0

    if-eqz v0, :cond_3

    .line 646
    invoke-virtual {p2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 648
    invoke-virtual {p2}, Landroid/view/View;->isInLayout()Z

    move-result p1

    .line 650
    invoke-virtual {p2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 652
    iput-boolean v0, p0, Ll/ۡܺ;->᩷:Z

    :try_start_0
    const-string v0, "nullLayouts"

    .line 656
    invoke-static {v0}, Ll/ۡܺ;->֫(Ljava/lang/String;)Ljava/lang/reflect/Method;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 658
    invoke-virtual {v0, p2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    :cond_1
    :goto_1
    if-nez p1, :cond_2

    .line 665
    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    goto :goto_2

    .line 667
    :cond_2
    invoke-virtual {p2}, Landroid/view/View;->forceLayout()V

    .line 670
    :goto_2
    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    :cond_3
    return-void
.end method

.method public final ֫(I)V
    .locals 3

    .line 255
    invoke-direct {p0}, Ll/ۡܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    .line 261
    iget-object p1, p0, Ll/ۡܺ;->ܳ:Landroid/content/Context;

    .line 262
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v0, 0x41400000    # 12.0f

    const/4 v1, 0x2

    .line 263
    invoke-static {v1, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    const/high16 v2, 0x42e00000    # 112.0f

    .line 267
    invoke-static {v1, v2, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v1, 0x3f800000    # 1.0f

    .line 272
    invoke-direct {p0, v0, p1, v1}, Ll/ۡܺ;->֫(FFF)V

    .line 276
    invoke-direct {p0}, Ll/ۡܺ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 277
    invoke-virtual {p0}, Ll/ۡܺ;->֫()V

    return-void

    .line 281
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown auto-size text type: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 281
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/4 p1, 0x0

    .line 626
    iput p1, p0, Ll/ۡܺ;->ܿ:I

    const/high16 v0, -0x40800000    # -1.0f

    .line 627
    iput v0, p0, Ll/ۡܺ;->ۧ:F

    .line 628
    iput v0, p0, Ll/ۡܺ;->֫:F

    .line 629
    iput v0, p0, Ll/ۡܺ;->ܽ:F

    new-array v0, p1, [I

    .line 630
    iput-object v0, p0, Ll/ۡܺ;->ᩳ:[I

    .line 631
    iput-boolean p1, p0, Ll/ۡܺ;->᩷:Z

    :cond_2
    return-void
.end method

.method public final ֫(IIII)V
    .locals 1

    .line 321
    invoke-direct {p0}, Ll/ۡܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 322
    iget-object v0, p0, Ll/ۡܺ;->ܳ:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    int-to-float p1, p1

    .line 323
    invoke-static {p4, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    int-to-float p2, p2

    .line 325
    invoke-static {p4, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p2

    int-to-float p3, p3

    .line 327
    invoke-static {p4, p3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p3

    .line 330
    invoke-direct {p0, p1, p2, p3}, Ll/ۡܺ;->֫(FFF)V

    .line 333
    invoke-direct {p0}, Ll/ۡܺ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 334
    invoke-virtual {p0}, Ll/ۡܺ;->֫()V

    :cond_0
    return-void
.end method

.method public final ֫(Landroid/util/AttributeSet;I)V
    .locals 12

    .line 164
    iget-object v0, p0, Ll/ۡܺ;->ܳ:Landroid/content/Context;

    sget-object v3, Ll/ۗᩳ;->ۢ:[I

    const/4 v7, 0x0

    invoke-virtual {v0, p1, v3, p2, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v8

    .line 166
    iget-object v1, p0, Ll/ۡܺ;->ۡ:Landroid/widget/TextView;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    move-object v4, p1

    move-object v5, v8

    move v6, p2

    invoke-static/range {v1 .. v6}, Ll/ܿ᩺;->֫(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    const/4 p1, 0x5

    .line 169
    invoke-virtual {v8, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 170
    invoke-virtual {v8, p1, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result p1

    iput p1, p0, Ll/ۡܺ;->ܿ:I

    :cond_0
    const/4 p1, 0x4

    .line 173
    invoke-virtual {v8, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p2

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz p2, :cond_1

    .line 174
    invoke-virtual {v8, p1, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result p1

    goto :goto_0

    :cond_1
    const/high16 p1, -0x40800000    # -1.0f

    :goto_0
    const/4 p2, 0x2

    .line 178
    invoke-virtual {v8, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 179
    invoke-virtual {v8, p2, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v2

    goto :goto_1

    :cond_2
    const/high16 v2, -0x40800000    # -1.0f

    :goto_1
    const/4 v3, 0x1

    .line 183
    invoke-virtual {v8, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 184
    invoke-virtual {v8, v3, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    move-result v4

    goto :goto_2

    :cond_3
    const/high16 v4, -0x40800000    # -1.0f

    :goto_2
    const/4 v5, 0x3

    .line 188
    invoke-virtual {v8, v5}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 189
    invoke-virtual {v8, v5, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v5

    if-lez v5, :cond_6

    .line 192
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    .line 193
    invoke-virtual {v6, v5}, Landroid/content/res/Resources;->obtainTypedArray(I)Landroid/content/res/TypedArray;

    move-result-object v5

    .line 471
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->length()I

    move-result v6

    .line 472
    new-array v9, v6, [I

    if-lez v6, :cond_5

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v6, :cond_4

    const/4 v11, -0x1

    .line 476
    invoke-virtual {v5, v10, v11}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v11

    aput v11, v9, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    .line 478
    :cond_4
    invoke-static {v9}, Ll/ۡܺ;->֫([I)[I

    move-result-object v6

    iput-object v6, p0, Ll/ۡܺ;->ᩳ:[I

    .line 479
    invoke-direct {p0}, Ll/ۡܺ;->᩷()Z

    .line 195
    :cond_5
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 198
    :cond_6
    invoke-virtual {v8}, Landroid/content/res/TypedArray;->recycle()V

    .line 200
    invoke-direct {p0}, Ll/ۡܺ;->ۢ()Z

    move-result v5

    if-eqz v5, :cond_c

    .line 201
    iget v5, p0, Ll/ۡܺ;->ܿ:I

    if-ne v5, v3, :cond_b

    .line 205
    iget-boolean v3, p0, Ll/ۡܺ;->᩻:Z

    if-nez v3, :cond_a

    .line 207
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    cmpl-float v3, v2, v1

    if-nez v3, :cond_7

    const/high16 v2, 0x41400000    # 12.0f

    .line 210
    invoke-static {p2, v2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v2

    :cond_7
    cmpl-float v3, v4, v1

    if-nez v3, :cond_8

    const/high16 v3, 0x42e00000    # 112.0f

    .line 217
    invoke-static {p2, v3, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    :cond_8
    cmpl-float p2, p1, v1

    if-nez p2, :cond_9

    const/high16 p1, 0x3f800000    # 1.0f

    .line 228
    :cond_9
    invoke-direct {p0, v2, v4, p1}, Ll/ۡܺ;->֫(FFF)V

    .line 233
    :cond_a
    invoke-direct {p0}, Ll/ۡܺ;->ۜ()Z

    :cond_b
    return-void

    .line 236
    :cond_c
    iput v7, p0, Ll/ۡܺ;->ܿ:I

    return-void
.end method

.method public final ֫([II)V
    .locals 5

    .line 363
    invoke-direct {p0}, Ll/ۡܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 364
    array-length v0, p1

    const/4 v1, 0x0

    if-lez v0, :cond_3

    .line 366
    new-array v2, v0, [I

    if-nez p2, :cond_0

    .line 369
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    goto :goto_1

    .line 371
    :cond_0
    iget-object v3, p0, Ll/ۡܺ;->ܳ:Landroid/content/Context;

    .line 372
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    :goto_0
    if-ge v1, v0, :cond_1

    .line 375
    aget v4, p1, v1

    int-to-float v4, v4

    invoke-static {p2, v4, v3}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    aput v4, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 380
    :cond_1
    :goto_1
    invoke-static {v2}, Ll/ۡܺ;->֫([I)[I

    move-result-object p2

    iput-object p2, p0, Ll/ۡܺ;->ᩳ:[I

    .line 381
    invoke-direct {p0}, Ll/ۡܺ;->᩷()Z

    move-result p2

    if-eqz p2, :cond_2

    goto :goto_2

    .line 382
    :cond_2
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "None of the preset sizes is valid: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 383
    invoke-static {p1}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 386
    :cond_3
    iput-boolean v1, p0, Ll/ۡܺ;->᩻:Z

    .line 389
    :goto_2
    invoke-direct {p0}, Ll/ۡܺ;->ۜ()Z

    move-result p1

    if-eqz p1, :cond_4

    .line 390
    invoke-virtual {p0}, Ll/ۡܺ;->֫()V

    :cond_4
    return-void
.end method

.method public final ۧ()I
    .locals 1

    .line 455
    iget v0, p0, Ll/ۡܺ;->֫:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public final ܳ()I
    .locals 1

    .line 412
    iget v0, p0, Ll/ۡܺ;->ܿ:I

    return v0
.end method

.method public final ܽ()I
    .locals 1

    .line 440
    iget v0, p0, Ll/ۡܺ;->ۧ:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public final ܿ()[I
    .locals 1

    .line 467
    iget-object v0, p0, Ll/ۡܺ;->ᩳ:[I

    return-object v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 425
    iget v0, p0, Ll/ۡܺ;->ܽ:F

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    return v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 824
    invoke-direct {p0}, Ll/ۡܺ;->ۢ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Ll/ۡܺ;->ܿ:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
