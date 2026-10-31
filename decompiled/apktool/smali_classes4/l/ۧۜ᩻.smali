.class public final synthetic Ll/ۧۜ᩻;
.super Ljava/lang/Object;
.source "D9TI"

# interfaces
.implements Ll/ۚ᩸ܿ;


# virtual methods
.method public final synthetic ᩷֫()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public final ᩻()Z
    .locals 1

    .line 261
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    return v0
.end method
