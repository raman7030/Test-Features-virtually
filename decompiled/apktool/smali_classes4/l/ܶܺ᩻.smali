.class public final Ll/ܶܺ᩻;
.super Ljava/io/BufferedInputStream;
.source "5AG2"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ᩸:Z

.field public final synthetic ᩹:Ll/۬ܺ᩻;


# direct methods
.method public constructor <init>(Ll/ۙܺ᩻;Ljava/io/InputStream;Ll/۬ܺ᩻;)V
    .locals 0

    .line 278
    iput-object p3, p0, Ll/ܶܺ᩻;->᩹:Ll/۬ܺ᩻;

    invoke-direct {p0, p2}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 283
    :try_start_0
    iget-boolean v1, p0, Ll/ܶܺ᩻;->᩸:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 284
    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 286
    :try_start_1
    iput-boolean v1, p0, Ll/ܶܺ᩻;->᩸:Z

    .line 287
    invoke-super {p0}, Ljava/io/BufferedInputStream;->close()V

    .line 288
    sget-object v1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    iget-object v2, p0, Ll/ܶܺ᩻;->᩹:Ll/۬ܺ᩻;

    new-instance v3, Ll/۠ܺ᩻;

    invoke-direct {v3, p0, v2}, Ll/۠ܺ᩻;-><init>(Ll/ܶܺ᩻;Ll/۬ܺ᩻;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 303
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final finalize()V
    .locals 0

    .line 307
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 308
    invoke-virtual {p0}, Ll/ܶܺ᩻;->close()V

    return-void
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
