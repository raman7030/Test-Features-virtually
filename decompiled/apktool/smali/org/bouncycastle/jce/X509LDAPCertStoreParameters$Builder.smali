.class public Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
.super Ljava/lang/Object;


# instance fields
.field public aACertificateAttribute:Ljava/lang/String;

.field public aACertificateSubjectAttributeName:Ljava/lang/String;

.field public attributeAuthorityRevocationListAttribute:Ljava/lang/String;

.field public attributeAuthorityRevocationListIssuerAttributeName:Ljava/lang/String;

.field public attributeCertificateAttributeAttribute:Ljava/lang/String;

.field public attributeCertificateAttributeSubjectAttributeName:Ljava/lang/String;

.field public attributeCertificateRevocationListAttribute:Ljava/lang/String;

.field public attributeCertificateRevocationListIssuerAttributeName:Ljava/lang/String;

.field public attributeDescriptorCertificateAttribute:Ljava/lang/String;

.field public attributeDescriptorCertificateSubjectAttributeName:Ljava/lang/String;

.field public authorityRevocationListAttribute:Ljava/lang/String;

.field public authorityRevocationListIssuerAttributeName:Ljava/lang/String;

.field public baseDN:Ljava/lang/String;

.field public cACertificateAttribute:Ljava/lang/String;

.field public cACertificateSubjectAttributeName:Ljava/lang/String;

.field public certificateRevocationListAttribute:Ljava/lang/String;

.field public certificateRevocationListIssuerAttributeName:Ljava/lang/String;

.field public crossCertificateAttribute:Ljava/lang/String;

.field public crossCertificateSubjectAttributeName:Ljava/lang/String;

.field public deltaRevocationListAttribute:Ljava/lang/String;

.field public deltaRevocationListIssuerAttributeName:Ljava/lang/String;

.field public ldapAACertificateAttributeName:Ljava/lang/String;

.field public ldapAttributeAuthorityRevocationListAttributeName:Ljava/lang/String;

.field public ldapAttributeCertificateAttributeAttributeName:Ljava/lang/String;

.field public ldapAttributeCertificateRevocationListAttributeName:Ljava/lang/String;

.field public ldapAttributeDescriptorCertificateAttributeName:Ljava/lang/String;

.field public ldapAuthorityRevocationListAttributeName:Ljava/lang/String;

.field public ldapCACertificateAttributeName:Ljava/lang/String;

.field public ldapCertificateRevocationListAttributeName:Ljava/lang/String;

.field public ldapCrossCertificateAttributeName:Ljava/lang/String;

.field public ldapDeltaRevocationListAttributeName:Ljava/lang/String;

.field public ldapURL:Ljava/lang/String;

.field public ldapUserCertificateAttributeName:Ljava/lang/String;

.field public searchForSerialNumberIn:Ljava/lang/String;

.field public userCertificateAttribute:Ljava/lang/String;

.field public userCertificateSubjectAttributeName:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "ldap://localhost:389"

    const-string v1, ""

    .line 0
    invoke-direct {p0, v0, v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapURL:Ljava/lang/String;

    if-nez p2, :cond_0

    const-string p1, ""

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->baseDN:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->baseDN:Ljava/lang/String;

    :goto_0
    const-string p1, "userCertificate"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateAttribute:Ljava/lang/String;

    const-string p1, "cACertificate"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateAttribute:Ljava/lang/String;

    const-string p1, "crossCertificatePair"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateAttribute:Ljava/lang/String;

    const-string p1, "certificateRevocationList"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListAttribute:Ljava/lang/String;

    const-string p1, "deltaRevocationList"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListAttribute:Ljava/lang/String;

    const-string p1, "authorityRevocationList"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListAttribute:Ljava/lang/String;

    const-string p1, "attributeCertificateAttribute"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeAttribute:Ljava/lang/String;

    const-string p1, "aACertificate"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateAttribute:Ljava/lang/String;

    const-string p1, "attributeDescriptorCertificate"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateAttribute:Ljava/lang/String;

    const-string p1, "attributeCertificateRevocationList"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListAttribute:Ljava/lang/String;

    const-string p1, "attributeAuthorityRevocationList"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListAttribute:Ljava/lang/String;

    const-string p1, "cn"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapUserCertificateAttributeName:Ljava/lang/String;

    const-string p2, "cn ou o"

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCACertificateAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCrossCertificateAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCertificateRevocationListAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapDeltaRevocationListAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAuthorityRevocationListAttributeName:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateAttributeAttributeName:Ljava/lang/String;

    const-string p2, "cn o ou"

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAACertificateAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeDescriptorCertificateAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateRevocationListAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeAuthorityRevocationListAttributeName:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateSubjectAttributeName:Ljava/lang/String;

    const-string p2, "o ou"

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateSubjectAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateSubjectAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListIssuerAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListIssuerAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListIssuerAttributeName:Ljava/lang/String;

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeSubjectAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateSubjectAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateSubjectAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListIssuerAttributeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListIssuerAttributeName:Ljava/lang/String;

    const-string p1, "uid serialNumber cn"

    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->searchForSerialNumberIn:Ljava/lang/String;

    return-void
.end method

.method public static synthetic access$100(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapURL:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1000(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1100(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1200(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1300(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1400(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapUserCertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1500(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCACertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1600(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCrossCertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1700(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCertificateRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1800(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapDeltaRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$1900(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAuthorityRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$200(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->baseDN:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2000(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateAttributeAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2100(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAACertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2200(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeDescriptorCertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2300(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2400(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeAuthorityRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2500(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2600(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2700(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2800(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$2900(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$300(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3000(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3100(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3200(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3300(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3400(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3500(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$3600(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->searchForSerialNumberIn:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$400(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$500(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$600(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$700(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$800(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic access$900(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeAttribute:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public build()Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;
    .locals 2

    .line 0
    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapUserCertificateAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCACertificateAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCrossCertificateAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCertificateRevocationListAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapDeltaRevocationListAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAuthorityRevocationListAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateAttributeAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAACertificateAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeDescriptorCertificateAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateRevocationListAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeAuthorityRevocationListAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateSubjectAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateSubjectAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateSubjectAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListIssuerAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListIssuerAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListIssuerAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeSubjectAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateSubjectAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateSubjectAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListIssuerAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListIssuerAttributeName:Ljava/lang/String;

    if-eqz v0, :cond_0

    new-instance v0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters;-><init>(Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$1;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Necessary parameters not specified."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public setAACertificateAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setAACertificateSubjectAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->aACertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeAuthorityRevocationListAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeAuthorityRevocationListIssuerAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeAuthorityRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeCertificateAttributeAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeCertificateAttributeSubjectAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateAttributeSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeCertificateRevocationListAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeCertificateRevocationListIssuerAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeCertificateRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeDescriptorCertificateAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setAttributeDescriptorCertificateSubjectAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->attributeDescriptorCertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setAuthorityRevocationListAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setAuthorityRevocationListIssuerAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->authorityRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setCACertificateAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setCACertificateSubjectAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->cACertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setCertificateRevocationListAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setCertificateRevocationListIssuerAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->certificateRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setCrossCertificateAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setCrossCertificateSubjectAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->crossCertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setDeltaRevocationListAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setDeltaRevocationListIssuerAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->deltaRevocationListIssuerAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapAACertificateAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAACertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapAttributeAuthorityRevocationListAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeAuthorityRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapAttributeCertificateAttributeAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateAttributeAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapAttributeCertificateRevocationListAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeCertificateRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapAttributeDescriptorCertificateAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAttributeDescriptorCertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapAuthorityRevocationListAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapAuthorityRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapCACertificateAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCACertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapCertificateRevocationListAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCertificateRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapCrossCertificateAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapCrossCertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapDeltaRevocationListAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapDeltaRevocationListAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setLdapUserCertificateAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->ldapUserCertificateAttributeName:Ljava/lang/String;

    return-object p0
.end method

.method public setSearchForSerialNumberIn(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->searchForSerialNumberIn:Ljava/lang/String;

    return-object p0
.end method

.method public setUserCertificateAttribute(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateAttribute:Ljava/lang/String;

    return-object p0
.end method

.method public setUserCertificateSubjectAttributeName(Ljava/lang/String;)Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;
    .locals 0

    .line 0
    iput-object p1, p0, Lorg/bouncycastle/jce/X509LDAPCertStoreParameters$Builder;->userCertificateSubjectAttributeName:Ljava/lang/String;

    return-object p0
.end method
