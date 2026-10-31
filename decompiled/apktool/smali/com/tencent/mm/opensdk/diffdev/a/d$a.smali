.class public final Lcom/tencent/mm/opensdk/diffdev/a/d$a;
.super Ljava/lang/Object;


# instance fields
.field public m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Ljava/lang/String;

.field public q:I

.field public r:Ljava/lang/String;

.field public s:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a([B)Lcom/tencent/mm/opensdk/diffdev/a/d$a;
    .locals 8

    .line 0
    new-instance v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;

    invoke-direct {v0}, Lcom/tencent/mm/opensdk/diffdev/a/d$a;-><init>()V

    const-string v1, "MicroMsg.SDK.GetQRCodeResult"

    if-eqz p0, :cond_6

    array-length v2, p0

    if-nez v2, :cond_0

    goto/16 :goto_5

    :cond_0
    :try_start_0
    new-instance v2, Ljava/lang/String;

    const-string v3, "utf-8"

    invoke-direct {v2, p0, v3}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v2, "errcode"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    const-string v5, "resp errcode = %d"

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v6, v3, v4

    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v3, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v3, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput v2, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->q:I

    const-string v2, "errmsg"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->r:Ljava/lang/String;

    return-object v0

    :cond_1
    const-string v2, "qrcode"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v5, "qrcodebase64"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {v2, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v2

    if-eqz v2, :cond_4

    array-length v5, v2

    if-nez v5, :cond_3

    goto :goto_0

    :cond_3
    sget-object v5, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_OK:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v5, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object v2, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->s:[B

    const-string v2, "uuid"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Ljava/lang/String;

    const-string v2, "appname"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    iput-object p0, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->o:Ljava/lang/String;

    const-string v2, "parse succ, save in memory, uuid = %s, appname = %s, imgBufLength = %d"

    iget-object v5, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->n:Ljava/lang/String;

    iget-object v6, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->s:[B

    array-length v6, v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v7, 0x3

    new-array v7, v7, [Ljava/lang/Object;

    aput-object v5, v7, v4

    aput-object p0, v7, v3

    const/4 p0, 0x2

    aput-object v6, v7, p0

    invoke-static {v2, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_4
    :goto_0
    const-string p0, "parse fail, qrcodeBuf is null"

    :goto_1
    invoke-static {v1, p0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    :goto_2
    const-string p0, "parse fail, qrcodeBase64 is null"

    goto :goto_1

    :goto_3
    sget-object p0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_JsonDecodeErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    iput-object p0, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "parse json fail, ex = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_4

    :catch_1
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "parse fail, build String fail, ex = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_4
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NormalErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    goto :goto_6

    :cond_6
    :goto_5
    const-string p0, "parse fail, buf is null"

    invoke-static {v1, p0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;->WechatAuth_Err_NetworkErr:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    :goto_6
    iput-object p0, v0, Lcom/tencent/mm/opensdk/diffdev/a/d$a;->m:Lcom/tencent/mm/opensdk/diffdev/OAuthErrCode;

    return-object v0
.end method
