.class public abstract Ll/᩹ۗܺ;
.super Ll/ۙۗܺ;
.source "Z4Q9"

# interfaces
.implements Ljava/util/Collection;


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 1

    .line 88
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 88
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    .line 105
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 105
    invoke-interface {v0, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    .line 116
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 116
    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    return-void
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 82
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 82
    invoke-interface {v0, p1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 1

    .line 99
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 99
    invoke-interface {v0, p1}, Ljava/util/Collection;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final isEmpty()Z
    .locals 1

    .line 77
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 77
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 61
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 61
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    .line 94
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 94
    invoke-interface {v0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    .line 72
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 72
    invoke-interface {v0, p1}, Ljava/util/Collection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    .line 111
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 111
    invoke-interface {v0, p1}, Ljava/util/Collection;->retainAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final size()I
    .locals 1

    .line 66
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 66
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 121
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 121
    invoke-interface {v0}, Ljava/util/Collection;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 128
    move-object v0, p0

    check-cast v0, Ll/ᩴۨܺ;

    .line 107
    iget-object v0, v0, Ll/ᩴۨܺ;->᩸:Ljava/util/Collection;

    .line 128
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
