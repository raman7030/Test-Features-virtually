.class public Lcom/alipay/android/phone/mrpc/core/a/e;
.super Lcom/alipay/android/phone/mrpc/core/a/b;
.source "N673"


# instance fields
.field public c:I

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 0
    invoke-direct {p0, p2, p3}, Lcom/alipay/android/phone/mrpc/core/a/b;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    iput p1, p0, Lcom/alipay/android/phone/mrpc/core/a/e;->c:I

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lcom/alipay/android/phone/mrpc/core/a/e;->d:Ljava/lang/Object;

    return-void
.end method

.method public a()[B
    .locals 6

    const-string v0, ""

    .line 0
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/alipay/android/phone/mrpc/core/a/e;->d:Ljava/lang/Object;

    if-eqz v2, :cond_0

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "extParam"

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/a/e;->d:Ljava/lang/Object;

    invoke-static {v4}, Lcom/alipay/sdk/m/f/a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "operationType"

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/a/b;->a:Ljava/lang/String;

    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "id"

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget v5, p0, Lcom/alipay/android/phone/mrpc/core/a/e;->c:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/alipay/android/phone/mrpc/core/a/b;->b:Ljava/lang/Object;

    invoke-static {v2}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    new-instance v2, Lorg/apache/http/message/BasicNameValuePair;

    const-string v3, "requestData"

    iget-object v4, p0, Lcom/alipay/android/phone/mrpc/core/a/b;->b:Ljava/lang/Object;

    if-nez v4, :cond_1

    const-string v4, "[]"

    goto :goto_0

    :cond_1
    invoke-static {v4}, Lcom/alipay/sdk/m/f/a;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v2, "utf-8"

    invoke-static {v1, v2}, Lorg/apache/http/client/utils/URLEncodedUtils;->format(Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    new-instance v2, Lcom/alipay/android/phone/mrpc/core/RpcException;

    const/16 v3, 0x9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "request  ="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v5, p0, Lcom/alipay/android/phone/mrpc/core/a/b;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ":"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-direct {v2, v3, v0, v1}, Lcom/alipay/android/phone/mrpc/core/RpcException;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method
