.class public final synthetic Ll/ۢۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 402
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "enable_auto_signature"

    .line 0
    invoke-static {p1, v0, p2}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    .line 403
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string p2, "show_auto_settings_tip"

    const/4 v0, 0x1

    invoke-interface {p1, p2, v0}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    const p1, 0x7f120103

    .line 404
    invoke-static {p1}, Ll/᩸ۚۢ;->ۧ(I)V

    :cond_0
    return-void
.end method
