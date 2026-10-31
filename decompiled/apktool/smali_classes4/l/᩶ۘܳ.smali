.class public final Ll/᩶ۘܳ;
.super Ljava/lang/Object;
.source "97EU"


# direct methods
.method public static ֫(Ll/ܽᩴܳ;Ll/᩹ۘܳ;Ll/᩶ۖܳ;Ll/ۨܺ᩷;)Ll/ۤܺ᩷;
    .locals 2

    move-object v0, p0

    .line 83
    monitor-enter v0

    .line 84
    :try_start_0
    invoke-static {p0, p1}, Ll/᩶ۘܳ;->ܽ(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)Z

    move-result p1

    const/4 v1, 0x0

    if-nez p1, :cond_0

    .line 85
    monitor-exit v0

    return-object v1

    .line 87
    :cond_0
    invoke-virtual {p0}, Ll/ܽᩴܳ;->ܿ()Ljava/lang/ref/WeakReference;

    move-result-object p1

    .line 88
    invoke-virtual {p0, p2, p3}, Ll/ܽᩴܳ;->֫(Ll/᩶ۖܳ;Ll/ۨܺ᩷;)V

    if-eqz p1, :cond_1

    .line 89
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Ll/ۤܺ᩷;

    :cond_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    .line 90
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܽᩴܳ;)Ll/᩹ۘܳ;
    .locals 4

    move-object v0, p0

    .line 42
    monitor-enter v0

    .line 43
    :try_start_0
    invoke-virtual {p0}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    .line 44
    invoke-virtual {p0}, Ll/ܽᩴܳ;->ᩳ()Ljava/lang/String;

    move-result-object v2

    .line 45
    invoke-virtual {p0}, Ll/ܽᩴܳ;->ܽ()I

    move-result v3

    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 47
    new-instance p0, Ll/᩹ۘܳ;

    const/4 v2, 0x0

    invoke-direct {p0, v1, v3, v2}, Ll/᩹ۘܳ;-><init>(Ljava/lang/String;IZ)V

    monitor-exit v0

    return-object p0

    :cond_0
    const/4 v2, 0x1

    add-int/2addr v3, v2

    .line 50
    invoke-virtual {p0, v3}, Ll/ܽᩴܳ;->֫(I)V

    .line 51
    invoke-virtual {p0, v1}, Ll/ܽᩴܳ;->֫(Ljava/lang/String;)V

    .line 52
    new-instance p0, Ll/᩹ۘܳ;

    invoke-direct {p0, v1, v3, v2}, Ll/᩹ۘܳ;-><init>(Ljava/lang/String;IZ)V

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    .line 53
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)V
    .locals 1

    move-object v0, p0

    .line 97
    monitor-enter v0

    .line 98
    :try_start_0
    invoke-static {p0, p1}, Ll/᩶ۘܳ;->ܽ(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)Z

    move-result p1

    if-nez p1, :cond_0

    .line 99
    monitor-exit v0

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 101
    invoke-virtual {p0, p1}, Ll/ܽᩴܳ;->֫(Ljava/lang/String;)V

    .line 102
    invoke-virtual {p0, p1}, Ll/ܽᩴܳ;->֫(Ljava/lang/ref/WeakReference;)V

    .line 103
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    .line 104
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ֫(Ll/ܽᩴܳ;Ll/᩹ۘܳ;Ll/ۤܺ᩷;)V
    .locals 1

    move-object v0, p0

    .line 61
    monitor-enter v0

    .line 62
    :try_start_0
    invoke-static {p0, p1}, Ll/᩶ۘܳ;->ܽ(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 63
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ll/ܽᩴܳ;->֫(Ljava/lang/ref/WeakReference;)V

    .line 65
    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ۧ(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)Z
    .locals 1

    move-object v0, p0

    .line 72
    monitor-enter v0

    .line 73
    :try_start_0
    invoke-static {p0, p1}, Ll/᩶ۘܳ;->ܽ(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)Z

    move-result p0

    monitor-exit v0

    return p0

    :catchall_0
    move-exception p0

    .line 74
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static ܽ(Ll/ܽᩴܳ;Ll/᩹ۘܳ;)Z
    .locals 2

    .line 108
    invoke-virtual {p0}, Ll/ܽᩴܳ;->ܽ()I

    move-result v0

    invoke-virtual {p1}, Ll/᩹ۘܳ;->ۧ()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 109
    invoke-virtual {p1}, Ll/᩹ۘܳ;->֫()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ll/ܽᩴܳ;->ۜ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 110
    invoke-virtual {p1}, Ll/᩹ۘܳ;->֫()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Ll/ܽᩴܳ;->ᩳ()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method
