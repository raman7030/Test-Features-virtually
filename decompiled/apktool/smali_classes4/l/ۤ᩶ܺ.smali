.class public final Ll/ۤ᩶ܺ;
.super Ll/᩺᩶ܺ;
.source "O3K3"

# interfaces
.implements Ljava/util/NavigableSet;


# instance fields
.field public final synthetic ۙ:Ll/ܽۙܺ;


# direct methods
.method public constructor <init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V
    .locals 0

    .line 1048
    iput-object p1, p0, Ll/ۤ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    .line 1049
    invoke-direct {p0, p1, p2}, Ll/᩺᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/SortedMap;)V

    return-void
.end method


# virtual methods
.method public final ceiling(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1069
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final descendingIterator()Ljava/util/Iterator;
    .locals 1

    .line 1094
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->descendingSet()Ljava/util/NavigableSet;

    move-result-object v0

    check-cast v0, Ll/۬᩶ܺ;

    invoke-virtual {v0}, Ll/۬᩶ܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final descendingSet()Ljava/util/NavigableSet;
    .locals 3

    .line 1089
    new-instance v0, Ll/ۤ᩶ܺ;

    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    iget-object v2, p0, Ll/ۤ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-direct {v0, v2, v1}, Ll/ۤ᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final floor(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1064
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->floorKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 2

    .line 1104
    new-instance v0, Ll/ۤ᩶ܺ;

    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    iget-object p2, p0, Ll/ۤ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-direct {v0, p2, p1}, Ll/ۤ᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    const/4 v0, 0x0

    .line 1099
    invoke-virtual {p0, p1, v0}, Ll/ۤ᩶ܺ;->headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final higher(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1074
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->higherKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final lower(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1059
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->lowerKey(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1

    .line 1079
    invoke-virtual {p0}, Ll/۬᩶ܺ;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ۫ܺ;->ۧ(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1

    .line 1084
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->descendingIterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ۫ܺ;->ۧ(Ljava/util/Iterator;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 2

    .line 1119
    new-instance v0, Ll/ۤ᩶ܺ;

    .line 1120
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1, p1, p2, p3, p4}, Ljava/util/NavigableMap;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    iget-object p2, p0, Ll/ۤ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-direct {v0, p2, p1}, Ll/ۤ᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1110
    invoke-virtual {p0, p1, v0, p2, v1}, Ll/ۤ᩶ܺ;->subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 2

    .line 1130
    new-instance v0, Ll/ۤ᩶ܺ;

    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object p1

    iget-object p2, p0, Ll/ۤ᩶ܺ;->ۙ:Ll/ܽۙܺ;

    invoke-direct {v0, p2, p1}, Ll/ۤ᩶ܺ;-><init>(Ll/ܽۙܺ;Ljava/util/NavigableMap;)V

    return-object v0
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 1

    const/4 v0, 0x1

    .line 1125
    invoke-virtual {p0, p1, v0}, Ll/ۤ᩶ܺ;->tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;

    move-result-object p1

    return-object p1
.end method

.method public final ܽ()Ljava/util/NavigableMap;
    .locals 1

    .line 3745
    iget-object v0, p0, Ll/ۡۤܺ;->᩸:Ljava/util/Map;

    .line 1010
    check-cast v0, Ljava/util/SortedMap;

    .line 1054
    check-cast v0, Ljava/util/NavigableMap;

    return-object v0
.end method

.method public final bridge synthetic ܽ()Ljava/util/SortedMap;
    .locals 1

    .line 1046
    invoke-virtual {p0}, Ll/ۤ᩶ܺ;->ܽ()Ljava/util/NavigableMap;

    move-result-object v0

    return-object v0
.end method
