.class public Ll/᩷᩷;
.super Ll/ܺۜ;
.source "S5UF"

# interfaces
.implements Landroid/view/Menu;


# instance fields
.field public final ᩳ:Ll/᩺۬;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll/᩺۬;)V
    .locals 0

    .line 40
    invoke-direct {p0, p1}, Ll/ܺۜ;-><init>(Landroid/content/Context;)V

    if-eqz p2, :cond_0

    .line 44
    iput-object p2, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    return-void

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Wrapped Object can not be null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final add(I)Landroid/view/MenuItem;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final add(IIII)Landroid/view/MenuItem;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
    .locals 12

    move-object v0, p0

    move-object/from16 v1, p8

    if-eqz v1, :cond_0

    .line 93
    array-length v2, v1

    new-array v2, v2, [Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 96
    :goto_0
    iget-object v3, v0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    move v4, p1

    move v5, p2

    move v6, p3

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    move/from16 v10, p7

    move-object v11, v2

    .line 97
    invoke-interface/range {v3 .. v11}, Landroid/view/Menu;->addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I

    move-result v3

    if-eqz v2, :cond_1

    .line 100
    array-length v4, v2

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_1

    .line 101
    aget-object v6, v2, v5

    invoke-virtual {p0, v6}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object v6

    aput-object v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    return v3
.end method

.method public final addSubMenu(I)Landroid/view/SubMenu;
    .locals 1

    .line 74
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(I)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public final addSubMenu(IIII)Landroid/view/SubMenu;
    .locals 1

    .line 84
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    .line 85
    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIII)Landroid/view/SubMenu;

    move-result-object p1

    .line 84
    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public final addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2, p3, p4}, Landroid/view/Menu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public final addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1

    .line 69
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object p1

    return-object p1
.end method

.method public final clear()V
    .locals 1

    .line 122
    invoke-virtual {p0}, Ll/ܺۜ;->ᩳ()V

    .line 123
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    return-void
.end method

.method public final close()V
    .locals 1

    .line 163
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0}, Landroid/view/Menu;->close()V

    return-void
.end method

.method public final findItem(I)Landroid/view/MenuItem;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final getItem(I)Landroid/view/MenuItem;
    .locals 1

    .line 158
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    return-object p1
.end method

.method public final hasVisibleItems()Z
    .locals 1

    .line 143
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0}, Landroid/view/Menu;->hasVisibleItems()Z

    move-result v0

    return v0
.end method

.method public final isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 173
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->isShortcutKey(ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method

.method public final performIdentifierAction(II)Z
    .locals 1

    .line 178
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->performIdentifierAction(II)Z

    move-result p1

    return p1
.end method

.method public final performShortcut(ILandroid/view/KeyEvent;I)Z
    .locals 1

    .line 168
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result p1

    return p1
.end method

.method public final removeGroup(I)V
    .locals 1

    .line 116
    invoke-virtual {p0, p1}, Ll/ܺۜ;->֫(I)V

    .line 117
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeGroup(I)V

    return-void
.end method

.method public final removeItem(I)V
    .locals 1

    .line 110
    invoke-virtual {p0, p1}, Ll/ܺۜ;->ۧ(I)V

    .line 111
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->removeItem(I)V

    return-void
.end method

.method public final setGroupCheckable(IZZ)V
    .locals 1

    .line 128
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2, p3}, Landroid/view/Menu;->setGroupCheckable(IZZ)V

    return-void
.end method

.method public final setGroupEnabled(IZ)V
    .locals 1

    .line 138
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupEnabled(IZ)V

    return-void
.end method

.method public final setGroupVisible(IZ)V
    .locals 1

    .line 133
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1, p2}, Landroid/view/Menu;->setGroupVisible(IZ)V

    return-void
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    .line 183
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0, p1}, Landroid/view/Menu;->setQwertyMode(Z)V

    return-void
.end method

.method public final size()I
    .locals 1

    .line 153
    iget-object v0, p0, Ll/᩷᩷;->ᩳ:Ll/᩺۬;

    invoke-interface {v0}, Landroid/view/Menu;->size()I

    move-result v0

    return v0
.end method
