.class public final Ll/ۢᩳᩳ;
.super Ljava/lang/Object;
.source "4AYU"


# direct methods
.method public static ֫(Ll/ܶ᩵ܿ;Ll/۬ܿᩳ;ZZLl/۬ۧᩳ;)V
    .locals 21

    move/from16 v0, p2

    move/from16 v1, p3

    move-object/from16 v2, p4

    if-nez v0, :cond_1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 43
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    throw v0

    :cond_1
    :goto_0
    if-eqz v2, :cond_2

    .line 46
    invoke-interface {v2, v0, v1}, Ll/۬ۧᩳ;->֫(ZZ)V

    .line 49
    :cond_2
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v3

    invoke-virtual {v3}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v3

    .line 350
    invoke-interface {v3}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v4

    const-string v5, "RSA"

    .line 351
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 352
    move-object v4, v3

    check-cast v4, Ljava/security/interfaces/RSAKey;

    invoke-interface {v4}, Ljava/security/interfaces/RSAKey;->getModulus()Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v4}, Ljava/math/BigInteger;->bitLength()I

    move-result v4

    const/16 v5, 0xc00

    if-gt v4, v5, :cond_3

    .line 355
    sget-object v4, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    .line 78
    new-instance v4, Ll/֨ܽᩳ;

    const-string v9, "SHA256withRSA"

    const/4 v10, 0x0

    const/16 v6, 0x103

    const-string v7, "SHA-256"

    const-string v8, "RSA"

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Ll/֨ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V

    .line 354
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    .line 359
    :cond_3
    sget-object v4, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    .line 82
    new-instance v4, Ll/֨ܽᩳ;

    const-string v9, "SHA512withRSA"

    const/4 v10, 0x0

    const/16 v6, 0x104

    const-string v7, "SHA-512"

    const-string v8, "RSA"

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Ll/֨ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V

    .line 358
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_4
    const-string v5, "DSA"

    .line 362
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 364
    sget-object v4, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    .line 94
    new-instance v4, Ll/֨ܽᩳ;

    const-string v9, "SHA256withDSA"

    const/4 v10, 0x0

    const/16 v6, 0x301

    const-string v7, "SHA-256"

    const-string v8, "DSA"

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Ll/֨ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V

    .line 363
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    goto :goto_1

    :cond_5
    const-string v5, "EC"

    .line 366
    invoke-virtual {v5, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 368
    sget-object v4, Ll/ܶܽᩳ;->ܽ:Ljava/util/HashMap;

    .line 86
    new-instance v4, Ll/֨ܽᩳ;

    const-string v9, "SHA256withECDSA"

    const/4 v10, 0x0

    const/16 v6, 0x201

    const-string v7, "SHA-256"

    const-string v8, "EC"

    move-object v5, v4

    invoke-direct/range {v5 .. v10}, Ll/֨ܽᩳ;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/PSSParameterSpec;)V

    .line 367
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    :goto_1
    const-string v5, "rw"

    move-object/from16 v6, p0

    .line 54
    invoke-virtual {v6, v5}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v5

    .line 55
    :try_start_0
    new-instance v6, Ll/ᩴᩳᩳ;

    invoke-direct {v6, v5}, Ll/ᩴᩳᩳ;-><init>(Ll/᩻ۖܽ;)V

    .line 56
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->᩻()Z

    move-result v7

    if-nez v7, :cond_1d

    .line 62
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v7

    const-wide/16 v9, 0x0

    invoke-static {v5, v9, v10, v7, v8}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v7

    .line 63
    invoke-static {v7}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v7

    .line 65
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->֫()J

    move-result-wide v8

    .line 66
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->ۧ()J

    move-result-wide v10

    .line 67
    invoke-static {v5, v8, v9, v10, v11}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v8

    invoke-static {v8}, Ll/ۘܿᩳ;->ۧ(Ll/֨ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v8

    .line 69
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->ᩳ()J

    move-result-wide v9

    .line 70
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->ۜ()J

    move-result-wide v11

    sub-long/2addr v11, v9

    .line 71
    invoke-static {v5, v9, v10, v11, v12}, Ll/ۚܿᩳ;->֫(Ll/۠ۖܽ;JJ)Ll/֨ܿᩳ;

    move-result-object v9

    invoke-static {v9}, Ll/ۘܿᩳ;->֫(Ll/֨ܿᩳ;)Ll/ۡܿᩳ;

    move-result-object v9

    .line 72
    invoke-virtual {v6}, Ll/ᩴᩳᩳ;->֫()J

    move-result-wide v10

    invoke-interface {v7}, Ll/֡ܿᩳ;->size()J

    move-result-wide v12

    sub-long/2addr v10, v12

    long-to-int v11, v10

    if-eqz v11, :cond_6

    .line 75
    invoke-virtual {v9}, Ll/ۡܿᩳ;->ᩳ()[B

    move-result-object v10

    .line 76
    invoke-virtual {v9}, Ll/ۡܿᩳ;->ܿ()I

    move-result v12

    add-int/lit8 v12, v12, 0x10

    .line 77
    invoke-static {v12, v10}, Ll/᩺ۧᩳ;->֫(I[B)J

    move-result-wide v13

    int-to-long v0, v11

    sub-long/2addr v13, v0

    .line 79
    invoke-static {v13, v14, v12, v10}, Ll/᩺ۧᩳ;->ۧ(JI[B)V

    :cond_6
    if-nez v2, :cond_7

    move-object v0, v8

    move-object v1, v9

    goto :goto_2

    .line 88
    :cond_7
    invoke-interface {v7}, Ll/֡ܿᩳ;->size()J

    move-result-wide v0

    invoke-interface {v8}, Ll/֡ܿᩳ;->size()J

    move-result-wide v10

    add-long/2addr v0, v10

    invoke-virtual {v9}, Ll/ۡܿᩳ;->size()J

    move-result-wide v10

    add-long/2addr v0, v10

    .line 89
    new-instance v10, Ll/᩻ܽᩳ;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v11

    int-to-long v11, v11

    mul-long v0, v0, v11

    invoke-direct {v10, v0, v1, v2}, Ll/᩻ܽᩳ;-><init>(JLl/۬ۧᩳ;)V

    .line 90
    invoke-virtual {v10, v7}, Ll/᩻ܽᩳ;->֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v7

    .line 91
    invoke-virtual {v10, v8}, Ll/᩻ܽᩳ;->֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v0

    .line 92
    invoke-virtual {v10, v9}, Ll/᩻ܽᩳ;->֫(Ll/֡ܿᩳ;)Ll/֡ܿᩳ;

    move-result-object v1

    .line 96
    :goto_2
    invoke-static/range {p4 .. p4}, Ll/ܽۖ᩷;->֫(Ll/ܿۖ᩷;)Ll/ܿۖ᩷;

    move-result-object v10

    .line 97
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    :goto_3
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    const/4 v15, 0x0

    if-eqz v13, :cond_a

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    const/16 v16, 0x1

    check-cast v13, Ll/ܶܽᩳ;

    if-eqz v12, :cond_8

    const/4 v12, 0x3

    new-array v14, v12, [Ll/֡ܿᩳ;

    aput-object v7, v14, v15

    aput-object v0, v14, v16

    const/4 v15, 0x2

    aput-object v1, v14, v15

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v12, :cond_8

    .line 35
    aget-object v12, v14, v15

    .line 36
    invoke-interface {v12}, Ll/֡ܿᩳ;->reset()V

    add-int/lit8 v15, v15, 0x1

    const/4 v12, 0x3

    goto :goto_4

    .line 100
    :cond_8
    invoke-virtual {v13, v7, v0, v1, v10}, Ll/ܶܽᩳ;->֫(Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/֡ܿᩳ;Ll/ܿۖ᩷;)V

    if-eqz v2, :cond_9

    .line 102
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v12, :cond_9

    .line 256
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-void

    :cond_9
    const/4 v12, 0x1

    goto :goto_3

    :cond_a
    const/4 v0, 0x4

    if-eqz p2, :cond_d

    .line 111
    :try_start_1
    invoke-static {v4}, Ll/ۢᩳᩳ;->֫(Ljava/util/List;)[B

    move-result-object v1

    .line 112
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v7

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/security/cert/X509Certificate;

    aput-object v7, v10, v15

    invoke-static {v10}, Ll/ۢᩳᩳ;->֫([Ljava/security/cert/X509Certificate;)[B

    move-result-object v7

    new-array v10, v0, [B

    new-array v13, v0, [B

    new-array v0, v0, [[B

    aput-object v1, v0, v15

    const/4 v1, 0x1

    aput-object v7, v0, v1

    const/4 v1, 0x2

    aput-object v10, v0, v1

    const/4 v1, 0x3

    aput-object v13, v0, v1

    .line 110
    invoke-static {v0}, Ll/ۢᩳᩳ;->֫([[B)[B

    move-result-object v0

    .line 116
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܶܽᩳ;

    .line 117
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v10

    invoke-virtual {v7, v10, v3, v0}, Ll/ܶܽᩳ;->֫(Ljava/security/PrivateKey;Ljava/security/PublicKey;[B)V

    if-eqz v2, :cond_b

    .line 118
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_b

    .line 256
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-void

    .line 122
    :cond_c
    :try_start_2
    invoke-static {v4}, Ll/ۢᩳᩳ;->ۧ(Ljava/util/List;)[B

    move-result-object v1

    .line 123
    invoke-static {v3}, Ll/ۢᩳᩳ;->֫(Ljava/security/PublicKey;)[B

    move-result-object v7

    .line 124
    array-length v10, v0

    array-length v13, v1

    add-int/2addr v10, v13

    array-length v13, v7

    add-int/2addr v10, v13

    add-int/lit8 v13, v10, 0xc

    add-int/lit8 v10, v10, 0x10

    .line 126
    invoke-static {v10}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v10

    .line 127
    invoke-static {v13}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v13

    array-length v11, v0

    .line 128
    invoke-static {v11}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v11

    const/16 v17, 0x4

    array-length v12, v1

    .line 130
    invoke-static {v12}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v12

    array-length v14, v7

    .line 132
    invoke-static {v14}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v14

    const/16 v15, 0x8

    new-array v15, v15, [[B

    const/16 v20, 0x0

    aput-object v10, v15, v20

    const/4 v10, 0x1

    aput-object v13, v15, v10

    const/4 v10, 0x2

    aput-object v11, v15, v10

    const/4 v10, 0x3

    aput-object v0, v15, v10

    aput-object v12, v15, v17

    const/4 v0, 0x5

    aput-object v1, v15, v0

    const/4 v0, 0x6

    aput-object v14, v15, v0

    const/4 v1, 0x7

    aput-object v7, v15, v1

    .line 125
    invoke-static {v15}, Ll/ۢᩳᩳ;->֫([[B)[B

    move-result-object v7

    const/4 v11, 0x7

    const/4 v12, 0x6

    goto :goto_5

    :cond_d
    const/4 v11, 0x7

    const/4 v12, 0x6

    const/4 v7, 0x0

    :goto_5
    if-eqz p3, :cond_10

    .line 138
    invoke-static {v4}, Ll/ۢᩳᩳ;->֫(Ljava/util/List;)[B

    move-result-object v0

    .line 139
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->᩻()Ljava/security/cert/X509Certificate;

    move-result-object v1

    const/4 v10, 0x1

    new-array v10, v10, [Ljava/security/cert/X509Certificate;

    const/4 v13, 0x0

    aput-object v1, v10, v13

    invoke-static {v10}, Ll/ۢᩳᩳ;->֫([Ljava/security/cert/X509Certificate;)[B

    move-result-object v1

    const/16 v10, 0x1c

    .line 140
    invoke-static {v10}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v10

    const v13, 0x7fffffff

    .line 141
    invoke-static {v13}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v13

    const/4 v14, 0x4

    new-array v14, v14, [B

    const/4 v15, 0x5

    const v17, 0x7fffffff

    new-array v15, v15, [[B

    const/16 v18, 0x0

    aput-object v0, v15, v18

    const/4 v0, 0x1

    aput-object v1, v15, v0

    const/4 v0, 0x2

    aput-object v10, v15, v0

    const/4 v0, 0x3

    aput-object v13, v15, v0

    const/4 v0, 0x4

    aput-object v14, v15, v0

    .line 137
    invoke-static {v15}, Ll/ۢᩳᩳ;->֫([[B)[B

    move-result-object v0

    .line 144
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ll/ܶܽᩳ;

    .line 145
    invoke-virtual/range {p1 .. p1}, Ll/۬ܿᩳ;->ܺ()Ljava/security/PrivateKey;

    move-result-object v13

    invoke-virtual {v10, v13, v3, v0}, Ll/ܶܽᩳ;->֫(Ljava/security/PrivateKey;Ljava/security/PublicKey;[B)V

    if-eqz v2, :cond_e

    .line 146
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v10
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v10, :cond_e

    .line 256
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-void

    .line 150
    :cond_f
    :try_start_3
    invoke-static {v4}, Ll/ۢᩳᩳ;->ۧ(Ljava/util/List;)[B

    move-result-object v1

    .line 151
    invoke-static {v3}, Ll/ۢᩳᩳ;->֫(Ljava/security/PublicKey;)[B

    move-result-object v3

    .line 152
    array-length v4, v0

    array-length v10, v1

    add-int/2addr v4, v10

    array-length v10, v3

    add-int/2addr v4, v10

    add-int/lit8 v10, v4, 0x14

    add-int/lit8 v4, v4, 0x18

    .line 154
    invoke-static {v4}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v4

    .line 155
    invoke-static {v10}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v10

    array-length v13, v0

    .line 156
    invoke-static {v13}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v13

    const/16 v14, 0x1c

    .line 158
    invoke-static {v14}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v14

    .line 159
    invoke-static/range {v17 .. v17}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v15

    move-object/from16 v16, v9

    array-length v9, v1

    .line 160
    invoke-static {v9}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v9

    move-object/from16 v17, v8

    array-length v8, v3

    .line 162
    invoke-static {v8}, Ll/᩺ۧᩳ;->֫(I)[B

    move-result-object v8

    move-object/from16 v18, v6

    const/16 v6, 0xa

    new-array v6, v6, [[B

    const/16 v19, 0x0

    aput-object v4, v6, v19

    const/4 v4, 0x1

    aput-object v10, v6, v4

    const/4 v4, 0x2

    aput-object v13, v6, v4

    const/4 v4, 0x3

    aput-object v0, v6, v4

    const/4 v0, 0x4

    aput-object v14, v6, v0

    const/4 v0, 0x5

    aput-object v15, v6, v0

    aput-object v9, v6, v12

    aput-object v1, v6, v11

    const/16 v0, 0x8

    aput-object v8, v6, v0

    const/16 v0, 0x9

    aput-object v3, v6, v0

    .line 153
    invoke-static {v6}, Ll/ۢᩳᩳ;->֫([[B)[B

    move-result-object v0

    goto :goto_6

    :cond_10
    move-object/from16 v18, v6

    move-object/from16 v17, v8

    move-object/from16 v16, v9

    const/4 v0, 0x0

    :goto_6
    if-eqz v2, :cond_11

    .line 166
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v1, :cond_11

    .line 256
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-void

    :cond_11
    const/16 v1, 0xc

    if-nez p2, :cond_12

    const/4 v3, 0x0

    goto :goto_7

    .line 170
    :cond_12
    :try_start_4
    array-length v3, v7

    add-int/2addr v3, v1

    :goto_7
    if-nez p3, :cond_13

    const/4 v4, 0x0

    goto :goto_8

    .line 171
    :cond_13
    array-length v4, v0

    add-int/2addr v4, v1

    :goto_8
    const/16 v6, 0x18

    const/16 v8, 0x8

    invoke-static {v3, v8, v4, v6}, Ll/᩵ۢ֡;->֫(IIII)I

    move-result v3

    .line 174
    rem-int/lit16 v4, v3, 0x1000

    if-eqz v4, :cond_15

    .line 175
    rem-int/lit16 v4, v3, 0x1000

    rsub-int v6, v4, 0x1000

    if-ge v6, v1, :cond_14

    rsub-int v6, v4, 0x2000

    .line 180
    :cond_14
    new-array v1, v6, [B

    add-int/lit8 v4, v6, -0x8

    int-to-long v8, v4

    const/4 v4, 0x0

    .line 181
    invoke-static {v8, v9, v4, v1}, Ll/᩺ۧᩳ;->֫(JI[B)V

    const v4, 0x42726577

    const/16 v8, 0x8

    .line 182
    invoke-static {v4, v8, v1}, Ll/᩺ۧᩳ;->֫(II[B)V

    add-int/2addr v3, v6

    goto :goto_9

    :cond_15
    const/4 v1, 0x0

    .line 185
    :goto_9
    new-array v4, v3, [B

    int-to-long v8, v3

    const-wide/16 v10, 0x8

    sub-long/2addr v8, v10

    const/4 v6, 0x0

    .line 190
    invoke-static {v8, v9, v6, v4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    if-eqz p2, :cond_16

    .line 195
    array-length v6, v7

    add-int/lit8 v6, v6, 0x4

    int-to-long v10, v6

    const/16 v6, 0x8

    invoke-static {v10, v11, v6, v4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    const v6, 0x7109871a

    const/16 v10, 0x10

    .line 199
    invoke-static {v6, v10, v4}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 203
    array-length v6, v7

    const/16 v10, 0x14

    const/4 v11, 0x0

    invoke-static {v7, v11, v4, v10, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    array-length v6, v7

    add-int/2addr v6, v10

    goto :goto_a

    :cond_16
    const/16 v6, 0x8

    :goto_a
    if-eqz p3, :cond_17

    .line 209
    array-length v7, v0

    add-int/lit8 v7, v7, 0x4

    int-to-long v10, v7

    invoke-static {v10, v11, v6, v4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    add-int/lit8 v7, v6, 0x8

    const v10, -0xfac9740

    .line 213
    invoke-static {v10, v7, v4}, Ll/᩺ۧᩳ;->֫(II[B)V

    add-int/lit8 v6, v6, 0xc

    .line 217
    array-length v7, v0

    const/4 v10, 0x0

    invoke-static {v0, v10, v4, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 218
    array-length v0, v0

    add-int/2addr v6, v0

    :cond_17
    if-eqz v1, :cond_18

    .line 223
    array-length v0, v1

    const/4 v7, 0x0

    invoke-static {v1, v7, v4, v6, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 224
    array-length v0, v1

    add-int/2addr v6, v0

    .line 227
    :cond_18
    invoke-static {v8, v9, v6, v4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    add-int/lit8 v0, v6, 0x8

    const-wide v7, 0x20676953204b5041L

    .line 230
    invoke-static {v7, v8, v0, v4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    add-int/lit8 v0, v6, 0x10

    const-wide v7, 0x3234206b636f6c42L    # 7.465385175170059E-67

    .line 233
    invoke-static {v7, v8, v0, v4}, Ll/᩺ۧᩳ;->֫(JI[B)V

    add-int/lit8 v6, v6, 0x18

    if-ne v6, v3, :cond_1c

    if-eqz v2, :cond_19

    .line 239
    invoke-interface/range {p4 .. p4}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v0, :cond_19

    .line 256
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-void

    .line 242
    :cond_19
    :try_start_5
    invoke-virtual/range {v18 .. v18}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v0

    const/16 v2, 0x1000

    int-to-long v6, v2

    .line 343
    rem-long/2addr v0, v6

    long-to-int v1, v0

    if-nez v1, :cond_1a

    const/4 v0, 0x0

    goto :goto_b

    :cond_1a
    rsub-int v0, v1, 0x1000

    .line 243
    :goto_b
    invoke-virtual/range {v18 .. v18}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v1

    invoke-virtual {v5, v1, v2}, Ll/᩻ۖܽ;->setLength(J)V

    .line 244
    invoke-virtual/range {v18 .. v18}, Ll/ᩴᩳᩳ;->ܽ()J

    move-result-wide v1

    invoke-virtual {v5, v1, v2}, Ll/᩻ۖܽ;->seek(J)V

    if-eqz v0, :cond_1b

    .line 246
    new-array v1, v0, [B

    const/4 v2, 0x0

    .line 111
    invoke-virtual {v5, v1, v2, v0}, Ll/᩻ۖܽ;->write([BII)V

    goto :goto_c

    :cond_1b
    const/4 v2, 0x0

    :goto_c
    invoke-virtual {v5, v4, v2, v3}, Ll/᩻ۖܽ;->write([BII)V

    .line 248
    invoke-virtual {v5}, Ll/᩻ۖܽ;->getFilePointer()J

    move-result-wide v0

    .line 249
    invoke-interface/range {v17 .. v17}, Ll/֡ܿᩳ;->reset()V

    .line 250
    invoke-interface/range {v17 .. v17}, Ll/֡ܿᩳ;->size()J

    move-result-wide v2

    move-object/from16 v4, v17

    invoke-interface {v4, v2, v3, v5}, Ll/֡ܿᩳ;->֫(JLl/᩻ۖܽ;)V

    .line 251
    invoke-virtual/range {v16 .. v16}, Ll/ۡܿᩳ;->ᩳ()[B

    move-result-object v2

    .line 252
    invoke-virtual/range {v16 .. v16}, Ll/ۡܿᩳ;->ܿ()I

    move-result v3

    add-int/lit8 v3, v3, 0x10

    .line 253
    invoke-static {v0, v1, v3, v2}, Ll/᩺ۧᩳ;->ۧ(JI[B)V

    .line 254
    invoke-virtual/range {v16 .. v16}, Ll/ۡܿᩳ;->reset()V

    .line 255
    invoke-virtual/range {v16 .. v16}, Ll/ۡܿᩳ;->size()J

    move-result-wide v0

    move-object/from16 v2, v16

    invoke-static {v2, v5, v0, v1}, Ll/ۘܿᩳ;->֫(Ll/֡ܿᩳ;Ll/᩻ۖܽ;J)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 256
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V

    return-void

    .line 237
    :cond_1c
    :try_start_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 57
    :cond_1d
    new-instance v0, Ll/֫ۛۡ;

    const v1, 0x7f120b45

    invoke-direct {v0, v1}, Ll/֫ۛۡ;-><init>(I)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 54
    :try_start_7
    invoke-virtual {v5}, Ll/᩻ۖܽ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_d

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_d
    throw v1

    .line 371
    :cond_1e
    new-instance v0, Ljava/security/InvalidKeyException;

    const-string v1, "Unsupported key algorithm: "

    .line 0
    invoke-static {v1, v4}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 371
    invoke-direct {v0, v1}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(I[B)[B
    .locals 5

    .line 334
    array-length v0, p1

    const/16 v1, 0xc

    add-int/2addr v0, v1

    new-array v0, v0, [B

    .line 335
    array-length v2, p1

    const/16 v3, 0x8

    add-int/2addr v2, v3

    const/4 v4, 0x0

    invoke-static {v2, v4, v0}, Ll/᩺ۧᩳ;->֫(II[B)V

    const/4 v2, 0x4

    .line 336
    invoke-static {p0, v2, v0}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 337
    array-length p0, p1

    invoke-static {p0, v3, v0}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 338
    array-length p0, p1

    invoke-static {p1, v4, v0, v1, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0
.end method

.method public static ֫(Ljava/security/PublicKey;)[B
    .locals 5

    const-string v0, " of class "

    const-string v1, "Failed to obtain X.509 encoded form of public key "

    .line 379
    :try_start_0
    invoke-interface {p0}, Ljava/security/Key;->getAlgorithm()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v2

    const-class v3, Ljava/security/spec/X509EncodedKeySpec;

    .line 380
    invoke-virtual {v2, p0, v3}, Ljava/security/KeyFactory;->getKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;

    move-result-object v2

    check-cast v2, Ljava/security/spec/X509EncodedKeySpec;

    .line 381
    invoke-virtual {v2}, Ljava/security/spec/X509EncodedKeySpec;->getEncoded()[B

    move-result-object v2
    :try_end_0
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v2, :cond_0

    .line 388
    array-length v3, v2

    if-eqz v3, :cond_0

    return-object v2

    .line 389
    :cond_0
    new-instance v2, Ljava/security/InvalidKeyException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 391
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v2, p0}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;)V

    throw v2

    :catch_0
    move-exception v2

    .line 383
    new-instance v3, Ljava/security/InvalidKeyException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 385
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v3, p0, v2}, Ljava/security/InvalidKeyException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3
.end method

.method public static ֫(Ljava/util/List;)[B
    .locals 5

    .line 274
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 276
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x4

    const/4 v2, 0x4

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶܽᩳ;

    .line 277
    invoke-virtual {v3}, Ll/ܶܽᩳ;->֫()I

    move-result v4

    .line 212
    iget-object v3, v3, Ll/ܶܽᩳ;->֫:[B

    .line 277
    invoke-static {v4, v3}, Ll/ۢᩳᩳ;->֫(I[B)[B

    move-result-object v3

    .line 278
    array-length v4, v3

    add-int/2addr v2, v4

    .line 279
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 281
    :cond_0
    new-array p0, v2, [B

    sub-int/2addr v2, v1

    const/4 v3, 0x0

    .line 282
    invoke-static {v2, v3, p0}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 284
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [B

    .line 285
    array-length v4, v2

    invoke-static {v2, v3, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 286
    array-length v2, v2

    add-int/2addr v1, v2

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public static varargs ֫([Ljava/security/cert/X509Certificate;)[B
    .locals 7

    .line 292
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 294
    array-length v1, p0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x4

    :goto_0
    if-ge v3, v1, :cond_0

    aget-object v5, p0, v3

    .line 295
    invoke-virtual {v5}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v5

    .line 296
    array-length v6, v5

    add-int/lit8 v6, v6, 0x4

    add-int/2addr v4, v6

    .line 297
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 299
    :cond_0
    new-array p0, v4, [B

    add-int/lit8 v4, v4, -0x4

    .line 300
    invoke-static {v4, v2, p0}, Ll/᩺ۧᩳ;->֫(II[B)V

    .line 302
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x4

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 303
    array-length v4, v3

    invoke-static {v4, v1, p0}, Ll/᩺ۧᩳ;->֫(II[B)V

    add-int/lit8 v1, v1, 0x4

    .line 305
    array-length v4, v3

    invoke-static {v3, v2, p0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 306
    array-length v3, v3

    add-int/2addr v1, v3

    goto :goto_1

    :cond_1
    return-object p0
.end method

.method public static varargs ֫([[B)[B
    .locals 7

    .line 261
    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v4, p0, v2

    .line 262
    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 264
    :cond_0
    new-array v0, v3, [B

    .line 266
    array-length v2, p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v3, v2, :cond_1

    aget-object v5, p0, v3

    .line 267
    array-length v6, v5

    invoke-static {v5, v1, v0, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 268
    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object v0
.end method

.method public static ۧ(Ljava/util/List;)[B
    .locals 5

    .line 312
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 314
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܶܽᩳ;

    .line 315
    invoke-virtual {v3}, Ll/ܶܽᩳ;->֫()I

    move-result v4

    .line 216
    iget-object v3, v3, Ll/ܶܽᩳ;->ۧ:[B

    .line 315
    invoke-static {v4, v3}, Ll/ۢᩳᩳ;->֫(I[B)[B

    move-result-object v3

    .line 316
    array-length v4, v3

    add-int/2addr v2, v4

    .line 317
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 319
    :cond_0
    new-array p0, v2, [B

    .line 321
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [B

    .line 322
    array-length v4, v3

    invoke-static {v3, v1, p0, v2, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 323
    array-length v3, v3

    add-int/2addr v2, v3

    goto :goto_1

    :cond_1
    return-object p0
.end method
