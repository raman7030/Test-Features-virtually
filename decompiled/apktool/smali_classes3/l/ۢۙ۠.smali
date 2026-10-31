.class public Ll/ۢۙ۠;
.super Ll/ᩳۡ;
.source "75EB"

# interfaces
.implements Ll/᩷ۙ۠;


# instance fields
.field public ᩸:Ll/ᩴۙ۠;

.field public ᩹:Landroid/widget/ImageView$ScaleType;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 44
    invoke-direct {p0, p1, p2, v0}, Ll/ۢۙ۠;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 48
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 49
    sget-object p1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 54
    iget-object p1, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object p1

    if-nez p1, :cond_1

    .line 55
    :cond_0
    new-instance p1, Ll/ᩴۙ۠;

    invoke-direct {p1, p0}, Ll/ᩴۙ۠;-><init>(Ll/ۢۙ۠;)V

    iput-object p1, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    .line 58
    :cond_1
    iget-object p1, p0, Ll/ۢۙ۠;->᩹:Landroid/widget/ImageView$ScaleType;

    if-eqz p1, :cond_2

    .line 59
    invoke-virtual {p0, p1}, Ll/ۢۙ۠;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Ll/ۢۙ۠;->᩹:Landroid/widget/ImageView$ScaleType;

    :cond_2
    return-void
.end method


# virtual methods
.method public final getScaleType()Landroid/widget/ImageView$ScaleType;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-virtual {v0}, Ll/ᩴۙ۠;->ۜ()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    return-object v0
.end method

.method public final onAttachedToWindow()V
    .locals 1

    .line 54
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v0

    if-nez v0, :cond_1

    .line 55
    :cond_0
    new-instance v0, Ll/ᩴۙ۠;

    invoke-direct {v0, p0}, Ll/ᩴۙ۠;-><init>(Ll/ۢۙ۠;)V

    iput-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    .line 58
    :cond_1
    iget-object v0, p0, Ll/ۢۙ۠;->᩹:Landroid/widget/ImageView$ScaleType;

    if-eqz v0, :cond_2

    .line 59
    invoke-virtual {p0, v0}, Ll/ۢۙ۠;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    const/4 v0, 0x0

    .line 60
    iput-object v0, p0, Ll/ۢۙ۠;->᩹:Landroid/widget/ImageView$ScaleType;

    .line 295
    :cond_2
    invoke-super {p0}, Landroid/widget/ImageView;->onAttachedToWindow()V

    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 1

    .line 288
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-virtual {v0}, Ll/ᩴۙ۠;->֫()V

    .line 289
    invoke-super {p0}, Landroid/widget/ImageView;->onDetachedFromWindow()V

    return-void
.end method

.method public final setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 175
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 176
    iget-object p1, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    if-eqz p1, :cond_0

    .line 177
    invoke-virtual {p1}, Ll/ᩴۙ۠;->᩷()V

    :cond_0
    return-void
.end method

.method public final setImageResource(I)V
    .locals 0

    .line 183
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageResource(I)V

    .line 184
    iget-object p1, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    if-eqz p1, :cond_0

    .line 185
    invoke-virtual {p1}, Ll/ᩴۙ۠;->᩷()V

    :cond_0
    return-void
.end method

.method public final setImageURI(Landroid/net/Uri;)V
    .locals 0

    .line 191
    invoke-super {p0, p1}, Ll/ᩳۡ;->setImageURI(Landroid/net/Uri;)V

    .line 192
    iget-object p1, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    if-eqz p1, :cond_0

    .line 193
    invoke-virtual {p1}, Ll/ᩴۙ۠;->᩷()V

    :cond_0
    return-void
.end method

.method public final setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-virtual {v0, p1}, Ll/ᩴۙ۠;->֫(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public final setScaleType(Landroid/widget/ImageView$ScaleType;)V
    .locals 1

    .line 244
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    if-eqz v0, :cond_0

    .line 245
    invoke-virtual {v0, p1}, Ll/ᩴۙ۠;->֫(Landroid/widget/ImageView$ScaleType;)V

    return-void

    .line 247
    :cond_0
    iput-object p1, p0, Ll/ۢۙ۠;->᩹:Landroid/widget/ImageView$ScaleType;

    return-void
.end method

.method public final ֫(F)V
    .locals 4

    .line 229
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    .line 618
    invoke-virtual {v0}, Ll/ᩴۙ۠;->ᩳ()Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 621
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v2, v3

    .line 622
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v1

    int-to-float v1, v1

    div-float/2addr v1, v3

    const/4 v3, 0x0

    .line 620
    invoke-virtual {v0, p1, v2, v1, v3}, Ll/ᩴۙ۠;->֫(FFFZ)V

    :cond_0
    return-void
.end method

.method public final ֫(FF)V
    .locals 1

    .line 169
    iget-object v0, p0, Ll/ۢۙ۠;->᩸:Ll/ᩴۙ۠;

    invoke-virtual {v0, p1, p2}, Ll/ᩴۙ۠;->ܽ(FF)V

    return-void
.end method
