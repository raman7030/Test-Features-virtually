.class public abstract Ll/ۜۤܺ;
.super Ll/֨ۛܺ;
.source "067E"


# virtual methods
.method public final clear()V
    .locals 1

    .line 4016
    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 2

    .line 4021
    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_1

    .line 4022
    check-cast p1, Ljava/util/Map$Entry;

    .line 4023
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    .line 4024
    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v1

    .line 902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3622
    :try_start_0
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    .line 4025
    :goto_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 4032
    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 1

    .line 4041
    invoke-virtual {p0, p1}, Ll/ۜۤܺ;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 4042
    check-cast p1, Ljava/util/Map$Entry;

    .line 4043
    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 2

    .line 902
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4051
    invoke-super {p0, p1}, Ll/֨ۛܺ;->removeAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 4054
    :catch_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    .line 2056
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2057
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    goto :goto_0

    :cond_0
    return v0
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 3

    .line 902
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4061
    invoke-super {p0, p1}, Ll/֨ۛܺ;->retainAll(Ljava/util/Collection;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    .line 4064
    :catch_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, Ll/ܶۛܺ;->֫(I)Ljava/util/HashSet;

    move-result-object v0

    .line 4065
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    .line 4070
    invoke-virtual {p0, v1}, Ll/ۜۤܺ;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    instance-of v2, v1, Ljava/util/Map$Entry;

    if-eqz v2, :cond_0

    .line 4071
    check-cast v1, Ljava/util/Map$Entry;

    .line 4072
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 4075
    :cond_1
    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1, v0}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 4011
    invoke-virtual {p0}, Ll/ۜۤܺ;->ۧ()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public abstract ۧ()Ljava/util/Map;
.end method
