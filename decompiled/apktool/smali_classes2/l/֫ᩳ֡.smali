.class public final Ll/֫ᩳ֡;
.super Ljava/lang/Object;
.source "Z4CY"

# interfaces
.implements Ll/֨ᩳ֡;


# instance fields
.field public final ۗ:Ll/ۛܽ֡;

.field public ۙ:I

.field public final ᩶:Ll/ۧᩳ֡;

.field public final ᩸:Ljava/util/zip/CRC32;

.field public final ᩹:Ljava/util/zip/Inflater;


# direct methods
.method public constructor <init>(Ll/֨ᩳ֡;)V
    .locals 2

    .line 60
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 39
    iput v0, p0, Ll/֫ᩳ֡;->ۙ:I

    .line 58
    new-instance v0, Ljava/util/zip/CRC32;

    invoke-direct {v0}, Ljava/util/zip/CRC32;-><init>()V

    iput-object v0, p0, Ll/֫ᩳ֡;->᩸:Ljava/util/zip/CRC32;

    if-eqz p1, :cond_0

    .line 62
    new-instance v0, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object v0, p0, Ll/֫ᩳ֡;->᩹:Ljava/util/zip/Inflater;

    .line 63
    sget v1, Ll/᩻ᩳ֡;->֫:I

    .line 51
    new-instance v1, Ll/ۘᩳ֡;

    invoke-direct {v1, p1}, Ll/ۘᩳ֡;-><init>(Ll/֨ᩳ֡;)V

    .line 63
    iput-object v1, p0, Ll/֫ᩳ֡;->ۗ:Ll/ۛܽ֡;

    .line 64
    new-instance p1, Ll/ۧᩳ֡;

    invoke-direct {p1, v1, v0}, Ll/ۧᩳ֡;-><init>(Ll/ۛܽ֡;Ljava/util/zip/Inflater;)V

    iput-object p1, p0, Ll/֫ᩳ֡;->᩶:Ll/ۧᩳ֡;

    return-void

    .line 61
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "source == null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static ֫(IILjava/lang/String;)V
    .locals 3

    if-ne p1, p0, :cond_0

    return-void

    .line 205
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 206
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    const/4 p2, 0x1

    aput-object p1, v1, p2

    const/4 p1, 0x2

    aput-object p0, v1, p1

    const-string p0, "%s: actual 0x%08x != expected 0x%08x"

    .line 205
    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private ֫(Ll/۫ܽ֡;JJ)V
    .locals 5

    .line 188
    iget-object p1, p1, Ll/۫ܽ֡;->᩸:Ll/ᩴᩳ֡;

    .line 189
    :goto_0
    iget v0, p1, Ll/ᩴᩳ֡;->ۧ:I

    iget v1, p1, Ll/ᩴᩳ֡;->ܿ:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v4, p2, v2

    if-ltz v4, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    goto :goto_0

    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    .line 195
    iget v2, p1, Ll/ᩴᩳ֡;->ܿ:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    .line 196
    iget p3, p1, Ll/ᩴᩳ֡;->ۧ:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    .line 197
    iget-object v2, p0, Ll/֫ᩳ֡;->᩸:Ljava/util/zip/CRC32;

    iget-object v3, p1, Ll/ᩴᩳ֡;->֫:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    .line 194
    iget-object p1, p1, Ll/ᩴᩳ֡;->ܽ:Ll/ᩴᩳ֡;

    move-wide p2, v0

    goto :goto_1

    :cond_1
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 182
    iget-object v0, p0, Ll/֫ᩳ֡;->᩶:Ll/ۧᩳ֡;

    invoke-virtual {v0}, Ll/ۧᩳ֡;->close()V

    return-void
.end method

.method public final ۢ()Ll/ܶᩳ֡;
    .locals 1

    .line 178
    iget-object v0, p0, Ll/֫ᩳ֡;->ۗ:Ll/ۛܽ֡;

    check-cast v0, Ll/ۘᩳ֡;

    .line 473
    iget-object v0, v0, Ll/ۘᩳ֡;->᩶:Ll/֨ᩳ֡;

    invoke-interface {v0}, Ll/֨ᩳ֡;->ۢ()Ll/ܶᩳ֡;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/۫ܽ֡;J)J
    .locals 25

    move-object/from16 v6, p0

    move-object/from16 v7, p1

    .line 72
    iget v0, v6, Ll/֫ᩳ֡;->ۙ:I

    iget-object v8, v6, Ll/֫ᩳ֡;->᩸:Ljava/util/zip/CRC32;

    const/4 v9, 0x1

    iget-object v10, v6, Ll/֫ᩳ֡;->ۗ:Ll/ۛܽ֡;

    const-wide/16 v11, -0x1

    if-nez v0, :cond_c

    .line 114
    move-object v15, v10

    check-cast v15, Ll/ۘᩳ֡;

    const-wide/16 v0, 0xa

    invoke-virtual {v15, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    iget-object v14, v15, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    const-wide/16 v0, 0x3

    .line 115
    invoke-virtual {v14, v0, v1}, Ll/۫ܽ֡;->ۧ(J)B

    move-result v19

    shr-int/lit8 v0, v19, 0x1

    and-int/2addr v0, v9

    if-ne v0, v9, :cond_0

    const/4 v0, 0x1

    const/16 v20, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    const/16 v20, 0x0

    :goto_0
    if-eqz v20, :cond_1

    .line 38
    iget-object v1, v15, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    move-object/from16 v0, p0

    .line 117
    invoke-direct/range {v0 .. v5}, Ll/֫ᩳ֡;->֫(Ll/۫ܽ֡;JJ)V

    .line 119
    :cond_1
    invoke-virtual {v15}, Ll/ۘᩳ֡;->readShort()S

    move-result v0

    const-string v1, "ID1ID2"

    const/16 v2, 0x1f8b

    .line 120
    invoke-static {v2, v0, v1}, Ll/֫ᩳ֡;->֫(IILjava/lang/String;)V

    const-wide/16 v0, 0x8

    .line 121
    invoke-virtual {v15, v0, v1}, Ll/ۘᩳ֡;->skip(J)V

    shr-int/lit8 v0, v19, 0x2

    and-int/2addr v0, v9

    const-wide/16 v4, 0x2

    if-ne v0, v9, :cond_4

    .line 128
    invoke-virtual {v15, v4, v5}, Ll/ۘᩳ֡;->ܿ(J)V

    if-eqz v20, :cond_2

    .line 38
    iget-object v1, v15, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    const-wide/16 v2, 0x0

    const-wide/16 v16, 0x2

    const v13, 0xff00

    move-object/from16 v0, p0

    move-wide/from16 v4, v16

    .line 129
    invoke-direct/range {v0 .. v5}, Ll/֫ᩳ֡;->֫(Ll/۫ܽ֡;JJ)V

    goto :goto_1

    :cond_2
    const v13, 0xff00

    .line 414
    :goto_1
    invoke-virtual {v14}, Ll/۫ܽ֡;->readShort()S

    move-result v0

    sget-object v1, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    and-int v1, v0, v13

    ushr-int/lit8 v1, v1, 0x8

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    int-to-short v0, v0

    int-to-long v4, v0

    .line 131
    invoke-virtual {v15, v4, v5}, Ll/ۘᩳ֡;->ܿ(J)V

    if-eqz v20, :cond_3

    .line 38
    iget-object v1, v15, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide/from16 p2, v4

    .line 132
    invoke-direct/range {v0 .. v5}, Ll/֫ᩳ֡;->֫(Ll/۫ܽ֡;JJ)V

    move-wide/from16 v0, p2

    goto :goto_2

    :cond_3
    move-wide v0, v4

    .line 133
    :goto_2
    invoke-virtual {v15, v0, v1}, Ll/ۘᩳ֡;->skip(J)V

    move/from16 v21, v13

    goto :goto_3

    :cond_4
    const v13, 0xff00

    const v21, 0xff00

    :goto_3
    shr-int/lit8 v0, v19, 0x3

    and-int/2addr v0, v9

    const-wide/16 v22, 0x1

    if-ne v0, v9, :cond_7

    const-wide/16 v0, 0x0

    const-wide v17, 0x7fffffffffffffffL

    const/4 v2, 0x0

    move-object v13, v15

    move-object/from16 v24, v14

    move v14, v2

    move-object v4, v15

    move-wide v15, v0

    .line 333
    invoke-virtual/range {v13 .. v18}, Ll/ۘᩳ֡;->֫(BJJ)J

    move-result-wide v13

    cmp-long v0, v13, v11

    if-eqz v0, :cond_6

    if-eqz v20, :cond_5

    .line 38
    iget-object v1, v4, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    const-wide/16 v2, 0x0

    add-long v15, v13, v22

    move-object/from16 v0, p0

    move-object v11, v4

    move-wide v4, v15

    .line 143
    invoke-direct/range {v0 .. v5}, Ll/֫ᩳ֡;->֫(Ll/۫ܽ֡;JJ)V

    goto :goto_4

    :cond_5
    move-object v11, v4

    :goto_4
    add-long v13, v13, v22

    .line 144
    invoke-virtual {v11, v13, v14}, Ll/ۘᩳ֡;->skip(J)V

    goto :goto_5

    .line 142
    :cond_6
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_7
    move-object/from16 v24, v14

    move-object v11, v15

    :goto_5
    shr-int/lit8 v0, v19, 0x4

    and-int/2addr v0, v9

    if-ne v0, v9, :cond_a

    const-wide/16 v15, 0x0

    const-wide v17, 0x7fffffffffffffffL

    const/4 v14, 0x0

    move-object v13, v11

    .line 333
    invoke-virtual/range {v13 .. v18}, Ll/ۘᩳ֡;->֫(BJJ)J

    move-result-wide v12

    const-wide/16 v0, -0x1

    cmp-long v2, v12, v0

    if-eqz v2, :cond_9

    if-eqz v20, :cond_8

    .line 38
    iget-object v1, v11, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    const-wide/16 v2, 0x0

    add-long v4, v12, v22

    move-object/from16 v0, p0

    .line 154
    invoke-direct/range {v0 .. v5}, Ll/֫ᩳ֡;->֫(Ll/۫ܽ֡;JJ)V

    :cond_8
    add-long v12, v12, v22

    .line 155
    invoke-virtual {v11, v12, v13}, Ll/ۘᩳ֡;->skip(J)V

    goto :goto_6

    .line 153
    :cond_9
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_a
    :goto_6
    if-eqz v20, :cond_b

    const-wide/16 v0, 0x2

    .line 260
    invoke-virtual {v11, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 414
    invoke-virtual/range {v24 .. v24}, Ll/۫ܽ֡;->readShort()S

    move-result v0

    sget-object v1, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    and-int v1, v0, v21

    ushr-int/lit8 v1, v1, 0x8

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    int-to-short v0, v0

    .line 163
    invoke-virtual {v8}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v2, v1

    int-to-short v1, v2

    const-string v2, "FHCRC"

    invoke-static {v0, v1, v2}, Ll/֫ᩳ֡;->֫(IILjava/lang/String;)V

    .line 164
    invoke-virtual {v8}, Ljava/util/zip/CRC32;->reset()V

    .line 74
    :cond_b
    iput v9, v6, Ll/֫ᩳ֡;->ۙ:I

    goto :goto_7

    :cond_c
    const v21, 0xff00

    .line 78
    :goto_7
    iget v0, v6, Ll/֫ᩳ֡;->ۙ:I

    const/4 v1, 0x2

    if-ne v0, v9, :cond_e

    .line 79
    iget-wide v2, v7, Ll/۫ܽ֡;->᩹:J

    .line 80
    iget-object v0, v6, Ll/֫ᩳ֡;->᩶:Ll/ۧᩳ֡;

    const-wide/16 v4, 0x2000

    invoke-virtual {v0, v7, v4, v5}, Ll/ۧᩳ֡;->ۧ(Ll/۫ܽ֡;J)J

    move-result-wide v11

    const-wide/16 v4, -0x1

    cmp-long v0, v11, v4

    if-eqz v0, :cond_d

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide v4, v11

    .line 82
    invoke-direct/range {v0 .. v5}, Ll/֫ᩳ֡;->֫(Ll/۫ܽ֡;JJ)V

    return-wide v11

    .line 85
    :cond_d
    iput v1, v6, Ll/֫ᩳ֡;->ۙ:I

    .line 91
    :cond_e
    iget v0, v6, Ll/֫ᩳ֡;->ۙ:I

    if-ne v0, v1, :cond_10

    .line 173
    check-cast v10, Ll/ۘᩳ֡;

    const-wide/16 v0, 0x4

    .line 270
    invoke-virtual {v10, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    iget-object v2, v10, Ll/ۘᩳ֡;->᩸:Ll/۫ܽ֡;

    .line 418
    invoke-virtual {v2}, Ll/۫ܽ֡;->readInt()I

    move-result v3

    sget-object v4, Ll/᩸ᩳ֡;->֫:Ljava/nio/charset/Charset;

    const/high16 v4, -0x1000000

    and-int v5, v3, v4

    ushr-int/lit8 v5, v5, 0x18

    const/high16 v7, 0xff0000

    and-int v9, v3, v7

    ushr-int/lit8 v9, v9, 0x8

    or-int/2addr v5, v9

    and-int v9, v3, v21

    shl-int/lit8 v9, v9, 0x8

    or-int/2addr v5, v9

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x18

    or-int/2addr v3, v5

    .line 173
    invoke-virtual {v8}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v8

    long-to-int v5, v8

    const-string v8, "CRC"

    invoke-static {v3, v5, v8}, Ll/֫ᩳ֡;->֫(IILjava/lang/String;)V

    .line 270
    invoke-virtual {v10, v0, v1}, Ll/ۘᩳ֡;->ܿ(J)V

    .line 418
    invoke-virtual {v2}, Ll/۫ܽ֡;->readInt()I

    move-result v0

    and-int v1, v0, v4

    ushr-int/lit8 v1, v1, 0x18

    and-int v2, v0, v7

    ushr-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    and-int v2, v0, v21

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    .line 174
    iget-object v1, v6, Ll/֫ᩳ֡;->᩹:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v2, v1

    const-string v1, "ISIZE"

    invoke-static {v0, v2, v1}, Ll/֫ᩳ֡;->֫(IILjava/lang/String;)V

    const/4 v0, 0x3

    .line 93
    iput v0, v6, Ll/֫ᩳ֡;->ۙ:I

    .line 99
    invoke-virtual {v10}, Ll/ۘᩳ֡;->ۢۧ()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_8

    .line 100
    :cond_f
    new-instance v0, Ljava/io/IOException;

    const-string v1, "gzip finished without exhausting source"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_10
    :goto_8
    const-wide/16 v0, -0x1

    return-wide v0
.end method
