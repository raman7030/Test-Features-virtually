.class public final Ll/᩶֫;
.super Landroid/media/session/MediaSession$Callback;
.source "U6BF"


# instance fields
.field public final synthetic ֫:Ll/ۙ֫;


# direct methods
.method public constructor <init>(Ll/ۙ֫;)V
    .locals 0

    .line 1521
    iput-object p1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-direct {p0}, Landroid/media/session/MediaSession$Callback;-><init>()V

    return-void
.end method

.method private ֫()Ll/۫֫;
    .locals 3

    .line 1882
    iget-object v0, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    iget-object v0, v0, Ll/ۙ֫;->ܽ:Ljava/lang/Object;

    monitor-enter v0

    .line 1883
    :try_start_0
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    iget-object v1, v1, Ll/ۙ֫;->ܿ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۫֫;

    .line 1884
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 1886
    iget-object v0, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1}, Ll/۫֫;->֫()Ll/ۙ֫;

    move-result-object v2

    if-ne v0, v2, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x0

    return-object v0

    :catchall_0
    move-exception v1

    .line 1884
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ֫(Ll/۫֫;)V
    .locals 4

    .line 1859
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    return-void

    .line 4218
    :cond_0
    iget-object v1, p0, Ll/۫֫;->ۜ:Landroid/media/session/MediaSession;

    const/16 v2, 0x18

    const/4 v3, 0x0

    if-ge v0, v2, :cond_1

    goto :goto_0

    .line 4222
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getCallingPackage"

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    .line 4224
    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    goto :goto_0

    :catch_0
    nop

    .line 1866
    :goto_0
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v3, "android.media.session.MediaController"

    .line 1869
    :cond_2
    new-instance v0, Ll/᩸ۘ֫;

    const/4 v1, -0x1

    invoke-direct {v0, v3, v1, v1}, Ll/᩸ۘ֫;-><init>(Ljava/lang/String;II)V

    invoke-interface {p0, v0}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method


# virtual methods
.method public final onCommand(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/ResultReceiver;)V
    .locals 6

    .line 1527
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1531
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1532
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "android.support.v4.media.session.command.GET_EXTRA_BINDER"

    .line 1534
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1535
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    .line 4071
    iget-object p2, v0, Ll/۫֫;->᩷:Ll/ܳۧ;

    .line 1537
    invoke-virtual {p2}, Ll/ܳۧ;->֫()Ll/ۖ֫;

    move-result-object v2

    const-string v3, "android.support.v4.media.session.EXTRA_BINDER"

    if-nez v2, :cond_1

    move-object v2, v1

    goto :goto_0

    .line 1539
    :cond_1
    invoke-interface {v2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object v2

    .line 56
    :goto_0
    invoke-virtual {p1, v3, v2}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    const-string v2, "android.support.v4.media.session.SESSION_TOKEN2"

    .line 1541
    invoke-virtual {p2}, Ll/ܳۧ;->ۧ()Ll/ۛ᩺ۧ;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_1

    .line 94
    :cond_2
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "a"

    .line 48
    new-instance v5, Ll/ۗ᩺ۧ;

    invoke-direct {v5, p2}, Ll/ۗ᩺ۧ;-><init>(Ll/ۛ᩺ۧ;)V

    .line 95
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 96
    invoke-virtual {p1, v2, v3}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    :goto_1
    const/4 p2, 0x0

    .line 1542
    invoke-virtual {p3, p2, p1}, Landroid/os/ResultReceiver;->send(ILandroid/os/Bundle;)V

    goto :goto_2

    :cond_3
    const-string p3, "android.support.v4.media.session.command.ADD_QUEUE_ITEM"

    .line 1543
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"

    if-eqz p3, :cond_4

    .line 1545
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ܰ;

    goto :goto_2

    :cond_4
    const-string p3, "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"

    .line 1547
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_5

    .line 1549
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ܰ;

    const-string p1, "android.support.v4.media.session.command.ARGUMENT_INDEX"

    .line 1551
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    goto :goto_2

    :cond_5
    const-string p3, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"

    .line 1552
    invoke-virtual {p1, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 1554
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ܰ;

    goto :goto_2

    :cond_6
    const-string p2, "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"

    .line 1556
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_1
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1874
    :catch_0
    :goto_2
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onCustomAction(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 4

    .line 1738
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1742
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1743
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    :try_start_0
    const-string v1, "android.support.v4.media.session.action.PLAY_FROM_URI"

    .line 1746
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v2, "android.support.v4.media.session.action.ARGUMENT_URI"

    const-string v3, "android.support.v4.media.session.action.ARGUMENT_EXTRAS"

    if-eqz v1, :cond_1

    .line 1747
    :try_start_1
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 1748
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 1749
    invoke-static {p1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    goto/16 :goto_0

    :cond_1
    const-string v1, "android.support.v4.media.session.action.PREPARE"

    .line 1751
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_0

    :cond_2
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID"

    .line 1753
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID"

    .line 1754
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1755
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 1756
    invoke-static {p1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    goto/16 :goto_0

    :cond_3
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_SEARCH"

    .line 1758
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_QUERY"

    .line 1759
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1760
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 1761
    invoke-static {p1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_4
    const-string v1, "android.support.v4.media.session.action.PREPARE_FROM_URI"

    .line 1763
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 1764
    invoke-virtual {p2, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/net/Uri;

    .line 1765
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 1766
    invoke-static {p1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_5
    const-string v1, "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED"

    .line 1768
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"

    .line 1769
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    goto :goto_0

    :cond_6
    const-string v1, "android.support.v4.media.session.action.SET_REPEAT_MODE"

    .line 1771
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"

    .line 1772
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    goto :goto_0

    :cond_7
    const-string v1, "android.support.v4.media.session.action.SET_SHUFFLE_MODE"

    .line 1774
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"

    .line 1775
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    goto :goto_0

    :cond_8
    const-string v1, "android.support.v4.media.session.action.SET_RATING"

    .line 1777
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_RATING"

    .line 1778
    invoke-virtual {p2, p1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ܿ֫;

    .line 1779
    invoke-virtual {p2, v3}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    .line 1780
    invoke-static {p1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_9
    const-string v1, "android.support.v4.media.session.action.SET_PLAYBACK_SPEED"

    .line 1782
    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    const-string p1, "android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED"

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1783
    invoke-virtual {p2, p1, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F
    :try_end_1
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_a
    :goto_0
    const/4 p1, 0x0

    .line 1874
    invoke-interface {v0, p1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onFastForward()V
    .locals 2

    .line 1683
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1687
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onMediaButtonEvent(Landroid/content/Intent;)Z
    .locals 3

    .line 1579
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 1583
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1584
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1, p1}, Ll/ۙ֫;->֫(Landroid/content/Intent;)Z

    move-result v1

    const/4 v2, 0x0

    .line 1874
    invoke-interface {v0, v2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    if-nez v1, :cond_2

    .line 1586
    invoke-super {p0, p1}, Landroid/media/session/MediaSession$Callback;->onMediaButtonEvent(Landroid/content/Intent;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final onPause()V
    .locals 2

    .line 1650
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1654
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1655
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1}, Ll/ۙ֫;->֫()V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPlay()V
    .locals 2

    .line 1591
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1595
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1596
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1}, Ll/ۙ֫;->ۧ()V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPlayFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1602
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1606
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1607
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPlayFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1614
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1618
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1619
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPlayFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 0

    .line 1627
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1631
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1632
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPrepare()V
    .locals 2

    .line 1798
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1802
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPrepareFromMediaId(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1810
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1814
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1815
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPrepareFromSearch(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    .line 1823
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1827
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1828
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onPrepareFromUri(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 0

    .line 1836
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1840
    :cond_0
    invoke-static {p2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 1841
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onRewind()V
    .locals 2

    .line 1694
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1698
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onSeekTo(J)V
    .locals 2

    .line 1716
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1720
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1721
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1, p1, p2}, Ll/ۙ֫;->֫(J)V

    const/4 p1, 0x0

    .line 1874
    invoke-interface {v0, p1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onSetPlaybackSpeed(F)V
    .locals 1

    .line 1849
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1853
    :cond_0
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 v0, 0x0

    .line 1874
    invoke-interface {p1, v0}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onSetRating(Landroid/media/Rating;)V
    .locals 1

    .line 1727
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1731
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1732
    invoke-static {p1}, Ll/ܿ֫;->֫(Landroid/media/Rating;)Ll/ܿ֫;

    const/4 p1, 0x0

    .line 1874
    invoke-interface {v0, p1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onSkipToNext()V
    .locals 2

    .line 1661
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1665
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1666
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1}, Ll/ۙ֫;->ܽ()V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onSkipToPrevious()V
    .locals 2

    .line 1672
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1676
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    .line 1677
    iget-object v1, p0, Ll/᩶֫;->֫:Ll/ۙ֫;

    invoke-virtual {v1}, Ll/ۙ֫;->ᩳ()V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onSkipToQueueItem(J)V
    .locals 0

    .line 1639
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object p1

    if-nez p1, :cond_0

    return-void

    .line 1643
    :cond_0
    invoke-static {p1}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 p2, 0x0

    .line 1874
    invoke-interface {p1, p2}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method

.method public final onStop()V
    .locals 2

    .line 1705
    invoke-direct {p0}, Ll/᩶֫;->֫()Ll/۫֫;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 1709
    :cond_0
    invoke-static {v0}, Ll/᩶֫;->֫(Ll/۫֫;)V

    const/4 v1, 0x0

    .line 1874
    invoke-interface {v0, v1}, Ll/ۗ֫;->֫(Ll/᩸ۘ֫;)V

    return-void
.end method
