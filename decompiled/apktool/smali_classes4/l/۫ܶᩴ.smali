.class public final synthetic Ll/۫ܶᩴ;
.super Ll/ܰ֨ᩴ;
.source "N673"


# instance fields
.field public final synthetic a:Ljava/nio/file/FileStore;


# direct methods
.method public constructor <init>(Ljava/nio/file/FileStore;)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 0
    iput-object p1, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    return-void
.end method


# virtual methods
.method public final synthetic a(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0, p1}, Ljava/nio/file/FileStore;->getAttribute(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic b()J
    .locals 2

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->getBlockSize()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic c(Ljava/lang/Class;)Ll/֡ܶᩴ;
    .locals 1

    .line 0
    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0, p1}, Ljava/nio/file/FileStore;->getFileStoreAttributeView(Ljava/lang/Class;)Ljava/nio/file/attribute/FileStoreAttributeView;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ll/֡ܶᩴ;

    invoke-direct {v0, p1}, Ll/֡ܶᩴ;-><init>(Ljava/nio/file/attribute/FileStoreAttributeView;)V

    return-object v0
.end method

.method public final synthetic d()J
    .locals 2

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->getTotalSpace()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic e()J
    .locals 2

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->getUnallocatedSpace()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    instance-of v1, p1, Ll/۫ܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/۫ܶᩴ;

    iget-object p1, p1, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic f()Z
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->isReadOnly()Z

    move-result v0

    return v0
.end method

.method public final synthetic g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->name()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic getUsableSpace()J
    .locals 2

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->getUsableSpace()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic h(Ljava/lang/Class;)Z
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-static {p1}, Ll/᩺ۚᩴ;->q(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/nio/file/FileStore;->supportsFileAttributeView(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic i(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0, p1}, Ljava/nio/file/FileStore;->supportsFileAttributeView(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final synthetic j()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/۫ܶᩴ;->a:Ljava/nio/file/FileStore;

    invoke-virtual {v0}, Ljava/nio/file/FileStore;->type()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
