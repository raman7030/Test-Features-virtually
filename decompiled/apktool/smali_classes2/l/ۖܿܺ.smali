.class public final Ll/ۖܿܺ;
.super Ljava/lang/Object;
.source "SBEY"


# direct methods
.method public static ֫(Ll/᩻ܿܺ;Ll/᩹ᩳܺ;Ll/ܺܿܺ;Ll/ۢܿܺ;Ll/֫ۜܺ;)Ll/ۗ᩻ܺ;
    .locals 0

    .line 111
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ۖܿܺ;->ۧ(Ll/᩻ܿܺ;Ll/᩹ᩳܺ;Ll/ܺܿܺ;Ll/ۢܿܺ;Ll/֫ۜܺ;)Ll/ۗ᩻ܺ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 113
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "...while processing "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ll/᩹ᩳܺ;->᩻()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 114
    invoke-static {p1, p0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ll/ۛܺܺ;Ll/۟ܺܺ;)Ll/ۛܺܺ;
    .locals 3

    .line 249
    invoke-interface {p0}, Ll/֫ۖܺ;->getType()Ll/۟ܺܺ;

    move-result-object v0

    .line 251
    invoke-virtual {v0, p1}, Ll/۟ܺܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 255
    :cond_0
    invoke-virtual {p1}, Ll/۟ܺܺ;->ܿ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 266
    check-cast p0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result p0

    .line 266
    invoke-static {p0}, Ll/ۗܺܺ;->֫(I)Ll/ۗܺܺ;

    move-result-object p0

    return-object p0

    .line 269
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "can\'t coerce "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " to "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 263
    :cond_2
    check-cast p0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result p0

    .line 263
    invoke-static {p0}, Ll/ۜܺܺ;->֫(I)Ll/ۜܺܺ;

    move-result-object p0

    return-object p0

    .line 260
    :cond_3
    check-cast p0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result p0

    .line 260
    invoke-static {p0}, Ll/ܿܺܺ;->֫(I)Ll/ܿܺܺ;

    move-result-object p0

    return-object p0

    .line 257
    :cond_4
    check-cast p0, Ll/ۖܺܺ;

    .line 140
    invoke-virtual {p0}, Ll/֡ܺܺ;->ᩴ()I

    move-result p0

    .line 257
    invoke-static {p0}, Ll/ᩳܺܺ;->֫(I)Ll/ᩳܺܺ;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/᩻ܿܺ;Ll/᩹ᩳܺ;Ll/ܺܿܺ;Ll/ۢܿܺ;Ll/֫ۜܺ;)Ll/ۗ᩻ܺ;
    .locals 39

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "Exceptions"

    .line 134
    iget-object v0, v1, Ll/᩻ܿܺ;->֫:Ll/ۘܿܺ;

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ll/ۘܿܺ;->֫()V

    .line 139
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۖ()Ll/۫ܺܺ;

    move-result-object v7

    .line 140
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->֫()I

    move-result v0

    and-int/lit8 v8, v0, -0x21

    .line 142
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۡ()Ll/۬ܺܺ;

    move-result-object v11

    .line 143
    new-instance v12, Ll/ۗ᩻ܺ;

    .line 145
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܺ()Ll/۫ܺܺ;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۜ()Ll/ۧۖܺ;

    move-result-object v10

    move-object v6, v12

    invoke-direct/range {v6 .. v11}, Ll/ۗ᩻ܺ;-><init>(Ll/۫ܺܺ;ILl/۫ܺܺ;Ll/ۧۖܺ;Ll/۬ܺܺ;)V

    .line 148
    invoke-static/range {p1 .. p2}, Ll/ۡܿܺ;->֫(Ll/᩹ᩳܺ;Ll/ܺܿܺ;)Ll/᩺ۢܺ;

    move-result-object v0

    .line 149
    invoke-virtual {v0}, Ll/᩺ۢܺ;->size()I

    move-result v6

    if-eqz v6, :cond_0

    .line 150
    invoke-virtual {v12, v0, v4}, Ll/ۗ᩻ܺ;->֫(Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    .line 153
    :cond_0
    invoke-virtual/range {p4 .. p4}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object v6

    .line 154
    invoke-virtual/range {p4 .. p4}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object v7

    .line 155
    invoke-virtual/range {p4 .. p4}, Ll/֫ۜܺ;->ۡ()Ll/۠ۜܺ;

    move-result-object v8

    .line 156
    invoke-virtual/range {p4 .. p4}, Ll/֫ۜܺ;->ۧ()Ll/᩸᩻ܺ;

    move-result-object v9

    .line 204
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۖ()Ll/۫ܺܺ;

    move-result-object v0

    .line 205
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܳ()Ll/֫ܿܺ;

    move-result-object v10

    .line 206
    invoke-virtual {v10}, Ll/ܿᩴܺ;->size()I

    move-result v11

    const/4 v13, 0x0

    :goto_0
    const-string v14, " "

    const-string v15, "...while processing "

    if-ge v13, v11, :cond_5

    .line 209
    invoke-virtual {v10, v13}, Ll/ܿᩴܺ;->get(I)Ll/ۤᩳܺ;

    move-result-object v16

    move-object/from16 v17, v10

    .line 211
    :try_start_0
    new-instance v10, Ll/ۡܺܺ;

    move/from16 v18, v11

    invoke-interface/range {v16 .. v16}, Ll/ۛᩳܺ;->ۜ()Ll/᩶ܺܺ;

    move-result-object v11

    invoke-direct {v10, v0, v11}, Ll/ۡܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    .line 212
    invoke-interface/range {v16 .. v16}, Ll/ۛᩳܺ;->ܽ()I

    move-result v11

    and-int/lit8 v19, v11, 0x8

    if-eqz v19, :cond_1

    const/16 v19, 0x1

    goto :goto_1

    :cond_1
    const/16 v19, 0x0

    :goto_1
    if-eqz v19, :cond_3

    move-object/from16 v19, v0

    .line 215
    invoke-interface/range {v16 .. v16}, Ll/ۤᩳܺ;->ۧ()Ll/ۛܺܺ;

    move-result-object v0

    move-object/from16 v20, v9

    .line 216
    new-instance v9, Ll/ܽۜܺ;

    invoke-direct {v9, v10, v11}, Ll/ܽۜܺ;-><init>(Ll/ۡܺܺ;I)V

    if-eqz v0, :cond_2

    .line 218
    invoke-virtual {v10}, Ll/ۡܺܺ;->getType()Ll/۟ܺܺ;

    move-result-object v11

    invoke-static {v0, v11}, Ll/ۖܿܺ;->֫(Ll/ۛܺܺ;Ll/۟ܺܺ;)Ll/ۛܺܺ;

    move-result-object v0

    .line 220
    :cond_2
    invoke-virtual {v12, v9, v0}, Ll/ۗ᩻ܺ;->֫(Ll/ܽۜܺ;Ll/ܰۡܺ;)V

    goto :goto_2

    :cond_3
    move-object/from16 v19, v0

    move-object/from16 v20, v9

    .line 222
    new-instance v0, Ll/ܽۜܺ;

    invoke-direct {v0, v10, v11}, Ll/ܽۜܺ;-><init>(Ll/ۡܺܺ;I)V

    .line 223
    invoke-virtual {v12, v0}, Ll/ۗ᩻ܺ;->֫(Ll/ܽۜܺ;)V

    .line 227
    :goto_2
    invoke-interface/range {v16 .. v16}, Ll/ۛᩳܺ;->getAttributes()Ll/ܰᩳܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡܿܺ;->֫(Ll/ܰᩳܺ;)Ll/᩺ۢܺ;

    move-result-object v0

    .line 228
    invoke-virtual {v0}, Ll/᩺ۢܺ;->size()I

    move-result v9

    if-eqz v9, :cond_4

    .line 229
    invoke-virtual {v12, v10, v0, v4}, Ll/ۗ᩻ܺ;->֫(Ll/ۡܺܺ;Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    .line 231
    :cond_4
    invoke-virtual/range {p4 .. p4}, Ll/֫ۜܺ;->ܳ()Ll/ۜۜܺ;

    move-result-object v0

    invoke-virtual {v0, v10}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v13, v13, 0x1

    move-object/from16 v10, v17

    move/from16 v11, v18

    move-object/from16 v0, v19

    move-object/from16 v9, v20

    goto :goto_0

    :catch_0
    move-exception v0

    .line 233
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface/range {v16 .. v16}, Ll/ۛᩳܺ;->getName()Ll/۬ܺܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    invoke-interface/range {v16 .. v16}, Ll/ۛᩳܺ;->᩻()Ll/۬ܺܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 235
    invoke-static {v1, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object v0

    throw v0

    :cond_5
    move-object/from16 v20, v9

    .line 287
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۖ()Ll/۫ܺܺ;

    move-result-object v9

    .line 288
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۢ()Ll/ᩳܿܺ;

    move-result-object v10

    .line 289
    invoke-virtual {v10}, Ll/ܿᩴܺ;->size()I

    move-result v11

    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_3
    if-ge v13, v11, :cond_1d

    move/from16 v16, v11

    .line 292
    invoke-virtual {v10, v13}, Ll/ܿᩴܺ;->get(I)Ll/ۨᩳܺ;

    move-result-object v11

    move-object/from16 v17, v8

    .line 294
    :try_start_1
    new-instance v8, Ll/᩹ܺܺ;

    invoke-interface {v11}, Ll/ۛᩳܺ;->ۜ()Ll/᩶ܺܺ;

    move-result-object v0

    invoke-direct {v8, v9, v0}, Ll/᩹ܺܺ;-><init>(Ll/۫ܺܺ;Ll/᩶ܺܺ;)V

    move-object/from16 v18, v6

    .line 295
    invoke-interface {v11}, Ll/ۛᩳܺ;->ܽ()I

    move-result v6

    and-int/lit8 v0, v6, 0x8

    if-eqz v0, :cond_6

    const/4 v0, 0x1

    move-object/from16 v19, v7

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    const/4 v0, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    :goto_4
    and-int/lit8 v0, v6, 0x2

    if-eqz v0, :cond_7

    const/4 v0, 0x1

    const/16 v21, 0x1

    goto :goto_5

    :cond_7
    const/4 v0, 0x0

    const/16 v21, 0x0

    :goto_5
    and-int/lit16 v0, v6, 0x100

    if-eqz v0, :cond_8

    const/4 v0, 0x1

    const/16 v22, 0x1

    goto :goto_6

    :cond_8
    const/4 v0, 0x0

    const/16 v22, 0x0

    :goto_6
    and-int/lit16 v0, v6, 0x400

    if-eqz v0, :cond_9

    const/4 v0, 0x1

    goto :goto_7

    :cond_9
    const/4 v0, 0x0

    .line 151
    :goto_7
    invoke-virtual {v8}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ll/᩶ܺܺ;->ۚ()Z

    move-result v23

    if-nez v23, :cond_b

    .line 163
    invoke-virtual {v8}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ll/᩶ܺܺ;->֡()Z

    move-result v23
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_5

    if-eqz v23, :cond_a

    goto :goto_8

    :cond_a
    const/16 v23, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    const/16 v23, 0x1

    :goto_9
    const/16 v24, 0x0

    if-nez v22, :cond_10

    if-eqz v0, :cond_c

    goto/16 :goto_d

    .line 313
    :cond_c
    :try_start_2
    new-instance v0, Ll/ۗܽܺ;
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    move-object/from16 v25, v14

    :try_start_3
    iget-boolean v14, v2, Ll/ܺܿܺ;->֫:Z
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2

    move-object/from16 v26, v15

    move-object/from16 v15, p1

    :try_start_4
    invoke-direct {v0, v11, v15, v14}, Ll/ۗܽܺ;-><init>(Ll/ۨᩳܺ;Ll/᩹ᩳܺ;Z)V

    .line 316
    invoke-static {v0, v10, v3}, Ll/ۡᩳܺ;->֫(Ll/ۗܽܺ;Ll/ᩳܿܺ;Ll/ۢܿܺ;)Ll/۬ۡܺ;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    move/from16 v27, v13

    goto/16 :goto_c

    :catch_1
    move-exception v0

    goto :goto_b

    :catch_2
    move-exception v0

    :goto_a
    move-object/from16 v26, v15

    move-object/from16 v15, p1

    goto :goto_b

    :catch_3
    move-exception v0

    move-object/from16 v25, v14

    goto :goto_a

    .line 318
    :goto_b
    :try_start_5
    iget-boolean v14, v2, Ll/ܺܿܺ;->ܽ:Z

    if-eqz v14, :cond_f

    .line 322
    new-instance v0, Ll/ۜ᩶ۚ;

    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->֫()I

    move-result v14

    invoke-direct {v0, v14}, Ll/ۜ᩶ۚ;-><init>(I)V

    .line 323
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->֫()I

    move-result v29

    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۖ()Ll/۫ܺܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/۟ܺܺ;->ܺ()Ljava/lang/String;

    move-result-object v30

    const-string v32, "java/lang/Object"

    const/16 v33, 0x0

    const v28, 0x3002d

    const/16 v31, 0x0

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v33}, Ll/ۜ᩶ۚ;->֫(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 324
    invoke-interface {v11}, Ll/ۛᩳܺ;->ܽ()I

    move-result v28

    invoke-interface {v11}, Ll/ۛᩳܺ;->getName()Ll/۬ܺܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v29

    invoke-interface {v11}, Ll/ۛᩳܺ;->᩻()Ll/۬ܺܺ;

    move-result-object v14

    invoke-virtual {v14}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v30

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v32}, Ll/ۜ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩶ۚ;

    move-result-object v14

    const-string v15, "java/lang/RuntimeException"

    move/from16 v27, v13

    const/16 v13, 0xbb

    .line 325
    invoke-virtual {v14, v13, v15}, Ll/ܶ᩶ۚ;->ܽ(ILjava/lang/String;)V

    const/16 v13, 0x59

    .line 326
    invoke-virtual {v14, v13}, Ll/ܶ᩶ۚ;->֫(I)V

    const-string v13, "Couldn\'t be decompiled."

    .line 327
    invoke-virtual {v14, v13}, Ll/ܶ᩶ۚ;->֫(Ljava/lang/Object;)V

    const-string v35, "java/lang/RuntimeException"

    const-string v36, "<init>"

    const-string v37, "(Ljava/lang/String;)V"

    const/16 v38, 0x0

    const/16 v34, 0xb7

    move-object/from16 v33, v14

    .line 328
    invoke-virtual/range {v33 .. v38}, Ll/ܶ᩶ۚ;->֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v13, 0xbf

    .line 329
    invoke-virtual {v14, v13}, Ll/ܶ᩶ۚ;->֫(I)V

    const/4 v13, 0x2

    .line 330
    invoke-virtual {v14, v13, v13}, Ll/ܶ᩶ۚ;->ܽ(II)V

    .line 333
    new-instance v13, Ll/᩹ᩳܺ;

    invoke-virtual {v0}, Ll/ۜ᩶ۚ;->ۧ()[B

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->᩻()Ljava/lang/String;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v13, v14, v15, v0}, Ll/᩹ᩳܺ;-><init>(Ljava/lang/String;Z[B)V

    .line 334
    invoke-virtual {v13}, Ll/᩹ᩳܺ;->ۘ()V

    .line 335
    invoke-virtual {v13}, Ll/᩹ᩳܺ;->᩷()V

    .line 336
    invoke-virtual {v13}, Ll/᩹ᩳܺ;->ۢ()Ll/ᩳܿܺ;

    move-result-object v0

    invoke-virtual {v0, v15}, Ll/ܿᩴܺ;->get(I)Ll/ۨᩳܺ;

    move-result-object v0

    .line 337
    new-instance v14, Ll/ۗܽܺ;

    iget-boolean v15, v2, Ll/ܺܿܺ;->֫:Z

    invoke-direct {v14, v0, v13, v15}, Ll/ۗܽܺ;-><init>(Ll/ۨᩳܺ;Ll/᩹ᩳܺ;Z)V

    .line 340
    invoke-static {v14, v10, v3}, Ll/ۡᩳܺ;->֫(Ll/ۗܽܺ;Ll/ᩳܿܺ;Ll/ۢܿܺ;)Ll/۬ۡܺ;

    move-result-object v0

    .line 139
    :goto_c
    invoke-virtual {v8, v7}, Ll/ܽܺܺ;->֫(Z)Ll/᩺ܺܺ;

    move-result-object v13

    invoke-virtual {v13}, Ll/᩺ܺܺ;->ۘ()Ll/ܰܺܺ;

    move-result-object v13

    invoke-virtual {v13}, Ll/ܰܺܺ;->֨()I

    move-result v13

    .line 348
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    invoke-virtual {v9}, Ll/۫ܺܺ;->ܺ()Ll/۟ܺܺ;

    move-result-object v15

    invoke-virtual {v15}, Ll/۟ܺܺ;->֡()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "."

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 350
    invoke-interface {v11}, Ll/ۛᩳܺ;->getName()Ll/۬ܺܺ;

    move-result-object v15

    invoke-virtual {v15}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 352
    iget-boolean v14, v2, Ll/ܺܿܺ;->ۧ:Z

    if-eqz v14, :cond_d

    iget-object v14, v1, Ll/᩻ܿܺ;->֫:Ll/ۘܿܺ;

    .line 353
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 359
    iget-boolean v14, v2, Ll/ܺܿܺ;->֫:Z

    invoke-static {v0, v13, v14}, Ll/ۛۖܺ;->֫(Ll/۬ۡܺ;IZ)Ll/۬ۡܺ;

    move-result-object v0

    .line 375
    :cond_d
    iget-boolean v14, v2, Ll/ܺܿܺ;->֫:Z

    if-eqz v14, :cond_e

    .line 376
    invoke-static {v0}, Ll/᩵ۡܺ;->֫(Ll/۬ۡܺ;)Ll/֡ۡܺ;

    move-result-object v24

    :cond_e
    move-object/from16 v14, v24

    .line 379
    invoke-static {v0, v14, v13, v3}, Ll/ۘܳܺ;->֫(Ll/۬ۡܺ;Ll/֡ۡܺ;ILl/ۢܿܺ;)Ll/᩶ܿܺ;

    move-result-object v24

    goto :goto_e

    .line 319
    :cond_f
    throw v0

    :cond_10
    :goto_d
    move/from16 v27, v13

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    :goto_e
    move-object/from16 v0, v24

    and-int/lit8 v13, v6, 0x20

    if-eqz v13, :cond_11

    const/high16 v13, 0x20000

    or-int/2addr v6, v13

    if-nez v22, :cond_11

    and-int/lit8 v6, v6, -0x21

    :cond_11
    if-eqz v23, :cond_12

    const/high16 v13, 0x10000

    or-int/2addr v6, v13

    .line 70
    :cond_12
    invoke-interface {v11}, Ll/ۛᩳܺ;->getAttributes()Ll/ܰᩳܺ;

    move-result-object v13

    .line 72
    invoke-virtual {v13, v5}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v13

    check-cast v13, Ll/۬ۧܺ;

    if-nez v13, :cond_13

    .line 75
    sget-object v13, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    goto :goto_f

    .line 78
    :cond_13
    invoke-virtual {v13}, Ll/۬ۧܺ;->ۧ()Ll/ۧۖܺ;

    move-result-object v13

    .line 406
    :goto_f
    new-instance v14, Ll/ܿۜܺ;

    invoke-direct {v14, v8, v6, v0, v13}, Ll/ܿۜܺ;-><init>(Ll/᩹ܺܺ;ILl/᩶ܿܺ;Ll/ۧۖܺ;)V

    .line 151
    invoke-virtual {v8}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܺܺ;->ۚ()Z

    move-result v0

    if-nez v0, :cond_15

    .line 163
    invoke-virtual {v8}, Ll/ܶܺܺ;->ܺ()Ll/᩶ܺܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/᩶ܺܺ;->֡()Z

    move-result v0

    if-nez v0, :cond_15

    if-nez v7, :cond_15

    if-eqz v21, :cond_14

    goto :goto_10

    .line 413
    :cond_14
    invoke-virtual {v12, v14}, Ll/ۗ᩻ܺ;->ۧ(Ll/ܿۜܺ;)V

    goto :goto_11

    .line 411
    :cond_15
    :goto_10
    invoke-virtual {v12, v14}, Ll/ۗ᩻ܺ;->֫(Ll/ܿۜܺ;)V

    .line 161
    :goto_11
    invoke-interface {v11}, Ll/ۛᩳܺ;->getAttributes()Ll/ܰᩳܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ۡܿܺ;->֫(Ll/ܰᩳܺ;)Ll/᩺ۢܺ;

    move-result-object v0

    .line 70
    invoke-interface {v11}, Ll/ۛᩳܺ;->getAttributes()Ll/ܰᩳܺ;

    move-result-object v6

    .line 72
    invoke-virtual {v6, v5}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v6

    check-cast v6, Ll/۬ۧܺ;

    if-nez v6, :cond_16

    .line 75
    sget-object v6, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    goto :goto_12

    .line 78
    :cond_16
    invoke-virtual {v6}, Ll/۬ۧܺ;->ۧ()Ll/ۧۖܺ;

    move-result-object v6

    .line 164
    :goto_12
    invoke-interface {v6}, Ll/ۧۖܺ;->size()I

    move-result v7

    if-eqz v7, :cond_17

    .line 166
    invoke-static {v6}, Ll/֨᩻ܺ;->ۧ(Ll/ۧۖܺ;)Ll/ۛۢܺ;

    move-result-object v6

    .line 167
    invoke-static {v0, v6}, Ll/᩺ۢܺ;->֫(Ll/᩺ۢܺ;Ll/ۛۢܺ;)Ll/᩺ۢܺ;

    move-result-object v0

    .line 418
    :cond_17
    invoke-virtual {v0}, Ll/᩺ۢܺ;->size()I

    move-result v6

    if-eqz v6, :cond_18

    .line 419
    invoke-virtual {v12, v8, v0, v4}, Ll/ۗ᩻ܺ;->֫(Ll/᩹ܺܺ;Ll/᩺ۢܺ;Ll/֫ۜܺ;)V

    .line 377
    :cond_18
    invoke-interface {v11}, Ll/ۛᩳܺ;->getAttributes()Ll/ܰᩳܺ;

    move-result-object v0

    const-string v6, "RuntimeVisibleParameterAnnotations"

    .line 380
    invoke-virtual {v0, v6}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v6

    check-cast v6, Ll/֫ܽܺ;

    const-string v7, "RuntimeInvisibleParameterAnnotations"

    .line 384
    invoke-virtual {v0, v7}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v0

    check-cast v0, Ll/ܰۧܺ;

    if-nez v6, :cond_1a

    if-nez v0, :cond_19

    .line 389
    sget-object v0, Ll/ܰۢܺ;->᩶:Ll/ܰۢܺ;

    goto :goto_13

    .line 391
    :cond_19
    invoke-virtual {v0}, Ll/᩷ܽܺ;->ۧ()Ll/ܰۢܺ;

    move-result-object v0

    goto :goto_13

    :cond_1a
    if-nez v0, :cond_1b

    .line 395
    invoke-virtual {v6}, Ll/᩷ܽܺ;->ۧ()Ll/ܰۢܺ;

    move-result-object v0

    goto :goto_13

    .line 400
    :cond_1b
    invoke-virtual {v6}, Ll/᩷ܽܺ;->ۧ()Ll/ܰۢܺ;

    move-result-object v6

    .line 401
    invoke-virtual {v0}, Ll/᩷ܽܺ;->ۧ()Ll/ܰۢܺ;

    move-result-object v0

    .line 400
    invoke-static {v6, v0}, Ll/ܰۢܺ;->֫(Ll/ܰۢܺ;Ll/ܰۢܺ;)Ll/ܰۢܺ;

    move-result-object v0

    .line 424
    :goto_13
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v6

    if-eqz v6, :cond_1c

    .line 425
    invoke-virtual {v12, v8, v0, v4}, Ll/ۗ᩻ܺ;->֫(Ll/᩹ܺܺ;Ll/ܰۢܺ;Ll/֫ۜܺ;)V

    .line 427
    :cond_1c
    invoke-virtual/range {p4 .. p4}, Ll/֫ۜܺ;->ܺ()Ll/᩸ۜܺ;

    move-result-object v0

    invoke-virtual {v0, v8}, Ll/᩸ۜܺ;->ۧ(Ll/ܽܺܺ;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_4

    add-int/lit8 v13, v27, 0x1

    move/from16 v11, v16

    move-object/from16 v8, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v14, v25

    move-object/from16 v15, v26

    goto/16 :goto_3

    :catch_4
    move-exception v0

    goto :goto_14

    :catch_5
    move-exception v0

    move-object/from16 v25, v14

    move-object/from16 v26, v15

    .line 429
    :goto_14
    new-instance v1, Ljava/lang/StringBuilder;

    move-object/from16 v2, v26

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v11}, Ll/ۛᩳܺ;->getName()Ll/۬ܺܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v25

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    invoke-interface {v11}, Ll/ۛᩳܺ;->᩻()Ll/۬ܺܺ;

    move-result-object v2

    invoke-virtual {v2}, Ll/۬ܺܺ;->֫()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 431
    invoke-static {v1, v0}, Ll/۠ۧܺ;->֫(Ljava/lang/String;Ljava/lang/Exception;)Ll/۠ۧܺ;

    move-result-object v0

    throw v0

    :cond_1d
    move-object/from16 v18, v6

    move-object/from16 v19, v7

    move-object/from16 v17, v8

    .line 161
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܿ()Ll/ۤܺܺ;

    move-result-object v0

    .line 162
    invoke-virtual {v0}, Ll/ۤܺܺ;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_15
    if-ge v2, v1, :cond_27

    .line 165
    invoke-virtual {v0, v2}, Ll/ۤܺܺ;->֫(I)Ll/ܰۡܺ;

    move-result-object v3

    .line 166
    instance-of v4, v3, Ll/᩹ܺܺ;

    if-eqz v4, :cond_1e

    .line 167
    check-cast v3, Ll/ܽܺܺ;

    move-object/from16 v4, v19

    invoke-virtual {v4, v3}, Ll/᩸ۜܺ;->ۧ(Ll/ܽܺܺ;)V

    goto :goto_16

    :cond_1e
    move-object/from16 v4, v19

    .line 168
    instance-of v5, v3, Ll/ۘܺܺ;

    if-eqz v5, :cond_1f

    .line 169
    check-cast v3, Ll/ۘܺܺ;

    invoke-virtual {v3}, Ll/ۘܺܺ;->ۚ()Ll/᩹ܺܺ;

    move-result-object v3

    invoke-virtual {v4, v3}, Ll/᩸ۜܺ;->ۧ(Ll/ܽܺܺ;)V

    :goto_16
    move-object/from16 v6, v17

    move-object/from16 v5, v18

    goto/16 :goto_1a

    .line 170
    :cond_1f
    instance-of v5, v3, Ll/ۡܺܺ;

    if-eqz v5, :cond_20

    .line 171
    check-cast v3, Ll/ۡܺܺ;

    move-object/from16 v5, v18

    invoke-virtual {v5, v3}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    goto :goto_17

    :cond_20
    move-object/from16 v5, v18

    .line 172
    instance-of v6, v3, Ll/ۢܺܺ;

    if-eqz v6, :cond_21

    .line 173
    check-cast v3, Ll/ۢܺܺ;

    invoke-virtual {v3}, Ll/ۢܺܺ;->ᩴ()Ll/ۡܺܺ;

    move-result-object v3

    invoke-virtual {v5, v3}, Ll/ۜۜܺ;->ۧ(Ll/ۡܺܺ;)Ll/᩻ۜܺ;

    :goto_17
    move-object/from16 v6, v17

    goto/16 :goto_1a

    .line 174
    :cond_21
    instance-of v6, v3, Ll/᩸ܺܺ;

    if-eqz v6, :cond_22

    .line 175
    check-cast v3, Ll/᩸ܺܺ;

    move-object/from16 v6, v17

    invoke-virtual {v6, v3}, Ll/۠ۜܺ;->ۧ(Ll/᩸ܺܺ;)V

    goto/16 :goto_1a

    :cond_22
    move-object/from16 v6, v17

    .line 176
    instance-of v7, v3, Ll/ᩴܺܺ;

    if-eqz v7, :cond_24

    .line 177
    check-cast v3, Ll/ᩴܺܺ;

    .line 178
    invoke-virtual {v3}, Ll/ᩴܺܺ;->ᩴ()I

    move-result v7

    .line 179
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ܽ()Ll/᩵ܽܺ;

    move-result-object v8

    invoke-virtual {v8, v7}, Ll/ܿᩴܺ;->get(I)Ll/ᩴܽܺ;

    move-result-object v7

    .line 181
    invoke-virtual {v7}, Ll/ᩴܽܺ;->ۧ()Ll/᩸ܺܺ;

    move-result-object v8

    .line 182
    invoke-virtual {v3}, Ll/ᩴܺܺ;->ۚ()Ll/᩶ܺܺ;

    move-result-object v9

    .line 183
    invoke-virtual {v7}, Ll/ᩴܽܺ;->֫()Ll/ۘܽܺ;

    move-result-object v7

    if-eqz v8, :cond_26

    if-eqz v9, :cond_25

    .line 43
    new-instance v10, Ll/֫ܺܺ;

    invoke-virtual {v7}, Ll/ܿᩴܺ;->size()I

    move-result v11

    add-int/lit8 v11, v11, 0x3

    .line 126
    invoke-direct {v10, v11}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v11, 0x0

    .line 44
    invoke-virtual {v10, v11, v8}, Ll/ܿᩴܺ;->֫(ILl/ܰۡܺ;)V

    .line 45
    invoke-virtual {v9}, Ll/᩶ܺܺ;->getName()Ll/۬ܺܺ;

    move-result-object v8

    const/4 v11, 0x1

    invoke-virtual {v10, v11, v8}, Ll/ܿᩴܺ;->֫(ILl/ܰۡܺ;)V

    .line 46
    new-instance v8, Ll/ۙܺܺ;

    invoke-virtual {v9}, Ll/᩶ܺܺ;->ܺ()Ll/۬ܺܺ;

    move-result-object v9

    invoke-virtual {v9}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ll/᩺ܺܺ;->֫(Ljava/lang/String;)Ll/᩺ܺܺ;

    move-result-object v9

    invoke-direct {v8, v9}, Ll/ۙܺܺ;-><init>(Ll/᩺ܺܺ;)V

    const/4 v9, 0x2

    invoke-virtual {v10, v9, v8}, Ll/ܿᩴܺ;->֫(ILl/ܰۡܺ;)V

    const/4 v8, 0x0

    .line 48
    :goto_18
    invoke-virtual {v7}, Ll/ܿᩴܺ;->size()I

    move-result v9

    if-ge v8, v9, :cond_23

    add-int/lit8 v9, v8, 0x3

    .line 49
    invoke-virtual {v7, v8}, Ll/ܿᩴܺ;->get(I)Ll/ܰۡܺ;

    move-result-object v11

    invoke-virtual {v10, v9, v11}, Ll/ܿᩴܺ;->֫(ILl/ܰۡܺ;)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_18

    .line 52
    :cond_23
    invoke-virtual {v10}, Ll/ᩴᩴܺ;->ܺ()V

    .line 53
    new-instance v7, Ll/ܳܺܺ;

    .line 62
    invoke-direct {v7, v10}, Ll/ۧܺܺ;-><init>(Ll/֫ܺܺ;)V

    .line 184
    invoke-virtual/range {p1 .. p1}, Ll/᩹ᩳܺ;->ۖ()Ll/۫ܺܺ;

    move-result-object v8

    invoke-virtual {v3, v8}, Ll/ᩴܺܺ;->֫(Ll/۫ܺܺ;)V

    .line 185
    invoke-virtual {v3, v7}, Ll/ᩴܺܺ;->֫(Ll/ܳܺܺ;)V

    .line 186
    invoke-virtual {v3}, Ll/ᩴܺܺ;->۠()Ljava/util/ArrayList;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_19
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_24

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩻ܺܺ;

    move-object/from16 v8, v20

    .line 187
    invoke-virtual {v8, v7}, Ll/᩸᩻ܺ;->֫(Ll/᩻ܺܺ;)V

    goto :goto_19

    :cond_24
    :goto_1a
    move-object/from16 v8, v20

    goto :goto_1b

    .line 40
    :cond_25
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "nat == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 38
    :cond_26
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "bootstrapMethodHandle == null"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_1b
    add-int/lit8 v2, v2, 0x1

    move-object/from16 v19, v4

    move-object/from16 v18, v5

    move-object/from16 v17, v6

    move-object/from16 v20, v8

    goto/16 :goto_15

    :cond_27
    return-object v12
.end method
