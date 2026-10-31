.class public final Ll/ۨۜۢ;
.super Ll/ۗ۬ۧ;
.source "O1JS"


# instance fields
.field public ֫:Landroid/view/View;

.field public ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 754
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a05e2

    .line 755
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ۨۜۢ;->ۧ:Landroid/widget/TextView;

    const v0, 0x7f0a03ae

    .line 756
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Ll/ۨۜۢ;->֫:Landroid/view/View;

    return-void
.end method
