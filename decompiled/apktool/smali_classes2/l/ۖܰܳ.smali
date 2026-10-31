.class public final Ll/ۖܰܳ;
.super Ll/֫ۜܳ;
.source "A1YB"


# direct methods
.method public constructor <init>()V
    .locals 2

    const v0, 0x7f1205d7

    const v1, 0x7f080250

    .line 77
    invoke-direct {p0, v0, v1}, Ll/֫ۜܳ;-><init>(II)V

    return-void
.end method

.method public static ֫(Ll/ۖۢܳ;Ljava/lang/String;IZZZ)V
    .locals 2

    .line 135
    sget v0, Ll/ܶ۠ۢ;->֫:I

    .line 268
    new-instance v0, Ll/֨۠ۢ;

    const-class v1, Ll/ܺܰܳ;

    invoke-direct {v0, v1}, Ll/֨۠ۢ;-><init>(Ljava/lang/Class;)V

    .line 136
    invoke-virtual {p0}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/֨۠ۢ;->֫(Ljava/util/List;)V

    const-string v1, "extractDir"

    .line 137
    invoke-virtual {v0, v1, p1}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "separateFolder"

    .line 138
    invoke-virtual {v0, p1, p3}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    const-string p1, "relativeNameSubStart"

    .line 139
    invoke-virtual {v0, p2, p1}, Ll/֨۠ۢ;->֫(ILjava/lang/String;)V

    const-string p1, "extractToAnother"

    .line 140
    invoke-virtual {v0, p1, p4}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    const-string p1, "deleteSources"

    .line 141
    invoke-virtual {v0, p1, p5}, Ll/֨۠ۢ;->֫(Ljava/lang/String;Z)V

    if-eqz p4, :cond_0

    .line 143
    invoke-virtual {v0, p0}, Ll/֨۠ۢ;->֫(Ll/ۖۢܳ;)V

    goto :goto_0

    .line 145
    :cond_0
    invoke-virtual {v0, p0}, Ll/֨۠ۢ;->ܽ(Ll/ۖۢܳ;)V

    .line 147
    :goto_0
    invoke-virtual {v0}, Ll/֨۠ۢ;->֫()I

    return-void
.end method

.method public static synthetic ֫(Ll/ۖܰܳ;ZLandroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ܽۢܳ;Ll/ۖۢܳ;Landroid/widget/RadioButton;Ll/֡ۚۢ;Landroid/widget/RadioButton;Landroid/widget/EditText;)V
    .locals 1

    if-eqz p1, :cond_0

    .line 113
    invoke-virtual {p2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    .line 114
    :goto_0
    invoke-virtual {p3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v0

    if-eqz p0, :cond_1

    .line 115
    invoke-virtual {p4}, Ll/ܽۢܳ;->ۚ()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-virtual {p5}, Ll/ۖۢܳ;->᩷()Ljava/lang/String;

    move-result-object p1

    :goto_1
    move-object p2, p1

    .line 116
    invoke-virtual {p6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 117
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    const/4 p4, 0x0

    move-object p1, p5

    move p5, p0

    move p6, v0

    invoke-static/range {p1 .. p6}, Ll/ۖܰܳ;->֫(Ll/ۖۢܳ;Ljava/lang/String;IZZZ)V

    .line 118
    invoke-virtual {p7}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 119
    :cond_2
    invoke-virtual {p8}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 120
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p3

    const/4 p4, 0x1

    move-object p1, p5

    move p5, p0

    move p6, v0

    invoke-static/range {p1 .. p6}, Ll/ۖܰܳ;->֫(Ll/ۖۢܳ;Ljava/lang/String;IZZZ)V

    .line 121
    invoke-virtual {p7}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 123
    :cond_3
    invoke-virtual {p9}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    const-string p3, "\\"

    .line 124
    invoke-virtual {p1, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "/"

    invoke-virtual {p1, p3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p3

    if-nez p3, :cond_5

    const-string p3, "//"

    invoke-virtual {p1, p3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_4

    goto :goto_2

    .line 127
    :cond_4
    invoke-virtual {p7}, Ll/֡ۚۢ;->dismiss()V

    .line 128
    invoke-static {p2, p1}, Ll/ۢۤۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p4

    const/4 p6, 0x0

    move-object p1, p5

    move-object p2, p3

    move p3, p4

    move p4, p6

    move p5, p0

    move p6, v0

    invoke-static/range {p1 .. p6}, Ll/ۖܰܳ;->֫(Ll/ۖۢܳ;Ljava/lang/String;IZZZ)V

    return-void

    :cond_5
    :goto_2
    const p0, 0x7f1203ae

    .line 125
    invoke-static {p0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void
.end method


# virtual methods
.method public final ܽ(Ll/ۖۢܳ;)V
    .locals 14

    const-string v0, "local"

    .line 83
    invoke-virtual {p1, v0}, Ll/ۖۢܳ;->֫(Ljava/lang/String;)V

    .line 84
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܽ()Ll/ܽۢܳ;

    move-result-object v6

    .line 85
    invoke-virtual {v6}, Ll/ܽۢܳ;->۫()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    invoke-virtual {v6, v0}, Ll/ܽۢܳ;->ۧ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    const/4 v3, 0x1

    :cond_0
    const/4 v0, 0x0

    .line 86
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v1

    const v4, 0x7f0d0104

    invoke-virtual {v1, v4}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v4, 0x7f0a0479

    .line 87
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Landroid/widget/RadioButton;

    const v4, 0x7f0a047a

    .line 88
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/RadioButton;

    const v5, 0x7f0a047b

    .line 89
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Landroid/widget/RadioButton;

    const v5, 0x7f0a017c

    .line 90
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    move-object v11, v5

    check-cast v11, Landroid/widget/EditText;

    const v5, 0x7f0a00d9

    .line 91
    invoke-virtual {v1, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/CheckBox;

    const v7, 0x7f0a00de

    .line 92
    invoke-virtual {v1, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/CheckBox;

    .line 93
    sget-object v9, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v12, "duaw"

    invoke-interface {v9, v12, v0}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    invoke-virtual {v5, v9}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 94
    sget-object v9, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v12, "duds"

    invoke-interface {v9, v12, v0}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v9

    invoke-virtual {v7, v9}, Landroid/widget/CompoundButton;->setChecked(Z)V

    if-nez v3, :cond_1

    const/16 v9, 0x8

    .line 96
    invoke-virtual {v5, v9}, Landroid/view/View;->setVisibility(I)V

    .line 98
    :cond_1
    invoke-static {}, Ll/ۙ᩸᩷;->᩵()Landroid/content/res/Resources;

    move-result-object v9

    const v12, 0x7f110002

    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v13

    invoke-virtual {v9, v12, v13}, Landroid/content/res/Resources;->getQuantityString(II)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    new-instance v9, Ll/᩺᩺ܳ;

    invoke-direct {v9, v11}, Ll/᩺᩺ܳ;-><init>(Landroid/widget/EditText;)V

    invoke-virtual {v4, v9}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 100
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ll/ۖۢܳ;->ۖ()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳۜܳ;

    invoke-interface {v9}, Ll/ᩳۜܳ;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܶ᩵ܿ;->ۧ֫()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v9, 0x2f

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܺ()I

    move-result v4

    if-eq v4, v2, :cond_2

    .line 102
    invoke-virtual {v10, v0}, Landroid/view/View;->setVisibility(I)V

    .line 103
    invoke-virtual {v10, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 105
    :cond_2
    invoke-virtual {p1}, Ll/ۖۢܳ;->ܳ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f12070a

    const/4 v2, 0x0

    .line 106
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f120189

    .line 107
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v9

    .line 108
    new-instance v0, Ll/ܰ᩺ܳ;

    invoke-direct {v0, v5, v7}, Ll/ܰ᩺ܳ;-><init>(Landroid/widget/CheckBox;Landroid/widget/CheckBox;)V

    invoke-virtual {v9, v0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 112
    invoke-virtual {v9}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    new-instance v12, Ll/۟᩺ܳ;

    move-object v1, v12

    move-object v2, p0

    move-object v4, v5

    move-object v5, v7

    move-object v7, p1

    invoke-direct/range {v1 .. v11}, Ll/۟᩺ܳ;-><init>(Ll/ۖܰܳ;ZLandroid/widget/CheckBox;Landroid/widget/CheckBox;Ll/ܽۢܳ;Ll/ۖۢܳ;Landroid/widget/RadioButton;Ll/֡ۚۢ;Landroid/widget/RadioButton;Landroid/widget/EditText;)V

    invoke-virtual {v0, v12}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
