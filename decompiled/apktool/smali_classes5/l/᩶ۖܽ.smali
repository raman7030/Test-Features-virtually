.class public final Ll/᩶ۖܽ;
.super Ljava/lang/Object;
.source "17JK"

# interfaces
.implements Ll/ۖۖܽ;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public ۙ:I

.field public ۛ:Ljava/io/IOException;

.field public final ۤ:Z

.field public final ۨ:J

.field public ۫:J

.field public final ۬:Ljava/util/Map;

.field public final ᩶:Ll/᩹ۖܽ;

.field public ᩸:Z

.field public final ᩹:Ll/ۙۖᩴ;

.field public ᩺:J


# direct methods
.method public constructor <init>(Ljava/lang/String;ZJ[JLl/᩹ۖܽ;)V
    .locals 5

    .line 67
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    .line 36
    iput-wide v0, p0, Ll/᩶ۖܽ;->۫:J

    .line 41
    iput-wide v0, p0, Ll/᩶ۖܽ;->᩺:J

    const/4 v2, 0x0

    .line 46
    iput-boolean v2, p0, Ll/᩶ۖܽ;->᩸:Z

    .line 49
    new-instance v3, Ll/ۙۖᩴ;

    invoke-direct {v3}, Ll/ۙۖᩴ;-><init>()V

    iput-object v3, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    .line 55
    iput v2, p0, Ll/᩶ۖܽ;->ۙ:I

    if-eqz p1, :cond_7

    if-nez p2, :cond_1

    cmp-long v4, p3, v0

    if-lez v4, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "splitSize must be positive: "

    .line 0
    invoke-static {p3, p4, p2}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 72
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-eqz p6, :cond_6

    .line 77
    iput-object p1, p0, Ll/᩶ۖܽ;->ۗ:Ljava/lang/String;

    .line 78
    iput-boolean p2, p0, Ll/᩶ۖܽ;->ۤ:Z

    if-eqz p2, :cond_2

    const-wide/16 p3, -0x1

    .line 79
    :cond_2
    iput-wide p3, p0, Ll/᩶ۖܽ;->ۨ:J

    .line 80
    iput-object p6, p0, Ll/᩶ۖܽ;->᩶:Ll/᩹ۖܽ;

    if-eqz p5, :cond_5

    .line 83
    array-length p1, p5

    move-wide p2, v0

    :goto_1
    if-ge v2, p1, :cond_4

    aget-wide v3, p5, v2

    cmp-long p4, v3, v0

    if-ltz p4, :cond_3

    add-long/2addr p2, v3

    .line 88
    iget-object p4, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    invoke-virtual {p4, p2, p3}, Ll/ۙۖᩴ;->add(J)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 85
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Negative length: "

    .line 0
    invoke-static {v3, v4, p2}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 90
    :cond_4
    iput-wide p2, p0, Ll/᩶ۖܽ;->᩺:J

    goto :goto_2

    .line 92
    :cond_5
    invoke-virtual {v3, v0, v1}, Ll/ۙۖᩴ;->add(J)Z

    .line 95
    :goto_2
    new-instance p1, Ll/᩸ۖܽ;

    invoke-direct {p1, p0}, Ll/᩸ۖܽ;-><init>(Ll/᩶ۖܽ;)V

    iput-object p1, p0, Ll/᩶ۖܽ;->۬:Ljava/util/Map;

    return-void

    .line 75
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "factory cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_7
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "name cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/lang/String;JLl/᩹ۖܽ;)Ll/᩶ۖܽ;
    .locals 8

    .line 64
    new-instance v7, Ll/᩶ۖܽ;

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, v7

    move-object v1, p0

    move-wide v3, p1

    move-object v6, p3

    invoke-direct/range {v0 .. v6}, Ll/᩶ۖܽ;-><init>(Ljava/lang/String;ZJ[JLl/᩹ۖܽ;)V

    return-object v7
.end method

.method public static ֫(Ljava/lang/String;[JLl/᩹ۖܽ;)Ll/᩶ۖܽ;
    .locals 8

    .line 60
    new-instance v7, Ll/᩶ۖܽ;

    const/4 v2, 0x1

    const-wide/16 v3, -0x1

    move-object v0, v7

    move-object v1, p0

    move-object v5, p1

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ll/᩶ۖܽ;-><init>(Ljava/lang/String;ZJ[JLl/᩹ۖܽ;)V

    return-object v7
.end method

.method public static bridge synthetic ֫(Ll/᩶ۖܽ;Ljava/io/IOException;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩶ۖܽ;->ۛ:Ljava/io/IOException;

    return-void
.end method

.method private ۧ(J)I
    .locals 8

    .line 552
    iget v0, p0, Ll/᩶ۖܽ;->ۙ:I

    .line 586
    iget-object v1, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    invoke-virtual {v1}, Ll/ۙۖᩴ;->size()I

    move-result v2

    if-ltz v0, :cond_1

    if-ge v0, v2, :cond_1

    .line 555
    invoke-virtual {p0, v0}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v3

    .line 556
    invoke-virtual {p0, v0}, Ll/᩶ۖܽ;->֫(I)J

    move-result-wide v5

    cmp-long v7, v3, p1

    if-gtz v7, :cond_0

    cmp-long v3, p1, v5

    if-gez v3, :cond_0

    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    if-ge v0, v2, :cond_1

    .line 563
    invoke-virtual {p0, v0}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v3

    .line 564
    invoke-virtual {p0, v0}, Ll/᩶ۖܽ;->֫(I)J

    move-result-wide v5

    cmp-long v7, v3, p1

    if-gtz v7, :cond_1

    cmp-long v3, p1, v5

    if-gez v3, :cond_1

    .line 566
    iput v0, p0, Ll/᩶ۖܽ;->ۙ:I

    return v0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_3

    .line 574
    invoke-virtual {v1, v0}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v3

    cmp-long v5, p1, v3

    if-gez v5, :cond_2

    .line 575
    iput v0, p0, Ll/᩶ۖܽ;->ۙ:I

    return v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    add-int/lit8 v2, v2, -0x1

    .line 581
    iput v2, p0, Ll/᩶ۖܽ;->ۙ:I

    return v2
.end method

.method private ܽ(I)Ll/ۖۖܽ;
    .locals 3

    .line 620
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Ll/᩶ۖܽ;->۬:Ljava/util/Map;

    move-object v2, v1

    check-cast v2, Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۖۖܽ;

    if-nez v0, :cond_3

    .line 518
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_2

    .line 625
    iget-object v0, p0, Ll/᩶ۖܽ;->᩶:Ll/᩹ۖܽ;

    invoke-interface {v0, p1}, Ll/᩹ۖܽ;->ۧ(I)Ll/ۖۖܽ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 629
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 631
    iget-object p1, p0, Ll/᩶ۖܽ;->ۛ:Ljava/io/IOException;

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    .line 633
    iput-object v0, p0, Ll/᩶ۖܽ;->ۛ:Ljava/io/IOException;

    .line 634
    throw p1

    .line 627
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to create fragment at index: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 627
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 623
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 4

    .line 523
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, 0x1

    .line 526
    iput-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    .line 533
    iget-object v0, p0, Ll/᩶ۖܽ;->۬:Ljava/util/Map;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖۖܽ;

    .line 535
    :try_start_0
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v3

    if-nez v2, :cond_1

    move-object v2, v3

    goto :goto_0

    .line 540
    :cond_1
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 544
    :cond_2
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->clear()V

    if-nez v2, :cond_3

    :goto_1
    return-void

    .line 547
    :cond_3
    throw v2
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 496
    iget-object v0, p0, Ll/᩶ۖܽ;->ۗ:Ljava/lang/String;

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 518
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    return v0
.end method

.method public final length()J
    .locals 2

    .line 323
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_0

    .line 326
    iget-wide v0, p0, Ll/᩶ۖܽ;->᩺:J

    return-wide v0

    .line 324
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final position()J
    .locals 2

    .line 478
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_0

    .line 481
    iget-wide v0, p0, Ll/᩶ۖܽ;->۫:J

    return-wide v0

    .line 479
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([BII)I
    .locals 10

    .line 142
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_c

    if-eqz p1, :cond_b

    if-ltz p2, :cond_a

    if-ltz p3, :cond_a

    add-int v0, p2, p3

    .line 148
    array-length v1, p1

    if-gt v0, v1, :cond_a

    const/4 v0, 0x0

    if-nez p3, :cond_0

    return v0

    .line 154
    :cond_0
    iget-wide v1, p0, Ll/᩶ۖܽ;->۫:J

    iget-wide v3, p0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    goto :goto_2

    :cond_1
    if-gtz v5, :cond_9

    sub-long/2addr v3, v1

    int-to-long v1, p3

    .line 163
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int p3, v1

    .line 169
    iget-wide v1, p0, Ll/᩶ۖܽ;->۫:J

    invoke-direct {p0, v1, v2}, Ll/᩶ۖܽ;->ۧ(J)I

    move-result v1

    .line 586
    iget-object v2, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    invoke-virtual {v2}, Ll/ۙۖᩴ;->size()I

    move-result v2

    :cond_2
    :goto_0
    if-ge v0, p3, :cond_7

    .line 174
    invoke-virtual {p0, v1}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v3

    .line 175
    invoke-virtual {p0, v1}, Ll/᩶ۖܽ;->֫(I)J

    move-result-wide v5

    .line 178
    iget-wide v7, p0, Ll/᩶ۖܽ;->۫:J

    sub-long/2addr v5, v7

    const-wide/16 v7, 0x0

    cmp-long v9, v5, v7

    if-nez v9, :cond_4

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v2, :cond_3

    goto :goto_1

    .line 183
    :cond_3
    iput v1, p0, Ll/᩶ۖܽ;->ۙ:I

    goto :goto_0

    :cond_4
    sub-int v7, p3, v0

    int-to-long v7, v7

    .line 187
    invoke-static {v7, v8, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    .line 190
    invoke-direct {p0, v1}, Ll/᩶ۖܽ;->ܽ(I)Ll/ۖۖܽ;

    move-result-object v5

    .line 192
    iget-wide v7, p0, Ll/᩶ۖܽ;->۫:J

    sub-long/2addr v7, v3

    .line 194
    invoke-interface {v5, v7, v8}, Ll/ۖۖܽ;->seek(J)V

    .line 195
    invoke-interface {v5, p1, p2, v6}, Ll/ۖۖܽ;->read([BII)I

    move-result v3

    if-gtz v3, :cond_5

    goto :goto_1

    :cond_5
    add-int/2addr v0, v3

    add-int/2addr p2, v3

    .line 203
    iget-wide v4, p0, Ll/᩶ۖܽ;->۫:J

    int-to-long v7, v3

    add-long/2addr v4, v7

    iput-wide v4, p0, Ll/᩶ۖܽ;->۫:J

    if-ne v3, v6, :cond_2

    add-int/lit8 v1, v1, 0x1

    if-lt v1, v2, :cond_6

    goto :goto_1

    .line 210
    :cond_6
    iput v1, p0, Ll/᩶ۖܽ;->ۙ:I

    goto :goto_0

    :cond_7
    :goto_1
    if-lez v0, :cond_8

    return v0

    :cond_8
    :goto_2
    const/4 p1, -0x1

    return p1

    .line 158
    :cond_9
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Invalid position: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v0, p0, Ll/᩶ۖܽ;->۫:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " (exceeds length "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Ll/᩶ۖܽ;->᩺:J

    const-string p3, ")"

    .line 0
    invoke-static {p2, v0, v1, p3}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 158
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 149
    :cond_a
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 146
    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "data is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 143
    :cond_c
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final seek(J)V
    .locals 3

    .line 128
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 134
    iget-wide v0, p0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    .line 137
    iput-wide p1, p0, Ll/᩶ۖܽ;->۫:J

    return-void

    .line 135
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Cannot seek beyond total length: "

    const-string v2, " > "

    .line 0
    invoke-static {v1, v2, p1, p2}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 135
    iget-wide v1, p0, Ll/᩶ۖܽ;->᩺:J

    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 132
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Negative position: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 132
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 129
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final setLength(J)V
    .locals 18

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    .line 331
    iget-boolean v3, v0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v3, :cond_e

    .line 334
    iget-boolean v3, v0, Ll/᩶ۖܽ;->ۤ:Z

    if-nez v3, :cond_d

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-ltz v5, :cond_c

    .line 341
    iget-wide v5, v0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v7, v1, v5

    if-nez v7, :cond_0

    goto/16 :goto_6

    .line 346
    :cond_0
    iget-object v8, v0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    if-gez v7, :cond_7

    const/4 v5, 0x0

    .line 586
    :goto_0
    invoke-virtual {v8}, Ll/ۙۖᩴ;->size()I

    move-result v6

    const/4 v7, -0x1

    if-ge v5, v6, :cond_2

    .line 369
    invoke-virtual {v8, v5}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v9

    cmp-long v6, v1, v9

    if-gtz v6, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    const/4 v5, -0x1

    :goto_1
    if-eq v5, v7, :cond_6

    .line 381
    invoke-virtual {v0, v5}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v6

    sub-long v6, v1, v6

    .line 385
    invoke-direct {v0, v5}, Ll/᩶ۖܽ;->ܽ(I)Ll/ۖۖܽ;

    move-result-object v9

    .line 386
    invoke-interface {v9, v6, v7}, Ll/ۖۖܽ;->setLength(J)V

    .line 389
    invoke-virtual {v8, v5, v1, v2}, Ll/ۙۖᩴ;->set(IJ)J

    .line 586
    invoke-virtual {v8}, Ll/ۙۖᩴ;->size()I

    move-result v6

    :goto_2
    add-int/lit8 v6, v6, -0x1

    if-le v6, v5, :cond_5

    .line 395
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 396
    iget-object v9, v0, Ll/᩶ۖܽ;->۬:Ljava/util/Map;

    move-object v10, v9

    check-cast v10, Ljava/util/LinkedHashMap;

    invoke-virtual {v10, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ۖۖܽ;

    if-eqz v10, :cond_3

    .line 398
    invoke-interface {v10, v3, v4}, Ll/ۖۖܽ;->setLength(J)V

    .line 400
    check-cast v9, Ljava/util/HashMap;

    invoke-virtual {v9, v7}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    goto :goto_3

    .line 405
    :cond_3
    :try_start_0
    iget-object v7, v0, Ll/᩶ۖܽ;->᩶:Ll/᩹ۖܽ;

    invoke-interface {v7, v6}, Ll/᩹ۖܽ;->ۧ(I)Ll/ۖۖܽ;

    move-result-object v7

    if-eqz v7, :cond_4

    .line 407
    invoke-interface {v7, v3, v4}, Ll/ۖۖܽ;->setLength(J)V

    .line 408
    invoke-interface {v7}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 417
    :catch_0
    :cond_4
    :goto_3
    invoke-virtual {v8, v6}, Ll/ۙۖᩴ;->ܽ(I)J

    goto :goto_2

    .line 421
    :cond_5
    iget v3, v0, Ll/᩶ۖܽ;->ۙ:I

    if-le v3, v5, :cond_a

    .line 422
    iput v5, v0, Ll/᩶ۖܽ;->ۙ:I

    goto :goto_5

    .line 377
    :cond_6
    new-instance v3, Ljava/lang/IllegalStateException;

    const-string v4, "Cannot find fragment for new length: "

    .line 0
    invoke-static {v1, v2, v4}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 377
    invoke-direct {v3, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_7
    sub-long v5, v1, v5

    .line 586
    invoke-virtual {v8}, Ll/ۙۖᩴ;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    .line 434
    invoke-virtual {v0, v7}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v9

    .line 435
    invoke-virtual {v0, v7}, Ll/᩶ۖܽ;->֫(I)J

    move-result-wide v11

    sub-long v9, v11, v9

    .line 439
    iget-wide v13, v0, Ll/᩶ۖܽ;->ۨ:J

    sub-long v15, v13, v9

    cmp-long v17, v5, v15

    if-gtz v17, :cond_8

    .line 443
    invoke-direct {v0, v7}, Ll/᩶ۖܽ;->ܽ(I)Ll/ۖۖܽ;

    move-result-object v3

    add-long/2addr v9, v5

    .line 444
    invoke-interface {v3, v9, v10}, Ll/ۖۖܽ;->setLength(J)V

    .line 445
    invoke-virtual {v8, v7, v1, v2}, Ll/ۙۖᩴ;->set(IJ)J

    goto :goto_5

    :cond_8
    cmp-long v9, v15, v3

    if-lez v9, :cond_9

    .line 452
    invoke-direct {v0, v7}, Ll/᩶ۖܽ;->ܽ(I)Ll/ۖۖܽ;

    move-result-object v9

    .line 453
    invoke-interface {v9, v13, v14}, Ll/ۖۖܽ;->setLength(J)V

    add-long/2addr v11, v15

    .line 454
    invoke-virtual {v8, v7, v11, v12}, Ll/ۙۖᩴ;->set(IJ)J

    sub-long/2addr v5, v15

    :cond_9
    :goto_4
    cmp-long v7, v5, v3

    if-lez v7, :cond_a

    .line 586
    invoke-virtual {v8}, Ll/ۙۖᩴ;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    .line 460
    invoke-virtual {v8, v7}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v9

    .line 461
    invoke-static {v5, v6, v13, v14}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    add-long/2addr v9, v11

    .line 464
    invoke-virtual {v8, v9, v10}, Ll/ۙۖᩴ;->add(J)Z

    .line 586
    invoke-virtual {v8}, Ll/ۙۖᩴ;->size()I

    move-result v7

    add-int/lit8 v7, v7, -0x1

    .line 468
    invoke-direct {v0, v7}, Ll/᩶ۖܽ;->ܽ(I)Ll/ۖۖܽ;

    move-result-object v7

    .line 469
    invoke-interface {v7, v11, v12}, Ll/ۖۖܽ;->setLength(J)V

    sub-long/2addr v5, v11

    goto :goto_4

    .line 354
    :cond_a
    :goto_5
    iput-wide v1, v0, Ll/᩶ۖܽ;->᩺:J

    .line 357
    iget-wide v3, v0, Ll/᩶ۖܽ;->۫:J

    cmp-long v5, v3, v1

    if-lez v5, :cond_b

    .line 358
    iput-wide v1, v0, Ll/᩶ۖܽ;->۫:J

    :cond_b
    :goto_6
    return-void

    .line 338
    :cond_c
    new-instance v3, Ljava/io/IOException;

    const-string v4, "Negative length: "

    .line 0
    invoke-static {v1, v2, v4}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 338
    invoke-direct {v3, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 335
    :cond_d
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Read only"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 332
    :cond_e
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Closed"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final write([BII)V
    .locals 9

    .line 220
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_d

    .line 223
    iget-boolean v0, p0, Ll/᩶ۖܽ;->ۤ:Z

    if-nez v0, :cond_c

    if-eqz p1, :cond_b

    if-ltz p2, :cond_a

    if-ltz p3, :cond_a

    add-int v0, p2, p3

    .line 229
    array-length v1, p1

    if-gt v0, v1, :cond_a

    if-nez p3, :cond_0

    goto/16 :goto_4

    .line 236
    :cond_0
    iget-wide v0, p0, Ll/᩶ۖܽ;->۫:J

    invoke-direct {p0, v0, v1}, Ll/᩶ۖܽ;->ۧ(J)I

    move-result v0

    .line 238
    :goto_0
    invoke-virtual {p0, v0}, Ll/᩶ۖܽ;->ۧ(I)J

    move-result-wide v1

    .line 239
    invoke-virtual {p0, v0}, Ll/᩶ۖܽ;->֫(I)J

    move-result-wide v3

    .line 240
    iget-wide v5, p0, Ll/᩶ۖܽ;->۫:J

    sub-long/2addr v5, v1

    sub-long/2addr v3, v1

    .line 586
    iget-object v1, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    invoke-virtual {v1}, Ll/ۙۖᩴ;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_1

    .line 245
    iget-wide v7, p0, Ll/᩶ۖܽ;->ۨ:J

    cmp-long v2, v3, v7

    if-gez v2, :cond_1

    move-wide v3, v7

    :cond_1
    int-to-long v7, p3

    sub-long/2addr v3, v5

    .line 250
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    if-gtz v3, :cond_4

    add-int/lit8 v0, v0, 0x1

    .line 586
    invoke-virtual {v1}, Ll/ۙۖᩴ;->size()I

    move-result v2

    if-ne v0, v2, :cond_3

    .line 254
    iget-wide v2, p0, Ll/᩶ۖܽ;->۫:J

    iget-wide v4, p0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_2

    .line 257
    invoke-virtual {v1, v2, v3}, Ll/ۙۖᩴ;->add(J)Z

    goto :goto_1

    .line 255
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 259
    :cond_3
    :goto_1
    iput v0, p0, Ll/᩶ۖܽ;->ۙ:I

    goto :goto_0

    .line 263
    :cond_4
    invoke-direct {p0, v0}, Ll/᩶ۖܽ;->ܽ(I)Ll/ۖۖܽ;

    move-result-object v2

    .line 264
    invoke-interface {v2, v5, v6}, Ll/ۖۖܽ;->seek(J)V

    .line 265
    invoke-interface {v2, p1, p2, v3}, Ll/ۖۖܽ;->write([BII)V

    .line 268
    iget-wide v4, p0, Ll/᩶ۖܽ;->۫:J

    int-to-long v6, v3

    add-long/2addr v4, v6

    iput-wide v4, p0, Ll/᩶ۖܽ;->۫:J

    add-int/2addr p2, v3

    sub-int/2addr p3, v3

    .line 273
    iget-wide v2, p0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v6, v4, v2

    if-lez v6, :cond_6

    .line 274
    iput-wide v4, p0, Ll/᩶ۖܽ;->᩺:J

    .line 586
    invoke-virtual {v1}, Ll/ۙۖᩴ;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ne v0, v2, :cond_5

    .line 276
    iget-wide v2, p0, Ll/᩶ۖܽ;->۫:J

    invoke-virtual {v1, v0, v2, v3}, Ll/ۙۖᩴ;->set(IJ)J

    goto :goto_2

    .line 278
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "???"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_2
    if-lez p3, :cond_9

    add-int/lit8 v0, v0, 0x1

    .line 586
    invoke-virtual {v1}, Ll/ۙۖᩴ;->size()I

    move-result v2

    if-ne v0, v2, :cond_8

    .line 285
    iget-wide v2, p0, Ll/᩶ۖܽ;->۫:J

    iget-wide v4, p0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_7

    .line 288
    invoke-virtual {v1, v2, v3}, Ll/ۙۖᩴ;->add(J)Z

    goto :goto_3

    .line 286
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 290
    :cond_8
    :goto_3
    iput v0, p0, Ll/᩶ۖܽ;->ۙ:I

    goto/16 :goto_0

    :cond_9
    :goto_4
    return-void

    .line 230
    :cond_a
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1

    .line 227
    :cond_b
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "data is null"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 224
    :cond_c
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Read only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 221
    :cond_d
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(I)J
    .locals 4

    .line 600
    iget-object v0, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    if-ltz p1, :cond_0

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 603
    invoke-virtual {v0, p1}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v0

    return-wide v0

    .line 601
    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Fragment index out of bounds: index = "

    const-string v3, ", size = "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v0

    .line 601
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫()V
    .locals 6

    .line 303
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_4

    .line 307
    iget-wide v0, p0, Ll/᩶ۖܽ;->۫:J

    iget-wide v2, p0, Ll/᩶ۖܽ;->᩺:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    .line 586
    iget-object v0, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v1

    add-int/lit8 v2, v1, -0x1

    if-ltz v2, :cond_2

    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    if-nez v2, :cond_0

    const/4 v1, 0x0

    .line 611
    invoke-virtual {v0, v1}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v1

    goto :goto_0

    .line 613
    :cond_0
    invoke-virtual {v0, v2}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v2

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v4

    sub-long v1, v2, v4

    :goto_0
    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    return-void

    .line 317
    :cond_1
    iget-wide v1, p0, Ll/᩶ۖܽ;->۫:J

    invoke-virtual {v0, v1, v2}, Ll/ۙۖᩴ;->add(J)Z

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    .line 318
    iput v0, p0, Ll/᩶ۖܽ;->ۙ:I

    return-void

    .line 608
    :cond_2
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v3, "Fragment index out of bounds: index = "

    const-string v4, ", size = "

    .line 0
    invoke-static {v2, v3, v4}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v0

    .line 608
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 308
    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Can only break at the end: pos="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/᩶ۖܽ;->۫:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", totalLength="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/᩶ۖܽ;->᩺:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 304
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(ILl/ۖۖܽ;)V
    .locals 3

    .line 112
    iget-object v0, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    if-ltz p1, :cond_2

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v1

    if-ge p1, v1, :cond_2

    .line 115
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    .line 116
    iget-object v0, p0, Ll/᩶ۖܽ;->۬:Ljava/util/Map;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 119
    invoke-interface {p2}, Ll/ۖۖܽ;->isClosed()Z

    move-result v1

    if-nez v1, :cond_0

    .line 122
    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 120
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Data is closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 117
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    .line 113
    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index = "

    const-string v2, ", size = "

    .line 0
    invoke-static {p1, v1, v2}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v0

    .line 113
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 8

    .line 506
    iget-boolean v0, p0, Ll/᩶ۖܽ;->ۤ:Z

    if-eqz v0, :cond_0

    .line 509
    new-instance v0, Ll/᩶ۖܽ;

    const/4 v6, 0x0

    iget-object v7, p0, Ll/᩶ۖܽ;->᩶:Ll/᩹ۖܽ;

    iget-object v2, p0, Ll/᩶ۖܽ;->ۗ:Ljava/lang/String;

    const/4 v3, 0x1

    const-wide/16 v4, -0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Ll/᩶ۖܽ;-><init>(Ljava/lang/String;ZJ[JLl/᩹ۖܽ;)V

    .line 510
    iget-object v1, v0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    invoke-virtual {v1}, Ll/ۙۖᩴ;->clear()V

    .line 511
    iget-object v2, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    .line 485
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    invoke-interface {v1, v3, v2}, Ll/ۖۘᩴ;->֫(ILl/ۖۘᩴ;)Z

    .line 512
    iget-wide v1, p0, Ll/᩶ۖܽ;->᩺:J

    iput-wide v1, v0, Ll/᩶ۖܽ;->᩺:J

    return-object v0

    .line 507
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(I)J
    .locals 4

    .line 590
    iget-object v0, p0, Ll/᩶ۖܽ;->᩹:Ll/ۙۖᩴ;

    if-ltz p1, :cond_1

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    .line 596
    invoke-virtual {v0, p1}, Ll/ۙۖᩴ;->getLong(I)J

    move-result-wide v0

    return-wide v0

    .line 591
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "Fragment index out of bounds: index = "

    const-string v3, ", size = "

    .line 0
    invoke-static {p1, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 586
    invoke-virtual {v0}, Ll/ۙۖᩴ;->size()I

    move-result v0

    .line 591
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ۧ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 47
    new-instance v6, Ll/᩷ۖܽ;

    invoke-virtual {p0}, Ll/᩶ۖܽ;->ۡ()Ll/ۖۖܽ;

    move-result-object v1

    move-object v0, v6

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final ܺ()V
    .locals 2

    .line 486
    iget-boolean v0, p0, Ll/᩶ۖܽ;->᩸:Z

    if-nez v0, :cond_1

    .line 489
    iget-object v0, p0, Ll/᩶ۖܽ;->۬:Ljava/util/Map;

    check-cast v0, Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۖۖܽ;

    .line 490
    invoke-interface {v1}, Ll/ۖۖܽ;->ܺ()V

    goto :goto_0

    :cond_0
    return-void

    .line 487
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ܽ(JJ)Ll/ۖۖܽ;
    .locals 7

    .line 51
    new-instance v6, Ll/᩷ۖܽ;

    move-object v0, v6

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Ll/᩷ۖܽ;-><init>(Ll/ۖۖܽ;JJ)V

    return-object v6
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
