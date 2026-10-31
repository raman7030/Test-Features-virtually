.class public final Ll/ۙۗۧ;
.super Landroid/database/Observable;
.source "Y6A7"


# virtual methods
.method public final ֫(II)V
    .locals 3

    .line 13244
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    :goto_0
    if-ltz v0, :cond_0

    .line 13245
    iget-object v2, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۗۗۧ;

    invoke-virtual {v2, p1, p2, v1}, Ll/ۗۗۧ;->onItemRangeMoved(III)V

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(IILjava/lang/Object;)V
    .locals 2

    .line 13218
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 13219
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۗۧ;

    invoke-virtual {v1, p1, p2, p3}, Ll/ۗۗۧ;->onItemRangeChanged(IILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫()Z
    .locals 1

    .line 13189
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ۧ()V
    .locals 2

    .line 13197
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 13198
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۗۧ;

    invoke-virtual {v1}, Ll/ۗۗۧ;->onChanged()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ(II)V
    .locals 2

    .line 13228
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 13229
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۗۧ;

    invoke-virtual {v1, p1, p2}, Ll/ۗۗۧ;->onItemRangeInserted(II)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ()V
    .locals 2

    .line 13203
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 13204
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۗۧ;

    invoke-virtual {v1}, Ll/ۗۗۧ;->onStateRestorationPolicyChanged()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ܽ(II)V
    .locals 2

    .line 13238
    iget-object v0, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_0

    .line 13239
    iget-object v1, p0, Landroid/database/Observable;->mObservers:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗۗۧ;

    invoke-virtual {v1, p1, p2}, Ll/ۗۗۧ;->onItemRangeRemoved(II)V

    goto :goto_0

    :cond_0
    return-void
.end method
