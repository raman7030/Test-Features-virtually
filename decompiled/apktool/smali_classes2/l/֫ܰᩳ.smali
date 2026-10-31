.class public final Ll/֫ܰᩳ;
.super Ljava/lang/Object;
.source "J5IM"


# instance fields
.field public ֫:Z

.field public ۧ:I

.field public ܽ:I


# virtual methods
.method public final ֫(Landroid/graphics/Canvas;IIIFZLl/֫ۖܽ;Ll/ۧۧܿ;Ll/᩺֫ܿ;)V
    .locals 4

    .line 13
    iget-boolean v0, p0, Ll/֫ܰᩳ;->֫:Z

    if-eqz v0, :cond_5

    .line 14
    iget v0, p0, Ll/֫ܰᩳ;->ܽ:I

    .line 15
    iget v1, p0, Ll/֫ܰᩳ;->ۧ:I

    if-gt p2, v0, :cond_0

    if-ge p3, v0, :cond_2

    :cond_0
    if-gt p2, v1, :cond_1

    if-ge p3, v1, :cond_2

    :cond_1
    if-le p2, v0, :cond_5

    if-ge p3, v1, :cond_5

    .line 19
    :cond_2
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 20
    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 21
    check-cast p8, Ll/᩶ۤᩳ;

    const/4 v3, 0x0

    invoke-virtual {p8, p2, v3, v0}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result v0

    .line 22
    invoke-virtual {p8, p2, v3, v2}, Ll/᩶ۤᩳ;->֫(IFI)F

    move-result p2

    if-ge p3, v1, :cond_4

    if-eqz p6, :cond_3

    if-ne p3, p4, :cond_4

    .line 24
    :cond_3
    iget p3, p9, Ll/᩺֫ܿ;->ᩳ֫:F

    add-float/2addr p2, p3

    :cond_4
    move p4, p2

    .line 25
    invoke-virtual {p9}, Ll/ۢ۫ۡ;->ܿ()F

    move-result p2

    .line 26
    invoke-virtual {p9}, Ll/ۢ۫ۡ;->᩻()F

    move-result p3

    add-float/2addr p3, p5

    const p5, 0x3da3d70a    # 0.08f

    mul-float p5, p5, p2

    add-float/2addr p5, p3

    .line 27
    invoke-virtual {p9}, Ll/ۢ۫ۡ;->ܺ()I

    move-result p3

    const p6, -0x55000001

    and-int/2addr p3, p6

    invoke-virtual {p7, p3}, Landroid/graphics/Paint;->setColor(I)V

    const p3, 0x3d23d70a    # 0.04f

    mul-float p2, p2, p3

    .line 28
    invoke-virtual {p7, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    move p2, v0

    move p3, p5

    move-object p6, p7

    .line 29
    invoke-virtual/range {p1 .. p6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 30
    invoke-virtual {p7, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    :cond_5
    return-void
.end method
