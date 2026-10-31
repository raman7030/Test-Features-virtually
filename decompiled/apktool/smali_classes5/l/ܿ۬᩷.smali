.class public Ll/ܿ۬᩷;
.super Ll/ᩳۡ;
.source "Z99C"


# instance fields
.field public ᩶:Ljava/lang/String;

.field public ᩸:Z

.field public ᩹:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 30
    invoke-direct {p0, p1, p2, v0}, Ll/ܿ۬᩷;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .line 34
    invoke-direct {p0, p1, p2, p3}, Ll/ᩳۡ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 35
    sget-object p3, Ll/᩵᩸᩷;->ۜ:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 p3, 0x1

    .line 36
    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Ll/ܿ۬᩷;->᩶:Ljava/lang/String;

    const/4 v0, 0x0

    .line 37
    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Ll/ܿ۬᩷;->᩸:Z

    .line 38
    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    .line 40
    invoke-static {p3}, Ll/ᩳ۬᩷;->ܽ(Ljava/lang/String;)Ll/ܽ۬᩷;

    move-result-object p2

    invoke-virtual {p2}, Ll/ܽ۬᩷;->֫()I

    move-result p2

    invoke-static {p1, p2}, Ll/֨ۙ;->֫(Landroid/content/Context;I)I

    move-result p2

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p3

    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object p3

    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 42
    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 43
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 44
    invoke-virtual {v1, p2}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 45
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/᩸֡᩷;->֫(Landroid/content/Context;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    :goto_0
    const/high16 v2, 0x3f000000    # 0.5f

    add-float/2addr v2, p3

    float-to-int v2, v2

    if-eqz v0, :cond_1

    const v0, -0x7f99999a

    goto :goto_1

    :cond_1
    const v0, -0x7f777778

    .line 46
    :goto_1
    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    const/high16 v0, 0x41a00000    # 20.0f

    mul-float p3, p3, v0

    .line 47
    invoke-virtual {v1, p3}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 48
    invoke-virtual {p0, v1}, Ll/ᩳۡ;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 49
    invoke-static {p2}, Ll/۟۫ۡ;->֫(I)I

    move-result p2

    const/16 p3, 0xdc

    if-le p2, p3, :cond_2

    const p2, 0x7f080166

    .line 50
    invoke-static {p1, p2}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ۬᩷;->᩹:Landroid/graphics/drawable/Drawable;

    return-void

    :cond_2
    const p2, 0x7f080167

    .line 52
    invoke-static {p1, p2}, Ll/᩸ۗۡ;->֫(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ܿ۬᩷;->᩹:Landroid/graphics/drawable/Drawable;

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 73
    invoke-super {p0, p1}, Landroid/widget/ImageView;->onDraw(Landroid/graphics/Canvas;)V

    .line 74
    iget-boolean v0, p0, Ll/ܿ۬᩷;->᩸:Z

    if-nez v0, :cond_0

    return-void

    .line 78
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    mul-int/lit8 v2, v1, 0x2

    .line 80
    div-int/lit8 v2, v2, 0x3

    sub-int/2addr v0, v2

    .line 81
    div-int/lit8 v0, v0, 0x2

    sub-int/2addr v1, v2

    .line 82
    div-int/lit8 v1, v1, 0x2

    add-int v3, v0, v2

    add-int/2addr v2, v1

    .line 83
    iget-object v4, p0, Ll/ܿ۬᩷;->᩹:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4, v0, v1, v3, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 84
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final ֫(Z)V
    .locals 1

    .line 57
    iget-boolean v0, p0, Ll/ܿ۬᩷;->᩸:Z

    if-eq v0, p1, :cond_0

    .line 58
    iput-boolean p1, p0, Ll/ܿ۬᩷;->᩸:Z

    .line 59
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_0
    return-void
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ܿ۬᩷;->᩶:Ljava/lang/String;

    return-object v0
.end method
