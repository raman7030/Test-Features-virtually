.class public final Ll/ܰۘܽ;
.super Ljava/lang/Object;
.source "X7PO"


# direct methods
.method public static ֫(Ll/ۨۘܽ;Ljava/lang/String;)V
    .locals 11

    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_10

    const/4 v3, 0x0

    .line 243
    invoke-static {v3, v2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    .line 14
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x5c

    if-ne v4, v5, :cond_1

    add-int/lit8 v2, v2, 0x1

    if-eq v2, v0, :cond_0

    goto/16 :goto_4

    .line 17
    :cond_0
    new-instance p0, Ll/۬ۘܽ;

    const-string v1, "The last \'\\\' need follow a character."

    add-int/lit8 v0, v0, -0x1

    .line 50
    invoke-direct {p0, v1, p1, v0}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 17
    throw p0

    :cond_1
    const/16 v5, 0x24

    if-ne v4, v5, :cond_f

    add-int/lit8 v4, v2, 0x1

    if-eq v4, v0, :cond_e

    .line 23
    invoke-virtual {p1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v6, 0x7b

    if-ne v5, v6, :cond_c

    .line 26
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move v6, v4

    :goto_1
    add-int/lit8 v6, v6, 0x1

    if-eq v6, v0, :cond_b

    .line 243
    invoke-static {v3, v6}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    .line 32
    invoke-virtual {p1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0x7d

    const-string v9, "The \'${\' must be followed by a group name or index"

    if-ne v7, v8, :cond_7

    .line 34
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-eqz v3, :cond_6

    .line 45
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    if-eqz v3, :cond_5

    .line 48
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 49
    invoke-virtual {v3, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 51
    :try_start_0
    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p0

    .line 53
    new-instance v0, Ll/۬ۘܽ;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    add-int/lit8 v2, v2, 0x2

    .line 50
    invoke-direct {v0, p0, p1, v2}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 53
    throw v0

    :cond_2
    if-eqz p0, :cond_4

    .line 55
    invoke-virtual {p0}, Ll/ۨۘܽ;->ܿ()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_2

    .line 56
    :cond_3
    new-instance p0, Ll/۬ۘܽ;

    const-string v0, "No group with name {"

    const-string v1, "}"

    .line 0
    invoke-static {v0, v3, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 50
    invoke-direct {p0, v0, p1, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 56
    throw p0

    :cond_4
    :goto_2
    move v2, v6

    goto :goto_4

    .line 46
    :cond_5
    new-instance p0, Ll/۬ۘܽ;

    .line 50
    invoke-direct {p0, v9, p1, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 46
    throw p0

    .line 35
    :cond_6
    new-instance p0, Ll/۬ۘܽ;

    .line 50
    invoke-direct {p0, v9, p1, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 35
    throw p0

    :cond_7
    add-int/lit8 v8, v7, -0x61

    rsub-int/lit8 v10, v7, 0x7a

    or-int/2addr v8, v10

    if-ltz v8, :cond_8

    goto :goto_3

    :cond_8
    add-int/lit8 v8, v7, -0x41

    rsub-int/lit8 v10, v7, 0x5a

    or-int/2addr v8, v10

    if-ltz v8, :cond_9

    goto :goto_3

    .line 39
    :cond_9
    invoke-static {v7}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v8

    if-eqz v8, :cond_a

    .line 40
    :goto_3
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 42
    :cond_a
    new-instance p0, Ll/۬ۘܽ;

    .line 50
    invoke-direct {p0, v9, p1, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 42
    throw p0

    .line 29
    :cond_b
    new-instance p0, Ll/۬ۘܽ;

    const-string v1, "Missing ending brace \'}\' from replacement string"

    add-int/lit8 v0, v0, -0x1

    .line 50
    invoke-direct {p0, v1, p1, v0}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 29
    throw p0

    :cond_c
    const/16 v3, 0x30

    if-lt v5, v3, :cond_d

    const/16 v3, 0x39

    if-gt v5, v3, :cond_d

    move v2, v4

    goto :goto_4

    .line 59
    :cond_d
    new-instance p0, Ll/۬ۘܽ;

    const-string v0, "The \'$\' must be followed by a group index"

    .line 50
    invoke-direct {p0, v0, p1, v2}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 59
    throw p0

    .line 21
    :cond_e
    new-instance p0, Ll/۬ۘܽ;

    const-string v1, "The last \'$\' must be followed by a group index"

    add-int/lit8 v0, v0, -0x1

    .line 50
    invoke-direct {p0, v1, p1, v0}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 21
    throw p0

    :cond_f
    :goto_4
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_10
    return-void
.end method

.method public static ֫(Ll/᩺ۘܽ;I)V
    .locals 0

    and-int/lit16 p1, p1, 0x3ff

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p0, :cond_1

    .line 248
    invoke-interface {p0}, Ll/᩺ۘܽ;->֫()V

    .line 249
    :cond_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result p0

    if-nez p0, :cond_2

    :goto_0
    return-void

    .line 250
    :cond_2
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "Regex replacement canceled"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 67
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->֫()V

    .line 68
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    const-string v8, "\' need follow a \'$\'."

    const-string v9, "The \'"

    if-ge v6, v4, :cond_1d

    add-int/lit8 v10, v7, 0x1

    .line 71
    invoke-static {v0, v7}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    .line 72
    invoke-virtual {v2, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v11, 0x5c

    if-ne v7, v11, :cond_7

    add-int/lit8 v7, v6, 0x1

    if-eq v7, v4, :cond_6

    .line 77
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v12

    const/16 v13, 0x4c

    if-eq v12, v13, :cond_4

    const/16 v13, 0x55

    if-eq v12, v13, :cond_4

    const/16 v13, 0x6c

    if-eq v12, v13, :cond_4

    const/16 v13, 0x75

    if-eq v12, v13, :cond_4

    .line 86
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    if-nez v11, :cond_3

    const/16 v6, 0x6e

    if-eq v12, v6, :cond_2

    const/16 v6, 0x72

    if-eq v12, v6, :cond_1

    const/16 v6, 0x74

    if-eq v12, v6, :cond_0

    .line 100
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v6, "\t"

    .line 97
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v6, "\r"

    .line 94
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v6, "\n"

    .line 91
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 87
    :cond_3
    new-instance v0, Ll/۬ۘܽ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v6, v3

    .line 50
    invoke-direct {v0, v1, v2, v6}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 87
    throw v0

    .line 83
    :cond_4
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    :goto_1
    move v6, v7

    goto/16 :goto_8

    .line 75
    :cond_6
    new-instance v0, Ll/۬ۘܽ;

    const-string v1, "The last \'\\\' need follow a character."

    add-int/lit8 v4, v4, -0x1

    .line 50
    invoke-direct {v0, v1, v2, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 75
    throw v0

    :cond_7
    const/16 v11, 0x24

    if-ne v7, v11, :cond_1b

    add-int/lit8 v7, v6, 0x1

    if-eq v7, v4, :cond_1a

    .line 109
    invoke-virtual {v2, v7}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x7b

    const/16 v11, 0x1000

    const/4 v12, -0x1

    if-ne v8, v9, :cond_15

    .line 112
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    move v9, v7

    :goto_2
    add-int/lit8 v9, v9, 0x1

    if-eq v9, v4, :cond_14

    add-int/lit8 v13, v10, 0x1

    .line 117
    invoke-static {v0, v10}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    .line 118
    invoke-virtual {v2, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    const/16 v14, 0x7d

    const-string v15, "The \'${\' must be followed by a group name or index"

    if-ne v10, v14, :cond_10

    .line 120
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-eqz v10, :cond_f

    .line 131
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v10

    if-eqz v10, :cond_e

    .line 135
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->pattern()Ll/ۨۘܽ;

    move-result-object v10

    .line 136
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 137
    invoke-virtual {v8, v5}, Ljava/lang/String;->charAt(I)C

    move-result v14

    invoke-static {v14}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v14

    if-eqz v14, :cond_8

    .line 139
    :try_start_0
    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 141
    new-instance v0, Ll/۬ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v6, v6, 0x2

    .line 50
    invoke-direct {v0, v1, v2, v6}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 141
    throw v0

    .line 144
    :cond_8
    invoke-virtual {v10}, Ll/ۨۘܽ;->ܿ()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-eqz v6, :cond_d

    .line 146
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    .line 151
    :goto_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v7

    if-nez v7, :cond_b

    .line 178
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->groupCount()I

    move-result v7

    if-le v6, v7, :cond_9

    goto :goto_5

    .line 180
    :cond_9
    invoke-interface {v0, v6}, Ll/᩺ۘܽ;->start(I)I

    move-result v7

    .line 181
    invoke-interface {v0, v6}, Ll/᩺ۘܽ;->end(I)I

    move-result v6

    if-eq v7, v12, :cond_c

    if-ne v6, v12, :cond_a

    goto :goto_5

    .line 185
    :cond_a
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->getText()Ljava/lang/CharSequence;

    move-result-object v8

    :goto_4
    if-ge v7, v6, :cond_c

    .line 235
    invoke-static {v0, v5}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    sub-int v10, v6, v7

    .line 236
    invoke-static {v11, v10}, Ljava/lang/Math;->min(II)I

    move-result v10

    add-int/2addr v10, v7

    .line 237
    invoke-virtual {v1, v8, v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    move v7, v10

    goto :goto_4

    .line 154
    :cond_b
    invoke-static {v0, v1, v3, v6}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 155
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    :cond_c
    :goto_5
    move v6, v9

    move v7, v13

    goto/16 :goto_9

    .line 148
    :cond_d
    new-instance v0, Ll/۬ۘܽ;

    const-string v1, "No group with name {"

    const-string v3, "}"

    .line 0
    invoke-static {v1, v8, v3}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 50
    invoke-direct {v0, v1, v2, v7}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 148
    throw v0

    .line 132
    :cond_e
    new-instance v0, Ll/۬ۘܽ;

    .line 50
    invoke-direct {v0, v15, v2, v7}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 132
    throw v0

    .line 121
    :cond_f
    new-instance v0, Ll/۬ۘܽ;

    .line 50
    invoke-direct {v0, v15, v2, v7}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 121
    throw v0

    :cond_10
    add-int/lit8 v14, v10, -0x61

    rsub-int/lit8 v16, v10, 0x7a

    or-int v14, v14, v16

    if-ltz v14, :cond_11

    goto :goto_6

    :cond_11
    add-int/lit8 v14, v10, -0x41

    rsub-int/lit8 v16, v10, 0x5a

    or-int v14, v14, v16

    if-ltz v14, :cond_12

    goto :goto_6

    .line 125
    :cond_12
    invoke-static {v10}, Ll/᩹۠ܽ;->ۧ(I)Z

    move-result v14

    if-eqz v14, :cond_13

    .line 126
    :goto_6
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v10, v13

    goto/16 :goto_2

    .line 128
    :cond_13
    new-instance v0, Ll/۬ۘܽ;

    .line 50
    invoke-direct {v0, v15, v2, v7}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 128
    throw v0

    .line 115
    :cond_14
    new-instance v0, Ll/۬ۘܽ;

    const-string v1, "Missing ending brace \'}\' from replacement string"

    add-int/lit8 v4, v4, -0x1

    .line 50
    invoke-direct {v0, v1, v2, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 115
    throw v0

    :cond_15
    const/16 v9, 0x30

    if-lt v8, v9, :cond_19

    const/16 v9, 0x39

    if-gt v8, v9, :cond_19

    .line 159
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    if-nez v6, :cond_18

    add-int/lit8 v8, v8, -0x30

    .line 178
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->groupCount()I

    move-result v6

    if-le v8, v6, :cond_16

    goto/16 :goto_1

    .line 180
    :cond_16
    invoke-interface {v0, v8}, Ll/᩺ۘܽ;->start(I)I

    move-result v6

    .line 181
    invoke-interface {v0, v8}, Ll/᩺ۘܽ;->end(I)I

    move-result v8

    if-eq v6, v12, :cond_5

    if-ne v8, v12, :cond_17

    goto/16 :goto_1

    .line 185
    :cond_17
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->getText()Ljava/lang/CharSequence;

    move-result-object v9

    :goto_7
    if-ge v6, v8, :cond_5

    .line 235
    invoke-static {v0, v5}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    sub-int v12, v8, v6

    .line 236
    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v12

    add-int/2addr v12, v6

    .line 237
    invoke-virtual {v1, v9, v6, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    move v6, v12

    goto :goto_7

    :cond_18
    add-int/lit8 v8, v8, -0x30

    .line 162
    invoke-static {v0, v1, v3, v8}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V

    .line 163
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    goto/16 :goto_1

    .line 158
    :cond_19
    new-instance v0, Ll/۬ۘܽ;

    const-string v1, "The \'$\' must be followed by a group index"

    .line 50
    invoke-direct {v0, v1, v2, v6}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 158
    throw v0

    .line 107
    :cond_1a
    new-instance v0, Ll/۬ۘܽ;

    const-string v1, "The last \'$\' must be followed by a group index"

    add-int/lit8 v4, v4, -0x1

    .line 50
    invoke-direct {v0, v1, v2, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 107
    throw v0

    .line 165
    :cond_1b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v11

    if-nez v11, :cond_1c

    .line 168
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_8
    move v7, v10

    :goto_9
    add-int/lit8 v6, v6, 0x1

    goto/16 :goto_0

    .line 166
    :cond_1c
    new-instance v0, Ll/۬ۘܽ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v6, v3

    .line 50
    invoke-direct {v0, v1, v2, v6}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 166
    throw v0

    .line 171
    :cond_1d
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1e

    .line 174
    invoke-interface/range {p0 .. p0}, Ll/᩺ۘܽ;->֫()V

    return-void

    .line 172
    :cond_1e
    new-instance v0, Ll/۬ۘܽ;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    sub-int/2addr v4, v3

    .line 50
    invoke-direct {v0, v1, v2, v4}, Ljava/util/regex/PatternSyntaxException;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 172
    throw v0
.end method

.method public static ֫(Ll/᩺ۘܽ;Ljava/lang/StringBuilder;Ljava/lang/StringBuilder;I)V
    .locals 6

    .line 190
    invoke-interface {p0}, Ll/᩺ۘܽ;->groupCount()I

    move-result v0

    if-le p3, v0, :cond_0

    goto/16 :goto_5

    .line 191
    :cond_0
    invoke-interface {p0, p3}, Ll/᩺ۘܽ;->group(I)Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_1

    goto/16 :goto_5

    .line 194
    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_6

    .line 195
    invoke-static {p0, v2}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    mul-int/lit8 v4, v2, 0x2

    add-int/lit8 v4, v4, 0x1

    .line 196
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v4

    const/16 v5, 0x4c

    if-eq v4, v5, :cond_5

    const/16 v5, 0x55

    if-eq v4, v5, :cond_4

    const/16 v5, 0x6c

    if-eq v4, v5, :cond_3

    const/16 v5, 0x75

    if-ne v4, v5, :cond_2

    .line 205
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_7

    add-int/lit8 v4, v3, 0x1

    .line 206
    invoke-virtual {p3, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 224
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    .line 198
    :cond_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v3, v4, :cond_7

    add-int/lit8 v4, v3, 0x1

    .line 199
    invoke-virtual {p3, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    move v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 212
    :cond_4
    :goto_2
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v3, p2, :cond_7

    .line 213
    invoke-static {p0, v3}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    add-int/lit8 p2, v3, 0x1

    .line 214
    invoke-virtual {p3, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v3, p2

    goto :goto_2

    .line 218
    :cond_5
    :goto_3
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v3, p2, :cond_7

    .line 219
    invoke-static {p0, v3}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    add-int/lit8 p2, v3, 0x1

    .line 220
    invoke-virtual {p3, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v3, p2

    goto :goto_3

    .line 227
    :cond_6
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    if-ge v3, p2, :cond_7

    .line 228
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result p2

    :goto_4
    if-ge v3, p2, :cond_7

    .line 235
    invoke-static {p0, v1}, Ll/ܰۘܽ;->֫(Ll/᩺ۘܽ;I)V

    const/16 v0, 0x1000

    sub-int v2, p2, v3

    .line 236
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, v3

    .line 237
    invoke-virtual {p1, p3, v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    move v3, v0

    goto :goto_4

    :cond_7
    :goto_5
    return-void
.end method
