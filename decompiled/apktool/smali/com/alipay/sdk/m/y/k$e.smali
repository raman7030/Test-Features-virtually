.class public Lcom/alipay/sdk/m/y/k$e;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lcom/alipay/sdk/m/y/k;


# direct methods
.method public constructor <init>(Lcom/alipay/sdk/m/y/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/alipay/sdk/m/y/k;Lcom/alipay/sdk/m/y/k$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/alipay/sdk/m/y/k$e;-><init>(Lcom/alipay/sdk/m/y/k;)V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    invoke-static {p1}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;)Lcom/alipay/sdk/m/w/a;

    move-result-object p1

    const-string v0, "biz"

    const-string v1, "srvCon"

    invoke-static {p1, v0, v1}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    invoke-static {p1}, Lcom/alipay/sdk/m/y/k;->c(Lcom/alipay/sdk/m/y/k;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    monitor-enter v0

    .line 3
    :try_start_0
    iget-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    invoke-static {p2}, Lcom/alipay/android/app/IAlixPay$Stub;->asInterface(Landroid/os/IBinder;)Lcom/alipay/android/app/IAlixPay;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;Lcom/alipay/android/app/IAlixPay;)Lcom/alipay/android/app/IAlixPay;

    .line 4
    iget-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    invoke-static {p1}, Lcom/alipay/sdk/m/y/k;->c(Lcom/alipay/sdk/m/y/k;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 5
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    invoke-static {p1}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;)Lcom/alipay/sdk/m/w/a;

    move-result-object p1

    const-string v0, "biz"

    const-string v1, "srvDis"

    invoke-static {p1, v0, v1}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/alipay/sdk/m/y/k$e;->a:Lcom/alipay/sdk/m/y/k;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/alipay/sdk/m/y/k;->a(Lcom/alipay/sdk/m/y/k;Lcom/alipay/android/app/IAlixPay;)Lcom/alipay/android/app/IAlixPay;

    return-void
.end method
