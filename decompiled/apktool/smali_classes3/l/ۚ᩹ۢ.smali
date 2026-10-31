.class public final synthetic Ll/ۚ᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ll/ܶۖ;


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ll/֡ۚۢ;

.field public final synthetic ᩹:Landroid/text/SpannableString;


# direct methods
.method public synthetic constructor <init>(Ll/֡ۚۢ;Landroid/text/SpannableString;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚ᩹ۢ;->᩸:Ll/֡ۚۢ;

    iput-object p2, p0, Ll/ۚ᩹ۢ;->᩹:Landroid/text/SpannableString;

    iput-object p3, p0, Ll/ۚ᩹ۢ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 4

    .line 2
    sget v0, Ll/ۤ᩹ۢ;->ۢۧ:I

    .line 458
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v0

    const v1, 0x7f120313

    const-string v2, "ewse"

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    .line 460
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 461
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    .line 0
    invoke-static {p1, v2, v3}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return v3

    :cond_0
    const v1, 0x7f120312

    if-ne v0, v1, :cond_1

    .line 463
    invoke-interface {p1, v3}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 464
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const/4 v0, 0x0

    .line 0
    invoke-static {p1, v2, v0}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return v3

    .line 466
    :cond_1
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    xor-int/2addr v0, v3

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 467
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "ewrp"

    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    .line 468
    invoke-interface {p1}, Landroid/view/MenuItem;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ll/ۚ᩹ۢ;->᩹:Landroid/text/SpannableString;

    goto :goto_0

    :cond_2
    iget-object p1, p0, Ll/ۚ᩹ۢ;->᩶:Ljava/lang/String;

    :goto_0
    iget-object v0, p0, Ll/ۚ᩹ۢ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0, p1}, Ll/֡ۚۢ;->֫(Ljava/lang/CharSequence;)V

    return v3
.end method
