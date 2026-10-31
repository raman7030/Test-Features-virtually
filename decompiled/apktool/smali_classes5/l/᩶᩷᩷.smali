.class public final Ll/᩶᩷᩷;
.super Ll/ۢ᩷᩷;
.source "G7NS"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;


# instance fields
.field public ֡:Ljava/lang/Integer;

.field public ֨:Ljava/lang/Integer;

.field public ۗ:Ljava/lang/Boolean;

.field public ۘ:Z

.field public ۙ:Z

.field public ۚ:Ljava/lang/Integer;

.field public ۛ:Ljava/lang/Integer;

.field public ۠:Ljava/lang/Integer;

.field public ۤ:Ljava/lang/CharSequence;

.field public ۨ:Ljava/lang/Float;

.field public ۫:Ljava/lang/String;

.field public ۬:Ljava/lang/Integer;

.field public ܰ:Landroid/graphics/Typeface;

.field public ܶ:Ljava/lang/Boolean;

.field public ᩴ:Ljava/lang/CharSequence;

.field public ᩵:Ljava/lang/Integer;

.field public ᩶:I

.field public ᩸:I

.field public ᩹:I

.field public ᩺:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;Z)V
    .locals 0

    .line 49
    invoke-direct {p0, p1}, Ll/ۢ᩷᩷;-><init>(Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;)V

    .line 50
    new-instance p1, Ll/᩹᩷᩷;

    invoke-direct {p1, p2}, Ll/᩹᩷᩷;-><init>(Z)V

    iput-object p1, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final addTextChangedListener(Lbin/mt/plugin/api/ui/PluginEditTextWatcher;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 2

    .line 345
    iget-object v0, p0, Ll/᩶᩷᩷;->᩺:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    .line 346
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Ll/᩶᩷᩷;->᩺:Ljava/util/ArrayList;

    .line 348
    :cond_0
    iget-object v0, p0, Ll/᩶᩷᩷;->᩺:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final background(Landroid/graphics/drawable/Drawable;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 293
    iput-object p1, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method

.method public final bridge synthetic backgroundColor(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 27
    invoke-virtual {p0, p1}, Ll/ۢ᩷᩷;->backgroundColor(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final bold()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 211
    invoke-virtual {p0, v0, v1}, Ll/᩶᩷᩷;->textStyle(ZZ)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;

    return-object p0
.end method

.method public final disableBracketHighlight()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 288
    iput-boolean v0, p0, Ll/᩶᩷᩷;->ۘ:Z

    return-object p0
.end method

.method public final hint(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 170
    invoke-virtual {p0, p1}, Ll/ۢ᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ᩴ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final inputType(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 264
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0
.end method

.method public final inputTypeMultiline()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const v0, 0x20001

    .line 270
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0
.end method

.method public final inputTypeNumber()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x2

    .line 276
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Ll/᩶᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0
.end method

.method public final isBoxStyle()Z
    .locals 2

    .line 361
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Ll/᩹᩷᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩹᩷᩷;

    invoke-static {v0}, Ll/᩹᩷᩷;->֫(Ll/᩹᩷᩷;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isLineStyle()Z
    .locals 2

    .line 366
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Ll/᩹᩷᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩹᩷᩷;

    invoke-static {v0}, Ll/᩹᩷᩷;->֫(Ll/᩹᩷᩷;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final italic()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 216
    invoke-virtual {p0, v0, v1}, Ll/᩶᩷᩷;->textStyle(ZZ)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;

    return-object p0
.end method

.method public final lines(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 246
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->֨:Ljava/lang/Integer;

    iput-object p1, p0, Ll/᩶᩷᩷;->۠:Ljava/lang/Integer;

    return-object p0
.end method

.method public final maxLength(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 282
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ۚ:Ljava/lang/Integer;

    return-object p0
.end method

.method public final maxLines(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 258
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->֨:Ljava/lang/Integer;

    return-object p0
.end method

.method public final minLines(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 252
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->۠:Ljava/lang/Integer;

    return-object p0
.end method

.method public final onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    return-object p0
.end method

.method public final onClick(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    return-object p0
.end method

.method public final onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    return-object p0
.end method

.method public final onLongClick(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    return-object p0
.end method

.method public final readOnly()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    .line 333
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/᩶᩷᩷;->ܶ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final readOnly(Z)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 339
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ܶ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final requestFocusAndShowIME()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 354
    iput-boolean v0, p0, Ll/ۢ᩷᩷;->ۡ:Z

    .line 355
    iput-boolean v0, p0, Ll/᩶᩷᩷;->ۙ:Z

    return-object p0
.end method

.method public final select(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 294
    iput v0, p0, Ll/᩶᩷᩷;->᩸:I

    .line 295
    iput p1, p0, Ll/᩶᩷᩷;->᩹:I

    iput p1, p0, Ll/᩶᩷᩷;->᩶:I

    return-object p0
.end method

.method public final select(II)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x1

    .line 301
    iput v0, p0, Ll/᩶᩷᩷;->᩸:I

    .line 302
    iput p1, p0, Ll/᩶᩷᩷;->᩶:I

    .line 303
    iput p2, p0, Ll/᩶᩷᩷;->᩹:I

    return-object p0
.end method

.method public final selectAll()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x2

    .line 309
    iput v0, p0, Ll/᩶᩷᩷;->᩸:I

    return-object p0
.end method

.method public final selectEnd()Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x3

    .line 315
    iput v0, p0, Ll/᩶᩷᩷;->᩸:I

    return-object p0
.end method

.method public final setHintTextColor(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 191
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->᩵:Ljava/lang/Integer;

    return-object p0
.end method

.method public final singleLine(Z)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 240
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ۗ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final softWrap(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 327
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->۬:Ljava/lang/Integer;

    return-object p0
.end method

.method public final syntaxHighlight(Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 321
    iput-object p1, p0, Ll/᩶᩷᩷;->۫:Ljava/lang/String;

    return-object p0
.end method

.method public final text(Lbin/mt/json/JSONObject;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    const/4 v0, 0x0

    .line 155
    invoke-virtual {p0, p1, v0}, Ll/᩶᩷᩷;->text(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;

    return-object p0
.end method

.method public final text(Lbin/mt/json/JSONObject;Ljava/lang/String;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 1

    if-nez p1, :cond_0

    .line 161
    iput-object p2, p0, Ll/᩶᩷᩷;->ۤ:Ljava/lang/CharSequence;

    return-object p0

    .line 163
    :cond_0
    invoke-virtual {p0}, Ll/ۢ᩷᩷;->requireId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, p2}, Lbin/mt/json/JSONObject;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ۤ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final text(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 149
    invoke-virtual {p0, p1}, Ll/ۢ᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ۤ:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final textColor(I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 182
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ۛ:Ljava/lang/Integer;

    return-object p0
.end method

.method public final textSize(F)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 176
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ۨ:Ljava/lang/Float;

    return-object p0
.end method

.method public final textStyle(ZZ)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 198
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 p2, 0x3

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    .line 200
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    return-object p0

    :cond_1
    if-eqz p2, :cond_2

    .line 202
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    return-object p0

    .line 204
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public final typeface(Landroid/graphics/Typeface;)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    .line 221
    iput-object p1, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public final typeface(Landroid/graphics/Typeface;I)Lbin/mt/plugin/api/ui/builder/PluginEditTextBuilder;
    .locals 0

    if-lez p2, :cond_1

    if-nez p1, :cond_0

    .line 229
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    .line 231
    :cond_0
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 234
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public final ֫(Landroid/content/Context;)Landroid/view/View;
    .locals 1

    .line 60
    new-instance v0, Ll/ۤۤᩳ;

    invoke-direct {v0, p1}, Ll/ۤۤᩳ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public final ֫(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)Ll/۟ۜ᩷;
    .locals 1

    .line 55
    new-instance v0, Ll/֡ۜ᩷;

    .line 26
    invoke-direct {v0, p1, p2}, Ll/۟ۜ᩷;-><init>(Lbin/mt/plugin/api/ui/PluginUI;Lbin/mt/plugin/api/ui/PluginViewGroup;)V

    return-object v0
.end method

.method public final ֫(Ll/۟ۜ᩷;)V
    .locals 2

    .line 27
    check-cast p1, Ll/֡ۜ᩷;

    .line 65
    iget-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    instance-of v1, v0, Ll/᩹᩷᩷;

    if-eqz v1, :cond_0

    check-cast v0, Ll/᩹᩷᩷;

    .line 66
    invoke-virtual {p1}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۤۤᩳ;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 67
    invoke-static {v0}, Ll/᩹᩷᩷;->֫(Ll/᩹᩷᩷;)Z

    move-result v0

    .line 66
    invoke-static {v1, v0}, Ll/ۤۤᩳ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Ll/ۢ᩷᩷;->ܽ:Landroid/graphics/drawable/Drawable;

    .line 72
    :cond_0
    invoke-virtual {p1}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۤۤᩳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 73
    invoke-virtual {p1}, Ll/۟ۜ᩷;->֫()Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۤۤᩳ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1, v1, v1}, Ll/۫ۨᩳ;->setPadding(IIII)V

    .line 75
    invoke-super {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    .line 77
    iget-object v0, p0, Ll/᩶᩷᩷;->۬:Ljava/lang/Integer;

    if-eqz v0, :cond_1

    .line 78
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setSoftWrap(I)V

    .line 80
    :cond_1
    iget-object v0, p0, Ll/᩶᩷᩷;->ۨ:Ljava/lang/Float;

    if-eqz v0, :cond_2

    .line 81
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setTextSize(F)V

    .line 83
    :cond_2
    iget-object v0, p0, Ll/᩶᩷᩷;->ۗ:Ljava/lang/Boolean;

    if-eqz v0, :cond_3

    .line 84
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setSingleLine(Z)V

    .line 86
    :cond_3
    iget-object v0, p0, Ll/᩶᩷᩷;->ܰ:Landroid/graphics/Typeface;

    if-eqz v0, :cond_4

    .line 87
    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setTypeface(Landroid/graphics/Typeface;)V

    .line 89
    :cond_4
    iget-object v0, p0, Ll/᩶᩷᩷;->۫:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 90
    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setSyntaxHighlight(Ljava/lang/String;)V

    .line 93
    :cond_5
    iget-object v0, p0, Ll/᩶᩷᩷;->ۚ:Ljava/lang/Integer;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_6

    .line 94
    iget-object v0, p0, Ll/᩶᩷᩷;->ۚ:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setMaxLength(I)V

    .line 96
    :cond_6
    iget-object v0, p0, Ll/᩶᩷᩷;->ۛ:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    .line 97
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setTextColor(I)V

    .line 99
    :cond_7
    iget-object v0, p0, Ll/᩶᩷᩷;->᩵:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    .line 100
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setHintTextColor(I)V

    .line 102
    :cond_8
    iget-object v0, p0, Ll/᩶᩷᩷;->֨:Ljava/lang/Integer;

    if-eqz v0, :cond_9

    .line 103
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setMaxLines(I)V

    .line 105
    :cond_9
    iget-object v0, p0, Ll/᩶᩷᩷;->۠:Ljava/lang/Integer;

    if-eqz v0, :cond_a

    .line 106
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setMinLines(I)V

    .line 108
    :cond_a
    iget-object v0, p0, Ll/᩶᩷᩷;->֡:Ljava/lang/Integer;

    if-eqz v0, :cond_b

    .line 109
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setInputType(I)V

    .line 111
    :cond_b
    iget-boolean v0, p0, Ll/᩶᩷᩷;->ۘ:Z

    if-eqz v0, :cond_c

    .line 112
    invoke-virtual {p1, v1}, Ll/֡ۜ᩷;->setBracketHighlightEnable(Z)V

    .line 115
    :cond_c
    iget-object v0, p0, Ll/᩶᩷᩷;->ۤ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_d

    .line 116
    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->ۧ(Ljava/lang/CharSequence;)V

    .line 118
    :cond_d
    iget-object v0, p0, Ll/᩶᩷᩷;->ᩴ:Ljava/lang/CharSequence;

    if-eqz v0, :cond_e

    .line 119
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->ܽ(Ljava/lang/String;)V

    .line 121
    :cond_e
    iget v0, p0, Ll/᩶᩷᩷;->᩸:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_11

    const/4 v1, 0x2

    if-eq v0, v1, :cond_10

    const/4 v1, 0x3

    if-eq v0, v1, :cond_f

    goto :goto_0

    .line 131
    :cond_f
    invoke-virtual {p1}, Ll/֡ۜ᩷;->selectEnd()V

    goto :goto_0

    .line 128
    :cond_10
    invoke-virtual {p1}, Ll/֡ۜ᩷;->selectAll()V

    goto :goto_0

    .line 125
    :cond_11
    iget v0, p0, Ll/᩶᩷᩷;->᩶:I

    iget v1, p0, Ll/᩶᩷᩷;->᩹:I

    invoke-virtual {p1, v0, v1}, Ll/֡ۜ᩷;->setSelection(II)V

    .line 134
    :goto_0
    iget-object v0, p0, Ll/᩶᩷᩷;->ܶ:Ljava/lang/Boolean;

    if-eqz v0, :cond_12

    .line 135
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/֡ۜ᩷;->setReadOnly(Z)V

    .line 137
    :cond_12
    iget-object v0, p0, Ll/᩶᩷᩷;->᩺:Ljava/util/ArrayList;

    if-eqz v0, :cond_13

    .line 138
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbin/mt/plugin/api/ui/PluginEditTextWatcher;

    .line 139
    invoke-virtual {p1, v1}, Ll/֡ۜ᩷;->addTextChangedListener(Lbin/mt/plugin/api/ui/PluginEditTextWatcher;)V

    goto :goto_1

    .line 142
    :cond_13
    iget-boolean v0, p0, Ll/᩶᩷᩷;->ۙ:Z

    if-eqz v0, :cond_14

    .line 143
    invoke-virtual {p1}, Ll/֡ۜ᩷;->requestFocusAndShowIME()Z

    :cond_14
    return-void
.end method
