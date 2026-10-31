.class public final Ll/ܽۗۧ;
.super Ljava/lang/Object;
.source "K4ND"


# instance fields
.field public ֫:I

.field public ۧ:Z

.field public ܽ:Ll/ۖۗۧ;

.field public ܿ:Z

.field public ᩳ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2515
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2516
    invoke-virtual {p0}, Ll/ܽۗۧ;->ۧ()V

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 2538
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "AnchorInfo{mPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ܽۗۧ;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mCoordinate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܽۗۧ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mLayoutFromEnd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ܽۗۧ;->ۧ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mValid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/ܽۗۧ;->ܿ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()V
    .locals 1

    .line 2531
    iget-boolean v0, p0, Ll/ܽۗۧ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 2532
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ۧ()I

    move-result v0

    goto :goto_0

    .line 2533
    :cond_0
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    :goto_0
    iput v0, p0, Ll/ܽۗۧ;->֫:I

    return-void
.end method

.method public final ֫(ILandroid/view/View;)V
    .locals 1

    .line 2600
    iget-boolean v0, p0, Ll/ܽۗۧ;->ۧ:Z

    if-eqz v0, :cond_0

    .line 2601
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0, p2}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result p2

    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    .line 2602
    invoke-virtual {v0}, Ll/ۖۗۧ;->ۜ()I

    move-result v0

    add-int/2addr v0, p2

    iput v0, p0, Ll/ܽۗۧ;->֫:I

    goto :goto_0

    .line 2604
    :cond_0
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0, p2}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result p2

    iput p2, p0, Ll/ܽۗۧ;->֫:I

    .line 2607
    :goto_0
    iput p1, p0, Ll/ܽۗۧ;->ᩳ:I

    return-void
.end method

.method public final ۧ()V
    .locals 1

    const/4 v0, -0x1

    .line 2520
    iput v0, p0, Ll/ܽۗۧ;->ᩳ:I

    const/high16 v0, -0x80000000

    .line 2521
    iput v0, p0, Ll/ܽۗۧ;->֫:I

    const/4 v0, 0x0

    .line 2522
    iput-boolean v0, p0, Ll/ܽۗۧ;->ۧ:Z

    .line 2523
    iput-boolean v0, p0, Ll/ܽۗۧ;->ܿ:Z

    return-void
.end method

.method public final ۧ(ILandroid/view/View;)V
    .locals 4

    .line 2553
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ۜ()I

    move-result v0

    if-ltz v0, :cond_0

    .line 2555
    invoke-virtual {p0, p1, p2}, Ll/ܽۗۧ;->֫(ILandroid/view/View;)V

    return-void

    .line 2558
    :cond_0
    iput p1, p0, Ll/ܽۗۧ;->ᩳ:I

    .line 2559
    iget-boolean p1, p0, Ll/ܽۗۧ;->ۧ:Z

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    .line 2560
    iget-object p1, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {p1}, Ll/ۖۗۧ;->ۧ()I

    move-result p1

    sub-int/2addr p1, v0

    .line 2561
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0, p2}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result v0

    sub-int/2addr p1, v0

    .line 2563
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ۧ()I

    move-result v0

    sub-int/2addr v0, p1

    iput v0, p0, Ll/ܽۗۧ;->֫:I

    if-lez p1, :cond_2

    .line 2566
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0, p2}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v0

    .line 2567
    iget v2, p0, Ll/ܽۗۧ;->֫:I

    sub-int/2addr v2, v0

    .line 2568
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v0}, Ll/ۖۗۧ;->ܳ()I

    move-result v0

    .line 2569
    iget-object v3, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v3, p2}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p2, v0

    .line 2571
    invoke-static {p2, v1}, Ljava/lang/Math;->min(II)I

    move-result p2

    add-int/2addr p2, v0

    sub-int/2addr v2, p2

    if-gez v2, :cond_2

    .line 2575
    iget p2, p0, Ll/ܽۗۧ;->֫:I

    neg-int v0, v2

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result p1

    add-int/2addr p1, p2

    iput p1, p0, Ll/ܽۗۧ;->֫:I

    return-void

    .line 2579
    :cond_1
    iget-object p1, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {p1, p2}, Ll/ۖۗۧ;->ᩳ(Landroid/view/View;)I

    move-result p1

    .line 2580
    iget-object v2, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {v2}, Ll/ۖۗۧ;->ܳ()I

    move-result v2

    sub-int v2, p1, v2

    .line 2581
    iput p1, p0, Ll/ܽۗۧ;->֫:I

    if-lez v2, :cond_2

    .line 2583
    iget-object v3, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    .line 2584
    invoke-virtual {v3, p2}, Ll/ۖۗۧ;->ۧ(Landroid/view/View;)I

    move-result v3

    add-int/2addr v3, p1

    .line 2585
    iget-object p1, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {p1}, Ll/ۖۗۧ;->ۧ()I

    move-result p1

    sub-int/2addr p1, v0

    .line 2587
    iget-object v0, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    .line 2588
    invoke-virtual {v0, p2}, Ll/ۖۗۧ;->֫(Landroid/view/View;)I

    move-result p2

    sub-int/2addr p1, p2

    .line 2589
    iget-object p2, p0, Ll/ܽۗۧ;->ܽ:Ll/ۖۗۧ;

    invoke-virtual {p2}, Ll/ۖۗۧ;->ۧ()I

    move-result p2

    .line 2590
    invoke-static {v1, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int/2addr p2, p1

    sub-int/2addr p2, v3

    if-gez p2, :cond_2

    .line 2593
    iget p1, p0, Ll/ܽۗۧ;->֫:I

    neg-int p2, p2

    invoke-static {v2, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, Ll/ܽۗۧ;->֫:I

    :cond_2
    return-void
.end method
