.class public final Ll/ۗ۟᩷;
.super Ll/ۗ۬ۧ;
.source "O1JS"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final ۙ:Landroid/widget/TextView;

.field public final synthetic ᩶:Ll/ۛ۟᩷;

.field public final ᩸:Landroid/widget/ImageView;

.field public ᩹:I


# direct methods
.method public constructor <init>(Ll/ۛ۟᩷;Landroid/view/View;)V
    .locals 0

    .line 573
    iput-object p1, p0, Ll/ۗ۟᩷;->᩶:Ll/ۛ۟᩷;

    .line 574
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a0278

    .line 575
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ۗ۟᩷;->᩸:Landroid/widget/ImageView;

    const p1, 0x7f0a0631

    .line 576
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۗ۟᩷;->ۙ:Landroid/widget/TextView;

    .line 577
    invoke-static {p2}, Ll/᩶ۖ᩷;->ۧ(Landroid/view/View;)V

    .line 578
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 583
    sget-object p1, Ll/ܰܳۡ;->ۢ֫:Ll/ۡۤۡ;

    invoke-virtual {p1}, Ll/ۡۤۡ;->ܽ()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 586
    :cond_0
    iget p1, p0, Ll/ۗ۟᩷;->᩹:I

    iget-object v0, p0, Ll/ۗ۟᩷;->᩶:Ll/ۛ۟᩷;

    if-eqz p1, :cond_5

    const/4 v1, 0x1

    if-eq p1, v1, :cond_4

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    const/4 v1, 0x3

    if-eq p1, v1, :cond_2

    const/4 v1, 0x4

    if-eq p1, v1, :cond_1

    :goto_0
    return-void

    .line 611
    :cond_1
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v0, Ll/᩵ۚۢ;

    invoke-direct {v0, p1}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    const p1, 0x7f120b7b

    .line 612
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->ۧ(I)V

    const p1, 0x7f120185

    .line 613
    invoke-virtual {v0, p1}, Ll/᩵ۚۢ;->֫(I)V

    const p1, 0x7f12015e

    const/4 v1, 0x0

    .line 614
    invoke-virtual {v0, p1, v1}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    new-instance p1, Ll/ۙ۟᩷;

    invoke-direct {p1, p0}, Ll/ۙ۟᩷;-><init>(Ll/ۗ۟᩷;)V

    const v1, 0x7f12070a

    .line 615
    invoke-virtual {v0, v1, p1}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    invoke-virtual {v0}, Ll/᩵ۚۢ;->ܽ()Ll/֡ۚۢ;

    return-void

    .line 606
    :cond_2
    invoke-static {v0}, Ll/ۛ۟᩷;->ᩳ(Ll/ۛ۟᩷;)Ljava/util/Stack;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Stack;->pop()Ljava/lang/Object;

    .line 607
    invoke-static {v0}, Ll/ۛ۟᩷;->ۜ(Ll/ۛ۟᩷;)V

    .line 608
    invoke-static {v0}, Ll/ۛ۟᩷;->ܳ(Ll/ۛ۟᩷;)V

    return-void

    .line 599
    :cond_3
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    new-instance v0, Ll/᩶۟᩷;

    invoke-direct {v0, p0}, Ll/᩶۟᩷;-><init>(Ll/ۗ۟᩷;)V

    invoke-virtual {p1, v0}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/Runnable;)V

    return-void

    .line 593
    :cond_4
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    new-instance v0, Ll/᩹۟᩷;

    invoke-direct {v0, p0}, Ll/᩹۟᩷;-><init>(Ll/ۗ۟᩷;)V

    invoke-virtual {p1, v0}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/Runnable;)V

    return-void

    .line 588
    :cond_5
    invoke-virtual {v0}, Ll/ۡ᩻֫;->requireActivity()Ll/֡᩻֫;

    move-result-object p1

    check-cast p1, Ll/ܿۛ᩷;

    new-instance v0, Ll/᩸۟᩷;

    invoke-direct {v0, p0}, Ll/᩸۟᩷;-><init>(Ll/ۗ۟᩷;)V

    invoke-virtual {p1, v0}, Ll/ܿۛ᩷;->ܽ(Ljava/lang/Runnable;)V

    return-void
.end method
