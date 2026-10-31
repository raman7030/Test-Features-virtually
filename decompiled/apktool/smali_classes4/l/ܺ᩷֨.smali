.class public final Ll/ܺ᩷֨;
.super Ll/ᩳ᩷֨;
.source "P1SF"


# instance fields
.field public final ܽ:[Ll/ۡ᩷֨;

.field public final synthetic ᩳ:Ll/ۖ᩷֨;


# direct methods
.method public constructor <init>(Ll/ۖ᩷֨;I)V
    .locals 1

    .line 509
    iput-object p1, p0, Ll/ܺ᩷֨;->ᩳ:Ll/ۖ᩷֨;

    const/4 p1, 0x0

    .line 510
    invoke-direct {p0, p2, p1}, Ll/ᩳ᩷֨;-><init>(II)V

    const/4 v0, 0x1

    shl-int p2, v0, p2

    .line 512
    new-array p2, p2, [Ll/ۡ᩷֨;

    iput-object p2, p0, Ll/ܺ᩷֨;->ܽ:[Ll/ۡ᩷֨;

    .line 513
    :goto_0
    iget-object p2, p0, Ll/ܺ᩷֨;->ܽ:[Ll/ۡ᩷֨;

    array-length v0, p2

    if-ge p1, v0, :cond_0

    .line 514
    new-instance v0, Ll/ۡ᩷֨;

    invoke-direct {v0, p0}, Ll/ۡ᩷֨;-><init>(Ll/ܺ᩷֨;)V

    aput-object v0, p2, p1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(IIIILl/֡᩷֨;)I
    .locals 5

    .line 539
    iget-object v0, p0, Ll/ܺ᩷֨;->ᩳ:Ll/ۖ᩷֨;

    iget-object v1, v0, Ll/ܿ᩷֨;->ᩳ:[[S

    .line 540
    invoke-virtual {p5}, Ll/֡᩷֨;->֫()I

    move-result v2

    aget-object v1, v1, v2

    iget v0, v0, Ll/ܿ᩷֨;->ۢ:I

    and-int/2addr v0, p4

    aget-short v0, v1, v0

    const/4 v1, 0x0

    .line 539
    invoke-static {v0, v1}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result v0

    .line 542
    invoke-virtual {p0, p3, p4}, Ll/ᩳ᩷֨;->֫(II)I

    move-result p3

    .line 543
    invoke-virtual {p5}, Ll/֡᩷֨;->ۧ()Z

    move-result p4

    const/high16 p5, 0x10000

    const/16 v2, 0x100

    iget-object v3, p0, Ll/ܺ᩷֨;->ܽ:[Ll/ۡ᩷֨;

    if-eqz p4, :cond_1

    .line 544
    aget-object p4, v3, p3

    or-int/2addr p1, v2

    :cond_0
    ushr-int/lit8 p2, p1, 0x8

    ushr-int/lit8 p3, p1, 0x7

    and-int/lit8 p3, p3, 0x1

    .line 596
    iget-object v2, p4, Ll/ܽ᩷֨;->֫:[S

    aget-short p2, v2, p2

    invoke-static {p2, p3}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p2

    add-int/2addr v1, p2

    shl-int/lit8 p1, p1, 0x1

    if-lt p1, p5, :cond_0

    goto :goto_0

    .line 545
    :cond_1
    aget-object p3, v3, p3

    or-int/2addr p1, v2

    :cond_2
    shl-int/lit8 p2, p2, 0x1

    and-int p4, p2, v2

    add-int/2addr p4, v2

    ushr-int/lit8 v3, p1, 0x8

    add-int/2addr p4, v3

    ushr-int/lit8 v3, p1, 0x7

    and-int/lit8 v3, v3, 0x1

    .line 618
    iget-object v4, p3, Ll/ܽ᩷֨;->֫:[S

    aget-short p4, v4, p4

    invoke-static {p4, v3}, Ll/ܶ᩷֨;->ܽ(II)I

    move-result p4

    add-int/2addr v1, p4

    shl-int/lit8 p1, p1, 0x1

    xor-int p4, p2, p1

    not-int p4, p4

    and-int/2addr v2, p4

    if-lt p1, p5, :cond_2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final ֫()V
    .locals 3

    .line 532
    iget-object v0, p0, Ll/ܺ᩷֨;->ᩳ:Ll/ۖ᩷֨;

    iget-object v1, v0, Ll/ۖ᩷֨;->ܶ:Ll/ܰۜ֨;

    iget v2, v0, Ll/ۖ᩷֨;->ۙ:I

    add-int/lit8 v2, v2, 0x1

    invoke-virtual {v1, v2}, Ll/ܰۜ֨;->֫(I)I

    move-result v2

    .line 533
    invoke-virtual {v1}, Ll/ܰۜ֨;->ܽ()I

    move-result v1

    iget v0, v0, Ll/ۖ᩷֨;->ۙ:I

    sub-int/2addr v1, v0

    .line 532
    invoke-virtual {p0, v2, v1}, Ll/ᩳ᩷֨;->֫(II)I

    move-result v0

    .line 534
    iget-object v1, p0, Ll/ܺ᩷֨;->ܽ:[Ll/ۡ᩷֨;

    aget-object v0, v1, v0

    invoke-virtual {v0}, Ll/ۡ᩷֨;->֫()V

    return-void
.end method

.method public final ۧ()V
    .locals 2

    .line 527
    iget-object v0, p0, Ll/ܺ᩷֨;->ܽ:[Ll/ۡ᩷֨;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ll/ۡ᩷֨;->֫()V

    return-void
.end method

.method public final ܽ()V
    .locals 3

    const/4 v0, 0x0

    .line 518
    :goto_0
    iget-object v1, p0, Ll/ܺ᩷֨;->ܽ:[Ll/ۡ᩷֨;

    array-length v2, v1

    if-ge v0, v2, :cond_0

    .line 519
    aget-object v1, v1, v0

    .line 107
    iget-object v1, v1, Ll/ܽ᩷֨;->֫:[S

    invoke-static {v1}, Ll/ۜ᩺ۘ;->֫([S)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
