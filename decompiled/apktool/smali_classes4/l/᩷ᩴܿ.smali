.class public final synthetic Ll/᩷ᩴܿ;
.super Ljava/lang/Object;
.source "N15M"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۗ:Ll/᩵ᩴܿ;

.field public final synthetic ۙ:Ll/֡ᩴܿ;

.field public final synthetic ᩶:Ll/֡ۚۢ;

.field public final synthetic ᩸:Ll/۫ۨᩳ;

.field public final synthetic ᩹:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/TextView;Ll/۫ۨᩳ;Ll/᩵ᩴܿ;Ll/֡ᩴܿ;Ll/֡ۚۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/᩷ᩴܿ;->᩸:Ll/۫ۨᩳ;

    iput-object p1, p0, Ll/᩷ᩴܿ;->᩹:Landroid/widget/TextView;

    iput-object p5, p0, Ll/᩷ᩴܿ;->᩶:Ll/֡ۚۢ;

    iput-object p4, p0, Ll/᩷ᩴܿ;->ۙ:Ll/֡ᩴܿ;

    iput-object p3, p0, Ll/᩷ᩴܿ;->ۗ:Ll/᩵ᩴܿ;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    .line 168
    new-instance v0, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    .line 68
    invoke-direct {v0, v1, p1, v2}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 169
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f1201fe

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801e3

    .line 170
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 171
    iget-object v5, p0, Ll/᩷ᩴܿ;->᩸:Ll/۫ۨᩳ;

    invoke-virtual {v5}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result p1

    if-nez p1, :cond_0

    .line 172
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f120899

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f080225

    .line 173
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 175
    :cond_0
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f12076f

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f080226

    .line 176
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 177
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f1202a6

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801e9

    .line 178
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 179
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v1, 0x7f12044e

    invoke-interface {p1, v2, v1, v2, v1}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f080252

    .line 180
    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 181
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    .line 182
    new-instance p1, Ll/ۡᩴܿ;

    iget-object v4, p0, Ll/᩷ᩴܿ;->᩹:Landroid/widget/TextView;

    iget-object v6, p0, Ll/᩷ᩴܿ;->ۗ:Ll/᩵ᩴܿ;

    iget-object v7, p0, Ll/᩷ᩴܿ;->ۙ:Ll/֡ᩴܿ;

    iget-object v8, p0, Ll/᩷ᩴܿ;->᩶:Ll/֡ۚۢ;

    move-object v3, p1

    invoke-direct/range {v3 .. v8}, Ll/ۡᩴܿ;-><init>(Landroid/widget/TextView;Ll/۫ۨᩳ;Ll/᩵ᩴܿ;Ll/֡ᩴܿ;Ll/֡ۚۢ;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 207
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    return-void
.end method
