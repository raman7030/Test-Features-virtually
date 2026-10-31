.class public final Ll/ۨۙۡ;
.super Ll/ۢܳۚ;
.source "51V0"


# instance fields
.field public final synthetic ۧ:Ll/ۢۗۡ;


# direct methods
.method public constructor <init>(Ll/ۢۗۡ;Ll/ܽܳۚ;)V
    .locals 0

    .line 151
    iput-object p1, p0, Ll/ۨۙۡ;->ۧ:Ll/ۢۗۡ;

    invoke-direct {p0, p2}, Ll/ۢܳۚ;-><init>(Ll/ܽܳۚ;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic ֫(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 151
    check-cast p1, Ll/ۤܽۚ;

    invoke-virtual {p0, p1}, Ll/ۨۙۡ;->֫(Ll/ۤܽۚ;)Ll/ۤܽۚ;

    move-result-object p1

    return-object p1
.end method

.method public final ֫(Ll/ۤܽۚ;)Ll/ۤܽۚ;
    .locals 4

    .line 155
    invoke-interface {p1}, Ll/ۤܽۚ;->ۖ()I

    move-result v0

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    .line 156
    move-object v0, p1

    check-cast v0, Ll/᩹ܽۚ;

    .line 157
    iget-object v1, p0, Ll/ۨۙۡ;->ۧ:Ll/ۢۗۡ;

    invoke-static {v1}, Ll/ۢۗۡ;->ۧ(Ll/ۢۗۡ;)Ll/ۘۗۡ;

    move-result-object v2

    invoke-interface {v0}, Ll/᩹ܽۚ;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ll/ۘۗۡ;->֫(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 158
    new-instance p1, Ll/֫ۗۡ;

    iget-object v2, p0, Ll/ۢܳۚ;->֫:Ll/ܽܳۚ;

    invoke-direct {p1, v1, v2, v0}, Ll/֫ۗۡ;-><init>(Ll/ۢۗۡ;Ll/ܽܳۚ;Ll/᩹ܽۚ;)V

    return-object p1

    .line 160
    :cond_0
    invoke-super {p0, p1}, Ll/ۢܳۚ;->֫(Ll/ۤܽۚ;)Ll/ۤܽۚ;

    move-result-object p1

    return-object p1
.end method
