.class public final Ll/ۛ᩺᩷;
.super Ljava/lang/Object;
.source "W1F3"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۗ:Ll/ۚۖۡ;

.field public ۙ:Ll/֡ۚۢ;

.field public final ۛ:Ll/۫ۤۡ;

.field public final ۟:Landroid/view/View;

.field public final ۤ:Landroid/widget/CheckBox;

.field public final ۨ:Landroid/widget/CheckBox;

.field public final ۫:Landroid/widget/CheckBox;

.field public final ۬:Ll/ۚۖۡ;

.field public final ܰ:Landroid/view/View;

.field public ᩶:Ll/ۤ᩺᩷;

.field public final ᩸:Ll/ܿۛ᩷;

.field public final ᩹:Ll/᩵ۨ᩷;

.field public final ᩺:Landroid/widget/Spinner;


# direct methods
.method public constructor <init>(Ll/ܿۛ᩷;Ll/᩵ۨ᩷;)V
    .locals 4

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    iput-object v0, p0, Ll/ۛ᩺᩷;->ۛ:Ll/۫ۤۡ;

    .line 48
    iput-object p1, p0, Ll/ۛ᩺᩷;->᩸:Ll/ܿۛ᩷;

    .line 49
    iput-object p2, p0, Ll/ۛ᩺᩷;->᩹:Ll/᩵ۨ᩷;

    const p2, 0x7f0d0085

    .line 50
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۛ᩺᩷;->۟:Landroid/view/View;

    const p2, 0x7f0a017d

    .line 51
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Ll/ۚۖۡ;

    iput-object p2, p0, Ll/ۛ᩺᩷;->ۗ:Ll/ۚۖۡ;

    const v1, 0x7f0a017e

    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    iput-object v1, p0, Ll/ۛ᩺᩷;->۬:Ll/ۚۖۡ;

    .line 53
    invoke-static {}, Ll/ۖۛ᩷;->ۧ()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    .line 248
    invoke-virtual {p2, v2, v3}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 54
    invoke-static {}, Ll/ۖۛ᩷;->֫()Ljava/lang/String;

    move-result-object p2

    .line 248
    invoke-virtual {v1, p2, v3}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const p2, 0x7f0a02d9

    .line 55
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    iput-object p2, p0, Ll/ۛ᩺᩷;->ܰ:Landroid/view/View;

    const p2, 0x7f0a0551

    .line 56
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/Spinner;

    iput-object p2, p0, Ll/ۛ᩺᩷;->᩺:Landroid/widget/Spinner;

    const p2, 0x7f0a00da

    .line 57
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/CheckBox;

    iput-object p2, p0, Ll/ۛ᩺᩷;->ۤ:Landroid/widget/CheckBox;

    const v1, 0x7f0a00de

    .line 58
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/ۛ᩺᩷;->ۨ:Landroid/widget/CheckBox;

    const v2, 0x7f0a00df

    .line 59
    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/CheckBox;

    iput-object p1, p0, Ll/ۛ᩺᩷;->۫:Landroid/widget/CheckBox;

    .line 60
    new-instance v2, Ll/ۗ᩺᩷;

    invoke-direct {v2, p0}, Ll/ۗ᩺᩷;-><init>(Ll/ۛ᩺᩷;)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    const-string v2, "dex_search_match_case"

    const/4 v3, 0x0

    .line 64
    invoke-interface {v0, v2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {p2, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string p2, "dex_search_regex"

    .line 65
    invoke-interface {v0, p2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    invoke-virtual {v1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const-string p2, "dex_search_exactly_match"

    .line 66
    invoke-interface {v0, p2, v3}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۛ᩺᩷;)Ll/ܿۛ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛ᩺᩷;->᩸:Ll/ܿۛ᩷;

    return-object p0
.end method

.method public static ֫(Ll/ۛ᩺᩷;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;ZZZ)V
    .locals 13

    move-object v0, p0

    .line 154
    new-instance v1, Ll/᩺ۤܿ;

    iget-object v2, v0, Ll/ۛ᩺᩷;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v1, v2}, Ll/᩺ۤܿ;-><init>(Ll/ۗܺ᩷;)V

    const v2, 0x7f1207a7

    .line 155
    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->ܽ(I)V

    const/4 v2, 0x0

    .line 65
    invoke-virtual {v1, v2}, Ll/᩺ۤܿ;->֫(Ljava/lang/Runnable;)Ll/᩺ۤܿ;

    .line 157
    invoke-virtual {v1}, Ll/᩺ۤܿ;->ۡ()Ll/᩺ۤܿ;

    .line 158
    new-instance v6, Ll/۫᩺᩷;

    invoke-direct {v6, p0, v1}, Ll/۫᩺᩷;-><init>(Ll/ۛ᩺᩷;Ll/᩺ۤܿ;)V

    .line 188
    iget-object v1, v0, Ll/ۛ᩺᩷;->᩺:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v5, 0x0

    .line 189
    :goto_0
    iget-object v4, v0, Ll/ۛ᩺᩷;->᩹:Ll/᩵ۨ᩷;

    .line 297
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/᩺ۨ᩷;

    move-object v3, v1

    move-object v7, p2

    move/from16 v8, p5

    move/from16 v9, p4

    move-object v10, p1

    move-object/from16 v11, p3

    move/from16 v12, p6

    invoke-direct/range {v3 .. v12}, Ll/᩺ۨ᩷;-><init>(Ll/᩵ۨ᩷;ZLl/᩸ۛ᩷;Ljava/lang/String;ZZLjava/util/Set;Ljava/lang/String;Z)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 358
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛ᩺᩷;Z)V
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۛ᩺᩷;->ۗ:Ll/ۚۖۡ;

    invoke-virtual {v0, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    .line 62
    iget-object p0, p0, Ll/ۛ᩺᩷;->۬:Ll/ۚۖۡ;

    invoke-virtual {p0, p1}, Ll/ۚۖۡ;->ܽ(Z)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 97
    iget-object p1, p0, Ll/ۛ᩺᩷;->ۗ:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    .line 98
    iget-object v0, p0, Ll/ۛ᩺᩷;->۬:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    .line 99
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 100
    iget-object p1, p0, Ll/ۛ᩺᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    return-void

    .line 103
    :cond_0
    iget-object v1, p0, Ll/ۛ᩺᩷;->ۤ:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    .line 104
    iget-object v1, p0, Ll/ۛ᩺᩷;->ۨ:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    .line 105
    iget-object v1, p0, Ll/ۛ᩺᩷;->۫:Landroid/widget/CheckBox;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    if-eqz v5, :cond_1

    .line 110
    :try_start_0
    invoke-static {v2}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 118
    :try_start_1
    invoke-static {v1, v3}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 121
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 122
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    return-void

    :catch_1
    move-exception v0

    .line 113
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 114
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void

    .line 126
    :cond_1
    :goto_0
    invoke-virtual {p1}, Ll/ۚۖۡ;->ܳ()V

    .line 127
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    .line 128
    iget-object p1, p0, Ll/ۛ᩺᩷;->ۛ:Ll/۫ۤۡ;

    invoke-interface {p1}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "dex_search_match_case"

    .line 129
    invoke-interface {p1, v0, v4}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "dex_search_regex"

    .line 130
    invoke-interface {p1, v0, v5}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    const-string v0, "dex_search_exactly_match"

    .line 131
    invoke-interface {p1, v0, v6}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object p1

    .line 132
    invoke-interface {p1}, Ll/۬ۤۡ;->apply()V

    .line 133
    iget-object p1, p0, Ll/ۛ᩺᩷;->ۙ:Ll/֡ۚۢ;

    invoke-virtual {p1}, Ll/֡ۚۢ;->dismiss()V

    .line 134
    iget-object v1, p0, Ll/ۛ᩺᩷;->᩶:Ll/ۤ᩺᩷;

    invoke-interface/range {v1 .. v6}, Ll/ۤ᩺᩷;->֫(Ljava/lang/String;Ljava/lang/String;ZZZ)V

    return-void
.end method

.method public final onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    if-nez p3, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 139
    :goto_0
    iget-object p2, p0, Ll/ۛ᩺᩷;->۫:Landroid/widget/CheckBox;

    invoke-virtual {p2, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 4

    .line 84
    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    iget-object v1, p0, Ll/ۛ᩺᩷;->᩸:Ll/ܿۛ᩷;

    invoke-direct {v0, v1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 84
    iget-object v1, p0, Ll/ۛ᩺᩷;->۟:Landroid/view/View;

    .line 85
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 v1, 0x0

    const v2, 0x7f12015e

    const v3, 0x7f12070a

    .line 0
    invoke-static {v0, v3, v1, v2, v1}, Ll/۟ۖᩴ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v0

    .line 88
    iput-object v0, p0, Ll/ۛ᩺᩷;->ۙ:Ll/֡ۚۢ;

    .line 89
    invoke-virtual {v0}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v0

    .line 90
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 91
    iget-object v0, p0, Ll/ۛ᩺᩷;->ۗ:Ll/ۚۖۡ;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ۚۖۡ;->ۧ(I)V

    .line 92
    iget-object v0, p0, Ll/ۛ᩺᩷;->۬:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Ll/֨ۛ᩷;)V
    .locals 8

    .line 70
    invoke-virtual {p1}, Ll/֨ۛ᩷;->֫()Ljava/util/Set;

    move-result-object p1

    .line 153
    new-instance v0, Ll/ۛܳᩳ;

    invoke-direct {v0, p0, p1}, Ll/ۛܳᩳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    iput-object v0, p0, Ll/ۛ᩺᩷;->᩶:Ll/ۤ᩺᩷;

    .line 71
    iget-object p1, p0, Ll/ۛ᩺᩷;->ۛ:Ll/۫ۤۡ;

    const-string v0, "arsc_search_type"

    const/4 v1, 0x0

    invoke-interface {p1, v0, v1}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 v1, 0x1

    :cond_0
    iget-object p1, p0, Ll/ۛ᩺᩷;->᩺:Landroid/widget/Spinner;

    invoke-virtual {p1, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 72
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v5

    const-wide/16 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p0

    invoke-virtual/range {v2 .. v7}, Ll/ۛ᩺᩷;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 73
    invoke-virtual {p1, p0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method public final ֫(Ll/᩵۟᩷;)V
    .locals 1

    .line 194
    new-instance v0, Ll/۬᩺᩷;

    invoke-direct {v0, p1}, Ll/۬᩺᩷;-><init>(Ll/᩵۟᩷;)V

    .line 78
    iput-object v0, p0, Ll/ۛ᩺᩷;->᩶:Ll/ۤ᩺᩷;

    .line 79
    iget-object p1, p0, Ll/ۛ᩺᩷;->ܰ:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
