.class public Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;
.super Lcom/tencent/mm/opensdk/modelbase/BaseReq;


# static fields
.field public static final FAV_CONTENT_LENGTH_LIMIT:I = 0x1900000

.field public static final SCENE_DATA_OBJECT_KEY_IDENTIFIER:Ljava/lang/String; = "_scene_data_object_identifier"

.field public static final TAG:Ljava/lang/String; = "MicroMsg.SDK.SendMessageToWX.Req"

.field public static final WXSceneFavorite:I = 0x2

.field public static final WXSceneSession:I = 0x0

.field public static final WXSceneSpecifiedContact:I = 0x3

.field public static final WXSceneStatus:I = 0x4

.field public static final WXSceneTimeline:I = 0x1


# instance fields
.field public message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

.field public scene:I

.field public sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

.field public userOpenId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->fromBundle(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    const-string v1, "MicroMsg.SDK.SendMessageToWX.Req"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const-string v0, "checkArgs fail ,message is null"

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;->type()I

    move-result v0

    const/4 v3, 0x6

    if-ne v0, v3, :cond_1

    iget v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    const/4 v3, 0x2

    if-ne v0, v3, :cond_1

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    iget-object v0, v0, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->mediaObject:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;

    check-cast v0, Lcom/tencent/mm/opensdk/modelmsg/WXFileObject;

    const/high16 v3, 0x1900000

    invoke-virtual {v0, v3}, Lcom/tencent/mm/opensdk/modelmsg/WXFileObject;->setContentLengthLimit(I)V

    :cond_1
    iget v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    iget-object v4, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->userOpenId:Ljava/lang/String;

    if-nez v4, :cond_2

    const-string v0, "Send specifiedContact userOpenId can not be null."

    goto :goto_0

    :cond_2
    if-ne v0, v3, :cond_3

    iget-object v3, p0, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->openId:Ljava/lang/String;

    if-nez v3, :cond_3

    const-string v0, "Send specifiedContact openid can not be null."

    goto :goto_0

    :cond_3
    const/4 v3, 0x4

    if-ne v0, v3, :cond_7

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    if-nez v0, :cond_4

    const-string v0, "checkArgs fail, sceneDataObject is null"

    :goto_0
    invoke-static {v1, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v2

    :cond_4
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-virtual {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;->checkArgs()Z

    move-result v0

    return v0

    :cond_5
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-virtual {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->checkArgs()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;->checkArgs()Z

    move-result v0

    if-eqz v0, :cond_6

    return v1

    :cond_6
    return v2

    :cond_7
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-virtual {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->checkArgs()Z

    move-result v0

    return v0
.end method

.method public fromBundle(Landroid/os/Bundle;)V
    .locals 3

    .line 3
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->fromBundle(Landroid/os/Bundle;)V

    .line 6
    invoke-static {p1}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$Builder;->fromBundle(Landroid/os/Bundle;)Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    const-string v0, "_wxapi_sendmessagetowx_req_scene"

    .line 14
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 17
    iput v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    const-string v0, "_wxapi_sendmessagetowx_req_use_open_id"

    .line 22
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 25
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->userOpenId:Ljava/lang/String;

    const-string v0, "_scene_data_object_identifier"

    .line 30
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 36
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .line 43
    check-cast v1, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    .line 45
    iput-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    .line 48
    invoke-interface {v1, p1}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;->unserialize(Landroid/os/Bundle;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v1, "get WXSceneDataObject from bundle failed: unknown ident "

    const-string v2, ", ex = "

    .line 0
    invoke-static {v1, v0, v2}, Ll/ۗۧᩳ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "MicroMsg.SDK.SendMessageToWX.Req"

    invoke-static {p1, v0, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public getType()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public toBundle(Landroid/os/Bundle;)V
    .locals 2

    .line 0
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-static {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$Builder;->toBundle(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;)Landroid/os/Bundle;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    const-string v0, "_wxapi_sendmessagetowx_req_scene"

    iget v1, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->scene:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->message:Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;

    invoke-virtual {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;->getType()I

    move-result v0

    const-string v1, "_wxapi_sendmessagetowx_req_media_type"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "_wxapi_sendmessagetowx_req_use_open_id"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->userOpenId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_scene_data_object_identifier"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$Req;->sceneDataObject:Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;

    invoke-interface {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;->serialize(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method
