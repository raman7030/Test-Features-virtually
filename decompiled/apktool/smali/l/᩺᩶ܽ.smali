.class public abstract Ll/᩺᩶ܽ;
.super Ljava/lang/Object;
.source "B4HK"


# instance fields
.field public ֫:Ll/֡ۚۢ;

.field public ۧ:Landroid/widget/CheckBox;

.field public ܳ:Ll/ۚۖۡ;

.field public ܽ:Ll/ۚۖۡ;

.field public ܿ:Landroid/widget/CheckBox;

.field public ᩳ:Landroid/widget/CheckBox;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;)V
    .locals 5

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d00ee

    .line 29
    invoke-virtual {p1, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a017d

    .line 30
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    iput-object v1, p0, Ll/᩺᩶ܽ;->ܽ:Ll/ۚۖۡ;

    const v1, 0x7f0a017e

    .line 31
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    iput-object v1, p0, Ll/᩺᩶ܽ;->ܳ:Ll/ۚۖۡ;

    const v1, 0x7f0a00da

    .line 32
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/᩺᩶ܽ;->ᩳ:Landroid/widget/CheckBox;

    .line 33
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "filter_match_case"

    const/4 v4, 0x0

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v1, 0x7f0a00de

    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/᩺᩶ܽ;->ܿ:Landroid/widget/CheckBox;

    .line 35
    new-instance v2, Ll/ۤ᩶ܽ;

    invoke-direct {v2, v4, p0}, Ll/ۤ᩶ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 39
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "filter_regex"

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    const v1, 0x7f0a00df

    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Ll/᩺᩶ܽ;->ۧ:Landroid/widget/CheckBox;

    .line 41
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v3, "filter_exactly_match"

    invoke-interface {v2, v3, v4}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 42
    sget v1, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v1, Ll/᩵ۚۢ;

    invoke-direct {v1, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 43
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f12070a

    const/4 v0, 0x0

    .line 44
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 45
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 46
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/᩺᩶ܽ;->֫:Ll/֡ۚۢ;

    .line 47
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۛ᩶ܽ;

    invoke-direct {v0, v4, p0}, Ll/ۛ᩶ܽ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static ֫(Ll/᩺᩶ܽ;)V
    .locals 12

    .line 47
    iget-object v0, p0, Ll/᩺᩶ܽ;->ܽ:Ll/ۚۖۡ;

    .line 48
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/᩺᩶ܽ;->ܳ:Ll/ۚۖۡ;

    .line 49
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ll/᩺᩶ܽ;->ᩳ:Landroid/widget/CheckBox;

    .line 50
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v4

    iget-object v5, p0, Ll/᩺᩶ܽ;->ܿ:Landroid/widget/CheckBox;

    .line 51
    invoke-virtual {v5}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v5

    iget-object v6, p0, Ll/᩺᩶ܽ;->ۧ:Landroid/widget/CheckBox;

    .line 52
    invoke-virtual {v6}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v6

    .line 58
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_0

    goto/16 :goto_9

    :cond_0
    if-eqz v5, :cond_1

    .line 64
    :try_start_0
    invoke-static {v1}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 72
    :try_start_1
    invoke-static {v7, v3}, Ll/ܰۘܽ;->֫(Ll/ۨۘܽ;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 76
    invoke-virtual {v2}, Landroid/view/View;->requestFocus()Z

    goto/16 :goto_9

    :catch_1
    move-exception p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 68
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    goto/16 :goto_9

    .line 80
    :cond_1
    :goto_0
    iget-object v7, p0, Ll/᩺᩶ܽ;->֫:Ll/֡ۚۢ;

    invoke-virtual {v7}, Ll/֡ۚۢ;->dismiss()V

    .line 82
    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    .line 83
    invoke-virtual {v2}, Ll/ۚۖۡ;->ܳ()V

    .line 84
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v2, "filter_match_case"

    .line 85
    invoke-interface {v0, v2, v4}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    const-string v2, "filter_regex"

    .line 86
    invoke-interface {v0, v2, v5}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    const-string v2, "filter_exactly_match"

    .line 87
    invoke-interface {v0, v2, v6}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    .line 88
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    if-nez v5, :cond_2

    .line 99
    invoke-static {v1}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_2
    if-eqz v4, :cond_3

    .line 104
    invoke-static {v1}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/16 v0, 0x42

    .line 106
    invoke-static {v0, v1}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v0

    .line 109
    :goto_1
    new-instance v1, Ll/ۨ᩶ܽ;

    .line 176
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, ""

    .line 111
    invoke-virtual {v0, v2}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 114
    :cond_4
    :goto_2
    invoke-virtual {p0}, Ll/᩺᩶ܽ;->֫()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_d

    .line 135
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 136
    invoke-virtual {v0, v2}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    if-eqz v6, :cond_5

    .line 138
    invoke-virtual {v0}, Ll/۫ۘܽ;->matches()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 139
    invoke-virtual {v0}, Ll/۫ۘܽ;->toSnapshot()Ll/ۤۘܽ;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 142
    :cond_5
    :goto_3
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v7

    if-eqz v7, :cond_6

    .line 143
    invoke-virtual {v0}, Ll/۫ۘܽ;->toSnapshot()Ll/ۤۘܽ;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 146
    :cond_6
    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_7

    const/4 v2, 0x0

    goto :goto_8

    .line 148
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-virtual {v1, v7}, Ll/ۨ᩶ܽ;->֫(I)V

    .line 149
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 151
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const/4 v8, 0x0

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۤۘܽ;

    .line 152
    invoke-virtual {v9}, Ll/ۤۘܽ;->start()I

    move-result v10

    .line 153
    invoke-virtual {v9}, Ll/ۤۘܽ;->end()I

    move-result v11

    if-eqz v5, :cond_9

    .line 157
    :try_start_2
    invoke-virtual {v9, v3}, Ll/ۤۘܽ;->expandReplacement(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    :catch_2
    move-object v9, v3

    :goto_6
    if-le v10, v8, :cond_8

    .line 162
    invoke-virtual {v7, v2, v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 163
    :cond_8
    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_9
    if-le v10, v8, :cond_a

    .line 166
    invoke-virtual {v7, v2, v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 167
    :cond_a
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_7
    move v8, v11

    goto :goto_5

    .line 171
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v8, v4, :cond_c

    .line 172
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v7, v2, v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 173
    :cond_c
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    :goto_8
    if-eqz v2, :cond_4

    .line 117
    invoke-virtual {p0, v2}, Ll/᩺᩶ܽ;->֫(Ljava/lang/String;)V

    goto/16 :goto_2

    .line 121
    :cond_d
    invoke-virtual {v1}, Ll/ۨ᩶ܽ;->֫()I

    move-result v0

    invoke-virtual {p0, v0}, Ll/᩺᩶ܽ;->֫(I)V

    :goto_9
    return-void
.end method

.method public static synthetic ֫(Ll/᩺᩶ܽ;Z)V
    .locals 1

    .line 36
    iget-object v0, p0, Ll/᩺᩶ܽ;->ܽ:Ll/ۚۖۡ;

    invoke-virtual {v0, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    .line 37
    iget-object p0, p0, Ll/᩺᩶ܽ;->ܳ:Ll/ۚۖۡ;

    invoke-virtual {p0, p1}, Ll/ۚۖۡ;->ܽ(Z)V

    return-void
.end method


# virtual methods
.method public abstract ֫()Ljava/lang/String;
.end method

.method public abstract ֫(I)V
.end method

.method public abstract ֫(Ljava/lang/String;)V
.end method
