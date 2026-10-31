.class public final Ll/۟۫ۧ;
.super Ll/ۡۧ֫;
.source "U6BG"


# instance fields
.field public final synthetic ֫:Ll/ܳۤۧ;


# direct methods
.method public constructor <init>(Ll/ܳۤۧ;)V
    .locals 0

    .line 1515
    iput-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    invoke-direct {p0}, Ll/ۡۧ֫;-><init>()V

    return-void
.end method

.method private ֫()Z
    .locals 3

    .line 1622
    iget-object v0, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    iget-boolean v1, v0, Ll/ܳۤۧ;->ۤ:Z

    if-eqz v1, :cond_0

    goto :goto_0

    .line 1625
    :cond_0
    invoke-virtual {v0}, Ll/ܳۤۧ;->ۧ()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_1

    goto :goto_0

    .line 1628
    :cond_1
    invoke-virtual {v0}, Ll/ܳۤۧ;->ᩳ()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ll/ܳۤۧ;->ۧ()I

    move-result v1

    if-ne v1, v2, :cond_2

    goto :goto_0

    .line 1631
    :cond_2
    invoke-virtual {v0}, Ll/ܳۤۧ;->ᩳ()Z

    move-result v1

    if-nez v1, :cond_3

    invoke-virtual {v0}, Ll/ܳۤۧ;->ۧ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3

    :goto_0
    const/4 v0, 0x0

    return v0

    :cond_3
    return v2
.end method


# virtual methods
.method public final clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 2

    .line 1583
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    iget-object p3, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Ll/֫ۤۧ;

    .line 1585
    invoke-virtual {p1}, Ll/ܳۤۧ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1586
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1587
    invoke-virtual {p1}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p3

    iget-object p3, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getWidth()I

    move-result p3

    add-int/2addr p3, v1

    sub-int/2addr v0, p3

    .line 1588
    iget p1, p1, Ll/ܳۤۧ;->֫֫:I

    sub-int p1, v0, p1

    .line 1589
    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    .line 1591
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr v0, p3

    .line 1592
    iget p1, p1, Ll/ܳۤۧ;->֫֫:I

    add-int/2addr p1, v0

    .line 1593
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    return p1
.end method

.method public final clampViewPositionVertical(Landroid/view/View;II)I
    .locals 0

    .line 1602
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method

.method public final getViewHorizontalDragRange(Landroid/view/View;)I
    .locals 0

    .line 1577
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    iget p1, p1, Ll/ܳۤۧ;->֫֫:I

    return p1
.end method

.method public final onEdgeDragStarted(II)V
    .locals 1

    .line 1615
    invoke-direct {p0}, Ll/۟۫ۧ;->֫()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 1618
    :cond_0
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    iget-object v0, p1, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    iget-object p1, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v0, p2, p1}, Ll/ܺۧ֫;->֫(ILandroid/view/View;)V

    return-void
.end method

.method public final onEdgeTouched(II)V
    .locals 1

    .line 1607
    invoke-direct {p0}, Ll/۟۫ۧ;->֫()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    .line 1610
    :cond_0
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    iget-object v0, p1, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    iget-object p1, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {v0, p2, p1}, Ll/ܺۧ֫;->֫(ILandroid/view/View;)V

    return-void
.end method

.method public final onViewCaptured(Landroid/view/View;I)V
    .locals 5

    .line 529
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    .line 530
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 531
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    const/4 v4, 0x4

    if-ne v3, v4, :cond_0

    .line 532
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final onViewDragStateChanged(I)V
    .locals 2

    .line 1529
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    iget-object v0, p1, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    invoke-virtual {v0}, Ll/ܺۧ֫;->᩷()I

    move-result v0

    if-nez v0, :cond_1

    .line 1530
    iget v0, p1, Ll/ܳۤۧ;->۟:F

    const/high16 v1, 0x3f800000    # 1.0f

    cmpl-float v0, v0, v1

    if-nez v0, :cond_0

    .line 1531
    iget-object v0, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v0}, Ll/ܳۤۧ;->ᩳ(Landroid/view/View;)V

    .line 1532
    iget-object v0, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v0}, Ll/ܳۤۧ;->֫(Landroid/view/View;)V

    const/4 v0, 0x0

    .line 1533
    iput-boolean v0, p1, Ll/ܳۤۧ;->ܰ:Z

    return-void

    .line 1535
    :cond_0
    iget-object v0, p1, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p1, v0}, Ll/ܳۤۧ;->ۧ(Landroid/view/View;)V

    const/4 v0, 0x1

    .line 1536
    iput-boolean v0, p1, Ll/ܳۤۧ;->ܰ:Z

    :cond_1
    return-void
.end method

.method public final onViewPositionChanged(Landroid/view/View;IIII)V
    .locals 0

    .line 1549
    iget-object p1, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    invoke-virtual {p1, p2}, Ll/ܳۤۧ;->֫(I)V

    .line 1550
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final onViewReleased(Landroid/view/View;FF)V
    .locals 4

    .line 1555
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Ll/֫ۤۧ;

    .line 1558
    iget-object v0, p0, Ll/۟۫ۧ;->֫:Ll/ܳۤۧ;

    invoke-virtual {v0}, Ll/ܳۤۧ;->ܽ()Z

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    .line 1559
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v1, p3

    cmpg-float p3, p2, v3

    if-ltz p3, :cond_0

    cmpl-float p2, p2, v3

    if-nez p2, :cond_1

    .line 1560
    iget p2, v0, Ll/ܳۤۧ;->۟:F

    cmpl-float p2, p2, v2

    if-lez p2, :cond_1

    .line 1561
    :cond_0
    iget p2, v0, Ll/ܳۤۧ;->֫֫:I

    add-int/2addr v1, p2

    .line 1563
    :cond_1
    iget-object p2, v0, Ll/ܳۤۧ;->ۧ֫:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p2

    .line 1564
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result p3

    sub-int/2addr p3, v1

    sub-int/2addr p3, p2

    goto :goto_0

    .line 1566
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v1

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, v1

    cmpl-float p2, p2, v3

    if-gtz p2, :cond_3

    if-nez p2, :cond_4

    .line 1567
    iget p2, v0, Ll/ܳۤۧ;->۟:F

    cmpl-float p2, p2, v2

    if-lez p2, :cond_4

    .line 1568
    :cond_3
    iget p2, v0, Ll/ܳۤۧ;->֫֫:I

    add-int/2addr p3, p2

    .line 1571
    :cond_4
    :goto_0
    iget-object p2, v0, Ll/ܳۤۧ;->᩹:Ll/ܺۧ֫;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2, p3, p1}, Ll/ܺۧ֫;->ۧ(II)Z

    .line 1572
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final tryCaptureView(Landroid/view/View;I)Z
    .locals 0

    .line 1520
    invoke-direct {p0}, Ll/۟۫ۧ;->֫()Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1524
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/֫ۤۧ;

    iget-boolean p1, p1, Ll/֫ۤۧ;->ۧ:Z

    return p1
.end method
