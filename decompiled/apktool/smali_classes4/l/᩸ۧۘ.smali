.class public final Ll/᩸ۧۘ;
.super Ljava/lang/Object;
.source "B9FM"


# instance fields
.field public ֫:Ljava/util/concurrent/Semaphore;

.field public ۧ:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x0

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Ll/᩸ۧۘ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    .line 42
    new-instance v0, Ljava/util/concurrent/Semaphore;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/Semaphore;-><init>(I)V

    iput-object v0, p0, Ll/᩸ۧۘ;->֫:Ljava/util/concurrent/Semaphore;

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 67
    iget-object v0, p0, Ll/᩸ۧۘ;->֫:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    return v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/᩸ۧۘ;->֫:Ljava/util/concurrent/Semaphore;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/Semaphore;->release(I)V

    return-void
.end method

.method public final ۧ(I)[J
    .locals 8

    .line 51
    iget-object v0, p0, Ll/᩸ۧۘ;->֫:Ljava/util/concurrent/Semaphore;

    :try_start_0
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x1388

    invoke-virtual {v0, p1, v2, v3, v1}, Ljava/util/concurrent/Semaphore;->tryAcquire(IJLjava/util/concurrent/TimeUnit;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 52
    iget-object v1, p0, Ll/᩸ۧۘ;->ۧ:Ljava/util/concurrent/atomic/AtomicLong;

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;->getAndAdd(J)J

    move-result-wide v4

    add-long/2addr v2, v4

    sub-long/2addr v2, v4

    long-to-int v1, v2

    .line 76
    new-array v2, v1, [J

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    int-to-long v6, v3

    add-long/2addr v6, v4

    .line 79
    aput-wide v6, v2, v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v2

    .line 59
    :cond_1
    new-instance v1, Ll/ۧۧۘ;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Not enough credits ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " available) to hand out "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " sequence numbers"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 59
    throw v1

    .line 56
    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 57
    new-instance v1, Ll/ۧۧۘ;

    const-string v2, "Got interrupted waiting for "

    const-string v3, " to be available. Credits available at this moment: "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 57
    invoke-virtual {v0}, Ljava/util/concurrent/Semaphore;->availablePermits()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 38
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 57
    throw v1
.end method
