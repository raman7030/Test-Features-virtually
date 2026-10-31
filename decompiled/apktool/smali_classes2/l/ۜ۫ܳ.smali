.class public final Ll/ۜ۫ܳ;
.super Ljava/lang/Object;
.source "A940"


# direct methods
.method public static ֫(Ll/ۗܺ᩷;Ljava/util/ArrayList;Ll/ᩴ֫᩷;)V
    .locals 6

    .line 40
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const v1, 0x7f0d00a7

    .line 41
    invoke-virtual {p0, v1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v1

    const v2, 0x7f0a0631

    .line 42
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    const v3, 0x7f0a0640

    .line 43
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    const v4, 0x7f0a02e0

    .line 44
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Ll/۬۬ۧ;

    const v5, 0x7f1209b5

    .line 45
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(I)V

    const/4 v2, 0x0

    .line 46
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    const v2, 0x7f080221

    .line 47
    invoke-virtual {v3, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 48
    new-instance v2, Ll/֫۫ܳ;

    invoke-direct {v2, v0, v4}, Ll/֫۫ܳ;-><init>(Ljava/util/ArrayList;Ll/۬۬ۧ;)V

    invoke-virtual {v3, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 49
    invoke-static {v4}, Ll/ۙ᩸ۡ;->֫(Ll/۬۬ۧ;)V

    .line 50
    new-instance v2, Ll/֫ۗۧ;

    new-instance v3, Ll/ܽ۫ܳ;

    invoke-direct {v3, v0}, Ll/ܽ۫ܳ;-><init>(Ljava/util/ArrayList;)V

    invoke-direct {v2, v3}, Ll/֫ۗۧ;-><init>(Ll/ۤۙۧ;)V

    .line 80
    new-instance v3, Ll/ܳ۫ܳ;

    invoke-direct {v3, p0, v0, v2}, Ll/ܳ۫ܳ;-><init>(Ll/ۗܺ᩷;Ljava/util/ArrayList;Ll/֫ۗۧ;)V

    invoke-virtual {v4, v3}, Ll/۬۬ۧ;->setAdapter(Ll/᩶ۗۧ;)V

    .line 81
    invoke-virtual {v2, v4}, Ll/֫ۗۧ;->֫(Ll/۬۬ۧ;)V

    .line 82
    invoke-virtual {p0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object p0

    invoke-virtual {p0, v1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    new-instance v1, Ll/ۧ۫ܳ;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, p2, v2}, Ll/ۧ۫ܳ;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p1, 0x7f12070a

    .line 83
    invoke-virtual {p0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 p2, 0x0

    .line 91
    invoke-virtual {p0, p1, p2}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 92
    invoke-virtual {p0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
