.class public Ll/᩸ܺ᩵;
.super Ll/ۡܺ᩵;
.source "9A0K"


# instance fields
.field public ۛ:I

.field public ۤ:I

.field public ۨ:I

.field public ۫:Ll/ۛܺ᩵;

.field public ܰ:Ljava/lang/String;

.field public ᩺:I


# virtual methods
.method public final ֫()I
    .locals 1

    const/16 v0, 0xf

    return v0
.end method

.method public final ܳ(Ll/۬ܺ᩵;)V
    .locals 1

    .line 404
    iget-object v0, p0, Ll/᩸ܺ᩵;->ܰ:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    .line 406
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/String;)V

    .line 409
    :cond_0
    iget v0, p0, Ll/᩸ܺ᩵;->ۤ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 410
    iget v0, p0, Ll/᩸ܺ᩵;->ۤ:I

    .line 411
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 412
    iget-object v0, p0, Ll/᩸ܺ᩵;->۫:Ll/ۛܺ᩵;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 413
    iget-object v0, p0, Ll/᩸ܺ᩵;->۫:Ll/ۛܺ᩵;

    if-eqz v0, :cond_1

    .line 414
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 415
    invoke-virtual {v0, p1}, Ll/ۛܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    .line 418
    :cond_1
    iget v0, p0, Ll/᩸ܺ᩵;->ۛ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 419
    iget v0, p0, Ll/᩸ܺ᩵;->ۨ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    return-void
.end method

.method public final ᩳ(Ll/۬ܺ᩵;)V
    .locals 1

    .line 425
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/᩸ܺ᩵;->ۤ:I

    .line 426
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    .line 427
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_1

    .line 429
    iget-object v0, p0, Ll/᩸ܺ᩵;->۫:Ll/ۛܺ᩵;

    if-nez v0, :cond_0

    .line 430
    new-instance v0, Ll/ۙܺ᩵;

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 430
    iput-object v0, p0, Ll/᩸ܺ᩵;->۫:Ll/ۛܺ᩵;

    .line 432
    :cond_0
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 433
    iget-object v0, p0, Ll/᩸ܺ᩵;->۫:Ll/ۛܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۛܺ᩵;->֫(Ll/۬ܺ᩵;)V

    .line 436
    :cond_1
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    .line 437
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/᩸ܺ᩵;->ۨ:I

    .line 438
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result p1

    iput p1, p0, Ll/᩸ܺ᩵;->᩺:I

    return-void
.end method
