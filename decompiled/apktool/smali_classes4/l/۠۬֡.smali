.class public abstract Ll/۠۬֡;
.super Ljava/lang/Object;
.source "05J4"

# interfaces
.implements Ll/᩶ܽۚ;


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 3

    .line 44
    check-cast p1, Ll/ۤܽۚ;

    const/16 v0, 0x1c

    .line 60
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v1

    .line 133
    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 62
    :cond_0
    invoke-interface {p0}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object v0

    check-cast p1, Ll/᩶ܽۚ;

    invoke-interface {p1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p1

    .line 69
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v2

    .line 133
    invoke-static {v1, v2}, Ljava/lang/Integer;->compare(II)I

    move-result v1

    if-eqz v1, :cond_1

    return v1

    .line 71
    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 72
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Comparable;

    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v1

    if-eqz v1, :cond_2

    return v1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 52
    instance-of v0, p1, Ll/᩶ܽۚ;

    if-eqz v0, :cond_0

    .line 53
    invoke-interface {p0}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object v0

    check-cast p1, Ll/᩶ܽۚ;

    invoke-interface {p1}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 47
    invoke-interface {p0}, Ll/᩶ܽۚ;->getValue()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    move-result v0

    return v0
.end method

.method public final ۖ()I
    .locals 1

    const/16 v0, 0x1c

    return v0
.end method
