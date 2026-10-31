.class public final Ll/ۙ֡ܿ;
.super Ljava/lang/Object;
.source "E177"


# instance fields
.field public final ֫:Z

.field public final ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܳ:Ljava/util/LinkedList;

.field public final ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final ܿ:Ljava/lang/Object;

.field public ᩳ:J

.field public ᩻:J


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    .line 29
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Ll/ۙ֡ܿ;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v2, 0x0

    .line 32
    iput-wide v2, p0, Ll/ۙ֡ܿ;->᩻:J

    .line 33
    iput-wide v2, p0, Ll/ۙ֡ܿ;->ᩳ:J

    .line 34
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/ۙ֡ܿ;->ܿ:Ljava/lang/Object;

    .line 37
    iput-boolean v1, p0, Ll/ۙ֡ܿ;->֫:Z

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    .line 29
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Ll/ۙ֡ܿ;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    .line 32
    iput-wide v0, p0, Ll/ۙ֡ܿ;->᩻:J

    .line 33
    iput-wide v0, p0, Ll/ۙ֡ܿ;->ᩳ:J

    .line 34
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۙ֡ܿ;->ܿ:Ljava/lang/Object;

    const/4 p1, 0x1

    .line 41
    iput-boolean p1, p0, Ll/ۙ֡ܿ;->֫:Z

    return-void
.end method

.method private ۧ(J)V
    .locals 10

    .line 116
    iget-wide v0, p0, Ll/ۙ֡ܿ;->ᩳ:J

    sub-long v0, p1, v0

    const-wide/16 v2, 0x1f4

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    goto/16 :goto_4

    .line 119
    :cond_0
    iput-wide p1, p0, Ll/ۙ֡ܿ;->ᩳ:J

    .line 121
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    .line 122
    iput-wide v2, p0, Ll/ۙ֡ܿ;->᩻:J

    return-void

    :cond_1
    const-wide/16 v4, 0x7d0

    sub-long v4, p1, v4

    .line 128
    :goto_0
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶֡ܿ;

    iget-wide v6, v1, Ll/᩶֡ܿ;->ۧ:J

    cmp-long v1, v6, v4

    if-gez v1, :cond_2

    .line 129
    invoke-virtual {v0}, Ljava/util/LinkedList;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    .line 134
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedList;->getFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶֡ܿ;

    iget-wide v4, v1, Ll/᩶֡ܿ;->ۧ:J

    .line 136
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-wide v6, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩶֡ܿ;

    .line 137
    iget-wide v8, v1, Ll/᩶֡ܿ;->֫:J

    add-long/2addr v6, v8

    goto :goto_1

    :cond_3
    sub-long v0, p1, v4

    .line 141
    iget-object v4, p0, Ll/ۙ֡ܿ;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v5

    if-eqz v5, :cond_5

    const-wide/16 v8, 0xc8

    cmp-long v5, v0, v8

    if-gez v5, :cond_4

    .line 144
    iput-wide v2, p0, Ll/ۙ֡ܿ;->᩻:J

    const-wide/16 v0, 0x190

    sub-long/2addr p1, v0

    .line 145
    iput-wide p1, p0, Ll/ۙ֡ܿ;->ᩳ:J

    return-void

    :cond_4
    const/4 p1, 0x0

    .line 148
    invoke-virtual {v4, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_5
    cmp-long p1, v0, v2

    if-nez p1, :cond_6

    .line 154
    iput-wide v2, p0, Ll/ۙ֡ܿ;->᩻:J

    return-void

    :cond_6
    const-wide/16 p1, 0x3e8

    mul-long v6, v6, p1

    .line 159
    div-long/2addr v6, v0

    .line 162
    iget-wide p1, p0, Ll/ۙ֡ܿ;->᩻:J

    cmp-long v0, p1, v2

    if-eqz v0, :cond_8

    cmp-long v0, v6, p1

    if-lez v0, :cond_7

    goto :goto_2

    :cond_7
    const-wide v0, 0x3fe999999999999aL    # 0.8

    long-to-double v4, v6

    mul-double v4, v4, v0

    const-wide v0, 0x3fc9999999999998L    # 0.19999999999999996

    long-to-double p1, p1

    mul-double p1, p1, v0

    add-double/2addr p1, v4

    .line 167
    invoke-static {p1, p2}, Ljava/lang/Math;->round(D)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۙ֡ܿ;->᩻:J

    goto :goto_3

    .line 164
    :cond_8
    :goto_2
    iput-wide v6, p0, Ll/ۙ֡ܿ;->᩻:J

    .line 172
    :goto_3
    iget-wide p1, p0, Ll/ۙ֡ܿ;->᩻:J

    cmp-long v0, p1, v2

    if-gez v0, :cond_9

    .line 173
    iput-wide v2, p0, Ll/ۙ֡ܿ;->᩻:J

    :cond_9
    :goto_4
    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 7

    .line 96
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    .line 100
    :cond_0
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 101
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-direct {p0, v1, v2}, Ll/ۙ֡ܿ;->ۧ(J)V

    .line 102
    iget-wide v1, p0, Ll/ۙ֡ܿ;->᩻:J

    .line 103
    iget-boolean v3, p0, Ll/ۙ֡ܿ;->֫:Z

    if-eqz v3, :cond_1

    const-wide/16 v3, 0xc

    .line 105
    div-long v3, v1, v3

    const-wide/32 v5, 0x500000

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    add-long/2addr v1, v3

    .line 107
    :cond_1
    monitor-exit v0

    return-wide v1

    :catchall_0
    move-exception v1

    .line 108
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ֫(J)V
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    .line 67
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 71
    :cond_0
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 72
    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    .line 75
    iget-object v3, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    .line 76
    iget-object v3, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    invoke-virtual {v3}, Ljava/util/LinkedList;->getLast()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩶֡ܿ;

    .line 77
    iget-wide v4, v3, Ll/᩶֡ܿ;->ۧ:J

    sub-long v4, v1, v4

    const-wide/16 v6, 0x32

    cmp-long v8, v4, v6

    if-gez v8, :cond_1

    .line 79
    iget-wide v4, v3, Ll/᩶֡ܿ;->֫:J

    add-long/2addr v4, p1

    iput-wide v4, v3, Ll/᩶֡ܿ;->֫:J

    .line 82
    invoke-direct {p0, v1, v2}, Ll/ۙ֡ܿ;->ۧ(J)V

    .line 83
    monitor-exit v0

    return-void

    .line 88
    :cond_1
    iget-object v3, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    new-instance v4, Ll/᩶֡ܿ;

    invoke-direct {v4, v1, v2, p1, p2}, Ll/᩶֡ܿ;-><init>(JJ)V

    invoke-virtual {v3, v4}, Ljava/util/LinkedList;->addLast(Ljava/lang/Object;)V

    .line 91
    invoke-direct {p0, v1, v2}, Ll/ۙ֡ܿ;->ۧ(J)V

    .line 92
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    :goto_0
    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 45
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 46
    :try_start_0
    iget-object v1, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 47
    monitor-exit v0

    return-void

    .line 49
    :cond_0
    iget-object v1, p0, Ll/ۙ֡ܿ;->ۧ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 50
    iget-object v1, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, p0, Ll/ۙ֡ܿ;->ᩳ:J

    const-wide/16 v1, 0x0

    .line 52
    iput-wide v1, p0, Ll/ۙ֡ܿ;->᩻:J

    .line 53
    iget-object v1, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    .line 54
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ܽ()V
    .locals 3

    .line 59
    iget-object v0, p0, Ll/ۙ֡ܿ;->ܿ:Ljava/lang/Object;

    monitor-enter v0

    .line 60
    :try_start_0
    iget-object v1, p0, Ll/ۙ֡ܿ;->ܽ:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 61
    iget-object v1, p0, Ll/ۙ֡ܿ;->ܳ:Ljava/util/LinkedList;

    invoke-virtual {v1}, Ljava/util/LinkedList;->clear()V

    const-wide/16 v1, 0x0

    .line 62
    iput-wide v1, p0, Ll/ۙ֡ܿ;->᩻:J

    .line 63
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
