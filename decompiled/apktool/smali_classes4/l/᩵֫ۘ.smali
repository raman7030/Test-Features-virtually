.class public final Ll/᩵֫ۘ;
.super Ljava/lang/Object;
.source "JAG5"


# direct methods
.method public static ֫(Ll/֨֫ۘ;)[B
    .locals 3

    .line 29
    invoke-virtual {p0}, Ll/֨֫ۘ;->֫()Ll/֡֫ۘ;

    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ll/ۤܰۖ;->ۡ()I

    move-result v1

    .line 31
    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    invoke-interface {v2}, Ll/ۚ֫ۘ;->֫()I

    move-result v2

    invoke-virtual {v0, v2}, Ll/ۤܰۖ;->ᩳ(I)V

    .line 32
    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object v2

    invoke-interface {v2}, Ll/ۚ֫ۘ;->ۧ()I

    move-result v2

    invoke-virtual {p0}, Ll/֨֫ۘ;->ۧ()Ll/ۚ֫ۘ;

    move-result-object p0

    invoke-interface {p0}, Ll/ۚ֫ۘ;->֫()I

    move-result p0

    sub-int/2addr v2, p0

    new-array p0, v2, [B

    .line 293
    :try_start_0
    invoke-virtual {v0, v2, p0}, Ll/ۤܰۖ;->ۧ(I[B)V
    :try_end_0
    .catch Ll/۬ܰۖ; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    invoke-virtual {v0, v1}, Ll/ۤܰۖ;->ᩳ(I)V

    return-object p0

    :catch_0
    move-exception p0

    .line 36
    new-instance v0, Ll/ۧۧۘ;

    const-string v1, "Cannot read packet bytes from buffer"

    .line 42
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    throw v0
.end method
