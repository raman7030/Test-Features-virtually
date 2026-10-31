.class public final Ll/۟۬ۚ;
.super Ljava/lang/Object;
.source "77EG"


# direct methods
.method public static ֫(ILl/ܽ۫ᩴ;)Ll/ܰ۬ۚ;
    .locals 1

    .line 47
    invoke-static {p0}, Ll/ܰ۬ۚ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    invoke-static {p0}, Ll/ܰ۬ۚ;->get(I)Ll/ܰ۬ۚ;

    move-result-object p0

    return-object p0

    .line 50
    :cond_0
    new-instance v0, Ll/ۨ۬ۚ;

    invoke-direct {v0, p0}, Ll/ۨ۬ۚ;-><init>(I)V

    invoke-virtual {p1, v0}, Ll/ܽ۫ᩴ;->ifPresent(Ljava/util/function/Consumer;)V

    .line 51
    sget-object p0, Ll/ܰ۬ۚ;->֫֫:Ll/ܰ۬ۚ;

    return-object p0
.end method
