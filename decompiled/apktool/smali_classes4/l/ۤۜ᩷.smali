.class public Ll/ۤۜ᩷;
.super Ll/۟ۜ᩷;
.source "57OH"

# interfaces
.implements Lbin/mt/plugin/api/ui/PluginTextView;


# virtual methods
.method public final append(Ljava/lang/CharSequence;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final append(Ljava/lang/CharSequence;II)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2, p3}, Landroid/widget/TextView;->append(Ljava/lang/CharSequence;II)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final getCurrentTextColor()I
    .locals 1

    .line 69
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v0

    return v0
.end method

.method public final getGravity()I
    .locals 1

    .line 120
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getGravity()I

    move-result v0

    return v0
.end method

.method public final getMaxLines()I
    .locals 1

    .line 166
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMaxLines()I

    move-result v0

    return v0
.end method

.method public final getMinLines()I
    .locals 1

    .line 155
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getMinLines()I

    move-result v0

    return v0
.end method

.method public final getText()Ljava/lang/CharSequence;
    .locals 1

    .line 26
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0
.end method

.method public final getTextColors()Landroid/content/res/ColorStateList;
    .locals 1

    .line 64
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v0

    return-object v0
.end method

.method public final getTextSize()F
    .locals 1

    .line 53
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v0

    invoke-static {v0}, Ll/ۧ᩸ۡ;->ۧ(F)I

    move-result v0

    int-to-float v0, v0

    return v0
.end method

.method public final getTypeface()Landroid/graphics/Typeface;
    .locals 1

    .line 103
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public final isAllCaps()Z
    .locals 2

    .line 177
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    .line 178
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->isAllCaps()Z

    move-result v0

    return v0

    .line 180
    :cond_0
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    instance-of v0, v0, Ll/᩹᩻;

    return v0
.end method

.method public final setAllCaps(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 187
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setAllCaps(Z)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setGravity(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 126
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setLineSpacing(FF)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 132
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setLineSpacing(FF)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setLines(I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 150
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setLines(I)V

    return-void

    .line 649
    :cond_0
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

    .line 172
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

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

    .line 161
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMinLines(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setSingleLine(Z)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

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

    .line 32
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p0, p1}, Ll/۟ۜ᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

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

    .line 75
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTextColor(II)V
    .locals 3

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    new-array v0, v0, [[I

    const v1, 0x101009e

    .line 82
    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, -0x101009e

    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 86
    filled-new-array {p1, p2}, [I

    move-result-object p1

    .line 91
    new-instance p2, Landroid/content/res/ColorStateList;

    invoke-direct {p2, v0, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 92
    iget-object p1, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTextColor(Landroid/content/res/ColorStateList;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

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

    .line 59
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTypeface(Landroid/graphics/Typeface;)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 109
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This method must be called on the UI thread"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setTypeface(Landroid/graphics/Typeface;I)V
    .locals 1

    .line 648
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 115
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    return-void

    .line 649
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This method must be called on the UI thread"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(Ljava/lang/CharSequence;)V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/۟ۜ᩷;->ܿ:Landroid/view/View;

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
