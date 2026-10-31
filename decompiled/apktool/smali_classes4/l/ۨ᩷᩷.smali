.class public final Ll/ۨ᩷᩷;
.super Ll/ۜ᩷᩷;
.source "37MY"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;


# instance fields
.field public ֨:Z

.field public ۚ:Z

.field public ۠:Ljava/lang/String;

.field public ܶ:I

.field public ᩸:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;


# virtual methods
.method public final alpha(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 331
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩷᩷;->ۧ:Ljava/lang/Float;

    return-object p0
.end method

.method public final background(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 293
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final check(I)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 53
    iput-boolean v0, p0, Ll/ۨ᩷᩷;->֨:Z

    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, Ll/ۨ᩷᩷;->۠:Ljava/lang/String;

    .line 55
    iput p1, p0, Ll/ۨ᩷᩷;->ܶ:I

    return-object p0
.end method

.method public final check(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 30
    iput-boolean v0, p0, Ll/ۨ᩷᩷;->֨:Z

    if-nez p1, :cond_0

    const-string p1, ""

    .line 31
    :cond_0
    iput-object p1, p0, Ll/ۨ᩷᩷;->۠:Ljava/lang/String;

    return-object p0
.end method

.method public final checkedId(Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, p1, v0}, Ll/ۨ᩷᩷;->checkedId(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;

    return-object p0
.end method

.method public final checkedId(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    invoke-super {p0}, Ll/ۢ᩷᩷;->requireId()Ljava/lang/String;

    move-result-object v0

    .line 46
    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 48
    :goto_0
    invoke-virtual {p0, p2}, Ll/ۨ᩷᩷;->check(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;

    return-object p0
.end method

.method public final checkedPosition(Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    const/4 v0, -0x1

    .line 61
    invoke-virtual {p0, p1, v0}, Ll/ۨ᩷᩷;->checkedPosition(Lbin/mt/json/JSONObject;I)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;

    return-object p0
.end method

.method public final checkedPosition(Lbin/mt/json/JSONObject;I)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 17
    :cond_0
    invoke-super {p0}, Ll/ۢ᩷᩷;->requireId()Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->getInt(Ljava/lang/String;I)I

    move-result p2

    .line 72
    :goto_0
    invoke-virtual {p0, p2}, Ll/ۨ᩷᩷;->check(I)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;

    return-object p0
.end method

.method public final children(Lbin/mt/plugin/api/util/Consumer;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 63
    iget-object v0, p0, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

    invoke-interface {p1, v0}, Lbin/mt/plugin/api/util/Consumer;->accept(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final enable(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 325
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩷᩷;->ܿ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final getChildrenStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;
    .locals 1

    .line 49
    iget-object v0, p0, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    return-object v0
.end method

.method public final gravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 24
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/ۜ᩷᩷;->᩵:Ljava/lang/Integer;

    return-object p0
.end method

.method public final height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    return-object p0
.end method

.method public final layoutGravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-object p0
.end method

.method public final layoutWeight(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    return-object p0
.end method

.method public final marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 273
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object p0
.end method

.method public final marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    return-object p0
.end method

.method public final marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    return-object p0
.end method

.method public final marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 261
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    return-object p0
.end method

.method public final onCheckedChanged(Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 84
    iput-boolean v0, p0, Ll/ۨ᩷᩷;->ۚ:Z

    .line 85
    iput-object p1, p0, Ll/ۨ᩷᩷;->᩸:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

    return-object p0
.end method

.method public final onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 313
    iput-object p1, p0, Ll/ۢ᩷᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginView$OnClickListener;

    return-object p0
.end method

.method public final onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 319
    iput-object p1, p0, Ll/ۢ᩷᩷;->᩻:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;

    return-object p0
.end method

.method public final padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-object p0
.end method

.method public final padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-object p0
.end method

.method public final paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    return-object p0
.end method

.method public final paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->left:I

    return-object p0
.end method

.method public final paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->right:I

    return-object p0
.end method

.method public final paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->top:I

    return-object p0
.end method

.method public final postOnCheckedChanged(Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 77
    iput-boolean v0, p0, Ll/ۨ᩷᩷;->ۚ:Z

    .line 78
    iput-object p1, p0, Ll/ۨ᩷᩷;->᩸:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

    return-object p0
.end method

.method public final requestFocus()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 337
    iput-boolean v0, p0, Ll/ۢ᩷᩷;->ۡ:Z

    return-object p0
.end method

.method public final tag(Ljava/lang/Object;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 145
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    return-object p0
.end method

.method public final width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    return-object p0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 126
    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۙۜ᩷;
    .locals 4

    .line 95
    iget-object v0, p0, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

    iget-object v0, v0, Ll/ۡ᩷᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۢ᩷᩷;

    .line 96
    instance-of v3, v2, Ll/ۛ᩷᩷;

    if-eqz v3, :cond_0

    check-cast v2, Ll/ۛ᩷᩷;

    add-int/lit8 v3, v1, 0x1

    .line 40
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iput-object v1, v2, Ll/ۛ᩷᩷;->۫:Ljava/lang/Integer;

    move v1, v3

    goto :goto_0

    .line 100
    :cond_1
    invoke-super {p0, p1, p2, p3}, Ll/ܺ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۨۜ᩷;

    move-result-object p1

    check-cast p1, Ll/ۙۜ᩷;

    .line 101
    iget-boolean p2, p0, Ll/ۨ᩷᩷;->֨:Z

    if-eqz p2, :cond_3

    .line 102
    iget-object p2, p0, Ll/ۨ᩷᩷;->۠:Ljava/lang/String;

    if-eqz p2, :cond_2

    .line 103
    invoke-virtual {p1, p2}, Ll/ۙۜ᩷;->check(Ljava/lang/String;)V

    goto :goto_1

    .line 105
    :cond_2
    iget p2, p0, Ll/ۨ᩷᩷;->ܶ:I

    invoke-virtual {p1, p2}, Ll/ۙۜ᩷;->check(I)V

    .line 108
    :cond_3
    :goto_1
    iget-object p2, p0, Ll/ۨ᩷᩷;->᩸:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

    if-eqz p2, :cond_5

    .line 109
    invoke-virtual {p1, p2}, Ll/ۙۜ᩷;->setOnCheckedChangeListener(Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;)V

    .line 110
    iget-boolean p2, p0, Ll/ۨ᩷᩷;->ۚ:Z

    if-eqz p2, :cond_5

    .line 111
    invoke-virtual {p1}, Ll/ۙۜ᩷;->getCheckedRadioButton()Lbin/mt/plugin/api/ui/PluginRadioButton;

    move-result-object p2

    .line 112
    iget-object p3, p0, Ll/ۨ᩷᩷;->᩸:Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;

    if-nez p2, :cond_4

    const/4 v0, -0x1

    goto :goto_2

    .line 113
    :cond_4
    move-object v0, p2

    check-cast v0, Ll/᩹ۜ᩷;

    invoke-virtual {v0}, Ll/᩹ۜ᩷;->getPositionInRadioGroup()I

    move-result v0

    .line 112
    :goto_2
    invoke-interface {p3, p1, p2, v0}, Lbin/mt/plugin/api/ui/PluginRadioGroup$OnCheckedChangeListener;->onCheckedChanged(Lbin/mt/plugin/api/ui/PluginRadioGroup;Lbin/mt/plugin/api/ui/PluginRadioButton;I)V

    :cond_5
    return-object p1
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 1

    .line 121
    new-instance v0, Ll/ۙۜ᩷;

    invoke-direct {v0, p1, p2}, Ll/ۙۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    return-object v0
.end method

.method public final bridge synthetic ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/۟ۜ᩷;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Ll/ۨ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۙۜ᩷;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۨۜ᩷;
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2, p3}, Ll/ۨ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۙۜ᩷;

    move-result-object p1

    return-object p1
.end method
