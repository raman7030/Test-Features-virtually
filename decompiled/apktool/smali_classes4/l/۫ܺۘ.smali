.class public final Ll/۫ܺۘ;
.super Ljava/lang/Object;
.source "I7XJ"

# interfaces
.implements Ll/ۘۜۘ;


# instance fields
.field public ֫:Ljava/math/BigInteger;

.field public ۧ:[B

.field public ܳ:Ljava/security/KeyPairGenerator;

.field public ܽ:Ljava/math/BigInteger;

.field public ܿ:Ljavax/crypto/KeyAgreement;

.field public ᩳ:Ljava/math/BigInteger;

.field public ᩻:Ljava/math/BigInteger;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final init()V
    .locals 2

    const-string v0, "DH"

    .line 52
    invoke-static {v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v1

    iput-object v1, p0, Ll/۫ܺۘ;->ܳ:Ljava/security/KeyPairGenerator;

    .line 53
    invoke-static {v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object v0

    iput-object v0, p0, Ll/۫ܺۘ;->ܿ:Ljavax/crypto/KeyAgreement;

    return-void
.end method

.method public final ֫([B)V
    .locals 2

    .line 85
    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 98
    iput-object v0, p0, Ll/۫ܺۘ;->ᩳ:Ljava/math/BigInteger;

    return-void
.end method

.method public final ֫()[B
    .locals 3

    .line 58
    iget-object v0, p0, Ll/۫ܺۘ;->֫:Ljava/math/BigInteger;

    if-nez v0, :cond_0

    .line 59
    new-instance v0, Ljavax/crypto/spec/DHParameterSpec;

    iget-object v1, p0, Ll/۫ܺۘ;->᩻:Ljava/math/BigInteger;

    iget-object v2, p0, Ll/۫ܺۘ;->ᩳ:Ljava/math/BigInteger;

    invoke-direct {v0, v1, v2}, Ljavax/crypto/spec/DHParameterSpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 60
    iget-object v1, p0, Ll/۫ܺۘ;->ܳ:Ljava/security/KeyPairGenerator;

    invoke-virtual {v1, v0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 61
    iget-object v0, p0, Ll/۫ܺۘ;->ܳ:Ljava/security/KeyPairGenerator;

    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    .line 62
    iget-object v1, p0, Ll/۫ܺۘ;->ܿ:Ljavax/crypto/KeyAgreement;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V

    .line 63
    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    check-cast v0, Ljavax/crypto/interfaces/DHPublicKey;

    invoke-interface {v0}, Ljavax/crypto/interfaces/DHPublicKey;->getY()Ljava/math/BigInteger;

    move-result-object v0

    iput-object v0, p0, Ll/۫ܺۘ;->֫:Ljava/math/BigInteger;

    .line 64
    invoke-virtual {v0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v0

    iput-object v0, p0, Ll/۫ܺۘ;->ۧ:[B

    .line 66
    :cond_0
    iget-object v0, p0, Ll/۫ܺۘ;->ۧ:[B

    return-object v0
.end method

.method public final ۧ([B)V
    .locals 2

    .line 90
    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 102
    iput-object v0, p0, Ll/۫ܺۘ;->ܽ:Ljava/math/BigInteger;

    return-void
.end method

.method public final ۧ()[B
    .locals 5

    const-string v0, "DH"

    .line 71
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 72
    new-instance v1, Ljavax/crypto/spec/DHPublicKeySpec;

    iget-object v2, p0, Ll/۫ܺۘ;->ܽ:Ljava/math/BigInteger;

    iget-object v3, p0, Ll/۫ܺۘ;->᩻:Ljava/math/BigInteger;

    iget-object v4, p0, Ll/۫ܺۘ;->ᩳ:Ljava/math/BigInteger;

    invoke-direct {v1, v2, v3, v4}, Ljavax/crypto/spec/DHPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 73
    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object v0

    .line 74
    iget-object v1, p0, Ll/۫ܺۘ;->ܿ:Ljavax/crypto/KeyAgreement;

    const/4 v2, 0x1

    invoke-virtual {v1, v0, v2}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;

    .line 75
    iget-object v0, p0, Ll/۫ܺۘ;->ܿ:Ljavax/crypto/KeyAgreement;

    invoke-virtual {v0}, Ljavax/crypto/KeyAgreement;->generateSecret()[B

    move-result-object v0

    return-object v0
.end method

.method public final ܽ([B)V
    .locals 2

    .line 80
    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 94
    iput-object v0, p0, Ll/۫ܺۘ;->᩻:Ljava/math/BigInteger;

    return-void
.end method
