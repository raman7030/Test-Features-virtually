.class public final Ll/ܺۙۧ;
.super Landroid/animation/AnimatorListenerAdapter;
.source "34UR"


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/ۘۙۧ;


# direct methods
.method public constructor <init>(Ll/ۘۙۧ;)V
    .locals 0

    .line 551
    iput-object p1, p0, Ll/ܺۙۧ;->ۧ:Ll/ۘۙۧ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    const/4 p1, 0x0

    .line 549
    iput-boolean p1, p0, Ll/ܺۙۧ;->֫:Z

    return-void
.end method


# virtual methods
.method public final onAnimationCancel(Landroid/animation/Animator;)V
    .locals 0

    const/4 p1, 0x1

    .line 572
    iput-boolean p1, p0, Ll/ܺۙۧ;->֫:Z

    return-void
.end method

.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 3

    .line 557
    iget-boolean p1, p0, Ll/ܺۙۧ;->֫:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 558
    iput-boolean v0, p0, Ll/ܺۙۧ;->֫:Z

    return-void

    .line 561
    :cond_0
    iget-object p1, p0, Ll/ܺۙۧ;->ۧ:Ll/ۘۙۧ;

    iget-object v1, p1, Ll/ۘۙۧ;->֨:Landroid/animation/ValueAnimator;

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_1

    .line 562
    iput v0, p1, Ll/ۘۙۧ;->֫:I

    .line 563
    invoke-virtual {p1, v0}, Ll/ۘۙۧ;->֫(I)V

    return-void

    :cond_1
    const/4 v0, 0x2

    .line 565
    iput v0, p1, Ll/ۘۙۧ;->֫:I

    .line 566
    invoke-virtual {p1}, Ll/ۘۙۧ;->֫()V

    return-void
.end method
