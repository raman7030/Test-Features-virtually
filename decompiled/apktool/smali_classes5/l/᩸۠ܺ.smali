.class public abstract Ll/᩸۠ܺ;
.super Ll/ۨ۠ܺ;
.source "532I"


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 947
    check-cast p1, Ljava/lang/Character;

    .line 918
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p0, p1}, Ll/ۨ۠ܺ;->֫(C)Z

    move-result p1

    return p1
.end method

.method public ֫()Ll/ۨ۠ܺ;
    .locals 1

    .line 956
    new-instance v0, Ll/۫۠ܺ;

    .line 979
    invoke-direct {v0, p0}, Ll/۬۠ܺ;-><init>(Ll/ۨ۠ܺ;)V

    return-object v0
.end method
