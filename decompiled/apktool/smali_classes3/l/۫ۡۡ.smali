.class public final synthetic Ll/۫ۡۡ;
.super Ljava/lang/Object;
.source "U2CZ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۫ۡۡ;->᩸:I

    iput-object p2, p0, Ll/۫ۡۡ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 2
    iget v0, p0, Ll/۫ۡۡ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/۫ۡۡ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast p1, Ll/۟ۡۢ;

    .line 12
    invoke-static {p1}, Ll/۟ۡۢ;->֫(Ll/۟ۡۢ;)V

    return-void

    .line 15
    :pswitch_0
    iget-object v0, p0, Ll/۫ۡۡ;->᩹:Ljava/lang/Object;

    .line 17
    check-cast v0, Ll/۠֫ۢ;

    .line 329
    new-instance v1, Ll/᩸ۖ;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object v2

    const/4 v3, 0x0

    .line 68
    invoke-direct {v1, v2, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 330
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    .line 332
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ll/ۢۤۡ;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ".xml"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v5, 0x1e

    invoke-static {v5, v2}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 333
    invoke-virtual {v0}, Ll/۠֫ۢ;->۠()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f1205c2

    .line 334
    invoke-interface {p1, v5, v3, v3, v2}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const/4 v2, 0x1

    .line 335
    invoke-interface {p1, v5, v2, v3, v4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const v2, 0x7f120530

    .line 336
    invoke-interface {p1, v3, v2, v3, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    .line 337
    new-instance p1, Ll/᩸ۜۢ;

    invoke-direct {p1, v0}, Ll/᩸ۜۢ;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 349
    invoke-virtual {v1}, Ll/᩸ۖ;->ܿ()V

    return-void

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/۫ۡۡ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܿۗܳ;

    .line 570
    invoke-virtual {v0}, Ll/ܿۗܳ;->֫()V

    const/4 v0, 0x0

    .line 571
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 572
    check-cast p1, Landroid/widget/Button;

    const v0, -0x777778

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 0
    :pswitch_2
    iget-object p1, p0, Ll/۫ۡۡ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۛۡۡ;

    invoke-static {p1}, Ll/ۛۡۡ;->֫(Ll/ۛۡۡ;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
