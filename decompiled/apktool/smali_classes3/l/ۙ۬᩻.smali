.class public final Ll/ۙ۬᩻;
.super Ll/ۗ۬ۧ;
.source "J6WT"


# instance fields
.field public final ֫:Landroid/widget/TextView;

.field public final ۧ:Landroid/widget/TextView;

.field public final synthetic ܽ:Ll/ۗ۬᩻;


# direct methods
.method public constructor <init>(Ll/ۗ۬᩻;Landroid/view/View;)V
    .locals 0

    .line 185
    iput-object p1, p0, Ll/ۙ۬᩻;->ܽ:Ll/ۗ۬᩻;

    .line 186
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const p1, 0x7f0a0631

    .line 187
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۙ۬᩻;->ۧ:Landroid/widget/TextView;

    const p1, 0x7f0a013d

    .line 188
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/ۙ۬᩻;->֫:Landroid/widget/TextView;

    .line 189
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 190
    new-instance p1, Ll/᩶۬᩻;

    invoke-direct {p1, p0}, Ll/᩶۬᩻;-><init>(Ll/ۙ۬᩻;)V

    invoke-virtual {p2, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
