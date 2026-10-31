.class public final Lcom/alipay/sdk/m/u0/c$a;
.super Landroid/os/Handler;
.source "N673"


# direct methods
.method public constructor <init>(Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v1, 0xb

    if-ne v0, v1, :cond_0

    .line 2
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "type"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 3
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object p1

    const-string v1, "appid"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 4
    invoke-static {}, Lcom/alipay/sdk/m/u0/c;->a()Lcom/alipay/sdk/m/u0/b;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/alipay/sdk/m/u0/b;->a(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/alipay/sdk/m/u0/c;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 5
    invoke-static {}, Lcom/alipay/sdk/m/u0/c;->b()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    monitor-enter v0

    .line 6
    :try_start_0
    invoke-static {}, Lcom/alipay/sdk/m/u0/c;->b()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->notify()V

    .line 7
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_0
    return-void
.end method
