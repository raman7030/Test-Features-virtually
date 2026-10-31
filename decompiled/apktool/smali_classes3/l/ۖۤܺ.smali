.class public Ll/ۖۤܺ;
.super Ll/ۡۤܺ;
.source "067E"

# interfaces
.implements Ljava/util/SortedSet;


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 3804
    move-object v0, p0

    check-cast v0, Ll/ܺۤܺ;

    .line 3844
    iget-object v0, v0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3804
    invoke-interface {v0}, Ljava/util/SortedMap;->comparator()Ljava/util/Comparator;

    move-result-object v0

    return-object v0
.end method

.method public final first()Ljava/lang/Object;
    .locals 1

    .line 3825
    move-object v0, p0

    check-cast v0, Ll/ܺۤܺ;

    .line 3844
    iget-object v0, v0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3825
    invoke-interface {v0}, Ljava/util/SortedMap;->firstKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final last()Ljava/lang/Object;
    .locals 1

    .line 3831
    move-object v0, p0

    check-cast v0, Ll/ܺۤܺ;

    .line 3844
    iget-object v0, v0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    check-cast v0, Ljava/util/NavigableMap;

    .line 3831
    invoke-interface {v0}, Ljava/util/SortedMap;->lastKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
