.class public final Ll/ۛۧܳ;
.super Ljava/lang/Object;
.source "D70T"

# interfaces
.implements Ll/ᩴܽܳ;
.implements Ll/ۜᩳܳ;
.implements Ll/᩻ᩳܳ;


# instance fields
.field public final ֫֫:J

.field public final ۗ:J

.field public final ۙ:I

.field public final ۛ:J

.field public final ۟:[B

.field public final ۤ:I

.field public final ۨ:J

.field public final ۫:J

.field public final ۬:Ll/۬ۧܳ;

.field public final ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final ᩶:Ll/ۡᩳܳ;

.field public final ᩸:I

.field public final ᩹:[Ll/ᩴܽܳ;

.field public final ᩺:I


# direct methods
.method public constructor <init>(Ll/ۡᩳܳ;III[BLl/۬ۧܳ;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    .line 5635
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 5630
    new-instance v7, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v7, v0, Ll/ۛۧܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    if-ltz v2, :cond_3

    if-lez v3, :cond_3

    if-lez v4, :cond_3

    .line 5637
    invoke-virtual/range {p6 .. p6}, Ll/۬ۧܳ;->ۧ()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmp-long v11, v7, v9

    if-lez v11, :cond_3

    invoke-virtual {v6, v4}, Ll/۬ۧܳ;->֫(I)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 5640
    invoke-virtual/range {p6 .. p6}, Ll/۬ۧܳ;->ۧ()J

    move-result-wide v7

    const-wide/16 v9, 0x1

    sub-long/2addr v7, v9

    invoke-virtual {v6, v7, v8}, Ll/۬ۧܳ;->ۧ(J)I

    move-result v7

    int-to-long v7, v7

    int-to-long v9, v4

    add-long/2addr v7, v9

    int-to-long v11, v2

    .line 5641
    invoke-virtual/range {p6 .. p6}, Ll/۬ۧܳ;->ۧ()J

    move-result-wide v13

    array-length v15, v5

    int-to-long v5, v15

    sub-long/2addr v5, v9

    mul-long v5, v5, v13

    add-long/2addr v5, v11

    cmp-long v13, v7, v11

    if-gtz v13, :cond_2

    int-to-long v7, v3

    cmp-long v11, v5, v7

    if-nez v11, :cond_2

    .line 5646
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 5647
    invoke-static {v1, v5}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;Ljava/util/ArrayList;)V

    .line 5649
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x1

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۛۧܳ;

    .line 5650
    iget v7, v7, Ll/ۛۧܳ;->ۙ:I

    add-int/lit8 v7, v7, 0x1

    invoke-static {v6, v7}, Ljava/lang/Math;->max(II)I

    move-result v6

    goto :goto_0

    :cond_0
    const/16 v5, 0x100

    if-gt v6, v5, :cond_1

    .line 5655
    iput-object v1, v0, Ll/ۛۧܳ;->᩶:Ll/ۡᩳܳ;

    .line 5656
    iput v2, v0, Ll/ۛۧܳ;->᩸:I

    .line 5657
    iput v3, v0, Ll/ۛۧܳ;->ۤ:I

    .line 5658
    iput v4, v0, Ll/ۛۧܳ;->᩺:I

    move-object/from16 v2, p5

    .line 5659
    iput-object v2, v0, Ll/ۛۧܳ;->۟:[B

    move-object/from16 v3, p6

    .line 5660
    iput-object v3, v0, Ll/ۛۧܳ;->۬:Ll/۬ۧܳ;

    .line 5661
    array-length v4, v2

    int-to-long v4, v4

    sub-long/2addr v4, v9

    iput-wide v4, v0, Ll/ۛۧܳ;->ۗ:J

    .line 5662
    iput v6, v0, Ll/ۛۧܳ;->ۙ:I

    .line 5663
    array-length v2, v2

    int-to-long v4, v2

    .line 5664
    invoke-virtual/range {p6 .. p6}, Ll/۬ۧܳ;->֫()J

    move-result-wide v2

    const-wide/16 v6, 0x58

    invoke-static {v2, v3, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    .line 5663
    invoke-static {v4, v5, v2, v3}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۛۧܳ;->ۨ:J

    .line 5667
    invoke-static/range {p1 .. p1}, Ll/ᩳܽܳ;->֫(Ll/ۡᩳܳ;)J

    move-result-wide v4

    .line 5668
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v6

    .line 5669
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v8

    .line 5670
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v10

    .line 5669
    invoke-static {v8, v9, v10, v11}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v8

    .line 5668
    invoke-static {v6, v7, v8, v9}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v6

    .line 5667
    invoke-static {v4, v5, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v4

    .line 5666
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v4

    iput-wide v4, v0, Ll/ۛۧܳ;->۫:J

    .line 5672
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->ܳ(Ll/ۡᩳܳ;)J

    move-result-wide v4

    .line 5673
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->ۖ(Ll/ۡᩳܳ;)J

    move-result-wide v6

    .line 5674
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->᩻(Ll/ۡᩳܳ;)J

    move-result-wide v8

    .line 5673
    invoke-static {v6, v7, v8, v9}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v6

    .line 5672
    invoke-static {v4, v5, v6, v7}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v4

    .line 5671
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۛۧܳ;->ۛ:J

    .line 5677
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->ܺ(Ll/ۡᩳܳ;)Ll/ۘᩳܳ;

    move-result-object v4

    .line 5679
    invoke-virtual {v4}, Ll/ۘᩳܳ;->ܽ()J

    move-result-wide v4

    .line 5678
    invoke-static {v2, v3, v4, v5}, Ll/ᩳܽܳ;->֫(JJ)J

    move-result-wide v2

    iput-wide v2, v0, Ll/ۛۧܳ;->֫֫:J

    .line 5680
    invoke-static/range {p1 .. p1}, Ll/᩵ᩳܳ;->ۢ(Ll/ۡᩳܳ;)[Ll/ᩴܽܳ;

    move-result-object v1

    iput-object v1, v0, Ll/ۛۧܳ;->᩹:[Ll/ᩴܽܳ;

    return-void

    .line 5653
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Replacement recipe dependency is too deep"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5644
    :cond_2
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid replacement recipe mapping"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 5638
    :cond_3
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid replacement recipe"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static bridge synthetic ֫(Ll/ۛۧܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۧܳ;->᩸:I

    return p0
.end method

.method public static bridge synthetic ۜ(Ll/ۛۧܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۧܳ;->᩺:I

    return p0
.end method

.method public static bridge synthetic ۢ(Ll/ۛۧܳ;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->۟:[B

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ۛۧܳ;)[Ll/ᩴܽܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->᩹:[Ll/ᩴܽܳ;

    return-object p0
.end method

.method public static bridge synthetic ܳ(Ll/ۛۧܳ;)I
    .locals 0

    .line 0
    iget p0, p0, Ll/ۛۧܳ;->ۤ:I

    return p0
.end method

.method public static bridge synthetic ܽ(Ll/ۛۧܳ;)Ll/ۡᩳܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->᩶:Ll/ۡᩳܳ;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ۛۧܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛۧܳ;->۫:J

    return-wide v0
.end method

.method public static bridge synthetic ᩳ(Ll/ۛۧܳ;)Ll/۬ۧܳ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->۬:Ll/۬ۧܳ;

    return-object p0
.end method

.method public static bridge synthetic ᩷(Ll/ۛۧܳ;)Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ۛۧܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object p0
.end method

.method public static bridge synthetic ᩻(Ll/ۛۧܳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۛۧܳ;->ۨ:J

    return-wide v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 5783
    iget-object v0, p0, Ll/ۛۧܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-ltz v1, :cond_1

    if-nez v1, :cond_0

    .line 5789
    iget-object v0, p0, Ll/ۛۧܳ;->᩹:[Ll/ᩴܽܳ;

    invoke-static {v0}, Ll/ܺܽܳ;->֫([Ll/ᩴܽܳ;)V

    :cond_0
    return-void

    .line 5785
    :cond_1
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 5786
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Replacement recipe closed twice"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final length()I
    .locals 1

    .line 5694
    iget v0, p0, Ll/ۛۧܳ;->ۤ:I

    return v0
.end method

.method public final ֫()Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method public final ֫(I[BII)V
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    .line 5824
    iget-object v4, v0, Ll/ۛۧܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v4}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    const-string v6, "Replacement recipe is closed"

    if-lez v5, :cond_c

    .line 5701
    iget v5, v0, Ll/ۛۧܳ;->ۤ:I

    invoke-static {v5, v1, v3}, Ll/ۡܽܳ;->ܽ(III)V

    .line 5702
    array-length v5, v2

    move/from16 v7, p3

    invoke-static {v5, v7, v3}, Ll/ۡܽܳ;->ۧ(III)V

    .line 5808
    iget-object v5, v0, Ll/ۛۧܳ;->۬:Ll/۬ۧܳ;

    invoke-virtual {v5}, Ll/۬ۧܳ;->ۧ()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    .line 5809
    :goto_0
    iget-object v12, v0, Ll/ۛۧܳ;->۟:[B

    iget-wide v13, v0, Ll/ۛۧܳ;->ۗ:J

    cmp-long v17, v10, v8

    if-gez v17, :cond_1

    add-long v17, v10, v8

    const/16 v19, 0x1

    move-wide/from16 v20, v8

    ushr-long v7, v17, v19

    .line 5811
    invoke-virtual {v5, v7, v8}, Ll/۬ۧܳ;->ۧ(J)I

    move-result v9

    move-object/from16 v17, v4

    int-to-long v3, v9

    mul-long v13, v13, v7

    add-long/2addr v13, v3

    array-length v3, v12

    int-to-long v3, v3

    add-long/2addr v13, v3

    int-to-long v3, v1

    cmp-long v9, v13, v3

    if-gtz v9, :cond_0

    const-wide/16 v3, 0x1

    add-long/2addr v7, v3

    move-wide v10, v7

    move-wide/from16 v8, v20

    goto :goto_1

    :cond_0
    move-wide v8, v7

    :goto_1
    move/from16 v7, p3

    move/from16 v3, p4

    move-object/from16 v4, v17

    goto :goto_0

    :cond_1
    move-object/from16 v17, v4

    .line 5706
    invoke-virtual {v5}, Ll/۬ۧܳ;->ۧ()J

    move-result-wide v3

    cmp-long v7, v10, v3

    if-gez v7, :cond_2

    .line 5707
    invoke-virtual {v5, v10, v11}, Ll/۬ۧܳ;->֫(J)Ll/ۗۧܳ;

    move-result-object v3

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    move/from16 v4, p3

    move/from16 v5, p4

    :goto_3
    if-lez v5, :cond_a

    .line 5709
    iget-object v7, v0, Ll/ۛۧܳ;->᩶:Ll/ۡᩳܳ;

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Ll/ۗۧܳ;->ۧ()Z

    move-result v8

    if-eqz v8, :cond_8

    .line 5710
    invoke-virtual {v3}, Ll/ۗۧܳ;->ܽ()I

    move-result v8

    int-to-long v8, v8

    mul-long v18, v10, v13

    add-long v8, v8, v18

    .line 5712
    array-length v15, v12

    move-wide/from16 v22, v13

    int-to-long v13, v15

    add-long/2addr v13, v8

    move-object/from16 v24, v6

    move-object/from16 p1, v7

    int-to-long v6, v1

    cmp-long v15, v6, v13

    if-ltz v15, :cond_3

    const-wide/16 v15, 0x1

    add-long/2addr v10, v15

    .line 5715
    invoke-virtual {v3}, Ll/ۗۧܳ;->֫()V

    const-wide/16 v13, 0x1

    goto :goto_4

    :cond_3
    cmp-long v20, v6, v8

    if-ltz v20, :cond_5

    sub-long/2addr v6, v8

    long-to-int v7, v6

    .line 5720
    array-length v6, v12

    sub-int/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 5722
    invoke-static {v12, v7, v2, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v1, v6

    add-int/2addr v4, v6

    sub-int/2addr v5, v6

    int-to-long v6, v1

    cmp-long v8, v6, v13

    const-wide/16 v13, 0x1

    if-nez v8, :cond_4

    add-long/2addr v10, v13

    .line 5729
    invoke-virtual {v3}, Ll/ۗۧܳ;->֫()V

    :cond_4
    :goto_4
    move-wide/from16 v13, v22

    move-object/from16 v6, v24

    goto :goto_3

    :cond_5
    int-to-long v13, v5

    sub-long/2addr v8, v6

    .line 5733
    invoke-static {v13, v14, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    long-to-int v9, v8

    if-lez v9, :cond_7

    sub-long v6, v6, v18

    long-to-int v8, v6

    int-to-long v13, v8

    cmp-long v18, v6, v13

    if-nez v18, :cond_6

    move-object/from16 v6, p1

    .line 5738
    invoke-static {v8, v4, v9, v6, v2}, Ll/᩵ᩳܳ;->ۧ(IIILl/ۡᩳܳ;[B)V

    add-int/2addr v1, v9

    add-int/2addr v4, v9

    sub-int/2addr v5, v9

    goto :goto_4

    .line 0
    :cond_6
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    .line 5735
    :cond_7
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Invalid replacement recipe mapping"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_8
    move-object/from16 v24, v6

    move-object v6, v7

    move-wide/from16 v22, v13

    int-to-long v7, v1

    mul-long v10, v10, v22

    sub-long/2addr v7, v10

    long-to-int v1, v7

    int-to-long v9, v1

    cmp-long v3, v7, v9

    if-nez v3, :cond_9

    .line 5746
    invoke-static {v1, v4, v5, v6, v2}, Ll/᩵ᩳܳ;->ۧ(IIILl/ۡᩳܳ;[B)V

    goto :goto_5

    .line 0
    :cond_9
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1}, Ljava/lang/ArithmeticException;-><init>()V

    throw v1

    :cond_a
    move-object/from16 v24, v6

    .line 5824
    :goto_5
    invoke-virtual/range {v17 .. v17}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_b

    return-void

    .line 5825
    :cond_b
    new-instance v1, Ljava/io/IOException;

    move-object/from16 v2, v24

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    move-object v2, v6

    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final ֫(Ljava/util/ArrayDeque;)V
    .locals 4

    .line 5686
    iget-object v0, p0, Ll/ۛۧܳ;->᩹:[Ll/ᩴܽܳ;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    .line 5687
    invoke-virtual {p1, v3}, Ljava/util/ArrayDeque;->push(Ljava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۫()Z
    .locals 5

    .line 5755
    iget-object v0, p0, Ll/ۛۧܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    const/4 v1, 0x0

    if-gtz v0, :cond_0

    return v1

    .line 5758
    :cond_0
    iget-object v0, p0, Ll/ۛۧܳ;->᩹:[Ll/ᩴܽܳ;

    array-length v2, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, v0, v3

    .line 5759
    invoke-interface {v4}, Ll/ᩴܽܳ;->۫()Z

    move-result v4

    if-nez v4, :cond_1

    return v1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    return v0
.end method

.method public final ܽ()J
    .locals 2

    .line 1305
    invoke-virtual {p0}, Ll/ۛۧܳ;->ܿ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ܿ()J
    .locals 2

    .line 5796
    iget-wide v0, p0, Ll/ۛۧܳ;->֫֫:J

    return-wide v0
.end method

.method public final ᩳ()J
    .locals 2

    .line 5802
    iget-wide v0, p0, Ll/ۛۧܳ;->ۛ:J

    return-wide v0
.end method

.method public final ᩺ۧ()Ll/ᩴܽܳ;
    .locals 8

    .line 5770
    :cond_0
    iget-object v0, p0, Ll/ۛۧܳ;->ܰ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    if-lez v1, :cond_2

    int-to-long v2, v1

    const/4 v4, 0x1

    int-to-long v4, v4

    add-long/2addr v2, v4

    long-to-int v4, v2

    int-to-long v5, v4

    cmp-long v7, v2, v5

    if-nez v7, :cond_1

    .line 5774
    invoke-virtual {v0, v1, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    .line 0
    :cond_1
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 5772
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Replacement recipe is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
