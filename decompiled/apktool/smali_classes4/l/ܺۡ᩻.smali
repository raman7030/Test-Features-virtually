.class public final Ll/ܺۡ᩻;
.super Ll/ۤۜܳ;
.source "TAIM"


# virtual methods
.method public final ֫(Ll/ܽۢܳ;)V
    .locals 3

    .line 698
    invoke-static {}, Ll/ۚۡ᩻;->ۜ֫()Z

    move-result p1

    xor-int/lit8 v0, p1, 0x1

    .line 691
    sget-object v1, Ll/᩶ۡ᩷;->᩶:Landroid/content/SharedPreferences;

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "show_hidden_file"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    if-nez p1, :cond_0

    const p1, 0x7f120a06

    .line 701
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    goto :goto_0

    :cond_0
    const p1, 0x7f120a05

    .line 703
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    :goto_0
    const/4 p1, 0x0

    .line 705
    invoke-static {p1}, Ll/ܶ᩹᩷;->֫(Ljava/lang/String;)V

    return-void
.end method

.method public final ܿ()Z
    .locals 1

    .line 715
    invoke-static {}, Ll/ۚۡ᩻;->ۜ֫()Z

    move-result v0

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
