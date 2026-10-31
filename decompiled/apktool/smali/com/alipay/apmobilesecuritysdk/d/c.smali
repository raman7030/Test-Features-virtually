.class public Lcom/alipay/apmobilesecuritysdk/d/c;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static a(Landroid/content/Context;)Ljava/util/Map;
    .locals 11

    .line 0
    invoke-static {p0}, Lcom/alipay/apmobilesecuritysdk/face/APSecuritySdk;->getInstance(Landroid/content/Context;)Lcom/alipay/apmobilesecuritysdk/face/APSecuritySdk;

    move-result-object v0

    invoke-static {v0}, Lcom/alipay/sdk/m/f0/b;->a(Lcom/alipay/sdk/m/f0/f;)Lcom/alipay/sdk/m/f0/b;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-static {p0}, Lcom/alipay/apmobilesecuritysdk/e/e;->a(Landroid/content/Context;)Lcom/alipay/apmobilesecuritysdk/e/f;

    move-result-object v2

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    if-eqz v2, :cond_1

    invoke-static {v3}, Lcom/alipay/sdk/m/d0/a;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Lcom/alipay/apmobilesecuritysdk/e/f;->b()Ljava/lang/String;

    move-result-object v3

    :cond_0
    invoke-static {v4}, Lcom/alipay/sdk/m/d0/a;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v2}, Lcom/alipay/apmobilesecuritysdk/e/f;->e()Ljava/lang/String;

    move-result-object v4

    :cond_1
    new-instance v2, Lcom/alipay/apmobilesecuritysdk/e/f;

    const-string v8, ""

    const-string v9, ""

    const-string v6, ""

    move-object v5, v2

    move-object v7, v3

    move-object v10, v4

    invoke-direct/range {v5 .. v10}, Lcom/alipay/apmobilesecuritysdk/e/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p0, v2}, Lcom/alipay/apmobilesecuritysdk/e/e;->a(Landroid/content/Context;Lcom/alipay/apmobilesecuritysdk/e/f;)V

    const-string v2, "AD1"

    const-string v5, ""

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AD2"

    invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD3"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD5"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD6"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD7"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD9"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AD10"

    invoke-virtual {v1, v2, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD11"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->d()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD12"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->e()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD13"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->g()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD14"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->h()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD15"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->i()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD16"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AD17"

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD19"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->j()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD20"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "AD22"

    invoke-virtual {v1, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/alipay/sdk/m/d0/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD24"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD26"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->o()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD27"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD28"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->s()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD29"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->p()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD30"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->r()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD31"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->m()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD32"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->n()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD33"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD34"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD35"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD36"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->l()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD37"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->k()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD38"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "AD39"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0, p0}, Lcom/alipay/sdk/m/f0/b;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string v2, "AD40"

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->a()Ljava/lang/String;

    move-result-object p0

    const-string v2, "AD41"

    invoke-virtual {v1, v2, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/alipay/sdk/m/f0/b;->b()Ljava/lang/String;

    move-result-object p0

    const-string v0, "AD42"

    invoke-virtual {v1, v0, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method
