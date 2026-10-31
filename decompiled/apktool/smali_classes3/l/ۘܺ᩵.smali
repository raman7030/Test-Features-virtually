.class public final Ll/ۘܺ᩵;
.super Ll/ۡܺ᩵;
.source "09ZB"


# instance fields
.field public ۛ:I

.field public ۤ:Ll/֨ܺ᩵;

.field public ۨ:I

.field public ۫:Ljava/lang/String;

.field public ܰ:Ll/ۤܺ᩵;

.field public ᩺:I


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 4

    .line 31
    new-instance v0, Ll/֨ܺ᩵;

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 31
    new-instance v1, Ll/ۤܺ᩵;

    .line 24
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const/4 v2, 0x0

    .line 30
    iput v2, v1, Ll/ۤܺ᩵;->֫:I

    .line 526
    invoke-direct {p0}, Ll/ۡܺ᩵;-><init>()V

    .line 527
    iput-object p1, p0, Ll/ۘܺ᩵;->۫:Ljava/lang/String;

    const/16 p1, 0xc8

    .line 528
    iput p1, p0, Ll/ۘܺ᩵;->ۛ:I

    const v3, 0xffff

    .line 529
    iput v3, p0, Ll/ۘܺ᩵;->ۨ:I

    .line 530
    iput-object v0, p0, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    .line 531
    iput-object v1, p0, Ll/ۘܺ᩵;->ܰ:Ll/ۤܺ᩵;

    .line 32
    iput p1, v0, Ll/֨ܺ᩵;->ۧ:I

    .line 33
    new-instance p1, Ll/ۚܺ᩵;

    invoke-direct {p1}, Ll/ۚܺ᩵;-><init>()V

    iput-object p1, v0, Ll/֨ܺ᩵;->֫:Ll/ۛܺ᩵;

    .line 34
    iput v2, p0, Ll/ۡܺ᩵;->ۗ:I

    const/4 p1, 0x3

    .line 35
    iput p1, p0, Ll/ۡܺ᩵;->᩶:I

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    const/16 v0, 0x15

    return v0
.end method

.method public final ܳ(Ll/۬ܺ᩵;)V
    .locals 2

    .line 537
    iget-object v0, p0, Ll/ۘܺ᩵;->ܰ:Ll/ۤܺ᩵;

    iget-object v1, p0, Ll/ۘܺ᩵;->۫:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->֫(Ljava/lang/String;)V

    .line 538
    iget v1, p0, Ll/ۘܺ᩵;->ۛ:I

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 539
    iget v1, p0, Ll/ۘܺ᩵;->ۨ:I

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->ᩳ(I)V

    .line 540
    iget-object v1, p0, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    invoke-virtual {p1, v1}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    .line 541
    iget-object v1, p0, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    if-eqz v1, :cond_0

    .line 542
    invoke-virtual {v1, p1}, Ll/֨ܺ᩵;->ۧ(Ll/۬ܺ᩵;)V

    .line 545
    :cond_0
    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->֫(Ljava/lang/Object;)V

    if-eqz v0, :cond_1

    .line 36
    iget v0, v0, Ll/ۤܺ᩵;->֫:I

    invoke-virtual {p1, v0}, Ll/۬ܺ᩵;->ᩳ(I)V

    :cond_1
    return-void
.end method

.method public final ᩳ(Ll/۬ܺ᩵;)V
    .locals 2

    .line 555
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_1

    .line 557
    iget-object v0, p0, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    if-nez v0, :cond_0

    .line 558
    new-instance v0, Ll/֨ܺ᩵;

    .line 24
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 558
    iput-object v0, p0, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    .line 560
    :cond_0
    iget-object v0, p0, Ll/ۘܺ᩵;->ۤ:Ll/֨ܺ᩵;

    invoke-virtual {v0, p1}, Ll/֨ܺ᩵;->֫(Ll/۬ܺ᩵;)V

    .line 563
    :cond_1
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v0

    if-eqz v0, :cond_2

    .line 565
    iget-object v0, p0, Ll/ۘܺ᩵;->ܰ:Ll/ۤܺ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result v1

    iput v1, v0, Ll/ۤܺ᩵;->֫:I

    .line 568
    :cond_2
    invoke-virtual {p1}, Ll/۬ܺ᩵;->֫()I

    move-result p1

    iput p1, p0, Ll/ۘܺ᩵;->᩺:I

    return-void
.end method
