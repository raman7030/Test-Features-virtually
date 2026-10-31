.class public final Ll/ۖ۬ܳ;
.super Ljava/lang/Object;
.source "C1US"


# direct methods
.method public static ֫(Ljava/lang/String;)J
    .locals 4

    const-string v0, "K"

    .line 94
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    const/high16 v1, 0x44800000    # 1024.0f

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    .line 95
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 96
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    mul-float p0, p0, v1

    float-to-long v0, p0

    return-wide v0

    :cond_0
    const-string v0, "M"

    .line 98
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 99
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 100
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    mul-float p0, p0, v1

    float-to-long v0, p0

    const-wide/16 v2, 0x400

    mul-long v0, v0, v2

    return-wide v0

    :cond_1
    const-string v0, "G"

    .line 102
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 103
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 104
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    mul-float p0, p0, v1

    float-to-long v0, p0

    const-wide/32 v2, 0x100000

    mul-long v0, v0, v2

    return-wide v0

    :cond_2
    const-string v0, "T"

    .line 106
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 107
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    .line 108
    invoke-static {p0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result p0

    mul-float p0, p0, v1

    float-to-long v0, p0

    const-wide/32 v2, 0x40000000

    mul-long v0, v0, v2

    return-wide v0

    .line 110
    :cond_3
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static ֫()Ll/ܺ۬ܳ;
    .locals 16

    .line 17
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "df"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    .line 18
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I

    .line 19
    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {v0}, Ll/᩹ۢ֡;->֫(Ljava/io/InputStream;)Ljava/util/List;

    move-result-object v0

    .line 20
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    const/4 v2, 0x0

    .line 21
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v2

    const-string v3, " 1k-blocks "

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v4, 0x3

    const-string v5, "/"

    const/4 v6, 0x5

    const/4 v7, 0x6

    const-string v8, " +"

    const/4 v9, 0x1

    if-nez v3, :cond_6

    :try_start_1
    const-string v3, " 1024-blocks "

    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v3, " 512-blocks "

    .line 41
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 43
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    :catch_0
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    goto :goto_0

    .line 48
    :cond_2
    invoke-virtual {v3, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 49
    array-length v10, v3

    if-ne v10, v7, :cond_1

    aget-object v10, v3, v6

    invoke-virtual {v10, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_3

    if-eqz v10, :cond_1

    .line 51
    :try_start_2
    aget-object v10, v3, v9

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    const-wide/16 v12, 0x200

    mul-long v10, v10, v12

    .line 52
    aget-object v3, v3, v4

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    mul-long v14, v14, v12

    .line 53
    new-instance v3, Ll/ܺ۬ܳ;

    invoke-direct {v3, v10, v11, v14, v15}, Ll/ܺ۬ܳ;-><init>(JJ)V

    .line 54
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_0

    :cond_3
    :try_start_3
    const-string v3, " size "

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 62
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    :catch_1
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v2, :cond_5

    const/4 v2, 0x0

    goto :goto_1

    .line 67
    :cond_5
    invoke-virtual {v3, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 68
    array-length v10, v3

    if-ne v10, v7, :cond_4

    aget-object v10, v3, v6

    invoke-virtual {v10, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    if-eqz v10, :cond_4

    .line 70
    :try_start_4
    aget-object v10, v3, v9

    invoke-static {v10}, Ll/ۖ۬ܳ;->֫(Ljava/lang/String;)J

    move-result-wide v10

    .line 71
    aget-object v3, v3, v4

    invoke-static {v3}, Ll/ۖ۬ܳ;->֫(Ljava/lang/String;)J

    move-result-wide v12

    .line 72
    new-instance v3, Ll/ܺ۬ܳ;

    invoke-direct {v3, v10, v11, v12, v13}, Ll/ܺ۬ܳ;-><init>(JJ)V

    .line 73
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_1

    .line 24
    :cond_6
    :goto_2
    :try_start_5
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x1

    :catch_2
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    if-eqz v2, :cond_8

    const/4 v2, 0x0

    goto :goto_3

    .line 29
    :cond_8
    invoke-virtual {v3, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 30
    array-length v10, v3

    if-ne v10, v7, :cond_7

    aget-object v10, v3, v6

    invoke-virtual {v10, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v10
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_3

    if-eqz v10, :cond_7

    .line 32
    :try_start_6
    aget-object v10, v3, v9

    invoke-static {v10}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v10

    const-wide/16 v12, 0x400

    mul-long v10, v10, v12

    .line 33
    aget-object v3, v3, v4

    invoke-static {v3}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v14

    mul-long v14, v14, v12

    .line 34
    new-instance v3, Ll/ܺ۬ܳ;

    invoke-direct {v3, v10, v11, v14, v15}, Ll/ܺ۬ܳ;-><init>(JJ)V

    .line 35
    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/NumberFormatException; {:try_start_6 .. :try_end_6} :catch_2
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_3

    goto :goto_3

    .line 81
    :cond_9
    :try_start_7
    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const-wide/16 v1, 0x0

    move-wide v3, v1

    move-wide v5, v3

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ll/ܺ۬ܳ;

    .line 82
    invoke-virtual {v7}, Ll/ܺ۬ܳ;->ۧ()J

    move-result-wide v8

    add-long/2addr v3, v8

    .line 83
    invoke-virtual {v7}, Ll/ܺ۬ܳ;->֫()J

    move-result-wide v7

    add-long/2addr v5, v7

    goto :goto_4

    :cond_a
    cmp-long v0, v3, v1

    if-nez v0, :cond_b

    goto :goto_5

    .line 87
    :cond_b
    new-instance v0, Ll/ܺ۬ܳ;

    invoke-direct {v0, v3, v4, v5, v6}, Ll/ܺ۬ܳ;-><init>(JJ)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    return-object v0

    :catch_3
    :goto_5
    const/4 v0, 0x0

    return-object v0
.end method
