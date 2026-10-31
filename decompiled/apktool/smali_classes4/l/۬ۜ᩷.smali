.class public final Ll/۬ۜ᩷;
.super Ll/۟ۜ᩷;
.source "X7NV"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginSpinner;


# virtual methods
.method public final getCount()I
    .locals 1

    .line 73
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    return v0
.end method

.method public final getItem(I)Ljava/lang/Object;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->getItemAtPosition(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getSelectedItem()Ljava/lang/Object;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getSelection()I
    .locals 1

    .line 58
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    return v0
.end method

.method public final setItems(Ljava/util/List;)V
    .locals 3

    .line 25
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    new-instance v1, Ll/᩶ۡۡ;

    iget-object v2, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v2, Landroid/widget/Spinner;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2, p1}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public final setOnItemSelectedListener(Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)V
    .locals 2

    if-nez p1, :cond_0

    .line 31
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Landroid/widget/Spinner;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void

    .line 33
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    new-instance v1, Ll/ۗۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/ۗۜ᩷;-><init>(Ll/۬ۜ᩷;Lbin/mt/plugin/api/ui/PluginSpinner$OnItemSelectedListener;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public final setSelection(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_2

    if-ltz p1, :cond_0

    .line 50
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getCount()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 p1, 0x0

    .line 53
    :cond_1
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void

    .line 649
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
