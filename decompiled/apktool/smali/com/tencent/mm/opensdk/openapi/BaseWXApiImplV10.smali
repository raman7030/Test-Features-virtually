.class public Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# static fields
.field public static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXApiImplV10"

.field public static wxappPayEntryClassname:Ljava/lang/String;


# instance fields
.field public appId:Ljava/lang/String;

.field public checkSignature:Z

.field public context:Landroid/content/Context;

.field public detached:Z

.field public launchMode:I

.field public securityHelper:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

.field public wxSdkVersion:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;ZI)V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    iput-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    const/4 v0, 0x2

    iput v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchMode:I

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<init>, appId = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", checkSignature = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", launchMode = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    iput p4, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchMode:I

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    :cond_0
    sput-object p1, Lcom/tencent/mm/opensdk/utils/d;->D:Landroid/content/Context;

    new-instance p2, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    invoke-direct {p2, p1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->securityHelper:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    return-void
.end method

.method public static synthetic access$002(Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;I)I
    .locals 0

    .line 0
    iput p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    return p1
.end method

.method public static synthetic access$100(Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;Landroid/os/Bundle;)Z
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->doLaunchApp(Landroid/os/Bundle;)Z

    move-result p0

    return p0
.end method

.method public static synthetic access$200(Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;Lcom/tencent/mm/opensdk/openapi/SendReqCallback;Z)V
    .locals 0

    .line 0
    invoke-direct {p0, p1, p2}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->callbackReq(Lcom/tencent/mm/opensdk/openapi/SendReqCallback;Z)V

    return-void
.end method

.method private callbackReq(Lcom/tencent/mm/opensdk/openapi/SendReqCallback;Z)V
    .locals 0

    if-eqz p1, :cond_0

    .line 0
    invoke-interface {p1, p2}, Lcom/tencent/mm/opensdk/openapi/SendReqCallback;->onSendFinish(Z)V

    :cond_0
    return-void
.end method

.method private checkSumConsistent([B[B)Z
    .locals 4

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    .line 0
    array-length v2, p1

    if-eqz v2, :cond_4

    if-eqz p2, :cond_4

    array-length v2, p2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    array-length v2, p1

    array-length v3, p2

    if-eq v2, v3, :cond_1

    const-string p1, "checkSumConsistent fail, length is different"

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :goto_0
    array-length v2, p1

    if-ge v0, v2, :cond_3

    aget-byte v2, p1, v0

    aget-byte v3, p2, v0

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const-string p1, "checkSumConsistent fail, invalid arguments"

    :goto_2
    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1
.end method

.method private createChatroom(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 9

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/createChatroom"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string p1, "_wxapi_basereq_transaction"

    const-string v3, ""

    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v4, "_wxapi_create_chatroom_group_id"

    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "_wxapi_create_chatroom_chatroom_name"

    invoke-virtual {p2, v5, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "_wxapi_create_chatroom_chatroom_nickname"

    invoke-virtual {p2, v6, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "_wxapi_create_chatroom_ext_msg"

    invoke-virtual {p2, v7, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "_wxapi_basereq_openid"

    invoke-virtual {p2, v8, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    move-object v3, p1

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private doLaunchApp(Landroid/os/Bundle;)Z
    .locals 2

    .line 0
    new-instance v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;

    invoke-direct {v0}, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;-><init>()V

    iput-object p1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->bundle:Landroid/os/Bundle;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "weixin://sendreq?appid="

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->content:Ljava/lang/String;

    const-string p1, "com.tencent.mm"

    iput-object p1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->targetPkgName:Ljava/lang/String;

    const-string p1, "com.tencent.mm.plugin.base.stub.WXEntryActivity"

    iput-object p1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->targetClassName:Ljava/lang/String;

    iget p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchMode:I

    iput p1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->launchMode:I

    :try_start_0
    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->getTokenFromWX(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iput-object p1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->token:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v1, "getTokenFromWX fail, exception = "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/tencent/mm/opensdk/channel/MMessageActV2;->send(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z

    move-result p1

    return p1
.end method

.method private finderShareVideoJumpInfoToString(Lcom/tencent/mm/opensdk/modelbiz/IWXChannelJumpInfo;)Ljava/lang/String;
    .locals 3

    .line 0
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "jumpType"

    invoke-interface {p1}, Lcom/tencent/mm/opensdk/modelbiz/IWXChannelJumpInfo;->type()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    instance-of v1, p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBaseJumpInfo;

    if-eqz v1, :cond_1

    const-string v1, "wording"

    move-object v2, p1

    check-cast v2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBaseJumpInfo;

    iget-object v2, v2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBaseJumpInfo;->wording:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "extra"

    move-object v2, p1

    check-cast v2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBaseJumpInfo;

    iget-object v2, v2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBaseJumpInfo;->extra:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    instance-of v1, p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpMiniProgramInfo;

    if-eqz v1, :cond_0

    const-string v1, "username"

    move-object v2, p1

    check-cast v2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpMiniProgramInfo;

    iget-object v2, v2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpMiniProgramInfo;->username:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "path"

    check-cast p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpMiniProgramInfo;

    iget-object p1, p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpMiniProgramInfo;->path:Ljava/lang/String;

    goto :goto_0

    :cond_0
    instance-of v1, p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpUrlInfo;

    if-eqz v1, :cond_1

    const-string v1, "url"

    check-cast p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpUrlInfo;

    iget-object p1, p1, Lcom/tencent/mm/opensdk/modelbiz/WXChannelJumpUrlInfo;->url:Ljava/lang/String;

    :goto_0
    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const-string p1, ""

    return-object p1
.end method

.method private getTokenFromWX(Landroid/content/Context;)Ljava/lang/String;
    .locals 6

    .line 0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "638067200"

    filled-new-array {p1, v2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getTokenFromWX token is "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_0
    const-string p1, "getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include \'com.tencent.mm\' in a set of <package> elements inside the <queries> element"

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private handleWxInternalRespType(Ljava/lang/String;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z
    .locals 8

    const-string v0, "handleWxInternalRespType, extInfo = "

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    .line 15
    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 19
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const-string v2, "wx_internal_resptype"

    .line 26
    invoke-virtual {p1, v2}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "handleWxInternalRespType, respType = "

    .line 32
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    .line 36
    invoke-virtual {v3, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 40
    invoke-static {v1, v3}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    invoke-static {v2}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p1, "handleWxInternalRespType fail, respType is null"

    .line 51
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v0

    :cond_0
    const-string v3, "subscribemessage"

    .line 61
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-string v4, "openid"

    const/4 v5, 0x1

    const-string v6, "ret"

    if-eqz v3, :cond_2

    .line 72
    :try_start_1
    new-instance v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;

    .line 75
    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;-><init>()V

    .line 78
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    .line 84
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_1

    .line 90
    invoke-static {v3}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v3

    .line 93
    iput v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    .line 96
    :cond_1
    invoke-virtual {p1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 99
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->openId:Ljava/lang/String;

    const-string v3, "template_id"

    .line 105
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 108
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;->templateID:Ljava/lang/String;

    const-string v3, "scene"

    .line 114
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 118
    invoke-static {v3}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v3

    .line 121
    iput v3, v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;->scene:I

    const-string v3, "action"

    .line 126
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 129
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;->action:Ljava/lang/String;

    const-string v3, "reserved"

    .line 135
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 138
    iput-object p1, v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Resp;->reserved:Ljava/lang/String;

    .line 141
    invoke-interface {p2, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v5

    :cond_2
    const-string v3, "invoice_auth_insert"

    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-string v7, "wx_order_id"

    if-eqz v3, :cond_4

    .line 155
    :try_start_2
    new-instance v2, Lcom/tencent/mm/opensdk/modelbiz/WXInvoiceAuthInsert$Resp;

    .line 158
    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelbiz/WXInvoiceAuthInsert$Resp;-><init>()V

    .line 161
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    .line 167
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_3

    .line 173
    invoke-static {v3}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v3

    .line 176
    iput v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    .line 179
    :cond_3
    invoke-virtual {p1, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 182
    iput-object p1, v2, Lcom/tencent/mm/opensdk/modelbiz/WXInvoiceAuthInsert$Resp;->wxOrderId:Ljava/lang/String;

    .line 185
    invoke-interface {p2, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v5

    :cond_4
    const-string v3, "payinsurance"

    .line 191
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 196
    new-instance v2, Lcom/tencent/mm/opensdk/modelbiz/WXPayInsurance$Resp;

    .line 199
    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelbiz/WXPayInsurance$Resp;-><init>()V

    .line 202
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 208
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_5

    .line 214
    invoke-static {v3}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v3

    .line 217
    iput v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    .line 220
    :cond_5
    invoke-virtual {p1, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 223
    iput-object p1, v2, Lcom/tencent/mm/opensdk/modelbiz/WXPayInsurance$Resp;->wxOrderId:Ljava/lang/String;

    .line 226
    invoke-interface {p2, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v5

    :cond_6
    const-string v3, "nontaxpay"

    .line 232
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 237
    new-instance v2, Lcom/tencent/mm/opensdk/modelbiz/WXNontaxPay$Resp;

    .line 240
    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelbiz/WXNontaxPay$Resp;-><init>()V

    .line 243
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_7

    .line 249
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-lez v4, :cond_7

    .line 255
    invoke-static {v3}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v3

    .line 258
    iput v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    .line 261
    :cond_7
    invoke-virtual {p1, v7}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 264
    iput-object p1, v2, Lcom/tencent/mm/opensdk/modelbiz/WXNontaxPay$Resp;->wxOrderId:Ljava/lang/String;

    .line 267
    invoke-interface {p2, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v5

    :cond_8
    const-string v3, "subscribeminiprogrammsg"

    .line 274
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    const-string v3, "5"

    .line 282
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_0

    :cond_9
    const-string p1, "this open sdk version not support the request type"

    .line 292
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 295
    :cond_a
    :goto_0
    new-instance v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Resp;

    .line 298
    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Resp;-><init>()V

    .line 301
    invoke-virtual {p1, v6}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_b

    .line 307
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_b

    .line 313
    invoke-static {v3}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v3

    .line 316
    iput v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    .line 319
    :cond_b
    invoke-virtual {p1, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 322
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->openId:Ljava/lang/String;

    const-string v3, "unionid"

    .line 328
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 331
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Resp;->unionId:Ljava/lang/String;

    const-string v3, "nickname"

    .line 336
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 339
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Resp;->nickname:Ljava/lang/String;

    const-string v3, "errmsg"

    .line 344
    invoke-virtual {p1, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 347
    iput-object p1, v2, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errStr:Ljava/lang/String;

    .line 350
    invoke-interface {p2, v2}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return v5

    :catch_0
    move-exception p1

    .line 353
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "handleWxInternalRespType fail, ex = "

    .line 358
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p2, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :goto_1
    return v0
.end method

.method private joinChatroom(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 8

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/joinChatroom"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string p1, "_wxapi_basereq_transaction"

    const-string v3, ""

    invoke-virtual {p2, p1, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v4, "_wxapi_join_chatroom_group_id"

    invoke-virtual {p2, v4, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "_wxapi_join_chatroom_chatroom_nickname"

    invoke-virtual {p2, v5, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "_wxapi_join_chatroom_ext_msg"

    invoke-virtual {p2, v6, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "_wxapi_basereq_openid"

    invoke-virtual {p2, v7, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    move-object v3, p1

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private launchWXIfNeed()V
    .locals 2

    .line 0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    iget v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchMode:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXUsingPendingIntent()V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->openWXApp()Z

    return-void
.end method

.method private launchWXUsingPendingIntent()V
    .locals 8

    .line 2
    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_4

    .line 7
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->isWXAppInstalled()Z

    move-result v0

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_0

    const-string v0, "openWXApp failed, not installed or signature check failed"

    .line 17
    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    :try_start_0
    const-string v0, "launchWXUsingPendingIntent"

    .line 23
    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "com.tencent.mm"

    .line 34
    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 37
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x17

    if-lt v2, v3, :cond_1

    const/high16 v3, 0xc000000

    goto :goto_0

    :cond_1
    const/high16 v3, 0x8000000

    :goto_0
    const/16 v4, 0x23

    const/4 v5, 0x1

    if-lt v2, v4, :cond_3

    if-eqz v0, :cond_2

    .line 56
    invoke-static {}, Landroid/app/ActivityOptions;->makeBasic()Landroid/app/ActivityOptions;

    move-result-object v2

    .line 60
    invoke-virtual {v2, v5}, Landroid/app/ActivityOptions;->setPendingIntentBackgroundActivityStartMode(I)Landroid/app/ActivityOptions;

    .line 62
    iget-object v4, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    .line 65
    invoke-virtual {v2}, Landroid/app/ActivityOptions;->toBundle()Landroid/os/Bundle;

    move-result-object v2

    .line 69
    invoke-static {v4, v5, v0, v3, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;ILandroid/os/Bundle;)Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_1

    .line 76
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "getLaunchIntentForPackage is null"

    .line 81
    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 82
    throw v0

    .line 84
    :cond_3
    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    .line 87
    invoke-static {v2, v5, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    :goto_1
    move-object v2, v0

    .line 91
    iget-object v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    .line 93
    new-instance v6, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10$3;

    .line 96
    invoke-direct {v6, p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10$3;-><init>(Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;)V

    const/4 v7, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x0

    .line 102
    invoke-virtual/range {v2 .. v7}, Landroid/app/PendingIntent;->send(Landroid/content/Context;ILandroid/content/Intent;Landroid/app/PendingIntent$OnFinished;Landroid/os/Handler;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 105
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "launchWXUsingPendingIntent pendingIntent send failed: "

    .line 110
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->openWXApp()Z

    return-void

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "openWXApp fail, WXMsgImpl has been detached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private sendAddCardToWX(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/addCardToWX"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "_wxapi_add_card_to_wx_card_list"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "_wxapi_basereq_transaction"

    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendChooseCardFromWX(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 12

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string p1, "_wxapi_choose_card_from_wx_card_app_id"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string p1, "_wxapi_choose_card_from_wx_card_location_id"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "_wxapi_choose_card_from_wx_card_sign_type"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p1, "_wxapi_choose_card_from_wx_card_card_sign"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string p1, "_wxapi_choose_card_from_wx_card_time_stamp"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string p1, "_wxapi_choose_card_from_wx_card_nonce_str"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string p1, "_wxapi_choose_card_from_wx_card_card_id"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string p1, "_wxapi_choose_card_from_wx_card_card_type"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string p1, "_wxapi_choose_card_from_wx_card_can_multi_select"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string p1, "_wxapi_basereq_transaction"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderBind(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 8

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderBind"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderBind"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->openId:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v6

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderOpenEvent(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderOpenEvent"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenEvent$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderOpenEvent"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenEvent$Req;->username:Ljava/lang/String;

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenEvent$Req;->eventId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenEvent$Req;->extInfo:Ljava/lang/String;

    filled-new-array {p1, v2, v3, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderOpenFeed(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderOpenFeed"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenFeed$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderOpenFeed"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenFeed$Req;->feedID:Ljava/lang/String;

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenFeed$Req;->nonceID:Ljava/lang/String;

    iget-boolean p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenFeed$Req;->notGetReleatedList:Z

    invoke-static {p2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, v2, v3, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderOpenLive(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderOpenLive"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenLive$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderOpenLive"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenLive$Req;->feedID:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenLive$Req;->nonceID:Ljava/lang/String;

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderOpenProfile(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderOpenProfile"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenProfile$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderOpenProfile"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenProfile$Req;->userName:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderShareVideo(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 8

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderShareVideo"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelShareVideo$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderShareVideo"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelShareVideo$Req;->videoPath:Ljava/lang/String;

    iget-object v6, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelShareVideo$Req;->extData:Ljava/lang/String;

    iget-object p1, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelShareVideo$Req;->jumpInfo:Lcom/tencent/mm/opensdk/modelbiz/IWXChannelJumpInfo;

    invoke-direct {p0, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->finderShareVideoJumpInfoToString(Lcom/tencent/mm/opensdk/modelbiz/IWXChannelJumpInfo;)Ljava/lang/String;

    move-result-object v7

    const-string v4, ""

    const-string v5, ""

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendFinderStartLive(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "sendFinderStartLive"

    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelStartLive$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/finderStartLive"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXChannelStartLive$Req;->liveJsonInfo:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->openId:Ljava/lang/String;

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendGetA8KeyReq(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXGetA8Key$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/getA8Key"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXGetA8Key$Req;->url:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendHandleScanResult(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/handleScanResult"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "_wxapi_scan_qrcode_result"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendInvoiceAuthInsert(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXInvoiceAuthInsert$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p2, Lcom/tencent/mm/opensdk/modelbiz/WXInvoiceAuthInsert$Req;->url:Ljava/lang/String;

    invoke-static {p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "url="

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "2"

    filled-new-array {p2, v2, p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendJumpToOfflinePayReq(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendLaunchWXMiniprogram(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Req;->userName:Ljava/lang/String;

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Req;->path:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget v5, p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Req;->miniprogramType:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Req;->extData:Ljava/lang/String;

    filled-new-array {p1, v2, v3, v4, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendLaunchWXMiniprogramWithToken(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgramWithToken$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgramWithToken$Req;->token:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendNonTaxPay(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXNontaxPay$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p2, Lcom/tencent/mm/opensdk/modelbiz/WXNontaxPay$Req;->url:Ljava/lang/String;

    invoke-static {p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "url="

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "3"

    filled-new-array {p2, v2, p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendOpenBusiLuckyMoney(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 8

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string p1, "_wxapi_open_busi_lucky_money_timeStamp"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "_wxapi_open_busi_lucky_money_nonceStr"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string p1, "_wxapi_open_busi_lucky_money_signType"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string p1, "_wxapi_open_busi_lucky_money_signature"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string p1, "_wxapi_open_busi_lucky_money_package"

    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendOpenBusinessView(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 8

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openBusinessView"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Req;->businessType:Ljava/lang/String;

    iget-object v4, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Req;->query:Ljava/lang/String;

    iget-object v5, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Req;->extInfo:Ljava/lang/String;

    iget-object v6, p2, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->transaction:Ljava/lang/String;

    iget-object v7, p2, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->openId:Ljava/lang/String;

    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendOpenBusinessWebview(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openBusinessWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->queryInfo:Ljava/util/HashMap;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/util/HashMap;->size()I

    move-result p1

    if-lez p1, :cond_0

    new-instance p1, Lorg/json/JSONObject;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->queryInfo:Ljava/util/HashMap;

    invoke-direct {p1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->businessType:I

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {v2, p2, p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private sendOpenCustomerServiceChat(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenCustomerServiceChat$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenCustomerServiceChat$Req;->corpId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXOpenCustomerServiceChat$Req;->url:Ljava/lang/String;

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendOpenRankListReq(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openRankList"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const/4 p1, 0x0

    new-array v4, p1, [Ljava/lang/String;

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendOpenWebview(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "_wxapi_jump_to_webview_url"

    invoke-virtual {p2, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "_wxapi_basereq_transaction"

    invoke-virtual {p2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendPayInSurance(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXPayInsurance$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p2, Lcom/tencent/mm/opensdk/modelbiz/WXPayInsurance$Req;->url:Ljava/lang/String;

    invoke-static {p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "url="

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "4"

    filled-new-array {p2, v2, p1}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendPayReq(Landroid/content/Context;Landroid/os/Bundle;)Z
    .locals 5

    .line 2
    sget-object v0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;

    const-string v1, "com.tencent.mm"

    const-string v2, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_1

    .line 10
    new-instance v0, Lcom/tencent/mm/opensdk/openapi/MMSharedPreferences;

    .line 13
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/openapi/MMSharedPreferences;-><init>(Landroid/content/Context;)V

    const-string v3, "_wxapp_pay_entry_classname_"

    const/4 v4, 0x0

    .line 19
    invoke-virtual {v0, v3, v4}, Lcom/tencent/mm/opensdk/openapi/MMSharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 22
    sput-object v0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;

    .line 24
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "pay, set wxappPayEntryClassname = "

    .line 29
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    sget-object v3, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;

    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 41
    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    sget-object v0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;

    if-nez v0, :cond_0

    .line 48
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/16 v3, 0x80

    .line 54
    invoke-virtual {v0, v1, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 57
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME"

    .line 62
    invoke-virtual {v0, v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 65
    sput-object v0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 69
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "get from metaData failed : "

    .line 74
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v3, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    :goto_0
    sget-object v0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;

    if-nez v0, :cond_1

    const-string p1, "pay fail, wxappPayEntryClassname is null"

    invoke-static {v2, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;

    invoke-direct {v0}, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;-><init>()V

    iput-object p2, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->bundle:Landroid/os/Bundle;

    iput-object v1, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->targetPkgName:Ljava/lang/String;

    sget-object p2, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxappPayEntryClassname:Ljava/lang/String;

    iput-object p2, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->targetClassName:Ljava/lang/String;

    iget p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchMode:I

    iput p2, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->launchMode:I

    :try_start_1
    invoke-direct {p0, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->getTokenFromWX(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_2

    iput-object p2, v0, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->token:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p2

    const-string v1, "getTokenFromWX fail, exception = "

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    invoke-static {p1, v0}, Lcom/tencent/mm/opensdk/channel/MMessageActV2;->send(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z

    move-result p1

    return p1
.end method

.method private sendPreloadWXMiniProgramEnvironment(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgramEnvironment$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgramEnvironment$Req;->extData:Ljava/lang/String;

    filled-new-array {p1, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendPreloadWXMiniprogram(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Req;->userName:Ljava/lang/String;

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Req;->path:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    iget v5, p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Req;->miniprogramType:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Req;->extData:Ljava/lang/String;

    filled-new-array {p1, v2, v3, v4, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendQRCodePayReq(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXQRCodePay$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/QRCodePay"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget-object v2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXQRCodePay$Req;->codeContent:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/WXQRCodePay$Req;->extraMsg:Ljava/lang/String;

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendSubscribeMessage(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    iget v2, p2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Req;->scene:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Req;->templateID:Ljava/lang/String;

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMessage$Req;->reserved:Ljava/lang/String;

    const-string v4, "1"

    filled-new-array {p1, v4, v2, v3, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendSubscribeMiniProgramMsg(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const-string v2, "5"

    iget-object p2, p2, Lcom/tencent/mm/opensdk/modelbiz/SubscribeMiniProgramMsg$Req;->miniProgramAppId:Ljava/lang/String;

    filled-new-array {p1, v2, p2}, [Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private sendToWxaRedirectingPage(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 6

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->launchWXIfNeed()V

    check-cast p2, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchWxaRedirectingPage$Req;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string p1, "content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-virtual {p1, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    invoke-virtual {p2}, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchWxaRedirectingPage$Req;->toArray()[Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-array p2, v3, [Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, [Ljava/lang/String;

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public detach()V
    .locals 2

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    const-string v1, "detach"

    .line 0
    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    return-void
.end method

.method public getWXAppSupportAPI()I
    .locals 5

    .line 2
    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_2

    .line 7
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->isWXAppInstalled()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_0

    const-string v0, "open wx app failed, not installed or signature check failed"

    .line 18
    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 21
    :cond_0
    iput v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    .line 23
    :try_start_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    .line 26
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v3, "com.tencent.mm"

    const/16 v4, 0x80

    .line 34
    invoke-virtual {v0, v3, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    .line 37
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    const-string v3, "com.tencent.mm.BuildInfo.OPEN_SDK_VERSION"

    .line 42
    invoke-virtual {v0, v3, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 45
    iput v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    .line 47
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "OPEN_SDK_VERSION = "

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    iget v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 64
    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    .line 68
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "get from metaData failed : "

    .line 73
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :goto_0
    iget v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    invoke-static {}, Lcom/tencent/mm/opensdk/utils/d;->b()Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v1

    new-instance v3, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10$1;

    invoke-direct {v3, p0, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10$1;-><init>(Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v1, v3}, Ljava/util/concurrent/AbstractExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :try_start_1
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v3, 0x3e8

    invoke-virtual {v0, v3, v4, v1}, Ljava/util/concurrent/CountDownLatch;->await(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "wxSdkVersion = "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->wxSdkVersion:I

    return v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "getWXAppSupportAPI fail, WXMsgImpl has been detached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public handleIntent(Landroid/content/Intent;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z
    .locals 7

    const-string v0, "openbusinesswebview"

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "com.tencent.mm.openapi.token"

    .line 10
    invoke-static {p1, v3}, Lcom/tencent/mm/opensdk/openapi/WXApiImplComm;->isIntentFromWx(Landroid/content/Intent;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    const-string p1, "handleIntent fail, intent not from weixin msg"

    .line 18
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 24
    :cond_0
    iget-boolean v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v3, :cond_9

    const-string v3, "_mmessage_content"

    .line 31
    invoke-virtual {p1, v3}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "_mmessage_sdkVersion"

    .line 37
    invoke-virtual {p1, v4, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v4

    const-string v5, "_mmessage_appPackage"

    .line 43
    invoke-virtual {p1, v5}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_8

    .line 49
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_1

    goto/16 :goto_2

    :cond_1
    const-string v6, "_mmessage_checksum"

    .line 59
    invoke-virtual {p1, v6}, Landroid/content/Intent;->getByteArrayExtra(Ljava/lang/String;)[B

    move-result-object v6

    .line 63
    invoke-static {v3, v4, v5}, Lcom/tencent/mm/opensdk/channel/a/b;->a(Ljava/lang/String;ILjava/lang/String;)[B

    move-result-object v3

    .line 67
    invoke-direct {p0, v6, v3}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSumConsistent([B[B)Z

    move-result v3

    if-nez v3, :cond_2

    const-string p1, "checksum fail"

    .line 75
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_2
    const-string v3, "_wxapi_command_type"

    .line 81
    invoke-virtual {p1, v3, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v3

    const-string v4, "handleIntent, cmd = "

    .line 87
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    .line 91
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 95
    invoke-static {v1, v4}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x1

    packed-switch v3, :pswitch_data_0

    :pswitch_0
    const-string p1, "unknown cmd = "

    goto/16 :goto_1

    .line 117
    :pswitch_1
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXGetA8Key$Resp;

    .line 120
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 124
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXGetA8Key$Resp;-><init>(Landroid/os/Bundle;)V

    .line 127
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 130
    :pswitch_2
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBind$Resp;

    .line 133
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 137
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelBind$Resp;-><init>(Landroid/os/Bundle;)V

    .line 140
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 143
    :pswitch_3
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenEvent$Resp;

    .line 146
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 150
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenEvent$Resp;-><init>(Landroid/os/Bundle;)V

    .line 153
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 156
    :pswitch_4
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelStartLive$Resp;

    .line 159
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 163
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelStartLive$Resp;-><init>(Landroid/os/Bundle;)V

    .line 166
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 169
    :pswitch_5
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXQRCodePay$Resp;

    .line 172
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 176
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXQRCodePay$Resp;-><init>(Landroid/os/Bundle;)V

    .line 179
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 182
    :pswitch_6
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenCustomerServiceChat$Resp;

    .line 185
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 189
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXOpenCustomerServiceChat$Resp;-><init>(Landroid/os/Bundle;)V

    .line 192
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 195
    :pswitch_7
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenFeed$Resp;

    .line 198
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 202
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenFeed$Resp;-><init>(Landroid/os/Bundle;)V

    .line 205
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 208
    :pswitch_8
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenLive$Resp;

    .line 211
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 215
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenLive$Resp;-><init>(Landroid/os/Bundle;)V

    .line 218
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 221
    :pswitch_9
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenProfile$Resp;

    .line 224
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 228
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelOpenProfile$Resp;-><init>(Landroid/os/Bundle;)V

    .line 231
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 234
    :pswitch_a
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXChannelShareVideo$Resp;

    .line 237
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 241
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXChannelShareVideo$Resp;-><init>(Landroid/os/Bundle;)V

    .line 244
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 247
    :pswitch_b
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgramEnvironment$Resp;

    .line 250
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 254
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgramEnvironment$Resp;-><init>(Landroid/os/Bundle;)V

    .line 257
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 260
    :pswitch_c
    new-instance v0, Lcom/tencent/mm/opensdk/modelmsg/SendTdiAuth$Resp;

    .line 263
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 267
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/SendTdiAuth$Resp;-><init>(Landroid/os/Bundle;)V

    .line 270
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 273
    :pswitch_d
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchWxaRedirectingPage$Resp;

    .line 276
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 280
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchWxaRedirectingPage$Resp;-><init>(Landroid/os/Bundle;)V

    .line 283
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 286
    :pswitch_e
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgramWithToken$Resp;

    .line 289
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 293
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgramWithToken$Resp;-><init>(Landroid/os/Bundle;)V

    .line 296
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 299
    :pswitch_f
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Resp;

    .line 302
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 306
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Resp;-><init>(Landroid/os/Bundle;)V

    .line 309
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 312
    :pswitch_10
    new-instance v0, Lcom/tencent/mm/opensdk/modelpay/WXJointPay$JointPayResp;

    .line 315
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 319
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelpay/WXJointPay$JointPayResp;-><init>(Landroid/os/Bundle;)V

    .line 322
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 325
    :pswitch_11
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Resp;

    .line 328
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 332
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessView$Resp;-><init>(Landroid/os/Bundle;)V

    .line 335
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 338
    :pswitch_12
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;

    .line 341
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 345
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;-><init>(Landroid/os/Bundle;)V

    .line 348
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 351
    :pswitch_13
    new-instance v0, Lcom/tencent/mm/opensdk/modelpay/JumpToOfflinePay$Resp;

    .line 354
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 358
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelpay/JumpToOfflinePay$Resp;-><init>(Landroid/os/Bundle;)V

    .line 361
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 364
    :pswitch_14
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Resp;

    .line 367
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 371
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXLaunchMiniProgram$Resp;-><init>(Landroid/os/Bundle;)V

    .line 374
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 377
    :pswitch_15
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/HandleScanResult$Resp;

    .line 380
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 384
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/HandleScanResult$Resp;-><init>(Landroid/os/Bundle;)V

    .line 387
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 390
    :pswitch_16
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/ChooseCardFromWXCardPackage$Resp;

    .line 393
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 397
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/ChooseCardFromWXCardPackage$Resp;-><init>(Landroid/os/Bundle;)V

    .line 400
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 403
    :pswitch_17
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/JoinChatroom$Resp;

    .line 406
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 410
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/JoinChatroom$Resp;-><init>(Landroid/os/Bundle;)V

    .line 413
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 416
    :pswitch_18
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/CreateChatroom$Resp;

    .line 419
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 423
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/CreateChatroom$Resp;-><init>(Landroid/os/Bundle;)V

    .line 426
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 429
    :pswitch_19
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/OpenWebview$Resp;

    .line 432
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 436
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/OpenWebview$Resp;-><init>(Landroid/os/Bundle;)V

    .line 439
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 442
    :pswitch_1a
    new-instance v0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;

    .line 445
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 449
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;-><init>(Landroid/os/Bundle;)V

    .line 452
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 455
    :pswitch_1b
    new-instance v0, Lcom/tencent/mm/opensdk/modelmsg/LaunchFromWX$Req;

    .line 458
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 462
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/LaunchFromWX$Req;-><init>(Landroid/os/Bundle;)V

    .line 465
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V

    return v4

    .line 468
    :pswitch_1c
    new-instance v0, Lcom/tencent/mm/opensdk/modelpay/PayResp;

    .line 471
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 475
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelpay/PayResp;-><init>(Landroid/os/Bundle;)V

    .line 478
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 481
    :pswitch_1d
    new-instance v3, Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;

    .line 484
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 488
    invoke-direct {v3, p1}, Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;-><init>(Landroid/os/Bundle;)V

    .line 490
    iget-object p1, v3, Lcom/tencent/mm/opensdk/modelmsg/ShowMessageFromWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    .line 492
    iget-object p1, p1, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->messageExt:Ljava/lang/String;

    if-eqz p1, :cond_3

    const-string v5, "wx_internal_resptype"

    .line 500
    invoke-virtual {p1, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    .line 506
    invoke-direct {p0, p1, p2}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->handleWxInternalRespType(Ljava/lang/String;Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;)Z

    move-result p1

    const-string p2, "handleIntent, extInfo contains wx_internal_resptype, ret = "

    .line 512
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object v0

    .line 516
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 520
    invoke-static {v1, p2}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return p1

    :cond_3
    if-eqz p1, :cond_7

    .line 526
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v5, :cond_7

    .line 532
    :try_start_1
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v5

    if-eqz v5, :cond_6

    .line 538
    invoke-virtual {v5}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v6

    .line 542
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 547
    new-instance p1, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;

    .line 550
    invoke-direct {p1}, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;-><init>()V

    const-string v0, "ret"

    .line 556
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 562
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_4

    .line 568
    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v0

    .line 571
    iput v0, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errCode:I

    :cond_4
    const-string v0, "resultInfo"

    .line 580
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 583
    iput-object v0, p1, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;->resultInfo:Ljava/lang/String;

    const-string v0, "errmsg"

    .line 588
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 591
    iput-object v0, p1, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->errStr:Ljava/lang/String;

    const-string v0, "type"

    .line 597
    invoke-virtual {v5, v0}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 603
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_5

    .line 609
    invoke-static {v0}, Lcom/tencent/mm/opensdk/utils/d;->c(Ljava/lang/String;)I

    move-result v0

    .line 612
    iput v0, p1, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Resp;->businessType:I

    .line 615
    :cond_5
    invoke-interface {p2, p1}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    :cond_6
    const-string v0, "not openbusinesswebview %"

    .line 621
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 625
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 628
    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "parse fail, ex = "

    .line 633
    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 636
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    .line 640
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 643
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 647
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 650
    :cond_7
    :goto_0
    invoke-interface {p2, v3}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V

    return v4

    .line 653
    :pswitch_1e
    new-instance v0, Lcom/tencent/mm/opensdk/modelmsg/GetMessageFromWX$Req;

    .line 656
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 660
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/GetMessageFromWX$Req;-><init>(Landroid/os/Bundle;)V

    .line 663
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)V

    return v4

    .line 666
    :pswitch_1f
    new-instance v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Resp;

    .line 669
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 673
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Resp;-><init>(Landroid/os/Bundle;)V

    .line 676
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 679
    :pswitch_20
    new-instance v0, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;

    .line 682
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    .line 686
    invoke-direct {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/SendAuth$Resp;-><init>(Landroid/os/Bundle;)V

    .line 689
    invoke-interface {p2, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPIEventHandler;->onResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)V

    return v4

    .line 105
    :goto_1
    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    .line 109
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 113
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_8
    :goto_2
    const-string p1, "invalid argument"

    .line 695
    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    .line 698
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "handleIntent fail, WXMsgImpl has been detached"

    .line 703
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 704
    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    move-exception p1

    .line 706
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "handleIntent fail, ex = "

    .line 711
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, p2, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :goto_3
    return v2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_0
        :pswitch_0
        :pswitch_1a
        :pswitch_0
        :pswitch_0
        :pswitch_19
        :pswitch_0
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_0
        :pswitch_14
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public isWXAppInstalled()Z
    .locals 5

    const-string v0, "MicroMsg.SDK.WXApiImplV10"

    .line 0
    iget-boolean v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v3, "com.tencent.mm"

    const/16 v4, 0x40

    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "isWXAppInstalled packageInfo is null"

    invoke-static {v0, v2}, Lcom/tencent/mm/opensdk/utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_0
    iget-object v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    iget-object v2, v2, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    iget-boolean v4, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    invoke-static {v3, v2, v4}, Lcom/tencent/mm/opensdk/openapi/WXApiImplComm;->validateAppSignature(Landroid/content/Context;[Landroid/content/pm/Signature;Z)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "isWXAppInstalled ex:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/tencent/mm/opensdk/utils/Log;->w(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "isWXAppInstalled fail, WXMsgImpl has been detached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public openWXApp()Z
    .locals 5

    .line 2
    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->isWXAppInstalled()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_0

    const-string v0, "open wx app failed, not installed or signature check failed"

    .line 18
    invoke-static {v2, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    .line 21
    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    .line 24
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    const-string v4, "com.tencent.mm"

    .line 30
    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v3

    .line 34
    invoke-virtual {v0, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    move-exception v0

    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "startActivity fail, exception = "

    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v3, v2}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    return v1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "openWXApp fail, WXMsgImpl has been detached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public registerApp(Ljava/lang/String;)Z
    .locals 2

    const-wide/16 v0, 0x0

    .line 0
    invoke-virtual {p0, p1, v0, v1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->registerApp(Ljava/lang/String;J)Z

    move-result p1

    return p1
.end method

.method public registerApp(Ljava/lang/String;J)Z
    .locals 4

    .line 0
    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    const-string v2, "com.tencent.mm"

    invoke-static {v0, v2, v1}, Lcom/tencent/mm/opensdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_0

    const-string p1, "register app failed for wechat app signature check failed"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "registerApp, appId = "

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_1

    iput-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    :cond_1
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    iput-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "register app "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lcom/tencent/mm/opensdk/channel/a/a$a;

    invoke-direct {p1}, Lcom/tencent/mm/opensdk/channel/a/a$a;-><init>()V

    iput-object v2, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->a:Ljava/lang/String;

    const-string v0, "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER"

    iput-object v0, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->action:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "weixin://registerapp?appid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->content:Ljava/lang/String;

    iput-wide p2, p1, Lcom/tencent/mm/opensdk/channel/a/a$a;->b:J

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-static {p2, p1}, Lcom/tencent/mm/opensdk/channel/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/a/a$a;)Z

    move-result p1

    return p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "registerApp fail, WXMsgImpl has been detached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-virtual {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;Lcom/tencent/mm/opensdk/openapi/SendReqCallback;)Z

    move-result p1

    return p1
.end method

.method public sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;Lcom/tencent/mm/opensdk/openapi/SendReqCallback;)Z
    .locals 9

    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_2d

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    const-string v1, "com.tencent.mm"

    iget-boolean v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    invoke-static {v0, v1, v2}, Lcom/tencent/mm/opensdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string p1, "sendReq failed for wechat app signature check failed"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_0
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v0, v3, :cond_3

    move-object v0, p1

    check-cast v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;

    iget v5, v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    const/4 v6, 0x4

    if-ne v5, v6, :cond_3

    iget-object v5, v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    instance-of v6, v5, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;

    if-eqz v6, :cond_3

    check-cast v5, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;

    iget-object v6, v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    iget-object v7, v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    if-nez v7, :cond_1

    new-instance v7, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;

    invoke-direct {v7}, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;-><init>()V

    iput-object v7, v6, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    :cond_1
    iget-object v6, v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-virtual {v6}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v6

    if-ne v6, v4, :cond_3

    iget-object v6, v5, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateTitle:Ljava/lang/String;

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-gtz v6, :cond_3

    :cond_2
    iget-object v0, v0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    iget-object v0, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    check-cast v0, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;

    iget-object v0, v0, Lcom/tencent/mm/opensdk/modelmsg/WXTextObject;->text:Ljava/lang/String;

    iput-object v0, v5, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateTitle:Ljava/lang/String;

    :cond_3
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->checkArgs()Z

    move-result v0

    if-nez v0, :cond_4

    const-string p1, "sendReq checkArgs fail"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v5, "sendReq, req type = "

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V

    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/4 v6, 0x5

    if-eq v5, v6, :cond_2c

    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x1b

    if-ne v5, v6, :cond_5

    goto/16 :goto_1

    :cond_5
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x9

    if-ne v5, v6, :cond_6

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendAddCardToWX(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_6
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x10

    if-ne v5, v6, :cond_7

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendChooseCardFromWX(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_7
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0xb

    if-ne v5, v6, :cond_8

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendOpenRankListReq(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_8
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0xc

    if-ne v5, v6, :cond_9

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendOpenWebview(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_9
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x19

    if-ne v5, v6, :cond_a

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendOpenBusinessWebview(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_a
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0xd

    if-ne v5, v6, :cond_b

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendOpenBusiLuckyMoney(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_b
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0xe

    if-ne v5, v6, :cond_c

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->createChatroom(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_c
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0xf

    if-ne v5, v6, :cond_d

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->joinChatroom(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_d
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x11

    if-ne v5, v6, :cond_e

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendHandleScanResult(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_e
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x12

    if-ne v5, v6, :cond_f

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendSubscribeMessage(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_f
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x1c

    if-ne v5, v6, :cond_10

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendPreloadWXMiniprogram(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_10
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x1d

    if-ne v5, v6, :cond_11

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendLaunchWXMiniprogramWithToken(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_11
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x17

    if-ne v5, v6, :cond_12

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendSubscribeMiniProgramMsg(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_12
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x13

    if-ne v5, v6, :cond_13

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendLaunchWXMiniprogram(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_13
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x20

    if-ne v5, v6, :cond_14

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendPreloadWXMiniProgramEnvironment(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_14
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x1e

    if-ne v5, v6, :cond_15

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendToWxaRedirectingPage(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_15
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x1a

    if-ne v5, v6, :cond_16

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendOpenBusinessView(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_16
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x21

    if-ne v5, v6, :cond_17

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderShareVideo(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_17
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x27

    if-ne v5, v6, :cond_18

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderStartLive(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_18
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x22

    if-ne v5, v6, :cond_19

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderOpenProfile(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_19
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x23

    if-ne v5, v6, :cond_1a

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderOpenLive(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_1a
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x24

    if-ne v5, v6, :cond_1b

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderOpenFeed(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_1b
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x29

    if-ne v5, v6, :cond_1c

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderOpenEvent(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_1c
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x2a

    if-ne v5, v6, :cond_1d

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendFinderBind(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_1d
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x25

    if-ne v5, v6, :cond_1e

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendOpenCustomerServiceChat(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_1e
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x26

    if-ne v5, v6, :cond_1f

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendQRCodePayReq(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_1f
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x14

    if-ne v5, v6, :cond_20

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendInvoiceAuthInsert(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_20
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x15

    if-ne v5, v6, :cond_21

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendNonTaxPay(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_21
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x16

    if-ne v5, v6, :cond_22

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendPayInSurance(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_22
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x18

    if-ne v5, v6, :cond_23

    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendJumpToOfflinePayReq(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_23
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    const/16 v6, 0x2b

    if-ne v5, v6, :cond_24

    iget-object p2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendGetA8KeyReq(Landroid/content/Context;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    move-result p1

    return p1

    :cond_24
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->getType()I

    move-result v5

    if-ne v5, v3, :cond_28

    move-object v3, p1

    check-cast v3, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;

    iget-object v5, v3, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-virtual {v5}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v5

    invoke-static {v5}, Lcom/tencent/mm/opensdk/utils/d;->a(I)Z

    move-result v5

    if-eqz v5, :cond_28

    iget-object v5, v3, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    iget-object v5, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    check-cast v5, Lcom/tencent/mm/opensdk/modelmsg/WXMiniProgramObject;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMiniProgramObject;->userName:Ljava/lang/String;

    const-string v8, "@app"

    .line 0
    invoke-static {v6, v7, v8}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    iput-object v6, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMiniProgramObject;->userName:Ljava/lang/String;

    iget-object v6, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMiniProgramObject;->path:Ljava/lang/String;

    invoke-static {v6}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_26

    const-string v7, "\\?"

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    if-le v7, v4, :cond_25

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v8, v6, v2

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".html?"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-object v6, v6, v4

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    goto :goto_0

    :cond_25
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    aget-object v6, v6, v2

    const-string v8, ".html"

    invoke-static {v7, v6, v8}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :goto_0
    iput-object v6, v5, Lcom/tencent/mm/opensdk/modelmsg/WXMiniProgramObject;->path:Ljava/lang/String;

    :cond_26
    iget v5, v3, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    const/4 v6, 0x3

    if-eq v5, v6, :cond_27

    if-eq v5, v4, :cond_27

    iput v2, v3, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    :cond_27
    invoke-virtual {p1, v0}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V

    :cond_28
    iget-object v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->securityHelper:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iget-object v5, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    invoke-virtual {v3, v5, p1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->extractMayNeedDoSecurityCheckUrl(Ljava/lang/String;Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/tencent/mm/opensdk/utils/d;->b(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2b

    iget-object v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->securityHelper:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iget-object v5, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    new-instance v6, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10$2;

    invoke-direct {v6, p0, v0, p2}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10$2;-><init>(Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;Landroid/os/Bundle;Lcom/tencent/mm/opensdk/openapi/SendReqCallback;)V

    const-string v7, "638067200"

    invoke-virtual {v3, v5, v7, p1, v6}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;->doExtraSecurityCheck(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecurityCheck;)I

    move-result p1

    if-nez p1, :cond_29

    const-string p1, "WXAPiSecurityHelper, extra check pass, doLaunchApp"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->doLaunchApp(Landroid/os/Bundle;)Z

    move-result p1

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->callbackReq(Lcom/tencent/mm/opensdk/openapi/SendReqCallback;Z)V

    return p1

    :cond_29
    if-ne p1, v4, :cond_2a

    const-string p1, "WXAPiSecurityHelper, extra check fail, return"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    invoke-direct {p0, p2, v2}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->callbackReq(Lcom/tencent/mm/opensdk/openapi/SendReqCallback;Z)V

    return v2

    :cond_2a
    const-string p1, "WXAPiSecurityHelper, hold on request, extra check need to do next step"

    invoke-static {v1, p1}, Lcom/tencent/mm/opensdk/utils/Log;->i(Ljava/lang/String;Ljava/lang/String;)V

    return v4

    :cond_2b
    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->doLaunchApp(Landroid/os/Bundle;)Z

    move-result p1

    invoke-direct {p0, p2, p1}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->callbackReq(Lcom/tencent/mm/opensdk/openapi/SendReqCallback;Z)V

    return p1

    :cond_2c
    :goto_1
    iget-object p1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, p1, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->sendPayReq(Landroid/content/Context;Landroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_2d
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "sendReq fail, WXMsgImpl has been detached"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public sendResp(Lcom/tencent/mm/opensdk/modelbase/BaseResp;)Z
    .locals 4

    .line 0
    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    const-string v2, "com.tencent.mm"

    invoke-static {v0, v2, v1}, Lcom/tencent/mm/opensdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    const/4 v1, 0x0

    const-string v3, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_0

    const-string p1, "sendResp failed for wechat app signature check failed"

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->checkArgs()Z

    move-result v0

    if-nez v0, :cond_1

    const-string p1, "sendResp checkArgs fail"

    :goto_0
    invoke-static {v3, p1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v1

    :cond_1
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {p1, v0}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->toBundle(Landroid/os/Bundle;)V

    new-instance p1, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;

    invoke-direct {p1}, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;-><init>()V

    iput-object v0, p1, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->bundle:Landroid/os/Bundle;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "weixin://sendresp?appid="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->content:Ljava/lang/String;

    iput-object v2, p1, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->targetPkgName:Ljava/lang/String;

    const-string v0, "com.tencent.mm.plugin.base.stub.WXEntryActivity"

    iput-object v0, p1, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->targetClassName:Ljava/lang/String;

    :try_start_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->getTokenFromWX(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p1, Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;->token:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "getTokenFromWX fail, exception = "

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-static {v0, p1}, Lcom/tencent/mm/opensdk/channel/MMessageActV2;->send(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/MMessageActV2$Args;)Z

    move-result p1

    return p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "sendResp fail, WXMsgImpl has been detached"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setLogImpl(Lcom/tencent/mm/opensdk/utils/ILog;)V
    .locals 0

    .line 0
    invoke-static {p1}, Lcom/tencent/mm/opensdk/utils/Log;->setLogImpl(Lcom/tencent/mm/opensdk/utils/ILog;)V

    return-void
.end method

.method public unregisterApp()V
    .locals 4

    .line 0
    iget-boolean v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->detached:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    iget-boolean v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->checkSignature:Z

    const-string v2, "com.tencent.mm"

    invoke-static {v0, v2, v1}, Lcom/tencent/mm/opensdk/openapi/WXApiImplComm;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    const-string v1, "MicroMsg.SDK.WXApiImplV10"

    if-nez v0, :cond_0

    const-string v0, "unregister app failed for wechat app signature check failed"

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "unregisterApp, appId = "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "unregister app "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/tencent/mm/opensdk/channel/a/a$a;

    invoke-direct {v0}, Lcom/tencent/mm/opensdk/channel/a/a$a;-><init>()V

    iput-object v2, v0, Lcom/tencent/mm/opensdk/channel/a/a$a;->a:Ljava/lang/String;

    const-string v1, "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER"

    iput-object v1, v0, Lcom/tencent/mm/opensdk/channel/a/a$a;->action:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "weixin://unregisterapp?appid="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->appId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/mm/opensdk/channel/a/a$a;->content:Ljava/lang/String;

    iget-object v1, p0, Lcom/tencent/mm/opensdk/openapi/BaseWXApiImplV10;->context:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/channel/a/a;->a(Landroid/content/Context;Lcom/tencent/mm/opensdk/channel/a/a$a;)Z

    return-void

    :cond_2
    :goto_0
    const-string v0, "unregisterApp fail, appId is empty"

    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "unregisterApp fail, WXMsgImpl has been detached"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
