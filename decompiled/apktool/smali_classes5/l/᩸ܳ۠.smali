.class public final Ll/᩸ܳ۠;
.super Ll/ܰܿ۠;
.source "K7QT"


# instance fields
.field public ܳ:Ll/᩷۠ᩴ;

.field public ܿ:Ll/᩷۠ᩴ;

.field public ᩳ:Ll/ۘܳ۠;

.field public final synthetic ᩻:Ll/᩹ܳ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܳ۠;)V
    .locals 3

    .line 1838
    iput-object p1, p0, Ll/᩸ܳ۠;->᩻:Ll/᩹ܳ۠;

    .line 1839
    sget-object p1, Ll/᩷᩶۠;->۟:Ll/᩷᩶۠;

    const/4 v0, 0x1

    new-array v0, v0, [Ll/֡ۖ۠;

    sget-object v1, Ll/֡ۖ۠;->᩸ۧ:Ll/֡ۖ۠;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, p1, v0}, Ll/ܰܿ۠;-><init>(Ll/֫᩶۠;[Ll/֡ۖ۠;)V

    .line 1840
    sget-object p1, Ll/᩹ܳ۠;->ۢ:Ll/᩷۠ᩴ;

    iput-object p1, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    return-void
.end method

.method private ᩳ(Ll/᩷۠ᩴ;)V
    .locals 3

    .line 1918
    :try_start_0
    sget-object v0, Ll/᩹ܳ۠;->ۢ:Ll/᩷۠ᩴ;

    invoke-static {p1, v0}, Ll/ܿ۠ᩴ;->isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v0, :cond_1

    const-string v0, "lib"

    .line 1909
    invoke-interface {p1, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    const-string v1, "jrt-fs.jar"

    invoke-interface {v0, v1}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ll/ܳ۠ᩴ;

    invoke-static {v0, v2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    const-string v2, "modules"

    .line 1910
    invoke-interface {v0, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    invoke-static {v0, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 1911
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 1912
    :cond_1
    :goto_0
    iput-object p1, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    const/4 p1, 0x0

    .line 1913
    iput-object p1, p0, Ll/᩸ܳ۠;->ܿ:Ll/᩷۠ᩴ;

    return-void

    :catch_0
    move-exception v0

    .line 1920
    new-instance v1, Ljava/lang/IllegalArgumentException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method private ᩻()V
    .locals 11

    .line 1949
    iget-object v7, p0, Ll/᩸ܳ۠;->᩻:Ll/᩹ܳ۠;

    iget-object v0, v7, Ll/᩹ܳ۠;->֫:Ljava/util/ArrayList;

    iget-object v1, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    if-eqz v1, :cond_0

    return-void

    .line 1952
    :cond_0
    iget-object v1, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    if-nez v1, :cond_1

    .line 1953
    new-instance v0, Ll/ۘܳ۠;

    invoke-direct {v0, v7}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    return-void

    .line 1957
    :cond_1
    iget-object v1, p0, Ll/᩸ܳ۠;->ܿ:Ll/᩷۠ᩴ;

    if-nez v1, :cond_4

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "jrt:/"

    .line 1959
    invoke-static {v2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v2

    .line 1962
    iget-object v3, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;
    :try_end_0
    .catch Ljava/nio/file/FileSystemNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 1918
    :try_start_1
    sget-object v4, Ll/᩹ܳ۠;->ۢ:Ll/᩷۠ᩴ;

    invoke-static {v3, v4}, Ll/ܿ۠ᩴ;->isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z

    move-result v3
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/nio/file/FileSystemNotFoundException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    if-eqz v3, :cond_2

    .line 1963
    :try_start_2
    invoke-static {v2}, Ll/֫۠ᩴ;->getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;

    move-result-object v0
    :try_end_2
    .catch Ljava/nio/file/FileSystemNotFoundException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :cond_2
    :try_start_3
    const-string v3, "java.home"

    .line 1966
    iget-object v4, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    .line 1967
    invoke-interface {v4}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    .line 1968
    invoke-static {v2, v3}, Ll/֫۠ᩴ;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object v2
    :try_end_3
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/nio/file/FileSystemNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    goto :goto_0

    .line 1970
    :catch_0
    :try_start_4
    iget-object v3, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    const-string v4, "jrt-fs.jar"

    invoke-interface {v3, v4}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v3

    invoke-interface {v3}, Ll/᩷۠ᩴ;->toUri()Ljava/net/URI;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/URI;->toURL()Ljava/net/URL;

    move-result-object v3

    .line 1971
    const-class v4, Ll/᩹ܳ۠;

    invoke-virtual {v4}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v4

    .line 1972
    new-instance v5, Ljava/net/URLClassLoader;

    const/4 v6, 0x1

    new-array v6, v6, [Ljava/net/URL;

    aput-object v3, v6, v1

    invoke-direct {v5, v6, v4}, Ljava/net/URLClassLoader;-><init>([Ljava/net/URL;Ljava/lang/ClassLoader;)V

    .line 1975
    sget-object v3, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    invoke-static {v2, v3, v5}, Ll/֫۠ᩴ;->newFileSystem(Ljava/net/URI;Ljava/util/Map;Ljava/lang/ClassLoader;)Ll/۟֨ᩴ;

    move-result-object v2

    .line 1977
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1980
    :goto_0
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v0, v2

    :goto_1
    const-string v2, "/modules"

    new-array v3, v1, [Ljava/lang/String;

    .line 1983
    invoke-virtual {v0, v2, v3}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    iput-object v0, p0, Ll/᩸ܳ۠;->ܿ:Ll/᩷۠ᩴ;

    goto :goto_3

    :catch_1
    move-exception v0

    .line 1920
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-interface {v3}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
    :try_end_4
    .catch Ljava/nio/file/FileSystemNotFoundException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/nio/file/ProviderNotFoundException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception v0

    goto :goto_2

    :catch_3
    move-exception v0

    .line 1985
    :goto_2
    iget-object v2, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    const-string v3, "modules"

    invoke-interface {v2, v3}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    iput-object v2, p0, Ll/᩸ܳ۠;->ܿ:Ll/᩷۠ᩴ;

    new-array v1, v1, [Ll/ܳ۠ᩴ;

    .line 1986
    invoke-static {v2, v1}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    .line 1987
    :cond_3
    new-instance v1, Ljava/io/IOException;

    const-string v2, "can\'t find system classes"

    invoke-direct {v1, v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    .line 1991
    :cond_4
    :goto_3
    new-instance v0, Ll/ۘܳ۠;

    invoke-direct {v0, v7}, Ll/ۘܳ۠;-><init>(Ll/᩹ܳ۠;)V

    iput-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    .line 1992
    iget-object v0, p0, Ll/᩸ܳ۠;->ܿ:Ll/᩷۠ᩴ;

    new-instance v1, Ll/ܶܳ۠;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, v1}, Ll/ܿ۠ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;

    move-result-object v8

    .line 1993
    :try_start_5
    invoke-interface {v8}, Ljava/nio/file/DirectoryStream;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 1994
    invoke-interface {v0}, Ll/᩷۠ᩴ;->getFileName()Ll/᩷۠ᩴ;

    move-result-object v1

    invoke-interface {v1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object v4

    .line 1995
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    invoke-interface {v2}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1996
    new-instance v10, Ll/ܽܳ۠;

    .line 1997
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x0

    move-object v0, v10

    move-object v1, v7

    move-object v2, p0

    invoke-direct/range {v0 .. v6}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1998
    iget-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, v10}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    .line 2000
    :cond_5
    invoke-interface {v8}, Ljava/io/Closeable;->close()V

    return-void

    :goto_5
    if-eqz v8, :cond_6

    .line 1992
    :try_start_6
    invoke-interface {v8}, Ljava/io/Closeable;->close()V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    goto :goto_6

    :catchall_1
    move-exception v1

    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_6
    :goto_6
    throw v0
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/֫᩶۠;
    .locals 1

    .line 1926
    invoke-direct {p0}, Ll/᩸ܳ۠;->᩻()V

    .line 1927
    iget-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ljava/lang/Iterable;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    .line 1871
    iput-object p1, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    return-void

    :cond_0
    const/4 v0, 0x1

    .line 1873
    iput-boolean v0, p0, Ll/ܰܿ۠;->֫:Z

    .line 1875
    invoke-static {p1}, Ll/ܰܿ۠;->ۧ(Ljava/lang/Iterable;)Ll/᩷۠ᩴ;

    move-result-object p1

    .line 1876
    invoke-direct {p0, p1}, Ll/᩸ܳ۠;->ᩳ(Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public final ֫(Ljava/lang/Iterable;Ljava/lang/String;)V
    .locals 7

    .line 1900
    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1901
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 1902
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/᩷۠ᩴ;

    .line 1903
    invoke-static {v0}, Ll/ܰܿ۠;->ܽ(Ll/᩷۠ᩴ;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 1883
    :cond_0
    invoke-direct {p0}, Ll/᩸ܳ۠;->᩻()V

    .line 1884
    iget-object p1, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {p1, p2}, Ll/ۘܳ۠;->֫(Ljava/lang/String;)Ll/ܽܳ۠;

    move-result-object p1

    if-nez p1, :cond_1

    .line 1886
    new-instance p1, Ll/ܽܳ۠;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/ܰܿ۠;->ۧ:Ll/֫᩶۠;

    .line 1887
    invoke-interface {v1}, Ll/֫᩶۠;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v6, 0x1

    iget-object v1, p0, Ll/᩸ܳ۠;->᩻:Ll/᩹ܳ۠;

    move-object v0, p1

    move-object v2, p0

    move-object v4, p2

    invoke-direct/range {v0 .. v6}, Ll/ܽܳ۠;-><init>(Ll/᩹ܳ۠;Ll/ۧܳ۠;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Z)V

    .line 1891
    iget-object p2, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {p2, p1}, Ll/ۘܳ۠;->֫(Ll/ܽܳ۠;)V

    goto :goto_1

    .line 1893
    :cond_1
    iput-object v5, p1, Ll/ܽܳ۠;->۬:Ljava/util/Collection;

    .line 1894
    iget-object p2, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {p2, p1}, Ll/ۘܳ۠;->ۧ(Ll/ܽܳ۠;)V

    :goto_1
    const/4 p1, 0x1

    .line 1896
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    return-void
.end method

.method public final ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 3

    .line 1845
    iget-object v0, p0, Ll/ܰܿ۠;->ܽ:Ljava/util/EnumSet;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x1

    .line 1849
    iput-boolean p1, p0, Ll/ܰܿ۠;->֫:Z

    const/4 v1, 0x0

    if-nez p2, :cond_1

    .line 1852
    sget-object p2, Ll/᩹ܳ۠;->ۢ:Ll/᩷۠ᩴ;

    iput-object p2, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    goto :goto_0

    :cond_1
    const-string v2, "none"

    .line 1853
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 1854
    iput-object v1, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    goto :goto_0

    .line 1856
    :cond_2
    iget-object v2, p0, Ll/᩸ܳ۠;->᩻:Ll/᩹ܳ۠;

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v2, p2, v0}, Ll/᩹ܳ۠;->֫(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-direct {p0, p2}, Ll/᩸ܳ۠;->ᩳ(Ll/᩷۠ᩴ;)V

    .line 1859
    :goto_0
    iput-object v1, p0, Ll/᩸ܳ۠;->ܿ:Ll/᩷۠ᩴ;

    return p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Z
    .locals 1

    .line 1944
    invoke-direct {p0}, Ll/᩸ܳ۠;->᩻()V

    .line 1945
    iget-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->֫(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)Ll/֫᩶۠;
    .locals 1

    .line 1932
    invoke-direct {p0}, Ll/᩸ܳ۠;->᩻()V

    .line 1933
    iget-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0, p1}, Ll/ۘܳ۠;->ۧ(Ll/᩷۠ᩴ;)Ll/ܽܳ۠;

    move-result-object p1

    return-object p1
.end method

.method public final ܳ()Ljava/lang/Iterable;
    .locals 1

    .line 1938
    invoke-direct {p0}, Ll/᩸ܳ۠;->᩻()V

    .line 1939
    iget-object v0, p0, Ll/᩸ܳ۠;->ᩳ:Ll/ۘܳ۠;

    invoke-virtual {v0}, Ll/ۘܳ۠;->ᩳ()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/Collection;
    .locals 1

    .line 1865
    iget-object v0, p0, Ll/᩸ܳ۠;->ܳ:Ll/᩷۠ᩴ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
