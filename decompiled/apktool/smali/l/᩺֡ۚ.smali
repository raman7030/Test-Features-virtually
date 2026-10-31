.class public final Ll/᩺֡ۚ;
.super Ljava/lang/Object;
.source "TBIE"


# direct methods
.method public static ֫(Ll/ۨ֡ۚ;)Ll/ۧ֨ۚ;
    .locals 1

    .line 30
    invoke-virtual {p0}, Ll/ۨ֡ۚ;->ۘ()Ll/֨֡ۚ;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 31
    invoke-virtual {p0}, Ll/֨֡ۚ;->ۚ֫()Ll/ۧ֨ۚ;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ll/֨֡ۚ;->ۚ֫()Ll/ۧ֨ۚ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ll/ۧ֨ۚ;

    new-instance v0, Ll/ܿۚۚ;

    invoke-direct {v0}, Ll/ܿۚۚ;-><init>()V

    invoke-direct {p0, v0}, Ll/ۧ֨ۚ;-><init>(Ll/֡ܶۚ;)V

    return-object p0
.end method
