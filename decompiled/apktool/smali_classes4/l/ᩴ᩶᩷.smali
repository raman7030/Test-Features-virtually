.class public final Ll/ᩴ᩶᩷;
.super Ljava/lang/Object;
.source "892H"


# direct methods
.method public static ֫(Ll/ۗܺ᩷;)V
    .locals 7

    const v0, 0x7f0d00cf

    .line 28
    invoke-virtual {p0, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0487

    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v2, 0x7f0a0488

    .line 30
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Ll/۬۬ۧ;

    const v3, 0x7f0a0190

    .line 31
    invoke-virtual {v0, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 32
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "-- "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " --"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const v4, 0x7f0a00a2

    .line 33
    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    new-instance v5, Ll/ۡۗܳ;

    const/4 v6, 0x2

    invoke-direct {v5, p0, v6}, Ll/ۡۗܳ;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {v4, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 34
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " \u2193\u2193"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 35
    new-instance v1, Ll/ۖ᩶᩷;

    invoke-direct {v1, p0}, Ll/ۖ᩶᩷;-><init>(Ll/ۗܺ᩷;)V

    .line 36
    new-instance v4, Ll/ۢ᩶᩷;

    invoke-direct {v4, v1, v2, v3}, Ll/ۢ᩶᩷;-><init>(Ll/ۖ᩶᩷;Ll/۬۬ۧ;Landroid/widget/TextView;)V

    invoke-virtual {v1, v4}, Ll/᩶ۗۧ;->registerAdapterDataObserver(Ll/ۗۗۧ;)V

    .line 48
    invoke-virtual {v1}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    .line 49
    invoke-virtual {v2, v1}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 50
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    invoke-virtual {p0, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v0, 0x7f120189

    const/4 v1, 0x0

    .line 51
    invoke-virtual {p0, v0, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 52
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
