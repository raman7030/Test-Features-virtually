.class public final Ll/ۚۤᩳ;
.super Ljava/lang/Object;
.source "O6OW"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final ۗ:Ll/۫ۨᩳ;

.field public final synthetic ۙ:Ll/֨ۤᩳ;

.field public final ᩶:Ljava/lang/CharSequence;

.field public final ᩸:Ll/ܶ᩵ܿ;

.field public final ᩹:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method public constructor <init>(Ll/֨ۤᩳ;Ll/۫ۨᩳ;Ljava/lang/CharSequence;Ll/ܶ᩵ܿ;)V
    .locals 0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۤᩳ;->ۙ:Ll/֨ۤᩳ;

    .line 62
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/ۚۤᩳ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 65
    iput-object p2, p0, Ll/ۚۤᩳ;->ۗ:Ll/۫ۨᩳ;

    .line 66
    iput-object p3, p0, Ll/ۚۤᩳ;->᩶:Ljava/lang/CharSequence;

    .line 67
    iput-object p4, p0, Ll/ۚۤᩳ;->᩸:Ll/ܶ᩵ܿ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 84
    iget-object v0, p0, Ll/ۚۤᩳ;->ۙ:Ll/֨ۤᩳ;

    const/4 v1, 0x0

    const/4 v2, 0x1

    iget-object v3, p0, Ll/ۚۤᩳ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v3, v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    .line 86
    :try_start_0
    iget-object v2, p0, Ll/ۚۤᩳ;->ۗ:Ll/۫ۨᩳ;

    iget-object v4, p0, Ll/ۚۤᩳ;->᩶:Ljava/lang/CharSequence;

    iget-object v5, p0, Ll/ۚۤᩳ;->᩸:Ll/ܶ᩵ܿ;

    new-instance v6, Ll/֡ۤᩳ;

    invoke-direct {v6, v0}, Ll/֡ۤᩳ;-><init>(Ll/֨ۤᩳ;)V

    invoke-virtual {v2, v5, v6, v4}, Ll/۫ۨᩳ;->֫(Ll/ܶ᩵ܿ;Ll/ܿۖ᩷;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    goto :goto_2

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v2

    goto :goto_0

    :catch_2
    move-exception v2

    .line 88
    :goto_0
    :try_start_1
    invoke-static {v0}, Ll/֨ۤᩳ;->ۧ(Ll/֨ۤᩳ;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v4

    :cond_1
    const/4 v5, 0x0

    .line 0
    invoke-virtual {v4, v5, v2}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v5, :cond_1

    .line 90
    :goto_1
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 91
    invoke-static {v0}, Ll/֨ۤᩳ;->֫(Ll/֨ۤᩳ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void

    .line 90
    :goto_2
    invoke-virtual {v3, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 91
    invoke-static {v0}, Ll/֨ۤᩳ;->֫(Ll/֨ۤᩳ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 92
    throw v2
.end method

.method public final ֫()V
    .locals 3

    .line 71
    :try_start_0
    sget-object v0, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 73
    :goto_0
    iget-object v1, p0, Ll/ۚۤᩳ;->ۙ:Ll/֨ۤᩳ;

    invoke-static {v1}, Ll/֨ۤᩳ;->ۧ(Ll/֨ۤᩳ;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v1

    :cond_0
    const/4 v2, 0x0

    .line 0
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 74
    :goto_1
    invoke-virtual {p0}, Ll/ۚۤᩳ;->ۧ()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 79
    iget-object v0, p0, Ll/ۚۤᩳ;->ۗ:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ܶ()V

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 80
    iget-object v2, p0, Ll/ۚۤᩳ;->᩹:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۚۤᩳ;->ۙ:Ll/֨ۤᩳ;

    invoke-static {v0}, Ll/֨ۤᩳ;->֫(Ll/֨ۤᩳ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    return-void
.end method
