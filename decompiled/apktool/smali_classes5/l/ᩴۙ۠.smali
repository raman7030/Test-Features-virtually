.class public final Ll/ᩴۙ۠;
.super Ljava/lang/Object;
.source "T5PO"

# interfaces
.implements Ll/᩷ۙ۠;
.implements Landroid/view/View$OnTouchListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# static fields
.field public static final ۡ֫:Landroid/view/animation/AccelerateDecelerateInterpolator;


# instance fields
.field public ֫֫:Landroid/view/View$OnLongClickListener;

.field public ۗ:Ll/ۘۙ۠;

.field public ۙ:Z

.field public ۛ:Ljava/lang/ref/WeakReference;

.field public final ۜ֫:Landroid/graphics/Matrix;

.field public ۟:I

.field public final ۢ֫:[F

.field public ۤ:Landroid/view/GestureDetector;

.field public final ۧ֫:[F

.field public ۨ:I

.field public final ۫:Landroid/graphics/Matrix;

.field public final ۬:Landroid/graphics/RectF;

.field public ܰ:I

.field public ܳ֫:Landroid/widget/ImageView$ScaleType;

.field public ܽ֫:F

.field public ܿ֫:Ll/֡ۙ۠;

.field public ᩳ֫:F

.field public final ᩶:Landroid/graphics/Matrix;

.field public ᩷֫:Z

.field public ᩸:F

.field public ᩹:F

.field public ᩺:I

.field public ᩻֫:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 60
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    sput-object v0, Ll/ᩴۙ۠;->ۡ֫:Landroid/view/animation/AccelerateDecelerateInterpolator;

    return-void
.end method

.method public constructor <init>(Ll/ۢۙ۠;)V
    .locals 3

    .line 145
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    .line 68
    iput v0, p0, Ll/ᩴۙ۠;->ᩳ֫:F

    const/high16 v0, 0x40400000    # 3.0f

    .line 69
    iput v0, p0, Ll/ᩴۙ۠;->ܽ֫:F

    const/4 v0, 0x0

    .line 72
    iput-boolean v0, p0, Ll/ᩴۙ۠;->ۙ:Z

    .line 119
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ᩴۙ۠;->᩶:Landroid/graphics/Matrix;

    .line 120
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ᩴۙ۠;->۫:Landroid/graphics/Matrix;

    .line 121
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    .line 122
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, p0, Ll/ᩴۙ۠;->۬:Landroid/graphics/RectF;

    const/16 v0, 0x9

    new-array v1, v0, [F

    .line 123
    iput-object v1, p0, Ll/ᩴۙ۠;->ۧ֫:[F

    const/4 v1, 0x2

    .line 135
    iput v1, p0, Ll/ᩴۙ۠;->᩻֫:I

    .line 139
    sget-object v1, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    iput-object v1, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    new-array v0, v0, [F

    .line 364
    iput-object v0, p0, Ll/ᩴۙ۠;->ۢ֫:[F

    .line 146
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ᩴۙ۠;->ۛ:Ljava/lang/ref/WeakReference;

    const/4 v0, 0x1

    .line 148
    invoke-virtual {p1, v0}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 149
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 153
    invoke-virtual {v1, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 158
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_1

    return-void

    .line 162
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, p0}, Ll/᩵ۙ۠;->֫(Landroid/content/Context;Ll/ᩴۙ۠;)Ll/֡ۙ۠;

    move-result-object v1

    iput-object v1, p0, Ll/ᩴۙ۠;->ܿ֫:Ll/֡ۙ۠;

    .line 164
    new-instance v1, Landroid/view/GestureDetector;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Ll/ۡۙ۠;

    invoke-direct {v2, p0}, Ll/ۡۙ۠;-><init>(Ll/ᩴۙ۠;)V

    invoke-direct {v1, p1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Ll/ᩴۙ۠;->ۤ:Landroid/view/GestureDetector;

    .line 188
    new-instance p1, Ll/ۜۙ۠;

    invoke-direct {p1, p0}, Ll/ۜۙ۠;-><init>(Ll/ᩴۙ۠;)V

    invoke-virtual {v1, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 664
    iput-boolean v0, p0, Ll/ᩴۙ۠;->᩷֫:Z

    .line 665
    invoke-virtual {p0}, Ll/ᩴۙ۠;->᩷()V

    return-void
.end method

.method public static ֫(Landroid/widget/ImageView;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 951
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method private ֫(Landroid/graphics/Matrix;)Landroid/graphics/RectF;
    .locals 4

    .line 801
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 804
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 806
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    int-to-float v1, v1

    .line 807
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v0

    int-to-float v0, v0

    .line 806
    iget-object v2, p0, Ll/ᩴۙ۠;->۬:Landroid/graphics/RectF;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3, v1, v0}, Landroid/graphics/RectF;->set(FFFF)V

    .line 808
    invoke-virtual {p1, v2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    return-object v2

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public static bridge synthetic ֫(Ll/ᩴۙ۠;)Landroid/view/View$OnLongClickListener;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۙ۠;->֫֫:Landroid/view/View$OnLongClickListener;

    return-object p0
.end method

.method private ֫(Landroid/graphics/drawable/Drawable;)V
    .locals 10

    .line 877
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_9

    if-nez p1, :cond_0

    goto/16 :goto_1

    .line 882
    :cond_0
    invoke-static {v0}, Ll/ᩴۙ۠;->ۧ(Landroid/widget/ImageView;)I

    move-result v1

    int-to-float v1, v1

    .line 883
    invoke-static {v0}, Ll/ᩴۙ۠;->֫(Landroid/widget/ImageView;)I

    move-result v0

    int-to-float v0, v0

    .line 884
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v2

    .line 885
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result p1

    .line 887
    iget-object v3, p0, Ll/ᩴۙ۠;->᩶:Landroid/graphics/Matrix;

    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    int-to-float v2, v2

    div-float v4, v1, v2

    int-to-float p1, p1

    div-float v5, v0, p1

    .line 892
    iget-object v6, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER:Landroid/widget/ImageView$ScaleType;

    const/4 v8, 0x0

    const/high16 v9, 0x40000000    # 2.0f

    if-ne v6, v7, :cond_1

    sub-float/2addr v1, v2

    div-float/2addr v1, v9

    sub-float/2addr v0, p1

    div-float/2addr v0, v9

    .line 893
    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto/16 :goto_0

    .line 896
    :cond_1
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    if-ne v6, v7, :cond_2

    .line 897
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    .line 898
    invoke-virtual {v3, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float v2, v2, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v9

    mul-float p1, p1, v4

    sub-float/2addr v0, p1

    div-float/2addr v0, v9

    .line 899
    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    .line 902
    :cond_2
    sget-object v7, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    if-ne v6, v7, :cond_3

    const/high16 v6, 0x3f800000    # 1.0f

    .line 903
    invoke-static {v4, v5}, Ljava/lang/Math;->min(FF)F

    move-result v4

    invoke-static {v6, v4}, Ljava/lang/Math;->min(FF)F

    move-result v4

    .line 904
    invoke-virtual {v3, v4, v4}, Landroid/graphics/Matrix;->postScale(FF)Z

    mul-float v2, v2, v4

    sub-float/2addr v1, v2

    div-float/2addr v1, v9

    mul-float p1, p1, v4

    sub-float/2addr v0, p1

    div-float/2addr v0, v9

    .line 905
    invoke-virtual {v3, v1, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    goto :goto_0

    .line 909
    :cond_3
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v8, v8, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 910
    new-instance v5, Landroid/graphics/RectF;

    invoke-direct {v5, v8, v8, v1, v0}, Landroid/graphics/RectF;-><init>(FFFF)V

    float-to-int v0, v8

    .line 912
    rem-int/lit16 v0, v0, 0xb4

    if-eqz v0, :cond_4

    .line 913
    new-instance v4, Landroid/graphics/RectF;

    invoke-direct {v4, v8, v8, p1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 916
    :cond_4
    sget-object p1, Ll/ܺۙ۠;->֫:[I

    iget-object v0, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p1, p1, v0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_8

    const/4 v0, 0x2

    if-eq p1, v0, :cond_7

    const/4 v0, 0x3

    if-eq p1, v0, :cond_6

    const/4 v0, 0x4

    if-eq p1, v0, :cond_5

    goto :goto_0

    .line 931
    :cond_5
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v3, v4, v5, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_0

    .line 918
    :cond_6
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->CENTER:Landroid/graphics/Matrix$ScaleToFit;

    .line 919
    invoke-virtual {v3, v4, v5, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_0

    .line 927
    :cond_7
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->END:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v3, v4, v5, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    goto :goto_0

    .line 923
    :cond_8
    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->START:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v3, v4, v5, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 848
    :goto_0
    iget-object p1, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    invoke-virtual {p1}, Landroid/graphics/Matrix;->reset()V

    .line 311
    invoke-virtual {p1, v8}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 312
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۢ()V

    .line 850
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ܽ()Landroid/graphics/Matrix;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ᩴۙ۠;->ۧ(Landroid/graphics/Matrix;)V

    .line 851
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۡ()Z

    :cond_9
    :goto_1
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴۙ۠;Landroid/graphics/Matrix;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ᩴۙ۠;->ۧ(Landroid/graphics/Matrix;)V

    return-void
.end method

.method private ۡ()Z
    .locals 12

    .line 733
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    .line 738
    :cond_0
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ܽ()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-direct {p0, v2}, Ll/ᩴۙ۠;->֫(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v2

    if-nez v2, :cond_1

    :goto_0
    return v1

    .line 743
    :cond_1
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    .line 746
    invoke-static {v0}, Ll/ᩴۙ۠;->֫(Landroid/widget/ImageView;)I

    move-result v5

    int-to-float v5, v5

    const/high16 v6, 0x40000000    # 2.0f

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    cmpg-float v10, v3, v5

    if-gtz v10, :cond_4

    .line 748
    sget-object v10, Ll/ܺۙ۠;->֫:[I

    iget-object v11, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    move-result v11

    aget v10, v10, v11

    if-eq v10, v8, :cond_3

    if-eq v10, v7, :cond_2

    sub-float/2addr v5, v3

    div-float/2addr v5, v6

    .line 756
    iget v3, v2, Landroid/graphics/RectF;->top:F

    goto :goto_2

    :cond_2
    sub-float/2addr v5, v3

    .line 753
    iget v3, v2, Landroid/graphics/RectF;->top:F

    goto :goto_2

    .line 750
    :cond_3
    iget v3, v2, Landroid/graphics/RectF;->top:F

    goto :goto_1

    .line 759
    :cond_4
    iget v3, v2, Landroid/graphics/RectF;->top:F

    cmpl-float v10, v3, v9

    if-lez v10, :cond_5

    :goto_1
    neg-float v3, v3

    goto :goto_3

    .line 761
    :cond_5
    iget v3, v2, Landroid/graphics/RectF;->bottom:F

    cmpg-float v10, v3, v5

    if-gez v10, :cond_6

    :goto_2
    sub-float v3, v5, v3

    goto :goto_3

    :cond_6
    const/4 v3, 0x0

    .line 765
    :goto_3
    invoke-static {v0}, Ll/ᩴۙ۠;->ۧ(Landroid/widget/ImageView;)I

    move-result v0

    int-to-float v0, v0

    cmpg-float v5, v4, v0

    if-gtz v5, :cond_9

    .line 767
    sget-object v1, Ll/ܺۙ۠;->֫:[I

    iget-object v5, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v1, v1, v5

    if-eq v1, v8, :cond_8

    if-eq v1, v7, :cond_7

    sub-float/2addr v0, v4

    div-float/2addr v0, v6

    .line 775
    iget v1, v2, Landroid/graphics/RectF;->left:F

    goto :goto_4

    :cond_7
    sub-float/2addr v0, v4

    .line 772
    iget v1, v2, Landroid/graphics/RectF;->left:F

    :goto_4
    sub-float/2addr v0, v1

    goto :goto_5

    .line 769
    :cond_8
    iget v0, v2, Landroid/graphics/RectF;->left:F

    neg-float v0, v0

    :goto_5
    move v9, v0

    .line 778
    iput v7, p0, Ll/ᩴۙ۠;->᩻֫:I

    goto :goto_6

    .line 779
    :cond_9
    iget v4, v2, Landroid/graphics/RectF;->left:F

    cmpl-float v5, v4, v9

    if-lez v5, :cond_a

    .line 780
    iput v1, p0, Ll/ᩴۙ۠;->᩻֫:I

    neg-float v9, v4

    goto :goto_6

    .line 782
    :cond_a
    iget v1, v2, Landroid/graphics/RectF;->right:F

    cmpg-float v2, v1, v0

    if-gez v2, :cond_b

    sub-float v9, v0, v1

    .line 784
    iput v8, p0, Ll/ᩴۙ۠;->᩻֫:I

    goto :goto_6

    :cond_b
    const/4 v0, -0x1

    .line 786
    iput v0, p0, Ll/ᩴۙ۠;->᩻֫:I

    .line 790
    :goto_6
    iget-object v0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    invoke-virtual {v0, v9, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    return v8
.end method

.method private ۢ()V
    .locals 1

    .line 712
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 713
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ܽ()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩴۙ۠;->ۧ(Landroid/graphics/Matrix;)V

    :cond_0
    return-void
.end method

.method public static ۧ(Landroid/widget/ImageView;)I
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    .line 945
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result p0

    sub-int/2addr v0, p0

    return v0
.end method

.method public static bridge synthetic ۧ(Ll/ᩴۙ۠;)Landroid/graphics/Matrix;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    return-object p0
.end method

.method private ۧ(Landroid/graphics/Matrix;)V
    .locals 3

    .line 855
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 718
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 724
    instance-of v2, v1, Ll/᩷ۙ۠;

    if-nez v2, :cond_1

    .line 725
    sget-object v2, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 726
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The ImageView\'s ScaleType has been changed since attaching a PhotoViewAttacher"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 859
    :cond_1
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 6

    .line 436
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 439
    iget-boolean v1, p0, Ll/ᩴۙ۠;->᩷֫:Z

    if-eqz v1, :cond_1

    .line 440
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v1

    .line 441
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v2

    .line 442
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v3

    .line 443
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v4

    .line 452
    iget v5, p0, Ll/ᩴۙ۠;->۟:I

    if-ne v1, v5, :cond_0

    iget v5, p0, Ll/ᩴۙ۠;->ۨ:I

    if-ne v3, v5, :cond_0

    iget v5, p0, Ll/ᩴۙ۠;->᩺:I

    if-ne v4, v5, :cond_0

    iget v5, p0, Ll/ᩴۙ۠;->ܰ:I

    if-eq v2, v5, :cond_2

    .line 455
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩴۙ۠;->֫(Landroid/graphics/drawable/Drawable;)V

    .line 458
    iput v1, p0, Ll/ᩴۙ۠;->۟:I

    .line 459
    iput v2, p0, Ll/ᩴۙ۠;->ܰ:I

    .line 460
    iput v3, p0, Ll/ᩴۙ۠;->ۨ:I

    .line 461
    iput v4, p0, Ll/ᩴۙ۠;->᩺:I

    return-void

    .line 464
    :cond_1
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩴۙ۠;->֫(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    return-void
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 10

    .line 493
    iget-boolean v0, p0, Ll/ᩴۙ۠;->᩷֫:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    move-object v0, p1

    check-cast v0, Landroid/widget/ImageView;

    if-eqz v0, :cond_9

    .line 84
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_9

    .line 494
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 495
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v3, :cond_2

    const/4 v4, 0x3

    if-eq v2, v4, :cond_2

    const/4 p1, 0x5

    if-eq v2, p1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    .line 513
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 515
    :cond_1
    iput-boolean v3, p0, Ll/ᩴۙ۠;->ۙ:Z

    goto :goto_1

    .line 519
    :cond_2
    invoke-virtual {p0}, Ll/ᩴۙ۠;->᩻()F

    move-result v6

    .line 520
    iget v7, p0, Ll/ᩴۙ۠;->ᩳ֫:F

    cmpg-float v0, v6, v7

    if-gez v0, :cond_3

    .line 521
    new-instance v0, Ll/ۖۙ۠;

    iget v8, p0, Ll/ᩴۙ۠;->᩸:F

    iget v9, p0, Ll/ᩴۙ۠;->᩹:F

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Ll/ۖۙ۠;-><init>(Ll/ᩴۙ۠;FFFF)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 523
    :cond_3
    iget v7, p0, Ll/ᩴۙ۠;->ܽ֫:F

    cmpl-float v0, v6, v7

    if-lez v0, :cond_7

    .line 524
    new-instance v0, Ll/ۖۙ۠;

    iget v8, p0, Ll/ᩴۙ۠;->᩸:F

    iget v9, p0, Ll/ᩴۙ۠;->᩹:F

    move-object v4, v0

    move-object v5, p0

    invoke-direct/range {v4 .. v9}, Ll/ۖۙ۠;-><init>(Ll/ᩴۙ۠;FFFF)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_0
    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    .line 500
    invoke-interface {v0, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 702
    :cond_5
    iget-object p1, p0, Ll/ᩴۙ۠;->ۗ:Ll/ۘۙ۠;

    if-eqz p1, :cond_6

    .line 703
    invoke-virtual {p1}, Ll/ۘۙ۠;->֫()V

    const/4 p1, 0x0

    .line 704
    iput-object p1, p0, Ll/ᩴۙ۠;->ۗ:Ll/ۘۙ۠;

    .line 509
    :cond_6
    iput-boolean v1, p0, Ll/ᩴۙ۠;->ۙ:Z

    .line 531
    :cond_7
    :goto_1
    iget-object p1, p0, Ll/ᩴۙ۠;->ܿ֫:Ll/֡ۙ۠;

    if-eqz p1, :cond_8

    .line 532
    invoke-interface {p1, p2}, Ll/֡ۙ۠;->֫(Landroid/view/MotionEvent;)V

    const/4 v1, 0x1

    .line 536
    :cond_8
    iget-object p1, p0, Ll/ᩴۙ۠;->ۤ:Landroid/view/GestureDetector;

    if-eqz p1, :cond_9

    invoke-virtual {p1, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_9

    return v3

    :cond_9
    return v1
.end method

.method public final ֫()V
    .locals 4

    .line 228
    iget-object v0, p0, Ll/ᩴۙ۠;->ۛ:Ljava/lang/ref/WeakReference;

    if-nez v0, :cond_0

    return-void

    .line 232
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 236
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 237
    invoke-virtual {v2}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 238
    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 242
    :cond_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 702
    iget-object v0, p0, Ll/ᩴۙ۠;->ۗ:Ll/ۘۙ۠;

    if-eqz v0, :cond_2

    .line 703
    invoke-virtual {v0}, Ll/ۘۙ۠;->֫()V

    .line 704
    iput-object v1, p0, Ll/ᩴۙ۠;->ۗ:Ll/ۘۙ۠;

    .line 248
    :cond_2
    iget-object v0, p0, Ll/ᩴۙ۠;->ۤ:Landroid/view/GestureDetector;

    if-eqz v0, :cond_3

    .line 249
    invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 258
    :cond_3
    iput-object v1, p0, Ll/ᩴۙ۠;->ۛ:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public final ֫(FF)V
    .locals 9

    .line 368
    iget-object v0, p0, Ll/ᩴۙ۠;->ܿ֫:Ll/֡ۙ۠;

    invoke-interface {v0}, Ll/֡ۙ۠;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    goto/16 :goto_1

    .line 376
    :cond_0
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v1

    .line 377
    iget-boolean v2, p0, Ll/ᩴۙ۠;->ۙ:Z

    const/4 v3, 0x1

    const/4 v4, 0x2

    iget-object v5, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    if-nez v2, :cond_2

    .line 378
    iget-object v2, p0, Ll/ᩴۙ۠;->ۢ֫:[F

    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 379
    aget v6, v2, v4

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    int-to-float v6, v6

    const/4 v7, 0x5

    .line 380
    aget v8, v2, v7

    invoke-static {v8}, Ljava/lang/Math;->round(F)I

    move-result v8

    int-to-float v8, v8

    .line 382
    invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 383
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۢ()V

    .line 385
    invoke-virtual {v5, v2}, Landroid/graphics/Matrix;->getValues([F)V

    .line 386
    aget p2, v2, v4

    invoke-static {p2}, Ljava/lang/Math;->round(F)I

    move-result p2

    int-to-float p2, p2

    .line 387
    aget v2, v2, v7

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    int-to-float v2, v2

    cmpl-float p2, v6, p2

    if-nez p2, :cond_1

    cmpl-float p2, v8, v2

    if-eqz p2, :cond_3

    .line 389
    :cond_1
    iput-boolean v3, p0, Ll/ᩴۙ۠;->ۙ:Z

    goto :goto_0

    .line 392
    :cond_2
    invoke-virtual {v5, p1, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 393
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۢ()V

    .line 405
    :cond_3
    :goto_0
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p2

    .line 406
    invoke-interface {v0}, Ll/֡ۙ۠;->֫()Z

    move-result v0

    if-nez v0, :cond_6

    iget-boolean v0, p0, Ll/ᩴۙ۠;->ۙ:Z

    if-nez v0, :cond_6

    .line 407
    iget v0, p0, Ll/ᩴۙ۠;->᩻֫:I

    if-eq v0, v4, :cond_5

    if-nez v0, :cond_4

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v1, p1, v1

    if-gez v1, :cond_5

    :cond_4
    if-ne v0, v3, :cond_7

    const/high16 v0, -0x40800000    # -1.0f

    cmpg-float p1, p1, v0

    if-gtz p1, :cond_7

    :cond_5
    if-eqz p2, :cond_7

    const/4 p1, 0x0

    .line 409
    invoke-interface {p2, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    return-void

    :cond_6
    if-eqz p2, :cond_7

    .line 413
    invoke-interface {p2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_7
    :goto_1
    return-void
.end method

.method public final ֫(FFF)V
    .locals 3

    .line 477
    invoke-virtual {p0}, Ll/ᩴۙ۠;->᩻()F

    move-result v0

    iget v1, p0, Ll/ᩴۙ۠;->ᩳ֫:F

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    cmpl-float v0, v0, v1

    if-gtz v0, :cond_1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 478
    :cond_1
    :goto_0
    iput p2, p0, Ll/ᩴۙ۠;->᩸:F

    .line 479
    iput p3, p0, Ll/ᩴۙ۠;->᩹:F

    .line 483
    iget-object v0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    invoke-virtual {v0, p1, p1, p2, p3}, Landroid/graphics/Matrix;->postScale(FFFF)Z

    .line 484
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۢ()V

    return-void
.end method

.method public final ֫(FFFZ)V
    .locals 8

    .line 630
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 634
    iget v1, p0, Ll/ᩴۙ۠;->ᩳ֫:F

    cmpg-float v1, p1, v1

    if-ltz v1, :cond_2

    iget v1, p0, Ll/ᩴۙ۠;->ܽ֫:F

    cmpl-float v1, p1, v1

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p4, :cond_1

    .line 643
    new-instance p4, Ll/ۖۙ۠;

    invoke-virtual {p0}, Ll/ᩴۙ۠;->᩻()F

    move-result v4

    move-object v2, p4

    move-object v3, p0

    move v5, p1

    move v6, p2

    move v7, p3

    invoke-direct/range {v2 .. v7}, Ll/ۖۙ۠;-><init>(Ll/ᩴۙ۠;FFFF)V

    invoke-virtual {v0, p4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 646
    :cond_1
    iget-object p4, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    invoke-virtual {p4, p1, p1, p2, p3}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 647
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۢ()V

    :cond_2
    :goto_0
    return-void
.end method

.method public final ֫(Landroid/view/View$OnLongClickListener;)V
    .locals 0

    .line 583
    iput-object p1, p0, Ll/ᩴۙ۠;->֫֫:Landroid/view/View$OnLongClickListener;

    return-void
.end method

.method public final ֫(Landroid/widget/ImageView$ScaleType;)V
    .locals 2

    .line 91
    sget-object v0, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_0

    .line 654
    iget-object v0, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    if-eq p1, v0, :cond_0

    .line 655
    iput-object p1, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    .line 658
    invoke-virtual {p0}, Ll/ᩴۙ۠;->᩷()V

    :cond_0
    return-void

    .line 92
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " is not supported in PhotoView"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۜ()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 361
    iget-object v0, p0, Ll/ᩴۙ۠;->ܳ֫:Landroid/widget/ImageView$ScaleType;

    return-object v0
.end method

.method public final ۧ()Landroid/graphics/RectF;
    .locals 1

    .line 263
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۡ()Z

    .line 264
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ܽ()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩴۙ۠;->֫(Landroid/graphics/Matrix;)Landroid/graphics/RectF;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(FF)V
    .locals 4

    .line 427
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    .line 428
    new-instance v1, Ll/ۘۙ۠;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p0}, Ll/ۘۙ۠;-><init>(Landroid/content/Context;Ll/ᩴۙ۠;)V

    iput-object v1, p0, Ll/ᩴۙ۠;->ۗ:Ll/ۘۙ۠;

    .line 429
    invoke-static {v0}, Ll/ᩴۙ۠;->ۧ(Landroid/widget/ImageView;)I

    move-result v2

    .line 430
    invoke-static {v0}, Ll/ᩴۙ۠;->֫(Landroid/widget/ImageView;)I

    move-result v3

    float-to-int p1, p1

    float-to-int p2, p2

    .line 429
    invoke-virtual {v1, v2, v3, p1, p2}, Ll/ۘۙ۠;->֫(IIII)V

    .line 431
    iget-object p1, p0, Ll/ᩴۙ۠;->ۗ:Ll/ۘۙ۠;

    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final ܳ()F
    .locals 1

    .line 340
    iget v0, p0, Ll/ᩴۙ۠;->ᩳ֫:F

    return v0
.end method

.method public final ܽ()Landroid/graphics/Matrix;
    .locals 2

    .line 696
    iget-object v0, p0, Ll/ᩴۙ۠;->᩶:Landroid/graphics/Matrix;

    iget-object v1, p0, Ll/ᩴۙ۠;->۫:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 697
    iget-object v0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    return-object v1
.end method

.method public final ܽ(FF)V
    .locals 1

    cmpl-float v0, p1, p2

    if-gez v0, :cond_0

    .line 577
    iput p1, p0, Ll/ᩴۙ۠;->ᩳ֫:F

    .line 578
    iput p2, p0, Ll/ᩴۙ۠;->ܽ֫:F

    return-void

    .line 76
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "MinZoom has to be less than MaxZoom"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܿ()F
    .locals 1

    .line 351
    iget v0, p0, Ll/ᩴۙ۠;->ܽ֫:F

    return v0
.end method

.method public final ᩳ()Landroid/widget/ImageView;
    .locals 1

    .line 318
    iget-object v0, p0, Ll/ᩴۙ۠;->ۛ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_0

    .line 319
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    .line 324
    invoke-virtual {p0}, Ll/ᩴۙ۠;->֫()V

    :cond_1
    return-object v0
.end method

.method public final ᩷()V
    .locals 3

    .line 669
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 672
    iget-boolean v1, p0, Ll/ᩴۙ۠;->᩷֫:Z

    if-eqz v1, :cond_1

    .line 105
    instance-of v1, v0, Ll/᩷ۙ۠;

    if-nez v1, :cond_0

    .line 106
    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 107
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 677
    :cond_0
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩴۙ۠;->֫(Landroid/graphics/drawable/Drawable;)V

    return-void

    .line 848
    :cond_1
    iget-object v0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    invoke-virtual {v0}, Landroid/graphics/Matrix;->reset()V

    const/4 v1, 0x0

    .line 311
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->postRotate(F)Z

    .line 312
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۢ()V

    .line 850
    invoke-virtual {p0}, Ll/ᩴۙ۠;->ܽ()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ᩴۙ۠;->ۧ(Landroid/graphics/Matrix;)V

    .line 851
    invoke-direct {p0}, Ll/ᩴۙ۠;->ۡ()Z

    :cond_2
    return-void
.end method

.method public final ᩻()F
    .locals 6

    .line 840
    iget-object v0, p0, Ll/ᩴۙ۠;->ۜ֫:Landroid/graphics/Matrix;

    iget-object v1, p0, Ll/ᩴۙ۠;->ۧ֫:[F

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v2, 0x0

    .line 841
    aget v2, v1, v2

    float-to-double v2, v2

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    .line 356
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    double-to-float v2, v2

    .line 840
    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v0, 0x3

    .line 841
    aget v0, v1, v0

    float-to-double v0, v0

    .line 356
    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    double-to-float v0, v0

    add-float/2addr v2, v0

    float-to-double v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method
