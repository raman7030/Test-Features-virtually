.class public final Ll/۫ܶܽ;
.super Ljava/lang/Object;
.source "MB7O"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;)Ll/ܶ᩵ܿ;
    .locals 4

    .line 228
    invoke-virtual {p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    const-string v1, ".arsc"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 229
    :try_start_0
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    const-string v2, "resources.arsc"

    .line 230
    invoke-virtual {v0, v2}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 232
    sget-object v3, Ll/ܽ֡ܿ;->᩷:Ll/ܶ᩵ܿ;

    invoke-virtual {v3, v1}, Ll/ܶ᩵ܿ;->᩻(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 233
    invoke-virtual {v0, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;)Ljava/io/InputStream;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/ܶ᩵ܿ;->֫(Ljava/io/InputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 236
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-object p0

    :catchall_0
    move-exception v1

    .line 229
    :try_start_3
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_1
    return-object p0
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/۟ۜᩳ;)V
    .locals 7

    .line 244
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00a9

    .line 245
    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a017d

    .line 246
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/EditText;

    const v3, 0x7f0a017e

    .line 247
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/EditText;

    const v4, 0x7f0a0631

    .line 248
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f1205b7

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    const/4 v4, 0x0

    .line 249
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 250
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setKeyListener(Landroid/text/method/KeyListener;)V

    .line 251
    iget-object v5, p1, Ll/۟ۜᩳ;->ܿ:Ljava/lang/String;

    iget-object v6, p1, Ll/۟ۜᩳ;->ܳ:Ljava/lang/String;

    invoke-static {v5, v6, v2, v3}, Ll/֫᩷ᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Landroid/widget/EditText;Landroid/widget/EditText;)V

    .line 252
    sget v5, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v5, Ll/᩵ۚۢ;

    invoke-direct {v5, v0}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 253
    invoke-virtual {v5, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v0, Ll/᩹ܶܽ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, p0}, Ll/᩹ܶܽ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7f12070a

    .line 254
    invoke-virtual {v5, p0, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    .line 257
    invoke-virtual {v5, p0, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12030f

    .line 258
    invoke-virtual {v5, p0, v4}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 259
    invoke-virtual {v5}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p0

    .line 260
    invoke-virtual {p0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p0

    new-instance v0, Ll/᩶ܶܽ;

    invoke-direct {v0, p1, v2, v3, v1}, Ll/᩶ܶܽ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 261
    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
