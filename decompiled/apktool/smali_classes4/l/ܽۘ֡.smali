.class public Ll/ܽۘ֡;
.super Ljava/lang/Object;
.source "EAH2"

# interfaces
.implements Ll/ۤۖ֡;


# instance fields
.field public ۗ:Ll/ۛۖ֡;

.field public final ۙ:Ljava/lang/Object;

.field public final ۬:Ll/ۡ᩹ᩴ;

.field public volatile ᩶:Ll/ۘ᩹ᩴ;

.field public volatile ᩸:Ll/ۙۘ֡;

.field public volatile ᩹:Ll/ۘ᩹ᩴ;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    sget-object v0, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    iput-object v0, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    .line 44
    invoke-static {}, Ll/ۡ᩹ᩴ;->systemUTC()Ll/ۡ᩹ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/ܽۘ֡;->۬:Ll/ۡ᩹ᩴ;

    .line 280
    invoke-virtual {v0}, Ll/ۡ᩹ᩴ;->instant()Ll/ۘ᩹ᩴ;

    move-result-object v0

    .line 47
    iput-object v0, p0, Ll/ܽۘ֡;->᩹:Ll/ۘ᩹ᩴ;

    .line 49
    iput-object v0, p0, Ll/ܽۘ֡;->᩶:Ll/ۘ᩹ᩴ;

    .line 51
    sget-object v0, Ll/ۙۘ֡;->֫:Ll/ۙۘ֡;

    iput-object v0, p0, Ll/ܽۘ֡;->᩸:Ll/ۙۘ֡;

    .line 62
    iput-object p1, p0, Ll/ܽۘ֡;->ۙ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final compareTo(Ljava/lang/Object;)I
    .locals 2

    .line 40
    check-cast p1, Ll/ۤۖ֡;

    .line 197
    iget-object v0, p0, Ll/ܽۘ֡;->᩶:Ll/ۘ᩹ᩴ;

    .line 93
    invoke-interface {p1}, Ll/ۤۖ֡;->ܶ֫()Ll/ۘ᩹ᩴ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۘ᩹ᩴ;->compareTo(Ll/ۘ᩹ᩴ;)I

    move-result v0

    if-nez v0, :cond_0

    .line 99
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p1

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public final declared-synchronized getState()Ll/ۛۖ֡;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 247
    :try_start_0
    iget-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;
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

.method public final declared-synchronized invalidate()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 255
    :try_start_0
    sget-object v1, Ll/ۛۖ֡;->۫:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 256
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 327
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "Object: "

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 329
    iget-object v0, p0, Ll/ܽۘ֡;->ۙ:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", State: "

    .line 330
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, p0

    .line 331
    monitor-enter v0

    .line 332
    :try_start_0
    iget-object v2, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 334
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 333
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/util/Deque;)Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 127
    :try_start_0
    iget-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    sget-object v2, Ll/ۛۖ֡;->ۙ:Ll/ۛۖ֡;

    if-ne v1, v2, :cond_0

    .line 128
    sget-object p1, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    iput-object p1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    monitor-exit v0

    const/4 p1, 0x1

    return p1

    .line 131
    :cond_0
    :try_start_1
    sget-object v2, Ll/ۛۖ֡;->ۗ:Ll/ۛۖ֡;

    if-ne v1, v2, :cond_1

    .line 132
    sget-object v1, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    .line 133
    invoke-interface {p1, p0}, Ljava/util/Deque;->offerFirst(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 138
    :cond_1
    monitor-exit v0

    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final declared-synchronized ۖۧ()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 318
    :try_start_0
    iget-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    sget-object v2, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    if-ne v1, v2, :cond_0

    .line 319
    sget-object v1, Ll/ۛۖ֡;->ۙ:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 320
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    .line 322
    :cond_0
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

.method public final ۙۧ()Ljava/lang/Object;
    .locals 1

    .line 238
    iget-object v0, p0, Ll/ܽۘ֡;->ۙ:Ljava/lang/Object;

    return-object v0
.end method

.method public final declared-synchronized ۬֫()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 114
    :try_start_0
    iget-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    sget-object v2, Ll/ۛۖ֡;->᩶:Ll/ۛۖ֡;

    if-eq v1, v2, :cond_1

    sget-object v2, Ll/ۛۖ֡;->ۤ:Ll/ۛۖ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v1, v2, :cond_0

    goto :goto_0

    .line 121
    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    .line 115
    :cond_1
    :goto_0
    :try_start_1
    sget-object v1, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    .line 280
    iget-object v1, p0, Ll/ܽۘ֡;->۬:Ll/ۡ᩹ᩴ;

    invoke-virtual {v1}, Ll/ۡ᩹ᩴ;->instant()Ll/ۘ᩹ᩴ;

    move-result-object v1

    .line 116
    iput-object v1, p0, Ll/ܽۘ֡;->᩶:Ll/ۘ᩹ᩴ;

    .line 117
    iget-object v1, p0, Ll/ܽۘ֡;->᩸:Ll/ۙۘ֡;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 118
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ܶ֫()Ll/ۘ᩹ᩴ;
    .locals 1

    .line 197
    iget-object v0, p0, Ll/ܽۘ֡;->᩶:Ll/ۘ᩹ᩴ;

    return-object v0
.end method

.method public final declared-synchronized ᩳ֫()Z
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 72
    :try_start_0
    iget-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    sget-object v2, Ll/ۛۖ֡;->۬:Ll/ۛۖ֡;

    if-ne v1, v2, :cond_0

    .line 73
    sget-object v1, Ll/ۛۖ֡;->᩶:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;

    .line 280
    iget-object v1, p0, Ll/ܽۘ֡;->۬:Ll/ۡ᩹ᩴ;

    invoke-virtual {v1}, Ll/ۡ᩹ᩴ;->instant()Ll/ۘ᩹ᩴ;

    move-result-object v1

    .line 74
    iput-object v1, p0, Ll/ܽۘ֡;->᩹:Ll/ۘ᩹ᩴ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 80
    monitor-exit v0

    const/4 v0, 0x1

    return v0

    .line 82
    :cond_0
    :try_start_1
    sget-object v2, Ll/ۛۖ֡;->ۙ:Ll/ۛۖ֡;

    if-ne v1, v2, :cond_1

    .line 84
    sget-object v1, Ll/ۛۖ֡;->ۗ:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    :cond_1
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final ᩴۧ()Ll/ۖ᩹ᩴ;
    .locals 2

    .line 171
    iget-object v0, p0, Ll/ܽۘ֡;->᩶:Ll/ۘ᩹ᩴ;

    .line 280
    iget-object v1, p0, Ll/ܽۘ֡;->۬:Ll/ۡ᩹ᩴ;

    invoke-virtual {v1}, Ll/ۡ᩹ᩴ;->instant()Ll/ۘ᩹ᩴ;

    move-result-object v1

    .line 171
    invoke-static {v0, v1}, Ll/ۖ᩹ᩴ;->between(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)Ll/ۖ᩹ᩴ;

    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ll/ۖ᩹ᩴ;->isNegative()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Ll/ۖ᩹ᩴ;->ZERO:Ll/ۖ᩹ᩴ;

    :cond_0
    return-object v0
.end method

.method public final declared-synchronized ᩷֫()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 271
    :try_start_0
    sget-object v1, Ll/ۛۖ֡;->ۤ:Ll/ۛۖ֡;

    iput-object v1, p0, Ll/ܽۘ֡;->ۗ:Ll/ۛۖ֡;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 272
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ᩹ۧ()Ll/ۖ᩹ᩴ;
    .locals 3

    .line 197
    iget-object v0, p0, Ll/ܽۘ֡;->᩶:Ll/ۘ᩹ᩴ;

    .line 187
    iget-object v1, p0, Ll/ܽۘ֡;->᩹:Ll/ۘ᩹ᩴ;

    .line 91
    invoke-virtual {v0, v1}, Ll/ۘ᩹ᩴ;->isAfter(Ll/ۘ᩹ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 92
    invoke-static {v1, v0}, Ll/ۖ᩹ᩴ;->between(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)Ll/ۖ᩹ᩴ;

    move-result-object v0

    return-object v0

    .line 93
    :cond_0
    invoke-static {}, Ll/ۘ᩹ᩴ;->now()Ll/ۘ᩹ᩴ;

    move-result-object v0

    invoke-static {v1, v0}, Ll/ۖ᩹ᩴ;->between(Ll/ܺۗᩴ;Ll/ܺۗᩴ;)Ll/ۖ᩹ᩴ;

    move-result-object v0

    return-object v0
.end method
