.class public final Ll/᩵۠ܿ;
.super Ljava/lang/Object;
.source "HAOC"


# direct methods
.method public static ֫()Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/data/"

    .line 23
    invoke-static {v0}, Ll/᩵۠ܿ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 49
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 50
    invoke-static {p0}, Ll/᩵۠ܿ;->ۧ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ᩴ۠ܿ;

    .line 51
    iget-object v1, v1, Ll/ᩴ۠ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/۬۠ܿ;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/data/"

    .line 19
    invoke-static {p0, v0}, Ll/᩵۠ܿ;->֫(Ll/۬۠ܿ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬۠ܿ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 12

    .line 36
    invoke-static {p1}, Ll/᩵۠ܿ;->ۧ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 37
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 38
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/ᩴ۠ܿ;

    .line 39
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Ll/ᩴ۠ܿ;->ۧ:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 40
    iget-object v5, v2, Ll/ᩴ۠ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 41
    new-instance v11, Ll/ۙ۠ܿ;

    const-wide/16 v6, -0x1

    iget-wide v8, v2, Ll/ᩴ۠ܿ;->֫:J

    const/4 v10, 0x1

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Ll/ۙ۠ܿ;-><init>(JJZ)V

    .line 42
    new-instance v2, Ll/۬۠ܿ;

    invoke-direct {v2, v3, v4, v4, v11}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    .line 43
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۧ()Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/obb/"

    .line 31
    invoke-static {v0}, Ll/᩵۠ܿ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 8

    .line 60
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 61
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    .line 62
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/PackageInfo;

    .line 63
    new-instance v4, Ljava/io/File;

    .line 0
    invoke-static {p0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    .line 63
    iget-object v6, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v1, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 64
    invoke-virtual {v4}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_0

    .line 65
    new-instance v5, Ll/ᩴ۠ܿ;

    iget-object v3, v3, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/io/File;->lastModified()J

    move-result-wide v6

    invoke-direct {v5, v6, v7, v3}, Ll/ᩴ۠ܿ;-><init>(JLjava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method public static ۧ(Ll/۬۠ܿ;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/obb/"

    .line 27
    invoke-static {p0, v0}, Ll/᩵۠ܿ;->֫(Ll/۬۠ܿ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method
