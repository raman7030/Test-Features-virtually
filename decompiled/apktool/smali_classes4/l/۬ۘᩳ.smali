.class public final Ll/۬ۘᩳ;
.super Ljava/lang/Object;
.source "06TX"

# interfaces
.implements Ll/۫ۘᩳ;


# virtual methods
.method public final ֫(Ll/᩷۠ᩴ;)V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll/ܳ۠ᩴ;

    .line 215
    sget-object v1, Ll/ܳ۠ᩴ;->NOFOLLOW_LINKS:Ll/ܳ۠ᩴ;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {p1, v0}, Ll/ܿ۠ᩴ;->exists(Ll/᩷۠ᩴ;[Ll/ܳ۠ᩴ;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ll/ۤۘᩳ;->֫(Ll/᩷۠ᩴ;)V

    invoke-static {p1}, Ll/ܿ۠ᩴ;->delete(Ll/᩷۠ᩴ;)V

    :cond_0
    return-void
.end method
