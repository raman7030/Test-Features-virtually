.class public final Ll/۠ܽܳ;
.super Ll/ۧᩳܳ;
.source "970R"


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:[J


# direct methods
.method public constructor <init>(II[J)V
    .locals 0

    .line 1410
    invoke-direct {p0}, Ll/ۧᩳܳ;-><init>()V

    .line 1411
    iput p1, p0, Ll/۠ܽܳ;->֫:I

    .line 1412
    iput-object p3, p0, Ll/۠ܽܳ;->ܽ:[J

    .line 1413
    iput p2, p0, Ll/۠ܽܳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(II)I
    .locals 3

    const/4 v0, 0x0

    .line 1554
    filled-new-array {v0}, [I

    move-result-object v1

    .line 1555
    new-instance v2, Ll/֨ܽܳ;

    invoke-direct {v2, v1}, Ll/֨ܽܳ;-><init>([I)V

    invoke-virtual {p0, p1, p2, v2}, Ll/۠ܽܳ;->֫(IILl/᩸ܽܳ;)V

    .line 1556
    aget p1, v1, v0

    return p1
.end method

.method public final ֫()J
    .locals 4

    .line 1564
    iget-object v0, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x8

    mul-long v0, v0, v2

    const-wide/16 v2, 0x40

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final ֫(IILl/᩸ܽܳ;)V
    .locals 12

    int-to-long v0, p1

    .line 1521
    iget p1, p0, Ll/۠ܽܳ;->֫:I

    int-to-long v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    .line 1522
    iget-object v6, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v7, v6

    int-to-long v7, v7

    const/4 v9, 0x6

    shl-long/2addr v7, v9

    int-to-long v10, p2

    sub-long/2addr v10, v2

    invoke-static {v7, v8, v10, v11}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    cmp-long p2, v0, v2

    if-ltz p2, :cond_0

    goto :goto_3

    :cond_0
    long-to-int p2, v0

    long-to-int v0, v2

    ushr-int/lit8 v1, p2, 0x6

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    .line 1532
    aget-wide v7, v6, v2

    invoke-static {v7, v8}, Ljava/lang/Long;->bitCount(J)I

    move-result v7

    add-int/2addr v3, v7

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v0, -0x1

    ushr-int/2addr v2, v9

    :goto_1
    if-gt v1, v2, :cond_4

    .line 1536
    aget-wide v7, v6, v1

    move v9, v3

    :goto_2
    cmp-long v10, v7, v4

    if-eqz v10, :cond_3

    .line 1539
    invoke-static {v7, v8}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v10

    shl-int/lit8 v11, v1, 0x6

    add-int/2addr v11, v10

    if-lt v11, p2, :cond_2

    if-ge v11, v0, :cond_2

    add-int/2addr v11, p1

    .line 1542
    invoke-interface {p3, v9, v11}, Ll/᩸ܽܳ;->֫(II)V

    :cond_2
    add-int/lit8 v9, v9, 0x1

    const-wide/16 v10, 0x1

    sub-long v10, v7, v10

    and-long/2addr v7, v10

    goto :goto_2

    .line 1547
    :cond_3
    aget-wide v7, v6, v1

    invoke-static {v7, v8}, Ljava/lang/Long;->bitCount(J)I

    move-result v7

    add-int/2addr v3, v7

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_4
    :goto_3
    return-void
.end method

.method public final ֫(Ljava/io/DataOutputStream;I)V
    .locals 5

    const/4 v0, 0x2

    .line 1570
    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeByte(I)V

    .line 1571
    iget v0, p0, Ll/۠ܽܳ;->֫:I

    int-to-long v0, v0

    int-to-long v2, p2

    sub-long/2addr v0, v2

    long-to-int p2, v0

    int-to-long v2, p2

    cmp-long v4, v0, v2

    if-nez v4, :cond_1

    invoke-virtual {p1, p2}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1572
    iget-object p2, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v0, p2

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1573
    iget v0, p0, Ll/۠ܽܳ;->ۧ:I

    invoke-virtual {p1, v0}, Ljava/io/DataOutputStream;->writeInt(I)V

    .line 1574
    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-wide v2, p2, v1

    .line 1575
    invoke-virtual {p1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 0
    :cond_1
    new-instance p1, Ljava/lang/ArithmeticException;

    invoke-direct {p1}, Ljava/lang/ArithmeticException;-><init>()V

    throw p1
.end method

.method public final ֫([BIIBI)V
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    move/from16 v2, p3

    int-to-long v3, v1

    .line 1497
    iget v5, v0, Ll/۠ܽܳ;->֫:I

    int-to-long v6, v5

    sub-long/2addr v3, v6

    const-wide/16 v6, 0x0

    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    .line 1498
    iget-object v8, v0, Ll/۠ܽܳ;->ܽ:[J

    array-length v9, v8

    int-to-long v9, v9

    const/4 v11, 0x6

    shl-long/2addr v9, v11

    int-to-long v12, v2

    int-to-long v14, v5

    sub-long/2addr v12, v14

    invoke-static {v9, v10, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    cmp-long v12, v3, v9

    if-ltz v12, :cond_0

    goto :goto_2

    :cond_0
    long-to-int v4, v3

    ushr-int/lit8 v3, v4, 0x6

    long-to-int v4, v9

    add-int/lit8 v4, v4, -0x1

    ushr-int/2addr v4, v11

    :goto_0
    if-gt v3, v4, :cond_3

    .line 1506
    aget-wide v9, v8, v3

    :goto_1
    cmp-long v11, v9, v6

    if-eqz v11, :cond_2

    shl-int/lit8 v11, v3, 0x6

    add-int/2addr v11, v5

    .line 1509
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v12

    add-int/2addr v12, v11

    if-lt v12, v1, :cond_1

    if-ge v12, v2, :cond_1

    add-int v11, p5, v12

    sub-int/2addr v11, v1

    .line 1511
    aput-byte p4, p1, v11

    :cond_1
    const-wide/16 v11, 0x1

    sub-long v11, v9, v11

    and-long/2addr v9, v11

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    return-void
.end method

.method public final ֫(I)Z
    .locals 12

    const/high16 v0, -0x80000000

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    .line 1471
    :goto_0
    iget-object v5, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v6, v5

    if-ge v3, v6, :cond_2

    .line 1472
    aget-wide v6, v5, v3

    :goto_1
    const-wide/16 v8, 0x0

    cmp-long v5, v6, v8

    if-eqz v5, :cond_1

    shl-int/lit8 v5, v3, 0x6

    .line 1474
    iget v8, p0, Ll/۠ܽܳ;->֫:I

    add-int/2addr v8, v5

    .line 1475
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v5

    add-int/2addr v5, v8

    if-nez v4, :cond_0

    int-to-long v8, v0

    int-to-long v10, p1

    add-long/2addr v8, v10

    int-to-long v10, v5

    cmp-long v0, v8, v10

    if-lez v0, :cond_0

    return v2

    :cond_0
    const-wide/16 v8, 0x1

    sub-long v8, v6, v8

    and-long/2addr v6, v8

    const/4 v4, 0x0

    move v0, v5

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public final ֫(Ll/ۧᩳܳ;)Z
    .locals 2

    .line 1491
    instance-of v0, p1, Ll/۠ܽܳ;

    if-eqz v0, :cond_0

    .line 1489
    check-cast p1, Ll/۠ܽܳ;

    iget v0, p0, Ll/۠ܽܳ;->֫:I

    iget v1, p1, Ll/۠ܽܳ;->֫:I

    if-ne v0, v1, :cond_0

    iget v0, p0, Ll/۠ܽܳ;->ۧ:I

    iget v1, p1, Ll/۠ܽܳ;->ۧ:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ll/۠ܽܳ;->ܽ:[J

    iget-object p1, p1, Ll/۠ܽܳ;->ܽ:[J

    .line 1491
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([J[J)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final ۧ(I)I
    .locals 11

    int-to-long v0, p1

    .line 1444
    iget p1, p0, Ll/۠ܽܳ;->֫:I

    int-to-long v2, p1

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gez v4, :cond_0

    move-wide v0, v2

    .line 1448
    :cond_0
    iget-object v4, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v5, v4

    int-to-long v5, v5

    const/4 v7, 0x6

    shl-long/2addr v5, v7

    const-string v8, "No next start"

    cmp-long v9, v0, v5

    if-gez v9, :cond_3

    long-to-int v1, v0

    ushr-int/lit8 v0, v1, 0x6

    .line 1453
    aget-wide v5, v4, v0

    and-int/lit8 v1, v1, 0x3f

    const-wide/16 v9, -0x1

    shl-long/2addr v9, v1

    and-long/2addr v5, v9

    :goto_0
    cmp-long v1, v5, v2

    if-eqz v1, :cond_1

    shl-int/2addr v0, v7

    add-int/2addr p1, v0

    .line 1457
    invoke-static {v5, v6}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result v0

    add-int/2addr v0, p1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 1459
    array-length v1, v4

    if-eq v0, v1, :cond_2

    .line 1462
    aget-wide v5, v4, v0

    goto :goto_0

    .line 1460
    :cond_2
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1, v8}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 1449
    :cond_3
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1, v8}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ()J
    .locals 4

    .line 1560
    iget-object v0, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v0, v0

    int-to-long v0, v0

    const-wide/16 v2, 0x8

    mul-long v0, v0, v2

    return-wide v0
.end method

.method public final ܽ()I
    .locals 1

    .line 1417
    iget v0, p0, Ll/۠ܽܳ;->ۧ:I

    return v0
.end method

.method public final ܽ(I)I
    .locals 6

    if-ltz p1, :cond_3

    .line 1422
    iget v0, p0, Ll/۠ܽܳ;->ۧ:I

    if-ge p1, v0, :cond_3

    const/4 v0, 0x0

    .line 1426
    :goto_0
    iget-object v1, p0, Ll/۠ܽܳ;->ܽ:[J

    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 1427
    aget-wide v2, v1, v0

    invoke-static {v2, v3}, Ljava/lang/Long;->bitCount(J)I

    move-result v2

    if-lt p1, v2, :cond_0

    sub-int/2addr p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1432
    :cond_0
    aget-wide v2, v1, v0

    :goto_1
    add-int/lit8 v1, p1, -0x1

    if-lez p1, :cond_1

    const-wide/16 v4, 0x1

    sub-long v4, v2, v4

    and-long/2addr v2, v4

    move p1, v1

    goto :goto_1

    :cond_1
    shl-int/lit8 p1, v0, 0x6

    .line 1436
    iget v0, p0, Ll/۠ܽܳ;->֫:I

    add-int/2addr v0, p1

    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    move-result p1

    add-int/2addr p1, v0

    return p1

    .line 1438
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string v0, "Bitmap ordinal missing"

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    .line 1423
    :cond_3
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "Start ordinal "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 1423
    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
