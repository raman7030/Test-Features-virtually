.class public final Ll/ۗۡ᩻;
.super Ll/ۗۖ֡;
.source "9AFA"


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 33
    check-cast p1, Ll/ۗܺ᩻;

    const-string v0, ": "

    .line 65
    iget v1, p1, Ll/ۗܺ᩻;->᩷:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 66
    new-instance v1, Ll/ۤܺ᩻;

    iget-boolean v3, p1, Ll/ۗܺ᩻;->ۧ:Z

    xor-int/2addr v3, v2

    invoke-direct {v1, v3, p1}, Ll/ۤܺ᩻;-><init>(ZLl/ۗܺ᩻;)V

    .line 67
    iget-boolean v3, p1, Ll/ۗܺ᩻;->ۜ:Z

    invoke-virtual {v1, v3}, Ll/ۤܺ᩻;->ۧ(Z)V

    goto :goto_0

    .line 70
    :cond_0
    new-instance v1, Ll/۫ܺ᩻;

    invoke-direct {v1, p1}, Ll/۫ܺ᩻;-><init>(Ll/ۗܺ᩻;)V

    .line 37
    :goto_0
    iget-object v3, p1, Ll/ۗܺ᩻;->֫:Ljava/lang/String;

    const-string v4, "UTF-8"

    .line 38
    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "UTF8"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    .line 39
    :cond_2
    :goto_1
    invoke-interface {v1, v3}, Ll/۬ܺ᩻;->ۜ(Ljava/lang/String;)V

    .line 40
    invoke-static {v3}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 22
    :try_start_0
    iget-object v3, p1, Ll/ۗܺ᩻;->ܽ:Ljava/lang/String;

    iget v4, p1, Ll/ۗܺ᩻;->᩻:I

    invoke-interface {v1, v4, v3}, Ll/۬ܺ᩻;->֫(ILjava/lang/String;)V

    .line 23
    iget-boolean v3, p1, Ll/ۗܺ᩻;->ܿ:Z

    if-eqz v3, :cond_3

    .line 24
    invoke-interface {v1}, Ll/۬ܺ᩻;->֫()V

    .line 25
    instance-of v3, v1, Ll/ۤܺ᩻;

    if-eqz v3, :cond_3

    move-object v3, v1

    check-cast v3, Ll/ۤܺ᩻;

    .line 26
    invoke-virtual {v3}, Ll/ܰܺ֡;->ܰ()V

    .line 27
    invoke-virtual {v3}, Ll/ܰܺ֡;->۟()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :cond_3
    const v3, 0x7f120afe

    .line 49
    :try_start_1
    iget-object v4, p1, Ll/ۗܺ᩻;->ۢ:Ljava/lang/String;

    .line 50
    iget-object p1, p1, Ll/ۗܺ᩻;->ܳ:Ljava/lang/String;

    const-string v5, "anonymous"

    .line 51
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_4

    const-string p1, "anonymous@"

    .line 54
    :cond_4
    invoke-interface {v1, v4, p1}, Ll/۬ܺ᩻;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-eqz p1, :cond_7

    if-eqz v2, :cond_5

    const-string p1, "OPTS"

    const-string v0, "UTF8 ON"

    .line 64
    invoke-interface {v1, p1, v0}, Ll/۬ܺ᩻;->ܽ(Ljava/lang/String;Ljava/lang/String;)I

    .line 66
    :cond_5
    invoke-interface {v1}, Ll/۬ܺ᩻;->ܳ()Ljava/lang/String;

    .line 67
    invoke-interface {v1}, Ll/۬ܺ᩻;->ᩴ()Z

    move-result p1

    if-eqz p1, :cond_6

    return-object v1

    .line 68
    :cond_6
    invoke-interface {v1}, Ll/۬ܺ᩻;->᩻()Ljava/io/IOException;

    const/4 p1, 0x0

    throw p1

    .line 60
    :cond_7
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object p1

    .line 61
    new-instance v2, Ll/᩵ۤۡ;

    .line 0
    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 61
    invoke-interface {v1}, Ll/۬ܺ᩻;->ۖ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 14
    invoke-direct {v2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 61
    throw v2

    :catch_0
    move-exception p1

    .line 56
    invoke-static {v3}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 57
    new-instance v2, Ljava/io/IOException;

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 57
    invoke-direct {v2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :catch_1
    move-exception p1

    const v1, 0x7f1201e7

    .line 44
    invoke-static {v1}, Ll/ۙ᩸᩷;->ۧ(I)Ljava/lang/String;

    move-result-object v1

    .line 45
    new-instance v2, Ljava/io/IOException;

    .line 0
    invoke-static {v1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p1, v0}, Ll/᩵ۡ᩷;->֫(Ljava/lang/Exception;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    .line 45
    invoke-direct {v2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۤۖ֡;)V
    .locals 0

    .line 33
    check-cast p1, Ll/ۗܺ᩻;

    .line 76
    :try_start_0
    invoke-interface {p2}, Ll/ۤۖ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ܺ᩻;

    .line 77
    invoke-interface {p1}, Ll/۬ܺ᩻;->ܺ()Z

    move-result p2

    if-eqz p2, :cond_0

    .line 78
    invoke-interface {p1}, Ll/۬ܺ᩻;->ۡ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/ۤۖ֡;
    .locals 1

    .line 33
    check-cast p1, Ll/۬ܺ᩻;

    .line 105
    new-instance v0, Ll/ܽۘ֡;

    invoke-direct {v0, p1}, Ll/ܽۘ֡;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;Ll/ۤۖ֡;)Z
    .locals 6

    .line 33
    check-cast p1, Ll/ۗܺ᩻;

    .line 87
    invoke-interface {p2}, Ll/ۤۖ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/۬ܺ᩻;

    .line 88
    invoke-interface {p1}, Ll/۬ܺ᩻;->ۘ()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 91
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p2}, Ll/ۤۖ֡;->ܶ֫()Ll/ۘ᩹ᩴ;

    move-result-object p2

    invoke-virtual {p2}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide v4

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, v2, v4

    if-ltz p2, :cond_1

    const-wide/16 v4, 0x7d0

    cmp-long p2, v2, v4

    if-gtz p2, :cond_1

    const/4 p1, 0x1

    return p1

    .line 97
    :cond_1
    :try_start_0
    invoke-interface {p1}, Ll/۬ܺ᩻;->ۢ()Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    return v1
.end method
