.class public final Ll/᩸۬ۧ;
.super Ljava/lang/Object;
.source "Y6A7"


# instance fields
.field public ֫:I

.field public ۖ:I

.field public ۘ:Z

.field public ۜ:I

.field public ۡ:Z

.field public ۢ:Z

.field public ۧ:J

.field public ܳ:Z

.field public ܺ:Z

.field public ܽ:I

.field public ܿ:Z

.field public ᩳ:I

.field public ᩷:I

.field public ᩻:I


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 13597
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "State{mTargetPosition="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/᩸۬ۧ;->ۖ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mData=null, mItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩸۬ۧ;->᩻:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsMeasuring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩸۬ۧ;->ܳ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mPreviousLayoutItemCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩸۬ۧ;->᩷:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDeletedInvisibleItemCountSincePreviousLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/᩸۬ۧ;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mStructureChanged="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩸۬ۧ;->ܺ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mInPreLayout="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩸۬ۧ;->ܿ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mRunSimpleAnimations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩸۬ۧ;->ۡ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mRunPredictiveAnimations="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Ll/᩸۬ۧ;->ۢ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()I
    .locals 2

    .line 13568
    iget-boolean v0, p0, Ll/᩸۬ۧ;->ܿ:Z

    if-eqz v0, :cond_0

    .line 13569
    iget v0, p0, Ll/᩸۬ۧ;->᩷:I

    iget v1, p0, Ll/᩸۬ۧ;->֫:I

    sub-int/2addr v0, v1

    return v0

    .line 13570
    :cond_0
    iget v0, p0, Ll/᩸۬ۧ;->᩻:I

    return v0
.end method

.method public final ֫(I)V
    .locals 3

    .line 13321
    iget v0, p0, Ll/᩸۬ۧ;->ۜ:I

    and-int/2addr v0, p1

    if-eqz v0, :cond_0

    return-void

    .line 13322
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Layout state should be one of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13323
    invoke-static {p1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " but it is "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Ll/᩸۬ۧ;->ۜ:I

    .line 13324
    invoke-static {p1}, Ljava/lang/Integer;->toBinaryString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
