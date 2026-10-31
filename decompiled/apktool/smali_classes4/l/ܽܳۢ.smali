.class public final Ll/ܽܳۢ;
.super Ljava/lang/Object;
.source "H5HP"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ֫֫:Z

.field public final ۗ:Landroid/widget/CheckBox;

.field public ۙ:Ll/֡ۚۢ;

.field public final ۛ:Landroid/widget/CheckBox;

.field public final ۟:Landroid/widget/CheckBox;

.field public ۤ:Ljava/util/Set;

.field public ۧ֫:Ljava/lang/String;

.field public final ۨ:Landroid/widget/CheckBox;

.field public final ۫:Landroid/view/View;

.field public final ۬:Landroid/widget/CheckBox;

.field public final ܰ:Ll/ۤۤᩳ;

.field public final ܳ֫:Ll/ۘۛ᩷;

.field public final ܽ֫:Landroid/widget/CheckBox;

.field public final ܿ֫:Landroid/view/View;

.field public final ᩳ֫:Landroid/widget/Spinner;

.field public final ᩶:Ll/ۚۖۡ;

.field public final ᩸:Ll/ܿۛ᩷;

.field public ᩹:Ll/᩶ܽܽ;

.field public final ᩺:Ll/۫ۤۡ;


# direct methods
.method public constructor <init>(Ll/ۡ᩻֫;Ljava/lang/String;)V
    .locals 18

    move-object/from16 v6, p0

    move-object/from16 v0, p2

    .line 75
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 69
    sget-object v7, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iput-object v7, v6, Ll/ܽܳۢ;->᩺:Ll/۫ۤۡ;

    .line 76
    invoke-virtual/range {p1 .. p1}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩷;

    iput-object v1, v6, Ll/ܽܳۢ;->᩸:Ll/ܿۛ᩷;

    .line 77
    new-instance v2, Ll/ۙܺ֫;

    invoke-direct {v2, v1}, Ll/ۙܺ֫;-><init>(Ll/۬ܺ֫;)V

    const-class v3, Ll/ۘۛ᩷;

    invoke-virtual {v2, v3}, Ll/ۙܺ֫;->֫(Ljava/lang/Class;)Ll/ۚܺ֫;

    move-result-object v2

    check-cast v2, Ll/ۘۛ᩷;

    iput-object v2, v6, Ll/ܽܳۢ;->ܳ֫:Ll/ۘۛ᩷;

    const v2, 0x7f0d009b

    .line 78
    invoke-virtual {v1, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, v6, Ll/ܽܳۢ;->ܿ֫:Landroid/view/View;

    const v2, 0x7f0a017d

    .line 79
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۚۖۡ;

    iput-object v2, v6, Ll/ܽܳۢ;->᩶:Ll/ۚۖۡ;

    .line 80
    invoke-static {}, Ll/ۖۛ᩷;->ۧ()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    .line 248
    invoke-virtual {v2, v3, v4}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const v2, 0x7f0a017e

    .line 81
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/ۤۤᩳ;

    iput-object v2, v6, Ll/ܽܳۢ;->ܰ:Ll/ۤۤᩳ;

    const v3, 0x7f0a019c

    .line 82
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    iput-object v8, v6, Ll/ܽܳۢ;->۫:Landroid/view/View;

    const v3, 0x7f0a019b

    .line 83
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v9, v3

    check-cast v9, Landroid/widget/CheckBox;

    iput-object v9, v6, Ll/ܽܳۢ;->۬:Landroid/widget/CheckBox;

    .line 84
    new-instance v3, Ll/۟ܿۢ;

    invoke-direct {v3, v6}, Ll/۟ܿۢ;-><init>(Ll/ܽܳۢ;)V

    invoke-virtual {v2, v3}, Ll/۫ۨᩳ;->֫(Landroid/text/TextWatcher;)V

    const v3, 0x7f0a0551

    .line 101
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Landroid/widget/Spinner;

    iput-object v10, v6, Ll/ܽܳۢ;->ᩳ֫:Landroid/widget/Spinner;

    const v3, 0x7f0a00e0

    .line 102
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Landroid/widget/CheckBox;

    iput-object v11, v6, Ll/ܽܳۢ;->ܽ֫:Landroid/widget/CheckBox;

    const v3, 0x7f0a00da

    .line 103
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Landroid/widget/CheckBox;

    iput-object v12, v6, Ll/ܽܳۢ;->ۨ:Landroid/widget/CheckBox;

    const v3, 0x7f0a00de

    .line 104
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Landroid/widget/CheckBox;

    iput-object v13, v6, Ll/ܽܳۢ;->۟:Landroid/widget/CheckBox;

    const v3, 0x7f0a00df

    .line 105
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v14, v3

    check-cast v14, Landroid/widget/CheckBox;

    iput-object v14, v6, Ll/ܽܳۢ;->ۛ:Landroid/widget/CheckBox;

    const v3, 0x7f0a00e1

    .line 106
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    move-object v15, v1

    check-cast v15, Landroid/widget/CheckBox;

    iput-object v15, v6, Ll/ܽܳۢ;->ۗ:Landroid/widget/CheckBox;

    const-string v1, "/"

    if-eqz v0, :cond_2

    .line 148
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    move-object v0, v1

    goto :goto_0

    .line 150
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 108
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    goto :goto_2

    :cond_2
    const-string v0, "dex_search_path"

    .line 110
    invoke-interface {v7, v0, v4}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 148
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_1

    .line 150
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_4

    .line 151
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_4
    move-object v1, v0

    .line 110
    :cond_5
    :goto_1
    invoke-virtual {v2, v1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    :goto_2
    const-string v0, "dex_search_type"

    const/4 v4, 0x0

    .line 111
    invoke-interface {v7, v0, v4}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-virtual {v10, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 112
    invoke-virtual {v10}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v3

    const-wide/16 v16, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 p1, v8

    const/4 v8, 0x0

    move-wide/from16 v4, v16

    invoke-virtual/range {v0 .. v5}, Ll/ܽܳۢ;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 113
    invoke-virtual {v10, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    const-string v0, "dex_search_sub"

    const/4 v1, 0x1

    .line 114
    invoke-interface {v7, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v11, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_match_case"

    .line 115
    invoke-interface {v7, v0, v8}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v12, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_regex"

    .line 116
    invoke-interface {v7, v0, v8}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v13, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_hex"

    .line 117
    invoke-interface {v7, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v14, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string v0, "dex_search_exactly_match"

    .line 118
    invoke-interface {v7, v0, v1}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v15, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 299
    new-instance v0, Ll/᩶ܽܽ;

    invoke-direct {v0, v6}, Ll/᩶ܽܽ;-><init>(Ljava/lang/Object;)V

    .line 119
    iput-object v0, v6, Ll/ܽܳۢ;->᩹:Ll/᩶ܽܽ;

    const-string v0, "dseb"

    .line 120
    invoke-interface {v7, v0, v8}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    invoke-virtual {v9, v0}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 121
    new-instance v0, Ll/ۛܿۢ;

    invoke-direct {v0, v6}, Ll/ۛܿۢ;-><init>(Ll/ܽܳۢ;)V

    invoke-virtual {v9, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 124
    new-instance v0, Ll/ۢ᩷ᩳ;

    const/4 v1, 0x7

    invoke-direct {v0, v1, v6}, Ll/ۢ᩷ᩳ;-><init>(ILjava/lang/Object;)V

    move-object/from16 v1, p1

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 138
    invoke-direct/range {p0 .. p0}, Ll/ܽܳۢ;->ۧ()V

    .line 139
    new-instance v0, Ll/ۨܿۢ;

    invoke-direct {v0, v6}, Ll/ۨܿۢ;-><init>(Ll/ܽܳۢ;)V

    invoke-virtual {v13, v0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    return-void
.end method

.method public static ֫(Ll/ܽܳۢ;)V
    .locals 4

    .line 124
    new-instance v0, Ll/֫ܳۢ;

    iget-object p0, p0, Ll/ܽܳۢ;->᩸:Ll/ܿۛ᩷;

    const/4 v1, -0x1

    .line 40
    invoke-direct {v0, p0, v1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    const p0, 0x7f120310

    .line 133
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۡ(I)V

    const/4 p0, 0x1

    new-array v1, p0, [Ljava/lang/Object;

    const-string v2, "com/gms/\nandroidx/"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const v2, 0x7f1202a1

    .line 134
    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->ܽ(Ljava/lang/String;)V

    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "dsel"

    const-string v3, ""

    .line 135
    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/۬ۗܿ;->֫(Ljava/lang/CharSequence;)V

    .line 136
    invoke-virtual {v0}, Ll/۬ۗܿ;->ܺ()V

    .line 205
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܽܳۢ;Z)V
    .locals 1

    .line 122
    iget-object p0, p0, Ll/ܽܳۢ;->᩺:Ll/۫ۤۡ;

    const-string v0, "dseb"

    .line 0
    invoke-static {p0, v0, p1}, Ll/᩺۠ܽ;->֫(Ll/۫ۤۡ;Ljava/lang/String;Z)V

    return-void
.end method

.method private ۧ()V
    .locals 2

    .line 143
    iget-object v0, p0, Ll/ܽܳۢ;->۟:Landroid/widget/CheckBox;

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

    .line 144
    :goto_0
    iget-object v1, p0, Ll/ܽܳۢ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v1, v0}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ۧ(Ll/ܽܳۢ;)V
    .locals 0

    .line 139
    invoke-direct {p0}, Ll/ܽܳۢ;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܽܳۢ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ܽܳۢ;->֫֫:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ܽܳۢ;)Ll/ܿۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܳۢ;->᩸:Ll/ܿۛ᩷;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܽܳۢ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܳۢ;->۫:Landroid/view/View;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܽܳۢ;)Landroid/widget/CheckBox;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܳۢ;->۬:Landroid/widget/CheckBox;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܽܳۢ;)Ll/ۘۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܽܳۢ;->ܳ֫:Ll/ۘۛ᩷;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 18

    move-object/from16 v1, p0

    .line 223
    iget-object v2, v1, Ll/ܽܳۢ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v2}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    .line 224
    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    iget-object v0, v1, Ll/ܽܳۢ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 229
    :cond_0
    iget-object v0, v1, Ll/ܽܳۢ;->ܰ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۧۧ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    .line 230
    iget-object v3, v1, Ll/ܽܳۢ;->ᩳ֫:Landroid/widget/Spinner;

    invoke-virtual {v3}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v8

    .line 231
    iget-object v3, v1, Ll/ܽܳۢ;->ܽ֫:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v9

    .line 232
    iget-object v3, v1, Ll/ܽܳۢ;->ۨ:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v10

    .line 233
    iget-object v3, v1, Ll/ܽܳۢ;->۟:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v11

    .line 234
    iget-object v3, v1, Ll/ܽܳۢ;->ۛ:Landroid/widget/CheckBox;

    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v3

    .line 235
    iget-object v5, v1, Ll/ܽܳۢ;->ۗ:Landroid/widget/CheckBox;

    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v12

    const/4 v5, 0x3

    const/4 v6, 0x1

    if-eqz v8, :cond_7

    if-eq v8, v6, :cond_7

    const/4 v6, 0x2

    if-eq v8, v6, :cond_7

    if-eq v8, v5, :cond_7

    const/4 v5, 0x4

    if-eq v8, v5, :cond_7

    const/4 v5, 0x5

    if-eq v8, v5, :cond_1

    const/4 v5, 0x0

    goto/16 :goto_3

    :cond_1
    const v5, 0x7f120b48

    if-eqz v3, :cond_6

    const/4 v7, 0x4

    const-string v13, "0x"

    .line 256
    invoke-virtual {v4, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_3

    const-string v13, "0X"

    invoke-virtual {v4, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_0

    :cond_2
    move-object v6, v4

    goto :goto_1

    .line 257
    :cond_3
    :goto_0
    invoke-virtual {v4, v6}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    .line 258
    :goto_1
    invoke-static {v6}, Ll/ۢ᩺ۡ;->ܿ(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_4

    .line 259
    invoke-static {v5}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 260
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 256
    :cond_4
    invoke-virtual {v6}, Ljava/lang/String;->toCharArray()[C

    move-result-object v5

    array-length v6, v5

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    :goto_2
    if-ge v13, v6, :cond_5

    aget-char v16, v5, v13

    shl-long/2addr v14, v7

    .line 257
    invoke-static/range {v16 .. v16}, Ll/ۢ᩺ۡ;->֫(C)I

    move-result v7

    move-object/from16 v16, v5

    move/from16 v17, v6

    int-to-long v5, v7

    or-long/2addr v14, v5

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v5, v16

    move/from16 v6, v17

    const/4 v7, 0x4

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    move-wide v6, v14

    goto :goto_4

    :cond_6
    const/4 v6, 0x0

    .line 266
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-wide v6, v13

    const/4 v5, 0x0

    goto :goto_4

    .line 269
    :catch_0
    invoke-static {v5}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 270
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_7
    const/4 v5, 0x0

    if-eqz v11, :cond_8

    .line 244
    :try_start_1
    invoke-static {v4}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v0

    move-object v3, v0

    .line 247
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 248
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    return-void

    :cond_8
    :goto_3
    const-wide/16 v6, 0x0

    .line 276
    :goto_4
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܳ()V

    .line 277
    iget-object v2, v1, Ll/ܽܳۢ;->᩺:Ll/۫ۤۡ;

    invoke-interface {v2}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v2

    .line 278
    iget-boolean v13, v1, Ll/ܽܳۢ;->֫֫:Z

    if-nez v13, :cond_9

    const-string v13, "dex_search_path"

    .line 279
    invoke-interface {v2, v13, v0}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    :cond_9
    const-string v13, "dex_search_type"

    .line 280
    invoke-interface {v2, v8, v13}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v2

    const-string v13, "dex_search_sub"

    .line 281
    invoke-interface {v2, v13, v9}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v2

    const-string v13, "dex_search_match_case"

    .line 282
    invoke-interface {v2, v13, v10}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v2

    const-string v13, "dex_search_regex"

    .line 283
    invoke-interface {v2, v13, v11}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v2

    const-string v13, "dex_search_hex"

    .line 284
    invoke-interface {v2, v13, v3}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v2

    const-string v3, "dex_search_exactly_match"

    .line 285
    invoke-interface {v2, v3, v12}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v2

    .line 286
    invoke-interface {v2}, Ll/۬ۤۡ;->apply()V

    .line 287
    iget-object v2, v1, Ll/ܽܳۢ;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {v2}, Ll/֡ۚۢ;->dismiss()V

    .line 288
    iget-object v2, v1, Ll/ܽܳۢ;->᩹:Ll/᩶ܽܽ;

    iget-object v2, v2, Ll/᩶ܽܽ;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ܽܳۢ;

    .line 301
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v3

    const-string v13, "power"

    invoke-virtual {v3, v13}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/PowerManager;

    .line 302
    invoke-static {}, Ll/ۙ᩸᩷;->ᩴ()Ljava/lang/String;

    move-result-object v13

    const-string v14, ":DexPlus"

    invoke-virtual {v13, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x1

    invoke-virtual {v3, v14, v13}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v3

    .line 303
    invoke-virtual {v3}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 304
    new-instance v13, Ll/᩺ۤܿ;

    iget-object v15, v2, Ll/ܽܳۢ;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v13, v15}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v15, 0x7f12090c

    .line 305
    invoke-virtual {v13, v15}, Ll/᩺ۤܿ;->ܽ(I)V

    .line 306
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    new-array v14, v14, [Ljava/lang/Object;

    aput-object v15, v14, v5

    const v5, 0x7f120202

    invoke-static {v5, v14}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v13, v5}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    const/4 v5, 0x0

    .line 65
    invoke-virtual {v13, v5}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 307
    invoke-virtual {v13}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    .line 308
    new-instance v14, Ll/ۧܳۢ;

    invoke-direct {v14, v2, v13, v3}, Ll/ۧܳۢ;-><init>(Ll/ܽܳۢ;Ll/᩺ۤܿ;Landroid/os/PowerManager$WakeLock;)V

    .line 352
    iget-object v3, v2, Ll/ܽܳۢ;->ܳ֫:Ll/ۘۛ᩷;

    invoke-virtual {v3}, Ll/ۘۛ᩷;->᩻()Ll/ۚۡ֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۫ۧۢ;

    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    iget-boolean v5, v2, Ll/ܽܳۢ;->֫֫:Z

    const-string v13, "/"

    if-eqz v5, :cond_c

    .line 354
    iget-object v0, v2, Ll/ܽܳۢ;->ۧ֫:Ljava/lang/String;

    .line 156
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/4 v5, 0x1

    .line 157
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 158
    :cond_a
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_b

    invoke-virtual {v0, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 159
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_b
    :goto_5
    move-object v5, v0

    .line 354
    iget-object v0, v2, Ll/ܽܳۢ;->ۤ:Ljava/util/Set;

    .line 355
    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ll/ۗܿۢ;

    const/4 v9, 0x0

    invoke-direct {v2, v9, v0}, Ll/ۗܿۢ;-><init>(ILjava/lang/Object;)V

    const/4 v9, 0x1

    move-object v13, v14

    move-object v14, v2

    .line 354
    invoke-static/range {v3 .. v14}, Ll/ۛܽۢ;->֫(Ll/۫ۧۢ;Ljava/lang/String;Ljava/lang/String;JIZZZZLl/ۙۛ᩷;Ljava/util/function/Predicate;)V

    return-void

    .line 358
    :cond_c
    iget-object v5, v2, Ll/ܽܳۢ;->۫:Landroid/view/View;

    invoke-virtual {v5}, Landroid/view/View;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_d

    iget-object v2, v2, Ll/ܽܳۢ;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v2

    if-eqz v2, :cond_d

    .line 359
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v5, "dsel"

    const-string v15, ""

    invoke-interface {v2, v5, v15}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "\n"

    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v5, Ll/ܿ᩶ܳ;

    const/4 v15, 0x3

    invoke-direct {v5, v15}, Ll/ܿ᩶ܳ;-><init>(I)V

    .line 360
    invoke-interface {v2, v5}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    new-instance v5, Ll/᩺ܿۢ;

    const/4 v15, 0x0

    invoke-direct {v5, v15}, Ll/᩺ܿۢ;-><init>(I)V

    .line 361
    invoke-interface {v2, v5}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v2

    .line 362
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v5

    invoke-interface {v2, v5}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 363
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_d

    .line 364
    new-instance v5, Ll/ܰܿۢ;

    invoke-direct {v5, v15, v2}, Ll/ܰܿۢ;-><init>(ILjava/lang/Object;)V

    move-object v2, v5

    goto :goto_6

    :cond_d
    const/4 v2, 0x0

    .line 156
    :goto_6
    invoke-virtual {v0, v13}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/4 v5, 0x1

    .line 157
    invoke-virtual {v0, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    .line 158
    :cond_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_f

    invoke-virtual {v0, v13}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_f

    .line 159
    invoke-virtual {v0, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_f
    :goto_7
    move-object v5, v0

    move-object v13, v14

    move-object v14, v2

    .line 374
    invoke-static/range {v3 .. v14}, Ll/ۛܽۢ;->֫(Ll/۫ۧۢ;Ljava/lang/String;Ljava/lang/String;JIZZZZLl/ۙۛ᩷;Ljava/util/function/Predicate;)V

    return-void
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4

    const/4 p1, 0x1

    const/4 p2, 0x4

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

    .line 189
    :goto_1
    iget-object v0, p0, Ll/ܽܳۢ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v0, p5}, Ll/ۚۖۡ;->֫(Z)V

    .line 190
    iget-object p5, p0, Ll/ܽܳۢ;->ۗ:Landroid/widget/CheckBox;

    iget-object v0, p0, Ll/ܽܳۢ;->ۛ:Landroid/widget/CheckBox;

    iget-object v1, p0, Ll/ܽܳۢ;->۟:Landroid/widget/CheckBox;

    iget-object v2, p0, Ll/ܽܳۢ;->ۨ:Landroid/widget/CheckBox;

    const/16 v3, 0x8

    if-eqz p3, :cond_4

    if-eq p3, p1, :cond_3

    const/4 p1, 0x2

    if-eq p3, p1, :cond_3

    const/4 p1, 0x3

    if-eq p3, p1, :cond_3

    if-eq p3, p2, :cond_3

    const/4 p1, 0x5

    if-eq p3, p1, :cond_2

    goto :goto_2

    .line 207
    :cond_2
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 208
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 209
    invoke-virtual {v0, p4}, Landroid/view/View;->setVisibility(I)V

    .line 210
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 201
    :cond_3
    invoke-virtual {v2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 202
    invoke-virtual {v1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 203
    invoke-virtual {p5, p4}, Landroid/view/View;->setVisibility(I)V

    .line 204
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    goto :goto_2

    .line 192
    :cond_4
    invoke-virtual {v2, p4}, Landroid/view/View;->setVisibility(I)V

    .line 193
    invoke-virtual {v1, p4}, Landroid/view/View;->setVisibility(I)V

    .line 194
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 195
    invoke-virtual {p5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 213
    :goto_2
    invoke-direct {p0}, Ll/ܽܳۢ;->ۧ()V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 4

    .line 176
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    iget-object v1, p0, Ll/ܽܳۢ;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v0, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 176
    iget-object v1, p0, Ll/ܽܳۢ;->ܿ֫:Landroid/view/View;

    .line 177
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 v1, 0x0

    const v2, 0x7f12015e

    const v3, 0x7f12070a

    .line 0
    invoke-static {v0, v3, v1, v2, v1}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    .line 180
    iput-object v0, p0, Ll/ܽܳۢ;->ۙ:Ll/֡ۚۢ;

    .line 181
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    .line 182
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    iget-object v0, p0, Ll/ܽܳۢ;->᩶:Ll/ۚۖۡ;

    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 184
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ll/֨ۛ᩷;)V
    .locals 2

    const/4 v0, 0x1

    .line 164
    iput-boolean v0, p0, Ll/ܽܳۢ;->֫֫:Z

    .line 165
    invoke-virtual {p1}, Ll/֨ۛ᩷;->֫()Ljava/util/Set;

    move-result-object v0

    iput-object v0, p0, Ll/ܽܳۢ;->ۤ:Ljava/util/Set;

    .line 166
    invoke-virtual {p1}, Ll/֨ۛ᩷;->ᩳ()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ܽܳۢ;->ۧ֫:Ljava/lang/String;

    .line 167
    iget-object p1, p0, Ll/ܽܳۢ;->ܽ֫:Landroid/widget/CheckBox;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const p1, 0x7f12020e

    .line 493
    iget-object v0, p0, Ll/ܽܳۢ;->ܰ:Ll/ۤۤᩳ;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ۤۤᩳ;->ۧ(Ljava/lang/CharSequence;)V

    const/4 p1, 0x0

    .line 169
    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 170
    iget-object v0, p0, Ll/ܽܳۢ;->۫:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 171
    iget-object v0, p0, Ll/ܽܳۢ;->۬:Landroid/widget/CheckBox;

    invoke-virtual {v0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method
