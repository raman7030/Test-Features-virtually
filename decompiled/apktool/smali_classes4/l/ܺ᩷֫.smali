.class public abstract Ll/ܺ᩷֫;
.super Ljava/lang/Object;
.source "V68I"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Landroid/graphics/Rect;Landroid/view/View;)V
    .locals 4

    .line 81
    sget v0, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 85
    :cond_0
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 86
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    int-to-float v2, v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 88
    invoke-virtual {p1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 89
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/RectF;->offset(FF)V

    .line 91
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 92
    :goto_0
    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_1

    .line 93
    check-cast v1, Landroid/view/View;

    .line 95
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v2

    neg-int v2, v2

    int-to-float v2, v2

    invoke-virtual {v1}, Landroid/view/View;->getScrollY()I

    move-result v3

    neg-int v3, v3

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 96
    invoke-virtual {v1}, Landroid/view/View;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    .line 97
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0, v2, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 99
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    new-array v1, v1, [I

    .line 103
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    const/4 p1, 0x0

    .line 104
    aget p1, v1, p1

    int-to-float p1, p1

    const/4 v2, 0x1

    aget v1, v1, v2

    int-to-float v1, v1

    invoke-virtual {v0, p1, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 105
    iget p1, v0, Landroid/graphics/RectF;->left:F

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iget v1, v0, Landroid/graphics/RectF;->top:F

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    iget v2, v0, Landroid/graphics/RectF;->right:F

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 106
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result v0

    .line 105
    invoke-virtual {p0, p1, v1, v2, v0}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method

.method public static ֫(Landroid/view/View;Ljava/util/List;)V
    .locals 7

    .line 272
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    .line 301
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, p0, :cond_0

    goto :goto_5

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 276
    :cond_1
    invoke-static {p0}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 277
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    move p0, v0

    .line 279
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-ge p0, v1, :cond_7

    .line 280
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 281
    instance-of v2, v1, Landroid/view/ViewGroup;

    if-eqz v2, :cond_6

    .line 282
    check-cast v1, Landroid/view/ViewGroup;

    .line 283
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v2, :cond_6

    .line 285
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    const/4 v5, 0x0

    :goto_3
    if-ge v5, v0, :cond_4

    .line 301
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_3

    goto :goto_4

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 287
    :cond_4
    invoke-static {v4}, Ll/ܿ᩺;->ۢ(Landroid/view/View;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5

    .line 288
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_6
    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_7
    :goto_5
    return-void
.end method

.method public static ֫(Ljava/util/List;)Z
    .locals 0

    if-eqz p0, :cond_1

    .line 312
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ֫(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public abstract ֫(Landroid/view/ViewGroup;Ljava/lang/Object;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Landroid/graphics/Rect;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/util/ArrayList;)V
.end method

.method public abstract ֫(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
.end method

.method public ֫(Ljava/lang/Object;Ll/᩻۫;Ljava/lang/Runnable;)V
    .locals 0

    .line 232
    check-cast p3, Ll/֨ܳ֫;

    invoke-virtual {p3}, Ll/֨ܳ֫;->run()V

    return-void
.end method

.method public abstract ֫(Ljava/lang/Object;)Z
.end method

.method public abstract ۧ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract ۧ(Landroid/view/View;Ljava/lang/Object;)V
.end method

.method public abstract ۧ(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
.end method

.method public abstract ܽ(Ljava/lang/Object;)Ljava/lang/Object;
.end method
