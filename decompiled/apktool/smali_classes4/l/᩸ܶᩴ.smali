.class public final synthetic Ll/᩸ܶᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/attribute/PosixFileAttributes;


# instance fields
.field public final synthetic a:Ll/ۗ۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ۗ۠ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic creationTime()Ljava/nio/file/attribute/FileTime;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->creationTime()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->o(Ll/ۙ۠ᩴ;)Ljava/nio/file/attribute/FileTime;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    instance-of v1, p1, Ll/᩸ܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/᩸ܶᩴ;

    iget-object p1, p1, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic fileKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->fileKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic group()Ljava/nio/file/attribute/GroupPrincipal;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ۗ۠ᩴ;->group()Ll/֨ܶᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    iget-object v0, v0, Ll/֨ܶᩴ;->a:Ljava/nio/file/attribute/GroupPrincipal;

    return-object v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isDirectory()Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->isDirectory()Z

    move-result v0

    return v0
.end method

.method public final synthetic isOther()Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->isOther()Z

    move-result v0

    return v0
.end method

.method public final synthetic isRegularFile()Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->isRegularFile()Z

    move-result v0

    return v0
.end method

.method public final synthetic isSymbolicLink()Z
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->isSymbolicLink()Z

    move-result v0

    return v0
.end method

.method public final synthetic lastAccessTime()Ljava/nio/file/attribute/FileTime;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->lastAccessTime()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->o(Ll/ۙ۠ᩴ;)Ljava/nio/file/attribute/FileTime;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic lastModifiedTime()Ljava/nio/file/attribute/FileTime;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->lastModifiedTime()Ll/ۙ۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->o(Ll/ۙ۠ᩴ;)Ljava/nio/file/attribute/FileTime;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic owner()Ljava/nio/file/attribute/UserPrincipal;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ۗ۠ᩴ;->owner()Ll/ۨ۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ۤ۠ᩴ;->a(Ll/ۨ۠ᩴ;)Ljava/nio/file/attribute/UserPrincipal;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic permissions()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ۗ۠ᩴ;->permissions()Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->v(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic size()J
    .locals 2

    iget-object v0, p0, Ll/᩸ܶᩴ;->a:Ll/ۗ۠ᩴ;

    invoke-interface {v0}, Ll/ܶ۠ᩴ;->size()J

    move-result-wide v0

    return-wide v0
.end method
