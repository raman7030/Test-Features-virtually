.class public abstract Ll/֫۫ܿ;
.super Ljava/lang/Object;
.source "P5BR"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final ۙ:Landroid/widget/TextView;

.field public final ᩶:Landroid/widget/LinearLayout;

.field public final ᩸:Ll/֡ۚۢ;

.field public final ᩹:Ll/ۚۖۡ;


# direct methods
.method public constructor <init>(ILl/ۗܺ᩷;Ljava/lang/String;)V
    .locals 3

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d00e6

    .line 35
    invoke-virtual {p2, v0}, Ll/ۗܺ᩷;->֫(I)Landroid/view/View;

    move-result-object v0

    const v1, 0x7f0a0680

    .line 36
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Ll/֫۫ܿ;->᩶:Landroid/widget/LinearLayout;

    const v1, 0x7f0a0631

    .line 37
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Ll/֫۫ܿ;->ۙ:Landroid/widget/TextView;

    const v1, 0x7f0a017d

    .line 39
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Ll/ۚۖۡ;

    iput-object v1, p0, Ll/֫۫ܿ;->᩹:Ll/ۚۖۡ;

    .line 40
    sget v2, Ll/֡ۚۢ;->᩹:I

    .line 186
    new-instance v2, Ll/᩵ۚۢ;

    invoke-direct {v2, p2}, Ll/᩵ۚۢ;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-virtual {v2, v0}, Ll/᩵ۚۢ;->֫(Landroid/view/View;)V

    const/4 p2, 0x0

    .line 42
    invoke-virtual {v2, p2}, Ll/᩵ۚۢ;->֫(Z)V

    const p2, 0x7f12070a

    const/4 v0, 0x0

    .line 43
    invoke-virtual {v2, p2, v0}, Ll/᩵ۚۢ;->ᩳ(ILandroid/content/DialogInterface$OnClickListener;)V

    const p2, 0x7f12015e

    .line 44
    invoke-virtual {v2, p2, p0}, Ll/᩵ۚۢ;->ۧ(ILandroid/content/DialogInterface$OnClickListener;)V

    const/4 p2, -0x1

    if-eq p1, p2, :cond_0

    .line 46
    invoke-virtual {v2, p1, p0}, Ll/᩵ۚۢ;->ܽ(ILandroid/content/DialogInterface$OnClickListener;)V

    .line 47
    :cond_0
    invoke-virtual {v2}, Ll/᩵ۚۢ;->֫()Ll/֡ۚۢ;

    move-result-object p1

    iput-object p1, p0, Ll/֫۫ܿ;->᩸:Ll/֡ۚۢ;

    .line 48
    new-instance p2, Ll/۟۬ܿ;

    invoke-direct {p2, p0}, Ll/۟۬ܿ;-><init>(Ll/֫۫ܿ;)V

    invoke-virtual {p1, p2}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 58
    invoke-virtual {p1, p0}, Ll/֡ۚۢ;->֫(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 248
    invoke-virtual {v1, p3, v0}, Ll/ۚۖۡ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 1

    const/4 v0, -0x1

    .line 30
    invoke-direct {p0, v0, p1, p2}, Ll/֫۫ܿ;-><init>(ILl/ۗܺ᩷;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const/4 p1, -0x2

    if-ne p2, p1, :cond_0

    return-void

    .line 79
    :cond_0
    invoke-virtual {p0}, Ll/֫۫ܿ;->ᩳ()V

    return-void
.end method

.method public final onClick(Landroid/view/View;)V
    .locals 0

    .line 138
    invoke-virtual {p0}, Ll/֫۫ܿ;->ܿ()V

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    return-void
.end method

.method public final ֫()V
    .locals 1

    .line 91
    iget-object v0, p0, Ll/֫۫ܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 125
    iget-object v0, p0, Ll/֫۫ܿ;->ۙ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 1

    .line 63
    iget-object v0, p0, Ll/֫۫ܿ;->᩶:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final ֫(Landroid/view/View;I)V
    .locals 1

    .line 67
    iget-object v0, p0, Ll/֫۫ܿ;->᩶:Landroid/widget/LinearLayout;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    return-void
.end method

.method public final ۧ()Ll/ۚۖۡ;
    .locals 1

    .line 150
    iget-object v0, p0, Ll/֫۫ܿ;->᩹:Ll/ۚۖۡ;

    return-object v0
.end method

.method public final ܳ()V
    .locals 1

    .line 71
    iget-object v0, p0, Ll/֫۫ܿ;->᩹:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܳ()V

    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 95
    iget-object v0, p0, Ll/֫۫ܿ;->᩹:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->ܽ()Ll/۟᩺ᩳ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ܿ()V
.end method

.method public ᩳ()V
    .locals 0

    return-void
.end method

.method public final ᩻()V
    .locals 2

    .line 99
    iget-object v0, p0, Ll/֫۫ܿ;->᩹:Ll/ۚۖۡ;

    invoke-virtual {v0}, Ll/ۚۖۡ;->᩷()V

    .line 100
    iget-object v1, p0, Ll/֫۫ܿ;->᩸:Ll/֡ۚۢ;

    invoke-virtual {v1}, Ll/֡ۚۢ;->᩷()V

    .line 101
    invoke-virtual {v1}, Ll/֡ۚۢ;->ܿ()Landroid/widget/Button;

    move-result-object v1

    invoke-virtual {v1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 102
    invoke-virtual {v0}, Ll/ۚۖۡ;->ۧ()Ll/ۤۤᩳ;

    move-result-object v0

    invoke-static {v0}, Ll/ۙ᩸᩷;->ۧ(Landroid/view/View;)V

    return-void
.end method
