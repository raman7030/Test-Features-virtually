.class public final synthetic Ll/ۧۢᩳ;
.super Ljava/lang/Object;
.source "U8VQ"

# interfaces
.implements Ll/֨ۡ֫;


# instance fields
.field public final synthetic ᩸:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Ll/ܺۢᩳ;Landroid/widget/TextView;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/ۧۢᩳ;->᩸:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Object;)V
    .locals 3

    .line 2
    check-cast p1, Ljava/lang/String;

    .line 296
    iget-object v0, p0, Ll/ۧۢᩳ;->᩸:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Landroid/animation/ObjectAnimator;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/animation/ObjectAnimator;

    .line 297
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    :cond_0
    if-eqz p1, :cond_3

    .line 299
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    .line 326
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    move-result v1

    const/high16 v2, 0x3f800000    # 1.0f

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_2

    .line 327
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 329
    :cond_2
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_3
    :goto_0
    const/4 p1, 0x2

    new-array p1, p1, [F

    .line 300
    fill-array-data p1, :array_0

    const-string v1, "alpha"

    invoke-static {v0, v1, p1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p1

    const-wide/16 v1, 0xc8

    invoke-virtual {p1, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p1

    .line 301
    new-instance v1, Ll/ۡۢᩳ;

    invoke-direct {v1, v0}, Ll/ۡۢᩳ;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {p1, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 323
    invoke-virtual {p1}, Landroid/animation/ObjectAnimator;->start()V

    .line 324
    invoke-virtual {v0, p1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void

    :array_0
    .array-data 4
        0x3f800000    # 1.0f
        0x3dcccccd    # 0.1f
    .end array-data
.end method
