.class public final Ll/ۛ֨ۘ;
.super Ljava/lang/Object;
.source "L7JU"


# direct methods
.method public static final ֫(ILandroid/view/View;)V
    .locals 1

    const-string v0, "<this>"

    .line 5
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 19
    iput p0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 20
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    return-void
.end method
