.class public final Ll/ᩳܽ۠;
.super Ll/᩻ۗ֨;
.source "A451"


# instance fields
.field public final synthetic ܳ:Ll/᩹ܽ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܽ۠;Ll/ۙ֨֨;Ll/ۘ۬֨;)V
    .locals 1

    .line 1068
    iput-object p1, p0, Ll/ᩳܽ۠;->ܳ:Ll/᩹ܽ۠;

    .line 1069
    iget-object p1, p1, Ll/᩹ܽ۠;->᩻:Ll/ۢۗ֨;

    invoke-static {p1}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll/ܶᩴ֨;->ۡ:Ll/ܶᩴ֨;

    invoke-direct {p0, p1, v0, p2, p3}, Ll/᩻ۗ֨;-><init>(Ll/ۢۗ֨;Ll/ܶᩴ֨;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 4

    .line 1074
    sget-object v0, Ll/ۢ۠֨;->᩺:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1075
    check-cast p2, Ll/֨۫֨;

    .line 1076
    invoke-virtual {p2, p0}, Ll/֨۫֨;->֫(Ll/᩻ۗ֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1

    .line 1096
    :cond_0
    iget-object v0, p0, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    iget-object v1, p0, Ll/ᩳܽ۠;->ܳ:Ll/᩹ܽ۠;

    if-ne p2, v0, :cond_1

    goto :goto_0

    .line 1097
    :cond_1
    iget-object v0, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2}, Ll/ۛ᩸֨;->۫(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    :goto_0
    if-eqz p1, :cond_3

    .line 1079
    invoke-interface {p1}, Ll/ۗ۠۠;->۟()Ll/ۚۚ۠;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_1

    .line 1082
    :cond_2
    iget-object v0, p0, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    .line 1081
    invoke-interface {v0}, Ll/ۘ۬֨;->֫()Ll/֡ۨ֨;

    move-result-object v0

    .line 1082
    invoke-interface {p1}, Ll/ۗ۠۠;->۟()Ll/ۚۚ۠;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v0, v2, p2, v3}, Ll/֡ۨ֨;->֫(Ll/ۚۚ۠;Ll/ۙ֨֨;Z)Ll/ۙ֨֨;

    move-result-object p2

    goto :goto_2

    .line 1080
    :cond_3
    :goto_1
    iget-object v0, v1, Ll/᩹ܽ۠;->ܳ֫:Ll/ۛ᩸֨;

    invoke-virtual {v0, p2}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    .line 1083
    :goto_2
    iget-object v0, v1, Ll/᩹ܽ۠;->ܺ:Ll/ܶ۬֨;

    invoke-virtual {v0, p1, p2}, Ll/ܶ۬֨;->᩻(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p2

    invoke-super {p0, p1, p2}, Ll/᩻ۗ֨;->֫(Ll/ۗ۠۠;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۘ۬֨;)Ll/᩻ۗ֨;
    .locals 3

    .line 1107
    new-instance v0, Ll/ᩳܽ۠;

    iget-object v1, p0, Ll/ᩳܽ۠;->ܳ:Ll/᩹ܽ۠;

    iget-object v2, p0, Ll/᩻ۗ֨;->ᩳ:Ll/ۙ֨֨;

    invoke-direct {v0, v1, v2, p1}, Ll/ᩳܽ۠;-><init>(Ll/᩹ܽ۠;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    return-object v0
.end method

.method public final ֫(Ll/ۙ֨֨;)Ll/᩻ۗ֨;
    .locals 3

    .line 1102
    new-instance v0, Ll/ᩳܽ۠;

    iget-object v1, p0, Ll/ᩳܽ۠;->ܳ:Ll/᩹ܽ۠;

    iget-object v2, p0, Ll/᩻ۗ֨;->֫:Ll/ۘ۬֨;

    invoke-direct {v0, v1, p1, v2}, Ll/ᩳܽ۠;-><init>(Ll/᩹ܽ۠;Ll/ۙ֨֨;Ll/ۘ۬֨;)V

    return-object v0
.end method
