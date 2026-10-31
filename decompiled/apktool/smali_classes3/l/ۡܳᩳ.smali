.class public Ll/ۡܳᩳ;
.super Ljava/security/cert/X509Certificate;
.source "IB8N"


# static fields
.field public static final serialVersionUID:J = 0x1L


# instance fields
.field public final ᩸:Ljava/security/cert/X509Certificate;


# direct methods
.method public constructor <init>(Ljava/security/cert/X509Certificate;)V
    .locals 0

    .line 54
    invoke-direct {p0}, Ljava/security/cert/X509Certificate;-><init>()V

    .line 55
    iput-object p1, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    return-void
.end method


# virtual methods
.method public final checkValidity()V
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->checkValidity()V

    return-void
.end method

.method public final checkValidity(Ljava/util/Date;)V
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1}, Ljava/security/cert/X509Certificate;->checkValidity(Ljava/util/Date;)V

    return-void
.end method

.method public final getBasicConstraints()I
    .locals 1

    .line 162
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getBasicConstraints()I

    move-result v0

    return v0
.end method

.method public final getCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-interface {v0}, Ljava/security/cert/X509Extension;->getCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getExtendedKeyUsage()Ljava/util/List;
    .locals 1

    .line 206
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getExtendedKeyUsage()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final getExtensionValue(Ljava/lang/String;)[B
    .locals 1

    .line 65
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-interface {v0, p1}, Ljava/security/cert/X509Extension;->getExtensionValue(Ljava/lang/String;)[B

    move-result-object p1

    return-object p1
.end method

.method public final getIssuerAlternativeNames()Ljava/util/Collection;
    .locals 1

    .line 216
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getIssuerDN()Ljava/security/Principal;
    .locals 1

    .line 102
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerDN()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public final getIssuerUniqueID()[Z
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerUniqueID()[Z

    move-result-object v0

    return-object v0
.end method

.method public final getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;
    .locals 1

    .line 196
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    return-object v0
.end method

.method public final getKeyUsage()[Z
    .locals 1

    .line 157
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getKeyUsage()[Z

    move-result-object v0

    return-object v0
.end method

.method public final getNonCriticalExtensionOIDs()Ljava/util/Set;
    .locals 1

    .line 70
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-interface {v0}, Ljava/security/cert/X509Extension;->getNonCriticalExtensionOIDs()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getNotAfter()Ljava/util/Date;
    .locals 1

    .line 117
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getNotAfter()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final getNotBefore()Ljava/util/Date;
    .locals 1

    .line 112
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getNotBefore()Ljava/util/Date;

    move-result-object v0

    return-object v0
.end method

.method public final getPublicKey()Ljava/security/PublicKey;
    .locals 1

    .line 191
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v0

    return-object v0
.end method

.method public final getSerialNumber()Ljava/math/BigInteger;
    .locals 1

    .line 97
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    return-object v0
.end method

.method public final getSigAlgName()Ljava/lang/String;
    .locals 1

    .line 132
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSigAlgOID()Ljava/lang/String;
    .locals 1

    .line 137
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSigAlgOID()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final getSigAlgParams()[B
    .locals 1

    .line 142
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSigAlgParams()[B

    move-result-object v0

    return-object v0
.end method

.method public final getSignature()[B
    .locals 1

    .line 127
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSignature()[B

    move-result-object v0

    return-object v0
.end method

.method public final getSubjectAlternativeNames()Ljava/util/Collection;
    .locals 1

    .line 211
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectAlternativeNames()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public final getSubjectDN()Ljava/security/Principal;
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    return-object v0
.end method

.method public final getSubjectUniqueID()[Z
    .locals 1

    .line 152
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectUniqueID()[Z

    move-result-object v0

    return-object v0
.end method

.method public final getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;
    .locals 1

    .line 201
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    return-object v0
.end method

.method public final getTBSCertificate()[B
    .locals 1

    .line 122
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getTBSCertificate()[B

    move-result-object v0

    return-object v0
.end method

.method public final getVersion()I
    .locals 1

    .line 92
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/security/cert/X509Certificate;->getVersion()I

    move-result v0

    return v0
.end method

.method public final hasUnsupportedCriticalExtension()Z
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-interface {v0}, Ljava/security/cert/X509Extension;->hasUnsupportedCriticalExtension()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 186
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final verify(Ljava/security/PublicKey;)V
    .locals 1

    .line 173
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;)V

    return-void
.end method

.method public final verify(Ljava/security/PublicKey;Ljava/lang/String;)V
    .locals 1

    .line 180
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, p2}, Ljava/security/cert/Certificate;->verify(Ljava/security/PublicKey;Ljava/lang/String;)V

    return-void
.end method

.method public final verify(Ljava/security/PublicKey;Ljava/security/Provider;)V
    .locals 1

    .line 223
    iget-object v0, p0, Ll/ۡܳᩳ;->᩸:Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, p2}, Ljava/security/cert/X509Certificate;->verify(Ljava/security/PublicKey;Ljava/security/Provider;)V

    return-void
.end method
