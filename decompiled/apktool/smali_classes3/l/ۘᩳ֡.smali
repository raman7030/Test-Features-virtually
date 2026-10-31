.class public final Ll/ۘᩳ֡;
.super Ljava/lang/Object;
.source "34CP"

# interfaces
.implements Ll/ۛܽ֡;


# instance fields
.field public final ᩶:Ll/֨ᩳ֡;

.field public final ᩸:Ll/۫ܽ֡;

.field public ᩹:Z


# direct methods
.method public constructor <init>(Ll/֨ᩳ֡;)V
    .locals 1

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    new-instance v0, Ll/۫ܽ֡;

    invoke-direct {v0}, Ll/۫ܽ֡;-><init>()V

    iput-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    if-eqz p1, :cond_0

    .line 34
    iput-object p1, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    return-void

    .line 33
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 466
    iget-boolean v0, p0, Ll/ۘᩳ֡;->᩹:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 467
    iput-boolean v0, p0, Ll/ۘᩳ֡;->᩹:Z

    .line 468
    iget-object v0, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 469
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->֫()V

    return-void
.end method

.method public final isOpen()Z
    .locals 1

    .line 462
    iget-boolean v0, p0, Ll/ۘᩳ֡;->᩹:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 6

    .line 149
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-wide v1, v0, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    .line 150
    iget-object v1, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-nez v5, :cond_0

    const/4 p1, -0x1

    return p1

    .line 154
    :cond_0
    invoke-virtual {v0, p1}, Ll/۫ܽ֡;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public final readByte()B
    .locals 2

    const-wide/16 v0, 0x1

    .line 74
    invoke-virtual {p0, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 75
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->readByte()B

    move-result v0

    return v0
.end method

.method public final readFully([B)V
    .locals 8

    .line 122
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    :try_start_0
    array-length v1, p1

    int-to-long v1, v1

    invoke-virtual {p0, v1, v2}, Ll/ۘᩳ֡;->ܿ(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    .line 133
    invoke-virtual {v0, p1}, Ll/۫ܽ֡;->readFully([B)V

    return-void

    :catch_0
    move-exception v1

    const/4 v2, 0x0

    .line 126
    :goto_0
    iget-wide v3, v0, Ll/۫ܽ֡;->᩹:J

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-lez v7, :cond_1

    long-to-int v4, v3

    .line 127
    invoke-virtual {v0, p1, v2, v4}, Ll/۫ܽ֡;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    .line 128
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 131
    :cond_1
    throw v1
.end method

.method public final readInt()I
    .locals 2

    const-wide/16 v0, 0x4

    .line 265
    invoke-virtual {p0, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 266
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->readInt()I

    move-result v0

    return v0
.end method

.method public final readShort()S
    .locals 2

    const-wide/16 v0, 0x2

    .line 255
    invoke-virtual {p0, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 256
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->readShort()S

    move-result v0

    return v0
.end method

.method public final skip(J)V
    .locals 6

    .line 321
    iget-boolean v0, p0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v0, :cond_3

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    .line 323
    iget-object v2, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-wide v3, v2, Ll/۫ܽ֡;->᩹:J

    cmp-long v5, v3, v0

    if-nez v5, :cond_1

    iget-object v0, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-eqz v5, :cond_0

    goto :goto_1

    .line 324
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 67
    :cond_1
    :goto_1
    iget-wide v0, v2, Ll/۫ܽ֡;->᩹:J

    .line 326
    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    .line 327
    invoke-virtual {v2, v0, v1}, Ll/۫ܽ֡;->skip(J)V

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_2
    return-void

    .line 321
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 477
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֡֫()Ljava/lang/String;
    .locals 2

    const-wide v0, 0x7fffffffffffffffL

    .line 220
    invoke-virtual {p0, v0, v1}, Ll/ۘᩳ֡;->֫(J)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(BJJ)J
    .locals 9

    .line 341
    iget-boolean p2, p0, Ll/ۘᩳ֡;->᩹:Z

    if-nez p2, :cond_4

    const-wide/16 p2, 0x0

    cmp-long v0, p4, p2

    if-ltz v0, :cond_3

    :goto_0
    const-wide/16 v7, -0x1

    cmp-long v0, p2, p4

    if-gez v0, :cond_2

    .line 348
    iget-object v1, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    move v2, p1

    move-wide v3, p2

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Ll/۫ܽ֡;->֫(BJJ)J

    move-result-wide v0

    cmp-long v2, v0, v7

    if-eqz v2, :cond_0

    return-wide v0

    .line 353
    :cond_0
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-wide v1, v0, Ll/۫ܽ֡;->᩹:J

    cmp-long v3, v1, p4

    if-gez v3, :cond_2

    .line 354
    iget-object v3, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v4, 0x2000

    invoke-interface {v3, v0, v4, v5}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v3

    cmp-long v0, v3, v7

    if-nez v0, :cond_1

    goto :goto_1

    .line 357
    :cond_1
    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    goto :goto_0

    :cond_2
    :goto_1
    return-wide v7

    .line 343
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "fromIndex=0 toIndex="

    .line 0
    invoke-static {p4, p5, p2}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 344
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 341
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/ۚᩳ֡;)J
    .locals 10

    const-wide/16 v0, 0x0

    move-wide v2, v0

    .line 172
    :cond_0
    :goto_0
    iget-object v4, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v5, 0x2000

    iget-object v7, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-interface {v4, v7, v5, v6}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v4

    const-wide/16 v8, -0x1

    cmp-long v6, v4, v8

    if-eqz v6, :cond_1

    .line 173
    invoke-virtual {v7}, Ll/۫ܽ֡;->ܽ()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    add-long/2addr v2, v4

    .line 176
    invoke-interface {p1, v7, v4, v5}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V

    goto :goto_0

    .line 67
    :cond_1
    iget-wide v4, v7, Ll/۫ܽ֡;->᩹:J

    cmp-long v6, v4, v0

    if-lez v6, :cond_2

    add-long/2addr v2, v4

    .line 181
    invoke-interface {p1, v7, v4, v5}, Ll/ۚᩳ֡;->֫(Ll/۫ܽ֡;J)V

    :cond_2
    return-wide v2
.end method

.method public final ֫(J)Ljava/lang/String;
    .locals 21

    move-object/from16 v6, p0

    move-wide/from16 v7, p1

    const-wide/16 v0, 0x0

    cmp-long v2, v7, v0

    if-ltz v2, :cond_3

    const-wide/16 v9, 0x1

    const-wide v11, 0x7fffffffffffffffL

    cmp-long v0, v7, v11

    if-nez v0, :cond_0

    move-wide v13, v11

    goto :goto_0

    :cond_0
    add-long v0, v7, v9

    move-wide v13, v0

    :goto_0
    const/16 v1, 0xa

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide v4, v13

    .line 226
    invoke-virtual/range {v0 .. v5}, Ll/ۘᩳ֡;->֫(BJJ)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    .line 227
    iget-object v4, v6, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    cmp-long v5, v0, v2

    if-eqz v5, :cond_1

    invoke-virtual {v4, v0, v1}, Ll/۫ܽ֡;->ᩳ(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    cmp-long v0, v13, v11

    if-gez v0, :cond_2

    .line 229
    invoke-virtual {v6, v13, v14}, Ll/ۘᩳ֡;->ۧ(J)Z

    move-result v0

    if-eqz v0, :cond_2

    sub-long v0, v13, v9

    invoke-virtual {v4, v0, v1}, Ll/۫ܽ֡;->ۧ(J)B

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_2

    add-long/2addr v9, v13

    .line 230
    invoke-virtual {v6, v9, v10}, Ll/ۘᩳ֡;->ۧ(J)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v4, v13, v14}, Ll/۫ܽ֡;->ۧ(J)B

    move-result v0

    const/16 v1, 0xa

    if-ne v0, v1, :cond_2

    .line 231
    invoke-virtual {v4, v13, v14}, Ll/۫ܽ֡;->ᩳ(J)Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 233
    :cond_2
    new-instance v0, Ll/۫ܽ֡;

    invoke-direct {v0}, Ll/۫ܽ֡;-><init>()V

    const-wide/16 v1, 0x20

    .line 67
    iget-wide v9, v4, Ll/۫ܽ֡;->᩹:J

    .line 234
    invoke-static {v1, v2, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v19

    const-wide/16 v17, 0x0

    move-object v15, v4

    move-object/from16 v16, v0

    invoke-virtual/range {v15 .. v20}, Ll/۫ܽ֡;->֫(Ll/۫ܽ֡;JJ)V

    .line 235
    new-instance v1, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\\n not found: limit="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 67
    iget-wide v3, v4, Ll/۫ܽ֡;->᩹:J

    .line 235
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " content="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    invoke-virtual {v0}, Ll/۫ܽ֡;->ᩳ()Ll/ۨܽ֡;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۨܽ֡;->ۧ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v0, 0x2026

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 224
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "limit < 0: "

    .line 0
    invoke-static {v7, v8, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 224
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    if-eqz p1, :cond_0

    .line 199
    iget-object v0, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    iget-object v1, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v1, v0}, Ll/۫ܽ֡;->֫(Ll/֨ᩳ֡;)V

    .line 200
    invoke-virtual {v1, p1}, Ll/۫ܽ֡;->֫(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 197
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "charset == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۜ(J)Ll/ۨܽ֡;
    .locals 1

    .line 84
    invoke-virtual {p0, p1, p2}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 85
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0, p1, p2}, Ll/۫ܽ֡;->ۜ(J)Ll/ۨܽ֡;

    move-result-object p1

    return-object p1
.end method

.method public final ۜۧ()[B
    .locals 2

    .line 107
    iget-object v0, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    iget-object v1, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v1, v0}, Ll/۫ܽ֡;->֫(Ll/֨ᩳ֡;)V

    .line 108
    invoke-virtual {v1}, Ll/۫ܽ֡;->ۜۧ()[B

    move-result-object v0

    return-object v0
.end method

.method public final ۡܽ()Ljava/io/InputStream;
    .locals 1

    .line 424
    new-instance v0, Ll/ۖᩳ֡;

    invoke-direct {v0, p0}, Ll/ۖᩳ֡;-><init>(Ll/ۘᩳ֡;)V

    return-object v0
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 473
    iget-object v0, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    invoke-interface {v0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۢۧ()Z
    .locals 5

    .line 56
    iget-boolean v0, p0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v0, :cond_1

    .line 57
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0}, Ll/۫ܽ֡;->ۢۧ()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    .line 56
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۢܽ()J
    .locals 7

    const-wide/16 v0, 0x1

    .line 303
    invoke-virtual {p0, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    int-to-long v3, v2

    .line 305
    invoke-virtual {p0, v3, v4}, Ll/ۘᩳ֡;->ۧ(J)Z

    move-result v3

    iget-object v4, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    if-eqz v3, :cond_5

    int-to-long v5, v1

    .line 306
    invoke-virtual {v4, v5, v6}, Ll/۫ܽ֡;->ۧ(J)B

    move-result v3

    const/16 v5, 0x30

    if-lt v3, v5, :cond_0

    const/16 v5, 0x39

    if-le v3, v5, :cond_2

    :cond_0
    const/16 v5, 0x61

    if-lt v3, v5, :cond_1

    const/16 v5, 0x66

    if-le v3, v5, :cond_2

    :cond_1
    const/16 v5, 0x41

    if-lt v3, v5, :cond_3

    const/16 v5, 0x46

    if-le v3, v5, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v1, :cond_4

    goto :goto_2

    .line 310
    :cond_4
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 311
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v0

    const-string v0, "Expected leading [0-9a-fA-F] character but was %#x"

    .line 310
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 317
    :cond_5
    :goto_2
    invoke-virtual {v4}, Ll/۫ܽ֡;->ۢܽ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 6

    if-eqz p1, :cond_3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_2

    .line 44
    iget-boolean v2, p0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v2, :cond_1

    .line 46
    iget-object v2, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-wide v3, v2, Ll/۫ܽ֡;->᩹:J

    cmp-long v5, v3, v0

    if-nez v5, :cond_0

    .line 47
    iget-object v0, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v5, v0, v3

    if-nez v5, :cond_0

    return-wide v3

    .line 51
    :cond_0
    iget-wide v0, v2, Ll/۫ܽ֡;->᩹:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    .line 52
    invoke-virtual {v2, p1, p2, p3}, Ll/۫ܽ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide p1

    return-wide p1

    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 43
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "byteCount < 0: "

    .line 0
    invoke-static {p2, p3, v0}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 43
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 42
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "sink == null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۧ(J)Z
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_3

    .line 66
    iget-boolean v0, p0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v0, :cond_2

    .line 67
    :cond_0
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    iget-wide v1, v0, Ll/۫ܽ֡;->᩹:J

    cmp-long v3, v1, p1

    if-gez v3, :cond_1

    .line 68
    iget-object v1, p0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Ll/֨ᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 65
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "byteCount < 0: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 65
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۧ(Ll/ۨܽ֡;)Z
    .locals 7

    .line 401
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v0

    .line 407
    iget-boolean v1, p0, Ll/ۘᩳ֡;->᩹:Z

    if-nez v1, :cond_5

    const/4 v1, 0x0

    if-ltz v0, :cond_4

    .line 412
    invoke-virtual {p1}, Ll/ۨܽ֡;->᩷()I

    move-result v2

    if-ge v2, v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_3

    int-to-long v3, v2

    const-wide/16 v5, 0x1

    add-long/2addr v5, v3

    .line 417
    invoke-virtual {p0, v5, v6}, Ll/ۘᩳ֡;->ۧ(J)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    .line 418
    :cond_1
    iget-object v5, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v5, v3, v4}, Ll/۫ܽ֡;->ۧ(J)B

    move-result v3

    invoke-virtual {p1, v2}, Ll/ۨܽ֡;->֫(I)B

    move-result v4

    if-eq v3, v4, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    return v1

    .line 407
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ܽ(J)[B
    .locals 1

    .line 112
    invoke-virtual {p0, p1, p2}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 113
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    invoke-virtual {v0, p1, p2}, Ll/۫ܽ֡;->ܽ(J)[B

    move-result-object p1

    return-object p1
.end method

.method public final ܿ(J)V
    .locals 0

    .line 61
    invoke-virtual {p0, p1, p2}, Ll/ۘᩳ֡;->ۧ(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public final ᩵ۧ()J
    .locals 7

    const-wide/16 v0, 0x1

    .line 285
    invoke-virtual {p0, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    add-int/lit8 v2, v1, 0x1

    int-to-long v3, v2

    .line 287
    invoke-virtual {p0, v3, v4}, Ll/ۘᩳ֡;->ۧ(J)Z

    move-result v3

    iget-object v4, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    if-eqz v3, :cond_4

    int-to-long v5, v1

    .line 288
    invoke-virtual {v4, v5, v6}, Ll/۫ܽ֡;->ۧ(J)B

    move-result v3

    const/16 v5, 0x30

    if-lt v3, v5, :cond_0

    const/16 v5, 0x39

    if-le v3, v5, :cond_1

    :cond_0
    if-nez v1, :cond_2

    const/16 v5, 0x2d

    if-eq v3, v5, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    goto :goto_0

    :cond_2
    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    .line 292
    :cond_3
    new-instance v1, Ljava/lang/NumberFormatException;

    .line 293
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    aput-object v2, v3, v0

    const-string v0, "Expected leading [0-9] or \'-\' character but was %#x"

    .line 292
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 299
    :cond_4
    :goto_2
    invoke-virtual {v4}, Ll/۫ܽ֡;->᩵ۧ()J

    move-result-wide v0

    return-wide v0
.end method

.method public final ᩷()Ll/۫ܽ֡;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    return-object v0
.end method
