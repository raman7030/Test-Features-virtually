.class public abstract Ll/᩷᩷᩷;
.super Ll/ۢ᩷᩷;
.source "E7P7"

# interfaces
.implements Lbin/mt/plugin/api/ui/builder/PluginBaseTextViewBuilder;


# instance fields
.field public ֡:Ljava/lang/Integer;

.field public ֨:Ljava/lang/Boolean;

.field public ۘ:Ljava/lang/Boolean;

.field public ۙ:Landroid/graphics/Typeface;

.field public ۚ:Ljava/lang/Integer;

.field public ۠:Ljava/lang/CharSequence;

.field public ܶ:Landroid/content/res/ColorStateList;

.field public ᩴ:Ljava/lang/Float;

.field public ᩵:Ljava/lang/Float;

.field public ᩶:Landroid/text/TextUtils$TruncateAt;

.field public ᩸:Ljava/lang/Integer;

.field public ᩹:Ljava/lang/Float;


# virtual methods
.method public final allCaps(Z)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 201
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->ۘ:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final bold()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 129
    invoke-virtual {p0, v0, v1}, Ll/᩷᩷᩷;->textStyle(ZZ)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final ellipsize(Landroid/text/TextUtils$TruncateAt;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 195
    iput-object p1, p0, Ll/᩷᩷᩷;->᩶:Landroid/text/TextUtils$TruncateAt;

    return-object p0
.end method

.method public final italic()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 134
    invoke-virtual {p0, v0, v1}, Ll/᩷᩷᩷;->textStyle(ZZ)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;

    return-object p0
.end method

.method public final lineSpacing(FF)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 164
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->ᩴ:Ljava/lang/Float;

    .line 165
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->᩵:Ljava/lang/Float;

    return-object p0
.end method

.method public final lines(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 177
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->֡:Ljava/lang/Integer;

    iput-object p1, p0, Ll/᩷᩷᩷;->ۚ:Ljava/lang/Integer;

    return-object p0
.end method

.method public final maxLines(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 183
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->֡:Ljava/lang/Integer;

    return-object p0
.end method

.method public final minLines(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 189
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->ۚ:Ljava/lang/Integer;

    return-object p0
.end method

.method public final singleLine()Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 1

    .line 171
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v0, p0, Ll/᩷᩷᩷;->֨:Ljava/lang/Boolean;

    return-object p0
.end method

.method public final text(Ljava/lang/CharSequence;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 75
    invoke-virtual {p0, p1}, Ll/ۢ᩷᩷;->֫(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->۠:Ljava/lang/CharSequence;

    return-object p0
.end method

.method public final textColor(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 87
    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->ܶ:Landroid/content/res/ColorStateList;

    return-object p0
.end method

.method public final textColor(II)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [[I

    const v1, 0x101009e

    .line 94
    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const v1, -0x101009e

    filled-new-array {v1}, [I

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    .line 98
    filled-new-array {p1, p2}, [I

    move-result-object p1

    .line 103
    new-instance p2, Landroid/content/res/ColorStateList;

    invoke-direct {p2, v0, p1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    iput-object p2, p0, Ll/᩷᩷᩷;->ܶ:Landroid/content/res/ColorStateList;

    return-object p0
.end method

.method public final textColor(Landroid/content/res/ColorStateList;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 109
    iput-object p1, p0, Ll/᩷᩷᩷;->ܶ:Landroid/content/res/ColorStateList;

    return-object p0
.end method

.method public final textGravity(I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 158
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->᩸:Ljava/lang/Integer;

    return-object p0
.end method

.method public final textSize(F)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 81
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->᩹:Ljava/lang/Float;

    return-object p0
.end method

.method public final textStyle(ZZ)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 116
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 p2, 0x3

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    .line 118
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    return-object p0

    :cond_1
    if-eqz p2, :cond_2

    .line 120
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    const/4 p2, 0x2

    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    iput-object p1, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    return-object p0

    .line 122
    :cond_2
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    iput-object p1, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public final typeface(Landroid/graphics/Typeface;)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    .line 139
    iput-object p1, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public final typeface(Landroid/graphics/Typeface;I)Lbin/mt/plugin/api/ui/builder/PluginUIBuilder;
    .locals 0

    if-lez p2, :cond_1

    if-nez p1, :cond_0

    .line 147
    invoke-static {p2}, Landroid/graphics/Typeface;->defaultFromStyle(I)Landroid/graphics/Typeface;

    move-result-object p1

    goto :goto_0

    .line 149
    :cond_0
    invoke-static {p1, p2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object p1

    .line 152
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    return-object p0
.end method

.method public bridge synthetic ֫(Ll/۟ۜ᩷;)V
    .locals 0

    .line 17
    check-cast p1, Ll/ۤۜ᩷;

    invoke-virtual {p0, p1}, Ll/᩷᩷᩷;->֫(Ll/ۤۜ᩷;)V

    return-void
.end method

.method public ֫(Ll/ۤۜ᩷;)V
    .locals 2

    .line 37
    invoke-super {p0, p1}, Ll/ۢ᩷᩷;->֫(Ll/۟ۜ᩷;)V

    .line 38
    iget-object v0, p0, Ll/᩷᩷᩷;->۠:Ljava/lang/CharSequence;

    if-eqz v0, :cond_0

    .line 39
    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->ۧ(Ljava/lang/CharSequence;)V

    .line 41
    :cond_0
    iget-object v0, p0, Ll/᩷᩷᩷;->᩹:Ljava/lang/Float;

    if-eqz v0, :cond_1

    .line 42
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setTextSize(F)V

    .line 44
    :cond_1
    iget-object v0, p0, Ll/᩷᩷᩷;->ܶ:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_2

    .line 45
    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 47
    :cond_2
    iget-object v0, p0, Ll/᩷᩷᩷;->᩸:Ljava/lang/Integer;

    if-eqz v0, :cond_3

    .line 48
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setGravity(I)V

    .line 50
    :cond_3
    iget-object v0, p0, Ll/᩷᩷᩷;->ۙ:Landroid/graphics/Typeface;

    if-eqz v0, :cond_4

    .line 51
    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setTypeface(Landroid/graphics/Typeface;)V

    .line 53
    :cond_4
    iget-object v0, p0, Ll/᩷᩷᩷;->ᩴ:Ljava/lang/Float;

    if-eqz v0, :cond_5

    iget-object v1, p0, Ll/᩷᩷᩷;->᩵:Ljava/lang/Float;

    if-eqz v1, :cond_5

    .line 54
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v1, p0, Ll/᩷᩷᩷;->᩵:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    invoke-virtual {p1, v0, v1}, Ll/ۤۜ᩷;->setLineSpacing(FF)V

    .line 56
    :cond_5
    iget-object v0, p0, Ll/᩷᩷᩷;->֨:Ljava/lang/Boolean;

    if-eqz v0, :cond_6

    .line 57
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setSingleLine(Z)V

    .line 59
    :cond_6
    iget-object v0, p0, Ll/᩷᩷᩷;->֡:Ljava/lang/Integer;

    if-eqz v0, :cond_7

    .line 60
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setMaxLines(I)V

    .line 62
    :cond_7
    iget-object v0, p0, Ll/᩷᩷᩷;->ۚ:Ljava/lang/Integer;

    if-eqz v0, :cond_8

    .line 63
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setMinLines(I)V

    .line 65
    :cond_8
    iget-object v0, p0, Ll/᩷᩷᩷;->᩶:Landroid/text/TextUtils$TruncateAt;

    if-eqz v0, :cond_9

    .line 66
    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 68
    :cond_9
    iget-object v0, p0, Ll/᩷᩷᩷;->ۘ:Ljava/lang/Boolean;

    if-eqz v0, :cond_a

    .line 69
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p1, v0}, Ll/ۤۜ᩷;->setAllCaps(Z)V

    :cond_a
    return-void
.end method
