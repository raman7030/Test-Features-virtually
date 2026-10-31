.class public final Ll/ܽ᩹ۜ;
.super Ll/ۗ۬ۧ;
.source "O8UQ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ۙ:Ll/ᩳ᩹ۜ;

.field public final ᩶:Landroid/widget/ImageView;

.field public final ᩸:Landroid/graphics/drawable/Animatable;

.field public final ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ᩳ᩹ۜ;Landroid/view/View;)V
    .locals 0

    .line 440
    iput-object p1, p0, Ll/ܽ᩹ۜ;->ۙ:Ll/ᩳ᩹ۜ;

    .line 441
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a03d6

    .line 442
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܽ᩹ۜ;->᩹:Landroid/widget/TextView;

    const p1, 0x7f0a043c

    .line 443
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ܽ᩹ۜ;->᩶:Landroid/widget/ImageView;

    .line 444
    invoke-virtual {p1}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/Animatable;

    iput-object p1, p0, Ll/ܽ᩹ۜ;->᩸:Landroid/graphics/drawable/Animatable;

    .line 445
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    invoke-static {p2}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 451
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 452
    iget-object v0, p0, Ll/ܽ᩹ۜ;->ۙ:Ll/ᩳ᩹ۜ;

    invoke-virtual {v0}, Ll/ᩳۚۜ;->ᩳ()I

    move-result v1

    if-eq p1, v1, :cond_1

    .line 454
    invoke-static {v0}, Ll/ᩳ᩹ۜ;->ۧ(Ll/ᩳ᩹ۜ;)Ll/ۜ᩶ۜ;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll/ۜ᩶ۜ;->ۧ(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 455
    iget-object p1, p0, Ll/ܽ᩹ۜ;->᩶:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 456
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, Ll/᩶ۗۧ;->notifyItemChanged(I)V

    :cond_0
    return-void

    .line 459
    :cond_1
    invoke-static {v0}, Ll/ᩳ᩹ۜ;->ۧ(Ll/ᩳ᩹ۜ;)Ll/ۜ᩶ۜ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۜ᩶ۜ;->ܽ()V

    return-void
.end method

.method public final ۧ(I)V
    .locals 4

    .line 172
    iget-object v0, p0, Ll/ܽ᩹ۜ;->ۙ:Ll/ᩳ᩹ۜ;

    invoke-virtual {v0, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧ᩵֫;

    .line 464
    iget-object v1, v1, Ll/ۧ᩵֫;->ᩳ:Ljava/lang/String;

    iget-object v2, p0, Ll/ܽ᩹ۜ;->᩹:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 465
    invoke-virtual {v0}, Ll/ᩳۚۜ;->ᩳ()I

    move-result v0

    iget-object v1, p0, Ll/ܽ᩹ۜ;->᩶:Landroid/widget/ImageView;

    iget-object v3, p0, Ll/ܽ᩹ۜ;->᩸:Landroid/graphics/drawable/Animatable;

    if-ne p1, v0, :cond_1

    .line 466
    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 p1, 0x0

    .line 467
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 468
    sget-object p1, Ll/᩷᩶ۜ;->֡:Ll/ۚۡ֫;

    invoke-virtual {p1}, Ll/֡ۡ֫;->֫()Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne p1, v0, :cond_0

    .line 469
    invoke-interface {v3}, Landroid/graphics/drawable/Animatable;->isRunning()Z

    move-result p1

    if-nez p1, :cond_2

    .line 470
    invoke-interface {v3}, Landroid/graphics/drawable/Animatable;->start()V

    return-void

    .line 472
    :cond_0
    invoke-interface {v3}, Landroid/graphics/drawable/Animatable;->isRunning()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 473
    invoke-interface {v3}, Landroid/graphics/drawable/Animatable;->stop()V

    return-void

    .line 476
    :cond_1
    sget-object p1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    const/16 p1, 0x8

    .line 477
    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 478
    invoke-interface {v3}, Landroid/graphics/drawable/Animatable;->isRunning()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 479
    invoke-interface {v3}, Landroid/graphics/drawable/Animatable;->stop()V

    :cond_2
    return-void
.end method
