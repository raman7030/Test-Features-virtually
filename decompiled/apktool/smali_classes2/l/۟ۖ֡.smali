.class public final Ll/۟ۖ֡;
.super Ljava/lang/Object;
.source "UAIG"


# instance fields
.field public ֫:I

.field public final ۧ:[Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 258
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x64

    new-array v1, v0, [Ljava/util/concurrent/atomic/AtomicLong;

    .line 260
    iput-object v1, p0, Ll/۟ۖ֡;->ۧ:[Ljava/util/concurrent/atomic/AtomicLong;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 262
    iget-object v2, p0, Ll/۟ۖ֡;->ۧ:[Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v3, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v4, -0x1

    invoke-direct {v3, v4, v5}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    aput-object v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 313
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v0, "StatsStore ["

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 290
    :try_start_0
    iget-object v2, p0, Ll/۟ۖ֡;->ۧ:[Ljava/util/concurrent/atomic/AtomicLong;

    iget v3, p0, Ll/۟ۖ֡;->֫:I

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;II)Ll/ܿ᩺ᩴ;

    move-result-object v2

    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v3

    invoke-interface {v2, v3}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    .line 316
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "], size=100, index="

    .line 317
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    iget v0, p0, Ll/۟ۖ֡;->֫:I

    const-string v2, "]"

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v1

    .line 290
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫(Ll/ۖ᩹ᩴ;)V
    .locals 4

    .line 267
    invoke-virtual {p1}, Ll/ۖ᩹ᩴ;->toMillis()J

    move-result-wide v1

    move-object v0, p0

    .line 0
    monitor-enter v0

    .line 277
    :try_start_0
    iget-object p1, p0, Ll/۟ۖ֡;->ۧ:[Ljava/util/concurrent/atomic/AtomicLong;

    iget v3, p0, Ll/۟ۖ֡;->֫:I

    aget-object p1, p1, v3

    invoke-virtual {p1, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 278
    iget p1, p0, Ll/۟ۖ֡;->֫:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/۟ۖ֡;->֫:I

    const/16 v1, 0x64

    if-ne p1, v1, :cond_0

    const/4 p1, 0x0

    .line 280
    iput p1, p0, Ll/۟ۖ֡;->֫:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 282
    :cond_0
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
