.class public Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;
.super Ljava/lang/Object;


# instance fields
.field public appid:Ljava/lang/String;

.field public inputUrl:Ljava/lang/String;

.field public localRule:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;

.field public reqSessionId:Ljava/lang/String;

.field public version:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->reqSessionId:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->appid:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->inputUrl:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->version:Ljava/lang/String;

    new-instance v0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;-><init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$1;)V

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;->localRule:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PromiseShareRule;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$PassContext;-><init>()V

    return-void
.end method
