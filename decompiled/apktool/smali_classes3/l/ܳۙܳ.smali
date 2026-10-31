.class public final Ll/ܳۙܳ;
.super Ljava/lang/Object;
.source "X5LN"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# static fields
.field public static final ۖ֫:Ljava/util/concurrent/ExecutorService;

.field public static final ۘ֫:Ljava/util/ArrayList;

.field public static ᩴ֫:Z


# instance fields
.field public ֫֫:J

.field public ۗ:Ll/ۡۙܳ;

.field public final ۙ:Ll/ۚۖۡ;

.field public ۛ:Ljava/util/List;

.field public ۜ֫:Ll/ۢۙܳ;

.field public ۟:J

.field public final ۡ֫:Ll/ܽ᩷ܳ;

.field public final ۢ֫:Landroid/widget/TextView;

.field public final ۤ:Landroid/view/View;

.field public ۧ֫:Ljava/lang/Runnable;

.field public final ۨ:Landroid/widget/CheckBox;

.field public final ۫:Landroid/view/View;

.field public final ۬:Landroid/widget/TextView;

.field public ܰ:J

.field public final ܳ֫:Landroid/widget/CheckBox;

.field public final ܺ֫:Ll/ܽۢܳ;

.field public final ܽ֫:Ll/ۚۖۡ;

.field public ܿ֫:Ljava/util/List;

.field public ᩳ֫:Ll/᩶ۙܳ;

.field public final ᩶:Landroid/widget/CheckBox;

.field public final ᩷֫:Landroid/widget/TextView;

.field public final ᩸:Landroid/view/View;

.field public final ᩹:Landroid/widget/CheckBox;

.field public ᩺:J

.field public final ᩻֫:Landroid/widget/TextView;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    .line 357
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "sir"

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Ll/۫ۤۡ;->֫(Ljava/lang/String;[B)[B

    move-result-object v1

    .line 358
    invoke-static {v1}, Ll/᩻ۙܳ;->ۧ([B)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 789
    sget v0, Ll/ܿ᩸ۡ;->֫:I

    const/4 v1, 0x3

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    sput-object v0, Ll/ܳۙܳ;->ۖ֫:Ljava/util/concurrent/ExecutorService;

    return-void
.end method

.method public constructor <init>(Ll/ܽۢܳ;Ll/᩶ۙܳ;)V
    .locals 13

    const-string v0, "-1"

    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, ""

    .line 88
    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v2, p0, Ll/ܳۙܳ;->ۛ:Ljava/util/List;

    .line 94
    iput-object p1, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    .line 95
    iput-object p2, p0, Ll/ܳۙܳ;->ᩳ֫:Ll/᩶ۙܳ;

    .line 96
    invoke-virtual {p1}, Ll/ܽۢܳ;->ܺ()Ll/ܽ᩷ܳ;

    move-result-object p2

    iput-object p2, p0, Ll/ܳۙܳ;->ۡ֫:Ll/ܽ᩷ܳ;

    .line 97
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p2

    const v2, 0x7f0d00b1

    invoke-virtual {p2, v2}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p2

    const v2, 0x7f0a0631

    .line 98
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    iput-object v2, p0, Ll/ܳۙܳ;->ۢ֫:Landroid/widget/TextView;

    const v2, 0x7f0a01ef

    .line 99
    invoke-virtual {p2, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    iput-object v2, p0, Ll/ܳۙܳ;->۫:Landroid/view/View;

    const v3, 0x7f0a01ee

    .line 100
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Ll/ܳۙܳ;->۬:Landroid/widget/TextView;

    const v3, 0x7f0a017d

    .line 101
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۚۖۡ;

    iput-object v3, p0, Ll/ܳۙܳ;->ܽ֫:Ll/ۚۖۡ;

    const v3, 0x7f0a017e

    .line 102
    invoke-virtual {p2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Ll/ۚۖۡ;

    iput-object v3, p0, Ll/ܳۙܳ;->ۙ:Ll/ۚۖۡ;

    const v4, 0x7f0a00da

    .line 103
    invoke-virtual {p2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/CheckBox;

    iput-object v4, p0, Ll/ܳۙܳ;->ܳ֫:Landroid/widget/CheckBox;

    const v5, 0x7f0a00de

    .line 104
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/CheckBox;

    iput-object v5, p0, Ll/ܳۙܳ;->᩹:Landroid/widget/CheckBox;

    const v5, 0x7f0a00df

    .line 105
    invoke-virtual {p2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/CheckBox;

    iput-object v5, p0, Ll/ܳۙܳ;->ۨ:Landroid/widget/CheckBox;

    const v6, 0x7f0a00e0

    .line 106
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/CheckBox;

    iput-object v6, p0, Ll/ܳۙܳ;->᩶:Landroid/widget/CheckBox;

    const v7, 0x7f0a05e4

    .line 107
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, p0, Ll/ܳۙܳ;->᩻֫:Landroid/widget/TextView;

    const v7, 0x7f0a0630

    .line 108
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    check-cast v7, Landroid/widget/TextView;

    iput-object v7, p0, Ll/ܳۙܳ;->᩷֫:Landroid/widget/TextView;

    const v7, 0x7f0a052d

    .line 109
    invoke-virtual {p2, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const v8, 0x7f0a062f

    .line 110
    invoke-virtual {p2, v8}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    const v9, 0x7f0a04d4

    .line 111
    invoke-virtual {p2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Ll/ܳۙܳ;->᩸:Landroid/view/View;

    const v9, 0x7f0a0265

    .line 112
    invoke-virtual {p2, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    iput-object v9, p0, Ll/ܳۙܳ;->ۤ:Landroid/view/View;

    .line 113
    new-instance v10, Ll/۬᩸ۢ;

    const/4 v11, 0x3

    invoke-direct {v10, v11, p0}, Ll/۬᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v9, v10}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 114
    sget-object v10, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v10

    const/4 v11, 0x1

    xor-int/2addr v10, v11

    invoke-virtual {v9, v10}, Landroid/view/View;->setEnabled(Z)V

    .line 116
    new-instance v9, Ll/ۧۡۡ;

    const/4 v10, 0x2

    invoke-direct {v9, v10, p0}, Ll/ۧۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v9}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 195
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v9, "fsnm"

    invoke-interface {v2, v9}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 196
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    sget-object v10, Ll/ۡۙܳ;->ۗ:Ll/ۡۙܳ;

    .line 197
    invoke-virtual {v10}, Ll/ۡۙܳ;->ܿ()I

    move-result v10

    invoke-interface {v2, v9, v10}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v2

    .line 196
    invoke-static {v2}, Ll/ۡۙܳ;->֫(I)Ll/ۡۙܳ;

    move-result-object v2

    goto :goto_1

    .line 199
    :cond_0
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v9, "sir"

    invoke-interface {v2, v9}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v9, "file_search_record"

    .line 200
    invoke-interface {v2, v9}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v9, "file_search_record_empty"

    .line 201
    invoke-interface {v2, v9}, Ll/۫ۤۡ;->contains(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 204
    :cond_1
    sget-object v2, Ll/ۡۙܳ;->ۗ:Ll/ۡۙܳ;

    goto :goto_1

    .line 202
    :cond_2
    :goto_0
    sget-object v2, Ll/ۡۙܳ;->ۨ:Ll/ۡۙܳ;

    .line 117
    :goto_1
    invoke-direct {p0, v2}, Ll/ܳۙܳ;->֫(Ll/ۡۙܳ;)V

    .line 119
    new-instance v2, Ll/۬᩶ܳ;

    invoke-direct {v2, p0}, Ll/۬᩶ܳ;-><init>(Ll/ܳۙܳ;)V

    invoke-virtual {v6, v2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 121
    sget-object v2, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v9, "file_advanced_search"

    invoke-interface {v2, v9, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 122
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "file_search_ignore_case"

    invoke-interface {v1, v2, v11}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    xor-int/2addr v1, v11

    invoke-virtual {v5, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 123
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "file_search_regex"

    const/4 v5, 0x0

    invoke-interface {v1, v2, v5}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v6, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 124
    sget-object v1, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v2, "file_search_sub"

    invoke-interface {v1, v2, v11}, Ll/۫ۤۡ;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v4, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 125
    invoke-virtual {v3}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Ll/ۤۤᩳ;->ۙ(I)V

    .line 126
    invoke-virtual {v3}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v1

    const/high16 v2, 0x41880000    # 17.0f

    invoke-virtual {v1, v2}, Ll/۫ۨᩳ;->ܽ(F)V

    .line 127
    invoke-virtual {v3}, Ll/ۚۖۡ;->֫()V

    const-wide/16 v1, -0x1

    .line 130
    :try_start_0
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "file_search_max_size"

    invoke-interface {v3, v4, v0}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ܳۙܳ;->᩺:J
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 132
    :catch_0
    iput-wide v1, p0, Ll/ܳۙܳ;->᩺:J

    .line 135
    :goto_2
    :try_start_1
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "file_search_min_size"

    invoke-interface {v3, v4, v0}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ܳۙܳ;->۟:J
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    .line 137
    :catch_1
    iput-wide v1, p0, Ll/ܳۙܳ;->۟:J

    .line 139
    :goto_3
    iget-wide v3, p0, Ll/ܳۙܳ;->۟:J

    const-wide/16 v9, 0x0

    cmp-long v6, v3, v9

    if-ltz v6, :cond_3

    iget-wide v9, p0, Ll/ܳۙܳ;->᩺:J

    cmp-long v6, v3, v9

    if-nez v6, :cond_3

    const-wide v11, 0x7fffffffffffffffL

    cmp-long v6, v9, v11

    if-eqz v6, :cond_3

    const-wide/16 v11, 0x1

    add-long/2addr v9, v11

    .line 141
    iput-wide v9, p0, Ll/ܳۙܳ;->᩺:J

    .line 324
    :cond_3
    iget-object v6, p0, Ll/ܳۙܳ;->᩻֫:Landroid/widget/TextView;

    iget-wide v9, p0, Ll/ܳۙܳ;->᩺:J

    invoke-static {v3, v4, v9, v10}, Ll/᩷ۙܳ;->ۧ(JJ)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 144
    new-instance v3, Ll/۫᩶ܳ;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0}, Ll/۫᩶ܳ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v7, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 147
    :try_start_2
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "fsmaxt"

    invoke-interface {v3, v4, v0}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ܳۙܳ;->ܰ:J
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_4

    .line 149
    :catch_2
    iput-wide v1, p0, Ll/ܳۙܳ;->ܰ:J

    .line 152
    :goto_4
    :try_start_3
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v4, "fsmint"

    invoke-interface {v3, v4, v0}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    iput-wide v3, p0, Ll/ܳۙܳ;->֫֫:J
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_5

    .line 154
    :catch_3
    iput-wide v1, p0, Ll/ܳۙܳ;->֫֫:J

    .line 156
    :goto_5
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v1, "fstp"

    .line 157
    invoke-interface {v0, v1, v5}, Ll/۫ۤۡ;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 156
    invoke-static {v0}, Ll/ۢۙܳ;->֫(I)Ll/ۢۙܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    .line 158
    invoke-direct {p0}, Ll/ܳۙܳ;->᩻()V

    .line 159
    new-instance v0, Ll/᩶ܶ᩷;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ll/᩶ܶ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v8, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 161
    iget-object v0, p0, Ll/ܳۙܳ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {v0, p0}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 162
    iget-object v0, p0, Ll/ܳۙܳ;->᩹:Landroid/widget/CheckBox;

    sget-boolean v1, Ll/ܳۙܳ;->ᩴ֫:Z

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 164
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p2, 0x7f12070a

    const/4 v0, 0x0

    .line 165
    invoke-virtual {p1, p2, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ᩳ᩸ۢ;

    const/4 v0, 0x2

    invoke-direct {p2, v0, p0}, Ll/ᩳ᩸ۢ;-><init>(ILjava/lang/Object;)V

    const v0, 0x7f12015e

    .line 166
    invoke-virtual {p1, v0, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p2, Ll/ۢ᩶ܳ;

    invoke-direct {p2, p0}, Ll/ۢ᩶ܳ;-><init>(Ll/ܳۙܳ;)V

    .line 167
    invoke-virtual {p1, p2}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 168
    invoke-virtual {p1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object p1

    .line 169
    invoke-virtual {p1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p2

    new-instance v0, Ll/ۡ᩶ܳ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0, p1}, Ll/ۡ᩶ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 170
    iget-object p1, p0, Ll/ܳۙܳ;->ܽ֫:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object p1

    invoke-static {p1}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic ֫()V
    .locals 0

    .line 0
    invoke-static {}, Ll/ܳۙܳ;->ܿ()V

    return-void
.end method

.method private ֫(Landroid/view/View;)V
    .locals 6

    .line 401
    sget-object v0, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/᩵᩶ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/᩵᩶ܳ;-><init>(I)V

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/֡᩶ܳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 402
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/CharSequence;

    .line 403
    iget-object v1, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    .line 405
    new-instance v2, Ll/֫᩷ۡ;

    invoke-virtual {v1}, Ll/᩵ۚۢ;->ۧ()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f0d0155

    .line 172
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v2, v4, v3, v5}, Ll/֫᩷ۡ;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    const v3, 0x7f120456

    .line 407
    invoke-virtual {v1, v3}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v3, Ll/֨᩶ܳ;

    invoke-direct {v3, p0}, Ll/֨᩶ܳ;-><init>(Ll/ܳۙܳ;)V

    .line 408
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->֫(Landroid/widget/BaseAdapter;Ll/֨᩶ܳ;)V

    const v2, 0x7f120189

    const/4 v3, 0x0

    .line 409
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v2, 0x7f1205b2

    .line 410
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 411
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 412
    invoke-virtual {v1}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v2

    new-instance v3, Ll/۠᩶ܳ;

    invoke-direct {v3, p0, v0, v1, p1}, Ll/۠᩶ܳ;-><init>(Ll/ܳۙܳ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;Landroid/view/View;)V

    invoke-virtual {v2, v3}, Ll/ۢۢۡ;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    .line 430
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v2, Ll/ܶ᩶ܳ;

    invoke-direct {v2, p0, v1, p1}, Ll/ܶ᩶ܳ;-><init>(Ll/ܳۙܳ;Ll/֡ۚۢ;Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private ֫(Ll/ۡۙܳ;)V
    .locals 2

    .line 211
    iput-object p1, p0, Ll/ܳۙܳ;->ۗ:Ll/ۡۙܳ;

    .line 212
    invoke-virtual {p1}, Ll/ۡۙܳ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ܳۙܳ;->۬:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(I)V

    .line 213
    iget-object v0, p0, Ll/ܳۙܳ;->۫:Landroid/view/View;

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 214
    sget-object v0, Ll/ۡۙܳ;->ۤ:Ll/ۡۙܳ;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Ll/ܳۙܳ;->ܽ֫:Ll/ۚۖۡ;

    invoke-virtual {v0, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ll/ܳۙܳ;->ܳ()V

    .line 186
    iget-object p0, p0, Ll/ܳۙܳ;->ۧ֫:Ljava/lang/Runnable;

    if-eqz p0, :cond_0

    .line 187
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;I)V
    .locals 4

    .line 408
    sget-object v0, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/᩻ۙܳ;

    .line 384
    invoke-virtual {p1}, Ll/᩻ۙܳ;->ܳ()Ll/ۡۙܳ;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/ܳۙܳ;->֫(Ll/ۡۙܳ;)V

    .line 385
    iget-object v0, p0, Ll/ܳۙܳ;->ܽ֫:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/᩻ۙܳ;->᩵()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 386
    iget-object v0, p0, Ll/ܳۙܳ;->ܳ֫:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Ll/᩻ۙܳ;->ܶ()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 387
    iget-object v0, p0, Ll/ܳۙܳ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Ll/᩻ۙܳ;->֫()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 388
    invoke-virtual {p1}, Ll/᩻ۙܳ;->ۘ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܳۙܳ;->۟:J

    .line 389
    invoke-virtual {p1}, Ll/᩻ۙܳ;->ۜ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܳۙܳ;->᩺:J

    .line 390
    invoke-virtual {p1}, Ll/᩻ۙܳ;->ᩴ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܳۙܳ;->֫֫:J

    .line 391
    invoke-virtual {p1}, Ll/᩻ۙܳ;->ۖ()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ܳۙܳ;->ܰ:J

    .line 392
    invoke-virtual {p1}, Ll/᩻ۙܳ;->᩸()Ll/ۢۙܳ;

    move-result-object v0

    iput-object v0, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    .line 393
    iget-object v0, p0, Ll/ܳۙܳ;->ۙ:Ll/ۚۖۡ;

    invoke-virtual {p1}, Ll/᩻ۙܳ;->ᩳ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۚۖۡ;->֫(Ljava/lang/CharSequence;)V

    .line 394
    iget-object v0, p0, Ll/ܳۙܳ;->ۨ:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Ll/᩻ۙܳ;->᩻()Z

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 395
    iget-object v0, p0, Ll/ܳۙܳ;->᩶:Landroid/widget/CheckBox;

    invoke-virtual {p1}, Ll/᩻ۙܳ;->֡()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 324
    iget-object p1, p0, Ll/ܳۙܳ;->᩻֫:Landroid/widget/TextView;

    iget-wide v0, p0, Ll/ܳۙܳ;->۟:J

    iget-wide v2, p0, Ll/ܳۙܳ;->᩺:J

    invoke-static {v0, v1, v2, v3}, Ll/᩷ۙܳ;->ۧ(JJ)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 397
    invoke-direct {p0}, Ll/ܳۙܳ;->᩻()V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۙܳ;ILl/֡ۚۢ;Landroid/view/View;)V
    .locals 1

    .line 417
    sget-object v0, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 418
    invoke-static {}, Ll/ܳۙܳ;->ܿ()V

    .line 419
    invoke-virtual {p2}, Ll/֡ۚۢ;->dismiss()V

    .line 420
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 421
    iget-object p0, p0, Ll/ܳۙܳ;->ۤ:Landroid/view/View;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setEnabled(Z)V

    return-void

    .line 423
    :cond_0
    invoke-direct {p0, p3}, Ll/ܳۙܳ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;I[Ll/ۢۙܳ;Landroid/view/MenuItem;)V
    .locals 6

    .line 293
    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p3

    if-ne p3, p1, :cond_0

    .line 295
    invoke-direct {p0}, Ll/ܳۙܳ;->ᩳ()V

    .line 296
    iget-object p1, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    .line 297
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    iget-wide v1, p0, Ll/ܳۙܳ;->֫֫:J

    iget-wide v3, p0, Ll/ܳۙܳ;->ܰ:J

    new-instance v5, Ll/ۨۚ᩷;

    invoke-direct {v5, p0}, Ll/ۨۚ᩷;-><init>(Ljava/lang/Object;)V

    .line 296
    invoke-static/range {v0 .. v5}, Ll/ۚۜܳ;->֫(Lbin/mt/plus/Main;JJLl/ۨۚ᩷;)V

    goto :goto_0

    .line 299
    :cond_0
    aget-object p1, p2, p3

    sget-object p2, Ll/ۢۙܳ;->۬:Ll/ۢۙܳ;

    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    .line 331
    iput-object p1, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    const-wide/16 p1, -0x1

    .line 332
    iput-wide p1, p0, Ll/ܳۙܳ;->֫֫:J

    .line 333
    iput-wide p1, p0, Ll/ܳۙܳ;->ܰ:J

    .line 334
    invoke-direct {p0}, Ll/ܳۙܳ;->᩻()V

    goto :goto_0

    .line 302
    :cond_1
    iput-object p1, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    .line 303
    invoke-direct {p0}, Ll/ܳۙܳ;->ᩳ()V

    .line 304
    invoke-direct {p0}, Ll/ܳۙܳ;->᩻()V

    :goto_0
    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;I[Ll/᩷ۙܳ;Landroid/view/MenuItem;)V
    .locals 6

    .line 257
    invoke-interface {p3}, Landroid/view/MenuItem;->getItemId()I

    move-result p3

    if-ne p3, p1, :cond_0

    .line 259
    iget-object p1, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    .line 260
    invoke-virtual {p1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    iget-wide v1, p0, Ll/ܳۙܳ;->۟:J

    iget-wide v3, p0, Ll/ܳۙܳ;->᩺:J

    new-instance v5, Ll/ܰܿ᩷;

    invoke-direct {v5, p0}, Ll/ܰܿ᩷;-><init>(Ljava/lang/Object;)V

    .line 259
    invoke-static/range {v0 .. v5}, Ll/ۚۜܳ;->֫(Lbin/mt/plus/Main;JJLl/ܰܿ᩷;)V

    goto :goto_0

    .line 263
    :cond_0
    aget-object p1, p2, p3

    .line 264
    invoke-virtual {p1}, Ll/᩷ۙܳ;->ܿ()J

    move-result-wide p2

    invoke-virtual {p1}, Ll/᩷ۙܳ;->ۧ()J

    move-result-wide v0

    .line 315
    iput-wide p2, p0, Ll/ܳۙܳ;->۟:J

    .line 316
    iput-wide v0, p0, Ll/ܳۙܳ;->᩺:J

    .line 324
    iget-object p0, p0, Ll/ܳۙܳ;->᩻֫:Landroid/widget/TextView;

    invoke-static {p2, p3, v0, v1}, Ll/᩷ۙܳ;->ۧ(JJ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;JJ)V
    .locals 0

    .line 315
    iput-wide p1, p0, Ll/ܳۙܳ;->۟:J

    .line 316
    iput-wide p3, p0, Ll/ܳۙܳ;->᩺:J

    .line 324
    iget-object p0, p0, Ll/ܳۙܳ;->᩻֫:Landroid/widget/TextView;

    invoke-static {p1, p2, p3, p4}, Ll/᩷ۙܳ;->ۧ(JJ)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۙܳ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܳۙܳ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;Ll/֡ۚۢ;)V
    .locals 28

    move-object/from16 v0, p0

    .line 486
    iget-object v1, v0, Ll/ܳۙܳ;->ܳ֫:Landroid/widget/CheckBox;

    iget-object v2, v0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    iget-object v3, v0, Ll/ܳۙܳ;->ۨ:Landroid/widget/CheckBox;

    iget-object v4, v0, Ll/ܳۙܳ;->᩶:Landroid/widget/CheckBox;

    iget-object v5, v0, Ll/ܳۙܳ;->ۙ:Ll/ۚۖۡ;

    invoke-direct/range {p0 .. p0}, Ll/ܳۙܳ;->ᩳ()V

    .line 487
    iget-object v6, v0, Ll/ܳۙܳ;->ܽ֫:Ll/ۚۖۡ;

    invoke-virtual {v6}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v9

    .line 490
    iget-object v7, v0, Ll/ܳۙܳ;->᩹:Landroid/widget/CheckBox;

    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v8

    if-eqz v8, :cond_3

    .line 491
    iget-wide v10, v0, Ll/ܳۙܳ;->᩺:J

    .line 492
    iget-wide v12, v0, Ll/ܳۙܳ;->۟:J

    invoke-static {v12, v13, v10, v11}, Ll/᩷ۙܳ;->ᩳ(JJ)J

    move-result-wide v12

    .line 493
    iget-wide v14, v0, Ll/ܳۙܳ;->֫֫:J

    move-wide/from16 v16, v10

    .line 494
    iget-wide v10, v0, Ll/ܳۙܳ;->ܰ:J

    .line 495
    invoke-virtual {v5}, Ll/ۚۖۡ;->ᩳ()I

    move-result v8

    if-nez v8, :cond_0

    const/4 v8, 0x0

    const/16 v18, 0x0

    move-wide/from16 v26, v10

    move-object/from16 v10, v18

    move-wide/from16 v18, v26

    goto :goto_1

    .line 498
    :cond_0
    invoke-virtual {v5}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 499
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v18

    if-nez v18, :cond_1

    .line 500
    invoke-static {v8}, Ll/ۘ۫ۡ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 503
    :cond_1
    :try_start_0
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v18

    if-eqz v18, :cond_2

    move-wide/from16 v18, v10

    const/16 v10, 0x8

    .line 504
    invoke-static {v10, v8}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v8

    goto :goto_0

    :cond_2
    move-wide/from16 v18, v10

    const/16 v10, 0x4a

    .line 506
    invoke-static {v10, v8}, Ll/ۨۘܽ;->֫(ILjava/lang/String;)Ll/ۨۘܽ;

    move-result-object v8
    :try_end_0
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    const/4 v10, 0x0

    move-object/from16 v26, v10

    move-object v10, v8

    move-object/from16 v8, v26

    :goto_1
    move-object/from16 v22, v10

    move-wide/from16 v20, v18

    move-wide/from16 v18, v14

    move-object v14, v8

    goto :goto_2

    :catch_0
    move-exception v0

    .line 509
    invoke-virtual {v2}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v1, v0, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    goto/16 :goto_5

    :cond_3
    const/4 v8, 0x0

    const-wide/16 v10, -0x1

    move-object v14, v8

    move-object/from16 v22, v14

    move-wide v12, v10

    move-wide/from16 v16, v12

    move-wide/from16 v18, v16

    move-wide/from16 v20, v18

    .line 522
    :goto_2
    :try_start_1
    new-instance v15, Ll/ܿۗܳ;

    iget-object v10, v0, Ll/ܳۙܳ;->ۗ:Ll/ۡۙܳ;

    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v11
    :try_end_1
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_1 .. :try_end_1} :catch_2

    move-object v8, v15

    move-object/from16 v23, v2

    move-object/from16 v24, v14

    move-object v2, v15

    move-wide/from16 v14, v16

    move-wide/from16 v16, v18

    move-wide/from16 v18, v20

    move-object/from16 v20, v22

    :try_start_2
    invoke-direct/range {v8 .. v20}, Ll/ܿۗܳ;-><init>(Ljava/lang/String;Ll/ۡۙܳ;ZJJJJLl/ۨۘܽ;)V
    :try_end_2
    .catch Ljava/util/regex/PatternSyntaxException; {:try_start_2 .. :try_end_2} :catch_1

    .line 528
    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v8

    if-eqz v8, :cond_4

    .line 529
    invoke-virtual {v5}, Ll/ۚۖۡ;->ܳ()V

    .line 531
    :cond_4
    invoke-virtual {v6}, Ll/ۚۖۡ;->ܳ()V

    .line 532
    invoke-direct/range {p0 .. p0}, Ll/ܳۙܳ;->ܳ()V

    .line 367
    new-instance v8, Ll/᩻ۙܳ;

    move-object v9, v8

    .line 368
    invoke-virtual {v6}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v10

    iget-object v11, v0, Ll/ܳۙܳ;->ۗ:Ll/ۡۙܳ;

    .line 370
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v12

    .line 371
    invoke-virtual {v7}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v13

    iget-wide v14, v0, Ll/ܳۙܳ;->۟:J

    iget-wide v6, v0, Ll/ܳۙܳ;->᩺:J

    move-wide/from16 v16, v6

    iget-wide v6, v0, Ll/ܳۙܳ;->֫֫:J

    move-wide/from16 v18, v6

    iget-wide v6, v0, Ll/ܳۙܳ;->ܰ:J

    move-wide/from16 v20, v6

    iget-object v1, v0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    move-object/from16 v22, v1

    .line 377
    invoke-virtual {v5}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v23

    .line 378
    invoke-virtual {v3}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v24

    .line 379
    invoke-virtual {v4}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v25

    invoke-direct/range {v9 .. v25}, Ll/᩻ۙܳ;-><init>(Ljava/lang/String;Ll/ۡۙܳ;ZZJJJJLl/ۢۙܳ;Ljava/lang/String;ZZ)V

    .line 534
    new-instance v1, Ll/ۖ᩶ܳ;

    invoke-direct {v1, v8}, Ll/ۖ᩶ܳ;-><init>(Ll/᩻ۙܳ;)V

    sget-object v3, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    invoke-static {v3, v1}, Ll/ۚ۬ᩴ;->removeIf(Ljava/util/Collection;Ljava/util/function/Predicate;)Z

    const/4 v1, 0x0

    .line 535
    invoke-virtual {v3, v1, v8}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 536
    :goto_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/16 v4, 0x64

    if-le v1, v4, :cond_5

    const/4 v1, 0x1

    .line 0
    invoke-static {v3, v1}, Ll/ᩴۖܽ;->֫(Ljava/util/ArrayList;I)V

    goto :goto_3

    .line 539
    :cond_5
    invoke-static {}, Ll/ܳۙܳ;->ܿ()V

    .line 551
    invoke-virtual/range {p1 .. p1}, Ll/֡ۚۢ;->dismiss()V

    .line 552
    new-instance v1, Ll/۟᩶ܳ;

    invoke-direct {v1, v0, v2}, Ll/۟᩶ܳ;-><init>(Ll/ܳۙܳ;Ll/ܿۗܳ;)V

    .line 645
    invoke-virtual {v1}, Ll/۟ܶۡ;->᩻()V

    return-void

    :catch_1
    move-exception v0

    goto :goto_4

    :catch_2
    move-exception v0

    move-object/from16 v23, v2

    move-object/from16 v24, v14

    .line 525
    :goto_4
    invoke-virtual/range {v23 .. v23}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    move-object/from16 v8, v24

    .line 546
    invoke-virtual {v1, v0, v8}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :goto_5
    return-void
.end method

.method public static ֫(Ll/ܳۙܳ;Ll/֡ۚۢ;Landroid/view/View;)V
    .locals 2

    .line 430
    new-instance v0, Ll/ۤ᩶ܳ;

    iget-object v1, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    invoke-virtual {v1}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v1

    invoke-direct {v0, p0, v1, p1, p2}, Ll/ۤ᩶ܳ;-><init>(Ll/ܳۙܳ;Lbin/mt/plus/Main;Ll/֡ۚۢ;Landroid/view/View;)V

    const p0, 0x7f1205b2

    .line 460
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۡ(I)V

    const p0, 0x7f1204ab

    .line 461
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۢ(I)V

    const p0, 0x7f1204ac

    .line 462
    invoke-static {p0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۧ(Ljava/lang/String;)V

    const/4 p0, 0x2

    .line 463
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ܿ(I)V

    .line 464
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ܳ(I)V

    .line 465
    invoke-virtual {v0}, Ll/۬ۗܿ;->֫()V

    const/4 p0, 0x1

    .line 205
    invoke-virtual {v0, p0}, Ll/۬ۗܿ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۙܳ;Z)V
    .locals 0

    .line 119
    iget-object p0, p0, Ll/ܳۙܳ;->ۙ:Ll/ۚۖۡ;

    invoke-virtual {p0, p1}, Ll/ۚۖۡ;->ۧ(Z)V

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۙܳ;[Ljava/lang/CharSequence;Ll/֡ۚۢ;Landroid/view/View;I)V
    .locals 2

    .line 413
    iget-object v0, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    invoke-virtual {v0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v1, 0x7f1205ca

    .line 414
    invoke-virtual {v0, v1}, Ll/᩵ۚۢ;->ۧ(I)V

    aget-object p1, p1, p4

    .line 415
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance p1, Ll/᩸᩶ܳ;

    invoke-direct {p1, p0, p4, p2, p3}, Ll/᩸᩶ܳ;-><init>(Ll/ܳۙܳ;ILl/֡ۚۢ;Landroid/view/View;)V

    const p0, 0x7f12070a

    .line 416
    invoke-virtual {v0, p0, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p0, 0x7f12015e

    const/4 p1, 0x0

    .line 426
    invoke-virtual {v0, p0, p1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 427
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public static synthetic ֫(Ll/ܳۙܳ;[Ll/ۡۙܳ;Landroid/view/MenuItem;)V
    .locals 0

    .line 232
    invoke-interface {p2}, Landroid/view/MenuItem;->getItemId()I

    move-result p2

    aget-object p1, p1, p2

    invoke-direct {p0, p1}, Ll/ܳۙܳ;->֫(Ll/ۡۙܳ;)V

    return-void
.end method

.method public static ֫(Ll/ܽۢܳ;Ll/᩶ۙܳ;Ll/ܽۙܳ;)V
    .locals 11

    .line 718
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v0

    const v1, 0x7f0d00cc

    invoke-virtual {v0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 719
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iget-object v2, p2, Ll/ܽۙܳ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/Object;

    const/4 v5, 0x0

    aput-object v2, v4, v5

    const v2, 0x7f120901

    invoke-static {v2, v4}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v1, 0x7f0a02e0

    .line 720
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۢۢۡ;

    .line 721
    invoke-static {v1}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 792
    new-instance v2, Ll/ۧۙܳ;

    invoke-direct {v2, p2, p0, v1}, Ll/ۧۙܳ;-><init>(Ll/ܽۙܳ;Ll/ܽۢܳ;Ll/ۢۢۡ;)V

    .line 723
    invoke-virtual {v1, v2}, Ll/ۢۢۡ;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 724
    iget v4, p2, Ll/ܽۙܳ;->ۧ:I

    invoke-virtual {v1, v4}, Ll/ۢۢۡ;->setSelection(I)V

    .line 725
    invoke-virtual {v1, v3}, Ll/ۢۢۡ;->setFastScrollEnabled(Z)V

    .line 727
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v4

    .line 728
    invoke-virtual {v4, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v6, 0x7f120189

    const/4 v7, 0x0

    invoke-virtual {v4, v6, v7}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v6, Ll/᩷᩶ܳ;

    invoke-direct {v6, v5, p2, v1}, Ll/᩷᩶ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 729
    invoke-virtual {v4, v6}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 731
    iget-object v6, p2, Ll/ܽۙܳ;->ܿ:Ljava/lang/String;

    const-string v7, "local"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    const-string v9, "\u2195"

    const v10, 0x7f12017b

    if-eqz v8, :cond_0

    .line 732
    new-instance v8, Ll/ۚ᩶ܳ;

    invoke-direct {v8, v5, p2, v2}, Ll/ۚ᩶ܳ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v10, v8}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/᩹᩶ܳ;

    invoke-direct {v2, p0, p2}, Ll/᩹᩶ܳ;-><init>(Ll/ܽۢܳ;Ll/ܽۙܳ;)V

    .line 737
    invoke-virtual {v4, v9, v2}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    goto :goto_0

    .line 741
    :cond_0
    new-instance v8, Ll/᩶᩶ܳ;

    invoke-direct {v8, p2, v2}, Ll/᩶᩶ܳ;-><init>(Ll/ܽۙܳ;Landroid/widget/BaseAdapter;)V

    invoke-virtual {v4, v10, v8}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 748
    :goto_0
    invoke-virtual {v4}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v2

    const v4, 0x7f0a0640

    .line 749
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 750
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    const v4, 0x7f080237

    .line 751
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    const v4, 0x7f12090f

    .line 752
    invoke-static {v4}, Ll/ۙ᩸᩷;->ܽ(I)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v0, v4}, Ll/ܿ᩺;->ۧ(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 753
    new-instance v4, Ll/ۙ᩶ܳ;

    invoke-direct {v4, p1, p0, p2, v2}, Ll/ۙ᩶ܳ;-><init>(Ll/᩶ۙܳ;Ll/ܽۢܳ;Ll/ܽۙܳ;Ll/֡ۚۢ;)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 766
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 768
    invoke-virtual {p0}, Ll/ܽۢܳ;->ᩴ()Lbin/mt/plus/Main;

    move-result-object p1

    invoke-virtual {p1}, Ll/֨ܿ;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    const v0, 0x7f08021e

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 769
    sget v0, Ll/᩹֡᩷;->֫:I

    invoke-static {v0}, Ll/ܰ᩸᩷;->֫(I)Landroid/graphics/PorterDuffColorFilter;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 770
    invoke-virtual {v2}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    .line 771
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    move-result v4

    float-to-int v4, v4

    .line 772
    invoke-virtual {p1, v5, v5, v4, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 774
    new-instance v4, Landroid/text/SpannableString;

    invoke-direct {v4, v9}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 775
    new-instance v6, Landroid/text/style/ImageSpan;

    invoke-direct {v6, p1}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x21

    invoke-virtual {v4, v6, v5, v3, p1}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 776
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 778
    :cond_1
    new-instance p1, Ll/ۗ᩶ܳ;

    invoke-direct {p1, v2, p2, p0}, Ll/ۗ᩶ܳ;-><init>(Ll/֡ۚۢ;Ll/ܽۙܳ;Ll/ܽۢܳ;)V

    invoke-virtual {v1, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 786
    invoke-static {v2}, Ll/ۡܶۡ;->ۧ(Ll/֡ۚۢ;)V

    return-void
.end method

.method public static bridge synthetic ۜ(Ll/ܳۙܳ;)Ll/᩶ۙܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۙܳ;->ᩳ֫:Ll/᩶ۙܳ;

    return-object p0
.end method

.method public static bridge synthetic ۡ(Ll/ܳۙܳ;)Ll/ܽۢܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۙܳ;->ܺ֫:Ll/ܽۢܳ;

    return-object p0
.end method

.method public static bridge synthetic ۢ(Ll/ܳۙܳ;)Ll/ܽ᩷ܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۙܳ;->ۡ֫:Ll/ܽ᩷ܳ;

    return-object p0
.end method

.method public static bridge synthetic ۧ()Ljava/util/concurrent/ExecutorService;
    .locals 1

    .line 0
    sget-object v0, Ll/ܳۙܳ;->ۖ֫:Ljava/util/concurrent/ExecutorService;

    return-object v0
.end method

.method public static ۧ(Ll/ܳۙܳ;)V
    .locals 9

    .line 243
    invoke-static {}, Ll/᩷ۙܳ;->values()[Ll/᩷ۙܳ;

    move-result-object v0

    .line 244
    array-length v1, v0

    .line 245
    new-instance v2, Ll/᩸ۖ;

    iget-object v3, p0, Ll/ܳۙܳ;->᩻֫:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const/4 v5, 0x0

    .line 68
    invoke-direct {v2, v4, v3, v5}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 246
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f12021d

    const/4 v6, 0x1

    .line 247
    invoke-virtual {v3, v5, v1, v6, v4}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v4

    invoke-interface {v4, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    const/4 v4, 0x0

    .line 248
    :goto_0
    array-length v7, v0

    if-ge v4, v7, :cond_1

    if-nez v4, :cond_0

    const/4 v7, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v4, 0x1

    .line 251
    :goto_1
    aget-object v8, v0, v4

    invoke-virtual {v8}, Ll/᩷ۙܳ;->֫()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v5, v4, v7, v8}, Ll/ۗۜ;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-interface {v7, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 253
    :cond_1
    invoke-virtual {v3, v5, v6, v6}, Ll/ۗۜ;->setGroupCheckable(IZZ)V

    .line 254
    iget-wide v4, p0, Ll/ܳۙܳ;->۟:J

    iget-wide v7, p0, Ll/ܳۙܳ;->᩺:J

    invoke-static {v4, v5, v7, v8}, Ll/᩷ۙܳ;->֫(JJ)Ll/᩷ۙܳ;

    move-result-object v4

    if-nez v4, :cond_2

    move v4, v1

    goto :goto_2

    .line 255
    :cond_2
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    :goto_2
    invoke-virtual {v3, v4}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v6}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 256
    new-instance v3, Ll/ᩴ᩶ܳ;

    invoke-direct {v3, p0, v1, v0}, Ll/ᩴ᩶ܳ;-><init>(Ll/ܳۙܳ;I[Ll/᩷ۙܳ;)V

    invoke-virtual {v2, v3}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 268
    invoke-static {v2}, Ll/᩶ۖ;->֫(Ll/᩸ۖ;)Ll/ᩳ᩷;

    move-result-object p0

    invoke-virtual {p0}, Ll/ᩳ᩷;->ܳ()V

    return-void
.end method

.method public static ۧ(Ll/ܳۙܳ;JJ)V
    .locals 1

    const/4 v0, 0x0

    .line 331
    iput-object v0, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    .line 332
    iput-wide p1, p0, Ll/ܳۙܳ;->֫֫:J

    .line 333
    iput-wide p3, p0, Ll/ܳۙܳ;->ܰ:J

    .line 334
    invoke-direct {p0}, Ll/ܳۙܳ;->᩻()V

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܳۙܳ;Landroid/view/View;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܳۙܳ;->֫(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic ܳ(Ll/ܳۙܳ;)Landroid/view/View;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۙܳ;->ۤ:Landroid/view/View;

    return-object p0
.end method

.method private ܳ()V
    .locals 3

    .line 470
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۙܳ;->ۙ:Ll/ۚۖۡ;

    invoke-virtual {v1}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "file_advanced_search"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۙܳ;->ۗ:Ll/ۡۙܳ;

    .line 471
    invoke-virtual {v1}, Ll/ۡۙܳ;->ܿ()I

    move-result v1

    const-string v2, "fsnm"

    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۙܳ;->ۨ:Landroid/widget/CheckBox;

    .line 472
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    const-string v2, "file_search_ignore_case"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۙܳ;->᩶:Landroid/widget/CheckBox;

    .line 473
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const-string v2, "file_search_regex"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    iget-object v1, p0, Ll/ܳۙܳ;->ܳ֫:Landroid/widget/CheckBox;

    .line 474
    invoke-virtual {v1}, Landroid/widget/CompoundButton;->isChecked()Z

    move-result v1

    const-string v2, "file_search_sub"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putBoolean(Ljava/lang/String;Z)Ll/۬ۤۡ;

    move-result-object v0

    iget-wide v1, p0, Ll/ܳۙܳ;->᩺:J

    .line 475
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "file_search_max_size"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    iget-wide v1, p0, Ll/ܳۙܳ;->۟:J

    .line 476
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "file_search_min_size"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    iget-wide v1, p0, Ll/ܳۙܳ;->ܰ:J

    .line 477
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "fsmaxt"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    iget-wide v1, p0, Ll/ܳۙܳ;->֫֫:J

    .line 478
    invoke-static {v1, v2}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "fsmint"

    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 480
    iget-object v1, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ll/ۢۙܳ;->ۧ()I

    move-result v1

    :goto_0
    const-string v2, "fstp"

    .line 479
    invoke-interface {v0, v1, v2}, Ll/۬ۤۡ;->֫(ILjava/lang/String;)Ll/۬ۤۡ;

    move-result-object v0

    .line 481
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static bridge synthetic ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 0
    sget-object v0, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public static ܽ(Ll/ܳۙܳ;)V
    .locals 11

    .line 276
    invoke-static {}, Ll/ۢۙܳ;->values()[Ll/ۢۙܳ;

    move-result-object v0

    .line 277
    array-length v1, v0

    .line 278
    new-instance v2, Ll/᩸ۖ;

    iget-object v3, p0, Ll/ܳۙܳ;->᩷֫:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const/4 v5, 0x0

    .line 68
    invoke-direct {v2, v4, v3, v5}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 279
    invoke-virtual {v2}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    const v4, 0x7f12021d

    const/4 v6, 0x1

    .line 280
    invoke-virtual {v3, v5, v1, v6, v4}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v4

    invoke-interface {v4, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    const/4 v4, 0x0

    .line 281
    :goto_0
    array-length v7, v0

    if-ge v4, v7, :cond_1

    if-nez v4, :cond_0

    const/4 v7, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v4, 0x1

    .line 284
    :goto_1
    aget-object v8, v0, v4

    invoke-virtual {v8}, Ll/ۢۙܳ;->֫()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v5, v4, v7, v8}, Ll/ۗۜ;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-interface {v7, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 286
    :cond_1
    invoke-virtual {v3, v5, v6, v6}, Ll/ۗۜ;->setGroupCheckable(IZZ)V

    .line 287
    iget-object v4, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    if-nez v4, :cond_2

    .line 288
    iget-wide v7, p0, Ll/ܳۙܳ;->֫֫:J

    const-wide/16 v9, -0x1

    cmp-long v5, v7, v9

    if-nez v5, :cond_2

    iget-wide v7, p0, Ll/ܳۙܳ;->ܰ:J

    cmp-long v5, v7, v9

    if-nez v5, :cond_2

    .line 289
    sget-object v4, Ll/ۢۙܳ;->۬:Ll/ۢۙܳ;

    :cond_2
    if-nez v4, :cond_3

    move v4, v1

    goto :goto_2

    .line 291
    :cond_3
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    :goto_2
    invoke-virtual {v3, v4}, Ll/ۗۜ;->findItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v6}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 292
    new-instance v3, Ll/ۘ᩶ܳ;

    invoke-direct {v3, p0, v1, v0}, Ll/ۘ᩶ܳ;-><init>(Ll/ܳۙܳ;I[Ll/ۢۙܳ;)V

    invoke-virtual {v2, v3}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 308
    invoke-static {v2}, Ll/᩶ۖ;->֫(Ll/᩸ۖ;)Ll/ᩳ᩷;

    move-result-object p0

    invoke-virtual {p0}, Ll/ᩳ᩷;->ܳ()V

    return-void
.end method

.method public static ܿ()V
    .locals 3

    .line 362
    sget-object v0, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v0}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v0

    sget-object v1, Ll/ܳۙܳ;->ۘ֫:Ljava/util/ArrayList;

    .line 363
    invoke-static {v1}, Ll/᩻ۙܳ;->֫(Ljava/util/List;)[B

    move-result-object v1

    const-string v2, "sir"

    .line 362
    invoke-interface {v0, v2, v1}, Ll/۬ۤۡ;->֫(Ljava/lang/String;[B)Ll/۬ۤۡ;

    move-result-object v0

    .line 363
    invoke-interface {v0}, Ll/۬ۤۡ;->apply()V

    return-void
.end method

.method public static ܿ(Ll/ܳۙܳ;)V
    .locals 0

    .line 185
    invoke-direct {p0}, Ll/ܳۙܳ;->ܳ()V

    .line 186
    iget-object p0, p0, Ll/ܳۙܳ;->ۧ֫:Ljava/lang/Runnable;

    if-eqz p0, :cond_0

    .line 187
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method private ᩳ()V
    .locals 3

    .line 349
    iget-object v0, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    if-eqz v0, :cond_0

    .line 350
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۢۙܳ;->֫(J)[J

    move-result-object v0

    const/4 v1, 0x0

    .line 351
    aget-wide v1, v0, v1

    iput-wide v1, p0, Ll/ܳۙܳ;->֫֫:J

    const/4 v1, 0x1

    .line 352
    aget-wide v1, v0, v1

    iput-wide v1, p0, Ll/ܳۙܳ;->ܰ:J

    :cond_0
    return-void
.end method

.method public static ᩳ(Ll/ܳۙܳ;)V
    .locals 7

    .line 222
    invoke-static {}, Ll/ۡۙܳ;->values()[Ll/ۡۙܳ;

    move-result-object v0

    .line 223
    new-instance v1, Ll/᩸ۖ;

    iget-object v2, p0, Ll/ܳۙܳ;->۫:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    .line 68
    invoke-direct {v1, v3, v2, v4}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 224
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v3, 0x7f12090a

    .line 225
    invoke-static {v2, v3}, Ll/۬ۜ;->֫(Ll/ۗۜ;I)V

    const/4 v3, 0x0

    .line 226
    :goto_0
    array-length v5, v0

    const/4 v6, 0x1

    if-ge v3, v5, :cond_0

    .line 227
    aget-object v5, v0, v3

    invoke-virtual {v5}, Ll/ۡۙܳ;->֫()I

    move-result v5

    invoke-virtual {v2, v4, v3, v3, v5}, Ll/ۗۜ;->add(IIII)Landroid/view/MenuItem;

    move-result-object v5

    invoke-interface {v5, v6}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 229
    :cond_0
    invoke-virtual {v2, v4, v6, v6}, Ll/ۗۜ;->setGroupCheckable(IZZ)V

    .line 230
    iget-object v3, p0, Ll/ܳۙܳ;->ۗ:Ll/ۡۙܳ;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    invoke-virtual {v2, v3}, Ll/ۗۜ;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {v2, v6}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    .line 231
    new-instance v2, Ll/ܺ᩶ܳ;

    invoke-direct {v2, p0, v0}, Ll/ܺ᩶ܳ;-><init>(Ll/ܳۙܳ;[Ll/ۡۙܳ;)V

    invoke-virtual {v1, v2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 235
    invoke-static {v1}, Ll/᩶ۖ;->֫(Ll/᩸ۖ;)Ll/ᩳ᩷;

    move-result-object p0

    invoke-virtual {p0}, Ll/ᩳ᩷;->ܳ()V

    return-void
.end method

.method public static bridge synthetic ᩷(Ll/ܳۙܳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۙܳ;->ܿ֫:Ljava/util/List;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ܳۙܳ;)Ljava/util/List;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܳۙܳ;->ۛ:Ljava/util/List;

    return-object p0
.end method

.method private ᩻()V
    .locals 4

    .line 341
    iget-object v0, p0, Ll/ܳۙܳ;->ۜ֫:Ll/ۢۙܳ;

    if-nez v0, :cond_0

    iget-wide v0, p0, Ll/ܳۙܳ;->֫֫:J

    iget-wide v2, p0, Ll/ܳۙܳ;->ܰ:J

    invoke-static {v0, v1, v2, v3}, Ll/ۢۙܳ;->֫(JJ)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 342
    :cond_0
    invoke-virtual {v0}, Ll/ۢۙܳ;->֫()Ljava/lang/String;

    move-result-object v0

    .line 341
    :goto_0
    iget-object v1, p0, Ll/ܳۙܳ;->᩷֫:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    .line 713
    :goto_0
    iget-object v0, p0, Ll/ܳۙܳ;->᩸:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 714
    sput-boolean p2, Ll/ܳۙܳ;->ᩴ֫:Z

    return-void
.end method

.method public final ֫(Ljava/util/ArrayList;Ljava/lang/Runnable;)V
    .locals 0

    .line 178
    iput-object p1, p0, Ll/ܳۙܳ;->ܿ֫:Ljava/util/List;

    .line 179
    iput-object p2, p0, Ll/ܳۙܳ;->ۧ֫:Ljava/lang/Runnable;

    .line 180
    iget-object p1, p0, Ll/ܳۙܳ;->ۢ֫:Landroid/widget/TextView;

    const p2, 0x7f12090f

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    .line 181
    iget-object p1, p0, Ll/ܳۙܳ;->ܳ֫:Landroid/widget/CheckBox;

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final ֫(Ljava/util/List;)V
    .locals 0

    .line 174
    iput-object p1, p0, Ll/ܳۙܳ;->ۛ:Ljava/util/List;

    return-void
.end method
