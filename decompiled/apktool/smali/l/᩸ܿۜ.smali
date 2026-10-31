.class public final Ll/᩸ܿۜ;
.super Ljava/lang/Object;
.source "K77P"


# direct methods
.method public static ֫(Ll/ܶܿۜ;)Ll/֨ܿۜ;
    .locals 21

    move-object/from16 v0, p0

    .line 77
    iget-object v1, v0, Ll/ܶܿۜ;->֫:[B

    const-string v2, "X.509"

    .line 78
    invoke-static {v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v2

    .line 79
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v2, v3}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 81
    new-instance v20, Ll/֨ܿۜ;

    move-object/from16 v3, v20

    iget-object v4, v0, Ll/ܶܿۜ;->ۧ:Ljava/util/ArrayList;

    array-length v5, v1

    .line 84
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v6

    .line 85
    invoke-static {v1}, Ll/ܳۤۡ;->֫([B)Ljava/lang/String;

    move-result-object v7

    .line 86
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v8

    .line 87
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v0

    invoke-static {v0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v9

    .line 102
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    .line 103
    invoke-virtual {v0, v1}, Ljava/util/zip/CRC32;->update([B)V

    .line 104
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/lang/Object;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    const-string v0, "%08x"

    invoke-static {v1, v0, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    .line 89
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSigAlgName()Ljava/lang/String;

    move-result-object v11

    .line 90
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSigAlgOID()Ljava/lang/String;

    move-result-object v12

    .line 91
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSubjectX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    const-string v14, "RFC2253"

    invoke-virtual {v0, v14}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 92
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getIssuerX500Principal()Ljavax/security/auth/x500/X500Principal;

    move-result-object v0

    invoke-virtual {v0, v14}, Ljavax/security/auth/x500/X500Principal;->getName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    .line 93
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v0

    const/16 v15, 0x10

    invoke-virtual {v0, v15}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v15

    .line 94
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getNotBefore()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v16

    .line 95
    invoke-virtual {v2}, Ljava/security/cert/X509Certificate;->getNotAfter()Ljava/util/Date;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v18

    invoke-direct/range {v3 .. v19}, Ll/֨ܿۜ;-><init>(Ljava/util/ArrayList;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V

    return-object v20
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)Ll/۠ܿۜ;
    .locals 9

    .line 32
    :try_start_0
    new-instance v0, Ll/ۙۧᩳ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll/ۙۧᩳ;-><init>(Ll/ܶ᩵ܿ;Z)V

    .line 33
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 34
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, "V1"

    .line 35
    invoke-virtual {v0}, Ll/ۙۧᩳ;->ᩳ()[B

    move-result-object v2

    invoke-static {p0, v5, v1, v2}, Ll/᩸ܿۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;[B)V

    const-string v1, "V2"

    .line 36
    invoke-virtual {v0}, Ll/ۙۧᩳ;->ܿ()[B

    move-result-object v2

    invoke-static {p0, v5, v1, v2}, Ll/᩸ܿۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;[B)V

    const-string v1, "V3"

    .line 37
    invoke-virtual {v0}, Ll/ۙۧᩳ;->᩻()[B

    move-result-object v2

    invoke-static {p0, v5, v1, v2}, Ll/᩸ܿۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;[B)V

    const-string v1, "V3.1"

    .line 38
    invoke-virtual {v0}, Ll/ۙۧᩳ;->ܳ()[B

    move-result-object v0

    invoke-static {p0, v5, v1, v0}, Ll/᩸ܿۜ;->֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;[B)V

    .line 39
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 40
    new-instance p0, Ll/۠ܿۜ;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Ll/۠ܿۜ;-><init>(ZZLjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/lang/String;)V

    return-object p0

    .line 43
    :cond_0
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 44
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܿۜ;

    .line 45
    invoke-static {v0}, Ll/᩸ܿۜ;->֫(Ll/ܶܿۜ;)Ll/֨ܿۜ;

    move-result-object v0

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 47
    :cond_1
    new-instance p0, Ll/۠ܿۜ;

    .line 48
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_2

    const/4 v0, 0x1

    const/4 v6, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    const/4 v6, 0x0

    :goto_1
    const/4 v8, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Ll/۠ܿۜ;-><init>(ZZLjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    .line 111
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 112
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    :cond_4
    move-object v7, v0

    .line 37
    new-instance p0, Ll/۠ܿۜ;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Ll/۠ܿۜ;-><init>(ZZLjava/util/ArrayList;ZLjava/util/ArrayList;Ljava/lang/String;)V

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;[B)V
    .locals 2

    if-nez p3, :cond_0

    return-void

    .line 62
    :cond_0
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 63
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ܶܿۜ;

    .line 64
    iget-object v1, v0, Ll/ܶܿۜ;->֫:[B

    invoke-static {v1, p3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 65
    iget-object p0, v0, Ll/ܶܿۜ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void

    .line 69
    :cond_2
    new-instance p1, Ll/ܶܿۜ;

    invoke-direct {p1, p3, p2}, Ll/ܶܿۜ;-><init>([BLjava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
