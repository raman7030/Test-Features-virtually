.class public final Ll/ۙ֨᩵;
.super Ljava/lang/Object;
.source "M9TU"


# static fields
.field public static ֫:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;


# direct methods
.method public static ֫()Ljava/security/MessageDigest;
    .locals 2

    :try_start_0
    const-string v0, "MD4"

    .line 55
    invoke-static {}, Ll/ۙ֨᩵;->ܽ()Ljava/security/Provider;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 57
    new-instance v1, Ll/֡ۡ᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 57
    throw v1
.end method

.method public static ֫([B)Ljavax/crypto/Cipher;
    .locals 3

    const-string v0, "RC4"

    .line 101
    :try_start_0
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v1

    .line 102
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    invoke-direct {v2, p0, v0}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    const/4 p0, 0x1

    invoke-virtual {v1, p0, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception p0

    goto :goto_0

    :catch_1
    move-exception p0

    goto :goto_0

    :catch_2
    move-exception p0

    .line 108
    :goto_0
    new-instance v0, Ll/֡ۡ᩵;

    .line 66
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 108
    throw v0
.end method

.method public static ۧ()Ljava/security/MessageDigest;
    .locals 2

    :try_start_0
    const-string v0, "MD5"

    .line 67
    invoke-static {v0}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 69
    new-instance v1, Ll/֡ۡ᩵;

    .line 66
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 69
    throw v1
.end method

.method public static ۧ([B)Ljavax/crypto/Cipher;
    .locals 12

    .line 118
    array-length v0, p0

    const/4 v1, 0x1

    const/4 v2, 0x7

    if-ne v0, v2, :cond_1

    const/16 v0, 0x8

    new-array v3, v0, [B

    const/4 v4, 0x0

    .line 141
    aget-byte v5, p0, v4

    and-int/lit16 v5, v5, 0xfe

    int-to-byte v5, v5

    aput-byte v5, v3, v4

    .line 142
    aget-byte v5, p0, v4

    shl-int/2addr v5, v2

    aget-byte v6, p0, v1

    and-int/lit16 v6, v6, 0xff

    ushr-int/2addr v6, v1

    or-int/2addr v5, v6

    int-to-byte v5, v5

    aput-byte v5, v3, v1

    .line 143
    aget-byte v5, p0, v1

    const/4 v6, 0x6

    shl-int/2addr v5, v6

    const/4 v7, 0x2

    aget-byte v8, p0, v7

    and-int/lit16 v8, v8, 0xff

    ushr-int/2addr v8, v7

    or-int/2addr v5, v8

    int-to-byte v5, v5

    aput-byte v5, v3, v7

    .line 144
    aget-byte v5, p0, v7

    const/4 v8, 0x5

    shl-int/2addr v5, v8

    const/4 v9, 0x3

    aget-byte v10, p0, v9

    and-int/lit16 v10, v10, 0xff

    ushr-int/2addr v10, v9

    or-int/2addr v5, v10

    int-to-byte v5, v5

    aput-byte v5, v3, v9

    .line 145
    aget-byte v5, p0, v9

    const/4 v10, 0x4

    shl-int/2addr v5, v10

    aget-byte v11, p0, v10

    and-int/lit16 v11, v11, 0xff

    ushr-int/2addr v11, v10

    or-int/2addr v5, v11

    int-to-byte v5, v5

    aput-byte v5, v3, v10

    .line 146
    aget-byte v5, p0, v10

    shl-int/2addr v5, v9

    aget-byte v9, p0, v8

    and-int/lit16 v9, v9, 0xff

    ushr-int/2addr v9, v8

    or-int/2addr v5, v9

    int-to-byte v5, v5

    aput-byte v5, v3, v8

    .line 147
    aget-byte v5, p0, v8

    shl-int/2addr v5, v7

    aget-byte v7, p0, v6

    and-int/lit16 v7, v7, 0xff

    ushr-int/2addr v7, v6

    or-int/2addr v5, v7

    int-to-byte v5, v5

    aput-byte v5, v3, v6

    .line 148
    aget-byte p0, p0, v6

    shl-int/2addr p0, v1

    int-to-byte p0, p0

    aput-byte p0, v3, v2

    :goto_0
    if-ge v4, v0, :cond_0

    .line 150
    aget-byte p0, v3, v4

    xor-int/lit8 v2, p0, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->bitCount(I)I

    move-result v2

    and-int/2addr v2, v1

    xor-int/2addr p0, v2

    int-to-byte p0, p0

    aput-byte p0, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 119
    :cond_0
    invoke-static {v3}, Ll/ۙ֨᩵;->ۧ([B)Ljavax/crypto/Cipher;

    move-result-object p0

    return-object p0

    :cond_1
    :try_start_0
    const-string v0, "DES/ECB/NoPadding"

    .line 123
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 124
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    const-string v3, "DES"

    invoke-direct {v2, p0, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p0

    goto :goto_1

    :catch_1
    move-exception p0

    goto :goto_1

    :catch_2
    move-exception p0

    .line 130
    :goto_1
    new-instance v0, Ll/֡ۡ᩵;

    .line 66
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 130
    throw v0
.end method

.method public static ܽ([B)Ljava/security/MessageDigest;
    .locals 1

    .line 91
    new-instance v0, Ll/۬֨᩵;

    invoke-direct {v0, p0}, Ll/۬֨᩵;-><init>([B)V

    return-object v0
.end method

.method public static ܽ()Ljava/security/Provider;
    .locals 1

    .line 163
    sget-object v0, Ll/ۙ֨᩵;->֫:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    if-eqz v0, :cond_0

    return-object v0

    .line 166
    :cond_0
    new-instance v0, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    invoke-direct {v0}, Lorg/bouncycastle/jce/provider/BouncyCastleProvider;-><init>()V

    sput-object v0, Ll/ۙ֨᩵;->֫:Lorg/bouncycastle/jce/provider/BouncyCastleProvider;

    return-object v0
.end method
