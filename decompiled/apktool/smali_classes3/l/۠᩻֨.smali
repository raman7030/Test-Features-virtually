.class public final Ll/۠᩻֨;
.super Ljava/io/InputStream;
.source "G1SB"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:Ljava/io/InputStream;

.field public ۙ:Z

.field public final ۛ:[B

.field public final ۤ:Ljava/io/DataInputStream;

.field public ۨ:J

.field public final ۫:Ll/᩶᩻֨;

.field public final ۬:I

.field public final ܰ:Z

.field public ᩶:J

.field public final ᩸:Ll/ۚۜ֨;

.field public ᩹:J

.field public ᩺:J


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ll/ۚۜ֨;ZILl/ۘ᩻֨;)V
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p4

    .line 37
    invoke-direct/range {p0 .. p0}, Ljava/io/InputStream;-><init>()V

    const-wide/16 v3, -0x1

    .line 22
    iput-wide v3, v0, Ll/۠᩻֨;->᩺:J

    .line 23
    iput-wide v3, v0, Ll/۠᩻֨;->᩹:J

    const-wide/16 v3, 0x0

    .line 26
    iput-wide v3, v0, Ll/۠᩻֨;->ۨ:J

    const/4 v5, 0x0

    .line 27
    iput-boolean v5, v0, Ll/۠᩻֨;->ۙ:Z

    const/4 v6, 0x1

    new-array v7, v6, [B

    .line 29
    iput-object v7, v0, Ll/۠᩻֨;->ۛ:[B

    move-object/from16 v7, p2

    .line 38
    iput-object v7, v0, Ll/۠᩻֨;->᩸:Ll/ۚۜ֨;

    move/from16 v8, p3

    .line 39
    iput-boolean v8, v0, Ll/۠᩻֨;->ܰ:Z

    .line 40
    new-instance v8, Ljava/io/DataInputStream;

    invoke-direct {v8, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V

    iput-object v8, v0, Ll/۠᩻֨;->ۤ:Ljava/io/DataInputStream;

    .line 43
    invoke-virtual {v8}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v9

    if-eqz v9, :cond_11

    add-int/lit8 v10, v9, 0x1

    mul-int/lit8 v10, v10, 0x4

    .line 50
    iput v10, v0, Ll/۠᩻֨;->۬:I

    .line 52
    new-array v11, v10, [B

    int-to-byte v9, v9

    .line 53
    aput-byte v9, v11, v5

    add-int/lit8 v9, v10, -0x1

    .line 54
    invoke-virtual {v8, v11, v6, v9}, Ljava/io/DataInputStream;->readFully([BII)V

    add-int/lit8 v8, v10, -0x4

    .line 57
    invoke-static {v5, v11, v8, v8}, Ll/ܶۜ֨;->֫(I[BII)Z

    move-result v5

    const-string v8, "XZ Block Header is corrupt"

    if-eqz v5, :cond_10

    .line 61
    aget-byte v5, v11, v6

    and-int/lit8 v9, v5, 0x3c

    const-string v12, "Unsupported options in XZ Block Header"

    if-nez v9, :cond_f

    and-int/lit8 v5, v5, 0x3

    add-int/lit8 v9, v5, 0x1

    .line 67
    new-array v13, v9, [J

    .line 68
    new-array v14, v9, [[B

    .line 72
    new-instance v15, Ljava/io/ByteArrayInputStream;

    add-int/lit8 v3, v10, -0x6

    const/4 v4, 0x2

    invoke-direct {v15, v11, v4, v3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    int-to-long v3, v10

    const-wide v18, 0x7ffffffffffffffcL

    sub-long v18, v18, v3

    .line 79
    :try_start_0
    invoke-virtual/range {p2 .. p2}, Ll/ۚۜ֨;->ܽ()I

    move-result v3

    int-to-long v3, v3

    sub-long v3, v18, v3

    iput-wide v3, v0, Ll/۠᩻֨;->᩶:J

    .line 83
    aget-byte v6, v11, v6

    and-int/lit8 v6, v6, 0x40

    if-eqz v6, :cond_0

    .line 84
    invoke-static {v15}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v6

    iput-wide v6, v0, Ll/۠᩻֨;->᩹:J

    const-wide/16 v16, 0x0

    cmp-long v10, v6, v16

    if-eqz v10, :cond_1

    cmp-long v10, v6, v3

    if-gtz v10, :cond_1

    .line 90
    iput-wide v6, v0, Ll/۠᩻֨;->᩶:J

    :cond_0
    const/4 v6, 0x1

    goto :goto_0

    .line 88
    :cond_1
    new-instance v1, Ll/᩹᩻֨;

    invoke-direct {v1}, Ll/᩹᩻֨;-><init>()V

    throw v1

    .line 95
    :goto_0
    aget-byte v3, v11, v6

    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_2

    .line 96
    invoke-static {v15}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v3

    iput-wide v3, v0, Ll/۠᩻֨;->᩺:J

    :cond_2
    const/4 v3, 0x0

    :goto_1
    if-ge v3, v9, :cond_4

    .line 100
    invoke-static {v15}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v6

    aput-wide v6, v13, v3

    .line 102
    invoke-static {v15}, Ll/ܶۜ֨;->֫(Ljava/io/InputStream;)J

    move-result-wide v6

    .line 103
    invoke-virtual {v15}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v4

    int-to-long v10, v4

    cmp-long v4, v6, v10

    if-gtz v4, :cond_3

    long-to-int v4, v6

    .line 106
    new-array v4, v4, [B

    aput-object v4, v14, v3

    .line 107
    invoke-virtual {v15, v4}, Ljava/io/InputStream;->read([B)I

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 104
    :cond_3
    new-instance v1, Ll/᩹᩻֨;

    invoke-direct {v1}, Ll/᩹᩻֨;-><init>()V

    throw v1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 115
    :cond_4
    invoke-virtual {v15}, Ljava/io/ByteArrayInputStream;->available()I

    move-result v3

    :goto_2
    if-lez v3, :cond_6

    .line 116
    invoke-virtual {v15}, Ljava/io/ByteArrayInputStream;->read()I

    move-result v4

    if-nez v4, :cond_5

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    .line 117
    :cond_5
    new-instance v1, Ll/ۢۜ֨;

    .line 20
    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 117
    throw v1

    .line 160
    :cond_6
    new-array v3, v9, [Ll/ۤ᩻֨;

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v9, :cond_a

    .line 163
    aget-wide v6, v13, v4

    const-wide/16 v10, 0x21

    cmp-long v8, v6, v10

    if-nez v8, :cond_7

    .line 164
    new-instance v6, Ll/ܰ᩻֨;

    aget-object v7, v14, v4

    invoke-direct {v6, v7}, Ll/ܰ᩻֨;-><init>([B)V

    aput-object v6, v3, v4

    goto :goto_4

    :cond_7
    const-wide/16 v10, 0x3

    cmp-long v8, v6, v10

    if-nez v8, :cond_8

    .line 167
    new-instance v6, Ll/ۗ᩻֨;

    aget-object v7, v14, v4

    invoke-direct {v6, v7}, Ll/ۗ᩻֨;-><init>([B)V

    aput-object v6, v3, v4

    goto :goto_4

    :cond_8
    const-wide/16 v10, 0x4

    cmp-long v8, v6, v10

    if-ltz v8, :cond_9

    const-wide/16 v10, 0xb

    cmp-long v8, v6, v10

    if-gtz v8, :cond_9

    .line 170
    new-instance v8, Ll/ᩴ᩻֨;

    aget-object v10, v14, v4

    invoke-direct {v8, v6, v7, v10}, Ll/ᩴ᩻֨;-><init>(J[B)V

    aput-object v8, v3, v4

    :goto_4
    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    .line 173
    :cond_9
    new-instance v1, Ll/ۢۜ֨;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unknown Filter ID "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget-wide v3, v13, v4

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 173
    throw v1

    .line 177
    :cond_a
    invoke-static {v3}, Ll/ܳۜ֨;->֫([Ll/۫᩻֨;)V

    if-ltz v2, :cond_d

    const/4 v4, 0x0

    const/4 v6, 0x0

    :goto_5
    if-ge v6, v9, :cond_b

    .line 183
    aget-object v7, v3, v6

    invoke-interface {v7}, Ll/ۤ᩻֨;->֫()I

    move-result v7

    add-int/2addr v4, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_5

    :cond_b
    if-gt v4, v2, :cond_c

    goto :goto_6

    .line 186
    :cond_c
    new-instance v1, Ll/ܿۜ֨;

    const-string v3, " KiB of memory would be needed; limit was "

    const-string v5, " KiB"

    const-string v6, ""

    .line 0
    invoke-static {v6, v4, v3, v5, v2}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 20
    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 186
    throw v1

    .line 191
    :cond_d
    :goto_6
    new-instance v2, Ll/᩶᩻֨;

    invoke-direct {v2, v1}, Ll/᩶᩻֨;-><init>(Ljava/io/InputStream;)V

    iput-object v2, v0, Ll/۠᩻֨;->۫:Ll/᩶᩻֨;

    .line 194
    iput-object v2, v0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    :goto_7
    if-ltz v5, :cond_e

    .line 196
    aget-object v1, v3, v5

    iget-object v2, v0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    move-object/from16 v4, p5

    invoke-interface {v1, v2, v4}, Ll/ۤ᩻֨;->֫(Ljava/io/InputStream;Ll/ۘ᩻֨;)Ljava/io/InputStream;

    move-result-object v1

    iput-object v1, v0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    add-int/lit8 v5, v5, -0x1

    goto :goto_7

    :cond_e
    return-void

    .line 111
    :catch_0
    new-instance v1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {v1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 111
    throw v1

    .line 62
    :cond_f
    new-instance v1, Ll/ۢۜ֨;

    .line 20
    invoke-direct {v1, v12}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    throw v1

    .line 58
    :cond_10
    new-instance v1, Ll/᩹᩻֨;

    .line 20
    invoke-direct {v1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 58
    throw v1

    .line 47
    :cond_11
    new-instance v1, Ll/ۨ᩻֨;

    .line 7
    invoke-direct {v1}, Ljava/lang/Exception;-><init>()V

    .line 47
    throw v1
.end method

.method private ᩳ()V
    .locals 8

    .line 249
    iget-object v0, p0, Ll/۠᩻֨;->۫:Ll/᩶᩻֨;

    invoke-virtual {v0}, Ll/᩶᩻֨;->֫()J

    move-result-wide v0

    .line 253
    iget-wide v2, p0, Ll/۠᩻֨;->᩹:J

    const-wide/16 v4, -0x1

    cmp-long v6, v2, v4

    if-eqz v6, :cond_0

    cmp-long v6, v2, v0

    if-nez v6, :cond_1

    :cond_0
    iget-wide v2, p0, Ll/۠᩻֨;->᩺:J

    cmp-long v6, v2, v4

    if-eqz v6, :cond_2

    iget-wide v4, p0, Ll/۠᩻֨;->ۨ:J

    cmp-long v6, v2, v4

    if-nez v6, :cond_1

    goto :goto_0

    .line 257
    :cond_1
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    :cond_2
    :goto_0
    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    const-wide/16 v4, 0x3

    and-long/2addr v0, v4

    const-wide/16 v4, 0x0

    .line 260
    iget-object v6, p0, Ll/۠᩻֨;->ۤ:Ljava/io/DataInputStream;

    cmp-long v7, v0, v4

    if-eqz v7, :cond_4

    .line 261
    invoke-virtual {v6}, Ljava/io/DataInputStream;->readUnsignedByte()I

    move-result v0

    if-nez v0, :cond_3

    move-wide v0, v2

    goto :goto_0

    .line 262
    :cond_3
    new-instance v0, Ll/᩹᩻֨;

    invoke-direct {v0}, Ll/᩹᩻֨;-><init>()V

    throw v0

    .line 265
    :cond_4
    iget-object v0, p0, Ll/۠᩻֨;->᩸:Ll/ۚۜ֨;

    invoke-virtual {v0}, Ll/ۚۜ֨;->ܽ()I

    move-result v1

    new-array v1, v1, [B

    .line 266
    invoke-virtual {v6, v1}, Ljava/io/DataInputStream;->readFully([B)V

    .line 267
    iget-boolean v2, p0, Ll/۠᩻֨;->ܰ:Z

    if-eqz v2, :cond_6

    invoke-virtual {v0}, Ll/ۚۜ֨;->֫()[B

    move-result-object v2

    invoke-static {v2, v1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    .line 268
    :cond_5
    new-instance v1, Ll/᩹᩻֨;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Integrity check ("

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    invoke-virtual {v0}, Ll/ۚۜ֨;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") does not match"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 20
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 269
    throw v1

    :cond_6
    :goto_1
    return-void
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 274
    iget-object v0, p0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    return v0
.end method

.method public final close()V
    .locals 1

    .line 285
    :try_start_0
    iget-object v0, p0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    const/4 v0, 0x0

    .line 295
    iput-object v0, p0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    return-void
.end method

.method public final read()I
    .locals 4

    const/4 v0, 0x1

    .line 201
    iget-object v1, p0, Ll/۠᩻֨;->ۛ:[B

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v0}, Ll/۠᩻֨;->read([BII)I

    move-result v0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    return v3

    :cond_0
    aget-byte v0, v1, v2

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public final read([BII)I
    .locals 8

    .line 206
    iget-boolean v0, p0, Ll/۠᩻֨;->ۙ:Z

    const/4 v1, -0x1

    if-eqz v0, :cond_0

    return v1

    .line 209
    :cond_0
    iget-object v0, p0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    const/4 v2, 0x1

    if-lez v0, :cond_6

    .line 212
    iget-boolean v3, p0, Ll/۠᩻֨;->ܰ:Z

    if-eqz v3, :cond_1

    .line 213
    iget-object v3, p0, Ll/۠᩻֨;->᩸:Ll/ۚۜ֨;

    invoke-virtual {v3, p1, p2, v0}, Ll/ۚۜ֨;->֫([BII)V

    .line 215
    :cond_1
    iget-wide p1, p0, Ll/۠᩻֨;->ۨ:J

    int-to-long v3, v0

    add-long/2addr p1, v3

    iput-wide p1, p0, Ll/۠᩻֨;->ۨ:J

    .line 218
    iget-object p1, p0, Ll/۠᩻֨;->۫:Ll/᩶᩻֨;

    invoke-virtual {p1}, Ll/᩶᩻֨;->֫()J

    move-result-wide p1

    const-wide/16 v3, 0x0

    cmp-long v5, p1, v3

    if-ltz v5, :cond_5

    .line 219
    iget-wide v5, p0, Ll/۠᩻֨;->᩶:J

    cmp-long v7, p1, v5

    if-gtz v7, :cond_5

    iget-wide p1, p0, Ll/۠᩻֨;->ۨ:J

    cmp-long v5, p1, v3

    if-ltz v5, :cond_5

    const-wide/16 v3, -0x1

    iget-wide v5, p0, Ll/۠᩻֨;->᩺:J

    cmp-long v7, v5, v3

    if-eqz v7, :cond_2

    cmp-long v3, p1, v5

    if-gtz v3, :cond_5

    :cond_2
    if-lt v0, p3, :cond_3

    cmp-long p3, p1, v5

    if-nez p3, :cond_7

    .line 234
    :cond_3
    iget-object p1, p0, Ll/۠᩻֨;->ۗ:Ljava/io/InputStream;

    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result p1

    if-ne p1, v1, :cond_4

    .line 237
    invoke-direct {p0}, Ll/۠᩻֨;->ᩳ()V

    .line 238
    iput-boolean v2, p0, Ll/۠᩻֨;->ۙ:Z

    return v0

    .line 235
    :cond_4
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1

    .line 224
    :cond_5
    new-instance p1, Ll/᩹᩻֨;

    invoke-direct {p1}, Ll/᩹᩻֨;-><init>()V

    throw p1

    :cond_6
    if-ne v0, v1, :cond_7

    .line 241
    invoke-direct {p0}, Ll/۠᩻֨;->ᩳ()V

    .line 242
    iput-boolean v2, p0, Ll/۠᩻֨;->ۙ:Z

    :cond_7
    return v0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final ֫()J
    .locals 2

    .line 303
    iget-wide v0, p0, Ll/۠᩻֨;->ۨ:J

    return-wide v0
.end method

.method public final ܽ()J
    .locals 4

    .line 299
    iget v0, p0, Ll/۠᩻֨;->۬:I

    int-to-long v0, v0

    iget-object v2, p0, Ll/۠᩻֨;->۫:Ll/᩶᩻֨;

    invoke-virtual {v2}, Ll/᩶᩻֨;->֫()J

    move-result-wide v2

    add-long/2addr v0, v2

    iget-object v2, p0, Ll/۠᩻֨;->᩸:Ll/ۚۜ֨;

    invoke-virtual {v2}, Ll/ۚۜ֨;->ܽ()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    return-wide v0
.end method
