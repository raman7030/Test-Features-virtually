.class public final Ll/᩺ۚ᩻;
.super Ljava/lang/Object;
.source "S737"

# interfaces
.implements Ll/ۖۖܽ;


# static fields
.field public static final ۤ:Ljava/util/regex/Pattern;


# instance fields
.field public volatile ۗ:Z

.field public volatile ۙ:Ll/ᩴ۟᩵;

.field public final ۫:Ll/ۛۚ᩻;

.field public ۬:J

.field public volatile ᩶:Ljava/io/InputStream;

.field public volatile ᩸:Ll/ܽܰ᩵;

.field public ᩹:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "bytes (\\d+)-(\\d+)/(\\d+)"

    .line 26
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/᩺ۚ᩻;->ۤ:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>(Ll/ۛۚ᩻;)V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    iput-object p1, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    return-void
.end method

.method public constructor <init>(Ll/ܿ۟᩵;Ljava/lang/String;Ljava/lang/String;Ll/ۨۚ᩻;Ll/᩺֨᩻;)V
    .locals 21

    move-object/from16 v0, p3

    move-object/from16 v8, p4

    move-object/from16 v12, p5

    if-eqz v0, :cond_a

    .line 148
    invoke-static/range {p3 .. p3}, Ll/᩺ۚ᩻;->ᩳ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_9

    .line 151
    invoke-virtual/range {p1 .. p1}, Ll/ܿ۟᩵;->ۖ()Ll/ᩳ۟᩵;

    move-result-object v1

    new-instance v2, Ll/۫ۚ᩻;

    invoke-direct {v2, v0}, Ll/۫ۚ᩻;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ll/ᩳ۟᩵;->ۧ(Ll/᩺ܰ᩵;)V

    .line 152
    invoke-virtual {v1}, Ll/ᩳ۟᩵;->֫()Ll/ܿ۟᩵;

    move-result-object v9

    if-eqz v12, :cond_0

    .line 83
    invoke-virtual/range {p5 .. p5}, Ll/᩺֨᩻;->ۧ()V

    .line 904
    :cond_0
    :try_start_0
    invoke-static/range {p2 .. p2}, Ll/ۨܰ᩵;->ܽ(Ljava/lang/String;)Ll/ۨܰ᩵;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-wide/16 v2, 0x0

    move-object/from16 v7, p3

    .line 89
    invoke-static/range {v1 .. v7}, Ll/᩺ۚ᩻;->֫(Ll/ۨܰ᩵;JJLjava/lang/String;Ljava/lang/String;)Ll/ۡ۟᩵;

    move-result-object v1

    .line 90
    invoke-virtual {v9, v1}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v13

    if-eqz v12, :cond_1

    .line 92
    invoke-virtual {v12, v13}, Ll/᩺֨᩻;->֫(Ll/ܽܰ᩵;)V

    .line 94
    :cond_1
    :try_start_1
    invoke-interface {v13}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v14
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_7

    const-wide/16 v4, 0x0

    const-wide/16 v6, -0x1

    const-wide/16 v2, 0x0

    move-object v1, v14

    .line 95
    :try_start_2
    invoke-static/range {v1 .. v7}, Ll/᩺ۚ᩻;->֫(Ll/ᩴ۟᩵;JJJ)Ll/ۤۚ᩻;

    move-result-object v1

    .line 96
    invoke-virtual {v14}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 100
    invoke-virtual {v2}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 101
    :try_start_3
    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_5

    invoke-virtual {v2}, Ljava/io/InputStream;->read()I

    move-result v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v3, v4, :cond_5

    .line 104
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    const-string v2, "ETag"

    .line 105
    invoke-virtual {v14, v2}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string v2, "Last-Modified"

    .line 106
    invoke-virtual {v14, v2}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 107
    new-instance v10, Ll/ۨۚ᩻;

    iget-wide v2, v1, Ll/ۤۚ᩻;->֫:J

    const/16 v20, 0x0

    move-object v15, v10

    move-wide/from16 v16, v2

    move-object/from16 v18, v6

    move-object/from16 v19, v7

    .line 489
    invoke-direct/range {v15 .. v20}, Ll/ۨۚ᩻;-><init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v8, :cond_2

    .line 110
    invoke-static {v8, v10}, Ll/ۨۚ᩻;->֫(Ll/ۨۚ᩻;Ll/ۨۚ᩻;)V

    .line 112
    :cond_2
    invoke-static {v6}, Ll/᩺ۚ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object v8, v6

    goto :goto_1

    :cond_3
    move-object v8, v7

    .line 113
    :goto_1
    new-instance v15, Ll/ۛۚ᩻;

    invoke-virtual {v14}, Ll/ᩴ۟᩵;->֡()Ll/ۡ۟᩵;

    move-result-object v2

    invoke-virtual {v2}, Ll/ۡ۟᩵;->᩻()Ll/ۨܰ᩵;

    move-result-object v3

    iget-wide v4, v1, Ll/ۤۚ᩻;->֫:J

    move-object v1, v15

    move-object v2, v9

    move-object/from16 v9, p3

    move-object/from16 v11, p5

    invoke-direct/range {v1 .. v11}, Ll/ۛۚ᩻;-><init>(Ll/ܿ۟᩵;Ll/ۨܰ᩵;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/ۨۚ᩻;Ll/᩺֨᩻;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 115
    :try_start_5
    invoke-virtual {v14}, Ll/ᩴ۟᩵;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    if-eqz v12, :cond_4

    .line 117
    invoke-virtual {v12, v13}, Ll/᩺֨᩻;->ۧ(Ll/ܽܰ᩵;)V

    :cond_4
    move-object/from16 v1, p0

    .line 67
    invoke-direct {v1, v15}, Ll/᩺ۚ᩻;-><init>(Ll/ۛۚ᩻;)V

    return-void

    :cond_5
    move-object/from16 v1, p0

    .line 102
    :try_start_6
    new-instance v0, Ljava/io/IOException;

    const-string v3, "HTTP Range probe returned an incorrect body length"

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :catchall_1
    move-exception v0

    move-object/from16 v1, p0

    :goto_2
    move-object v3, v0

    .line 100
    :try_start_7
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    goto :goto_3

    :catchall_2
    move-exception v0

    move-object v2, v0

    :try_start_8
    invoke-virtual {v3, v2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_3
    throw v3

    :cond_6
    move-object/from16 v1, p0

    .line 98
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HTTP Range response has no body"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :catchall_3
    move-exception v0

    goto :goto_4

    :catchall_4
    move-exception v0

    move-object/from16 v1, p0

    :goto_4
    move-object v2, v0

    .line 94
    :try_start_9
    invoke-virtual {v14}, Ll/ᩴ۟᩵;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception v0

    move-object v3, v0

    :try_start_a
    invoke-virtual {v2, v3}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    :catchall_6
    move-exception v0

    goto :goto_6

    :catchall_7
    move-exception v0

    move-object/from16 v1, p0

    :goto_6
    if-eqz v12, :cond_7

    .line 117
    invoke-virtual {v12, v13}, Ll/᩺֨᩻;->ۧ(Ll/ܽܰ᩵;)V

    .line 119
    :cond_7
    throw v0

    :cond_8
    move-object/from16 v1, p0

    .line 87
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Invalid HTTP URL: "

    move-object/from16 v3, p2

    .line 0
    invoke-static {v2, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 87
    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object/from16 v1, p0

    .line 149
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HTTP User-Agent contains an invalid character"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    move-object/from16 v1, p0

    .line 146
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HTTP User-Agent is null"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static ֫(Ll/ۨܰ᩵;JJLjava/lang/String;Ljava/lang/String;)Ll/ۡ۟᩵;
    .locals 2

    .line 129
    new-instance v0, Ll/ۢ۟᩵;

    invoke-direct {v0}, Ll/ۢ۟᩵;-><init>()V

    .line 130
    invoke-virtual {v0, p0}, Ll/ۢ۟᩵;->֫(Ll/ۨܰ᩵;)V

    new-instance p0, Ljava/lang/StringBuilder;

    const-string v1, "bytes="

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p1, 0x2d

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Range"

    .line 131
    invoke-virtual {v0, p1, p0}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "Accept-Encoding"

    const-string p1, "identity"

    .line 132
    invoke-virtual {v0, p0, p1}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    const-string p0, "User-Agent"

    .line 133
    invoke-virtual {v0, p0, p6}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p5, :cond_0

    const-string p0, "If-Range"

    .line 135
    invoke-virtual {v0, p0, p5}, Ll/ۢ۟᩵;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    :cond_0
    invoke-virtual {v0}, Ll/ۢ۟᩵;->֫()Ll/ۡ۟᩵;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ᩴ۟᩵;JJJ)Ll/ۤۚ᩻;
    .locals 8

    .line 181
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result v0

    const/16 v1, 0xce

    if-ne v0, v1, :cond_9

    const-string v0, "Content-Encoding"

    .line 184
    invoke-virtual {p0, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 186
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 188
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "identity"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "utf-8"

    .line 189
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "utf8"

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    .line 190
    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unsupported HTTP content encoding: "

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    const-string v0, "Content-Range"

    .line 193
    invoke-virtual {p0, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    const/4 v1, 0x0

    goto :goto_1

    .line 194
    :cond_2
    sget-object v1, Ll/᩺ۚ᩻;->ۤ:Ljava/util/regex/Pattern;

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    :goto_1
    if-eqz v1, :cond_8

    .line 195
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_8

    const/4 v2, 0x1

    .line 202
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    const/4 v4, 0x2

    .line 203
    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v4

    const/4 v6, 0x3

    .line 204
    invoke-virtual {v1, v6}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v1, v2, p1

    if-nez v1, :cond_7

    cmp-long p1, v4, p3

    if-nez p1, :cond_7

    cmp-long p1, v6, v4

    if-lez p1, :cond_7

    const-wide/16 p1, 0x0

    cmp-long p3, p5, p1

    if-ltz p3, :cond_3

    cmp-long p3, v6, p5

    if-nez p3, :cond_7

    :cond_3
    sub-long/2addr v4, v2

    const-wide/16 p3, 0x1

    add-long/2addr v4, p3

    .line 213
    invoke-virtual {p0}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object p0

    if-eqz p0, :cond_6

    .line 217
    invoke-virtual {p0}, Ll/֡۟᩵;->ᩳ()J

    move-result-wide p3

    cmp-long p0, p3, p1

    if-ltz p0, :cond_5

    cmp-long p0, p3, v4

    if-nez p0, :cond_4

    goto :goto_2

    .line 219
    :cond_4
    new-instance p0, Ljava/io/IOException;

    const-string p1, "HTTP Range response length mismatch"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 221
    :cond_5
    :goto_2
    new-instance p0, Ll/ۤۚ᩻;

    invoke-direct {p0, v6, v7}, Ll/ۤۚ᩻;-><init>(J)V

    return-object p0

    .line 215
    :cond_6
    new-instance p0, Ljava/io/IOException;

    const-string p1, "HTTP Range response has no body"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 210
    :cond_7
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Unexpected HTTP Content-Range: "

    .line 0
    invoke-static {p1, v0}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 210
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    .line 206
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Invalid HTTP Content-Range"

    invoke-direct {p1, p2, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    .line 196
    :cond_8
    new-instance p0, Ljava/io/IOException;

    const-string p1, "Missing or invalid HTTP Content-Range"

    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 182
    :cond_9
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "HTTP server did not return a partial response: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ᩴ۟᩵;->ᩳ()I

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private ֫(Ll/ܽܰ᩵;)V
    .locals 1

    .line 437
    iget-object v0, p0, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    if-ne v0, p1, :cond_0

    const/4 v0, 0x0

    .line 438
    iput-object v0, p0, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    .line 440
    :cond_0
    iget-object v0, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v0, v0, Ll/ۛۚ᩻;->֫:Ll/᩺֨᩻;

    if-eqz v0, :cond_1

    .line 441
    invoke-virtual {v0, p1}, Ll/᩺֨᩻;->ۧ(Ll/ܽܰ᩵;)V

    :cond_1
    return-void
.end method

.method private ֫(Ll/ᩴ۟᩵;)V
    .locals 5

    .line 278
    iget-object v0, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v1, v0, Ll/ۛۚ᩻;->ܽ:Ljava/lang/String;

    iget-object v2, v0, Ll/ۛۚ᩻;->ܳ:Ljava/lang/String;

    iget-object v0, v0, Ll/ۛۚ᩻;->ܽ:Ljava/lang/String;

    invoke-static {v1}, Ll/᩺ۚ᩻;->ۧ(Ljava/lang/String;)Z

    move-result v1

    const-string v3, "Remote resource ETag changed during reading"

    const-string v4, "ETag"

    if-eqz v1, :cond_1

    .line 279
    invoke-virtual {p1, v4}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 280
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    .line 281
    :cond_0
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    if-eqz v2, :cond_3

    const-string v0, "Last-Modified"

    .line 284
    invoke-virtual {p1, v0}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 285
    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    .line 286
    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Remote resource changed during reading"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    if-eqz v0, :cond_5

    .line 289
    invoke-virtual {p1, v4}, Ll/ᩴ۟᩵;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    .line 290
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 291
    :cond_4
    new-instance p1, Ljava/io/IOException;

    invoke-direct {p1, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_0
    return-void
.end method

.method public static bridge synthetic ֫(Ljava/lang/String;)Z
    .locals 0

    .line 0
    invoke-static {p0}, Ll/᩺ۚ᩻;->ۧ(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;)Z
    .locals 6

    if-eqz p0, :cond_0

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v3, "W/"

    move-object v0, p0

    .line 172
    invoke-virtual/range {v0 .. v5}, Ljava/lang/String;->regionMatches(ZILjava/lang/String;II)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private ܽ()V
    .locals 2

    .line 297
    iget-boolean v0, p0, Ll/᩺ۚ᩻;->ۗ:Z

    if-nez v0, :cond_0

    return-void

    .line 298
    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Random access data is closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private declared-synchronized ᩳ()V
    .locals 3

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 423
    :try_start_0
    iget-object v1, p0, Ll/᩺ۚ᩻;->ۙ:Ll/ᩴ۟᩵;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 424
    iget-object v1, p0, Ll/᩺ۚ᩻;->ۙ:Ll/ᩴ۟᩵;

    invoke-virtual {v1}, Ll/ᩴ۟᩵;->close()V

    .line 425
    iput-object v2, p0, Ll/᩺ۚ᩻;->ۙ:Ll/ᩴ۟᩵;

    .line 426
    iput-object v2, p0, Ll/᩺ۚ᩻;->᩶:Ljava/io/InputStream;

    .line 428
    :cond_0
    iget-object v1, p0, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    .line 429
    iput-object v2, p0, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    if-eqz v1, :cond_1

    .line 430
    iget-object v2, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v2, v2, Ll/ۛۚ᩻;->֫:Ll/᩺֨᩻;

    if-eqz v2, :cond_1

    .line 431
    invoke-virtual {v2, v1}, Ll/᩺֨᩻;->ۧ(Ll/ܽܰ᩵;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 433
    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public static ᩳ(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    .line 162
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    .line 163
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x1f

    if-le v2, v3, :cond_2

    const/16 v3, 0x7f

    if-lt v2, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v0

    :cond_3
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 412
    iget-boolean v0, p0, Ll/᩺ۚ᩻;->ۗ:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    .line 413
    iput-boolean v0, p0, Ll/᩺ۚ᩻;->ۗ:Z

    .line 414
    iget-object v0, p0, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    if-eqz v0, :cond_0

    .line 416
    invoke-interface {v0}, Ll/ܽܰ᩵;->cancel()V

    .line 418
    :cond_0
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ᩳ()V

    :cond_1
    return-void
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 391
    iget-object v0, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v0, v0, Ll/ۛۚ᩻;->ۜ:Ll/ۨܰ᩵;

    invoke-virtual {v0}, Ll/ۨܰ᩵;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final isClosed()Z
    .locals 1

    .line 407
    iget-boolean v0, p0, Ll/᩺ۚ᩻;->ۗ:Z

    return v0
.end method

.method public final length()J
    .locals 2

    .line 369
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ܽ()V

    .line 370
    iget-object v0, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-wide v0, v0, Ll/ۛۚ᩻;->᩻:J

    return-wide v0
.end method

.method public final position()J
    .locals 2

    .line 380
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ܽ()V

    .line 381
    iget-wide v0, p0, Ll/᩺ۚ᩻;->۬:J

    return-wide v0
.end method

.method public final read([BII)I
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v2, p3

    .line 316
    invoke-direct/range {p0 .. p0}, Ll/᩺ۚ᩻;->ܽ()V

    .line 318
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ltz p2, :cond_c

    if-ltz v2, :cond_c

    .line 320
    array-length v3, v0

    sub-int v3, v3, p2

    if-gt v2, v3, :cond_c

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    .line 326
    :cond_0
    iget-wide v4, v1, Ll/᩺ۚ᩻;->۬:J

    iget-object v6, v1, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-wide v6, v6, Ll/ۛۚ᩻;->᩻:J

    const/4 v8, -0x1

    cmp-long v9, v4, v6

    if-ltz v9, :cond_1

    return v8

    .line 329
    :cond_1
    iget-object v4, v1, Ll/᩺ۚ᩻;->᩶:Ljava/io/InputStream;

    if-nez v4, :cond_7

    .line 228
    iget-object v4, v1, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-wide v4, v4, Ll/ۛۚ᩻;->᩻:J

    iget-wide v6, v1, Ll/᩺ۚ᩻;->۬:J

    sub-long/2addr v4, v6

    const-wide/32 v9, 0x80000

    .line 229
    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    add-long/2addr v4, v6

    const-wide/16 v6, 0x1

    sub-long v6, v4, v6

    .line 230
    iget-object v9, v1, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v10, v9, Ll/ۛۚ᩻;->ۜ:Ll/ۨܰ᩵;

    iget-wide v11, v1, Ll/᩺ۚ᩻;->۬:J

    iget-object v14, v9, Ll/ۛۚ᩻;->ܿ:Ljava/lang/String;

    iget-object v15, v9, Ll/ۛۚ᩻;->᩷:Ljava/lang/String;

    move-object v9, v10

    move-wide v10, v11

    move-wide v12, v6

    invoke-static/range {v9 .. v15}, Ll/᩺ۚ᩻;->֫(Ll/ۨܰ᩵;JJLjava/lang/String;Ljava/lang/String;)Ll/ۡ۟᩵;

    move-result-object v9

    .line 232
    iget-object v10, v1, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v10, v10, Ll/ۛۚ᩻;->ۧ:Ll/ܿ۟᩵;

    invoke-virtual {v10, v9}, Ll/ܿ۟᩵;->֫(Ll/ۡ۟᩵;)Ll/ܽܰ᩵;

    move-result-object v14

    .line 233
    iput-object v14, v1, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    .line 234
    iget-object v9, v1, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v9, v9, Ll/ۛۚ᩻;->֫:Ll/᩺֨᩻;

    if-eqz v9, :cond_2

    .line 236
    :try_start_0
    invoke-virtual {v9, v14}, Ll/᩺֨᩻;->֫(Ll/ܽܰ᩵;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v2, v0

    const/4 v0, 0x0

    .line 238
    iput-object v0, v1, Ll/᩺ۚ᩻;->᩸:Ll/ܽܰ᩵;

    .line 239
    throw v2

    .line 242
    :cond_2
    :goto_0
    iget-boolean v9, v1, Ll/᩺ۚ᩻;->ۗ:Z

    const-string v15, "Random access data is closed"

    if-nez v9, :cond_6

    .line 249
    :try_start_1
    invoke-interface {v14}, Ll/ܽܰ᩵;->execute()Ll/ᩴ۟᩵;

    move-result-object v12
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_5

    .line 255
    :try_start_2
    iget-boolean v9, v1, Ll/᩺ۚ᩻;->ۗ:Z

    if-nez v9, :cond_5

    .line 258
    iget-wide v10, v1, Ll/᩺ۚ᩻;->۬:J

    iget-object v9, v1, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    move-wide/from16 v16, v4

    iget-wide v3, v9, Ll/ۛۚ᩻;->᩻:J
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_3

    move-object v9, v12

    move-object v5, v12

    move-wide v12, v6

    move-object v6, v14

    move-object v7, v15

    move-wide v14, v3

    :try_start_3
    invoke-static/range {v9 .. v15}, Ll/᩺ۚ᩻;->֫(Ll/ᩴ۟᩵;JJJ)Ll/ۤۚ᩻;

    .line 259
    invoke-direct {v1, v5}, Ll/᩺ۚ᩻;->֫(Ll/ᩴ۟᩵;)V

    .line 260
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->֫()Ll/֡۟᩵;

    move-result-object v3

    invoke-virtual {v3}, Ll/֡۟᩵;->֫()Ljava/io/InputStream;

    move-result-object v3

    iput-object v3, v1, Ll/᩺ۚ᩻;->᩶:Ljava/io/InputStream;

    .line 261
    iput-object v5, v1, Ll/᩺ۚ᩻;->ۙ:Ll/ᩴ۟᩵;

    move-wide/from16 v3, v16

    .line 262
    iput-wide v3, v1, Ll/᩺ۚ᩻;->᩹:J

    .line 263
    iget-boolean v3, v1, Ll/᩺ۚ᩻;->ۗ:Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    if-nez v3, :cond_4

    .line 332
    iget-object v4, v1, Ll/᩺ۚ᩻;->᩶:Ljava/io/InputStream;

    if-eqz v4, :cond_3

    goto :goto_5

    .line 334
    :cond_3
    new-instance v0, Ljava/io/IOException;

    const-string v2, "HTTP Range response was closed"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 264
    :cond_4
    :try_start_4
    invoke-direct/range {p0 .. p0}, Ll/᩺ۚ᩻;->ᩳ()V

    .line 265
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    move-object v5, v12

    move-object v6, v14

    move-object v7, v15

    .line 256
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    :catch_1
    move-exception v0

    goto :goto_2

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    :goto_1
    move-object v5, v12

    move-object v6, v14

    goto :goto_2

    :catch_4
    move-exception v0

    goto :goto_1

    .line 268
    :goto_2
    invoke-virtual {v5}, Ll/ᩴ۟᩵;->close()V

    .line 269
    invoke-direct {v1, v6}, Ll/᩺ۚ᩻;->֫(Ll/ܽܰ᩵;)V

    .line 270
    throw v0

    :catch_5
    move-exception v0

    :goto_3
    move-object v6, v14

    goto :goto_4

    :catch_6
    move-exception v0

    goto :goto_3

    .line 251
    :goto_4
    invoke-direct {v1, v6}, Ll/᩺ۚ᩻;->֫(Ll/ܽܰ᩵;)V

    .line 252
    throw v0

    :cond_6
    move-object v6, v14

    move-object v7, v15

    .line 243
    invoke-interface {v6}, Ll/ܽܰ᩵;->cancel()V

    .line 244
    invoke-direct {v1, v6}, Ll/᩺ۚ᩻;->֫(Ll/ܽܰ᩵;)V

    .line 245
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v7}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_5
    int-to-long v2, v2

    .line 337
    iget-wide v5, v1, Ll/᩺ۚ᩻;->᩹:J

    iget-wide v9, v1, Ll/᩺ۚ᩻;->۬:J

    sub-long/2addr v5, v9

    invoke-static {v2, v3, v5, v6}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v3, v2

    const/4 v2, 0x0

    :goto_6
    if-ge v2, v3, :cond_a

    add-int v5, p2, v2

    sub-int v6, v3, v2

    .line 341
    :try_start_5
    invoke-virtual {v4, v0, v5, v6}, Ljava/io/InputStream;->read([BII)I

    move-result v5

    if-eq v5, v8, :cond_9

    if-nez v5, :cond_8

    goto :goto_6

    :cond_8
    add-int/2addr v2, v5

    goto :goto_6

    .line 343
    :cond_9
    new-instance v0, Ljava/io/EOFException;

    const-string v2, "HTTP Range response body is truncated"

    invoke-direct {v0, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_8
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_7

    :catch_7
    move-exception v0

    goto :goto_7

    :catch_8
    move-exception v0

    .line 352
    :goto_7
    invoke-direct/range {p0 .. p0}, Ll/᩺ۚ᩻;->ᩳ()V

    .line 353
    throw v0

    .line 355
    :cond_a
    iget-wide v3, v1, Ll/᩺ۚ᩻;->۬:J

    int-to-long v5, v2

    add-long/2addr v3, v5

    iput-wide v3, v1, Ll/᩺ۚ᩻;->۬:J

    .line 356
    iget-wide v5, v1, Ll/᩺ۚ᩻;->᩹:J

    cmp-long v0, v3, v5

    if-nez v0, :cond_b

    .line 357
    invoke-direct/range {p0 .. p0}, Ll/᩺ۚ᩻;->ᩳ()V

    :cond_b
    return v2

    .line 321
    :cond_c
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {v0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw v0
.end method

.method public final seek(J)V
    .locals 3

    .line 304
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ܽ()V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_1

    .line 305
    iget-object v0, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-wide v0, v0, Ll/ۛۚ᩻;->᩻:J

    cmp-long v2, p1, v0

    if-gtz v2, :cond_1

    .line 308
    iget-wide v0, p0, Ll/᩺ۚ᩻;->۬:J

    cmp-long v2, p1, v0

    if-eqz v2, :cond_0

    .line 309
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ᩳ()V

    .line 310
    iput-wide p1, p0, Ll/᩺ۚ᩻;->۬:J

    :cond_0
    return-void

    .line 306
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "Seek position is outside the remote file: "

    .line 0
    invoke-static {p1, p2, v1}, Ll/ܺܶۡ;->֫(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 306
    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final setLength(J)V
    .locals 0

    .line 375
    new-instance p1, Ljava/io/IOException;

    const-string p2, "HTTP random access data is read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final write([BII)V
    .locals 0

    .line 364
    new-instance p1, Ljava/io/IOException;

    const-string p2, "HTTP random access data is read-only"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫()Ll/ۨۚ᩻;
    .locals 1

    .line 124
    iget-object v0, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    iget-object v0, v0, Ll/ۛۚ᩻;->ᩳ:Ll/ۨۚ᩻;

    return-object v0
.end method

.method public final synthetic ֫ܽ()Ljava/nio/channels/FileChannel;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۡ()Ll/ۖۖܽ;
    .locals 2

    .line 401
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ܽ()V

    .line 402
    new-instance v0, Ll/᩺ۚ᩻;

    iget-object v1, p0, Ll/᩺ۚ᩻;->۫:Ll/ۛۚ᩻;

    invoke-direct {v0, v1}, Ll/᩺ۚ᩻;-><init>(Ll/ۛۚ᩻;)V

    return-object v0
.end method

.method public final synthetic ۧ(JJ)Ll/ۖۖܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܺۖܽ;->ۧ(Ll/ۖۖܽ;JJ)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final ܺ()V
    .locals 0

    .line 386
    invoke-direct {p0}, Ll/᩺ۚ᩻;->ܽ()V

    return-void
.end method

.method public final synthetic ܽ(JJ)Ll/ۖۖܽ;
    .locals 0

    .line 0
    invoke-static {p0, p1, p2, p3, p4}, Ll/ܺۖܽ;->֫(Ll/ۖۖܽ;JJ)Ll/ۖۖܽ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic ᩻ܽ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
