.class public Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/engines/RomulusEngine$Instance;


# instance fields
.field public final mac_CNT:[B

.field public final mac_s:[B

.field public offset:I

.field public final s:[B

.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

.field public twist:Z


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/RomulusEngine;)V
    .locals 1

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    new-array v0, p1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    const/4 v0, 0x7

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    const/4 p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->twist:Z

    return-void
.end method


# virtual methods
.method public ad_encryption([BI[B[BI[B)I
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p5

    move-object/from16 v8, p6

    const/16 v2, 0x10

    new-array v4, v2, [B

    new-array v2, v2, [B

    const/16 v3, 0x10

    .line 0
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v1, v3

    const/16 v5, 0x10

    iget-object v9, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    move-object/from16 v10, p1

    move/from16 v11, p2

    move-object v12, v2

    move v13, v5

    move v14, v3

    invoke-virtual/range {v9 .. v14}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->pad([BI[BII)V

    move-object/from16 v6, p3

    invoke-static {v5, v2, v6}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    add-int v2, p2, v3

    iput v2, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->offset:I

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-virtual {v3, v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    if-eqz v1, :cond_0

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int v15, v1, v3

    iget-object v9, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    const/16 v13, 0x10

    move-object/from16 v10, p1

    move v11, v2

    move-object v12, v4

    move v14, v3

    invoke-virtual/range {v9 .. v14}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->pad([BI[BII)V

    add-int/2addr v2, v3

    iput v2, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->offset:I

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    const/4 v5, 0x0

    const/16 v7, 0x2c

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move-object/from16 v6, p6

    invoke-virtual/range {v1 .. v7}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-virtual {v1, v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    return v15

    :cond_0
    return v1
.end method

.method public processBufferAAD([BI)V
    .locals 9

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->twist:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v0, p1, p2, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[BI[B)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v4

    iget-object v7, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    const/16 v8, 0x28

    move-object v5, p1

    move v6, p2

    invoke-virtual/range {v2 .. v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    :goto_0
    iget-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->twist:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->twist:Z

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    return-void
.end method

.method public processBufferDecrypt([BI[BI)V
    .locals 0

    return-void
.end method

.method public processBufferEncrypt([BI[BI)V
    .locals 0

    return-void
.end method

.method public processFinalAAD()V
    .locals 11

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->getLen()I

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {v0, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget v2, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    if-eqz v2, :cond_2

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    add-int/lit8 v0, v0, -0x1

    invoke-static {v3, v2, v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([BIIB)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v0, v4, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v2, v4, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    add-int/lit8 v3, v2, -0x1

    iget v5, v4, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    and-int/lit8 v5, v5, 0xf

    int-to-byte v5, v5

    aput-byte v5, v0, v3

    iget-boolean v3, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->twist:Z

    if-eqz v3, :cond_1

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v2, v0, v3}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    goto :goto_0

    :cond_1
    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v6

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v7, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget-object v9, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    const/16 v10, 0x28

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    :goto_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {v0, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    :cond_2
    :goto_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iput v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v1

    iput v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    return-void
.end method

.method public processFinalBlock([BI)V
    .locals 25

    move-object/from16 v7, p0

    .line 0
    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->getLen()I

    move-result v0

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v1

    iget-object v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-boolean v3, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    const/4 v8, 0x0

    if-eqz v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    iget v3, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    :goto_0
    sub-int v9, v1, v3

    iget-object v1, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    check-cast v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;

    invoke-virtual {v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamDataOperator;->getBytes()[B

    move-result-object v6

    and-int/lit8 v1, v0, 0x1f

    const/16 v5, 0x10

    if-nez v1, :cond_1

    if-eqz v0, :cond_1

    const/16 v0, 0x38

    goto :goto_1

    :cond_1
    if-ge v1, v5, :cond_2

    const/16 v0, 0x32

    goto :goto_1

    :cond_2
    if-eq v1, v5, :cond_3

    const/16 v0, 0x3a

    :goto_1
    int-to-byte v0, v0

    goto :goto_2

    :cond_3
    const/16 v0, 0x30

    :goto_2
    and-int/lit8 v1, v9, 0x1f

    if-nez v1, :cond_4

    if-eqz v9, :cond_4

    xor-int/lit8 v0, v0, 0x4

    goto :goto_3

    :cond_4
    if-ge v1, v5, :cond_5

    xor-int/lit8 v0, v0, 0x1

    goto :goto_3

    :cond_5
    if-eq v1, v5, :cond_6

    xor-int/lit8 v0, v0, 0x5

    :goto_3
    int-to-byte v0, v0

    :cond_6
    move/from16 v17, v0

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-boolean v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    const/4 v12, 0x0

    if-eqz v1, :cond_a

    and-int/lit8 v1, v17, 0x8

    if-nez v1, :cond_7

    new-array v0, v5, [B

    invoke-static {v9, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    sub-int v2, v9, v1

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    const/16 v14, 0x10

    move-object v11, v6

    move-object v13, v0

    move v15, v1

    invoke-virtual/range {v10 .. v15}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->pad([BI[BII)V

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v4, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v20

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    const/16 v24, 0x2c

    const/16 v22, 0x0

    move-object/from16 v18, v3

    move-object/from16 v19, v4

    move-object/from16 v21, v0

    move-object/from16 v23, v10

    invoke-virtual/range {v18 .. v24}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {v0, v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    move/from16 v18, v2

    move v2, v1

    goto :goto_4

    :cond_7
    if-nez v9, :cond_8

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    :cond_8
    const/4 v0, 0x0

    move/from16 v18, v9

    const/4 v2, 0x0

    :goto_4
    if-lez v18, :cond_9

    iput v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->offset:I

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v4

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    move-object/from16 v0, p0

    move-object v1, v6

    const/16 v15, 0x10

    move/from16 v5, v18

    move-object v14, v6

    move-object v6, v10

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->ad_encryption([BI[B[BI[B)I

    move-result v18

    iget v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->offset:I

    move-object v6, v14

    const/16 v5, 0x10

    goto :goto_4

    :cond_9
    move-object v14, v6

    const/16 v15, 0x10

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v11, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v12

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v13

    const/4 v0, 0x0

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    move v14, v0

    const/16 v3, 0x10

    move-object v15, v1

    move/from16 v16, v17

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    iget-object v4, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    invoke-virtual {v0, v1, v4, v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->g8A([B[BI)V

    sub-int v12, v2, v9

    move/from16 v0, v18

    goto :goto_5

    :cond_a
    const/16 v3, 0x10

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    invoke-static {v6, v9, v1, v8, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move v0, v9

    :goto_5
    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v2

    invoke-static {v1, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$500(Lorg/bouncycastle/crypto/engines/RomulusEngine;[B)V

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    iget-object v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    invoke-static {v1, v8, v2, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-lez v9, :cond_c

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v20

    iget-object v4, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v21

    iget-object v4, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v23

    const/16 v24, 0x24

    const/16 v22, 0x0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    invoke-virtual/range {v18 .. v24}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    move/from16 v2, p2

    move v1, v12

    :goto_6
    const/16 v5, 0x10

    if-le v9, v5, :cond_b

    add-int/lit8 v9, v9, -0x10

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v15, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    const/16 v16, 0x10

    move-object v11, v6

    move v12, v1

    move-object/from16 v13, p1

    move v14, v2

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->rho([BI[BI[BI)V

    add-int/lit8 v2, v2, 0x10

    add-int/lit8 v1, v1, 0x10

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v4

    invoke-virtual {v3, v4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v11, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    invoke-static {v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v12

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v13

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v15

    const/16 v16, 0x24

    const/4 v14, 0x0

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    goto :goto_6

    :cond_b
    const/16 v3, 0x10

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v15, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    move-object v11, v6

    move v12, v1

    move-object/from16 v13, p1

    move v14, v2

    move/from16 v16, v9

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->rho([BI[BI[BI)V

    goto :goto_7

    :cond_c
    const/16 v3, 0x10

    :goto_7
    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-boolean v2, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    if-nez v2, :cond_10

    and-int/lit8 v2, v17, 0x8

    if-nez v2, :cond_d

    new-array v1, v3, [B

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr v0, v2

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    const/16 v14, 0x10

    move-object/from16 v11, p1

    move/from16 v12, p2

    move-object v13, v1

    move v15, v2

    invoke-virtual/range {v10 .. v15}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->pad([BI[BII)V

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v11, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v12

    iget-object v15, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    const/16 v16, 0x2c

    const/4 v14, 0x0

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    iget-object v1, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {v1, v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    add-int v1, p2, v2

    move v5, v0

    move v2, v1

    goto :goto_8

    :cond_d
    if-nez v9, :cond_e

    iget-object v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    :cond_e
    move/from16 v2, p2

    move v5, v0

    :goto_8
    if-lez v5, :cond_f

    iput v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->offset:I

    iget-object v3, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v4

    iget-object v9, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v15, v6

    move-object v6, v9

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->ad_encryption([BI[B[BI[B)I

    move-result v5

    iget v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->offset:I

    move-object v6, v15

    goto :goto_8

    :cond_f
    move-object v15, v6

    iget-object v10, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v11, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v12

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v13

    const/4 v14, 0x0

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    move-object v1, v15

    move-object v15, v0

    move/from16 v16, v17

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    invoke-virtual {v0, v2, v3, v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->g8A([B[BI)V

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v0

    iget-object v2, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget v3, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr v0, v3

    iget-object v2, v2, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    invoke-static {v1, v0, v2, v8, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, v7, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iput v8, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    :cond_10
    return-void
.end method

.method public reset()V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->s:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_s:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->mac_CNT:[B

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$500(Lorg/bouncycastle/crypto/engines/RomulusEngine;[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$500(Lorg/bouncycastle/crypto/engines/RomulusEngine;[B)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusM;->twist:Z

    return-void
.end method
