.class public final Ll/ۨ᩶ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "E5OI"


# instance fields
.field public final synthetic ֫:Ll/۟᩶ۧ;

.field public final synthetic ۧ:Ll/᩺᩶ۧ;

.field public final synthetic ܽ:Landroid/view/View;

.field public final synthetic ᩳ:Landroid/view/ViewPropertyAnimator;


# direct methods
.method public constructor <init>(Ll/۟᩶ۧ;Ll/᩺᩶ۧ;Landroid/view/ViewPropertyAnimator;Landroid/view/View;)V
    .locals 0

    .line 386
    iput-object p1, p0, Ll/ۨ᩶ۧ;->֫:Ll/۟᩶ۧ;

    iput-object p2, p0, Ll/ۨ᩶ۧ;->ۧ:Ll/᩺᩶ۧ;

    iput-object p3, p0, Ll/ۨ᩶ۧ;->ᩳ:Landroid/view/ViewPropertyAnimator;

    iput-object p4, p0, Ll/ۨ᩶ۧ;->ܽ:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 393
    iget-object p1, p0, Ll/ۨ᩶ۧ;->ᩳ:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    const/high16 p1, 0x3f800000    # 1.0f

    .line 394
    iget-object v0, p0, Ll/ۨ᩶ۧ;->ܽ:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setAlpha(F)V

    const/4 p1, 0x0

    .line 395
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 396
    invoke-virtual {v0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 397
    iget-object p1, p0, Ll/ۨ᩶ۧ;->ۧ:Ll/᩺᩶ۧ;

    iget-object v0, p1, Ll/᩺᩶ۧ;->ܽ:Ll/ۗ۬ۧ;

    .line 328
    iget-object v1, p0, Ll/ۨ᩶ۧ;->֫:Ll/۟᩶ۧ;

    invoke-virtual {v1, v0}, Ll/᩺ۗۧ;->֫(Ll/ۗ۬ۧ;)V

    .line 398
    iget-object v0, v1, Ll/۟᩶ۧ;->ۢ:Ljava/util/ArrayList;

    iget-object p1, p1, Ll/᩺᩶ۧ;->ܽ:Ll/ۗ۬ۧ;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 399
    invoke-virtual {v1}, Ll/۟᩶ۧ;->ۢ()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 389
    iget-object p1, p0, Ll/ۨ᩶ۧ;->ۧ:Ll/᩺᩶ۧ;

    iget-object p1, p1, Ll/᩺᩶ۧ;->ܽ:Ll/ۗ۬ۧ;

    iget-object p1, p0, Ll/ۨ᩶ۧ;->֫:Ll/۟᩶ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
