.class public final Ll/ᩴܶܳ;
.super Ll/ܳܶܳ;
.source "L5KK"


# instance fields
.field public ۛ:Ll/ۘܶܳ;

.field public final ۤ:Ll/᩵ܶܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/᩵ܶܳ;)V
    .locals 0

    .line 239
    invoke-direct {p0, p1, p2}, Ll/ܳܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    .line 240
    iput-object p3, p0, Ll/ᩴܶܳ;->ۤ:Ll/᩵ܶܳ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴܶܳ;)Ll/ۘܶܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴܶܳ;->ۛ:Ll/ۘܶܳ;

    return-object p0
.end method

.method public static ֫(Ll/ᩴܶܳ;Landroid/view/MenuItem;)V
    .locals 5

    .line 276
    iget-object v0, p0, Ll/ᩴܶܳ;->ۤ:Ll/᩵ܶܳ;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f1202dd

    const/4 v2, 0x1

    if-ne p1, v1, :cond_0

    .line 278
    sget-object p1, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p0

    .line 93
    iget-object p1, v0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1, v0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result p1

    sub-int p1, p0, p1

    sub-int/2addr p1, v2

    .line 334
    invoke-static {}, Ll/ۡᩴܳ;->ܺ()Ll/ۜᩴܳ;

    move-result-object v1

    invoke-virtual {v1, p1}, Ll/ۜᩴܳ;->ۧ(I)Ll/ܽᩴܳ;

    move-result-object p1

    .line 335
    iget-object v1, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    new-instance v2, Ll/ۡܶܳ;

    invoke-direct {v2, v0, p0}, Ll/ۡܶܳ;-><init>(Ll/᩵ܶܳ;I)V

    invoke-virtual {p1, v1, v2}, Ll/ܽᩴܳ;->֫(Ll/ۗܺ᩷;Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const v1, 0x7f1205ca

    if-ne p1, v1, :cond_1

    .line 280
    sget-object p1, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    .line 305
    iget-object p1, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v1, 0x7f120491

    .line 306
    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v1, p0, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    .line 307
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const v1, 0x7f12086d

    invoke-static {v1, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v1, Ll/۟ۢܳ;

    invoke-direct {v1, v2, v0, p0}, Ll/۟ۢܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p0, 0x7f12070a

    .line 308
    invoke-virtual {p1, p0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 v0, 0x0

    .line 320
    invoke-virtual {p1, p0, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 321
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_1
    const v1, 0x7f1209b5

    if-ne p1, v1, :cond_2

    .line 282
    iget-object p0, v0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p0}, Ll/ۗܶܳ;->֫()V

    return-void

    :cond_2
    const v1, 0x7f120a8a

    if-ne p1, v1, :cond_3

    .line 284
    sget-object p1, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p0

    .line 93
    iget-object p1, v0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1, v0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result p1

    sub-int/2addr p0, p1

    sub-int/2addr p0, v2

    .line 327
    invoke-static {}, Ll/ۡᩴܳ;->ܺ()Ll/ۜᩴܳ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/ۜᩴܳ;->ۧ(I)Ll/ܽᩴܳ;

    move-result-object p0

    .line 328
    iget-object p1, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p0, p1}, Ll/ܽᩴܳ;->֫(Ll/ۗܺ᩷;)V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ᩴܶܳ;Ll/ۘܶܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ᩴܶܳ;->ۛ:Ll/ۘܶܳ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 261
    iget-object p1, p0, Ll/ᩴܶܳ;->ۤ:Ll/᩵ܶܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1}, Ll/ۗܶܳ;->ܽ()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 264
    :cond_0
    iget-object p1, p0, Ll/ᩴܶܳ;->ۛ:Ll/ۘܶܳ;

    if-nez p1, :cond_1

    :goto_0
    return v0

    .line 267
    :cond_1
    new-instance p1, Ll/᩸ۖ;

    iget-object v1, p0, Ll/ܳܶܳ;->᩸:Ll/ۗܺ᩷;

    const v2, 0x800003

    iget-object v3, p0, Ll/ܳܶܳ;->۫:Landroid/view/View;

    invoke-direct {p1, v1, v3, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 268
    invoke-static {v3}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 269
    invoke-virtual {p1}, Ll/᩸ۖ;->ᩳ()V

    .line 270
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v2, 0x7f1202dd

    .line 271
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801f0

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1205ca

    .line 272
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801e7

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1209b5

    .line 273
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801ee

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f120a8a

    .line 274
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f08023f

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 275
    new-instance v0, Ll/ۛۤᩳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/ۛۤᩳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 288
    invoke-virtual {p1}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫(Ll/ۗ۬ۧ;)Z
    .locals 7

    .line 255
    check-cast p1, Ll/ᩴܶܳ;

    sget-object v0, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    iget-object v0, p0, Ll/ᩴܶܳ;->ۤ:Ll/᩵ܶܳ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v1

    .line 295
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 93
    iget-object v2, v0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v2, v0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v3

    sub-int v3, v1, v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    invoke-virtual {v2, v0}, Ll/ۗܶܳ;->֫(Ll/۫ܶܳ;)I

    move-result v5

    sub-int v5, p1, v5

    sub-int/2addr v5, v4

    .line 298
    invoke-static {}, Ll/ۡᩴܳ;->ܺ()Ll/ۜᩴܳ;

    move-result-object v6

    invoke-virtual {v6, v3, v5}, Ll/ۜᩴܳ;->֫(II)V

    .line 299
    iget-object v0, v0, Ll/۫ܶܳ;->᩶:Ljava/util/ArrayList;

    invoke-static {v3, v5, v0}, Ll/ۛ۫ۡ;->֫(IILjava/util/List;)V

    .line 300
    invoke-virtual {v2, v1, p1}, Ll/᩶ۗۧ;->notifyItemMoved(II)V

    .line 45
    sget-object p1, Ll/᩵ܶܳ;->ۨ:Ll/ۚۡ֫;

    const-class v0, Ljava/lang/Object;

    invoke-virtual {p1, v0}, Ll/ۚۡ֫;->֫(Ljava/lang/Object;)V

    return v4
.end method
