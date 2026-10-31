.class public Ll/۠۫֨;
.super Ll/᩷֨֨;
.source "W7SR"


# instance fields
.field public ᩸:Ll/ۜ۫֨;


# direct methods
.method public constructor <init>(Ll/۫۫֨;Ll/ܰ۬֨;Ll/ۛ֡֨;Ll/ܽܽ۠;)V
    .locals 9

    .line 4899
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1002
    new-instance v8, Ll/ۜ۫֨;

    iget-object v0, p1, Ll/۫۫֨;->ܺ:Ll/ۜۨ֨;

    iget-object v5, v0, Ll/ۜۨ֨;->ܿ:Ll/֡ۨ֨;

    iget-object v6, p1, Ll/۫۫֨;->᩷:Ll/۬۬֨;

    iget-object v0, p1, Ll/۫۫֨;->ۚ:Ll/ۛ᩸֨;

    iget-object v7, v0, Ll/ۛ᩸֨;->ܿ֫:Ll/֨᩸۠;

    move-object v0, v8

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v7}, Ll/ۜ۫֨;-><init>(Ll/۫۫֨;Ll/ܰ۬֨;Ll/ۛ֡֨;Ll/ܽܽ۠;Ll/֡ۨ֨;Ll/ۜ۫֨;Ll/֨᩸۠;)V

    iput-object v8, p0, Ll/۠۫֨;->᩸:Ll/ۜ۫֨;

    return-void
.end method


# virtual methods
.method public bridge synthetic ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ljava/lang/Object;
    .locals 0

    .line 998
    invoke-virtual {p0, p1, p2}, Ll/۠۫֨;->֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ljava/lang/Object;Ll/ۙ֨֨;)Ll/ۙ֨֨;
    .locals 1

    .line 1008
    sget-object v0, Ll/ۢ۠֨;->᩺:Ll/ۢ۠֨;

    invoke-virtual {p2, v0}, Ll/ۙ֨֨;->֫(Ll/ۢ۠֨;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    .line 1011
    :cond_0
    check-cast p2, Ll/֨۫֨;

    .line 1012
    invoke-virtual {p0, p2, p1}, Ll/۠۫֨;->֫(Ll/֨۫֨;Ljava/lang/Object;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method

.method public ֫(Ll/֨۫֨;Ljava/lang/Object;)Ll/ۙ֨֨;
    .locals 1

    .line 1017
    iget-object p2, p0, Ll/۠۫֨;->᩸:Ll/ۜ۫֨;

    iget-object v0, p2, Ll/ۜ۫֨;->ܽ:Ll/ܰ۬֨;

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 p2, 0x1

    if-ne v0, p2, :cond_1

    .line 1019
    iget-object p1, p1, Ll/֨۫֨;->۟:Ll/۫᩵۠;

    iget-object p1, p1, Ll/ۚۚ۠;->᩹:Ll/ۙ֨֨;

    if-nez p1, :cond_0

    sget-object p1, Ll/ۙ֨֨;->ۙ:Ll/ۨۚ֨;

    :cond_0
    return-object p1

    .line 1023
    :cond_1
    invoke-static {}, Ll/۫ۙ;->֫()V

    const/4 p1, 0x0

    throw p1

    .line 1021
    :cond_2
    iget-object v0, p2, Ll/ۜ۫֨;->ᩳ:Ll/ۛ֡֨;

    iget-object p2, p2, Ll/ۜ۫֨;->ܳ:Ll/ܽܽ۠;

    invoke-virtual {p1, v0, p2}, Ll/֨۫֨;->֫(Ll/ۛ֡֨;Ll/ܽܽ۠;)Ll/ۙ֨֨;

    move-result-object p1

    return-object p1
.end method
