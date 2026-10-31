.class public final Ll/᩸ۜᩳ;
.super Ljava/lang/Object;
.source "F5XL"


# instance fields
.field public final ֫:Landroid/widget/TextView;

.field public final ۧ:Landroid/widget/TextView;

.field public final ܽ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0a05e4

    .line 14
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩸ۜᩳ;->֫:Landroid/widget/TextView;

    const v0, 0x7f0a05ef

    .line 15
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/᩸ۜᩳ;->ܽ:Landroid/widget/TextView;

    const v0, 0x7f0a05f1

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/᩸ۜᩳ;->ۧ:Landroid/widget/TextView;

    return-void
.end method
