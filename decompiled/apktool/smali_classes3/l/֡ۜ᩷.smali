.class public final Ll/֡ۜ᩷;
.super Ll/۟ۜ᩷;
.source "Q7R7"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginEditText;


# virtual methods
.method public final addTextChangedListener(Lbin/mt/plugin/api/ui/PluginEditTextWatcher;)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 292
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    new-instance v1, Ll/᩵ۜ᩷;

    invoke-direct {v1, p0, p1}, Ll/᩵ۜ᩷;-><init>(Ll/֡ۜ᩷;Lbin/mt/plugin/api/ui/PluginEditTextWatcher;)V

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getHint()Ljava/lang/CharSequence;
    .locals 1

    .line 52
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩴ֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getInputType()I
    .locals 1

    .line 191
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->֡֫()I

    move-result v0

    return v0
.end method

.method public final getMaxLines()I
    .locals 1

    .line 170
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->᩷ᩳ()I

    move-result v0

    return v0
.end method

.method public final getMinLines()I
    .locals 1

    .line 159
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->ۢᩳ()I

    move-result v0

    return v0
.end method

.method public final getSelectionEnd()I
    .locals 1

    .line 229
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v0

    return v0
.end method

.method public final getSelectionStart()I
    .locals 1

    .line 224
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۫֫()I

    move-result v0

    return v0
.end method

.method public final getText()Landroid/text/Editable;
    .locals 1

    .line 32
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    return-object v0
.end method

.method public final getTextColor()I
    .locals 1

    .line 82
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ᩳۧ()I

    move-result v0

    return v0
.end method

.method public final getTextSize()F
    .locals 1

    .line 71
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜۧ()F

    move-result v0

    return v0
.end method

.method public final getTypeface()Landroid/graphics/Typeface;
    .locals 2

    .line 111
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    const v1, 0x7f0a0657

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/graphics/Typeface;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/graphics/Typeface;

    return-object v0

    .line 114
    :cond_0
    sget-object v0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    return-object v0
.end method

.method public final isBoxStyle()Z
    .locals 1

    .line 281
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->ۡᩳ()Z

    move-result v0

    return v0
.end method

.method public final isLineStyle()Z
    .locals 1

    .line 286
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->ܺᩳ()Z

    move-result v0

    return v0
.end method

.method public final isReadOnly()Z
    .locals 1

    .line 270
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    return v0
.end method

.method public final isSingleLine()Z
    .locals 1

    .line 142
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->֫ܽ()Z

    move-result v0

    return v0
.end method

.method public final length()I
    .locals 1

    .line 37
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    return v0
.end method

.method public final requestFocusAndShowIME()Z
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 314
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->isFocusable()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۨۧ()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    .line 317
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->isLaidOut()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 318
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-static {v0}, Ll/ۙ᩸᩷;->ܽ(Landroid/view/View;)V

    goto :goto_0

    .line 320
    :cond_1
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return v0

    .line 649
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final selectAll()V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 247
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/ۤۤᩳ;->ۖᩳ()V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final selectEnd()V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    move-object v1, v0

    check-cast v1, Ll/ۤۤᩳ;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    invoke-virtual {v1, v0}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setBracketHighlightEnable(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    .line 216
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Ll/ۤۤᩳ;

    invoke-virtual {p1}, Ll/ۤۤᩳ;->ۜᩳ()V

    return-void

    .line 218
    :cond_0
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Ll/ۤۤᩳ;

    invoke-virtual {p1}, Ll/ۤۤᩳ;->᩻ᩳ()V

    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    if-nez p1, :cond_0

    .line 59
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Ll/ۤۤᩳ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 61
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setHintTextColor(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 100
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ܶ(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setHintTextColor(Ljava/lang/Integer;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 106
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->֫(Ljava/lang/Integer;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setInputMultiline()V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 203
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    const v1, 0x20001

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩹(I)V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setInputNumber()V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 209
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Ll/ۤۤᩳ;->᩹(I)V

    return-void

    .line 649
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This method must be called on the UI thread"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setInputType(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 197
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->᩹(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setLines(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->᩶(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMaxLength(I)V
    .locals 3

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    if-lez p1, :cond_0

    .line 183
    iget-object v1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v1, Ll/ۤۤᩳ;

    new-instance v2, Landroid/text/InputFilter$LengthFilter;

    invoke-direct {v2, p1}, Landroid/text/InputFilter$LengthFilter;-><init>(I)V

    const/4 p1, 0x1

    new-array p1, p1, [Landroid/text/InputFilter;

    aput-object v2, p1, v0

    invoke-virtual {v1, p1}, Ll/ۤۤᩳ;->֫([Landroid/text/InputFilter;)V

    return-void

    .line 185
    :cond_0
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Ll/ۤۤᩳ;

    new-array v0, v0, [Landroid/text/InputFilter;

    invoke-virtual {p1, v0}, Ll/ۤۤᩳ;->֫([Landroid/text/InputFilter;)V

    return-void

    .line 649
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMaxLines(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 176
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۙ(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setMinLines(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۗ(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setOnClickListener(Lbin/mt/plugin/api/ui/PluginView$OnClickListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final setOnLongClickListener(Lbin/mt/plugin/api/ui/PluginView$OnLongClickListener;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    return-void
.end method

.method public final setReadOnly(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 276
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ۡ(Z)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSelection(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 241
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ᩴ(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSelection(II)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 235
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1, p2}, Ll/ۤۤᩳ;->᩷(II)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSingleLine(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 148
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->֨(Z)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSoftWrap(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 265
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->᩵(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSyntaxHighlight(Ljava/lang/String;)V
    .locals 2

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    const/4 v1, 0x1

    .line 2070
    invoke-virtual {v0, p1, v1}, Ll/۫ۨᩳ;->֫(Ljava/lang/String;Z)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTextColor(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 88
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->۫(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTextColor(Ljava/lang/Integer;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 94
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/Integer;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTextSize(F)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܽ(F)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 2

    .line 120
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    const v1, 0x7f0a0657

    invoke-virtual {v0, v1, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    if-nez p1, :cond_0

    .line 122
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Ll/ۤۤᩳ;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->ۚ(I)V

    return-void

    .line 124
    :cond_0
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Ll/ۤۤᩳ;

    const/4 v0, 0x2

    invoke-virtual {p1, v0}, Ll/۫ۨᩳ;->ۚ(I)V

    return-void
.end method

.method public final setTypeface(Landroid/graphics/Typeface;I)V
    .locals 0

    if-lez p2, :cond_1

    if-nez p1, :cond_0

    .line 132
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    .line 134
    :cond_0
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 137
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ll/֡ۜ᩷;->setTypeface(Landroid/graphics/Typeface;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 47
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܽ(Ljava/lang/String;)V
    .locals 1

    .line 66
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Ll/ۤۤᩳ;

    invoke-virtual {v0, p1}, Ll/۫ۨᩳ;->ܽ(Ljava/lang/String;)V

    return-void
.end method
