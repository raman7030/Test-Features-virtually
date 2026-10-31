.class public final Ll/ܶۜ᩷;
.super Ll/۟ۜ᩷;
.source "57P8"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginProgressBar;


# instance fields
.field public final ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginProgressBar$Style;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2}, Ll/۟ۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    .line 14
    iput-object p3, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    return-void
.end method


# virtual methods
.method public final getMaxProgress()I
    .locals 1

    .line 50
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getMax()I

    move-result v0

    return v0
.end method

.method public final getProgress()I
    .locals 1

    .line 24
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    move-result v0

    return v0
.end method

.method public final getSecondaryProgress()I
    .locals 1

    .line 37
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getSecondaryProgress()I

    move-result v0

    return v0
.end method

.method public final getStyle()Lbin/mt/plugin/api/ui/PluginProgressBar$Style;
    .locals 1

    .line 19
    iget-object v0, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    return-object v0
.end method

.method public final isIndeterminate()Z
    .locals 2

    .line 63
    iget-object v0, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    if-ne v0, v1, :cond_0

    .line 64
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0}, Landroid/widget/ProgressBar;->isIndeterminate()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public final setIndeterminate(Z)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 73
    iget-object v0, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    if-ne v0, v1, :cond_0

    .line 74
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMaxProgress(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 56
    iget-object v0, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    if-ne v0, v1, :cond_0

    .line 57
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setMax(I)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setProgress(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 30
    iget-object v0, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    if-ne v0, v1, :cond_0

    .line 31
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSecondaryProgress(I)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 43
    iget-object v0, p0, Ll/ܶۜ᩷;->ܳ:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    sget-object v1, Lbin/mt/plugin/api/ui/PluginProgressBar$Style;->HORIZONTAL:Lbin/mt/plugin/api/ui/PluginProgressBar$Style;

    if-ne v0, v1, :cond_0

    .line 44
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/ProgressBar;

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setSecondaryProgress(I)V

    :cond_0
    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
