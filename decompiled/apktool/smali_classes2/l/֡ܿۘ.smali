.class public final Ll/֡ܿۘ;
.super Ljava/lang/Object;
.source "D1LP"


# direct methods
.method public static ֫(IILjava/lang/CharSequence;Ll/֨ܳۘ;)Ljava/util/ArrayList;
    .locals 4

    .line 544
    new-instance v0, Ljava/util/ArrayList;

    sub-int v1, p1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    :goto_0
    if-ge p0, p1, :cond_0

    .line 546
    new-instance v1, Ll/ܿ᩻ۘ;

    invoke-interface {p3, p0}, Ll/֨ܳۘ;->ۧ(I)I

    move-result v2

    invoke-interface {p3, p0}, Ll/֨ܳۘ;->֫(I)I

    move-result v3

    invoke-direct {v1, v2, v3, p2}, Ll/ܿ᩻ۘ;-><init>(IILjava/lang/CharSequence;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/֨ܳۘ;Ll/֨ܳۘ;Ll/ۚܿۘ;Ll/᩸ܿۘ;Ll/ۙܳۘ;)Ljava/util/ArrayList;
    .locals 25

    move-object/from16 v0, p2

    move-object/from16 v1, p3

    .line 71
    invoke-interface/range {p2 .. p2}, Ll/֨ܳۘ;->֫()I

    move-result v2

    .line 72
    invoke-interface/range {p3 .. p3}, Ll/֨ܳۘ;->֫()I

    move-result v3

    const/4 v4, 0x0

    move-object/from16 v12, p0

    .line 84
    invoke-static {v4, v2, v12, v0}, Ll/֡ܿۘ;->֫(IILjava/lang/CharSequence;Ll/֨ܳۘ;)Ljava/util/ArrayList;

    move-result-object v2

    move-object/from16 v13, p1

    .line 85
    invoke-static {v4, v3, v13, v1}, Ll/֡ܿۘ;->֫(IILjava/lang/CharSequence;Ll/֨ܳۘ;)Ljava/util/ArrayList;

    move-result-object v3

    move-object/from16 v4, p4

    move-object/from16 v14, p6

    .line 87
    invoke-static {v2, v3, v4, v14}, Ll/ܰᩳۘ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ll/ۚܿۘ;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v2

    .line 263
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 264
    invoke-interface {v2}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object v2

    iget-object v2, v2, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {v2}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩹ܳۘ;

    .line 265
    iget v6, v5, Ll/᩹ܳۘ;->ܽ:I

    .line 266
    iget v7, v5, Ll/᩹ܳۘ;->ᩳ:I

    .line 267
    iget v8, v5, Ll/᩹ܳۘ;->֫:I

    .line 268
    iget v5, v5, Ll/᩹ܳۘ;->ۧ:I

    .line 270
    invoke-static {v0, v6, v8}, Ll/֡ܿۘ;->֫(Ll/֨ܳۘ;II)Ll/᩸ܳۘ;

    move-result-object v9

    .line 271
    invoke-static {v1, v7, v5}, Ll/֡ܿۘ;->֫(Ll/֨ܳۘ;II)Ll/᩸ܳۘ;

    move-result-object v10

    .line 273
    new-instance v11, Ll/ۚܳۘ;

    iget v15, v9, Ll/᩸ܳۘ;->֫:I

    iget v9, v9, Ll/᩸ܳۘ;->ۧ:I

    iget v0, v10, Ll/᩸ܳۘ;->֫:I

    iget v10, v10, Ll/᩸ܳۘ;->ۧ:I

    const/16 v24, 0x0

    move/from16 v20, v15

    move-object v15, v11

    move/from16 v16, v6

    move/from16 v17, v8

    move/from16 v18, v7

    move/from16 v19, v5

    move/from16 v21, v9

    move/from16 v22, v0

    move/from16 v23, v10

    .line 45
    invoke-direct/range {v15 .. v24}, Ll/ۚܳۘ;-><init>(IIIIIIIILjava/util/List;)V

    .line 273
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p2

    goto :goto_0

    .line 112
    :cond_0
    sget-object v0, Ll/᩸ܿۘ;->᩶:Ll/᩸ܿۘ;

    move-object/from16 v1, p5

    if-eq v1, v0, :cond_3

    .line 285
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 288
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v15, v5

    check-cast v15, Ll/֡ܳۘ;

    const/4 v5, 0x3

    if-ge v3, v5, :cond_1

    const/4 v5, 0x1

    const/4 v11, 0x1

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    const/4 v11, 0x0

    :goto_2
    move-object v5, v15

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    .line 294
    :try_start_0
    invoke-static/range {v5 .. v11}, Ll/֡ܿۘ;->֫(Ll/֡ܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;Ll/᩸ܿۘ;Ll/ۙܳۘ;Z)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catch Ll/ܶܿۘ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 296
    :catch_0
    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    return-object v3
.end method

.method public static ֫(Ll/֫ܳۘ;)Ljava/util/ArrayList;
    .locals 6

    .line 403
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 404
    invoke-interface {p0}, Ll/֫ܳۘ;->֫()Ll/ܰܿۘ;

    move-result-object p0

    iget-object p0, p0, Ll/ܰܿۘ;->᩸:Ll/֫ܳۘ;

    invoke-interface {p0}, Ll/֫ܳۘ;->ܳ()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩹ܳۘ;

    .line 405
    new-instance v2, Ll/᩵ܳۘ;

    iget v3, v1, Ll/᩹ܳۘ;->ܽ:I

    iget v4, v1, Ll/᩹ܳۘ;->֫:I

    iget v5, v1, Ll/᩹ܳۘ;->ᩳ:I

    iget v1, v1, Ll/᩹ܳۘ;->ۧ:I

    invoke-direct {v2, v3, v4, v5, v1}, Ll/᩵ܳۘ;-><init>(IIII)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/֡ܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;Ll/᩸ܿۘ;Ll/ۙܳۘ;Z)Ljava/util/List;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v11, p5

    .line 312
    sget-object v3, Ll/᩸ܿۘ;->᩶:Ll/᩸ܿۘ;

    if-ne v2, v3, :cond_0

    .line 313
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 316
    :cond_0
    invoke-interface/range {p0 .. p0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v3

    invoke-interface/range {p0 .. p0}, Ll/ᩴܳۘ;->֫()I

    move-result v4

    move-object/from16 v5, p1

    invoke-interface {v5, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v12

    .line 317
    invoke-interface/range {p0 .. p0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v3

    invoke-interface/range {p0 .. p0}, Ll/ᩴܳۘ;->᩻()I

    move-result v4

    move-object/from16 v5, p2

    invoke-interface {v5, v3, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v13

    .line 319
    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->ۧ()I

    move-result v3

    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->ۜ()I

    move-result v4

    if-eq v3, v4, :cond_12

    .line 320
    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->ܽ()I

    move-result v3

    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->᩷()I

    move-result v4

    if-ne v3, v4, :cond_1

    goto/16 :goto_8

    :cond_1
    if-nez p6, :cond_2

    .line 328
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 330
    :cond_2
    sget-object v3, Ll/᩸ܿۘ;->ۙ:Ll/᩸ܿۘ;

    if-ne v2, v3, :cond_e

    .line 71
    invoke-virtual/range {p5 .. p5}, Ll/ۙܳۘ;->ۧ()V

    .line 90
    invoke-static {v12}, Ll/᩷ܿۘ;->֫(Ljava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v14

    .line 91
    invoke-static {v13}, Ll/᩷ܿۘ;->֫(Ljava/lang/CharSequence;)Ljava/util/ArrayList;

    move-result-object v15

    .line 93
    invoke-static {v14, v15, v11}, Ll/᩻ܳۘ;->֫(Ljava/util/List;Ljava/util/List;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v6

    .line 136
    new-instance v2, Ll/ۘܿۘ;

    move-object v5, v2

    move-object v7, v12

    move-object v8, v13

    move-object v9, v14

    move-object v10, v15

    invoke-direct/range {v5 .. v10}, Ll/ۘܿۘ;-><init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Ll/ᩴܿۘ;->֫()Ll/ۜܳۘ;

    move-result-object v4

    .line 96
    new-instance v2, Ll/ۙܿۘ;

    move-object v5, v2

    move-object v6, v4

    invoke-direct/range {v5 .. v10}, Ll/ۙܿۘ;-><init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v2}, Ll/ۙܿۘ;->֫()Ljava/util/ArrayList;

    move-result-object v2

    .line 98
    new-instance v10, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-direct {v10, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/᩶ܿۘ;

    .line 100
    iget-object v9, v2, Ll/᩶ܿۘ;->֫:Ll/᩹ܳۘ;

    .line 101
    iget-object v2, v2, Ll/᩶ܿۘ;->ۧ:Ll/᩹ܳۘ;

    iget v3, v2, Ll/᩹ܳۘ;->ܽ:I

    .line 103
    iget v5, v9, Ll/᩹ܳۘ;->ܽ:I

    iget v6, v9, Ll/᩹ܳۘ;->֫:I

    invoke-interface {v12, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v8

    .line 104
    iget v5, v9, Ll/᩹ܳۘ;->ᩳ:I

    iget v6, v9, Ll/᩹ܳۘ;->ۧ:I

    invoke-interface {v13, v5, v6}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    .line 106
    iget v5, v2, Ll/᩹ܳۘ;->ۧ:I

    iget v6, v2, Ll/᩹ܳۘ;->ᩳ:I

    iget v2, v2, Ll/᩹ܳۘ;->֫:I

    invoke-virtual {v14, v3, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v17

    .line 107
    invoke-virtual {v15, v6, v5}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v18

    .line 109
    invoke-static {v4, v3, v2, v6, v5}, Ll/᩻ܳۘ;->֫(Ll/ۜܳۘ;IIII)Ll/֫ܳۘ;

    move-result-object v2

    invoke-static {v2}, Ll/᩻ܳۘ;->֫(Ll/֫ܳۘ;)Ll/ۜܳۘ;

    move-result-object v19

    .line 111
    iget v6, v9, Ll/᩹ܳۘ;->ܽ:I

    iget v5, v9, Ll/᩹ܳۘ;->ᩳ:I

    .line 158
    new-instance v20, Ll/֫ܿۘ;

    const/4 v3, 0x1

    move-object/from16 v2, v20

    move-object/from16 p1, v14

    const/4 v14, 0x1

    move-object v3, v8

    move-object/from16 v21, v4

    move-object v4, v7

    move/from16 v22, v5

    move-object/from16 v5, v17

    move/from16 v23, v6

    move-object/from16 v6, v18

    move-object/from16 v24, v7

    move/from16 v7, v23

    move-object/from16 v25, v8

    move/from16 v8, v22

    move-object/from16 v26, v9

    move-object/from16 v9, v19

    move-object/from16 v27, v10

    move-object/from16 v10, p5

    invoke-direct/range {v2 .. v10}, Ll/֫ܿۘ;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/util/List;Ljava/util/List;IILl/ۜܳۘ;Ll/ۙܳۘ;)V

    invoke-virtual/range {v20 .. v20}, Ll/֫ܿۘ;->֫()Ll/ۜܳۘ;

    move-result-object v2

    .line 166
    sget-object v3, Ll/۟ᩳۘ;->֫:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    if-eq v3, v14, :cond_5

    const/4 v4, 0x2

    if-eq v3, v4, :cond_4

    const/4 v4, 0x3

    if-ne v3, v4, :cond_3

    .line 173
    new-instance v3, Ll/ܽܿۘ;

    move-object/from16 v5, v24

    move-object/from16 v4, v25

    invoke-direct {v3, v2, v4, v5}, Ll/ܽܿۘ;-><init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Ll/ܽܿۘ;->֫()Ll/֫ܳۘ;

    move-result-object v2

    goto :goto_1

    .line 175
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object/from16 v5, v24

    move-object/from16 v4, v25

    .line 170
    new-instance v3, Ll/ۧܿۘ;

    invoke-direct {v3, v2, v4, v5}, Ll/ۧܿۘ;-><init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Ll/ۧܿۘ;->֫()Ll/֫ܳۘ;

    move-result-object v2

    .line 171
    new-instance v3, Ll/᩻ܿۘ;

    invoke-direct {v3, v2, v4, v5}, Ll/᩻ܿۘ;-><init>(Ll/֫ܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Ll/᩻ܿۘ;->֫()Ll/֫ܳۘ;

    move-result-object v2

    goto :goto_1

    :cond_5
    move-object/from16 v5, v24

    move-object/from16 v4, v25

    .line 168
    new-instance v3, Ll/ۧܿۘ;

    invoke-direct {v3, v2, v4, v5}, Ll/ۧܿۘ;-><init>(Ll/ۜܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Ll/ۧܿۘ;->֫()Ll/֫ܳۘ;

    move-result-object v2

    .line 115
    :goto_1
    invoke-static {v2}, Ll/֡ܿۘ;->֫(Ll/֫ܳۘ;)Ljava/util/ArrayList;

    move-result-object v2

    .line 260
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :cond_6
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ᩳܿۘ;

    .line 261
    instance-of v5, v5, Ll/ܳܿۘ;

    if-eqz v5, :cond_6

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 260
    :cond_7
    invoke-interface/range {v18 .. v18}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v5, 0x0

    :cond_8
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳܿۘ;

    .line 261
    instance-of v6, v6, Ll/ܳܿۘ;

    if-eqz v6, :cond_8

    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 120
    :cond_9
    new-instance v3, Ll/ܿܿۘ;

    move-object/from16 v6, v26

    invoke-direct {v3, v2, v6, v4, v5}, Ll/ܿܿۘ;-><init>(Ljava/util/ArrayList;Ll/᩹ܳۘ;II)V

    move-object/from16 v2, v27

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v14, p1

    move-object v10, v2

    move-object/from16 v4, v21

    goto/16 :goto_0

    :cond_a
    move-object v2, v10

    .line 348
    invoke-interface/range {p0 .. p0}, Ll/ᩴܳۘ;->ᩳ()I

    move-result v1

    .line 349
    invoke-interface/range {p0 .. p0}, Ll/ᩴܳۘ;->ܿ()I

    move-result v3

    .line 351
    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->ۧ()I

    move-result v4

    .line 352
    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->ܽ()I

    move-result v5

    .line 354
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    move v9, v4

    move v11, v5

    .line 355
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v7, v4, :cond_d

    .line 356
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿܿۘ;

    .line 357
    iget-object v5, v4, Ll/ܿܿۘ;->ᩳ:Ll/᩹ܳۘ;

    .line 360
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-eq v7, v8, :cond_b

    iget v8, v4, Ll/ܿܿۘ;->ۧ:I

    add-int/2addr v8, v9

    goto :goto_5

    :cond_b
    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->ۜ()I

    move-result v8

    :goto_5
    move/from16 v18, v8

    .line 361
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-eq v7, v8, :cond_c

    iget v8, v4, Ll/ܿܿۘ;->ܽ:I

    add-int/2addr v8, v11

    goto :goto_6

    :cond_c
    invoke-interface/range {p0 .. p0}, Ll/֡ܳۘ;->᩷()I

    move-result v8

    :goto_6
    move/from16 v19, v8

    .line 363
    new-instance v15, Ll/ۚܳۘ;

    iget v8, v5, Ll/᩹ܳۘ;->ܽ:I

    add-int v13, v8, v1

    iget v8, v5, Ll/᩹ܳۘ;->֫:I

    add-int v14, v8, v1

    iget v8, v5, Ll/᩹ܳۘ;->ᩳ:I

    add-int v16, v8, v3

    iget v5, v5, Ll/᩹ܳۘ;->ۧ:I

    add-int/2addr v5, v3

    iget-object v4, v4, Ll/ܿܿۘ;->֫:Ljava/util/ArrayList;

    move-object v8, v15

    move/from16 v10, v18

    move/from16 v12, v19

    move/from16 p1, v1

    move-object v1, v15

    move/from16 v15, v16

    move/from16 v16, v5

    move-object/from16 v17, v4

    invoke-direct/range {v8 .. v17}, Ll/ۚܳۘ;-><init>(IIIIIIIILjava/util/List;)V

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    move/from16 v1, p1

    move/from16 v9, v18

    move/from16 v11, v19

    goto :goto_4

    :cond_d
    return-object v6

    .line 332
    :cond_e
    sget-object v3, Ll/᩸ܿۘ;->᩹:Ll/᩸ܿۘ;

    if-ne v2, v3, :cond_11

    .line 390
    sget-object v2, Ll/ۚܿۘ;->᩹:Ll/ۚܿۘ;

    if-ne v1, v2, :cond_f

    .line 391
    invoke-static {v12, v13, v11}, Ll/۫ᩳۘ;->ᩳ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v1

    goto :goto_7

    .line 392
    :cond_f
    sget-object v2, Ll/ۚܿۘ;->ۙ:Ll/ۚܿۘ;

    if-ne v1, v2, :cond_10

    .line 91
    invoke-static {v12, v13, v11}, Ll/۫ᩳۘ;->ᩳ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/ۜܳۘ;

    move-result-object v1

    .line 92
    new-instance v2, Ll/᩻ܿۘ;

    invoke-direct {v2, v1, v12, v13}, Ll/᩻ܿۘ;-><init>(Ll/֫ܳۘ;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-virtual {v2}, Ll/᩻ܿۘ;->֫()Ll/֫ܳۘ;

    move-result-object v1

    goto :goto_7

    .line 395
    :cond_10
    invoke-static {v12, v13, v11}, Ll/۫ᩳۘ;->ۧ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۙܳۘ;)Ll/֫ܳۘ;

    move-result-object v1

    .line 398
    :goto_7
    invoke-static {v1}, Ll/֡ܿۘ;->֫(Ll/֫ܳۘ;)Ljava/util/ArrayList;

    move-result-object v1

    .line 381
    new-instance v2, Ll/ۚܳۘ;

    invoke-direct {v2, v0, v1}, Ll/ۚܳۘ;-><init>(Ll/֡ܳۘ;Ljava/util/List;)V

    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 335
    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 321
    :cond_12
    :goto_8
    invoke-static {v12, v13, v1}, Ll/۠ܿۘ;->֫(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ll/ۚܿۘ;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 322
    new-instance v1, Ll/ۚܳۘ;

    sget-object v2, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    invoke-direct {v1, v0, v2}, Ll/ۚܳۘ;-><init>(Ll/֡ܳۘ;Ljava/util/List;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 324
    :cond_13
    invoke-static/range {p0 .. p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/֨ܳۘ;II)Ll/᩸ܳۘ;
    .locals 0

    if-ne p1, p2, :cond_1

    .line 414
    invoke-interface {p0}, Ll/֨ܳۘ;->֫()I

    move-result p2

    if-ge p1, p2, :cond_0

    .line 415
    invoke-interface {p0, p1}, Ll/֨ܳۘ;->ۧ(I)I

    move-result p0

    goto :goto_0

    .line 417
    :cond_0
    invoke-interface {p0}, Ll/֨ܳۘ;->֫()I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-interface {p0, p1}, Ll/֨ܳۘ;->ܽ(I)I

    move-result p0

    .line 419
    :goto_0
    new-instance p1, Ll/᩸ܳۘ;

    invoke-direct {p1, p0, p0}, Ll/᩸ܳۘ;-><init>(II)V

    return-object p1

    .line 421
    :cond_1
    invoke-interface {p0, p1}, Ll/֨ܳۘ;->ۧ(I)I

    move-result p1

    add-int/lit8 p2, p2, -0x1

    .line 422
    invoke-interface {p0, p2}, Ll/֨ܳۘ;->ܽ(I)I

    move-result p0

    .line 423
    new-instance p2, Ll/᩸ܳۘ;

    invoke-direct {p2, p1, p0}, Ll/᩸ܳۘ;-><init>(II)V

    return-object p2
.end method
