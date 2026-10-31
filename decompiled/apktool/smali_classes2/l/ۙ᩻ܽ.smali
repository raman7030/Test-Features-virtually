.class public final Ll/ۙ᩻ܽ;
.super Ljava/lang/Object;
.source "Y4W0"


# direct methods
.method public static ֫(Ll/᩸᩻ܽ;Ll/᩸᩻ܽ;)Z
    .locals 2

    .line 204
    iget v0, p0, Ll/᩸᩻ܽ;->ۧ:I

    iget p0, p0, Ll/᩸᩻ܽ;->֫:I

    iget v1, p1, Ll/᩸᩻ܽ;->ۧ:I

    iget p1, p1, Ll/᩸᩻ܽ;->֫:I

    if-ge v0, v1, :cond_0

    if-ge v1, p0, :cond_0

    if-lt p0, p1, :cond_1

    :cond_0
    if-ge v1, v0, :cond_2

    if-ge v0, p1, :cond_2

    if-ge p1, p0, :cond_2

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;
    .locals 11

    if-eqz p0, :cond_7

    .line 128
    array-length v0, p0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto/16 :goto_5

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 183
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_7

    add-int/lit8 v2, v1, 0x1

    move v3, v2

    .line 184
    :goto_1
    array-length v4, p0

    if-ge v3, v4, :cond_6

    .line 185
    aget-object v4, p0, v1

    aget-object v5, p0, v3

    invoke-static {v4, v5}, Ll/ۙ᩻ܽ;->֫(Ll/᩸᩻ܽ;Ll/᩸᩻ܽ;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 138
    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_2
    const/4 p0, 0x0

    .line 143
    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge p0, v2, :cond_4

    add-int/lit8 v2, p0, 0x1

    move v3, v2

    .line 144
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ge v3, v4, :cond_3

    .line 145
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸᩻ܽ;

    .line 146
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸᩻ܽ;

    .line 148
    invoke-static {v4, v5}, Ll/ۙ᩻ܽ;->֫(Ll/᩸᩻ܽ;Ll/᩸᩻ܽ;)Z

    move-result v6

    iget-object v7, v4, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    iget v8, v4, Ll/᩸᩻ܽ;->֫:I

    iget-object v9, v5, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    iget v10, v5, Ll/᩸᩻ܽ;->֫:I

    if-eqz v6, :cond_2

    .line 150
    iget v4, v4, Ll/᩸᩻ܽ;->ۧ:I

    iget v5, v5, Ll/᩸᩻ܽ;->ۧ:I

    if-ge v4, v5, :cond_1

    .line 152
    new-instance p0, Ll/᩸᩻ܽ;

    invoke-direct {p0, v9, v5, v8}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v3, p0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    .line 153
    new-instance p0, Ll/᩸᩻ܽ;

    invoke-direct {p0, v9, v8, v10}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v3, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    .line 156
    :cond_1
    new-instance v3, Ll/᩸᩻ܽ;

    invoke-direct {v3, v7, v4, v10}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, p0, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 157
    new-instance p0, Ll/᩸᩻ܽ;

    invoke-direct {p0, v7, v10, v8}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v1, v2, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_3
    move p0, v2

    goto :goto_3

    :cond_4
    new-array p0, v0, [Ll/᩸᩻ܽ;

    .line 172
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩸᩻ܽ;

    return-object p0

    :cond_5
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_6
    move v1, v2

    goto/16 :goto_0

    :cond_7
    :goto_5
    return-object p0
.end method

.method public static ۧ([Ll/᩸᩻ܽ;)[Ll/᩸᩻ܽ;
    .locals 11

    if-eqz p0, :cond_5

    .line 216
    array-length v0, p0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    goto/16 :goto_4

    .line 221
    :cond_0
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 222
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p0, v3

    .line 223
    iget-object v5, v4, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    new-instance v6, Ll/᩹᩻ܽ;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Ll/᩹᩻ܽ;-><init>(I)V

    invoke-static {v0, v5, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 227
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 230
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 231
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    .line 234
    new-instance v5, Ll/᩶᩻ܽ;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-static {v5}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v5

    invoke-static {v4, v5}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 237
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩸᩻ܽ;

    iget v5, v5, Ll/᩸᩻ܽ;->ۧ:I

    .line 238
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/᩸᩻ܽ;

    iget v6, v6, Ll/᩸᩻ܽ;->֫:I

    const/4 v7, 0x1

    .line 240
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_3

    .line 241
    invoke-interface {v4, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/᩸᩻ܽ;

    .line 244
    iget v9, v8, Ll/᩸᩻ܽ;->ۧ:I

    iget v10, v8, Ll/᩸᩻ܽ;->֫:I

    if-gt v9, v6, :cond_2

    .line 246
    invoke-static {v6, v10}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_3

    .line 249
    :cond_2
    new-instance v9, Ll/᩸᩻ܽ;

    invoke-direct {v9, v3, v5, v6}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 251
    iget v5, v8, Ll/᩸᩻ܽ;->ۧ:I

    move v6, v10

    :goto_3
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 257
    :cond_3
    new-instance v4, Ll/᩸᩻ܽ;

    invoke-direct {v4, v3, v5, v6}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-array v0, v2, [Ll/᩸᩻ܽ;

    .line 260
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ll/᩸᩻ܽ;

    :cond_5
    :goto_4
    return-object p0
.end method
