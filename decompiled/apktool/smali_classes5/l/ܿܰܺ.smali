.class public abstract Ll/ܿܰܺ;
.super Ll/ۖܰܺ;
.source "B3B1"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 223
    invoke-direct {p0}, Ll/ۖܰܺ;-><init>()V

    return-void
.end method

.method public static ֫(Ll/ۗܰܺ;)Ljava/lang/Object;
    .locals 6

    const-string v0, "get() did not throw CancellationException, despite reporting isCancelled() == true: "

    .line 612
    instance-of v1, p0, Ll/ܽܰܺ;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    .line 617
    check-cast p0, Ll/ܿܰܺ;

    .line 77
    iget-object p0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 618
    instance-of v0, p0, Ll/᩺᩺ܺ;

    if-eqz v0, :cond_1

    .line 622
    move-object v0, p0

    check-cast v0, Ll/᩺᩺ܺ;

    .line 623
    iget-boolean v1, v0, Ll/᩺᩺ܺ;->ۧ:Z

    if-eqz v1, :cond_1

    .line 625
    iget-object p0, v0, Ll/᩺᩺ܺ;->֫:Ljava/lang/Throwable;

    if-eqz p0, :cond_0

    .line 626
    new-instance p0, Ll/᩺᩺ܺ;

    iget-object v0, v0, Ll/᩺᩺ܺ;->֫:Ljava/lang/Throwable;

    invoke-direct {p0, v0, v2}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    goto :goto_0

    .line 627
    :cond_0
    sget-object p0, Ll/᩺᩺ܺ;->ܽ:Ll/᩺᩺ܺ;

    .line 631
    :cond_1
    :goto_0
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 633
    :cond_2
    instance-of v1, p0, Ll/᩺ܰܺ;

    if-eqz v1, :cond_3

    .line 634
    move-object v1, p0

    check-cast v1, Ll/᩺ܰܺ;

    .line 635
    invoke-static {v1}, Ll/ܰܰܺ;->֫(Ll/᩺ܰܺ;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_3

    .line 637
    new-instance p0, Ll/֫ܰܺ;

    invoke-direct {p0, v1}, Ll/֫ܰܺ;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    .line 640
    :cond_3
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v1

    .line 642
    sget-boolean v3, Ll/ۖܰܺ;->ۗ:Z

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v3, v1

    if-eqz v3, :cond_4

    .line 647
    sget-object p0, Ll/᩺᩺ܺ;->ܽ:Ll/᩺᩺ܺ;

    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    :cond_4
    const/4 v3, 0x0

    .line 697
    :goto_1
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_5

    .line 42
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    goto :goto_2

    :catch_0
    move-exception p0

    goto :goto_3

    :catch_1
    move-exception p0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_4

    :catch_3
    move-exception v3

    goto :goto_5

    :cond_5
    :goto_2
    if-eqz v1, :cond_6

    .line 653
    new-instance v3, Ll/᩺᩺ܺ;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, v2}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    return-object v3

    :cond_6
    if-nez v4, :cond_7

    .line 660
    sget-object p0, Ll/ۖܰܺ;->۬:Ljava/lang/Object;

    return-object p0

    :cond_7
    return-object v4

    :catchall_0
    move-exception v4

    if-eqz v3, :cond_8

    .line 42
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->interrupt()V

    .line 706
    :cond_8
    throw v4
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    .line 682
    :goto_3
    new-instance v0, Ll/֫ܰܺ;

    invoke-direct {v0, p0}, Ll/֫ܰܺ;-><init>(Ljava/lang/Throwable;)V

    return-object v0

    :goto_4
    if-nez v1, :cond_9

    .line 674
    new-instance v1, Ll/֫ܰܺ;

    new-instance v2, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "get() threw CancellationException, despite reporting isCancelled() == false: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Ll/֫ܰܺ;-><init>(Ljava/lang/Throwable;)V

    return-object v1

    .line 680
    :cond_9
    new-instance p0, Ll/᩺᩺ܺ;

    invoke-direct {p0, v0, v2}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    return-object p0

    :goto_5
    if-eqz v1, :cond_a

    .line 663
    new-instance v1, Ll/᩺᩺ܺ;

    new-instance v4, Ljava/lang/IllegalArgumentException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v4, p0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v4, v2}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    return-object v1

    .line 671
    :cond_a
    new-instance p0, Ll/֫ܰܺ;

    invoke-virtual {v3}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    invoke-direct {p0, v0}, Ll/֫ܰܺ;-><init>(Ljava/lang/Throwable;)V

    return-object p0

    :catch_4
    const/4 v3, 0x1

    goto/16 :goto_1
.end method

.method private ֫(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    const/4 v1, 0x0

    .line 697
    :goto_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 42
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    const-string v1, "SUCCESS, result=["

    .line 940
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 941
    invoke-direct {p0, p1, v2}, Ll/ܿܰܺ;->֫(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 942
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v1

    goto :goto_2

    :catchall_0
    move-exception v2

    if-eqz v1, :cond_1

    .line 42
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    .line 706
    :cond_1
    throw v2
    :try_end_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :goto_1
    const-string v1, "UNKNOWN, cause=["

    .line 948
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :catch_2
    const-string v0, "CANCELLED"

    .line 946
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    :goto_2
    const-string v2, "FAILURE, cause=["

    .line 944
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_3
    return-void

    :catch_3
    const/4 v1, 0x1

    goto :goto_0
.end method

.method private ֫(Ljava/lang/StringBuilder;Ljava/lang/Object;)V
    .locals 1

    if-nez p2, :cond_0

    const-string p2, "null"

    .line 959
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    if-ne p2, p0, :cond_1

    const-string p2, "this future"

    .line 961
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    .line 964
    :cond_1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "@"

    .line 965
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 966
    invoke-static {p2}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static ֫(Ll/ܿܰܺ;Z)V
    .locals 2

    .line 717
    invoke-virtual {p0}, Ll/ۖܰܺ;->ܽ()V

    .line 735
    invoke-virtual {p0}, Ll/ܿܰܺ;->ᩳ()V

    .line 847
    sget-object p1, Ll/ۧܰܺ;->ᩳ:Ll/ۧܰܺ;

    invoke-virtual {p0, p1}, Ll/ۖܰܺ;->֫(Ll/ۧܰܺ;)Ll/ۧܰܺ;

    move-result-object p0

    const/4 p1, 0x0

    :goto_0
    if-eqz p0, :cond_0

    .line 851
    iget-object v0, p0, Ll/ۧܰܺ;->ۧ:Ll/ۧܰܺ;

    .line 852
    iput-object p1, p0, Ll/ۧܰܺ;->ۧ:Ll/ۧܰܺ;

    move-object p1, p0

    move-object p0, v0

    goto :goto_0

    :cond_0
    :goto_1
    if-eqz p1, :cond_2

    .line 741
    iget-object p0, p1, Ll/ۧܰܺ;->ۧ:Ll/ۧܰܺ;

    .line 746
    iget-object v0, p1, Ll/ۧܰܺ;->ܽ:Ljava/lang/Runnable;

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 747
    instance-of v1, v0, Ll/ܰ᩺ܺ;

    if-nez v1, :cond_1

    .line 767
    iget-object p1, p1, Ll/ۧܰܺ;->֫:Ljava/util/concurrent/Executor;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p1}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move-object p1, p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    .line 77
    throw p0

    :cond_2
    return-void
.end method

.method public static ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 285
    instance-of v0, p0, Ll/᩺᩺ܺ;

    if-nez v0, :cond_2

    .line 289
    instance-of v0, p0, Ll/֫ܰܺ;

    if-nez v0, :cond_1

    .line 293
    sget-object v0, Ll/ۖܰܺ;->۬:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    .line 290
    :cond_1
    check-cast p0, Ll/֫ܰܺ;

    .line 291
    iget-object p0, p0, Ll/֫ܰܺ;->֫:Ljava/lang/Throwable;

    .line 292
    new-instance v0, Ljava/util/concurrent/ExecutionException;

    invoke-direct {v0, p0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    .line 286
    :cond_2
    check-cast p0, Ll/᩺᩺ܺ;

    .line 287
    iget-object p0, p0, Ll/᩺᩺ܺ;->֫:Ljava/lang/Throwable;

    .line 1021
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1022
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 288
    throw v0
.end method

.method public static ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 5

    .line 1004
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1008
    sget-object v1, Ll/ۖܰܺ;->۫:Ll/ۙܰܺ;

    invoke-virtual {v1}, Ll/ۙܰܺ;->֫()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "RuntimeException while executing runnable "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1009
    invoke-virtual {v1, v2, p0, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public cancel(Z)Z
    .locals 6

    .line 77
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 347
    :goto_0
    instance-of v4, v0, Ll/ܰ᩺ܺ;

    or-int/2addr v3, v4

    if-eqz v3, :cond_6

    .line 351
    sget-boolean v3, Ll/ۖܰܺ;->ۗ:Z

    if-eqz v3, :cond_1

    .line 352
    new-instance v3, Ll/᩺᩺ܺ;

    new-instance v4, Ljava/util/concurrent/CancellationException;

    const-string v5, "Future.cancel() was called."

    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, p1}, Ll/᩺᩺ܺ;-><init>(Ljava/lang/Throwable;Z)V

    goto :goto_2

    :cond_1
    if-eqz p1, :cond_2

    .line 366
    sget-object v3, Ll/᩺᩺ܺ;->ᩳ:Ll/᩺᩺ܺ;

    goto :goto_1

    .line 367
    :cond_2
    sget-object v3, Ll/᩺᩺ܺ;->ܽ:Ll/᩺᩺ܺ;

    .line 364
    :goto_1
    invoke-static {v3}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    :cond_3
    :goto_2
    invoke-static {p0, v0, v3}, Ll/ۖܰܺ;->֫(Ll/ۖܰܺ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 372
    invoke-static {p0, p1}, Ll/ܿܰܺ;->֫(Ll/ܿܰܺ;Z)V

    .line 373
    instance-of p1, v0, Ll/ܰ᩺ܺ;

    if-nez p1, :cond_4

    return v1

    :cond_4
    const/4 p1, 0x0

    .line 393
    throw p1

    .line 77
    :cond_5
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 311
    instance-of v4, v0, Ll/ܰ᩺ܺ;

    if-nez v4, :cond_3

    :cond_6
    return v2
.end method

.method public isCancelled()Z
    .locals 1

    .line 77
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 323
    instance-of v0, v0, Ll/᩺᩺ܺ;

    return v0
.end method

.method public isDone()Z
    .locals 2

    .line 77
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 311
    :goto_0
    instance-of v0, v0, Ll/ܰ᩺ܺ;

    xor-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 862
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 863
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "com.google.common.util.concurrent."

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 864
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 866
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v1, 0x40

    .line 868
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 869
    invoke-virtual {p0}, Ll/ܿܰܺ;->isCancelled()Z

    move-result v1

    const-string v2, "]"

    if-eqz v1, :cond_1

    const-string v1, "CANCELLED"

    .line 870
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto/16 :goto_6

    .line 871
    :cond_1
    invoke-virtual {p0}, Ll/ܿܰܺ;->isDone()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 872
    invoke-direct {p0, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/StringBuilder;)V

    goto/16 :goto_6

    .line 897
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    const-string v3, "PENDING"

    .line 899
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    iget-object v3, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 902
    instance-of v3, v3, Ll/ܰ᩺ܺ;

    const-string v4, "Exception thrown from implementation: "

    if-eqz v3, :cond_5

    const-string v3, ", setFuture=["

    .line 903
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    .line 981
    :try_start_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v3

    .line 47
    instance-of v5, v3, Ljava/lang/Error;

    if-eqz v5, :cond_4

    instance-of v5, v3, Ljava/lang/StackOverflowError;

    if-eqz v5, :cond_3

    goto :goto_1

    .line 48
    :cond_3
    check-cast v3, Ljava/lang/Error;

    throw v3

    .line 993
    :cond_4
    :goto_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 905
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_5

    .line 909
    :cond_5
    :try_start_1
    invoke-virtual {p0}, Ll/ܿܰܺ;->ܿ()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_6

    .line 58
    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v4, :cond_9

    :cond_6
    const/4 v3, 0x0

    goto :goto_4

    :catchall_1
    move-exception v3

    .line 47
    instance-of v5, v3, Ljava/lang/Error;

    if-eqz v5, :cond_8

    instance-of v5, v3, Ljava/lang/StackOverflowError;

    if-eqz v5, :cond_7

    goto :goto_3

    .line 48
    :cond_7
    check-cast v3, Ljava/lang/Error;

    throw v3

    .line 920
    :cond_8
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_9
    :goto_4
    if-eqz v3, :cond_a

    const-string v4, ", info=["

    .line 0
    invoke-static {v0, v4, v3, v2}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 929
    :cond_a
    :goto_5
    invoke-virtual {p0}, Ll/ܿܰܺ;->isDone()Z

    move-result v3

    if-eqz v3, :cond_b

    .line 931
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v3

    invoke-virtual {v0, v1, v3}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    .line 932
    invoke-direct {p0, v0}, Ll/ܿܰܺ;->֫(Ljava/lang/StringBuilder;)V

    .line 876
    :cond_b
    :goto_6
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/Throwable;
    .locals 2

    .line 816
    instance-of v0, p0, Ll/ܽܰܺ;

    if-eqz v0, :cond_0

    .line 77
    iget-object v0, p0, Ll/ۖܰܺ;->᩹:Ljava/lang/Object;

    .line 818
    instance-of v1, v0, Ll/֫ܰܺ;

    if-eqz v1, :cond_0

    .line 819
    check-cast v0, Ll/֫ܰܺ;

    iget-object v0, v0, Ll/֫ܰܺ;->֫:Ljava/lang/Throwable;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ֫(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 3

    const-string v0, "Executor was null."

    .line 444
    invoke-static {p2, v0}, Ll/ۘܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    .line 454
    invoke-virtual {p0}, Ll/ܿܰܺ;->isDone()Z

    move-result v0

    if-nez v0, :cond_2

    .line 82
    iget-object v0, p0, Ll/ۖܰܺ;->᩸:Ll/ۧܰܺ;

    .line 456
    sget-object v1, Ll/ۧܰܺ;->ᩳ:Ll/ۧܰܺ;

    if-eq v0, v1, :cond_2

    .line 457
    new-instance v1, Ll/ۧܰܺ;

    invoke-direct {v1, p1, p2}, Ll/ۧܰܺ;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 459
    :cond_0
    iput-object v0, v1, Ll/ۧܰܺ;->ۧ:Ll/ۧܰܺ;

    .line 460
    invoke-virtual {p0, v0, v1}, Ll/ۖܰܺ;->֫(Ll/ۧܰܺ;Ll/ۧܰܺ;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 82
    :cond_1
    iget-object v0, p0, Ll/ۖܰܺ;->᩸:Ll/ۧܰܺ;

    .line 464
    sget-object v2, Ll/ۧܰܺ;->ᩳ:Ll/ۧܰܺ;

    if-ne v0, v2, :cond_0

    .line 469
    :cond_2
    invoke-static {p1, p2}, Ll/ܿܰܺ;->ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public ֫(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    .line 489
    sget-object p1, Ll/ۖܰܺ;->۬:Ljava/lang/Object;

    :cond_0
    const/4 v0, 0x0

    .line 490
    invoke-static {p0, v0, p1}, Ll/ۖܰܺ;->֫(Ll/ۖܰܺ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 491
    invoke-static {p0, v0}, Ll/ܿܰܺ;->֫(Ll/ܿܰܺ;Z)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method

.method public ֫(Ljava/lang/Throwable;)Z
    .locals 1

    .line 514
    new-instance v0, Ll/֫ܰܺ;

    .line 902
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    invoke-direct {v0, p1}, Ll/֫ܰܺ;-><init>(Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 515
    invoke-static {p0, p1, v0}, Ll/ۖܰܺ;->֫(Ll/ۖܰܺ;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 516
    invoke-static {p0, v0}, Ll/ܿܰܺ;->֫(Ll/ܿܰܺ;Z)V

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public ܿ()Ljava/lang/String;
    .locals 3

    .line 887
    instance-of v0, p0, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    .line 888
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "remaining delay=["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method
