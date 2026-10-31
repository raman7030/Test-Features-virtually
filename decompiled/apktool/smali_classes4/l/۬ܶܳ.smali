.class public final Ll/۬ܶܳ;
.super Ll/ܳܶܳ;
.source "R4LW"


# instance fields
.field public ۛ:Ll/۫ܶܳ;

.field public final ۤ:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Landroid/view/View;)V
    .locals 0

    .line 103
    invoke-direct {p0, p1, p2}, Ll/ܳܶܳ;-><init>(Ll/ۗܺ᩷;Landroid/view/View;)V

    const p1, 0x7f0a0277

    .line 104
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/۬ܶܳ;->ۤ:Landroid/widget/ImageView;

    const p2, 0x7f08011d

    .line 105
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/content/res/Resources$Theme;)V
    .locals 1

    .line 111
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {p1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 112
    iget-object p1, p0, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 113
    iget-object p1, p0, Ll/۬ܶܳ;->ۤ:Landroid/widget/ImageView;

    const v0, 0x7f08011d

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
