.class public Lorg/bouncycastle/asn1/ConstructedBitStream;
.super Ljava/io/InputStream;

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public _currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

.field public _currentStream:Ljava/io/InputStream;

.field public _first:Z

.field public final _octetAligned:Z

.field public _padBits:I

.field public final _parser:Lorg/bouncycastle/asn1/ASN1StreamParser;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/ASN1StreamParser;Z)V
    .locals 1

    .line 0
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_first:Z

    const/4 v0, 0x0

    iput v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    iput-object p1, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_parser:Lorg/bouncycastle/asn1/ASN1StreamParser;

    iput-boolean p2, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_octetAligned:Z

    return-void
.end method

.method private getNextParser()Lorg/bouncycastle/asn1/ASN1BitStringParser;
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_parser:Lorg/bouncycastle/asn1/ASN1StreamParser;

    invoke-virtual {v0}, Lorg/bouncycastle/asn1/ASN1StreamParser;->readObject()Lorg/bouncycastle/asn1/ASN1Encodable;

    move-result-object v0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_octetAligned:Z

    if-eqz v0, :cond_1

    iget v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "expected octet-aligned bitstring, but found padBits: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0

    :cond_2
    instance-of v1, v0, Lorg/bouncycastle/asn1/ASN1BitStringParser;

    if-eqz v1, :cond_4

    iget v1, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    if-nez v1, :cond_3

    check-cast v0, Lorg/bouncycastle/asn1/ASN1BitStringParser;

    return-object v0

    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "only the last nested bitstring can have padding"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unknown object encountered: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public getPadBits()I
    .locals 1

    .line 0
    iget v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    return v0
.end method

.method public read()I
    .locals 4

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    const/4 v1, -0x1

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_first:Z

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ConstructedBitStream;->getNextParser()Lorg/bouncycastle/asn1/ASN1BitStringParser;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

    if-nez v0, :cond_1

    return v1

    :cond_1
    const/4 v2, 0x0

    iput-boolean v2, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_first:Z

    const/4 v2, -0x1

    move-object v1, p0

    goto :goto_1

    :cond_2
    move-object v0, p0

    :goto_0
    iget-object v2, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ltz v2, :cond_3

    return v2

    :cond_3
    iget-object v2, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

    invoke-interface {v2}, Lorg/bouncycastle/asn1/ASN1BitStringParser;->getPadBits()I

    move-result v2

    iput v2, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ConstructedBitStream;->getNextParser()Lorg/bouncycastle/asn1/ASN1BitStringParser;

    move-result-object v2

    iput-object v2, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

    if-nez v2, :cond_4

    const/4 v2, 0x0

    iput-object v2, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    return v1

    :cond_4
    move v3, v1

    move-object v1, v0

    move-object v0, v2

    move v2, v3

    :goto_1
    invoke-interface {v0}, Lorg/bouncycastle/asn1/ASN1BitStringParser;->getBitStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, v1, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    move-object v0, v1

    move v1, v2

    goto :goto_0
.end method

.method public read([BII)I
    .locals 7

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_first:Z

    if-nez v0, :cond_0

    return v2

    :cond_0
    invoke-direct {p0}, Lorg/bouncycastle/asn1/ConstructedBitStream;->getNextParser()Lorg/bouncycastle/asn1/ASN1BitStringParser;

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

    if-nez v0, :cond_1

    return v2

    :cond_1
    iput-boolean v1, p0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_first:Z

    const/4 v2, 0x0

    const/4 v3, -0x1

    move-object v1, p0

    goto :goto_1

    :cond_2
    move-object v0, p0

    :cond_3
    :goto_0
    iget-object v3, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    add-int v4, p2, v1

    sub-int v5, p3, v1

    invoke-virtual {v3, p1, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-ltz v3, :cond_4

    add-int/2addr v1, v3

    if-ne v1, p3, :cond_3

    return v1

    :cond_4
    iget-object v3, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

    invoke-interface {v3}, Lorg/bouncycastle/asn1/ASN1BitStringParser;->getPadBits()I

    move-result v3

    iput v3, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_padBits:I

    invoke-direct {v0}, Lorg/bouncycastle/asn1/ConstructedBitStream;->getNextParser()Lorg/bouncycastle/asn1/ASN1BitStringParser;

    move-result-object v3

    iput-object v3, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentParser:Lorg/bouncycastle/asn1/ASN1BitStringParser;

    if-nez v3, :cond_6

    const/4 p1, 0x0

    iput-object p1, v0, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    const/4 p1, 0x1

    if-ge v1, p1, :cond_5

    return v2

    :cond_5
    return v1

    :cond_6
    move v6, v1

    move-object v1, v0

    move-object v0, v3

    move v3, v2

    move v2, v6

    :goto_1
    invoke-interface {v0}, Lorg/bouncycastle/asn1/ASN1BitStringParser;->getBitStream()Ljava/io/InputStream;

    move-result-object v0

    iput-object v0, v1, Lorg/bouncycastle/asn1/ConstructedBitStream;->_currentStream:Ljava/io/InputStream;

    move-object v0, v1

    move v1, v2

    move v2, v3

    goto :goto_0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
