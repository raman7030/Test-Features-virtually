.class public final Ll/۟ܰۚ;
.super Ll/۫ۨۚ;
.source "S7FD"


# instance fields
.field public ۖ:Ll/ܳۨۚ;

.field public ܺ:Ll/ܰ۫ۚ;


# direct methods
.method public constructor <init>(Ll/ܰ۫ۚ;Ll/ܳۨۚ;)V
    .locals 3

    .line 90
    iget-object v0, p1, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-virtual {p1}, Ll/۫ۨۚ;->ۧ()Ll/᩶ۗۚ;

    move-result-object v1

    const/4 v2, 0x0

    .line 53
    invoke-direct {p0, v0, v1, v2}, Ll/۫ۨۚ;-><init>(Ll/ۗۛۚ;Ll/᩶ۗۚ;I)V

    .line 91
    sget-object v0, Ll/ۗ۬ۚ;->۫:Ll/ۗ۬ۚ;

    iput-object v0, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    .line 92
    iput-object p1, p0, Ll/۟ܰۚ;->ܺ:Ll/ܰ۫ۚ;

    .line 93
    iput-object p2, p0, Ll/۟ܰۚ;->ۖ:Ll/ܳۨۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 102
    iget-object v0, p0, Ll/۟ܰۚ;->ۖ:Ll/ܳۨۚ;

    invoke-virtual {v0}, Ll/ܳۨۚ;->ᩳ()Ll/᩷ۛۚ;

    move-result-object v1

    iget-object v1, v1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 103
    invoke-virtual {v0}, Ll/ܳۨۚ;->ᩳ()Ll/᩷ۛۚ;

    move-result-object v0

    iget-object v0, v0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    iget-object v0, v0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 104
    invoke-virtual {p0}, Ll/۟ܰۚ;->ܽ()Ll/ۛۛۚ;

    move-result-object v0

    .line 105
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final ܽ()Ll/ۛۛۚ;
    .locals 3

    .line 98
    iget-object v0, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    const/4 v1, 0x1

    new-array v1, v1, [Ll/ۜ۫ۚ;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Ll/۟ܰۚ;->ܺ:Ll/ܰ۫ۚ;

    invoke-virtual {v0, v1}, Ll/۫ۨۚ;->֫([Ll/֫ۨۚ;)Ll/ۛۛۚ;

    move-result-object v0

    return-object v0
.end method
