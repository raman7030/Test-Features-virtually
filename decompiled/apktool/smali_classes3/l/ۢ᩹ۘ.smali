.class public final Ll/ۢ᩹ۘ;
.super Ll/ܿ᩸ۘ;
.source "51RR"


# virtual methods
.method public final ֫(Landroid/webkit/WebView;Ljava/lang/String;)Z
    .locals 9

    const-string v0, "-->canHandleUrl---url = "

    .line 47
    invoke-virtual {v0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "openSDK_LOG.SecureJsBridge"

    invoke-static {v1, v0}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 52
    invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v0

    const-string v2, "jsbridge"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    const-string v0, "/#"

    .line 56
    invoke-virtual {p2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v0, "/"

    invoke-virtual {p2, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p2

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    .line 58
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 59
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p2

    const/4 v3, 0x7

    if-ge p2, v3, :cond_1

    goto/16 :goto_2

    :cond_1
    const/4 p2, 0x2

    .line 63
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const/4 v3, 0x3

    .line 64
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x4

    .line 65
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v5, 0x5

    .line 66
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    const-string v6, " | methodName: "

    const-string v7, " | snStr: "

    const-string v8, "-->canHandleUrl, objectName: "

    .line 0
    invoke-static {v8, p2, v6, v3, v7}, Ll/ۗ᩵֫;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 67
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v6}, Ll/ۡ᩸ۘ;->ܽ(Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    .line 74
    :cond_2
    :try_start_0
    invoke-static {v4}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 80
    new-instance v4, Ll/ۡ᩹ۘ;

    invoke-direct {v4, p1, v1, v2, v5}, Ll/ۡ᩹ۘ;-><init>(Landroid/webkit/WebView;JLjava/lang/String;)V

    .line 82
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v1, 0x1

    sub-int/2addr p1, v1

    const/4 v2, 0x6

    invoke-virtual {v0, v2, p1}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object p1

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "-->getResult, objectName: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | methodName: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "openSDK_LOG.SecureJsBridge"

    invoke-static {v2, v0}, Ll/ۡ᩸ۘ;->ᩳ(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_3

    .line 25
    :try_start_1
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "UTF-8"

    invoke-static {v6, v7}, Ll/ۗ֨ᩴ;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {p1, v5, v6}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 30
    :cond_3
    iget-object v0, p0, Ll/ܿ᩸ۘ;->֫:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/۫ܶۘ;

    if-eqz v0, :cond_4

    const-string p2, "-->handler != null"

    .line 33
    invoke-static {v2, p2}, Ll/ۡ᩸ۘ;->֫(Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    invoke-virtual {v0, v3, p1, v4}, Ll/۫ܶۘ;->֫(Ljava/lang/String;Ljava/util/List;Ll/۬ܶۘ;)V

    goto :goto_1

    .line 36
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "-->handler == null objName: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Ll/ۡ᩸ۘ;->ۧ(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    invoke-virtual {v4}, Ll/ۡ᩹ۘ;->ۧ()V

    :goto_1
    return v1

    :catch_1
    :cond_5
    :goto_2
    return v2
.end method
