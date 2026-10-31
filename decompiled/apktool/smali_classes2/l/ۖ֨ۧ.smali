.class public final Ll/ۖ֨ۧ;
.super Ll/ۗ۬ۧ;
.source "28G3"


# instance fields
.field public final ֫:Landroid/view/View;

.field public final ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 2467
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 2468
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    .line 2470
    invoke-virtual {p1, v0}, Landroid/view/View;->setFocusable(Z)V

    :cond_0
    const v0, 0x7f0a01d1

    .line 2472
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ۖ֨ۧ;->ۧ:Landroid/widget/TextView;

    const v0, 0x7f0a01aa

    .line 2473
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۖ֨ۧ;->֫:Landroid/view/View;

    return-void
.end method
