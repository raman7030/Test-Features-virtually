.class public final Ll/ۢܽܽ;
.super Ljava/lang/Object;
.source "CAOD"


# direct methods
.method public static ֫(C)I
    .locals 2

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    return p0

    :cond_0
    const/16 v0, 0x41

    if-lt p0, v0, :cond_1

    const/16 v0, 0x46

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x37

    return p0

    :cond_1
    const/16 v0, 0x61

    if-lt p0, v0, :cond_2

    const/16 v0, 0x66

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x57

    return p0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static ֫(Ll/ۖܽܽ;Ll/ۡۘܽ;)V
    .locals 20

    move-object/from16 v0, p0

    .line 29
    invoke-virtual/range {p1 .. p1}, Ll/ۡۘܽ;->ܳ()Z

    move-result v1

    if-eqz v1, :cond_17

    .line 30
    invoke-virtual/range {p1 .. p1}, Ll/ۡۘܽ;->֫()Ll/᩵ۘܽ;

    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v3, v2}, Ll/ۖܽܽ;->startTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    .line 32
    invoke-virtual {v1}, Ll/᩵ۘܽ;->᩻()Ljava/util/ArrayList;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘܽ;

    .line 33
    invoke-virtual {v3}, Ll/ᩴۘܽ;->֫()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x2d

    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    const-string v6, ""

    const/4 v7, 0x0

    if-lez v5, :cond_0

    .line 37
    invoke-virtual {v4, v7, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    add-int/lit8 v5, v5, 0x1

    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_0
    move-object v7, v4

    move-object v5, v6

    .line 43
    :goto_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    const-string v9, "interned"

    const-string v10, "float"

    const-string v11, "null"

    const-string v12, "long"

    const-string v13, "bool"

    const-string v14, "str"

    const-string v15, "int"

    move-object/from16 p1, v2

    const-string v2, "hex"

    move-object/from16 v16, v4

    const-string v4, "double"

    move-object/from16 v17, v6

    const-string v6, "base64"

    sparse-switch v8, :sswitch_data_0

    goto/16 :goto_2

    :sswitch_0
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1

    goto/16 :goto_2

    :cond_1
    const/16 v8, 0x9

    goto/16 :goto_3

    :sswitch_1
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    goto :goto_2

    :cond_2
    const/16 v8, 0x8

    goto :goto_3

    :sswitch_2
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    goto :goto_2

    :cond_3
    const/4 v8, 0x7

    goto :goto_3

    :sswitch_3
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_2

    :cond_4
    const/4 v8, 0x6

    goto :goto_3

    :sswitch_4
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_2

    :cond_5
    const/4 v8, 0x5

    goto :goto_3

    :sswitch_5
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    const/4 v8, 0x4

    goto :goto_3

    :sswitch_6
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_2

    :cond_7
    const/4 v8, 0x3

    goto :goto_3

    :sswitch_7
    invoke-virtual {v5, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_2

    :cond_8
    const/4 v8, 0x2

    goto :goto_3

    :sswitch_8
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_2

    :cond_9
    const/4 v8, 0x1

    goto :goto_3

    :sswitch_9
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_2

    :cond_a
    const/4 v8, 0x0

    goto :goto_3

    :goto_2
    const/4 v8, -0x1

    :goto_3
    packed-switch v8, :pswitch_data_0

    move-object/from16 v7, v16

    move-object/from16 v5, v17

    .line 60
    :pswitch_0
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    move-object/from16 v16, v1

    const-string v1, "-0x"

    move-object/from16 v17, v6

    const-string v6, "0x"

    move-object/from16 v18, v4

    const-string v4, "-"

    move-object/from16 v19, v2

    const/16 v2, 0x10

    sparse-switch v8, :sswitch_data_1

    goto/16 :goto_9

    :sswitch_a
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 65
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v7, v1}, Ll/ۖܽܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_a

    .line 60
    :sswitch_b
    invoke-virtual {v5, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 203
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 205
    :try_start_0
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    invoke-virtual {v0, v7, v1}, Ll/ۖܽܽ;->֫(Ljava/lang/String;F)V

    goto/16 :goto_a

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 207
    new-instance v0, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v0, v1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v0

    .line 60
    :sswitch_c
    invoke-virtual {v5, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    const/4 v1, 0x0

    .line 62
    invoke-virtual {v0, v1, v7, v1}, Ll/ۖܽܽ;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    goto/16 :goto_a

    .line 60
    :sswitch_d
    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 81
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v5

    .line 152
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 153
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_c

    invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    goto :goto_4

    .line 180
    :cond_b
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 182
    :try_start_1
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    invoke-virtual {v0, v1, v2, v7}, Ll/ۖܽܽ;->֫(JLjava/lang/String;)V

    goto/16 :goto_a

    :catch_1
    move-exception v0

    move-object v1, v0

    .line 184
    new-instance v0, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v0, v1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v0

    .line 189
    :cond_c
    :goto_4
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 192
    :try_start_2
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_d

    const/4 v4, 0x1

    .line 194
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/4 v4, -0x1

    goto :goto_5

    :cond_d
    const/4 v4, 0x1

    :goto_5
    const/4 v5, 0x2

    .line 196
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    move-result-wide v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    int-to-long v3, v4

    mul-long v1, v1, v3

    .line 82
    invoke-virtual {v0, v1, v2, v7}, Ll/ۖܽܽ;->ۧ(JLjava/lang/String;)V

    goto/16 :goto_a

    :catch_2
    move-exception v0

    .line 198
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v1, v0}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v1

    .line 60
    :sswitch_e
    invoke-virtual {v5, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 221
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 223
    :try_start_3
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 94
    invoke-virtual {v0, v7, v1}, Ll/ۖܽܽ;->֫(Ljava/lang/String;Z)V

    goto/16 :goto_a

    :catch_3
    move-exception v0

    move-object v1, v0

    .line 225
    new-instance v0, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v0, v1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v0

    .line 60
    :sswitch_f
    invoke-virtual {v5, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :sswitch_10
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 74
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v5

    .line 152
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    .line 153
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_f

    invoke-virtual {v5, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_6

    .line 157
    :cond_e
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 159
    :try_start_4
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 77
    invoke-virtual {v0, v1, v7}, Ll/ۖܽܽ;->֫(ILjava/lang/String;)V

    goto/16 :goto_a

    :catch_4
    move-exception v0

    move-object v1, v0

    .line 161
    new-instance v0, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v0, v1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v0

    .line 166
    :cond_f
    :goto_6
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 169
    :try_start_5
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v4, 0x1

    .line 171
    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    const/4 v4, -0x1

    goto :goto_7

    :cond_10
    const/4 v4, 0x1

    :goto_7
    const/4 v5, 0x2

    .line 173
    invoke-virtual {v1, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    mul-int v1, v1, v4

    .line 75
    invoke-virtual {v0, v1, v7}, Ll/ۖܽܽ;->ۧ(ILjava/lang/String;)V

    goto/16 :goto_a

    :catch_5
    move-exception v0

    .line 175
    new-instance v1, Ll/֫ۘܽ;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v1, v0}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v1

    :sswitch_11
    move-object/from16 v1, v19

    .line 60
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 125
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 126
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    .line 127
    rem-int/lit8 v4, v2, 0x2

    if-nez v4, :cond_13

    .line 130
    div-int/lit8 v4, v2, 0x2

    new-array v4, v4, [B

    const/4 v5, 0x0

    :goto_8
    if-ge v5, v2, :cond_12

    .line 132
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v6

    invoke-static {v6}, Ll/ۢܽܽ;->֫(C)I

    move-result v6

    add-int/lit8 v8, v5, 0x1

    .line 133
    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ll/ۢܽܽ;->֫(C)I

    move-result v8

    const/4 v9, -0x1

    if-eq v6, v9, :cond_11

    if-eq v8, v9, :cond_11

    .line 137
    div-int/lit8 v9, v5, 0x2

    mul-int/lit8 v6, v6, 0x10

    add-int/2addr v6, v8

    int-to-byte v6, v6

    aput-byte v6, v4, v9

    add-int/lit8 v5, v5, 0x2

    goto :goto_8

    .line 135
    :cond_11
    new-instance v0, Ll/֫ۘܽ;

    const-string v1, "Invalid characters for hex text"

    invoke-direct {v0, v1, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw v0

    .line 68
    :cond_12
    invoke-virtual {v0, v7, v4}, Ll/ۖܽܽ;->ۧ(Ljava/lang/String;[B)V

    goto :goto_a

    .line 128
    :cond_13
    new-instance v0, Ll/֫ۘܽ;

    const-string v1, "Invalid length for hex text"

    invoke-direct {v0, v1, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    throw v0

    :sswitch_12
    move-object/from16 v1, v18

    .line 60
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 212
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    .line 214
    :try_start_6
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v1
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    .line 91
    invoke-virtual {v0, v7, v1, v2}, Ll/ۖܽܽ;->֫(Ljava/lang/String;D)V

    goto :goto_a

    :catch_6
    move-exception v0

    move-object v1, v0

    .line 216
    new-instance v0, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v0, v1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v0

    :sswitch_13
    move-object/from16 v1, v17

    .line 60
    invoke-virtual {v5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    .line 143
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    .line 145
    :try_start_7
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v1
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7

    .line 71
    invoke-virtual {v0, v7, v1}, Ll/ۖܽܽ;->֫(Ljava/lang/String;[B)V

    goto :goto_a

    :catch_7
    move-exception v0

    move-object v1, v0

    .line 147
    new-instance v0, Ll/֫ۘܽ;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2, v3}, Ll/֫ۘܽ;-><init>(Ljava/lang/String;Ll/ᩴۘܽ;)V

    invoke-virtual {v0, v1}, Ll/֫ۘܽ;->initCause(Ljava/lang/Throwable;)V

    throw v0

    .line 98
    :cond_14
    :goto_9
    invoke-virtual {v3}, Ll/ᩴۘܽ;->ۧ()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v7, v1}, Ll/ۖܽܽ;->attribute(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    :goto_a
    move-object/from16 v2, p1

    move-object/from16 v1, v16

    goto/16 :goto_0

    :cond_15
    move-object/from16 v16, v1

    .line 102
    invoke-virtual/range {v16 .. v16}, Ll/᩵ۘܽ;->ۜ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡۘܽ;

    .line 103
    invoke-static {v0, v2}, Ll/ۢܽܽ;->֫(Ll/ۖܽܽ;Ll/ۡۘܽ;)V

    goto :goto_b

    .line 105
    :cond_16
    invoke-virtual/range {v16 .. v16}, Ll/᩵ۘܽ;->᩷()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ll/ۖܽܽ;->endTag(Ljava/lang/String;Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void

    .line 29
    :cond_17
    invoke-virtual/range {p1 .. p1}, Ll/ۡۘܽ;->ܳ()Z

    move-result v1

    if-nez v1, :cond_18

    .line 35
    move-object/from16 v1, p1

    check-cast v1, Ll/֨ۘܽ;

    .line 107
    invoke-virtual {v1}, Ll/֨ۘܽ;->᩻()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۖܽܽ;->text(Ljava/lang/String;)Lorg/xmlpull/v1/XmlSerializer;

    return-void

    .line 34
    :cond_18
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x533862b1 -> :sswitch_9
        -0x4f08842f -> :sswitch_8
        0x1931b -> :sswitch_7
        0x197ef -> :sswitch_6
        0x1be31 -> :sswitch_5
        0x2e3aea -> :sswitch_4
        0x32c67c -> :sswitch_3
        0x33c587 -> :sswitch_2
        0x5d0225c -> :sswitch_1
        0x21ffc731 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x533862b1 -> :sswitch_13
        -0x4f08842f -> :sswitch_12
        0x1931b -> :sswitch_11
        0x197ef -> :sswitch_10
        0x1be31 -> :sswitch_f
        0x2e3aea -> :sswitch_e
        0x32c67c -> :sswitch_d
        0x33c587 -> :sswitch_c
        0x5d0225c -> :sswitch_b
        0x21ffc731 -> :sswitch_a
    .end sparse-switch
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 4

    .line 16
    new-instance v0, Ll/ۖܽܽ;

    invoke-direct {v0}, Ll/ۖܽܽ;-><init>()V

    .line 17
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const-string v2, "utf-8"

    .line 18
    invoke-virtual {v0, v1, v2}, Ll/ۖܽܽ;->setOutput(Ljava/io/OutputStream;Ljava/lang/String;)V

    .line 19
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v2, v3}, Ll/ۖܽܽ;->startDocument(Ljava/lang/String;Ljava/lang/Boolean;)V

    .line 20
    sget v2, Ll/ۚۘܽ;->᩸:I

    .line 21
    new-instance v2, Ll/۟ۖܽ;

    invoke-direct {v2}, Ll/۟ۖܽ;-><init>()V

    .line 22
    new-instance v3, Ljava/io/StringReader;

    invoke-direct {v3, p0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Ll/۟ۖܽ;->֫(Ljava/io/Reader;)V

    const/4 p0, 0x1

    .line 23
    invoke-static {v2, p0}, Ll/ۚۘܽ;->֫(Ll/۟ۖܽ;Z)Ll/ۚۘܽ;

    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩵ۘܽ;

    .line 22
    invoke-static {v0, v2}, Ll/ۢܽܽ;->֫(Ll/ۖܽܽ;Ll/ۡۘܽ;)V

    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v0}, Ll/ۖܽܽ;->endDocument()V

    .line 25
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    return-object p0
.end method
