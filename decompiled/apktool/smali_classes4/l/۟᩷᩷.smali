.class public final Ll/۟᩷᩷;
.super Ll/ۢ᩷᩷;
.source "77QL"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;


# instance fields
.field public ֡:Ljava/lang/Integer;

.field public ۘ:Z

.field public ᩴ:Ljava/util/List;

.field public ᩵:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;


# virtual methods
.method public final items(Ljava/util/List;)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 0

    .line 31
    iput-object p1, p0, Ll/۟᩷᩷;->ᩴ:Ljava/util/List;

    return-object p0
.end method

.method public final onItemSelected(Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 44
    iput-boolean v0, p0, Ll/۟᩷᩷;->ۘ:Z

    .line 45
    iput-object p1, p0, Ll/۟᩷᩷;->᩵:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;

    return-object p0
.end method

.method public final postOnItemSelected(Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 37
    iput-boolean v0, p0, Ll/۟᩷᩷;->ۘ:Z

    .line 38
    iput-object p1, p0, Ll/۟᩷᩷;->᩵:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;

    return-object p0
.end method

.method public final selection(I)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 0

    .line 51
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0
.end method

.method public final selection(Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 57
    invoke-virtual {p0, p1, v0}, Ll/۟᩷᩷;->selection(Lbin/mt/json/JSONObject;I)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;

    return-object p0
.end method

.method public final selection(Lbin/mt/json/JSONObject;I)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 1

    if-nez p1, :cond_0

    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0

    .line 65
    :cond_0
    invoke-virtual {p0}, Ll/ۢ᩷᩷;->requireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/view/View;
    .locals 2

    .line 77
    new-instance v0, Ll/ۗۡ;

    const/4 v1, 0x0

    .line 123
    invoke-direct {v0, p1, v1}, Ll/ۗۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 1

    .line 72
    new-instance v0, Ll/۬ۜ᩷;

    .line 20
    invoke-direct {v0, p1, p2}, Ll/۟ۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    return-object v0
.end method

.method public final ֫(Ll/۟ۜ᩷;)V
    .locals 2

    .line 19
    check-cast p1, Ll/۬ۜ᩷;

    .line 82
    invoke-super {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    .line 83
    iget-object v0, p0, Ll/۟᩷᩷;->ᩴ:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 84
    invoke-virtual {p1, v0}, Ll/۬ۜ᩷;->setItems(Ljava/util/List;)V

    .line 86
    :cond_0
    iget-object v0, p0, Ll/۟᩷᩷;->᩵:Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;

    if-eqz v0, :cond_2

    .line 87
    iget-boolean v1, p0, Ll/۟᩷᩷;->ۘ:Z

    if-eqz v1, :cond_1

    .line 88
    invoke-virtual {p1, v0}, Ll/۬ۜ᩷;->setOnItemSelectedListener(Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)V

    goto :goto_0

    .line 90
    :cond_1
    invoke-virtual {p1}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    new-instance v1, Ll/ܰ᩷᩷;

    invoke-direct {v1, p0, p1}, Ll/ܰ᩷᩷;-><init>(Ll/۟᩷᩷;Ll/۬ۜ᩷;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 93
    :cond_2
    :goto_0
    iget-object v0, p0, Ll/۟᩷᩷;->֡:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 94
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/۬ۜ᩷;->setSelection(I)V

    :cond_3
    return-void
.end method
