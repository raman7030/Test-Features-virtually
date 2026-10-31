.class public abstract Ll/۠ۛܺ;
.super Ljava/util/AbstractSet;
.source "T5OR"


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 641
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 669
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final clear()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 710
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    goto :goto_4

    .line 727
    :cond_0
    instance-of v1, p1, Ljava/util/Set;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto :goto_3

    .line 730
    :cond_1
    check-cast p1, Ljava/util/Set;

    .line 802
    instance-of v1, p1, Ll/۠ۛܺ;

    if-eqz v1, :cond_2

    move-object v3, p1

    check-cast v3, Ll/۠ۛܺ;

    invoke-virtual {v3}, Ll/۠ۛܺ;->ۧ()I

    move-result v3

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v3

    :goto_0
    if-gez v3, :cond_3

    goto :goto_3

    :cond_3
    if-eqz v1, :cond_4

    const/4 v1, 0x0

    goto :goto_1

    .line 786
    :cond_4
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v1

    .line 737
    :goto_1
    invoke-virtual {p0}, Ll/۠ۛܺ;->ۧ()I

    move-result v4

    if-ge v4, v1, :cond_5

    goto :goto_3

    .line 745
    :cond_5
    invoke-virtual {p0}, Ll/۠ۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v4

    const/4 v5, 0x0

    :goto_2
    move-object v6, v4

    check-cast v6, Ll/֨᩶ܺ;

    invoke-virtual {v6}, Ll/֨᩶ܺ;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v6}, Ll/֨᩶ܺ;->next()Ljava/lang/Object;

    move-result-object v6

    .line 747
    :try_start_0
    invoke-interface {p1, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v6, :cond_6

    goto :goto_3

    :cond_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_7
    if-ne v5, v3, :cond_8

    goto :goto_4

    :cond_8
    if-ge v5, v1, :cond_9

    goto :goto_3

    .line 764
    :cond_9
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :cond_a
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    add-int/2addr v1, v0

    if-le v1, v5, :cond_a

    :catch_0
    :goto_3
    return v2

    :cond_b
    :goto_4
    return v0
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .line 915
    invoke-virtual {p0}, Ll/۠ۛܺ;->iterator()Ll/᩶ۨܺ;

    move-result-object v0

    return-object v0
.end method

.method public abstract iterator()Ll/᩶ۨܺ;
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 655
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 683
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 697
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public abstract ۧ()I
.end method
