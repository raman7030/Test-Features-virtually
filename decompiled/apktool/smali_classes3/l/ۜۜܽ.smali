.class public final Ll/ۜۜܽ;
.super Ll/ۛᩳܽ;
.source "Y545"


# instance fields
.field public final ۗ:I


# direct methods
.method public constructor <init>(Ll/ۨ᩻ܽ;II)V
    .locals 0

    .line 22
    invoke-direct {p0, p1}, Ll/ۛᩳܽ;-><init>(Ll/᩷ᩳܽ;)V

    const/4 p1, 0x0

    .line 23
    iput p1, p0, Ll/ۜۜܽ;->ۗ:I

    const/4 p1, -0x1

    .line 24
    iput p1, p0, Ll/ۛᩳܽ;->᩶:I

    .line 25
    iput p2, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 26
    iput p3, p0, Ll/ۛᩳܽ;->᩹:I

    return-void
.end method

.method public constructor <init>(Ll/ۨ᩻ܽ;IILl/ۛۜܽ;)V
    .locals 0

    .line 10
    invoke-direct {p0, p1}, Ll/ۛᩳܽ;-><init>(Ll/᩷ᩳܽ;)V

    .line 11
    iput p2, p0, Ll/ۜۜܽ;->ۗ:I

    .line 12
    iput p3, p0, Ll/ۛᩳܽ;->᩶:I

    const/4 p1, 0x2

    .line 14
    invoke-virtual {p4, p1}, Ll/ۛۜܽ;->ᩳ(I)V

    .line 16
    invoke-virtual {p4}, Ll/ۛۜܽ;->ܽ()B

    .line 17
    invoke-virtual {p4}, Ll/ۛۜܽ;->ܽ()B

    move-result p1

    iput p1, p0, Ll/ۛᩳܽ;->ۙ:I

    .line 18
    invoke-virtual {p4}, Ll/ۛۜܽ;->ᩳ()I

    move-result p1

    iput p1, p0, Ll/ۛᩳܽ;->᩹:I

    return-void
.end method


# virtual methods
.method public final getEntry()Ll/᩷᩻ܽ;
    .locals 1

    .line 51
    invoke-super {p0}, Ll/ۛᩳܽ;->getEntry()Ll/᩷᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ۨ᩻ܽ;

    return-object v0
.end method

.method public final ֫()Ll/ۢ᩻ܽ;
    .locals 1

    .line 31
    invoke-super {p0}, Ll/ۛᩳܽ;->֫()Ll/ۢ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/᩺᩻ܽ;

    return-object v0
.end method

.method public final ۧ()Ll/ۘ᩻ܽ;
    .locals 1

    .line 36
    invoke-super {p0}, Ll/ۛᩳܽ;->ۧ()Ll/ۘ᩻ܽ;

    move-result-object v0

    check-cast v0, Ll/ᩳۜܽ;

    return-object v0
.end method

.method public final ᩷֫()I
    .locals 1

    .line 56
    iget v0, p0, Ll/ۜۜܽ;->ۗ:I

    return v0
.end method
