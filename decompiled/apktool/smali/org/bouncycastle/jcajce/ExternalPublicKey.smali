.class public Lorg/bouncycastle/jcajce/ExternalPublicKey;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/security/PublicKey;


# instance fields
.field public final digest:[B

.field public final digestAlg:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

.field public final location:Lorg/bouncycastle/asn1/x509/GeneralName;


# direct methods
.method public constructor <init>(Ljava/security/PublicKey;Lorg/bouncycastle/asn1/x509/GeneralName;Ljava/security/MessageDigest;)V
    .locals 1

    .line 0
    invoke-virtual {p3}, Ljava/security/MessageDigest;->getAlgorithm()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lorg/bouncycastle/jcajce/util/MessageDigestUtils;->getDigestAlgID(Ljava/lang/String;)Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v0

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    invoke-direct {p0, p2, v0, p1}, Lorg/bouncycastle/jcajce/ExternalPublicKey;-><init>(Lorg/bouncycastle/asn1/x509/GeneralName;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/bc/ExternalValue;)V
    .locals 2

    .line 0
    invoke-virtual {p1}, Lorg/bouncycastle/asn1/bc/ExternalValue;->getLocation()Lorg/bouncycastle/asn1/x509/GeneralName;

    move-result-object v0

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/bc/ExternalValue;->getHashAlg()Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    move-result-object v1

    invoke-virtual {p1}, Lorg/bouncycastle/asn1/bc/ExternalValue;->getHashValue()[B

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lorg/bouncycastle/jcajce/ExternalPublicKey;-><init>(Lorg/bouncycastle/asn1/x509/GeneralName;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    return-void
.end method

.method public constructor <init>(Lorg/bouncycastle/asn1/x509/GeneralName;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jcajce/ExternalPublicKey;->location:Lorg/bouncycastle/asn1/x509/GeneralName;

    iput-object p2, p0, Lorg/bouncycastle/jcajce/ExternalPublicKey;->digestAlg:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    invoke-static {p3}, Lorg/bouncycastle/util/Arrays;->clone([B)[B

    move-result-object p1

    iput-object p1, p0, Lorg/bouncycastle/jcajce/ExternalPublicKey;->digest:[B

    return-void
.end method


# virtual methods
.method public getAlgorithm()Ljava/lang/String;
    .locals 1

    const-string v0, "ExternalKey"

    return-object v0
.end method

.method public getEncoded()[B
    .locals 6

    .line 2
    :try_start_0
    new-instance v0, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;

    .line 4
    new-instance v1, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 6
    sget-object v2, Lorg/bouncycastle/asn1/bc/BCObjectIdentifiers;->external_value:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    .line 9
    invoke-direct {v1, v2}, Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)V

    .line 11
    new-instance v2, Lorg/bouncycastle/asn1/bc/ExternalValue;

    .line 13
    iget-object v3, p0, Lorg/bouncycastle/jcajce/ExternalPublicKey;->location:Lorg/bouncycastle/asn1/x509/GeneralName;

    .line 15
    iget-object v4, p0, Lorg/bouncycastle/jcajce/ExternalPublicKey;->digestAlg:Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;

    .line 17
    iget-object v5, p0, Lorg/bouncycastle/jcajce/ExternalPublicKey;->digest:[B

    .line 20
    invoke-direct {v2, v3, v4, v5}, Lorg/bouncycastle/asn1/bc/ExternalValue;-><init>(Lorg/bouncycastle/asn1/x509/GeneralName;Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;[B)V

    .line 23
    invoke-direct {v0, v1, v2}, Lorg/bouncycastle/asn1/x509/SubjectPublicKeyInfo;-><init>(Lorg/bouncycastle/asn1/x509/AlgorithmIdentifier;Lorg/bouncycastle/asn1/ASN1Encodable;)V

    const-string v1, "DER"

    .line 28
    invoke-virtual {v0, v1}, Lorg/bouncycastle/asn1/ASN1Object;->getEncoded(Ljava/lang/String;)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 33
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "unable to encode composite key: "

    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {v0, v2}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public getFormat()Ljava/lang/String;
    .locals 1

    const-string v0, "X.509"

    return-object v0
.end method
