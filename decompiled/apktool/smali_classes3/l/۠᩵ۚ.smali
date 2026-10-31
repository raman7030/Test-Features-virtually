.class public final Ll/۠᩵ۚ;
.super Ljava/lang/Object;
.source "44KD"


# direct methods
.method public static ֫(Ljava/util/Comparator;Ljava/util/List;Ljava/util/List;)I
    .locals 2

    .line 82
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    .line 83
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 85
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_1

    const/4 p0, 0x1

    return p0

    .line 88
    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 89
    invoke-interface {p0, v0, v1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 92
    :cond_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, -0x1

    return p0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/util/Set;Ljava/util/Set;)I
    .locals 2

    .line 196
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 141
    :cond_0
    instance-of v0, p0, Ljava/util/SortedSet;

    if-eqz v0, :cond_1

    .line 142
    move-object v0, p0

    check-cast v0, Ljava/util/SortedSet;

    .line 143
    invoke-interface {v0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 144
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Comparator;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 167
    :cond_1
    invoke-static {p0}, Ll/᩻۫ܺ;->copyOf(Ljava/util/Collection;)Ll/᩻۫ܺ;

    .line 141
    :cond_2
    :goto_0
    instance-of v0, p1, Ljava/util/SortedSet;

    if-eqz v0, :cond_3

    .line 142
    move-object v0, p1

    check-cast v0, Ljava/util/SortedSet;

    .line 143
    invoke-interface {v0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 144
    invoke-static {}, Ll/ۤۤܺ;->ۧ()Ll/ۤۤܺ;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Comparator;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 167
    :cond_3
    invoke-static {p1}, Ll/᩻۫ܺ;->copyOf(Ljava/util/Collection;)Ll/᩻۫ܺ;

    .line 202
    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 203
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    .line 204
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_5

    return v0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method
