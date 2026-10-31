.class public Ll/ۨܳ᩷;
.super Lbin/mt/plugin/api/ui/PluginUI$Style;
.source "O7RX"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 313
    invoke-direct {p0}, Lbin/mt/plugin/api/ui/PluginUI$Style;-><init>()V

    return-void
.end method


# virtual methods
.method public handleEditText(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;)V
    .locals 0

    .line 331
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->widthMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 333
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;->isBoxStyle()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 334
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;->inputTypeMultiline()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;

    :cond_0
    return-void
.end method

.method public handleLinearLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;)V
    .locals 0

    .line 341
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;->isHorizontal()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 342
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->widthMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    :cond_0
    return-void
.end method

.method public handleRadioGroup(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;)V
    .locals 0

    .line 349
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginBaseLinearLayoutBuilder;->isHorizontal()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 350
    invoke-interface {p2}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->widthMatchParent()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    :cond_0
    return-void
.end method

.method public handleRootLayout(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginRootLayoutBuilder;)V
    .locals 0

    .line 318
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->dialogPaddingHorizontal()I

    move-result p1

    invoke-interface {p2, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;->paddingHorizontal(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-void
.end method

.method public handleTextView(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;)V
    .locals 0

    .line 324
    invoke-interface {p1}, Lbin/mt/plugin/api/ui/PluginUI;->colorTextStateList()Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-interface {p2, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textColor(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    const/high16 p1, 0x41800000    # 16.0f

    .line 325
    invoke-interface {p2, p1}, Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;->textSize(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-void
.end method
