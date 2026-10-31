.class public final Ll/ۙ᩺;
.super Ljava/lang/Object;
.source "63SN"


# direct methods
.method public static ֫(Landroid/view/Window;Z)V
    .locals 2

    .line 119
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 120
    invoke-static {p0, p1}, Ll/᩶᩺;->֫(Landroid/view/Window;Z)V

    return-void

    .line 150
    :cond_0
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p0

    .line 151
    invoke-virtual {p0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v0

    if-eqz p1, :cond_1

    and-int/lit16 p1, v0, -0x701

    goto :goto_0

    :cond_1
    or-int/lit16 p1, v0, 0x700

    .line 152
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
