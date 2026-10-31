.class public final Ll/ۚۢ᩵;
.super Ll/ᩴۢ᩵;
.source "UA1Q"


# virtual methods
.method public final ֫(Ljava/lang/String;Ll/֡ۢ᩵;)Ljava/lang/String;
    .locals 8

    .line 134
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_2

    if-eq p2, v1, :cond_0

    return-object p1

    .line 59
    :cond_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x5

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v2, 0x28

    .line 60
    invoke-virtual {p1, v2}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v3

    const/16 v4, 0x29

    .line 61
    invoke-virtual {p1, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    const-string v6, " (2)"

    if-ltz v3, :cond_1

    if-ge v3, v5, :cond_1

    .line 64
    :try_start_0
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr v3, v1

    .line 66
    invoke-virtual {p1, v3, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v2, v1

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 67
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 69
    :catch_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 70
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :goto_0
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 33
    :cond_2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x5

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, ".local."

    .line 35
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v3

    const/16 v4, 0x2d

    .line 36
    invoke-virtual {p1, v4}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v5

    if-gez v5, :cond_3

    .line 40
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v5, 0x1

    .line 43
    :try_start_1
    invoke-virtual {p1, v6, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    add-int/2addr v6, v1

    .line 45
    invoke-virtual {p1, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move v1, v6

    goto :goto_1

    .line 49
    :catch_1
    invoke-virtual {p1, v0, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    :goto_1
    invoke-virtual {p2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 54
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
