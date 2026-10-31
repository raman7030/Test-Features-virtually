.class public final Ll/᩸᩷֡;
.super Ll/֡᩷֡;
.source "RAH2"


# instance fields
.field public ۗ:J

.field public ۙ:I

.field public ۛ:I

.field public final ۟:Ll/᩺᩷֡;

.field public ۤ:Z

.field public final ۨ:[B

.field public ۫:J

.field public ۬:Ljava/lang/String;

.field public ܰ:J

.field public final ᩺:I


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 2

    .line 188
    invoke-direct {p0, p1}, Ll/֡᩷֡;-><init>(Ljava/io/OutputStream;)V

    const/4 v0, 0x0

    .line 101
    iput v0, p0, Ll/᩸᩷֡;->ۛ:I

    .line 102
    iput v0, p0, Ll/᩸᩷֡;->ۙ:I

    .line 199
    new-instance v0, Ll/ܳۢ֡;

    new-instance v1, Ll/۟ۡ֡;

    .line 91
    invoke-direct {v1, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 199
    invoke-direct {v0, v1}, Ll/ܳۢ֡;-><init>(Ll/۟ۡ֡;)V

    iput-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 200
    sget p1, Ll/ۡۢ֡;->֫:I

    .line 241
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object p1

    .line 200
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    const/4 p1, 0x0

    .line 201
    invoke-static {p1}, Ll/ܰ᩷֡;->֫(Ljava/lang/String;)Ll/᩺᩷֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩸᩷֡;->۟:Ll/᩺᩷֡;

    const/16 p1, 0x200

    new-array p1, p1, [B

    .line 203
    iput-object p1, p0, Ll/᩸᩷֡;->ۨ:[B

    const/4 p1, 0x1

    .line 204
    iput p1, p0, Ll/᩸᩷֡;->᩺:I

    return-void
.end method

.method public static ֫(JJLjava/lang/String;Ljava/lang/String;)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-ltz v2, :cond_0

    cmp-long v0, p0, p2

    if-gtz v0, :cond_0

    return-void

    .line 366
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " \'"

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, "\' is too big ( > "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " )."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/lang/String;JJ)V
    .locals 6

    const-string v5, ""

    move-wide v0, p1

    move-wide v2, p3

    move-object v4, p0

    .line 361
    invoke-static/range {v0 .. v5}, Ll/᩸᩷֡;->֫(JJLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static ֫(Ljava/util/HashMap;Ljava/lang/String;JI)V
    .locals 1

    .line 249
    invoke-static {p2, p3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p2

    int-to-long p3, p4

    .line 250
    invoke-static {p3, p4}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object p3

    const/16 p4, 0x9

    invoke-virtual {p3, p4}, Ljava/math/BigDecimal;->movePointLeft(I)Ljava/math/BigDecimal;

    move-result-object p3

    const/4 p4, 0x7

    sget-object v0, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    invoke-virtual {p3, p4, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p3

    .line 251
    invoke-virtual {p2, p3}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    move-result-object p2

    .line 252
    invoke-virtual {p2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_1

    cmp-long v0, p2, p4

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    .line 257
    :cond_1
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static ֫(Ljava/util/HashMap;Ljava/lang/String;Ll/ۙ۠ᩴ;)V
    .locals 2

    if-eqz p2, :cond_1

    .line 224
    invoke-virtual {p2}, Ll/ۙ۠ᩴ;->toInstant()Ll/ۘ᩹ᩴ;

    move-result-object p2

    .line 225
    invoke-virtual {p2}, Ll/ۘ᩹ᩴ;->getEpochSecond()J

    move-result-wide v0

    .line 226
    invoke-virtual {p2}, Ll/ۘ᩹ᩴ;->getNano()I

    move-result p2

    if-nez p2, :cond_0

    .line 228
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 230
    :cond_0
    invoke-static {p0, p1, v0, v1, p2}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JI)V

    :cond_1
    return-void
.end method

.method public static ֫(Ll/֨᩷֡;Ll/֨᩷֡;)V
    .locals 6

    .line 625
    invoke-virtual {p0}, Ll/֨᩷֡;->ۜ()Ll/ۙ۠ᩴ;

    move-result-object p0

    sget v0, Ll/ۜۢ֡;->֫:I

    .line 177
    sget v0, Ll/ᩳۢ֡;->֫:I

    const-wide/16 v0, 0x0

    if-eqz p0, :cond_0

    .line 282
    sget-object v2, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p0, v2}, Ll/ۙ۠ᩴ;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    cmp-long p0, v2, v0

    if-ltz p0, :cond_2

    const-wide v4, 0x1ffffffffL

    cmp-long p0, v2, v4

    if-lez p0, :cond_1

    goto :goto_1

    :cond_1
    move-wide v0, v2

    .line 72
    :cond_2
    :goto_1
    sget-object p0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p0}, Ll/ۙ۠ᩴ;->from(JLjava/util/concurrent/TimeUnit;)Ll/ۙ۠ᩴ;

    move-result-object p0

    .line 629
    invoke-virtual {p1, p0}, Ll/֨᩷֡;->֫(Ll/ۙ۠ᩴ;)V

    return-void
.end method

.method private ֫(Ll/֨᩷֡;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;BLjava/lang/String;)Z
    .locals 6

    .line 453
    iget-object v0, p0, Ll/᩸᩷֡;->۟:Ll/᩺᩷֡;

    invoke-interface {v0, p2}, Ll/᩺᩷֡;->֫(Ljava/lang/String;)[B

    move-result-object v0

    .line 454
    array-length v1, v0

    const/16 v2, 0x64

    const/4 v3, 0x0

    if-lt v1, v2, :cond_3

    .line 457
    iget v2, p0, Ll/᩸᩷֡;->ۛ:I

    const/4 v4, 0x3

    const/4 v5, 0x1

    if-ne v2, v4, :cond_0

    .line 458
    invoke-virtual {p3, p4, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v5

    :cond_0
    const/4 p3, 0x2

    if-ne v2, p3, :cond_1

    .line 464
    new-instance p2, Ll/֨᩷֡;

    const-string p3, "././@LongLink"

    invoke-direct {p2, p5, p3}, Ll/֨᩷֡;-><init>(BLjava/lang/String;)V

    int-to-long p3, v1

    const-wide/16 p5, 0x1

    add-long/2addr p3, p5

    .line 466
    invoke-virtual {p2, p3, p4}, Ll/֨᩷֡;->ۧ(J)V

    .line 467
    invoke-static {p1, p2}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;Ll/֨᩷֡;)V

    .line 468
    invoke-virtual {p0, p2}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;)V

    .line 469
    invoke-virtual {p0, v0, v3, v1}, Ll/᩸᩷֡;->write([BII)V

    .line 470
    invoke-virtual {p0, v3}, Ll/֡᩷֡;->write(I)V

    .line 471
    invoke-virtual {p0}, Ll/᩸᩷֡;->ᩳ()V

    return v3

    :cond_1
    if-ne v2, v5, :cond_2

    goto :goto_0

    .line 473
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " \'"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is too long ( > 100 bytes)"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_0
    return v3
.end method

.method private ۧ([B)V
    .locals 4

    .line 689
    array-length v0, p1

    const/16 v1, 0x200

    if-ne v0, v1, :cond_0

    .line 693
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write([B)V

    .line 694
    iget-wide v0, p0, Ll/᩸᩷֡;->ܰ:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Ll/᩸᩷֡;->ܰ:J

    return-void

    .line 690
    :cond_0
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Record to write has length \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p1, p1

    const-string v2, "\' which is not the record size of \'512\'"

    .line 0
    invoke-static {p1, v2, v1}, Ll/ۗۧᩳ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p1

    .line 690
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 290
    :try_start_0
    invoke-virtual {p0}, Ll/֡᩷֡;->ܽ()Z

    move-result v0

    if-nez v0, :cond_0

    .line 291
    invoke-virtual {p0}, Ll/᩸᩷֡;->finish()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    :cond_0
    invoke-virtual {p0}, Ll/֡᩷֡;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    .line 295
    invoke-super {p0}, Ll/֡᩷֡;->close()V

    :cond_1
    return-void

    :catchall_0
    move-exception v0

    .line 294
    invoke-virtual {p0}, Ll/֡᩷֡;->isClosed()Z

    move-result v1

    if-nez v1, :cond_2

    .line 295
    invoke-super {p0}, Ll/֡᩷֡;->close()V

    .line 297
    :cond_2
    throw v0
.end method

.method public final finish()V
    .locals 9

    .line 395
    invoke-virtual {p0}, Ll/֡᩷֡;->֫()V

    .line 396
    iget-boolean v0, p0, Ll/᩸᩷֡;->ۤ:Z

    if-nez v0, :cond_2

    .line 658
    iget-object v0, p0, Ll/᩸᩷֡;->ۨ:[B

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 659
    invoke-direct {p0, v0}, Ll/᩸᩷֡;->ۧ([B)V

    .line 658
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 659
    invoke-direct {p0, v0}, Ll/᩸᩷֡;->ۧ([B)V

    .line 481
    iget-wide v2, p0, Ll/᩸᩷֡;->ܰ:J

    iget v4, p0, Ll/᩸᩷֡;->᩺:I

    int-to-long v5, v4

    rem-long/2addr v2, v5

    long-to-int v5, v2

    int-to-long v6, v5

    cmp-long v8, v2, v6

    if-nez v8, :cond_1

    if-eqz v5, :cond_0

    :goto_0
    if-ge v5, v4, :cond_0

    .line 658
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 659
    invoke-direct {p0, v0}, Ll/᩸᩷֡;->ۧ([B)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 402
    :cond_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 403
    invoke-super {p0}, Ll/֡᩷֡;->finish()V

    return-void

    .line 0
    :cond_1
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    .line 397
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "This archive contains unclosed entries."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final write([BII)V
    .locals 7

    .line 643
    iget-boolean v0, p0, Ll/᩸᩷֡;->ۤ:Z

    if-eqz v0, :cond_1

    .line 646
    iget-wide v0, p0, Ll/᩸᩷֡;->ۗ:J

    int-to-long v2, p3

    add-long/2addr v0, v2

    iget-wide v4, p0, Ll/᩸᩷֡;->۫:J

    cmp-long v6, v0, v4

    if-gtz v6, :cond_0

    .line 650
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    .line 651
    iget-wide p1, p0, Ll/᩸᩷֡;->ۗ:J

    add-long/2addr p1, v2

    iput-wide p1, p0, Ll/᩸᩷֡;->ۗ:J

    return-void

    .line 647
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Request to write \'"

    const-string v0, "\' bytes exceeds size in header of \'"

    .line 0
    invoke-static {p3, p2, v0}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    .line 647
    iget-wide v0, p0, Ll/᩸᩷֡;->۫:J

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, "\' bytes for entry \'"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Ll/᩸᩷֡;->۬:Ljava/lang/String;

    const-string v0, "\'"

    .line 0
    invoke-static {p2, p3, v0}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 647
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 644
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "No current tar entry"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫(Ll/֨᩷֡;)V
    .locals 22

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    .line 504
    invoke-virtual/range {p0 .. p0}, Ll/֡᩷֡;->֫()V

    .line 505
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->۬()Z

    move-result v0

    iget-object v9, v7, Ll/᩸᩷֡;->۟:Ll/᩺᩷֡;

    const-wide/16 v1, 0x0

    iget-object v11, v7, Ll/᩸᩷֡;->ۨ:[B

    const/4 v12, 0x1

    if-eqz v0, :cond_1

    .line 506
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ܿ()Ljava/util/Map;

    move-result-object v0

    .line 339
    new-instance v3, Ljava/io/StringWriter;

    invoke-direct {v3}, Ljava/io/StringWriter;-><init>()V

    .line 340
    new-instance v4, Ll/ܶ᩷֡;

    invoke-direct {v4, v3}, Ll/ܶ᩷֡;-><init>(Ljava/io/StringWriter;)V

    invoke-static {v0, v4}, Ll/ܰ۬ᩴ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 357
    invoke-virtual {v3}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 507
    array-length v3, v0

    int-to-long v3, v3

    invoke-virtual {v8, v3, v4}, Ll/֨᩷֡;->ۧ(J)V

    .line 508
    iget v3, v7, Ll/᩸᩷֡;->ۙ:I

    if-ne v3, v12, :cond_0

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    :goto_0
    invoke-virtual {v8, v11, v9, v10}, Ll/֨᩷֡;->֫([BLl/᩺᩷֡;Z)V

    .line 509
    invoke-direct {v7, v11}, Ll/᩸᩷֡;->ۧ([B)V

    .line 510
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֡()J

    move-result-wide v3

    iput-wide v3, v7, Ll/᩸᩷֡;->۫:J

    .line 511
    iput-wide v1, v7, Ll/᩸᩷֡;->ۗ:J

    .line 512
    iput-boolean v12, v7, Ll/᩸᩷֡;->ۤ:Z

    .line 513
    invoke-virtual {v7, v0}, Ljava/io/OutputStream;->write([B)V

    .line 514
    invoke-virtual/range {p0 .. p0}, Ll/᩸᩷֡;->ᩳ()V

    return-void

    .line 516
    :cond_1
    new-instance v15, Ljava/util/HashMap;

    invoke-direct {v15}, Ljava/util/HashMap;-><init>()V

    .line 517
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۘ()Ljava/lang/String;

    move-result-object v14

    const/16 v5, 0x4c

    const-string v6, "file name"

    const-string v4, "path"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v2, v14

    move-object v3, v15

    .line 518
    invoke-direct/range {v0 .. v6}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;BLjava/lang/String;)Z

    .line 519
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->᩷()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    .line 520
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    const/16 v5, 0x4b

    const-string v6, "link name"

    const-string v4, "linkpath"

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object v3, v15

    .line 521
    invoke-direct/range {v0 .. v6}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;BLjava/lang/String;)Z

    .line 523
    :cond_2
    iget v0, v7, Ll/᩸᩷֡;->ۙ:I

    const/4 v1, 0x2

    const-string v2, "mode"

    const-wide/32 v3, 0x1fffff

    if-ne v0, v1, :cond_6

    .line 262
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֡()J

    move-result-wide v0

    const-wide v17, 0x1ffffffffL

    const-string v5, "size"

    move-object v13, v15

    move-object v6, v14

    move-object v14, v5

    move-object v5, v15

    move-wide v15, v0

    invoke-static/range {v13 .. v18}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V

    .line 263
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۢ()J

    move-result-wide v15

    const-wide/32 v17, 0x1fffff

    const-string v14, "gid"

    move-object v13, v5

    invoke-static/range {v13 .. v18}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V

    .line 264
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۜ()Ll/ۙ۠ᩴ;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 237
    invoke-virtual {v0}, Ll/ۙ۠ᩴ;->toInstant()Ll/ۘ᩹ᩴ;

    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ll/ۘ᩹ᩴ;->getEpochSecond()J

    move-result-wide v14

    .line 239
    invoke-virtual {v0}, Ll/ۘ᩹ᩴ;->getNano()I

    move-result v0

    const-string v1, "mtime"

    if-nez v0, :cond_3

    const-wide v17, 0x1ffffffffL

    move-object v13, v5

    move-wide/from16 v19, v14

    move-object v14, v1

    move-wide/from16 v15, v19

    .line 241
    invoke-static/range {v13 .. v18}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V

    goto :goto_1

    :cond_3
    move-wide v13, v14

    .line 243
    invoke-static {v5, v1, v13, v14, v0}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JI)V

    :cond_4
    :goto_1
    const-string v0, "atime"

    .line 265
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->᩻()Ll/ۙ۠ᩴ;

    move-result-object v1

    invoke-static {v5, v0, v1}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;Ll/ۙ۠ᩴ;)V

    .line 266
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֨()Ll/ۙ۠ᩴ;

    move-result-object v0

    const-string v1, "ctime"

    if-eqz v0, :cond_5

    .line 267
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֨()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-static {v5, v1, v0}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;Ll/ۙ۠ᩴ;)V

    goto :goto_2

    .line 270
    :cond_5
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֫()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-static {v5, v1, v0}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;Ll/ۙ۠ᩴ;)V

    .line 272
    :goto_2
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۡ()J

    move-result-wide v15

    const-wide/32 v0, 0x1fffff

    const-string v14, "uid"

    move-object v13, v5

    move-wide/from16 v17, v0

    invoke-static/range {v13 .. v18}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V

    const-string v13, "LIBARCHIVE.creationtime"

    .line 274
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֫()Ll/ۙ۠ᩴ;

    move-result-object v14

    invoke-static {v5, v13, v14}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;Ll/ۙ۠ᩴ;)V

    .line 276
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ܽ()I

    move-result v13

    int-to-long v14, v13

    const-string v16, "SCHILY.devmajor"

    move-object v13, v5

    move-wide/from16 v17, v14

    move-object/from16 v14, v16

    move-wide/from16 v15, v17

    move-wide/from16 v17, v0

    invoke-static/range {v13 .. v18}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V

    .line 277
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ᩳ()I

    move-result v13

    int-to-long v14, v13

    const-string v16, "SCHILY.devminor"

    move-object v13, v5

    move-wide/from16 v17, v14

    move-object/from16 v14, v16

    move-wide/from16 v15, v17

    move-wide/from16 v17, v0

    invoke-static/range {v13 .. v18}, Ll/᩸᩷֡;->֫(Ljava/util/HashMap;Ljava/lang/String;JJ)V

    .line 279
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۖ()I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2, v0, v1, v3, v4}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    goto :goto_4

    :cond_6
    move-object v6, v14

    move-object v5, v15

    if-eq v0, v12, :cond_8

    const-string v0, "entry size"

    .line 372
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֡()J

    move-result-wide v13

    move-object v15, v11

    const-wide v10, 0x1ffffffffL

    invoke-static {v0, v13, v14, v10, v11}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    .line 373
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۢ()J

    move-result-wide v16

    const-wide/32 v18, 0x1fffff

    const-string v21, " Use STAR or POSIX extensions to overcome this limit"

    const-string v20, "group id"

    .line 382
    invoke-static/range {v16 .. v21}, Ll/᩸᩷֡;->֫(JJLjava/lang/String;Ljava/lang/String;)V

    .line 374
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۜ()Ll/ۙ۠ᩴ;

    move-result-object v0

    sget v13, Ll/ۜۢ֡;->֫:I

    .line 177
    sget v13, Ll/ᩳۢ֡;->֫:I

    if-eqz v0, :cond_7

    .line 282
    sget-object v13, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v13}, Ll/ۙ۠ᩴ;->to(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v13

    goto :goto_3

    :cond_7
    const-wide/16 v13, 0x0

    :goto_3
    const-string v0, "last modification time"

    .line 374
    invoke-static {v0, v13, v14, v10, v11}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    const-string v0, "user id"

    .line 375
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۡ()J

    move-result-wide v10

    invoke-static {v0, v10, v11, v3, v4}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    .line 376
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ۖ()I

    move-result v0

    int-to-long v10, v0

    invoke-static {v2, v10, v11, v3, v4}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    .line 377
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ܽ()I

    move-result v0

    int-to-long v10, v0

    const-string v0, "major device number"

    invoke-static {v0, v10, v11, v3, v4}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    .line 378
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ᩳ()I

    move-result v0

    int-to-long v10, v0

    const-string v0, "minor device number"

    invoke-static {v0, v10, v11, v3, v4}, Ll/᩸᩷֡;->֫(Ljava/lang/String;JJ)V

    goto :goto_5

    :cond_8
    :goto_4
    move-object v15, v11

    .line 538
    :goto_5
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->ܿ()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    .line 540
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_d

    .line 668
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "./PaxHeaders.X/"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 611
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v2

    .line 612
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v2, :cond_b

    .line 614
    invoke-virtual {v6, v4}, Ljava/lang/String;->charAt(I)C

    move-result v10

    and-int/lit8 v10, v10, 0x7f

    int-to-char v10, v10

    if-eqz v10, :cond_a

    const/16 v11, 0x2f

    if-eq v10, v11, :cond_a

    const/16 v11, 0x5c

    if-ne v10, v11, :cond_9

    goto :goto_7

    .line 618
    :cond_9
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_a
    :goto_7
    const-string v10, "_"

    .line 616
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    .line 621
    :cond_b
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 668
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 669
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v3, 0x64

    if-lt v2, v3, :cond_c

    const/16 v2, 0x63

    const/4 v1, 0x0

    .line 670
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_9

    :cond_c
    const/4 v1, 0x0

    .line 672
    :goto_9
    new-instance v2, Ll/֨᩷֡;

    const/16 v3, 0x78

    invoke-direct {v2, v3, v0}, Ll/֨᩷֡;-><init>(BLjava/lang/String;)V

    .line 673
    invoke-static {v8, v2}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;Ll/֨᩷֡;)V

    .line 339
    new-instance v0, Ljava/io/StringWriter;

    invoke-direct {v0}, Ljava/io/StringWriter;-><init>()V

    .line 340
    new-instance v3, Ll/ܶ᩷֡;

    invoke-direct {v3, v0}, Ll/ܶ᩷֡;-><init>(Ljava/io/StringWriter;)V

    invoke-static {v5, v3}, Ll/ܰ۬ᩴ;->forEach(Ljava/util/Map;Ljava/util/function/BiConsumer;)V

    .line 357
    invoke-virtual {v0}, Ljava/io/StringWriter;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 676
    array-length v3, v0

    int-to-long v3, v3

    invoke-virtual {v2, v3, v4}, Ll/֨᩷֡;->ۧ(J)V

    .line 677
    invoke-virtual {v7, v2}, Ll/᩸᩷֡;->֫(Ll/֨᩷֡;)V

    .line 678
    invoke-virtual {v7, v0}, Ljava/io/OutputStream;->write([B)V

    .line 679
    invoke-virtual/range {p0 .. p0}, Ll/᩸᩷֡;->ᩳ()V

    goto :goto_a

    :cond_d
    const/4 v1, 0x0

    .line 544
    :goto_a
    iget v0, v7, Ll/᩸᩷֡;->ۙ:I

    if-ne v0, v12, :cond_e

    const/4 v10, 0x1

    move-object v0, v15

    goto :goto_b

    :cond_e
    move-object v0, v15

    const/4 v10, 0x0

    :goto_b
    invoke-virtual {v8, v0, v9, v10}, Ll/֨᩷֡;->֫([BLl/᩺᩷֡;Z)V

    .line 545
    invoke-direct {v7, v0}, Ll/᩸᩷֡;->ۧ([B)V

    const-wide/16 v0, 0x0

    .line 547
    iput-wide v0, v7, Ll/᩸᩷֡;->ۗ:J

    .line 549
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->᩸()Z

    move-result v2

    if-eqz v2, :cond_f

    .line 550
    iput-wide v0, v7, Ll/᩸᩷֡;->۫:J

    goto :goto_c

    .line 552
    :cond_f
    invoke-virtual/range {p1 .. p1}, Ll/֨᩷֡;->֡()J

    move-result-wide v0

    iput-wide v0, v7, Ll/᩸᩷֡;->۫:J

    .line 554
    :goto_c
    iput-object v6, v7, Ll/᩸᩷֡;->۬:Ljava/lang/String;

    .line 555
    iput-boolean v12, v7, Ll/᩸᩷֡;->ۤ:Z

    return-void
.end method

.method public final ܳ()V
    .locals 1

    const/4 v0, 0x1

    .line 586
    iput v0, p0, Ll/᩸᩷֡;->ۙ:I

    return-void
.end method

.method public final ᩳ()V
    .locals 8

    .line 309
    invoke-virtual {p0}, Ll/֡᩷֡;->֫()V

    .line 310
    iget-boolean v0, p0, Ll/᩸᩷֡;->ۤ:Z

    if-eqz v0, :cond_2

    .line 313
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    check-cast v0, Ll/ܳۢ֡;

    invoke-virtual {v0}, Ll/ܳۢ֡;->֫()V

    .line 314
    iget-wide v0, p0, Ll/᩸᩷֡;->ۗ:J

    iget-wide v2, p0, Ll/᩸᩷֡;->۫:J

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    .line 318
    iget-wide v0, p0, Ll/᩸᩷֡;->ܰ:J

    const-wide/16 v4, 0x200

    div-long v6, v2, v4

    add-long/2addr v6, v0

    iput-wide v6, p0, Ll/᩸᩷֡;->ܰ:J

    const-wide/16 v0, 0x0

    .line 320
    rem-long/2addr v2, v4

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const-wide/16 v0, 0x1

    add-long/2addr v6, v0

    .line 321
    iput-wide v6, p0, Ll/᩸᩷֡;->ܰ:J

    :cond_0
    const/4 v0, 0x0

    .line 323
    iput-boolean v0, p0, Ll/᩸᩷֡;->ۤ:Z

    return-void

    .line 315
    :cond_1
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Entry \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Ll/᩸᩷֡;->۬:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' closed at \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/᩸᩷֡;->ۗ:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, "\' before the \'"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Ll/᩸᩷֡;->۫:J

    const-string v4, "\' bytes specified in the header were written"

    .line 0
    invoke-static {v1, v2, v3, v4}, Ll/ܺ۫᩷;->֫(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 315
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 311
    :cond_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "No current entry to close"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ᩻()V
    .locals 1

    const/4 v0, 0x2

    .line 596
    iput v0, p0, Ll/᩸᩷֡;->ۛ:I

    return-void
.end method
