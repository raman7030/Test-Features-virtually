.class public final Lcom/tencent/mm/opensdk/diffdev/a/f;
.super Landroid/os/AsyncTask;


# instance fields
.field public k:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

.field public n:Ljava/lang/String;

.field public t:I

.field public url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/tencent/mm/opensdk/diffdev/OAuthListener;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->n:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->k:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    const-string p2, "https://long.open.weixin.qq.com/connect/l/qrconnect?f=json&uuid="

    .line 0
    invoke-static {p2, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->url:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    const-string v0, "OpenSdkNoopingTask"

    invoke-virtual {p1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->n:Ljava/lang/String;

    const-string v0, "MicroMsg.SDK.NoopingTask"

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "doInBackground start "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_0
    invoke-virtual {p0}, Landroid/os/AsyncTask;->isCancelled()Z

    move-result p1

    if-nez p1, :cond_7

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->url:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->t:I

    if-nez v1, :cond_2

    const-string v1, ""

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "&last="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->t:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {p1}, Lcom/tencent/mm/opensdk/diffdev/a/e;->a(Ljava/lang/String;)[B

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-static {v3}, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->b([B)Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    move-result-object v3

    iget-object v6, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    invoke-virtual {v6}, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->toString()Ljava/lang/String;

    move-result-object v6

    iget v7, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    sub-long/2addr v4, v1

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v2, v4

    const/4 p1, 0x1

    aput-object v6, v2, p1

    const/4 v5, 0x2

    aput-object v7, v2, v5

    const/4 v6, 0x3

    aput-object v1, v2, v6

    const-string v1, "nooping, url = %s, errCode = %s, uuidStatusCode = %d, time consumed = %d(ms)"

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    sget-object v2, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_OK:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    if-ne v1, v2, :cond_6

    iget p1, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:I

    iput p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->t:I

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->y:Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/a/g;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_3

    iget-object p1, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->k:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    invoke-interface {p1}, Lcom/tencent/mm/opensdk/diffdev/OAuthListener;->onQrcodeScanned()V

    goto :goto_0

    :cond_3
    iget p1, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:I

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->A:Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/a/g;->getCode()I

    move-result v1

    if-eq p1, v1, :cond_1

    iget p1, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:I

    sget-object v1, Lcom/tencent/mm/opensdk/diffdev/a/g;->z:Lcom/tencent/mm/opensdk/diffdev/a/g;

    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/a/g;->getCode()I

    move-result v1

    if-ne p1, v1, :cond_1

    iget-object p1, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->u:Ljava/lang/String;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    return-object v3

    :cond_5
    :goto_2
    const-string p1, "nooping fail, confirm with an empty code!!!"

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object p1, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v3

    :cond_6
    invoke-virtual {v1}, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->toString()Ljava/lang/String;

    move-result-object v1

    iget v2, v3, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v1, v5, v4

    aput-object v2, v5, p1

    const-string p1, "nooping fail, errCode = %s, uuidStatusCode = %d"

    invoke-static {p1, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :cond_7
    const-string p1, "IDiffDevOAuth.stopAuth / detach invoked"

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    invoke-direct {p1}, Lcom/tencent/mm/opensdk/diffdev/a/f$a;-><init>()V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_Auth_Stopped:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    goto :goto_4

    :cond_8
    :goto_3
    const-string p1, "run fail, uuid is null"

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    invoke-direct {p1}, Lcom/tencent/mm/opensdk/diffdev/a/f$a;-><init>()V

    sget-object v0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    :goto_4
    iput-object v0, p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object p1
.end method

.method public final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 2

    .line 0
    check-cast p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;

    iget-object v0, p0, Lcom/tencent/mm/opensdk/diffdev/a/f;->k:Lcom/tencent/mm/opensdk/diffdev/OAuthListener;

    iget-object v1, p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iget-object p1, p1, Lcom/tencent/mm/opensdk/diffdev/a/f$a;->u:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Lcom/tencent/mm/opensdk/diffdev/OAuthListener;->onAuthFinish(Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;Ljava/lang/String;)V

    return-void
.end method
