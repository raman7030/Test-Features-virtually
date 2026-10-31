.class public final Ll/ܰۨۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "G64W"

# interfaces
.implements Ll/ۛۛۧ;


# instance fields
.field public ֫:Z

.field public final ۧ:Landroid/view/ViewGroup;

.field public final ܽ:Landroid/view/View;

.field public final synthetic ܿ:Ll/֫᩺ۧ;

.field public final ᩳ:Landroid/view/View;


# direct methods
.method public constructor <init>(Ll/֫᩺ۧ;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 617
    iput-object p1, p0, Ll/ܰۨۧ;->ܿ:Ll/֫᩺ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x1

    .line 615
    iput-boolean p1, p0, Ll/ܰۨۧ;->֫:Z

    .line 618
    iput-object p2, p0, Ll/ܰۨۧ;->ۧ:Landroid/view/ViewGroup;

    .line 619
    iput-object p3, p0, Ll/ܰۨۧ;->ܽ:Landroid/view/View;

    .line 620
    iput-object p4, p0, Ll/ܰۨۧ;->ᩳ:Landroid/view/View;

    return-void
.end method

.method private ֫()V
    .locals 3

    const v0, 0x7f0a04c5

    const/4 v1, 0x0

    .line 683
    iget-object v2, p0, Ll/ܰۨۧ;->ᩳ:Landroid/view/View;

    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 684
    iget-object v0, p0, Ll/ܰۨۧ;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v0

    iget-object v1, p0, Ll/ܰۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 685
    iput-boolean v0, p0, Ll/ܰۨۧ;->֫:Z

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 0

    .line 648
    invoke-direct {p0}, Ll/ܰۨۧ;->֫()V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 0

    if-nez p2, :cond_0

    .line 654
    invoke-direct {p0}, Ll/ܰۨۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final onAnimationPause(Landroid/animation/Animator;)V
    .locals 1

    .line 625
    iget-object p1, p0, Ll/ܰۨۧ;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    iget-object v0, p0, Ll/ܰۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-void
.end method

.method public final onAnimationResume(Landroid/animation/Animator;)V
    .locals 1

    .line 630
    iget-object p1, p0, Ll/ܰۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 631
    iget-object v0, p0, Ll/ܰۨۧ;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    return-void

    .line 633
    :cond_0
    iget-object p1, p0, Ll/ܰۨۧ;->ܿ:Ll/֫᩺ۧ;

    invoke-virtual {p1}, Ll/ܽۨۧ;->cancel()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;Z)V
    .locals 1

    if-eqz p2, :cond_0

    .line 640
    iget-object p1, p0, Ll/ܰۨۧ;->ᩳ:Landroid/view/View;

    const p2, 0x7f0a04c5

    iget-object v0, p0, Ll/ܰۨۧ;->ܽ:Landroid/view/View;

    invoke-virtual {p1, p2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 641
    iget-object p1, p0, Ll/ܰۨۧ;->ۧ:Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    const/4 p1, 0x1

    .line 642
    iput-boolean p1, p0, Ll/ܰۨۧ;->֫:Z

    :cond_0
    return-void
.end method

.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

    .line 677
    iget-boolean p1, p0, Ll/ܰۨۧ;->֫:Z

    if-eqz p1, :cond_0

    .line 678
    invoke-direct {p0}, Ll/ܰۨۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;)V
    .locals 0

    .line 660
    invoke-virtual {p1, p0}, Ll/ܽۨۧ;->removeListener(Ll/ۛۛۧ;)Ll/ܽۨۧ;

    return-void
.end method

.method public final onTransitionEnd(Ll/ܽۨۧ;Z)V
    .locals 0

    .line 2525
    invoke-virtual {p0, p1}, Ll/ܰۨۧ;->onTransitionEnd(Ll/ܽۨۧ;)V

    return-void
.end method

.method public final onTransitionPause(Ll/ܽۨۧ;)V
    .locals 0

    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 0

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
