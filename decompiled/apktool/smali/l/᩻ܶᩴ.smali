.class public final synthetic Ll/᩻ܶᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/attribute/DosFileAttributeView;


# instance fields
.field public final synthetic a:Ll/᩸۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/᩸۠ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    instance-of v1, p1, Ll/᩻ܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/᩻ܶᩴ;

    iget-object p1, p1, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0}, Ll/᩺۠ᩴ;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic readAttributes()Ljava/nio/file/attribute/BasicFileAttributes;
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0}, Ll/ܽܶᩴ;->readAttributes()Ll/ܶ۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ܿܶᩴ;->a(Ll/ܶ۠ᩴ;)Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic readAttributes()Ljava/nio/file/attribute/DosFileAttributes;
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0}, Ll/᩸۠ᩴ;->readAttributes()Ll/ۜܶᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    iget-object v0, v0, Ll/ۜܶᩴ;->a:Ljava/nio/file/attribute/DosFileAttributes;

    return-object v0
.end method

.method public final synthetic setArchive(Z)V
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩸۠ᩴ;->setArchive(Z)V

    return-void
.end method

.method public final synthetic setHidden(Z)V
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩸۠ᩴ;->setHidden(Z)V

    return-void
.end method

.method public final synthetic setReadOnly(Z)V
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩸۠ᩴ;->setReadOnly(Z)V

    return-void
.end method

.method public final synthetic setSystem(Z)V
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-interface {v0, p1}, Ll/᩸۠ᩴ;->setSystem(Z)V

    return-void
.end method

.method public final synthetic setTimes(Ljava/nio/file/attribute/FileTime;Ljava/nio/file/attribute/FileTime;Ljava/nio/file/attribute/FileTime;)V
    .locals 1

    iget-object v0, p0, Ll/᩻ܶᩴ;->a:Ll/᩸۠ᩴ;

    invoke-static {p1}, Ll/᩺ۚᩴ;->m(Ljava/nio/file/attribute/FileTime;)Ll/ۙ۠ᩴ;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->m(Ljava/nio/file/attribute/FileTime;)Ll/ۙ۠ᩴ;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->m(Ljava/nio/file/attribute/FileTime;)Ll/ۙ۠ᩴ;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Ll/ܽܶᩴ;->a(Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;Ll/ۙ۠ᩴ;)V

    return-void
.end method
