.class public final enum Ll/᩺ۛ֨;
.super Ll/ۧۨ֨;
.source "M43N"


# direct methods
.method public constructor <init>(Ljava/lang/String;ILl/᩵֨֨;)V
    .locals 1

    const/4 v0, 0x0

    .line 1453
    invoke-direct {p0, p1, p2, p3, v0}, Ll/ۧۨ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩵֨֨;)V
    .locals 2

    const-string v0, "THROWS"

    const/4 v1, 0x2

    .line 0
    invoke-direct {p0, v0, v1, p1}, Ll/᩺ۛ֨;-><init>(Ljava/lang/String;ILl/᩵֨֨;)V

    return-void
.end method

.method public static synthetic ֫(Ll/֡ۨ֨;Ll/ۙ֨֨;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩺ۛ֨;->ۧ(Ll/֡ۨ֨;Ll/ۙ֨֨;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ֫(Ll/ۛ᩸֨;Ll/᩷ۚ֨;Ll/ۙ֨֨;)Z
    .locals 0

    .line 0
    invoke-static {p0, p1, p2}, Ll/᩺ۛ֨;->ۧ(Ll/ۛ᩸֨;Ll/᩷ۚ֨;Ll/ۙ֨֨;)Z

    move-result p0

    return p0
.end method

.method public static ۧ(Ll/֡ۨ֨;Ll/ۙ֨֨;)Z
    .locals 0

    .line 165
    iget-object p0, p0, Ll/֡ۨ֨;->ᩳ:Ll/ۖܶ۠;

    invoke-virtual {p1, p0}, Ll/ۙ֨֨;->ۧ(Ll/ۖܶ۠;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static ۧ(Ll/ۛ᩸֨;Ll/᩷ۚ֨;Ll/ۙ֨֨;)Z
    .locals 1

    .line 1464
    iget-object p1, p1, Ll/᩷ۚ֨;->֫ۧ:Ll/ۙ֨֨;

    const/4 v0, 0x1

    .line 1071
    invoke-virtual {p0, p1, p2, v0}, Ll/ۛ᩸֨;->ܽ(Ll/ۙ֨֨;Ll/ۙ֨֨;Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public ֫(Ll/֨֨֨;Ll/֡ۨ֨;)Z
    .locals 5

    .line 1456
    invoke-virtual {p1}, Ll/֨֨֨;->ۛ֫()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 1460
    :cond_0
    iget-object v0, p2, Ll/֡ۨ֨;->ܿ:Ll/ۛ᩸֨;

    .line 1461
    iget-object v2, p2, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    iget-object v2, v2, Ll/ۜۨ֨;->ۖ:Ll/᩷ۚ֨;

    const/4 v3, 0x1

    new-array v3, v3, [Ll/᩵֨֨;

    .line 1462
    sget-object v4, Ll/᩵֨֨;->ۙ:Ll/᩵֨֨;

    aput-object v4, v3, v1

    invoke-virtual {p1, v3}, Ll/֨֨֨;->֫([Ll/᩵֨֨;)Ll/ۖܶ۠;

    move-result-object p1

    invoke-static {p1}, Ll/ۚ۬ᩴ;->stream(Ljava/util/Collection;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance v1, Ll/ۛۛ֨;

    invoke-direct {v1, p2}, Ll/ۛۛ֨;-><init>(Ll/֡ۨ֨;)V

    .line 1463
    invoke-interface {p1, v1}, Ll/ܿ᩺ᩴ;->filter(Ljava/util/function/Predicate;)Ll/ܿ᩺ᩴ;

    move-result-object p1

    new-instance p2, Ll/ۨۛ֨;

    invoke-direct {p2, v0, v2}, Ll/ۨۛ֨;-><init>(Ll/ۛ᩸֨;Ll/᩷ۚ֨;)V

    .line 1464
    invoke-interface {p1, p2}, Ll/ܿ᩺ᩴ;->allMatch(Ljava/util/function/Predicate;)Z

    move-result p1

    return p1
.end method

.method public ܽ(Ll/֨֨֨;Ll/֡ۨ֨;)Ll/ۙ֨֨;
    .locals 0

    .line 1469
    iget-object p1, p2, Ll/֡ۨ֨;->ܽ:Ll/ۜۨ֨;

    iget-object p1, p1, Ll/ۜۨ֨;->ۖ:Ll/᩷ۚ֨;

    iget-object p1, p1, Ll/᩷ۚ֨;->֫ۧ:Ll/ۙ֨֨;

    return-object p1
.end method
