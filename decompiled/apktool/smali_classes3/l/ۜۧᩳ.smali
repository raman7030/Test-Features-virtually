.class public Ll/ۜۧᩳ;
.super Ll/֨ۧᩳ;
.source "33YQ"


# static fields
.field public static ۠:Ljava/lang/String;

.field public static ܶ:Ljava/lang/String;


# instance fields
.field public ֡:Landroid/widget/Spinner;

.field public ֨:Landroid/view/View;

.field public ֫:Ll/ۗܺ᩷;

.field public ۖ:Z

.field public ۘ:Ljava/lang/String;

.field public ۚ:Landroid/view/View;

.field public ۜ:Z

.field public final ۡ:Ljava/util/ArrayList;

.field public ۢ:Ljava/util/List;

.field public ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

.field public ܳ:Z

.field public ܺ:Landroid/widget/Spinner;

.field public final ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

.field public ܿ:Ljava/lang/String;

.field public final ᩳ:Ll/ᩳ۟ܽ;

.field public ᩴ:Ljava/util/List;

.field public final ᩵:Ljava/util/ArrayList;

.field public ᩷:Ljava/lang/String;

.field public ᩻:Ll/ܽܳ᩷;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 389
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "src_lan"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۜۧᩳ;->۠:Ljava/lang/String;

    .line 390
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "tar_lan"

    invoke-interface {v0, v1, v2}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۜۧᩳ;->ܶ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ll/ܽܳ᩷;Lbin/mt/plugin/api/translation/TranslationEngine;)V
    .locals 5

    .line 57
    invoke-direct {p0}, Ll/֨ۧᩳ;-><init>()V

    .line 47
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜۧᩳ;->ۡ:Ljava/util/ArrayList;

    .line 48
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۜۧᩳ;->᩵:Ljava/util/ArrayList;

    const/4 v0, 0x0

    .line 51
    iput-boolean v0, p0, Ll/ۜۧᩳ;->ۜ:Z

    .line 52
    iput-boolean v0, p0, Ll/ۜۧᩳ;->ۖ:Z

    const/4 v1, 0x1

    .line 53
    iput-boolean v1, p0, Ll/ۜۧᩳ;->ܳ:Z

    .line 58
    iput-object p1, p0, Ll/ۜۧᩳ;->֫:Ll/ۗܺ᩷;

    .line 59
    iput-object p2, p0, Ll/ۜۧᩳ;->᩻:Ll/ܽܳ᩷;

    .line 60
    iput-object p3, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    .line 61
    new-instance v2, Ll/ᩳ۟ܽ;

    invoke-direct {v2, p3}, Ll/ᩳ۟ܽ;-><init>(Lbin/mt/plugin/api/translation/TranslationEngine;)V

    iput-object v2, p0, Ll/ۜۧᩳ;->ᩳ:Ll/ᩳ۟ܽ;

    if-eqz p2, :cond_1

    .line 63
    invoke-virtual {p2}, Ll/ܽܳ᩷;->ۧ()Lbin/mt/plugin/api/PluginContext;

    move-result-object p2

    invoke-interface {p3}, Lbin/mt/plugin/api/translation/TranslationEngine;->name()Ljava/lang/String;

    move-result-object v2

    .line 182
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x3

    if-lt v3, v4, :cond_0

    invoke-virtual {v2, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v3, 0x7b

    if-ne v0, v3, :cond_0

    .line 0
    invoke-static {v1, v2}, Ll/۟ۤ᩻;->֫(ILjava/lang/String;)C

    move-result v0

    const/16 v1, 0x7d

    if-ne v0, v1, :cond_0

    .line 183
    check-cast p2, Ll/ۤ᩻᩷;

    invoke-virtual {p2, v2}, Ll/ۤ᩻᩷;->getStringNullable(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    move-object v2, p2

    .line 63
    :cond_0
    iput-object v2, p0, Ll/ۜۧᩳ;->ܿ:Ljava/lang/String;

    goto :goto_0

    .line 65
    :cond_1
    invoke-interface {p3}, Lbin/mt/plugin/api/translation/TranslationEngine;->name()Ljava/lang/String;

    move-result-object p2

    iput-object p2, p0, Ll/ۜۧᩳ;->ܿ:Ljava/lang/String;

    .line 67
    :goto_0
    invoke-interface {p3}, Lbin/mt/plugin/api/translation/TranslationEngine;->getConfiguration()Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    move-result-object p2

    iput-object p2, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    const p2, 0x7f0d01e5

    .line 68
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p3

    iput-object p3, p0, Ll/ۜۧᩳ;->ۚ:Landroid/view/View;

    const v0, 0x7f0a05e4

    .line 69
    invoke-virtual {p3, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f1209d0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a0553

    .line 70
    invoke-virtual {p3, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/Spinner;

    iput-object p3, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    .line 71
    invoke-virtual {p1, p2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۜۧᩳ;->֨:Landroid/view/View;

    .line 72
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/TextView;

    const p3, 0x7f120a20

    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(I)V

    .line 73
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Spinner;

    iput-object p1, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜۧᩳ;)Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;)V
    .locals 0

    .line 0
    sput-object p0, Ll/ۜۧᩳ;->۠:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۜۧᩳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    return-void
.end method

.method private ۖ()V
    .locals 4

    const/4 v0, 0x0

    .line 156
    iput-boolean v0, p0, Ll/ۜۧᩳ;->ܳ:Z

    .line 157
    invoke-direct {p0}, Ll/ۜۧᩳ;->ۘ()V

    .line 160
    new-instance v0, Ll/᩶ۡۡ;

    iget-object v1, p0, Ll/ۜۧᩳ;->ۡ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۜۧᩳ;->֫:Ll/ۗܺ᩷;

    invoke-direct {v0, v2, v1}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iget-object v1, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 161
    new-instance v0, Ll/᩶ۡۡ;

    iget-object v3, p0, Ll/ۜۧᩳ;->᩵:Ljava/util/ArrayList;

    invoke-direct {v0, v2, v3}, Ll/᩶ۡۡ;-><init>(Landroid/content/Context;Ljava/util/List;)V

    iget-object v2, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    invoke-virtual {v2, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 163
    new-instance v0, Ll/᩻ۧᩳ;

    invoke-direct {v0, p0}, Ll/᩻ۧᩳ;-><init>(Ll/ۜۧᩳ;)V

    .line 186
    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 187
    invoke-virtual {v2, v0}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    return-void
.end method

.method private ۘ()V
    .locals 10

    const/4 v0, 0x0

    .line 95
    iput-boolean v0, p0, Ll/ۜۧᩳ;->ۖ:Z

    iput-boolean v0, p0, Ll/ۜۧᩳ;->ۜ:Z

    .line 96
    iget-object v1, p0, Ll/ۜۧᩳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 97
    iget-object v2, p0, Ll/ۜۧᩳ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 98
    iget-object v3, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v3, v3, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->disableAutoHideLanguage:Z

    if-eqz v3, :cond_0

    .line 99
    sget-object v3, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/֫۟ܽ;->ۧ()Ljava/util/Set;

    move-result-object v3

    .line 102
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    iget-object v5, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v5}, Lbin/mt/plugin/api/translation/TranslationEngine;->loadSourceLanguages()Ljava/util/List;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v4, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    .line 105
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    .line 106
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 107
    invoke-interface {v5, v6}, Lbin/mt/plugin/api/translation/TranslationEngine;->getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 108
    invoke-interface {v3, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 109
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 111
    :cond_1
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 115
    :cond_2
    iget-object v4, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v4

    const/4 v6, 0x1

    const-string v7, "-- NULL --"

    if-eqz v4, :cond_3

    .line 116
    iput-boolean v6, p0, Ll/ۜۧᩳ;->ۜ:Z

    .line 117
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    iput-object v4, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    .line 118
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 119
    :cond_3
    sget-object v4, Ll/ۜۧᩳ;->۠:Ljava/lang/String;

    if-eqz v4, :cond_4

    .line 120
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v1, 0x0

    .line 122
    :goto_3
    iget-object v4, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    invoke-virtual {v4, v1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 124
    iget-boolean v4, p0, Ll/ۜۧᩳ;->ۜ:Z

    iget-object v8, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    if-eqz v4, :cond_5

    .line 125
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    .line 126
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    invoke-virtual {v8, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void

    .line 132
    :cond_5
    new-instance v4, Ljava/util/ArrayList;

    iget-object v9, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    invoke-interface {v9, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v5, v1}, Lbin/mt/plugin/api/translation/TranslationEngine;->loadTargetLanguages(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v4, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    .line 135
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    .line 136
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 137
    invoke-interface {v5, v4}, Lbin/mt/plugin/api/translation/TranslationEngine;->getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 138
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    .line 139
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    goto :goto_4

    .line 141
    :cond_6
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 145
    :cond_7
    iget-object v1, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 146
    iput-boolean v6, p0, Ll/ۜۧᩳ;->ۖ:Z

    .line 147
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    .line 148
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 149
    :cond_8
    sget-object v1, Ll/ۜۧᩳ;->ܶ:Ljava/lang/String;

    if-eqz v1, :cond_9

    .line 150
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 152
    :cond_9
    :goto_5
    invoke-virtual {v8, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ۜۧᩳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->᩵:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ۜۧᩳ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۜۧᩳ;->ᩴ()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ljava/lang/String;)V
    .locals 0

    .line 0
    sput-object p0, Ll/ۜۧᩳ;->ܶ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۜۧᩳ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ۜۧᩳ;->ۘ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ۜۧᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۜۧᩳ;->ۜ:Z

    return p0
.end method

.method public static bridge synthetic ܳ(Ll/ۜۧᩳ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۜۧᩳ;->ۖ:Z

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۜۧᩳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۜۧᩳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ۜۧᩳ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->ۡ:Ljava/util/ArrayList;

    return-object p0
.end method

.method private ᩴ()V
    .locals 7

    const/4 v0, 0x0

    .line 191
    iput-boolean v0, p0, Ll/ۜۧᩳ;->ۖ:Z

    .line 192
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    iget-object v3, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v3, v2}, Lbin/mt/plugin/api/translation/TranslationEngine;->loadTargetLanguages(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    .line 193
    iget-object v1, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v1, v1, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->disableAutoHideLanguage:Z

    if-eqz v1, :cond_0

    .line 194
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/֫۟ܽ;->ۧ()Ljava/util/Set;

    move-result-object v1

    .line 196
    :goto_0
    iget-object v2, p0, Ll/ۜۧᩳ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 197
    iget-object v4, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 198
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 199
    invoke-interface {v3, v5}, Lbin/mt/plugin/api/translation/TranslationEngine;->getLanguageDisplayName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 200
    invoke-interface {v1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 201
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    goto :goto_1

    .line 203
    :cond_1
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 207
    :cond_2
    iget-object v1, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    .line 208
    iput-boolean v1, p0, Ll/ۜۧᩳ;->ۖ:Z

    const-string v1, "-- NULL --"

    .line 209
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    iput-object v3, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    .line 210
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 211
    :cond_3
    iget-object v1, p0, Ll/ۜۧᩳ;->ۘ:Ljava/lang/String;

    if-eqz v1, :cond_4

    .line 212
    iget-object v2, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 215
    :cond_4
    :goto_2
    iget-object v1, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    invoke-virtual {v1}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v2

    check-cast v2, Landroid/widget/BaseAdapter;

    invoke-virtual {v2}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 216
    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setSelection(I)V

    return-void
.end method

.method public static ᩵()V
    .locals 3

    .line 393
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "src_lan"

    sget-object v2, Ll/ۜۧᩳ;->۠:Ljava/lang/String;

    .line 394
    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    const-string v1, "tar_lan"

    sget-object v2, Ll/ۜۧᩳ;->ܶ:Ljava/lang/String;

    .line 395
    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 396
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ۜۧᩳ;)Landroid/widget/Spinner;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۜۧᩳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 351
    iget-object v0, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v0, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->acceptTranslated:Z

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    return-object p2

    :cond_0
    return-object p1
.end method

.method public final ֫()V
    .locals 1

    .line 364
    iget-object v0, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->afterFinish()V

    return-void
.end method

.method public final ֫(Ll/ۧ۟ܽ;)V
    .locals 3

    .line 226
    iget-object v0, p0, Ll/ۜۧᩳ;->ۚ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 227
    iget-object v0, p0, Ll/ۜۧᩳ;->֨:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 228
    iget-boolean p1, p0, Ll/ۜۧᩳ;->ܳ:Z

    if-eqz p1, :cond_1

    .line 230
    :try_start_0
    invoke-direct {p0}, Ll/ۜۧᩳ;->ۖ()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 84
    iget-object v0, p0, Ll/ۜۧᩳ;->᩻:Ll/ܽܳ᩷;

    if-nez v0, :cond_0

    const-string v0, "bin.mt.plugin.system"

    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1, p1}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 237
    :cond_1
    iget-boolean p1, p0, Ll/ۜۧᩳ;->ۜ:Z

    if-nez p1, :cond_8

    iget-boolean p1, p0, Ll/ۜۧᩳ;->ۖ:Z

    if-eqz p1, :cond_2

    goto :goto_0

    .line 240
    :cond_2
    sget-object p1, Ll/ۜۧᩳ;->۠:Ljava/lang/String;

    .line 241
    sget-object v0, Ll/ۜۧᩳ;->ܶ:Ljava/lang/String;

    if-nez p1, :cond_3

    goto :goto_0

    .line 246
    :cond_3
    iget-object v1, p0, Ll/ۜۧᩳ;->ۡ:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_4

    goto :goto_0

    .line 250
    :cond_4
    iget-object v2, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    invoke-virtual {v2, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 252
    iget-object v2, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v2, v2, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->targetLanguageMutable:Z

    if-eqz v2, :cond_5

    .line 253
    iget-object v2, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    .line 254
    invoke-direct {p0}, Ll/ۜۧᩳ;->ᩴ()V

    :cond_5
    if-nez v0, :cond_6

    goto :goto_0

    .line 260
    :cond_6
    iget-object p1, p0, Ll/ۜۧᩳ;->᩵:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v1, :cond_7

    goto :goto_0

    .line 264
    :cond_7
    iget-object v0, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    :cond_8
    :goto_0
    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)Z
    .locals 2

    .line 370
    :try_start_0
    iget-object v0, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0, p1}, Lbin/mt/plugin/api/translation/TranslationEngine;->onError(Ljava/lang/Exception;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    move-exception p1

    .line 84
    iget-object v0, p0, Ll/ۜۧᩳ;->᩻:Ll/ܽܳ᩷;

    if-nez v0, :cond_0

    const-string v0, "bin.mt.plugin.system"

    const/4 v1, 0x0

    .line 163
    invoke-static {v0, v1, p1}, Ll/ܶܳ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    .line 87
    :cond_0
    invoke-virtual {v0, p1}, Ll/ܽܳ᩷;->֫(Ljava/lang/Throwable;)V

    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫([Ljava/lang/String;[Ljava/lang/String;)[Ljava/lang/String;
    .locals 2

    .line 337
    iget-object v0, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v0, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->acceptTranslated:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 338
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 339
    aget-object v1, p2, v0

    if-eqz v1, :cond_0

    .line 341
    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 345
    :cond_1
    iget-object p2, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    iget-object v0, p0, Ll/ۜۧᩳ;->ۘ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۜۧᩳ;->ᩳ:Ll/ᩳ۟ܽ;

    invoke-virtual {v1, p1, p2, v0}, Ll/ᩳ۟ܽ;->֫([Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۜ()V
    .locals 1

    .line 306
    iget-object v0, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->onStart()V

    return-void
.end method

.method public final ۡ()Lbin/mt/plugin/api/translation/TranslationEngine;
    .locals 1

    .line 91
    iget-object v0, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    return-object v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 326
    iget-object v0, p0, Ll/ۜۧᩳ;->ᩳ:Ll/ᩳ۟ܽ;

    invoke-virtual {v0}, Ll/ᩳ۟ܽ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 317
    iget-object v0, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v0, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->acceptTranslated:Z

    if-eqz v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, p2

    .line 321
    :cond_1
    :goto_0
    iget-object p2, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    iget-object v0, p0, Ll/ۜۧᩳ;->ۘ:Ljava/lang/String;

    iget-object v1, p0, Ll/ۜۧᩳ;->ᩳ:Ll/ᩳ۟ܽ;

    invoke-virtual {v1, p1, p2, v0}, Ll/ᩳ۟ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()V
    .locals 1

    .line 301
    iget-object v0, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->beforeStart()V

    return-void
.end method

.method public final ܳ()V
    .locals 1

    .line 359
    iget-object v0, p0, Ll/ۜۧᩳ;->ܽ:Lbin/mt/plugin/api/translation/TranslationEngine;

    invoke-interface {v0}, Lbin/mt/plugin/api/translation/TranslationEngine;->onFinish()V

    return-void
.end method

.method public final ܺ()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۜۧᩳ;->᩻:Ll/ܽܳ᩷;

    if-nez v0, :cond_0

    const-string v0, "bin.mt.plugin.system"

    return-object v0

    .line 80
    :cond_0
    invoke-virtual {v0}, Ll/ܽܳ᩷;->ۖ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Z
    .locals 4

    .line 270
    iget-boolean v0, p0, Ll/ۜۧᩳ;->ۜ:Z

    const/4 v1, 0x0

    if-nez v0, :cond_6

    iget-boolean v0, p0, Ll/ۜۧᩳ;->ۖ:Z

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 275
    :cond_0
    iget-object v0, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    const-string v2, " size "

    if-ltz v0, :cond_5

    .line 276
    iget-object v3, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lt v0, v3, :cond_1

    goto :goto_1

    .line 280
    :cond_1
    iget-object v3, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    .line 283
    iget-object v0, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    move-result v0

    if-ltz v0, :cond_4

    .line 284
    iget-object v3, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lt v0, v3, :cond_2

    goto :goto_0

    .line 288
    :cond_2
    iget-object v2, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/ۜۧᩳ;->ۘ:Ljava/lang/String;

    .line 291
    iget-object v2, p0, Ll/ۜۧᩳ;->᩷:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 292
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Error: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/ۜۧᩳ;->۠:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " >> "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ll/ۜۧᩳ;->ܶ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return v1

    .line 295
    :cond_3
    invoke-static {}, Ll/ۜۧᩳ;->᩵()V

    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_0
    const-string v3, "Error: tarLanguageCode index "

    .line 0
    invoke-static {v0, v3, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 285
    iget-object v2, p0, Ll/ۜۧᩳ;->ᩴ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return v1

    :cond_5
    :goto_1
    const-string v3, "Error: srcLanguageCode index "

    .line 0
    invoke-static {v0, v3, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 277
    iget-object v2, p0, Ll/ۜۧᩳ;->ۢ:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return v1

    :cond_6
    :goto_2
    const-string v0, "Error!"

    .line 271
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return v1
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 221
    iget-object v0, p0, Ll/ۜۧᩳ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;
    .locals 1

    .line 331
    iget-object v0, p0, Ll/ۜۧᩳ;->ᩳ:Ll/ᩳ۟ܽ;

    invoke-virtual {v0}, Ll/ᩳ۟ܽ;->֫()Lbin/mt/plugin/api/translation/BatchTranslationEngine$BatchingStrategy;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 311
    iget-object v0, p0, Ll/ۜۧᩳ;->ۧ:Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;

    iget-boolean v0, v0, Lbin/mt/plugin/api/translation/TranslationEngine$Configuration;->forceNotToSkipTranslated:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ᩻()V
    .locals 1

    .line 379
    iget-boolean v0, p0, Ll/ۜۧᩳ;->ܳ:Z

    if-eqz v0, :cond_0

    return-void

    .line 381
    :cond_0
    invoke-direct {p0}, Ll/ۜۧᩳ;->ۘ()V

    .line 382
    iget-object v0, p0, Ll/ۜۧᩳ;->ܺ:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 383
    iget-object v0, p0, Ll/ۜۧᩳ;->֡:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/AbsSpinner;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    check-cast v0, Landroid/widget/BaseAdapter;

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method
