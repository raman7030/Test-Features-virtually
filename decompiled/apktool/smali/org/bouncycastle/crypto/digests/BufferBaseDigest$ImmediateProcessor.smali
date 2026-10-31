.class public Lorg/bouncycastle/crypto/digests/BufferBaseDigest$ImmediateProcessor;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/digests/BufferBaseDigest$ProcessingBuffer;


# instance fields
.field public final synthetic this$0:Lorg/bouncycastle/crypto/digests/BufferBaseDigest;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/crypto/digests/BufferBaseDigest;)V
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest$ImmediateProcessor;->this$0:Lorg/bouncycastle/crypto/digests/BufferBaseDigest;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lorg/bouncycastle/crypto/digests/BufferBaseDigest;Lorg/bouncycastle/crypto/digests/BufferBaseDigest$1;)V
    .locals 0

    .line 0
    invoke-direct {p0, p1}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest$ImmediateProcessor;-><init>(Lorg/bouncycastle/crypto/digests/BufferBaseDigest;)V

    return-void
.end method


# virtual methods
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

.method public update(B)V
    .locals 3

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest$ImmediateProcessor;->this$0:Lorg/bouncycastle/crypto/digests/BufferBaseDigest;

    iget-object v1, v0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->m_buf:[B

    iget v2, v0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->m_bufPos:I

    aput-byte p1, v1, v2

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->m_bufPos:I

    iget p1, v0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->BlockSize:I

    if-ne v2, p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->processBytes([BI)V

    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest$ImmediateProcessor;->this$0:Lorg/bouncycastle/crypto/digests/BufferBaseDigest;

    iput p1, v0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->m_bufPos:I

    :cond_0
    return-void
.end method
