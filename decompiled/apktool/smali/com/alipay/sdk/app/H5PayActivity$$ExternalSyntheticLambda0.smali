.class public final synthetic Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "H5PayActivity"

# interfaces
.implements Ll/ۨ᩵᩷;
.implements Ll/ܶۖ;
.implements Ll/ܽۨ;


# instance fields
.field public final synthetic f$0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onApplyWindowInsets(Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    invoke-static {v0, p1, p2}, Lcom/alipay/sdk/app/H5PayActivity;->a(Landroid/view/View;Landroid/view/View;Ll/᩸ܰ;)Ll/᩸ܰ;

    move-result-object p1

    return-object p1
.end method

.method public synthetic onCanceled()V
    .locals 0

    return-void
.end method

.method public onGetPath(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 6

    .line 2
    iget-object v0, p0, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Object;

    .line 4
    check-cast v0, Ll/֡ܳܿ;

    .line 6
    sget v1, Ll/֡ܳܿ;->֨ۧ:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    .line 145
    invoke-static {p2, v2}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 146
    sget-object v3, Ll/᩶ۡ᩷;->ۙ:Ll/۫ۤۡ;

    invoke-interface {v3}, Ll/۫ۤۡ;->edit()Ll/۬ۤۡ;

    move-result-object v3

    const-string v4, "tfdp"

    invoke-interface {v3, v4, p2}, Ll/۬ۤۡ;->putString(Ljava/lang/String;Ljava/lang/String;)Ll/۬ۤۡ;

    move-result-object p2

    invoke-interface {p2}, Ll/۬ۤۡ;->apply()V

    const-string p2, "export"

    .line 147
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result p2

    const/4 v3, 0x0

    if-eqz p2, :cond_0

    :try_start_0
    const-string p2, "indices"

    .line 149
    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getIntegerArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p1

    .line 150
    invoke-static {v2, p1}, Ll/۠ܳܿ;->֫(Ll/ܶ᩵ܿ;Ljava/util/ArrayList;)V

    const p1, 0x7f1208d1

    .line 151
    invoke-static {p1}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 546
    invoke-virtual {v0, p1, v3}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void

    .line 156
    :cond_0
    filled-new-array {v1}, [I

    move-result-object p1

    .line 157
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p2

    const v4, 0x7f1205e1

    invoke-virtual {p2, v4}, Ll/᩵ۚۢ;->ۧ(I)V

    aget v1, p1, v1

    new-instance v4, Ll/ۙ֨ܳ;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p1}, Ll/ۙ֨ܳ;-><init>(ILjava/io/Serializable;)V

    const v5, 0x7f030019

    .line 158
    invoke-virtual {p2, v5, v1, v4}, Ll/᩵ۚۢ;->֫(IILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v1, Ll/᩷ܿܿ;

    invoke-direct {v1, v0, v2, p1}, Ll/᩷ܿܿ;-><init>(Ll/֡ܳܿ;Ll/ܶ᩵ܿ;[I)V

    const p1, 0x7f12070a

    .line 159
    invoke-virtual {p2, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    .line 168
    invoke-virtual {p2, p1, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 169
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method

.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lcom/alipay/sdk/app/H5PayActivity$$ExternalSyntheticLambda0;->f$0:Ljava/lang/Object;

    check-cast v0, Ll/᩶᩸ܳ;

    invoke-static {v0, p1}, Ll/᩶᩸ܳ;->֫(Ll/᩶᩸ܳ;Landroid/view/MenuItem;)V

    const/4 p1, 0x1

    return p1
.end method
