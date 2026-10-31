.class public Lcom/umeng/analytics/pro/ab;
.super Ljava/lang/Object;
.source "UAPE"

# interfaces
.implements Lcom/umeng/analytics/pro/z;


# static fields
.field public static final a:Ljava/lang/String; = "Coolpad"

.field public static final b:Ljava/lang/String; = "com.coolpad.deviceidsupport"

.field public static final c:Ljava/lang/String; = "com.coolpad.deviceidsupport.DeviceIdService"

.field public static d:Lcom/umeng/analytics/pro/a;


# instance fields
.field public e:Ljava/lang/String;

.field public f:Ljava/util/concurrent/CountDownLatch;

.field public g:Landroid/content/Context;

.field public final h:Landroid/content/ServiceConnection;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    .line 26
    iput-object v0, p0, Lcom/umeng/analytics/pro/ab;->e:Ljava/lang/String;

    .line 75
    new-instance v0, Lcom/umeng/analytics/pro/ab$1;

    invoke-direct {v0, p0}, Lcom/umeng/analytics/pro/ab$1;-><init>(Lcom/umeng/analytics/pro/ab;)V

    iput-object v0, p0, Lcom/umeng/analytics/pro/ab;->h:Landroid/content/ServiceConnection;

    return-void
.end method

.method public static synthetic a(Lcom/umeng/analytics/pro/ab;)Landroid/content/Context;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/umeng/analytics/pro/ab;->g:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic a()Lcom/umeng/analytics/pro/a;
    .locals 1

    .line 19
    sget-object v0, Lcom/umeng/analytics/pro/ab;->d:Lcom/umeng/analytics/pro/a;

    return-object v0
.end method

.method public static synthetic a(Lcom/umeng/analytics/pro/a;)Lcom/umeng/analytics/pro/a;
    .locals 0

    .line 19
    sput-object p0, Lcom/umeng/analytics/pro/ab;->d:Lcom/umeng/analytics/pro/a;

    return-object p0
.end method

.method public static synthetic a(Lcom/umeng/analytics/pro/ab;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 19
    iput-object p1, p0, Lcom/umeng/analytics/pro/ab;->e:Ljava/lang/String;

    return-object p1
.end method

.method public static synthetic b(Lcom/umeng/analytics/pro/ab;)Ljava/lang/String;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/umeng/analytics/pro/ab;->e:Ljava/lang/String;

    return-object p0
.end method

.method private b(Landroid/content/Context;)V
    .locals 4

    .line 53
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 54
    new-instance v1, Landroid/content/ComponentName;

    const-string v2, "com.coolpad.deviceidsupport"

    const-string v3, "com.coolpad.deviceidsupport.DeviceIdService"

    invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 56
    iget-object v1, p0, Lcom/umeng/analytics/pro/ab;->h:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 62
    iget-object p1, p0, Lcom/umeng/analytics/pro/ab;->f:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public static synthetic c(Lcom/umeng/analytics/pro/ab;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    .line 19
    iget-object p0, p0, Lcom/umeng/analytics/pro/ab;->f:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method private c(Landroid/content/Context;)V
    .locals 1

    .line 69
    :try_start_0
    iget-object v0, p0, Lcom/umeng/analytics/pro/ab;->h:Landroid/content/ServiceConnection;

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    .line 35
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/umeng/analytics/pro/ab;->g:Landroid/content/Context;

    .line 36
    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v1, p0, Lcom/umeng/analytics/pro/ab;->f:Ljava/util/concurrent/CountDownLatch;

    .line 38
    :try_start_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ab;->b(Landroid/content/Context;)V

    .line 39
    iget-object v1, p0, Lcom/umeng/analytics/pro/ab;->f:Ljava/util/concurrent/CountDownLatch;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x1f4

    invoke-virtual {v1, v3, v4, v2}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z

    .line 42
    iget-object v0, p0, Lcom/umeng/analytics/pro/ab;->e:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ab;->c(Landroid/content/Context;)V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v1

    .line 44
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ab;->c(Landroid/content/Context;)V

    return-object v0

    :goto_0
    invoke-direct {p0, p1}, Lcom/umeng/analytics/pro/ab;->c(Landroid/content/Context;)V

    throw v0
.end method
