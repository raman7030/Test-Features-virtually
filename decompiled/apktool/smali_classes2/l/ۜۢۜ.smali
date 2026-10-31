.class public final Ll/ۜۢۜ;
.super Ljava/lang/Object;
.source "J71B"


# static fields
.field public static final ᩴ:[Ljava/lang/String;


# instance fields
.field public final ֫:J

.field public final ۖ:J

.field public final ۘ:J

.field public final ۜ:J

.field public final ۡ:J

.field public final ۢ:[J

.field public final ۧ:J

.field public final ܳ:J

.field public final ܺ:J

.field public final ܽ:[B

.field public final ܿ:J

.field public final ᩳ:J

.field public final ᩷:J

.field public final ᩻:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    .line 250
    sput-object v0, Ll/ۜۢۜ;->ᩴ:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(JJJJJJJJJJJJ)V
    .locals 6

    move-object v0, p0

    move-wide v1, p7

    .line 273
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v3, 0x400

    new-array v3, v3, [B

    .line 266
    iput-object v3, v0, Ll/ۜۢۜ;->ܽ:[B

    move-wide v3, p1

    .line 275
    iput-wide v3, v0, Ll/ۜۢۜ;->ܺ:J

    move-wide v3, p3

    .line 276
    iput-wide v3, v0, Ll/ۜۢۜ;->ۡ:J

    move-wide v3, p5

    .line 277
    iput-wide v3, v0, Ll/ۜۢۜ;->ۘ:J

    .line 278
    iput-wide v1, v0, Ll/ۜۢۜ;->ۖ:J

    move-wide v3, p9

    .line 279
    iput-wide v3, v0, Ll/ۜۢۜ;->ۧ:J

    move-wide/from16 v3, p11

    .line 280
    iput-wide v3, v0, Ll/ۜۢۜ;->֫:J

    move-wide/from16 v3, p13

    .line 281
    iput-wide v3, v0, Ll/ۜۢۜ;->ܿ:J

    move-wide/from16 v3, p15

    .line 282
    iput-wide v3, v0, Ll/ۜۢۜ;->ᩳ:J

    move-wide/from16 v3, p17

    .line 283
    iput-wide v3, v0, Ll/ۜۢۜ;->᩷:J

    move-wide/from16 v3, p19

    .line 284
    iput-wide v3, v0, Ll/ۜۢۜ;->ۜ:J

    move-wide/from16 v3, p21

    .line 285
    iput-wide v3, v0, Ll/ۜۢۜ;->᩻:J

    move-wide/from16 v3, p23

    .line 286
    iput-wide v3, v0, Ll/ۜۢۜ;->ܳ:J

    const-wide/32 v3, 0x7fffffff

    cmp-long v5, v1, v3

    if-gtz v5, :cond_0

    long-to-int v2, v1

    .line 290
    new-array v1, v2, [J

    iput-object v1, v0, Ll/ۜۢۜ;->ۢ:[J

    return-void

    .line 288
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "Too many boot hierarchy types"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static ֫(IJ)J
    .locals 4

    int-to-long v0, p0

    const-wide v2, 0x7fffffffffffffffL

    .line 605
    div-long/2addr v2, v0

    cmp-long p0, p1, v2

    if-gtz p0, :cond_0

    mul-long p1, p1, v0

    return-wide p1

    .line 606
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Boot hierarchy count overflow"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/io/RandomAccessFile;)J
    .locals 4

    .line 623
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->readInt()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    move-result p0

    int-to-long v0, p0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    return-wide v0
.end method

.method private ֫(Ljava/io/RandomAccessFile;[BJJI)J
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-wide/16 v3, 0x1

    sub-long v5, p5, v3

    const-wide/16 v7, 0x0

    :goto_0
    cmp-long v9, v7, v5

    if-gtz v9, :cond_6

    add-long v9, v7, v5

    const/4 v11, 0x1

    ushr-long/2addr v9, v11

    move/from16 v11, p7

    int-to-long v12, v11

    mul-long v12, v12, v9

    add-long v12, v12, p3

    .line 520
    invoke-virtual {v1, v12, v13}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 521
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v12

    .line 522
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v14

    .line 538
    invoke-direct {v0, v12, v13, v14, v15}, Ll/ۜۢۜ;->֫(JJ)V

    .line 539
    array-length v3, v2

    int-to-long v3, v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    move-wide/from16 p5, v5

    .line 541
    iget-wide v5, v0, Ll/ۜۢۜ;->ܺ:J

    add-long/2addr v5, v12

    invoke-virtual {v1, v5, v6}, Ljava/io/RandomAccessFile;->seek(J)V

    const-wide/16 v5, 0x0

    :goto_1
    cmp-long v12, v5, v3

    if-gez v12, :cond_3

    .line 543
    iget-object v12, v0, Ll/ۜۢۜ;->ܽ:[B

    array-length v13, v12

    move-wide/from16 v16, v7

    int-to-long v7, v13

    move-wide/from16 v18, v9

    sub-long v9, v3, v5

    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v8, v7

    const/4 v7, 0x0

    .line 544
    invoke-virtual {v1, v12, v7, v8}, Ljava/io/RandomAccessFile;->readFully([BII)V

    :goto_2
    if-ge v7, v8, :cond_2

    .line 546
    aget-byte v9, v12, v7

    and-int/lit16 v9, v9, 0xff

    long-to-int v10, v5

    add-int/2addr v10, v7

    .line 547
    aget-byte v10, v2, v10

    and-int/lit16 v10, v10, 0xff

    if-eq v9, v10, :cond_1

    if-ge v9, v10, :cond_0

    const/4 v3, -0x1

    goto :goto_3

    :cond_0
    const/4 v3, 0x1

    goto :goto_3

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    int-to-long v7, v8

    add-long/2addr v5, v7

    move-wide/from16 v7, v16

    move-wide/from16 v9, v18

    goto :goto_1

    :cond_3
    move-wide/from16 v16, v7

    move-wide/from16 v18, v9

    .line 554
    array-length v3, v2

    int-to-long v3, v3

    invoke-static {v14, v15, v3, v4}, Ljava/lang/Long;->compare(JJ)I

    move-result v3

    :goto_3
    const-wide/16 v4, 0x1

    if-gez v3, :cond_4

    add-long v9, v18, v4

    move-wide v7, v9

    move-wide/from16 v9, p5

    goto :goto_4

    :cond_4
    if-lez v3, :cond_5

    sub-long v9, v18, v4

    move-wide/from16 v7, v16

    :goto_4
    move-wide v3, v4

    move-wide v5, v9

    goto :goto_0

    :cond_5
    return-wide v18

    :cond_6
    const-wide/16 v1, -0x1

    return-wide v1
.end method

.method private ֫(Ljava/io/RandomAccessFile;J)Ljava/lang/String;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1

    .line 559
    iget-wide v0, p0, Ll/ۜۢۜ;->ۖ:J

    cmp-long v2, p2, v0

    if-gez v2, :cond_1

    const-wide/16 v0, 0xc

    mul-long p2, p2, v0

    .line 562
    iget-wide v0, p0, Ll/ۜۢۜ;->ۘ:J

    add-long/2addr p2, v0

    invoke-virtual {p1, p2, p3}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 563
    invoke-static {p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide p2

    .line 564
    invoke-static {p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v0

    .line 565
    invoke-direct {p0, p2, p3, v0, v1}, Ll/ۜۢۜ;->֫(JJ)V

    const-wide/32 v2, 0x100000

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    long-to-int v1, v0

    .line 569
    new-array v0, v1, [B

    .line 570
    iget-wide v1, p0, Ll/ۜۢۜ;->ܺ:J

    add-long/2addr v1, p2

    invoke-virtual {p1, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 571
    invoke-virtual {p1, v0}, Ljava/io/RandomAccessFile;->readFully([B)V

    .line 572
    new-instance p1, Ljava/lang/String;

    sget-object p2, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-direct {p1, v0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1

    .line 567
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Boot hierarchy string is too large"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 560
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid boot hierarchy type id"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(Ljava/io/File;)Ll/ۜۢۜ;
    .locals 36

    move-object/from16 v0, p0

    .line 295
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->isFile()Z

    move-result v1

    if-eqz v1, :cond_12

    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    move-result-wide v1

    const-wide/32 v3, 0x341cc8

    cmp-long v5, v1, v3

    if-nez v5, :cond_12

    const/16 v1, 0xd0

    new-array v2, v1, [B

    .line 299
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v3

    .line 300
    invoke-static {}, Ll/ܳۤۡ;->ܽ()Ljava/security/MessageDigest;

    move-result-object v4

    .line 301
    new-instance v5, Ljava/io/FileInputStream;

    invoke-direct {v5, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v1, :cond_1

    rsub-int v8, v7, 0xd0

    .line 587
    :try_start_0
    invoke-virtual {v5, v2, v7, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v8

    if-ltz v8, :cond_0

    add-int/2addr v7, v8

    goto :goto_0

    .line 589
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Truncated boot hierarchy header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 303
    :cond_1
    invoke-virtual {v3, v2}, Ljava/security/MessageDigest;->update([B)V

    const v7, 0x8000

    new-array v7, v7, [B

    .line 306
    :goto_1
    invoke-virtual {v5, v7}, Ljava/io/FileInputStream;->read([B)I

    move-result v8

    const/4 v9, -0x1

    if-eq v8, v9, :cond_2

    .line 307
    invoke-virtual {v3, v7, v6, v8}, Ljava/security/MessageDigest;->update([BII)V

    .line 308
    invoke-virtual {v4, v7, v6, v8}, Ljava/security/MessageDigest;->update([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    goto :goto_1

    .line 310
    :cond_2
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V

    .line 311
    invoke-virtual {v3}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v3

    invoke-static {v3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v3

    const-string v5, "bacb8cb4bb4a4c60edf467ff9d5a56aff4b5bb36e37bbd08e3b0e162efede5fc"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 315
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v2

    sget-object v3, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v2

    .line 316
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    const/16 v5, 0x4d

    if-ne v3, v5, :cond_10

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    const/16 v5, 0x54

    if-ne v3, v5, :cond_10

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    const/16 v5, 0x42

    if-ne v3, v5, :cond_10

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    const/16 v5, 0x48

    if-ne v3, v5, :cond_10

    .line 317
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    const v5, 0xffff

    and-int/2addr v3, v5

    const/4 v6, 0x1

    if-ne v3, v6, :cond_10

    .line 318
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getShort()S

    move-result v3

    and-int/2addr v3, v5

    if-ne v3, v1, :cond_10

    .line 319
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    const v3, 0x1020304

    if-ne v1, v3, :cond_10

    .line 320
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v5, v1

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    const-wide/16 v9, 0x24

    cmp-long v1, v5, v9

    if-nez v1, :cond_10

    .line 321
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v5, v1

    and-long/2addr v5, v7

    const-wide/16 v9, 0x1

    cmp-long v1, v5, v9

    if-nez v1, :cond_10

    .line 324
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    if-nez v1, :cond_f

    .line 327
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v5, v1

    and-long/2addr v5, v7

    .line 328
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v9, v1

    and-long v14, v9, v7

    .line 329
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v9, v1

    and-long v12, v9, v7

    .line 330
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v9, v1

    and-long v10, v9, v7

    .line 331
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v1

    int-to-long v0, v1

    and-long/2addr v0, v7

    .line 332
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result v3

    if-nez v3, :cond_e

    cmp-long v3, v14, v5

    if-gtz v3, :cond_e

    const/4 v3, 0x6

    new-array v8, v3, [J

    const/16 v16, 0x1

    new-array v9, v3, [J

    const/16 v17, 0x0

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v3, :cond_3

    .line 338
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v19

    aput-wide v19, v8, v7

    .line 339
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v19

    aput-wide v19, v9, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_3
    const/16 v3, 0x20

    new-array v7, v3, [B

    new-array v3, v3, [B

    .line 343
    invoke-virtual {v2, v7}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    .line 344
    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->get([B)Ljava/nio/ByteBuffer;

    const-string v2, "d9eb9da824d9e247a352f570f01e1169e725b2954bca9e283a71786c59b59f9a"

    .line 345
    invoke-static {v7}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 346
    invoke-static {v3}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v2

    const-string v3, "b2e82096748c00fa60056e7affddea44002d3a0e44201dc814dff202cdfc0e95"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    .line 348
    invoke-virtual {v4}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v2

    invoke-static {v2}, Ll/ܳۤۡ;->ۧ([B)Ljava/lang/String;

    move-result-object v2

    .line 347
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v2, 0x0

    .line 351
    aget-wide v3, v9, v2

    const/16 v2, 0xc

    .line 352
    invoke-static {v2, v5, v6}, Ll/ۜۢۜ;->֫(IJ)J

    move-result-wide v19

    const/16 v2, 0x10

    invoke-static {v2, v14, v15}, Ll/ۜۢۜ;->֫(IJ)J

    move-result-wide v21

    const/4 v2, 0x4

    .line 353
    invoke-static {v2, v12, v13}, Ll/ۜۢۜ;->֫(IJ)J

    move-result-wide v23

    const/16 v2, 0x14

    .line 354
    invoke-static {v2, v10, v11}, Ll/ۜۢۜ;->֫(IJ)J

    move-result-wide v25

    const/16 v2, 0x8

    invoke-static {v2, v0, v1}, Ll/ۜۢۜ;->֫(IJ)J

    move-result-wide v27

    const/4 v2, 0x6

    new-array v7, v2, [J

    const/16 v18, 0x0

    aput-wide v3, v7, v18

    aput-wide v19, v7, v16

    const/4 v3, 0x2

    aput-wide v21, v7, v3

    const/4 v3, 0x3

    aput-wide v23, v7, v3

    const/4 v4, 0x4

    aput-wide v25, v7, v4

    const/4 v4, 0x5

    aput-wide v27, v7, v4

    const/16 v19, 0x1

    const/16 v20, 0x2

    const/4 v4, 0x1

    :goto_3
    if-ge v4, v2, :cond_5

    .line 357
    aget-wide v22, v9, v4

    aget-wide v24, v7, v4

    cmp-long v2, v22, v24

    if-nez v2, :cond_4

    add-int/lit8 v4, v4, 0x1

    const/4 v2, 0x6

    goto :goto_3

    .line 358
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy section length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    const/4 v2, 0x0

    const-wide/16 v22, 0xd0

    :goto_4
    const-wide/16 v34, 0x0

    const/4 v4, 0x6

    const-wide/16 v24, 0xd0

    if-ge v2, v4, :cond_8

    .line 363
    aget-wide v26, v8, v2

    aget-wide v28, v9, v2

    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    move-result-wide v30

    cmp-long v4, v26, v24

    if-ltz v4, :cond_7

    cmp-long v4, v28, v34

    if-ltz v4, :cond_7

    cmp-long v4, v26, v30

    if-gtz v4, :cond_7

    sub-long v30, v30, v26

    cmp-long v4, v28, v30

    if-gtz v4, :cond_7

    add-long v24, v26, v28

    .line 364
    aget-wide v26, v8, v2

    const-wide/16 v28, 0x7

    and-long v28, v26, v28

    cmp-long v4, v28, v34

    if-nez v4, :cond_6

    cmp-long v4, v26, v22

    if-ltz v4, :cond_6

    add-int/lit8 v2, v2, 0x1

    move-wide/from16 v22, v24

    goto :goto_4

    .line 365
    :cond_6
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Overlapping boot hierarchy sections"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 598
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy section range"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 369
    :cond_8
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    move-result-wide v24

    cmp-long v2, v22, v24

    if-nez v2, :cond_c

    .line 372
    new-instance v2, Ll/ۜۢۜ;

    move-object v4, v9

    move-object v9, v2

    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->length()J

    const/4 v7, 0x0

    aget-wide v18, v8, v7

    move-wide/from16 v28, v10

    move-wide/from16 v10, v18

    aget-wide v18, v4, v7

    move-wide/from16 v24, v12

    move-wide/from16 v12, v18

    aget-wide v18, v8, v16

    move-wide/from16 v32, v14

    move-wide/from16 v14, v18

    aget-wide v18, v8, v20

    aget-wide v22, v8, v3

    const/4 v3, 0x4

    aget-wide v26, v8, v3

    const/4 v3, 0x5

    aget-wide v30, v8, v3

    move-wide/from16 v16, v5

    move-wide/from16 v20, v32

    move-wide/from16 v32, v0

    invoke-direct/range {v9 .. v33}, Ll/ۜۢۜ;-><init>(JJJJJJJJJJJJ)V

    .line 442
    iget-object v0, v2, Ll/ۜۢۜ;->ܽ:[B

    iget-object v1, v2, Ll/ۜۢۜ;->ۢ:[J

    new-instance v3, Ljava/io/RandomAccessFile;

    const-string v4, "r"

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V

    const/4 v4, 0x0

    .line 443
    :goto_5
    :try_start_1
    array-length v5, v1

    if-ge v4, v5, :cond_b

    .line 444
    iget-wide v5, v2, Ll/ۜۢۜ;->ۘ:J

    int-to-long v7, v4

    const-wide/16 v9, 0xc

    mul-long v7, v7, v9

    add-long/2addr v7, v5

    invoke-virtual {v3, v7, v8}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 445
    invoke-static {v3}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v5

    .line 446
    invoke-static {v3}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v7

    .line 447
    invoke-direct {v2, v5, v6, v7, v8}, Ll/ۜۢۜ;->֫(JJ)V

    .line 448
    iget-wide v9, v2, Ll/ۜۢۜ;->ܺ:J

    add-long/2addr v9, v5

    invoke-virtual {v3, v9, v10}, Ljava/io/RandomAccessFile;->seek(J)V

    const-wide v5, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    :goto_6
    cmp-long v9, v7, v34

    if-lez v9, :cond_a

    .line 452
    array-length v9, v0

    int-to-long v9, v9

    invoke-static {v9, v10, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    long-to-int v10, v9

    const/4 v9, 0x0

    .line 453
    invoke-virtual {v3, v0, v9, v10}, Ljava/io/RandomAccessFile;->readFully([BII)V

    const/4 v9, 0x0

    :goto_7
    if-ge v9, v10, :cond_9

    .line 455
    aget-byte v11, v0, v9

    and-int/lit16 v11, v11, 0xff

    int-to-long v11, v11

    xor-long/2addr v5, v11

    const-wide v11, 0x100000001b3L

    mul-long v5, v5, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_9
    int-to-long v9, v10

    sub-long/2addr v7, v9

    goto :goto_6

    .line 460
    :cond_a
    aput-wide v5, v1, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v4, v4, 0x1

    goto :goto_5

    .line 462
    :cond_b
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    .line 463
    invoke-static {v1}, Ljava/util/Arrays;->sort([J)V

    return-object v2

    :catchall_0
    move-exception v0

    move-object v1, v0

    .line 442
    :try_start_2
    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v1

    .line 370
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Trailing boot hierarchy data"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 349
    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Boot hierarchy payload identity mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 333
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy counts"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 325
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Unsupported boot hierarchy flags"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 322
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy header"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 312
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Boot hierarchy raw checksum mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_2
    move-exception v0

    move-object v1, v0

    .line 301
    :try_start_3
    invoke-virtual {v5}, Ljava/io/FileInputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_9

    :catchall_3
    move-exception v0

    move-object v2, v0

    invoke-virtual {v1, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_9
    throw v1

    .line 296
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Boot hierarchy raw file size mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    cmp-long v2, p3, v0

    if-ltz v2, :cond_0

    .line 577
    iget-wide v0, p0, Ll/ۜۢۜ;->ۡ:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    sub-long/2addr v0, p1

    cmp-long p1, p3, v0

    if-gtz p1, :cond_0

    return-void

    .line 579
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid boot hierarchy string slice"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final ֫(Ljava/io/RandomAccessFile;Ljava/lang/String;Ljava/lang/String;)Ll/ܽۢۜ;
    .locals 33

    move-object/from16 v8, p0

    move-object/from16 v9, p1

    .line 381
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v1, p2

    invoke-virtual {v1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 382
    array-length v0, v2

    const/high16 v10, 0x100000

    if-gt v0, v10, :cond_13

    .line 469
    array-length v0, v2

    const-wide v3, -0x340d631b7bdddcdbL    # -7.302176725335867E57

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-byte v5, v2, v1

    and-int/lit16 v5, v5, 0xff

    int-to-long v5, v5

    xor-long/2addr v3, v5

    const-wide v5, 0x100000001b3L

    mul-long v3, v3, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 383
    :cond_0
    iget-object v0, v8, Ll/ۜۢۜ;->ۢ:[J

    invoke-static {v0, v3, v4}, Ljava/util/Arrays;->binarySearch([JJ)I

    move-result v0

    if-gez v0, :cond_1

    goto/16 :goto_a

    .line 386
    :cond_1
    iget-wide v5, v8, Ll/ۜۢۜ;->ۖ:J

    const/16 v7, 0xc

    iget-wide v3, v8, Ll/ۜۢۜ;->ۘ:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v7}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;[BJJI)J

    move-result-wide v19

    const-wide/16 v21, 0x0

    cmp-long v0, v19, v21

    if-gez v0, :cond_2

    .line 388
    sget-object v0, Ll/ܽۢۜ;->ܽ:Ll/ܽۢۜ;

    return-object v0

    .line 390
    :cond_2
    iget-wide v0, v8, Ll/ۜۢۜ;->ۘ:J

    const-wide/16 v13, 0xc

    const-wide/16 v31, 0x8

    move-wide/from16 v11, v19

    move-wide v15, v0

    move-wide/from16 v17, v31

    invoke-static/range {v11 .. v18}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v0

    .line 391
    invoke-virtual {v9, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 392
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    .line 394
    sget-object v0, Ll/ܽۢۜ;->ܽ:Ll/ܽۢۜ;

    return-object v0

    .line 396
    :cond_3
    iget-wide v4, v8, Ll/ۜۢۜ;->֫:J

    cmp-long v6, v0, v4

    if-gez v6, :cond_12

    const-wide/16 v4, 0x10

    mul-long v0, v0, v4

    .line 399
    iget-wide v4, v8, Ll/ۜۢۜ;->ۧ:J

    add-long/2addr v0, v4

    .line 400
    invoke-virtual {v9, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 401
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v0

    cmp-long v4, v0, v19

    if-nez v4, :cond_11

    .line 404
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v0

    .line 405
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v4

    .line 618
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readShort()S

    move-result v6

    invoke-static {v6}, Ljava/lang/Short;->reverseBytes(S)S

    move-result v6

    const v7, 0xffff

    and-int/2addr v6, v7

    .line 407
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v14

    .line 408
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v7

    if-nez v7, :cond_10

    and-int/lit8 v7, v14, -0x2

    if-nez v7, :cond_10

    iget-wide v11, v8, Ll/ۜۢۜ;->ᩳ:J

    cmp-long v7, v4, v11

    if-gtz v7, :cond_10

    int-to-long v2, v6

    sub-long/2addr v11, v4

    cmp-long v7, v2, v11

    if-gtz v7, :cond_10

    const-wide v2, 0xffffffffL

    cmp-long v7, v0, v2

    if-nez v7, :cond_4

    const/4 v0, 0x0

    goto :goto_1

    .line 413
    :cond_4
    invoke-direct {v8, v9, v0, v1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;J)Ljava/lang/String;

    move-result-object v0

    :goto_1
    move-object v12, v0

    if-nez v6, :cond_5

    .line 414
    sget-object v0, Ll/ۜۢۜ;->ᩴ:[Ljava/lang/String;

    goto :goto_2

    .line 415
    :cond_5
    new-array v0, v6, [Ljava/lang/String;

    :goto_2
    move-object v13, v0

    const/4 v0, 0x0

    :goto_3
    if-ge v0, v6, :cond_6

    int-to-long v1, v0

    add-long/2addr v1, v4

    const-wide/16 v15, 0x4

    mul-long v1, v1, v15

    .line 417
    iget-wide v10, v8, Ll/ۜۢۜ;->ܿ:J

    add-long/2addr v1, v10

    invoke-virtual {v9, v1, v2}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 418
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v1

    invoke-direct {v8, v9, v1, v2}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;J)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v13, v0

    add-int/lit8 v0, v0, 0x1

    const/high16 v10, 0x100000

    goto :goto_3

    .line 421
    :cond_6
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v11, 0x1

    const/high16 v1, 0x100000

    if-gt v0, v1, :cond_c

    .line 422
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    move-object/from16 v2, p3

    invoke-virtual {v2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v2

    .line 423
    array-length v0, v2

    if-gt v0, v1, :cond_c

    .line 478
    iget-wide v5, v8, Ll/ۜۢۜ;->ۜ:J

    const/16 v7, 0x14

    iget-wide v3, v8, Ll/ۜۢۜ;->᩷:J

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v7}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;[BJJI)J

    move-result-wide v23

    cmp-long v0, v23, v21

    if-gez v0, :cond_7

    goto/16 :goto_6

    .line 483
    :cond_7
    iget-wide v0, v8, Ll/ۜۢۜ;->᩷:J

    const-wide/16 v25, 0x14

    move-wide/from16 v27, v0

    move-wide/from16 v29, v31

    invoke-static/range {v23 .. v30}, Ll/۠ۢ֡;->֫(JJJJ)J

    move-result-wide v0

    invoke-virtual {v9, v0, v1}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 628
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readLong()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->reverseBytes(J)J

    move-result-wide v0

    .line 485
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v2

    cmp-long v4, v0, v21

    if-ltz v4, :cond_b

    .line 486
    rem-long v4, v0, v31

    cmp-long v6, v4, v21

    if-nez v6, :cond_b

    iget-wide v4, v8, Ll/ۜۢۜ;->ܳ:J

    mul-long v6, v4, v31

    cmp-long v15, v0, v6

    if-gtz v15, :cond_b

    div-long v6, v0, v31

    sub-long/2addr v4, v6

    cmp-long v6, v2, v4

    if-gtz v6, :cond_b

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    :goto_4
    cmp-long v6, v21, v2

    if-gtz v6, :cond_c

    add-long v6, v21, v2

    ushr-long/2addr v6, v11

    .line 495
    iget-wide v10, v8, Ll/ۜۢۜ;->᩻:J

    add-long/2addr v10, v0

    mul-long v16, v6, v31

    add-long v10, v16, v10

    invoke-virtual {v9, v10, v11}, Ljava/io/RandomAccessFile;->seek(J)V

    .line 496
    invoke-static/range {p1 .. p1}, Ll/ۜۢۜ;->֫(Ljava/io/RandomAccessFile;)J

    move-result-wide v10

    cmp-long v16, v10, v19

    if-gez v16, :cond_8

    add-long/2addr v6, v4

    move-wide/from16 v21, v6

    goto :goto_5

    :cond_8
    if-lez v16, :cond_9

    sub-long/2addr v6, v4

    move-wide v2, v6

    :goto_5
    const/4 v11, 0x1

    goto :goto_4

    .line 502
    :cond_9
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v10

    .line 503
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v0

    if-nez v0, :cond_a

    .line 504
    invoke-virtual/range {p1 .. p1}, Ljava/io/RandomAccessFile;->readUnsignedByte()I

    move-result v0

    if-nez v0, :cond_a

    goto :goto_7

    .line 505
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy posting record"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 489
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy posting range"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_6
    const/4 v10, -0x1

    :goto_7
    if-ltz v10, :cond_d

    const/4 v0, 0x1

    const/16 v16, 0x1

    goto :goto_8

    :cond_d
    const/4 v0, 0x0

    const/16 v16, 0x0

    :goto_8
    if-nez v16, :cond_e

    const/4 v0, 0x0

    const/4 v15, 0x0

    goto :goto_9

    :cond_e
    move v15, v10

    .line 431
    :goto_9
    invoke-static {v15}, Ll/ۛ᩷ۜ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 434
    new-instance v0, Ll/ۧۢۜ;

    move-object v11, v0

    invoke-direct/range {v11 .. v16}, Ll/ۧۢۜ;-><init>(Ljava/lang/String;[Ljava/lang/String;IIZ)V

    invoke-static {v0}, Ll/ܽۢۜ;->֫(Ll/ۧۢۜ;)Ll/ܽۢۜ;

    move-result-object v0

    return-object v0

    .line 432
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy method flags"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 411
    :cond_10
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy class record"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 402
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Boot hierarchy class/type mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 397
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Invalid boot hierarchy class index"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 384
    :cond_13
    :goto_a
    sget-object v0, Ll/ܽۢۜ;->ܽ:Ll/ܽۢۜ;

    return-object v0
.end method
