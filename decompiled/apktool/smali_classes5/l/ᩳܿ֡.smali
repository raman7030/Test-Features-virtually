.class public Ll/ᩳܿ֡;
.super Ll/᩹ᩳ֡;
.source "64JA"


# instance fields
.field public ۧ:Ll/۬ᩳ֡;


# virtual methods
.method public final ֫(ILl/ۨᩳ֡;)Ljava/lang/Object;
    .locals 4

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    const-string v1, "<missing EOF>"

    goto :goto_0

    .line 67
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "<missing "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Ll/ܰᩴۚ;->۫֡:[Ljava/lang/String;

    aget-object v2, v2, p1

    const-string v3, ">"

    .line 0
    invoke-static {v1, v2, v3}, Ll/ۡᩳۢ;->֫(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 68
    :goto_0
    new-instance v2, Ll/ۗᩳ֡;

    invoke-direct {v2, p1, v1}, Ll/ۗᩳ֡;-><init>(ILjava/lang/String;)V

    .line 69
    check-cast p2, Ll/᩷ܿ֡;

    const/4 p1, 0x1

    invoke-interface {p2, p1}, Ll/᩷ܿ֡;->ܽ(I)Ll/ۜܿ֡;

    move-result-object p1

    .line 70
    invoke-interface {p1}, Ll/ۜܿ֡;->getType()I

    move-result v1

    if-ne v1, v0, :cond_1

    .line 71
    invoke-interface {p2, v0}, Ll/᩷ܿ֡;->ܽ(I)Ll/ۜܿ֡;

    move-result-object p1

    .line 73
    :cond_1
    invoke-interface {p1}, Ll/ۜܿ֡;->getLine()I

    move-result p2

    iput p2, v2, Ll/ۗᩳ֡;->ۗ:I

    .line 74
    invoke-interface {p1}, Ll/ۜܿ֡;->֫()I

    move-result p2

    iput p2, v2, Ll/ۗᩳ֡;->᩹:I

    const/4 p2, 0x0

    .line 75
    iput p2, v2, Ll/ۗᩳ֡;->᩸:I

    .line 76
    invoke-interface {p1}, Ll/ۜܿ֡;->getInputStream()Ll/ۙᩳ֡;

    move-result-object p1

    iput-object p1, v2, Ll/ۗᩳ֡;->ۙ:Ll/ۙᩳ֡;

    return-object v2
.end method

.method public final ֫(Ll/ۨᩳ֡;)Ljava/lang/Object;
    .locals 1

    .line 56
    check-cast p1, Ll/᩷ܿ֡;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ll/᩷ܿ֡;->ܽ(I)Ll/ۜܿ֡;

    move-result-object p1

    return-object p1
.end method
