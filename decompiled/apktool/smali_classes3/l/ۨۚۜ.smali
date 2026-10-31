.class public final Ll/ۨۚۜ;
.super Ljava/lang/Object;
.source "574A"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ᩸:Z

.field public final ᩹:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Ll/ۨۚۜ;->᩹:Ljava/util/HashMap;

    return-void
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/InterruptedException;)Ljava/io/InterruptedIOException;
    .locals 1

    .line 52
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0, p0}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    .line 54
    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/ۨۚۜ;Ll/۫ۚۜ;)V
    .locals 1

    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    invoke-static {p1}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;)Ll/ۤۚۜ;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ll/۫ۚۜ;->ܽ(Ll/۫ۚۜ;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Ll/۫ۚۜ;->ᩳ(Ll/۫ۚۜ;)I

    move-result v0

    if-nez v0, :cond_0

    .line 45
    iget-object p0, p0, Ll/ۨۚۜ;->᩹:Ljava/util/HashMap;

    invoke-static {p1}, Ll/۫ۚۜ;->֫(Ll/۫ۚۜ;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0, p1}, Ll/ܰ۬ᩴ;->remove(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨۚۜ;)Z
    .locals 0

    .line 0
    iget-boolean p0, p0, Ll/ۨۚۜ;->᩸:Z

    return p0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    const/4 v1, 0x1

    .line 33
    :try_start_0
    iput-boolean v1, p0, Ll/ۨۚۜ;->᩸:Z

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final declared-synchronized ֫(Ljava/lang/String;)Ll/ۤۚۜ;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 38
    :try_start_0
    iget-boolean v1, p0, Ll/ۨۚۜ;->᩸:Z

    if-nez v1, :cond_0

    .line 20
    iget-object v1, p0, Ll/ۨۚۜ;->᩹:Ljava/util/HashMap;

    new-instance v2, Ll/۬ۚۜ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v1, p1, v2}, Ll/ܰ۬ᩴ;->computeIfAbsent(Ljava/util/Map;Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۫ۚۜ;

    .line 21
    invoke-static {p1}, Ll/۫ۚۜ;->ᩳ(Ll/۫ۚۜ;)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-static {p1, v1}, Ll/۫ۚۜ;->ۧ(Ll/۫ۚۜ;I)V

    .line 22
    new-instance v1, Ll/ۤۚۜ;

    invoke-direct {v1, p0, p1}, Ll/ۤۚۜ;-><init>(Ll/ۨۚۜ;Ll/۫ۚۜ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    const-string p1, "HLS playlist cache coordinator was closed"

    .line 52
    new-instance v1, Ljava/io/InterruptedIOException;

    invoke-direct {v1, p1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 39
    throw v1

    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
