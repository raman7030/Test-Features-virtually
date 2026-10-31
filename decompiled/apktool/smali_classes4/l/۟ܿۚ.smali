.class public final Ll/۟ܿۚ;
.super Ll/ۨܿۚ;
.source "Y2SQ"

# interfaces
.implements Ll/ۗ֫ۚ;
.implements Ll/֨֫ۚ;


# instance fields
.field public final synthetic ۗ:Ll/֫ܳۚ;

.field public ۙ:Ll/۟ۢۚ;

.field public ۬:Ll/᩻ۡۚ;

.field public ᩶:Ll/۟ۢۚ;


# direct methods
.method public constructor <init>(Ll/֫ܳۚ;Ll/ۗ֫ۚ;)V
    .locals 0

    .line 113
    iput-object p1, p0, Ll/۟ܿۚ;->ۗ:Ll/֫ܳۚ;

    .line 114
    invoke-direct {p0, p1, p2}, Ll/ۨܿۚ;-><init>(Ll/֫ܳۚ;Ll/۠֫ۚ;)V

    return-void
.end method


# virtual methods
.method public final ֫()I
    .locals 1

    .line 119
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v0, Ll/ۗ֫ۚ;

    invoke-interface {v0}, Ll/ۗ֫ۚ;->֫()I

    move-result v0

    return v0
.end method

.method public final ֫(Ll/᩵ۡۚ;)V
    .locals 2

    .line 154
    invoke-virtual {p0}, Ll/۟ܿۚ;->ۡ()Ll/᩸ܽۚ;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 156
    invoke-interface {v0}, Ll/᩸ܽۚ;->getType()Ljava/lang/String;

    move-result-object v0

    .line 280
    iget-object v1, p1, Ll/᩸ۜۚ;->᩻֫:Ll/ܳۡۚ;

    invoke-virtual {v1, v0}, Ll/ܳۡۚ;->֫(Ljava/lang/String;)Ll/᩻ۡۚ;

    move-result-object v0

    .line 156
    iput-object v0, p0, Ll/۟ܿۚ;->۬:Ll/᩻ۡۚ;

    .line 158
    :cond_0
    invoke-virtual {p0}, Ll/۟ܿۚ;->᩻()Ll/ܶܽۚ;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 160
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object v0

    iput-object v0, p0, Ll/۟ܿۚ;->᩶:Ll/۟ۢۚ;

    .line 162
    :cond_1
    invoke-virtual {p0}, Ll/۟ܿۚ;->ᩴ()Ll/ܶܽۚ;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 164
    invoke-interface {v0}, Ll/ܶܽۚ;->getString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ll/᩵ۡۚ;->ۧ(Ljava/lang/String;)Ll/۟ۢۚ;

    move-result-object p1

    iput-object p1, p0, Ll/۟ܿۚ;->ۙ:Ll/۟ۢۚ;

    :cond_2
    return-void
.end method

.method public final ۡ()Ll/᩸ܽۚ;
    .locals 3

    .line 133
    iget-object v0, p0, Ll/۟ܿۚ;->۬:Ll/᩻ۡۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 136
    :cond_0
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v0, Ll/ۗ֫ۚ;

    invoke-interface {v0}, Ll/ۗ֫ۚ;->ۡ()Ll/᩸ܽۚ;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return-object v0

    .line 141
    :cond_1
    iget-object v1, p0, Ll/۟ܿۚ;->ۗ:Ll/֫ܳۚ;

    iget-object v1, v1, Ll/֫ܳۚ;->֫:Ll/ܽܳۚ;

    invoke-virtual {v1}, Ll/ܽܳۚ;->֡()Ll/ᩳ᩻ۚ;

    move-result-object v1

    .line 151
    new-instance v2, Ll/ᩴ᩻ۚ;

    invoke-direct {v2, v1, v0}, Ll/ᩴ᩻ۚ;-><init>(Ll/ᩳ᩻ۚ;Ll/᩸ܽۚ;)V

    return-object v2
.end method

.method public final ᩴ()Ll/ܶܽۚ;
    .locals 1

    .line 147
    iget-object v0, p0, Ll/۟ܿۚ;->ۙ:Ll/۟ۢۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 149
    :cond_0
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v0, Ll/ۗ֫ۚ;

    invoke-interface {v0}, Ll/ۗ֫ۚ;->ᩴ()Ll/ܶܽۚ;

    move-result-object v0

    return-object v0
.end method

.method public final ᩻()Ll/ܶܽۚ;
    .locals 1

    .line 125
    iget-object v0, p0, Ll/۟ܿۚ;->᩶:Ll/۟ۢۚ;

    if-eqz v0, :cond_0

    return-object v0

    .line 127
    :cond_0
    iget-object v0, p0, Ll/ۨܿۚ;->᩸:Ll/۠֫ۚ;

    check-cast v0, Ll/ۗ֫ۚ;

    invoke-interface {v0}, Ll/ۗ֫ۚ;->᩻()Ll/ܶܽۚ;

    move-result-object v0

    return-object v0
.end method
