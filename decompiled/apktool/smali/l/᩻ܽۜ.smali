.class public final Ll/᩻ܽۜ;
.super Ljava/lang/Object;
.source "Q77G"


# direct methods
.method public static ֫([B)Ljava/lang/String;
    .locals 2

    .line 88
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    const/16 v1, 0x10

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۜ᩻ܽ;I[B)Ll/ᩳܽۜ;
    .locals 20

    .line 97
    :try_start_0
    new-instance v0, Ll/۬ۜܽ;

    move-object/from16 v1, p2

    invoke-direct {v0, v1}, Ll/۬ۜܽ;-><init>([B)V

    .line 98
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_6

    .line 102
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v6

    .line 103
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v7

    .line 104
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v8

    .line 105
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v9

    .line 106
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    .line 107
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    if-ltz v1, :cond_5

    const v2, 0x186a0

    if-gt v1, v2, :cond_5

    .line 111
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 112
    new-instance v19, Ll/ᩳܽۜ;

    move-object/from16 v3, v19

    move-object/from16 v4, p0

    move/from16 v5, p1

    move-object v11, v12

    invoke-direct/range {v3 .. v11}, Ll/ᩳܽۜ;-><init>(Ll/ۜ᩻ܽ;IZZZZILjava/util/ArrayList;)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_3

    .line 114
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v15

    .line 115
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v16

    .line 116
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v17

    .line 117
    invoke-virtual {v0}, Ll/۬ۜܽ;->ܳ()Z

    move-result v4

    if-eqz v4, :cond_2

    .line 120
    invoke-virtual {v0}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v4

    .line 121
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v5

    if-ltz v5, :cond_1

    if-gt v5, v2, :cond_1

    .line 125
    new-array v2, v5, [Ll/᩸᩻ܽ;

    const/4 v6, 0x0

    :goto_1
    if-ge v6, v5, :cond_0

    .line 127
    new-instance v7, Ll/᩸᩻ܽ;

    invoke-virtual {v0}, Ll/۬ۜܽ;->ܶ()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    invoke-direct {v7, v8, v9, v10}, Ll/᩸᩻ܽ;-><init>(Ljava/lang/String;II)V

    aput-object v7, v2, v6

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    .line 129
    :cond_0
    new-instance v5, Ll/ܿܽۜ;

    invoke-direct {v5, v4, v2}, Ll/ܿܽۜ;-><init>(Ljava/lang/String;[Ll/᩸᩻ܽ;)V

    move-object/from16 v18, v5

    goto :goto_2

    .line 123
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource entry payload style count"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v2, 0x0

    move-object/from16 v18, v2

    .line 131
    :goto_2
    new-instance v2, Ll/ܳܽۜ;

    move-object v13, v2

    move-object/from16 v14, v19

    invoke-direct/range {v13 .. v18}, Ll/ܳܽۜ;-><init>(Ll/ᩳܽۜ;IIILl/ܿܽۜ;)V

    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    const v2, 0x186a0

    goto :goto_0

    .line 133
    :cond_3
    invoke-virtual {v0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_4

    return-object v19

    .line 134
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing resource entry payload bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 109
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource entry payload value count"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 100
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported resource entry payload version"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_7

    const-string v0, "Resource patch is corrupt."

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    :goto_3
    const-string v1, "RESOURCE_PATCH_CORRUPT"

    .line 138
    invoke-static {v1, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    throw v0
.end method

.method public static ֫(Ll/ۡܿܽ;Ll/ۘᩳۜ;)V
    .locals 10

    .line 161
    invoke-virtual {p1}, Ll/ۘᩳۜ;->֫()Z

    move-result v0

    iget-object v1, p1, Ll/ۘᩳۜ;->ܽ:[B

    iget-object v2, p1, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    iget v3, p1, Ll/ۘᩳۜ;->ܳ:I

    const-string v4, "RESOURCE_PATCH_CORRUPT"

    const/4 v5, 0x0

    const v6, 0xffff

    if-nez v0, :cond_7

    ushr-int/lit8 p1, v3, 0x18

    and-int/lit16 p1, p1, 0xff

    ushr-int/lit8 v0, v3, 0x10

    and-int/lit16 v0, v0, 0xff

    and-int/2addr v3, v6

    .line 217
    invoke-virtual {p0}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll/۠ܿܽ;

    .line 218
    invoke-virtual {v6}, Ll/۠ᩳܽ;->᩻()I

    move-result v7

    if-eq v7, p1, :cond_1

    goto :goto_0

    .line 221
    :cond_1
    invoke-virtual {v6}, Ll/۠ᩳܽ;->ۖۧ()Ljava/lang/Iterable;

    move-result-object v6

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/᩶ܿܽ;

    .line 222
    invoke-virtual {v7}, Ll/ۤᩳܽ;->ۘ֫()I

    move-result v8

    if-eq v8, v0, :cond_3

    goto :goto_1

    .line 225
    :cond_3
    invoke-virtual {v7}, Ll/ۤᩳܽ;->ۢ()Ljava/lang/Iterable;

    move-result-object v7

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll/ۖܿܽ;

    .line 226
    invoke-static {v8}, Ll/ۖᩳۜ;->֫(Ll/ۜ᩻ܽ;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v8, v3}, Ll/ۖܿܽ;->ܺ(I)Z

    move-result v9

    if-eqz v9, :cond_4

    .line 227
    new-instance v5, Ll/ܽܽۜ;

    invoke-direct {v5, v8}, Ll/ܽܽۜ;-><init>(Ll/ۖܿܽ;)V

    :cond_5
    if-eqz v5, :cond_6

    .line 149
    iget-object p0, v5, Ll/ܽܽۜ;->֫:Ll/ۖܿܽ;

    .line 153
    invoke-static {p0, v3, v1}, Ll/᩻ܽۜ;->֫(Ll/ۜ᩻ܽ;I[B)Ll/ᩳܽۜ;

    move-result-object p1

    .line 154
    invoke-virtual {p0, v3}, Ll/ۖܿܽ;->ᩳ(I)V

    .line 155
    invoke-virtual {p0, v3}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object p0

    .line 156
    invoke-virtual {p0, p1}, Ll/ᩴܿܽ;->֫(Ll/᩷᩻ܽ;)V

    return-void

    :cond_6
    const-string p0, "Resource patch target is missing from base resources.arsc."

    .line 150
    invoke-static {v4, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    .line 167
    :cond_7
    :try_start_0
    invoke-virtual {p0}, Ll/ۡᩳܽ;->᩺()Ljava/lang/Iterable;

    move-result-object p0

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۠ܿܽ;

    .line 168
    invoke-virtual {v0}, Ll/۠ᩳܽ;->᩻()I

    move-result v7

    ushr-int/lit8 v8, v3, 0x18

    if-ne v7, v8, :cond_8

    move-object v5, v0

    :cond_9
    if-eqz v5, :cond_c

    .line 174
    iget-object p0, p1, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    ushr-int/lit8 v0, v3, 0x10

    and-int/lit16 v0, v0, 0xff

    invoke-virtual {v5, v0, p0}, Ll/۠ܿܽ;->ۧ(ILjava/lang/String;)Ll/᩶ܿܽ;

    move-result-object p0

    and-int v0, v3, v6

    .line 176
    iget-object p1, p1, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    const/4 v3, 0x0

    .line 102
    invoke-virtual {p0, v0, p1, v3}, Ll/᩶ܿܽ;->֫(ILjava/lang/String;Z)V

    const-string p1, "default"

    .line 178
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_a

    const-string v2, ""

    :cond_a
    invoke-virtual {v5}, Ll/۠ᩳܽ;->֫ۧ()Ll/ۤܽܽ;

    move-result-object p1

    .line 177
    invoke-static {v2, p1}, Ll/᩸ܽܽ;->֫(Ljava/lang/String;Ll/ۤܽܽ;)Ll/᩸ܽܽ;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/᩶ܿܽ;->֫(Ll/᩸ܽܽ;)Ll/ۖܿܽ;

    move-result-object p0

    .line 179
    invoke-virtual {p0, v0}, Ll/ۖܿܽ;->ܺ(I)Z

    move-result p1

    if-nez p1, :cond_b

    .line 181
    invoke-virtual {p0, v0}, Ll/ۖܿܽ;->֫(I)Ll/ᩴܿܽ;

    move-result-object p1

    .line 182
    invoke-static {p0, v0, v1}, Ll/᩻ܽۜ;->֫(Ll/ۜ᩻ܽ;I[B)Ll/ᩳܽۜ;

    move-result-object p0

    .line 183
    invoke-virtual {p1, p0}, Ll/ᩴܿܽ;->֫(Ll/᩷᩻ܽ;)V

    return-void

    .line 179
    :cond_b
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Added resource variant already exists"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 173
    :cond_c
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Resource patch package is missing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 188
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    const-string p0, "Resource patch is corrupt."

    goto :goto_2

    :cond_d
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    .line 187
    :goto_2
    invoke-static {v4, p0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    .line 185
    throw p0
.end method

.method public static ֫(Ll/᩷᩻ܽ;)[B
    .locals 8

    .line 45
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x100

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v1, 0x1

    .line 46
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 47
    invoke-interface {p0}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 48
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ۛ֫()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 49
    invoke-interface {p0}, Ll/᩷᩻ܽ;->᩸()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 50
    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܰ()Z

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->֫(Z)V

    .line 51
    invoke-interface {p0}, Ll/᩷᩻ܽ;->getParent()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 193
    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {p0}, Ll/᩷᩻ܽ;->ܽ֫()I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 194
    invoke-interface {p0}, Ll/᩷᩻ܽ;->values()Ljava/lang/Iterable;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/֨᩻ܽ;

    .line 195
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 204
    :cond_0
    invoke-interface {p0}, Ll/᩷᩻ܽ;->᩻֫()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    const/4 p0, 0x0

    goto :goto_1

    .line 207
    :cond_1
    invoke-interface {p0}, Ll/᩷᩻ܽ;->getType()Ll/֡᩻ܽ;

    move-result-object p0

    invoke-interface {p0}, Ll/֡᩻ܽ;->getTypeName()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۖᩳۜ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v3, "style"

    .line 209
    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    :goto_1
    if-eqz p0, :cond_2

    .line 198
    new-instance p0, Ll/ۧܽۜ;

    const/4 v3, 0x0

    invoke-direct {p0, v3}, Ll/ۧܽۜ;-><init>(I)V

    invoke-static {p0}, Ll/۠۬ᩴ;->comparingInt(Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;

    move-result-object p0

    invoke-static {v2, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 53
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p0

    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 54
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֨᩻ܽ;

    .line 55
    invoke-interface {v2}, Ll/֨᩻ܽ;->ۡ֫()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 56
    invoke-interface {v2}, Ll/֨᩻ܽ;->ۖ()I

    move-result v3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    .line 57
    invoke-interface {v2}, Ll/֨᩻ܽ;->ᩳ֫()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v3

    if-eqz v3, :cond_5

    .line 58
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 59
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 60
    invoke-interface {v2}, Ll/֨᩻ܽ;->ܿۧ()Ll/ۗ᩻ܽ;

    move-result-object v2

    .line 61
    invoke-interface {v2}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 62
    invoke-interface {v2}, Ll/ۗ᩻ܽ;->᩶֫()[Ll/᩸᩻ܽ;

    move-result-object v2

    if-nez v2, :cond_4

    const/4 v3, 0x0

    goto :goto_3

    .line 63
    :cond_4
    array-length v3, v2

    :goto_3
    invoke-virtual {v0, v3}, Ll/ۤۜܽ;->writeInt(I)V

    if-eqz v2, :cond_3

    .line 65
    array-length v3, v2

    const/4 v5, 0x0

    :goto_4
    if-ge v5, v3, :cond_3

    aget-object v6, v2, v5

    .line 66
    iget-object v7, v6, Ll/᩸᩻ܽ;->ܽ:Ljava/lang/String;

    invoke-virtual {v0, v7}, Ll/ۤۜܽ;->ᩳ(Ljava/lang/String;)V

    .line 67
    iget v7, v6, Ll/᩸᩻ܽ;->ۧ:I

    invoke-virtual {v0, v7}, Ll/ۤۜܽ;->writeInt(I)V

    .line 68
    iget v6, v6, Ll/᩸᩻ܽ;->֫:I

    invoke-virtual {v0, v6}, Ll/ۤۜܽ;->writeInt(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    .line 72
    :cond_5
    invoke-interface {v2}, Ll/֨᩻ܽ;->getValue()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 91
    invoke-virtual {v0, v4}, Ll/ۤۜܽ;->writeByte(I)V

    goto :goto_2

    .line 76
    :cond_6
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object p0

    return-object p0
.end method
