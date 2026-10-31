.class public Ll/ۡܶۢ;
.super Landroid/app/Service;
.source "EAJ2"


# static fields
.field public static final ۫:Landroid/app/NotificationManager;


# instance fields
.field public ۗ:I

.field public final ۙ:Ll/۠ۚۢ;

.field public final ۬:Ll/ۛۡᩴ;

.field public ᩶:I

.field public ᩸:J

.field public ᩹:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "notification"

    .line 209
    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    .line 25
    check-cast v0, Landroid/app/NotificationManager;

    sput-object v0, Ll/ۡܶۢ;->۫:Landroid/app/NotificationManager;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 24
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 33
    new-instance v0, Ll/ۛۡᩴ;

    invoke-direct {v0}, Ll/ۛۡᩴ;-><init>()V

    iput-object v0, p0, Ll/ۡܶۢ;->۬:Ll/ۛۡᩴ;

    .line 34
    new-instance v0, Ll/۠ۚۢ;

    const/4 v1, 0x4

    invoke-direct {v0, v1, p0}, Ll/۠ۚۢ;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Ll/ۡܶۢ;->ۙ:Ll/۠ۚۢ;

    const/4 v0, -0x1

    .line 35
    iput v0, p0, Ll/ۡܶۢ;->ۗ:I

    .line 36
    iput v0, p0, Ll/ۡܶۢ;->᩶:I

    return-void
.end method

.method private ֫()V
    .locals 2

    const/4 v0, -0x1

    .line 116
    iput v0, p0, Ll/ۡܶۢ;->᩶:I

    .line 117
    iget-boolean v0, p0, Ll/ۡܶۢ;->᩹:Z

    if-eqz v0, :cond_0

    .line 118
    invoke-static {}, Ll/ۙ᩸᩷;->ۢ()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Ll/ۡܶۢ;->ۙ:Ll/۠ۚۢ;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    .line 119
    iput-boolean v0, p0, Ll/ۡܶۢ;->᩹:Z

    :cond_0
    return-void
.end method

.method public static synthetic ֫(Ll/ۡܶۢ;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/ۡܶۢ;->ۧ()V

    return-void
.end method

.method private ۧ()V
    .locals 8

    const/4 v0, 0x0

    .line 96
    iput-boolean v0, p0, Ll/ۡܶۢ;->᩹:Z

    .line 97
    iget v1, p0, Ll/ۡܶۢ;->᩶:I

    const/4 v2, -0x1

    .line 98
    iput v2, p0, Ll/ۡܶۢ;->᩶:I

    if-lez v1, :cond_2

    .line 99
    iget v3, p0, Ll/ۡܶۢ;->ۗ:I

    if-ne v1, v3, :cond_0

    goto :goto_1

    .line 52
    :cond_0
    new-instance v3, Landroid/content/Intent;

    const-class v4, Ll/ۢܶۢ;

    invoke-direct {v3, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v4, 0x4000000

    .line 53
    invoke-static {p0, v0, v3, v4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v3

    .line 54
    new-instance v4, Ll/᩷᩶;

    const-string v5, "MTaskService"

    invoke-direct {v4, p0, v5}, Ll/᩷᩶;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v4}, Ll/᩷᩶;->ܳ()V

    const v5, 0x7f120090

    .line 56
    invoke-virtual {p0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩷᩶;->֫(Ljava/lang/String;)V

    .line 57
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x1

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v6, v7, v0

    const v6, 0x7f110012

    invoke-virtual {v5, v6, v1, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ll/᩷᩶;->֫(Ljava/lang/CharSequence;)V

    .line 58
    invoke-virtual {v4, v3}, Ll/᩷᩶;->֫(Landroid/app/PendingIntent;)V

    .line 59
    invoke-virtual {v4}, Ll/᩷᩶;->ܽ()V

    .line 60
    invoke-virtual {v4, v0}, Ll/᩷᩶;->֫(Z)V

    .line 61
    invoke-virtual {v4}, Ll/᩷᩶;->ܿ()V

    .line 62
    invoke-virtual {v4}, Ll/᩷᩶;->֫()Landroid/app/Notification;

    move-result-object v0

    .line 103
    iget v3, p0, Ll/ۡܶۢ;->ۗ:I

    const/16 v4, 0x3ea

    if-ne v3, v2, :cond_1

    .line 104
    invoke-virtual {p0, v4, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    goto :goto_0

    .line 106
    :cond_1
    sget-object v2, Ll/ۡܶۢ;->۫:Landroid/app/NotificationManager;

    invoke-virtual {v2, v4, v0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 108
    :goto_0
    iput v1, p0, Ll/ۡܶۢ;->ۗ:I

    .line 109
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۡܶۢ;->᩸:J

    :cond_2
    :goto_1
    return-void
.end method

.method private ܽ()V
    .locals 5

    .line 69
    iget-object v0, p0, Ll/ۡܶۢ;->۬:Ll/ۛۡᩴ;

    invoke-virtual {v0}, Ll/ۛۡᩴ;->size()I

    move-result v0

    .line 70
    iget v1, p0, Ll/ۡܶۢ;->ۗ:I

    if-ne v0, v1, :cond_0

    .line 71
    invoke-direct {p0}, Ll/ۡܶۢ;->֫()V

    return-void

    .line 74
    :cond_0
    iput v0, p0, Ll/ۡܶۢ;->᩶:I

    const/4 v0, -0x1

    if-ne v1, v0, :cond_1

    .line 76
    invoke-direct {p0}, Ll/ۡܶۢ;->ۧ()V

    return-void

    .line 79
    :cond_1
    iget-boolean v0, p0, Ll/ۡܶۢ;->᩹:Z

    if-eqz v0, :cond_2

    return-void

    .line 83
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۡܶۢ;->᩸:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x3e8

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    cmp-long v4, v2, v0

    if-gtz v4, :cond_3

    .line 85
    invoke-direct {p0}, Ll/ۡܶۢ;->ۧ()V

    return-void

    :cond_3
    const/4 v0, 0x1

    .line 87
    iput-boolean v0, p0, Ll/ۡܶۢ;->᩹:Z

    .line 88
    iget-object v0, p0, Ll/ۡܶۢ;->ۙ:Ll/۠ۚۢ;

    invoke-static {v0, v2, v3}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;J)V

    return-void
.end method


# virtual methods
.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public final onCreate()V
    .locals 5

    .line 42
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_0

    .line 44
    new-instance v0, Landroid/app/NotificationChannel;

    const-string v1, "MTaskService"

    const-string v2, "Task Running Notification"

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 45
    new-instance v1, Landroid/app/NotificationChannel;

    const-string v2, "MTaskService3"

    const-string v3, "Task Error Notification"

    const/4 v4, 0x4

    invoke-direct {v1, v2, v3, v4}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    const/4 v2, 0x2

    new-array v2, v2, [Landroid/app/NotificationChannel;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    .line 46
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Ll/ۡܶۢ;->۫:Landroid/app/NotificationManager;

    invoke-virtual {v1, v0}, Landroid/app/NotificationManager;->createNotificationChannels(Ljava/util/List;)V

    .line 48
    :cond_0
    invoke-static {}, Ll/ܶ۠ۢ;->ܺ()V

    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 150
    invoke-direct {p0}, Ll/ۡܶۢ;->֫()V

    .line 151
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    const/4 v0, 0x1

    .line 152
    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    return-void
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 1

    .line 125
    iget-object p2, p0, Ll/ۡܶۢ;->۬:Ll/ۛۡᩴ;

    invoke-virtual {p2, p3}, Ll/ۛۡᩴ;->add(I)Z

    .line 126
    invoke-direct {p0}, Ll/ۡܶۢ;->ܽ()V

    :try_start_0
    const-string p2, "TaskClass"

    .line 129
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getSerializableExtra(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object p2

    check-cast p2, Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ۘ۠ۢ;

    .line 130
    invoke-virtual {p2, p1}, Ll/ۘ۠ۢ;->֫(Landroid/content/Intent;)V

    .line 131
    sget p1, Ll/ܶ۠ۢ;->֫:I

    .line 160
    sget-object p1, Ll/֫ۨۡ;->ۧ:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ll/۠۠ۢ;

    invoke-direct {v0, p0, p2, p3}, Ll/۠۠ۢ;-><init>(Ll/ۡܶۢ;Ll/ۘ۠ۢ;I)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x2

    return p1

    :catch_0
    move-exception p1

    .line 134
    new-instance p2, Ljava/lang/RuntimeException;

    invoke-direct {p2, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final ֫(I)V
    .locals 1

    .line 139
    iget-object v0, p0, Ll/ۡܶۢ;->۬:Ll/ۛۡᩴ;

    invoke-virtual {v0, p1}, Ll/ۛۡᩴ;->remove(I)Z

    .line 140
    invoke-virtual {v0}, Ll/ۛۡᩴ;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 141
    invoke-direct {p0}, Ll/ۡܶۢ;->֫()V

    .line 142
    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void

    .line 144
    :cond_0
    invoke-direct {p0}, Ll/ۡܶۢ;->ܽ()V

    return-void
.end method
