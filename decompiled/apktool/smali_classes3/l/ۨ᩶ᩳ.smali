.class public final Ll/ۨ᩶ᩳ;
.super Ljava/io/Reader;
.source "D6TW"


# instance fields
.field public ۗ:Z

.field public ۙ:Ljava/nio/charset/CharsetDecoder;

.field public ۛ:Z

.field public final ۟:Z

.field public ۤ:Ljava/nio/ByteBuffer;

.field public ۨ:Ljava/nio/CharBuffer;

.field public ۫:Z

.field public ۬:Z

.field public volatile ܰ:Ljava/io/InputStream;

.field public ᩶:Z

.field public ᩸:J

.field public final ᩹:Ljava/lang/String;

.field public ᩺:Ll/ۚ۬ᩳ;


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;IIZ)V
    .locals 13

    move-object v1, p0

    move/from16 v0, p4

    move/from16 v2, p5

    .line 66
    invoke-direct {p0}, Ljava/io/Reader;-><init>()V

    const/4 v3, 0x4

    if-lt v0, v3, :cond_0

    const/high16 v3, 0x10000

    if-gt v0, v3, :cond_0

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    const v3, 0x8000

    if-gt v2, v3, :cond_0

    .line 70
    invoke-static {p2}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Ll/ۨ᩶ᩳ;->᩹:Ljava/lang/String;

    move/from16 v3, p6

    .line 71
    iput-boolean v3, v1, Ll/ۨ᩶ᩳ;->۟:Z

    int-to-long v3, v0

    const-wide/16 v5, 0x17

    add-long/2addr v3, v5

    const-wide/16 v7, -0x8

    and-long/2addr v3, v7

    const-wide/16 v9, 0x100

    add-long/2addr v3, v9

    int-to-long v9, v2

    const-wide/16 v11, 0x2

    mul-long v9, v9, v11

    add-long/2addr v9, v5

    and-long v5, v9, v7

    add-long/2addr v3, v5

    move-object/from16 v5, p3

    .line 72
    invoke-virtual {v5, v3, v4}, Ll/֨۬ᩳ;->֫(J)Ll/ۚ۬ᩳ;

    move-result-object v3

    .line 74
    :try_start_0
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    sget-object v5, Ljava/nio/charset/CodingErrorAction;->REPLACE:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {v4, v5}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    invoke-virtual {v4, v5}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object v4

    iput-object v4, v1, Ll/ۨ᩶ᩳ;->ۙ:Ljava/nio/charset/CharsetDecoder;

    .line 75
    invoke-static/range {p4 .. p4}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, v1, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    const/4 v4, 0x0

    .line 76
    invoke-virtual {v0, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 77
    invoke-static/range {p5 .. p5}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v0

    iput-object v0, v1, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    .line 78
    invoke-virtual {v0, v4}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;

    move-object v0, p1

    .line 79
    iput-object v0, v1, Ll/ۨ᩶ᩳ;->ܰ:Ljava/io/InputStream;

    .line 80
    iput-object v3, v1, Ll/ۨ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    .line 82
    :goto_0
    invoke-virtual {v3}, Ll/ۚ۬ᩳ;->close()V

    .line 83
    throw v0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v2, "Invalid decoder buffer sizes"

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;)Ll/ۨ᩶ᩳ;
    .locals 1

    const/4 v0, 0x1

    .line 32
    invoke-static {p0, p1, p2, v0, v0}, Ll/ۨ᩶ᩳ;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;ZZ)Ll/ۨ᩶ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;ZZ)Ll/ۨ᩶ᩳ;
    .locals 7

    .line 51
    invoke-static {p0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p4, :cond_0

    .line 55
    :try_start_0
    invoke-virtual {p2}, Ll/֨۬ᩳ;->ܽ()J

    move-result-wide v0

    invoke-virtual {p2}, Ll/֨۬ᩳ;->ᩳ()J

    move-result-wide v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    sub-long/2addr v0, v2

    const-wide/32 v2, 0x8240

    cmp-long p4, v0, v2

    if-ltz p4, :cond_0

    .line 56
    :try_start_1
    new-instance p4, Ll/ۨ᩶ᩳ;

    const/16 v4, 0x2000

    const/16 v5, 0x1000

    move-object v0, p4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Ll/ۨ᩶ᩳ;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;IIZ)V
    :try_end_1
    .catch Ll/ۘ۬ᩳ; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object p4

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_0

    .line 59
    :catch_2
    :cond_0
    :try_start_2
    new-instance p4, Ll/ۨ᩶ᩳ;

    const/16 v4, 0x400

    const/16 v5, 0x200

    move-object v0, p4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v6, p3

    invoke-direct/range {v0 .. v6}, Ll/ۨ᩶ᩳ;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;IIZ)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_0

    return-object p4

    .line 61
    :goto_0
    :try_start_3
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_1

    :catch_3
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 62
    :goto_1
    throw p1
.end method

.method public static ֫(Ljava/io/InputStream;Ll/֨۬ᩳ;)Ll/ۨ᩶ᩳ;
    .locals 2

    .line 41
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    const/4 v1, 0x0

    .line 46
    invoke-static {p0, v0, p1, v1, v1}, Ll/ۨ᩶ᩳ;->֫(Ljava/io/InputStream;Ljava/nio/charset/Charset;Ll/֨۬ᩳ;ZZ)Ll/ۨ᩶ᩳ;

    move-result-object p0

    return-object p0
.end method

.method public static varargs ֫([BI[I)Z
    .locals 3

    .line 155
    array-length v0, p2

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 156
    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_2

    aget-byte v0, p0, p1

    and-int/lit16 v0, v0, 0xff

    aget v2, p2, p1

    if-eq v0, v2, :cond_1

    :goto_1
    return v1

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method private ܿ(II[B)I
    .locals 5

    .line 171
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ܰ:Ljava/io/InputStream;

    if-eqz v0, :cond_3

    .line 173
    invoke-virtual {v0, p3, p1, p2}, Ljava/io/InputStream;->read([BII)I

    move-result p1

    if-eqz p1, :cond_2

    const/4 p3, -0x1

    if-lt p1, p3, :cond_2

    if-gt p1, p2, :cond_2

    if-lez p1, :cond_1

    .line 176
    iget-wide p2, p0, Ll/ۨ᩶ᩳ;->᩸:J

    int-to-long v0, p1

    const-wide v2, 0x7fffffffffffffffL

    sub-long/2addr v2, v0

    cmp-long v4, p2, v2

    if-gtz v4, :cond_0

    add-long/2addr p2, v0

    .line 177
    iput-wide p2, p0, Ll/ۨ᩶ᩳ;->᩸:J

    return p1

    .line 176
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Source byte count exhausted"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return p1

    .line 174
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text input made invalid progress"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 172
    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text input is canceled or closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ᩳ()Z
    .locals 10

    .line 110
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->۬:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    .line 111
    :cond_0
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->۫:Z

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-nez v0, :cond_9

    .line 135
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v0

    const/4 v4, 0x0

    :goto_0
    const/4 v5, 0x4

    if-ge v4, v5, :cond_2

    rsub-int/lit8 v6, v4, 0x4

    .line 139
    invoke-direct {p0, v4, v6, v0}, Ll/ۨ᩶ᩳ;->ܿ(II[B)I

    move-result v6

    if-ne v6, v2, :cond_1

    .line 140
    iput-boolean v3, p0, Ll/ۨ᩶ᩳ;->ۛ:Z

    goto :goto_1

    :cond_1
    add-int/2addr v4, v6

    goto :goto_0

    .line 143
    :cond_2
    :goto_1
    iget-object v6, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    const-string v6, "UTF-8"

    .line 145
    iget-object v7, p0, Ll/ۨ᩶ᩳ;->᩹:Ljava/lang/String;

    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0xbb

    const/16 v8, 0xbf

    const/16 v9, 0xef

    filled-new-array {v9, v6, v8}, [I

    move-result-object v6

    invoke-static {v0, v4, v6}, Ll/ۨ᩶ᩳ;->֫([BI[I)Z

    move-result v6

    if-eqz v6, :cond_3

    const/4 v5, 0x3

    goto :goto_3

    :cond_3
    const-string v6, "UTF-16BE"

    .line 146
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    const/16 v8, 0xff

    const/16 v9, 0xfe

    if-eqz v6, :cond_4

    filled-new-array {v9, v8}, [I

    move-result-object v6

    invoke-static {v0, v4, v6}, Ll/ۨ᩶ᩳ;->֫([BI[I)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    const-string v6, "UTF-16LE"

    .line 147
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_5

    filled-new-array {v8, v9}, [I

    move-result-object v6

    invoke-static {v0, v4, v6}, Ll/ۨ᩶ᩳ;->֫([BI[I)Z

    move-result v6

    if-eqz v6, :cond_5

    :goto_2
    const/4 v5, 0x2

    goto :goto_3

    :cond_5
    const-string v6, "UTF-32BE"

    .line 148
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_6

    filled-new-array {v1, v1, v9, v8}, [I

    move-result-object v6

    invoke-static {v0, v4, v6}, Ll/ۨ᩶ᩳ;->֫([BI[I)Z

    move-result v6

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    const-string v6, "UTF-32LE"

    .line 149
    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    filled-new-array {v8, v9, v1, v1}, [I

    move-result-object v6

    invoke-static {v0, v4, v6}, Ll/ۨ᩶ᩳ;->֫([BI[I)Z

    move-result v0

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v5, 0x0

    .line 150
    :goto_3
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    iget-boolean v4, p0, Ll/ۨ᩶ᩳ;->۟:Z

    if-eqz v4, :cond_8

    move v1, v5

    :cond_8
    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 151
    iput-boolean v3, p0, Ll/ۨ᩶ᩳ;->۫:Z

    .line 112
    :cond_9
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    .line 113
    :cond_a
    :goto_4
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-nez v0, :cond_15

    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->۬:Z

    if-nez v0, :cond_15

    .line 114
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->ۗ:Z

    if-eqz v0, :cond_e

    .line 115
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۙ:Ljava/nio/charset/CharsetDecoder;

    iget-object v1, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/charset/CharsetDecoder;->flush(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;

    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->throwException()V

    .line 117
    :cond_b
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v0

    if-eqz v0, :cond_c

    iput-boolean v3, p0, Ll/ۨ᩶ᩳ;->۬:Z

    goto :goto_4

    .line 118
    :cond_c
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_4

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Decoder flush made no progress"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 120
    :cond_e
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۙ:Ljava/nio/charset/CharsetDecoder;

    iget-object v1, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    iget-object v4, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    iget-boolean v5, p0, Ll/ۨ᩶ᩳ;->ۛ:Z

    invoke-virtual {v0, v1, v4, v5}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->throwException()V

    .line 122
    :cond_f
    invoke-virtual {v0}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 123
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->ۛ:Z

    if-eqz v0, :cond_10

    iput-boolean v3, p0, Ll/ۨ᩶ᩳ;->ۗ:Z

    goto :goto_4

    .line 124
    :cond_10
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-nez v0, :cond_a

    .line 161
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 162
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-eqz v0, :cond_12

    .line 164
    iget-object v1, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    iget-object v4, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    invoke-direct {p0, v4, v0, v1}, Ll/ۨ᩶ᩳ;->ܿ(II[B)I

    move-result v0

    if-ne v0, v2, :cond_11

    .line 165
    iput-boolean v3, p0, Ll/ۨ᩶ᩳ;->ۛ:Z

    goto :goto_5

    .line 166
    :cond_11
    iget-object v1, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v0

    invoke-virtual {v1, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 167
    :goto_5
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    goto/16 :goto_4

    .line 163
    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Decoder input buffer is too small"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 125
    :cond_13
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-eqz v0, :cond_14

    goto/16 :goto_4

    .line 126
    :cond_14
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Decoder output buffer is too small"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_15
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;

    .line 131
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 199
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->᩶:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 200
    iput-boolean v0, p0, Ll/ۨ᩶ᩳ;->᩶:Z

    const/4 v0, 0x0

    .line 201
    :try_start_0
    invoke-virtual {p0}, Ll/ۨ᩶ᩳ;->ܽ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 203
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    .line 204
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    .line 205
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->ۙ:Ljava/nio/charset/CharsetDecoder;

    .line 206
    iget-object v1, p0, Ll/ۨ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;

    .line 207
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;

    .line 208
    invoke-virtual {v1}, Ll/ۚ۬ᩳ;->close()V

    return-void

    :catchall_0
    move-exception v1

    .line 203
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->ۤ:Ljava/nio/ByteBuffer;

    .line 204
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    .line 205
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->ۙ:Ljava/nio/charset/CharsetDecoder;

    .line 206
    iget-object v2, p0, Ll/ۨ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;

    .line 207
    iput-object v0, p0, Ll/ۨ᩶ᩳ;->᩺:Ll/ۚ۬ᩳ;

    .line 208
    invoke-virtual {v2}, Ll/ۚ۬ᩳ;->close()V

    .line 209
    throw v1
.end method

.method public final read()I
    .locals 2

    .line 183
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->᩶:Z

    if-nez v0, :cond_1

    .line 94
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Ll/ۨ᩶ᩳ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 95
    :cond_0
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->get()C

    move-result v0

    return v0

    .line 183
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Text decoder is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([CII)I
    .locals 1

    .line 183
    iget-boolean v0, p0, Ll/ۨ᩶ᩳ;->᩶:Z

    if-nez v0, :cond_2

    .line 101
    invoke-static {p1, p2, p3}, Ll/۬᩹ᩳ;->֫([CII)V

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 103
    :cond_0
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Ll/ۨ᩶ᩳ;->ᩳ()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 104
    :cond_1
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 105
    iget-object v0, p0, Ll/ۨ᩶ᩳ;->ۨ:Ljava/nio/CharBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/CharBuffer;->get([CII)Ljava/nio/CharBuffer;

    return p3

    .line 183
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text decoder is closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()J
    .locals 2

    .line 89
    iget-wide v0, p0, Ll/ۨ᩶ᩳ;->᩸:J

    return-wide v0
.end method

.method public final ܽ()V
    .locals 3

    move-object v0, p0

    .line 189
    monitor-enter v0

    .line 190
    :try_start_0
    iget-object v1, p0, Ll/ۨ᩶ᩳ;->ܰ:Ljava/io/InputStream;

    const/4 v2, 0x0

    .line 191
    iput-object v2, p0, Ll/ۨ᩶ᩳ;->ܰ:Ljava/io/InputStream;

    .line 192
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    .line 193
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    .line 192
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
