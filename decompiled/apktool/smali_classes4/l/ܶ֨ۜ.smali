.class public final Ll/ܶ֨ۜ;
.super Ljava/lang/Object;
.source "I73O"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۙ:Ll/۠֨ۜ;

.field public final ᩶:Ljava/util/ArrayList;

.field public ᩸:Z

.field public ᩹:J


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    sget-object v0, Ll/۠֨ۜ;->᩶:Ll/۠֨ۜ;

    iput-object v0, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    .line 20
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܶ֨ۜ;->᩶:Ljava/util/ArrayList;

    return-void
.end method

.method private ۜ()V
    .locals 4

    .line 129
    iget-object v0, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v1, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-eq v0, v1, :cond_0

    .line 130
    iput-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    .line 131
    iget-wide v0, p0, Ll/ܶ֨ۜ;->᩹:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܶ֨ۜ;->᩹:J

    :cond_0
    return-void
.end method

.method private ᩻()V
    .locals 4

    .line 121
    iget-object v0, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v1, Ll/۠֨ۜ;->᩹:Ll/۠֨ۜ;

    if-eq v0, v1, :cond_0

    .line 122
    iput-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    .line 123
    iget-wide v0, p0, Ll/ܶ֨ۜ;->᩹:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ܶ֨ۜ;->᩹:J

    .line 125
    :cond_0
    iget-object v0, p0, Ll/ܶ֨ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 94
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 95
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 97
    :try_start_1
    iput-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    .line 98
    invoke-direct {p0}, Ll/ܶ֨ۜ;->᩻()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 99
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ll/֨֨ۜ;Ll/֡֨ۜ;)Ljava/util/List;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 37
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    if-nez v1, :cond_7

    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v2, Ll/۠֨ۜ;->᩹:Ll/۠֨ۜ;

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 40
    :cond_0
    sget-object v2, Ll/֨֨ۜ;->᩹:Ll/֨֨ۜ;

    if-ne p1, v2, :cond_1

    .line 41
    invoke-direct {p0}, Ll/ܶ֨ۜ;->᩻()V

    .line 42
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 44
    :cond_1
    :try_start_1
    sget-object v2, Ll/֨֨ۜ;->ۙ:Ll/֨֨ۜ;

    if-ne p1, v2, :cond_4

    .line 45
    invoke-direct {p0}, Ll/ܶ֨ۜ;->ۜ()V

    if-eqz p2, :cond_2

    .line 47
    iget-object p1, p0, Ll/ܶ֨ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 111
    :cond_2
    iget-object p1, p0, Ll/ܶ֨ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 112
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 114
    :cond_3
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 115
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object p1, p2

    .line 49
    :goto_0
    monitor-exit v0

    return-object p1

    :cond_4
    if-nez p2, :cond_5

    .line 52
    :try_start_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object p1

    .line 54
    :cond_5
    :try_start_3
    sget-object p1, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-ne v1, p1, :cond_6

    .line 55
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    monitor-exit v0

    return-object p1

    .line 57
    :cond_6
    :try_start_4
    iget-object p1, p0, Ll/ܶ֨ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v0

    return-object p1

    .line 38
    :cond_7
    :goto_1
    :try_start_5
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ֫(Ll/ۙ᩺֫;)V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 72
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    if-nez v1, :cond_2

    if-eqz p1, :cond_2

    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v2, Ll/۠֨ۜ;->᩹:Ll/۠֨ۜ;

    if-ne v1, v2, :cond_0

    goto :goto_1

    .line 75
    :cond_0
    iget-boolean p1, p1, Ll/ۙ᩺֫;->᩻:Z

    if-eqz p1, :cond_1

    .line 76
    invoke-direct {p0}, Ll/ܶ֨ۜ;->ۜ()V

    goto :goto_0

    .line 78
    :cond_1
    invoke-direct {p0}, Ll/ܶ֨ۜ;->᩻()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    :goto_0
    monitor-exit v0

    return-void

    .line 73
    :cond_2
    :goto_1
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

.method public final declared-synchronized ֫()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 84
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v2, Ll/۠֨ۜ;->᩹:Ll/۠֨ۜ;

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 87
    :cond_0
    invoke-direct {p0}, Ll/ܶ֨ۜ;->ۜ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    .line 85
    :cond_1
    :goto_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ۧ(J)Z
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    const-wide/16 v1, 0x0

    cmp-long v3, p1, v1

    if-ltz v3, :cond_0

    .line 142
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v2, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-ne v1, v2, :cond_0

    iget-wide v1, p0, Ll/ܶ֨ۜ;->᩹:J

    cmp-long v3, v1, p1

    if-nez v3, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1
.end method

.method public final declared-synchronized ܳ()J
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 137
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v2, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-ne v1, v2, :cond_0

    iget-wide v1, p0, Ll/ܶ֨ۜ;->᩹:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    const-wide/16 v1, -0x1

    :goto_0
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ܽ()Ljava/util/List;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 64
    :try_start_0
    iget-boolean v1, p0, Ll/ܶ֨ۜ;->᩸:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;

    sget-object v2, Ll/۠֨ۜ;->ۙ:Ll/۠֨ۜ;

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 111
    :cond_0
    iget-object v1, p0, Ll/ܶ֨ۜ;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 112
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    goto :goto_0

    .line 114
    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 115
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v2

    .line 67
    :goto_0
    monitor-exit v0

    return-object v1

    .line 65
    :cond_2
    :goto_1
    :try_start_1
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ᩳ()Ll/۠֨ۜ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 27
    :try_start_0
    iget-object v1, p0, Ll/ܶ֨ۜ;->ۙ:Ll/۠֨ۜ;
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
