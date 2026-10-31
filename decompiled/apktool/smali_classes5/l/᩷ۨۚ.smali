.class public final Ll/᩷ۨۚ;
.super Ljava/lang/Object;
.source "H7D7"

# interfaces
.implements Ll/֫ۨۚ;


# instance fields
.field public ۙ:Ll/ܺۤۚ;

.field public ᩶:Ll/ܺۤۚ;

.field public ᩸:I

.field public ᩹:Ll/ܺۤۚ;


# virtual methods
.method public final getLength()I
    .locals 1

    const/16 v0, 0x8

    return v0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 4

    .line 49
    iget-object v0, p0, Ll/᩷ۨۚ;->᩶:Ll/ܺۤۚ;

    iget-object v1, p0, Ll/᩷ۨۚ;->᩹:Ll/ܺۤۚ;

    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 50
    iget-object v1, p0, Ll/᩷ۨۚ;->ۙ:Ll/ܺۤۚ;

    invoke-virtual {v1}, Ll/ܺۤۚ;->֫()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    .line 51
    iget v1, v1, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v1}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_0

    .line 53
    :cond_0
    invoke-virtual {p1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 55
    :goto_0
    invoke-virtual {v0}, Ll/ܺۤۚ;->֫()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 56
    iget v0, v0, Ll/ۜۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    goto :goto_1

    .line 58
    :cond_1
    invoke-virtual {p1, v3}, Ll/ۛ۫ۚ;->ܽ(I)V

    .line 60
    :goto_1
    iget v0, p0, Ll/᩷ۨۚ;->᩸:I

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->ܽ(I)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
