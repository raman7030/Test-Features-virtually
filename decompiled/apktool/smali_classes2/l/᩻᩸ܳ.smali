.class public final Ll/᩻᩸ܳ;
.super Ll/ܿܶܳ;
.source "BAG5"


# direct methods
.method public static ֫(Landroid/view/SubMenu;)V
    .locals 8

    const v0, 0x7f0a0059

    const-string v1, "FTP"

    const/4 v2, 0x0

    .line 58
    invoke-interface {p0, v2, v0, v2, v1}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 59
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v0

    const v1, 0x7f120702

    const v3, 0x7f0a005b

    const v4, 0x7f0a005e

    const v5, 0x7f0a005d

    const v6, 0x7f0a005c

    const v7, 0x7f0a005a

    if-eqz v0, :cond_0

    const-string v0, "FTPS"

    .line 60
    invoke-interface {p0, v2, v7, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const-string v0, "SFTP"

    .line 61
    invoke-interface {p0, v2, v6, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const-string v0, "SMB"

    .line 62
    invoke-interface {p0, v2, v5, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    const-string v0, "WebDav"

    .line 63
    invoke-interface {p0, v2, v4, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 64
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v2, v3, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    return-void

    :cond_0
    const-string v0, "FTPS (VIP)"

    .line 66
    invoke-interface {p0, v2, v7, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const-string v0, "SFTP (VIP)"

    .line 67
    invoke-interface {p0, v2, v6, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const-string v0, "SMB (VIP)"

    .line 68
    invoke-interface {p0, v2, v5, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    const-string v0, "WebDav (VIP)"

    .line 69
    invoke-interface {p0, v2, v4, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    invoke-interface {v0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    .line 70
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " (VIP)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v2, v3, v2, v0}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p0

    invoke-interface {p0, v2}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;I)Z
    .locals 1

    const v0, 0x7f0a0059

    if-ne p1, v0, :cond_0

    .line 76
    invoke-static {p0}, Ll/֫ܺ᩻;->ۧ(Ll/ۗܺ᩷;)V

    goto :goto_0

    :cond_0
    const v0, 0x7f0a005a

    if-ne p1, v0, :cond_1

    .line 78
    invoke-static {p0}, Ll/ۜܺ᩻;->ۧ(Ll/ۗܺ᩷;)V

    goto :goto_0

    :cond_1
    const v0, 0x7f0a005c

    if-ne p1, v0, :cond_2

    .line 80
    invoke-static {p0}, Ll/ܳᩴ᩻;->ۧ(Ll/ۗܺ᩷;)V

    goto :goto_0

    :cond_2
    const v0, 0x7f0a005e

    if-ne p1, v0, :cond_3

    .line 82
    invoke-static {p0}, Ll/ۚۚ᩻;->ۧ(Ll/ۗܺ᩷;)V

    goto :goto_0

    :cond_3
    const v0, 0x7f0a005d

    if-ne p1, v0, :cond_4

    .line 84
    invoke-static {p0}, Ll/᩻֡᩻;->ۧ(Ll/ۗܺ᩷;)V

    goto :goto_0

    :cond_4
    const v0, 0x7f0a005b

    if-ne p1, v0, :cond_5

    .line 86
    invoke-static {p0}, Ll/۬ۖ᩻;->ۧ(Ll/ۗܺ᩷;)V

    :goto_0
    const/4 p0, 0x1

    return p0

    :cond_5
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 35
    iget-object v0, p0, Ll/۫ܶܳ;->᩹:Ll/ۗܶܳ;

    invoke-virtual {v0}, Ll/ۗܶܳ;->ܽ()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 38
    :cond_0
    new-instance v0, Ll/᩸ۖ;

    iget-object v2, p0, Ll/ۨ۠ܳ;->᩸:Lbin/mt/plus/Main;

    const v3, 0x800055

    invoke-direct {v0, v2, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 39
    invoke-static {p1}, Ll/۟᩷ۡ;->᩷(Landroid/view/View;)V

    .line 40
    invoke-virtual {v0}, Ll/᩸ۖ;->ᩳ()V

    .line 41
    invoke-virtual {v0}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object p1

    const v2, 0x7f1202d3

    .line 42
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object v2

    .line 43
    invoke-interface {v2}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;

    move-result-object v3

    const v4, 0x7f0801ce

    invoke-interface {v3, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 44
    invoke-static {v2}, Ll/᩻᩸ܳ;->֫(Landroid/view/SubMenu;)V

    const v2, 0x7f1202d2

    .line 45
    invoke-interface {p1, v1, v2, v1, v2}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    const v1, 0x7f0801fb

    invoke-interface {p1, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 46
    new-instance p1, Ll/ܳ᩸ܳ;

    invoke-direct {p1, p0}, Ll/ܳ᩸ܳ;-><init>(Ll/᩻᩸ܳ;)V

    invoke-virtual {v0, p1}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 53
    invoke-virtual {v0}, Ll/᩸ۖ;->ܿ()V

    const/4 p1, 0x1

    return p1
.end method
