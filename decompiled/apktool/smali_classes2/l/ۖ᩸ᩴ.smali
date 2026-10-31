.class public final synthetic Ll/ۖ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/֡۠ᩴ;


# instance fields
.field public final synthetic a:Ljava/nio/file/WatchKey;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/WatchKey;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    return-void
.end method

.method public static synthetic a(Ljava/nio/file/WatchKey;)Ll/֡۠ᩴ;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/ᩴ᩸ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/ᩴ᩸ᩴ;

    iget-object p0, p0, Ll/ᩴ᩸ᩴ;->a:Ll/֡۠ᩴ;

    return-object p0

    :cond_1
    new-instance v0, Ll/ۖ᩸ᩴ;

    invoke-direct {v0, p0}, Ll/ۖ᩸ᩴ;-><init>(Ljava/nio/file/WatchKey;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic cancel()V
    .locals 1

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    invoke-interface {v0}, Ljava/nio/file/WatchKey;->cancel()V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    instance-of v1, p1, Ll/ۖ᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ۖ᩸ᩴ;

    iget-object p1, p1, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic isValid()Z
    .locals 1

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    invoke-interface {v0}, Ljava/nio/file/WatchKey;->isValid()Z

    move-result v0

    return v0
.end method

.method public final synthetic pollEvents()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    invoke-interface {v0}, Ljava/nio/file/WatchKey;->pollEvents()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll/᩺ۚᩴ;->w(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic reset()Z
    .locals 1

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    invoke-interface {v0}, Ljava/nio/file/WatchKey;->reset()Z

    move-result v0

    return v0
.end method

.method public final synthetic watchable()Ll/ۙ᩸ᩴ;
    .locals 2

    iget-object v0, p0, Ll/ۖ᩸ᩴ;->a:Ljava/nio/file/WatchKey;

    invoke-interface {v0}, Ljava/nio/file/WatchKey;->watchable()Ljava/nio/file/Watchable;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 0
    :cond_0
    instance-of v1, v0, Ll/᩹᩸ᩴ;

    if-eqz v1, :cond_1

    check-cast v0, Ll/᩹᩸ᩴ;

    iget-object v0, v0, Ll/᩹᩸ᩴ;->a:Ll/ۙ᩸ᩴ;

    return-object v0

    :cond_1
    instance-of v1, v0, Ljava/nio/file/Path;

    if-eqz v1, :cond_2

    check-cast v0, Ljava/nio/file/Path;

    invoke-static {v0}, Ll/ܰ᩸ᩴ;->l(Ljava/nio/file/Path;)Ll/᩷۠ᩴ;

    move-result-object v0

    return-object v0

    :cond_2
    new-instance v1, Ll/ܶ᩸ᩴ;

    invoke-direct {v1, v0}, Ll/ܶ᩸ᩴ;-><init>(Ljava/nio/file/Watchable;)V

    return-object v1
.end method
