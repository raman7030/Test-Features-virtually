.class public final Ll/᩸ۙܽ;
.super Ll/ۗ۬ۧ;
.source "28VT"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public ᩶:Landroid/widget/TextView;

.field public ᩸:Landroid/widget/ImageView;

.field public final synthetic ᩹:Ll/᩹ۙܽ;


# direct methods
.method public constructor <init>(Ll/᩹ۙܽ;Landroid/view/View;)V
    .locals 0

    .line 417
    iput-object p1, p0, Ll/᩸ۙܽ;->᩹:Ll/᩹ۙܽ;

    .line 418
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a0278

    .line 419
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/᩸ۙܽ;->᩸:Landroid/widget/ImageView;

    const p1, 0x7f0a05e2

    .line 420
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩸ۙܽ;->᩶:Landroid/widget/TextView;

    .line 421
    invoke-static {p2}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    .line 422
    sget p1, Ll/ᩳ᩹ۡ;->֫:I

    .line 26
    new-instance p1, Ll/ܽ᩹ۡ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 423
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 424
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/᩸ۙܽ;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܽ;->᩸:Landroid/widget/ImageView;

    return-object p0
.end method

.method private ֫()Ljava/lang/Object;
    .locals 4

    .line 428
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    add-int/lit8 v1, v0, -0x1

    .line 429
    iget-object v2, p0, Ll/᩸ۙܽ;->᩹:Ll/᩹ۙܽ;

    invoke-static {v2}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v0, v0, -0x3

    goto :goto_0

    .line 431
    :cond_0
    invoke-static {v2}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 432
    invoke-static {v2}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 434
    :cond_1
    invoke-static {v2}, Ll/᩹ۙܽ;->ۡ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    sub-int v0, v1, v0

    .line 436
    :goto_0
    invoke-static {v2}, Ll/᩹ۙܽ;->ۜ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 437
    invoke-static {v2}, Ll/᩹ۙܽ;->ۜ(Ll/᩹ۙܽ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 439
    :cond_2
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
.end method

.method public static bridge synthetic ۧ(Ll/᩸ۙܽ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/᩸ۙܽ;->᩶:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 444
    invoke-direct {p0}, Ll/᩸ۙܽ;->֫()Ljava/lang/Object;

    move-result-object p1

    .line 445
    instance-of v0, p1, Ll/۬ܿᩳ;

    iget-object v1, p0, Ll/᩸ۙܽ;->᩹:Ll/᩹ۙܽ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/۬ܿᩳ;

    .line 646
    new-instance v0, Ll/ܺ᩸ۡ;

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1, p1}, Ll/ܺ᩸ۡ;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 620
    invoke-virtual {p1}, Ll/۬ܿᩳ;->ᩴ()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    .line 621
    sput-boolean v2, Ll/᩹ܿᩳ;->᩻:Z

    .line 622
    new-instance v2, Ll/ܳۙܽ;

    invoke-direct {v2, v0}, Ll/ܳۙܽ;-><init>(Ljava/lang/Runnable;)V

    invoke-static {v2, p1, v1}, Ll/ۡۨܽ;->֫(Ll/᩷ۨܽ;Ll/۬ܿᩳ;Ll/ۗܺ᩷;)V

    return-void

    .line 641
    :cond_0
    invoke-virtual {v0}, Ll/ܺ᩸ۡ;->run()V

    return-void

    .line 447
    :cond_1
    instance-of v0, p1, Ll/ܶ᩵ܿ;

    if-eqz v0, :cond_2

    check-cast p1, Ll/ܶ᩵ܿ;

    .line 448
    new-instance v0, Ll/ۗۤܿ;

    invoke-direct {v0, v1, p1}, Ll/ۗۤܿ;-><init>(Ll/ۗܺ᩷;Ll/ܶ᩵ܿ;)V

    new-instance p1, Ll/ۢۙܽ;

    invoke-direct {p1, p0}, Ll/ۢۙܽ;-><init>(Ll/᩸ۙܽ;)V

    .line 449
    invoke-virtual {v0, p1}, Ll/ۗۤܿ;->֫(Ll/ۢۙܽ;)V

    .line 453
    invoke-virtual {v0}, Ll/ۗۤܿ;->֫()V

    :cond_2
    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 9

    .line 461
    invoke-direct {p0}, Ll/᩸ۙܽ;->֫()Ljava/lang/Object;

    move-result-object v0

    .line 462
    instance-of v1, v0, Ll/۬ܿᩳ;

    const v2, 0x7f0801e6

    const v3, 0x7f080231

    const/4 v4, 0x1

    const v5, 0x7f1205ca

    const v6, 0x7f1205f9

    const/4 v7, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ll/۬ܿᩳ;

    .line 463
    new-instance v1, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    .line 68
    invoke-direct {v1, v8, p1, v7}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 464
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v8

    invoke-interface {v8, v7, v6, v7, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    invoke-interface {v6, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 465
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    invoke-interface {v3, v7, v5, v7, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 466
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v3, 0x7f120a0e

    invoke-interface {v2, v7, v3, v7, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080247

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 467
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v3, 0x7f120351

    invoke-interface {v2, v7, v3, v7, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f080214

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 468
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v3, 0x7f120352

    invoke-interface {v2, v7, v3, v7, v3}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801f6

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 469
    invoke-virtual {v1}, Ll/᩸ۖ;->ᩳ()V

    .line 470
    new-instance v2, Ll/ۡۙܽ;

    invoke-direct {v2, p0, v0}, Ll/ۡۙܽ;-><init>(Ll/᩸ۙܽ;Ll/۬ܿᩳ;)V

    invoke-virtual {v1, v2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 528
    invoke-static {p1, v1}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    return v4

    .line 530
    :cond_0
    instance-of v1, v0, Ll/ܶ᩵ܿ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ܶ᩵ܿ;

    .line 531
    new-instance v1, Ll/᩸ۖ;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    .line 68
    invoke-direct {v1, v8, p1, v7}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 532
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v8

    invoke-interface {v8, v7, v6, v7, v6}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v6

    invoke-interface {v6, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 533
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v3

    invoke-interface {v3, v7, v5, v7, v5}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {v3, v2}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 534
    invoke-virtual {v1}, Ll/᩸ۖ;->ᩳ()V

    .line 535
    new-instance v2, Ll/ܺۙܽ;

    invoke-direct {v2, p0, v0}, Ll/ܺۙܽ;-><init>(Ll/᩸ۙܽ;Ll/ܶ᩵ܿ;)V

    invoke-virtual {v1, v2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 551
    invoke-static {p1, v1}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    return v4

    :cond_1
    return v7
.end method
