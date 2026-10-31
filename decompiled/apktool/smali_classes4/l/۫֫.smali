.class public Ll/۫֫;
.super Ljava/lang/Object;
.source "U6BF"

# interfaces
.implements Ll/ۗ֫;


# instance fields
.field public ֫:Ll/ۙ֫;

.field public final ۜ:Landroid/media/session/MediaSession;

.field public final ۧ:Landroid/os/RemoteCallbackList;

.field public ܳ:Ll/᩵ۧ;

.field public final ܽ:Ll/۬֫;

.field public ܿ:Ll/ۧ֫;

.field public final ᩳ:Ljava/lang/Object;

.field public final ᩷:Ll/ܳۧ;

.field public ᩻:Ll/᩸ۘ֫;


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۜ;)V
    .locals 3

    .line 3943
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3920
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Ll/۫֫;->ᩳ:Ljava/lang/Object;

    .line 3924
    new-instance v0, Landroid/os/RemoteCallbackList;

    invoke-direct {v0}, Landroid/os/RemoteCallbackList;-><init>()V

    iput-object v0, p0, Ll/۫֫;->ۧ:Landroid/os/RemoteCallbackList;

    .line 3944
    invoke-virtual {p0, p1}, Ll/۫֫;->֫(Ll/ۘ᩶ۜ;)Landroid/media/session/MediaSession;

    move-result-object p1

    iput-object p1, p0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    .line 3945
    new-instance v0, Ll/۬֫;

    invoke-direct {v0, p0}, Ll/۬֫;-><init>(Ll/۫֫;)V

    iput-object v0, p0, Ll/۫֫;->ܽ:Ll/۬֫;

    .line 3946
    new-instance v1, Ll/ܳۧ;

    invoke-virtual {p1}, Landroid/media/session/MediaSession;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ll/ܳۧ;-><init>(Ljava/lang/Object;Ll/ۖ֫;)V

    iput-object v1, p0, Ll/۫֫;->᩷:Ll/ܳۧ;

    const/4 v0, 0x3

    .line 4000
    invoke-virtual {p1, v0}, Landroid/media/session/MediaSession;->setFlags(I)V

    return-void
.end method


# virtual methods
.method public ֫(Ll/ۘ᩶ۜ;)Landroid/media/session/MediaSession;
    .locals 2

    .line 3966
    new-instance v0, Landroid/media/session/MediaSession;

    const-string v1, "MusicService"

    invoke-direct {v0, p1, v1}, Landroid/media/session/MediaSession;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫()Ll/ۙ֫;
    .locals 2

    .line 4241
    iget-object v0, p0, Ll/۫֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 4242
    :try_start_0
    iget-object v1, p0, Ll/۫֫;->֫:Ll/ۙ֫;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 4243
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public ֫(Ll/᩸ۘ֫;)V
    .locals 1

    .line 4211
    iget-object v0, p0, Ll/۫֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 4212
    :try_start_0
    iput-object p1, p0, Ll/۫֫;->᩻:Ll/᩸ۘ֫;

    .line 4213
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public ۧ()Ll/᩸ۘ֫;
    .locals 2

    .line 4234
    iget-object v0, p0, Ll/۫֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 4235
    :try_start_0
    iget-object v1, p0, Ll/۫֫;->᩻:Ll/᩸ۘ֫;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 4236
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final ᩳ()Ll/᩵ۧ;
    .locals 1

    .line 4094
    iget-object v0, p0, Ll/۫֫;->ܳ:Ll/᩵ۧ;

    return-object v0
.end method
