.class public final Ll/ۤۗۖ;
.super Ljava/lang/Object;
.source "U5KR"


# direct methods
.method public static ֫(Ll/ۚ᩹ۖ;)V
    .locals 15

    .line 267
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    if-eqz v0, :cond_29

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_19

    .line 286
    :cond_0
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩶ۖ;

    .line 287
    invoke-virtual {v2}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v3

    .line 288
    iget-object v4, v3, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v5, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v4, v5, :cond_1

    .line 289
    check-cast v3, Ll/۬᩶ۖ;

    .line 290
    iget-object v3, v3, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_1

    .line 291
    iget-object v3, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    .line 56
    new-instance v4, Ll/ۤ᩶ۖ;

    invoke-direct {v4}, Ll/ۤ᩶ۖ;-><init>()V

    .line 291
    invoke-virtual {v3, v2, v4}, Ll/ܽۙۖ;->֫(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    goto :goto_0

    .line 299
    :cond_2
    new-instance v0, Ll/ۗۗۖ;

    .line 46
    invoke-direct {v0, p0}, Ll/۟ۗۖ;-><init>(Ll/ۚ᩹ۖ;)V

    .line 300
    invoke-virtual {v0}, Ll/۟ۗۖ;->ۧ()V

    .line 322
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩶ۖ;

    .line 323
    new-instance v3, Ll/۫ۗۖ;

    invoke-direct {v3}, Ll/۫ۗۖ;-><init>()V

    iput-object v3, v2, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    goto :goto_1

    .line 326
    :cond_3
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 327
    iget-object v2, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v2}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ۙۖ;

    .line 328
    iget-object v4, v3, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v5, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-eq v4, v5, :cond_5

    sget-object v5, Ll/۟᩶ۖ;->۬:Ll/۟᩶ۖ;

    if-ne v4, v5, :cond_c

    :cond_5
    invoke-virtual {v3}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v4

    iget-object v4, v4, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v5, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v4, v5, :cond_c

    .line 329
    invoke-virtual {v3}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v4

    check-cast v4, Ll/ᩳ᩶ۖ;

    .line 330
    iget-object v5, v4, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v5, Ll/۫ۗۖ;

    .line 331
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 332
    invoke-static {v3, v0}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;Ljava/util/HashSet;)V

    .line 333
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫ۙۖ;

    .line 334
    iget-object v8, v7, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v8, [Ll/۬ۗۖ;

    if-nez v8, :cond_7

    goto :goto_3

    .line 339
    :cond_7
    invoke-virtual {v6}, Ljava/util/HashSet;->clear()V

    .line 340
    iget v9, v4, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 341
    iget-object v9, v7, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v10, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v9, v10, :cond_8

    .line 342
    check-cast v7, Ll/۬᩶ۖ;

    .line 343
    iget-object v7, v7, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v7, :cond_8

    .line 344
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩸᩶ۖ;

    .line 91
    iget-object v9, v9, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 345
    check-cast v9, Ll/ᩳ᩶ۖ;

    .line 346
    iget v9, v9, Ll/ᩳ᩶ۖ;->ۗ:I

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    const/4 v7, 0x0

    .line 350
    :goto_5
    array-length v9, v8

    if-ge v7, v9, :cond_6

    .line 351
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-virtual {v6, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_6

    .line 354
    :cond_9
    aget-object v9, v8, v7

    if-eqz v9, :cond_a

    .line 355
    iget-boolean v10, v9, Ll/۬ۗۖ;->ܳ:Z

    if-eqz v10, :cond_a

    .line 356
    iget-object v9, v9, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    iget-object v9, v9, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v9, Ll/۫ۗۖ;

    .line 357
    iget-object v10, v5, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 358
    iget-object v9, v9, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v9, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_a
    :goto_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    .line 362
    :cond_b
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    goto/16 :goto_2

    .line 363
    :cond_c
    iget-object v4, v3, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v5, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v4, v5, :cond_4

    .line 366
    move-object v4, v3

    check-cast v4, Ll/۬᩶ۖ;

    .line 367
    iget-object v4, v4, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v4, :cond_4

    iget-object v5, v3, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    if-eqz v5, :cond_4

    .line 368
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸᩶ۖ;

    .line 91
    iget-object v5, v5, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 369
    check-cast v5, Ll/ᩳ᩶ۖ;

    .line 370
    iget-object v5, v5, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v5, Ll/۫ۗۖ;

    .line 371
    iget-object v6, v3, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v6, [Ll/۬ۗۖ;

    .line 372
    array-length v7, v6

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v7, :cond_d

    aget-object v9, v6, v8

    if-eqz v9, :cond_e

    .line 373
    iget-boolean v10, v9, Ll/۬ۗۖ;->ܳ:Z

    if-eqz v10, :cond_e

    .line 374
    iget-object v9, v9, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    iget-object v9, v9, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v9, Ll/۫ۗۖ;

    .line 375
    iget-object v10, v5, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 376
    iget-object v9, v9, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v9, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_e
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 305
    :cond_f
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    .line 116
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩶ۖ;

    .line 117
    iget-object v3, v2, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    .line 119
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸᩶ۖ;

    .line 91
    iget-object v6, v5, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 121
    check-cast v6, Ll/ᩳ᩶ۖ;

    .line 96
    iget-object v7, v5, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 122
    check-cast v7, Ll/᩻᩶ۖ;

    .line 124
    iget-object v8, v6, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v8, Ll/۫ۗۖ;

    .line 162
    iget-object v7, v7, Ll/ۚ᩶ۖ;->ۗ:[Ll/۠᩶ۖ;

    .line 125
    array-length v9, v7

    const/4 v10, 0x0

    :goto_8
    if-ge v10, v9, :cond_11

    aget-object v11, v7, v10

    .line 126
    check-cast v11, Ll/ᩳ᩶ۖ;

    iget-object v11, v11, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v11, Ll/۫ۗۖ;

    .line 127
    iget-object v12, v8, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v12, v11}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_14

    .line 133
    invoke-virtual {v6}, Ll/ᩳ᩶ۖ;->clone()Ll/۠᩶ۖ;

    move-result-object v7

    check-cast v7, Ll/ᩳ᩶ۖ;

    .line 137
    iput-object v7, v5, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 138
    new-instance v5, Ll/۫ۗۖ;

    invoke-direct {v5}, Ll/۫ۗۖ;-><init>()V

    .line 139
    iput-object v5, v7, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    .line 141
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    invoke-static {v6, v7}, Ll/ᩳۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠᩶ۖ;)Ll/᩸᩶ۖ;

    move-result-object v8

    .line 143
    invoke-virtual {v2}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v9

    if-eqz v9, :cond_12

    .line 144
    iget-object v10, v9, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v11, Ll/۟᩶ۖ;->۬:Ll/۟᩶ۖ;

    if-ne v10, v11, :cond_12

    invoke-virtual {v9}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v10

    iget-object v10, v10, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v11, Ll/֨᩶ۖ;->֫֫:Ll/֨᩶ۖ;

    if-ne v10, v11, :cond_12

    .line 146
    iget-object v10, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v10, v9, v8}, Ll/ܽۙۖ;->֫(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    goto :goto_9

    .line 148
    :cond_12
    iget-object v9, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v9, v2, v8}, Ll/ܽۙۖ;->֫(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    .line 150
    :goto_9
    iget-object v8, v2, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v8, [Ll/۬ۗۖ;

    .line 159
    iget v6, v6, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v6, v8, v6

    .line 160
    iput-object v7, v6, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    .line 161
    array-length v6, v8

    const/4 v7, 0x0

    :goto_a
    if-ge v7, v6, :cond_11

    aget-object v9, v8, v7

    if-eqz v9, :cond_13

    .line 162
    iget-boolean v10, v9, Ll/۬ۗۖ;->ܳ:Z

    if-eqz v10, :cond_13

    .line 163
    iget-object v9, v9, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    iget-object v9, v9, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v9, Ll/۫ۗۖ;

    .line 164
    iget-object v10, v9, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v10, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 165
    iget-object v10, v5, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_13
    add-int/lit8 v7, v7, 0x1

    goto :goto_a

    :cond_14
    add-int/lit8 v10, v10, 0x1

    goto :goto_8

    .line 306
    :cond_15
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    .line 176
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 177
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬᩶ۖ;

    .line 178
    iget-object v5, v3, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    .line 179
    iget-object v6, v3, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v6, [Ll/۬ۗۖ;

    .line 180
    iget-object v7, v3, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v7}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֫ۙۖ;

    .line 181
    iget-boolean v9, v8, Ll/֫ۙۖ;->ۢ:Z

    if-eqz v9, :cond_24

    .line 182
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_17
    :goto_c
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/᩸᩶ۖ;

    .line 91
    iget-object v10, v10, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 183
    check-cast v10, Ll/ᩳ᩶ۖ;

    .line 184
    iget v11, v10, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v11, v6, v11

    .line 185
    iget-object v11, v11, Ll/۬ۗۖ;->ܿ:Ljava/util/HashMap;

    invoke-virtual {v11, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ᩳ᩶ۖ;

    if-eq v11, v10, :cond_17

    .line 187
    invoke-static {v10, v11}, Ll/ᩳۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠᩶ۖ;)Ll/᩸᩶ۖ;

    move-result-object v10

    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    .line 190
    :cond_18
    iget-object v9, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    .line 199
    iget-object v10, v8, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    const/4 v11, 0x1

    if-eqz v10, :cond_19

    invoke-virtual {v10, v3}, Ljava/util/TreeSet;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    goto :goto_d

    .line 202
    :cond_19
    sget-object v10, Ll/᩶ۗۖ;->֫:[I

    iget-object v12, v8, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    aget v10, v10, v12

    if-eq v10, v11, :cond_1b

    const/4 v12, 0x2

    if-eq v10, v12, :cond_1b

    const/4 v12, 0x3

    if-eq v10, v12, :cond_1a

    const/4 v12, 0x4

    if-eq v10, v12, :cond_1a

    const/4 v10, 0x0

    goto :goto_e

    :cond_1a
    :goto_d
    const/4 v10, 0x1

    goto :goto_e

    .line 205
    :cond_1b
    move-object v10, v8

    check-cast v10, Ll/ۗ᩶ۖ;

    .line 206
    invoke-interface {v10}, Ll/ۗ᩶ۖ;->֫()Ll/۬᩶ۖ;

    move-result-object v10

    invoke-virtual {v10, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v10

    :goto_e
    if-eqz v10, :cond_1c

    .line 218
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_f
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸᩶ۖ;

    .line 219
    invoke-virtual {v9, v8, v12}, Ll/ܽۙۖ;->ۧ(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    goto :goto_f

    .line 222
    :cond_1c
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_10
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸᩶ۖ;

    .line 223
    invoke-virtual {v9, v8, v12}, Ll/ܽۙۖ;->֫(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    goto :goto_10

    .line 226
    :cond_1d
    iget-object v8, v8, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v8, [Ll/۬ۗۖ;

    .line 227
    new-instance v9, Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 228
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_11
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_22

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸᩶ۖ;

    .line 91
    iget-object v13, v12, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 229
    check-cast v13, Ll/ᩳ᩶ۖ;

    .line 231
    new-instance v14, Ll/۬ۗۖ;

    invoke-direct {v14, v4}, Ll/۬ۗۖ;-><init>(I)V

    .line 232
    iput-object v13, v14, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    .line 233
    iput-boolean v11, v14, Ll/۬ۗۖ;->ܳ:Z

    .line 234
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    iget-object v4, v13, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v4, Ll/۫ۗۖ;

    .line 96
    iget-object v11, v12, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 237
    check-cast v11, Ll/ᩳ᩶ۖ;

    .line 238
    iget v11, v11, Ll/ᩳ᩶ۖ;->ۗ:I

    const/4 v12, 0x0

    .line 239
    :goto_12
    array-length v13, v8

    if-ge v12, v13, :cond_20

    if-ne v12, v11, :cond_1e

    goto :goto_13

    .line 243
    :cond_1e
    aget-object v13, v8, v12

    if-eqz v13, :cond_1f

    .line 244
    iget-boolean v14, v13, Ll/۬ۗۖ;->ܳ:Z

    if-eqz v14, :cond_1f

    .line 245
    iget-object v13, v13, Ll/۬ۗۖ;->ۧ:Ll/ᩳ᩶ۖ;

    iget-object v13, v13, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v13, Ll/۫ۗۖ;

    .line 246
    iget-object v14, v13, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v14, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 247
    iget-object v14, v4, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v14, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1f
    :goto_13
    add-int/lit8 v12, v12, 0x1

    goto :goto_12

    .line 250
    :cond_20
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_14
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_21

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸᩶ۖ;

    .line 91
    iget-object v12, v12, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 251
    check-cast v12, Ll/ᩳ᩶ۖ;

    iget-object v12, v12, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v12, Ll/۫ۗۖ;

    .line 252
    iget-object v13, v12, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v13, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 253
    iget-object v13, v4, Ll/۫ۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v13, v12}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_21
    const/4 v4, 0x0

    const/4 v11, 0x1

    goto :goto_11

    .line 257
    :cond_22
    array-length v4, v8

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v10

    add-int/2addr v10, v4

    new-array v4, v10, [Ll/۬ۗۖ;

    .line 258
    array-length v10, v8

    const/4 v11, 0x0

    invoke-static {v8, v11, v4, v11, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/4 v10, 0x0

    .line 259
    :goto_15
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-ge v10, v11, :cond_23

    .line 260
    array-length v11, v8

    add-int/2addr v11, v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۬ۗۖ;

    aput-object v12, v4, v11

    add-int/lit8 v10, v10, 0x1

    goto :goto_15

    .line 191
    :cond_23
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    :cond_24
    const/4 v4, 0x0

    goto/16 :goto_b

    .line 309
    :cond_25
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_26

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩶ۖ;

    .line 310
    iput-object v2, v1, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    goto :goto_16

    .line 312
    :cond_26
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_27

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    .line 313
    iput-object v2, v1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    goto :goto_17

    .line 315
    :cond_27
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_28

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩶ۖ;

    .line 316
    iput-object v2, v1, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    goto :goto_18

    .line 318
    :cond_28
    iput-object v2, p0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    :cond_29
    :goto_19
    return-void
.end method
