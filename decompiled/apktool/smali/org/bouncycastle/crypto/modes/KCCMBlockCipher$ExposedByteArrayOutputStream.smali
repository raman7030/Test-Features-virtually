.class public Lorg/bouncycastle/crypto/modes/KCCMBlockCipher$ExposedByteArrayOutputStream;
.super Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public getBuffer()[B
    .locals 1

    .line 0
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    return-object v0
.end method
