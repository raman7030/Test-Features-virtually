.class public final Ll/ܶܰۖ;
.super Ljava/lang/Object;
.source "K9I0"


# direct methods
.method public static ֫(Ljava/util/Collection;)J
    .locals 4

    .line 29
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Enum;

    .line 30
    instance-of v3, v2, Ll/᩸ܰۖ;

    if-eqz v3, :cond_0

    .line 31
    check-cast v2, Ll/᩸ܰۖ;

    invoke-interface {v2}, Ll/᩸ܰۖ;->getValue()J

    move-result-wide v2

    or-long/2addr v0, v2

    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can only be used with EnumWithValue enums."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-wide v0
.end method

.method public static ֫(JLjava/lang/Class;)Ljava/util/EnumSet;
    .locals 5

    .line 40
    const-class v0, Ll/᩸ܰۖ;

    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 43
    invoke-static {p2}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    move-result-object v0

    .line 44
    invoke-virtual {p2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Enum;

    array-length v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p2, v2

    .line 45
    move-object v4, v3

    check-cast v4, Ll/᩸ܰۖ;

    invoke-static {p0, p1, v4}, Ll/ܶܰۖ;->֫(JLl/᩸ܰۖ;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 46
    invoke-virtual {v0, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0

    .line 41
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Can only be used with EnumWithValue enums."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(JLjava/lang/Class;Ll/۟۫ۖ;)Ll/᩸ܰۖ;
    .locals 6

    .line 57
    invoke-virtual {p2}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ll/᩸ܰۖ;

    .line 58
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p2, v1

    .line 59
    invoke-interface {v2}, Ll/᩸ܰۖ;->getValue()J

    move-result-wide v3

    cmp-long v5, v3, p0

    if-nez v5, :cond_0

    return-object v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object p3
.end method

.method public static ֫(JLl/᩸ܰۖ;)Z
    .locals 2

    .line 53
    invoke-interface {p2}, Ll/᩸ܰۖ;->getValue()J

    move-result-wide v0

    and-long/2addr p0, v0

    const-wide/16 v0, 0x0

    cmp-long p2, p0, v0

    if-lez p2, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
