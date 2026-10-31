.class public final Ll/ۛ᩶ᩳ;
.super Ljava/lang/Object;
.source "X6S5"


# direct methods
.method public static ֫(Ll/᩷۠ᩴ;Ll/۫᩶ᩳ;Ll/֨۬ᩳ;Ll/᩺۬ᩳ;)Ljava/io/InputStream;
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    const-string v2, "migration-state.bin"

    move-object/from16 v3, p0

    .line 58
    invoke-interface {v3, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    const/4 v3, 0x1

    new-array v4, v3, [Ll/ܳ۠ᩴ;

    .line 59
    sget-object v5, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v6, 0x0

    aput-object v5, v4, v6

    invoke-static {v2, v4}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v4

    if-eqz v4, :cond_a

    if-nez v1, :cond_0

    new-array v4, v3, [Ll/᩻۠ᩴ;

    .line 60
    sget-object v5, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v5, v4, v6

    invoke-static {v2, v4}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    new-array v4, v4, [Ll/᩻۠ᩴ;

    .line 61
    sget-object v5, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    aput-object v5, v4, v6

    sget-object v5, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    aput-object v5, v4, v3

    invoke-static {v2, v4}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object v2

    :goto_0
    const-wide/16 v4, 0x4000

    move-object/from16 v7, p2

    .line 64
    :try_start_0
    invoke-virtual {v7, v4, v5}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 65
    :try_start_1
    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v7

    iget-wide v9, v0, Ll/۫᩶ᩳ;->ܽ:J

    const-wide/16 v11, 0x20

    add-long v13, v9, v11

    cmp-long v5, v7, v13

    if-nez v5, :cond_9

    const/16 v5, 0x2000

    new-array v7, v5, [B

    const/16 v8, 0x20

    .line 111
    invoke-static {v7, v6, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v6

    .line 112
    :goto_1
    invoke-virtual {v6}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v13, "Truncated migration state file"

    if-eqz v8, :cond_2

    :try_start_2
    invoke-virtual {v2, v6}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v8

    if-lez v8, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0, v13}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 68
    :cond_2
    new-instance v6, Ll/۬ۜܽ;

    invoke-direct {v6, v7}, Ll/۬ۜܽ;-><init>([B)V

    .line 69
    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    const v14, 0x4d325354    # 1.8698784E8f

    if-ne v8, v14, :cond_8

    invoke-virtual {v6}, Ll/۬ۜܽ;->readInt()I

    move-result v8

    if-ne v8, v3, :cond_8

    new-instance v3, Ljava/util/UUID;

    .line 70
    invoke-virtual {v6}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v14

    invoke-virtual {v6}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v11

    invoke-direct {v3, v14, v15, v11, v12}, Ljava/util/UUID;-><init>(JJ)V

    iget-object v8, v0, Ll/۫᩶ᩳ;->֫:Ljava/util/UUID;

    invoke-virtual {v3, v8}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 71
    invoke-virtual {v6}, Ll/۬ۜܽ;->readLong()J

    move-result-wide v11

    cmp-long v3, v11, v9

    if-nez v3, :cond_8

    .line 72
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v3

    move-wide v11, v9

    :goto_2
    const-wide/16 v14, 0x0

    cmp-long v6, v11, v14

    if-eqz v6, :cond_5

    int-to-long v5, v5

    .line 75
    invoke-static {v11, v12, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v5

    long-to-int v6, v5

    const/4 v5, 0x0

    .line 111
    invoke-static {v7, v5, v6}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v5

    .line 112
    :goto_3
    invoke-virtual {v5}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-virtual {v2, v5}, Ljava/nio/channels/FileChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result v8

    if-lez v8, :cond_3

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0, v13}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    const/4 v5, 0x0

    .line 76
    invoke-virtual {v3, v7, v5, v6}, Ljava/security/MessageDigest;->update([BII)V

    int-to-long v5, v6

    sub-long/2addr v11, v5

    const/16 v5, 0x2000

    goto :goto_2

    .line 78
    :cond_5
    iget-object v5, v0, Ll/۫᩶ᩳ;->ۧ:[B

    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v5, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v2}, Ljava/nio/channels/FileChannel;->size()J

    move-result-wide v5

    const-wide/16 v7, 0x20

    add-long/2addr v9, v7

    cmp-long v3, v5, v9

    if-nez v3, :cond_7

    if-eqz v1, :cond_6

    .line 81
    invoke-interface {v1, v2}, Ll/᩺۬ᩳ;->֫(Ljava/nio/channels/FileChannel;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 82
    :cond_6
    :try_start_3
    invoke-virtual {v4}, Ll/ۚ۬ᩳ;->close()V

    const-wide/16 v3, 0x20

    .line 83
    invoke-virtual {v2, v3, v4}, Ljava/nio/channels/FileChannel;->position(J)Ljava/nio/channels/FileChannel;

    .line 84
    new-instance v1, Ll/ۤ᩶ᩳ;

    invoke-direct {v1, v0, v2}, Ll/ۤ᩶ᩳ;-><init>(Ll/۫᩶ᩳ;Ljava/nio/channels/FileChannel;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    return-object v1

    .line 79
    :cond_7
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration state checksum does not match commit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 71
    :cond_8
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration state identity does not match commit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 65
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration state length does not match commit"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 64
    :try_start_5
    invoke-virtual {v4}, Ll/ۚ۬ᩳ;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    move-object v3, v0

    :try_start_6
    invoke-virtual {v1, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    .line 103
    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    throw v0

    .line 59
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Migration state is not a regular file"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/᩷۠ᩴ;Ljava/util/UUID;Ljava/io/InputStream;JLl/֨۬ᩳ;Ll/᩺۬ᩳ;)Ll/۫᩶ᩳ;
    .locals 17

    move-object/from16 v0, p0

    move-wide/from16 v2, p3

    move-object/from16 v1, p6

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_8

    const-wide/32 v6, 0x7fffffff

    cmp-long v8, v2, v6

    if-gtz v8, :cond_8

    const-wide/16 v6, 0x4000

    move-object/from16 v8, p5

    .line 35
    invoke-virtual {v8, v6, v7}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v6

    :try_start_0
    const-string v7, "migration-state.bin"

    .line 36
    invoke-interface {v0, v7}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v7

    const/4 v8, 0x2

    new-array v8, v8, [Ll/᩻۠ᩴ;

    sget-object v9, Ll/ۘ۠ᩴ;->CREATE_NEW:Ll/ۘ۠ᩴ;

    const/4 v10, 0x0

    aput-object v9, v8, v10

    sget-object v9, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v11, 0x1

    aput-object v9, v8, v11

    invoke-static {v7, v8}, Ll/۫֨ᩴ;->open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 37
    :try_start_1
    new-instance v8, Ll/ۤۜܽ;

    const/16 v9, 0x20

    invoke-direct {v8, v9}, Ll/ۤۜܽ;-><init>(I)V

    const v9, 0x4d325354    # 1.8698784E8f

    .line 38
    invoke-virtual {v8, v9}, Ll/ۤۜܽ;->writeInt(I)V

    invoke-virtual {v8, v11}, Ll/ۤۜܽ;->writeInt(I)V

    .line 39
    invoke-virtual/range {p1 .. p1}, Ljava/util/UUID;->getMostSignificantBits()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual/range {p1 .. p1}, Ljava/util/UUID;->getLeastSignificantBits()J

    move-result-wide v11

    invoke-virtual {v8, v11, v12}, Ll/ۤۜܽ;->ۧ(J)V

    invoke-virtual {v8, v2, v3}, Ll/ۤۜܽ;->ۧ(J)V

    .line 40
    invoke-virtual {v8}, Ll/ۤۜܽ;->ܽ()[B

    move-result-object v9

    invoke-virtual {v8}, Ll/ۤۜܽ;->size()I

    move-result v8

    .line 107
    invoke-static {v9, v10, v8}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v8

    .line 108
    :goto_0
    invoke-virtual {v8}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v11, "Migration state write made no progress"

    if-eqz v9, :cond_1

    :try_start_2
    invoke-virtual {v7, v8}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v9

    if-lez v9, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v11}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    const/16 v8, 0x2000

    new-array v9, v8, [B

    .line 42
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v12

    move-wide v13, v2

    :goto_1
    cmp-long v15, v13, v4

    if-eqz v15, :cond_5

    int-to-long v4, v8

    .line 45
    invoke-static {v13, v14, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    long-to-int v5, v4

    move-object/from16 v4, p2

    invoke-virtual {v4, v9, v10, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-lez v5, :cond_4

    move-object/from16 p5, v11

    int-to-long v10, v5

    cmp-long v15, v10, v13

    if-gtz v15, :cond_4

    const/4 v8, 0x0

    .line 107
    invoke-static {v9, v8, v5}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object v15

    .line 108
    :goto_2
    invoke-virtual {v15}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v16

    if-eqz v16, :cond_3

    invoke-virtual {v7, v15}, Ljava/nio/channels/FileChannel;->write(Ljava/nio/ByteBuffer;)I

    move-result v16

    if-lez v16, :cond_2

    goto :goto_2

    :cond_2
    new-instance v0, Ljava/io/IOException;

    move-object/from16 v15, p5

    invoke-direct {v0, v15}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object/from16 v15, p5

    const/4 v8, 0x0

    .line 47
    invoke-virtual {v12, v9, v8, v5}, Ljava/security/MessageDigest;->update([BII)V

    sub-long/2addr v13, v10

    const-wide/16 v10, 0x0

    const/16 v5, 0x2000

    move-wide v4, v10

    move-object v11, v15

    const/16 v8, 0x2000

    const/4 v10, 0x0

    goto :goto_1

    .line 46
    :cond_4
    new-instance v0, Ljava/io/EOFException;

    const-string v1, "Truncated or stalled migration state input"

    invoke-direct {v0, v1}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object/from16 v4, p2

    .line 49
    invoke-virtual/range {p2 .. p2}, Ljava/io/InputStream;->read()I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_6

    .line 50
    invoke-interface {v1, v7}, Ll/᩺۬ᩳ;->֫(Ljava/nio/channels/FileChannel;)V

    .line 51
    invoke-interface {v1, v0}, Ll/᩺۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    .line 52
    new-instance v9, Ll/۫᩶ᩳ;

    invoke-virtual {v12}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v4

    const/4 v0, 0x0

    new-array v5, v0, [B

    move-object v0, v9

    move-object/from16 v1, p1

    move-wide/from16 v2, p3

    invoke-direct/range {v0 .. v5}, Ll/۫᩶ᩳ;-><init>(Ljava/util/UUID;J[B[B)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    :try_start_3
    invoke-virtual {v7}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    invoke-virtual {v6}, Ll/ۚ۬ᩳ;->close()V

    return-object v9

    .line 49
    :cond_6
    :try_start_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing bytes in migration state input"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catchall_0
    move-exception v0

    move-object v1, v0

    if-eqz v7, :cond_7

    .line 35
    :try_start_5
    invoke-virtual {v7}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    move-object v2, v0

    :try_start_6
    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_7
    :goto_3
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v0

    move-object v1, v0

    :try_start_7
    invoke-virtual {v6}, Ll/ۚ۬ᩳ;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_4

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v1

    .line 34
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid migration state length"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
