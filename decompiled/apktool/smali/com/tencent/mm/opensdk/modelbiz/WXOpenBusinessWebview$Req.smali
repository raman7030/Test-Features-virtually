.class public Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;
.super Lcom/tencent/mm/opensdk/modelbase/BaseReq;


# instance fields
.field public businessType:I

.field public queryInfo:Ljava/util/HashMap;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;-><init>()V

    return-void
.end method


# virtual methods
.method public checkArgs()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public fromBundle(Landroid/os/Bundle;)V
    .locals 2

    .line 0
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->fromBundle(Landroid/os/Bundle;)V

    const-string v0, "_wxapi_open_business_webview_query_info"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getSerializable(Ljava/lang/String;)Ljava/io/Serializable;

    move-result-object v0

    check-cast v0, Ljava/util/HashMap;

    iput-object v0, p0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->queryInfo:Ljava/util/HashMap;

    const-string v0, "_wxapi_open_business_webview_query_type"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->businessType:I

    return-void
.end method

.method public getType()I
    .locals 1

    const/16 v0, 0x19

    return v0
.end method

.method public toBundle(Landroid/os/Bundle;)V
    .locals 2

    .line 0
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseReq;->toBundle(Landroid/os/Bundle;)V

    const-string v0, "_wxapi_open_business_webview_query_info"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->queryInfo:Ljava/util/HashMap;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    const-string v0, "_wxapi_open_business_webview_query_type"

    iget v1, p0, Lcom/tencent/mm/opensdk/modelbiz/WXOpenBusinessWebview$Req;->businessType:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-void
.end method
