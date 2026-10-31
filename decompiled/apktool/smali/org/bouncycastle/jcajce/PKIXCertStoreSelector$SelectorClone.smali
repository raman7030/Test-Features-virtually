.class public Lorg/bouncycastle/jcajce/PKIXCertStoreSelector$SelectorClone;
.super Ljava/security/cert/X509CertSelector;


# instance fields
.field public final selector:Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;


# direct methods
.method public constructor <init>(Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/security/cert/X509CertSelector;-><init>()V

    .line 5
    iput-object p1, p0, Lorg/bouncycastle/jcajce/PKIXCertStoreSelector$SelectorClone;->selector:Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;

    .line 8
    invoke-static {p1}, Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;->access$100(Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;)Ljava/security/cert/CertSelector;

    move-result-object v0

    .line 11
    instance-of v0, v0, Ljava/security/cert/X509CertSelector;

    if-eqz v0, :cond_0

    .line 16
    invoke-static {p1}, Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;->access$100(Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;)Ljava/security/cert/CertSelector;

    move-result-object p1

    .line 19
    check-cast p1, Ljava/security/cert/X509CertSelector;

    .line 22
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getAuthorityKeyIdentifier()[B

    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setAuthorityKeyIdentifier([B)V

    .line 29
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getBasicConstraints()I

    move-result v0

    .line 33
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setBasicConstraints(I)V

    .line 36
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getCertificate()Ljava/security/cert/X509Certificate;

    move-result-object v0

    .line 40
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setCertificate(Ljava/security/cert/X509Certificate;)V

    .line 43
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getCertificateValid()Ljava/util/Date;

    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setCertificateValid(Ljava/util/Date;)V

    .line 50
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getKeyUsage()[Z

    move-result-object v0

    .line 54
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setKeyUsage([Z)V

    .line 57
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getMatchAllSubjectAltNames()Z

    move-result v0

    .line 61
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setMatchAllSubjectAltNames(Z)V

    .line 64
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getPrivateKeyValid()Ljava/util/Date;

    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setPrivateKeyValid(Ljava/util/Date;)V

    .line 71
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    .line 75
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setSerialNumber(Ljava/math/BigInteger;)V

    .line 78
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectKeyIdentifier()[B

    move-result-object v0

    .line 82
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setSubjectKeyIdentifier([B)V

    .line 85
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    .line 89
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setSubjectPublicKey(Ljava/security/PublicKey;)V

    .line 92
    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getExtendedKeyUsage()Ljava/util/Set;

    move-result-object v0

    .line 96
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setExtendedKeyUsage(Ljava/util/Set;)V

    .line 99
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getIssuerAsBytes()[B

    move-result-object v0

    .line 103
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setIssuer([B)V

    .line 106
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getNameConstraints()[B

    move-result-object v0

    .line 110
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setNameConstraints([B)V

    .line 113
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getPathToNames()Ljava/util/Collection;

    move-result-object v0

    .line 117
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setPathToNames(Ljava/util/Collection;)V

    .line 120
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getPolicy()Ljava/util/Set;

    move-result-object v0

    .line 124
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setPolicy(Ljava/util/Set;)V

    .line 127
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAsBytes()[B

    move-result-object v0

    .line 131
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setSubject([B)V

    .line 134
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    .line 138
    invoke-virtual {p0, v0}, Ljava/security/cert/X509CertSelector;->setSubjectAlternativeNames(Ljava/util/Collection;)V

    .line 141
    invoke-virtual {p1}, Ljava/security/cert/X509CertSelector;->getSubjectPublicKeyAlgID()Ljava/lang/String;

    move-result-object p1

    .line 145
    invoke-virtual {p0, p1}, Ljava/security/cert/X509CertSelector;->setSubjectPublicKeyAlgID(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 149
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 151
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "base selector invalid: "

    .line 156
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 0
    invoke-static {p1, v1}, Ll/ۚۙܳ;->֫(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    return-void
.end method


# virtual methods
.method public match(Ljava/security/cert/Certificate;)Z
    .locals 1

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jcajce/PKIXCertStoreSelector$SelectorClone;->selector:Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-virtual {v0, p1}, Lorg/bouncycastle/jcajce/PKIXCertStoreSelector;->match(Ljava/security/cert/Certificate;)Z

    move-result p1

    return p1
.end method
