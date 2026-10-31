.class public final Lorg/bouncycastle/jcajce/provider/asymmetric/util/BaseCipherSpi$ErasableOutputStream;
.super Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public erase()V
    .locals 2

    .line 0
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lorg/bouncycastle/util/Arrays;->fill([BB)V

    invoke-virtual {p0}, Ljava/io/ByteArrayOutputStream;->reset()V

    return-void
.end method

.method public getBuf()[B
    .locals 1

    .line 0
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    return-object v0
.end method
