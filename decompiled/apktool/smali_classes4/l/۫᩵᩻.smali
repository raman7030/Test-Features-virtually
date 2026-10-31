.class public final Ll/۫᩵᩻;
.super Ll/ۗۖ֡;
.source "R9JP"


# virtual methods
.method public final ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 119
    check-cast p1, Ll/ۛ᩵᩻;

    .line 124
    invoke-virtual {p1}, Ll/ۛ᩵᩻;->ܽ()Ll/۫֡᩻;

    move-result-object v0

    .line 125
    invoke-virtual {p1}, Ll/ۛ᩵᩻;->ᩳ()Ll/۟᩵᩻;

    move-result-object v1

    invoke-virtual {p1}, Ll/ۛ᩵᩻;->֫()Ll/ۨ᩵᩻;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3, v1, v2}, Ll/֫֡᩻;->֫(ZLl/۟᩵᩻;Ll/ۨ᩵᩻;)Ll/ۙ֫ۘ;

    move-result-object v1

    .line 132
    new-instance v2, Ll/᩹֫ۘ;

    invoke-direct {v2, v1}, Ll/᩹֫ۘ;-><init>(Ll/ۙ֫ۘ;)V

    .line 134
    :try_start_0
    iget-object v1, v0, Ll/۫֡᩻;->ۧ:Ljava/lang/String;

    iget-object v4, v0, Ll/۫֡᩻;->ܳ:Ljava/lang/String;

    iget v5, v0, Ll/۫֡᩻;->ܿ:I

    invoke-virtual {v2, v5, v1}, Ll/᩹֫ۘ;->ۧ(ILjava/lang/String;)Ll/᩻ۧۘ;

    move-result-object v1

    .line 135
    invoke-virtual {p1}, Ll/ۛ᩵᩻;->ᩳ()Ll/۟᩵᩻;

    move-result-object v5

    .line 705
    sget-object v6, Ll/۟᩵᩻;->ۙ:Ll/۟᩵᩻;

    if-ne v5, v6, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-eqz v3, :cond_2

    .line 136
    invoke-virtual {v1}, Ll/᩻ۧۘ;->᩻()Ll/ۜۧۘ;

    move-result-object v3

    invoke-virtual {v3}, Ll/ۜۧۘ;->ۢ()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    .line 137
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "SMB server requires signing"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 147
    :cond_2
    :goto_0
    invoke-static {v0}, Ll/֫֡᩻;->֫(Ll/۫֡᩻;)Ll/ۗ֫ۘ;

    move-result-object v3

    const-string v5, "guest"

    .line 776
    iget-object v0, v0, Ll/۫֡᩻;->ᩳ:Ljava/lang/String;

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-eqz v6, :cond_3

    goto :goto_1

    .line 778
    :cond_3
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 149
    :cond_4
    :goto_1
    invoke-virtual {v1, v3}, Ll/᩻ۧۘ;->֫(Ll/ۗ֫ۘ;)Ll/ܶܽۘ;

    move-result-object v0

    .line 158
    new-instance v3, Ll/ۤ᩵᩻;

    invoke-direct {v3, p1, v2, v1, v0}, Ll/ۤ᩵᩻;-><init>(Ll/ۛ᩵᩻;Ll/᩹֫ۘ;Ll/᩻ۧۘ;Ll/ܶܽۘ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v3

    :catch_0
    move-exception p1

    .line 160
    invoke-static {v2}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    .line 167
    throw p1
.end method

.method public final ֫(Ljava/lang/Object;Ll/ۤۖ֡;)V
    .locals 0

    .line 119
    check-cast p1, Ll/ۛ᩵᩻;

    .line 173
    invoke-interface {p2}, Ll/ۤۖ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩵᩻;

    iget-object p1, p1, Ll/ۤ᩵᩻;->֫:Ll/᩹֫ۘ;

    invoke-static {p1}, Ll/֡ۤۡ;->֫(Ljava/lang/AutoCloseable;)V

    return-void
.end method

.method public final ۧ(Ljava/lang/Object;)Ll/ۤۖ֡;
    .locals 1

    .line 119
    check-cast p1, Ll/ۤ᩵᩻;

    .line 200
    new-instance v0, Ll/᩺᩵᩻;

    invoke-direct {v0, p1}, Ll/᩺᩵᩻;-><init>(Ll/ۤ᩵᩻;)V

    return-object v0
.end method

.method public final ۧ(Ljava/lang/Object;Ll/ۤۖ֡;)Z
    .locals 5

    .line 119
    check-cast p1, Ll/ۛ᩵᩻;

    .line 178
    invoke-interface {p2}, Ll/ۤۖ֡;->ۙۧ()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll/ۤ᩵᩻;

    .line 179
    iget-object p1, p1, Ll/ۤ᩵᩻;->ۧ:Ll/᩻ۧۘ;

    invoke-virtual {p1}, Ll/᩻ۧۘ;->᩵()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_1

    .line 182
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p2}, Ll/ۤۖ֡;->ܶ֫()Ll/ۘ᩹ᩴ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ۘ᩹ᩴ;->toEpochMilli()J

    move-result-wide v2

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    const/4 p1, 0x1

    cmp-long v4, v0, v2

    if-ltz v4, :cond_1

    const-wide/16 v2, 0x7d0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_1

    goto :goto_0

    .line 188
    :cond_1
    :try_start_0
    check-cast p2, Ll/᩺᩵᩻;

    .line 189
    invoke-virtual {p2}, Ll/᩺᩵᩻;->֫()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 190
    invoke-virtual {p2}, Ll/᩺᩵᩻;->ۧ()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_2
    :goto_0
    return p1

    :catch_0
    :goto_1
    const/4 p1, 0x0

    return p1
.end method
