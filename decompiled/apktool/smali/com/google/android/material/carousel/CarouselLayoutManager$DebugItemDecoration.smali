.class public Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;
.super Ll/۟ۗۧ;
.source "CarouselLayoutManager.java"


# instance fields
.field public keylines:Ljava/util/List;

.field public final linePaint:Landroid/graphics/Paint;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1688
    invoke-direct {p0}, Ll/۟ۗۧ;-><init>()V

    .line 1685
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->linePaint:Landroid/graphics/Paint;

    .line 1686
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->keylines:Ljava/util/List;

    const/high16 v1, 0x40a00000    # 5.0f

    .line 1689
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const v1, -0xff01

    .line 1690
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    return-void
.end method


# virtual methods
.method public onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V
    .locals 8

    .line 1700
    invoke-super {p0, p1, p2, p3}, Ll/۟ۗۧ;->onDrawOver(Landroid/graphics/Canvas;Ll/۬۬ۧ;Ll/᩸۬ۧ;)V

    .line 1701
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->linePaint:Landroid/graphics/Paint;

    .line 1702
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Ll/᩻۠ܺ;->۟ܳ:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    .line 1701
    invoke-virtual {p3, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1703
    iget-object p3, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->keylines:Ljava/util/List;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/KeylineState$Keyline;

    .line 1704
    iget-object v1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->linePaint:Landroid/graphics/Paint;

    const v2, -0xffff01

    iget v3, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->mask:F

    const v4, -0xff01

    invoke-static {v4, v2, v3}, Ll/۟ۗ;->֫(IIF)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 1705
    invoke-virtual {p2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-virtual {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->isHorizontal()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1706
    iget v3, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    .line 1708
    invoke-virtual {p2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->access$100(Lcom/google/android/material/carousel/CarouselLayoutManager;)I

    move-result v1

    int-to-float v4, v1

    iget v5, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    .line 1710
    invoke-virtual {p2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {v0}, Lcom/google/android/material/carousel/CarouselLayoutManager;->access$200(Lcom/google/android/material/carousel/CarouselLayoutManager;)I

    move-result v0

    int-to-float v6, v0

    iget-object v7, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->linePaint:Landroid/graphics/Paint;

    move-object v2, p1

    .line 1706
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    .line 1714
    :cond_0
    invoke-virtual {p2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->access$300(Lcom/google/android/material/carousel/CarouselLayoutManager;)I

    move-result v1

    int-to-float v3, v1

    iget v4, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    .line 1716
    invoke-virtual {p2}, Ll/۬۬ۧ;->getLayoutManager()Ll/ܿ۬ۧ;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/carousel/CarouselLayoutManager;

    invoke-static {v1}, Lcom/google/android/material/carousel/CarouselLayoutManager;->access$400(Lcom/google/android/material/carousel/CarouselLayoutManager;)I

    move-result v1

    int-to-float v5, v1

    iget v6, v0, Lcom/google/android/material/carousel/KeylineState$Keyline;->locOffset:F

    iget-object v7, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->linePaint:Landroid/graphics/Paint;

    move-object v2, p1

    .line 1713
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public setKeylines(Ljava/util/List;)V
    .locals 0

    .line 1695
    invoke-static {p1}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/material/carousel/CarouselLayoutManager$DebugItemDecoration;->keylines:Ljava/util/List;

    return-void
.end method
