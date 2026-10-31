.class public final synthetic Ll/ۛܶᩴ;
.super Ljava/nio/file/FileStore;
.source "N673"


# static fields
.field public static final synthetic b:I


# instance fields
.field public final synthetic a:Ll/ܰ֨ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ܰ֨ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/nio/file/FileStore;-><init>()V

    iput-object p1, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    return-void
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    instance-of v1, p1, Ll/ۛܶᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ۛܶᩴ;

    iget-object p1, p1, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic getAttribute(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0, p1}, Ll/ܰ֨ᩴ;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic getBlockSize()J
    .locals 2

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic getFileStoreAttributeView(Ljava/lang/Class;)Ljava/nio/file/attribute/FileStoreAttributeView;
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0, p1}, Ll/ܰ֨ᩴ;->c(Ljava/lang/Class;)Ll/֡ܶᩴ;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 0
    :cond_0
    iget-object p1, p1, Ll/֡ܶᩴ;->a:Ljava/nio/file/attribute/FileStoreAttributeView;

    return-object p1
.end method

.method public final synthetic getTotalSpace()J
    .locals 2

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic getUnallocatedSpace()J
    .locals 2

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->e()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic getUsableSpace()J
    .locals 2

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->getUsableSpace()J

    move-result-wide v0

    return-wide v0
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isReadOnly()Z
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->f()Z

    move-result v0

    return v0
.end method

.method public final synthetic name()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic supportsFileAttributeView(Ljava/lang/Class;)Z
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-static {p1}, Ll/᩺ۚᩴ;->q(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0, p1}, Ll/ܰ֨ᩴ;->h(Ljava/lang/Class;)Z

    move-result p1

    return p1
.end method

.method public final synthetic supportsFileAttributeView(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0, p1}, Ll/ܰ֨ᩴ;->i(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final synthetic type()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll/ۛܶᩴ;->a:Ll/ܰ֨ᩴ;

    invoke-virtual {v0}, Ll/ܰ֨ᩴ;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
