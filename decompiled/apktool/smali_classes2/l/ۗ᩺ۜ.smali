.class public final Ll/ۗ᩺ۜ;
.super Ljava/lang/Object;
.source "P6N0"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ljava/util/List;

.field public ۙ:Z

.field public ᩶:Z

.field public final ᩸:Ljava/io/File;

.field public final ᩹:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/io/File;Ljava/util/concurrent/Executor;)V
    .locals 1

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۗ᩺ۜ;->ۗ:Ljava/util/List;

    .line 213
    iput-object p2, p0, Ll/ۗ᩺ۜ;->᩸:Ljava/io/File;

    .line 214
    iput-object p3, p0, Ll/ۗ᩺ۜ;->᩹:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic ֫(Ll/ۗ᩺ۜ;)V
    .locals 0

    .line 234
    iget-object p0, p0, Ll/ۗ᩺ۜ;->᩸:Ljava/io/File;

    invoke-static {p0}, Ll/۬᩺ۜ;->֫(Ljava/io/File;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    move-object v0, p0

    .line 228
    monitor-enter v0

    .line 229
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ᩺ۜ;->᩶:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 230
    iput-boolean v1, p0, Ll/ۗ᩺ۜ;->᩶:Z

    .line 231
    iget-boolean v1, p0, Ll/ۗ᩺ۜ;->ۙ:Z

    if-nez v1, :cond_3

    iget-object v1, p0, Ll/ۗ᩺ۜ;->᩸:Ljava/io/File;

    if-nez v1, :cond_1

    goto :goto_0

    .line 232
    :cond_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 233
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_2

    .line 234
    iget-object v0, p0, Ll/ۗ᩺ۜ;->᩹:Ljava/util/concurrent/Executor;

    new-instance v1, Ll/᩹᩶۠;

    const/4 v2, 0x3

    invoke-direct {v1, v2, p0}, Ll/᩹᩶۠;-><init>(ILjava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void

    .line 235
    :cond_2
    iget-object v0, p0, Ll/ۗ᩺ۜ;->᩸:Ljava/io/File;

    invoke-static {v0}, Ll/۬᩺ۜ;->֫(Ljava/io/File;)V

    return-void

    .line 231
    :cond_3
    :goto_0
    :try_start_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    .line 232
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final ֫()Ljava/util/List;
    .locals 1

    .line 217
    iget-object v0, p0, Ll/ۗ᩺ۜ;->ۗ:Ljava/util/List;

    return-object v0
.end method

.method public final declared-synchronized ܽ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 221
    :try_start_0
    iget-boolean v1, p0, Ll/ۗ᩺ۜ;->᩶:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    .line 222
    iput-boolean v1, p0, Ll/ۗ᩺ۜ;->ۙ:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 223
    monitor-exit v0

    return-void

    .line 221
    :cond_0
    :try_start_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Image export already closed"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 223
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
