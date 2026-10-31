.class public abstract Ll/ۧ֡;
.super Ljava/lang/Object;
.source "W9N5"

# interfaces
.implements Ll/ۗܰܺ;


# static fields
.field public static final ۗ:Z

.field public static final ۙ:Ll/۫᩵;

.field public static final ۫:Ljava/util/logging/Logger;

.field public static final ۬:Ljava/lang/Object;


# instance fields
.field public volatile ᩶:Ll/֫֡;

.field public volatile ᩸:Ll/ۨ᩵;

.field public volatile ᩹:Ljava/lang/Object;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    .line 64
    const-class v0, Ll/֫֡;

    const-string v1, "guava.concurrent.generate_cancellation_cause"

    const-string v2, "false"

    .line 66
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 65
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v1

    sput-boolean v1, Ll/ۧ֡;->ۗ:Z

    .line 69
    const-class v1, Ll/ۧ֡;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v2

    sput-object v2, Ll/ۧ֡;->۫:Ljava/util/logging/Logger;

    .line 85
    :try_start_0
    new-instance v2, Ll/᩺᩵;

    const-class v3, Ljava/lang/Thread;

    const-string v4, "\u06e7"

    .line 87
    invoke-static {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v4

    const-string v3, "\u05ab"

    .line 88
    invoke-static {v0, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v5

    const-string v3, "\u1a76"

    .line 89
    invoke-static {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v6

    const-class v0, Ll/ۨ᩵;

    const-string v3, "\u1a78"

    .line 90
    invoke-static {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v7

    const-class v0, Ljava/lang/Object;

    const-string v3, "\u1a79"

    .line 94
    invoke-static {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    move-result-object v8

    move-object v3, v2

    invoke-direct/range {v3 .. v8}, Ll/᩺᩵;-><init>(Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 101
    new-instance v2, Ll/۟᩵;

    .line 1069
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 104
    :goto_0
    sput-object v2, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    if-eqz v0, :cond_0

    .line 114
    sget-object v1, Ll/ۧ֡;->۫:Ljava/util/logging/Logger;

    sget-object v2, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v3, "SafeAtomicHelper is broken!"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 217
    :cond_0
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۧ֡;->۬:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 317
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 513
    instance-of v0, p0, Ll/ۤ᩵;

    if-nez v0, :cond_2

    .line 517
    instance-of v0, p0, Ll/ۛ᩵;

    if-nez v0, :cond_1

    .line 519
    sget-object v0, Ll/ۧ֡;->۬:Ljava/lang/Object;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    return-object p0

    .line 518
    :cond_1
    new-instance p0, Ljava/util/concurrent/ExecutionException;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ljava/util/concurrent/ExecutionException;-><init>(Ljava/lang/Throwable;)V

    throw p0

    .line 514
    :cond_2
    check-cast p0, Ll/ۤ᩵;

    iget-object p0, p0, Ll/ۤ᩵;->֫:Ljava/lang/Throwable;

    .line 1195
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v1, "Task was cancelled."

    invoke-direct {v0, v1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1196
    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 514
    throw v0
.end method

.method private ֫(Ljava/lang/StringBuilder;)V
    .locals 3

    const-string v0, "]"

    .line 1026
    :try_start_0
    invoke-static {p0}, Ll/ۧ֡;->ۧ(Ll/ۧ֡;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "SUCCESS, result=["

    .line 1027
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-ne v1, p0, :cond_0

    const-string v1, "this future"

    goto :goto_0

    .line 1047
    :cond_0
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1027
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "UNKNOWN, cause=["

    .line 1033
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " thrown from get()]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :catch_1
    const-string v0, "CANCELLED"

    .line 1031
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :catch_2
    move-exception v1

    const-string v2, "FAILURE, cause=["

    .line 1029
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    return-void
.end method

.method private ֫(Ll/֫֡;)V
    .locals 4

    const/4 v0, 0x0

    .line 171
    iput-object v0, p1, Ll/֫֡;->ۧ:Ljava/lang/Thread;

    .line 175
    :goto_0
    iget-object p1, p0, Ll/ۧ֡;->᩶:Ll/֫֡;

    .line 176
    sget-object v1, Ll/֫֡;->ܽ:Ll/֫֡;

    if-ne p1, v1, :cond_0

    goto :goto_3

    :cond_0
    move-object v1, v0

    :goto_1
    if-eqz p1, :cond_4

    .line 181
    iget-object v2, p1, Ll/֫֡;->֫:Ll/֫֡;

    .line 182
    iget-object v3, p1, Ll/֫֡;->ۧ:Ljava/lang/Thread;

    if-eqz v3, :cond_1

    move-object v1, p1

    goto :goto_2

    :cond_1
    if-eqz v1, :cond_2

    .line 185
    iput-object v2, v1, Ll/֫֡;->֫:Ll/֫֡;

    .line 186
    iget-object p1, v1, Ll/֫֡;->ۧ:Ljava/lang/Thread;

    if-nez p1, :cond_3

    goto :goto_0

    .line 190
    :cond_2
    sget-object v3, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    invoke-virtual {v3, p0, p1, v2}, Ll/۫᩵;->֫(Ll/ۧ֡;Ll/֫֡;Ll/֫֡;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    :goto_2
    move-object p1, v2

    goto :goto_1

    :cond_4
    :goto_3
    return-void
.end method

.method public static ֫(Ll/ۧ֡;)V
    .locals 4

    .line 942
    :cond_0
    iget-object v0, p0, Ll/ۧ֡;->᩶:Ll/֫֡;

    .line 943
    sget-object v1, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    sget-object v2, Ll/֫֡;->ܽ:Ll/֫֡;

    invoke-virtual {v1, p0, v0, v2}, Ll/۫᩵;->֫(Ll/ۧ֡;Ll/֫֡;Ll/֫֡;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_2

    .line 151
    iget-object v2, v0, Ll/֫֡;->ۧ:Ljava/lang/Thread;

    if-eqz v2, :cond_1

    .line 153
    iput-object v1, v0, Ll/֫֡;->ۧ:Ljava/lang/Thread;

    .line 154
    invoke-static {v2}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 945
    :cond_1
    iget-object v0, v0, Ll/֫֡;->֫:Ll/֫֡;

    goto :goto_0

    .line 963
    :cond_2
    iget-object v0, p0, Ll/ۧ֡;->᩸:Ll/ۨ᩵;

    .line 964
    sget-object v2, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    sget-object v3, Ll/ۨ᩵;->ᩳ:Ll/ۨ᩵;

    invoke-virtual {v2, p0, v0, v3}, Ll/۫᩵;->֫(Ll/ۧ֡;Ll/ۨ᩵;Ll/ۨ᩵;)Z

    move-result v2

    if-eqz v2, :cond_2

    move-object p0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 968
    iget-object v2, v0, Ll/ۨ᩵;->ۧ:Ll/ۨ᩵;

    .line 969
    iput-object p0, v0, Ll/ۨ᩵;->ۧ:Ll/ۨ᩵;

    move-object p0, v0

    move-object v0, v2

    goto :goto_1

    :cond_3
    :goto_2
    if-eqz p0, :cond_5

    .line 886
    iget-object v0, p0, Ll/ۨ᩵;->ۧ:Ll/ۨ᩵;

    .line 887
    iget-object v2, p0, Ll/ۨ᩵;->ܽ:Ljava/lang/Runnable;

    .line 888
    instance-of v3, v2, Ll/ܰ᩵;

    if-nez v3, :cond_4

    .line 905
    iget-object p0, p0, Ll/ۨ᩵;->֫:Ljava/util/concurrent/Executor;

    invoke-static {v2, p0}, Ll/ۧ֡;->ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    move-object p0, v0

    goto :goto_2

    .line 897
    :cond_4
    throw v1

    :cond_5
    return-void
.end method

.method public static ۧ(Ll/ۧ֡;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    .line 856
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ֡;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    .line 863
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :cond_0
    return-object p0

    :catchall_0
    move-exception p0

    if-eqz v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 865
    :cond_1
    throw p0

    :catch_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 1056
    :try_start_0
    invoke-interface {p1, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1061
    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "RuntimeException while executing runnable "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " with executor "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object p1, Ll/ۧ֡;->۫:Ljava/util/logging/Logger;

    invoke-virtual {p1, v1, p0, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public final cancel(Z)Z
    .locals 6

    .line 555
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    .line 557
    :goto_0
    instance-of v4, v0, Ll/ܰ᩵;

    or-int/2addr v3, v4

    if-eqz v3, :cond_6

    .line 561
    sget-boolean v3, Ll/ۧ֡;->ۗ:Z

    if-eqz v3, :cond_1

    .line 562
    new-instance v3, Ll/ۤ᩵;

    new-instance v4, Ljava/util/concurrent/CancellationException;

    const-string v5, "Future.cancel() was called."

    invoke-direct {v4, v5}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-direct {v3, v4, p1}, Ll/ۤ᩵;-><init>(Ljava/lang/Throwable;Z)V

    goto :goto_1

    :cond_1
    if-eqz p1, :cond_2

    .line 566
    sget-object v3, Ll/ۤ᩵;->ܽ:Ll/ۤ᩵;

    goto :goto_1

    .line 567
    :cond_2
    sget-object v3, Ll/ۤ᩵;->ۧ:Ll/ۤ᩵;

    .line 570
    :cond_3
    :goto_1
    sget-object p1, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    invoke-virtual {p1, p0, v0, v3}, Ll/۫᩵;->֫(Ll/ۧ֡;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 577
    invoke-static {p0}, Ll/ۧ֡;->֫(Ll/ۧ֡;)V

    .line 578
    instance-of p1, v0, Ll/ܰ᩵;

    if-nez p1, :cond_4

    return v1

    :cond_4
    const/4 p1, 0x0

    .line 601
    throw p1

    .line 607
    :cond_5
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    .line 608
    instance-of p1, v0, Ll/ܰ᩵;

    if-nez p1, :cond_3

    :cond_6
    return v2
.end method

.method public final get()Ljava/lang/Object;
    .locals 4

    .line 470
    sget-object v0, Ll/֫֡;->ܽ:Ll/֫֡;

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-nez v1, :cond_8

    .line 473
    iget-object v1, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    if-eqz v1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 474
    :goto_0
    instance-of v3, v1, Ll/ܰ᩵;

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v2, v3

    if-eqz v2, :cond_1

    .line 475
    invoke-static {v1}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 477
    :cond_1
    iget-object v1, p0, Ll/ۧ֡;->᩶:Ll/֫֡;

    if-eq v1, v0, :cond_7

    .line 479
    new-instance v2, Ll/֫֡;

    invoke-direct {v2}, Ll/֫֡;-><init>()V

    .line 143
    :cond_2
    sget-object v3, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    invoke-virtual {v3, v2, v1}, Ll/۫᩵;->֫(Ll/֫֡;Ll/֫֡;)V

    .line 482
    invoke-virtual {v3, p0, v1, v2}, Ll/۫᩵;->֫(Ll/ۧ֡;Ll/֫֡;Ll/֫֡;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 485
    :cond_3
    invoke-static {p0}, Ljava/util/concurrent/locks/LockSupport;->park(Ljava/lang/Object;)V

    .line 488
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_5

    .line 495
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    goto :goto_1

    :cond_4
    const/4 v1, 0x0

    .line 496
    :goto_1
    instance-of v3, v0, Ll/ܰ᩵;

    xor-int/lit8 v3, v3, 0x1

    and-int/2addr v1, v3

    if-eqz v1, :cond_3

    .line 497
    invoke-static {v0}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 489
    :cond_5
    invoke-direct {p0, v2}, Ll/ۧ֡;->֫(Ll/֫֡;)V

    .line 490
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0

    .line 501
    :cond_6
    iget-object v1, p0, Ll/ۧ֡;->᩶:Ll/֫֡;

    if-ne v1, v0, :cond_2

    .line 506
    :cond_7
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    invoke-static {v0}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 471
    :cond_8
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    throw v0
.end method

.method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 12

    .line 359
    sget-object v0, Ll/֫֡;->ܽ:Ll/֫֡;

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v1

    .line 361
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v3

    if-nez v3, :cond_16

    .line 364
    iget-object v3, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    if-eqz v3, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 365
    :goto_0
    instance-of v5, v3, Ll/ܰ᩵;

    xor-int/lit8 v5, v5, 0x1

    and-int/2addr v4, v5

    if-eqz v4, :cond_1

    .line 366
    invoke-static {v3}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_2

    .line 369
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    add-long/2addr v5, v1

    goto :goto_1

    :cond_2
    move-wide v5, v3

    :goto_1
    const-wide/16 v7, 0x3e8

    cmp-long v9, v1, v7

    if-ltz v9, :cond_a

    .line 372
    iget-object v9, p0, Ll/ۧ֡;->᩶:Ll/֫֡;

    if-eq v9, v0, :cond_9

    .line 374
    new-instance v10, Ll/֫֡;

    invoke-direct {v10}, Ll/֫֡;-><init>()V

    .line 143
    :cond_3
    sget-object v11, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    invoke-virtual {v11, v10, v9}, Ll/۫᩵;->֫(Ll/֫֡;Ll/֫֡;)V

    .line 377
    invoke-virtual {v11, p0, v9, v10}, Ll/۫᩵;->֫(Ll/ۧ֡;Ll/֫֡;Ll/֫֡;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 379
    :cond_4
    invoke-static {p0, v1, v2}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V

    .line 382
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_7

    .line 389
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_5
    const/4 v1, 0x0

    .line 390
    :goto_2
    instance-of v2, v0, Ll/ܰ᩵;

    xor-int/lit8 v2, v2, 0x1

    and-int/2addr v1, v2

    if-eqz v1, :cond_6

    .line 391
    invoke-static {v0}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 395
    :cond_6
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long v1, v5, v0

    cmp-long v0, v1, v7

    if-gez v0, :cond_4

    .line 399
    invoke-direct {p0, v10}, Ll/ۧ֡;->֫(Ll/֫֡;)V

    goto :goto_3

    .line 383
    :cond_7
    invoke-direct {p0, v10}, Ll/ۧ֡;->֫(Ll/֫֡;)V

    .line 384
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 404
    :cond_8
    iget-object v9, p0, Ll/ۧ֡;->᩶:Ll/֫֡;

    if-ne v9, v0, :cond_3

    .line 409
    :cond_9
    iget-object p1, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    invoke-static {p1}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_a
    :goto_3
    move-object v0, p0

    :goto_4
    cmp-long v9, v1, v3

    if-lez v9, :cond_e

    .line 414
    iget-object v1, v0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    if-eqz v1, :cond_b

    const/4 v2, 0x1

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    .line 415
    :goto_5
    instance-of v9, v1, Ll/ܰ᩵;

    xor-int/lit8 v9, v9, 0x1

    and-int/2addr v2, v9

    if-eqz v2, :cond_c

    .line 416
    invoke-static {v1}, Ll/ۧ֡;->֫(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 418
    :cond_c
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v1

    if-nez v1, :cond_d

    .line 421
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sub-long v1, v5, v1

    goto :goto_4

    .line 419
    :cond_d
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1

    .line 424
    :cond_e
    invoke-virtual {v0}, Ll/ۧ֡;->toString()Ljava/lang/String;

    move-result-object v5

    .line 425
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v6, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    const-string v10, "Waited "

    const-string v11, " "

    .line 0
    invoke-static {v10, v11, p1, p2}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 426
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    add-long v9, v1, v7

    cmp-long p2, v9, v3

    if-gez p2, :cond_14

    const-string p2, " (plus "

    .line 0
    invoke-static {p1, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    neg-long v1, v1

    .line 433
    sget-object p2, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p3, v1, v2, p2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v9

    .line 434
    invoke-virtual {p3, v9, v10}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p2

    sub-long/2addr v1, p2

    cmp-long p2, v9, v3

    if-eqz p2, :cond_10

    cmp-long p3, v1, v7

    if-lez p3, :cond_f

    goto :goto_6

    :cond_f
    const/4 p3, 0x0

    goto :goto_7

    :cond_10
    :goto_6
    const/4 p3, 0x1

    :goto_7
    if-lez p2, :cond_12

    .line 438
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p3, :cond_11

    const-string p2, ","

    .line 0
    invoke-static {p1, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_11
    invoke-static {p1, v11}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_12
    if-eqz p3, :cond_13

    .line 445
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, " nanoseconds "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_13
    const-string p2, "delay)"

    .line 0
    invoke-static {p1, p2}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 453
    :cond_14
    invoke-virtual {v0}, Ll/ۧ֡;->isDone()Z

    move-result p2

    if-eqz p2, :cond_15

    .line 454
    new-instance p2, Ljava/util/concurrent/TimeoutException;

    const-string p3, " but future completed as timeout expired"

    .line 0
    invoke-static {p1, p3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 454
    invoke-direct {p2, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 456
    :cond_15
    new-instance p2, Ljava/util/concurrent/TimeoutException;

    const-string p3, " for "

    .line 0
    invoke-static {p1, p3, v5}, Ll/᩺۠ܽ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 456
    invoke-direct {p2, p1}, Ljava/util/concurrent/TimeoutException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 362
    :cond_16
    new-instance p1, Ljava/lang/InterruptedException;

    invoke-direct {p1}, Ljava/lang/InterruptedException;-><init>()V

    throw p1
.end method

.method public final isCancelled()Z
    .locals 1

    .line 536
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    .line 537
    instance-of v0, v0, Ll/ۤ᩵;

    return v0
.end method

.method public final isDone()Z
    .locals 2

    .line 530
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 531
    :goto_0
    instance-of v0, v0, Ll/ܰ᩵;

    xor-int/lit8 v0, v0, 0x1

    and-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 978
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "[status="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 536
    iget-object v1, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    .line 537
    instance-of v1, v1, Ll/ۤ᩵;

    const-string v2, "]"

    if-eqz v1, :cond_0

    const-string v1, "CANCELLED"

    .line 980
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 981
    :cond_0
    invoke-virtual {p0}, Ll/ۧ֡;->isDone()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 982
    invoke-direct {p0, v0}, Ll/ۧ֡;->֫(Ljava/lang/StringBuilder;)V

    goto :goto_1

    .line 986
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ll/ۧ֡;->֫()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 990
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Exception thrown from implementation: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz v1, :cond_2

    .line 994
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "PENDING, info=["

    .line 0
    invoke-static {v0, v3, v1, v2}, Ll/᩶۫᩷;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 996
    :cond_2
    invoke-virtual {p0}, Ll/ۧ֡;->isDone()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 997
    invoke-direct {p0, v0}, Ll/ۧ֡;->֫(Ljava/lang/StringBuilder;)V

    goto :goto_1

    :cond_3
    const-string v1, "PENDING"

    .line 999
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1002
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 3

    .line 1013
    iget-object v0, p0, Ll/ۧ֡;->᩹:Ljava/lang/Object;

    .line 1014
    instance-of v0, v0, Ll/ܰ᩵;

    if-eqz v0, :cond_0

    const-string v0, "null"

    const-string v1, "]"

    const-string v2, "setFuture=["

    .line 0
    invoke-static {v2, v0, v1}, Ll/ۙ᩵ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 1016
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    .line 1017
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "remaining delay=["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object v1, p0

    check-cast v1, Ljava/util/concurrent/ScheduledFuture;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 1018
    invoke-interface {v1, v2}, Ljava/util/concurrent/Delayed;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " ms]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ֫(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 4

    .line 1204
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    iget-object v0, p0, Ll/ۧ֡;->᩸:Ll/ۨ᩵;

    .line 656
    sget-object v1, Ll/ۨ᩵;->ᩳ:Ll/ۨ᩵;

    if-eq v0, v1, :cond_2

    .line 657
    new-instance v2, Ll/ۨ᩵;

    invoke-direct {v2, p1, p2}, Ll/ۨ᩵;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 659
    :cond_0
    iput-object v0, v2, Ll/ۨ᩵;->ۧ:Ll/ۨ᩵;

    .line 660
    sget-object v3, Ll/ۧ֡;->ۙ:Ll/۫᩵;

    invoke-virtual {v3, p0, v0, v2}, Ll/۫᩵;->֫(Ll/ۧ֡;Ll/ۨ᩵;Ll/ۨ᩵;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 663
    :cond_1
    iget-object v0, p0, Ll/ۧ֡;->᩸:Ll/ۨ᩵;

    if-ne v0, v1, :cond_0

    .line 668
    :cond_2
    invoke-static {p1, p2}, Ll/ۧ֡;->ۧ(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method
