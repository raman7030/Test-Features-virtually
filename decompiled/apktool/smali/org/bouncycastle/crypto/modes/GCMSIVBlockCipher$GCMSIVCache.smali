.class public Lorg/bouncycastle/crypto/modes/GCMSIVBlockCipher$GCMSIVCache;
.super Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public clearBuffer()V
    .locals 2

    .line 0
    invoke-virtual {p0}, Lorg/bouncycastle/crypto/modes/GCMSIVBlockCipher$GCMSIVCache;->getBuffer()[B

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    return-void
.end method

.method public getBuffer()[B
    .locals 1

    .line 0
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    return-object v0
.end method
