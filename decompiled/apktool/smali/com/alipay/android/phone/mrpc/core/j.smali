.class public Lcom/alipay/android/phone/mrpc/core/j;
.super Lcom/alipay/android/phone/mrpc/core/a;
.source "N673"


# instance fields
.field public g:Lcom/alipay/android/phone/mrpc/core/g;


# direct methods
.method public constructor <init>(Lcom/alipay/android/phone/mrpc/core/g;Ljava/lang/reflect/Method;ILjava/lang/String;[BZ)V
    .locals 7

    const-string v5, "application/x-www-form-urlencoded"

    move-object v0, p0

    move-object v1, p2

    move v2, p3

    move-object v3, p4

    move-object v4, p5

    move v6, p6

    .line 0
    invoke-direct/range {v0 .. v6}, Lcom/alipay/android/phone/mrpc/core/a;-><init>(Ljava/lang/reflect/Method;ILjava/lang/String;[BLjava/lang/String;Z)V

    iput-object p1, p0, Lcom/alipay/android/phone/mrpc/core/j;->g:Lcom/alipay/android/phone/mrpc/core/g;

    return-void
.end method

.method private a(I)I
    .locals 0

    packed-switch p1, :pswitch_data_0

    return p1

    :pswitch_0
    const/16 p1, 0x10

    return p1

    :pswitch_1
    const/16 p1, 0xf

    return p1

    :pswitch_2
    const/16 p1, 0x8

    return p1

    :pswitch_3
    const/4 p1, 0x7

    return p1

    :pswitch_4
    const/4 p1, 0x6

    return p1

    :pswitch_5
    const/4 p1, 0x5

    return p1

    :pswitch_6
    const/4 p1, 0x4

    return p1

    :pswitch_7
    const/4 p1, 0x3

    return p1

    :pswitch_8
    const/4 p1, 0x2

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/alipay/android/phone/mrpc/core/o;)V
    .locals 3

    .line 0
    new-instance v0, Lorg/apache/http/message/BasicHeader;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "uuid"

    invoke-direct {v0, v2, v1}, Lorg/apache/http/message/BasicHeader;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/alipay/android/phone/mrpc/core/o;->a(Lorg/apache/http/Header;)V

    iget-object v0, p0, Lcom/alipay/android/phone/mrpc/core/j;->g:Lcom/alipay/android/phone/mrpc/core/g;

    invoke-interface {v0}, Lcom/alipay/android/phone/mrpc/core/g;->c()Lcom/alipay/android/phone/mrpc/core/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/alipay/android/phone/mrpc/core/ab;->b()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/apache/http/Header;

    invoke-virtual {p1, v1}, Lcom/alipay/android/phone/mrpc/core/o;->a(Lorg/apache/http/Header;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private b()Lcom/alipay/android/phone/mrpc/core/ad;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/alipay/android/phone/mrpc/core/j;->g:Lcom/alipay/android/phone/mrpc/core/g;

    invoke-interface {v0}, Lcom/alipay/android/phone/mrpc/core/g;->b()Lcom/alipay/android/phone/mrpc/core/ad;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 6

    const/16 v0, 0xd

    .line 0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, ""

    new-instance v3, Lcom/alipay/android/phone/mrpc/core/o;

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/j;->g:Lcom/alipay/android/phone/mrpc/core/g;

    invoke-interface {v4}, Lcom/alipay/android/phone/mrpc/core/g;->a()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/alipay/android/phone/mrpc/core/o;-><init>(Ljava/lang/String;)V

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/a;->b:[B

    invoke-virtual {v3, v4}, Lcom/alipay/android/phone/mrpc/core/o;->a([B)V

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/a;->e:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/alipay/android/phone/mrpc/core/o;->a(Ljava/lang/String;)V

    iget-boolean v4, p0, Lcom/alipay/android/phone/mrpc/core/a;->f:Z

    invoke-virtual {v3, v4}, Lcom/alipay/android/phone/mrpc/core/o;->a(Z)V

    iget v4, p0, Lcom/alipay/android/phone/mrpc/core/a;->d:I

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "id"

    invoke-virtual {v3, v5, v4}, Lcom/alipay/android/phone/mrpc/core/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/a;->c:Ljava/lang/String;

    const-string v5, "operationType"

    invoke-virtual {v3, v5, v4}, Lcom/alipay/android/phone/mrpc/core/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/j;->g:Lcom/alipay/android/phone/mrpc/core/g;

    invoke-interface {v4}, Lcom/alipay/android/phone/mrpc/core/g;->d()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v4

    const-string v5, "gzip"

    invoke-virtual {v3, v5, v4}, Lcom/alipay/android/phone/mrpc/core/o;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v3}, Lcom/alipay/android/phone/mrpc/core/j;->a(Lcom/alipay/android/phone/mrpc/core/o;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Thread;->getId()J

    invoke-virtual {v3}, Lcom/alipay/android/phone/mrpc/core/o;->toString()Ljava/lang/String;

    :try_start_0
    invoke-direct {p0}, Lcom/alipay/android/phone/mrpc/core/j;->b()Lcom/alipay/android/phone/mrpc/core/ad;

    move-result-object v4

    invoke-interface {v4, v3}, Lcom/alipay/android/phone/mrpc/core/ad;->a(Lcom/alipay/android/phone/mrpc/core/u;)Ljava/util/concurrent/Future;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/alipay/android/phone/mrpc/core/v;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/alipay/android/phone/mrpc/core/v;->b()[B

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v3, Lcom/alipay/android/phone/mrpc/core/RpcException;

    const-string v4, "response is null"

    invoke-direct {v3, v1, v4}, Lcom/alipay/android/phone/mrpc/core/RpcException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    throw v3
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v1

    new-instance v3, Lcom/alipay/android/phone/mrpc/core/RpcException;

    invoke-direct {v3, v0, v2, v1}, Lcom/alipay/android/phone/mrpc/core/RpcException;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v3

    if-eqz v3, :cond_1

    instance-of v4, v3, Lcom/alipay/android/phone/mrpc/core/HttpException;

    if-eqz v4, :cond_1

    check-cast v3, Lcom/alipay/android/phone/mrpc/core/HttpException;

    new-instance v0, Lcom/alipay/android/phone/mrpc/core/RpcException;

    invoke-virtual {v3}, Lcom/alipay/android/phone/mrpc/core/HttpException;->getCode()I

    move-result v1

    invoke-direct {p0, v1}, Lcom/alipay/android/phone/mrpc/core/j;->a(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3}, Lcom/alipay/android/phone/mrpc/core/HttpException;->getMsg()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/alipay/android/phone/mrpc/core/RpcException;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v3, Lcom/alipay/android/phone/mrpc/core/RpcException;

    invoke-direct {v3, v1, v2, v0}, Lcom/alipay/android/phone/mrpc/core/RpcException;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_2
    move-exception v1

    new-instance v3, Lcom/alipay/android/phone/mrpc/core/RpcException;

    invoke-direct {v3, v0, v2, v1}, Lcom/alipay/android/phone/mrpc/core/RpcException;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method
