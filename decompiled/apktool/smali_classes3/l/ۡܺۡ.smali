.class public Ll/ۡܺۡ;
.super Landroid/view/View;
.source "L5RE"


# instance fields
.field public ۗ:Landroid/graphics/Path;

.field public ۙ:Landroid/graphics/Paint;

.field public ۬:Z

.field public ᩶:I

.field public ᩸:Z

.field public ᩹:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Ll/ۡܺۡ;->᩶:I

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Ll/ۡܺۡ;->۬:Z

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 56
    :cond_0
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    .line 57
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Ll/ۡܺۡ;->ۙ:Landroid/graphics/Paint;

    .line 58
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 42
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x0

    .line 19
    iput p1, p0, Ll/ۡܺۡ;->᩶:I

    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Ll/ۡܺۡ;->۬:Z

    .line 53
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 56
    :cond_0
    new-instance p2, Landroid/graphics/Path;

    invoke-direct {p2}, Landroid/graphics/Path;-><init>()V

    iput-object p2, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    .line 57
    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    iput-object p2, p0, Ll/ۡܺۡ;->ۙ:Landroid/graphics/Paint;

    .line 58
    invoke-virtual {p2, p1}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    return-void
.end method


# virtual methods
.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 68
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 69
    iget-boolean v0, p0, Ll/ۡܺۡ;->۬:Z

    if-eqz v0, :cond_2

    .line 70
    iget-object v0, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    .line 72
    iget v1, p0, Ll/ۡܺۡ;->᩹:I

    int-to-float v1, v1

    iget v2, p0, Ll/ۡܺۡ;->᩶:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    .line 74
    iget-object v2, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    const/4 v3, 0x0

    invoke-virtual {v2, v3, v3}, Landroid/graphics/Path;->lineTo(FF)V

    const/high16 v2, 0x3f000000    # 0.5f

    cmpg-float v2, v1, v2

    if-gez v2, :cond_0

    .line 77
    iget v2, p0, Ll/ۡܺۡ;->᩹:I

    goto :goto_0

    .line 79
    :cond_0
    iget v2, p0, Ll/ۡܺۡ;->᩶:I

    iget v4, p0, Ll/ۡܺۡ;->᩹:I

    sub-int/2addr v2, v4

    :goto_0
    int-to-float v0, v0

    .line 80
    iget-boolean v4, p0, Ll/ۡܺۡ;->᩸:Z

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/high16 v4, 0x3f800000    # 1.0f

    sub-float v1, v4, v1

    :goto_1
    mul-float v1, v1, v0

    int-to-float v2, v2

    iget-object v4, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    invoke-virtual {v4, v1, v2, v0, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    .line 81
    iget-object v1, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    invoke-virtual {v1, v0, v3}, Landroid/graphics/Path;->lineTo(FF)V

    .line 83
    iget-object v0, p0, Ll/ۡܺۡ;->ۗ:Landroid/graphics/Path;

    iget-object v1, p0, Ll/ۡܺۡ;->ۙ:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_2
    return-void
.end method

.method public final ֫(I)V
    .locals 0

    .line 92
    iput p1, p0, Ll/ۡܺۡ;->᩹:I

    return-void
.end method

.method public final ֫(Z)V
    .locals 0

    .line 28
    iput-boolean p1, p0, Ll/ۡܺۡ;->᩸:Z

    return-void
.end method

.method public final ۧ(I)V
    .locals 0

    mul-int/lit8 p1, p1, 0x2

    .line 88
    iput p1, p0, Ll/ۡܺۡ;->᩶:I

    return-void
.end method
