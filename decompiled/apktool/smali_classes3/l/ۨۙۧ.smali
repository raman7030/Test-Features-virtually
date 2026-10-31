.class public final Ll/ۨۙۧ;
.super Ljava/lang/Object;
.source "B66A"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ֫:Ll/᩺ۙۧ;


# direct methods
.method public constructor <init>(Ll/᩺ۙۧ;)V
    .locals 0

    .line 2426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۨۙۧ;->֫:Ll/᩺ۙۧ;

    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 1

    .line 2429
    iget-object v0, p0, Ll/ۨۙۧ;->֫:Ll/᩺ۙۧ;

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    invoke-virtual {v0, p1}, Ll/᩺ۙۧ;->֫(F)V

    return-void
.end method
