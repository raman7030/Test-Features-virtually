.class public abstract Ll/ۛ۠֡;
.super Ljava/lang/Object;
.source "A5T6"


# direct methods
.method public static ֫(Ll/ۗ᩵ۚ;Ljava/util/Set;)V
    .locals 4

    .line 57
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->ܽ()V

    .line 58
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۢ֫ۚ;

    .line 59
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;)V

    const/4 v1, 0x0

    const/4 v2, 0x3

    const-string v3, " = "

    .line 116
    invoke-virtual {p0, v3, v1, v2}, Ll/ۗ᩵ۚ;->write(Ljava/lang/String;II)V

    .line 61
    invoke-interface {v0}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object v0

    invoke-static {p0, v0}, Ll/ۨ۠֡;->֫(Ll/ۗ᩵ۚ;Ll/ۤܽۚ;)V

    const/16 v0, 0xa

    .line 62
    invoke-virtual {p0, v0}, Ll/ۗ᩵ۚ;->write(I)V

    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {p0}, Ll/ۗ᩵ۚ;->֫()V

    return-void
.end method
