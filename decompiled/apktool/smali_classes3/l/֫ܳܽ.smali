.class public final Ll/֫ܳܽ;
.super Ll/᩵ܳܽ;
.source "11FE"


# virtual methods
.method public final ֫(Ll/֨᩻ܽ;)Ljava/lang/String;
    .locals 2

    .line 11
    invoke-interface {p1}, Ll/֨᩻ܽ;->ۖ()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    .line 30
    invoke-static {p1}, Ll/ۢܳܽ;->֫(Ll/֨᩻ܽ;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "bool"

    return-object p1
.end method
