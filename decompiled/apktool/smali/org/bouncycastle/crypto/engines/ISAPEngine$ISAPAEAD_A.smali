.class public abstract Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAP_AEAD;


# instance fields
.field public ISAP_IV1_64:J

.field public ISAP_IV2_64:J

.field public ISAP_IV3_64:J

.field public k64:[J

.field public mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

.field public npub64:[J

.field public p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/ISAPEngine;)V
    .locals 1

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x40

    invoke-static {p1, v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$002(Lorg/bouncycastle/crypto/engines/ISAPEngine;I)I

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$000(Lorg/bouncycastle/crypto/engines/ISAPEngine;)I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    shr-int/lit8 v0, v0, 0x3

    iput v0, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-instance p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    new-instance p1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    invoke-direct {p1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    return-void
.end method

.method private getLongSize(I)I
    .locals 0

    add-int/lit8 p1, p1, 0x7

    ushr-int/lit8 p1, p1, 0x3

    return p1
.end method

.method private isap_rk(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;J[BI)V
    .locals 15

    move-object/from16 v11, p1

    move-object v12, p0

    .line 0
    iget-object v0, v12, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->k64:[J

    const/4 v13, 0x0

    aget-wide v1, v0, v13

    const/4 v14, 0x1

    aget-wide v3, v0, v14

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    move-object/from16 v0, p1

    move-wide/from16 v5, p2

    invoke-virtual/range {v0 .. v10}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->set(JJJJJ)V

    const/16 v0, 0xc

    invoke-virtual {v11, v0}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    :goto_0
    shl-int/lit8 v1, p5, 0x3

    sub-int/2addr v1, v14

    if-ge v13, v1, :cond_0

    iget-wide v1, v11, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    ushr-int/lit8 v3, v13, 0x3

    aget-byte v3, p4, v3

    and-int/lit8 v4, v13, 0x7

    rsub-int/lit8 v4, v4, 0x7

    ushr-int/2addr v3, v4

    and-int/2addr v3, v14

    shl-int/lit8 v3, v3, 0x7

    int-to-long v3, v3

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v5, 0x38

    shl-long/2addr v3, v5

    xor-long/2addr v1, v3

    iput-wide v1, v11, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-virtual/range {p0 .. p1}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->PX2(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_0
    iget-wide v1, v11, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    add-int/lit8 v3, p5, -0x1

    aget-byte v3, p4, v3

    int-to-long v3, v3

    const-wide/16 v5, 0x1

    and-long/2addr v3, v5

    const/16 v5, 0x3f

    shl-long/2addr v3, v5

    xor-long/2addr v1, v3

    iput-wide v1, v11, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-virtual {v11, v0}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    return-void
.end method


# virtual methods
.method public abstract PX1(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V
.end method

.method public abstract PX2(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V
.end method

.method public absorbFinalAADBlock()V
    .locals 9

    const/4 v0, 0x0

    .line 0
    :goto_0
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    iget v2, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    if-ge v0, v2, :cond_0

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v3, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    iget-object v1, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    aget-byte v1, v1, v0

    int-to-long v5, v1

    const-wide/16 v7, 0xff

    and-long/2addr v5, v7

    rsub-int/lit8 v1, v0, 0x7

    shl-int/lit8 v1, v1, 0x3

    shl-long/2addr v5, v1

    xor-long/2addr v3, v5

    iput-wide v3, v2, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v3, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    rsub-int/lit8 v1, v2, 0x7

    shl-int/lit8 v1, v1, 0x3

    const-wide/16 v5, 0x80

    shl-long v1, v5, v1

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    const-wide/16 v3, 0x1

    xor-long/2addr v1, v3

    iput-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    return-void
.end method

.method public absorbMacBlock([BI)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    xor-long/2addr p1, v1

    iput-wide p1, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    const/16 p2, 0xc

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    return-void
.end method

.method public init()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$100(Lorg/bouncycastle/crypto/engines/ISAPEngine;)[B

    move-result-object v0

    array-length v0, v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->getLongSize(I)I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->npub64:[J

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$200(Lorg/bouncycastle/crypto/engines/ISAPEngine;)[B

    move-result-object v0

    array-length v0, v0

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->getLongSize(I)I

    move-result v0

    new-array v0, v0, [J

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->k64:[J

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$100(Lorg/bouncycastle/crypto/engines/ISAPEngine;)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->npub64:[J

    const/4 v2, 0x0

    invoke-static {v0, v2, v1}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI[J)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$200(Lorg/bouncycastle/crypto/engines/ISAPEngine;)[B

    move-result-object v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->k64:[J

    invoke-static {v0, v2, v1}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI[J)V

    return-void
.end method

.method public processEncBlock([BI[BI)V
    .locals 2

    .line 0
    invoke-static {p1, p2}, Lorg/bouncycastle/util/Pack;->bigEndianToLong([BI)J

    move-result-wide p1

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    xor-long/2addr p1, v0

    invoke-static {p1, p2, p3, p4}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->PX1(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V

    return-void
.end method

.method public processEncFinalBlock([BI)V
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Pack;->longToLittleEndian(J)[B

    move-result-object v3

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    iget v2, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    iget v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    sub-int v4, v1, v2

    iget-object v5, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    const/4 v6, 0x0

    move-object v7, p1

    move v8, p2

    invoke-static/range {v2 .. v8}, Lorg/bouncycastle/util/Bytes;->xor(I[BI[BI[BI)V

    return-void
.end method

.method public processMACFinal([BII[B)V
    .locals 16

    move-object/from16 v6, p0

    move/from16 v0, p3

    move-object/from16 v7, p4

    const/4 v8, 0x0

    const/4 v1, 0x0

    move/from16 v1, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 0
    iget-object v3, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v4, v3, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    add-int/lit8 v9, v1, 0x1

    aget-byte v1, p1, v1

    int-to-long v10, v1

    const-wide/16 v12, 0xff

    and-long/2addr v10, v12

    rsub-int/lit8 v1, v2, 0x7

    shl-int/lit8 v1, v1, 0x3

    shl-long/2addr v10, v1

    xor-long/2addr v4, v10

    iput-wide v4, v3, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    add-int/lit8 v2, v2, 0x1

    move v1, v9

    goto :goto_0

    :cond_0
    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    rsub-int/lit8 v0, v0, 0x7

    shl-int/lit8 v0, v0, 0x3

    const-wide/16 v4, 0x80

    shl-long/2addr v4, v0

    xor-long/2addr v2, v4

    iput-wide v2, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    const/16 v9, 0xc

    invoke-virtual {v1, v9}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    invoke-static {v0, v1, v7, v8}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    const/16 v10, 0x8

    invoke-static {v0, v1, v7, v10}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v11, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iget-wide v13, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iget-wide v4, v1, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    iget-wide v2, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->ISAP_IV2_64:J

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    iget v15, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    move-object/from16 v0, p0

    move-wide v8, v4

    move-object/from16 v4, p4

    move v5, v15

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->isap_rk(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;J[BI)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iput-wide v11, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x2:J

    iput-wide v13, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    iput-wide v8, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x0:J

    const/4 v2, 0x0

    invoke-static {v0, v1, v7, v2}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v0, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x1:J

    invoke-static {v0, v1, v7, v10}, Lorg/bouncycastle/util/Pack;->longToBigEndian(J[BI)V

    return-void
.end method

.method public reset()V
    .locals 18

    move-object/from16 v6, p0

    .line 0
    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-wide v2, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->ISAP_IV3_64:J

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine;->access$100(Lorg/bouncycastle/crypto/engines/ISAPEngine;)[B

    move-result-object v4

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->this$0:Lorg/bouncycastle/crypto/engines/ISAPEngine;

    iget v5, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->isap_rk(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;J[BI)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-object v1, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->npub64:[J

    const/4 v2, 0x0

    aget-wide v3, v1, v2

    iput-wide v3, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x3:J

    const/4 v3, 0x1

    aget-wide v4, v1, v3

    iput-wide v4, v0, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->x4:J

    invoke-virtual {v6, v0}, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->PX1(Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;)V

    iget-object v7, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->npub64:[J

    aget-wide v8, v0, v2

    aget-wide v10, v0, v3

    iget-wide v12, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->ISAP_IV1_64:J

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    invoke-virtual/range {v7 .. v17}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->set(JJJJJ)V

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ISAPEngine$ISAPAEAD_A;->mac:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    const/16 v1, 0xc

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    return-void
.end method
