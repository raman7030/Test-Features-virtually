.class public final synthetic Ll/᩵֨ۢ;
.super Ljava/lang/Object;
.source "19AV"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 5

    .line 384
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 386
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f120491

    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    const v2, 0x7f12094a

    .line 387
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->֫(I)V

    const v2, 0x7f120189

    const/4 v3, 0x0

    .line 388
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v2, Ll/֡֨ۢ;

    const/4 v4, 0x0

    invoke-direct {v2, v4, v0}, Ll/֡֨ۢ;-><init>(ILjava/lang/Object;)V

    const v4, 0x7f120a99

    .line 389
    invoke-virtual {v1, v4, v2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const-string v2, "Shizuku"

    .line 390
    invoke-virtual {v1, v2, v3}, Ll/᩵ۚۢ;->ۧ(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 391
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 392
    invoke-static {v1}, Ll/ۡܶۡ;->֫(Ll/֡ۚۢ;)V

    .line 393
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v1

    .line 394
    new-instance v2, Ll/ۚ֨ۢ;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v0}, Ll/ۚ֨ۢ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-void
.end method
