.class public final Ll/᩻۠ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "S8GQ"


# instance fields
.field public final synthetic ֫:Ll/᩷۠ۧ;


# direct methods
.method public constructor <init>(Ll/᩷۠ۧ;)V
    .locals 0

    .line 314
    iput-object p1, p0, Ll/᩻۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 326
    iget-object p1, p0, Ll/᩻۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-static {p1}, Ll/᩷۠ۧ;->ۜ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 327
    invoke-static {p1}, Ll/᩷۠ۧ;->ۜ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 3

    .line 317
    iget-object p1, p0, Ll/᩻۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 318
    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 319
    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationX(F)V

    .line 320
    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    invoke-virtual {v0, p1, v1}, Landroid/view/View;->scrollTo(II)V

    :cond_0
    return-void
.end method
