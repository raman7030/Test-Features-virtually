.class public final Ll/ۚۘۜ;
.super Ljava/lang/Object;
.source "R6VA"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public ᩸:Ljava/io/Closeable;


# direct methods
.method public constructor <init>(Ljava/io/Closeable;)V
    .locals 0

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۚۘۜ;->᩸:Ljava/io/Closeable;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 63
    :try_start_0
    iget-object v1, p0, Ll/ۚۘۜ;->᩸:Ljava/io/Closeable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x0

    .line 65
    :try_start_1
    iput-object v2, p0, Ll/ۚۘۜ;->᩸:Ljava/io/Closeable;

    .line 66
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 67
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
