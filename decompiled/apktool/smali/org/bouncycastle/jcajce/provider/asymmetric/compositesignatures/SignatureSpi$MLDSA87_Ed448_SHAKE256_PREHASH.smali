.class public final Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi$MLDSA87_Ed448_SHAKE256_PREHASH;
.super Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 0
    sget-object v0, Lorg/bouncycastle/internal/asn1/iana/IANAObjectIdentifiers;->id_MLDSA87_Ed448_SHAKE256:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    new-instance v1, Lorg/bouncycastle/crypto/digests/SHAKEDigest;

    const/16 v2, 0x100

    invoke-direct {v1, v2}, Lorg/bouncycastle/crypto/digests/SHAKEDigest;-><init>(I)V

    const/4 v2, 0x1

    invoke-direct {p0, v0, v1, v2}, Lorg/bouncycastle/jcajce/provider/asymmetric/compositesignatures/SignatureSpi;-><init>(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;Lorg/bouncycastle/crypto/Digest;Z)V

    return-void
.end method
