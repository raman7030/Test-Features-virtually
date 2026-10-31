.class public final Ll/ۚۗ᩷;
.super Ll/۟ܶۡ;
.source "Z3WS"


# instance fields
.field public final synthetic ۜ:Ll/ۗܺ᩷;

.field public ܳ:Ljava/util/List;

.field public final synthetic ᩻:Ll/᩶ۗ᩷;


# direct methods
.method public constructor <init>(Ll/᩶ۗ᩷;Ll/ۗܺ᩷;)V
    .locals 0

    .line 64
    iput-object p1, p0, Ll/ۚۗ᩷;->᩻:Ll/᩶ۗ᩷;

    iput-object p2, p0, Ll/ۚۗ᩷;->ۜ:Ll/ۗܺ᩷;

    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method

.method public static synthetic ֫(Ll/ۚۗ᩷;I)V
    .locals 1

    .line 103
    iget-object v0, p0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۟᩵ۡ;

    invoke-direct {p0, p1}, Ll/ۚۗ᩷;->֫(Ll/۟᩵ۡ;)V

    return-void
.end method

.method private ֫(Ll/۟᩵ۡ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 127
    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    iget-object v3, v0, Ll/ۚۗ᩷;->ۜ:Ll/ۗܺ᩷;

    invoke-direct {v2, v3}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 128
    new-instance v4, Ljava/util/ArrayList;

    const/4 v5, 0x5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    const v5, 0x7f120199

    const v6, 0x7f120198

    const v7, 0x7f120197

    const v8, 0x7f120196

    const v9, 0x7f120195

    const v10, 0x7f120194

    const v11, 0x7f12018f

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-nez v1, :cond_0

    .line 130
    invoke-virtual {v2, v11}, Ll/᩵ۚۢ;->ۧ(I)V

    .line 131
    new-instance v14, Ll/᩹ۗ᩷;

    invoke-direct {v14, v10, v13}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 132
    new-instance v10, Ll/᩹ۗ᩷;

    invoke-direct {v10, v9, v13}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 133
    new-instance v9, Ll/᩹ۗ᩷;

    invoke-direct {v9, v8, v13}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    new-instance v8, Ll/᩹ۗ᩷;

    invoke-direct {v8, v7, v13}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    new-instance v7, Ll/᩹ۗ᩷;

    invoke-direct {v7, v6, v12}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    new-instance v6, Ll/᩹ۗ᩷;

    invoke-direct {v6, v5, v13}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    .line 138
    :cond_0
    invoke-virtual/range {p1 .. p1}, Ll/۟᩵ۡ;->ᩳ()J

    move-result-wide v14

    invoke-static {v14, v15}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2, v12}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 139
    invoke-virtual/range {p1 .. p1}, Ll/۟᩵ۡ;->ۧ()Ljava/util/List;

    move-result-object v12

    const/4 v14, 0x5

    .line 140
    new-instance v15, Ll/᩹ۗ᩷;

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    check-cast v12, Ljava/util/ArrayList;

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    invoke-direct {v15, v10, v11}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    new-instance v10, Ll/᩹ۗ᩷;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v11

    invoke-direct {v10, v9, v11}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    new-instance v9, Ll/᩹ۗ᩷;

    const/4 v10, 0x4

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2

    const/4 v10, 0x2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v12, v10}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_0

    :cond_1
    const/4 v10, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v10, 0x1

    :goto_1
    invoke-direct {v9, v8, v10}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 143
    new-instance v8, Ll/᩹ۗ᩷;

    const/4 v9, 0x3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v12, v9}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v9

    invoke-direct {v8, v7, v9}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    new-instance v7, Ll/᩹ۗ᩷;

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v8

    invoke-direct {v7, v6, v8}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    new-instance v6, Ll/᩹ۗ᩷;

    invoke-direct {v6, v5, v13}, Ll/᩹ۗ᩷;-><init>(IZ)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 147
    :goto_2
    invoke-static {v4}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    new-instance v6, Ll/ۖۗ᩷;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-interface {v5, v6}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v5

    new-instance v6, Ll/ۘۗ᩷;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-interface {v5, v6}, Ll/ܿ᩺ᩴ;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Ll/᩹ۗ᩷;

    if-nez v1, :cond_3

    const v6, 0x7f12018f

    .line 149
    invoke-virtual {v2, v6}, Ll/᩵ۚۢ;->ۧ(I)V

    goto :goto_3

    .line 151
    :cond_3
    invoke-virtual/range {p1 .. p1}, Ll/۟᩵ۡ;->ᩳ()J

    move-result-wide v6

    invoke-static {v6, v7}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;)V

    .line 152
    :goto_3
    array-length v6, v5

    new-array v6, v6, [Z

    .line 153
    invoke-static {v6, v13}, Ljava/util/Arrays;->fill([ZZ)V

    .line 154
    new-instance v7, Ll/ᩴۗ᩷;

    invoke-direct {v7, v5}, Ll/ᩴۗ᩷;-><init>([Ll/᩹ۗ᩷;)V

    invoke-virtual {v2, v5, v6, v7}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;[ZLandroid/content/DialogInterface$OnMultiChoiceClickListener;)V

    new-instance v5, Ll/᩵ۗ᩷;

    invoke-direct {v5, v0, v3, v1, v4}, Ll/᩵ۗ᩷;-><init>(Ll/ۚۗ᩷;Ll/ۗܺ᩷;Ll/۟᩵ۡ;Ljava/util/ArrayList;)V

    const v1, 0x7f12070a

    .line 155
    invoke-virtual {v2, v1, v5}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    const/4 v4, 0x0

    .line 156
    invoke-virtual {v2, v1, v4}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12042f

    .line 157
    invoke-virtual {v2, v1, v4}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 158
    invoke-virtual {v2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 159
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    new-instance v2, Ll/ܽ۠ۢ;

    invoke-direct {v2, v3, v13}, Ll/ܽ۠ۢ;-><init>(Ll/ۗܺ᩷;I)V

    .line 160
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 9

    .line 79
    iget-object v0, p0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    if-nez v0, :cond_0

    const v0, 0x7f12018e

    .line 80
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    return-void

    .line 81
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 82
    invoke-direct {p0, v1}, Ll/ۚۗ᩷;->֫(Ll/۟᩵ۡ;)V

    return-void

    .line 84
    :cond_1
    iget-object v0, p0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/CharSequence;

    const/4 v2, 0x0

    .line 85
    :goto_0
    iget-object v3, p0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    .line 86
    iget-object v3, p0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟᩵ۡ;

    .line 87
    new-instance v4, Landroid/text/SpannableStringBuilder;

    invoke-virtual {v3}, Ll/۟᩵ۡ;->ᩳ()J

    move-result-wide v5

    invoke-static {v5, v6}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 88
    invoke-virtual {v3}, Ll/۟᩵ۡ;->֫()Ljava/lang/String;

    move-result-object v5

    .line 89
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    const-string v6, " | "

    .line 90
    invoke-virtual {v4, v6}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    :cond_2
    const-string v5, "\n"

    .line 92
    invoke-virtual {v4, v5}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 93
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v5

    .line 94
    invoke-virtual {v3}, Ll/۟᩵ۡ;->ܽ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 95
    invoke-virtual {v4}, Landroid/text/SpannableStringBuilder;->length()I

    move-result v3

    .line 96
    new-instance v6, Landroid/text/style/ForegroundColorSpan;

    sget v7, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v6, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    const/16 v7, 0x11

    invoke-virtual {v4, v6, v5, v3, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 97
    new-instance v6, Landroid/text/style/AbsoluteSizeSpan;

    const/high16 v8, 0x41400000    # 12.0f

    invoke-static {v8}, Ll/ۧ᩸ۡ;->ܽ(F)I

    move-result v8

    invoke-direct {v6, v8}, Landroid/text/style/AbsoluteSizeSpan;-><init>(I)V

    invoke-virtual {v4, v6, v5, v3, v7}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 98
    aput-object v4, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 100
    :cond_3
    iget-object v2, p0, Ll/ۚۗ᩷;->ۜ:Ll/ۗܺ᩷;

    invoke-virtual {v2}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v3

    const v4, 0x7f12018f

    .line 101
    invoke-virtual {v3, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v4, Ll/ۡۗ᩷;

    invoke-direct {v4, p0}, Ll/ۡۗ᩷;-><init>(Ll/ۚۗ᩷;)V

    .line 102
    invoke-virtual {v3, v0, v4}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    const v4, 0x7f12015e

    .line 105
    invoke-virtual {v3, v4, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 106
    invoke-virtual {v3}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 108
    invoke-virtual {v1}, Ll/֡ۚۢ;->ۧ()Ll/ۖܿ;

    move-result-object v3

    new-instance v4, Ll/ܺۗ᩷;

    invoke-direct {v4, p0, v2, v1, v0}, Ll/ܺۗ᩷;-><init>(Ll/ۚۗ᩷;Ll/ۗܺ᩷;Ll/֡ۚۢ;[Ljava/lang/CharSequence;)V

    invoke-virtual {v3, v4}, Ll/ۢۢۡ;->setOnItemLongClickListener(Landroid/widget/AdapterView$OnItemLongClickListener;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 166
    iget-object v0, p0, Ll/ۚۗ᩷;->ۜ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 69
    iget-object v0, p0, Ll/ۚۗ᩷;->ۜ:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 14

    .line 74
    sget v0, Ll/ۨۖۡ;->֫:I

    const/16 v0, 0x1053

    .line 1074
    invoke-static {v0}, Ll/ᩳᩴۡ;->ᩳ(I)Ll/ᩳᩴۡ;

    move-result-object v0

    .line 1075
    invoke-virtual {v0}, Ll/ᩳᩴۡ;->ܿ()Ll/᩻ᩴۡ;

    move-result-object v0

    .line 608
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 609
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۜ()I

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-eq v1, v2, :cond_0

    const/4 v0, 0x0

    goto :goto_3

    .line 632
    :cond_0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_3

    .line 611
    :cond_1
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۜ()I

    move-result v1

    .line 612
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v1, :cond_4

    .line 614
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۡ()J

    move-result-wide v6

    .line 616
    invoke-virtual {v0}, Ll/᩻ᩴۡ;->ۘ()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0x5d

    .line 1126
    invoke-virtual {v8, v9, v4}, Ljava/lang/String;->indexOf(II)I

    move-result v9

    const/4 v10, -0x1

    if-eq v9, v10, :cond_2

    .line 618
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v10

    sub-int/2addr v10, v2

    if-eq v9, v10, :cond_2

    add-int/lit8 v9, v9, 0x1

    .line 619
    invoke-virtual {v8, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "substring(...)"

    invoke-static {v10, v11}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 620
    invoke-virtual {v8, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v11}, Ll/ۧ᩶᩵;->ۧ(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const-string v10, ""

    .line 622
    :goto_1
    new-instance v9, Lbin/mt/json/JSONArray;

    invoke-direct {v9, v8}, Lbin/mt/json/JSONArray;-><init>(Ljava/lang/String;)V

    .line 623
    new-instance v8, Ljava/util/ArrayList;

    invoke-virtual {v9}, Lbin/mt/json/JSONArray;->size()I

    move-result v11

    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 624
    invoke-virtual {v9}, Lbin/mt/json/JSONArray;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_2
    if-ge v12, v11, :cond_3

    .line 625
    invoke-virtual {v9, v12}, Lbin/mt/json/JSONArray;->getInt(I)I

    move-result v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v12, v12, 0x1

    goto :goto_2

    .line 627
    :cond_3
    new-instance v9, Ll/۟᩵ۡ;

    invoke-direct {v9, v6, v7, v10, v8}, Ll/۟᩵ۡ;-><init>(JLjava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v3, v4, v9}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    move-object v0, v3

    .line 74
    :goto_3
    iput-object v0, p0, Ll/ۚۗ᩷;->ܳ:Ljava/util/List;

    return-void

    .line 608
    :cond_5
    new-instance v1, Ll/֫ۛۡ;

    const v2, 0x7f120520

    .line 232
    invoke-static {v0, v2}, Ll/֫ۘۡ;->֫(Ll/᩻ᩴۡ;I)Ljava/lang/String;

    move-result-object v0

    .line 16
    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 608
    throw v1
.end method

.method public final ᩳ()V
    .locals 0

    .line 171
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
