.class public final Ll/֨ۚۘ;
.super Ll/ܿۚۘ;
.source "54F8"


# instance fields
.field public ۢ:[B

.field public ᩷:S


# virtual methods
.method public final ֫(Ll/ۖۚۘ;)V
    .locals 2

    .line 108
    iget-object v0, p0, Ll/֨ۚۘ;->ۢ:[B

    if-eqz v0, :cond_1

    .line 124
    invoke-virtual {p0}, Ll/ܿۚۘ;->ᩳ()Ljava/util/Set;

    move-result-object v0

    .line 125
    sget-object v1, Ll/᩷ۚۘ;->ۤ:Ll/᩷ۚۘ;

    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x28

    goto :goto_0

    :cond_0
    const/16 v0, 0x18

    :goto_0
    iget-object v1, p0, Ll/֨ۚۘ;->ۢ:[B

    array-length v1, v1

    add-int/2addr v0, v1

    int-to-short v0, v0

    invoke-virtual {p0, v0}, Ll/ܿۚۘ;->֫(S)V

    .line 126
    invoke-super {p0, p1}, Ll/ܿۚۘ;->֫(Ll/ۖۚۘ;)V

    .line 108
    iget-object v0, p0, Ll/֨ۚۘ;->ۢ:[B

    .line 128
    array-length v1, v0

    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ۧ(I)V

    const/4 v1, 0x0

    .line 129
    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ܽ(I)V

    .line 101
    iget-short v1, p0, Ll/֨ۚۘ;->᩷:S

    .line 130
    invoke-virtual {p1, v1}, Ll/ۖۚۘ;->ܽ(I)V

    .line 131
    invoke-virtual {p1, v0}, Ll/ۖۚۘ;->֫([B)V

    return-void

    .line 122
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid stub: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    iget-object v1, p0, Ll/֨ۚۘ;->ۢ:[B

    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ֫([B)V
    .locals 0

    .line 116
    iput-object p1, p0, Ll/֨ۚۘ;->ۢ:[B

    return-void
.end method

.method public final ۧ(S)V
    .locals 0

    .line 112
    iput-short p1, p0, Ll/֨ۚۘ;->᩷:S

    return-void
.end method
