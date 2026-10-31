.class public final Ll/֡۬֫;
.super Ljava/lang/Object;
.source "78R7"


# instance fields
.field public final ֫:Ll/ܺۧۧ;

.field public final ۜ:Ll/ۙ᩵֫;

.field public final ۢ:I

.field public final ۧ:J

.field public final ܳ:Ll/ܺۧۧ;

.field public final ܽ:Ll/ۙ᩵֫;

.field public final ܿ:J

.field public final ᩳ:I

.field public final ᩷:J

.field public final ᩻:J


# direct methods
.method public constructor <init>(JLl/ۙ᩵֫;ILl/ܺۧۧ;JLl/ۙ᩵֫;ILl/ܺۧۧ;JJ)V
    .locals 0

    .line 547
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 548
    iput-wide p1, p0, Ll/֡۬֫;->᩻:J

    .line 549
    iput-object p3, p0, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    .line 550
    iput p4, p0, Ll/֡۬֫;->ۢ:I

    .line 551
    iput-object p5, p0, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    .line 552
    iput-wide p6, p0, Ll/֡۬֫;->ܿ:J

    .line 553
    iput-object p8, p0, Ll/֡۬֫;->ܽ:Ll/ۙ᩵֫;

    .line 554
    iput p9, p0, Ll/֡۬֫;->ᩳ:I

    .line 555
    iput-object p10, p0, Ll/֡۬֫;->֫:Ll/ܺۧۧ;

    .line 556
    iput-wide p11, p0, Ll/֡۬֫;->ۧ:J

    .line 557
    iput-wide p13, p0, Ll/֡۬֫;->᩷:J

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 565
    const-class v2, Ll/֡۬֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 568
    :cond_1
    check-cast p1, Ll/֡۬֫;

    .line 569
    iget-wide v2, p0, Ll/֡۬֫;->᩻:J

    iget-wide v4, p1, Ll/֡۬֫;->᩻:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ll/֡۬֫;->ۢ:I

    iget v3, p1, Ll/֡۬֫;->ۢ:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/֡۬֫;->ܿ:J

    iget-wide v4, p1, Ll/֡۬֫;->ܿ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget v2, p0, Ll/֡۬֫;->ᩳ:I

    iget v3, p1, Ll/֡۬֫;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-wide v2, p0, Ll/֡۬֫;->ۧ:J

    iget-wide v4, p1, Ll/֡۬֫;->ۧ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-wide v2, p0, Ll/֡۬֫;->᩷:J

    iget-wide v4, p1, Ll/֡۬֫;->᩷:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    iget-object v2, p0, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    iget-object v3, p1, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    .line 575
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    iget-object v3, p1, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    .line 576
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֡۬֫;->ܽ:Ll/ۙ᩵֫;

    iget-object v3, p1, Ll/֡۬֫;->ܽ:Ll/ۙ᩵֫;

    .line 577
    invoke-static {v2, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/֡۬֫;->֫:Ll/ܺۧۧ;

    iget-object p1, p1, Ll/֡۬֫;->֫:Ll/ܺۧۧ;

    .line 578
    invoke-static {v2, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 8

    .line 583
    iget-wide v0, p0, Ll/֡۬֫;->᩻:J

    .line 584
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget v1, p0, Ll/֡۬֫;->ۢ:I

    .line 586
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-wide v2, p0, Ll/֡۬֫;->ܿ:J

    .line 588
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget v3, p0, Ll/֡۬֫;->ᩳ:I

    .line 590
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-wide v4, p0, Ll/֡۬֫;->ۧ:J

    .line 592
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    iget-wide v5, p0, Ll/֡۬֫;->᩷:J

    .line 593
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/16 v6, 0xa

    new-array v6, v6, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v0, v6, v7

    const/4 v0, 0x1

    iget-object v7, p0, Ll/֡۬֫;->ۜ:Ll/ۙ᩵֫;

    aput-object v7, v6, v0

    const/4 v0, 0x2

    aput-object v1, v6, v0

    const/4 v0, 0x3

    iget-object v1, p0, Ll/֡۬֫;->ܳ:Ll/ܺۧۧ;

    aput-object v1, v6, v0

    const/4 v0, 0x4

    aput-object v2, v6, v0

    const/4 v0, 0x5

    iget-object v1, p0, Ll/֡۬֫;->ܽ:Ll/ۙ᩵֫;

    aput-object v1, v6, v0

    const/4 v0, 0x6

    aput-object v3, v6, v0

    const/4 v0, 0x7

    iget-object v1, p0, Ll/֡۬֫;->֫:Ll/ܺۧۧ;

    aput-object v1, v6, v0

    const/16 v0, 0x8

    aput-object v4, v6, v0

    const/16 v0, 0x9

    aput-object v5, v6, v0

    .line 583
    invoke-static {v6}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
