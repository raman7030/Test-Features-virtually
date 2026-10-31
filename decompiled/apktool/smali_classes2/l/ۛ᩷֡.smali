.class public final Ll/ۛ᩷֡;
.super Ljava/lang/Object;
.source "9AHH"


# static fields
.field public static final synthetic ֫:I

.field public static final ۧ:Ll/᩺᩷֡;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 51
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩷֡;->֫(Ljava/nio/charset/Charset;)Ll/᩺᩷֡;

    move-result-object v0

    sput-object v0, Ll/ۛ᩷֡;->ۧ:Ll/᩺᩷֡;

    return-void
.end method

.method public static ֫(Ljava/lang/String;[BIILl/᩺᩷֡;)I
    .locals 3

    .line 216
    invoke-interface {p4, p0}, Ll/᩺᩷֡;->֫(Ljava/lang/String;)[B

    move-result-object v0

    .line 217
    :goto_0
    array-length v1, v0

    const/4 v2, 0x0

    if-le v1, p3, :cond_0

    const/4 v0, 0x1

    .line 0
    invoke-static {v0, v2, p0}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 219
    invoke-interface {p4, p0}, Ll/᩺᩷֡;->֫(Ljava/lang/String;)[B

    move-result-object v0

    goto :goto_0

    .line 221
    :cond_0
    array-length p0, v0

    invoke-static {v0, v2, p1, p2, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 222
    array-length p0, v0

    :goto_1
    if-ge p0, p3, :cond_1

    add-int p4, p2, p0

    .line 223
    aput-byte v2, p1, p4

    add-int/lit8 p0, p0, 0x1

    goto :goto_1

    :cond_1
    add-int/2addr p2, p3

    return p2
.end method

.method public static ֫(II[B)J
    .locals 7

    add-int v0, p0, p1

    const/4 v1, 0x2

    if-lt p1, v1, :cond_7

    .line 413
    aget-byte v1, p2, p0

    const-wide/16 v2, 0x0

    if-nez v1, :cond_0

    return-wide v2

    :cond_0
    move v1, p0

    :goto_0
    const/16 v4, 0x20

    if-ge v1, v0, :cond_2

    .line 418
    aget-byte v5, p2, v1

    if-eq v5, v4, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    add-int/lit8 v5, v0, -0x1

    .line 427
    aget-byte v5, p2, v5

    :goto_2
    if-ge v1, v0, :cond_4

    if-eqz v5, :cond_3

    if-ne v5, v4, :cond_4

    :cond_3
    add-int/lit8 v5, v0, -0x1

    add-int/lit8 v0, v0, -0x2

    .line 430
    aget-byte v0, p2, v0

    move v6, v5

    move v5, v0

    move v0, v6

    goto :goto_2

    :cond_4
    :goto_3
    if-ge v1, v0, :cond_6

    .line 433
    aget-byte v4, p2, v1

    const/16 v5, 0x30

    if-lt v4, v5, :cond_5

    const/16 v5, 0x37

    if-gt v4, v5, :cond_5

    const/4 v5, 0x3

    shl-long/2addr v2, v5

    add-int/lit8 v4, v4, -0x30

    int-to-long v4, v4

    add-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    .line 436
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 80
    new-instance v2, Ljava/lang/String;

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v3

    invoke-direct {v2, p2, p0, p1, v3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    const-string p2, "\u0000"

    const-string v3, "{NUL}"

    .line 82
    invoke-virtual {v2, p2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "Invalid byte "

    const-string v3, " at offset "

    .line 0
    invoke-static {v4, v2, v3}, Ll/۬᩵ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    sub-int/2addr v1, p0

    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, " in \'"

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\' len="

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 436
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    return-wide v2

    .line 411
    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "Length "

    const-string v0, " must be at least 2"

    .line 0
    invoke-static {p1, p2, v0}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 411
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫([BIILl/᩺᩷֡;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x0

    move v1, p1

    :goto_0
    if-ge v0, p2, :cond_0

    .line 376
    aget-byte v2, p0, v1

    if-eqz v2, :cond_0

    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    .line 380
    invoke-interface {p3, p1, v0, p0}, Ll/᩺᩷֡;->֫(II[B)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    const-string p0, ""

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;I)Ljava/util/ArrayList;
    .locals 16

    .line 503
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 505
    invoke-static/range {p0 .. p0}, Ll/ۛ᩷֡;->֫(Ljava/io/InputStream;)[J

    move-result-object v1

    const/4 v2, 0x0

    .line 506
    aget-wide v3, v1, v2

    const-wide/16 v5, 0x0

    cmp-long v7, v3, v5

    if-ltz v7, :cond_3

    const/4 v7, 0x1

    .line 511
    aget-wide v8, v1, v7

    :goto_0
    const-wide/16 v10, 0x1

    sub-long v10, v3, v10

    cmp-long v1, v3, v5

    if-lez v1, :cond_2

    .line 513
    invoke-static/range {p0 .. p0}, Ll/ۛ᩷֡;->֫(Ljava/io/InputStream;)[J

    move-result-object v1

    .line 514
    aget-wide v3, v1, v2

    cmp-long v12, v3, v5

    if-ltz v12, :cond_1

    .line 518
    aget-wide v12, v1, v7

    add-long/2addr v8, v12

    .line 520
    invoke-static/range {p0 .. p0}, Ll/ۛ᩷֡;->֫(Ljava/io/InputStream;)[J

    move-result-object v1

    .line 521
    aget-wide v12, v1, v2

    cmp-long v14, v12, v5

    if-ltz v14, :cond_0

    .line 525
    aget-wide v14, v1, v7

    add-long/2addr v8, v14

    .line 526
    new-instance v1, Ll/ۙ᩷֡;

    invoke-direct {v1, v3, v4, v12, v13}, Ll/ۙ᩷֡;-><init>(JJ)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide v3, v10

    goto :goto_0

    .line 523
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Corrupted TAR archive. Sparse header block numbytes contains negative value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 516
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Corrupted TAR archive. Sparse header block offset contains negative value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    move/from16 v1, p1

    int-to-long v1, v1

    .line 530
    rem-long/2addr v8, v1

    sub-long v3, v1, v8

    rem-long/2addr v3, v1

    move-object/from16 v1, p0

    .line 531
    invoke-static {v3, v4, v1}, Ll/᩹ۢ֡;->֫(JLjava/io/InputStream;)J

    return-object v0

    .line 509
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Corrupted TAR archive. Negative value in sparse headers block"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ljava/io/InputStream;Ljava/util/ArrayList;Ljava/util/HashMap;J)Ljava/util/HashMap;
    .locals 15

    move-object/from16 v0, p1

    .line 594
    new-instance v1, Ljava/util/HashMap;

    move-object/from16 v2, p2

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    :cond_0
    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 602
    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v6

    const/4 v7, -0x1

    const-wide/16 v8, 0x0

    if-eq v6, v7, :cond_12

    const/4 v10, 0x1

    add-int/2addr v4, v10

    add-int/lit8 v2, v2, 0x1

    const/16 v11, 0xa

    if-ne v6, v11, :cond_1

    const/4 v4, -0x1

    move-object v13, p0

    goto/16 :goto_8

    :cond_1
    const/16 v12, 0x20

    if-ne v6, v12, :cond_10

    .line 610
    new-instance v6, Ll/ۨۡ֡;

    invoke-direct {v6}, Ll/ۨۡ֡;-><init>()V

    .line 611
    :goto_1
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v12

    if-eq v12, v7, :cond_e

    add-int/2addr v4, v10

    add-int/lit8 v2, v2, 0x1

    if-ltz v2, :cond_e

    cmp-long v7, p3, v8

    if-ltz v7, :cond_2

    int-to-long v8, v2

    cmp-long v13, v8, p3

    if-ltz v13, :cond_2

    goto/16 :goto_5

    :cond_2
    const/16 v8, 0x3d

    if-ne v12, v8, :cond_d

    .line 618
    sget-object v8, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 303
    new-instance v9, Ljava/lang/String;

    invoke-virtual {v6}, Ll/ۨۡ֡;->֫()[B

    move-result-object v6

    invoke-direct {v9, v6, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sub-int/2addr v5, v4

    if-gt v5, v10, :cond_3

    .line 622
    invoke-virtual {v1, v9}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_5

    :cond_3
    if-ltz v7, :cond_5

    int-to-long v6, v5

    int-to-long v13, v2

    sub-long v13, p3, v13

    cmp-long v4, v6, v13

    if-gtz v4, :cond_4

    goto :goto_2

    .line 624
    :cond_4
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Paxheader value size "

    const-string v2, " exceeds size of header record"

    .line 0
    invoke-static {v5, v1, v2}, Ll/ᩳ᩷ᩳ;->֫(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 624
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 237
    :cond_5
    :goto_2
    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V

    int-to-long v6, v5

    move-object v13, p0

    .line 238
    invoke-static {p0, v4, v6, v7}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;Ljava/io/ByteArrayOutputStream;J)V

    .line 239
    invoke-virtual {v4}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    .line 627
    array-length v6, v4

    if-ne v6, v5, :cond_c

    add-int/2addr v2, v5

    add-int/lit8 v5, v5, -0x1

    .line 633
    aget-byte v6, v4, v5

    if-ne v6, v11, :cond_b

    .line 636
    new-instance v6, Ljava/lang/String;

    const/4 v7, 0x0

    invoke-direct {v6, v4, v7, v5, v8}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 637
    invoke-virtual {v1, v9, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "GNU.sparse.offset"

    .line 640
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    if-eqz v3, :cond_6

    .line 643
    new-instance v4, Ll/ۙ᩷֡;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    const-wide/16 v10, 0x0

    invoke-direct {v4, v7, v8, v10, v11}, Ll/ۙ᩷֡;-><init>(JJ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    const-wide/16 v10, 0x0

    .line 646
    :goto_3
    :try_start_0
    invoke-static {v6}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 650
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v7, v4, v10

    if-ltz v7, :cond_7

    goto :goto_4

    .line 651
    :cond_7
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader.GNU.sparse.offset contains negative value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 648
    :catch_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader.GNU.sparse.offset contains a non-numeric value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_4
    const-string v4, "GNU.sparse.numbytes"

    .line 656
    invoke-virtual {v9, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    if-eqz v3, :cond_a

    .line 661
    invoke-static {v6}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v8, v4, v6

    if-ltz v8, :cond_9

    .line 665
    new-instance v6, Ll/ۙ᩷֡;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    invoke-direct {v6, v7, v8, v4, v5}, Ll/ۙ᩷֡;-><init>(JJ)V

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    goto :goto_6

    .line 663
    :cond_9
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader.GNU.sparse.numbytes contains negative value"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 658
    :cond_a
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader.GNU.sparse.offset is expected before GNU.sparse.numbytes shows up."

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 634
    :cond_b
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader.Value should end with a newline"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 629
    :cond_c
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader. Expected "

    const-string v2, " bytes, read "

    .line 0
    invoke-static {v1, v5, v6, v2}, Ll/ᩳ᩷ᩳ;->֫(Ljava/lang/String;IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 629
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    move-object v13, p0

    int-to-byte v7, v12

    .line 671
    invoke-virtual {v6, v7}, Ll/ۨۡ֡;->write(I)V

    const/4 v7, -0x1

    const-wide/16 v8, 0x0

    goto/16 :goto_1

    :cond_e
    :goto_5
    move-object v13, p0

    :cond_f
    :goto_6
    move v6, v12

    goto :goto_7

    :cond_10
    move-object v13, p0

    const/16 v7, 0x30

    if-lt v6, v7, :cond_11

    const/16 v7, 0x39

    if-gt v6, v7, :cond_11

    mul-int/lit8 v5, v5, 0xa

    add-int/lit8 v6, v6, -0x30

    add-int/2addr v5, v6

    goto/16 :goto_0

    .line 677
    :cond_11
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Failed to read Paxheader. Encountered a non-number while reading length"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move-object v13, p0

    :goto_7
    const/4 v4, -0x1

    :goto_8
    if-ne v6, v4, :cond_0

    if-eqz v3, :cond_13

    .line 688
    new-instance v2, Ll/ۙ᩷֡;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-direct {v2, v3, v4, v5, v6}, Ll/ۙ᩷֡;-><init>(JJ)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_13
    return-object v1
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/List;
    .locals 9

    .line 332
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const-string v1, ","

    .line 333
    invoke-virtual {p0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p0

    .line 334
    array-length v1, p0

    rem-int/lit8 v1, v1, 0x2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_3

    const/4 v1, 0x0

    .line 337
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_2

    .line 338
    aget-object v2, p0, v1

    invoke-static {v2}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-ltz v6, :cond_1

    add-int/lit8 v6, v1, 0x1

    .line 342
    aget-object v6, p0, v6

    invoke-static {v6}, Ll/᩻ۢ֡;->ۧ(Ljava/lang/String;)J

    move-result-wide v6

    cmp-long v8, v6, v4

    if-ltz v8, :cond_0

    .line 346
    new-instance v4, Ll/ۙ᩷֡;

    invoke-direct {v4, v2, v3, v6, v7}, Ll/ۙ᩷֡;-><init>(JJ)V

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    .line 344
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Sparse struct numbytes contains negative value"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 340
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Sparse struct offset contains negative value"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 348
    :cond_2
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 335
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Bad format in GNU.sparse.map PAX Header"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(J[BII)V
    .locals 9

    add-int/lit8 v0, p4, -0x1

    const/16 v1, 0x30

    const-wide/16 v2, 0x0

    cmp-long v4, p0, v2

    if-nez v4, :cond_0

    add-int/lit8 p4, p4, -0x2

    add-int/2addr v0, p3

    .line 261
    aput-byte v1, p2, v0

    goto :goto_1

    :cond_0
    move-wide v4, p0

    :goto_0
    if-ltz v0, :cond_1

    cmp-long v6, v4, v2

    if-eqz v6, :cond_1

    add-int v6, p3, v0

    const-wide/16 v7, 0x7

    and-long/2addr v7, v4

    long-to-int v8, v7

    int-to-byte v7, v8

    add-int/2addr v7, v1

    int-to-byte v7, v7

    .line 266
    aput-byte v7, p2, v6

    const/4 v6, 0x3

    ushr-long/2addr v4, v6

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    cmp-long v6, v4, v2

    if-nez v6, :cond_3

    move p4, v0

    :goto_1
    if-ltz p4, :cond_2

    add-int p0, p3, p4

    .line 276
    aput-byte v1, p2, p0

    add-int/lit8 p4, p4, -0x1

    goto :goto_1

    :cond_2
    return-void

    .line 271
    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0, p1}, Ljava/lang/Long;->toOctalString(J)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " will not fit in octal number buffer of length "

    invoke-virtual {p3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ֫(Ljava/io/InputStream;)[J
    .locals 8

    const-wide/16 v0, 0x0

    move-wide v2, v0

    .line 719
    :goto_0
    invoke-virtual {p0}, Ljava/io/InputStream;->read()I

    move-result v4

    const/16 v5, 0xa

    const-wide/16 v6, 0x1

    if-eq v4, v5, :cond_2

    add-long/2addr v0, v6

    const/4 v5, -0x1

    if-eq v4, v5, :cond_1

    const/16 v5, 0x30

    if-lt v4, v5, :cond_0

    const/16 v5, 0x39

    if-gt v4, v5, :cond_0

    const-wide/16 v5, 0xa

    mul-long v2, v2, v5

    add-int/lit8 v4, v4, -0x30

    int-to-long v4, v4

    add-long/2addr v2, v4

    goto :goto_0

    .line 725
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Corrupted TAR archive. Non-numeric value in sparse headers block"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 722
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Unexpected EOF when reading parse information of 1.X PAX format"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    add-long/2addr v0, v6

    const/4 p0, 0x2

    new-array p0, p0, [J

    const/4 v4, 0x0

    aput-wide v2, p0, v4

    const/4 v2, 0x1

    aput-wide v0, p0, v2

    return-object p0
.end method

.method public static ۧ(II[B)J
    .locals 8

    .line 457
    aget-byte v0, p2, p0

    and-int/lit16 v1, v0, 0x80

    if-nez v1, :cond_0

    .line 458
    invoke-static {p0, p1, p2}, Ll/ۛ᩷֡;->֫(II[B)J

    move-result-wide p0

    return-wide p0

    :cond_0
    const/4 v1, -0x1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-string v1, " byte binary number exceeds maximum signed long value"

    const-string v3, ", "

    const-string v4, "At offset "

    const/16 v5, 0x9

    if-ge p1, v5, :cond_6

    if-ge p1, v5, :cond_5

    const-wide/16 v1, 0x0

    const/4 v3, 0x1

    :goto_1
    if-ge v3, p1, :cond_2

    const/16 v4, 0x8

    shl-long/2addr v1, v4

    add-int v4, p0, v3

    .line 300
    aget-byte v4, p2, v4

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    add-long/2addr v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_2
    if-eqz v0, :cond_3

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    add-int/lit8 p1, p1, -0x1

    int-to-double p0, p1

    const-wide/high16 v5, 0x4020000000000000L    # 8.0

    mul-double p0, p0, v5

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    .line 305
    invoke-static {v5, v6, p0, p1}, Ljava/lang/Math;->pow(DD)D

    move-result-wide p0

    double-to-long p0, p0

    sub-long/2addr p0, v3

    xor-long/2addr v1, p0

    :cond_3
    if-eqz v0, :cond_4

    neg-long p0, v1

    return-wide p0

    :cond_4
    return-wide v1

    .line 296
    :cond_5
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 0
    invoke-static {v4, p0, v3, v1, p1}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 296
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    add-int/lit8 v5, p1, -0x1

    .line 281
    new-array v6, v5, [B

    add-int/lit8 v7, p0, 0x1

    .line 282
    invoke-static {p2, v7, v6, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 283
    new-instance p2, Ljava/math/BigInteger;

    invoke-direct {p2, v6}, Ljava/math/BigInteger;-><init>([B)V

    if-eqz v0, :cond_7

    const-wide/16 v5, -0x1

    .line 286
    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object p2

    invoke-virtual {p2}, Ljava/math/BigInteger;->not()Ljava/math/BigInteger;

    move-result-object p2

    .line 288
    :cond_7
    invoke-virtual {p2}, Ljava/math/BigInteger;->bitLength()I

    move-result v2

    const/16 v5, 0x3f

    if-gt v2, v5, :cond_9

    .line 291
    invoke-virtual {p2}, Ljava/math/BigInteger;->longValue()J

    move-result-wide p0

    if-eqz v0, :cond_8

    neg-long p0, p0

    :cond_8
    return-wide p0

    .line 289
    :cond_9
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 0
    invoke-static {v4, p0, v3, v1, p1}, Ll/᩵ۢ֡;->֫(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    .line 289
    invoke-direct {p2, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static ܽ(II[B)Ljava/util/List;
    .locals 8

    .line 737
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p1, :cond_2

    mul-int/lit8 v2, v1, 0x18

    add-int/2addr v2, p0

    const/16 v3, 0xc

    .line 702
    :try_start_0
    invoke-static {v2, v3, p2}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v4

    add-int/lit8 v2, v2, 0xc

    .line 703
    invoke-static {v2, v3, p2}, Ll/ۛ᩷֡;->ۧ(II[B)J

    move-result-wide v2

    .line 704
    new-instance v6, Ll/ۙ᩷֡;

    invoke-direct {v6, v4, v5, v2, v3}, Ll/ۙ᩷֡;-><init>(JJ)V

    .line 742
    invoke-virtual {v6}, Ll/ۙ᩷֡;->ۧ()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v7, v2, v4

    if-ltz v7, :cond_1

    .line 745
    invoke-virtual {v6}, Ll/ۙ᩷֡;->֫()J

    move-result-wide v2

    cmp-long v7, v2, v4

    if-ltz v7, :cond_0

    .line 748
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 746
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Corrupted TAR archive, sparse entry with negative numbytes"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 743
    :cond_1
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Corrupted TAR archive, sparse entry with negative offset"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception p0

    .line 751
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Corrupted TAR archive, sparse entry is invalid"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 754
    :cond_2
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
