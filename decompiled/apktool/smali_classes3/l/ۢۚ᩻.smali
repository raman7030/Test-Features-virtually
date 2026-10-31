.class public Ll/ۢۚ᩻;
.super Landroid/app/Service;
.source "A9T8"


# static fields
.field public static final ۙ:Landroid/app/NotificationManager;

.field public static final synthetic ᩶:I


# instance fields
.field public ᩸:Ll/ܽۚ᩻;

.field public ᩹:Landroid/app/PendingIntent;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "notification"

    .line 33
    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    sput-object v0, Ll/ۢۚ᩻;->ۙ:Landroid/app/NotificationManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 32
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    return-void
.end method

.method private ֫()Landroid/app/Notification;
    .locals 5

    .line 53
    new-instance v0, Landroid/content/Intent;

    const-class v1, Ll/ۢۚ᩻;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "bin.mt.plus.NetworkStreamingService.ACTION_STOP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 54
    new-instance v1, Ll/᩷᩶;

    const-string v2, "MT_HTTP_SERVER"

    invoke-direct {v1, p0, v2}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v1}, Ll/᩷᩶;->ܳ()V

    const v2, 0x7f1206cb

    .line 56
    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 57
    invoke-virtual {v1}, Ll/᩷᩶;->ܽ()V

    const v2, 0x7f1209e1

    .line 58
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/high16 v4, 0x4000000

    invoke-static {p0, v3, v0, v4}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    const v3, 0x108001d

    invoke-virtual {v1, v3, v2, v0}, Ll/᩷᩶;->֫(ILjava/lang/String;Landroid/app/PendingIntent;)V

    .line 59
    iget-object v0, p0, Ll/ۢۚ᩻;->᩹:Landroid/app/PendingIntent;

    if-eqz v0, :cond_0

    const v0, 0x7f1206cc

    .line 60
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    .line 61
    iget-object v0, p0, Ll/ۢۚ᩻;->᩹:Landroid/app/PendingIntent;

    invoke-virtual {v1, v0}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 63
    :cond_0
    invoke-virtual {v1}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ll/ۢۚ᩻;Landroid/content/Intent;)V
    .locals 11

    :try_start_0
    const-string v0, "componentName"

    .line 88
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    const-string v1, "statelessVisitor"

    .line 89
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v1

    invoke-static {v1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "path"

    .line 90
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "mime"

    .line 91
    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "time"

    const-wide/16 v4, 0x0

    .line 92
    invoke-virtual {p1, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v7

    const-string v3, "length"

    .line 93
    invoke-virtual {p1, v3, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v9

    const/4 p1, 0x0

    .line 63
    invoke-static {v1, p1}, Ll/ۨܺܳ;->֫([BZ)Ll/ܰܺܳ;

    move-result-object v3

    .line 94
    move-object v4, v3

    check-cast v4, Ll/ۗۢ᩻;

    .line 95
    invoke-static {}, Ll/ܳۤۡ;->֫()Ljava/security/MessageDigest;

    move-result-object v3

    .line 96
    invoke-virtual {v3, v1}, Ljava/security/MessageDigest;->update([B)V

    .line 97
    invoke-static {v3, v6}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 98
    invoke-static {v3, v2}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 99
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 100
    invoke-static {v9, v10}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Ll/ܳۤۡ;->֫(Ljava/security/MessageDigest;Ljava/lang/String;)V

    .line 101
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    const/16 v3, 0x10

    invoke-virtual {v1, p1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    .line 102
    new-instance v1, Ll/۟֡᩻;

    move-object v3, v1

    move-object v7, v2

    move-wide v8, v9

    invoke-direct/range {v3 .. v9}, Ll/۟֡᩻;-><init>(Ll/ۗۢ᩻;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 103
    iget-object v3, p0, Ll/ۢۚ᩻;->᩸:Ll/ܽۚ᩻;

    invoke-virtual {v3, v1}, Ll/ܽۚ᩻;->֫(Ll/۟֡᩻;)Landroid/net/Uri;

    move-result-object v1

    .line 104
    new-instance v3, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 105
    invoke-virtual {v3, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 106
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    const/high16 v0, 0x10000000

    .line 107
    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 108
    invoke-virtual {p0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    const/high16 v0, 0xc000000

    .line 109
    invoke-static {p0, p1, v3, v0}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object p1

    iput-object p1, p0, Ll/ۢۚ᩻;->᩹:Landroid/app/PendingIntent;

    .line 110
    sget-object p1, Ll/ۢۚ᩻;->ۙ:Landroid/app/NotificationManager;

    invoke-direct {p0}, Ll/ۢۚ᩻;->֫()Landroid/app/Notification;

    move-result-object p0

    const/16 v0, 0x3ed

    invoke-virtual {p1, v0, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    .line 35
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 546
    invoke-virtual {p1, p0, v0}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 4

    .line 42
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 44
    new-instance v0, Landroid/app/NotificationChannel;

    const v0, 0x7f1206cb

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/app/NotificationChannel;

    const-string v2, "MT_HTTP_SERVER"

    const/4 v3, 0x3

    invoke-direct {v1, v2, v0, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 45
    sget-object v0, Ll/ۢۚ᩻;->ۙ:Landroid/app/NotificationManager;

    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V

    :cond_0
    const/16 v0, 0x3ed

    .line 47
    invoke-direct {p0}, Ll/ۢۚ᩻;->֫()Landroid/app/Notification;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 48
    new-instance v0, Ll/ܽۚ᩻;

    invoke-direct {v0, p0}, Ll/ܽۚ᩻;-><init>(Ll/ۢۚ᩻;)V

    iput-object v0, p0, Ll/ۢۚ᩻;->᩸:Ll/ܽۚ᩻;

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 128
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x1

    .line 129
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    .line 130
    iget-object v0, p0, Ll/ۢۚ᩻;->᩸:Ll/ܽۚ᩻;

    invoke-virtual {v0}, Ll/ܽۚ᩻;->ۧ()V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 2

    const/16 p2, 0x3ed

    .line 83
    invoke-direct {p0}, Ll/ۢۚ᩻;->֫()Landroid/app/Notification;

    move-result-object p3

    invoke-virtual {p0, p2, p3}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 84
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p2

    const-string p3, "bin.mt.plus.NetworkStreamingService.ACTION_PLAY"

    .line 85
    invoke-virtual {p3, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 86
    new-instance p2, Ll/᩷ۚ᩻;

    const/4 p3, 0x0

    invoke-direct {p2, p3, p0, p1}, Ll/᩷ۚ᩻;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 115
    iget-object p1, p0, Ll/ۢۚ᩻;->᩸:Ll/ܽۚ᩻;

    invoke-virtual {p1}, Ll/ܽۚ᩻;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 116
    invoke-virtual {p2}, Ll/᩷ۚ᩻;->run()V

    goto :goto_0

    .line 117
    :cond_0
    iget-object p1, p0, Ll/ۢۚ᩻;->᩸:Ll/ܽۚ᩻;

    invoke-virtual {p1}, Ljava/lang/Thread;->isAlive()Z

    move-result p1

    if-eqz p1, :cond_2

    const-wide/16 v0, 0x64

    .line 118
    invoke-static {p2, v0, v1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    goto :goto_0

    :cond_1
    const-string p1, "bin.mt.plus.NetworkStreamingService.ACTION_STOP"

    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 121
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    :cond_2
    :goto_0
    const/4 p1, 0x2

    return p1
.end method
