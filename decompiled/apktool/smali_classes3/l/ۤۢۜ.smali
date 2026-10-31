.class public final Ll/ۤۢۜ;
.super Ljava/lang/Object;
.source "E6ZJ"


# instance fields
.field public final ֫:Ll/֡ۛ᩻;


# direct methods
.method public constructor <init>(Ll/֡ۛ᩻;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ۤۢۜ;->֫:Ll/֡ۛ᩻;

    return-void
.end method

.method public static ֫(Ljava/util/TreeSet;Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_1

    .line 121
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    :try_start_0
    const-string v0, "managedPath"

    .line 125
    invoke-static {p1, v0}, Ll/۫ۡۜ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "/"

    .line 126
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 127
    invoke-virtual {p0, p1}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ll/ۗۛ᩻; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public static ֫(Ljava/util/TreeSet;[Ljava/io/File;Ljava/lang/String;)V
    .locals 6

    if-nez p1, :cond_0

    goto :goto_3

    .line 91
    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    aget-object v2, p1, v1

    const/4 v3, 0x0

    if-nez v2, :cond_1

    move-object v4, v3

    goto :goto_1

    .line 92
    :cond_1
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v4

    :goto_1
    if-eqz v4, :cond_2

    .line 94
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 95
    invoke-virtual {v4}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    .line 94
    :goto_2
    invoke-static {p0, v3}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_3
    return-void
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 9

    .line 37
    iget-object v0, p0, Ll/ۤۢۜ;->֫:Ll/֡ۛ᩻;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ll/ۙ᩸᩷;->ܿ()Landroid/app/Application;

    move-result-object v0

    .line 38
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    .line 39
    new-instance v2, Ljava/util/TreeSet;

    invoke-direct {v2}, Ljava/util/TreeSet;-><init>()V

    .line 40
    iget-object v3, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    .line 41
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-lt v3, v4, :cond_0

    .line 42
    iget-object v3, v1, Landroid/content/pm/ApplicationInfo;->deviceProtectedDataDir:Ljava/lang/String;

    invoke-static {v2, v3}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    .line 43
    invoke-virtual {v0}, Landroid/content/Context;->createDeviceProtectedStorageContext()Landroid/content/Context;

    move-result-object v3

    .line 44
    invoke-virtual {v3}, Landroid/content/Context;->getDataDir()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    .line 46
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    const-string v5, "/data/data/"

    .line 0
    invoke-static {v5, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 70
    invoke-static {v2, v5}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    const-string v5, "/data/user/0/"

    .line 0
    invoke-static {v5, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 71
    invoke-static {v2, v5}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    const-string v5, "/data/user_de/0/"

    .line 0
    invoke-static {v5, v3}, Ll/᩶ۢᩴ;->֫(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 72
    invoke-static {v2, v5}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v5, "/data/user/"

    .line 77
    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x2f

    const/16 v7, 0xb

    .line 78
    invoke-virtual {v4, v6, v7}, Ljava/lang/String;->indexOf(II)I

    move-result v6

    if-le v6, v7, :cond_2

    .line 80
    invoke-virtual {v4, v7, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v6, "/"

    .line 0
    invoke-static {v5, v4, v6, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 81
    invoke-static {v2, v5}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    const-string v5, "/data/user_de/"

    .line 0
    invoke-static {v5, v4, v6, v3}, Ll/᩵۫ۡ;->֫(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 82
    invoke-static {v2, v3}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    :cond_2
    :goto_0
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v0, v3}, Landroid/content/Context;->getExternalFilesDirs(Ljava/lang/String;)[Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v4, v5}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;[Ljava/io/File;Ljava/lang/String;)V

    .line 48
    invoke-virtual {v0}, Landroid/content/Context;->getExternalCacheDirs()[Ljava/io/File;

    move-result-object v4

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v4, v0}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;[Ljava/io/File;Ljava/lang/String;)V

    .line 100
    iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    if-nez v0, :cond_3

    move-object v0, v3

    goto :goto_1

    .line 101
    :cond_3
    new-instance v0, Ljava/io/File;

    iget-object v4, v1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :goto_1
    if-nez v0, :cond_4

    move-object v0, v3

    goto :goto_2

    .line 117
    :cond_4
    invoke-virtual {v0}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v0

    .line 102
    :goto_2
    invoke-static {v2, v0}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    .line 103
    iget-object v4, v1, Landroid/content/pm/ApplicationInfo;->splitSourceDirs:[Ljava/lang/String;

    if-eqz v4, :cond_7

    .line 104
    array-length v5, v4

    const/4 v6, 0x0

    :goto_3
    if-ge v6, v5, :cond_7

    aget-object v7, v4, v6

    if-nez v7, :cond_5

    move-object v8, v3

    goto :goto_4

    .line 105
    :cond_5
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :goto_4
    if-nez v8, :cond_6

    move-object v7, v3

    goto :goto_5

    .line 117
    :cond_6
    invoke-virtual {v8}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v7

    .line 105
    :goto_5
    invoke-static {v2, v7}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    .line 108
    :cond_7
    iget-object v3, v1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    if-eqz v3, :cond_9

    if-eqz v0, :cond_8

    .line 109
    invoke-static {v3, v0}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_9

    .line 111
    :cond_8
    iget-object v0, v1, Landroid/content/pm/ApplicationInfo;->nativeLibraryDir:Ljava/lang/String;

    invoke-static {v2, v0}, Ll/ۤۢۜ;->֫(Ljava/util/TreeSet;Ljava/lang/String;)V

    .line 52
    :cond_9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 53
    invoke-virtual {v2}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 55
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 56
    invoke-static {v2, v4}, Ll/۫ۡۜ;->֫(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_6

    .line 62
    :cond_b
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    .line 65
    :cond_c
    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
