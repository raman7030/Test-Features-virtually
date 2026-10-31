.class public final Ll/ۚۨܺ;
.super Ll/ۜۙܺ;
.source "O5F3"


# instance fields
.field public final ᩸:Ljava/util/NavigableMap;

.field public final ᩹:Ll/ܰۤܺ;


# direct methods
.method public constructor <init>(Ljava/util/NavigableMap;)V
    .locals 0

    .line 3586
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 295
    iput-object p1, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    .line 296
    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    return-void
.end method

.method public constructor <init>(Ljava/util/NavigableMap;Ll/ܰۤܺ;)V
    .locals 0

    .line 3586
    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    .line 301
    iput-object p1, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    .line 302
    iput-object p2, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    return-void
.end method

.method private ֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;
    .locals 3

    .line 306
    iget-object v0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ܽ(Ll/ܰۤܺ;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 307
    new-instance v1, Ll/ۚۨܺ;

    iget-object v2, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    invoke-virtual {p1, v0}, Ll/ܰۤܺ;->ۧ(Ll/ܰۤܺ;)Ll/ܰۤܺ;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Ll/ۚۨܺ;-><init>(Ljava/util/NavigableMap;Ll/ܰۤܺ;)V

    return-object v1

    .line 309
    :cond_0
    invoke-static {}, Ll/ᩳ۫ܺ;->of()Ll/ᩳ۫ܺ;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic ֫(Ll/ۚۨܺ;)Ll/ܰۤܺ;
    .locals 0

    .line 284
    iget-object p0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    return-object p0
.end method


# virtual methods
.method public final comparator()Ljava/util/Comparator;
    .locals 1

    .line 172
    sget-object v0, Ll/۬ۤܺ;->᩸:Ll/۬ۤܺ;

    return-object v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 0

    .line 339
    invoke-virtual {p0, p1}, Ll/ۚۨܺ;->get(Ljava/lang/Object;)Ll/ܰۤܺ;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 283
    invoke-virtual {p0, p1}, Ll/ۚۨܺ;->get(Ljava/lang/Object;)Ll/ܰۤܺ;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ll/ܰۤܺ;
    .locals 3

    .line 344
    instance-of v0, p1, Ll/ۘۗܺ;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    .line 347
    :try_start_0
    check-cast p1, Ll/ۘۗܺ;

    .line 348
    iget-object v0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    invoke-virtual {v0, p1}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object v1

    .line 351
    :cond_0
    iget-object v0, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    invoke-interface {v0, p1}, Ljava/util/NavigableMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 352
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۤܺ;

    iget-object v2, v2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v2, p1}, Ll/ۘۗܺ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    .line 353
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۤܺ;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    :cond_1
    return-object v1
.end method

.method public final headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 283
    check-cast p1, Ll/ۘۗܺ;

    .line 324
    invoke-static {p2}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰۤܺ;->ۧ(Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۚۨܺ;->֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 2

    .line 443
    iget-object v0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 444
    iget-object v0, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0

    .line 445
    :cond_0
    invoke-virtual {p0}, Ll/ۚۨܺ;->֫()Ljava/util/Iterator;

    move-result-object v0

    check-cast v0, Ll/֨᩶ܺ;

    invoke-virtual {v0}, Ll/֨᩶ܺ;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public final size()I
    .locals 2

    .line 435
    iget-object v0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    invoke-static {}, Ll/ܰۤܺ;->ᩳ()Ll/ܰۤܺ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ܰۤܺ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 436
    iget-object v0, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0

    .line 438
    :cond_0
    invoke-virtual {p0}, Ll/ۚۨܺ;->֫()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ۫ܺ;->ܽ(Ljava/util/Iterator;)I

    move-result v0

    return v0
.end method

.method public final subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 283
    check-cast p1, Ll/ۘۗܺ;

    check-cast p3, Ll/ۘۗܺ;

    .line 318
    invoke-static {p2}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p2

    .line 319
    invoke-static {p4}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p4

    .line 317
    invoke-static {p1, p2, p3, p4}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;Ll/ۘۙܺ;Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;

    move-result-object p1

    .line 316
    invoke-direct {p0, p1}, Ll/ۚۨܺ;->֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 283
    check-cast p1, Ll/ۘۗܺ;

    .line 329
    invoke-static {p2}, Ll/ۘۙܺ;->֫(Z)Ll/ۘۙܺ;

    move-result-object p2

    invoke-static {p1, p2}, Ll/ܰۤܺ;->֫(Ljava/lang/Comparable;Ll/ۘۙܺ;)Ll/ܰۤܺ;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۚۨܺ;->֫(Ll/ܰۤܺ;)Ljava/util/NavigableMap;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ljava/util/Iterator;
    .locals 5

    .line 339
    iget-object v0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    iget-object v1, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    iget-object v0, v0, Ll/ܰۤܺ;->᩸:Ll/ۘۗܺ;

    .line 117
    invoke-static {}, Ll/ܺۗܺ;->᩻()Ll/ܺۗܺ;

    move-result-object v2

    .line 339
    iget-object v3, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    if-eq v1, v2, :cond_2

    .line 349
    invoke-virtual {v0}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v1

    .line 373
    check-cast v1, Ll/ۘۗܺ;

    invoke-interface {v3, v1}, Ljava/util/NavigableMap;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object v1

    if-nez v1, :cond_0

    .line 375
    invoke-interface {v3}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 376
    :cond_0
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۤܺ;

    iget-object v2, v2, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0, v2}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    .line 377
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘۗܺ;

    invoke-interface {v3, v0, v4}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 349
    :cond_1
    invoke-virtual {v0}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v0

    .line 381
    check-cast v0, Ll/ۘۗܺ;

    invoke-interface {v3, v0, v4}, Ljava/util/NavigableMap;->tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object v0

    .line 382
    invoke-interface {v0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v0

    .line 383
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0

    .line 370
    :cond_2
    invoke-interface {v3}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 386
    :goto_0
    new-instance v1, Ll/᩵ۨܺ;

    invoke-direct {v1, p0, v0}, Ll/᩵ۨܺ;-><init>(Ll/ۚۨܺ;Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final ۧ()Ljava/util/Iterator;
    .locals 4

    .line 365
    iget-object v0, p0, Ll/ۚۨܺ;->᩹:Ll/ܰۤܺ;

    iget-object v1, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    iget-object v0, v0, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    .line 224
    invoke-static {}, Ll/ۢۗܺ;->᩻()Ll/ۢۗܺ;

    move-result-object v2

    .line 365
    iget-object v3, p0, Ll/ۚۨܺ;->᩸:Ljava/util/NavigableMap;

    if-eq v1, v2, :cond_0

    .line 375
    invoke-virtual {v0}, Ll/ۘۗܺ;->֫()Ljava/lang/Comparable;

    move-result-object v1

    .line 408
    check-cast v1, Ll/ۘۗܺ;

    const/4 v2, 0x0

    invoke-interface {v3, v1, v2}, Ljava/util/NavigableMap;->headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;

    move-result-object v1

    .line 409
    invoke-interface {v1}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    .line 410
    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    goto :goto_0

    .line 412
    :cond_0
    invoke-interface {v3}, Ljava/util/NavigableMap;->descendingMap()Ljava/util/NavigableMap;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    move-result-object v1

    .line 414
    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-static {v1}, Ll/ۙ۫ܺ;->֫(Ljava/util/Iterator;)Ll/ۛۤܺ;

    move-result-object v1

    .line 415
    move-object v2, v1

    check-cast v2, Ll/᩹۫ܺ;

    invoke-virtual {v2}, Ll/᩹۫ܺ;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 416
    invoke-virtual {v2}, Ll/᩹۫ܺ;->peek()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܰۤܺ;

    iget-object v3, v3, Ll/ܰۤܺ;->᩹:Ll/ۘۗܺ;

    invoke-virtual {v0, v3}, Ll/ۘۗܺ;->֫(Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 417
    invoke-virtual {v2}, Ll/᩹۫ܺ;->next()Ljava/lang/Object;

    .line 419
    :cond_1
    new-instance v0, Ll/֡ۨܺ;

    invoke-direct {v0, p0, v1}, Ll/֡ۨܺ;-><init>(Ll/ۚۨܺ;Ll/ۛۤܺ;)V

    return-object v0
.end method
