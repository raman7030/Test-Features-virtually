.class public final synthetic Ll/֨᩹ۢ;
.super Ljava/lang/Object;
.source "Q1R8"

# interfaces
.implements Ljava/lang/Runnable;


# virtual methods
.method public final run()V
    .locals 1

    .line 2
    sget v0, Ll/ۤ᩹ۢ;->ۢۧ:I

    .line 35
    invoke-static {}, Ll/ܶ᩹᩷;->֫()Lbin/mt/plus/Main;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 213
    invoke-virtual {v0}, Ll/֨ܿ;->ܺ()Ll/۬ܿ;

    move-result-object v0

    invoke-virtual {v0}, Ll/۬ܿ;->ۧ()Z

    :cond_0
    return-void
.end method
