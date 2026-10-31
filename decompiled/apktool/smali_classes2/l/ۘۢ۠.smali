.class public final synthetic Ll/ۘۢ۠;
.super Ljava/lang/Object;
.source "27L2"


# direct methods
.method public static ֫(Ll/֡ۢ۠;Ll/ۛ᩸֨;)Ll/᩵ۢ۠;
    .locals 2

    .line 148
    new-instance v0, Ll/᩵ۢ۠;

    invoke-interface {p0}, Ll/֡ۢ۠;->ۚ()Ll/۠ۢ۠;

    move-result-object v1

    invoke-interface {p0}, Ll/֡ۢ۠;->ۢ()[Ll/۠ۢ۠;

    move-result-object p0

    invoke-direct {v0, p1, v1, p0}, Ll/᩵ۢ۠;-><init>(Ll/ۛ᩸֨;Ll/۠ۢ۠;[Ll/۠ۢ۠;)V

    return-object v0
.end method

.method public static ۧ(Ll/֡ۢ۠;Ll/ۛ᩸֨;)Ll/᩺ܶ۠;
    .locals 3

    .line 153
    new-instance v0, Ll/᩺ܶ۠;

    invoke-interface {p0, p1}, Ll/֡ۢ۠;->ۧ(Ll/ۛ᩸֨;)Ll/᩵ۢ۠;

    move-result-object v1

    invoke-interface {p0}, Ll/֡ۢ۠;->ۡ()Ll/ۙ֨֨;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    new-instance v2, Ll/ۤ᩸֨;

    invoke-direct {v2, p0, p1}, Ll/ۤ᩸֨;-><init>(Ll/ۙ֨֨;Ll/ۛ᩸֨;)V

    .line 153
    invoke-direct {v0, v1, v2}, Ll/᩺ܶ۠;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method
