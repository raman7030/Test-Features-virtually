.class public final Ll/ᩴᩴܿ;
.super Ll/᩶ۡۡ;
.source "N15M"


# virtual methods
.method public final ֫(Landroid/widget/TextView;Z)V
    .locals 1

    const-string v0, "textView"

    .line 6
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x11

    .line 82
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v0, 0x41a80000    # 21.0f

    .line 83
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextSize(F)V

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    const/4 p2, 0x4

    .line 84
    :goto_0
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
