.class public final synthetic Ll/۟ܶᩴ;
.super Ljava/nio/file/FileSystem;
.source "N673"


# instance fields
.field public final synthetic a:Ll/۟֨ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/۟֨ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/nio/file/FileSystem;-><init>()V

    iput-object p1, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    return-void
.end method

.method public static synthetic b(Ll/۟֨ᩴ;)Ljava/nio/file/FileSystem;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/᩺ܶᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/᩺ܶᩴ;

    iget-object p0, p0, Ll/᩺ܶᩴ;->a:Ljava/nio/file/FileSystem;

    return-object p0

    :cond_1
    new-instance v0, Ll/۟ܶᩴ;

    invoke-direct {v0, p0}, Ll/۟ܶᩴ;-><init>(Ll/۟֨ᩴ;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->close()V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    instance-of v1, p1, Ll/۟ܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/۟ܶᩴ;

    iget-object p1, p1, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic getFileStores()Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->getFileStores()Ljava/lang/Iterable;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getPath(Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0, p1, p2}, Ll/۟֨ᩴ;->getPath(Ljava/lang/String;[Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getPathMatcher(Ljava/lang/String;)Ljava/nio/file/PathMatcher;
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0, p1}, Ll/۟֨ᩴ;->getPathMatcher(Ljava/lang/String;)Ll/ۢ۠ᩴ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    instance-of v0, p1, Ll/ۙܶᩴ;

    if-eqz v0, :cond_1

    check-cast p1, Ll/ۙܶᩴ;

    iget-object p1, p1, Ll/ۙܶᩴ;->a:Ljava/nio/file/PathMatcher;

    return-object p1

    :cond_1
    new-instance v0, Ll/۬ܶᩴ;

    invoke-direct {v0, p1}, Ll/۬ܶᩴ;-><init>(Ll/ۢ۠ᩴ;)V

    return-object v0
.end method

.method public final getRootDirectories()Ljava/lang/Iterable;
    .locals 2

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->getRootDirectories()Ljava/lang/Iterable;

    move-result-object v0

    .line 19
    new-instance v1, Ll/ܽ᩹ᩴ;

    invoke-direct {v1, v0}, Ll/ܽ᩹ᩴ;-><init>(Ljava/lang/Iterable;)V

    return-object v1
.end method

.method public final synthetic getSeparator()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->getSeparator()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getUserPrincipalLookupService()Ljava/nio/file/attribute/UserPrincipalLookupService;
    .locals 2

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->getUserPrincipalLookupService()Ll/۫۠ᩴ;

    move-result-object v0

    sget v1, Ll/֫ܶᩴ;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    instance-of v1, v0, Ll/ܰ۠ᩴ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ܰ۠ᩴ;

    iget-object v0, v0, Ll/ܰ۠ᩴ;->a:Ljava/nio/file/attribute/UserPrincipalLookupService;

    return-object v0

    :cond_1
    new-instance v1, Ll/֫ܶᩴ;

    invoke-direct {v1, v0}, Ll/֫ܶᩴ;-><init>(Ll/۫۠ᩴ;)V

    return-object v1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isOpen()Z
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->isOpen()Z

    move-result v0

    return v0
.end method

.method public final synthetic isReadOnly()Z
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->isReadOnly()Z

    move-result v0

    return v0
.end method

.method public final synthetic newWatchService()Ljava/nio/file/WatchService;
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->newWatchService()Ll/ۚ۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/֨᩸ᩴ;->b(Ll/ۚ۠ᩴ;)Ljava/nio/file/WatchService;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic provider()Ljava/nio/file/spi/FileSystemProvider;
    .locals 2

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->provider()Ll/۬᩸ᩴ;

    move-result-object v0

    sget v1, Ll/ۛ᩸ᩴ;->b:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    instance-of v1, v0, Ll/ۤ᩸ᩴ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ۤ᩸ᩴ;

    iget-object v0, v0, Ll/ۤ᩸ᩴ;->e:Ljava/nio/file/spi/FileSystemProvider;

    return-object v0

    :cond_1
    new-instance v1, Ll/ۛ᩸ᩴ;

    invoke-direct {v1, v0}, Ll/ۛ᩸ᩴ;-><init>(Ll/۬᩸ᩴ;)V

    return-object v1
.end method

.method public final synthetic supportedFileAttributeViews()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ll/۟ܶᩴ;->a:Ll/۟֨ᩴ;

    invoke-virtual {v0}, Ll/۟֨ᩴ;->supportedFileAttributeViews()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
