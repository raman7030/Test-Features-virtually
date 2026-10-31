.class public final Ll/ܿ᩸ܳ;
.super Ll/ۗ۬ۧ;
.source "J7C4"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final ᩸:Landroid/widget/ImageView;

.field public final ᩹:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Landroid/view/View;)V
    .locals 1

    .line 124
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 125
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    const v0, 0x7f0a0631

    .line 126
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ܿ᩸ܳ;->᩹:Landroid/widget/TextView;

    const v0, 0x7f0a0163

    .line 127
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/ܿ᩸ܳ;->᩸:Landroid/widget/ImageView;

    const v0, 0x7f0801ee

    .line 128
    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x77

    .line 129
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 130
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 131
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    .line 141
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ll/֫ۗۧ;

    if-eqz p2, :cond_0

    check-cast p1, Ll/֫ۗۧ;

    .line 142
    invoke-virtual {p1, p0}, Ll/֫ۗۧ;->ۧ(Ll/ۗ۬ۧ;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ܰܶܳ;Ll/֫ۗۧ;)V
    .locals 1

    .line 135
    iget-object v0, p0, Ll/ܿ᩸ܳ;->᩹:Landroid/widget/TextView;

    iget-object p1, p1, Ll/ܰܶܳ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 136
    iget-object p1, p0, Ll/ܿ᩸ܳ;->᩸:Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method
