.class public final Ll/ۡ֡ܿ;
.super Ll/᩷᩵ܿ;
.source "A16O"


# virtual methods
.method public final ֫()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public final ֫(I)V
    .locals 1

    .line 419
    :try_start_0
    iget-object v0, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/system/Os;->chmod(Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method

.method public final ֫(J)V
    .locals 0

    return-void
.end method

.method public final ۧ()I
    .locals 2

    .line 408
    :try_start_0
    iget-object v0, p0, Ll/᩷᩵ܿ;->ۧ:Ll/ܶ᩵ܿ;

    invoke-virtual {v0}, Ll/ܶ᩵ܿ;->֫֫()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/system/Os;->lstat(Ljava/lang/String;)Landroid/system/StructStat;

    move-result-object v0

    .line 410
    iget v0, v0, Landroid/system/StructStat;->st_mode:I
    :try_end_0
    .catch Landroid/system/ErrnoException; {:try_start_0 .. :try_end_0} :catch_0

    and-int/lit16 v0, v0, 0xfff

    return v0

    :catch_0
    move-exception v0

    .line 412
    new-instance v1, Ljava/io/IOException;

    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
