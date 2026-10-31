.class public abstract Ll/᩻۠ۘ;
.super Ljava/lang/Object;
.source "B7KV"


# direct methods
.method public static ֫(Ll/ۙ֨ۘ;Ll/֡ܰۧ;)V
    .locals 3

    const-string v0, "baseDotsIndicator"

    .line 5
    invoke-static {p0, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachable"

    .line 0
    invoke-static {p1, v0}, Ll/ۧ᩶᩵;->ܽ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-virtual {p1}, Ll/֡ܰۧ;->ۧ()Ll/ۨ᩺ۧ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 12
    new-instance v1, Ll/ܿ۠ۘ;

    invoke-direct {v1, p0}, Ll/ܿ۠ۘ;-><init>(Ll/ۙ֨ۘ;)V

    .line 20
    new-instance v2, Ll/ۢ۠ۘ;

    invoke-direct {v2, v1}, Ll/ۢ۠ۘ;-><init>(Ll/ܿ۠ۘ;)V

    invoke-virtual {v0, v2}, Ll/ۨ᩺ۧ;->֫(Landroid/database/DataSetObserver;)V

    .line 29
    new-instance v0, Ll/᩷۠ۘ;

    invoke-direct {v0, p1}, Ll/᩷۠ۘ;-><init>(Ll/֡ܰۧ;)V

    .line 16
    invoke-virtual {p0, v0}, Ll/ۙ֨ۘ;->֫(Ll/᩷۠ۘ;)V

    .line 17
    invoke-virtual {p0}, Ll/ۙ֨ۘ;->᩷()V

    return-void

    .line 8
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Please set an adapter to the view pager (1 or 2) or the recycler before initializing the dots indicator"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
