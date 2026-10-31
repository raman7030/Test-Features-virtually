.class public Lcom/umeng/commonsdk/statistics/TagHelper;
.super Ljava/lang/Object;
.source "TagHelper.java"


# static fields
.field public static lock:Ljava/lang/Object;

.field public static moduleTags:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 12
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/TagHelper;->lock:Ljava/lang/Object;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static deleteModuleTag(Ljava/lang/String;)V
    .locals 3

    .line 32
    sget-object v1, Lcom/umeng/commonsdk/statistics/TagHelper;->lock:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 34
    :try_start_0
    sget-object v2, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 35
    sget-object v2, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    :catchall_0
    :cond_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw p0
.end method

.method public static getModuleTags()Ljava/util/Map;
    .locals 6

    .line 44
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 45
    sget-object v2, Lcom/umeng/commonsdk/statistics/TagHelper;->lock:Ljava/lang/Object;

    move-object v0, v2

    monitor-enter v0

    .line 47
    :try_start_0
    sget-object v3, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v3

    if-lez v3, :cond_0

    .line 48
    sget-object v3, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map$Entry;

    .line 49
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 55
    :catchall_0
    :cond_0
    :try_start_1
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0
.end method

.method public static setModuleTag(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 16
    sget-object v1, Lcom/umeng/commonsdk/statistics/TagHelper;->lock:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 18
    :try_start_0
    sget-object v2, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->size()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_0

    .line 20
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    .line 22
    :cond_0
    :try_start_2
    sget-object v2, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 23
    sget-object v2, Lcom/umeng/commonsdk/statistics/TagHelper;->moduleTags:Ljava/util/Map;

    invoke-interface {v2, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 28
    :catchall_0
    :cond_1
    :try_start_3
    monitor-exit v0

    return-void

    :catchall_1
    move-exception p0

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p0
.end method
