.class public final synthetic Ll/ܰ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/᩷۠ᩴ;
.implements Ll/ۙ֨ᩴ;


# instance fields
.field public final synthetic a:Ljava/nio/file/Path;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/Path;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    return-void
.end method

.method public static synthetic l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/۟᩸ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/۟᩸ᩴ;

    iget-object p0, p0, Ll/۟᩸ᩴ;->a:Ll/᩷۠ᩴ;

    return-object p0

    :cond_1
    new-instance v0, Ll/ܰ᩸ᩴ;

    invoke-direct {v0, p0}, Ll/ܰ᩸ᩴ;-><init>(Ljava/nio/file/Path;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/᩺ۚᩴ;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final synthetic compareTo(Ll/᩷۠ᩴ;)I
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->compareTo(Ljava/nio/file/Path;)I

    move-result p1

    return p1
.end method

.method public final synthetic endsWith(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->endsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final synthetic endsWith(Ll/᩷۠ᩴ;)Z
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->endsWith(Ljava/nio/file/Path;)Z

    move-result p1

    return p1
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    instance-of v1, p1, Ll/ܰ᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ܰ᩸ᩴ;

    iget-object p1, p1, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic forEach(Ljava/util/function/Consumer;)V
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {v0, p1}, Ll/᩶֨ᩴ;->forEach(Ljava/lang/Iterable;Ljava/util/function/Consumer;)V

    return-void
.end method

.method public final synthetic getFileName()Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->getFileName()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getFileSystem()Ll/۟֨ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->getFileSystem()Ljava/nio/file/FileSystem;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ܶᩴ;->b(Ljava/nio/file/FileSystem;)Ll/۟֨ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getName(I)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->getName(I)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getNameCount()I
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->getNameCount()I

    move-result v0

    return v0
.end method

.method public final synthetic getParent()Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->getParent()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getRoot()Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->getRoot()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isAbsolute()Z
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->isAbsolute()Z

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 2

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 15
    new-instance v1, Ll/֨۠ᩴ;

    invoke-direct {v1, v0}, Ll/֨۠ᩴ;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method public final synthetic normalize()Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->normalize()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;)Ll/֡۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/֨᩸ᩴ;->b(Ll/ۚ۠ᩴ;)Ljava/nio/file/WatchService;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->L([Ll/ᩴ۠ᩴ;)[Ljava/nio/file/WatchEvent$Kind;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/nio/file/Path;->register(Ljava/nio/file/WatchService;[Ljava/nio/file/WatchEvent$Kind;)Ljava/nio/file/WatchKey;

    move-result-object p1

    invoke-static {p1}, Ll/ۖ᩸ᩴ;->a(Ljava/nio/file/WatchKey;)Ll/֡۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;[Ll/᩵۠ᩴ;)Ll/֡۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/֨᩸ᩴ;->b(Ll/ۚ۠ᩴ;)Ljava/nio/file/WatchService;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->L([Ll/ᩴ۠ᩴ;)[Ljava/nio/file/WatchEvent$Kind;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->M([Ll/᩵۠ᩴ;)[Ljava/nio/file/WatchEvent$Modifier;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Ljava/nio/file/Path;->register(Ljava/nio/file/WatchService;[Ljava/nio/file/WatchEvent$Kind;[Ljava/nio/file/WatchEvent$Modifier;)Ljava/nio/file/WatchKey;

    move-result-object p1

    invoke-static {p1}, Ll/ۖ᩸ᩴ;->a(Ljava/nio/file/WatchKey;)Ll/֡۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic relativize(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->relativize(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->resolve(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic resolve(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->resolve(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic resolveSibling(Ljava/lang/String;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->resolveSibling(Ljava/lang/String;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic resolveSibling(Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->resolveSibling(Ljava/nio/file/Path;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic spliterator()Ljava/util/Spliterator;
    .locals 1

    invoke-virtual {p0}, Ll/ܰ᩸ᩴ;->spliterator()Ll/ܶ۫ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/۠۫ᩴ;->convert(Ll/ܶ۫ᩴ;)Ljava/util/Spliterator;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic spliterator()Ll/ܶ۫ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/lang/Iterable;->spliterator()Ljava/util/Spliterator;

    move-result-object v0

    invoke-static {v0}, Ll/ۗܳ᩵;->a(Ljava/util/Spliterator;)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic startsWith(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->startsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final synthetic startsWith(Ll/᩷۠ᩴ;)Z
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->startsWith(Ljava/nio/file/Path;)Z

    move-result p1

    return p1
.end method

.method public final synthetic subpath(II)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0, p1, p2}, Ljava/nio/file/Path;->subpath(II)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic toAbsolutePath()Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->toAbsolutePath()Ljava/nio/file/Path;

    move-result-object v0

    invoke-static {v0}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic toFile()Ljava/io/File;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic toRealPath([Ll/ܳ۠ᩴ;)Ll/᩷۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-static {p1}, Ll/᩺ۚᩴ;->K([Ll/ܳ۠ᩴ;)[Ljava/nio/file/LinkOption;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/nio/file/Path;->toRealPath([Ljava/nio/file/LinkOption;)Ljava/nio/file/Path;

    move-result-object p1

    invoke-static {p1}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic toUri()Ljava/net/URI;
    .locals 1

    iget-object v0, p0, Ll/ܰ᩸ᩴ;->a:Ljava/nio/file/Path;

    invoke-interface {v0}, Ljava/nio/file/Path;->toUri()Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method
