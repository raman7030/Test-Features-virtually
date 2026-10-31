.class public final Ll/۟۠ܽ;
.super Ljava/lang/Object;
.source "097X"


# direct methods
.method public static ֫(Ll/ܽۢܳ;Ll/۟ۜᩳ;)V
    .locals 10

    .line 321
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a9

    .line 322
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a017d

    .line 323
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    const v3, 0x7f0a017e

    .line 324
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    const v4, 0x7f0a0631

    .line 325
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f1205b8

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    const v4, 0x7f0a00da

    .line 326
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/CheckBox;

    const v5, 0x7f0a00de

    .line 327
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/CheckBox;

    const/4 v6, 0x0

    .line 328
    invoke-virtual {v4, v6}, Landroid/view/View;->setVisibility(I)V

    .line 329
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    const v7, 0x7f120466

    .line 330
    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(I)V

    const v7, 0x7f120462

    .line 331
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(I)V

    .line 332
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v8, "aciad"

    const/4 v9, 0x1

    invoke-interface {v7, v8, v9}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v7

    invoke-virtual {v4, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 333
    invoke-static {}, Ll/ܽ֨ᩳ;->ۧ֫()Z

    move-result v7

    invoke-virtual {v5, v7}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const/4 v7, 0x0

    .line 334
    invoke-virtual {v2, v7}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 335
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 336
    iget-object v8, p1, Ll/۟ۜᩳ;->ܿ:Ljava/lang/String;

    iget-object v9, p1, Ll/۟ۜᩳ;->ܳ:Ljava/lang/String;

    invoke-static {v8, v9, v2, v3}, Ll/֫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 337
    sget v8, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v8, Ll/᩵ۚۢ;

    invoke-direct {v8, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 338
    invoke-virtual {v8, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v0, Ll/ۛ۠ܽ;

    invoke-direct {v0, p1, v4, v5, p0}, Ll/ۛ۠ܽ;-><init>(Ll/۟ۜᩳ;Landroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ܽۢܳ;)V

    const p0, 0x7f12070a

    .line 339
    invoke-virtual {v8, p0, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    .line 344
    invoke-virtual {v8, p0, v7}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12030f

    .line 345
    invoke-virtual {v8, p0, v7}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 346
    invoke-virtual {v8}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 347
    invoke-virtual {p0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p0

    new-instance v0, Ll/ۨ۠ܽ;

    invoke-direct {v0, p1, v2, v3, v6}, Ll/ۨ۠ܽ;-><init>(Ll/۟ۜᩳ;Landroid/widget/EditText;Landroid/widget/EditText;I)V

    .line 348
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
