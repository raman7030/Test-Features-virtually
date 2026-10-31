.class public final Ll/ܺۚ᩵;
.super Ljava/lang/Object;
.source "09ZP"

# interfaces
.implements Ll/ܶۚ᩵;


# static fields
.field public static ֨:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

.field public static final ۠:Ll/֫᩻֨;


# instance fields
.field public ֡:[B

.field public ֫:Ll/ᩴۚ᩵;

.field public ۖ:I

.field public ۘ:Ljava/lang/String;

.field public final ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ۜ:Ljavax/crypto/Cipher;

.field public ۡ:[B

.field public ۢ:[B

.field public ۧ:Z

.field public ܳ:Ljavax/crypto/Cipher;

.field public final ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

.field public ܽ:[B

.field public final ܿ:Z

.field public ᩳ:I

.field public ᩴ:Ll/ᩴۡ᩵;

.field public ᩵:[B

.field public ᩷:[B

.field public ᩻:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 58
    const-class v0, Ll/ܺۚ᩵;

    invoke-static {v0}, Ll/ۧ᩻֨;->֫(Ljava/lang/Class;)Ll/֫᩻֨;

    move-result-object v0

    sput-object v0, Ll/ܺۚ᩵;->۠:Ll/֫᩻֨;

    .line 67
    :try_start_0
    new-instance v0, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    const-string v1, "1.3.6.1.4.1.311.2.2.10"

    invoke-direct {v0, v1}, Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;-><init>(Ljava/lang/String;)V

    sput-object v0, Ll/ܺۚ᩵;->֨:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    .line 69
    sget-object v1, Ll/ܺۚ᩵;->۠:Ll/֫᩻֨;

    const-string v2, "Failed to parse OID"

    invoke-interface {v1, v2, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ll/ᩴۡ᩵;Ll/ᩴۚ᩵;Z)V
    .locals 2

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 76
    iput-boolean v0, p0, Ll/ܺۚ᩵;->ۧ:Z

    const/4 v1, 0x0

    .line 77
    iput-object v1, p0, Ll/ܺۚ᩵;->ۢ:[B

    .line 78
    iput-object v1, p0, Ll/ܺۚ᩵;->ܽ:[B

    .line 82
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Ll/ܺۚ᩵;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 83
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object v1, p0, Ll/ܺۚ᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v0, 0x1

    .line 84
    iput v0, p0, Ll/ܺۚ᩵;->ۖ:I

    .line 106
    iput-object p1, p0, Ll/ܺۚ᩵;->ᩴ:Ll/ᩴۡ᩵;

    .line 107
    iput-object p2, p0, Ll/ܺۚ᩵;->֫:Ll/ᩴۚ᩵;

    .line 108
    iget v0, p0, Ll/ܺۚ᩵;->ᩳ:I

    const v1, 0x20080004

    or-int/2addr v0, v1

    iput v0, p0, Ll/ܺۚ᩵;->ᩳ:I

    .line 110
    invoke-virtual {p2}, Ll/ᩴۚ᩵;->ܰ֫()Z

    move-result v0

    if-nez v0, :cond_0

    .line 111
    iget p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    const v0, 0x40008010

    or-int/2addr p2, v0

    iput p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    goto :goto_0

    .line 112
    :cond_0
    invoke-virtual {p2}, Ll/ᩴۚ᩵;->ۗۧ()Z

    move-result p2

    if-eqz p2, :cond_1

    .line 113
    iget p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    const/high16 v0, 0x40000000    # 2.0f

    or-int/2addr p2, v0

    iput p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    goto :goto_0

    .line 115
    :cond_1
    iget p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    or-int/lit16 p2, p2, 0x800

    iput p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    .line 117
    :goto_0
    iput-boolean p3, p0, Ll/ܺۚ᩵;->ܿ:Z

    .line 118
    invoke-interface {p1}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method

.method public static ֫(Ljava/lang/String;[B)[B
    .locals 1

    .line 357
    invoke-static {}, Ll/ۙ֨᩵;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 358
    invoke-virtual {v0, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 359
    sget-object p1, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update([B)V

    const/4 p0, 0x0

    .line 360
    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->update(B)V

    .line 361
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 5

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NtlmContext[auth="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ܺۚ᩵;->֫:Ll/ᩴۚ᩵;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ",ntlmsspFlags=0x"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܺۚ᩵;->ᩳ:I

    const/16 v2, 0x8

    const-string v3, ",workstation=null,isEstablished="

    .line 0
    invoke-static {v1, v2, v3, v0}, Ll/ᩴ᩸ܿ;->֫(IILjava/lang/String;Ljava/lang/StringBuilder;)V

    .line 137
    iget-boolean v1, p0, Ll/ܺۚ᩵;->ۧ:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ",state="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ܺۚ᩵;->ۖ:I

    const-string v2, ",serverChallenge="

    .line 0
    invoke-static {v1, v2, v0}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 139
    iget-object v1, p0, Ll/ܺۚ᩵;->ۢ:[B

    const/4 v2, 0x0

    const-string v3, "null"

    if-nez v1, :cond_0

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 142
    iget-object v1, p0, Ll/ܺۚ᩵;->ۢ:[B

    .line 86
    array-length v4, v1

    invoke-static {v1, v2, v4}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    .line 142
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    const-string v1, ",signingKey="

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 145
    iget-object v1, p0, Ll/ܺۚ᩵;->ܽ:[B

    if-nez v1, :cond_1

    .line 0
    invoke-static {v0, v3}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    invoke-static {v0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 148
    iget-object v1, p0, Ll/ܺۚ᩵;->ܽ:[B

    .line 86
    array-length v3, v1

    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    .line 148
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    const-string v1, "]"

    .line 0
    invoke-static {v0, v1}, Ll/ܺܶۡ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/۠֡᩵;)Ll/ܶ֡᩵;
    .locals 10

    .line 304
    new-instance v9, Ll/ܶ֡᩵;

    iget-object v3, p0, Ll/ܺۚ᩵;->ۘ:Ljava/lang/String;

    .line 308
    iget-object v0, p0, Ll/ܺۚ᩵;->֫:Ll/ᩴۚ᩵;

    invoke-virtual {v0}, Ll/ᩴۚ᩵;->ۗۧ()Z

    move-result v1

    iget-object v2, p0, Ll/ܺۚ᩵;->ᩴ:Ll/ᩴۡ᩵;

    if-eqz v1, :cond_0

    invoke-interface {v2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->ۜ()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ll/ᩴۚ᩵;->getPassword()Ljava/lang/String;

    move-result-object v1

    :goto_0
    move-object v4, v1

    .line 309
    invoke-virtual {v0}, Ll/ᩴۚ᩵;->ۗۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Ll/ᩴۚ᩵;->᩶֫()Ljava/lang/String;

    move-result-object v1

    :goto_1
    move-object v5, v1

    .line 310
    invoke-virtual {v0}, Ll/ᩴۚ᩵;->ۗۧ()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v2}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v1

    check-cast v1, Ll/ܰۡ᩵;

    invoke-virtual {v1}, Ll/ܰۡ᩵;->᩷()Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ll/ᩴۚ᩵;->֫()Ljava/lang/String;

    move-result-object v1

    :goto_2
    move-object v6, v1

    iget v7, p0, Ll/ܺۚ᩵;->ᩳ:I

    .line 313
    invoke-virtual {v0}, Ll/ᩴۚ᩵;->ۗۧ()Z

    move-result v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Ll/ᩴۚ᩵;->ܰ֫()Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    const/4 v8, 0x0

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v0, 0x1

    const/4 v8, 0x1

    :goto_4
    move-object v0, v9

    move-object v1, v2

    move-object v2, p1

    .line 114
    invoke-direct/range {v0 .. v8}, Ll/ܶ֡᩵;-><init>(Ll/ᩴۡ᩵;Ll/۠֡᩵;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V

    return-object v9
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 0

    .line 218
    iput-object p1, p0, Ll/ܺۚ᩵;->ۘ:Ljava/lang/String;

    return-void
.end method

.method public final ֫([B[B)V
    .locals 10

    const-string v0, "Decrypted "

    .line 422
    iget-object v1, p0, Ll/ܺۚ᩵;->֡:[B

    if-eqz v1, :cond_7

    const/4 v2, 0x0

    .line 427
    invoke-static {v2, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_6

    .line 432
    invoke-static {v1}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v1

    const/16 v5, 0xc

    .line 433
    invoke-static {v5, p2}, Ll/֫֡᩵;->ۧ(I[B)I

    move-result v6

    const/4 v7, 0x4

    .line 434
    invoke-virtual {v1, p2, v5, v7}, Ljava/security/MessageDigest;->update([BII)V

    .line 435
    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p1

    const/16 v1, 0x8

    .line 436
    invoke-static {p1, v1}, Lorg/bouncycastle/util/Arrays;->copyOf([BI)[B

    move-result-object v5

    .line 438
    sget-object v8, Ll/ܺۚ᩵;->۠:Ll/֫᩻֨;

    invoke-interface {v8}, Ll/֫᩻֨;->֫()Z

    move-result v9

    if-eqz v9, :cond_0

    .line 86
    array-length v9, p1

    invoke-static {p1, v2, v9}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    const-string v9, "Digest "

    .line 439
    invoke-virtual {v9, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v8, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 86
    array-length p1, v5

    invoke-static {v5, v2, p1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    const-string v9, "Truncated "

    .line 440
    invoke-virtual {v9, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v8, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 443
    :cond_0
    iget p1, p0, Ll/ܺۚ᩵;->ᩳ:I

    const/high16 v9, 0x40000000    # 2.0f

    and-int/2addr p1, v9

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    .line 446
    :try_start_0
    iget-object v9, p0, Ll/ܺۚ᩵;->ۜ:Ljavax/crypto/Cipher;

    invoke-virtual {v9, v5}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v5

    .line 447
    invoke-interface {v8}, Ll/֫᩻֨;->֫()Z

    move-result v9

    if-eqz v9, :cond_2

    .line 86
    array-length v9, v5

    invoke-static {v5, v2, v9}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v9

    .line 448
    invoke-virtual {v0, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v8, v0}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    .line 451
    new-instance p2, Ll/᩵ۡ᩵;

    const-string v0, "Failed to decrypt MIC"

    .line 50
    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 451
    throw p2

    .line 455
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/ܺۚ᩵;->ۚ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    const/4 v9, 0x2

    if-ne v0, v6, :cond_5

    new-array v0, v1, [B

    .line 461
    invoke-static {p2, v7, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 462
    invoke-static {v5, v0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p2

    if-nez p2, :cond_4

    .line 463
    invoke-interface {v8}, Ll/֫᩻֨;->֫()Z

    move-result p2

    if-eqz p2, :cond_3

    .line 464
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    aput-object p2, v6, v2

    aput-object v3, v6, v4

    aput-object p1, v6, v9

    const-string p1, "Seq = %d ver = %d encrypted = %s"

    invoke-static {p1, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v8, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 86
    array-length p1, v5

    invoke-static {v5, v2, p1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p2

    .line 465
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Expected MIC "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " != "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v8, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 467
    :cond_3
    new-instance p1, Ll/᩵ۡ᩵;

    const-string p2, "Invalid MIC"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 467
    throw p1

    :cond_4
    return-void

    .line 457
    :cond_5
    new-instance p1, Ll/᩵ۡ᩵;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    new-array v1, v9, [Ljava/lang/Object;

    aput-object p2, v1, v2

    aput-object v0, v1, v4

    const-string p2, "Invalid MIC sequence, expect %d have %d"

    invoke-static {p2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 457
    throw p1

    .line 429
    :cond_6
    new-instance p1, Ll/֡֨᩵;

    const-string p2, "Invalid signature version"

    .line 44
    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 429
    throw p1

    .line 424
    :cond_7
    new-instance p1, Ll/᩵ۡ᩵;

    const-string p2, "Signing is not initialized"

    .line 58
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 424
    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 190
    iget-boolean v0, p0, Ll/ܺۚ᩵;->ۧ:Z

    return v0
.end method

.method public final ֫(Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;)Z
    .locals 1

    .line 184
    iget-object v0, p0, Ll/ܺۚ᩵;->֫:Ll/ᩴۚ᩵;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    sget-object v0, Ll/ܺۚ᩵;->֨:Lorg/bouncycastle/asn1/ASN1ObjectIdentifier;

    invoke-virtual {v0, p1}, Lorg/bouncycastle/asn1/ASN1Primitive;->equals(Lorg/bouncycastle/asn1/ASN1Primitive;)Z

    move-result p1

    return p1
.end method

.method public final ֫(I[B)[B
    .locals 6

    .line 224
    iget p1, p0, Ll/ܺۚ᩵;->ۖ:I

    iget-object v0, p0, Ll/ܺۚ᩵;->ᩴ:Ll/ᩴۡ᩵;

    sget-object v1, Ll/ܺۚ᩵;->۠:Ll/֫᩻֨;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq p1, v3, :cond_8

    const/4 v4, 0x2

    if-ne p1, v4, :cond_7

    .line 237
    :try_start_0
    new-instance p1, Ll/۠֡᩵;

    invoke-direct {p1, p2}, Ll/۠֡᩵;-><init>([B)V

    .line 239
    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 240
    invoke-virtual {p1}, Ll/۠֡᩵;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 86
    array-length v4, p2

    invoke-static {p2, v2, v4}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v4

    .line 241
    invoke-interface {v1, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 244
    :cond_0
    invoke-virtual {p1}, Ll/۠֡᩵;->ܽ()[B

    move-result-object v4

    iput-object v4, p0, Ll/ܺۚ᩵;->ۢ:[B

    .line 246
    iget-boolean v4, p0, Ll/ܺۚ᩵;->ܿ:Z

    const/high16 v5, 0x80000

    if-eqz v4, :cond_4

    .line 247
    invoke-interface {v0}, Ll/ᩴۡ᩵;->ܿ()Ll/֨ۡ᩵;

    move-result-object v0

    check-cast v0, Ll/ܰۡ᩵;

    invoke-virtual {v0}, Ll/ܰۡ᩵;->᩻֫()Z

    move-result v0

    if-eqz v0, :cond_2

    const/high16 v0, 0x40000000    # 2.0f

    invoke-virtual {p1, v0}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 248
    invoke-virtual {p1, v5}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 249
    :cond_1
    new-instance p1, Ll/֡֨᩵;

    const-string p2, "Server does not support extended NTLMv2 key exchange"

    .line 44
    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 249
    throw p1

    :cond_2
    :goto_0
    const/high16 v0, 0x20000000

    .line 252
    invoke-virtual {p1, v0}, Ll/ۚ֡᩵;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_1

    .line 253
    :cond_3
    new-instance p1, Ll/֡֨᩵;

    const-string p2, "Server does not support 128-bit keys"

    .line 44
    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    .line 253
    throw p1

    .line 257
    :cond_4
    :goto_1
    iget v0, p0, Ll/ܺۚ᩵;->ᩳ:I

    invoke-virtual {p1}, Ll/ۚ֡᩵;->֫()I

    move-result v4

    and-int/2addr v0, v4

    iput v0, p0, Ll/ܺۚ᩵;->ᩳ:I

    .line 258
    invoke-virtual {p0, p1}, Ll/ܺۚ᩵;->֫(Ll/۠֡᩵;)Ll/ܶ֡᩵;

    move-result-object p1

    .line 259
    iget-object v0, p0, Ll/ܺۚ᩵;->᩵:[B

    invoke-virtual {p1, v0, p2}, Ll/ܶ֡᩵;->֫([B[B)V

    .line 261
    invoke-virtual {p1}, Ll/ܶ֡᩵;->ᩳ()[B

    move-result-object v0

    .line 263
    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v4

    if-eqz v4, :cond_5

    .line 264
    invoke-virtual {p1}, Ll/ܶ֡᩵;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 86
    array-length v4, p2

    invoke-static {p2, v2, v4}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p2

    .line 265
    invoke-interface {v1, p2}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 268
    :cond_5
    invoke-virtual {p1}, Ll/ܶ֡᩵;->ܽ()[B

    move-result-object p2

    iput-object p2, p0, Ll/ܺۚ᩵;->ܽ:[B

    if-eqz p2, :cond_6

    .line 270
    iget p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    and-int/2addr p2, v5

    if-eqz p2, :cond_6

    .line 271
    invoke-virtual {p1}, Ll/ܶ֡᩵;->ܽ()[B

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܺۚ᩵;->ۧ([B)V

    .line 274
    :cond_6
    iput-boolean v3, p0, Ll/ܺۚ᩵;->ۧ:Z

    .line 275
    iget p1, p0, Ll/ܺۚ᩵;->ۖ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܺۚ᩵;->ۖ:I
    :try_end_0
    .catch Ll/ۗۚ᩵; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    .line 280
    new-instance p2, Ll/ۗۚ᩵;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    throw p2

    :catch_1
    move-exception p1

    .line 278
    throw p1

    .line 230
    :cond_7
    new-instance p1, Ll/ۗۚ᩵;

    const-string p2, "Invalid state"

    invoke-direct {p1, p2}, Ll/ۗۚ᩵;-><init>(Ljava/lang/String;)V

    throw p1

    .line 318
    :cond_8
    new-instance p1, Ll/֨֡᩵;

    iget p2, p0, Ll/ܺۚ᩵;->ᩳ:I

    iget-object v4, p0, Ll/ܺۚ᩵;->֫:Ll/ᩴۚ᩵;

    invoke-virtual {v4}, Ll/ᩴۚ᩵;->᩶֫()Ljava/lang/String;

    move-result-object v4

    invoke-direct {p1, v0, p2, v4}, Ll/֨֡᩵;-><init>(Ll/ᩴۡ᩵;ILjava/lang/String;)V

    .line 319
    invoke-virtual {p1}, Ll/֨֡᩵;->ܽ()[B

    move-result-object p2

    .line 320
    iput-object p2, p0, Ll/ܺۚ᩵;->᩵:[B

    .line 322
    invoke-interface {v1}, Ll/֫᩻֨;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 323
    invoke-virtual {p1}, Ll/֨֡᩵;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v1, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 86
    array-length p1, p2

    invoke-static {p2, v2, p1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    .line 324
    invoke-interface {v1, p1}, Ll/֫᩻֨;->ܿ(Ljava/lang/String;)V

    .line 327
    :cond_9
    iget p1, p0, Ll/ܺۚ᩵;->ۖ:I

    add-int/2addr p1, v3

    iput p1, p0, Ll/ܺۚ᩵;->ۖ:I

    return-object p2
.end method

.method public final ֫([B)[B
    .locals 9

    const-string v0, "Encrypted "

    .line 379
    iget-object v1, p0, Ll/ܺۚ᩵;->ۡ:[B

    if-eqz v1, :cond_2

    .line 384
    iget-object v2, p0, Ll/ܺۚ᩵;->ܺ:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v2

    const/4 v3, 0x4

    new-array v4, v3, [B

    int-to-long v5, v2

    const/4 v2, 0x0

    .line 386
    invoke-static {v5, v6, v2, v4}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 388
    invoke-static {v1}, Ll/ۙ֨᩵;->ܽ([B)Ljava/security/MessageDigest;

    move-result-object v1

    .line 389
    invoke-virtual {v1, v4}, Ljava/security/MessageDigest;->update([B)V

    .line 390
    invoke-virtual {v1, p1}, Ljava/security/MessageDigest;->update([B)V

    .line 391
    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    const/16 v1, 0x8

    new-array v4, v1, [B

    .line 393
    invoke-static {p1, v2, v4, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 395
    sget-object v7, Ll/ܺۚ᩵;->۠:Ll/֫᩻֨;

    invoke-interface {v7}, Ll/֫᩻֨;->֫()Z

    move-result v8

    if-eqz v8, :cond_0

    .line 86
    array-length v8, p1

    invoke-static {p1, v2, v8}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    const-string v8, "Digest "

    .line 396
    invoke-virtual {v8, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 86
    invoke-static {v4, v2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    const-string v8, "Truncated "

    .line 397
    invoke-virtual {v8, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 400
    :cond_0
    iget p1, p0, Ll/ܺۚ᩵;->ᩳ:I

    const/high16 v8, 0x40000000    # 2.0f

    and-int/2addr p1, v8

    if-eqz p1, :cond_1

    .line 402
    :try_start_0
    iget-object p1, p0, Ll/ܺۚ᩵;->ܳ:Ljavax/crypto/Cipher;

    invoke-virtual {p1, v4}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object v4

    .line 403
    invoke-interface {v7}, Ll/֫᩻֨;->֫()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 86
    array-length p1, v4

    invoke-static {v4, v2, p1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    .line 404
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v7, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 407
    new-instance v0, Ll/᩵ۡ᩵;

    const-string v1, "Failed to encrypt MIC"

    .line 50
    invoke-direct {v0, v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 407
    throw v0

    :cond_1
    :goto_0
    const/16 p1, 0x10

    new-array p1, p1, [B

    const-wide/16 v7, 0x1

    .line 412
    invoke-static {v7, v8, v2, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    .line 413
    invoke-static {v4, v2, p1, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v0, 0xc

    .line 414
    invoke-static {v5, v6, v0, p1}, Ll/֫֡᩵;->ۧ(JI[B)V

    return-object p1

    .line 381
    :cond_2
    new-instance p1, Ll/᩵ۡ᩵;

    const-string v0, "Signing is not initialized"

    .line 58
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 381
    throw p1
.end method

.method public final ۧ([B)V
    .locals 4

    const-string v0, "session key to client-to-server signing key magic constant"

    .line 333
    invoke-static {v0, p1}, Ll/ܺۚ᩵;->֫(Ljava/lang/String;[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܺۚ᩵;->ۡ:[B

    const-string v0, "session key to server-to-client signing key magic constant"

    .line 334
    invoke-static {v0, p1}, Ll/ܺۚ᩵;->֫(Ljava/lang/String;[B)[B

    move-result-object v0

    iput-object v0, p0, Ll/ܺۚ᩵;->֡:[B

    .line 336
    sget-object v0, Ll/ܺۚ᩵;->۠:Ll/֫᩻֨;

    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 337
    iget-object v1, p0, Ll/ܺۚ᩵;->ۡ:[B

    .line 86
    array-length v3, v1

    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Sign key is "

    .line 337
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    .line 338
    iget-object v1, p0, Ll/ܺۚ᩵;->֡:[B

    .line 86
    array-length v3, v1

    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Verify key is "

    .line 338
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_0
    const-string v1, "session key to client-to-server sealing key magic constant"

    .line 341
    invoke-static {v1, p1}, Ll/ܺۚ᩵;->֫(Ljava/lang/String;[B)[B

    move-result-object v1

    iput-object v1, p0, Ll/ܺۚ᩵;->᩻:[B

    .line 342
    invoke-static {v1}, Ll/ۙ֨᩵;->֫([B)Ljavax/crypto/Cipher;

    move-result-object v1

    iput-object v1, p0, Ll/ܺۚ᩵;->ܳ:Ljavax/crypto/Cipher;

    .line 343
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 344
    iget-object v1, p0, Ll/ܺۚ᩵;->᩻:[B

    .line 86
    array-length v3, v1

    invoke-static {v1, v2, v3}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "Seal key is "

    .line 344
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_1
    const-string v1, "session key to server-to-client sealing key magic constant"

    .line 347
    invoke-static {v1, p1}, Ll/ܺۚ᩵;->֫(Ljava/lang/String;[B)[B

    move-result-object p1

    iput-object p1, p0, Ll/ܺۚ᩵;->᩷:[B

    .line 348
    invoke-static {p1}, Ll/ۙ֨᩵;->֫([B)Ljavax/crypto/Cipher;

    move-result-object p1

    iput-object p1, p0, Ll/ܺۚ᩵;->ۜ:Ljavax/crypto/Cipher;

    .line 350
    invoke-interface {v0}, Ll/֫᩻֨;->֫()Z

    move-result p1

    if-eqz p1, :cond_2

    .line 351
    iget-object p1, p0, Ll/ܺۚ᩵;->᩷:[B

    .line 86
    array-length v1, p1

    invoke-static {p1, v2, v1}, Ll/۫֨᩵;->֫([BII)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Server seal key is "

    .line 351
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ll/֫᩻֨;->ۧ(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public final ۧ()[B
    .locals 1

    .line 204
    iget-object v0, p0, Ll/ܺۚ᩵;->ܽ:[B

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 373
    iget-object v0, p0, Ll/ܺۚ᩵;->֫:Ll/ᩴۚ᩵;

    invoke-virtual {v0}, Ll/ᩴۚ᩵;->ۗۧ()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ܺۚ᩵;->ۡ:[B

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ܺۚ᩵;->֡:[B

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
