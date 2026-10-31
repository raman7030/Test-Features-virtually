.class public final Ll/ۖܳᩳ;
.super Ljava/lang/Object;
.source "GB8B"


# static fields
.field public static final ֫:[B

.field public static final ۧ:[B

.field public static ܽ:Ljava/security/cert/CertificateFactory;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "-----BEGIN CERTIFICATE-----"

    .line 53
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Ll/ۖܳᩳ;->֫:[B

    const-string v0, "-----END CERTIFICATE-----"

    .line 54
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v0

    sput-object v0, Ll/ۖܳᩳ;->ۧ:[B

    return-void
.end method

.method public static ֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
    .locals 4

    if-eqz p0, :cond_a

    .line 231
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    sget-object v1, Ll/ۖܳᩳ;->֫:[B

    array-length v2, v1

    if-ge v0, v2, :cond_0

    return-object p0

    .line 234
    :cond_0
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->mark()Ljava/nio/Buffer;

    const/4 v0, 0x0

    .line 235
    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_2

    .line 236
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    aget-byte v3, v1, v0

    if-eq v2, v3, :cond_1

    .line 237
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->reset()Ljava/nio/Buffer;

    return-object p0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 241
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    :goto_1
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 243
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v1

    int-to-char v1, v1

    const/16 v2, 0x2d

    if-ne v1, v2, :cond_3

    goto :goto_2

    .line 247
    :cond_3
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    .line 250
    :cond_4
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    :goto_2
    const/4 v1, 0x1

    .line 255
    :goto_3
    sget-object v2, Ll/ۖܳᩳ;->ۧ:[B

    array-length v3, v2

    if-ge v1, v3, :cond_8

    .line 256
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v3

    if-eqz v3, :cond_7

    .line 261
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    aget-byte v2, v2, v1

    if-ne v3, v2, :cond_6

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 262
    :cond_6
    new-instance p0, Ljava/security/cert/CertificateException;

    const-string v0, "The provided input contains the PEM certificate header without a valid certificate footer"

    invoke-direct {p0, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 257
    :cond_7
    new-instance p0, Ljava/security/cert/CertificateException;

    const-string v0, "The provided input contains the PEM certificate header but does not contain sufficient data for the footer"

    invoke-direct {p0, v0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 267
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 269
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    .line 270
    :goto_4
    invoke-virtual {p0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 271
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    int-to-char v2, v2

    .line 272
    invoke-static {v2}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v2

    if-eqz v2, :cond_9

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    .line 278
    :cond_9
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 279
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    return-object p0

    .line 227
    :cond_a
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "The certificateBuffer cannot be null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫([B)Ljava/security/cert/X509Certificate;
    .locals 4

    .line 90
    sget-object v0, Ll/ۖܳᩳ;->ܽ:Ljava/security/cert/CertificateFactory;

    if-nez v0, :cond_1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "X.509"

    .line 61
    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    sput-object v0, Ll/ۖܳᩳ;->ܽ:Ljava/security/cert/CertificateFactory;
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    .line 63
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "Failed to create X.509 CertificateFactory"

    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 93
    :cond_1
    :goto_0
    sget-object v0, Ll/ۖܳᩳ;->ܽ:Ljava/security/cert/CertificateFactory;

    .line 106
    :try_start_1
    new-instance v1, Ljava/io/ByteArrayInputStream;

    invoke-direct {v1, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v1

    check-cast v1, Ljava/security/cert/X509Certificate;
    :try_end_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v1

    .line 127
    :catch_1
    :try_start_2
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 126
    invoke-static {p0}, Ll/ۖܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p0

    .line 128
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v1

    .line 129
    const-class v2, Ljava/security/cert/Certificate;

    invoke-static {p0, v2}, Ll/ܶᩳᩳ;->֫(Ljava/nio/ByteBuffer;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/security/cert/Certificate;

    .line 130
    invoke-static {v2}, Ll/ۤᩳᩳ;->ܽ(Ljava/lang/Object;)[B

    move-result-object v2

    .line 131
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v3}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v0

    check-cast v0, Ljava/security/cert/X509Certificate;

    .line 135
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    sub-int/2addr v2, v1

    new-array v2, v2, [B

    .line 136
    invoke-virtual {p0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 137
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 138
    new-instance p0, Ll/ܺܳᩳ;

    invoke-direct {p0, v0, v2}, Ll/ܺܳᩳ;-><init>(Ljava/security/cert/X509Certificate;[B)V
    :try_end_2
    .catch Ll/᩹ᩳᩳ; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ll/ۛᩳᩳ; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/security/cert/CertificateException; {:try_start_2 .. :try_end_2} :catch_2

    return-object p0

    :catch_2
    move-exception p0

    goto :goto_1

    :catch_3
    move-exception p0

    goto :goto_1

    :catch_4
    move-exception p0

    .line 142
    :goto_1
    new-instance v0, Ljava/security/cert/CertificateException;

    const-string v1, "Failed to parse certificate"

    invoke-direct {v0, v1, p0}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
