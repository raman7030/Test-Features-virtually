.class public final Ll/᩹᩸ۘ;
.super Ljava/lang/Object;
.source "51RR"


# instance fields
.field public ֫:Ljava/security/KeyStore;

.field public ۧ:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    :try_start_0
    const-string v0, "KEYSTORE_SETTING"

    const/4 v1, 0x0

    .line 47
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Ll/᩹᩸ۘ;->ۧ:Landroid/content/SharedPreferences;

    const-string v1, "AndroidKeyStore"

    .line 49
    invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object v1

    iput-object v1, p0, Ll/᩹᩸ۘ;->֫:Ljava/security/KeyStore;

    const/4 v2, 0x0

    .line 50
    invoke-virtual {v1, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    const-string v2, "KEYSTORE_AES"

    .line 52
    invoke-virtual {v1, v2}, Ljava/security/KeyStore;->containsAlias(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, ""

    .line 152
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v2, "PREF_KEY_IV"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 54
    invoke-static {p1}, Ll/᩹᩸ۘ;->֫(Landroid/content/Context;)V

    .line 55
    invoke-direct {p0}, Ll/᩹᩸ۘ;->֫()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 58
    invoke-static {p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/Exception;)V

    return-void
.end method

.method private ֫()V
    .locals 6

    const/16 v0, 0x10

    new-array v0, v0, [B

    .line 127
    new-instance v1, Ljava/security/SecureRandom;

    invoke-direct {v1}, Ljava/security/SecureRandom;-><init>()V

    .line 128
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    const/16 v2, 0xc

    .line 131
    invoke-virtual {v1, v2}, Ljava/security/SecureRandom;->generateSeed(I)[B

    move-result-object v1

    const/4 v2, 0x0

    .line 132
    invoke-static {v1, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v1

    .line 152
    iget-object v3, p0, Ll/᩹᩸ۘ;->ۧ:Landroid/content/SharedPreferences;

    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    const-string v5, "PREF_KEY_IV"

    invoke-interface {v4, v5, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 137
    iget-object v1, p0, Ll/᩹᩸ۘ;->֫:Ljava/security/KeyStore;

    const-string v4, "KEYSTORE_AES"

    invoke-virtual {v1, v4}, Ljava/security/KeyStore;->getCertificate(Ljava/lang/String;)Ljava/security/cert/Certificate;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v1

    const-string v4, "RSA/ECB/PKCS1Padding"

    .line 139
    invoke-static {v4}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v4

    const/4 v5, 0x1

    .line 140
    invoke-virtual {v4, v5, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 142
    invoke-virtual {v4, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    .line 143
    invoke-static {v0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v0

    .line 160
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "PREF_KEY_AES"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    return-void
.end method

.method public static ֫(Landroid/content/Context;)V
    .locals 6

    .line 63
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Build.VERSION.SDK_INT="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "KEYSTORE"

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x17

    const-string v2, "KEYSTORE_AES"

    const-string v3, "AndroidKeyStore"

    const-string v4, "RSA"

    if-lt v1, v0, :cond_0

    .line 66
    invoke-static {v4, v3}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object p0

    .line 68
    new-instance v0, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    const/4 v1, 0x3

    invoke-direct {v0, v2, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    const-string v1, "SHA-256"

    const-string v2, "SHA-512"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    .line 70
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setDigests([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    const-string v1, "PKCS1Padding"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    .line 71
    invoke-virtual {v0, v1}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setEncryptionPaddings([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    move-result-object v0

    .line 74
    invoke-virtual {p0, v0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 75
    invoke-virtual {p0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    return-void

    .line 77
    :cond_0
    invoke-static {v4, v3}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    move-result-object v0

    .line 79
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    .line 80
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v3

    const/4 v4, 0x1

    const/16 v5, 0x1e

    .line 81
    invoke-virtual {v3, v4, v5}, Ljava/util/Calendar;->add(II)V

    .line 83
    new-instance v4, Landroid/security/KeyPairGeneratorSpec$Builder;

    invoke-direct {v4, p0}, Landroid/security/KeyPairGeneratorSpec$Builder;-><init>(Landroid/content/Context;)V

    .line 84
    invoke-virtual {v4, v2}, Landroid/security/KeyPairGeneratorSpec$Builder;->setAlias(Ljava/lang/String;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p0

    new-instance v2, Ljavax/security/auth/x500/X500Principal;

    const-string v4, "CN=KEYSTORE_AES"

    invoke-direct {v2, v4}, Ljavax/security/auth/x500/X500Principal;-><init>(Ljava/lang/String;)V

    .line 85
    invoke-virtual {p0, v2}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSubject(Ljavax/security/auth/x500/X500Principal;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p0

    sget-object v2, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    .line 86
    invoke-virtual {p0, v2}, Landroid/security/KeyPairGeneratorSpec$Builder;->setSerialNumber(Ljava/math/BigInteger;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p0

    .line 87
    invoke-virtual {v1}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setStartDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p0

    .line 88
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/security/KeyPairGeneratorSpec$Builder;->setEndDate(Ljava/util/Date;)Landroid/security/KeyPairGeneratorSpec$Builder;

    move-result-object p0

    .line 89
    invoke-virtual {p0}, Landroid/security/KeyPairGeneratorSpec$Builder;->build()Landroid/security/KeyPairGeneratorSpec;

    move-result-object p0

    .line 91
    invoke-virtual {v0, p0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 92
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    return-void
.end method

.method private ۧ()Ljavax/crypto/spec/SecretKeySpec;
    .locals 4

    const-string v0, "PREF_KEY_AES"

    const-string v1, ""

    .line 164
    iget-object v2, p0, Ll/᩹᩸ۘ;->ۧ:Landroid/content/SharedPreferences;

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "KEYSTORE_AES"

    const/4 v2, 0x0

    .line 167
    iget-object v3, p0, Ll/᩹᩸ۘ;->֫:Ljava/security/KeyStore;

    invoke-virtual {v3, v1, v2}, Ljava/security/KeyStore;->getKey(Ljava/lang/String;[C)Ljava/security/Key;

    move-result-object v1

    check-cast v1, Ljava/security/PrivateKey;

    const-string v2, "RSA/ECB/PKCS1Padding"

    .line 168
    invoke-static {v2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v2

    const/4 v3, 0x2

    .line 169
    invoke-virtual {v2, v3, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    const/4 v1, 0x0

    .line 171
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 172
    invoke-virtual {v2, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v0

    .line 173
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    const-string v2, "AES/GCM/NoPadding"

    invoke-direct {v1, v0, v2}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    return-object v1
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    const-string v0, ""

    :try_start_0
    const-string v1, "AES/GCM/NoPadding"

    .line 98
    invoke-static {v1}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 99
    invoke-direct {p0}, Ll/᩹᩸ۘ;->ۧ()Ljavax/crypto/spec/SecretKeySpec;

    move-result-object v2

    new-instance v3, Ljavax/crypto/spec/IvParameterSpec;

    .line 156
    iget-object v4, p0, Ll/᩹᩸ۘ;->ۧ:Landroid/content/SharedPreferences;

    const-string v5, "PREF_KEY_IV"

    invoke-interface {v4, v5, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v4

    .line 99
    invoke-direct {v3, v4}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v4, 0x1

    invoke-virtual {v1, v4, v2, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 101
    invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B

    move-result-object p1

    invoke-virtual {v1, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 103
    invoke-static {p1, v5}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string v1, "KEYSTORE"

    const-string v2, "Exception"

    .line 105
    invoke-static {v1, v2, p1}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method
