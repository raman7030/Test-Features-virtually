.class public Ll/ۖܿ۠;
.super Ljava/lang/Object;
.source "U42P"


# instance fields
.field public ֫:Ll/֨᩶۠;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    new-instance v0, Ll/֨᩶۠;

    invoke-direct {v0}, Ll/֨᩶۠;-><init>()V

    iput-object v0, p0, Ll/ۖܿ۠;->֫:Ll/֨᩶۠;

    return-void
.end method


# virtual methods
.method public final declared-synchronized ֫()Ll/֨᩶۠;
    .locals 2

    move-object v0, p0

    .line 1
    monitor-enter v0

    .line 151
    :try_start_0
    iget-object v1, p0, Ll/ۖܿ۠;->֫:Ll/֨᩶۠;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public ֫(Ll/᩷۠ᩴ;)Z
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 84
    invoke-static {p1, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public ۧ(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    const/4 v0, 0x0

    :try_start_0
    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 77
    invoke-interface {p1, v0}, Ll/᩷۠ᩴ;->toRealPath([Ll/ܳ۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    .line 79
    :catch_0
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toAbsolutePath()Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-interface {p1}, Ll/᩷۠ᩴ;->normalize()Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public ܽ(Ll/᩷۠ᩴ;)Ljava/util/List;
    .locals 6

    .line 96
    new-instance v0, Ljava/util/jar/JarFile;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toFile()Ljava/io/File;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/jar/JarFile;-><init>(Ljava/io/File;)V

    .line 97
    :try_start_0
    invoke-virtual {v0}, Ljava/util/jar/JarFile;->getManifest()Ljava/util/jar/Manifest;

    move-result-object v1

    if-nez v1, :cond_0

    .line 99
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 126
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V

    return-object p1

    .line 101
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/util/jar/Manifest;->getMainAttributes()Ljava/util/jar/Attributes;

    move-result-object v1

    if-nez v1, :cond_1

    .line 103
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V

    return-object p1

    .line 105
    :cond_1
    :try_start_2
    sget-object v2, Ljava/util/jar/Attributes$Name;->CLASS_PATH:Ljava/util/jar/Attributes$Name;

    invoke-virtual {v1, v2}, Ljava/util/jar/Attributes;->getValue(Ljava/util/jar/Attributes$Name;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    .line 107
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V

    return-object p1

    .line 109
    :cond_2
    :try_start_3
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 110
    invoke-interface {p1}, Ll/᩷۠ᩴ;->toUri()Ljava/net/URI;

    move-result-object p1

    invoke-virtual {p1}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object p1

    .line 112
    new-instance v3, Ljava/util/StringTokenizer;

    invoke-direct {v3, v1}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;)V

    .line 113
    :cond_3
    :goto_0
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z

    move-result v1

    if-eqz v1, :cond_5

    .line 114
    invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;

    move-result-object v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 138
    :try_start_4
    new-instance v4, Ljava/net/URL;

    invoke-direct {v4, p1, v1}, Ljava/net/URL;-><init>(Ljava/net/URL;Ljava/lang/String;)V

    const/16 v5, 0x3a

    .line 139
    invoke-virtual {v1, v5}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    if-ltz v1, :cond_4

    const-string v1, "file"

    invoke-virtual {v4}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_4

    const/4 v4, 0x0

    :cond_4
    if-eqz v4, :cond_3

    .line 118
    invoke-virtual {v4}, Ljava/net/URL;->toURI()Ljava/net/URI;

    move-result-object v1

    invoke-static {v1}, Ll/ۜ۠ᩴ;->of(Ljava/net/URI;)Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/net/URISyntaxException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 121
    :try_start_5
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 126
    :cond_5
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V

    return-object v2

    :catchall_0
    move-exception p1

    .line 96
    :try_start_6
    invoke-virtual {v0}, Ljava/util/zip/ZipFile;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
.end method

.method public ᩳ(Ll/᩷۠ᩴ;)Z
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 92
    invoke-static {p1, v0}, Ll/ܿ۠ᩴ;->isRegularFile(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p1

    return p1
.end method
