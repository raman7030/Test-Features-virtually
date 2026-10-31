.class public Lorg/bouncycastle/asn1/DEROctetStringParser;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/asn1/ASN1OctetStringParser;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public stream:Lorg/bouncycastle/asn1/DefiniteLengthInputStream;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/asn1/DefiniteLengthInputStream;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/asn1/DEROctetStringParser;->stream:Lorg/bouncycastle/asn1/DefiniteLengthInputStream;

    return-void
.end method


# virtual methods
.method public getLoadedObject()Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 2

    .line 0
    new-instance v0, Lorg/bouncycastle/asn1/DEROctetString;

    iget-object v1, p0, Lorg/bouncycastle/asn1/DEROctetStringParser;->stream:Lorg/bouncycastle/asn1/DefiniteLengthInputStream;

    invoke-virtual {v1}, Lorg/bouncycastle/asn1/DefiniteLengthInputStream;->toByteArray()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/DEROctetString;-><init>([B)V

    return-object v0
.end method

.method public getOctetStream()Ljava/io/InputStream;
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/asn1/DEROctetStringParser;->stream:Lorg/bouncycastle/asn1/DefiniteLengthInputStream;

    return-object v0
.end method

.method public toASN1Primitive()Lorg/bouncycastle/asn1/ASN1Primitive;
    .locals 4

    .line 3
    :try_start_0
    invoke-virtual {p0}, Lorg/bouncycastle/asn1/DEROctetStringParser;->getLoadedObject()Lorg/bouncycastle/asn1/ASN1Primitive;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 8
    new-instance v1, Lorg/bouncycastle/asn1/ASN1ParsingException;

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException converting stream to byte array: "

    .line 15
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lorg/bouncycastle/asn1/ASN1ParsingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
