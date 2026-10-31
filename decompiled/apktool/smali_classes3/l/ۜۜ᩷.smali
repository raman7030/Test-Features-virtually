.class public abstract Ll/ۜۜ᩷;
.super Ll/ܿۜ᩷;
.source "T7RP"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginCompoundButton;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V
    .locals 1

    .line 12
    sget-object v0, Lbin/mt/plugin/api/ui/PluginButton$Style;->DEFAULT:Lbin/mt/plugin/api/ui/PluginButton$Style;

    invoke-direct {p0, p1, p2, v0}, Ll/ܿۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Lbin/mt/plugin/api/ui/PluginButton$Style;)V

    return-void
.end method


# virtual methods
.method public final isChecked()Z
    .locals 1

    .line 33
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    return v0
.end method

.method public final setChecked(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 28
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/CompoundButton;

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setOnCheckedChangeListener(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V
    .locals 2

    if-nez p1, :cond_0

    .line 18
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Landroid/widget/CompoundButton;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/CompoundButton;

    new-instance v1, Ll/᩻ۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/᩻ۜ᩷;-><init>(Ll/ۜۜ᩷;Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method
