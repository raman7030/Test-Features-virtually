.class public final Ll/ܺᩳ᩻;
.super Ll/֫ۜܳ;
.source "38V8"


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 9

    .line 33
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a5

    .line 34
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0481

    .line 35
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Landroid/widget/RadioGroup;

    const v2, 0x7f0a00da

    .line 36
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Landroid/widget/CheckBox;

    const v2, 0x7f0a00de

    .line 37
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Landroid/widget/CheckBox;

    .line 38
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "eflr"

    const/4 v4, 0x1

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    const v2, 0x7f0a0479

    goto :goto_0

    :cond_0
    const v2, 0x7f0a047a

    :goto_0
    invoke-virtual {v5, v2}, Landroid/widget/RadioGroup;->check(I)V

    .line 40
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "efls"

    const/4 v8, 0x0

    invoke-interface {v2, v3, v8}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v6, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 41
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "eflfs"

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v7, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 42
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 43
    invoke-virtual {p0}, Ll/֫ۜܳ;->ᩳ()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 44
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v1, Ll/ۢᩳ᩻;

    move-object v3, v1

    move-object v4, p0

    move-object v8, p1

    invoke-direct/range {v3 .. v8}, Ll/ۢᩳ᩻;-><init>(Ll/ܺᩳ᩻;Landroid/widget/RadioGroup;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ۖۢܳ;)V

    const p1, 0x7f12070a

    .line 45
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 56
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 57
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
