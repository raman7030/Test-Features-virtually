.class public Lorg/bouncycastle/crypto/engines/ElephantEngine;
.super Lorg/bouncycastle/crypto/engines/AEADBaseEngine;


# instance fields
.field public ad:[B

.field public adOff:I

.field public adlen:I

.field public final buffer:[B

.field public current_mask:[B

.field public expanded_key:[B

.field public final instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

.field public nb_its:I

.field public next_mask:[B

.field public npub:[B

.field public previous_mask:[B

.field public final previous_outputMessage:[B

.field public final tag_buffer:[B


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/ElephantEngine$ElephantParameters;)V
    .locals 3

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;-><init>()V

    const/16 v0, 0x10

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    const/16 v1, 0xc

    iput v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/16 v1, 0x8

    if-eqz p1, :cond_2

    const/4 v2, 0x1

    if-eq p1, v2, :cond_1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    const/16 p1, 0x19

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-instance p1, Lorg/bouncycastle/crypto/engines/ElephantEngine$Delirium;

    const/4 v1, 0x0

    invoke-direct {p1, p0, v1}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Delirium;-><init>(Lorg/bouncycastle/crypto/engines/ElephantEngine;Lorg/bouncycastle/crypto/engines/ElephantEngine$1;)V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    const-string p1, "Elephant 200 AEAD"

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    iput v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Invalid parameter settings for Elephant"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    const/16 p1, 0x16

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-instance p1, Lorg/bouncycastle/crypto/engines/ElephantEngine$Jumbo;

    invoke-direct {p1, p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Jumbo;-><init>(Lorg/bouncycastle/crypto/engines/ElephantEngine;)V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    const-string p1, "Elephant 176 AEAD"

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    iput v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    goto :goto_0

    :cond_2
    const/16 p1, 0x14

    iput p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-instance p1, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;

    invoke-direct {p1, p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Dumbo;-><init>(Lorg/bouncycastle/crypto/engines/ElephantEngine;)V

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    iput v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    const-string p1, "Elephant 160 AEAD"

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    :goto_0
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-array v0, p1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    new-array v0, p1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_mask:[B

    new-array v0, p1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    new-array v0, p1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    new-array v0, p1, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    new-array p1, p1, [B

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;->Immediate:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;

    sget-object v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;->Stream:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;->Counter:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;

    invoke-virtual {p0, p1, v0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->setInnerMembers(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ProcessingBufferType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperatorType;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperatorType;)V

    return-void
.end method

.method private absorbAAD()V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processAADBytes([B)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;->permutation([B)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    return-void
.end method

.method private absorbCiphertext()V
    .locals 4

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_mask:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->xorTo(I[B[B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;->permutation([B)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_mask:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget-object v3, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v1, v2, v3}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->xorTo(I[B[B[B)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    invoke-static {v0, v1, v2}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    return-void
.end method

.method public static synthetic access$100(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    return-object p0
.end method

.method public static synthetic access$200(Lorg/bouncycastle/crypto/engines/ElephantEngine;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    return-object p0
.end method

.method public static synthetic access$300(Lorg/bouncycastle/crypto/engines/ElephantEngine;B)B
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->rotl(B)B

    move-result p0

    return p0
.end method

.method private computeCipherBlock([BII[BI)V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->npub:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    const/4 v3, 0x0

    invoke-static {v0, v3, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {v0, v1, v2, v3}, Ljava/util/Arrays;->fill([BIIB)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v1, v2, v4}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->xorTo(I[B[B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-interface {v0, v1}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;->permutation([B)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v1, v2, v4}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->xorTo(I[B[B[B)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {p3, p1, p2, v0}, Lorg/bouncycastle/util/Bytes;->xorTo(I[BI[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {p1, v3, p4, p5, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method private lfsr_step()V
    .locals 5

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;->lfsr_step()V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iget v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const/4 v3, 0x1

    sub-int/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v0, v3, v1, v4, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method private processAADBytes([B)V
    .locals 9

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v0, v4, :cond_3

    if-eq v0, v2, :cond_1

    const/4 v5, 0x5

    if-eq v0, v5, :cond_0

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->expanded_key:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iget v6, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {v0, v3, v5, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->npub:[B

    iget v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    invoke-static {v0, v3, p1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    sget-object v5, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecAad:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    goto :goto_1

    :cond_1
    iget v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    iget v5, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adlen:I

    if-ne v0, v5, :cond_2

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {p1, v3, v0, v3}, Ljava/util/Arrays;->fill([BIIB)V

    aput-byte v4, p1, v3

    return-void

    :cond_2
    :goto_0
    const/4 v0, 0x0

    goto :goto_2

    :cond_3
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->expanded_key:[B

    iget-object v5, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iget v6, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {v0, v3, v5, v3, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->npub:[B

    iget v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    invoke-static {v0, v3, p1, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    sget-object v5, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncAad:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    :goto_1
    iput-object v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    :goto_2
    iget v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    sub-int/2addr v5, v0

    iget v6, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adlen:I

    iget v7, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    sub-int/2addr v6, v7

    if-gt v5, v6, :cond_4

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->ad:[B

    invoke-static {v1, v7, p1, v0, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    add-int/2addr p1, v5

    iput p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    return-void

    :cond_4
    if-lez v6, :cond_5

    iget-object v8, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->ad:[B

    invoke-static {v8, v7, p1, v0, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v7, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    add-int/2addr v7, v6

    iput v7, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    :cond_5
    add-int/2addr v6, v0

    add-int/2addr v0, v5

    invoke-static {p1, v6, v0, v3}, Ljava/util/Arrays;->fill([BIIB)V

    aput-byte v4, p1, v6

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget p1, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    if-eq p1, v2, :cond_7

    if-eq p1, v1, :cond_6

    return-void

    :cond_6
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecData:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void

    :cond_7
    sget-object p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncData:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    return-void
.end method

.method private processBuffer([BI[BILorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V
    .locals 8

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecInit:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    if-eq v0, v1, :cond_0

    sget-object v1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncInit:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processFinalAAD()V

    :cond_1
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->lfsr_step()V

    iget v5, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v6, p3

    move v7, p4

    invoke-direct/range {v2 .. v7}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->computeCipherBlock([BII[BI)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->nb_its:I

    if-lez p1, :cond_2

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    iget p3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    const/4 p4, 0x0

    invoke-static {p1, p4, p2, p4, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->absorbCiphertext()V

    :cond_2
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    if-eq p1, p5, :cond_3

    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->absorbAAD()V

    :cond_3
    invoke-direct {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->swapMasks()V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->nb_its:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->nb_its:I

    return-void
.end method

.method private processBytes([B[BIIIIII)V
    .locals 16

    move-object/from16 v6, p0

    move/from16 v7, p5

    move/from16 v8, p7

    .line 0
    iget v0, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-array v9, v0, [B

    iget v0, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->nb_its:I

    const/4 v10, 0x0

    const/4 v1, 0x0

    move/from16 v11, p3

    move/from16 v14, p4

    move v12, v0

    const/4 v13, 0x0

    :goto_0
    if-ge v12, v14, :cond_8

    add-int/lit8 v0, v7, -0x1

    if-ne v12, v0, :cond_0

    iget v0, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    mul-int v0, v0, v12

    sub-int v0, v8, v0

    goto :goto_1

    :cond_0
    iget v0, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    :goto_1
    move v15, v0

    invoke-direct/range {p0 .. p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->lfsr_step()V

    if-ge v12, v7, :cond_2

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move v2, v13

    move v3, v15

    move-object/from16 v4, p2

    move v5, v11

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->computeCipherBlock([BII[BI)V

    iget-boolean v0, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    if-eqz v0, :cond_1

    iget-object v0, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v0, v10, v9, v10, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object/from16 v0, p1

    goto :goto_2

    :cond_1
    move-object/from16 v0, p1

    invoke-static {v0, v13, v9, v10, v15}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :goto_2
    add-int/2addr v11, v15

    add-int/2addr v13, v15

    goto :goto_3

    :cond_2
    move-object/from16 v0, p1

    :goto_3
    move/from16 v1, p6

    if-lez v12, :cond_6

    if-gt v12, v1, :cond_6

    add-int/lit8 v2, v12, -0x1

    iget v3, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    mul-int v2, v2, v3

    const/4 v4, 0x1

    if-ne v2, v8, :cond_3

    iget-object v2, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v2, v4, v3, v10}, Ljava/util/Arrays;->fill([BIIB)V

    iget-object v2, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    aput-byte v4, v2, v10

    goto :goto_4

    :cond_3
    sub-int v2, v8, v2

    if-gt v3, v2, :cond_4

    iget-object v2, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    iget-object v4, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v2, v10, v4, v10, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_4

    :cond_4
    if-lez v2, :cond_5

    iget-object v3, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    iget-object v5, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    invoke-static {v3, v10, v5, v10, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object v3, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    iget v5, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {v3, v2, v5, v10}, Ljava/util/Arrays;->fill([BIIB)V

    iget-object v3, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->buffer:[B

    aput-byte v4, v3, v2

    :cond_5
    :goto_4
    invoke-direct/range {p0 .. p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->absorbCiphertext()V

    :cond_6
    add-int/lit8 v12, v12, 0x1

    move/from16 v2, p8

    if-ge v12, v2, :cond_7

    invoke-direct/range {p0 .. p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->absorbAAD()V

    :cond_7
    invoke-direct/range {p0 .. p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->swapMasks()V

    iget-object v3, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    iget v4, v6, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {v9, v10, v3, v10, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto/16 :goto_0

    :cond_8
    iput v12, v6, Lorg/bouncycastle/crypto/engines/ElephantEngine;->nb_its:I

    return-void
.end method

.method private rotl(B)B
    .locals 1

    shl-int/lit8 v0, p1, 0x1

    and-int/lit16 p1, p1, 0xff

    ushr-int/lit8 p1, p1, 0x7

    or-int/2addr p1, v0

    int-to-byte p1, p1

    return p1
.end method

.method private swapMasks()V
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_mask:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iput-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_mask:[B

    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    iput-object v1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->current_mask:[B

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->next_mask:[B

    return-void
.end method

.method public static xorTo(I[B[B[B)V
    .locals 4

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_0

    .line 0
    aget-byte v1, p3, v0

    aget-byte v2, p1, v0

    aget-byte v3, p2, v0

    xor-int/2addr v2, v3

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public checkAAD()V
    .locals 4

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    .line 4
    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x7

    if-eq v0, v1, :cond_0

    return-void

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v3, " cannot process AAD when the length of the plaintext to be processed exceeds the a block size"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v3, " cannot be reused for encryption"

    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v3, " cannot process AAD when the length of the ciphertext to be processed exceeds the a block size"

    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public checkData(Z)Z
    .locals 2

    .line 0
    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget p1, p1, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " needs to be initialized"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    const/4 p1, 0x0

    return p1

    :pswitch_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " cannot be reused for encryption"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_2
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic doFinal([BI)I
    .locals 0

    .line 0
    invoke-super {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->doFinal([BI)I

    move-result p1

    return p1
.end method

.method public finishAAD(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;Z)V
    .locals 0

    .line 0
    invoke-virtual {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->finishAAD2(Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V

    return-void
.end method

.method public bridge synthetic getAlgorithmName()Ljava/lang/String;
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getAlgorithmName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getIVBytesSize()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getIVBytesSize()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getKeyBytesSize()I
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getKeyBytesSize()I

    move-result v0

    return v0
.end method

.method public bridge synthetic getMac()[B
    .locals 1

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->getMac()[B

    move-result-object v0

    return-object v0
.end method

.method public getOutputSize(I)I
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    .line 4
    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    .line 25
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v0

    .line 28
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr p1, v0

    .line 32
    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_0
    return v2

    .line 37
    :cond_1
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v0

    .line 40
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    add-int/2addr p1, v0

    return p1

    .line 44
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    new-instance v0, Ljava/lang/StringBuilder;

    .line 49
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v2, " needs call init function before getUpdateOutputSize"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getUpdateOutputSize(I)I
    .locals 3

    .line 2
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    .line 4
    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x0

    packed-switch v0, :pswitch_data_0

    .line 10
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr p1, v0

    .line 13
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr p1, v0

    .line 17
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    .line 21
    :pswitch_0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr v0, p1

    .line 24
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    sub-int/2addr v0, p1

    .line 28
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    .line 31
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    .line 33
    rem-int v0, p1, v0

    sub-int/2addr p1, v0

    return p1

    :pswitch_1
    return v1

    .line 38
    :pswitch_2
    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/2addr v0, p1

    .line 41
    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    .line 43
    rem-int p1, v0, p1

    sub-int/2addr v0, p1

    return v0

    .line 47
    :pswitch_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 49
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    iget-object v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->algorithmName:Ljava/lang/String;

    const-string v2, " needs call init function before getUpdateOutputSize"

    .line 0
    invoke-static {v0, v1, v2}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public bridge synthetic init(ZLorg/bouncycastle/crypto/CipherParameters;)V
    .locals 0

    .line 0
    invoke-super {p0, p1, p2}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->init(ZLorg/bouncycastle/crypto/CipherParameters;)V

    return-void
.end method

.method public init([B[B)V
    .locals 2

    .line 0
    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->npub:[B

    iget p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    new-array p2, p2, [B

    iput-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->expanded_key:[B

    const/4 v0, 0x0

    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->KEY_SIZE:I

    invoke-static {p1, v0, p2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->expanded_key:[B

    invoke-interface {p1, p2}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;->permutation([B)V

    return-void
.end method

.method public bridge synthetic processAADByte(B)V
    .locals 0

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processAADByte(B)V

    return-void
.end method

.method public bridge synthetic processAADBytes([BII)V
    .locals 0

    .line 0
    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processAADBytes([BII)V

    return-void
.end method

.method public processBufferAAD([BI)V
    .locals 0

    return-void
.end method

.method public processBufferDecrypt([BI[BI)V
    .locals 6

    .line 0
    sget-object v5, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->DecData:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processBuffer([BI[BILorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V

    iget-object p3, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    const/4 p4, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {p1, p2, p3, p4, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public processBufferEncrypt([BI[BI)V
    .locals 6

    .line 0
    sget-object v5, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->EncData:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processBuffer([BI[BILorg/bouncycastle/crypto/engines/AEADBaseEngine$State;)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    const/4 p2, 0x0

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    invoke-static {p3, p4, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public bridge synthetic processByte(B[BI)I
    .locals 0

    .line 0
    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processByte(B[BI)I

    move-result p1

    return p1
.end method

.method public bridge synthetic processBytes([BII[BI)I
    .locals 0

    .line 0
    invoke-super/range {p0 .. p5}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBytes([BII[BI)I

    move-result p1

    return p1
.end method

.method public processFinalAAD()V
    .locals 2

    .line 0
    iget v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    check-cast v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamAADOperator;

    invoke-virtual {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$StreamAADOperator;->getBytes()[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->ad:[B

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->getLen()I

    move-result v0

    iput v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adlen:I

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->aadOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADOperator;->reset()V

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_state:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;

    iget v0, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$State;->ord:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processAADBytes([B)V

    return-void
.end method

.method public processFinalBlock([BI)V
    .locals 12

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->dataOperator:Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;

    invoke-interface {v0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$DataOperator;->getLen()I

    move-result v0

    iget-boolean v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->forEncryption:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    iget v1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    :goto_0
    sub-int v10, v0, v1

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processFinalAAD()V

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    div-int v1, v10, v0

    add-int/lit8 v9, v1, 0x1

    rem-int v3, v10, v0

    if-eqz v3, :cond_1

    move v8, v9

    goto :goto_1

    :cond_1
    move v8, v1

    :goto_1
    iget v3, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->IV_SIZE:I

    iget v4, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adlen:I

    add-int/2addr v3, v4

    div-int/2addr v3, v0

    add-int/lit8 v11, v3, 0x1

    add-int/lit8 v1, v1, 0x2

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v7

    iget-object v4, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    move-object v3, p0

    move-object v5, p1

    move v6, p2

    invoke-direct/range {v3 .. v11}, Lorg/bouncycastle/crypto/engines/ElephantEngine;->processBytes([B[BIIIIII)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->expanded_key:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    invoke-static {p1, p2, v0}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->instance:Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    invoke-interface {p1, p2}, Lorg/bouncycastle/crypto/engines/ElephantEngine$Permutation;->permutation([B)V

    iget p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->BlockSize:I

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->expanded_key:[B

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    invoke-static {p1, p2, v0}, Lorg/bouncycastle/util/Bytes;->xorTo(I[B[B)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    iget-object p2, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->mac:[B

    iget v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->MAC_SIZE:I

    invoke-static {p1, v2, p2, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public bridge synthetic reset()V
    .locals 0

    .line 0
    invoke-super {p0}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset()V

    return-void
.end method

.method public reset(Z)V
    .locals 1

    .line 0
    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->reset(Z)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->tag_buffer:[B

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([BB)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->previous_outputMessage:[B

    invoke-static {p1, v0}, Ljava/util/Arrays;->fill([BB)V

    iput v0, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->nb_its:I

    const/4 p1, -0x1

    iput p1, p0, Lorg/bouncycastle/crypto/engines/ElephantEngine;->adOff:I

    return-void
.end method
