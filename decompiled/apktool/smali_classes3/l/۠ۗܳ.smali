.class public final synthetic Ll/۠ۗܳ;
.super Ljava/lang/Object;
.source "X4HD"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:Ll/۬ۗܳ;

.field public final synthetic ᩸:Ll/ۗܺ᩷;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ll/۬ۗܳ;Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Ll/۠ۗܳ;->᩸:Ll/ۗܺ᩷;

    iput-object p3, p0, Ll/۠ۗܳ;->᩹:Ljava/lang/String;

    iput-object p1, p0, Ll/۠ۗܳ;->᩶:Ll/۬ۗܳ;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 192
    iget-object v4, p0, Ll/۠ۗܳ;->᩸:Ll/ۗܺ᩷;

    invoke-virtual {v4}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    iget-object v5, p0, Ll/۠ۗܳ;->᩶:Ll/۬ۗܳ;

    if-nez v0, :cond_2

    .line 193
    invoke-virtual {v4}, Ll/᩻ܽ;->getLifecycle()Ll/۟ۢ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟ۢ֫;->֫()Ll/ܰۢ֫;

    move-result-object v0

    sget-object v1, Ll/ܰۢ֫;->᩶:Ll/ܰۢ֫;

    if-ne v0, v1, :cond_0

    goto/16 :goto_0

    :cond_0
    const v0, 0x7f0d007e

    .line 198
    invoke-virtual {v4, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0631

    .line 199
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f120102

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    .line 201
    iget-object v1, p0, Ll/۠ۗܳ;->᩹:Ljava/lang/String;

    invoke-static {v4, v0, v1}, Ll/ۡۨܽ;->֫(Ll/ۗܺ᩷;Landroid/view/View;Ljava/lang/String;)Ll/ۜۨܽ;

    move-result-object v2

    .line 202
    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    .line 203
    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v3, 0x7f12070a

    const/4 v6, 0x0

    .line 204
    invoke-virtual {v1, v3, v6}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/֡ۗܳ;

    const/4 v7, 0x0

    invoke-direct {v3, v7, v5}, Ll/֡ۗܳ;-><init>(ILjava/lang/Object;)V

    const v7, 0x7f12015e

    .line 205
    invoke-virtual {v1, v7, v3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v3, 0x7f12094f

    .line 206
    invoke-virtual {v1, v3, v6}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance v3, Ll/ۚۗܳ;

    invoke-direct {v3, v5}, Ll/ۚۗܳ;-><init>(Ll/۬ۗܳ;)V

    .line 207
    invoke-virtual {v1, v3}, Ll/᩵ۚۢ;->֫(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 208
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v1

    .line 209
    invoke-virtual {v1}, Ll/֡ۚۢ;->ۜ()Z

    move-result v3

    if-nez v3, :cond_1

    .line 211
    invoke-interface {v5}, Ll/۬ۗܳ;->onCanceled()V

    return-void

    :cond_1
    const v3, 0x7f0a0524

    .line 214
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Landroid/widget/TextView;

    .line 215
    new-instance v3, Ll/֨ۗܳ;

    invoke-direct {v3, v6, v2, v1}, Ll/֨ۗܳ;-><init>(Landroid/widget/TextView;Ll/ۜۨܽ;Ll/֡ۚۢ;)V

    invoke-interface {v2, v3}, Ll/᩻ۨܽ;->֫(Ljava/lang/Runnable;)V

    .line 219
    new-instance v3, Ll/ܳۨܽ;

    invoke-direct {v3, v0}, Ll/ܳۨܽ;-><init>(Landroid/view/View;)V

    .line 221
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object v0

    new-instance v7, Ll/ۡۗܳ;

    const/4 v8, 0x0

    invoke-direct {v7, v4, v8}, Ll/ۡۗܳ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v0, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v7

    new-instance v8, Ll/ܺۗܳ;

    move-object v0, v8

    invoke-direct/range {v0 .. v6}, Ll/ܺۗܳ;-><init>(Ll/֡ۚۢ;Ll/ۜۨܽ;Ll/ܳۨܽ;Ll/ۗܺ᩷;Ll/۬ۗܳ;Landroid/widget/TextView;)V

    invoke-virtual {v7, v8}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    .line 195
    :cond_2
    :goto_0
    invoke-interface {v5}, Ll/۬ۗܳ;->onCanceled()V

    return-void
.end method
