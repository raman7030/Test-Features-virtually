.class public final Ll/֡ۚᩴ;
.super Ll/ۗ֡ᩴ;
.source "U5"

# interfaces
.implements Ll/ᩴۚᩴ;
.implements Ll/ۡ۫ᩴ;


# static fields
.field public static final serialVersionUID:J = -0x61c8864680b583e9L


# virtual methods
.method public final iterator()Ll/۫֡ᩴ;
    .locals 1

    .line 193
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v0}, Ll/᩶֡ᩴ;->iterator()Ll/۫֡ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public synthetic parallelStream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡ۚᩴ;->parallelStream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final parallelStream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 208
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->parallelStream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    .line 190
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩹:Ljava/lang/Object;

    monitor-enter v0

    .line 191
    :try_start_0
    iget-object v1, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-interface {v1, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    .line 192
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public synthetic stream()Ljava/util/stream/Stream;
    .locals 1

    .line 0
    invoke-virtual {p0}, Ll/֡ۚᩴ;->stream()Ll/ܿ᩺ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/ᩳ᩺ᩴ;->convert(Ll/ܿ᩺ᩴ;)Ljava/util/stream/Stream;

    move-result-object v0

    return-object v0
.end method

.method public final stream()Ll/ܿ᩺ᩴ;
    .locals 1

    .line 203
    iget-object v0, p0, Ll/ۗ֡ᩴ;->᩸:Ll/᩶֡ᩴ;

    invoke-static {v0}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object v0

    return-object v0
.end method
