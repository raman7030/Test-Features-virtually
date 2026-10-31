.class public final Ll/᩺֫ܺ;
.super Ljava/lang/Object;
.source "CAUY"

# interfaces
.implements Ll/ܽۧܺ;


# virtual methods
.method public final ֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V
    .locals 17

    move-object/from16 v1, p1

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    .line 35
    iget-object v3, v1, Ll/ۛ֫ܺ;->ۜ:Ll/ۜۧܺ;

    iget-object v4, v1, Ll/ۛ֫ܺ;->ܽ:Ll/᩻ۧܺ;

    .line 37
    iget v5, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v6, Ll/᩷ۧܺ;->ۧ֫:Ll/᩷ۧܺ;

    iget v6, v6, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    const/4 v5, 0x1

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_1

    .line 41
    invoke-static/range {p4 .. p4}, Ll/᩵ۧܺ;->ۧ(Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;

    move-result-object v8

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    const-string v9, "[]"

    if-nez v0, :cond_3

    .line 45
    iget v0, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v1, Ll/᩷ۧܺ;->ۜ֫:Ll/᩷ۧܺ;

    iget v1, v1, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v0, v1

    if-eqz v0, :cond_2

    .line 46
    invoke-virtual {v3, v9}, Ll/ۜۧܺ;->write(Ljava/lang/String;)V

    return-void

    .line 48
    :cond_2
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    return-void

    .line 53
    :cond_3
    move-object v10, v0

    check-cast v10, Ljava/util/List;

    .line 54
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    if-nez v11, :cond_4

    .line 57
    invoke-virtual {v3, v9}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    return-void

    .line 61
    :cond_4
    iget-object v9, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 63
    iget v12, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v13, Ll/᩷ۧܺ;->ۗ:Ll/᩷ۧܺ;

    iget v13, v13, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v12, v13

    if-nez v12, :cond_6

    .line 64
    new-instance v12, Ll/ܳۧܺ;

    invoke-direct {v12, v9, v0, v2, v6}, Ll/ܳۧܺ;-><init>(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;I)V

    iput-object v12, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 65
    iget-object v12, v1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-nez v12, :cond_5

    .line 66
    new-instance v12, Ljava/util/IdentityHashMap;

    invoke-direct {v12}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object v12, v1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    .line 68
    :cond_5
    iget-object v12, v1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    iget-object v13, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    invoke-virtual {v12, v0, v13}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    :cond_6
    :try_start_0
    iget v12, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v13, Ll/᩷ۧܺ;->ۛ:Ll/᩷ۧܺ;

    iget v13, v13, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v12, v13

    const/16 v13, 0x5d

    const/16 v14, 0x2c

    const/16 v15, 0x5b

    if-eqz v12, :cond_b

    .line 74
    invoke-virtual {v3, v15}, Ll/ۜۧܺ;->write(I)V

    .line 75
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ܽ()V

    const/4 v5, 0x0

    :goto_2
    if-ge v5, v11, :cond_a

    .line 78
    invoke-interface {v10, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    if-eqz v5, :cond_7

    .line 80
    invoke-virtual {v3, v14}, Ll/ۜۧܺ;->write(I)V

    .line 83
    :cond_7
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ᩳ()V

    if-eqz v7, :cond_9

    .line 85
    iget-object v12, v1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-eqz v12, :cond_8

    invoke-virtual {v12, v7}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    .line 86
    invoke-virtual {v1, v7}, Ll/ۛ֫ܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_3

    .line 88
    :cond_8
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v12

    invoke-virtual {v4, v12}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v12

    .line 89
    new-instance v15, Ll/ܳۧܺ;

    invoke-direct {v15, v9, v0, v2, v6}, Ll/ܳۧܺ;-><init>(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 90
    iput-object v15, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 91
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-interface {v12, v1, v7, v15, v8}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    goto :goto_3

    .line 94
    :cond_9
    invoke-virtual {v3}, Ll/ۜۧܺ;->֫()V

    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 98
    :cond_a
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->֫()V

    .line 99
    invoke-virtual/range {p1 .. p1}, Ll/ۛ֫ܺ;->ᩳ()V

    .line 100
    invoke-virtual {v3, v13}, Ll/ۜۧܺ;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    iput-object v9, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    .line 106
    :cond_b
    :try_start_1
    iget v11, v3, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v11, v7

    .line 107
    iget-object v12, v3, Ll/ۜۧܺ;->᩸:[C

    array-length v12, v12

    if-le v11, v12, :cond_c

    .line 109
    invoke-virtual {v3, v11}, Ll/ۜۧܺ;->ۧ(I)V

    .line 115
    :cond_c
    iget-object v12, v3, Ll/ۜۧܺ;->᩸:[C

    iget v14, v3, Ll/ۜۧܺ;->᩹:I

    aput-char v15, v12, v14

    .line 116
    iput v11, v3, Ll/ۜۧܺ;->᩹:I

    const/4 v11, 0x0

    .line 118
    :goto_4
    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_17

    .line 119
    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    if-eqz v11, :cond_e

    .line 123
    iget v14, v3, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v14, v7

    .line 124
    iget-object v15, v3, Ll/ۜۧܺ;->᩸:[C

    array-length v15, v15

    if-le v14, v15, :cond_d

    .line 126
    invoke-virtual {v3, v14}, Ll/ۜۧܺ;->ۧ(I)V

    .line 132
    :cond_d
    iget-object v15, v3, Ll/ۜۧܺ;->᩸:[C

    const/16 v16, 0x2c

    iget v13, v3, Ll/ۜۧܺ;->᩹:I

    aput-char v16, v15, v13

    .line 133
    iput v14, v3, Ll/ۜۧܺ;->᩹:I

    :cond_e
    if-nez v12, :cond_f

    const-string v12, "null"

    .line 138
    invoke-virtual {v3, v12}, Ll/ۜۧܺ;->append(Ljava/lang/CharSequence;)V

    goto/16 :goto_5

    .line 140
    :cond_f
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    .line 142
    const-class v14, Ljava/lang/Integer;

    if-ne v13, v14, :cond_10

    .line 143
    check-cast v12, Ljava/lang/Integer;

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    invoke-virtual {v3, v12}, Ll/ۜۧܺ;->writeInt(I)V

    goto :goto_5

    .line 144
    :cond_10
    const-class v14, Ljava/lang/Long;

    if-ne v13, v14, :cond_12

    .line 145
    check-cast v12, Ljava/lang/Long;

    invoke-virtual {v12}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    if-eqz v5, :cond_11

    .line 147
    invoke-virtual {v3, v12, v13}, Ll/ۜۧܺ;->ۧ(J)V

    const/16 v12, 0x4c

    .line 148
    invoke-virtual {v3, v12}, Ll/ۜۧܺ;->write(I)V

    goto :goto_5

    .line 150
    :cond_11
    invoke-virtual {v3, v12, v13}, Ll/ۜۧܺ;->ۧ(J)V

    goto :goto_5

    .line 152
    :cond_12
    const-class v14, Ljava/lang/String;

    if-ne v13, v14, :cond_14

    .line 153
    check-cast v12, Ljava/lang/String;

    .line 155
    iget v13, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v14, Ll/᩷ۧܺ;->֫֫:Ll/᩷ۧܺ;

    iget v14, v14, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v13, v14

    if-eqz v13, :cond_13

    .line 156
    invoke-virtual {v3, v12}, Ll/ۜۧܺ;->ۧ(Ljava/lang/String;)V

    goto :goto_5

    .line 158
    :cond_13
    invoke-virtual {v3, v12, v6, v7}, Ll/ۜۧܺ;->֫(Ljava/lang/String;CZ)V

    goto :goto_5

    .line 161
    :cond_14
    iget v13, v3, Ll/ۜۧܺ;->᩶:I

    sget-object v14, Ll/᩷ۧܺ;->ۗ:Ll/᩷ۧܺ;

    iget v14, v14, Ll/᩷ۧܺ;->᩸:I

    and-int/2addr v13, v14

    if-nez v13, :cond_15

    .line 162
    new-instance v13, Ll/ܳۧܺ;

    invoke-direct {v13, v9, v0, v2, v6}, Ll/ܳۧܺ;-><init>(Ll/ܳۧܺ;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 163
    iput-object v13, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 166
    :cond_15
    iget-object v13, v1, Ll/ۛ֫ܺ;->ۡ:Ljava/util/IdentityHashMap;

    if-eqz v13, :cond_16

    invoke-virtual {v13, v12}, Ljava/util/IdentityHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_16

    .line 167
    invoke-virtual {v1, v12}, Ll/ۛ֫ܺ;->ۧ(Ljava/lang/Object;)V

    goto :goto_5

    .line 169
    :cond_16
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v4, v13}, Ll/᩻ۧܺ;->֫(Ljava/lang/Class;)Ll/ܽۧܺ;

    move-result-object v13

    .line 170
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-interface {v13, v1, v12, v14, v8}, Ll/ܽۧܺ;->֫(Ll/ۛ֫ܺ;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;)V

    :goto_5
    add-int/lit8 v11, v11, 0x1

    goto/16 :goto_4

    .line 177
    :cond_17
    iget v0, v3, Ll/ۜۧܺ;->᩹:I

    add-int/2addr v0, v7

    .line 178
    iget-object v2, v3, Ll/ۜۧܺ;->᩸:[C

    array-length v2, v2

    if-le v0, v2, :cond_18

    .line 180
    invoke-virtual {v3, v0}, Ll/ۜۧܺ;->ۧ(I)V

    .line 186
    :cond_18
    iget-object v2, v3, Ll/ۜۧܺ;->᩸:[C

    iget v4, v3, Ll/ۜۧܺ;->᩹:I

    const/16 v5, 0x5d

    aput-char v5, v2, v4

    .line 187
    iput v0, v3, Ll/ۜۧܺ;->᩹:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 190
    iput-object v9, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    return-void

    :catchall_0
    move-exception v0

    iput-object v9, v1, Ll/ۛ֫ܺ;->ᩳ:Ll/ܳۧܺ;

    .line 191
    throw v0
.end method
