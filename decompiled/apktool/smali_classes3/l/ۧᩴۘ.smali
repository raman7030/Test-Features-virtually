.class public final Ll/ۧᩴۘ;
.super Ljava/lang/Object;
.source "G8CK"


# instance fields
.field public ֫:I

.field public volatile ۜ:I

.field public volatile ۧ:[D

.field public volatile ܳ:I

.field public final ܽ:Ljava/util/concurrent/locks/ReentrantLock;

.field public final ܿ:Ljava/util/concurrent/locks/Condition;

.field public final ᩳ:Ljava/util/concurrent/locks/Condition;

.field public ᩷:Z

.field public ᩻:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 38
    iput-boolean v0, p0, Ll/ۧᩴۘ;->᩷:Z

    .line 41
    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    .line 42
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v1

    iput-object v1, p0, Ll/ۧᩴۘ;->ܿ:Ljava/util/concurrent/locks/Condition;

    .line 43
    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->newCondition()Ljava/util/concurrent/locks/Condition;

    move-result-object v0

    iput-object v0, p0, Ll/ۧᩴۘ;->ᩳ:Ljava/util/concurrent/locks/Condition;

    return-void
.end method


# virtual methods
.method public final ֫([DII)I
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v0, p3, :cond_3

    .line 85
    iget-object v2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 87
    :goto_1
    :try_start_0
    invoke-virtual {p0}, Ll/ۧᩴۘ;->ۧ()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x1

    if-ge v2, v3, :cond_0

    .line 89
    :try_start_1
    iget-object v2, p0, Ll/ۧᩴۘ;->ᩳ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->await()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    .line 98
    :catch_0
    iget-object v2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    const-wide/high16 v2, 0x7ff8000000000000L    # Double.NaN

    goto :goto_2

    .line 117
    :cond_0
    :try_start_2
    iget-object v2, p0, Ll/ۧᩴۘ;->ۧ:[D

    iget v4, p0, Ll/ۧᩴۘ;->ܳ:I

    iget v5, p0, Ll/ۧᩴۘ;->֫:I

    and-int/2addr v4, v5

    aget-wide v4, v2, v4

    .line 118
    iget v2, p0, Ll/ۧᩴۘ;->ܳ:I

    add-int/2addr v2, v3

    iget v3, p0, Ll/ۧᩴۘ;->᩻:I

    and-int/2addr v2, v3

    iput v2, p0, Ll/ۧᩴۘ;->ܳ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    iget-object v2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 107
    iget-boolean v2, p0, Ll/ۧᩴۘ;->᩷:Z

    if-eqz v2, :cond_1

    .line 108
    iget-object v2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 109
    iget-object v2, p0, Ll/ۧᩴۘ;->ܿ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v2}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 110
    iget-object v2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    :cond_1
    move-wide v2, v4

    .line 176
    :goto_2
    invoke-static {v2, v3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    add-int v4, v0, p2

    .line 177
    aput-wide v2, p1, v4

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 98
    iget-object p2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 99
    throw p1

    :cond_3
    :goto_3
    return v1
.end method

.method public final ֫()V
    .locals 1

    const v0, 0x8000

    new-array v0, v0, [D

    .line 52
    iput-object v0, p0, Ll/ۧᩴۘ;->ۧ:[D

    const/16 v0, 0x7fff

    .line 53
    iput v0, p0, Ll/ۧᩴۘ;->֫:I

    const v0, 0xffff

    .line 54
    iput v0, p0, Ll/ۧᩴۘ;->᩻:I

    return-void
.end method

.method public final ֫(D)V
    .locals 3

    .line 124
    iget-boolean v0, p0, Ll/ۧᩴۘ;->᩷:Z

    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 127
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۧᩴۘ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ۧᩴۘ;->ۧ:[D

    array-length v1, v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    .line 130
    :try_start_1
    iget-object v0, p0, Ll/ۧᩴۘ;->ܿ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {v0}, Ljava/util/concurrent/locks/Condition;->await()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 139
    :catch_0
    iget-object p1, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    .line 156
    :cond_0
    :try_start_2
    iget-object v0, p0, Ll/ۧᩴۘ;->ۧ:[D

    iget v1, p0, Ll/ۧᩴۘ;->ۜ:I

    iget v2, p0, Ll/ۧᩴۘ;->֫:I

    and-int/2addr v1, v2

    aput-wide p1, v0, v1

    .line 157
    iget p1, p0, Ll/ۧᩴۘ;->ۜ:I

    add-int/lit8 p1, p1, 0x1

    iget p2, p0, Ll/ۧᩴۘ;->᩻:I

    and-int/2addr p1, p2

    iput p1, p0, Ll/ۧᩴۘ;->ۜ:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    iget-object p1, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    goto :goto_1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p2}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    .line 140
    throw p1

    .line 143
    :cond_1
    invoke-virtual {p0}, Ll/ۧᩴۘ;->ۧ()I

    move-result v0

    iget-object v1, p0, Ll/ۧᩴۘ;->ۧ:[D

    array-length v1, v1

    if-eq v0, v1, :cond_2

    .line 156
    iget-object v0, p0, Ll/ۧᩴۘ;->ۧ:[D

    iget v1, p0, Ll/ۧᩴۘ;->ۜ:I

    iget v2, p0, Ll/ۧᩴۘ;->֫:I

    and-int/2addr v1, v2

    aput-wide p1, v0, v1

    .line 157
    iget p1, p0, Ll/ۧᩴۘ;->ۜ:I

    add-int/lit8 p1, p1, 0x1

    iget p2, p0, Ll/ۧᩴۘ;->᩻:I

    and-int/2addr p1, p2

    iput p1, p0, Ll/ۧᩴۘ;->ۜ:I

    .line 149
    :cond_2
    :goto_1
    iget-object p1, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    .line 150
    iget-object p1, p0, Ll/ۧᩴۘ;->ᩳ:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p1}, Ljava/util/concurrent/locks/Condition;->signal()V

    .line 151
    iget-object p1, p0, Ll/ۧᩴۘ;->ܽ:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 197
    iput-boolean p1, p0, Ll/ۧᩴۘ;->᩷:Z

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 68
    iget v0, p0, Ll/ۧᩴۘ;->ۜ:I

    iget v1, p0, Ll/ۧᩴۘ;->ܳ:I

    sub-int/2addr v0, v1

    iget v1, p0, Ll/ۧᩴۘ;->᩻:I

    and-int/2addr v0, v1

    return v0
.end method
