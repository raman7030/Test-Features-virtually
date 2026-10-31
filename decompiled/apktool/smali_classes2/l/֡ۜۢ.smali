.class public final Ll/֡ۜۢ;
.super Ll/᩶ۗۧ;
.source "M1KQ"


# instance fields
.field public ֫:Z

.field public final synthetic ۧ:Ll/ܶۜۢ;


# direct methods
.method public constructor <init>(Ll/ܶۜۢ;)V
    .locals 0

    .line 451
    iput-object p1, p0, Ll/֡ۜۢ;->ۧ:Ll/ܶۜۢ;

    invoke-direct {p0}, Ll/᩶ۗۧ;-><init>()V

    const/4 p1, 0x0

    .line 453
    iput-boolean p1, p0, Ll/֡ۜۢ;->֫:Z

    return-void
.end method

.method private ۧ()I
    .locals 3

    .line 567
    iget-object v0, p0, Ll/֡ۜۢ;->ۧ:Ll/ܶۜۢ;

    invoke-static {v0}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    invoke-static {v0}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 569
    :cond_0
    invoke-static {v0}, Ll/ܶۜۢ;->ۢ(Ll/ܶۜۢ;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Ll/ܶۜۢ;->ۜ(Ll/ܶۜۢ;)I

    move-result v1

    if-nez v1, :cond_1

    const/4 v2, 0x0

    .line 570
    :cond_1
    invoke-static {v0}, Ll/ܶۜۢ;->ᩳ(Ll/ܶۜۢ;)Z

    move-result v0

    if-nez v0, :cond_2

    add-int/lit8 v2, v2, 0x2

    return v2

    :cond_2
    add-int/lit8 v2, v2, 0x3

    :cond_3
    :goto_0
    return v2
.end method


# virtual methods
.method public final getItemCount()I
    .locals 3

    .line 558
    iget-object v0, p0, Ll/֡ۜۢ;->ۧ:Ll/ܶۜۢ;

    invoke-static {v0}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    return v0

    .line 560
    :cond_0
    invoke-static {v0}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 561
    invoke-direct {p0}, Ll/֡ۜۢ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0

    .line 563
    :cond_1
    invoke-direct {p0}, Ll/֡ۜۢ;->ۧ()I

    move-result v1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v0}, Ll/ܶۜۢ;->ۢ(Ll/ܶۜۢ;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-static {v0}, Ll/ܶۜۢ;->ۜ(Ll/ܶۜۢ;)I

    move-result v0

    goto :goto_0

    :cond_2
    invoke-static {v0}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public final getItemViewType(I)I
    .locals 2

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 466
    invoke-direct {p0}, Ll/֡ۜۢ;->ۧ()I

    move-result v1

    if-ge p1, v1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    sub-int/2addr p1, v1

    if-nez p1, :cond_2

    return v0

    :cond_2
    const/4 p1, 0x2

    return p1
.end method

.method public final onBindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 8
    .param p2    # I
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "RecyclerView"
            }
        .end annotation
    .end param

    if-nez p2, :cond_0

    .line 500
    check-cast p1, Ll/ۖۜۢ;

    .line 501
    iget-object p1, p1, Ll/ۖۜۢ;->֫:Landroid/widget/TextView;

    const p2, 0x7f120413

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 505
    invoke-direct {p0}, Ll/֡ۜۢ;->ۧ()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 506
    iget-object v3, p0, Ll/֡ۜۢ;->ۧ:Ll/ܶۜۢ;

    if-ge p2, v0, :cond_8

    .line 507
    check-cast p1, Ll/᩵ۜۢ;

    .line 508
    iput p2, p1, Ll/᩵ۜۢ;->᩶:I

    iget-object v0, p1, Ll/᩵ۜۢ;->᩹:Landroid/widget/ImageView;

    iget-object v4, p1, Ll/᩵ۜۢ;->ۗ:Landroid/widget/TextView;

    .line 509
    invoke-static {v3}, Ll/ܶۜۢ;->ۢ(Ll/ܶۜۢ;)Z

    move-result v5

    const/4 v6, 0x3

    const/4 v7, 0x2

    if-eqz v5, :cond_1

    invoke-static {v3}, Ll/ܶۜۢ;->ۜ(Ll/ܶۜۢ;)I

    move-result v5

    if-nez v5, :cond_1

    if-ne p2, v7, :cond_1

    .line 510
    iput v6, p1, Ll/᩵ۜۢ;->᩶:I

    const/4 p2, 0x3

    :cond_1
    if-eqz p2, :cond_7

    if-eq p2, v2, :cond_6

    if-eq p2, v7, :cond_4

    if-ne p2, v6, :cond_3

    .line 528
    iget-boolean p2, p0, Ll/֡ۜۢ;->֫:Z

    if-eqz p2, :cond_2

    .line 529
    iput-boolean v1, p0, Ll/֡ۜۢ;->֫:Z

    .line 530
    new-instance p2, Ll/֡ܳۡ;

    sget v1, Ll/᩹֡᩷;->ܺ:I

    invoke-direct {p2, v1}, Ll/֡ܳۡ;-><init>(I)V

    const/16 v1, 0x3e8

    .line 531
    invoke-virtual {p2, v1}, Ll/֡ܳۡ;->֫(I)V

    .line 532
    iget-object p1, p1, Ll/᩵ۜۢ;->᩸:Landroid/view/View;

    sget v1, Ll/ܿ᩺;->֫:I

    .line 3370
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const p1, 0x7f080223

    .line 534
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f1200cf

    .line 535
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    .line 538
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "MenuType = "

    .line 0
    invoke-static {p2, v0}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 538
    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const p1, 0x7f080232

    .line 521
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 522
    invoke-static {v3}, Ll/ܶۜۢ;->ۢ(Ll/ܶۜۢ;)Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, 0x7f120898

    .line 523
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_5
    const p1, 0x7f1205fa

    .line 525
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_6
    const p1, 0x7f0801f9

    .line 517
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f1203d7

    .line 518
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_7
    const p1, 0x7f08022b

    .line 513
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f120805

    .line 514
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_8
    sub-int/2addr p2, v0

    if-nez p2, :cond_a

    .line 544
    check-cast p1, Ll/ۖۜۢ;

    .line 545
    invoke-static {v3}, Ll/ܶۜۢ;->ۢ(Ll/ܶۜۢ;)Z

    move-result p2

    if-eqz p2, :cond_9

    .line 546
    iget-object p1, p1, Ll/ۖۜۢ;->֫:Landroid/widget/TextView;

    invoke-static {v3}, Ll/ܶۜۢ;->᩷(Ll/ܶۜۢ;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v2, [Ljava/lang/Object;

    aput-object p2, v0, v1

    const p2, 0x7f1203de

    invoke-virtual {v3, p2, v0}, Ll/ۡ᩻֫;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    .line 548
    :cond_9
    iget-object p1, p1, Ll/ۖۜۢ;->֫:Landroid/widget/TextView;

    const p2, 0x7f120a00

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_a
    add-int/lit8 p2, p2, -0x1

    .line 552
    check-cast p1, Ll/۠ۜۢ;

    .line 553
    invoke-static {v3}, Ll/ܶۜۢ;->ܿ(Ll/ܶۜۢ;)Ljava/util/List;

    move-result-object v0

    invoke-static {v3}, Ll/ܶۜۢ;->ۢ(Ll/ܶۜۢ;)Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-static {v3}, Ll/ܶۜۢ;->᩻(Ll/ܶۜۢ;)[I

    move-result-object v1

    aget p2, v1, p2

    :cond_b
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ll/ܺۜۢ;

    .line 588
    iput-object p2, p1, Ll/۠ۜۢ;->᩸:Ll/ܺۜۢ;

    .line 589
    iget-object p1, p1, Ll/۠ۜۢ;->᩹:Landroid/widget/TextView;

    invoke-virtual {p2}, Ll/ܺۜۢ;->ۧ()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x96

    invoke-static {v1, v0}, Ll/ۜۚۜ;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 590
    iget-boolean p2, p2, Ll/ܺۜۢ;->ܽ:Z

    if-eqz p2, :cond_c

    .line 591
    sget p2, Ll/᩹֡᩷;->ܿ֫:I

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    .line 593
    :cond_c
    sget-object p2, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public final onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 3

    const/4 v0, 0x0

    .line 479
    iget-object v1, p0, Ll/֡ۜۢ;->ۧ:Ll/ܶۜۢ;

    if-eqz p2, :cond_2

    const/4 v2, 0x1

    if-eq p2, v2, :cond_1

    const/4 v2, 0x2

    if-ne p2, v2, :cond_0

    .line 489
    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v2, 0x7f0d0132

    invoke-virtual {p2, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 491
    new-instance p2, Ll/۠ۜۢ;

    invoke-direct {p2, v1, p1}, Ll/۠ۜۢ;-><init>(Ll/ܶۜۢ;Landroid/view/View;)V

    return-object p2

    .line 493
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 485
    :cond_1
    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v2, 0x7f0d0131

    invoke-virtual {p2, v2, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 487
    new-instance p2, Ll/᩵ۜۢ;

    invoke-direct {p2, v1, p1}, Ll/᩵ۜۢ;-><init>(Ll/ܶۜۢ;Landroid/view/View;)V

    return-object p2

    .line 481
    :cond_2
    invoke-virtual {v1}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p2

    const v1, 0x7f0d015a

    invoke-virtual {p2, v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    .line 483
    new-instance p2, Ll/ۖۜۢ;

    invoke-direct {p2, p1}, Ll/ۖۜۢ;-><init>(Landroid/view/View;)V

    return-object p2
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 456
    iput-boolean v0, p0, Ll/֡ۜۢ;->֫:Z

    .line 457
    invoke-virtual {p0}, Ll/᩶ۗۧ;->notifyDataSetChanged()V

    return-void
.end method
