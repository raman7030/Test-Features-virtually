.class public final Ll/᩻ܽᩳ;
.super Ljava/lang/Object;
.source "51WE"


# instance fields
.field public ֫:Ljava/util/concurrent/atomic/AtomicLong;

.field public final ۧ:Ll/۬ۧᩳ;

.field public ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩳ:J


# direct methods
.method public constructor <init>(JLl/۬ۧᩳ;)V
    .locals 4

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/᩻ܽᩳ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v3, 0x0

    invoke-direct {v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v0, p0, Ll/᩻ܽᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    cmp-long v0, p1, v1

    if-nez v0, :cond_0

    const-wide/16 p1, 0x1

    .line 25
    :cond_0
    iput-wide p1, p0, Ll/᩻ܽᩳ;->ᩳ:J

    .line 26
    iput-object p3, p0, Ll/᩻ܽᩳ;->ۧ:Ll/۬ۧᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;
    .locals 1

    .line 54
    iget-object v0, p0, Ll/᩻ܽᩳ;->ۧ:Ll/۬ۧᩳ;

    if-nez v0, :cond_0

    return-object p1

    .line 56
    :cond_0
    new-instance v0, Ll/ܳܽᩳ;

    invoke-direct {v0, p0, p1}, Ll/ܳܽᩳ;-><init>(Ll/᩻ܽᩳ;Ll/֡ܿᩳ;)V

    return-object v0
.end method

.method public final ֫(I)V
    .locals 5

    .line 30
    iget-object v0, p0, Ll/᩻ܽᩳ;->ۧ:Ll/۬ۧᩳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, p0, Ll/᩻ܽᩳ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide v1

    const-wide/16 v3, 0x64

    mul-long v1, v1, v3

    .line 33
    iget-wide v3, p0, Ll/᩻ܽᩳ;->ᩳ:J

    div-long/2addr v1, v3

    long-to-int p1, v1

    .line 34
    iget-object v1, p0, Ll/᩻ܽᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result v1

    if-eq p1, v1, :cond_1

    .line 35
    invoke-interface {v0, p1, p1}, Ll/۬ۧᩳ;->֫(II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫(J)V
    .locals 3

    .line 40
    iget-object v0, p0, Ll/᩻ܽᩳ;->ۧ:Ll/۬ۧᩳ;

    if-nez v0, :cond_0

    goto :goto_0

    .line 42
    :cond_0
    iget-object v1, p0, Ll/᩻ܽᩳ;->֫:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v1, p1, p2}, Ljava/util/concurrent/atomic/AtomicLong;->addAndGet(J)J

    move-result-wide p1

    const-wide/16 v1, 0x64

    mul-long p1, p1, v1

    .line 43
    iget-wide v1, p0, Ll/᩻ܽᩳ;->ᩳ:J

    div-long/2addr p1, v1

    long-to-int p2, p1

    .line 44
    iget-object p1, p0, Ll/᩻ܽᩳ;->ܽ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result p1

    if-eq p2, p1, :cond_1

    .line 45
    invoke-interface {v0, p2, p2}, Ll/۬ۧᩳ;->֫(II)V

    :cond_1
    :goto_0
    return-void
.end method
