.class public final Ll/᩵ۖۡ;
.super Ljava/lang/Object;
.source "W5L3"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ۗ:I

.field public ۙ:I

.field public final synthetic ۤ:Ll/ۚۖۡ;

.field public final ۫:Landroid/widget/TextView;

.field public ۬:Ljava/lang/String;

.field public final ᩶:Landroid/widget/ImageView;

.field public final ᩸:Landroid/view/View;

.field public ᩹:Ll/۟ܺۡ;


# direct methods
.method public constructor <init>(Ll/ۚۖۡ;Landroid/view/View;)V
    .locals 1

    .line 412
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩵ۖۡ;->ۤ:Ll/ۚۖۡ;

    const p1, 0x7f0a05e4

    .line 413
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    const p1, 0x7f0a067e

    .line 414
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۖۡ;->᩸:Landroid/view/View;

    const v0, 0x7f0a0286

    .line 415
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/᩵ۖۡ;->᩶:Landroid/widget/ImageView;

    .line 416
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 589
    iget p1, p0, Ll/᩵ۖۡ;->ۙ:I

    if-nez p1, :cond_0

    .line 590
    iget-object p1, p0, Ll/᩵ۖۡ;->ۤ:Ll/ۚۖۡ;

    invoke-static {p1}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v0

    iget v1, p0, Ll/᩵ۖۡ;->ۗ:I

    invoke-virtual {v0, v1}, Ll/֨ۖۡ;->ۧ(I)V

    .line 591
    invoke-static {p1}, Ll/ۚۖۡ;->ܳ(Ll/ۚۖۡ;)Ll/֨ۖۡ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֨ۖۡ;->ᩳ()V

    .line 592
    invoke-static {p1}, Ll/ۚۖۡ;->᩷(Ll/ۚۖۡ;)V

    .line 593
    invoke-virtual {p1}, Ll/ۚۖۡ;->ܿ()V

    :cond_0
    return-void
.end method

.method public final ֫(I)V
    .locals 6

    .line 451
    iput p1, p0, Ll/᩵ۖۡ;->ۙ:I

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 452
    iget-object v2, p0, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    iget-object v3, p0, Ll/᩵ۖۡ;->᩶:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    const p1, 0x7f0802ab

    .line 453
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 454
    new-instance p1, Landroid/text/SpannableString;

    const v0, 0x7f1202dd

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 455
    new-instance v0, Landroid/text/style/StyleSpan;

    const/4 v4, 0x1

    invoke-direct {v0, v4}, Landroid/text/style/StyleSpan;-><init>(I)V

    invoke-virtual {p1}, Landroid/text/SpannableString;->length()I

    move-result v4

    const/16 v5, 0x21

    invoke-virtual {p1, v0, v1, v4, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 456
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 457
    sget-object p1, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 458
    sget p1, Ll/᩹֡᩷;->ܳ֫:I

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    if-ne p1, v0, :cond_1

    const p1, 0x7f0802ac

    .line 460
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f1206ad

    .line 461
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(I)V

    .line 462
    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 463
    sget p1, Ll/᩹֡᩷;->֫:I

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x5

    if-ne p1, v0, :cond_2

    const p1, 0x7f0802aa

    .line 465
    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    const p1, 0x7f1205b2

    .line 466
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(I)V

    .line 467
    sget p1, Ll/᩹֡᩷;->ۘ֫:I

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 468
    sget p1, Ll/᩹֡᩷;->ۘ֫:I

    invoke-virtual {v3, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 472
    :goto_0
    iget-object p1, p0, Ll/᩵ۖۡ;->᩸:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 473
    invoke-virtual {p1, v1}, Landroid/view/View;->setClickable(Z)V

    return-void

    .line 470
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final ֫(ILjava/lang/String;)V
    .locals 3

    const/4 v0, 0x0

    .line 420
    iput v0, p0, Ll/᩵ۖۡ;->ۙ:I

    .line 421
    iput p1, p0, Ll/᩵ۖۡ;->ۗ:I

    .line 422
    iput-object p2, p0, Ll/᩵ۖۡ;->۬:Ljava/lang/String;

    const p1, 0x7f0802a9

    .line 423
    iget-object v1, p0, Ll/᩵ۖۡ;->᩶:Landroid/widget/ImageView;

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 424
    iget-object p1, p0, Ll/᩵ۖۡ;->᩸:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v2, 0x1

    .line 425
    invoke-virtual {p1, v2}, Landroid/view/View;->setClickable(Z)V

    .line 426
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    const/16 v2, 0xc8

    if-le p1, v2, :cond_0

    .line 427
    invoke-virtual {p2, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p2

    .line 428
    :cond_0
    iget-object p1, p0, Ll/᩵ۖۡ;->۫:Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    sget-object p2, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 430
    sget p1, Ll/᩹֡᩷;->ܳ֫:I

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method
