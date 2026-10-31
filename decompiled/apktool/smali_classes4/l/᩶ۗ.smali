.class public final Ll/᩶ۗ;
.super Ljava/lang/Object;
.source "Z4TG"


# direct methods
.method public static ֫(Landroid/content/res/Resources$Theme;)V
    .locals 2

    .line 739
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 740
    invoke-static {p0}, Ll/᩹ۗ;->֫(Landroid/content/res/Resources$Theme;)V

    return-void

    :cond_0
    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 742
    invoke-static {p0}, Ll/᩸ۗ;->֫(Landroid/content/res/Resources$Theme;)V

    :cond_1
    return-void
.end method
