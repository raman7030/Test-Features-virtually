.class public final Ll/֨ܺ᩵;
.super Ll/ۛܺ᩵;
.source "RA0U"


# instance fields
.field public ֫:Ll/ۛܺ᩵;

.field public ۧ:I


# virtual methods
.method public final ֫(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 495
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 496
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    iput v0, p0, Ll/֨ܺ᩵;->ۧ:I

    .line 497
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    .line 498
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_1

    .line 501
    iget-object v0, p0, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    if-nez v0, :cond_0

    .line 502
    new-instance v0, Ll/֡ܺ᩵;

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput-object v0, p0, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    .line 504
    :cond_0
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 505
    iget-object v0, p0, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    invoke-virtual {v0, p1}, Ll/ۛܺ᩵;->֫(Ll/۬ܺ᩵;)V

    :cond_1
    return-void
.end method

.method public final ۧ(Ll/۬ܺ᩵;)V
    .locals 1

    const/4 v0, 0x4

    .line 479
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ۧ(I)V

    .line 480
    iget v0, p0, Ll/֨ܺ᩵;->ۧ:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 481
    iget v0, p0, Ll/֨ܺ᩵;->ۧ:I

    .line 482
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 483
    iget-object v0, p0, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 485
    iget-object v0, p0, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    if-eqz v0, :cond_0

    .line 486
    iget-object p1, p1, Ll/۬ܺ᩵;->ۧ:Ll/۬ܺ᩵;

    .line 487
    invoke-virtual {v0, p1}, Ll/ۛܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    :cond_0
    return-void
.end method
