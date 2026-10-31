.class public Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Req;
.super Lcom/tencent/mm/opensdk/modelbase/BaseReq;


# instance fields
.field public cardArrary:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;-><init>()V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 5

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Req;->cardArrary:Ljava/util/List;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Req;->cardArrary:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/16 v2, 0x28

    if-le v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Req;->cardArrary:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;

    if-eqz v2, :cond_2

    iget-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardId:Ljava/lang/String;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    const/16 v4, 0x400

    if-gt v3, v4, :cond_2

    iget-object v2, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardExtMsg:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-le v2, v4, :cond_1

    :cond_2
    return v1

    :cond_3
    const/4 v0, 0x1

    return v0

    :cond_4
    :goto_0
    return v1
.end method

.method public getType()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public toBundle(Landroid/os/Bundle;)V
    .locals 4

    .line 3
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V

    .line 5
    new-instance v0, Lorg/json/JSONStringer;

    .line 8
    invoke-direct {v0}, Lorg/json/JSONStringer;-><init>()V

    .line 11
    :try_start_0
    invoke-virtual {v0}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    const-string v1, "card_list"

    .line 16
    invoke-virtual {v0, v1}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    .line 19
    invoke-virtual {v0}, Lorg/json/JSONStringer;->array()Lorg/json/JSONStringer;

    .line 21
    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Req;->cardArrary:Ljava/util/List;

    .line 24
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 28
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    .line 37
    check-cast v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;

    .line 40
    invoke-virtual {v0}, Lorg/json/JSONStringer;->object()Lorg/json/JSONStringer;

    const-string v3, "card_id"

    .line 45
    invoke-virtual {v0, v3}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    .line 47
    iget-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardId:Ljava/lang/String;

    .line 50
    invoke-virtual {v0, v3}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    const-string v3, "card_ext"

    .line 55
    invoke-virtual {v0, v3}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    .line 57
    iget-object v2, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardExtMsg:Ljava/lang/String;

    if-nez v2, :cond_0

    const-string v2, ""

    .line 67
    :cond_0
    invoke-virtual {v0, v2}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    .line 70
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    .line 77
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Req.toBundle exception:"

    .line 85
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v3, "MicroMsg.AddCardToWXCardPackage"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :goto_1
    const-string v1, "_wxapi_add_card_to_wx_card_list"

    invoke-virtual {v0}, Lorg/json/JSONStringer;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
