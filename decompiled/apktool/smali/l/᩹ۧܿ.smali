.class public final Ll/᩹ۧܿ;
.super Ljava/lang/Object;
.source "N988"


# instance fields
.field public final ֫:Ll/᩸ۧܿ;

.field public final ۧ:Landroid/animation/ObjectAnimator;

.field public final ܽ:Landroid/animation/ObjectAnimator;

.field public final ᩳ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/widget/TextView;)V
    .locals 5

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput-object p1, p0, Ll/᩹ۧܿ;->ᩳ:Landroid/widget/TextView;

    .line 24
    new-instance v0, Ll/᩸ۧܿ;

    invoke-direct {v0, p0}, Ll/᩸ۧܿ;-><init>(Ll/᩹ۧܿ;)V

    iput-object v0, p0, Ll/᩹ۧܿ;->֫:Ll/᩸ۧܿ;

    const/16 v0, 0x8

    .line 25
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x2

    new-array v1, v0, [F

    .line 26
    fill-array-data v1, :array_0

    const-string v2, "alpha"

    invoke-static {p1, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v1

    const-wide/16 v3, 0xc8

    invoke-virtual {v1, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v1

    iput-object v1, p0, Ll/᩹ۧܿ;->ܽ:Landroid/animation/ObjectAnimator;

    new-array v0, v0, [F

    .line 27
    fill-array-data v0, :array_1

    invoke-static {p1, v2, v0}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    invoke-virtual {v0, v3, v4}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Ll/᩹ۧܿ;->ۧ:Landroid/animation/ObjectAnimator;

    .line 28
    new-instance v2, Ll/۠ۧܿ;

    invoke-direct {v2, p1}, Ll/۠ۧܿ;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {v1, v2}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 50
    new-instance v1, Ll/ܶۧܿ;

    invoke-direct {v1, p1}, Ll/ܶۧܿ;-><init>(Landroid/widget/TextView;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void

    nop

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data

    :array_1
    .array-data 4
        0x3f800000    # 1.0f
        0x0
    .end array-data
.end method

.method public static ֫(Ll/᩹ۧܿ;)V
    .locals 3

    .line 109
    iget-object v0, p0, Ll/᩹ۧܿ;->ۧ:Landroid/animation/ObjectAnimator;

    iget-object v1, p0, Ll/᩹ۧܿ;->ܽ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v1}, Landroid/animation/Animator;->isRunning()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 110
    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    .line 112
    :cond_0
    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object p0, p0, Ll/᩹ۧܿ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    move-result p0

    if-nez p0, :cond_1

    .line 113
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    return-void
.end method

.method private ֫(Z)V
    .locals 2

    .line 98
    iget-object v0, p0, Ll/᩹ۧܿ;->ۧ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 99
    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    .line 101
    :cond_0
    iget-object v0, p0, Ll/᩹ۧܿ;->ܽ:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/Animator;->isRunning()Z

    move-result v1

    if-nez v1, :cond_2

    if-nez p1, :cond_1

    .line 102
    iget-object p1, p0, Ll/᩹ۧܿ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    const/16 v1, 0x8

    if-ne p1, v1, :cond_2

    .line 103
    :cond_1
    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(I)V
    .locals 1

    const/16 v0, 0x3e8

    .line 74
    invoke-virtual {p0, p1, v0}, Ll/᩹ۧܿ;->֫(II)V

    return-void
.end method

.method public final ֫(II)V
    .locals 3

    .line 82
    iget-object v0, p0, Ll/᩹ۧܿ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 83
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 84
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    invoke-direct {p0, p1}, Ll/᩹ۧܿ;->֫(Z)V

    .line 85
    iget-object p1, p0, Ll/᩹ۧܿ;->֫:Ll/᩸ۧܿ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    int-to-long v1, p2

    .line 86
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 3

    .line 90
    iget-object v0, p0, Ll/᩹ۧܿ;->ᩳ:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    .line 91
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 92
    invoke-static {v1, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    invoke-direct {p0, p1}, Ll/᩹ۧܿ;->֫(Z)V

    .line 93
    iget-object p1, p0, Ll/᩹ۧܿ;->֫:Ll/᩸ۧܿ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    const/16 v1, 0x1388

    int-to-long v1, v1

    .line 94
    invoke-virtual {p1, v0, v1, v2}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
