.class public final Ll/ۚ۠֫;
.super Ll/ۖ۠֫;
.source "B8HD"


# instance fields
.field public ۜ:I

.field public ܳ:[B

.field public ܿ:I

.field public ᩻:Ll/ۗ۠֫;


# virtual methods
.method public final close()V
    .locals 2

    .line 110
    iget-object v0, p0, Ll/ۚ۠֫;->ܳ:[B

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    .line 111
    iput-object v1, p0, Ll/ۚ۠֫;->ܳ:[B

    .line 112
    invoke-virtual {p0}, Ll/ۖ۠֫;->ܳ()V

    .line 114
    :cond_0
    iput-object v1, p0, Ll/ۚ۠֫;->᩻:Ll/ۗ۠֫;

    return-void
.end method

.method public final read([BII)I
    .locals 2

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    .line 91
    :cond_0
    iget v0, p0, Ll/ۚ۠֫;->ܿ:I

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 94
    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 95
    iget-object v0, p0, Ll/ۚ۠֫;->ܳ:[B

    sget-object v1, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    iget v1, p0, Ll/ۚ۠֫;->ۜ:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 96
    iget p1, p0, Ll/ۚ۠֫;->ۜ:I

    add-int/2addr p1, p3

    iput p1, p0, Ll/ۚ۠֫;->ۜ:I

    .line 97
    iget p1, p0, Ll/ۚ۠֫;->ܿ:I

    sub-int/2addr p1, p3

    iput p1, p0, Ll/ۚ۠֫;->ܿ:I

    .line 98
    invoke-virtual {p0, p3}, Ll/ۖ۠֫;->ᩳ(I)V

    return p3
.end method

.method public final ֫(Ll/ۗ۠֫;)J
    .locals 9

    .line 51
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ۧ(Ll/ۗ۠֫;)V

    .line 52
    iput-object p1, p0, Ll/ۚ۠֫;->᩻:Ll/ۗ۠֫;

    .line 53
    iget-object v0, p1, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    iget-wide v1, p1, Ll/ۗ۠֫;->ܳ:J

    invoke-virtual {v0}, Landroid/net/Uri;->normalizeScheme()Landroid/net/Uri;

    move-result-object v0

    .line 54
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v3

    const-string v4, "data"

    .line 55
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Unsupported scheme: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v4}, Ll/᩺֡֫;->֫(Ljava/lang/String;Z)V

    .line 56
    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v4, -0x1

    const-string v5, ","

    .line 1090
    invoke-virtual {v3, v5, v4}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v3

    .line 57
    array-length v4, v3

    const/4 v5, 0x2

    const/4 v6, 0x0

    if-ne v4, v5, :cond_4

    const/4 v0, 0x1

    .line 61
    aget-object v0, v3, v0

    const/4 v4, 0x0

    .line 62
    aget-object v3, v3, v4

    const-string v5, ";base64"

    invoke-virtual {v3, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 64
    :try_start_0
    invoke-static {v0, v4}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v3

    iput-object v3, p0, Ll/ۚ۠֫;->ܳ:[B
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Error while parsing Base64 encoded string: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/IllegalArgumentException;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1

    .line 71
    :cond_0
    sget-object v3, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    invoke-virtual {v3}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1076
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    .line 71
    iput-object v0, p0, Ll/ۚ۠֫;->ܳ:[B

    .line 73
    :goto_0
    iget-wide v3, p1, Ll/ۗ۠֫;->᩻:J

    iget-object v0, p0, Ll/ۚ۠֫;->ܳ:[B

    array-length v5, v0

    int-to-long v7, v5

    cmp-long v5, v3, v7

    if-gtz v5, :cond_3

    long-to-int v4, v3

    .line 77
    iput v4, p0, Ll/ۚ۠֫;->ۜ:I

    .line 78
    array-length v0, v0

    sub-int/2addr v0, v4

    iput v0, p0, Ll/ۚ۠֫;->ܿ:I

    const-wide/16 v3, -0x1

    cmp-long v5, v1, v3

    if-eqz v5, :cond_1

    int-to-long v3, v0

    .line 80
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    long-to-int v0, v3

    iput v0, p0, Ll/ۚ۠֫;->ܿ:I

    .line 82
    :cond_1
    invoke-virtual {p0, p1}, Ll/ۖ۠֫;->ܽ(Ll/ۗ۠֫;)V

    if-eqz v5, :cond_2

    return-wide v1

    .line 83
    :cond_2
    iget p1, p0, Ll/ۚ۠֫;->ܿ:I

    int-to-long v0, p1

    return-wide v0

    .line 74
    :cond_3
    iput-object v6, p0, Ll/ۚ۠֫;->ܳ:[B

    .line 75
    new-instance p1, Ll/᩹۠֫;

    const/16 v0, 0x7d8

    invoke-direct {p1, v0}, Ll/᩹۠֫;-><init>(I)V

    throw p1

    .line 58
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "Unexpected URI format: "

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v6}, Ll/ۡ᩵֫;->֫(Ljava/lang/String;Ljava/lang/IllegalArgumentException;)Ll/ۡ᩵֫;

    move-result-object p1

    throw p1
.end method

.method public final ܿ()Landroid/net/Uri;
    .locals 1

    .line 105
    iget-object v0, p0, Ll/ۚ۠֫;->᩻:Ll/ۗ۠֫;

    if-eqz v0, :cond_0

    iget-object v0, v0, Ll/ۗ۠֫;->ۜ:Landroid/net/Uri;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
