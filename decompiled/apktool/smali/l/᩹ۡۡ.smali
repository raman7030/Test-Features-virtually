.class public Ll/᩹ۡۡ;
.super Ll/ۚ᩸;
.source "H7TS"


# instance fields
.field public ۛ:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 27
    invoke-direct {p0, p1, p2}, Ll/ۚ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 20
    iput p1, p0, Ll/᩹ۡۡ;->ۛ:F

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 31
    invoke-direct {p0, p1, p2, p3}, Ll/ۚ᩸;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/high16 p1, 0x3f800000    # 1.0f

    .line 20
    iput p1, p0, Ll/᩹ۡۡ;->ۛ:F

    return-void
.end method


# virtual methods
.method public final setAlpha(F)V
    .locals 0

    .line 41
    invoke-super {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 42
    invoke-virtual {p0}, Ll/۟ܶ;->֫()V

    return-void
.end method

.method public final ֫(F)V
    .locals 0

    .line 35
    iput p1, p0, Ll/᩹ۡۡ;->ۛ:F

    .line 36
    invoke-virtual {p0}, Ll/۟ܶ;->֫()V

    return-void
.end method

.method public final ֫(Ll/ܿ᩸;)V
    .locals 7

    .line 47
    invoke-super {p0, p1}, Ll/۟ܶ;->֫(Ll/ܿ᩸;)V

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 50
    :goto_0
    iget v3, p0, Ll/۟ܶ;->᩸:I

    if-ge v2, v3, :cond_1

    .line 51
    iget-object v3, p0, Ll/۟ܶ;->᩶:[I

    aget v3, v3, v2

    .line 52
    invoke-virtual {p1, v3}, Ll/ܿ᩸;->getViewById(I)Landroid/view/View;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 54
    invoke-virtual {v3, v0}, Landroid/view/View;->setAlpha(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 58
    :cond_1
    iget v0, p0, Ll/᩹ۡۡ;->ۛ:F

    const/4 v2, 0x0

    .line 59
    :goto_1
    iget v3, p0, Ll/۟ܶ;->᩸:I

    if-ge v2, v3, :cond_b

    .line 60
    iget-object v3, p0, Ll/۟ܶ;->᩶:[I

    aget v3, v3, v2

    const v4, 0x7f0a0155

    if-eq v3, v4, :cond_b

    const v4, 0x7f0a0157

    if-ne v3, v4, :cond_2

    goto :goto_6

    .line 64
    :cond_2
    invoke-virtual {p1, v3}, Ll/ܿ᩸;->getViewById(I)Landroid/view/View;

    move-result-object v4

    if-nez v4, :cond_3

    goto :goto_5

    .line 68
    :cond_3
    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v5

    invoke-static {v5}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    instance-of v6, v5, Ll/᩸ۡۡ;

    if-nez v6, :cond_a

    const v6, 0x7f0a051a

    if-eq v3, v6, :cond_9

    const v6, 0x7f0a051d

    if-ne v3, v6, :cond_4

    goto :goto_3

    :cond_4
    const v6, 0x7f0a0519

    if-eq v3, v6, :cond_8

    const v6, 0x7f0a051c

    if-ne v3, v6, :cond_5

    goto :goto_2

    :cond_5
    const v6, 0x7f0a0518

    if-ne v3, v6, :cond_6

    .line 75
    new-instance v3, Ll/᩸ۡۡ;

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ll/᩸ۡۡ;-><init>(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_4

    :cond_6
    const v6, 0x7f0a051b

    if-ne v3, v6, :cond_7

    .line 77
    new-instance v3, Ll/᩸ۡۡ;

    invoke-direct {v3, v5, v1}, Ll/᩸ۡۡ;-><init>(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_4

    .line 79
    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 73
    :cond_8
    :goto_2
    new-instance v3, Ll/᩸ۡۡ;

    const/4 v6, 0x3

    invoke-direct {v3, v5, v6}, Ll/᩸ۡۡ;-><init>(Landroid/graphics/drawable/Drawable;I)V

    goto :goto_4

    .line 71
    :cond_9
    :goto_3
    new-instance v3, Ll/᩸ۡۡ;

    const/4 v6, 0x1

    invoke-direct {v3, v5, v6}, Ll/᩸ۡۡ;-><init>(Landroid/graphics/drawable/Drawable;I)V

    :goto_4
    move-object v5, v3

    .line 81
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 83
    :cond_a
    check-cast v5, Ll/᩸ۡۡ;

    .line 84
    invoke-virtual {v5, v0}, Ll/᩸ۡۡ;->֫(F)V

    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_b
    :goto_6
    return-void
.end method
