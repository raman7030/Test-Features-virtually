.class public final Ll/᩵ۡ;
.super Ljava/lang/Object;
.source "N5WL"


# direct methods
.method public static ֫(Landroid/widget/ThemedSpinnerAdapter;Landroid/content/res/Resources$Theme;)V
    .locals 1

    .line 1111
    invoke-interface {p0}, Landroid/widget/ThemedSpinnerAdapter;->getDropDownViewTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 50
    invoke-static {v0, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1112
    invoke-interface {p0, p1}, Landroid/widget/ThemedSpinnerAdapter;->setDropDownViewTheme(Landroid/content/res/Resources$Theme;)V

    :cond_0
    return-void
.end method
