.class public final Ll/᩶᩻ܳ;
.super Ll/ۗ۬ۧ;
.source "K7HV"

# interfaces
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public ᩶:Landroid/widget/TextView;

.field public ᩸:Landroid/widget/TextView;

.field public final synthetic ᩹:Ll/ۙ᩻ܳ;


# direct methods
.method public constructor <init>(Ll/ۙ᩻ܳ;Landroid/view/View;)V
    .locals 0

    .line 236
    iput-object p1, p0, Ll/᩶᩻ܳ;->᩹:Ll/ۙ᩻ܳ;

    .line 237
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 238
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 239
    sget p1, Ll/ᩳ᩹ۡ;->֫:I

    .line 26
    new-instance p1, Ll/ܽ᩹ۡ;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 240
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 241
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const p1, 0x7f0a0631

    .line 242
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩶᩻ܳ;->᩶:Landroid/widget/TextView;

    const p1, 0x7f0a0397

    .line 243
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩶᩻ܳ;->᩸:Landroid/widget/TextView;

    const p1, 0x7f0a0278

    .line 244
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    .line 245
    sget-object p2, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    iget-object p2, p2, Ll/᩶ۖܳ;->ܽ:Ll/ۨܺ᩷;

    invoke-virtual {p2}, Ll/ۨܺ᩷;->ۧ()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 250
    iget-object p1, p0, Ll/᩶᩻ܳ;->᩹:Ll/ۙ᩻ܳ;

    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    invoke-static {p1, v0}, Ll/ۙ᩻ܳ;->֫(Ll/ۙ᩻ܳ;I)V

    return-void
.end method

.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 255
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result v0

    .line 256
    new-instance v1, Ll/᩸ۖ;

    .line 68
    iget-object v2, p0, Ll/᩶᩻ܳ;->᩹:Ll/ۙ᩻ܳ;

    const/4 v3, 0x0

    invoke-direct {v1, v2, p1, v3}, Ll/᩸ۖ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    .line 257
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v4, 0x7f1202dd

    invoke-interface {v2, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v4, 0x7f0801f0

    invoke-interface {v2, v4}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 258
    invoke-virtual {v1}, Ll/᩸ۖ;->ܽ()Ll/ۗۜ;

    move-result-object v2

    const v4, 0x7f1205ca

    invoke-interface {v2, v3, v4, v3, v4}, Landroid/view/Menu;->add(IIII)Landroid/view/MenuItem;

    move-result-object v2

    const v3, 0x7f0801e6

    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 259
    invoke-virtual {v1}, Ll/᩸ۖ;->ᩳ()V

    .line 260
    new-instance v2, Ll/᩸᩻ܳ;

    invoke-direct {v2, p0, p1, v0}, Ll/᩸᩻ܳ;-><init>(Ll/᩶᩻ܳ;Landroid/view/View;I)V

    invoke-virtual {v1, v2}, Ll/᩸ۖ;->֫(Ll/ܶۖ;)V

    .line 276
    invoke-static {p1, v1}, Ll/ᩳ᩹ۡ;->֫(Landroid/view/View;Ll/᩸ۖ;)V

    const/4 p1, 0x1

    return p1
.end method
