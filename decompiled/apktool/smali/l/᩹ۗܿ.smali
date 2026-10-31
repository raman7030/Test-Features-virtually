.class public final Ll/᩹ۗܿ;
.super Ll/᩺ۤܿ;
.source "0AIV"


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 1

    .line 16
    invoke-direct {p0, p1}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    .line 17
    iget-object p1, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 18
    iget-object p1, p0, Ll/᩺ۤܿ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/view/View$OnClickListener;)Ll/᩺ۤܿ;
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public final ֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;
    .locals 0

    const/4 p1, 0x0

    .line 29
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    return-object p0
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 0

    .line 29
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    return-void
.end method

.method public final ֫(Ll/ۖ֨ᩳ;)V
    .locals 0

    .line 84
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->֫(Landroid/view/View$OnClickListener;)Ll/᩺ۤܿ;

    return-void
.end method

.method public final ۖ()V
    .locals 3

    .line 139
    iget-object v0, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    return-void

    .line 142
    :cond_0
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 143
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 144
    iget-object v0, p0, Ll/᩺ۤܿ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 146
    :cond_1
    new-instance v0, Ll/۠ۗܿ;

    invoke-direct {v0, p0}, Ll/۠ۗܿ;-><init>(Ll/᩹ۗܿ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۘ()Ll/ۡۛۡ;
    .locals 1

    .line 174
    new-instance v0, Ll/᩸ۗܿ;

    invoke-direct {v0, p0}, Ll/᩸ۗܿ;-><init>(Ll/᩹ۗܿ;)V

    return-object v0
.end method

.method public final ۡ()Ll/᩺ۤܿ;
    .locals 0

    .line 36
    invoke-super {p0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    return-object p0
.end method

.method public final ۡ()V
    .locals 0

    .line 36
    invoke-super {p0}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    return-void
.end method

.method public final ۧ(JJ)V
    .locals 0

    .line 72
    invoke-super {p0, p1, p2, p3, p4}, Ll/᩺ۤܿ;->֫(JJ)V

    return-void
.end method

.method public final ܳ(I)V
    .locals 3

    .line 113
    iget-object v0, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v1

    if-eq v1, p1, :cond_1

    .line 114
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v1

    iget-object v2, p0, Ll/᩺ۤܿ;->ۘ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    .line 115
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 116
    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    return-void

    .line 118
    :cond_0
    invoke-virtual {v2, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 119
    invoke-virtual {p0}, Ll/᩺ۤܿ;->᩷()V

    :cond_1
    return-void
.end method

.method public final ܺ()I
    .locals 1

    .line 135
    iget-object v0, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    return v0
.end method

.method public final ܽ(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p3, v0

    if-nez v2, :cond_0

    const/4 p1, 0x0

    .line 105
    invoke-virtual {p0, p1}, Ll/᩹ۗܿ;->ܳ(I)V

    return-void

    :cond_0
    const-wide/16 v0, 0x64

    mul-long p1, p1, v0

    .line 107
    div-long/2addr p1, p3

    long-to-int p2, p1

    invoke-virtual {p0, p2}, Ll/᩹ۗܿ;->ܳ(I)V

    return-void
.end method

.method public final ܿ(I)V
    .locals 0

    .line 78
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ܿ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 48
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩳ(I)V
    .locals 1

    .line 95
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 96
    iget-object v0, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    return-void

    .line 98
    :cond_0
    new-instance v0, Ll/ܶۗܿ;

    invoke-direct {v0, p0, p1}, Ll/ܶۗܿ;-><init>(Ll/᩹ۗܿ;I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩳ(Ljava/lang/CharSequence;)V
    .locals 0

    .line 60
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ᩴ()V
    .locals 2

    .line 154
    iget-object v0, p0, Ll/᩺ۤܿ;->᩷:Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 157
    :cond_0
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 158
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 159
    iget-object v0, p0, Ll/᩺ۤܿ;->ۢ:Landroid/widget/TextView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 161
    :cond_1
    new-instance v0, Ll/֨ۗܿ;

    invoke-direct {v0, p0}, Ll/֨ۗܿ;-><init>(Ll/᩹ۗܿ;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩻(I)V
    .locals 0

    .line 42
    invoke-super {p0, p1}, Ll/᩺ۤܿ;->ܽ(I)V

    return-void
.end method
