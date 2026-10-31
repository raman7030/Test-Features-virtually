.class public final synthetic Ll/᩻۫ܿ;
.super Ljava/lang/Object;
.source "G7AW"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۗܺ᩷;

.field public final synthetic ᩸:Ll/᩸۫ܿ;

.field public final synthetic ᩹:Ll/۠۫ܿ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۫ܿ;Ll/۠۫ܿ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻۫ܿ;->᩸:Ll/᩸۫ܿ;

    iput-object p2, p0, Ll/᩻۫ܿ;->᩹:Ll/۠۫ܿ;

    iput-object p3, p0, Ll/᩻۫ܿ;->᩶:Ll/ۗܺ᩷;

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .line 470
    iget-object v4, p0, Ll/᩻۫ܿ;->᩹:Ll/۠۫ܿ;

    invoke-virtual {v4}, Ll/۠۫ܿ;->֫()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 473
    :cond_0
    invoke-virtual {v4, p3}, Ll/۠۫ܿ;->֫(I)Ll/ܽᩴۢ;

    move-result-object v3

    const p1, 0x7f0d00e7

    .line 515
    iget-object v2, p0, Ll/᩻۫ܿ;->᩶:Ll/ۗܺ᩷;

    invoke-virtual {v2, p1}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object p1

    .line 529
    invoke-virtual {v3}, Ll/ܽᩴۢ;->᩻()Z

    move-result p2

    if-eqz p2, :cond_1

    const p2, 0x7f12083f

    goto :goto_0

    :cond_1
    const p2, 0x7f120840

    :goto_0
    invoke-virtual {v2, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 532
    invoke-virtual {v3}, Ll/ܽᩴۢ;->ۧ()Ljava/lang/String;

    move-result-object p3

    .line 496
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_2

    const p3, 0x7f12084a

    .line 497
    invoke-virtual {v2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    :cond_2
    const p4, 0x7f0a014a

    .line 544
    invoke-virtual {p1, p4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p4

    check-cast p4, Landroid/widget/TextView;

    invoke-virtual {p4, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const p3, 0x7f0a0656

    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 534
    invoke-virtual {v3}, Ll/ܽᩴۢ;->ܽ()J

    move-result-wide p2

    const p4, 0x7f120842

    const-wide/16 v0, 0x0

    cmp-long p5, p2, v0

    if-gtz p5, :cond_3

    .line 506
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    .line 508
    :cond_3
    invoke-static {p2, p3}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object p2

    :goto_1
    const p3, 0x7f0a01f7

    .line 544
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 535
    invoke-virtual {v3}, Ll/ܽᩴۢ;->ᩳ()J

    move-result-wide p2

    cmp-long p5, p2, v0

    if-gtz p5, :cond_4

    .line 506
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    .line 508
    :cond_4
    invoke-static {p2, p3}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object p2

    :goto_2
    const p3, 0x7f0a02c8

    .line 544
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 536
    invoke-virtual {v3}, Ll/ܽᩴۢ;->ܿ()Ljava/lang/String;

    move-result-object p2

    .line 551
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    const p4, 0x7f120843

    if-eqz p3, :cond_5

    .line 552
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_5
    const p3, 0x7f0a02cb

    .line 544
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 537
    invoke-virtual {v3}, Ll/ܽᩴۢ;->ܳ()Ljava/lang/String;

    move-result-object p2

    .line 551
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-eqz p3, :cond_6

    .line 552
    invoke-virtual {v2, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_6
    const p3, 0x7f0a066e

    .line 544
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 517
    sget p2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance p2, Ll/᩵ۚۢ;

    invoke-direct {p2, v2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 518
    invoke-virtual {p2, p1}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const p1, 0x7f120836

    const/4 p3, 0x0

    .line 519
    invoke-virtual {p2, p1, p3}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f120189

    .line 520
    invoke-virtual {p2, p1, p3}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 521
    invoke-virtual {p2}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    move-result-object v5

    .line 522
    invoke-virtual {v5}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object p1

    new-instance p2, Ll/ۜ۫ܿ;

    iget-object v1, p0, Ll/᩻۫ܿ;->᩸:Ll/᩸۫ܿ;

    move-object v0, p2

    invoke-direct/range {v0 .. v5}, Ll/ۜ۫ܿ;-><init>(Ll/᩸۫ܿ;Ll/ۗܺ᩷;Ll/ܽᩴۢ;Ll/۠۫ܿ;Ll/֡ۚۢ;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
