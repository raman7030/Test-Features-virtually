.class public final synthetic Ll/֨᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/nio/file/WatchService;


# instance fields
.field public final synthetic a:Ll/ۚ۠ᩴ;


# direct methods
.method public synthetic constructor <init>(Ll/ۚ۠ᩴ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    return-void
.end method

.method public static synthetic b(Ll/ۚ۠ᩴ;)Ljava/nio/file/WatchService;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Ll/֡᩸ᩴ;

    if-eqz v0, :cond_1

    check-cast p0, Ll/֡᩸ᩴ;

    iget-object p0, p0, Ll/֡᩸ᩴ;->a:Ljava/nio/file/WatchService;

    return-object p0

    :cond_1
    new-instance v0, Ll/֨᩸ᩴ;

    invoke-direct {v0, p0}, Ll/֨᩸ᩴ;-><init>(Ll/ۚ۠ᩴ;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic close()V
    .locals 1

    iget-object v0, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    return-void
.end method

.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    instance-of v1, p1, Ll/֨᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/֨᩸ᩴ;

    iget-object p1, p1, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic poll()Ljava/nio/file/WatchKey;
    .locals 1

    iget-object v0, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    invoke-interface {v0}, Ll/ۚ۠ᩴ;->poll()Ll/֡۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩸ᩴ;->a(Ll/֡۠ᩴ;)Ljava/nio/file/WatchKey;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic poll(JLjava/util/concurrent/TimeUnit;)Ljava/nio/file/WatchKey;
    .locals 1

    iget-object v0, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    invoke-interface {v0, p1, p2, p3}, Ll/ۚ۠ᩴ;->poll(JLjava/util/concurrent/TimeUnit;)Ll/֡۠ᩴ;

    move-result-object p1

    invoke-static {p1}, Ll/ᩴ᩸ᩴ;->a(Ll/֡۠ᩴ;)Ljava/nio/file/WatchKey;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic take()Ljava/nio/file/WatchKey;
    .locals 1

    iget-object v0, p0, Ll/֨᩸ᩴ;->a:Ll/ۚ۠ᩴ;

    invoke-interface {v0}, Ll/ۚ۠ᩴ;->take()Ll/֡۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩴ᩸ᩴ;->a(Ll/֡۠ᩴ;)Ljava/nio/file/WatchKey;

    move-result-object v0

    return-object v0
.end method
