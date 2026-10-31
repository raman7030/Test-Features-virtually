.class public final Ll/᩶ۧۖ;
.super Ljava/lang/Object;
.source "C7P7"


# direct methods
.method public static ֫(Ll/ܳ۬ܺ;)Ll/֫᩹۠;
    .locals 2

    .line 201
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 202
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩸۟ܺ;

    invoke-static {p0}, Ll/᩶ۧۖ;->֫(Ll/᩸۟ܺ;)Ll/֫᩹۠;

    move-result-object p0

    return-object p0

    .line 204
    :cond_0
    invoke-static {p0}, Ll/ۡ۫ܺ;->ۧ(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩸۟ܺ;

    invoke-static {p0}, Ll/᩶ۧۖ;->֫(Ll/᩸۟ܺ;)Ll/֫᩹۠;

    move-result-object p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    .line 208
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NON_"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/֫᩹۠;->valueOf(Ljava/lang/String;)Ll/֫᩹۠;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/᩸۟ܺ;)Ll/֫᩹۠;
    .locals 2

    .line 216
    invoke-interface {p0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    check-cast v0, Ll/᩸֫ۖ;

    invoke-virtual {v0}, Ll/᩸֫ۖ;->᩷()Ll/᩶ۘ۠;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 218
    sget-object v1, Ll/᩸ۧۖ;->֫:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 242
    :pswitch_0
    sget-object p0, Ll/֫᩹۠;->ܰ:Ll/֫᩹۠;

    return-object p0

    .line 240
    :pswitch_1
    sget-object p0, Ll/֫᩹۠;->ۗ:Ll/֫᩹۠;

    return-object p0

    .line 238
    :pswitch_2
    sget-object p0, Ll/֫᩹۠;->۟:Ll/֫᩹۠;

    return-object p0

    .line 236
    :pswitch_3
    sget-object p0, Ll/֫᩹۠;->ۧ֫:Ll/֫᩹۠;

    return-object p0

    .line 234
    :pswitch_4
    sget-object p0, Ll/֫᩹۠;->֫֫:Ll/֫᩹۠;

    return-object p0

    .line 232
    :pswitch_5
    sget-object p0, Ll/֫᩹۠;->ۙ:Ll/֫᩹۠;

    return-object p0

    .line 230
    :pswitch_6
    sget-object p0, Ll/֫᩹۠;->᩶:Ll/֫᩹۠;

    return-object p0

    .line 228
    :pswitch_7
    sget-object p0, Ll/֫᩹۠;->᩺:Ll/֫᩹۠;

    return-object p0

    .line 226
    :pswitch_8
    sget-object p0, Ll/֫᩹۠;->᩹:Ll/֫᩹۠;

    return-object p0

    .line 224
    :pswitch_9
    sget-object p0, Ll/֫᩹۠;->۫:Ll/֫᩹۠;

    return-object p0

    .line 222
    :pswitch_a
    sget-object p0, Ll/֫᩹۠;->ۤ:Ll/֫᩹۠;

    return-object p0

    .line 220
    :pswitch_b
    sget-object p0, Ll/֫᩹۠;->ۛ:Ll/֫᩹۠;

    return-object p0

    .line 246
    :cond_0
    :goto_0
    invoke-interface {p0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object p0

    check-cast p0, Ll/᩸֫ۖ;

    invoke-virtual {p0}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "sealed"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    const/4 p0, 0x0

    return-object p0

    :cond_1
    const-string p0, "SEALED"

    .line 248
    invoke-static {p0}, Ll/֫᩹۠;->valueOf(Ljava/lang/String;)Ll/֫᩹۠;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/᩶֫ۖ;Ljava/util/Collection;)Ll/᩶֫ۖ;
    .locals 11

    .line 126
    invoke-virtual {p0}, Ll/᩶֫ۖ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_7

    .line 131
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶֫ۖ;->֫(Ljava/util/Collection;)Ll/᩹ۨܺ;

    move-result-object p1

    .line 132
    invoke-virtual {p0}, Ll/᩶֫ۖ;->ᩳ()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    .line 375
    invoke-virtual {v0, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v0

    .line 133
    invoke-static {}, Ll/ۘۨܺ;->ܽ()Ll/ۘۨܺ;

    move-result-object v2

    .line 134
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 135
    invoke-static {v0}, Ll/᩶ۧۖ;->֫(Ljava/util/Iterator;)Ll/᩹ۧۖ;

    move-result-object v3

    .line 136
    invoke-virtual {v3}, Ll/᩹ۧۖ;->᩻()Z

    move-result v4

    if-nez v4, :cond_1

    .line 137
    invoke-virtual {v3}, Ll/᩹ۧۖ;->ۡ()Ll/ܳ۬ܺ;

    move-result-object v4

    invoke-static {v4}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v4

    new-instance v5, Ll/ܶۧۖ;

    invoke-direct {v5, p1}, Ll/ܶۧۖ;-><init>(Ll/᩹ۨܺ;)V

    .line 138
    invoke-interface {v4, v5}, Ll/ܿ᩺ᩴ;->allMatch(Ljava/util/function/Predicate;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    .line 142
    :cond_2
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 144
    invoke-virtual {v3}, Ll/᩹ۧۖ;->ۢ()I

    move-result v5

    .line 145
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, -0x1

    .line 148
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 149
    invoke-static {v0}, Ll/᩶ۧۖ;->֫(Ljava/util/Iterator;)Ll/᩹ۧۖ;

    move-result-object v6

    .line 150
    invoke-virtual {v6}, Ll/᩹ۧۖ;->᩻()Z

    move-result v7

    if-eqz v7, :cond_3

    goto :goto_2

    .line 153
    :cond_3
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 154
    invoke-virtual {v6}, Ll/᩹ۧۖ;->֫()I

    move-result v3

    goto :goto_1

    .line 157
    :cond_4
    :goto_2
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    .line 900
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    .line 901
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    .line 902
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1

    .line 903
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    .line 904
    invoke-interface {v6, v8, v9}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v8

    if-lez v8, :cond_8

    .line 158
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v6

    invoke-virtual {v6, v4}, Ll/ۤۤܺ;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v6

    .line 159
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x0

    .line 160
    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_7

    if-lez v8, :cond_5

    .line 162
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩹ۧۖ;

    invoke-virtual {v9}, Ll/᩹ۧۖ;->ܿ()Ll/ܳ۬ܺ;

    move-result-object v9

    .line 375
    invoke-virtual {v9, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v9

    .line 176
    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶ۟ܺ;

    .line 177
    invoke-interface {v10}, Ll/ܶ۟ܺ;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 164
    :cond_5
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩹ۧۖ;

    invoke-virtual {v9}, Ll/᩹ۧۖ;->᩷()Ll/֫᩹۠;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 165
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    add-int/lit8 v9, v9, -0x1

    if-ge v8, v9, :cond_6

    .line 166
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/᩹ۧۖ;

    invoke-virtual {v9}, Ll/᩹ۧۖ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v9

    .line 375
    invoke-virtual {v9, v1}, Ll/ܳ۬ܺ;->listIterator(I)Ll/ۙۨܺ;

    move-result-object v9

    .line 176
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶ۟ܺ;

    .line 177
    invoke-interface {v10}, Ll/ܶ۟ܺ;->getText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_6

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    .line 169
    :cond_7
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v4, v3}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Integer;Ljava/lang/Integer;)Ll/ܰۤܺ;

    move-result-object v3

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ll/ۘۨܺ;->֫(Ll/ܰۤܺ;Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_8
    move-object v8, v9

    goto/16 :goto_3

    .line 261
    :cond_9
    invoke-virtual {v2}, Ll/ۘۨܺ;->ۧ()Ljava/util/Map;

    move-result-object p1

    .line 262
    move-object v0, p1

    check-cast v0, Ljava/util/AbstractMap;

    invoke-virtual {v0}, Ljava/util/AbstractMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_a

    :goto_7
    return-object p0

    .line 265
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ll/᩶֫ۖ;->ܽ()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 266
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    .line 267
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ܰۤܺ;

    .line 268
    invoke-virtual {v1}, Ll/ܰۤܺ;->ۧ()Ljava/lang/Comparable;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1}, Ll/ܰۤܺ;->ܽ()Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {v0, v2, v1, p1}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    .line 270
    :cond_b
    new-instance p0, Ll/᩶֫ۖ;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/᩶֫ۖ;-><init>(Ljava/lang/String;)V

    return-object p0
.end method

.method public static ֫(Ljava/util/Iterator;)Ll/᩹ۧۖ;
    .locals 4

    .line 182
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ܺ;

    .line 183
    sget v1, Ll/ܳ۬ܺ;->᩹:I

    .line 726
    new-instance v1, Ll/֫۬ܺ;

    invoke-direct {v1}, Ll/֫۬ܺ;-><init>()V

    .line 184
    invoke-virtual {v1, v0}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 185
    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    check-cast v0, Ll/᩸֫ۖ;

    invoke-virtual {v0}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v0

    const-string v2, "non"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 186
    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    .line 65
    new-instance v0, Ll/᩹ۧۖ;

    invoke-static {p0}, Ll/᩶ۧۖ;->֫(Ll/ܳ۬ܺ;)Ll/֫᩹۠;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/᩹ۧۖ;-><init>(Ll/ܳ۬ܺ;Ll/֫᩹۠;)V

    return-object v0

    .line 188
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_1

    .line 69
    new-instance p0, Ll/᩹ۧۖ;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Ll/᩹ۧۖ;-><init>(Ll/ܳ۬ܺ;Ll/֫᩹۠;)V

    return-object p0

    .line 191
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩸۟ܺ;

    .line 192
    invoke-virtual {v1, v0}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 193
    invoke-interface {v0}, Ll/᩸۟ܺ;->֫()Ll/ܶ۟ܺ;

    move-result-object v0

    check-cast v0, Ll/᩸֫ۖ;

    invoke-virtual {v0}, Ll/᩸֫ۖ;->getText()Ljava/lang/String;

    move-result-object v0

    const-string v3, "-"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    .line 196
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩸۟ܺ;

    invoke-virtual {v1, p0}, Ll/ۛۗܺ;->ۧ(Ljava/lang/Object;)V

    .line 197
    invoke-virtual {v1}, Ll/֫۬ܺ;->֫()Ll/ܳ۬ܺ;

    move-result-object p0

    .line 65
    new-instance v0, Ll/᩹ۧۖ;

    invoke-static {p0}, Ll/᩶ۧۖ;->֫(Ll/ܳ۬ܺ;)Ll/֫᩹۠;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/᩹ۧۖ;-><init>(Ll/ܳ۬ܺ;Ll/֫᩹۠;)V

    return-object v0

    .line 69
    :cond_3
    :goto_0
    new-instance p0, Ll/᩹ۧۖ;

    invoke-static {}, Ll/ܳ۬ܺ;->of()Ll/ܳ۬ܺ;

    move-result-object v0

    invoke-direct {p0, v0, v2}, Ll/᩹ۧۖ;-><init>(Ll/ܳ۬ܺ;Ll/֫᩹۠;)V

    return-object p0
.end method
