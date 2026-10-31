.class public final Ll/ܺ᩶᩷;
.super Ll/ۗ۬ۧ;
.source "892H"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩶:Ll/ۖ᩶᩷;

.field public ᩸:Landroid/widget/ImageView;

.field public ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۖ᩶᩷;Landroid/view/View;)V
    .locals 0

    .line 99
    iput-object p1, p0, Ll/ܺ᩶᩷;->᩶:Ll/ۖ᩶᩷;

    .line 100
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 101
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const p1, 0x7f0a0278

    .line 102
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ܺ᩶᩷;->᩸:Landroid/widget/ImageView;

    const p1, 0x7f0a05be

    .line 103
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ܺ᩶᩷;->᩹:Landroid/widget/TextView;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܺ᩶᩷;)Landroid/widget/ImageView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩶᩷;->᩸:Landroid/widget/ImageView;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܺ᩶᩷;)Landroid/widget/TextView;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܺ᩶᩷;->᩹:Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 108
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapterPosition()I

    move-result p1

    .line 109
    iget-object v0, p0, Ll/ܺ᩶᩷;->᩶:Ll/ۖ᩶᩷;

    invoke-static {v0}, Ll/ۖ᩶᩷;->֫(Ll/ۖ᩶᩷;)Ll/ۗܺ᩷;

    move-result-object v1

    invoke-virtual {v1}, Ll/ۗܺ᩷;->buildDialog()Ll/᩵ۚۢ;

    move-result-object v1

    const v2, 0x7f1205ca

    .line 110
    invoke-virtual {v1, v2}, Ll/᩵ۚۢ;->ۧ(I)V

    invoke-static {v0}, Ll/ۖ᩶᩷;->֫(Ll/ۖ᩶᩷;)Ll/ۗܺ᩷;

    move-result-object v2

    iget-object v0, v0, Ll/ۖ᩶᩷;->ۧ:Ljava/util/ArrayList;

    .line 111
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۘ᩶᩷;

    invoke-virtual {v0}, Ll/ۘ᩶᩷;->ᩳ()Ljava/lang/CharSequence;

    move-result-object v0

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const v0, 0x7f120870

    invoke-virtual {v2, v0, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ll/᩵ۚۢ;->֫(Ljava/lang/CharSequence;)V

    new-instance v0, Ll/ۡ᩶᩷;

    invoke-direct {v0, p0, p1}, Ll/ۡ᩶᩷;-><init>(Ll/ܺ᩶᩷;I)V

    const p1, 0x7f12070a

    .line 112
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v0, 0x0

    .line 118
    invoke-virtual {v1, p1, v0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 119
    invoke-virtual {v1}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
