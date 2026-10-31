.class public Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$UrlRule;
.super Ljava/lang/Object;


# instance fields
.field public host:Ljava/lang/String;

.field public mustQueryKey:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$UrlRule;->host:Ljava/lang/String;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$UrlRule;->mustQueryKey:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$1;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$UrlRule;-><init>()V

    return-void
.end method
