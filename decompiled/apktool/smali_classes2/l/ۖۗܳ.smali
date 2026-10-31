.class public final synthetic Ll/ۖۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖۗܳ;->᩸:Ll/ۗܺ᩷;

    iput-object p2, p0, Ll/ۖۗܳ;->᩹:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 7

    .line 441
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v0, "show_auto_settings_tip"

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 442
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 443
    invoke-static {}, Ll/᩸ۚۢ;->ܽ()V

    :cond_0
    const p1, 0x7f0d007e

    .line 445
    iget-object v0, p0, Ll/ۖۗܳ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v0, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v2, 0x7f0a0631

    .line 446
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f120102

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(I)V

    .line 447
    iget-object v2, p0, Ll/ۖۗܳ;->᩹:Ljava/lang/String;

    invoke-static {v0, p1, v2}, Ll/ۡۨܽ;->֫(Ll/ۗܺ᩷;Landroid/view/View;Ljava/lang/String;)Ll/ۜۨܽ;

    move-result-object v2

    .line 448
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    .line 449
    invoke-virtual {v3, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v4, 0x7f12070a

    const/4 v5, 0x0

    .line 450
    invoke-virtual {v3, v4, v5}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f12015e

    const v6, 0x7f120634

    .line 0
    invoke-static {v3, v4, v5, v6, v5}, Ll/ۛۙܽ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v3

    .line 454
    invoke-virtual {v3}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v4

    new-instance v5, Ll/ۘۗܳ;

    const/4 v6, 0x0

    invoke-direct {v5, v6, v2, v3}, Ll/ۘۗܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v4, 0x7f0a0524

    .line 461
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 462
    new-instance v4, Ll/ᩴۗܳ;

    invoke-direct {v4, p1, v2, v3}, Ll/ᩴۗܳ;-><init>(Landroid/widget/TextView;Ll/ۜۨܽ;Ll/֡ۚۢ;)V

    invoke-interface {v2, v4}, Ll/᩻ۨܽ;->֫(Ljava/lang/Runnable;)V

    .line 466
    invoke-virtual {v3}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v2, Ll/᩵ۗܳ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ll/᩵ۗܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return v1
.end method
