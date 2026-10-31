.class public final Ll/ۛۖܺ;
.super Ljava/lang/Object;
.source "D1JP"


# static fields
.field public static ֫:Ll/᩻ۡܺ; = null

.field public static ۧ:Z = true


# direct methods
.method public static ֫(Ll/۬ۡܺ;IZ)Ll/۬ۡܺ;
    .locals 3

    .line 75
    const-class v0, Ll/ۤۖܺ;

    .line 76
    invoke-static {v0}, Ljava/util/EnumSet;->allOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 98
    sput-boolean p2, Ll/ۛۖܺ;->ۧ:Z

    .line 99
    sget-object p2, Ll/᩻ۡܺ;->֫:Ll/᩻ۡܺ;

    sput-object p2, Ll/ۛۖܺ;->֫:Ll/᩻ۡܺ;

    .line 101
    invoke-static {p0, p1}, Ll/ᩳۘܺ;->֫(Ll/۬ۡܺ;I)Ll/᩷ۘܺ;

    move-result-object p2

    .line 102
    invoke-static {p2, v0}, Ll/ۛۖܺ;->֫(Ll/᩷ۘܺ;Ljava/util/EnumSet;)V

    const/4 v1, 0x0

    .line 104
    invoke-static {p2, v1}, Ll/ۤۘܺ;->֫(Ll/᩷ۘܺ;Z)Ll/۬ۡܺ;

    move-result-object p2

    .line 106
    invoke-virtual {p2}, Ll/۬ۡܺ;->֫()Ll/ܿۡܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܿۡܺ;->᩸()I

    move-result v1

    sget-object v2, Ll/ۛۖܺ;->֫:Ll/᩻ۡܺ;

    .line 107
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v2, 0x10

    if-le v1, v2, :cond_0

    .line 136
    invoke-static {p0, p1}, Ll/ᩳۘܺ;->֫(Ll/۬ۡܺ;I)Ll/᩷ۘܺ;

    move-result-object p0

    .line 139
    invoke-virtual {v0}, Ljava/util/EnumSet;->clone()Ljava/util/EnumSet;

    move-result-object p1

    .line 145
    sget-object p2, Ll/ۤۖܺ;->᩹:Ll/ۤۖܺ;

    invoke-virtual {p1, p2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 147
    invoke-static {p0, p1}, Ll/ۛۖܺ;->֫(Ll/᩷ۘܺ;Ljava/util/EnumSet;)V

    const/4 p1, 0x1

    .line 149
    invoke-static {p0, p1}, Ll/ۤۘܺ;->֫(Ll/᩷ۘܺ;Z)Ll/۬ۡܺ;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p2
.end method

.method public static ֫()Ll/᩻ۡܺ;
    .locals 1

    .line 55
    sget-object v0, Ll/ۛۖܺ;->֫:Ll/᩻ۡܺ;

    return-object v0
.end method

.method public static ֫(Ll/᩷ۘܺ;Ljava/util/EnumSet;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 157
    sget-object v2, Ll/ۤۖܺ;->ۗ:Ll/ۤۖܺ;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 158
    invoke-static/range {p0 .. p0}, Ll/۬ۖܺ;->֫(Ll/᩷ۘܺ;)V

    .line 161
    :cond_0
    sget-object v2, Ll/ۤۖܺ;->۬:Ll/ۤۖܺ;

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 162
    invoke-static/range {p0 .. p0}, Ll/֫ۘܺ;->֫(Ll/᩷ۘܺ;)V

    .line 163
    invoke-static/range {p0 .. p0}, Ll/ۜۖܺ;->֫(Ll/᩷ۘܺ;)V

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    const/4 v2, 0x1

    .line 167
    :goto_0
    sget-object v3, Ll/ۤۖܺ;->ۙ:Ll/ۤۖܺ;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 168
    invoke-static/range {p0 .. p0}, Ll/᩸ۖܺ;->֫(Ll/᩷ۘܺ;)V

    .line 169
    invoke-static/range {p0 .. p0}, Ll/ۜۖܺ;->֫(Ll/᩷ۘܺ;)V

    const/4 v2, 0x0

    .line 176
    :cond_2
    sget-object v3, Ll/ۤۖܺ;->᩶:Ll/ۤۖܺ;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 177
    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 178
    invoke-static/range {p0 .. p0}, Ll/֨ۖܺ;->֫(Ll/᩷ۘܺ;)V

    .line 179
    invoke-static/range {p0 .. p0}, Ll/ۜۖܺ;->֫(Ll/᩷ۘܺ;)V

    const/4 v2, 0x0

    .line 183
    :cond_3
    sget-object v3, Ll/ۤۖܺ;->᩹:Ll/ۤۖܺ;

    invoke-virtual {v1, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_18

    .line 79
    new-instance v1, Ll/ܳۖܺ;

    .line 88
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 96
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v2

    .line 163
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ۜ()I

    move-result v3

    .line 165
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 172
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/4 v7, 0x1

    if-ge v6, v3, :cond_b

    .line 177
    invoke-virtual {v0, v6}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v8

    if-eqz v8, :cond_a

    .line 179
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v9

    if-nez v9, :cond_4

    goto :goto_2

    .line 181
    :cond_4
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v9

    .line 182
    invoke-virtual {v9}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v10

    .line 184
    invoke-interface {v10}, Ll/֫ۖܺ;->ۡ()Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_2

    .line 186
    :cond_5
    check-cast v10, Ll/ۛܺܺ;

    .line 189
    invoke-virtual {v8}, Ll/ܳۘܺ;->ۜ()Ll/ۗۡܺ;

    move-result-object v11

    invoke-virtual {v11}, Ll/ۗۡܺ;->ᩳ()I

    move-result v11

    const/16 v12, 0x38

    if-ne v11, v12, :cond_6

    .line 190
    invoke-virtual {v8}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v8

    invoke-virtual {v8}, Ll/ܽۘܺ;->᩻()Ljava/util/BitSet;

    move-result-object v8

    invoke-virtual {v8, v5}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v8

    .line 192
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ۧ()Ljava/util/ArrayList;

    move-result-object v11

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܽۘܺ;

    invoke-virtual {v8}, Ll/ܽۘܺ;->ܽ()Ljava/util/ArrayList;

    move-result-object v8

    .line 0
    invoke-static {v8, v7}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v8

    .line 193
    check-cast v8, Ll/ܳۘܺ;

    .line 196
    :cond_6
    invoke-virtual {v8}, Ll/ܳۘܺ;->ܽ()Z

    move-result v8

    if-eqz v8, :cond_7

    goto :goto_2

    .line 217
    :cond_7
    invoke-virtual {v0, v9}, Ll/᩷ۘܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_2

    .line 230
    :cond_8
    invoke-virtual {v4, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    if-nez v8, :cond_9

    .line 232
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 234
    :cond_9
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    add-int/2addr v8, v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4, v10, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 239
    :cond_b
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 240
    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    .line 241
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    if-le v8, v7, :cond_c

    .line 242
    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ۛܺܺ;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 247
    :cond_d
    new-instance v5, Ll/ᩳۖܺ;

    invoke-direct {v5, v4}, Ll/ᩳۖܺ;-><init>(Ljava/util/HashMap;)V

    invoke-static {v3, v5}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 101
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    const/4 v5, 0x5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    .line 103
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ܽ()Ll/ܽۘܺ;

    move-result-object v5

    .line 106
    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6, v4}, Ljava/util/HashMap;-><init>(I)V

    const/4 v8, 0x0

    :goto_4
    if-ge v8, v4, :cond_f

    .line 110
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۛܺܺ;

    .line 112
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ܺ()I

    move-result v10

    invoke-static {v10, v9}, Ll/᩸ۡܺ;->֫(ILl/֫ۖܺ;)Ll/᩸ۡܺ;

    move-result-object v15

    .line 114
    invoke-static {v9}, Ll/۫ۡܺ;->֫(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v11

    .line 116
    invoke-virtual {v11}, Ll/ۗۡܺ;->ۧ()I

    move-result v10

    if-ne v10, v7, :cond_e

    .line 117
    new-instance v14, Ll/ۚۡܺ;

    .line 118
    invoke-static {v9}, Ll/۫ۡܺ;->֫(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v11

    sget-object v12, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    sget-object v16, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    move-object v10, v14

    move-object v13, v15

    move-object v7, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v15

    move-object v15, v9

    invoke-direct/range {v10 .. v15}, Ll/ۚۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;Ll/ܰۡܺ;)V

    .line 117
    invoke-virtual {v5, v7}, Ll/ܽۘܺ;->֫(Ll/ܺۡܺ;)V

    move-object/from16 v19, v3

    move/from16 v20, v4

    move-object/from16 v17, v5

    move-object/from16 v10, v16

    goto :goto_5

    :cond_e
    move-object/from16 v16, v15

    .line 123
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->ܽ()Ll/ܽۘܺ;

    move-result-object v7

    .line 125
    invoke-virtual {v7}, Ll/ܽۘܺ;->ۜ()Ll/ܽۘܺ;

    move-result-object v15

    .line 129
    invoke-virtual {v7, v15}, Ll/ܽۘܺ;->ܽ(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object v7

    .line 131
    new-instance v14, Ll/ۨۡܺ;

    sget-object v13, Ll/ۤۡܺ;->ᩳ:Ll/ۤۡܺ;

    sget-object v12, Ll/᩶ۡܺ;->᩶:Ll/᩶ۡܺ;

    sget-object v17, Ll/ܰܺܺ;->᩺:Ll/ܰܺܺ;

    move-object v10, v14

    move-object/from16 v18, v12

    move-object v12, v13

    move-object/from16 v19, v3

    move-object v3, v13

    move-object/from16 v13, v18

    move/from16 v20, v4

    move-object v4, v14

    move-object/from16 v14, v17

    move-object/from16 v17, v5

    move-object v5, v15

    move-object v15, v9

    invoke-direct/range {v10 .. v15}, Ll/ۨۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩶ۡܺ;Ll/ۧۖܺ;Ll/ܰۡܺ;)V

    invoke-virtual {v7, v4}, Ll/ܽۘܺ;->ۧ(Ll/ܺۡܺ;)V

    .line 139
    invoke-virtual {v7, v5}, Ll/ܽۘܺ;->ܽ(Ll/ܽۘܺ;)Ll/ܽۘܺ;

    move-result-object v4

    .line 140
    new-instance v5, Ll/֨ۡܺ;

    .line 142
    invoke-virtual/range {v16 .. v16}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v7

    invoke-static {v7}, Ll/۫ۡܺ;->ᩳ(Ll/֫ۖܺ;)Ll/ۗۡܺ;

    move-result-object v7

    move-object/from16 v10, v16

    move-object/from16 v11, v18

    invoke-direct {v5, v7, v3, v10, v11}, Ll/֨ۡܺ;-><init>(Ll/ۗۡܺ;Ll/ۤۡܺ;Ll/᩸ۡܺ;Ll/᩶ۡܺ;)V

    .line 146
    invoke-virtual {v4, v5}, Ll/ܽۘܺ;->֫(Ll/ܺۡܺ;)V

    .line 149
    :goto_5
    invoke-virtual {v6, v9, v10}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    move-object/from16 v5, v17

    move-object/from16 v3, v19

    move/from16 v4, v20

    const/4 v7, 0x1

    goto/16 :goto_4

    .line 336
    :cond_f
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 339
    invoke-virtual/range {p0 .. p0}, Ll/᩷ۘܺ;->᩷()[Ljava/util/ArrayList;

    move-result-object v3

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v2, :cond_17

    .line 342
    invoke-virtual {v0, v4}, Ll/᩷ۘܺ;->ܽ(I)Ll/ܳۘܺ;

    move-result-object v5

    if-nez v5, :cond_11

    :cond_10
    :goto_7
    const/4 v10, 0x1

    goto :goto_9

    .line 348
    :cond_11
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v7

    .line 349
    invoke-virtual {v5}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v5

    invoke-virtual {v5}, Ll/᩸ۡܺ;->֡()Ll/֫ۖܺ;

    move-result-object v5

    .line 351
    invoke-interface {v5}, Ll/֫ۖܺ;->ۡ()Z

    move-result v8

    if-nez v8, :cond_12

    goto :goto_7

    .line 353
    :cond_12
    check-cast v5, Ll/ۛܺܺ;

    .line 354
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸ۡܺ;

    if-nez v5, :cond_13

    goto :goto_7

    .line 360
    :cond_13
    invoke-virtual {v0, v7}, Ll/᩷ۘܺ;->֫(Ll/᩸ۡܺ;)Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_7

    .line 379
    :cond_14
    new-instance v8, Ll/ܿۖܺ;

    invoke-direct {v8, v1, v7, v5}, Ll/ܿۖܺ;-><init>(Ll/ܳۖܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V

    .line 396
    invoke-virtual {v7}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v5

    aget-object v5, v3, v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_10

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܳۘܺ;

    .line 397
    invoke-virtual {v7}, Ll/ܳۘܺ;->ܽ()Z

    move-result v9

    if-eqz v9, :cond_15

    .line 398
    invoke-virtual {v7}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v9

    invoke-virtual {v9}, Ll/ܽۘܺ;->ۘ()Ljava/util/BitSet;

    move-result-object v9

    invoke-virtual {v9}, Ljava/util/BitSet;->cardinality()I

    move-result v9

    const/4 v10, 0x1

    if-le v9, v10, :cond_16

    goto :goto_8

    :cond_15
    const/4 v10, 0x1

    .line 401
    :cond_16
    invoke-virtual {v7, v8}, Ll/ܳۘܺ;->ۧ(Ll/ۗۘۢ;)V

    goto :goto_8

    :goto_9
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 185
    :cond_17
    invoke-static/range {p0 .. p0}, Ll/ۜۖܺ;->֫(Ll/᩷ۘܺ;)V

    const/4 v2, 0x0

    :cond_18
    if-eqz v2, :cond_19

    .line 191
    invoke-static/range {p0 .. p0}, Ll/ۜۖܺ;->֫(Ll/᩷ۘܺ;)V

    .line 194
    :cond_19
    invoke-static/range {p0 .. p0}, Ll/۟ۖܺ;->֫(Ll/᩷ۘܺ;)V

    return-void
.end method

.method public static ۧ()Z
    .locals 1

    .line 48
    sget-boolean v0, Ll/ۛۖܺ;->ۧ:Z

    return v0
.end method
