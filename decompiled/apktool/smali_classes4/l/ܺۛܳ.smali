.class public final Ll/ܺۛܳ;
.super Ljava/lang/Object;
.source "HAIH"


# instance fields
.field public final ֫:Ljava/util/LinkedHashMap;

.field public volatile ۧ:J

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ljava/util/Collection;Ljava/util/concurrent/atomic/AtomicLong;)V
    .locals 1

    .line 623
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 618
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Ll/ܺۛܳ;->֫:Ljava/util/LinkedHashMap;

    .line 624
    iput-object p3, p0, Ll/ܺۛܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 625
    invoke-direct {p0, p1}, Ll/ܺۛܳ;->֫(Ll/ܶ᩵ܿ;)V

    .line 626
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܶ᩵ܿ;

    if-eqz p2, :cond_0

    .line 628
    invoke-direct {p0, p2}, Ll/ܺۛܳ;->֫(Ll/ܶ᩵ܿ;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static ֫(Ll/ܺۛܳ;)Ljava/util/List;
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 660
    :try_start_0
    iget-object p0, p0, Ll/ܺۛܳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    .line 0
    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 660
    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method private declared-synchronized ֫(Ll/ܶ᩵ܿ;)V
    .locals 11

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 635
    :try_start_0
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 636
    iget-object v2, p0, Ll/ܺۛܳ;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    .line 637
    monitor-exit v0

    return-void

    .line 639
    :cond_0
    :try_start_1
    iget-object v2, p0, Ll/ܺۛܳ;->֫:Ljava/util/LinkedHashMap;

    .line 612
    new-instance v10, Ll/ۡۛܳ;

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->۠֫()Z

    move-result v5

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->᩺֫()J

    move-result-wide v6

    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۛ֫()J

    move-result-wide v8

    move-object v3, v10

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Ll/ۡۛܳ;-><init>(Ll/ܶ᩵ܿ;ZJJ)V

    .line 639
    invoke-interface {v2, v1, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 641
    iget-object p1, p0, Ll/ܺۛܳ;->ܽ:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ܺۛܳ;->ۧ:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 642
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public static bridge synthetic ֫(Ll/ܺۛܳ;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܺۛܳ;->֫(Ll/ܶ᩵ܿ;)V

    return-void
.end method

.method public static ۧ(Ll/ܺۛܳ;)Ljava/util/List;
    .locals 3

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 651
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ll/ܺۛܳ;->֫:Ljava/util/LinkedHashMap;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 652
    iget-object p0, p0, Ll/ܺۛܳ;->֫:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۡۛܳ;

    .line 653
    invoke-virtual {v2}, Ll/ۡۛܳ;->֫()Ll/ܶ᩵ܿ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 655
    :cond_0
    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static ܽ(Ll/ܺۛܳ;)J
    .locals 2

    .line 646
    iget-wide v0, p0, Ll/ܺۛܳ;->ۧ:J

    return-wide v0
.end method
