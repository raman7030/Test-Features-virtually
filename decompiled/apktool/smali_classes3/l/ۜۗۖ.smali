.class public final Ll/ۜۗۖ;
.super Ll/ۤ᩵ۚ;
.source "I4PY"


# instance fields
.field public final ֫:Ll/֡ۛۡ;

.field public final ۧ:Ll/֡ۛۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/ۜۗۖ;->ۧ:Ll/֡ۛۡ;

    .line 59
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/ۜۗۖ;->֫:Ll/֡ۛۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩹ۖ;)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 72
    iget-object v2, v0, Ll/ۜۗۖ;->֫:Ll/֡ۛۡ;

    invoke-virtual {v2}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 73
    iget-object v4, v0, Ll/ۜۗۖ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v4}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map;

    if-nez v3, :cond_0

    .line 75
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    if-nez v5, :cond_1

    .line 78
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 80
    :cond_1
    iget-object v6, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v6}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v6

    :goto_0
    if-eqz v6, :cond_4

    .line 81
    iget-object v7, v6, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v8, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-ne v7, v8, :cond_3

    .line 82
    move-object v7, v6

    check-cast v7, Ll/᩸᩶ۖ;

    .line 91
    iget-object v8, v7, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 83
    iget-object v9, v8, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v10, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v9, v10, :cond_3

    .line 96
    iget-object v9, v7, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 84
    iget-object v11, v9, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v12, Ll/֨᩶ۖ;->ۛ:Ll/֨᩶ۖ;

    if-ne v11, v12, :cond_2

    .line 85
    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 91
    iget-object v8, v7, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 86
    check-cast v8, Ll/ᩳ᩶ۖ;

    .line 96
    iget-object v7, v7, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 86
    check-cast v7, Ll/ۨ᩹ۖ;

    iget-object v7, v7, Ll/ۨ᩹ۖ;->ۗ:Ljava/lang/Object;

    invoke-interface {v5, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    if-ne v11, v10, :cond_3

    .line 88
    check-cast v8, Ll/ᩳ᩶ۖ;

    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    :cond_3
    :goto_1
    invoke-virtual {v6}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v6

    goto :goto_0

    .line 93
    :cond_4
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x0

    if-nez v6, :cond_5

    .line 94
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 95
    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 96
    invoke-virtual {v2, v3}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 97
    invoke-virtual {v4, v5}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return v7

    .line 100
    :cond_5
    invoke-static {v5}, Ll/ܺۗۖ;->֫(Ljava/util/Map;)V

    .line 101
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    .line 102
    new-instance v7, Ljava/util/HashSet;

    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 103
    iget-object v8, v1, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    if-eqz v8, :cond_f

    const/4 v9, 0x1

    const/4 v10, 0x0

    :goto_2
    if-eqz v9, :cond_10

    .line 108
    invoke-virtual {v7}, Ljava/util/HashSet;->clear()V

    .line 109
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v11, 0x0

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_e

    .line 110
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۬᩶ۖ;

    .line 111
    iget-object v13, v12, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz v13, :cond_d

    .line 112
    invoke-virtual {v13}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    .line 113
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/᩸᩶ۖ;

    .line 96
    iget-object v15, v14, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 114
    invoke-virtual {v15}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v15

    .line 117
    array-length v0, v15

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v8

    move-object/from16 v8, v16

    move/from16 v16, v10

    const/4 v10, 0x0

    :goto_5
    if-ge v10, v0, :cond_9

    move/from16 v17, v0

    aget-object v0, v15, v10

    .line 118
    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_6

    :cond_6
    if-nez v8, :cond_7

    move-object v8, v0

    goto :goto_7

    .line 125
    :cond_7
    invoke-virtual {v8, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 96
    :goto_6
    iget-object v0, v14, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 143
    invoke-virtual {v0}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v7, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move/from16 v10, v16

    goto :goto_9

    :cond_8
    :goto_7
    add-int/lit8 v10, v10, 0x1

    move/from16 v0, v17

    goto :goto_5

    .line 91
    :cond_9
    iget-object v0, v14, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 131
    check-cast v0, Ll/ᩳ᩶ۖ;

    invoke-interface {v5, v0, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    instance-of v0, v8, Ll/ᩳ᩶ۖ;

    if-eqz v0, :cond_a

    .line 133
    check-cast v8, Ll/۠᩶ۖ;

    .line 104
    iput-object v8, v14, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    goto :goto_8

    .line 331
    :cond_a
    new-instance v0, Ll/ۨ᩹ۖ;

    invoke-direct {v0, v8}, Ll/ۨ᩹ۖ;-><init>(Ljava/lang/Object;)V

    .line 104
    iput-object v0, v14, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 136
    invoke-interface {v3, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    :goto_8
    invoke-interface {v13}, Ljava/util/Iterator;->remove()V

    .line 139
    iget-object v0, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v0, v12, v14}, Ll/ܽۙۖ;->֫(Ll/֫ۙۖ;Ll/֫ۙۖ;)V

    const/4 v11, 0x1

    const/4 v10, 0x1

    :goto_9
    move-object/from16 v0, p0

    move-object/from16 v8, v18

    goto :goto_4

    :cond_b
    move-object/from16 v18, v8

    move/from16 v16, v10

    .line 146
    iget-object v0, v12, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_c

    .line 147
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    :cond_c
    move/from16 v10, v16

    goto :goto_a

    :cond_d
    move-object/from16 v18, v8

    :goto_a
    move-object/from16 v0, p0

    move-object/from16 v8, v18

    goto/16 :goto_3

    :cond_e
    move-object/from16 v0, p0

    move v9, v11

    goto/16 :goto_2

    :cond_f
    const/4 v10, 0x0

    .line 154
    :cond_10
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    .line 155
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩸᩶ۖ;

    .line 91
    iget-object v9, v8, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 156
    invoke-virtual {v7, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_11

    .line 157
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 158
    iget-object v9, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v9, v8}, Ll/ܽۙۖ;->ܽ(Ll/֫ۙۖ;)V

    .line 159
    iget-object v9, v1, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    .line 91
    iget-object v10, v8, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 159
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v9, 0x1

    const/4 v10, 0x1

    .line 91
    :cond_11
    iget-object v9, v8, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 162
    check-cast v9, Ll/ᩳ᩶ۖ;

    .line 96
    iget-object v8, v8, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 162
    invoke-virtual {v6, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    .line 166
    :cond_12
    iget-object v0, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    new-instance v1, Ll/᩻ۗۖ;

    invoke-direct {v1, v6}, Ll/᩻ۗۖ;-><init>(Ljava/util/HashMap;)V

    .line 421
    invoke-virtual {v0}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v0

    :goto_c
    if-eqz v0, :cond_13

    const/4 v6, 0x0

    .line 422
    invoke-static {v0, v1, v6}, Ll/ܶۙۖ;->ۧ(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V

    .line 421
    invoke-virtual {v0}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v0

    goto :goto_c

    .line 178
    :cond_13
    invoke-interface {v3}, Ljava/util/List;->clear()V

    .line 179
    invoke-interface {v5}, Ljava/util/Map;->clear()V

    .line 180
    invoke-virtual {v2, v3}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    .line 181
    invoke-virtual {v4, v5}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return v10
.end method
