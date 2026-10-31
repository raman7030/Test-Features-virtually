.class public final Ll/ۜۛۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "P5CY"

# interfaces
.implements Ll/ۛۛۧ;


# instance fields
.field public ֫:Z

.field public final ۧ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 192
    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 v0, 0x0

    .line 190
    iput-boolean v0, p0, Ll/ۜۛۧ;->֫:Z

    .line 193
    iput-object p1, p0, Ll/ۜۛۧ;->ۧ:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 223
    iget-object p1, p0, Ll/ۜۛۧ;->ۧ:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Ll/᩸ۨۧ;->֫(Landroid/view/View;F)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    const/4 v0, 0x0

    .line 207
    invoke-virtual {p0, p1, v0}, Ll/ۜۛۧ;->onAnimationEnd(Landroid/animation/Animator;Z)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;Z)V
    .locals 2

    .line 212
    iget-boolean p1, p0, Ll/ۜۛۧ;->֫:Z

    iget-object v0, p0, Ll/ۜۛۧ;->ۧ:Landroid/view/View;

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    const/4 v1, 0x0

    .line 213
    invoke-virtual {v0, p1, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    if-nez p2, :cond_1

    const/high16 p1, 0x3f800000    # 1.0f

    .line 216
    invoke-static {v0, p1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;F)V

    .line 217
    invoke-static {}, Ll/᩸ۨۧ;->֫()V

    :cond_1
    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 2

    .line 198
    iget-object p1, p0, Ll/ۜۛۧ;->ۧ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->hasOverlappingRendering()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 199
    invoke-virtual {p1}, Landroid/view/View;->getLayerType()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    .line 200
    iput-boolean v0, p0, Ll/ۜۛۧ;->֫:Z

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 201
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final onTransitionCancel(Ll/ܽۨۧ;)V
    .locals 0

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

    .line 244
    iget-object p1, p0, Ll/ۜۛۧ;->ۧ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    .line 245
    invoke-static {p1}, Ll/᩸ۨۧ;->֫(Landroid/view/View;)F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v1, 0x7f0a064a

    .line 246
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    return-void
.end method

.method public final onTransitionResume(Ll/ܽۨۧ;)V
    .locals 2

    const p1, 0x7f0a064a

    const/4 v0, 0x0

    .line 251
    iget-object v1, p0, Ll/ۜۛۧ;->ۧ:Landroid/view/View;

    invoke-virtual {v1, p1, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

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
