.class public final Ll/ᩳۢ᩷;
.super Ljava/lang/Object;
.source "N7PG"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginUI;


# instance fields
.field public final ֫:Ll/ۗܺ᩷;

.field public final ۧ:Lbin/mt/plugin/api/PluginContext;

.field public ܽ:Z

.field public ᩳ:Lbin/mt/plugin/api/ui/PluginUI$Style;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;Ll/ۗܺ᩷;)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    sget-object v0, Lbin/mt/plugin/api/ui/PluginUI;->DEFAULT_STYLE:Lbin/mt/plugin/api/ui/PluginUI$Style;

    iput-object v0, p0, Ll/ᩳۢ᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    const/4 v0, 0x1

    .line 32
    iput-boolean v0, p0, Ll/ᩳۢ᩷;->ܽ:Z

    .line 35
    iput-object p1, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    .line 36
    iput-object p2, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;
    .locals 2

    .line 103
    new-instance v0, Ll/᩸᩷᩷;

    iget-object v1, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, p0, v1}, Ll/᩸᩷᩷;-><init>(Ll/ᩳۢ᩷;Landroid/content/Context;)V

    return-object v0
.end method

.method public final buildFrameLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
    .locals 4

    .line 98
    new-instance v0, Ll/᩺᩷᩷;

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v3, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/᩺᩷᩷;-><init>(Ll/ᩳۢ᩷;Landroid/content/Context;ZI)V

    return-object v0
.end method

.method public final buildHorizontalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
    .locals 3

    .line 88
    new-instance v0, Ll/᩺᩷᩷;

    iget-object v1, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2, v2}, Ll/᩺᩷᩷;-><init>(Ll/ᩳۢ᩷;Landroid/content/Context;ZI)V

    return-object v0
.end method

.method public final buildVerticalLayout()Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;
    .locals 4

    .line 93
    new-instance v0, Ll/᩺᩷᩷;

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/᩺᩷᩷;-><init>(Ll/ᩳۢ᩷;Landroid/content/Context;ZI)V

    return-object v0
.end method

.method public final cancelToast()V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    .line 66
    invoke-interface {v0}, Lbin/mt/plugin/api/PluginContext;->cancelToast()V

    return-void
.end method

.method public final colorAccent()I
    .locals 1

    .line 146
    sget v0, Ll/᩹֡᩷;->֫:I

    return v0
.end method

.method public final colorDivider()I
    .locals 1

    .line 151
    sget v0, Ll/᩹֡᩷;->ܳ:I

    return v0
.end method

.method public final colorError()I
    .locals 1

    .line 156
    sget v0, Ll/᩹֡᩷;->ᩳ֫:I

    return v0
.end method

.method public final colorPrimary()I
    .locals 1

    .line 141
    sget v0, Ll/᩹֡᩷;->ۢ:I

    return v0
.end method

.method public final colorText()I
    .locals 1

    .line 166
    sget v0, Ll/᩹֡᩷;->ܳ֫:I

    return v0
.end method

.method public final colorTextSecondary()I
    .locals 1

    .line 171
    sget v0, Ll/᩹֡᩷;->ۜ֫:I

    return v0
.end method

.method public final colorTextSecondaryStateList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 181
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final colorTextStateList()Landroid/content/res/ColorStateList;
    .locals 1

    .line 176
    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    return-object v0
.end method

.method public final colorWarning()I
    .locals 1

    .line 161
    sget v0, Ll/᩹֡᩷;->ۘ֫:I

    return v0
.end method

.method public final createPopupMenu(Lbin/mt/plugin/api/ui/PluginView;)Lbin/mt/plugin/api/ui/menu/PluginPopupMenu;
    .locals 3

    .line 108
    new-instance v0, Ll/ۢۢ᩷;

    iget-object v1, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    iget-object v2, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v1, v2, p1}, Ll/ۢۢ᩷;-><init>(Lbin/mt/plugin/api/PluginContext;Landroid/content/Context;Lbin/mt/plugin/api/ui/PluginView;)V

    return-object v0
.end method

.method public final defaultStyle(Lbin/mt/plugin/api/ui/PluginUI$Style;)Lbin/mt/plugin/api/ui/PluginUI;
    .locals 2

    .line 222
    instance-of v0, p1, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;

    invoke-virtual {v0}, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->getBaseStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;

    move-result-object v1

    if-nez v1, :cond_0

    .line 223
    iget-object v1, p0, Ll/ᩳۢ᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    invoke-virtual {v0, v1}, Lbin/mt/plugin/api/ui/PluginUI$StyleWrapper;->attachStyle(Lbin/mt/plugin/api/ui/PluginUI$Style;)V

    :cond_0
    const-string v0, "Style cannot be null"

    .line 225
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ᩳۢ᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-object p0
.end method

.method public final dialogPaddingHorizontal()I
    .locals 1

    const/high16 v0, 0x41c00000    # 24.0f

    .line 186
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    return v0
.end method

.method public final dialogPaddingVertical()I
    .locals 1

    const/high16 v0, 0x41900000    # 18.0f

    .line 191
    invoke-static {v0}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result v0

    return v0
.end method

.method public final disableStrictIdMode()Lbin/mt/plugin/api/ui/PluginUI;
    .locals 1

    const/4 v0, 0x0

    .line 71
    iput-boolean v0, p0, Ll/ᩳۢ᩷;->ܽ:Z

    return-object p0
.end method

.method public final dp2px(F)I
    .locals 0

    .line 206
    invoke-static {p1}, Ll/ۧ᩸ۡ;->֫(F)I

    move-result p1

    return p1
.end method

.method public final getContext()Lbin/mt/plugin/api/PluginContext;
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    return-object v0
.end method

.method public final getStyle()Lbin/mt/plugin/api/ui/PluginUI$Style;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ᩳۢ᩷;->ᩳ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    return-object v0
.end method

.method public final isDarkTheme()Z
    .locals 1

    .line 136
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final isStrictIdModeEnabled()Z
    .locals 1

    .line 83
    iget-boolean v0, p0, Ll/ᩳۢ᩷;->ܽ:Z

    return v0
.end method

.method public final selectableItemBackground()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-static {v0}, Ll/᩶ۖ᩷;->֫(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final selectableItemBackgroundBorderless()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 201
    iget-object v0, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-static {v0}, Ll/᩶ۖ᩷;->ۧ(Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public final setStrictIdModeEnabled(Z)Lbin/mt/plugin/api/ui/PluginUI;
    .locals 0

    .line 77
    iput-boolean p1, p0, Ll/ᩳۢ᩷;->ܽ:Z

    return-object p0
.end method

.method public final showErrorMessage(Ljava/lang/Throwable;)V
    .locals 2

    .line 121
    iget-object v0, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final showMessage(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 1

    .line 113
    invoke-virtual {p0}, Ll/ᩳۢ᩷;->buildDialog()Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    move-result-object v0

    check-cast v0, Ll/᩸᩷᩷;

    invoke-virtual {v0, p1}, Ll/᩸᩷᩷;->setTitle(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    .line 114
    invoke-virtual {v0, p2}, Ll/᩸᩷᩷;->setMessage(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    const p1, 0x7f120189

    .line 115
    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v0, p1, p2}, Ll/᩸᩷᩷;->setPositiveButton(Ljava/lang/CharSequence;Lbin/mt/plugin/api/ui/dialog/PluginDialog$OnClickListener;)Lbin/mt/plugin/api/ui/dialog/PluginDialog$Builder;

    .line 116
    invoke-virtual {v0}, Ll/᩸᩷᩷;->show()Lbin/mt/plugin/api/ui/dialog/PluginDialog;

    return-void
.end method

.method public final showPreference(Ljava/lang/Class;)V
    .locals 4

    .line 126
    new-instance v0, Landroid/content/Intent;

    sget-object v1, Ll/ۛ᩻᩷;->ۜ:Ljava/lang/Class;

    iget-object v2, p0, Ll/ᩳۢ᩷;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 127
    iget-object v1, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    invoke-interface {v1}, Lbin/mt/plugin/api/PluginContext;->getPluginId()Ljava/lang/String;

    move-result-object v1

    const-string v3, "pluginId"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    if-eqz p1, :cond_0

    const-string v1, "pluginPreference"

    .line 129
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 131
    :cond_0
    invoke-virtual {v2, v0}, Ll/ۗܺ᩷;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public final showToast(Ljava/lang/CharSequence;)V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    .line 46
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/PluginContext;->showToast(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final varargs showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    .line 51
    invoke-interface {v0, p1, p2}, Lbin/mt/plugin/api/PluginContext;->showToast(Ljava/lang/CharSequence;[Ljava/lang/Object;)V

    return-void
.end method

.method public final showToastL(Ljava/lang/CharSequence;)V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    .line 56
    invoke-interface {v0, p1}, Lbin/mt/plugin/api/PluginContext;->showToastL(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final varargs showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/ᩳۢ᩷;->ۧ:Lbin/mt/plugin/api/PluginContext;

    .line 61
    invoke-interface {v0, p1, p2}, Lbin/mt/plugin/api/PluginContext;->showToastL(Ljava/lang/CharSequence;[Ljava/lang/Object;)V

    return-void
.end method

.method public final sp2px(F)I
    .locals 0

    .line 211
    invoke-static {p1}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result p1

    return p1
.end method
