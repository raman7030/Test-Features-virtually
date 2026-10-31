.class public final Ll/᩶᩸ܳ;
.super Ll/ܳܶܳ;
.source "Y4ZV"


# instance fields
.field public ۛ:Ll/᩹᩸ܳ;

.field public final ۤ:Ll/ۖۡۡ;

.field public final ۨ:Ll/ۙ᩸ܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/ۙ᩸ܳ;)V
    .locals 0

    .line 188
    invoke-direct {p0, p1, p2}, Ll/ܳܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    const p1, 0x7f0a03eb

    .line 189
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۖۡۡ;

    iput-object p1, p0, Ll/᩶᩸ܳ;->ۤ:Ll/ۖۡۡ;

    .line 190
    sget p2, Ll/᩹֡᩷;->֫:I

    invoke-virtual {p1, p2}, Ll/ۖۡۡ;->ܽ(I)V

    .line 191
    sget p2, Ll/᩹֡᩷;->֫:I

    invoke-virtual {p1, p2}, Ll/ۖۡۡ;->ۧ(I)V

    .line 192
    iput-object p3, p0, Ll/᩶᩸ܳ;->ۨ:Ll/ۙ᩸ܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶᩸ܳ;)Ll/ۖۡۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩶᩸ܳ;->ۤ:Ll/ۖۡۡ;

    return-object p0
.end method

.method public static ֫(Ll/᩶᩸ܳ;Landroid/view/MenuItem;)V
    .locals 9

    .line 239
    iget-object v0, p0, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    iget-object v1, p0, Ll/᩶᩸ܳ;->ۨ:Ll/ۙ᩸ܳ;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v2, 0x7f1205f9

    const/4 v3, 0x1

    if-ne p1, v2, :cond_0

    .line 241
    iget-object p0, p0, Ll/᩶᩸ܳ;->ۛ:Ll/᩹᩸ܳ;

    iget-object p0, p0, Ll/᩹᩸ܳ;->ۤ:Ll/ۘܶܿ;

    sget p1, Ll/ۙ᩸ܳ;->ۛ:I

    .line 304
    new-instance p1, Ll/᩸᩸ܳ;

    iget-object v0, v1, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-direct {p1, v0, p0}, Ll/᩸᩸ܳ;-><init>(Ll/ۗܺ᩷;Ll/ۘܶܿ;)V

    const v0, 0x7f1202dd

    .line 314
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->ۡ(I)V

    iget-object v0, p0, Ll/ۘܶܿ;->ܿ:Ljava/lang/String;

    .line 315
    invoke-virtual {p1, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    iget-object p0, p0, Ll/ۘܶܿ;->ܳ:Landroid/net/Uri;

    .line 316
    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ll/۬ۗܿ;->ܽ(Ljava/lang/String;)V

    sget-object p0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    .line 317
    invoke-virtual {p1, p0}, Ll/۬ۗܿ;->֫(Landroid/content/res/ColorStateList;)V

    .line 318
    invoke-virtual {p1}, Ll/۬ۗܿ;->۠()V

    const/4 p0, 0x6

    .line 319
    invoke-virtual {p1, p0}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 320
    invoke-virtual {p1}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p1, v3}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_0
    const v2, 0x7f12044a

    const/4 v4, 0x0

    const/4 v5, 0x0

    const v6, 0x7f12015e

    const v7, 0x7f12070a

    const v8, 0x7f120491

    if-ne p1, v2, :cond_1

    .line 243
    sget p1, Ll/ۙ᩸ܳ;->ۛ:I

    .line 284
    iget-object p1, v1, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 285
    invoke-virtual {p1, v8}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 286
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v0, v2, v4

    const v0, 0x7f12044f

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ܶ᩸ܳ;

    invoke-direct {v0, v1, p0}, Ll/ܶ᩸ܳ;-><init>(Ll/ۙ᩸ܳ;Ll/᩶᩸ܳ;)V

    .line 287
    invoke-virtual {p1, v7, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 296
    invoke-virtual {p1, v6, v5}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 297
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_1
    const v2, 0x7f1205ca

    if-ne p1, v2, :cond_2

    .line 245
    sget p1, Ll/ۙ᩸ܳ;->ۛ:I

    .line 267
    iget-object p1, v1, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    .line 268
    invoke-virtual {p1, v8}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 269
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v3, [Ljava/lang/Object;

    aput-object v0, v2, v4

    const v0, 0x7f120870

    invoke-static {v0, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/᩹ܶܽ;

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1, p0}, Ll/᩹ܶܽ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 270
    invoke-virtual {p1, v7, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 279
    invoke-virtual {p1, v6, v5}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 280
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_2
    const p0, 0x7f1209b5

    if-ne p1, p0, :cond_3

    .line 247
    iget-object p0, v1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p0}, Ll/ۗܶܳ;->֫()V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩶᩸ܳ;Ll/᩹᩸ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶᩸ܳ;->ۛ:Ll/᩹᩸ܳ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 224
    iget-object p1, p0, Ll/᩶᩸ܳ;->ۨ:Ll/ۙ᩸ܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1}, Ll/ۗܶܳ;->ܽ()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 227
    :cond_0
    iget-object p1, p0, Ll/᩶᩸ܳ;->ۛ:Ll/᩹᩸ܳ;

    if-eqz p1, :cond_2

    iget-object p1, p1, Ll/᩹᩸ܳ;->ۤ:Ll/ۘܶܿ;

    if-nez p1, :cond_1

    goto :goto_0

    .line 230
    :cond_1
    new-instance p1, Ll/᩸ۖ;

    iget-object v1, p0, Ll/ܳܶܳ;->᩸:Ll/ۗܺ᩷;

    const v2, 0x800003

    iget-object v3, p0, Ll/ܳܶܳ;->۫:Landroid/view/View;

    invoke-direct {p1, v1, v3, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 231
    invoke-static {v3}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 232
    invoke-virtual {p1}, Ll/᩸ۖ;->ᩳ()V

    .line 233
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v2, 0x7f1205f9

    .line 234
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080231

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1205ca

    .line 235
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801e7

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f12044a

    .line 236
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080207

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1209b5

    .line 237
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0801ee

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 238
    new-instance v0, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 251
    invoke-virtual {p1}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    return v0
.end method

.method public final ֫(Landroid/content/res/Resources$Theme;)V
    .locals 1

    .line 197
    invoke-super {p0, p1}, Ll/ܳܶܳ;->֫(Landroid/content/res/Resources$Theme;)V

    .line 198
    sget p1, Ll/᩹֡᩷;->֫:I

    iget-object v0, p0, Ll/᩶᩸ܳ;->ۤ:Ll/ۖۡۡ;

    invoke-virtual {v0, p1}, Ll/ۖۡۡ;->ܽ(I)V

    .line 199
    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v0, p1}, Ll/ۖۡۡ;->ۧ(I)V

    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 209
    iget-object v0, p0, Ll/᩶᩸ܳ;->ۛ:Ll/᩹᩸ܳ;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/᩹᩸ܳ;->ۤ:Ll/ۘܶܿ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 214
    check-cast p1, Ll/᩶᩸ܳ;

    .line 215
    invoke-virtual {p0}, Ll/᩶᩸ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll/᩶᩸ܳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 216
    iget-object v0, p0, Ll/᩶᩸ܳ;->ۨ:Ll/ۙ᩸ܳ;

    invoke-static {v0, p0, p1}, Ll/ۙ᩸ܳ;->֫(Ll/ۙ᩸ܳ;Ll/᩶᩸ܳ;Ll/᩶᩸ܳ;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
