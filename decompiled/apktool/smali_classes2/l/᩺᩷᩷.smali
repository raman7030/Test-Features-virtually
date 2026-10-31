.class public final Ll/᩺᩷᩷;
.super Ll/ܽۢ᩷;
.source "U7PY"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;
.implements Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;


# instance fields
.field public final ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܳ:Ll/ᩳۢ᩷;

.field public final ܽ:Landroid/content/Context;

.field public final ܿ:Ll/ܺ᩷᩷;

.field public final ᩳ:Ljava/util/HashSet;


# direct methods
.method public constructor <init>(Ll/ᩳۢ᩷;Landroid/content/Context;ZI)V
    .locals 2

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/᩺᩷᩷;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 31
    iput-object p1, p0, Ll/᩺᩷᩷;->ܳ:Ll/ᩳۢ᩷;

    .line 32
    iput-object p2, p0, Ll/᩺᩷᩷;->ܽ:Landroid/content/Context;

    if-eqz p3, :cond_0

    .line 34
    new-instance p2, Ll/ۙ᩷᩷;

    invoke-virtual {p1}, Ll/ᩳۢ᩷;->getStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;

    move-result-object p3

    .line 15
    invoke-direct {p2, p0, p3}, Ll/ܺ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;)V

    .line 34
    iput-object p2, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    goto :goto_0

    .line 36
    :cond_0
    new-instance p2, Ll/۬᩷᩷;

    invoke-virtual {p1}, Ll/ᩳۢ᩷;->getStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;

    move-result-object p3

    .line 15
    invoke-direct {p2, p0, p3, p4}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 36
    iput-object p2, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    .line 38
    :goto_0
    iget-object p2, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    iget-object p2, p2, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

    .line 88
    iput-object p0, p2, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 39
    invoke-virtual {p0, p2}, Ll/ܽۢ᩷;->֫(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    const/4 p2, -0x2

    .line 97
    iget-object p3, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    const/4 p4, -0x1

    invoke-virtual {p3, p4, p2}, Ll/ۢ᩷᩷;->size(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 41
    invoke-virtual {p1}, Ll/ᩳۢ᩷;->getStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;

    move-result-object p2

    invoke-virtual {p2, p1, p0}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatch(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)V

    .line 42
    invoke-virtual {p1}, Ll/ᩳۢ᩷;->isStrictIdModeEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-object p1, p0, Ll/᩺᩷᩷;->ᩳ:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final alpha(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 253
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->alpha(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final background(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 223
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->background(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final backgroundColor(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 229
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->backgroundColor(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final build()Lbin/mt/plugin/api/ui/PluginView;
    .locals 4

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 58
    iget-object v2, p0, Ll/᩺᩷᩷;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    .line 61
    iget-object v1, p0, Ll/᩺᩷᩷;->ܽ:Landroid/content/Context;

    iget-object v2, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    iget-object v3, p0, Ll/᩺᩷᩷;->ܳ:Ll/ᩳۢ᩷;

    invoke-virtual {v2, v3, v0, v1}, Ll/ܺ᩷᩷;->֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;Landroid/content/Context;)Ll/ۨۜ᩷;

    move-result-object v0

    .line 62
    invoke-virtual {v0}, Ll/ۨۜ᩷;->ۧ()V

    return-object v0

    .line 59
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Method \'build()\' can only be called once"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final enable(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 247
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->enable(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;
    .locals 1

    .line 53
    iget-object v0, p0, Ll/᩺᩷᩷;->ܳ:Ll/ᩳۢ᩷;

    return-object v0
.end method

.method public final getTag()Ljava/lang/Object;
    .locals 1

    .line 92
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->getTag()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final gone()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 277
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->gone()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final gravity(I)Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
    .locals 2

    .line 322
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    instance-of v1, v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    if-eqz v1, :cond_0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    .line 323
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;->gravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0

    .line 324
    :cond_0
    instance-of p1, v0, Lbin/mt/plugin/api/ui/builder/PluginFrameLayoutBuilder;

    if-eqz p1, :cond_1

    .line 325
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "PluginRootLayoutBuilder using FrameLayout does not support gravity method"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 327
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
.end method

.method public final height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 109
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final heightDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 43
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final heightMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x1

    .line 28
    invoke-virtual {p0, v0}, Ll/᩺᩷᩷;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final heightWrapContent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x2

    .line 23
    invoke-virtual {p0, v0}, Ll/᩺᩷᩷;->height(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final invisible()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 271
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->invisible()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final isFrameLayout()Z
    .locals 2

    .line 311
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    instance-of v1, v0, Lbin/mt/plugin/api/ui/PluginFrameLayout;

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    return v0

    .line 313
    :cond_0
    instance-of v0, v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 316
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final isHorizontalLayout()Z
    .locals 2

    .line 289
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    instance-of v1, v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    if-eqz v1, :cond_0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    .line 290
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;->isHorizontal()Z

    move-result v0

    return v0

    .line 291
    :cond_0
    instance-of v0, v0, Lbin/mt/plugin/api/ui/PluginFrameLayout;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 294
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final isVerticalLayout()Z
    .locals 2

    .line 300
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    instance-of v1, v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    if-eqz v1, :cond_0

    check-cast v0, Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;

    .line 301
    invoke-interface {v0}, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;->isVertical()Z

    move-result v0

    return v0

    .line 302
    :cond_0
    instance-of v0, v0, Lbin/mt/plugin/api/ui/PluginFrameLayout;

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 305
    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0
.end method

.method public final layoutGravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->layoutGravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final layoutWeight(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 115
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->layoutWeight(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final margin(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 181
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->margin(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final margin(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 175
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۢ᩷᩷;->margin(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 205
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginBottomDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 113
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->marginBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 93
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->margin(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

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

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩺᩷᩷;->margin(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->marginHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginHorizontalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 118
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->marginHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 187
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginLeftDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 98
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->marginLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 199
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginRightDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 108
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->marginRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 103
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->marginTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->marginVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final marginVerticalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 123
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->marginVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 235
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 241
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 133
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 127
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/ۢ᩷᩷;->padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 157
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingBottomDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 73
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->paddingBottom(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 53
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->padding(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
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

    invoke-virtual {p0, p1, p2, p3, p4}, Ll/᩺᩷᩷;->padding(IIII)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingHorizontalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 78
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 139
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingLeftDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 58
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->paddingLeft(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 151
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingRightDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 68
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->paddingRight(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingTopDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 63
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->paddingTop(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 169
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->paddingVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final paddingVerticalDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 83
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->paddingVertical(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final requestFocus()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 259
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->requestFocus()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final requireId()Ljava/lang/String;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->requireId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final size(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1, p2}, Ll/ۢ᩷᩷;->size(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final sizeDp(FF)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 33
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-static {p2}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Ll/᩺᩷᩷;->size(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final tag(Ljava/lang/Object;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 86
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->tag(Ljava/lang/Object;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final bridge synthetic unifyWidth([Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->unifyWidth([Ljava/lang/String;)V

    return-object p0
.end method

.method public final varargs unifyWidth([Ljava/lang/String;)V
    .locals 3

    .line 283
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    iget-object v0, v0, Ll/ܺ᩷᩷;->ۘ:Ll/ۡ᩷᩷;

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

    return-void
.end method

.method public final visible()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 265
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ۢ᩷᩷;->visible()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/᩺᩷᩷;->ܿ:Ll/ܺ᩷᩷;

    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final widthDp(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 38
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    invoke-virtual {p0, p1}, Ll/᩺᩷᩷;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final widthMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x1

    .line 18
    invoke-virtual {p0, v0}, Ll/᩺᩷᩷;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final widthWrapContent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    const/4 v0, -0x2

    .line 13
    invoke-virtual {p0, v0}, Ll/᩺᩷᩷;->width(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final ֫()Ljava/util/HashSet;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/᩺᩷᩷;->ᩳ:Ljava/util/HashSet;

    return-object v0
.end method
