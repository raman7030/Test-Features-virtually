.class public final Ll/۬۬ܿ;
.super Ljava/lang/Object;
.source "55FS"


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public ۧ:Z

.field public final ܽ:Ll/֡ۚۢ;

.field public final ܿ:Landroid/widget/TextView;

.field public volatile ᩳ:Z


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 3

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    const v0, 0x7f0d00ce

    .line 21
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x1

    .line 22
    invoke-virtual {v0, v1}, Landroid/view/View;->setKeepScreenOn(Z)V

    const v1, 0x7f0a03b2

    .line 23
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    const-string v2, "..."

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 25
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 26
    invoke-virtual {v1, p1}, Ll/᩵ۚۢ;->֫(Z)V

    .line 27
    invoke-virtual {v1}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 2

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    iput-object p1, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    const v0, 0x7f0d00ce

    .line 32
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a03b2

    .line 33
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 34
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    invoke-direct {p2, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 35
    invoke-virtual {p2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 36
    invoke-virtual {p2, p1}, Ll/᩵ۚۢ;->֫(Z)V

    .line 37
    invoke-virtual {p2}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    return-void
.end method

.method public static ֫(Ll/۬۬ܿ;)V
    .locals 2

    .line 100
    iget-boolean v0, p0, Ll/۬۬ܿ;->ᩳ:Z

    if-nez v0, :cond_0

    .line 111
    iget-object v0, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object p0, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {p0}, Ll/֡ۚۢ;->᩷()V

    :cond_0
    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۬۬ܿ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۬۬ܿ;->ۧ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/۬۬ܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/۬۬ܿ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 117
    iput-boolean v0, p0, Ll/۬۬ܿ;->ᩳ:Z

    .line 118
    iget-object v0, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ۜ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 119
    iget-object v0, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 140
    new-instance v0, Ll/᩶۬ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩶۬ܿ;-><init>(Ll/۬۬ܿ;I)V

    iget-object p1, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ֫(Ljava/lang/CharSequence;)V
    .locals 1

    .line 132
    iget-object v0, p0, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    const/4 v0, 0x0

    .line 47
    iput-boolean v0, p0, Ll/۬۬ܿ;->ۧ:Z

    .line 48
    new-instance v0, Ll/ۗ۬ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۗ۬ܿ;-><init>(Ll/۬۬ܿ;Ljava/lang/Runnable;)V

    iget-object p1, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {p1, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 144
    new-instance v0, Ll/᩹۬ܿ;

    invoke-direct {v0, p0, p1}, Ll/᩹۬ܿ;-><init>(Ll/۬۬ܿ;Ljava/lang/String;)V

    iget-object p1, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ۧ()Ll/֡ۚۢ;
    .locals 1

    .line 159
    iget-object v0, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    return-object v0
.end method

.method public final ۧ(I)V
    .locals 1

    .line 148
    new-instance v0, Ll/ۙ۬ܿ;

    invoke-direct {v0, p0, p1}, Ll/ۙ۬ܿ;-><init>(Ll/۬۬ܿ;I)V

    iget-object p1, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ܳ()V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/۬۬ܿ;->֫:Ll/ۗܺ᩷;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Landroid/app/Activity;->isDestroyed()Z

    move-result v0

    if-nez v0, :cond_0

    .line 112
    iget-object v0, p0, Ll/۬۬ܿ;->ܽ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    :cond_0
    return-void
.end method

.method public final ܽ()Landroid/widget/TextView;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    return-object v0
.end method

.method public final ܽ(I)V
    .locals 3

    const/4 v0, 0x0

    .line 98
    iput-boolean v0, p0, Ll/۬۬ܿ;->ᩳ:Z

    .line 99
    new-instance v0, Ll/᩸۬ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ll/᩸۬ܿ;-><init>(ILjava/lang/Object;)V

    int-to-long v1, p1

    invoke-static {v0, v1, v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public final ܿ()V
    .locals 2

    const v0, 0x7f120b85

    .line 136
    iget-object v1, p0, Ll/۬۬ܿ;->ܿ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ᩳ()Z
    .locals 1

    .line 72
    iget-boolean v0, p0, Ll/۬۬ܿ;->ۧ:Z

    return v0
.end method
