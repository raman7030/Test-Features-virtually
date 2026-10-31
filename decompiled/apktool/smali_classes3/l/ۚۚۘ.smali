.class public final Ll/ۚۚۘ;
.super Ll/ܿۚۘ;
.source "D88X"


# instance fields
.field public ᩷:S


# virtual methods
.method public final ֫(Ll/ܺۚۘ;)V
    .locals 2

    .line 155
    invoke-super {p0, p1}, Ll/ܿۚۘ;->֫(Ll/ܺۚۘ;)V

    .line 157
    sget-object v0, Ll/֡ۚۘ;->֫:[I

    invoke-virtual {p0}, Ll/ܿۚۘ;->ܽ()Ll/ۜۚۘ;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 164
    invoke-virtual {p0}, Ll/ܿۚۘ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x10

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    return-void

    .line 167
    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid PDU type: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ll/ܿۚۘ;->ܽ()Ll/ۜۚۘ;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 159
    :cond_1
    invoke-virtual {p1}, Ll/ܺۚۘ;->ᩳ()S

    move-result v0

    iput-short v0, p0, Ll/ۚۚۘ;->᩷:S

    .line 160
    invoke-virtual {p1}, Ll/ܺۚۘ;->ᩳ()S

    .line 161
    invoke-virtual {p0}, Ll/ܿۚۘ;->ۧ()I

    move-result v0

    add-int/lit8 v0, v0, -0x14

    invoke-virtual {p1, v0}, Ll/ܺۚۘ;->֫(I)V

    return-void
.end method

.method public final ܿ()S
    .locals 1

    .line 119
    iget-short v0, p0, Ll/ۚۚۘ;->᩷:S

    return v0
.end method
