.class public final synthetic Ll/֨ܳᩴ;
.super Ljava/lang/Object;
.source "SLZ"


# direct methods
.method public static ֫(Ll/ۖܿᩴ;Ljava/lang/Integer;Ljava/lang/Float;)Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 122
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 123
    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->֫(I)Z

    move-result v0

    .line 124
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p0, p2, p1}, Ll/۠ܳᩴ;->֫(FI)F

    move-result p0

    if-eqz v0, :cond_0

    .line 125
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static ֫(Ll/ۖܿᩴ;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 139
    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->get(I)F

    move-result v0

    invoke-interface {p0}, Ll/۠ܳᩴ;->ܽ()F

    move-result v1

    cmpl-float v1, v0, v1

    if-nez v1, :cond_2

    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->֫(I)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method

.method public static ۧ(Ll/ۖܿᩴ;Ljava/lang/Object;)Ljava/lang/Float;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 165
    :cond_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    .line 166
    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->֫(I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0, p1}, Ll/۠ܳᩴ;->remove(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
