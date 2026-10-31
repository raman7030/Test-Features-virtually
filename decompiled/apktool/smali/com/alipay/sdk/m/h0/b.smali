.class public Lcom/alipay/sdk/m/h0/b;
.super Ljava/lang/Object;
.source "N673"


# instance fields
.field public a:Ljava/io/File;

.field public b:Lcom/alipay/sdk/m/l0/a;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/alipay/sdk/m/l0/a;)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    iput-object v0, p0, Lcom/alipay/sdk/m/h0/b;->b:Lcom/alipay/sdk/m/l0/a;

    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    iput-object p2, p0, Lcom/alipay/sdk/m/h0/b;->b:Lcom/alipay/sdk/m/l0/a;

    return-void
.end method

.method public static a(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v1, "type"

    const-string v2, "id"

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "error"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :catch_0
    const-string p0, ""

    return-object p0
.end method

.method public static synthetic a(Lcom/alipay/sdk/m/h0/b;)V
    .locals 0

    .line 0
    invoke-virtual {p0}, Lcom/alipay/sdk/m/h0/b;->a()V

    return-void
.end method

.method public static b()Ljava/lang/String;
    .locals 3

    .line 3
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v0

    .line 10
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "yyyyMMdd"

    .line 16
    invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 19
    invoke-virtual {v1, v0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ".log"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a()V
    .locals 7

    move-object v0, p0

    .line 0
    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v1

    array-length v1, v1

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    invoke-virtual {v2}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v3, :cond_2

    aget-object v6, v2, v5

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {}, Lcom/alipay/sdk/m/h0/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x2

    if-ge v2, v5, :cond_3

    monitor-exit v0

    return-void

    :cond_3
    :try_start_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    sub-int/2addr v2, v5

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    add-int/lit8 v3, v3, -0x1

    :cond_4
    iget-object v5, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lcom/alipay/sdk/m/d0/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/alipay/sdk/m/h0/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iget-object v5, p0, Lcom/alipay/sdk/m/h0/b;->b:Lcom/alipay/sdk/m/l0/a;

    invoke-interface {v5, v2}, Lcom/alipay/sdk/m/l0/a;->logCollect(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    add-int/lit8 v3, v3, -0x1

    :cond_5
    :goto_1
    if-ge v4, v3, :cond_6

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    new-instance v5, Ljava/io/File;

    iget-object v6, p0, Lcom/alipay/sdk/m/h0/b;->a:Ljava/io/File;

    invoke-direct {v5, v6, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->delete()Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_6
    monitor-exit v0

    return-void

    :cond_7
    :goto_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v1
.end method

.method public a(Landroid/content/Context;)V
    .locals 1

    .line 0
    new-instance p1, Ljava/lang/Thread;

    new-instance v0, Lcom/alipay/sdk/m/h0/c;

    invoke-direct {v0, p0}, Lcom/alipay/sdk/m/h0/c;-><init>(Lcom/alipay/sdk/m/h0/b;)V

    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    return-void
.end method
