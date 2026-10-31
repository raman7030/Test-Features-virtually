.class public final Ll/ᩴ۬ۧ;
.super Ll/ۗۗۧ;
.source "Y6A7"


# instance fields
.field public final synthetic ֫:Ll/۬۬ۧ;


# direct methods
.method public constructor <init>(Ll/۬۬ۧ;)V
    .locals 0

    .line 6055
    iput-object p1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    invoke-direct {p0}, Ll/ۗۗۧ;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged()V
    .locals 3

    const/4 v0, 0x0

    .line 6060
    iget-object v1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 6061
    iget-object v0, v1, Ll/۬۬ۧ;->mState:Ll/᩸۬ۧ;

    const/4 v2, 0x1

    iput-boolean v2, v0, Ll/᩸۬ۧ;->ܺ:Z

    .line 6063
    invoke-virtual {v1, v2}, Ll/۬۬ۧ;->processDataSetCompletelyChanged(Z)V

    .line 6064
    iget-object v0, v1, Ll/۬۬ۧ;->mAdapterHelper:Ll/֨᩶ۧ;

    invoke-virtual {v0}, Ll/֨᩶ۧ;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 6065
    invoke-virtual {v1}, Ll/۬۬ۧ;->requestLayout()V

    :cond_0
    return-void
.end method

.method public final onItemRangeChanged(IILjava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    .line 6071
    iget-object v1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 6072
    iget-object v0, v1, Ll/۬۬ۧ;->mAdapterHelper:Ll/֨᩶ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/֨᩶ۧ;->֫(IILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6073
    invoke-virtual {p0}, Ll/ᩴ۬ۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final onItemRangeInserted(II)V
    .locals 2

    const/4 v0, 0x0

    .line 6079
    iget-object v1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 6080
    iget-object v0, v1, Ll/۬۬ۧ;->mAdapterHelper:Ll/֨᩶ۧ;

    invoke-virtual {v0, p1, p2}, Ll/֨᩶ۧ;->ۧ(II)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6081
    invoke-virtual {p0}, Ll/ᩴ۬ۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final onItemRangeMoved(III)V
    .locals 2

    const/4 v0, 0x0

    .line 6095
    iget-object v1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 6096
    iget-object v0, v1, Ll/۬۬ۧ;->mAdapterHelper:Ll/֨᩶ۧ;

    invoke-virtual {v0, p1, p2, p3}, Ll/֨᩶ۧ;->֫(III)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6097
    invoke-virtual {p0}, Ll/ᩴ۬ۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final onItemRangeRemoved(II)V
    .locals 2

    const/4 v0, 0x0

    .line 6087
    iget-object v1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    invoke-virtual {v1, v0}, Ll/۬۬ۧ;->assertNotInLayoutOrScroll(Ljava/lang/String;)V

    .line 6088
    iget-object v0, v1, Ll/۬۬ۧ;->mAdapterHelper:Ll/֨᩶ۧ;

    invoke-virtual {v0, p1, p2}, Ll/֨᩶ۧ;->ܽ(II)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 6089
    invoke-virtual {p0}, Ll/ᩴ۬ۧ;->֫()V

    :cond_0
    return-void
.end method

.method public final onStateRestorationPolicyChanged()V
    .locals 2

    .line 6112
    iget-object v0, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    iget-object v1, v0, Ll/۬۬ۧ;->mPendingSavedState:Ll/֡۬ۧ;

    if-nez v1, :cond_0

    goto :goto_0

    .line 6118
    :cond_0
    iget-object v1, v0, Ll/۬۬ۧ;->mAdapter:Ll/᩶ۗۧ;

    if-eqz v1, :cond_1

    .line 6119
    invoke-virtual {v1}, Ll/᩶ۗۧ;->canRestoreState()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 6120
    invoke-virtual {v0}, Ll/۬۬ۧ;->requestLayout()V

    :cond_1
    :goto_0
    return-void
.end method

.method public final ֫()V
    .locals 3

    .line 6102
    sget-boolean v0, Ll/۬۬ۧ;->POST_UPDATES_ON_ANIMATION:Z

    iget-object v1, p0, Ll/ᩴ۬ۧ;->֫:Ll/۬۬ۧ;

    if-eqz v0, :cond_0

    iget-boolean v0, v1, Ll/۬۬ۧ;->mHasFixedSize:Z

    if-eqz v0, :cond_0

    iget-boolean v0, v1, Ll/۬۬ۧ;->mIsAttached:Z

    if-eqz v0, :cond_0

    .line 6103
    iget-object v0, v1, Ll/۬۬ۧ;->mUpdateChildViewsRunnable:Ljava/lang/Runnable;

    sget v2, Ll/ܿ᩺;->֫:I

    .line 1359
    invoke-virtual {v1, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 6105
    iput-boolean v0, v1, Ll/۬۬ۧ;->mAdapterUpdateDuringMeasure:Z

    .line 6106
    invoke-virtual {v1}, Ll/۬۬ۧ;->requestLayout()V

    return-void
.end method
