.class public final Ll/ۡ᩷᩷;
.super Ljava/lang/Object;
.source "B7NW"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;


# instance fields
.field public ֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

.field public final ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/util/ArrayList;

.field public final synthetic ᩳ:Ll/ܺ᩷᩷;


# direct methods
.method public constructor <init>(Ll/ܺ᩷᩷;)V
    .locals 0

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    .line 83
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ۡ᩷᩷;->ۧ:Ljava/util/ArrayList;

    .line 84
    iput-object p0, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-void
.end method

.method private ֫(Ll/ۢ᩷᩷;)V
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v1, v0, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    .line 99
    invoke-virtual {v0}, Ll/ܽۢ᩷;->getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;

    move-result-object v0

    .line 92
    invoke-virtual {v1, v0, p1}, Lbin/mt/plugin/api/ui/PluginUI$Style;->dispatch(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/builder/PluginBaseViewBuilder;)V

    .line 93
    iget-object v0, p0, Ll/ۡ᩷᩷;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final addButton()Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;
    .locals 2

    .line 134
    new-instance v0, Ll/ۘ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-direct {v0, v1}, Ll/ۘ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 135
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addButton(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginButtonBuilder;
    .locals 2

    .line 141
    new-instance v0, Ll/ۘ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-direct {v0, v1}, Ll/ۘ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 142
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 143
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addCheckBox()Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;
    .locals 2

    .line 149
    new-instance v0, Ll/ᩴ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 150
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addCheckBox(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginCheckBoxBuilder;
    .locals 2

    .line 156
    new-instance v0, Ll/ᩴ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 157
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 158
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addEditBox()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 3

    .line 239
    new-instance v0, Ll/᩶᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩶᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Z)V

    .line 240
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addEditBox(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 3

    .line 246
    new-instance v0, Ll/᩶᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ll/᩶᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Z)V

    .line 247
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 248
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addEditText()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 3

    .line 224
    new-instance v0, Ll/᩶᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩶᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Z)V

    .line 225
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addEditText(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 3

    .line 231
    new-instance v0, Ll/᩶᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ll/᩶᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Z)V

    .line 232
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 233
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addFrameLayout()Lbin/mt/plugin/api/ui/builder/PluginFrameLayoutBuilder;
    .locals 3

    .line 299
    new-instance v0, Ll/ۙ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    .line 15
    invoke-direct {v0, v1, v2}, Ll/ܺ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;)V

    .line 300
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addFrameLayout(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginFrameLayoutBuilder;
    .locals 3

    .line 306
    new-instance v0, Ll/ۙ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    .line 15
    invoke-direct {v0, v1, v2}, Ll/ܺ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;)V

    .line 307
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 308
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addHorizontalLayout()Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;
    .locals 4

    .line 269
    new-instance v0, Ll/۬᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    const/4 v3, 0x0

    .line 15
    invoke-direct {v0, v1, v2, v3}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 270
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addHorizontalLayout(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;
    .locals 4

    .line 276
    new-instance v0, Ll/۬᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    const/4 v3, 0x0

    .line 15
    invoke-direct {v0, v1, v2, v3}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 277
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 278
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addImageView()Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 2

    .line 254
    new-instance v0, Ll/ۗ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 35
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 255
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addImageView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginImageViewBuilder;
    .locals 2

    .line 261
    new-instance v0, Ll/ۗ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 35
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 262
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 263
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addProgressBar()Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 2

    .line 209
    new-instance v0, Ll/ۤ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-direct {v0, v1}, Ll/ۤ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 210
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addProgressBar(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginProgressBarBuilder;
    .locals 2

    .line 216
    new-instance v0, Ll/ۤ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    invoke-direct {v0, v1}, Ll/ۤ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 217
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 218
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addRadioButton()Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;
    .locals 2

    .line 179
    new-instance v0, Ll/ۛ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 180
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addRadioButton(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginRadioButtonBuilder;
    .locals 2

    .line 186
    new-instance v0, Ll/ۛ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 187
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 188
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addRadioGroup(Ljava/lang/String;Z)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 3

    .line 321
    new-instance v0, Ll/ۨ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    .line 25
    invoke-direct {v0, v1, v2, p2}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 322
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 323
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addRadioGroup(Z)Lbin/mt/plugin/api/ui/builder/PluginRadioGroupBuilder;
    .locals 3

    .line 314
    new-instance v0, Ll/ۨ᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    .line 25
    invoke-direct {v0, v1, v2, p1}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 315
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addSpinner()Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 2

    .line 194
    new-instance v0, Ll/۟᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 26
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 195
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addSpinner(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginSpinnerBuilder;
    .locals 2

    .line 201
    new-instance v0, Ll/۟᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 26
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 202
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 203
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addSwitchButton()Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;
    .locals 2

    .line 164
    new-instance v0, Ll/֫ۢ᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 165
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addSwitchButton(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginSwitchButtonBuilder;
    .locals 2

    .line 171
    new-instance v0, Ll/֫ۢ᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 172
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 173
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addTextView()Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;
    .locals 2

    .line 119
    new-instance v0, Ll/ۧۢ᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 120
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addTextView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginTextViewBuilder;
    .locals 2

    .line 126
    new-instance v0, Ll/ۧۢ᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 32
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 127
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 128
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addVerticalLayout()Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;
    .locals 4

    .line 284
    new-instance v0, Ll/۬᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    const/4 v3, 0x1

    .line 15
    invoke-direct {v0, v1, v2, v3}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 285
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addVerticalLayout(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginLinearLayoutBuilder;
    .locals 4

    .line 291
    new-instance v0, Ll/۬᩷᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    iget-object v2, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    iget-object v2, v2, Ll/ܺ᩷᩷;->ᩴ:Lbin/mt/plugin/api/ui/PluginUI$Style;

    const/4 v3, 0x1

    .line 15
    invoke-direct {v0, v1, v2, v3}, Ll/ۜ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Lbin/mt/plugin/api/ui/PluginUI$Style;I)V

    .line 292
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 293
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addView()Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;
    .locals 2

    .line 104
    new-instance v0, Ll/ܿۢ᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 15
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 105
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final addView(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginViewBuilder;
    .locals 2

    .line 111
    new-instance v0, Ll/ܿۢ᩷;

    iget-object v1, p0, Ll/ۡ᩷᩷;->֫:Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 15
    invoke-direct {v0, v1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 112
    invoke-virtual {v0, p1}, Ll/ۢ᩷᩷;->id(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    .line 113
    invoke-direct {p0, v0}, Ll/ۡ᩷᩷;->֫(Ll/ۢ᩷᩷;)V

    return-object v0
.end method

.method public final build()Lbin/mt/plugin/api/ui/PluginView;
    .locals 2

    .line 341
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Method \'build()\' is not supported by this PluginUIBuilder"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۡ᩷᩷;->ᩳ:Ll/ܺ᩷᩷;

    invoke-virtual {v0}, Ll/ܽۢ᩷;->getPluginUI()Lbin/mt/plugin/api/ui/PluginUI;

    move-result-object v0

    return-object v0
.end method
