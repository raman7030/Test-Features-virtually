.class public final Ll/ۧ᩵ۢ;
.super Ljava/lang/Object;
.source "V7BB"


# static fields
.field public static final ֫:Ll/ۚܳܳ;

.field public static final ۧ:Ll/ۚܳܳ;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 293
    new-instance v0, Ll/۟ᩴۢ;

    const/16 v1, 0xce

    const-string v2, "Partial Content"

    invoke-direct {v0, v1, v2}, Ll/۟ᩴۢ;-><init>(ILjava/lang/String;)V

    .line 23
    sput-object v0, Ll/ۧ᩵ۢ;->֫:Ll/ۚܳܳ;

    .line 293
    new-instance v0, Ll/۟ᩴۢ;

    const/16 v1, 0x1a0

    const-string v2, "Requested Range Not Satisfiable"

    invoke-direct {v0, v1, v2}, Ll/۟ᩴۢ;-><init>(ILjava/lang/String;)V

    .line 25
    sput-object v0, Ll/ۧ᩵ۢ;->ۧ:Ll/ۚܳܳ;

    return-void
.end method

.method public static ֫(Ll/ۢۧ᩻;J)Ljava/io/InputStream;
    .locals 7

    .line 173
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p0}, Ll/ۖۧ᩻;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object p0

    if-eqz p0, :cond_3

    const/16 v0, 0x2000

    :try_start_0
    new-array v1, v0, [B

    :goto_0
    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_2

    .line 197
    invoke-virtual {p0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    move-result-wide v4

    cmp-long v6, v4, v2

    if-lez v6, :cond_0

    sub-long/2addr p1, v4

    goto :goto_0

    :cond_0
    int-to-long v2, v0

    .line 202
    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v3}, Ljava/io/InputStream;->read([BII)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    int-to-long v2, v2

    sub-long/2addr p1, v2

    goto :goto_0

    .line 204
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "unexpected eof"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    return-object p0

    :catch_0
    move-exception p1

    .line 182
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 186
    :catch_1
    throw p1

    .line 175
    :cond_3
    new-instance p0, Ljava/io/IOException;

    const-string p1, "file stream is not available"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 252
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p0, "download"

    .line 253
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v1, 0x0

    .line 254
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 255
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x1f

    if-le v2, v3, :cond_2

    const/16 v3, 0x7f

    if-ge v2, v3, :cond_2

    const/16 v3, 0x22

    if-eq v2, v3, :cond_2

    const/16 v3, 0x5c

    if-ne v2, v3, :cond_1

    goto :goto_1

    .line 259
    :cond_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_2
    :goto_1
    const/16 v2, 0x5f

    .line 257
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 264
    :cond_3
    :try_start_0
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v1}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Ll/۬֨ᩴ;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "+"

    const-string v2, "%20"

    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 266
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 268
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "; filename=\""

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\"; filename*=UTF-8\'\'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ֫(Ll/ܺܳܳ;)Ll/۠ܳܳ;
    .locals 18

    move-object/from16 v0, p1

    .line 39
    invoke-virtual/range {p1 .. p1}, Ll/ܺܳܳ;->ܳ()Ll/ۘܳܳ;

    move-result-object v1

    .line 40
    sget-object v2, Ll/ۘܳܳ;->ۗ:Ll/ۘܳܳ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    sget-object v2, Ll/ۘܳܳ;->۬:Ll/ۘܳܳ;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 41
    sget-object v0, Ll/֨ܳܳ;->֫֫:Ll/֨ܳܳ;

    const v1, 0x7f120824

    new-array v2, v3, [Ljava/lang/Object;

    .line 62
    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v2, "path"

    .line 40
    invoke-static {v0, v2}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 44
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 45
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v1, 0x7f12073e

    new-array v2, v3, [Ljava/lang/Object;

    .line 62
    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v4, "disposition"

    .line 47
    invoke-static {v0, v4}, Ll/ܿۚۢ;->ۧ(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "inline"

    .line 48
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-nez v6, :cond_2

    const-string v6, "attachment"

    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 49
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    new-array v1, v7, [Ljava/lang/Object;

    aput-object v4, v1, v3

    const v2, 0x7f120826

    .line 62
    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    .line 52
    :cond_2
    invoke-static {v2}, Ll/ۜ᩵ۢ;->֫(Ljava/lang/String;)Ll/ۢۧ᩻;

    move-result-object v2

    if-eqz v2, :cond_1b

    .line 53
    invoke-virtual {v2}, Ll/ۢۧ᩻;->ܶۧ()Ll/ܶ᩵ܿ;

    move-result-object v4

    invoke-virtual {v4}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v4

    if-nez v4, :cond_3

    goto/16 :goto_a

    .line 56
    :cond_3
    invoke-virtual {v2}, Ll/ܺۘܳ;->isDirectory()Z

    move-result v4

    if-eqz v4, :cond_4

    .line 57
    sget-object v0, Ll/֨ܳܳ;->ۗ:Ll/֨ܳܳ;

    const v1, 0x7f120828

    new-array v2, v3, [Ljava/lang/Object;

    .line 62
    invoke-static {v1, v2}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    .line 60
    :cond_4
    invoke-virtual {v2}, Ll/ܺۘܳ;->getSize()J

    move-result-wide v8

    const-wide/16 v10, 0x0

    invoke-static {v8, v9, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v8

    const-string v4, "range"

    .line 61
    invoke-static {v0, v4}, Ll/ܿۚۢ;->֫(Ll/ۖܳܳ;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 108
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    const-wide/16 v12, 0x1

    if-eqz v4, :cond_5

    .line 109
    invoke-static {v8, v9}, Ll/֫᩵ۢ;->֫(J)Ll/֫᩵ۢ;

    move-result-object v0

    goto/16 :goto_4

    .line 111
    :cond_5
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v4, "bytes="

    .line 112
    invoke-virtual {v0, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 113
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto/16 :goto_4

    :cond_6
    const/4 v4, 0x6

    .line 115
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 116
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_12

    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    goto/16 :goto_3

    :cond_7
    const/16 v4, 0x2d

    .line 119
    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-gez v4, :cond_8

    .line 121
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto/16 :goto_4

    .line 123
    :cond_8
    invoke-virtual {v0, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    add-int/2addr v4, v7

    .line 124
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 126
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 127
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_9

    .line 128
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto/16 :goto_4

    .line 131
    :cond_9
    :try_start_0
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    cmp-long v0, v3, v10

    if-lez v0, :cond_b

    cmp-long v0, v8, v10

    if-gtz v0, :cond_a

    goto :goto_0

    :cond_a
    sub-long v3, v8, v3

    .line 136
    invoke-static {v3, v4, v10, v11}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    sub-long v6, v8, v12

    .line 140
    invoke-static {v3, v4, v6, v7}, Ll/֫᩵ۢ;->֫(JJ)Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    .line 133
    :cond_b
    :goto_0
    :try_start_1
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_4

    .line 138
    :catch_0
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    .line 143
    :cond_c
    :try_start_2
    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2

    cmp-long v6, v3, v10

    if-ltz v6, :cond_11

    cmp-long v6, v3, v8

    if-ltz v6, :cond_d

    goto :goto_2

    :cond_d
    sub-long v6, v8, v12

    .line 153
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v10

    if-nez v10, :cond_10

    .line 155
    :try_start_3
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_1

    cmp-long v0, v10, v3

    if-gez v0, :cond_e

    .line 160
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    :cond_e
    cmp-long v0, v10, v8

    if-ltz v0, :cond_f

    goto :goto_1

    :cond_f
    move-wide v6, v10

    goto :goto_1

    .line 157
    :catch_1
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    .line 166
    :cond_10
    :goto_1
    invoke-static {v3, v4, v6, v7}, Ll/֫᩵ۢ;->֫(JJ)Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    .line 148
    :cond_11
    :goto_2
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    .line 145
    :catch_2
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    goto :goto_4

    .line 117
    :cond_12
    :goto_3
    invoke-static {}, Ll/֫᩵ۢ;->֫()Ll/֫᩵ۢ;

    move-result-object v0

    .line 62
    :goto_4
    iget-boolean v3, v0, Ll/֫᩵ۢ;->ۧ:Z

    iget-wide v6, v0, Ll/֫᩵ۢ;->֫:J

    iget-wide v10, v0, Ll/֫᩵ۢ;->ܽ:J

    iget-boolean v0, v0, Ll/֫᩵ۢ;->ᩳ:Z

    const-string v4, "Content-Range"

    const-string v14, "bytes"

    const-string v15, "Accept-Ranges"

    if-nez v0, :cond_13

    const-string v0, "text/plain"

    const-string v2, ""

    .line 76
    sget-object v3, Ll/ۧ᩵ۢ;->ۧ:Ll/ۚܳܳ;

    invoke-static {v3, v0, v2}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    .line 64
    invoke-virtual {v0, v15, v14}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "bytes */"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v4, v2}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    invoke-virtual {v0, v1}, Ll/۠ܳܳ;->֫(Ll/ۘܳܳ;)V

    return-object v0

    :cond_13
    sub-long v16, v6, v10

    add-long v12, v16, v12

    .line 74
    :try_start_4
    sget-object v0, Ll/ۘܳܳ;->۬:Ll/ۘܳܳ;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    move-object/from16 p1, v4

    .line 75
    new-instance v4, Ljava/io/ByteArrayInputStream;

    move-wide/from16 v16, v8

    const/4 v8, 0x0

    new-array v8, v8, [B

    invoke-direct {v4, v8}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    goto :goto_5

    :cond_14
    move-object/from16 p1, v4

    move-wide/from16 v16, v8

    .line 76
    invoke-static {v2, v10, v11}, Ll/ۧ᩵ۢ;->֫(Ll/ۢۧ᩻;J)Ljava/io/InputStream;

    move-result-object v4

    .line 214
    new-instance v8, Ll/ܰᩴۢ;

    invoke-direct {v8, v12, v13, v4}, Ll/ܰᩴۢ;-><init>(JLjava/io/InputStream;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_4

    move-object v4, v8

    .line 81
    :goto_5
    invoke-virtual {v2}, Ll/ܺۘܳ;->۠֫()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_15

    const-string v8, "application/octet-stream"

    goto :goto_6

    :cond_15
    invoke-virtual {v2}, Ll/ܺۘܳ;->۠֫()Ljava/lang/String;

    move-result-object v8

    :goto_6
    if-eqz v3, :cond_16

    .line 83
    sget-object v9, Ll/ۧ᩵ۢ;->֫:Ll/ۚܳܳ;

    goto :goto_7

    :cond_16
    sget-object v9, Ll/֨ܳܳ;->ۜ֫:Ll/֨ܳܳ;

    :goto_7
    invoke-static {v9, v8, v4, v12, v13}, Ll/ۙܳܳ;->֫(Ll/ۚܳܳ;Ljava/lang/String;Ljava/io/InputStream;J)Ll/۠ܳܳ;

    move-result-object v4

    .line 88
    invoke-virtual {v4, v1}, Ll/۠ܳܳ;->֫(Ll/ۘܳܳ;)V

    .line 89
    invoke-virtual {v4, v15, v14}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "Referrer-Policy"

    const-string v12, "no-referrer"

    .line 90
    invoke-virtual {v4, v9, v12}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 91
    invoke-virtual {v2}, Ll/ܺۘܳ;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v5}, Ll/ۧ᩵ۢ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "Content-Disposition"

    invoke-virtual {v4, v9, v5}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_19

    const-string v0, "image/"

    invoke-virtual {v8, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_19

    .line 275
    invoke-virtual {v2}, Ll/ܺۘܳ;->getTime()J

    move-result-wide v8

    .line 276
    :try_start_5
    sget-object v0, Ll/ۖۧ᩻;->᩹:Ll/ۖۧ᩻;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v2}, Ll/ۖۧ᩻;->֫(Ll/ۗܺ᩷;Ll/ᩳۜܳ;)Ljava/io/InputStream;

    move-result-object v1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_3

    if-eqz v1, :cond_17

    .line 278
    :try_start_6
    new-instance v0, Ll/۟ܿ֫;

    const/4 v2, 0x0

    .line 4166
    invoke-direct {v0, v1, v2}, Ll/۟ܿ֫;-><init>(Ljava/io/InputStream;I)V

    .line 278
    invoke-static {v0}, Ll/ܿۨۡ;->֫(Ll/۟ܿ֫;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_17

    .line 280
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v8
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_9

    :catchall_0
    move-exception v0

    move-object v2, v0

    .line 276
    :try_start_7
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    goto :goto_8

    :catchall_1
    move-exception v0

    move-object v1, v0

    :try_start_8
    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_8
    throw v2

    :cond_17
    :goto_9
    if-eqz v1, :cond_18

    .line 283
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_8 .. :try_end_8} :catch_3

    .line 286
    :catch_3
    :cond_18
    invoke-static {v8, v9}, Ll/ܿۤۡ;->ۧ(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "X-MT-Preview-Time"

    .line 93
    invoke-virtual {v4, v1, v0}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_19
    if-eqz v3, :cond_1a

    const-string v0, "bytes "

    const-string v1, "-"

    .line 0
    invoke-static {v0, v1, v10, v11}, Ll/۬֫ۢ;->֫(Ljava/lang/String;Ljava/lang/String;J)Ljava/lang/StringBuilder;

    move-result-object v0

    .line 96
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-wide/from16 v1, v16

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p1

    invoke-virtual {v4, v1, v0}, Ll/۠ܳܳ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1a
    return-object v4

    .line 78
    :catch_4
    sget-object v0, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const v2, 0x7f120822

    .line 62
    invoke-static {v2, v1}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0

    :cond_1b
    :goto_a
    const/4 v0, 0x0

    const v1, 0x7f120822

    .line 54
    sget-object v2, Ll/֨ܳܳ;->ᩳ֫:Ll/֨ܳܳ;

    new-array v0, v0, [Ljava/lang/Object;

    .line 62
    invoke-static {v1, v0}, Ll/ۙ᩸᩷;->֫(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Ll/ۗ֡ۢ;->֫(Ll/֨ܳܳ;Ljava/lang/String;)Ll/۠ܳܳ;

    move-result-object v0

    return-object v0
.end method
