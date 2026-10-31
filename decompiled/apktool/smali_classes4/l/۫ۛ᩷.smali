.class public Ll/۫ۛ᩷;
.super Ll/ۚܺ֫;
.source "Z1K9"


# instance fields
.field public volatile ۗ:Z

.field public ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

.field public ۬:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 17
    invoke-direct {p0}, Ll/ۚܺ֫;-><init>()V

    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Ll/۫ۛ᩷;->ۗ:Z

    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/۫ۛ᩷;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 14
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Ll/۫ۛ᩷;->۬:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 15
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 18
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Ll/᩹᩶۠;

    const/4 v2, 0x4

    invoke-direct {v1, v2, p0}, Ll/᩹᩶۠;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 37
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public static synthetic ֫(Ll/۫ۛ᩷;)V
    .locals 2

    .line 19
    :cond_0
    iget-boolean v0, p0, Ll/۫ۛ᩷;->ۗ:Z

    if-nez v0, :cond_2

    const-wide/16 v0, 0x64

    .line 20
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    .line 21
    :cond_1
    :goto_0
    iget-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 22
    iget-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 24
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 25
    iget-object v0, p0, Ll/۫ۛ᩷;->۬:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    .line 31
    iget-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    if-eqz v0, :cond_2

    .line 33
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 34
    iget-object v0, p0, Ll/۫ۛ᩷;->۬:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/Runnable;)V
    .locals 1

    .line 41
    iget-object v0, p0, Ll/۫ۛ᩷;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 42
    iget-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final ܽ()V
    .locals 1

    const/4 v0, 0x1

    .line 57
    iput-boolean v0, p0, Ll/۫ۛ᩷;->ۗ:Z

    return-void
.end method

.method public final ܿ()V
    .locals 2

    .line 46
    :goto_0
    invoke-virtual {p0}, Ll/۫ۛ᩷;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_0

    const-wide/16 v0, 0xa

    .line 47
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ᩳ()Z
    .locals 2

    .line 52
    iget-boolean v0, p0, Ll/۫ۛ᩷;->ۗ:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/۫ۛ᩷;->۫:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/۫ۛ᩷;->ۙ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget-object v1, p0, Ll/۫ۛ᩷;->۬:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-eq v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method
