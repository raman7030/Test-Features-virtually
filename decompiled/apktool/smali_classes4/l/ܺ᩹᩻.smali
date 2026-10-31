.class public abstract Ll/ܺ᩹᩻;
.super Ljava/lang/Object;
.source "35GV"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۗ:Ljava/util/List;

.field public final ۙ:Ll/ܶ᩵ܿ;

.field public final ۛ:Landroid/widget/CheckBox;

.field public final ۤ:Landroid/widget/CheckBox;

.field public final ۨ:Landroid/widget/Spinner;

.field public final ۫:Landroid/widget/CheckBox;

.field public final ۬:Landroid/widget/CheckBox;

.field public final ᩶:Landroid/widget/CheckBox;

.field public final ᩸:Ll/ۚۖۡ;

.field public final ᩹:Ll/֡ۚۢ;

.field public final ᩺:Ll/ܽۢܳ;


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;Ll/ܶ᩵ܿ;Ljava/util/List;Ljava/lang/Runnable;)V
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v0, p3

    move-object/from16 v7, p4

    .line 64
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v8, p1

    .line 65
    iput-object v8, v6, Ll/ܺ᩹᩻;->᩺:Ll/ܽۢܳ;

    move-object/from16 v1, p2

    .line 66
    iput-object v1, v6, Ll/ܺ᩹᩻;->ۙ:Ll/ܶ᩵ܿ;

    .line 67
    iput-object v0, v6, Ll/ܺ᩹᩻;->ۗ:Ljava/util/List;

    .line 68
    invoke-virtual/range {p1 .. p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const v2, 0x7f0d008a

    invoke-virtual {v1, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v9

    if-eqz v0, :cond_0

    const v0, 0x7f0a0631

    .line 70
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f12090f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    const v0, 0x7f0a04b1

    .line 72
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a017e

    .line 73
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const v0, 0x7f0a017d

    .line 74
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۚۖۡ;

    iput-object v0, v6, Ll/ܺ᩹᩻;->᩸:Ll/ۚۖۡ;

    const v0, 0x7f0a0551

    .line 75
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Landroid/widget/Spinner;

    iput-object v10, v6, Ll/ܺ᩹᩻;->ۨ:Landroid/widget/Spinner;

    const v0, 0x7f0a00da

    .line 76
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Landroid/widget/CheckBox;

    iput-object v11, v6, Ll/ܺ᩹᩻;->ۤ:Landroid/widget/CheckBox;

    const v0, 0x7f0a00de

    .line 77
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Landroid/widget/CheckBox;

    iput-object v12, v6, Ll/ܺ᩹᩻;->ۛ:Landroid/widget/CheckBox;

    const v0, 0x7f0a00df

    .line 78
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Landroid/widget/CheckBox;

    iput-object v13, v6, Ll/ܺ᩹᩻;->۬:Landroid/widget/CheckBox;

    const v0, 0x7f0a00e0

    .line 79
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Landroid/widget/CheckBox;

    iput-object v14, v6, Ll/ܺ᩹᩻;->۫:Landroid/widget/CheckBox;

    const v0, 0x7f0a00e1

    .line 80
    invoke-virtual {v9, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v15, v0

    check-cast v15, Landroid/widget/CheckBox;

    iput-object v15, v6, Ll/ܺ᩹᩻;->᩶:Landroid/widget/CheckBox;

    .line 82
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_search_type"

    const/4 v4, 0x0

    invoke-interface {v0, v1, v4}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 83
    invoke-virtual {v10}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v3

    const-wide/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, p0

    const/4 v8, 0x0

    move-wide/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Ll/ܺ᩹᩻;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 84
    invoke-virtual {v10, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 85
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_search_match_case"

    invoke-interface {v0, v1, v8}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v11, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 86
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_search_regex"

    invoke-interface {v0, v1, v8}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 87
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_search_hex"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v13, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 88
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_search_id2name"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v14, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 89
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "axml_search_exactly_match"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v15, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 90
    new-instance v0, Ll/֫ۙܽ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v6}, Ll/֫ۙܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v12, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 91
    invoke-direct/range {p0 .. p0}, Ll/ܺ᩹᩻;->ۧ()V

    .line 93
    invoke-virtual/range {p1 .. p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 94
    invoke-virtual {v0, v9}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f12070a

    const/4 v2, 0x0

    .line 95
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/᩻᩹᩻;

    invoke-direct {v1, v7}, Ll/᩻᩹᩻;-><init>(Ljava/lang/Runnable;)V

    const v3, 0x7f12015e

    .line 96
    invoke-virtual {v0, v3, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f1205fa

    .line 101
    invoke-virtual {v0, v1, v2}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/ۜ᩹᩻;

    invoke-direct {v1, v7}, Ll/ۜ᩹᩻;-><init>(Ljava/lang/Runnable;)V

    .line 102
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 107
    invoke-virtual {v0}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object v0

    iput-object v0, v6, Ll/ܺ᩹᩻;->᩹:Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܺ᩹᩻;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ll/ܺ᩹᩻;->ۧ()V

    return-void
.end method

.method private ۧ()V
    .locals 2

    .line 111
    iget-object v0, p0, Ll/ܺ᩹᩻;->ۛ:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 112
    :goto_0
    iget-object v1, p0, Ll/ܺ᩹᩻;->᩸:Ll/ۚۖۡ;

    invoke-virtual {v1, v0}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method

.method public static ۧ(Ll/ܺ᩹᩻;)V
    .locals 3

    .line 118
    iget-object p0, p0, Ll/ܺ᩹᩻;->᩺:Ll/ܽۢܳ;

    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p0

    const v0, 0x7f120111

    const/4 v1, 0x0

    const v2, 0x7f120491

    .line 415
    invoke-virtual {p0, v2, v0, v1}, Ll/ۗܺ᩷;->֫(IIZ)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܺ᩹᩻;)Ll/ܶ᩵ܿ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩹᩻;->ۙ:Ll/ܶ᩵ܿ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܺ᩹᩻;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩹᩻;->᩺:Ll/ܽۢܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܺ᩹᩻;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩹᩻;->ۗ:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 125
    iget-object p1, p0, Ll/ܺ᩹᩻;->᩸:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Ll/ܺ᩹᩻;->᩹:Ll/֡ۚۢ;

    if-eqz v1, :cond_0

    .line 127
    invoke-virtual {v2}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 130
    :cond_0
    iget-object v1, p0, Ll/ܺ᩹᩻;->ۨ:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v5

    const/4 v1, 0x0

    if-nez v5, :cond_1

    .line 131
    invoke-static {}, Ll/᩺᩵ۡ;->ۘ()Z

    move-result v3

    if-nez v3, :cond_1

    .line 132
    iget-object p1, p0, Ll/ܺ᩹᩻;->᩺:Ll/ܽۢܳ;

    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    const v0, 0x7f120491

    const v2, 0x7f120113

    .line 415
    invoke-virtual {p1, v0, v2, v1}, Ll/ۗܺ᩷;->֫(IIZ)V

    return-void

    .line 137
    :cond_1
    iget-object v1, p0, Ll/ܺ᩹᩻;->ۤ:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    .line 138
    iget-object v3, p0, Ll/ܺ᩹᩻;->ۛ:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    .line 139
    iget-object v4, p0, Ll/ܺ᩹᩻;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    .line 140
    iget-object v6, p0, Ll/ܺ᩹᩻;->۫:Landroid/widget/CheckBox;

    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v9

    .line 141
    iget-object v6, p0, Ll/ܺ᩹᩻;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v7

    if-eqz v5, :cond_a

    const/4 v6, 0x1

    if-eq v5, v6, :cond_a

    const/4 v8, 0x2

    const v10, 0x7f120b48

    const/4 v11, 0x0

    if-eq v5, v8, :cond_5

    const/4 v12, 0x3

    if-eq v5, v12, :cond_2

    const/4 v6, 0x4

    if-eq v5, v6, :cond_5

    goto :goto_1

    :cond_2
    const-string v8, "#"

    .line 178
    invoke-virtual {v0, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 180
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;)Z

    move-result v8

    :cond_3
    if-nez v8, :cond_4

    .line 183
    invoke-static {v10}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " (#RRGGBB, #AARRGGBB...)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 184
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 187
    :cond_4
    invoke-virtual {v0, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۢ᩺ۡ;->᩷(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_5
    if-eqz v4, :cond_9

    const-string v6, "0x"

    .line 158
    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, "0X"

    invoke-virtual {v0, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 159
    :cond_6
    invoke-virtual {v0, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 160
    :cond_7
    invoke-static {v0}, Ll/ۢ᩺ۡ;->ܿ(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_8

    .line 161
    invoke-static {v10}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 162
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 165
    :cond_8
    invoke-static {v0}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    .line 168
    :cond_9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move v8, v0

    move-object v6, v11

    goto :goto_2

    .line 171
    :catch_0
    invoke-static {v10}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 172
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 146
    :cond_a
    :try_start_1
    invoke-static {v0, v3, v1}, Ll/ۗۛ᩷;->ۧ(Ljava/lang/String;ZZ)Ll/ۨۘܽ;

    move-result-object v0

    const-string v6, ""

    invoke-virtual {v0, v6}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v11
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_1
    const/4 v0, 0x0

    move-object v6, v11

    const/4 v8, 0x0

    .line 190
    :goto_2
    invoke-virtual {p1}, Ll/ۚۖۡ;->ܳ()V

    .line 191
    sget-object p1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "axml_search_type"

    .line 192
    invoke-interface {p1, v5, v0}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "axml_search_match_case"

    .line 193
    invoke-interface {p1, v0, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "axml_search_regex"

    .line 194
    invoke-interface {p1, v0, v3}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "axml_search_hex"

    .line 195
    invoke-interface {p1, v0, v4}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "axml_search_id2name"

    .line 196
    invoke-interface {p1, v0, v9}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "axml_search_exactly_match"

    .line 197
    invoke-interface {p1, v0, v7}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    .line 198
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 199
    invoke-virtual {v2}, Ll/֡ۚۢ;->dismiss()V

    .line 203
    new-instance p1, Ll/ۡ᩹᩻;

    move-object v3, p1

    move-object v4, p0

    invoke-direct/range {v3 .. v9}, Ll/ۡ᩹᩻;-><init>(Ll/ܺ᩹᩻;ILl/۫ۘܽ;ZIZ)V

    .line 342
    invoke-virtual {p1}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_1
    move-exception v0

    .line 149
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 150
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    const/4 p1, 0x1

    const/4 p2, 0x0

    if-eqz p3, :cond_1

    if-ne p3, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p4, 0x1

    .line 347
    :goto_1
    iget-object p5, p0, Ll/ܺ᩹᩻;->᩸:Ll/ۚۖۡ;

    invoke-virtual {p5, p4}, Ll/ۚۖۡ;->֫(Z)V

    .line 348
    iget-object p4, p0, Ll/ܺ᩹᩻;->᩶:Landroid/widget/CheckBox;

    iget-object p5, p0, Ll/ܺ᩹᩻;->۫:Landroid/widget/CheckBox;

    iget-object v0, p0, Ll/ܺ᩹᩻;->۬:Landroid/widget/CheckBox;

    iget-object v1, p0, Ll/ܺ᩹᩻;->ۛ:Landroid/widget/CheckBox;

    iget-object v2, p0, Ll/ܺ᩹᩻;->ۤ:Landroid/widget/CheckBox;

    const/16 v3, 0x8

    if-eqz p3, :cond_5

    if-eq p3, p1, :cond_4

    const/4 p1, 0x2

    if-eq p3, p1, :cond_3

    const/4 p1, 0x3

    if-eq p3, p1, :cond_2

    const/4 p1, 0x4

    if-eq p3, p1, :cond_3

    goto :goto_2

    .line 372
    :cond_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 373
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 374
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 375
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 376
    invoke-virtual {p4, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 351
    :cond_3
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 352
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 353
    invoke-virtual {v0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 354
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 355
    invoke-virtual {p4, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 365
    :cond_4
    invoke-virtual {v2, p2}, Landroid/view/View;->setVisibility(I)V

    .line 366
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 367
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 368
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 369
    invoke-virtual {p4, p2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 358
    :cond_5
    invoke-virtual {v2, p2}, Landroid/view/View;->setVisibility(I)V

    .line 359
    invoke-virtual {v1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 360
    invoke-virtual {p5, p2}, Landroid/view/View;->setVisibility(I)V

    .line 361
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 362
    invoke-virtual {p4, v3}, Landroid/view/View;->setVisibility(I)V

    .line 379
    :goto_2
    invoke-direct {p0}, Ll/ܺ᩹᩻;->ۧ()V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 116
    iget-object v0, p0, Ll/ܺ᩹᩻;->᩹:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->᩷()V

    .line 117
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 118
    invoke-virtual {v0}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v1, Ll/ܽܶۜ;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/ܽܶۜ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 119
    iget-object v0, p0, Ll/ܺ᩹᩻;->᩸:Ll/ۚۖۡ;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 120
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method
