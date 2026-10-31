.class public final Ll/᩸ۚۘ;
.super Ll/ܿۚۘ;
.source "O5QJ"


# instance fields
.field public ᩷:[B


# virtual methods
.method public final ֫(Ll/ܺۚۘ;)V
    .locals 2

    .line 100
    invoke-super {p0, p1}, Ll/ܿۚۘ;->֫(Ll/ܺۚۘ;)V

    .line 101
    invoke-virtual {p0}, Ll/ܿۚۘ;->ۧ()I

    move-result v0

    invoke-virtual {p0}, Ll/ܿۚۘ;->֫()I

    move-result v1

    sub-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x18

    new-array v0, v0, [B

    .line 83
    iput-object v0, p0, Ll/᩸ۚۘ;->᩷:[B

    const/16 v0, 0x8

    .line 102
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    .line 79
    iget-object v0, p0, Ll/᩸ۚۘ;->᩷:[B

    .line 103
    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫([B)V

    .line 104
    invoke-virtual {p0}, Ll/ܿۚۘ;->֫()I

    move-result v0

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    return-void
.end method

.method public final ܿ()[B
    .locals 1

    .line 79
    iget-object v0, p0, Ll/᩸ۚۘ;->᩷:[B

    return-object v0
.end method
