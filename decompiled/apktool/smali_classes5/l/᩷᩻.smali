.class public final Ll/᩷᩻;
.super Ll/ۡ᩻;
.source "Y22J"


# instance fields
.field public final ֫:Landroid/animation/ObjectAnimator;

.field public final ۧ:Z


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/AnimationDrawable;ZZ)V
    .locals 4

    .line 351
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 391
    invoke-virtual {p1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v0

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    add-int/lit8 v2, v0, -0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v0, -0x1

    .line 394
    :goto_1
    new-instance v0, Ll/ۢ᩻;

    invoke-direct {v0, p1, p2}, Ll/ۢ᩻;-><init>(Landroid/graphics/drawable/AnimationDrawable;Z)V

    const-string p2, "currentIndex"

    .line 396
    filled-new-array {v2, v1}, [I

    move-result-object v1

    .line 397
    invoke-static {p1, p2, v1}, Landroid/animation/ObjectAnimator;->ofInt(Ljava/lang/Object;Ljava/lang/String;[I)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 398
    invoke-virtual {p1, v3}, Landroid/animation/ObjectAnimator;->setAutoCancel(Z)V

    .line 399
    invoke-virtual {v0}, Ll/ۢ᩻;->֫()I

    move-result p2

    int-to-long v1, p2

    invoke-virtual {p1, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 400
    invoke-virtual {p1, v0}, Landroid/animation/Animator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 401
    iput-boolean p3, p0, Ll/᩷᩻;->ۧ:Z

    .line 402
    iput-object p1, p0, Ll/᩷᩻;->֫:Landroid/animation/ObjectAnimator;

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 407
    iget-boolean v0, p0, Ll/᩷᩻;->ۧ:Z

    return v0
.end method

.method public final ۧ()V
    .locals 1

    .line 417
    iget-object v0, p0, Ll/᩷᩻;->֫:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->reverse()V

    return-void
.end method

.method public final ܽ()V
    .locals 1

    .line 412
    iget-object v0, p0, Ll/᩷᩻;->֫:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    return-void
.end method

.method public final ᩳ()V
    .locals 1

    .line 422
    iget-object v0, p0, Ll/᩷᩻;->֫:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    return-void
.end method
