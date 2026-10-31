.class public final Ll/ۙ᩵ۜ;
.super Ljava/lang/Object;
.source "86KX"


# instance fields
.field public final ֫:Ljava/util/List;

.field public final ۧ:Z

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩵ۜ;->ܽ:Ljava/util/List;

    .line 29
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۙ᩵ۜ;->֫:Ljava/util/List;

    .line 30
    iput-boolean p3, p0, Ll/ۙ᩵ۜ;->ۧ:Z

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/util/TreeMap;)Ljava/util/List;
    .locals 3

    const-string v0, "/"

    .line 216
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 217
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/ۗ᩺ۡ;

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 219
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 220
    invoke-virtual {p1, p0}, Ljava/util/TreeMap;->tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    .line 221
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 224
    :cond_1
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static ֫(Ljava/util/Collection;Ljava/util/ArrayList;)Ll/ۙ᩵ۜ;
    .locals 16

    move-object/from16 v0, p1

    .line 92
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 93
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 94
    :goto_0
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    const-string v6, "/"

    if-ge v4, v5, :cond_4

    .line 95
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸᩵ۜ;

    .line 96
    invoke-static {v5}, Ll/᩸᩵ۜ;->᩻(Ll/᩸᩵ۜ;)Ll/᩶᩵ۜ;

    move-result-object v7

    sget-object v8, Ll/᩶᩵ۜ;->᩹:Ll/᩶᩵ۜ;

    if-ne v7, v8, :cond_0

    .line 98
    invoke-static {v5}, Ll/᩸᩵ۜ;->ܳ(Ll/᩸᩵ۜ;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    .line 99
    invoke-static {v4, v6}, Ll/ۙ᩵ۜ;->֫(ILjava/lang/String;)V

    .line 100
    invoke-static {v1, v6, v4}, Ll/ۙ᩵ۜ;->֫(Ljava/util/TreeMap;Ljava/lang/String;I)V

    goto :goto_1

    .line 103
    :cond_0
    invoke-static {v5}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ll/ۙ᩵ۜ;->֫(ILjava/lang/String;)V

    .line 104
    invoke-static {v5}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7, v4}, Ll/ۙ᩵ۜ;->֫(Ljava/util/TreeMap;Ljava/lang/String;I)V

    .line 105
    invoke-static {v5}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 106
    new-instance v7, Ll/۠᩵ۜ;

    invoke-static {v5}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v4}, Ll/۠᩵ۜ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 108
    :cond_1
    invoke-static {v5}, Ll/᩸᩵ۜ;->᩻(Ll/᩸᩵ۜ;)Ll/᩶᩵ۜ;

    move-result-object v7

    sget-object v8, Ll/᩶᩵ۜ;->ۙ:Ll/᩶᩵ۜ;

    if-ne v7, v8, :cond_3

    .line 109
    invoke-static {v5}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Ll/ۙ᩵ۜ;->֫(ILjava/lang/String;)V

    .line 110
    invoke-static {v5}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v7

    invoke-static {v5}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-ne v7, v8, :cond_2

    .line 114
    invoke-static {v5}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7, v4}, Ll/ۙ᩵ۜ;->֫(Ljava/util/TreeMap;Ljava/lang/String;I)V

    .line 115
    invoke-static {v5}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 116
    new-instance v6, Ll/۠᩵ۜ;

    invoke-static {v5}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5, v4}, Ll/۠᩵ۜ;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 111
    :cond_2
    invoke-static {v5}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "ZIP_ENTRY_TYPE_MISMATCH"

    const-string v2, "Renaming must preserve the trailing slash entry type."

    invoke-static {v1, v2, v0, v4}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    :cond_3
    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    .line 121
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۠᩵ۜ;

    .line 122
    iget-object v5, v4, Ll/۠᩵ۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/TreeMap;->tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    .line 123
    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v9, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_6

    goto :goto_3

    .line 126
    :cond_6
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    iget v10, v4, Ll/۠᩵ۜ;->֫:I

    if-ne v9, v10, :cond_7

    goto :goto_4

    .line 127
    :cond_7
    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    filled-new-array {v5, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v10, v1, v0}, Ll/ۙ᩵ۜ;->֫(I[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    .line 37
    :cond_8
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 38
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->size()I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    invoke-interface/range {p0 .. p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_a

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۗ᩺ۡ;

    .line 40
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v7, v5}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-virtual {v5}, Ll/ۗ᩺ۡ;->clone()Ll/ۗ᩺ۡ;

    move-result-object v5

    :cond_9
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 44
    :cond_a
    new-instance v4, Ll/᩻ܰۡ;

    .line 13
    invoke-direct {v4, v2}, Ll/֨᩺ۡ;-><init>(Ljava/util/Collection;)V

    .line 45
    new-instance v2, Ljava/util/TreeMap;

    invoke-direct {v2, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    .line 46
    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    .line 47
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 49
    :goto_6
    invoke-virtual/range {p1 .. p1}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v3, v8, :cond_1e

    .line 50
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩸᩵ۜ;

    .line 51
    invoke-static {v8}, Ll/᩸᩵ۜ;->᩻(Ll/᩸᩵ۜ;)Ll/᩶᩵ۜ;

    move-result-object v9

    sget-object v10, Ll/᩶᩵ۜ;->᩹:Ll/᩶᩵ۜ;

    const-string v11, "ZIP_ENTRY_ALREADY_EXISTS"

    const/4 v12, 0x0

    if-ne v9, v10, :cond_e

    .line 151
    invoke-static {v8}, Ll/᩸᩵ۜ;->ܳ(Ll/᩸᩵ۜ;)Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_1d

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    .line 152
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 153
    invoke-virtual {v13, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v14

    if-eqz v14, :cond_b

    .line 155
    invoke-interface {v1, v13}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    goto :goto_7

    .line 159
    :cond_b
    invoke-virtual {v1, v13}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۗ᩺ۡ;

    if-eqz v14, :cond_d

    .line 161
    invoke-static {v8}, Ll/᩸᩵ۜ;->ᩳ(Ll/᩸᩵ۜ;)Z

    move-result v15

    if-eqz v15, :cond_c

    .line 165
    new-instance v15, Ll/ܶ᩵ۜ;

    invoke-direct {v15, v14, v12}, Ll/ܶ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;)V

    invoke-virtual {v5, v13, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :cond_c
    const-string v0, "Adding this entry requires overwrite=true."

    .line 162
    filled-new-array {v13}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v0, v1, v3}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    .line 168
    :cond_d
    :goto_8
    new-instance v14, Ll/֨᩵ۜ;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-direct {v14, v3, v13, v10}, Ll/֨᩵ۜ;-><init>(ILjava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v7, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    .line 55
    :cond_e
    invoke-static {v8}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v9

    .line 56
    invoke-virtual {v9, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v10

    .line 57
    invoke-virtual {v1, v9}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_10

    if-eqz v10, :cond_f

    .line 211
    invoke-interface {v1, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_10

    invoke-virtual {v4, v9}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_f

    goto :goto_9

    :cond_f
    const-string v0, "The source entry does not exist in the original ZIP."

    .line 58
    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "ZIP_ENTRY_NOT_FOUND"

    invoke-static {v2, v0, v1, v3}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    .line 61
    :cond_10
    :goto_9
    invoke-static {v8}, Ll/᩸᩵ۜ;->᩻(Ll/᩸᩵ۜ;)Ll/᩶᩵ۜ;

    move-result-object v13

    sget-object v14, Ll/᩶᩵ۜ;->᩶:Ll/᩶᩵ۜ;

    if-ne v13, v14, :cond_13

    if-eqz v10, :cond_12

    .line 62
    invoke-static {v8}, Ll/᩸᩵ۜ;->ܿ(Ll/᩸᩵ۜ;)Z

    move-result v8

    if-nez v8, :cond_12

    invoke-virtual {v4, v9}, Ll/֨᩺ۡ;->ۧ(Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_11

    goto :goto_a

    :cond_11
    const-string v0, "Deleting a nonempty directory requires recursive=true."

    .line 63
    filled-new-array {v9}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "ZIP_DIRECTORY_NOT_EMPTY"

    invoke-static {v2, v0, v1, v3}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    .line 66
    :cond_12
    :goto_a
    invoke-static {v9, v2}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/util/TreeMap;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۗ᩺ۡ;

    .line 67
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v10

    new-instance v11, Ll/ܶ᩵ۜ;

    invoke-direct {v11, v9, v12}, Ll/ܶ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;)V

    invoke-virtual {v5, v10, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_b

    .line 177
    :cond_13
    invoke-static {v8}, Ll/᩸᩵ۜ;->֫(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v9

    .line 178
    invoke-static {v8}, Ll/᩸᩵ۜ;->ܽ(Ll/᩸᩵ۜ;)Ljava/lang/String;

    move-result-object v10

    .line 179
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    goto/16 :goto_11

    .line 182
    :cond_14
    invoke-virtual {v9, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_16

    .line 183
    invoke-virtual {v10, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v13

    if-nez v13, :cond_15

    goto :goto_c

    :cond_15
    const-string v0, "A directory cannot be moved into its own subtree."

    .line 184
    filled-new-array {v9, v10}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "ZIP_OPERATION_CONFLICT"

    invoke-static {v2, v0, v1, v3}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    :cond_16
    :goto_c
    if-eqz v12, :cond_19

    .line 211
    invoke-interface {v1, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_17

    invoke-virtual {v4, v10}, Ll/֨᩺ۡ;->֫(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v13

    if-eqz v13, :cond_19

    .line 187
    :cond_17
    invoke-static {v8}, Ll/᩸᩵ۜ;->ۧ(Ll/᩸᩵ۜ;)Z

    move-result v8

    if-eqz v8, :cond_18

    goto :goto_d

    :cond_18
    const-string v0, "An existing target directory requires mergeDirectories=true."

    .line 188
    filled-new-array {v9, v10}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v11, v0, v1, v3}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    .line 191
    :cond_19
    :goto_d
    invoke-static {v9, v2}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/util/TreeMap;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_e
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_1d

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/ۗ᩺ۡ;

    if-eqz v12, :cond_1a

    .line 0
    invoke-static {v10}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    .line 192
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v15, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_f

    :cond_1a
    move-object v0, v10

    .line 193
    :goto_f
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ll/ۗ᩺ۡ;

    if-eqz v14, :cond_1c

    .line 195
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->isDirectory()Z

    move-result v14

    if-eqz v14, :cond_1b

    .line 200
    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_1c

    .line 202
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v0

    new-instance v14, Ll/ܶ᩵ۜ;

    const/4 v15, 0x0

    invoke-direct {v14, v13, v15}, Ll/ܶ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;)V

    invoke-virtual {v5, v0, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_10

    .line 198
    :cond_1b
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    const-string v1, "The renamed entry collides with an original ZIP entry."

    .line 197
    invoke-static {v11, v1, v0, v3}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object v0

    throw v0

    .line 206
    :cond_1c
    invoke-virtual {v13}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ll/ܶ᩵ۜ;

    invoke-direct {v15, v13, v0}, Ll/ܶ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;)V

    invoke-virtual {v5, v14, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_10
    move-object/from16 v0, p1

    goto :goto_e

    :cond_1d
    :goto_11
    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, p1

    goto/16 :goto_6

    .line 74
    :cond_1e
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 75
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    .line 76
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1f
    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۗ᩺ۡ;

    .line 77
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܶ᩵ۜ;

    if-nez v4, :cond_20

    .line 79
    new-instance v4, Ll/ܶ᩵ۜ;

    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v3, v6}, Ll/ܶ᩵ۜ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 78
    :cond_20
    iget-object v6, v4, Ll/ܶ᩵ۜ;->ۧ:Ljava/lang/String;

    .line 81
    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v3, v3, 0x1

    or-int/2addr v2, v3

    if-eqz v6, :cond_1f

    .line 83
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    .line 87
    :cond_21
    new-instance v1, Ll/ۙ᩵ۜ;

    invoke-direct {v1, v0, v7, v2}, Ll/ۙ᩵ۜ;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V

    return-object v1
.end method

.method public static varargs ֫(I[Ljava/lang/String;I)Ll/᩹᩵ۜ;
    .locals 2

    .line 234
    invoke-static {p0, p2}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p0, p2}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Integer;

    const/4 v1, 0x0

    aput-object v0, p2, v1

    const/4 v0, 0x1

    aput-object p0, p2, v0

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    .line 235
    new-instance p2, Ll/᩹᩵ۜ;

    const-string v0, "Operations touch the same entry or directory range."

    .line 236
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    const-string v1, "ZIP_OPERATION_CONFLICT"

    invoke-direct {p2, v1, v0, p0, p1}, Ll/᩹᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object p2
.end method

.method public static varargs ֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;
    .locals 1

    .line 230
    new-instance v0, Ll/᩹᩵ۜ;

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p0, p1, p3, p2}, Ll/᩹᩵ۜ;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_1

    .line 141
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    if-nez p1, :cond_2

    const-string p1, ""

    .line 143
    :cond_2
    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const-string v0, "ZIP_INVALID_ENTRY_PATH"

    const-string v1, "An update entry path must not be empty."

    .line 142
    invoke-static {v0, v1, p1, p0}, Ll/ۙ᩵ۜ;->֫(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object p0

    throw p0
.end method

.method public static ֫(Ljava/util/TreeMap;Ljava/lang/String;I)V
    .locals 1

    .line 134
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_1

    .line 135
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p2, :cond_0

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1, p2}, Ll/ۙ᩵ۜ;->֫(I[Ljava/lang/String;I)Ll/᩹᩵ۜ;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method
