.class public final Ll/ۚۧۜ;
.super Ljava/lang/Object;
.source "C766"


# direct methods
.method public static ֫(Ll/ۘ۟᩻;Ljava/lang/String;JZ)Ll/ۘܺۢ;
    .locals 0

    .line 159
    :try_start_0
    check-cast p0, Ll/᩹ۧۜ;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p0, 0x0

    .line 114
    invoke-static {p1, p2, p3, p4, p0}, Ll/ܺܺۢ;->֫(Ljava/lang/String;JZZ)Ll/ۘܺۢ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const-string p0, "NATIVE_ANALYZER_FAILED"

    const-string p1, "Native ELF analysis failed."

    .line 328
    invoke-static {p0, p1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    .line 161
    throw p0
.end method

.method public static ֫(Ll/᩹ۧۜ;Ll/۟۟᩻;Ll/᩹۟᩻;ZLbin/mt/json/JSONValue;)Ll/᩵ۧۜ;
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    .line 33
    iget-object v3, v2, Ll/᩹۟᩻;->ܽ:Ljava/lang/String;

    iget-object v4, v2, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    iget-object v5, v2, Ll/᩹۟᩻;->ۡ:Ljava/lang/String;

    iget-object v6, v1, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    invoke-static {v6}, Ll/ۨ۟᩻;->ᩳ(Ljava/lang/String;)Ll/ۨ۟᩻;

    move-result-object v7

    iget v8, v7, Ll/ۨ۟᩻;->ۧ:I

    const/16 v9, 0x28

    const-string v10, "data"

    if-eqz p3, :cond_1

    .line 35
    iget-object v5, v2, Ll/᩹۟᩻;->۠:Ljava/lang/String;

    :cond_0
    :goto_0
    move-object v13, v5

    goto :goto_2

    :cond_1
    const-string v11, "auto"

    if-ne v8, v9, :cond_5

    .line 84
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 85
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 86
    :cond_2
    invoke-static/range {p2 .. p2}, Ll/ۜ֫ۜ;->֫(Ll/᩹۟᩻;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_3
    const-string v9, "arm"

    .line 90
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_0

    const-string v9, "thumb"

    .line 91
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    goto :goto_0

    .line 94
    :cond_4
    invoke-static/range {p2 .. p2}, Ll/ۜ֫ۜ;->ۧ(Ll/᩹۟᩻;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 78
    :cond_5
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_37

    :goto_1
    move-object v13, v11

    :goto_2
    if-eqz p3, :cond_6

    .line 37
    iget-object v5, v2, Ll/᩹۟᩻;->ᩳ:Ljava/lang/String;

    goto :goto_3

    :cond_6
    invoke-virtual {v7}, Ll/ۨ۟᩻;->֫()Ljava/lang/String;

    move-result-object v5

    :goto_3
    if-eqz p3, :cond_7

    .line 38
    iget v9, v2, Ll/᩹۟᩻;->ܿ:I

    goto :goto_4

    :cond_7
    invoke-virtual {v7, v13}, Ll/ۨ۟᩻;->֫(Ljava/lang/String;)I

    move-result v9

    .line 39
    :goto_4
    iget-wide v11, v2, Ll/᩹۟᩻;->֫:J

    const-string v14, "virtual"

    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-eqz p3, :cond_9

    move-object/from16 v29, v13

    .line 106
    iget-wide v13, v2, Ll/᩹۟᩻;->᩸:J

    if-eqz v15, :cond_8

    move-wide v11, v13

    .line 108
    :cond_8
    invoke-static {v0, v6, v11, v12, v15}, Ll/ۚۧۜ;->֫(Ll/ۘ۟᩻;Ljava/lang/String;JZ)Ll/ۘܺۢ;

    move-result-object v3

    .line 109
    invoke-static {v3}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 110
    new-instance v6, Ll/֡ۧۜ;

    invoke-direct {v6, v3, v13, v14}, Ll/֡ۧۜ;-><init>(Ll/ۘܺۢ;J)V

    goto :goto_7

    :cond_9
    move-object/from16 v29, v13

    .line 113
    invoke-static {v0, v6, v11, v12, v15}, Ll/ۚۧۜ;->֫(Ll/ۘ۟᩻;Ljava/lang/String;JZ)Ll/ۘܺۢ;

    move-result-object v13

    .line 114
    invoke-static {v13}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    const/16 v2, 0x28

    if-ne v8, v2, :cond_c

    .line 139
    invoke-virtual {v14, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_c

    const-wide/16 v2, 0x1

    and-long v16, v11, v2

    cmp-long v14, v16, v2

    if-nez v14, :cond_c

    const-wide/16 v2, -0x2

    and-long/2addr v2, v11

    .line 121
    iget-boolean v14, v13, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v14, :cond_a

    iget-boolean v15, v13, Ll/ۘܺۢ;->ܿ:Z

    if-eqz v15, :cond_a

    const/4 v11, 0x1

    .line 122
    invoke-static {v0, v6, v2, v3, v11}, Ll/ۚۧۜ;->֫(Ll/ۘ۟᩻;Ljava/lang/String;JZ)Ll/ۘܺۢ;

    move-result-object v6

    .line 123
    invoke-static {v6}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 124
    new-instance v11, Ll/֡ۧۜ;

    invoke-direct {v11, v6, v2, v3}, Ll/֡ۧۜ;-><init>(Ll/ۘܺۢ;J)V

    :goto_5
    move-object v6, v11

    goto :goto_7

    :cond_a
    const/4 v15, 0x1

    if-nez v14, :cond_b

    .line 127
    invoke-static {v0, v6, v2, v3, v15}, Ll/ۚۧۜ;->֫(Ll/ۘ۟᩻;Ljava/lang/String;JZ)Ll/ۘܺۢ;

    move-result-object v6

    .line 128
    invoke-static {v6}, Ll/۫֫ۜ;->ܽ(Ll/ۘܺۢ;)V

    .line 129
    iget-boolean v14, v6, Ll/ۘܺۢ;->ۧ:Z

    if-eqz v14, :cond_b

    iget-boolean v14, v6, Ll/ۘܺۢ;->ܿ:Z

    if-eqz v14, :cond_b

    .line 130
    new-instance v11, Ll/֡ۧۜ;

    invoke-direct {v11, v6, v2, v3}, Ll/֡ۧۜ;-><init>(Ll/ۘܺۢ;J)V

    goto :goto_5

    .line 133
    :cond_b
    new-instance v6, Ll/֡ۧۜ;

    invoke-direct {v6, v13, v11, v12}, Ll/֡ۧۜ;-><init>(Ll/ۘܺۢ;J)V

    goto :goto_7

    .line 116
    :cond_c
    new-instance v6, Ll/֡ۧۜ;

    if-eqz v15, :cond_d

    goto :goto_6

    .line 117
    :cond_d
    iget-wide v11, v13, Ll/ۘܺۢ;->ܺ:J

    :goto_6
    invoke-direct {v6, v13, v11, v12}, Ll/֡ۧۜ;-><init>(Ll/ۘܺۢ;J)V

    .line 42
    :goto_7
    invoke-static {v6}, Ll/֡ۧۜ;->֫(Ll/֡ۧۜ;)Ll/ۘܺۢ;

    move-result-object v2

    const/16 v3, 0x28

    if-ne v8, v3, :cond_e

    .line 43
    iget-boolean v3, v2, Ll/ۘܺۢ;->ܿ:Z

    if-eqz v3, :cond_e

    const/4 v3, 0x1

    const/16 v20, 0x1

    goto :goto_8

    :cond_e
    const/4 v3, 0x0

    const/16 v20, 0x0

    .line 44
    :goto_8
    iget-boolean v3, v2, Ll/ۘܺۢ;->ۧ:Z

    const-string v8, ""

    if-nez v3, :cond_11

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 189
    invoke-static {}, Ll/ܺۖۢ;->֫()Ll/ܺۖۢ;

    move-result-object v21

    .line 46
    new-instance v0, Ll/᩵ۧۜ;

    .line 138
    iget v1, v7, Ll/ۨ۟᩻;->֫:I

    .line 145
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_f

    move-object/from16 v19, v8

    move-object/from16 v11, v29

    goto :goto_9

    :cond_f
    move-object/from16 v11, v29

    .line 146
    invoke-virtual {v7, v11}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v3

    .line 151
    :goto_9
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_10

    move-object/from16 v20, v8

    goto :goto_a

    .line 152
    :cond_10
    invoke-virtual {v7, v11}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v20, v3

    :goto_a
    const/4 v14, 0x0

    move-object v12, v0

    move-object v13, v11

    move-object v15, v2

    move-object/from16 v16, v5

    move/from16 v17, v9

    move/from16 v18, v1

    .line 48
    invoke-direct/range {v12 .. v21}, Ll/᩵ۧۜ;-><init>(Ljava/lang/String;ZLl/ۘܺۢ;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ll/ܺۖۢ;)V

    return-object v0

    :cond_11
    move-object/from16 v11, v29

    .line 50
    iget-boolean v3, v2, Ll/ۘܺۢ;->ܳ:Z

    if-nez v3, :cond_14

    .line 0
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 189
    invoke-static {}, Ll/ܺۖۢ;->֫()Ll/ܺۖۢ;

    move-result-object v21

    .line 52
    new-instance v0, Ll/᩵ۧۜ;

    .line 138
    iget v1, v7, Ll/ۨ۟᩻;->֫:I

    .line 145
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_12

    move-object/from16 v19, v8

    goto :goto_b

    .line 146
    :cond_12
    invoke-virtual {v7, v11}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v19, v3

    .line 151
    :goto_b
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_13

    move-object/from16 v20, v8

    goto :goto_c

    .line 152
    :cond_13
    invoke-virtual {v7, v11}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v20, v3

    :goto_c
    const/4 v14, 0x0

    move-object v12, v0

    move-object v13, v11

    move-object v15, v2

    move-object/from16 v16, v5

    move/from16 v17, v9

    move/from16 v18, v1

    .line 54
    invoke-direct/range {v12 .. v21}, Ll/᩵ۧۜ;-><init>(Ljava/lang/String;ZLl/ۘܺۢ;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ll/ܺۖۢ;)V

    return-object v0

    .line 56
    :cond_14
    invoke-static {v6}, Ll/֡ۧۜ;->ۧ(Ll/֡ۧۜ;)J

    move-result-wide v18

    const-wide/16 v12, 0x0

    cmp-long v3, v18, v12

    if-ltz v3, :cond_36

    .line 60
    iget-object v14, v1, Ll/۟۟᩻;->ۙ:Ljava/lang/String;

    move-object/from16 v1, p2

    iget-object v3, v1, Ll/᩹۟᩻;->ܶ:Ljava/lang/String;

    iget v6, v1, Ll/᩹۟᩻;->ᩴ:I

    iget v15, v1, Ll/᩹۟᩻;->᩵:I

    iget-wide v12, v1, Ll/᩹۟᩻;->ܳ:J

    iget v0, v1, Ll/᩹۟᩻;->֨:I

    move-object/from16 v30, v8

    iget v8, v1, Ll/᩹۟᩻;->ۘ:I

    move-object/from16 v31, v2

    iget v2, v1, Ll/᩹۟᩻;->ܺ:I

    move-object/from16 v32, v11

    iget-object v11, v1, Ll/᩹۟᩻;->ۚ:Ljava/util/List;

    .line 174
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v22, v15

    move-object v15, v5

    move/from16 v16, v9

    move-object/from16 v17, v3

    move/from16 v21, v6

    move-wide/from16 v23, v12

    move/from16 v25, v0

    move/from16 v26, v8

    move/from16 v27, v2

    move-object/from16 v28, v11

    .line 83
    invoke-static/range {v14 .. v28}, Ll/ܺܺۢ;->֫(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JZIIJIIILjava/util/List;)Ll/ܺۖۢ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 195
    iget v2, v1, Ll/᩹۟᩻;->ᩴ:I

    const-string v3, "code"

    .line 239
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    const/4 v6, 0x1

    goto :goto_d

    .line 242
    :cond_15
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_16

    const/4 v6, 0x2

    goto :goto_d

    :cond_16
    const/4 v6, 0x3

    .line 196
    :goto_d
    iget v8, v0, Ll/ܺۖۢ;->᩻:I

    iget-object v11, v0, Ll/ܺۖۢ;->ۧ:Ljava/util/List;

    iget v12, v0, Ll/ܺۖۢ;->ܳ:I

    iget-wide v13, v0, Ll/ܺۖۢ;->ܽ:J

    iget v15, v0, Ll/ܺۖۢ;->ܿ:I

    move/from16 v17, v9

    iget-boolean v9, v0, Ll/ܺۖۢ;->ۜ:Z

    move-object/from16 v16, v5

    iget v5, v0, Ll/ܺۖۢ;->ᩳ:I

    if-ltz v8, :cond_34

    if-ltz v5, :cond_34

    if-gt v5, v6, :cond_34

    if-nez v9, :cond_17

    if-ge v5, v6, :cond_34

    :cond_17
    if-ltz v15, :cond_34

    if-gt v15, v8, :cond_34

    const-wide/16 v18, 0x0

    cmp-long v8, v13, v18

    if-ltz v8, :cond_34

    if-ltz v12, :cond_34

    iget v8, v0, Ll/ܺۖۢ;->᩷:I

    if-ltz v8, :cond_34

    move-object/from16 v18, v7

    iget v7, v1, Ll/᩹۟᩻;->ۘ:I

    if-gt v8, v7, :cond_34

    .line 201
    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v7

    iget v8, v1, Ll/᩹۟᩻;->ܺ:I

    if-gt v7, v8, :cond_34

    if-eqz v9, :cond_19

    if-ne v5, v6, :cond_18

    goto :goto_e

    .line 205
    :cond_18
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_19
    :goto_e
    if-nez v9, :cond_1e

    if-eq v5, v2, :cond_1a

    if-le v5, v2, :cond_1d

    goto :goto_f

    .line 252
    :cond_1a
    iget v5, v1, Ll/᩹۟᩻;->᩵:I

    if-eq v15, v5, :cond_1b

    if-le v15, v5, :cond_1d

    goto :goto_f

    .line 255
    :cond_1b
    iget-wide v5, v1, Ll/᩹۟᩻;->ܳ:J

    cmp-long v7, v13, v5

    if-eqz v7, :cond_1c

    if-lez v7, :cond_1d

    goto :goto_f

    .line 258
    :cond_1c
    iget v5, v1, Ll/᩹۟᩻;->֨:I

    if-le v12, v5, :cond_1d

    goto :goto_f

    .line 208
    :cond_1d
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 220
    :cond_1e
    :goto_f
    iget-object v5, v0, Ll/ܺۖۢ;->֫:Ljava/lang/String;

    invoke-static {v5}, Ll/ۛ᩸ۘ;->ۧ(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_33

    const-string v6, "target_not_mapped"

    .line 221
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_33

    if-eqz v9, :cond_20

    const-string v6, "scan_space_exhausted"

    .line 225
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1f

    goto :goto_10

    .line 226
    :cond_1f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_20
    const-string v6, "result_limit_reached"

    .line 230
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_22

    const-string v6, "scan_budget_exhausted"

    .line 231
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_22

    const-string v6, "relocation_page_budget_exhausted"

    .line 233
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_21

    goto :goto_10

    .line 234
    :cond_21
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 211
    :cond_22
    :goto_10
    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_11
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_30

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۡۖۢ;

    .line 263
    iget-object v7, v6, Ll/ۡۖۢ;->ۧ:Ljava/lang/String;

    iget-object v8, v6, Ll/ۡۖۢ;->֫:Ljava/lang/String;

    iget v9, v6, Ll/ۡۖۢ;->ܿ:I

    iget-wide v11, v6, Ll/ۡۖۢ;->ܽ:J

    iget-object v13, v6, Ll/ۡۖۢ;->ᩳ:Ljava/lang/String;

    invoke-static {v7}, Ll/ۖۖۢ;->֫(Ljava/lang/String;)I

    move-result v7

    .line 264
    iget-wide v14, v6, Ll/ۡۖۢ;->᩻:J

    const-wide/16 v19, 0x0

    cmp-long v21, v14, v19

    if-ltz v21, :cond_2f

    cmp-long v21, v11, v19

    if-ltz v21, :cond_2f

    if-lez v9, :cond_2f

    move-object/from16 p0, v5

    iget-object v5, v6, Ll/ۡۖۢ;->ۜ:Ljava/lang/String;

    if-eqz v5, :cond_2f

    .line 265
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    move-object/from16 p1, v0

    const/16 v0, 0x200

    if-gt v5, v0, :cond_2f

    const-string v0, "instruction"

    .line 304
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    move-wide/from16 v19, v11

    const-string v11, "data_pointer"

    const-string v12, "data_relocation"

    if-nez v5, :cond_23

    .line 305
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_23

    .line 306
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    :cond_23
    if-eqz v7, :cond_2f

    .line 266
    iget v5, v1, Ll/᩹۟᩻;->֡:I

    and-int/2addr v5, v7

    if-eqz v5, :cond_2f

    .line 268
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_24

    .line 269
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2f

    .line 270
    :cond_24
    invoke-virtual {v10, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_25

    .line 271
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2f

    :cond_25
    const-string v5, "both"

    .line 272
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_26

    if-lez v2, :cond_26

    .line 273
    invoke-virtual {v0, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2f

    .line 310
    :cond_26
    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    .line 311
    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_28

    :cond_27
    const/4 v0, 0x4

    if-ne v7, v0, :cond_2f

    :cond_28
    if-eqz v8, :cond_2f

    .line 315
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    and-int/lit8 v0, v0, 0x1

    if-nez v0, :cond_2f

    const/4 v0, 0x0

    .line 318
    :goto_12
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v0, v5, :cond_2b

    .line 319
    invoke-virtual {v8, v0}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v7, 0x30

    if-lt v5, v7, :cond_29

    const/16 v7, 0x39

    if-le v5, v7, :cond_2a

    :cond_29
    const/16 v7, 0x61

    if-lt v5, v7, :cond_2f

    const/16 v7, 0x66

    if-gt v5, v7, :cond_2f

    :cond_2a
    add-int/lit8 v0, v0, 0x1

    goto :goto_12

    .line 277
    :cond_2b
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v9, v9, 0x2

    if-ne v0, v9, :cond_2f

    .line 287
    iget-object v0, v6, Ll/ۡۖۢ;->ܳ:Ll/ۘۖۢ;

    if-nez v0, :cond_2c

    move v9, v2

    move-object/from16 p3, v3

    move-object v13, v4

    const-wide/16 v7, 0x0

    goto :goto_13

    .line 291
    :cond_2c
    iget-wide v5, v0, Ll/ۘۖۢ;->ܳ:J

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-ltz v9, :cond_2e

    iget-wide v11, v0, Ll/ۘۖۢ;->ܿ:J

    const-wide/16 v21, -0x1

    cmp-long v9, v11, v21

    if-ltz v9, :cond_2e

    move v9, v2

    iget-wide v1, v0, Ll/ۘۖۢ;->ܽ:J

    cmp-long v13, v1, v7

    if-ltz v13, :cond_2e

    move-object/from16 p3, v3

    move-object v13, v4

    iget-wide v3, v0, Ll/ۘۖۢ;->ᩳ:J

    cmp-long v0, v3, v7

    if-lez v0, :cond_2e

    cmp-long v0, v1, v3

    if-gez v0, :cond_2e

    const-wide v21, 0x7fffffffffffffffL

    sub-long v23, v21, v1

    cmp-long v0, v5, v23

    if-gtz v0, :cond_2e

    add-long v25, v5, v1

    cmp-long v0, v25, v14

    if-nez v0, :cond_2e

    cmp-long v0, v11, v7

    if-ltz v0, :cond_2d

    cmp-long v0, v11, v23

    if-gtz v0, :cond_2e

    add-long/2addr v11, v1

    cmp-long v0, v11, v19

    if-nez v0, :cond_2e

    :cond_2d
    sub-long v21, v21, v3

    cmp-long v0, v5, v21

    if-gtz v0, :cond_2e

    :goto_13
    move-object/from16 v5, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v3, p3

    move v2, v9

    move-object v4, v13

    goto/16 :goto_11

    .line 299
    :cond_2e
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 278
    :cond_2f
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_30
    move-object/from16 p1, v0

    move-object v13, v4

    .line 66
    new-instance v0, Ll/᩵ۧۜ;

    move-object/from16 v1, v18

    .line 138
    iget v2, v1, Ll/ۨ۟᩻;->֫:I

    move-object v3, v13

    .line 145
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_31

    move-object/from16 v19, v30

    move-object/from16 v5, v32

    goto :goto_14

    :cond_31
    move-object/from16 v5, v32

    .line 146
    invoke-virtual {v1, v5}, Ll/ۨ۟᩻;->ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v19, v4

    .line 151
    :goto_14
    invoke-virtual {v10, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_32

    move-object/from16 v20, v30

    goto :goto_15

    .line 152
    :cond_32
    invoke-virtual {v1, v5}, Ll/ۨ۟᩻;->ܽ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v20, v1

    :goto_15
    const/4 v14, 0x1

    move-object v12, v0

    move-object v13, v5

    move-object/from16 v15, v31

    move/from16 v18, v2

    move-object/from16 v21, p1

    .line 68
    invoke-direct/range {v12 .. v21}, Ll/᩵ۧۜ;-><init>(Ljava/lang/String;ZLl/ۘܺۢ;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ll/ܺۖۢ;)V

    return-object v0

    .line 222
    :cond_33
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 202
    :cond_34
    invoke-static {}, Ll/۫֫ۜ;->֫()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :catch_0
    const-string v0, "NATIVE_ANALYZER_FAILED"

    const-string v1, "Native ELF analysis failed."

    .line 328
    invoke-static {v0, v1}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 184
    throw v0

    :catch_1
    const-string v0, "<cursor>"

    const-string v1, "nextCursor"

    if-eqz p3, :cond_35

    .line 340
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    .line 341
    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Invalid cursor"

    move-object/from16 v4, p4

    .line 339
    invoke-static {v3, v1, v4, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 179
    throw v0

    .line 182
    :cond_35
    invoke-static {}, Lbin/mt/json/JSON;->array()Lbin/mt/json/JSONArray;

    move-result-object v2

    invoke-static {}, Lbin/mt/json/JSON;->object()Lbin/mt/json/JSONObject;

    move-result-object v3

    invoke-virtual {v3, v1, v0}, Lbin/mt/json/JSONObject;->add(Ljava/lang/String;Ljava/lang/String;)Lbin/mt/json/JSONObject;

    move-result-object v0

    const-string v3, "Invalid native xref scan position"

    const/4 v4, 0x0

    .line 181
    invoke-static {v3, v1, v4, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    .line 58
    :cond_36
    invoke-static {}, Ll/۫֫ۜ;->ܿ()Ll/ۗۛ᩻;

    move-result-object v0

    throw v0

    :cond_37
    const/4 v0, 0x0

    .line 80
    invoke-static {v5}, Lbin/mt/json/JSON;->value(Ljava/lang/String;)Lbin/mt/json/JSONValue;

    move-result-object v1

    filled-new-array {v11}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lbin/mt/json/JSON;->array([Ljava/lang/String;)Lbin/mt/json/JSONArray;

    move-result-object v2

    const-string v3, "instructionMode must be auto for non-ARM ELF"

    const-string v4, "instructionMode"

    .line 79
    invoke-static {v3, v4, v1, v2, v0}, Ll/ۗۛ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Lbin/mt/json/JSONValue;Lbin/mt/json/JSONArray;Lbin/mt/json/JSONObject;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method
