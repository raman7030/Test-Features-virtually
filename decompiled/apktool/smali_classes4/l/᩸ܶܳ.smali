.class public final Ll/᩸ܶܳ;
.super Ljava/lang/Object;
.source "C1ZO"


# instance fields
.field public ֫:Ll/ܳܶܳ;

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:Z


# virtual methods
.method public final ֫(Ll/ܽܶܳ;)I
    .locals 1

    .line 440
    iget-object v0, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    if-eq v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    .line 443
    :cond_0
    iget p1, p0, Ll/᩸ܶܳ;->ܽ:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Ll/᩸ܶܳ;->ܽ:I

    return p1
.end method

.method public final ֫()V
    .locals 1

    const/4 v0, 0x0

    .line 475
    iput-object v0, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    const/4 v0, 0x0

    .line 476
    iput v0, p0, Ll/᩸ܶܳ;->ۧ:I

    .line 477
    iput-boolean v0, p0, Ll/᩸ܶܳ;->ᩳ:Z

    .line 478
    iput v0, p0, Ll/᩸ܶܳ;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/ܳܶܳ;)V
    .locals 0

    .line 419
    iput-object p1, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    const/4 p1, 0x0

    .line 420
    iput p1, p0, Ll/᩸ܶܳ;->ۧ:I

    .line 421
    iput-boolean p1, p0, Ll/᩸ܶܳ;->ᩳ:Z

    .line 422
    iput p1, p0, Ll/᩸ܶܳ;->ܽ:I

    return-void
.end method

.method public final ֫(Ll/ܽܶܳ;I)V
    .locals 1

    .line 429
    iget-object v0, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    if-eq v0, p1, :cond_0

    .line 430
    invoke-virtual {p0, p1}, Ll/᩸ܶܳ;->֫(Ll/ܳܶܳ;)V

    .line 432
    :cond_0
    iput p2, p0, Ll/᩸ܶܳ;->ۧ:I

    const/4 p1, 0x1

    .line 433
    iput-boolean p1, p0, Ll/᩸ܶܳ;->ᩳ:Z

    return-void
.end method

.method public final ֫(ILjava/lang/Object;)Z
    .locals 1

    .line 461
    iget-object v0, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    if-ne v0, p2, :cond_0

    iget p2, p0, Ll/᩸ܶܳ;->ܽ:I

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(Ll/ۗ۬ۧ;)Z
    .locals 2

    .line 450
    iget-object v0, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    const/4 v1, 0x0

    if-ne v0, p1, :cond_0

    iget-boolean p1, p0, Ll/᩸ܶܳ;->ᩳ:Z

    if-eqz p1, :cond_0

    .line 451
    iput-boolean v1, p0, Ll/᩸ܶܳ;->ᩳ:Z

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public final ۧ()Ljava/lang/Object;
    .locals 1

    .line 486
    iget-object v0, p0, Ll/᩸ܶܳ;->֫:Ll/ܳܶܳ;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 468
    iget v0, p0, Ll/᩸ܶܳ;->ۧ:I

    return v0
.end method
