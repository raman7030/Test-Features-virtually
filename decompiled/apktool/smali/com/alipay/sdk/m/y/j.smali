.class public Lcom/alipay/sdk/m/y/j;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 1
    sget-object v0, Lcom/alipay/sdk/m/y/j$a;->a:Ljava/lang/String;

    if-nez p0, :cond_0

    goto :goto_1

    :cond_0
    const-string v1, "connectivity"

    .line 6
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    .line 7
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 12
    :cond_1
    invoke-virtual {v2}, Landroid/net/NetworkInfo;->getType()I

    move-result v2

    if-nez v2, :cond_2

    .line 15
    sget-object p0, Lcom/alipay/sdk/m/y/j$a;->b:Ljava/lang/String;

    return-object p0

    :cond_2
    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    .line 17
    sget-object v0, Lcom/alipay/sdk/m/y/j$a;->c:Ljava/lang/String;

    :try_start_0
    const-string v2, "phone"

    .line 20
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/TelephonyManager;

    .line 21
    invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v2

    const/4 v4, 0x0

    if-eq v3, v2, :cond_3

    const/4 v2, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    const-string v5, "android.permission.CHANGE_NETWORK_STATE"

    .line 23
    invoke-static {p0, v5}, Ll/֨ۙ;->֫(Landroid/content/Context;Ljava/lang/String;)I

    move-result p0

    if-nez p0, :cond_4

    const/4 v4, 0x1

    .line 25
    :cond_4
    const-class p0, Landroid/net/ConnectivityManager;

    const-string v5, "getMobileDataEnabled"

    const/4 v6, 0x0

    invoke-virtual {p0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    .line 26
    invoke-virtual {p0, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 27
    invoke-virtual {p0, v1, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    if-eqz v2, :cond_5

    if-eqz v4, :cond_5

    .line 29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-eqz p0, :cond_5

    .line 30
    sget-object p0, Lcom/alipay/sdk/m/y/j$a;->d:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 33
    invoke-static {p0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    :cond_5
    :goto_1
    return-object v0
.end method
