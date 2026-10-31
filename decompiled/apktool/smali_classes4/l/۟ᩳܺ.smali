.class public final Ll/۟ᩳܺ;
.super Ll/ۧܿܺ;
.source "0BBO"

# interfaces
.implements Ll/ۤᩳܺ;


# virtual methods
.method public final ۧ()Ll/ۛܺܺ;
    .locals 2

    .line 47
    invoke-virtual {p0}, Ll/ۧܿܺ;->getAttributes()Ll/ܰᩳܺ;

    move-result-object v0

    const-string v1, "ConstantValue"

    .line 49
    invoke-virtual {v0, v1}, Ll/ܰᩳܺ;->ۧ(Ljava/lang/String;)Ll/۫ᩳܺ;

    move-result-object v0

    check-cast v0, Ll/᩶ۧܺ;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 55
    :cond_0
    invoke-virtual {v0}, Ll/᩶ۧܺ;->ۧ()Ll/ۛܺܺ;

    move-result-object v0

    return-object v0
.end method
