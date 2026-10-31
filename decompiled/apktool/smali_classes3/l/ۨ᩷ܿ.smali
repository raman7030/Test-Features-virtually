.class public final Ll/ۨ᩷ܿ;
.super Ljava/lang/Object;
.source "5707"


# instance fields
.field public ֡:[I

.field public final ֡֫:I

.field public ֨:[I

.field public ֨֫:J

.field public ֫:[I

.field public ֫֫:I

.field public ֫ۧ:[I

.field public ۖ:[I

.field public ۖ֫:[I

.field public ۗ:Z

.field public ۗ֫:[I

.field public ۘ:[I

.field public ۘ֫:[I

.field public ۙ:[I

.field public ۙ֫:[I

.field public ۚ:[I

.field public ۚ֫:[I

.field public ۛ:I

.field public ۛ֫:Z

.field public ۜ:[I

.field public ۜ֫:I

.field public ۟:Ll/᩶ۘܿ;

.field public final ۟֫:Z

.field public ۠:[Ll/᩶ۘܿ;

.field public ۠֫:[I

.field public ۡ:[I

.field public ۡ֫:[I

.field public ۢ:[I

.field public ۢ֫:[I

.field public ۤ:I

.field public ۤ֫:[I

.field public ۧ:[I

.field public ۧ֫:I

.field public ۧۧ:[I

.field public ۨ:I

.field public ۨ֫:I

.field public ۫:I

.field public ۫֫:[I

.field public ۬:[I

.field public final ۬֫:Ll/᩺ܺܿ;

.field public ܰ:I

.field public ܰ֫:I

.field public ܳ:[I

.field public ܳ֫:Z

.field public final ܳۧ:I

.field public final ܶ:Z

.field public ܶ֫:I

.field public ܺ:[I

.field public ܺ֫:I

.field public ܽ:[I

.field public ܽ֫:I

.field public ܽۧ:I

.field public ܿ:[I

.field public ܿ֫:I

.field public ܿۧ:[I

.field public ᩳ:[I

.field public ᩳ֫:I

.field public final ᩳۧ:I

.field public final ᩴ:Z

.field public ᩴ֫:[I

.field public ᩵:[I

.field public ᩵֫:[I

.field public ᩶:I

.field public ᩶֫:[I

.field public ᩷:[Ll/᩶ۘܿ;

.field public ᩷֫:[I

.field public ᩸:[I

.field public ᩸֫:I

.field public ᩹:I

.field public ᩹֫:[I

.field public ᩺:I

.field public ᩺֫:J

.field public ᩻:[I

.field public ᩻֫:I

.field public final ᩻ۧ:I


# direct methods
.method public constructor <init>(Ll/᩺ܺܿ;IZ)V
    .locals 2

    .line 113
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-ltz p2, :cond_2

    const-string v0, "program"

    .line 115
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/ۨ᩷ܿ;->۬֫:Ll/᩺ܺܿ;

    .line 116
    iput p2, p0, Ll/ۨ᩷ܿ;->᩻ۧ:I

    .line 117
    invoke-virtual {p1}, Ll/᩺ܺܿ;->ܿ()Z

    move-result v0

    iput-boolean v0, p0, Ll/ۨ᩷ܿ;->ܶ:Z

    .line 118
    invoke-virtual {p1}, Ll/᩺ܺܿ;->ۧ()Z

    move-result p1

    iput-boolean p1, p0, Ll/ۨ᩷ܿ;->ᩴ:Z

    .line 119
    iput-boolean p3, p0, Ll/ۨ᩷ܿ;->۟֫:Z

    if-eqz v0, :cond_0

    const/16 p3, 0x14

    goto :goto_0

    :cond_0
    const/16 p3, 0x12

    :goto_0
    if-eqz p1, :cond_1

    const/16 v1, 0xc

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    add-int/2addr p3, v1

    .line 121
    iput p3, p0, Ll/ۨ᩷ܿ;->ᩳۧ:I

    const/high16 p3, 0x40000

    .line 123
    invoke-static {v0, p1}, Ll/۫᩷ܿ;->֫(ZZ)I

    move-result p1

    div-int/2addr p3, p1

    iput p3, p0, Ll/ۨ᩷ܿ;->֡֫:I

    int-to-long p1, p2

    const-wide/16 v0, 0x3ff

    add-long/2addr p1, v0

    const-wide/16 v0, 0x400

    .line 124
    div-long/2addr p1, v0

    const-wide/16 v0, 0x1000

    .line 125
    invoke-static {v0, v1, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    long-to-int p2, p1

    iput p2, p0, Ll/ۨ᩷ܿ;->ܳۧ:I

    int-to-long p1, p2

    .line 126
    iput-wide p1, p0, Ll/ۨ᩷ܿ;->֨֫:J

    return-void

    .line 114
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative text length"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(I)V
    .locals 2

    .line 579
    iget-object v0, p0, Ll/ۨ᩷ܿ;->᩶֫:[I

    if-eqz v0, :cond_0

    array-length v1, v0

    if-gt p1, v1, :cond_0

    const/4 p1, 0x4

    .line 580
    iput p1, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    return-void

    :cond_0
    if-nez v0, :cond_1

    const/16 v0, 0x20

    .line 583
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_0

    .line 584
    :cond_1
    array-length v0, v0

    shl-int/lit8 v0, v0, 0x1

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget v0, p0, Ll/ۨ᩷ܿ;->֡֫:I

    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_0
    iput p1, p0, Ll/ۨ᩷ܿ;->᩻֫:I

    const/4 p1, 0x0

    .line 585
    iput p1, p0, Ll/ۨ᩷ܿ;->ۜ֫:I

    const/4 p1, 0x3

    .line 586
    iput p1, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    return-void
.end method

.method private ֫(IILl/ۛ᩷ܿ;)Z
    .locals 4

    if-nez p2, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    .line 515
    :cond_0
    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    add-int/lit8 v1, p2, -0x1

    aget v0, v0, v1

    .line 516
    :goto_0
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩶֫:[I

    aget v1, v1, p1

    if-ne v1, v0, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۡ֫:[I

    aget v0, v0, p1

    .line 517
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->۬(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۙ֫:[I

    aget v0, v0, p1

    .line 518
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->֡(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ᩴ֫:[I

    aget v0, v0, p1

    .line 519
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->᩵(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۗ֫:[I

    aget v0, v0, p1

    .line 520
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۧ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->۬:[I

    aget v0, v0, p1

    .line 521
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ܳ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۤ֫:[I

    aget v0, v0, p1

    .line 522
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->֫(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->۫֫:[I

    aget v0, v0, p1

    .line 523
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->᩹(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۖ֫:[I

    aget v0, v0, p1

    .line 524
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ᩳ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->᩵֫:[I

    aget v0, v0, p1

    .line 525
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->᩷(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->֫ۧ:[I

    aget v0, v0, p1

    .line 526
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->۫(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۧۧ:[I

    aget v0, v0, p1

    .line 527
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->۠(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ܽ:[I

    aget v0, v0, p1

    .line 528
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->᩻(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۚ֫:[I

    aget v0, v0, p1

    .line 529
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۙ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->۠֫:[I

    aget v0, v0, p1

    .line 530
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->᩶(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۧ:[I

    aget v0, v0, p1

    .line 531
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ܽ(I)J

    move-result-wide v1

    long-to-int v2, v1

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->֫:[I

    aget v0, v0, p1

    .line 532
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ܽ(I)J

    move-result-wide v1

    const/16 v3, 0x20

    ushr-long/2addr v1, v3

    long-to-int v2, v1

    if-ne v0, v2, :cond_4

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ܶ:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۨ᩷ܿ;->֨:[I

    aget v0, v0, p1

    .line 533
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ܿ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    aget-object v0, v0, p1

    .line 534
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۚ(I)Ll/᩶ۘܿ;

    move-result-object v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 660
    invoke-virtual {v0}, Ll/᩶ۘܿ;->᩻()I

    move-result v2

    invoke-virtual {v1}, Ll/᩶ۘܿ;->᩻()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 661
    invoke-virtual {v0}, Ll/᩶ۘܿ;->ܳ()I

    move-result v2

    invoke-virtual {v1}, Ll/᩶ۘܿ;->ܳ()I

    move-result v3

    if-ne v2, v3, :cond_4

    invoke-virtual {v0}, Ll/᩶ۘܿ;->ܿ()I

    move-result v2

    invoke-virtual {v1}, Ll/᩶ۘܿ;->ܿ()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 662
    invoke-virtual {v0}, Ll/᩶ۘܿ;->ۧ()I

    move-result v2

    invoke-virtual {v1}, Ll/᩶ۘܿ;->ۧ()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 663
    invoke-virtual {v0}, Ll/᩶ۘܿ;->֫()I

    move-result v2

    invoke-virtual {v1}, Ll/᩶ۘܿ;->֫()I

    move-result v3

    if-ne v2, v3, :cond_4

    .line 664
    invoke-virtual {v0}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v2

    invoke-virtual {v1}, Ll/᩶ۘܿ;->ᩳ()Z

    move-result v3

    if-ne v2, v3, :cond_4

    .line 665
    invoke-virtual {v0}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v0

    invoke-virtual {v1}, Ll/᩶ۘܿ;->ܽ()Ll/᩸ۘܿ;

    move-result-object v1

    if-ne v0, v1, :cond_4

    .line 534
    :cond_2
    :goto_1
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ᩴ:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۢ֫:[I

    aget v0, v0, p1

    .line 536
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۤ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->᩷֫:[I

    aget v0, v0, p1

    .line 537
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ܶ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->᩸:[I

    aget v0, v0, p1

    .line 538
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۖ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۚ:[I

    aget v0, v0, p1

    .line 539
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->᩸(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->֡:[I

    aget v0, v0, p1

    .line 540
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->֨(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->᩵:[I

    aget v0, v0, p1

    .line 541
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۘ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۖ:[I

    aget v0, v0, p1

    .line 542
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۜ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۘ:[I

    aget v0, v0, p1

    .line 543
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۢ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ܺ:[I

    aget v0, v0, p1

    .line 544
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۗ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ܿ:[I

    aget v0, v0, p1

    .line 545
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ۡ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ܳ:[I

    aget v0, v0, p1

    .line 546
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ᩴ(I)I

    move-result v1

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۡ:[I

    aget p1, v0, p1

    .line 547
    invoke-interface {p3, p2}, Ll/ۛ᩷ܿ;->ܺ(I)I

    move-result p2

    if-ne p1, p2, :cond_4

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method public static ֫(I[I)[I
    .locals 0

    if-nez p1, :cond_0

    .line 649
    new-array p0, p0, [I

    return-object p0

    :cond_0
    invoke-static {p1, p0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    return-object p0
.end method

.method private ۢ()V
    .locals 1

    const/4 v0, 0x0

    .line 669
    iput-object v0, p0, Ll/ۨ᩷ܿ;->ܿۧ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۜ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۙ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    .line 670
    iput-object v0, p0, Ll/ۨ᩷ܿ;->ᩳ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩻:[I

    .line 671
    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    .line 672
    iput-object v0, p0, Ll/ۨ᩷ܿ;->۫֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۤ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->۬:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۗ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ᩴ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۙ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۡ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩶֫:[I

    .line 673
    iput-object v0, p0, Ll/ۨ᩷ܿ;->۠֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۚ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ܽ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۧۧ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->֫ۧ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩵֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۖ֫:[I

    .line 674
    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۢ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۧ:[I

    .line 675
    iput-object v0, p0, Ll/ۨ᩷ܿ;->֨:[I

    .line 676
    iput-object v0, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    .line 677
    iput-object v0, p0, Ll/ۨ᩷ܿ;->֡:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۚ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩸:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩷֫:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۢ֫:[I

    .line 678
    iput-object v0, p0, Ll/ۨ᩷ܿ;->ܺ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۘ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۖ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩵:[I

    .line 679
    iput-object v0, p0, Ll/ۨ᩷ܿ;->ۡ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ܳ:[I

    iput-object v0, p0, Ll/ۨ᩷ܿ;->ܿ:[I

    const/4 v0, 0x0

    .line 680
    iput v0, p0, Ll/ۨ᩷ܿ;->ܺ֫:I

    iput v0, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    iput v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    return-void
.end method

.method private ۧ(IIILl/᩶ۘܿ;Ll/ۛ᩷ܿ;I)Z
    .locals 7

    const/4 v0, 0x0

    .line 294
    iput-boolean v0, p0, Ll/ۨ᩷ܿ;->ܳ֫:Z

    .line 295
    invoke-interface {p5}, Ll/ۛ᩷ܿ;->ۧ()I

    move-result v1

    if-lez v1, :cond_4

    .line 296
    iget v2, p0, Ll/ۨ᩷ܿ;->֡֫:I

    if-gt v1, v2, :cond_4

    iget v2, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    const/16 v3, 0x400

    if-ne v2, v3, :cond_0

    goto :goto_0

    .line 297
    :cond_0
    invoke-interface {p5}, Ll/ۛ᩷ܿ;->֫()I

    move-result v2

    .line 298
    invoke-interface {p5}, Ll/ۛ᩷ܿ;->ܽ()I

    move-result v3

    .line 299
    iget-boolean v4, p0, Ll/ۨ᩷ܿ;->ᩴ:Z

    const/4 v5, 0x1

    if-eqz v4, :cond_1

    if-lt v2, v5, :cond_4

    if-gez v3, :cond_1

    goto :goto_0

    .line 300
    :cond_1
    iget v0, p0, Ll/ۨ᩷ܿ;->ܺ֫:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-ltz p6, :cond_3

    if-gt p6, v0, :cond_3

    if-lez p6, :cond_2

    .line 305
    iget-object v4, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    add-int/lit8 v6, p6, -0x1

    aget v4, v4, v6

    .line 306
    invoke-direct {p0, v4, v6, p5}, Ll/ۨ᩷ܿ;->֫(IILl/ۛ᩷ܿ;)Z

    move-result p5

    if-nez p5, :cond_2

    const/4 p6, 0x0

    .line 309
    :cond_2
    iput p1, p0, Ll/ۨ᩷ܿ;->ܽ֫:I

    .line 310
    iput p2, p0, Ll/ۨ᩷ܿ;->֫֫:I

    .line 311
    iput p3, p0, Ll/ۨ᩷ܿ;->ܰ:I

    .line 312
    iput v2, p0, Ll/ۨ᩷ܿ;->ۨ:I

    .line 313
    iput v3, p0, Ll/ۨ᩷ܿ;->ۛ:I

    .line 314
    iput v1, p0, Ll/ۨ᩷ܿ;->ۧ֫:I

    .line 315
    iput p6, p0, Ll/ۨ᩷ܿ;->۫:I

    .line 316
    iput v0, p0, Ll/ۨ᩷ܿ;->ۤ:I

    .line 317
    iput-object p4, p0, Ll/ۨ᩷ܿ;->۟:Ll/᩶ۘܿ;

    .line 318
    iput v5, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    return v5

    .line 302
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid verified checkpoint prefix"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return v0
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x1

    .line 463
    iput-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    const/4 v0, 0x0

    .line 464
    iput-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    .line 465
    iput v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    const/4 v1, 0x0

    .line 466
    iput-object v1, p0, Ll/ۨ᩷ܿ;->۟:Ll/᩶ۘܿ;

    .line 467
    iput-boolean v0, p0, Ll/ۨ᩷ܿ;->ܳ֫:Z

    .line 468
    invoke-direct {p0}, Ll/ۨ᩷ܿ;->ۢ()V

    return-void
.end method

.method public final ֫(III)V
    .locals 1

    .line 203
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    if-gt p1, p2, :cond_0

    if-ltz p2, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->᩻ۧ:I

    if-gt p2, v0, :cond_0

    if-ltz p3, :cond_0

    if-gt p3, p2, :cond_0

    .line 209
    iput p1, p0, Ll/ۨ᩷ܿ;->᩶:I

    .line 210
    iput p2, p0, Ll/ۨ᩷ܿ;->ܰ֫:I

    .line 211
    iput p3, p0, Ll/ۨ᩷ܿ;->ۨ֫:I

    .line 212
    iget p1, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    iput p1, p0, Ll/ۨ᩷ܿ;->᩹:I

    .line 213
    iget p1, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    iput p1, p0, Ll/ۨ᩷ܿ;->ܶ֫:I

    .line 214
    iget-wide p1, p0, Ll/ۨ᩷ܿ;->֨֫:J

    iput-wide p1, p0, Ll/ۨ᩷ܿ;->᩺֫:J

    const/4 p1, 0x0

    .line 215
    iput p1, p0, Ll/ۨ᩷ܿ;->ܺ֫:I

    const/4 p1, 0x1

    .line 216
    iput-boolean p1, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    return-void

    .line 207
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid checkpoint root transaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(J)V
    .locals 3

    .line 424
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    iget-wide v0, p0, Ll/ۨ᩷ܿ;->֨֫:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    const/4 v0, 0x0

    .line 428
    invoke-virtual {p0, v0}, Ll/ۨ᩷ܿ;->֫(Z)V

    .line 430
    iput-wide p1, p0, Ll/ۨ᩷ܿ;->֨֫:J

    return-void

    .line 426
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid tentative checkpoint transaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(JJ)V
    .locals 5

    .line 180
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_6

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v0, 0x20

    ushr-long v0, p1, v0

    long-to-int v1, v0

    long-to-int p2, p1

    .line 183
    iget p1, p0, Ll/ۨ᩷ܿ;->᩹:I

    if-lt v1, p1, :cond_5

    iget p1, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    if-gt v1, p1, :cond_5

    iget v0, p0, Ll/ۨ᩷ܿ;->ܶ֫:I

    if-lt p2, v0, :cond_5

    iget v0, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    if-gt p2, v0, :cond_5

    const-wide/16 v2, 0x0

    cmp-long v4, p3, v2

    if-ltz v4, :cond_5

    iget-wide v2, p0, Ll/ۨ᩷ܿ;->֨֫:J

    cmp-long v4, p3, v2

    if-gtz v4, :cond_5

    if-ne v1, p1, :cond_1

    if-eq p2, v0, :cond_4

    :cond_1
    const/4 v0, 0x0

    if-eq v1, p1, :cond_2

    .line 188
    iget-object v2, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    invoke-static {v2, v1, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 189
    :cond_2
    iget p1, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    if-eq p2, p1, :cond_3

    iget-object v2, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    if-eqz v2, :cond_3

    .line 190
    invoke-static {v2, p2, p1, v0}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 192
    :cond_3
    iput v1, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    .line 193
    iput p2, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    const/4 p1, 0x0

    .line 195
    iput p1, p0, Ll/ۨ᩷ܿ;->ܺ֫:I

    .line 198
    :cond_4
    iput-wide p3, p0, Ll/ۨ᩷ܿ;->֨֫:J

    return-void

    .line 185
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid syntax checkpoint mark"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_0
    return-void
.end method

.method public final ֫(Ll/ۛ᩷ܿ;)V
    .locals 9

    const-string v0, "source"

    .line 324
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 325
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_19

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-eqz v0, :cond_19

    invoke-interface {p1}, Ll/ۛ᩷ܿ;->ۧ()I

    move-result v0

    iget v1, p0, Ll/ۨ᩷ܿ;->ۧ֫:I

    if-ne v0, v1, :cond_19

    .line 328
    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/16 v5, 0x10

    iget-boolean v6, p0, Ll/ۨ᩷ܿ;->ᩴ:Z

    const/4 v7, 0x1

    if-ne v0, v7, :cond_9

    .line 329
    iget v0, p0, Ll/ۨ᩷ܿ;->۫:I

    iget v1, p0, Ll/ۨ᩷ܿ;->ۤ:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    aget v1, v1, v0

    .line 330
    invoke-direct {p0, v1, v0, p1}, Ll/ۨ᩷ܿ;->֫(IILl/ۛ᩷ܿ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 331
    iget p1, p0, Ll/ۨ᩷ܿ;->۫:I

    add-int/2addr p1, v7

    iput p1, p0, Ll/ۨ᩷ܿ;->۫:I

    return-void

    .line 334
    :cond_0
    iget p1, p0, Ll/ۨ᩷ܿ;->ۧ֫:I

    iget v0, p0, Ll/ۨ᩷ܿ;->۫:I

    sub-int/2addr p1, v0

    .line 335
    iget v0, p0, Ll/ۨ᩷ܿ;->֡֫:I

    iget v1, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    sub-int/2addr v0, v1

    if-le p1, v0, :cond_1

    .line 399
    iput v3, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    .line 400
    iput-object v2, p0, Ll/ۨ᩷ܿ;->۟:Ll/᩶ۘܿ;

    return-void

    .line 339
    :cond_1
    iget v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    add-int/2addr v0, v7

    .line 551
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    if-eqz v1, :cond_2

    array-length v2, v1

    if-gt v0, v2, :cond_2

    goto :goto_0

    :cond_2
    if-nez v1, :cond_4

    .line 553
    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 554
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    .line 555
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ۙ:[I

    .line 556
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ۜ:[I

    .line 557
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ܿۧ:[I

    if-eqz v6, :cond_3

    .line 559
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۨ᩷ܿ;->᩻:[I

    .line 560
    new-array v1, v0, [I

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ᩳ:[I

    .line 562
    :cond_3
    new-array v0, v0, [Ll/᩶ۘܿ;

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    goto :goto_0

    .line 565
    :cond_4
    array-length v1, v1

    shl-int/2addr v1, v7

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/16 v1, 0x400

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 566
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    .line 567
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۙ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ۙ:[I

    .line 568
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۜ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ۜ:[I

    .line 569
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ܿۧ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ܿۧ:[I

    if-eqz v6, :cond_5

    .line 571
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩻:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܿ;->᩻:[I

    .line 572
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ᩳ:[I

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, p0, Ll/ۨ᩷ܿ;->ᩳ:[I

    .line 574
    :cond_5
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ll/᩶ۘܿ;

    iput-object v0, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    .line 340
    :goto_0
    iget v0, p0, Ll/ۨ᩷ܿ;->۫:I

    if-nez v0, :cond_6

    const/4 v1, -0x1

    goto :goto_1

    :cond_6
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    :goto_1
    iput v1, p0, Ll/ۨ᩷ܿ;->ᩳ֫:I

    .line 341
    iput v0, p0, Ll/ۨ᩷ܿ;->᩺:I

    .line 342
    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    if-eqz v0, :cond_8

    iget v1, p0, Ll/ۨ᩷ܿ;->ۧ֫:I

    array-length v0, v0

    if-le v1, v0, :cond_7

    goto :goto_2

    .line 346
    :cond_7
    iget v0, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    add-int/2addr v0, p1

    invoke-direct {p0, v0}, Ll/ۨ᩷ܿ;->֫(I)V

    return-void

    .line 343
    :cond_8
    :goto_2
    iput v4, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    return-void

    :cond_9
    if-ne v0, v4, :cond_c

    .line 350
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    if-nez p1, :cond_a

    invoke-static {v5, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_3

    .line 351
    :cond_a
    array-length p1, p1

    shl-int/2addr p1, v7

    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 352
    :goto_3
    iget-object v0, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    if-nez v0, :cond_b

    new-array p1, p1, [I

    goto :goto_4

    :cond_b
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    :goto_4
    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    .line 353
    iget p1, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    iget v0, p0, Ll/ۨ᩷ܿ;->ۧ֫:I

    add-int/2addr p1, v0

    iget v0, p0, Ll/ۨ᩷ܿ;->۫:I

    sub-int/2addr p1, v0

    invoke-direct {p0, p1}, Ll/ۨ᩷ܿ;->֫(I)V

    return-void

    :cond_c
    const/4 v4, 0x3

    const/4 v5, 0x4

    .line 356
    iget-boolean v8, p0, Ll/ۨ᩷ܿ;->ܶ:Z

    if-ne v0, v4, :cond_13

    .line 357
    iget p1, p0, Ll/ۨ᩷ܿ;->ۜ֫:I

    add-int/lit8 v0, p1, 0x1

    iput v0, p0, Ll/ۨ᩷ܿ;->ۜ֫:I

    iget v0, p0, Ll/ۨ᩷ܿ;->᩻֫:I

    packed-switch p1, :pswitch_data_0

    add-int/lit8 v1, p1, -0x12

    if-eqz v8, :cond_10

    if-nez v1, :cond_d

    .line 619
    iget-object p1, p0, Ll/ۨ᩷ܿ;->֨:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->֨:[I

    goto/16 :goto_6

    .line 609
    :pswitch_0
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۢ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۢ:[I

    goto/16 :goto_6

    .line 608
    :pswitch_1
    iget-object p1, p0, Ll/ۨ᩷ܿ;->֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->֫:[I

    goto/16 :goto_6

    .line 607
    :pswitch_2
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۧ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۧ:[I

    goto/16 :goto_6

    .line 606
    :pswitch_3
    iget-object p1, p0, Ll/ۨ᩷ܿ;->۠֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->۠֫:[I

    goto/16 :goto_6

    .line 605
    :pswitch_4
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۚ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۚ֫:[I

    goto/16 :goto_6

    .line 604
    :pswitch_5
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ܽ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ܽ:[I

    goto/16 :goto_6

    .line 603
    :pswitch_6
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۧۧ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۧۧ:[I

    goto/16 :goto_6

    .line 602
    :pswitch_7
    iget-object p1, p0, Ll/ۨ᩷ܿ;->֫ۧ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->֫ۧ:[I

    goto/16 :goto_6

    .line 601
    :pswitch_8
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩵֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->᩵֫:[I

    goto/16 :goto_6

    .line 600
    :pswitch_9
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۖ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۖ֫:[I

    goto/16 :goto_6

    .line 599
    :pswitch_a
    iget-object p1, p0, Ll/ۨ᩷ܿ;->۫֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->۫֫:[I

    goto/16 :goto_6

    .line 598
    :pswitch_b
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۤ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۤ֫:[I

    goto/16 :goto_6

    .line 597
    :pswitch_c
    iget-object p1, p0, Ll/ۨ᩷ܿ;->۬:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->۬:[I

    goto/16 :goto_6

    .line 596
    :pswitch_d
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۗ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۗ֫:[I

    goto/16 :goto_6

    .line 595
    :pswitch_e
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ᩴ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ᩴ֫:[I

    goto/16 :goto_6

    .line 594
    :pswitch_f
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۙ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۙ֫:[I

    goto/16 :goto_6

    .line 593
    :pswitch_10
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۡ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۡ֫:[I

    goto/16 :goto_6

    .line 592
    :pswitch_11
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩶֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->᩶֫:[I

    goto/16 :goto_6

    :cond_d
    if-ne v1, v7, :cond_f

    .line 623
    iget-object p1, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    if-nez p1, :cond_e

    .line 653
    new-array p1, v0, [Ll/᩶ۘܿ;

    goto :goto_5

    :cond_e
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ll/᩶ۘܿ;

    .line 623
    :goto_5
    iput-object p1, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    goto/16 :goto_6

    :cond_f
    add-int/lit8 v1, p1, -0x14

    :cond_10
    const-string p1, "Invalid checkpoint state column"

    if-eqz v6, :cond_12

    packed-switch v1, :pswitch_data_1

    .line 644
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 643
    :pswitch_12
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۡ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۡ:[I

    goto :goto_6

    .line 642
    :pswitch_13
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ܳ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ܳ:[I

    goto :goto_6

    .line 641
    :pswitch_14
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ܿ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ܿ:[I

    goto :goto_6

    .line 640
    :pswitch_15
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ܺ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ܺ:[I

    goto :goto_6

    .line 639
    :pswitch_16
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۘ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۘ:[I

    goto :goto_6

    .line 638
    :pswitch_17
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۖ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۖ:[I

    goto :goto_6

    .line 637
    :pswitch_18
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩵:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->᩵:[I

    goto :goto_6

    .line 636
    :pswitch_19
    iget-object p1, p0, Ll/ۨ᩷ܿ;->֡:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->֡:[I

    goto :goto_6

    .line 635
    :pswitch_1a
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۚ:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۚ:[I

    goto :goto_6

    .line 634
    :pswitch_1b
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩸:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->᩸:[I

    goto :goto_6

    .line 633
    :pswitch_1c
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩷֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->᩷֫:[I

    goto :goto_6

    .line 632
    :pswitch_1d
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۢ֫:[I

    invoke-static {v0, p1}, Ll/ۨ᩷ܿ;->֫(I[I)[I

    move-result-object p1

    iput-object p1, p0, Ll/ۨ᩷ܿ;->ۢ֫:[I

    .line 358
    :goto_6
    iget p1, p0, Ll/ۨ᩷ܿ;->ۜ֫:I

    iget v0, p0, Ll/ۨ᩷ܿ;->ᩳۧ:I

    if-ne p1, v0, :cond_11

    .line 359
    iput v5, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    :cond_11
    return-void

    .line 629
    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    if-ne v0, v5, :cond_18

    .line 364
    iget v0, p0, Ll/ۨ᩷ܿ;->᩺:I

    if-ge v0, v1, :cond_16

    .line 365
    iget v1, p0, Ll/ۨ᩷ܿ;->ᩳ֫:I

    .line 472
    iget v2, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    .line 473
    iget-object v3, p0, Ll/ۨ᩷ܿ;->᩶֫:[I

    aput v1, v3, v2

    .line 474
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۡ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->۬(I)I

    move-result v3

    aput v3, v1, v2

    .line 475
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۙ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->֡(I)I

    move-result v3

    aput v3, v1, v2

    .line 476
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ᩴ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->᩵(I)I

    move-result v3

    aput v3, v1, v2

    .line 477
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۗ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۧ(I)I

    move-result v3

    aput v3, v1, v2

    .line 478
    iget-object v1, p0, Ll/ۨ᩷ܿ;->۬:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ܳ(I)I

    move-result v3

    aput v3, v1, v2

    .line 479
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۤ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->֫(I)I

    move-result v3

    aput v3, v1, v2

    .line 480
    iget-object v1, p0, Ll/ۨ᩷ܿ;->۫֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->᩹(I)I

    move-result v3

    aput v3, v1, v2

    .line 481
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۖ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ᩳ(I)I

    move-result v3

    aput v3, v1, v2

    .line 482
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩵֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->᩷(I)I

    move-result v3

    aput v3, v1, v2

    .line 483
    iget-object v1, p0, Ll/ۨ᩷ܿ;->֫ۧ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->۫(I)I

    move-result v3

    aput v3, v1, v2

    .line 484
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۧۧ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->۠(I)I

    move-result v3

    aput v3, v1, v2

    .line 485
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ܽ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->᩻(I)I

    move-result v3

    aput v3, v1, v2

    .line 486
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۚ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۙ(I)I

    move-result v3

    aput v3, v1, v2

    .line 487
    iget-object v1, p0, Ll/ۨ᩷ܿ;->۠֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->᩶(I)I

    move-result v3

    aput v3, v1, v2

    .line 488
    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ܽ(I)J

    move-result-wide v3

    .line 489
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۧ:[I

    long-to-int v5, v3

    aput v5, v1, v2

    .line 490
    iget-object v1, p0, Ll/ۨ᩷ܿ;->֫:[I

    const/16 v5, 0x20

    ushr-long/2addr v3, v5

    long-to-int v4, v3

    aput v4, v1, v2

    if-eqz v8, :cond_14

    .line 492
    iget-object v1, p0, Ll/ۨ᩷ܿ;->֨:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ܿ(I)I

    move-result v3

    aput v3, v1, v2

    .line 493
    iget-object v1, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۚ(I)Ll/᩶ۘܿ;

    move-result-object v3

    aput-object v3, v1, v2

    :cond_14
    if-eqz v6, :cond_15

    .line 496
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۢ֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۤ(I)I

    move-result v3

    aput v3, v1, v2

    .line 497
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩷֫:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ܶ(I)I

    move-result v3

    aput v3, v1, v2

    .line 498
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩸:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۖ(I)I

    move-result v3

    aput v3, v1, v2

    .line 499
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۚ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->᩸(I)I

    move-result v3

    aput v3, v1, v2

    .line 500
    iget-object v1, p0, Ll/ۨ᩷ܿ;->֡:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->֨(I)I

    move-result v3

    aput v3, v1, v2

    .line 501
    iget-object v1, p0, Ll/ۨ᩷ܿ;->᩵:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۘ(I)I

    move-result v3

    aput v3, v1, v2

    .line 502
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۖ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۜ(I)I

    move-result v3

    aput v3, v1, v2

    .line 503
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۘ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۢ(I)I

    move-result v3

    aput v3, v1, v2

    .line 504
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ܺ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۗ(I)I

    move-result v3

    aput v3, v1, v2

    .line 505
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ܿ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ۡ(I)I

    move-result v3

    aput v3, v1, v2

    .line 506
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ܳ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ᩴ(I)I

    move-result v3

    aput v3, v1, v2

    .line 507
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۡ:[I

    invoke-interface {p1, v0}, Ll/ۛ᩷ܿ;->ܺ(I)I

    move-result p1

    aput p1, v1, v2

    .line 509
    :cond_15
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۢ:[I

    add-int/2addr v0, v7

    aput v0, p1, v2

    .line 365
    iput v2, p0, Ll/ۨ᩷ܿ;->ᩳ֫:I

    .line 366
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۘ֫:[I

    iget v0, p0, Ll/ۨ᩷ܿ;->᩺:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Ll/ۨ᩷ܿ;->᩺:I

    aput v2, p1, v0

    return-void

    .line 369
    :cond_16
    iput v1, p0, Ll/ۨ᩷ܿ;->ܺ֫:I

    .line 370
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    iget v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    iget v1, p0, Ll/ۨ᩷ܿ;->ܽ֫:I

    aput v1, p1, v0

    .line 371
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۙ:[I

    iget v1, p0, Ll/ۨ᩷ܿ;->֫֫:I

    aput v1, p1, v0

    .line 372
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ۜ:[I

    iget v1, p0, Ll/ۨ᩷ܿ;->ܰ:I

    aput v1, p1, v0

    .line 373
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ܿۧ:[I

    iget v1, p0, Ll/ۨ᩷ܿ;->ᩳ֫:I

    aput v1, p1, v0

    if-eqz v6, :cond_17

    .line 375
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩻:[I

    iget v1, p0, Ll/ۨ᩷ܿ;->ۨ:I

    aput v1, p1, v0

    .line 376
    iget-object p1, p0, Ll/ۨ᩷ܿ;->ᩳ:[I

    iget v1, p0, Ll/ۨ᩷ܿ;->ۛ:I

    aput v1, p1, v0

    .line 378
    :cond_17
    iget-object p1, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    iget-object v1, p0, Ll/ۨ᩷ܿ;->۟:Ll/᩶ۘܿ;

    aput-object v1, p1, v0

    add-int/2addr v0, v7

    .line 379
    iput v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    .line 380
    iput-boolean v7, p0, Ll/ۨ᩷ܿ;->ܳ֫:Z

    .line 399
    iput v3, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    .line 400
    iput-object v2, p0, Ll/ۨ᩷ܿ;->۟:Ll/᩶ۘܿ;

    return-void

    .line 384
    :cond_18
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Invalid checkpoint import phase"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 326
    :cond_19
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No matching checkpoint import"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch
.end method

.method public final ֫(Z)V
    .locals 4

    .line 405
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_3

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_3

    if-nez p1, :cond_2

    .line 409
    iget p1, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    iget v0, p0, Ll/ۨ᩷ܿ;->᩹:I

    const/4 v1, 0x0

    if-eq p1, v0, :cond_0

    iget-object v2, p0, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    invoke-static {v2, v0, p1, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 410
    :cond_0
    iget p1, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    iget v0, p0, Ll/ۨ᩷ܿ;->ܶ֫:I

    if-eq p1, v0, :cond_1

    iget-object v2, p0, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    if-eqz v2, :cond_1

    .line 411
    invoke-static {v2, v0, p1, v1}, Ljava/util/Arrays;->fill([Ljava/lang/Object;IILjava/lang/Object;)V

    .line 413
    :cond_1
    iget p1, p0, Ll/ۨ᩷ܿ;->᩹:I

    iput p1, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    .line 414
    iget p1, p0, Ll/ۨ᩷ܿ;->ܶ֫:I

    iput p1, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    .line 416
    iget-wide v0, p0, Ll/ۨ᩷ܿ;->֨֫:J

    iget-wide v2, p0, Ll/ۨ᩷ܿ;->᩺֫:J

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۨ᩷ܿ;->֨֫:J

    :cond_2
    const/4 p1, 0x0

    .line 418
    iput p1, p0, Ll/ۨ᩷ܿ;->ܺ֫:I

    .line 419
    iput-boolean p1, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    return-void

    .line 406
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No checkpoint root transaction"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IIIIIII)Z
    .locals 2

    .line 160
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_3

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_3

    .line 163
    iget v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    if-lt p1, v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 164
    :cond_0
    iget-object v1, p0, Ll/ۨ᩷ܿ;->ܿۧ:[I

    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->checkIndex(II)I

    move-result p1

    aget p1, v1, p1

    .line 165
    iget-object v0, p0, Ll/ۨ᩷ܿ;->ܺ:[I

    aget v1, v0, p1

    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/ۨ᩷ܿ;->ۡ֫:[I

    aget v1, v1, p1

    if-ne v1, p2, :cond_2

    iget-object p2, p0, Ll/ۨ᩷ܿ;->۬:[I

    aget p2, p2, p1

    if-ne p2, p3, :cond_2

    iget-object p2, p0, Ll/ۨ᩷ܿ;->ۢ֫:[I

    aget p2, p2, p1

    if-ne p2, p4, :cond_2

    .line 168
    iget-object p2, p0, Ll/ۨ᩷ܿ;->᩵֫:[I

    aput p5, p2, p1

    .line 169
    iget-object p2, p0, Ll/ۨ᩷ܿ;->᩸:[I

    if-gez p6, :cond_1

    const/4 p5, -0x1

    :cond_1
    aput p5, p2, p1

    .line 170
    iget-object p2, p0, Ll/ۨ᩷ܿ;->ۚ:[I

    aput p6, p2, p1

    .line 171
    iget-object p2, p0, Ll/ۨ᩷ܿ;->֡:[I

    aput p7, p2, p1

    .line 172
    aget p2, v0, p1

    or-int/lit8 p3, p2, 0x10

    aput p3, v0, p1

    if-ltz p6, :cond_2

    or-int/lit8 p2, p2, 0x11

    .line 173
    aput p2, v0, p1

    :cond_2
    const/4 p1, 0x1

    return p1

    .line 161
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No checkpoint confirmation transaction"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IIILl/᩶ۘܿ;Ll/ۛ᩷ܿ;I)Z
    .locals 5

    const-string v0, "dependency"

    .line 275
    invoke-static {p4, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source"

    .line 276
    invoke-static {p5, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 277
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_1

    int-to-long v0, p1

    iget-wide v2, p0, Ll/ۨ᩷ܿ;->֨֫:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    if-ltz p1, :cond_1

    iget v2, p0, Ll/ۨ᩷ܿ;->᩻ۧ:I

    if-ge p1, v2, :cond_1

    if-ltz p2, :cond_1

    if-gt p2, p1, :cond_1

    if-ltz p3, :cond_1

    if-gt p3, p1, :cond_1

    .line 280
    invoke-virtual {p4}, Ll/᩶ۘܿ;->᩻()I

    move-result v3

    if-ne v3, v2, :cond_1

    iget v2, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    if-eqz v2, :cond_0

    iget-object v3, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    add-int/lit8 v2, v2, -0x1

    aget v2, v3, v2

    if-lt v2, p1, :cond_0

    goto :goto_0

    .line 285
    :cond_0
    iget v2, p0, Ll/ۨ᩷ܿ;->ܳۧ:I

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/ۨ᩷ܿ;->֨֫:J

    .line 286
    invoke-direct/range {p0 .. p6}, Ll/ۨ᩷ܿ;->ۧ(IIILl/᩶ۘܿ;Ll/ۛ᩷ܿ;I)Z

    move-result p1

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ֫(ILl/᩶ۘܿ;Ll/᩵ۢܿ;)Z
    .locals 9

    const-string v0, "source"

    .line 250
    invoke-static {p3, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 251
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->ܰ֫:I

    if-lt p1, v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->᩻ۧ:I

    if-ge p1, v0, :cond_0

    .line 253
    invoke-virtual {p2}, Ll/᩶ۘܿ;->᩻()I

    move-result v1

    if-ne v1, v0, :cond_0

    .line 256
    iget v4, p0, Ll/ۨ᩷ܿ;->᩶:I

    iget v5, p0, Ll/ۨ᩷ܿ;->ۨ֫:I

    const/4 v8, 0x0

    move-object v2, p0

    move v3, p1

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v2 .. v8}, Ll/ۨ᩷ܿ;->ۧ(IIILl/᩶ۘܿ;Ll/ۛ᩷ܿ;I)Z

    move-result p1

    return p1

    .line 254
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Invalid syntax checkpoint capture"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(IZ)Z
    .locals 5

    .line 229
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_3

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_3

    .line 230
    invoke-virtual {p0}, Ll/ۨ᩷ܿ;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_3

    if-nez p2, :cond_0

    int-to-long v0, p1

    iget-wide v2, p0, Ll/ۨ᩷ܿ;->֨֫:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_3

    :cond_0
    iget v0, p0, Ll/ۨ᩷ܿ;->ܳۧ:I

    if-eqz p2, :cond_1

    int-to-long v1, p1

    int-to-long v3, v0

    add-long/2addr v1, v3

    iget-wide v3, p0, Ll/ۨ᩷ܿ;->֨֫:J

    cmp-long p2, v1, v3

    if-lez p2, :cond_3

    :cond_1
    if-ltz p1, :cond_3

    iget p2, p0, Ll/ۨ᩷ܿ;->᩻ۧ:I

    if-ge p1, p2, :cond_3

    iget p2, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    iget-object v2, p0, Ll/ۨ᩷ܿ;->᩹֫:[I

    sub-int/2addr p2, v1

    aget p2, v2, p2

    if-lt p2, p1, :cond_2

    goto :goto_0

    :cond_2
    int-to-long p1, p1

    int-to-long v2, v0

    add-long/2addr p1, v2

    .line 239
    iput-wide p1, p0, Ll/ۨ᩷ܿ;->֨֫:J

    .line 240
    iget-wide v2, p0, Ll/ۨ᩷ܿ;->᩺֫:J

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Ll/ۨ᩷ܿ;->᩺֫:J

    return v1

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۜ()J
    .locals 2

    .line 151
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_0

    .line 154
    iget-wide v0, p0, Ll/ۨ᩷ܿ;->֨֫:J

    return-wide v0

    .line 152
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No checkpoint root transaction"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ()Ll/ۤ᩷ܿ;
    .locals 59

    move-object/from16 v1, p0

    .line 435
    iget-boolean v0, v1, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_1

    iget-boolean v0, v1, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-nez v0, :cond_1

    iget v0, v1, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 438
    iput-boolean v0, v1, Ll/ۨ᩷ܿ;->ۗ:Z

    .line 439
    iget v0, v1, Ll/ۨ᩷ܿ;->ܽۧ:I

    if-nez v0, :cond_0

    .line 440
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩷ܿ;->ۢ()V

    .line 441
    iget v0, v1, Ll/ۨ᩷ܿ;->᩻ۧ:I

    const/4 v2, 0x0

    .line 121
    iget-object v3, v1, Ll/ۨ᩷ܿ;->۬֫:Ll/᩺ܺܿ;

    invoke-static {v3, v0, v2}, Ll/ۤ᩷ܿ;->֫(Ll/᩺ܺܿ;IZ)Ll/ۤ᩷ܿ;

    move-result-object v0

    return-object v0

    .line 444
    :cond_0
    :try_start_0
    new-instance v0, Ll/ۤ᩷ܿ;

    iget-object v3, v1, Ll/ۨ᩷ܿ;->۬֫:Ll/᩺ܺܿ;

    iget v4, v1, Ll/ۨ᩷ܿ;->᩻ۧ:I

    iget v5, v1, Ll/ۨ᩷ܿ;->ܽۧ:I

    iget-object v6, v1, Ll/ۨ᩷ܿ;->᩹֫:[I

    iget-object v7, v1, Ll/ۨ᩷ܿ;->ۙ:[I

    iget-object v8, v1, Ll/ۨ᩷ܿ;->ۜ:[I

    iget-object v9, v1, Ll/ۨ᩷ܿ;->ܿۧ:[I

    iget-object v10, v1, Ll/ۨ᩷ܿ;->᩻:[I

    iget-object v11, v1, Ll/ۨ᩷ܿ;->ᩳ:[I

    iget-object v12, v1, Ll/ۨ᩷ܿ;->᩷:[Ll/᩶ۘܿ;

    new-instance v47, Ll/۫᩷ܿ;

    iget v14, v1, Ll/ۨ᩷ܿ;->᩸֫:I

    iget-object v15, v1, Ll/ۨ᩷ܿ;->᩶֫:[I

    iget-object v2, v1, Ll/ۨ᩷ܿ;->ۡ֫:[I

    iget-object v13, v1, Ll/ۨ᩷ܿ;->ۙ֫:[I

    move-object/from16 v48, v12

    iget-object v12, v1, Ll/ۨ᩷ܿ;->ᩴ֫:[I

    move-object/from16 v49, v11

    iget-object v11, v1, Ll/ۨ᩷ܿ;->ۗ֫:[I

    move-object/from16 v50, v10

    iget-object v10, v1, Ll/ۨ᩷ܿ;->۬:[I

    move-object/from16 v51, v9

    iget-object v9, v1, Ll/ۨ᩷ܿ;->ۤ֫:[I

    move-object/from16 v52, v8

    iget-object v8, v1, Ll/ۨ᩷ܿ;->۫֫:[I

    move-object/from16 v53, v7

    iget-object v7, v1, Ll/ۨ᩷ܿ;->ۖ֫:[I

    move-object/from16 v54, v6

    iget-object v6, v1, Ll/ۨ᩷ܿ;->᩵֫:[I

    move/from16 v55, v5

    iget-object v5, v1, Ll/ۨ᩷ܿ;->֫ۧ:[I

    move/from16 v56, v4

    iget-object v4, v1, Ll/ۨ᩷ܿ;->ۧۧ:[I

    move-object/from16 v57, v3

    iget-object v3, v1, Ll/ۨ᩷ܿ;->ܽ:[I

    move-object/from16 v58, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۚ֫:[I

    move-object/from16 v28, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->۠֫:[I

    move-object/from16 v29, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۧ:[I

    move-object/from16 v30, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->֫:[I

    move-object/from16 v31, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->֨:[I

    move-object/from16 v32, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۢ:[I

    move-object/from16 v33, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->۠:[Ll/᩶ۘܿ;

    move-object/from16 v34, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۢ֫:[I

    move-object/from16 v35, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->᩷֫:[I

    move-object/from16 v36, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->᩸:[I

    move-object/from16 v37, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۚ:[I

    move-object/from16 v38, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->֡:[I

    move-object/from16 v39, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->᩵:[I

    move-object/from16 v40, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۖ:[I

    move-object/from16 v41, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۘ:[I

    move-object/from16 v42, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ܺ:[I

    move-object/from16 v43, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ܿ:[I

    move-object/from16 v44, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ܳ:[I

    move-object/from16 v45, v0

    iget-object v0, v1, Ll/ۨ᩷ܿ;->ۡ:[I

    move-object/from16 v17, v13

    move-object/from16 v13, v47

    move-object/from16 v16, v2

    move-object/from16 v18, v12

    move-object/from16 v19, v11

    move-object/from16 v20, v10

    move-object/from16 v21, v9

    move-object/from16 v22, v8

    move-object/from16 v23, v7

    move-object/from16 v24, v6

    move-object/from16 v25, v5

    move-object/from16 v26, v4

    move-object/from16 v27, v3

    move-object/from16 v46, v0

    invoke-direct/range {v13 .. v46}, Ll/۫᩷ܿ;-><init>(I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[I[Ll/᩶ۘܿ;[I[I[I[I[I[I[I[I[I[I[I[I)V

    iget-boolean v14, v1, Ll/ۨ᩷ܿ;->۟֫:Z

    move-object/from16 v2, v58

    move-object/from16 v3, v57

    move/from16 v4, v56

    move/from16 v5, v55

    move-object/from16 v6, v54

    move-object/from16 v7, v53

    move-object/from16 v8, v52

    move-object/from16 v9, v51

    move-object/from16 v10, v50

    move-object/from16 v11, v49

    move-object/from16 v12, v48

    move-object/from16 v13, v47

    invoke-direct/range {v2 .. v14}, Ll/ۤ᩷ܿ;-><init>(Ll/᩺ܺܿ;II[I[I[I[I[I[I[Ll/᩶ۘܿ;Ll/۫᩷ܿ;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 457
    invoke-direct/range {p0 .. p0}, Ll/ۨ᩷ܿ;->ۢ()V

    return-object v58

    :catchall_0
    move-exception v0

    invoke-direct/range {p0 .. p0}, Ll/ۨ᩷ܿ;->ۢ()V

    .line 458
    throw v0

    .line 436
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "Checkpoint recording is not complete"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܳ()J
    .locals 6

    .line 145
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۛ֫:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_1

    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-eqz v0, :cond_0

    goto :goto_0

    .line 146
    :cond_0
    iget v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    int-to-long v0, v0

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    iget v2, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    int-to-long v2, v2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    return-wide v0

    :cond_1
    :goto_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final ܽ()Z
    .locals 2

    .line 140
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ۗ:Z

    if-nez v0, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->ܽۧ:I

    const/16 v1, 0x400

    if-ge v0, v1, :cond_0

    iget v0, p0, Ll/ۨ᩷ܿ;->᩸֫:I

    iget v1, p0, Ll/ۨ᩷ܿ;->֡֫:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ܿ()Z
    .locals 2

    .line 393
    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-nez v0, :cond_0

    .line 394
    iget-boolean v0, p0, Ll/ۨ᩷ܿ;->ܳ֫:Z

    return v0

    .line 393
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Checkpoint import is active"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 388
    iget v0, p0, Ll/ۨ᩷ܿ;->ܿ֫:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 130
    iget v0, p0, Ll/ۨ᩷ܿ;->ܳۧ:I

    return v0
.end method

.method public final ᩻()J
    .locals 2

    .line 135
    iget-wide v0, p0, Ll/ۨ᩷ܿ;->֨֫:J

    return-wide v0
.end method
