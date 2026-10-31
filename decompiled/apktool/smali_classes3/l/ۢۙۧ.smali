.class public final Ll/ۢۙۧ;
.super Ljava/lang/Object;
.source "34UR"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩸:Ll/ۘۙۧ;


# direct methods
.method public constructor <init>(Ll/ۘۙۧ;)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۢۙۧ;->᩸:Ll/ۘۙۧ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 244
    iget-object v0, p0, Ll/ۢۙۧ;->᩸:Ll/ۘۙۧ;

    iget-object v1, v0, Ll/ۘۙۧ;->֨:Landroid/animation/ValueAnimator;

    iget v2, v0, Ll/ۘۙۧ;->֫:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_0

    if-eq v2, v3, :cond_1

    return-void

    .line 246
    :cond_0
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_1
    const/4 v2, 0x3

    .line 249
    iput v2, v0, Ll/ۘۙۧ;->֫:I

    .line 250
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    new-array v2, v3, [F

    const/4 v3, 0x0

    aput v0, v2, v3

    const/4 v0, 0x0

    aput v0, v2, v4

    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    const/16 v0, 0x1f4

    int-to-long v2, v0

    .line 251
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 252
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
