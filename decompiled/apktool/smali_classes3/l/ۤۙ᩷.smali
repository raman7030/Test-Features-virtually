.class public final Ll/ۤۙ᩷;
.super Ljava/lang/Object;
.source "8AHX"


# instance fields
.field public ֫:[Ljava/lang/String;

.field public ۜ:I

.field public ۧ:Ll/ܶ᩵ܿ;

.field public ܳ:Ll/֡ۚۢ;

.field public ܽ:I

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ljava/lang/String;

.field public ᩷:Ll/ܶ᩵ܿ;

.field public ᩻:Z


# virtual methods
.method public final ֫()V
    .locals 3

    .line 305
    iget v0, p0, Ll/ۤۙ᩷;->ۜ:I

    iget v1, p0, Ll/ۤۙ᩷;->ܽ:I

    const/4 v2, 0x1

    if-ne v0, v1, :cond_1

    .line 306
    iget-object v0, p0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 307
    iget-object v0, p0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    iget-object v1, p0, Ll/ۤۙ᩷;->ܿ:Ljava/lang/String;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 309
    :cond_1
    iget-object v0, p0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 310
    iget-object v0, p0, Ll/ۤۙ᩷;->ܳ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
