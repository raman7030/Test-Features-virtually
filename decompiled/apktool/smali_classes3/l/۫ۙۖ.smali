.class public final Ll/۫ۙۖ;
.super Ljava/lang/Object;
.source "C5XL"


# static fields
.field public static final ܽ:Ljava/util/Comparator;


# instance fields
.field public final ֫:Ll/֡ۛۡ;

.field public final ۧ:Ll/֡ۛۡ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 62
    new-instance v0, Ll/ۗۙۖ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۫ۙۖ;->ܽ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    new-instance v0, Ll/֡ۛۡ;

    invoke-direct {v0}, Ll/֡ۛۡ;-><init>()V

    iput-object v0, p0, Ll/۫ۙۖ;->ۧ:Ll/֡ۛۡ;

    .line 53
    new-instance v0, Ll/֡ۛۡ;

    const/16 v1, 0xc8

    invoke-direct {v0, v1}, Ll/֡ۛۡ;-><init>(I)V

    iput-object v0, p0, Ll/۫ۙۖ;->֫:Ll/֡ۛۡ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۚ᩹ۖ;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 194
    iget-object v2, v1, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_0

    return-void

    .line 197
    :cond_0
    new-instance v3, Ll/֫۬ۖ;

    .line 77
    invoke-direct {v3, v1}, Ll/۟ۗۖ;-><init>(Ll/ۚ᩹ۖ;)V

    .line 198
    invoke-virtual {v3}, Ll/۟ۗۖ;->ۧ()V

    .line 201
    invoke-virtual {v3}, Ll/֫۬ۖ;->ܳ()I

    move-result v3

    .line 202
    new-array v4, v3, [Ll/۬ۙۖ;

    .line 203
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/ᩳ᩶ۖ;

    .line 204
    new-instance v8, Ll/۬ۙۖ;

    invoke-direct {v8}, Ll/۬ۙۖ;-><init>()V

    .line 205
    iget-object v9, v6, Ll/۠᩶ۖ;->᩶:Ljava/lang/String;

    invoke-virtual {v9, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v9, 0x5b

    if-ne v7, v9, :cond_1

    const/16 v7, 0x4c

    .line 209
    :cond_1
    iput-char v7, v8, Ll/۬ۙۖ;->ᩳ:C

    .line 210
    iput-object v8, v6, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    .line 211
    iget v6, v6, Ll/ᩳ᩶ۖ;->ۗ:I

    aput-object v8, v4, v6

    goto :goto_0

    .line 76
    :cond_2
    iget-boolean v5, v1, Ll/ۚ᩹ۖ;->ۧ:Z

    if-eqz v5, :cond_3

    .line 77
    iget-object v5, v1, Ll/ۚ᩹ۖ;->֫:[Ljava/lang/String;

    array-length v5, v5

    new-array v5, v5, [Ll/۬ۙۖ;

    goto :goto_1

    .line 79
    :cond_3
    iget-object v5, v1, Ll/ۚ᩹ۖ;->֫:[Ljava/lang/String;

    array-length v5, v5

    add-int/lit8 v5, v5, 0x1

    new-array v5, v5, [Ll/۬ۙۖ;

    .line 82
    :goto_1
    new-instance v6, Ljava/util/HashSet;

    invoke-direct {v6}, Ljava/util/HashSet;-><init>()V

    .line 83
    iget-object v7, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v7}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_e

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/֫ۙۖ;

    .line 84
    iget-object v9, v8, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v10, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-eq v9, v10, :cond_5

    sget-object v10, Ll/۟᩶ۖ;->۬:Ll/۟᩶ۖ;

    if-ne v9, v10, :cond_4

    .line 85
    :cond_5
    invoke-virtual {v8}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v9

    iget-object v9, v9, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v10, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v9, v10, :cond_4

    .line 86
    invoke-virtual {v8}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v9

    check-cast v9, Ll/ᩳ᩶ۖ;

    .line 87
    invoke-virtual {v8}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v10

    .line 88
    iget v9, v9, Ll/ᩳ᩶ۖ;->ۗ:I

    .line 89
    aget-object v11, v4, v9

    .line 92
    invoke-static {v8, v6}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;Ljava/util/HashSet;)V

    .line 93
    invoke-virtual {v6}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    :goto_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֫ۙۖ;

    .line 94
    iget-object v12, v12, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    check-cast v12, [Ll/ۧ۬ۖ;

    if-nez v12, :cond_7

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    .line 98
    :goto_4
    array-length v14, v12

    if-ge v13, v14, :cond_6

    if-ne v13, v9, :cond_8

    goto :goto_5

    .line 102
    :cond_8
    aget-object v14, v12, v13

    if-eqz v14, :cond_9

    .line 103
    iget-boolean v14, v14, Ll/ۧ۬ۖ;->ܽ:Z

    if-eqz v14, :cond_9

    .line 104
    aget-object v14, v4, v13

    .line 105
    iget-object v15, v11, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v15, v14}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 106
    iget-object v14, v14, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v14, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_9
    :goto_5
    add-int/lit8 v13, v13, 0x1

    goto :goto_4

    :cond_a
    const/4 v8, 0x0

    .line 110
    invoke-virtual {v6}, Ljava/util/HashSet;->clear()V

    .line 113
    iget-object v9, v10, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v12, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v9, v12, :cond_b

    .line 114
    move-object v9, v10

    check-cast v9, Ll/ᩳ᩶ۖ;

    iget v9, v9, Ll/ᩳ᩶ۖ;->ۗ:I

    aget-object v9, v4, v9

    .line 115
    iget-object v12, v11, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v12, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 116
    iget-object v9, v9, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v9, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 120
    :cond_b
    iget-object v9, v10, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v12, Ll/֨᩶ۖ;->ܿۧ:Ll/֨᩶ۖ;

    if-ne v9, v12, :cond_c

    .line 121
    aput-object v11, v5, v8

    goto/16 :goto_2

    .line 122
    :cond_c
    sget-object v8, Ll/֨᩶ۖ;->᩺֫:Ll/֨᩶ۖ;

    if-ne v9, v8, :cond_4

    .line 123
    check-cast v10, Ll/᩷᩶ۖ;

    iget v8, v10, Ll/᩷᩶ۖ;->ۗ:I

    .line 124
    iget-boolean v9, v1, Ll/ۚ᩹ۖ;->ۧ:Z

    if-eqz v9, :cond_d

    .line 125
    aput-object v11, v5, v8

    goto/16 :goto_2

    :cond_d
    add-int/lit8 v8, v8, 0x1

    .line 127
    aput-object v11, v5, v8

    goto/16 :goto_2

    :cond_e
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_6
    if-ge v7, v3, :cond_f

    .line 134
    aget-object v8, v4, v7

    .line 135
    iget-object v9, v8, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v9, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 136
    iget-object v9, v8, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v9, v8}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    .line 218
    :cond_f
    iget-boolean v7, v1, Ll/ۚ᩹ۖ;->ۧ:Z

    if-nez v7, :cond_11

    .line 219
    aget-object v7, v5, v6

    const/4 v8, 0x0

    :goto_7
    if-ge v8, v3, :cond_11

    .line 220
    aget-object v9, v4, v8

    if-ne v9, v7, :cond_10

    goto :goto_8

    .line 224
    :cond_10
    iget-object v10, v9, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v10, v7}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 225
    iget-object v10, v7, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v10, v9}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :goto_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_7

    .line 232
    :cond_11
    iget-boolean v7, v1, Ll/ۚ᩹ۖ;->ۧ:Z

    if-nez v7, :cond_12

    .line 233
    aget-object v6, v5, v6

    const/4 v7, 0x0

    iput v7, v6, Ll/۬ۙۖ;->ܽ:I

    const/4 v6, 0x1

    const/4 v7, 0x1

    goto :goto_9

    :cond_12
    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_9
    const/4 v8, 0x0

    .line 235
    :goto_a
    iget-object v9, v1, Ll/ۚ᩹ۖ;->֫:[Ljava/lang/String;

    array-length v10, v9

    if-ge v8, v10, :cond_16

    add-int/lit8 v10, v6, 0x1

    .line 236
    aget-object v6, v5, v6

    .line 237
    aget-object v9, v9, v8

    if-nez v6, :cond_13

    add-int/lit8 v7, v7, 0x1

    goto :goto_b

    :cond_13
    add-int/lit8 v11, v7, 0x1

    .line 241
    iput v7, v6, Ll/۬ۙۖ;->ܽ:I

    move v7, v11

    :goto_b
    const-string v6, "J"

    .line 243
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    const-string v6, "D"

    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_15

    :cond_14
    add-int/lit8 v7, v7, 0x1

    :cond_15
    add-int/lit8 v8, v8, 0x1

    move v6, v10

    goto :goto_a

    .line 249
    :cond_16
    iget-object v6, v0, Ll/۫ۙۖ;->ۧ:Ll/֡ۛۡ;

    invoke-virtual {v6}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map;

    if-nez v7, :cond_17

    .line 251
    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    :cond_17
    const/4 v8, 0x0

    .line 143
    :goto_c
    iget-object v9, v0, Ll/۫ۙۖ;->֫:Ll/֡ۛۡ;

    if-ge v8, v3, :cond_1e

    aget-object v10, v4, v8

    .line 144
    iget-char v11, v10, Ll/۬ۙۖ;->ᩳ:C

    .line 145
    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v12

    invoke-interface {v7, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/List;

    if-nez v12, :cond_19

    .line 147
    invoke-virtual {v9}, Ll/֡ۛۡ;->ᩳ()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    if-nez v9, :cond_18

    .line 149
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    :cond_18
    move-object v12, v9

    .line 151
    invoke-static {v11}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v9

    invoke-interface {v7, v9, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    :cond_19
    invoke-interface {v12, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 155
    iget-object v9, v10, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1a
    :goto_d
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1b

    .line 156
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۬ۙۖ;

    .line 157
    iget-char v11, v11, Ll/۬ۙۖ;->ᩳ:C

    iget-char v12, v10, Ll/۬ۙۖ;->ᩳ:C

    if-eq v11, v12, :cond_1a

    .line 158
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    goto :goto_d

    .line 161
    :cond_1b
    iget-object v9, v10, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v9}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_1c
    :goto_e
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_1d

    .line 162
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ll/۬ۙۖ;

    .line 163
    iget-char v11, v11, Ll/۬ۙۖ;->ᩳ:C

    iget-char v12, v10, Ll/۬ۙۖ;->ᩳ:C

    if-eq v11, v12, :cond_1c

    .line 164
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V

    goto :goto_e

    :cond_1d
    add-int/lit8 v8, v8, 0x1

    goto :goto_c

    .line 255
    :cond_1e
    new-instance v3, Ljava/util/BitSet;

    invoke-direct {v3}, Ljava/util/BitSet;-><init>()V

    .line 256
    new-instance v4, Ljava/util/BitSet;

    invoke-direct {v4}, Ljava/util/BitSet;-><init>()V

    .line 257
    new-instance v8, Ljava/util/BitSet;

    invoke-direct {v8}, Ljava/util/BitSet;-><init>()V

    .line 258
    new-instance v10, Ljava/util/BitSet;

    invoke-direct {v10}, Ljava/util/BitSet;-><init>()V

    .line 259
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_f
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_34

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/util/Map$Entry;

    .line 260
    invoke-interface {v12}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/List;

    .line 261
    sget-object v14, Ll/۫ۙۖ;->ܽ:Ljava/util/Comparator;

    invoke-static {v13, v14}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 262
    invoke-interface {v12}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Character;

    invoke-virtual {v12}, Ljava/lang/Character;->charValue()C

    move-result v12

    const/16 v14, 0x44

    const/16 v15, 0x4a

    if-eq v12, v15, :cond_20

    if-ne v12, v14, :cond_1f

    goto :goto_10

    :cond_1f
    const/4 v14, 0x0

    goto :goto_11

    :cond_20
    :goto_10
    const/4 v14, 0x1

    .line 264
    :goto_11
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_12
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_33

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll/۬ۙۖ;

    .line 265
    iget v0, v15, Ll/۬ۙۖ;->ܽ:I

    if-gez v0, :cond_30

    .line 171
    invoke-virtual {v3}, Ljava/util/BitSet;->clear()V

    .line 172
    iget-object v0, v15, Ll/۬ۙۖ;->֫:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v17, v0

    move-object/from16 v0, v16

    check-cast v0, Ll/۬ۙۖ;

    move-object/from16 v16, v11

    .line 173
    iget v11, v0, Ll/۬ۙۖ;->ܽ:I

    if-ltz v11, :cond_22

    .line 174
    invoke-virtual {v3, v11}, Ljava/util/BitSet;->set(I)V

    .line 175
    iget-char v11, v0, Ll/۬ۙۖ;->ᩳ:C

    move-object/from16 v18, v13

    const/16 v13, 0x4a

    if-eq v11, v13, :cond_21

    const/16 v13, 0x44

    if-ne v11, v13, :cond_23

    .line 176
    :cond_21
    iget v0, v0, Ll/۬ۙۖ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_14

    :cond_22
    move-object/from16 v18, v13

    :cond_23
    :goto_14
    move-object/from16 v11, v16

    move-object/from16 v0, v17

    move-object/from16 v13, v18

    goto :goto_13

    :cond_24
    move-object/from16 v16, v11

    move-object/from16 v18, v13

    .line 328
    array-length v0, v5

    const/4 v11, 0x0

    :goto_15
    if-ge v11, v0, :cond_28

    aget-object v13, v5, v11

    move/from16 v17, v0

    .line 329
    iget-char v0, v13, Ll/۬ۙۖ;->ᩳ:C

    if-eq v0, v12, :cond_26

    .line 330
    iget v0, v13, Ll/۬ۙۖ;->ܽ:I

    invoke-virtual {v3, v0}, Ljava/util/BitSet;->set(I)V

    .line 331
    iget-char v0, v13, Ll/۬ۙۖ;->ᩳ:C

    move-object/from16 v19, v5

    const/16 v5, 0x4a

    if-eq v0, v5, :cond_25

    const/16 v5, 0x44

    if-ne v0, v5, :cond_27

    .line 332
    :cond_25
    iget v0, v13, Ll/۬ۙۖ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v3, v0}, Ljava/util/BitSet;->set(I)V

    goto :goto_16

    :cond_26
    move-object/from16 v19, v5

    :cond_27
    :goto_16
    add-int/lit8 v11, v11, 0x1

    move/from16 v0, v17

    move-object/from16 v5, v19

    goto :goto_15

    :cond_28
    move-object/from16 v19, v5

    .line 270
    invoke-virtual {v3, v8}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 183
    invoke-virtual {v4}, Ljava/util/BitSet;->clear()V

    .line 184
    iget-object v0, v15, Ll/۬ۙۖ;->ۧ:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_29
    :goto_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/۬ۙۖ;

    .line 185
    iget v5, v5, Ll/۬ۙۖ;->ܽ:I

    if-ltz v5, :cond_29

    .line 186
    invoke-virtual {v4, v5}, Ljava/util/BitSet;->set(I)V

    goto :goto_17

    :cond_2a
    const/4 v0, 0x0

    .line 275
    :goto_18
    invoke-virtual {v4, v0}, Ljava/util/BitSet;->nextSetBit(I)I

    move-result v0

    if-ltz v0, :cond_2d

    if-eqz v14, :cond_2b

    .line 277
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-nez v5, :cond_2c

    add-int/lit8 v5, v0, 0x1

    invoke-virtual {v3, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-nez v5, :cond_2c

    .line 278
    iput v0, v15, Ll/۬ۙۖ;->ܽ:I

    goto :goto_19

    .line 282
    :cond_2b
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-nez v5, :cond_2c

    .line 283
    iput v0, v15, Ll/۬ۙۖ;->ܽ:I

    goto :goto_19

    :cond_2c
    add-int/lit8 v0, v0, 0x1

    goto :goto_18

    .line 288
    :cond_2d
    :goto_19
    iget v0, v15, Ll/۬ۙۖ;->ܽ:I

    if-gez v0, :cond_31

    if-eqz v14, :cond_2f

    const/4 v0, -0x1

    :cond_2e
    add-int/lit8 v0, v0, 0x1

    .line 293
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v0

    add-int/lit8 v5, v0, 0x1

    .line 294
    invoke-virtual {v3, v5}, Ljava/util/BitSet;->get(I)Z

    move-result v5

    if-nez v5, :cond_2e

    .line 295
    iput v0, v15, Ll/۬ۙۖ;->ܽ:I

    goto :goto_1a

    :cond_2f
    const/4 v0, 0x0

    .line 297
    invoke-virtual {v3, v0}, Ljava/util/BitSet;->nextClearBit(I)I

    move-result v0

    .line 298
    iput v0, v15, Ll/۬ۙۖ;->ܽ:I

    goto :goto_1a

    :cond_30
    move-object/from16 v19, v5

    move-object/from16 v16, v11

    move-object/from16 v18, v13

    .line 302
    :cond_31
    :goto_1a
    iget v0, v15, Ll/۬ۙۖ;->ܽ:I

    invoke-virtual {v10, v0}, Ljava/util/BitSet;->set(I)V

    if-eqz v14, :cond_32

    .line 304
    iget v0, v15, Ll/۬ۙۖ;->ܽ:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v10, v0}, Ljava/util/BitSet;->set(I)V

    :cond_32
    move-object/from16 v0, p0

    move-object/from16 v11, v16

    move-object/from16 v13, v18

    move-object/from16 v5, v19

    goto/16 :goto_12

    :cond_33
    move-object/from16 v19, v5

    move-object/from16 v16, v11

    .line 307
    invoke-virtual {v8, v10}, Ljava/util/BitSet;->or(Ljava/util/BitSet;)V

    .line 308
    invoke-virtual {v10}, Ljava/util/BitSet;->clear()V

    move-object/from16 v0, p0

    goto/16 :goto_f

    .line 311
    :cond_34
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_35

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩳ᩶ۖ;

    .line 312
    iget-object v4, v2, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    check-cast v4, Ll/۬ۙۖ;

    .line 313
    iget v4, v4, Ll/۬ۙۖ;->ܽ:I

    iput v4, v2, Ll/ᩳ᩶ۖ;->ۗ:I

    .line 314
    iput-object v3, v2, Ll/۠᩶ۖ;->᩹:Ljava/lang/Object;

    goto :goto_1b

    .line 316
    :cond_35
    iget-object v0, v1, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_36

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    .line 317
    iput-object v3, v1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    goto :goto_1c

    .line 319
    :cond_36
    invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_37

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    .line 320
    invoke-interface {v1}, Ljava/util/List;->clear()V

    .line 321
    invoke-virtual {v9, v1}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 323
    :cond_37
    invoke-interface {v7}, Ljava/util/Map;->clear()V

    .line 324
    invoke-virtual {v6, v7}, Ll/֡ۛۡ;->֫(Ljava/lang/Object;)Z

    return-void
.end method
