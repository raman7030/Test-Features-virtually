.class public final Ll/ܽۘۜ;
.super Ljava/lang/Object;
.source "T6XI"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 10

    .line 25
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩺ۖۜ;

    iget-object v0, v0, Ll/᩺ۖۜ;->ۧ:Ljava/lang/String;

    const-string v1, "write_target"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩺ۖۜ;

    iget-object p0, p0, Ll/᩺ۖۜ;->ܽ:Ljava/lang/String;

    return-object p0

    .line 28
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const-string v4, "insert_before_match"

    const-string v5, "replace_match"

    if-ge v1, v3, :cond_5

    .line 30
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩺ۖۜ;

    .line 31
    iget-object v6, v3, Ll/᩺ۖۜ;->ۧ:Ljava/lang/String;

    iget-object v7, v3, Ll/᩺ۖۜ;->֫:Ljava/lang/String;

    .line 49
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    const/4 v8, -0x1

    if-nez v5, :cond_2

    .line 50
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "insert_after_match"

    .line 51
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    .line 32
    :cond_1
    new-instance p0, Ll/ܰۖۜ;

    sget-object p1, Ll/֫ۘۜ;->᩹:Ll/֫ۘۜ;

    invoke-direct {p0, p1, v1, v8}, Ll/ܰۖۜ;-><init>(Ll/֫ۘۜ;II)V

    throw p0

    .line 34
    :cond_2
    :goto_1
    invoke-virtual {p0, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-ltz v4, :cond_4

    add-int/lit8 v5, v4, 0x1

    .line 38
    invoke-virtual {p0, v7, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v5

    if-gez v5, :cond_3

    .line 41
    new-instance v5, Ll/۟ۖۜ;

    .line 42
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v6

    add-int/2addr v6, v4

    invoke-direct {v5, v1, v3, v4, v6}, Ll/۟ۖۜ;-><init>(ILl/᩺ۖۜ;II)V

    .line 41
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 39
    :cond_3
    new-instance p0, Ll/ܰۖۜ;

    sget-object p1, Ll/֫ۘۜ;->᩶:Ll/֫ۘۜ;

    invoke-direct {p0, p1, v1, v8}, Ll/ܰۖۜ;-><init>(Ll/֫ۘۜ;II)V

    throw p0

    .line 36
    :cond_4
    new-instance p0, Ll/ܰۖۜ;

    sget-object p1, Ll/֫ۘۜ;->ۙ:Ll/֫ۘۜ;

    invoke-direct {p0, p1, v1, v8}, Ll/ܰۖۜ;-><init>(Ll/֫ۘۜ;II)V

    throw p0

    :cond_5
    const/4 p1, 0x0

    .line 55
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_9

    .line 56
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۟ۖۜ;

    add-int/lit8 p1, p1, 0x1

    move v3, p1

    .line 57
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v3, v6, :cond_6

    .line 58
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۟ۖۜ;

    .line 59
    iget v7, v1, Ll/۟ۖۜ;->ᩳ:I

    iget v8, v6, Ll/۟ۖۜ;->ܽ:I

    if-ge v7, v8, :cond_8

    iget v7, v6, Ll/۟ۖۜ;->ᩳ:I

    iget v8, v1, Ll/۟ۖۜ;->ܽ:I

    if-lt v7, v8, :cond_7

    goto :goto_3

    .line 60
    :cond_7
    new-instance p0, Ll/ܰۖۜ;

    sget-object p1, Ll/֫ۘۜ;->ۗ:Ll/֫ۘۜ;

    iget v0, v6, Ll/۟ۖۜ;->ۧ:I

    iget v1, v1, Ll/۟ۖۜ;->ۧ:I

    invoke-direct {p0, p1, v0, v1}, Ll/ܰۖۜ;-><init>(Ll/֫ۘۜ;II)V

    throw p0

    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 69
    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 70
    new-instance v1, Ljava/util/TreeMap;

    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 71
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/۟ۖۜ;

    .line 72
    iget-object v6, v3, Ll/۟ۖۜ;->֫:Ll/᩺ۖۜ;

    iget-object v7, v6, Ll/᩺ۖۜ;->ܽ:Ljava/lang/String;

    iget-object v6, v6, Ll/᩺ۖۜ;->ۧ:Ljava/lang/String;

    iget v8, v3, Ll/۟ۖۜ;->ܽ:I

    iget v3, v3, Ll/۟ۖۜ;->ᩳ:I

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 73
    new-instance v6, Ll/ۧۘۜ;

    invoke-direct {v6, v3, v8, v7}, Ll/ۧۘۜ;-><init>(IILjava/lang/String;)V

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 76
    :cond_a
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    move v8, v3

    .line 78
    :cond_b
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v6, Ll/۬ܺܳ;

    const/4 v8, 0x2

    invoke-direct {v6, v8}, Ll/۬ܺܳ;-><init>(I)V

    invoke-static {v1, v3, v6}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    .line 79
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    .line 82
    :cond_c
    new-instance v0, Ll/ۨۖۜ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 85
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_d

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۧۘۜ;

    .line 86
    iget v4, v3, Ll/ۧۘۜ;->ۧ:I

    invoke-static {v0, p0, v2, v4, v1}, Ll/ܽۘۜ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;IILjava/util/TreeMap;)V

    .line 87
    iget-object v2, v3, Ll/ۧۘۜ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    iget v2, v3, Ll/ۧۘۜ;->֫:I

    goto :goto_5

    .line 90
    :cond_d
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p1

    invoke-static {v0, p0, v2, p1, v1}, Ll/ܽۘۜ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;IILjava/util/TreeMap;)V

    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/StringBuilder;Ljava/lang/String;IILjava/util/TreeMap;)V
    .locals 2

    :goto_0
    if-ge p2, p3, :cond_2

    .line 97
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-nez v0, :cond_0

    goto :goto_2

    .line 108
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 109
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 98
    :cond_1
    :goto_2
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    .line 100
    :cond_2
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/ArrayList;

    if-nez p1, :cond_3

    goto :goto_4

    .line 108
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 109
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    :goto_4
    return-void
.end method
