.class public final Ll/۫۠֨;
.super Ll/۫᩸֨;
.source "X43L"


# instance fields
.field public final synthetic ᩸:Ll/ۛ᩸֨;


# direct methods
.method public constructor <init>(Ll/ۛ᩸֨;)V
    .locals 0

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 502
    iput-object p1, p0, Ll/۫۠֨;->᩸:Ll/ۛ᩸֨;

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 502
    check-cast p1, Ljava/lang/Void;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method

.method public final ֫(Ll/᩶ۚ֨;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 502
    check-cast p2, Ljava/lang/Void;

    .line 510
    iget-object p2, p1, Ll/ۙ֨֨;->᩹:Ll/᩶֡֨;

    iget-object p2, p2, Ll/ۛ֡֨;->ۤ:Ll/ۙ֨֨;

    invoke-virtual {p2}, Ll/ۙ֨֨;->ܶ()Ll/ۖܶ۠;

    move-result-object p2

    .line 511
    invoke-virtual {p1}, Ll/᩶ۚ֨;->ܶ()Ll/ۖܶ۠;

    move-result-object p1

    .line 512
    :goto_0
    invoke-virtual {p2}, Ll/ۖܶ۠;->ܽ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 513
    new-instance v0, Ll/᩶֨֨;

    iget-object v1, p0, Ll/۫۠֨;->᩸:Ll/ۛ᩸֨;

    iget-object v2, v1, Ll/ۛ᩸֨;->᩻֫:Ll/᩷ۚ֨;

    iget-object v3, v2, Ll/᩷ۚ֨;->᩸֫:Ll/ۙ֨֨;

    sget-object v4, Ll/ܺۘ֨;->ۗ:Ll/ܺۘ֨;

    iget-object v2, v2, Ll/᩷ۚ֨;->ۢ:Ll/ܳ֡֨;

    iget-object v5, p2, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v5, Ll/ۡ֨֨;

    invoke-direct {v0, v3, v4, v2, v5}, Ll/᩶֨֨;-><init>(Ll/ۙ֨֨;Ll/ܺۘ֨;Ll/᩶֡֨;Ll/ۡ֨֨;)V

    .line 517
    iget-object v2, p1, Ll/ۖܶ۠;->᩸:Ljava/lang/Object;

    check-cast v2, Ll/ۙ֨֨;

    invoke-virtual {v1, v2, v0}, Ll/ۛ᩸֨;->ۧ(Ll/ۙ֨֨;Ll/ۙ֨֨;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 518
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    .line 519
    :cond_0
    iget-object p2, p2, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    .line 520
    iget-object p1, p1, Ll/ۖܶ۠;->᩹:Ll/ۖܶ۠;

    goto :goto_0

    .line 522
    :cond_1
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1
.end method
