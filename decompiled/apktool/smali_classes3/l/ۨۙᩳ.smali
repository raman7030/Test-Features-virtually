.class public final Ll/ۨۙᩳ;
.super Ljava/lang/Object;
.source "B6RA"


# instance fields
.field public final ֫:[B

.field public final ۧ:J

.field public final ܽ:Ljava/util/UUID;

.field public final ᩳ:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Ljava/util/UUID;J[B)V
    .locals 0

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Ll/ۨۙᩳ;->ᩳ:Ljava/util/UUID;

    iput-object p2, p0, Ll/ۨۙᩳ;->ܽ:Ljava/util/UUID;

    iput-wide p3, p0, Ll/ۨۙᩳ;->ۧ:J

    iput-object p5, p0, Ll/ۨۙᩳ;->֫:[B

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۨۙᩳ;)J
    .locals 2

    .line 0
    iget-wide v0, p0, Ll/ۨۙᩳ;->ۧ:J

    return-wide v0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/ByteArrayInputStream;JJLl/֨۬ᩳ;)Ll/ۨۙᩳ;
    .locals 16

    move-object/from16 v1, p0

    .line 71
    sget-object v2, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    const/4 v3, 0x0

    .line 81
    :try_start_0
    invoke-static/range {p1 .. p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    invoke-static/range {p3 .. p6}, Ll/ۨۙᩳ;->֫(JJ)V

    .line 83
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v6

    .line 84
    invoke-static {v1, v6}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;)Ll/᩷۠ᩴ;

    move-result-object v10

    const-wide/16 v4, 0x4000

    move-object/from16 v0, p7

    .line 85
    invoke-virtual {v0, v4, v5}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v11
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_b

    const/4 v0, 0x3

    :try_start_1
    new-array v0, v0, [Ll/᩻۠ᩴ;

    .line 86
    sget-object v4, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    const/4 v5, 0x0

    aput-object v4, v0, v5

    sget-object v4, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    const/4 v5, 0x1

    aput-object v4, v0, v5

    sget-object v4, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v5, 0x2

    aput-object v4, v0, v5

    invoke-static {v10, v0}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    const/16 v0, 0x2000

    :try_start_2
    new-array v12, v0, [B

    .line 89
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v4

    const-wide/16 v7, 0x54

    .line 91
    invoke-virtual {v3, v7, v8}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    move-wide/from16 v7, p3

    :goto_0
    const-string v13, "Recovery attachment write made no progress"

    const-wide/16 v14, 0x0

    cmp-long v5, v7, v14

    if-eqz v5, :cond_3

    int-to-long v14, v0

    .line 94
    :try_start_3
    invoke-static {v7, v8, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v14
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    long-to-int v5, v14

    const/4 v9, 0x0

    move-object/from16 v14, p2

    .line 95
    :try_start_4
    invoke-virtual {v14, v12, v9, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v15

    if-lez v15, :cond_2

    if-gt v15, v5, :cond_2

    .line 199
    invoke-static {v12, v9, v15}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 200
    :goto_1
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-eqz v9, :cond_1

    :try_start_5
    invoke-virtual {v3, v5}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v9

    if-lez v9, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v13}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    :cond_1
    const/4 v5, 0x0

    .line 97
    :try_start_6
    invoke-virtual {v4, v12, v5, v15}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v0, v15

    sub-long/2addr v7, v0

    const/16 v0, 0x2000

    move-object/from16 v1, p0

    goto :goto_0

    .line 96
    :cond_2
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Truncated or stalled recovery attachment input"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception v0

    move-object/from16 v14, p2

    :goto_2
    move-object/from16 v1, p0

    goto :goto_4

    .line 99
    :cond_3
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_6

    .line 100
    new-instance v0, Ll/ۨۙᩳ;

    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v9

    move-object v4, v0

    move-object/from16 v5, p1

    move-wide/from16 v7, p3

    invoke-direct/range {v4 .. v9}, Ll/ۨۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;J[B)V

    .line 101
    invoke-virtual {v3, v14, v15}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    invoke-virtual {v0}, Ll/ۨۙᩳ;->֫()[B

    move-result-object v1

    array-length v4, v1

    const/4 v5, 0x0

    .line 199
    invoke-static {v1, v5, v4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 200
    :goto_3
    invoke-virtual {v1}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v3, v1}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v4

    if-lez v4, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v13}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 102
    :cond_5
    invoke-interface {v2, v3}, Ll/᩺۬ᩳ;->֫(Ljava/nio/channels/FileChannel;)V

    .line 103
    invoke-direct {v0, v3, v12}, Ll/ۨۙᩳ;->֫(Ljava/nio/channels/FileChannel;[B)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 104
    :try_start_7
    invoke-virtual {v3}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    :try_start_8
    invoke-virtual {v11}, Ll/ۚ۬ᩳ;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    move-object/from16 v1, p0

    .line 105
    :try_start_9
    invoke-interface {v2, v1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_a

    .line 106
    :try_start_a
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    return-object v0

    :catchall_1
    move-exception v0

    goto :goto_b

    :catchall_2
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_8

    :catchall_3
    move-exception v0

    move-object/from16 v1, p0

    goto :goto_6

    :cond_6
    move-object/from16 v1, p0

    .line 99
    :try_start_b
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Trailing recovery attachment input"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    :catchall_4
    move-exception v0

    goto :goto_2

    :catchall_5
    move-exception v0

    :goto_4
    move-object v4, v0

    if-eqz v3, :cond_7

    .line 85
    :try_start_c
    invoke-virtual {v3}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    goto :goto_5

    :catchall_6
    move-exception v0

    move-object v3, v0

    :try_start_d
    invoke-virtual {v4, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_5
    throw v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    :catchall_7
    move-exception v0

    goto :goto_6

    :catchall_8
    move-exception v0

    move-object v10, v3

    :goto_6
    move-object v3, v0

    :try_start_e
    invoke-virtual {v11}, Ll/ۚ۬ᩳ;->close()V
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_9

    goto :goto_7

    :catchall_9
    move-exception v0

    move-object v4, v0

    :try_start_f
    invoke-virtual {v3, v4}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_7
    throw v3
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    :catchall_a
    move-exception v0

    :goto_8
    move-object v3, v10

    goto :goto_9

    :catchall_b
    move-exception v0

    :goto_9
    move-object v4, v3

    move-object v3, v0

    .line 80
    :try_start_10
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    goto :goto_a

    :catchall_c
    move-exception v0

    move-object v5, v0

    :try_start_11
    invoke-virtual {v3, v5}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_a
    throw v3
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    :catchall_d
    move-exception v0

    move-object v10, v4

    :goto_b
    if-eqz v10, :cond_8

    .line 112
    :try_start_12
    invoke-interface {v2, v10}, Ll/᩺۬ᩳ;->ۧ(Ll/᩷۠ᩴ;)V

    invoke-interface {v2, v1}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V
    :try_end_12
    .catch Ljava/io/IOException; {:try_start_12 .. :try_end_12} :catch_0

    .line 115
    :catch_0
    :cond_8
    throw v0
.end method

.method public static ֫([B)Ll/ۨۙᩳ;
    .locals 8

    .line 54
    array-length v0, p0

    const/16 v1, 0x54

    if-ne v0, v1, :cond_2

    const/4 v0, 0x0

    const/16 v1, 0x50

    invoke-static {v0, v1, p0}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result v0

    .line 197
    new-instance v2, Ll/۬ۜܽ;

    invoke-direct {v2, p0}, Ll/۬ۜܽ;-><init>([B)V

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Ll/۬ۜܽ;->seek(J)V

    invoke-virtual {v2}, Ll/۬ۜܽ;->readInt()I

    move-result v1

    if-ne v0, v1, :cond_2

    .line 57
    new-instance v0, Ll/۬ۜܽ;

    invoke-direct {v0, p0}, Ll/۬ۜܽ;-><init>([B)V

    .line 58
    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    const v1, 0x32415452

    if-ne p0, v1, :cond_1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readInt()I

    move-result p0

    const/4 v1, 0x1

    if-ne p0, v1, :cond_1

    .line 59
    new-instance v3, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v4

    invoke-direct {v3, v1, v2, v4, v5}, Ljava/util/UUID;-><init>(JJ)V

    new-instance v4, Ljava/util/UUID;

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v1

    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v5

    invoke-direct {v4, v1, v2, v5, v6}, Ljava/util/UUID;-><init>(JJ)V

    .line 60
    invoke-virtual {v0}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v5

    const-wide/16 v1, 0x0

    cmp-long p0, v5, v1

    if-ltz p0, :cond_0

    const-wide/32 v1, 0x7fffffff

    cmp-long p0, v5, v1

    if-gtz p0, :cond_0

    .line 62
    new-instance p0, Ll/ۨۙᩳ;

    const/16 v1, 0x20

    new-array v7, v1, [B

    .line 212
    invoke-virtual {v0, v1, v7}, Ll/۬ۜܽ;->֫(I[B)V

    move-object v2, p0

    .line 62
    invoke-direct/range {v2 .. v7}, Ll/ۨۙᩳ;-><init>(Ljava/util/UUID;Ljava/util/UUID;J[B)V

    return-object p0

    .line 61
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery attachment length"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 58
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unsupported recovery attachment reference"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 55
    :cond_2
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Invalid recovery attachment reference"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/util/UUID;)Ll/᩷۠ᩴ;
    .locals 2

    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "state-"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ".bin"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(JJ)V
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v4, p0, v2

    if-gtz v4, :cond_0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_0

    cmp-long v0, p0, p2

    if-gtz v0, :cond_0

    return-void

    .line 193
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Recovery attachment exceeds state limit"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private ֫(Ljava/nio/channels/FileChannel;[B)V
    .locals 12

    .line 179
    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v0

    iget-wide v2, p0, Ll/ۨۙᩳ;->ۧ:J

    const-wide/16 v4, 0x54

    add-long/2addr v4, v2

    cmp-long v6, v0, v4

    if-nez v6, :cond_7

    const-wide/16 v0, 0x0

    .line 180
    invoke-virtual {p1, v0, v1}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    const/4 v6, 0x0

    const/16 v7, 0x54

    .line 203
    invoke-static {p2, v6, v7}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 204
    :goto_0
    invoke-virtual {v8}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9

    const-string v10, "Truncated recovery attachment"

    if-eqz v9, :cond_1

    invoke-virtual {p1, v8}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v9

    if-lez v9, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1, v10}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 181
    :cond_1
    invoke-virtual {p0}, Ll/ۨۙᩳ;->֫()[B

    move-result-object v8

    invoke-static {p2, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v7

    invoke-static {v8, v7}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 182
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v7

    :goto_1
    cmp-long v8, v2, v0

    if-eqz v8, :cond_4

    .line 185
    array-length v8, p2

    int-to-long v8, v8

    invoke-static {v2, v3, v8, v9}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    long-to-int v9, v8

    .line 203
    invoke-static {p2, v6, v9}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 204
    :goto_2
    invoke-virtual {v8}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v11

    if-eqz v11, :cond_3

    invoke-virtual {p1, v8}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v11

    if-lez v11, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1, v10}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 186
    :cond_3
    invoke-virtual {v7, p2, v6, v9}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v8, v9

    sub-long/2addr v2, v8

    goto :goto_1

    .line 188
    :cond_4
    iget-object p2, p0, Ll/ۨۙᩳ;->֫:[B

    invoke-virtual {v7}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {p2, v0}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide p1

    cmp-long v0, p1, v4

    if-nez v0, :cond_5

    return-void

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery attachment checksum does not match reference"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 181
    :cond_6
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery attachment identity does not match reference"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 179
    :cond_7
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery attachment length does not match reference"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/util/List;)V
    .locals 10

    .line 154
    sget-object v0, Ll/᩺۬ᩳ;->֫:Ll/᩺۬ᩳ;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 155
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ۨۙᩳ;

    .line 156
    iget-object v5, v2, Ll/ۨۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-virtual {v5, p1}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 157
    iget-object v2, v2, Ll/ۨۙᩳ;->ܽ:Ljava/util/UUID;

    invoke-static {p0, v2}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;)Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-interface {v2}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v2

    .line 158
    invoke-interface {p0, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v5

    new-array v4, v4, [Ll/ܳ۠ᩴ;

    sget-object v6, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v6, v4, v3

    invoke-static {v5, v4}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 159
    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 158
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Live attachment is missing"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 156
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Live attachment belongs to another session"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 161
    :cond_2
    invoke-virtual {v1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_a

    :try_start_0
    const-string p1, "state-*.bin"

    .line 163
    invoke-static {p0, p1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;Ljava/lang/String;)Ljava/nio/file/DirectoryStream;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 164
    :try_start_1
    invoke-interface {p1}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/4 v2, 0x0

    :catch_0
    :cond_3
    :goto_1
    :try_start_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll/᩷۠ᩴ;

    .line 165
    invoke-interface {v5}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v6

    invoke-interface {v6}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v6

    .line 166
    invoke-virtual {v1, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    new-array v7, v4, [Ll/ܳ۠ᩴ;

    sget-object v8, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    aput-object v8, v7, v3

    invoke-static {v5, v7}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const/16 v8, 0x2e

    if-eq v7, v8, :cond_4

    goto :goto_1

    :cond_4
    const/4 v7, 0x6

    const/16 v8, 0x2a

    .line 168
    :try_start_3
    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v7
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 170
    :try_start_4
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "state-"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ".bin"

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    goto :goto_1

    .line 171
    :cond_5
    invoke-static {v5}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    const/4 v2, 0x1

    goto :goto_1

    .line 173
    :cond_6
    :try_start_5
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-eqz v2, :cond_7

    .line 174
    invoke-interface {v0, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    :cond_7
    return-void

    :catchall_0
    move-exception p1

    goto :goto_4

    :catchall_1
    move-exception p2

    move v3, v2

    goto :goto_2

    :catchall_2
    move-exception p2

    :goto_2
    if-eqz p1, :cond_8

    .line 163
    :try_start_6
    invoke-interface {p1}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    :try_start_7
    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_8
    :goto_3
    throw p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    :catchall_4
    move-exception p1

    move v2, v3

    :goto_4
    if-eqz v2, :cond_9

    .line 174
    invoke-interface {v0, p0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 175
    :cond_9
    throw p1

    .line 161
    :cond_a
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Attachment collection requires a durable live reference"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final ֫(Ll/᩷۠ᩴ;Ljava/util/UUID;JLl/֨۬ᩳ;)Ljava/io/InputStream;
    .locals 2

    .line 120
    iget-object v0, p0, Ll/ۨۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-virtual {v0, p2}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    .line 121
    iget-wide v0, p0, Ll/ۨۙᩳ;->ۧ:J

    invoke-static {v0, v1, p3, p4}, Ll/ۨۙᩳ;->֫(JJ)V

    .line 122
    iget-object p2, p0, Ll/ۨۙᩳ;->ܽ:Ljava/util/UUID;

    invoke-static {p1, p2}, Ll/ۨۙᩳ;->֫(Ll/᩷۠ᩴ;Ljava/util/UUID;)Ll/᩷۠ᩴ;

    move-result-object p1

    .line 123
    sget-object p2, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 p3, 0x1

    new-array p4, p3, [Ll/ܳ۠ᩴ;

    const/4 v0, 0x0

    aput-object p2, p4, v0

    invoke-static {p1, p4}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x2

    new-array p4, p4, [Ll/᩻۠ᩴ;

    .line 124
    sget-object v1, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v1, p4, v0

    aput-object p2, p4, p3

    invoke-static {p1, p4}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    const-wide/16 p2, 0x4000

    .line 127
    :try_start_0
    invoke-virtual {p5, p2, p3}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    const/16 p3, 0x2000

    :try_start_1
    new-array p3, p3, [B

    invoke-direct {p0, p1, p3}, Ll/ۨۙᩳ;->֫(Ljava/nio/channels/FileChannel;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p2}, Ll/ۚ۬ᩳ;->close()V

    const-wide/16 p2, 0x54

    .line 128
    invoke-virtual {p1, p2, p3}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 129
    new-instance p2, Ll/ۛۙᩳ;

    invoke-direct {p2, p0, p1}, Ll/ۛۙᩳ;-><init>(Ll/ۨۙᩳ;Ljava/nio/channels/FileChannel;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    return-object p2

    :catchall_0
    move-exception p3

    .line 127
    :try_start_3
    invoke-virtual {p2}, Ll/ۚ۬ᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    :try_start_4
    invoke-virtual {p3, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception p2

    .line 146
    invoke-virtual {p1}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    throw p2

    .line 123
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery attachment is not a regular file"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 120
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Recovery attachment belongs to another session"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()[B
    .locals 4

    .line 43
    new-instance v0, Ll/ۤۜܽ;

    const/16 v1, 0x54

    invoke-direct {v0, v1}, Ll/ۤۜܽ;-><init>(I)V

    const v1, 0x32415452

    .line 44
    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 45
    iget-object v1, p0, Ll/ۨۙᩳ;->ᩳ:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 46
    iget-object v1, p0, Ll/ۨۙᩳ;->ܽ:Ljava/util/UUID;

    invoke-virtual {v1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual {v1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    .line 47
    iget-wide v1, p0, Ll/ۨۙᩳ;->ۧ:J

    invoke-virtual {v0, v1, v2}, Ll/ۤۜܽ;->ۧ(J)V

    iget-object v1, p0, Ll/ۨۙᩳ;->֫:[B

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->write([B)V

    .line 48
    invoke-virtual {v0}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0}, Ll/ۤۜܽ;->size()I

    move-result v3

    invoke-static {v2, v3, v1}, Ll/֫۫ᩳ;->֫(II[B)I

    move-result v1

    invoke-virtual {v0, v1}, Ll/ۤۜܽ;->writeInt(I)V

    .line 49
    invoke-virtual {v0}, Ll/ۤۜܽ;->᩻()[B

    move-result-object v0

    return-object v0
.end method

.method public final ۧ()J
    .locals 2

    .line 39
    iget-wide v0, p0, Ll/ۨۙᩳ;->ۧ:J

    return-wide v0
.end method

.method public final ܽ()Ljava/util/UUID;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۨۙᩳ;->ᩳ:Ljava/util/UUID;

    return-object v0
.end method
