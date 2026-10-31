.class public final Ll/ܳܶܽ;
.super Ljava/lang/Object;
.source "Q151"


# direct methods
.method public static ֫(Ll/ܶۨۡ;Ll/ܿܶܽ;)V
    .locals 1

    .line 234
    new-instance v0, Ll/֫ܶܽ;

    invoke-direct {v0, p1}, Ll/֫ܶܽ;-><init>(Ljava/lang/Object;)V

    const/4 p1, 0x0

    .line 244
    invoke-static {p0, p1, v0}, Ll/ܳܶܽ;->֫(Ll/ܶۨۡ;Ll/᩹ۛ᩷;Ll/ܿܶܽ;)[B

    return-void
.end method

.method public static ֫(Ljava/io/InputStream;Ll/۫ۘܽ;ZLl/۫ܽܽ;)Z
    .locals 7

    .line 31
    :try_start_0
    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p0

    .line 32
    iget-object v0, p0, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v0}, Ll/᩷ܿܽ;->ۧ()Ljava/lang/Iterable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۗ᩻ܽ;

    .line 33
    invoke-interface {v1}, Ll/ۗ᩻ܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_1

    .line 34
    invoke-virtual {p1}, Ll/۫ۘܽ;->matches()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_0
    return v2

    .line 38
    :cond_2
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :cond_3
    :try_start_1
    invoke-virtual {p0}, Ll/ۤۨۡ;->next()I

    move-result v0

    if-eq v0, v2, :cond_a

    const/4 v1, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_4

    goto :goto_5

    .line 59
    :cond_4
    invoke-virtual {p0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v0

    const/4 v4, 0x0

    :goto_1
    if-eq v4, v0, :cond_9

    .line 61
    invoke-virtual {p0, v4}, Ll/ۤۨۡ;->᩻(I)I

    move-result v5

    const/4 v6, 0x1

    if-eq v5, v3, :cond_5

    if-ne v5, v6, :cond_8

    .line 63
    :cond_5
    invoke-virtual {p0, v4}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v6

    invoke-virtual {p3, v6}, Ll/۫ܽܽ;->ܿ(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    if-ne v5, v3, :cond_6

    const-string v5, "?"

    .line 0
    :goto_2
    invoke-static {v5, v6}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_6
    const-string v5, "@"

    goto :goto_2

    .line 68
    :goto_3
    invoke-virtual {p1, v5}, Ll/۫ۘܽ;->reset(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_7

    .line 69
    invoke-virtual {p1}, Ll/۫ۘܽ;->matches()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_4

    :cond_7
    invoke-virtual {p1}, Ll/۫ۘܽ;->find()Z

    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v5, :cond_8

    :goto_4
    const/4 v1, 0x1

    goto :goto_5

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_9
    :goto_5
    if-eqz v1, :cond_3

    .line 45
    :try_start_2
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V

    return v2

    :cond_a
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_7

    :catchall_0
    move-exception p1

    .line 38
    :try_start_3
    invoke-virtual {p0}, Ll/ۤۨۡ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception p0

    :try_start_4
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_6
    throw p1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :goto_7
    const/4 p0, 0x0

    return p0
.end method

.method public static ֫(Ljava/io/InputStream;IILl/᩹ۛ᩷;)[B
    .locals 1

    .line 204
    :try_start_0
    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p0

    .line 205
    new-instance v0, Ll/ܽܶܽ;

    invoke-direct {v0, p1, p2}, Ll/ܽܶܽ;-><init>(II)V

    invoke-static {p0, p3, v0}, Ll/ܳܶܽ;->֫(Ll/ܶۨۡ;Ll/᩹ۛ᩷;Ll/ܿܶܽ;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ljava/io/InputStream;Ll/۫ۘܽ;ZZLjava/lang/String;Ll/᩹ۛ᩷;)[B
    .locals 12

    .line 165
    :try_start_0
    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object v0

    .line 167
    new-instance v8, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 168
    iget-object v1, v0, Ll/ܶۨۡ;->ܿ:Ll/۬ܿܽ;

    invoke-virtual {v1}, Ll/᩷ܿܽ;->ܽ()Ljava/lang/Iterable;

    move-result-object v1

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    const/4 v1, 0x0

    const/4 v10, 0x0

    :cond_0
    :goto_0
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Ll/ۗܿܽ;

    .line 169
    invoke-virtual {v11}, Ll/ۗܿܽ;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v2, p4

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-object/from16 v6, p5

    move-object v7, v8

    invoke-static/range {v1 .. v7}, Ll/ۗۛ᩷;->֫(Ljava/lang/String;Ljava/lang/String;Ll/۫ۘܽ;ZZLl/᩹ۛ᩷;Ljava/util/ArrayList;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 172
    invoke-virtual {v11, v1}, Ll/ۗܿܽ;->ۧ(Ljava/lang/String;)V

    const/4 v10, 0x1

    goto :goto_0

    :cond_1
    if-eqz v10, :cond_2

    .line 177
    invoke-virtual {v0}, Ll/ܶۨۡ;->֫()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public static ֫(Ll/ܶۨۡ;Ll/᩹ۛ᩷;Ll/ܿܶܽ;)[B
    .locals 6

    .line 250
    :try_start_0
    invoke-virtual {p0}, Ll/ܶۨۡ;->᩻()Ll/ۤۨۡ;

    move-result-object v0

    const/4 v1, 0x0

    .line 253
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/ۤۨۡ;->next()I

    move-result v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_3

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 278
    :cond_1
    invoke-virtual {v0}, Ll/ۤۨۡ;->getAttributeCount()I

    move-result v2

    const/4 v3, 0x0

    :goto_1
    if-eq v3, v2, :cond_0

    .line 280
    invoke-virtual {v0, v3}, Ll/ۤۨۡ;->᩻(I)I

    move-result v4

    .line 281
    invoke-virtual {v0, v3}, Ll/ۤۨۡ;->ᩳ(I)I

    move-result v5

    .line 282
    invoke-interface {p2, v4, v5}, Ll/ܿܶܽ;->֫(II)I

    move-result v4

    if-eq v4, v5, :cond_2

    .line 284
    invoke-virtual {p0}, Ll/ܶۨۡ;->ᩳ()I

    move-result v2

    iget v5, v0, Ll/ۤۨۡ;->᩸:I

    add-int/2addr v2, v5

    mul-int/lit8 v3, v3, 0x5

    add-int/lit8 v3, v3, 0x4

    mul-int/lit8 v3, v3, 0x4

    add-int/2addr v3, v2

    .line 285
    invoke-virtual {p0}, Ll/ܶۨۡ;->ۧ()[B

    move-result-object v2

    invoke-static {v3, v4, v2}, Ll/ܺܰۡ;->֫(II[B)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 258
    :cond_3
    invoke-virtual {v0}, Ll/ۤۨۡ;->close()V

    if-lez v1, :cond_5

    if-eqz p1, :cond_4

    .line 261
    invoke-virtual {p1, v1}, Ll/᩹ۛ᩷;->֫(I)V

    .line 263
    :cond_4
    invoke-virtual {p0}, Ll/ܶۨۡ;->ۧ()[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    :cond_5
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ۧ(Ljava/io/InputStream;IILl/᩹ۛ᩷;)[B
    .locals 1

    .line 219
    :try_start_0
    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p0

    .line 220
    new-instance v0, Ll/ᩳܶܽ;

    invoke-direct {v0, p1, p2}, Ll/ᩳܶܽ;-><init>(II)V

    invoke-static {p0, p3, v0}, Ll/ܳܶܽ;->֫(Ll/ܶۨۡ;Ll/᩹ۛ᩷;Ll/ܿܶܽ;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ܽ(Ljava/io/InputStream;IILl/᩹ۛ᩷;)[B
    .locals 1

    .line 188
    :try_start_0
    invoke-static {p0}, Ll/ܶۨۡ;->֫(Ljava/io/InputStream;)Ll/ܶۨۡ;

    move-result-object p0

    .line 189
    new-instance v0, Ll/ۧܶܽ;

    invoke-direct {v0, p1, p2}, Ll/ۧܶܽ;-><init>(II)V

    invoke-static {p0, p3, v0}, Ll/ܳܶܽ;->֫(Ll/ܶۨۡ;Ll/᩹ۛ᩷;Ll/ܿܶܽ;)[B

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    const/4 p0, 0x0

    return-object p0
.end method
