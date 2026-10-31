.class public final Ll/ۚ۠ܿ;
.super Ljava/lang/Object;
.source "C9A2"


# direct methods
.method public static ֫()Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/data/"

    .line 28
    invoke-static {v0}, Ll/ۚ۠ܿ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 2

    .line 54
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 55
    invoke-static {p0}, Ll/ۚ۠ܿ;->ۧ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/֡۠ܿ;

    .line 56
    iget-object v1, v1, Ll/֡۠ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ֫(Ll/۬۠ܿ;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/data/"

    .line 24
    invoke-static {p0, v0}, Ll/ۚ۠ܿ;->֫(Ll/۬۠ܿ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/۬۠ܿ;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 12

    .line 41
    invoke-static {p1}, Ll/ۚ۠ܿ;->ۧ(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    const/4 v1, 0x0

    .line 42
    :goto_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    .line 43
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll/֡۠ܿ;

    .line 44
    new-instance v3, Ljava/io/File;

    invoke-virtual {p0}, Ll/۬۠ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v2, Ll/֡۠ܿ;->ۧ:Ljava/lang/String;

    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 0
    invoke-static {p1}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    .line 45
    iget-object v5, v2, Ll/֡۠ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    .line 46
    new-instance v11, Ll/ۙ۠ܿ;

    const-wide/16 v6, -0x1

    iget-wide v8, v2, Ll/֡۠ܿ;->֫:J

    const/4 v10, 0x1

    move-object v5, v11

    invoke-direct/range {v5 .. v10}, Ll/ۙ۠ܿ;-><init>(JJZ)V

    .line 47
    new-instance v2, Ll/۬۠ܿ;

    invoke-direct {v2, v3, v4, v4, v11}, Ll/۬۠ܿ;-><init>(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;Ll/ۙ۠ܿ;)V

    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static ۧ()Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/obb/"

    .line 36
    invoke-static {v0}, Ll/ۚ۠ܿ;->֫(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method public static ۧ(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 9

    .line 65
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    sget-object v2, Ll/۬۠ܿ;->ܰ:Ljava/util/HashMap;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 68
    invoke-virtual {v3, p0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 69
    new-instance v5, Landroid/net/Uri$Builder;

    invoke-direct {v5}, Landroid/net/Uri$Builder;-><init>()V

    const-string v6, "content"

    .line 70
    invoke-virtual {v5, v6}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v6, "com.android.externalstorage.documents"

    .line 71
    invoke-virtual {v5, v6}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v6, "tree"

    .line 72
    invoke-virtual {v5, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v6, "primary:"

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 73
    invoke-virtual {v5, v7}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    const-string v7, "document"

    .line 74
    invoke-virtual {v5, v7}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    invoke-virtual {v6, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 75
    invoke-virtual {v5, v6}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v5

    .line 76
    invoke-virtual {v5}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v5

    .line 77
    new-instance v6, Ll/ܳ᩸ܿ;

    invoke-direct {v6, v5}, Ll/ܳ᩸ܿ;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v6}, Ll/ܳ᩸ܿ;->ۤ()Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_0

    .line 80
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v5

    invoke-virtual {v3, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-string v5, "/"

    .line 81
    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/4 v5, 0x1

    .line 0
    invoke-static {v5, v4, v3}, Ll/ܶ᩷ۘ;->֫(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_2
    const/16 v4, 0x2f

    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_0

    .line 85
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    new-instance v4, Ll/֡۠ܿ;

    new-instance v5, Ljava/io/File;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v6

    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v5

    invoke-direct {v4, v5, v6, v3}, Ll/֡۠ܿ;-><init>(JLjava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    .line 90
    :cond_3
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 91
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    .line 92
    invoke-static {}, Ll/ۙ᩸᩷;->ۘ()Landroid/content/pm/PackageManager;

    move-result-object v3

    invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/PackageInfo;

    .line 93
    new-instance v5, Ljava/io/File;

    .line 0
    invoke-static {p0}, Ll/ۚ۬ۚ;->֫(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    .line 93
    iget-object v7, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v0, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 94
    iget-object v6, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-virtual {v5}, Ljava/io/File;->isDirectory()Z

    move-result v6

    if-eqz v6, :cond_4

    .line 95
    new-instance v6, Ll/֡۠ܿ;

    iget-object v4, v4, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v5}, Ljava/io/File;->lastModified()J

    move-result-wide v7

    invoke-direct {v6, v7, v8, v4}, Ll/֡۠ܿ;-><init>(JLjava/lang/String;)V

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    return-object v1
.end method

.method public static ۧ(Ll/۬۠ܿ;)Ljava/util/ArrayList;
    .locals 1

    const-string v0, "Android/obb/"

    .line 32
    invoke-static {p0, v0}, Ll/ۚ۠ܿ;->֫(Ll/۬۠ܿ;Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method
