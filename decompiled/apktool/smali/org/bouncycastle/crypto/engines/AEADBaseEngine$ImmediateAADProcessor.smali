.class public Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/engines/AEADBaseEngine$AADProcessingBuffer;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;Lorg/bouncycastle/crypto/engines/AEADBaseEngine$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;-><init>(Lorg/bouncycastle/crypto/engines/AEADBaseEngine;)V

    return-void
.end method


# virtual methods
.method public getUpdateOutputSize(I)I
    .locals 1

    const/4 v0, 0x0

    .line 0
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1
.end method

.method public isLengthExceedingBlockSize(II)Z
    .locals 0

    if-lt p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isLengthWithinAvailableSpace(II)Z
    .locals 0

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public processAADByte(B)V
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aad:[B

    iget v2, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    aput-byte p1, v1, v2

    iget p1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->AADBufferSize:I

    if-ne v3, p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processBufferAAD([BI)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iput p1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_aadPos:I

    :cond_0
    return-void
.end method

.method public processByte(B[BI)I
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->checkData(Z)Z

    iget-object v0, p0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine$ImmediateAADProcessor;->this$0:Lorg/bouncycastle/crypto/engines/AEADBaseEngine;

    iget-object v1, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_buf:[B

    iget v2, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->m_bufPos:I

    aput-byte p1, v1, v2

    invoke-virtual {v0, p2, p3}, Lorg/bouncycastle/crypto/engines/AEADBaseEngine;->processEncDecByte([BI)I

    move-result p1

    return p1
.end method
