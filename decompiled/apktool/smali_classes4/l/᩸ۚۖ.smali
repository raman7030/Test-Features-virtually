.class public Ll/᩸ۚۖ;
.super Ljava/util/AbstractMap;
.source "V9PU"


# static fields
.field public static final synthetic ۤ:I


# instance fields
.field public final ۗ:I

.field public volatile ۙ:Ll/ܶۚۖ;

.field public ۫:Ljava/util/Map;

.field public ۬:Ljava/util/Map;

.field public volatile ᩶:Ll/ᩴۚۖ;

.field public ᩸:Ljava/util/List;

.field public ᩹:Z


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 123
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 124
    iput p1, p0, Ll/᩸ۚۖ;->ۗ:I

    .line 125
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object p1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    .line 126
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    iput-object p1, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    .line 127
    iput-object p1, p0, Ll/᩸ۚۖ;->۫:Ljava/util/Map;

    return-void
.end method

.method private ֫(Ljava/lang/Comparable;)I
    .locals 4

    .line 293
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    if-ltz v1, :cond_2

    .line 299
    iget-object v2, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨ۚۖ;

    invoke-virtual {v2}, Ll/֨ۚۖ;->getKey()Ljava/lang/Comparable;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-lez v2, :cond_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    if-nez v2, :cond_2

    return v1

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-gt v0, v1, :cond_0

    add-int v2, v0, v1

    .line 308
    div-int/lit8 v2, v2, 0x2

    .line 309
    iget-object v3, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ۚۖ;

    invoke-virtual {v3}, Ll/֨ۚۖ;->getKey()Ljava/lang/Comparable;

    move-result-object v3

    invoke-interface {p1, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v3

    if-gez v3, :cond_3

    add-int/lit8 v1, v2, -0x1

    goto :goto_0

    :cond_3
    if-lez v3, :cond_4

    add-int/lit8 v0, v2, 0x1

    goto :goto_0

    :cond_4
    return v2

    :goto_1
    neg-int p1, v0

    return p1
.end method

.method public static synthetic ֫(Ll/᩸ۚۖ;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    return-void
.end method

.method public static synthetic ֫(Ll/᩸ۚۖ;I)V
    .locals 0

    .line 60
    invoke-direct {p0, p1}, Ll/᩸ۚۖ;->ܽ(I)Ljava/lang/Object;

    return-void
.end method

.method private ۢ()Ljava/util/SortedMap;
    .locals 1

    .line 355
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    .line 356
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    instance-of v0, v0, Ljava/util/TreeMap;

    if-nez v0, :cond_0

    .line 357
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    .line 358
    invoke-virtual {v0}, Ljava/util/TreeMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ۚۖ;->۫:Ljava/util/Map;

    .line 360
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    check-cast v0, Ljava/util/SortedMap;

    return-object v0
.end method

.method public static synthetic ۧ(Ll/᩸ۚۖ;)Ljava/util/List;
    .locals 0

    .line 60
    iget-object p0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    return-object p0
.end method

.method private ܽ(I)Ljava/lang/Object;
    .locals 5

    .line 274
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    .line 275
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۚۖ;

    invoke-virtual {p1}, Ll/֨ۚۖ;->getValue()Ljava/lang/Object;

    move-result-object p1

    .line 276
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 279
    invoke-direct {p0}, Ll/᩸ۚۖ;->ۢ()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 280
    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    new-instance v2, Ll/֨ۚۖ;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 381
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Comparable;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v2, p0, v4, v3}, Ll/֨ۚۖ;-><init>(Ll/᩸ۚۖ;Ljava/lang/Comparable;Ljava/lang/Object;)V

    .line 280
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 281
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    :cond_0
    return-object p1
.end method

.method public static synthetic ܽ(Ll/᩸ۚۖ;)Ljava/util/Map;
    .locals 0

    .line 60
    iget-object p0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    return-object p0
.end method

.method public static synthetic ᩳ(Ll/᩸ۚۖ;)Ljava/util/Map;
    .locals 0

    .line 60
    iget-object p0, p0, Ll/᩸ۚۖ;->۫:Ljava/util/Map;

    return-object p0
.end method

.method private ᩷()V
    .locals 1

    .line 345
    iget-boolean v0, p0, Ll/᩸ۚۖ;->᩹:Z

    if-nez v0, :cond_0

    return-void

    .line 346
    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 241
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    .line 242
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 243
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 245
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 246
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    :cond_1
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    .line 195
    check-cast p1, Ljava/lang/Comparable;

    .line 196
    invoke-direct {p0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;)I

    move-result v0

    if-gez v0, :cond_1

    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    .line 330
    iget-object v0, p0, Ll/᩸ۚۖ;->ۙ:Ll/ܶۚۖ;

    if-nez v0, :cond_0

    .line 331
    new-instance v0, Ll/ܶۚۖ;

    invoke-direct {v0, p0}, Ll/ܶۚۖ;-><init>(Ll/᩸ۚۖ;)V

    iput-object v0, p0, Ll/᩸ۚۖ;->ۙ:Ll/ܶۚۖ;

    .line 333
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->ۙ:Ll/ܶۚۖ;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    if-ne p0, p1, :cond_0

    goto :goto_2

    .line 645
    :cond_0
    instance-of v0, p1, Ll/᩸ۚۖ;

    if-nez v0, :cond_1

    .line 646
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    .line 649
    :cond_1
    check-cast p1, Ll/᩸ۚۖ;

    .line 650
    invoke-virtual {p0}, Ll/᩸ۚۖ;->size()I

    move-result v0

    .line 651
    invoke-virtual {p1}, Ll/᩸ۚۖ;->size()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    goto :goto_1

    .line 156
    :cond_2
    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    iget-object v3, p1, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-eq v1, v3, :cond_3

    .line 658
    invoke-virtual {p0}, Ll/᩸ۚۖ;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, Ll/᩸ۚۖ;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast v0, Ljava/util/AbstractSet;

    invoke-virtual {v0, p1}, Ljava/util/AbstractSet;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_5

    .line 662
    invoke-virtual {p0, v3}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v4

    invoke-virtual {p1, v3}, Ll/᩸ۚۖ;->ۧ(I)Ljava/util/Map$Entry;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map$Entry;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :goto_1
    return v2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_5
    if-eq v1, v0, :cond_6

    .line 668
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    iget-object p1, p1, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 207
    check-cast p1, Ljava/lang/Comparable;

    .line 208
    invoke-direct {p0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 210
    iget-object p1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۚۖ;

    invoke-virtual {p1}, Ll/֨ۚۖ;->getValue()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 212
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 4

    .line 156
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 679
    iget-object v3, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֨ۚۖ;

    invoke-virtual {v3}, Ll/֨ۚۖ;->hashCode()I

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 166
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 683
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    return v0

    :cond_1
    return v2
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 257
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    .line 259
    check-cast p1, Ljava/lang/Comparable;

    .line 260
    invoke-direct {p0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 262
    invoke-direct {p0, v0}, Ll/᩸ۚۖ;->ܽ(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 266
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 269
    :cond_1
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 2

    .line 184
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫(Ljava/lang/Comparable;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 217
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    .line 218
    invoke-direct {p0, p1}, Ll/᩸ۚۖ;->֫(Ljava/lang/Comparable;)I

    move-result v0

    if-ltz v0, :cond_0

    .line 221
    iget-object p1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/֨ۚۖ;

    invoke-virtual {p1, p2}, Ll/֨ۚۖ;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 365
    :cond_0
    invoke-direct {p0}, Ll/᩸ۚۖ;->᩷()V

    .line 366
    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    iget v2, p0, Ll/᩸ۚۖ;->ۗ:I

    if-eqz v1, :cond_1

    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    instance-of v1, v1, Ljava/util/ArrayList;

    if-nez v1, :cond_1

    .line 367
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    :cond_1
    add-int/lit8 v0, v0, 0x1

    neg-int v0, v0

    if-lt v0, v2, :cond_2

    .line 227
    invoke-direct {p0}, Ll/᩸ۚۖ;->ۢ()Ljava/util/SortedMap;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 230
    :cond_2
    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ne v1, v2, :cond_3

    .line 232
    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    add-int/lit8 v2, v2, -0x1

    invoke-interface {v1, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֨ۚۖ;

    .line 233
    invoke-direct {p0}, Ll/᩸ۚۖ;->ۢ()Ljava/util/SortedMap;

    move-result-object v2

    invoke-virtual {v1}, Ll/֨ۚۖ;->getKey()Ljava/lang/Comparable;

    move-result-object v3

    invoke-virtual {v1}, Ll/֨ۚۖ;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v2, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    :cond_3
    iget-object v1, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    new-instance v2, Ll/֨ۚۖ;

    invoke-direct {v2, p0, p1, p2}, Ll/֨ۚۖ;-><init>(Ll/᩸ۚۖ;Ljava/lang/Comparable;Ljava/lang/Object;)V

    invoke-interface {v1, v0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫()Ljava/util/Set;
    .locals 1

    .line 337
    iget-object v0, p0, Ll/᩸ۚۖ;->᩶:Ll/ᩴۚۖ;

    if-nez v0, :cond_0

    .line 338
    new-instance v0, Ll/ᩴۚۖ;

    invoke-direct {v0, p0}, Ll/ᩴۚۖ;-><init>(Ll/᩸ۚۖ;)V

    iput-object v0, p0, Ll/᩸ۚۖ;->᩶:Ll/ᩴۚۖ;

    .line 340
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->᩶:Ll/ᩴۚۖ;

    return-object v0
.end method

.method public final ۧ()I
    .locals 1

    .line 156
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ۧ(I)Ljava/util/Map$Entry;
    .locals 1

    .line 161
    iget-object v0, p0, Ll/᩸ۚۖ;->᩸:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    return-object p1
.end method

.method public final ܽ()Ljava/lang/Iterable;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 172
    invoke-static {}, Ll/ۚۚۖ;->ۧ()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0

    .line 173
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()Z
    .locals 1

    .line 151
    iget-boolean v0, p0, Ll/᩸ۚۖ;->᩹:Z

    return v0
.end method

.method public ᩻()V
    .locals 1

    .line 132
    iget-boolean v0, p0, Ll/᩸ۚۖ;->᩹:Z

    if-nez v0, :cond_2

    .line 138
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_0

    .line 140
    :cond_0
    iget-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll/᩸ۚۖ;->۬:Ljava/util/Map;

    .line 142
    iget-object v0, p0, Ll/᩸ۚۖ;->۫:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 143
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    goto :goto_1

    .line 144
    :cond_1
    iget-object v0, p0, Ll/᩸ۚۖ;->۫:Ljava/util/Map;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Ll/᩸ۚۖ;->۫:Ljava/util/Map;

    const/4 v0, 0x1

    .line 145
    iput-boolean v0, p0, Ll/᩸ۚۖ;->᩹:Z

    :cond_2
    return-void
.end method
