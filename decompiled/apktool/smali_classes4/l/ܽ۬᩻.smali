.class public final Ll/ܽ۬᩻;
.super Ljava/lang/Object;
.source "E6WJ"


# direct methods
.method public static ֫()V
    .locals 2

    .line 48
    invoke-static {}, Ll/ۧۨۡ;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    invoke-static {}, Ll/ܶ᩹᩷;->ۧ()V

    return-void

    .line 51
    :cond_0
    new-instance v0, Ll/ܺ֨ܿ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll/ܺ֨ܿ;-><init>(I)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method
