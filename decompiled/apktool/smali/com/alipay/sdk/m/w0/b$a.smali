.class public Lcom/alipay/sdk/m/w0/b$a;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lcom/alipay/sdk/m/w0/b;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/w0/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public declared-synchronized onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    iget-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    invoke-static {p2}, Lcom/alipay/sdk/m/v0/a$a;->a(Landroid/os/IBinder;)Lcom/alipay/sdk/m/v0/a;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/alipay/sdk/m/w0/b;->a(Lcom/alipay/sdk/m/w0/b;Lcom/alipay/sdk/m/v0/a;)Lcom/alipay/sdk/m/v0/a;

    .line 2
    iget-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    invoke-static {p1}, Lcom/alipay/sdk/m/w0/b;->a(Lcom/alipay/sdk/m/w0/b;)Lcom/alipay/sdk/m/w0/b$b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    invoke-static {p1}, Lcom/alipay/sdk/m/w0/b;->a(Lcom/alipay/sdk/m/w0/b;)Lcom/alipay/sdk/m/w0/b$b;

    move-result-object p1

    iget-object p2, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    const-string v1, "Deviceid Service Connected"

    invoke-interface {p1, v1, p2}, Lcom/alipay/sdk/m/w0/b$b;->a(Ljava/lang/Object;Lcom/alipay/sdk/m/w0/b;)V

    .line 5
    :cond_0
    iget-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    const-string p2, "Service onServiceConnected"

    invoke-static {p1, p2}, Lcom/alipay/sdk/m/w0/b;->a(Lcom/alipay/sdk/m/w0/b;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/alipay/sdk/m/w0/b;->a(Lcom/alipay/sdk/m/w0/b;Lcom/alipay/sdk/m/v0/a;)Lcom/alipay/sdk/m/v0/a;

    .line 2
    iget-object p1, p0, Lcom/alipay/sdk/m/w0/b$a;->a:Lcom/alipay/sdk/m/w0/b;

    const-string v0, "Service onServiceDisconnected"

    invoke-static {p1, v0}, Lcom/alipay/sdk/m/w0/b;->a(Lcom/alipay/sdk/m/w0/b;Ljava/lang/String;)V

    return-void
.end method
