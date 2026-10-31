.class public final synthetic Ll/ܽۧۖ;
.super Ljava/lang/Object;
.source "17QI"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 2

    .line 2
    check-cast p1, Ll/ܿۧۖ;

    .line 2703
    invoke-virtual {p1}, Ll/ܿۧۖ;->ۧ()Ll/ᩳۧۖ;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2707
    invoke-virtual {p1}, Ll/ܿۧۖ;->֫()Ll/᩺ۢ֨;

    move-result-object p1

    invoke-static {p1}, Ll/ۗۧۖ;->֫(Ll/۬ܺ֨;)I

    move-result p1

    return p1

    .line 2709
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    .line 2705
    :cond_1
    invoke-virtual {p1}, Ll/ܿۧۖ;->ܿ()Ll/ܶ۟ܺ;

    move-result-object p1

    invoke-interface {p1}, Ll/ܶ۟ܺ;->getPosition()I

    move-result p1

    return p1
.end method
