.class public final Ll/ۨ᩻֡;
.super Ljava/lang/Object;
.source "AARN"

# interfaces
.implements Ljava/security/PrivilegedAction;


# virtual methods
.method public final run()Ljava/lang/Object;
    .locals 1

    const-string v0, "TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT"

    .line 2247
    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
