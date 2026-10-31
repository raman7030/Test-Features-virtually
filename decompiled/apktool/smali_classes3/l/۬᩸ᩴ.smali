.class public abstract Ll/۬᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static volatile b:Ljava/util/List;

.field public static c:Z

.field public static final d:Ljava/util/Set;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 115
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/۬᩸ᩴ;->a:Ljava/lang/Object;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    .line 0
    sget-object v1, Ll/ۘ۠ᩴ;->CREATE:Ll/ۘ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘ۠ᩴ;->TRUNCATE_EXISTING:Ll/ۘ۠ᩴ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/᩺ۚᩴ;->D([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    .line 429
    sput-object v0, Ll/۬᩸ᩴ;->d:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 124
    invoke-static {}, Ljava/lang/System;->getSecurityManager()Ljava/lang/SecurityManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 126
    new-instance v1, Ljava/lang/RuntimePermission;

    const-string v2, "fileSystemProvider"

    invoke-direct {v1, v2}, Ljava/lang/RuntimePermission;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/SecurityManager;->checkPermission(Ljava/security/Permission;)V

    .line 129
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Ljava/util/List;
    .locals 4

    .line 190
    sget-object v0, Ll/۬᩸ᩴ;->b:Ljava/util/List;

    if-nez v0, :cond_2

    .line 192
    invoke-static {}, Ll/֫۠ᩴ;->getDefault()Ll/۟֨ᩴ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۟֨ᩴ;->provider()Ll/۬᩸ᩴ;

    move-result-object v1

    .line 194
    sget-object v0, Ll/۬᩸ᩴ;->a:Ljava/lang/Object;

    monitor-enter v0

    .line 195
    :try_start_0
    sget-object v2, Ll/۬᩸ᩴ;->b:Ljava/util/List;

    if-nez v2, :cond_1

    .line 196
    sget-boolean v2, Ll/۬᩸ᩴ;->c:Z

    if-nez v2, :cond_0

    const/4 v2, 0x1

    .line 199
    sput-boolean v2, Ll/۬᩸ᩴ;->c:Z

    .line 201
    new-instance v2, Ll/۫᩸ᩴ;

    const/4 v3, 0x0

    .line 202
    invoke-direct {v2, v3}, Ll/۫᩸ᩴ;-><init>(I)V

    invoke-static {v2}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    const/4 v3, 0x0

    .line 209
    invoke-interface {v2, v3, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 211
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    sput-object v1, Ll/۬᩸ᩴ;->b:Ljava/util/List;

    goto :goto_0

    .line 197
    :cond_0
    new-instance v1, Ljava/lang/Error;

    const-string v2, "Circular loading of installed providers detected"

    invoke-direct {v1, v2}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw v1

    .line 213
    :cond_1
    :goto_0
    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 215
    :cond_2
    :goto_1
    sget-object v0, Ll/۬᩸ᩴ;->b:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 0

    .line 735
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public varargs b(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
    .locals 0

    .line 703
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public c(Ll/᩷۠ᩴ;)Z
    .locals 0

    .line 788
    :try_start_0
    invoke-virtual {p0, p1}, Ll/۬᩸ᩴ;->delete(Ll/᩷۠ᩴ;)V
    :try_end_0
    .catch Ljava/nio/file/NoSuchFileException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p1, 0x1

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method

.method public varargs abstract checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V
.end method

.method public varargs abstract copy(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
.end method

.method public varargs abstract createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
.end method

.method public abstract delete(Ll/᩷۠ᩴ;)V
.end method

.method public varargs e(Ll/᩷۠ᩴ;Ljava/util/Set;Ljava/util/concurrent/ExecutorService;[Ll/᩹۠ᩴ;)Ll/ۤ֨ᩴ;
    .locals 0

    .line 574
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public varargs f(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/FileChannel;
    .locals 0

    .line 525
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public varargs g(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;
    .locals 6

    .line 466
    array-length v0, p2

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 469
    sget-object p2, Ll/۬᩸ᩴ;->d:Ljava/util/Set;

    goto :goto_1

    .line 471
    :cond_0
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 472
    array-length v2, p2

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget-object v4, p2, v3

    .line 473
    sget-object v5, Ll/ۘ۠ᩴ;->READ:Ll/ۘ۠ᩴ;

    if-eq v4, v5, :cond_1

    .line 475
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 474
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "READ not allowed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 477
    :cond_2
    sget-object p2, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    invoke-virtual {v0, p2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-object p2, v0

    :goto_1
    new-array v0, v1, [Ll/᩹۠ᩴ;

    .line 479
    invoke-virtual {p0, p1, p2, v0}, Ll/۬᩸ᩴ;->newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;

    move-result-object p1

    .line 483
    invoke-static {p1}, Ljava/nio/channels/Channels;->newOutputStream(Ljava/nio/channels/WritableByteChannel;)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1
.end method

.method public varargs abstract getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;
.end method

.method public abstract getFileStore(Ll/᩷۠ᩴ;)Ll/ܰ֨ᩴ;
.end method

.method public abstract getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;
.end method

.method public abstract getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;
.end method

.method public abstract getScheme()Ljava/lang/String;
.end method

.method public h(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 0

    .line 820
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public abstract isHidden(Ll/᩷۠ᩴ;)Z
.end method

.method public abstract isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z
.end method

.method public varargs abstract move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
.end method

.method public varargs abstract newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;
.end method

.method public abstract newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
.end method

.method public abstract newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;
.end method

.method public newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 0

    .line 378
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public varargs newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;
    .locals 5

    .line 412
    array-length v0, p2

    const/4 v1, 0x0

    if-lez v0, :cond_1

    .line 413
    array-length v0, p2

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p2, v2

    .line 415
    sget-object v4, Ll/ۘ۠ᩴ;->APPEND:Ll/ۘ۠ᩴ;

    if-eq v3, v4, :cond_0

    sget-object v4, Ll/ۘ۠ᩴ;->WRITE:Ll/ۘ۠ᩴ;

    if-eq v3, v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 417
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "\'"

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\' not allowed"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 420
    :cond_1
    sget-object v0, Ll/ܿ۠ᩴ;->a:Ljava/util/Set;

    .line 414
    array-length v0, p2

    if-nez v0, :cond_2

    .line 415
    sget-object p2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    goto :goto_1

    .line 417
    :cond_2
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 418
    invoke-static {v0, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    move-object p2, v0

    :goto_1
    new-array v0, v1, [Ll/᩹۠ᩴ;

    .line 369
    invoke-static {p1}, Ll/ܿ۠ᩴ;->b(Ll/᩷۠ᩴ;)Ll/۬᩸ᩴ;

    move-result-object v1

    invoke-virtual {v1, p1, p2, v0}, Ll/۬᩸ᩴ;->newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;

    move-result-object p1

    .line 425
    invoke-static {p1}, Ljava/nio/channels/Channels;->newInputStream(Ljava/nio/channels/ReadableByteChannel;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public varargs abstract readAttributes(Ll/᩷۠ᩴ;Ljava/lang/String;[Ll/ܳ۠ᩴ;)Ljava/util/Map;
.end method

.method public varargs abstract readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;
.end method

.method public varargs abstract setAttribute(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/Object;[Ll/ܳ۠ᩴ;)V
.end method
