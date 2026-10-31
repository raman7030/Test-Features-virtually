.class public final Ll/᩹ۛ;
.super Ljava/lang/Object;
.source "Q34F"


# direct methods
.method public static ֫(Landroid/view/Menu;)V
    .locals 3

    .line 50
    instance-of v0, p0, Ll/᩺۬;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    .line 52
    check-cast p0, Ll/᩺۬;

    invoke-interface {p0, v1}, Ll/᩺۬;->setGroupDividerEnabled(Z)V

    return-void

    .line 53
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-lt v0, v2, :cond_1

    .line 54
    invoke-static {p0, v1}, Ll/᩸ۛ;->֫(Landroid/view/Menu;Z)V

    :cond_1
    return-void
.end method
