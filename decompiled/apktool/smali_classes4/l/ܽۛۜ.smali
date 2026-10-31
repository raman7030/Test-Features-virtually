.class public final Ll/ܽۛۜ;
.super Ljava/lang/Object;
.source "H74F"


# direct methods
.method public static ֫(Ljava/util/List;Ll/ۨ᩵֫;)I
    .locals 6

    .line 151
    iget-object p1, p1, Ll/ۨ᩵֫;->ۚ:Ll/ۢ۬ܺ;

    invoke-virtual {p1}, Ll/ۢ۬ܺ;->values()Ll/᩺ۗܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/᩺ۗܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫᩵֫;

    .line 86
    iget-object v2, v0, Ll/۫᩵֫;->֫:Ll/۬᩵֫;

    iget-object v3, v0, Ll/۫᩵֫;->ۧ:Ll/ܳ۬ܺ;

    iget v2, v2, Ll/۬᩵֫;->ܿ:I

    const/4 v4, 0x2

    if-ne v2, v4, :cond_0

    .line 152
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    const/4 v4, 0x1

    if-eq v2, v4, :cond_1

    goto :goto_0

    .line 155
    :cond_1
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 156
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_0

    .line 157
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ۤۜ;

    .line 158
    invoke-virtual {v3}, Ll/۟ۤۜ;->᩻()I

    move-result v5

    if-ne v5, v2, :cond_2

    .line 159
    invoke-virtual {v3}, Ll/۟ۤۜ;->ܳ()Ll/᩺᩵֫;

    move-result-object v3

    invoke-virtual {v3}, Ll/᩺᩵֫;->֫()Ll/۬᩵֫;

    move-result-object v3

    iget-object v5, v0, Ll/۫᩵֫;->֫:Ll/۬᩵֫;

    invoke-virtual {v3, v5}, Ll/۬᩵֫;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/2addr v1, v4

    return v1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return v1
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/HashMap;
    .locals 3

    .line 287
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 288
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 298
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    .line 290
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Landroid/content/res/Resources;Ll/ܰ᩵֫;)Ljava/util/List;
    .locals 17

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    .line 91
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    .line 51
    invoke-virtual/range {p1 .. p1}, Ll/ܰ᩵֫;->֫()Ll/ܳ۬ܺ;

    move-result-object v3

    .line 375
    invoke-virtual {v3, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v3

    const/4 v4, 0x0

    .line 51
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩺᩵֫;

    .line 52
    invoke-virtual {v5}, Ll/᩺᩵֫;->ۧ()I

    move-result v6

    const/4 v7, 0x2

    if-eq v6, v7, :cond_1

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    .line 55
    :goto_1
    iget v7, v5, Ll/᩺᩵֫;->ۧ:I

    if-ge v6, v7, :cond_0

    .line 56
    invoke-virtual {v5, v6}, Ll/᩺᩵֫;->֫(I)Ll/۠ᩴ֫;

    move-result-object v7

    .line 115
    invoke-virtual {v5, v6, v1}, Ll/᩺᩵֫;->֫(IZ)Z

    move-result v8

    if-eqz v8, :cond_3

    .line 57
    iget v8, v7, Ll/۠ᩴ֫;->۟:I

    and-int/lit16 v8, v8, 0x4000

    if-eqz v8, :cond_2

    goto :goto_2

    .line 61
    :cond_2
    new-instance v8, Ll/֫ۛۜ;

    add-int/lit8 v9, v4, 0x1

    invoke-direct {v8, v5, v6, v7, v4}, Ll/֫ۛۜ;-><init>(Ll/᩺᩵֫;ILl/۠ᩴ֫;I)V

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v4, v9

    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 64
    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 65
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    .line 68
    :cond_5
    new-instance v3, Ll/ܰۤۜ;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v3}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 81
    new-instance v3, Ll/᩸ۢ᩷;

    move-object/from16 v4, p0

    invoke-direct {v3, v4}, Ll/᩸ۢ᩷;-><init>(Landroid/content/res/Resources;)V

    .line 82
    new-instance v4, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫ۛۜ;

    .line 84
    invoke-virtual {v6}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v6

    invoke-virtual {v3, v6}, Ll/᩸ۢ᩷;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 86
    :cond_6
    invoke-static {v4}, Ll/ܽۛۜ;->֫(Ljava/util/ArrayList;)Ljava/util/HashMap;

    move-result-object v5

    .line 87
    new-instance v6, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v7, 0x0

    .line 88
    :goto_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x1

    if-ge v7, v8, :cond_c

    .line 89
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 90
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֫ۛۜ;

    invoke-virtual {v10}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v10

    .line 271
    iget-object v11, v10, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    iget-object v12, v10, Ll/۠ᩴ֫;->ۧ֫:Ljava/lang/String;

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_7

    .line 272
    iget-object v10, v10, Ll/۠ᩴ֫;->ܳ:Ljava/lang/String;

    goto :goto_6

    .line 274
    :cond_7
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_8
    const/16 v10, 0x2f

    .line 277
    invoke-virtual {v12, v10}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v10

    if-ltz v10, :cond_9

    add-int/lit8 v10, v10, 0x1

    .line 279
    invoke-virtual {v12, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v12

    .line 281
    :cond_9
    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_a

    :goto_5
    move-object v10, v11

    goto :goto_6

    :cond_a
    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v12, v10}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    .line 298
    :goto_6
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    .line 91
    invoke-static {v5, v11, v2}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Integer;

    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    move-result v11

    if-le v11, v9, :cond_b

    .line 92
    invoke-static {v10}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_b

    const-string v9, " \u00b7 "

    .line 0
    invoke-static {v8, v9, v10}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 91
    :cond_b
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    .line 96
    :cond_c
    invoke-static {v6}, Ll/ܽۛۜ;->֫(Ljava/util/ArrayList;)Ljava/util/HashMap;

    move-result-object v4

    .line 97
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 98
    new-instance v7, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    :goto_7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v1, v8, :cond_10

    .line 100
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֫ۛۜ;

    .line 101
    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    .line 298
    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v11, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    .line 103
    invoke-static {v4, v11, v2}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    if-le v12, v9, :cond_d

    .line 104
    invoke-static {v5, v11, v2}, Ll/ܰ۬ᩴ;->getOrDefault(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    add-int/2addr v12, v9

    .line 105
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v5, v11, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, " ("

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, ")"

    .line 0
    invoke-static {v12, v10, v9}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v10

    :cond_d
    move-object v15, v10

    .line 108
    new-instance v9, Ll/۟ۤۜ;

    .line 109
    invoke-virtual {v8}, Ll/֫ۛۜ;->ܽ()Ll/᩺᩵֫;

    move-result-object v12

    .line 110
    invoke-virtual {v8}, Ll/֫ۛۜ;->ܳ()I

    move-result v13

    .line 111
    invoke-virtual {v8}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v14

    .line 113
    invoke-virtual {v8}, Ll/֫ۛۜ;->֫()Ll/۠ᩴ֫;

    move-result-object v8

    .line 249
    iget v10, v8, Ll/۠ᩴ֫;->᩷֫:I

    if-lez v10, :cond_e

    iget v11, v8, Ll/۠ᩴ֫;->۠:I

    if-lez v11, :cond_e

    .line 250
    invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I

    move-result v10

    goto :goto_8

    :cond_e
    const/4 v10, -0x1

    :goto_8
    if-lez v10, :cond_f

    .line 265
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, "P"

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    goto :goto_9

    :cond_f
    invoke-virtual {v3, v8}, Ll/᩸ۢ᩷;->֫(Ll/۠ᩴ֫;)Ljava/lang/String;

    move-result-object v8

    :goto_9
    move-object/from16 v16, v8

    move-object v11, v9

    .line 113
    invoke-direct/range {v11 .. v16}, Ll/۟ۤۜ;-><init>(Ll/᩺᩵֫;ILl/۠ᩴ֫;Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    const/4 v9, 0x1

    goto/16 :goto_7

    .line 116
    :cond_10
    invoke-static {v7}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۨ᩵֫;Ll/۟ۤۜ;)Ll/ۨ᩵֫;
    .locals 2

    .line 125
    invoke-virtual {p0}, Ll/ۨ᩵֫;->֫()Ll/ۛ᩵֫;

    move-result-object p0

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 126
    invoke-virtual {p0, v1, v0}, Ll/ۛ᩵֫;->֫(IZ)Ll/ۛ᩵֫;

    move-result-object p0

    .line 127
    invoke-virtual {p0, v1}, Ll/ۛ᩵֫;->֫(I)Ll/ۛ᩵֫;

    move-result-object p0

    new-instance v0, Ll/۫᩵֫;

    .line 129
    invoke-virtual {p1}, Ll/۟ۤۜ;->ܳ()Ll/᩺᩵֫;

    move-result-object v1

    invoke-virtual {v1}, Ll/᩺᩵֫;->֫()Ll/۬᩵֫;

    move-result-object v1

    .line 130
    invoke-virtual {p1}, Ll/۟ۤۜ;->᩻()I

    move-result p1

    .line 65
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1}, Ll/ܳ۬ܺ;->of(Ljava/lang/Object;)Ll/ܳ۬ܺ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/۫᩵֫;-><init>(Ll/۬᩵֫;Ljava/util/List;)V

    .line 128
    invoke-virtual {p0, v0}, Ll/ۛ᩵֫;->֫(Ll/۫᩵֫;)Ll/ۛ᩵֫;

    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ll/ۛ᩵֫;->֫()Ll/ۨ᩵֫;

    move-result-object p0

    return-object p0
.end method
