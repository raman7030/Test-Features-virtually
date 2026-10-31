.class public final synthetic Ll/᩺ۡۡ;
.super Ljava/lang/Object;
.source "53XL"

# interfaces
.implements Ll/ܿۖ᩷;


# virtual methods
.method public final ᩻()Z
    .locals 1

    .line 156
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->isInterrupted()Z

    move-result v0

    return v0
.end method
