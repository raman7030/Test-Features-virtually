.class public final Ll/ܳۨۚ;
.super Ll/۫ۨۚ;
.source "R7DK"


# instance fields
.field public ۖ:Ll/᩵۫ۚ;

.field public ܺ:Ll/᩷ۛۚ;


# direct methods
.method public constructor <init>(Ll/ܰ۫ۚ;ILl/᩷ۛۚ;)V
    .locals 1

    .line 42
    iget-object v0, p1, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    invoke-virtual {p1}, Ll/۫ۨۚ;->ۧ()Ll/᩶ۗۚ;

    move-result-object p1

    check-cast p1, Ll/ۘۨۚ;

    invoke-direct {p0, v0, p1, p2}, Ll/۫ۨۚ;-><init>(Ll/ۗۛۚ;Ll/᩶ۗۚ;I)V

    .line 43
    sget-object p1, Ll/ۗ۬ۚ;->ۗ:Ll/ۗ۬ۚ;

    iput-object p1, p0, Ll/۫ۨۚ;->ᩳ:Ll/ۗ۬ۚ;

    .line 44
    iput-object p3, p0, Ll/ܳۨۚ;->ܺ:Ll/᩷ۛۚ;

    .line 45
    invoke-static {p2}, Ll/ۛ۬ۚ;->֫(I)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 46
    invoke-virtual {p0}, Ll/۫ۨۚ;->֫()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 6

    .line 77
    iget v0, p0, Ll/۫ۨۚ;->֫:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 78
    iget-object v0, p0, Ll/ܳۨۚ;->ܺ:Ll/᩷ۛۚ;

    iget-object v1, v0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v1, Ll/ۜۗۚ;

    iget-object v1, v1, Ll/ۜۗۚ;->᩸:Ljava/lang/Object;

    check-cast v1, Ll/ܺۤۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 79
    iget-object v0, v0, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    check-cast v0, Ll/ۜۗۚ;

    iget-object v0, v0, Ll/ۜۗۚ;->᩹:Ljava/lang/Object;

    check-cast v0, Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 73
    iget-object v0, p0, Ll/ܳۨۚ;->ۖ:Ll/᩵۫ۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩷:Ll/ۜ۫ۚ;

    iget-object v2, p0, Ll/۫ۨۚ;->ܿ:Ll/ۜ۫ۚ;

    iget-object v3, p0, Ll/۫ۨۚ;->ۜ:Ll/᩵۫ۚ;

    const/4 v4, 0x4

    new-array v4, v4, [Ll/ۜ۫ۚ;

    const/4 v5, 0x0

    aput-object v0, v4, v5

    const/4 v0, 0x1

    aput-object v1, v4, v0

    const/4 v0, 0x2

    aput-object v2, v4, v0

    const/4 v0, 0x3

    aput-object v3, v4, v0

    invoke-virtual {p0, v4}, Ll/۫ۨۚ;->֫([Ll/֫ۨۚ;)Ll/ۛۛۚ;

    move-result-object v0

    .line 81
    invoke-virtual {v0, p1}, Ll/ۛۛۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final ۧ(Ll/ܺۤۚ;)V
    .locals 3

    .line 64
    new-instance v0, Ll/᩵۫ۚ;

    iget-object v1, p0, Ll/۫ۨۚ;->᩻:Ll/ۗۛۚ;

    sget-object v2, Ll/ۙ۬ۚ;->ۛ:Ll/ۙ۬ۚ;

    invoke-direct {v0, v1, v2, p1}, Ll/᩵۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ll/ܺۤۚ;)V

    iput-object v0, p0, Ll/ܳۨۚ;->ۖ:Ll/᩵۫ۚ;

    return-void
.end method

.method public final ܽ()Ll/᩵۫ۚ;
    .locals 1

    .line 68
    iget-object v0, p0, Ll/ܳۨۚ;->ۖ:Ll/᩵۫ۚ;

    return-object v0
.end method

.method public final ᩳ()Ll/᩷ۛۚ;
    .locals 1

    .line 60
    iget-object v0, p0, Ll/ܳۨۚ;->ܺ:Ll/᩷ۛۚ;

    return-object v0
.end method
