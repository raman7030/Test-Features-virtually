.class public final Ll/᩵᩸ܳ;
.super Ll/ܳܶܳ;
.source "94PF"


# instance fields
.field public final ۛ:Ll/֡᩸ܳ;

.field public ۤ:Ll/ᩴ᩸ܳ;


# direct methods
.method public constructor <init>(Lbin/mt/plus/Main;Landroid/view/View;Ll/֡᩸ܳ;)V
    .locals 0

    .line 153
    invoke-direct {p0, p1, p2}, Ll/ܳܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    .line 154
    iput-object p3, p0, Ll/᩵᩸ܳ;->ۛ:Ll/֡᩸ܳ;

    return-void
.end method

.method public static ֫(Ll/᩵᩸ܳ;Landroid/view/MenuItem;)V
    .locals 5

    .line 191
    iget-object v0, p0, Ll/᩵᩸ܳ;->ۛ:Ll/֡᩸ܳ;

    iget-object v1, p0, Ll/᩵᩸ܳ;->ۤ:Ll/ᩴ᩸ܳ;

    invoke-static {v1}, Ll/ᩴ᩸ܳ;->ۧ(Ll/ᩴ᩸ܳ;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/String;

    invoke-static {v1, v3}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v1

    .line 192
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const/4 v3, 0x1

    const v4, 0x7f1205f9

    if-ne p1, v4, :cond_0

    .line 194
    sget-object p0, Ll/֡᩸ܳ;->ۨ:Ll/ܶ᩵ܿ;

    .line 234
    new-instance p0, Ll/ۘ᩸ܳ;

    iget-object p1, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-direct {p0, v0, p1, v1}, Ll/ۘ᩸ܳ;-><init>(Ll/֡᩸ܳ;Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V

    .line 263
    invoke-virtual {p0, v4}, Ll/۬ۗܿ;->ۡ(I)V

    .line 264
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 265
    invoke-virtual {p0}, Ll/۬ۗܿ;->֫()V

    const/4 p1, 0x6

    .line 266
    invoke-virtual {p0, p1}, Ll/۬ۗܿ;->ᩳ(I)V

    .line 267
    invoke-virtual {p0}, Ll/۬ۗܿ;->᩵()V

    .line 205
    invoke-virtual {p0, v3}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void

    :cond_0
    const v4, 0x7f120530

    if-ne p1, v4, :cond_1

    .line 196
    invoke-virtual {v1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ll/֡᩸ܳ;->ۨ:Ll/ܶ᩵ܿ;

    .line 272
    iget-object p1, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Lbin/mt/plus/Main;->ۨ()V

    .line 273
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 274
    invoke-virtual {p1}, Lbin/mt/plus/Main;->ܿ֫()Ll/ۢۘܳ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۢۘܳ;->ۜ()Ll/ܽۢܳ;

    move-result-object p1

    .line 275
    invoke-virtual {p1, p0}, Ll/ܽۢܳ;->ܽ(Ljava/lang/String;)V

    return-void

    :cond_1
    const v4, 0x7f1205ca

    if-ne p1, v4, :cond_2

    .line 198
    sget-object p1, Ll/֡᩸ܳ;->ۨ:Ll/ܶ᩵ܿ;

    .line 210
    iget-object p1, v0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v4, 0x7f120b7b

    .line 211
    invoke-virtual {p1, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    iget-object v4, p0, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    .line 212
    invoke-virtual {v4}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v4, v3, v2

    const v4, 0x7f120870

    invoke-static {v4, v3}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v3, Ll/᩻۬᩻;

    const/4 v4, 0x2

    invoke-direct {v3, v0, v1, p0, v4}, Ll/᩻۬᩻;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;I)V

    const v1, 0x7f12070a

    .line 213
    invoke-virtual {p1, v1, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۡ᩸ܳ;

    invoke-direct {v1, v2, v0, p0}, Ll/ۡ᩸ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x7f12015e

    .line 228
    invoke-virtual {p1, v2, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ܺ᩸ܳ;

    invoke-direct {v1, v0, p0}, Ll/ܺ᩸ܳ;-><init>(Ll/֡᩸ܳ;Ll/᩵᩸ܳ;)V

    .line 229
    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 230
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    :cond_2
    const p0, 0x7f1209b5

    if-ne p1, p0, :cond_3

    .line 200
    iget-object p0, v0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p0}, Ll/ۗܶܳ;->֫()V

    :cond_3
    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩵᩸ܳ;Ll/ᩴ᩸ܳ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩵᩸ܳ;->ۤ:Ll/ᩴ᩸ܳ;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 176
    iget-object p1, p0, Ll/᩵᩸ܳ;->ۛ:Ll/֡᩸ܳ;

    iget-object p1, p1, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {p1}, Ll/ۗܶܳ;->ܽ()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    goto :goto_0

    .line 179
    :cond_0
    iget-object p1, p0, Ll/᩵᩸ܳ;->ۤ:Ll/ᩴ᩸ܳ;

    if-nez p1, :cond_1

    :goto_0
    return v0

    .line 182
    :cond_1
    new-instance p1, Ll/᩸ۖ;

    iget-object v1, p0, Ll/ܳܶܳ;->᩸:Ll/ۗܺ᩷;

    const v2, 0x800003

    iget-object v3, p0, Ll/ܳܶܳ;->۫:Landroid/view/View;

    invoke-direct {p1, v1, v3, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 183
    invoke-static {v3}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 184
    invoke-virtual {p1}, Ll/᩸ۖ;->ᩳ()V

    .line 185
    invoke-virtual {p1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v1

    const v2, 0x7f1205f9

    .line 186
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080231

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f120530

    .line 187
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080219

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1205ca

    .line 188
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801e7

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    const v2, 0x7f1209b5

    .line 189
    invoke-interface {v1, v0, v2, v0, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v0

    const v1, 0x7f0801ee

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 190
    new-instance v0, Ll/ۗܽܽ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/ۗܽܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 204
    invoke-virtual {p1}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method

.method public final ֫()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ֫(Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 169
    check-cast p1, Ll/᩵᩸ܳ;

    .line 170
    iget-object v0, p0, Ll/᩵᩸ܳ;->ۛ:Ll/֡᩸ܳ;

    invoke-static {v0, p0, p1}, Ll/֡᩸ܳ;->֫(Ll/֡᩸ܳ;Ll/᩵᩸ܳ;Ll/᩵᩸ܳ;)V

    const/4 p1, 0x1

    return p1
.end method
