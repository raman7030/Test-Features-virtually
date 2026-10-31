.class public final Ll/ܿۗۧ;
.super Ljava/lang/Object;
.source "K4ND"


# instance fields
.field public ֫:I

.field public ۜ:I

.field public ۡ:Ljava/util/List;

.field public ۢ:Z

.field public ۧ:I

.field public ܳ:I

.field public ܺ:I

.field public ܽ:I

.field public ܿ:I

.field public ᩳ:Z

.field public ᩷:I

.field public ᩻:I


# virtual methods
.method public final ֫(Ll/ۖ۬ۧ;)Landroid/view/View;
    .locals 4

    .line 2359
    iget-object v0, p0, Ll/ܿۗۧ;->ۡ:Ljava/util/List;

    if-eqz v0, :cond_3

    .line 2375
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 2377
    iget-object v1, p0, Ll/ܿۗۧ;->ۡ:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ۬ۧ;

    iget-object v1, v1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 2379
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Ll/ܳ۬ۧ;

    .line 12576
    iget-object v3, v2, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v3}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    .line 2383
    :cond_0
    iget v3, p0, Ll/ܿۗۧ;->ۧ:I

    .line 12605
    iget-object v2, v2, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v2}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result v2

    if-ne v3, v2, :cond_1

    .line 2384
    invoke-virtual {p0, v1}, Ll/ܿۗۧ;->֫(Landroid/view/View;)V

    return-object v1

    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1

    .line 2362
    :cond_3
    iget v0, p0, Ll/ܿۗۧ;->ۧ:I

    invoke-virtual {p1, v0}, Ll/ۖ۬ۧ;->ۧ(I)Landroid/view/View;

    move-result-object p1

    .line 2363
    iget v0, p0, Ll/ܿۗۧ;->ۧ:I

    iget v1, p0, Ll/ܿۗۧ;->ܿ:I

    add-int/2addr v0, v1

    iput v0, p0, Ll/ܿۗۧ;->ۧ:I

    return-object p1
.end method

.method public final ֫(Landroid/view/View;)V
    .locals 7

    .line 2406
    iget-object v0, p0, Ll/ܿۗۧ;->ۡ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const v2, 0x7fffffff

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v0, :cond_4

    .line 2413
    iget-object v4, p0, Ll/ܿۗۧ;->ۡ:Ljava/util/List;

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۗ۬ۧ;

    iget-object v4, v4, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 2415
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Ll/ܳ۬ۧ;

    if-eq v4, p1, :cond_3

    .line 12576
    iget-object v6, v5, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v6}, Ll/ۗ۬ۧ;->isRemoved()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    .line 12605
    :cond_0
    iget-object v5, v5, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {v5}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result v5

    .line 2419
    iget v6, p0, Ll/ܿۗۧ;->ۧ:I

    sub-int/2addr v5, v6

    iget v6, p0, Ll/ܿۗۧ;->ܿ:I

    mul-int v5, v5, v6

    if-gez v5, :cond_1

    goto :goto_1

    :cond_1
    if-ge v5, v2, :cond_3

    move-object v1, v4

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move v2, v5

    :cond_3
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    if-nez v1, :cond_5

    const/4 p1, -0x1

    .line 2398
    iput p1, p0, Ll/ܿۗۧ;->ۧ:I

    return-void

    .line 2400
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Ll/ܳ۬ۧ;

    .line 12605
    iget-object p1, p1, Ll/ܳ۬ۧ;->ᩳ:Ll/ۗ۬ۧ;

    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getLayoutPosition()I

    move-result p1

    .line 2401
    iput p1, p0, Ll/ܿۗۧ;->ۧ:I

    return-void
.end method
