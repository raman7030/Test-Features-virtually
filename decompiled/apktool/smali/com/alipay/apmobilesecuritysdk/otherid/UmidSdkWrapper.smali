.class public Lcom/alipay/apmobilesecuritysdk/otherid/UmidSdkWrapper;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final UMIDTOKEN_FILE_NAME:Ljava/lang/String; = "xxxwww_v2"

.field public static final UMIDTOKEN_KEY_NAME:Ljava/lang/String; = "umidtk"

.field public static volatile cachedUmidToken:Ljava/lang/String; = ""

.field public static volatile initUmidFinished:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static compatUmidBug(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 0
    invoke-static {p1}, Lcom/alipay/sdk/m/d0/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "000000000000000000000000"

    invoke-static {p1, v0}, Lcom/alipay/sdk/m/d0/a;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/alipay/apmobilesecuritysdk/otherid/UtdidWrapper;->getUtdid(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string p1, ""

    if-eqz p0, :cond_2

    const-string v0, "?"

    invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    move-object p0, p1

    :cond_2
    invoke-static {p0}, Lcom/alipay/sdk/m/d0/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    return-object p1

    :cond_3
    return-object p0
.end method

.method public static declared-synchronized getSecurityToken(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .line 0
    const-class p0, Lcom/alipay/apmobilesecuritysdk/otherid/UmidSdkWrapper;

    move-object v0, p0

    monitor-enter v0

    :try_start_0
    sget-object p0, Lcom/alipay/apmobilesecuritysdk/otherid/UmidSdkWrapper;->cachedUmidToken:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static startUmidTaskSync(Landroid/content/Context;I)Ljava/lang/String;
    .locals 0

    const-string p0, ""

    return-object p0
.end method

.method public static declared-synchronized updateLocalUmidToken(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 0
    const-class v0, Lcom/alipay/apmobilesecuritysdk/otherid/UmidSdkWrapper;

    monitor-enter v0

    :try_start_0
    invoke-static {p1}, Lcom/alipay/sdk/m/d0/a;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "xxxwww_v2"

    const-string v2, "umidtk"

    invoke-static {p0, v1, v2, p1}, Lcom/alipay/sdk/m/g0/d;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object p1, Lcom/alipay/apmobilesecuritysdk/otherid/UmidSdkWrapper;->cachedUmidToken:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
