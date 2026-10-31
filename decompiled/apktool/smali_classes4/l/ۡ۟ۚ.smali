.class public final Ll/ۡ۟ۚ;
.super Ll/ۜ۫ۚ;
.source "F7CM"


# instance fields
.field public ۙ:Ll/ܺۤۚ;

.field public ᩶:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ll/ۗۛۚ;Ljava/lang/String;)V
    .locals 1

    .line 48
    sget-object v0, Ll/ۙ۬ۚ;->᩸֫:Ll/ۙ۬ۚ;

    invoke-direct {p0, p1, v0}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    const/4 p1, 0x0

    .line 39
    iput-object p1, p0, Ll/ۡ۟ۚ;->ۙ:Ll/ܺۤۚ;

    .line 49
    iput-object p2, p0, Ll/ۡ۟ۚ;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 84
    iget-object v0, p0, Ll/ۡ۟ۚ;->ۙ:Ll/ܺۤۚ;

    if-eqz v0, :cond_0

    .line 85
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 86
    iget-object v0, p0, Ll/ۡ۟ۚ;->ۙ:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    :cond_0
    return-void
.end method

.method public final ֫(Ll/ۗۛۚ;Ljava/util/function/Function;)V
    .locals 1

    .line 70
    invoke-virtual {p1, p2}, Ll/ۗۛۚ;->֫(Ljava/util/function/Function;)Ll/ܺۤۚ;

    move-result-object p2

    iput-object p2, p0, Ll/ۡ۟ۚ;->ۙ:Ll/ܺۤۚ;

    .line 71
    iget-object v0, p0, Ll/ۡ۟ۚ;->᩶:Ljava/lang/String;

    if-eqz p2, :cond_0

    .line 72
    iget-object p1, p2, Ll/ܺۤۚ;->ۙ:Ll/ۖۤۚ;

    iput-object v0, p1, Ll/ۖۤۚ;->ۧ:Ljava/lang/Object;

    return-void

    .line 74
    :cond_0
    invoke-virtual {p1, v0}, Ll/ۗۛۚ;->֫(Ljava/lang/String;)Ll/ܺۤۚ;

    move-result-object p1

    iput-object p1, p0, Ll/ۡ۟ۚ;->ۙ:Ll/ܺۤۚ;

    return-void
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
