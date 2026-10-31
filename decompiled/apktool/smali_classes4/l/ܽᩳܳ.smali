.class public final Ll/ܽᩳܳ;
.super Ll/ۧᩳܳ;
.source "970R"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1587
    invoke-direct {p0}, Ll/ۧᩳܳ;-><init>()V

    .line 1588
    iput p1, p0, Ll/ܽᩳܳ;->֫:I

    .line 1589
    iput p2, p0, Ll/ܽᩳܳ;->ܽ:I

    .line 1590
    iput p3, p0, Ll/ܽᩳܳ;->ۧ:I

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܽᩳܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܽᩳܳ;->֫:I

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܽᩳܳ;I)I
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ۧ(Ll/ܽᩳܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ܽᩳܳ;->ܽ:I

    return p0
.end method

.method private ᩳ(I)I
    .locals 4

    int-to-long v0, p1

    .line 1680
    iget p1, p0, Ll/ܽᩳܳ;->֫:I

    int-to-long v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-gtz p1, :cond_0

    const/4 p1, 0x0

    return p1

    .line 1684
    :cond_0
    iget p1, p0, Ll/ܽᩳܳ;->ܽ:I

    int-to-long v2, p1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    int-to-long v2, p1

    div-long/2addr v0, v2

    .line 1685
    iget p1, p0, Ll/ܽᩳܳ;->ۧ:I

    int-to-long v2, p1

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method


# virtual methods
.method public final ֫(II)I
    .locals 0

    .line 1658
    invoke-direct {p0, p2}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p2

    invoke-direct {p0, p1}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p1

    sub-int/2addr p2, p1

    const/4 p1, 0x0

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public final ֫()J
    .locals 2

    const-wide/16 v0, 0x30

    return-wide v0
.end method

.method public final ֫(IILl/᩸ܽܳ;)V
    .locals 2

    .line 1649
    invoke-direct {p0, p1}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p1

    .line 1650
    invoke-direct {p0, p2}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p2

    :goto_0
    if-ge p1, p2, :cond_0

    .line 1652
    iget v0, p0, Ll/ܽᩳܳ;->ܽ:I

    mul-int v0, v0, p1

    iget v1, p0, Ll/ܽᩳܳ;->֫:I

    add-int/2addr v0, v1

    invoke-interface {p3, p1, v0}, Ll/᩸ܽܳ;->֫(II)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ֫(Ljava/io/DataOutputStream;I)V
    .locals 5

    const/4 v0, 0x3

    .line 1672
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1673
    iget v0, p0, Ll/ܽᩳܳ;->֫:I

    int-to-long v0, v0

    int-to-long v2, p2

    sub-long/2addr v0, v2

    long-to-int p2, v0

    int-to-long v2, p2

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1674
    iget p2, p0, Ll/ܽᩳܳ;->ܽ:I

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1675
    iget p2, p0, Ll/ܽᩳܳ;->ۧ:I

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    return-void

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ֫([BIIBI)V
    .locals 5

    .line 1630
    invoke-direct {p0, p2}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result v0

    .line 1631
    invoke-direct {p0, p3}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p3

    if-lt v0, p3, :cond_0

    goto :goto_1

    .line 1635
    :cond_0
    iget v1, p0, Ll/ܽᩳܳ;->֫:I

    const/4 v2, 0x1

    iget v3, p0, Ll/ܽᩳܳ;->ܽ:I

    if-ne v3, v2, :cond_1

    add-int/2addr v1, v0

    add-int/2addr v1, p5

    sub-int/2addr v1, p2

    add-int/2addr p3, v1

    sub-int/2addr p3, v0

    .line 1637
    invoke-static {p1, v1, p3, p4}, Ljava/util/Arrays;->fill([BIIB)V

    return-void

    :cond_1
    :goto_0
    if-ge v0, p3, :cond_2

    add-int v2, p5, v1

    mul-int v4, v0, v3

    add-int/2addr v4, v2

    sub-int/2addr v4, p2

    .line 1642
    aput-byte p4, p1, v4

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final ֫(I)Z
    .locals 2

    .line 1617
    iget v0, p0, Ll/ܽᩳܳ;->ۧ:I

    const/4 v1, 0x1

    if-le v0, v1, :cond_1

    iget v0, p0, Ll/ܽᩳܳ;->ܽ:I

    if-lt v0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    return v1
.end method

.method public final ֫(Ll/ۧᩳܳ;)Z
    .locals 2

    .line 1624
    instance-of v0, p1, Ll/ܽᩳܳ;

    if-eqz v0, :cond_0

    .line 1622
    check-cast p1, Ll/ܽᩳܳ;

    iget v0, p0, Ll/ܽᩳܳ;->֫:I

    iget v1, p1, Ll/ܽᩳܳ;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܽᩳܳ;->ܽ:I

    iget v1, p1, Ll/ܽᩳܳ;->ܽ:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/ܽᩳܳ;->ۧ:I

    iget p1, p1, Ll/ܽᩳܳ;->ۧ:I

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I)I
    .locals 1

    const v0, 0x7fffffff

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v0, p1, 0x1

    .line 1607
    :goto_0
    invoke-direct {p0, v0}, Ll/ܽᩳܳ;->ᩳ(I)I

    move-result p1

    .line 1609
    iget v0, p0, Ll/ܽᩳܳ;->ۧ:I

    if-ge p1, v0, :cond_1

    .line 1612
    iget v0, p0, Ll/ܽᩳܳ;->ܽ:I

    mul-int p1, p1, v0

    iget v0, p0, Ll/ܽᩳܳ;->֫:I

    add-int/2addr p1, v0

    return p1

    .line 1610
    :cond_1
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    const-string v0, "No next start"

    invoke-direct {p1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()J
    .locals 2

    const-wide/16 v0, 0xc

    return-wide v0
.end method

.method public final ܽ()I
    .locals 1

    .line 1594
    iget v0, p0, Ll/ܽᩳܳ;->ۧ:I

    return v0
.end method

.method public final ܽ(I)I
    .locals 2

    if-ltz p1, :cond_0

    .line 1599
    iget v0, p0, Ll/ܽᩳܳ;->ۧ:I

    if-ge p1, v0, :cond_0

    .line 1602
    iget v0, p0, Ll/ܽᩳܳ;->ܽ:I

    mul-int p1, p1, v0

    iget v0, p0, Ll/ܽᩳܳ;->֫:I

    add-int/2addr p1, v0

    return p1

    .line 1600
    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Start ordinal "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1600
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
