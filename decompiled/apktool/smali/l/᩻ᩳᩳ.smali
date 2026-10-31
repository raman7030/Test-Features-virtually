.class public final Ll/᩻ᩳᩳ;
.super Ljava/lang/Object;
.source "L19N"


# direct methods
.method public static ֫(Ll/ܳᩳᩳ;Ll/ܳᩳᩳ;[B)Z
    .locals 9

    .line 157
    new-instance v0, Ll/ܿᩳᩳ;

    new-instance v1, Ll/᩺ܽᩳ;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-direct {v0, v1}, Ll/ܿᩳᩳ;-><init>(Ljava/util/function/Supplier;)V

    .line 158
    new-instance v1, Ll/ܿᩳᩳ;

    new-instance v2, Ll/ܰܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-direct {v1, v2}, Ll/ܿᩳᩳ;-><init>(Ljava/util/function/Supplier;)V

    .line 159
    new-instance v2, Ll/ܿᩳᩳ;

    new-instance v3, Ll/ۖۛ᩻;

    const/4 v4, 0x1

    invoke-direct {v3, v4}, Ll/ۖۛ᩻;-><init>(I)V

    invoke-direct {v2, v3}, Ll/ܿᩳᩳ;-><init>(Ljava/util/function/Supplier;)V

    .line 160
    new-instance v3, Ll/ܿᩳᩳ;

    new-instance v4, Ll/ۘۛ᩻;

    const/4 v5, 0x1

    invoke-direct {v4, v5}, Ll/ۘۛ᩻;-><init>(I)V

    invoke-direct {v3, v4}, Ll/ܿᩳᩳ;-><init>(Ljava/util/function/Supplier;)V

    .line 163
    iget-object v4, p0, Ll/ܳᩳᩳ;->֫:Ll/ۧܽᩳ;

    const-string v5, "SHA-256-Digest-Manifest"

    invoke-virtual {v4, v5}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x2

    if-eqz v5, :cond_0

    .line 164
    invoke-virtual {v1}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v4, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    invoke-static {v4, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 165
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_1

    :cond_0
    const-string v5, "SHA1-Digest-Manifest"

    .line 168
    invoke-virtual {v4, v5}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 169
    invoke-virtual {v0}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v4, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    invoke-static {v4, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 170
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_1

    :cond_1
    const-string v5, "SHA-512-Digest-Manifest"

    .line 173
    invoke-virtual {v4, v5}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 174
    invoke-virtual {v3}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v4, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    invoke-static {v4, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 175
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_1

    :cond_2
    const-string v5, "SHA-384-Digest-Manifest"

    .line 178
    invoke-virtual {v4, v5}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_3

    .line 179
    invoke-virtual {v2}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/security/MessageDigest;

    invoke-virtual {v5, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v5

    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    .line 180
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto/16 :goto_1

    .line 185
    :cond_3
    iget-object p0, p0, Ll/ܳᩳᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {p0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۧܽᩳ;

    .line 186
    invoke-virtual {v4}, Ll/ۧܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object v5

    .line 187
    iget-object v7, p1, Ll/ܳᩳᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v7, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/ۧܽᩳ;

    if-nez v5, :cond_5

    goto/16 :goto_0

    :cond_5
    const-string v7, "SHA256-Digest"

    .line 193
    invoke-virtual {v4, v7}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    .line 194
    invoke-virtual {v1}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ᩳ()I

    move-result v8

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ܽ()I

    move-result v5

    invoke-virtual {v4, p2, v8, v5}, Ljava/security/MessageDigest;->update([BII)V

    .line 195
    invoke-virtual {v1}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    invoke-static {v4, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 196
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto/16 :goto_0

    :cond_6
    const-string v7, "SHA1-Digest"

    .line 200
    invoke-virtual {v4, v7}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_7

    .line 201
    invoke-virtual {v0}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ᩳ()I

    move-result v8

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ܽ()I

    move-result v5

    invoke-virtual {v4, p2, v8, v5}, Ljava/security/MessageDigest;->update([BII)V

    .line 202
    invoke-virtual {v0}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    invoke-static {v4, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 203
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_7
    const-string v7, "SHA512-Digest"

    .line 207
    invoke-virtual {v4, v7}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_8

    .line 208
    invoke-virtual {v3}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ᩳ()I

    move-result v8

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ܽ()I

    move-result v5

    invoke-virtual {v4, p2, v8, v5}, Ljava/security/MessageDigest;->update([BII)V

    .line 209
    invoke-virtual {v3}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/MessageDigest;

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    invoke-static {v4, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v4

    .line 210
    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    goto :goto_0

    :cond_8
    const-string v7, "SHA384-Digest"

    .line 214
    invoke-virtual {v4, v7}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_9

    .line 215
    invoke-virtual {v2}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/security/MessageDigest;

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ᩳ()I

    move-result v8

    invoke-virtual {v5}, Ll/ۧܽᩳ;->ܽ()I

    move-result v5

    invoke-virtual {v7, p2, v8, v5}, Ljava/security/MessageDigest;->update([BII)V

    .line 216
    invoke-virtual {v2}, Ll/ܿᩳᩳ;->֫()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/security/MessageDigest;

    invoke-virtual {v5}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v5

    invoke-static {v5, v6}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object v5

    .line 217
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_9
    :goto_0
    const/4 p0, 0x0

    return p0

    :cond_a
    :goto_1
    const/4 p0, 0x1

    return p0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ll/᩹ۧᩳ;Ll/ܿۖ᩷;)Z
    .locals 11

    .line 67
    iget-object v0, p1, Ll/᩹ۧᩳ;->ᩳ:Ll/ܶۧᩳ;

    iget-object v1, p1, Ll/᩹ۧᩳ;->ܿ:Ll/ܶۧᩳ;

    iget-object p1, p1, Ll/᩹ۧᩳ;->ܳ:Ll/ܶۧᩳ;

    new-instance v2, Ll/ᩳܰۡ;

    invoke-direct {v2, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 71
    :try_start_0
    invoke-virtual {v2}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v6, v3

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۗ᩺ۡ;

    .line 72
    invoke-virtual {v7}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v8

    const-string v9, "META-INF/"

    .line 73
    invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    const-string v9, ".RSA"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".DSA"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-nez v9, :cond_1

    const-string v9, ".EC"

    invoke-virtual {v8, v9}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_0

    :cond_1
    const/16 v9, 0x2e

    .line 74
    invoke-virtual {v8, v9}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v9

    .line 75
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v4, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ".SF"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2, v8}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v8, :cond_0

    .line 78
    :try_start_1
    new-instance v9, Ll/ᩳܳᩳ;

    .line 1757
    invoke-virtual {v2, v7, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v7

    .line 78
    invoke-direct {v9, v7}, Ll/ᩳܳᩳ;-><init>([B)V

    .line 1757
    invoke-virtual {v2, v8, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v6

    .line 80
    invoke-virtual {v9, v6}, Ll/ᩳܳᩳ;->֫([B)Z

    move-result v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v5, :cond_0

    :cond_2
    :try_start_2
    const-string p0, "META-INF/MANIFEST.MF"

    .line 90
    invoke-virtual {v2, p0}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 1757
    invoke-virtual {v2, p0, v3}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v3

    :cond_3
    if-eqz v5, :cond_7

    if-eqz v3, :cond_7

    .line 95
    new-instance p0, Ll/ܳᩳᩳ;

    invoke-direct {p0, v3}, Ll/ܳᩳᩳ;-><init>([B)V

    .line 96
    new-instance v5, Ll/ܳᩳᩳ;

    invoke-direct {v5, v6}, Ll/ܳᩳᩳ;-><init>([B)V

    .line 97
    iget-object v6, v5, Ll/ܳᩳᩳ;->֫:Ll/ۧܽᩳ;

    const-string v7, "X-Android-APK-Signed"

    invoke-virtual {v6, v7}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    const-string v7, ","

    .line 99
    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    .line 100
    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_5

    aget-object v9, v6, v8

    .line 101
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    move-result v10

    packed-switch v10, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const-string v10, "4"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 113
    iget-object v9, p1, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v9}, Ll/᩸ۧᩳ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 114
    sget-object v9, Ll/᩸ۧᩳ;->᩶:Ll/᩸ۧᩳ;

    iput-object v9, p1, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    goto :goto_2

    :pswitch_1
    const-string v10, "3"

    .line 101
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 108
    iget-object v9, v1, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v9}, Ll/᩸ۧᩳ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 109
    sget-object v9, Ll/᩸ۧᩳ;->᩶:Ll/᩸ۧᩳ;

    iput-object v9, v1, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    goto :goto_2

    :pswitch_2
    const-string v10, "2"

    .line 101
    invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 103
    iget-object v9, v0, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    invoke-virtual {v9}, Ll/᩸ۧᩳ;->᩻()Z

    move-result v9

    if-eqz v9, :cond_4

    .line 104
    sget-object v9, Ll/᩸ۧᩳ;->᩶:Ll/᩸ۧᩳ;

    iput-object v9, v0, Ll/ܶۧᩳ;->ۧ:Ll/᩸ۧᩳ;

    :cond_4
    :goto_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 120
    :cond_5
    invoke-interface {p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p1, :cond_6

    .line 131
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V

    return v4

    .line 123
    :cond_6
    :try_start_3
    invoke-static {v5, p0, v3}, Ll/᩻ᩳᩳ;->֫(Ll/ܳᩳᩳ;Ll/ܳᩳᩳ;[B)Z

    move-result p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz p1, :cond_7

    .line 125
    :try_start_4
    invoke-static {v2, p0, p2}, Ll/᩻ᩳᩳ;->֫(Ll/ᩳܰۡ;Ll/ܳᩳᩳ;Ll/ܿۖ᩷;)Z

    move-result p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 131
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V

    return p0

    :catch_1
    :cond_7
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V

    return v4

    :catchall_0
    move-exception p0

    .line 67
    :try_start_5
    invoke-virtual {v2}, Ll/ᩳܰۡ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception p1

    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p0

    :pswitch_data_0
    .packed-switch 0x32
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ᩳܰۡ;Ll/ܳᩳᩳ;Ll/ܿۖ᩷;)Z
    .locals 24

    .line 230
    new-instance v0, Ljava/util/HashMap;

    invoke-virtual/range {p0 .. p0}, Ll/ᩳܰۡ;->ᩴ()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 231
    invoke-virtual/range {p0 .. p0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object v1

    invoke-static {v1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/۬ܽᩳ;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 232
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object v1

    new-instance v2, Ll/۫ܽᩳ;

    invoke-direct {v2, v0}, Ll/۫ܽᩳ;-><init>(Ljava/util/HashMap;)V

    .line 233
    invoke-interface {v1, v2}, Ll/ܿ᩺ᩴ;->forEach(Ljava/util/function/Consumer;)V

    .line 235
    new-instance v1, Ll/۟ܽᩳ;

    invoke-direct {v1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 241
    new-instance v2, Ll/ۧᩳᩳ;

    invoke-direct {v2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 247
    new-instance v3, Ll/ܽᩳᩳ;

    invoke-direct {v3}, Ljava/lang/ThreadLocal;-><init>()V

    .line 253
    new-instance v4, Ll/ᩳᩳᩳ;

    invoke-direct {v4}, Ljava/lang/ThreadLocal;-><init>()V

    .line 259
    invoke-virtual/range {p0 .. p0}, Ll/ᩳܰۡ;->ۙ()Ll/ܳܰۡ;

    move-result-object v13

    .line 260
    new-instance v14, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v15, 0x0

    invoke-direct {v14, v15}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 261
    new-instance v12, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v11, 0x0

    invoke-direct {v12, v11}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 296
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v5, p1

    .line 299
    iget-object v5, v5, Ll/ܳᩳᩳ;->ۧ:Ljava/util/HashMap;

    invoke-virtual {v5}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const-wide/16 v17, 0x0

    move-wide/from16 v5, v17

    :goto_0
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ۧܽᩳ;

    .line 300
    invoke-virtual {v7}, Ll/ۧܽᩳ;->ۧ()Ljava/lang/String;

    move-result-object v8

    .line 301
    invoke-virtual {v0, v8}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ll/ۗ᩺ۡ;

    if-nez v9, :cond_1

    .line 303
    invoke-static {v8}, Ll/ۗܽᩳ;->֫(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_0

    goto :goto_0

    :cond_0
    :goto_1
    const/4 v0, 0x0

    goto/16 :goto_8

    :cond_1
    const-string v8, "SHA-256-Digest"

    .line 311
    invoke-virtual {v7, v8}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    const-string v8, "SHA1-Digest"

    .line 313
    invoke-virtual {v7, v8}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    move-object v7, v1

    goto :goto_2

    :cond_3
    const-string v8, "SHA-512-Digest"

    .line 315
    invoke-virtual {v7, v8}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    move-object v7, v4

    goto :goto_2

    :cond_4
    const-string v8, "SHA-384-Digest"

    .line 317
    invoke-virtual {v7, v8}, Ll/ۧܽᩳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_5

    move-object v7, v3

    .line 326
    :goto_2
    invoke-virtual {v9}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v19

    add-long v19, v19, v5

    .line 327
    new-instance v6, Ll/֫ᩳᩳ;

    move-object v5, v6

    move-object v15, v6

    move-object v6, v9

    move-object/from16 v9, p2

    move-object/from16 v21, v1

    move-object v1, v10

    move-object v10, v14

    move-object/from16 v22, v11

    move-object v11, v13

    move-object/from16 v23, v12

    invoke-direct/range {v5 .. v12}, Ll/֫ᩳᩳ;-><init>(Ll/ۗ᩺ۡ;Ljava/lang/ThreadLocal;Ljava/lang/String;Ll/ܿۖ᩷;Ljava/util/concurrent/atomic/AtomicBoolean;Ll/ܳܰۡ;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v10, v1

    move-wide/from16 v5, v19

    move-object/from16 v1, v21

    move-object/from16 v11, v22

    const/4 v15, 0x0

    goto :goto_0

    .line 320
    :cond_5
    invoke-virtual {v7}, Ll/ۧܽᩳ;->֫()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v1, Ll/ۤܽᩳ;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ll/ۤܽᩳ;-><init>(I)V

    .line 321
    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    .line 322
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v1

    invoke-interface {v0, v1}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    .line 323
    invoke-static {v0}, Ll/ۧ۫ᩴ;->toString(Ljava/lang/Object;)Ljava/lang/String;

    const/4 v0, 0x0

    return v0

    :cond_6
    move-object v1, v10

    move-object/from16 v22, v11

    move-object/from16 v23, v12

    .line 330
    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, "META-INF/"

    .line 331
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_7

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_8
    if-eqz v2, :cond_9

    goto/16 :goto_1

    .line 340
    :cond_9
    new-instance v0, Ll/ۛܽᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0}, Ll/۠۬ᩴ;->comparingLong(Ljava/util/function/ToLongFunction;)Ljava/util/Comparator;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 341
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 342
    sget v2, Ll/ܿ᩸ۡ;->֫:I

    add-int/lit8 v2, v2, 0x1

    int-to-float v2, v2

    const/high16 v3, 0x3fc00000    # 1.5f

    mul-float v2, v2, v3

    float-to-int v2, v2

    int-to-long v2, v2

    .line 343
    div-long/2addr v5, v2

    const/4 v2, 0x0

    move-object/from16 v11, v22

    .line 347
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v2, v3, :cond_c

    .line 348
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/֫ᩳᩳ;

    if-nez v11, :cond_a

    .line 350
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 351
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 352
    iget-object v3, v3, Ll/֫ᩳᩳ;->۫:Ll/ۗ᩺ۡ;

    invoke-virtual {v3}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v7

    .line 353
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v11, v4

    :goto_5
    move-wide/from16 v17, v7

    goto :goto_6

    .line 355
    :cond_a
    iget-object v4, v3, Ll/֫ᩳᩳ;->۫:Ll/ۗ᩺ۡ;

    invoke-virtual {v4}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v7

    add-long v7, v7, v17

    cmp-long v4, v7, v5

    if-lez v4, :cond_b

    add-int/lit8 v2, v2, -0x1

    move-object/from16 v11, v22

    goto :goto_6

    .line 360
    :cond_b
    invoke-interface {v11, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :goto_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 366
    :cond_c
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-static {v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    move-result-object v1

    .line 367
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 368
    new-instance v3, Ll/ۨܽᩳ;

    invoke-direct {v3, v2}, Ll/ۨܽᩳ;-><init>(Ljava/util/List;)V

    invoke-interface {v1, v3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_7

    .line 374
    :cond_d
    invoke-static {v1}, Ll/֫ۨۡ;->֫(Ljava/util/concurrent/ExecutorService;)V

    .line 375
    invoke-virtual/range {p0 .. p0}, Ll/ᩳܰۡ;->֫()V

    .line 376
    invoke-interface/range {p2 .. p2}, Ll/ܿۖ᩷;->᩻()Z

    move-result v0

    if-eqz v0, :cond_e

    goto/16 :goto_1

    :goto_8
    return v0

    .line 379
    :cond_e
    invoke-virtual/range {v23 .. v23}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_10

    .line 381
    instance-of v1, v0, Ljava/io/IOException;

    if-eqz v1, :cond_f

    .line 382
    check-cast v0, Ljava/io/IOException;

    throw v0

    .line 384
    :cond_f
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 387
    :cond_10
    invoke-virtual {v14}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public static ֫(Ll/ܶ᩵ܿ;)[B
    .locals 7

    .line 44
    new-instance v0, Ll/ᩳܰۡ;

    invoke-direct {v0, p0}, Ll/ᩳܰۡ;-><init>(Ll/ܶ᩵ܿ;)V

    .line 45
    :try_start_0
    invoke-virtual {v0}, Ll/ᩳܰۡ;->᩶ۧ()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :catch_0
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩺ۡ;

    .line 46
    invoke-virtual {v1}, Ll/ۗ᩺ۡ;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, "META-INF/"

    .line 47
    invoke-virtual {v3, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    const-string v4, ".RSA"

    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, ".DSA"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_1

    const-string v4, ".EC"

    invoke-virtual {v3, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    :cond_1
    const/16 v4, 0x2e

    .line 49
    invoke-virtual {v3, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v4

    .line 50
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v6, 0x0

    invoke-virtual {v3, v6, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ".SF"

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_0

    .line 53
    :try_start_1
    new-instance v3, Ll/ᩳܳᩳ;

    .line 1757
    invoke-virtual {v0, v1, v2}, Ll/ᩳܰۡ;->֫(Ll/ۗ᩺ۡ;Ll/᩵ۛۡ;)[B

    move-result-object v1

    .line 53
    invoke-direct {v3, v1}, Ll/ᩳܳᩳ;-><init>([B)V

    .line 54
    invoke-virtual {v3}, Ll/ᩳܳᩳ;->֫()[Ljava/security/cert/X509Certificate;

    move-result-object v1

    aget-object v1, v1, v6

    invoke-virtual {v1}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-object p0

    :cond_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V

    return-object v2

    :catchall_0
    move-exception p0

    .line 44
    :try_start_2
    invoke-virtual {v0}, Ll/ᩳܰۡ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p0
.end method
