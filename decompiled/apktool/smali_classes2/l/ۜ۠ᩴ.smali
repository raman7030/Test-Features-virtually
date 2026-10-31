.class public final synthetic Ll/ۜ۠ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static varargs of(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 1

    .line 147
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0, p0, p1}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/net/URI;)Ll/᩷۠ᩴ;
    .locals 4

    .line 197
    invoke-virtual {p0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    const-string v1, "file"

    .line 202
    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 203
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ᩴ;->provider()Ll/۬᩸ᩴ;

    move-result-object v0

    invoke-virtual {v0, p0}, Ll/۬᩸ᩴ;->getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0

    .line 206
    :cond_0
    invoke-static {}, Ll/۬᩸ᩴ;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/۬᩸ᩴ;

    .line 207
    invoke-virtual {v2}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 208
    invoke-virtual {v2, p0}, Ll/۬᩸ᩴ;->getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;

    move-result-object p0

    return-object p0

    .line 212
    :cond_2
    new-instance p0, Ljava/nio/file/FileSystemNotFoundException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Provider \""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\" not installed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/nio/file/FileSystemNotFoundException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 199
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Missing scheme"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
