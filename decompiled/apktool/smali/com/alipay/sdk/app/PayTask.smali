.class public Lcom/alipay/sdk/app/PayTask;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final h:Ljava/lang/Object;

.field public static i:J


# instance fields
.field public a:Landroid/app/Activity;

.field public b:Lcom/alipay/sdk/m/c0/a;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public g:Ljava/util/Map;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lcom/alipay/sdk/m/y/k;

    sput-object v0, Lcom/alipay/sdk/app/PayTask;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "wappaygw.alipay.com/service/rest.htm"

    .line 2
    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->c:Ljava/lang/String;

    const-string v0, "mclient.alipay.com/service/rest.htm"

    .line 3
    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->d:Ljava/lang/String;

    const-string v0, "mclient.alipay.com/home/exterfaceAssign.htm"

    .line 4
    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->e:Ljava/lang/String;

    const-string v0, "mclient.alipay.com/cashier/mobilepay.htm"

    .line 5
    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->f:Ljava/lang/String;

    .line 6
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->g:Ljava/util/Map;

    .line 11
    iput-object p1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    .line 12
    invoke-static {}, Lcom/alipay/sdk/m/w/b;->c()Lcom/alipay/sdk/m/w/b;

    move-result-object v0

    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/alipay/sdk/m/w/b;->a(Landroid/content/Context;)V

    .line 13
    new-instance v0, Lcom/alipay/sdk/m/c0/a;

    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    sget v2, Lcom/alipay/sdk/R$string;->alipay_standard_sdk_loading_go_pay:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Lcom/alipay/sdk/m/c0/a;-><init>(Landroid/app/Activity;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->b:Lcom/alipay/sdk/m/c0/a;

    return-void
.end method

.method public static synthetic a(Lcom/alipay/sdk/app/PayTask;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    return-object p0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    const-string v0, "sc"

    const-string v1, ""

    .line 255
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v3, 0x0

    invoke-virtual {v2, p0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    .line 256
    iget-object v2, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 257
    :try_start_1
    iget-object p0, p0, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    move-object v2, v1

    .line 259
    :goto_0
    invoke-static {p0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    move-object p0, v1

    .line 262
    :goto_1
    :try_start_2
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    const-string v4, "appkey"

    const-string v5, "2014052600006128"

    .line 263
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "ty"

    const-string v5, "and_lite"

    .line 264
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "sv"

    const-string v5, "h.a.3.8.40"

    .line 265
    invoke-virtual {v3, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "an"

    .line 266
    invoke-virtual {v3, v4, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "av"

    .line 267
    invoke-virtual {v3, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p0, "sdk_start_time"

    .line 268
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {v3, p0, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 269
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const-string p0, "h5tonative"

    .line 270
    invoke-virtual {v3, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 272
    :cond_0
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    .line 274
    invoke-static {p0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public static a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/app/Activity;)Ljava/lang/String;
    .locals 2

    .line 427
    invoke-static {p0, p4, p2}, Lcom/alipay/sdk/m/y/q;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/util/List;)Lcom/alipay/sdk/m/y/q$c;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 428
    invoke-virtual {p2, p0}, Lcom/alipay/sdk/m/y/q$c;->a(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lcom/alipay/sdk/m/y/q$c;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p2, p2, Lcom/alipay/sdk/m/y/q$c;->a:Landroid/content/pm/PackageInfo;

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    const-string v0, "hk.alipay.wallet"

    .line 429
    invoke-static {p2, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    const-string p2, "mspl"

    const-string p3, "PayTask not_login"

    .line 436
    invoke-static {p2, p3}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 437
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 439
    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 440
    sget-object v1, Lcom/alipay/sdk/app/PayResultActivity;->c:Ljava/util/HashMap;

    invoke-virtual {v1, p2, p3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    new-instance p3, Landroid/content/Intent;

    const-class v0, Lcom/alipay/sdk/app/PayResultActivity;

    invoke-direct {p3, p4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v0, "orderSuffix"

    .line 444
    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 445
    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "externalPkgName"

    invoke-virtual {p3, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "phonecashier.pay.hash"

    .line 446
    invoke-virtual {p3, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 447
    invoke-static {p0, p3}, Lcom/alipay/sdk/m/w/a$a;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Intent;)V

    .line 448
    invoke-virtual {p4, p3}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 450
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    move-object v0, p0

    monitor-enter v0

    :try_start_0
    const-string p0, "mspl"

    const-string p1, "PayTask wait"

    .line 452
    invoke-static {p0, p1}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 453
    invoke-virtual {v1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 458
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 460
    sget-object p0, Lcom/alipay/sdk/app/PayResultActivity$b;->b:Ljava/lang/String;

    .line 461
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "PayTask ret: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "mspl"

    invoke-static {p2, p1}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-object p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    :try_start_2
    const-string p0, "mspl"

    const-string p1, "PayTask interrupted"

    .line 462
    invoke-static {p0, p1}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 463
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p0

    monitor-exit v0

    return-object p0

    .line 465
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p0

    :cond_1
    :goto_1
    return-object p3
.end method

.method public static final varargs a([Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    const-string v0, ""

    if-nez p0, :cond_0

    return-object v0

    .line 278
    :cond_0
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p0, v2

    .line 279
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-object v0
.end method

.method public static synthetic a(Lcom/alipay/sdk/app/PayTask;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/alipay/sdk/app/PayTask;->b(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)V

    return-void
.end method

.method public static declared-synchronized fetchSdkConfig(Landroid/content/Context;)Z
    .locals 9

    .line 2
    const-class v0, Lcom/alipay/sdk/app/PayTask;

    .line 3
    monitor-enter v0

    const/4 v1, 0x0

    .line 1
    :try_start_0
    invoke-static {}, Lcom/alipay/sdk/m/w/b;->c()Lcom/alipay/sdk/m/w/b;

    move-result-object v2

    invoke-virtual {v2, p0}, Lcom/alipay/sdk/m/w/b;->a(Landroid/content/Context;)V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    .line 3
    sget-wide v4, Lcom/alipay/sdk/app/PayTask;->i:J

    sub-long v4, v2, v4

    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/alipay/sdk/m/o/b;->e()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v6, v6

    cmp-long v8, v4, v6

    if-gez v8, :cond_0

    monitor-exit v0

    return v1

    .line 6
    :cond_0
    :try_start_1
    sput-wide v2, Lcom/alipay/sdk/app/PayTask;->i:J

    .line 7
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v2

    invoke-static {}, Lcom/alipay/sdk/m/w/a;->f()Lcom/alipay/sdk/m/w/a;

    move-result-object v3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    const/4 v4, 0x4

    invoke-virtual {v2, v3, p0, v1, v4}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;ZI)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    const/4 p0, 0x1

    return p0

    :catchall_0
    move-exception p0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 10
    :try_start_2
    invoke-static {p0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return v1

    :goto_0
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method


# virtual methods
.method public final a()Lcom/alipay/sdk/m/y/k$f;
    .locals 1

    .line 361
    new-instance v0, Lcom/alipay/sdk/app/PayTask$c;

    invoke-direct {v0, p0}, Lcom/alipay/sdk/app/PayTask$c;-><init>(Lcom/alipay/sdk/app/PayTask;)V

    return-object v0
.end method

.method public final a(Lcom/alipay/sdk/m/w/a;Lcom/alipay/sdk/m/v/b;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    .line 743
    invoke-static {v0}, Lcom/alipay/sdk/m/l/b;->a(Z)V

    const/4 v1, 0x0

    .line 744
    invoke-static {v1}, Lcom/alipay/sdk/m/l/b;->a(Ljava/lang/String;)V

    .line 745
    invoke-virtual {p2}, Lcom/alipay/sdk/m/v/b;->c()[Ljava/lang/String;

    move-result-object p2

    .line 746
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-class v3, Lcom/alipay/sdk/app/H5PayActivity;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 747
    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 748
    aget-object v0, p2, v0

    const-string v3, "url"

    .line 749
    invoke-virtual {v2, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 751
    array-length v0, p2

    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const/4 v0, 0x1

    .line 752
    aget-object p2, p2, v0

    const-string v0, "cookie"

    .line 753
    invoke-virtual {v2, v0, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 755
    :cond_0
    invoke-virtual {v1, v2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 756
    invoke-static {p1, v1}, Lcom/alipay/sdk/m/w/a$a;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Intent;)V

    .line 757
    iget-object p1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {p1, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 759
    sget-object p1, Lcom/alipay/sdk/app/PayTask;->h:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 761
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 766
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 768
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->d()Ljava/lang/String;

    move-result-object p1

    .line 769
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 770
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 771
    :try_start_2
    invoke-static {p1}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 772
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 774
    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final a(Lcom/alipay/sdk/m/w/a;Lcom/alipay/sdk/m/v/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 662
    invoke-virtual {p2}, Lcom/alipay/sdk/m/v/b;->c()[Ljava/lang/String;

    move-result-object p2

    .line 666
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-class v2, Lcom/alipay/sdk/app/H5PayActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 669
    :try_start_0
    new-instance v1, Ljava/lang/String;

    const/4 v2, 0x2

    aget-object v3, p2, v2

    invoke-static {v3}, Lcom/alipay/sdk/m/p/a;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/String;-><init>([B)V

    invoke-static {v1}, Lcom/alipay/sdk/m/y/q;->h(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "url"

    const/4 v4, 0x0

    .line 670
    aget-object v5, p2, v4

    invoke-virtual {v0, v3, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "title"

    const/4 v5, 0x1

    .line 671
    aget-object v6, p2, v5

    invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "version"

    const-string v6, "v2"

    .line 672
    invoke-virtual {v0, v3, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v3, "method"

    const-string v6, "method"

    const-string v7, "POST"

    .line 673
    invoke-virtual {v1, v6, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 681
    invoke-static {v4}, Lcom/alipay/sdk/m/l/b;->a(Z)V

    const/4 p2, 0x0

    .line 682
    invoke-static {p2}, Lcom/alipay/sdk/m/l/b;->a(Ljava/lang/String;)V

    .line 683
    invoke-static {p1, v0}, Lcom/alipay/sdk/m/w/a$a;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Intent;)V

    .line 684
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 686
    sget-object v1, Lcom/alipay/sdk/app/PayTask;->h:Ljava/lang/Object;

    move-object v0, v1

    monitor-enter v0

    .line 688
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/Object;->wait()V

    .line 689
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->c()Z

    move-result v1

    .line 690
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->d()Ljava/lang/String;

    move-result-object v3

    .line 691
    invoke-static {v4}, Lcom/alipay/sdk/m/l/b;->a(Z)V

    .line 692
    invoke-static {p2}, Lcom/alipay/sdk/m/l/b;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 697
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    const-string p2, ""

    if-eqz v1, :cond_1

    .line 703
    :try_start_3
    new-instance v0, Ljava/lang/String;

    invoke-static {v3}, Lcom/alipay/sdk/m/p/a;->a(Ljava/lang/String;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    .line 704
    invoke-static {v0}, Lcom/alipay/sdk/m/y/q;->h(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    invoke-static {v0}, Lcom/alipay/sdk/m/v/b;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    .line 705
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v6

    if-ge v1, v6, :cond_1

    .line 706
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alipay/sdk/m/v/b;

    .line 707
    invoke-virtual {v6}, Lcom/alipay/sdk/m/v/b;->a()Lcom/alipay/sdk/m/v/a;

    move-result-object v7

    sget-object v8, Lcom/alipay/sdk/m/v/a;->f:Lcom/alipay/sdk/m/v/a;

    if-ne v7, v8, :cond_0

    .line 708
    invoke-virtual {v6}, Lcom/alipay/sdk/m/v/b;->c()[Ljava/lang/String;

    move-result-object v0

    .line 709
    aget-object v1, v0, v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    aget-object v4, v0, v4

    aget-object v0, v0, v2

    .line 710
    invoke-static {p1, v0}, Lcom/alipay/sdk/m/y/q;->e(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 711
    invoke-static {v1, v4, v0}, Lcom/alipay/sdk/m/l/b;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 717
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    const-string v1, "biz"

    const-string v2, "H5PayDataAnalysisError"

    .line 718
    invoke-static {p1, v1, v2, v0, v3}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 724
    :cond_1
    :goto_1
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 727
    :try_start_4
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    const-string v0, ""

    const-string v1, ""

    invoke-static {p2, v0, v1}, Lcom/alipay/sdk/m/l/b;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception p2

    const-string v0, "endCode: "

    .line 0
    invoke-static {v0, p3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    const-string v0, "biz"

    const-string v1, "H5PayDataAnalysisError"

    .line 729
    invoke-static {p1, v0, v1, p2, p3}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    const-string p1, ""

    const-string p2, ""

    const/16 p3, 0x1f40

    .line 732
    invoke-static {p3, p1, p2}, Lcom/alipay/sdk/m/l/b;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    :cond_2
    :goto_2
    return-object p2

    :catchall_2
    move-exception p1

    goto :goto_3

    :catch_0
    move-exception p1

    .line 733
    :try_start_5
    invoke-static {p1}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 734
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 736
    :goto_3
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :catchall_3
    move-exception p3

    .line 737
    invoke-static {p3}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 739
    invoke-static {p2}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "biz"

    const-string v1, "H5PayDataAnalysisError"

    .line 740
    invoke-static {p1, v0, v1, p3, p2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 742
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const-string v0, "biz"

    .line 466
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->showLoading()V

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "h5CashierRequest"

    .line 471
    invoke-static {p1, v0, v2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 472
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/alipay/sdk/m/o/b;->h(Lcom/alipay/sdk/m/w/a;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 473
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/alipay/sdk/m/r/b;->a(Lcom/alipay/sdk/m/w/a;)V

    .line 474
    new-instance v2, Lcom/alipay/sdk/m/u/d;

    invoke-direct {v2}, Lcom/alipay/sdk/m/u/d;-><init>()V

    .line 475
    iget-object v3, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {}, Lcom/alipay/sdk/m/y/p;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, p1, v3, p2, v4}, Lcom/alipay/sdk/m/t/e;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/alipay/sdk/m/t/b;

    move-result-object v2

    goto :goto_0

    .line 477
    :cond_0
    new-instance v2, Lcom/alipay/sdk/m/u/g;

    invoke-direct {v2}, Lcom/alipay/sdk/m/u/g;-><init>()V

    .line 478
    iget-object v3, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v2, p1, v3, p2}, Lcom/alipay/sdk/m/t/e;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;)Lcom/alipay/sdk/m/t/b;

    move-result-object v2

    .line 480
    :goto_0
    invoke-virtual {v2}, Lcom/alipay/sdk/m/t/b;->c()Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "h5CashierResponse"

    .line 482
    invoke-static {p1, v0, v3}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    const-string v3, "end_code"

    .line 484
    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 487
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v4

    invoke-virtual {v4, v1}, Lcom/alipay/sdk/m/o/b;->h(Lcom/alipay/sdk/m/w/a;)Z

    move-result v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v5, "onload"

    const-string v6, "form"

    if-eqz v4, :cond_1

    :try_start_1
    const-string v4, "data"

    .line 488
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 490
    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 492
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v1

    :goto_1
    if-nez v4, :cond_2

    .line 497
    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 498
    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    .line 501
    :cond_2
    invoke-static {v4}, Lcom/alipay/sdk/m/v/b;->a(Lorg/json/JSONObject;)Ljava/util/List;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 503
    :goto_2
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_4

    .line 504
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/alipay/sdk/m/v/b;

    invoke-virtual {v7}, Lcom/alipay/sdk/m/v/b;->a()Lcom/alipay/sdk/m/v/a;

    move-result-object v7

    sget-object v8, Lcom/alipay/sdk/m/v/a;->d:Lcom/alipay/sdk/m/v/a;

    if-ne v7, v8, :cond_3

    .line 505
    invoke-interface {v4, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/alipay/sdk/m/v/b;

    invoke-static {v7}, Lcom/alipay/sdk/m/v/b;->a(Lcom/alipay/sdk/m/v/b;)V

    :cond_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    .line 509
    :cond_4
    invoke-virtual {p0, p1, v2}, Lcom/alipay/sdk/app/PayTask;->b(Lcom/alipay/sdk/m/w/a;Lorg/json/JSONObject;)V

    .line 512
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 515
    iget-object v6, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v7, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v6, p1, p2, v7}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 517
    :goto_3
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_8

    .line 518
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/alipay/sdk/m/v/b;

    .line 519
    invoke-virtual {v6}, Lcom/alipay/sdk/m/v/b;->a()Lcom/alipay/sdk/m/v/a;

    move-result-object v7

    sget-object v8, Lcom/alipay/sdk/m/v/a;->c:Lcom/alipay/sdk/m/v/a;

    if-ne v7, v8, :cond_5

    .line 520
    invoke-virtual {p0, p1, v6}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Lcom/alipay/sdk/m/v/b;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 536
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 539
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v1, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 540
    :cond_5
    :try_start_2
    invoke-virtual {v6}, Lcom/alipay/sdk/m/v/b;->a()Lcom/alipay/sdk/m/v/a;

    move-result-object v7

    sget-object v8, Lcom/alipay/sdk/m/v/a;->e:Lcom/alipay/sdk/m/v/a;

    if-ne v7, v8, :cond_6

    .line 541
    invoke-virtual {p0, p1, v6, v3}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Lcom/alipay/sdk/m/v/b;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 555
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 558
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v1, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 559
    :cond_6
    :try_start_3
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v7

    invoke-virtual {v7, v1}, Lcom/alipay/sdk/m/o/b;->h(Lcom/alipay/sdk/m/w/a;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 560
    invoke-virtual {v6}, Lcom/alipay/sdk/m/v/b;->a()Lcom/alipay/sdk/m/v/a;

    move-result-object v6

    sget-object v7, Lcom/alipay/sdk/m/v/a;->h:Lcom/alipay/sdk/m/v/a;

    if-ne v6, v7, :cond_7

    .line 561
    invoke-virtual {p0, p1, v2}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 572
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 575
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v1, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_7
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 576
    :cond_8
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 579
    iget-object v0, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v0, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :catchall_0
    move-exception v2

    .line 580
    :try_start_4
    invoke-static {v2}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    const-string v3, "H5PayDataAnalysisError"

    .line 581
    invoke-static {p1, v0, v3, v2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 584
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 587
    iget-object v0, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v0, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_4

    :catch_0
    move-exception v0

    .line 588
    :try_start_5
    sget-object v1, Lcom/alipay/sdk/m/l/c;->f:Lcom/alipay/sdk/m/l/c;

    invoke-virtual {v1}, Lcom/alipay/sdk/m/l/c;->c()I

    move-result v1

    invoke-static {v1}, Lcom/alipay/sdk/m/l/c;->a(I)Lcom/alipay/sdk/m/l/c;

    move-result-object v1

    const-string v2, "net"

    .line 589
    invoke-static {p1, v2, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 595
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 598
    iget-object v0, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v0, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    :goto_4
    if-nez v1, :cond_9

    .line 602
    sget-object p1, Lcom/alipay/sdk/m/l/c;->d:Lcom/alipay/sdk/m/l/c;

    invoke-virtual {p1}, Lcom/alipay/sdk/m/l/c;->c()I

    move-result p1

    invoke-static {p1}, Lcom/alipay/sdk/m/l/c;->a(I)Lcom/alipay/sdk/m/l/c;

    move-result-object v1

    .line 604
    :cond_9
    invoke-virtual {v1}, Lcom/alipay/sdk/m/l/c;->c()I

    move-result p1

    invoke-virtual {v1}, Lcom/alipay/sdk/m/l/c;->b()Ljava/lang/String;

    move-result-object p2

    const-string v0, ""

    invoke-static {p1, p2, v0}, Lcom/alipay/sdk/m/l/b;->a(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :catchall_1
    move-exception v0

    .line 605
    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 608
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    iget-object v2, p1, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v1, p1, p2, v2}, Lcom/alipay/sdk/m/m/a;->a(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 609
    throw v0
.end method

.method public final declared-synchronized a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Z)Ljava/lang/String;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, ""

    const-string v4, "pay returning: "

    const-string v5, ""

    const-string v6, ""

    const-string v7, "pay raw result: "

    const-string v8, "pay prepared: "

    move-object/from16 v16, p0

    monitor-enter v16

    .line 3
    :try_start_0
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v9

    invoke-virtual {v9, v2}, Lcom/alipay/sdk/m/o/b;->c(Lcom/alipay/sdk/m/w/a;)Z

    .line 4
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v9

    invoke-virtual {v9, v2}, Lcom/alipay/sdk/m/o/b;->e(Lcom/alipay/sdk/m/w/a;)Z

    .line 5
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v9

    invoke-virtual {v9, v2}, Lcom/alipay/sdk/m/o/b;->g(Lcom/alipay/sdk/m/w/a;)Z

    .line 7
    sget-boolean v9, Lcom/alipay/sdk/app/AlipayApi;->e:Z

    if-eqz p3, :cond_0

    .line 11
    invoke-virtual/range {p0 .. p0}, Lcom/alipay/sdk/app/PayTask;->showLoading()V

    :cond_0
    const-string v10, "biz"

    const-string v11, "isDebugApp"

    const-string v12, "false"

    .line 13
    invoke-static {v2, v10, v11, v12}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v10, "payment_inst="

    .line 32
    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    const/4 v11, 0x0

    if-eqz v10, :cond_2

    const-string v10, "payment_inst="

    .line 33
    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0xd

    .line 34
    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v10

    const/16 v12, 0x26

    .line 35
    invoke-virtual {v10, v12}, Ljava/lang/String;->indexOf(I)I

    move-result v12

    if-lez v12, :cond_1

    .line 37
    invoke-virtual {v10, v11, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    :cond_1
    const-string v12, "\""

    const-string v13, ""

    .line 39
    invoke-virtual {v10, v12, v13}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 40
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    const-string v12, "alipay"

    const-string v13, ""

    .line 41
    invoke-virtual {v10, v12, v13}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 43
    invoke-static {v10}, Lcom/alipay/sdk/m/l/a;->a(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    const-string v10, ""

    .line 46
    invoke-static {v10}, Lcom/alipay/sdk/m/l/a;->a(Ljava/lang/String;)V

    :goto_0
    const-string v10, "service=alipay.acquire.mr.ord.createandpay"

    .line 50
    invoke-virtual {v0, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_3

    const/4 v10, 0x1

    .line 51
    sput-boolean v10, Lcom/alipay/sdk/m/n/a;->y:Z

    .line 54
    :cond_3
    sget-boolean v10, Lcom/alipay/sdk/m/n/a;->y:Z

    if-eqz v10, :cond_5

    const-string v10, "https://wappaygw.alipay.com/home/exterfaceAssign.htm?"

    .line 55
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_4

    const-string v10, "https://wappaygw.alipay.com/home/exterfaceAssign.htm?"

    .line 57
    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0x35

    .line 58
    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    const-string v10, "https://mclient.alipay.com/home/exterfaceAssign.htm?"

    .line 61
    invoke-virtual {v0, v10}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_5

    const-string v10, "https://mclient.alipay.com/home/exterfaceAssign.htm?"

    .line 63
    invoke-virtual {v0, v10}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    add-int/lit8 v10, v10, 0x34

    .line 64
    invoke-virtual {v0, v10}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    :cond_5
    :goto_1
    move-object v10, v0

    const-string v12, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    const/4 v13, 0x3

    const/4 v14, 0x0

    :try_start_1
    const-string v0, "mspl"

    .line 78
    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v15, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v0, v8}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    invoke-virtual {v1, v10, v2}, Lcom/alipay/sdk/app/PayTask;->a(Ljava/lang/String;Lcom/alipay/sdk/m/w/a;)Ljava/lang/String;

    move-result-object v12

    const-string v0, "mspl"

    .line 80
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    iget-object v0, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v2, v0, v12}, Lcom/alipay/sdk/m/y/l;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 86
    :try_start_2
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-nez v0, :cond_6

    const-string v0, "externalSdkData"

    .line 87
    invoke-static {v12, v0}, Lcom/alipay/sdk/m/y/o;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 88
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    if-nez v3, :cond_6

    .line 90
    :try_start_3
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "preheatUserToken"

    .line 91
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 92
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    .line 93
    iget-object v3, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v5, "sp_preheatUserToken"

    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/y/m;->b(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception v0

    .line 96
    :try_start_4
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 100
    :cond_6
    :goto_2
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/alipay/sdk/m/o/b;->h(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 101
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/r/b;->a()V

    .line 102
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/r/b;->d()V

    .line 105
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "biz"

    const-string v5, "PgReturn"

    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resultStatus"

    .line 109
    invoke-static {v12, v3}, Lcom/alipay/sdk/m/y/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "|"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "memo"

    invoke-static {v12, v3}, Lcom/alipay/sdk/m/y/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "biz"

    const-string v5, "PgReturnV"

    .line 110
    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/o/b;->t()Z

    move-result v0

    if-nez v0, :cond_8

    .line 116
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    iget-object v3, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v11, v13}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;ZI)V

    .line 119
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 120
    invoke-virtual/range {p0 .. p1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;)V

    .line 122
    iget-object v0, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v3, v2, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v0, v2, v10, v3}, Lcom/alipay/sdk/m/m/a;->b(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions;->getAlipayPayLifeCycle()Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 125
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    :try_start_5
    const-string v0, "isHitPreHeatApp"

    .line 127
    invoke-virtual {v2, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto/16 :goto_4

    :catchall_1
    move-exception v0

    .line 129
    :try_start_6
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_8

    goto/16 :goto_4

    :catchall_2
    move-exception v0

    .line 132
    :try_start_7
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object v12

    .line 133
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 135
    :try_start_8
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-nez v0, :cond_9

    const-string v0, "externalSdkData"

    .line 136
    invoke-static {v12, v0}, Lcom/alipay/sdk/m/y/o;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 137
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    if-nez v3, :cond_9

    .line 139
    :try_start_9
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "preheatUserToken"

    .line 140
    invoke-virtual {v3, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 141
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 142
    iget-object v3, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v6, "sp_preheatUserToken"

    invoke-static {v2, v3, v6, v0}, Lcom/alipay/sdk/m/y/m;->b(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception v0

    .line 145
    :try_start_a
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 149
    :cond_9
    :goto_3
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/alipay/sdk/m/o/b;->h(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 150
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/r/b;->a()V

    .line 151
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/r/b;->d()V

    .line 154
    :cond_a
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "biz"

    const-string v5, "PgReturn"

    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 155
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resultStatus"

    .line 158
    invoke-static {v12, v3}, Lcom/alipay/sdk/m/y/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "|"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "memo"

    invoke-static {v12, v3}, Lcom/alipay/sdk/m/y/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "biz"

    const-string v5, "PgReturnV"

    .line 159
    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/o/b;->t()Z

    move-result v0

    if-nez v0, :cond_b

    .line 165
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    iget-object v3, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v11, v13}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;ZI)V

    .line 168
    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 169
    invoke-virtual/range {p0 .. p1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;)V

    .line 171
    iget-object v0, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v3, v2, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v0, v2, v10, v3}, Lcom/alipay/sdk/m/m/a;->b(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 173
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions;->getAlipayPayLifeCycle()Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;

    move-result-object v0

    if-eqz v0, :cond_c

    .line 174
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    :try_start_b
    const-string v0, "isHitPreHeatApp"

    .line 176
    invoke-virtual {v2, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception v0

    .line 178
    :try_start_c
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 131
    :goto_4
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;

    invoke-virtual {v0}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions;->getAlipayPayLifeCycle()Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;->onPayEnd(Lorg/json/JSONObject;)V

    .line 184
    :cond_c
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "mspl"

    invoke-static {v2, v0}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    monitor-exit v16

    return-object v12

    :catchall_5
    move-exception v0

    move-object v4, v0

    .line 185
    :try_start_d
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v0, "externalSdkData"

    .line 186
    invoke-static {v12, v0}, Lcom/alipay/sdk/m/y/o;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 187
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    if-nez v5, :cond_d

    .line 189
    :try_start_e
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "preheatUserToken"

    .line 190
    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 191
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_d

    .line 192
    iget-object v5, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v6, "sp_preheatUserToken"

    invoke-static {v2, v5, v6, v0}, Lcom/alipay/sdk/m/y/m;->b(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    goto :goto_5

    :catchall_6
    move-exception v0

    .line 195
    :try_start_f
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 199
    :cond_d
    :goto_5
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, v14}, Lcom/alipay/sdk/m/o/b;->h(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-eqz v0, :cond_e

    .line 200
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/r/b;->a()V

    .line 201
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/r/b;->d()V

    .line 204
    :cond_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v5

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "biz"

    const-string v5, "PgReturn"

    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 205
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "resultStatus"

    .line 208
    invoke-static {v12, v3}, Lcom/alipay/sdk/m/y/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "|"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "memo"

    invoke-static {v12, v3}, Lcom/alipay/sdk/m/y/o;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "biz"

    const-string v5, "PgReturnV"

    .line 209
    invoke-static {v2, v3, v5, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 214
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/o/b;->t()Z

    move-result v0

    if-nez v0, :cond_f

    .line 215
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    iget-object v3, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0, v2, v3, v11, v13}, Lcom/alipay/sdk/m/o/b;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;ZI)V

    .line 218
    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/alipay/sdk/app/PayTask;->dismissLoading()V

    .line 219
    invoke-virtual/range {p0 .. p1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;)V

    .line 221
    iget-object v0, v1, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iget-object v3, v2, Lcom/alipay/sdk/m/w/a;->d:Ljava/lang/String;

    invoke-static {v0, v2, v10, v3}, Lcom/alipay/sdk/m/m/a;->b(Landroid/content/Context;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 223
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;

    if-eqz v0, :cond_10

    invoke-virtual {v0}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions;->getAlipayPayLifeCycle()Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 224
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_8

    :try_start_10
    const-string v0, "isHitPreHeatApp"

    .line 226
    invoke-virtual {v2, v0, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_6

    :catchall_7
    move-exception v0

    .line 228
    :try_start_11
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 230
    :goto_6
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->g:Lcom/alipay/sdk/app/debug/AlipayDebugOptions;

    invoke-virtual {v0}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions;->getAlipayPayLifeCycle()Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;

    move-result-object v0

    invoke-interface {v0, v2}, Lcom/alipay/sdk/app/debug/AlipayDebugOptions$AlipayPayLifeCycle;->onPayEnd(Lorg/json/JSONObject;)V

    .line 232
    :cond_10
    throw v4

    :catchall_8
    move-exception v0

    monitor-exit v16
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    throw v0
.end method

.method public final a(Lcom/alipay/sdk/m/w/a;Lorg/json/JSONObject;)Ljava/lang/String;
    .locals 6

    const-string v0, "mspl"

    const-string v1, "processLocalWebPay"

    .line 610
    invoke-static {v0, v1}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 611
    invoke-static {v0}, Lcom/alipay/sdk/m/l/b;->a(Z)V

    const/4 v0, 0x0

    .line 612
    invoke-static {v0}, Lcom/alipay/sdk/m/l/b;->a(Ljava/lang/String;)V

    .line 613
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-class v2, Lcom/alipay/sdk/app/H5PayActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    :try_start_0
    const-string v1, "data"

    .line 615
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "local_web_pay_data"

    .line 616
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "h5_cashier_url"

    .line 617
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "h5_local_data"

    .line 618
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v3, "sha256"

    const-string v4, ""

    .line 620
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "source_url"

    const-string v5, ""

    .line 621
    invoke-virtual {v1, v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "update_strategy"

    .line 622
    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 623
    new-instance v5, Lcom/alipay/sdk/m/r/a;

    invoke-direct {v5, v3, v4, v1}, Lcom/alipay/sdk/m/r/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 624
    invoke-static {}, Lcom/alipay/sdk/m/r/b;->e()Lcom/alipay/sdk/m/r/b;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/alipay/sdk/m/r/b;->a(Lcom/alipay/sdk/m/r/a;)V

    const-string v3, "biz"

    const-string v4, "h5LocalDataUpdateStrategy"

    .line 625
    invoke-static {p1, v3, v4, v1}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "url"

    .line 627
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "version"

    const-string v2, "v1"

    .line 628
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "cashierBizData"

    .line 629
    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 631
    new-instance p2, Landroid/os/Bundle;

    invoke-direct {p2}, Landroid/os/Bundle;-><init>()V

    const-string v1, "backisexit"

    .line 633
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/alipay/sdk/m/o/b;->d(Lcom/alipay/sdk/m/w/a;)Z

    move-result v2

    invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 634
    invoke-virtual {v0, p2}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 641
    invoke-static {p1, v0}, Lcom/alipay/sdk/m/w/a$a;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Intent;)V

    .line 642
    iget-object p1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 643
    sget-object p1, Lcom/alipay/sdk/app/PayTask;->h:Ljava/lang/Object;

    move-object v0, p1

    monitor-enter v0

    .line 645
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 650
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 652
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->d()Ljava/lang/String;

    move-result-object p1

    .line 653
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 654
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 655
    :try_start_3
    invoke-static {p1}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    .line 656
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    .line 658
    :goto_0
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :catchall_1
    move-exception p2

    .line 659
    invoke-static {p2}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    const-string v0, "biz"

    const-string v1, "processLocalWebPay"

    .line 660
    invoke-static {p1, v0, v1, p2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 661
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Lcom/alipay/sdk/m/w/a;)Ljava/lang/String;
    .locals 8

    .line 362
    invoke-virtual {p2, p1}, Lcom/alipay/sdk/m/w/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 363
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "payResult orderInfo="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "mspl"

    invoke-static {v1, v0}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "paymethod=\"expressGateway\""

    .line 364
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 365
    invoke-virtual {p0, p2, p1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 370
    :cond_0
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/o/b;->m()Ljava/util/List;

    move-result-object v0

    .line 373
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v2

    iget-boolean v2, v2, Lcom/alipay/sdk/m/o/b;->g:Z

    if-eqz v2, :cond_1

    if-nez v0, :cond_2

    .line 376
    :cond_1
    sget-object v0, Lcom/alipay/sdk/m/l/a;->d:Ljava/util/List;

    .line 380
    :cond_2
    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const/4 v3, 0x1

    invoke-static {p2, v2, v0, v3}, Lcom/alipay/sdk/m/y/q;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/util/List;Z)Z

    move-result v2

    const-string v4, "biz"

    if-eqz v2, :cond_8

    .line 382
    new-instance v2, Lcom/alipay/sdk/m/y/k;

    iget-object v5, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {p0}, Lcom/alipay/sdk/app/PayTask;->a()Lcom/alipay/sdk/m/y/k$f;

    move-result-object v6

    invoke-direct {v2, v5, p2, v6}, Lcom/alipay/sdk/m/y/k;-><init>(Landroid/app/Activity;Lcom/alipay/sdk/m/w/a;Lcom/alipay/sdk/m/y/k$f;)V

    const-string v5, "pay inner started: "

    .line 383
    invoke-virtual {v5, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 384
    invoke-virtual {p0, p2, p1}, Lcom/alipay/sdk/app/PayTask;->c(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)V

    const/4 v5, 0x0

    .line 385
    invoke-virtual {v2, p1, v5}, Lcom/alipay/sdk/m/y/k;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    .line 387
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_3

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "resultStatus={"

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v7, Lcom/alipay/sdk/m/l/c;->g:Lcom/alipay/sdk/m/l/c;

    invoke-virtual {v7}, Lcom/alipay/sdk/m/l/c;->c()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "}"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 388
    iget-object v5, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v6, "alipaySdk"

    const-string v7, "startActivityEx"

    invoke-static {v6, v7, v5, p2}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/alipay/sdk/m/w/a;)V

    .line 389
    invoke-virtual {v2, p1, v3}, Lcom/alipay/sdk/m/y/k;->a(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    .line 391
    :cond_3
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "pay inner raw result: "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    invoke-virtual {v2}, Lcom/alipay/sdk/m/y/k;->a()V

    .line 393
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/alipay/sdk/m/o/b;->y()Z

    move-result v1

    const-string v2, "failed"

    .line 394
    invoke-static {v5, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v2, "scheme_failed"

    invoke-static {v5, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    if-eqz v1, :cond_4

    .line 395
    invoke-virtual {p2}, Lcom/alipay/sdk/m/w/a;->i()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_0

    .line 400
    :cond_4
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 401
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->a()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_5
    const-string v1, "{\"isLogin\":\"false\"}"

    .line 403
    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    const-string v1, "LogHkLoginByIntent"

    .line 406
    invoke-static {p2, v4, v1}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 407
    iget-object v1, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-static {p2, p1, v0, v5, v1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroid/app/Activity;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v5

    :cond_7
    :goto_0
    const-string v0, "LogBindCalledH5"

    .line 408
    invoke-static {p2, v4, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 409
    invoke-virtual {p0, p2, p1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_8
    const-string v0, "LogCalledH5"

    .line 425
    invoke-static {p2, v4, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;)V

    .line 426
    invoke-virtual {p0, p2, p1}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "={"

    .line 0
    invoke-static {p2, v0}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 360
    invoke-virtual {p1, p2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    add-int/2addr p2, v0

    const-string v0, "}"

    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;
    .locals 9

    const-string v0, "resultStatus"

    .line 302
    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "9000"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "result"

    .line 305
    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 308
    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->g:Ljava/util/Map;

    invoke-interface {v2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/alipay/sdk/app/PayTask$e;

    const-string v2, "callBackUrl"

    .line 311
    invoke-interface {p2, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 312
    invoke-interface {p2, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1

    .line 323
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p2

    const/16 v2, 0xf

    if-le p2, v2, :cond_1

    const-string p2, "&callBackUrl=\""

    const-string v2, "\""

    .line 325
    invoke-static {p2, v2, v1}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p2, "&call_back_url=\""

    .line 326
    invoke-static {p2, v2, v1}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p2, "&return_url=\""

    .line 327
    invoke-static {p2, v2, v1}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string p2, "&return_url="

    const-string v6, "&"

    .line 328
    invoke-static {p2, v6, v1}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v7, "utf-8"

    invoke-static {p2, v7}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v8, "&callBackUrl="

    .line 329
    invoke-static {v8, v6, v1}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v7}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v6, "call_back_url=\""

    .line 330
    invoke-static {v6, v2, v1}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v6, p2

    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    move-result-object p2

    .line 331
    invoke-static {p2}, Lcom/alipay/sdk/app/PayTask;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 339
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1

    return-object p2

    :cond_1
    if-eqz p1, :cond_3

    if-eqz v0, :cond_2

    .line 347
    invoke-virtual {p1}, Lcom/alipay/sdk/app/PayTask$e;->b()Ljava/lang/String;

    move-result-object p2

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, Lcom/alipay/sdk/app/PayTask$e;->c()Ljava/lang/String;

    move-result-object p2

    .line 348
    :goto_0
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_3

    return-object p2

    :cond_3
    if-eqz p1, :cond_4

    .line 355
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/alipay/sdk/m/o/b;->s()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const-string p1, ""

    return-object p1
.end method

.method public final a(Lcom/alipay/sdk/m/w/a;)V
    .locals 5

    .line 233
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/alipay/sdk/m/o/b;->c(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    .line 236
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "unbindRegisterAppService registerAppServiceConnectSuccess="

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-boolean v2, Lcom/alipay/sdk/app/AlipayApi;->e:Z

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "mspl"

    invoke-static {v2, v0}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "unbindServiceStart"

    const-string v2, "biz"

    const-string v3, "registerApp"

    .line 237
    invoke-static {p1, v2, v3, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 238
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->d:Landroid/content/ServiceConnection;

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/alipay/sdk/app/AlipayApi;->e:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->f:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    .line 239
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 241
    :try_start_0
    sget-object v0, Lcom/alipay/sdk/app/AlipayApi;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    sget-object v4, Lcom/alipay/sdk/app/AlipayApi;->d:Landroid/content/ServiceConnection;

    invoke-virtual {v0, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    const-string v0, "unbindServiceEnd"

    .line 242
    invoke-static {p1, v2, v3, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 244
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    const-string v2, "wr"

    const-string v3, "registerAppUnbindServiceError"

    .line 245
    invoke-static {p1, v2, v3, v0}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    :cond_1
    :goto_0
    sput-object v1, Lcom/alipay/sdk/app/AlipayApi;->f:Ljava/lang/ref/WeakReference;

    const/4 p1, 0x0

    .line 250
    sput-boolean p1, Lcom/alipay/sdk/app/AlipayApi;->e:Z

    .line 251
    sput-object v1, Lcom/alipay/sdk/app/AlipayApi;->d:Landroid/content/ServiceConnection;

    return-void
.end method

.method public final varargs a(ZZLjava/lang/String;Ljava/lang/StringBuilder;Ljava/util/Map;[Ljava/lang/String;)Z
    .locals 5

    .line 285
    array-length v0, p6

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p6, v2

    .line 286
    invoke-interface {p5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/CharSequence;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 289
    :cond_0
    invoke-interface {p5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ljava/lang/String;

    goto :goto_1

    :cond_1
    const-string p5, ""

    .line 293
    :goto_1
    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p6

    if-eqz p6, :cond_2

    if-eqz p2, :cond_4

    return v1

    :cond_2
    const-string p2, "\""

    const-string p6, "=\""

    if-eqz p1, :cond_3

    const-string p1, "&"

    .line 0
    invoke-static {p4, p1, p3, p6, p5}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 299
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 0
    :cond_3
    invoke-static {p4, p3, p6, p5, p2}, Lorg/bouncycastle/asn1/ASN1BMPString$$ExternalSyntheticOutline0;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final b(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)V
    .locals 5

    const-string v0, "requestPreheatPay respData:"

    const-string v1, "requestPreheatPay"

    const-string v2, "mspl"

    .line 9
    invoke-static {v2, v1}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p1}, Lcom/alipay/sdk/m/w/a;->g()Ljava/lang/String;

    move-result-object v1

    const-string v3, "requestPreheatStart"

    const-string v4, "biz"

    invoke-static {p1, v4, v3, v1}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    :try_start_0
    new-instance v1, Lcom/alipay/sdk/m/u/h;

    invoke-direct {v1}, Lcom/alipay/sdk/m/u/h;-><init>()V

    .line 13
    iget-object v3, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, p1, v3, p2}, Lcom/alipay/sdk/m/t/e;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;Ljava/lang/String;)Lcom/alipay/sdk/m/t/b;

    move-result-object p2

    .line 14
    invoke-virtual {p2}, Lcom/alipay/sdk/m/t/b;->c()Lorg/json/JSONObject;

    move-result-object p2

    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lcom/alipay/sdk/m/y/g;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    .line 17
    invoke-static {p2}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    const-string v0, "requestPreheatError"

    .line 18
    invoke-static {p1, v4, v0, p2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    :goto_0
    invoke-virtual {p1}, Lcom/alipay/sdk/m/w/a;->g()Ljava/lang/String;

    move-result-object p2

    const-string v0, "requestPreheatEnd"

    invoke-static {p1, v4, v0, p2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final b(Lcom/alipay/sdk/m/w/a;Lorg/json/JSONObject;)V
    .locals 2

    :try_start_0
    const-string v0, "tid"

    .line 1
    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "client_key"

    .line 2
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 3
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 4
    invoke-static {}, Lcom/alipay/sdk/m/w/b;->c()Lcom/alipay/sdk/m/w/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/alipay/sdk/m/w/b;->b()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/alipay/sdk/m/x/a;->a(Landroid/content/Context;)Lcom/alipay/sdk/m/x/a;

    move-result-object v1

    .line 5
    invoke-virtual {v1, v0, p2}, Lcom/alipay/sdk/m/x/a;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-void

    :catchall_0
    move-exception p2

    const-string v0, "biz"

    const-string v1, "ParserTidClientKeyEx"

    .line 8
    invoke-static {p1, v0, v1, p2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final c(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/alipay/sdk/m/w/a;->a()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/alipay/sdk/m/o/b;->i(Lcom/alipay/sdk/m/w/a;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    return-void

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/alipay/sdk/app/PayTask$d;

    invoke-direct {v1, p0, p1, p2}, Lcom/alipay/sdk/app/PayTask$d;-><init>(Lcom/alipay/sdk/app/PayTask;Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 13
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public dismissLoading()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/app/PayTask;->b:Lcom/alipay/sdk/m/c0/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/alipay/sdk/m/c0/a;->a()V

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/alipay/sdk/app/PayTask;->b:Lcom/alipay/sdk/m/c0/a;

    :cond_0
    return-void
.end method

.method public declared-synchronized fetchOrderInfoFromH5PayUrl(Ljava/lang/String;)Ljava/lang/String;
    .locals 16

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v9, "new_external_info=="

    const-string v10, "trade_no=\""

    const-string v11, "&app_name=\""

    const-string v1, "new_external_info=="

    const-string v2, "_input_charset=\"utf-8\"&ordertoken=\""

    const-string v3, "_input_charset=\"utf-8\"&ordertoken=\""

    move-object/from16 v15, p0

    .line 14
    monitor-enter v15

    .line 1
    :try_start_0
    invoke-static/range {p1 .. p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_11

    .line 2
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v12

    const-string v4, "https://wappaygw.alipay.com/service/rest.htm"

    .line 7
    invoke-virtual {v12, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_0

    const-string v4, "http://wappaygw.alipay.com/service/rest.htm"

    invoke-virtual {v12, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_6

    :cond_0
    :goto_0
    const-string v4, "(http|https)://wappaygw.alipay.com/service/rest.htm\\?"

    const-string v5, ""

    .line 8
    invoke-virtual {v12, v4, v5}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 9
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 10
    invoke-static {v4}, Lcom/alipay/sdk/m/y/q;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "req_data"

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "<request_token>"

    const-string v2, "</request_token>"

    .line 12
    invoke-static {v1, v2, v0}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v8, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    .line 15
    invoke-static {v0}, Lcom/alipay/sdk/app/PayTask;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v15

    return-object v0

    :cond_1
    :try_start_1
    const-string v3, "https://mclient.alipay.com/service/rest.htm"

    .line 18
    invoke-virtual {v12, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const-string v3, "http://mclient.alipay.com/service/rest.htm"

    invoke-virtual {v12, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    const-string v3, "(http|https)://mclient.alipay.com/service/rest.htm\\?"

    const-string v4, ""

    .line 19
    invoke-virtual {v12, v3, v4}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    .line 20
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    .line 21
    invoke-static {v3}, Lcom/alipay/sdk/m/y/q;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const-string v1, "req_data"

    .line 22
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "<request_token>"

    const-string v3, "</request_token>"

    .line 23
    invoke-static {v1, v3, v0}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v0, v8, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    .line 26
    invoke-static {v0}, Lcom/alipay/sdk/app/PayTask;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v15

    return-object v0

    :cond_3
    :try_start_2
    const-string v2, "https://mclient.alipay.com/home/exterfaceAssign.htm"

    .line 33
    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "http://mclient.alipay.com/home/exterfaceAssign.htm"

    invoke-virtual {v12, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_4
    const-string v2, "alipay.wap.create.direct.pay.by.user"

    .line 34
    invoke-virtual {v12, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_5

    const-string v2, "create_forex_trade_wap"

    invoke-virtual {v12, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_5
    const-string v2, "(http|https)://mclient.alipay.com/home/exterfaceAssign.htm\\?"

    const-string v3, ""

    .line 35
    invoke-virtual {v12, v2, v3}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 37
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_6

    .line 38
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "url"

    .line 39
    invoke-virtual {v2, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v0, "bizcontext"

    .line 40
    iget-object v3, v8, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-static {v3}, Lcom/alipay/sdk/app/PayTask;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 41
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v15

    return-object v0

    :cond_6
    :try_start_3
    const-string v1, "^(http|https)://(maliprod\\.alipay\\.com/w/trade_pay\\.do.?|mali\\.alipay\\.com/w/trade_pay\\.do.?|mclient\\.alipay\\.com/w/trade_pay\\.do.?)"

    .line 45
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v1

    .line 47
    invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 56
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v1

    const/4 v13, 0x0

    if-eqz v1, :cond_b

    const-string v1, "?"

    const-string v2, ""

    .line 57
    invoke-static {v1, v2, v0}, Lcom/alipay/sdk/m/y/q;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 58
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_b

    .line 59
    invoke-static {v0}, Lcom/alipay/sdk/m/y/q;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    .line 60
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "trade_no"

    const-string v1, "trade_no"

    const-string v2, "alipay_trade_no"

    .line 62
    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x0

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object v5, v14

    move-object v6, v0

    invoke-virtual/range {v1 .. v7}, Lcom/alipay/sdk/app/PayTask;->a(ZZLjava/lang/String;Ljava/lang/StringBuilder;Ljava/util/Map;[Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    const-string v4, "pay_phase_id"

    const-string v1, "payPhaseId"

    const-string v2, "pay_phase_id"

    const-string v3, "out_relation_id"

    .line 65
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v1, p0

    move-object v5, v14

    move-object v6, v0

    invoke-virtual/range {v1 .. v7}, Lcom/alipay/sdk/app/PayTask;->a(ZZLjava/lang/String;Ljava/lang/StringBuilder;Ljava/util/Map;[Ljava/lang/String;)Z

    const-string v1, "&biz_sub_type=\"TRADE\""

    .line 67
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "&biz_type=\"trade\""

    .line 68
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "app_name"

    .line 70
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 71
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_7

    const-string v2, "cid"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_7

    const-string v1, "ali1688"

    goto :goto_1

    .line 73
    :cond_7
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "sid"

    .line 74
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_8

    const-string v2, "s_id"

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/CharSequence;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    const-string v1, "tb"

    .line 77
    :cond_9
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\""

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "extern_token"

    const-string v1, "extern_token"

    const-string v2, "cid"

    const-string v3, "sid"

    const-string v5, "s_id"

    .line 79
    filled-new-array {v1, v2, v3, v5}, [Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x1

    const/4 v3, 0x1

    move-object/from16 v1, p0

    move-object v5, v14

    move-object v6, v0

    invoke-virtual/range {v1 .. v7}, Lcom/alipay/sdk/app/PayTask;->a(ZZLjava/lang/String;Ljava/lang/StringBuilder;Ljava/util/Map;[Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a

    const-string v0, ""
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 81
    monitor-exit v15

    return-object v0

    :cond_a
    :try_start_4
    const-string v4, "appenv"

    const-string v1, "appenv"

    .line 83
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v7

    const/4 v2, 0x1

    const/4 v3, 0x0

    move-object/from16 v1, p0

    move-object v5, v14

    move-object v6, v0

    invoke-virtual/range {v1 .. v7}, Lcom/alipay/sdk/app/PayTask;->a(ZZLjava/lang/String;Ljava/lang/StringBuilder;Ljava/util/Map;[Ljava/lang/String;)Z

    const-string v1, "&pay_channel_id=\"alipay_sdk\""

    .line 84
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    new-instance v1, Lcom/alipay/sdk/app/PayTask$e;

    invoke-direct {v1, v8, v13}, Lcom/alipay/sdk/app/PayTask$e;-><init>(Lcom/alipay/sdk/app/PayTask;Lcom/alipay/sdk/app/PayTask$a;)V

    const-string v2, "return_url"

    .line 86
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/alipay/sdk/app/PayTask$e;->b(Ljava/lang/String;)V

    const-string v2, "show_url"

    .line 87
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Lcom/alipay/sdk/app/PayTask$e;->c(Ljava/lang/String;)V

    const-string v2, "pay_order_id"

    .line 88
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lcom/alipay/sdk/app/PayTask$e;->a(Ljava/lang/String;)V

    .line 89
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "&bizcontext=\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v8, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    .line 90
    invoke-static {v2}, Lcom/alipay/sdk/app/PayTask;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\""

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    iget-object v2, v8, Lcom/alipay/sdk/app/PayTask;->g:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    monitor-exit v15

    return-object v0

    :cond_b
    :try_start_5
    const-string v0, "https://mclient.alipay.com/cashier/mobilepay.htm"

    .line 99
    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    const-string v0, "http://mclient.alipay.com/cashier/mobilepay.htm"

    invoke-virtual {v12, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_10

    .line 100
    invoke-static {}, Lcom/alipay/sdk/app/EnvUtils;->isSandBox()Z

    move-result v0

    if-eqz v0, :cond_c

    const-string v0, "mobileclientgw.alipaydev.com/cashier/mobilepay.htm"

    invoke-virtual {v12, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto/16 :goto_5

    .line 111
    :cond_c
    invoke-static {}, Lcom/alipay/sdk/m/o/b;->i()Lcom/alipay/sdk/m/o/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/sdk/m/o/b;->j()Z

    move-result v0

    if-eqz v0, :cond_11

    const-string v0, "^https?://(maliprod\\.alipay\\.com|mali\\.alipay\\.com)/batch_payment\\.do\\?"

    .line 112
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    .line 113
    invoke-virtual {v0, v12}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    if-eqz v0, :cond_11

    .line 116
    invoke-static {v12}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "return_url"

    .line 118
    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "show_url"

    .line 119
    invoke-virtual {v0, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "pay_order_id"

    .line 120
    invoke-virtual {v0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "trade_nos"

    .line 123
    invoke-virtual {v0, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "alipay_trade_no"

    .line 124
    invoke-virtual {v0, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v4, v5}, [Ljava/lang/String;

    move-result-object v4

    .line 125
    invoke-static {v4}, Lcom/alipay/sdk/app/PayTask;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "payPhaseId"

    .line 130
    invoke-virtual {v0, v5}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "pay_phase_id"

    .line 131
    invoke-virtual {v0, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "out_relation_id"

    .line 132
    invoke-virtual {v0, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v5, v6, v7}, [Ljava/lang/String;

    move-result-object v5

    .line 133
    invoke-static {v5}, Lcom/alipay/sdk/app/PayTask;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "app_name"

    .line 139
    invoke-virtual {v0, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "cid"

    .line 140
    invoke-virtual {v0, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_d

    const-string v7, "ali1688"

    goto :goto_2

    :cond_d
    const-string v7, ""

    :goto_2
    const-string v9, "sid"

    .line 141
    invoke-virtual {v0, v9}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_e

    const-string v9, "tb"

    goto :goto_3

    :cond_e
    const-string v9, ""

    :goto_3
    const-string v11, "s_id"

    .line 142
    invoke-virtual {v0, v11}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v11

    if-nez v11, :cond_f

    const-string v11, "tb"

    goto :goto_4

    :cond_f
    const-string v11, ""

    :goto_4
    filled-new-array {v6, v7, v9, v11}, [Ljava/lang/String;

    move-result-object v6

    .line 143
    invoke-static {v6}, Lcom/alipay/sdk/app/PayTask;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "extern_token"

    .line 150
    invoke-virtual {v0, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "cid"

    .line 151
    invoke-virtual {v0, v9}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v11, "sid"

    .line 152
    invoke-virtual {v0, v11}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "s_id"

    .line 153
    invoke-virtual {v0, v12}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v7, v9, v11, v12}, [Ljava/lang/String;

    move-result-object v7

    .line 154
    invoke-static {v7}, Lcom/alipay/sdk/app/PayTask;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v9, "appenv"

    .line 161
    invoke-virtual {v0, v9}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    .line 162
    invoke-static {v0}, Lcom/alipay/sdk/app/PayTask;->a([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 165
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_11

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_11

    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-nez v9, :cond_11

    .line 166
    iget-object v9, v8, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    .line 173
    invoke-static {v9}, Lcom/alipay/sdk/app/PayTask;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    .line 174
    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v10, "\"&pay_phase_id=\""

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\"&biz_type=\"trade\"&biz_sub_type=\"TRADE\"&app_name=\""

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\"&extern_token=\""

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "\"&appenv=\""

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\"&pay_channel_id=\"alipay_sdk\"&bizcontext=\""

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\""

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 183
    new-instance v5, Lcom/alipay/sdk/app/PayTask$e;

    invoke-direct {v5, v8, v13}, Lcom/alipay/sdk/app/PayTask$e;-><init>(Lcom/alipay/sdk/app/PayTask;Lcom/alipay/sdk/app/PayTask$a;)V

    .line 184
    invoke-virtual {v5, v1}, Lcom/alipay/sdk/app/PayTask$e;->b(Ljava/lang/String;)V

    .line 185
    invoke-virtual {v5, v2}, Lcom/alipay/sdk/app/PayTask$e;->c(Ljava/lang/String;)V

    .line 186
    invoke-virtual {v5, v3}, Lcom/alipay/sdk/app/PayTask$e;->a(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v5, v4}, Lcom/alipay/sdk/app/PayTask$e;->d(Ljava/lang/String;)V

    .line 188
    iget-object v1, v8, Lcom/alipay/sdk/app/PayTask;->g:Ljava/util/Map;

    invoke-interface {v1, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v15

    return-object v0

    .line 189
    :cond_10
    :goto_5
    :try_start_6
    iget-object v0, v8, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-static {v0}, Lcom/alipay/sdk/app/PayTask;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 190
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v2, "url"

    .line 191
    invoke-virtual {v1, v2, v12}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "bizcontext"

    .line 192
    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    monitor-exit v15

    return-object v0

    .line 256
    :goto_6
    :try_start_7
    invoke-static {v0}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V

    :cond_11
    const-string v0, ""
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 258
    monitor-exit v15

    return-object v0

    :catchall_1
    move-exception v0

    :try_start_8
    monitor-exit v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    throw v0
.end method

.method public declared-synchronized fetchTradeToken()Ljava/lang/String;
    .locals 5

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/alipay/sdk/m/w/a;

    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v3, ""

    const-string v4, "fetchTradeToken"

    invoke-direct {v1, v2, v3, v4}, Lcom/alipay/sdk/m/w/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/alipay/sdk/m/y/l;->a(Lcom/alipay/sdk/m/w/a;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public getVersion()Ljava/lang/String;
    .locals 1

    const-string v0, "15.8.40"

    return-object v0
.end method

.method public declared-synchronized h5Pay(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Z)Lcom/alipay/sdk/util/H5PayResultModel;
    .locals 8

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    new-instance v1, Lcom/alipay/sdk/util/H5PayResultModel;

    invoke-direct {v1}, Lcom/alipay/sdk/util/H5PayResultModel;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3
    :try_start_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p3

    const-string v2, ";"

    .line 4
    invoke-virtual {p3, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p3

    .line 5
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 6
    array-length v3, p3

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_1

    aget-object v6, p3, v5

    const-string v7, "={"

    .line 7
    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v7

    if-ltz v7, :cond_0

    .line 9
    invoke-virtual {v6, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 10
    invoke-virtual {p0, v6, v7}, Lcom/alipay/sdk/app/PayTask;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    const-string p3, "resultStatus"

    .line 13
    invoke-virtual {v2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2

    const-string p3, "resultStatus"

    .line 14
    invoke-virtual {v2, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/String;

    invoke-virtual {v1, p3}, Lcom/alipay/sdk/util/H5PayResultModel;->setResultCode(Ljava/lang/String;)V

    .line 16
    :cond_2
    invoke-virtual {p0, p2, v2}, Lcom/alipay/sdk/app/PayTask;->a(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lcom/alipay/sdk/util/H5PayResultModel;->setReturnUrl(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v1}, Lcom/alipay/sdk/util/H5PayResultModel;->getReturnUrl()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_3

    const-string p2, "biz"

    const-string p3, "H5CbUrlEmpty"

    const-string v2, ""

    .line 19
    invoke-static {p1, p2, p3, v2}, Lcom/alipay/sdk/m/m/a;->b(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    :try_start_2
    const-string p3, "biz"

    const-string v2, "H5CbEx"

    .line 22
    invoke-static {p1, p3, v2, p2}, Lcom/alipay/sdk/m/m/a;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    invoke-static {p2}, Lcom/alipay/sdk/m/y/g;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_3
    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public declared-synchronized pay(Ljava/lang/String;Z)Ljava/lang/String;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/alipay/sdk/m/y/c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->b()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    .line 4
    :cond_0
    :try_start_1
    new-instance v1, Lcom/alipay/sdk/m/w/a;

    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v3, "pay"

    invoke-direct {v1, v2, p1, v3}, Lcom/alipay/sdk/m/w/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v1, p1, p2}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized payInterceptorWithUrl(Ljava/lang/String;ZLcom/alipay/sdk/app/H5PayCallback;)Z
    .locals 3

    const-string v1, "intercepted: "

    move-object v0, p0

    .line 3
    monitor-enter v0

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/alipay/sdk/app/PayTask;->fetchOrderInfoFromH5PayUrl(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 2
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "mspl"

    invoke-static {v2, v1}, Lcom/alipay/sdk/m/y/g;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/alipay/sdk/app/PayTask$b;

    invoke-direct {v2, p0, p1, p2, p3}, Lcom/alipay/sdk/app/PayTask$b;-><init>(Lcom/alipay/sdk/app/PayTask;Ljava/lang/String;ZLcom/alipay/sdk/app/H5PayCallback;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 13
    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 15
    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    xor-int/lit8 p1, p1, 0x1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public declared-synchronized payV2(Ljava/lang/String;Z)Ljava/util/Map;
    .locals 4

    move-object v0, p0

    .line 1
    monitor-enter v0

    :try_start_0
    invoke-static {}, Lcom/alipay/sdk/m/y/c;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lcom/alipay/sdk/m/l/b;->b()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    goto :goto_0

    .line 5
    :cond_0
    new-instance v1, Lcom/alipay/sdk/m/w/a;

    iget-object v2, p0, Lcom/alipay/sdk/app/PayTask;->a:Landroid/app/Activity;

    const-string v3, "payV2"

    invoke-direct {v1, v2, p1, v3}, Lcom/alipay/sdk/m/w/a;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p0, v1, p1, p2}, Lcom/alipay/sdk/app/PayTask;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    move-object p2, v1

    .line 9
    :goto_0
    invoke-static {p2, p1}, Lcom/alipay/sdk/m/y/o;->a(Lcom/alipay/sdk/m/w/a;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public showLoading()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alipay/sdk/app/PayTask;->b:Lcom/alipay/sdk/m/c0/a;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/alipay/sdk/m/c0/a;->d()V

    :cond_0
    return-void
.end method
