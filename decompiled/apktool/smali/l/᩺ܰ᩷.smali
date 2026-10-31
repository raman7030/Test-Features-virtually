.class public final Ll/᩺ܰ᩷;
.super Ll/ۗ۬ۧ;
.source "E1KB"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Ll/ܶۖ;


# instance fields
.field public ۙ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ܰܰ᩷;

.field public ᩸:Z

.field public ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ܰܰ᩷;Landroid/view/View;)V
    .locals 1

    .line 242
    iput-object p1, p0, Ll/᩺ܰ᩷;->᩶:Ll/ܰܰ᩷;

    .line 243
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a05e2

    .line 244
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩺ܰ᩷;->ۙ:Landroid/widget/TextView;

    const v0, 0x7f0a05ef

    .line 245
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩺ܰ᩷;->᩹:Landroid/widget/TextView;

    .line 246
    invoke-static {p2}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    const v0, 0x7f0a0278

    .line 247
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    invoke-static {p1}, Ll/ܰܰ᩷;->ۧ(Ll/ܰܰ᩷;)Ll/ۤܰ᩷;

    move-result-object p1

    iget-object p1, p1, Ll/ܰܳۡ;->۫:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 248
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method private ۧ(Ljava/lang/String;)V
    .locals 5

    .line 318
    iget-object v0, p0, Ll/᩺ܰ᩷;->᩶:Ll/ܰܰ᩷;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    invoke-direct {v2, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const v1, 0x7f12023f

    .line 319
    invoke-virtual {v2, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/᩺ܰ᩷;->ۙ:Landroid/widget/TextView;

    .line 320
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const v1, 0x7f120870

    invoke-virtual {v0, v1, v3}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۨܰ᩷;

    invoke-direct {v0, p0, p1}, Ll/ۨܰ᩷;-><init>(Ll/᩺ܰ᩷;Ljava/lang/String;)V

    const p1, 0x7f12070a

    .line 321
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 322
    invoke-virtual {v2, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 323
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 278
    sget-object p1, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 281
    :cond_0
    iget-object p1, p0, Ll/᩺ܰ᩷;->᩹:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    .line 282
    iget-object v0, p0, Ll/᩺ܰ᩷;->᩶:Ll/ܰܰ᩷;

    invoke-static {v0}, Ll/ܰܰ᩷;->ܽ(Ll/ܰܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/ܰܰ᩷;->ܽ(Ll/ܰܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 283
    invoke-direct {p0, p1}, Ll/᩺ܰ᩷;->ۧ(Ljava/lang/String;)V

    return-void

    .line 286
    :cond_1
    new-instance v1, Ll/ۛܰ᩷;

    invoke-direct {v1, p0, p1}, Ll/ۛܰ᩷;-><init>(Ll/᩺ܰ᩷;Ljava/lang/String;)V

    const-wide/16 v2, 0x1f4

    invoke-static {v1, v2, v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    .line 291
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v0

    check-cast v0, Ll/ܿۛ᩷;

    const/4 v1, 0x0

    .line 1347
    invoke-virtual {v0, p1, v1}, Ll/ܿۛ᩷;->ۧ(Ljava/lang/String;Ll/᩵ۛ᩷;)V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 296
    new-instance v0, Ll/᩸ۖ;

    iget-object v1, p0, Ll/᩺ܰ᩷;->᩶:Ll/ܰܰ᩷;

    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 297
    iget-boolean p1, p0, Ll/᩺ܰ᩷;->᩸:Z

    if-eqz p1, :cond_0

    .line 298
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f120530

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 300
    :cond_0
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f1205ca

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 301
    invoke-virtual {v0, p0}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 302
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 3

    .line 308
    iget-object v0, p0, Ll/᩺ܰ᩷;->᩹:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 309
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f120530

    iget-object v2, p0, Ll/᩺ܰ᩷;->᩶:Ll/ܰܰ᩷;

    if-ne p1, v1, :cond_0

    .line 310
    invoke-static {v2}, Ll/ܰܰ᩷;->ܿ(Ll/ܰܰ᩷;)Ll/ۘۛ᩷;

    move-result-object p1

    invoke-virtual {p1, v0}, Ll/ۘۛ᩷;->ۧ(Ljava/lang/String;)V

    goto :goto_0

    .line 311
    :cond_0
    invoke-static {v2}, Ll/ܰܰ᩷;->ܽ(Ll/ܰܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 312
    invoke-direct {p0, v0}, Ll/᩺ܰ᩷;->ۧ(Ljava/lang/String;)V

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 8

    .line 253
    invoke-static {p1}, Ll/ܳۛۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x32

    invoke-static {v1, v0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩺ܰ᩷;->ۙ:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v0, 0xc8

    .line 254
    invoke-static {v0, p1}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Ll/᩺ܰ᩷;->᩹:Landroid/widget/TextView;

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 255
    invoke-virtual {v1}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    .line 256
    invoke-virtual {v2}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    .line 257
    invoke-virtual {v0}, Landroid/graphics/Paint;->getFlags()I

    move-result v4

    .line 258
    invoke-virtual {v3}, Landroid/graphics/Paint;->getFlags()I

    move-result v5

    .line 259
    iget-object v6, p0, Ll/᩺ܰ᩷;->᩶:Ll/ܰܰ᩷;

    invoke-static {v6}, Ll/ܰܰ᩷;->ܽ(Ll/ܰܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-static {v6}, Ll/ܰܰ᩷;->ܽ(Ll/ܰܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v6

    invoke-virtual {v6, p1}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 266
    iput-boolean p1, p0, Ll/᩺ܰ᩷;->᩸:Z

    or-int/lit8 p1, v4, 0x10

    or-int/lit8 v4, v5, 0x10

    .line 269
    sget-object v5, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 270
    sget-object v1, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 260
    iput-boolean p1, p0, Ll/᩺ܰ᩷;->᩸:Z

    and-int/lit8 p1, v4, -0x11

    and-int/lit8 v4, v5, -0x11

    .line 263
    sget-object v5, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 264
    sget-object v1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 272
    :goto_1
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setFlags(I)V

    .line 273
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setFlags(I)V

    return-void
.end method
