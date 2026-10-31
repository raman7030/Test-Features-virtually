.class public Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/tencent/mm/opensdk/modelmsg/SendMessageToWX$IWXSceneDataObject;


# static fields
.field public static final LENGTH_LIMIT:I = 0x2800

.field public static final TAG:Ljava/lang/String; = "MicroMsg.SDK.WXStateSceneDataObject"

.field public static final WX_STATE_JUMP_INFO_KEY_IDENTIFIER:Ljava/lang/String; = "_wxapi_scene_data_state_jump_info_identifier"


# instance fields
.field public stateId:Ljava/lang/String;

.field public stateJumpInfo:Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

.field public stateTitle:Ljava/lang/String;

.field public token:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateId:Ljava/lang/String;

    const-string v1, "checkArgs fail, stateId is invalid"

    const/16 v2, 0x2800

    const/4 v3, 0x0

    const-string v4, "MicroMsg.SDK.WXStateSceneDataObject"

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_0

    invoke-static {v4, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateTitle:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_1

    invoke-static {v4, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_1
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->token:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-le v0, v2, :cond_2

    invoke-static {v4, v1}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_2
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateJumpInfo:Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

    if-nez v0, :cond_3

    const-string v0, "checkArgs fail, statsJumpInfo is null"

    invoke-static {v4, v0}, Lcom/tencent/mm/opensdk/utils/Log;->e(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    :cond_3
    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;->checkArgs()Z

    move-result v0

    return v0
.end method

.method public getJumpType()I
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateJumpInfo:Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;->type()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public serialize(Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "_wxapi_scene_data_state_id"

    .line 0
    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateId:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxapi_scene_data_state_title"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateTitle:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "_wxapi_scene_data_state_token"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->token:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateJumpInfo:Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "_wxapi_scene_data_state_jump_info_identifier"

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateJumpInfo:Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

    invoke-interface {v0, p1}, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;->serialize(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method public unserialize(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "_wxapi_scene_data_state_id"

    .line 5
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 8
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateId:Ljava/lang/String;

    const-string v0, "_wxapi_scene_data_state_title"

    .line 13
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateTitle:Ljava/lang/String;

    const-string v0, "_wxapi_scene_data_state_token"

    .line 21
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 24
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->token:Ljava/lang/String;

    const-string v0, "_wxapi_scene_data_state_jump_info_identifier"

    .line 29
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 35
    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v1

    .line 42
    check-cast v1, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

    .line 44
    iput-object v1, p0, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject;->stateJumpInfo:Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;

    .line 47
    invoke-interface {v1, p1}, Lcom/tencent/mm/opensdk/modelmsg/WXStateSceneDataObject$IWXStateJumpInfo;->unserialize(Landroid/os/Bundle;)V
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

    const-string v1, "MicroMsg.SDK.WXStateSceneDataObject"

    invoke-static {p1, v0, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    return-void
.end method
