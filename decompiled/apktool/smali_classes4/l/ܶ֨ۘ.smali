.class public final Ll/ܶ֨ۘ;
.super Ljava/lang/Object;
.source "E8BO"


# instance fields
.field public final ֫:Ljava/util/TreeMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Ll/ܶ֨ۘ;->֫:Ljava/util/TreeMap;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫(Ll/᩸֨ۘ;)Ljava/util/List;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 49
    :try_start_0
    iget-object v1, p0, Ll/ܶ֨ۘ;->֫:Ljava/util/TreeMap;

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 50
    iget-object v1, p0, Ll/ܶ֨ۘ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v1}, Ljava/util/TreeMap;->firstKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸֨ۘ;

    .line 52
    invoke-virtual {v1, p1}, Ll/᩸֨ۘ;->֫(Ll/᩸֨ۘ;)I

    move-result p1

    if-gtz p1, :cond_0

    .line 53
    iget-object p1, p0, Ll/ܶ֨ۘ;->֫:Ljava/util/TreeMap;

    invoke-virtual {p1, v1}, Ljava/util/TreeMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 56
    :goto_0
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

.method public final declared-synchronized ֫(Ll/᩸֨ۘ;Ll/۠֨ۘ;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 39
    :try_start_0
    iget-object v1, p0, Ll/ܶ֨ۘ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v1, p1}, Ljava/util/TreeMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    .line 41
    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    .line 42
    iget-object v2, p0, Ll/ܶ֨ۘ;->֫:Ljava/util/TreeMap;

    invoke-virtual {v2, p1, v1}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    :cond_0
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
