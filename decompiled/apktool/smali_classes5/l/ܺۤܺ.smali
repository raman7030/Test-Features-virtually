.class public final Ll/ܺۤܺ;
.super Ll/ۖۤܺ;
.source "067E"

# interfaces
.implements Ljava/util/NavigableSet;


# virtual methods
.method public final ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3859
    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final descendingIterator()Ljava/util/Iterator;
    .locals 1

    .line 3884
    invoke-virtual {p0}, Ll/ܺۤܺ;->descendingSet()Ljava/util/NavigableSet;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/NavigableSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final descendingSet()Ljava/util/NavigableSet;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3879
    invoke-interface {v0}, Ljava/util/NavigableMap;->descendingKeySet()Ljava/util/NavigableSet;

    move-result-object v0

    return-object v0
.end method

.method public final floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3854
    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->floorKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3903
    invoke-interface {v0, p1, p2}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->navigableKeySet()Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    const/4 v0, 0x0

    .line 3908
    invoke-virtual {p0, p1, v0}, Ll/ܺۤܺ;->headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3864
    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->higherKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3849
    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->lowerKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3869
    invoke-interface {v0}, Ljava/util/NavigableMap;->pollFirstEntry()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3874
    invoke-interface {v0}, Ljava/util/NavigableMap;->pollLastEntry()Ljava/util/Map$Entry;

    move-result-object v0

    invoke-static {v0}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3893
    invoke-interface {v0, p1, p2, p3, p4}, Ljava/util/NavigableMap;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->navigableKeySet()Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 3898
    invoke-virtual {p0, p1, v0, p2, v1}, Ll/ܺۤܺ;->subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3913
    invoke-interface {v0, p1, p2}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->navigableKeySet()Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    const/4 v0, 0x1

    .line 3918
    invoke-virtual {p0, p1, v0}, Ll/ܺۤܺ;->tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final ۧ()Ljava/util/Map;
    .locals 1

    .line 3844
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    return-object v0
.end method
