.class public final Ll/۫᩶ܺ;
.super Ll/ۨ᩶ܺ;
.source "O3K3"

# interfaces
.implements Ljava/util/NavigableMap;


# instance fields
.field public final synthetic ۫:Ll/ܽۙܺ;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V
    .locals 0

    .line 1497
    iput-object p1, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    .line 1498
    invoke-direct {p0, p1, p2}, Ll/ۨ᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/SortedMap;)V

    return-void
.end method


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1530
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1531
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1536
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final descendingKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 1606
    invoke-virtual {p0}, Ll/۫᩶ܺ;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v0

    check-cast v0, Ll/۫᩶ܺ;

    .line 1591
    invoke-super {v0}, Ll/ۨ᩶ܺ;->keySet()Ljava/util/SortedSet;

    move-result-object v0

    check-cast v0, Ljava/util/NavigableSet;

    return-object v0
.end method

.method public final descendingMap()Ljava/util/NavigableMap;
    .locals 3

    .line 1586
    new-instance v0, Ll/۫᩶ܺ;

    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    iget-object v2, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    invoke-direct {v0, v2, v1}, Ll/۫᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 1552
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/NavigableMap;->firstEntry()Ljava/util/Map$Entry;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1553
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1519
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1520
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1525
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->floorKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 2

    .line 1631
    new-instance v0, Ll/۫᩶ܺ;

    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    iget-object p2, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    invoke-direct {v0, p2, p1}, Ll/۫᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 1626
    invoke-virtual {p0, p1, v0}, Ll/۫᩶ܺ;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1541
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1542
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1547
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->higherKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 1591
    invoke-super {p0}, Ll/ۨ᩶ܺ;->keySet()Ljava/util/SortedSet;

    move-result-object v0

    check-cast v0, Ljava/util/NavigableSet;

    return-object v0
.end method

.method public final keySet()Ljava/util/SortedSet;
    .locals 1

    .line 1591
    invoke-super {p0}, Ll/ۨ᩶ܺ;->keySet()Ljava/util/SortedSet;

    move-result-object v0

    check-cast v0, Ljava/util/NavigableSet;

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 1558
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/NavigableMap;->lastEntry()Ljava/util/Map$Entry;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 1559
    :cond_0
    invoke-virtual {p0, v0}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1508
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1509
    :cond_0
    invoke-virtual {p0, p1}, Ll/᩶᩶ܺ;->֫(Ljava/util/Map$Entry;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1514
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->lowerKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 1591
    invoke-super {p0}, Ll/ۨ᩶ܺ;->keySet()Ljava/util/SortedSet;

    move-result-object v0

    check-cast v0, Ljava/util/NavigableSet;

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 1564
    invoke-virtual {p0}, Ll/ᩴۤܺ;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ll/᩸᩶ܺ;

    invoke-virtual {v0}, Ll/᩸᩶ܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۫᩶ܺ;->֫(Ljava/util/Iterator;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object v0

    return-object v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1

    .line 1569
    invoke-virtual {p0}, Ll/۫᩶ܺ;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v0

    check-cast v0, Ll/ᩴۤܺ;

    invoke-virtual {v0}, Ll/ᩴۤܺ;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ll/᩸᩶ܺ;

    invoke-virtual {v0}, Ll/᩸᩶ܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۫᩶ܺ;->֫(Ljava/util/Iterator;)Ljava/util/AbstractMap$SimpleImmutableEntry;

    move-result-object v0

    return-object v0
.end method

.method public final subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 2

    .line 1621
    new-instance v0, Ll/۫᩶ܺ;

    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Ljava/util/NavigableMap;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    iget-object p2, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    invoke-direct {v0, p2, p1}, Ll/۫᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1612
    invoke-virtual {p0, p1, v0, p2, v1}, Ll/۫᩶ܺ;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 2

    .line 1642
    new-instance v0, Ll/۫᩶ܺ;

    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    iget-object p2, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    invoke-direct {v0, p2, p1}, Ll/۫᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 1636
    invoke-virtual {p0, p1, v0}, Ll/۫᩶ܺ;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/util/Iterator;)Ljava/util/AbstractMap$SimpleImmutableEntry;
    .locals 3

    .line 1574
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1577
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1578
    iget-object v1, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    invoke-virtual {v1}, Ll/ܽۙܺ;->᩻()Ljava/util/Collection;

    move-result-object v1

    .line 1579
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v1, v2}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    .line 1580
    invoke-interface {p1}, Ljava/util/Iterator;->remove()V

    .line 1581
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    .line 63
    check-cast v1, Ljava/util/List;

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 1442
    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, p1, v0}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public final ֫()Ljava/util/SortedSet;
    .locals 3

    .line 1596
    new-instance v0, Ll/ۤ᩶ܺ;

    iget-object v1, p0, Ll/۫᩶ܺ;->۫:Ll/ܽۙܺ;

    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll/ۤ᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final ۧ()Ljava/util/NavigableMap;
    .locals 1

    .line 1443
    iget-object v0, p0, Ll/᩶᩶ܺ;->᩶:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    .line 1503
    check-cast v0, Ljava/util/NavigableMap;

    return-object v0
.end method

.method public final bridge synthetic ۧ()Ljava/util/SortedMap;
    .locals 1

    .line 1495
    invoke-virtual {p0}, Ll/۫᩶ܺ;->ۧ()Ljava/util/NavigableMap;

    move-result-object v0

    return-object v0
.end method
