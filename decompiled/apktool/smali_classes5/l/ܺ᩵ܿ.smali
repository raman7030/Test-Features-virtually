.class public final synthetic Ll/ܺ᩵ܿ;
.super Ljava/lang/Object;
.source "A186"

# interfaces
.implements Ll/ۖۛۡ;
.implements Ll/᩹ۖܽ;
.implements Ll/۬֡ܿ;
.implements Ll/ᩴܺܳ;
.implements Ll/ܶۖ;
.implements Ll/۠ۖ;
.implements Ll/ۘ۬᩷;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܺ᩵ܿ;->᩸:I

    iput-object p2, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 4

    .line 2
    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۗܺ᩷;

    .line 426
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    const v2, 0x7f12098a

    const/4 v3, 0x1

    if-ne v1, v2, :cond_0

    .line 427
    new-instance p1, Landroid/content/Intent;

    const-class v1, Ll/᩹ۙܽ;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "fromDialog"

    .line 428
    invoke-virtual {p1, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 429
    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return v3

    .line 431
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 432
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "kasb"

    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    invoke-interface {v0, v1, p1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    return v3
.end method

.method public ֫(I)V
    .locals 1

    .line 0
    iget v0, p0, Ll/ܺ᩵ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ۚܳ᩻;

    goto :goto_0

    :pswitch_0
    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/֫ۤܽ;

    :goto_0
    invoke-virtual {v0, p1}, Ll/ۘ۠ۢ;->ۢ(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public ֫(Ll/ܶ᩵ܿ;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ۤۜܽ;

    .line 975
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->֫(Ll/ۤۜܽ;)V

    return-void
.end method

.method public ֫(Ll/᩸ۖ;)V
    .locals 0

    .line 0
    iget-object p1, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۛ۟᩷;

    invoke-static {p1}, Ll/ۛ۟᩷;->֫(Ll/ۛ۟᩷;)V

    return-void
.end method

.method public ۧ()Ljava/lang/String;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܽۜۢ;

    invoke-static {v0}, Ll/ܽۜۢ;->ۧ(Ll/ܽۜۢ;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۧ(I)Ll/ۖۖܽ;
    .locals 1

    .line 2
    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/util/ArrayList;

    .line 249
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܶ᩵ܿ;

    const-string v0, "r"

    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->᩷(Ljava/lang/String;)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public ۧ(Ll/ܶ᩵ܿ;)V
    .locals 2

    .line 2
    iget-object v0, p0, Ll/ܺ᩵ܿ;->᩹:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/ܽۢܳ;

    .line 117
    new-instance v1, Ll/۟ᩳ᩷;

    invoke-direct {v1, v0}, Ll/۟ᩳ᩷;-><init>(Ll/ܽۢܳ;)V

    const/4 v0, 0x0

    invoke-virtual {v1, p1, v0}, Ll/۟ᩳ᩷;->֫(Ll/ܶ᩵ܿ;Z)V

    return-void
.end method
