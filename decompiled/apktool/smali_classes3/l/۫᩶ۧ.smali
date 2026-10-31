.class public final Ll/۫᩶ۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "E5OI"


# instance fields
.field public final synthetic ֫:Ll/۟᩶ۧ;

.field public final synthetic ۧ:Landroid/view/ViewPropertyAnimator;

.field public final synthetic ܽ:Ll/ۗ۬ۧ;

.field public final synthetic ᩳ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/ViewPropertyAnimator;Ll/۟᩶ۧ;Ll/ۗ۬ۧ;)V
    .locals 0

    .line 237
    iput-object p3, p0, Ll/۫᩶ۧ;->֫:Ll/۟᩶ۧ;

    iput-object p4, p0, Ll/۫᩶ۧ;->ܽ:Ll/ۗ۬ۧ;

    iput-object p1, p0, Ll/۫᩶ۧ;->ᩳ:Landroid/view/View;

    iput-object p2, p0, Ll/۫᩶ۧ;->ۧ:Landroid/view/ViewPropertyAnimator;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 245
    iget-object p1, p0, Ll/۫᩶ۧ;->ᩳ:Landroid/view/View;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    .line 250
    iget-object p1, p0, Ll/۫᩶ۧ;->ۧ:Landroid/view/ViewPropertyAnimator;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    .line 312
    iget-object p1, p0, Ll/۫᩶ۧ;->֫:Ll/۟᩶ۧ;

    iget-object v0, p0, Ll/۫᩶ۧ;->ܽ:Ll/ۗ۬ۧ;

    invoke-virtual {p1, v0}, Ll/᩺ۗۧ;->֫(Ll/ۗ۬ۧ;)V

    .line 252
    iget-object v1, p1, Ll/۟᩶ۧ;->ۜ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 253
    invoke-virtual {p1}, Ll/۟᩶ۧ;->ۢ()V

    return-void
.end method

.method public final onAnimationStart(Landroid/animation/Animator;)V
    .locals 0

    .line 240
    iget-object p1, p0, Ll/۫᩶ۧ;->֫:Ll/۟᩶ۧ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method
