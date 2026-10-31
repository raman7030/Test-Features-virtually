.class public final Ll/ۘᩳ֫;
.super Ljava/lang/Object;
.source "EB24"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 2

    :try_start_0
    const-string v0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 137
    sget v1, Ll/ۚ۫;->֫:I

    .line 108
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 138
    invoke-static {}, Ll/ۜᩳ֫;->ܿ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 139
    invoke-static {}, Ll/ۜᩳ֫;->ᩳ()Ll/ۜᩳ֫;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۜᩳ֫;->ۧ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    return-void

    :catchall_0
    move-exception v0

    .line 142
    sget v1, Ll/ۚ۫;->֫:I

    .line 119
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 143
    throw v0
.end method
