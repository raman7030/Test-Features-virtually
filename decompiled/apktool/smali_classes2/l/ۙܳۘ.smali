.class public final Ll/ۙܳۘ;
.super Ljava/lang/Object;
.source "R1LP"


# instance fields
.field public volatile ֫:Z


# virtual methods
.method public final ֫()V
    .locals 1

    const/4 v0, 0x1

    .line 28
    iput-boolean v0, p0, Ll/ۙܳۘ;->֫:Z

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 38
    iget-boolean v0, p0, Ll/ۙܳۘ;->֫:Z

    if-nez v0, :cond_0

    return-void

    .line 39
    :cond_0
    new-instance v0, Ll/ۢۤۧ;

    .line 32
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 39
    throw v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 33
    iget-boolean v0, p0, Ll/ۙܳۘ;->֫:Z

    return v0
.end method

.method public final ᩳ()V
    .locals 1

    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Ll/ۙܳۘ;->֫:Z

    return-void
.end method
