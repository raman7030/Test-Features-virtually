.class public final Ll/ᩴ֨᩻;
.super Ljava/lang/Object;
.source "M9Q4"

# interfaces
.implements Ll/֡֨᩻;


# static fields
.field public static final ۬:[B


# instance fields
.field public final ۗ:Ll/۠ۖܽ;

.field public ۙ:Ljava/util/HashMap;

.field public final ᩶:Ljava/util/ArrayList;

.field public final ᩸:J

.field public final ᩹:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/high16 v0, 0x80000

    new-array v0, v0, [B

    .line 49
    sput-object v0, Ll/ᩴ֨᩻;->۬:[B

    return-void
.end method

.method public constructor <init>(Ll/۠ۖܽ;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 73
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 51
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Ll/ᩴ֨᩻;->᩶:Ljava/util/ArrayList;

    .line 74
    iput-object v1, v0, Ll/ᩴ֨᩻;->ۗ:Ll/۠ۖܽ;

    .line 75
    invoke-interface/range {p1 .. p1}, Ll/۠ۖܽ;->readInt()I

    move-result v2

    const v3, 0x55417243

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_d

    .line 79
    invoke-interface/range {p1 .. p1}, Ll/۠ۖܽ;->readLong()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide v2

    const-wide/16 v6, 0x2

    cmp-long v8, v2, v6

    if-nez v8, :cond_c

    .line 83
    invoke-interface/range {p1 .. p1}, Ll/۠ۖܽ;->readLong()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide v2

    const-wide/16 v6, 0x0

    cmp-long v8, v2, v6

    if-lez v8, :cond_b

    const-wide/32 v8, 0x7fffffff

    cmp-long v10, v2, v8

    if-gtz v10, :cond_b

    .line 87
    invoke-interface/range {p1 .. p1}, Ll/۠ۖܽ;->readInt()I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result v8

    if-lez v8, :cond_a

    long-to-int v9, v2

    .line 91
    new-array v9, v9, [B

    .line 92
    invoke-interface {v1, v9}, Ll/۠ۖܽ;->readFully([B)V

    .line 93
    invoke-static {v9}, Ll/ۖ۠᩻;->parseFrom([B)Ll/ۖ۠᩻;

    move-result-object v1

    const-wide/16 v9, 0x18

    add-long/2addr v2, v9

    int-to-long v8, v8

    add-long/2addr v2, v8

    .line 94
    iput-wide v2, v0, Ll/ᩴ֨᩻;->᩸:J

    .line 95
    invoke-virtual {v1}, Ll/ۖ۠᩻;->getBlockSize()I

    move-result v2

    iput v2, v0, Ll/ᩴ֨᩻;->᩹:I

    .line 96
    invoke-virtual {v1}, Ll/ۖ۠᩻;->getPartitionsList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۡܶ᩻;

    .line 97
    invoke-virtual {v8}, Ll/ۡܶ᩻;->hasPartitionName()Z

    move-result v9

    if-eqz v9, :cond_6

    .line 110
    invoke-virtual {v8}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v9

    move-wide v10, v6

    :cond_0
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ll/֫ܶ᩻;

    .line 111
    sget-object v13, Ll/᩷֨᩻;->֫:[I

    invoke-virtual {v12}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v13, v13, v14

    if-eq v13, v5, :cond_3

    const/4 v14, 0x2

    if-eq v13, v14, :cond_3

    const/4 v14, 0x3

    if-eq v13, v14, :cond_3

    const/4 v14, 0x4

    if-eq v13, v14, :cond_3

    const/4 v14, 0x5

    if-eq v13, v14, :cond_1

    goto :goto_3

    .line 123
    :cond_1
    invoke-virtual {v12}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ll/۫۠᩻;

    .line 124
    invoke-virtual {v13}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v14

    cmp-long v16, v14, v10

    if-eqz v16, :cond_2

    goto :goto_3

    .line 127
    :cond_2
    invoke-virtual {v13}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v13

    add-long/2addr v10, v13

    goto :goto_2

    .line 116
    :cond_3
    invoke-virtual {v12}, Ll/֫ܶ᩻;->getDstExtentsCount()I

    move-result v13

    if-ne v13, v5, :cond_6

    .line 117
    invoke-virtual {v12, v4}, Ll/֫ܶ᩻;->getDstExtents(I)Ll/۫۠᩻;

    move-result-object v13

    invoke-virtual {v13}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v13

    cmp-long v15, v13, v10

    if-eqz v15, :cond_4

    goto :goto_3

    .line 120
    :cond_4
    invoke-virtual {v12, v4}, Ll/֫ܶ᩻;->getDstExtents(I)Ll/۫۠᩻;

    move-result-object v12

    invoke-virtual {v12}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v12

    add-long/2addr v10, v12

    goto :goto_1

    .line 98
    :cond_5
    iget-object v9, v0, Ll/ᩴ֨᩻;->᩶:Ljava/util/ArrayList;

    new-instance v10, Ll/ܰۚ᩻;

    int-to-long v11, v2

    invoke-direct {v10, v8, v11, v12}, Ll/ܰۚ᩻;-><init>(Ll/ۡܶ᩻;J)V

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 100
    :cond_6
    :goto_3
    sget-object v9, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "check failed: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ll/ۡܶ᩻;->getPartitionName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v9, v8}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 103
    :cond_7
    iget-object v2, v0, Ll/ᩴ֨᩻;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v1}, Ll/ۖ۠᩻;->getPartitionsCount()I

    move-result v1

    if-gtz v1, :cond_8

    goto :goto_4

    .line 104
    :cond_8
    new-instance v1, Ljava/io/IOException;

    const v2, 0x7f120710

    invoke-static {v2}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    :goto_4
    return-void

    .line 89
    :cond_a
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Incorrect metadata signature length: "

    .line 0
    invoke-static {v8, v2}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 89
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 85
    :cond_b
    new-instance v1, Ljava/io/IOException;

    const-string v4, "Incorrect manifest length: "

    .line 0
    invoke-static {v2, v3, v4}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 85
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 81
    :cond_c
    new-instance v1, Ljava/io/IOException;

    const-string v4, "Unsupported payload version: "

    .line 0
    invoke-static {v2, v3, v4}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 81
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 77
    :cond_d
    new-instance v1, Ljava/io/IOException;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-array v3, v5, [Ljava/lang/Object;

    aput-object v2, v3, v4

    const-string v2, "Incorrect magic: %08x"

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static bridge synthetic ֫(Ll/ᩴ֨᩻;)Ll/۠ۖܽ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ᩴ֨᩻;->ۗ:Ll/۠ۖܽ;

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/io/OutputStream;Ll/ۡ֨᩻;[BJ)V
    .locals 8

    const-wide/16 v0, 0x0

    move-wide v1, v0

    .line 709
    :cond_0
    invoke-virtual {p0, p3}, Ljava/io/InputStream;->read([B)I

    move-result v3

    const/4 v0, -0x1

    if-eq v3, v0, :cond_2

    int-to-long v4, v3

    sub-long v6, p4, v1

    cmp-long v0, v4, v6

    if-gtz v0, :cond_1

    move-object v0, p2

    .line 714
    monitor-enter v0

    .line 715
    :try_start_0
    invoke-interface {p2, v3}, Ll/ۡ֨᩻;->֫(I)V

    .line 716
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v0, 0x0

    .line 717
    invoke-virtual {p1, p3, v0, v3}, Ljava/io/OutputStream;->write([BII)V

    add-long/2addr v1, v4

    .line 719
    invoke-interface {p2}, Ll/ۡ֨᩻;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 716
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 711
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Operation data exceeds destination extent"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    cmp-long p0, v1, p4

    if-nez p0, :cond_3

    :goto_0
    return-void

    .line 724
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Operation size mismatch: expected "

    const-string p2, ", actual "

    .line 0
    invoke-static {p1, p2, p4, p5}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 724
    invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ll/֫ܶ᩻;Ll/۠ۖܽ;Ll/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ۡ֨᩻;[B[B)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p4

    move-object/from16 v3, p6

    .line 637
    invoke-virtual/range {p1 .. p1}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v8

    .line 638
    iget-wide v4, v1, Ll/ᩴ֨᩻;->᩸:J

    invoke-virtual/range {p1 .. p1}, Ll/֫ܶ᩻;->getDataOffset()J

    move-result-wide v6

    add-long/2addr v6, v4

    const/4 v10, 0x0

    .line 639
    invoke-virtual {v0, v10}, Ll/֫ܶ᩻;->getDstExtents(I)Ll/۫۠᩻;

    move-result-object v4

    invoke-virtual {v4}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v4

    iget v11, v1, Ll/ᩴ֨᩻;->᩹:I

    int-to-long v11, v11

    mul-long v13, v4, v11

    .line 640
    new-instance v15, Ll/ۖ֨᩻;

    move-object v4, v15

    move-object/from16 v5, p2

    invoke-direct/range {v4 .. v9}, Ll/ۖ֨᩻;-><init>(Ll/۠ۖܽ;JJ)V

    .line 642
    sget-object v4, Ll/᩷֨᩻;->֫:[I

    invoke-virtual/range {p1 .. p1}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-eq v4, v5, :cond_1

    const/4 v3, 0x4

    if-ne v4, v3, :cond_0

    .line 654
    new-instance v3, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;

    sget-object v4, Lcom/github/luben/zstd/RecyclingBufferPool;->INSTANCE:Lcom/github/luben/zstd/BufferPool;

    invoke-direct {v3, v15, v4}, Lcom/github/luben/zstd/ZstdInputStreamNoFinalizer;-><init>(Ljava/io/InputStream;Lcom/github/luben/zstd/BufferPool;)V

    move-object v15, v3

    goto :goto_0

    .line 657
    :cond_0
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported operation type: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟۠᩻;->getNumber()I

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    .line 651
    :cond_1
    new-instance v4, Ll/ᩴܺᩴ;

    invoke-direct {v4, v15, v3}, Ll/ᩴܺᩴ;-><init>(Ljava/io/InputStream;[B)V

    invoke-static {v4}, Ll/֨ۨۡ;->֫(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v15

    goto :goto_0

    .line 647
    :cond_2
    new-instance v4, Ll/ۢ۠֡;

    new-instance v5, Ll/ᩴܺᩴ;

    invoke-direct {v5, v15, v3}, Ll/ᩴܺᩴ;-><init>(Ljava/io/InputStream;[B)V

    invoke-direct {v4, v5}, Ll/ۢ۠֡;-><init>(Ljava/io/InputStream;)V

    move-object v15, v4

    .line 660
    :cond_3
    :goto_0
    :try_start_0
    invoke-virtual {v0, v10}, Ll/֫ܶ᩻;->getDstExtents(I)Ll/۫۠᩻;

    move-result-object v0

    invoke-virtual {v0}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v3

    mul-long v6, v3, v11

    if-nez v2, :cond_4

    .line 662
    new-instance v0, Ll/ۘ֨᩻;

    move-object/from16 v2, p3

    invoke-direct {v0, v13, v14, v2}, Ll/ۘ֨᩻;-><init>(JLl/᩻ۖܽ;)V

    :goto_1
    move-object v3, v0

    goto :goto_2

    .line 663
    :cond_4
    new-instance v0, Ll/ܺ֨᩻;

    invoke-direct {v0, v2, v13, v14}, Ll/ܺ֨᩻;-><init>(Ljava/nio/channels/FileChannel;J)V

    goto :goto_1

    :goto_2
    move-object v2, v15

    move-object/from16 v4, p5

    move-object/from16 v5, p7

    .line 664
    invoke-static/range {v2 .. v7}, Ll/ᩴ֨᩻;->֫(Ljava/io/InputStream;Ljava/io/OutputStream;Ll/ۡ֨᩻;[BJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 665
    invoke-virtual {v15}, Ljava/io/InputStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 659
    :try_start_1
    invoke-virtual {v15}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v2
.end method

.method public static ֫(Ll/֫ܶ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;I)V
    .locals 8

    .line 734
    invoke-virtual {p0}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ll/۫۠᩻;

    .line 735
    invoke-virtual {v1}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v2

    int-to-long v4, p3

    mul-long v2, v2, v4

    move-object v0, p1

    .line 736
    monitor-enter v0

    .line 737
    :try_start_0
    invoke-virtual {v1}, Ll/۫۠᩻;->getStartBlock()J

    move-result-wide v6

    mul-long v6, v6, v4

    invoke-virtual {p1, v6, v7}, Ll/᩻ۖܽ;->seek(J)V

    :cond_0
    const-wide/16 v4, 0x0

    cmp-long v1, v2, v4

    if-lez v1, :cond_1

    .line 739
    sget-object v4, Ll/ᩴ֨᩻;->۬:[B

    const/high16 v1, 0x80000

    int-to-long v5, v1

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    move-object v1, p2

    .line 740
    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 741
    :try_start_1
    invoke-interface {p2, v6}, Ll/ۡ֨᩻;->֫(I)V

    .line 742
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v1, 0x0

    .line 743
    :try_start_2
    invoke-virtual {p1, v4, v1, v6}, Ll/᩻ۖܽ;->write([BII)V

    int-to-long v4, v6

    sub-long/2addr v2, v4

    .line 745
    invoke-interface {p2}, Ll/ۡ֨᩻;->᩻()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 746
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-void

    :catchall_0
    move-exception p0

    .line 742
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p0

    .line 749
    :cond_1
    monitor-exit v0

    goto :goto_0

    :catchall_1
    move-exception p0

    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p0

    :cond_2
    return-void
.end method

.method public static ֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;Ljava/nio/channels/FileChannel;ZLjava/util/ArrayList;I)V
    .locals 5

    if-eqz p4, :cond_6

    .line 675
    invoke-virtual {p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :cond_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result p5

    if-eqz p5, :cond_4

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p5

    check-cast p5, Ll/֫ܶ᩻;

    .line 758
    invoke-virtual {p5}, Ll/֫ܶ᩻;->getDstExtentsList()Ljava/util/List;

    move-result-object p5

    invoke-interface {p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :cond_1
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫۠᩻;

    .line 759
    invoke-virtual {v0}, Ll/۫۠᩻;->getNumBlocks()J

    move-result-wide v0

    int-to-long v2, p6

    mul-long v0, v0, v2

    move-wide v1, v0

    :cond_2
    const-wide/16 v3, 0x0

    cmp-long v0, v1, v3

    if-lez v0, :cond_1

    const/high16 v0, 0x80000

    int-to-long v3, v0

    .line 761
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v4, v3

    move-object v0, p2

    .line 762
    monitor-enter v0

    .line 763
    :try_start_0
    invoke-interface {p2, v4}, Ll/ۡ֨᩻;->֫(I)V

    .line 764
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v3, v4

    sub-long/2addr v1, v3

    .line 766
    invoke-interface {p2}, Ll/ۡ֨᩻;->᩻()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p0

    .line 764
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0

    .line 677
    :cond_3
    :goto_0
    invoke-interface {p2}, Ll/ۡ֨᩻;->᩻()Z

    move-result p5

    if-eqz p5, :cond_0

    goto :goto_1

    .line 681
    :cond_4
    invoke-virtual {p3}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide p2

    .line 682
    invoke-virtual {p0}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide p4

    cmp-long p6, p2, p4

    if-gtz p6, :cond_5

    .line 686
    invoke-virtual {p0}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide p2

    invoke-virtual {p1, p2, p3}, Ll/᩻ۖܽ;->setLength(J)V

    return-void

    .line 683
    :cond_5
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Extracted data exceeds entry size"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    if-eqz p3, :cond_7

    .line 690
    invoke-virtual {p3}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide p3

    invoke-virtual {p1, p3, p4}, Ll/᩻ۖܽ;->setLength(J)V

    .line 693
    :cond_7
    invoke-virtual {p5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/֫ܶ᩻;

    .line 694
    invoke-static {p3, p1, p2, p6}, Ll/ᩴ֨᩻;->֫(Ll/֫ܶ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;I)V

    .line 695
    invoke-interface {p2}, Ll/ۡ֨᩻;->᩻()Z

    move-result p3

    if-eqz p3, :cond_8

    :cond_9
    :goto_1
    return-void
.end method

.method public static ֫(Ll/ᩴ֨᩻;Ljava/util/ArrayList;IILl/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ۡ֨᩻;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۢ֨᩻;)V
    .locals 17

    move-object/from16 v1, p7

    move-object/from16 v2, p8

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v0, p0

    .line 558
    :try_start_0
    iget-object v5, v0, Ll/ᩴ֨᩻;->ۗ:Ll/۠ۖܽ;

    invoke-interface {v5}, Ll/۠ۖܽ;->ۡ()Ll/᩻ۖܽ;

    move-result-object v13
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 559
    :try_start_1
    invoke-virtual {v2, v13}, Ll/ۢ֨᩻;->֫(Ll/۠ۖܽ;)Z

    move-result v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_3

    if-eqz v4, :cond_0

    .line 579
    invoke-virtual {v2, v13}, Ll/ۢ֨᩻;->ۧ(Ll/۠ۖܽ;)V

    .line 583
    :cond_0
    :try_start_2
    invoke-virtual {v13}, Ll/᩻ۖܽ;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object v5, v0

    .line 0
    :cond_1
    invoke-virtual {v1, v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto/16 :goto_5

    :cond_2
    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto/16 :goto_6

    :cond_3
    const/high16 v5, 0x20000

    :try_start_3
    new-array v14, v5, [B

    const/high16 v5, 0x80000

    new-array v15, v5, [B

    move/from16 v12, p2

    :goto_0
    move/from16 v11, p3

    if-ge v12, v11, :cond_4

    .line 565
    move-object/from16 v5, p6

    check-cast v5, Ll/ۜ֨᩻;

    invoke-virtual {v5}, Ll/ۜ֨᩻;->᩻()Z

    move-result v5

    if-nez v5, :cond_4

    move-object/from16 v10, p1

    .line 566
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ll/֫ܶ᩻;

    move-object/from16 v5, p0

    move-object v7, v13

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move-object/from16 v10, p6

    move-object v11, v14

    move/from16 v16, v12

    move-object v12, v15

    invoke-direct/range {v5 .. v12}, Ll/ᩴ֨᩻;->֫(Ll/֫ܶ᩻;Ll/۠ۖܽ;Ll/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ۡ֨᩻;[B[B)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/lit8 v12, v16, 0x1

    goto :goto_0

    :cond_4
    if-eqz v4, :cond_5

    .line 579
    invoke-virtual {v2, v13}, Ll/ۢ֨᩻;->ۧ(Ll/۠ۖܽ;)V

    .line 583
    :cond_5
    :try_start_4
    invoke-virtual {v13}, Ll/᩻ۖܽ;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    return-void

    :catch_1
    move-exception v0

    move-object v5, v0

    .line 0
    :cond_6
    invoke-virtual {v1, v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    goto/16 :goto_5

    :cond_7
    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    goto/16 :goto_6

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v13, v3

    .line 574
    :goto_1
    :try_start_5
    new-instance v5, Ljava/io/IOException;

    invoke-direct {v5, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 0
    :cond_8
    invoke-virtual {v1, v3, v5}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 575
    invoke-virtual/range {p8 .. p8}, Ll/ۢ֨᩻;->֫()V

    goto :goto_2

    .line 0
    :cond_9
    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v0, :cond_8

    :goto_2
    if-eqz v4, :cond_a

    .line 579
    invoke-virtual {v2, v13}, Ll/ۢ֨᩻;->ۧ(Ll/۠ۖܽ;)V

    :cond_a
    if-eqz v13, :cond_12

    .line 583
    :try_start_6
    invoke-virtual {v13}, Ll/᩻ۖܽ;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_6

    :catch_3
    move-exception v0

    move-object v4, v0

    .line 0
    :cond_b
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    goto :goto_6

    :catch_4
    move-exception v0

    move-object v13, v3

    :cond_d
    :goto_3
    :try_start_7
    invoke-virtual {v1, v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    .line 571
    invoke-virtual/range {p8 .. p8}, Ll/ۢ֨᩻;->֫()V

    goto :goto_4

    .line 0
    :cond_e
    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    if-eqz v5, :cond_d

    :goto_4
    if-eqz v4, :cond_f

    .line 579
    invoke-virtual {v2, v13}, Ll/ۢ֨᩻;->ۧ(Ll/۠ۖܽ;)V

    :cond_f
    if-eqz v13, :cond_12

    .line 583
    :try_start_8
    invoke-virtual {v13}, Ll/᩻ۖܽ;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_5

    goto :goto_6

    :catch_5
    move-exception v0

    move-object v4, v0

    .line 0
    :cond_10
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_11

    .line 586
    :goto_5
    invoke-virtual/range {p8 .. p8}, Ll/ۢ֨᩻;->֫()V

    goto :goto_6

    .line 0
    :cond_11
    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_10

    :cond_12
    :goto_6
    return-void

    :catchall_2
    move-exception v0

    move-object v5, v0

    if-eqz v4, :cond_13

    .line 579
    invoke-virtual {v2, v13}, Ll/ۢ֨᩻;->ۧ(Ll/۠ۖܽ;)V

    :cond_13
    if-eqz v13, :cond_15

    .line 583
    :try_start_9
    invoke-virtual {v13}, Ll/᩻ۖܽ;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_8

    :catch_6
    move-exception v0

    move-object v4, v0

    .line 0
    :goto_7
    invoke-virtual {v1, v3, v4}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    invoke-virtual/range {p7 .. p7}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_15

    goto :goto_7

    .line 586
    :cond_14
    invoke-virtual/range {p8 .. p8}, Ll/ۢ֨᩻;->֫()V

    .line 590
    :cond_15
    :goto_8
    throw v5
.end method

.method public static synthetic ֫(Ll/ᩴ֨᩻;Ll/ۡ֨᩻;Ljava/util/concurrent/atomic/AtomicReference;Ll/֫ܶ᩻;Ll/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ܿ֨᩻;Ll/ܳ֨᩻;)V
    .locals 11

    move-object v1, p2

    const/4 v2, 0x0

    .line 327
    :try_start_0
    invoke-interface {p1}, Ll/ۡ֨᩻;->᩻()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    .line 330
    iget-object v5, v0, Ll/ᩴ֨᩻;->ۗ:Ll/۠ۖܽ;

    .line 331
    invoke-virtual/range {p6 .. p6}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v9, v3

    check-cast v9, [B

    invoke-virtual/range {p7 .. p7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, [B

    move-object v3, p0

    move-object v4, p3

    move-object v6, p4

    move-object/from16 v7, p5

    move-object v8, p1

    .line 330
    invoke-direct/range {v3 .. v10}, Ll/ᩴ֨᩻;->֫(Ll/֫ܶ᩻;Ll/۠ۖܽ;Ll/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ۡ֨᩻;[B[B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    .line 335
    new-instance v3, Ljava/io/IOException;

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 0
    :cond_1
    invoke-virtual {p2, v2, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :catch_0
    move-exception v0

    :cond_3
    invoke-virtual {p2, v2, v0}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_0

    :cond_4
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_3

    :cond_5
    :goto_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 775
    iget-object v0, p0, Ll/ᩴ֨᩻;->ۗ:Ll/۠ۖܽ;

    invoke-interface {v0}, Ljava/nio/channels/Channel;->close()V

    return-void
.end method

.method public final getEntry(Ljava/lang/String;)Ll/ܰۚ᩻;
    .locals 4

    .line 147
    iget-object v0, p0, Ll/ᩴ֨᩻;->ۙ:Ljava/util/HashMap;

    if-nez v0, :cond_0

    .line 149
    new-instance v0, Ljava/util/HashMap;

    iget-object v1, p0, Ll/ᩴ֨᩻;->᩶:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Ll/ᩴ֨᩻;->ۙ:Ljava/util/HashMap;

    .line 150
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ᩻;

    .line 151
    invoke-virtual {v2}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 154
    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ܰۚ᩻;

    return-object p1
.end method

.method public final ֫(Ll/ܰۚ᩻;)Ll/ᩳۨۡ;
    .locals 6

    .line 180
    iget-object p1, p1, Ll/ܰۚ᩻;->ܽ:Ll/ۡܶ᩻;

    invoke-virtual {p1}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 182
    new-instance p1, Ll/᩻֨᩻;

    iget v3, p0, Ll/ᩴ֨᩻;->᩹:I

    iget-wide v4, p0, Ll/ᩴ֨᩻;->᩸:J

    move-object v0, p1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Ll/᩻֨᩻;-><init>(Ll/ᩴ֨᩻;Ljava/util/Iterator;IJ)V

    .line 299
    new-instance v0, Ll/ᩳۨۡ;

    invoke-direct {v0, p1}, Ll/ᩳۨۡ;-><init>(Ljava/io/InputStream;)V

    return-object v0
.end method

.method public final ֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;)V
    .locals 23

    move-object/from16 v0, p2

    move-object/from16 v8, p1

    .line 363
    iget-object v1, v8, Ll/ܰۚ᩻;->ܽ:Ll/ۡܶ᩻;

    .line 364
    invoke-virtual {v1}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    goto :goto_0

    .line 367
    :cond_0
    invoke-virtual {v1}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v2

    .line 368
    invoke-virtual {v2}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v2}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    .line 371
    :cond_1
    invoke-virtual {v2}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v3

    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide v5

    cmp-long v7, v3, v5

    if-nez v7, :cond_2

    .line 372
    invoke-virtual {v2}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۛۜۖ;->size()I

    move-result v3

    const/16 v4, 0x20

    if-ne v3, v4, :cond_2

    move-object v9, v2

    goto :goto_1

    .line 373
    :cond_2
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid partition verification metadata: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    :goto_0
    move-object v9, v3

    :goto_1
    const-wide/16 v2, 0x0

    .line 308
    invoke-virtual {v0, v2, v3}, Ll/᩻ۖܽ;->setLength(J)V

    .line 309
    invoke-virtual/range {p2 .. p2}, Ll/᩻ۖܽ;->ۜ֫()Ll/ۖۖܽ;

    move-result-object v2

    .line 310
    invoke-interface {v2}, Ll/ۖۖܽ;->֫ܽ()Ljava/nio/channels/FileChannel;

    move-result-object v4

    if-eqz v4, :cond_4

    .line 311
    invoke-interface {v2}, Ll/ۖۖܽ;->᩻ܽ()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, 0x1

    const/4 v5, 0x1

    goto :goto_2

    :cond_4
    const/4 v2, 0x0

    const/4 v5, 0x0

    :goto_2
    move-object/from16 v6, p0

    .line 313
    iget v3, v6, Ll/ᩴ֨᩻;->᩹:I

    .line 314
    new-instance v2, Ll/۟ۚ᩻;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v15, Ll/ܿ֨᩻;

    invoke-direct {v15, v2}, Ll/ܿ֨᩻;-><init>(Ll/۟ۚ᩻;)V

    .line 315
    new-instance v2, Ll/֫֨᩻;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v14, Ll/ܳ֨᩻;

    invoke-direct {v14, v2}, Ll/ܳ֨᩻;-><init>(Ll/֫֨᩻;)V

    .line 316
    sget-object v2, Ll/֫ۨۡ;->ᩳ:Ljava/util/concurrent/ExecutorService;

    .line 39
    sget v2, Ll/ܿ᩸ۡ;->֫:I

    invoke-static {v2}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v2

    .line 317
    new-instance v19, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 318
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 320
    invoke-virtual {v1}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move-object/from16 v16, v0

    move-object v11, v6

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Ll/֫ܶ᩻;

    .line 321
    invoke-virtual {v12}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v10

    sget-object v7, Ll/۟۠᩻;->ZERO:Ll/۟۠᩻;

    if-ne v10, v7, :cond_5

    .line 322
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v20, v13

    move-object/from16 v21, v14

    move-object/from16 v22, v15

    goto :goto_4

    .line 325
    :cond_5
    new-instance v7, Ll/ۧ֨᩻;

    move-object v10, v7

    move-object/from16 v17, v12

    move-object/from16 v12, p3

    move-object/from16 v20, v13

    move-object/from16 v13, v19

    move-object/from16 v21, v14

    move-object/from16 v14, v17

    move-object/from16 v22, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v4

    move-object/from16 v17, v22

    move-object/from16 v18, v21

    invoke-direct/range {v10 .. v18}, Ll/ۧ֨᩻;-><init>(Ll/ᩴ֨᩻;Ll/ۡ֨᩻;Ljava/util/concurrent/atomic/AtomicReference;Ll/֫ܶ᩻;Ll/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ܿ֨᩻;Ll/ܳ֨᩻;)V

    invoke-interface {v2, v7}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    move-object/from16 v16, v0

    move-object v11, v6

    :goto_4
    move-object/from16 v13, v20

    move-object/from16 v14, v21

    move-object/from16 v15, v22

    goto :goto_3

    :cond_6
    move-object/from16 v20, v13

    .line 339
    invoke-static {v2}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    .line 340
    invoke-interface/range {p3 .. p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result v1

    if-eqz v1, :cond_7

    goto/16 :goto_6

    .line 343
    :cond_7
    invoke-virtual/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_e

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move v7, v3

    move-object/from16 v3, p3

    move-object/from16 v6, v20

    const/4 v10, 0x0

    .line 347
    :try_start_0
    invoke-static/range {v1 .. v7}, Ll/ᩴ֨᩻;->֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;Ljava/nio/channels/FileChannel;ZLjava/util/ArrayList;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 354
    invoke-interface/range {p3 .. p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result v1

    if-nez v1, :cond_d

    if-eqz v9, :cond_d

    .line 385
    invoke-virtual {v9}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v1

    .line 386
    invoke-virtual {v9}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۛۜۖ;->ܿ()[B

    move-result-object v3

    .line 387
    new-instance v4, Ll/᩵ۛۡ;

    const-wide/16 v5, 0x1

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v5

    invoke-direct {v4, v5, v6}, Ll/᩵ۛۡ;-><init>(J)V

    .line 388
    new-instance v5, Ll/᩻ۨ᩷;

    const/4 v6, 0x3

    move-object/from16 v7, p3

    invoke-direct {v5, v6, v7}, Ll/᩻ۨ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v4, v5}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    .line 389
    invoke-virtual {v4, v10}, Ll/᩵ۛۡ;->֫(I)Z

    .line 391
    invoke-virtual/range {p2 .. p2}, Ll/᩻ۖܽ;->flush()V

    .line 392
    invoke-virtual/range {p2 .. p2}, Ll/᩻ۖܽ;->length()J

    move-result-wide v5

    cmp-long v9, v5, v1

    if-nez v9, :cond_c

    .line 398
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v5

    const/high16 v6, 0x80000

    new-array v9, v6, [B

    const-wide/16 v11, 0x0

    .line 400
    invoke-virtual {v0, v11, v12}, Ll/᩻ۖܽ;->seek(J)V

    move-wide v13, v1

    :goto_5
    cmp-long v15, v13, v11

    if-lez v15, :cond_9

    .line 403
    invoke-interface/range {p3 .. p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result v11

    if-eqz v11, :cond_8

    goto :goto_6

    :cond_8
    int-to-long v11, v6

    .line 406
    invoke-static {v13, v14, v11, v12}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v11

    long-to-int v12, v11

    .line 407
    invoke-virtual {v0, v9, v10, v12}, Ll/᩻ۖܽ;->֫([BII)V

    .line 408
    invoke-virtual {v5, v9, v10, v12}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v6, v12

    sub-long/2addr v13, v6

    .line 410
    invoke-virtual {v4, v12}, Ll/᩵ۛۡ;->֫(I)Z

    const-wide/16 v6, 0x0

    move-wide v11, v6

    const/high16 v6, 0x80000

    move-object/from16 v7, p3

    goto :goto_5

    :cond_9
    const-wide/16 v6, 0x0

    cmp-long v0, v1, v6

    if-nez v0, :cond_a

    const/4 v0, 0x1

    .line 41
    invoke-virtual {v4, v0}, Ll/᩵ۛۡ;->֫(I)Z

    .line 415
    :cond_a
    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v3, v0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v0

    if-eqz v0, :cond_b

    goto :goto_6

    .line 416
    :cond_b
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Partition SHA-256 mismatch: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 394
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v3, "Extracted partition size mismatch: expected "

    const-string v4, ", actual "

    .line 0
    invoke-static {v3, v4, v1, v2}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v1

    .line 394
    invoke-virtual {v1, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_6
    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 352
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_0
    move-exception v0

    move-object v1, v0

    .line 350
    throw v1

    .line 344
    :cond_e
    invoke-virtual/range {v19 .. v19}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    throw v0
.end method

.method public final ֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;I)V
    .locals 29

    move/from16 v0, p4

    if-lez v0, :cond_12

    const/16 v1, 0x10

    if-gt v0, v1, :cond_12

    const-wide/16 v1, 0x0

    move-object/from16 v13, p2

    .line 429
    invoke-virtual {v13, v1, v2}, Ll/᩻ۖܽ;->setLength(J)V

    .line 430
    invoke-virtual/range {p2 .. p2}, Ll/᩻ۖܽ;->ۜ֫()Ll/ۖۖܽ;

    move-result-object v3

    .line 431
    invoke-interface {v3}, Ll/ۖۖܽ;->֫ܽ()Ljava/nio/channels/FileChannel;

    move-result-object v14

    if-eqz v14, :cond_0

    .line 432
    invoke-interface {v3}, Ll/ۖۖܽ;->᩻ܽ()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    const/4 v15, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    const/4 v15, 0x0

    :goto_0
    move-object/from16 v12, p0

    .line 433
    iget v11, v12, Ll/ᩴ֨᩻;->᩹:I

    .line 434
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 435
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v8, p1

    .line 437
    iget-object v3, v8, Ll/ܰۚ᩻;->ܽ:Ll/ۡܶ᩻;

    invoke-virtual {v3}, Ll/ۡܶ᩻;->getOperationsList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-wide v4, v1

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/֫ܶ᩻;

    .line 438
    invoke-virtual {v6}, Ll/֫ܶ᩻;->getType()Ll/۟۠᩻;

    move-result-object v7

    sget-object v1, Ll/۟۠᩻;->ZERO:Ll/۟۠᩻;

    if-ne v7, v1, :cond_1

    .line 439
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 441
    :cond_1
    invoke-virtual {v6}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v1

    const-wide/16 v16, 0x0

    cmp-long v7, v1, v16

    if-ltz v7, :cond_2

    const-wide v18, 0x7fffffffffffffffL

    sub-long v18, v18, v1

    cmp-long v7, v4, v18

    if-gtz v7, :cond_2

    add-long/2addr v4, v1

    .line 446
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_2
    const-wide/16 v1, 0x0

    goto :goto_1

    .line 443
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Payload operation data length overflow"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 450
    :cond_3
    new-instance v1, Ll/ܽ֨᩻;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v1

    invoke-static {v10, v1}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 452
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 453
    new-instance v2, Ll/ۢ֨᩻;

    invoke-direct {v2}, Ll/ۢ֨᩻;-><init>()V

    .line 454
    new-instance v7, Ll/ۜ֨᩻;

    move-object/from16 v6, p3

    invoke-direct {v7, v6, v1}, Ll/ۜ֨᩻;-><init>(Ll/ۡ֨᩻;Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 465
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-lez v0, :cond_e

    .line 467
    invoke-static {v0}, Ll/֫ۨۡ;->֫(I)Ljava/util/concurrent/ThreadPoolExecutor;

    move-result-object v3

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-wide/from16 v18, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    :goto_3
    if-ge v4, v0, :cond_9

    move-object/from16 p4, v3

    sub-int v3, v0, v4

    move/from16 v20, v0

    const/4 v0, 0x1

    if-ne v3, v0, :cond_5

    .line 476
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v3, v5

    const-wide/16 v21, 0x0

    :goto_4
    if-ge v3, v0, :cond_4

    .line 478
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Ll/֫ܶ᩻;

    invoke-virtual/range {v23 .. v23}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v23

    add-long v21, v23, v21

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_4
    move-wide/from16 v23, v21

    const-wide/16 v16, 0x0

    move/from16 v21, v0

    move-object v0, v7

    goto :goto_7

    :cond_5
    move-object v0, v7

    int-to-long v6, v3

    .line 481
    div-long v21, v18, v6

    .line 482
    rem-long v6, v18, v6

    const-wide/16 v16, 0x0

    cmp-long v23, v6, v16

    if-nez v23, :cond_6

    const/4 v6, 0x0

    goto :goto_5

    :cond_6
    const/4 v6, 0x1

    :goto_5
    int-to-long v6, v6

    add-long v21, v21, v6

    .line 483
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v6

    sub-int/2addr v6, v3

    add-int/lit8 v6, v6, 0x1

    move v3, v5

    move-wide/from16 v23, v16

    :goto_6
    if-ge v3, v6, :cond_8

    if-eq v3, v5, :cond_7

    cmp-long v7, v23, v21

    if-gez v7, :cond_8

    .line 486
    :cond_7
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/֫ܶ᩻;

    invoke-virtual {v7}, Ll/֫ܶ᩻;->getDataLength()J

    move-result-wide v25

    add-long v23, v25, v23

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :cond_8
    move/from16 v21, v3

    .line 492
    :goto_7
    new-instance v7, Ll/ᩳ֨᩻;

    move-object/from16 v6, p4

    move-object v3, v7

    move/from16 v22, v4

    move-object/from16 v4, p0

    move/from16 v25, v5

    move-object v5, v10

    move-object v13, v6

    move/from16 v6, v25

    move/from16 v25, v15

    move-object v15, v7

    move/from16 v7, v21

    move-object/from16 v8, p2

    move-object/from16 v26, v9

    move-object v9, v14

    move-object/from16 v27, v10

    move-object v10, v0

    move/from16 v28, v11

    move-object v11, v1

    move-object v12, v2

    invoke-direct/range {v3 .. v12}, Ll/ᩳ֨᩻;-><init>(Ll/ᩴ֨᩻;Ljava/util/ArrayList;IILl/᩻ۖܽ;Ljava/nio/channels/FileChannel;Ll/ۡ֨᩻;Ljava/util/concurrent/atomic/AtomicReference;Ll/ۢ֨᩻;)V

    invoke-interface {v13, v15}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    sub-long v18, v18, v23

    add-int/lit8 v4, v22, 0x1

    move-object/from16 v12, p0

    move-object/from16 v8, p1

    move-object/from16 v6, p3

    move-object v7, v0

    move-object v3, v13

    move/from16 v0, v20

    move/from16 v5, v21

    move/from16 v15, v25

    move-object/from16 v9, v26

    move-object/from16 v10, v27

    move/from16 v11, v28

    move-object/from16 v13, p2

    goto/16 :goto_3

    :cond_9
    move-object v13, v3

    move-object v0, v7

    move-object/from16 v26, v9

    move/from16 v28, v11

    move/from16 v25, v15

    .line 522
    invoke-virtual {v13}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdown()V

    .line 524
    :cond_a
    :goto_8
    :try_start_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x64

    invoke-virtual {v13, v4, v5, v3}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    move-result v3

    if-nez v3, :cond_f

    .line 525
    invoke-virtual {v0}, Ll/ۜ֨᩻;->᩻()Z

    move-result v3

    if-eqz v3, :cond_a

    .line 526
    invoke-virtual {v2}, Ll/ۢ֨᩻;->֫()V

    .line 527
    invoke-virtual {v13}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    .line 531
    new-instance v3, Ljava/io/InterruptedIOException;

    const-string v4, "Payload extraction was interrupted"

    invoke-direct {v3, v4}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 533
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_b
    const/4 v0, 0x0

    .line 0
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_b

    .line 535
    :goto_9
    invoke-virtual {v2}, Ll/ۢ֨᩻;->֫()V

    .line 536
    invoke-virtual {v13}, Ljava/util/concurrent/ThreadPoolExecutor;->shutdownNow()Ljava/util/List;

    .line 538
    :goto_a
    invoke-virtual {v13}, Ljava/util/concurrent/ThreadPoolExecutor;->isTerminated()Z

    move-result v0

    if-nez v0, :cond_d

    .line 540
    :try_start_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v13, v1, v2, v0}, Ljava/util/concurrent/ThreadPoolExecutor;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_a

    :catch_1
    nop

    goto :goto_a

    .line 544
    :cond_d
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 545
    throw v3

    :cond_e
    move-object/from16 v26, v9

    move/from16 v28, v11

    move/from16 v25, v15

    .line 500
    :cond_f
    invoke-interface/range {p3 .. p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result v0

    if-eqz v0, :cond_10

    return-void

    .line 503
    :cond_10
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/io/IOException;

    if-nez v0, :cond_11

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object v6, v14

    move/from16 v7, v25

    move-object/from16 v8, v26

    move/from16 v9, v28

    .line 508
    :try_start_2
    invoke-static/range {v3 .. v9}, Ll/ᩴ֨᩻;->֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;Ljava/nio/channels/FileChannel;ZLjava/util/ArrayList;I)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-void

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 513
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_2
    move-exception v0

    move-object v1, v0

    .line 511
    throw v1

    .line 505
    :cond_11
    throw v0

    .line 426
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Download thread count must be between 1 and 16"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩶ۧ()Ljava/util/List;
    .locals 1

    .line 138
    iget-object v0, p0, Ll/ᩴ֨᩻;->᩶:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ܰۚ᩻;
    .locals 2

    .line 158
    invoke-virtual {p0, p1}, Ll/ᩴ֨᩻;->getEntry(Ljava/lang/String;)Ll/ܰۚ᩻;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    .line 160
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Entry not found: "

    .line 0
    invoke-static {v1, p1}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 160
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
