.class public final Ll/ۙ᩷᩷;
.super Ll/ܺ᩷᩷;
.source "V7NH"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginFrameLayoutBuilder;


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

    .line 25
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 1

    .line 20
    new-instance v0, Ll/ۚۜ᩷;

    .line 14
    invoke-direct {v0, p1, p2}, Ll/ۨۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    return-object v0
.end method
