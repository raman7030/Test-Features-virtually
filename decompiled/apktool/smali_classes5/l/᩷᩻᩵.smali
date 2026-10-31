.class public final Ll/᩷᩻᩵;
.super Ll/ۡۜ᩵;
.source "I6PU"

# interfaces
.implements Ljava/lang/Runnable;
.implements Ll/ۢ᩻᩵;


# instance fields
.field public ۛ:Ll/ۘ֫ܿ;

.field public ۤ:Ll/ۗ᩻᩵;


# virtual methods
.method public final run()V
    .locals 5

    .line 1761
    iget-object v0, p0, Ll/᩷᩻᩵;->ۤ:Ll/ۗ᩻᩵;

    if-eqz v0, :cond_1

    iget-object v1, p0, Ll/᩷᩻᩵;->ۛ:Ll/ۘ֫ܿ;

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    .line 1762
    iput-object v2, p0, Ll/᩷᩻᩵;->ۤ:Ll/ۗ᩻᩵;

    iput-object v2, p0, Ll/᩷᩻᩵;->ۛ:Ll/ۘ֫ܿ;

    .line 1763
    iget-object v2, v0, Ll/ۗ᩻᩵;->᩸:Ljava/lang/Object;

    if-nez v2, :cond_0

    .line 1765
    :try_start_0
    iget-object v2, v1, Ll/ۘ֫ܿ;->֫:Ll/֨֫ܿ;

    iget-wide v3, v1, Ll/ۘ֫ܿ;->ۧ:J

    invoke-static {v2, v3, v4}, Ll/֨֫ܿ;->֫(Ll/֨֫ܿ;J)Ll/ۗ᩻᩵;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ܽ(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    .line 1767
    invoke-virtual {v0, v1}, Ll/ۗ᩻᩵;->ۧ(Ljava/lang/Throwable;)V

    .line 1770
    :cond_0
    :goto_0
    invoke-virtual {v0}, Ll/ۗ᩻᩵;->ܳ()V

    :cond_1
    return-void
.end method

.method public final ܽ()Z
    .locals 1

    .line 1757
    invoke-virtual {p0}, Ll/᩷᩻᩵;->run()V

    const/4 v0, 0x0

    return v0
.end method

.method public final bridge synthetic ᩳ()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
