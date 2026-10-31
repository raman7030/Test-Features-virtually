.class public final Ll/֡ᩳ᩻;
.super Ll/֫ۜܳ;
.source "195D"


# direct methods
.method public static ֫(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 4

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    .line 220
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/16 v3, 0xc8

    if-lt v2, v3, :cond_0

    goto :goto_1

    .line 223
    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-lez v2, :cond_1

    const-string v2, ", "

    .line 224
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 226
    :cond_1
    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 228
    :cond_2
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ֫(Landroid/widget/TextView;Ljava/util/ArrayList;)V
    .locals 0

    .line 70
    invoke-static {p1}, Ll/֡ᩳ᩻;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֡ۚۢ;Ll/ۖۢܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Landroid/widget/CheckBox;)V
    .locals 0

    .line 106
    invoke-virtual {p0}, Ll/֡ۚۢ;->dismiss()V

    .line 107
    invoke-virtual {p4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    invoke-static {p1, p2, p3, p0}, Ll/֡ᩳ᩻;->֫(Ll/ۖۢܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Z)V

    return-void
.end method

.method public static ֫(Ll/ۖۢܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Z)V
    .locals 2

    .line 119
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/᩵ᩳ᩻;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 120
    invoke-virtual {v0, p0}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    const-string p0, "file"

    .line 121
    invoke-virtual {p2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p0, p2}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    invoke-virtual {v0, p1}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    const-string p0, "removeSources"

    .line 123
    invoke-virtual {v0, p0, p3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    .line 124
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public static synthetic ֫(Ll/ۤۤᩳ;Ll/᩶ᩳ᩻;Landroid/widget/CheckBox;Ll/ۖۢܳ;Lbin/mt/plus/Main;Ll/֡ۚۢ;Ljava/util/ArrayList;)V
    .locals 7

    .line 92
    invoke-virtual {p0}, Ll/۫ۨᩳ;->᩷ܽ()I

    move-result v0

    if-nez v0, :cond_0

    .line 93
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 96
    :cond_0
    iget-boolean v0, p1, Ll/᩶ᩳ᩻;->᩹:Z

    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eq v0, v1, :cond_1

    .line 97
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    iput-boolean v0, p1, Ll/᩶ᩳ᩻;->᩹:Z

    .line 98
    invoke-virtual {p1}, Ll/᩶ᩳ᩻;->ܽ()V

    .line 100
    :cond_1
    invoke-virtual {p0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 101
    invoke-virtual {p3}, Ll/ۖۢܳ;->᩻()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v5

    .line 102
    invoke-virtual {v5}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 103
    invoke-virtual {p4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {p1, p0}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    const p0, 0x7f1203b7

    .line 104
    invoke-virtual {p1, p0}, Ll/᩵ۚۢ;->֫(I)V

    new-instance p0, Ll/ᩴᩳ᩻;

    move-object v1, p0

    move-object v2, p5

    move-object v3, p3

    move-object v4, p6

    move-object v6, p2

    invoke-direct/range {v1 .. v6}, Ll/ᩴᩳ᩻;-><init>(Ll/֡ۚۢ;Ll/ۖۢܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Landroid/widget/CheckBox;)V

    const p2, 0x7f12070a

    .line 105
    invoke-virtual {p1, p2, p0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p2, 0x0

    .line 109
    invoke-virtual {p1, p0, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 110
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 112
    :cond_2
    invoke-virtual {p5}, Ll/֡ۚۢ;->dismiss()V

    .line 113
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    invoke-static {p3, p6, v5, p0}, Ll/֡ᩳ᩻;->֫(Ll/ۖۢܳ;Ljava/util/ArrayList;Ll/ܶ᩵ܿ;Z)V

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 14

    .line 58
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v5

    .line 59
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v0

    invoke-direct {v7, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 61
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩳۜܳ;

    .line 62
    invoke-interface {v3}, Ll/ᩳۜܳ;->getSize()J

    move-result-wide v3

    add-long/2addr v1, v3

    goto :goto_0

    :cond_0
    const v0, 0x7f0d00ac

    .line 65
    invoke-virtual {v5, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v3, 0x7f0a05da

    .line 66
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a05dd

    .line 67
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v6, 0x7f0a017e

    .line 68
    invoke-virtual {v0, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Ll/ۤۤᩳ;

    const v8, 0x7f0a00d9

    .line 69
    invoke-virtual {v0, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/CheckBox;

    const v9, 0x7f0a0640

    .line 70
    invoke-virtual {v0, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    new-instance v10, Ll/ۖᩳ᩻;

    invoke-direct {v10, v5, v7, v3}, Ll/ۖᩳ᩻;-><init>(Lbin/mt/plus/Main;Ljava/util/ArrayList;Landroid/widget/TextView;)V

    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 72
    new-instance v9, Ll/᩶ᩳ᩻;

    invoke-direct {v9}, Ll/᩶ᩳ᩻;-><init>()V

    .line 73
    invoke-virtual {v9}, Ll/᩶ᩳ᩻;->ۧ()V

    .line 75
    invoke-virtual {v5}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    const/high16 v11, 0x7f110000

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v12

    invoke-virtual {v10, v11, v12}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v8, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 76
    iget-boolean v10, v9, Ll/᩶ᩳ᩻;->᩹:Z

    invoke-virtual {v8, v10}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 77
    invoke-static {v7}, Ll/֡ᩳ᩻;->֫(Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 78
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x1

    new-array v12, v11, [Ljava/lang/Object;

    const/4 v13, 0x0

    aput-object v10, v12, v13

    const v10, 0x7f120b86

    invoke-virtual {v5, v10, v12}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "  "

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1, v2}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 79
    invoke-virtual {v7, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳۜܳ;

    const-string v2, "(.+)\\.\\d+"

    .line 80
    invoke-static {v2}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v2

    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    .line 81
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 82
    invoke-virtual {v2, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    goto :goto_1

    .line 84
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "merged_"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v1}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    .line 86
    :goto_1
    invoke-virtual {v5}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    .line 87
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f12070a

    const/4 v2, 0x0

    .line 88
    invoke-virtual {v1, v0, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v0, 0x7f12015e

    .line 89
    invoke-virtual {v1, v0, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 90
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v10

    .line 91
    invoke-virtual {v10}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v11

    new-instance v12, Ll/ۘᩳ᩻;

    move-object v0, v12

    move-object v1, v6

    move-object v2, v9

    move-object v3, v8

    move-object v4, p1

    move-object v6, v10

    invoke-direct/range {v0 .. v7}, Ll/ۘᩳ᩻;-><init>(Ll/ۤۤᩳ;Ll/᩶ᩳ᩻;Landroid/widget/CheckBox;Ll/ۖۢܳ;Lbin/mt/plus/Main;Ll/֡ۚۢ;Ljava/util/ArrayList;)V

    invoke-virtual {v11, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final ᩳ(Ll/ۖۢܳ;)Z
    .locals 1

    const-string v0, "local"

    .line 46
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 49
    :cond_0
    invoke-virtual {p1}, Ll/ۖۢܳ;->ᩴ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 52
    :cond_1
    invoke-virtual {p1}, Ll/ۖۢܳ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result p1

    const/4 v0, 0x2

    if-lt p1, v0, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method
