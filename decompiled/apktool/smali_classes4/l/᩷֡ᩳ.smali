.class public final Ll/᩷֡ᩳ;
.super Ljava/lang/Object;
.source "66S6"


# direct methods
.method public static ֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/ۜ֡ᩳ;Ll/ܿۖ᩷;)Ll/ۨ᩵ᩳ;
    .locals 8

    .line 18
    invoke-static {p1, p0}, Ll/ۤۘᩳ;->ۧ(Ljava/lang/String;Ll/᩷۠ᩴ;)Ll/᩷۠ᩴ;

    move-result-object v7

    .line 19
    invoke-static {p3}, Ll/᩷֡ᩳ;->֫(Ll/ܿۖ᩷;)V

    const-string v0, ".dat"

    .line 20
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    const-string v0, ".tat"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, ".lit"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 21
    invoke-interface {p0, v0}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v0

    invoke-static {v0}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    const-string v2, "migration.id"

    .line 22
    invoke-interface {v7, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-static {v2}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_2

    const-string v2, "app-adopted"

    .line 23
    invoke-interface {v7, v2}, Ll/᩷۠ᩴ;->resolve(Ljava/lang/String;)Ll/᩷۠ᩴ;

    move-result-object v2

    invoke-static {v2}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v2

    if-eqz v2, :cond_3

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    .line 24
    :cond_3
    :goto_2
    invoke-static {v7}, Ll/᩷֡ᩳ;->֫(Ll/᩷۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz v1, :cond_5

    .line 26
    :cond_4
    iget-object v0, p2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    invoke-static {p0, p1, v0}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;Ljava/lang/String;Ll/֨۬ᩳ;)Ll/ۤۘᩳ;

    move-result-object p0

    .line 27
    :try_start_0
    invoke-static {p3}, Ll/᩷֡ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 28
    iget-object v0, p0, Ll/ۤۘᩳ;->۬:Ll/ᩴۘᩳ;

    iget-object v0, v0, Ll/ᩴۘᩳ;->ܽ:Ll/᩵ۘᩳ;

    invoke-virtual {v0}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v7, v0}, Ll/ۢ֡ᩳ;->֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;)V

    .line 30
    invoke-virtual {p0}, Ll/ۤۘᩳ;->֫()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 31
    invoke-virtual {p0}, Ll/ۤۘᩳ;->close()V

    .line 33
    :cond_5
    invoke-static {p3}, Ll/᩷֡ᩳ;->֫(Ll/ܿۖ᩷;)V

    .line 34
    iget-object v1, p2, Ll/ۜ֡ᩳ;->֫:Ll/֨۬ᩳ;

    iget-object v2, p2, Ll/ۜ֡ᩳ;->ܽ:Ll/ۙ۬ᩳ;

    iget-object v3, p2, Ll/ۜ֡ᩳ;->ۧ:Ljava/util/concurrent/Executor;

    const/high16 v4, 0x800000

    move-object v0, v7

    move-object v5, p3

    move-object v6, p1

    invoke-static/range {v0 .. v6}, Ll/ۨ᩵ᩳ;->֫(Ll/᩷۠ᩴ;Ll/֨۬ᩳ;Ll/ۙ۬ᩳ;Ljava/util/concurrent/Executor;ILl/ܿۖ᩷;Ljava/lang/String;)Ll/ۨ᩵ᩳ;

    move-result-object p0

    .line 36
    :try_start_1
    iget-object p1, p0, Ll/ۨ᩵ᩳ;->ۢ:Ll/ۤᩴᩳ;

    iget-object p1, p1, Ll/ۤᩴᩳ;->᩹:Ll/ۛᩴᩳ;

    iget-object p1, p1, Ll/ۛᩴᩳ;->᩸:Ll/᩵ۘᩳ;

    invoke-virtual {p1}, Ll/᩵ۘᩳ;->ܽ()Landroid/os/Bundle;

    move-result-object p1

    invoke-static {v7, p1}, Ll/ۢ֡ᩳ;->֫(Ll/᩷۠ᩴ;Landroid/os/Bundle;)V

    .line 37
    invoke-static {p3}, Ll/᩷֡ᩳ;->֫(Ll/ܿۖ᩷;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_0

    return-object p0

    :catch_0
    move-exception p1

    goto :goto_3

    :catch_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    .line 40
    :goto_3
    :try_start_2
    invoke-virtual {p0}, Ll/ۨ᩵ᩳ;->֫()Ll/ۗ᩻᩵;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۗ᩻᩵;->ܿ()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 41
    :goto_4
    throw p1

    :catchall_1
    move-exception p1

    .line 26
    :try_start_3
    invoke-virtual {p0}, Ll/ۤۘᩳ;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_5
    throw p1
.end method

.method public static ֫(Ll/ܿۖ᩷;)V
    .locals 1

    .line 46
    invoke-interface {p0}, Ll/ܿۖ᩷;->᩻()Z

    move-result p0

    if-nez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string v0, "Session startup is canceled"

    invoke-direct {p0, v0}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ֫(Ll/᩷۠ᩴ;)Z
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 13
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p0, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result p0

    return p0
.end method
