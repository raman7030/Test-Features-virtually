.class public Ll/ۨۖ֫;
.super Landroid/service/media/MediaBrowserService;
.source "X6AW"


# instance fields
.field public final synthetic ᩸:Ll/᩺ۖ֫;


# direct methods
.method public constructor <init>(Ll/᩺ۖ֫;Landroid/content/Context;)V
    .locals 0

    .line 507
    iput-object p1, p0, Ll/ۨۖ֫;->᩸:Ll/᩺ۖ֫;

    invoke-direct {p0}, Landroid/service/media/MediaBrowserService;-><init>()V

    .line 508
    invoke-virtual {p0, p2}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public final onGetRoot(Ljava/lang/String;ILandroid/os/Bundle;)Landroid/service/media/MediaBrowserService$BrowserRoot;
    .locals 10

    .line 514
    invoke-static {p3}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 515
    iget-object v0, p0, Ll/ۨۖ֫;->᩸:Ll/᩺ۖ֫;

    iget-object v7, v0, Ll/᩺ۖ֫;->ᩳ:Ll/ܶۘ֫;

    const/4 v8, 0x0

    if-nez p3, :cond_0

    move-object v1, v8

    goto :goto_0

    .line 517
    :cond_0
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    :goto_0
    const/4 p3, -0x1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    const-string v3, "extra_client_version"

    .line 357
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-eqz v2, :cond_1

    .line 358
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 359
    new-instance v2, Landroid/os/Messenger;

    iget-object v3, v7, Ll/ܶۘ֫;->᩹:Ll/۠ۘ֫;

    invoke-direct {v2, v3}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V

    iput-object v2, v0, Ll/᩺ۖ֫;->֫:Landroid/os/Messenger;

    .line 360
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "extra_service_version"

    const/4 v4, 0x2

    .line 361
    invoke-virtual {v2, v3, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 362
    iget-object v3, v0, Ll/᩺ۖ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {v3}, Landroid/os/Messenger;->getBinder()Landroid/os/IBinder;

    move-result-object v3

    const-string v4, "extra_messenger"

    .line 56
    invoke-virtual {v2, v4, v3}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    .line 368
    iget-object v3, v0, Ll/᩺ۖ֫;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v3, "extra_calling_pid"

    .line 370
    invoke-virtual {v1, v3, p3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p3

    .line 371
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    move v4, p3

    move-object p3, v2

    goto :goto_1

    :cond_1
    const/4 p3, -0x1

    move-object p3, v8

    const/4 v4, -0x1

    .line 373
    :goto_1
    new-instance v9, Ll/ۤۖ֫;

    const/4 v6, 0x0

    move-object v1, v9

    move-object v2, v7

    move-object v3, p1

    move v5, p2

    invoke-direct/range {v1 .. v6}, Ll/ۤۖ֫;-><init>(Ll/ܶۘ֫;Ljava/lang/String;IILl/֨ۘ֫;)V

    .line 378
    invoke-virtual {v7}, Ll/ܶۘ֫;->֫()Ll/۬ۖ֫;

    move-result-object p1

    if-nez p1, :cond_2

    move-object p2, v8

    goto :goto_3

    .line 384
    :cond_2
    iget-object p2, v0, Ll/᩺ۖ֫;->֫:Landroid/os/Messenger;

    if-eqz p2, :cond_3

    .line 389
    iget-object p2, v7, Ll/ܶۘ֫;->ۙ:Ljava/util/ArrayList;

    invoke-virtual {p2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    if-nez p3, :cond_4

    .line 392
    invoke-virtual {p1}, Ll/۬ۖ֫;->֫()Landroid/os/Bundle;

    move-result-object p3

    goto :goto_2

    .line 393
    :cond_4
    invoke-virtual {p1}, Ll/۬ۖ֫;->֫()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_5

    .line 394
    invoke-virtual {p1}, Ll/۬ۖ֫;->֫()Landroid/os/Bundle;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 396
    :cond_5
    :goto_2
    new-instance p2, Ll/۬ۖ֫;

    invoke-virtual {p1}, Ll/۬ۖ֫;->ۧ()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p3, p1}, Ll/۬ۖ֫;-><init>(Landroid/os/Bundle;Ljava/lang/String;)V

    :goto_3
    if-nez p2, :cond_6

    return-object v8

    .line 518
    :cond_6
    new-instance p1, Landroid/service/media/MediaBrowserService$BrowserRoot;

    .line 519
    invoke-static {p2}, Ll/۬ۖ֫;->֫(Ll/۬ۖ֫;)Ljava/lang/String;

    move-result-object p3

    invoke-static {p2}, Ll/۬ۖ֫;->ۧ(Ll/۬ۖ֫;)Landroid/os/Bundle;

    move-result-object p2

    invoke-direct {p1, p3, p2}, Landroid/service/media/MediaBrowserService$BrowserRoot;-><init>(Ljava/lang/String;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final onLoadChildren(Ljava/lang/String;Landroid/service/media/MediaBrowserService$Result;)V
    .locals 0

    .line 525
    iget-object p1, p0, Ll/ۨۖ֫;->᩸:Ll/᩺ۖ֫;

    .line 434
    iget-object p1, p1, Ll/᩺ۖ֫;->ᩳ:Ll/ܶۘ֫;

    .line 435
    invoke-virtual {p1}, Ll/ܶۘ֫;->ۧ()V

    return-void
.end method
