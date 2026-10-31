.class public final synthetic Ll/ܶ᩸ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ll/ۙ᩸ᩴ;


# instance fields
.field public final synthetic a:Ljava/nio/file/Watchable;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/file/Watchable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    return-void
.end method


# virtual methods
.method public final synthetic equals(Ljava/lang/Object;)Z
    .locals 2

    iget-object v0, p0, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    instance-of v1, p1, Ll/ܶ᩸ᩴ;

    if-eqz v1, :cond_0

    check-cast p1, Ll/ܶ᩸ᩴ;

    iget-object p1, p1, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic hashCode()I
    .locals 1

    iget-object v0, p0, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final synthetic register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;)Ll/֡۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    invoke-static {p1}, Ll/֨᩸ᩴ;->b(Ll/ۚ۠ᩴ;)Ljava/nio/file/WatchService;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->L([Ll/ᩴ۠ᩴ;)[Ljava/nio/file/WatchEvent$Kind;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Ljava/nio/file/Watchable;->register(Ljava/nio/file/WatchService;[Ljava/nio/file/WatchEvent$Kind;)Ljava/nio/file/WatchKey;

    move-result-object p1

    invoke-static {p1}, Ll/ۖ᩸ᩴ;->a(Ljava/nio/file/WatchKey;)Ll/֡۠ᩴ;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic register(Ll/ۚ۠ᩴ;[Ll/ᩴ۠ᩴ;[Ll/᩵۠ᩴ;)Ll/֡۠ᩴ;
    .locals 1

    iget-object v0, p0, Ll/ܶ᩸ᩴ;->a:Ljava/nio/file/Watchable;

    invoke-static {p1}, Ll/֨᩸ᩴ;->b(Ll/ۚ۠ᩴ;)Ljava/nio/file/WatchService;

    move-result-object p1

    invoke-static {p2}, Ll/᩺ۚᩴ;->L([Ll/ᩴ۠ᩴ;)[Ljava/nio/file/WatchEvent$Kind;

    move-result-object p2

    invoke-static {p3}, Ll/᩺ۚᩴ;->M([Ll/᩵۠ᩴ;)[Ljava/nio/file/WatchEvent$Modifier;

    move-result-object p3

    invoke-interface {v0, p1, p2, p3}, Ljava/nio/file/Watchable;->register(Ljava/nio/file/WatchService;[Ljava/nio/file/WatchEvent$Kind;[Ljava/nio/file/WatchEvent$Modifier;)Ljava/nio/file/WatchKey;

    move-result-object p1

    invoke-static {p1}, Ll/ۖ᩸ᩴ;->a(Ljava/nio/file/WatchKey;)Ll/֡۠ᩴ;

    move-result-object p1

    return-object p1
.end method
