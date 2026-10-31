.class public final Ll/᩻ܽܿ;
.super Ljava/lang/Object;
.source "N6R3"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final ֫:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic ۧ:Ll/ۜܽܿ;


# direct methods
.method public constructor <init>(Ll/ۜܽܿ;)V
    .locals 0

    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܽܿ;->ۧ:Ll/ۜܽܿ;

    .line 108
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Ll/᩻ܽܿ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 9

    .line 112
    iget-object v0, p0, Ll/᩻ܽܿ;->ۧ:Ll/ۜܽܿ;

    iget-object v1, p0, Ll/᩻ܽܿ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v2

    if-nez v2, :cond_0

    goto/16 :goto_4

    :cond_0
    const/4 v2, 0x2

    .line 114
    :try_start_0
    invoke-static {v0}, Ll/ۜܽܿ;->᩻(Ll/ۜܽܿ;)Z

    move-result v4

    if-nez v4, :cond_5

    invoke-static {v0}, Ll/ۜܽܿ;->ܽ(Ll/ۜܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v4

    invoke-static {v0}, Ll/ۜܽܿ;->ܳ(Ll/ۜܽܿ;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-lt v4, v5, :cond_1

    goto :goto_3

    .line 115
    :cond_1
    invoke-static {v0}, Ll/ۜܽܿ;->ᩳ(Ll/ۜܽܿ;)Ljava/util/function/Supplier;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/۟᩸ᩳ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 116
    :try_start_1
    invoke-virtual {v4}, Ll/۟᩸ᩳ;->᩻()Ll/ܰ᩸ᩳ;

    move-result-object v5

    .line 117
    :goto_0
    invoke-static {v0}, Ll/ۜܽܿ;->᩻(Ll/ۜܽܿ;)Z

    move-result v6

    if-nez v6, :cond_3

    .line 118
    invoke-static {v0}, Ll/ۜܽܿ;->ܽ(Ll/ۜܽܿ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v6

    .line 119
    invoke-static {v0}, Ll/ۜܽܿ;->ܳ(Ll/ۜܽܿ;)Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    if-lt v6, v7, :cond_2

    goto :goto_1

    .line 120
    :cond_2
    invoke-static {v0}, Ll/ۜܽܿ;->ܿ(Ll/ۜܽܿ;)[Ll/᩷۟ᩳ;

    move-result-object v7

    invoke-static {v0}, Ll/ۜܽܿ;->ܳ(Ll/ۜܽܿ;)Ljava/util/List;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ܳܽܿ;

    invoke-interface {v8, v5}, Ll/ܳܽܿ;->֫(Ll/ܰ᩸ᩳ;)Ll/᩷۟ᩳ;

    move-result-object v8

    aput-object v8, v7, v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 122
    :cond_3
    :goto_1
    :try_start_2
    invoke-virtual {v4}, Ll/۟᩸ᩳ;->close()V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catchall_0
    move-exception v5

    if-eqz v4, :cond_4

    .line 115
    :try_start_3
    invoke-virtual {v4}, Ll/۟᩸ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v4

    :try_start_4
    invoke-virtual {v5, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    throw v5
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Error; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 128
    :cond_5
    :goto_3
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 129
    invoke-static {v0}, Ll/ۜܽܿ;->֫(Ll/ۜܽܿ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :goto_4
    const/4 v0, 0x0

    return-object v0

    :catchall_2
    move-exception v3

    goto :goto_6

    :catch_0
    move-exception v4

    goto :goto_5

    :catch_1
    move-exception v4

    .line 125
    :goto_5
    :try_start_5
    invoke-static {v0}, Ll/ۜܽܿ;->ۧ(Ll/ۜܽܿ;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v5

    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 126
    throw v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 128
    :goto_6
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 129
    invoke-static {v0}, Ll/ۜܽܿ;->֫(Ll/ۜܽܿ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 130
    throw v3
.end method

.method public final ֫()V
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    .line 134
    iget-object v2, p0, Ll/᩻ܽܿ;->֫:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/᩻ܽܿ;->ۧ:Ll/ۜܽܿ;

    invoke-static {v0}, Ll/ۜܽܿ;->֫(Ll/ۜܽܿ;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    :cond_0
    return-void
.end method
