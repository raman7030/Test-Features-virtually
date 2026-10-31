.class public Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;
.super Lcom/tencent/mm/opensdk/modelbase/BaseResp;


# instance fields
.field public cardArrary:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;-><init>()V

    invoke-virtual {p0, p1}, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;->fromBundle(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;->cardArrary:Ljava/util/List;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return v0
.end method

.method public fromBundle(Landroid/os/Bundle;)V
    .locals 4

    .line 3
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->fromBundle(Landroid/os/Bundle;)V

    .line 5
    iget-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;->cardArrary:Ljava/util/List;

    if-nez v0, :cond_0

    .line 9
    new-instance v0, Ljava/util/LinkedList;

    .line 12
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 14
    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;->cardArrary:Ljava/util/List;

    :cond_0
    const-string v0, "_wxapi_add_card_to_wx_card_list"

    .line 19
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 25
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_1

    .line 30
    :try_start_0
    new-instance v0, Lorg/json/JSONTokener;

    .line 33
    invoke-direct {v0, p1}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 36
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object p1

    .line 39
    check-cast p1, Lorg/json/JSONObject;

    const-string v0, "card_list"

    .line 44
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    .line 49
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 55
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v1

    .line 58
    new-instance v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;

    .line 61
    invoke-direct {v2}, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;-><init>()V

    const-string v3, "card_id"

    .line 66
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 69
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardId:Ljava/lang/String;

    const-string v3, "card_ext"

    .line 74
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 77
    iput-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardExtMsg:Ljava/lang/String;

    const-string v3, "is_succ"

    .line 82
    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    .line 85
    iput v1, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardState:I

    .line 87
    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;->cardArrary:Ljava/util/List;

    .line 90
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "fromBundle exception: "

    .line 101
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "MicroMsg.AddCardToWXCardPackage"

    .line 0
    invoke-static {p1, v0, v1}, Ll/ۡܶ֫;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public getType()I
    .locals 1

    const/16 v0, 0x9

    return v0
.end method

.method public toBundle(Landroid/os/Bundle;)V
    .locals 4

    .line 3
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->toBundle(Landroid/os/Bundle;)V

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
    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$Resp;->cardArrary:Ljava/util/List;

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
    iget-object v3, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardExtMsg:Ljava/lang/String;

    if-nez v3, :cond_0

    const-string v3, ""

    .line 67
    :cond_0
    invoke-virtual {v0, v3}, Lorg/json/JSONStringer;->value(Ljava/lang/Object;)Lorg/json/JSONStringer;

    const-string v3, "is_succ"

    .line 72
    invoke-virtual {v0, v3}, Lorg/json/JSONStringer;->key(Ljava/lang/String;)Lorg/json/JSONStringer;

    .line 74
    iget v2, v2, Lcom/tencent/mm/opensdk/modelbiz/AddCardToWXCardPackage$WXCardItem;->cardState:I

    int-to-long v2, v2

    .line 78
    invoke-virtual {v0, v2, v3}, Lorg/json/JSONStringer;->value(J)Lorg/json/JSONStringer;

    .line 81
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;

    goto :goto_0

    .line 85
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endArray()Lorg/json/JSONStringer;

    .line 88
    invoke-virtual {v0}, Lorg/json/JSONStringer;->endObject()Lorg/json/JSONStringer;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    .line 91
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Resp.toBundle exception:"

    .line 96
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
