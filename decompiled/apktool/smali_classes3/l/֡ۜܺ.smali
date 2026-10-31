.class public abstract Ll/֡ۜܺ;
.super Ll/ܿ᩷ܺ;
.source "XBDS"


# virtual methods
.method public final ۢ()V
    .locals 12

    .line 50
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/high16 v3, 0x10000

    if-le v0, v3, :cond_5

    .line 51
    new-instance v0, Ll/ۚۧܺ;

    .line 61
    new-instance v4, Ljava/util/TreeMap;

    invoke-direct {v4}, Ljava/util/TreeMap;-><init>()V

    .line 62
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x2

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    .line 63
    check-cast v6, Ll/᩵ۜܺ;

    invoke-virtual {v6}, Ll/ۡۜܺ;->ܳ()Ll/۫ܺܺ;

    move-result-object v6

    .line 347
    invoke-virtual {v6}, Ll/۫ܺܺ;->ᩴ()Ll/۬ܺܺ;

    move-result-object v6

    invoke-virtual {v6}, Ll/۬ܺܺ;->getString()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0x2f

    .line 348
    invoke-virtual {v6, v8}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v9

    const/16 v10, 0x5b

    .line 349
    invoke-virtual {v6, v10}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v10

    const/4 v11, -0x1

    if-ne v9, v11, :cond_0

    const-string v6, "default"

    goto :goto_1

    :cond_0
    add-int/2addr v10, v7

    .line 354
    invoke-virtual {v6, v10, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    const/16 v7, 0x2e

    invoke-virtual {v6, v8, v7}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v6

    .line 64
    :goto_1
    invoke-virtual {v4, v6}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    if-nez v7, :cond_1

    .line 66
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v7}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    .line 67
    invoke-virtual {v4, v6, v7}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    :cond_1
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    goto :goto_0

    .line 72
    :cond_2
    new-instance v5, Ljava/util/Formatter;

    invoke-direct {v5}, Ljava/util/Formatter;-><init>()V

    .line 74
    :try_start_0
    instance-of v6, p0, Ll/᩸ۜܺ;

    if-eqz v6, :cond_3

    const-string v6, "method"

    goto :goto_2

    :cond_3
    const-string v6, "field"

    :goto_2
    const-string v8, "Too many %1$s references to fit in one dex file: %2$d; max is %3$d.%nYou may try using multi-dex. If multi-dex is enabled then the list of classes for the main dex list is too large.%nReferences by package:"

    .line 79
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v10, 0x3

    new-array v10, v10, [Ljava/lang/Object;

    aput-object v6, v10, v2

    aput-object v9, v10, v1

    aput-object v3, v10, v7

    .line 75
    invoke-virtual {v5, v8, v10}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    .line 80
    invoke-virtual {v4}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    const-string v6, "%n%6d %s"

    .line 81
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    new-array v9, v7, [Ljava/lang/Object;

    aput-object v8, v9, v2

    aput-object v4, v9, v1

    invoke-virtual {v5, v6, v9}, Ljava/util/Formatter;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/util/Formatter;

    goto :goto_3

    .line 83
    :cond_4
    invoke-virtual {v5}, Ljava/util/Formatter;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    invoke-virtual {v5}, Ljava/util/Formatter;->close()V

    const/4 v2, 0x0

    .line 60
    invoke-direct {v0, v1, v2}, Ll/۠ۧܺ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 51
    throw v0

    :catchall_0
    move-exception v0

    .line 85
    invoke-virtual {v5}, Ljava/util/Formatter;->close()V

    .line 86
    throw v0

    .line 54
    :cond_5
    invoke-virtual {p0}, Ll/ۛۜܺ;->ᩳ()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 55
    check-cast v3, Ll/᩵ۜܺ;

    invoke-virtual {v3, v2}, Ll/ܺۜܺ;->֫(I)V

    add-int/2addr v2, v1

    goto :goto_4

    :cond_6
    return-void
.end method
