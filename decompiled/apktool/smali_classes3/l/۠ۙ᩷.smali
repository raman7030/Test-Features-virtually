.class public final Ll/۠ۙ᩷;
.super Ll/ۗ۬ۧ;
.source "657B"


# instance fields
.field public final ֫:Landroid/widget/ImageView;

.field public final ۧ:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    .line 151
    invoke-direct {p0, p1}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    const v0, 0x7f0a0278

    .line 152
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Ll/۠ۙ᩷;->֫:Landroid/widget/ImageView;

    const v0, 0x7f0a0631

    .line 153
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    iput-object p1, p0, Ll/۠ۙ᩷;->ۧ:Landroid/widget/TextView;

    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 1

    .line 157
    iget-object v0, p0, Ll/۠ۙ᩷;->ۧ:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    .line 158
    iget-object p1, p0, Ll/۠ۙ᩷;->֫:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method
