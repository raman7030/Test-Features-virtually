.class public final Ll/᩸ۢۧ;
.super Ljava/lang/Object;
.source "H8OG"


# direct methods
.method public static ֫(Ll/ᩳ֨֫;ZZ)Ll/֨ۢۧ;
    .locals 6

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    .line 325
    invoke-static {p1, p0, v0}, Ll/᩸ۢۧ;->֫(ILl/ᩳ֨֫;Z)Z

    .line 329
    :cond_0
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܺ()J

    move-result-wide v1

    long-to-int p1, v1

    .line 510
    sget-object v1, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, v1}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 334
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܺ()J

    move-result-wide v1

    long-to-int p1, v1

    .line 335
    new-array p1, p1, [Ljava/lang/String;

    :goto_0
    int-to-long v3, v0

    cmp-long v5, v3, v1

    if-gez v5, :cond_1

    .line 338
    invoke-virtual {p0}, Ll/ᩳ֨֫;->ܺ()J

    move-result-wide v3

    long-to-int v4, v3

    .line 510
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v4, v3}, Ll/ᩳ֨֫;->֫(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v3

    .line 340
    aput-object v3, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_3

    .line 343
    invoke-virtual {p0}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    and-int/lit8 p0, p0, 0x1

    if-eqz p0, :cond_2

    goto :goto_1

    :cond_2
    const-string p0, "framing bit expected to be set"

    const/4 p1, 0x0

    .line 344
    invoke-static {p0, p1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0

    .line 348
    :cond_3
    :goto_1
    new-instance p0, Ll/֨ۢۧ;

    invoke-direct {p0, p1}, Ll/֨ۢۧ;-><init>([Ljava/lang/String;)V

    return-object p0
.end method

.method public static ֫(Ljava/util/List;)Ll/᩻᩵֫;
    .locals 7

    .line 362
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 363
    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    .line 364
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 365
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v4, "="

    const/4 v5, 0x2

    .line 1105
    invoke-virtual {v3, v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v4

    .line 366
    array-length v6, v4

    if-eq v6, v5, :cond_0

    const-string v4, "Failed to parse Vorbis comment: "

    .line 367
    invoke-virtual {v4, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ll/᩶ۚ֫;->ᩳ(Ljava/lang/String;)V

    goto :goto_1

    .line 371
    :cond_0
    aget-object v3, v4, v1

    const-string v5, "METADATA_BLOCK_PICTURE"

    invoke-virtual {v3, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    .line 376
    :try_start_0
    aget-object v3, v4, v5

    invoke-static {v3, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    .line 377
    new-instance v4, Ll/ᩳ֨֫;

    invoke-direct {v4, v3}, Ll/ᩳ֨֫;-><init>([B)V

    invoke-static {v4}, Ll/ۗۡۧ;->֫(Ll/ᩳ֨֫;)Ll/ۗۡۧ;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    const-string v4, "Failed to parse vorbis picture"

    .line 379
    invoke-static {v4, v3}, Ll/᩶ۚ֫;->ܽ(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 382
    :cond_1
    new-instance v3, Ll/۬ܺۧ;

    aget-object v6, v4, v1

    aget-object v4, v4, v5

    .line 30
    invoke-direct {v3, v6, v4}, Ll/۬ۡۧ;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 383
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 387
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_3

    const/4 p0, 0x0

    goto :goto_2

    :cond_3
    new-instance p0, Ll/᩻᩵֫;

    invoke-direct {p0, v0}, Ll/᩻᩵֫;-><init>(Ljava/util/List;)V

    :goto_2
    return-object p0
.end method

.method public static ֫(ILl/ᩳ֨֫;Z)Z
    .locals 3

    .line 402
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result v0

    const/4 v1, 0x7

    const/4 v2, 0x0

    if-ge v0, v1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_1

    .line 406
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    const-string p2, "too short header: "

    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 407
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֫()I

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 406
    invoke-static {p0, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0

    .line 411
    :cond_1
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result v0

    if-eq v0, p0, :cond_3

    if-eqz p2, :cond_2

    goto :goto_1

    .line 415
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "expected header type "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 416
    invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 415
    invoke-static {p0, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0

    .line 420
    :cond_3
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    const/16 v0, 0x76

    if-ne p0, v0, :cond_5

    .line 421
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    const/16 v0, 0x6f

    if-ne p0, v0, :cond_5

    .line 422
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    const/16 v0, 0x72

    if-ne p0, v0, :cond_5

    .line 423
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    const/16 v0, 0x62

    if-ne p0, v0, :cond_5

    .line 424
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    const/16 v0, 0x69

    if-ne p0, v0, :cond_5

    .line 425
    invoke-virtual {p1}, Ll/ᩳ֨֫;->֨()I

    move-result p0

    const/16 p1, 0x73

    if-eq p0, p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 p0, 0x1

    return p0

    :cond_5
    :goto_0
    if-eqz p2, :cond_6

    :goto_1
    const/4 p0, 0x0

    return p0

    :cond_6
    const-string p0, "expected characters \'vorbis\'"

    .line 429
    invoke-static {p0, v2}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/Throwable;)Ll/ۡ᩵֫;

    move-result-object p0

    throw p0
.end method
