.class public final Ll/᩻᩻ۡ;
.super Ll/۟ܶۡ;
.source "08W8"


# instance fields
.field public final synthetic ۜ:I

.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩻:Lcom/tencent/mm/opensdk/openapi/IWXAPI;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;ILcom/tencent/mm/opensdk/openapi/IWXAPI;)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/᩻᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    .line 4
    iput p2, p0, Ll/᩻᩻ۡ;->ۜ:I

    .line 6
    iput-object p3, p0, Ll/᩻᩻ۡ;->᩻:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    .line 95
    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 0

    return-void
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 124
    iget-object v0, p0, Ll/᩻᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 99
    iget-object v0, p0, Ll/᩻᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 3

    .line 103
    sget-object v0, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    iget v0, p0, Ll/᩻᩻ۡ;->ۜ:I

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ll/ۜ᩻ۡ;->֫(II)[Ljava/lang/String;

    move-result-object v0

    .line 104
    new-instance v2, Ll/ۘۢۡ;

    invoke-direct {v2, v1, v0}, Ll/ۘۢۡ;-><init>(ILjava/lang/Object;)V

    sput-object v2, Ll/᩹ᩴۡ;->ܽ:Ljava/lang/Runnable;

    .line 105
    new-instance v1, Lorg/json/JSONObject;

    const/4 v2, 0x0

    aget-object v0, v0, v2

    invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v0, "1"

    .line 106
    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "OK"

    .line 169
    invoke-virtual {v2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 108
    new-instance v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;

    invoke-direct {v0}, Lcom/tencent/mm/opensdk/modelpay/PayReq;-><init>()V

    .line 109
    sget-object v2, Ll/᩹ᩴۡ;->֫:Ll/ۚۡ֫;

    invoke-static {}, Ll/᩹ᩴۡ;->ۧ()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->appId:Ljava/lang/String;

    const-string v2, "1493963962"

    .line 110
    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->partnerId:Ljava/lang/String;

    const-string v2, "2"

    .line 111
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->prepayId:Ljava/lang/String;

    const-string v2, "3"

    .line 112
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->nonceStr:Ljava/lang/String;

    const-string v2, "4"

    .line 113
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->timeStamp:Ljava/lang/String;

    const-string v2, "5"

    .line 114
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->packageValue:Ljava/lang/String;

    const-string v2, "6"

    .line 115
    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/tencent/mm/opensdk/modelpay/PayReq;->sign:Ljava/lang/String;

    .line 116
    iget-object v1, p0, Ll/᩻᩻ۡ;->᩻:Lcom/tencent/mm/opensdk/openapi/IWXAPI;

    invoke-interface {v1, v0}, Lcom/tencent/mm/opensdk/openapi/IWXAPI;->sendReq(Lcom/tencent/mm/opensdk/modelbase/BaseReq;)Z

    :cond_0
    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 128
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
