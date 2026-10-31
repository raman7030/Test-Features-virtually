.class public Lcom/alipay/sdk/app/AlipayApi;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ljava/lang/String; = "com.eg.android.AlipayGphone"

.field public static final b:Ljava/lang/String; = "com.eg.android.AlipayGphone.CashierSDKRegister"

.field public static final c:Ljava/lang/String; = "appId"

.field public static d:Landroid/content/ServiceConnection;

.field public static e:Z

.field public static f:Ljava/lang/ref/WeakReference;

.field public static g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static registerApp(Landroid/content/Context;Ljava/lang/String;)V
    .locals 6

    const-string v0, "AlipayApi registerApp bindServiceResult:"

    if-nez p0, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    invoke-static {}, Lcom/alipay/sdk/m/w/b;->c()Lcom/alipay/sdk/m/w/b;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/alipay/sdk/m/w/b;->a(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/alipay/sdk/m/o/b;->c(Lcom/alipay/sdk/m/w/a;)Z

    move-result v1

    xor-int/lit8 v3, v1, 0x1

    .line 3
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "AlipayApi registerApp appId: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " isSupportRegisterApp:"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " registerAppServiceConnectSuccess:"

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-boolean v3, Lcom/alipay/sdk/app/AlipayApi;->e:Z

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "mspl"

    invoke-static {v4, v3}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_1

    goto :goto_0

    .line 9
    :cond_1
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v1

    invoke-virtual {v1, v2}, Lcom/alipay/sdk/m/o/b;->e(Lcom/alipay/sdk/m/w/a;)Z

    move-result v1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "AlipayApi registerApp isFetchConfigWhenRegisterApp: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v1, :cond_2

    .line 12
    invoke-static {p0}, Lcom/alipay/sdk/app/PayTask;->fetchSdkConfig(Landroid/content/Context;)Z

    .line 14
    :cond_2
    sget-boolean v1, Lcom/alipay/sdk/app/AlipayApi;->e:Z

    if-eqz v1, :cond_3

    :goto_0
    return-void

    .line 18
    :cond_3
    new-instance v1, Landroid/content/Intent;

    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    const-string v2, "com.eg.android.AlipayGphone"

    .line 19
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "com.eg.android.AlipayGphone.CashierSDKRegister"

    .line 20
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 22
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    const-string v3, "appId"

    .line 23
    invoke-virtual {v2, v3, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 25
    new-instance p1, Lcom/alipay/sdk/app/AlipayApi$a;

    invoke-direct {p1}, Lcom/alipay/sdk/app/AlipayApi$a;-><init>()V

    sput-object p1, Lcom/alipay/sdk/app/AlipayApi;->d:Landroid/content/ServiceConnection;

    const/4 v2, 0x1

    .line 53
    :try_start_0
    invoke-virtual {p0, v1, p1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result p1

    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v4, p1}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    .line 56
    invoke-static {p1}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 58
    :goto_1
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p1, Lcom/alipay/sdk/app/AlipayApi;->f:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static setAlipayDebugOptions(Lcom/alipay/sdk/app/debug/AlipayDebugOptions;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/alipay/sdk/app/AlipayApi;->g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;

    return-void
.end method
