.class public Ll/ۛۡۡ;
.super Ll/ᩳۡ;
.source "U2CZ"


# instance fields
.field public ᩸:I

.field public ᩹:Ll/ۤۡۡ;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, p2, v0}, Ll/ۛۡۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 32
    invoke-direct {p0}, Ll/ۛۡۡ;->ܽ()V

    .line 33
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    .line 35
    :cond_0
    new-instance p1, Ll/۫ۡۡ;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Ll/۫ۡۡ;-><init>(ILjava/lang/Object;)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public static synthetic ֫(Ll/ۛۡۡ;)V
    .locals 2

    .line 36
    iget v0, p0, Ll/ۛۡۡ;->᩸:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 37
    invoke-virtual {p0, v0}, Ll/ۛۡۡ;->֫(I)V

    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {p0, v1}, Ll/ۛۡۡ;->֫(I)V

    .line 40
    :goto_0
    iget-object v0, p0, Ll/ۛۡۡ;->᩹:Ll/ۤۡۡ;

    if-eqz v0, :cond_1

    .line 41
    iget p0, p0, Ll/ۛۡۡ;->᩸:I

    invoke-interface {v0, p0}, Ll/ۤۡۡ;->֫(I)V

    :cond_1
    return-void
.end method

.method private ܽ()V
    .locals 3

    .line 46
    iget v0, p0, Ll/ۛۡۡ;->᩸:I

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x7f080099

    .line 56
    invoke-virtual {p0, v0}, Ll/ᩳۡ;->setImageResource(I)V

    .line 57
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    .line 58
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget v1, Ll/᩹֡᩷;->֫:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    return-void

    :cond_1
    const v0, 0x7f08009b

    .line 51
    invoke-virtual {p0, v0}, Ll/ᩳۡ;->setImageResource(I)V

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_2

    .line 53
    invoke-virtual {p0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sget v1, Ll/᩹֡᩷;->֫:I

    sget-object v2, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :cond_2
    :goto_0
    return-void

    :cond_3
    const v0, 0x7f08009a

    .line 48
    invoke-virtual {p0, v0}, Ll/ᩳۡ;->setImageResource(I)V

    return-void
.end method


# virtual methods
.method public final onMeasure(II)V
    .locals 0

    .line 76
    invoke-super {p0, p1, p2}, Landroid/widget/ImageView;->onMeasure(II)V

    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result p1

    const/high16 p2, 0x3f800000    # 1.0f

    cmpl-float p2, p1, p2

    if-eqz p2, :cond_0

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result p2

    int-to-float p2, p2

    mul-float p2, p2, p1

    float-to-int p1, p2

    .line 80
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    :cond_0
    return-void
.end method

.method public setScaleX(F)V
    .locals 1
    .annotation build Ll/ۙᩳ;
    .end annotation

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const/16 p1, 0x8

    .line 67
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 70
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/ImageView;->setScaleX(F)V

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 93
    iget v0, p0, Ll/ۛۡۡ;->᩸:I

    if-eq v0, p1, :cond_0

    .line 94
    iput p1, p0, Ll/ۛۡۡ;->᩸:I

    .line 95
    invoke-direct {p0}, Ll/ۛۡۡ;->ܽ()V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۤۡۡ;)V
    .locals 0

    .line 104
    iput-object p1, p0, Ll/ۛۡۡ;->᩹:Ll/ۤۡۡ;

    return-void
.end method
