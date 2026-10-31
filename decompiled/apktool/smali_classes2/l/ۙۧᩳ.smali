.class public final Ll/ۙۧᩳ;
.super Ljava/lang/Object;
.source "819Z"


# instance fields
.field public final ֫:Ll/ܶ᩵ܿ;

.field public final ۧ:[B

.field public ܳ:Ll/᩹ۧᩳ;

.field public final ܽ:[B

.field public final ܿ:[B

.field public final ᩳ:[B


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Z)V
    .locals 9

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Ll/ۙۧᩳ;->֫:Ll/ܶ᩵ܿ;

    const/4 v0, 0x1

    const/4 v1, 0x0

    const-string v2, "r"

    const/4 v3, 0x0

    if-eqz p2, :cond_5

    .line 38
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p2

    .line 39
    :try_start_0
    new-instance v2, Ll/ᩴᩳᩳ;

    invoke-direct {v2, p2}, Ll/ᩴᩳᩳ;-><init>(Ll/᩻ۖܽ;)V

    .line 53
    invoke-static {v2, v3}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;[B)[B

    move-result-object v4

    .line 40
    iput-object v4, p0, Ll/ۙۧᩳ;->ܽ:[B

    if-eqz v4, :cond_0

    move-object v1, v3

    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v2, v1, v3}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;Z[B)Ll/ۤۤ;

    move-result-object v1

    .line 41
    invoke-direct {p0, v1}, Ll/ۙۧᩳ;->֫(Ll/ۤۤ;)[B

    move-result-object v1

    :goto_0
    iput-object v1, p0, Ll/ۙۧᩳ;->ܿ:[B

    if-nez v4, :cond_2

    if-eqz v1, :cond_1

    goto :goto_1

    .line 52
    :cond_1
    invoke-static {v2, v0, v3}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;Z[B)Ll/ۤۤ;

    move-result-object v0

    .line 42
    invoke-direct {p0, v0}, Ll/ۙۧᩳ;->֫(Ll/ۤۤ;)[B

    move-result-object v0

    goto :goto_2

    :cond_2
    :goto_1
    move-object v0, v3

    :goto_2
    iput-object v0, p0, Ll/ۙۧᩳ;->ᩳ:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    invoke-virtual {p2}, Ll/᩻ۖܽ;->close()V

    if-nez v4, :cond_4

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    goto :goto_3

    .line 44
    :cond_3
    invoke-static {p1}, Ll/᩻ᩳᩳ;->֫(Ll/ܶ᩵ܿ;)[B

    move-result-object v3

    :cond_4
    :goto_3
    iput-object v3, p0, Ll/ۙۧᩳ;->ۧ:[B

    return-void

    :catchall_0
    move-exception p1

    .line 38
    :try_start_1
    invoke-virtual {p2}, Ll/᩻ۖܽ;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1

    .line 47
    :cond_5
    invoke-static {p1}, Ll/᩻ᩳᩳ;->֫(Ll/ܶ᩵ܿ;)[B

    move-result-object p2

    iput-object p2, p0, Ll/ۙۧᩳ;->ۧ:[B

    .line 48
    invoke-virtual {p1, v2}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object p1

    .line 49
    :try_start_2
    new-instance v2, Ll/ᩴᩳᩳ;

    invoke-direct {v2, p1}, Ll/ᩴᩳᩳ;-><init>(Ll/᩻ۖܽ;)V

    .line 50
    invoke-static {v2, p2}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;[B)[B

    move-result-object v4

    iput-object v4, p0, Ll/ۙۧᩳ;->ܽ:[B

    const/4 v5, 0x2

    new-array v6, v5, [[B

    aput-object v4, v6, v1

    aput-object p2, v6, v0

    const/4 v7, 0x0

    :goto_5
    if-ge v7, v5, :cond_7

    .line 57
    aget-object v8, v6, v7

    if-eqz v8, :cond_6

    goto :goto_6

    :cond_6
    add-int/lit8 v7, v7, 0x1

    goto :goto_5

    :cond_7
    move-object v8, v3

    .line 51
    :goto_6
    invoke-static {v2, v1, v8}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;Z[B)Ll/ۤۤ;

    move-result-object v6

    invoke-direct {p0, v6}, Ll/ۙۧᩳ;->֫(Ll/ۤۤ;)[B

    move-result-object v6

    iput-object v6, p0, Ll/ۙۧᩳ;->ܿ:[B

    const/4 v7, 0x3

    new-array v8, v7, [[B

    aput-object v6, v8, v1

    aput-object v4, v8, v0

    aput-object p2, v8, v5

    :goto_7
    if-ge v1, v7, :cond_9

    .line 57
    aget-object p2, v8, v1

    if-eqz p2, :cond_8

    move-object v3, p2

    goto :goto_8

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    .line 52
    :cond_9
    :goto_8
    invoke-static {v2, v0, v3}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;Z[B)Ll/ۤۤ;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/ۙۧᩳ;->֫(Ll/ۤۤ;)[B

    move-result-object p2

    iput-object p2, p0, Ll/ۙۧᩳ;->ᩳ:[B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 53
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V

    return-void

    :catchall_2
    move-exception p2

    .line 48
    :try_start_3
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception p1

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw p2
.end method

.method public static ֫([B[B)Z
    .locals 0

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 369
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ֫(Ll/ۤۤ;)[B
    .locals 4

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 66
    :cond_0
    iget-object v0, p1, Ll/ۤۤ;->֫:Ljava/lang/Object;

    .line 68
    iget-object v1, p0, Ll/ۙۧᩳ;->ۧ:[B

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Ll/ۙۧᩳ;->ܽ:[B

    :goto_0
    if-nez v1, :cond_2

    .line 70
    check-cast v0, [B

    return-object v0

    .line 73
    :cond_2
    :try_start_0
    iget-object p1, p1, Ll/ۤۤ;->ۧ:Ljava/lang/Object;

    check-cast p1, Ll/᩸ܽᩳ;

    if-nez p1, :cond_3

    .line 75
    check-cast v0, [B

    return-object v0

    :cond_3
    const-string v2, "X.509"

    .line 77
    invoke-static {v2}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v2

    .line 78
    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v2, v3}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v2

    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 79
    invoke-virtual {p1, v2}, Ll/᩸ܽᩳ;->֫(Ljava/security/cert/X509Certificate;)Ll/᩸ܽᩳ;

    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ll/᩸ܽᩳ;->֫()I

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v2, 0x1

    if-ne p1, v2, :cond_4

    return-object v1

    .line 86
    :catch_0
    :cond_4
    check-cast v0, [B

    return-object v0
.end method

.method private ۧ(Ll/ܿۖ᩷;)Ll/᩹ۧᩳ;
    .locals 14

    .line 213
    new-instance v0, Ll/᩹ۧᩳ;

    invoke-direct {v0}, Ll/᩹ۧᩳ;-><init>()V

    .line 214
    iget-object v1, p0, Ll/ۙۧᩳ;->ᩳ:[B

    iget-object v2, p0, Ll/ۙۧᩳ;->ܿ:[B

    iget-object v3, p0, Ll/ۙۧᩳ;->ܽ:[B

    iget-object v4, p0, Ll/ۙۧᩳ;->ۧ:[B

    if-nez v4, :cond_0

    if-nez v3, :cond_0

    if-nez v2, :cond_0

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    const-string v5, "r"

    .line 217
    iget-object v6, p0, Ll/ۙۧᩳ;->֫:Ll/ܶ᩵ܿ;

    invoke-virtual {v6, v5}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v5

    .line 218
    :try_start_0
    new-instance v7, Ll/ᩴᩳᩳ;

    invoke-direct {v7, v5}, Ll/ᩴᩳᩳ;-><init>(Ll/᩻ۖܽ;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 219
    iget-object v8, v0, Ll/᩹ۧᩳ;->ᩳ:Ll/ܶۧᩳ;

    if-eqz v3, :cond_2

    .line 220
    :try_start_1
    invoke-static {v7, p1}, Ll/᩷ᩳᩳ;->֫(Ll/ᩴᩳᩳ;Ll/ܿۖ᩷;)Z

    move-result v9

    if-eqz v9, :cond_1

    .line 221
    sget-object v9, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    iput-object v9, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    goto :goto_0

    .line 223
    :cond_1
    sget-object v9, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    iput-object v9, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    .line 226
    :cond_2
    :goto_0
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v10, 0x0

    if-eqz v9, :cond_3

    .line 249
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-object v10

    .line 229
    :cond_3
    iget-object v9, v0, Ll/᩹ۧᩳ;->ܿ:Ll/ܶۧᩳ;

    if-eqz v2, :cond_5

    const/4 v11, 0x0

    .line 230
    :try_start_2
    invoke-static {v7, v11, p1}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;ZLl/ܿۖ᩷;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 231
    sget-object v11, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    iput-object v11, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    goto :goto_1

    .line 233
    :cond_4
    sget-object v11, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    iput-object v11, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    .line 236
    :cond_5
    :goto_1
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v11
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v11, :cond_6

    .line 249
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-object v10

    .line 239
    :cond_6
    iget-object v11, v0, Ll/᩹ۧᩳ;->ܳ:Ll/ܶۧᩳ;

    if-eqz v1, :cond_8

    const/4 v12, 0x1

    .line 240
    :try_start_3
    invoke-static {v7, v12, p1}, Ll/ܺᩳᩳ;->֫(Ll/ᩴᩳᩳ;ZLl/ܿۖ᩷;)Z

    move-result v7

    if-eqz v7, :cond_7

    .line 241
    sget-object v7, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    iput-object v7, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    goto :goto_2

    .line 243
    :cond_7
    sget-object v7, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    iput-object v7, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    .line 246
    :cond_8
    :goto_2
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v7, :cond_9

    .line 249
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-object v10

    :cond_9
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    .line 250
    iget-object v5, v0, Ll/᩹ۧᩳ;->ܽ:Ll/ܶۧᩳ;

    if-eqz v4, :cond_b

    .line 251
    invoke-static {v6, v0, p1}, Ll/᩻ᩳᩳ;->֫(Ll/ܶ᩵ܿ;Ll/᩹ۧᩳ;Ll/ܿۖ᩷;)Z

    move-result v6

    if-eqz v6, :cond_a

    .line 252
    sget-object v6, Ll/᩸ۧᩳ;->ۗ:Ll/᩸ۧᩳ;

    iput-object v6, v5, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    goto :goto_3

    .line 254
    :cond_a
    sget-object v6, Ll/᩸ۧᩳ;->᩹:Ll/᩸ۧᩳ;

    iput-object v6, v5, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    .line 257
    :cond_b
    :goto_3
    invoke-interface {p1}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1

    if-eqz p1, :cond_c

    return-object v10

    .line 263
    :cond_c
    iget-boolean p1, v11, Ll/ܶۧᩳ;->֫:Z

    if-eqz p1, :cond_10

    .line 264
    iget-object p1, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->᩷()Z

    move-result p1

    if-eqz p1, :cond_d

    .line 265
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object v13, v10

    move-object v10, p1

    move-object p1, v13

    goto :goto_4

    .line 266
    :cond_d
    iget-object p1, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_10

    .line 267
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 268
    invoke-virtual {v0}, Ll/᩹ۧᩳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_e

    .line 269
    sget-object p1, Ll/᩶ۧᩳ;->ۙ:Ll/᩶ۧᩳ;

    goto :goto_4

    .line 270
    :cond_e
    iget-object p1, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_f

    .line 271
    sget-object p1, Ll/᩶ۧᩳ;->֫֫:Ll/᩶ۧᩳ;

    goto :goto_4

    .line 273
    :cond_f
    sget-object p1, Ll/᩶ۧᩳ;->ܿ֫:Ll/᩶ۧᩳ;

    goto :goto_4

    :cond_10
    move-object p1, v10

    :goto_4
    if-nez v10, :cond_14

    .line 277
    iget-boolean v6, v9, Ll/ܶۧᩳ;->֫:Z

    if-eqz v6, :cond_14

    .line 278
    iget-object v6, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->᩷()Z

    move-result v6

    if-eqz v6, :cond_11

    .line 279
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_5

    .line 280
    :cond_11
    iget-object v6, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->֫()Z

    move-result v6

    if-eqz v6, :cond_14

    .line 281
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 282
    invoke-virtual {v0}, Ll/᩹ۧᩳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_12

    .line 283
    sget-object p1, Ll/᩶ۧᩳ;->ۙ:Ll/᩶ۧᩳ;

    goto :goto_5

    .line 284
    :cond_12
    iget-object p1, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_13

    .line 285
    sget-object p1, Ll/᩶ۧᩳ;->۟:Ll/᩶ۧᩳ;

    goto :goto_5

    .line 287
    :cond_13
    sget-object p1, Ll/᩶ۧᩳ;->ᩳ֫:Ll/᩶ۧᩳ;

    :cond_14
    :goto_5
    if-nez v10, :cond_18

    .line 291
    iget-boolean v6, v8, Ll/ܶۧᩳ;->֫:Z

    if-eqz v6, :cond_18

    .line 292
    iget-object v6, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->᩷()Z

    move-result v6

    if-eqz v6, :cond_15

    .line 293
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_6

    .line 294
    :cond_15
    iget-object v6, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->֫()Z

    move-result v6

    if-eqz v6, :cond_18

    .line 295
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 296
    invoke-virtual {v0}, Ll/᩹ۧᩳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_16

    .line 297
    sget-object p1, Ll/᩶ۧᩳ;->ۙ:Ll/᩶ۧᩳ;

    goto :goto_6

    .line 298
    :cond_16
    iget-object p1, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_17

    .line 299
    sget-object p1, Ll/᩶ۧᩳ;->ܰ:Ll/᩶ۧᩳ;

    goto :goto_6

    .line 301
    :cond_17
    sget-object p1, Ll/᩶ۧᩳ;->ܽ֫:Ll/᩶ۧᩳ;

    :cond_18
    :goto_6
    if-nez v10, :cond_1f

    .line 306
    iget-object v6, v5, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->᩷()Z

    move-result v6

    if-eqz v6, :cond_1c

    .line 307
    iget-boolean v6, v11, Ll/ܶۧᩳ;->֫:Z

    if-eqz v6, :cond_19

    iget-object v6, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_19

    .line 308
    sget-object p1, Ll/᩶ۧᩳ;->֫֫:Ll/᩶ۧᩳ;

    .line 309
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    .line 310
    :cond_19
    iget-boolean v6, v9, Ll/ܶۧᩳ;->֫:Z

    if-eqz v6, :cond_1a

    iget-object v6, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_1a

    .line 311
    sget-object p1, Ll/᩶ۧᩳ;->۟:Ll/᩶ۧᩳ;

    .line 312
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    .line 313
    :cond_1a
    iget-boolean v6, v8, Ll/ܶۧᩳ;->֫:Z

    if-eqz v6, :cond_1b

    iget-object v6, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v6}, Ll/᩸ۧᩳ;->ܿ()Z

    move-result v6

    if-eqz v6, :cond_1b

    .line 314
    sget-object p1, Ll/᩶ۧᩳ;->ܰ:Ll/᩶ۧᩳ;

    .line 315
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_7

    .line 317
    :cond_1b
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_7

    .line 320
    :cond_1c
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 321
    invoke-virtual {v0}, Ll/᩹ۧᩳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_1d

    .line 322
    sget-object p1, Ll/᩶ۧᩳ;->ۙ:Ll/᩶ۧᩳ;

    goto :goto_7

    .line 323
    :cond_1d
    iget-object p1, v5, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->᩻()Z

    move-result p1

    if-eqz p1, :cond_1e

    .line 324
    sget-object p1, Ll/᩶ۧᩳ;->᩺:Ll/᩶ۧᩳ;

    goto :goto_7

    .line 326
    :cond_1e
    sget-object p1, Ll/᩶ۧᩳ;->ۧ֫:Ll/᩶ۧᩳ;

    :cond_1f
    :goto_7
    if-nez p1, :cond_2e

    .line 331
    iget-object p1, v5, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_20

    .line 332
    sget-object p1, Ll/᩶ۧᩳ;->ۧ֫:Ll/᩶ۧᩳ;

    goto/16 :goto_8

    .line 333
    :cond_20
    iget-object p1, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_21

    .line 334
    sget-object p1, Ll/᩶ۧᩳ;->ܽ֫:Ll/᩶ۧᩳ;

    goto/16 :goto_8

    .line 335
    :cond_21
    iget-object p1, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_22

    .line 336
    sget-object p1, Ll/᩶ۧᩳ;->ᩳ֫:Ll/᩶ۧᩳ;

    goto/16 :goto_8

    .line 337
    :cond_22
    iget-object p1, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->֫()Z

    move-result p1

    if-eqz p1, :cond_23

    .line 338
    sget-object p1, Ll/᩶ۧᩳ;->ܿ֫:Ll/᩶ۧᩳ;

    goto/16 :goto_8

    .line 339
    :cond_23
    iget-object p1, v8, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_24

    .line 340
    sget-object p1, Ll/᩶ۧᩳ;->ܰ:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 341
    :cond_24
    iget-object p1, v9, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_25

    .line 342
    sget-object p1, Ll/᩶ۧᩳ;->۟:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 343
    :cond_25
    iget-object p1, v11, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {p1}, Ll/᩸ۧᩳ;->ܿ()Z

    move-result p1

    if-eqz p1, :cond_26

    .line 344
    sget-object p1, Ll/᩶ۧᩳ;->֫֫:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 345
    :cond_26
    invoke-static {v4, v3}, Ll/ۙۧᩳ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_27

    .line 346
    sget-object p1, Ll/᩶ۧᩳ;->ۗ:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 347
    :cond_27
    invoke-static {v4, v2}, Ll/ۙۧᩳ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_28

    .line 348
    sget-object p1, Ll/᩶ۧᩳ;->۬:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 349
    :cond_28
    invoke-static {v4, v1}, Ll/ۙۧᩳ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_29

    .line 350
    sget-object p1, Ll/᩶ۧᩳ;->۫:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 351
    :cond_29
    invoke-static {v3, v2}, Ll/ۙۧᩳ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_2a

    .line 352
    sget-object p1, Ll/᩶ۧᩳ;->ۤ:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 353
    :cond_2a
    invoke-static {v3, v1}, Ll/ۙۧᩳ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_2b

    .line 354
    sget-object p1, Ll/᩶ۧᩳ;->ۛ:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 355
    :cond_2b
    invoke-static {v2, v1}, Ll/ۙۧᩳ;->֫([B[B)Z

    move-result p1

    if-eqz p1, :cond_2c

    .line 356
    sget-object p1, Ll/᩶ۧᩳ;->ۨ:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 357
    :cond_2c
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_2d

    .line 358
    sget-object p1, Ll/᩶ۧᩳ;->ܳ֫:Ll/᩶ۧᩳ;

    goto :goto_8

    .line 360
    :cond_2d
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    .line 363
    :cond_2e
    :goto_8
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iput-boolean v1, v0, Ll/᩹ۧᩳ;->֫:Z

    .line 364
    iput-object p1, v0, Ll/᩹ۧᩳ;->ۧ:Ll/᩶ۧᩳ;

    return-object v0

    :catchall_0
    move-exception p1

    .line 217
    :try_start_4
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_9

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw p1
.end method


# virtual methods
.method public final declared-synchronized ֫(Ll/ܿۖ᩷;)Ll/᩹ۧᩳ;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 192
    :try_start_0
    iget-object v1, p0, Ll/ۙۧᩳ;->ܳ:Ll/᩹ۧᩳ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 193
    monitor-exit v0

    return-object v1

    .line 196
    :cond_0
    :try_start_1
    invoke-static {p1}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object p1

    invoke-direct {p0, p1}, Ll/ۙۧᩳ;->ۧ(Ll/ܿۖ᩷;)Ll/᩹ۧᩳ;

    move-result-object p1

    iput-object p1, p0, Ll/ۙۧᩳ;->ܳ:Ll/᩹ۧᩳ;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 197
    monitor-exit v0

    return-object p1

    :catch_0
    move-exception p1

    .line 199
    :try_start_2
    new-instance v1, Ll/᩹ۧᩳ;

    invoke-direct {v1}, Ll/᩹ۧᩳ;-><init>()V

    iput-object v1, p0, Ll/ۙۧᩳ;->ܳ:Ll/᩹ۧᩳ;

    .line 200
    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final ֫()[B
    .locals 1

    .line 147
    iget-object v0, p0, Ll/ۙۧᩳ;->ᩳ:[B

    if-eqz v0, :cond_0

    return-object v0

    .line 149
    :cond_0
    iget-object v0, p0, Ll/ۙۧᩳ;->ܿ:[B

    if-eqz v0, :cond_1

    return-object v0

    .line 151
    :cond_1
    iget-object v0, p0, Ll/ۙۧᩳ;->ܽ:[B

    if-eqz v0, :cond_2

    return-object v0

    .line 153
    :cond_2
    iget-object v0, p0, Ll/ۙۧᩳ;->ۧ:[B

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۜ()Z
    .locals 6

    .line 97
    iget-object v0, p0, Ll/ۙۧᩳ;->ᩳ:[B

    iget-object v1, p0, Ll/ۙۧᩳ;->ܿ:[B

    iget-object v2, p0, Ll/ۙۧᩳ;->ܽ:[B

    const/4 v3, 0x1

    iget-object v4, p0, Ll/ۙۧᩳ;->ۧ:[B

    if-eqz v4, :cond_2

    if-eqz v2, :cond_0

    .line 98
    invoke-static {v4, v2}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-nez v5, :cond_0

    return v3

    :cond_0
    if-eqz v1, :cond_1

    .line 101
    invoke-static {v4, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v5

    if-nez v5, :cond_1

    return v3

    :cond_1
    if-eqz v0, :cond_2

    .line 104
    invoke-static {v4, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-nez v4, :cond_2

    return v3

    :cond_2
    if-eqz v2, :cond_4

    if-eqz v1, :cond_3

    .line 109
    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    if-nez v4, :cond_3

    return v3

    :cond_3
    if-eqz v0, :cond_4

    .line 112
    invoke-static {v2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v2

    if-nez v2, :cond_4

    return v3

    :cond_4
    if-eqz v1, :cond_5

    if-eqz v0, :cond_5

    .line 117
    invoke-static {v1, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v0

    if-nez v0, :cond_5

    return v3

    :cond_5
    const/4 v0, 0x0

    return v0
.end method

.method public final ۡ()Z
    .locals 1

    .line 205
    iget-object v0, p0, Ll/ۙۧᩳ;->ܳ:Ll/᩹ۧᩳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۢ()Z
    .locals 1

    .line 209
    invoke-virtual {p0}, Ll/ۙۧᩳ;->ۡ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll/ۙۧᩳ;->ܳ:Ll/᩹ۧᩳ;

    .line 389
    iget-boolean v0, v0, Ll/᩹ۧᩳ;->֫:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ()[B
    .locals 2

    .line 130
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    iget-object v1, p0, Ll/ۙۧᩳ;->ᩳ:[B

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    const/16 v1, 0x1c

    if-lt v0, v1, :cond_1

    .line 132
    iget-object v1, p0, Ll/ۙۧᩳ;->ܿ:[B

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    .line 134
    iget-object v0, p0, Ll/ۙۧᩳ;->ܽ:[B

    if-eqz v0, :cond_2

    return-object v0

    .line 136
    :cond_2
    iget-object v0, p0, Ll/ۙۧᩳ;->ۧ:[B

    if-eqz v0, :cond_3

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method

.method public final ܳ()[B
    .locals 1

    .line 160
    iget-object v0, p0, Ll/ۙۧᩳ;->ᩳ:[B

    return-object v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 5

    .line 176
    iget-object v0, p0, Ll/ۙۧᩳ;->ۧ:[B

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 177
    :goto_0
    iget-object v2, p0, Ll/ۙۧᩳ;->ܽ:[B

    if-eqz v2, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 178
    :goto_1
    iget-object v3, p0, Ll/ۙۧᩳ;->ܿ:[B

    if-eqz v3, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    .line 179
    :goto_2
    iget-object v4, p0, Ll/ۙۧᩳ;->ᩳ:[B

    if-eqz v4, :cond_3

    const/4 v1, 0x1

    .line 180
    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    if-eqz v0, :cond_4

    const-string v0, "V1"

    .line 181
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_4
    if-eqz v2, :cond_5

    const-string v0, "V2"

    .line 182
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    if-eqz v3, :cond_6

    const-string v0, "V3"

    .line 183
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz v1, :cond_7

    const-string v0, "V3.1"

    .line 184
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 185
    :cond_7
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_8

    const-string v0, "NULL"

    return-object v0

    :cond_8
    const-string v0, " + "

    .line 188
    invoke-static {v4, v0}, Ll/ۢܺ֡;->֫(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ܿ()[B
    .locals 1

    .line 168
    iget-object v0, p0, Ll/ۙۧᩳ;->ܽ:[B

    return-object v0
.end method

.method public final ᩳ()[B
    .locals 1

    .line 172
    iget-object v0, p0, Ll/ۙۧᩳ;->ۧ:[B

    return-object v0
.end method

.method public final ᩷()Z
    .locals 1

    .line 90
    iget-object v0, p0, Ll/ۙۧᩳ;->ۧ:[B

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۙۧᩳ;->ܽ:[B

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۙۧᩳ;->ܿ:[B

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/ۙۧᩳ;->ᩳ:[B

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final ᩻()[B
    .locals 1

    .line 164
    iget-object v0, p0, Ll/ۙۧᩳ;->ܿ:[B

    return-object v0
.end method
