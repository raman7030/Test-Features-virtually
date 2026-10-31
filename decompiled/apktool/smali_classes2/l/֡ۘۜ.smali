.class public final Ll/֡ۘۜ;
.super Ljava/lang/Object;
.source "S6V7"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/nio/charset/CharsetDecoder;

.field public ۙ:J

.field public ۛ:Z

.field public final ۟:Z

.field public ۤ:Z

.field public final ۨ:Ljava/io/InputStream;

.field public ۫:Ljava/nio/charset/CharacterCodingException;

.field public ۬:Z

.field public ܰ:J

.field public volatile ᩶:Z

.field public final ᩸:Ljava/nio/ByteBuffer;

.field public final ᩹:Ljava/nio/CharBuffer;

.field public ᩺:I


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ܿۘۜ;JLl/֨ۘۜ;)V
    .locals 9

    .line 43
    iget-object p2, p2, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2000

    .line 21
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    const/4 v1, 0x2

    .line 22
    invoke-static {v1}, Ljava/nio/CharBuffer;->allocate(I)Ljava/nio/CharBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    const/4 v1, -0x1

    .line 29
    iput v1, p0, Ll/֡ۘۜ;->᩺:I

    .line 53
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    cmp-long v4, p3, v2

    if-lez v4, :cond_2

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "r"

    .line 57
    invoke-virtual {p1, v5}, Ll/ܶ᩵ܿ;->ۢ(Ljava/lang/String;)Ll/᩻ۖܽ;

    move-result-object v5

    .line 58
    invoke-virtual {p5, v5}, Ll/֨ۘۜ;->֫(Ljava/io/Closeable;)Ll/ۚۘۜ;

    move-result-object v4

    .line 59
    invoke-virtual {v5, p3, p4}, Ll/᩻ۖܽ;->seek(J)V

    .line 61
    new-instance v6, Ll/ۖۘۜ;

    invoke-direct {v6, v5, v4}, Ll/ۖۘۜ;-><init>(Ll/᩻ۖܽ;Ll/ۚۘۜ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    nop

    if-eqz v4, :cond_0

    .line 70
    :try_start_1
    invoke-virtual {v4}, Ll/ۚۘۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    nop

    .line 72
    :cond_0
    :goto_0
    invoke-virtual {p5}, Ll/֨ۘۜ;->ܽ()Z

    move-result v4

    if-nez v4, :cond_1

    .line 73
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    goto :goto_1

    .line 72
    :cond_1
    new-instance p1, Ljava/io/InterruptedIOException;

    const-string p2, "Text search canceled."

    invoke-direct {p1, p2}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 77
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ll/ܶ᩵ܿ;->ۢۧ()Ljava/io/InputStream;

    move-result-object p1

    .line 78
    invoke-virtual {p5, p1}, Ll/֨ۘۜ;->֫(Ljava/io/Closeable;)Ll/ۚۘۜ;

    move-result-object p5

    :try_start_2
    new-array v4, v0, [B

    move-wide v5, p3

    :goto_2
    cmp-long v7, v5, v2

    if-lez v7, :cond_6

    .line 83
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    int-to-long v7, v0

    .line 84
    invoke-static {v5, v6, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v7

    long-to-int v8, v7

    invoke-virtual {p1, v4, v1, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v8, "File ended before the search checkpoint."

    if-ltz v7, :cond_5

    if-nez v7, :cond_4

    .line 87
    :try_start_3
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    move-result v7

    if-ltz v7, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_3
    int-to-long v7, v7

    sub-long/2addr v5, v7

    goto :goto_2

    .line 85
    :cond_5
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v8}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 92
    :cond_6
    new-instance v6, Ll/ۘۘۜ;

    invoke-direct {v6, p1, p5}, Ll/ۘۘۜ;-><init>(Ljava/io/InputStream;Ll/ۚۘۜ;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 44
    :goto_4
    iput-object v6, p0, Ll/֡ۘۜ;->ۨ:Ljava/io/InputStream;

    .line 45
    iput-wide p3, p0, Ll/֡ۘۜ;->ۙ:J

    .line 46
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    sget-object p3, Ljava/nio/charset/CodingErrorAction;->REPORT:Ljava/nio/charset/CodingErrorAction;

    invoke-virtual {p1, p3}, Ljava/nio/charset/CharsetDecoder;->onMalformedInput(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    .line 47
    invoke-virtual {p1, p3}, Ljava/nio/charset/CharsetDecoder;->onUnmappableCharacter(Ljava/nio/charset/CodingErrorAction;)Ljava/nio/charset/CharsetDecoder;

    move-result-object p1

    iput-object p1, p0, Ll/֡ۘۜ;->ۗ:Ljava/nio/charset/CharsetDecoder;

    .line 48
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p1

    const-string p2, "UTF-8"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    iput-boolean p1, p0, Ll/֡ۘۜ;->۟:Z

    .line 49
    iget-object p1, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    return-void

    :catchall_0
    move-exception p1

    .line 96
    :try_start_4
    invoke-virtual {p5}, Ll/ۚۘۜ;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    .line 97
    :catch_2
    throw p1
.end method

.method public static ֫()V
    .locals 2

    .line 102
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 103
    :cond_0
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "Text search canceled."

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()I
    .locals 11

    .line 124
    iget v0, p0, Ll/֡ۘۜ;->᩺:I

    const/4 v1, -0x1

    if-ltz v0, :cond_0

    .line 127
    iput v1, p0, Ll/֡ۘۜ;->᩺:I

    return v0

    .line 130
    :cond_0
    iget-object v0, p0, Ll/֡ۘۜ;->۫:Ljava/nio/charset/CharacterCodingException;

    if-nez v0, :cond_14

    .line 132
    :cond_1
    :goto_0
    iget-boolean v0, p0, Ll/֡ۘۜ;->۟:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->hasRemaining()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->get(I)B

    move-result v0

    if-ltz v0, :cond_2

    .line 133
    iget-wide v0, p0, Ll/֡ۘۜ;->ۙ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/֡ۘۜ;->ۙ:J

    .line 134
    iget-object v0, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    return v0

    .line 136
    :cond_2
    iget-object v0, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/CharBuffer;->clear()Ljava/nio/Buffer;

    move-result-object v0

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Ljava/nio/Buffer;->limit(I)Ljava/nio/Buffer;

    .line 137
    iget-boolean v0, p0, Ll/֡ۘۜ;->ۛ:Z

    if-eqz v0, :cond_3

    goto/16 :goto_4

    .line 138
    :cond_3
    iget-object v0, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    .line 139
    iget-boolean v3, p0, Ll/֡ۘۜ;->۬:Z

    if-eqz v3, :cond_4

    iget-object v3, p0, Ll/֡ۘۜ;->ۗ:Ljava/nio/charset/CharsetDecoder;

    iget-object v4, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v3, v4}, Ljava/nio/charset/CharsetDecoder;->flush(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;

    move-result-object v3

    goto :goto_1

    :cond_4
    iget-object v3, p0, Ll/֡ۘۜ;->ۗ:Ljava/nio/charset/CharsetDecoder;

    iget-object v4, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    iget-object v5, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    iget-boolean v6, p0, Ll/֡ۘۜ;->ۤ:Z

    invoke-virtual {v3, v4, v5, v6}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v3

    .line 140
    :goto_1
    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->isOverflow()Z

    move-result v4

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-eqz v4, :cond_7

    iget-object v4, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    .line 141
    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    if-ne v4, v2, :cond_7

    iget-object v4, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v4, v6}, Ljava/nio/CharBuffer;->get(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isHighSurrogate(C)Z

    move-result v4

    if-eqz v4, :cond_7

    .line 144
    :cond_5
    iget-object v3, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v3, v5}, Ljava/nio/CharBuffer;->limit(I)Ljava/nio/Buffer;

    .line 145
    iget-boolean v3, p0, Ll/֡ۘۜ;->۬:Z

    if-eqz v3, :cond_6

    iget-object v3, p0, Ll/֡ۘۜ;->ۗ:Ljava/nio/charset/CharsetDecoder;

    iget-object v4, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v3, v4}, Ljava/nio/charset/CharsetDecoder;->flush(Ljava/nio/CharBuffer;)Ljava/nio/charset/CoderResult;

    move-result-object v3

    goto :goto_2

    :cond_6
    iget-object v3, p0, Ll/֡ۘۜ;->ۗ:Ljava/nio/charset/CharsetDecoder;

    iget-object v4, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    iget-object v7, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    iget-boolean v8, p0, Ll/֡ۘۜ;->ۤ:Z

    invoke-virtual {v3, v4, v7, v8}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;Ljava/nio/CharBuffer;Z)Ljava/nio/charset/CoderResult;

    move-result-object v3

    .line 147
    :cond_7
    :goto_2
    iget-wide v7, p0, Ll/֡ۘۜ;->ۙ:J

    iget-object v4, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    sub-int/2addr v4, v0

    int-to-long v9, v4

    add-long/2addr v7, v9

    iput-wide v7, p0, Ll/֡ۘۜ;->ۙ:J

    .line 148
    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->isError()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 149
    :try_start_0
    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->throwException()V
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    .line 150
    iget-object v4, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    if-eqz v4, :cond_8

    .line 152
    iput-object v0, p0, Ll/֡ۘۜ;->۫:Ljava/nio/charset/CharacterCodingException;

    goto :goto_3

    .line 150
    :cond_8
    throw v0

    .line 155
    :cond_9
    :goto_3
    iget-boolean v0, p0, Ll/֡ۘۜ;->ۤ:Z

    if-eqz v0, :cond_b

    invoke-virtual {v3}, Ljava/nio/charset/CoderResult;->isUnderflow()Z

    move-result v0

    if-eqz v0, :cond_b

    .line 156
    iget-boolean v0, p0, Ll/֡ۘۜ;->۬:Z

    if-eqz v0, :cond_a

    iput-boolean v2, p0, Ll/֡ۘۜ;->ۛ:Z

    .line 157
    :cond_a
    iput-boolean v2, p0, Ll/֡ۘۜ;->۬:Z

    .line 159
    :cond_b
    iget-object v0, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v0

    if-lez v0, :cond_e

    .line 160
    iget-object v0, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v0, v6}, Ljava/nio/CharBuffer;->get(I)C

    move-result v0

    .line 161
    iget-object v1, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-ne v1, v5, :cond_c

    iget-object v1, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v1, v2}, Ljava/nio/CharBuffer;->get(I)C

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 162
    iget-object v1, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v1, v2}, Ljava/nio/CharBuffer;->get(I)C

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Character;->toCodePoint(CC)I

    move-result v0

    return v0

    .line 164
    :cond_c
    iget-object v1, p0, Ll/֡ۘۜ;->᩹:Ljava/nio/CharBuffer;

    invoke-virtual {v1}, Ljava/nio/Buffer;->position()I

    move-result v1

    if-ne v1, v2, :cond_d

    invoke-static {v0}, Ljava/lang/Character;->isSurrogate(C)Z

    move-result v1

    if-nez v1, :cond_d

    return v0

    .line 165
    :cond_d
    new-instance v0, Ljava/nio/charset/CharacterCodingException;

    invoke-direct {v0}, Ljava/nio/charset/CharacterCodingException;-><init>()V

    throw v0

    .line 169
    :cond_e
    iget-boolean v0, p0, Ll/֡ۘۜ;->ۤ:Z

    if-eqz v0, :cond_f

    .line 170
    iget-boolean v0, p0, Ll/֡ۘۜ;->ۛ:Z

    if-eqz v0, :cond_1

    :goto_4
    return v1

    .line 110
    :cond_f
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    .line 111
    iget-boolean v0, p0, Ll/֡ۘۜ;->᩶:Z

    if-nez v0, :cond_13

    .line 112
    iget-object v0, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->compact()Ljava/nio/ByteBuffer;

    .line 113
    iget-object v0, p0, Ll/֡ۘۜ;->ۨ:Ljava/io/InputStream;

    iget-object v3, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    iget-object v4, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v4}, Ljava/nio/Buffer;->position()I

    move-result v4

    iget-object v5, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v5}, Ljava/nio/Buffer;->remaining()I

    move-result v5

    invoke-virtual {v0, v3, v4, v5}, Ljava/io/InputStream;->read([BII)I

    move-result v0

    if-gez v0, :cond_10

    .line 114
    iput-boolean v2, p0, Ll/֡ۘۜ;->ۤ:Z

    goto :goto_5

    :cond_10
    if-nez v0, :cond_12

    .line 116
    iget-object v0, p0, Ll/֡ۘۜ;->ۨ:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    if-gez v0, :cond_11

    .line 117
    iput-boolean v2, p0, Ll/֡ۘۜ;->ۤ:Z

    goto :goto_5

    .line 118
    :cond_11
    iget-object v2, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    int-to-byte v0, v0

    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    goto :goto_5

    .line 119
    :cond_12
    iget-object v2, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->position()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 120
    :goto_5
    iget-object v0, p0, Ll/֡ۘۜ;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    goto/16 :goto_0

    .line 111
    :cond_13
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Text search reader is closed."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 130
    :cond_14
    throw v0
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 221
    :try_start_0
    iget-boolean v1, p0, Ll/֡ۘۜ;->᩶:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v1, 0x1

    .line 222
    :try_start_1
    iput-boolean v1, p0, Ll/֡ۘۜ;->᩶:Z

    .line 223
    iget-object v1, p0, Ll/֡ۘۜ;->ۨ:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public final position()J
    .locals 2

    .line 107
    iget v0, p0, Ll/֡ۘۜ;->᩺:I

    if-ltz v0, :cond_0

    iget-wide v0, p0, Ll/֡ۘۜ;->ܰ:J

    return-wide v0

    :cond_0
    iget-wide v0, p0, Ll/֡ۘۜ;->ۙ:J

    return-wide v0
.end method

.method public final ۧ(J)Ll/ᩴۘۜ;
    .locals 13

    .line 178
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    .line 179
    iget-boolean v0, p0, Ll/֡ۘۜ;->᩶:Z

    if-nez v0, :cond_9

    .line 180
    invoke-virtual {p0}, Ll/֡ۘۜ;->position()J

    move-result-wide v4

    .line 181
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    :cond_0
    :goto_0
    invoke-direct {p0}, Ll/֡ۘۜ;->ܽ()I

    move-result v1

    if-gez v1, :cond_2

    .line 186
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-nez v1, :cond_1

    const/4 p1, 0x0

    return-object p1

    .line 187
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    move v9, v1

    goto :goto_3

    :cond_2
    const/16 v2, 0xd

    const/16 v3, 0xa

    if-eq v1, v2, :cond_5

    if-ne v1, v3, :cond_3

    goto :goto_1

    .line 209
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-static {v1}, Ljava/lang/Character;->charCount(I)I

    move-result v3

    add-int/2addr v3, v2

    const/high16 v2, 0x100000

    if-gt v3, v2, :cond_4

    .line 210
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->appendCodePoint(I)Ljava/lang/StringBuilder;

    .line 211
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    and-int/lit16 v1, v1, 0xfff

    if-nez v1, :cond_0

    invoke-static {}, Ll/֡ۘۜ;->֫()V

    goto :goto_0

    .line 209
    :cond_4
    new-instance p1, Ll/᩵ۘۜ;

    .line 226
    invoke-direct {p1}, Ljava/io/IOException;-><init>()V

    .line 209
    throw p1

    .line 191
    :cond_5
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    int-to-char v7, v1

    .line 192
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    if-ne v1, v2, :cond_7

    .line 194
    iget-wide v1, p0, Ll/֡ۘۜ;->ۙ:J

    .line 196
    :try_start_0
    invoke-direct {p0}, Ll/֡ۘۜ;->ܽ()I

    move-result v7

    if-ne v7, v3, :cond_6

    .line 197
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_6
    if-ltz v7, :cond_7

    .line 199
    iput v7, p0, Ll/֡ۘۜ;->᩺:I

    .line 200
    iput-wide v1, p0, Ll/֡ۘۜ;->ܰ:J
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v3

    .line 203
    iput-object v3, p0, Ll/֡ۘۜ;->۫:Ljava/nio/charset/CharacterCodingException;

    .line 204
    iput-wide v1, p0, Ll/֡ۘۜ;->ۙ:J

    :cond_7
    :goto_2
    move v9, v6

    .line 213
    :goto_3
    invoke-virtual {p0}, Ll/֡ۘۜ;->position()J

    move-result-wide v1

    const-wide v6, 0x1fffffffffffffL

    cmp-long v3, v1, v6

    if-gtz v3, :cond_8

    .line 216
    new-instance v12, Ll/ᩴۘۜ;

    invoke-virtual {p0}, Ll/֡ۘۜ;->position()J

    move-result-wide v6

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    const-wide/16 v10, 0x0

    move-object v1, v12

    move-wide v2, p1

    invoke-direct/range {v1 .. v11}, Ll/ᩴۘۜ;-><init>(JJJLjava/lang/String;IJ)V

    return-object v12

    .line 214
    :cond_8
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text search offset exceeds the supported JSON integer range."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 179
    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Text search reader is closed."

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
