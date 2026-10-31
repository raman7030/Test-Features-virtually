.class public final Ll/ۜᩳۚ;
.super Ll/᩶᩵ۚ;
.source "2623"


# virtual methods
.method public final ֫(Ljava/lang/Object;)Z
    .locals 0

    .line 48
    check-cast p1, Ll/ۢ֫ۚ;

    .line 51
    instance-of p1, p1, Ll/᩷ᩳۚ;

    return p1
.end method

.method public final ۧ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 48
    check-cast p1, Ll/ۢ֫ۚ;

    .line 78
    instance-of v0, p1, Ll/᩷ᩳۚ;

    if-eqz v0, :cond_0

    .line 79
    check-cast p1, Ll/᩷ᩳۚ;

    return-object p1

    .line 81
    :cond_0
    new-instance v0, Ll/᩷ᩳۚ;

    .line 82
    invoke-interface {p1}, Ll/ۢ֫ۚ;->getName()Ljava/lang/String;

    move-result-object v1

    .line 83
    invoke-interface {p1}, Ll/ۢ֫ۚ;->getValue()Ll/ۤܽۚ;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ll/᩷ᩳۚ;-><init>(Ljava/lang/String;Ll/ۤܽۚ;)V

    return-object v0
.end method
