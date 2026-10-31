.class public Ll/֫ۚۢ;
.super Landroid/app/Service;
.source "V7AT"


# static fields
.field public static ۛ:Ll/᩺֡ۢ;

.field public static final synthetic ۤ:I


# instance fields
.field public ۗ:Ljava/lang/String;

.field public ۙ:Ll/֡ۖۢ;

.field public ۫:Landroid/net/wifi/WifiManager$WifiLock;

.field public ۬:Landroid/os/PowerManager$WakeLock;

.field public ᩶:Ll/᩺֡ۢ;

.field public ᩸:Z

.field public ᩹:Ll/᩵֡ۢ;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private ֫()V
    .locals 2

    const/4 v0, 0x0

    .line 235
    iput-object v0, p0, Ll/֫ۚۢ;->ۗ:Ljava/lang/String;

    .line 236
    iget-object v1, p0, Ll/֫ۚۢ;->᩹:Ll/᩵֡ۢ;

    if-eqz v1, :cond_0

    .line 237
    invoke-virtual {v1}, Ll/᩵֡ۢ;->ۧ()V

    .line 238
    iput-object v0, p0, Ll/֫ۚۢ;->᩹:Ll/᩵֡ۢ;

    .line 240
    :cond_0
    iput-object v0, p0, Ll/֫ۚۢ;->᩶:Ll/᩺֡ۢ;

    .line 335
    sget-object v1, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    .line 336
    sput-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v1, :cond_1

    .line 338
    invoke-virtual {v1}, Ll/᩺֡ۢ;->ۘ()V

    .line 339
    invoke-virtual {v1}, Ll/ۙܳܳ;->ᩳ()V

    .line 242
    :cond_1
    iget-object v1, p0, Ll/֫ۚۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    if-eqz v1, :cond_3

    .line 243
    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 244
    iget-object v1, p0, Ll/֫ۚۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v1}, Landroid/net/wifi/WifiManager$WifiLock;->release()V

    .line 246
    :cond_2
    iput-object v0, p0, Ll/֫ۚۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    .line 248
    :cond_3
    iget-object v1, p0, Ll/֫ۚۢ;->۬:Landroid/os/PowerManager$WakeLock;

    if-eqz v1, :cond_5

    .line 249
    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->isHeld()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 250
    iget-object v1, p0, Ll/֫ۚۢ;->۬:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v1}, Landroid/os/PowerManager$WakeLock;->release()V

    .line 252
    :cond_4
    iput-object v0, p0, Ll/֫ۚۢ;->۬:Landroid/os/PowerManager$WakeLock;

    :cond_5
    return-void
.end method

.method public static synthetic ֫(Ll/֫ۚۢ;)V
    .locals 2

    const-string v0, "notification"

    .line 142
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    const/16 v1, 0x3ef

    .line 143
    invoke-direct {p0}, Ll/֫ۚۢ;->ۧ()Landroid/app/Notification;

    move-result-object p0

    invoke-virtual {v0, v1, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֫ۚۢ;Ll/᩺֡ۢ;Ljava/lang/String;J)V
    .locals 1

    .line 274
    iget-boolean v0, p0, Ll/֫ۚۢ;->᩸:Z

    if-nez v0, :cond_1

    sget-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-ne p1, v0, :cond_1

    invoke-virtual {p1}, Ll/ۙܳܳ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 277
    :cond_0
    iput-object p2, p0, Ll/֫ۚۢ;->ۗ:Ljava/lang/String;

    const-string p1, "notification"

    .line 278
    invoke-virtual {p0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/app/NotificationManager;

    const/16 p2, 0x3ef

    .line 279
    invoke-direct {p0}, Ll/֫ۚۢ;->ۧ()Landroid/app/Notification;

    move-result-object p0

    invoke-virtual {p1, p2, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 280
    new-instance p0, Landroid/content/Intent;

    const-string p1, "bin.mt.remote.RemoteServerService.ACTION_PAIRING_CODE_CHANGED"

    invoke-direct {p0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string p1, "expiresAt"

    invoke-virtual {p0, p1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    move-result-object p0

    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 2

    .line 104
    sget-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v0, :cond_0

    .line 105
    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 106
    invoke-virtual {v0, p0}, Ll/᩺֡ۢ;->ܽ(Ljava/lang/String;)Z

    move-result p0

    return p0

    .line 108
    :cond_0
    new-instance v0, Ll/᩻ᩴۢ;

    invoke-direct {v0}, Ll/᩻ᩴۢ;-><init>()V

    invoke-virtual {v0, p0}, Ll/᩻ᩴۢ;->֫(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۜ()Z
    .locals 1

    .line 56
    sget-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private ۢ()V
    .locals 3

    .line 312
    iget-object v0, p0, Ll/֫ۚۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    if-nez v0, :cond_0

    .line 313
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "wifi"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    .line 314
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":WebManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v0, v2, v1}, Landroid/net/wifi/WifiManager;->createWifiLock(ILjava/lang/String;)Landroid/net/wifi/WifiManager$WifiLock;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۚۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    const/4 v1, 0x0

    .line 315
    invoke-virtual {v0, v1}, Landroid/net/wifi/WifiManager$WifiLock;->setReferenceCounted(Z)V

    .line 317
    :cond_0
    iget-object v0, p0, Ll/֫ۚۢ;->۫:Landroid/net/wifi/WifiManager$WifiLock;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager$WifiLock;->acquire()V

    return-void
.end method

.method private ۧ()Landroid/app/Notification;
    .locals 9

    .line 151
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ܶ᩶᩷;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "bin.mt.plus.tool.RemoteManageActivity.EXTRA_PROTOCOL"

    const/4 v2, 0x0

    .line 152
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    .line 153
    new-instance v1, Landroid/content/Intent;

    const-class v3, Ll/֫ۚۢ;

    invoke-direct {v1, p0, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v3, "bin.mt.remote.RemoteServerService.ACTION_STOP"

    .line 154
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v1

    .line 155
    invoke-static {}, Ll/֫ۚۢ;->ܽ()Ljava/lang/String;

    move-result-object v3

    .line 157
    iget-object v4, p0, Ll/֫ۚۢ;->ۗ:Ljava/lang/String;

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    .line 289
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x6

    if-eq v6, v7, :cond_0

    goto :goto_0

    .line 292
    :cond_0
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v7, 0x3

    invoke-virtual {v4, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, " "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 0
    invoke-static {v7, v4, v6}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    new-array v6, v5, [Ljava/lang/Object;

    aput-object v4, v6, v2

    const v4, 0x7f12084f

    .line 158
    invoke-virtual {p0, v4, v6}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 160
    new-instance v6, Ll/ۜ᩶;

    .line 2697
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 160
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\n"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 161
    invoke-virtual {v6, v4}, Ll/ۜ᩶;->֫(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const/4 v6, 0x0

    .line 163
    :goto_1
    new-instance v4, Ll/᩷᩶;

    const-string v7, "MT_WEB_MANAGER_SERVER"

    invoke-direct {v4, p0, v7}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 164
    invoke-virtual {v4}, Ll/᩷᩶;->ܳ()V

    const v7, 0x7f120846

    .line 165
    invoke-static {v7}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 166
    invoke-virtual {v4, v3}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    const/high16 v3, 0xc000000

    .line 167
    invoke-static {p0, v5, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    invoke-virtual {v4, v0}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 168
    invoke-virtual {v4}, Ll/᩷᩶;->ܽ()V

    .line 169
    invoke-virtual {v4, v2}, Ll/᩷᩶;->֫(Z)V

    const v0, 0x7f1209e1

    .line 170
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x2

    invoke-static {p0, v2, v1, v3}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    const v2, 0x108001d

    invoke-virtual {v4, v2, v0, v1}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    if-eqz v6, :cond_2

    .line 172
    invoke-virtual {v4, v6}, Ll/᩷᩶;->֫(Ll/ۡ᩶;)V

    .line 174
    :cond_2
    invoke-virtual {v4}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public static ܳ()Ljava/lang/String;
    .locals 2

    .line 64
    sget-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v0, :cond_1

    .line 65
    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ll/᩺֡ۢ;->ܺ()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ܽ()Ljava/lang/String;
    .locals 3

    .line 324
    invoke-static {}, Ll/۬ۘۢ;->֫()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const v0, 0x7f12086b

    .line 326
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v1, "http://"

    const-string v2, ":"

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 328
    invoke-static {}, Ll/ۘۚۢ;->ܽ()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static ܿ()J
    .locals 2

    .line 75
    sget-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v0, :cond_1

    .line 76
    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {v0}, Ll/᩺֡ۢ;->ۖ()J

    move-result-wide v0

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public static ᩳ()Ljava/util/ArrayList;
    .locals 3

    .line 93
    sget-object v0, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v0, :cond_0

    .line 94
    invoke-virtual {v0}, Ll/ۙܳܳ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 95
    invoke-virtual {v0}, Ll/᩺֡ۢ;->ۡ()Ljava/util/ArrayList;

    move-result-object v0

    return-object v0

    .line 97
    :cond_0
    new-instance v0, Ll/᩻ᩴۢ;

    invoke-direct {v0}, Ll/᩻ᩴۢ;-><init>()V

    .line 117
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 118
    invoke-virtual {v0}, Ll/᩻ᩴۢ;->֫()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܳᩴۢ;

    .line 119
    invoke-static {v2}, Ll/᩻ᩴۢ;->֫(Ll/ܳᩴۢ;)Ll/ܽᩴۢ;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 121
    :cond_1
    invoke-static {v1}, Ll/᩻ᩴۢ;->ۧ(Ljava/util/ArrayList;)V

    return-object v1
.end method

.method private ᩷()V
    .locals 3

    .line 300
    iget-object v0, p0, Ll/֫ۚۢ;->۬:Landroid/os/PowerManager$WakeLock;

    if-nez v0, :cond_0

    const-string v0, "power"

    .line 301
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    .line 302
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":WebManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v2, v1}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;

    move-result-object v0

    iput-object v0, p0, Ll/֫ۚۢ;->۬:Landroid/os/PowerManager$WakeLock;

    const/4 v1, 0x0

    .line 303
    invoke-virtual {v0, v1}, Landroid/os/PowerManager$WakeLock;->setReferenceCounted(Z)V

    .line 305
    :cond_0
    iget-object v0, p0, Ll/֫ۚۢ;->۬:Landroid/os/PowerManager$WakeLock;

    invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V

    return-void
.end method

.method public static ᩻()J
    .locals 2

    .line 86
    sget v0, Ll/᩺֡ۢ;->ۤ:I

    .line 357
    invoke-static {}, Ll/᩺ᩴۢ;->ܳ()J

    move-result-wide v0

    return-wide v0
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 5

    .line 133
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    const/4 v0, 0x0

    .line 134
    iput-boolean v0, p0, Ll/֫ۚۢ;->᩸:Z

    .line 135
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    const-string v0, "notification"

    .line 136
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    .line 137
    new-instance v1, Landroid/app/NotificationChannel;

    const v1, 0x7f12084e

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Landroid/app/NotificationChannel;

    const-string v3, "MT_WEB_MANAGER_SERVER"

    const/4 v4, 0x3

    invoke-direct {v2, v3, v1, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 138
    invoke-virtual {v0, v2}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    const/16 v0, 0x3ef

    .line 140
    invoke-direct {p0}, Ll/֫ۚۢ;->ۧ()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 141
    new-instance v0, Ll/֡ۖۢ;

    new-instance v1, Ll/ۗ᩸ۢ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Ll/ۗ᩸ۢ;-><init>(ILjava/lang/Object;)V

    invoke-direct {v0, p0, v1}, Ll/֡ۖۢ;-><init>(Landroid/content/ContextWrapper;Ljava/lang/Runnable;)V

    iput-object v0, p0, Ll/֫ۚۢ;->ۙ:Ll/֡ۖۢ;

    return-void
.end method

.method public final onDestroy()V
    .locals 2

    const/4 v0, 0x1

    .line 261
    iput-boolean v0, p0, Ll/֫ۚۢ;->᩸:Z

    .line 262
    iget-object v1, p0, Ll/֫ۚۢ;->ۙ:Ll/֡ۖۢ;

    invoke-virtual {v1}, Ll/֡ۖۢ;->֫()V

    .line 263
    invoke-direct {p0}, Ll/֫ۚۢ;->֫()V

    .line 264
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 265
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.remote.RemoteServerService.ACTION_STOPPED"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    .line 266
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 7

    const/4 p2, 0x2

    if-eqz p1, :cond_0

    const-string p3, "bin.mt.remote.RemoteServerService.ACTION_STOP"

    .line 182
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 183
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2

    .line 187
    :cond_0
    sget-object v2, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    if-eqz v2, :cond_1

    .line 188
    invoke-virtual {v2}, Ll/ۙܳܳ;->ۧ()Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    const/4 p1, 0x0

    .line 189
    iput-object p1, p0, Ll/֫ۚۢ;->ۗ:Ljava/lang/String;

    :cond_2
    const/16 p1, 0x3ef

    .line 191
    invoke-direct {p0}, Ll/֫ۚۢ;->ۧ()Landroid/app/Notification;

    move-result-object p3

    invoke-virtual {p0, p1, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    const/4 p1, 0x1

    if-eqz v2, :cond_4

    .line 192
    invoke-virtual {v2}, Ll/ۙܳܳ;->ۧ()Z

    move-result p3

    if-eqz p3, :cond_4

    .line 193
    iget-object p2, p0, Ll/֫ۚۢ;->᩶:Ll/᩺֡ۢ;

    if-ne v2, p2, :cond_3

    iget-object p2, p0, Ll/֫ۚۢ;->᩹:Ll/᩵֡ۢ;

    if-eqz p2, :cond_3

    .line 194
    invoke-virtual {p2}, Ll/᩵֡ۢ;->֫()V

    .line 198
    :cond_3
    invoke-virtual {v2}, Ll/᩺֡ۢ;->ܺ()Ljava/lang/String;

    move-result-object v3

    .line 199
    invoke-virtual {v2}, Ll/᩺֡ۢ;->ۖ()J

    move-result-wide v4

    .line 273
    new-instance p2, Ll/۟֡ۢ;

    move-object v0, p2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ll/۟֡ۢ;-><init>(Ll/֫ۚۢ;Ll/᩺֡ۢ;Ljava/lang/String;J)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return p1

    .line 204
    :cond_4
    :try_start_0
    invoke-direct {p0}, Ll/֫ۚۢ;->֫()V

    .line 205
    new-instance p3, Ll/᩵֡ۢ;

    invoke-direct {p3, p0}, Ll/᩵֡ۢ;-><init>(Ll/֫ۚۢ;)V

    .line 206
    new-instance v2, Ll/᩺֡ۢ;

    .line 207
    invoke-static {}, Ll/ۘۚۢ;->ܽ()I

    move-result v0

    new-instance v1, Ll/۟ۢۡ;

    const/4 v3, 0x5

    invoke-direct {v1, v3, p0}, Ll/۟ۢۡ;-><init>(ILjava/lang/Object;)V

    .line 209
    new-instance v3, Ll/ܰ֡ۢ;

    invoke-direct {v3, p3}, Ll/ܰ֡ۢ;-><init>(Ll/᩵֡ۢ;)V

    invoke-direct {v2, v0, v1, v3}, Ll/᩺֡ۢ;-><init>(ILl/۟ۢۡ;Ll/ܰ֡ۢ;)V

    .line 210
    iput-object p3, p0, Ll/֫ۚۢ;->᩹:Ll/᩵֡ۢ;

    .line 211
    iput-object v2, p0, Ll/֫ۚۢ;->᩶:Ll/᩺֡ۢ;

    .line 212
    sput-object v2, Ll/֫ۚۢ;->ۛ:Ll/᩺֡ۢ;

    .line 213
    invoke-virtual {v2}, Ll/ۙܳܳ;->ܽ()V

    .line 216
    invoke-virtual {v2}, Ll/᩺֡ۢ;->ܺ()Ljava/lang/String;

    move-result-object v3

    .line 217
    invoke-virtual {v2}, Ll/᩺֡ۢ;->ۖ()J

    move-result-wide v4

    .line 273
    new-instance v6, Ll/۟֡ۢ;

    move-object v0, v6

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ll/۟֡ۢ;-><init>(Ll/֫ۚۢ;Ll/᩺֡ۢ;Ljava/lang/String;J)V

    invoke-static {v6}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 218
    invoke-direct {p0}, Ll/֫ۚۢ;->᩷()V

    .line 219
    invoke-direct {p0}, Ll/֫ۚۢ;->ۢ()V

    .line 220
    invoke-virtual {p3}, Ll/᩵֡ۢ;->֫()V

    .line 221
    new-instance p3, Landroid/content/Intent;

    const-string v0, "bin.mt.remote.RemoteServerService.ACTION_STARTED"

    invoke-direct {p3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-static {p3}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p3

    goto :goto_0

    :catch_1
    move-exception p3

    .line 393
    :goto_0
    new-instance v0, Landroid/content/Intent;

    const-string v1, "bin.mt.remote.RemoteServerService.ACTION_FAILED_TO_START"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 394
    instance-of v1, p3, Ljava/net/BindException;

    if-eqz v1, :cond_5

    .line 395
    invoke-static {}, Ll/ۘۚۢ;->ܽ()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p3, p1, v1

    const p3, 0x7f120935

    invoke-static {p3, p1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    .line 396
    :cond_5
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    const-string p3, "msg"

    .line 397
    invoke-virtual {v0, p3, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 398
    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Landroid/content/Intent;)V

    .line 225
    invoke-direct {p0}, Ll/֫ۚۢ;->֫()V

    .line 226
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return p2
.end method
