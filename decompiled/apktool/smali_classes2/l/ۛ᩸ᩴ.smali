.class public final synthetic Ll/ۛ᩸ᩴ;
.super Ljava/nio/file/spi/FileSystemProvider;
.source "N673"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final synthetic a:Ll/۬᩸ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/۬᩸ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/nio/file/spi/FileSystemProvider;-><init>()V

    iput-object p1, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic checkAccess(Ljava/nio/file/Path;[Ljava/nio/file/AccessMode;)V
    .locals 7

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    goto :goto_2

    .line 0
    :cond_0
    array-length v2, p2

    new-array v3, v2, [Ll/ۨ֨ᩴ;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, p2, v4

    if-nez v5, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    sget-object v6, Ljava/nio/file/AccessMode;->READ:Ljava/nio/file/AccessMode;

    if-ne v5, v6, :cond_2

    sget-object v5, Ll/ۨ֨ᩴ;->READ:Ll/ۨ֨ᩴ;

    goto :goto_1

    :cond_2
    sget-object v6, Ljava/nio/file/AccessMode;->WRITE:Ljava/nio/file/AccessMode;

    if-ne v5, v6, :cond_3

    sget-object v5, Ll/ۨ֨ᩴ;->WRITE:Ll/ۨ֨ᩴ;

    goto :goto_1

    :cond_3
    sget-object v5, Ll/ۨ֨ᩴ;->EXECUTE:Ll/ۨ֨ᩴ;

    :goto_1
    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    move-object v1, v3

    :goto_2
    invoke-virtual {v0, p1, v1}, Ll/۬᩸ᩴ;->checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V

    return-void
.end method

.method public final synthetic copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V
    .locals 5

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p2

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_1

    .line 0
    :cond_0
    array-length v1, p3

    new-array v2, v1, [Ll/᩺֨ᩴ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p3, v3

    invoke-static {v4}, Ll/۠۠ᩴ;->a(Ljava/nio/file/CopyOption;)Ll/᩺֨ᩴ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object p3, v2

    :goto_1
    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->copy(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V

    return-void
.end method

.method public final synthetic createDirectory(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->I([Ljava/nio/file/attribute/FileAttribute;)[Ll/᩹۠ᩴ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V

    return-void
.end method

.method public final synthetic createLink(Ljava/nio/file/Path;Ljava/nio/file/Path;)V
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->a(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public final synthetic createSymbolicLink(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->I([Ljava/nio/file/attribute/FileAttribute;)[Ll/᩹۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->b(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V

    return-void
.end method

.method public final synthetic delete(Ljava/nio/file/Path;)V
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->delete(Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public final synthetic deleteIfExists(Ljava/nio/file/Path;)Z
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->c(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    instance-of v1, p1, Ll/ۛ᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ۛ᩸ᩴ;

    iget-object p1, p1, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic getFileAttributeView(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->q(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->F([Ljava/nio/file/LinkOption;)[Ll/ܳ۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    instance-of p2, p1, Ll/ܺܶᩴ;

    if-eqz p2, :cond_1

    check-cast p1, Ll/ܺܶᩴ;

    iget-object p1, p1, Ll/ܺܶᩴ;->a:Ljava/nio/file/attribute/FileAttributeView;

    return-object p1

    :cond_1
    instance-of p2, p1, Ll/ܽܶᩴ;

    if-eqz p2, :cond_6

    check-cast p1, Ll/ܽܶᩴ;

    instance-of p2, p1, Ll/۟۠ᩴ;

    if-eqz p2, :cond_2

    check-cast p1, Ll/۟۠ᩴ;

    iget-object p1, p1, Ll/۟۠ᩴ;->a:Ljava/nio/file/attribute/BasicFileAttributeView;

    return-object p1

    :cond_2
    instance-of p2, p1, Ll/᩸۠ᩴ;

    if-eqz p2, :cond_4

    check-cast p1, Ll/᩸۠ᩴ;

    instance-of p2, p1, Ll/ܳܶᩴ;

    if-eqz p2, :cond_3

    check-cast p1, Ll/ܳܶᩴ;

    iget-object p1, p1, Ll/ܳܶᩴ;->a:Ljava/nio/file/attribute/DosFileAttributeView;

    return-object p1

    :cond_3
    new-instance p2, Ll/᩻ܶᩴ;

    invoke-direct {p2, p1}, Ll/᩻ܶᩴ;-><init>(Ll/᩸۠ᩴ;)V

    return-object p2

    :cond_4
    instance-of p2, p1, Ll/۠ܶᩴ;

    if-eqz p2, :cond_5

    check-cast p1, Ll/۠ܶᩴ;

    iget-object p1, p1, Ll/۠ܶᩴ;->a:Ljava/nio/file/attribute/PosixFileAttributeView;

    return-object p1

    :cond_5
    new-instance p2, Ll/ۧܶᩴ;

    invoke-direct {p2, p1}, Ll/ۧܶᩴ;-><init>(Ll/ܽܶᩴ;)V

    return-object p2

    :cond_6
    instance-of p2, p1, Ll/᩵ܶᩴ;

    if-eqz p2, :cond_a

    check-cast p1, Ll/᩵ܶᩴ;

    instance-of p2, p1, Ll/ۘܶᩴ;

    if-eqz p2, :cond_7

    check-cast p1, Ll/ۘܶᩴ;

    iget-object p1, p1, Ll/ۘܶᩴ;->a:Ljava/nio/file/attribute/FileOwnerAttributeView;

    return-object p1

    :cond_7
    instance-of p2, p1, Ll/ۛ۠ᩴ;

    if-eqz p2, :cond_8

    check-cast p1, Ll/ۛ۠ᩴ;

    iget-object p1, p1, Ll/ۛ۠ᩴ;->a:Ljava/nio/file/attribute/AclFileAttributeView;

    return-object p1

    :cond_8
    instance-of p2, p1, Ll/۠ܶᩴ;

    if-eqz p2, :cond_9

    check-cast p1, Ll/۠ܶᩴ;

    iget-object p1, p1, Ll/۠ܶᩴ;->a:Ljava/nio/file/attribute/PosixFileAttributeView;

    return-object p1

    :cond_9
    new-instance p2, Ll/ᩴܶᩴ;

    invoke-direct {p2, p1}, Ll/ᩴܶᩴ;-><init>(Ll/᩵ܶᩴ;)V

    return-object p2

    :cond_a
    instance-of p2, p1, Ll/᩹ܶᩴ;

    if-eqz p2, :cond_b

    check-cast p1, Ll/᩹ܶᩴ;

    iget-object p1, p1, Ll/᩹ܶᩴ;->a:Ljava/nio/file/attribute/UserDefinedFileAttributeView;

    return-object p1

    :cond_b
    new-instance p2, Ll/ۖܶᩴ;

    invoke-direct {p2, p1}, Ll/ۖܶᩴ;-><init>(Ll/᩶۠ᩴ;)V

    return-object p2
.end method

.method public final synthetic getFileStore(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->getFileStore(Ll/᩷۠ᩴ;)Ll/ܰ֨ᩴ;

    move-result-object p1

    sget v0, Ll/ۛܶᩴ;->b:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    instance-of v0, p1, Ll/۫ܶᩴ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/۫ܶᩴ;

    iget-object p1, p1, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    return-object p1

    :cond_1
    new-instance v0, Ll/ۛܶᩴ;

    invoke-direct {v0, p1}, Ll/ۛܶᩴ;-><init>(Ll/ܰ֨ᩴ;)V

    return-object v0
.end method

.method public final synthetic getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۟ܶᩴ;->b(Ll/۟֨ᩴ;)Ljava/nio/file/FileSystem;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getPath(Ljava/net/URI;)Ljava/nio/file/Path;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getScheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-virtual {v0}, Ll/۬᩸ᩴ;->getScheme()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isHidden(Ljava/nio/file/Path;)Z
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->isHidden(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final synthetic isSameFile(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final synthetic move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V
    .locals 5

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p2

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_1

    .line 0
    :cond_0
    array-length v1, p3

    new-array v2, v1, [Ll/᩺֨ᩴ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p3, v3

    invoke-static {v4}, Ll/۠۠ᩴ;->a(Ljava/nio/file/CopyOption;)Ll/᩺֨ᩴ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object p3, v2

    :goto_1
    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V

    return-void
.end method

.method public final synthetic newAsynchronousFileChannel(Ljava/nio/file/Path;Ljava/util/Set;Ljava/util/concurrent/ExecutorService;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/AsynchronousFileChannel;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p4}, Ll/᩺ۚᩴ;->I([Ljava/nio/file/attribute/FileAttribute;)[Ll/᩹۠ᩴ;

    move-result-object p4

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۬᩸ᩴ;->e(Ll/᩷۠ᩴ;Ljava/util/Set;Ljava/util/concurrent/ExecutorService;[Ll/᩹۠ᩴ;)Ll/ۤ֨ᩴ;

    move-result-object p1

    sget p2, Ll/ۛ֨ᩴ;->a:I

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    iget-object p1, p1, Ll/ۤ֨ᩴ;->a:Ljava/nio/channels/AsynchronousFileChannel;

    return-object p1
.end method

.method public final synthetic newByteChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/SeekableByteChannel;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->I([Ljava/nio/file/attribute/FileAttribute;)[Ll/᩹۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;

    move-result-object p1

    return-object p1
.end method

.method public final newDirectoryStream(Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
    .locals 3

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    .line 29
    new-instance v1, Ll/ܿ֨ᩴ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p2}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    .line 0
    invoke-virtual {v0, p1, v1}, Ll/۬᩸ᩴ;->newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;

    move-result-object p1

    .line 24
    new-instance p2, Ll/ۧ᩹ᩴ;

    invoke-direct {p2, p1}, Ll/ۧ᩹ᩴ;-><init>(Ljava/nio/file/DirectoryStream;)V

    return-object p2
.end method

.method public final synthetic newFileChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/FileChannel;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->I([Ljava/nio/file/attribute/FileAttribute;)[Ll/᩹۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->f(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۟ܶᩴ;->b(Ll/۟֨ᩴ;)Ljava/nio/file/FileSystem;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newFileSystem(Ljava/nio/file/Path;Ljava/util/Map;)Ljava/nio/file/FileSystem;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۟ܶᩴ;->b(Ll/۟֨ᩴ;)Ljava/nio/file/FileSystem;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newInputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
    .locals 5

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    .line 0
    :cond_0
    array-length v1, p2

    new-array v2, v1, [Ll/᩻۠ᩴ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p2, v3

    invoke-static {v4}, Ll/ۗ᩸ᩴ;->a(Ljava/nio/file/OpenOption;)Ll/᩻۠ᩴ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object p2, v2

    :goto_1
    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newOutputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;
    .locals 5

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    .line 0
    :cond_0
    array-length v1, p2

    new-array v2, v1, [Ll/᩻۠ᩴ;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p2, v3

    invoke-static {v4}, Ll/ۗ᩸ᩴ;->a(Ljava/nio/file/OpenOption;)Ll/᩻۠ᩴ;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object p2, v2

    :goto_1
    invoke-virtual {v0, p1, p2}, Ll/۬᩸ᩴ;->g(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic readAttributes(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->r(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->F([Ljava/nio/file/LinkOption;)[Ll/ܳ۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ܿܶᩴ;->a(Ll/ܶ۠ᩴ;)Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic readAttributes(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p3}, Ll/᩺ۚᩴ;->F([Ljava/nio/file/LinkOption;)[Ll/ܳ۠ᩴ;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ll/۬᩸ᩴ;->readAttributes(Ll/᩷۠ᩴ;Ljava/lang/String;[Ll/ܳ۠ᩴ;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ۚᩴ;->s(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic readSymbolicLink(Ljava/nio/file/Path;)Ljava/nio/file/Path;
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/۬᩸ᩴ;->h(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic setAttribute(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)V
    .locals 1

    iget-object v0, p0, Ll/ۛ᩸ᩴ;->a:Ll/۬᩸ᩴ;

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p3}, Ll/᩺ۚᩴ;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p4}, Ll/᩺ۚᩴ;->F([Ljava/nio/file/LinkOption;)[Ll/ܳ۠ᩴ;

    move-result-object p4

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/۬᩸ᩴ;->setAttribute(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/Object;[Ll/ܳ۠ᩴ;)V

    return-void
.end method
