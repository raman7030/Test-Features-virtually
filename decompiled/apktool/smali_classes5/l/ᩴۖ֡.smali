.class public Ll/ᩴۖ֡;
.super Ll/ܽۖ֡;
.source "55PX"


# virtual methods
.method public final ֫(Ljava/io/BufferedReader;)Ljava/lang/String;
    .locals 3

    .line 211
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    .line 212
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    if-eqz v0, :cond_3

    const-string v2, "Directory"

    .line 214
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "Total"

    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    .line 219
    :cond_0
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    .line 223
    :cond_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 215
    :cond_2
    :goto_1
    invoke-virtual {p1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 225
    :cond_3
    :goto_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    move-result p1

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Ll/ۗܺ֡;
    .locals 4

    .line 87
    new-instance v0, Ll/ۗܺ֡;

    const-string v1, "d-MMM-yyyy HH:mm:ss"

    const/4 v2, 0x0

    const-string v3, "VMS"

    invoke-direct {v0, v3, v1, v2}, Ll/ۗܺ֡;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 17

    move-object/from16 v0, p0

    .line 127
    invoke-virtual/range {p0 .. p1}, Ll/ܽۖ֡;->ۧ(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_7

    .line 128
    new-instance v1, Ll/ۤܺ֡;

    invoke-direct {v1}, Ll/ۤܺ֡;-><init>()V

    move-object/from16 v3, p1

    .line 129
    invoke-virtual {v1, v3}, Ll/ۤܺ֡;->ᩳ(Ljava/lang/String;)V

    const/4 v3, 0x1

    .line 130
    invoke-virtual {v0, v3}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x2

    .line 131
    invoke-virtual {v0, v5}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v6

    .line 132
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v8, 0x3

    invoke-virtual {v0, v8}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " "

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v9, 0x4

    invoke-virtual {v0, v9}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    const/4 v9, 0x5

    .line 133
    invoke-virtual {v0, v9}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v9

    const/16 v10, 0x9

    .line 135
    invoke-virtual {v0, v10}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0xa

    .line 136
    invoke-virtual {v0, v11}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0xb

    .line 137
    invoke-virtual {v0, v12}, Ll/ܽۖ֡;->֫(I)Ljava/lang/String;

    move-result-object v12

    filled-new-array {v10, v11, v12}, [Ljava/lang/String;

    move-result-object v10

    .line 139
    :try_start_0
    invoke-virtual {v0, v7}, Ll/ܽۖ֡;->ܽ(Ljava/lang/String;)Ljava/util/Calendar;

    move-result-object v7

    invoke-virtual {v1, v7}, Ll/ۤܺ֡;->֫(Ljava/util/Calendar;)V
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    .line 146
    :goto_0
    new-instance v7, Ljava/util/StringTokenizer;

    const-string v11, ","

    invoke-direct {v7, v9, v11}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 147
    invoke-virtual {v7}, Ljava/util/StringTokenizer;->countTokens()I

    move-result v9

    if-eq v9, v3, :cond_1

    if-eq v9, v5, :cond_0

    move-object v7, v2

    goto :goto_1

    .line 153
    :cond_0
    invoke-virtual {v7}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v2

    .line 154
    invoke-virtual {v7}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    .line 150
    :cond_1
    invoke-virtual {v7}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v7

    :goto_1
    const-string v9, ".DIR"

    .line 161
    invoke-virtual {v4, v9}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v9

    const/4 v11, -0x1

    const/4 v12, 0x0

    if-eq v9, v11, :cond_2

    .line 162
    invoke-virtual {v1, v3}, Ll/ۤܺ֡;->֫(I)V

    goto :goto_2

    .line 164
    :cond_2
    invoke-virtual {v1, v12}, Ll/ۤܺ֡;->֫(I)V

    .line 171
    :goto_2
    invoke-virtual {v1, v4}, Ll/ۤܺ֡;->ܽ(Ljava/lang/String;)V

    .line 174
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v13

    const-wide/16 v15, 0x200

    mul-long v13, v13, v15

    .line 175
    invoke-virtual {v1, v13, v14}, Ll/ۤܺ֡;->֫(J)V

    .line 177
    invoke-virtual {v1, v2}, Ll/ۤܺ֡;->֫(Ljava/lang/String;)V

    .line 178
    invoke-virtual {v1, v7}, Ll/ۤܺ֡;->ܿ(Ljava/lang/String;)V

    const/4 v2, 0x0

    :goto_3
    if-ge v2, v8, :cond_6

    .line 187
    aget-object v4, v10, v2

    const/16 v6, 0x52

    .line 189
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_3

    const/4 v6, 0x1

    goto :goto_4

    :cond_3
    const/4 v6, 0x0

    :goto_4
    invoke-virtual {v1, v2, v12, v6}, Ll/ۤܺ֡;->֫(IIZ)V

    const/16 v6, 0x57

    .line 190
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v6

    if-ltz v6, :cond_4

    const/4 v6, 0x1

    goto :goto_5

    :cond_4
    const/4 v6, 0x0

    :goto_5
    invoke-virtual {v1, v2, v3, v6}, Ll/ۤܺ֡;->֫(IIZ)V

    const/16 v6, 0x45

    .line 191
    invoke-virtual {v4, v6}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_5

    const/4 v4, 0x1

    goto :goto_6

    :cond_5
    const/4 v4, 0x0

    :goto_6
    invoke-virtual {v1, v2, v5, v4}, Ll/ۤܺ֡;->֫(IIZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    return-object v1

    :cond_7
    return-object v2
.end method
