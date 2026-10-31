.class public final Ll/ۛᩴᩳ;
.super Ljava/lang/Object;
.source "L6RY"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public ۗ:Ll/ۛۘᩳ;

.field public ۙ:Ll/ۚ۬ᩳ;

.field public final ۛ:Ljava/util/UUID;

.field public ۤ:Ll/ۗܰᩳ;

.field public final ۨ:I

.field public final ۫:J

.field public ۬:Ll/ۙܰᩳ;

.field public ܰ:Ll/ۗ֫ܿ;

.field public ᩶:[B

.field public ᩸:Ll/᩵ۘᩳ;

.field public ᩹:[B

.field public final ᩺:J


# direct methods
.method public constructor <init>(Ll/᩵ۘᩳ;Ll/ۛۘᩳ;Ll/ۗ֫ܿ;Ll/ۗܰᩳ;Ll/ۙܰᩳ;JILjava/util/UUID;J[B[B)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    iput-object p1, p0, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    iput-object p2, p0, Ll/ۛᩴᩳ;->ۗ:Ll/ۛۘᩳ;

    iput-object p3, p0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    .line 45
    iput-object p4, p0, Ll/ۛᩴᩳ;->ۤ:Ll/ۗܰᩳ;

    iput-object p5, p0, Ll/ۛᩴᩳ;->۬:Ll/ۙܰᩳ;

    .line 46
    iput-object p12, p0, Ll/ۛᩴᩳ;->᩶:[B

    iput-object p13, p0, Ll/ۛᩴᩳ;->᩹:[B

    .line 47
    iput-wide p6, p0, Ll/ۛᩴᩳ;->᩺:J

    iput p8, p0, Ll/ۛᩴᩳ;->ۨ:I

    iput-object p9, p0, Ll/ۛᩴᩳ;->ۛ:Ljava/util/UUID;

    iput-wide p10, p0, Ll/ۛᩴᩳ;->۫:J

    return-void
.end method

.method private ֫(Ljava/util/UUID;J)Ll/ۛᩴᩳ;
    .locals 16

    move-object/from16 v0, p0

    .line 269
    new-instance v15, Ll/ۛᩴᩳ;

    iget-object v2, v0, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    iget-object v3, v0, Ll/ۛᩴᩳ;->ۗ:Ll/ۛۘᩳ;

    iget-object v4, v0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    iget-object v5, v0, Ll/ۛᩴᩳ;->ۤ:Ll/ۗܰᩳ;

    iget-object v6, v0, Ll/ۛᩴᩳ;->۬:Ll/ۙܰᩳ;

    iget-object v13, v0, Ll/ۛᩴᩳ;->᩶:[B

    iget-object v14, v0, Ll/ۛᩴᩳ;->᩹:[B

    iget-wide v7, v0, Ll/ۛᩴᩳ;->᩺:J

    iget v9, v0, Ll/ۛᩴᩳ;->ۨ:I

    move-object v1, v15

    move-object/from16 v10, p1

    move-wide/from16 v11, p2

    invoke-direct/range {v1 .. v14}, Ll/ۛᩴᩳ;-><init>(Ll/᩵ۘᩳ;Ll/ۛۘᩳ;Ll/ۗ֫ܿ;Ll/ۗܰᩳ;Ll/ۙܰᩳ;JILjava/util/UUID;J[B[B)V

    .line 271
    iget-object v1, v0, Ll/ۛᩴᩳ;->ۙ:Ll/ۚ۬ᩳ;

    iput-object v1, v15, Ll/ۛᩴᩳ;->ۙ:Ll/ۚ۬ᩳ;

    const/4 v1, 0x0

    .line 272
    iput-object v1, v0, Ll/ۛᩴᩳ;->ۙ:Ll/ۚ۬ᩳ;

    .line 278
    iput-object v1, v0, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    iput-object v1, v0, Ll/ۛᩴᩳ;->ۗ:Ll/ۛۘᩳ;

    iput-object v1, v0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    iput-object v1, v0, Ll/ۛᩴᩳ;->ۤ:Ll/ۗܰᩳ;

    iput-object v1, v0, Ll/ۛᩴᩳ;->۬:Ll/ۙܰᩳ;

    .line 279
    iput-object v1, v0, Ll/ۛᩴᩳ;->᩹:[B

    iput-object v1, v0, Ll/ۛᩴᩳ;->᩶:[B

    return-object v15
.end method

.method public static ֫(Ll/ܿ۬ᩳ;Ll/᩷۠ᩴ;Ll/֨۬ᩳ;I)Ll/ۛᩴᩳ;
    .locals 12

    move-object v0, p0

    .line 56
    monitor-enter v0

    .line 57
    :try_start_0
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->ܳ()Ljava/util/UUID;

    move-result-object v6

    .line 58
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->ᩳ()J

    move-result-wide v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_8

    .line 59
    :try_start_1
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->֫()[B

    move-result-object v1

    invoke-static {v6, v1}, Ll/۠֫ܿ;->֫(Ljava/util/UUID;[B)Ll/ۨۙᩳ;

    move-result-object v9
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    if-eqz v9, :cond_4

    .line 62
    :try_start_2
    invoke-virtual {v9}, Ll/ۨۙᩳ;->ۧ()J

    move-result-wide v1

    int-to-long v3, p3

    cmp-long v5, v1, v3

    if-gtz v5, :cond_3

    .line 63
    invoke-virtual {p0}, Ll/ܿ۬ᩳ;->᩻()Ll/۫᩹ᩳ;

    move-result-object p0

    .line 64
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_8

    .line 65
    :try_start_3
    invoke-virtual {v9}, Ll/ۨۙᩳ;->ۧ()J

    move-result-wide v0

    const-wide/16 v10, 0x20

    add-long/2addr v0, v10

    .line 145
    invoke-virtual {p2, v0, v1}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v10
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    move-object v0, v9

    move-object v1, p1

    move-object v2, v6

    move-object v5, p2

    .line 66
    :try_start_4
    invoke-virtual/range {v0 .. v5}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;JLl/֨۬ᩳ;)Ljava/io/InputStream;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 67
    :try_start_5
    invoke-virtual {v9}, Ll/ۨۙᩳ;->ۧ()J

    move-result-wide v0

    long-to-int p2, v0

    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_1

    sub-int v2, p2, v1

    .line 70
    invoke-virtual {p1, v0, v1, v2}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    if-lez v2, :cond_0

    add-int/2addr v1, v2

    goto :goto_0

    .line 71
    :cond_0
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Truncated fragment recovery attachment"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2

    .line 74
    :cond_1
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p2

    const/4 v1, -0x1

    if-ne p2, v1, :cond_2

    .line 75
    invoke-static {v0, p3, p0}, Ll/ۛᩴᩳ;->ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 76
    :try_start_6
    invoke-direct {p2, v6, v7, v8}, Ll/ۛᩴᩳ;->֫(Ljava/util/UUID;J)Ll/ۛᩴᩳ;

    move-result-object p3
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 77
    :try_start_7
    invoke-virtual {p2}, Ll/ۛᩴᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    .line 78
    :try_start_8
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    :try_start_9
    invoke-virtual {v10}, Ll/ۚ۬ᩳ;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V

    return-object p3

    :catchall_0
    move-exception p3

    .line 75
    :try_start_a
    invoke-virtual {p2}, Ll/ۛᩴᩳ;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_b
    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p3

    .line 74
    :cond_2
    new-instance p2, Ljava/io/IOException;

    const-string p3, "Trailing fragment recovery attachment bytes"

    invoke-direct {p2, p3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    :catchall_2
    move-exception p2

    .line 65
    :try_start_c
    invoke-virtual {p1}, Ljava/io/InputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_3

    goto :goto_2

    :catchall_3
    move-exception p1

    :try_start_d
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p2
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_4

    :catchall_4
    move-exception p1

    :try_start_e
    invoke-virtual {v10}, Ll/ۚ۬ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_5

    goto :goto_3

    :catchall_5
    move-exception p2

    :try_start_f
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw p1
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    :catchall_6
    move-exception p1

    :try_start_10
    invoke-virtual {p0}, Ll/۬᩹ᩳ;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    goto :goto_4

    :catchall_7
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw p1

    .line 62
    :cond_3
    :try_start_11
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Fragment state exceeds recovery limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 61
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Fragment recovery attachment is missing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    .line 60
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid fragment recovery metadata"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :catchall_8
    move-exception p0

    .line 64
    monitor-exit v0
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_8

    throw p0
.end method

.method public static ֫([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    if-ltz v1, :cond_4

    .line 186
    array-length v2, v0

    if-gt v2, v1, :cond_4

    array-length v2, v0

    const/16 v3, 0x30

    if-lt v2, v3, :cond_4

    .line 189
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, v0}, Ll/۬ۜܽ;-><init>([B)V

    .line 190
    array-length v3, v0

    add-int/lit8 v3, v3, -0x4

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Ll/۬ۜܽ;->seek(J)V

    .line 191
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    array-length v4, v0

    add-int/lit8 v4, v4, -0x4

    .line 319
    new-instance v5, Ljava/util/zip/CRC32;

    invoke-direct {v5}, Ljava/util/zip/CRC32;-><init>()V

    const/4 v6, 0x0

    invoke-virtual {v5, v0, v6, v4}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {v5}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v4

    long-to-int v5, v4

    if-ne v3, v5, :cond_3

    const-wide/16 v3, 0x0

    .line 192
    invoke-virtual {v2, v3, v4}, Ll/۬ۜܽ;->seek(J)V

    .line 193
    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    const v4, 0x32465345

    if-ne v3, v4, :cond_2

    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_2

    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v3

    array-length v0, v0

    if-ne v3, v0, :cond_2

    .line 196
    invoke-virtual {v2}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v10

    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v12

    .line 197
    invoke-virtual/range {p2 .. p2}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v3

    cmp-long v0, v10, v3

    if-nez v0, :cond_1

    invoke-virtual/range {p2 .. p2}, Ll/۬᩹ᩳ;->length()I

    move-result v0

    if-ne v12, v0, :cond_1

    .line 200
    invoke-static {v2}, Ll/ۛᩴᩳ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v0

    invoke-static {v2}, Ll/ۛᩴᩳ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v3

    invoke-static {v2}, Ll/ۛᩴᩳ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v4

    invoke-static {v2}, Ll/ۛᩴᩳ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v14

    invoke-static {v2}, Ll/ۛᩴᩳ;->֫(Ll/۬ۜܽ;)[B

    move-result-object v15

    .line 201
    invoke-virtual {v2}, Ll/۬ۜܽ;->available()J

    move-result-wide v5

    const-wide/16 v7, 0x4

    cmp-long v2, v5, v7

    if-nez v2, :cond_0

    .line 202
    new-instance v2, Ll/ۛᩴᩳ;

    .line 316
    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-direct {v5, v0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 203
    array-length v0, v0

    int-to-long v6, v0

    invoke-static {v1, v6, v7, v5}, Ll/᩵ۘᩳ;->֫(IJLjava/io/InputStream;)Ll/᩵ۘᩳ;

    move-result-object v5

    .line 316
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v3}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 204
    array-length v3, v3

    int-to-long v6, v3

    invoke-static {v1, v6, v7, v0}, Ll/ۛۘᩳ;->֫(IJLjava/io/InputStream;)Ll/ۛۘᩳ;

    move-result-object v6

    .line 205
    invoke-static {v1, v4}, Ll/ۗ֫ܿ;->֫(I[B)Ll/ۗ֫ܿ;

    move-result-object v7

    .line 316
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v14}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 206
    array-length v3, v14

    int-to-long v3, v3

    invoke-static {v0, v3, v4, v1}, Ll/ۗܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۗܰᩳ;

    move-result-object v8

    .line 316
    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-direct {v0, v15}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 207
    array-length v3, v15

    int-to-long v3, v3

    invoke-static {v0, v3, v4, v1}, Ll/ۙܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۙܰᩳ;

    move-result-object v9

    const/4 v13, 0x0

    const-wide/16 v0, -0x1

    move-object v4, v2

    move-object v3, v14

    move-object/from16 v17, v15

    move-wide v14, v0

    move-object/from16 v16, v3

    invoke-direct/range {v4 .. v17}, Ll/ۛᩴᩳ;-><init>(Ll/᩵ۘᩳ;Ll/ۛۘᩳ;Ll/ۗ֫ܿ;Ll/ۗܰᩳ;Ll/ۙܰᩳ;JILjava/util/UUID;J[B[B)V

    return-object v2

    .line 201
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing fragment recovery state fields"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 198
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Fragment state belongs to another text revision"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 194
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported fragment recovery state"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 191
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid fragment recovery state checksum"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 187
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid fragment recovery state length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move/from16 v2, p6

    .line 117
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const-wide/16 v4, 0xc

    move-wide v12, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const-wide/16 v14, 0x8

    if-eqz v4, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    if-eqz v4, :cond_5

    .line 119
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v6, v5

    const-wide/16 v18, 0x2

    const-wide/16 v10, 0x5

    move-wide/from16 v8, v18

    invoke-static/range {v6 .. v13}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v22

    move-object/from16 v5, p1

    .line 120
    invoke-virtual {v5, v4}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 121
    instance-of v6, v4, Ljava/lang/String;

    const-wide/16 v20, 0x4

    if-eqz v6, :cond_0

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    int-to-long v6, v4

    move-wide/from16 v16, v6

    invoke-static/range {v16 .. v23}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v12

    goto :goto_0

    .line 122
    :cond_0
    instance-of v6, v4, Ljava/lang/Boolean;

    if-eqz v6, :cond_1

    const-wide/16 v6, 0x1

    add-long v22, v22, v6

    :goto_1
    move-wide/from16 v12, v22

    goto :goto_0

    .line 123
    :cond_1
    instance-of v6, v4, Ljava/lang/Integer;

    if-eqz v6, :cond_2

    add-long v22, v22, v20

    goto :goto_1

    .line 124
    :cond_2
    instance-of v6, v4, Ljava/lang/Long;

    if-eqz v6, :cond_3

    add-long v22, v22, v14

    goto :goto_1

    :cond_3
    if-nez v4, :cond_4

    goto :goto_1

    .line 125
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported fragment config value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 118
    :cond_5
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid fragment config key"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    move-object/from16 v5, p1

    const-wide/16 v3, 0x31

    add-long/2addr v3, v12

    const/4 v6, 0x0

    if-nez v1, :cond_7

    const/4 v7, 0x0

    goto :goto_2

    .line 127
    :cond_7
    invoke-virtual {v1, v2}, Ll/᩺ܶᩳ;->֫(I)I

    move-result v7

    :goto_2
    int-to-long v7, v7

    add-long/2addr v3, v7

    .line 128
    invoke-virtual/range {p3 .. p3}, Ll/ۗ֫ܿ;->֫()J

    move-result-wide v7

    add-long/2addr v7, v3

    move-object/from16 v3, p4

    array-length v4, v3

    int-to-long v9, v4

    add-long/2addr v7, v9

    move-object/from16 v4, p5

    array-length v9, v4

    int-to-long v9, v9

    add-long/2addr v7, v9

    const/16 v9, 0x30

    if-lt v2, v9, :cond_b

    int-to-long v9, v2

    cmp-long v11, v7, v9

    if-gtz v11, :cond_b

    const-wide/32 v9, 0x7ffffff7

    cmp-long v11, v7, v9

    if-gtz v11, :cond_b

    add-long v20, v7, v12

    .line 133
    invoke-virtual/range {p1 .. p1}, Landroid/os/BaseBundle;->size()I

    move-result v9

    int-to-long v9, v9

    const-wide/16 v18, 0x80

    const-wide/16 v11, 0x2000

    move-wide/from16 v16, v9

    move-wide/from16 v22, v11

    invoke-static/range {v16 .. v23}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v9

    invoke-virtual {v0, v9, v10}, Ll/۫᩹ᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object v9

    .line 135
    invoke-static {v7, v8}, Ljava/lang/Long;->signum(J)I

    mul-long v7, v7, v14

    add-long/2addr v7, v11

    :try_start_0
    invoke-virtual {v0, v7, v8}, Ll/۫᩹ᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 136
    :try_start_1
    new-instance v8, Ll/۫ᩴᩳ;

    invoke-static/range {p0 .. p6}, Ll/ۛᩴᩳ;->ۧ(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)[B

    move-result-object v0

    invoke-direct {v8, v0, v9}, Ll/۫ᩴᩳ;-><init>([BLl/ۚ۬ᩳ;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v7, :cond_8

    .line 139
    :try_start_2
    invoke-virtual {v7}, Ll/ۚ۬ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object v8

    :catchall_0
    move-exception v0

    const/4 v6, 0x1

    goto :goto_4

    :cond_8
    return-object v8

    :catchall_1
    move-exception v0

    move-object v1, v0

    if-eqz v7, :cond_9

    .line 135
    :try_start_3
    invoke-virtual {v7}, Ll/ۚ۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_4
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_9
    :goto_3
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception v0

    :goto_4
    if-nez v6, :cond_a

    if-eqz v9, :cond_a

    .line 139
    invoke-virtual {v9}, Ll/ۚ۬ᩳ;->close()V

    :cond_a
    throw v0

    .line 130
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Fragment state exceeds recovery limit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/۬ۜܽ;)[B
    .locals 7

    .line 310
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v0

    const-wide/16 v2, 0x8

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 311
    invoke-virtual {p0}, Ll/۬ۜܽ;->readInt()I

    move-result v0

    if-ltz v0, :cond_0

    int-to-long v1, v0

    .line 312
    invoke-virtual {p0}, Ll/۬ۜܽ;->available()J

    move-result-wide v3

    const-wide/16 v5, 0x4

    sub-long/2addr v3, v5

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    .line 211
    new-array v1, v0, [B

    .line 212
    invoke-virtual {p0, v0, v1}, Ll/۬ۜܽ;->֫(I[B)V

    return-object v1

    .line 312
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid fragment recovery field length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 310
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Missing fragment recovery field"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;
    .locals 6

    if-ltz p1, :cond_3

    .line 170
    array-length v0, p0

    if-gt v0, p1, :cond_3

    array-length v0, p0

    const/16 v1, 0x30

    if-lt v0, v1, :cond_3

    .line 175
    array-length v0, p0

    int-to-long v0, v0

    const-wide/16 v2, 0x10

    mul-long v0, v0, v2

    const-wide/16 v2, 0x400

    add-long/2addr v0, v2

    invoke-virtual {p2, v0, v1}, Ll/۫᩹ᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object v0

    const/4 v1, 0x0

    .line 177
    :try_start_0
    array-length v2, p0

    int-to-long v2, v2

    const-wide/16 v4, 0x4

    mul-long v2, v2, v4

    const-wide/16 v4, 0x2000

    add-long/2addr v2, v4

    invoke-virtual {p2, v2, v3}, Ll/۫᩹ᩳ;->ۧ(J)Ll/ۚ۬ᩳ;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 178
    :try_start_1
    invoke-static {p0, p1, p2}, Ll/ۛᩴᩳ;->֫([BILl/۫᩹ᩳ;)Ll/ۛᩴᩳ;

    move-result-object p0

    .line 179
    iput-object v0, p0, Ll/ۛᩴᩳ;->ۙ:Ll/ۚ۬ᩳ;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v2, :cond_0

    .line 182
    :try_start_2
    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    return-object p0

    :catchall_1
    move-exception p0

    if-eqz v2, :cond_1

    .line 177
    :try_start_3
    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception p1

    :try_start_4
    invoke-virtual {p0, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :catchall_3
    move-exception p0

    :goto_1
    if-nez v1, :cond_2

    if-eqz v0, :cond_2

    .line 182
    invoke-virtual {v0}, Ll/ۚ۬ᩳ;->close()V

    :cond_2
    throw p0

    .line 171
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Invalid fragment recovery state length"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۧ(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)[B
    .locals 16

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    move/from16 v3, p6

    const/16 v4, 0x30

    const-string v5, "Fragment state exceeds recovery limit"

    if-lt v3, v4, :cond_5

    .line 144
    array-length v4, v1

    if-gt v4, v3, :cond_5

    array-length v4, v2

    if-gt v4, v3, :cond_5

    move-object/from16 v4, p1

    .line 147
    invoke-static {v3, v4}, Ll/᩵ۘᩳ;->֫(ILandroid/os/Bundle;)Ll/᩵ۘᩳ;

    move-result-object v4

    invoke-virtual {v4, v3}, Ll/᩵ۘᩳ;->֫(I)[B

    move-result-object v4

    const/4 v6, 0x0

    if-nez v0, :cond_0

    const/4 v7, 0x0

    goto :goto_0

    .line 148
    :cond_0
    invoke-virtual {v0, v3}, Ll/᩺ܶᩳ;->֫(I)I

    move-result v7

    :goto_0
    int-to-long v7, v7

    const-wide/16 v9, 0x1

    add-long/2addr v7, v9

    .line 149
    invoke-virtual/range {p3 .. p3}, Ll/ۗ֫ܿ;->֫()J

    move-result-wide v9

    .line 150
    array-length v11, v4

    int-to-long v11, v11

    const-wide/16 v13, 0x30

    add-long/2addr v11, v13

    add-long/2addr v11, v7

    add-long/2addr v11, v9

    array-length v13, v1

    int-to-long v13, v13

    add-long/2addr v11, v13

    array-length v13, v2

    int-to-long v13, v13

    add-long/2addr v11, v13

    int-to-long v13, v3

    cmp-long v15, v11, v13

    if-gtz v15, :cond_4

    const-wide/32 v13, 0x7ffffff7

    cmp-long v15, v11, v13

    if-gtz v15, :cond_4

    .line 153
    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-direct {v5, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v13, v1

    int-to-long v13, v13

    invoke-static {v5, v13, v14, v3}, Ll/ۗܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۗܰᩳ;

    .line 154
    new-instance v5, Ljava/io/ByteArrayInputStream;

    invoke-direct {v5, v2}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v13, v2

    int-to-long v13, v13

    invoke-static {v5, v13, v14, v3}, Ll/ۙܰᩳ;->֫(Ljava/io/ByteArrayInputStream;JI)Ll/ۙܰᩳ;

    .line 155
    new-instance v3, Ll/ۤۜܽ;

    long-to-int v5, v11

    invoke-direct {v3, v5}, Ll/ۤۜܽ;-><init>(I)V

    const v13, 0x32465345

    .line 156
    invoke-virtual {v3, v13}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v13, 0x1

    invoke-virtual {v3, v13}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 157
    invoke-virtual/range {p0 .. p0}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v14

    invoke-virtual {v3, v14, v15}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual/range {p0 .. p0}, Ll/۬᩹ᩳ;->length()I

    move-result v5

    invoke-virtual {v3, v5}, Ll/ۤۜܽ;->writeInt(I)V

    .line 158
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->ۧ([B)V

    long-to-int v4, v7

    .line 159
    invoke-virtual {v3, v4}, Ll/ۤۜܽ;->writeInt(I)V

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v13, 0x0

    :goto_1
    invoke-virtual {v3, v13}, Ll/ۤۜܽ;->֫(Z)V

    if-eqz v0, :cond_2

    .line 160
    invoke-virtual {v0, v3}, Ll/᩺ܶᩳ;->֫(Ll/ۤۜܽ;)V

    :cond_2
    long-to-int v0, v9

    .line 161
    invoke-virtual {v3, v0}, Ll/ۤۜܽ;->writeInt(I)V

    move-object/from16 v0, p3

    invoke-virtual {v0, v3}, Ll/ۗ֫ܿ;->֫(Ll/ۤۜܽ;)V

    .line 162
    invoke-virtual {v3, v1}, Ll/ۤۜܽ;->ۧ([B)V

    invoke-virtual {v3, v2}, Ll/ۤۜܽ;->ۧ([B)V

    .line 163
    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v4, 0x4

    sub-long/2addr v11, v4

    cmp-long v2, v0, v11

    if-nez v2, :cond_3

    .line 164
    invoke-virtual {v3}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v0

    invoke-virtual {v3}, Ll/ۤۜܽ;->size()I

    move-result v1

    .line 319
    new-instance v2, Ljava/util/zip/CRC32;

    invoke-direct {v2}, Ljava/util/zip/CRC32;-><init>()V

    invoke-virtual {v2, v0, v6, v1}, Ljava/util/zip/CRC32;->update([BII)V

    invoke-virtual {v2}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v0

    long-to-int v1, v0

    .line 164
    invoke-virtual {v3, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 165
    invoke-virtual {v3}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    return-object v0

    .line 163
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment state changed while being captured"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 151
    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 145
    :cond_5
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v5}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    const/4 v0, 0x0

    .line 278
    iput-object v0, p0, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    iput-object v0, p0, Ll/ۛᩴᩳ;->ۗ:Ll/ۛۘᩳ;

    iput-object v0, p0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    iput-object v0, p0, Ll/ۛᩴᩳ;->ۤ:Ll/ۗܰᩳ;

    iput-object v0, p0, Ll/ۛᩴᩳ;->۬:Ll/ۙܰᩳ;

    .line 279
    iput-object v0, p0, Ll/ۛᩴᩳ;->᩹:[B

    iput-object v0, p0, Ll/ۛᩴᩳ;->᩶:[B

    .line 285
    iget-object v1, p0, Ll/ۛᩴᩳ;->ۙ:Ll/ۚ۬ᩳ;

    iput-object v0, p0, Ll/ۛᩴᩳ;->ۙ:Ll/ۚ۬ᩳ;

    if-eqz v1, :cond_0

    .line 286
    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    :cond_0
    return-void
.end method

.method public final ֫()Ll/ۤᩴᩳ;
    .locals 2

    .line 241
    iget-object v0, p0, Ll/ۛᩴᩳ;->ۛ:Ljava/util/UUID;

    if-eqz v0, :cond_0

    .line 242
    :try_start_0
    new-instance v0, Ll/ۤᩴᩳ;

    iget-object v1, p0, Ll/ۛᩴᩳ;->ۗ:Ll/ۛۘᩳ;

    invoke-virtual {v1}, Ll/ۛۘᩳ;->֫()Ll/᩺ܶᩳ;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Ll/ۤᩴᩳ;-><init>(Ll/ۛᩴᩳ;Ll/᩺ܶᩳ;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 243
    :goto_0
    invoke-virtual {p0}, Ll/ۛᩴᩳ;->close()V

    throw v0

    .line 241
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment state is not bound to a recovery candidate"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/᩻۬ᩳ;Ll/᩺ܶᩳ;)Ll/ۤᩴᩳ;
    .locals 7

    move-object v0, p1

    .line 89
    monitor-enter v0

    .line 90
    :try_start_0
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 91
    :try_start_1
    invoke-virtual {v1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v2

    iget-wide v4, p0, Ll/ۛᩴᩳ;->᩺:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_0

    invoke-virtual {v1}, Ll/۬᩹ᩳ;->length()I

    move-result v2

    iget v3, p0, Ll/ۛᩴᩳ;->ۨ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v2, v3, :cond_0

    .line 94
    :try_start_2
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V

    .line 95
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v2

    invoke-direct {p0, v1, v2, v3}, Ll/ۛᩴᩳ;->֫(Ljava/util/UUID;J)Ll/ۛᩴᩳ;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 96
    :try_start_3
    new-instance v1, Ll/ۤᩴᩳ;

    invoke-direct {v1, p1, p2}, Ll/ۤᩴᩳ;-><init>(Ll/ۛᩴᩳ;Ll/᩺ܶᩳ;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    monitor-exit v0

    return-object v1

    :catch_0
    move-exception p2

    goto :goto_0

    :catch_1
    move-exception p2

    .line 97
    :goto_0
    invoke-virtual {p1}, Ll/ۛᩴᩳ;->close()V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 92
    :cond_0
    :try_start_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Migrated fragment text no longer matches"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catchall_0
    move-exception p1

    .line 90
    :try_start_6
    invoke-virtual {v1}, Ll/۬᩹ᩳ;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_7
    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1

    :catchall_2
    move-exception p1

    .line 98
    monitor-exit v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    throw p1
.end method

.method public final ֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;)Ll/۫ᩴᩳ;
    .locals 7

    .line 222
    iget-object v3, p0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    iget-object v4, p0, Ll/ۛᩴᩳ;->᩶:[B

    iget-object v5, p0, Ll/ۛᩴᩳ;->᩹:[B

    const/high16 v6, 0x800000

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;IIZ)Ll/۫ᩴᩳ;
    .locals 7

    .line 214
    iget-object v0, p0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    invoke-virtual {v0, p5, p6, p4}, Ll/ۗ֫ܿ;->֫(IILjava/lang/String;)Ll/ۗ֫ܿ;

    move-result-object p4

    if-eqz p7, :cond_0

    .line 215
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->length()I

    move-result p5

    invoke-static {p2, p4, p5}, Ll/֨ᩴᩳ;->֫(Landroid/os/Bundle;Ll/ۗ֫ܿ;I)Ll/ۗ֫ܿ;

    move-result-object p4

    :cond_0
    move-object v3, p4

    .line 216
    iget-object v4, p0, Ll/ۛᩴᩳ;->᩶:[B

    iget-object v5, p0, Ll/ۛᩴᩳ;->᩹:[B

    const/high16 v6, 0x800000

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    invoke-static/range {v0 .. v6}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ljava/lang/String;ZI)Ll/۫ᩴᩳ;
    .locals 7

    .line 228
    iget-object v0, p0, Ll/ۛᩴᩳ;->ܰ:Ll/ۗ֫ܿ;

    invoke-virtual {v0, p4}, Ll/ۗ֫ܿ;->ۧ(Ljava/lang/String;)Ll/ۗ֫ܿ;

    move-result-object p4

    if-eqz p5, :cond_0

    .line 229
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->length()I

    move-result p5

    invoke-static {p2, p4, p5}, Ll/֨ᩴᩳ;->֫(Landroid/os/Bundle;Ll/ۗ֫ܿ;I)Ll/ۗ֫ܿ;

    move-result-object p4

    :cond_0
    move-object v3, p4

    .line 230
    iget-object v4, p0, Ll/ۛᩴᩳ;->᩶:[B

    iget-object v5, p0, Ll/ۛᩴᩳ;->᩹:[B

    move-object v0, p1

    move-object v1, p2

    move-object v2, p3

    move v6, p6

    invoke-static/range {v0 .. v6}, Ll/ۛᩴᩳ;->֫(Ll/۫᩹ᩳ;Landroid/os/Bundle;Ll/᩺ܶᩳ;Ll/ۗ֫ܿ;[B[BI)Ll/۫ᩴᩳ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻۬ᩳ;)V
    .locals 6

    move-object v0, p1

    .line 248
    monitor-enter v0

    .line 249
    :try_start_0
    iget-object v1, p0, Ll/ۛᩴᩳ;->ۛ:Ljava/util/UUID;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->۟()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-wide v1, p0, Ll/ۛᩴᩳ;->۫:J

    invoke-virtual {p1}, Ll/᩻۬ᩳ;->᩺()J

    move-result-wide v3

    cmp-long v5, v1, v3

    if-nez v5, :cond_1

    .line 252
    invoke-virtual {p1}, Ll/᩻۬ᩳ;->ۧ֫()Ll/۫᩹ᩳ;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 253
    :try_start_1
    invoke-virtual {p1}, Ll/۫᩹ᩳ;->᩻()J

    move-result-wide v1

    iget-wide v3, p0, Ll/ۛᩴᩳ;->᩺:J

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    invoke-virtual {p1}, Ll/۬᩹ᩳ;->length()I

    move-result v1

    iget v2, p0, Ll/ۛᩴᩳ;->ۨ:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v1, v2, :cond_0

    .line 256
    :try_start_2
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->close()V

    .line 257
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-void

    .line 254
    :cond_0
    :try_start_3
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Fragment recovery text no longer matches"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :catchall_0
    move-exception v1

    .line 252
    :try_start_4
    invoke-virtual {p1}, Ll/۬᩹ᩳ;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    :try_start_5
    invoke-virtual {v1, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw v1

    .line 250
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Fragment recovery candidate is no longer current"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_2
    move-exception p1

    .line 257
    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1
.end method
