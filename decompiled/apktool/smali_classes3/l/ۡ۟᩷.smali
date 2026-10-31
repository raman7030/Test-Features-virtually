.class public final Ll/ۡ۟᩷;
.super Ll/ۗ۬ۧ;
.source "M1KQ"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۗ:Landroid/widget/TextView;

.field public final synthetic ۙ:Ll/᩵۟᩷;

.field public ᩶:I

.field public final ᩸:Landroid/view/View;

.field public final ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/᩵۟᩷;Landroid/view/View;)V
    .locals 0

    .line 681
    iput-object p1, p0, Ll/ۡ۟᩷;->ۙ:Ll/᩵۟᩷;

    .line 682
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a0278

    .line 683
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۡ۟᩷;->᩹:Landroid/widget/ImageView;

    const p1, 0x7f0a0631

    .line 684
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۡ۟᩷;->ۗ:Landroid/widget/TextView;

    const p1, 0x7f0a010e

    .line 685
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ۟᩷;->᩸:Landroid/view/View;

    .line 686
    invoke-static {p2}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    .line 687
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 692
    sget-object p1, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 695
    :cond_0
    iget p1, p0, Ll/ۡ۟᩷;->᩶:I

    iget-object v0, p0, Ll/ۡ۟᩷;->ۙ:Ll/᩵۟᩷;

    if-eqz p1, :cond_4

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    :goto_0
    return-void

    .line 718
    :cond_1
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    new-instance v1, Ll/ۢ۟᩷;

    invoke-direct {v1, v0}, Ll/ۢ۟᩷;-><init>(Ll/᩵۟᩷;)V

    invoke-virtual {p1, v1}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/Runnable;)V

    return-void

    .line 713
    :cond_2
    new-instance p1, Ll/ۛ᩺᩷;

    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object v1

    check-cast v1, Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/᩵۟᩷;->ᩳ(Ll/᩵۟᩷;)Ll/᩵ۨ᩷;

    move-result-object v2

    invoke-direct {p1, v1, v2}, Ll/ۛ᩺᩷;-><init>(Ll/ܿۛ᩷;Ll/᩵ۨ᩷;)V

    .line 714
    invoke-virtual {p1, v0}, Ll/ۛ᩺᩷;->֫(Ll/᩵۟᩷;)V

    .line 715
    invoke-virtual {p1}, Ll/ۛ᩺᩷;->֫()V

    return-void

    .line 710
    :cond_3
    invoke-static {v0}, Ll/᩵۟᩷;->ۘ(Ll/᩵۟᩷;)V

    return-void

    .line 697
    :cond_4
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    .line 698
    invoke-virtual {p1}, Ll/ܿۛ᩷;->ܿ֫()Z

    move-result p1

    if-eqz p1, :cond_5

    const p1, 0x7f120808

    .line 699
    invoke-virtual {v0, p1}, Ll/᩵۟᩷;->֫(I)V

    return-void

    .line 701
    :cond_5
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p1, 0x7f120491

    .line 702
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    const p1, 0x7f120807

    .line 703
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(I)V

    new-instance p1, Ll/᩷۟᩷;

    invoke-direct {p1, p0}, Ll/᩷۟᩷;-><init>(Ll/ۡ۟᩷;)V

    const v1, 0x7f12070a

    .line 704
    invoke-virtual {v0, v1, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 705
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 706
    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void
.end method
