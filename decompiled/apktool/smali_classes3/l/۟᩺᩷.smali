.class public final Ll/۟᩺᩷;
.super Ljava/lang/Object;
.source "F1E5"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ֫֫:Landroid/widget/CheckBox;

.field public final ۗ:Landroid/widget/CheckBox;

.field public ۙ:Ll/֡ۚۢ;

.field public final ۛ:Ll/۫ۤۡ;

.field public ۟:Ljava/lang/String;

.field public final ۤ:Landroid/widget/CheckBox;

.field public final ۧ֫:Landroid/widget/Spinner;

.field public final ۨ:Ll/ۤۤᩳ;

.field public final ۫:Landroid/widget/CheckBox;

.field public ۬:Ljava/util/Set;

.field public ܰ:Z

.field public final ܽ֫:Landroid/view/View;

.field public final ᩳ֫:Ll/ۘۛ᩷;

.field public final ᩶:Ll/ۚۖۡ;

.field public final ᩸:Ll/ܿۛ᩷;

.field public ᩹:Ll/᩺᩺᩷;

.field public final ᩺:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;Ljava/lang/String;)V
    .locals 15

    move-object v6, p0

    move-object/from16 v0, p2

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iput-object v7, v6, Ll/۟᩺᩷;->ۛ:Ll/۫ۤۡ;

    .line 64
    invoke-virtual/range {p1 .. p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩷;

    iput-object v1, v6, Ll/۟᩺᩷;->᩸:Ll/ܿۛ᩷;

    .line 65
    new-instance v2, Ll/ۙܺ֫;

    invoke-direct {v2, v1}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v3, Ll/ۘۛ᩷;

    invoke-virtual {v2, v3}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object v2

    check-cast v2, Ll/ۘۛ᩷;

    iput-object v2, v6, Ll/۟᩺᩷;->ᩳ֫:Ll/ۘۛ᩷;

    const v2, 0x7f0d0086

    .line 66
    invoke-virtual {v1, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v6, Ll/۟᩺᩷;->ܽ֫:Landroid/view/View;

    const v2, 0x7f0a017d

    .line 67
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۚۖۡ;

    iput-object v2, v6, Ll/۟᩺᩷;->᩶:Ll/ۚۖۡ;

    .line 68
    invoke-static {}, Ll/ۖۛ᩷;->ۧ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 248
    invoke-virtual {v2, v3, v4}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const v2, 0x7f0a017e

    .line 69
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۤۤᩳ;

    iput-object v2, v6, Ll/۟᩺᩷;->ۨ:Ll/ۤۤᩳ;

    const v3, 0x7f0a0551

    .line 70
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Landroid/widget/Spinner;

    iput-object v8, v6, Ll/۟᩺᩷;->ۧ֫:Landroid/widget/Spinner;

    const v3, 0x7f0a00e0

    .line 71
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/widget/CheckBox;

    iput-object v9, v6, Ll/۟᩺᩷;->֫֫:Landroid/widget/CheckBox;

    const v3, 0x7f0a00da

    .line 72
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/widget/CheckBox;

    iput-object v10, v6, Ll/۟᩺᩷;->ۤ:Landroid/widget/CheckBox;

    const v3, 0x7f0a00de

    .line 73
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Landroid/widget/CheckBox;

    iput-object v11, v6, Ll/۟᩺᩷;->᩺:Landroid/widget/CheckBox;

    const v3, 0x7f0a00df

    .line 74
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Landroid/widget/CheckBox;

    iput-object v12, v6, Ll/۟᩺᩷;->۫:Landroid/widget/CheckBox;

    const v3, 0x7f0a00e1

    .line 75
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/widget/CheckBox;

    iput-object v13, v6, Ll/۟᩺᩷;->ۗ:Landroid/widget/CheckBox;

    const-string v1, "/"

    if-eqz v0, :cond_2

    .line 99
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 101
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 77
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    const-string v0, "arsc_search_path"

    .line 79
    invoke-interface {v7, v0, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 99
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 101
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v1, v0

    .line 79
    :cond_5
    :goto_1
    invoke-virtual {v2, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    :goto_2
    const-string v0, "arsc_search_type"

    const/4 v14, 0x0

    .line 80
    invoke-interface {v7, v0, v14}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v8, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 81
    invoke-virtual {v8}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v3

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Ll/۟᩺᩷;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 82
    invoke-virtual {v8, p0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const-string v0, "dex_search_sub"

    const/4 v1, 0x1

    .line 83
    invoke-interface {v7, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v9, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_match_case"

    .line 84
    invoke-interface {v7, v0, v14}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v10, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_regex"

    .line 85
    invoke-interface {v7, v0, v14}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v11, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_hex"

    .line 86
    invoke-interface {v7, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_exactly_match"

    .line 87
    invoke-interface {v7, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v13, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 261
    new-instance v0, Ll/᩺᩺᩷;

    invoke-direct {v0, p0}, Ll/᩺᩺᩷;-><init>(Ljava/lang/Object;)V

    .line 88
    iput-object v0, v6, Ll/۟᩺᩷;->᩹:Ll/᩺᩺᩷;

    .line 89
    invoke-direct {p0}, Ll/۟᩺᩷;->ۧ()V

    .line 90
    new-instance v0, Ll/ۨ᩺᩷;

    invoke-direct {v0, p0}, Ll/ۨ᩺᩷;-><init>(Ll/۟᩺᩷;)V

    invoke-virtual {v11, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/۟᩺᩷;)V
    .locals 0

    .line 90
    invoke-direct {p0}, Ll/۟᩺᩷;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/۟᩺᩷;)Ll/ܿۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩺᩷;->᩸:Ll/ܿۛ᩷;

    return-object p0
.end method

.method private ۧ()V
    .locals 2

    .line 94
    iget-object v0, p0, Ll/۟᩺᩷;->᩺:Landroid/widget/CheckBox;

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

    .line 95
    :goto_0
    iget-object v1, p0, Ll/۟᩺᩷;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v1, v0}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/۟᩺᩷;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/۟᩺᩷;->ܰ:Z

    return p0
.end method

.method public static bridge synthetic ᩳ(Ll/۟᩺᩷;)Ll/ۘۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۟᩺᩷;->ᩳ֫:Ll/ۘۛ᩷;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 13

    .line 176
    iget-object p1, p0, Ll/۟᩺᩷;->᩶:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 177
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 178
    iget-object p1, p0, Ll/۟᩺᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 182
    :cond_0
    iget-object v0, p0, Ll/۟᩺᩷;->ۨ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 183
    iget-object v1, p0, Ll/۟᩺᩷;->ۧ֫:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v5

    .line 184
    iget-object v1, p0, Ll/۟᩺᩷;->֫֫:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    .line 185
    iget-object v1, p0, Ll/۟᩺᩷;->ۤ:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v7

    .line 186
    iget-object v1, p0, Ll/۟᩺᩷;->᩺:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v8

    .line 187
    iget-object v1, p0, Ll/۟᩺᩷;->۫:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    .line 188
    iget-object v3, p0, Ll/۟᩺᩷;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v9

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v5, :cond_9

    const/4 v10, 0x2

    const v11, 0x7f120b48

    if-eq v5, v4, :cond_4

    if-eq v5, v10, :cond_9

    const/4 v12, 0x3

    if-eq v5, v12, :cond_4

    const/4 v10, 0x4

    if-eq v5, v10, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v10, "#"

    .line 227
    invoke-virtual {v2, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_2

    .line 229
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/ۢ᩺ۡ;->ܽ(Ljava/lang/String;)Z

    move-result v10

    :cond_2
    if-nez v10, :cond_3

    .line 232
    invoke-static {v11}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, " (#RRGGBB, #AARRGGBB...)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 233
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 236
    :cond_3
    invoke-virtual {v2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Ll/ۢ᩺ۡ;->᩷(Ljava/lang/String;)I

    move-result v10

    goto :goto_3

    :cond_4
    if-eqz v1, :cond_8

    const-string v12, "0x"

    .line 207
    invoke-virtual {v2, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_6

    const-string v12, "0X"

    invoke-virtual {v2, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_0

    :cond_5
    move-object v10, v2

    goto :goto_1

    .line 208
    :cond_6
    :goto_0
    invoke-virtual {v2, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    .line 209
    :goto_1
    invoke-static {v10}, Ll/ۢ᩺ۡ;->ܿ(Ljava/lang/String;)Z

    move-result v12

    if-nez v12, :cond_7

    .line 210
    invoke-static {v11}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 211
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 214
    :cond_7
    invoke-static {v10}, Ll/ۢ᩺ۡ;->ۜ(Ljava/lang/String;)I

    move-result v10

    goto :goto_3

    .line 217
    :cond_8
    :try_start_0
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v10
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 220
    :catch_0
    invoke-static {v11}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 221
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_9
    if-eqz v8, :cond_a

    .line 194
    :try_start_1
    invoke-static {v2}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    .line 197
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 198
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_a
    :goto_2
    const/4 v10, 0x0

    .line 239
    :goto_3
    invoke-virtual {p1}, Ll/ۚۖۡ;->ܳ()V

    .line 240
    iget-object p1, p0, Ll/۟᩺᩷;->ۛ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    .line 241
    iget-boolean v11, p0, Ll/۟᩺᩷;->ܰ:Z

    if-nez v11, :cond_b

    const-string v11, "arsc_search_path"

    .line 242
    invoke-interface {p1, v11, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    :cond_b
    const-string v11, "arsc_search_type"

    .line 243
    invoke-interface {p1, v5, v11}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object p1

    const-string v11, "dex_search_sub"

    .line 244
    invoke-interface {p1, v11, v6}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v11, "dex_search_match_case"

    .line 245
    invoke-interface {p1, v11, v7}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v11, "dex_search_regex"

    .line 246
    invoke-interface {p1, v11, v8}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v11, "dex_search_hex"

    .line 247
    invoke-interface {p1, v11, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v1, "dex_search_exactly_match"

    .line 248
    invoke-interface {p1, v1, v9}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    .line 249
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 250
    iget-object p1, p0, Ll/۟᩺᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 251
    iget-object p1, p0, Ll/۟᩺᩷;->᩹:Ll/᩺᩺᩷;

    iget-object p1, p1, Ll/᩺᩺᩷;->᩸:Ljava/lang/Object;

    check-cast p1, Ll/۟᩺᩷;

    .line 262
    iget-object v1, p1, Ll/۟᩺᩷;->ᩳ֫:Ll/ۘۛ᩷;

    invoke-virtual {v1}, Ll/ۘۛ᩷;->ܳ()Ll/ۚۡ֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩵ۨ᩷;

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    new-instance v11, Ll/᩺ۤܿ;

    iget-object v12, p1, Ll/۟᩺᩷;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v11, v12}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v12, 0x7f12090c

    .line 264
    invoke-virtual {v11, v12}, Ll/᩺ۤܿ;->ܽ(I)V

    .line 265
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    new-array v4, v4, [Ljava/lang/Object;

    aput-object v12, v4, v3

    const v3, 0x7f120202

    invoke-static {v3, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v3, 0x0

    .line 65
    invoke-virtual {v11, v3}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 266
    invoke-virtual {v11}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    const/4 v3, 0x1

    .line 267
    new-instance v12, Ll/ܰ᩺᩷;

    invoke-direct {v12, p1, v11}, Ll/ܰ᩺᩷;-><init>(Ll/۟᩺᩷;Ll/᩺ۤܿ;)V

    .line 309
    iget-boolean v4, p1, Ll/۟᩺᩷;->ܰ:Z

    const-string v11, "/"

    if-eqz v4, :cond_e

    .line 310
    iget-object v0, p1, Ll/۟᩺᩷;->۟:Ljava/lang/String;

    .line 107
    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 108
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    .line 109
    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_d

    invoke-virtual {v0, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_d

    .line 110
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_d
    :goto_4
    move-object v3, v0

    const/4 v6, 0x1

    .line 310
    iget-object v11, p1, Ll/۟᩺᩷;->۬:Ljava/util/Set;

    move v4, v10

    move-object v10, v12

    invoke-static/range {v1 .. v11}, Ll/ܺ᩺᩷;->֫(Ll/᩵ۨ᩷;Ljava/lang/String;Ljava/lang/String;IIZZZZLl/ۙۛ᩷;Ljava/util/Set;)V

    return-void

    .line 107
    :cond_e
    invoke-virtual {v0, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_f

    .line 108
    invoke-virtual {v0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    :goto_5
    move-object v3, p1

    goto :goto_6

    .line 109
    :cond_f
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_10

    invoke-virtual {v0, v11}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_10

    .line 110
    invoke-virtual {v0, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_5

    :cond_10
    move-object v3, v0

    :goto_6
    const/4 v11, 0x0

    move v4, v10

    move-object v10, v12

    .line 313
    invoke-static/range {v1 .. v11}, Ll/ܺ᩺᩷;->֫(Ll/᩵ۨ᩷;Ljava/lang/String;Ljava/lang/String;IIZZZZLl/ۙۛ᩷;Ljava/util/Set;)V

    return-void
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    const/4 p1, 0x1

    const/4 p2, 0x2

    const/4 p4, 0x0

    if-eqz p3, :cond_1

    if-ne p3, p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p5, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p5, 0x1

    .line 138
    :goto_1
    iget-object v0, p0, Ll/۟᩺᩷;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v0, p5}, Ll/ۚۖۡ;->֫(Z)V

    .line 139
    iget-object p5, p0, Ll/۟᩺᩷;->ۗ:Landroid/widget/CheckBox;

    iget-object v0, p0, Ll/۟᩺᩷;->۫:Landroid/widget/CheckBox;

    iget-object v1, p0, Ll/۟᩺᩷;->᩺:Landroid/widget/CheckBox;

    iget-object v2, p0, Ll/۟᩺᩷;->ۤ:Landroid/widget/CheckBox;

    const/16 v3, 0x8

    if-eqz p3, :cond_5

    if-eq p3, p1, :cond_4

    if-eq p3, p2, :cond_3

    const/4 p1, 0x3

    if-eq p3, p1, :cond_4

    const/4 p1, 0x4

    if-eq p3, p1, :cond_2

    goto :goto_2

    .line 160
    :cond_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 161
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 162
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 163
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 154
    :cond_3
    invoke-virtual {v2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 155
    invoke-virtual {v1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 156
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 157
    invoke-virtual {p5, p4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 148
    :cond_4
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 149
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 150
    invoke-virtual {v0, p4}, Landroid/view/View;->setVisibility(I)V

    .line 151
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 141
    :cond_5
    invoke-virtual {v2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 142
    invoke-virtual {v1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 143
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 144
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 166
    :goto_2
    invoke-direct {p0}, Ll/۟᩺᩷;->ۧ()V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 4

    .line 125
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    iget-object v1, p0, Ll/۟᩺᩷;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v0, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 125
    iget-object v1, p0, Ll/۟᩺᩷;->ܽ֫:Landroid/view/View;

    .line 126
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 v1, 0x0

    const v2, 0x7f12015e

    const v3, 0x7f12070a

    .line 0
    invoke-static {v0, v3, v1, v2, v1}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    .line 129
    iput-object v0, p0, Ll/۟᩺᩷;->ۙ:Ll/֡ۚۢ;

    .line 130
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    .line 131
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 132
    iget-object v0, p0, Ll/۟᩺᩷;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 133
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ll/֨ۛ᩷;)V
    .locals 2

    const/4 v0, 0x1

    .line 115
    iput-boolean v0, p0, Ll/۟᩺᩷;->ܰ:Z

    .line 116
    invoke-virtual {p1}, Ll/֨ۛ᩷;->֫()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/۟᩺᩷;->۬:Ljava/util/Set;

    .line 117
    invoke-virtual {p1}, Ll/֨ۛ᩷;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩺᩷;->۟:Ljava/lang/String;

    .line 118
    iget-object p1, p0, Ll/۟᩺᩷;->֫֫:Landroid/widget/CheckBox;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f12020e

    .line 493
    iget-object v0, p0, Ll/۟᩺᩷;->ۨ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 120
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
