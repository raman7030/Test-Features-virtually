.class public Lcom/google/android/material/carousel/FullScreenCarouselStrategy;
.super Lcom/google/android/material/carousel/CarouselStrategy;
.source "FullScreenCarouselStrategy.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 42
    invoke-direct {p0}, Lcom/google/android/material/carousel/CarouselStrategy;-><init>()V

    return-void
.end method


# virtual methods
.method public onFirstChildMeasuredWithMargins(Lcom/google/android/material/carousel/Carousel;Landroid/view/View;)Lcom/google/android/material/carousel/KeylineState;
    .locals 13

    .line 48
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܳ۬ۧ;

    .line 50
    invoke-interface {p1}, Lcom/google/android/material/carousel/Carousel;->isHorizontal()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 51
    invoke-interface {p1}, Lcom/google/android/material/carousel/Carousel;->getContainerWidth()I

    move-result p1

    int-to-float p1, p1

    .line 52
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_0

    .line 54
    :cond_0
    invoke-interface {p1}, Lcom/google/android/material/carousel/Carousel;->getContainerHeight()I

    move-result p1

    int-to-float p1, p1

    .line 55
    iget v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :goto_0
    add-int/2addr v1, v0

    int-to-float v0, v1

    add-float v1, p1, v0

    .line 57
    invoke-static {v1, p1}, Ljava/lang/Math;->min(FF)F

    move-result v10

    .line 58
    new-instance v1, Lcom/google/android/material/carousel/Arrangement;

    const/4 v9, 0x0

    const/4 v11, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v1

    move v12, p1

    invoke-direct/range {v2 .. v12}, Lcom/google/android/material/carousel/Arrangement;-><init>(IFFFIFIFIF)V

    .line 71
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    .line 70
    invoke-static {p2, v0, p1, v1}, Lcom/google/android/material/carousel/CarouselStrategyHelper;->createLeftAlignedKeylineState(Landroid/content/Context;FFLcom/google/android/material/carousel/Arrangement;)Lcom/google/android/material/carousel/KeylineState;

    move-result-object p1

    return-object p1
.end method
