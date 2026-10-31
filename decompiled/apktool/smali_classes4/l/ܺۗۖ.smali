.class public final Ll/ܺۗۖ;
.super Ll/ۤ᩵ۚ;
.source "94T8"


# instance fields
.field public final ֫:Ll/֡ۛۡ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/ܺۗۖ;->֫:Ll/֡ۛۡ;

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;)V
    .locals 8

    if-eqz p0, :cond_3

    .line 80
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۬᩶ۖ;

    .line 81
    iget-object v0, v0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸᩶ۖ;

    .line 96
    iget-object v2, v1, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 82
    invoke-virtual {v2}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v2

    .line 83
    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v3, :cond_2

    aget-object v6, v2, v5

    .line 84
    invoke-virtual {p1, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠᩶ۖ;

    if-eqz v7, :cond_1

    .line 86
    invoke-virtual {p2, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 88
    :cond_1
    invoke-virtual {p2, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 91
    :cond_2
    iget-object v2, v1, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    invoke-virtual {p2, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 96
    iget-object v1, v1, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    new-array v2, v4, [Ll/۠᩶ۖ;

    .line 92
    invoke-virtual {p2, v2}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ll/۠᩶ۖ;

    invoke-virtual {v1, v2}, Ll/۠᩶ۖ;->֫([Ll/۠᩶ۖ;)V

    .line 93
    invoke-virtual {p2}, Ljava/util/HashSet;->clear()V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static ֫(Ljava/util/Map;)V
    .locals 6

    .line 228
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 229
    new-instance v1, Ll/᩷ۗۖ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_2

    .line 239
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 240
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 241
    instance-of v5, v4, Ll/ᩳ᩶ۖ;

    if-eqz v5, :cond_0

    .line 242
    invoke-interface {p0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    if-eq v4, v5, :cond_0

    .line 245
    invoke-interface {v3, v5}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩹ۖ;)Z
    .locals 19

    move-object/from16 v0, p1

    .line 255
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 256
    iget-object v2, v0, Ll/ۚ᩹ۖ;->ܳ:Ljava/util/ArrayList;

    .line 257
    iget-object v3, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v3}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v3

    :goto_0
    if-eqz v3, :cond_1

    .line 258
    iget-object v4, v3, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v5, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-ne v4, v5, :cond_0

    .line 259
    move-object v4, v3

    check-cast v4, Ll/᩸᩶ۖ;

    .line 91
    iget-object v5, v4, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 260
    iget-object v5, v5, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v6, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v5, v6, :cond_0

    .line 96
    iget-object v5, v4, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 260
    iget-object v5, v5, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    if-ne v5, v6, :cond_0

    .line 261
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 257
    :cond_0
    invoke-virtual {v3}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v3

    goto :goto_0

    .line 265
    :cond_1
    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 266
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    :goto_1
    if-eqz v6, :cond_24

    if-eqz v2, :cond_15

    .line 151
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    move-object/from16 v8, p0

    .line 153
    iget-object v9, v8, Ll/ܺۗۖ;->֫:Ll/֡ۛۡ;

    invoke-virtual {v9}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map;

    if-nez v10, :cond_2

    .line 155
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 210
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_2
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/۬᩶ۖ;

    .line 211
    iget-object v12, v12, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_7

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/᩸᩶ۖ;

    .line 91
    iget-object v14, v13, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 212
    check-cast v14, Ll/ᩳ᩶ۖ;

    .line 107
    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/ۡۗۖ;

    if-nez v15, :cond_3

    .line 109
    new-instance v15, Ll/ۡۗۖ;

    invoke-direct {v15}, Ll/ۡۗۖ;-><init>()V

    .line 110
    iput-object v14, v15, Ll/ۡۗۖ;->ܽ:Ll/ᩳ᩶ۖ;

    .line 111
    invoke-interface {v10, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    :cond_3
    iput-boolean v5, v15, Ll/ۡۗۖ;->ۧ:Z

    .line 96
    iget-object v5, v13, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 215
    invoke-virtual {v5}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v5

    array-length v13, v5

    const/16 v16, 0x0

    move/from16 v17, v7

    const/4 v7, 0x0

    :goto_4
    if-ge v7, v13, :cond_6

    aget-object v8, v5, v7

    if-ne v8, v14, :cond_4

    move-object/from16 v18, v5

    goto :goto_6

    .line 219
    :cond_4
    check-cast v8, Ll/ᩳ᩶ۖ;

    .line 107
    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ll/ۡۗۖ;

    if-nez v16, :cond_5

    move-object/from16 v18, v5

    .line 109
    new-instance v5, Ll/ۡۗۖ;

    invoke-direct {v5}, Ll/ۡۗۖ;-><init>()V

    .line 110
    iput-object v8, v5, Ll/ۡۗۖ;->ܽ:Ll/ᩳ᩶ۖ;

    .line 111
    invoke-interface {v10, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_5
    move-object/from16 v18, v5

    move-object/from16 v5, v16

    .line 117
    :goto_5
    iget-object v8, v5, Ll/ۡۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v8, v15}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 118
    iget-object v8, v15, Ll/ۡۗۖ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v8, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_6
    add-int/lit8 v7, v7, 0x1

    move-object/from16 v8, p0

    move-object/from16 v5, v18

    goto :goto_4

    :cond_6
    const/4 v5, 0x1

    move-object/from16 v8, p0

    move/from16 v7, v17

    goto :goto_3

    :cond_7
    move-object/from16 v8, p0

    goto :goto_2

    :cond_8
    move/from16 v17, v7

    .line 158
    new-instance v5, Ll/ۛۗۖ;

    invoke-direct {v5}, Ll/ۛۗۖ;-><init>()V

    .line 159
    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v7

    invoke-virtual {v5, v7}, Ll/ۛۗۖ;->addAll(Ljava/util/Collection;)Z

    .line 160
    :cond_9
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_b

    .line 161
    invoke-virtual {v5}, Ll/ۛۗۖ;->poll()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۡۗۖ;

    .line 162
    iget-object v8, v7, Ll/ۡۗۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v8}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_a
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/ۡۗۖ;

    .line 163
    iget-boolean v12, v11, Ll/ۡۗۖ;->ۧ:Z

    if-eqz v12, :cond_a

    .line 164
    iget-object v12, v11, Ll/ۡۗۖ;->ᩳ:Ljava/util/HashSet;

    iget-object v13, v7, Ll/ۡۗۖ;->ᩳ:Ljava/util/HashSet;

    invoke-interface {v12, v13}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    move-result v12

    if-eqz v12, :cond_a

    .line 165
    invoke-virtual {v5, v11}, Ll/ۛۗۖ;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 170
    :cond_b
    invoke-interface {v10}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :cond_c
    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡۗۖ;

    .line 171
    iget-boolean v11, v8, Ll/ۡۗۖ;->ۧ:Z

    if-eqz v11, :cond_c

    .line 173
    iget-object v11, v8, Ll/ۡۗۖ;->ᩳ:Ljava/util/HashSet;

    invoke-virtual {v11}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    :cond_d
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۡۗۖ;

    .line 174
    iget-boolean v14, v13, Ll/ۡۗۖ;->ۧ:Z

    if-nez v14, :cond_d

    if-nez v12, :cond_e

    .line 176
    iget-object v12, v13, Ll/ۡۗۖ;->ܽ:Ll/ᩳ᩶ۖ;

    goto :goto_9

    :cond_e
    const/4 v12, 0x0

    :cond_f
    if-eqz v12, :cond_c

    .line 184
    iget-object v7, v8, Ll/ۡۗۖ;->ܽ:Ll/ᩳ᩶ۖ;

    invoke-virtual {v3, v7, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    iget-object v7, v8, Ll/ۡۗۖ;->ܽ:Ll/ᩳ᩶ۖ;

    invoke-virtual {v6, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    goto :goto_8

    .line 190
    :cond_10
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_11
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_14

    .line 191
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/۬᩶ۖ;

    .line 192
    iget-object v11, v8, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_12
    :goto_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_13

    .line 193
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/᩸᩶ۖ;

    .line 91
    iget-object v12, v12, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 194
    invoke-virtual {v6, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    .line 195
    invoke-interface {v11}, Ljava/util/Iterator;->remove()V

    goto :goto_b

    .line 198
    :cond_13
    iget-object v11, v8, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    if-nez v11, :cond_11

    const/4 v11, 0x0

    .line 199
    iput-object v11, v8, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    .line 200
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_a

    .line 203
    :cond_14
    invoke-interface {v10}, Ljava/util/Map;->clear()V

    .line 204
    invoke-virtual {v9, v10}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_15
    move/from16 v17, v7

    const/4 v7, 0x0

    :goto_c
    if-eqz v7, :cond_16

    .line 272
    invoke-static {v3}, Ll/ܺۗۖ;->֫(Ljava/util/Map;)V

    .line 273
    invoke-static {v2, v3, v4}, Ll/ܺۗۖ;->֫(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;)V

    :cond_16
    :goto_d
    if-eqz v2, :cond_1a

    .line 125
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_17
    :goto_e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    .line 126
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۬᩶ۖ;

    .line 127
    iget-object v8, v7, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    .line 128
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩸᩶ۖ;

    .line 96
    iget-object v10, v9, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 129
    invoke-virtual {v10}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v10

    invoke-static {v10}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v4, v10}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 91
    iget-object v10, v9, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 130
    invoke-virtual {v4, v10}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 131
    invoke-virtual {v4}, Ljava/util/HashSet;->size()I

    move-result v10

    const/4 v11, 0x1

    if-ne v10, v11, :cond_18

    .line 132
    invoke-interface {v8}, Ljava/util/Iterator;->remove()V

    .line 91
    iget-object v6, v9, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 134
    check-cast v6, Ll/ᩳ᩶ۖ;

    invoke-virtual {v4}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ᩳ᩶ۖ;

    invoke-virtual {v3, v6, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v6, 0x1

    .line 136
    :cond_18
    invoke-virtual {v4}, Ljava/util/HashSet;->clear()V

    goto :goto_f

    .line 138
    :cond_19
    iget-object v8, v7, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-nez v8, :cond_17

    const/4 v8, 0x0

    .line 139
    iput-object v8, v7, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    .line 140
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_e

    :cond_1a
    const/4 v6, 0x0

    :cond_1b
    if-eqz v6, :cond_1c

    .line 277
    invoke-static {v3}, Ll/ܺۗۖ;->֫(Ljava/util/Map;)V

    .line 278
    invoke-static {v2, v3, v4}, Ll/ܺۗۖ;->֫(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;)V

    goto :goto_d

    :cond_1c
    const/4 v5, 0x0

    move/from16 v7, v17

    const/4 v6, 0x0

    .line 280
    :goto_10
    iget-object v5, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    .line 56
    new-instance v8, Ljava/util/HashSet;

    invoke-direct {v8}, Ljava/util/HashSet;-><init>()V

    if-eqz v2, :cond_1e

    .line 58
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1e

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/۬᩶ۖ;

    .line 59
    iget-object v10, v10, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_11
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1d

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩸᩶ۖ;

    .line 96
    iget-object v11, v11, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 60
    invoke-virtual {v11}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v11

    invoke-static {v11}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v11

    invoke-interface {v8, v11}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    goto :goto_11

    .line 65
    :cond_1e
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v10, 0x0

    :cond_1f
    :goto_12
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_20

    .line 66
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/᩸᩶ۖ;

    .line 91
    iget-object v12, v11, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 67
    invoke-virtual {v8, v12}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1f

    .line 68
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    .line 69
    invoke-virtual {v5, v11}, Ll/ܽۙۖ;->ܽ(Ll/֫ۙۖ;)V

    .line 91
    iget-object v10, v11, Ll/ܰ᩶ۖ;->ۡ:Ll/۠᩶ۖ;

    .line 70
    check-cast v10, Ll/ᩳ᩶ۖ;

    .line 96
    iget-object v11, v11, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 70
    check-cast v11, Ll/ᩳ᩶ۖ;

    invoke-virtual {v3, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v10, 0x1

    goto :goto_12

    :cond_20
    if-eqz v10, :cond_23

    .line 281
    invoke-static {v3}, Ll/ܺۗۖ;->֫(Ljava/util/Map;)V

    .line 45
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_21
    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸᩶ۖ;

    .line 96
    iget-object v7, v6, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    .line 47
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/۠᩶ۖ;

    if-eqz v7, :cond_21

    .line 104
    iput-object v7, v6, Ll/ܰ᩶ۖ;->ܺ:Ll/۠᩶ۖ;

    goto :goto_13

    :cond_22
    const/4 v6, 0x1

    const/4 v7, 0x1

    goto/16 :goto_10

    .line 286
    :cond_23
    invoke-static {v2, v3, v4}, Ll/ܺۗۖ;->֫(Ljava/util/ArrayList;Ljava/util/HashMap;Ljava/util/HashSet;)V

    const/4 v5, 0x1

    goto/16 :goto_1

    :cond_24
    move/from16 v17, v7

    .line 289
    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_25

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩶ۖ;

    .line 290
    iget-object v4, v0, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    goto :goto_14

    .line 293
    :cond_25
    invoke-virtual {v3}, Ljava/util/HashMap;->size()I

    move-result v1

    if-lez v1, :cond_26

    .line 294
    iget-object v0, v0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    new-instance v1, Ll/ۢۗۖ;

    invoke-direct {v1, v3}, Ll/ۢۗۖ;-><init>(Ljava/util/HashMap;)V

    .line 421
    invoke-virtual {v0}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object v0

    :goto_15
    if-eqz v0, :cond_26

    const/4 v2, 0x1

    .line 422
    invoke-static {v0, v1, v2}, Ll/ܶۙۖ;->ۧ(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V

    .line 421
    invoke-virtual {v0}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v0

    goto :goto_15

    :cond_26
    return v7
.end method
