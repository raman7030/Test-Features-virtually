.class public final Ll/᩺ۖ֡;
.super Ljava/lang/Object;
.source "UAIG"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public ᩸:Ljava/util/concurrent/ScheduledFuture;

.field public final synthetic ᩹:Ll/֫ۘ֡;


# direct methods
.method public constructor <init>(Ll/֫ۘ֡;)V
    .locals 0

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩺ۖ֡;->᩹:Ll/֫ۘ֡;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 143
    iget-object v0, p0, Ll/᩺ۖ֡;->᩹:Ll/֫ۘ֡;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    .line 145
    :try_start_0
    invoke-static {v0}, Ll/֫ۘ֡;->֫(Ll/֫ۘ֡;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 147
    invoke-static {v0}, Ll/֫ۘ֡;->֫(Ll/֫ۘ֡;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/ClassLoader;

    if-nez v2, :cond_0

    .line 152
    invoke-virtual {p0}, Ll/᩺ۖ֡;->֫()V

    goto :goto_1

    .line 155
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 160
    :cond_1
    :try_start_1
    invoke-virtual {v0}, Ll/֫ۘ֡;->ܽ()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v2

    .line 166
    :try_start_2
    sget-object v3, Ljava/lang/System;->err:Ljava/io/PrintStream;

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->printStackTrace(Ljava/io/PrintStream;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 170
    :catch_1
    :goto_0
    :try_start_3
    invoke-virtual {v0}, Ll/֫ۘ֡;->֫()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 176
    :catch_2
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/Thread;->setContextClassLoader(Ljava/lang/ClassLoader;)V

    .line 177
    throw v0
.end method

.method public final ֫()V
    .locals 2

    .line 128
    iget-object v0, p0, Ll/᩺ۖ֡;->᩸:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method

.method public final ֫(Ljava/util/concurrent/ScheduledFuture;)V
    .locals 0

    .line 187
    iput-object p1, p0, Ll/᩺ۖ֡;->᩸:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
