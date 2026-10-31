.class public final Ll/۫ۖܺ;
.super Ll/ܳۘܺ;
.source "RBFE"


# instance fields
.field public ᩶:Ll/ܺۡܺ;


# direct methods
.method public constructor <init>(Ll/ܺۡܺ;Ll/ܽۘܺ;)V
    .locals 1

    .line 42
    invoke-virtual {p1}, Ll/ܺۡܺ;->ܺ()Ll/᩸ۡܺ;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Ll/ܳۘܺ;-><init>(Ll/᩸ۡܺ;Ll/ܽۘܺ;)V

    .line 43
    iput-object p1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    return-void
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 111
    invoke-super {p0}, Ll/ܳۘܺ;->clone()Ll/ܳۘܺ;

    move-result-object v0

    check-cast v0, Ll/۫ۖܺ;

    return-object v0
.end method

.method public final clone()Ll/ܳۘܺ;
    .locals 1

    .line 111
    invoke-super {p0}, Ll/ܳۘܺ;->clone()Ll/ܳۘܺ;

    move-result-object v0

    check-cast v0, Ll/۫ۖܺ;

    return-object v0
.end method

.method public final ֡()Z
    .locals 2

    .line 208
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ֨()Z
    .locals 1

    .line 236
    invoke-virtual {p0}, Ll/۫ۖܺ;->ۚ()Z

    move-result v0

    return v0
.end method

.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 129
    invoke-virtual {p0}, Ll/۫ۖܺ;->۠()Ll/ܺۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܺۡܺ;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(ILl/᩸ۡܺ;)V
    .locals 5

    .line 68
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v1

    .line 70
    new-instance v2, Ll/᩶ۡܺ;

    .line 105
    invoke-direct {v2, v1}, Ll/ܿᩴܺ;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    if-ne v3, p1, :cond_0

    move-object v4, p2

    goto :goto_1

    .line 73
    :cond_0
    invoke-virtual {v0, v3}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v4

    :goto_1
    invoke-virtual {v2, v3, v4}, Ll/ܿᩴܺ;->֫(ILl/᩸ۡܺ;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 76
    :cond_1
    invoke-virtual {v2}, Ll/ᩴᩴܺ;->ܺ()V

    .line 78
    invoke-virtual {v0, p1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object p1

    .line 79
    invoke-virtual {p1}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v0

    invoke-virtual {p2}, Ll/᩸ۡܺ;->ᩴ()I

    move-result v1

    if-eq v0, v1, :cond_2

    .line 84
    invoke-virtual {p0}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ܽۘܺ;->ܿ()Ll/᩷ۘܺ;

    move-result-object v0

    invoke-virtual {v0, p0, p1, p2}, Ll/᩷ۘܺ;->֫(Ll/ܳۘܺ;Ll/᩸ۡܺ;Ll/᩸ۡܺ;)V

    .line 87
    :cond_2
    iget-object p1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {p0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object p2

    invoke-virtual {p1, p2, v2}, Ll/ܺۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    return-void
.end method

.method public final ֫(Ll/ܿۘܺ;)V
    .locals 1

    .line 224
    invoke-virtual {p0}, Ll/۫ۖܺ;->ۚ()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 225
    invoke-interface {p1, p0}, Ll/ܿۘܺ;->֫(Ll/۫ۖܺ;)V

    return-void

    .line 227
    :cond_0
    invoke-interface {p1, p0}, Ll/ܿۘܺ;->ۧ(Ll/۫ۖܺ;)V

    return-void
.end method

.method public final ֫(Ll/᩶ۡܺ;)V
    .locals 2

    .line 97
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ll/ܿᩴܺ;->size()I

    move-result v0

    invoke-virtual {p1}, Ll/ܿᩴܺ;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    .line 103
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {p0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ll/ܺۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    return-void

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string v0, "Sources counts don\'t match"

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۘ()Ll/᩶ۡܺ;
    .locals 1

    .line 121
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۚ()Z
    .locals 2

    .line 200
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ۜ()Ll/ۗۡܺ;
    .locals 1

    .line 145
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۠()Ll/ܺۡܺ;
    .locals 3

    .line 137
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {p0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v1

    iget-object v2, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v2}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ll/ܺۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;

    move-result-object v0

    return-object v0
.end method

.method public final ۧ(Ll/ۗۘۢ;)V
    .locals 3

    .line 51
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v0

    .line 52
    invoke-virtual {p1, v0}, Ll/ۗۘۢ;->֫(Ll/᩶ۡܺ;)Ll/᩶ۡܺ;

    move-result-object p1

    if-eq p1, v0, :cond_0

    .line 55
    iget-object v1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {p0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v2

    invoke-virtual {v1, v2, p1}, Ll/ܺۡܺ;->֫(Ll/᩸ۡܺ;Ll/᩶ۡܺ;)Ll/ܺۡܺ;

    move-result-object p1

    iput-object p1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    .line 56
    invoke-virtual {p0}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object p1

    invoke-virtual {p1}, Ll/ܽۘܺ;->ܿ()Ll/᩷ۘܺ;

    move-result-object p1

    invoke-virtual {p1, p0, v0}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    :cond_0
    return-void
.end method

.method public final ܳ()Ll/᩸ۡܺ;
    .locals 2

    .line 163
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/16 v1, 0x36

    if-ne v0, v1, :cond_0

    .line 164
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ll/ܿᩴܺ;->get(I)Ll/᩸ۡܺ;

    move-result-object v0

    goto :goto_0

    .line 166
    :cond_0
    invoke-virtual {p0}, Ll/ܳۘܺ;->ۖ()Ll/᩸ۡܺ;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_1

    goto :goto_1

    .line 173
    :cond_1
    invoke-virtual {v0}, Ll/᩸ۡܺ;->᩻()Ll/ᩴۡܺ;

    move-result-object v1

    if-nez v1, :cond_2

    :goto_1
    const/4 v0, 0x0

    :cond_2
    return-object v0
.end method

.method public final ܶ()V
    .locals 2

    .line 189
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۖ()Ll/᩶ۡܺ;

    move-result-object v0

    .line 191
    iget-object v1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v1}, Ll/ܺۡܺ;->ۘ()Ll/ܺۡܺ;

    move-result-object v1

    iput-object v1, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    .line 192
    invoke-virtual {p0}, Ll/ܳۘܺ;->ᩳ()Ll/ܽۘܺ;

    move-result-object v1

    invoke-virtual {v1}, Ll/ܽۘܺ;->ܿ()Ll/᩷ۘܺ;

    move-result-object v1

    invoke-virtual {v1, p0, v0}, Ll/᩷ۘܺ;->֫(Ll/۫ۖܺ;Ll/᩶ۡܺ;)V

    return-void
.end method

.method public final ܺ()Ll/ܺۡܺ;
    .locals 1

    .line 153
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    return-object v0
.end method

.method public final ܽ()Z
    .locals 1

    .line 216
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->ۧ()Z

    move-result v0

    return v0
.end method

.method public final ᩵()Z
    .locals 4

    .line 145
    iget-object v0, p0, Ll/۫ۖܺ;->᩶:Ll/ܺۡܺ;

    invoke-virtual {v0}, Ll/ܺۡܺ;->᩻()Ll/ۗۡܺ;

    move-result-object v0

    .line 248
    invoke-virtual {v0}, Ll/ۗۡܺ;->ۧ()I

    move-result v1

    const/4 v2, 0x1

    if-eq v1, v2, :cond_0

    goto :goto_1

    .line 253
    :cond_0
    invoke-static {}, Ll/ۛۖܺ;->ۧ()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Ll/۫ۖܺ;->ܳ()Ll/᩸ۡܺ;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    .line 255
    :goto_0
    invoke-virtual {v0}, Ll/ۗۡܺ;->ᩳ()I

    move-result v0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x5

    if-eq v0, v3, :cond_2

    const/16 v3, 0x37

    if-eq v0, v3, :cond_2

    :goto_1
    return v2

    :cond_2
    return v1
.end method
