.class public final synthetic Ll/᩻۫᩻;
.super Ljava/lang/Object;
.source "Y6Y9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ljava/lang/Object;

.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ll/᩻ۡ֫;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Ll/ۗܺ᩷;)V
    .locals 1

    const/4 v0, 0x2

    .line 0
    iput v0, p0, Ll/᩻۫᩻;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻۫᩻;->᩶:Ljava/lang/Object;

    iput-object p2, p0, Ll/᩻۫᩻;->᩹:Ll/᩻ۡ֫;

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩻ۡ֫;Ljava/lang/Object;I)V
    .locals 0

    .line 0
    iput p3, p0, Ll/᩻۫᩻;->᩸:I

    iput-object p1, p0, Ll/᩻۫᩻;->᩹:Ll/᩻ۡ֫;

    iput-object p2, p0, Ll/᩻۫᩻;->᩶:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 2
    iget p1, p0, Ll/᩻۫᩻;->᩸:I

    packed-switch p1, :pswitch_data_0

    .line 7
    iget-object p1, p0, Ll/᩻۫᩻;->᩹:Ll/᩻ۡ֫;

    .line 9
    check-cast p1, Ll/֡ۚۢ;

    .line 11
    iget-object v0, p0, Ll/᩻۫᩻;->᩶:Ljava/lang/Object;

    .line 13
    check-cast v0, Ll/ۡۤۡ;

    .line 16
    invoke-static {p1, v0}, Ll/᩷᩶ۜ;->ۧ(Ll/֡ۚۢ;Ll/ۡۤۡ;)V

    return-void

    .line 19
    :pswitch_0
    iget-object p1, p0, Ll/᩻۫᩻;->᩶:Ljava/lang/Object;

    .line 21
    check-cast p1, Landroid/widget/EditText;

    .line 23
    iget-object v0, p0, Ll/᩻۫᩻;->᩹:Ll/᩻ۡ֫;

    .line 25
    check-cast v0, Ll/ۗܺ᩷;

    .line 470
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 471
    new-instance v2, Ljava/util/ArrayList;

    sget v3, Ll/ܳ᩷ܽ;->ۡ:I

    add-int/lit8 v3, v3, -0x1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 472
    :goto_0
    sget v6, Ll/ܳ᩷ܽ;->ۡ:I

    if-ge v5, v6, :cond_2

    .line 473
    invoke-static {v5}, Ll/ܳ᩷ܽ;->ۧ(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "UTF-8-BOM"

    .line 474
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    .line 477
    :cond_0
    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_1

    .line 478
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 480
    :cond_1
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    new-array v1, v4, [Ljava/lang/String;

    .line 482
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    .line 483
    invoke-virtual {v0}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    const v2, 0x7f1206b6

    .line 484
    invoke-virtual {v0, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    new-instance v2, Ll/ܰ᩸ۡ;

    const/4 v4, 0x2

    invoke-direct {v2, v4, p1, v1}, Ll/ܰ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 485
    invoke-virtual {v0, v1, v3, v2}, Ll/᩵ۚۢ;->֫([Ljava/lang/CharSequence;ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120189

    const/4 v1, 0x0

    .line 489
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 490
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 0
    :pswitch_1
    iget-object p1, p0, Ll/᩻۫᩻;->᩹:Ll/᩻ۡ֫;

    check-cast p1, Ll/ܶۖᩳ;

    iget-object v0, p0, Ll/᩻۫᩻;->᩶:Ljava/lang/Object;

    check-cast v0, Ll/֡ۚۢ;

    invoke-static {p1, v0}, Ll/ܶۖᩳ;->֫(Ll/ܶۖᩳ;Ll/֡ۚۢ;)V

    return-void

    :pswitch_2
    iget-object p1, p0, Ll/᩻۫᩻;->᩹:Ll/᩻ۡ֫;

    move-object v4, p1

    check-cast v4, Ll/ۗܺ᩷;

    iget-object p1, p0, Ll/᩻۫᩻;->᩶:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Ll/ܳ۫᩻;

    const p1, 0x7f0d007e

    .line 642
    invoke-virtual {v4, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f0a0631

    .line 643
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f12007f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    .line 645
    invoke-static {}, Ll/᩶ۗ᩻;->ۧ()Ll/ܽ᩺ܽ;

    move-result-object v0

    invoke-static {v4, p1, v0}, Ll/ۡۨܽ;->֫(Ll/ۗܺ᩷;Landroid/view/View;Ll/ܽ᩺ܽ;)Ll/᩻ۨܽ;

    move-result-object v2

    .line 646
    invoke-virtual {v4}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v0

    .line 647
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const v1, 0x7f12070a

    const/4 v3, 0x0

    .line 648
    invoke-virtual {v0, v1, v3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const v1, 0x7f12015e

    const v6, 0x7f120634

    .line 0
    invoke-static {v0, v1, v3, v6, v3}, Ll/ۛۙܽ;->֫(Ll/᩵ۚۢ;ILandroid/content/DialogInterface$OnClickListener;ILandroid/content/DialogInterface$OnClickListener;)Ll/֡ۚۢ;

    move-result-object v1

    const v0, 0x7f0a0524

    .line 652
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Landroid/widget/TextView;

    .line 653
    new-instance v0, Ll/ۚ۫᩻;

    invoke-direct {v0, v6, v2, v1}, Ll/ۚ۫᩻;-><init>(Landroid/widget/TextView;Ll/᩻ۨܽ;Ll/֡ۚۢ;)V

    invoke-interface {v2, v0}, Ll/᩻ۨܽ;->֫(Ljava/lang/Runnable;)V

    .line 657
    new-instance v3, Ll/ܳۨܽ;

    invoke-direct {v3, p1}, Ll/ܳۨܽ;-><init>(Landroid/view/View;)V

    .line 659
    invoke-virtual {v1}, Ll/֡ۚۢ;->ᩳ()Landroid/widget/Button;

    move-result-object p1

    new-instance v0, Ll/ۘ֨᩷;

    const/4 v7, 0x1

    invoke-direct {v0, v4, v7}, Ll/ۘ֨᩷;-><init>(Ll/ۗܺ᩷;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 661
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    new-instance v7, Ll/֨۫᩻;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll/֨۫᩻;-><init>(Ll/֡ۚۢ;Ll/᩻ۨܽ;Ll/ܳۨܽ;Ll/ۗܺ᩷;Ll/ܳ۫᩻;Landroid/widget/TextView;)V

    invoke-virtual {p1, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
