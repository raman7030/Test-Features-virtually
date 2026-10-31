.class public final Ll/۟᩸ܽ;
.super Ljava/lang/Object;
.source "F77E"


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicReference;

.field public final ۧ:Ljava/util/concurrent/ExecutorService;

.field public final ܽ:Ll/᩺᩸ܽ;

.field public final ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Ljava/util/concurrent/atomic/AtomicInteger;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۤ᩸ܽ;)V
    .locals 0

    .line 224
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 225
    iput-object p1, p0, Ll/۟᩸ܽ;->ۧ:Ljava/util/concurrent/ExecutorService;

    .line 226
    iput-object p2, p0, Ll/۟᩸ܽ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 227
    iput-object p3, p0, Ll/۟᩸ܽ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    .line 228
    iput-object p4, p0, Ll/۟᩸ܽ;->ܽ:Ll/᩺᩸ܽ;

    return-void
.end method

.method public static synthetic ֫(Ll/۟᩸ܽ;Ll/ܰ᩸ܽ;)V
    .locals 1

    .line 242
    iget-object v0, p0, Ll/۟᩸ܽ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 244
    :try_start_0
    invoke-interface {p1}, Ll/ܰ᩸ܽ;->run()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 246
    iget-object p0, p0, Ll/۟᩸ܽ;->֫:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_0
    const/4 v0, 0x0

    .line 0
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܰ᩸ܽ;)V
    .locals 3

    .line 235
    :goto_0
    iget-object v0, p0, Ll/۟᩸ܽ;->ᩳ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/16 v2, 0x1f4

    if-le v1, v2, :cond_0

    .line 236
    iget-object v0, p0, Ll/۟᩸ܽ;->ܽ:Ll/᩺᩸ܽ;

    check-cast v0, Ll/ۤ᩸ܽ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x32

    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V

    goto :goto_0

    .line 238
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 241
    :try_start_0
    iget-object v1, p0, Ll/۟᩸ܽ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Ll/ۨ᩸ܽ;

    invoke-direct {v2, p0, p1}, Ll/ۨ᩸ܽ;-><init>(Ll/۟᩸ܽ;Ll/ܰ᩸ܽ;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 252
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 254
    throw p1
.end method
