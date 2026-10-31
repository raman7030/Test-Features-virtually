.class public final Ll/᩺ۨۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "G64W"

# interfaces
.implements Ll/ۛۛۧ;


# instance fields
.field public ֫:Z

.field public final ۧ:I

.field public final ܳ:Landroid/view/View;

.field public ܽ:Z

.field public final ܿ:Z

.field public final ᩳ:Landroid/view/ViewGroup;


# direct methods
.method public constructor <init>(ILandroid/view/View;)V
    .locals 1

    .line 517
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    .line 515
    iput-boolean v0, p0, Ll/᩺ۨۧ;->֫:Z

    .line 518
    iput-object p2, p0, Ll/᩺ۨۧ;->ܳ:Landroid/view/View;

    .line 519
    iput p1, p0, Ll/᩺ۨۧ;->ۧ:I

    .line 520
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, p0, Ll/᩺ۨۧ;->ᩳ:Landroid/view/ViewGroup;

    const/4 p1, 0x1

    .line 521
    iput-boolean p1, p0, Ll/᩺ۨۧ;->ܿ:Z

    .line 523
    invoke-direct {p0, p1}, Ll/᩺ۨۧ;->֫(Z)V

    return-void
.end method

.method private ֫(Z)V
    .locals 1

    .line 604
    iget-boolean v0, p0, Ll/᩺ۨۧ;->ܿ:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/᩺ۨۧ;->ܽ:Z

    if-eq v0, p1, :cond_0

    iget-object v0, p0, Ll/᩺ۨۧ;->ᩳ:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    .line 605
    iput-boolean p1, p0, Ll/᩺ۨۧ;->ܽ:Z

    .line 606
    invoke-static {v0, p1}, Ll/֨ۨۧ;->֫(Landroid/view/ViewGroup;Z)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    .line 528
    iput-boolean p1, p0, Ll/᩺ۨۧ;->֫:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 592
    iget-boolean p1, p0, Ll/᩺ۨۧ;->֫:Z

    if-nez p1, :cond_0

    .line 594
    iget-object p1, p0, Ll/᩺ۨۧ;->ܳ:Landroid/view/View;

    iget v0, p0, Ll/᩺ۨۧ;->ۧ:I

    invoke-static {p1, v0}, Ll/᩸ۨۧ;->֫(Landroid/view/View;I)V

    .line 595
    iget-object p1, p0, Ll/᩺ۨۧ;->ᩳ:Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    .line 596
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    const/4 p1, 0x0

    .line 600
    invoke-direct {p0, p1}, Ll/᩺ۨۧ;->֫(Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0

    if-nez p2, :cond_1

    .line 592
    iget-boolean p1, p0, Ll/᩺ۨۧ;->֫:Z

    if-nez p1, :cond_0

    .line 594
    iget-object p1, p0, Ll/᩺ۨۧ;->ܳ:Landroid/view/View;

    iget p2, p0, Ll/᩺ۨۧ;->ۧ:I

    invoke-static {p1, p2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;I)V

    .line 595
    iget-object p1, p0, Ll/᩺ۨۧ;->ᩳ:Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    .line 596
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    const/4 p1, 0x0

    .line 600
    invoke-direct {p0, p1}, Ll/᩺ۨۧ;->֫(Z)V

    :cond_1
    return-void
.end method

.method public final onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 0

    if-eqz p2, :cond_0

    .line 547
    iget-object p1, p0, Ll/᩺ۨۧ;->ܳ:Landroid/view/View;

    const/4 p2, 0x0

    invoke-static {p1, p2}, Ll/᩸ۨۧ;->֫(Landroid/view/View;I)V

    .line 548
    iget-object p1, p0, Ll/᩺ۨۧ;->ᩳ:Landroid/view/ViewGroup;

    if-eqz p1, :cond_0

    .line 549
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 0

    .line 568
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;Z)V
    .locals 0

    .line 2525
    invoke-virtual {p0, p1}, Ll/᩺ۨۧ;->onTransitionEnd(Ll/ܽۨۧ;)V

    return-void
.end method

.method public final onTransitionPause(Ll/ܽۨۧ;)V
    .locals 1

    const/4 p1, 0x0

    .line 577
    invoke-direct {p0, p1}, Ll/᩺ۨۧ;->֫(Z)V

    .line 578
    iget-boolean p1, p0, Ll/᩺ۨۧ;->֫:Z

    if-nez p1, :cond_0

    .line 579
    iget-object p1, p0, Ll/᩺ۨۧ;->ܳ:Landroid/view/View;

    iget v0, p0, Ll/᩺ۨۧ;->ۧ:I

    invoke-static {p1, v0}, Ll/᩸ۨۧ;->֫(Landroid/view/View;I)V

    :cond_0
    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 1

    const/4 p1, 0x1

    .line 585
    invoke-direct {p0, p1}, Ll/᩺ۨۧ;->֫(Z)V

    .line 586
    iget-boolean p1, p0, Ll/᩺ۨۧ;->֫:Z

    if-nez p1, :cond_0

    .line 587
    iget-object p1, p0, Ll/᩺ۨۧ;->ܳ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ll/᩸ۨۧ;->֫(Landroid/view/View;I)V

    :cond_0
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
