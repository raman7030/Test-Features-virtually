.class public final Ll/᩻ۧ;
.super Ljava/lang/Object;
.source "U6BF"


# static fields
.field public static ܽ:I


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/۫֫;


# direct methods
.method public constructor <init>(Ll/ۘ᩶ۜ;)V
    .locals 7

    .line 517
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 131
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻ۧ;->֫:Ljava/util/ArrayList;

    const-string v0, "MusicService"

    .line 521
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 526
    sget v0, Ll/ۨۘ֫;->֫:I

    .line 332
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 333
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 334
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    .line 335
    invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->queryBroadcastReceivers(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    .line 336
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v5, :cond_0

    .line 337
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 338
    new-instance v2, Landroid/content/ComponentName;

    iget-object v0, v0, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v6, v0, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    iget-object v0, v0, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v2, v6, v0}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 340
    :cond_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-object v2, v4

    :goto_0
    if-eqz v2, :cond_2

    .line 534
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 536
    invoke-virtual {v0, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 539
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v1, v2, :cond_1

    const/high16 v1, 0x2000000

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    .line 537
    :goto_1
    invoke-static {p1, v3, v0, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v4

    .line 542
    :cond_2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_3

    .line 544
    new-instance v0, Ll/᩺֫;

    .line 4614
    invoke-direct {v0, p1}, Ll/۫֫;-><init>(Ll/ۘ᩶ۜ;)V

    .line 544
    iput-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    goto :goto_2

    :cond_3
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_4

    .line 546
    new-instance v0, Ll/ۛ֫;

    .line 4614
    invoke-direct {v0, p1}, Ll/۫֫;-><init>(Ll/ۘ᩶ۜ;)V

    .line 546
    iput-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    goto :goto_2

    :cond_4
    const/16 v1, 0x16

    if-lt v0, v1, :cond_5

    .line 548
    new-instance v0, Ll/ۤ֫;

    .line 4614
    invoke-direct {v0, p1}, Ll/۫֫;-><init>(Ll/ۘ᩶ۜ;)V

    .line 548
    iput-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    goto :goto_2

    .line 550
    :cond_5
    new-instance v0, Ll/۫֫;

    invoke-direct {v0, p1}, Ll/۫֫;-><init>(Ll/ۘ᩶ۜ;)V

    iput-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    .line 553
    :goto_2
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 554
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    goto :goto_3

    :cond_6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    :goto_3
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 555
    new-instance v1, Ll/᩸֫;

    invoke-direct {v1}, Ll/ۙ֫;-><init>()V

    invoke-virtual {p0, v1, v0}, Ll/᩻ۧ;->֫(Ll/ۙ֫;Landroid/os/Handler;)V

    .line 556
    iget-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    .line 4111
    iget-object v0, v0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    invoke-virtual {v0, v4}, Landroid/media/session/MediaSession;->setMediaButtonReceiver(Landroid/app/PendingIntent;)V

    .line 567
    new-instance v0, Ll/ܶ֫;

    .line 768
    iget-object v1, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    .line 4071
    iget-object v1, v1, Ll/۫֫;->᩷:Ll/ܳۧ;

    .line 217
    invoke-direct {v0, p1, v1}, Ll/ܶ֫;-><init>(Landroid/content/Context;Ll/ܳۧ;)V

    .line 569
    sget v0, Ll/᩻ۧ;->ܽ:I

    if-nez v0, :cond_7

    .line 571
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p1

    const/high16 v0, 0x43a00000    # 320.0f

    .line 570
    invoke-static {v5, v0, p1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    sput p1, Ll/᩻ۧ;->ܽ:I

    :cond_7
    return-void

    .line 522
    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "tag must not be null or empty"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Landroid/os/Bundle;)V
    .locals 1

    if-eqz p0, :cond_0

    .line 1040
    const-class v0, Ll/᩻ۧ;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫()Ll/ܳۧ;
    .locals 1

    .line 768
    iget-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    .line 4071
    iget-object v0, v0, Ll/۫֫;->᩷:Ll/ܳۧ;

    return-object v0
.end method

.method public final ֫(Ll/ۙ֫;Landroid/os/Handler;)V
    .locals 4

    .line 607
    iget-object v1, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    if-eqz p2, :cond_0

    goto :goto_0

    .line 610
    :cond_0
    new-instance p2, Landroid/os/Handler;

    invoke-direct {p2}, Landroid/os/Handler;-><init>()V

    .line 3971
    :goto_0
    iget-object v0, v1, Ll/۫֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 3972
    :try_start_0
    iput-object p1, v1, Ll/۫֫;->֫:Ll/ۙ֫;

    .line 3973
    iget-object v2, v1, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    if-nez p1, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    iget-object v3, p1, Ll/ۙ֫;->֫:Landroid/media/session/MediaSession$Callback;

    :goto_1
    invoke-virtual {v2, v3, p2}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;Landroid/os/Handler;)V

    if-eqz p1, :cond_2

    .line 3975
    invoke-virtual {p1, v1, p2}, Ll/ۙ֫;->ۧ(Ll/ۗ֫;Landroid/os/Handler;)V

    .line 3977
    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final ֫(Ll/ۧ֫;)V
    .locals 1

    .line 4099
    iget-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    iput-object p1, v0, Ll/۫֫;->ܿ:Ll/ۧ֫;

    .line 4100
    iget-object v0, v0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    .line 4101
    invoke-virtual {p1}, Ll/ۧ֫;->ܽ()Landroid/media/MediaMetadata;

    move-result-object p1

    .line 4100
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setMetadata(Landroid/media/MediaMetadata;)V

    return-void
.end method

.method public final ֫(Ll/᩵ۧ;)V
    .locals 4

    .line 787
    iget-object v1, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    .line 4076
    iput-object p1, v1, Ll/۫֫;->ܳ:Ll/᩵ۧ;

    .line 4077
    iget-object v0, v1, Ll/۫֫;->ᩳ:Ljava/lang/Object;

    monitor-enter v0

    .line 4078
    :try_start_0
    iget-object v2, v1, Ll/۫֫;->ۧ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->beginBroadcast()I

    move-result v2

    :catch_0
    :goto_0
    add-int/lit8 v2, v2, -0x1

    if-ltz v2, :cond_0

    .line 4080
    iget-object v3, v1, Ll/۫֫;->ۧ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v3, v2}, Landroid/os/RemoteCallbackList;->getBroadcastItem(I)Landroid/os/IInterface;

    move-result-object v3

    check-cast v3, Ll/᩷֫;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4082
    :try_start_1
    invoke-interface {v3, p1}, Ll/᩷֫;->֫(Ll/᩵ۧ;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 4086
    :cond_0
    :try_start_2
    iget-object v2, v1, Ll/۫֫;->ۧ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->finishBroadcast()V

    .line 4087
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 4088
    iget-object v0, v1, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    .line 4089
    invoke-virtual {p1}, Ll/᩵ۧ;->֫()Landroid/media/session/PlaybackState;

    move-result-object p1

    .line 4088
    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setPlaybackState(Landroid/media/session/PlaybackState;)V

    return-void

    :catchall_0
    move-exception p1

    .line 4087
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1
.end method

.method public final ֫(Z)V
    .locals 1

    .line 714
    iget-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    .line 4019
    iget-object v0, v0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    invoke-virtual {v0, p1}, Landroid/media/session/MediaSession;->setActive(Z)V

    .line 715
    iget-object p1, p0, Ll/᩻ۧ;->֫:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܰ֫;

    .line 716
    invoke-interface {v0}, Ll/ܰ֫;->֫()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()V
    .locals 5

    .line 4047
    iget-object v0, p0, Ll/᩻ۧ;->ۧ:Ll/۫֫;

    iget-object v1, v0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    .line 4048
    iget-object v2, v0, Ll/۫֫;->ۧ:Landroid/os/RemoteCallbackList;

    invoke-virtual {v2}, Landroid/os/RemoteCallbackList;->kill()V

    .line 4049
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1b

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    .line 4052
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    const-string v3, "mCallback"

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    const/4 v3, 0x1

    .line 4053
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 4054
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Handler;

    if-eqz v2, :cond_0

    .line 4056
    invoke-virtual {v2, v4}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 4064
    :catch_0
    :cond_0
    invoke-virtual {v1, v4}, Landroid/media/session/MediaSession;->setCallback(Landroid/media/session/MediaSession$Callback;)V

    .line 4065
    iget-object v0, v0, Ll/۫֫;->ܽ:Ll/۬֫;

    invoke-virtual {v0}, Ll/۬֫;->۬()V

    .line 4066
    invoke-virtual {v1}, Landroid/media/session/MediaSession;->release()V

    return-void
.end method
