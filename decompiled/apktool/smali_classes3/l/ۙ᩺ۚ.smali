.class public final Ll/ۙ᩺ۚ;
.super Ljava/lang/Object;
.source "A7EF"

# interfaces
.implements Ll/۫ۛۚ;


# instance fields
.field public ᩸:Ll/ܽ۫ۚ;


# virtual methods
.method public final getLength()I
    .locals 1

    .line 812
    iget-object v0, p0, Ll/ۙ᩺ۚ;->᩸:Ll/ܽ۫ۚ;

    invoke-virtual {v0}, Ll/ܽ۫ۚ;->getLength()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final ֫(Ll/ۗۛۚ;)Ll/֫ۨۚ;
    .locals 1

    .line 817
    iget-object v0, p0, Ll/ۙ᩺ۚ;->᩸:Ll/ܽ۫ۚ;

    invoke-static {v0, p1}, Ll/۬ۛۚ;->֫(Ll/֫ۨۚ;Ll/ۗۛۚ;)Ll/֫ۨۚ;

    move-result-object p1

    check-cast p1, Ll/ܽ۫ۚ;

    iput-object p1, p0, Ll/ۙ᩺ۚ;->᩸:Ll/ܽ۫ۚ;

    return-object p0
.end method

.method public final ֫(Ll/֡۫ۚ;)V
    .locals 1

    .line 806
    sget-object v0, Ll/۟۫ۚ;->ۙ:Ll/۟۫ۚ;

    invoke-virtual {v0}, Ll/۟۫ۚ;->ۧ()C

    move-result v0

    check-cast p1, Ll/ۛ۫ۚ;

    invoke-virtual {p1, v0}, Ll/ۛ۫ۚ;->֫(I)V

    .line 807
    iget-object v0, p0, Ll/ۙ᩺ۚ;->᩸:Ll/ܽ۫ۚ;

    invoke-virtual {v0, p1}, Ll/ܽ۫ۚ;->֫(Ll/֡۫ۚ;)V

    return-void
.end method

.method public final synthetic ۧ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
