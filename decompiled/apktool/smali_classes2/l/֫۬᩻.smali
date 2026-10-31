.class public final Ll/֫۬᩻;
.super Ll/ۗ۬ۧ;
.source "D7B1"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public ۗ:Ll/᩷ۨ᩻;

.field public final ۙ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ۧ۬᩻;

.field public final ᩸:I

.field public final ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۧ۬᩻;Landroid/view/View;)V
    .locals 0

    .line 466
    iput-object p1, p0, Ll/֫۬᩻;->᩶:Ll/ۧ۬᩻;

    .line 467
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a0631

    .line 468
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/֫۬᩻;->ۙ:Landroid/widget/TextView;

    const p1, 0x7f0a04f1

    .line 469
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/֫۬᩻;->᩹:Landroid/widget/TextView;

    .line 470
    invoke-static {p2}, Ll/ۧ۬᩻;->֫(Landroid/view/View;)I

    move-result p1

    iput p1, p0, Ll/֫۬᩻;->᩸:I

    .line 471
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 493
    iget-object p1, p0, Ll/֫۬᩻;->ۗ:Ll/᩷ۨ᩻;

    if-eqz p1, :cond_0

    .line 494
    iget-object v0, p0, Ll/֫۬᩻;->᩶:Ll/ۧ۬᩻;

    invoke-static {v0, p1}, Ll/ۧ۬᩻;->֫(Ll/ۧ۬᩻;Ll/᩷ۨ᩻;)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/᩷ۨ᩻;)V
    .locals 7

    .line 478
    iput-object p1, p0, Ll/֫۬᩻;->ۗ:Ll/᩷ۨ᩻;

    .line 352
    iget-object v0, p1, Ll/᩷ۨ᩻;->ܽ:Ljava/lang/String;

    iget-object v1, p0, Ll/֫۬᩻;->᩶:Ll/ۧ۬᩻;

    iget-object v2, p0, Ll/֫۬᩻;->ۙ:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 480
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 481
    invoke-static {v1}, Ll/ۧ۬᩻;->ۧ(Ll/ۧ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v0

    const v3, 0x7f06039c

    invoke-static {v0, v3}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_1

    .line 483
    :cond_0
    iget-object v0, p1, Ll/᩷ۨ᩻;->֫:Ljava/lang/String;

    iget-boolean v3, p1, Ll/᩷ۨ᩻;->᩷:Z

    invoke-static {v1}, Ll/ۧ۬᩻;->ۧ(Ll/ۧ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v4

    const v5, 0x7f12007d

    .line 484
    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    if-nez v3, :cond_1

    goto :goto_0

    .line 506
    :cond_1
    new-instance v3, Landroid/text/SpannableString;

    .line 0
    invoke-static {v0, v4}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 506
    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 507
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    sget v5, Ll/᩹֡᩷;->ۜ֫:I

    invoke-direct {v4, v5}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v5

    const/16 v6, 0x21

    invoke-virtual {v3, v4, v0, v5, v6}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    move-object v0, v3

    .line 483
    :goto_0
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 485
    iget v0, p0, Ll/֫۬᩻;->᩸:I

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 487
    :goto_1
    invoke-static {v1}, Ll/ۧ۬᩻;->ۧ(Ll/ۧ۬᩻;)Ll/ۗܺ᩷;

    move-result-object v0

    iget-wide v1, p1, Ll/᩷ۨ᩻;->ᩳ:J

    .line 488
    invoke-static {v1, v2}, Ll/᩺ۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v2, p1, Ll/᩷ۨ᩻;->ܿ:J

    .line 516
    invoke-static {v2, v3}, Ll/ܿۤۡ;->֫(J)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v1, 0x1

    aput-object p1, v2, v1

    const p1, 0x7f12007b

    .line 487
    invoke-virtual {v0, p1, v2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Ll/֫۬᩻;->᩹:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
