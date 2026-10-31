.class public final Ll/֫۠ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static getDefault()Ll/۟֨ᩴ;
    .locals 1

    .line 186
    sget-object v0, Ll/ᩳ᩸ᩴ;->a:Ll/۟֨ᩴ;

    return-object v0
.end method

.method public static getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;
    .locals 4

    .line 228
    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 229
    invoke-static {}, Ll/۬᩸ᩴ;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩸ᩴ;

    .line 230
    invoke-virtual {v2}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 231
    invoke-virtual {v2, p0}, Ll/۬᩸ᩴ;->getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;

    move-result-object p0

    return-object p0

    .line 234
    :cond_1
    new-instance p0, Ljava/nio/file/ProviderNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Provider \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" not found"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/nio/file/ProviderNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 1

    const/4 v0, 0x0

    .line 286
    invoke-static {p0, p1, v0}, Ll/֫۠ᩴ;->newFileSystem(Ljava/net/URI;Ljava/util/Map;Ljava/lang/ClassLoader;)Ll/۟֨ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static newFileSystem(Ljava/net/URI;Ljava/util/Map;Ljava/lang/ClassLoader;)Ll/۟֨ᩴ;
    .locals 4

    .line 331
    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    .line 334
    invoke-static {}, Ll/۬᩸ᩴ;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩸ᩴ;

    .line 335
    invoke-virtual {v2}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 337
    :try_start_0
    invoke-virtual {v2, p0, p1}, Ll/۬᩸ᩴ;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    nop

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_3

    .line 345
    const-class v1, Ll/۬᩸ᩴ;

    .line 346
    invoke-static {v1, p2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object p2

    .line 347
    invoke-virtual {p2}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩸ᩴ;

    .line 348
    invoke-virtual {v1}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 350
    :try_start_1
    invoke-virtual {v1, p0, p1}, Ll/۬᩸ᩴ;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    nop

    goto :goto_1

    .line 357
    :cond_3
    new-instance p0, Ljava/nio/file/ProviderNotFoundException;

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "Provider \""

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\" not found"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/nio/file/ProviderNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static newFileSystem(Ll/᩷۠ᩴ;Ljava/lang/ClassLoader;)Ll/۟֨ᩴ;
    .locals 3

    .line 400
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 404
    invoke-static {}, Ll/۬᩸ᩴ;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩸ᩴ;

    .line 406
    :try_start_0
    invoke-virtual {v2, p0, v0}, Ll/۬᩸ᩴ;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    nop

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    .line 413
    const-class v1, Ll/۬᩸ᩴ;

    .line 414
    invoke-static {v1, p1}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object p1

    .line 415
    invoke-virtual {p1}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/۬᩸ᩴ;

    .line 417
    :try_start_1
    invoke-virtual {v1, p0, v0}, Ll/۬᩸ᩴ;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p0

    :catch_1
    nop

    goto :goto_1

    .line 423
    :cond_1
    new-instance p0, Ljava/nio/file/ProviderNotFoundException;

    const-string p1, "Provider not found"

    invoke-direct {p0, p1}, Ljava/nio/file/ProviderNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
