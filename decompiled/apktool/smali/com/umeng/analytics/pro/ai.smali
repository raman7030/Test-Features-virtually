.class public Lcom/umeng/analytics/pro/ai;
.super Ljava/lang/Object;
.source "FBLP"

# interfaces
.implements Lcom/umeng/analytics/pro/z;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    .line 22
    new-instance v0, Lcom/umeng/analytics/pro/ai$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/ai$a;-><init>(Lcom/umeng/analytics/pro/ai$1;)V

    .line 23
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    const-string v3, "com.samsung.android.deviceidservice"

    const-string v4, "com.samsung.android.deviceidservice.DeviceIdService"

    .line 24
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 v3, 0x1

    .line 25
    invoke-virtual {p1, v2, v0, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 27
    :try_start_0
    invoke-virtual {v0}, Lcom/umeng/analytics/pro/ai$a;->a()Landroid/os/IBinder;

    move-result-object v2

    invoke-static {v2}, Lcom/umeng/analytics/pro/b$a;->a(Landroid/os/IBinder;)Lcom/umeng/analytics/pro/b;

    move-result-object v2

    .line 28
    invoke-interface {v2}, Lcom/umeng/analytics/pro/b;->a()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    return-object v1

    :catchall_0
    move-exception v1

    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    throw v1

    :catch_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    :cond_0
    return-object v1
.end method
