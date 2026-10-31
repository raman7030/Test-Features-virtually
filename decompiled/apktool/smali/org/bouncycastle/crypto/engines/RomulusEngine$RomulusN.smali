.class public Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/engines/RomulusEngine$Instance;


# instance fields
.field public final s:[B

.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

.field public twist:Z


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/RomulusEngine;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    return-void
.end method


# virtual methods
.method public processBufferAAD([BI)V
    .locals 9

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->twist:Z

    if-eqz v0, :cond_0

    const/16 v0, 0x10

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v0, p1, p2, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[BI[B)V

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v4

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v7

    const/16 v8, 0x8

    move-object v5, p1

    move v6, p2

    invoke-virtual/range {v2 .. v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    :goto_0
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->twist:Z

    xor-int/lit8 p1, p1, 0x1

    iput-boolean p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->twist:Z

    return-void
.end method

.method public processBufferDecrypt([BI[BI)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-virtual {v0, v1, p3, p4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->g8A([B[BI)V

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    add-int v1, v0, p4

    aget-byte v2, p3, v1

    add-int v3, v0, p2

    aget-byte v3, p1, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    aget-byte v3, v1, v0

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v2

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v3

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v5

    const/4 v6, 0x4

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    return-void
.end method

.method public processBufferEncrypt([BI[BI)V
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-virtual {v0, v1, p3, p4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->g8A([B[BI)V

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x10

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    aget-byte v2, v1, v0

    add-int v3, v0, p2

    aget-byte v4, p1, v3

    xor-int/2addr v2, v4

    int-to-byte v2, v2

    aput-byte v2, v1, v0

    add-int v1, v0, p4

    aget-byte v2, p3, v1

    aget-byte v3, p1, v3

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p3, v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v2

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v3

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v5

    const/4 v6, 0x4

    const/4 v4, 0x0

    invoke-virtual/range {v0 .. v6}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    return-void
.end method

.method public processFinalAAD()V
    .locals 17

    move-object/from16 v0, p0

    .line 0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget v1, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    if-eqz v1, :cond_1

    const/16 v2, 0x10

    new-array v9, v2, [B

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v8

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v4, v3, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    const/4 v5, 0x0

    const/16 v7, 0x10

    move-object v6, v9

    invoke-virtual/range {v3 .. v8}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->pad([BI[BII)V

    iget-boolean v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->twist:Z

    if-eqz v1, :cond_0

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v2, v9, v1}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    goto :goto_0

    :cond_0
    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v4, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v5

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v8

    const/16 v1, 0x8

    const/4 v7, 0x0

    move-object v6, v9

    move v9, v1

    invoke-virtual/range {v3 .. v9}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    :goto_0
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    :cond_1
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v1, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->getLen()I

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-object v3, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v4, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v5

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v6

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v8

    const/16 v9, 0x1a

    const/4 v7, 0x0

    invoke-virtual/range {v3 .. v9}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    goto :goto_1

    :cond_2
    iget-object v10, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget v1, v10, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    and-int/lit8 v1, v1, 0xf

    iget-object v11, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v12

    if-eqz v1, :cond_3

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v13

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v15

    const/16 v16, 0x1a

    const/4 v14, 0x0

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    goto :goto_1

    :cond_3
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v13

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v15

    const/16 v16, 0x18

    const/4 v14, 0x0

    invoke-virtual/range {v10 .. v16}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    :goto_1
    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v2

    invoke-static {v1, v2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$500(Lorg/bouncycastle/crypto/engines/RomulusEngine;[B)V

    return-void
.end method

.method public processFinalBlock([BI)V
    .locals 11

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v0

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-boolean v2, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    iget v2, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    :goto_0
    sub-int/2addr v0, v2

    if-nez v0, :cond_1

    invoke-static {v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object p1

    invoke-virtual {v1, p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v6

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v7

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v9

    const/16 v10, 0x15

    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    goto :goto_2

    :cond_1
    iget v0, v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    if-eqz v0, :cond_3

    const/16 v1, 0x10

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v10

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v5, v4, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    const/4 v6, 0x0

    iget-object v9, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    move-object v7, p1

    move v8, p2

    invoke-virtual/range {v4 .. v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->rho([BI[BI[BI)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->lfsr_gf56([B)V

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v4}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$200(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v6

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$300(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v7

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {p1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v9

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget p1, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    if-ne p1, v1, :cond_2

    const/16 p1, 0x14

    const/16 v10, 0x14

    goto :goto_1

    :cond_2
    const/16 p1, 0x15

    const/16 v10, 0x15

    :goto_1
    const/4 v8, 0x0

    invoke-virtual/range {v4 .. v10}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->block_cipher([B[B[BI[BB)V

    :cond_3
    :goto_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    iget-object v0, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    invoke-virtual {p1, p2, v0, v3}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->g8A([B[BI)V

    return-void
.end method

.method public reset()V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->s:[B

    invoke-static {v0}, Lorg/bouncycastle/util/Arrays;->clear([B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->this$0:Lorg/bouncycastle/crypto/engines/RomulusEngine;

    invoke-static {v0}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$400(Lorg/bouncycastle/crypto/engines/RomulusEngine;)[B

    move-result-object v1

    invoke-static {v0, v1}, Lorg/bouncycastle/crypto/engines/RomulusEngine;->access$500(Lorg/bouncycastle/crypto/engines/RomulusEngine;[B)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/engines/RomulusEngine$RomulusN;->twist:Z

    return-void
.end method
