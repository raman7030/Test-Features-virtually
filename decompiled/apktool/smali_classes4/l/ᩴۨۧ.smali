.class public final Ll/ᩴۨۧ;
.super Ljava/lang/Object;
.source "B5G3"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 39
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Ll/ᩴۨۧ;->ۧ:Z

    return-void
.end method

.method public static ֫(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)Landroid/widget/ImageView;
    .locals 13

    .line 51
    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 52
    invoke-virtual {p2}, Landroid/view/View;->getScrollX()I

    move-result v1

    neg-int v1, v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/view/View;->getScrollY()I

    move-result p2

    neg-int p2, p2

    int-to-float p2, p2

    invoke-virtual {v0, v1, p2}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 53
    invoke-static {p1, v0}, Ll/᩸ۨۧ;->֫(Landroid/view/View;Landroid/graphics/Matrix;)V

    .line 54
    invoke-static {p0, v0}, Ll/᩸ۨۧ;->֫(Landroid/view/ViewGroup;Landroid/graphics/Matrix;)V

    .line 55
    new-instance p2, Landroid/graphics/RectF;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-direct {p2, v3, v3, v1, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 56
    invoke-virtual {v0, p2}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 57
    iget v1, p2, Landroid/graphics/RectF;->left:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    .line 58
    iget v2, p2, Landroid/graphics/RectF;->top:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    .line 59
    iget v3, p2, Landroid/graphics/RectF;->right:F

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    .line 60
    iget v4, p2, Landroid/graphics/RectF;->bottom:F

    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    move-result v4

    .line 62
    new-instance v5, Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 63
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 93
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v6

    if-eqz p0, :cond_0

    .line 94
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x1

    goto :goto_0

    :cond_0
    const/4 v7, 0x0

    :goto_0
    const/4 v8, 0x0

    if-nez v6, :cond_2

    if-nez v7, :cond_1

    goto/16 :goto_3

    .line 101
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v7

    check-cast v7, Landroid/view/ViewGroup;

    .line 102
    invoke-virtual {v7, p1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v9

    .line 103
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v10

    .line 104
    invoke-virtual {v10, p1}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    goto :goto_1

    :cond_2
    const/4 v9, 0x0

    move-object v7, v8

    .line 107
    :goto_1
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    move-result v10

    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    .line 108
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    move-result v11

    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    if-lez v10, :cond_4

    if-lez v11, :cond_4

    mul-int v8, v10, v11

    int-to-float v8, v8

    const/high16 v12, 0x49800000    # 1048576.0f

    div-float/2addr v12, v8

    const/high16 v8, 0x3f800000    # 1.0f

    .line 110
    invoke-static {v8, v12}, Ljava/lang/Math;->min(FF)F

    move-result v8

    int-to-float v10, v10

    mul-float v10, v10, v8

    .line 111
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    move-result v10

    int-to-float v11, v11

    mul-float v11, v11, v8

    .line 112
    invoke-static {v11}, Ljava/lang/Math;->round(F)I

    move-result v11

    .line 113
    iget v12, p2, Landroid/graphics/RectF;->left:F

    neg-float v12, v12

    iget p2, p2, Landroid/graphics/RectF;->top:F

    neg-float p2, p2

    invoke-virtual {v0, v12, p2}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 114
    invoke-virtual {v0, v8, v8}, Landroid/graphics/Matrix;->postScale(FF)Z

    .line 116
    sget-boolean p2, Ll/ᩴۨۧ;->ۧ:Z

    if-eqz p2, :cond_3

    .line 118
    new-instance p2, Landroid/graphics/Picture;

    invoke-direct {p2}, Landroid/graphics/Picture;-><init>()V

    .line 119
    invoke-virtual {p2, v10, v11}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object v8

    .line 120
    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 121
    invoke-virtual {p1, v8}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 122
    invoke-virtual {p2}, Landroid/graphics/Picture;->endRecording()V

    .line 123
    invoke-static {p2}, Ll/ۘۨۧ;->֫(Landroid/graphics/Picture;)Landroid/graphics/Bitmap;

    move-result-object p2

    goto :goto_2

    .line 126
    :cond_3
    sget-object p2, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v10, v11, p2}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p2

    .line 127
    new-instance v8, Landroid/graphics/Canvas;

    invoke-direct {v8, p2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 128
    invoke-virtual {v8, v0}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 129
    invoke-virtual {p1, v8}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    :goto_2
    move-object v8, p2

    :cond_4
    if-nez v6, :cond_5

    .line 133
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p0

    .line 134
    invoke-virtual {p0, p1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    .line 135
    invoke-virtual {v7, p1, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    :cond_5
    :goto_3
    if-eqz v8, :cond_6

    .line 66
    invoke-virtual {v5, v8}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    :cond_6
    sub-int p0, v3, v1

    const/high16 p1, 0x40000000    # 2.0f

    .line 68
    invoke-static {p0, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p0

    sub-int p2, v4, v2

    .line 69
    invoke-static {p2, p1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p1

    .line 70
    invoke-virtual {v5, p0, p1}, Landroid/view/View;->measure(II)V

    .line 71
    invoke-virtual {v5, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    return-object v5
.end method
