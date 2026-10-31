.class public final Ll/ۜ᩵᩻;
.super Ljava/io/OutputStream;
.source "R8AK"


# instance fields
.field public ۗ:I

.field public ۙ:Ljava/io/IOException;

.field public final ۛ:[B

.field public final ۟:Ll/ܿ᩵᩻;

.field public final ۤ:Ljava/util/ArrayDeque;

.field public ۨ:I

.field public ۫:J

.field public final ۬:Ll/۟ᩴ᩻;

.field public ܰ:Z

.field public final ᩶:Ll/᩶۫᩷;

.field public final ᩸:Ll/᩺ᩴ᩻;

.field public ᩹:Z

.field public final ᩺:Ll/ܰᩴ᩻;


# direct methods
.method public constructor <init>(IILl/ܿ᩵᩻;Ll/᩺ᩴ᩻;Ll/ܰᩴ᩻;Ll/۟ᩴ᩻;Ll/᩶۫᩷;)V
    .locals 1

    .line 1526
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 1480
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/ۜ᩵᩻;->ۤ:Ljava/util/ArrayDeque;

    const/4 v0, 0x1

    .line 1527
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    new-array p1, p1, [B

    iput-object p1, p0, Ll/ۜ᩵᩻;->ۛ:[B

    .line 1529
    iput-object p3, p0, Ll/ۜ᩵᩻;->۟:Ll/ܿ᩵᩻;

    .line 1530
    iput-object p4, p0, Ll/ۜ᩵᩻;->᩸:Ll/᩺ᩴ᩻;

    .line 1531
    iput-object p5, p0, Ll/ۜ᩵᩻;->᩺:Ll/ܰᩴ᩻;

    .line 1532
    iput-object p6, p0, Ll/ۜ᩵᩻;->۬:Ll/۟ᩴ᩻;

    .line 1533
    iput-object p7, p0, Ll/ۜ᩵᩻;->᩶:Ll/᩶۫᩷;

    .line 1535
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Ll/ۜ᩵᩻;->ۗ:I

    return-void
.end method

.method private ֫()V
    .locals 2

    .line 1733
    :goto_0
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۤ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 1734
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩻᩵᩻;

    invoke-static {v0}, Ll/᩻᩵᩻;->ᩳ(Ll/᩻᩵᩻;)Ll/ۘ᩵᩻;

    move-result-object v0

    check-cast v0, Ll/᩶᩵᩻;

    invoke-virtual {v0}, Ll/᩶᩵᩻;->ۧ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static ֫(Ll/᩻᩵᩻;)V
    .locals 6

    .line 1692
    invoke-static {p0}, Ll/᩻᩵᩻;->ᩳ(Ll/᩻᩵᩻;)Ll/ۘ᩵᩻;

    move-result-object v0

    check-cast v0, Ll/᩶᩵᩻;

    invoke-virtual {v0}, Ll/᩶᩵᩻;->֫()J

    move-result-wide v0

    .line 1694
    invoke-static {p0}, Ll/᩻᩵᩻;->ܽ(Ll/᩻᩵᩻;)I

    move-result v2

    int-to-long v3, v2

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    .line 1695
    invoke-static {p0}, Ll/᩻᩵᩻;->ۧ(Ll/᩻᩵᩻;)J

    return-void

    :cond_0
    const-wide/16 v3, 0x0

    cmp-long p0, v0, v3

    if-gtz p0, :cond_1

    .line 791
    new-instance p0, Ljava/io/IOException;

    const-string v0, "SMB write returned no progress"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 793
    :cond_1
    new-instance p0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "SMB write returned partial progress: expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", actual "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ۧ(JI[B)Ll/᩻᩵᩻;
    .locals 7

    .line 1664
    new-instance v6, Ll/᩻᩵᩻;

    .line 1665
    iget-object v0, p0, Ll/ۜ᩵᩻;->۟:Ll/ܿ᩵᩻;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    :try_start_0
    iget-object v0, v0, Ll/ܿ᩵᩻;->ۧ:Ll/᩷᩵᩻;

    invoke-static {v0}, Ll/᩷᩵᩻;->֫(Ll/᩷᩵᩻;)Ll/۟ܽۘ;

    move-result-object v0

    .line 350
    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۟ܽۘ;->ۧ(JI[B)Ll/ۜ۟ۖ;

    move-result-object v1

    .line 351
    new-instance v5, Ll/᩶᩵᩻;

    invoke-direct {v5, v0, v1}, Ll/᩶᩵᩻;-><init>(Ll/۟ܽۘ;Ll/ۜ۟ۖ;)V
    :try_end_0
    .catch Ll/֨ۨۖ; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/ۧۧۘ; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, v6

    move-object v1, p4

    move v2, p3

    move-wide v3, p1

    .line 1665
    invoke-direct/range {v0 .. v5}, Ll/᩻᩵᩻;-><init>([BIJLl/᩶᩵᩻;)V

    return-object v6

    :catch_0
    move-exception p1

    .line 355
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    .line 353
    new-instance p2, Ljava/io/IOException;

    invoke-virtual {p1}, Ll/֨ۨۖ;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private ܳ()V
    .locals 2

    .line 1766
    iget-boolean v0, p0, Ll/ۜ᩵᩻;->᩹:Z

    if-nez v0, :cond_1

    .line 1769
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۙ:Ljava/io/IOException;

    if-nez v0, :cond_0

    return-void

    .line 1770
    :cond_0
    throw v0

    .line 1767
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()V
    .locals 1

    .line 1669
    :goto_0
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۤ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 1670
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ᩳ()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private ᩳ()V
    .locals 8

    .line 1675
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۤ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩻᩵᩻;

    .line 1677
    :try_start_0
    invoke-static {v1}, Ll/ۜ᩵᩻;->֫(Ll/᩻᩵᩻;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v2

    .line 1699
    iget-object v3, p0, Ll/ۜ᩵᩻;->᩶:Ll/᩶۫᩷;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-boolean v3, p0, Ll/ۜ᩵᩻;->ܰ:Z

    if-nez v3, :cond_2

    const/4 v3, 0x1

    .line 1705
    iput-boolean v3, p0, Ll/ۜ᩵᩻;->ܰ:Z

    .line 1706
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1707
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1708
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1709
    invoke-direct {p0}, Ll/ۜ᩵᩻;->֫()V

    .line 1710
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 1715
    :try_start_1
    iget-object v5, p0, Ll/ۜ᩵᩻;->۟:Ll/ܿ᩵᩻;

    invoke-static {v1}, Ll/᩻᩵᩻;->ۧ(Ll/᩻᩵᩻;)J

    move-result-wide v6

    invoke-virtual {v5, v6, v7}, Ll/ܿ᩵᩻;->֫(J)I

    move-result v1

    .line 1717
    iget v5, p0, Ll/ۜ᩵᩻;->ۗ:I

    invoke-static {v5, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    invoke-static {v3, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Ll/ۜ᩵᩻;->ۗ:I

    .line 1718
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/᩻᩵᩻;

    .line 1719
    :goto_1
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->size()I

    move-result v4

    iget v5, p0, Ll/ۜ᩵᩻;->ۗ:I

    if-lt v4, v5, :cond_0

    .line 1720
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ᩳ()V

    goto :goto_1

    .line 1722
    :cond_0
    invoke-static {v3}, Ll/᩻᩵᩻;->֫(Ll/᩻᩵᩻;)[B

    move-result-object v4

    invoke-static {v3}, Ll/᩻᩵᩻;->ܽ(Ll/᩻᩵᩻;)I

    move-result v5

    invoke-static {v3}, Ll/᩻᩵᩻;->ۧ(Ll/᩻᩵᩻;)J

    move-result-wide v6

    invoke-direct {p0, v6, v7, v5, v4}, Ll/ۜ᩵᩻;->ۧ(JI[B)Ll/᩻᩵᩻;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    goto :goto_0

    .line 1724
    :cond_1
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ܽ()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception v0

    .line 1726
    invoke-static {v2, v0}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    iput-object v0, p0, Ll/ۜ᩵᩻;->ۙ:Ljava/io/IOException;

    .line 1727
    invoke-direct {p0}, Ll/ۜ᩵᩻;->֫()V

    .line 1728
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۙ:Ljava/io/IOException;

    throw v0

    .line 1700
    :cond_2
    iput-object v2, p0, Ll/ۜ᩵᩻;->ۙ:Ljava/io/IOException;

    .line 1701
    invoke-static {v1}, Ll/᩻᩵᩻;->ᩳ(Ll/᩻᩵᩻;)Ll/ۘ᩵᩻;

    move-result-object v0

    check-cast v0, Ll/᩶᩵᩻;

    invoke-virtual {v0}, Ll/᩶᩵᩻;->ۧ()V

    .line 1702
    invoke-direct {p0}, Ll/ۜ᩵᩻;->֫()V

    .line 1703
    throw v2
.end method

.method private ᩻()V
    .locals 7

    .line 1638
    iget v0, p0, Ll/ۜ᩵᩻;->ۨ:I

    if-nez v0, :cond_0

    return-void

    .line 1643
    :cond_0
    :try_start_0
    iget-object v1, p0, Ll/ۜ᩵᩻;->ۛ:[B

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v1

    .line 1644
    iget-wide v2, p0, Ll/ۜ᩵᩻;->۫:J

    .line 1657
    iget-object v4, p0, Ll/ۜ᩵᩻;->ۤ:Ljava/util/ArrayDeque;

    :goto_0
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->size()I

    move-result v5

    iget v6, p0, Ll/ۜ᩵᩻;->ۗ:I

    if-lt v5, v6, :cond_1

    .line 1658
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ᩳ()V

    goto :goto_0

    .line 1660
    :cond_1
    invoke-direct {p0, v2, v3, v0, v1}, Ll/ۜ᩵᩻;->ۧ(JI[B)Ll/᩻᩵᩻;

    move-result-object v1

    invoke-virtual {v4, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 1645
    iget-wide v1, p0, Ll/ۜ᩵᩻;->۫:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/ۜ᩵᩻;->۫:J

    const/4 v0, 0x0

    .line 1649
    iput v0, p0, Ll/ۜ᩵᩻;->ۨ:I
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 1651
    iput-object v0, p0, Ll/ۜ᩵᩻;->ۙ:Ljava/io/IOException;

    .line 1652
    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 5

    .line 1586
    iget-boolean v0, p0, Ll/ۜ᩵᩻;->᩹:Z

    if-eqz v0, :cond_0

    goto :goto_6

    .line 1589
    :cond_0
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۙ:Ljava/io/IOException;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    .line 1593
    :try_start_0
    invoke-direct {p0}, Ll/ۜ᩵᩻;->᩻()V

    .line 1594
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ܽ()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    goto :goto_2

    :cond_2
    :goto_1
    const/4 v3, 0x0

    .line 1600
    :goto_2
    :try_start_1
    iget-object v4, p0, Ll/ۜ᩵᩻;->᩸:Ll/᩺ᩴ᩻;

    invoke-virtual {v4}, Ll/᩺ᩴ᩻;->run()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception v4

    .line 1602
    invoke-static {v3, v4}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v3

    :goto_3
    if-nez v0, :cond_3

    if-nez v3, :cond_3

    .line 1604
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۤ:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    :cond_3
    if-eqz v1, :cond_4

    .line 1605
    iget-object v0, p0, Ll/ۜ᩵᩻;->᩺:Ll/ܰᩴ᩻;

    goto :goto_4

    :cond_4
    iget-object v0, p0, Ll/ۜ᩵᩻;->۬:Ll/۟ᩴ᩻;

    :goto_4
    if-nez v1, :cond_5

    .line 1607
    invoke-direct {p0}, Ll/ۜ᩵᩻;->֫()V

    .line 1610
    :cond_5
    :try_start_2
    invoke-interface {v0}, Ll/ۡ᩵᩻;->run()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    .line 1612
    invoke-static {v3, v0}, Ll/ۙ᩵᩻;->֫(Ljava/io/IOException;Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v3

    .line 1614
    :goto_5
    iput-boolean v2, p0, Ll/ۜ᩵᩻;->᩹:Z

    if-nez v3, :cond_6

    :goto_6
    return-void

    .line 1618
    :cond_6
    throw v3
.end method

.method public final finalize()V
    .locals 1

    .line 1628
    :try_start_0
    invoke-virtual {p0}, Ll/ۜ᩵᩻;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1630
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    return-void

    :catchall_0
    move-exception v0

    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 1631
    throw v0
.end method

.method public final flush()V
    .locals 0

    .line 1576
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ܳ()V

    .line 1577
    invoke-direct {p0}, Ll/ۜ᩵᩻;->᩻()V

    .line 1578
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ܽ()V

    return-void
.end method

.method public final write(I)V
    .locals 3

    .line 1543
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ܳ()V

    .line 1544
    iget v0, p0, Ll/ۜ᩵᩻;->ۨ:I

    iget-object v1, p0, Ll/ۜ᩵᩻;->ۛ:[B

    array-length v2, v1

    if-ne v0, v2, :cond_0

    .line 1545
    invoke-direct {p0}, Ll/ۜ᩵᩻;->᩻()V

    .line 1547
    :cond_0
    iget v0, p0, Ll/ۜ᩵᩻;->ۨ:I

    add-int/lit8 v2, v0, 0x1

    iput v2, p0, Ll/ۜ᩵᩻;->ۨ:I

    int-to-byte p1, p1

    aput-byte p1, v1, v0

    return-void
.end method

.method public final write([BII)V
    .locals 3

    .line 1555
    invoke-direct {p0}, Ll/ۜ᩵᩻;->ܳ()V

    .line 1556
    array-length v0, p1

    invoke-static {p2, p3, v0}, Ll/ۧ۫ᩴ;->checkFromIndexSize(III)I

    :cond_0
    :goto_0
    if-lez p3, :cond_1

    .line 1560
    iget-object v0, p0, Ll/ۜ᩵᩻;->ۛ:[B

    array-length v1, v0

    iget v2, p0, Ll/ۜ᩵᩻;->ۨ:I

    sub-int/2addr v1, v2

    invoke-static {p3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 1561
    iget v2, p0, Ll/ۜ᩵᩻;->ۨ:I

    invoke-static {p1, p2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 1562
    iget v2, p0, Ll/ۜ᩵᩻;->ۨ:I

    add-int/2addr v2, v1

    iput v2, p0, Ll/ۜ᩵᩻;->ۨ:I

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    .line 1565
    array-length v0, v0

    if-ne v2, v0, :cond_0

    .line 1566
    invoke-direct {p0}, Ll/ۜ᩵᩻;->᩻()V

    goto :goto_0

    :cond_1
    return-void
.end method
