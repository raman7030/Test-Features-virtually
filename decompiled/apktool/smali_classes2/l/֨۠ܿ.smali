.class public final Ll/֨۠ܿ;
.super Ljava/lang/Object;
.source "D94N"


# direct methods
.method public static ֫(Ljava/util/Set;Ljava/lang/String;)Ljava/util/List;
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 24
    :try_start_0
    invoke-static {v0}, Ll/ۗ᩶ܿ;->֫(Z)Ll/᩵᩶ܿ;

    move-result-object v1

    .line 25
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ۖ()Z

    move-result v2

    if-nez v2, :cond_0

    .line 26
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ᩴ()V

    return-object p0

    .line 28
    :cond_0
    :try_start_1
    new-instance v2, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-direct {v2, v3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 30
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/PackageInfo;

    .line 31
    iget-object v5, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-interface {p0, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    .line 32
    iget-object v4, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v1, p1, v2}, Ll/᩵᩶ܿ;->֫(Ljava/lang/String;Ljava/util/ArrayList;)[Z

    move-result-object p0

    .line 36
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 37
    :goto_1
    array-length v3, p0

    if-ge v0, v3, :cond_4

    .line 38
    aget-boolean v3, p0, v0

    if-eqz v3, :cond_3

    .line 39
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 47
    :cond_4
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ᩴ()V

    return-object p1

    :catchall_0
    move-exception p0

    goto :goto_2

    .line 44
    :catch_0
    :try_start_2
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_5

    .line 47
    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ᩴ()V

    :cond_5
    return-object p0

    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ll/᩵᩶ܿ;->ᩴ()V

    .line 49
    :cond_6
    throw p0
.end method
