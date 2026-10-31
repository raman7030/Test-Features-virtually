.class public final Ll/ۨᩴ᩵;
.super Ljava/lang/Object;
.source "5A1F"


# static fields
.field public static final ֫:[B

.field public static final ۧ:[B

.field public static final ܽ:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "SmbSign"

    .line 37
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۨᩴ᩵;->֫:[B

    const-string v0, "SMB2AESCMAC"

    .line 38
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۨᩴ᩵;->ۧ:[B

    const-string v0, "SMBSigningKey"

    .line 39
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    move-result-object v0

    sput-object v0, Ll/ۨᩴ᩵;->ܽ:[B

    const-string v0, "SmbRpc"

    .line 41
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v0, "SMB2APP"

    .line 42
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v0, "SMBAppKey"

    .line 43
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v0, "ServerIn "

    .line 45
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v0, "SMB2AESCCM"

    .line 46
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v1, "SMB2C2SCipherKey"

    .line 47
    invoke-static {v1}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v1, "ServerOut"

    .line 49
    invoke-static {v1}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    .line 50
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    const-string v0, "SMB2S2CCipherKey"

    .line 51
    invoke-static {v0}, Ll/ۨᩴ᩵;->֫(Ljava/lang/String;)[B

    return-void
.end method

.method public static ֫(I[B[B)[B
    .locals 5

    const/16 v0, 0x311

    if-ne p0, v0, :cond_0

    .line 70
    sget-object v1, Ll/ۨᩴ᩵;->ܽ:[B

    goto :goto_0

    :cond_0
    sget-object v1, Ll/ۨᩴ᩵;->ۧ:[B

    :goto_0
    if-ne p0, v0, :cond_1

    goto :goto_1

    .line 71
    :cond_1
    sget-object p2, Ll/ۨᩴ᩵;->֫:[B

    .line 124
    :goto_1
    new-instance p0, Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;

    new-instance v0, Lorg/bouncycastle/crypto/macs/HMac;

    new-instance v2, Lorg/bouncycastle/crypto/digests/SHA256Digest;

    invoke-direct {v2}, Lorg/bouncycastle/crypto/digests/SHA256Digest;-><init>()V

    invoke-direct {v0, v2}, Lorg/bouncycastle/crypto/macs/HMac;-><init>(Lorg/bouncycastle/crypto/Digest;)V

    invoke-direct {p0, v0}, Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;-><init>(Lorg/bouncycastle/crypto/Mac;)V

    .line 127
    array-length v0, v1

    array-length v2, p2

    add-int/2addr v0, v2

    add-int/lit8 v2, v0, 0x5

    new-array v2, v2, [B

    .line 136
    array-length v3, v1

    const/4 v4, 0x0

    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 139
    array-length v1, v1

    add-int/lit8 v1, v1, 0x1

    array-length v3, p2

    invoke-static {p2, v4, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v0, 0x4

    const/16 p2, -0x80

    .line 141
    aput-byte p2, v2, v0

    .line 143
    new-instance p2, Lorg/bouncycastle/crypto/params/KDFCounterParameters;

    const/4 v0, 0x0

    const/16 v1, 0x20

    invoke-direct {p2, p1, v0, v2, v1}, Lorg/bouncycastle/crypto/params/KDFCounterParameters;-><init>([B[B[BI)V

    .line 144
    invoke-virtual {p0, p2}, Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;->init(Lorg/bouncycastle/crypto/DerivationParameters;)V

    const/16 p1, 0x10

    new-array p2, p1, [B

    .line 147
    invoke-virtual {p0, p2, v4, p1}, Lorg/bouncycastle/crypto/generators/KDFCounterBytesGenerator;->generateBytes([BII)I

    return-object p2
.end method

.method public static ֫(Ljava/lang/String;)[B
    .locals 3

    .line 157
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    new-array v0, v0, [B

    .line 158
    sget-object v1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-static {v1, v2, v0, v2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method
