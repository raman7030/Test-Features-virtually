.class public final synthetic Ll/ۤ᩸ᩴ;
.super Ll/۬᩸ᩴ;
.source "N673"


# static fields
.field public static final synthetic f:I


# instance fields
.field public final synthetic e:Ljava/nio/file/spi/FileSystemProvider;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/spi/FileSystemProvider;)V
    .locals 0

    invoke-direct {p0}, Ll/۬᩸ᩴ;-><init>()V

    iput-object p1, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->createLink(Ljava/nio/file/Path;Ljava/nio/file/Path;)V

    return-void
.end method

.method public final synthetic b(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->N([Ll/᩹۠ᩴ;)[Ljava/nio/file/attribute/FileAttribute;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->createSymbolicLink(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V

    return-void
.end method

.method public final synthetic c(Ll/᩷۠ᩴ;)Z
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->deleteIfExists(Ljava/nio/file/Path;)Z

    move-result p1

    return p1
.end method

.method public final synthetic checkAccess(Ll/᩷۠ᩴ;[Ll/ۨ֨ᩴ;)V
    .locals 7

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    const/4 v1, 0x0

    if-nez p2, :cond_0

    goto :goto_2

    .line 0
    :cond_0
    array-length v2, p2

    new-array v3, v2, [Ljava/nio/file/AccessMode;

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v2, :cond_4

    aget-object v5, p2, v4

    if-nez v5, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    sget-object v6, Ll/ۨ֨ᩴ;->READ:Ll/ۨ֨ᩴ;

    if-ne v5, v6, :cond_2

    sget-object v5, Ljava/nio/file/AccessMode;->READ:Ljava/nio/file/AccessMode;

    goto :goto_1

    :cond_2
    sget-object v6, Ll/ۨ֨ᩴ;->WRITE:Ll/ۨ֨ᩴ;

    if-ne v5, v6, :cond_3

    sget-object v5, Ljava/nio/file/AccessMode;->WRITE:Ljava/nio/file/AccessMode;

    goto :goto_1

    :cond_3
    sget-object v5, Ljava/nio/file/AccessMode;->EXECUTE:Ljava/nio/file/AccessMode;

    :goto_1
    aput-object v5, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    move-object v1, v3

    :goto_2
    invoke-virtual {v0, p1, v1}, Ljava/nio/file/spi/FileSystemProvider;->checkAccess(Ljava/nio/file/Path;[Ljava/nio/file/AccessMode;)V

    return-void
.end method

.method public final synthetic copy(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->J([Ll/᩺֨ᩴ;)[Ljava/nio/file/CopyOption;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->copy(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V

    return-void
.end method

.method public final synthetic createDirectory(Ll/᩷۠ᩴ;[Ll/᩹۠ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->N([Ll/᩹۠ᩴ;)[Ljava/nio/file/attribute/FileAttribute;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->createDirectory(Ljava/nio/file/Path;[Ljava/nio/file/attribute/FileAttribute;)V

    return-void
.end method

.method public final synthetic delete(Ll/᩷۠ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->delete(Ljava/nio/file/Path;)V

    return-void
.end method

.method public final synthetic e(Ll/᩷۠ᩴ;Ljava/util/Set;Ljava/util/concurrent/ExecutorService;[Ll/᩹۠ᩴ;)Ll/ۤ֨ᩴ;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p4}, Ll/᩺ۚᩴ;->N([Ll/᩹۠ᩴ;)[Ljava/nio/file/attribute/FileAttribute;

    move-result-object p4

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/nio/file/spi/FileSystemProvider;->newAsynchronousFileChannel(Ljava/nio/file/Path;Ljava/util/Set;Ljava/util/concurrent/ExecutorService;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/AsynchronousFileChannel;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance p2, Ll/ۤ֨ᩴ;

    invoke-direct {p2, p1}, Ll/ۤ֨ᩴ;-><init>(Ljava/nio/channels/AsynchronousFileChannel;)V

    return-object p2
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    instance-of v1, p1, Ll/ۤ᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ۤ᩸ᩴ;

    iget-object p1, p1, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic f(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/FileChannel;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->N([Ll/᩹۠ᩴ;)[Ljava/nio/file/attribute/FileAttribute;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->newFileChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/FileChannel;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic g(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/OutputStream;
    .locals 5

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    .line 0
    :cond_0
    array-length v1, p2

    new-array v2, v1, [Ljava/nio/file/OpenOption;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p2, v3

    invoke-static {v4}, Ll/ۨ᩸ᩴ;->a(Ll/᩻۠ᩴ;)Ljava/nio/file/OpenOption;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object p2, v2

    :goto_1
    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->newOutputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getFileAttributeView(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/᩶۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->q(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->K([Ll/ܳ۠ᩴ;)[Ljava/nio/file/LinkOption;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->getFileAttributeView(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/FileAttributeView;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    instance-of p2, p1, Ll/ۖܶᩴ;

    if-eqz p2, :cond_1

    check-cast p1, Ll/ۖܶᩴ;

    iget-object p1, p1, Ll/ۖܶᩴ;->a:Ll/᩶۠ᩴ;

    return-object p1

    :cond_1
    instance-of p2, p1, Ljava/nio/file/attribute/BasicFileAttributeView;

    if-eqz p2, :cond_6

    check-cast p1, Ljava/nio/file/attribute/BasicFileAttributeView;

    instance-of p2, p1, Ll/ۧܶᩴ;

    if-eqz p2, :cond_2

    check-cast p1, Ll/ۧܶᩴ;

    iget-object p1, p1, Ll/ۧܶᩴ;->a:Ll/ܽܶᩴ;

    return-object p1

    :cond_2
    instance-of p2, p1, Ljava/nio/file/attribute/DosFileAttributeView;

    if-eqz p2, :cond_4

    check-cast p1, Ljava/nio/file/attribute/DosFileAttributeView;

    instance-of p2, p1, Ll/᩻ܶᩴ;

    if-eqz p2, :cond_3

    check-cast p1, Ll/᩻ܶᩴ;

    iget-object p1, p1, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    return-object p1

    :cond_3
    new-instance p2, Ll/ܳܶᩴ;

    invoke-direct {p2, p1}, Ll/ܳܶᩴ;-><init>(Ljava/nio/file/attribute/DosFileAttributeView;)V

    return-object p2

    :cond_4
    instance-of p2, p1, Ljava/nio/file/attribute/PosixFileAttributeView;

    if-eqz p2, :cond_5

    check-cast p1, Ljava/nio/file/attribute/PosixFileAttributeView;

    new-instance p2, Ll/۠ܶᩴ;

    invoke-direct {p2, p1}, Ll/۠ܶᩴ;-><init>(Ljava/nio/file/attribute/PosixFileAttributeView;)V

    return-object p2

    :cond_5
    new-instance p2, Ll/۟۠ᩴ;

    invoke-direct {p2, p1}, Ll/۟۠ᩴ;-><init>(Ljava/nio/file/attribute/BasicFileAttributeView;)V

    return-object p2

    :cond_6
    instance-of p2, p1, Ljava/nio/file/attribute/FileOwnerAttributeView;

    if-eqz p2, :cond_a

    check-cast p1, Ljava/nio/file/attribute/FileOwnerAttributeView;

    instance-of p2, p1, Ll/ᩴܶᩴ;

    if-eqz p2, :cond_7

    check-cast p1, Ll/ᩴܶᩴ;

    iget-object p1, p1, Ll/ᩴܶᩴ;->a:Ll/᩵ܶᩴ;

    return-object p1

    :cond_7
    instance-of p2, p1, Ljava/nio/file/attribute/AclFileAttributeView;

    if-eqz p2, :cond_8

    check-cast p1, Ljava/nio/file/attribute/AclFileAttributeView;

    new-instance p2, Ll/ۛ۠ᩴ;

    invoke-direct {p2, p1}, Ll/ۛ۠ᩴ;-><init>(Ljava/nio/file/attribute/AclFileAttributeView;)V

    return-object p2

    :cond_8
    instance-of p2, p1, Ljava/nio/file/attribute/PosixFileAttributeView;

    if-eqz p2, :cond_9

    check-cast p1, Ljava/nio/file/attribute/PosixFileAttributeView;

    new-instance p2, Ll/۠ܶᩴ;

    invoke-direct {p2, p1}, Ll/۠ܶᩴ;-><init>(Ljava/nio/file/attribute/PosixFileAttributeView;)V

    return-object p2

    :cond_9
    new-instance p2, Ll/ۘܶᩴ;

    invoke-direct {p2, p1}, Ll/ۘܶᩴ;-><init>(Ljava/nio/file/attribute/FileOwnerAttributeView;)V

    return-object p2

    :cond_a
    instance-of p2, p1, Ljava/nio/file/attribute/UserDefinedFileAttributeView;

    if-eqz p2, :cond_b

    check-cast p1, Ljava/nio/file/attribute/UserDefinedFileAttributeView;

    new-instance p2, Ll/᩹ܶᩴ;

    invoke-direct {p2, p1}, Ll/᩹ܶᩴ;-><init>(Ljava/nio/file/attribute/UserDefinedFileAttributeView;)V

    return-object p2

    :cond_b
    new-instance p2, Ll/ܺܶᩴ;

    invoke-direct {p2, p1}, Ll/ܺܶᩴ;-><init>(Ljava/nio/file/attribute/FileAttributeView;)V

    return-object p2
.end method

.method public final synthetic getFileStore(Ll/᩷۠ᩴ;)Ll/ܰ֨ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->getFileStore(Ljava/nio/file/Path;)Ljava/nio/file/FileStore;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    instance-of v0, p1, Ll/ۛܶᩴ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۛܶᩴ;

    iget-object p1, p1, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    return-object p1

    :cond_1
    new-instance v0, Ll/۫ܶᩴ;

    invoke-direct {v0, p1}, Ll/۫ܶᩴ;-><init>(Ljava/nio/file/FileStore;)V

    return-object v0
.end method

.method public final synthetic getFileSystem(Ljava/net/URI;)Ll/۟֨ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->getFileSystem(Ljava/net/URI;)Ljava/nio/file/FileSystem;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ܶᩴ;->b(Ljava/nio/file/FileSystem;)Ll/۟֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getPath(Ljava/net/URI;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->getPath(Ljava/net/URI;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getScheme()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-virtual {v0}, Ljava/nio/file/spi/FileSystemProvider;->getScheme()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic h(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->readSymbolicLink(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isHidden(Ll/᩷۠ᩴ;)Z
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/file/spi/FileSystemProvider;->isHidden(Ljava/nio/file/Path;)Z

    move-result p1

    return p1
.end method

.method public final synthetic isSameFile(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)Z
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->isSameFile(Ljava/nio/file/Path;Ljava/nio/file/Path;)Z

    move-result p1

    return p1
.end method

.method public final synthetic move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->J([Ll/᩺֨ᩴ;)[Ljava/nio/file/CopyOption;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)V

    return-void
.end method

.method public final synthetic newByteChannel(Ll/᩷۠ᩴ;Ljava/util/Set;[Ll/᩹۠ᩴ;)Ljava/nio/channels/SeekableByteChannel;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->u(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->N([Ll/᩹۠ᩴ;)[Ljava/nio/file/attribute/FileAttribute;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->newByteChannel(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/SeekableByteChannel;

    move-result-object p1

    return-object p1
.end method

.method public final newDirectoryStream(Ll/᩷۠ᩴ;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;
    .locals 3

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    .line 29
    new-instance v1, Ll/ܿ֨ᩴ;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p2}, Ll/ܿ֨ᩴ;-><init>(ILjava/lang/Object;)V

    .line 0
    invoke-virtual {v0, p1, v1}, Ljava/nio/file/spi/FileSystemProvider;->newDirectoryStream(Ljava/nio/file/Path;Ljava/nio/file/DirectoryStream$Filter;)Ljava/nio/file/DirectoryStream;

    move-result-object p1

    .line 24
    new-instance p2, Ll/ۧ᩹ᩴ;

    invoke-direct {p2, p1}, Ll/ۧ᩹ᩴ;-><init>(Ljava/nio/file/DirectoryStream;)V

    return-object p2
.end method

.method public final synthetic newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->newFileSystem(Ljava/net/URI;Ljava/util/Map;)Ljava/nio/file/FileSystem;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ܶᩴ;->b(Ljava/nio/file/FileSystem;)Ll/۟֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newFileSystem(Ll/᩷۠ᩴ;Ljava/util/Map;)Ll/۟֨ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->newFileSystem(Ljava/nio/file/Path;Ljava/util/Map;)Ljava/nio/file/FileSystem;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ܶᩴ;->b(Ljava/nio/file/FileSystem;)Ll/۟֨ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic newInputStream(Ll/᩷۠ᩴ;[Ll/᩻۠ᩴ;)Ljava/io/InputStream;
    .locals 5

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_1

    .line 0
    :cond_0
    array-length v1, p2

    new-array v2, v1, [Ljava/nio/file/OpenOption;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, p2, v3

    invoke-static {v4}, Ll/ۨ᩸ᩴ;->a(Ll/᩻۠ᩴ;)Ljava/nio/file/OpenOption;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    move-object p2, v2

    :goto_1
    invoke-virtual {v0, p1, p2}, Ljava/nio/file/spi/FileSystemProvider;->newInputStream(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic readAttributes(Ll/᩷۠ᩴ;Ljava/lang/String;[Ll/ܳ۠ᩴ;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p3}, Ll/᩺ۚᩴ;->K([Ll/ܳ۠ᩴ;)[Ljava/nio/file/LinkOption;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->readAttributes(Ljava/nio/file/Path;Ljava/lang/String;[Ljava/nio/file/LinkOption;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Ll/᩺ۚᩴ;->s(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic readAttributes(Ll/᩷۠ᩴ;Ljava/lang/Class;[Ll/ܳ۠ᩴ;)Ll/ܶ۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->r(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->K([Ll/ܳ۠ᩴ;)[Ljava/nio/file/LinkOption;

    move-result-object p3

    invoke-virtual {v0, p1, p2, p3}, Ljava/nio/file/spi/FileSystemProvider;->readAttributes(Ljava/nio/file/Path;Ljava/lang/Class;[Ljava/nio/file/LinkOption;)Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object p1

    invoke-static {p1}, Ll/ᩳܶᩴ;->a(Ljava/nio/file/attribute/BasicFileAttributes;)Ll/ܶ۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic setAttribute(Ll/᩷۠ᩴ;Ljava/lang/String;Ljava/lang/Object;[Ll/ܳ۠ᩴ;)V
    .locals 1

    iget-object v0, p0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p3}, Ll/᩺ۚᩴ;->t(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p4}, Ll/᩺ۚᩴ;->K([Ll/ܳ۠ᩴ;)[Ljava/nio/file/LinkOption;

    move-result-object p4

    invoke-virtual {v0, p1, p2, p3, p4}, Ljava/nio/file/spi/FileSystemProvider;->setAttribute(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/Object;[Ljava/nio/file/LinkOption;)V

    return-void
.end method
