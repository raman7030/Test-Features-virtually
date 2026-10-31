.class public final Ll/ᩳۨۚ;
.super Ljava/lang/Object;
.source "U7DO"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ۙ:Ll/ۢۤۚ;

.field public ᩶:J

.field public ᩸:Ll/ܺۤۚ;

.field public ᩹:I


# virtual methods
.method public final getLength()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 2

    .line 61
    iget-object v0, p0, Ll/ᩳۨۚ;->ۙ:Ll/ۢۤۚ;

    iget v1, v0, Ll/ۢۤۚ;->۫:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 62
    iget v0, v0, Ll/ۢۤۚ;->ۗ:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 63
    iget v0, p0, Ll/ᩳۨۚ;->᩹:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 64
    iget-object v0, p0, Ll/ᩳۨۚ;->᩸:Ll/ܺۤۚ;

    invoke-virtual {v0}, Ll/ܺۤۚ;->֫()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 65
    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    .line 67
    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
