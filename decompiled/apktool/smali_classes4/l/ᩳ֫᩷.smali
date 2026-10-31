.class public final Ll/ᩳ֫᩷;
.super Ljava/lang/Object;
.source "U75B"


# direct methods
.method public static ֫(Ljava/lang/String;)I
    .locals 3

    .line 187
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/4 v0, 0x0

    .line 190
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 191
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v2, 0x30

    if-lt v1, v2, :cond_0

    const/16 v2, 0x39

    if-gt v1, v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 193
    :cond_0
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    .line 197
    :cond_1
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    .line 199
    :catch_0
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    .line 188
    :cond_2
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/util/ArrayList;I)I
    .locals 3

    .line 272
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 275
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    add-int/lit8 v2, v0, -0x1

    .line 276
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    iget v1, v1, Ll/ۙ۟ۜ;->᩹:I

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v1, 0x1

    .line 0
    invoke-static {p0, v1}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object p0

    .line 279
    check-cast p0, Ll/ۙ۟ۜ;

    iget p0, p0, Ll/ۙ۟ۜ;->᩸:I

    if-ge p0, p1, :cond_2

    add-int/2addr v0, v1

    :cond_2
    return v0
.end method

.method public static ֫()Ljava/lang/IllegalArgumentException;
    .locals 2

    .line 289
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid nine-patch region text"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(I)Ljava/lang/IllegalArgumentException;
    .locals 2

    .line 296
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid nine-patch region text at line "

    .line 0
    invoke-static {p0, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 296
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static ֫(Ll/ܽ֫᩷;II)Ljava/lang/String;
    .locals 7

    const-string v0, "stretch:\n  x: "

    .line 0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 25
    iget-object v1, p0, Ll/ܽ֫᩷;->ܿ:Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܽ֫᩷;->ᩳ:Ll/ۙ۟ۜ;

    iget-object v3, p0, Ll/ܽ֫᩷;->ܽ:Ll/ۙ۟ۜ;

    invoke-static {v0, v1}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ljava/util/ArrayList;)V

    const-string v1, "\n  y: "

    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    iget-object v4, p0, Ll/ܽ֫᩷;->ܳ:Ljava/util/ArrayList;

    invoke-static {v0, v4}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ljava/util/ArrayList;)V

    const-string v4, "\n\n"

    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    iget-object v5, p0, Ll/ܽ֫᩷;->֫:Ll/ۙ۟ۜ;

    if-nez v5, :cond_0

    const-string p0, "content: auto"

    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const-string v6, "content:\n  x: "

    .line 33
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    invoke-static {v0, v5}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ll/ۙ۟ۜ;)V

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    iget-object p0, p0, Ll/ܽ֫᩷;->ۧ:Ll/ۙ۟ۜ;

    invoke-static {v0, p0}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ll/ۙ۟ۜ;)V

    .line 38
    :goto_0
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    iget p0, v3, Ll/ۙ۟ۜ;->᩹:I

    if-nez p0, :cond_1

    iget p0, v3, Ll/ۙ۟ۜ;->᩸:I

    if-ne p0, p1, :cond_1

    iget p0, v2, Ll/ۙ۟ۜ;->᩹:I

    if-nez p0, :cond_1

    iget p0, v2, Ll/ۙ۟ۜ;->᩸:I

    if-ne p0, p2, :cond_1

    const-string p0, "optical: full"

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string p0, "optical:\n  x: "

    .line 43
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    invoke-static {v0, v3}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ll/ۙ۟ۜ;)V

    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    invoke-static {v0, v2}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ll/ۙ۟ۜ;)V

    .line 48
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic ֫(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    invoke-static {p0}, Ll/ᩳ֫᩷;->ۧ(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(ILjava/lang/String;)Ll/ۙ۟ۜ;
    .locals 3

    const/16 v0, 0x2d

    .line 171
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-lez v1, :cond_1

    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v0

    if-ne v1, v0, :cond_1

    const/4 v0, 0x0

    .line 175
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ֫᩷;->֫(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x1

    add-int/2addr v1, v2

    .line 176
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳ֫᩷;->֫(Ljava/lang/String;)I

    move-result p1

    if-lt v0, v2, :cond_0

    if-ge v0, p1, :cond_0

    add-int/2addr p0, v2

    if-gt p1, p0, :cond_0

    .line 180
    new-instance p0, Ll/ۙ۟ۜ;

    sub-int/2addr v0, v2

    sub-int/2addr p1, v2

    invoke-direct {p0, v0, p1}, Ll/ۙ۟ۜ;-><init>(II)V

    return-object p0

    .line 178
    :cond_0
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    .line 173
    :cond_1
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۙ۟ۜ;)Ll/ۙ۟ۜ;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    .line 238
    :cond_0
    new-instance v0, Ll/ۙ۟ۜ;

    iget v1, p0, Ll/ۙ۟ۜ;->᩹:I

    iget p0, p0, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v0, v1, p0}, Ll/ۙ۟ۜ;-><init>(II)V

    return-object v0
.end method

.method public static ֫(IILjava/lang/String;)Ll/ܽ֫᩷;
    .locals 17

    move/from16 v7, p0

    move/from16 v8, p1

    move-object/from16 v0, p2

    if-eqz v0, :cond_23

    if-lez v7, :cond_23

    if-lez v8, :cond_23

    const/4 v1, 0x3

    new-array v1, v1, [Z

    const-string v2, "\r\n"

    const-string v3, "\n"

    .line 60
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    const/16 v2, 0xd

    const/16 v4, 0xa

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 61
    :goto_0
    array-length v14, v0

    if-ge v3, v14, :cond_17

    .line 62
    aget-object v14, v0, v3

    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    .line 63
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-eqz v15, :cond_0

    move-object/from16 v16, v0

    goto/16 :goto_7

    :cond_0
    const/16 v15, 0x3a

    .line 66
    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    if-lez v15, :cond_16

    move-object/from16 v16, v0

    const/4 v0, 0x0

    .line 70
    invoke-virtual {v14, v0, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    add-int/lit8 v15, v15, 0x1

    .line 71
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v14

    .line 141
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v15, "content"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_1

    goto :goto_1

    :cond_1
    const/4 v15, 0x2

    goto :goto_2

    :sswitch_1
    const-string v15, "optical"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2

    goto :goto_1

    :cond_2
    const/4 v15, 0x1

    goto :goto_2

    :sswitch_2
    const-string v15, "stretch"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_3

    goto :goto_1

    :cond_3
    const/4 v15, 0x0

    goto :goto_2

    :goto_1
    const/4 v15, -0x1

    :goto_2
    const/4 v8, -0x1

    packed-switch v15, :pswitch_data_0

    const/4 v15, -0x1

    goto :goto_3

    :pswitch_0
    const/4 v15, 0x1

    goto :goto_3

    :pswitch_1
    const/4 v15, 0x2

    goto :goto_3

    :pswitch_2
    const/4 v15, 0x0

    :goto_3
    if-eq v15, v8, :cond_8

    .line 74
    aget-boolean v0, v1, v15

    if-nez v0, :cond_7

    const/4 v0, 0x1

    .line 77
    aput-boolean v0, v1, v15

    .line 78
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    move v4, v15

    goto/16 :goto_7

    :cond_4
    const/4 v0, 0x1

    if-ne v15, v0, :cond_5

    const-string v0, "auto"

    .line 80
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v0, -0x1

    const/4 v4, 0x1

    const/4 v4, -0x1

    const/4 v6, 0x1

    goto/16 :goto_7

    :cond_5
    const/4 v0, 0x2

    if-ne v15, v0, :cond_6

    const-string v0, "full"

    .line 83
    invoke-virtual {v14, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 v0, -0x1

    const/4 v4, 0x1

    const/4 v4, -0x1

    const/4 v11, 0x1

    goto/16 :goto_7

    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 87
    invoke-static {v3}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 75
    invoke-static {v3}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_8
    const-string v8, "x"

    .line 91
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_9

    const-string v15, "y"

    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_15

    :cond_9
    invoke-virtual {v14}, Ljava/lang/String;->isEmpty()Z

    move-result v15

    if-nez v15, :cond_15

    const/4 v15, -0x1

    if-eq v4, v15, :cond_15

    .line 94
    invoke-virtual {v0, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    add-int/lit8 v8, v3, 0x1

    if-nez v4, :cond_d

    if-eqz v0, :cond_a

    move-object v15, v2

    goto :goto_4

    :cond_a
    move-object v15, v5

    :goto_4
    if-nez v15, :cond_c

    if-eqz v0, :cond_b

    move-object v2, v14

    goto :goto_7

    :cond_b
    move-object v5, v14

    goto :goto_7

    .line 385
    :cond_c
    invoke-static {v8}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_d
    const/4 v15, 0x1

    if-ne v4, v15, :cond_11

    if-eqz v0, :cond_e

    move-object v15, v9

    goto :goto_5

    :cond_e
    move-object v15, v10

    :goto_5
    if-nez v15, :cond_10

    if-eqz v0, :cond_f

    move-object v9, v14

    goto :goto_7

    :cond_f
    move-object v10, v14

    goto :goto_7

    .line 395
    :cond_10
    invoke-static {v8}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_11
    if-eqz v0, :cond_12

    move-object v15, v12

    goto :goto_6

    :cond_12
    move-object v15, v13

    :goto_6
    if-nez v15, :cond_14

    if-eqz v0, :cond_13

    move-object v12, v14

    goto :goto_7

    :cond_13
    move-object v13, v14

    :goto_7
    add-int/lit8 v3, v3, 0x1

    move/from16 v8, p1

    move-object/from16 v0, v16

    goto/16 :goto_0

    .line 405
    :cond_14
    invoke-static {v8}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 92
    invoke-static {v3}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_16
    add-int/lit8 v3, v3, 0x1

    .line 68
    invoke-static {v3}, Ll/ᩳ֫᩷;->֫(I)Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_17
    const/4 v0, 0x0

    const/4 v3, 0x1

    .line 419
    aget-boolean v0, v1, v0

    if-eqz v0, :cond_22

    if-eqz v2, :cond_22

    if-eqz v5, :cond_22

    aget-boolean v0, v1, v3

    if-eqz v0, :cond_22

    if-nez v6, :cond_18

    if-eqz v9, :cond_22

    if-eqz v10, :cond_22

    :cond_18
    const/4 v0, 0x2

    aget-boolean v0, v1, v0

    if-eqz v0, :cond_22

    if-nez v11, :cond_19

    if-eqz v12, :cond_22

    if-eqz v13, :cond_22

    .line 98
    :cond_19
    invoke-static {v7, v2}, Ll/ᩳ֫᩷;->ۧ(ILjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    move/from16 v8, p1

    .line 99
    invoke-static {v8, v5}, Ll/ᩳ֫᩷;->ۧ(ILjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v2

    if-eqz v6, :cond_1a

    const/4 v0, 0x0

    goto :goto_8

    .line 100
    :cond_1a
    invoke-static {v7, v9}, Ll/ᩳ֫᩷;->֫(ILjava/lang/String;)Ll/ۙ۟ۜ;

    move-result-object v0

    :goto_8
    move-object v3, v0

    if-eqz v6, :cond_1b

    const/4 v0, 0x0

    goto :goto_9

    .line 101
    :cond_1b
    invoke-static {v8, v10}, Ll/ᩳ֫᩷;->֫(ILjava/lang/String;)Ll/ۙ۟ۜ;

    move-result-object v0

    :goto_9
    move-object v4, v0

    if-eqz v11, :cond_1c

    .line 102
    new-instance v0, Ll/ۙ۟ۜ;

    const/4 v5, 0x0

    invoke-direct {v0, v5, v7}, Ll/ۙ۟ۜ;-><init>(II)V

    goto :goto_a

    :cond_1c
    const/4 v5, 0x0

    invoke-static {v7, v12}, Ll/ᩳ֫᩷;->֫(ILjava/lang/String;)Ll/ۙ۟ۜ;

    move-result-object v0

    :goto_a
    move-object v6, v0

    if-eqz v11, :cond_1d

    .line 103
    new-instance v0, Ll/ۙ۟ۜ;

    invoke-direct {v0, v5, v8}, Ll/ۙ۟ۜ;-><init>(II)V

    goto :goto_b

    :cond_1d
    invoke-static {v8, v13}, Ll/ᩳ֫᩷;->֫(ILjava/lang/String;)Ll/ۙ۟ۜ;

    move-result-object v0

    :goto_b
    move-object v9, v0

    if-eqz v3, :cond_1f

    .line 245
    iget v0, v6, Ll/ۙ۟ۜ;->᩹:I

    iget v5, v3, Ll/ۙ۟ۜ;->᩹:I

    if-gt v0, v5, :cond_1e

    iget v0, v6, Ll/ۙ۟ۜ;->᩸:I

    iget v5, v3, Ll/ۙ۟ۜ;->᩸:I

    if-lt v0, v5, :cond_1e

    iget v0, v9, Ll/ۙ۟ۜ;->᩹:I

    iget v5, v4, Ll/ۙ۟ۜ;->᩹:I

    if-gt v0, v5, :cond_1e

    iget v0, v9, Ll/ۙ۟ۜ;->᩸:I

    iget v5, v4, Ll/ۙ۟ۜ;->᩸:I

    if-lt v0, v5, :cond_1e

    goto :goto_c

    .line 107
    :cond_1e
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 259
    :cond_1f
    :goto_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    const/16 v5, 0x7f

    if-gt v0, v5, :cond_21

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    mul-int/lit8 v0, v0, 0x2

    if-gt v0, v5, :cond_21

    .line 262
    invoke-static {v1, v7}, Ll/ᩳ֫᩷;->֫(Ljava/util/ArrayList;I)I

    move-result v0

    int-to-long v10, v0

    invoke-static {v2, v8}, Ll/ᩳ֫᩷;->֫(Ljava/util/ArrayList;I)I

    move-result v0

    int-to-long v12, v0

    mul-long v10, v10, v12

    const-wide/16 v12, 0x7f

    cmp-long v0, v10, v12

    if-gtz v0, :cond_20

    .line 110
    new-instance v10, Ll/ܽ֫᩷;

    move-object v0, v10

    move-object v5, v6

    move-object v6, v9

    move/from16 v7, p0

    move/from16 v8, p1

    invoke-direct/range {v0 .. v8}, Ll/ܽ֫᩷;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;Ll/ۙ۟ۜ;II)V

    return-object v10

    .line 264
    :cond_20
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 260
    :cond_21
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 424
    :cond_22
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    .line 56
    :cond_23
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x702b18fb -> :sswitch_2
        -0x4a79a808 -> :sswitch_1
        0x38b73479 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/util/ArrayList;)V
    .locals 2

    .line 125
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "none"

    .line 126
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 129
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    if-lez v0, :cond_1

    const-string v1, ", "

    .line 131
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    :cond_1
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    invoke-static {p0, v1}, Ll/ᩳ֫᩷;->֫(Ljava/lang/StringBuilder;Ll/ۙ۟ۜ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ll/ۙ۟ۜ;)V
    .locals 1

    .line 118
    iget v0, p1, Ll/ۙ۟ۜ;->᩹:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v0, 0x2d

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget p1, p1, Ll/ۙ۟ۜ;->᩸:I

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ۧ(ILjava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    const-string v0, "none"

    .line 153
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 154
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    return-object p0

    :cond_0
    const-string v0, ","

    const/4 v1, -0x1

    .line 156
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 157
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p1, v2

    .line 159
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1

    .line 162
    invoke-static {p0, v3}, Ll/ᩳ֫᩷;->֫(ILjava/lang/String;)Ll/ۙ۟ۜ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 160
    :cond_1
    invoke-static {}, Ll/ᩳ֫᩷;->֫()Ljava/lang/IllegalArgumentException;

    move-result-object p0

    throw p0

    .line 164
    :cond_2
    invoke-static {v0}, Ll/ᩳ֫᩷;->ۧ(Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ljava/util/List;)Ljava/util/ArrayList;
    .locals 6

    .line 227
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    .line 238
    :cond_0
    new-instance v2, Ll/ۙ۟ۜ;

    iget v3, v1, Ll/ۙ۟ۜ;->᩹:I

    iget v1, v1, Ll/ۙ۟ۜ;->᩸:I

    invoke-direct {v2, v3, v1}, Ll/ۙ۟ۜ;-><init>(II)V

    move-object v1, v2

    .line 229
    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 208
    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const/4 p0, 0x0

    .line 210
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge p0, v1, :cond_3

    .line 211
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ۟ۜ;

    add-int/lit8 v2, p0, 0x1

    .line 212
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۙ۟ۜ;

    .line 213
    iget v4, v3, Ll/ۙ۟ۜ;->᩹:I

    iget v5, v1, Ll/ۙ۟ۜ;->᩸:I

    if-gt v4, v5, :cond_2

    .line 214
    iget v3, v3, Ll/ۙ۟ۜ;->᩸:I

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    iput v3, v1, Ll/ۙ۟ۜ;->᩸:I

    .line 215
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    move p0, v2

    goto :goto_2

    :cond_3
    return-object v0
.end method
