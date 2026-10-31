.class public final synthetic Ll/ۡۖᩴ;
.super Ljava/lang/Object;
.source "AC8P"


# direct methods
.method public static ֫(Ll/ܶܺᩴ;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    if-nez p1, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    .line 139
    invoke-interface {p0, v0, v1}, Ll/ܺۖᩴ;->ۧ(J)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-interface {p0, v0, v1}, Ll/ܺۖᩴ;->֫(J)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    :goto_1
    return-object p1
.end method
