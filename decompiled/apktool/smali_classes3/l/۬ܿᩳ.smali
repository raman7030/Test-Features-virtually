.class public abstract Ll/۬ܿᩳ;
.super Ljava/lang/Object;
.source "A1W4"


# static fields
.field public static final ۧ:Ljava/util/HashMap;


# instance fields
.field public ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 23
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ll/۬ܿᩳ;->ۧ:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ֫([B)Ll/۬ܿᩳ;
    .locals 3

    .line 106
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 107
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result p0

    if-eqz p0, :cond_0

    .line 16
    invoke-static {}, Ll/۠ܿᩳ;->֫()Ll/ܶܿᩳ;

    move-result-object p0

    return-object p0

    .line 110
    :cond_0
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object p0

    .line 111
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v1

    .line 112
    invoke-virtual {v0}, Ll/۬ۜܽ;->ۜۧ()[B

    move-result-object v0

    .line 113
    new-instance v2, Ll/ۗܿᩳ;

    invoke-direct {v2, v1, p0, v0}, Ll/ۗܿᩳ;-><init>([BLjava/lang/String;[B)V

    return-object v2
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 86
    invoke-virtual {p0}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ֡()V
    .locals 0

    return-void
.end method

.method public ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 144
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public ֫()V
    .locals 0

    return-void
.end method

.method public ۖ()Ljava/lang/String;
    .locals 1

    .line 132
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public abstract ۘ()Ljava/lang/String;
.end method

.method public abstract ۜ()[B
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    .line 47
    iget-object v0, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    return-object v0
.end method

.method public ۢ()Ljava/lang/String;
    .locals 1

    .line 136
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ۧ()V
    .locals 1

    .line 148
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ۧ(Ljava/lang/String;)V
    .locals 2

    .line 42
    iput-object p1, p0, Ll/۬ܿᩳ;->֫:Ljava/lang/String;

    .line 43
    sget-object v0, Ll/۬ܿᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public ܳ()Ljava/lang/String;
    .locals 1

    .line 140
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final ܺ()Ljava/security/PrivateKey;
    .locals 3

    .line 59
    invoke-virtual {p0}, Ll/۬ܿᩳ;->᩷()[B

    move-result-object v0

    .line 61
    :try_start_0
    new-instance v1, Ljavax/crypto/EncryptedPrivateKeyInfo;

    invoke-direct {v1, v0}, Ljavax/crypto/EncryptedPrivateKeyInfo;-><init>([B)V

    .line 62
    invoke-virtual {v1}, Ljavax/crypto/EncryptedPrivateKeyInfo;->getAlgName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    .line 63
    new-instance v2, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v2, v0}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    .line 64
    invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 66
    :catch_0
    new-instance v1, Ljava/security/spec/PKCS8EncodedKeySpec;

    invoke-direct {v1, v0}, Ljava/security/spec/PKCS8EncodedKeySpec;-><init>([B)V

    :try_start_1
    const-string v0, "RSA"

    .line 68
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0
    :try_end_1
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    :try_start_2
    const-string v0, "DSA"

    .line 71
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0
    :try_end_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_2 .. :try_end_2} :catch_2

    return-object v0

    :catch_2
    const-string v0, "EC"

    .line 73
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()[B
    .locals 2

    .line 90
    new-instance v0, Ll/ۤۜܽ;

    invoke-direct {v0}, Ll/ۤۜܽ;-><init>()V

    .line 16
    invoke-static {}, Ll/۠ܿᩳ;->֫()Ll/ܶܿᩳ;

    move-result-object v1

    if-ne p0, v1, :cond_0

    const/4 v1, 0x1

    .line 92
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Z)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 91
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeByte(I)V

    .line 95
    invoke-virtual {p0}, Ll/۬ܿᩳ;->ۘ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 96
    invoke-virtual {p0}, Ll/۬ܿᩳ;->ۜ()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ۧ([B)V

    .line 97
    invoke-virtual {p0}, Ll/۬ܿᩳ;->᩷()[B

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ۧ([B)V

    .line 99
    :goto_0
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    return-object v0
.end method

.method public ܿ()Ljava/lang/String;
    .locals 1

    .line 152
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ᩳ()[B
    .locals 1

    .line 156
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public ᩴ()Z
    .locals 1

    .line 0
    instance-of v0, p0, Ll/᩹ܿᩳ;

    return v0
.end method

.method public ᩵()V
    .locals 0

    return-void
.end method

.method public abstract ᩷()[B
.end method

.method public final ᩻()Ljava/security/cert/X509Certificate;
    .locals 3

    .line 52
    invoke-virtual {p0}, Ll/۬ܿᩳ;->ۜ()[B

    move-result-object v0

    const-string v1, "X.509"

    .line 53
    invoke-static {v1}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v1

    .line 54
    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v1, v2}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    return-object v0
.end method
