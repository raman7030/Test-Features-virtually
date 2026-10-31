.class public final Ll/ۨ۬ᩳ;
.super Ljava/lang/Object;
.source "T6QB"

# interfaces
.implements Ll/᩺۬ᩳ;


# virtual methods
.method public final ֫(Ll/᩷۠ᩴ;Z)Ll/۬۬ᩳ;
    .locals 1

    .line 23
    new-instance v0, Ll/۬۬ᩳ;

    invoke-direct {v0, p1, p2}, Ll/۬۬ᩳ;-><init>(Ll/᩷۠ᩴ;Z)V

    return-object v0
.end method

.method public final ֫(Ljava/nio/channels/FileChannel;)V
    .locals 1

    const/4 v0, 0x1

    .line 66
    invoke-virtual {p1, v0}, Ljava/nio/channels/FileChannel;->force(Z)V

    return-void
.end method

.method public final synthetic ֫(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 0
    invoke-static {p1}, Ll/ۛ۬ᩳ;->֫(Ll/᩷۠ᩴ;)V

    return-void
.end method

.method public final ֫(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ll/᩺֨ᩴ;

    .line 34
    sget-object v1, Ll/ۖ۠ᩴ;->ATOMIC_MOVE:Ll/ۖ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ll/ۖ۠ᩴ;->REPLACE_EXISTING:Ll/ۖ۠ᩴ;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {p1, p2, v0}, Ll/ܿ۠ᩴ;->move(Ll/᩷۠ᩴ;Ll/᩷۠ᩴ;[Ll/᩺֨ᩴ;)Ll/᩷۠ᩴ;

    return-void
.end method

.method public final synthetic ֫(Ll/᩷۠ᩴ;[B)V
    .locals 0

    .line 0
    invoke-static {p1, p2}, Ll/ۛ۬ᩳ;->֫(Ll/᩷۠ᩴ;[B)V

    return-void
.end method

.method public final ۧ(Ll/᩷۠ᩴ;)V
    .locals 0

    .line 68
    invoke-static {p1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V

    return-void
.end method
