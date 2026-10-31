.class public abstract Lorg/bouncycastle/crypto/digests/AsconXofBase;
.super Lorg/bouncycastle/crypto/digests/AsconBaseDigest;

# interfaces
.implements Lorg/bouncycastle/crypto/Xof;


# instance fields
.field public final buffer:[B

.field public bytesInBuffer:I

.field public m_squeezing:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 0
    invoke-direct {p0}, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;-><init>()V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->BlockSize:I

    new-array v0, v0, [B

    iput-object v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->buffer:[B

    return-void
.end method

.method private ensureNoAbsorbWhileSqueezing(Z)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 0
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "attempt to absorb while squeezing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public doFinal([BII)I
    .locals 0

    .line 0
    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/AsconXofBase;->doOutput([BII)I

    move-result p1

    invoke-virtual {p0}, Lorg/bouncycastle/crypto/digests/AsconXofBase;->reset()V

    return p1
.end method

.method public doOutput([BII)I
    .locals 4

    .line 0
    invoke-virtual {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->ensureSufficientOutputBuffer([BII)V

    iget v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->bytesInBuffer:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v2, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->BlockSize:I

    sub-int/2addr v2, v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v3, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->buffer:[B

    invoke-static {v3, v2, p1, p2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v2, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->bytesInBuffer:I

    sub-int/2addr v2, v0

    iput v2, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->bytesInBuffer:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sub-int v2, p3, v0

    iget v3, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->BlockSize:I

    if-lt v2, v3, :cond_1

    rem-int v3, v2, v3

    sub-int/2addr v2, v3

    add-int v3, p2, v0

    invoke-virtual {p0, p1, v3, v2}, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->hash([BII)I

    move-result v2

    add-int/2addr v0, v2

    :cond_1
    if-ge v0, p3, :cond_2

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->buffer:[B

    iget v3, p0, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->BlockSize:I

    invoke-virtual {p0, v2, v1, v3}, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->hash([BII)I

    sub-int/2addr p3, v0

    iget-object v2, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->buffer:[B

    add-int/2addr p2, v0

    invoke-static {v2, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p1, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->buffer:[B

    array-length p1, p1

    sub-int/2addr p1, p3

    iput p1, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->bytesInBuffer:I

    add-int/2addr v0, p3

    :cond_2
    return v0
.end method

.method public padAndAbsorb()V
    .locals 2

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->m_squeezing:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->m_squeezing:Z

    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->padAndAbsorb()V

    return-void

    :cond_0
    iget-object v0, p0, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->p:Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;

    iget v1, p0, Lorg/bouncycastle/crypto/digests/AsconBaseDigest;->ASCON_PB_ROUNDS:I

    invoke-virtual {v0, v1}, Lorg/bouncycastle/crypto/engines/AsconPermutationFriend$AsconPermutation;->p(I)V

    return-void
.end method

.method public reset()V
    .locals 1

    const/4 v0, 0x0

    .line 0
    iput-boolean v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->m_squeezing:Z

    iput v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->bytesInBuffer:I

    invoke-super {p0}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->reset()V

    return-void
.end method

.method public update(B)V
    .locals 1

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->m_squeezing:Z

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/AsconXofBase;->ensureNoAbsorbWhileSqueezing(Z)V

    invoke-super {p0, p1}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->update(B)V

    return-void
.end method

.method public update([BII)V
    .locals 1

    .line 0
    iget-boolean v0, p0, Lorg/bouncycastle/crypto/digests/AsconXofBase;->m_squeezing:Z

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/digests/AsconXofBase;->ensureNoAbsorbWhileSqueezing(Z)V

    invoke-super {p0, p1, p2, p3}, Lorg/bouncycastle/crypto/digests/BufferBaseDigest;->update([BII)V

    return-void
.end method
