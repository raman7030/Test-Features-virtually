.class public abstract Ll/᩶ۗۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public mHasStableIds:Z

.field public final mObservable:Ll/ۙۗۧ;

.field public mStateRestorationPolicy:Ll/᩹ۗۧ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 7666
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7667
    new-instance v0, Ll/ۙۗۧ;

    .line 13187
    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    .line 7667
    iput-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    const/4 v0, 0x0

    .line 7668
    iput-boolean v0, p0, Ll/᩶ۗۧ;->mHasStableIds:Z

    .line 7669
    sget-object v0, Ll/᩹ۗۧ;->᩹:Ll/᩹ۗۧ;

    iput-object v0, p0, Ll/᩶ۗۧ;->mStateRestorationPolicy:Ll/᩹ۗۧ;

    return-void
.end method


# virtual methods
.method public final bindViewHolder(Ll/ۗ۬ۧ;I)V
    .locals 4

    .line 7818
    iget-object v0, p1, Ll/ۗ۬ۧ;->mBindingAdapter:Ll/᩶ۗۧ;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    .line 7820
    iput p2, p1, Ll/ۗ۬ۧ;->mPosition:I

    .line 7821
    invoke-virtual {p0}, Ll/᩶ۗۧ;->hasStableIds()Z

    move-result v2

    if-eqz v2, :cond_1

    .line 7822
    invoke-virtual {p0, p2}, Ll/᩶ۗۧ;->getItemId(I)J

    move-result-wide v2

    iput-wide v2, p1, Ll/ۗ۬ۧ;->mItemId:J

    :cond_1
    const/16 v2, 0x207

    .line 7824
    invoke-virtual {p1, v1, v2}, Ll/ۗ۬ۧ;->setFlags(II)V

    .line 7827
    sget v2, Ll/ۚ۫;->֫:I

    const-string v2, "RV OnBindView"

    .line 108
    invoke-static {v2}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 7829
    :cond_2
    iput-object p0, p1, Ll/ۗ۬ۧ;->mBindingAdapter:Ll/᩶ۗۧ;

    .line 7830
    sget-boolean v2, Ll/۬۬ۧ;->sDebugAssertionsEnabled:Z

    if-eqz v2, :cond_6

    .line 7831
    iget-object v2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 7832
    sget v3, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    .line 7833
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->isTmpDetached()Z

    move-result v3

    if-ne v2, v3, :cond_3

    goto :goto_1

    .line 7834
    :cond_3
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Temp-detached state out of sync with reality. holder.isTmpDetached(): "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 7835
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->isTmpDetached()Z

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", attached to window: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 4137
    invoke-virtual {v1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v1

    .line 7837
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", holder: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 7840
    :cond_4
    :goto_1
    iget-object v2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_6

    iget-object v2, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    .line 7841
    sget v3, Ll/ܿ᩺;->֫:I

    .line 4137
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_2

    .line 7842
    :cond_5
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Attempting to bind attached holder with no parent (AKA temp detached): "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 7847
    :cond_6
    :goto_2
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->getUnmodifiedPayloads()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, p1, p2, v2}, Ll/᩶ۗۧ;->onBindViewHolder(Ll/ۗ۬ۧ;ILjava/util/List;)V

    if-eqz v0, :cond_8

    .line 7849
    invoke-virtual {p1}, Ll/ۗ۬ۧ;->clearPayload()V

    .line 7850
    iget-object p1, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 7851
    instance-of p2, p1, Ll/ܳ۬ۧ;

    if-eqz p2, :cond_7

    .line 7852
    check-cast p1, Ll/ܳ۬ۧ;

    iput-boolean v1, p1, Ll/ܳ۬ۧ;->ۧ:Z

    .line 7854
    :cond_7
    sget p1, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    :cond_8
    return-void
.end method

.method public canRestoreState()Z
    .locals 4

    .line 8323
    sget-object v0, Ll/᩸ۗۧ;->֫:[I

    iget-object v1, p0, Ll/᩶ۗۧ;->mStateRestorationPolicy:Ll/᩹ۗۧ;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    return v2

    .line 8327
    :cond_0
    invoke-virtual {p0}, Ll/᩶ۗۧ;->getItemCount()I

    move-result v0

    if-lez v0, :cond_1

    return v2

    :cond_1
    return v1
.end method

.method public final createViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
    .locals 2

    :try_start_0
    const-string v0, "RV CreateView"

    .line 7787
    sget v1, Ll/ۚ۫;->֫:I

    .line 108
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 7788
    invoke-virtual {p0, p1, p2}, Ll/᩶ۗۧ;->onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;

    move-result-object p1

    .line 7789
    iget-object v0, p1, Ll/ۗ۬ۧ;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_0

    .line 7794
    iput p2, p1, Ll/ۗ۬ۧ;->mItemViewType:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-object p1

    .line 7790
    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    .line 7797
    sget p2, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 7798
    throw p1
.end method

.method public findRelativeAdapterPositionIn(Ll/᩶ۗۧ;Ll/ۗ۬ۧ;I)I
    .locals 0

    if-ne p1, p0, :cond_0

    return p3

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public abstract getItemCount()I
.end method

.method public getItemId(I)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final getStateRestorationPolicy()Ll/᩹ۗۧ;
    .locals 1

    .line 8312
    iget-object v0, p0, Ll/᩶ۗۧ;->mStateRestorationPolicy:Ll/᩹ۗۧ;

    return-object v0
.end method

.method public final hasObservers()Z
    .locals 1

    .line 8009
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0}, Ll/ۙۗۧ;->֫()Z

    move-result v0

    return v0
.end method

.method public final hasStableIds()Z
    .locals 1

    .line 7917
    iget-boolean v0, p0, Ll/᩶ۗۧ;->mHasStableIds:Z

    return v0
.end method

.method public final notifyDataSetChanged()V
    .locals 1

    .line 8094
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0}, Ll/ۙۗۧ;->ۧ()V

    return-void
.end method

.method public final notifyItemChanged(I)V
    .locals 3

    .line 8109
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 13209
    invoke-virtual {v0, p1, v1, v2}, Ll/ۙۗۧ;->֫(IILjava/lang/Object;)V

    return-void
.end method

.method public final notifyItemChanged(ILjava/lang/Object;)V
    .locals 2

    .line 8136
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Ll/ۙۗۧ;->֫(IILjava/lang/Object;)V

    return-void
.end method

.method public final notifyItemInserted(I)V
    .locals 2

    .line 8199
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۙۗۧ;->ۧ(II)V

    return-void
.end method

.method public final notifyItemMoved(II)V
    .locals 1

    .line 8214
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0, p1, p2}, Ll/ۙۗۧ;->֫(II)V

    return-void
.end method

.method public final notifyItemRangeChanged(II)V
    .locals 2

    .line 8153
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    const/4 v1, 0x0

    .line 13209
    invoke-virtual {v0, p1, p2, v1}, Ll/ۙۗۧ;->֫(IILjava/lang/Object;)V

    return-void
.end method

.method public final notifyItemRangeChanged(IILjava/lang/Object;)V
    .locals 1

    .line 8183
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/ۙۗۧ;->֫(IILjava/lang/Object;)V

    return-void
.end method

.method public final notifyItemRangeInserted(II)V
    .locals 1

    .line 8232
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0, p1, p2}, Ll/ۙۗۧ;->ۧ(II)V

    return-void
.end method

.method public final notifyItemRangeRemoved(II)V
    .locals 1

    .line 8265
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0, p1, p2}, Ll/ۙۗۧ;->ܽ(II)V

    return-void
.end method

.method public final notifyItemRemoved(I)V
    .locals 2

    .line 8248
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Ll/ۙۗۧ;->ܽ(II)V

    return-void
.end method

.method public onAttachedToRecyclerView(Ll/۬۬ۧ;)V
    .locals 0

    return-void
.end method

.method public abstract onBindViewHolder(Ll/ۗ۬ۧ;I)V
.end method

.method public onBindViewHolder(Ll/ۗ۬ۧ;ILjava/util/List;)V
    .locals 0

    .line 7747
    invoke-virtual {p0, p1, p2}, Ll/᩶ۗۧ;->onBindViewHolder(Ll/ۗ۬ۧ;I)V

    return-void
.end method

.method public abstract onCreateViewHolder(Landroid/view/ViewGroup;I)Ll/ۗ۬ۧ;
.end method

.method public onDetachedFromRecyclerView(Ll/۬۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onFailedToRecycleView(Ll/ۗ۬ۧ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onViewAttachedToWindow(Ll/ۗ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onViewDetachedFromWindow(Ll/ۗ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public onViewRecycled(Ll/ۗ۬ۧ;)V
    .locals 0

    return-void
.end method

.method public registerAdapterDataObserver(Ll/ۗۗۧ;)V
    .locals 1

    .line 8028
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0, p1}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    return-void
.end method

.method public setHasStableIds(Z)V
    .locals 1

    .line 7883
    invoke-virtual {p0}, Ll/᩶ۗۧ;->hasObservers()Z

    move-result v0

    if-nez v0, :cond_0

    .line 7887
    iput-boolean p1, p0, Ll/᩶ۗۧ;->mHasStableIds:Z

    return-void

    .line 7884
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public setStateRestorationPolicy(Ll/᩹ۗۧ;)V
    .locals 0

    .line 8299
    iput-object p1, p0, Ll/᩶ۗۧ;->mStateRestorationPolicy:Ll/᩹ۗۧ;

    .line 8300
    iget-object p1, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {p1}, Ll/ۙۗۧ;->ܽ()V

    return-void
.end method

.method public unregisterAdapterDataObserver(Ll/ۗۗۧ;)V
    .locals 1

    .line 8041
    iget-object v0, p0, Ll/᩶ۗۧ;->mObservable:Ll/ۙۗۧ;

    invoke-virtual {v0, p1}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    return-void
.end method
