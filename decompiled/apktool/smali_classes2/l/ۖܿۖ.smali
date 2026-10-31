.class public final Ll/ۖܿۖ;
.super Ljava/lang/Object;
.source "U87V"


# direct methods
.method public static ֫(Ljava/lang/Class;)Ll/ۢᩳۖ;
    .locals 2

    .line 2
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 66
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/ۡᩳۖ;

    .line 67
    invoke-interface {v0}, Ll/ۡᩳۖ;->check()Ll/ۢᩳۖ;

    move-result-object v0

    .line 68
    sget-object v1, Ll/ۢᩳۖ;->ۗ:Ll/ۢᩳۖ;

    if-eq v0, v1, :cond_0

    return-object v0

    .line 72
    :cond_1
    sget-object p0, Ll/ۢᩳۖ;->᩹:Ll/ۢᩳۖ;

    return-object p0
.end method

.method public static ֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z
    .locals 1

    .line 77
    sget-object v0, Ll/ܺܿۖ;->֫:Ll/ܺܿۖ;

    invoke-virtual {v0, p0, p1}, Ll/ܺܿۖ;->֫(Ljava/lang/Object;Ljava/lang/reflect/AccessibleObject;)Z

    move-result p0

    return p0
.end method
