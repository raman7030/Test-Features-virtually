.class public final Ll/ᩳ۫ܺ;
.super Ll/ۢ۬ܺ;
.source "F4NW"

# interfaces
.implements Ljava/util/NavigableMap;
.implements Ll/֫۫ᩴ;


# static fields
.field public static final serialVersionUID:J

.field public static final ۤ:Ll/ᩳ۫ܺ;


# instance fields
.field public final transient ۗ:Ll/ᩳ۫ܺ;

.field public final transient ۫:Ll/ܳ۬ܺ;

.field public final transient ۬:Ll/ۢۛܺ;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 115
    new-instance v0, Ll/ᩳ۫ܺ;

    .line 172
    sget-object v1, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 117
    invoke-static {v1}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;)Ll/ۢۛܺ;

    move-result-object v1

    sget v2, Ll/ܳ۬ܺ;->᩹:I

    .line 85
    sget-object v2, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    const/4 v3, 0x0

    .line 818
    invoke-direct {v0, v1, v2, v3}, Ll/ᩳ۫ܺ;-><init>(Ll/ۢۛܺ;Ll/ܳ۬ܺ;Ll/ᩳ۫ܺ;)V

    .line 117
    sput-object v0, Ll/ᩳ۫ܺ;->ۤ:Ll/ᩳ۫ܺ;

    return-void
.end method

.method public constructor <init>(Ll/ۢۛܺ;Ll/ܳ۬ܺ;Ll/ᩳ۫ܺ;)V
    .locals 0

    .line 824
    invoke-direct {p0}, Ll/ۢ۬ܺ;-><init>()V

    .line 825
    iput-object p1, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    .line 826
    iput-object p2, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    .line 827
    iput-object p3, p0, Ll/ᩳ۫ܺ;->ۗ:Ll/ᩳ۫ܺ;

    return-void
.end method

.method public static of()Ll/ᩳ۫ܺ;
    .locals 1

    .line 137
    sget-object v0, Ll/ᩳ۫ܺ;->ۤ:Ll/ᩳ۫ܺ;

    return-object v0
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1201
    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "Use SerializedForm"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ֫(Ll/ᩳ۫ܺ;)Ll/ۢۛܺ;
    .locals 0

    .line 64
    iget-object p0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    return-object p0
.end method

.method private ֫(II)Ll/ᩳ۫ܺ;
    .locals 3

    .line 953
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    if-nez p1, :cond_0

    .line 832
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    if-ne p2, v1, :cond_0

    return-object p0

    .line 955
    :cond_0
    iget-object v1, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    if-ne p1, p2, :cond_1

    .line 567
    iget-object p1, v1, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 956
    invoke-static {p1}, Ll/ᩳ۫ܺ;->֫(Ljava/util/Comparator;)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1

    .line 958
    :cond_1
    new-instance v2, Ll/ᩳ۫ܺ;

    .line 959
    invoke-virtual {v1, p1, p2}, Ll/ۢۛܺ;->ۧ(II)Ll/ۢۛܺ;

    move-result-object v1

    invoke-virtual {v0, p1, p2}, Ll/ܳ۬ܺ;->subList(II)Ll/ܳ۬ܺ;

    move-result-object p1

    const/4 p2, 0x0

    .line 818
    invoke-direct {v2, v1, p1, p2}, Ll/ᩳ۫ܺ;-><init>(Ll/ۢۛܺ;Ll/ܳ۬ܺ;Ll/ᩳ۫ܺ;)V

    return-object v2
.end method

.method public static ֫(Ljava/util/Comparator;)Ll/ᩳ۫ܺ;
    .locals 3

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    .line 120
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    sget-object p0, Ll/ᩳ۫ܺ;->ۤ:Ll/ᩳ۫ܺ;

    return-object p0

    .line 123
    :cond_0
    new-instance v0, Ll/ᩳ۫ܺ;

    .line 124
    invoke-static {p0}, Ll/᩻۫ܺ;->֫(Ljava/util/Comparator;)Ll/ۢۛܺ;

    move-result-object p0

    .line 85
    sget-object v1, Ll/ܽۛܺ;->۬:Ll/ܳ۬ܺ;

    const/4 v2, 0x0

    .line 818
    invoke-direct {v0, p0, v1, v2}, Ll/ᩳ۫ܺ;-><init>(Ll/ۢۛܺ;Ll/ܳ۬ܺ;Ll/ᩳ۫ܺ;)V

    return-object v0
.end method

.method public static synthetic ۧ(Ll/ᩳ۫ܺ;)Ll/ܳ۬ܺ;
    .locals 0

    .line 64
    iget-object p0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    return-object p0
.end method


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    .line 1086
    invoke-virtual {p0, p1, v0}, Ll/ᩳ۫ܺ;->tailMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳ۫ܺ;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1091
    invoke-virtual {p0, p1}, Ll/ᩳ۫ܺ;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    .line 567
    iget-object v0, v0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    return-object v0
.end method

.method public final descendingKeySet()Ljava/util/NavigableSet;
    .locals 2

    .line 747
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    iget-object v1, v0, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    if-nez v1, :cond_0

    .line 749
    invoke-virtual {v0}, Ll/ۢۛܺ;->ۢ()Ll/᩻۫ܺ;

    move-result-object v1

    iput-object v1, v0, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    .line 750
    iput-object v0, v1, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    :cond_0
    return-object v1
.end method

.method public final descendingMap()Ljava/util/NavigableMap;
    .locals 3

    .line 1150
    iget-object v0, p0, Ll/ᩳ۫ܺ;->ۗ:Ll/ᩳ۫ܺ;

    if-nez v0, :cond_2

    .line 1151
    invoke-virtual {p0}, Ll/ۢ۬ܺ;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    if-eqz v0, :cond_0

    .line 567
    iget-object v0, v1, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 1152
    invoke-static {v0}, Ll/ۤۤܺ;->ۧ(Ljava/util/Comparator;)Ll/ۤۤܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۤۤܺ;->֫()Ll/ۤۤܺ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ۫ܺ;->֫(Ljava/util/Comparator;)Ll/ᩳ۫ܺ;

    move-result-object v0

    return-object v0

    .line 1154
    :cond_0
    new-instance v0, Ll/ᩳ۫ܺ;

    .line 747
    iget-object v2, v1, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    if-nez v2, :cond_1

    .line 749
    invoke-virtual {v1}, Ll/ۢۛܺ;->ۢ()Ll/᩻۫ܺ;

    move-result-object v2

    iput-object v2, v1, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    .line 750
    iput-object v1, v2, Ll/᩻۫ܺ;->ۗ:Ll/᩻۫ܺ;

    .line 1155
    :cond_1
    check-cast v2, Ll/ۢۛܺ;

    iget-object v1, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ll/ܳ۬ܺ;->᩻()Ll/ܳ۬ܺ;

    move-result-object v1

    invoke-direct {v0, v2, v1, p0}, Ll/ᩳ۫ܺ;-><init>(Ll/ۢۛܺ;Ll/ܳ۬ܺ;Ll/ᩳ۫ܺ;)V

    :cond_2
    return-object v0
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 849
    invoke-super {p0}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v0

    return-object v0
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 1106
    invoke-virtual {p0}, Ll/ۢ۬ܺ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 849
    :cond_0
    invoke-super {p0}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v0

    .line 1106
    invoke-virtual {v0}, Ll/ۛ۬ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    .line 944
    invoke-virtual {v0}, Ll/ۢۛܺ;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    .line 1076
    invoke-virtual {p0, p1, v0}, Ll/ᩳ۫ܺ;->headMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳ۫ܺ;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1081
    invoke-virtual {p0, p1}, Ll/ᩳ۫ܺ;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 837
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, -0x1

    if-nez p1, :cond_0

    goto :goto_0

    .line 296
    :cond_0
    :try_start_0
    iget-object v2, v0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    .line 275
    iget-object v0, v0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 296
    invoke-static {v2, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-ltz p1, :cond_1

    goto :goto_1

    :catch_0
    :cond_1
    :goto_0
    const/4 p1, -0x1

    :goto_1
    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    .line 838
    :cond_2
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    return-object p1
.end method

.method public final bridge synthetic headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2}, Ll/ᩳ۫ܺ;->headMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 974
    invoke-virtual {p0, p1, v0}, Ll/ᩳ۫ܺ;->headMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final headMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 990
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    invoke-virtual {v0, p1, p2}, Ll/ۢۛܺ;->ܽ(Ljava/lang/Object;Z)I

    move-result p1

    const/4 p2, 0x0

    invoke-direct {p0, p2, p1}, Ll/ᩳ۫ܺ;->֫(II)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    .line 1096
    invoke-virtual {p0, p1, v0}, Ll/ᩳ۫ܺ;->tailMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳ۫ܺ;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1101
    invoke-virtual {p0, p1}, Ll/ᩳ۫ܺ;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    return-object v0
.end method

.method public final keySet()Ll/ۛ۬ܺ;
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 2

    .line 1111
    invoke-virtual {p0}, Ll/ۢ۬ܺ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 849
    :cond_0
    invoke-super {p0}, Ll/ۢ۬ܺ;->entrySet()Ll/ۛ۬ܺ;

    move-result-object v0

    .line 1111
    invoke-virtual {v0}, Ll/ۛ۬ܺ;->ۧ()Ll/ܳ۬ܺ;

    move-result-object v0

    .line 832
    iget-object v1, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1111
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    .line 910
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    .line 949
    invoke-virtual {v0}, Ll/ۢۛܺ;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    .line 1066
    invoke-virtual {p0, p1, v0}, Ll/ᩳ۫ܺ;->headMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ᩳ۫ܺ;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1071
    invoke-virtual {p0, p1}, Ll/ᩳ۫ܺ;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    invoke-static {p1}, Ll/᩵ۤܺ;->֫(Ljava/util/Map$Entry;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    .line 1163
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1125
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1139
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final size()I
    .locals 1

    .line 832
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2, p3, p4}, Ll/ᩳ۫ܺ;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1005
    invoke-virtual {p0, p1, v0, p2, v1}, Ll/ᩳ۫ܺ;->subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ll/ᩳ۫ܺ;
    .locals 2

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    .line 567
    iget-object v0, v0, Ll/᩻۫ܺ;->ۙ:Ljava/util/Comparator;

    .line 1027
    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "expected fromKey <= toKey but %s > %s"

    .line 1026
    invoke-static {v0, v1, p1, p3}, Ll/ۘܶܺ;->֫(ZLjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1031
    invoke-virtual {p0, p3, p4}, Ll/ᩳ۫ܺ;->headMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Ll/ᩳ۫ܺ;->tailMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 63
    invoke-virtual {p0, p1, p2}, Ll/ᩳ۫ܺ;->tailMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 1045
    invoke-virtual {p0, p1, v0}, Ll/ᩳ۫ܺ;->tailMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;Z)Ll/ᩳ۫ܺ;
    .locals 1

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    invoke-virtual {v0, p1, p2}, Ll/ۢۛܺ;->ᩳ(Ljava/lang/Object;Z)I

    move-result p1

    .line 832
    iget-object p2, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 1061
    invoke-direct {p0, p1, p2}, Ll/ᩳ۫ܺ;->֫(II)Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    .line 924
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public final values()Ll/᩺ۗܺ;
    .locals 1

    .line 924
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    return-object v0
.end method

.method public writeReplace()Ljava/lang/Object;
    .locals 1

    .line 1196
    new-instance v0, Ll/ܽ۫ܺ;

    invoke-direct {v0, p0}, Ll/ܽ۫ܺ;-><init>(Ll/ᩳ۫ܺ;)V

    return-object v0
.end method

.method public final ֫()Ll/ۛ۬ܺ;
    .locals 1

    .line 904
    invoke-virtual {p0}, Ll/ۢ۬ܺ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Ll/ۛ۬ܺ;->᩶:I

    .line 79
    sget-object v0, Ll/᩷ۛܺ;->ۛ:Ll/᩷ۛܺ;

    return-object v0

    .line 904
    :cond_0
    new-instance v0, Ll/֫۫ܺ;

    invoke-direct {v0, p0}, Ll/֫۫ܺ;-><init>(Ll/ᩳ۫ܺ;)V

    return-object v0
.end method

.method public final ۧ()Ll/ۛ۬ܺ;
    .locals 2

    .line 915
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ܽ()Ll/᩺ۗܺ;
    .locals 2

    .line 929
    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "should never be called"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 843
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۬:Ll/ۢۛܺ;

    .line 151
    iget-object v0, v0, Ll/ۢۛܺ;->۬:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v0

    if-nez v0, :cond_1

    .line 843
    iget-object v0, p0, Ll/ᩳ۫ܺ;->۫:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/᩺ۗܺ;->ܳ()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method
