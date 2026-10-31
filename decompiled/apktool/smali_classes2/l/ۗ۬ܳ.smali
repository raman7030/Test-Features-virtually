.class public final Ll/ۗ۬ܳ;
.super Ljava/lang/Object;
.source "X10D"


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 14
    invoke-static {}, Ll/ۜ᩷ܿ;->ܿ()Ll/᩸᩷ܿ;

    return-void
.end method

.method public static ֫(Ll/ᩳۜܳ;)Ll/᩶ۖܳ;
    .locals 2

    .line 22
    invoke-interface {p0}, Ll/ᩳۜܳ;->isDirectory()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p0}, Ll/ᩳۜܳ;->᩵֫()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 25
    :cond_0
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۡۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 26
    check-cast p0, Ll/ᩴۘܳ;

    invoke-virtual {p0}, Ll/ᩴۘܳ;->ܽ()Ll/᩶ۖܳ;

    move-result-object p0

    return-object p0

    .line 28
    :cond_1
    invoke-interface {p0}, Ll/ᩳۜܳ;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, "payload.bin"

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 30
    sget-object p0, Ll/᩶ۖܳ;->᩵:Ll/᩶ۖܳ;

    return-object p0

    .line 32
    :cond_2
    invoke-interface {p0}, Ll/ᩳۜܳ;->ۤۧ()Ll/ۖ֨ܿ;

    move-result-object p0

    invoke-virtual {p0}, Ll/ۖ֨ܿ;->ܿ()Ll/᩶ۖܳ;

    move-result-object p0

    return-object p0

    .line 24
    :cond_3
    :goto_0
    sget-object p0, Ll/᩶ۖܳ;->֨:Ll/᩶ۖܳ;

    return-object p0
.end method
