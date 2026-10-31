.class public Ll/᩺ۙۧ;
.super Ljava/lang/Object;
.source "B66A"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# instance fields
.field public final ֫:I

.field public ۖ:F

.field public final ۜ:F

.field public final ۡ:Ll/ۗ۬ۧ;

.field public final ۢ:Landroid/animation/ValueAnimator;

.field public ۧ:Z

.field public final ܳ:F

.field public ܺ:F

.field public ܽ:F

.field public ܿ:Z

.field public ᩳ:Z

.field public final ᩷:F

.field public final ᩻:F


# direct methods
.method public constructor <init>(Ll/ۗ۬ۧ;IFFFF)V
    .locals 1

    .line 2416
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2409
    iput-boolean v0, p0, Ll/᩺ۙۧ;->ܿ:Z

    .line 2411
    iput-boolean v0, p0, Ll/᩺ۙۧ;->ۧ:Z

    .line 2417
    iput p2, p0, Ll/᩺ۙۧ;->֫:I

    .line 2419
    iput-object p1, p0, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    .line 2420
    iput p3, p0, Ll/᩺ۙۧ;->ܳ:F

    .line 2421
    iput p4, p0, Ll/᩺ۙۧ;->᩻:F

    .line 2422
    iput p5, p0, Ll/᩺ۙۧ;->ۜ:F

    .line 2423
    iput p6, p0, Ll/᩺ۙۧ;->᩷:F

    const/4 p2, 0x2

    new-array p2, p2, [F

    .line 2424
    fill-array-data p2, :array_0

    invoke-static {p2}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p2

    iput-object p2, p0, Ll/᩺ۙۧ;->ۢ:Landroid/animation/ValueAnimator;

    .line 2425
    new-instance p3, Ll/ۨۙۧ;

    invoke-direct {p3, p0}, Ll/ۨۙۧ;-><init>(Ll/᩺ۙۧ;)V

    invoke-virtual {p2, p3}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    .line 2432
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p2, p1}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 2433
    invoke-virtual {p2, p0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    const/4 p1, 0x0

    .line 2451
    iput p1, p0, Ll/᩺ۙۧ;->ܽ:F

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/high16 p1, 0x3f800000    # 1.0f

    .line 2451
    iput p1, p0, Ll/᩺ۙۧ;->ܽ:F

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 1

    .line 2478
    iget-boolean p1, p0, Ll/᩺ۙۧ;->ۧ:Z

    const/4 v0, 0x1

    if-nez p1, :cond_0

    .line 2479
    iget-object p1, p0, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    invoke-virtual {p1, v0}, Ll/ۗ۬ۧ;->setIsRecyclable(Z)V

    .line 2481
    :cond_0
    iput-boolean v0, p0, Ll/᩺ۙۧ;->ۧ:Z

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

.method public final ֫()V
    .locals 4

    .line 2459
    iget-object v0, p0, Ll/᩺ۙۧ;->ۡ:Ll/ۗ۬ۧ;

    iget v1, p0, Ll/᩺ۙۧ;->ܳ:F

    iget v2, p0, Ll/᩺ۙۧ;->ۜ:F

    cmpl-float v3, v1, v2

    if-nez v3, :cond_0

    .line 2460
    iget-object v1, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    move-result v1

    iput v1, p0, Ll/᩺ۙۧ;->ܺ:F

    goto :goto_0

    .line 2462
    :cond_0
    iget v3, p0, Ll/᩺ۙۧ;->ܽ:F

    invoke-static {v2, v1, v3, v1}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v1

    iput v1, p0, Ll/᩺ۙۧ;->ܺ:F

    .line 2464
    :goto_0
    iget v1, p0, Ll/᩺ۙۧ;->᩻:F

    iget v2, p0, Ll/᩺ۙۧ;->᩷:F

    cmpl-float v3, v1, v2

    if-nez v3, :cond_1

    .line 2465
    iget-object v0, v0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    iput v0, p0, Ll/᩺ۙۧ;->ۖ:F

    return-void

    .line 2467
    :cond_1
    iget v0, p0, Ll/᩺ۙۧ;->ܽ:F

    invoke-static {v2, v1, v0, v1}, Ll/᩶᩵ᩳ;->֫(FFFF)F

    move-result v0

    iput v0, p0, Ll/᩺ۙۧ;->ۖ:F

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 2451
    iput p1, p0, Ll/᩺ۙۧ;->ܽ:F

    return-void
.end method
