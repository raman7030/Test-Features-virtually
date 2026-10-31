.class public abstract Lbin/mt/plugin/api/util/AsyncTask;
.super Ljava/lang/Object;
.source "AsyncTask.java"


# instance fields
.field public final context:Lbin/mt/plugin/api/PluginContext;

.field public executor:Ljava/util/concurrent/Executor;


# direct methods
.method public static synthetic $r8$lambda$406bpkkgsyqlN9dEFu9XO8YzfFc(Lbin/mt/plugin/api/util/AsyncTask;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lbin/mt/plugin/api/util/AsyncTask;->lambda$start$0()V

    return-void
.end method

.method public static synthetic $r8$lambda$OrI7lgWXTNktdasgjDHBAiIOQtY(Lbin/mt/plugin/api/util/AsyncTask;Ljava/lang/Exception;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lbin/mt/plugin/api/util/AsyncTask;->lambda$handleError$2(Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic $r8$lambda$S4LNLbT6x8xqbc_isUtz5PdG91g(Lbin/mt/plugin/api/util/AsyncTask;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lbin/mt/plugin/api/util/AsyncTask;->lambda$start$1()V

    return-void
.end method

.method public constructor <init>(Lbin/mt/plugin/api/PluginContext;)V
    .locals 1

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    sget-object v0, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lbin/mt/plugin/api/util/AsyncTask;->executor:Ljava/util/concurrent/Executor;

    .line 43
    iput-object p1, p0, Lbin/mt/plugin/api/util/AsyncTask;->context:Lbin/mt/plugin/api/PluginContext;

    return-void
.end method

.method private handleError(Ljava/lang/Exception;)V
    .locals 2

    .line 184
    new-instance v0, Ll/᩻۠ۢ;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Ll/᩻۠ۢ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->post(Ljava/lang/Runnable;)V

    return-void
.end method

.method private synthetic lambda$handleError$2(Ljava/lang/Exception;)V
    .locals 0

    .line 187
    :try_start_0
    invoke-virtual {p0, p1}, Lbin/mt/plugin/api/util/AsyncTask;->onException(Ljava/lang/Exception;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 190
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    .line 191
    throw p1
.end method

.method private synthetic lambda$start$0()V
    .locals 4

    .line 155
    :try_start_0
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->afterThread()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 167
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    return-void

    :catchall_0
    move-exception v0

    .line 164
    :try_start_1
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lbin/mt/plugin/api/util/AsyncTask;->onException(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_0
    move-exception v0

    .line 161
    new-instance v1, Ljava/lang/Exception;

    iget-object v2, p0, Lbin/mt/plugin/api/util/AsyncTask;->context:Lbin/mt/plugin/api/PluginContext;

    const-string v3, "{out_of_memory_error}"

    invoke-interface {v2, v3}, Lbin/mt/plugin/api/PluginContext;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lbin/mt/plugin/api/util/AsyncTask;->onException(Ljava/lang/Exception;)V

    goto :goto_0

    :catch_1
    move-exception v0

    .line 158
    invoke-virtual {p0, v0}, Lbin/mt/plugin/api/util/AsyncTask;->onException(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    :goto_0
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    return-void

    :catchall_1
    move-exception v0

    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    .line 168
    throw v0
.end method

.method private synthetic lambda$start$1()V
    .locals 4

    .line 136
    :try_start_0
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onThread()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    new-instance v0, Ll/᩹۫ܳ;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p0}, Ll/᩹۫ܳ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Lbin/mt/plugin/api/util/ThreadUtil;->post(Ljava/lang/Runnable;)V

    return-void

    :catchall_0
    move-exception v0

    .line 147
    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    invoke-direct {p0, v1}, Lbin/mt/plugin/api/util/AsyncTask;->handleError(Ljava/lang/Exception;)V

    return-void

    :catch_0
    move-exception v0

    .line 143
    new-instance v1, Ljava/lang/Exception;

    iget-object v2, p0, Lbin/mt/plugin/api/util/AsyncTask;->context:Lbin/mt/plugin/api/PluginContext;

    const-string v3, "{out_of_memory_error}"

    invoke-interface {v2, v3}, Lbin/mt/plugin/api/PluginContext;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v1}, Lbin/mt/plugin/api/util/AsyncTask;->handleError(Ljava/lang/Exception;)V

    return-void

    :catch_1
    move-exception v0

    .line 139
    invoke-direct {p0, v0}, Lbin/mt/plugin/api/util/AsyncTask;->handleError(Ljava/lang/Exception;)V

    return-void
.end method


# virtual methods
.method public abstract afterThread()V
.end method

.method public abstract beforeThread()V
.end method

.method public abstract onException(Ljava/lang/Exception;)V
.end method

.method public abstract onFinally()V
.end method

.method public abstract onThread()V
.end method

.method public start()V
    .locals 2

    .line 121
    :try_start_0
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->beforeThread()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    new-instance v0, Ll/᩵᩺ᩳ;

    const/4 v1, 0x6

    invoke-direct {v0, v1, p0}, Ll/᩵᩺ᩳ;-><init>(ILjava/lang/Object;)V

    .line 173
    iget-object v1, p0, Lbin/mt/plugin/api/util/AsyncTask;->executor:Ljava/util/concurrent/Executor;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    :catch_0
    move-exception v0

    .line 125
    :try_start_1
    invoke-virtual {p0, v0}, Lbin/mt/plugin/api/util/AsyncTask;->onException(Ljava/lang/Exception;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p0}, Lbin/mt/plugin/api/util/AsyncTask;->onFinally()V

    .line 128
    throw v0
.end method
