.class public final Ll/ۤ᩶ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "E5OI"


# instance fields
.field public final synthetic ֫:Ll/۟᩶ۧ;

.field public final synthetic ۧ:Landroid/view/ViewPropertyAnimator;

.field public final synthetic ܳ:Landroid/view/View;

.field public final synthetic ܽ:I

.field public final synthetic ܿ:Ll/ۗ۬ۧ;

.field public final synthetic ᩳ:I


# direct methods
.method public constructor <init>(Ll/۟᩶ۧ;Ll/ۗ۬ۧ;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V
    .locals 0

    .line 297
    iput-object p1, p0, Ll/ۤ᩶ۧ;->֫:Ll/۟᩶ۧ;

    iput-object p2, p0, Ll/ۤ᩶ۧ;->ܿ:Ll/ۗ۬ۧ;

    iput p3, p0, Ll/ۤ᩶ۧ;->ܽ:I

    iput-object p4, p0, Ll/ۤ᩶ۧ;->ܳ:Landroid/view/View;

    iput p5, p0, Ll/ۤ᩶ۧ;->ᩳ:I

    iput-object p6, p0, Ll/ۤ᩶ۧ;->ۧ:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 2

    .line 305
    iget p1, p0, Ll/ۤ᩶ۧ;->ܽ:I

    const/4 v0, 0x0

    iget-object v1, p0, Ll/ۤ᩶ۧ;->ܳ:Landroid/view/View;

    if-eqz p1, :cond_0

    .line 306
    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 308
    :cond_0
    iget p1, p0, Ll/ۤ᩶ۧ;->ᩳ:I

    if-eqz p1, :cond_1

    .line 309
    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    :cond_1
    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 315
    iget-object p1, p0, Ll/ۤ᩶ۧ;->ۧ:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 301
    iget-object p1, p0, Ll/ۤ᩶ۧ;->֫:Ll/۟᩶ۧ;

    iget-object v0, p0, Ll/ۤ᩶ۧ;->ܿ:Ll/ۗ۬ۧ;

    invoke-virtual {p1, v0}, Ll/᩺ۗۧ;->֫(Ll/ۗ۬ۧ;)V

    .line 317
    iget-object v1, p1, Ll/۟᩶ۧ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 318
    invoke-virtual {p1}, Ll/۟᩶ۧ;->ۢ()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 300
    iget-object p1, p0, Ll/ۤ᩶ۧ;->֫:Ll/۟᩶ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
