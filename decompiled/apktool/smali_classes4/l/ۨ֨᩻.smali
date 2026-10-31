.class public final Ll/ۨ֨᩻;
.super Ljava/lang/Object;
.source "Z72Q"

# interfaces
.implements Ll/֡֨᩻;


# static fields
.field public static final ۙ:[B


# instance fields
.field public final ᩶:Ll/ۨۚ᩻;

.field public final ᩸:I

.field public final ᩹:Ll/ᩴ֨᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-string v0, "payload.bin"

    .line 34
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    sput-object v0, Ll/ۨ֨᩻;->ۙ:[B

    return-void
.end method

.method public constructor <init>(Ll/ᩴ֨᩻;ILl/ۨۚ᩻;)V
    .locals 0

    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    .line 64
    iput p2, p0, Ll/ۨ֨᩻;->᩸:I

    .line 65
    iput-object p3, p0, Ll/ۨ֨᩻;->᩶:Ll/ۨۚ᩻;

    return-void
.end method

.method public static ֫(Ll/ᩴ֨᩻;)Ljava/lang/String;
    .locals 6

    .line 197
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v0

    .line 198
    new-instance v1, Ll/ۤۜܽ;

    invoke-direct {v1}, Ll/ۤۜܽ;-><init>()V

    .line 199
    invoke-virtual {p0}, Ll/ᩴ֨᩻;->᩶ۧ()Ljava/util/List;

    move-result-object p0

    .line 200
    check-cast p0, Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v1, v2}, Ll/ۤۜܽ;->writeInt(I)V

    .line 201
    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->ۧ(Ljava/security/MessageDigest;)V

    .line 202
    invoke-virtual {v1}, Ll/ۤۜܽ;->ᩳ()V

    .line 203
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ܰۚ᩻;

    .line 204
    iget-object v3, v2, Ll/ܰۚ᩻;->ܽ:Ll/ۡܶ᩻;

    invoke-virtual {v3}, Ll/ۘۜۖ;->toByteArray()[B

    move-result-object v3

    .line 205
    array-length v4, v3

    invoke-virtual {v1, v4}, Ll/ۤۜܽ;->writeInt(I)V

    .line 206
    invoke-virtual {v2}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 207
    invoke-virtual {v2}, Ll/ܰۚ᩻;->֫()J

    move-result-wide v4

    invoke-virtual {v1, v4, v5}, Ll/ۤۜܽ;->ۧ(J)V

    .line 208
    invoke-virtual {v1, v0}, Ll/ۤۜܽ;->ۧ(Ljava/security/MessageDigest;)V

    .line 209
    invoke-virtual {v1}, Ll/ۤۜܽ;->ᩳ()V

    .line 210
    invoke-virtual {v0, v3}, Ljava/security/MessageDigest;->update([B)V

    goto :goto_0

    .line 212
    :cond_0
    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    invoke-static {p0}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;ILl/ۨۚ᩻;Ll/᩺֨᩻;)Ll/ۨ֨᩻;
    .locals 7

    .line 129
    invoke-static {}, Ll/ۙ᩸᩷;->ۡ()Ll/ܿ۟᩵;

    move-result-object v1

    if-lez p2, :cond_4

    const/16 v0, 0x10

    if-gt p2, v0, :cond_4

    .line 148
    new-instance v6, Ll/᩺ۚ᩻;

    move-object v0, v6

    move-object v2, p0

    move-object v3, p1

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Ll/᩺ۚ᩻;-><init>(Ll/ܿ۟᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۨۚ᩻;Ll/᩺֨᩻;)V

    .line 152
    invoke-virtual {v6}, Ll/᩺ۚ᩻;->֫()Ll/ۨۚ᩻;

    move-result-object p0

    .line 153
    invoke-static {v6}, Ll/֡ۖܽ;->֫(Ll/ۖۖܽ;)Ll/᩻ۖܽ;

    move-result-object p1

    .line 156
    :try_start_0
    invoke-virtual {p1}, Ll/᩻ۖܽ;->length()J

    move-result-wide v0

    .line 157
    new-instance p4, Ll/۠ۢ֡;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    invoke-static {p1, p4}, Ll/ᩳܰۡ;->֫(Ll/᩻ۖܽ;Ll/۠ۢ֡;)Ll/ᩳܰۡ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    const/4 p4, 0x0

    :try_start_1
    const-string v2, "payload.bin"

    .line 160
    invoke-virtual {p1, v2}, Ll/ᩳܰۡ;->getEntry(Ljava/lang/String;)Ll/ۗ᩺ۡ;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 165
    invoke-static {v2, v0, v1}, Ll/ۨ֨᩻;->֫(Ll/ۗ᩺ۡ;J)V

    .line 166
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v0

    .line 167
    invoke-virtual {v2}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v2

    .line 168
    invoke-virtual {p1}, Ll/ᩳܰۡ;->᩻()Ll/۠ۖܽ;

    move-result-object v4

    .line 169
    invoke-interface {v4, v0, v1, v2, v3}, Ll/۠ۖܽ;->ۧ(JJ)Ll/᩻ۖܽ;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 171
    :try_start_2
    new-instance v1, Ll/ᩴ֨᩻;

    invoke-direct {v1, v0}, Ll/ᩴ֨᩻;-><init>(Ll/۠ۖܽ;)V

    .line 172
    invoke-static {v1}, Ll/ۨ֨᩻;->֫(Ll/ᩴ֨᩻;)Ljava/lang/String;

    move-result-object v2

    if-eqz p3, :cond_0

    .line 174
    invoke-virtual {p3, v2}, Ll/ۨۚ᩻;->֫(Ljava/lang/String;)V

    .line 176
    :cond_0
    invoke-virtual {p0, v2}, Ll/ۨۚ᩻;->ۧ(Ljava/lang/String;)Ll/ۨۚ᩻;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 178
    :try_start_3
    new-instance p3, Ll/ۨ֨᩻;

    invoke-direct {p3, v1, p2, p0}, Ll/ۨ֨᩻;-><init>(Ll/ᩴ֨᩻;ILl/ۨۚ᩻;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    :try_start_4
    invoke-virtual {p1}, Ll/ᩳܰۡ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    return-object p3

    :catchall_0
    move-exception p0

    move-object v0, p4

    goto :goto_0

    :catchall_1
    move-exception p0

    :goto_0
    if-eqz v0, :cond_1

    .line 182
    :try_start_5
    invoke-virtual {v0}, Ll/᩻ۖܽ;->close()V

    .line 184
    :cond_1
    throw p0

    .line 163
    :cond_2
    new-instance p0, Ll/᩵ۤۡ;

    const p2, 0x7f120858

    invoke-direct {p0, p2}, Ll/᩵ۤۡ;-><init>(I)V

    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :catchall_2
    move-exception p0

    .line 157
    :try_start_6
    invoke-virtual {p1}, Ll/ᩳܰۡ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_1

    :catchall_3
    move-exception p1

    :try_start_7
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception p0

    move-object p1, p4

    goto :goto_2

    :catchall_5
    move-exception p0

    :goto_2
    if-eqz p1, :cond_3

    .line 188
    invoke-virtual {p1}, Ll/᩻ۖܽ;->close()V

    .line 190
    :cond_3
    throw p0

    .line 387
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Download thread count must be between 1 and 16"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/ۗ᩺ۡ;J)V
    .locals 8

    .line 219
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ᩴ()Z

    move-result v0

    if-nez v0, :cond_3

    .line 222
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->֨()I

    move-result v0

    if-nez v0, :cond_2

    .line 225
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->getSize()J

    move-result-wide v0

    .line 226
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->ܳ()J

    move-result-wide v2

    .line 227
    invoke-virtual {p0}, Ll/ۗ᩺ۡ;->᩷()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long p0, v0, v6

    if-lez p0, :cond_1

    cmp-long p0, v2, v0

    if-nez p0, :cond_1

    cmp-long p0, v4, v6

    if-ltz p0, :cond_0

    cmp-long p0, v4, p1

    if-gtz p0, :cond_0

    sub-long/2addr p1, v4

    cmp-long p0, v0, p1

    if-gtz p0, :cond_0

    return-void

    .line 232
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "payload.bin exceeds the remote ZIP bounds"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 229
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "payload.bin has inconsistent ZIP sizes"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 223
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string p1, "payload.bin is compressed"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 220
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "payload.bin is encrypted"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic ۧ([B)Z
    .locals 1

    .line 158
    sget-object v0, Ll/ۨ֨᩻;->ۙ:[B

    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 437
    iget-object v0, p0, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    invoke-virtual {v0}, Ll/ᩴ֨᩻;->close()V

    return-void
.end method

.method public final getEntry(Ljava/lang/String;)Ll/ܰۚ᩻;
    .locals 1

    .line 246
    iget-object v0, p0, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    invoke-virtual {v0, p1}, Ll/ᩴ֨᩻;->getEntry(Ljava/lang/String;)Ll/ܰۚ᩻;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۨۚ᩻;
    .locals 1

    .line 432
    iget-object v0, p0, Ll/ۨ֨᩻;->᩶:Ll/ۨۚ᩻;

    return-object v0
.end method

.method public final ֫(Ll/ܰۚ᩻;)Ll/ᩳۨۡ;
    .locals 2

    if-eqz p1, :cond_0

    .line 379
    invoke-virtual {p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    invoke-virtual {v1, v0}, Ll/ᩴ֨᩻;->getEntry(Ljava/lang/String;)Ll/ܰۚ᩻;

    move-result-object v0

    if-ne v0, p1, :cond_0

    .line 262
    invoke-virtual {v1, p1}, Ll/ᩴ֨᩻;->֫(Ll/ܰۚ᩻;)Ll/ᩳۨۡ;

    move-result-object p1

    return-object p1

    .line 380
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Payload entry does not belong to this remote payload"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;)V
    .locals 1

    .line 272
    :try_start_0
    iget v0, p0, Ll/ۨ֨᩻;->᩸:I

    invoke-virtual {p0, p1, p2, p3, v0}, Ll/ۨ֨᩻;->֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;I)V
    :try_end_0
    .catch Ljava/io/InterruptedIOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 274
    invoke-interface {p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result p2

    if-eqz p2, :cond_0

    return-void

    .line 275
    :cond_0
    throw p1
.end method

.method public final ֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;I)V
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    if-lez v3, :cond_a

    const/16 v4, 0x10

    if-gt v3, v4, :cond_a

    .line 379
    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p0

    iget-object v6, v5, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    invoke-virtual {v6, v4}, Ll/ᩴ֨᩻;->getEntry(Ljava/lang/String;)Ll/ܰۚ᩻;

    move-result-object v4

    if-ne v4, v0, :cond_9

    .line 361
    iget-object v4, v0, Ll/ܰۚ᩻;->ܽ:Ll/ۡܶ᩻;

    .line 362
    invoke-virtual {v4}, Ll/ۡܶ᩻;->hasNewPartitionInfo()Z

    move-result v7

    if-eqz v7, :cond_8

    .line 365
    invoke-virtual {v4}, Ll/ۡܶ᩻;->getNewPartitionInfo()Ll/ܳܶ᩻;

    move-result-object v4

    .line 366
    invoke-virtual {v4}, Ll/ܳܶ᩻;->hasSize()Z

    move-result v7

    if-eqz v7, :cond_7

    invoke-virtual {v4}, Ll/ܳܶ᩻;->hasHash()Z

    move-result v7

    if-eqz v7, :cond_7

    .line 369
    invoke-virtual {v4}, Ll/ܳܶ᩻;->getSize()J

    move-result-wide v7

    .line 370
    invoke-virtual {v4}, Ll/ܳܶ᩻;->getHash()Ll/ۛۜۖ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ۛۜۖ;->ܿ()[B

    move-result-object v4

    .line 371
    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ܽ()J

    move-result-wide v9

    cmp-long v11, v7, v9

    if-nez v11, :cond_6

    array-length v9, v4

    const/16 v10, 0x20

    if-ne v9, v10, :cond_6

    .line 324
    invoke-virtual {v6, v0, v1, v2, v3}, Ll/ᩴ֨᩻;->֫(Ll/ܰۚ᩻;Ll/᩻ۖܽ;Ll/ۡ֨᩻;I)V

    .line 405
    invoke-interface/range {p3 .. p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result v3

    const-string v6, "Payload extraction was canceled"

    if-nez v3, :cond_5

    .line 326
    new-instance v3, Ll/᩵ۛۡ;

    const-wide/16 v9, 0x1

    .line 327
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    invoke-direct {v3, v9, v10}, Ll/᩵ۛۡ;-><init>(J)V

    .line 328
    new-instance v9, Ll/᩻ۨ᩷;

    const/4 v10, 0x3

    invoke-direct {v9, v10, v2}, Ll/᩻ۨ᩷;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v9}, Ll/᩵ۛۡ;->֫(Ll/ۖۛۡ;)V

    const/4 v9, 0x0

    .line 329
    invoke-virtual {v3, v9}, Ll/᩵ۛۡ;->֫(I)Z

    .line 330
    invoke-virtual/range {p2 .. p2}, Ll/᩻ۖܽ;->flush()V

    .line 331
    invoke-virtual/range {p2 .. p2}, Ll/᩻ۖܽ;->length()J

    move-result-wide v9

    const-string v11, " ("

    const-string v12, ", actual "

    cmp-long v13, v9, v7

    if-nez v13, :cond_4

    .line 338
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v9

    const/high16 v10, 0x80000

    new-array v13, v10, [B

    const-wide/16 v14, 0x0

    .line 340
    invoke-virtual {v1, v14, v15}, Ll/᩻ۖܽ;->seek(J)V

    move-object/from16 p4, v11

    move-object/from16 v16, v12

    move-wide v11, v7

    :goto_0
    cmp-long v17, v11, v14

    if-lez v17, :cond_1

    .line 405
    invoke-interface/range {p3 .. p3}, Ll/ۡ֨᩻;->᩻()Z

    move-result v17

    if-nez v17, :cond_0

    int-to-long v14, v10

    .line 344
    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14

    long-to-int v10, v14

    const/4 v14, 0x0

    .line 345
    invoke-virtual {v1, v13, v14, v10}, Ll/᩻ۖܽ;->֫([BII)V

    .line 346
    invoke-virtual {v9, v13, v14, v10}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v14, v10

    sub-long/2addr v11, v14

    .line 348
    invoke-virtual {v3, v10}, Ll/᩵ۛۡ;->֫(I)Z

    const/high16 v10, 0x80000

    const-wide/16 v14, 0x0

    goto :goto_0

    .line 406
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0, v6}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    move-wide v1, v14

    cmp-long v6, v7, v1

    if-nez v6, :cond_2

    const/4 v1, 0x1

    .line 41
    invoke-virtual {v3, v1}, Ll/᩵ۛۡ;->֫(I)Z

    .line 353
    :cond_2
    invoke-virtual {v9}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    .line 395
    invoke-static {v4, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result v2

    if-eqz v2, :cond_3

    return-void

    .line 396
    :cond_3
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "Partition SHA-256 mismatch: expected "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 397
    invoke-static {v4}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v4, v16

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, p4

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 398
    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x29

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    move-object v1, v11

    move-object v4, v12

    const/16 v2, 0x29

    .line 333
    new-instance v3, Ljava/io/IOException;

    const-string v6, "Extracted partition size mismatch: expected "

    .line 0
    invoke-static {v6, v4, v7, v8}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 333
    invoke-virtual {v4, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 335
    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v3

    .line 406
    :cond_5
    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0, v6}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 372
    :cond_6
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid partition verification metadata: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 367
    :cond_7
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Missing partition size or hash: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 363
    :cond_8
    new-instance v1, Ljava/io/IOException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Missing new partition info: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Ll/ܰۚ᩻;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 380
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Payload entry does not belong to this remote payload"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    move-object/from16 v5, p0

    .line 387
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Download thread count must be between 1 and 16"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩶ۧ()Ljava/util/List;
    .locals 1

    .line 240
    iget-object v0, p0, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    invoke-virtual {v0}, Ll/ᩴ֨᩻;->᩶ۧ()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ᩷(Ljava/lang/String;)Ll/ܰۚ᩻;
    .locals 1

    .line 253
    iget-object v0, p0, Ll/ۨ֨᩻;->᩹:Ll/ᩴ֨᩻;

    invoke-virtual {v0, p1}, Ll/ᩴ֨᩻;->᩷(Ljava/lang/String;)Ll/ܰۚ᩻;

    move-result-object p1

    return-object p1
.end method
