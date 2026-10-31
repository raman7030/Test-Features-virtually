.class public abstract Ll/ۢ᩷᩷;
.super Ll/ܽۢ᩷;
.source "37NY"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;


# instance fields
.field public ۖ:Ljava/lang/Integer;

.field public ۜ:Landroid/graphics/Rect;

.field public ۡ:Z

.field public final ۢ:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

.field public ۧ:Ljava/lang/Float;

.field public ܳ:Ljava/lang/String;

.field public ܺ:Ljava/lang/Object;

.field public ܽ:Landroid/graphics/drawable/Drawable;

.field public ܿ:Ljava/lang/Boolean;

.field public ᩳ:Lbin/mt/plugin/api/ui/PluginView$OnClickListener;

.field public ᩷:Landroid/widget/LinearLayout$LayoutParams;

.field public ᩻:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v1, -0x2

    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    iput-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    .line 30
    new-instance v0, Landroid/graphics/Rect;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    .line 40
    iput-object p1, p0, Ll/ۢ᩷᩷;->ۢ:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 41
    invoke-virtual {p0, p1}, Ll/ܽۢ᩷;->֫(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    return-void
.end method


# virtual methods
.method public alpha(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 331
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩷᩷;->ۧ:Ljava/lang/Float;

    return-object p0
.end method

.method public background(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 293
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public backgroundColor(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 2

    .line 299
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Landroid/graphics/drawable/ColorDrawable;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/drawable/ColorDrawable;

    .line 300
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/ColorDrawable;->setColor(I)V

    return-object p0

    .line 302
    :cond_0
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    iput-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public build()Lbin/mt/plugin/api/ui/PluginView;
    .locals 1

    .line 399
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۢ:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;->build()Lbin/mt/plugin/api/ui/PluginView;

    move-result-object v0

    return-object v0
.end method

.method public enable(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 325
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/ۢ᩷᩷;->ܿ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܳ:Ljava/lang/String;

    return-object v0
.end method

.method public getTag()Ljava/lang/Object;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    return-object v0
.end method

.method public gone()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/16 v0, 0x8

    .line 355
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ᩷᩷;->ۖ:Ljava/lang/Integer;

    return-object p0
.end method

.method public height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    return-object p0
.end method

.method public final heightDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 43
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final heightMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x1

    .line 28
    invoke-interface {p0, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final heightWrapContent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x2

    .line 23
    invoke-interface {p0, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    return-object v0
.end method

.method public id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 3

    if-eqz p1, :cond_6

    .line 133
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_5

    .line 136
    invoke-virtual {p0}, Ll/ܽۢ᩷;->getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;

    move-result-object v0

    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginUI;->isStrictIdModeEnabled()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 137
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܳ:Ljava/lang/String;

    .line 382
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 385
    :cond_0
    invoke-virtual {p0}, Ll/ۢ᩷᩷;->֫()Ll/᩺᩷᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺᩷᩷;->֫()Ljava/util/HashSet;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz v0, :cond_2

    .line 390
    invoke-interface {v1, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 392
    :cond_2
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_0

    .line 393
    :cond_3
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "The id \""

    const-string v2, " has been used, please use another id or call PluginUI.disableStrictIdMode()"

    .line 0
    invoke-static {v1, p1, v2}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 393
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_4
    :goto_0
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܳ:Ljava/lang/String;

    return-object p0

    .line 134
    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "The id cannot be empty"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 131
    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "The id cannot be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public invisible()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, 0x4

    .line 349
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ᩷᩷;->ۖ:Ljava/lang/Integer;

    return-object p0
.end method

.method public layoutGravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    return-object p0
.end method

.method public layoutWeight(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 175
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->weight:F

    return-object p0
.end method

.method public margin(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 246
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 247
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 248
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 249
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object p0
.end method

.method public margin(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 237
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 238
    iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 239
    iput p3, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 240
    iput p4, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object p0
.end method

.method public marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 273
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object p0
.end method

.method public final marginBottomDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 113
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final marginDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 93
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->margin(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginDp(FFFF)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 88
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    invoke-static {p3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p3

    invoke-static {p4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p4

    invoke-interface {p0, p1, p2, p3, p4}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->margin(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public marginHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 279
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 280
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    return-object p0
.end method

.method public final marginHorizontalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 118
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 255
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    return-object p0
.end method

.method public final marginLeftDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 98
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 267
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    return-object p0
.end method

.method public final marginRightDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 108
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 261
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    return-object p0
.end method

.method public final marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 103
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public marginVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 286
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 287
    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    return-object p0
.end method

.method public final marginVerticalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 123
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->marginVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 313
    iput-object p1, p0, Ll/ۢ᩷᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginView$OnClickListener;

    return-object p0
.end method

.method public onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 319
    iput-object p1, p0, Ll/ۢ᩷᩷;->᩻:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;

    return-object p0
.end method

.method public padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p1, p1, p1}, Landroid/graphics/Rect;->set(IIII)V

    return-object p0
.end method

.method public padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    return-object p0
.end method

.method public paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    return-object p0
.end method

.method public final paddingBottomDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 73
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final paddingDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 53
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final paddingDp(FFFF)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 48
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    invoke-static {p3}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p3

    invoke-static {p4}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p4

    invoke-interface {p0, p1, p2, p3, p4}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->left:I

    .line 224
    iput p1, v0, Landroid/graphics/Rect;->right:I

    return-object p0
.end method

.method public final paddingHorizontalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 78
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 199
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->left:I

    return-object p0
.end method

.method public final paddingLeftDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 58
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->right:I

    return-object p0
.end method

.method public final paddingRightDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 68
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->top:I

    return-object p0
.end method

.method public final paddingTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 63
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public paddingVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 230
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iput p1, v0, Landroid/graphics/Rect;->top:I

    .line 231
    iput p1, v0, Landroid/graphics/Rect;->bottom:I

    return-object p0
.end method

.method public final paddingVerticalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 83
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public requestFocus()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 337
    iput-boolean v0, p0, Ll/ۢ᩷᩷;->ۡ:Z

    return-object p0
.end method

.method public requireId()Ljava/lang/String;
    .locals 2

    .line 120
    invoke-virtual {p0}, Ll/ۢ᩷᩷;->getId()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 121
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    return-object v0

    .line 122
    :cond_0
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Please set the id first"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public size(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 156
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 157
    iput p2, v0, Landroid/widget/LinearLayout$LayoutParams;->height:I

    return-object p0
.end method

.method public final sizeDp(FF)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 33
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    invoke-interface {p0, p1, p2}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->size(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public tag(Ljava/lang/Object;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 145
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    return-object p0
.end method

.method public varargs unifyWidth([Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 3

    .line 361
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۢ:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    instance-of v1, v0, Ll/ۡ᩷᩷;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۡ᩷᩷;

    .line 328
    iget-object v1, v0, Ll/ۡ᩷᩷;->ܽ:Ljava/util/ArrayList;

    if-nez v1, :cond_0

    .line 329
    new-instance v1, Ljava/util/ArrayList;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, v0, Ll/ۡ᩷᩷;->ܽ:Ljava/util/ArrayList;

    .line 331
    :cond_0
    iget-object v0, v0, Ll/ۡ᩷᩷;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0

    .line 363
    :cond_1
    instance-of v1, v0, Ll/᩺᩷᩷;

    if-eqz v1, :cond_2

    check-cast v0, Ll/᩺᩷᩷;

    .line 364
    invoke-virtual {v0, p1}, Ll/᩺᩷᩷;->unifyWidth([Ljava/lang/String;)V

    return-object p0

    .line 366
    :cond_2
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public visible()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 343
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ᩷᩷;->ۖ:Ljava/lang/Integer;

    return-object p0
.end method

.method public width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    iput p1, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    return-object p0
.end method

.method public final widthDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 38
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-interface {p0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object p1

    return-object p1
.end method

.method public final widthMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x1

    .line 18
    invoke-interface {p0, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    return-object v0
.end method

.method public final widthWrapContent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x2

    .line 13
    invoke-interface {p0, v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    move-result-object v0

    return-object v0
.end method

.method public abstract ֫(Landroid/content/Context;)Landroid/view/View;
.end method

.method public final ֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 4

    .line 108
    invoke-virtual {p0}, Ll/ܽۢ᩷;->getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;

    move-result-object v0

    .line 160
    instance-of v1, p1, Ljava/lang/String;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x3

    if-lt v2, v3, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x7b

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    .line 0
    invoke-static {v2, v1}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v2

    const/16 v3, 0x7d

    if-ne v2, v3, :cond_0

    .line 161
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/PluginUI;->getContext()Lbin/mt/plugin/api/PluginContext;

    move-result-object v0

    invoke-interface {v0, v1}, Lbin/mt/plugin/api/PluginContext;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    return-object p1
.end method

.method public abstract ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
.end method

.method public ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/۟ۜ᩷;
    .locals 0

    .line 45
    invoke-virtual {p0, p1, p2}, Ll/ۢ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;

    move-result-object p1

    .line 46
    invoke-virtual {p0, p3}, Ll/ۢ᩷᩷;->֫(Landroid/content/Context;)Landroid/view/View;

    move-result-object p2

    .line 47
    invoke-virtual {p1, p2}, Ll/۟ۜ᩷;->֫(Landroid/view/View;)V

    .line 48
    iget-object p3, p0, Ll/ۢ᩷᩷;->᩷:Landroid/widget/LinearLayout$LayoutParams;

    invoke-virtual {p2, p3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    invoke-virtual {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    return-object p1
.end method

.method public final ֫()Ll/᩺᩷᩷;
    .locals 2

    .line 372
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۢ:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    instance-of v1, v0, Ll/ۡ᩷᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/ۡ᩷᩷;

    .line 336
    iget-object v0, v0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->֫()Ll/᩺᩷᩷;

    move-result-object v0

    return-object v0

    .line 374
    :cond_0
    instance-of v1, v0, Ll/᩺᩷᩷;

    if-eqz v1, :cond_1

    check-cast v0, Ll/᩺᩷᩷;

    return-object v0

    .line 377
    :cond_1
    check-cast v0, Ll/ۢ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->֫()Ll/᩺᩷᩷;

    move-result-object v0

    return-object v0
.end method

.method public ֫(Ll/۟ۜ᩷;)V
    .locals 5

    .line 58
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܳ:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->ۧ(Ljava/lang/String;)V

    .line 61
    :cond_0
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܺ:Ljava/lang/Object;

    if-eqz v0, :cond_1

    .line 62
    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setTag(Ljava/lang/Object;)V

    .line 65
    :cond_1
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_2

    .line 66
    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 68
    :cond_2
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۜ:Landroid/graphics/Rect;

    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 69
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 70
    iget v3, v0, Landroid/graphics/Rect;->right:I

    .line 71
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    const/4 v4, -0x1

    if-ne v1, v4, :cond_3

    if-ne v2, v4, :cond_3

    if-ne v3, v4, :cond_3

    if-eq v0, v4, :cond_8

    :cond_3
    if-ne v1, v4, :cond_4

    .line 74
    invoke-virtual {p1}, Ll/۟ۜ᩷;->getPaddingLeft()I

    move-result v1

    :cond_4
    if-ne v2, v4, :cond_5

    .line 77
    invoke-virtual {p1}, Ll/۟ۜ᩷;->getPaddingTop()I

    move-result v2

    :cond_5
    if-ne v3, v4, :cond_6

    .line 80
    invoke-virtual {p1}, Ll/۟ۜ᩷;->getPaddingRight()I

    move-result v3

    :cond_6
    if-ne v0, v4, :cond_7

    .line 83
    invoke-virtual {p1}, Ll/۟ۜ᩷;->getPaddingBottom()I

    move-result v0

    .line 85
    :cond_7
    invoke-virtual {p1, v1, v2, v3, v0}, Ll/۟ۜ᩷;->setPadding(IIII)V

    .line 87
    :cond_8
    iget-object v0, p0, Ll/ۢ᩷᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginView$OnClickListener;

    if-eqz v0, :cond_9

    .line 88
    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setOnClickListener(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)V

    .line 90
    :cond_9
    iget-object v0, p0, Ll/ۢ᩷᩷;->᩻:Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;

    if-eqz v0, :cond_a

    .line 91
    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setOnLongClickListener(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V

    .line 93
    :cond_a
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܿ:Ljava/lang/Boolean;

    if-eqz v0, :cond_b

    .line 94
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setEnabled(Z)V

    .line 96
    :cond_b
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۧ:Ljava/lang/Float;

    if-eqz v0, :cond_c

    .line 97
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setAlpha(F)V

    .line 99
    :cond_c
    iget-boolean v0, p0, Ll/ۢ᩷᩷;->ۡ:Z

    if-eqz v0, :cond_d

    .line 100
    invoke-virtual {p1}, Ll/۟ۜ᩷;->requestFocus()Z

    .line 102
    :cond_d
    iget-object v0, p0, Ll/ۢ᩷᩷;->ۖ:Ljava/lang/Integer;

    if-eqz v0, :cond_e

    .line 103
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/۟ۜ᩷;->setVisibility(I)V

    :cond_e
    return-void
.end method
