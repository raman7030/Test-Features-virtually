.class public Ll/۫֨ᩴ;
.super Ljava/lang/Object;
.source "N673"


# direct methods
.method public static convertMaybeLegacyFileChannelFromLibrary(Ljava/nio/channels/FileChannel;)Ljava/nio/channels/FileChannel;
    .locals 3

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    .line 27
    :cond_0
    sget-boolean v1, Ll/ۛۚᩴ;->a:Z

    if-eqz v1, :cond_1

    return-object p0

    .line 121
    :cond_1
    sget v1, Ll/ܽ֨ᩴ;->e:I

    .line 137
    instance-of v1, p0, Ll/ܽ֨ᩴ;

    if-eqz v1, :cond_2

    .line 138
    check-cast p0, Ll/ܽ֨ᩴ;

    return-object p0

    .line 140
    :cond_2
    new-instance v1, Ll/ܽ֨ᩴ;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2, v0}, Ll/ܽ֨ᩴ;-><init>(Ljava/nio/channels/FileChannel;ZZLl/᩷۠ᩴ;)V

    return-object v1
.end method

.method public static varargs open(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/nio/channels/FileChannel;
    .locals 2

    .line 35
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 36
    invoke-static {v0, p1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    const/4 p1, 0x0

    new-array p1, p1, [Ll/᩹۠ᩴ;

    .line 43
    sget-boolean v1, Ll/ۛۚᩴ;->b:Z

    if-eqz v1, :cond_0

    .line 0
    invoke-static {p0}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p0

    invoke-static {v0}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Ll/᩺ۚᩴ;->N([Ll/᩹۠ᩴ;)[Ljava/nio/file/attribute/FileAttribute;

    move-result-object p1

    invoke-static {p0, v0, p1}, Ljava/nio/channels/FileChannel;->open(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0

    .line 47
    :cond_0
    invoke-static {p0, v0}, Ll/᩺ۚᩴ;->T(Ll/᩷۠ᩴ;Ljava/util/Set;)Ljava/nio/channels/FileChannel;

    move-result-object p0

    return-object p0
.end method
