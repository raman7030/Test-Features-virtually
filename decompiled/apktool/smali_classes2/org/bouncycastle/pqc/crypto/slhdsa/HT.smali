.class public Lorg/bouncycastle/pqc/crypto/slhdsa/HT;
.super Ljava/lang/Object;


# instance fields
.field public engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

.field public final htPubKey:[B

.field public final pkSeed:[B

.field public final skSeed:[B

.field public wots:Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;[B[B)V
    .locals 3

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->skSeed:[B

    iput-object p3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->pkSeed:[B

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    new-instance v0, Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;

    invoke-direct {v0, p1}, Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;)V

    iput-object v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->wots:Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;

    new-instance v0, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>()V

    iget p1, p1, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    if-eqz p2, :cond_0

    invoke-virtual {p0, p2, p3, v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_PKgen([B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->htPubKey:[B

    return-void

    :cond_0
    const/4 p1, 0x0

    iput-object p1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->htPubKey:[B

    return-void
.end method


# virtual methods
.method public sign([BJI)[B
    .locals 17

    move-object/from16 v6, p0

    move-wide/from16 v7, p2

    .line 0
    new-instance v9, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v9}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>()V

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    invoke-virtual {v9, v7, v8}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    iget-object v2, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->skSeed:[B

    iget-object v4, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->pkSeed:[B

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v3, p4

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_sign([B[BI[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;

    move-result-object v2

    iget-object v0, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v11, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    new-array v12, v11, [Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;

    aput-object v2, v12, v10

    invoke-virtual {v9, v10}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    invoke-virtual {v9, v7, v8}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    iget-object v4, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->pkSeed:[B

    move-object/from16 v0, p0

    move/from16 v1, p4

    move-object/from16 v3, p1

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_pkFromSig(ILorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object v0

    const/4 v13, 0x1

    const/4 v1, 0x1

    move-object v15, v0

    const/4 v14, 0x1

    :goto_0
    iget-object v0, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v1, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    if-ge v14, v1, :cond_1

    iget v0, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    shl-int v1, v13, v0

    sub-int/2addr v1, v13

    int-to-long v1, v1

    and-long/2addr v1, v7

    long-to-int v5, v1

    ushr-long/2addr v7, v0

    invoke-virtual {v9, v14}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    invoke-virtual {v9, v7, v8}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    iget-object v2, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->skSeed:[B

    iget-object v4, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->pkSeed:[B

    move-object/from16 v0, p0

    move-object v1, v15

    move v3, v5

    move/from16 v16, v5

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_sign([B[BI[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;

    move-result-object v2

    aput-object v2, v12, v14

    iget-object v0, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v0, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    sub-int/2addr v0, v13

    if-ge v14, v0, :cond_0

    iget-object v4, v6, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->pkSeed:[B

    move-object/from16 v0, p0

    move/from16 v1, v16

    move-object v3, v15

    move-object v5, v9

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_pkFromSig(ILorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object v15

    :cond_0
    add-int/lit8 v14, v14, 0x1

    goto :goto_0

    :cond_1
    new-array v0, v11, [[B

    :goto_1
    if-eq v10, v11, :cond_2

    aget-object v1, v12, v10

    iget-object v2, v1, Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;->sig:[B

    iget-object v1, v1, Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;->auth:[[B

    invoke-static {v1}, Lorg/bouncycastle/util/Arrays;->concatenate([[B)[B

    move-result-object v1

    invoke-static {v2, v1}, Lorg/bouncycastle/util/Arrays;->concatenate([B[B)[B

    move-result-object v1

    aput-object v1, v0, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->concatenate([[B)[B

    move-result-object v0

    return-object v0
.end method

.method public treehash([BII[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B
    .locals 10

    ushr-int v0, p2, p3

    shl-int/2addr v0, p3

    if-eq v0, p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    new-instance v1, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v1, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)V

    const/4 p5, 0x0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x1

    shl-int v4, v3, p3

    if-ge v2, v4, :cond_2

    invoke-virtual {v1, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTypeAndClear(I)V

    add-int v4, p2, v2

    invoke-virtual {v1, v4}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setKeyPairAddress(I)V

    iget-object v5, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->wots:Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;

    invoke-virtual {v5, p1, p4, v1}, Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;->pkGen([B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object v5

    const/4 v6, 0x2

    invoke-virtual {v1, v6}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTypeAndClear(I)V

    invoke-virtual {v1, v3}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeHeight(I)V

    invoke-virtual {v1, v4}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeIndex(I)V

    const/4 v7, 0x1

    :goto_1
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_1

    invoke-virtual {v0, p5}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;

    iget v8, v8, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;->nodeHeight:I

    if-ne v8, v7, :cond_1

    sub-int/2addr v4, v3

    div-int/2addr v4, v6

    invoke-virtual {v1, v4}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeIndex(I)V

    invoke-virtual {v0, p5}, Ljava/util/LinkedList;->remove(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;

    iget-object v9, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget-object v8, v8, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;->nodeValue:[B

    invoke-virtual {v9, p4, v1, v8, v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B[B)[B

    move-result-object v5

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v1, v7}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeHeight(I)V

    goto :goto_1

    :cond_1
    new-instance v3, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;

    invoke-direct {v3, v5, v7}, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;-><init>([BI)V

    invoke-virtual {v0, p5, v3}, Ljava/util/LinkedList;->add(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p5}, Ljava/util/LinkedList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;

    iget-object p1, p1, Lorg/bouncycastle/pqc/crypto/slhdsa/NodeEntry;->nodeValue:[B

    return-object p1
.end method

.method public verify([B[Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;[BJI[B)Z
    .locals 7

    .line 0
    new-instance v6, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v6}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>()V

    const/4 v0, 0x0

    aget-object v2, p2, v0

    invoke-virtual {v6, v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    invoke-virtual {v6, p4, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    move-object v0, p0

    move v1, p6

    move-object v3, p1

    move-object v4, p3

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_pkFromSig(ILorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object p1

    const/4 p6, 0x1

    const/4 v0, 0x1

    move-object v3, p1

    const/4 p1, 0x1

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v1, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->D:I

    if-ge p1, v1, :cond_0

    iget v0, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    shl-int v1, p6, v0

    sub-int/2addr v1, p6

    int-to-long v1, v1

    and-long/2addr v1, p4

    long-to-int v1, v1

    ushr-long/2addr p4, v0

    aget-object v2, p2, p1

    invoke-virtual {v6, p1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    invoke-virtual {v6, p4, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    move-object v0, p0

    move-object v4, p3

    move-object v5, v6

    invoke-virtual/range {v0 .. v5}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->xmss_pkFromSig(ILorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object v3

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p7, v3}, Lorg/bouncycastle/util/Arrays;->areEqual([B[B)Z

    move-result p1

    return p1
.end method

.method public xmss_PKgen([B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v4, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->treehash([BII[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object p1

    return-object p1
.end method

.method public xmss_pkFromSig(ILorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B
    .locals 5

    .line 0
    new-instance v0, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v0, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)V

    const/4 p5, 0x0

    invoke-virtual {v0, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTypeAndClear(I)V

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setKeyPairAddress(I)V

    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;->getWOTSSig()[B

    move-result-object v1

    invoke-virtual {p2}, Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;->getXMSSAUTH()[[B

    move-result-object p2

    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->wots:Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;

    invoke-virtual {v2, v1, p3, p4, v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;->pkFromSig([B[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object p3

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTypeAndClear(I)V

    invoke-virtual {v0, p1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeIndex(I)V

    :goto_0
    iget-object v2, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v2, v2, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    if-ge p5, v2, :cond_1

    add-int/lit8 v2, p5, 0x1

    invoke-virtual {v0, v2}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeHeight(I)V

    const/4 v3, 0x1

    shl-int v4, v3, p5

    and-int/2addr v4, p1

    if-nez v4, :cond_0

    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->getTreeIndex()I

    move-result v3

    div-int/2addr v3, v1

    invoke-virtual {v0, v3}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeIndex(I)V

    iget-object v3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    aget-object p5, p2, p5

    invoke-virtual {v3, p4, v0, p3, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B[B)[B

    move-result-object p3

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->getTreeIndex()I

    move-result v4

    sub-int/2addr v4, v3

    div-int/2addr v4, v1

    invoke-virtual {v0, v4}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeIndex(I)V

    iget-object v3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    aget-object p5, p2, p5

    invoke-virtual {v3, p4, v0, p5, p3}, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H([BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;[B[B)[B

    move-result-object p3

    :goto_1
    move p5, v2

    goto :goto_0

    :cond_1
    return-object p3
.end method

.method public xmss_sign([B[BI[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;
    .locals 10

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v0, v0, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    new-array v0, v0, [[B

    new-instance v7, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v7, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)V

    const/4 v1, 0x2

    invoke-virtual {v7, v1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTypeAndClear(I)V

    invoke-virtual {p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->getLayerAddress()I

    move-result v1

    invoke-virtual {v7, v1}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setLayerAddress(I)V

    invoke-virtual {p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->getTreeAddress()J

    move-result-wide v1

    invoke-virtual {v7, v1, v2}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTreeAddress(J)V

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v9, 0x0

    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->engine:Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;

    iget v1, v1, Lorg/bouncycastle/pqc/crypto/slhdsa/SLHDSAEngine;->H_PRIME:I

    if-ge v9, v1, :cond_0

    ushr-int v1, p3, v9

    xor-int/lit8 v1, v1, 0x1

    shl-int v3, v1, v9

    move-object v1, p0

    move-object v2, p2

    move v4, v9

    move-object v5, p4

    move-object v6, v7

    invoke-virtual/range {v1 .. v6}, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->treehash([BII[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object v1

    aput-object v1, v0, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;

    invoke-direct {v1, p5}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;-><init>(Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)V

    invoke-virtual {v1, v8}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setTypeAndClear(I)V

    invoke-virtual {v1, p3}, Lorg/bouncycastle/pqc/crypto/slhdsa/ADRS;->setKeyPairAddress(I)V

    iget-object p3, p0, Lorg/bouncycastle/pqc/crypto/slhdsa/HT;->wots:Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;

    invoke-virtual {p3, p1, p2, p4, v1}, Lorg/bouncycastle/pqc/crypto/slhdsa/WotsPlus;->sign([B[B[BLorg/bouncycastle/pqc/crypto/slhdsa/ADRS;)[B

    move-result-object p1

    new-instance p2, Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;

    invoke-direct {p2, p1, v0}, Lorg/bouncycastle/pqc/crypto/slhdsa/SIG_XMSS;-><init>([B[[B)V

    return-object p2
.end method
