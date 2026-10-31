.class public final Ll/ۜۢ᩷;
.super Ljava/lang/Object;
.source "K7J0"

# interfaces
.implements Lbin/mt/plugin/api/ui/menu/PluginMenuItem;


# instance fields
.field public final ֫:Lbin/mt/plugin/api/PluginContext;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ll/ۡۢ᩷;

.field public final ᩳ:Ll/ܰ۬;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;Ljava/lang/String;Ljava/lang/String;Ll/ܰ۬;Ll/ۡۢ᩷;)V
    .locals 0

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Ll/ۜۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    .line 23
    iput-object p2, p0, Ll/ۜۢ᩷;->ܽ:Ljava/lang/String;

    .line 24
    iput-object p3, p0, Ll/ۜۢ᩷;->ۧ:Ljava/lang/String;

    .line 25
    iput-object p4, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    .line 26
    iput-object p5, p0, Ll/ۜۢ᩷;->ܿ:Ll/ۡۢ᩷;

    return-void
.end method


# virtual methods
.method public final getGroupId()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۜۢ᩷;->ۧ:Ljava/lang/String;

    return-object v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 66
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final getIconTintList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 79
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Ll/ܰ۬;->getIconTintList()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId()Ljava/lang/String;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/ۜۢ᩷;->ܽ:Ljava/lang/String;

    return-object v0
.end method

.method public final getSubMenu()Lbin/mt/plugin/api/ui/menu/PluginSubMenu;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۜۢ᩷;->ܿ:Ll/ۡۢ᩷;

    return-object v0
.end method

.method public final getSubMenu()Ll/ۡۢ᩷;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ۜۢ᩷;->ܿ:Ll/ۡۢ᩷;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/CharSequence;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, ""

    :cond_0
    return-object v0
.end method

.method public final hasSubMenu()Z
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۜۢ᩷;->ܿ:Ll/ۡۢ᩷;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isCheckable()Z
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Landroid/view/MenuItem;->isCheckable()Z

    move-result v0

    return v0
.end method

.method public final isChecked()Z
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Landroid/view/MenuItem;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final isEnabled()Z
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Landroid/view/MenuItem;->isEnabled()Z

    move-result v0

    return v0
.end method

.method public final isVisible()Z
    .locals 1

    .line 115
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    move-result v0

    return v0
.end method

.method public final setCheckable(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 85
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setChecked(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setEnabled(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 59
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setIconTintList(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 72
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Ll/ܰ۬;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 3

    .line 171
    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x3

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x7b

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    .line 0
    invoke-static {v1, v0}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v1

    const/16 v2, 0x7d

    if-ne v1, v2, :cond_0

    .line 172
    iget-object v1, p0, Ll/ۜۢ᩷;->֫:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v1, v0}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    move-object p1, v0

    .line 45
    :cond_0
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    return-object p0
.end method

.method public final setVisible(Z)Lbin/mt/plugin/api/ui/menu/PluginMenuItem;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/ۜۢ᩷;->ᩳ:Ll/ܰ۬;

    invoke-interface {v0, p1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    return-object p0
.end method
