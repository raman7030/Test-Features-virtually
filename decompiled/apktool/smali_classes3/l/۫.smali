.class public final Ll/۫;
.super Ljava/lang/Object;
.source "95XT"


# static fields
.field public static final synthetic ۧ:I


# instance fields
.field public final ֫:Ll/᩵;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "MediaBrowserCompat"

    const/4 v1, 0x3

    .line 126
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/ComponentName;Ll/ۖ;)V
    .locals 2

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 207
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 208
    new-instance v0, Ll/ۚ;

    .line 2024
    invoke-direct {v0, p1, p2, p3}, Ll/᩵;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ll/ۖ;)V

    .line 208
    iput-object v0, p0, Ll/۫;->֫:Ll/᩵;

    return-void

    :cond_0
    const/16 v1, 0x17

    if-lt v0, v1, :cond_1

    .line 210
    new-instance v0, Ll/֡;

    .line 2024
    invoke-direct {v0, p1, p2, p3}, Ll/᩵;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ll/ۖ;)V

    .line 210
    iput-object v0, p0, Ll/۫;->֫:Ll/᩵;

    return-void

    .line 212
    :cond_1
    new-instance v0, Ll/᩵;

    invoke-direct {v0, p1, p2, p3}, Ll/᩵;-><init>(Landroid/content/Context;Landroid/content/ComponentName;Ll/ۖ;)V

    iput-object v0, p0, Ll/۫;->֫:Ll/᩵;

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 1

    .line 227
    iget-object v0, p0, Ll/۫;->֫:Ll/᩵;

    .line 1674
    iget-object v0, v0, Ll/᩵;->֫:Landroid/media/browse/MediaBrowser;

    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->connect()V

    return-void
.end method

.method public final ۧ()V
    .locals 3

    .line 1679
    iget-object v0, p0, Ll/۫;->֫:Ll/᩵;

    iget-object v1, v0, Ll/᩵;->᩻:Ll/᩹;

    if-eqz v1, :cond_0

    iget-object v2, v0, Ll/᩵;->ۧ:Landroid/os/Messenger;

    if-eqz v2, :cond_0

    .line 1681
    :try_start_0
    invoke-virtual {v1, v2}, Ll/᩹;->֫(Landroid/os/Messenger;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1686
    :catch_0
    :cond_0
    iget-object v0, v0, Ll/᩵;->֫:Landroid/media/browse/MediaBrowser;

    invoke-virtual {v0}, Landroid/media/browse/MediaBrowser;->disconnect()V

    return-void
.end method

.method public final ܽ()Ll/ܳۧ;
    .locals 1

    .line 291
    iget-object v0, p0, Ll/۫;->֫:Ll/᩵;

    invoke-virtual {v0}, Ll/᩵;->ܽ()Ll/ܳۧ;

    move-result-object v0

    return-object v0
.end method
