.class public final Ll/᩷ۤܳ;
.super Ljava/lang/Object;
.source "YAPP"


# direct methods
.method public static ֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 8

    .line 90
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 91
    new-instance v1, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 92
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 93
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۜۤܳ;

    .line 94
    invoke-static {v3}, Ll/ۜۤܳ;->ۧ(Ll/ۜۤܳ;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 96
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_4

    .line 98
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v3, 0x0

    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۜۤܳ;

    .line 100
    invoke-static {v4}, Ll/ۜۤܳ;->ۧ(Ll/ۜۤܳ;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 101
    invoke-static {v4}, Ll/ۜۤܳ;->֫(Ll/ۜۤܳ;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    .line 102
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 103
    :cond_2
    invoke-virtual {v2, v5}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 104
    invoke-virtual {v2, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 106
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 107
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    const/4 v3, 0x1

    goto :goto_1

    :cond_3
    if-nez v3, :cond_0

    .line 111
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :cond_4
    return-object v1
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Ljava/util/ArrayList;
    .locals 20

    move-object/from16 v0, p1

    const-string v1, "yyyy-MM-dd_HH-mm-ss"

    .line 58
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    const-string v3, ""

    if-nez v2, :cond_0

    if-eqz p4, :cond_0

    .line 59
    invoke-static/range {p2 .. p2}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v4

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 60
    :goto_0
    new-instance v12, Ljava/util/ArrayList;

    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-direct {v12, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    :try_start_0
    new-instance v5, Ljava/text/SimpleDateFormat;

    .line 42
    sget-object v6, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    const-string v7, "rdtp"

    invoke-interface {v6, v7, v1}, Ll/۫ۤۡ;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 43
    invoke-virtual {v6}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_1

    move-object v6, v1

    .line 63
    :cond_1
    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v5, v6, v7}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 65
    :catch_0
    new-instance v5, Ljava/text/SimpleDateFormat;

    sget-object v6, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-direct {v5, v1, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    :goto_1
    move-object v1, v5

    const-string v5, "\\{([0-9]+)}"

    .line 67
    invoke-static {v5}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v13

    const-string v5, "\\{z([0-9]+)}"

    .line 68
    invoke-static {v5}, Ll/ۨۘܽ;->֫(Ljava/lang/String;)Ll/ۨۘܽ;

    move-result-object v14

    .line 69
    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v15

    const/4 v5, 0x0

    const/4 v11, 0x0

    :goto_2
    if-ge v11, v15, :cond_1a

    move-object/from16 v10, p0

    .line 70
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳۜܳ;

    .line 71
    invoke-interface {v5}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v9

    .line 72
    invoke-interface {v5}, Ll/ᩳۜܳ;->getTime()J

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Ljava/util/ArrayList;->size()I

    move-result v7

    const/16 v8, 0x2e

    .line 139
    invoke-virtual {v9, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v8

    const/4 v10, -0x1

    move/from16 p4, v15

    const-string v15, "{S}"

    move-object/from16 v16, v12

    const-string v12, "{P}"

    if-eq v8, v10, :cond_3

    .line 141
    invoke-virtual {v0, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/4 v10, 0x0

    .line 142
    invoke-virtual {v9, v10, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v12, v10}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    goto :goto_3

    :cond_2
    move-object v10, v0

    .line 143
    :goto_3
    invoke-virtual {v10, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_5

    .line 144
    invoke-virtual {v9, v8}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v15, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    goto :goto_5

    .line 146
    :cond_3
    invoke-virtual {v0, v12}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_4

    .line 147
    invoke-virtual {v0, v12, v9}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v8

    move-object v10, v8

    goto :goto_4

    :cond_4
    move-object v10, v0

    .line 148
    :goto_4
    invoke-virtual {v10, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_5

    .line 149
    invoke-virtual {v10, v15, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    :cond_5
    :goto_5
    const-string v8, "{T}"

    .line 151
    invoke-virtual {v10, v8}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v12

    if-eqz v12, :cond_6

    .line 152
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v12

    invoke-virtual {v1, v12}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v8, v12}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    :cond_6
    move-object/from16 v12, p5

    .line 154
    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩻ۤܳ;

    const-string v15, "{E}"

    .line 155
    invoke-virtual {v10, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v17

    if-eqz v17, :cond_9

    if-nez v8, :cond_7

    const/16 v17, 0x0

    goto :goto_6

    .line 156
    :cond_7
    iget-object v0, v8, Ll/᩻ۤܳ;->ۧ:Ljava/lang/Long;

    move-object/from16 v17, v0

    :goto_6
    if-nez v17, :cond_8

    .line 158
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v17

    :cond_8
    move-object/from16 v0, v17

    .line 160
    invoke-virtual {v1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v15, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    :cond_9
    if-nez v8, :cond_a

    const/4 v0, 0x0

    goto :goto_7

    .line 162
    :cond_a
    iget-object v0, v8, Ll/᩻ۤܳ;->֫:Ll/ۘܶۡ;

    :goto_7
    const-string v5, "{AN}"

    .line 163
    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    const-string v8, "NULL"

    if-eqz v6, :cond_c

    if-nez v0, :cond_b

    move-object v6, v8

    goto :goto_8

    .line 164
    :cond_b
    invoke-virtual {v0}, Ll/ۘܶۡ;->ܽ()Ljava/lang/String;

    move-result-object v6

    :goto_8
    invoke-virtual {v10, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    :cond_c
    const-string v5, "{AP}"

    .line 166
    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_e

    if-nez v0, :cond_d

    move-object v6, v8

    goto :goto_9

    .line 167
    :cond_d
    invoke-virtual {v0}, Ll/ۘܶۡ;->ܳ()Ljava/lang/String;

    move-result-object v6

    :goto_9
    invoke-virtual {v10, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    :cond_e
    const-string v5, "{AV}"

    .line 169
    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_10

    if-nez v0, :cond_f

    move-object v6, v8

    goto :goto_a

    .line 170
    :cond_f
    invoke-virtual {v0}, Ll/ۘܶۡ;->ۢ()Ljava/lang/String;

    move-result-object v6

    :goto_a
    invoke-virtual {v10, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    :cond_10
    const-string v5, "{AC}"

    .line 172
    invoke-virtual {v10, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_12

    if-nez v0, :cond_11

    goto :goto_b

    .line 173
    :cond_11
    invoke-virtual {v0}, Ll/ۘܶۡ;->᩷()J

    move-result-wide v17

    invoke-static/range {v17 .. v18}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v8

    :goto_b
    invoke-virtual {v10, v5, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v10

    .line 175
    :cond_12
    invoke-virtual {v13, v3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 176
    :goto_c
    invoke-virtual {v0, v10}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_13

    .line 177
    invoke-virtual {v0, v6}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 178
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v8

    const/4 v15, 0x0

    invoke-virtual {v10, v15, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v5, v11

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 180
    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v5

    invoke-virtual {v10, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    goto :goto_c

    .line 182
    :cond_13
    invoke-virtual {v14, v3}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    move-object v15, v10

    .line 183
    :goto_d
    invoke-virtual {v0, v15}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v5

    if-eqz v5, :cond_16

    .line 184
    invoke-virtual {v0, v6}, Ll/۫ۘܽ;->group(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    add-int v8, v5, v7

    sub-int/2addr v8, v6

    .line 185
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    .line 186
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Ll/۫ۘܽ;->start()I

    move-result v10

    move-object/from16 v17, v1

    const/4 v1, 0x0

    invoke-virtual {v15, v1, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/2addr v5, v11

    .line 187
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    .line 194
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    sub-int v5, v6, v5

    if-gtz v5, :cond_14

    goto :goto_f

    .line 197
    :cond_14
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    :goto_e
    if-lez v5, :cond_15

    const/16 v6, 0x30

    .line 199
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, -0x1

    goto :goto_e

    .line 201
    :cond_15
    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 187
    :goto_f
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 188
    invoke-virtual {v0}, Ll/۫ۘܽ;->end()I

    move-result v1

    invoke-virtual {v15, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    const/4 v6, 0x1

    move-object/from16 v1, v17

    goto :goto_d

    :cond_16
    move-object/from16 v17, v1

    if-nez v2, :cond_19

    if-eqz v4, :cond_18

    .line 64
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v8, 0x1

    const/4 v1, 0x0

    const/4 v10, 0x0

    move-object v5, v15

    move-object/from16 v6, p3

    move-object v7, v4

    move-object/from16 v19, v9

    move v9, v1

    move v1, v11

    move-object v11, v0

    invoke-static/range {v5 .. v11}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫ۘܽ;ZZLl/᩹ۛ᩷;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_17

    move-object v15, v0

    :cond_17
    move-object/from16 v0, p2

    move-object/from16 v5, p3

    goto :goto_10

    :cond_18
    move-object/from16 v0, p2

    move-object/from16 v5, p3

    move-object/from16 v19, v9

    move v1, v11

    .line 81
    invoke-virtual {v15, v0, v5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v15

    goto :goto_10

    :cond_19
    move-object/from16 v0, p2

    move-object/from16 v5, p3

    move-object/from16 v19, v9

    move v1, v11

    .line 84
    :goto_10
    new-instance v6, Ll/ۜۤܳ;

    move-object/from16 v7, v19

    invoke-direct {v6, v7, v15}, Ll/ۜۤܳ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v7, v16

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v11, v1, 0x1

    move-object/from16 v0, p1

    move/from16 v15, p4

    move-object v12, v7

    move-object/from16 v1, v17

    goto/16 :goto_2

    :cond_1a
    move-object v7, v12

    return-object v7
.end method

.method public static ֫(Ll/֡ۤܳ;Ljava/util/ArrayList;)V
    .locals 3

    .line 131
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۜۤܳ;

    .line 132
    invoke-static {v0}, Ll/ۜۤܳ;->ۧ(Ll/ۜۤܳ;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Ll/ۜۤܳ;->֫(Ll/ۜۤܳ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Ll/֡ۤܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Ll/ۜۤܳ;->֫(Ll/ۜۤܳ;Z)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ljava/util/ArrayList;)V
    .locals 4

    const v0, 0x7f0d00cc

    .line 119
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 120
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120882

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    const v1, 0x7f0a02e0

    .line 121
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/ListView;

    .line 122
    invoke-static {v1}, Ll/ۙ᩸ۡ;->֫(Landroid/widget/ListView;)V

    .line 123
    new-instance v2, Ll/֫᩷ۡ;

    const v3, 0x7f0d01c5

    .line 200
    invoke-direct {v2, v3, p0, p1}, Ll/֫᩷ۡ;-><init>(ILandroid/content/Context;Ljava/util/List;)V

    .line 123
    invoke-virtual {v1, v2}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 124
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    .line 125
    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120189

    const/4 v0, 0x0

    .line 126
    invoke-virtual {p0, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 127
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
