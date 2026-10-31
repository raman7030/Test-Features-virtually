.class public final Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Resp;
.super Lcom/tencent/mm/opensdk/modelbase/BaseResp;


# instance fields
.field public extMsg:Ljava/lang/String;


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

    invoke-virtual {p0, p1}, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Resp;->fromBundle(Landroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method public final checkArgs()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final fromBundle(Landroid/os/Bundle;)V
    .locals 1

    .line 0
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->fromBundle(Landroid/os/Bundle;)V

    const-string v0, "_launch_wxminiprogram_ext_msg"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Resp;->extMsg:Ljava/lang/String;

    return-void
.end method

.method public final getType()I
    .locals 1

    const/16 v0, 0x1c

    return v0
.end method

.method public final toBundle(Landroid/os/Bundle;)V
    .locals 2

    .line 0
    invoke-super {p0, p1}, Lcom/tencent/mm/opensdk/modelbase/BaseResp;->toBundle(Landroid/os/Bundle;)V

    const-string v0, "_launch_wxminiprogram_ext_msg"

    iget-object v1, p0, Lcom/tencent/mm/opensdk/modelbiz/WXPreloadMiniProgram$Resp;->extMsg:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
