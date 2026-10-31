.class public final Ll/֨ۢܿ;
.super Ljava/lang/Object;
.source "V702"


# instance fields
.field public ֡:I

.field public ֡֫:Ll/ܰܺܿ;

.field public ֨:Z

.field public ֨֫:I

.field public ֫:J

.field public ֫֫:Z

.field public ۖ:I

.field public ۖ֫:J

.field public ۗ:Ll/ܶۢܿ;

.field public ۗ֫:I

.field public ۘ:Ll/ۚܺܿ;

.field public ۘ֫:I

.field public ۙ:Z

.field public ۙ֫:I

.field public ۚ:I

.field public ۚ֫:I

.field public ۛ:I

.field public ۛ֫:Ll/ۛܺܿ;

.field public ۜ:I

.field public ۜ֫:I

.field public ۟:I

.field public ۟֫:I

.field public ۠:I

.field public ۠֫:I

.field public ۡ:J

.field public ۡ֫:Ll/᩶ܺܿ;

.field public ۢ:Ll/᩶ۘܿ;

.field public ۢ֫:Ll/ܶۢܿ;

.field public ۤ:I

.field public ۤ֫:I

.field public ۧ:I

.field public ۧ֫:I

.field public ۨ:I

.field public ۨ֫:J

.field public ۫:I

.field public ۫֫:[I

.field public ۬:I

.field public ۬֫:Ll/᩶ۢܿ;

.field public ܰ:I

.field public ܰ֫:Z

.field public ܳ:I

.field public ܳ֫:I

.field public ܶ:I

.field public ܶ֫:I

.field public ܺ:J

.field public ܺ֫:I

.field public ܽ:I

.field public ܽ֫:Z

.field public ܿ:Ll/ܶۢܿ;

.field public ܿ֫:Z

.field public ᩳ:I

.field public ᩳ֫:Ll/ܺۢܿ;

.field public ᩴ:Z

.field public ᩴ֫:I

.field public ᩵:Z

.field public ᩵֫:I

.field public ᩶:I

.field public ᩶֫:Z

.field public ᩷:I

.field public ᩷֫:I

.field public ᩸:Ll/ܿۢܿ;

.field public ᩸֫:I

.field public ᩹:I

.field public ᩹֫:I

.field public ᩺:I

.field public ᩺֫:I

.field public ᩻:I

.field public ᩻֫:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 5395
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    .line 5403
    iput v0, p0, Ll/֨ۢܿ;->ۖ:I

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ll/֨ۢܿ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 6

    .line 5517
    iget-object v0, p0, Ll/֨ۢܿ;->ۘ:Ll/ۚܺܿ;

    iget-object v1, v0, Ll/ۚܺܿ;->ܽ:Ll/۬᩷ܿ;

    if-nez v1, :cond_0

    .line 5519
    iget v1, p0, Ll/֨ۢܿ;->ᩴ֫:I

    iget-object v0, v0, Ll/ۚܺܿ;->ۧ:[I

    array-length v0, v0

    if-ge v1, v0, :cond_2

    add-int/lit8 v0, v1, 0x1

    iput v0, p0, Ll/֨ۢܿ;->ᩴ֫:I

    return v1

    .line 5521
    :cond_0
    :goto_0
    iget-wide v2, p0, Ll/֨ۢܿ;->֫:J

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget v0, p0, Ll/֨ۢܿ;->᩵֫:I

    invoke-virtual {v1}, Ll/۬᩷ܿ;->֫()I

    move-result v2

    if-ge v0, v2, :cond_1

    .line 5522
    iget v0, p0, Ll/֨ۢܿ;->᩵֫:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/֨ۢܿ;->᩵֫:I

    iget v2, p0, Ll/֨ۢܿ;->ۜ:I

    invoke-virtual {v1, v0, v2}, Ll/۬᩷ܿ;->֫(II)J

    move-result-wide v2

    iput-wide v2, p0, Ll/֨ۢܿ;->֫:J

    goto :goto_0

    .line 5524
    :cond_1
    iget-wide v0, p0, Ll/֨ۢܿ;->֫:J

    cmp-long v2, v0, v4

    if-nez v2, :cond_3

    :cond_2
    const/4 v0, -0x1

    return v0

    .line 5527
    :cond_3
    iget v2, p0, Ll/֨ۢܿ;->᩵֫:I

    add-int/lit8 v2, v2, -0x1

    shl-int/lit8 v2, v2, 0x6

    invoke-static {v0, v1}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    add-int/2addr v0, v2

    .line 5528
    iget-wide v1, p0, Ll/֨ۢܿ;->֫:J

    const-wide/16 v3, 0x1

    sub-long v3, v1, v3

    and-long/2addr v1, v3

    iput-wide v1, p0, Ll/֨ۢܿ;->֫:J

    return v0
.end method

.method public final ֫(Ll/᩶ۢܿ;Ll/᩶ܺܿ;IJJJIILl/ܶۢܿ;I)V
    .locals 0

    .line 5470
    iput-object p1, p0, Ll/֨ۢܿ;->۬֫:Ll/᩶ۢܿ;

    .line 5471
    iput-object p2, p0, Ll/֨ۢܿ;->ۡ֫:Ll/᩶ܺܿ;

    .line 5472
    iput-object p12, p0, Ll/֨ۢܿ;->ۢ֫:Ll/ܶۢܿ;

    .line 5473
    iget p1, p12, Ll/ܶۢܿ;->ܽ:I

    iput p1, p0, Ll/֨ۢܿ;->ۚ֫:I

    .line 5474
    iput p3, p0, Ll/֨ۢܿ;->ۜ֫:I

    .line 5475
    iput p13, p0, Ll/֨ۢܿ;->۠֫:I

    .line 5476
    iput-wide p4, p0, Ll/֨ۢܿ;->ۖ֫:J

    .line 5477
    iput-wide p6, p0, Ll/֨ۢܿ;->ۡ:J

    .line 5478
    iput-wide p8, p0, Ll/֨ۢܿ;->ܺ:J

    .line 5479
    iput p10, p0, Ll/֨ۢܿ;->֡:I

    .line 5480
    iput p11, p0, Ll/֨ۢܿ;->ۚ:I

    const/4 p1, 0x0

    .line 5481
    iput p1, p0, Ll/֨ۢܿ;->ܶ֫:I

    .line 5482
    iput p3, p0, Ll/֨ۢܿ;->ۙ֫:I

    iput p3, p0, Ll/֨ۢܿ;->ۗ֫:I

    const/4 p2, -0x1

    .line 5483
    iput p2, p0, Ll/֨ۢܿ;->۟֫:I

    iput p2, p0, Ll/֨ۢܿ;->᩷֫:I

    .line 5484
    iput p2, p0, Ll/֨ۢܿ;->᩹֫:I

    iput p2, p0, Ll/֨ۢܿ;->᩸֫:I

    .line 5485
    iput p1, p0, Ll/֨ۢܿ;->ᩴ֫:I

    .line 5486
    iput-boolean p1, p0, Ll/֨ۢܿ;->֫֫:Z

    .line 5487
    iput p2, p0, Ll/֨ۢܿ;->ܰ:I

    iput p2, p0, Ll/֨ۢܿ;->ܳ֫:I

    .line 5488
    iput p2, p0, Ll/֨ۢܿ;->᩻֫:I

    iput p2, p0, Ll/֨ۢܿ;->۟:I

    .line 5489
    iput p2, p0, Ll/֨ۢܿ;->ۧ֫:I

    .line 5490
    iput p2, p0, Ll/֨ۢܿ;->᩺:I

    const/4 p3, 0x0

    .line 5491
    iput-object p3, p0, Ll/֨ۢܿ;->ᩳ֫:Ll/ܺۢܿ;

    .line 5492
    iput-object p3, p0, Ll/֨ۢܿ;->֡֫:Ll/ܰܺܿ;

    .line 5493
    iput p2, p0, Ll/֨ۢܿ;->᩷:I

    .line 5494
    iput-object p3, p0, Ll/֨ۢܿ;->ۢ:Ll/᩶ۘܿ;

    .line 5495
    iput-boolean p1, p0, Ll/֨ۢܿ;->֨:Z

    .line 5496
    iput-boolean p1, p0, Ll/֨ۢܿ;->ܽ֫:Z

    .line 5497
    iput-boolean p1, p0, Ll/֨ۢܿ;->ܿ֫:Z

    .line 5498
    iput-boolean p1, p0, Ll/֨ۢܿ;->ܰ֫:Z

    .line 5499
    iput-object p3, p0, Ll/֨ۢܿ;->ۘ:Ll/ۚܺܿ;

    .line 5500
    iput-object p3, p0, Ll/֨ۢܿ;->ۗ:Ll/ܶۢܿ;

    .line 5501
    iput-object p3, p0, Ll/֨ۢܿ;->ۛ֫:Ll/ۛܺܿ;

    .line 5502
    iput-object p3, p0, Ll/֨ۢܿ;->۫֫:[I

    .line 5503
    iput p1, p0, Ll/֨ۢܿ;->ۤ֫:I

    .line 5504
    iput p2, p0, Ll/֨ۢܿ;->۬:I

    iput p2, p0, Ll/֨ۢܿ;->ۨ:I

    .line 5505
    iput p1, p0, Ll/֨ۢܿ;->۫:I

    .line 5506
    iput p11, p0, Ll/֨ۢܿ;->ܶ:I

    .line 5507
    iput p2, p0, Ll/֨ۢܿ;->᩶:I

    .line 5508
    iput-boolean p1, p0, Ll/֨ۢܿ;->ۙ:Z

    .line 5509
    iput-boolean p1, p0, Ll/֨ۢܿ;->ᩴ:Z

    .line 5510
    iput-boolean p1, p0, Ll/֨ۢܿ;->᩵:Z

    .line 5511
    iput-object p3, p0, Ll/֨ۢܿ;->᩸:Ll/ܿۢܿ;

    .line 5512
    iput-boolean p1, p0, Ll/֨ۢܿ;->᩶֫:Z

    return-void
.end method
