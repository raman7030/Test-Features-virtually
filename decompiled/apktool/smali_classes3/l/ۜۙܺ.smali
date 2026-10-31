.class public abstract Ll/ۜۙܺ;
.super Ll/ۢۤܺ;
.source "S60L"

# interfaces
.implements Ljava/util/NavigableMap;


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    .line 95
    invoke-interface {p0, p1, v0}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 115
    invoke-virtual {p0, p1}, Ll/ۜۙܺ;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final descendingKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 157
    new-instance v0, Ll/᩻ۙܺ;

    invoke-direct {v0, p0}, Ll/᩻ۙܺ;-><init>(Ll/ۜۙܺ;)V

    .line 152
    invoke-virtual {v0}, Ll/ᩳۤܺ;->navigableKeySet()Ljava/util/NavigableSet;

    move-result-object v0

    return-object v0
.end method

.method public final descendingMap()Ljava/util/NavigableMap;
    .locals 1

    .line 157
    new-instance v0, Ll/᩻ۙܺ;

    invoke-direct {v0, p0}, Ll/᩻ۙܺ;-><init>(Ll/ۜۙܺ;)V

    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 43
    invoke-virtual {p0}, Ll/ۢۤܺ;->֫()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    .line 64
    invoke-virtual {p0}, Ll/ۜۙܺ;->firstEntry()Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 68
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 66
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    .line 90
    invoke-interface {p0, p1, v0}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 110
    invoke-virtual {p0, p1}, Ll/ۜۙܺ;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 132
    invoke-interface {p0, p1, v0}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    .line 100
    invoke-interface {p0, p1, v0}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 120
    invoke-virtual {p0, p1}, Ll/ۜۙܺ;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 142
    new-instance v0, Ll/ܺۤܺ;

    .line 3794
    invoke-direct {v0, p0}, Ll/ۡۤܺ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 48
    invoke-virtual {p0}, Ll/ۜۙܺ;->ۧ()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    .line 75
    invoke-virtual {p0}, Ll/ۜۙܺ;->lastEntry()Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 79
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 77
    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    .line 85
    invoke-interface {p0, p1, v0}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/NavigableMap;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 105
    invoke-virtual {p0, p1}, Ll/ۜۙܺ;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 142
    new-instance v0, Ll/ܺۤܺ;

    .line 3794
    invoke-direct {v0, p0}, Ll/ۡۤܺ;-><init>(Ljava/util/Map;)V

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 53
    invoke-virtual {p0}, Ll/ۢۤܺ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ۫ܺ;->ۧ(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 58
    invoke-virtual {p0}, Ll/ۜۙܺ;->ۧ()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ۫ܺ;->ۧ(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 127
    invoke-interface {p0, p1, v0, p2, v1}, Ljava/util/NavigableMap;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 137
    invoke-interface {p0, p1, v0}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public abstract ۧ()Ljava/util/Iterator;
.end method
