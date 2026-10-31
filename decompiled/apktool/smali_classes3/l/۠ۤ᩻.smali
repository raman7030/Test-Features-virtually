.class public final Ll/۠ۤ᩻;
.super Ll/ۗ۬ۧ;
.source "M6WW"


# instance fields
.field public final ֫:Landroid/widget/TextView;

.field public final ۧ:Landroid/view/View;

.field public final ܽ:Landroid/widget/TextView;

.field public final synthetic ᩳ:Ll/ܶۤ᩻;


# direct methods
.method public constructor <init>(Ll/ܶۤ᩻;Landroid/view/View;)V
    .locals 1

    .line 329
    iput-object p1, p0, Ll/۠ۤ᩻;->ᩳ:Ll/ܶۤ᩻;

    .line 330
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 331
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    const p1, 0x7f0a0631

    .line 332
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/۠ۤ᩻;->ܽ:Landroid/widget/TextView;

    const p1, 0x7f0a013d

    .line 333
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/۠ۤ᩻;->֫:Landroid/widget/TextView;

    const p1, 0x7f0a0163

    .line 334
    invoke-virtual {p2, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/۠ۤ᩻;->ۧ:Landroid/view/View;

    .line 335
    new-instance v0, Ll/ۚۤ᩻;

    invoke-direct {v0, p0}, Ll/ۚۤ᩻;-><init>(Ll/۠ۤ᩻;)V

    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 339
    new-instance p2, Ll/֨ۤ᩻;

    invoke-direct {p2, p0}, Ll/֨ۤ᩻;-><init>(Ll/۠ۤ᩻;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method
