.class public final Ll/᩵۫ۚ;
.super Ll/ۜ۫ۚ;
.source "M7CA"


# instance fields
.field public ᩶:Ll/ܺۤۚ;


# direct methods
.method public constructor <init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;Ll/ܺۤۚ;)V
    .locals 0

    .line 37
    invoke-direct {p0, p1, p2}, Ll/ۜ۫ۚ;-><init>(Ll/ۗۛۚ;Ll/ۙ۬ۚ;)V

    .line 38
    invoke-virtual {p0, p3, p1}, Ll/ۜ۫ۚ;->֫(Ll/ܺۤۚ;Ll/ۗۛۚ;)Ll/ܺۤۚ;

    move-result-object p1

    iput-object p1, p0, Ll/᩵۫ۚ;->᩶:Ll/ܺۤۚ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 46
    invoke-super {p0, p1}, Ll/ۜ۫ۚ;->֫(Ll/֡۫ۚ;)V

    .line 47
    iget-object v0, p0, Ll/᩵۫ۚ;->᩶:Ll/ܺۤۚ;

    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final ܽ()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method
