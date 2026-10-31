.class public final Ll/ۛܶᩳ;
.super Ljava/lang/Object;
.source "B6QO"

# interfaces
.implements Ll/᩷۬ᩳ;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ᩸:Ll/ۜ۬ᩳ;

.field public ᩹:Ljava/io/InputStream;


# direct methods
.method public constructor <init>(Ll/ۜ۬ᩳ;Ljava/io/InputStream;)V
    .locals 0

    .line 140
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 141
    iput-object p1, p0, Ll/ۛܶᩳ;->᩸:Ll/ۜ۬ᩳ;

    .line 142
    iput-object p2, p0, Ll/ۛܶᩳ;->᩹:Ljava/io/InputStream;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    move-object v0, p0

    .line 159
    monitor-enter v0

    .line 160
    :try_start_0
    iget-object v1, p0, Ll/ۛܶᩳ;->᩹:Ljava/io/InputStream;

    const/4 v2, 0x0

    .line 161
    iput-object v2, p0, Ll/ۛܶᩳ;->᩹:Ljava/io/InputStream;

    .line 162
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 163
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 162
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public final identity()Ll/ۜ۬ᩳ;
    .locals 1

    .line 146
    iget-object v0, p0, Ll/ۛܶᩳ;->᩸:Ll/ۜ۬ᩳ;

    return-object v0
.end method

.method public final declared-synchronized ֫()Ljava/io/InputStream;
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 150
    :try_start_0
    iget-object v1, p0, Ll/ۛܶᩳ;->᩹:Ljava/io/InputStream;

    if-eqz v1, :cond_0

    const/4 v2, 0x0

    .line 152
    iput-object v2, p0, Ll/ۛܶᩳ;->᩹:Ljava/io/InputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    monitor-exit v0

    return-object v1

    .line 150
    :cond_0
    :try_start_1
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Prepared text input is closed or already opened"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    .line 153
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
