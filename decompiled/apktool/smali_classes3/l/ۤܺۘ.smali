.class public final Ll/ۤܺۘ;
.super Ljava/lang/Object;
.source "67UW"

# interfaces
.implements Ll/ۡ᩷ۘ;


# static fields
.field public static ܿ:Ljava/math/BigInteger;

.field public static ᩳ:Ljava/math/BigInteger;


# instance fields
.field public ֫:[B

.field public ۧ:Ljavax/crypto/KeyAgreement;

.field public ܽ:Ljava/security/interfaces/ECPublicKey;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 75
    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v0, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v1

    sput-object v1, Ll/ۤܺۘ;->ܿ:Ljava/math/BigInteger;

    .line 76
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Ll/ۤܺۘ;->ᩳ:Ljava/math/BigInteger;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getQ()[B
    .locals 1

    .line 61
    iget-object v0, p0, Ll/ۤܺۘ;->֫:[B

    return-object v0
.end method

.method public final ֫(I)V
    .locals 10

    const-string v0, "ECDH"

    .line 49
    invoke-static {v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object v0

    iput-object v0, p0, Ll/ۤܺۘ;->ۧ:Ljavax/crypto/KeyAgreement;

    .line 50
    new-instance v0, Ll/ᩴۖۘ;

    invoke-direct {v0}, Ll/ᩴۖۘ;-><init>()V

    const/16 v1, 0x209

    const/16 v2, 0x180

    const/16 v3, 0x100

    if-ne p1, v3, :cond_0

    const-string v4, "secp256r1"

    goto :goto_0

    :cond_0
    if-ne p1, v2, :cond_1

    const-string v4, "secp384r1"

    goto :goto_0

    :cond_1
    if-ne p1, v1, :cond_8

    const-string v4, "secp521r1"

    :goto_0
    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_1
    const/16 v7, 0x3e8

    if-ge v6, v7, :cond_6

    const-string v7, "EC"

    .line 59
    invoke-static {v7}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v7

    .line 60
    new-instance v8, Ljava/security/spec/ECGenParameterSpec;

    invoke-direct {v8, v4}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    .line 61
    invoke-virtual {v7, v8}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 62
    invoke-virtual {v7}, Ljava/security/KeyPairGenerator;->genKeyPair()Ljava/security/KeyPair;

    move-result-object v7

    .line 63
    invoke-virtual {v7}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v8

    check-cast v8, Ljava/security/interfaces/ECPrivateKey;

    iput-object v8, v0, Ll/ᩴۖۘ;->ۧ:Ljava/security/interfaces/ECPrivateKey;

    .line 64
    invoke-virtual {v7}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v7

    check-cast v7, Ljava/security/interfaces/ECPublicKey;

    iput-object v7, v0, Ll/ᩴۖۘ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    .line 65
    invoke-interface {v7}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    .line 66
    iget-object v7, v0, Ll/ᩴۖۘ;->ۧ:Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v7}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v7}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v7

    iput-object v7, v0, Ll/ᩴۖۘ;->֫:[B

    .line 67
    iget-object v7, v0, Ll/ᩴۖۘ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v7}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v7

    .line 68
    invoke-virtual {v7}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v8

    invoke-virtual {v8}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v8

    iput-object v8, v0, Ll/ᩴۖۘ;->ᩳ:[B

    .line 69
    invoke-virtual {v7}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v7}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object v7

    iput-object v7, v0, Ll/ᩴۖۘ;->ܿ:[B

    .line 71
    iget-object v8, v0, Ll/ᩴۖۘ;->ᩳ:[B

    array-length v9, v8

    array-length v7, v7

    if-eq v9, v7, :cond_2

    goto :goto_2

    :cond_2
    if-ne p1, v3, :cond_3

    .line 73
    array-length v7, v8

    const/16 v9, 0x20

    if-ne v7, v9, :cond_3

    goto :goto_3

    :cond_3
    if-ne p1, v2, :cond_4

    .line 75
    array-length v7, v8

    const/16 v9, 0x30

    if-ne v7, v9, :cond_4

    goto :goto_3

    :cond_4
    if-ne p1, v1, :cond_5

    .line 77
    array-length v7, v8

    const/16 v8, 0x42

    if-ne v7, v8, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 80
    :cond_6
    :goto_3
    iget-object p1, v0, Ll/ᩴۖۘ;->֫:[B

    array-length v1, p1

    iget-object v2, v0, Ll/ᩴۖۘ;->ᩳ:[B

    array-length v2, v2

    const/4 v3, 0x1

    if-ge v1, v2, :cond_7

    .line 110
    array-length v1, p1

    add-int/2addr v1, v3

    new-array v1, v1, [B

    .line 111
    array-length v2, p1

    invoke-static {p1, v5, v1, v3, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 112
    invoke-static {p1}, Ll/ܳۘۘ;->֫([B)V

    .line 81
    iput-object v1, v0, Ll/ᩴۖۘ;->֫:[B

    .line 101
    :cond_7
    iget-object p1, v0, Ll/ᩴۖۘ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    .line 52
    iput-object p1, p0, Ll/ۤܺۘ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    .line 92
    iget-object p1, v0, Ll/ᩴۖۘ;->ᩳ:[B

    .line 97
    iget-object v1, v0, Ll/ᩴۖۘ;->ܿ:[B

    .line 126
    array-length v2, p1

    add-int/2addr v2, v3

    array-length v4, v1

    add-int/2addr v2, v4

    new-array v2, v2, [B

    const/4 v4, 0x4

    .line 127
    aput-byte v4, v2, v5

    .line 128
    array-length v4, p1

    invoke-static {p1, v5, v2, v3, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 129
    array-length p1, p1

    add-int/2addr p1, v3

    array-length v3, v1

    invoke-static {v1, v5, v2, p1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 55
    iput-object v2, p0, Ll/ۤܺۘ;->֫:[B

    .line 56
    iget-object p1, p0, Ll/ۤܺۘ;->ۧ:Ljavax/crypto/KeyAgreement;

    .line 105
    iget-object v0, v0, Ll/ᩴۖۘ;->ۧ:Ljava/security/interfaces/ECPrivateKey;

    .line 56
    invoke-virtual {p1, v0}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V

    return-void

    :cond_8
    new-instance v0, Ll/۫᩷ۘ;

    const-string v1, "unsupported key size: "

    .line 0
    invoke-static {p1, v1}, Ll/᩵ۡ᩷;->֫(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 39
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 56
    throw v0
.end method

.method public final ֫([B[B)[B
    .locals 4

    const-string v0, "EC"

    .line 67
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    .line 68
    new-instance v1, Ljava/security/spec/ECPoint;

    new-instance v2, Ljava/math/BigInteger;

    const/4 v3, 0x1

    invoke-direct {v2, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v3, p2}, Ljava/math/BigInteger;-><init>(I[B)V

    invoke-direct {v1, v2, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 69
    new-instance p1, Ljava/security/spec/ECPublicKeySpec;

    iget-object p2, p0, Ll/ۤܺۘ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {p2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object p2

    invoke-direct {p1, v1, p2}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 70
    invoke-virtual {v0, p1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    .line 71
    iget-object p2, p0, Ll/ۤܺۘ;->ۧ:Ljavax/crypto/KeyAgreement;

    invoke-virtual {p2, p1, v3}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;

    .line 72
    iget-object p1, p0, Ll/ۤܺۘ;->ۧ:Ljavax/crypto/KeyAgreement;

    invoke-virtual {p1}, Ljavax/crypto/KeyAgreement;->generateSecret()[B

    move-result-object p1

    return-object p1
.end method

.method public final ۧ([B[B)Z
    .locals 6

    .line 83
    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 84
    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v1, p2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 88
    new-instance p2, Ljava/security/spec/ECPoint;

    invoke-direct {p2, v0, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 89
    sget-object v2, Ljava/security/spec/ECPoint;->POINT_INFINITY:Ljava/security/spec/ECPoint;

    invoke-virtual {p2, v2}, Ljava/security/spec/ECPoint;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    return v2

    .line 99
    :cond_0
    iget-object p2, p0, Ll/ۤܺۘ;->ܽ:Ljava/security/interfaces/ECPublicKey;

    invoke-interface {p2}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object p2

    .line 100
    invoke-virtual {p2}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object p2

    .line 101
    invoke-virtual {p2}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v3

    check-cast v3, Ljava/security/spec/ECFieldFp;

    invoke-virtual {v3}, Ljava/security/spec/ECFieldFp;->getP()Ljava/math/BigInteger;

    move-result-object v3

    .line 104
    sget-object v4, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    .line 105
    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v5

    if-gtz v5, :cond_3

    invoke-virtual {p1, v4}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    move-result v4

    if-lez v4, :cond_1

    goto :goto_0

    .line 110
    :cond_1
    invoke-virtual {p2}, Ljava/security/spec/EllipticCurve;->getA()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {p2}, Ljava/security/spec/EllipticCurve;->getB()Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {v4, p2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    sget-object v4, Ll/ۤܺۘ;->ᩳ:Ljava/math/BigInteger;

    invoke-virtual {v0, v4, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p2, v3}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    .line 111
    sget-object v0, Ll/ۤܺۘ;->ܿ:Ljava/math/BigInteger;

    invoke-virtual {p1, v0, v3}, Ljava/math/BigInteger;->modPow(Ljava/math/BigInteger;Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p1

    .line 112
    invoke-virtual {p1, p2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v1

    :cond_3
    :goto_0
    return v2
.end method
