.class public final Ll/ܶۙۖ;
.super Ljava/lang/Object;
.source "262Q"


# direct methods
.method public static ֫(Ll/֫ۙۖ;Ljava/util/HashSet;)V
    .locals 4

    .line 439
    iget-object v0, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v0}, Ll/۟᩶ۖ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 440
    move-object v1, p0

    check-cast v1, Ll/ۗ᩶ۖ;

    invoke-interface {v1}, Ll/ۗ᩶ۖ;->֫()Ll/۬᩶ۖ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 442
    :cond_0
    invoke-virtual {v0}, Ll/۟᩶ۖ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 443
    invoke-virtual {p0}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 445
    :cond_1
    invoke-virtual {v0}, Ll/۟᩶ۖ;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 446
    move-object v0, p0

    check-cast v0, Ll/᩹᩶ۖ;

    .line 447
    iget-object v1, v0, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    invoke-virtual {p1, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 449
    iget-object v0, v0, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 450
    invoke-virtual {p1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 453
    :cond_2
    iget-object p0, p0, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    if-eqz p0, :cond_3

    .line 454
    invoke-interface {p1, p0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_3
    return-void
.end method

.method public static ֫(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V
    .locals 3

    .line 386
    sget-object v0, Ll/ᩴۙۖ;->֫:[I

    iget-object v1, p0, Ll/֫ۙۖ;->ۧ:Ll/֡᩹ۖ;

    iget-object v2, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 402
    sget-object p2, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v2, p2, :cond_1

    .line 403
    check-cast p0, Ll/۬᩶ۖ;

    .line 404
    iget-object p0, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    .line 405
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩸᩶ۖ;

    const/4 v0, 0x0

    .line 406
    invoke-static {p2, p1, v0}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    .line 391
    :cond_2
    invoke-virtual {p0}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p2

    .line 392
    iget-object v0, p2, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_4

    sget-object v0, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-eq v2, v0, :cond_3

    sget-object v0, Ll/۟᩶ۖ;->۬:Ll/۟᩶ۖ;

    if-ne v2, v0, :cond_4

    .line 393
    :cond_3
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    .line 394
    check-cast p2, Ll/ᩳ᩶ۖ;

    check-cast p0, Ll/᩸᩶ۖ;

    invoke-interface {p1, p2, p0}, Ll/ۚۙۖ;->֫(Ll/ᩳ᩶ۖ;Ll/᩸᩶ۖ;)Ll/ᩳ᩶ۖ;

    return-void

    .line 396
    :cond_4
    invoke-virtual {p0}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    .line 397
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    return-void

    .line 388
    :cond_5
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    return-void
.end method

.method public static ֫(Ll/ۚ᩹ۖ;)V
    .locals 9

    .line 130
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    const/4 v2, 0x0

    .line 131
    iput-object v2, v1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 132
    iput-object v2, v1, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    .line 133
    iget-object v2, v1, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    if-nez v2, :cond_0

    .line 134
    new-instance v2, Ljava/util/TreeSet;

    iget-object v3, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-direct {v2, v3}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    iput-object v2, v1, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    goto :goto_0

    .line 136
    :cond_0
    invoke-virtual {v2}, Ljava/util/TreeSet;->clear()V

    goto :goto_0

    .line 140
    :cond_1
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    .line 141
    iget-object v3, v1, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v3}, Ll/۟᩶ۖ;->֫()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 142
    move-object v4, v1

    check-cast v4, Ll/ۗ᩶ۖ;

    invoke-interface {v4}, Ll/ۗ᩶ۖ;->֫()Ll/۬᩶ۖ;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_1

    .line 294
    :cond_3
    iget-object v4, v4, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v4, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 144
    :cond_4
    :goto_1
    invoke-virtual {v3}, Ll/۟᩶ۖ;->ۧ()Z

    move-result v4

    if-eqz v4, :cond_6

    .line 145
    invoke-virtual {v1}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v4

    if-nez v4, :cond_5

    goto :goto_2

    .line 294
    :cond_5
    iget-object v4, v4, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v4, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 147
    :cond_6
    :goto_2
    invoke-virtual {v3}, Ll/۟᩶ۖ;->ܿ()Z

    move-result v3

    if-eqz v3, :cond_2

    .line 148
    move-object v3, v1

    check-cast v3, Ll/᩹᩶ۖ;

    .line 149
    iget-object v4, v3, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    if-nez v4, :cond_7

    goto :goto_3

    .line 294
    :cond_7
    iget-object v4, v4, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v4, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 150
    :goto_3
    iget-object v3, v3, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v4, v3

    :goto_4
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    if-nez v5, :cond_8

    goto :goto_5

    .line 294
    :cond_8
    iget-object v5, v5, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v5, v1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 159
    :cond_9
    iget-object v0, p0, Ll/ۚ᩹ۖ;->᩷:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۙ᩹ۖ;

    .line 160
    iget-object v2, v1, Ll/ۙ᩹ۖ;->ܽ:Ll/۬᩶ۖ;

    :goto_6
    iget-object v3, v1, Ll/ۙ᩹ۖ;->֫:Ll/۬᩶ۖ;

    if-eq v2, v3, :cond_a

    .line 161
    invoke-static {v2}, Ll/ܶۙۖ;->֫(Ll/֫ۙۖ;)Z

    move-result v3

    if-eqz v3, :cond_d

    .line 162
    iget-object v3, v2, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    if-nez v3, :cond_b

    .line 164
    new-instance v3, Ljava/util/TreeSet;

    iget-object v4, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-direct {v3, v4}, Ljava/util/TreeSet;-><init>(Ljava/util/Comparator;)V

    .line 165
    iput-object v3, v2, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    .line 167
    :cond_b
    iget-object v4, v1, Ll/ۙ᩹ۖ;->ۧ:[Ll/۬᩶ۖ;

    array-length v5, v4

    const/4 v6, 0x0

    :goto_7
    if-ge v6, v5, :cond_d

    aget-object v7, v4, v6

    if-nez v7, :cond_c

    goto :goto_8

    .line 294
    :cond_c
    iget-object v8, v7, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v8, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 169
    :goto_8
    invoke-interface {v3, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    .line 160
    :cond_d
    invoke-virtual {v2}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v2

    goto :goto_6

    :cond_e
    return-void
.end method

.method public static ֫(Ll/ۚ᩹ۖ;Ll/᩵ۙۖ;)V
    .locals 4

    .line 182
    iget-object v0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {v0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    const/4 v2, 0x0

    .line 183
    iput-boolean v2, v1, Ll/֫ۙۖ;->ۢ:Z

    goto :goto_0

    .line 185
    :cond_0
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 186
    iget-object p0, p0, Ll/ۚ᩹ۖ;->ۜ:Ll/ܽۙۖ;

    invoke-virtual {p0}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 187
    :cond_1
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_7

    .line 188
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/֫ۙۖ;

    .line 189
    iget-boolean v1, p0, Ll/֫ۙۖ;->ۢ:Z

    iget-object v2, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    if-eqz v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    .line 192
    iput-boolean v1, p0, Ll/֫ۙۖ;->ۢ:Z

    .line 194
    iget-object v1, p0, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    if-eqz v1, :cond_3

    .line 195
    invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۬᩶ۖ;

    .line 196
    invoke-virtual {v0, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_4

    .line 200
    invoke-interface {p1, p0}, Ll/᩵ۙۖ;->֫(Ll/֫ۙۖ;)V

    .line 202
    :cond_4
    invoke-virtual {v2}, Ll/۟᩶ۖ;->ܿ()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 203
    move-object v1, p0

    check-cast v1, Ll/᩹᩶ۖ;

    .line 204
    iget-object v3, v1, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    invoke-static {v0, v3}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 205
    iget-object v1, v1, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    .line 206
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 208
    :cond_5
    invoke-virtual {v2}, Ll/۟᩶ۖ;->֫()Z

    move-result v1

    if-eqz v1, :cond_6

    .line 209
    move-object v1, p0

    check-cast v1, Ll/ۗ᩶ۖ;

    invoke-interface {v1}, Ll/ۗ᩶ۖ;->֫()Ll/۬᩶ۖ;

    move-result-object v1

    .line 210
    invoke-virtual {v0, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 212
    :cond_6
    invoke-virtual {v2}, Ll/۟᩶ۖ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 213
    invoke-virtual {p0}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object p0

    .line 214
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    return-void
.end method

.method public static ֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V
    .locals 2

    .line 334
    sget-object v0, Ll/ᩴۙۖ;->֫:[I

    iget-object v1, p0, Ll/۠᩶ۖ;->᩸:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 336
    :cond_0
    iget-object v0, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_2

    .line 337
    check-cast p0, Ll/ᩳ᩶ۖ;

    invoke-interface {p1, p0}, Ll/֨ۙۖ;->֫(Ll/ᩳ᩶ۖ;)Ll/۠᩶ۖ;

    return-void

    .line 348
    :cond_1
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object p0

    const/4 v0, 0x0

    .line 349
    :goto_0
    array-length v1, p0

    if-ge v0, v1, :cond_2

    .line 350
    aget-object v1, p0, v0

    invoke-static {v1, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void

    .line 344
    :cond_3
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    .line 345
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    return-void

    .line 341
    :cond_4
    invoke-virtual {p0}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0, p1}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;Ll/۠ۙۖ;)V

    return-void
.end method

.method public static ֫(Ll/ܽۙۖ;Ll/֡ۙۖ;)V
    .locals 11

    .line 220
    invoke-virtual {p0}, Ll/ܽۙۖ;->ۧ()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_4

    .line 224
    :cond_0
    invoke-virtual {p0}, Ll/ܽۙۖ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    .line 225
    iput-boolean v3, v1, Ll/֫ۙۖ;->ۢ:Z

    .line 226
    iput-object v2, v1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    goto :goto_0

    .line 229
    :cond_1
    new-instance v0, Ljava/util/Stack;

    invoke-direct {v0}, Ljava/util/Stack;-><init>()V

    .line 230
    invoke-virtual {p0}, Ll/ܽۙۖ;->getFirst()Ll/֫ۙۖ;

    move-result-object p0

    .line 232
    iget-object v1, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    sget-object v3, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v1}, Ljava/util/TreeSet;->size()I

    move-result v1

    if-lez v1, :cond_2

    .line 56
    new-instance v2, Ll/ۤ᩶ۖ;

    invoke-direct {v2}, Ll/ۤ᩶ۖ;-><init>()V

    .line 239
    iget-object v1, p0, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {v1, v2}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    .line 241
    :cond_2
    invoke-virtual {v0, p0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 242
    invoke-interface {p1}, Ll/֡ۙۖ;->֫()Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 244
    :cond_3
    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_9

    .line 245
    invoke-virtual {v0}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֫ۙۖ;

    if-eqz v1, :cond_3

    .line 246
    iget-object v3, v1, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    iget-boolean v4, v1, Ll/֫ۙۖ;->ۢ:Z

    if-eqz v4, :cond_4

    goto :goto_1

    :cond_4
    const/4 v4, 0x1

    .line 249
    iput-boolean v4, v1, Ll/֫ۙۖ;->ۢ:Z

    .line 252
    iget-object v4, v1, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 254
    iget-object v5, v1, Ll/֫ۙۖ;->ܽ:Ljava/util/TreeSet;

    if-eqz v5, :cond_5

    .line 255
    invoke-virtual {v5}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۬᩶ۖ;

    .line 256
    iget-object v7, v6, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    invoke-interface {p1, v4, v7, v1, v6}, Ll/֡ۙۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v6, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 257
    invoke-virtual {v0, v6}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 261
    :cond_5
    invoke-interface {p1, v4, v1}, Ll/֡ۙۖ;->֫(Ljava/lang/Object;Ll/֫ۙۖ;)Ljava/lang/Object;

    move-result-object v4

    .line 263
    invoke-virtual {v3}, Ll/۟᩶ۖ;->ܿ()Z

    move-result v5

    if-eqz v5, :cond_7

    .line 264
    move-object v5, v1

    check-cast v5, Ll/᩹᩶ۖ;

    .line 265
    iget-object v6, v5, Ll/᩹᩶ۖ;->ۖ:[Ll/۬᩶ۖ;

    array-length v7, v6

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_6

    aget-object v9, v6, v8

    .line 266
    iget-object v10, v9, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    invoke-interface {p1, v4, v10, v1, v9}, Ll/֡ۙۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;

    move-result-object v10

    iput-object v10, v9, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 267
    invoke-virtual {v0, v9}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 269
    :cond_6
    iget-object v5, v5, Ll/᩹᩶ۖ;->ܺ:Ll/۬᩶ۖ;

    .line 270
    iget-object v6, v5, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    invoke-interface {p1, v4, v6, v1, v5}, Ll/֡ۙۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v5, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 271
    invoke-virtual {v0, v5}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    :cond_7
    invoke-virtual {v3}, Ll/۟᩶ۖ;->֫()Z

    move-result v5

    if-eqz v5, :cond_8

    .line 274
    move-object v5, v1

    check-cast v5, Ll/ۗ᩶ۖ;

    invoke-interface {v5}, Ll/ۗ᩶ۖ;->֫()Ll/۬᩶ۖ;

    move-result-object v5

    .line 275
    iget-object v6, v5, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    invoke-interface {p1, v4, v6, v1, v5}, Ll/֡ۙۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, v5, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 276
    invoke-virtual {v0, v5}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    :cond_8
    invoke-virtual {v3}, Ll/۟᩶ۖ;->ۧ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 279
    invoke-virtual {v1}, Ll/֫ۙۖ;->ۧ()Ll/֫ۙۖ;

    move-result-object v3

    .line 280
    iget-object v5, v3, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    invoke-interface {p1, v4, v5, v1, v3}, Ll/֡ۙۖ;->֫(Ljava/lang/Object;Ljava/lang/Object;Ll/֫ۙۖ;Ll/֫ۙۖ;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v3, Ll/֫ۙۖ;->ᩳ:Ljava/lang/Object;

    .line 281
    invoke-virtual {v0, v3}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_9
    if-eqz v2, :cond_a

    .line 286
    iget-object p0, p0, Ll/֫ۙۖ;->֫:Ljava/util/TreeSet;

    invoke-virtual {p0, v2}, Ljava/util/TreeSet;->remove(Ljava/lang/Object;)Z

    :cond_a
    :goto_4
    return-void
.end method

.method public static ֫(Ll/֫ۙۖ;)Z
    .locals 2

    .line 92
    iget-object v0, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    .line 93
    invoke-virtual {v0}, Ll/۟᩶ۖ;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 95
    :cond_0
    invoke-virtual {v0}, Ll/۟᩶ۖ;->᩷()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 96
    iget-object v0, p0, Ll/֫ۙۖ;->ۧ:Ll/֡᩹ۖ;

    .line 97
    sget-object v1, Ll/֡᩹ۖ;->᩶:Ll/֡᩹ۖ;

    if-ne v0, v1, :cond_1

    .line 98
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result p0

    return p0

    .line 99
    :cond_1
    sget-object v1, Ll/֡᩹ۖ;->ۙ:Ll/֡᩹ۖ;

    if-ne v0, v1, :cond_3

    .line 100
    invoke-virtual {p0}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result p0

    if-eqz p0, :cond_4

    :cond_2
    :goto_0
    const/4 p0, 0x1

    return p0

    .line 102
    :cond_3
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ll/۠᩶ۖ;)Z
    .locals 3

    .line 110
    iget-object v0, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    .line 111
    invoke-virtual {v0}, Ll/֨᩶ۖ;->֫()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 113
    :cond_0
    invoke-virtual {v0}, Ll/֨᩶ۖ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 114
    sget-object v0, Ll/ᩴۙۖ;->֫:[I

    iget-object v1, p0, Ll/۠᩶ۖ;->᩸:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    if-eq v0, v2, :cond_3

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    .line 118
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result p0

    if-eqz p0, :cond_4

    :cond_1
    :goto_0
    return v2

    .line 122
    :cond_2
    new-instance p0, Ljava/lang/RuntimeException;

    invoke-direct {p0}, Ljava/lang/RuntimeException;-><init>()V

    throw p0

    .line 116
    :cond_3
    invoke-virtual {p0}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object p0

    invoke-static {p0}, Ll/ܶۙۖ;->֫(Ll/۠᩶ۖ;)Z

    move-result p0

    return p0

    :cond_4
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ll/ۚ᩹ۖ;)I
    .locals 3

    .line 432
    iget-object p0, p0, Ll/ۚ᩹ۖ;->ܽ:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩳ᩶ۖ;

    add-int/lit8 v2, v0, 0x1

    .line 433
    iput v0, v1, Ll/ᩳ᩶ۖ;->ۗ:I

    move v0, v2

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;
    .locals 3

    .line 310
    sget-object v0, Ll/ᩴۙۖ;->֫:[I

    iget-object v1, p0, Ll/۠᩶ۖ;->᩸:Ll/֡᩹ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    .line 312
    :cond_0
    iget-object v0, p0, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_2

    .line 313
    check-cast p0, Ll/ᩳ᩶ۖ;

    invoke-interface {p1, p0}, Ll/֨ۙۖ;->֫(Ll/ᩳ᩶ۖ;)Ll/۠᩶ۖ;

    move-result-object p0

    return-object p0

    .line 324
    :cond_1
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ܿ()[Ll/۠᩶ۖ;

    move-result-object v0

    const/4 v1, 0x0

    .line 325
    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    .line 326
    aget-object v2, v0, v1

    invoke-static {v2, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-object p0

    .line 320
    :cond_3
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۠᩶ۖ;->ۧ(Ll/۠᩶ۖ;)V

    .line 321
    invoke-virtual {p0}, Ll/۠᩶ۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۠᩶ۖ;->ܽ(Ll/۠᩶ۖ;)V

    return-object p0

    .line 317
    :cond_4
    invoke-virtual {p0}, Ll/۠᩶ۖ;->֫()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/۠᩶ۖ;->֫(Ll/۠᩶ۖ;)V

    return-object p0
.end method

.method public static ۧ(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V
    .locals 3

    .line 357
    sget-object v0, Ll/ᩴۙۖ;->֫:[I

    iget-object v1, p0, Ll/֫ۙۖ;->ۧ:Ll/֡᩹ۖ;

    iget-object v2, p0, Ll/֫ۙۖ;->᩷:Ll/۟᩶ۖ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_5

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    goto :goto_1

    :cond_0
    if-eqz p2, :cond_1

    .line 373
    sget-object p2, Ll/۟᩶ۖ;->ۤ:Ll/۟᩶ۖ;

    if-ne v2, p2, :cond_1

    .line 374
    check-cast p0, Ll/۬᩶ۖ;

    .line 375
    iget-object p0, p0, Ll/۬᩶ۖ;->ܺ:Ljava/util/ArrayList;

    if-eqz p0, :cond_1

    .line 376
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/᩸᩶ۖ;

    const/4 v0, 0x0

    .line 377
    invoke-static {p2, p1, v0}, Ll/ܶۙۖ;->ۧ(Ll/֫ۙۖ;Ll/۠ۙۖ;Z)V

    goto :goto_0

    :cond_1
    :goto_1
    return-void

    .line 362
    :cond_2
    invoke-virtual {p0}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p2

    .line 363
    iget-object v0, p2, Ll/۠᩶ۖ;->ۙ:Ll/֨᩶ۖ;

    sget-object v1, Ll/֨᩶ۖ;->᩸֫:Ll/֨᩶ۖ;

    if-ne v0, v1, :cond_4

    sget-object v0, Ll/۟᩶ۖ;->᩶:Ll/۟᩶ۖ;

    if-eq v2, v0, :cond_3

    sget-object v0, Ll/۟᩶ۖ;->۬:Ll/۟᩶ۖ;

    if-ne v2, v0, :cond_4

    .line 364
    :cond_3
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/֫ۙۖ;->ܽ(Ll/۠᩶ۖ;)V

    .line 365
    check-cast p2, Ll/ᩳ᩶ۖ;

    move-object v0, p0

    check-cast v0, Ll/᩸᩶ۖ;

    invoke-interface {p1, p2, v0}, Ll/ۚۙۖ;->֫(Ll/ᩳ᩶ۖ;Ll/᩸᩶ۖ;)Ll/ᩳ᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۙۖ;->ۧ(Ll/۠᩶ۖ;)V

    return-void

    .line 367
    :cond_4
    invoke-virtual {p0}, Ll/֫ۙۖ;->ᩳ()Ll/۠᩶ۖ;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object p2

    invoke-virtual {p0, p2}, Ll/֫ۙۖ;->ۧ(Ll/۠᩶ۖ;)V

    .line 368
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܿ()Ll/۠᩶ۖ;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۙۖ;->ܽ(Ll/۠᩶ۖ;)V

    return-void

    .line 359
    :cond_5
    invoke-virtual {p0}, Ll/֫ۙۖ;->ܽ()Ll/۠᩶ۖ;

    move-result-object p2

    invoke-static {p2, p1}, Ll/ܶۙۖ;->ۧ(Ll/۠᩶ۖ;Ll/۠ۙۖ;)Ll/۠᩶ۖ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/֫ۙۖ;->֫(Ll/۠᩶ۖ;)V

    return-void
.end method
