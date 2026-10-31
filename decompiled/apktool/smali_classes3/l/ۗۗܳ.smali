.class public final Ll/ۗۗܳ;
.super Ll/ۖ۠ۢ;
.source "X4HD"


# virtual methods
.method public final ֫(Ll/ۗܺ᩷;Ll/ܿ۠ۢ;Z)V
    .locals 1

    .line 360
    invoke-virtual {p2}, Ll/ܿ۠ۢ;->ᩳ()Z

    move-result p2

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    const p3, 0x7f120235

    .line 24
    invoke-virtual {p1, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "def_sign_key_warn"

    invoke-static {p1, v0, p3, p2}, Ll/ۧۛܿ;->֫(Ll/ۗܺ᩷;Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_0
    return-void
.end method
