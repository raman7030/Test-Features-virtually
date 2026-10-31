.class public final Ll/ۜܶ;
.super Ljava/lang/Object;
.source "X156"


# direct methods
.method public static ֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;
    .locals 7

    if-nez p1, :cond_0

    .line 369
    iget v0, p0, Ll/ܶ۠;->ܽ:I

    goto :goto_0

    .line 371
    :cond_0
    iget v0, p0, Ll/ܶ۠;->ۛ֫:I

    :goto_0
    const/4 v1, 0x0

    const/4 v2, -0x1

    if-eq v0, v2, :cond_4

    if-eqz p3, :cond_1

    .line 377
    iget v3, p3, Ll/֡ܶ;->֫:I

    if-eq v0, v3, :cond_4

    :cond_1
    const/4 v3, 0x0

    .line 382
    :goto_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    .line 383
    invoke-virtual {p2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֡ܶ;

    .line 49
    iget v5, v4, Ll/֡ܶ;->֫:I

    if-ne v5, v0, :cond_3

    if-eqz p3, :cond_2

    .line 389
    invoke-virtual {p3, p1, v4}, Ll/֡ܶ;->֫(ILl/֡ܶ;)V

    .line 390
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_2
    move-object p3, v4

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    if-eq v0, v2, :cond_5

    return-object p3

    :cond_5
    :goto_2
    const/4 v0, 0x1

    if-nez p3, :cond_c

    .line 400
    instance-of v3, p0, Ll/۬۠;

    if-eqz v3, :cond_a

    .line 401
    move-object v3, p0

    check-cast v3, Ll/۬۠;

    const/4 v4, 0x0

    .line 69
    :goto_3
    iget v5, v3, Ll/۬۠;->ܰ֫:I

    if-ge v4, v5, :cond_8

    .line 70
    iget-object v5, v3, Ll/۬۠;->᩺֫:[Ll/ܶ۠;

    aget-object v5, v5, v4

    if-nez p1, :cond_6

    .line 71
    iget v6, v5, Ll/ܶ۠;->ܽ:I

    if-eq v6, v2, :cond_6

    goto :goto_4

    :cond_6
    if-ne p1, v0, :cond_7

    .line 74
    iget v6, v5, Ll/ܶ۠;->ۛ֫:I

    if-eq v6, v2, :cond_7

    goto :goto_4

    :cond_7
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_8
    const/4 v6, -0x1

    :goto_4
    if-eq v6, v2, :cond_a

    const/4 v0, 0x0

    .line 404
    :goto_5
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v0, v2, :cond_a

    .line 405
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡ܶ;

    .line 49
    iget v3, v2, Ll/֡ܶ;->֫:I

    if-ne v3, v6, :cond_9

    move-object p3, v2

    goto :goto_6

    :cond_9
    add-int/lit8 v0, v0, 0x1

    goto :goto_5

    :cond_a
    :goto_6
    if-nez p3, :cond_b

    .line 414
    new-instance p3, Ll/֡ܶ;

    invoke-direct {p3, p1}, Ll/֡ܶ;-><init>(I)V

    .line 419
    :cond_b
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    :cond_c
    iget v0, p3, Ll/֡ܶ;->֫:I

    invoke-virtual {p3, p0}, Ll/֡ܶ;->֫(Ll/ܶ۠;)Z

    move-result v2

    if-eqz v2, :cond_10

    .line 422
    instance-of v2, p0, Ll/ۗ۠;

    if-eqz v2, :cond_e

    .line 423
    move-object v2, p0

    check-cast v2, Ll/ۗ۠;

    .line 424
    invoke-virtual {v2}, Ll/ۗ۠;->ܳ֫()Ll/ۚ۠;

    move-result-object v3

    invoke-virtual {v2}, Ll/ۗ۠;->᩻֫()I

    move-result v2

    if-nez v2, :cond_d

    const/4 v1, 0x1

    :cond_d
    invoke-virtual {v3, v1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    :cond_e
    if-nez p1, :cond_f

    .line 427
    iput v0, p0, Ll/ܶ۠;->ܽ:I

    .line 431
    iget-object v0, p0, Ll/ܶ۠;->۫:Ll/ۚ۠;

    invoke-virtual {v0, p1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    .line 432
    iget-object v0, p0, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    invoke-virtual {v0, p1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    goto :goto_7

    .line 434
    :cond_f
    iput v0, p0, Ll/ܶ۠;->ۛ֫:I

    .line 438
    iget-object v0, p0, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    invoke-virtual {v0, p1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    .line 439
    iget-object v0, p0, Ll/ܶ۠;->ۜ:Ll/ۚ۠;

    invoke-virtual {v0, p1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    .line 440
    iget-object v0, p0, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    invoke-virtual {v0, p1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    .line 442
    :goto_7
    iget-object p0, p0, Ll/ܶ۠;->ۡ:Ll/ۚ۠;

    invoke-virtual {p0, p1, p3, p2}, Ll/ۚ۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    :cond_10
    return-object p3
.end method

.method public static ֫(Ll/۠۠;Ll/۠۠;Ll/۠۠;Ll/۠۠;)Z
    .locals 5

    .line 48
    sget-object v0, Ll/۠۠;->᩹:Ll/۠۠;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p2, v0, :cond_1

    sget-object v3, Ll/۠۠;->ۗ:Ll/۠۠;

    if-eq p2, v3, :cond_1

    sget-object v4, Ll/۠۠;->ۙ:Ll/۠۠;

    if-ne p2, v4, :cond_0

    if-eq p0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    if-eq p3, v0, :cond_3

    .line 50
    sget-object p2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-eq p3, p2, :cond_3

    sget-object v0, Ll/۠۠;->ۙ:Ll/۠۠;

    if-ne p3, v0, :cond_2

    if-eq p1, p2, :cond_2

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    goto :goto_3

    :cond_3
    :goto_2
    const/4 p1, 0x1

    :goto_3
    if-nez p0, :cond_5

    if-eqz p1, :cond_4

    goto :goto_4

    :cond_4
    return v2

    :cond_5
    :goto_4
    return v1
.end method

.method public static ֫(Ll/᩸۠;Ll/ܰ۠;)Z
    .locals 16

    move-object/from16 v0, p0

    .line 108
    iget-object v1, v0, Ll/ۛ۠;->᩺֫:Ljava/util/ArrayList;

    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x1

    if-ge v4, v2, :cond_2

    .line 75
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ܶ۠;

    .line 1966
    iget-object v7, v0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v8, v7, v3

    .line 1975
    aget-object v7, v7, v5

    .line 1966
    iget-object v9, v6, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v10, v9, v3

    .line 1975
    aget-object v5, v9, v5

    .line 76
    invoke-static {v8, v7, v10, v5}, Ll/ۜܶ;->֫(Ll/۠۠;Ll/۠۠;Ll/۠۠;Ll/۠۠;)Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_19

    .line 83
    :cond_0
    instance-of v5, v6, Ll/᩶۠;

    if-eqz v5, :cond_1

    goto/16 :goto_19

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_1
    if-ge v4, v2, :cond_13

    .line 91
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/ܶ۠;

    .line 1966
    iget-object v13, v0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v3, v13, v3

    .line 1975
    aget-object v13, v13, v5

    const/4 v14, 0x0

    .line 1966
    iget-object v15, v12, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v14, v15, v14

    .line 1975
    aget-object v15, v15, v5

    .line 92
    invoke-static {v3, v13, v14, v15}, Ll/ۜܶ;->֫(Ll/۠۠;Ll/۠۠;Ll/۠۠;Ll/۠۠;)Z

    move-result v3

    if-nez v3, :cond_3

    .line 94
    iget-object v3, v0, Ll/᩸۠;->᩻ۧ:Ll/᩺۠;

    move-object/from16 v13, p1

    invoke-static {v12, v13, v3}, Ll/᩸۠;->֫(Ll/ܶ۠;Ll/ܰ۠;Ll/᩺۠;)V

    goto :goto_2

    :cond_3
    move-object/from16 v13, p1

    .line 96
    :goto_2
    instance-of v3, v12, Ll/ۗ۠;

    if-eqz v3, :cond_7

    .line 97
    move-object v14, v12

    check-cast v14, Ll/ۗ۠;

    .line 98
    invoke-virtual {v14}, Ll/ۗ۠;->᩻֫()I

    move-result v15

    if-nez v15, :cond_5

    if-nez v8, :cond_4

    .line 100
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 102
    :cond_4
    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    :cond_5
    invoke-virtual {v14}, Ll/ۗ۠;->᩻֫()I

    move-result v15

    if-ne v15, v5, :cond_7

    if-nez v6, :cond_6

    .line 106
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 108
    :cond_6
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_7
    instance-of v14, v12, Ll/۬۠;

    if-eqz v14, :cond_e

    .line 112
    instance-of v14, v12, Ll/ۖ۠;

    if-eqz v14, :cond_b

    .line 113
    move-object v14, v12

    check-cast v14, Ll/ۖ۠;

    .line 114
    invoke-virtual {v14}, Ll/ۖ۠;->ܺ֫()I

    move-result v15

    if-nez v15, :cond_9

    if-nez v7, :cond_8

    .line 116
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 118
    :cond_8
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    :cond_9
    invoke-virtual {v14}, Ll/ۖ۠;->ܺ֫()I

    move-result v15

    if-ne v15, v5, :cond_e

    if-nez v9, :cond_a

    .line 122
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 124
    :cond_a
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 127
    :cond_b
    move-object v14, v12

    check-cast v14, Ll/۬۠;

    if-nez v7, :cond_c

    .line 129
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 131
    :cond_c
    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez v9, :cond_d

    .line 133
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 135
    :cond_d
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 138
    :cond_e
    :goto_3
    iget-object v14, v12, Ll/ܶ۠;->۫:Ll/ۚ۠;

    iget-object v14, v14, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v14, :cond_10

    iget-object v14, v12, Ll/ܶ۠;->ᩴ֫:Ll/ۚ۠;

    iget-object v14, v14, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v14, :cond_10

    if-nez v3, :cond_10

    instance-of v14, v12, Ll/ۖ۠;

    if-nez v14, :cond_10

    if-nez v10, :cond_f

    .line 141
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 143
    :cond_f
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    :cond_10
    iget-object v14, v12, Ll/ܶ۠;->᩵֫:Ll/ۚ۠;

    iget-object v14, v14, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v14, :cond_12

    iget-object v14, v12, Ll/ܶ۠;->ۢ:Ll/ۚ۠;

    iget-object v14, v14, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v14, :cond_12

    iget-object v14, v12, Ll/ܶ۠;->ۜ:Ll/ۚ۠;

    iget-object v14, v14, Ll/ۚ۠;->ۜ:Ll/ۚ۠;

    if-nez v14, :cond_12

    if-nez v3, :cond_12

    instance-of v3, v12, Ll/ۖ۠;

    if-nez v3, :cond_12

    if-nez v11, :cond_11

    .line 149
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 151
    :cond_11
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_12
    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    goto/16 :goto_1

    .line 154
    :cond_13
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    if-eqz v6, :cond_14

    .line 160
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_14

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۗ۠;

    const/4 v12, 0x0

    const/4 v13, 0x0

    .line 161
    invoke-static {v6, v13, v3, v12}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_4

    :cond_14
    const/4 v4, 0x0

    const/4 v6, 0x0

    if-eqz v7, :cond_15

    .line 165
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_15

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۬۠;

    .line 166
    invoke-static {v12, v6, v3, v4}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    move-result-object v4

    .line 167
    invoke-virtual {v12, v6, v4, v3}, Ll/۬۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    .line 168
    invoke-virtual {v4, v3}, Ll/֡ܶ;->֫(Ljava/util/ArrayList;)V

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_5

    .line 172
    :cond_15
    sget-object v4, Ll/֡۠;->۫:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 173
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_16

    .line 174
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 175
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    const/4 v12, 0x0

    invoke-static {v6, v12, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_6

    .line 179
    :cond_16
    sget-object v4, Ll/֡۠;->ۛ:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 180
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_17

    .line 181
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 182
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    const/4 v12, 0x0

    invoke-static {v6, v12, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_7

    .line 186
    :cond_17
    sget-object v4, Ll/֡۠;->ۙ:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 187
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_18

    .line 188
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_18

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 189
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    const/4 v12, 0x0

    invoke-static {v6, v12, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_8

    :cond_18
    const/4 v4, 0x0

    const/4 v6, 0x0

    if-eqz v10, :cond_19

    .line 194
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_9
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶ۠;

    .line 195
    invoke-static {v10, v6, v3, v4}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_9

    :cond_19
    if-eqz v8, :cond_1a

    .line 204
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ۠;

    .line 205
    invoke-static {v7, v5, v3, v4}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_a

    :cond_1a
    if-eqz v9, :cond_1b

    .line 209
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_b
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬۠;

    .line 210
    invoke-static {v7, v5, v3, v4}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    move-result-object v4

    .line 211
    invoke-virtual {v7, v5, v4, v3}, Ll/۬۠;->֫(ILl/֡ܶ;Ljava/util/ArrayList;)V

    .line 212
    invoke-virtual {v4, v3}, Ll/֡ܶ;->֫(Ljava/util/ArrayList;)V

    const/4 v4, 0x0

    goto :goto_b

    .line 216
    :cond_1b
    sget-object v4, Ll/֡۠;->ۨ:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 217
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_1c

    .line 218
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1c

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 219
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    invoke-static {v6, v5, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_c

    .line 223
    :cond_1c
    sget-object v4, Ll/֡۠;->᩹:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 224
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_1d

    .line 225
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 226
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    invoke-static {v6, v5, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_d

    .line 230
    :cond_1d
    sget-object v4, Ll/֡۠;->᩶:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 231
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_1e

    .line 232
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 233
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    invoke-static {v6, v5, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_e

    .line 237
    :cond_1e
    sget-object v4, Ll/֡۠;->ۙ:Ll/֡۠;

    invoke-virtual {v0, v4}, Ll/ܶ۠;->֫(Ll/֡۠;)Ll/ۚ۠;

    move-result-object v4

    .line 238
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v6

    if-eqz v6, :cond_1f

    .line 239
    invoke-virtual {v4}, Ll/ۚ۠;->֫()Ljava/util/HashSet;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1f

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۚ۠;

    .line 240
    iget-object v6, v6, Ll/ۚ۠;->ܳ:Ll/ܶ۠;

    const/4 v7, 0x0

    invoke-static {v6, v5, v3, v7}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_f

    :cond_1f
    const/4 v4, 0x0

    if-eqz v11, :cond_20

    .line 245
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_20

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ۠;

    .line 246
    invoke-static {v7, v5, v3, v4}, Ll/ۜܶ;->֫(Ll/ܶ۠;ILjava/util/ArrayList;Ll/֡ܶ;)Ll/֡ܶ;

    goto :goto_10

    :cond_20
    const/4 v6, 0x0

    :goto_11
    if-ge v6, v2, :cond_26

    .line 252
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶ۠;

    .line 511
    iget-object v8, v7, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v9, 0x0

    aget-object v9, v8, v9

    sget-object v10, Ll/۠۠;->᩶:Ll/۠۠;

    if-ne v9, v10, :cond_25

    aget-object v8, v8, v5

    if-ne v8, v10, :cond_25

    .line 254
    iget v8, v7, Ll/ܶ۠;->ܽ:I

    .line 356
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_12
    if-ge v10, v9, :cond_22

    .line 358
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/֡ܶ;

    .line 359
    iget v12, v11, Ll/֡ܶ;->֫:I

    if-ne v8, v12, :cond_21

    goto :goto_13

    :cond_21
    add-int/lit8 v10, v10, 0x1

    goto :goto_12

    :cond_22
    move-object v11, v4

    .line 255
    :goto_13
    iget v7, v7, Ll/ܶ۠;->ۛ֫:I

    .line 356
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    const/4 v9, 0x0

    :goto_14
    if-ge v9, v8, :cond_24

    .line 358
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/֡ܶ;

    .line 359
    iget v12, v10, Ll/֡ܶ;->֫:I

    if-ne v7, v12, :cond_23

    goto :goto_15

    :cond_23
    add-int/lit8 v9, v9, 0x1

    goto :goto_14

    :cond_24
    move-object v10, v4

    :goto_15
    if-eqz v11, :cond_25

    if-eqz v10, :cond_25

    const/4 v7, 0x0

    .line 260
    invoke-virtual {v11, v7, v10}, Ll/֡ܶ;->֫(ILl/֡ܶ;)V

    const/4 v7, 0x2

    .line 175
    iput v7, v10, Ll/֡ܶ;->ܽ:I

    .line 262
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_25
    add-int/lit8 v6, v6, 0x1

    goto :goto_11

    .line 270
    :cond_26
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-gt v1, v5, :cond_27

    goto/16 :goto_19

    .line 1966
    :cond_27
    iget-object v1, v0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    .line 297
    sget-object v2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-ne v1, v2, :cond_2b

    .line 300
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v6, v4

    :cond_28
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܶ;

    .line 48
    iget v8, v7, Ll/֡ܶ;->ܽ:I

    if-ne v8, v5, :cond_29

    goto :goto_16

    .line 305
    :cond_29
    invoke-virtual/range {p0 .. p0}, Ll/᩸۠;->ۢ֫()Ll/ܿ۠;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v7, v8, v9}, Ll/֡ܶ;->֫(Ll/ܿ۠;I)I

    move-result v8

    if-le v8, v2, :cond_28

    move-object v6, v7

    move v2, v8

    goto :goto_16

    :cond_2a
    if-eqz v6, :cond_2b

    .line 318
    sget-object v1, Ll/۠۠;->᩹:Ll/۠۠;

    invoke-virtual {v0, v1}, Ll/ܶ۠;->֫(Ll/۠۠;)V

    .line 319
    invoke-virtual {v0, v2}, Ll/ܶ۠;->᩵(I)V

    goto :goto_17

    :cond_2b
    move-object v6, v4

    .line 1975
    :goto_17
    iget-object v1, v0, Ll/ܶ۠;->ۛ:[Ll/۠۠;

    aget-object v1, v1, v5

    .line 325
    sget-object v2, Ll/۠۠;->ۗ:Ll/۠۠;

    if-ne v1, v2, :cond_2f

    .line 328
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, v4

    :cond_2c
    :goto_18
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2e

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֡ܶ;

    .line 48
    iget v8, v7, Ll/֡ܶ;->ܽ:I

    if-nez v8, :cond_2d

    goto :goto_18

    .line 333
    :cond_2d
    invoke-virtual/range {p0 .. p0}, Ll/᩸۠;->ۢ֫()Ll/ܿ۠;

    move-result-object v8

    invoke-virtual {v7, v8, v5}, Ll/֡ܶ;->֫(Ll/ܿ۠;I)I

    move-result v8

    if-le v8, v2, :cond_2c

    move-object v3, v7

    move v2, v8

    goto :goto_18

    :cond_2e
    if-eqz v3, :cond_2f

    .line 346
    sget-object v1, Ll/۠۠;->᩹:Ll/۠۠;

    invoke-virtual {v0, v1}, Ll/ܶ۠;->ۧ(Ll/۠۠;)V

    .line 347
    invoke-virtual {v0, v2}, Ll/ܶ۠;->ۜ(I)V

    move-object v4, v3

    :cond_2f
    if-nez v6, :cond_31

    if-eqz v4, :cond_30

    goto :goto_1a

    :cond_30
    :goto_19
    const/4 v0, 0x0

    return v0

    :cond_31
    :goto_1a
    return v5
.end method
