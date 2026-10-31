.class public final Ll/ᩳۛۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "A65W"

# interfaces
.implements Ll/ۛۛۧ;


# instance fields
.field public final ֫:I

.field public final ۖ:I

.field public final ۘ:Landroid/view/View;

.field public final ۜ:I

.field public final ۡ:I

.field public final ۢ:Z

.field public final ۧ:Landroid/graphics/Rect;

.field public final ܳ:I

.field public final ܺ:I

.field public final ܽ:Z

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:Landroid/graphics/Rect;

.field public ᩻:Z


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/graphics/Rect;ZLandroid/graphics/Rect;ZIIIIIIII)V
    .locals 0

    .line 420
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 421
    iput-object p1, p0, Ll/ᩳۛۧ;->ۘ:Landroid/view/View;

    .line 422
    iput-object p2, p0, Ll/ᩳۛۧ;->᩷:Landroid/graphics/Rect;

    .line 423
    iput-boolean p3, p0, Ll/ᩳۛۧ;->ۢ:Z

    .line 424
    iput-object p4, p0, Ll/ᩳۛۧ;->ۧ:Landroid/graphics/Rect;

    .line 425
    iput-boolean p5, p0, Ll/ᩳۛۧ;->ܽ:Z

    .line 426
    iput p6, p0, Ll/ᩳۛۧ;->ۡ:I

    .line 427
    iput p7, p0, Ll/ᩳۛۧ;->ۖ:I

    .line 428
    iput p8, p0, Ll/ᩳۛۧ;->ܺ:I

    .line 429
    iput p9, p0, Ll/ᩳۛۧ;->ۜ:I

    .line 430
    iput p10, p0, Ll/ᩳۛۧ;->ᩳ:I

    .line 431
    iput p11, p0, Ll/ᩳۛۧ;->ܳ:I

    .line 432
    iput p12, p0, Ll/ᩳۛۧ;->ܿ:I

    .line 433
    iput p13, p0, Ll/ᩳۛۧ;->֫:I

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 443
    invoke-virtual {p0, p1, v0}, Ll/ᩳۛۧ;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 3

    .line 461
    iget-boolean p1, p0, Ll/ᩳۛۧ;->᩻:Z

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    if-eqz p2, :cond_2

    .line 465
    iget-boolean v0, p0, Ll/ᩳۛۧ;->ۢ:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Ll/ᩳۛۧ;->᩷:Landroid/graphics/Rect;

    goto :goto_0

    .line 466
    :cond_2
    iget-boolean v0, p0, Ll/ᩳۛۧ;->ܽ:Z

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Ll/ᩳۛۧ;->ۧ:Landroid/graphics/Rect;

    .line 467
    :goto_0
    iget-object v0, p0, Ll/ᩳۛۧ;->ۘ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    if-eqz p2, :cond_4

    .line 469
    iget p1, p0, Ll/ᩳۛۧ;->ܺ:I

    iget p2, p0, Ll/ᩳۛۧ;->ۜ:I

    iget v1, p0, Ll/ᩳۛۧ;->ۡ:I

    iget v2, p0, Ll/ᩳۛۧ;->ۖ:I

    invoke-static {v0, v1, v2, p1, p2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    return-void

    .line 472
    :cond_4
    iget p1, p0, Ll/ᩳۛۧ;->ܿ:I

    iget p2, p0, Ll/ᩳۛۧ;->֫:I

    iget v1, p0, Ll/ᩳۛۧ;->ᩳ:I

    iget v2, p0, Ll/ᩳۛۧ;->ܳ:I

    invoke-static {v0, v1, v2, p1, p2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 438
    invoke-virtual {p0, p1, v0}, Ll/ᩳۛۧ;->onAnimationStart(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 6

    .line 448
    iget p1, p0, Ll/ᩳۛۧ;->ܺ:I

    iget v0, p0, Ll/ᩳۛۧ;->ۡ:I

    sub-int/2addr p1, v0

    iget v1, p0, Ll/ᩳۛۧ;->ܿ:I

    iget v2, p0, Ll/ᩳۛۧ;->ᩳ:I

    sub-int/2addr v1, v2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 449
    iget v1, p0, Ll/ᩳۛۧ;->ۜ:I

    iget v3, p0, Ll/ᩳۛۧ;->ۖ:I

    sub-int/2addr v1, v3

    iget v4, p0, Ll/ᩳۛۧ;->֫:I

    iget v5, p0, Ll/ᩳۛۧ;->ܳ:I

    sub-int/2addr v4, v5

    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eqz p2, :cond_0

    move v0, v2

    :cond_0
    if-eqz p2, :cond_1

    move v3, v5

    :cond_1
    add-int/2addr p1, v0

    add-int/2addr v1, v3

    .line 453
    iget-object v2, p0, Ll/ᩳۛۧ;->ۘ:Landroid/view/View;

    invoke-static {v2, v0, v3, p1, v1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;IIII)V

    if-eqz p2, :cond_2

    .line 455
    iget-object p1, p0, Ll/ᩳۛۧ;->ۧ:Landroid/graphics/Rect;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll/ᩳۛۧ;->᩷:Landroid/graphics/Rect;

    .line 456
    :goto_0
    invoke-virtual {v2, p1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

    const/4 p1, 0x1

    .line 478
    iput-boolean p1, p0, Ll/ᩳۛۧ;->᩻:Z

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;Z)V
    .locals 0

    return-void
.end method

.method public final onTransitionPause(Ll/ܽۨۧ;)V
    .locals 2

    .line 483
    iget-object p1, p0, Ll/ᩳۛۧ;->ۘ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getClipBounds()Landroid/graphics/Rect;

    move-result-object v0

    const v1, 0x7f0a0646

    .line 484
    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 485
    iget-boolean v0, p0, Ll/ᩳۛۧ;->ܽ:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ll/ᩳۛۧ;->ۧ:Landroid/graphics/Rect;

    .line 486
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 3

    .line 491
    iget-object p1, p0, Ll/ᩳۛۧ;->ۘ:Landroid/view/View;

    const v0, 0x7f0a0646

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Rect;

    const/4 v2, 0x0

    .line 492
    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 493
    invoke-virtual {p1, v1}, Landroid/view/View;->setClipBounds(Landroid/graphics/Rect;)V

    return-void
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final onTransitionStart(Ll/ܽۨۧ;Z)V
    .locals 0

    return-void
.end method
