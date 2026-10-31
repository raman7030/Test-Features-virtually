.class public final Ll/ܰۨۜ;
.super Ljava/lang/Object;
.source "F6JW"


# instance fields
.field public final ֫:Landroid/graphics/Paint;

.field public final ۧ:F

.field public final ܽ:Landroid/graphics/Path;


# direct methods
.method public constructor <init>(F)V
    .locals 2

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Ll/ܰۨۜ;->֫:Landroid/graphics/Paint;

    .line 11
    new-instance v0, Landroid/graphics/Path;

    invoke-direct {v0}, Landroid/graphics/Path;-><init>()V

    iput-object v0, p0, Ll/ܰۨۜ;->ܽ:Landroid/graphics/Path;

    const/high16 v0, 0x41d00000    # 26.0f

    mul-float p1, p1, v0

    .line 14
    iput p1, p0, Ll/ܰۨۜ;->ۧ:F

    return-void
.end method


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;FF)V
    .locals 6

    const/high16 v0, -0x67000000

    .line 22
    iget-object v1, p0, Ll/ܰۨۜ;->֫:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 23
    iget v0, p0, Ll/ܰۨۜ;->ۧ:F

    invoke-virtual {p1, p2, p3, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 24
    iget-object v2, p0, Ll/ܰۨۜ;->ܽ:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->rewind()V

    const v3, 0x3e75c28f    # 0.24f

    mul-float v3, v3, v0

    sub-float v3, p2, v3

    const v4, 0x3edc28f6    # 0.43f

    mul-float v4, v4, v0

    sub-float v5, p3, v4

    .line 25
    invoke-virtual {v2, v3, v5}, Landroid/graphics/Path;->moveTo(FF)V

    const v5, 0x3ef5c28f    # 0.48f

    mul-float v0, v0, v5

    add-float/2addr v0, p2

    .line 26
    invoke-virtual {v2, v0, p3}, Landroid/graphics/Path;->lineTo(FF)V

    add-float/2addr v4, p3

    .line 27
    invoke-virtual {v2, v3, v4}, Landroid/graphics/Path;->lineTo(FF)V

    .line 28
    invoke-virtual {v2}, Landroid/graphics/Path;->close()V

    const/4 p2, -0x1

    .line 29
    invoke-virtual {v1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 30
    invoke-virtual {p1, v2, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final ֫(FFFF)Z
    .locals 0

    sub-float/2addr p1, p3

    sub-float/2addr p2, p4

    mul-float p1, p1, p1

    mul-float p2, p2, p2

    add-float/2addr p2, p1

    .line 18
    iget p1, p0, Ll/ܰۨۜ;->ۧ:F

    mul-float p1, p1, p1

    cmpg-float p1, p2, p1

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
