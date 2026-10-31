.class public abstract Ll/᩻᩷᩷;
.super Ll/ܳ᩷᩷;
.source "07NZ"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginBaseCompoundButtonBuilder;


# instance fields
.field public ۗ:Ljava/lang/Boolean;

.field public ۬:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;


# virtual methods
.method public final check()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 64
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/᩻᩷᩷;->ۗ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final checked(Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 49
    invoke-virtual {p0, p1, v0}, Ll/᩻᩷᩷;->checked(Lbin/mt/json/JSONObject;Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final checked(Lbin/mt/json/JSONObject;Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    if-nez p1, :cond_0

    .line 55
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩷᩷;->ۗ:Ljava/lang/Boolean;

    return-object p0

    .line 57
    :cond_0
    invoke-virtual {p0}, Ll/ۢ᩷᩷;->requireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->getBoolean(Ljava/lang/String;Z)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩷᩷;->ۗ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final checked(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 43
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩻᩷᩷;->ۗ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final onCheckedChange(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 37
    iput-object p1, p0, Ll/᩻᩷᩷;->۬:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    return-object p0
.end method

.method public final uncheck()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 70
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/᩻᩷᩷;->ۗ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public ֫(Ll/ۜۜ᩷;)V
    .locals 1

    .line 26
    invoke-super {p0, p1}, Ll/᩷᩷᩷;->֫(Ll/ۤۜ᩷;)V

    .line 27
    iget-object v0, p0, Ll/᩻᩷᩷;->۬:Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;

    if-eqz v0, :cond_0

    .line 28
    invoke-virtual {p1, v0}, Ll/ۜۜ᩷;->setOnCheckedChangeListener(Lbin/mt/plugin/api/ui/PluginCompoundButton$OnCheckedChangeListener;)V

    .line 30
    :cond_0
    iget-object v0, p0, Ll/᩻᩷᩷;->ۗ:Ljava/lang/Boolean;

    if-eqz v0, :cond_1

    .line 31
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۜۜ᩷;->setChecked(Z)V

    :cond_1
    return-void
.end method

.method public bridge synthetic ֫(Ll/۟ۜ᩷;)V
    .locals 0

    .line 16
    check-cast p1, Ll/ۜۜ᩷;

    invoke-virtual {p0, p1}, Ll/᩻᩷᩷;->֫(Ll/ۜۜ᩷;)V

    return-void
.end method

.method public bridge synthetic ֫(Ll/ۤۜ᩷;)V
    .locals 0

    .line 16
    check-cast p1, Ll/ۜۜ᩷;

    invoke-virtual {p0, p1}, Ll/᩻᩷᩷;->֫(Ll/ۜۜ᩷;)V

    return-void
.end method
