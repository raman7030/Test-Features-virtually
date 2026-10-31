.class public final Ll/ᩴ۠֡;
.super Ljava/lang/Object;
.source "C4VL"


# direct methods
.method public static ֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V
    .locals 5

    .line 48
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/᩷֫ۚ;

    const/16 v2, 0xa

    if-nez v0, :cond_0

    .line 50
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(I)V

    .line 60
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0xc

    const-string v3, ".annotation "

    const/4 v4, 0x0

    .line 116
    invoke-virtual {p0, v3, v4, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 61
    invoke-interface {v1}, Ll/᩷֫ۚ;->getVisibility()I

    move-result v0

    invoke-static {v0}, Ll/ۖۗ֡;->֫(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const/16 v0, 0x20

    .line 62
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 63
    invoke-interface {v1}, Ll/᩷֫ۚ;->getType()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0, v2}, Ll/ۗ᩵ۚ;->write(I)V

    .line 66
    invoke-interface {v1}, Ll/᩷֫ۚ;->getElements()Ljava/util/Set;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۛ۠֡;->֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V

    const-string v0, ".end annotation\n"

    const/16 v1, 0x10

    .line 116
    invoke-virtual {p0, v0, v4, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    return-void
.end method
