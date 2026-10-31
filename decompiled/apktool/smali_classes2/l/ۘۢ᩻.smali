.class public final Ll/ۘۢ᩻;
.super Ljava/lang/Object;
.source "W79N"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public final ۧ:Ljava/util/LinkedHashMap;

.field public final ܽ:Ljava/util/LinkedHashSet;

.field public final ܿ:Ljava/util/LinkedHashSet;

.field public final ᩳ:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 485
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 486
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۘۢ᩻;->֫:Ljava/util/LinkedHashMap;

    .line 487
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ۘۢ᩻;->ۧ:Ljava/util/LinkedHashMap;

    .line 489
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۘۢ᩻;->ᩳ:Ljava/util/LinkedHashSet;

    .line 491
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۘۢ᩻;->ܽ:Ljava/util/LinkedHashSet;

    .line 493
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object v0, p0, Ll/ۘۢ᩻;->ܿ:Ljava/util/LinkedHashSet;

    return-void
.end method

.method private ֫(ILjava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 5

    .line 627
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 628
    iget-object v1, p0, Ll/ۘۢ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    .line 629
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۢ᩻;

    .line 630
    invoke-static {v3}, Ll/ᩴۢ᩻;->ܽ(Ll/ᩴۢ᩻;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-static {v3}, Ll/ᩴۢ᩻;->ۧ(Ll/ᩴۢ᩻;)Ll/ۧۢ᩻;

    move-result-object v4

    invoke-static {v4}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v4

    if-ne v4, p1, :cond_0

    invoke-static {v3}, Ll/ᩴۢ᩻;->ۧ(Ll/ᩴۢ᩻;)Ll/ۧۢ᩻;

    move-result-object v3

    invoke-static {v3}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v3

    .line 631
    invoke-static {v3, p3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 632
    :cond_1
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method private ֫(Ljava/lang/String;)Ll/ᩴۢ᩻;
    .locals 3

    .line 656
    iget-object v0, p0, Ll/ۘۢ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۢ᩻;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 660
    :cond_0
    invoke-static {v0}, Ll/ᩴۢ᩻;->֫(Ll/ᩴۢ᩻;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/ۘۢ᩻;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/LinkedHashSet;

    if-eqz v1, :cond_1

    .line 662
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 663
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 664
    invoke-static {v0}, Ll/ᩴۢ᩻;->֫(Ll/ᩴۢ᩻;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method private ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧۢ᩻;Z)V
    .locals 1

    .line 642
    invoke-direct {p0, p1}, Ll/ۘۢ᩻;->֫(Ljava/lang/String;)Ll/ᩴۢ᩻;

    .line 643
    new-instance v0, Ll/ᩴۢ᩻;

    invoke-direct {v0, p2, p3, p4}, Ll/ᩴۢ᩻;-><init>(Ljava/lang/String;Ll/ۧۢ᩻;Z)V

    iget-object p3, p0, Ll/ۘۢ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {p3, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 644
    iget-object p3, p0, Ll/ۘۢ᩻;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p3, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/util/LinkedHashSet;

    if-nez p4, :cond_0

    .line 646
    new-instance p4, Ljava/util/LinkedHashSet;

    invoke-direct {p4}, Ljava/util/LinkedHashSet;-><init>()V

    .line 647
    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 649
    :cond_0
    invoke-virtual {p4, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static ۧ(ILjava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 674
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    sget v1, Ll/֡ۢ᩻;->֫:I

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "|"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private ۧ(ILjava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 611
    iget-object v0, p0, Ll/ۘۢ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ᩴۢ᩻;

    if-eqz p2, :cond_0

    .line 612
    invoke-static {p2}, Ll/ᩴۢ᩻;->ܽ(Ll/ᩴۢ᩻;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    .line 615
    :cond_0
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ᩴۢ᩻;

    .line 616
    invoke-static {v0}, Ll/ᩴۢ᩻;->ܽ(Ll/ᩴۢ᩻;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Ll/ᩴۢ᩻;->ۧ(Ll/ᩴۢ᩻;)Ll/ۧۢ᩻;

    move-result-object v1

    invoke-static {v1}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v1

    if-ne v1, p1, :cond_1

    invoke-static {v0}, Ll/ᩴۢ᩻;->ۧ(Ll/ᩴۢ᩻;)Ll/ۧۢ᩻;

    move-result-object v0

    invoke-static {v0}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final declared-synchronized ֫(ILjava/lang/String;)Ljava/util/ArrayList;
    .locals 6

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 571
    :try_start_0
    iget-object v1, p0, Ll/ۘۢ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-static {p1, p2}, Ll/ۘۢ᩻;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 572
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 573
    iget-object v2, p0, Ll/ۘۢ᩻;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    .line 574
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴۢ᩻;

    .line 575
    invoke-static {v4}, Ll/ᩴۢ᩻;->ܽ(Ll/ᩴۢ᩻;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-static {v4}, Ll/ᩴۢ᩻;->ۧ(Ll/ᩴۢ᩻;)Ll/ۧۢ᩻;

    move-result-object v5

    invoke-static {v5}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v5

    if-ne v5, p1, :cond_0

    invoke-static {v4}, Ll/ᩴۢ᩻;->ۧ(Ll/ᩴۢ᩻;)Ll/ۧۢ᩻;

    move-result-object v4

    invoke-static {v4}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p2}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 576
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 579
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    .line 580
    invoke-direct {p0, p2}, Ll/ۘۢ᩻;->֫(Ljava/lang/String;)Ll/ᩴۢ᩻;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 582
    :cond_2
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 550
    :try_start_0
    iget-object v1, p0, Ll/ۘۢ᩻;->ᩳ:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 551
    iget-object v1, p0, Ll/ۘۢ᩻;->ܽ:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, p2}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 552
    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 553
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 554
    iget-object p1, p0, Ll/ۘۢ᩻;->ۧ:Ljava/util/LinkedHashMap;

    invoke-virtual {p1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/LinkedHashSet;

    if-eqz p1, :cond_0

    .line 556
    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 558
    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 559
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 560
    invoke-direct {p0, v1}, Ll/ۘۢ᩻;->֫(Ljava/lang/String;)Ll/ᩴۢ᩻;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 561
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 564
    :cond_2
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧۢ᩻;)Ljava/util/ArrayList;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 527
    :try_start_0
    invoke-static {p3}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v2

    invoke-direct {p0, v2, p1, v1}, Ll/ۘۢ᩻;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    .line 528
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 529
    invoke-direct {p0, v3}, Ll/ۘۢ᩻;->֫(Ljava/lang/String;)Ll/ᩴۢ᩻;

    goto :goto_0

    .line 532
    :cond_0
    iget-object v2, p0, Ll/ۘۢ᩻;->ᩳ:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 533
    iget-object v2, p0, Ll/ۘۢ᩻;->ܽ:Ljava/util/LinkedHashSet;

    invoke-virtual {v2, p2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    .line 534
    iget-object v2, p0, Ll/ۘۢ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-static {p3}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p3}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v4

    invoke-static {v4, v3}, Ll/ۘۢ᩻;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z

    const/4 v2, 0x0

    .line 535
    invoke-direct {p0, p1, p2, p3, v2}, Ll/ۘۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧۢ᩻;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 536
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۧ(Ljava/lang/String;Ljava/lang/String;Ll/ۧۢ᩻;)Z
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 506
    :try_start_0
    iget-object v1, p0, Ll/ۘۢ᩻;->ᩳ:Ljava/util/LinkedHashSet;

    invoke-virtual {v1, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۘۢ᩻;->ܽ:Ljava/util/LinkedHashSet;

    .line 507
    invoke-virtual {v1, p2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ۘۢ᩻;->ܿ:Ljava/util/LinkedHashSet;

    invoke-static {p3}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p3}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v3

    .line 508
    invoke-static {v3, v2}, Ll/ۘۢ᩻;->ۧ(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {p3}, Ll/ۧۢ᩻;->֫(Ll/ۧۢ᩻;)Ljava/lang/String;

    move-result-object v1

    invoke-static {p3}, Ll/ۧۢ᩻;->ۧ(Ll/ۧۢ᩻;)I

    move-result v2

    .line 509
    invoke-direct {p0, v2, p1, v1}, Ll/ۘۢ᩻;->ۧ(ILjava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 512
    invoke-direct {p0, p1, p2, p3, v1}, Ll/ۘۢ᩻;->֫(Ljava/lang/String;Ljava/lang/String;Ll/ۧۢ᩻;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 513
    monitor-exit v0

    return v1

    .line 510
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
