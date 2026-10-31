.class public final Ll/ۜܿܳ;
.super Ljava/lang/Object;
.source "Y739"


# direct methods
.method public static ֫(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;
    .locals 3

    .line 82
    invoke-static {p1}, Ll/ۜܿܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 83
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 86
    new-instance v0, Landroid/net/Uri$Builder;

    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    const-string v1, "https"

    invoke-virtual {v0, v1}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object p0

    const/4 v0, 0x0

    .line 88
    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    const/16 v1, 0x2f

    .line 89
    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->indexOf(II)I

    move-result v1

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 91
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    .line 93
    :cond_0
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    .line 96
    :cond_1
    invoke-virtual {p0}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object p0

    return-object p0

    .line 84
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid HTML preview path"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    const/4 v0, 0x0

    if-eqz p0, :cond_9

    const/4 v1, 0x0

    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    const/4 v3, -0x1

    if-ne v2, v3, :cond_9

    const/16 v2, 0x5c

    invoke-virtual {p0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-eq v2, v3, :cond_0

    goto/16 :goto_4

    .line 27
    :cond_0
    new-instance v2, Ljava/util/ArrayDeque;

    invoke-direct {v2}, Ljava/util/ArrayDeque;-><init>()V

    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    :goto_0
    const/16 v5, 0x2f

    if-gt v1, v4, :cond_6

    .line 31
    invoke-virtual {p0, v5, v1}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-ne v6, v3, :cond_1

    move v6, v4

    .line 35
    :cond_1
    invoke-virtual {p0, v1, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 36
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_4

    const-string v7, "."

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    const-string v7, ".."

    .line 37
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    .line 38
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    return-object v0

    .line 41
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    goto :goto_1

    .line 43
    :cond_3
    invoke-virtual {v2, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    if-ne v6, v4, :cond_5

    goto :goto_2

    :cond_5
    add-int/lit8 v1, v6, 0x1

    goto :goto_0

    .line 51
    :cond_6
    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result p0

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 52
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz v2, :cond_7

    .line 54
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 56
    :cond_7
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 58
    :cond_8
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_9
    :goto_4
    return-object v0
.end method

.method public static ֫(Landroid/net/Uri;Ljava/lang/String;)Z
    .locals 2

    if-eqz p0, :cond_0

    const-string v0, "https"

    .line 103
    invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 104
    invoke-virtual {p0}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const-string v0, "/"

    .line 66
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 67
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    const/16 v0, 0x5c

    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    .line 70
    :cond_0
    invoke-static {p1}, Ll/ۜܿܳ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 71
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 74
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    return-object v2
.end method
