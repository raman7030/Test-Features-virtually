.class public abstract Ll/֨ۛܺ;
.super Ljava/util/AbstractSet;
.source "T5OR"


# virtual methods
.method public removeAll(Ljava/util/Collection;)Z
    .locals 3

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2064
    instance-of v0, p1, Ll/ۗۤܺ;

    if-eqz v0, :cond_0

    .line 2065
    check-cast p1, Ll/ۗۤܺ;

    invoke-interface {p1}, Ll/ۗۤܺ;->ۧۧ()Ljava/util/Set;

    move-result-object p1

    .line 2074
    :cond_0
    instance-of v0, p1, Ljava/util/Set;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v2

    if-le v0, v2, :cond_3

    .line 2075
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 209
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 211
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    return v1

    .line 2077
    :cond_3
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 2056
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 2057
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v1, v0

    goto :goto_1

    :cond_4
    return v1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 0

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    invoke-super {p0, p1}, Ljava/util/AbstractSet;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method
