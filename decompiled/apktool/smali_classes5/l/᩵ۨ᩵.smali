.class public Ll/᩵ۨ᩵;
.super Ljava/io/FilterInputStream;
.source "Z8DM"

# interfaces
.implements Ll/ܶ֨ᩴ;


# instance fields
.field public ۗ:J

.field public final ۙ:Ll/ۖ᩹ۢ;

.field public final ۛ:Ljava/nio/ByteBuffer;

.field public ۟:J

.field public final ۤ:[B

.field public ۨ:I

.field public ۫:Ll/ܶۨ᩵;

.field public ۬:Z

.field public final ܰ:Ljava/nio/ByteBuffer;

.field public ᩶:[B

.field public ᩸:Ljava/nio/ByteBuffer;

.field public final ᩹:Ll/֫᩺᩵;

.field public ᩺:[B


# direct methods
.method public constructor <init>(Ljava/io/InputStream;)V
    .locals 4

    .line 75
    invoke-static {}, Ll/ᩴۨ᩵;->ۧ()Ll/ᩴۨ᩵;

    move-result-object v0

    invoke-virtual {v0}, Ll/ᩴۨ᩵;->֫()Ll/ۖ᩹ۢ;

    move-result-object v0

    invoke-static {}, Ll/ܽ᩺᩵;->֫()Ll/ܽ᩺᩵;

    invoke-static {}, Ll/ܽ᩺᩵;->ۧ()Ll/֫᩺᩵;

    move-result-object v1

    .line 117
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    const/16 p1, 0xf

    new-array p1, p1, [B

    .line 51
    iput-object p1, p0, Ll/᩵ۨ᩵;->ۤ:[B

    .line 52
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p1

    sget-object v2, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۨ᩵;->ۛ:Ljava/nio/ByteBuffer;

    const/16 p1, 0x8

    .line 54
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Ll/᩵ۨ᩵;->ܰ:Ljava/nio/ByteBuffer;

    const/4 p1, 0x0

    .line 56
    iput-object p1, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    .line 57
    iput-object p1, p0, Ll/᩵ۨ᩵;->᩺:[B

    const/4 v2, -0x1

    .line 58
    iput v2, p0, Ll/᩵ۨ᩵;->ۨ:I

    const-wide/16 v2, -0x1

    .line 59
    iput-wide v2, p0, Ll/᩵ۨ᩵;->ۗ:J

    const-wide/16 v2, 0x0

    .line 60
    iput-wide v2, p0, Ll/᩵ۨ᩵;->۟:J

    const/4 v2, 0x0

    .line 61
    iput-boolean v2, p0, Ll/᩵ۨ᩵;->۬:Z

    .line 62
    iput-object p1, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    .line 118
    iput-object v0, p0, Ll/᩵ۨ᩵;->ۙ:Ll/ۖ᩹ۢ;

    .line 119
    iput-object v1, p0, Ll/᩵ۨ᩵;->᩹:Ll/֫᩺᩵;

    return-void
.end method

.method private ֫(Ljava/io/InputStream;)I
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 238
    :cond_0
    iget-object v2, p0, Ll/᩵ۨ᩵;->ܰ:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    rsub-int/lit8 v4, v1, 0x4

    invoke-virtual {p1, v3, v1, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v3

    if-ltz v3, :cond_1

    add-int/2addr v1, v3

    const/4 v3, 0x4

    if-lt v1, v3, :cond_0

    .line 244
    invoke-virtual {v2, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1

    .line 240
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Stream ended prematurely"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫()Z
    .locals 9

    :goto_0
    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 133
    :cond_0
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    iget-object v3, p0, Ll/᩵ۨ᩵;->ܰ:Ljava/nio/ByteBuffer;

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    rsub-int/lit8 v4, v1, 0x4

    invoke-virtual {v2, v3, v1, v4}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const-string v3, "Stream ended prematurely"

    if-gez v2, :cond_3

    .line 135
    iget-boolean v2, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v2, :cond_2

    if-gtz v1, :cond_1

    return v0

    .line 137
    :cond_1
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 142
    :cond_2
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    add-int/2addr v1, v2

    const/4 v2, 0x4

    if-lt v1, v2, :cond_0

    .line 147
    iget-object v1, p0, Ll/᩵ۨ᩵;->ܰ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    const v2, 0x184d2204

    const/4 v4, 0x1

    if-ne v1, v2, :cond_b

    .line 178
    iget-object v1, p0, Ll/᩵ۨ᩵;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 180
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v1}, Ljava/io/InputStream;->read()I

    move-result v1

    if-ltz v1, :cond_a

    .line 184
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ltz v2, :cond_9

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 190
    invoke-static {v1}, Ll/۠ۨ᩵;->֫(B)Ll/۠ۨ᩵;

    move-result-object v5

    .line 191
    iget-object v6, p0, Ll/᩵ۨ᩵;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    and-int/lit16 v1, v2, 0xff

    int-to-byte v1, v1

    .line 193
    invoke-static {v1}, Ll/֡ۨ᩵;->֫(B)Ll/֡ۨ᩵;

    move-result-object v2

    .line 194
    iget-object v6, p0, Ll/᩵ۨ᩵;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v6, v1}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 196
    new-instance v1, Ll/ܶۨ᩵;

    invoke-direct {v1, v5, v2}, Ll/ܶۨ᩵;-><init>(Ll/۠ۨ᩵;Ll/֡ۨ᩵;)V

    iput-object v1, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    .line 198
    sget-object v1, Ll/֨ۨ᩵;->۬:Ll/֨ۨ᩵;

    invoke-virtual {v5, v1}, Ll/۠ۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v1

    const/16 v2, 0x8

    if-eqz v1, :cond_6

    .line 199
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    .line 224
    iget-object v5, p0, Ll/᩵ۨ᩵;->ܰ:Ljava/nio/ByteBuffer;

    const/4 v6, 0x0

    .line 226
    :cond_4
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v7

    rsub-int/lit8 v8, v6, 0x8

    invoke-virtual {v1, v7, v6, v8}, Ljava/io/InputStream;->read([BII)I

    move-result v7

    if-ltz v7, :cond_5

    add-int/2addr v6, v7

    if-lt v6, v2, :cond_4

    .line 232
    invoke-virtual {v5, v0}, Ljava/nio/ByteBuffer;->getLong(I)J

    move-result-wide v5

    .line 199
    iput-wide v5, p0, Ll/᩵ۨ᩵;->ۗ:J

    .line 200
    iget-object v1, p0, Ll/᩵ۨ᩵;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v5, v6}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    goto :goto_1

    .line 228
    :cond_5
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    :goto_1
    const-wide/16 v5, 0x0

    .line 202
    iput-wide v5, p0, Ll/᩵ۨ᩵;->۟:J

    .line 205
    iget-object v1, p0, Ll/᩵ۨ᩵;->᩹:Ll/֫᩺᩵;

    iget-object v5, p0, Ll/᩵ۨ᩵;->ۤ:[B

    iget-object v6, p0, Ll/᩵ۨ᩵;->ۛ:Ljava/nio/ByteBuffer;

    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v6

    invoke-virtual {v1, v5, v0, v6}, Ll/֫᩺᩵;->֫([BII)I

    move-result v1

    shr-int/2addr v1, v2

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    .line 206
    iget-object v2, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v2

    if-ltz v2, :cond_8

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    if-ne v1, v2, :cond_7

    .line 215
    iget-object v1, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    invoke-virtual {v1}, Ll/ܶۨ᩵;->ܽ()Ll/֡ۨ᩵;

    move-result-object v1

    invoke-virtual {v1}, Ll/֡ۨ᩵;->֫()I

    move-result v1

    iput v1, p0, Ll/᩵ۨ᩵;->ۨ:I

    .line 216
    new-array v2, v1, [B

    iput-object v2, p0, Ll/᩵ۨ᩵;->᩶:[B

    .line 217
    new-array v1, v1, [B

    iput-object v1, p0, Ll/᩵ۨ᩵;->᩺:[B

    .line 218
    invoke-static {v1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v1

    iput-object v1, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    .line 219
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 220
    iput-boolean v4, p0, Ll/᩵ۨ᩵;->۬:Z

    return v4

    .line 212
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream frame descriptor corrupted"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 208
    :cond_8
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 186
    :cond_9
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 182
    :cond_a
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    ushr-int/lit8 v1, v1, 0x4

    const v2, 0x184d2a5

    if-ne v1, v2, :cond_e

    .line 160
    iget-object v1, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-direct {p0, v1}, Ll/᩵ۨ᩵;->֫(Ljava/io/InputStream;)I

    move-result v1

    const/16 v2, 0x400

    new-array v5, v2, [B

    :goto_2
    if-lez v1, :cond_d

    .line 163
    iget-object v6, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v7

    invoke-virtual {v6, v5, v0, v7}, Ljava/io/InputStream;->read([BII)I

    move-result v6

    if-ltz v6, :cond_c

    sub-int/2addr v1, v6

    goto :goto_2

    .line 165
    :cond_c
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 169
    :cond_d
    iput-boolean v4, p0, Ll/᩵ۨ᩵;->۬:Z

    goto/16 :goto_0

    .line 154
    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream unsupported"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ܽ()V
    .locals 7

    .line 254
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-direct {p0, v0}, Ll/᩵ۨ᩵;->֫(Ljava/io/InputStream;)I

    move-result v0

    const/high16 v1, -0x80000000

    and-int/2addr v1, v0

    const/4 v2, 0x0

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const v3, 0x7fffffff

    and-int/2addr v0, v3

    if-nez v0, :cond_5

    .line 260
    iget-object v0, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    sget-object v1, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    invoke-virtual {v0, v1}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 261
    iget-object v0, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-direct {p0, v0}, Ll/᩵ۨ᩵;->֫(Ljava/io/InputStream;)I

    move-result v0

    .line 262
    iget-object v1, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    invoke-virtual {v1}, Ll/ܶۨ᩵;->֫()I

    move-result v1

    if-ne v0, v1, :cond_1

    goto :goto_1

    .line 263
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Content checksum mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 266
    :cond_2
    :goto_1
    iget-object v0, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    sget-object v1, Ll/֨ۨ᩵;->۬:Ll/֨ۨ᩵;

    invoke-virtual {v0, v1}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-wide v0, p0, Ll/᩵ۨ᩵;->ۗ:J

    iget-wide v2, p0, Ll/᩵ۨ᩵;->۟:J

    cmp-long v4, v0, v2

    if-nez v4, :cond_3

    goto :goto_2

    .line 267
    :cond_3
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Size check mismatch: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Ll/᩵ۨ᩵;->ۗ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " != "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/᩵ۨ᩵;->۟:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 269
    :cond_4
    :goto_2
    iget-object v0, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ۧ()V

    return-void

    :cond_5
    if-eqz v1, :cond_6

    .line 275
    iget-object v3, p0, Ll/᩵ۨ᩵;->᩶:[B

    goto :goto_3

    .line 277
    :cond_6
    iget-object v3, p0, Ll/᩵ۨ᩵;->᩺:[B

    .line 279
    :goto_3
    iget v4, p0, Ll/᩵ۨ᩵;->ۨ:I

    if-gt v0, v4, :cond_d

    const/4 v4, 0x0

    :goto_4
    if-ge v4, v0, :cond_8

    .line 285
    iget-object v5, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    sub-int v6, v0, v4

    invoke-virtual {v5, v3, v4, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-ltz v5, :cond_7

    add-int/2addr v4, v5

    goto :goto_4

    .line 287
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Stream ended prematurely"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 293
    :cond_8
    iget-object v4, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    sget-object v5, Ll/֨ۨ᩵;->᩶:Ll/֨ۨ᩵;

    invoke-virtual {v4, v5}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 294
    iget-object v4, p0, Ljava/io/FilterInputStream;->in:Ljava/io/InputStream;

    invoke-direct {p0, v4}, Ll/᩵ۨ᩵;->֫(Ljava/io/InputStream;)I

    move-result v4

    .line 295
    iget-object v5, p0, Ll/᩵ۨ᩵;->᩹:Ll/֫᩺᩵;

    invoke-virtual {v5, v3, v2, v0}, Ll/֫᩺᩵;->֫([BII)I

    move-result v2

    if-ne v4, v2, :cond_9

    goto :goto_5

    .line 296
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Block checksum mismatch"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    :goto_5
    if-eqz v1, :cond_b

    .line 303
    :try_start_0
    iget-object v1, p0, Ll/᩵ۨ᩵;->ۙ:Ll/ۖ᩹ۢ;

    iget-object v2, p0, Ll/᩵ۨ᩵;->᩺:[B

    array-length v4, v2

    invoke-virtual {v1, v0, v4, v3, v2}, Ll/ۖ᩹ۢ;->֫(II[B[B)I

    move-result v0
    :try_end_0
    .catch Ll/ۘۨ᩵; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_6

    :catch_0
    move-exception v0

    .line 305
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    .line 310
    :cond_b
    :goto_6
    iget-object v1, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    sget-object v2, Ll/֨ۨ᩵;->ۗ:Ll/֨ۨ᩵;

    invoke-virtual {v1, v2}, Ll/ܶۨ᩵;->֫(Ll/֨ۨ᩵;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 311
    iget-object v1, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    iget-object v2, p0, Ll/᩵ۨ᩵;->᩺:[B

    invoke-virtual {v1, v0, v2}, Ll/ܶۨ᩵;->֫(I[B)V

    .line 313
    :cond_c
    iget-wide v1, p0, Ll/᩵ۨ᩵;->۟:J

    int-to-long v3, v0

    add-long/2addr v1, v3

    iput-wide v1, p0, Ll/᩵ۨ᩵;->۟:J

    .line 314
    iget-object v1, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    .line 315
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    return-void

    .line 280
    :cond_d
    new-instance v1, Ljava/io/IOException;

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    iget v2, p0, Ll/᩵ۨ᩵;->ۨ:I

    const-string v3, "Block size "

    const-string v4, " exceeded max: "

    .line 0
    invoke-static {v3, v0, v2, v4}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 280
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final available()I
    .locals 1

    .line 378
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    return v0
.end method

.method public final declared-synchronized mark(I)V
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 388
    :try_start_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v1, "mark not supported"

    invoke-direct {p1, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final markSupported()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public read()I
    .locals 1

    .line 320
    :goto_0
    iget-boolean v0, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 331
    :cond_0
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 321
    :cond_1
    :goto_1
    iget-boolean v0, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 325
    :cond_2
    invoke-direct {p0}, Ll/᩵ۨ᩵;->֫()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 v0, -0x1

    return v0

    .line 329
    :cond_3
    invoke-direct {p0}, Ll/᩵ۨ᩵;->ܽ()V

    goto :goto_0
.end method

.method public read([BII)I
    .locals 2

    if-ltz p2, :cond_4

    if-ltz p3, :cond_4

    add-int v0, p2, p3

    .line 336
    array-length v1, p1

    if-gt v0, v1, :cond_4

    .line 339
    :goto_0
    iget-boolean v0, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    .line 350
    :cond_0
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 351
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return p3

    .line 340
    :cond_1
    :goto_1
    iget-boolean v0, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    invoke-virtual {v0}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 344
    :cond_2
    invoke-direct {p0}, Ll/᩵ۨ᩵;->֫()Z

    move-result v0

    if-nez v0, :cond_3

    const/4 p1, -0x1

    return p1

    .line 348
    :cond_3
    invoke-direct {p0}, Ll/᩵ۨ᩵;->ܽ()V

    goto :goto_0

    .line 337
    :cond_4
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final declared-synchronized reset()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 393
    :try_start_0
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "reset not supported"

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public skip(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gtz v2, :cond_0

    goto :goto_2

    .line 360
    :cond_0
    :goto_0
    iget-boolean v2, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v2}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    .line 371
    :cond_1
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    int-to-long v0, v0

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    .line 372
    iget-object v0, p0, Ll/᩵ۨ᩵;->᩸:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->position()I

    move-result v1

    long-to-int v2, p1

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    return-wide p1

    .line 361
    :cond_2
    :goto_1
    iget-boolean v2, p0, Ll/᩵ۨ᩵;->۬:Z

    if-eqz v2, :cond_3

    iget-object v2, p0, Ll/᩵ۨ᩵;->۫:Ll/ܶۨ᩵;

    invoke-virtual {v2}, Ll/ܶۨ᩵;->ܿ()Z

    move-result v2

    if-eqz v2, :cond_4

    .line 365
    :cond_3
    invoke-direct {p0}, Ll/᩵ۨ᩵;->֫()Z

    move-result v2

    if-nez v2, :cond_4

    :goto_2
    return-wide v0

    .line 369
    :cond_4
    invoke-direct {p0}, Ll/᩵ۨ᩵;->ܽ()V

    goto :goto_0
.end method

.method public synthetic transferTo(Ljava/io/OutputStream;)J
    .locals 2

    .line 0
    invoke-static {p0, p1}, Ll/֨֨ᩴ;->transferTo(Ljava/io/InputStream;Ljava/io/OutputStream;)J

    move-result-wide v0

    return-wide v0
.end method
