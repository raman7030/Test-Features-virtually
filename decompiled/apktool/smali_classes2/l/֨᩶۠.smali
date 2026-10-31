.class public final Ll/֨᩶۠;
.super Ll/۬᩸ᩴ;
.source "B7L8"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Ll/۬᩸ᩴ;-><init>()V

    return-void
.end method


# virtual methods
.method public final varargs checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V
    .locals 1

    .line 53
    instance-of v0, p1, Ll/۠᩶۠;

    if-eqz v0, :cond_0

    check-cast p1, Ll/۠᩶۠;

    .line 56
    invoke-virtual {p1}, Ll/۠᩶۠;->getFileSystem()Ll/ۚ᩶۠;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ۚ᩶۠;->֫(Ll/۠᩶۠;[Ll/ۨ֨ᩴ;)V

    return-void

    .line 54
    :cond_0
    new-instance p1, Ljava/nio/file/ProviderMismatchException;

    invoke-direct {p1}, Ljava/nio/file/ProviderMismatchException;-><init>()V

    throw p1
.end method

.method public final varargs copy(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
    .locals 0

    .line 117
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final varargs createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
    .locals 0

    .line 107
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final delete(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 112
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final varargs getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;
    .locals 0

    .line 133
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getFileStore(Ll/᩷۠ᩴ;)Ll/ܰ֨ᩴ;
    .locals 0

    .line 128
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;
    .locals 0

    .line 92
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;
    .locals 0

    .line 97
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final getScheme()Ljava/lang/String;
    .locals 1

    const-string v0, "jar"

    return-object v0
.end method

.method public final isHidden(Ll/᩷۠ᩴ;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z
    .locals 0

    .line 77
    invoke-interface {p1, p2}, Ll/᩷۠ᩴ;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final varargs move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
    .locals 0

    .line 122
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final varargs newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;
    .locals 0

    .line 102
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
    .locals 1

    .line 45
    instance-of v0, p1, Ll/۠᩶۠;

    if-eqz v0, :cond_0

    check-cast p1, Ll/۠᩶۠;

    .line 48
    invoke-virtual {p1}, Ll/۠᩶۠;->getFileSystem()Ll/ۚ᩶۠;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ll/ۚ᩶۠;->֫(Ll/۠᩶۠;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;

    move-result-object p1

    return-object p1

    .line 46
    :cond_0
    new-instance p1, Ljava/nio/file/ProviderMismatchException;

    invoke-direct {p1}, Ljava/nio/file/ProviderMismatchException;-><init>()V

    throw p1
.end method

.method public final newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 0

    .line 87
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 2

    const/4 p2, 0x0

    new-array p2, p2, [Ll/ܳ۠ᩴ;

    .line 29
    invoke-static {p1, p2}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 32
    new-instance p2, Ll/ۚ᩶۠;

    invoke-direct {p2, p0, p1}, Ll/ۚ᩶۠;-><init>(Ll/֨᩶۠;Ll/᩷۠ᩴ;)V

    return-object p2

    .line 30
    :cond_0
    new-instance p2, Ljava/nio/file/FileSystemNotFoundException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "JAR file not found: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/nio/file/FileSystemNotFoundException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final varargs newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;
    .locals 0

    .line 37
    instance-of p2, p1, Ll/۠᩶۠;

    if-eqz p2, :cond_0

    check-cast p1, Ll/۠᩶۠;

    .line 40
    invoke-virtual {p1}, Ll/۠᩶۠;->getFileSystem()Ll/ۚ᩶۠;

    move-result-object p2

    invoke-virtual {p2, p1}, Ll/ۚ᩶۠;->֫(Ll/۠᩶۠;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1

    .line 38
    :cond_0
    new-instance p1, Ljava/nio/file/ProviderMismatchException;

    invoke-direct {p1}, Ljava/nio/file/ProviderMismatchException;-><init>()V

    throw p1
.end method

.method public final varargs readAttributes(Ll/᩷۠ᩴ;Ljava/lang/String;[Ll/ܳ۠ᩴ;)Ljava/util/Map;
    .locals 1

    .line 69
    instance-of p3, p1, Ll/۠᩶۠;

    if-eqz p3, :cond_2

    check-cast p1, Ll/۠᩶۠;

    .line 72
    invoke-virtual {p1}, Ll/۠᩶۠;->getFileSystem()Ll/ۚ᩶۠;

    move-result-object p3

    .line 201
    invoke-virtual {p3, p1}, Ll/ۚ᩶۠;->ۧ(Ll/۠᩶۠;)Ll/ۗ᩺ۡ;

    move-result-object p1

    .line 202
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 203
    new-instance v0, Ll/ۖ᩶۠;

    invoke-direct {v0, p1}, Ll/ۖ᩶۠;-><init>(Ll/ۗ᩺ۡ;)V

    const-string p1, "*"

    .line 204
    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "basic:*"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-object p3

    .line 205
    :cond_1
    :goto_0
    invoke-virtual {v0}, Ll/ۖ᩶۠;->size()J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "size"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    invoke-virtual {v0}, Ll/ۖ᩶۠;->isDirectory()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "isDirectory"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    invoke-virtual {v0}, Ll/ۖ᩶۠;->isRegularFile()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string p2, "isRegularFile"

    invoke-virtual {p3, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "lastModifiedTime"

    .line 208
    invoke-virtual {v0}, Ll/ۖ᩶۠;->lastModifiedTime()Ll/ۙ۠ᩴ;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "creationTime"

    .line 209
    invoke-virtual {v0}, Ll/ۖ᩶۠;->creationTime()Ll/ۙ۠ᩴ;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "lastAccessTime"

    .line 210
    invoke-virtual {v0}, Ll/ۖ᩶۠;->lastAccessTime()Ll/ۙ۠ᩴ;

    move-result-object p2

    invoke-virtual {p3, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    .line 70
    :cond_2
    new-instance p1, Ljava/nio/file/ProviderMismatchException;

    invoke-direct {p1}, Ljava/nio/file/ProviderMismatchException;-><init>()V

    throw p1
.end method

.method public final varargs readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;
    .locals 1

    .line 61
    instance-of p3, p1, Ll/۠᩶۠;

    if-eqz p3, :cond_1

    check-cast p1, Ll/۠᩶۠;

    .line 64
    invoke-virtual {p1}, Ll/۠᩶۠;->getFileSystem()Ll/ۚ᩶۠;

    move-result-object p3

    .line 189
    const-class v0, Ll/ܶ۠ᩴ;

    if-ne p2, v0, :cond_0

    .line 191
    new-instance p2, Ll/ۖ᩶۠;

    invoke-virtual {p3, p1}, Ll/ۚ᩶۠;->ۧ(Ll/۠᩶۠;)Ll/ۗ᩺ۡ;

    move-result-object p1

    invoke-direct {p2, p1}, Ll/ۖ᩶۠;-><init>(Ll/ۗ᩺ۡ;)V

    return-object p2

    .line 64
    :cond_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Attribute type not supported: "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_1
    new-instance p1, Ljava/nio/file/ProviderMismatchException;

    invoke-direct {p1}, Ljava/nio/file/ProviderMismatchException;-><init>()V

    throw p1
.end method

.method public final varargs setAttribute(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/Object;[Ll/ܳ۠ᩴ;)V
    .locals 0

    .line 138
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method
