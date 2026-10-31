.class public final Ll/ۨᩴܿ;
.super Ll/ܺ֡ܿ;
.source "898C"


# direct methods
.method public static synthetic ֫(Ljava/io/File;Ljava/lang/String;)Ll/ܶ᩵ܿ;
    .locals 8

    if-eqz p1, :cond_1

    .line 74
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    .line 75
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۨᩴܿ;->ۖ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 76
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    move-result v6

    .line 77
    new-instance v7, Ll/ۙ۠ܿ;

    if-eqz v6, :cond_0

    const-wide/16 v1, -0x1

    goto :goto_0

    .line 79
    :cond_0
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v1

    :goto_0
    move-wide v2, v1

    .line 80
    invoke-virtual {p0}, Ljava/io/File;->lastModified()J

    move-result-wide v4

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Ll/ۙ۠ܿ;-><init>(JJZ)V

    .line 82
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    const-string v0, "/"

    .line 0
    invoke-static {p1, v0}, Ll/۟֫ᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    .line 82
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0, v7}, Ll/ܿ֡ܿ;->֫(Ljava/io/File;Ljava/lang/String;Ll/ۙ۠ܿ;)Ll/ܶ᩵ܿ;

    move-result-object p0

    goto :goto_1

    .line 84
    :cond_1
    invoke-virtual {p0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ll/ۨᩴܿ;->ۖ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/String;

    invoke-static {p0, p1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p0

    .line 87
    :goto_1
    instance-of p1, p0, Ll/᩸᩸ܿ;

    if-eqz p1, :cond_2

    .line 88
    check-cast p0, Ll/᩸᩸ܿ;

    invoke-interface {p0}, Ll/᩸᩸ܿ;->֫()Ll/ܶ᩵ܿ;

    move-result-object p0

    :cond_2
    return-object p0
.end method

.method public static ۖ(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "\u200bAndroid"

    .line 119
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    if-gez v0, :cond_1

    return-object p0

    .line 123
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "Android"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v0, 0x8

    .line 0
    invoke-static {v0, p0, v1}, Ll/᩶ۢۢ;->֫(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getName()Ljava/lang/String;
    .locals 2

    .line 99
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\u200bAndroid"

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "Android"

    :cond_0
    return-object v0
.end method

.method public final getParent()Ljava/lang/String;
    .locals 1

    .line 110
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-static {v0}, Ll/ۨᩴܿ;->ۖ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۚۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۧ(Z)Ljava/util/List;
    .locals 4

    .line 53
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_0

    .line 55
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    return-object p1

    .line 57
    :cond_0
    invoke-static {}, Ll/ܿ֡ܿ;->ᩳ()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 58
    invoke-virtual {p0}, Ll/ۨᩴܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    .line 59
    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "/android/data"

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "/android/obb"

    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 61
    :cond_1
    invoke-static {v1}, Ll/ܿ֡ܿ;->֫(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Android/data"

    .line 62
    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "Android/obb"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    .line 70
    :cond_3
    :goto_0
    invoke-static {v0}, Ll/᩹۬ᩴ;->stream([Ljava/lang/Object;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    new-instance v2, Ll/ۤᩴܿ;

    invoke-direct {v2, p1}, Ll/ۤᩴܿ;-><init>(Z)V

    .line 71
    invoke-interface {v0, v2}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v0, Ll/ۛᩴܿ;

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1}, Ll/ۛᩴܿ;-><init>(ILjava/io/Serializable;)V

    .line 72
    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->map(Ljava/util/function/Function;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    .line 92
    invoke-static {}, Ll/᩺ۨᩴ;->toList()Ll/ۨۨᩴ;

    move-result-object v0

    invoke-interface {p1, v0}, Ll/ܿ᩺ᩴ;->collect(Ll/ۨۨᩴ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1
.end method

.method public final ۧ(Ll/ܿۖ᩷;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final ܺ֫()Ljava/lang/String;
    .locals 1

    .line 104
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 42
    invoke-static {v0}, Ll/ۨᩴܿ;->ۖ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩶ۧ()Ljava/lang/String;
    .locals 1

    .line 37
    iget-object v0, p0, Ll/ܺ֡ܿ;->ۗ:Ljava/io/File;

    invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
