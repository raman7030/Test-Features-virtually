.class public abstract Ll/ܳܶܳ;
.super Ll/ۗ۬ۧ;
.source "H5MU"

# interfaces
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final ۗ:Landroid/widget/TextView;

.field public ۙ:I

.field public final ۫:Landroid/view/View;

.field public final ۬:Landroid/widget/TextView;

.field public final ᩶:Ll/ۤܺ᩷;

.field public final ᩸:Ll/ۗܺ᩷;

.field public final ᩹:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;Landroid/view/View;)V
    .locals 1

    .line 32
    invoke-direct {p0, p2}, Ll/ۗ۬ۧ;-><init>(Landroid/view/View;)V

    .line 22
    sget v0, Ll/᩹֡᩷;->ᩴ֫:I

    iput v0, p0, Ll/ܳܶܳ;->ۙ:I

    .line 33
    iput-object p1, p0, Ll/ܳܶܳ;->᩸:Ll/ۗܺ᩷;

    .line 34
    invoke-static {p2}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 35
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    const v0, 0x7f0a0445

    .line 36
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Ll/ܳܶܳ;->۫:Landroid/view/View;

    const v0, 0x7f0a0278

    .line 37
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Ll/ۤܺ᩷;

    iput-object v0, p0, Ll/ܳܶܳ;->᩶:Ll/ۤܺ᩷;

    const v0, 0x7f0a03d6

    .line 38
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    const v0, 0x7f0a03b2

    .line 39
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Ll/ܳܶܳ;->ۗ:Landroid/widget/TextView;

    const v0, 0x7f0a0163

    .line 40
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/ImageView;

    iput-object p2, p0, Ll/ܳܶܳ;->᩹:Landroid/widget/ImageView;

    if-eqz p2, :cond_0

    .line 42
    invoke-virtual {p2, p0}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    const/4 v0, 0x1

    .line 43
    invoke-virtual {p2, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 44
    invoke-virtual {p2, v0}, Landroid/view/View;->setClickable(Z)V

    const v0, 0x7f0801ee

    .line 45
    invoke-static {p1, v0}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    const/16 v0, 0x77

    .line 46
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 47
    invoke-virtual {p2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 1

    .line 74
    iget-object v0, p0, Ll/ܳܶܳ;->᩹:Landroid/widget/ImageView;

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-nez p1, :cond_0

    .line 75
    invoke-virtual {p0}, Ll/ۗ۬ۧ;->getBindingAdapter()Ll/᩶ۗۧ;

    move-result-object p1

    instance-of p2, p1, Ll/ۗܶܳ;

    if-eqz p2, :cond_0

    check-cast p1, Ll/ۗܶܳ;

    .line 76
    invoke-virtual {p1, p0}, Ll/ۗܶܳ;->ۧ(Ll/ܳܶܳ;)V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public ֫(Landroid/content/res/Resources$Theme;)V
    .locals 2

    .line 52
    iget-object p1, p0, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-static {p1}, Ll/᩶ۖ᩷;->֫(Landroid/view/View;)V

    .line 53
    iget-object p1, p0, Ll/ܳܶܳ;->۬:Landroid/widget/TextView;

    sget-object v0, Ll/᩹֡᩷;->ۢ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 54
    iget-object p1, p0, Ll/ܳܶܳ;->ۗ:Landroid/widget/TextView;

    if-eqz p1, :cond_0

    .line 55
    sget-object v0, Ll/᩹֡᩷;->ۡ֫:Landroid/content/res/ColorStateList;

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 57
    :cond_0
    iget-object p1, p0, Ll/ܳܶܳ;->᩹:Landroid/widget/ImageView;

    if-eqz p1, :cond_1

    .line 58
    iget-object v0, p0, Ll/ܳܶܳ;->᩸:Ll/ۗܺ᩷;

    const v1, 0x7f0801ee

    invoke-static {v0, v1}, Ll/֨ۙ;->ܽ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    const/16 v1, 0x77

    .line 59
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V

    .line 60
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

.method public ֫()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/ᩴܶܳ;

    return v0
.end method

.method public ֫(Ll/ۗ۬ۧ;)Z
    .locals 1

    .line 69
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Don\'t support"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
