.class public final Ll/ۘۨᩳ;
.super Ljava/lang/Object;
.source "X68P"


# instance fields
.field public final synthetic ֡:Ll/۫ۨᩳ;

.field public ֨:F

.field public ֫:Ll/ۗۤᩳ;

.field public final ۖ:I

.field public ۘ:Z

.field public ۚ:F

.field public ۜ:Ll/ۗۤᩳ;

.field public ۠:Z

.field public volatile ۡ:Ll/ۙۨᩳ;

.field public final ۢ:Ll/۟᩺ᩳ;

.field public ۧ:Z

.field public ܳ:Ll/ᩴۨᩳ;

.field public ܶ:I

.field public ܺ:I

.field public volatile ܽ:Z

.field public ܿ:I

.field public ᩳ:Ll/ܶۘܿ;

.field public ᩴ:I

.field public ᩵:Z

.field public ᩷:Ll/۟᩸ᩳ;

.field public ᩸:I

.field public ᩻:Ll/ۗ۟ᩳ;


# direct methods
.method public constructor <init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/ۗۤᩳ;)V
    .locals 1

    .line 3434
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    .line 3435
    iput-object p2, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    .line 3436
    iput-object p3, p0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iput-object p3, p0, Ll/ۘۨᩳ;->ۜ:Ll/ۗۤᩳ;

    .line 3437
    invoke-virtual {p3}, Ll/ۗۤᩳ;->۬()I

    move-result p2

    const/4 v0, 0x0

    new-array v0, v0, [Ll/۠ۘܿ;

    invoke-static {p2, v0}, Ll/ܶۘܿ;->֫(I[Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object p2

    iput-object p2, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3438
    invoke-virtual {p3}, Ll/ۗۤᩳ;->۫()I

    move-result p2

    iput p2, p0, Ll/ۘۨᩳ;->ܿ:I

    .line 3439
    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۢ֫()I

    move-result p1

    iput p1, p0, Ll/ۘۨᩳ;->ۖ:I

    .line 3440
    iget-object p1, p3, Ll/ۗۤᩳ;->ܳ:Ll/ᩴۨᩳ;

    iput-object p1, p0, Ll/ۘۨᩳ;->ܳ:Ll/ᩴۨᩳ;

    return-void
.end method

.method private ֫(Ll/ۗۤᩳ;I)V
    .locals 3

    .line 3579
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget-object v2, v0, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-boolean v1, v1, Ll/᩺֫ܿ;->ܰۧ:Z

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Ll/ۜܺܿ;->ۢ()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    .line 3580
    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p1, p2, v0}, Ll/ۗۤᩳ;->ۧ(II)J

    move-result-wide p1

    const/16 v0, 0x20

    ushr-long v0, p1, v0

    long-to-int v1, v0

    long-to-int p2, p1

    .line 3581
    iget-object p1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {v2, p1, v1, p2}, Ll/ۜܺܿ;->֫(Ll/᩶᩸ᩳ;II)V

    :cond_0
    return-void
.end method

.method public static ֫(Ll/ۘۨᩳ;Ll/ۙۨᩳ;)V
    .locals 3

    .line 3588
    iget-object v0, p0, Ll/ۘۨᩳ;->ۡ:Ll/ۙۨᩳ;

    if-ne v0, p1, :cond_1

    iget-object v0, p1, Ll/ۙۨᩳ;->ۧ:Ll/ۗۤᩳ;

    invoke-virtual {p0, v0}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v2, p0, Ll/ۘۨᩳ;->ۜ:Ll/ۗۤᩳ;

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 3589
    :cond_0
    iget-object v1, p1, Ll/ۙۨᩳ;->ۧ:Ll/ۗۤᩳ;

    invoke-static {v0, v1}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Ll/ۗۤᩳ;)V

    .line 3590
    iget-object v0, p1, Ll/ۙۨᩳ;->ۧ:Ll/ۗۤᩳ;

    iput-object v0, p0, Ll/ۘۨᩳ;->ۜ:Ll/ۗۤᩳ;

    .line 3592
    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v1, p1, Ll/ۙۨᩳ;->ᩳ:Ll/ۙۤᩳ;

    invoke-virtual {v1}, Ll/ۙۤᩳ;->ܽ()I

    move-result v1

    iget-object v2, p1, Ll/ۙۨᩳ;->ᩳ:Ll/ۙۤᩳ;

    invoke-virtual {v2}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v2

    invoke-static {v0, v1, v2}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;II)V

    .line 3593
    iget-object v0, p1, Ll/ۙۨᩳ;->ᩳ:Ll/ۙۤᩳ;

    invoke-virtual {v0}, Ll/ۙۤᩳ;->֫()I

    move-result v0

    iput v0, p0, Ll/ۘۨᩳ;->ܺ:I

    const/4 v0, 0x1

    .line 3594
    iput-boolean v0, p1, Ll/ۙۨᩳ;->ܽ:Z

    .line 3595
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object p1, p1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v0, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {p1, v0}, Ll/ۜܺܿ;->ᩳ(Ll/᩶᩸ᩳ;)V

    .line 3596
    iget-object p0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final ֫(II)V
    .locals 5

    .line 3626
    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۙۧ()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3627
    :cond_0
    iget v1, p0, Ll/ۘۨᩳ;->ܺ:I

    invoke-virtual {v0}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    iput v1, p0, Ll/ۘۨᩳ;->ܺ:I

    .line 3628
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ll/۫ۨᩳ;->ۜ(I)I

    move-result p1

    .line 3629
    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v2

    add-int/2addr v2, p2

    iget p2, p0, Ll/ۘۨᩳ;->ܺ:I

    invoke-virtual {v1, v2, p2}, Ll/ۗۤᩳ;->֫(II)I

    move-result p2

    .line 3630
    iget-object v1, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    new-instance v2, Ll/ۙۤᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v3

    iget v4, p0, Ll/ۘۨᩳ;->ܺ:I

    invoke-direct {v2, p1, p2, v3, v4}, Ll/ۙۤᩳ;-><init>(IIII)V

    invoke-virtual {v1, v2}, Ll/ۗۤᩳ;->ۧ(Ll/ۙۤᩳ;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    .line 3631
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    move-result v1

    if-ne p1, v1, :cond_2

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v1

    if-ne p2, v1, :cond_2

    :goto_0
    return-void

    :cond_2
    const/4 v1, 0x1

    .line 3632
    iput-boolean v1, p0, Ll/ۘۨᩳ;->ۧ:Z

    .line 3633
    invoke-virtual {v0, p1, p2}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 3634
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final ֫(IIII)V
    .locals 9

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    return-void

    .line 3446
    :cond_0
    iget-object v0, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    .line 3447
    iget-object v1, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iget v3, p0, Ll/ۘۨᩳ;->ܿ:I

    if-ne v3, p4, :cond_1

    add-int/lit8 p4, p4, 0x1

    if-ne v0, p4, :cond_1

    .line 3448
    invoke-virtual {v1}, Ll/ܶۘܿ;->ᩳ()I

    move-result p4

    int-to-long v3, p4

    iget-object p4, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {p4}, Ljava/lang/CharSequence;->length()I

    move-result p4

    int-to-long v5, p4

    int-to-long v7, p3

    sub-long/2addr v5, v7

    int-to-long v7, p2

    add-long/2addr v5, v7

    cmp-long p4, v3, v5

    if-nez p4, :cond_1

    .line 3449
    iget-object p4, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    new-instance v1, Ll/۠ۘܿ;

    add-int/2addr p2, p1

    invoke-direct {v1, p1, p2, p3}, Ll/۠ۘܿ;-><init>(III)V

    invoke-virtual {p4, v1}, Ll/ܶۘܿ;->֫(Ll/۠ۘܿ;)Ll/ܶۘܿ;

    move-result-object p1

    iput-object p1, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    goto :goto_0

    .line 3450
    :cond_1
    iput-object v2, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3451
    :goto_0
    iput v0, p0, Ll/ۘۨᩳ;->ܿ:I

    .line 3452
    iput-object v2, p0, Ll/ۘۨᩳ;->ۡ:Ll/ۙۨᩳ;

    return-void
.end method

.method public final ֫(Landroid/view/MotionEvent;)V
    .locals 5

    .line 3601
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    .line 3602
    iget-object v1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    if-nez v0, :cond_0

    .line 3603
    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۙۧ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۘۨᩳ;->۠:Z

    .line 3604
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/ۘۨᩳ;->ۚ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/ۘۨᩳ;->֨:F

    goto/16 :goto_1

    :cond_0
    const/4 v2, 0x2

    if-ne v0, v2, :cond_3

    .line 3605
    iget-boolean v3, p0, Ll/ۘۨᩳ;->۠:Z

    if-eqz v3, :cond_3

    .line 3606
    iget v0, p0, Ll/ۘۨᩳ;->ۚ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    sub-float/2addr v0, v2

    float-to-int v0, v0

    iget v2, p0, Ll/ۘۨᩳ;->֨:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    sub-float/2addr v2, v3

    float-to-int v2, v2

    .line 3616
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 3617
    invoke-virtual {p0, v0, v2}, Ll/ۘۨᩳ;->֫(II)V

    goto :goto_0

    .line 3618
    :cond_1
    invoke-static {v1}, Ll/۫ۨᩳ;->ᩴ(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v3

    if-nez v3, :cond_2

    invoke-static {v1}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v3

    iget-object v4, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    if-ne v3, v4, :cond_2

    invoke-static {v1}, Ll/۫ۨᩳ;->۬(Ll/۫ۨᩳ;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 3619
    invoke-interface {v4}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    iget v4, p0, Ll/ۘۨᩳ;->ܶ:I

    if-ne v3, v4, :cond_2

    iget-object v3, v1, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v4, p0, Ll/ۘۨᩳ;->ۜ:Ll/ۗۤᩳ;

    if-ne v3, v4, :cond_2

    invoke-static {v1}, Ll/۫ۨᩳ;->۫֫(Ll/۫ۨᩳ;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 3620
    invoke-virtual {v1}, Landroid/view/View;->getScrollX()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1, v3}, Ll/۫ۨᩳ;->ۜ(I)I

    move-result v0

    invoke-virtual {v1}, Ll/۫ۨᩳ;->ۡ֫()I

    move-result v3

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Ll/۫ۨᩳ;->᩷(I)I

    move-result v2

    invoke-virtual {v1, v0, v2}, Ll/۫ۨᩳ;->scrollTo(II)V

    .line 3621
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 3607
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    iput v0, p0, Ll/ۘۨᩳ;->ۚ:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    iput p1, p0, Ll/ۘۨᩳ;->֨:F

    goto :goto_1

    :cond_3
    if-eq v0, v2, :cond_4

    const/4 p1, 0x0

    .line 3609
    iput-boolean p1, p0, Ll/ۘۨᩳ;->۠:Z

    :cond_4
    :goto_1
    return-void
.end method

.method public final ֫(Ll/ۗۤᩳ;Ljava/lang/Throwable;)V
    .locals 6

    .line 3638
    iget-object v0, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ll/۟᩸ᩳ;->close()V

    iput-object v1, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    .line 3639
    :cond_0
    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ᩴ(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v0

    const/4 v2, 0x0

    if-eq v0, p0, :cond_1

    .line 3640
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_16

    .line 3641
    iput-boolean v2, p0, Ll/ۘۨᩳ;->᩵:Z

    .line 3642
    :try_start_0
    iget-object p1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {p1, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3643
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨ()V

    return-void

    :catchall_0
    move-exception p1

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۨ()V

    throw p1

    .line 3647
    :cond_1
    iput-boolean v2, p0, Ll/ۘۨᩳ;->ۘ:Z

    .line 3649
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    if-nez p2, :cond_4

    iget-object v0, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iget v3, p0, Ll/ۘۨᩳ;->ܶ:I

    if-eq v0, v3, :cond_4

    .line 3650
    iput-object p1, p0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    .line 3651
    iget p1, p0, Ll/ۘۨᩳ;->᩸:I

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p2}, Ll/۫ۨᩳ;->ܺ֫(Ll/۫ۨᩳ;)I

    move-result p2

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Ll/ۘۨᩳ;->ܳ:Ll/ᩴۨᩳ;

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll/ᩴۨᩳ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :cond_2
    iput-object v1, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3652
    :cond_3
    iput-object v1, p0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3653
    iput-object v1, p0, Ll/ۘۨᩳ;->ۡ:Ll/ۙۨᩳ;

    .line 3654
    new-instance p1, Ll/ۨۤᩳ;

    invoke-direct {p1, p0}, Ll/ۨۤᩳ;-><init>(Ll/ۘۨᩳ;)V

    invoke-static {p1}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 3658
    :cond_4
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_6

    if-nez p2, :cond_6

    if-eqz p1, :cond_6

    iget v0, p0, Ll/ۘۨᩳ;->᩸:I

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v3}, Ll/۫ۨᩳ;->ܺ֫(Ll/۫ۨᩳ;)I

    move-result v3

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Ll/ۘۨᩳ;->ܳ:Ll/ᩴۨᩳ;

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    .line 3659
    invoke-virtual {v3}, Ll/۫ۨᩳ;->᩻ܽ()Ll/ᩴۨᩳ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ᩴۨᩳ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Ll/ۘۨᩳ;->᩸:I

    if-eqz v0, :cond_6

    .line 3660
    invoke-virtual {p1}, Ll/ۗۤᩳ;->ۢ()F

    move-result v0

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v3}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v0, v0, v3

    if-eqz v0, :cond_6

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v0

    if-lez v0, :cond_6

    .line 3661
    :cond_5
    iput-object v1, p0, Ll/ۘۨᩳ;->ۡ:Ll/ۙۨᩳ;

    .line 3662
    iput-object v1, p0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3663
    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Landroid/view/View;->invalidate()V

    .line 3665
    :try_start_1
    iput-object p1, p0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    .line 3666
    iput-object v1, p0, Ll/ۘۨᩳ;->ᩳ:Ll/ܶۘܿ;

    .line 3667
    new-instance p2, Ll/ۨۤᩳ;

    invoke-direct {p2, p0}, Ll/ۨۤᩳ;-><init>(Ll/ۘۨᩳ;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    :catch_0
    move-exception p2

    .line 3671
    :cond_6
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v0

    const/4 v3, -0x1

    if-eqz v0, :cond_7

    iget-boolean v0, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz v0, :cond_7

    iget-object v0, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v0}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v0

    iget v4, p0, Ll/ۘۨᩳ;->ܶ:I

    if-ne v0, v4, :cond_7

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v4, v0, Ll/۫ۨᩳ;->ܰۧ:Ll/ۗۤᩳ;

    iget-object v5, p0, Ll/ۘۨᩳ;->ۜ:Ll/ۗۤᩳ;

    if-ne v4, v5, :cond_7

    if-eqz p1, :cond_7

    if-nez p2, :cond_7

    .line 3674
    :try_start_2
    invoke-static {v0, p1}, Ll/۫ۨᩳ;->ۧ(Ll/۫ۨᩳ;Ll/ۗۤᩳ;)V

    goto/16 :goto_0

    .line 3675
    :cond_7
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-boolean v0, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz v0, :cond_e

    .line 3676
    instance-of v0, p2, Ljava/lang/Error;

    if-nez v0, :cond_d

    .line 3677
    instance-of v0, p2, Ljava/lang/RuntimeException;

    if-eqz v0, :cond_c

    check-cast p2, Ljava/lang/RuntimeException;

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v4, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {v0, v4, p2}, Ll/۫ۨᩳ;->֫(Ll/۟᩺ᩳ;Ljava/lang/RuntimeException;)Z

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-eqz p2, :cond_c

    if-eqz p1, :cond_8

    .line 3684
    iput v3, p1, Ll/ۗۤᩳ;->ۨ:I

    .line 3685
    :cond_8
    iput-object v1, p0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3686
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֡֫(Ll/۫ۨᩳ;)V

    .line 3687
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֨֫(Ll/۫ۨᩳ;)V

    .line 3689
    :try_start_3
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_9

    iget-object p1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {p1, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 3691
    :cond_9
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_a

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨ()V

    .line 3692
    :cond_a
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    new-instance p2, Ll/ܿۧܿ;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    :catchall_1
    move-exception p1

    .line 3691
    iget-boolean p2, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p2, :cond_b

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۨ()V

    .line 3692
    :cond_b
    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    new-instance v0, Ll/ܿۧܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 3693
    throw p1

    .line 3680
    :cond_c
    :try_start_4
    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object p2, p2, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object v0, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {p2, v0}, Ll/ۜܺܿ;->ܳ(Ll/᩶᩸ᩳ;)V

    .line 3681
    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->᩹ܽ()V

    goto :goto_0

    .line 3676
    :cond_d
    check-cast p2, Ljava/lang/Error;

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :cond_e
    :goto_0
    if-eqz p1, :cond_f

    .line 3684
    iput v3, p1, Ll/ۗۤᩳ;->ۨ:I

    .line 3685
    :cond_f
    iput-object v1, p0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3686
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֡֫(Ll/۫ۨᩳ;)V

    .line 3687
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֨֫(Ll/۫ۨᩳ;)V

    .line 3689
    :try_start_5
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_10

    iget-object p1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {p1, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 3691
    :cond_10
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_11

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨ()V

    .line 3692
    :cond_11
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    new-instance p2, Ll/ܿۧܿ;

    const/4 v0, 0x1

    invoke-direct {p2, v0, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {p2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 3695
    iget-boolean p1, p0, Ll/ۘۨᩳ;->ܽ:Z

    if-nez p1, :cond_16

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object p1

    iget-object p2, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    if-ne p1, p2, :cond_16

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->۬(Ll/۫ۨᩳ;)Z

    move-result p1

    if-eqz p1, :cond_12

    goto :goto_1

    .line 3696
    :cond_12
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object p1, p1, Ll/۫ۨᩳ;->֡ᩳ:Ll/ۜ֫ܿ;

    iget-object p2, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {p1, p2}, Ll/ۜ֫ܿ;->ܽ(Ll/᩶᩸ᩳ;)V

    .line 3697
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object p1, p1, Ll/۫ۨᩳ;->ۤᩳ:Ll/ۜܺܿ;

    iget-object p2, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-virtual {p1, p2}, Ll/ۜܺܿ;->ᩳ(Ll/᩶᩸ᩳ;)V

    .line 3698
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object p2, p1, Ll/۫ۨᩳ;->ۧ֫:Ll/᩸ܽܿ;

    if-eqz p2, :cond_13

    invoke-virtual {p2, p1}, Ll/᩸ܽܿ;->֫(Ll/۫ۨᩳ;)V

    .line 3700
    :cond_13
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->۠֫(Ll/۫ۨᩳ;)Z

    move-result p1

    if-nez p1, :cond_14

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֫֫(Ll/۫ۨᩳ;)Ll/۬ۨᩳ;

    move-result-object p1

    if-nez p1, :cond_14

    iget-boolean p1, p0, Ll/ۘۨᩳ;->ۧ:Z

    if-nez p1, :cond_14

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ll/۫ۨᩳ;->֫(Z)V

    .line 3701
    :cond_14
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->۫֫()I

    move-result p2

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v0}, Ll/۫ۨᩳ;->۬֫()I

    move-result v0

    invoke-virtual {p1, p2, v0}, Ll/۫ۨᩳ;->֫(II)V

    .line 3702
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۡ()V

    .line 3703
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ᩳᩳ()V

    .line 3704
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۢ֫()I

    move-result p1

    .line 3705
    iget p2, p0, Ll/ۘۨᩳ;->ۖ:I

    if-eq p2, p1, :cond_15

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2, p1}, Ll/۫ۨᩳ;->ۢ(I)V

    .line 3706
    :cond_15
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 3707
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 3708
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->ܰ֫(Ll/۫ۨᩳ;)V

    :cond_16
    :goto_1
    return-void

    :catchall_2
    move-exception p1

    .line 3691
    iget-boolean p2, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p2, :cond_17

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۨ()V

    .line 3692
    :cond_17
    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    new-instance v0, Ll/ܿۧܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 3693
    throw p1

    :catchall_3
    move-exception p2

    if-eqz p1, :cond_18

    .line 3684
    iput v3, p1, Ll/ۗۤᩳ;->ۨ:I

    .line 3685
    :cond_18
    iput-object v1, p0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    .line 3686
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֡֫(Ll/۫ۨᩳ;)V

    .line 3687
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {p1}, Ll/۫ۨᩳ;->֨֫(Ll/۫ۨᩳ;)V

    .line 3689
    :try_start_6
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_19

    iget-object p1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {p1, v2}, Ll/۟᩺ᩳ;->setReadOnly(Z)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 3691
    :cond_19
    iget-boolean p1, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p1, :cond_1a

    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p1}, Ll/۫ۨᩳ;->ۨ()V

    .line 3692
    :cond_1a
    iget-object p1, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    new-instance v0, Ll/ܿۧܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 3694
    throw p2

    :catchall_4
    move-exception p1

    .line 3691
    iget-boolean p2, p0, Ll/ۘۨᩳ;->᩵:Z

    if-eqz p2, :cond_1b

    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {p2}, Ll/۫ۨᩳ;->ۨ()V

    .line 3692
    :cond_1b
    iget-object p2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    new-instance v0, Ll/ܿۧܿ;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Ll/ܿۧܿ;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    .line 3693
    throw p1
.end method

.method public final ֫()Z
    .locals 2

    .line 3456
    iget-boolean v0, p0, Ll/ۘۨᩳ;->ܽ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ᩴ(Ll/۫ۨᩳ;)Ll/ۘۨᩳ;

    move-result-object v0

    if-ne v0, p0, :cond_0

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->ۙ(Ll/۫ۨᩳ;)Ll/۟᩺ᩳ;

    move-result-object v0

    iget-object v1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-static {v0}, Ll/۫ۨᩳ;->۬(Ll/۫ۨᩳ;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֫(Ll/ۗۤᩳ;)Z
    .locals 3

    .line 3522
    iget-object v0, p0, Ll/ۘۨᩳ;->ۡ:Ll/ۙۨᩳ;

    .line 3523
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v1}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v1

    iget v2, p0, Ll/ۘۨᩳ;->ܶ:I

    if-ne v1, v2, :cond_0

    if-eqz v0, :cond_0

    iget-object v1, v0, Ll/ۙۨᩳ;->ۧ:Ll/ۗۤᩳ;

    if-ne v1, p1, :cond_0

    iget v1, v0, Ll/ۙۨᩳ;->֫:I

    .line 3524
    invoke-virtual {p1}, Ll/ۗۤᩳ;->ۤ()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v1, v0, Ll/ۙۨᩳ;->ᩳ:Ll/ۙۤᩳ;

    .line 3525
    invoke-virtual {v1}, Ll/ۙۤᩳ;->ܳ()I

    move-result v1

    iget-object v2, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v2}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v2

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Ll/ۙۨᩳ;->ᩳ:Ll/ۙۤᩳ;

    .line 3526
    invoke-virtual {p1, v0}, Ll/ۗۤᩳ;->ۧ(Ll/ۙۤᩳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ()V
    .locals 13

    const/4 v0, 0x0

    .line 3533
    :try_start_0
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v1

    if-eqz v1, :cond_b

    .line 3534
    iget-object v8, p0, Ll/ۘۨᩳ;->᩻:Ll/ۗ۟ᩳ;

    const/4 v1, 0x0

    const/4 v11, 0x1

    if-eqz v8, :cond_2

    .line 3535
    iget-object v2, p0, Ll/ۘۨᩳ;->֫:Ll/ۗۤᩳ;

    iget v3, p0, Ll/ۘۨᩳ;->ܶ:I

    iget-object v4, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v4}, Ll/۫ۨᩳ;->ۜ֫()I

    move-result v4

    invoke-virtual {v8, v2, v3, v4}, Ll/ۗ۟ᩳ;->֫(Ll/ۗۤᩳ;II)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 3536
    iget v2, p0, Ll/ۘۨᩳ;->᩸:I

    if-nez v2, :cond_0

    .line 3537
    new-instance v10, Ll/ۖܰᩳ;

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v4, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    iget-object v5, v3, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v6, p0, Ll/ۘۨᩳ;->ᩴ:I

    new-instance v9, Ll/ۢۨᩳ;

    invoke-direct {v9, p0}, Ll/ۢۨᩳ;-><init>(Ll/ۘۨᩳ;)V

    iget-object v12, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    move-object v2, v10

    move-object v7, v8

    move-object v8, v9

    move-object v9, v12

    invoke-direct/range {v2 .. v9}, Ll/ۖܰᩳ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ILl/ۗ۟ᩳ;Ll/ۢۨᩳ;Ll/۟᩸ᩳ;)V

    goto :goto_2

    .line 3538
    :cond_0
    new-instance v12, Ll/ܿܽܿ;

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v4, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    iget-object v5, v3, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v2, p0, Ll/ۘۨᩳ;->᩸:I

    if-ne v2, v11, :cond_1

    const/4 v2, 0x1

    const/4 v6, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_0
    iget v7, p0, Ll/ۘۨᩳ;->ᩴ:I

    new-instance v9, Ll/ۡۨᩳ;

    invoke-direct {v9, p0}, Ll/ۡۨᩳ;-><init>(Ll/ۘۨᩳ;)V

    iget-object v10, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    move-object v2, v12

    invoke-direct/range {v2 .. v10}, Ll/ܿܽܿ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ZILl/ۗ۟ᩳ;Ll/ۡۨᩳ;Ll/۟᩸ᩳ;)V

    move-object v10, v12

    goto :goto_2

    .line 3541
    :cond_2
    iget v2, p0, Ll/ۘۨᩳ;->᩸:I

    if-nez v2, :cond_3

    .line 3542
    new-instance v10, Ll/ۖܰᩳ;

    iget-object v4, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v5, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    iget-object v6, v4, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v7, p0, Ll/ۘۨᩳ;->ᩴ:I

    iget-object v8, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    move-object v3, v10

    invoke-direct/range {v3 .. v8}, Ll/ۖܰᩳ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ILl/۟᩸ᩳ;)V

    goto :goto_2

    .line 3543
    :cond_3
    new-instance v10, Ll/ܿܽܿ;

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v4, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    iget-object v5, v3, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    iget v2, p0, Ll/ۘۨᩳ;->᩸:I

    if-ne v2, v11, :cond_4

    const/4 v2, 0x1

    const/4 v6, 0x1

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    const/4 v6, 0x0

    :goto_1
    iget v7, p0, Ll/ۘۨᩳ;->ᩴ:I

    iget-object v8, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    move-object v2, v10

    invoke-direct/range {v2 .. v8}, Ll/ܿܽܿ;-><init>(Ll/۫ۨᩳ;Ll/۟᩺ᩳ;Ll/᩺֫ܿ;ZILl/۟᩸ᩳ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 3545
    :goto_2
    :try_start_1
    invoke-virtual {v10}, Ll/ۗۤᩳ;->᩻()Ll/ۙۤᩳ;

    move-result-object v2

    .line 3547
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v3}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v3

    iget v4, p0, Ll/ۘۨᩳ;->ܶ:I

    if-ne v3, v4, :cond_5

    if-eqz v2, :cond_5

    invoke-virtual {v10, v2}, Ll/ۗۤᩳ;->ۧ(Ll/ۙۤᩳ;)Z

    move-result v3

    if-eqz v3, :cond_5

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    .line 3548
    invoke-virtual {v3}, Ll/۫ۨᩳ;->۫֫()I

    move-result v3

    iget-object v4, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v4}, Ll/۫ۨᩳ;->۬֫()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-virtual {v10, v3}, Ll/ۗۤᩳ;->ۧ(I)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 3549
    new-instance v3, Ll/ۙۨᩳ;

    invoke-virtual {v10}, Ll/ۗۤᩳ;->ۤ()I

    move-result v4

    invoke-direct {v3, v10, v4, v2}, Ll/ۙۨᩳ;-><init>(Ll/ۗۤᩳ;ILl/ۙۤᩳ;)V

    .line 3550
    iput-object v3, p0, Ll/ۘۨᩳ;->ۡ:Ll/ۙۨᩳ;

    .line 3551
    invoke-virtual {v2}, Ll/ۙۤᩳ;->ᩳ()I

    move-result v2

    invoke-direct {p0, v10, v2}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;I)V

    .line 3553
    new-instance v2, Ll/ܺۨᩳ;

    invoke-direct {v2, p0, v3}, Ll/ܺۨᩳ;-><init>(Ll/ۘۨᩳ;Ll/ۙۨᩳ;)V

    invoke-static {v2}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    goto :goto_3

    :cond_5
    const/4 v11, 0x0

    .line 3555
    :goto_3
    invoke-virtual {v10}, Ll/ۗۤᩳ;->ۖ()Z

    move-result v2

    if-eqz v2, :cond_7

    .line 3556
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v2

    if-nez v2, :cond_6

    invoke-virtual {v10}, Ll/ۗۤᩳ;->ۧ()V

    goto :goto_4

    :cond_6
    const-wide/16 v2, 0xa

    .line 3557
    invoke-static {v2, v3}, Landroid/os/SystemClock;->sleep(J)V

    goto :goto_3

    .line 3559
    :cond_7
    :goto_4
    invoke-virtual {v10}, Ll/ۗۤᩳ;->᩶()Ljava/lang/Throwable;

    move-result-object v2

    .line 3560
    instance-of v3, v2, Ljava/lang/RuntimeException;

    if-nez v3, :cond_a

    .line 3561
    instance-of v3, v2, Ljava/lang/Error;

    if-nez v3, :cond_9

    if-nez v2, :cond_8

    if-nez v11, :cond_c

    .line 3563
    invoke-virtual {p0}, Ll/ۘۨᩳ;->֫()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v2}, Ll/᩶᩸ᩳ;->֨ۧ()I

    move-result v2

    iget v3, p0, Ll/ۘۨᩳ;->ܶ:I

    if-ne v2, v3, :cond_c

    .line 3564
    iget v2, p0, Ll/ۘۨᩳ;->ᩴ:I

    iget-object v3, p0, Ll/ۘۨᩳ;->ۢ:Ll/۟᩺ᩳ;

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {v10, v2}, Ll/ۗۤᩳ;->ܿ(I)I

    move-result v2

    int-to-float v2, v2

    .line 3565
    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    iget-object v3, v3, Ll/۫ۨᩳ;->ۨᩳ:Ll/᩺֫ܿ;

    invoke-virtual {v3}, Ll/ۢ۫ۡ;->ۜ()F

    move-result v3

    mul-float v2, v2, v3

    float-to-int v2, v2

    iget-object v3, p0, Ll/ۘۨᩳ;->֡:Ll/۫ۨᩳ;

    invoke-virtual {v3}, Ll/۫ۨᩳ;->᩻֫()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-direct {p0, v10, v1}, Ll/ۘۨᩳ;->֫(Ll/ۗۤᩳ;I)V

    goto :goto_5

    .line 3562
    :cond_8
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v3, "Large edit layout preparation failed"

    invoke-direct {v1, v3, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 3561
    :cond_9
    check-cast v2, Ljava/lang/Error;

    throw v2

    .line 3560
    :cond_a
    check-cast v2, Ljava/lang/RuntimeException;

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    goto :goto_6

    :cond_b
    move-object v10, v0

    :cond_c
    :goto_5
    move-object v1, v0

    goto :goto_7

    :catchall_1
    move-exception v1

    move-object v10, v0

    :goto_6
    if-eqz v10, :cond_d

    .line 3570
    invoke-virtual {v10}, Ll/ۗۤᩳ;->ۧ()V

    .line 3572
    :cond_d
    :goto_7
    iget-object v2, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ll/۟᩸ᩳ;->close()V

    iput-object v0, p0, Ll/ۘۨᩳ;->᩷:Ll/۟᩸ᩳ;

    .line 3575
    :cond_e
    new-instance v0, Ll/ۖۨᩳ;

    invoke-direct {v0, p0, v10, v1}, Ll/ۖۨᩳ;-><init>(Ll/ۘۨᩳ;Ll/ۗۤᩳ;Ljava/lang/Throwable;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
