.class public final Ll/ᩳۙ᩷;
.super Ll/ۗ۬ۧ;
.source "T12U"


# instance fields
.field public final ֫:Landroid/widget/ImageView;

.field public final ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 156
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a05e4

    .line 157
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ᩳۙ᩷;->ۧ:Landroid/widget/TextView;

    const v0, 0x7f0a0288

    .line 158
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Ll/ᩳۙ᩷;->֫:Landroid/widget/ImageView;

    return-void
.end method
