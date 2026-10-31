.class public final Ll/ܰۛۜ;
.super Ljava/lang/Object;
.source "B6MB"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final ۗ:Ll/᩹ۛۜ;

.field public volatile ۙ:Z

.field public final ۫:Ll/ܿܰۜ;

.field public final ۬:Ll/ܶۨۜ;

.field public final ᩶:Landroid/graphics/RectF;

.field public final ᩸:Ll/֨ۛۜ;

.field public final ᩹:Landroid/graphics/Bitmap;


# direct methods
.method public constructor <init>(Ll/ܶۨۜ;Landroid/graphics/Bitmap;Ll/᩹ۛۜ;Ll/ܿܰۜ;)V
    .locals 0

    .line 612
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 613
    iput-object p1, p0, Ll/ܰۛۜ;->۬:Ll/ܶۨۜ;

    .line 614
    iput-object p2, p0, Ll/ܰۛۜ;->᩹:Landroid/graphics/Bitmap;

    .line 615
    iput-object p3, p0, Ll/ܰۛۜ;->ۗ:Ll/᩹ۛۜ;

    .line 616
    iput-object p4, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    const/4 p2, 0x0

    .line 617
    iput-object p2, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    .line 618
    new-instance p2, Landroid/graphics/RectF;

    iget p3, p1, Ll/ܶۨۜ;->ۜ:I

    int-to-float p3, p3

    iget p1, p1, Ll/ܶۨۜ;->ۧ:I

    int-to-float p1, p1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p4, p3, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p2, p0, Ll/ܰۛۜ;->᩶:Landroid/graphics/RectF;

    return-void
.end method

.method public constructor <init>(Ll/ܶۨۜ;Ll/֨ۛۜ;)V
    .locals 2

    .line 621
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 622
    iput-object p1, p0, Ll/ܰۛۜ;->۬:Ll/ܶۨۜ;

    .line 623
    iput-object p2, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    const/4 p2, 0x0

    .line 624
    iput-object p2, p0, Ll/ܰۛۜ;->᩹:Landroid/graphics/Bitmap;

    iput-object p2, p0, Ll/ܰۛۜ;->ۗ:Ll/᩹ۛۜ;

    iput-object p2, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    .line 625
    new-instance p2, Landroid/graphics/RectF;

    iget v0, p1, Ll/ܶۨۜ;->ۜ:I

    int-to-float v0, v0

    iget p1, p1, Ll/ܶۨۜ;->ۧ:I

    int-to-float p1, p1

    const/4 v1, 0x0

    invoke-direct {p2, v1, v1, v0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    iput-object p2, p0, Ll/ܰۛۜ;->᩶:Landroid/graphics/RectF;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    const/4 v0, 0x0

    .line 663
    invoke-virtual {p0, v0}, Ll/ܰۛۜ;->֫(Ll/᩹ۛۜ;)V

    return-void
.end method

.method public final ֫(Landroid/graphics/RectF;FLl/᩶ۛۜ;JLl/ܽ᩺ۜ;)Ll/᩹ۨۜ;
    .locals 8

    .line 646
    iget-boolean v0, p0, Ll/ܰۛۜ;->ۙ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿܰۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 647
    iget-object v1, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-wide v5, p4

    move-object v7, p6

    invoke-virtual/range {v1 .. v7}, Ll/ܿܰۜ;->֫(Landroid/graphics/RectF;FLl/᩶ۛۜ;JLl/ܽ᩺ۜ;)Ll/᩹ۨۜ;

    move-result-object p1

    return-object p1

    .line 646
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "No SVG raster document"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    .line 651
    iget-boolean v0, p0, Ll/ܰۛۜ;->ۙ:Z

    if-eqz v0, :cond_0

    goto :goto_0

    .line 652
    :cond_0
    iget-object v0, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/ܰۛۜ;->᩶:Landroid/graphics/RectF;

    invoke-interface {v0, p1, v1, p2}, Ll/֨ۛۜ;->֫(Landroid/graphics/Canvas;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void

    .line 653
    :cond_1
    iget-object v0, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    invoke-virtual {v0, p1}, Ll/ܿܰۜ;->֫(Landroid/graphics/Canvas;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    return-void

    .line 654
    :cond_2
    iget-object v0, p0, Ll/ܰۛۜ;->᩹:Landroid/graphics/Bitmap;

    const/4 v1, 0x0

    iget-object v2, p0, Ll/ܰۛۜ;->᩶:Landroid/graphics/RectF;

    invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final ֫(Ll/᩹ۛۜ;)V
    .locals 1

    .line 668
    iget-boolean v0, p0, Ll/ܰۛۜ;->ۙ:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 669
    iput-boolean v0, p0, Ll/ܰۛۜ;->ۙ:Z

    .line 670
    iget-object v0, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Ll/֨ۛۜ;->֫(Ll/᩹ۛۜ;)V

    return-void

    .line 671
    :cond_1
    iget-object v0, p0, Ll/ܰۛۜ;->᩹:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    .line 672
    iget-object v0, p0, Ll/ܰۛۜ;->ۗ:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->close()V

    .line 673
    iget-object v0, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    invoke-virtual {v0, p1}, Ll/ܿܰۜ;->֫(Ll/᩹ۛۜ;)V

    return-void
.end method

.method public final ֫(ZLl/۠᩺ۜ;)V
    .locals 1

    .line 658
    iget-boolean v0, p0, Ll/ܰۛۜ;->ۙ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Ll/֨ۛۜ;->֫(ZLl/۠᩺ۜ;)V

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 637
    iget-boolean v0, p0, Ll/ܰۛۜ;->ۙ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/ܿܰۜ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܳ()J
    .locals 2

    .line 632
    iget-object v0, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    invoke-interface {v0}, Ll/֨ۛۜ;->ܽ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܽ()J
    .locals 2

    .line 634
    iget-object v0, p0, Ll/ܰۛۜ;->᩸:Ll/֨ۛۜ;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ll/֨ۛۜ;->֫()J

    move-result-wide v0

    return-wide v0

    :cond_0
    iget-object v0, p0, Ll/ܰۛۜ;->ۗ:Ll/᩹ۛۜ;

    invoke-virtual {v0}, Ll/᩹ۛۜ;->֫()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩳ()I
    .locals 1

    .line 640
    iget-object v0, p0, Ll/ܰۛۜ;->۫:Ll/ܿܰۜ;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    invoke-virtual {v0}, Ll/ܿܰۜ;->ܽ()I

    move-result v0

    return v0
.end method
