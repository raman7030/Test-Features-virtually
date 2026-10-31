.class public final Ll/ܶ᩹ܳ;
.super Ll/ۗ۬ۧ;
.source "164Z"


# instance fields
.field public final ֫:Landroid/widget/ImageView;

.field public final ۧ:Ll/ۤܺ᩷;

.field public final ܽ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(ILandroid/view/View;)V
    .locals 1

    .line 1138
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a0278

    .line 1139
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Ll/ۤܺ᩷;

    iput-object p1, p0, Ll/ܶ᩹ܳ;->ۧ:Ll/ۤܺ᩷;

    const p1, 0x7f0a03d6

    .line 1140
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܶ᩹ܳ;->ܽ:Landroid/widget/TextView;

    const p1, 0x7f0a0163

    .line 1141
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ܶ᩹ܳ;->֫:Landroid/widget/ImageView;

    const/high16 v0, 0x3f000000    # 0.5f

    .line 1142
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 1143
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܶ᩹ܳ;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩹ܳ;->֫:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܶ᩹ܳ;)Ll/ۤܺ᩷;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩹ܳ;->ۧ:Ll/ۤܺ᩷;

    return-object p0
.end method

.method public static bridge synthetic ܽ(Ll/ܶ᩹ܳ;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܶ᩹ܳ;->ܽ:Landroid/widget/TextView;

    return-object p0
.end method
