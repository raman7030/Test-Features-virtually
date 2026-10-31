.class public final Ll/۬ۡۘ;
.super Ljava/lang/Object;
.source "37ZK"

# interfaces
.implements Ll/ܺۢۘ;


# instance fields
.field public ֫:[B

.field public ۧ:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;[B)V
    .locals 2

    const-string v0, "Ed25519"

    .line 71
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Ed448"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 72
    :cond_0
    new-instance p2, Ljava/security/NoSuchAlgorithmException;

    const-string v0, "invalid curve "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 76
    :cond_1
    :goto_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 77
    new-instance p1, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;-><init>([B)V

    .line 78
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;->generatePublicKey()Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;

    move-result-object p2

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/Ed25519PublicKeyParameters;->getEncoded()[B

    move-result-object p2

    iput-object p2, p0, Ll/۬ۡۘ;->ۧ:[B

    .line 79
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/Ed25519PrivateKeyParameters;->getEncoded()[B

    move-result-object p1

    iput-object p1, p0, Ll/۬ۡۘ;->֫:[B

    goto :goto_1

    .line 81
    :cond_2
    new-instance p1, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;

    invoke-direct {p1, p2}, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;-><init>([B)V

    .line 82
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;->generatePublicKey()Lorg/bouncycastle/crypto/params/Ed448PublicKeyParameters;

    move-result-object p2

    invoke-virtual {p2}, Lorg/bouncycastle/crypto/params/Ed448PublicKeyParameters;->getEncoded()[B

    move-result-object p2

    iput-object p2, p0, Ll/۬ۡۘ;->ۧ:[B

    .line 83
    invoke-virtual {p1}, Lorg/bouncycastle/crypto/params/Ed448PrivateKeyParameters;->getEncoded()[B

    move-result-object p1

    iput-object p1, p0, Ll/۬ۡۘ;->֫:[B

    .line 85
    :goto_1
    iget-object p1, p0, Ll/۬ۡۘ;->֫:[B

    array-length p1, p1

    return-void
.end method

.method public final ֫()[B
    .locals 1

    .line 66
    iget-object v0, p0, Ll/۬ۡۘ;->ۧ:[B

    return-object v0
.end method

.method public final ۧ()[B
    .locals 1

    .line 61
    iget-object v0, p0, Ll/۬ۡۘ;->֫:[B

    return-object v0
.end method
