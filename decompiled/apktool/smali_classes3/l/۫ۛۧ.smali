.class public final Ll/۫ۛۧ;
.super Ljava/lang/Object;
.source "G5Y2"


# direct methods
.method public static ֫(Landroid/animation/Animator;)J
    .locals 2

    .line 2716
    invoke-virtual {p0}, Landroid/animation/Animator;->getTotalDuration()J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫(Landroid/animation/Animator;J)V
    .locals 0

    .line 2721
    check-cast p0, Landroid/animation/AnimatorSet;

    invoke-virtual {p0, p1, p2}, Landroid/animation/AnimatorSet;->setCurrentPlayTime(J)V

    return-void
.end method
