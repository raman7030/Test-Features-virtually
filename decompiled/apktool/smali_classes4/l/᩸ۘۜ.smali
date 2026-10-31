.class public final Ll/᩸ۘۜ;
.super Ljava/lang/Object;
.source "S6V6"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final ۗ:Ljava/util/ArrayDeque;

.field public ۙ:Z

.field public final ۛ:Ll/֡ۘۜ;

.field public final ۤ:Ll/᩵ܺۜ;

.field public ۨ:Ljava/lang/String;

.field public final ۫:Ll/ۨۘܽ;

.field public ۬:I

.field public final ᩶:Ll/ܺۘۜ;

.field public ᩸:Ll/ᩴۘۜ;

.field public ᩹:Z

.field public ᩺:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ܶ᩵ܿ;Ll/ܿۘۜ;Ll/ܺۘۜ;Ll/᩵ܺۜ;Ll/ۨۘܽ;Ll/֨ۘۜ;)V
    .locals 7

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ll/᩸ۘۜ;->ۗ:Ljava/util/ArrayDeque;

    .line 37
    iput-object p3, p0, Ll/᩸ۘۜ;->᩶:Ll/ܺۘۜ;

    .line 38
    iput-object p4, p0, Ll/᩸ۘۜ;->ۤ:Ll/᩵ܺۜ;

    .line 39
    iput-object p5, p0, Ll/᩸ۘۜ;->۫:Ll/ۨۘܽ;

    .line 34
    iget-object p4, p2, Ll/ܿۘۜ;->ܽ:Ljava/nio/charset/Charset;

    invoke-virtual {p4}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p4

    const-string p5, "UTF-8"

    .line 35
    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    const/4 v0, 0x0

    if-nez p5, :cond_1

    const-string p5, "UTF-16LE"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "UTF-16BE"

    .line 36
    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "UTF-32LE"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "UTF-32BE"

    .line 37
    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "US-ASCII"

    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p5

    if-nez p5, :cond_1

    const-string p5, "ISO-8859-1"

    .line 38
    invoke-virtual {p4, p5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p4, 0x1

    .line 41
    :goto_1
    new-instance p5, Ll/֡ۘۜ;

    if-eqz p4, :cond_2

    iget-wide v1, p3, Ll/ܺۘۜ;->ۧ:J

    goto :goto_2

    :cond_2
    iget v1, p2, Ll/ܿۘۜ;->ۧ:I

    int-to-long v1, v1

    :goto_2
    move-wide v4, v1

    move-object v1, p5

    move-object v2, p1

    move-object v3, p2

    move-object v6, p6

    invoke-direct/range {v1 .. v6}, Ll/֡ۘۜ;-><init>(Ll/ܶ᩵ܿ;Ll/ܿۘۜ;JLl/֨ۘۜ;)V

    iput-object p5, p0, Ll/᩸ۘۜ;->ۛ:Ll/֡ۘۜ;

    if-eqz p4, :cond_3

    .line 42
    iget-wide p1, p3, Ll/ܺۘۜ;->ܽ:J

    goto :goto_3

    :cond_3
    const-wide/16 p1, 0x0

    .line 43
    :goto_3
    invoke-virtual {p5}, Ll/֡ۘۜ;->position()J

    move-result-wide p4

    .line 45
    :goto_4
    :try_start_0
    iget-wide v1, p3, Ll/ܺۘۜ;->ܳ:J

    cmp-long p6, p1, v1

    if-gez p6, :cond_6

    .line 46
    iget-object p6, p0, Ll/᩸ۘۜ;->ۛ:Ll/֡ۘۜ;

    invoke-virtual {p6, p1, p2}, Ll/֡ۘۜ;->ۧ(J)Ll/ᩴۘۜ;

    move-result-object p6

    if-eqz p6, :cond_5

    .line 48
    invoke-virtual {p6}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v1

    iget-wide v3, p3, Ll/ܺۘۜ;->ܽ:J

    cmp-long v5, v1, v3

    if-ltz v5, :cond_4

    invoke-direct {p0, p6}, Ll/᩸ۘۜ;->֫(Ll/ᩴۘۜ;)V

    :cond_4
    const-wide/16 v1, 0x1

    add-long/2addr p1, v1

    .line 50
    invoke-virtual {p6}, Ll/ᩴۘۜ;->֫()J

    move-result-wide p4

    goto :goto_4

    .line 47
    :cond_5
    new-instance p6, Ljava/io/IOException;

    const-string v1, "File ended before the text search checkpoint."

    invoke-direct {p6, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p6

    .line 52
    :cond_6
    iget-boolean p6, p3, Ll/ܺۘۜ;->ۡ:Z

    if-eqz p6, :cond_8

    .line 53
    iget-object p6, p0, Ll/᩸ۘۜ;->ۛ:Ll/֡ۘۜ;

    invoke-virtual {p6, v1, v2}, Ll/֡ۘۜ;->ۧ(J)Ll/ᩴۘۜ;

    move-result-object p6

    iput-object p6, p0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    if-eqz p6, :cond_7

    .line 55
    invoke-direct {p0}, Ll/᩸ۘۜ;->ܽ()V

    .line 56
    iget-object p6, p0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    if-eqz p6, :cond_8

    iget-object p6, p0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {p6}, Ll/ᩴۘۜ;->ܽ()J

    move-result-wide v1

    iput-wide v1, p3, Ll/ܺۘۜ;->ۘ:J

    return-void

    .line 54
    :cond_7
    new-instance p6, Ljava/io/IOException;

    const-string v1, "Missing pending search line."

    invoke-direct {p6, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p6
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ll/᩵ۘۜ; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_8
    return-void

    :catchall_0
    move-exception p1

    .line 66
    :try_start_1
    iget-object p2, p0, Ll/᩸ۘۜ;->ۛ:Ll/֡ۘۜ;

    invoke-virtual {p2}, Ll/֡ۘۜ;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 67
    :catch_0
    throw p1

    :catch_1
    move-exception p6

    goto :goto_5

    :catch_2
    move-exception p6

    .line 59
    :goto_5
    iput-wide p1, p3, Ll/ܺۘۜ;->ܳ:J

    .line 60
    iput-wide p4, p3, Ll/ܺۘۜ;->ۘ:J

    .line 61
    iput-boolean v0, p3, Ll/ܺۘۜ;->ۡ:Z

    const/4 p1, 0x0

    .line 62
    iput-object p1, p0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    .line 63
    instance-of p1, p6, Ljava/nio/charset/CharacterCodingException;

    if-eqz p1, :cond_9

    const-string p2, "decode_error"

    goto :goto_6

    :cond_9
    const-string p2, "resource_limit"

    :goto_6
    iput-object p2, p0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    if-eqz p1, :cond_a

    const-string p1, "invalid_encoding"

    goto :goto_7

    :cond_a
    const-string p1, "line_too_long"

    .line 64
    :goto_7
    iput-object p1, p0, Ll/᩸ۘۜ;->᩺:Ljava/lang/String;

    return-void
.end method

.method private ֫(Ll/ᩴۘۜ;)V
    .locals 4

    .line 156
    iget-object v0, p0, Ll/᩸ۘۜ;->ۤ:Ll/᩵ܺۜ;

    invoke-virtual {v0}, Ll/᩵ܺۜ;->ܽ()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    const/high16 v1, 0x20000

    .line 157
    invoke-virtual {p1, v1}, Ll/ᩴۘۜ;->֫(I)Ll/ᩴۘۜ;

    move-result-object p1

    .line 158
    iget-object v2, p0, Ll/᩸ۘۜ;->ۗ:Ljava/util/ArrayDeque;

    invoke-virtual {v2, p1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 159
    iget v3, p0, Ll/᩸ۘۜ;->۬:I

    invoke-virtual {p1}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v3

    iput p1, p0, Ll/᩸ۘۜ;->۬:I

    .line 160
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->size()I

    move-result p1

    invoke-virtual {v0}, Ll/᩵ܺۜ;->ܽ()I

    move-result v3

    if-le p1, v3, :cond_1

    iget p1, p0, Ll/᩸ۘۜ;->۬:I

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۜ;

    invoke-virtual {v3}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr p1, v3

    iput p1, p0, Ll/᩸ۘۜ;->۬:I

    goto :goto_0

    .line 161
    :cond_1
    :goto_1
    iget p1, p0, Ll/᩸ۘۜ;->۬:I

    if-le p1, v1, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_2

    .line 162
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ᩴۘۜ;

    .line 163
    iget v0, p0, Ll/᩸ۘۜ;->۬:I

    invoke-virtual {p1}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v0, v3

    iput v0, p0, Ll/᩸ۘۜ;->۬:I

    sub-int v0, v1, v0

    const/4 v3, 0x1

    if-le v0, v3, :cond_1

    .line 166
    invoke-virtual {p1, v0}, Ll/ᩴۘۜ;->֫(I)Ll/ᩴۘۜ;

    move-result-object p1

    .line 167
    invoke-virtual {v2, p1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 168
    iget v0, p0, Ll/᩸ۘۜ;->۬:I

    invoke-virtual {p1}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Ll/᩸ۘۜ;->۬:I

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method private ܽ()V
    .locals 3

    .line 143
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    .line 144
    iget-object v0, p0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v0}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v1}, Ll/ᩴۘۜ;->ܳ()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 145
    iget-object v1, p0, Ll/᩸ۘۜ;->۫:Ll/ۨۘܽ;

    invoke-virtual {v1, v0}, Ll/ۨۘܽ;->matcher(Ljava/lang/CharSequence;)Ll/۫ۘܽ;

    move-result-object v0

    .line 146
    invoke-virtual {v0}, Ll/۫ۘܽ;->find()Z

    move-result v1

    iput-boolean v1, p0, Ll/᩸ۘۜ;->᩹:Z

    .line 147
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    .line 148
    invoke-virtual {v0}, Ll/۫ۘܽ;->ۜ()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ll/۫ۘܽ;->᩻()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const-string v0, "resource_limit"

    .line 149
    iput-object v0, p0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    const-string v0, "match_resource_limit"

    .line 150
    iput-object v0, p0, Ll/᩸ۘۜ;->᩺:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 221
    iget-object v0, p0, Ll/᩸ۘۜ;->ۛ:Ll/֡ۘۜ;

    invoke-virtual {v0}, Ll/֡ۘۜ;->close()V

    return-void
.end method

.method public final ֫()J
    .locals 6

    .line 218
    iget-object v0, p0, Ll/᩸ۘۜ;->ۤ:Ll/᩵ܺۜ;

    invoke-virtual {v0}, Ll/᩵ܺۜ;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x200

    mul-long v0, v0, v2

    const-wide/32 v2, 0x10000

    add-long/2addr v0, v2

    iget v2, p0, Ll/᩸ۘۜ;->۬:I

    iget-object v3, p0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    if-nez v3, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    :goto_0
    add-int/2addr v2, v3

    int-to-long v2, v2

    const-wide/16 v4, 0x2

    mul-long v2, v2, v4

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public final ֫(JJLl/ۨۗᩳ;)Ll/ܶۘۜ;
    .locals 27

    move-object/from16 v0, p0

    .line 72
    new-instance v1, Ll/ܶۘۜ;

    iget-object v2, v0, Ll/᩸ۘۜ;->ۤ:Ll/᩵ܺۜ;

    invoke-virtual {v2}, Ll/᩵ܺۜ;->ܳ()I

    move-result v3

    invoke-direct {v1, v3}, Ll/ܶۘۜ;-><init>(I)V

    .line 73
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    .line 74
    iget-object v5, v0, Ll/᩸ۘۜ;->᩶:Ll/ܺۘۜ;

    iget-wide v6, v5, Ll/ܺۘۜ;->ۘ:J

    const/4 v8, 0x0

    .line 77
    :goto_0
    invoke-static {}, Ll/֡ۘۜ;->֫()V

    .line 78
    iget-object v9, v0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    iget-object v10, v0, Ll/᩸ۘۜ;->ۛ:Ll/֡ۘۜ;

    iget-object v11, v0, Ll/᩸ۘۜ;->ۗ:Ljava/util/ArrayDeque;

    if-eqz v9, :cond_0

    .line 79
    iput-object v9, v1, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    .line 80
    iget-object v2, v0, Ll/᩸ۘۜ;->᩺:Ljava/lang/String;

    iget-wide v3, v5, Ll/ܺۘۜ;->ܳ:J

    invoke-virtual {v1, v3, v4, v2}, Ll/ܶۘۜ;->֫(JLjava/lang/String;)V

    .line 81
    iget-wide v2, v5, Ll/ܺۘۜ;->ܳ:J

    iget-wide v6, v5, Ll/ܺۘۜ;->֫:J

    cmp-long v4, v2, v6

    if-gtz v4, :cond_1

    const-string v4, "context_incomplete"

    invoke-virtual {v1, v2, v3, v4}, Ll/ܶۘۜ;->֫(JLjava/lang/String;)V

    goto :goto_1

    .line 84
    :cond_0
    iget-object v9, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    if-eqz v9, :cond_17

    .line 85
    iget-boolean v8, v0, Ll/᩸ۘۜ;->᩹:Z

    iget-object v12, v1, Ll/ܶۘۜ;->ᩳ:Lbin/mt/json/JSONArray;

    if-eqz v8, :cond_2

    iget-wide v13, v5, Ll/ܺۘۜ;->ᩳ:J

    invoke-virtual {v9}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v8

    cmp-long v15, v13, v8

    if-eqz v15, :cond_2

    .line 86
    invoke-virtual {v12}, Lbin/mt/json/JSONArray;->size()I

    move-result v8

    invoke-virtual {v2}, Ll/᩵ܺۜ;->ᩳ()I

    move-result v9

    if-lt v8, v9, :cond_2

    const-string v2, "match_limit"

    .line 87
    iput-object v2, v1, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    :cond_1
    :goto_1
    move-object/from16 v17, v10

    move-object v15, v11

    goto/16 :goto_c

    .line 90
    :cond_2
    iget-boolean v8, v0, Ll/᩸ۘۜ;->᩹:Z

    if-nez v8, :cond_4

    iget-object v8, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v8}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v8

    iget-wide v13, v5, Ll/ܺۘۜ;->֫:J

    cmp-long v17, v8, v13

    if-gtz v17, :cond_3

    const-wide/16 v13, 0x1

    goto :goto_2

    :cond_3
    move-object/from16 v16, v2

    move-wide/from16 v18, v3

    move-wide/from16 v21, v6

    move-object/from16 v17, v10

    move-object v15, v11

    const-wide/16 v13, 0x1

    goto/16 :goto_a

    :cond_4
    const-wide/16 v8, 0x1

    move-wide v13, v8

    .line 174
    :goto_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 175
    iget-boolean v9, v0, Ll/᩸ۘۜ;->᩹:Z

    if-eqz v9, :cond_7

    .line 176
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 177
    iget-object v9, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v9}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v15

    invoke-virtual {v2}, Ll/᩵ܺۜ;->ܽ()I

    move-result v9

    move-object/from16 v17, v10

    int-to-long v9, v9

    sub-long v9, v15, v9

    move-wide v15, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v9, v10}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v9

    .line 178
    invoke-virtual {v2}, Ll/᩵ܺۜ;->ܽ()I

    move-result v18

    if-lez v18, :cond_6

    move-wide/from16 v18, v15

    iget-object v15, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v15}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v15

    cmp-long v20, v15, v3

    if-lez v20, :cond_8

    invoke-virtual {v11}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_5

    .line 179
    invoke-virtual {v11}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۜ;

    invoke-virtual {v3}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v3

    cmp-long v15, v3, v9

    if-gtz v15, :cond_5

    invoke-virtual {v11}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ᩴۘۜ;

    invoke-virtual {v3}, Ll/ᩴۘۜ;->ᩳ()J

    move-result-wide v3

    const-wide/16 v15, 0x0

    cmp-long v20, v3, v15

    if-lez v20, :cond_8

    :cond_5
    const-string v3, "context_clipped"

    invoke-virtual {v1, v9, v10, v3}, Ll/ܶۘۜ;->֫(JLjava/lang/String;)V

    goto :goto_3

    :cond_6
    move-wide/from16 v18, v15

    goto :goto_3

    :cond_7
    move-wide/from16 v18, v3

    move-object/from16 v17, v10

    .line 181
    :cond_8
    :goto_3
    iget-object v3, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴۘۜ;

    .line 183
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v8

    move-object v15, v11

    iget-wide v10, v5, Ll/ܺۘۜ;->᩷:J

    cmp-long v16, v8, v10

    if-gez v16, :cond_9

    move-object v11, v15

    goto :goto_4

    .line 184
    :cond_9
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v8

    iget-wide v10, v5, Ll/ܺۘۜ;->᩷:J

    cmp-long v16, v8, v10

    invoke-virtual {v4}, Ll/ᩴۘۜ;->ᩳ()J

    move-result-wide v8

    if-nez v16, :cond_a

    iget-wide v10, v5, Ll/ܺۘۜ;->ۜ:J

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    .line 185
    :cond_a
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v10

    move-wide/from16 v21, v6

    iget-wide v6, v1, Ll/ܶۘۜ;->ܽ:J

    cmp-long v16, v10, v6

    if-gez v16, :cond_b

    move-wide/from16 v23, v13

    goto :goto_5

    .line 186
    :cond_b
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v6

    iget-wide v10, v1, Ll/ܶۘۜ;->ܽ:J

    cmp-long v16, v6, v10

    if-nez v16, :cond_c

    iget-wide v6, v1, Ll/ܶۘۜ;->ۧ:J

    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    .line 187
    :cond_c
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v10, 0x0

    invoke-virtual {v6, v10, v7}, Ljava/lang/String;->codePointCount(II)I

    move-result v6

    .line 188
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ᩳ()J

    move-result-wide v10

    sub-long v10, v8, v10

    move-wide/from16 v23, v13

    int-to-long v13, v6

    cmp-long v7, v10, v13

    if-ltz v7, :cond_d

    :goto_5
    move-object v11, v15

    :goto_6
    move-wide/from16 v6, v21

    move-wide/from16 v13, v23

    goto :goto_4

    .line 190
    :cond_d
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v7

    long-to-int v11, v10

    const/4 v10, 0x0

    invoke-virtual {v7, v10, v11}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v7

    .line 191
    iget v10, v1, Ll/ܶۘۜ;->ܳ:I

    if-nez v10, :cond_e

    goto/16 :goto_9

    :cond_e
    sub-int/2addr v6, v11

    .line 193
    invoke-static {v10, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 194
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, v7, v6}, Ljava/lang/String;->offsetByCodePoints(II)I

    move-result v10

    .line 195
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v10, v11, :cond_f

    if-le v10, v7, :cond_f

    .line 196
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v11

    add-int/lit8 v13, v10, -0x1

    invoke-virtual {v11, v13}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v13, 0xd

    if-ne v11, v13, :cond_f

    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v10}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v13, 0xa

    if-ne v11, v13, :cond_f

    add-int/lit8 v10, v10, -0x1

    add-int/lit8 v6, v6, -0x1

    :cond_f
    if-nez v6, :cond_10

    goto/16 :goto_9

    .line 201
    :cond_10
    iget-object v11, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    if-ne v4, v11, :cond_11

    iget-boolean v13, v0, Ll/᩸ۘۜ;->᩹:Z

    if-eqz v13, :cond_11

    iget-wide v13, v5, Ll/ܺۘۜ;->ᩳ:J

    invoke-virtual {v11}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v25

    cmp-long v11, v13, v25

    if-eqz v11, :cond_11

    .line 202
    iget-object v11, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v11}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v13

    invoke-virtual {v12, v13, v14}, Lbin/mt/json/JSONArray;->add(J)Lbin/mt/json/JSONArray;

    .line 203
    iget-object v11, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v11}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v13

    iput-wide v13, v5, Ll/ܺۘۜ;->ᩳ:J

    .line 204
    iget-wide v13, v5, Ll/ܺۘۜ;->֫:J

    iget-object v11, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v11}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v25

    invoke-virtual {v2}, Ll/᩵ܺۜ;->֫()I

    move-result v11

    move-object/from16 v16, v2

    move-object/from16 p5, v3

    int-to-long v2, v11

    add-long v2, v25, v2

    invoke-static {v13, v14, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, v5, Ll/ܺۘۜ;->֫:J

    goto :goto_7

    :cond_11
    move-object/from16 v16, v2

    move-object/from16 p5, v3

    .line 206
    :goto_7
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v2

    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11, v7, v10}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    .line 244
    iget-object v11, v1, Ll/ܶۘۜ;->֫:Ljava/util/ArrayList;

    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v13

    if-nez v13, :cond_12

    iget-wide v13, v1, Ll/ܶۘۜ;->ܽ:J

    cmp-long v20, v2, v13

    if-nez v20, :cond_12

    iget-wide v13, v1, Ll/ܶۘۜ;->ۧ:J

    cmp-long v20, v8, v13

    if-nez v20, :cond_12

    const/4 v13, 0x1

    .line 0
    invoke-static {v11, v13}, Ll/ᩴۛ֫;->֫(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v11

    .line 245
    check-cast v11, Ll/۠ۘۜ;

    goto :goto_8

    .line 247
    :cond_12
    new-instance v13, Ll/۠ۘۜ;

    invoke-direct {v13, v2, v3, v8, v9}, Ll/۠ۘۜ;-><init>(JJ)V

    .line 248
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v11, v13

    .line 250
    :goto_8
    iget-object v11, v11, Ll/۠ۘۜ;->ܽ:Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    iput-wide v2, v1, Ll/ܶۘۜ;->ܽ:J

    .line 252
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {v7, v3, v2}, Ljava/lang/String;->codePointCount(II)I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v2, v8

    iput-wide v2, v1, Ll/ܶۘۜ;->ۧ:J

    const-string v2, "\n"

    .line 253
    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_13

    const-string v2, "\r"

    invoke-virtual {v7, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    .line 254
    :cond_13
    iget-wide v2, v1, Ll/ܶۘۜ;->ܽ:J

    add-long v2, v2, v23

    iput-wide v2, v1, Ll/ܶۘۜ;->ܽ:J

    const-wide/16 v2, 0x0

    .line 255
    iput-wide v2, v1, Ll/ܶۘۜ;->ۧ:J

    .line 207
    :cond_14
    iget v2, v1, Ll/ܶۘۜ;->ܳ:I

    sub-int/2addr v2, v6

    iput v2, v1, Ll/ܶۘۜ;->ܳ:I

    .line 208
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v2

    iput-wide v2, v5, Ll/ܺۘۜ;->᩷:J

    int-to-long v2, v6

    add-long/2addr v8, v2

    .line 209
    iput-wide v8, v5, Ll/ܺۘۜ;->ۜ:J

    .line 210
    invoke-virtual {v4}, Ll/ᩴۘۜ;->ۜ()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v10, v2, :cond_15

    :goto_9
    const-string v2, "output_limit"

    .line 92
    iput-object v2, v1, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    goto :goto_c

    .line 211
    :cond_15
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v2

    add-long v2, v2, v23

    iput-wide v2, v5, Ll/ܺۘۜ;->᩷:J

    const-wide/16 v2, 0x0

    .line 212
    iput-wide v2, v5, Ll/ܺۘۜ;->ۜ:J

    move-object/from16 v3, p5

    move-object v11, v15

    move-object/from16 v2, v16

    goto/16 :goto_6

    :cond_16
    move-object/from16 v16, v2

    move-wide/from16 v21, v6

    move-object v15, v11

    move-wide/from16 v23, v13

    :goto_a
    const-wide/16 v2, 0x0

    .line 96
    iget-object v4, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-direct {v0, v4}, Ll/᩸ۘۜ;->֫(Ll/ᩴۘۜ;)V

    .line 97
    iget-object v4, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v6

    add-long/2addr v6, v13

    iput-wide v6, v5, Ll/ܺۘۜ;->ܳ:J

    const/4 v4, 0x0

    .line 98
    iput-boolean v4, v5, Ll/ܺۘۜ;->ۡ:Z

    const/4 v4, 0x0

    .line 99
    iput-object v4, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    const/4 v4, 0x1

    const/4 v8, 0x1

    goto :goto_b

    :cond_17
    move-object/from16 v16, v2

    move-wide/from16 v18, v3

    move-wide/from16 v21, v6

    move-object/from16 v17, v10

    move-object v15, v11

    const-wide/16 v2, 0x0

    .line 102
    :goto_b
    iget-boolean v4, v0, Ll/᩸ۘۜ;->ۙ:Z

    if-eqz v4, :cond_18

    const-string v2, "eof"

    .line 103
    iput-object v2, v1, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    goto :goto_c

    :cond_18
    if-eqz v8, :cond_1c

    .line 106
    iget-wide v6, v5, Ll/ܺۘۜ;->ۘ:J

    sub-long v6, v6, v21

    cmp-long v4, v6, p1

    if-gez v4, :cond_19

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v6

    sub-long v6, v6, v18

    cmp-long v4, v6, p3

    if-ltz v4, :cond_1c

    :cond_19
    const-string v2, "scan_budget"

    .line 107
    iput-object v2, v1, Ll/ܶۘۜ;->ܿ:Ljava/lang/String;

    .line 132
    :goto_c
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1a

    .line 133
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۜ;

    invoke-virtual {v2}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v2

    iput-wide v2, v5, Ll/ܺۘۜ;->ܽ:J

    .line 134
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۜ;

    invoke-virtual {v2}, Ll/ᩴۘۜ;->ܽ()J

    move-result-wide v2

    iput-wide v2, v5, Ll/ܺۘۜ;->ۧ:J

    goto :goto_e

    .line 136
    :cond_1a
    iget-wide v2, v5, Ll/ܺۘۜ;->ܳ:J

    iput-wide v2, v5, Ll/ܺۘۜ;->ܽ:J

    .line 137
    iget-object v2, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    if-nez v2, :cond_1b

    invoke-virtual/range {v17 .. v17}, Ll/֡ۘۜ;->position()J

    move-result-wide v2

    goto :goto_d

    :cond_1b
    invoke-virtual {v2}, Ll/ᩴۘۜ;->ܽ()J

    move-result-wide v2

    :goto_d
    iput-wide v2, v5, Ll/ܺۘۜ;->ۧ:J

    :goto_e
    return-object v1

    .line 111
    :cond_1c
    :try_start_0
    iget-wide v6, v5, Ll/ܺۘۜ;->ܳ:J

    move-object/from16 v4, v17

    invoke-virtual {v4, v6, v7}, Ll/֡ۘۜ;->ۧ(J)Ll/ᩴۘۜ;

    move-result-object v6

    iput-object v6, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    if-nez v6, :cond_1d

    const/4 v2, 0x1

    .line 113
    iput-boolean v2, v0, Ll/᩸ۘۜ;->ۙ:Z

    .line 114
    invoke-virtual {v4}, Ll/֡ۘۜ;->position()J

    move-result-wide v2

    iput-wide v2, v5, Ll/ܺۘۜ;->ۘ:J

    goto :goto_10

    .line 117
    :cond_1d
    invoke-direct/range {p0 .. p0}, Ll/᩸ۘۜ;->ܽ()V

    .line 118
    iget-object v4, v0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    if-eqz v4, :cond_1e

    goto :goto_10

    :cond_1e
    const/4 v4, 0x1

    .line 119
    iput-boolean v4, v5, Ll/ܺۘۜ;->ۡ:Z

    .line 120
    iget-object v4, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    invoke-virtual {v4}, Ll/ᩴۘۜ;->֫()J

    move-result-wide v6

    iput-wide v6, v5, Ll/ܺۘۜ;->ۘ:J

    .line 121
    iget-boolean v4, v0, Ll/᩸ۘۜ;->᩹:Z

    if-eqz v4, :cond_1f

    invoke-virtual {v15}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_1f

    .line 122
    invoke-virtual {v15}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ᩴۘۜ;

    goto :goto_f

    :cond_1f
    iget-object v4, v0, Ll/᩸ۘۜ;->᩸:Ll/ᩴۘۜ;

    :goto_f
    invoke-virtual {v4}, Ll/ᩴۘۜ;->᩻()J

    move-result-wide v6

    iput-wide v6, v5, Ll/ܺۘۜ;->᩷:J

    .line 123
    iget-boolean v4, v0, Ll/᩸ۘۜ;->᩹:Z

    if-eqz v4, :cond_20

    invoke-virtual {v15}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_20

    invoke-virtual {v15}, Ljava/util/ArrayDeque;->getFirst()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴۘۜ;

    invoke-virtual {v2}, Ll/ᩴۘۜ;->ᩳ()J

    move-result-wide v2

    :cond_20
    iput-wide v2, v5, Ll/ܺۘۜ;->ۜ:J
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ll/᩵ۘۜ; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_10

    :catch_0
    const-string v2, "resource_limit"

    .line 128
    iput-object v2, v0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    const-string v2, "line_too_long"

    .line 129
    iput-object v2, v0, Ll/᩸ۘۜ;->᩺:Ljava/lang/String;

    goto :goto_10

    :catch_1
    const-string v2, "decode_error"

    .line 125
    iput-object v2, v0, Ll/᩸ۘۜ;->ۨ:Ljava/lang/String;

    const-string v2, "invalid_encoding"

    .line 126
    iput-object v2, v0, Ll/᩸ۘۜ;->᩺:Ljava/lang/String;

    :goto_10
    move-object/from16 v2, v16

    move-wide/from16 v3, v18

    move-wide/from16 v6, v21

    goto/16 :goto_0
.end method
