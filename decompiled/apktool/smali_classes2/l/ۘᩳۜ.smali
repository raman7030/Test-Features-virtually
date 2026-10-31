.class public final Ll/ۘᩳۜ;
.super Ljava/lang/Object;
.source "A774"


# instance fields
.field public final ֫:[B

.field public final ۜ:Ljava/lang/String;

.field public final ۢ:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:I

.field public final ܽ:[B

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:Ljava/lang/String;

.field public final ᩷:Ljava/lang/String;

.field public final ᩻:[B


# direct methods
.method public constructor <init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput p1, p0, Ll/ۘᩳۜ;->ܳ:I

    .line 47
    iput-object p2, p0, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    .line 48
    iput-object p8, p0, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    .line 49
    iput-object p9, p0, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    .line 50
    array-length p1, p3

    invoke-static {p3, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘᩳۜ;->᩻:[B

    .line 51
    invoke-static {p3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/ۘᩳۜ;->ۜ:Ljava/lang/String;

    .line 52
    iput-object p5, p0, Ll/ۘᩳۜ;->ܿ:Ljava/lang/String;

    .line 53
    iput-object p6, p0, Ll/ۘᩳۜ;->ᩳ:Ljava/lang/String;

    .line 54
    array-length p1, p4

    invoke-static {p4, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘᩳۜ;->֫:[B

    .line 55
    array-length p1, p7

    invoke-static {p7, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Ll/ۘᩳۜ;->ܽ:[B

    return-void
.end method

.method public static ֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 2

    .line 247
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 248
    new-instance p0, Ll/ۛۚۢ;

    const/4 v1, 0x4

    invoke-direct {p0, v1}, Ll/ۛۚۢ;-><init>(I)V

    invoke-static {p0}, Ll/۠۬ᩴ;->comparing(Ljava/util/function/Function;)Ljava/util/Comparator;

    move-result-object p0

    invoke-static {v0, p0}, Ll/ۛ۬ᩴ;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/ۘᩳۜ;
    .locals 11

    .line 73
    new-instance v10, Ll/ۘᩳۜ;

    invoke-static {p0, p1}, Ll/ۘᩳۜ;->֫(ILjava/lang/String;)[B

    move-result-object v3

    .line 74
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    const-string v5, "missing"

    .line 75
    invoke-static {p4}, Ll/᩻ܽۜ;->֫([B)Ljava/lang/String;

    move-result-object v6

    move-object v0, v10

    move v1, p0

    move-object v2, p1

    move-object v7, p4

    move-object v8, p2

    move-object v9, p3

    invoke-direct/range {v0 .. v9}, Ll/ۘᩳۜ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)V

    return-object v10
.end method

.method public static ֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 1

    .line 183
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ".bin"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll/ܶ᩵ܿ;->ᩳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    return-object p0
.end method

.method private ֫(Ljava/io/OutputStream;)V
    .locals 6

    .line 263
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x60

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x4d525050    # 2.2052992E8f

    .line 264
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x2

    .line 265
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 266
    iget v1, p0, Ll/ۘᩳۜ;->ܳ:I

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 267
    iget-object v1, p0, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 268
    invoke-virtual {p0}, Ll/ۘᩳۜ;->֫()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 269
    invoke-virtual {p0}, Ll/ۘᩳۜ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 270
    iget-object v1, p0, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 271
    iget-object v1, p0, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 273
    :cond_0
    iget-object v1, p0, Ll/ۘᩳۜ;->ܿ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 274
    iget-object v1, p0, Ll/ۘᩳۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 275
    iget-object v1, p0, Ll/ۘᩳۜ;->֫:[B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->write([B)V

    .line 276
    iget-object v1, p0, Ll/ۘᩳۜ;->ܽ:[B

    array-length v2, v1

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 277
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    .line 278
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v3

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Ljava/util/zip/CRC32;->update([BII)V

    .line 279
    array-length v3, v1

    invoke-virtual {v2, v1, v5, v3}, Ljava/util/zip/CRC32;->update([BII)V

    .line 280
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    .line 281
    invoke-virtual {p1, v1}, Ljava/io/OutputStream;->write([B)V

    .line 283
    invoke-virtual {v0}, Ll/ۤۜܽ;->ᩳ()V

    .line 284
    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    invoke-virtual {v0, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 285
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->֫(Ljava/io/OutputStream;)V

    return-void
.end method

.method public static ֫(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p0, :cond_5

    .line 190
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x44

    if-ne v1, v2, :cond_5

    const-string v1, ".bin"

    .line 191
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/16 v2, 0x40

    if-ge v1, v2, :cond_4

    .line 195
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x30

    if-lt v2, v3, :cond_1

    const/16 v3, 0x39

    if-le v2, v3, :cond_2

    :cond_1
    const/16 v3, 0x61

    if-lt v2, v3, :cond_3

    const/16 v3, 0x66

    if-le v2, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return v0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_2
    return v0
.end method

.method public static ֫(ILjava/lang/String;)[B
    .locals 2

    .line 207
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x40

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v1, 0x1

    .line 208
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 209
    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->writeInt(I)V

    .line 210
    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    .line 211
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->֫(Ljava/security/MessageDigest;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/util/ArrayList;[B)[B
    .locals 3

    .line 218
    invoke-static {p0}, Ll/ۘᩳۜ;->֫(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object p0

    .line 219
    new-instance v0, Ll/ۤۜܽ;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    mul-int/lit8 v1, v1, 0x40

    add-int/lit8 v1, v1, 0x40

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const/4 v1, 0x2

    .line 220
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x0

    .line 44
    array-length v2, p1

    invoke-virtual {v0, p1, v1, v2}, Ll/ۤۜܽ;->write([BII)V

    .line 222
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 223
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۘᩳۜ;

    .line 224
    iget-object v1, p1, Ll/ۘᩳۜ;->᩻:[B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->write([B)V

    .line 225
    iget-object v1, p1, Ll/ۘᩳۜ;->֫:[B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->write([B)V

    .line 226
    invoke-virtual {p1}, Ll/ۘᩳۜ;->֫()Z

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Z)V

    .line 227
    invoke-virtual {p1}, Ll/ۘᩳۜ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 228
    iget-object v1, p1, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 229
    iget-object v1, p1, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->֫(Ljava/lang/CharSequence;)V

    .line 231
    :cond_0
    iget-object p1, p1, Ll/ۘᩳۜ;->ᩳ:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ll/ۤۜܽ;->ܿ(Ljava/lang/String;)V

    goto :goto_0

    .line 233
    :cond_1
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object p0

    invoke-virtual {v0, p0}, Ll/ۤۜܽ;->֫(Ljava/security/MessageDigest;)[B

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)Ll/ۘᩳۜ;
    .locals 11

    .line 64
    invoke-static {p0, p1}, Ll/ۘᩳۜ;->֫(ILjava/lang/String;)[B

    move-result-object v3

    .line 65
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p4}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    .line 66
    new-instance v10, Ll/ۘᩳۜ;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, v10

    move v1, p0

    move-object v2, p1

    move-object v5, p2

    move-object v6, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v9}, Ll/ۘᩳۜ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)V

    return-object v10
.end method

.method public static ۧ(Ll/ܶ᩵ܿ;)Ll/ۘᩳۜ;
    .locals 23

    const-string v0, ".bin"

    const-string v1, "sha256:"

    .line 94
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->getName()Ljava/lang/String;

    move-result-object v2

    .line 95
    invoke-static {v2}, Ll/ۘᩳۜ;->֫(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "RESOURCE_PATCH_CORRUPT"

    if-eqz v3, :cond_f

    .line 99
    :try_start_0
    invoke-virtual/range {p0 .. p0}, Ll/ܶ᩵ܿ;->ۘۧ()[B

    move-result-object v3

    .line 100
    new-instance v5, Ll/۬ۜܽ;

    invoke-direct {v5, v3}, Ll/۬ۜܽ;-><init>([B)V

    .line 101
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const v7, 0x4d525050    # 2.2052992E8f

    const-string v8, "Unsupported resource patch format"

    if-ne v6, v7, :cond_d

    .line 104
    :try_start_1
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v6

    const/4 v7, 0x2

    const/4 v9, 0x1

    if-eq v6, v9, :cond_1

    if-ne v6, v7, :cond_0

    goto :goto_0

    .line 106
    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 108
    :cond_1
    :goto_0
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v10

    .line 109
    invoke-virtual {v5}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v11

    if-lt v6, v7, :cond_3

    .line 112
    invoke-virtual {v5}, Ll/۬ۜܽ;->ܳ()Z

    move-result v7

    if-eqz v7, :cond_3

    .line 113
    invoke-virtual {v5}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v7

    .line 114
    invoke-virtual {v5}, Ll/۬ۜܽ;->᩶()Ljava/lang/String;

    move-result-object v8

    .line 115
    invoke-virtual {v7}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v8}, Ljava/lang/String;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_2

    move-object/from16 v17, v7

    move-object/from16 v18, v8

    goto :goto_1

    .line 116
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource patch identity"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const/4 v7, 0x0

    move-object/from16 v17, v7

    move-object/from16 v18, v17

    .line 119
    :goto_1
    invoke-virtual {v5}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v14

    .line 120
    invoke-virtual {v5}, Ll/۬ۜܽ;->᩹()Ljava/lang/String;

    move-result-object v7

    const/16 v8, 0x20

    new-array v13, v8, [B

    .line 61
    invoke-virtual {v5, v8, v13}, Ll/۬ۜܽ;->֫(I[B)V

    .line 123
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    if-ltz v8, :cond_c

    move-object/from16 p0, v14

    int-to-long v14, v8

    .line 124
    invoke-virtual {v5}, Ll/۬ۜܽ;->available()J

    move-result-wide v19

    const-wide/16 v21, 0x4

    sub-long v19, v19, v21

    cmp-long v9, v14, v19

    if-gtz v9, :cond_c

    .line 127
    new-array v15, v8, [B

    .line 61
    invoke-virtual {v5, v8, v15}, Ll/۬ۜܽ;->֫(I[B)V

    .line 129
    invoke-virtual {v5}, Ll/۬ۜܽ;->readInt()I

    move-result v9

    .line 130
    invoke-virtual {v5}, Ll/۬ۜܽ;->available()J

    move-result-wide v19

    const-wide/16 v21, 0x0

    cmp-long v5, v19, v21

    if-nez v5, :cond_b

    .line 133
    new-instance v5, Ljava/util/zip/CRC32;

    invoke-direct {v5}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v12, 0x1

    if-ne v6, v12, :cond_4

    move-object v14, v15

    goto :goto_2

    :cond_4
    move-object v14, v3

    :goto_2
    if-ne v6, v12, :cond_5

    goto :goto_3

    .line 135
    :cond_5
    array-length v3, v3

    add-int/lit8 v8, v3, -0x4

    :goto_3
    const/4 v3, 0x0

    .line 134
    invoke-virtual {v5, v14, v3, v8}, Ljava/util/zip/CRC32;->update([BII)V

    .line 136
    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v5

    long-to-int v3, v5

    if-ne v3, v9, :cond_a

    .line 139
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v3

    invoke-virtual {v3, v15}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v3

    invoke-static {v13, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 142
    invoke-static {v15}, Ll/᩻ܽۜ;->֫([B)Ljava/lang/String;

    move-result-object v3

    .line 144
    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    .line 145
    invoke-static {v13}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 146
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v5, 0x28

    if-ne v1, v5, :cond_6

    .line 147
    invoke-static {}, Ll/ܳۤۡ;->ۧ()Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1, v15}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v1

    .line 146
    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    .line 147
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    .line 148
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch targetVersion mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 150
    :cond_7
    :goto_4
    invoke-static {v10, v11}, Ll/ۘᩳۜ;->֫(ILjava/lang/String;)[B

    move-result-object v12

    .line 151
    invoke-static {v12}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    .line 152
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 155
    new-instance v0, Ll/ۘᩳۜ;

    move-object v9, v0

    move-object/from16 v14, p0

    move-object v1, v15

    move-object v15, v3

    move-object/from16 v16, v1

    invoke-direct/range {v9 .. v18}, Ll/ۘᩳۜ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)V

    return-object v0

    .line 153
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch target hash mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 140
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch entry hash mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 137
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Resource patch CRC mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 131
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing resource patch bytes"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid resource patch payload length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_d
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 158
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_e

    const-string v0, "Resource patch is corrupt."

    goto :goto_5

    :cond_e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 289
    :goto_5
    invoke-static {v4, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 158
    throw v0

    :cond_f
    const-string v0, "Invalid resource patch file name."

    .line 289
    invoke-static {v4, v0}, Ll/ۗۛ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ll/ۗۛ᩻;

    move-result-object v0

    .line 96
    throw v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;[BLjava/lang/String;)Ll/ۘᩳۜ;
    .locals 11

    .line 80
    new-instance v10, Ll/ۘᩳۜ;

    .line 81
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/security/MessageDigest;->digest([B)[B

    move-result-object v4

    iget-object v8, p0, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    iget-object v9, p0, Ll/ۘᩳۜ;->ۧ:Ljava/lang/String;

    iget v1, p0, Ll/ۘᩳۜ;->ܳ:I

    iget-object v2, p0, Ll/ۘᩳۜ;->ۢ:Ljava/lang/String;

    iget-object v3, p0, Ll/ۘᩳۜ;->᩻:[B

    move-object v0, v10

    move-object v5, p1

    move-object v6, p3

    move-object v7, p2

    invoke-direct/range {v0 .. v9}, Ll/ۘᩳۜ;-><init>(ILjava/lang/String;[B[BLjava/lang/String;Ljava/lang/String;[BLjava/lang/String;Ljava/lang/String;)V

    return-object v10
.end method

.method public final ֫(Ll/ܶ᩵ܿ;)V
    .locals 4

    .line 166
    iget-object v0, p0, Ll/ۘᩳۜ;->ۜ:Ljava/lang/String;

    invoke-static {p1, v0}, Ll/ۘᩳۜ;->֫(Ll/ܶ᩵ܿ;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    .line 167
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۨ()V

    const-string v0, ".resource_patch"

    .line 168
    invoke-virtual {p1, v0}, Ll/ܶ᩵ܿ;->ܳ(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v0

    const/4 v1, 0x0

    .line 446
    :try_start_0
    invoke-virtual {v0, v1}, Ll/ܶ᩵ܿ;->ܽ(Z)Ljava/io/OutputStream;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 171
    :try_start_1
    invoke-direct {p0, v2}, Ll/ۘᩳۜ;->֫(Ljava/io/OutputStream;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 172
    :try_start_2
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    .line 173
    invoke-virtual {v0, p1, v1, v2, v3}, Ll/ܶ᩵ܿ;->֫(Ll/ܶ᩵ܿ;ZZLjava/lang/Runnable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 293
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 294
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    if-eqz v2, :cond_1

    .line 170
    :try_start_3
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p1

    .line 293
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 294
    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->۬()Z

    .line 176
    :cond_2
    throw p1
.end method

.method public final ֫()Z
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ۘᩳۜ;->᩷:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
