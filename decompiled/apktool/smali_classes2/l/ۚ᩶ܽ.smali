.class public final Ll/ۚ᩶ܽ;
.super Ljava/lang/Object;
.source "Z5XS"


# direct methods
.method public static ֫(Ll/ܰܶ֡;J)Z
    .locals 13

    .line 121
    iget-object p0, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    const/4 v0, 0x0

    if-eqz p0, :cond_4

    .line 539
    iget-object p0, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 123
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_4

    aget-object v3, p0, v2

    .line 124
    sget-object v4, Ll/᩵᩶ܽ;->֫:[I

    invoke-virtual {v3}, Ll/֫᩶֡;->ۢ()Ll/᩻᩸֡;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v4, v4, v5

    const/4 v5, 0x1

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_3

    .line 179
    :pswitch_0
    check-cast v3, Ll/ܳ᩸֡;

    .line 181
    invoke-virtual {v3}, Ll/ܳ᩸֡;->ۖ()Ljava/util/Iterator;

    move-result-object v3

    .line 182
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 183
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ܿ᩸֡;

    .line 186
    iget v6, v4, Ll/ܿ᩸֡;->ۧ:I

    iget v7, v4, Ll/ܿ᩸֡;->ܽ:I

    add-int/2addr v6, v7

    sub-int/2addr v6, v5

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    .line 187
    :goto_1
    iget v10, v4, Ll/ܿ᩸֡;->ۧ:I

    if-lt v6, v10, :cond_1

    add-int/lit8 v10, v9, 0x1

    mul-int/lit8 v9, v9, 0x8

    shl-long/2addr v7, v9

    .line 188
    iget-object v9, v4, Ll/ܿ᩸֡;->֫:[B

    aget-byte v9, v9, v6

    and-int/lit16 v9, v9, 0xff

    int-to-long v11, v9

    or-long/2addr v7, v11

    add-int/lit8 v6, v6, -0x1

    move v9, v10

    goto :goto_1

    :cond_1
    cmp-long v4, v7, p1

    if-nez v4, :cond_0

    goto :goto_2

    .line 166
    :pswitch_1
    check-cast v3, Ll/ܰ᩹֡;

    .line 168
    invoke-virtual {v3}, Ll/ܰ᩹֡;->ܺ()Ljava/util/Iterator;

    move-result-object v3

    .line 169
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 171
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/᩺᩹֡;

    .line 172
    iget v4, v4, Ll/᩺᩹֡;->֫:I

    int-to-long v6, v4

    cmp-long v4, p1, v6

    if-nez v4, :cond_2

    goto :goto_2

    .line 143
    :pswitch_2
    check-cast v3, Ll/֫᩹֡;

    .line 144
    invoke-virtual {v3}, Ll/֫᩹֡;->ۜ()J

    move-result-wide v3

    cmp-long v6, v3, p1

    if-nez v6, :cond_3

    goto :goto_2

    .line 138
    :pswitch_3
    check-cast v3, Ll/ۤ᩸֡;

    .line 139
    invoke-virtual {v3}, Ll/ۤ᩸֡;->ۜ()J

    move-result-wide v3

    cmp-long v6, v3, p1

    if-nez v6, :cond_3

    goto :goto_2

    .line 134
    :pswitch_4
    check-cast v3, Ll/ᩳ᩶֡;

    invoke-interface {v3}, Ll/ᩳ᩶֡;->ۜ()J

    move-result-wide v3

    cmp-long v6, v3, p1

    if-nez v6, :cond_3

    goto :goto_2

    .line 126
    :pswitch_5
    check-cast v3, Ll/ۖ᩸֡;

    .line 127
    invoke-virtual {v3}, Ll/ۖ᩸֡;->ۜ()J

    move-result-wide v3

    cmp-long v6, v3, p1

    if-nez v6, :cond_3

    :goto_2
    return v5

    :cond_3
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_4
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ܰܶ֡;Ljava/lang/String;)Z
    .locals 7

    .line 268
    iget-object v0, p0, Ll/ܰܶ֡;->᩶:Ll/᩹ۙ֡;

    .line 231
    iget-object v0, v0, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    .line 268
    invoke-virtual {v0}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    .line 271
    :cond_0
    iget-object p0, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    const/4 v0, 0x0

    if-eqz p0, :cond_8

    .line 539
    iget-object p0, p0, Ll/ۘ᩶֡;->۫:[Ll/֫᩶֡;

    .line 273
    array-length v2, p0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_8

    aget-object v4, p0, v3

    .line 274
    sget-object v5, Ll/᩵᩶ܽ;->֫:[I

    invoke-virtual {v4}, Ll/֫᩶֡;->ۢ()Ll/᩻᩸֡;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    .line 281
    :pswitch_0
    iget-object v5, v4, Ll/֫᩶֡;->֫:Ll/᩻᩶֡;

    iget-object v5, v5, Ll/᩻᩶֡;->ۙ:Ll/ۜ᩶֡;

    sget-object v6, Ll/ۜ᩶֡;->ۗ:Ll/ۜ᩶֡;

    if-ne v5, v6, :cond_1

    .line 282
    check-cast v4, Ll/ܽ᩶֡;

    .line 283
    invoke-virtual {v4}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/ۨۙ֡;

    .line 284
    invoke-virtual {v4}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 285
    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    return v1

    .line 287
    :cond_1
    sget-object v6, Ll/ۜ᩶֡;->᩶:Ll/ۜ᩶֡;

    if-ne v5, v6, :cond_4

    .line 288
    check-cast v4, Ll/ܽ᩶֡;

    .line 289
    invoke-virtual {v4}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/᩹ۙ֡;

    .line 231
    iget-object v5, v4, Ll/᩹ۙ֡;->۫:Ll/ۨۙ֡;

    .line 290
    invoke-virtual {v5}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v5

    .line 291
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    return v1

    .line 238
    :cond_2
    iget-object v5, v4, Ll/᩹ۙ֡;->ۗ:Ll/᩺ۙ֡;

    .line 293
    invoke-virtual {v5}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v5

    .line 294
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_3

    return v1

    .line 224
    :cond_3
    iget-object v4, v4, Ll/᩹ۙ֡;->ۤ:Ll/۬ۙ֡;

    .line 296
    invoke-virtual {v4}, Ll/۬ۙ֡;->᩻()Ljava/lang/String;

    move-result-object v4

    .line 297
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    return v1

    .line 299
    :cond_4
    sget-object v6, Ll/ۜ᩶֡;->᩹:Ll/ۜ᩶֡;

    if-ne v5, v6, :cond_7

    .line 300
    check-cast v4, Ll/ܽ᩶֡;

    .line 302
    invoke-virtual {v4}, Ll/ܽ᩶֡;->ۡ()Ll/ۚۙ֡;

    move-result-object v4

    check-cast v4, Ll/ᩴۙ֡;

    .line 200
    iget-object v5, v4, Ll/ᩴۙ֡;->۬:Ll/ۨۙ֡;

    .line 303
    invoke-virtual {v5}, Ll/ۨۙ֡;->᩻()Ljava/lang/String;

    move-result-object v5

    .line 304
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    return v1

    .line 186
    :cond_5
    iget-object v5, v4, Ll/ᩴۙ֡;->ۗ:Ll/᩺ۙ֡;

    .line 306
    invoke-virtual {v5}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v5

    .line 307
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_6

    return v1

    .line 193
    :cond_6
    iget-object v4, v4, Ll/ᩴۙ֡;->۫:Ll/᩺ۙ֡;

    .line 309
    invoke-virtual {v4}, Ll/᩺ۙ֡;->᩷()Ljava/lang/String;

    move-result-object v4

    .line 310
    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_7

    return v1

    :cond_7
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    return v0

    :pswitch_data_0
    .packed-switch 0xa
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static ֫(Ll/ܰܶ֡;Ljava/util/regex/Pattern;)Z
    .locals 2

    .line 339
    new-instance v0, Ll/۫᩶ܽ;

    iget-object p0, p0, Ll/ܰܶ֡;->᩹:Ll/ۘ᩶֡;

    invoke-direct {v0, p0}, Ll/۫᩶ܽ;-><init>(Ll/ۘ᩶֡;)V

    .line 340
    new-instance p0, Ljava/lang/StringBuilder;

    const/16 v1, 0x1000

    invoke-direct {p0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 342
    :try_start_0
    new-instance v1, Ll/ۙ᩵ۚ;

    invoke-direct {v1, p0}, Ll/ۙ᩵ۚ;-><init>(Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v1}, Ll/۫᩶ܽ;->֫(Ll/ۙ᩵ۚ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 346
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/regex/Matcher;->find()Z

    move-result p0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method
