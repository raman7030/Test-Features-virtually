.class public final synthetic Ll/ܽۛ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ᩳۛ᩷;

.field public final synthetic ᩹:Ll/ܳۛ᩷;


# direct methods
.method public synthetic constructor <init>(Ll/ᩳۛ᩷;Ll/ܳۛ᩷;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽۛ᩷;->᩸:Ll/ᩳۛ᩷;

    iput-object p2, p0, Ll/ܽۛ᩷;->᩹:Ll/ܳۛ᩷;

    iput p3, p0, Ll/ܽۛ᩷;->᩶:I

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 7

    .line 2847
    iget-object v0, p0, Ll/ܽۛ᩷;->᩸:Ll/ᩳۛ᩷;

    iget-object v0, v0, Ll/ᩳۛ᩷;->۫:Ll/ܿۛ᩷;

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    const v1, 0x7f120189

    .line 2848
    iget-object v2, p0, Ll/ܽۛ᩷;->᩹:Ll/ܳۛ᩷;

    if-ne p1, v1, :cond_0

    .line 2849
    invoke-virtual {v2, v0}, Ll/ܳۛ᩷;->ۧ(Ll/ܿۛ᩷;)V

    goto/16 :goto_0

    :cond_0
    const v1, 0x7f0a036b

    .line 2850
    iget v3, p0, Ll/ܽۛ᩷;->᩶:I

    if-ne p1, v1, :cond_1

    .line 2851
    invoke-virtual {v0, v3}, Ll/ܿۛ᩷;->ۜ(I)V

    goto/16 :goto_0

    :cond_1
    const v1, 0x7f0a0369

    const/4 v4, 0x0

    const v5, 0x7f12015e

    const v6, 0x7f12070a

    if-ne p1, v1, :cond_2

    const p1, 0x7f0d00e5

    .line 1828
    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v1, 0x7f0a03b2

    .line 1829
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f1207d2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a00d9

    .line 1830
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    .line 1831
    new-instance v2, Ll/۫۫᩷;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0, v1}, Ll/۫۫᩷;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1843
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    .line 1844
    invoke-virtual {v0, v6, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1845
    invoke-virtual {v0, v5, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1846
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_0

    :cond_2
    const v1, 0x7f0a036c

    if-ne p1, v1, :cond_3

    .line 1850
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    const v1, 0x7f120b7b

    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    const v1, 0x7f1207d9

    .line 1851
    invoke-virtual {p1, v1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance v1, Ll/᩷ܰܿ;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Ll/᩷ܰܿ;-><init>(Ll/ۗܺ᩷;I)V

    .line 1852
    invoke-virtual {p1, v6, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1859
    invoke-virtual {p1, v5, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 1860
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    goto :goto_0

    :cond_3
    const v1, 0x7f0a0368

    if-ne p1, v1, :cond_4

    .line 2857
    invoke-virtual {v0, v3}, Ll/ܿۛ᩷;->ܳ(I)V

    goto :goto_0

    :cond_4
    const v1, 0x7f0a036a

    if-ne p1, v1, :cond_5

    .line 2859
    invoke-virtual {v0, v3}, Ll/ܿۛ᩷;->᩻(I)V

    goto :goto_0

    :cond_5
    const v1, 0x7f1209de

    if-ne p1, v1, :cond_6

    .line 2861
    invoke-static {v0, v3}, Ll/ܿۛ᩷;->ܽ(Ll/ܿۛ᩷;I)V

    goto :goto_0

    :cond_6
    const v1, 0x7f120530

    if-ne p1, v1, :cond_7

    .line 2863
    invoke-static {v0}, Ll/ܿۛ᩷;->᩶(Ll/ܿۛ᩷;)Ll/ۘۛ᩷;

    move-result-object p1

    invoke-virtual {v2, p1}, Ll/ܳۛ᩷;->֫(Ll/ۘۛ᩷;)V

    .line 2864
    invoke-virtual {v0}, Ll/ܿۛ᩷;->ܰ()V

    goto :goto_0

    :cond_7
    const v1, 0x7f1209b5

    if-ne p1, v1, :cond_8

    .line 2866
    invoke-static {v0}, Ll/ܿۛ᩷;->᩸(Ll/ܿۛ᩷;)Ll/ܽۢۡ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۢۡ;->֫()V

    :cond_8
    :goto_0
    const/4 p1, 0x1

    return p1
.end method
