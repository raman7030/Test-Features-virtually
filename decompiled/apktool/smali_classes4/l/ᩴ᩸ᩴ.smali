.class public final synthetic Ll/ᩴ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/WatchKey;


# instance fields
.field public final synthetic a:Ll/֡۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/֡۠ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    return-void
.end method

.method public static synthetic a(Ll/֡۠ᩴ;)Ljava/nio/file/WatchKey;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/ۖ᩸ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ۖ᩸ᩴ;

    iget-object p0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    return-object p0

    :cond_1
    new-instance v0, Ll/ᩴ᩸ᩴ;

    invoke-direct {v0, p0}, Ll/ᩴ᩸ᩴ;-><init>(Ll/֡۠ᩴ;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic cancel()V
    .locals 1

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    invoke-interface {v0}, Ll/֡۠ᩴ;->cancel()V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    instance-of v1, p1, Ll/ᩴ᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ᩴ᩸ᩴ;

    iget-object p1, p1, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isValid()Z
    .locals 1

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    invoke-interface {v0}, Ll/֡۠ᩴ;->isValid()Z

    move-result v0

    return v0
.end method

.method public final synthetic pollEvents()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    invoke-interface {v0}, Ll/֡۠ᩴ;->pollEvents()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic reset()Z
    .locals 1

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    invoke-interface {v0}, Ll/֡۠ᩴ;->reset()Z

    move-result v0

    return v0
.end method

.method public final synthetic watchable()Ljava/nio/file/Watchable;
    .locals 2

    iget-object v0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    invoke-interface {v0}, Ll/֡۠ᩴ;->watchable()Ll/ۙ᩸ᩴ;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    instance-of v1, v0, Ll/ܶ᩸ᩴ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/ܶ᩸ᩴ;

    iget-object v0, v0, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    return-object v0

    :cond_1
    instance-of v1, v0, Ll/᩷۠ᩴ;

    if-eqz v1, :cond_2

    check-cast v0, Ll/᩷۠ᩴ;

    invoke-static {v0}, Ll/۟᩸ᩴ;->l(Ll/᩷۠ᩴ;)Ljava/nio/file/Path;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Ll/᩹᩸ᩴ;

    invoke-direct {v1, v0}, Ll/᩹᩸ᩴ;-><init>(Ll/ۙ᩸ᩴ;)V

    return-object v1
.end method
