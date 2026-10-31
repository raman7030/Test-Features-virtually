.class public final Ll/ۚۛܺ;
.super Ll/֡ۛܺ;
.source "T5OR"

# interfaces
.implements Ljava/util/SortedSet;


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 1262
    iget-object v0, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast v0, Ljava/util/SortedSet;

    invoke-interface {v0}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final first()Ljava/lang/Object;
    .locals 4

    .line 1284
    iget-object v0, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 902
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 733
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 734
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 735
    invoke-interface {v1, v2}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-object v2

    .line 739
    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 1273
    new-instance v0, Ll/ۚۛܺ;

    iget-object v1, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast v1, Ljava/util/SortedSet;

    invoke-interface {v1, p1}, Ljava/util/SortedSet;->headSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object p1

    iget-object v1, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    .line 1239
    invoke-direct {v0, p1, v1}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 3

    .line 1290
    iget-object v0, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast v0, Ljava/util/SortedSet;

    .line 1292
    :goto_0
    invoke-interface {v0}, Ljava/util/SortedSet;->last()Ljava/lang/Object;

    move-result-object v1

    .line 1293
    iget-object v2, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    invoke-interface {v2, v1}, Ll/ᩴܶܺ;->apply(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 1296
    :cond_0
    invoke-interface {v0, v1}, Ljava/util/SortedSet;->headSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object v0

    goto :goto_0
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 1267
    new-instance v0, Ll/ۚۛܺ;

    iget-object v1, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast v1, Ljava/util/SortedSet;

    .line 1268
    invoke-interface {v1, p1, p2}, Ljava/util/SortedSet;->subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object p1

    iget-object p2, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    .line 1239
    invoke-direct {v0, p1, p2}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 1278
    new-instance v0, Ll/ۚۛܺ;

    iget-object v1, p0, Ll/۫ۙܺ;->᩹:Ljava/util/Collection;

    check-cast v1, Ljava/util/SortedSet;

    invoke-interface {v1, p1}, Ljava/util/SortedSet;->tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;

    move-result-object p1

    iget-object v1, p0, Ll/۫ۙܺ;->᩸:Ll/ᩴܶܺ;

    .line 1239
    invoke-direct {v0, p1, v1}, Ll/۫ۙܺ;-><init>(Ljava/util/Collection;Ll/ᩴܶܺ;)V

    return-object v0
.end method
