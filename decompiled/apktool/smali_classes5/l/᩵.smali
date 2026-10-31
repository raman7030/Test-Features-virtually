.class public Ll/᩵;
.super Ljava/lang/Object;
.source "95XT"

# interfaces
.implements Ll/֨;


# instance fields
.field public final ֫:Landroid/media/browse/MediaBrowser;

.field public final ۜ:Ll/ۖ᩵;

.field public ۧ:Landroid/os/Messenger;

.field public final ܳ:Landroid/os/Bundle;

.field public final ܽ:Landroid/content/Context;

.field public ܿ:Ll/ܳۧ;

.field public final ᩳ:Ll/ۡ;

.field public ᩻:Ll/᩹;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Ll/ۖ;)V
    .locals 3

    .line 1662
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1652
    new-instance v0, Ll/ۡ;

    invoke-direct {v0, p0}, Ll/ۡ;-><init>(Ll/᩵;)V

    iput-object v0, p0, Ll/᩵;->ᩳ:Ll/ۡ;

    .line 1653
    new-instance v0, Ll/ۖ᩵;

    invoke-direct {v0}, Ll/ۖ᩵;-><init>()V

    iput-object v0, p0, Ll/᩵;->ۜ:Ll/ۖ᩵;

    .line 1663
    iput-object p1, p0, Ll/᩵;->ܽ:Landroid/content/Context;

    .line 1664
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Ll/᩵;->ܳ:Landroid/os/Bundle;

    const-string v1, "extra_client_version"

    const/4 v2, 0x1

    .line 1665
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "extra_calling_pid"

    .line 1666
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 685
    iput-object p0, p3, Ll/ۖ;->ۧ:Ll/᩵;

    .line 1668
    new-instance v1, Landroid/media/browse/MediaBrowser;

    iget-object p3, p3, Ll/ۖ;->֫:Landroid/media/browse/MediaBrowser$ConnectionCallback;

    invoke-direct {v1, p1, p2, p3, v0}, Landroid/media/browse/MediaBrowser;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Landroid/media/browse/MediaBrowser$ConnectionCallback;Landroid/os/Bundle;)V

    iput-object v1, p0, Ll/᩵;->֫:Landroid/media/browse/MediaBrowser;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Landroid/os/Messenger;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1978
    iget-object v0, p0, Ll/᩵;->ۧ:Landroid/os/Messenger;

    if-eq v0, p1, :cond_0

    return-void

    .line 1983
    :cond_0
    iget-object p1, p0, Ll/᩵;->ۜ:Ll/ۖ᩵;

    const/4 v0, 0x0

    .line 369
    invoke-virtual {p1, p2, v0}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 1983
    check-cast p1, Ll/᩶;

    if-nez p1, :cond_1

    .line 1985
    sget p1, Ll/۫;->ۧ:I

    return-void

    .line 1992
    :cond_1
    invoke-virtual {p1, p3}, Ll/᩶;->֫(Landroid/os/Bundle;)V

    return-void
.end method

.method public final ۧ()V
    .locals 0

    return-void
.end method

.method public final ܽ()Ll/ܳۧ;
    .locals 2

    .line 1714
    iget-object v0, p0, Ll/᩵;->ܿ:Ll/ܳۧ;

    if-nez v0, :cond_0

    .line 1715
    iget-object v0, p0, Ll/᩵;->֫:Landroid/media/browse/MediaBrowser;

    .line 1716
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v0

    const/4 v1, 0x0

    .line 1955
    invoke-static {v0, v1}, Ll/ܳۧ;->֫(Landroid/media/session/MediaSession$Token;Ll/ۖ֫;)Ll/ܳۧ;

    move-result-object v0

    .line 1715
    iput-object v0, p0, Ll/᩵;->ܿ:Ll/ܳۧ;

    .line 1718
    :cond_0
    iget-object v0, p0, Ll/᩵;->ܿ:Ll/ܳۧ;

    return-object v0
.end method

.method public final ܿ()V
    .locals 2

    const/4 v0, 0x0

    .line 1952
    iput-object v0, p0, Ll/᩵;->᩻:Ll/᩹;

    .line 1953
    iput-object v0, p0, Ll/᩵;->ۧ:Landroid/os/Messenger;

    .line 1954
    iput-object v0, p0, Ll/᩵;->ܿ:Ll/ܳۧ;

    .line 1955
    iget-object v1, p0, Ll/᩵;->ᩳ:Ll/ۡ;

    invoke-virtual {v1, v0}, Ll/ۡ;->֫(Landroid/os/Messenger;)V

    return-void
.end method

.method public final ᩳ()V
    .locals 5

    .line 1921
    iget-object v0, p0, Ll/᩵;->֫:Landroid/media/browse/MediaBrowser;

    :try_start_0
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getExtras()Landroid/os/Bundle;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "extra_service_version"

    const/4 v3, 0x0

    .line 1930
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    const-string v2, "extra_messenger"

    .line 44
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 1933
    new-instance v3, Ll/᩹;

    iget-object v4, p0, Ll/᩵;->ܳ:Landroid/os/Bundle;

    invoke-direct {v3, v2, v4}, Ll/᩹;-><init>(Landroid/os/IBinder;Landroid/os/Bundle;)V

    iput-object v3, p0, Ll/᩵;->᩻:Ll/᩹;

    .line 1934
    new-instance v2, Landroid/os/Messenger;

    iget-object v3, p0, Ll/᩵;->ᩳ:Ll/ۡ;

    invoke-direct {v2, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v2, p0, Ll/᩵;->ۧ:Landroid/os/Messenger;

    .line 1935
    invoke-virtual {v3, v2}, Ll/ۡ;->֫(Landroid/os/Messenger;)V

    .line 1937
    :try_start_1
    iget-object v2, p0, Ll/᩵;->᩻:Ll/᩹;

    iget-object v3, p0, Ll/᩵;->ܽ:Landroid/content/Context;

    iget-object v4, p0, Ll/᩵;->ۧ:Landroid/os/Messenger;

    invoke-virtual {v2, v3, v4}, Ll/᩹;->֫(Landroid/content/Context;Landroid/os/Messenger;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    nop

    :cond_1
    :goto_0
    const-string v2, "extra_session_binder"

    .line 44
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBinder(Ljava/lang/String;)Landroid/os/IBinder;

    move-result-object v1

    .line 1942
    invoke-static {v1}, Ll/ۡ֫;->֫(Landroid/os/IBinder;)Ll/ۖ֫;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 1946
    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->getSessionToken()Landroid/media/session/MediaSession$Token;

    move-result-object v0

    .line 1945
    invoke-static {v0, v1}, Ll/ܳۧ;->֫(Landroid/media/session/MediaSession$Token;Ll/ۖ֫;)Ll/ܳۧ;

    move-result-object v0

    iput-object v0, p0, Ll/᩵;->ܿ:Ll/ܳۧ;

    :catch_1
    :cond_2
    :goto_1
    return-void
.end method
