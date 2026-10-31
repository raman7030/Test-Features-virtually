.class public final synthetic Ll/᩹᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Ll/᩵᩹᩷;


# instance fields
.field public final synthetic ᩸:Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;


# direct methods
.method public synthetic constructor <init>(Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹᩵᩷;->᩸:Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/Intent;I)V
    .locals 1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    if-ne p2, v0, :cond_1

    if-eqz p1, :cond_1

    const-string p2, "path"

    .line 1561
    invoke-virtual {p1, p2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v0, "extra"

    .line 1562
    invoke-virtual {p1, v0}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ᩶᩵;->֫(Ljava/lang/Object;)V

    iget-object v0, p0, Ll/᩹᩵᩷;->᩸:Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;

    invoke-virtual {v0, p1, p2}, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;->onGetPath(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
