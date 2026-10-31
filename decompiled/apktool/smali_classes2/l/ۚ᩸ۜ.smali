.class public final Ll/ۚ᩸ۜ;
.super Landroid/graphics/drawable/Drawable;
.source "N8FX"


# instance fields
.field public final ֫:Ll/᩸ۖܳ;

.field public final ۧ:Landroid/graphics/drawable/Drawable;


# direct methods
.method public constructor <init>(Ll/᩸ۖܳ;)V
    .locals 0

    .line 20
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 21
    iput-object p1, p0, Ll/ۚ᩸ۜ;->֫:Ll/᩸ۖܳ;

    const p1, 0x7f08027b

    .line 22
    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Ll/ۚ᩸ۜ;->ۧ:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public static ֫()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 26
    new-instance v0, Ll/ۚ᩸ۜ;

    sget-object v1, Ll/᩶ۖܳ;->۟֫:Ll/᩸ۖܳ;

    invoke-direct {v0, v1}, Ll/ۚ᩸ۜ;-><init>(Ll/᩸ۖܳ;)V

    return-object v0
.end method

.method public static ۧ()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 30
    new-instance v0, Ll/ۚ᩸ۜ;

    sget-object v1, Ll/᩶ۖܳ;->ܰ֫:Ll/᩸ۖܳ;

    invoke-direct {v0, v1}, Ll/ۚ᩸ۜ;-><init>(Ll/᩸ۖܳ;)V

    return-object v0
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 7

    .line 35
    iget-object v0, p0, Ll/ۚ᩸ۜ;->֫:Ll/᩸ۖܳ;

    invoke-virtual {v0}, Ll/᩸ۖܳ;->֫()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 36
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getDirtyBounds()Landroid/graphics/Rect;

    move-result-object v1

    .line 37
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    div-int/lit8 v2, v2, 0xa

    .line 38
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    move-result v3

    mul-int/lit8 v3, v3, 0x3

    div-int/lit8 v3, v3, 0xa

    .line 39
    iget v4, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v2

    iget v5, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v3

    iget v6, v1, Landroid/graphics/Rect;->right:I

    sub-int/2addr v6, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v1, v3

    iget-object v2, p0, Ll/ۚ᩸ۜ;->ۧ:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v2, v4, v5, v6, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 41
    invoke-virtual {v0}, Ll/᩸ۖܳ;->ۧ()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 42
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    const/16 v0, 0x200

    return v0
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    const/16 v0, 0x200

    return v0
.end method

.method public final getOpacity()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public final setAlpha(I)V
    .locals 0

    return-void
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 0

    return-void
.end method
