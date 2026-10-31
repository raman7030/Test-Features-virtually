.class public Ll/۫ܳۖ;
.super Ll/۠ᩳۖ;
.source "0B0D"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 449
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 2

    .line 452
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۤ()Ll/ܳۜۖ;

    move-result-object v0

    .line 453
    sget-object v1, Ll/ܳۜۖ;->ۛ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_0

    .line 454
    invoke-virtual {p1}, Ll/ܿۜۖ;->ۗ()V

    const/4 p1, 0x0

    return-object p1

    .line 458
    :cond_0
    sget-object v1, Ll/ܳۜۖ;->ۙ:Ll/ܳۜۖ;

    if-ne v0, v1, :cond_1

    .line 459
    invoke-virtual {p1}, Ll/ܿۜۖ;->ܶ()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->toString(Z)Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 461
    :cond_1
    invoke-virtual {p1}, Ll/ܿۜۖ;->۬()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 0

    .line 449
    check-cast p2, Ljava/lang/String;

    .line 466
    invoke-virtual {p1, p2}, Ll/᩻ۜۖ;->ۧ(Ljava/lang/String;)V

    return-void
.end method
