.class public final Ll/᩸ܽᩳ;
.super Ljava/lang/Object;
.source "6B02"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;I)V
    .locals 0

    .line 88
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    iput p2, p0, Ll/᩸ܽᩳ;->֫:I

    .line 90
    iput-object p1, p0, Ll/᩸ܽᩳ;->ۧ:Ljava/util/ArrayList;

    return-void
.end method

.method public static ֫(Ljava/util/List;)Ll/᩸ܽᩳ;
    .locals 6

    if-eqz p0, :cond_6

    .line 329
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_3

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 336
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v1, v4, :cond_2

    .line 337
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸ܽᩳ;

    .line 162
    iget-object v4, v4, Ll/᩸ܽᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-le v4, v3, :cond_1

    move v2, v1

    move v3, v4

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 344
    :cond_2
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩸ܽᩳ;

    iget-object v1, v1, Ll/᩸ܽᩳ;->ۧ:Ljava/util/ArrayList;

    const/4 v3, 0x0

    .line 346
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v4

    if-ge v3, v4, :cond_5

    if-ne v3, v2, :cond_3

    goto :goto_2

    .line 350
    :cond_3
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩸ܽᩳ;

    iget-object v4, v4, Ll/᩸ܽᩳ;->ۧ:Ljava/util/ArrayList;

    .line 351
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v5

    invoke-interface {v1, v0, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 352
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Inconsistent SigningCertificateLineages. Not all lineages are subsets of each other."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 358
    :cond_5
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ll/᩸ܽᩳ;

    return-object p0

    :cond_6
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫([B)Ll/᩸ܽᩳ;
    .locals 16

    .line 107
    invoke-static/range {p0 .. p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    .line 108
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    const-string v2, " when parsing V3SigningCertificateLineage object"

    .line 73
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    if-eqz v0, :cond_9

    .line 75
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v5

    if-nez v5, :cond_0

    goto/16 :goto_5

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->order()Ljava/nio/ByteOrder;

    move-result-object v5

    if-ne v5, v1, :cond_8

    const/4 v1, 0x0

    .line 95
    :try_start_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_7

    .line 101
    new-instance v5, Ljava/util/HashSet;

    invoke-direct {v5}, Ljava/util/HashSet;-><init>()V

    const/4 v6, 0x0

    .line 102
    :goto_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v7

    if-eqz v7, :cond_a

    add-int/lit8 v1, v1, 0x1

    .line 104
    invoke-static {v0}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v7

    .line 105
    invoke-static {v7}, Ll/ۢܳᩳ;->֫(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 106
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v14

    .line 107
    invoke-virtual {v7}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v15

    .line 108
    invoke-static {v6}, Ll/ܶܽᩳ;->֫(I)Ll/ܶܽᩳ;

    move-result-object v9

    .line 109
    invoke-static {v7}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v13
    :try_end_0
    .catch Ll/᩷ܳᩳ; {:try_start_0 .. :try_end_0} :catch_6
    .catch Ljava/nio/BufferUnderflowException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v10, " when verifying V3SigningCertificateLineage object"

    if-eqz v4, :cond_3

    .line 112
    :try_start_1
    invoke-static {v9}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    invoke-virtual {v9}, Ll/ܶܽᩳ;->ᩳ()Ljava/lang/String;

    move-result-object v11

    .line 117
    invoke-virtual {v9}, Ll/ܶܽᩳ;->ܿ()Ljava/security/spec/AlgorithmParameterSpec;

    move-result-object v9

    .line 118
    invoke-virtual {v4}, Ll/ۡܳᩳ;->getPublicKey()Ljava/security/PublicKey;

    move-result-object v12

    move-object/from16 p0, v0

    .line 119
    invoke-static {v11}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    move-result-object v0

    .line 120
    invoke-virtual {v0, v12}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    if-eqz v9, :cond_1

    .line 122
    invoke-virtual {v0, v9}, Ljava/security/Signature;->setParameter(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 124
    :cond_1
    invoke-virtual {v0, v8}, Ljava/security/Signature;->update(Ljava/nio/ByteBuffer;)V

    .line 125
    invoke-virtual {v0, v13}, Ljava/security/Signature;->verify([B)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    .line 126
    :cond_2
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to verify signature of certificate #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " using "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object/from16 p0, v0

    .line 132
    :goto_1
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 133
    invoke-static {v8}, Ll/ۢܳᩳ;->ۧ(Ljava/nio/ByteBuffer;)[B

    move-result-object v0

    .line 134
    invoke-virtual {v8}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v8

    if-eqz v4, :cond_5

    if-ne v6, v8, :cond_4

    goto :goto_2

    .line 136
    :cond_4
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Signing algorithm ID mismatch for certificate #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 139
    :cond_5
    :goto_2
    invoke-static {v0}, Ll/ۖܳᩳ;->֫([B)Ljava/security/cert/X509Certificate;

    move-result-object v4

    .line 140
    new-instance v6, Ll/ܺܳᩳ;

    invoke-direct {v6, v4, v0}, Ll/ܺܳᩳ;-><init>(Ljava/security/cert/X509Certificate;[B)V

    .line 141
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 146
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 148
    new-instance v0, Ll/ۖᩳᩳ;

    .line 149
    invoke-static {v8}, Ll/ܶܽᩳ;->֫(I)Ll/ܶܽᩳ;

    move-result-object v11

    .line 150
    invoke-static {v15}, Ll/ܶܽᩳ;->֫(I)Ll/ܶܽᩳ;

    move-result-object v12

    move-object v9, v0

    move-object v10, v6

    invoke-direct/range {v9 .. v14}, Ll/ۖᩳᩳ;-><init>(Ll/ܺܳᩳ;Ll/ܶܽᩳ;Ll/ܶܽᩳ;[BI)V

    .line 148
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object v4, v6

    move v6, v15

    goto/16 :goto_0

    .line 142
    :cond_6
    new-instance v0, Ljava/lang/SecurityException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Encountered duplicate entries in SigningCertificateLineage at certificate #"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ".  All signing certificates should be unique"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 98
    :cond_7
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, "Encoded SigningCertificateLineage has a version different than any of which we are aware"

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ll/᩷ܳᩳ; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/nio/BufferUnderflowException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/security/InvalidKeyException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/security/InvalidAlgorithmParameterException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/SignatureException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/cert/CertificateException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 160
    new-instance v3, Ljava/lang/SecurityException;

    const-string v4, "Failed to decode certificate #"

    .line 0
    invoke-static {v1, v4, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 160
    invoke-direct {v3, v1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception v0

    goto :goto_3

    :catch_2
    move-exception v0

    goto :goto_3

    :catch_3
    move-exception v0

    goto :goto_3

    :catch_4
    move-exception v0

    .line 156
    :goto_3
    new-instance v3, Ljava/lang/SecurityException;

    const-string v4, "Failed to verify signature over signed data for certificate #"

    .line 0
    invoke-static {v1, v4, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 156
    invoke-direct {v3, v1, v0}, Ljava/lang/SecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v3

    :catch_5
    move-exception v0

    goto :goto_4

    :catch_6
    move-exception v0

    .line 153
    :goto_4
    new-instance v1, Ljava/io/IOException;

    const-string v2, "Failed to parse V3SigningCertificateLineage object"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 10
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "ByteBuffer byte order must be little endian"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_5
    move-object v3, v4

    :cond_a
    if-eqz v3, :cond_d

    .line 170
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/16 v1, 0x1c

    :cond_b
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۖᩳᩳ;

    .line 171
    iget-object v2, v2, Ll/ۖᩳᩳ;->ܽ:Ll/ܶܽᩳ;

    if-eqz v2, :cond_b

    .line 172
    invoke-virtual {v2}, Ll/ܶܽᩳ;->ܽ()I

    move-result v2

    if-le v2, v1, :cond_b

    move v1, v2

    goto :goto_6

    .line 110
    :cond_c
    new-instance v0, Ll/᩸ܽᩳ;

    invoke-direct {v0, v3, v1}, Ll/᩸ܽᩳ;-><init>(Ljava/util/ArrayList;I)V

    return-object v0

    .line 167
    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t calculate minimum SDK version of null nodes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 162
    iget-object v0, p0, Ll/᩸ܽᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public final ֫(Ljava/security/cert/X509Certificate;)Ll/᩸ܽᩳ;
    .locals 4

    if-eqz p1, :cond_2

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 303
    :goto_0
    iget-object v2, p0, Ll/᩸ܽᩳ;->ۧ:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_1

    .line 304
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ۖᩳᩳ;

    iget-object v3, v3, Ll/ۖᩳᩳ;->ܿ:Ll/ܺܳᩳ;

    invoke-virtual {v3, p1}, Ll/ܺܳᩳ;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 305
    new-instance p1, Ll/᩸ܽᩳ;

    new-instance v3, Ljava/util/ArrayList;

    add-int/lit8 v1, v1, 0x1

    .line 306
    invoke-interface {v2, v0, v1}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget v0, p0, Ll/᩸ܽᩳ;->֫:I

    invoke-direct {p1, v3, v0}, Ll/᩸ܽᩳ;-><init>(Ljava/util/ArrayList;I)V

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 311
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Certificate not found in SigningCertificateLineage"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 301
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "x509Certificate == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
