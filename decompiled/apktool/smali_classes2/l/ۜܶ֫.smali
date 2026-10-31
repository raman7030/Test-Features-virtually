.class public final Ll/ۜܶ֫;
.super Ljava/lang/Object;
.source "W8NJ"


# instance fields
.field public final ֫:Ljava/util/HashMap;

.field public ۧ:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۜܶ֫;->֫:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()Ljava/util/Map;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 140
    :try_start_0
    iget-object v1, p0, Ll/ۜܶ֫;->ۧ:Ljava/util/Map;

    if-nez v1, :cond_0

    .line 141
    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Ll/ۜܶ֫;->֫:Ljava/util/HashMap;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1

    iput-object v1, p0, Ll/ۜܶ֫;->ۧ:Ljava/util/Map;

    .line 143
    :cond_0
    iget-object v1, p0, Ll/ۜܶ֫;->ۧ:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/util/Map;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x0

    .line 113
    :try_start_0
    iput-object v1, p0, Ll/ۜܶ֫;->ۧ:Ljava/util/Map;

    .line 114
    iget-object v1, p0, Ll/ۜܶ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->clear()V

    .line 115
    iget-object v1, p0, Ll/ۜܶ֫;->֫:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 116
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
