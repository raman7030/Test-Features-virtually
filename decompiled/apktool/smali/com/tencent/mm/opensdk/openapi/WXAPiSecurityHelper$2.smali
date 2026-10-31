.class public Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

.field public final synthetic val$canPass:Z

.field public final synthetic val$checkCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecurityCheck;


# direct methods
.method public constructor <init>(Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecurityCheck;Z)V
    .locals 0

    .line 0
    iput-object p1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$2;->this$0:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper;

    iput-object p2, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$2;->val$checkCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecurityCheck;

    iput-boolean p3, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$2;->val$canPass:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    const-string v0, "MicroMsg.SDK.WXAPiSecurityHelper"

    const-string v1, "has got result, callback on Main Thread."

    .line 0
    invoke-static {v0, v1}, Lcom/tencent/mm/opensdk/utils/Log;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$2;->val$checkCallback:Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecurityCheck;

    iget-boolean v1, p0, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$2;->val$canPass:Z

    invoke-interface {v0, v1}, Lcom/tencent/mm/opensdk/openapi/WXAPiSecurityHelper$ISecurityCheck;->onCheckFinish(Z)V

    return-void
.end method
