.class public Ll/ۛ֫;
.super Ll/ۤ֫;
.source "U6BF"


# virtual methods
.method public final ֫(Ll/᩸ۘ֫;)V
    .locals 0

    return-void
.end method

.method public final ۧ()Ll/᩸ۘ֫;
    .locals 2

    .line 4646
    iget-object v0, p0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    .line 4647
    invoke-virtual {v0}, Landroid/media/session/MediaSession;->getCurrentControllerInfo()Landroid/media/session/MediaSessionManager$RemoteUserInfo;

    move-result-object v0

    .line 4648
    new-instance v1, Ll/᩸ۘ֫;

    invoke-direct {v1, v0}, Ll/᩸ۘ֫;-><init>(Landroid/media/session/MediaSessionManager$RemoteUserInfo;)V

    return-object v1
.end method
