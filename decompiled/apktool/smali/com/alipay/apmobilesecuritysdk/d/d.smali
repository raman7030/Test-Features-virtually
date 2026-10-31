.class public Lcom/alipay/apmobilesecuritysdk/d/d;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static declared-synchronized a(Landroid/content/Context;)Ljava/util/Map;
    .locals 6

    .line 0
    const-class v0, Lcom/alipay/apmobilesecuritysdk/d/d;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/alipay/sdk/m/f0/e;->a()Lcom/alipay/sdk/m/f0/e;

    move-result-object v1

    invoke-static {p0}, Lcom/alipay/apmobilesecuritysdk/face/APSecuritySdk;->getInstance(Landroid/content/Context;)Lcom/alipay/apmobilesecuritysdk/face/APSecuritySdk;

    move-result-object v2

    invoke-static {v2}, Lcom/alipay/sdk/m/f0/b;->a(Lcom/alipay/sdk/m/f0/f;)Lcom/alipay/sdk/m/f0/b;

    move-result-object v2

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "AE1"

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "AE2"

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->c()Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "1"

    goto :goto_0

    :cond_0
    const-string v5, "0"

    :goto_0
    invoke-virtual {v3, v4, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "AE3"

    invoke-virtual {v1, p0}, Lcom/alipay/sdk/m/f0/e;->a(Landroid/content/Context;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "1"

    goto :goto_1

    :cond_1
    const-string p0, "0"

    :goto_1
    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->d()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE4"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->e()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE5"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->f()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE6"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->g()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE7"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->h()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE8"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->i()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE9"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->j()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE10"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->k()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE11"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->l()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE12"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->m()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE13"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->n()Ljava/lang/String;

    move-result-object p0

    const-string v4, "AE14"

    invoke-virtual {v3, v4, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/f0/e;->o()Ljava/lang/String;

    move-result-object p0

    const-string v1, "AE15"

    invoke-virtual {v3, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Lcom/alipay/sdk/m/f0/b;->f()Ljava/lang/String;

    move-result-object p0

    const-string v1, "AE21"

    invoke-virtual {v3, v1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v3

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Ljava/util/Map;
    .locals 3

    .line 0
    const-class v0, Lcom/alipay/apmobilesecuritysdk/d/d;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    const-string v2, "AE16"

    invoke-static {p0}, Lcom/alipay/apmobilesecuritysdk/c/c;->a(Landroid/content/Context;)Lcom/alipay/apmobilesecuritysdk/c/c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/alipay/apmobilesecuritysdk/c/c;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p0
.end method
