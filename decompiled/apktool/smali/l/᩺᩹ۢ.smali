.class public Ll/᩺᩹ۢ;
.super Landroid/app/Service;
.source "J1RW"


# instance fields
.field public ۗ:Landroid/net/wifi/WifiManager$WifiLock;

.field public ۙ:Landroid/os/PowerManager$WakeLock;

.field public ᩶:I

.field public final ᩸:Ll/ۨ᩹ۢ;

.field public final ᩹:Landroid/content/BroadcastReceiver;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 37
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 42
    new-instance v0, Ll/ۨ᩹ۢ;

    invoke-direct {v0, p0}, Ll/ۨ᩹ۢ;-><init>(Ll/᩺᩹ۢ;)V

    iput-object v0, p0, Ll/᩺᩹ۢ;->᩸:Ll/ۨ᩹ۢ;

    .line 48
    new-instance v0, Ll/ۛ᩹ۢ;

    invoke-direct {v0, p0}, Ll/ۛ᩹ۢ;-><init>(Ll/᩺᩹ۢ;)V

    iput-object v0, p0, Ll/᩺᩹ۢ;->᩹:Landroid/content/BroadcastReceiver;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺᩹ۢ;)Ll/ۨ᩹ۢ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺᩹ۢ;->᩸:Ll/ۨ᩹ۢ;

    return-object p0
.end method

.method public static ֫()V
    .locals 3

    .line 101
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    const-string v2, "bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ll/ۖۖ֫;->ۧ(Landroid/content/Intent;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺᩹ۢ;I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/᩺᩹ۢ;->᩶:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺᩹ۢ;Landroid/net/wifi/WifiManager$WifiLock;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺᩹ۢ;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩺᩹ۢ;Landroid/os/PowerManager$WakeLock;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩺᩹ۢ;->ۙ:Landroid/os/PowerManager$WakeLock;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/᩺᩹ۢ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/᩺᩹ۢ;->᩶:I

    return p0
.end method

.method private ۧ()V
    .locals 8

    .line 109
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/۟᩸ۢ;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v1, 0x10000000

    .line 110
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object v0

    .line 111
    new-instance v1, Ll/᩷᩶;

    const-string v2, "MTerm"

    invoke-direct {v1, p0, v2}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    sget-object v2, Ll/᩶ۖܳ;->ܶ֫:Ll/᩶ۖܳ;

    .line 252
    iget-object v2, v2, Ll/᩶ۖܳ;->ۧ:Ll/ۨܺ᩷;

    .line 112
    invoke-virtual {v2}, Ll/ۨܺ᩷;->֫()Landroid/graphics/Bitmap;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷᩶;->֫(Landroid/graphics/Bitmap;)V

    .line 113
    invoke-virtual {v1}, Ll/᩷᩶;->ܳ()V

    const v2, 0x7f120a4d

    .line 114
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 135
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-object v3, p0, Ll/᩺᩹ۢ;->᩸:Ll/ۨ᩹ۢ;

    invoke-static {v3}, Ll/ۨ᩹ۢ;->֫(Ll/ۨ᩹ۢ;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    invoke-static {v3}, Ll/ۨ᩹ۢ;->֫(Ll/ۨ᩹ۢ;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v5, v6, v7

    const v5, 0x7f110013

    invoke-virtual {v2, v5, v4, v6}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    .line 115
    invoke-virtual {v1, v2}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    const/high16 v2, 0x4000000

    .line 116
    invoke-static {p0, v7, v0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 117
    invoke-virtual {v1}, Ll/᩷᩶;->ܽ()V

    .line 118
    invoke-virtual {v1, v7}, Ll/᩷᩶;->֫(Z)V

    .line 120
    new-instance v0, Landroid/content/Intent;

    const-class v4, Ll/᩺᩹ۢ;

    invoke-direct {v0, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v5, "bin.mt.term.TerminalService.ACTION_EXIT"

    invoke-virtual {v0, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const v5, 0x7f120316

    .line 121
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {p0, v7, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    const v6, 0x108001d

    invoke-virtual {v1, v6, v5, v0}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 311
    iget-object v0, v3, Ll/ۨ᩹ۢ;->᩷:Ll/᩺᩹ۢ;

    invoke-static {v0}, Ll/᩺᩹ۢ;->ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;

    move-result-object v3

    const v5, 0x108002f

    if-nez v3, :cond_1

    invoke-static {v0}, Ll/᩺᩹ۢ;->ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 127
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const v3, 0x7f120b77

    .line 128
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v7, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v5, v3, v0}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    goto :goto_1

    .line 124
    :cond_1
    :goto_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const v3, 0x7f120b78

    .line 125
    invoke-virtual {p0, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0, v7, v0, v2}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v1, v5, v3, v0}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 131
    :goto_1
    invoke-virtual {v1}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x3eb

    .line 105
    invoke-virtual {p0, v1, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/᩺᩹ۢ;)Landroid/os/PowerManager$WakeLock;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺᩹ۢ;->ۙ:Landroid/os/PowerManager$WakeLock;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/᩺᩹ۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/᩺᩹ۢ;->ۧ()V

    return-void
.end method

.method public static bridge synthetic ᩳ(Ll/᩺᩹ۢ;)Landroid/net/wifi/WifiManager$WifiLock;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩺᩹ۢ;->ۗ:Landroid/net/wifi/WifiManager$WifiLock;

    return-object p0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 141
    invoke-direct {p0}, Ll/᩺᩹ۢ;->ۧ()V

    .line 142
    iget-object p1, p0, Ll/᩺᩹ۢ;->᩸:Ll/ۨ᩹ۢ;

    return-object p1
.end method

.method public final onCreate()V
    .locals 5

    .line 57
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 59
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const-string v0, "notification"

    .line 60
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 61
    new-instance v1, Landroid/app/NotificationChannel;

    const v1, 0x7f120a4d

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "MTerm"

    const/4 v4, 0x3

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 62
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    .line 65
    :cond_0
    invoke-direct {p0}, Ll/᩺᩹ۢ;->ۧ()V

    .line 66
    invoke-static {p0}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v0

    new-instance v1, Landroid/content/IntentFilter;

    const-string v2, "bin.mt.term.TerminalService.ACTION_CLOSE_ALL_SESSIONS"

    invoke-direct {v1, v2}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩺᩹ۢ;->᩹:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v2, v1}, Ll/ۖۖ֫;->֫(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    .line 93
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 94
    iget-object v0, p0, Ll/᩺᩹ۢ;->᩸:Ll/ۨ᩹ۢ;

    invoke-virtual {v0}, Ll/ۨ᩹ۢ;->֫()V

    const/4 v1, 0x0

    .line 95
    invoke-virtual {v0, v1}, Ll/ۨ᩹ۢ;->ۧ(Z)V

    const/4 v0, 0x1

    .line 96
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 97
    invoke-static {p0}, Ll/ۖۖ֫;->֫(Landroid/content/ContextWrapper;)Ll/ۖۖ֫;

    move-result-object v0

    iget-object v1, p0, Ll/᩺᩹ۢ;->᩹:Landroid/content/BroadcastReceiver;

    invoke-virtual {v0, v1}, Ll/ۖۖ֫;->֫(Landroid/content/BroadcastReceiver;)V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    .line 71
    invoke-direct {p0}, Ll/᩺᩹ۢ;->ۧ()V

    .line 72
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""

    .line 75
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    const/4 p3, 0x2

    const/4 v0, 0x0

    const/4 v1, -0x1

    sparse-switch p2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string p2, "bin.mt.term.TerminalService.ACTION_RELEASE_LOCK"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_1
    const-string p2, "bin.mt.term.TerminalService.ACTION_EXIT"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_2
    const-string p2, "bin.mt.term.TerminalService.ACTION_ACQUIRE_LOCK"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    iget-object p1, p0, Ll/᩺᩹ۢ;->᩸:Ll/ۨ᩹ۢ;

    packed-switch v1, :pswitch_data_0

    goto :goto_1

    .line 84
    :pswitch_0
    invoke-virtual {p1, v0}, Ll/ۨ᩹ۢ;->ۧ(Z)V

    goto :goto_1

    .line 77
    :pswitch_1
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    goto :goto_1

    .line 80
    :pswitch_2
    invoke-virtual {p1, v0}, Ll/ۨ᩹ۢ;->֫(Z)V

    :goto_1
    return p3

    :sswitch_data_0
    .sparse-switch
        -0x7ecad4fa -> :sswitch_2
        -0x76971cf0 -> :sswitch_1
        0x19f13a75 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
