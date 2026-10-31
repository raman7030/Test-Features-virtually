.class public final Ll/ۜ۠ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "S8GQ"


# instance fields
.field public final synthetic ֫:Ll/᩷۠ۧ;


# direct methods
.method public constructor <init>(Ll/᩷۠ۧ;)V
    .locals 0

    .line 337
    iput-object p1, p0, Ll/ۜ۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 347
    iget-object p1, p0, Ll/ۜ۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 348
    invoke-static {p1}, Ll/᩷۠ۧ;->ۡ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 1

    .line 340
    iget-object p1, p0, Ll/ۜ۠ۧ;->֫:Ll/᩷۠ۧ;

    invoke-static {p1}, Ll/᩷۠ۧ;->ۜ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 341
    invoke-static {p1}, Ll/᩷۠ۧ;->ۜ(Ll/᩷۠ۧ;)Landroid/view/ViewGroup;

    move-result-object p1

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    return-void
.end method
