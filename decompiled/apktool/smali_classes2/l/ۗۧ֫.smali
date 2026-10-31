.class public final Ll/ۗۧ֫;
.super Ll/ۡۧ֫;
.source "O607"


# instance fields
.field public final ֫:I

.field public ۧ:Ll/ܺۧ֫;

.field public final ܽ:Ljava/lang/Runnable;

.field public final synthetic ᩳ:Ll/۬ۧ֫;


# direct methods
.method public constructor <init>(Ll/۬ۧ֫;I)V
    .locals 0

    .line 2227
    iput-object p1, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-direct {p0}, Ll/ۡۧ֫;-><init>()V

    .line 2221
    new-instance p1, Ll/ۙۧ֫;

    invoke-direct {p1, p0}, Ll/ۙۧ֫;-><init>(Ll/ۗۧ֫;)V

    iput-object p1, p0, Ll/ۗۧ֫;->ܽ:Ljava/lang/Runnable;

    .line 2228
    iput p2, p0, Ll/ۗۧ֫;->֫:I

    return-void
.end method


# virtual methods
.method public final clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 1

    const/4 p3, 0x3

    .line 2369
    iget-object v0, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {v0, p3, p1}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result p3

    if-eqz p3, :cond_0

    .line 2370
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    neg-int p1, p1

    const/4 p3, 0x0

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    .line 2372
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result p3

    .line 2373
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    sub-int p1, p3, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final clampViewPositionVertical(Landroid/view/View;II)I
    .locals 0

    .line 2379
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method

.method public final getViewHorizontalDragRange(Landroid/view/View;)I
    .locals 1

    .line 2364
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onEdgeDragStarted(II)V
    .locals 2

    const/4 v0, 0x1

    and-int/2addr p1, v0

    .line 2351
    iget-object v1, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x3

    .line 2352
    invoke-virtual {v1, p1}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x5

    .line 2354
    invoke-virtual {v1, p1}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_1

    .line 2357
    invoke-virtual {v1, p1}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_1

    .line 2358
    iget-object v0, p0, Ll/ۗۧ֫;->ۧ:Ll/ܺۧ֫;

    invoke-virtual {v0, p2, p1}, Ll/ܺۧ֫;->֫(ILandroid/view/View;)V

    :cond_1
    return-void
.end method

.method public final onEdgeLock(I)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onEdgeTouched(II)V
    .locals 2

    .line 2306
    iget-object p1, p0, Ll/ۗۧ֫;->ܽ:Ljava/lang/Runnable;

    const-wide/16 v0, 0xa0

    iget-object p2, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {p2, p1, v0, v1}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final onViewCaptured(Landroid/view/View;I)V
    .locals 1

    .line 2271
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܶۧ֫;

    const/4 p2, 0x0

    .line 2272
    iput-boolean p2, p1, Ll/ܶۧ֫;->ۧ:Z

    .line 2278
    iget p1, p0, Ll/ۗۧ֫;->֫:I

    const/4 p2, 0x3

    if-ne p1, p2, :cond_0

    const/4 p2, 0x5

    .line 2279
    :cond_0
    iget-object p1, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {p1, p2}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object p2

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    .line 1809
    invoke-virtual {p1, p2, v0}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    :cond_1
    return-void
.end method

.method public final onViewDragStateChanged(I)V
    .locals 2

    .line 2249
    iget-object v0, p0, Ll/ۗۧ֫;->ۧ:Ll/ܺۧ֫;

    invoke-virtual {v0}, Ll/ܺۧ֫;->ܿ()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {v1, p1, v0}, Ll/۬ۧ֫;->ܽ(ILandroid/view/View;)V

    return-void
.end method

.method public final onViewPositionChanged(Landroid/view/View;IIII)V
    .locals 0

    .line 2255
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p3

    const/4 p4, 0x3

    .line 2258
    iget-object p5, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {p5, p4, p1}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result p4

    if-eqz p4, :cond_0

    add-int/2addr p2, p3

    int-to-float p2, p2

    goto :goto_0

    .line 2261
    :cond_0
    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    move-result p4

    sub-int/2addr p4, p2

    int-to-float p2, p4

    :goto_0
    int-to-float p3, p3

    div-float/2addr p2, p3

    .line 2264
    invoke-virtual {p5, p2, p1}, Ll/۬ۧ֫;->ۧ(FLandroid/view/View;)V

    const/4 p3, 0x0

    cmpl-float p2, p2, p3

    if-nez p2, :cond_1

    const/4 p2, 0x4

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    .line 2265
    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 2266
    invoke-virtual {p5}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onViewReleased(Landroid/view/View;FF)V
    .locals 6

    .line 2289
    sget-object p3, Ll/۬ۧ֫;->֡֫:[I

    .line 978
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Ll/ܶۧ֫;

    iget p3, p3, Ll/ܶۧ֫;->ܽ:F

    .line 2290
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x3

    .line 2293
    iget-object v2, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {v2, v1, p1}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result v1

    const/high16 v3, 0x3f000000    # 0.5f

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    cmpl-float p2, p2, v4

    if-gtz p2, :cond_1

    if-nez p2, :cond_0

    cmpl-float p2, p3, v3

    if-lez p2, :cond_0

    goto :goto_0

    :cond_0
    neg-int p2, v0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x0

    goto :goto_1

    .line 2296
    :cond_2
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v1

    cmpg-float v5, p2, v4

    if-ltz v5, :cond_3

    cmpl-float p2, p2, v4

    if-nez p2, :cond_4

    cmpl-float p2, p3, v3

    if-lez p2, :cond_4

    :cond_3
    sub-int/2addr v1, v0

    :cond_4
    move p2, v1

    .line 2300
    :goto_1
    iget-object p3, p0, Ll/ۗۧ֫;->ۧ:Ll/ܺۧ֫;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Ll/ܺۧ֫;->ۧ(II)Z

    .line 2301
    invoke-virtual {v2}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final tryCaptureView(Landroid/view/View;I)Z
    .locals 1

    .line 2243
    invoke-static {p1}, Ll/۬ۧ֫;->᩻(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Ll/ۗۧ֫;->֫:I

    iget-object v0, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    invoke-virtual {v0, p2, p1}, Ll/۬ۧ֫;->֫(ILandroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2244
    invoke-virtual {v0, p1}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫()V
    .locals 9

    .line 2312
    iget-object v0, p0, Ll/ۗۧ֫;->ۧ:Ll/ܺۧ֫;

    invoke-virtual {v0}, Ll/ܺۧ֫;->᩻()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2313
    iget v3, p0, Ll/ۗۧ֫;->֫:I

    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const/4 v6, 0x5

    .line 2314
    iget-object v7, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    if-eqz v5, :cond_2

    .line 2315
    invoke-virtual {v7, v4}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v6

    if-eqz v6, :cond_1

    .line 2316
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v1

    neg-int v1, v1

    :cond_1
    add-int/2addr v1, v0

    goto :goto_1

    .line 2318
    :cond_2
    invoke-virtual {v7, v6}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v6

    .line 2319
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v1, v0

    :goto_1
    if-eqz v6, :cond_7

    if-eqz v5, :cond_3

    .line 2322
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v0

    if-lt v0, v1, :cond_4

    :cond_3
    if-nez v5, :cond_7

    .line 2323
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v0

    if-le v0, v1, :cond_7

    .line 2324
    :cond_4
    invoke-virtual {v7, v6}, Ll/۬ۧ֫;->֫(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_7

    .line 2325
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Ll/ܶۧ֫;

    .line 2326
    iget-object v5, p0, Ll/ۗۧ֫;->ۧ:Ll/ܺۧ֫;

    invoke-virtual {v6}, Landroid/view/View;->getTop()I

    move-result v8

    invoke-virtual {v5, v6, v1, v8}, Ll/ܺۧ֫;->֫(Landroid/view/View;II)Z

    .line 2327
    iput-boolean v2, v0, Ll/ܶۧ֫;->ۧ:Z

    .line 2328
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    if-ne v3, v4, :cond_5

    const/4 v4, 0x5

    .line 2279
    :cond_5
    invoke-virtual {v7, v4}, Ll/۬ۧ֫;->ۧ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 1809
    invoke-virtual {v7, v0, v2}, Ll/۬ۧ֫;->֫(Landroid/view/View;Z)V

    .line 2332
    :cond_6
    invoke-virtual {v7}, Ll/۬ۧ֫;->֫()V

    :cond_7
    return-void
.end method

.method public final ֫(Ll/ܺۧ֫;)V
    .locals 0

    .line 2232
    iput-object p1, p0, Ll/ۗۧ֫;->ۧ:Ll/ܺۧ֫;

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 2236
    iget-object v0, p0, Ll/ۗۧ֫;->ᩳ:Ll/۬ۧ֫;

    iget-object v1, p0, Ll/ۗۧ֫;->ܽ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method
